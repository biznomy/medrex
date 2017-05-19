package medrex.client.MedicationAndTreatment.RoutineMedication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.admin.Medication;
import medrex.server.dao.admin.medication.TreatmentDao;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelMedicationList extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6584708988260112538L;
	private JRadioButton descriptionRadioButton;
	private JRadioButton codeRadioButton;
	private ButtonGroup buttonGroup;
	private JTextField txtFilter;
	private JxComboBox cmbDiagnosis;
	private Medication medication;

	public Medication getMedication() {
		return medication;
	}

	public void setMedication(Medication medication) {
		this.medication = medication;
	}

	private static final Color DEF_COLOR = new Color(49, 107, 127);

	public PanelMedicationList() {
		super();
		setBackground(Color.WHITE);
		setForeground(SystemColor.desktop);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		setLayout(null);
		setSize(new Dimension(586, 120));
		cmbDiagnosis = new JxComboBox();
		cmbDiagnosis.setArc(0.4f);
		cmbDiagnosis.setBorder(new CompoundBorder(new LineBorder(new Color(180,
				188, 193), 1, false), new EmptyBorder(3, 3, 3, 3)));
		cmbDiagnosis.setForeground(DEF_COLOR);
		cmbDiagnosis.setBackground(Color.WHITE);
		cmbDiagnosis.setBounds(59, 65, 411, 25);
		add(cmbDiagnosis);

		final JLabel filterByLabel = new JLabel();
		filterByLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		filterByLabel.setForeground(DEF_COLOR);
		filterByLabel.setText("Filter by");
		filterByLabel.setBounds(10, 24, 57, 25);
		add(filterByLabel);

		buttonGroup = new ButtonGroup();
		codeRadioButton = new JRadioButton();
		codeRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				txtFilter.setText("");
				fillCombos();
			}
		});
		codeRadioButton.setSelected(true);
		buttonGroup.add(codeRadioButton);
		codeRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		codeRadioButton.setForeground(DEF_COLOR);
		codeRadioButton.setBackground(Color.WHITE);
		codeRadioButton.setText("Code");
		codeRadioButton.setActionCommand("1");
		codeRadioButton.setBounds(73, 27, 89, 18);
		add(codeRadioButton);

		descriptionRadioButton = new JRadioButton();
		descriptionRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				txtFilter.setText("");
				fillCombos();
			}
		});
		buttonGroup.add(descriptionRadioButton);
		descriptionRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		descriptionRadioButton.setForeground(DEF_COLOR);
		descriptionRadioButton.setBackground(Color.WHITE);
		descriptionRadioButton.setText("Name");
		descriptionRadioButton.setActionCommand("2");
		descriptionRadioButton.setBounds(168, 27, 89, 18);
		add(descriptionRadioButton);

		txtFilter = new JTextField();
		txtFilter.setForeground(Color.BLACK);
		txtFilter.setBounds(277, 25, 193, 21);
		txtFilter.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {
				if (buttonGroup.getSelection().getActionCommand()
						.equalsIgnoreCase("1")) {
					String text = txtFilter.getText();
					boolean isLong;
					try {
						Long.valueOf(text);
						isLong = true;
					} catch (NumberFormatException nfe) {
						isLong = false;
					}
					if (isLong) {
						doSearch();
					}
				}
				if ((buttonGroup.getSelection().getActionCommand()
						.equalsIgnoreCase("1"))
						&& txtFilter.getText().equalsIgnoreCase("")) {
					fillCombos();
				}

				if (buttonGroup.getSelection().getActionCommand()
						.equalsIgnoreCase("2")) {
					doSearch();
				}
			}
		});
		add(txtFilter);
		fillCombos();

		final JxButton okButton = new JxButton();
		okButton.setArc(0.4f);
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cmbDiagnosis.getSelectedItem() != null) {
					String selectedMedication = cmbDiagnosis.getSelectedItem()
							.toString();

					List<Medication> medicationList = null;
					try {
						medicationList = MedrexClientManager.getInstance()
								.getMedication();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					Iterator<Medication> itr = medicationList.iterator();
					while (itr.hasNext()) {
						Medication medObj = itr.next();
						if (selectedMedication.equalsIgnoreCase(medObj.getNdc()
								+ " " + medObj.getName())) {
							setMedication(medObj);
						}
					}
					close();
				} else {
					JOptionPane.showMessageDialog(null,
							"Please Select A Medication");
				}

			}
		});
		okButton.setForeground(Color.BLACK);
		okButton.setBackground(Color.WHITE);
		okButton.setText("OK");
		okButton.setBounds(499, 64, 77, 26);
		add(okButton);

		final JxButton closeButton = new JxButton();
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				close();
			}
		});
		closeButton.setBackground(Color.WHITE);
		closeButton.setText("X");
		closeButton.setArc(0.2f);
		closeButton.setBounds(550, 10, 26, 18);
		add(closeButton);
	}

	private void fillCombos() {
		List<String> ndcList = new ArrayList<String>();
		List<String> medicationNameList = new ArrayList<String>();
		List<Medication> medicationList = new ArrayList<Medication>();
		try {
			medicationList = TreatmentDao.getInstance().getMedication();
		} catch (Exception e) {
			// e.printStackTrace();
		}

		System.out.println("fdsfdsfdsf");
		Iterator<Medication> itr = medicationList.iterator();
		while (itr.hasNext()) {
			Medication mediObj = itr.next();
			ndcList.add(mediObj.getNdc() + "");
			medicationNameList.add(mediObj.getNdc() + " " + mediObj.getName());

		}
		cmbDiagnosis.setModel(new DefaultComboBoxModel(medicationNameList
				.toArray()));
	}

	protected void doSearch() {
		List<String> strList = new ArrayList<String>();
		List<Medication> mediList = new ArrayList<Medication>();
		String selectedButton = buttonGroup.getSelection().getActionCommand();
		try {
			if (txtFilter != null) {
				mediList = MedrexClientManager.getInstance().getMedication(
						txtFilter.getText(), selectedButton);
			} else {
				mediList = MedrexClientManager.getInstance().getMedication(
						selectedButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator<Medication> itr = mediList.iterator();
		while (itr.hasNext()) {
			Medication medName = itr.next();
			strList.add(medName.getNdc() + " " + medName.getName());
		}
		cmbDiagnosis.setModel(new DefaultComboBoxModel(strList.toArray()));
	}

	public static void main(String args[]) {
		PanelMedicationList li = new PanelMedicationList();
		li.setSize(650, 105);
		SwingUtils.openInDialog(li).setVisible(true);
	}

	@Override
	public String getTitle() {
		return null;
	}
}
