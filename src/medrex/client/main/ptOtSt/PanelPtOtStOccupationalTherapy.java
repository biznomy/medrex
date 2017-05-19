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
import java.util.Iterator;
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
import medrex.client.utils.Utils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.NursingHome;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.ptOtSt.PtOtStOccupationalTherapy;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.richTextField.RichTextField;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxRichTextField;
import com.sX.swing.notes.JxNotes;
import com.toedter.calendar.JDateChooser;

public class PanelPtOtStOccupationalTherapy extends JPanel {

	private JCheckBox cbMessage;
	private JCheckBox cbToileting;
	private JCheckBox cbHygienegroom;
	private JCheckBox cbUblbDressing;
	private JCheckBox cbEating;
	private JCheckBox cbCognitiveSkills;
	private JCheckBox cbTransferTrain;
	private JCheckBox cbTherapyActivities;
	private JCheckBox cbBedMobilityTraining;
	private JCheckBox cbNeuromuscularReed;
	private JCheckBox cbTherapyExc;
	private JLabel lblSex;
	private JButton btnPlus;
	private ButtonGroup bgFollowsCom = new ButtonGroup();
	private JTextField txtPatientParticipatedNaField;
	private JCheckBox cbPatientParticipatedNa;
	private JCheckBox cbPatientParticipatedIn;
	private JxNotes txtRecommendationImp;
	private JxRichTextField txtVitalsPulseOx;
	private JLabel ageLabel_29;
	private JxRichTextField txtVitalsBp;
	private JLabel ageLabel_28;
	private JxRichTextField txtVitalsHr;
	private JLabel ageLabel_20;
	private JxRichTextField txtSafetyAwareness;
	private JxRichTextField txtBalanceStandDyn;
	private JLabel ageLabel_19;
	private JxRichTextField txtBalanceStandStat;
	private JLabel ageLabel_18;
	private JxRichTextField txtBalanceSitDyn;
	private JLabel ageLabel_17;
	private JxRichTextField txtBalanceSitStat;
	private JLabel ageLabel_16;
	private JLabel ageLabel_15;
	private JxNotes txtTransferCurEquip;
	private JPanel panel_113;
	private JCheckBox cbTransferDep;
	private JPanel panel_112;
	private JCheckBox cbTransferMaxA;
	private JPanel panel_111;
	private JCheckBox cbTransferModA;
	private JPanel panel_110;
	private JCheckBox cbTransferMinA;
	private JPanel panel_109;
	private JCheckBox cbTransferCg;
	private JPanel panel_108;
	private JCheckBox cbTransferVq;
	private JPanel panel_107;
	private JCheckBox cbTransferI;
	private JPanel panel_106;
	private JLabel feedingLabel_14;
	private JPanel panel_105;
	private JxNotes txtBedMobCurEquip;
	private JPanel panel_104;
	private JCheckBox cbBedMobDep;
	private JPanel panel_103;
	private JCheckBox cbBedMobMaxA;
	private JPanel panel_102;
	private JCheckBox cbBedMobModA;
	private JPanel panel_101;
	private JCheckBox cbBedMobMinA;
	private JPanel panel_100;
	private JCheckBox cbBedMobCg;
	private JPanel panel_99;
	private JCheckBox cbBedMobVq;
	private JPanel panel_98;
	private JCheckBox cbBedMobI;
	private JPanel panel_97;
	private JTextArea handToMouthTextArea_3;
	private JLabel feedingLabel_13;
	private JPanel panel_96;
	private JxNotes txtWcMobilityCurEquip;
	private JPanel panel_95;
	private JCheckBox cbWcMobilityDep;
	private JPanel panel_94;
	private JCheckBox cbWcMobilityMaxA;
	private JPanel panel_93;
	private JCheckBox cbWcMobilityModA;
	private JPanel panel_92;
	private JCheckBox cbWcMobilityMinA;
	private JPanel panel_91;
	private JCheckBox cbWcMobilityCg;
	private JPanel panel_90;
	private JCheckBox cbWcMobilityVq;
	private JPanel panel_89;
	private JCheckBox cbWcMobilityI;
	private JPanel panel_88;
	private JLabel feedingLabel_12;
	private JPanel panel_87;
	private JxNotes txtToiletingCurEquip;
	private JPanel panel_86;
	private JCheckBox cbToiletingDep;
	private JPanel panel_85;
	private JCheckBox cbToiletingMaxA;
	private JPanel panel_84;
	private JCheckBox cbToiletingModA;
	private JPanel panel_83;
	private JCheckBox cbToiletingMinA;
	private JPanel panel_82;
	private JCheckBox cbToiletingCg;
	private JPanel panel_81;
	private JCheckBox cbToiletingVq;
	private JPanel panel_80;
	private JCheckBox cbToiletingI;
	private JPanel panel_79;
	private JLabel feedingLabel_11;
	private JPanel panel_78;
	private JxNotes txtHygGroomCurEquip;
	private JPanel panel_77;
	private JCheckBox cbHygGroomDep;
	private JPanel panel_76;
	private JCheckBox cbHygGroomMaxA;
	private JPanel panel_75;
	private JCheckBox cbHygGroomModA;
	private JPanel panel_74;
	private JCheckBox cbHygGroomMinA;
	private JPanel panel_73;
	private JCheckBox cbHygGroomCg;
	private JPanel panel_72;
	private JCheckBox cbHygGroomVq;
	private JPanel panel_71;
	private JCheckBox cbHygGroomI;
	private JPanel panel_70;
	private JLabel hairteethLabel;
	private JLabel feedingLabel_3;
	private JPanel panel_69;
	private JxNotes txtLeDressCurEquip;
	private JPanel panel_67;
	private JCheckBox cbLeDressDep;
	private JPanel panel_62;
	private JCheckBox cbLeDressMaxA;
	private JPanel panel_57;
	private JCheckBox cbLeDressModA;
	private JPanel panel_52;
	private JCheckBox cbLeDressMinA;
	private JPanel panel_47;
	private JCheckBox cbLeDressCg;
	private JPanel panel_42;
	private JCheckBox cbLeDressVq;
	private JPanel panel_37;
	private JCheckBox cbLeDressI;
	private JPanel panel_32;
	private JTextArea handToMouthTextArea_2;
	private JLabel feedingLabel_1;
	private JPanel panel_27;
	private JTextArea handToMouthTextArea_1;
	private JTextArea handToMouthTextArea_;
	private JTextField txtInitialAssessmentEvalLe;
	private JLabel ageLabel_14;
	private JTextField txtInitialAssessmentEvalHandFxnL;
	private JLabel ageLabel_13;
	private JTextField txtInitialAssessmentEvalHandFxnR;
	private JLabel ageLabel_12;
	private JxRichTextField txtInitialAssessmentEvalRomL;
	private JLabel ageLabel_27;
	private JxRichTextField txtInitialAssessmentEvalRomR;
	private JLabel ageLabel_26;
	private JxRichTextField txtInitialAssessmentEvalStrengthL;
	private JLabel ageLabel_25;
	private JxRichTextField txtInitialAssessmentEvalStrengthR;
	private JLabel ageLabel_24;
	private JLabel ageLabel_11;
	private JxRichTextField txtInitialAssessmentLivesWith;
	private JxRichTextField txtInitialAssessmentHomeMgmt;
	private JLabel ageLabel_10;
	private JxRichTextField txtInitialAssessmentPrecausions;
	private JLabel ageLabel_9;
	private JxRichTextField txtInitialAssessmentDcPlanGoal;
	private JLabel ageLabel_8;
	private JTextField txtPlanOfCareEquipOtherField;
	private JLabel sensoryReeducationPainLabel_1;
	private JTextArea wcPositioningTextArea_;
	private JTextField txtPlanOfCarePainMod;
	private JLabel sensoryReeducationPainLabel;
	private JCheckBox cbOccHmo;
	private JLabel label_1;
	private JLabel ageLabel_23;
	private JRadioButton rbFollowsComMultiStep;
	private JRadioButton rbFollowsCom2Step;
	private JRadioButton rbFollowsCom1Step;
	private JRadioButton rbFollowsComTactileCuesNeeded;
	private JLabel circleOneLabel_12;
	private JLabel ageLabel_22;
	private JCheckBox cbCognitionAphasia;
	private JCheckBox cbCognitionDecreasedVision;
	private JComboBox cmbCognitionOrientedX123;
	private JCheckBox cbCognitionAlert;
	private JLabel circleOneLabel_11;
	private JLabel ageLabel_21;
	private JxRichTextField txtCurPositioning;
	private JLabel howIsPositioningLabel;
	private JxNotes txtUeDressCurEquip;
	private JxNotes txtEatingCurEquip;
	private JCheckBox cbUeDressDep;
	private JCheckBox cbEatingDep;
	private JCheckBox cbUeDressMaxA;
	private JCheckBox cbEatingMaxA;
	private JCheckBox cbUeDressModA;
	private JCheckBox cbEatingModA;
	private JCheckBox cbUeDressMinA;
	private JCheckBox cbEatingMinA;
	private JCheckBox cbUeDressCg;
	private JCheckBox cbEatingCg;
	private JCheckBox cbUeDressVq;
	private JCheckBox cbEatingVq;
	private JCheckBox cbUeDressI;
	private JCheckBox cbEatingI;
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
	private JPanel panel_53;
	private JPanel panel_51;
	private JLabel feedingLabel_8;
	private JPanel panel_50;
	private JPanel panel_49;
	private JPanel panel_48;
	private JPanel panel_46;
	private JLabel feedingLabel_7;
	private JPanel panel_45;
	private JPanel panel_44;
	private JPanel panel_43;
	private JPanel panel_41;
	private JLabel feedingLabel_6;
	private JPanel panel_40;
	private JPanel panel_39;
	private JPanel panel_38;
	private JPanel panel_36;
	private JLabel feedingLabel_5;
	private JPanel panel_35;
	private JPanel panel_34;
	private JLabel feedingLabel_4;
	private JPanel panel_33;
	private JPanel panel_31;
	private JPanel panel_30;
	private JPanel panel_29;
	private JLabel feedingLabel_2;
	private JLabel feedingLabel;
	private JPanel panel_28;
	private JPanel panel_26;
	private JPanel panel_24;
	private JPanel panel_23;
	private JPanel panel_22;
	private JComboBox cmbSignatureTherapy;
	private JLabel evaluationLabel;
	private JxRichTextField txtInitialAssessmentRecentTherapyField;
	private JCheckBox cbInitialAssessmentRecentTherapyNa;
	private JLabel ageLabel_7;
	private JxRichTextField txtInitialAssessmentAssistance;
	private JLabel ageLabel_6;
	private JxRichTextField txtInitialAssessmentLivingType;
	private JLabel ageLabel_5;
	private JTextField txtInitialAssessmentPmh;
	private JLabel ageLabel_4;
	private JTextField txtInitialAssessmentPlof;
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
	private JCheckBox cbCertificationNa;
	private JDateChooser dcCertificationThroughDate;
	private JDateChooser dcCertificationFromDate;
	private JLabel physicianNameLabel_5;
	private JLabel physicianNameLabel_4;
	private JLabel physicianNameLabel_3;
	private JPanel panel_19;
	private JComboBox cmbPhysicianSignature;
	private JLabel physicianNameLabel_2;
	private JDateChooser dcCertifyDate;
	private JLabel physicianNameLabel_1;
	private JTextField txtPhysicianName;
	private JLabel physicianNameLabel;
	private JTextArea textArea_3;
	private JLabel label_14;
	private JPanel panel_18;
	private JxNotes txtPlanOfTreatmentOutcome;
	private JLabel shortTermGoalsLabel_3;
	private JTextField txtLongTermGoalsWks;
	private JLabel shortTermGoalsLabel_2;
	private JLabel outcomeLabel;
	private JxNotes txtPlanOfTreatmentGoals;
	private JLabel shortTermGoalsLabel_1;
	private JTextField txtShortTermGoalsWks;
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
	private JComboBox cmbFrequencyDuration;
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
	private JTextField txt$PatientFirstName;
	private JLabel label_2;
	private JPanel panel_6;
	private JTextField txt$PatientsLastName;
	private JPanel panel_4;
	private JLabel label;
	private JPanel panel_3;
	private JTextField txtOccOtherField;
	private JCheckBox cbOccOther;
	private JCheckBox cbOccPartA;
	private JCheckBox cbOccPartB;
	private JLabel hcfa700FormLabel_1;
	private JLabel hcfa700FormLabel;
	private JPanel panel_2;
	private JPanel panel_1;
	private JPanel panel;
	private RichTextField rtf = null;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelPtOtStOccupationalTherapy() {
		super();
		Global.panelPtOtStOccupationalTherapy = this;
		setPreferredSize(new Dimension(900, 1230));
		setBackground(Color.WHITE);
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(10, 52, 850, 1173);
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
		txt$PatientsLastName.setBackground(Color.WHITE);
		txt$PatientsLastName.setEditable(false);
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
		txt$PatientFirstName.setBackground(Color.WHITE);
		txt$PatientFirstName.setEditable(false);
		txt$PatientFirstName.setBounds(3, 23, 280, 21);
		panel_6.add(txt$PatientFirstName);

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

		dcHospitalizationFromDate = new JDateChooser();
		// dcHospitalizationFromDate.addPropertyChangeListener(new
		// PropertyChangeListener() {
		// public void propertyChange(final PropertyChangeEvent evt) {
		// dcOnsetDate.setDate(dcHospitalizationFromDate.getDate());
		// }
		// });
		dcHospitalizationFromDate.setDateFormatString("MM/dd/yyyy");
		dcHospitalizationFromDate.setBounds(36, 20, 92, 23);
		dcHospitalizationFromDate.setDate(MedrexClientManager.getServerTime());
		panel_11.add(dcHospitalizationFromDate);

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
		dcSocDate.setDate(MedrexClientManager.getServerTime());
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

		cmbFrequencyDuration = new JComboBox();
		cmbFrequencyDuration.setBackground(Color.WHITE);
		cmbFrequencyDuration.setModel(new DefaultComboBoxModel(new String[] {
				"3-5", "5-6", "Eval only" }));
		cmbFrequencyDuration.setBounds(3, 23, 195, 21);
		panel_15.add(cmbFrequencyDuration);

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
		txtPrimaryDiagnosis.setBounds(3, 23, 249, 20);
		panel_16.add(txtPrimaryDiagnosis);

		btnPlus = new JButton();
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				(FrameFactory
						.createWindowOfType(FrameResidentDiagnosisConfirm.class))
						.setVisible(true);
				updateDiagnosis();
			}
		});
		btnPlus.setText("+");
		btnPlus.setBounds(257, 20, 28, 22);
		panel_16.add(btnPlus);

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

		RichTextField rich = new RichTextField();
		rich.setRtfType("PtOtStOccupationalTherapy: Treatment Diagnosis");
		rich.setRtfName("");

		txtTreatmentDiagnosis = new JxRichTextField();
		txtTreatmentDiagnosis.setBounds(3, 23, 344, 21);
		txtTreatmentDiagnosis.setArc(0.1f);
		txtTreatmentDiagnosis.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtTreatmentDiagnosis.setRichTextFieldModel(txtTreatmentDiagnosis,
				"PtOtStOccupationalTherapy: Treatment Diagnosis");
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

		txtShortTermGoalsWks = new JTextField();
		txtShortTermGoalsWks.setBounds(128, 23, 81, 20);
		panel_5.add(txtShortTermGoalsWks);

		shortTermGoalsLabel_1 = new JLabel();
		shortTermGoalsLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_1.setText("wks)");
		shortTermGoalsLabel_1.setBounds(212, 25, 28, 14);
		panel_5.add(shortTermGoalsLabel_1);

		Notes defaultNotes = new Notes();
		defaultNotes.setFormName("Occupational Therapy");
		defaultNotes.setUserId(Global.currentLoggedInUserKey);
		defaultNotes.setNoteText("");

		txtPlanOfTreatmentGoals = new JxNotes(isCategories);
		txtPlanOfTreatmentGoals.setNotes(defaultNotes);
		txtPlanOfTreatmentGoals.setBounds(3, 45, 408, 88);
		panel_5.add(txtPlanOfTreatmentGoals);

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

		txtLongTermGoalsWks = new JTextField();
		txtLongTermGoalsWks.setBounds(189, 135, 81, 20);
		panel_5.add(txtLongTermGoalsWks);

		shortTermGoalsLabel_3 = new JLabel();
		shortTermGoalsLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_3.setText("wks)");
		shortTermGoalsLabel_3.setBounds(274, 135, 28, 14);
		panel_5.add(shortTermGoalsLabel_3);

		Notes defaultNotes2 = new Notes();
		defaultNotes2.setFormName("Occupational Therapy");
		defaultNotes2.setUserId(Global.currentLoggedInUserKey);
		defaultNotes2.setNoteText("");

		txtPlanOfTreatmentOutcome = new JxNotes(isCategories);
		txtPlanOfTreatmentOutcome.setNotes(defaultNotes2);
		txtPlanOfTreatmentOutcome.setBounds(3, 157, 408, 88);
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

		sensoryReeducationPainLabel = new JLabel();
		sensoryReeducationPainLabel.setFont(new Font("", Font.BOLD, 12));
		sensoryReeducationPainLabel.setText("SENSORY RE-EDUCATION   PAIN MOD:");
		sensoryReeducationPainLabel.setBounds(5, 78, 212, 14);
		panel_18.add(sensoryReeducationPainLabel);

		txtPlanOfCarePainMod = new JTextField();
		txtPlanOfCarePainMod.setBounds(223, 78, 159, 20);
		panel_18.add(txtPlanOfCarePainMod);

		wcPositioningTextArea_ = new JTextArea();
		wcPositioningTextArea_.setFocusable(false);
		wcPositioningTextArea_.setWrapStyleWord(true);
		wcPositioningTextArea_.setLineWrap(true);
		wcPositioningTextArea_.setFont(new Font("", Font.BOLD, 12));
		wcPositioningTextArea_
				.setText("W/C POSITIONING / PROPULSION   ORTHOTICS   PROSTHETICS   BALANCE   Pt/STAFF EDUCATION   D/C PLANNING");
		wcPositioningTextArea_.setBounds(5, 95, 377, 32);
		panel_18.add(wcPositioningTextArea_);

		sensoryReeducationPainLabel_1 = new JLabel();
		sensoryReeducationPainLabel_1
				.setFont(new Font("Dialog", Font.BOLD, 12));
		sensoryReeducationPainLabel_1.setText("ADAPT EQUIP OTHER:");
		sensoryReeducationPainLabel_1.setBounds(5, 133, 122, 14);
		panel_18.add(sensoryReeducationPainLabel_1);

		txtPlanOfCareEquipOtherField = new JTextField();
		txtPlanOfCareEquipOtherField.setBounds(133, 131, 249, 20);
		panel_18.add(txtPlanOfCareEquipOtherField);

		cbTherapyExc = new JCheckBox();
		cbTherapyExc.setBackground(Color.WHITE);
		cbTherapyExc.setText("THERAPY EXC.");
		cbTherapyExc.setBounds(3, 18, 89, 18);
		panel_18.add(cbTherapyExc);

		cbNeuromuscularReed = new JCheckBox();
		cbNeuromuscularReed.setBackground(Color.WHITE);
		cbNeuromuscularReed.setText("NEUROMUSCULAR RE-ED");
		cbNeuromuscularReed.setBounds(98, 18, 140, 18);
		panel_18.add(cbNeuromuscularReed);

		cbBedMobilityTraining = new JCheckBox();
		cbBedMobilityTraining.setBackground(Color.WHITE);
		cbBedMobilityTraining.setText("BED MOBILITY TRAINING");
		cbBedMobilityTraining.setBounds(244, 18, 140, 18);
		panel_18.add(cbBedMobilityTraining);

		cbTherapyActivities = new JCheckBox();
		cbTherapyActivities.setBackground(Color.WHITE);
		cbTherapyActivities.setText("THERAPY ACTIVITIES");
		cbTherapyActivities.setBounds(3, 38, 124, 18);
		panel_18.add(cbTherapyActivities);

		cbTransferTrain = new JCheckBox();
		cbTransferTrain.setBackground(Color.WHITE);
		cbTransferTrain.setText("TRANSFER TRAIN");
		cbTransferTrain.setBounds(133, 38, 104, 18);
		panel_18.add(cbTransferTrain);

		cbCognitiveSkills = new JCheckBox();
		cbCognitiveSkills.setBackground(Color.WHITE);
		cbCognitiveSkills.setText("COGNITIVE SKILLS");
		cbCognitiveSkills.setBounds(244, 38, 108, 18);
		panel_18.add(cbCognitiveSkills);

		final JLabel adlsLabel = new JLabel();
		adlsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		adlsLabel.setText("ADL'S:");
		adlsLabel.setBounds(358, 38, 35, 14);
		panel_18.add(adlsLabel);

		cbEating = new JCheckBox();
		cbEating.setBackground(Color.WHITE);
		cbEating.setText("EATING");
		cbEating.setBounds(3, 60, 55, 18);
		panel_18.add(cbEating);

		cbUblbDressing = new JCheckBox();
		cbUblbDressing.setBackground(Color.WHITE);
		cbUblbDressing.setText("UB/LB DRESSING");
		cbUblbDressing.setBounds(64, 60, 99, 18);
		panel_18.add(cbUblbDressing);

		cbHygienegroom = new JCheckBox();
		cbHygienegroom.setBackground(Color.WHITE);
		cbHygienegroom.setText("HYGIENE/GROOM");
		cbHygienegroom.setBounds(169, 60, 104, 18);
		panel_18.add(cbHygienegroom);

		cbToileting = new JCheckBox();
		cbToileting.setBackground(Color.WHITE);
		cbToileting.setText("TOILETING");
		cbToileting.setBounds(279, 60, 71, 18);
		panel_18.add(cbToileting);

		cbMessage = new JCheckBox();
		cbMessage.setActionCommand("MESSAGE");
		cbMessage.setBackground(Color.WHITE);
		cbMessage.setText("MASSAGE");
		cbMessage.setBounds(358, 60, 68, 18);
		panel_18.add(cbMessage);

		textArea_3 = new JTextArea();
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

		dcCertifyDate = new JDateChooser();
		dcCertifyDate.setDateFormatString("MM/dd/yyyy");
		dcCertifyDate.setBounds(755, 340, 92, 23);
		panel_1.add(dcCertifyDate);

		physicianNameLabel_2 = new JLabel();
		physicianNameLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_2.setText("PHYSICIAN SIGNATURE:");
		physicianNameLabel_2.setBounds(424, 365, 132, 14);
		panel_1.add(physicianNameLabel_2);

		cmbPhysicianSignature = new JComboBox();
		cmbPhysicianSignature.setBackground(Color.WHITE);
		cmbPhysicianSignature.setBounds(567, 365, 177, 20);
		panel_1.add(cmbPhysicianSignature);

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

		dcCertificationThroughDate = new JDateChooser();
		dcCertificationThroughDate.setDateFormatString("MM/dd/yyyy");
		dcCertificationThroughDate.setBounds(232, 23, 102, 23);
		panel_19.add(dcCertificationThroughDate);

		dcCertificationFromDate = new JDateChooser();
		dcCertificationFromDate.setDate(MedrexClientManager.getServerTime());
		dcCertificationFromDate
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(final PropertyChangeEvent evt) {
						Calendar cal = Calendar.getInstance();
						cal.setTime(dcCertificationFromDate.getDate());
						cal.add(cal.MONTH, 1);
						dcCertificationThroughDate.setDate(cal.getTime());
					}
				});
		dcCertificationFromDate.setDateFormatString("MM/dd/yyyy");
		dcCertificationFromDate.setBounds(49, 23, 102, 23);
		panel_19.add(dcCertificationFromDate);

		cbCertificationNa = new JCheckBox();
		cbCertificationNa.setBackground(Color.LIGHT_GRAY);
		cbCertificationNa.setText("N/A");
		cbCertificationNa.setBounds(350, 23, 69, 18);
		panel_19.add(cbCertificationNa);

		panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		panel_20.setLayout(null);
		panel_20.setBounds(2, 443, 847, 230);
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
		ageLabel_1.setText("REFERRED BY:");
		ageLabel_1.setBounds(124, 23, 85, 14);
		panel_20.add(ageLabel_1);

		txtInitialAssessmentRefBy = new JxRichTextField();
		txtInitialAssessmentRefBy.setBounds(212, 23, 170, 20);
		txtInitialAssessmentRefBy.setArc(0.1f);
		txtInitialAssessmentRefBy.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentRefBy.setRichTextFieldModel(
				txtInitialAssessmentRefBy,
				"PtOtStOccupationalTherapy: Referred By");
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

		Notes defaultNotes3 = new Notes();
		defaultNotes3.setFormName("Occupational Therapy");
		defaultNotes3.setUserId(Global.currentLoggedInUserKey);
		defaultNotes3.setNoteText("");

		txtReasonForReferral = new JxNotes(isCategories);
		txtReasonForReferral.setNotes(defaultNotes3);
		txtReasonForReferral.setBounds(3, 69, 834, 65);
		panel_20.add(txtReasonForReferral);

		ageLabel_3 = new JLabel();
		ageLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_3.setText("PLOF:");
		ageLabel_3.setBounds(3, 140, 35, 14);
		panel_20.add(ageLabel_3);

		txtInitialAssessmentPlof = new JTextField();
		txtInitialAssessmentPlof.setBounds(44, 140, 372, 20);
		panel_20.add(txtInitialAssessmentPlof);

		ageLabel_4 = new JLabel();
		ageLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_4.setText("PMH/COMPLEXITIES:");
		ageLabel_4.setBounds(422, 140, 120, 14);
		panel_20.add(ageLabel_4);

		txtInitialAssessmentPmh = new JTextField();
		txtInitialAssessmentPmh.setBounds(548, 140, 289, 20);
		panel_20.add(txtInitialAssessmentPmh);

		ageLabel_5 = new JLabel();
		ageLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_5.setText("LIVING SITUATION: TYPE:");
		ageLabel_5.setBounds(3, 163, 141, 14);
		panel_20.add(ageLabel_5);

		txtInitialAssessmentLivingType = new JxRichTextField();
		txtInitialAssessmentLivingType.setBounds(150, 163, 115, 20);
		txtInitialAssessmentLivingType.setArc(0.1f);
		txtInitialAssessmentLivingType.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentLivingType.setRichTextFieldModel(
				txtInitialAssessmentLivingType,
				"PtOtStOccupationalTherapy: Living Type");
		panel_20.add(txtInitialAssessmentLivingType);

		ageLabel_6 = new JLabel();
		ageLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_6.setText("LIVES WITH:");
		ageLabel_6.setBounds(465, 163, 70, 14);
		panel_20.add(ageLabel_6);

		txtInitialAssessmentAssistance = new JxRichTextField();
		txtInitialAssessmentAssistance.setBounds(735, 163, 102, 20);
		txtInitialAssessmentAssistance.setArc(0.1f);
		txtInitialAssessmentAssistance.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentAssistance.setRichTextFieldModel(
				txtInitialAssessmentAssistance,
				"PtOtStOccupationalTherapy: Assistance");
		panel_20.add(txtInitialAssessmentAssistance);

		ageLabel_7 = new JLabel();
		ageLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_7.setText("RECENT THERAPY SERVICES: D/C Dates/Status");
		ageLabel_7.setBounds(3, 209, 266, 14);
		panel_20.add(ageLabel_7);

		cbInitialAssessmentRecentTherapyNa = new JCheckBox();
		cbInitialAssessmentRecentTherapyNa.setFont(new Font("", Font.BOLD, 12));
		cbInitialAssessmentRecentTherapyNa.setBackground(Color.WHITE);
		cbInitialAssessmentRecentTherapyNa.setText("N/A");
		cbInitialAssessmentRecentTherapyNa.setBounds(300, 209, 44, 18);
		panel_20.add(cbInitialAssessmentRecentTherapyNa);

		txtInitialAssessmentRecentTherapyField = new JxRichTextField();
		txtInitialAssessmentRecentTherapyField.setBounds(350, 209, 487, 20);
		txtInitialAssessmentRecentTherapyField.setArc(0.1f);
		txtInitialAssessmentRecentTherapyField.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentRecentTherapyField.setRichTextFieldModel(
				txtInitialAssessmentRecentTherapyField,
				"PtOtStOccupationalTherapy: RecentTherapyField");
		panel_20.add(txtInitialAssessmentRecentTherapyField);

		ageLabel_8 = new JLabel();
		ageLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_8.setText("D/C PLAN/ Pt GOAL:");
		ageLabel_8.setBounds(3, 186, 109, 14);
		panel_20.add(ageLabel_8);

		txtInitialAssessmentDcPlanGoal = new JxRichTextField();
		txtInitialAssessmentDcPlanGoal.setBounds(118, 186, 298, 20);
		txtInitialAssessmentDcPlanGoal.setArc(0.1f);
		txtInitialAssessmentDcPlanGoal.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentDcPlanGoal.setRichTextFieldModel(
				txtInitialAssessmentDcPlanGoal,
				"PtOtStOccupationalTherapy: DcPlanGoal");
		panel_20.add(txtInitialAssessmentDcPlanGoal);

		ageLabel_9 = new JLabel();
		ageLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_9.setText("PRECAUSIONS / WBS:");
		ageLabel_9.setBounds(422, 189, 123, 14);
		panel_20.add(ageLabel_9);

		txtInitialAssessmentPrecausions = new JxRichTextField();
		txtInitialAssessmentPrecausions.setBounds(548, 186, 289, 20);
		txtInitialAssessmentPrecausions.setArc(0.1f);
		txtInitialAssessmentPrecausions.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentPrecausions.setRichTextFieldModel(
				txtInitialAssessmentPrecausions,
				"PtOtStOccupationalTherapy: Precausions");
		panel_20.add(txtInitialAssessmentPrecausions);

		ageLabel_10 = new JLabel();
		ageLabel_10.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_10.setText("HOME MGMT:");
		ageLabel_10.setBounds(277, 163, 75, 14);
		panel_20.add(ageLabel_10);

		txtInitialAssessmentHomeMgmt = new JxRichTextField();
		txtInitialAssessmentHomeMgmt.setBounds(353, 163, 100, 20);
		txtInitialAssessmentHomeMgmt.setArc(0.1f);
		txtInitialAssessmentHomeMgmt.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentHomeMgmt.setRichTextFieldModel(
				txtInitialAssessmentHomeMgmt,
				"PtOtStOccupationalTherapy: Home MGMT");
		panel_20.add(txtInitialAssessmentHomeMgmt);

		txtInitialAssessmentLivesWith = new JxRichTextField();
		txtInitialAssessmentLivesWith.setBounds(537, 163, 100, 20);
		txtInitialAssessmentLivesWith.setArc(0.1f);
		txtInitialAssessmentLivesWith.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentLivesWith.setRichTextFieldModel(
				txtInitialAssessmentLivesWith,
				"PtOtStOccupationalTherapy: Lives With");
		panel_20.add(txtInitialAssessmentLivesWith);

		ageLabel_11 = new JLabel();
		ageLabel_11.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_11.setText("ASSISTANCE:");
		ageLabel_11.setBounds(653, 166, 82, 14);
		panel_20.add(ageLabel_11);

		lblSex = new JLabel();
		lblSex.setText("");
		lblSex.setFont(new Font("Dialog", Font.BOLD, 12));
		lblSex.setBounds(104, 23, 18, 14);
		panel_20.add(lblSex);

		evaluationLabel = new JLabel();
		evaluationLabel.setBorder(new LineBorder(Color.black, 1, false));
		evaluationLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		evaluationLabel.setText("  EVALUATION:");
		evaluationLabel.setBounds(5, 677, 87, 20);
		panel.add(evaluationLabel);

		panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setBackground(Color.WHITE);
		panel_22.setLayout(null);
		panel_22.setBounds(0, 747, 850, 261);
		panel.add(panel_22);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setBackground(Color.WHITE);
		panel_23.setLayout(null);
		panel_23.setBounds(0, 0, 159, 261);
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
		panel_26.setBounds(0, 22, 159, 39);
		panel_23.add(panel_26);

		feedingLabel = new JLabel();
		feedingLabel.setFont(new Font("", Font.BOLD, 11));
		feedingLabel.setText("Eating:");
		feedingLabel.setBounds(3, 3, 36, 14);
		panel_26.add(feedingLabel);

		handToMouthTextArea_ = new JTextArea();
		handToMouthTextArea_.setFocusable(false);
		handToMouthTextArea_.setBackground(Color.WHITE);
		handToMouthTextArea_.setEditable(false);
		handToMouthTextArea_.setText("hand to mouth utensils / packages");
		handToMouthTextArea_.setWrapStyleWord(true);
		handToMouthTextArea_.setLineWrap(true);
		handToMouthTextArea_.setBounds(41, 2, 95, 33);
		panel_26.add(handToMouthTextArea_);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 60, 159, 39);
		panel_23.add(panel_28);

		feedingLabel_2 = new JLabel();
		feedingLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_2.setText("UE Dressing:");
		feedingLabel_2.setBounds(3, 3, 69, 14);
		panel_28.add(feedingLabel_2);

		handToMouthTextArea_1 = new JTextArea();
		handToMouthTextArea_1.setFocusable(false);
		handToMouthTextArea_1.setBackground(Color.WHITE);
		handToMouthTextArea_1.setEditable(false);
		handToMouthTextArea_1.setWrapStyleWord(true);
		handToMouthTextArea_1.setText("fine fastenings pullover / shirt");
		handToMouthTextArea_1.setLineWrap(true);
		handToMouthTextArea_1.setBounds(75, 3, 75, 33);
		panel_28.add(handToMouthTextArea_1);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(0, 97, 159, 39);
		panel_23.add(panel_27);

		feedingLabel_1 = new JLabel();
		feedingLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_1.setText("LE Dressing:");
		feedingLabel_1.setBounds(3, 3, 69, 14);
		panel_27.add(feedingLabel_1);

		handToMouthTextArea_2 = new JTextArea();
		handToMouthTextArea_2.setFocusable(false);
		handToMouthTextArea_2.setBackground(Color.WHITE);
		handToMouthTextArea_2.setEditable(false);
		handToMouthTextArea_2.setWrapStyleWord(true);
		handToMouthTextArea_2.setText("fine fastenings shoes / pants");
		handToMouthTextArea_2.setLineWrap(true);
		handToMouthTextArea_2.setBounds(75, 3, 75, 33);
		panel_27.add(handToMouthTextArea_2);

		panel_69 = new JPanel();
		panel_69.setBorder(new LineBorder(Color.black, 1, false));
		panel_69.setLayout(null);
		panel_69.setBackground(Color.WHITE);
		panel_69.setBounds(0, 135, 159, 23);
		panel_23.add(panel_69);

		feedingLabel_3 = new JLabel();
		feedingLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_3.setText("Hyg/Groom:");
		feedingLabel_3.setBounds(5, 4, 69, 14);
		panel_69.add(feedingLabel_3);

		hairteethLabel = new JLabel();
		hairteethLabel.setText("hair/teeth");
		hairteethLabel.setBounds(80, 5, 56, 14);
		panel_69.add(hairteethLabel);

		panel_78 = new JPanel();
		panel_78.setBorder(new LineBorder(Color.black, 1, false));
		panel_78.setLayout(null);
		panel_78.setBackground(Color.WHITE);
		panel_78.setBounds(0, 156, 159, 23);
		panel_23.add(panel_78);

		feedingLabel_11 = new JLabel();
		feedingLabel_11.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_11.setText("Toileting");
		feedingLabel_11.setBounds(5, 4, 69, 14);
		panel_78.add(feedingLabel_11);

		panel_87 = new JPanel();
		panel_87.setBorder(new LineBorder(Color.black, 1, false));
		panel_87.setLayout(null);
		panel_87.setBackground(Color.WHITE);
		panel_87.setBounds(0, 178, 159, 23);
		panel_23.add(panel_87);

		feedingLabel_12 = new JLabel();
		feedingLabel_12.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_12.setText("W/C Mobility");
		feedingLabel_12.setBounds(5, 4, 69, 14);
		panel_87.add(feedingLabel_12);

		panel_96 = new JPanel();
		panel_96.setBorder(new LineBorder(Color.black, 1, false));
		panel_96.setLayout(null);
		panel_96.setBackground(Color.WHITE);
		panel_96.setBounds(0, 200, 159, 39);
		panel_23.add(panel_96);

		feedingLabel_13 = new JLabel();
		feedingLabel_13.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_13.setText("Bed Mob");
		feedingLabel_13.setBounds(3, 3, 48, 14);
		panel_96.add(feedingLabel_13);

		handToMouthTextArea_3 = new JTextArea();
		handToMouthTextArea_3.setFocusable(false);
		handToMouthTextArea_3.setBackground(Color.WHITE);
		handToMouthTextArea_3.setEditable(false);
		handToMouthTextArea_3.setWrapStyleWord(true);
		handToMouthTextArea_3.setText("scooting / rolling supine <-> sit");
		handToMouthTextArea_3.setLineWrap(true);
		handToMouthTextArea_3.setBounds(57, 3, 93, 33);
		panel_96.add(handToMouthTextArea_3);

		panel_105 = new JPanel();
		panel_105.setBorder(new LineBorder(Color.black, 1, false));
		panel_105.setLayout(null);
		panel_105.setBackground(Color.WHITE);
		panel_105.setBounds(0, 238, 159, 23);
		panel_23.add(panel_105);

		feedingLabel_14 = new JLabel();
		feedingLabel_14.setFont(new Font("Dialog", Font.BOLD, 11));
		feedingLabel_14.setText("Transfer");
		feedingLabel_14.setBounds(5, 4, 69, 14);
		panel_105.add(feedingLabel_14);

		panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(157, 0, 41, 261);
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
		panel_31.setBounds(0, 22, 41, 39);
		panel_29.add(panel_31);

		cbEatingI = new JCheckBox();
		cbEatingI.setBackground(Color.WHITE);
		cbEatingI.setBounds(3, 2, 35, 18);
		panel_31.add(cbEatingI);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 60, 41, 39);
		panel_29.add(panel_33);

		cbUeDressI = new JCheckBox();
		cbUeDressI.setBackground(Color.WHITE);
		cbUeDressI.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		cbUeDressI.setBounds(3, 2, 35, 18);
		panel_33.add(cbUeDressI);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(0, 97, 41, 39);
		panel_29.add(panel_32);

		cbLeDressI = new JCheckBox();
		cbLeDressI.setBackground(Color.WHITE);
		cbLeDressI.setBounds(3, 3, 35, 18);
		panel_32.add(cbLeDressI);

		panel_70 = new JPanel();
		panel_70.setBorder(new LineBorder(Color.black, 1, false));
		panel_70.setLayout(null);
		panel_70.setBackground(Color.WHITE);
		panel_70.setBounds(0, 135, 41, 23);
		panel_29.add(panel_70);

		cbHygGroomI = new JCheckBox();
		cbHygGroomI.setBackground(Color.WHITE);
		cbHygGroomI.setBounds(3, 2, 35, 18);
		panel_70.add(cbHygGroomI);

		panel_79 = new JPanel();
		panel_79.setBorder(new LineBorder(Color.black, 1, false));
		panel_79.setLayout(null);
		panel_79.setBackground(Color.WHITE);
		panel_79.setBounds(0, 156, 41, 23);
		panel_29.add(panel_79);

		cbToiletingI = new JCheckBox();
		cbToiletingI.setBackground(Color.WHITE);
		cbToiletingI.setBounds(3, 3, 35, 18);
		panel_79.add(cbToiletingI);

		panel_88 = new JPanel();
		panel_88.setBorder(new LineBorder(Color.black, 1, false));
		panel_88.setLayout(null);
		panel_88.setBackground(Color.WHITE);
		panel_88.setBounds(0, 178, 41, 23);
		panel_29.add(panel_88);

		cbWcMobilityI = new JCheckBox();
		cbWcMobilityI.setBackground(Color.WHITE);
		cbWcMobilityI.setBounds(3, 3, 35, 18);
		panel_88.add(cbWcMobilityI);

		panel_97 = new JPanel();
		panel_97.setBorder(new LineBorder(Color.black, 1, false));
		panel_97.setLayout(null);
		panel_97.setBackground(Color.WHITE);
		panel_97.setBounds(0, 200, 41, 39);
		panel_29.add(panel_97);

		cbBedMobI = new JCheckBox();
		cbBedMobI.setBackground(Color.WHITE);
		cbBedMobI.setBounds(3, 3, 35, 18);
		panel_97.add(cbBedMobI);

		panel_106 = new JPanel();
		panel_106.setBorder(new LineBorder(Color.black, 1, false));
		panel_106.setLayout(null);
		panel_106.setBackground(Color.WHITE);
		panel_106.setBounds(0, 238, 41, 23);
		panel_29.add(panel_106);

		cbTransferI = new JCheckBox();
		cbTransferI.setBackground(Color.WHITE);
		cbTransferI.setBounds(3, 3, 35, 18);
		panel_106.add(cbTransferI);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(197, 0, 64, 261);
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
		panel_36.setBounds(0, 22, 64, 39);
		panel_34.add(panel_36);

		cbEatingVq = new JCheckBox();
		cbEatingVq.setBackground(Color.WHITE);
		cbEatingVq.setBounds(3, 2, 54, 18);
		panel_36.add(cbEatingVq);

		panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(0, 60, 64, 39);
		panel_34.add(panel_38);

		cbUeDressVq = new JCheckBox();
		cbUeDressVq.setBackground(Color.WHITE);
		cbUeDressVq.setBounds(3, 2, 54, 18);
		panel_38.add(cbUeDressVq);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(0, 97, 64, 39);
		panel_34.add(panel_37);

		cbLeDressVq = new JCheckBox();
		cbLeDressVq.setBackground(Color.WHITE);
		cbLeDressVq.setBounds(3, 3, 54, 18);
		panel_37.add(cbLeDressVq);

		panel_71 = new JPanel();
		panel_71.setBorder(new LineBorder(Color.black, 1, false));
		panel_71.setLayout(null);
		panel_71.setBackground(Color.WHITE);
		panel_71.setBounds(0, 135, 64, 23);
		panel_34.add(panel_71);

		cbHygGroomVq = new JCheckBox();
		cbHygGroomVq.setBackground(Color.WHITE);
		cbHygGroomVq.setBounds(3, 2, 54, 18);
		panel_71.add(cbHygGroomVq);

		panel_80 = new JPanel();
		panel_80.setBorder(new LineBorder(Color.black, 1, false));
		panel_80.setLayout(null);
		panel_80.setBackground(Color.WHITE);
		panel_80.setBounds(0, 156, 64, 23);
		panel_34.add(panel_80);

		cbToiletingVq = new JCheckBox();
		cbToiletingVq.setBackground(Color.WHITE);
		cbToiletingVq.setBounds(3, 3, 54, 18);
		panel_80.add(cbToiletingVq);

		panel_89 = new JPanel();
		panel_89.setBorder(new LineBorder(Color.black, 1, false));
		panel_89.setLayout(null);
		panel_89.setBackground(Color.WHITE);
		panel_89.setBounds(0, 178, 64, 23);
		panel_34.add(panel_89);

		cbWcMobilityVq = new JCheckBox();
		cbWcMobilityVq.setBackground(Color.WHITE);
		cbWcMobilityVq.setBounds(3, 3, 54, 18);
		panel_89.add(cbWcMobilityVq);

		panel_98 = new JPanel();
		panel_98.setBorder(new LineBorder(Color.black, 1, false));
		panel_98.setLayout(null);
		panel_98.setBackground(Color.WHITE);
		panel_98.setBounds(0, 200, 64, 39);
		panel_34.add(panel_98);

		cbBedMobVq = new JCheckBox();
		cbBedMobVq.setBackground(Color.WHITE);
		cbBedMobVq.setBounds(3, 3, 54, 18);
		panel_98.add(cbBedMobVq);

		panel_107 = new JPanel();
		panel_107.setBorder(new LineBorder(Color.black, 1, false));
		panel_107.setLayout(null);
		panel_107.setBackground(Color.WHITE);
		panel_107.setBounds(0, 238, 64, 23);
		panel_34.add(panel_107);

		cbTransferVq = new JCheckBox();
		cbTransferVq.setBackground(Color.WHITE);
		cbTransferVq.setBounds(3, 3, 54, 18);
		panel_107.add(cbTransferVq);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(259, 0, 41, 261);
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
		panel_41.setBounds(0, 22, 41, 39);
		panel_39.add(panel_41);

		cbEatingCg = new JCheckBox();
		cbEatingCg.setBackground(Color.WHITE);
		cbEatingCg.setBounds(3, 2, 35, 18);
		panel_41.add(cbEatingCg);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(0, 60, 41, 39);
		panel_39.add(panel_43);

		cbUeDressCg = new JCheckBox();
		cbUeDressCg.setBackground(Color.WHITE);
		cbUeDressCg.setBounds(3, 2, 35, 18);
		panel_43.add(cbUeDressCg);

		panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(Color.black, 1, false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(0, 97, 41, 39);
		panel_39.add(panel_42);

		cbLeDressCg = new JCheckBox();
		cbLeDressCg.setBackground(Color.WHITE);
		cbLeDressCg.setBounds(3, 3, 35, 18);
		panel_42.add(cbLeDressCg);

		panel_72 = new JPanel();
		panel_72.setBorder(new LineBorder(Color.black, 1, false));
		panel_72.setLayout(null);
		panel_72.setBackground(Color.WHITE);
		panel_72.setBounds(0, 135, 41, 23);
		panel_39.add(panel_72);

		cbHygGroomCg = new JCheckBox();
		cbHygGroomCg.setBackground(Color.WHITE);
		cbHygGroomCg.setBounds(3, 2, 35, 18);
		panel_72.add(cbHygGroomCg);

		panel_81 = new JPanel();
		panel_81.setBorder(new LineBorder(Color.black, 1, false));
		panel_81.setLayout(null);
		panel_81.setBackground(Color.WHITE);
		panel_81.setBounds(0, 156, 41, 23);
		panel_39.add(panel_81);

		cbToiletingCg = new JCheckBox();
		cbToiletingCg.setBackground(Color.WHITE);
		cbToiletingCg.setBounds(3, 3, 35, 18);
		panel_81.add(cbToiletingCg);

		panel_90 = new JPanel();
		panel_90.setBorder(new LineBorder(Color.black, 1, false));
		panel_90.setLayout(null);
		panel_90.setBackground(Color.WHITE);
		panel_90.setBounds(0, 178, 41, 23);
		panel_39.add(panel_90);

		cbWcMobilityCg = new JCheckBox();
		cbWcMobilityCg.setBackground(Color.WHITE);
		cbWcMobilityCg.setBounds(3, 3, 35, 18);
		panel_90.add(cbWcMobilityCg);

		panel_99 = new JPanel();
		panel_99.setBorder(new LineBorder(Color.black, 1, false));
		panel_99.setLayout(null);
		panel_99.setBackground(Color.WHITE);
		panel_99.setBounds(0, 200, 41, 39);
		panel_39.add(panel_99);

		cbBedMobCg = new JCheckBox();
		cbBedMobCg.setBackground(Color.WHITE);
		cbBedMobCg.setBounds(3, 3, 35, 18);
		panel_99.add(cbBedMobCg);

		panel_108 = new JPanel();
		panel_108.setBorder(new LineBorder(Color.black, 1, false));
		panel_108.setLayout(null);
		panel_108.setBackground(Color.WHITE);
		panel_108.setBounds(0, 238, 41, 23);
		panel_39.add(panel_108);

		cbTransferCg = new JCheckBox();
		cbTransferCg.setBackground(Color.WHITE);
		cbTransferCg.setBounds(3, 2, 35, 18);
		panel_108.add(cbTransferCg);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(298, 0, 64, 261);
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
		panel_46.setBounds(0, 22, 64, 39);
		panel_44.add(panel_46);

		cbEatingMinA = new JCheckBox();
		cbEatingMinA.setBackground(Color.WHITE);
		cbEatingMinA.setBounds(3, 2, 54, 18);
		panel_46.add(cbEatingMinA);

		panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(Color.black, 1, false));
		panel_48.setLayout(null);
		panel_48.setBackground(Color.WHITE);
		panel_48.setBounds(0, 60, 64, 39);
		panel_44.add(panel_48);

		cbUeDressMinA = new JCheckBox();
		cbUeDressMinA.setBackground(Color.WHITE);
		cbUeDressMinA.setBounds(3, 2, 54, 18);
		panel_48.add(cbUeDressMinA);

		panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(Color.black, 1, false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(0, 97, 64, 39);
		panel_44.add(panel_47);

		cbLeDressMinA = new JCheckBox();
		cbLeDressMinA.setBackground(Color.WHITE);
		cbLeDressMinA.setBounds(3, 3, 54, 18);
		panel_47.add(cbLeDressMinA);

		panel_73 = new JPanel();
		panel_73.setBorder(new LineBorder(Color.black, 1, false));
		panel_73.setLayout(null);
		panel_73.setBackground(Color.WHITE);
		panel_73.setBounds(0, 135, 64, 23);
		panel_44.add(panel_73);

		cbHygGroomMinA = new JCheckBox();
		cbHygGroomMinA.setBackground(Color.WHITE);
		cbHygGroomMinA.setBounds(3, 2, 54, 18);
		panel_73.add(cbHygGroomMinA);

		panel_82 = new JPanel();
		panel_82.setBorder(new LineBorder(Color.black, 1, false));
		panel_82.setLayout(null);
		panel_82.setBackground(Color.WHITE);
		panel_82.setBounds(0, 156, 64, 23);
		panel_44.add(panel_82);

		cbToiletingMinA = new JCheckBox();
		cbToiletingMinA.setBackground(Color.WHITE);
		cbToiletingMinA.setBounds(3, 3, 54, 18);
		panel_82.add(cbToiletingMinA);

		panel_91 = new JPanel();
		panel_91.setBorder(new LineBorder(Color.black, 1, false));
		panel_91.setLayout(null);
		panel_91.setBackground(Color.WHITE);
		panel_91.setBounds(0, 178, 64, 23);
		panel_44.add(panel_91);

		cbWcMobilityMinA = new JCheckBox();
		cbWcMobilityMinA.setBackground(Color.WHITE);
		cbWcMobilityMinA.setBounds(3, 3, 51, 18);
		panel_91.add(cbWcMobilityMinA);

		panel_100 = new JPanel();
		panel_100.setBorder(new LineBorder(Color.black, 1, false));
		panel_100.setLayout(null);
		panel_100.setBackground(Color.WHITE);
		panel_100.setBounds(0, 200, 64, 39);
		panel_44.add(panel_100);

		cbBedMobMinA = new JCheckBox();
		cbBedMobMinA.setBackground(Color.WHITE);
		cbBedMobMinA.setBounds(3, 3, 54, 18);
		panel_100.add(cbBedMobMinA);

		panel_109 = new JPanel();
		panel_109.setBorder(new LineBorder(Color.black, 1, false));
		panel_109.setLayout(null);
		panel_109.setBackground(Color.WHITE);
		panel_109.setBounds(0, 238, 64, 23);
		panel_44.add(panel_109);

		cbTransferMinA = new JCheckBox();
		cbTransferMinA.setBackground(Color.WHITE);
		cbTransferMinA.setBounds(3, 3, 54, 18);
		panel_109.add(cbTransferMinA);

		panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(Color.black, 1, false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(360, 0, 64, 261);
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
		panel_51.setBounds(0, 22, 64, 39);
		panel_49.add(panel_51);

		cbEatingModA = new JCheckBox();
		cbEatingModA.setBackground(Color.WHITE);
		cbEatingModA.setBounds(3, 2, 54, 18);
		panel_51.add(cbEatingModA);

		panel_53 = new JPanel();
		panel_53.setBorder(new LineBorder(Color.black, 1, false));
		panel_53.setLayout(null);
		panel_53.setBackground(Color.WHITE);
		panel_53.setBounds(0, 60, 64, 39);
		panel_49.add(panel_53);

		cbUeDressModA = new JCheckBox();
		cbUeDressModA.setBackground(Color.WHITE);
		cbUeDressModA.setBounds(3, 2, 54, 18);
		panel_53.add(cbUeDressModA);

		panel_52 = new JPanel();
		panel_52.setBorder(new LineBorder(Color.black, 1, false));
		panel_52.setLayout(null);
		panel_52.setBackground(Color.WHITE);
		panel_52.setBounds(0, 97, 64, 39);
		panel_49.add(panel_52);

		cbLeDressModA = new JCheckBox();
		cbLeDressModA.setBackground(Color.WHITE);
		cbLeDressModA.setBounds(3, 3, 54, 18);
		panel_52.add(cbLeDressModA);

		panel_74 = new JPanel();
		panel_74.setBorder(new LineBorder(Color.black, 1, false));
		panel_74.setLayout(null);
		panel_74.setBackground(Color.WHITE);
		panel_74.setBounds(0, 135, 64, 23);
		panel_49.add(panel_74);

		cbHygGroomModA = new JCheckBox();
		cbHygGroomModA.setBackground(Color.WHITE);
		cbHygGroomModA.setBounds(3, 2, 54, 18);
		panel_74.add(cbHygGroomModA);

		panel_83 = new JPanel();
		panel_83.setBorder(new LineBorder(Color.black, 1, false));
		panel_83.setLayout(null);
		panel_83.setBackground(Color.WHITE);
		panel_83.setBounds(0, 156, 64, 23);
		panel_49.add(panel_83);

		cbToiletingModA = new JCheckBox();
		cbToiletingModA.setBackground(Color.WHITE);
		cbToiletingModA.setBounds(3, 3, 54, 18);
		panel_83.add(cbToiletingModA);

		panel_92 = new JPanel();
		panel_92.setBorder(new LineBorder(Color.black, 1, false));
		panel_92.setLayout(null);
		panel_92.setBackground(Color.WHITE);
		panel_92.setBounds(0, 178, 64, 23);
		panel_49.add(panel_92);

		cbWcMobilityModA = new JCheckBox();
		cbWcMobilityModA.setBackground(Color.WHITE);
		cbWcMobilityModA.setBounds(3, 3, 54, 18);
		panel_92.add(cbWcMobilityModA);

		panel_101 = new JPanel();
		panel_101.setBorder(new LineBorder(Color.black, 1, false));
		panel_101.setLayout(null);
		panel_101.setBackground(Color.WHITE);
		panel_101.setBounds(0, 200, 64, 39);
		panel_49.add(panel_101);

		cbBedMobModA = new JCheckBox();
		cbBedMobModA.setBackground(Color.WHITE);
		cbBedMobModA.setBounds(3, 3, 54, 18);
		panel_101.add(cbBedMobModA);

		panel_110 = new JPanel();
		panel_110.setBorder(new LineBorder(Color.black, 1, false));
		panel_110.setLayout(null);
		panel_110.setBackground(Color.WHITE);
		panel_110.setBounds(0, 238, 64, 23);
		panel_49.add(panel_110);

		cbTransferModA = new JCheckBox();
		cbTransferModA.setBackground(Color.WHITE);
		cbTransferModA.setBounds(3, 3, 54, 18);
		panel_110.add(cbTransferModA);

		panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(Color.black, 1, false));
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(422, 0, 64, 261);
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
		panel_56.setBounds(0, 22, 64, 39);
		panel_54.add(panel_56);

		cbEatingMaxA = new JCheckBox();
		cbEatingMaxA.setBackground(Color.WHITE);
		cbEatingMaxA.setBounds(3, 2, 54, 18);
		panel_56.add(cbEatingMaxA);

		panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(Color.black, 1, false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(0, 60, 64, 39);
		panel_54.add(panel_58);

		cbUeDressMaxA = new JCheckBox();
		cbUeDressMaxA.setBackground(Color.WHITE);
		cbUeDressMaxA.setBounds(3, 2, 54, 18);
		panel_58.add(cbUeDressMaxA);

		panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(Color.black, 1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(0, 97, 64, 39);
		panel_54.add(panel_57);

		cbLeDressMaxA = new JCheckBox();
		cbLeDressMaxA.setBackground(Color.WHITE);
		cbLeDressMaxA.setBounds(3, 3, 54, 18);
		panel_57.add(cbLeDressMaxA);

		panel_75 = new JPanel();
		panel_75.setBorder(new LineBorder(Color.black, 1, false));
		panel_75.setLayout(null);
		panel_75.setBackground(Color.WHITE);
		panel_75.setBounds(0, 135, 64, 23);
		panel_54.add(panel_75);

		cbHygGroomMaxA = new JCheckBox();
		cbHygGroomMaxA.setBackground(Color.WHITE);
		cbHygGroomMaxA.setBounds(3, 2, 54, 18);
		panel_75.add(cbHygGroomMaxA);

		panel_84 = new JPanel();
		panel_84.setBorder(new LineBorder(Color.black, 1, false));
		panel_84.setLayout(null);
		panel_84.setBackground(Color.WHITE);
		panel_84.setBounds(0, 156, 64, 23);
		panel_54.add(panel_84);

		cbToiletingMaxA = new JCheckBox();
		cbToiletingMaxA.setBackground(Color.WHITE);
		cbToiletingMaxA.setBounds(3, 3, 54, 18);
		panel_84.add(cbToiletingMaxA);

		panel_93 = new JPanel();
		panel_93.setBorder(new LineBorder(Color.black, 1, false));
		panel_93.setLayout(null);
		panel_93.setBackground(Color.WHITE);
		panel_93.setBounds(0, 178, 64, 23);
		panel_54.add(panel_93);

		cbWcMobilityMaxA = new JCheckBox();
		cbWcMobilityMaxA.setBackground(Color.WHITE);
		cbWcMobilityMaxA.setBounds(3, 3, 54, 18);
		panel_93.add(cbWcMobilityMaxA);

		panel_102 = new JPanel();
		panel_102.setBorder(new LineBorder(Color.black, 1, false));
		panel_102.setLayout(null);
		panel_102.setBackground(Color.WHITE);
		panel_102.setBounds(0, 200, 64, 39);
		panel_54.add(panel_102);

		cbBedMobMaxA = new JCheckBox();
		cbBedMobMaxA.setBackground(Color.WHITE);
		cbBedMobMaxA.setBounds(3, 3, 54, 18);
		panel_102.add(cbBedMobMaxA);

		panel_111 = new JPanel();
		panel_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_111.setLayout(null);
		panel_111.setBackground(Color.WHITE);
		panel_111.setBounds(0, 238, 64, 23);
		panel_54.add(panel_111);

		cbTransferMaxA = new JCheckBox();
		cbTransferMaxA.setBackground(Color.WHITE);
		cbTransferMaxA.setBounds(3, 3, 54, 18);
		panel_111.add(cbTransferMaxA);

		panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(Color.black, 1, false));
		panel_59.setLayout(null);
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(484, 0, 41, 261);
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
		panel_61.setBounds(0, 22, 41, 39);
		panel_59.add(panel_61);

		cbEatingDep = new JCheckBox();
		cbEatingDep.setBackground(Color.WHITE);
		cbEatingDep.setBounds(3, 2, 35, 18);
		panel_61.add(cbEatingDep);

		panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(Color.black, 1, false));
		panel_63.setLayout(null);
		panel_63.setBackground(Color.WHITE);
		panel_63.setBounds(0, 60, 41, 39);
		panel_59.add(panel_63);

		cbUeDressDep = new JCheckBox();
		cbUeDressDep.setBackground(Color.WHITE);
		cbUeDressDep.setBounds(3, 2, 35, 18);
		panel_63.add(cbUeDressDep);

		panel_62 = new JPanel();
		panel_62.setBorder(new LineBorder(Color.black, 1, false));
		panel_62.setLayout(null);
		panel_62.setBackground(Color.WHITE);
		panel_62.setBounds(0, 97, 41, 39);
		panel_59.add(panel_62);

		cbLeDressDep = new JCheckBox();
		cbLeDressDep.setBackground(Color.WHITE);
		cbLeDressDep.setBounds(3, 3, 35, 18);
		panel_62.add(cbLeDressDep);

		panel_76 = new JPanel();
		panel_76.setBorder(new LineBorder(Color.black, 1, false));
		panel_76.setLayout(null);
		panel_76.setBackground(Color.WHITE);
		panel_76.setBounds(0, 135, 41, 23);
		panel_59.add(panel_76);

		cbHygGroomDep = new JCheckBox();
		cbHygGroomDep.setBackground(Color.WHITE);
		cbHygGroomDep.setBounds(3, 2, 35, 18);
		panel_76.add(cbHygGroomDep);

		panel_85 = new JPanel();
		panel_85.setBorder(new LineBorder(Color.black, 1, false));
		panel_85.setLayout(null);
		panel_85.setBackground(Color.WHITE);
		panel_85.setBounds(0, 156, 41, 23);
		panel_59.add(panel_85);

		cbToiletingDep = new JCheckBox();
		cbToiletingDep.setBackground(Color.WHITE);
		cbToiletingDep.setBounds(3, 3, 35, 18);
		panel_85.add(cbToiletingDep);

		panel_94 = new JPanel();
		panel_94.setBorder(new LineBorder(Color.black, 1, false));
		panel_94.setLayout(null);
		panel_94.setBackground(Color.WHITE);
		panel_94.setBounds(0, 178, 41, 23);
		panel_59.add(panel_94);

		cbWcMobilityDep = new JCheckBox();
		cbWcMobilityDep.setBackground(Color.WHITE);
		cbWcMobilityDep.setBounds(3, 3, 35, 18);
		panel_94.add(cbWcMobilityDep);

		panel_103 = new JPanel();
		panel_103.setBorder(new LineBorder(Color.black, 1, false));
		panel_103.setLayout(null);
		panel_103.setBackground(Color.WHITE);
		panel_103.setBounds(0, 200, 41, 39);
		panel_59.add(panel_103);

		cbBedMobDep = new JCheckBox();
		cbBedMobDep.setBackground(Color.WHITE);
		cbBedMobDep.setBounds(3, 3, 35, 18);
		panel_103.add(cbBedMobDep);

		panel_112 = new JPanel();
		panel_112.setBorder(new LineBorder(Color.black, 1, false));
		panel_112.setLayout(null);
		panel_112.setBackground(Color.WHITE);
		panel_112.setBounds(0, 238, 41, 23);
		panel_59.add(panel_112);

		cbTransferDep = new JCheckBox();
		cbTransferDep.setBackground(Color.WHITE);
		cbTransferDep.setBounds(3, 2, 35, 18);
		panel_112.add(cbTransferDep);

		panel_64 = new JPanel();
		panel_64.setBorder(new LineBorder(Color.black, 1, false));
		panel_64.setLayout(null);
		panel_64.setBackground(Color.WHITE);
		panel_64.setBounds(523, 0, 327, 261);
		panel_22.add(panel_64);

		panel_65 = new JPanel();
		panel_65.setBorder(new LineBorder(Color.black, 1, false));
		panel_65.setLayout(null);
		panel_65.setBackground(Color.WHITE);
		panel_65.setBounds(0, 0, 327, 23);
		panel_64.add(panel_65);

		circleOneLabel_10 = new JLabel();
		circleOneLabel_10.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_10.setText("Current Equipment or Adapt dev./Comments");
		circleOneLabel_10.setBounds(35, 3, 246, 14);
		panel_65.add(circleOneLabel_10);

		panel_66 = new JPanel();
		panel_66.setBorder(new LineBorder(Color.black, 1, false));
		panel_66.setLayout(null);
		panel_66.setBackground(Color.WHITE);
		panel_66.setBounds(0, 22, 327, 39);
		panel_64.add(panel_66);

		Notes defaultNotes4 = new Notes();
		defaultNotes4.setFormName("Occupational Therapy");
		defaultNotes4.setUserId(Global.currentLoggedInUserKey);
		defaultNotes4.setNoteText("");

		txtEatingCurEquip = new JxNotes(isCategories);
		txtEatingCurEquip.setNotes(defaultNotes4);
		txtEatingCurEquip.setBounds(23, 2, 275, 36);
		panel_66.add(txtEatingCurEquip);

		panel_68 = new JPanel();
		panel_68.setBorder(new LineBorder(Color.black, 1, false));
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(0, 60, 327, 39);
		panel_64.add(panel_68);

		Notes defaultNotes5 = new Notes();
		defaultNotes5.setFormName("Occupational Therapy");
		defaultNotes5.setUserId(Global.currentLoggedInUserKey);
		defaultNotes5.setNoteText("");

		txtUeDressCurEquip = new JxNotes(isCategories);
		txtUeDressCurEquip.setNotes(defaultNotes5);
		txtUeDressCurEquip.setBounds(23, 2, 275, 36);
		panel_68.add(txtUeDressCurEquip);

		panel_67 = new JPanel();
		panel_67.setBorder(new LineBorder(Color.black, 1, false));
		panel_67.setLayout(null);
		panel_67.setBackground(Color.WHITE);
		panel_67.setBounds(0, 97, 327, 39);
		panel_64.add(panel_67);

		Notes defaultNotes6 = new Notes();
		defaultNotes6.setFormName("Occupational Therapy");
		defaultNotes6.setUserId(Global.currentLoggedInUserKey);
		defaultNotes6.setNoteText("");

		txtLeDressCurEquip = new JxNotes(isCategories);
		txtLeDressCurEquip.setNotes(defaultNotes6);
		txtLeDressCurEquip.setBounds(23, 3, 275, 36);
		panel_67.add(txtLeDressCurEquip);

		panel_77 = new JPanel();
		panel_77.setBorder(new LineBorder(Color.black, 1, false));
		panel_77.setLayout(null);
		panel_77.setBackground(Color.WHITE);
		panel_77.setBounds(0, 135, 327, 23);
		panel_64.add(panel_77);

		Notes defaultNotes7 = new Notes();
		defaultNotes7.setFormName("Occupational Therapy");
		defaultNotes7.setUserId(Global.currentLoggedInUserKey);
		defaultNotes7.setNoteText("");

		txtHygGroomCurEquip = new JxNotes(isCategories);
		txtHygGroomCurEquip.setNotes(defaultNotes7);
		txtHygGroomCurEquip.setBounds(23, 2, 275, 18);
		panel_77.add(txtHygGroomCurEquip);

		panel_86 = new JPanel();
		panel_86.setBorder(new LineBorder(Color.black, 1, false));
		panel_86.setLayout(null);
		panel_86.setBackground(Color.WHITE);
		panel_86.setBounds(0, 156, 327, 23);
		panel_64.add(panel_86);

		Notes defaultNotes8 = new Notes();
		defaultNotes8.setFormName("Occupational Therapy");
		defaultNotes8.setUserId(Global.currentLoggedInUserKey);
		defaultNotes8.setNoteText("");

		txtToiletingCurEquip = new JxNotes(isCategories);
		txtToiletingCurEquip.setNotes(defaultNotes8);
		txtToiletingCurEquip.setBounds(23, 3, 275, 18);
		panel_86.add(txtToiletingCurEquip);

		panel_95 = new JPanel();
		panel_95.setBorder(new LineBorder(Color.black, 1, false));
		panel_95.setLayout(null);
		panel_95.setBackground(Color.WHITE);
		panel_95.setBounds(0, 178, 327, 23);
		panel_64.add(panel_95);

		Notes defaultNotes9 = new Notes();
		defaultNotes9.setFormName("Occupational Therapy");
		defaultNotes9.setUserId(Global.currentLoggedInUserKey);
		defaultNotes9.setNoteText("");

		txtWcMobilityCurEquip = new JxNotes(isCategories);
		txtWcMobilityCurEquip.setNotes(defaultNotes9);
		txtWcMobilityCurEquip.setBounds(23, 3, 275, 18);
		panel_95.add(txtWcMobilityCurEquip);

		panel_104 = new JPanel();
		panel_104.setBorder(new LineBorder(Color.black, 1, false));
		panel_104.setLayout(null);
		panel_104.setBackground(Color.WHITE);
		panel_104.setBounds(0, 200, 327, 39);
		panel_64.add(panel_104);

		Notes defaultNotes10 = new Notes();
		defaultNotes10.setFormName("Occupational Therapy");
		defaultNotes10.setUserId(Global.currentLoggedInUserKey);
		defaultNotes10.setNoteText("");

		txtBedMobCurEquip = new JxNotes(isCategories);
		txtBedMobCurEquip.setNotes(defaultNotes10);
		txtBedMobCurEquip.setBounds(23, 3, 275, 36);
		panel_104.add(txtBedMobCurEquip);

		panel_113 = new JPanel();
		panel_113.setBorder(new LineBorder(Color.black, 1, false));
		panel_113.setLayout(null);
		panel_113.setBackground(Color.WHITE);
		panel_113.setBounds(0, 238, 327, 23);
		panel_64.add(panel_113);

		Notes defaultNotes11 = new Notes();
		defaultNotes11.setFormName("Occupational Therapy");
		defaultNotes11.setUserId(Global.currentLoggedInUserKey);
		defaultNotes11.setNoteText("");

		txtTransferCurEquip = new JxNotes(isCategories);
		txtTransferCurEquip.setNotes(defaultNotes11);
		txtTransferCurEquip.setBounds(23, 2, 275, 18);
		panel_113.add(txtTransferCurEquip);

		howIsPositioningLabel = new JLabel();
		howIsPositioningLabel.setFont(new Font("", Font.BOLD, 12));
		howIsPositioningLabel
				.setText("CURRENT POSITIONING/POSTURAL DEVIATIONS:");
		howIsPositioningLabel.setBounds(3, 1015, 278, 18);
		panel.add(howIsPositioningLabel);

		txtCurPositioning = new JxRichTextField();
		txtCurPositioning.setBounds(283, 1015, 557, 20);
		txtCurPositioning.setArc(0.1f);
		txtCurPositioning.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtCurPositioning.setRichTextFieldModel(txtCurPositioning,
				"PtOtStOccupationalTherapy: CurPositioning");
		panel.add(txtCurPositioning);

		ageLabel_21 = new JLabel();
		ageLabel_21.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_21.setText("COGNITION:");
		ageLabel_21.setBounds(3, 1075, 76, 14);
		panel.add(ageLabel_21);

		circleOneLabel_11 = new JLabel();
		circleOneLabel_11.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_11.setText("(circle)");
		circleOneLabel_11.setBounds(72, 1075, 38, 14);
		panel.add(circleOneLabel_11);

		cbCognitionAlert = new JCheckBox();
		cbCognitionAlert.setFont(new Font("", Font.BOLD, 12));
		cbCognitionAlert.setBackground(Color.WHITE);
		cbCognitionAlert.setText("ALERT");
		cbCognitionAlert.setBounds(115, 1075, 59, 18);
		panel.add(cbCognitionAlert);

		cmbCognitionOrientedX123 = new JComboBox();
		cmbCognitionOrientedX123.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3" }));
		cmbCognitionOrientedX123.setActionCommand("ORIENTED x");
		cmbCognitionOrientedX123.setFont(new Font("", Font.BOLD, 12));
		cmbCognitionOrientedX123.setBackground(Color.WHITE);
		// cbCognitionOrientedX123.setText("ORIENTED x1, 2, 3");
		cmbCognitionOrientedX123.setBounds(284, 1076, 118, 18);
		panel.add(cmbCognitionOrientedX123);

		cbCognitionDecreasedVision = new JCheckBox();
		cbCognitionDecreasedVision.setFont(new Font("", Font.BOLD, 12));
		cbCognitionDecreasedVision.setBackground(Color.WHITE);
		cbCognitionDecreasedVision.setText("DECREASED VISION / HEARING");
		cbCognitionDecreasedVision.setBounds(450, 1075, 188, 18);
		panel.add(cbCognitionDecreasedVision);

		cbCognitionAphasia = new JCheckBox();
		cbCognitionAphasia.setFont(new Font("", Font.BOLD, 12));
		cbCognitionAphasia.setBackground(Color.WHITE);
		cbCognitionAphasia.setText("APHASIA");
		cbCognitionAphasia.setBounds(701, 1075, 94, 18);
		panel.add(cbCognitionAphasia);

		ageLabel_22 = new JLabel();
		ageLabel_22.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_22.setText("FOLLOWS COMMANDS:");
		ageLabel_22.setBounds(3, 1095, 134, 14);
		panel.add(ageLabel_22);

		circleOneLabel_12 = new JLabel();
		circleOneLabel_12.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_12.setText("(circle one)");
		circleOneLabel_12.setBounds(138, 1095, 68, 14);
		panel.add(circleOneLabel_12);

		rbFollowsComTactileCuesNeeded = new JRadioButton();
		rbFollowsComTactileCuesNeeded.setActionCommand("1");
		bgFollowsCom.add(rbFollowsComTactileCuesNeeded);
		rbFollowsComTactileCuesNeeded.setFont(new Font("", Font.BOLD, 12));
		rbFollowsComTactileCuesNeeded.setBackground(Color.WHITE);
		rbFollowsComTactileCuesNeeded.setText("TACTILE CUES NEEDED");
		rbFollowsComTactileCuesNeeded.setBounds(230, 1095, 147, 18);
		panel.add(rbFollowsComTactileCuesNeeded);

		rbFollowsCom1Step = new JRadioButton();
		rbFollowsCom1Step.setActionCommand("2");
		bgFollowsCom.add(rbFollowsCom1Step);
		rbFollowsCom1Step.setFont(new Font("", Font.BOLD, 12));
		rbFollowsCom1Step.setBackground(Color.WHITE);
		rbFollowsCom1Step.setText("1 STEP");
		rbFollowsCom1Step.setBounds(440, 1095, 59, 18);
		panel.add(rbFollowsCom1Step);

		rbFollowsCom2Step = new JRadioButton();
		rbFollowsCom2Step.setActionCommand("3");
		bgFollowsCom.add(rbFollowsCom2Step);
		rbFollowsCom2Step.setFont(new Font("", Font.BOLD, 12));
		rbFollowsCom2Step.setBackground(Color.WHITE);
		rbFollowsCom2Step.setText("2 STEP");
		rbFollowsCom2Step.setBounds(570, 1095, 68, 18);
		panel.add(rbFollowsCom2Step);

		rbFollowsComMultiStep = new JRadioButton();
		rbFollowsComMultiStep.setActionCommand("4");
		bgFollowsCom.add(rbFollowsComMultiStep);
		rbFollowsComMultiStep.setFont(new Font("", Font.BOLD, 12));
		rbFollowsComMultiStep.setBackground(Color.WHITE);
		rbFollowsComMultiStep.setText("MELTI-STEP");
		rbFollowsComMultiStep.setBounds(701, 1095, 87, 18);
		panel.add(rbFollowsComMultiStep);

		ageLabel_23 = new JLabel();
		ageLabel_23.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_23.setText("RECOMMENDATION / IMPRESSION:");
		ageLabel_23.setBounds(3, 1115, 203, 14);
		panel.add(ageLabel_23);

		ageLabel_24 = new JLabel();
		ageLabel_24.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_24.setText("STRENGTH: UE: R:");
		ageLabel_24.setBounds(98, 677, 99, 14);
		panel.add(ageLabel_24);

		txtInitialAssessmentEvalStrengthR = new JxRichTextField();
		txtInitialAssessmentEvalStrengthR.setBounds(203, 677, 267, 21);
		txtInitialAssessmentEvalStrengthR.setArc(0.1f);
		txtInitialAssessmentEvalStrengthR.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentEvalStrengthR.setRichTextFieldModel(
				txtInitialAssessmentEvalStrengthR,
				"PtOtStOccupationalTherapy: EvalStrengthR");
		panel.add(txtInitialAssessmentEvalStrengthR);

		ageLabel_25 = new JLabel();
		ageLabel_25.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_25.setText("L:");
		ageLabel_25.setBounds(473, 677, 16, 14);
		panel.add(ageLabel_25);

		txtInitialAssessmentEvalStrengthL = new JxRichTextField();
		txtInitialAssessmentEvalStrengthL.setBounds(491, 677, 348, 20);
		txtInitialAssessmentEvalStrengthL.setArc(0.1f);
		txtInitialAssessmentEvalStrengthL.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentEvalStrengthL.setRichTextFieldModel(
				txtInitialAssessmentEvalStrengthL,
				"PtOtStOccupationalTherapy: EvalStrengthL");
		panel.add(txtInitialAssessmentEvalStrengthL);

		ageLabel_26 = new JLabel();
		ageLabel_26.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_26.setText("ROM: UE: R:");
		ageLabel_26.setBounds(5, 703, 68, 14);
		panel.add(ageLabel_26);

		txtInitialAssessmentEvalRomR = new JxRichTextField();
		txtInitialAssessmentEvalRomR.setBounds(78, 703, 324, 20);
		txtInitialAssessmentEvalRomR.setArc(0.1f);
		txtInitialAssessmentEvalRomR.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentEvalRomR.setRichTextFieldModel(
				txtInitialAssessmentEvalRomR,
				"PtOtStOccupationalTherapy: EvalRomR");
		panel.add(txtInitialAssessmentEvalRomR);

		ageLabel_27 = new JLabel();
		ageLabel_27.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_27.setText("L:");
		ageLabel_27.setBounds(405, 703, 16, 14);
		panel.add(ageLabel_27);

		txtInitialAssessmentEvalRomL = new JxRichTextField();
		txtInitialAssessmentEvalRomL.setBounds(421, 703, 419, 20);
		txtInitialAssessmentEvalRomL.setArc(0.1f);
		txtInitialAssessmentEvalRomL.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentEvalRomL.setRichTextFieldModel(
				txtInitialAssessmentEvalRomL,
				"PtOtStOccupationalTherapy: EvalRomL");
		panel.add(txtInitialAssessmentEvalRomL);

		ageLabel_12 = new JLabel();
		ageLabel_12.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_12.setText("HAND FXN / FINE MOTOR: R:");
		ageLabel_12.setBounds(5, 725, 153, 14);
		panel.add(ageLabel_12);

		txtInitialAssessmentEvalHandFxnR = new JTextField();
		txtInitialAssessmentEvalHandFxnR.setBounds(160, 725, 182, 20);
		panel.add(txtInitialAssessmentEvalHandFxnR);

		ageLabel_13 = new JLabel();
		ageLabel_13.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_13.setText("L:");
		ageLabel_13.setBounds(347, 727, 16, 14);
		panel.add(ageLabel_13);

		txtInitialAssessmentEvalHandFxnL = new JTextField();
		txtInitialAssessmentEvalHandFxnL.setBounds(359, 725, 174, 20);
		panel.add(txtInitialAssessmentEvalHandFxnL);

		ageLabel_14 = new JLabel();
		ageLabel_14.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_14.setText("LE FXN:WFL / limited");
		ageLabel_14.setBounds(534, 725, 118, 14);
		panel.add(ageLabel_14);

		txtInitialAssessmentEvalLe = new JTextField();
		txtInitialAssessmentEvalLe.setBounds(653, 725, 187, 20);
		panel.add(txtInitialAssessmentEvalLe);

		ageLabel_15 = new JLabel();
		ageLabel_15.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_15.setText("BALANCE:  SIT: stat.");
		ageLabel_15.setBounds(3, 1035, 118, 14);
		panel.add(ageLabel_15);

		ageLabel_16 = new JLabel();
		ageLabel_16.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_16.setText("SAFETY AWARENESS:");
		ageLabel_16.setBounds(3, 1055, 124, 14);
		panel.add(ageLabel_16);

		txtBalanceSitStat = new JxRichTextField();
		txtBalanceSitStat.setBounds(125, 1035, 120, 20);
		txtBalanceSitStat.setArc(0.1f);
		txtBalanceSitStat.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtBalanceSitStat.setRichTextFieldModel(txtBalanceSitStat,
				"PtOtStOccupationalTherapy: BalanceSitStat");
		panel.add(txtBalanceSitStat);

		ageLabel_17 = new JLabel();
		ageLabel_17.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_17.setText("dyn");
		ageLabel_17.setBounds(256, 1035, 23, 14);
		panel.add(ageLabel_17);

		txtBalanceSitDyn = new JxRichTextField();
		txtBalanceSitDyn.setBounds(283, 1035, 115, 20);
		txtBalanceSitDyn.setArc(0.1f);
		txtBalanceSitDyn.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtBalanceSitDyn.setRichTextFieldModel(txtBalanceSitDyn,
				"PtOtStOccupationalTherapy: BalanceSitDyn");
		panel.add(txtBalanceSitDyn);

		ageLabel_18 = new JLabel();
		ageLabel_18.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_18.setText("STAND: stat.");
		ageLabel_18.setBounds(405, 1035, 76, 14);
		panel.add(ageLabel_18);

		txtBalanceStandStat = new JxRichTextField();
		txtBalanceStandStat.setBounds(481, 1035, 115, 20);
		txtBalanceStandStat.setArc(0.1f);
		txtBalanceStandStat
				.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtBalanceStandStat.setRichTextFieldModel(txtBalanceStandStat,
				"PtOtStOccupationalTherapy: BalanceStandStat");
		panel.add(txtBalanceStandStat);

		ageLabel_19 = new JLabel();
		ageLabel_19.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_19.setText("dyn");
		ageLabel_19.setBounds(607, 1035, 23, 14);
		panel.add(ageLabel_19);

		txtBalanceStandDyn = new JxRichTextField();
		txtBalanceStandDyn.setBounds(635, 1035, 115, 20);
		txtBalanceStandDyn.setArc(0.1f);
		txtBalanceStandDyn.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtBalanceStandDyn.setRichTextFieldModel(txtBalanceStandDyn,
				"PtOtStOccupationalTherapy: BalanceStandDyn");
		panel.add(txtBalanceStandDyn);

		txtSafetyAwareness = new JxRichTextField();
		txtSafetyAwareness.setBounds(130, 1055, 115, 20);
		txtSafetyAwareness.setArc(0.1f);
		txtSafetyAwareness.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtSafetyAwareness.setRichTextFieldModel(txtSafetyAwareness,
				"PtOtStOccupationalTherapy: SafetyAwareness");
		panel.add(txtSafetyAwareness);

		ageLabel_20 = new JLabel();
		ageLabel_20.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_20.setText("VITALS: HR:");
		ageLabel_20.setBounds(256, 1055, 68, 14);
		panel.add(ageLabel_20);

		txtVitalsHr = new JxRichTextField();
		txtVitalsHr.setBounds(327, 1055, 115, 20);
		txtVitalsHr.setArc(0.1f);
		txtVitalsHr.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtVitalsHr.setRichTextFieldModel(txtVitalsHr,
				"PtOtStOccupationalTherapy: VitalsHr");
		panel.add(txtVitalsHr);

		ageLabel_28 = new JLabel();
		ageLabel_28.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_28.setText("BP:");
		ageLabel_28.setBounds(448, 1057, 23, 14);
		panel.add(ageLabel_28);

		txtVitalsBp = new JxRichTextField();
		txtVitalsBp.setBounds(473, 1055, 123, 20);
		txtVitalsBp.setArc(0.1f);
		txtVitalsBp.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtVitalsBp.setRichTextFieldModel(txtVitalsBp,
				"PtOtStOccupationalTherapy: VitalsBp");
		panel.add(txtVitalsBp);

		ageLabel_29 = new JLabel();
		ageLabel_29.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_29.setText("PULSE OX:");
		ageLabel_29.setBounds(607, 1055, 65, 14);
		panel.add(ageLabel_29);

		txtVitalsPulseOx = new JxRichTextField();
		txtVitalsPulseOx.setBounds(675, 1055, 115, 20);
		txtVitalsPulseOx.setArc(0.1f);
		txtVitalsPulseOx.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtVitalsPulseOx.setRichTextFieldModel(txtVitalsPulseOx,
				"PtOtStOccupationalTherapy: VitalsPulseOx");
		panel.add(txtVitalsPulseOx);

		Notes defaultNotes12 = new Notes();
		defaultNotes12.setFormName("Occupational Therapy");
		defaultNotes12.setUserId(Global.currentLoggedInUserKey);
		defaultNotes12.setNoteText("");

		txtRecommendationImp = new JxNotes(isCategories);
		txtRecommendationImp.setNotes(defaultNotes12);
		txtRecommendationImp.setBounds(203, 1115, 637, 20);
		panel.add(txtRecommendationImp);

		cbPatientParticipatedIn = new JCheckBox();
		cbPatientParticipatedIn.setFont(new Font("", Font.BOLD, 12));
		cbPatientParticipatedIn.setBackground(Color.WHITE);
		cbPatientParticipatedIn
				.setText("PATIENT PARTICIPATED IN AND AGRESS WITH PLAN OF CARE");
		cbPatientParticipatedIn.setBounds(78, 1147, 368, 18);
		panel.add(cbPatientParticipatedIn);

		cbPatientParticipatedNa = new JCheckBox();
		cbPatientParticipatedNa.setFont(new Font("", Font.BOLD, 12));
		cbPatientParticipatedNa.setBackground(Color.WHITE);
		cbPatientParticipatedNa.setText("N/A");
		cbPatientParticipatedNa.setBounds(473, 1147, 38, 18);
		panel.add(cbPatientParticipatedNa);

		txtPatientParticipatedNaField = new JTextField();
		txtPatientParticipatedNaField.setBounds(517, 1147, 203, 20);
		panel.add(txtPatientParticipatedNaField);

		final JLabel orientedXLabel = new JLabel();
		orientedXLabel.setText("ORIENTED x");
		orientedXLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		orientedXLabel.setBounds(205, 1075, 76, 14);
		panel.add(orientedXLabel);

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
		hcfa700FormLabel_1.setText("OCCUPATIONAL THERAPY EVALUATION");
		hcfa700FormLabel_1.setBounds(152, 3, 269, 14);
		panel_2.add(hcfa700FormLabel_1);

		cbOccPartB = new JCheckBox();
		cbOccPartB.setFont(new Font("", Font.BOLD, 14));
		cbOccPartB.setBackground(Color.WHITE);
		cbOccPartB.setText("PART B");
		cbOccPartB.setBounds(573, 3, 74, 18);
		panel_2.add(cbOccPartB);

		cbOccPartA = new JCheckBox();
		cbOccPartA.setFont(new Font("", Font.BOLD, 14));
		cbOccPartA.setBackground(Color.WHITE);
		cbOccPartA.setText("PART A");
		cbOccPartA.setBounds(434, 3, 74, 18);
		panel_2.add(cbOccPartA);

		cbOccOther = new JCheckBox();
		cbOccOther.setFont(new Font("", Font.BOLD, 14));
		cbOccOther.setBackground(Color.WHITE);
		cbOccOther.setText("OTHER");
		cbOccOther.setBounds(653, 3, 66, 18);
		panel_2.add(cbOccOther);

		txtOccOtherField = new JTextField();
		txtOccOtherField.setBounds(722, 3, 118, 20);
		panel_2.add(txtOccOtherField);

		cbOccHmo = new JCheckBox();
		cbOccHmo.setFont(new Font("", Font.BOLD, 12));
		cbOccHmo.setBackground(Color.WHITE);
		cbOccHmo.setText("HMO");
		cbOccHmo.setBounds(514, 3, 53, 18);
		panel_2.add(cbOccHmo);

		label_1 = new JLabel();
		label_1.setFont(new Font("", Font.BOLD, 14));
		label_1.setBorder(new LineBorder(Color.black, 1, false));
		label_1.setText(" 6");
		label_1.setBounds(845, 1, 18, 18);
		add(label_1);

		fillcombo();
		updateDiagnosis();
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
		cmbPhysicianSignature.addItem(user.getUserName());

	}

	public boolean isEval() {
		if (cmbFrequencyDuration != null
				&& cmbFrequencyDuration.getSelectedItem().toString().length() > 0) {
			return cmbFrequencyDuration.getSelectedItem().toString()
					.toLowerCase().contains("eval");
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
		PtOtStOccupationalTherapy refPtOtStOccupationalTherapy = new PtOtStOccupationalTherapy();

		if (!(txtTreatmentDiagnosis.getText().equalsIgnoreCase(""))) {
			txtTreatmentDiagnosis
					.setRichTextFieldData("PtOtStOccupationalTherapy: Treatment Diagnosis");
			refPtOtStOccupationalTherapy
					.setTreatmentDiagnosis(txtTreatmentDiagnosis.getField());
		}

		if (!(txtInitialAssessmentRefBy.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentRefBy
					.setRichTextFieldData("PtOtStOccupationalTherapy: Referred By");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentRefBy(txtInitialAssessmentRefBy
							.getField());
		}

		if (!(txtInitialAssessmentLivingType.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentLivingType
					.setRichTextFieldData("PtOtStOccupationalTherapy: Living Type");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentLivingType(txtInitialAssessmentLivingType
							.getField());
		}

		if (!(txtInitialAssessmentAssistance.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentAssistance
					.setRichTextFieldData("PtOtStOccupationalTherapy: Assistance");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentAssistance(txtInitialAssessmentAssistance
							.getField());
		}

		if (!(txtInitialAssessmentRecentTherapyField.getText()
				.equalsIgnoreCase(""))) {
			txtInitialAssessmentRecentTherapyField
					.setRichTextFieldData("PtOtStOccupationalTherapy: RecentTherapyField");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentRecentTherapyField(txtInitialAssessmentRecentTherapyField
							.getField());
		}

		if (!(txtInitialAssessmentDcPlanGoal.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentDcPlanGoal
					.setRichTextFieldData("PtOtStOccupationalTherapy: DcPlanGoal");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentDcPlanGoal(txtInitialAssessmentDcPlanGoal
							.getField());
		}

		if (!(txtInitialAssessmentPrecausions.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentPrecausions
					.setRichTextFieldData("PtOtStOccupationalTherapy: Precausions");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentPrecausions(txtInitialAssessmentPrecausions
							.getField());
		}

		if (!(txtInitialAssessmentHomeMgmt.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentHomeMgmt
					.setRichTextFieldData("PtOtStOccupationalTherapy: Home MGMT");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentHomeMgmt(txtInitialAssessmentHomeMgmt
							.getField());
		}

		if (!(txtInitialAssessmentLivesWith.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentLivesWith
					.setRichTextFieldData("PtOtStOccupationalTherapy: Lives With");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentLivesWith(txtInitialAssessmentLivesWith
							.getField());
		}

		if (!(txtCurPositioning.getText().equalsIgnoreCase(""))) {
			txtCurPositioning
					.setRichTextFieldData("PtOtStOccupationalTherapy: CurPositioning");
			refPtOtStOccupationalTherapy.setCurPositioning(txtCurPositioning
					.getField());
		}

		if (!(txtInitialAssessmentEvalStrengthR.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentEvalStrengthR
					.setRichTextFieldData("PtOtStOccupationalTherapy: EvalStrengthR");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentEvalStrengthR(txtInitialAssessmentEvalStrengthR
							.getField());
		}

		if (!(txtInitialAssessmentEvalStrengthL.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentEvalStrengthL
					.setRichTextFieldData("PtOtStOccupationalTherapy: EvalStrengthL");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentEvalStrengthL(txtInitialAssessmentEvalStrengthL
							.getField());
		}

		if (!(txtInitialAssessmentEvalRomR.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentEvalRomR
					.setRichTextFieldData("PtOtStOccupationalTherapy: EvalRomR");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentEvalRomR(txtInitialAssessmentEvalRomR
							.getField());
		}

		if (!(txtInitialAssessmentEvalRomL.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentEvalRomL
					.setRichTextFieldData("PtOtStOccupationalTherapy: EvalRomL");
			refPtOtStOccupationalTherapy
					.setInitialAssessmentEvalRomL(txtInitialAssessmentEvalRomL
							.getField());
		}

		if (!(txtBalanceSitStat.getText().equalsIgnoreCase(""))) {
			txtBalanceSitStat
					.setRichTextFieldData("PtOtStOccupationalTherapy: BalanceSitStat");
			refPtOtStOccupationalTherapy.setBalanceSitStat(txtBalanceSitStat
					.getField());
		}

		if (!(txtBalanceSitDyn.getText().equalsIgnoreCase(""))) {
			txtBalanceSitDyn
					.setRichTextFieldData("PtOtStOccupationalTherapy: BalanceSitDyn");
			refPtOtStOccupationalTherapy.setBalanceSitDyn(txtBalanceSitDyn
					.getField());
		}

		if (!(txtBalanceStandStat.getText().equalsIgnoreCase(""))) {
			txtBalanceStandStat
					.setRichTextFieldData("PtOtStOccupationalTherapy: BalanceStandStat");
			refPtOtStOccupationalTherapy
					.setBalanceStandStat(txtBalanceStandStat.getField());
		}

		if (!(txtBalanceStandDyn.getText().equalsIgnoreCase(""))) {
			txtBalanceStandDyn
					.setRichTextFieldData("PtOtStOccupationalTherapy: BalanceStandDyn");
			refPtOtStOccupationalTherapy.setBalanceStandDyn(txtBalanceStandDyn
					.getField());
		}

		if (!(txtSafetyAwareness.getText().equalsIgnoreCase(""))) {
			txtSafetyAwareness
					.setRichTextFieldData("PtOtStOccupationalTherapy: SafetyAwareness");
			refPtOtStOccupationalTherapy.setSafetyAwareness(txtSafetyAwareness
					.getField());
		}

		if (!(txtVitalsHr.getText().equalsIgnoreCase(""))) {
			txtVitalsHr
					.setRichTextFieldData("PtOtStOccupationalTherapy: VitalsHr");
			refPtOtStOccupationalTherapy.setVitalsHr(txtVitalsHr.getField());
		}

		if (!(txtVitalsBp.getText().equalsIgnoreCase(""))) {
			txtVitalsBp
					.setRichTextFieldData("PtOtStOccupationalTherapy: VitalsBp");
			refPtOtStOccupationalTherapy.setVitalsBp(txtVitalsBp.getField());
		}

		if (!(txtVitalsPulseOx.getText().equalsIgnoreCase(""))) {
			txtVitalsPulseOx
					.setRichTextFieldData("PtOtStOccupationalTherapy: VitalsPulseOx");
			refPtOtStOccupationalTherapy.setVitalsPulseOx(txtVitalsPulseOx
					.getField());
		}

		refPtOtStOccupationalTherapy.setResidentId(Global.currentResidenceKey);

		refPtOtStOccupationalTherapy.setFollowsCom(SwingUtils
				.getSelectedButton(bgFollowsCom));
		refPtOtStOccupationalTherapy
				.setPatientParticipatedNaField(txtPatientParticipatedNaField
						.getText());
		refPtOtStOccupationalTherapy
				.setPatientParticipatedNa(cbPatientParticipatedNa.isSelected());
		refPtOtStOccupationalTherapy
				.setPatientParticipatedIn(cbPatientParticipatedIn.isSelected());
		refPtOtStOccupationalTherapy.setRecommendationImp(txtRecommendationImp
				.getNotes());
		refPtOtStOccupationalTherapy.setTransferCurEquip(txtTransferCurEquip
				.getNotes());
		refPtOtStOccupationalTherapy.setTransferDep(cbTransferDep.isSelected());
		refPtOtStOccupationalTherapy.setTransferMaxA(cbTransferMaxA
				.isSelected());
		refPtOtStOccupationalTherapy.setTransferModA(cbTransferModA
				.isSelected());
		refPtOtStOccupationalTherapy.setTransferMinA(cbTransferMinA
				.isSelected());
		refPtOtStOccupationalTherapy.setTransferCg(cbTransferCg.isSelected());
		refPtOtStOccupationalTherapy.setTransferVq(cbTransferVq.isSelected());
		refPtOtStOccupationalTherapy.setTransferI(cbTransferI.isSelected());
		refPtOtStOccupationalTherapy.setBedMobCurEquip(txtBedMobCurEquip
				.getNotes());
		refPtOtStOccupationalTherapy.setBedMobDep(cbBedMobDep.isSelected());
		refPtOtStOccupationalTherapy.setBedMobMaxA(cbBedMobMaxA.isSelected());
		refPtOtStOccupationalTherapy.setBedMobModA(cbBedMobModA.isSelected());
		refPtOtStOccupationalTherapy.setBedMobMinA(cbBedMobMinA.isSelected());
		refPtOtStOccupationalTherapy.setBedMobCg(cbBedMobCg.isSelected());
		refPtOtStOccupationalTherapy.setBedMobVq(cbBedMobVq.isSelected());
		refPtOtStOccupationalTherapy.setBedMobI(cbBedMobI.isSelected());
		refPtOtStOccupationalTherapy
				.setWcMobilityCurEquip(txtWcMobilityCurEquip.getNotes());
		refPtOtStOccupationalTherapy.setWcMobilityDep(cbWcMobilityDep
				.isSelected());
		refPtOtStOccupationalTherapy.setWcMobilityMaxA(cbWcMobilityMaxA
				.isSelected());
		refPtOtStOccupationalTherapy.setWcMobilityModA(cbWcMobilityModA
				.isSelected());
		refPtOtStOccupationalTherapy.setWcMobilityMinA(cbWcMobilityMinA
				.isSelected());
		refPtOtStOccupationalTherapy.setWcMobilityCg(cbWcMobilityCg
				.isSelected());
		refPtOtStOccupationalTherapy.setWcMobilityVq(cbWcMobilityVq
				.isSelected());
		refPtOtStOccupationalTherapy.setWcMobilityI(cbWcMobilityI.isSelected());
		refPtOtStOccupationalTherapy.setToiletingCurEquip(txtToiletingCurEquip
				.getNotes());
		refPtOtStOccupationalTherapy.setToiletingDep(cbToiletingDep
				.isSelected());
		refPtOtStOccupationalTherapy.setToiletingMaxA(cbToiletingMaxA
				.isSelected());
		refPtOtStOccupationalTherapy.setToiletingModA(cbToiletingModA
				.isSelected());
		refPtOtStOccupationalTherapy.setToiletingMinA(cbToiletingMinA
				.isSelected());
		refPtOtStOccupationalTherapy.setToiletingCg(cbToiletingCg.isSelected());
		refPtOtStOccupationalTherapy.setToiletingVq(cbToiletingVq.isSelected());
		refPtOtStOccupationalTherapy.setToiletingI(cbToiletingI.isSelected());
		refPtOtStOccupationalTherapy.setHygGroomCurEquip(txtHygGroomCurEquip
				.getNotes());
		refPtOtStOccupationalTherapy.setHygGroomDep(cbHygGroomDep.isSelected());
		refPtOtStOccupationalTherapy.setHygGroomMaxA(cbHygGroomMaxA
				.isSelected());
		refPtOtStOccupationalTherapy.setHygGroomModA(cbHygGroomModA
				.isSelected());
		refPtOtStOccupationalTherapy.setHygGroomMinA(cbHygGroomMinA
				.isSelected());
		refPtOtStOccupationalTherapy.setHygGroomCg(cbHygGroomCg.isSelected());
		refPtOtStOccupationalTherapy.setHygGroomVq(cbHygGroomVq.isSelected());
		refPtOtStOccupationalTherapy.setHygGroomI(cbHygGroomI.isSelected());
		refPtOtStOccupationalTherapy.setLeDressCurEquip(txtLeDressCurEquip
				.getNotes());
		refPtOtStOccupationalTherapy.setLeDressDep(cbLeDressDep.isSelected());
		refPtOtStOccupationalTherapy.setLeDressMaxA(cbLeDressMaxA.isSelected());
		refPtOtStOccupationalTherapy.setLeDressModA(cbLeDressModA.isSelected());
		refPtOtStOccupationalTherapy.setLeDressMinA(cbLeDressMinA.isSelected());
		refPtOtStOccupationalTherapy.setLeDressCg(cbLeDressCg.isSelected());
		refPtOtStOccupationalTherapy.setLeDressVq(cbLeDressVq.isSelected());
		refPtOtStOccupationalTherapy.setLeDressI(cbLeDressI.isSelected());
		refPtOtStOccupationalTherapy
				.setInitialAssessmentEvalLe(txtInitialAssessmentEvalLe
						.getText());
		refPtOtStOccupationalTherapy
				.setInitialAssessmentEvalHandFxnL(txtInitialAssessmentEvalHandFxnL
						.getText());
		refPtOtStOccupationalTherapy
				.setInitialAssessmentEvalHandFxnR(txtInitialAssessmentEvalHandFxnR
						.getText());

		refPtOtStOccupationalTherapy
				.setPlanOfCareEquipOtherField(txtPlanOfCareEquipOtherField
						.getText());
		refPtOtStOccupationalTherapy.setPlanOfCarePainMod(txtPlanOfCarePainMod
				.getText());
		refPtOtStOccupationalTherapy.setOccHmo(cbOccHmo.isSelected());
		refPtOtStOccupationalTherapy.setCognitionAphasia(cbCognitionAphasia
				.isSelected());
		refPtOtStOccupationalTherapy
				.setCognitionDecreasedVision(cbCognitionDecreasedVision
						.isSelected());
		refPtOtStOccupationalTherapy
				.setCognitionOrientedX123(cmbCognitionOrientedX123
						.getSelectedItem()
						+ "");
		refPtOtStOccupationalTherapy.setCognitionAlert(cbCognitionAlert
				.isSelected());
		refPtOtStOccupationalTherapy.setUeDressCurEquip(txtUeDressCurEquip
				.getNotes());
		refPtOtStOccupationalTherapy.setEatingCurEquip(txtEatingCurEquip
				.getNotes());
		refPtOtStOccupationalTherapy.setUeDressDep(cbUeDressDep.isSelected());
		refPtOtStOccupationalTherapy.setEatingDep(cbEatingDep.isSelected());
		refPtOtStOccupationalTherapy.setUeDressMaxA(cbUeDressMaxA.isSelected());
		refPtOtStOccupationalTherapy.setEatingMaxA(cbEatingMaxA.isSelected());
		refPtOtStOccupationalTherapy.setUeDressModA(cbUeDressModA.isSelected());
		refPtOtStOccupationalTherapy.setEatingModA(cbEatingModA.isSelected());
		refPtOtStOccupationalTherapy.setUeDressMinA(cbUeDressMinA.isSelected());
		refPtOtStOccupationalTherapy.setEatingMinA(cbEatingMinA.isSelected());
		refPtOtStOccupationalTherapy.setUeDressCg(cbUeDressCg.isSelected());
		refPtOtStOccupationalTherapy.setEatingCg(cbEatingCg.isSelected());
		refPtOtStOccupationalTherapy.setUeDressVq(cbUeDressVq.isSelected());
		refPtOtStOccupationalTherapy.setEatingVq(cbEatingVq.isSelected());
		refPtOtStOccupationalTherapy.setUeDressI(cbUeDressI.isSelected());
		refPtOtStOccupationalTherapy.setEatingI(cbEatingI.isSelected());
		refPtOtStOccupationalTherapy
				.setSignatureTherapy((String) cmbSignatureTherapy
						.getSelectedItem());
		refPtOtStOccupationalTherapy
				.setInitialAssessmentRecentTherapyNa(cbInitialAssessmentRecentTherapyNa
						.isSelected());
		refPtOtStOccupationalTherapy
				.setInitialAssessmentPmh(txtInitialAssessmentPmh.getText());
		refPtOtStOccupationalTherapy
				.setInitialAssessmentPlof(txtInitialAssessmentPlof.getText());
		refPtOtStOccupationalTherapy.setReasonForReferral(txtReasonForReferral
				.getNotes());
		refPtOtStOccupationalTherapy.setRehabPot(SwingUtils
				.getSelectedButton(bgRehabPot));
		refPtOtStOccupationalTherapy
				.setInitialAssessmentAge(txtInitialAssessmentAge.getText());
		refPtOtStOccupationalTherapy.setCertificationNa(cbCertificationNa
				.isSelected());
		refPtOtStOccupationalTherapy
				.setCertificationThroughDate(dcCertificationThroughDate
						.getDate());
		refPtOtStOccupationalTherapy
				.setCertificationFromDate(dcCertificationFromDate.getDate());
		refPtOtStOccupationalTherapy
				.setPhysicianSignature((String) cmbPhysicianSignature
						.getSelectedItem());
		refPtOtStOccupationalTherapy.setCertifyDate(dcCertifyDate.getDate());
		refPtOtStOccupationalTherapy.setPhysicianName(txtPhysicianName
				.getText());
		refPtOtStOccupationalTherapy
				.setPlanOfTreatmentOutcome(txtPlanOfTreatmentOutcome.getNotes());
		refPtOtStOccupationalTherapy.setLongTermGoalsWks(txtLongTermGoalsWks
				.getText());
		refPtOtStOccupationalTherapy
				.setPlanOfTreatmentGoals(txtPlanOfTreatmentGoals.getNotes());
		refPtOtStOccupationalTherapy.setShortTermGoalsWks(txtShortTermGoalsWks
				.getText());
		refPtOtStOccupationalTherapy.setSocDate(dcSocDate.getDate());
		refPtOtStOccupationalTherapy.setOnsetDate(dcOnsetDate.getDate());
		refPtOtStOccupationalTherapy.setPrimaryDiagnosis(txtPrimaryDiagnosis
				.getText());
		refPtOtStOccupationalTherapy.setFrequencyDuration(cmbFrequencyDuration
				.getSelectedItem()
				+ "");
		refPtOtStOccupationalTherapy.setHospitalizationNa(cbHospitalizationNa
				.isSelected());
		refPtOtStOccupationalTherapy
				.setHospitalizationToDate(dcHospitalizationToDate.getDate());
		refPtOtStOccupationalTherapy
				.setHospitalizationFromDate(dcHospitalizationFromDate.getDate());
		refPtOtStOccupationalTherapy.setProviderName(txtProviderName.getText());
		refPtOtStOccupationalTherapy.setHicn(txtHicn.getText());
		refPtOtStOccupationalTherapy.setNpiNo(txtNpiNo.getText());
		refPtOtStOccupationalTherapy.setOccOtherField(txtOccOtherField
				.getText());
		refPtOtStOccupationalTherapy.setOccOther(cbOccOther.isSelected());
		refPtOtStOccupationalTherapy.setOccPartA(cbOccPartA.isSelected());
		refPtOtStOccupationalTherapy.setOccPartB(cbOccPartB.isSelected());
		refPtOtStOccupationalTherapy.setTherapyexc(cbTherapyExc.isSelected());
		refPtOtStOccupationalTherapy.setNeuroMuscular(cbNeuromuscularReed
				.isSelected());
		refPtOtStOccupationalTherapy.setBedMobility(cbBedMobilityTraining
				.isSelected());
		refPtOtStOccupationalTherapy.setTherapyActivities(cbTherapyActivities
				.isSelected());
		refPtOtStOccupationalTherapy.setTransferTrain(cbTransferTrain
				.isSelected());
		refPtOtStOccupationalTherapy.setCognitiveSkills(cbCognitiveSkills
				.isSelected());
		refPtOtStOccupationalTherapy.setAdlEating(cbEating.isSelected());
		refPtOtStOccupationalTherapy.setUbLbDressing(cbUblbDressing
				.isSelected());
		refPtOtStOccupationalTherapy.setHygieneGroom(cbHygienegroom
				.isSelected());
		refPtOtStOccupationalTherapy.setToileting(cbToileting.isSelected());
		refPtOtStOccupationalTherapy.setMessage(cbMessage.isSelected());

		try {
			Global.currentPtOtStOccupationalTherapyKey = MedrexClientManager
					.getInstance().insertOrUpdatePtOtStOccupationalTherapy(
							refPtOtStOccupationalTherapy);
		} catch (Exception e) {
		}
	}

	public void updateData() {
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txt$PatientFirstName.setText(rm.getUserName());
			txt$PatientsLastName.setText(rm.getUserPass());
			txtHicn.setText(rm.getMedicaidNum());
			if (rm.getSex().toString().equalsIgnoreCase("Male")) {
				lblSex.setText("M");
			} else {
				lblSex.setText("F");
			}
		} catch (Exception e) {

		}

		List l = null;
		try {
			l = MedrexClientManager.getInstance().getPhysicianForms(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator i = l.iterator();
		int doctorId = 0;
		String doctorName = "";
		while (i.hasNext()) {
			PhysicianForm d = (PhysicianForm) i.next();
			doctorId = d.getPhysician().getSerial();
			try {
				Doctors doctors = MedrexClientManager.getInstance()
						.getDoctorsRecord(doctorId);
				if (doctors != null
						&& (doctors.getDoctorType().toString()
								.equalsIgnoreCase("PHYSICIAN") || doctors
								.getDoctorType().toString().equalsIgnoreCase(
										"PODIATRIST"))) {
					doctorName += doctors.getPhysicianName() + " "
							+ doctors.getPhysicianSurName() + ", ";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		txtPhysicianName.setText(doctorName);

		NursingHome nh = null;
		try {
			nh = MedrexClientManager.getInstance().getNursingHomeInfo(1);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MedrexException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (nh != null) {
			txtNpiNo.setText(nh.getNpi());
			txtProviderName.setText(nh.getName());
		}
		txtInitialAssessmentAge.setText(Utils.getResidentAgeYear() + "");
		PtOtStOccupationalTherapy refPtOtStOccupationalTherapy = null;

		if (Global.currentPtOtStOccupationalTherapyKey != 0) {
			try {
				refPtOtStOccupationalTherapy = MedrexClientManager
						.getInstance().getPtOtStOccupationalTherapy(
								Global.currentPtOtStOccupationalTherapyKey);
			} catch (Exception e) {

			}
			SwingUtils.setSelectedButton(bgFollowsCom,
					refPtOtStOccupationalTherapy.getFollowsCom());
			txtPatientParticipatedNaField.setText(refPtOtStOccupationalTherapy
					.getPatientParticipatedNaField());
			cbPatientParticipatedNa.setSelected(refPtOtStOccupationalTherapy
					.isPatientParticipatedNa());
			cbPatientParticipatedIn.setSelected(refPtOtStOccupationalTherapy
					.isPatientParticipatedIn());
			txtRecommendationImp.setNotes(refPtOtStOccupationalTherapy
					.getRecommendationImp());
			txtVitalsPulseOx.setField(refPtOtStOccupationalTherapy
					.getVitalsPulseOx());
			txtVitalsBp.setField(refPtOtStOccupationalTherapy.getVitalsBp());
			txtVitalsHr.setField(refPtOtStOccupationalTherapy.getVitalsHr());
			txtSafetyAwareness.setField(refPtOtStOccupationalTherapy
					.getSafetyAwareness());
			txtBalanceStandDyn.setField(refPtOtStOccupationalTherapy
					.getBalanceStandDyn());
			txtBalanceStandStat.setField(refPtOtStOccupationalTherapy
					.getBalanceStandStat());
			txtBalanceSitDyn.setField(refPtOtStOccupationalTherapy
					.getBalanceSitDyn());
			txtBalanceSitStat.setField(refPtOtStOccupationalTherapy
					.getBalanceSitStat());
			txtTransferCurEquip.setNotes(refPtOtStOccupationalTherapy
					.getTransferCurEquip());
			cbTransferDep.setSelected(refPtOtStOccupationalTherapy
					.isTransferDep());
			cbTransferMaxA.setSelected(refPtOtStOccupationalTherapy
					.isTransferMaxA());
			cbTransferModA.setSelected(refPtOtStOccupationalTherapy
					.isTransferModA());
			cbTransferMinA.setSelected(refPtOtStOccupationalTherapy
					.isTransferMinA());
			cbTransferCg.setSelected(refPtOtStOccupationalTherapy
					.isTransferCg());
			cbTransferVq.setSelected(refPtOtStOccupationalTherapy
					.isTransferVq());
			cbTransferI.setSelected(refPtOtStOccupationalTherapy.isTransferI());
			txtBedMobCurEquip.setNotes(refPtOtStOccupationalTherapy
					.getBedMobCurEquip());
			cbBedMobDep.setSelected(refPtOtStOccupationalTherapy.isBedMobDep());
			cbBedMobMaxA.setSelected(refPtOtStOccupationalTherapy
					.isBedMobMaxA());
			cbBedMobModA.setSelected(refPtOtStOccupationalTherapy
					.isBedMobModA());
			cbBedMobMinA.setSelected(refPtOtStOccupationalTherapy
					.isBedMobMinA());
			cbBedMobCg.setSelected(refPtOtStOccupationalTherapy.isBedMobCg());
			cbBedMobVq.setSelected(refPtOtStOccupationalTherapy.isBedMobVq());
			cbBedMobI.setSelected(refPtOtStOccupationalTherapy.isBedMobI());
			txtWcMobilityCurEquip.setNotes(refPtOtStOccupationalTherapy
					.getWcMobilityCurEquip());
			cbWcMobilityDep.setSelected(refPtOtStOccupationalTherapy
					.isWcMobilityDep());
			cbWcMobilityMaxA.setSelected(refPtOtStOccupationalTherapy
					.isWcMobilityMaxA());
			cbWcMobilityModA.setSelected(refPtOtStOccupationalTherapy
					.isWcMobilityModA());
			cbWcMobilityMinA.setSelected(refPtOtStOccupationalTherapy
					.isWcMobilityMinA());
			cbWcMobilityCg.setSelected(refPtOtStOccupationalTherapy
					.isWcMobilityCg());
			cbWcMobilityVq.setSelected(refPtOtStOccupationalTherapy
					.isWcMobilityVq());
			cbWcMobilityI.setSelected(refPtOtStOccupationalTherapy
					.isWcMobilityI());
			txtToiletingCurEquip.setNotes(refPtOtStOccupationalTherapy
					.getToiletingCurEquip());
			cbToiletingDep.setSelected(refPtOtStOccupationalTherapy
					.isToiletingDep());
			cbToiletingMaxA.setSelected(refPtOtStOccupationalTherapy
					.isToiletingMaxA());
			cbToiletingModA.setSelected(refPtOtStOccupationalTherapy
					.isToiletingModA());
			cbToiletingMinA.setSelected(refPtOtStOccupationalTherapy
					.isToiletingMinA());
			cbToiletingCg.setSelected(refPtOtStOccupationalTherapy
					.isToiletingCg());
			cbToiletingVq.setSelected(refPtOtStOccupationalTherapy
					.isToiletingVq());
			cbToiletingI.setSelected(refPtOtStOccupationalTherapy
					.isToiletingI());
			txtHygGroomCurEquip.setNotes(refPtOtStOccupationalTherapy
					.getHygGroomCurEquip());
			cbHygGroomDep.setSelected(refPtOtStOccupationalTherapy
					.isHygGroomDep());
			cbHygGroomMaxA.setSelected(refPtOtStOccupationalTherapy
					.isHygGroomMaxA());
			cbHygGroomModA.setSelected(refPtOtStOccupationalTherapy
					.isHygGroomModA());
			cbHygGroomMinA.setSelected(refPtOtStOccupationalTherapy
					.isHygGroomMinA());
			cbHygGroomCg.setSelected(refPtOtStOccupationalTherapy
					.isHygGroomCg());
			cbHygGroomVq.setSelected(refPtOtStOccupationalTherapy
					.isHygGroomVq());
			cbHygGroomI.setSelected(refPtOtStOccupationalTherapy.isHygGroomI());
			txtLeDressCurEquip.setNotes(refPtOtStOccupationalTherapy
					.getLeDressCurEquip());
			cbLeDressDep.setSelected(refPtOtStOccupationalTherapy
					.isLeDressDep());
			cbLeDressMaxA.setSelected(refPtOtStOccupationalTherapy
					.isLeDressMaxA());
			cbLeDressModA.setSelected(refPtOtStOccupationalTherapy
					.isLeDressModA());
			cbLeDressMinA.setSelected(refPtOtStOccupationalTherapy
					.isLeDressMinA());
			cbLeDressCg.setSelected(refPtOtStOccupationalTherapy.isLeDressCg());
			cbLeDressVq.setSelected(refPtOtStOccupationalTherapy.isLeDressVq());
			cbLeDressI.setSelected(refPtOtStOccupationalTherapy.isLeDressI());
			txtInitialAssessmentEvalLe.setText(refPtOtStOccupationalTherapy
					.getInitialAssessmentEvalLe());
			txtInitialAssessmentEvalHandFxnL
					.setText(refPtOtStOccupationalTherapy
							.getInitialAssessmentEvalHandFxnL());
			txtInitialAssessmentEvalHandFxnR
					.setText(refPtOtStOccupationalTherapy
							.getInitialAssessmentEvalHandFxnR());
			txtInitialAssessmentEvalRomL.setField(refPtOtStOccupationalTherapy
					.getInitialAssessmentEvalRomL());
			txtInitialAssessmentEvalRomR.setField(refPtOtStOccupationalTherapy
					.getInitialAssessmentEvalRomR());
			txtInitialAssessmentEvalStrengthL
					.setField(refPtOtStOccupationalTherapy
							.getInitialAssessmentEvalStrengthL());
			txtInitialAssessmentEvalStrengthR
					.setField(refPtOtStOccupationalTherapy
							.getInitialAssessmentEvalStrengthR());
			txtInitialAssessmentLivesWith.setField(refPtOtStOccupationalTherapy
					.getInitialAssessmentLivesWith());
			txtInitialAssessmentHomeMgmt.setField(refPtOtStOccupationalTherapy
					.getInitialAssessmentHomeMgmt());
			txtInitialAssessmentPrecausions
					.setField(refPtOtStOccupationalTherapy
							.getInitialAssessmentPrecausions());
			txtInitialAssessmentDcPlanGoal
					.setField(refPtOtStOccupationalTherapy
							.getInitialAssessmentDcPlanGoal());
			txtPlanOfCareEquipOtherField.setText(refPtOtStOccupationalTherapy
					.getPlanOfCareEquipOtherField());
			txtPlanOfCarePainMod.setText(refPtOtStOccupationalTherapy
					.getPlanOfCarePainMod());
			cbOccHmo.setSelected(refPtOtStOccupationalTherapy.isOccHmo());
			cbCognitionAphasia.setSelected(refPtOtStOccupationalTherapy
					.isCognitionAphasia());
			cbCognitionDecreasedVision.setSelected(refPtOtStOccupationalTherapy
					.isCognitionDecreasedVision());
			cmbCognitionOrientedX123
					.setSelectedItem(refPtOtStOccupationalTherapy
							.getCognitionOrientedX123());
			cbCognitionAlert.setSelected(refPtOtStOccupationalTherapy
					.isCognitionAlert());
			txtCurPositioning.setField(refPtOtStOccupationalTherapy
					.getCurPositioning());
			txtUeDressCurEquip.setNotes(refPtOtStOccupationalTherapy
					.getUeDressCurEquip());
			txtEatingCurEquip.setNotes(refPtOtStOccupationalTherapy
					.getEatingCurEquip());
			cbUeDressDep.setSelected(refPtOtStOccupationalTherapy
					.isUeDressDep());
			cbEatingDep.setSelected(refPtOtStOccupationalTherapy.isEatingDep());
			cbUeDressMaxA.setSelected(refPtOtStOccupationalTherapy
					.isUeDressMaxA());
			cbEatingMaxA.setSelected(refPtOtStOccupationalTherapy
					.isEatingMaxA());
			cbUeDressModA.setSelected(refPtOtStOccupationalTherapy
					.isUeDressModA());
			cbEatingModA.setSelected(refPtOtStOccupationalTherapy
					.isEatingModA());
			cbUeDressMinA.setSelected(refPtOtStOccupationalTherapy
					.isUeDressMinA());
			cbEatingMinA.setSelected(refPtOtStOccupationalTherapy
					.isEatingMinA());
			cbUeDressCg.setSelected(refPtOtStOccupationalTherapy.isUeDressCg());
			cbEatingCg.setSelected(refPtOtStOccupationalTherapy.isEatingCg());
			cbUeDressVq.setSelected(refPtOtStOccupationalTherapy.isUeDressVq());
			cbEatingVq.setSelected(refPtOtStOccupationalTherapy.isEatingVq());
			cbUeDressI.setSelected(refPtOtStOccupationalTherapy.isUeDressI());
			cbEatingI.setSelected(refPtOtStOccupationalTherapy.isEatingI());
			cmbSignatureTherapy.setSelectedItem(refPtOtStOccupationalTherapy
					.getSignatureTherapy());
			txtInitialAssessmentRecentTherapyField
					.setField(refPtOtStOccupationalTherapy
							.getInitialAssessmentRecentTherapyField());
			cbInitialAssessmentRecentTherapyNa
					.setSelected(refPtOtStOccupationalTherapy
							.isInitialAssessmentRecentTherapyNa());
			txtInitialAssessmentAssistance
					.setField(refPtOtStOccupationalTherapy
							.getInitialAssessmentAssistance());
			txtInitialAssessmentLivingType
					.setField(refPtOtStOccupationalTherapy
							.getInitialAssessmentLivingType());
			txtInitialAssessmentPmh.setText(refPtOtStOccupationalTherapy
					.getInitialAssessmentPmh());
			txtInitialAssessmentPlof.setText(refPtOtStOccupationalTherapy
					.getInitialAssessmentPlof());
			txtReasonForReferral.setNotes(refPtOtStOccupationalTherapy
					.getReasonForReferral());
			SwingUtils.setSelectedButton(bgRehabPot,
					refPtOtStOccupationalTherapy.getRehabPot());
			txtInitialAssessmentRefBy.setField(refPtOtStOccupationalTherapy
					.getInitialAssessmentRefBy());
			txtInitialAssessmentAge.setText(refPtOtStOccupationalTherapy
					.getInitialAssessmentAge());
			cbCertificationNa.setSelected(refPtOtStOccupationalTherapy
					.isCertificationNa());
			dcCertificationThroughDate.setDate(refPtOtStOccupationalTherapy
					.getCertificationThroughDate());
			dcCertificationFromDate.setDate(refPtOtStOccupationalTherapy
					.getCertificationFromDate());
			cmbPhysicianSignature.setSelectedItem(refPtOtStOccupationalTherapy
					.getPhysicianSignature());
			dcCertifyDate
					.setDate(refPtOtStOccupationalTherapy.getCertifyDate());
			txtPhysicianName.setText(refPtOtStOccupationalTherapy
					.getPhysicianName());
			txtPlanOfTreatmentOutcome.setNotes(refPtOtStOccupationalTherapy
					.getPlanOfTreatmentOutcome());
			txtLongTermGoalsWks.setText(refPtOtStOccupationalTherapy
					.getLongTermGoalsWks());
			txtPlanOfTreatmentGoals.setNotes(refPtOtStOccupationalTherapy
					.getPlanOfTreatmentGoals());
			txtShortTermGoalsWks.setText(refPtOtStOccupationalTherapy
					.getShortTermGoalsWks());
			dcSocDate.setDate(refPtOtStOccupationalTherapy.getSocDate());
			dcOnsetDate.setDate(refPtOtStOccupationalTherapy.getOnsetDate());
			txtPrimaryDiagnosis.setText(refPtOtStOccupationalTherapy
					.getPrimaryDiagnosis());
			txtTreatmentDiagnosis.setField(refPtOtStOccupationalTherapy
					.getTreatmentDiagnosis());
			cmbFrequencyDuration.setSelectedItem(refPtOtStOccupationalTherapy
					.getFrequencyDuration());
			cbHospitalizationNa.setSelected(refPtOtStOccupationalTherapy
					.isHospitalizationNa());
			dcHospitalizationToDate.setDate(refPtOtStOccupationalTherapy
					.getHospitalizationToDate());
			dcHospitalizationFromDate.setDate(refPtOtStOccupationalTherapy
					.getHospitalizationFromDate());
			txtProviderName.setText(refPtOtStOccupationalTherapy
					.getProviderName());
			// txtHicn.setText(refPtOtStOccupationalTherapy.getHicn());
			// txtNpiNo.setText(refPtOtStOccupationalTherapy.getNpiNo());
			txtOccOtherField.setText(refPtOtStOccupationalTherapy
					.getOccOtherField());
			cbOccOther.setSelected(refPtOtStOccupationalTherapy.isOccOther());
			cbOccPartA.setSelected(refPtOtStOccupationalTherapy.isOccPartA());
			cbOccPartB.setSelected(refPtOtStOccupationalTherapy.isOccPartB());
			cbTherapyExc.setSelected(refPtOtStOccupationalTherapy
					.isTherapyexc());
			cbNeuromuscularReed.setSelected(refPtOtStOccupationalTherapy
					.isNeuroMuscular());
			cbBedMobilityTraining.setSelected(refPtOtStOccupationalTherapy
					.isBedMobility());
			cbTherapyActivities.setSelected(refPtOtStOccupationalTherapy
					.isTherapyActivities());
			cbTransferTrain.setSelected(refPtOtStOccupationalTherapy
					.isTransferTrain());
			cbCognitiveSkills.setSelected(refPtOtStOccupationalTherapy
					.isCognitiveSkills());
			cbEating.setSelected(refPtOtStOccupationalTherapy.isAdlEating());
			cbUblbDressing.setSelected(refPtOtStOccupationalTherapy
					.isUbLbDressing());
			cbHygienegroom.setSelected(refPtOtStOccupationalTherapy
					.isHygieneGroom());
			cbToileting.setSelected(refPtOtStOccupationalTherapy.isToileting());
			cbMessage.setSelected(refPtOtStOccupationalTherapy.isMessage());
		}
	}
}