package medrex.client.main.dietary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.dietary.EnteralFeeding;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelEnteralFeeding extends JPanel implements Form {

	private JTextArea txtSummary;
	private JLabel dateLabel_9;
	private JTextField txtRecentLabs;
	private JTextField txtPreviousWeight;
	private JLabel dateLabel_8;
	private JTextField txtCurrentWeight;
	private JLabel dateLabel_7;
	private JTextField txtAdmissionWeight;
	private JTextField txtMedication;
	private JTextField txtFormula;
	private JTextField txtResidentName;
	private JLabel dateLabel_6;
	private JLabel dateLabel_5;
	private JLabel dateLabel_4;
	private JLabel dateLabel_3;
	private JLabel dateLabel_2;
	private JTextField txtPhysicianName;
	private JLabel dateLabel_1;
	private JDateChooser dcDateField1;
	private JLabel dateLabel;
	private JLabel sectionAaIdentificationLabel;

	private JPanel panel_1;

	private JLabel minimumDataSetLabel;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelEnteralFeeding() {
		super();
		Global.panelEnteralFeeding = this;
		setPreferredSize(new Dimension(800, 1200));
		setBackground(Color.WHITE);
		setLayout(null);

		minimumDataSetLabel = new JLabel();
		minimumDataSetLabel.setFont(new Font("Arial", Font.BOLD, 26));
		minimumDataSetLabel.setText("ENTERAL FEEDING PROGRESS NOTES -");
		minimumDataSetLabel.setBounds(150, 86, 538, 33);
		add(minimumDataSetLabel);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 145, 790, 736);
		add(panel_1);

		dateLabel = new JLabel();
		dateLabel.setText("DATE:");
		dateLabel.setBounds(10, 10, 40, 14);
		panel_1.add(dateLabel);

		dcDateField1 = new JDateChooser();
		dcDateField1.setDateFormatString("MM/dd/yyyy");
		dcDateField1.setBounds(49, 10, 130, 20);
		panel_1.add(dcDateField1);

		dateLabel_1 = new JLabel();
		dateLabel_1.setText("PHYSICIAN:");
		dateLabel_1.setBounds(358, 10, 62, 14);
		panel_1.add(dateLabel_1);

		txtPhysicianName = new JTextField();
		txtPhysicianName.setBounds(426, 10, 335, 20);
		panel_1.add(txtPhysicianName);

		dateLabel_2 = new JLabel();
		dateLabel_2.setText("RESIDENT NAME:");
		dateLabel_2.setBounds(10, 50, 90, 14);
		panel_1.add(dateLabel_2);

		dateLabel_3 = new JLabel();
		dateLabel_3.setText("FORMULA / RATE:");
		dateLabel_3.setBounds(10, 100, 90, 14);
		panel_1.add(dateLabel_3);

		dateLabel_4 = new JLabel();
		dateLabel_4.setText("MEDICATIONS:");
		dateLabel_4.setBounds(10, 150, 74, 14);
		panel_1.add(dateLabel_4);

		dateLabel_5 = new JLabel();
		dateLabel_5.setText("ADMISSION WEIGHT:");
		dateLabel_5.setBounds(10, 200, 104, 14);
		panel_1.add(dateLabel_5);

		dateLabel_6 = new JLabel();
		dateLabel_6.setText("RECENT LABS:");
		dateLabel_6.setBounds(10, 250, 74, 14);
		panel_1.add(dateLabel_6);

		txtResidentName = new JTextField();
		txtResidentName.setBackground(Color.WHITE);
		txtResidentName.setEditable(false);
		txtResidentName.setBounds(104, 50, 657, 20);
		panel_1.add(txtResidentName);

		txtFormula = new JTextField();
		txtFormula.setBounds(104, 100, 655, 20);
		panel_1.add(txtFormula);

		txtMedication = new JTextField();
		txtMedication.setBounds(104, 150, 657, 20);
		panel_1.add(txtMedication);

		txtAdmissionWeight = new JTextField();
		txtAdmissionWeight.setBounds(117, 200, 130, 20);
		panel_1.add(txtAdmissionWeight);

		dateLabel_7 = new JLabel();
		dateLabel_7.setText("CURRENT WEIGHT:");
		dateLabel_7.setBounds(265, 200, 94, 14);
		panel_1.add(dateLabel_7);

		txtCurrentWeight = new JTextField();
		txtCurrentWeight.setBounds(365, 200, 130, 20);
		panel_1.add(txtCurrentWeight);

		dateLabel_8 = new JLabel();
		dateLabel_8.setText("PREVIOUS WEIGHT:");
		dateLabel_8.setBounds(513, 200, 104, 14);
		panel_1.add(dateLabel_8);

		txtPreviousWeight = new JTextField();
		txtPreviousWeight.setBounds(622, 200, 139, 20);
		panel_1.add(txtPreviousWeight);

		txtRecentLabs = new JTextField();
		txtRecentLabs.setBounds(104, 250, 657, 20);
		panel_1.add(txtRecentLabs);

		dateLabel_9 = new JLabel();
		dateLabel_9.setFont(new Font("", Font.BOLD, 12));
		dateLabel_9.setText("SUMMARY :");
		dateLabel_9.setBounds(10, 300, 65, 14);
		panel_1.add(dateLabel_9);

		txtSummary = new JTextArea();
		txtSummary.setBorder(new LineBorder(Color.black, 1, false));
		txtSummary.setLineWrap(true);
		txtSummary.setWrapStyleWord(true);
		txtSummary.setBounds(104, 299, 657, 181);
		panel_1.add(txtSummary);

		sectionAaIdentificationLabel = new JLabel();
		sectionAaIdentificationLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		sectionAaIdentificationLabel
				.setText("Plaza Healthcare & Rehabilitation Center");
		sectionAaIdentificationLabel.setBounds(229, 64, 398, 16);
		add(sectionAaIdentificationLabel);
		updateData();

	}

	public int doSave() {

		EnteralFeeding refEnteralFeeding = new EnteralFeeding();
		refEnteralFeeding.setResidentId(Global.currentResidenceKey);

		refEnteralFeeding.setSerial(Global.currentEnteralFeedingKey);
		refEnteralFeeding.setFormId(Global.currentDietaryCommunicationFormKey);

		refEnteralFeeding.setSummary(txtSummary.getText());
		refEnteralFeeding.setRecentLabs(txtRecentLabs.getText());
		refEnteralFeeding.setPreviousWeight(txtPreviousWeight.getText());
		refEnteralFeeding.setCurrentWeight(txtCurrentWeight.getText());
		refEnteralFeeding.setAdmissionWeight(txtAdmissionWeight.getText());
		refEnteralFeeding.setMedication(txtMedication.getText());
		refEnteralFeeding.setFormula(txtFormula.getText());
		refEnteralFeeding.setResidentName(txtResidentName.getText());
		refEnteralFeeding.setPhysicianName(txtPhysicianName.getText());
		refEnteralFeeding.setDateField1(dcDateField1.getDate());

		try {
			Global.currentEnteralFeedingKey = MedrexClientManager.getInstance()
					.insertOrUpdateEnteralFeeding(refEnteralFeeding);
		} catch (Exception e) {
		}
		return Global.currentEnteralFeedingKey;
	}

	public void updateData() {
		EnteralFeeding refEnteralFeeding = null;
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());

		} catch (Exception e) {

		}

		if (Global.currentEnteralFeedingKey != 0) {
			try {
				refEnteralFeeding = MedrexClientManager.getInstance()
						.getEnteralFeeding(Global.currentEnteralFeedingKey);
			} catch (Exception e) {

			}
			txtSummary.setText(refEnteralFeeding.getSummary());
			txtRecentLabs.setText(refEnteralFeeding.getRecentLabs());
			txtPreviousWeight.setText(refEnteralFeeding.getPreviousWeight());
			txtCurrentWeight.setText(refEnteralFeeding.getCurrentWeight());
			txtAdmissionWeight.setText(refEnteralFeeding.getAdmissionWeight());
			txtMedication.setText(refEnteralFeeding.getMedication());
			txtFormula.setText(refEnteralFeeding.getFormula());
			txtResidentName.setText(refEnteralFeeding.getResidentName());
			// txtPhysicianName.setText(refEnteralFeeding.getPhysicianName());
			dcDateField1.setDate(refEnteralFeeding.getDateField1());
		} else {
			txtSummary.setText("");
			txtRecentLabs.setText("");
			txtPreviousWeight.setText("");
			txtCurrentWeight.setText("");
			txtAdmissionWeight.setText("");
			txtMedication.setText("");
			txtFormula.setText("");
			txtResidentName.setText("");
			dcDateField1.setDate(null);
		}

		List physicianFormList = null;
		try {
			physicianFormList = MedrexClientManager.getInstance()
					.getPhysicianForms(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator itr = physicianFormList.iterator();
		while (itr.hasNext()) {
			PhysicianForm physicianForm = (PhysicianForm) itr.next();
			Doctors doct = null;
			try {
				doct = physicianForm.getPhysician();// MedrexClientManager.getInstance().getDoctorsRecord(physicianForm.getPhysicianId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (doct.getDoctorType().toString().equals("PHYS")) {
				txtPhysicianName.setText(doct.getPhysicianName());
				break;
			}
		}
	}

	public void doLoad() {

	}

	public void doUpdate() {

	}

	public boolean doValidate() {
		return true;
	}

}
