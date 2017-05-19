package medrex.client.main.historyandphysical;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.Utils;
import medrex.commons.intf.Form;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysicalGeneralFormPage1;
import medrex.commons.vo.resident.ResidentMain;

public class PanelHistoryAndPhysicalGeneralFormPage1 extends JPanel implements
		Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8549132467217798959L;
	JTextField txtResidentName;
	JTextField txtAge;
	JTextField txtPhysician;
	JTextField txtAdmNum;
	JTextField txtPreviousResidence;
	JTextField txtCareGiver;

	JTextArea txtRecentMedicalHistory;
	JTextArea txtPastMedicalHistory;

	JTextField txtAllergies;
	JTextField txtHabits;

	JTextArea txtLabData;

	/**
	 * Create the panel
	 */
	public PanelHistoryAndPhysicalGeneralFormPage1() {
		super();
		Global.panelHistoryAndPhysicalGeneralFormPage1 = this;
		setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		setSize(1200, 950);
		// Global.panelDoctorsProgressNotesForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800, 950));
		setLayout(null);

		final JLabel plazaHealthCareLabel = new JLabel();
		plazaHealthCareLabel.setFont(new Font("", Font.BOLD, 14));
		plazaHealthCareLabel
				.setText("PLAZA HEALTH CARE & REHABILITATION CENTER");
		plazaHealthCareLabel.setBounds(210, 10, 356, 16);
		add(plazaHealthCareLabel);

		final JLabel plazaHealthCareLabel_1 = new JLabel();
		plazaHealthCareLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		plazaHealthCareLabel_1.setText("HISTORY & PHYSICAL");
		plazaHealthCareLabel_1.setBounds(273, 44, 356, 16);
		add(plazaHealthCareLabel_1);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 78, 780, 62);
		add(panel);

		txtResidentName = new JTextField();
		txtResidentName.setBackground(Color.WHITE);
		txtResidentName.setEditable(false);
		txtResidentName.setBounds(10, 10, 168, 20);
		panel.add(txtResidentName);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setText("RESIDENT NAME");
		residentNameLabel.setBounds(45, 36, 92, 16);
		panel.add(residentNameLabel);

		txtAge = new JTextField();
		txtAge.setBackground(Color.WHITE);
		txtAge.setEditable(false);
		txtAge.setBounds(208, 10, 87, 20);
		panel.add(txtAge);

		final JLabel ageLabel = new JLabel();
		ageLabel.setText("AGE");
		ageLabel.setBounds(235, 36, 66, 16);
		panel.add(ageLabel);

		txtPhysician = new JTextField();
		txtPhysician.setBackground(Color.WHITE);
		txtPhysician.setEditable(false);
		txtPhysician.setBounds(324, 10, 168, 20);
		panel.add(txtPhysician);

		final JLabel physicianLabel = new JLabel();
		physicianLabel.setText("PHYSICIAN");
		physicianLabel.setBounds(376, 36, 66, 16);
		panel.add(physicianLabel);

		txtAdmNum = new JTextField();
		txtAdmNum.setEditable(false);
		txtAdmNum.setBackground(Color.WHITE);
		txtAdmNum.setBounds(545, 10, 87, 20);
		panel.add(txtAdmNum);

		final JLabel admLabel = new JLabel();
		admLabel.setText("ADM. #");
		admLabel.setBounds(570, 36, 66, 16);
		panel.add(admLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 146, 780, 794);
		add(panel_1);

		final JLabel previousResidenceLabel = new JLabel();
		previousResidenceLabel.setText("PREVIOUS RESIDENCE");
		previousResidenceLabel.setBounds(10, 10, 140, 14);
		panel_1.add(previousResidenceLabel);

		txtPreviousResidence = new JTextField();
		txtPreviousResidence.setBounds(170, 7, 600, 21);
		panel_1.add(txtPreviousResidence);

		final JLabel careGiverLabel = new JLabel();
		careGiverLabel.setText("CARE GIVER");
		careGiverLabel.setBounds(10, 40, 140, 14);
		panel_1.add(careGiverLabel);

		txtCareGiver = new JTextField();
		txtCareGiver.setBounds(170, 37, 600, 21);
		panel_1.add(txtCareGiver);

		final JLabel recentMedicalHistoryLabel = new JLabel();
		recentMedicalHistoryLabel.setText("RECENT MEDICAL HISTORY");
		recentMedicalHistoryLabel.setBounds(10, 71, 140, 14);
		panel_1.add(recentMedicalHistoryLabel);

		txtRecentMedicalHistory = new JTextArea();
		txtRecentMedicalHistory.setWrapStyleWord(true);
		txtRecentMedicalHistory
				.setBorder(new LineBorder(Color.black, 1, false));
		txtRecentMedicalHistory.setLineWrap(true);
		txtRecentMedicalHistory.setBounds(170, 69, 600, 251);
		panel_1.add(txtRecentMedicalHistory);

		final JLabel pastMedicalHistoryLabel = new JLabel();
		pastMedicalHistoryLabel.setText("PAST MEDICAL HISTORY");
		pastMedicalHistoryLabel.setBounds(10, 335, 140, 14);
		panel_1.add(pastMedicalHistoryLabel);

		txtPastMedicalHistory = new JTextArea();
		txtPastMedicalHistory.setBorder(new LineBorder(Color.black, 1, false));
		txtPastMedicalHistory.setWrapStyleWord(true);
		txtPastMedicalHistory.setLineWrap(true);
		txtPastMedicalHistory.setBounds(170, 326, 600, 222);
		panel_1.add(txtPastMedicalHistory);

		final JLabel allergiesLabel = new JLabel();
		allergiesLabel.setText("ALLERGIES");
		allergiesLabel.setBounds(10, 557, 140, 14);
		panel_1.add(allergiesLabel);

		txtAllergies = new JTextField();
		txtAllergies.setBounds(170, 554, 600, 21);
		panel_1.add(txtAllergies);

		final JLabel habitsLabel = new JLabel();
		habitsLabel.setText("HABITS");
		habitsLabel.setBounds(10, 584, 54, 14);
		panel_1.add(habitsLabel);

		txtHabits = new JTextField();
		txtHabits.setBounds(170, 581, 600, 21);
		panel_1.add(txtHabits);

		final JLabel labDataLabel = new JLabel();
		labDataLabel.setText("LAB DATA");
		labDataLabel.setBounds(10, 614, 54, 14);
		panel_1.add(labDataLabel);

		txtLabData = new JTextArea();
		txtLabData.setBorder(new LineBorder(Color.black, 1, false));
		txtLabData.setWrapStyleWord(true);
		txtLabData.setLineWrap(true);
		txtLabData.setBounds(170, 613, 600, 85);
		panel_1.add(txtLabData);

		final JLabel continuedOnNextLabel = new JLabel();
		continuedOnNextLabel.setText("CONTINUED ON NEXT PAGE");
		continuedOnNextLabel.setBounds(531, 720, 228, 14);
		panel_1.add(continuedOnNextLabel);

		fillCombos();
		updateData();

	}

	public void fillCombos() {

	}

	public void updateData() {
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());

			txtAge.setText(Utils.getResidentAgeYear() + "");
			// + "."
			// + Utils.getResidentAgeMonth());

		} catch (Exception e) {

		}

		if (Global.currentHistoryAndPhysicalGeneralFormPage1Key == 0) {

			txtPreviousResidence.setText("");
			txtCareGiver.setText("");
			txtRecentMedicalHistory.setText("");
			txtPastMedicalHistory.setText("");
			txtAllergies.setText("");
			txtHabits.setText("");
			txtLabData.setText("");

		} else {
			HistoryAndPhysicalGeneralFormPage1 hapgfp1 = null;
			try {
				hapgfp1 = MedrexClientManager
						.getInstance()
						.getHistoryAndPhysicalGeneralFormPage1(
								Global.currentHistoryAndPhysicalGeneralFormPage1Key);
				Global.currentHistoryAndPhysicalGeneralFormPage1Key = hapgfp1
						.getSerial();
			} catch (Exception e) {
			}

			txtPreviousResidence.setText(hapgfp1.getPreviousResidence());
			txtCareGiver.setText(hapgfp1.getCareGiver());
			txtRecentMedicalHistory.setText(hapgfp1.getRecentMedicalHistory());
			txtPastMedicalHistory.setText(hapgfp1.getPastMedicalHistory());
			txtAllergies.setText(hapgfp1.getAllergies());
			txtHabits.setText(hapgfp1.getHabits());
			txtLabData.setText(hapgfp1.getLabData());
		}

	}

	public int doSave() {
		HistoryAndPhysicalGeneralFormPage1 hapgfp1 = new HistoryAndPhysicalGeneralFormPage1();

		hapgfp1.setSerial(Global.currentHistoryAndPhysicalGeneralFormPage1Key);
		hapgfp1.setResidentId(Global.currentResidenceKey);

		hapgfp1.setPreviousResidence(txtPreviousResidence.getText());
		hapgfp1.setCareGiver(txtCareGiver.getText());
		hapgfp1.setRecentMedicalHistory(txtRecentMedicalHistory.getText());
		hapgfp1.setPastMedicalHistory(txtPastMedicalHistory.getText());
		hapgfp1.setAllergies(txtAllergies.getText());
		hapgfp1.setHabits(txtHabits.getText());
		hapgfp1.setLabData(txtLabData.getText());

		try {
			Global.currentHistoryAndPhysicalGeneralFormPage1Key = MedrexClientManager
					.getInstance()
					.insertOrUpdateHistoryAndPhysicalGeneralFormPage1(hapgfp1);
		} catch (Exception e) {
		}
		return Global.currentHistoryAndPhysicalGeneralFormPage1Key;
	}

	public void doLoad() {

	}

	public void doUpdate() {
		updateData();

	}

	public boolean doValidate() {

		return true;
	}

}
