package medrex.client.main.resident.ADL;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.main.resident.payerInfo.ControllerResidentInfoPayerMain;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.PresentationModel;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.scheduling.scheduling;

import com.sX.swing.JxButton;

public class PanelResidentSchudlingAdd extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3013308078596084746L;
	private JxButton btnDelete;
	private JLabel lblType;
	public Map myMap;
	private PresentationModel presentationModel;
	private ControllerResidentSchedulingAdd residentSchedulingAddController = new ControllerResidentSchedulingAdd();
	private PanelResidentSchudlingAdd residentInfoPayerController;
	private ControllerResidentInfoPayerMain residentInfoPayerMainController;
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	private List<String> arrInfo = new ArrayList<String>();
	String title = "";
	private JFormattedTextField txtMon;
	private JFormattedTextField txtTue;
	private JFormattedTextField txtWed;
	private JFormattedTextField txtThru;
	private JFormattedTextField txtFri;
	private JFormattedTextField txtSat;
	private JFormattedTextField txtSun;
	private JxButton saveButton;
	private JxButton cancelButton;
	private JxButton deleteButton;

	/**
	 * Create the panel
	 */

	public PanelResidentSchudlingAdd(
			final ControllerResidentSchedulingAdd conAdd, final String title) {
		super();
		setPreferredSize(new Dimension(350, 180));
		setSize(new Dimension(362, 180));
		setLayout(new BorderLayout());
		this.title = title;

		final JPanel panel_6 = new JPanel();
		panel_6.setFont(new Font("", Font.BOLD, 14));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		add(panel_6);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 10, 305, 30);
		panel_6.add(panel_1);

		lblType = new JLabel();
		lblType.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setForeground(DEF_COLOR);
		lblType.setBounds(10, 5, 285, 14);
		lblType.setText(title);
		panel_1.add(lblType);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(12, 45, 37, 25);
		panel_6.add(panel_2);

		final JLabel mLabel = new JLabel();
		mLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		mLabel.setForeground(DEF_COLOR);
		// mLabel.setBackground(Color.WHITE);
		mLabel.setText("Mon");
		mLabel.setBounds(4, 5, 32, 20);
		panel_2.add(mLabel);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(59, 46, 37, 25);
		panel_6.add(panel_2_1);

		final JLabel mLabel_1 = new JLabel();
		mLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		mLabel_1.setForeground(DEF_COLOR);
		mLabel_1.setText("Tus");
		mLabel_1.setBounds(3, 5, 32, 20);
		panel_2_1.add(mLabel_1);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(102, 46, 37, 25);
		panel_6.add(panel_2_1_1);

		final JLabel mLabel_1_1 = new JLabel();
		mLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		mLabel_1_1.setForeground(DEF_COLOR);
		mLabel_1_1.setText("Wed");
		mLabel_1_1.setBounds(2, 5, 32, 20);
		panel_2_1_1.add(mLabel_1_1);

		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(145, 46, 37, 25);
		panel_6.add(panel_2_1_1_1);

		final JLabel mLabel_1_1_1 = new JLabel();
		mLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		mLabel_1_1_1.setText("Thr");
		mLabel_1_1_1.setForeground(DEF_COLOR);
		mLabel_1_1_1.setBounds(1, 3, 32, 20);
		panel_2_1_1_1.add(mLabel_1_1_1);

		final JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBounds(188, 46, 37, 25);
		panel_6.add(panel_2_1_1_1_1);

		final JLabel mLabel_1_1_1_1 = new JLabel();
		mLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		mLabel_1_1_1_1.setForeground(DEF_COLOR);
		mLabel_1_1_1_1.setText("Fri");
		mLabel_1_1_1_1.setBounds(2, 3, 32, 20);
		panel_2_1_1_1_1.add(mLabel_1_1_1_1);

		final JPanel panel_2_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1.setBounds(231, 46, 37, 25);
		panel_6.add(panel_2_1_1_1_1_1);

		final JLabel mLabel_1_1_1_1_1 = new JLabel();
		mLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		mLabel_1_1_1_1_1.setForeground(DEF_COLOR);
		mLabel_1_1_1_1_1.setText("Sat");
		mLabel_1_1_1_1_1.setBounds(6, 3, 32, 20);
		panel_2_1_1_1_1_1.add(mLabel_1_1_1_1_1);

		final JPanel panel_2_1_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1_1.setBounds(274, 46, 37, 25);
		panel_6.add(panel_2_1_1_1_1_1_1);

		final JLabel mLabel_1_1_1_1_1_1 = new JLabel();
		mLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		mLabel_1_1_1_1_1_1.setForeground(DEF_COLOR);
		mLabel_1_1_1_1_1_1.setText("Sun");
		mLabel_1_1_1_1_1_1.setBounds(3, 5, 32, 20);
		panel_2_1_1_1_1_1_1.add(mLabel_1_1_1_1_1_1);

		saveButton = new JxButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				// conAdd.deleteCobmoField(title);
				close();
			}
		});

		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COLOR);
		saveButton
				.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setArc(0.4f);

		saveButton.setText("Save");
		saveButton.setBounds(45, 109, 75, 21);
		panel_6.add(saveButton);

		cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COLOR);
		cancelButton.setBorder(new LineBorder(new Color(180, 188, 193), 1,
				false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(133, 110, 75, 21);
		cancelButton.setArc(0.4f);
		panel_6.add(cancelButton);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 76, 39, 22);
		panel_6.add(panel_3);

		txtMon = new JFormattedTextField(FieldFormatter.MAX2);
		txtMon.setBounds(0, 0, 39, 21);
		txtMon.setBorder(new LineBorder(DEF_COLOR, 1, false));
		panel_3.add(txtMon);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(57, 77, 39, 21);
		panel_6.add(panel_3_1);

		txtTue = new JFormattedTextField(FieldFormatter.MAX2);
		txtTue.setBounds(0, 0, 39, 19);
		txtTue.setBorder(new LineBorder(DEF_COLOR, 1, false));
		panel_3_1.add(txtTue);

		final JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(100, 76, 39, 21);
		panel_6.add(panel_3_2);

		txtWed = new JFormattedTextField(FieldFormatter.MAX2);
		txtWed.setBounds(0, 0, 39, 21);
		txtWed.setBorder(new LineBorder(DEF_COLOR, 1, false));
		panel_3_2.add(txtWed);

		final JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(Color.WHITE);
		panel_3_3.setLayout(null);
		panel_3_3.setBounds(145, 77, 39, 21);
		panel_6.add(panel_3_3);

		txtThru = new JFormattedTextField(FieldFormatter.MAX2);
		txtThru.setBounds(0, 0, 39, 21);
		txtThru.setBorder(new LineBorder(DEF_COLOR, 1, false));
		panel_3_3.add(txtThru);

		final JPanel panel_3_4 = new JPanel();
		panel_3_4.setBackground(Color.WHITE);
		panel_3_4.setLayout(null);
		panel_3_4.setBounds(188, 77, 39, 21);
		panel_6.add(panel_3_4);

		txtFri = new JFormattedTextField(FieldFormatter.MAX2);
		txtFri.setBounds(0, 0, 39, 21);
		txtFri.setBorder(new LineBorder(DEF_COLOR, 1, false));
		panel_3_4.add(txtFri);

		final JPanel panel_3_5 = new JPanel();
		panel_3_5.setBackground(Color.WHITE);
		panel_3_5.setLayout(null);
		panel_3_5.setBounds(231, 77, 39, 21);
		panel_6.add(panel_3_5);

		txtSat = new JFormattedTextField(FieldFormatter.MAX2);
		txtSat.setBounds(0, 0, 39, 21);
		txtSat.setBorder(new LineBorder(DEF_COLOR, 1, false));
		panel_3_5.add(txtSat);

		final JPanel panel_3_6 = new JPanel();
		panel_3_6.setBackground(Color.WHITE);
		panel_3_6.setLayout(null);
		panel_3_6.setBounds(272, 77, 39, 21);
		panel_6.add(panel_3_6);

		txtSun = new JFormattedTextField(FieldFormatter.MAX2);
		txtSun.setBounds(0, 0, 39, 21);
		txtSun.setBorder(new LineBorder(DEF_COLOR, 1, false));
		panel_3_6.add(txtSun);

		btnDelete = new JxButton();
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				try {
					conAdd.delete(title);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MedrexException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				close();
			}
		});
		btnDelete.setText("Delete");
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(DEF_COLOR);
		btnDelete.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setText("Delete");
		btnDelete.setBounds(217, 110, 75, 21);
		btnDelete.setArc(0.4f);
		panel_6.add(btnDelete);

		doLoad(conAdd);

	}

	private void doLoad(ControllerResidentSchedulingAdd conAdd) {
		if (conAdd.getCurrentSerial() != 0) {
			scheduling sh = new scheduling();
			try {
				sh = conAdd.getSchedulingObject();
				residentSchedulingAddController
						.setCurrentSerial(sh.getSerial());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MedrexException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lblType.setText(sh.getProcedureType());

			txtMon.setValue(sh.getMonproced() + "");
			txtTue.setValue(sh.getTusproced() + "");
			txtWed.setValue(sh.getWedproced() + "");
			txtThru.setValue(sh.getThruproced() + "");
			txtFri.setValue(sh.getFriproced() + "");
			txtSat.setValue(sh.getSatproced() + "");
			txtSun.setValue(sh.getSunproced() + "");
			btnDelete.setEnabled(true);
		} else {
			btnDelete.setEnabled(false);
		}
	}

	public PanelResidentSchudlingAdd(
			ControllerResidentSchedulingAdd controllerResidentSchedulingAdd) {
		// TODO Auto-generated constructor stub
	}

	protected void doSave() {
		scheduling sch = new scheduling();
		sch.setSerial(residentSchedulingAddController.getCurrentSerial());
		sch.setResidentId(Global.currentResidenceKey);
		if (!("".equalsIgnoreCase(txtMon.getText()))) {
			sch.setMonproced(Integer.parseInt(txtMon.getText()));
		}
		if (!("".equalsIgnoreCase(txtTue.getText()))) {
			sch.setTusproced(Integer.parseInt(txtTue.getText()));
		}

		if (!("".equalsIgnoreCase(txtWed.getText()))) {
			sch.setWedproced(Integer.parseInt(txtWed.getText()));
		}

		if (!("".equalsIgnoreCase(txtThru.getText()))) {
			sch.setThruproced(Integer.parseInt(txtThru.getText()));
		}

		if (!("".equalsIgnoreCase(txtFri.getText()))) {
			sch.setFriproced(Integer.parseInt(txtFri.getText()));
		}
		if (!("".equalsIgnoreCase(txtSat.getText()))) {
			sch.setSatproced(Integer.parseInt(txtSat.getText()));
		}

		if (!("".equalsIgnoreCase(txtSun.getText()))) {
			sch.setSunproced(Integer.parseInt(txtSun.getText()));
		}
		sch.setProcedureType(lblType.getText());

		residentSchedulingAddController.insertOrUpdateScheduling(sch);
	}

	@Override
	public String getTitle() {
		return this.title;
	}

}
