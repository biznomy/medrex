package medrex.client.main.ptOtSt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;

import javax.swing.ButtonGroup;
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
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.ptOtSt.PtOtStPositioningEvaluation;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelPtOtStPositioningEvaluation extends JPanel {

	private ButtonGroup bgFollowCom = new ButtonGroup();
	private JTextArea txtRecommendationImp;
	private JLabel ageLabel_23;
	private JRadioButton rbFollowComMultiStep;
	private JRadioButton rbFollowCom2Step;
	private JRadioButton rbFollowCom1Step;
	private JRadioButton rbFollowComTactileCuesNeeded;
	private JLabel circleOneLabel_12;
	private JLabel ageLabel_22;
	private JCheckBox cbCognitionAphasia;
	private JCheckBox cbCognitionDecreasedVision;
	private JTextField txtCognitionOtherField;
	private JCheckBox cbCognitionOther;
	private JCheckBox cbCognitionOrientedX123;
	private JCheckBox cbCognitionAlert;
	private JLabel circleOneLabel_11;
	private JLabel ageLabel_21;
	private JTextField txtHowPositioning;
	private JLabel howIsPositioningLabel;
	private JTextField txtOtherAdaptive;
	private JTextField txtWcMobilityAdaptive;
	private JTextField txtTransferAdaptive;
	private JTextField txtFeedingAdaptive;
	private JTextField txtOtherDep;
	private JTextField txtWcMobilityDep;
	private JTextField txtTransferDep;
	private JTextField txtFeedingDep;
	private JTextField txtOtherMaxA;
	private JTextField txtWcMobilityMaxA;
	private JTextField txtTransferMaxA;
	private JTextField txtFeedingMaxA;
	private JTextField txtOtherModA;
	private JTextField txtWcMobilityModA;
	private JTextField txtTransferModA;
	private JTextField txtFeedingModA;
	private JTextField txtOtherMinA;
	private JTextField txtWcMobilityMinA;
	private JTextField txtTransferMinA;
	private JTextField txtFeedingMinA;
	private JTextField txtOtherCg;
	private JTextField txtWcMobilityCg;
	private JTextField txtTransferCg;
	private JTextField txtFeedingCg;
	private JTextField txtOtherVq;
	private JTextField txtWcMobilityVq;
	private JTextField txtTransferVq;
	private JTextField txtFeedingVq;
	private JTextField txtOtherI;
	private JTextField txtWcMobilityI;
	private JTextField txtTransferI;
	private JTextField txtFeedingI;
	private JLabel circleOneLabel_10;
	private JPanel panel_68;
	private JPanel panel_67;
	private JPanel panel_66;
	private JPanel panel_65;
	private JPanel panel_64;
	private JPanel panel_63;
	private JPanel panel_62;
	private JPanel panel_61;
	private JLabel feedingLabel_10;
	private JPanel panel_60;
	private JPanel panel_59;
	private JPanel panel_58;
	private JPanel panel_57;
	private JPanel panel_56;
	private JLabel feedingLabel_9;
	private JPanel panel_55;
	private JPanel panel_54;
	private JPanel panel_53;
	private JPanel panel_52;
	private JPanel panel_51;
	private JLabel feedingLabel_8;
	private JPanel panel_50;
	private JPanel panel_49;
	private JPanel panel_48;
	private JPanel panel_47;
	private JPanel panel_46;
	private JLabel feedingLabel_7;
	private JPanel panel_45;
	private JPanel panel_44;
	private JPanel panel_43;
	private JPanel panel_42;
	private JPanel panel_41;
	private JLabel feedingLabel_6;
	private JPanel panel_40;
	private JPanel panel_39;
	private JPanel panel_38;
	private JPanel panel_37;
	private JPanel panel_36;
	private JLabel feedingLabel_5;
	private JPanel panel_35;
	private JPanel panel_34;
	private JLabel feedingLabel_4;
	private JPanel panel_33;
	private JPanel panel_32;
	private JPanel panel_31;
	private JPanel panel_30;
	private JPanel panel_29;
	private JTextField txtOtherField;
	private JLabel feedingLabel_3;
	private JLabel feedingLabel_2;
	private JLabel feedingLabel_1;
	private JLabel feedingLabel;
	private JPanel panel_28;
	private JPanel panel_27;
	private JPanel panel_26;
	private JPanel panel_24;
	private JPanel panel_23;
	private JPanel panel_22;
	private JTextField txtPositionLes;
	private JLabel ageLabel_20;
	private JLabel ageLabel_19;
	private JTextField txtPositionUes;
	private JLabel ageLabel_18;
	private JLabel ageLabel_17;
	private JTextField txtPositionTrunk;
	private JLabel ageLabel_16;
	private JLabel ageLabel_15;
	private JTextField txtPositionHead;
	private JLabel ageLabel_14;
	private JLabel ageLabel_13;
	private JLabel ageLabel_12;
	private JTextField txtSittingBalanceDynamic;
	private JLabel circleOneLabel_9;
	private JTextField txtSittingBalanceStatic;
	private JLabel circleOneLabel_8;
	private JComboBox cmbSignatureTherapy;
	private JLabel ageLabel_11;
	private JLabel shortTermGoalsLabel_8;
	private JDateChooser dcSafetyCircleRecentDates;
	private JLabel shortTermGoalsLabel_7;
	private JCheckBox cbSafetyCircleHxOfFalls;
	private JCheckBox cbSafetyCircleRiskForFalls;
	private JCheckBox cbSafetyCirclePoor;
	private ButtonGroup bgSkinCondition = new ButtonGroup();
	private JCheckBox cbSafetyCircleGood;
	private JLabel circleOneLabel_7;
	private JLabel ageLabel_10;
	private JTextField textField_22;
	private JLabel circleOneLabel_6;
	private JRadioButton rbSkinConditionAatRiskFor;
	private JRadioButton rbSkinConditionPressureSores;
	private JRadioButton rbSkinConditionDecubiti;
	private JRadioButton rbSkinConditionGood;
	private JLabel circleOneLabel_5;
	private JLabel ageLabel_9;
	private JTextField txtCurPositiongPositDevices;
	private JLabel circleOneLabel_4;
	private JTextField txtCurPositiongOther;
	private JLabel circleOneLabel_3;
	private JLabel shortTermGoalsLabel_6;
	private JTextField txtCurPositiongRestraintSpecify;
	private JLabel shortTermGoalsLabel_5;
	private JCheckBox cbCurPositiongRestraint;
	private JCheckBox cbCurPositiongBed;
	private JCheckBox cbCurPositiongGerichair;
	private JCheckBox cbCurPositiongWheelchair;
	private JLabel circleOneLabel_2;
	private JLabel ageLabel_8;
	private JLabel evaluationLabel;
	private JTextField txtInitialAssessmentRecTherapyNaField;
	private JCheckBox cbInitialAssessmentRecTherapyNa;
	private JLabel ageLabel_7;
	private JTextField txtInitialAssessmentPrecautions;
	private JLabel ageLabel_6;
	private JTextField txtInitialAssessmentDcPlan;
	private JLabel ageLabel_5;
	private JTextField txtInitialAssessmentPmh;
	private JLabel ageLabel_4;
	private JTextField txtInitialAssessmentPlof;
	private JLabel ageLabel_3;
	private JTextArea txtReasonForReferral;
	private JLabel circleOneLabel_1;
	private JLabel resonForReferralhistoryLabel;
	private ButtonGroup bgRehabPot = new ButtonGroup();
	private JRadioButton rbRehabPotGood;
	private JRadioButton rbRehabPotVeryGood;
	private JRadioButton rbRehabPotExcellent;
	private JLabel circleOneLabel;
	private JLabel ageLabel_2;
	private JTextField txtInitialAssessmentRefBy;
	private JLabel ageLabel_1;
	private JTextField txtInitialAssessmentAge;
	private JLabel ageLabel;
	private JLabel label_15;
	private JPanel panel_20;
	private JLabel shortTermGoalsLabel_4;
	private JLabel physicianNameLabel_6;
	private JPanel panel_21;
	private JCheckBox cbCertificationNa;
	private JDateChooser dcCertificationThroughDate;
	private JDateChooser dcCertificationFromDate;
	private JLabel physicianNameLabel_5;
	private JLabel physicianNameLabel_4;
	private JLabel physicianNameLabel_3;
	private JPanel panel_19;
	private JCheckBox cbPhysicianNaOnFile;
	private JComboBox cmbPhysicianSign;
	private JLabel physicianNameLabel_2;
	private JDateChooser dcPhysicianDate;
	private JLabel physicianNameLabel_1;
	private JTextField txtPhysicianName;
	private JLabel physicianNameLabel;
	private JTextArea textArea_3;
	private JTextArea txtPlanOfCare;
	private JLabel label_14;
	private JPanel panel_18;
	private JTextArea txtPlanOfTreatmentOutcome;
	private JLabel shortTermGoalsLabel_3;
	private JTextField txtLongTermGoalWks;
	private JLabel shortTermGoalsLabel_2;
	private JLabel outcomeLabel;
	private JTextArea txtPlanOfTreatmentShort;
	private JLabel shortTermGoalsLabel_1;
	private JTextField txtShortTermGoalWks;
	private JLabel shortTermGoalsLabel;
	private JLabel label_12;
	private JPanel panel_5;
	private JDateChooser dcSocDate;
	private JDateChooser dcOnsetDate;
	private JTextField txtPrimaryDiagnosis;
	private JLabel label_13;
	private JLabel pertinentMedicalDxLabel;
	private JTextField txtTreatmentDiagnosis;
	private JLabel label_11;
	private JPanel panel_17;
	private JLabel label_10;
	private JPanel panel_16;
	private JTextField txtFrequencyDuration;
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
	private JTextField txtProviderNo;
	private JLabel label_3;
	private JPanel panel_7;
	private JTextField txt$PatientFirstName;
	private JLabel label_2;
	private JPanel panel_6;
	private JTextField txt$PatientsLastName;
	private JPanel panel_4;
	private JLabel label;
	private JPanel panel_3;
	private JTextField txtPositiongOtherField;
	private JCheckBox cbPositiongOther;
	private JCheckBox cbPositiongPartA;
	private JCheckBox cbPositiongPartB;
	private JLabel hcfa700FormLabel_1;
	private JLabel hcfa700FormLabel;
	private JPanel panel_2;
	private JPanel panel_1;
	private JPanel panel;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelPtOtStPositioningEvaluation() {
		super();
		Global.panelPtOtStPositioningEvaluation = this;
		setPreferredSize(new Dimension(900, 1200));
		setBackground(Color.WHITE);
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(10, 52, 850, 1146);
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

		txt$PatientsLastName = new JTextField();
		txt$PatientsLastName.setBounds(3, 23, 195, 21);
		panel_4.add(txt$PatientsLastName);

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

		txt$PatientFirstName = new JTextField();
		txt$PatientFirstName.setBounds(3, 23, 280, 21);
		panel_6.add(txt$PatientFirstName);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(491, 0, 159, 47);
		panel_3.add(panel_7);

		label_3 = new JLabel();
		label_3.setText("3. PROVIDER NO.");
		label_3.setBounds(3, 3, 122, 14);
		panel_7.add(label_3);

		txtProviderNo = new JTextField();
		txtProviderNo.setBounds(3, 23, 139, 21);
		panel_7.add(txtProviderNo);

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

		txtFrequencyDuration = new JTextField();
		txtFrequencyDuration.setBounds(3, 23, 195, 21);
		panel_15.add(txtFrequencyDuration);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(199, 0, 293, 47);
		panel_14.add(panel_16);

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
		txtPrimaryDiagnosis.setBounds(3, 23, 280, 20);
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

		txtTreatmentDiagnosis = new JTextField();
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

		txtShortTermGoalWks = new JTextField();
		txtShortTermGoalWks.setBounds(128, 23, 81, 20);
		panel_5.add(txtShortTermGoalWks);

		shortTermGoalsLabel_1 = new JLabel();
		shortTermGoalsLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_1.setText("wks)");
		shortTermGoalsLabel_1.setBounds(212, 25, 28, 14);
		panel_5.add(shortTermGoalsLabel_1);

		txtPlanOfTreatmentShort = new JTextArea();
		txtPlanOfTreatmentShort.setWrapStyleWord(true);
		txtPlanOfTreatmentShort.setLineWrap(true);
		txtPlanOfTreatmentShort.setBounds(3, 45, 415, 88);
		panel_5.add(txtPlanOfTreatmentShort);

		outcomeLabel = new JLabel();
		outcomeLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		outcomeLabel.setText("OUTCOME");
		outcomeLabel.setBounds(3, 135, 64, 14);
		panel_5.add(outcomeLabel);

		shortTermGoalsLabel_2 = new JLabel();
		shortTermGoalsLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_2.setText("Long Term Goals (For");
		shortTermGoalsLabel_2.setBounds(66, 135, 120, 14);
		panel_5.add(shortTermGoalsLabel_2);

		txtLongTermGoalWks = new JTextField();
		txtLongTermGoalWks.setBounds(189, 135, 81, 20);
		panel_5.add(txtLongTermGoalWks);

		shortTermGoalsLabel_3 = new JLabel();
		shortTermGoalsLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_3.setText("wks)");
		shortTermGoalsLabel_3.setBounds(274, 135, 28, 14);
		panel_5.add(shortTermGoalsLabel_3);

		txtPlanOfTreatmentOutcome = new JTextArea();
		txtPlanOfTreatmentOutcome.setWrapStyleWord(true);
		txtPlanOfTreatmentOutcome.setLineWrap(true);
		txtPlanOfTreatmentOutcome.setBounds(3, 157, 415, 88);
		panel_5.add(txtPlanOfTreatmentOutcome);

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
		panel_18.setBounds(420, 140, 429, 152);
		panel_1.add(panel_18);

		label_14 = new JLabel();
		label_14.setFont(new Font("Dialog", Font.BOLD, 12));
		label_14.setText("13. PLAN OF CARE");
		label_14.setBounds(3, 3, 159, 14);
		panel_18.add(label_14);

		txtPlanOfCare = new JTextArea();
		txtPlanOfCare.setWrapStyleWord(true);
		txtPlanOfCare.setLineWrap(true);
		txtPlanOfCare.setBounds(3, 23, 423, 118);
		panel_18.add(txtPlanOfCare);

		textArea_3 = new JTextArea();
		textArea_3.setFocusable(false);
		textArea_3.setBackground(Color.WHITE);
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

		txtPhysicianName = new JTextField();
		txtPhysicianName.setBounds(535, 340, 177, 20);
		panel_1.add(txtPhysicianName);

		physicianNameLabel_1 = new JLabel();
		physicianNameLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_1.setText("DATE:");
		physicianNameLabel_1.setBounds(715, 340, 39, 14);
		panel_1.add(physicianNameLabel_1);

		dcPhysicianDate = new JDateChooser();
		dcPhysicianDate.setDateFormatString("MM/dd/yyyy");
		dcPhysicianDate.setBounds(755, 340, 92, 23);
		panel_1.add(dcPhysicianDate);

		physicianNameLabel_2 = new JLabel();
		physicianNameLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_2.setText("PHYSICIAN SIGNATURE:");
		physicianNameLabel_2.setBounds(424, 365, 132, 14);
		panel_1.add(physicianNameLabel_2);

		cmbPhysicianSign = new JComboBox();
		cmbPhysicianSign.setBackground(Color.WHITE);
		cmbPhysicianSign.setBounds(567, 365, 177, 20);
		panel_1.add(cmbPhysicianSign);

		cbPhysicianNaOnFile = new JCheckBox();
		cbPhysicianNaOnFile.setBackground(Color.WHITE);
		cbPhysicianNaOnFile.setText("N/A ON FILE");
		cbPhysicianNaOnFile.setBounds(757, 369, 91, 18);
		panel_1.add(cbPhysicianNaOnFile);

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
		dcCertificationFromDate.setBounds(49, 23, 102, 23);
		panel_19.add(dcCertificationFromDate);

		dcCertificationThroughDate = new JDateChooser();
		dcCertificationThroughDate.setDateFormatString("MM/dd/yyyy");
		dcCertificationThroughDate.setBounds(232, 23, 102, 23);
		panel_19.add(dcCertificationThroughDate);

		cbCertificationNa = new JCheckBox();
		cbCertificationNa.setBackground(Color.LIGHT_GRAY);
		cbCertificationNa.setText("N/A");
		cbCertificationNa.setBounds(350, 23, 69, 18);
		panel_19.add(cbCertificationNa);

		panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		panel_20.setLayout(null);
		panel_20.setBounds(2, 443, 847, 211);
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

		txtInitialAssessmentRefBy = new JTextField();
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

		txtReasonForReferral = new JTextArea();
		txtReasonForReferral.setLineWrap(true);
		txtReasonForReferral.setWrapStyleWord(true);
		txtReasonForReferral.setBounds(3, 69, 841, 65);
		panel_20.add(txtReasonForReferral);

		ageLabel_3 = new JLabel();
		ageLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_3.setText("PLOF:");
		ageLabel_3.setBounds(3, 140, 35, 14);
		panel_20.add(ageLabel_3);

		txtInitialAssessmentPlof = new JTextField();
		txtInitialAssessmentPlof.setBounds(44, 140, 382, 20);
		panel_20.add(txtInitialAssessmentPlof);

		ageLabel_4 = new JLabel();
		ageLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_4.setText("PMH:");
		ageLabel_4.setBounds(444, 140, 35, 14);
		panel_20.add(ageLabel_4);

		txtInitialAssessmentPmh = new JTextField();
		txtInitialAssessmentPmh.setBounds(477, 140, 360, 20);
		panel_20.add(txtInitialAssessmentPmh);

		ageLabel_5 = new JLabel();
		ageLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_5.setText("D/C PLAN/ Pt GOAL:");
		ageLabel_5.setBounds(3, 163, 109, 14);
		panel_20.add(ageLabel_5);

		txtInitialAssessmentDcPlan = new JTextField();
		txtInitialAssessmentDcPlan.setBounds(118, 163, 306, 20);
		panel_20.add(txtInitialAssessmentDcPlan);

		ageLabel_6 = new JLabel();
		ageLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_6.setText("PRECAUSIONS:");
		ageLabel_6.setBounds(426, 163, 88, 14);
		panel_20.add(ageLabel_6);

		txtInitialAssessmentPrecautions = new JTextField();
		txtInitialAssessmentPrecautions.setBounds(520, 163, 317, 20);
		panel_20.add(txtInitialAssessmentPrecautions);

		ageLabel_7 = new JLabel();
		ageLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_7.setText("RECENT THERAPY SERVICES: D/C Dates/Status");
		ageLabel_7.setBounds(3, 187, 266, 14);
		panel_20.add(ageLabel_7);

		cbInitialAssessmentRecTherapyNa = new JCheckBox();
		cbInitialAssessmentRecTherapyNa.setFont(new Font("", Font.BOLD, 12));
		cbInitialAssessmentRecTherapyNa.setBackground(Color.WHITE);
		cbInitialAssessmentRecTherapyNa.setText("N/A");
		cbInitialAssessmentRecTherapyNa.setBounds(296, 187, 48, 18);
		panel_20.add(cbInitialAssessmentRecTherapyNa);

		txtInitialAssessmentRecTherapyNaField = new JTextField();
		txtInitialAssessmentRecTherapyNaField.setBounds(350, 187, 487, 20);
		panel_20.add(txtInitialAssessmentRecTherapyNaField);

		evaluationLabel = new JLabel();
		evaluationLabel.setBorder(new LineBorder(Color.black, 1, false));
		evaluationLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		evaluationLabel.setText("  EVALUATION:");
		evaluationLabel.setBounds(3, 660, 87, 20);
		panel.add(evaluationLabel);

		ageLabel_8 = new JLabel();
		ageLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_8.setText("CURRENT POSITIONING:");
		ageLabel_8.setBounds(3, 690, 134, 14);
		panel.add(ageLabel_8);

		circleOneLabel_2 = new JLabel();
		circleOneLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_2.setText("(circle)");
		circleOneLabel_2.setBounds(138, 690, 38, 14);
		panel.add(circleOneLabel_2);

		cbCurPositiongWheelchair = new JCheckBox();
		cbCurPositiongWheelchair.setFont(new Font("", Font.BOLD, 11));
		cbCurPositiongWheelchair.setBackground(Color.WHITE);
		cbCurPositiongWheelchair.setText("Wheelchair");
		cbCurPositiongWheelchair.setBounds(179, 690, 81, 18);
		panel.add(cbCurPositiongWheelchair);

		cbCurPositiongGerichair = new JCheckBox();
		cbCurPositiongGerichair.setFont(new Font("", Font.BOLD, 11));
		cbCurPositiongGerichair.setBackground(Color.WHITE);
		cbCurPositiongGerichair.setText("Gerichair");
		cbCurPositiongGerichair.setBounds(260, 690, 68, 18);
		panel.add(cbCurPositiongGerichair);

		cbCurPositiongBed = new JCheckBox();
		cbCurPositiongBed.setFont(new Font("", Font.BOLD, 11));
		cbCurPositiongBed.setBackground(Color.WHITE);
		cbCurPositiongBed.setText("Bed");
		cbCurPositiongBed.setBounds(330, 690, 39, 18);
		panel.add(cbCurPositiongBed);

		cbCurPositiongRestraint = new JCheckBox();
		cbCurPositiongRestraint.setFont(new Font("", Font.BOLD, 11));
		cbCurPositiongRestraint.setBackground(Color.WHITE);
		cbCurPositiongRestraint.setText("Restraint");
		cbCurPositiongRestraint.setBounds(370, 690, 68, 18);
		panel.add(cbCurPositiongRestraint);

		shortTermGoalsLabel_5 = new JLabel();
		shortTermGoalsLabel_5.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_5.setText("(Specify");
		shortTermGoalsLabel_5.setBounds(440, 692, 44, 14);
		panel.add(shortTermGoalsLabel_5);

		txtCurPositiongRestraintSpecify = new JTextField();
		txtCurPositiongRestraintSpecify.setBounds(487, 692, 59, 20);
		panel.add(txtCurPositiongRestraintSpecify);

		shortTermGoalsLabel_6 = new JLabel();
		shortTermGoalsLabel_6.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_6.setText(")");
		shortTermGoalsLabel_6.setBounds(548, 692, 4, 14);
		panel.add(shortTermGoalsLabel_6);

		circleOneLabel_3 = new JLabel();
		circleOneLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_3.setText("Other");
		circleOneLabel_3.setBounds(558, 692, 31, 14);
		panel.add(circleOneLabel_3);

		txtCurPositiongOther = new JTextField();
		txtCurPositiongOther.setBounds(592, 692, 76, 20);
		panel.add(txtCurPositiongOther);

		circleOneLabel_4 = new JLabel();
		circleOneLabel_4.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_4.setText("Posit. Devices");
		circleOneLabel_4.setBounds(669, 692, 81, 14);
		panel.add(circleOneLabel_4);

		txtCurPositiongPositDevices = new JTextField();
		txtCurPositiongPositDevices.setBounds(753, 692, 87, 20);
		panel.add(txtCurPositiongPositDevices);

		ageLabel_9 = new JLabel();
		ageLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_9.setText("SKIN CONDITION:");
		ageLabel_9.setBounds(3, 713, 96, 14);
		panel.add(ageLabel_9);

		circleOneLabel_5 = new JLabel();
		circleOneLabel_5.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_5.setText("(circle one)");
		circleOneLabel_5.setBounds(102, 713, 68, 14);
		panel.add(circleOneLabel_5);

		rbSkinConditionGood = new JRadioButton();
		rbSkinConditionGood.setActionCommand("1");
		bgSkinCondition.add(rbSkinConditionGood);
		rbSkinConditionGood.setFont(new Font("", Font.BOLD, 11));
		rbSkinConditionGood.setBackground(Color.WHITE);
		rbSkinConditionGood.setText("Good");
		rbSkinConditionGood.setBounds(170, 713, 52, 18);
		panel.add(rbSkinConditionGood);

		rbSkinConditionDecubiti = new JRadioButton();
		rbSkinConditionDecubiti.setActionCommand("2");
		bgSkinCondition.add(rbSkinConditionDecubiti);
		rbSkinConditionDecubiti.setFont(new Font("", Font.BOLD, 11));
		rbSkinConditionDecubiti.setBackground(Color.WHITE);
		rbSkinConditionDecubiti.setText("Decubiti");
		rbSkinConditionDecubiti.setBounds(236, 713, 68, 18);
		panel.add(rbSkinConditionDecubiti);

		rbSkinConditionPressureSores = new JRadioButton();
		rbSkinConditionPressureSores.setActionCommand("3");
		bgSkinCondition.add(rbSkinConditionPressureSores);
		rbSkinConditionPressureSores.setFont(new Font("", Font.BOLD, 11));
		rbSkinConditionPressureSores.setBackground(Color.WHITE);
		rbSkinConditionPressureSores.setText("Pressure Sores");
		rbSkinConditionPressureSores.setBounds(310, 713, 106, 18);
		panel.add(rbSkinConditionPressureSores);

		rbSkinConditionAatRiskFor = new JRadioButton();
		bgSkinCondition.add(rbSkinConditionAatRiskFor);
		rbSkinConditionAatRiskFor.setActionCommand("4");
		rbSkinConditionAatRiskFor.setFont(new Font("", Font.BOLD, 11));
		rbSkinConditionAatRiskFor.setBackground(Color.WHITE);
		rbSkinConditionAatRiskFor.setText("At Risk for Tears");
		rbSkinConditionAatRiskFor.setBounds(422, 713, 111, 18);
		panel.add(rbSkinConditionAatRiskFor);

		circleOneLabel_6 = new JLabel();
		circleOneLabel_6.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_6.setText("Other");
		circleOneLabel_6.setBounds(632, 713, 31, 14);
		panel.add(circleOneLabel_6);

		textField_22 = new JTextField();
		textField_22.setBounds(669, 713, 171, 20);
		panel.add(textField_22);

		ageLabel_10 = new JLabel();
		ageLabel_10.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_10.setText("SAFETY:");
		ageLabel_10.setBounds(3, 736, 52, 14);
		panel.add(ageLabel_10);

		circleOneLabel_7 = new JLabel();
		circleOneLabel_7.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_7.setText("(circle)");
		circleOneLabel_7.setBounds(52, 736, 38, 14);
		panel.add(circleOneLabel_7);

		cbSafetyCircleGood = new JCheckBox();
		cbSafetyCircleGood.setFont(new Font("", Font.BOLD, 11));
		cbSafetyCircleGood.setBackground(Color.WHITE);
		cbSafetyCircleGood.setText("Good");
		cbSafetyCircleGood.setBounds(91, 736, 50, 18);
		panel.add(cbSafetyCircleGood);

		cbSafetyCirclePoor = new JCheckBox();
		cbSafetyCirclePoor.setFont(new Font("", Font.BOLD, 11));
		cbSafetyCirclePoor.setBackground(Color.WHITE);
		cbSafetyCirclePoor.setText("Poor");
		cbSafetyCirclePoor.setBounds(142, 736, 44, 18);
		panel.add(cbSafetyCirclePoor);

		cbSafetyCircleRiskForFalls = new JCheckBox();
		cbSafetyCircleRiskForFalls.setFont(new Font("", Font.BOLD, 11));
		cbSafetyCircleRiskForFalls.setBackground(Color.WHITE);
		cbSafetyCircleRiskForFalls.setText("Risk For Falls");
		cbSafetyCircleRiskForFalls.setBounds(187, 736, 91, 18);
		panel.add(cbSafetyCircleRiskForFalls);

		cbSafetyCircleHxOfFalls = new JCheckBox();
		cbSafetyCircleHxOfFalls.setFont(new Font("", Font.BOLD, 11));
		cbSafetyCircleHxOfFalls.setBackground(Color.WHITE);
		cbSafetyCircleHxOfFalls.setText("Hx of Falls ");
		cbSafetyCircleHxOfFalls.setBounds(280, 736, 76, 18);
		panel.add(cbSafetyCircleHxOfFalls);

		shortTermGoalsLabel_7 = new JLabel();
		shortTermGoalsLabel_7.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_7.setText("(recent dates");
		shortTermGoalsLabel_7.setBounds(358, 738, 75, 14);
		panel.add(shortTermGoalsLabel_7);

		dcSafetyCircleRecentDates = new JDateChooser();
		dcSafetyCircleRecentDates.setDateFormatString("MM/dd/yyyy");
		dcSafetyCircleRecentDates.setBounds(435, 734, 92, 23);
		panel.add(dcSafetyCircleRecentDates);

		shortTermGoalsLabel_8 = new JLabel();
		shortTermGoalsLabel_8.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_8.setText(")");
		shortTermGoalsLabel_8.setBounds(529, 738, 4, 14);
		panel.add(shortTermGoalsLabel_8);

		ageLabel_11 = new JLabel();
		ageLabel_11.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_11.setText("SITTING BALANCE:");
		ageLabel_11.setBounds(533, 738, 106, 14);
		panel.add(ageLabel_11);

		circleOneLabel_8 = new JLabel();
		circleOneLabel_8.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_8.setText("static");
		circleOneLabel_8.setBounds(638, 738, 31, 14);
		panel.add(circleOneLabel_8);

		txtSittingBalanceStatic = new JTextField();
		txtSittingBalanceStatic.setBounds(669, 738, 63, 21);
		panel.add(txtSittingBalanceStatic);

		circleOneLabel_9 = new JLabel();
		circleOneLabel_9.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_9.setText("dynamic");
		circleOneLabel_9.setBounds(732, 738, 46, 14);
		panel.add(circleOneLabel_9);

		txtSittingBalanceDynamic = new JTextField();
		txtSittingBalanceDynamic.setBounds(779, 738, 68, 20);
		panel.add(txtSittingBalanceDynamic);

		ageLabel_12 = new JLabel();
		ageLabel_12.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_12.setText("POSITION:");
		ageLabel_12.setBounds(3, 759, 59, 14);
		panel.add(ageLabel_12);

		ageLabel_13 = new JLabel();
		ageLabel_13.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_13.setText("HEAD/NECK:");
		ageLabel_13.setBounds(78, 759, 68, 14);
		panel.add(ageLabel_13);

		ageLabel_14 = new JLabel();
		ageLabel_14.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_14.setText("WFL / limited");
		ageLabel_14.setBounds(154, 759, 76, 14);
		panel.add(ageLabel_14);

		txtPositionUes = new JTextField();
		txtPositionUes.setBounds(236, 759, 218, 20);
		panel.add(txtPositionUes);

		ageLabel_15 = new JLabel();
		ageLabel_15.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_15.setText("TRUNK:");
		ageLabel_15.setBounds(460, 759, 44, 14);
		panel.add(ageLabel_15);

		ageLabel_16 = new JLabel();
		ageLabel_16.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_16.setText("WFL / limited");
		ageLabel_16.setBounds(505, 759, 76, 14);
		panel.add(ageLabel_16);

		txtPositionTrunk = new JTextField();
		txtPositionTrunk.setBounds(584, 759, 256, 20);
		panel.add(txtPositionTrunk);

		ageLabel_17 = new JLabel();
		ageLabel_17.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_17.setText("UE'S:");
		ageLabel_17.setBounds(115, 779, 31, 14);
		panel.add(ageLabel_17);

		ageLabel_18 = new JLabel();
		ageLabel_18.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_18.setText("WFL / limited");
		ageLabel_18.setBounds(154, 779, 76, 14);
		panel.add(ageLabel_18);

		txtPositionUes = new JTextField();
		txtPositionUes.setBounds(236, 779, 218, 20);
		panel.add(txtPositionUes);

		ageLabel_19 = new JLabel();
		ageLabel_19.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_19.setText("LE'S:");
		ageLabel_19.setBounds(473, 779, 31, 14);
		panel.add(ageLabel_19);

		ageLabel_20 = new JLabel();
		ageLabel_20.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_20.setText("WFL / limited");
		ageLabel_20.setBounds(505, 779, 76, 14);
		panel.add(ageLabel_20);

		txtPositionLes = new JTextField();
		txtPositionLes.setBounds(584, 779, 256, 20);
		panel.add(txtPositionLes);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setBackground(Color.WHITE);
		panel_22.setLayout(null);
		panel_22.setBounds(0, 806, 850, 133);
		panel.add(panel_22);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setBackground(Color.WHITE);
		panel_23.setLayout(null);
		panel_23.setBounds(0, 0, 159, 133);
		panel_22.add(panel_23);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setBackground(Color.WHITE);
		panel_24.setLayout(null);
		panel_24.setBounds(0, 0, 159, 23);
		panel_23.add(panel_24);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(0, 22, 159, 23);
		panel_23.add(panel_26);

		feedingLabel = new JLabel();
		feedingLabel.setFont(new Font("", Font.BOLD, 11));
		feedingLabel.setText("Feeding");
		feedingLabel.setBounds(3, 3, 54, 14);
		panel_26.add(feedingLabel);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(0, 44, 159, 23);
		panel_23.add(panel_27);

		feedingLabel_1 = new JLabel();
		feedingLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_1.setText("Transfer/Bed Mob.");
		feedingLabel_1.setBounds(3, 3, 118, 14);
		panel_27.add(feedingLabel_1);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 66, 159, 23);
		panel_23.add(panel_28);

		feedingLabel_2 = new JLabel();
		feedingLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_2.setText("W/C Mobility");
		feedingLabel_2.setBounds(3, 3, 77, 14);
		panel_28.add(feedingLabel_2);

		feedingLabel_3 = new JLabel();
		feedingLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_3.setText("Other:");
		feedingLabel_3.setBounds(3, 93, 43, 14);
		panel_23.add(feedingLabel_3);

		txtOtherField = new JTextField();
		txtOtherField.setBounds(3, 110, 153, 21);
		panel_23.add(txtOtherField);

		panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(157, 0, 41, 133);
		panel_22.add(panel_29);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(0, 0, 41, 23);
		panel_29.add(panel_30);

		feedingLabel_4 = new JLabel();
		feedingLabel_4.setFont(new Font("", Font.BOLD, 14));
		feedingLabel_4.setText("I");
		feedingLabel_4.setBounds(17, 3, 12, 14);
		panel_30.add(feedingLabel_4);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 22, 41, 23);
		panel_29.add(panel_31);

		txtFeedingI = new JTextField();
		txtFeedingI.setBounds(3, 2, 35, 18);
		panel_31.add(txtFeedingI);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(0, 44, 41, 23);
		panel_29.add(panel_32);

		txtTransferI = new JTextField();
		txtTransferI.setBounds(3, 2, 35, 18);
		panel_32.add(txtTransferI);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 66, 41, 23);
		panel_29.add(panel_33);

		txtWcMobilityI = new JTextField();
		txtWcMobilityI.setBounds(3, 2, 35, 18);
		panel_33.add(txtWcMobilityI);

		txtOtherI = new JTextField();
		txtOtherI.setBounds(3, 110, 35, 18);
		panel_29.add(txtOtherI);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(197, 0, 64, 133);
		panel_22.add(panel_34);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(Color.black, 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(0, 0, 64, 23);
		panel_34.add(panel_35);

		feedingLabel_5 = new JLabel();
		feedingLabel_5.setFont(new Font("Dialog", Font.BOLD, 14));
		feedingLabel_5.setText("VQ's/S");
		feedingLabel_5.setBounds(10, 3, 44, 14);
		panel_35.add(feedingLabel_5);

		panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setBounds(0, 22, 64, 23);
		panel_34.add(panel_36);

		txtFeedingVq = new JTextField();
		txtFeedingVq.setBounds(3, 2, 54, 18);
		panel_36.add(txtFeedingVq);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(0, 44, 64, 23);
		panel_34.add(panel_37);

		txtTransferVq = new JTextField();
		txtTransferVq.setBounds(3, 2, 54, 18);
		panel_37.add(txtTransferVq);

		panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(0, 66, 64, 23);
		panel_34.add(panel_38);

		txtWcMobilityVq = new JTextField();
		txtWcMobilityVq.setBounds(3, 2, 54, 18);
		panel_38.add(txtWcMobilityVq);

		txtOtherVq = new JTextField();
		txtOtherVq.setBounds(3, 110, 54, 18);
		panel_34.add(txtOtherVq);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(259, 0, 41, 133);
		panel_22.add(panel_39);

		panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(Color.black, 1, false));
		panel_40.setLayout(null);
		panel_40.setBackground(Color.WHITE);
		panel_40.setBounds(0, 0, 41, 23);
		panel_39.add(panel_40);

		feedingLabel_6 = new JLabel();
		feedingLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));
		feedingLabel_6.setText("CG");
		feedingLabel_6.setBounds(10, 3, 25, 14);
		panel_40.add(feedingLabel_6);

		panel_41 = new JPanel();
		panel_41.setBorder(new LineBorder(Color.black, 1, false));
		panel_41.setLayout(null);
		panel_41.setBackground(Color.WHITE);
		panel_41.setBounds(0, 22, 41, 23);
		panel_39.add(panel_41);

		txtFeedingCg = new JTextField();
		txtFeedingCg.setBounds(3, 2, 35, 18);
		panel_41.add(txtFeedingCg);

		panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(Color.black, 1, false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(0, 44, 41, 23);
		panel_39.add(panel_42);

		txtTransferCg = new JTextField();
		txtTransferCg.setBounds(3, 2, 35, 18);
		panel_42.add(txtTransferCg);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(0, 66, 41, 23);
		panel_39.add(panel_43);

		txtWcMobilityCg = new JTextField();
		txtWcMobilityCg.setBounds(3, 2, 35, 18);
		panel_43.add(txtWcMobilityCg);

		txtOtherCg = new JTextField();
		txtOtherCg.setBounds(3, 110, 35, 18);
		panel_39.add(txtOtherCg);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(298, 0, 64, 133);
		panel_22.add(panel_44);

		panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(Color.black, 1, false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(0, 0, 64, 23);
		panel_44.add(panel_45);

		feedingLabel_7 = new JLabel();
		feedingLabel_7.setFont(new Font("Dialog", Font.BOLD, 14));
		feedingLabel_7.setText("Min A");
		feedingLabel_7.setBounds(10, 3, 44, 14);
		panel_45.add(feedingLabel_7);

		panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(Color.black, 1, false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(0, 22, 64, 23);
		panel_44.add(panel_46);

		txtFeedingMinA = new JTextField();
		txtFeedingMinA.setBounds(3, 2, 54, 18);
		panel_46.add(txtFeedingMinA);

		panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(Color.black, 1, false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(0, 44, 64, 23);
		panel_44.add(panel_47);

		txtTransferMinA = new JTextField();
		txtTransferMinA.setBounds(3, 2, 54, 18);
		panel_47.add(txtTransferMinA);

		panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(Color.black, 1, false));
		panel_48.setLayout(null);
		panel_48.setBackground(Color.WHITE);
		panel_48.setBounds(0, 66, 64, 23);
		panel_44.add(panel_48);

		txtWcMobilityMinA = new JTextField();
		txtWcMobilityMinA.setBounds(3, 2, 54, 18);
		panel_48.add(txtWcMobilityMinA);

		txtOtherMinA = new JTextField();
		txtOtherMinA.setBounds(3, 110, 54, 18);
		panel_44.add(txtOtherMinA);

		panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(Color.black, 1, false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(360, 0, 64, 133);
		panel_22.add(panel_49);

		panel_50 = new JPanel();
		panel_50.setBorder(new LineBorder(Color.black, 1, false));
		panel_50.setLayout(null);
		panel_50.setBackground(Color.WHITE);
		panel_50.setBounds(0, 0, 64, 23);
		panel_49.add(panel_50);

		feedingLabel_8 = new JLabel();
		feedingLabel_8.setFont(new Font("Dialog", Font.BOLD, 14));
		feedingLabel_8.setText("Mod A");
		feedingLabel_8.setBounds(10, 3, 44, 14);
		panel_50.add(feedingLabel_8);

		panel_51 = new JPanel();
		panel_51.setBorder(new LineBorder(Color.black, 1, false));
		panel_51.setLayout(null);
		panel_51.setBackground(Color.WHITE);
		panel_51.setBounds(0, 22, 64, 23);
		panel_49.add(panel_51);

		txtFeedingModA = new JTextField();
		txtFeedingModA.setBounds(3, 2, 54, 18);
		panel_51.add(txtFeedingModA);

		panel_52 = new JPanel();
		panel_52.setBorder(new LineBorder(Color.black, 1, false));
		panel_52.setLayout(null);
		panel_52.setBackground(Color.WHITE);
		panel_52.setBounds(0, 44, 64, 23);
		panel_49.add(panel_52);

		txtTransferModA = new JTextField();
		txtTransferModA.setBounds(3, 2, 54, 18);
		panel_52.add(txtTransferModA);

		panel_53 = new JPanel();
		panel_53.setBorder(new LineBorder(Color.black, 1, false));
		panel_53.setLayout(null);
		panel_53.setBackground(Color.WHITE);
		panel_53.setBounds(0, 66, 64, 23);
		panel_49.add(panel_53);

		txtWcMobilityModA = new JTextField();
		txtWcMobilityModA.setBounds(3, 2, 54, 18);
		panel_53.add(txtWcMobilityModA);

		txtOtherModA = new JTextField();
		txtOtherModA.setBounds(3, 110, 54, 18);
		panel_49.add(txtOtherModA);

		panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(Color.black, 1, false));
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(422, 0, 64, 133);
		panel_22.add(panel_54);

		panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(Color.black, 1, false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(0, 0, 64, 23);
		panel_54.add(panel_55);

		feedingLabel_9 = new JLabel();
		feedingLabel_9.setFont(new Font("Dialog", Font.BOLD, 14));
		feedingLabel_9.setText("Max A");
		feedingLabel_9.setBounds(10, 3, 44, 14);
		panel_55.add(feedingLabel_9);

		panel_56 = new JPanel();
		panel_56.setBorder(new LineBorder(Color.black, 1, false));
		panel_56.setLayout(null);
		panel_56.setBackground(Color.WHITE);
		panel_56.setBounds(0, 22, 64, 23);
		panel_54.add(panel_56);

		txtFeedingMaxA = new JTextField();
		txtFeedingMaxA.setBounds(3, 2, 54, 18);
		panel_56.add(txtFeedingMaxA);

		panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(Color.black, 1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(0, 44, 64, 23);
		panel_54.add(panel_57);

		txtTransferMaxA = new JTextField();
		txtTransferMaxA.setBounds(3, 2, 54, 18);
		panel_57.add(txtTransferMaxA);

		panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(Color.black, 1, false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(0, 66, 64, 23);
		panel_54.add(panel_58);

		txtWcMobilityMaxA = new JTextField();
		txtWcMobilityMaxA.setBounds(3, 2, 54, 18);
		panel_58.add(txtWcMobilityMaxA);

		txtOtherMaxA = new JTextField();
		txtOtherMaxA.setBounds(3, 110, 54, 18);
		panel_54.add(txtOtherMaxA);

		panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(Color.black, 1, false));
		panel_59.setLayout(null);
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(484, 0, 41, 133);
		panel_22.add(panel_59);

		panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(Color.black, 1, false));
		panel_60.setLayout(null);
		panel_60.setBackground(Color.WHITE);
		panel_60.setBounds(0, 0, 41, 23);
		panel_59.add(panel_60);

		feedingLabel_10 = new JLabel();
		feedingLabel_10.setFont(new Font("Dialog", Font.BOLD, 14));
		feedingLabel_10.setText("Dep");
		feedingLabel_10.setBounds(3, 3, 30, 14);
		panel_60.add(feedingLabel_10);

		panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(Color.black, 1, false));
		panel_61.setLayout(null);
		panel_61.setBackground(Color.WHITE);
		panel_61.setBounds(0, 22, 41, 23);
		panel_59.add(panel_61);

		txtFeedingDep = new JTextField();
		txtFeedingDep.setBounds(3, 2, 35, 18);
		panel_61.add(txtFeedingDep);

		panel_62 = new JPanel();
		panel_62.setBorder(new LineBorder(Color.black, 1, false));
		panel_62.setLayout(null);
		panel_62.setBackground(Color.WHITE);
		panel_62.setBounds(0, 44, 41, 23);
		panel_59.add(panel_62);

		txtTransferDep = new JTextField();
		txtTransferDep.setBounds(3, 2, 35, 18);
		panel_62.add(txtTransferDep);

		panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(Color.black, 1, false));
		panel_63.setLayout(null);
		panel_63.setBackground(Color.WHITE);
		panel_63.setBounds(0, 66, 41, 23);
		panel_59.add(panel_63);

		txtWcMobilityDep = new JTextField();
		txtWcMobilityDep.setBounds(3, 2, 35, 18);
		panel_63.add(txtWcMobilityDep);

		txtOtherDep = new JTextField();
		txtOtherDep.setBounds(3, 110, 35, 18);
		panel_59.add(txtOtherDep);

		panel_64 = new JPanel();
		panel_64.setBorder(new LineBorder(Color.black, 1, false));
		panel_64.setLayout(null);
		panel_64.setBackground(Color.WHITE);
		panel_64.setBounds(523, 0, 327, 133);
		panel_22.add(panel_64);

		panel_65 = new JPanel();
		panel_65.setBorder(new LineBorder(Color.black, 1, false));
		panel_65.setLayout(null);
		panel_65.setBackground(Color.WHITE);
		panel_65.setBounds(0, 0, 327, 23);
		panel_64.add(panel_65);

		circleOneLabel_10 = new JLabel();
		circleOneLabel_10.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_10.setText("Adaptive Devices/Comments");
		circleOneLabel_10.setBounds(70, 3, 173, 14);
		panel_65.add(circleOneLabel_10);

		panel_66 = new JPanel();
		panel_66.setBorder(new LineBorder(Color.black, 1, false));
		panel_66.setLayout(null);
		panel_66.setBackground(Color.WHITE);
		panel_66.setBounds(0, 22, 327, 23);
		panel_64.add(panel_66);

		txtFeedingAdaptive = new JTextField();
		txtFeedingAdaptive.setBounds(23, 2, 275, 18);
		panel_66.add(txtFeedingAdaptive);

		panel_67 = new JPanel();
		panel_67.setBorder(new LineBorder(Color.black, 1, false));
		panel_67.setLayout(null);
		panel_67.setBackground(Color.WHITE);
		panel_67.setBounds(0, 44, 327, 23);
		panel_64.add(panel_67);

		txtTransferAdaptive = new JTextField();
		txtTransferAdaptive.setBounds(23, 2, 275, 18);
		panel_67.add(txtTransferAdaptive);

		panel_68 = new JPanel();
		panel_68.setBorder(new LineBorder(Color.black, 1, false));
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(0, 66, 327, 23);
		panel_64.add(panel_68);

		txtWcMobilityAdaptive = new JTextField();
		txtWcMobilityAdaptive.setBounds(23, 2, 275, 18);
		panel_68.add(txtWcMobilityAdaptive);

		txtOtherAdaptive = new JTextField();
		txtOtherAdaptive.setBounds(23, 110, 275, 18);
		panel_64.add(txtOtherAdaptive);

		howIsPositioningLabel = new JLabel();
		howIsPositioningLabel.setFont(new Font("", Font.BOLD, 12));
		howIsPositioningLabel
				.setText("HOW IS POSITIONING AFFECTING SAFETY/FUNCTION?");
		howIsPositioningLabel.setBounds(3, 951, 297, 18);
		panel.add(howIsPositioningLabel);

		txtHowPositioning = new JTextField();
		txtHowPositioning.setBounds(310, 951, 530, 20);
		panel.add(txtHowPositioning);

		ageLabel_21 = new JLabel();
		ageLabel_21.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_21.setText("COGNITION:");
		ageLabel_21.setBounds(3, 975, 76, 14);
		panel.add(ageLabel_21);

		circleOneLabel_11 = new JLabel();
		circleOneLabel_11.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_11.setText("(circle)");
		circleOneLabel_11.setBounds(72, 975, 38, 14);
		panel.add(circleOneLabel_11);

		cbCognitionAlert = new JCheckBox();
		cbCognitionAlert.setFont(new Font("", Font.BOLD, 12));
		cbCognitionAlert.setBackground(Color.WHITE);
		cbCognitionAlert.setText("ALERT");
		cbCognitionAlert.setBounds(115, 975, 59, 18);
		panel.add(cbCognitionAlert);

		cbCognitionOrientedX123 = new JCheckBox();
		cbCognitionOrientedX123.setFont(new Font("", Font.BOLD, 12));
		cbCognitionOrientedX123.setBackground(Color.WHITE);
		cbCognitionOrientedX123.setText("ORIENTED x1, 2, 3");
		cbCognitionOrientedX123.setBounds(175, 975, 118, 18);
		panel.add(cbCognitionOrientedX123);

		cbCognitionOther = new JCheckBox();
		cbCognitionOther.setFont(new Font("", Font.BOLD, 12));
		cbCognitionOther.setBackground(Color.WHITE);
		cbCognitionOther.setText("OTHER");
		cbCognitionOther.setBounds(298, 975, 59, 18);
		panel.add(cbCognitionOther);

		txtCognitionOtherField = new JTextField();
		txtCognitionOtherField.setBounds(359, 973, 124, 21);
		panel.add(txtCognitionOtherField);

		cbCognitionDecreasedVision = new JCheckBox();
		cbCognitionDecreasedVision.setFont(new Font("", Font.BOLD, 12));
		cbCognitionDecreasedVision.setBackground(Color.WHITE);
		cbCognitionDecreasedVision.setText("DECREASED VISION / HEARING");
		cbCognitionDecreasedVision.setBounds(491, 975, 188, 18);
		panel.add(cbCognitionDecreasedVision);

		cbCognitionAphasia = new JCheckBox();
		cbCognitionAphasia.setFont(new Font("", Font.BOLD, 12));
		cbCognitionAphasia.setBackground(Color.WHITE);
		cbCognitionAphasia.setText("APHASIA");
		cbCognitionAphasia.setBounds(701, 975, 94, 18);
		panel.add(cbCognitionAphasia);

		ageLabel_22 = new JLabel();
		ageLabel_22.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_22.setText("FOLLOWS COMMANDS:");
		ageLabel_22.setBounds(3, 999, 134, 14);
		panel.add(ageLabel_22);

		circleOneLabel_12 = new JLabel();
		circleOneLabel_12.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_12.setText("(circle one)");
		circleOneLabel_12.setBounds(138, 999, 68, 14);
		panel.add(circleOneLabel_12);

		rbFollowComTactileCuesNeeded = new JRadioButton();
		rbFollowComTactileCuesNeeded.setActionCommand("1");
		bgFollowCom.add(rbFollowComTactileCuesNeeded);
		rbFollowComTactileCuesNeeded.setFont(new Font("", Font.BOLD, 12));
		rbFollowComTactileCuesNeeded.setBackground(Color.WHITE);
		rbFollowComTactileCuesNeeded.setText("TACTILE CUES NEEDED");
		rbFollowComTactileCuesNeeded.setBounds(230, 998, 147, 18);
		panel.add(rbFollowComTactileCuesNeeded);

		rbFollowCom1Step = new JRadioButton();
		rbFollowCom1Step.setActionCommand("2");
		bgFollowCom.add(rbFollowCom1Step);
		rbFollowCom1Step.setFont(new Font("", Font.BOLD, 12));
		rbFollowCom1Step.setBackground(Color.WHITE);
		rbFollowCom1Step.setText("1 STEP");
		rbFollowCom1Step.setBounds(440, 998, 59, 18);
		panel.add(rbFollowCom1Step);

		rbFollowCom2Step = new JRadioButton();
		rbFollowCom2Step.setActionCommand("3");
		bgFollowCom.add(rbFollowCom2Step);
		rbFollowCom2Step.setFont(new Font("", Font.BOLD, 12));
		rbFollowCom2Step.setBackground(Color.WHITE);
		rbFollowCom2Step.setText("2 STEP");
		rbFollowCom2Step.setBounds(570, 999, 68, 18);
		panel.add(rbFollowCom2Step);

		rbFollowComMultiStep = new JRadioButton();
		rbFollowComMultiStep.setActionCommand("4");
		bgFollowCom.add(rbFollowComMultiStep);
		rbFollowComMultiStep.setFont(new Font("", Font.BOLD, 12));
		rbFollowComMultiStep.setBackground(Color.WHITE);
		rbFollowComMultiStep.setText("MELTI-STEP");
		rbFollowComMultiStep.setBounds(701, 999, 87, 18);
		panel.add(rbFollowComMultiStep);

		ageLabel_23 = new JLabel();
		ageLabel_23.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_23.setText("RECOMMENDATION / IMPRESSION:");
		ageLabel_23.setBounds(3, 1023, 203, 14);
		panel.add(ageLabel_23);

		txtRecommendationImp = new JTextArea();
		txtRecommendationImp.setWrapStyleWord(true);
		txtRecommendationImp.setLineWrap(true);
		txtRecommendationImp.setBounds(5, 1043, 839, 93);
		panel.add(txtRecommendationImp);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 21, 850, 25);
		add(panel_2);

		hcfa700FormLabel = new JLabel();
		hcfa700FormLabel.setFont(new Font("", Font.BOLD, 14));
		hcfa700FormLabel.setText("HCFA      700 Form:");
		hcfa700FormLabel.setBounds(3, 3, 147, 14);
		panel_2.add(hcfa700FormLabel);

		hcfa700FormLabel_1 = new JLabel();
		hcfa700FormLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		hcfa700FormLabel_1.setText("OT POSITIONING EVALUATION");
		hcfa700FormLabel_1.setBounds(205, 3, 205, 14);
		panel_2.add(hcfa700FormLabel_1);

		cbPositiongPartB = new JCheckBox();
		cbPositiongPartB.setFont(new Font("", Font.BOLD, 14));
		cbPositiongPartB.setBackground(Color.WHITE);
		cbPositiongPartB.setText("PART B");
		cbPositiongPartB.setBounds(508, 3, 74, 18);
		panel_2.add(cbPositiongPartB);

		cbPositiongPartA = new JCheckBox();
		cbPositiongPartA.setFont(new Font("", Font.BOLD, 14));
		cbPositiongPartA.setBackground(Color.WHITE);
		cbPositiongPartA.setText("PART A");
		cbPositiongPartA.setBounds(427, 3, 67, 18);
		panel_2.add(cbPositiongPartA);

		cbPositiongOther = new JCheckBox();
		cbPositiongOther.setFont(new Font("", Font.BOLD, 14));
		cbPositiongOther.setBackground(Color.WHITE);
		cbPositiongOther.setText("OTHER");
		cbPositiongOther.setBounds(591, 3, 67, 18);
		panel_2.add(cbPositiongOther);

		txtPositiongOtherField = new JTextField();
		txtPositiongOtherField.setBounds(664, 2, 176, 20);
		panel_2.add(txtPositiongOtherField);

		fillcombo();
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
		cmbPhysicianSign.addItem(user.getUserName());
	}

	public void doSave() {

		PtOtStPositioningEvaluation refPtOtStPositioningEvaluation = new PtOtStPositioningEvaluation();
		refPtOtStPositioningEvaluation
				.setResidentId(Global.currentResidenceKey);

		refPtOtStPositioningEvaluation.setFollowCom(SwingUtils
				.getSelectedButton(bgFollowCom));
		refPtOtStPositioningEvaluation
				.setRecommendationImp(txtRecommendationImp.getText());
		refPtOtStPositioningEvaluation.setCognitionAphasia(cbCognitionAphasia
				.isSelected());
		refPtOtStPositioningEvaluation
				.setCognitionDecreasedVision(cbCognitionDecreasedVision
						.isSelected());
		refPtOtStPositioningEvaluation
				.setCognitionOtherField(txtCognitionOtherField.getText());
		refPtOtStPositioningEvaluation.setCognitionOther(cbCognitionOther
				.isSelected());
		refPtOtStPositioningEvaluation
				.setCognitionOrientedX123(cbCognitionOrientedX123.isSelected());
		refPtOtStPositioningEvaluation.setCognitionAlert(cbCognitionAlert
				.isSelected());
		refPtOtStPositioningEvaluation.setHowPositioning(txtHowPositioning
				.getText());
		refPtOtStPositioningEvaluation.setOtherAdaptive(txtOtherAdaptive
				.getText());
		refPtOtStPositioningEvaluation
				.setWcMobilityAdaptive(txtWcMobilityAdaptive.getText());
		refPtOtStPositioningEvaluation.setTransferAdaptive(txtTransferAdaptive
				.getText());
		refPtOtStPositioningEvaluation.setFeedingAdaptive(txtFeedingAdaptive
				.getText());
		refPtOtStPositioningEvaluation.setOtherDep(txtOtherDep.getText());
		refPtOtStPositioningEvaluation.setWcMobilityDep(txtWcMobilityDep
				.getText());
		refPtOtStPositioningEvaluation.setTransferDep(txtTransferDep.getText());
		refPtOtStPositioningEvaluation.setFeedingDep(txtFeedingDep.getText());
		refPtOtStPositioningEvaluation.setOtherMaxA(txtOtherMaxA.getText());
		refPtOtStPositioningEvaluation.setWcMobilityMaxA(txtWcMobilityMaxA
				.getText());
		refPtOtStPositioningEvaluation.setTransferMaxA(txtTransferMaxA
				.getText());
		refPtOtStPositioningEvaluation.setFeedingMaxA(txtFeedingMaxA.getText());
		refPtOtStPositioningEvaluation.setOtherModA(txtOtherModA.getText());
		refPtOtStPositioningEvaluation.setWcMobilityModA(txtWcMobilityModA
				.getText());
		refPtOtStPositioningEvaluation.setTransferModA(txtTransferModA
				.getText());
		refPtOtStPositioningEvaluation.setFeedingModA(txtFeedingModA.getText());
		refPtOtStPositioningEvaluation.setOtherMinA(txtOtherMinA.getText());
		refPtOtStPositioningEvaluation.setWcMobilityMinA(txtWcMobilityMinA
				.getText());
		refPtOtStPositioningEvaluation.setTransferMinA(txtTransferMinA
				.getText());
		refPtOtStPositioningEvaluation.setFeedingMinA(txtFeedingMinA.getText());
		refPtOtStPositioningEvaluation.setOtherCg(txtOtherCg.getText());
		refPtOtStPositioningEvaluation.setWcMobilityCg(txtWcMobilityCg
				.getText());
		refPtOtStPositioningEvaluation.setTransferCg(txtTransferCg.getText());
		refPtOtStPositioningEvaluation.setFeedingCg(txtFeedingCg.getText());
		refPtOtStPositioningEvaluation.setOtherVq(txtOtherVq.getText());
		refPtOtStPositioningEvaluation.setWcMobilityVq(txtWcMobilityVq
				.getText());
		refPtOtStPositioningEvaluation.setTransferVq(txtTransferVq.getText());
		refPtOtStPositioningEvaluation.setFeedingVq(txtFeedingVq.getText());
		refPtOtStPositioningEvaluation.setOtherI(txtOtherI.getText());
		refPtOtStPositioningEvaluation.setWcMobilityI(txtWcMobilityI.getText());
		refPtOtStPositioningEvaluation.setTransferI(txtTransferI.getText());
		refPtOtStPositioningEvaluation.setFeedingI(txtFeedingI.getText());
		refPtOtStPositioningEvaluation.setOtherField(txtOtherField.getText());
		refPtOtStPositioningEvaluation.setPositionLes(txtPositionLes.getText());
		refPtOtStPositioningEvaluation.setPositionUes(txtPositionUes.getText());
		refPtOtStPositioningEvaluation.setPositionTrunk(txtPositionTrunk
				.getText());
		// refPtOtStPositioningEvaluation.setPositionHead(txtPositionHead.getText());
		refPtOtStPositioningEvaluation
				.setSittingBalanceDynamic(txtSittingBalanceDynamic.getText());
		refPtOtStPositioningEvaluation
				.setSittingBalanceStatic(txtSittingBalanceStatic.getText());
		refPtOtStPositioningEvaluation
				.setSignatureTherapy((String) cmbSignatureTherapy
						.getSelectedItem());
		refPtOtStPositioningEvaluation
				.setSafetyCircleRecentDates(dcSafetyCircleRecentDates.getDate());
		refPtOtStPositioningEvaluation
				.setSafetyCircleHxOfFalls(cbSafetyCircleHxOfFalls.isSelected());
		refPtOtStPositioningEvaluation
				.setSafetyCircleRiskForFalls(cbSafetyCircleRiskForFalls
						.isSelected());
		refPtOtStPositioningEvaluation.setSafetyCirclePoor(cbSafetyCirclePoor
				.isSelected());
		refPtOtStPositioningEvaluation.setSkinCondition(SwingUtils
				.getSelectedButton(bgSkinCondition));
		refPtOtStPositioningEvaluation.setSafetyCircleGood(cbSafetyCircleGood
				.isSelected());
		refPtOtStPositioningEvaluation
				.setCurPositiongPositDevices(txtCurPositiongPositDevices
						.getText());
		refPtOtStPositioningEvaluation
				.setCurPositiongOther(txtCurPositiongOther.getText());
		refPtOtStPositioningEvaluation
				.setCurPositiongRestraintSpecify(txtCurPositiongRestraintSpecify
						.getText());
		refPtOtStPositioningEvaluation
				.setCurPositiongRestraint(cbCurPositiongRestraint.isSelected());
		refPtOtStPositioningEvaluation.setCurPositiongBed(cbCurPositiongBed
				.isSelected());
		refPtOtStPositioningEvaluation
				.setCurPositiongGerichair(cbCurPositiongGerichair.isSelected());
		refPtOtStPositioningEvaluation
				.setCurPositiongWheelchair(cbCurPositiongWheelchair
						.isSelected());
		refPtOtStPositioningEvaluation
				.setInitialAssessmentRecTherapyNaField(txtInitialAssessmentRecTherapyNaField
						.getText());
		refPtOtStPositioningEvaluation
				.setInitialAssessmentRecTherapyNa(cbInitialAssessmentRecTherapyNa
						.isSelected());
		refPtOtStPositioningEvaluation
				.setInitialAssessmentPrecautions(txtInitialAssessmentPrecautions
						.getText());
		refPtOtStPositioningEvaluation
				.setInitialAssessmentDcPlan(txtInitialAssessmentDcPlan
						.getText());
		refPtOtStPositioningEvaluation
				.setInitialAssessmentPmh(txtInitialAssessmentPmh.getText());
		refPtOtStPositioningEvaluation
				.setInitialAssessmentPlof(txtInitialAssessmentPlof.getText());
		refPtOtStPositioningEvaluation
				.setReasonForReferral(txtReasonForReferral.getText());
		refPtOtStPositioningEvaluation.setRehabPot(SwingUtils
				.getSelectedButton(bgRehabPot));
		refPtOtStPositioningEvaluation
				.setInitialAssessmentRefBy(txtInitialAssessmentRefBy.getText());
		refPtOtStPositioningEvaluation
				.setInitialAssessmentAge(txtInitialAssessmentAge.getText());
		refPtOtStPositioningEvaluation.setCertificationNa(cbCertificationNa
				.isSelected());
		refPtOtStPositioningEvaluation
				.setCertificationThroughDate(dcCertificationThroughDate
						.getDate());
		refPtOtStPositioningEvaluation
				.setCertificationFromDate(dcCertificationFromDate.getDate());
		refPtOtStPositioningEvaluation.setPhysicianNaOnFile(cbPhysicianNaOnFile
				.isSelected());
		refPtOtStPositioningEvaluation
				.setPhysicianSign((String) cmbPhysicianSign.getSelectedItem());
		refPtOtStPositioningEvaluation.setPhysicianDate(dcPhysicianDate
				.getDate());
		refPtOtStPositioningEvaluation.setPhysicianName(txtPhysicianName
				.getText());
		refPtOtStPositioningEvaluation.setPlanOfCare(txtPlanOfCare.getText());
		refPtOtStPositioningEvaluation
				.setPlanOfTreatmentOutcome(txtPlanOfTreatmentOutcome.getText());
		refPtOtStPositioningEvaluation.setLongTermGoalWks(txtLongTermGoalWks
				.getText());
		refPtOtStPositioningEvaluation
				.setPlanOfTreatmentShort(txtPlanOfTreatmentShort.getText());
		refPtOtStPositioningEvaluation.setShortTermGoalWks(txtShortTermGoalWks
				.getText());
		refPtOtStPositioningEvaluation.setSocDate(dcSocDate.getDate());
		refPtOtStPositioningEvaluation.setOnsetDate(dcOnsetDate.getDate());
		refPtOtStPositioningEvaluation.setPrimaryDiagnosis(txtPrimaryDiagnosis
				.getText());
		refPtOtStPositioningEvaluation
				.setTreatmentDiagnosis(txtTreatmentDiagnosis.getText());
		refPtOtStPositioningEvaluation
				.setFrequencyDuration(txtFrequencyDuration.getText());
		refPtOtStPositioningEvaluation.setHospitalizationNa(cbHospitalizationNa
				.isSelected());
		refPtOtStPositioningEvaluation
				.setHospitalizationToDate(dcHospitalizationToDate.getDate());
		refPtOtStPositioningEvaluation
				.setHospitalizationFromDate(dcHospitalizationFromDate.getDate());
		refPtOtStPositioningEvaluation.setProviderName(txtProviderName
				.getText());
		refPtOtStPositioningEvaluation.setHicn(txtHicn.getText());
		refPtOtStPositioningEvaluation.setProviderNo(txtProviderNo.getText());
		refPtOtStPositioningEvaluation
				.setPositiongOtherField(txtPositiongOtherField.getText());
		refPtOtStPositioningEvaluation.setPositiongOther(cbPositiongOther
				.isSelected());
		refPtOtStPositioningEvaluation.setPositiongPartA(cbPositiongPartA
				.isSelected());
		refPtOtStPositioningEvaluation.setPositiongPartB(cbPositiongPartB
				.isSelected());

		try {
			Global.currentPtOtStPositioningEvaluationKey = MedrexClientManager
					.getInstance().insertOrUpdatePtOtStPositioningEvaluation(
							refPtOtStPositioningEvaluation);
		} catch (Exception e) {
		}
	}

	public void updateData() {
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			if (rm != null) {
				txt$PatientFirstName.setText(rm.getUserName());
				txt$PatientsLastName.setText(rm.getUserPass());
				txtHicn.setText(rm.getMedicaidNum());
			}

		} catch (Exception e) {

		}
		PtOtStPositioningEvaluation refPtOtStPositioningEvaluation = null;

		if (Global.currentPtOtStPositioningEvaluationKey != 0) {
			try {
				refPtOtStPositioningEvaluation = MedrexClientManager
						.getInstance().getPtOtStPositioningEvaluation(
								Global.currentPtOtStPositioningEvaluationKey);
			} catch (Exception e) {

			}
			SwingUtils.setSelectedButton(bgFollowCom,
					refPtOtStPositioningEvaluation.getFollowCom());
			txtRecommendationImp.setText(refPtOtStPositioningEvaluation
					.getRecommendationImp());
			cbCognitionAphasia.setSelected(refPtOtStPositioningEvaluation
					.isCognitionAphasia());
			cbCognitionDecreasedVision
					.setSelected(refPtOtStPositioningEvaluation
							.isCognitionDecreasedVision());
			txtCognitionOtherField.setText(refPtOtStPositioningEvaluation
					.getCognitionOtherField());
			cbCognitionOther.setSelected(refPtOtStPositioningEvaluation
					.isCognitionOther());
			cbCognitionOrientedX123.setSelected(refPtOtStPositioningEvaluation
					.isCognitionOrientedX123());
			cbCognitionAlert.setSelected(refPtOtStPositioningEvaluation
					.isCognitionAlert());
			txtHowPositioning.setText(refPtOtStPositioningEvaluation
					.getHowPositioning());
			txtOtherAdaptive.setText(refPtOtStPositioningEvaluation
					.getOtherAdaptive());
			txtWcMobilityAdaptive.setText(refPtOtStPositioningEvaluation
					.getWcMobilityAdaptive());
			txtTransferAdaptive.setText(refPtOtStPositioningEvaluation
					.getTransferAdaptive());
			txtFeedingAdaptive.setText(refPtOtStPositioningEvaluation
					.getFeedingAdaptive());
			txtOtherDep.setText(refPtOtStPositioningEvaluation.getOtherDep());
			txtWcMobilityDep.setText(refPtOtStPositioningEvaluation
					.getWcMobilityDep());
			txtTransferDep.setText(refPtOtStPositioningEvaluation
					.getTransferDep());
			txtFeedingDep.setText(refPtOtStPositioningEvaluation
					.getFeedingDep());
			txtOtherMaxA.setText(refPtOtStPositioningEvaluation.getOtherMaxA());
			txtWcMobilityMaxA.setText(refPtOtStPositioningEvaluation
					.getWcMobilityMaxA());
			txtTransferMaxA.setText(refPtOtStPositioningEvaluation
					.getTransferMaxA());
			txtFeedingMaxA.setText(refPtOtStPositioningEvaluation
					.getFeedingMaxA());
			txtOtherModA.setText(refPtOtStPositioningEvaluation.getOtherModA());
			txtWcMobilityModA.setText(refPtOtStPositioningEvaluation
					.getWcMobilityModA());
			txtTransferModA.setText(refPtOtStPositioningEvaluation
					.getTransferModA());
			txtFeedingModA.setText(refPtOtStPositioningEvaluation
					.getFeedingModA());
			txtOtherMinA.setText(refPtOtStPositioningEvaluation.getOtherMinA());
			txtWcMobilityMinA.setText(refPtOtStPositioningEvaluation
					.getWcMobilityMinA());
			txtTransferMinA.setText(refPtOtStPositioningEvaluation
					.getTransferMinA());
			txtFeedingMinA.setText(refPtOtStPositioningEvaluation
					.getFeedingMinA());
			txtOtherCg.setText(refPtOtStPositioningEvaluation.getOtherCg());
			txtWcMobilityCg.setText(refPtOtStPositioningEvaluation
					.getWcMobilityCg());
			txtTransferCg.setText(refPtOtStPositioningEvaluation
					.getTransferCg());
			txtFeedingCg.setText(refPtOtStPositioningEvaluation.getFeedingCg());
			txtOtherVq.setText(refPtOtStPositioningEvaluation.getOtherVq());
			txtWcMobilityVq.setText(refPtOtStPositioningEvaluation
					.getWcMobilityVq());
			txtTransferVq.setText(refPtOtStPositioningEvaluation
					.getTransferVq());
			txtFeedingVq.setText(refPtOtStPositioningEvaluation.getFeedingVq());
			txtOtherI.setText(refPtOtStPositioningEvaluation.getOtherI());
			txtWcMobilityI.setText(refPtOtStPositioningEvaluation
					.getWcMobilityI());
			txtTransferI.setText(refPtOtStPositioningEvaluation.getTransferI());
			txtFeedingI.setText(refPtOtStPositioningEvaluation.getFeedingI());
			txtOtherField.setText(refPtOtStPositioningEvaluation
					.getOtherField());
			txtPositionLes.setText(refPtOtStPositioningEvaluation
					.getPositionLes());
			txtPositionUes.setText(refPtOtStPositioningEvaluation
					.getPositionUes());
			txtPositionTrunk.setText(refPtOtStPositioningEvaluation
					.getPositionTrunk());
			// txtPositionHead.setText(refPtOtStPositioningEvaluation.getPositionHead());
			txtSittingBalanceDynamic.setText(refPtOtStPositioningEvaluation
					.getSittingBalanceDynamic());
			txtSittingBalanceStatic.setText(refPtOtStPositioningEvaluation
					.getSittingBalanceStatic());
			cmbSignatureTherapy.setSelectedItem(refPtOtStPositioningEvaluation
					.getSignatureTherapy());
			dcSafetyCircleRecentDates.setDate(refPtOtStPositioningEvaluation
					.getSafetyCircleRecentDates());
			cbSafetyCircleHxOfFalls.setSelected(refPtOtStPositioningEvaluation
					.isSafetyCircleHxOfFalls());
			cbSafetyCircleRiskForFalls
					.setSelected(refPtOtStPositioningEvaluation
							.isSafetyCircleRiskForFalls());
			cbSafetyCirclePoor.setSelected(refPtOtStPositioningEvaluation
					.isSafetyCirclePoor());
			SwingUtils.setSelectedButton(bgSkinCondition,
					refPtOtStPositioningEvaluation.getSkinCondition());
			cbSafetyCircleGood.setSelected(refPtOtStPositioningEvaluation
					.isSafetyCircleGood());
			txtCurPositiongPositDevices.setText(refPtOtStPositioningEvaluation
					.getCurPositiongPositDevices());
			txtCurPositiongOther.setText(refPtOtStPositioningEvaluation
					.getCurPositiongOther());
			txtCurPositiongRestraintSpecify
					.setText(refPtOtStPositioningEvaluation
							.getCurPositiongRestraintSpecify());
			cbCurPositiongRestraint.setSelected(refPtOtStPositioningEvaluation
					.isCurPositiongRestraint());
			cbCurPositiongBed.setSelected(refPtOtStPositioningEvaluation
					.isCurPositiongBed());
			cbCurPositiongGerichair.setSelected(refPtOtStPositioningEvaluation
					.isCurPositiongGerichair());
			cbCurPositiongWheelchair.setSelected(refPtOtStPositioningEvaluation
					.isCurPositiongWheelchair());
			txtInitialAssessmentRecTherapyNaField
					.setText(refPtOtStPositioningEvaluation
							.getInitialAssessmentRecTherapyNaField());
			cbInitialAssessmentRecTherapyNa
					.setSelected(refPtOtStPositioningEvaluation
							.isInitialAssessmentRecTherapyNa());
			txtInitialAssessmentPrecautions
					.setText(refPtOtStPositioningEvaluation
							.getInitialAssessmentPrecautions());
			txtInitialAssessmentDcPlan.setText(refPtOtStPositioningEvaluation
					.getInitialAssessmentDcPlan());
			txtInitialAssessmentPmh.setText(refPtOtStPositioningEvaluation
					.getInitialAssessmentPmh());
			txtInitialAssessmentPlof.setText(refPtOtStPositioningEvaluation
					.getInitialAssessmentPlof());
			txtReasonForReferral.setText(refPtOtStPositioningEvaluation
					.getReasonForReferral());
			SwingUtils.setSelectedButton(bgRehabPot,
					refPtOtStPositioningEvaluation.getRehabPot());
			txtInitialAssessmentRefBy.setText(refPtOtStPositioningEvaluation
					.getInitialAssessmentRefBy());
			txtInitialAssessmentAge.setText(refPtOtStPositioningEvaluation
					.getInitialAssessmentAge());
			cbCertificationNa.setSelected(refPtOtStPositioningEvaluation
					.isCertificationNa());
			dcCertificationThroughDate.setDate(refPtOtStPositioningEvaluation
					.getCertificationThroughDate());
			dcCertificationFromDate.setDate(refPtOtStPositioningEvaluation
					.getCertificationFromDate());
			cbPhysicianNaOnFile.setSelected(refPtOtStPositioningEvaluation
					.isPhysicianNaOnFile());
			cmbPhysicianSign.setSelectedItem(refPtOtStPositioningEvaluation
					.getPhysicianSign());
			dcPhysicianDate.setDate(refPtOtStPositioningEvaluation
					.getPhysicianDate());
			txtPhysicianName.setText(refPtOtStPositioningEvaluation
					.getPhysicianName());
			txtPlanOfCare.setText(refPtOtStPositioningEvaluation
					.getPlanOfCare());
			txtPlanOfTreatmentOutcome.setText(refPtOtStPositioningEvaluation
					.getPlanOfTreatmentOutcome());
			txtLongTermGoalWks.setText(refPtOtStPositioningEvaluation
					.getLongTermGoalWks());
			txtPlanOfTreatmentShort.setText(refPtOtStPositioningEvaluation
					.getPlanOfTreatmentShort());
			txtShortTermGoalWks.setText(refPtOtStPositioningEvaluation
					.getShortTermGoalWks());
			dcSocDate.setDate(refPtOtStPositioningEvaluation.getSocDate());
			dcOnsetDate.setDate(refPtOtStPositioningEvaluation.getOnsetDate());
			txtPrimaryDiagnosis.setText(refPtOtStPositioningEvaluation
					.getPrimaryDiagnosis());
			txtTreatmentDiagnosis.setText(refPtOtStPositioningEvaluation
					.getTreatmentDiagnosis());
			txtFrequencyDuration.setText(refPtOtStPositioningEvaluation
					.getFrequencyDuration());
			cbHospitalizationNa.setSelected(refPtOtStPositioningEvaluation
					.isHospitalizationNa());
			dcHospitalizationToDate.setDate(refPtOtStPositioningEvaluation
					.getHospitalizationToDate());
			dcHospitalizationFromDate.setDate(refPtOtStPositioningEvaluation
					.getHospitalizationFromDate());
			txtProviderName.setText(refPtOtStPositioningEvaluation
					.getProviderName());
			// txtHicn.setText(refPtOtStPositioningEvaluation.getHicn());
			txtProviderNo.setText(refPtOtStPositioningEvaluation
					.getProviderNo());
			txtPositiongOtherField.setText(refPtOtStPositioningEvaluation
					.getPositiongOtherField());
			cbPositiongOther.setSelected(refPtOtStPositioningEvaluation
					.isPositiongOther());
			cbPositiongPartA.setSelected(refPtOtStPositioningEvaluation
					.isPositiongPartA());
			cbPositiongPartB.setSelected(refPtOtStPositioningEvaluation
					.isPositiongPartB());
		}
	}

}