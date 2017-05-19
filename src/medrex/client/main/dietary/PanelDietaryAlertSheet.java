package medrex.client.main.dietary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.monthlySummary.DietaryAlertSheet;
import medrex.commons.vo.notes.Notes;

import com.sX.swing.notes.JxNotes;
import com.toedter.calendar.JDateChooser;

public class PanelDietaryAlertSheet extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6390351864762127365L;
	private JCheckBox cbdiet;
	private JDateChooser dcAttendingPhysician;
	private JDateChooser dcNursingDupervisor;
	private JDateChooser dcDietitian;
	private JxNotes txtActionToBeTaken;
	private JTextField txtSignature;
	private JCheckBox cbNursingDupervisor;
	private JCheckBox cbAttendPhysician;
	private JxNotes txtDescriptionOfProblem;
	private JCheckBox cbOther;
	private JCheckBox cbAbnormalLabValues;
	private JCheckBox cbMedication;
	private JCheckBox cbSupplementalFeedings;
	private JCheckBox cbTubeFeedings;
	private JCheckBox cbCatheter;
	private JCheckBox cbEdema;
	private JCheckBox cbVomiting;
	private JCheckBox cbDiarrhea;
	private JCheckBox cbConstipation;
	private JCheckBox cbSkinBreakdown;
	private JCheckBox cbSkinFragibility;
	private JCheckBox cbNeedsAssistanceWithMeals;
	private JCheckBox cbNeedsAdaptiveDevice;
	private JCheckBox cbChewingDifficulties;
	private JCheckBox cbPoorAppetite;
	private JCheckBox cbNon_ComplianceWithDiet;
	private JCheckBox cbFluctuatingWeight;
	private JCheckBox cbLossOf5lbs;
	private JCheckBox cbGained5lbs;
	private JCheckBox cbLoss_GainOf5lbs;
	private JTextField txtRoom;
	private JTextField txtDiet;
	private JTextField txtIbwRange;
	private JTextField txtWeight;
	private JTextField txtResidentName;
	private JDateChooser dcFormDate;
	private JTextField txtForm;
	private JCheckBox cbDietitian;
	private JCheckBox cbNursingSupervisor;
	private JCheckBox cbAttendingPhysician;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelDietaryAlertSheet() {
		super();
		Global.panelDietaryAlertSheet = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(760, 1010));
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 750, 1005);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setOpaque(false);
		panel_1.setBounds(10, 0, 726, 23);
		panel.add(panel_1);

		final JLabel dietaryAlertSheetLabel = new JLabel();
		dietaryAlertSheetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dietaryAlertSheetLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		dietaryAlertSheetLabel.setText("DIETARY ALERT SHEET");
		dietaryAlertSheetLabel.setBounds(0, 0, 726, 23);
		panel_1.add(dietaryAlertSheetLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 29, 726, 77);
		panel.add(panel_2);

		final JLabel toLabel = new JLabel();
		toLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		toLabel.setText("TO:");
		toLabel.setBounds(0, 0, 34, 21);
		panel_2.add(toLabel);

		cbAttendingPhysician = new JCheckBox();
		cbAttendingPhysician.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbAttendingPhysician.setBackground(Color.WHITE);
		cbAttendingPhysician.setText("ATTENDING PHYSICIAN");
		cbAttendingPhysician.setBounds(40, 3, 161, 18);
		panel_2.add(cbAttendingPhysician);

		cbNursingSupervisor = new JCheckBox();
		cbNursingSupervisor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbNursingSupervisor.setBackground(Color.WHITE);
		cbNursingSupervisor.setText("NURSING SUPERVISOR");
		cbNursingSupervisor.setBounds(40, 27, 161, 18);
		panel_2.add(cbNursingSupervisor);

		cbDietitian = new JCheckBox();
		cbDietitian.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbDietitian.setBackground(Color.WHITE);
		cbDietitian.setText("DIETITIAN");
		cbDietitian.setBounds(40, 51, 161, 18);
		panel_2.add(cbDietitian);

		final JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 112, 726, 84);
		panel.add(panel_3);

		final JLabel formLabel = new JLabel();
		formLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formLabel.setText("FORM:");
		formLabel.setBounds(0, 2, 49, 14);
		panel_3.add(formLabel);

		txtForm = new JTextField();
		txtForm.setBounds(51, 0, 471, 21);
		panel_3.add(txtForm);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dateLabel.setText("DATE:");
		dateLabel.setBounds(528, 2, 49, 14);
		panel_3.add(dateLabel);

		dcFormDate = new JDateChooser();
		dcFormDate.setBounds(588, 2, 101, 21);
		panel_3.add(dcFormDate);

		final JLabel residentsNameLabel = new JLabel();
		residentsNameLabel.setText("Resident's Name");
		residentsNameLabel.setBounds(0, 25, 88, 21);
		panel_3.add(residentsNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(94, 27, 428, 21);
		panel_3.add(txtResidentName);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room #");
		roomLabel.setBounds(528, 29, 54, 21);
		panel_3.add(roomLabel);

		txtRoom = new JTextField();
		txtRoom.setBounds(588, 29, 101, 21);
		panel_3.add(txtRoom);

		final JLabel weightLabel = new JLabel();
		weightLabel.setText("Weight");
		weightLabel.setBounds(0, 53, 49, 21);
		panel_3.add(weightLabel);

		txtWeight = new JTextField();
		txtWeight.setBounds(56, 52, 117, 21);
		panel_3.add(txtWeight);

		final JLabel ibwRangeLabel = new JLabel();
		ibwRangeLabel.setText("IBW Range");
		ibwRangeLabel.setBounds(179, 54, 68, 21);
		panel_3.add(ibwRangeLabel);

		txtIbwRange = new JTextField();
		txtIbwRange.setBounds(253, 54, 127, 21);
		panel_3.add(txtIbwRange);

		final JLabel dietLabel = new JLabel();
		dietLabel.setText("Diet");
		dietLabel.setBounds(386, 54, 39, 21);
		panel_3.add(dietLabel);

		txtDiet = new JTextField();
		txtDiet.setBounds(431, 54, 163, 21);
		panel_3.add(txtDiet);

		final JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setLayout(null);
		panel_4.setBounds(10, 202, 730, 52);
		panel.add(panel_4);

		final JLabel thisIsToLabel = new JLabel();
		thisIsToLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		thisIsToLabel
				.setText("<html>This is to advise you that the above-named resident is having the following problems(s).<br>Please review and advise of action taken.</html>");
		thisIsToLabel.setBounds(0, 11, 730, 37);
		panel_4.add(thisIsToLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setLayout(null);
		panel_5.setBounds(10, 260, 726, 292);
		panel.add(panel_5);

		final JLabel checkAppropriateProblemssLabel = new JLabel();
		checkAppropriateProblemssLabel
				.setFont(new Font("Tahoma", Font.BOLD, 12));
		checkAppropriateProblemssLabel
				.setText("CHECK APPROPRIATE PROBLEMS(S):");
		checkAppropriateProblemssLabel.setBounds(0, 5, 291, 21);
		panel_5.add(checkAppropriateProblemssLabel);

		cbLoss_GainOf5lbs = new JCheckBox();
		cbLoss_GainOf5lbs.setBackground(Color.WHITE);
		cbLoss_GainOf5lbs.setText("1. Loss/gain of 5lbs. within 1 month");
		cbLoss_GainOf5lbs.setBounds(0, 32, 229, 18);
		panel_5.add(cbLoss_GainOf5lbs);

		cbLossOf5lbs = new JCheckBox();
		cbLossOf5lbs.setBackground(Color.WHITE);
		cbLossOf5lbs.setText("2. Loss of 5lbs. within last 2 months");
		cbLossOf5lbs.setBounds(0, 55, 215, 18);
		panel_5.add(cbLossOf5lbs);

		cbGained5lbs = new JCheckBox();
		cbGained5lbs.setBackground(Color.WHITE);
		cbGained5lbs.setText("3. Gained 5lbs. within last 2 months");
		cbGained5lbs.setBounds(0, 79, 215, 18);
		panel_5.add(cbGained5lbs);

		cbFluctuatingWeight = new JCheckBox();
		cbFluctuatingWeight.setBackground(Color.WHITE);
		cbFluctuatingWeight.setText("4. Fluctuating weight");
		cbFluctuatingWeight.setBounds(0, 103, 215, 18);
		panel_5.add(cbFluctuatingWeight);

		cbNon_ComplianceWithDiet = new JCheckBox();
		cbNon_ComplianceWithDiet.setBackground(Color.WHITE);
		cbNon_ComplianceWithDiet.setText("5. Non-compliance with diet");
		cbNon_ComplianceWithDiet.setBounds(0, 127, 215, 18);
		panel_5.add(cbNon_ComplianceWithDiet);

		cbPoorAppetite = new JCheckBox();
		cbPoorAppetite.setBackground(Color.WHITE);
		cbPoorAppetite.setText("6. Poor appetite");
		cbPoorAppetite.setBounds(0, 151, 215, 18);
		panel_5.add(cbPoorAppetite);

		cbChewingDifficulties = new JCheckBox();
		cbChewingDifficulties.setBackground(Color.WHITE);
		cbChewingDifficulties.setText("7. Chewing difficulties");
		cbChewingDifficulties.setBounds(0, 175, 215, 18);
		panel_5.add(cbChewingDifficulties);

		cbNeedsAdaptiveDevice = new JCheckBox();
		cbNeedsAdaptiveDevice.setBackground(Color.WHITE);
		cbNeedsAdaptiveDevice.setText("8. Needs adaptive device");
		cbNeedsAdaptiveDevice.setBounds(0, 199, 215, 18);
		panel_5.add(cbNeedsAdaptiveDevice);

		cbNeedsAssistanceWithMeals = new JCheckBox();
		cbNeedsAssistanceWithMeals.setBackground(Color.WHITE);
		cbNeedsAssistanceWithMeals.setText("9. Needs assistance with meals");
		cbNeedsAssistanceWithMeals.setBounds(0, 223, 215, 18);
		panel_5.add(cbNeedsAssistanceWithMeals);

		cbSkinFragibility = new JCheckBox();
		cbSkinFragibility.setBackground(Color.WHITE);
		cbSkinFragibility.setText("10. Skin fragibility");
		cbSkinFragibility.setBounds(0, 247, 215, 18);
		panel_5.add(cbSkinFragibility);

		cbSkinBreakdown = new JCheckBox();
		cbSkinBreakdown.setBackground(Color.WHITE);
		cbSkinBreakdown.setText("11. Skin breakdown (decubitus)");
		cbSkinBreakdown.setBounds(0, 271, 215, 18);
		panel_5.add(cbSkinBreakdown);

		cbConstipation = new JCheckBox();
		cbConstipation.setBackground(Color.WHITE);
		cbConstipation.setText("12. Constipation");
		cbConstipation.setBounds(255, 32, 160, 18);
		panel_5.add(cbConstipation);

		cbDiarrhea = new JCheckBox();
		cbDiarrhea.setBackground(Color.WHITE);
		cbDiarrhea.setText("13. Diarrhea");
		cbDiarrhea.setBounds(255, 55, 160, 18);
		panel_5.add(cbDiarrhea);

		cbVomiting = new JCheckBox();
		cbVomiting.setBackground(Color.WHITE);
		cbVomiting.setText("14. Vomiting");
		cbVomiting.setBounds(255, 79, 160, 18);
		panel_5.add(cbVomiting);

		cbEdema = new JCheckBox();
		cbEdema.setBackground(Color.WHITE);
		cbEdema.setText("15. Edema");
		cbEdema.setBounds(255, 103, 160, 18);
		panel_5.add(cbEdema);

		cbCatheter = new JCheckBox();
		cbCatheter.setBackground(Color.WHITE);
		cbCatheter.setText("16. Catheter");
		cbCatheter.setBounds(255, 127, 160, 18);
		panel_5.add(cbCatheter);

		cbTubeFeedings = new JCheckBox();
		cbTubeFeedings.setBackground(Color.WHITE);
		cbTubeFeedings.setText("17. Tube feedings");
		cbTubeFeedings.setBounds(255, 151, 160, 18);
		panel_5.add(cbTubeFeedings);

		cbSupplementalFeedings = new JCheckBox();
		cbSupplementalFeedings.setBackground(Color.WHITE);
		cbSupplementalFeedings.setText("18. Supplemental feedings");
		cbSupplementalFeedings.setBounds(255, 175, 160, 18);
		panel_5.add(cbSupplementalFeedings);

		cbMedication = new JCheckBox();
		cbMedication.setActionCommand("19. Medication");
		cbMedication.setBackground(Color.WHITE);
		cbMedication.setText("19. Medication");
		cbMedication.setBounds(255, 199, 160, 18);
		panel_5.add(cbMedication);

		cbAbnormalLabValues = new JCheckBox();
		cbAbnormalLabValues.setBackground(Color.WHITE);
		cbAbnormalLabValues.setText("20. Abnormal lab values");
		cbAbnormalLabValues.setBounds(255, 223, 160, 18);
		panel_5.add(cbAbnormalLabValues);

		cbOther = new JCheckBox();
		cbOther.setBackground(Color.WHITE);
		cbOther.setText("21. Other (Specify)");
		cbOther.setBounds(255, 247, 160, 18);
		panel_5.add(cbOther);

		final JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setLayout(null);
		panel_6.setBounds(10, 558, 736, 144);
		panel.add(panel_6);

		final JLabel descriptionOfProblemLabel = new JLabel();
		descriptionOfProblemLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		descriptionOfProblemLabel.setText("DESCRIPTION OF PROBLEM");
		descriptionOfProblemLabel.setBounds(0, 48, 179, 21);
		panel_6.add(descriptionOfProblemLabel);

		/*
		 * final JScrollPane scrollPane = new JScrollPane();
		 * scrollPane.setBounds(172, 10, 552, 127); panel_6.add(scrollPane);
		 */

		Notes defaultDescriptionOfProblem = new Notes();
		defaultDescriptionOfProblem.setFormName("DIETARY ALERT SHEET");
		defaultDescriptionOfProblem.setUserId(Global.currentLoggedInUserKey);
		defaultDescriptionOfProblem.setNoteText("");

		txtDescriptionOfProblem = new JxNotes(isCategories);
		txtDescriptionOfProblem.setNotes(defaultDescriptionOfProblem);
		txtDescriptionOfProblem.setBounds(172, 10, 552, 127);
		// scrollPane.setViewportView(txtDescriptionOfProblem);
		txtDescriptionOfProblem
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.add(txtDescriptionOfProblem);

		final JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_7.setLayout(null);
		panel_7.setBounds(10, 708, 736, 114);
		panel.add(panel_7);

		final JLabel receivedByLabel = new JLabel();
		receivedByLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		receivedByLabel.setText("RECEIVED BY:");
		receivedByLabel.setBounds(0, 5, 99, 21);
		panel_7.add(receivedByLabel);

		cbAttendPhysician = new JCheckBox();
		cbAttendPhysician.setBackground(Color.WHITE);
		cbAttendPhysician.setText("Attending Physician");
		cbAttendPhysician.setBounds(119, 7, 135, 18);
		panel_7.add(cbAttendPhysician);

		cbNursingDupervisor = new JCheckBox();
		cbNursingDupervisor.setBackground(Color.WHITE);
		cbNursingDupervisor.setText("Nursing Dupervisor");
		cbNursingDupervisor.setBounds(119, 45, 135, 18);
		panel_7.add(cbNursingDupervisor);

		cbdiet = new JCheckBox();
		cbdiet.setBackground(Color.WHITE);
		cbdiet.setText("Dietitian");
		cbdiet.setBounds(119, 80, 135, 18);
		panel_7.add(cbdiet);

		dcAttendingPhysician = new JDateChooser();
		dcAttendingPhysician.setBounds(265, 7, 99, 21);
		panel_7.add(dcAttendingPhysician);

		dcNursingDupervisor = new JDateChooser();
		dcNursingDupervisor.setBounds(265, 45, 99, 21);
		panel_7.add(dcNursingDupervisor);

		dcDietitian = new JDateChooser();
		dcDietitian.setBounds(265, 80, 99, 21);
		panel_7.add(dcDietitian);

		final JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		panel_8.setLayout(null);
		panel_8.setBounds(10, 828, 736, 144);
		panel.add(panel_8);

		final JLabel actionToBeLabel = new JLabel();
		actionToBeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		actionToBeLabel.setText("ACTION TO BE TAKEN:");
		actionToBeLabel.setBounds(0, 5, 141, 14);
		panel_8.add(actionToBeLabel);

		/*
		 * final JScrollPane scrollPane_1 = new JScrollPane();
		 * scrollPane_1.setBounds(147, 5, 583, 130); panel_8.add(scrollPane_1);
		 */

		Notes defaultActionToBeTaken = new Notes();
		defaultActionToBeTaken.setFormName("DIETARY ALERT SHEET");
		defaultActionToBeTaken.setUserId(Global.currentLoggedInUserKey);
		defaultActionToBeTaken.setNoteText("");

		txtActionToBeTaken = new JxNotes(isCategories);
		txtActionToBeTaken.setNotes(defaultActionToBeTaken);
		txtActionToBeTaken.setBounds(147, 5, 583, 130);
		panel_8.add(txtActionToBeTaken);
		// scrollPane_1.setViewportView(txtActionToBeTaken);

		final JLabel signatureLabel = new JLabel();
		signatureLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		signatureLabel.setText("SIGNATURE");
		signatureLabel.setBounds(347, 978, 99, 21);
		panel.add(signatureLabel);

		txtSignature = new JTextField();
		txtSignature.setBounds(452, 978, 284, 21);
		panel.add(txtSignature);

		// updateData();
	}

	public void doLoad() {

	}

	public int doSave() {

		DietaryAlertSheet refDietaryAlertSheet = new DietaryAlertSheet();
		refDietaryAlertSheet.setResidentId(Global.currentResidenceKey);

		refDietaryAlertSheet.setSerial(Global.currentDietaryAlertSheetKey);
		// refDietaryAlertSheet.setFormId(Global.currentMsjnKey);
		refDietaryAlertSheet.setdiet(cbdiet.isSelected());
		refDietaryAlertSheet.setAttendingPhysicianDate(dcAttendingPhysician
				.getDate());
		refDietaryAlertSheet.setNursingDupervisorDate(dcNursingDupervisor
				.getDate());
		refDietaryAlertSheet.setDietitianDate(dcDietitian.getDate());
		refDietaryAlertSheet.setActionToBeTaken(txtActionToBeTaken.getNotes());
		refDietaryAlertSheet.setSignature(txtSignature.getText());
		refDietaryAlertSheet.setNursingDupervisor(cbNursingDupervisor
				.isSelected());
		refDietaryAlertSheet.setAttendPhysician(cbAttendPhysician.isSelected());
		refDietaryAlertSheet.setDescriptionOfProblem(txtDescriptionOfProblem
				.getNotes());
		refDietaryAlertSheet.setOther(cbOther.isSelected());
		refDietaryAlertSheet.setAbnormalLabValues(cbAbnormalLabValues
				.isSelected());
		refDietaryAlertSheet.setMedication(cbMedication.isSelected());
		refDietaryAlertSheet.setSupplementalFeedings(cbSupplementalFeedings
				.isSelected());
		refDietaryAlertSheet.setTubeFeedings(cbTubeFeedings.isSelected());
		refDietaryAlertSheet.setCatheter(cbCatheter.isSelected());
		refDietaryAlertSheet.setEdema(cbEdema.isSelected());
		refDietaryAlertSheet.setVomiting(cbVomiting.isSelected());
		refDietaryAlertSheet.setDiarrhea(cbDiarrhea.isSelected());
		refDietaryAlertSheet.setConstipation(cbConstipation.isSelected());
		refDietaryAlertSheet.setSkinBreakdown(cbSkinBreakdown.isSelected());
		refDietaryAlertSheet.setSkinFragibility(cbSkinFragibility.isSelected());
		refDietaryAlertSheet
				.setNeedsAssistanceWithMeals(cbNeedsAssistanceWithMeals
						.isSelected());
		refDietaryAlertSheet.setNeedsAdaptiveDevice(cbNeedsAdaptiveDevice
				.isSelected());
		refDietaryAlertSheet.setChewingDifficulties(cbChewingDifficulties
				.isSelected());
		refDietaryAlertSheet.setPoorAppetite(cbPoorAppetite.isSelected());
		refDietaryAlertSheet.setFluctuatingWeight(cbFluctuatingWeight
				.isSelected());
		refDietaryAlertSheet.setLossOf5lbs(cbLossOf5lbs.isSelected());
		refDietaryAlertSheet.setGained5lbs(cbGained5lbs.isSelected());
		refDietaryAlertSheet.setRoom(txtRoom.getText());
		refDietaryAlertSheet.setDiets(txtDiet.getText());
		refDietaryAlertSheet.setIbwRange(txtIbwRange.getText());
		refDietaryAlertSheet.setWeight(txtWeight.getText());
		refDietaryAlertSheet.setResidentName(txtResidentName.getText());
		refDietaryAlertSheet.setFormDate(dcFormDate.getDate());
		refDietaryAlertSheet.setForm(txtForm.getText());
		refDietaryAlertSheet.setDietitian(cbDietitian.isSelected());
		refDietaryAlertSheet.setNursingSupervisor(cbNursingSupervisor
				.isSelected());
		refDietaryAlertSheet.setAttendingPhysician(cbAttendingPhysician
				.isSelected());

		try {
			Global.currentDietaryAlertSheetKey = MedrexClientManager
					.getInstance().insertOrUpdateDietaryAlertSheet(
							refDietaryAlertSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentDietaryAlertSheetKey;
	}

	public void updateData() {

		DietaryAlertSheet refDietaryAlertSheet = null;
		if (Global.currentDietaryAlertSheetKey != 0) {
			try {
				refDietaryAlertSheet = MedrexClientManager.getInstance()
						.getDietaryAlertSheet(
								Global.currentDietaryAlertSheetKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Global.currentDietaryAlertSheetKey = refDietaryAlertSheet
					.getSerial();
			cbdiet.setSelected(refDietaryAlertSheet.isdiet());
			dcAttendingPhysician.setDate(refDietaryAlertSheet
					.getAttendingPhysicianDate());
			dcNursingDupervisor.setDate(refDietaryAlertSheet
					.getNursingDupervisorDate());
			dcDietitian.setDate(refDietaryAlertSheet.getDietitianDate());
			txtActionToBeTaken.setNotes(refDietaryAlertSheet
					.getActionToBeTaken());
			txtSignature.setText(refDietaryAlertSheet.getSignature());
			cbNursingDupervisor.setSelected(refDietaryAlertSheet
					.isNursingDupervisor());
			cbAttendPhysician.setSelected(refDietaryAlertSheet
					.isAttendPhysician());
			txtDescriptionOfProblem.setNotes(refDietaryAlertSheet
					.getDescriptionOfProblem());
			cbOther.setSelected(refDietaryAlertSheet.isOther());
			cbAbnormalLabValues.setSelected(refDietaryAlertSheet
					.isAbnormalLabValues());
			cbMedication.setSelected(refDietaryAlertSheet.isMedication());
			cbSupplementalFeedings.setSelected(refDietaryAlertSheet
					.isSupplementalFeedings());
			cbTubeFeedings.setSelected(refDietaryAlertSheet.isTubeFeedings());
			cbCatheter.setSelected(refDietaryAlertSheet.isCatheter());
			cbEdema.setSelected(refDietaryAlertSheet.isEdema());
			cbVomiting.setSelected(refDietaryAlertSheet.isVomiting());
			cbDiarrhea.setSelected(refDietaryAlertSheet.isDiarrhea());
			cbConstipation.setSelected(refDietaryAlertSheet.isConstipation());
			cbSkinBreakdown.setSelected(refDietaryAlertSheet.isSkinBreakdown());
			cbSkinFragibility.setSelected(refDietaryAlertSheet
					.isSkinFragibility());
			cbNeedsAssistanceWithMeals.setSelected(refDietaryAlertSheet
					.isNeedsAssistanceWithMeals());
			cbNeedsAdaptiveDevice.setSelected(refDietaryAlertSheet
					.isNeedsAdaptiveDevice());
			cbChewingDifficulties.setSelected(refDietaryAlertSheet
					.isChewingDifficulties());
			cbPoorAppetite.setSelected(refDietaryAlertSheet.isPoorAppetite());
			cbFluctuatingWeight.setSelected(refDietaryAlertSheet
					.isFluctuatingWeight());
			cbLossOf5lbs.setSelected(refDietaryAlertSheet.isLossOf5lbs());
			cbGained5lbs.setSelected(refDietaryAlertSheet.isGained5lbs());
			txtRoom.setText(refDietaryAlertSheet.getRoom());
			txtDiet.setText(refDietaryAlertSheet.getDiets());
			txtIbwRange.setText(refDietaryAlertSheet.getIbwRange());
			txtWeight.setText(refDietaryAlertSheet.getWeight());
			txtResidentName.setText(refDietaryAlertSheet.getResidentName());
			dcFormDate.setDate(refDietaryAlertSheet.getFormDate());
			txtForm.setText(refDietaryAlertSheet.getForm());
			cbDietitian.setSelected(refDietaryAlertSheet.isDietitian());
			cbNursingSupervisor.setSelected(refDietaryAlertSheet
					.isNursingSupervisor());
			cbAttendingPhysician.setSelected(refDietaryAlertSheet
					.isAttendingPhysician());
		}
	}

	public boolean doValidate() {
		return true;
	}

}
