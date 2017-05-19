package medrex.client.admin.ambulation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.admin.AmbulationWeight;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelAmbulationWeightDialog extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1886887249328646894L;
	private JFormattedTextField txtWeight;
	private JxComboBox cmbAmbulationType;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private List<AmbulationWeight> list;

	public PanelAmbulationWeightDialog(List<AmbulationWeight> list) {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(340, 180));
		setSize(340, 180);
		this.list = list;

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 340, 180);
		add(panel);

		final JLabel addupdateAmbulationWeightLabel = new JLabel();
		addupdateAmbulationWeightLabel
				.setFont(new Font("Tahoma", Font.BOLD, 14));
		addupdateAmbulationWeightLabel
				.setHorizontalAlignment(SwingConstants.CENTER);
		addupdateAmbulationWeightLabel.setText("ADD/UPDATE AMBULATION WEIGHT");
		addupdateAmbulationWeightLabel.setForeground(DEF_COL);
		addupdateAmbulationWeightLabel.setBounds(0, 0, 340, 21);
		panel.add(addupdateAmbulationWeightLabel);

		final JLabel selectAmbulatonTypeLabel = new JLabel();
		selectAmbulatonTypeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		selectAmbulatonTypeLabel.setText("Select Ambulaton Type:");
		selectAmbulatonTypeLabel.setForeground(DEF_COL);
		selectAmbulatonTypeLabel.setBounds(10, 37, 152, 21);
		panel.add(selectAmbulatonTypeLabel);

		cmbAmbulationType = new JxComboBox();
		cmbAmbulationType.setBackground(Color.WHITE);
		cmbAmbulationType.setForeground(DEF_COL);
		cmbAmbulationType.setArc(0.4f);
		cmbAmbulationType.setBorder(new LineBorder(DEF_COL, 1, false));
		cmbAmbulationType.setModel(new DefaultComboBoxModel(
				Global.ambulationType));
		cmbAmbulationType.setBackground(Color.WHITE);
		cmbAmbulationType.setBounds(168, 38, 127, 21);
		panel.add(cmbAmbulationType);

		final JLabel weightLabel = new JLabel();
		weightLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		weightLabel.setText("Weight:");
		weightLabel.setForeground(DEF_COL);
		weightLabel.setBounds(10, 75, 54, 21);
		panel.add(weightLabel);

		txtWeight = new JFormattedTextField(FieldFormatter.FLOAT3Dizit);
		txtWeight.setBounds(168, 75, 79, 21);
		panel.add(txtWeight);

		final JxButton saveButton = new JxButton(0.4f);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				close();
			}
		});
		saveButton.setArc(0.4f);
		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COL);
		saveButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(66, 116, 75, 32);
		panel.add(saveButton);

		final JxButton cancelButton = new JxButton(0.4f);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COL);
		cancelButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(159, 116, 75, 32);
		panel.add(cancelButton);

		doUpdateCombo();
		doUpdate();
	}

	private void doUpdateCombo() {
		for (AmbulationWeight amb : list) {
			cmbAmbulationType.removeItem(amb.getAmbulationType());
		}
	}

	public void doUpdate() {
		AmbulationWeight ambWeight = null;
		int seiral = Global.currentAmbulationWeightKey;
		if (seiral != 0) {
			try {
				ambWeight = MedrexClientManager.getInstance()
						.getAmbulationWeight(seiral);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (Global.currentAmbulationWeightKey != 0) {
				cmbAmbulationType.addItem(ambWeight.getAmbulationType());
			}
			cmbAmbulationType.setSelectedItem(ambWeight.getAmbulationType());
			txtWeight.setValue(ambWeight.getWeight() + "");
		} else {
			cmbAmbulationType.setSelectedItem("");
			txtWeight.setText("");
		}
	}

	public void doSave() {
		AmbulationWeight ambWeight = new AmbulationWeight();

		String ambType = cmbAmbulationType.getSelectedItem() + "";
		String strWeight = txtWeight.getText();
		double numWeight = 0;
		if (!"".equalsIgnoreCase(strWeight)) {
			numWeight = Double.parseDouble(strWeight);
		}
		ambWeight.setSerial(Global.currentAmbulationWeightKey);
		ambWeight.setAmbulationType(ambType);
		ambWeight.setWeight(numWeight);
		try {
			MedrexClientManager.getInstance().insertOrUpdateAmbulationWeight(
					ambWeight);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getTitle() {
		return "Add/Update Ambulation Weight";
	}

}
