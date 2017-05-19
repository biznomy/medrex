package medrex.client.main.ptOtSt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.resident.diagnosis.FrameResidentDiagnosisConfirm;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.NursingHome;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.ptOtSt.PtOtStSpeechLanguage;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxRichTextField;
import com.sX.swing.notes.JxNotes;
import com.toedter.calendar.JDateChooser;

public class PanelPtOtStSpeechLanguage extends JPanel {

	private JComboBox cmbFrequency;
	private ButtonGroup bgFollowCom = new ButtonGroup();
	private JxRichTextField txtEvalOtherField;
	private JCheckBox cbHearingAidedLeft;
	private JCheckBox cbHearingAidedRight;
	private JxNotes txtRecommendationImp;
	private JCheckBox cbSpeechExpressiveAbility;
	private JCheckBox cbSpeechIntelligibility;
	private JCheckBox cbSpeechFluency;
	private JLabel evaluationLabel_1;
	private JLabel physicianNameLabel_10;
	private JLabel physicianNameLabel_9;
	private JLabel physicianNameLabel_8;
	private JLabel physicianNameLabel_7;
	private JTextField txtRecNaField;
	private JCheckBox cbRecNa;
	private JCheckBox cbRecPatientParticipatedIn;
	private JxNotes txtEvalOtherComments;
	private JPanel panel_113;
	private JxRichTextField txtEvalOtherImpaired;
	private JPanel panel_112;
	private JxRichTextField txtEvalOtherWfl;
	private JPanel panel_111;
	private JLabel feedingLabel_14;
	private JPanel panel_105;
	private JxNotes txtVoiceComments;
	private JPanel panel_104;
	private JxRichTextField txtVoiceImpaired;
	private JPanel panel_103;
	private JxRichTextField txtVoiceWfl;
	private JPanel panel_102;
	private JLabel feedingLabel_13;
	private JPanel panel_96;
	private JxNotes txtOralMotorComments;
	private JPanel panel_95;
	private JxRichTextField txtOralMotorImpaired;
	private JPanel panel_94;
	private JxRichTextField txtOralMotorWfl;
	private JPanel panel_93;
	private JLabel feedingLabel_12;
	private JPanel panel_87;
	private JxNotes txtSpeechComments;
	private JPanel panel_86;
	private JxRichTextField txtSpeechImpaired;
	private JPanel panel_85;
	private JxRichTextField txtSpeechWfl;
	private JPanel panel_84;
	private JLabel feedingLabel_11;
	private JPanel panel_78;
	private JxNotes txtComprehensionComments;
	private JPanel panel_77;
	private JxRichTextField txtComprehensionImpaired;
	private JPanel panel_76;
	private JxRichTextField txtComprehensionWfl;
	private JPanel panel_75;
	private JLabel feedingLabel_3;
	private JPanel panel_69;
	private JxNotes txtHearingAidedComments;
	private JPanel panel_67;
	private JxRichTextField txtHearingAidedImpaired;
	private JPanel panel_62;
	private JxRichTextField txtHearingAidedWfl;
	private JPanel panel_57;
	private JLabel feedingLabel_1;
	private JPanel panel_27;
	private JTextField txtPlanOfCareOther;
	private JLabel sensoryReeducationPainLabel_1;
	private JCheckBox cbSpeechEvalHmo;
	private JLabel label_1;
	private JLabel ageLabel_23;
	private JRadioButton rbFollowComMultiStep;
	private JRadioButton rbrbFollowCom2Step;
	private JRadioButton rbFollowCom1Step;
	private JRadioButton rbFollowComTactileCuesNeeded;
	private JLabel circleOneLabel_12;
	private JLabel ageLabel_22;
	private JCheckBox cbCognitionAphasia;
	private JCheckBox cbCognitionDecreasedVision;
	private JCheckBox cbCognitionOrientedX123;
	private JCheckBox cbCognitionAlert;
	private JLabel circleOneLabel_11;
	private JxNotes txtCognitionComments;
	private JxNotes txtVerbalComments;
	private JxRichTextField txtCognitionImpaired;
	private JCheckBox cbVerbalImpaired;
	private JxRichTextField txtCognitionWfl;
	private JCheckBox cbVerbalWfl;
	private JLabel circleOneLabel_10;
	private JPanel panel_68;
	private JPanel panel_66;
	private JPanel panel_65;
	private JPanel panel_64;
	private JPanel panel_63;
	private JPanel panel_61;
	private JLabel feedingLabel_10;
	private JPanel panel_60;
	private JPanel panel_59;
	private JPanel panel_58;
	private JPanel panel_56;
	private JLabel feedingLabel_9;
	private JPanel panel_55;
	private JPanel panel_54;
	private JLabel feedingLabel_2;
	private JLabel feedingLabel;
	private JPanel panel_28;
	private JPanel panel_26;
	private JPanel panel_24;
	private JPanel panel_23;
	private JPanel panel_22;
	private JComboBox cmbSignatureTherapy;
	private JLabel evaluationLabel;
	private JxRichTextField txtInitialAssessmentRecentTherapyNaField;
	private JCheckBox cbInitialAssessmentRecentTherapyNa;
	private JLabel ageLabel_7;
	private JxRichTextField txtInitialAssessmentPrecautions;
	private JLabel ageLabel_6;
	private JTextField txtInitialAssessmentPtGoal;
	private JLabel ageLabel_5;
	private JxRichTextField txtInitialAssessmentPmh;
	private JLabel ageLabel_4;
	private JxNotes txtInitialAssessmentPlof;
	private JLabel ageLabel_3;
	private JxNotes txtReasonForReferral;
	private JLabel circleOneLabel_1;
	private JLabel resonForReferralhistoryLabel;
	private ButtonGroup bgRehabPot = new ButtonGroup();
	private JRadioButton rbRehabPotGood;
	private JRadioButton rbRehabPotVeryGood;
	private JRadioButton rbRehabPotExcellent;
	private JLabel circleOneLabel;
	private JLabel ageLabel_2;
	private JxRichTextField txtInitialAssessmentRefBy;
	private JLabel ageLabel_1;
	private JTextField txtInitialAssessmentAge;
	private JLabel ageLabel;
	private JLabel label_15;
	private JPanel panel_20;
	private JLabel shortTermGoalsLabel_4;
	private JLabel physicianNameLabel_6;
	private JPanel panel_21;
	private JDateChooser dcCertificationThroughDate;
	private JDateChooser dcCertificationFromDate;
	private JLabel physicianNameLabel_5;
	private JLabel physicianNameLabel_4;
	private JLabel physicianNameLabel_3;
	private JPanel panel_19;
	private JComboBox cmbCertifyPhysicianSign;
	private JLabel physicianNameLabel_2;
	private JDateChooser dcCertifyPhysicianDate;
	private JLabel physicianNameLabel_1;
	private JTextField txtCertifyPhysicianName;
	private JLabel physicianNameLabel;
	private JTextArea textArea_3;
	private JLabel label_14;
	private JPanel panel_18;
	private JxNotes txtPlanOfTreatmentLongTerm;
	private JLabel shortTermGoalsLabel_3;
	private JTextField txtPlanOfTreatmentLongTermWks;
	private JLabel shortTermGoalsLabel_2;
	private JxNotes txtPlanOfTreatmentShortTerm;
	private JLabel shortTermGoalsLabel_1;
	private JTextField txtPlanOfTreatmentShortTermWks;
	private JLabel shortTermGoalsLabel;
	private JLabel label_12;
	private JPanel panel_5;
	private JDateChooser dcSocDate;
	private JDateChooser dcOnsetDate;
	private JTextField txtPrimaryDiagnosis;
	private JLabel label_13;
	private JLabel pertinentMedicalDxLabel;
	private JxRichTextField txtTreatmentDiagnosis;
	private JLabel label_11;
	private JPanel panel_17;
	private JLabel label_10;
	private JPanel panel_16;
	private JLabel label_9;
	private JPanel panel_15;
	private JPanel panel_14;
	private JCheckBox cbHospitalizationNa;
	private JDateChooser dcHospitalizationToDate;
	private JDateChooser dcHospitalizationFromDate;
	private JLabel fromLabel_1;
	private JLabel fromLabel;
	private JLabel label_8;
	private JPanel panel_13;
	private JLabel label_7;
	private JPanel panel_12;
	private JLabel label_6;
	private JPanel panel_11;
	private JTextField txtProviderName;
	private JLabel label_5;
	private JPanel panel_10;
	private JPanel panel_9;
	private JTextField txtHicn;
	private JLabel label_4;
	private JPanel panel_8;
	private JTextField txtNpiNo;
	private JLabel label_3;
	private JPanel panel_7;
	private JTextField txt$PatientFirsttName;
	private JLabel label_2;
	private JPanel panel_6;
	private JTextField txt$PatientLastName;
	private JPanel panel_4;
	private JLabel label;
	private JPanel panel_3;
	private JxRichTextField txtSpeechEvalOtherField;
	private JCheckBox cbSpeechEvalOther;
	private JCheckBox cbSpeechEvalPartA;
	private JCheckBox cbSpeechEvalPartB;
	private JLabel hcfa700FormLabel_1;
	private JLabel hcfa700FormLabel;
	private JPanel panel_2;
	private JPanel panel_1;
	private JPanel panel;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelPtOtStSpeechLanguage() {
		super();
		Global.panelPtOtStSpeechLanguage = this;
		setPreferredSize(new Dimension(900, 1230));
		setBackground(Color.WHITE);
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(10, 57, 850, 1134);
		add(panel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(1, 1, 848, 442);
		panel.add(panel_1);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 850, 48);
		panel_1.add(panel_3);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 200, 47);
		panel_3.add(panel_4);

		label = new JLabel();
		label.setBounds(3, 3, 170, 14);
		panel_4.add(label);
		label.setText("1. PATIENT'S LAST NAME");

		txt$PatientLastName = new JTextField();
		txt$PatientLastName.setBounds(3, 23, 195, 21);
		panel_4.add(txt$PatientLastName);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(199, 0, 293, 47);
		panel_3.add(panel_6);

		label_2 = new JLabel();
		label_2.setText("2. FIRST NAME");
		label_2.setBounds(3, 3, 106, 14);
		panel_6.add(label_2);

		txt$PatientFirsttName = new JTextField();
		txt$PatientFirsttName.setBounds(3, 23, 280, 21);
		panel_6.add(txt$PatientFirsttName);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(491, 0, 159, 47);
		panel_3.add(panel_7);

		label_3 = new JLabel();
		label_3.setText("3. NPI #");
		label_3.setBounds(3, 3, 122, 14);
		panel_7.add(label_3);

		txtNpiNo = new JTextField();
		txtNpiNo.setBounds(3, 23, 139, 21);
		txtNpiNo.setEnabled(false);
		panel_7.add(txtNpiNo);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(649, 0, 200, 47);
		panel_3.add(panel_8);

		label_4 = new JLabel();
		label_4.setText("4. HICN");
		label_4.setBounds(3, 3, 109, 14);
		panel_8.add(label_4);

		txtHicn = new JTextField();
		txtHicn.setBounds(3, 23, 146, 21);
		txtHicn.setEnabled(false);
		panel_8.add(txtHicn);

		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 47, 850, 48);
		panel_1.add(panel_9);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 0, 200, 47);
		panel_9.add(panel_10);

		label_5 = new JLabel();
		label_5.setText("5. PROVIDER NAME");
		label_5.setBounds(3, 3, 109, 14);
		panel_10.add(label_5);

		txtProviderName = new JTextField();
		txtProviderName.setBounds(3, 23, 195, 21);
		panel_10.add(txtProviderName);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(199, 0, 293, 47);
		panel_9.add(panel_11);

		label_6 = new JLabel();
		label_6.setText("6. PRIOR HOSPITALIZATION DATES");
		label_6.setBounds(3, 3, 181, 14);
		panel_11.add(label_6);

		fromLabel = new JLabel();
		fromLabel.setText("FROM");
		fromLabel.setBounds(3, 23, 29, 14);
		panel_11.add(fromLabel);

		fromLabel_1 = new JLabel();
		fromLabel_1.setText("TO");
		fromLabel_1.setBounds(133, 24, 14, 14);
		panel_11.add(fromLabel_1);

		dcHospitalizationFromDate = new JDateChooser();
		dcHospitalizationFromDate.setDateFormatString("MM/dd/yyyy");
		dcHospitalizationFromDate.setBounds(36, 20, 92, 23);
		panel_11.add(dcHospitalizationFromDate);

		dcHospitalizationToDate = new JDateChooser();
		dcHospitalizationToDate.setDateFormatString("MM/dd/yyyy");
		dcHospitalizationToDate.setBounds(150, 20, 92, 23);
		panel_11.add(dcHospitalizationToDate);

		cbHospitalizationNa = new JCheckBox();
		cbHospitalizationNa.setBackground(Color.WHITE);
		cbHospitalizationNa.setText("N/A");
		cbHospitalizationNa.setBounds(247, 21, 36, 18);
		panel_11.add(cbHospitalizationNa);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(491, 0, 159, 47);
		panel_9.add(panel_12);

		label_7 = new JLabel();
		label_7.setText("7. ONSET DATE");
		label_7.setBounds(3, 3, 134, 14);
		panel_12.add(label_7);

		dcOnsetDate = new JDateChooser();
		dcOnsetDate.setDateFormatString("MM/dd/yyyy");
		dcOnsetDate.setBounds(3, 20, 92, 23);
		panel_12.add(dcOnsetDate);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(649, 0, 200, 47);
		panel_9.add(panel_13);

		label_8 = new JLabel();
		label_8.setText("8.SOC. DTAE");
		label_8.setBounds(3, 3, 123, 14);
		panel_13.add(label_8);

		dcSocDate = new JDateChooser();
		dcSocDate.setDateFormatString("MM/dd/yyyy");
		dcSocDate.setBounds(3, 20, 92, 23);
		panel_13.add(dcSocDate);

		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 94, 850, 48);
		panel_1.add(panel_14);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(0, 0, 200, 47);
		panel_14.add(panel_15);

		label_9 = new JLabel();
		label_9.setText("9. FREQUENCY & DURATION");
		label_9.setBounds(3, 3, 170, 14);
		panel_15.add(label_9);

		cmbFrequency = new JComboBox();
		cmbFrequency.setBackground(Color.WHITE);
		cmbFrequency.setModel(new DefaultComboBoxModel(new String[] {
				"3-5 Weeks", "5-6 Weeks" }));
		cmbFrequency.setBounds(3, 20, 192, 23);
		panel_15.add(cmbFrequency);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(199, 0, 293, 47);
		panel_14.add(panel_16);

		final JButton btnDiagnosis = new JButton();
		btnDiagnosis.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				(FrameFactory
						.createWindowOfType(FrameResidentDiagnosisConfirm.class))
						.setVisible(true);
				updateDiagnosis();
			}
		});
		btnDiagnosis.setBounds(246, 24, 31, 20);
		panel_16.add(btnDiagnosis);
		btnDiagnosis.setText("+");

		label_10 = new JLabel();
		label_10.setText("10.PRIMARY DIAGNOSIS(");
		label_10.setBounds(3, 3, 124, 14);
		panel_16.add(label_10);

		pertinentMedicalDxLabel = new JLabel();
		pertinentMedicalDxLabel.setFont(new Font("", Font.PLAIN, 10));
		pertinentMedicalDxLabel.setText("pertinent medical DX");
		pertinentMedicalDxLabel.setBounds(128, 3, 103, 14);
		panel_16.add(pertinentMedicalDxLabel);

		label_13 = new JLabel();
		label_13.setText(")");
		label_13.setBounds(230, 4, 9, 14);
		panel_16.add(label_13);

		txtPrimaryDiagnosis = new JTextField();
		txtPrimaryDiagnosis.setBounds(3, 23, 237, 20);
		panel_16.add(txtPrimaryDiagnosis);

		panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(491, 0, 358, 47);
		panel_14.add(panel_17);

		label_11 = new JLabel();
		label_11.setText("11.TREATMENT DIAGNOSIS");
		label_11.setBounds(3, 3, 190, 14);
		panel_17.add(label_11);

		txtTreatmentDiagnosis = new JxRichTextField();
		txtTreatmentDiagnosis.setArc(0.1f);
		txtTreatmentDiagnosis.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtTreatmentDiagnosis.setRichTextFieldModel(txtTreatmentDiagnosis,
				"Speech Therapy: TreatmentDiagnosis");
		txtTreatmentDiagnosis.setBounds(3, 23, 344, 21);
		panel_17.add(txtTreatmentDiagnosis);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 141, 421, 301);
		panel_1.add(panel_5);

		label_12 = new JLabel();
		label_12.setFont(new Font("", Font.BOLD, 12));
		label_12.setText("12. PLAN OF TREATMENT FUNCTIONAL GOALS");
		label_12.setBounds(3, 3, 261, 14);
		panel_5.add(label_12);

		shortTermGoalsLabel = new JLabel();
		shortTermGoalsLabel.setFont(new Font("", Font.BOLD, 11));
		shortTermGoalsLabel.setText("Short Term Goals (For ");
		shortTermGoalsLabel.setBounds(3, 23, 125, 14);
		panel_5.add(shortTermGoalsLabel);

		txtPlanOfTreatmentShortTermWks = new JTextField();
		txtPlanOfTreatmentShortTermWks.setBounds(128, 23, 81, 20);
		panel_5.add(txtPlanOfTreatmentShortTermWks);

		shortTermGoalsLabel_1 = new JLabel();
		shortTermGoalsLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_1.setText("wks)");
		shortTermGoalsLabel_1.setBounds(212, 25, 28, 14);
		panel_5.add(shortTermGoalsLabel_1);

		Notes defaultPlanShort = new Notes();
		defaultPlanShort.setFormName("Speech Therapy");
		defaultPlanShort.setUserId(Global.currentLoggedInUserKey);
		defaultPlanShort.setNoteText("");

		txtPlanOfTreatmentShortTerm = new JxNotes(isCategories);
		txtPlanOfTreatmentShortTerm.setNotes(defaultPlanShort);
		txtPlanOfTreatmentShortTerm.setBorder(new LineBorder(Color.black, 1,
				false));
		txtPlanOfTreatmentShortTerm.setBounds(3, 45, 408, 88);
		panel_5.add(txtPlanOfTreatmentShortTerm);

		shortTermGoalsLabel_2 = new JLabel();
		shortTermGoalsLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_2.setText("Long Term Goals (For");
		shortTermGoalsLabel_2.setBounds(3, 135, 120, 14);
		panel_5.add(shortTermGoalsLabel_2);

		txtPlanOfTreatmentLongTermWks = new JTextField();
		txtPlanOfTreatmentLongTermWks.setBounds(125, 135, 81, 20);
		panel_5.add(txtPlanOfTreatmentLongTermWks);

		shortTermGoalsLabel_3 = new JLabel();
		shortTermGoalsLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_3.setText("wks)");
		shortTermGoalsLabel_3.setBounds(210, 135, 28, 14);
		panel_5.add(shortTermGoalsLabel_3);

		Notes defaultPlanLong = new Notes();
		defaultPlanLong.setFormName("Speech Therapy");
		defaultPlanLong.setUserId(Global.currentLoggedInUserKey);
		defaultPlanLong.setNoteText("");

		txtPlanOfTreatmentLongTerm = new JxNotes(isCategories);
		txtPlanOfTreatmentLongTerm.setNotes(defaultPlanLong);
		txtPlanOfTreatmentLongTerm.setBorder(new LineBorder(Color.black, 1,
				false));
		txtPlanOfTreatmentLongTerm.setBounds(3, 157, 408, 88);
		panel_5.add(txtPlanOfTreatmentLongTerm);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.LIGHT_GRAY);
		panel_21.setBounds(0, 253, 421, 48);
		panel_5.add(panel_21);

		physicianNameLabel_6 = new JLabel();
		physicianNameLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_6.setText("15. SIGNATURE");
		physicianNameLabel_6.setBounds(3, 3, 85, 14);
		panel_21.add(physicianNameLabel_6);

		shortTermGoalsLabel_4 = new JLabel();
		shortTermGoalsLabel_4.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_4
				.setText("(therapy signature/ discipline/ license#)");
		shortTermGoalsLabel_4.setBounds(94, 2, 224, 14);
		panel_21.add(shortTermGoalsLabel_4);

		cmbSignatureTherapy = new JComboBox();
		cmbSignatureTherapy.setBackground(Color.LIGHT_GRAY);
		cmbSignatureTherapy.setBounds(3, 23, 301, 21);
		panel_21.add(cmbSignatureTherapy);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setBackground(Color.WHITE);
		panel_18.setLayout(null);
		panel_18.setBounds(420, 141, 428, 150);
		panel_1.add(panel_18);

		label_14 = new JLabel();
		label_14.setFont(new Font("Dialog", Font.BOLD, 12));
		label_14.setText("13.  PLAN OF CARE");
		label_14.setBounds(3, 3, 159, 14);
		panel_18.add(label_14);

		sensoryReeducationPainLabel_1 = new JLabel();
		sensoryReeducationPainLabel_1
				.setFont(new Font("Dialog", Font.BOLD, 12));
		sensoryReeducationPainLabel_1.setText("OTHER:");
		sensoryReeducationPainLabel_1.setBounds(25, 125, 42, 14);
		panel_18.add(sensoryReeducationPainLabel_1);

		txtPlanOfCareOther = new JTextField();
		txtPlanOfCareOther.setBounds(73, 127, 346, 20);
		panel_18.add(txtPlanOfCareOther);

		physicianNameLabel_7 = new JLabel();
		physicianNameLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_7.setText("SKILLED STIMULATION FOR:");
		physicianNameLabel_7.setBounds(25, 30, 167, 14);
		panel_18.add(physicianNameLabel_7);

		physicianNameLabel_8 = new JLabel();
		physicianNameLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_8
				.setText("RECEPTIVE LANGUAGE SKILLS     EXPRESSIVE LANGUAGE SKILLS    ");
		physicianNameLabel_8.setBounds(25, 55, 380, 14);
		panel_18.add(physicianNameLabel_8);

		physicianNameLabel_9 = new JLabel();
		physicianNameLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_9
				.setText("VERBAL APRAXIA     ORAL APRAXIA     DYSARTHRIA");
		physicianNameLabel_9.setBounds(25, 80, 370, 14);
		panel_18.add(physicianNameLabel_9);

		physicianNameLabel_10 = new JLabel();
		physicianNameLabel_10.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_10
				.setText("COGNITIVE / LINGGUISTIC TASKS     MEMORY / SEQUENCING");
		physicianNameLabel_10.setBounds(25, 105, 370, 14);
		panel_18.add(physicianNameLabel_10);

		textArea_3 = new JTextArea();
		textArea_3.setFocusable(false);
		textArea_3.setEditable(false);
		textArea_3.setFont(new Font("", Font.BOLD, 12));
		textArea_3
				.setText("14. I CERTIFY THE NEED FOR THESE SERVICES FURNISHED UNDER THIS PLAN OF TREATMENT WHILE UNDER MY CARE.");
		textArea_3.setWrapStyleWord(true);
		textArea_3.setLineWrap(true);
		textArea_3.setBounds(424, 295, 417, 32);
		panel_1.add(textArea_3);

		physicianNameLabel = new JLabel();
		physicianNameLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel.setText("PHYSICIAN NAME:");
		physicianNameLabel.setBounds(424, 340, 100, 14);
		panel_1.add(physicianNameLabel);

		txtCertifyPhysicianName = new JTextField();
		txtCertifyPhysicianName.setBounds(535, 340, 177, 20);
		panel_1.add(txtCertifyPhysicianName);

		physicianNameLabel_1 = new JLabel();
		physicianNameLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_1.setText("DATE:");
		physicianNameLabel_1.setBounds(715, 340, 39, 14);
		panel_1.add(physicianNameLabel_1);

		dcCertifyPhysicianDate = new JDateChooser();
		dcCertifyPhysicianDate.setDateFormatString("MM/dd/yyyy");
		dcCertifyPhysicianDate.setBounds(755, 340, 92, 23);
		panel_1.add(dcCertifyPhysicianDate);

		physicianNameLabel_2 = new JLabel();
		physicianNameLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_2.setText("PHYSICIAN SIGNATURE:");
		physicianNameLabel_2.setBounds(424, 365, 132, 14);
		panel_1.add(physicianNameLabel_2);

		cmbCertifyPhysicianSign = new JComboBox();
		cmbCertifyPhysicianSign.setBackground(Color.WHITE);
		cmbCertifyPhysicianSign.setBounds(567, 365, 177, 20);
		panel_1.add(cmbCertifyPhysicianSign);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setBackground(Color.LIGHT_GRAY);
		panel_19.setLayout(null);
		panel_19.setBounds(420, 394, 429, 48);
		panel_1.add(panel_19);

		physicianNameLabel_3 = new JLabel();
		physicianNameLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_3.setText("16. CERTIFICATION");
		physicianNameLabel_3.setBounds(3, 3, 115, 14);
		panel_19.add(physicianNameLabel_3);

		physicianNameLabel_4 = new JLabel();
		physicianNameLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_4.setText("FROM");
		physicianNameLabel_4.setBounds(5, 23, 41, 14);
		panel_19.add(physicianNameLabel_4);

		physicianNameLabel_5 = new JLabel();
		physicianNameLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_5.setText("THROUGH");
		physicianNameLabel_5.setBounds(165, 23, 56, 14);
		panel_19.add(physicianNameLabel_5);

		dcCertificationFromDate = new JDateChooser();
		dcCertificationFromDate.setDateFormatString("MM/dd/yyyy");
		dcCertificationFromDate.setDate(MedrexClientManager.getServerTime());
		dcCertificationFromDate.setBounds(49, 23, 102, 23);
		dcCertificationFromDate
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(final PropertyChangeEvent evt) {
						Calendar cal = Calendar.getInstance();
						cal.setTime(dcCertificationFromDate.getDate());
						cal.add(cal.MONTH, 1);
						dcCertificationThroughDate.setDate(cal.getTime());
					}
				});

		panel_19.add(dcCertificationFromDate);

		dcCertificationThroughDate = new JDateChooser();
		dcCertificationThroughDate.setDateFormatString("MM/dd/yyyy");
		dcCertificationThroughDate.setBounds(232, 23, 102, 23);
		panel_19.add(dcCertificationThroughDate);

		panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		panel_20.setLayout(null);
		panel_20.setBounds(2, 450, 847, 214);
		panel.add(panel_20);

		label_15 = new JLabel();
		label_15.setFont(new Font("Dialog", Font.BOLD, 12));
		label_15.setText("17. INITIAL ASSESSMENT");
		label_15.setBounds(3, 3, 141, 14);
		panel_20.add(label_15);

		ageLabel = new JLabel();
		ageLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel.setText("AGE:");
		ageLabel.setBounds(3, 23, 26, 14);
		panel_20.add(ageLabel);

		txtInitialAssessmentAge = new JTextField();
		txtInitialAssessmentAge.setBounds(31, 23, 67, 20);
		panel_20.add(txtInitialAssessmentAge);

		ageLabel_1 = new JLabel();
		ageLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_1.setText("M/F REFERRED BY:");
		ageLabel_1.setBounds(104, 23, 102, 14);
		panel_20.add(ageLabel_1);

		txtInitialAssessmentRefBy = new JxRichTextField();
		txtInitialAssessmentRefBy.setArc(0.1f);
		txtInitialAssessmentRefBy.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentRefBy.setRichTextFieldModel(
				txtInitialAssessmentRefBy,
				"Speech Therapy: InitialAssessmentRefBy");
		txtInitialAssessmentRefBy.setBounds(212, 23, 170, 20);
		panel_20.add(txtInitialAssessmentRefBy);

		ageLabel_2 = new JLabel();
		ageLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_2.setText("REHAB POT:");
		ageLabel_2.setBounds(388, 25, 70, 14);
		panel_20.add(ageLabel_2);

		circleOneLabel = new JLabel();
		circleOneLabel.setFont(new Font("", Font.BOLD, 11));
		circleOneLabel.setText("(circle one)");
		circleOneLabel.setBounds(461, 25, 67, 14);
		panel_20.add(circleOneLabel);

		rbRehabPotExcellent = new JRadioButton();
		rbRehabPotExcellent.setActionCommand("1");
		bgRehabPot.add(rbRehabPotExcellent);
		rbRehabPotExcellent.setFont(new Font("", Font.BOLD, 11));
		rbRehabPotExcellent.setBackground(Color.WHITE);
		rbRehabPotExcellent.setText("Excellent");
		rbRehabPotExcellent.setBounds(534, 25, 75, 18);
		panel_20.add(rbRehabPotExcellent);

		rbRehabPotVeryGood = new JRadioButton();
		rbRehabPotVeryGood.setActionCommand("2");
		bgRehabPot.add(rbRehabPotVeryGood);
		rbRehabPotVeryGood.setFont(new Font("", Font.BOLD, 11));
		rbRehabPotVeryGood.setBackground(Color.WHITE);
		rbRehabPotVeryGood.setText("Very Good");
		rbRehabPotVeryGood.setBounds(615, 25, 88, 18);
		panel_20.add(rbRehabPotVeryGood);

		rbRehabPotGood = new JRadioButton();
		rbRehabPotGood.setActionCommand("3");
		bgRehabPot.add(rbRehabPotGood);
		rbRehabPotGood.setFont(new Font("", Font.BOLD, 11));
		rbRehabPotGood.setBackground(Color.WHITE);
		rbRehabPotGood.setText("Good");
		rbRehabPotGood.setBounds(709, 25, 67, 18);
		panel_20.add(rbRehabPotGood);

		resonForReferralhistoryLabel = new JLabel();
		resonForReferralhistoryLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		resonForReferralhistoryLabel
				.setText("RESON FOR REFERRAL/HISTORY OF PRESENT ILLNESS");
		resonForReferralhistoryLabel.setBounds(3, 49, 306, 14);
		panel_20.add(resonForReferralhistoryLabel);

		circleOneLabel_1 = new JLabel();
		circleOneLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_1.setText("(Justification for treatment services)");
		circleOneLabel_1.setBounds(315, 49, 213, 14);
		panel_20.add(circleOneLabel_1);

		Notes reasonForRef = new Notes();
		reasonForRef.setFormName("Speech Therapy");
		reasonForRef.setUserId(Global.currentLoggedInUserKey);
		reasonForRef.setNoteText("");

		txtReasonForReferral = new JxNotes(isCategories);
		txtReasonForReferral.setNotes(reasonForRef);
		txtReasonForReferral.setBorder(new LineBorder(Color.black, 1, false));
		txtReasonForReferral.setBounds(3, 69, 834, 65);
		panel_20.add(txtReasonForReferral);

		ageLabel_3 = new JLabel();
		ageLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_3.setText("PLOF:");
		ageLabel_3.setBounds(3, 140, 35, 14);
		panel_20.add(ageLabel_3);

		Notes defaultNotesInitialAssessmentPlof = new Notes();
		defaultNotesInitialAssessmentPlof.setFormName("Speech Therapy");
		defaultNotesInitialAssessmentPlof
				.setUserId(Global.currentLoggedInUserKey);
		defaultNotesInitialAssessmentPlof.setNoteText("");

		txtInitialAssessmentPlof = new JxNotes(isCategories);
		txtInitialAssessmentPlof.setNotes(defaultNotesInitialAssessmentPlof);
		txtInitialAssessmentPlof.setBounds(44, 140, 372, 20);
		panel_20.add(txtInitialAssessmentPlof);

		ageLabel_4 = new JLabel();
		ageLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_4.setText("PMH/COMPLEXITIES:");
		ageLabel_4.setBounds(422, 140, 120, 14);
		panel_20.add(ageLabel_4);

		txtInitialAssessmentPmh = new JxRichTextField();
		txtInitialAssessmentPmh.setArc(0.1f);
		txtInitialAssessmentPmh.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentPmh.setRichTextFieldModel(txtInitialAssessmentPmh,
				"Speech Therapy: InitialAssessmentPmh");
		txtInitialAssessmentPmh.setBounds(548, 140, 289, 20);
		panel_20.add(txtInitialAssessmentPmh);

		ageLabel_5 = new JLabel();
		ageLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_5.setText("Pt GOAL:");
		ageLabel_5.setBounds(3, 163, 57, 14);
		panel_20.add(ageLabel_5);

		txtInitialAssessmentPtGoal = new JTextField();
		txtInitialAssessmentPtGoal.setBounds(65, 163, 372, 20);
		panel_20.add(txtInitialAssessmentPtGoal);

		ageLabel_6 = new JLabel();
		ageLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_6.setText("PRECAUTIONS:");
		ageLabel_6.setBounds(447, 163, 88, 14);
		panel_20.add(ageLabel_6);

		txtInitialAssessmentPrecautions = new JxRichTextField();
		txtInitialAssessmentPrecautions.setArc(0.1f);
		txtInitialAssessmentPrecautions.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentPrecautions.setRichTextFieldModel(
				txtInitialAssessmentPrecautions,
				"Speech Therapy: InitialAssessmentPrecautions");
		txtInitialAssessmentPrecautions.setBounds(548, 163, 289, 20);
		panel_20.add(txtInitialAssessmentPrecautions);

		ageLabel_7 = new JLabel();
		ageLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_7.setText("RECENT THERAPY SERVICES: D/C Dates/Status");
		ageLabel_7.setBounds(3, 186, 266, 14);
		panel_20.add(ageLabel_7);

		cbInitialAssessmentRecentTherapyNa = new JCheckBox();
		cbInitialAssessmentRecentTherapyNa.setFont(new Font("", Font.BOLD, 12));
		cbInitialAssessmentRecentTherapyNa.setBackground(Color.WHITE);
		cbInitialAssessmentRecentTherapyNa.setText("N/A");
		cbInitialAssessmentRecentTherapyNa.setBounds(307, 186, 37, 18);
		panel_20.add(cbInitialAssessmentRecentTherapyNa);

		txtInitialAssessmentRecentTherapyNaField = new JxRichTextField();
		txtInitialAssessmentRecentTherapyNaField.setArc(0.1f);
		txtInitialAssessmentRecentTherapyNaField
				.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtInitialAssessmentRecentTherapyNaField.setRichTextFieldModel(
				txtInitialAssessmentRecentTherapyNaField,
				"Speech Therapy: InitialAssessmentRecentTherapyNa");
		txtInitialAssessmentRecentTherapyNaField.setBounds(350, 186, 487, 20);
		panel_20.add(txtInitialAssessmentRecentTherapyNaField);

		evaluationLabel = new JLabel();
		evaluationLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		evaluationLabel.setText("  EVALUATION:");
		evaluationLabel.setBounds(3, 675, 87, 20);
		panel.add(evaluationLabel);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setBackground(Color.WHITE);
		panel_22.setLayout(null);
		panel_22.setBounds(0, 730, 850, 245);
		panel.add(panel_22);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setBackground(Color.WHITE);
		panel_23.setLayout(null);
		panel_23.setBounds(0, 0, 191, 245);
		panel_22.add(panel_23);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setBackground(Color.WHITE);
		panel_24.setLayout(null);
		panel_24.setBounds(0, 0, 191, 23);
		panel_23.add(panel_24);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(0, 22, 191, 23);
		panel_23.add(panel_26);

		feedingLabel = new JLabel();
		feedingLabel.setFont(new Font("", Font.BOLD, 11));
		feedingLabel.setText("Verbal Ability");
		feedingLabel.setBounds(3, 3, 92, 14);
		panel_26.add(feedingLabel);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 44, 191, 23);
		panel_23.add(panel_28);

		feedingLabel_2 = new JLabel();
		feedingLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_2.setText("Cognition");
		feedingLabel_2.setBounds(3, 3, 69, 14);
		panel_28.add(feedingLabel_2);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(0, 66, 191, 39);
		panel_23.add(panel_27);

		feedingLabel_1 = new JLabel();
		feedingLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_1.setText("Hearing (aided)");
		feedingLabel_1.setBounds(3, 3, 83, 14);
		panel_27.add(feedingLabel_1);

		cbHearingAidedRight = new JCheckBox();
		cbHearingAidedRight.setFont(new Font("", Font.BOLD, 11));
		cbHearingAidedRight.setBackground(Color.WHITE);
		cbHearingAidedRight.setText("Right");
		cbHearingAidedRight.setBounds(118, 2, 68, 14);
		panel_27.add(cbHearingAidedRight);

		cbHearingAidedLeft = new JCheckBox();
		cbHearingAidedLeft.setFont(new Font("", Font.BOLD, 11));
		cbHearingAidedLeft.setBackground(Color.WHITE);
		cbHearingAidedLeft.setText("Left");
		cbHearingAidedLeft.setBounds(118, 17, 63, 14);
		panel_27.add(cbHearingAidedLeft);

		panel_69 = new JPanel();
		panel_69.setBorder(new LineBorder(Color.black, 1, false));
		panel_69.setLayout(null);
		panel_69.setBackground(Color.WHITE);
		panel_69.setBounds(0, 104, 191, 23);
		panel_23.add(panel_69);

		feedingLabel_3 = new JLabel();
		feedingLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_3.setText("Comprehension");
		feedingLabel_3.setBounds(3, 4, 99, 14);
		panel_69.add(feedingLabel_3);

		panel_78 = new JPanel();
		panel_78.setBorder(new LineBorder(Color.black, 1, false));
		panel_78.setLayout(null);
		panel_78.setBackground(Color.WHITE);
		panel_78.setBounds(0, 126, 191, 53);
		panel_23.add(panel_78);

		feedingLabel_11 = new JLabel();
		feedingLabel_11.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_11.setText("SPEECH:");
		feedingLabel_11.setBounds(3, 4, 44, 14);
		panel_78.add(feedingLabel_11);

		cbSpeechFluency = new JCheckBox();
		cbSpeechFluency.setFont(new Font("", Font.BOLD, 11));
		cbSpeechFluency.setBackground(Color.WHITE);
		cbSpeechFluency.setText("Fluency");
		cbSpeechFluency.setBounds(55, 3, 94, 14);
		panel_78.add(cbSpeechFluency);

		cbSpeechIntelligibility = new JCheckBox();
		cbSpeechIntelligibility.setFont(new Font("", Font.BOLD, 11));
		cbSpeechIntelligibility.setBackground(Color.WHITE);
		cbSpeechIntelligibility.setText("Intelligibility");
		cbSpeechIntelligibility.setBounds(55, 20, 94, 14);
		panel_78.add(cbSpeechIntelligibility);

		cbSpeechExpressiveAbility = new JCheckBox();
		cbSpeechExpressiveAbility.setFont(new Font("", Font.BOLD, 11));
		cbSpeechExpressiveAbility.setBackground(Color.WHITE);
		cbSpeechExpressiveAbility.setText("Expressive Ability");
		cbSpeechExpressiveAbility.setBounds(55, 35, 117, 14);
		panel_78.add(cbSpeechExpressiveAbility);

		panel_87 = new JPanel();
		panel_87.setBorder(new LineBorder(Color.black, 1, false));
		panel_87.setLayout(null);
		panel_87.setBackground(Color.WHITE);
		panel_87.setBounds(0, 178, 191, 23);
		panel_23.add(panel_87);

		feedingLabel_12 = new JLabel();
		feedingLabel_12.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_12.setText("Oral Motor Abilities");
		feedingLabel_12.setBounds(5, 4, 115, 14);
		panel_87.add(feedingLabel_12);

		panel_96 = new JPanel();
		panel_96.setBorder(new LineBorder(Color.black, 1, false));
		panel_96.setLayout(null);
		panel_96.setBackground(Color.WHITE);
		panel_96.setBounds(0, 200, 191, 23);
		panel_23.add(panel_96);

		feedingLabel_13 = new JLabel();
		feedingLabel_13.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_13.setText("Voice");
		feedingLabel_13.setBounds(3, 3, 48, 14);
		panel_96.add(feedingLabel_13);

		panel_105 = new JPanel();
		panel_105.setBorder(new LineBorder(Color.black, 1, false));
		panel_105.setLayout(null);
		panel_105.setBackground(Color.WHITE);
		panel_105.setBounds(0, 222, 191, 23);
		panel_23.add(panel_105);

		feedingLabel_14 = new JLabel();
		feedingLabel_14.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_14.setText("Other");
		feedingLabel_14.setBounds(5, 4, 39, 14);
		panel_105.add(feedingLabel_14);

		txtEvalOtherField = new JxRichTextField();
		txtEvalOtherField.setArc(0.1f);
		txtEvalOtherField.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalOtherField.setRichTextFieldModel(txtEvalOtherField,
				"Speech Therapy: EvalOtherField");
		txtEvalOtherField.setBounds(50, 3, 131, 18);
		panel_105.add(txtEvalOtherField);

		panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(Color.black, 1, false));
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(190, 0, 153, 245);
		panel_22.add(panel_54);

		panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(Color.black, 1, false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(0, 0, 153, 23);
		panel_54.add(panel_55);

		feedingLabel_9 = new JLabel();
		feedingLabel_9.setFont(new Font("Dialog", Font.BOLD, 14));
		feedingLabel_9.setText("WFL");
		feedingLabel_9.setBounds(53, 3, 37, 17);
		panel_55.add(feedingLabel_9);

		panel_56 = new JPanel();
		panel_56.setBorder(new LineBorder(Color.black, 1, false));
		panel_56.setLayout(null);
		panel_56.setBackground(Color.WHITE);
		panel_56.setBounds(0, 22, 153, 23);
		panel_54.add(panel_56);

		cbVerbalWfl = new JCheckBox();
		cbVerbalWfl.setBackground(Color.WHITE);
		cbVerbalWfl.setBounds(60, 2, 23, 18);
		panel_56.add(cbVerbalWfl);

		panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(Color.black, 1, false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(0, 44, 153, 23);
		panel_54.add(panel_58);

		txtCognitionWfl = new JxRichTextField();
		txtCognitionWfl.setArc(0.1f);
		txtCognitionWfl.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtCognitionWfl.setRichTextFieldModel(txtCognitionWfl,
				"Speech Therapy: CognitionWfl");
		txtCognitionWfl.setBounds(3, 2, 140, 18);
		panel_58.add(txtCognitionWfl);

		panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(Color.black, 1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(0, 66, 153, 39);
		panel_54.add(panel_57);

		txtHearingAidedWfl = new JxRichTextField();
		txtHearingAidedWfl.setArc(0.1f);
		txtHearingAidedWfl.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtHearingAidedWfl.setRichTextFieldModel(txtHearingAidedWfl,
				"Speech Therapy: HearingAidedWfl");
		txtHearingAidedWfl.setBounds(3, 3, 140, 18);
		panel_57.add(txtHearingAidedWfl);

		panel_75 = new JPanel();
		panel_75.setBorder(new LineBorder(Color.black, 1, false));
		panel_75.setLayout(null);
		panel_75.setBackground(Color.WHITE);
		panel_75.setBounds(0, 104, 153, 23);
		panel_54.add(panel_75);

		txtComprehensionWfl = new JxRichTextField();
		txtComprehensionWfl.setArc(0.1f);
		txtComprehensionWfl
				.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtComprehensionWfl.setRichTextFieldModel(txtComprehensionWfl,
				"Speech Therapy: ComprehensionWfl");
		txtComprehensionWfl.setBounds(3, 2, 140, 18);
		panel_75.add(txtComprehensionWfl);

		panel_84 = new JPanel();
		panel_84.setBorder(new LineBorder(Color.black, 1, false));
		panel_84.setLayout(null);
		panel_84.setBackground(Color.WHITE);
		panel_84.setBounds(0, 126, 153, 53);
		panel_54.add(panel_84);

		txtSpeechWfl = new JxRichTextField();
		txtSpeechWfl.setArc(0.1f);
		txtSpeechWfl.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtSpeechWfl.setRichTextFieldModel(txtSpeechWfl,
				"Speech Therapy: SpeechWfl");
		txtSpeechWfl.setBounds(3, 3, 140, 18);
		panel_84.add(txtSpeechWfl);

		panel_93 = new JPanel();
		panel_93.setBorder(new LineBorder(Color.black, 1, false));
		panel_93.setLayout(null);
		panel_93.setBackground(Color.WHITE);
		panel_93.setBounds(0, 178, 153, 23);
		panel_54.add(panel_93);

		txtOralMotorWfl = new JxRichTextField();
		txtOralMotorWfl.setArc(0.1f);
		txtOralMotorWfl.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtOralMotorWfl.setRichTextFieldModel(txtOralMotorWfl,
				"Speech Therapy: OralMotorWfl");
		txtOralMotorWfl.setBounds(3, 3, 140, 18);
		panel_93.add(txtOralMotorWfl);

		panel_102 = new JPanel();
		panel_102.setBorder(new LineBorder(Color.black, 1, false));
		panel_102.setLayout(null);
		panel_102.setBackground(Color.WHITE);
		panel_102.setBounds(0, 200, 153, 23);
		panel_54.add(panel_102);

		txtVoiceWfl = new JxRichTextField();
		txtVoiceWfl.setArc(0.1f);
		txtVoiceWfl.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtVoiceWfl.setRichTextFieldModel(txtVoiceWfl,
				"Speech Therapy: VoiceWfl");
		txtVoiceWfl.setBounds(3, 3, 140, 18);
		panel_102.add(txtVoiceWfl);

		panel_111 = new JPanel();
		panel_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_111.setLayout(null);
		panel_111.setBackground(Color.WHITE);
		panel_111.setBounds(0, 222, 153, 23);
		panel_54.add(panel_111);

		txtEvalOtherWfl = new JxRichTextField();
		txtEvalOtherWfl.setArc(0.1f);
		txtEvalOtherWfl.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalOtherWfl.setRichTextFieldModel(txtEvalOtherWfl,
				"Speech Therapy: EvalOtherWfl");
		txtEvalOtherWfl.setBounds(3, 3, 140, 18);
		panel_111.add(txtEvalOtherWfl);

		panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(Color.black, 1, false));
		panel_59.setLayout(null);
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(342, 0, 183, 245);
		panel_22.add(panel_59);

		panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(Color.black, 1, false));
		panel_60.setLayout(null);
		panel_60.setBackground(Color.WHITE);
		panel_60.setBounds(0, 0, 183, 23);
		panel_59.add(panel_60);

		feedingLabel_10 = new JLabel();
		feedingLabel_10.setFont(new Font("Dialog", Font.BOLD, 14));
		feedingLabel_10.setText("IMPAIRED");
		feedingLabel_10.setBounds(46, 3, 77, 14);
		panel_60.add(feedingLabel_10);

		panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(Color.black, 1, false));
		panel_61.setLayout(null);
		panel_61.setBackground(Color.WHITE);
		panel_61.setBounds(0, 22, 183, 23);
		panel_59.add(panel_61);

		cbVerbalImpaired = new JCheckBox();
		cbVerbalImpaired.setBackground(Color.WHITE);
		cbVerbalImpaired.setBounds(77, 2, 23, 18);
		panel_61.add(cbVerbalImpaired);

		panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(Color.black, 1, false));
		panel_63.setLayout(null);
		panel_63.setBackground(Color.WHITE);
		panel_63.setBounds(0, 44, 183, 23);
		panel_59.add(panel_63);

		txtCognitionImpaired = new JxRichTextField();
		txtCognitionImpaired.setArc(0.1f);
		txtCognitionImpaired.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtCognitionImpaired.setRichTextFieldModel(txtCognitionImpaired,
				"Speech Therapy: CognitionImpaired");
		txtCognitionImpaired.setBounds(3, 2, 170, 18);
		panel_63.add(txtCognitionImpaired);

		panel_62 = new JPanel();
		panel_62.setBorder(new LineBorder(Color.black, 1, false));
		panel_62.setLayout(null);
		panel_62.setBackground(Color.WHITE);
		panel_62.setBounds(0, 66, 183, 39);
		panel_59.add(panel_62);

		txtHearingAidedImpaired = new JxRichTextField();
		txtHearingAidedImpaired.setArc(0.1f);
		txtHearingAidedImpaired.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtHearingAidedImpaired.setRichTextFieldModel(txtHearingAidedImpaired,
				"Speech Therapy: HearingAidedImpaired");
		txtHearingAidedImpaired.setBounds(3, 3, 170, 18);
		panel_62.add(txtHearingAidedImpaired);

		panel_76 = new JPanel();
		panel_76.setBorder(new LineBorder(Color.black, 1, false));
		panel_76.setLayout(null);
		panel_76.setBackground(Color.WHITE);
		panel_76.setBounds(0, 104, 183, 23);
		panel_59.add(panel_76);

		txtComprehensionImpaired = new JxRichTextField();
		txtComprehensionImpaired.setArc(0.1f);
		txtComprehensionImpaired.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtComprehensionImpaired.setRichTextFieldModel(
				txtComprehensionImpaired,
				"Speech Therapy: ComprehensionImpaired");
		txtComprehensionImpaired.setBounds(3, 2, 170, 18);
		panel_76.add(txtComprehensionImpaired);

		panel_85 = new JPanel();
		panel_85.setBorder(new LineBorder(Color.black, 1, false));
		panel_85.setLayout(null);
		panel_85.setBackground(Color.WHITE);
		panel_85.setBounds(0, 126, 183, 53);
		panel_59.add(panel_85);

		txtSpeechImpaired = new JxRichTextField();
		txtSpeechImpaired.setArc(0.1f);
		txtSpeechImpaired.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtSpeechImpaired.setRichTextFieldModel(txtSpeechImpaired,
				"Speech Therapy: SpeechImpaired");
		txtSpeechImpaired.setBounds(3, 3, 170, 18);
		panel_85.add(txtSpeechImpaired);

		panel_94 = new JPanel();
		panel_94.setBorder(new LineBorder(Color.black, 1, false));
		panel_94.setLayout(null);
		panel_94.setBackground(Color.WHITE);
		panel_94.setBounds(0, 178, 183, 23);
		panel_59.add(panel_94);

		txtOralMotorImpaired = new JxRichTextField();
		txtOralMotorImpaired.setArc(0.1f);
		txtOralMotorImpaired.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtOralMotorImpaired.setRichTextFieldModel(txtOralMotorImpaired,
				"Speech Therapy: OralMotorImpaired");
		txtOralMotorImpaired.setBounds(3, 3, 170, 18);
		panel_94.add(txtOralMotorImpaired);

		panel_103 = new JPanel();
		panel_103.setBorder(new LineBorder(Color.black, 1, false));
		panel_103.setLayout(null);
		panel_103.setBackground(Color.WHITE);
		panel_103.setBounds(0, 200, 183, 23);
		panel_59.add(panel_103);

		txtVoiceImpaired = new JxRichTextField();
		txtVoiceImpaired.setArc(0.1f);
		txtVoiceImpaired.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtVoiceImpaired.setRichTextFieldModel(txtVoiceImpaired,
				"Speech Therapy: VoiceImpaired");
		txtVoiceImpaired.setBounds(3, 3, 170, 18);
		panel_103.add(txtVoiceImpaired);

		panel_112 = new JPanel();
		panel_112.setBorder(new LineBorder(Color.black, 1, false));
		panel_112.setLayout(null);
		panel_112.setBackground(Color.WHITE);
		panel_112.setBounds(0, 222, 183, 23);
		panel_59.add(panel_112);

		txtEvalOtherImpaired = new JxRichTextField();
		txtEvalOtherImpaired.setArc(0.1f);
		txtEvalOtherImpaired.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtEvalOtherImpaired.setRichTextFieldModel(txtEvalOtherImpaired,
				"Speech Therapy: EvalOtherImpaired");
		txtEvalOtherImpaired.setBounds(3, 2, 170, 18);
		panel_112.add(txtEvalOtherImpaired);

		panel_64 = new JPanel();
		panel_64.setBorder(new LineBorder(Color.black, 1, false));
		panel_64.setLayout(null);
		panel_64.setBackground(Color.WHITE);
		panel_64.setBounds(523, 0, 327, 245);
		panel_22.add(panel_64);

		panel_65 = new JPanel();
		panel_65.setBorder(new LineBorder(Color.black, 1, false));
		panel_65.setLayout(null);
		panel_65.setBackground(Color.WHITE);
		panel_65.setBounds(0, 0, 327, 23);
		panel_64.add(panel_65);

		circleOneLabel_10 = new JLabel();
		circleOneLabel_10.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_10.setText("COMMENTS");
		circleOneLabel_10.setBounds(106, 3, 79, 14);
		panel_65.add(circleOneLabel_10);

		panel_66 = new JPanel();
		panel_66.setBorder(new LineBorder(Color.black, 1, false));
		panel_66.setLayout(null);
		panel_66.setBackground(Color.WHITE);
		panel_66.setBounds(0, 22, 327, 23);
		panel_64.add(panel_66);

		Notes defaultNotes = new Notes();
		defaultNotes.setFormName("Speech Therapy");
		defaultNotes.setUserId(Global.currentLoggedInUserKey);
		defaultNotes.setNoteText("");

		txtVerbalComments = new JxNotes(isCategories);
		txtVerbalComments.setNotes(defaultNotes);
		txtVerbalComments.setBounds(23, 2, 275, 18);
		panel_66.add(txtVerbalComments);

		panel_68 = new JPanel();
		panel_68.setBorder(new LineBorder(Color.black, 1, false));
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(0, 44, 327, 23);
		panel_64.add(panel_68);

		Notes defaultNotesCognitionComments = new Notes();
		defaultNotesCognitionComments.setFormName("Speech Therapy");
		defaultNotesCognitionComments.setUserId(Global.currentLoggedInUserKey);
		defaultNotesCognitionComments.setNoteText("");

		txtCognitionComments = new JxNotes(isCategories);
		txtCognitionComments.setNotes(defaultNotesCognitionComments);
		txtCognitionComments.setBounds(23, 2, 275, 18);
		panel_68.add(txtCognitionComments);

		panel_67 = new JPanel();
		panel_67.setBorder(new LineBorder(Color.black, 1, false));
		panel_67.setLayout(null);
		panel_67.setBackground(Color.WHITE);
		panel_67.setBounds(0, 66, 327, 39);
		panel_64.add(panel_67);

		Notes defaultNotesHearingAidedComments = new Notes();
		defaultNotesHearingAidedComments.setFormName("Speech Therapy");
		defaultNotesHearingAidedComments
				.setUserId(Global.currentLoggedInUserKey);
		defaultNotesHearingAidedComments.setNoteText("");

		txtHearingAidedComments = new JxNotes(isCategories);
		txtHearingAidedComments.setNotes(defaultNotesHearingAidedComments);
		txtHearingAidedComments.setBounds(23, 3, 275, 18);
		panel_67.add(txtHearingAidedComments);

		panel_77 = new JPanel();
		panel_77.setBorder(new LineBorder(Color.black, 1, false));
		panel_77.setLayout(null);
		panel_77.setBackground(Color.WHITE);
		panel_77.setBounds(0, 104, 327, 23);
		panel_64.add(panel_77);

		Notes defaultNotesComprehensionComments = new Notes();
		defaultNotesComprehensionComments.setFormName("Speech Therapy");
		defaultNotesComprehensionComments
				.setUserId(Global.currentLoggedInUserKey);
		defaultNotesComprehensionComments.setNoteText("");

		txtComprehensionComments = new JxNotes(isCategories);
		txtComprehensionComments.setNotes(defaultNotesComprehensionComments);
		txtComprehensionComments.setBounds(23, 2, 275, 18);
		panel_77.add(txtComprehensionComments);

		panel_86 = new JPanel();
		panel_86.setBorder(new LineBorder(Color.black, 1, false));
		panel_86.setLayout(null);
		panel_86.setBackground(Color.WHITE);
		panel_86.setBounds(0, 126, 327, 53);
		panel_64.add(panel_86);

		Notes defaultNotesSpeechComments = new Notes();
		defaultNotesSpeechComments.setFormName("Speech Therapy");
		defaultNotesSpeechComments.setUserId(Global.currentLoggedInUserKey);
		defaultNotesSpeechComments.setNoteText("");

		txtSpeechComments = new JxNotes(isCategories);
		txtSpeechComments.setNotes(defaultNotesSpeechComments);
		txtSpeechComments.setBounds(23, 3, 275, 18);
		panel_86.add(txtSpeechComments);

		panel_95 = new JPanel();
		panel_95.setBorder(new LineBorder(Color.black, 1, false));
		panel_95.setLayout(null);
		panel_95.setBackground(Color.WHITE);
		panel_95.setBounds(0, 178, 327, 23);
		panel_64.add(panel_95);

		Notes defaultNotesOralMotorComments = new Notes();
		defaultNotesOralMotorComments.setFormName("Speech Therapy");
		defaultNotesOralMotorComments.setUserId(Global.currentLoggedInUserKey);
		defaultNotesOralMotorComments.setNoteText("");

		txtOralMotorComments = new JxNotes(isCategories);
		txtOralMotorComments.setNotes(defaultNotesOralMotorComments);
		txtOralMotorComments.setBounds(23, 3, 275, 18);
		panel_95.add(txtOralMotorComments);

		panel_104 = new JPanel();
		panel_104.setBorder(new LineBorder(Color.black, 1, false));
		panel_104.setLayout(null);
		panel_104.setBackground(Color.WHITE);
		panel_104.setBounds(0, 200, 327, 23);
		panel_64.add(panel_104);

		Notes defaultNotesVoiceComments = new Notes();
		defaultNotesVoiceComments.setFormName("Speech Therapy");
		defaultNotesVoiceComments.setUserId(Global.currentLoggedInUserKey);
		defaultNotesVoiceComments.setNoteText("");

		txtVoiceComments = new JxNotes(isCategories);
		txtVoiceComments.setNotes(defaultNotesVoiceComments);
		txtVoiceComments.setBounds(23, 3, 275, 18);
		panel_104.add(txtVoiceComments);

		panel_113 = new JPanel();
		panel_113.setBorder(new LineBorder(Color.black, 1, false));
		panel_113.setLayout(null);
		panel_113.setBackground(Color.WHITE);
		panel_113.setBounds(0, 222, 327, 23);
		panel_64.add(panel_113);

		Notes defaultNotesEvalOtherComments = new Notes();
		defaultNotesEvalOtherComments.setFormName("Speech Therapy");
		defaultNotesEvalOtherComments.setUserId(Global.currentLoggedInUserKey);
		defaultNotesEvalOtherComments.setNoteText("");

		txtEvalOtherComments = new JxNotes(isCategories);
		txtEvalOtherComments.setNotes(defaultNotesEvalOtherComments);
		txtEvalOtherComments.setBounds(23, 2, 275, 18);
		panel_113.add(txtEvalOtherComments);

		circleOneLabel_11 = new JLabel();
		circleOneLabel_11.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_11.setText("(circle)");
		circleOneLabel_11.setBounds(95, 700, 38, 14);
		panel.add(circleOneLabel_11);

		cbCognitionAlert = new JCheckBox();
		cbCognitionAlert.setActionCommand("1");
		cbCognitionAlert.setFont(new Font("", Font.BOLD, 12));
		cbCognitionAlert.setBackground(Color.WHITE);
		cbCognitionAlert.setText("ALERT");
		cbCognitionAlert.setBounds(150, 700, 59, 18);
		panel.add(cbCognitionAlert);

		cbCognitionOrientedX123 = new JCheckBox();
		cbCognitionOrientedX123.setActionCommand("2");
		cbCognitionOrientedX123.setFont(new Font("", Font.BOLD, 12));
		cbCognitionOrientedX123.setBackground(Color.WHITE);
		cbCognitionOrientedX123.setText("ORIENTED x1, 2, 3");
		cbCognitionOrientedX123.setBounds(280, 700, 118, 18);
		panel.add(cbCognitionOrientedX123);

		cbCognitionDecreasedVision = new JCheckBox();
		cbCognitionDecreasedVision.setActionCommand("3");
		cbCognitionDecreasedVision.setFont(new Font("", Font.BOLD, 12));
		cbCognitionDecreasedVision.setBackground(Color.WHITE);
		cbCognitionDecreasedVision.setText("DECREASED VISION / HEARING");
		cbCognitionDecreasedVision.setBounds(460, 700, 188, 18);
		panel.add(cbCognitionDecreasedVision);

		cbCognitionAphasia = new JCheckBox();
		cbCognitionAphasia.setActionCommand("4");
		cbCognitionAphasia.setFont(new Font("", Font.BOLD, 12));
		cbCognitionAphasia.setBackground(Color.WHITE);
		cbCognitionAphasia.setText("APHASIA");
		cbCognitionAphasia.setBounds(701, 700, 94, 18);
		panel.add(cbCognitionAphasia);

		ageLabel_22 = new JLabel();
		ageLabel_22.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_22.setText("FOLLOWS COMMANDS:");
		ageLabel_22.setBounds(3, 990, 134, 14);
		panel.add(ageLabel_22);

		circleOneLabel_12 = new JLabel();
		circleOneLabel_12.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_12.setText("(circle one)");
		circleOneLabel_12.setBounds(138, 990, 68, 14);
		panel.add(circleOneLabel_12);

		rbFollowComTactileCuesNeeded = new JRadioButton();
		rbFollowComTactileCuesNeeded.setActionCommand("1");
		bgFollowCom.add(rbFollowComTactileCuesNeeded);
		rbFollowComTactileCuesNeeded.setFont(new Font("", Font.BOLD, 12));
		rbFollowComTactileCuesNeeded.setBackground(Color.WHITE);
		rbFollowComTactileCuesNeeded.setText("TACTILE CUES NEEDED");
		rbFollowComTactileCuesNeeded.setBounds(230, 990, 147, 18);
		panel.add(rbFollowComTactileCuesNeeded);

		rbFollowCom1Step = new JRadioButton();
		rbFollowCom1Step.setActionCommand("2");
		bgFollowCom.add(rbFollowCom1Step);
		rbFollowCom1Step.setFont(new Font("", Font.BOLD, 12));
		rbFollowCom1Step.setBackground(Color.WHITE);
		rbFollowCom1Step.setText("1 STEP");
		rbFollowCom1Step.setBounds(440, 990, 59, 18);
		panel.add(rbFollowCom1Step);

		rbrbFollowCom2Step = new JRadioButton();
		rbrbFollowCom2Step.setActionCommand("3");
		bgFollowCom.add(rbrbFollowCom2Step);
		rbrbFollowCom2Step.setFont(new Font("", Font.BOLD, 12));
		rbrbFollowCom2Step.setBackground(Color.WHITE);
		rbrbFollowCom2Step.setText("2 STEP");
		rbrbFollowCom2Step.setBounds(570, 990, 68, 18);
		panel.add(rbrbFollowCom2Step);

		rbFollowComMultiStep = new JRadioButton();
		rbFollowComMultiStep.setActionCommand("4");
		bgFollowCom.add(rbFollowComMultiStep);
		rbFollowComMultiStep.setFont(new Font("", Font.BOLD, 12));
		rbFollowComMultiStep.setBackground(Color.WHITE);
		rbFollowComMultiStep.setText("MELTI-STEP");
		rbFollowComMultiStep.setBounds(701, 990, 87, 18);
		panel.add(rbFollowComMultiStep);

		ageLabel_23 = new JLabel();
		ageLabel_23.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_23.setText("RECOMMENDATION / IMPRESSION:");
		ageLabel_23.setBounds(3, 1020, 203, 14);
		panel.add(ageLabel_23);

		cbRecPatientParticipatedIn = new JCheckBox();
		cbRecPatientParticipatedIn.setFont(new Font("", Font.BOLD, 12));
		cbRecPatientParticipatedIn.setBackground(Color.WHITE);
		cbRecPatientParticipatedIn
				.setText("PATIENT PARTICIPATED IN AND AGRESS WITH PLAN OF CARE");
		cbRecPatientParticipatedIn.setBounds(78, 1110, 368, 18);
		panel.add(cbRecPatientParticipatedIn);

		cbRecNa = new JCheckBox();
		cbRecNa.setFont(new Font("", Font.BOLD, 12));
		cbRecNa.setBackground(Color.WHITE);
		cbRecNa.setText("N/A");
		cbRecNa.setBounds(473, 1110, 38, 18);
		panel.add(cbRecNa);

		txtRecNaField = new JTextField();
		txtRecNaField.setBounds(517, 1110, 203, 20);
		panel.add(txtRecNaField);

		evaluationLabel_1 = new JLabel();
		evaluationLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		evaluationLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		evaluationLabel_1.setText("  COGNITION:");
		evaluationLabel_1.setBounds(3, 700, 87, 20);
		panel.add(evaluationLabel_1);

		Notes defaultNotesR = new Notes();
		defaultNotesR.setFormName("Speech Therapy");
		defaultNotesR.setUserId(Global.currentLoggedInUserKey);
		defaultNotesR.setNoteText("");

		txtRecommendationImp = new JxNotes(isCategories);
		txtRecommendationImp.setNotes(defaultNotesR);
		// txtRecommendationImp.setWrapStyleWord(true);
		// txtRecommendationImp.setLineWrap(true);
		txtRecommendationImp.setBounds(78, 1040, 729, 58);
		panel.add(txtRecommendationImp);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 21, 850, 25);
		add(panel_2);

		hcfa700FormLabel = new JLabel();
		hcfa700FormLabel.setFont(new Font("", Font.BOLD, 14));
		hcfa700FormLabel.setText("HCFA   700 Form:");
		hcfa700FormLabel.setBounds(3, 3, 147, 14);
		panel_2.add(hcfa700FormLabel);

		hcfa700FormLabel_1 = new JLabel();
		hcfa700FormLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		hcfa700FormLabel_1.setText("SPEECH/LANGUAGE EVALUATION");
		hcfa700FormLabel_1.setBounds(152, 3, 269, 14);
		panel_2.add(hcfa700FormLabel_1);

		cbSpeechEvalPartB = new JCheckBox();
		cbSpeechEvalPartB.setFont(new Font("", Font.BOLD, 14));
		cbSpeechEvalPartB.setBackground(Color.WHITE);
		cbSpeechEvalPartB.setText("PART B");
		cbSpeechEvalPartB.setBounds(573, 3, 74, 18);
		panel_2.add(cbSpeechEvalPartB);

		cbSpeechEvalPartA = new JCheckBox();
		cbSpeechEvalPartA.setFont(new Font("", Font.BOLD, 14));
		cbSpeechEvalPartA.setBackground(Color.WHITE);
		cbSpeechEvalPartA.setText("PART A");
		cbSpeechEvalPartA.setBounds(434, 3, 74, 18);
		panel_2.add(cbSpeechEvalPartA);

		cbSpeechEvalOther = new JCheckBox();
		cbSpeechEvalOther.setFont(new Font("", Font.BOLD, 14));
		cbSpeechEvalOther.setBackground(Color.WHITE);
		cbSpeechEvalOther.setText("OTHER");
		cbSpeechEvalOther.setBounds(653, 3, 66, 18);
		panel_2.add(cbSpeechEvalOther);

		txtSpeechEvalOtherField = new JxRichTextField();
		txtSpeechEvalOtherField.setBounds(722, 3, 118, 20);
		txtSpeechEvalOtherField.setArc(0.1f);
		txtSpeechEvalOtherField.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtSpeechEvalOtherField.setRichTextFieldModel(txtSpeechEvalOtherField,
				"Speech Therapy: txtSpeechEvalOtherField");
		panel_2.add(txtSpeechEvalOtherField);

		cbSpeechEvalHmo = new JCheckBox();
		cbSpeechEvalHmo.setFont(new Font("", Font.BOLD, 12));
		cbSpeechEvalHmo.setBackground(Color.WHITE);
		cbSpeechEvalHmo.setText("HMO");
		cbSpeechEvalHmo.setBounds(514, 3, 53, 18);
		panel_2.add(cbSpeechEvalHmo);

		label_1 = new JLabel();
		label_1.setFont(new Font("", Font.BOLD, 14));
		label_1.setBorder(new LineBorder(Color.black, 1, false));
		label_1.setText(" 8");
		label_1.setBounds(845, 1, 18, 18);
		add(label_1);

		fillcombo();
		updateData();
	}

	private void fillcombo() {
		UserLogon ul = new UserLogon();
		try {
			ul = MedrexClientManager.getInstance().getcurrentUserLogon();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Users user = new Users();
		try {
			user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cmbSignatureTherapy.addItem(user.getUserName());
		cmbCertifyPhysicianSign.addItem(user.getUserName());
	}

	public boolean isEval() {
		if (cmbFrequency != null
				&& cmbFrequency.getSelectedItem().toString().length() > 0) {
			return cmbFrequency.getSelectedItem().toString().toLowerCase()
					.contains("eval");
		}
		return false;
	}

	public Date getCertificationFromDate() {
		if (dcCertificationFromDate != null) {
			return dcCertificationFromDate.getDate();
		}
		return null;
	}

	public Date getCertificationToDate() {
		if (dcCertificationThroughDate != null) {
			return dcCertificationThroughDate.getDate();
		}
		return null;
	}

	public void doSave() {

		PtOtStSpeechLanguage refPtOtStSpeechLanguage = new PtOtStSpeechLanguage();
		refPtOtStSpeechLanguage
				.setSerial(Global.currentPtOtStSpeechLanguageKey);
		refPtOtStSpeechLanguage.setResidentId(Global.currentResidenceKey);
		refPtOtStSpeechLanguage.setFollowCom(SwingUtils
				.getSelectedButton(bgFollowCom));
		if (!(txtEvalOtherField.getText().equalsIgnoreCase(""))) {
			txtEvalOtherField
					.setRichTextFieldData("Speech Therapy: EvalOtherField");
			refPtOtStSpeechLanguage.setEvalOtherField(txtEvalOtherField
					.getField());
		}

		refPtOtStSpeechLanguage.setHearingAidedLeft(cbHearingAidedLeft
				.isSelected());
		refPtOtStSpeechLanguage.setHearingAidedRight(cbHearingAidedRight
				.isSelected());
		if (txtRecommendationImp.getNotes() != null) {
			refPtOtStSpeechLanguage.setRecommendationImp(txtRecommendationImp
					.getNotes());
		}

		refPtOtStSpeechLanguage
				.setSpeechExpressiveAbility(cbSpeechExpressiveAbility
						.isSelected());
		refPtOtStSpeechLanguage
				.setSpeechIntelligibility(cbSpeechIntelligibility.isSelected());
		refPtOtStSpeechLanguage.setSpeechFluency(cbSpeechFluency.isSelected());
		refPtOtStSpeechLanguage.setRecNaField(txtRecNaField.getText());
		refPtOtStSpeechLanguage.setRecNa(cbRecNa.isSelected());
		refPtOtStSpeechLanguage
				.setRecPatientParticipatedIn(cbRecPatientParticipatedIn
						.isSelected());
		refPtOtStSpeechLanguage.setEvalOtherComments(txtEvalOtherComments
				.getNotes());

		if (!(txtEvalOtherImpaired.getText().equalsIgnoreCase(""))) {
			txtEvalOtherImpaired
					.setRichTextFieldData("Speech Therapy: EvalOtherImpaired");
			refPtOtStSpeechLanguage.setEvalOtherImpaired(txtEvalOtherImpaired
					.getField());
		}
		if (!(txtEvalOtherWfl.getText().equalsIgnoreCase(""))) {
			txtEvalOtherWfl.setRichTextFieldData("Speech Therapy: VoiceWfl");
			refPtOtStSpeechLanguage.setEvalOtherWfl(txtEvalOtherWfl.getField());
		}
		refPtOtStSpeechLanguage.setVoiceComments(txtVoiceComments.getNotes());
		if (!(txtVoiceImpaired.getText().equalsIgnoreCase(""))) {
			txtVoiceImpaired
					.setRichTextFieldData("Speech Therapy: VoiceImpaired");
			refPtOtStSpeechLanguage.setVoiceImpaired(txtVoiceImpaired
					.getField());
		}
		if (!(txtVoiceWfl.getText().equalsIgnoreCase(""))) {
			txtVoiceWfl.setRichTextFieldData("Speech Therapy: VoiceWfl");
			refPtOtStSpeechLanguage.setVoiceWfl(txtVoiceWfl.getField());
		}
		refPtOtStSpeechLanguage.setOralMotorComments(txtOralMotorComments
				.getNotes());
		if (!(txtOralMotorImpaired.getText().equalsIgnoreCase(""))) {
			txtOralMotorImpaired
					.setRichTextFieldData("Speech Therapy: OralMotorImpaired");
			refPtOtStSpeechLanguage.setOralMotorImpaired(txtOralMotorImpaired
					.getField());
		}
		if (!(txtOralMotorWfl.getText().equalsIgnoreCase(""))) {
			txtOralMotorWfl
					.setRichTextFieldData("Speech Therapy: OralMotorWfl");
			refPtOtStSpeechLanguage.setOralMotorWfl(txtOralMotorWfl.getField());
		}
		refPtOtStSpeechLanguage.setSpeechComments(txtSpeechComments.getNotes());
		if (!(txtSpeechImpaired.getText().equalsIgnoreCase(""))) {
			txtSpeechImpaired
					.setRichTextFieldData("Speech Therapy: SpeechImpaired");
			refPtOtStSpeechLanguage.setSpeechImpaired(txtSpeechImpaired
					.getField());
		}
		if (!(txtSpeechWfl.getText().equalsIgnoreCase(""))) {
			txtSpeechWfl.setRichTextFieldData("Speech Therapy: SpeechWfl");
			refPtOtStSpeechLanguage.setSpeechWfl(txtSpeechWfl.getField());
		}
		refPtOtStSpeechLanguage
				.setComprehensionComments(txtComprehensionComments.getNotes());
		if (!(txtComprehensionImpaired.getText().equalsIgnoreCase(""))) {
			txtComprehensionImpaired
					.setRichTextFieldData("Speech Therapy: ComprehensionImpaired");
			refPtOtStSpeechLanguage
					.setComprehensionImpaired(txtComprehensionImpaired
							.getField());
		}
		if (!(txtComprehensionWfl.getText().equalsIgnoreCase(""))) {
			txtComprehensionWfl
					.setRichTextFieldData("Speech Therapy: ComprehensionWfl");
			refPtOtStSpeechLanguage.setComprehensionWfl(txtComprehensionWfl
					.getField());
		}

		refPtOtStSpeechLanguage.setHearingAidedComments(txtHearingAidedComments
				.getNotes());
		if (!(txtHearingAidedImpaired.getText().equalsIgnoreCase(""))) {
			txtHearingAidedImpaired
					.setRichTextFieldData("Speech Therapy: HearingAidedImpaired");
			refPtOtStSpeechLanguage
					.setHearingAidedImpaired(txtHearingAidedImpaired.getField());
		}
		if (!(txtHearingAidedWfl.getText().equalsIgnoreCase(""))) {
			txtHearingAidedWfl
					.setRichTextFieldData("Speech Therapy: HearingAidedWfl");
			refPtOtStSpeechLanguage.setHearingAidedWfl(txtHearingAidedWfl
					.getField());
		}
		refPtOtStSpeechLanguage
				.setPlanOfCareOther(txtPlanOfCareOther.getText());
		refPtOtStSpeechLanguage.setSpeechEvalHmo(cbSpeechEvalHmo.isSelected());
		refPtOtStSpeechLanguage.setCognitionAphasia(cbCognitionAphasia
				.isSelected());
		refPtOtStSpeechLanguage
				.setCognitionDecreasedVision(cbCognitionDecreasedVision
						.isSelected());
		refPtOtStSpeechLanguage
				.setCognitionOrientedX123(cbCognitionOrientedX123.isSelected());
		refPtOtStSpeechLanguage
				.setCognitionAlert(cbCognitionAlert.isSelected());
		refPtOtStSpeechLanguage.setCognitionComments(txtCognitionComments
				.getNotes());
		refPtOtStSpeechLanguage.setVerbalComments(txtVerbalComments.getNotes());
		if (!(txtCognitionImpaired.getText().equalsIgnoreCase(""))) {
			txtCognitionImpaired
					.setRichTextFieldData("Speech Therapy: CognitionImpaired");
			refPtOtStSpeechLanguage.setCognitionImpaired(txtCognitionImpaired
					.getField());
		}
		refPtOtStSpeechLanguage
				.setVerbalImpaired(cbVerbalImpaired.isSelected());
		if (!(txtCognitionWfl.getText().equalsIgnoreCase(""))) {
			txtCognitionWfl
					.setRichTextFieldData("Speech Therapy: CognitionWfl");
			refPtOtStSpeechLanguage.setCognitionWfl(txtCognitionWfl.getField());
		}
		refPtOtStSpeechLanguage.setVerbalWfl(cbVerbalWfl.isSelected());
		refPtOtStSpeechLanguage
				.setSignatureTherapy((String) cmbSignatureTherapy
						.getSelectedItem());
		if (!(txtInitialAssessmentRecentTherapyNaField.getText()
				.equalsIgnoreCase(""))) {
			txtInitialAssessmentRecentTherapyNaField
					.setRichTextFieldData("Speech Therapy: InitialAssessmentRecentTherapyNa");
			refPtOtStSpeechLanguage
					.setInitialAssessmentRecentTherapyNaField(txtInitialAssessmentRecentTherapyNaField
							.getField());
		}

		refPtOtStSpeechLanguage
				.setInitialAssessmentRecentTherapyNa(cbInitialAssessmentRecentTherapyNa
						.isSelected());
		if (!(txtInitialAssessmentPrecautions.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentPrecautions
					.setRichTextFieldData("Speech Therapy: InitialAssessmentPrecautions");
			refPtOtStSpeechLanguage
					.setInitialAssessmentPrecautions(txtInitialAssessmentPrecautions
							.getField());
		}
		refPtOtStSpeechLanguage
				.setInitialAssessmentPtGoal(txtInitialAssessmentPtGoal
						.getText());
		if (!(txtInitialAssessmentPmh.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentPmh
					.setRichTextFieldData("Speech Therapy: InitialAssessmentPmh");
			refPtOtStSpeechLanguage
					.setInitialAssessmentPmh(txtInitialAssessmentPmh.getField());
		}
		refPtOtStSpeechLanguage
				.setInitialAssessmentPlof(txtInitialAssessmentPlof.getNotes());
		refPtOtStSpeechLanguage.setReasonForReferral(txtReasonForReferral
				.getNotes());
		refPtOtStSpeechLanguage.setRehabPot(SwingUtils
				.getSelectedButton(bgRehabPot));
		if (!(txtInitialAssessmentRefBy.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentRefBy
					.setRichTextFieldData("Speech Therapy: InitialAssessmentRefBy");
			refPtOtStSpeechLanguage
					.setInitialAssessmentRefBy(txtInitialAssessmentRefBy
							.getField());
		}

		refPtOtStSpeechLanguage.setInitialAssessmentAge(txtInitialAssessmentAge
				.getText());
		refPtOtStSpeechLanguage
				.setCertificationThroughDate(dcCertificationThroughDate
						.getDate());
		refPtOtStSpeechLanguage
				.setCertificationFromDate(dcCertificationFromDate.getDate());
		refPtOtStSpeechLanguage
				.setCertifyPhysicianSign((String) cmbCertifyPhysicianSign
						.getSelectedItem());
		refPtOtStSpeechLanguage.setCertifyPhysicianDate(dcCertifyPhysicianDate
				.getDate());
		refPtOtStSpeechLanguage.setCertifyPhysicianName(txtCertifyPhysicianName
				.getText());
		refPtOtStSpeechLanguage
				.setPlanOfTreatmentLongTerm(txtPlanOfTreatmentLongTerm
						.getNotes());
		refPtOtStSpeechLanguage
				.setPlanOfTreatmentLongTermWks(txtPlanOfTreatmentLongTermWks
						.getText());
		refPtOtStSpeechLanguage
				.setPlanOfTreatmentShortTerm(txtPlanOfTreatmentShortTerm
						.getNotes());
		refPtOtStSpeechLanguage
				.setPlanOfTreatmentShortTermWks(txtPlanOfTreatmentShortTermWks
						.getText());
		refPtOtStSpeechLanguage.setSocDate(dcSocDate.getDate());
		refPtOtStSpeechLanguage.setOnsetDate(dcOnsetDate.getDate());
		refPtOtStSpeechLanguage.setPrimaryDuration(txtPrimaryDiagnosis
				.getText());

		if (!(txtTreatmentDiagnosis.getText().equalsIgnoreCase(""))) {
			txtTreatmentDiagnosis
					.setRichTextFieldData("Speech Therapy: TreatmentDiagnosis");
			refPtOtStSpeechLanguage
					.setSpeechEvalOtherField(txtTreatmentDiagnosis.getField());
		}
		refPtOtStSpeechLanguage.setHospitalizationNa(cbHospitalizationNa
				.isSelected());
		refPtOtStSpeechLanguage
				.setHospitalizationToDate(dcHospitalizationToDate.getDate());
		refPtOtStSpeechLanguage
				.setHospitalizationFromDate(dcHospitalizationFromDate.getDate());
		refPtOtStSpeechLanguage.setProviderName(txtProviderName.getText());
		refPtOtStSpeechLanguage.setHicn(txtHicn.getText());
		refPtOtStSpeechLanguage.setNpiNo(txtNpiNo.getText());
		// Speech Eval Other
		if (!(txtSpeechEvalOtherField.getText().equalsIgnoreCase(""))) {
			txtSpeechEvalOtherField
					.setRichTextFieldData("Speech Therapy: txtSpeechEvalOtherField");
			refPtOtStSpeechLanguage
					.setSpeechEvalOtherField(txtSpeechEvalOtherField.getField());
		}

		refPtOtStSpeechLanguage.setSpeechEvalOther(cbSpeechEvalOther
				.isSelected());
		refPtOtStSpeechLanguage.setSpeechEvalPartA(cbSpeechEvalPartA
				.isSelected());
		refPtOtStSpeechLanguage.setSpeechEvalPartB(cbSpeechEvalPartB
				.isSelected());
		refPtOtStSpeechLanguage.setFrequencyDuration(cmbFrequency
				.getSelectedItem()
				+ "");

		try {
			Global.currentPtOtStSpeechLanguageKey = MedrexClientManager
					.getInstance().insertOrUpdatePtOtStSpeechLanguage(
							refPtOtStSpeechLanguage);
		} catch (Exception e) {
		}
	}

	public void updateData() {
		ResidentMain rm = null;
		NursingHome nh = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			nh = MedrexClientManager.getInstance().getNursingHomeInfo(1);
			if (rm != null) {
				txt$PatientFirsttName.setText(rm.getUserName());
				txt$PatientLastName.setText(rm.getUserPass());
				txtHicn.setText(rm.getMedicaidNum());
			}
			if (nh != null) {
				txtNpiNo.setText(nh.getNpi());
				txtProviderName.setText(nh.getName());
			}

		} catch (Exception e) {

		}

		PtOtStSpeechLanguage refPtOtStSpeechLanguage = null;

		if (Global.currentPtOtStSpeechLanguageKey != 0) {
			try {
				refPtOtStSpeechLanguage = MedrexClientManager.getInstance()
						.getPtOtStSpeechLanguage(
								Global.currentPtOtStSpeechLanguageKey);
			} catch (Exception e) {

			}
			SwingUtils.setSelectedButton(bgFollowCom, refPtOtStSpeechLanguage
					.getFollowCom());
			txtEvalOtherField.setField(refPtOtStSpeechLanguage
					.getEvalOtherField());
			cbHearingAidedLeft.setSelected(refPtOtStSpeechLanguage
					.isHearingAidedLeft());
			cbHearingAidedRight.setSelected(refPtOtStSpeechLanguage
					.isHearingAidedRight());
			txtRecommendationImp.setNotes(refPtOtStSpeechLanguage
					.getRecommendationImp());
			cbSpeechExpressiveAbility.setSelected(refPtOtStSpeechLanguage
					.isSpeechExpressiveAbility());
			cbSpeechIntelligibility.setSelected(refPtOtStSpeechLanguage
					.isSpeechIntelligibility());
			cbSpeechFluency.setSelected(refPtOtStSpeechLanguage
					.isSpeechFluency());
			txtRecNaField.setText(refPtOtStSpeechLanguage.getRecNaField());
			cbRecNa.setSelected(refPtOtStSpeechLanguage.isRecNa());
			cbRecPatientParticipatedIn.setSelected(refPtOtStSpeechLanguage
					.isRecPatientParticipatedIn());
			txtEvalOtherComments.setNotes(refPtOtStSpeechLanguage
					.getEvalOtherComments());
			txtEvalOtherImpaired.setField(refPtOtStSpeechLanguage
					.getEvalOtherImpaired());
			txtEvalOtherWfl.setField(refPtOtStSpeechLanguage.getEvalOtherWfl());
			txtVoiceComments.setNotes(refPtOtStSpeechLanguage
					.getVoiceComments());
			txtVoiceImpaired.setField(refPtOtStSpeechLanguage
					.getVoiceImpaired());
			txtVoiceWfl.setField(refPtOtStSpeechLanguage.getVoiceWfl());
			txtOralMotorComments.setNotes(refPtOtStSpeechLanguage
					.getOralMotorComments());
			txtOralMotorImpaired.setField(refPtOtStSpeechLanguage
					.getOralMotorImpaired());
			txtOralMotorWfl.setField(refPtOtStSpeechLanguage.getOralMotorWfl());
			txtSpeechComments.setNotes(refPtOtStSpeechLanguage
					.getSpeechComments());
			txtSpeechImpaired.setField(refPtOtStSpeechLanguage
					.getSpeechImpaired());
			txtSpeechWfl.setField(refPtOtStSpeechLanguage.getSpeechWfl());
			txtComprehensionComments.setNotes(refPtOtStSpeechLanguage
					.getComprehensionComments());
			txtComprehensionImpaired.setField(refPtOtStSpeechLanguage
					.getComprehensionImpaired());
			txtComprehensionWfl.setField(refPtOtStSpeechLanguage
					.getComprehensionWfl());
			txtHearingAidedComments.setNotes(refPtOtStSpeechLanguage
					.getHearingAidedComments());
			txtHearingAidedImpaired.setField(refPtOtStSpeechLanguage
					.getHearingAidedImpaired());
			txtHearingAidedWfl.setField(refPtOtStSpeechLanguage
					.getHearingAidedWfl());
			txtPlanOfCareOther.setText(refPtOtStSpeechLanguage
					.getPlanOfCareOther());
			cbSpeechEvalHmo.setSelected(refPtOtStSpeechLanguage
					.isSpeechEvalHmo());
			cbCognitionAphasia.setSelected(refPtOtStSpeechLanguage
					.isCognitionAphasia());
			cbCognitionDecreasedVision.setSelected(refPtOtStSpeechLanguage
					.isCognitionDecreasedVision());
			cbCognitionOrientedX123.setSelected(refPtOtStSpeechLanguage
					.isCognitionOrientedX123());
			cbCognitionAlert.setSelected(refPtOtStSpeechLanguage
					.isCognitionAlert());
			txtCognitionComments.setNotes(refPtOtStSpeechLanguage
					.getCognitionComments());
			txtVerbalComments.setNotes(refPtOtStSpeechLanguage
					.getVerbalComments());
			txtCognitionImpaired.setField(refPtOtStSpeechLanguage
					.getCognitionImpaired());
			cbVerbalImpaired.setSelected(refPtOtStSpeechLanguage
					.isVerbalImpaired());
			txtCognitionWfl.setField(refPtOtStSpeechLanguage.getCognitionWfl());
			cbVerbalWfl.setSelected(refPtOtStSpeechLanguage.isVerbalWfl());
			cmbSignatureTherapy.setSelectedItem(refPtOtStSpeechLanguage
					.getSignatureTherapy());
			txtInitialAssessmentRecentTherapyNaField
					.setField(refPtOtStSpeechLanguage
							.getInitialAssessmentRecentTherapyNaField());
			cbInitialAssessmentRecentTherapyNa
					.setSelected(refPtOtStSpeechLanguage
							.isInitialAssessmentRecentTherapyNa());
			txtInitialAssessmentPrecautions.setField(refPtOtStSpeechLanguage
					.getInitialAssessmentPrecautions());
			txtInitialAssessmentPtGoal.setText(refPtOtStSpeechLanguage
					.getInitialAssessmentPtGoal());
			txtInitialAssessmentPmh.setField(refPtOtStSpeechLanguage
					.getInitialAssessmentPmh());
			txtInitialAssessmentPlof.setNotes(refPtOtStSpeechLanguage
					.getInitialAssessmentPlof());
			txtReasonForReferral.setNotes(refPtOtStSpeechLanguage
					.getReasonForReferral());
			cmbFrequency.setSelectedItem(refPtOtStSpeechLanguage
					.getFrequencyDuration()
					+ "");
			SwingUtils.setSelectedButton(bgRehabPot, refPtOtStSpeechLanguage
					.getRehabPot());
			txtInitialAssessmentRefBy.setField(refPtOtStSpeechLanguage
					.getInitialAssessmentRefBy());
			txtInitialAssessmentAge.setText(refPtOtStSpeechLanguage
					.getInitialAssessmentAge());
			dcCertificationThroughDate.setDate(refPtOtStSpeechLanguage
					.getCertificationThroughDate());
			dcCertificationFromDate.setDate(refPtOtStSpeechLanguage
					.getCertificationFromDate());
			cmbCertifyPhysicianSign.setSelectedItem(refPtOtStSpeechLanguage
					.getCertifyPhysicianSign());
			dcCertifyPhysicianDate.setDate(refPtOtStSpeechLanguage
					.getCertifyPhysicianDate());
			txtCertifyPhysicianName.setText(refPtOtStSpeechLanguage
					.getCertifyPhysicianName());
			txtPlanOfTreatmentLongTerm.setNotes(refPtOtStSpeechLanguage
					.getPlanOfTreatmentLongTerm());
			txtPlanOfTreatmentLongTermWks.setText(refPtOtStSpeechLanguage
					.getPlanOfTreatmentLongTermWks());
			txtPlanOfTreatmentShortTerm.setNotes(refPtOtStSpeechLanguage
					.getPlanOfTreatmentShortTerm());
			txtPlanOfTreatmentShortTermWks.setText(refPtOtStSpeechLanguage
					.getPlanOfTreatmentShortTermWks());
			dcSocDate.setDate(refPtOtStSpeechLanguage.getSocDate());
			dcOnsetDate.setDate(refPtOtStSpeechLanguage.getOnsetDate());
			txtPrimaryDiagnosis.setText(refPtOtStSpeechLanguage
					.getPrimaryDuration());
			txtTreatmentDiagnosis.setField(refPtOtStSpeechLanguage
					.getTreatmentDiagnosis());
			cbHospitalizationNa.setSelected(refPtOtStSpeechLanguage
					.isHospitalizationNa());
			dcHospitalizationToDate.setDate(refPtOtStSpeechLanguage
					.getHospitalizationToDate());
			dcHospitalizationFromDate.setDate(refPtOtStSpeechLanguage
					.getHospitalizationFromDate());
			txtProviderName.setText(refPtOtStSpeechLanguage.getProviderName());
			// txtHicn.setText(refPtOtStSpeechLanguage.getHicn());
			// txtNpiNo.setText(refPtOtStSpeechLanguage.getNpiNo());
			txtSpeechEvalOtherField.setField(refPtOtStSpeechLanguage
					.getSpeechEvalOtherField());
			cbSpeechEvalOther.setSelected(refPtOtStSpeechLanguage
					.isSpeechEvalOther());
			cbSpeechEvalPartA.setSelected(refPtOtStSpeechLanguage
					.isSpeechEvalPartA());
			cbSpeechEvalPartB.setSelected(refPtOtStSpeechLanguage
					.isSpeechEvalPartB());
		}
	}

	private void updateDiagnosis() {
		List diagList = null; // new ArrayList();
		String tmp = "";
		try {
			diagList = MedrexClientManager.getInstance().getResidentDiagnosiss(
					Global.currentResidenceKey);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < diagList.size(); i++) {
			ResidentDiagnosis diag = (ResidentDiagnosis) diagList.get(i);
			if (diag.isConfirmed()) {
				tmp += diag.getName();
				if (i != diagList.size() - 1) {
					tmp += ", ";
				}
			}
		}
		txtPrimaryDiagnosis.setText(tmp);
	}
}
