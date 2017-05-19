package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.ResidentTransferForm;

import com.toedter.calendar.JDateChooser;

public class PanelResidentTransferForm extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7080273542027449541L;
	private ButtonGroup bgTransport = new ButtonGroup();
	private ButtonGroup bgAdvancedDirective = new ButtonGroup();
	private ButtonGroup bgResidentKnew = new ButtonGroup();
	private ButtonGroup bgFamilyAware = new ButtonGroup();
	private JRadioButton rbFamilyAwareNo;
	private JRadioButton rbFamilyAwareYes;
	private JRadioButton rbEmpoymentNo;
	private JRadioButton rbEmpoymentYes;
	private JTextField txtNurseSignature;
	private JRadioButton rbBus;
	private JRadioButton rbCar;
	private JRadioButton rbAmbulance;
	private JRadioButton rbCarForHandicappedLabel;
	private JTextField txtPlaceOfExercise;
	private JTextField txtRangeOfMotion;
	private JTextField txtSittingTimesAday;
	private JTextField txtSittingHours;
	private JTextField txtOutside;
	private JTextField txtWithin;
	private JTextField txtIndividual;
	private JTextField txtEncourageGroup;
	private JTextField txtWalkingTimesAday;
	private JTextField txtPronePosition;
	private JTextField txtAvoidingPosition;
	private JTextField txtMinTimesDay;
	private JTextField txtStand;
	private JTextField txtOtherOutLined;
	private JTextField txtOnLeg;
	private JTextField txtByResident;
	private JTextField txtWeightBearingPartial;
	private JTextField txtWeightBearingFull;
	private JTextField txtHours;
	private JTextField txtUrinalysisResult;
	private JTextField txtSerologyResult;
	private JTextField txtCBCResult;
	private JTextField txtChestXrayResult;
	private JCheckBox cbCopyAttached;
	private JRadioButton rbAdvancedDirectiveNo;
	private JRadioButton rbAdvancedDirectiveYes;
	private JCheckBox cbPoor;
	private JCheckBox cbFair;
	private JCheckBox cbGood;
	private JCheckBox cbSensation;
	private JCheckBox cbVision;
	private JRadioButton rbResidentKnewNo;
	private JRadioButton rbResidentKnewYes;
	private JCheckBox cbHearing;
	private JCheckBox cbSpeech;
	private JCheckBox cbSevere;
	private JCheckBox cbModerate;
	private JCheckBox cbNone;
	private JCheckBox cbMental;
	private JCheckBox cbSaliva;
	private JCheckBox cbBowel;
	private JCheckBox cbBladder;
	private JCheckBox cbDecubUlcer;
	private JCheckBox cbContracture;
	private JCheckBox cbParalysis;
	private JCheckBox cbAmputation;
	private JTextArea txtDietOrder;
	private JTextField txtVitalBP;
	private JTextField txtVitalR;
	private JTextField txtVitalPulse;
	private JTextField txtVitalTemp;
	private JTextField txtDiagnosesTimeOfTransferSecondary;
	private JTextField txtDiagnosesTimeOfTransferPrimary;
	private JTextField txtGuardianPhoneNo;
	private JTextField txtGuardianAddress;
	private JTextField txtRelativeGuardianName;
	private JTextField txtTime;
	private JTextField txtClinicAppointment;
	private JTextArea txtNameAndAddressHospital;
	private JTextArea txtNameAndAddress;
	private JCheckBox cbOtherExplain;
	private JCheckBox cbEmployer;
	private JCheckBox cbPrivateInsurance;
	private JCheckBox cbPublicAgency;
	private JCheckBox cbBlueCross;
	private JCheckBox cbSelfOrFamily;
	private JRadioButton rbPhysicianCareNo;
	private JRadioButton rbPhysicianCareYes;
	private JTextArea txtFacilityName;
	private JTextField txtReligion;
	private JTextArea txtResidentAddress;
	private JTextField txtHealthInsuranceClaimNumber;
	private JRadioButton rbFemale;
	private JRadioButton rbMale;
	private JTextField txtMI;
	private JTextField txtResidentFirstName;
	private JTextField txtResidentLastName;
	private ButtonGroup bgEmploymentRelated = new ButtonGroup();
	private ButtonGroup bgPhysicianCare = new ButtonGroup();
	private JDateChooser dcDateTransfer;
	private JDateChooser dcUrinalysis;
	private JDateChooser dcSerology;
	private JDateChooser dcCBC;
	private JDateChooser dcChestXRay;
	private JDateChooser dcTBTest;
	private JDateChooser dcDateOfLastPhysicalExam;
	private JDateChooser dcDateOfClinicAppointment;
	private JDateChooser dcDateOfDischarge;
	private JDateChooser dcDateOfAdmission;
	private JDateChooser dcDateOfTransfer;
	private JDateChooser dcDateOfBirth;
	private ButtonGroup bgResidentSex = new ButtonGroup();
	private JCheckBox cbGenericSubstitute;

	public PanelResidentTransferForm() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(920, 1610));

		final JLabel residentTransferFormLabel = new JLabel();
		residentTransferFormLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		residentTransferFormLabel.setText("RESIDENT TRANSFER FORM");
		residentTransferFormLabel.setBounds(350, 0, 206, 34);
		add(residentTransferFormLabel);

		final JLabel interagencyReferralLabel = new JLabel();
		interagencyReferralLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		interagencyReferralLabel.setText("(INTER-AGENCY REFERRAL)");
		interagencyReferralLabel.setBounds(389, 34, 146, 14);
		add(interagencyReferralLabel);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBounds(24, 54, 862, 1556);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 862, 50);
		panel.add(panel_1);

		final JLabel label = new JLabel();
		label.setText("1. RESIDENT'S LAST NAME");
		label.setBounds(10, 15, 146, 25);
		panel_1.add(label);

		txtResidentLastName = new JTextField();
		txtResidentLastName.setBounds(161, 15, 84, 21);
		panel_1.add(txtResidentLastName);

		final JLabel firstNameLabel = new JLabel();
		firstNameLabel.setText("FIRST  NAME");
		firstNameLabel.setBounds(252, 15, 75, 14);
		panel_1.add(firstNameLabel);

		txtResidentFirstName = new JTextField();
		txtResidentFirstName.setBounds(320, 17, 121, 21);
		panel_1.add(txtResidentFirstName);

		final JLabel miLabel = new JLabel();
		miLabel.setText("MI");
		miLabel.setBounds(447, 20, 21, 14);
		panel_1.add(miLabel);

		txtMI = new JTextField();
		txtMI.setBounds(465, 17, 33, 21);
		panel_1.add(txtMI);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(504, 0, 105, 50);
		panel_1.add(panel_2);

		final JLabel label_1 = new JLabel();
		label_1.setBounds(34, 3, 41, 14);
		panel_2.add(label_1);
		label_1.setText("2. SEX");

		rbMale = new JRadioButton();
		bgResidentSex.add(rbMale);
		rbMale.setBackground(Color.WHITE);
		rbMale.setBounds(6, 23, 33, 18);
		panel_2.add(rbMale);
		rbMale.setText("M");

		rbFemale = new JRadioButton();
		bgResidentSex.add(rbFemale);
		rbFemale.setBackground(Color.WHITE);
		rbFemale.setBounds(62, 23, 33, 18);
		panel_2.add(rbFemale);
		rbFemale.setText("F");

		final JLabel label_2 = new JLabel();
		label_2.setText("3.HEALTH INSURANCE CLAIM NUMBER");
		label_2.setBounds(640, 5, 211, 14);
		panel_1.add(label_2);

		txtHealthInsuranceClaimNumber = new JTextField();
		txtHealthInsuranceClaimNumber.setBounds(638, 25, 190, 21);
		panel_1.add(txtHealthInsuranceClaimNumber);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBounds(0, 49, 862, 53);
		panel.add(panel_3);

		final JLabel residentsAddressstreetcitystatezipLabel = new JLabel();
		residentsAddressstreetcitystatezipLabel
				.setText("RESIDENT'S ADDRESS (Street,City,State,Zip Code)");
		residentsAddressstreetcitystatezipLabel.setBounds(118, 3, 255, 14);
		panel_3.add(residentsAddressstreetcitystatezipLabel);

		txtResidentAddress = new JTextArea();
		txtResidentAddress.setText("");
		txtResidentAddress.setBorder(new LineBorder(Color.black, 1, false));
		txtResidentAddress.setBounds(43, 22, 429, 21);
		panel_3.add(txtResidentAddress);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBounds(517, 0, 155, 53);
		panel_3.add(panel_4);

		final JLabel label_3 = new JLabel();
		label_3.setText("5. DATE OF BIRTH");
		label_3.setBounds(26, 0, 106, 14);
		panel_4.add(label_3);

		dcDateOfBirth = new JDateChooser();
		dcDateOfBirth.setBackground(Color.WHITE);
		dcDateOfBirth.setBounds(25, 20, 106, 20);
		panel_4.add(dcDateOfBirth);

		final JLabel label_4 = new JLabel();
		label_4.setText("6. RELIGION");
		label_4.setBounds(722, 3, 79, 14);
		panel_3.add(label_4);

		txtReligion = new JTextField();
		txtReligion.setBounds(695, 18, 156, 21);
		panel_3.add(txtReligion);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBounds(0, 101, 862, 100);
		panel.add(panel_5);

		final JLabel label_5 = new JLabel();
		label_5.setText("7. DATE OF THIS TRANSFER");
		label_5.setBounds(19, 21, 145, 14);
		panel_5.add(label_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setBounds(170, 0, 391, 100);
		panel_5.add(panel_6);

		final JLabel label_6 = new JLabel();
		label_6.setBounds(42, 8, 270, 14);
		label_6.setText("8. FACILITY NAME AND ADDRESS TRANSFERRING IQ");
		panel_6.add(label_6);

		txtFacilityName = new JTextArea();
		txtFacilityName.setBorder(new LineBorder(Color.black, 1, false));
		txtFacilityName.setBounds(42, 28, 327, 48);
		panel_6.add(txtFacilityName);

		final JLabel label_7 = new JLabel();
		label_7.setText("9. PHYSICIAN IN CHARGE AT TIME OF TRANSFER");
		label_7.setBounds(564, 5, 298, 14);
		panel_5.add(label_7);

		final JLabel willThisPhysicianLabel = new JLabel();
		willThisPhysicianLabel
				.setText("<html><body>Will this physician care for resident after admission to <br>new facility?</body></html>");
		willThisPhysicianLabel.setBounds(567, 47, 270, 28);
		panel_5.add(willThisPhysicianLabel);

		rbPhysicianCareYes = new JRadioButton();
		bgPhysicianCare.add(rbPhysicianCareYes);
		rbPhysicianCareYes.setBackground(Color.WHITE);
		rbPhysicianCareYes.setText("YES");
		rbPhysicianCareYes.setBounds(635, 62, 55, 18);
		panel_5.add(rbPhysicianCareYes);

		rbPhysicianCareNo = new JRadioButton();
		bgPhysicianCare.add(rbPhysicianCareNo);
		rbPhysicianCareNo.setBackground(Color.WHITE);
		rbPhysicianCareNo.setText("NO");
		rbPhysicianCareNo.setBounds(696, 62, 42, 18);
		panel_5.add(rbPhysicianCareNo);

		dcDateOfTransfer = new JDateChooser();
		dcDateOfTransfer.setBackground(Color.WHITE);
		dcDateOfTransfer.setBounds(19, 52, 145, 20);
		panel_5.add(dcDateOfTransfer);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 200, 860, 106);
		panel.add(panel_7);

		final JLabel admissionLabel = new JLabel();
		admissionLabel.setText("ADMISSION");
		admissionLabel.setBounds(10, 34, 69, 14);
		panel_7.add(admissionLabel);

		final JLabel dischhargeLabel = new JLabel();
		dischhargeLabel.setText("DISCHARGE");
		dischhargeLabel.setBounds(93, 34, 71, 14);
		panel_7.add(dischhargeLabel);

		final JLabel label_8 = new JLabel();
		label_8.setBounds(6, 0, 160, 28);
		panel_7.add(label_8);
		label_8
				.setText("<HTML><BODY>10. DATES OF STAY AT FACILITY<BR> TRANSFERRING FORM</BODY></HTML>");

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBounds(170, 0, 691, 106);
		panel_7.add(panel_8);

		final JLabel label_9 = new JLabel();
		label_9.setBounds(20, 0, 292, 14);
		label_9.setText("11. PAYMENT SOURCE FOR CHARGES TO RESIDENT");
		panel_8.add(label_9);

		final JLabel aLabel = new JLabel();
		aLabel.setText("A.");
		aLabel.setBounds(25, 20, 11, 14);
		panel_8.add(aLabel);

		cbSelfOrFamily = new JCheckBox();
		cbSelfOrFamily.setBackground(Color.WHITE);
		cbSelfOrFamily.setText("SELF OR FAMILY");
		cbSelfOrFamily.setBounds(42, 20, 105, 18);
		panel_8.add(cbSelfOrFamily);

		final JLabel bLabel = new JLabel();
		bLabel.setText("B.");
		bLabel.setBounds(25, 42, 17, 14);
		panel_8.add(bLabel);

		cbPrivateInsurance = new JCheckBox();
		cbPrivateInsurance.setBackground(Color.WHITE);
		cbPrivateInsurance.setText("PRIVATE INSURANCE");
		cbPrivateInsurance.setBounds(42, 44, 161, 18);
		panel_8.add(cbPrivateInsurance);

		final JLabel cLabel = new JLabel();
		cLabel.setText("C.");
		cLabel.setBounds(209, 22, 17, 14);
		panel_8.add(cLabel);

		cbBlueCross = new JCheckBox();
		cbBlueCross.setBackground(Color.WHITE);
		cbBlueCross.setText("BLUE CROSS BLUE SHIELD");
		cbBlueCross.setBounds(232, 18, 167, 18);
		panel_8.add(cbBlueCross);

		final JLabel dLabel = new JLabel();
		dLabel.setText("D.");
		dLabel.setBounds(209, 46, 11, 14);
		panel_8.add(dLabel);

		cbEmployer = new JCheckBox();
		cbEmployer.setBackground(Color.WHITE);
		cbEmployer.setText("EMPLOYER OR UNION");
		cbEmployer.setBounds(232, 44, 131, 18);
		panel_8.add(cbEmployer);

		final JLabel eLabel = new JLabel();
		eLabel.setText("E.");
		eLabel.setBounds(399, 20, 17, 14);
		panel_8.add(eLabel);

		cbPublicAgency = new JCheckBox();
		cbPublicAgency.setBackground(Color.WHITE);
		cbPublicAgency.setText("PUBLIC AGENCY");
		cbPublicAgency.setBounds(422, 18, 121, 18);
		panel_8.add(cbPublicAgency);

		final JLabel giveNameLabel = new JLabel();
		giveNameLabel.setText("(Give name)");
		giveNameLabel.setBounds(447, 34, 73, 14);
		panel_8.add(giveNameLabel);

		final JLabel fLabel = new JLabel();
		fLabel.setText("F.");
		fLabel.setBounds(399, 54, 17, 14);
		panel_8.add(fLabel);

		cbOtherExplain = new JCheckBox();
		cbOtherExplain.setBackground(Color.WHITE);
		cbOtherExplain.setText("OTHER ");
		cbOtherExplain.setBounds(422, 54, 62, 18);
		panel_8.add(cbOtherExplain);

		final JLabel explainLabel = new JLabel();
		explainLabel.setText("(Explain)");
		explainLabel.setBounds(422, 78, 54, 14);
		panel_8.add(explainLabel);

		dcDateOfAdmission = new JDateChooser();
		dcDateOfAdmission.setBackground(Color.WHITE);
		dcDateOfAdmission.setBounds(10, 54, 69, 20);
		panel_7.add(dcDateOfAdmission);

		dcDateOfDischarge = new JDateChooser();
		dcDateOfDischarge.setBackground(Color.WHITE);
		dcDateOfDischarge.setBounds(85, 54, 69, 20);
		panel_7.add(dcDateOfDischarge);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBounds(0, 305, 861, 124);
		panel.add(panel_9);

		final JLabel label_10 = new JLabel();
		label_10.setBackground(Color.WHITE);
		label_10.setText("12-A NAME AND ADDRESS OF FACILITY TRANSFERRING FROM");
		label_10.setBounds(36, 17, 324, 14);
		panel_9.add(label_10);

		txtNameAndAddress = new JTextArea();
		txtNameAndAddress.setBorder(new LineBorder(Color.black, 1, false));
		txtNameAndAddress.setBounds(29, 37, 347, 77);
		panel_9.add(txtNameAndAddress);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBounds(396, 0, 466, 124);
		panel_9.add(panel_10);

		final JLabel label_11 = new JLabel();
		label_11.setBounds(30, 6, 425, 44);
		label_11
				.setText("<HTML><BODY>12-B NAME AND ADDRESS OF ALL HOSPITALS AND EXTENDED CARE FACILITIES FROM <BR> WHICH RESIDENT WAS DISCHARGED IN PAST 60 DAYS</BODY></HTML>");
		panel_10.add(label_11);

		txtNameAndAddressHospital = new JTextArea();
		txtNameAndAddressHospital.setBorder(new LineBorder(Color.black, 1,
				false));
		txtNameAndAddressHospital.setBounds(30, 51, 425, 63);
		panel_10.add(txtNameAndAddressHospital);

		final JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBounds(0, 428, 861, 57);
		panel.add(panel_11);

		final JLabel label_12 = new JLabel();
		label_12.setBounds(0, 0, 146, 14);
		label_12.setText("13. CLINIC APPOINTMENT");
		panel_11.add(label_12);

		final JLabel dateLabel = new JLabel();
		dateLabel.setText("DATE");
		dateLabel.setBounds(169, 0, 38, 14);
		panel_11.add(dateLabel);

		final JLabel timeLabel = new JLabel();
		timeLabel.setText("TIME");
		timeLabel.setBounds(236, 0, 54, 14);
		panel_11.add(timeLabel);

		final JLabel attachClinicappointmentcardLabel = new JLabel();
		attachClinicappointmentcardLabel
				.setText("<HTML><BODY>ATTACH CLINIC <BR>APPOINTMENT<BR>CARD</BODY></HTML>");
		attachClinicappointmentcardLabel.setBounds(300, 4, 84, 42);
		panel_11.add(attachClinicappointmentcardLabel);

		final JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBounds(390, 0, 472, 57);
		panel_11.add(panel_12);

		final JLabel label_13 = new JLabel();
		label_13.setText("14. DATE OF LAST PHSICAL EXAMINATION");
		label_13.setBounds(64, 14, 222, 16);
		panel_12.add(label_13);

		dcDateOfLastPhysicalExam = new JDateChooser();
		dcDateOfLastPhysicalExam.setBounds(310, 14, 129, 20);
		panel_12.add(dcDateOfLastPhysicalExam);

		txtClinicAppointment = new JTextField();
		txtClinicAppointment.setBounds(22, 20, 104, 21);
		panel_11.add(txtClinicAppointment);

		txtTime = new JTextField();
		txtTime.setBounds(238, 20, 38, 21);
		panel_11.add(txtTime);

		dcDateOfClinicAppointment = new JDateChooser();
		dcDateOfClinicAppointment.setBounds(148, 20, 69, 20);
		panel_11.add(dcDateOfClinicAppointment);

		final JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);
		panel_13.setBounds(0, 484, 862, 53);
		panel.add(panel_13);

		final JLabel relativeOrGuardianLabel = new JLabel();
		relativeOrGuardianLabel.setText("RELATIVE OR GUARDIAN");
		relativeOrGuardianLabel.setBounds(10, 18, 139, 25);
		panel_13.add(relativeOrGuardianLabel);

		final JLabel nameLabel = new JLabel();
		nameLabel.setText("Name");
		nameLabel.setBounds(209, 0, 70, 14);
		panel_13.add(nameLabel);

		final JLabel addressLabel = new JLabel();
		addressLabel.setText("Address");
		addressLabel.setBounds(470, 0, 54, 14);
		panel_13.add(addressLabel);

		final JLabel phoneNumberLabel = new JLabel();
		phoneNumberLabel.setText("Phone Number");
		phoneNumberLabel.setBounds(742, 0, 88, 14);
		panel_13.add(phoneNumberLabel);

		txtRelativeGuardianName = new JTextField();
		txtRelativeGuardianName.setBounds(183, 20, 112, 21);
		panel_13.add(txtRelativeGuardianName);

		txtGuardianAddress = new JTextField();
		txtGuardianAddress.setBounds(343, 20, 332, 21);
		panel_13.add(txtGuardianAddress);

		txtGuardianPhoneNo = new JTextField();
		txtGuardianPhoneNo.setBounds(742, 20, 79, 21);
		panel_13.add(txtGuardianPhoneNo);

		final JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBounds(0, 536, 862, 100);
		panel.add(panel_14);

		final JLabel diagnosesAtTimeLabel = new JLabel();
		diagnosesAtTimeLabel.setText("DIAGNOSES AT TIME OF TRANSFER");
		diagnosesAtTimeLabel.setBounds(186, 3, 199, 14);
		panel_14.add(diagnosesAtTimeLabel);

		final JLabel aLabel_1 = new JLabel();
		aLabel_1.setText("(a)");
		aLabel_1.setBounds(27, 20, 14, 14);
		panel_14.add(aLabel_1);

		final JLabel primaryLabel = new JLabel();
		primaryLabel.setText("Primary");
		primaryLabel.setBounds(47, 20, 45, 14);
		panel_14.add(primaryLabel);

		final JLabel bLabel_1 = new JLabel();
		bLabel_1.setText("(b)");
		bLabel_1.setBounds(27, 54, 14, 14);
		panel_14.add(bLabel_1);

		final JLabel secondaryLabel = new JLabel();
		secondaryLabel.setText("Secondary");
		secondaryLabel.setBounds(47, 54, 54, 14);
		panel_14.add(secondaryLabel);

		txtDiagnosesTimeOfTransferPrimary = new JTextField();
		txtDiagnosesTimeOfTransferPrimary.setBounds(121, 21, 322, 21);
		panel_14.add(txtDiagnosesTimeOfTransferPrimary);

		txtDiagnosesTimeOfTransferSecondary = new JTextField();
		txtDiagnosesTimeOfTransferSecondary.setBounds(121, 51, 322, 21);
		panel_14.add(txtDiagnosesTimeOfTransferSecondary);

		final JLabel employmentRelatedLabel = new JLabel();
		employmentRelatedLabel.setText("EMPLOYMENT RELATED: ");
		employmentRelatedLabel.setBounds(569, 24, 137, 14);
		panel_14.add(employmentRelatedLabel);

		rbEmpoymentYes = new JRadioButton();
		bgEmploymentRelated.add(rbEmpoymentYes);
		rbEmpoymentYes.setBackground(Color.WHITE);
		rbEmpoymentYes.setText("YES");
		rbEmpoymentYes.setBounds(723, 19, 45, 18);
		panel_14.add(rbEmpoymentYes);

		rbEmpoymentNo = new JRadioButton();
		bgEmploymentRelated.add(rbEmpoymentNo);
		rbEmpoymentNo.setBackground(Color.WHITE);
		rbEmpoymentNo.setText("NO");
		rbEmpoymentNo.setBounds(774, 19, 77, 18);
		panel_14.add(rbEmpoymentNo);

		final JLabel isPatientLabel = new JLabel();
		isPatientLabel.setText("is Patient family aware of diagnosis ?");
		isPatientLabel.setBounds(480, 54, 225, 14);
		panel_14.add(isPatientLabel);

		rbFamilyAwareYes = new JRadioButton();
		bgFamilyAware.add(rbFamilyAwareYes);
		rbFamilyAwareYes.setBackground(Color.WHITE);
		rbFamilyAwareYes.setText("YES");
		rbFamilyAwareYes.setBounds(723, 52, 45, 18);
		panel_14.add(rbFamilyAwareYes);

		rbFamilyAwareNo = new JRadioButton();
		bgFamilyAware.add(rbFamilyAwareNo);
		rbFamilyAwareNo.setBackground(Color.WHITE);
		rbFamilyAwareNo.setText("NO");
		rbFamilyAwareNo.setBounds(774, 52, 54, 18);
		panel_14.add(rbFamilyAwareNo);

		final JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBounds(0, 635, 404, 528);
		panel.add(panel_15);

		final JLabel vitalsAtTimeLabel = new JLabel();
		vitalsAtTimeLabel.setText("VITALS AT TIME OF TRANSFER");
		vitalsAtTimeLabel.setBounds(62, 0, 166, 24);
		panel_15.add(vitalsAtTimeLabel);

		final JLabel tLabel = new JLabel();
		tLabel.setText("T");
		tLabel.setBounds(10, 33, 6, 14);
		panel_15.add(tLabel);

		txtVitalTemp = new JTextField();
		txtVitalTemp.setBounds(22, 30, 44, 21);
		panel_15.add(txtVitalTemp);

		final JLabel pLabel = new JLabel();
		pLabel.setText("P");
		pLabel.setBounds(72, 30, 15, 14);
		panel_15.add(pLabel);

		txtVitalPulse = new JTextField();
		txtVitalPulse.setBounds(97, 29, 54, 21);
		panel_15.add(txtVitalPulse);

		final JLabel rLabel = new JLabel();
		rLabel.setText("R");
		rLabel.setBounds(166, 32, 15, 14);
		panel_15.add(rLabel);

		txtVitalR = new JTextField();
		txtVitalR.setBounds(187, 30, 54, 21);
		panel_15.add(txtVitalR);

		final JLabel bpLabel = new JLabel();
		bpLabel.setText("B/P");
		bpLabel.setBounds(257, 32, 20, 14);
		panel_15.add(bpLabel);

		txtVitalBP = new JTextField();
		txtVitalBP.setBounds(283, 29, 111, 21);
		panel_15.add(txtVitalBP);

		final JLabel checkIfPresentLabel = new JLabel();
		checkIfPresentLabel.setText("Check if present)");
		checkIfPresentLabel.setBounds(27, 65, 89, 14);
		panel_15.add(checkIfPresentLabel);

		cbAmputation = new JCheckBox();
		cbAmputation.setBackground(Color.WHITE);
		cbAmputation.setText("Amputation");
		cbAmputation.setBounds(20, 105, 84, 18);
		panel_15.add(cbAmputation);

		cbParalysis = new JCheckBox();
		cbParalysis.setBackground(Color.WHITE);
		cbParalysis.setText("Paralysis");
		cbParalysis.setBounds(20, 129, 74, 18);
		panel_15.add(cbParalysis);

		cbContracture = new JCheckBox();
		cbContracture.setBackground(Color.WHITE);
		cbContracture.setText("Contracture");
		cbContracture.setBounds(22, 153, 94, 18);
		panel_15.add(cbContracture);

		cbDecubUlcer = new JCheckBox();
		cbDecubUlcer.setBackground(Color.WHITE);
		cbDecubUlcer.setText("Decub. Ulcer");
		cbDecubUlcer.setBounds(22, 177, 94, 18);
		panel_15.add(cbDecubUlcer);

		cbBladder = new JCheckBox();
		cbBladder.setBackground(Color.WHITE);
		cbBladder.setText("Bladder");
		cbBladder.setBounds(165, 105, 94, 18);
		panel_15.add(cbBladder);

		cbBowel = new JCheckBox();
		cbBowel.setBackground(Color.WHITE);
		cbBowel.setText("Bowel");
		cbBowel.setBounds(165, 129, 94, 18);
		panel_15.add(cbBowel);

		cbSaliva = new JCheckBox();
		cbSaliva.setBackground(Color.WHITE);
		cbSaliva.setText("Saliva");
		cbSaliva.setBounds(165, 153, 94, 18);
		panel_15.add(cbSaliva);

		final JLabel disablitiesLabel = new JLabel();
		disablitiesLabel.setText("Disablities");
		disablitiesLabel.setBounds(27, 85, 54, 14);
		panel_15.add(disablitiesLabel);

		final JLabel incontinenceLabel = new JLabel();
		incontinenceLabel.setText("Incontinence");
		incontinenceLabel.setBounds(151, 85, 77, 14);
		panel_15.add(incontinenceLabel);

		final JLabel disablitiesLabel_1 = new JLabel();
		disablitiesLabel_1.setText("Impairments");
		disablitiesLabel_1.setBounds(27, 233, 77, 14);
		panel_15.add(disablitiesLabel_1);

		final JLabel activityToleranceLimitationsLabel = new JLabel();
		activityToleranceLimitationsLabel
				.setText("Activity tolerance Limitations");
		activityToleranceLimitationsLabel.setBounds(128, 233, 153, 14);
		panel_15.add(activityToleranceLimitationsLabel);

		cbMental = new JCheckBox();
		cbMental.setBackground(Color.WHITE);
		cbMental.setText("Mental");
		cbMental.setBounds(22, 269, 94, 18);
		panel_15.add(cbMental);

		cbSpeech = new JCheckBox();
		cbSpeech.setBackground(Color.WHITE);
		cbSpeech.setText("Speech");
		cbSpeech.setBounds(22, 293, 94, 18);
		panel_15.add(cbSpeech);

		cbHearing = new JCheckBox();
		cbHearing.setBackground(Color.WHITE);
		cbHearing.setText("Hearing");
		cbHearing.setBounds(22, 317, 94, 18);
		panel_15.add(cbHearing);

		cbVision = new JCheckBox();
		cbVision.setBackground(Color.WHITE);
		cbVision.setText("Vision");
		cbVision.setBounds(22, 340, 94, 18);
		panel_15.add(cbVision);

		cbSensation = new JCheckBox();
		cbSensation.setBackground(Color.WHITE);
		cbSensation.setText("Sensation");
		cbSensation.setBounds(22, 364, 94, 18);
		panel_15.add(cbSensation);

		cbNone = new JCheckBox();
		cbNone.setBackground(Color.WHITE);
		cbNone.setText("None");
		cbNone.setBounds(122, 269, 86, 18);
		panel_15.add(cbNone);

		cbModerate = new JCheckBox();
		cbModerate.setBackground(Color.WHITE);
		cbModerate.setText("Moderate");
		cbModerate.setBounds(214, 268, 71, 18);
		panel_15.add(cbModerate);

		cbSevere = new JCheckBox();
		cbSevere.setBackground(Color.WHITE);
		cbSevere.setText("Severe");
		cbSevere.setBounds(300, 268, 94, 18);
		panel_15.add(cbSevere);

		final JLabel residentKnowsDiagnosisLabel = new JLabel();
		residentKnowsDiagnosisLabel.setText("Resident knows diagnosis?");
		residentKnowsDiagnosisLabel.setBounds(118, 294, 141, 14);
		panel_15.add(residentKnowsDiagnosisLabel);

		rbResidentKnewYes = new JRadioButton();
		bgResidentKnew.add(rbResidentKnewYes);
		rbResidentKnewYes.setBackground(Color.WHITE);
		rbResidentKnewYes.setText("YES");
		rbResidentKnewYes.setBounds(118, 310, 44, 18);
		panel_15.add(rbResidentKnewYes);

		rbResidentKnewNo = new JRadioButton();
		bgResidentKnew.add(rbResidentKnewNo);
		rbResidentKnewNo.setBackground(Color.WHITE);
		rbResidentKnewNo.setText("NO");
		rbResidentKnewNo.setBounds(170, 311, 44, 18);
		panel_15.add(rbResidentKnewNo);

		final JLabel potentialForRehabilitationLabel = new JLabel();
		potentialForRehabilitationLabel.setText("Potential for Rehabilitation");
		potentialForRehabilitationLabel.setBounds(118, 342, 141, 14);
		panel_15.add(potentialForRehabilitationLabel);

		cbGood = new JCheckBox();
		cbGood.setBackground(Color.WHITE);
		cbGood.setText("Good");
		cbGood.setBounds(118, 364, 54, 18);
		panel_15.add(cbGood);

		cbFair = new JCheckBox();
		cbFair.setBackground(Color.WHITE);
		cbFair.setText("Fair");
		cbFair.setBounds(175, 364, 48, 18);
		panel_15.add(cbFair);

		cbPoor = new JCheckBox();
		cbPoor.setBackground(Color.WHITE);
		cbPoor.setText("Poor");
		cbPoor.setBounds(229, 364, 44, 18);
		panel_15.add(cbPoor);

		final JLabel importantMedicalInformationLabel = new JLabel();
		importantMedicalInformationLabel
				.setText("IMPORTANT MEDICAL INFORMATION");
		importantMedicalInformationLabel.setBounds(17, 404, 191, 14);
		panel_15.add(importantMedicalInformationLabel);

		final JLabel stateAllergiesIfLabel = new JLabel();
		stateAllergiesIfLabel.setText("(State  allergies if any)");
		stateAllergiesIfLabel.setBounds(21, 424, 141, 14);
		panel_15.add(stateAllergiesIfLabel);

		final JLabel advanceDirectivesLabel = new JLabel();
		advanceDirectivesLabel.setText("ADVANCE DIRECTIVES");
		advanceDirectivesLabel.setBounds(19, 444, 132, 14);
		panel_15.add(advanceDirectivesLabel);

		rbAdvancedDirectiveYes = new JRadioButton();
		bgAdvancedDirective.add(rbAdvancedDirectiveYes);
		rbAdvancedDirectiveYes.setBackground(Color.WHITE);
		rbAdvancedDirectiveYes.setText("Yes");
		rbAdvancedDirectiveYes.setBounds(22, 464, 44, 18);
		panel_15.add(rbAdvancedDirectiveYes);

		rbAdvancedDirectiveNo = new JRadioButton();
		bgAdvancedDirective.add(rbAdvancedDirectiveNo);
		rbAdvancedDirectiveNo.setBackground(Color.WHITE);
		rbAdvancedDirectiveNo.setText("No");
		rbAdvancedDirectiveNo.setBounds(97, 464, 54, 18);
		panel_15.add(rbAdvancedDirectiveNo);

		cbCopyAttached = new JCheckBox();
		cbCopyAttached.setBackground(Color.WHITE);
		cbCopyAttached.setText("Copy attached");
		cbCopyAttached.setBounds(183, 464, 173, 18);
		panel_15.add(cbCopyAttached);

		final JLabel codeStatusLabel = new JLabel();
		codeStatusLabel.setText("CODE STATUS");
		codeStatusLabel.setBounds(22, 504, 77, 14);
		panel_15.add(codeStatusLabel);

		final JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBounds(403, 635, 459, 314);
		panel.add(panel_16);

		final JLabel dietdrugsAndOtherLabel = new JLabel();
		dietdrugsAndOtherLabel.setText("DIET,DRUGS AND OTHER THERAPY");
		dietdrugsAndOtherLabel.setBounds(161, 10, 170, 14);
		panel_16.add(dietdrugsAndOtherLabel);

		final JLabel atTimeOfLabel = new JLabel();
		atTimeOfLabel.setText("at time of Discharge");
		atTimeOfLabel.setBounds(175, 30, 109, 14);
		panel_16.add(atTimeOfLabel);

		final JLabel dietOrderLabel = new JLabel();
		dietOrderLabel.setText("Diet Order");
		dietOrderLabel.setBounds(5, 64, 56, 14);
		panel_16.add(dietOrderLabel);

		txtDietOrder = new JTextArea();
		txtDietOrder.setBorder(new LineBorder(Color.black, 1, false));
		txtDietOrder.setBounds(85, 63, 350, 204);
		panel_16.add(txtDietOrder);

		cbGenericSubstitute = new JCheckBox();
		cbGenericSubstitute.setBackground(Color.WHITE);
		cbGenericSubstitute.setText("May use generic substitutes");
		cbGenericSubstitute.setBounds(0, 273, 159, 18);
		panel_16.add(cbGenericSubstitute);

		final JLabel physicianPleaseSignLabel = new JLabel();
		physicianPleaseSignLabel.setText("(Physician, please sign below)");
		physicianPleaseSignLabel.setBounds(175, 275, 189, 14);
		panel_16.add(physicianPleaseSignLabel);

		final JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_17.setBounds(403, 948, 459, 216);
		panel.add(panel_17);

		final JLabel influenzaVaccinationDateLabel = new JLabel();
		influenzaVaccinationDateLabel.setText("Influenza vaccination: Date");
		influenzaVaccinationDateLabel.setBounds(24, 0, 139, 14);
		panel_17.add(influenzaVaccinationDateLabel);

		final JLabel pneumococcalppv23VaccinationLabel = new JLabel();
		pneumococcalppv23VaccinationLabel
				.setText("Pneumococcal(PPV 23) vaccination: Date");
		pneumococcalppv23VaccinationLabel.setBounds(4, 21, 204, 14);
		panel_17.add(pneumococcalppv23VaccinationLabel);

		final JLabel tetanustetanusdiphtheriaVaccinationDateLabel = new JLabel();
		tetanustetanusdiphtheriaVaccinationDateLabel
				.setText("Tetanus/Tetanus-Diphtheria vaccination: Date");
		tetanustetanusdiphtheriaVaccinationDateLabel.setBounds(4, 37, 258, 14);
		panel_17.add(tetanustetanusdiphtheriaVaccinationDateLabel);

		final JLabel lastBmLabel = new JLabel();
		lastBmLabel.setText("Last B.M.");
		lastBmLabel.setBounds(4, 57, 54, 14);
		panel_17.add(lastBmLabel);

		final JLabel dateLabel_1 = new JLabel();
		dateLabel_1.setText("Date:");
		dateLabel_1.setBounds(89, 57, 54, 14);
		panel_17.add(dateLabel_1);

		final JLabel tbTestLabel = new JLabel();
		tbTestLabel.setText("TB Test");
		tbTestLabel.setBounds(4, 77, 46, 14);
		panel_17.add(tbTestLabel);

		final JLabel dateLabel_2 = new JLabel();
		dateLabel_2.setText("Date");
		dateLabel_2.setBounds(89, 77, 35, 14);
		panel_17.add(dateLabel_2);

		final JLabel chestXrayLabel = new JLabel();
		chestXrayLabel.setText("Chest X-Ray");
		chestXrayLabel.setBounds(4, 97, 69, 14);
		panel_17.add(chestXrayLabel);

		final JLabel dateLabel_3 = new JLabel();
		dateLabel_3.setText("Date");
		dateLabel_3.setBounds(89, 97, 23, 14);
		panel_17.add(dateLabel_3);

		final JLabel cbcLabel = new JLabel();
		cbcLabel.setText("C.B.C.");
		cbcLabel.setBounds(4, 117, 35, 14);
		panel_17.add(cbcLabel);

		final JLabel dateLabel_4 = new JLabel();
		dateLabel_4.setText("Date");
		dateLabel_4.setBounds(89, 117, 35, 14);
		panel_17.add(dateLabel_4);

		final JLabel serologyLabel = new JLabel();
		serologyLabel.setText("Serology");
		serologyLabel.setBounds(4, 137, 54, 14);
		panel_17.add(serologyLabel);

		final JLabel dateLabel_4_1 = new JLabel();
		dateLabel_4_1.setText("Date:");
		dateLabel_4_1.setBounds(89, 137, 35, 14);
		panel_17.add(dateLabel_4_1);

		final JLabel urinalysisLabel = new JLabel();
		urinalysisLabel.setText("Urinalysis");
		urinalysisLabel.setBounds(4, 158, 69, 14);
		panel_17.add(urinalysisLabel);

		final JLabel dateLabel_4_1_1 = new JLabel();
		dateLabel_4_1_1.setText("Date:");
		dateLabel_4_1_1.setBounds(89, 158, 35, 14);
		panel_17.add(dateLabel_4_1_1);

		final JLabel dateLabel_2_1 = new JLabel();
		dateLabel_2_1.setText("Type");
		dateLabel_2_1.setBounds(210, 77, 35, 14);
		panel_17.add(dateLabel_2_1);

		final JLabel dateLabel_2_1_1 = new JLabel();
		dateLabel_2_1_1.setText("Result");
		dateLabel_2_1_1.setBounds(316, 57, 35, 14);
		panel_17.add(dateLabel_2_1_1);

		final JLabel dateLabel_2_1_2 = new JLabel();
		dateLabel_2_1_2.setText("Result");
		dateLabel_2_1_2.setBounds(210, 98, 35, 14);
		panel_17.add(dateLabel_2_1_2);

		final JLabel dateLabel_2_1_2_1 = new JLabel();
		dateLabel_2_1_2_1.setText("Result");
		dateLabel_2_1_2_1.setBounds(211, 117, 35, 14);
		panel_17.add(dateLabel_2_1_2_1);

		final JLabel dateLabel_2_1_2_2 = new JLabel();
		dateLabel_2_1_2_2.setText("Result");
		dateLabel_2_1_2_2.setBounds(212, 138, 35, 14);
		panel_17.add(dateLabel_2_1_2_2);

		final JLabel dateLabel_2_1_2_2_1 = new JLabel();
		dateLabel_2_1_2_2_1.setText("Result");
		dateLabel_2_1_2_2_1.setBounds(210, 158, 35, 14);
		panel_17.add(dateLabel_2_1_2_2_1);

		txtChestXrayResult = new JTextField();
		txtChestXrayResult.setBounds(259, 93, 163, 21);
		panel_17.add(txtChestXrayResult);

		txtCBCResult = new JTextField();
		txtCBCResult.setBounds(259, 115, 163, 21);
		panel_17.add(txtCBCResult);

		txtSerologyResult = new JTextField();
		txtSerologyResult.setBounds(259, 136, 163, 21);
		panel_17.add(txtSerologyResult);

		txtUrinalysisResult = new JTextField();
		txtUrinalysisResult.setBounds(259, 158, 163, 21);
		panel_17.add(txtUrinalysisResult);

		dcTBTest = new JDateChooser();
		dcTBTest.setBounds(113, 77, 69, 15);
		panel_17.add(dcTBTest);

		dcChestXRay = new JDateChooser();
		dcChestXRay.setBounds(113, 99, 69, 14);
		panel_17.add(dcChestXRay);

		dcCBC = new JDateChooser();
		dcCBC.setBounds(113, 118, 69, 14);
		panel_17.add(dcCBC);

		dcSerology = new JDateChooser();
		dcSerology.setBounds(113, 137, 69, 14);
		panel_17.add(dcSerology);

		dcUrinalysis = new JDateChooser();
		dcUrinalysis.setBounds(112, 158, 69, 14);
		panel_17.add(dcUrinalysis);

		final JLabel suggestionsForActiveLabel = new JLabel();
		suggestionsForActiveLabel.setText("SUGGESTIONS FOR ACTIVE CARE");
		suggestionsForActiveLabel.setBounds(8, 1171, 171, 14);
		panel.add(suggestionsForActiveLabel);

		final JLabel bedLabel = new JLabel();
		bedLabel.setText("BED");
		bedLabel.setBounds(9, 1192, 26, 14);
		panel.add(bedLabel);

		final JLabel positionInGoodLabel = new JLabel();
		positionInGoodLabel.setText("Position in good body alignment and");
		positionInGoodLabel.setBounds(8, 1212, 184, 14);
		panel.add(positionInGoodLabel);

		final JLabel chargePositionEveryLabel = new JLabel();
		chargePositionEveryLabel.setText("charge position every ");
		chargePositionEveryLabel.setBounds(8, 1232, 121, 14);
		panel.add(chargePositionEveryLabel);

		txtHours = new JTextField();
		txtHours.setBounds(120, 1232, 30, 21);
		panel.add(txtHours);

		final JLabel hrsLabel = new JLabel();
		hrsLabel.setText("hrs.");
		hrsLabel.setBounds(156, 1232, 26, 14);
		panel.add(hrsLabel);

		final JLabel avoidLabel = new JLabel();
		avoidLabel.setText("Avoid ");
		avoidLabel.setBounds(8, 1261, 41, 14);
		panel.add(avoidLabel);

		txtAvoidingPosition = new JTextField();
		txtAvoidingPosition.setBounds(41, 1258, 109, 21);
		panel.add(txtAvoidingPosition);

		final JLabel positionLabel = new JLabel();
		positionLabel.setText("position");
		positionLabel.setBounds(156, 1261, 54, 14);
		panel.add(positionLabel);

		final JLabel pronePositionLabel = new JLabel();
		pronePositionLabel.setText("Prone position ");
		pronePositionLabel.setBounds(9, 1286, 79, 14);
		panel.add(pronePositionLabel);

		txtPronePosition = new JTextField();
		txtPronePosition.setBounds(78, 1285, 41, 21);
		panel.add(txtPronePosition);

		final JLabel timesdayAsToleratedLabel = new JLabel();
		timesdayAsToleratedLabel.setText("times/day as tolerated.");
		timesdayAsToleratedLabel.setBounds(120, 1286, 121, 14);
		panel.add(timesdayAsToleratedLabel);

		final JLabel sitInChairLabel = new JLabel();
		sitInChairLabel.setText("SIT IN CHAIR");
		sitInChairLabel.setBounds(10, 1331, 79, 14);
		panel.add(sitInChairLabel);

		txtSittingHours = new JTextField();
		txtSittingHours.setBounds(9, 1351, 41, 21);
		panel.add(txtSittingHours);

		final JLabel hrsLabel_1 = new JLabel();
		hrsLabel_1.setText("hrs.");
		hrsLabel_1.setBounds(56, 1351, 26, 14);
		panel.add(hrsLabel_1);

		txtSittingTimesAday = new JTextField();
		txtSittingTimesAday.setBounds(78, 1351, 54, 21);
		panel.add(txtSittingTimesAday);

		final JLabel timesdayLabel = new JLabel();
		timesdayLabel.setText("times/day");
		timesdayLabel.setBounds(138, 1354, 54, 14);
		panel.add(timesdayLabel);

		final JLabel weightBearingLabel = new JLabel();
		weightBearingLabel.setText("WEIGHT BEARING");
		weightBearingLabel.setBounds(298, 1192, 94, 14);
		panel.add(weightBearingLabel);

		final JLabel fullLabel = new JLabel();
		fullLabel.setText("Full");
		fullLabel.setBounds(271, 1212, 26, 14);
		panel.add(fullLabel);

		txtWeightBearingFull = new JTextField();
		txtWeightBearingFull.setBounds(300, 1209, 79, 21);
		panel.add(txtWeightBearingFull);

		final JLabel partialLabel = new JLabel();
		partialLabel.setText("Partial");
		partialLabel.setBounds(385, 1212, 30, 14);
		panel.add(partialLabel);

		txtWeightBearingPartial = new JTextField();
		txtWeightBearingPartial.setBounds(421, 1209, 79, 21);
		panel.add(txtWeightBearingPartial);

		final JLabel noneLabel = new JLabel();
		noneLabel.setText("None");
		noneLabel.setBounds(505, 1212, 30, 14);
		panel.add(noneLabel);

		final JLabel onLabel = new JLabel();
		onLabel.setText("on");
		onLabel.setBounds(271, 1234, 26, 14);
		panel.add(onLabel);

		txtOnLeg = new JTextField();
		txtOnLeg.setBounds(298, 1232, 79, 21);
		panel.add(txtOnLeg);

		final JLabel noneLabel_1 = new JLabel();
		noneLabel_1.setText("Leg.");
		noneLabel_1.setBounds(385, 1232, 30, 14);
		panel.add(noneLabel_1);

		final JLabel locomotionLabel = new JLabel();
		locomotionLabel.setText("LOCOMOTION");
		locomotionLabel.setBounds(271, 1286, 79, 14);
		panel.add(locomotionLabel);

		final JLabel walkLabel = new JLabel();
		walkLabel.setText("Walk");
		walkLabel.setBounds(271, 1306, 41, 14);
		panel.add(walkLabel);

		txtWalkingTimesAday = new JTextField();
		txtWalkingTimesAday.setBounds(298, 1303, 117, 21);
		panel.add(txtWalkingTimesAday);

		final JLabel timesdayLabel_1 = new JLabel();
		timesdayLabel_1.setText("times/day.");
		timesdayLabel_1.setBounds(421, 1306, 54, 14);
		panel.add(timesdayLabel_1);

		final JLabel exercisesLabel = new JLabel();
		exercisesLabel.setText("EXERCISES");
		exercisesLabel.setBounds(271, 1331, 62, 14);
		panel.add(exercisesLabel);

		final JLabel rangeOfMotionLabel = new JLabel();
		rangeOfMotionLabel.setText("Range of motion");
		rangeOfMotionLabel.setBounds(271, 1354, 86, 14);
		panel.add(rangeOfMotionLabel);

		txtRangeOfMotion = new JTextField();
		txtRangeOfMotion.setBounds(353, 1351, 79, 21);
		panel.add(txtRangeOfMotion);

		final JLabel timesdayLabel_2 = new JLabel();
		timesdayLabel_2.setText("times/day.");
		timesdayLabel_2.setBounds(438, 1354, 62, 14);
		panel.add(timesdayLabel_2);

		final JLabel toLabel = new JLabel();
		toLabel.setText("to");
		toLabel.setBounds(271, 1374, 26, 14);
		panel.add(toLabel);

		txtPlaceOfExercise = new JTextField();
		txtPlaceOfExercise.setBounds(286, 1374, 214, 21);
		panel.add(txtPlaceOfExercise);

		final JLabel byResidentLabel = new JLabel();
		byResidentLabel.setText("by resident");
		byResidentLabel.setBounds(578, 1192, 71, 14);
		panel.add(byResidentLabel);

		final JLabel otherAsOutlinedLabel = new JLabel();
		otherAsOutlinedLabel.setText("Other as outlined below");
		otherAsOutlinedLabel.setBounds(578, 1212, 121, 14);
		panel.add(otherAsOutlinedLabel);

		txtByResident = new JTextField();
		txtByResident.setBounds(636, 1189, 121, 21);
		panel.add(txtByResident);

		final JLabel nurseFamilyLabel = new JLabel();
		nurseFamilyLabel.setText("nurse family");
		nurseFamilyLabel.setBounds(763, 1192, 79, 14);
		panel.add(nurseFamilyLabel);

		txtOtherOutLined = new JTextField();
		txtOtherOutLined.setBounds(705, 1211, 137, 21);
		panel.add(txtOtherOutLined);

		final JLabel standLabel = new JLabel();
		standLabel.setText("Stand");
		standLabel.setBounds(578, 1237, 54, 14);
		panel.add(standLabel);

		txtStand = new JTextField();
		txtStand.setBounds(609, 1236, 79, 21);
		panel.add(txtStand);

		final JLabel minLabel = new JLabel();
		minLabel.setText("Min.");
		minLabel.setBounds(689, 1239, 26, 14);
		panel.add(minLabel);

		txtMinTimesDay = new JTextField();
		txtMinTimesDay.setBounds(712, 1237, 54, 21);
		panel.add(txtMinTimesDay);

		final JLabel timesdayLabel_3 = new JLabel();
		timesdayLabel_3.setText("times/day");
		timesdayLabel_3.setBounds(771, 1239, 54, 14);
		panel.add(timesdayLabel_3);

		final JLabel socialActivitiesLabel = new JLabel();
		socialActivitiesLabel.setText("SOCIAL ACTIVITIES");
		socialActivitiesLabel.setBounds(578, 1286, 121, 14);
		panel.add(socialActivitiesLabel);

		final JLabel encourageGroupLabel = new JLabel();

		encourageGroupLabel.setText("Encourage group");
		encourageGroupLabel.setBounds(578, 1306, 86, 14);
		panel.add(encourageGroupLabel);

		txtEncourageGroup = new JTextField();
		txtEncourageGroup.setBounds(670, 1303, 30, 21);
		panel.add(txtEncourageGroup);

		final JLabel individualLabel = new JLabel();
		individualLabel.setText("individual");
		individualLabel.setBounds(705, 1306, 54, 14);
		panel.add(individualLabel);

		txtIndividual = new JTextField();
		txtIndividual.setBounds(752, 1303, 90, 21);
		panel.add(txtIndividual);

		final JLabel withinLabel = new JLabel();
		withinLabel.setText("within");
		withinLabel.setBounds(578, 1331, 41, 14);
		panel.add(withinLabel);

		txtWithin = new JTextField();
		txtWithin.setBounds(625, 1328, 54, 21);
		panel.add(txtWithin);

		final JLabel outsideLabel = new JLabel();
		outsideLabel.setText("outside");
		outsideLabel.setBounds(689, 1331, 41, 14);
		panel.add(outsideLabel);

		txtOutside = new JTextField();
		txtOutside.setBounds(729, 1328, 54, 21);
		panel.add(txtOutside);

		final JLabel homeLabel = new JLabel();
		homeLabel.setText("home");
		homeLabel.setBounds(789, 1331, 54, 14);
		panel.add(homeLabel);

		final JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.WHITE);
		panel_18.setLayout(null);
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setBounds(582, 1381, 255, 50);
		panel.add(panel_18);

		final JLabel transportambulanceLabel = new JLabel();
		transportambulanceLabel.setText("Transport");
		transportambulanceLabel.setBounds(10, 8, 64, 14);
		panel_18.add(transportambulanceLabel);

		rbCar = new JRadioButton();
		bgTransport.add(rbCar);
		rbCar.setBackground(Color.WHITE);
		rbCar.setText("Car");
		rbCar.setBounds(147, 28, 38, 14);
		panel_18.add(rbCar);

		rbCarForHandicappedLabel = new JRadioButton();
		bgTransport.add(rbCarForHandicappedLabel);
		rbCarForHandicappedLabel.setBackground(Color.WHITE);
		rbCarForHandicappedLabel.setText("Car for handicapped");
		rbCarForHandicappedLabel.setBounds(3, 28, 127, 14);
		panel_18.add(rbCarForHandicappedLabel);

		rbBus = new JRadioButton();
		bgTransport.add(rbBus);
		rbBus.setBackground(Color.WHITE);
		rbBus.setText("Bus");
		rbBus.setBounds(206, 28, 39, 14);
		panel_18.add(rbBus);

		rbAmbulance = new JRadioButton();
		bgTransport.add(rbAmbulance);
		rbAmbulance.setBackground(Color.WHITE);
		rbAmbulance.setText("Ambulance");
		rbAmbulance.setBounds(104, 6, 106, 18);
		panel_18.add(rbAmbulance);

		final JLabel signatureOfPhysicianLabel = new JLabel();
		signatureOfPhysicianLabel.setText("Signature of physician or Nurse");
		signatureOfPhysicianLabel.setBounds(17, 1483, 162, 14);
		panel.add(signatureOfPhysicianLabel);

		txtNurseSignature = new JTextField();
		txtNurseSignature.setBounds(185, 1480, 162, 21);
		panel.add(txtNurseSignature);

		final JLabel dateLabel_5 = new JLabel();
		dateLabel_5.setText("Date");
		dateLabel_5.setBounds(406, 1483, 41, 14);
		panel.add(dateLabel_5);

		dcDateTransfer = new JDateChooser();
		dcDateTransfer.setBounds(486, 1476, 194, 21);
		panel.add(dcDateTransfer);

		doUpdate();
	}

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {

		ResidentTransferForm refResidentTransferForm = new ResidentTransferForm();
		refResidentTransferForm.setResidentId(Global.currentResidenceKey);

		refResidentTransferForm
				.setSerial(Global.currentResidentTransferFormKey);
		refResidentTransferForm.setFormId(Global.currentMsjnKey);
		refResidentTransferForm.setTransport(SwingUtils
				.getSelectedButton(bgTransport));
		refResidentTransferForm.setAdvancedDirective(SwingUtils
				.getSelectedButton(bgAdvancedDirective));
		refResidentTransferForm.setResidentKnew(SwingUtils
				.getSelectedButton(bgResidentKnew));
		refResidentTransferForm.setFamilyAware(SwingUtils
				.getSelectedButton(bgFamilyAware));
		refResidentTransferForm.setNurseSignature(txtNurseSignature.getText());
		refResidentTransferForm
				.setPlaceOfExercise(txtPlaceOfExercise.getText());
		refResidentTransferForm.setRangeOfMotion(txtRangeOfMotion.getText());
		refResidentTransferForm.setSittingTimesAday(txtSittingTimesAday
				.getText());
		refResidentTransferForm.setSittingHours(txtSittingHours.getText());
		refResidentTransferForm.setOutside(txtOutside.getText());
		refResidentTransferForm.setWithin(txtWithin.getText());
		refResidentTransferForm.setIndividual(txtIndividual.getText());
		refResidentTransferForm.setEncourageGroup(txtEncourageGroup.getText());
		refResidentTransferForm.setWalkingTimesAday(txtWalkingTimesAday
				.getText());
		refResidentTransferForm.setPronePosition(txtPronePosition.getText());
		refResidentTransferForm.setAvoidingPosition(txtAvoidingPosition
				.getText());
		refResidentTransferForm.setMinTimesDay(txtMinTimesDay.getText());
		refResidentTransferForm.setStand(txtStand.getText());
		refResidentTransferForm.setOtherOutLined(txtOtherOutLined.getText());
		refResidentTransferForm.setOnLeg(txtOnLeg.getText());
		refResidentTransferForm.setByResident(txtByResident.getText());
		refResidentTransferForm.setWeightBearingPartial(txtWeightBearingPartial
				.getText());
		refResidentTransferForm.setWeightBearingFull(txtWeightBearingFull
				.getText());
		refResidentTransferForm.setHours(txtHours.getText());
		refResidentTransferForm.setUrinalysisResult(txtUrinalysisResult
				.getText());
		refResidentTransferForm.setSerologyResult(txtSerologyResult.getText());
		refResidentTransferForm.setCBCResult(txtCBCResult.getText());
		refResidentTransferForm
				.setChestXrayResult(txtChestXrayResult.getText());
		refResidentTransferForm.setCopyAttached(cbCopyAttached.isSelected());
		refResidentTransferForm.setPoor(cbPoor.isSelected());
		refResidentTransferForm.setFair(cbFair.isSelected());
		refResidentTransferForm.setGood(cbGood.isSelected());
		refResidentTransferForm.setSensation(cbSensation.isSelected());
		refResidentTransferForm.setVision(cbVision.isSelected());
		refResidentTransferForm.setHearing(cbHearing.isSelected());
		refResidentTransferForm.setSpeech(cbSpeech.isSelected());
		refResidentTransferForm.setSevere(cbSevere.isSelected());
		refResidentTransferForm.setModerate(cbModerate.isSelected());
		refResidentTransferForm.setNone(cbNone.isSelected());
		refResidentTransferForm.setMental(cbMental.isSelected());
		refResidentTransferForm.setSaliva(cbSaliva.isSelected());
		refResidentTransferForm.setBowel(cbBowel.isSelected());
		refResidentTransferForm.setBladder(cbBladder.isSelected());
		refResidentTransferForm.setDecubUlcer(cbDecubUlcer.isSelected());
		refResidentTransferForm.setContracture(cbContracture.isSelected());
		refResidentTransferForm.setParalysis(cbParalysis.isSelected());
		refResidentTransferForm.setAmputation(cbAmputation.isSelected());
		refResidentTransferForm.setDietOrder(txtDietOrder.getText());
		refResidentTransferForm.setVitalBP(txtVitalBP.getText());
		refResidentTransferForm.setVitalR(txtVitalR.getText());
		refResidentTransferForm.setVitalPulse(txtVitalPulse.getText());
		refResidentTransferForm.setVitalTemp(txtVitalTemp.getText());
		refResidentTransferForm
				.setDiagnosesTimeOfTransferSecondary(txtDiagnosesTimeOfTransferSecondary
						.getText());
		refResidentTransferForm
				.setDiagnosesTimeOfTransferPrimary(txtDiagnosesTimeOfTransferPrimary
						.getText());
		refResidentTransferForm
				.setGuardianPhoneNo(txtGuardianPhoneNo.getText());
		refResidentTransferForm
				.setGuardianAddress(txtGuardianAddress.getText());
		refResidentTransferForm.setRelativeGuardianName(txtRelativeGuardianName
				.getText());
		refResidentTransferForm.setTime(txtTime.getText());
		refResidentTransferForm.setClinicAppointment(txtClinicAppointment
				.getText());
		refResidentTransferForm
				.setNameAndAddressHospital(txtNameAndAddressHospital.getText());
		refResidentTransferForm.setNameAndAddress(txtNameAndAddress.getText());
		refResidentTransferForm.setOtherExplain(cbOtherExplain.isSelected());
		refResidentTransferForm.setEmployer(cbEmployer.isSelected());
		refResidentTransferForm.setPrivateInsurance(cbPrivateInsurance
				.isSelected());
		refResidentTransferForm.setPublicAgency(cbPublicAgency.isSelected());
		refResidentTransferForm.setBlueCross(cbBlueCross.isSelected());
		refResidentTransferForm.setSelfOrFamily(cbSelfOrFamily.isSelected());
		refResidentTransferForm.setFacilityName(txtFacilityName.getText());
		refResidentTransferForm.setReligion(txtReligion.getText());
		refResidentTransferForm
				.setResidentAddress(txtResidentAddress.getText());
		refResidentTransferForm
				.setHealthInsuranceClaimNumber(txtHealthInsuranceClaimNumber
						.getText());
		refResidentTransferForm.setMI(txtMI.getText());
		refResidentTransferForm.setResidentFirstName(txtResidentFirstName
				.getText());
		refResidentTransferForm.setResidentLastName(txtResidentLastName
				.getText());
		refResidentTransferForm.setEmploymentRelated(SwingUtils
				.getSelectedButton(bgEmploymentRelated));
		refResidentTransferForm.setPhysicianCare(SwingUtils
				.getSelectedButton(bgPhysicianCare));
		refResidentTransferForm.setDateTransfer(dcDateTransfer.getDate());
		refResidentTransferForm.setUrinalysis(dcUrinalysis.getDate());
		refResidentTransferForm.setSerologyDate(dcSerology.getDate());
		refResidentTransferForm.setCBCDate(dcCBC.getDate());
		refResidentTransferForm.setChestXRay(dcChestXRay.getDate());
		refResidentTransferForm.setTBTest(dcTBTest.getDate());
		refResidentTransferForm
				.setDateOfLastPhysicalExam(dcDateOfLastPhysicalExam.getDate());
		refResidentTransferForm
				.setDateOfClinicAppointment(dcDateOfClinicAppointment.getDate());
		refResidentTransferForm.setDateOfDischarge(dcDateOfDischarge.getDate());
		refResidentTransferForm.setDateOfAdmission(dcDateOfAdmission.getDate());
		refResidentTransferForm.setDateOfTransfer(dcDateOfTransfer.getDate());
		refResidentTransferForm.setDateOfBirth(dcDateOfBirth.getDate());
		refResidentTransferForm.setResidentSex(SwingUtils
				.getSelectedButton(bgResidentSex));
		refResidentTransferForm.setGenericSubstitute(cbGenericSubstitute
				.isSelected());

		try {
			Global.currentResidentTransferFormKey = MedrexClientManager
					.getInstance().insertOrUpdateResidentTransferForm(
							refResidentTransferForm);
		} catch (Exception e) {
		}
		return Global.currentResidentTransferFormKey;
	}

	public void doUpdate() {

		ResidentTransferForm refResidentTransferForm = null;
		if (Global.currentMsjnKey != 0) {
			try {
				refResidentTransferForm = MedrexClientManager.getInstance()
						.getResidentTransferForm(Global.currentMsjnKey);
			} catch (Exception e) {

				e.printStackTrace();
			}
			Global.currentResidentTransferFormKey = refResidentTransferForm
					.getSerial();
			SwingUtils.setSelectedButton(bgTransport, refResidentTransferForm
					.getTransport());
			SwingUtils.setSelectedButton(bgAdvancedDirective,
					refResidentTransferForm.getAdvancedDirective());
			SwingUtils.setSelectedButton(bgResidentKnew,
					refResidentTransferForm.getResidentKnew());
			SwingUtils.setSelectedButton(bgFamilyAware, refResidentTransferForm
					.getFamilyAware());
			txtNurseSignature.setText(refResidentTransferForm
					.getNurseSignature());
			txtPlaceOfExercise.setText(refResidentTransferForm
					.getPlaceOfExercise());
			txtRangeOfMotion
					.setText(refResidentTransferForm.getRangeOfMotion());
			txtSittingTimesAday.setText(refResidentTransferForm
					.getSittingTimesAday());
			txtSittingHours.setText(refResidentTransferForm.getSittingHours());
			txtOutside.setText(refResidentTransferForm.getOutside());
			txtWithin.setText(refResidentTransferForm.getWithin());
			txtIndividual.setText(refResidentTransferForm.getIndividual());
			txtEncourageGroup.setText(refResidentTransferForm
					.getEncourageGroup());
			txtWalkingTimesAday.setText(refResidentTransferForm
					.getWalkingTimesAday());
			txtPronePosition
					.setText(refResidentTransferForm.getPronePosition());
			txtAvoidingPosition.setText(refResidentTransferForm
					.getAvoidingPosition());
			txtMinTimesDay.setText(refResidentTransferForm.getMinTimesDay());
			txtStand.setText(refResidentTransferForm.getStand());
			txtOtherOutLined
					.setText(refResidentTransferForm.getOtherOutLined());
			txtOnLeg.setText(refResidentTransferForm.getOnLeg());
			txtByResident.setText(refResidentTransferForm.getByResident());
			txtWeightBearingPartial.setText(refResidentTransferForm
					.getWeightBearingPartial());
			txtWeightBearingFull.setText(refResidentTransferForm
					.getWeightBearingFull());
			txtHours.setText(refResidentTransferForm.getHours());
			txtUrinalysisResult.setText(refResidentTransferForm
					.getUrinalysisResult());
			txtSerologyResult.setText(refResidentTransferForm
					.getSerologyResult());
			txtCBCResult.setText(refResidentTransferForm.getCBCResult());
			txtChestXrayResult.setText(refResidentTransferForm
					.getChestXrayResult());
			cbCopyAttached
					.setSelected(refResidentTransferForm.isCopyAttached());
			cbPoor.setSelected(refResidentTransferForm.isPoor());
			cbFair.setSelected(refResidentTransferForm.isFair());
			cbGood.setSelected(refResidentTransferForm.isGood());
			cbSensation.setSelected(refResidentTransferForm.isSensation());
			cbVision.setSelected(refResidentTransferForm.isVision());
			cbHearing.setSelected(refResidentTransferForm.isHearing());
			cbSpeech.setSelected(refResidentTransferForm.isSpeech());
			cbSevere.setSelected(refResidentTransferForm.isSevere());
			cbModerate.setSelected(refResidentTransferForm.isModerate());
			cbNone.setSelected(refResidentTransferForm.isNone());
			cbMental.setSelected(refResidentTransferForm.isMental());
			cbSaliva.setSelected(refResidentTransferForm.isSaliva());
			cbBowel.setSelected(refResidentTransferForm.isBowel());
			cbBladder.setSelected(refResidentTransferForm.isBladder());
			cbDecubUlcer.setSelected(refResidentTransferForm.isDecubUlcer());
			cbContracture.setSelected(refResidentTransferForm.isContracture());
			cbParalysis.setSelected(refResidentTransferForm.isParalysis());
			cbAmputation.setSelected(refResidentTransferForm.isAmputation());
			txtDietOrder.setText(refResidentTransferForm.getDietOrder());
			txtVitalBP.setText(refResidentTransferForm.getVitalBP());
			txtVitalR.setText(refResidentTransferForm.getVitalR());
			txtVitalPulse.setText(refResidentTransferForm.getVitalPulse());
			txtVitalTemp.setText(refResidentTransferForm.getVitalTemp());
			txtDiagnosesTimeOfTransferSecondary.setText(refResidentTransferForm
					.getDiagnosesTimeOfTransferSecondary());
			txtDiagnosesTimeOfTransferPrimary.setText(refResidentTransferForm
					.getDiagnosesTimeOfTransferPrimary());
			txtGuardianPhoneNo.setText(refResidentTransferForm
					.getGuardianPhoneNo());
			txtGuardianAddress.setText(refResidentTransferForm
					.getGuardianAddress());
			txtRelativeGuardianName.setText(refResidentTransferForm
					.getRelativeGuardianName());
			txtTime.setText(refResidentTransferForm.getTime());
			txtClinicAppointment.setText(refResidentTransferForm
					.getClinicAppointment());
			txtNameAndAddressHospital.setText(refResidentTransferForm
					.getNameAndAddressHospital());
			txtNameAndAddress.setText(refResidentTransferForm
					.getNameAndAddress());
			cbOtherExplain
					.setSelected(refResidentTransferForm.isOtherExplain());
			cbEmployer.setSelected(refResidentTransferForm.isEmployer());
			cbPrivateInsurance.setSelected(refResidentTransferForm
					.isPrivateInsurance());
			cbPublicAgency
					.setSelected(refResidentTransferForm.isPublicAgency());
			cbBlueCross.setSelected(refResidentTransferForm.isBlueCross());
			cbSelfOrFamily
					.setSelected(refResidentTransferForm.isSelfOrFamily());
			txtFacilityName.setText(refResidentTransferForm.getFacilityName());
			txtReligion.setText(refResidentTransferForm.getReligion());
			txtResidentAddress.setText(refResidentTransferForm
					.getResidentAddress());
			txtHealthInsuranceClaimNumber.setText(refResidentTransferForm
					.getHealthInsuranceClaimNumber());
			txtMI.setText(refResidentTransferForm.getMI());
			txtResidentFirstName.setText(refResidentTransferForm
					.getResidentFirstName());
			txtResidentLastName.setText(refResidentTransferForm
					.getResidentLastName());
			SwingUtils.setSelectedButton(bgEmploymentRelated,
					refResidentTransferForm.getEmploymentRelated());
			SwingUtils.setSelectedButton(bgPhysicianCare,
					refResidentTransferForm.getPhysicianCare());
			dcDateTransfer.setDate(refResidentTransferForm.getDateTransfer());
			dcUrinalysis.setDate(refResidentTransferForm.getUrinalysis());
			dcSerology.setDate(refResidentTransferForm.getSerologyDate());
			dcCBC.setDate(refResidentTransferForm.getCBCDate());
			dcChestXRay.setDate(refResidentTransferForm.getChestXRay());
			dcTBTest.setDate(refResidentTransferForm.getTBTest());
			dcDateOfLastPhysicalExam.setDate(refResidentTransferForm
					.getDateOfLastPhysicalExam());
			dcDateOfClinicAppointment.setDate(refResidentTransferForm
					.getDateOfClinicAppointment());
			dcDateOfDischarge.setDate(refResidentTransferForm
					.getDateOfDischarge());
			dcDateOfAdmission.setDate(refResidentTransferForm
					.getDateOfAdmission());
			dcDateOfTransfer.setDate(refResidentTransferForm
					.getDateOfTransfer());
			dcDateOfBirth.setDate(refResidentTransferForm.getDateOfBirth());
			SwingUtils.setSelectedButton(bgResidentSex, refResidentTransferForm
					.getResidentSex());
			cbGenericSubstitute.setSelected(refResidentTransferForm
					.isGenericSubstitute());
		}

	}

	public boolean doValidate() {

		return true;
	}

}
