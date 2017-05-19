package medrex.client.main.ptOtSt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
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
import medrex.commons.vo.ptOtSt.PtOtStPhysicalTheray;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxRichTextField;
import com.sX.swing.notes.JxNotes;
import com.toedter.calendar.JDateChooser;

public class PanelPtOtStPhysicalTheray extends JPanel {

	private JCheckBox cbUsHeatStim;
	private JCheckBox cbPainMod;
	private JCheckBox cbSensoryTech;
	private JCheckBox cbMessage;
	private JCheckBox cbCheckout;
	private JCheckBox cbProsthetics;
	private JCheckBox cbOrthotics;
	private JCheckBox cbWCManagePropulsion;
	private JCheckBox cbAdl;
	private JCheckBox cbCogSkills;
	private JCheckBox cbTherapyAct;
	private JCheckBox cbGaintTrain;
	private JCheckBox cbReed;
	private JCheckBox cbNeumerousc;
	private JCheckBox cbTherapyEx;
	private JCheckBox cbEvalTx;
	private ButtonGroup bgFollowCommands = new ButtonGroup();
	private JRadioButton rbFollowsComMultiStep;
	private JRadioButton rbFollowsCom2Step;
	private JRadioButton rbFollowsCom1Step;
	private JRadioButton rbFollowsComTactileCuesNeeded;
	private JLabel circleOneLabel_2;
	private JLabel ageLabel_37;
	private JCheckBox cbCognitionOrientedX12;
	private JCheckBox cbCognitionAlert;
	private JLabel howIsPositioningLabel_3;
	private JxRichTextField txtEvalImpaired;
	private JLabel howIsPositioningLabel_2;
	private JxRichTextField txtEvalIntact;
	private JLabel howIsPositioningLabel_1;
	private JxRichTextField txtEvalSafetyAwareness;
	private JTextField txtEvalPainEdema;
	private JLabel ageLabel_36;
	private JxNotes txtEvalGaintPatternPosture;
	private JLabel ageLabel_35;
	private JxRichTextField txtEvalAmbAmtAsst;
	private JLabel ageLabel_34;
	private JxRichTextField txtEvalAmbAsstDev;
	private JLabel ageLabel_33;
	private JxRichTextField txtEvalAmbDistance;
	private JLabel ageLabel_32;
	private JxRichTextField txtEvalBalanceTestScore;
	private JLabel ageLabel_20;
	private JxRichTextField txtEvalBalanceStandDyn;
	private JLabel ageLabel_19;
	private JxRichTextField txtEvalBalanceStandStatic;
	private JLabel ageLabel_18;
	private JxRichTextField txtEvalBalanceSitDyn;
	private JLabel ageLabel_17;
	private JxRichTextField txtEvalBalanceSitStatic;
	private JLabel ageLabel_15;
	private JxRichTextField txtEvalTransferSupStand;
	private JLabel ageLabel_13;
	private JxRichTextField txtEvalBedMobRoll;
	private JLabel ageLabel_31;
	private JxRichTextField txtEvalStrengthLeR;
	private JLabel ageLabel_30;
	private JxRichTextField txtEvalStrengthUeL;
	private JLabel ageLabel_11;
	private JxRichTextField txtEvalStrengthUeR;
	private JLabel ageLabel_29;
	private JxRichTextField txtEvalRomUe;
	private JLabel ageLabel_28;
	private JxRichTextField txtInitialAssessmentAssistance;
	private JLabel ageLabel_27;
	private JxRichTextField txtInitialAssessmentLiveWith;
	private JLabel ageLabel_26;
	private JxRichTextField txtInitialAssessmentStairs;
	private JLabel ageLabel_25;
	private JxRichTextField txtInitialAssessmentSituationType;
	private JLabel ageLabel_8;
	private JxRichTextField txtInitialAssessmentWbs;
	private JLabel ageLabel_24;
	private JLabel sensoryReeducationPainLabel_1;
	private JTextField txtPlanOfCareOther;
	private JLabel label_14;
	private JPanel panel_25;
	private JxNotes txtRecommendationImp;
	private JLabel ageLabel_23;
	private JLabel circleOneLabel_11;
	private JLabel ageLabel_21;
	private JTextField txtEvalOther;
	private JLabel howIsPositioningLabel;
	private JxRichTextField txtEvalTransferStandPivot;
	private JLabel ageLabel_16;
	private JxRichTextField txtEvalBedMobSupSit;
	private JLabel ageLabel_14;
	private JLabel ageLabel_12;
	private JxRichTextField txtEvalStrengthLeL;
	private JComboBox cmbSignatureTherapy;
	// private ButtonGroup bgCognition = new ButtonGroup();
	private JLabel ageLabel_10;
	private JxRichTextField txtEvalRomLe;
	private JLabel circleOneLabel_5;
	private JLabel ageLabel_9;
	private JLabel evaluationLabel;
	private JxRichTextField txtInitialAssessmentRecTherapy;
	private JCheckBox cbInitialAssessmentRecTherapyNa;
	private JLabel ageLabel_7;
	private JxRichTextField txtInitialAssessmentPrecausions;
	private JLabel ageLabel_6;
	private JxRichTextField txtInitialAssessmentDcPlan;
	private JLabel ageLabel_5;
	private JTextField txtInitialAssessmentPmh;
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
	private JDateChooser dcCertificationToDate;
	private JDateChooser dcCertificationFromDate;
	private JLabel physicianNameLabel_5;
	private JLabel physicianNameLabel_4;
	private JLabel physicianNameLabel_3;
	private JPanel panel_19;
	private JCheckBox cbPhysicianCertifyNaOnFileCheckBox;
	private JComboBox cmbPhysicianCertifySign;
	private JLabel physicianNameLabel_2;
	private JDateChooser dcPhysicianCertifyDate;
	private JLabel physicianNameLabel_1;
	private JTextField txtPhysicianCertifyName;
	private JLabel physicianNameLabel;
	private JTextArea textArea_3;
	private JxNotes txtPlanOfTreatmentLong;
	private JLabel shortTermGoalsLabel_3;
	private JTextField txtPlanOfTreatmentLongWks;
	private JLabel shortTermGoalsLabel_2;
	private JLabel outcomeLabel;
	private JxNotes txtPlanOfTreatmentShort;
	private JLabel shortTermGoalsLabel_1;
	private JTextField txtPlanOfTreatmentShortWks;
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
	private JTextField txt$PatientsFirstName;
	private JLabel label_2;
	private JPanel panel_6;
	private JTextField txt$PatientsLastName;
	private JPanel panel_4;
	private JLabel label;
	private JPanel panel_3;
	private JTextField txtPhysicalOtherField;
	private JCheckBox cbPhysicalOther;
	private JCheckBox cbPhysicalPartA;
	private JCheckBox cbPhysicalPartB;
	private JLabel hcfa700FormLabel_1;
	private JLabel hcfa700FormLabel;
	private JPanel panel_2;
	private JPanel panel_1;
	private JPanel panel;
	private JComboBox cmbOriented;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelPtOtStPhysicalTheray() {
		super();
		Global.panelPtOtStPhysicalTheray = this;
		setPreferredSize(new Dimension(900, 1200));
		setBackground(Color.WHITE);
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(10, 52, 850, 1083);
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

		txt$PatientsFirstName = new JTextField();
		txt$PatientsFirstName.setBounds(3, 23, 280, 21);
		panel_6.add(txt$PatientsFirstName);

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
		dcHospitalizationFromDate.setDate(MedrexClientManager.getServerTime());
		dcHospitalizationFromDate.setBounds(36, 20, 92, 23);
		dcHospitalizationFromDate
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(final PropertyChangeEvent evt) {
						Calendar cal = Calendar.getInstance();
						cal.setTime(dcHospitalizationFromDate.getDate());
						cal.add(cal.MONTH, 1);
						dcHospitalizationToDate.setDate(cal.getTime());
					}
				});
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
		dcOnsetDate.setDate(dcHospitalizationFromDate.getDate());
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
		dcSocDate.setDate(MedrexClientManager.getServerTime());
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

		cmbFrequencyDuration = new JComboBox();
		cmbFrequencyDuration.setModel(new DefaultComboBoxModel(new String[] {
				"3-5", "5-6", "EVAL ONLY" }));
		cmbFrequencyDuration.setBackground(Color.WHITE);
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

		final JButton Diagnosis = new JButton();
		Diagnosis.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				(FrameFactory
						.createWindowOfType(FrameResidentDiagnosisConfirm.class))
						.setVisible(true);
				updateDiagnosis();
			}
		});
		Diagnosis.setBounds(258, 23, 31, 20);
		panel_16.add(Diagnosis);
		Diagnosis.setText("+");

		txtPrimaryDiagnosis = new JTextField();
		txtPrimaryDiagnosis.setBounds(3, 23, 253, 20);
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

		txtPlanOfTreatmentShortWks = new JTextField();
		txtPlanOfTreatmentShortWks.setBounds(128, 23, 81, 20);
		panel_5.add(txtPlanOfTreatmentShortWks);

		shortTermGoalsLabel_1 = new JLabel();
		shortTermGoalsLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_1.setText("wks)");
		shortTermGoalsLabel_1.setBounds(212, 25, 28, 14);
		panel_5.add(shortTermGoalsLabel_1);

		Notes defaultPlanShort = new Notes();
		defaultPlanShort.setFormName("Physical Therapy");
		defaultPlanShort.setUserId(Global.currentLoggedInUserKey);
		defaultPlanShort.setNoteText("");

		txtPlanOfTreatmentShort = new JxNotes(isCategories);
		txtPlanOfTreatmentShort.setNotes(defaultPlanShort);
		txtPlanOfTreatmentShort.setBounds(3, 45, 408, 84);
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

		txtPlanOfTreatmentLongWks = new JTextField();
		txtPlanOfTreatmentLongWks.setBounds(189, 135, 81, 20);
		panel_5.add(txtPlanOfTreatmentLongWks);

		shortTermGoalsLabel_3 = new JLabel();
		shortTermGoalsLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		shortTermGoalsLabel_3.setText("wks)");
		shortTermGoalsLabel_3.setBounds(274, 135, 28, 14);
		panel_5.add(shortTermGoalsLabel_3);

		Notes defaultPlanLong = new Notes();
		defaultPlanLong.setFormName("Physical Therapy");
		defaultPlanLong.setUserId(Global.currentLoggedInUserKey);
		defaultPlanLong.setNoteText("");

		txtPlanOfTreatmentLong = new JxNotes(isCategories);
		txtPlanOfTreatmentLong.setNotes(defaultPlanLong);
		txtPlanOfTreatmentLong.setBounds(3, 157, 408, 90);
		panel_5.add(txtPlanOfTreatmentLong);

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

		textArea_3 = new JTextArea();
		textArea_3.setFocusable(false);
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setEditable(false);
		textArea_3.setFont(new Font("", Font.BOLD, 12));
		textArea_3
				.setText("14. I CERTIFY THE NEED FOR THESE SERVICES FURNISHED UNDER THIS PLAN OF TREATMENT WHILE UNDER MY CARE.");
		textArea_3.setWrapStyleWord(true);
		textArea_3.setLineWrap(true);
		textArea_3.setBounds(424, 303, 417, 32);
		panel_1.add(textArea_3);

		physicianNameLabel = new JLabel();
		physicianNameLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel.setText("PHYSICIAN NAME:");
		physicianNameLabel.setBounds(424, 340, 100, 14);
		panel_1.add(physicianNameLabel);

		txtPhysicianCertifyName = new JTextField();
		txtPhysicianCertifyName.setBounds(535, 340, 177, 20);
		panel_1.add(txtPhysicianCertifyName);

		physicianNameLabel_1 = new JLabel();
		physicianNameLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_1.setText("DATE:");
		physicianNameLabel_1.setBounds(715, 340, 39, 14);
		panel_1.add(physicianNameLabel_1);

		dcPhysicianCertifyDate = new JDateChooser();
		dcPhysicianCertifyDate.setDateFormatString("MM/dd/yyyy");
		dcPhysicianCertifyDate.setBounds(755, 340, 92, 23);
		panel_1.add(dcPhysicianCertifyDate);

		physicianNameLabel_2 = new JLabel();
		physicianNameLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		physicianNameLabel_2.setText("PHYSICIAN SIGNATURE:");
		physicianNameLabel_2.setBounds(424, 365, 132, 14);
		panel_1.add(physicianNameLabel_2);

		cmbPhysicianCertifySign = new JComboBox();
		cmbPhysicianCertifySign.setBackground(Color.WHITE);
		cmbPhysicianCertifySign.setBounds(567, 365, 177, 20);
		panel_1.add(cmbPhysicianCertifySign);

		cbPhysicianCertifyNaOnFileCheckBox = new JCheckBox();
		cbPhysicianCertifyNaOnFileCheckBox.setBackground(Color.WHITE);
		cbPhysicianCertifyNaOnFileCheckBox.setText("N/A ON FILE");
		cbPhysicianCertifyNaOnFileCheckBox.setBounds(757, 369, 91, 18);
		panel_1.add(cbPhysicianCertifyNaOnFileCheckBox);

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
						dcCertificationToDate.setDate(cal.getTime());
					}
				});

		panel_19.add(dcCertificationFromDate);

		dcCertificationToDate = new JDateChooser();
		dcCertificationToDate.setDateFormatString("MM/dd/yyyy");
		dcCertificationToDate.setBounds(232, 23, 102, 23);
		panel_19.add(dcCertificationToDate);

		cbCertificationNa = new JCheckBox();
		cbCertificationNa.setBackground(Color.LIGHT_GRAY);
		cbCertificationNa.setText("N/A");
		cbCertificationNa.setBounds(350, 23, 69, 18);
		panel_19.add(cbCertificationNa);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(420, 139, 428, 163);
		panel_1.add(panel_25);

		label_14 = new JLabel();
		label_14.setFont(new Font("Dialog", Font.BOLD, 12));
		label_14.setText("13.  PLAN OF CARE");
		label_14.setBounds(3, 3, 159, 14);
		panel_25.add(label_14);

		txtPlanOfCareOther = new JTextField();
		txtPlanOfCareOther.setBounds(73, 143, 346, 18);
		panel_25.add(txtPlanOfCareOther);

		sensoryReeducationPainLabel_1 = new JLabel();
		sensoryReeducationPainLabel_1
				.setFont(new Font("Dialog", Font.BOLD, 12));
		sensoryReeducationPainLabel_1.setText("OTHER:");
		sensoryReeducationPainLabel_1.setBounds(25, 145, 42, 14);
		panel_25.add(sensoryReeducationPainLabel_1);

		cbEvalTx = new JCheckBox();
		cbEvalTx.setOpaque(false);
		cbEvalTx.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbEvalTx.setText("EVAL TX");
		cbEvalTx.setBounds(10, 23, 66, 18);
		panel_25.add(cbEvalTx);

		cbGaintTrain = new JCheckBox();
		cbGaintTrain.setOpaque(false);
		cbGaintTrain.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbGaintTrain.setActionCommand("GAINT TRAIN");
		cbGaintTrain.setText("GAINT TRAIN");
		cbGaintTrain.setBounds(10, 47, 94, 18);
		panel_25.add(cbGaintTrain);

		cbWCManagePropulsion = new JCheckBox();
		cbWCManagePropulsion.setOpaque(false);
		cbWCManagePropulsion.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbWCManagePropulsion.setActionCommand("W/C MANAG PROPULSION");
		cbWCManagePropulsion.setText("W/C MANAG PROPULSION");
		cbWCManagePropulsion.setBounds(10, 71, 162, 18);
		panel_25.add(cbWCManagePropulsion);

		cbCheckout = new JCheckBox();
		cbCheckout.setOpaque(false);
		cbCheckout.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbCheckout.setText("CHECKOUT ARTHOTIC PROSTHETIC");
		cbCheckout.setBounds(10, 95, 210, 18);
		panel_25.add(cbCheckout);

		cbSensoryTech = new JCheckBox();
		cbSensoryTech.setOpaque(false);
		cbSensoryTech.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbSensoryTech.setText("SENSORY TECH");
		cbSensoryTech.setBounds(10, 119, 106, 18);
		panel_25.add(cbSensoryTech);

		cbTherapyEx = new JCheckBox();
		cbTherapyEx.setOpaque(false);
		cbTherapyEx.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTherapyEx.setText("THERAPY EX");
		cbTherapyEx.setBounds(93, 23, 94, 18);
		panel_25.add(cbTherapyEx);

		cbTherapyAct = new JCheckBox();
		cbTherapyAct.setOpaque(false);
		cbTherapyAct.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTherapyAct.setText("THERAPY ACT");
		cbTherapyAct.setBounds(126, 47, 105, 18);
		panel_25.add(cbTherapyAct);

		cbOrthotics = new JCheckBox();
		cbOrthotics.setOpaque(false);
		cbOrthotics.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbOrthotics.setText("ORTHOTICS");
		cbOrthotics.setBounds(190, 71, 94, 18);
		panel_25.add(cbOrthotics);

		cbProsthetics = new JCheckBox();
		cbProsthetics.setOpaque(false);
		cbProsthetics.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbProsthetics.setText("PROSTHETICS");
		cbProsthetics.setBounds(303, 71, 116, 18);
		panel_25.add(cbProsthetics);

		cbMessage = new JCheckBox();
		cbMessage.setOpaque(false);
		cbMessage.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbMessage.setText("MESSAGE");
		cbMessage.setBounds(237, 95, 94, 18);
		panel_25.add(cbMessage);

		cbPainMod = new JCheckBox();
		cbPainMod.setOpaque(false);
		cbPainMod.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbPainMod.setText("PAIN MOD");
		cbPainMod.setBounds(126, 119, 94, 18);
		panel_25.add(cbPainMod);

		cbUsHeatStim = new JCheckBox();
		cbUsHeatStim.setOpaque(false);
		cbUsHeatStim.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbUsHeatStim.setText("US/HEAT/E-STIM");
		cbUsHeatStim.setBounds(237, 119, 142, 18);
		panel_25.add(cbUsHeatStim);

		cbNeumerousc = new JCheckBox();
		cbNeumerousc.setOpaque(false);
		cbNeumerousc.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbNeumerousc.setText("NEUMEROUSC");
		cbNeumerousc.setBounds(204, 23, 94, 18);
		panel_25.add(cbNeumerousc);

		cbReed = new JCheckBox();
		cbReed.setOpaque(false);
		cbReed.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbReed.setText("RE-ED");
		cbReed.setBounds(303, 23, 94, 18);
		panel_25.add(cbReed);

		cbCogSkills = new JCheckBox();
		cbCogSkills.setOpaque(false);
		cbCogSkills.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbCogSkills.setText("COG Skills");
		cbCogSkills.setBounds(237, 47, 94, 18);
		panel_25.add(cbCogSkills);

		cbAdl = new JCheckBox();
		cbAdl.setOpaque(false);
		cbAdl.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbAdl.setText("ADL");
		cbAdl.setBounds(348, 47, 71, 18);
		panel_25.add(cbAdl);

		panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		panel_20.setLayout(null);
		panel_20.setBounds(2, 443, 847, 231);
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

		Notes defaultReferral = new Notes();
		defaultReferral.setFormName("Physical Therapy");
		defaultReferral.setUserId(Global.currentLoggedInUserKey);
		defaultReferral.setNoteText("");

		txtReasonForReferral = new JxNotes(isCategories);
		txtReasonForReferral.setNotes(defaultReferral);
		txtReasonForReferral.setBounds(3, 69, 834, 65);
		panel_20.add(txtReasonForReferral);

		ageLabel_3 = new JLabel();
		ageLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_3.setText("PLOF:");
		ageLabel_3.setBounds(3, 140, 35, 14);
		panel_20.add(ageLabel_3);

		Notes defaultPlof = new Notes();
		defaultPlof.setFormName("Physical Therapy");
		defaultPlof.setUserId(Global.currentLoggedInUserKey);
		defaultPlof.setNoteText("");

		txtInitialAssessmentPlof = new JxNotes(isCategories);
		txtInitialAssessmentPlof.setNotes(defaultPlof);
		txtInitialAssessmentPlof.setBounds(44, 140, 382, 20);
		panel_20.add(txtInitialAssessmentPlof);

		ageLabel_4 = new JLabel();
		ageLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_4.setText("PMH:");
		ageLabel_4.setBounds(444, 140, 35, 14);
		panel_20.add(ageLabel_4);

		txtInitialAssessmentPmh = new JTextField();
		txtInitialAssessmentPmh.setBounds(477, 140, 355, 20);
		panel_20.add(txtInitialAssessmentPmh);

		ageLabel_5 = new JLabel();
		ageLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_5.setText("D/C PLAN/ Pt GOAL:");
		ageLabel_5.setBounds(3, 186, 109, 14);
		panel_20.add(ageLabel_5);

		txtInitialAssessmentDcPlan = new JxRichTextField();
		txtInitialAssessmentDcPlan.setBounds(118, 186, 199, 20);
		txtInitialAssessmentDcPlan.setArc(0.1f);
		txtInitialAssessmentDcPlan.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentDcPlan.setRichTextFieldModel(
				txtInitialAssessmentDcPlan,
				"PtOtStPhysicalTherapy:InitialAssessmentDcPlan");

		panel_20.add(txtInitialAssessmentDcPlan);

		ageLabel_6 = new JLabel();
		ageLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_6.setText("PRECAUSIONS:");
		ageLabel_6.setBounds(323, 186, 88, 14);
		panel_20.add(ageLabel_6);

		txtInitialAssessmentPrecausions = new JxRichTextField();
		txtInitialAssessmentPrecausions.setBounds(417, 186, 170, 20);
		txtInitialAssessmentPrecausions.setArc(0.1f);
		txtInitialAssessmentPrecausions.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentPrecausions.setRichTextFieldModel(
				txtInitialAssessmentPrecausions,
				"PtOtStPhysicalTherapy:InitialAssessmentPrecautions");

		panel_20.add(txtInitialAssessmentPrecausions);

		ageLabel_7 = new JLabel();
		ageLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_7.setText("RECENT THERAPY SERVICES: D/C Dates/Status");
		ageLabel_7.setBounds(3, 209, 266, 14);
		panel_20.add(ageLabel_7);

		cbInitialAssessmentRecTherapyNa = new JCheckBox();
		cbInitialAssessmentRecTherapyNa.setFont(new Font("", Font.BOLD, 12));
		cbInitialAssessmentRecTherapyNa.setBackground(Color.WHITE);
		cbInitialAssessmentRecTherapyNa.setText("N/A");
		cbInitialAssessmentRecTherapyNa.setBounds(296, 209, 48, 18);
		panel_20.add(cbInitialAssessmentRecTherapyNa);

		txtInitialAssessmentRecTherapy = new JxRichTextField();
		txtInitialAssessmentRecTherapy.setBounds(345, 209, 487, 20);
		txtInitialAssessmentRecTherapy.setArc(0.1f);
		txtInitialAssessmentRecTherapy.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentRecTherapy.setRichTextFieldModel(
				txtInitialAssessmentRecTherapy,
				"PtOtStPhysicalTherapy:InitialAssessmentRecTherapy");
		panel_20.add(txtInitialAssessmentRecTherapy);

		ageLabel_24 = new JLabel();
		ageLabel_24.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_24.setText("WBS:");
		ageLabel_24.setBounds(593, 186, 35, 14);
		panel_20.add(ageLabel_24);

		txtInitialAssessmentWbs = new JxRichTextField();
		txtInitialAssessmentWbs.setBounds(630, 186, 203, 20);
		txtInitialAssessmentWbs.setArc(0.1f);
		txtInitialAssessmentWbs.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentWbs.setRichTextFieldModel(txtInitialAssessmentWbs,
				"PtOtStPhysicalTherapy:InitialAssessmentWbs");
		panel_20.add(txtInitialAssessmentWbs);

		ageLabel_8 = new JLabel();
		ageLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_8.setText("HOME SITUATION: TYPE");
		ageLabel_8.setBounds(3, 163, 133, 14);
		panel_20.add(ageLabel_8);

		txtInitialAssessmentSituationType = new JxRichTextField();
		txtInitialAssessmentSituationType.setBounds(142, 163, 148, 20);
		txtInitialAssessmentSituationType.setArc(0.1f);
		txtInitialAssessmentSituationType.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentSituationType.setRichTextFieldModel(
				txtInitialAssessmentSituationType,
				"PtOtStPhysicalTherapy:InitialAssessmentWbs");
		panel_20.add(txtInitialAssessmentSituationType);

		ageLabel_25 = new JLabel();
		ageLabel_25.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_25.setText("STAIRS");
		ageLabel_25.setBounds(296, 163, 55, 14);
		panel_20.add(ageLabel_25);

		txtInitialAssessmentStairs = new JxRichTextField();
		txtInitialAssessmentStairs.setBounds(350, 163, 102, 20);
		txtInitialAssessmentStairs.setArc(0.1f);
		txtInitialAssessmentStairs.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentStairs.setRichTextFieldModel(
				txtInitialAssessmentStairs,
				"PtOtStPhysicalTherapy:InitialAssessmentStairs");

		panel_20.add(txtInitialAssessmentStairs);

		ageLabel_26 = new JLabel();
		ageLabel_26.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_26.setText("LIVES WITH");
		ageLabel_26.setBounds(456, 163, 67, 14);
		panel_20.add(ageLabel_26);

		txtInitialAssessmentLiveWith = new JxRichTextField();
		txtInitialAssessmentLiveWith.setBounds(527, 163, 101, 20);
		txtInitialAssessmentLiveWith.setArc(0.1f);
		txtInitialAssessmentLiveWith.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentLiveWith.setRichTextFieldModel(
				txtInitialAssessmentLiveWith,
				"PtOtStPhysicalTherapy:InitialAssessmentLiveWith");

		panel_20.add(txtInitialAssessmentLiveWith);

		ageLabel_27 = new JLabel();
		ageLabel_27.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_27.setText("ASSISTANCE");
		ageLabel_27.setBounds(632, 163, 75, 14);
		panel_20.add(ageLabel_27);

		txtInitialAssessmentAssistance = new JxRichTextField();
		txtInitialAssessmentAssistance.setBounds(709, 163, 124, 20);
		txtInitialAssessmentAssistance.setArc(0.1f);
		txtInitialAssessmentAssistance.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtInitialAssessmentAssistance.setRichTextFieldModel(
				txtInitialAssessmentAssistance,
				"PtOtStPhysicalTherapy:InitialAssessmentAssistance");

		panel_20.add(txtInitialAssessmentAssistance);

		evaluationLabel = new JLabel();
		evaluationLabel.setBorder(new LineBorder(Color.black, 1, false));
		evaluationLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		evaluationLabel.setText("  EVALUATION:");
		evaluationLabel.setBounds(3, 680, 87, 20);
		panel.add(evaluationLabel);

		ageLabel_9 = new JLabel();
		ageLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_9.setText("ROM: UE: ");
		ageLabel_9.setBounds(3, 713, 55, 14);
		panel.add(ageLabel_9);

		circleOneLabel_5 = new JLabel();
		circleOneLabel_5.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_5.setText("(circle)");
		circleOneLabel_5.setBounds(58, 713, 38, 14);
		panel.add(circleOneLabel_5);

		txtEvalRomLe = new JxRichTextField();
		txtEvalRomLe.setBounds(562, 713, 278, 20);
		txtEvalRomLe.setArc(0.1f);
		txtEvalRomLe.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalRomLe.setRichTextFieldModel(txtEvalRomLe,
				"PtOtStPhysicalTherapy:EvalRomLe");

		panel.add(txtEvalRomLe);

		ageLabel_10 = new JLabel();
		ageLabel_10.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_10.setText("STRENGTH: UE:   R");
		ageLabel_10.setBounds(3, 736, 107, 14);
		panel.add(ageLabel_10);

		txtEvalStrengthLeL = new JxRichTextField();
		txtEvalStrengthLeL.setBounds(664, 737, 176, 20);
		txtEvalStrengthLeL.setArc(0.1f);
		txtEvalStrengthLeL.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalStrengthLeL.setRichTextFieldModel(txtEvalStrengthLeL,
				"PtOtStPhysicalTherapy:EvalStrengthLel");

		panel.add(txtEvalStrengthLeL);

		ageLabel_12 = new JLabel();
		ageLabel_12.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_12.setText("BED MOB: Rolling:");
		ageLabel_12.setBounds(3, 759, 101, 14);
		panel.add(ageLabel_12);

		ageLabel_14 = new JLabel();
		ageLabel_14.setFont(new Font("", Font.BOLD, 12));
		ageLabel_14.setText("sup <-> sit:");
		ageLabel_14.setBounds(217, 759, 62, 14);
		panel.add(ageLabel_14);

		txtEvalBedMobSupSit = new JxRichTextField();
		txtEvalBedMobSupSit.setBounds(285, 759, 107, 20);
		txtEvalBedMobSupSit.setArc(0.1f);
		txtEvalBedMobSupSit
				.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalBedMobSupSit.setRichTextFieldModel(txtEvalBedMobSupSit,
				"PtOtStPhysicalTherapy:EvalBedMobSupSit");

		panel.add(txtEvalBedMobSupSit);

		ageLabel_16 = new JLabel();
		ageLabel_16.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_16.setText("stand pivot:");
		ageLabel_16.setBounds(660, 759, 68, 14);
		panel.add(ageLabel_16);

		txtEvalTransferStandPivot = new JxRichTextField();
		txtEvalTransferStandPivot.setBounds(727, 759, 113, 20);
		txtEvalTransferStandPivot.setArc(0.1f);
		txtEvalTransferStandPivot.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtEvalTransferStandPivot.setRichTextFieldModel(
				txtEvalTransferStandPivot,
				"PtOtStPhysicalTherapy:EvalTransferStandPivot");

		panel.add(txtEvalTransferStandPivot);

		howIsPositioningLabel = new JLabel();
		howIsPositioningLabel.setFont(new Font("", Font.BOLD, 12));
		howIsPositioningLabel.setText("SAFETY AWARENESS:");
		howIsPositioningLabel.setBounds(3, 927, 124, 18);
		panel.add(howIsPositioningLabel);

		txtEvalOther = new JTextField();
		txtEvalOther.setBounds(58, 951, 782, 20);
		panel.add(txtEvalOther);

		ageLabel_21 = new JLabel();
		ageLabel_21.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_21.setText("COGNITION:");
		ageLabel_21.setBounds(3, 975, 76, 14);
		panel.add(ageLabel_21);

		circleOneLabel_11 = new JLabel();
		circleOneLabel_11.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_11.setText("(circle one)");
		circleOneLabel_11.setBounds(72, 975, 62, 14);
		panel.add(circleOneLabel_11);

		ageLabel_23 = new JLabel();
		ageLabel_23.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_23.setText("RECOMMENDATION / IMPRESSION:");
		ageLabel_23.setBounds(3, 999, 203, 14);
		panel.add(ageLabel_23);

		Notes defaultRec = new Notes();
		defaultRec.setFormName("Physical Therapy");
		defaultRec.setUserId(Global.currentLoggedInUserKey);
		defaultRec.setNoteText("");

		txtRecommendationImp = new JxNotes(isCategories);
		txtRecommendationImp.setNotes(defaultRec);
		// txtRecommendationImp.setWrapStyleWord(true);
		// txtRecommendationImp.setLineWrap(true);
		txtRecommendationImp.setBounds(5, 1019, 822, 58);
		panel.add(txtRecommendationImp);

		ageLabel_28 = new JLabel();
		ageLabel_28.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_28.setText("WFL / LIMITED");
		ageLabel_28.setBounds(102, 713, 84, 14);
		panel.add(ageLabel_28);

		txtEvalRomUe = new JxRichTextField();
		txtEvalRomUe.setBounds(187, 713, 263, 20);
		txtEvalRomUe.setArc(0.1f);
		txtEvalRomUe.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalRomUe.setRichTextFieldModel(txtEvalRomUe,
				"PtOtStPhysicalTherapy:EvalRomUe");
		panel.add(txtEvalRomUe);

		ageLabel_29 = new JLabel();
		ageLabel_29.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_29.setText("LE: WFL/LIMITED");
		ageLabel_29.setBounds(455, 713, 101, 14);
		panel.add(ageLabel_29);

		txtEvalStrengthUeR = new JxRichTextField();
		txtEvalStrengthUeR.setBounds(112, 736, 140, 21);
		txtEvalStrengthUeR.setArc(0.1f);
		txtEvalStrengthUeR.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalStrengthUeR.setRichTextFieldModel(txtEvalStrengthUeR,
				"PtOtStPhysicalTherapy:EvalStrengthUeR");
		panel.add(txtEvalStrengthUeR);

		ageLabel_11 = new JLabel();
		ageLabel_11.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_11.setText("L");
		ageLabel_11.setBounds(261, 738, 21, 14);
		panel.add(ageLabel_11);

		txtEvalStrengthUeL = new JxRichTextField();
		txtEvalStrengthUeL.setBounds(288, 736, 118, 20);
		txtEvalStrengthUeL.setArc(0.1f);
		txtEvalStrengthUeL.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalStrengthUeL.setRichTextFieldModel(txtEvalStrengthUeL,
				"PtOtStPhysicalTherapy:EvalStrengthUeL");

		panel.add(txtEvalStrengthUeL);

		ageLabel_30 = new JLabel();
		ageLabel_30.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_30.setText("LE: R:");
		ageLabel_30.setBounds(412, 738, 38, 14);
		panel.add(ageLabel_30);

		txtEvalStrengthLeR = new JxRichTextField();
		txtEvalStrengthLeR.setBounds(460, 736, 166, 21);
		txtEvalStrengthLeR.setArc(0.1f);
		txtEvalStrengthLeR.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalStrengthLeR.setRichTextFieldModel(txtEvalStrengthLeR,
				"PtOtStPhysicalTherapy:EvalStrengthLeR");

		panel.add(txtEvalStrengthLeR);

		ageLabel_31 = new JLabel();
		ageLabel_31.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_31.setText("L:");
		ageLabel_31.setBounds(643, 738, 15, 14);
		panel.add(ageLabel_31);

		txtEvalBedMobRoll = new JxRichTextField();
		txtEvalBedMobRoll.setBounds(107, 759, 107, 20);
		txtEvalBedMobRoll.setArc(0.1f);
		txtEvalBedMobRoll.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalBedMobRoll.setRichTextFieldModel(txtEvalBedMobRoll,
				"PtOtStPhysicalTherapy:EvalBedMobRoll");

		panel.add(txtEvalBedMobRoll);

		ageLabel_13 = new JLabel();
		ageLabel_13.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_13.setText("TRANSFER: sup <-> stand:");
		ageLabel_13.setBounds(396, 759, 147, 14);
		panel.add(ageLabel_13);

		txtEvalTransferSupStand = new JxRichTextField();
		txtEvalTransferSupStand.setBounds(546, 759, 107, 20);
		txtEvalTransferSupStand.setArc(0.1f);
		txtEvalTransferSupStand.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtEvalTransferSupStand.setRichTextFieldModel(txtEvalTransferSupStand,
				"PtOtStPhysicalTherapy:EvalTransferSupStand");

		panel.add(txtEvalTransferSupStand);

		ageLabel_15 = new JLabel();
		ageLabel_15.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_15.setText("BALANCE: SIT: static");
		ageLabel_15.setBounds(3, 782, 118, 14);
		panel.add(ageLabel_15);

		txtEvalBalanceSitStatic = new JxRichTextField();
		txtEvalBalanceSitStatic.setBounds(120, 782, 79, 20);
		txtEvalBalanceSitStatic.setArc(0.1f);
		txtEvalBalanceSitStatic.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtEvalBalanceSitStatic.setRichTextFieldModel(txtEvalBalanceSitStatic,
				"PtOtStPhysicalTherapy:EvalBalanceSitStatic");
		panel.add(txtEvalBalanceSitStatic);

		ageLabel_17 = new JLabel();
		ageLabel_17.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_17.setText("dyn");
		ageLabel_17.setBounds(205, 782, 29, 14);
		panel.add(ageLabel_17);

		txtEvalBalanceSitDyn = new JxRichTextField();
		txtEvalBalanceSitDyn.setBounds(230, 782, 79, 20);
		txtEvalBalanceSitDyn.setArc(0.1f);
		txtEvalBalanceSitDyn.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtEvalBalanceSitDyn.setRichTextFieldModel(txtEvalBalanceSitDyn,
				"PtOtStPhysicalTherapy:EvalBalanceSitDyn");
		panel.add(txtEvalBalanceSitDyn);

		ageLabel_18 = new JLabel();
		ageLabel_18.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_18.setText("STAND: static");
		ageLabel_18.setBounds(313, 785, 79, 14);
		panel.add(ageLabel_18);

		txtEvalBalanceStandStatic = new JxRichTextField();
		txtEvalBalanceStandStatic.setBounds(393, 782, 79, 20);
		txtEvalBalanceStandStatic.setArc(0.1f);
		txtEvalBalanceStandStatic.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtEvalBalanceStandStatic.setRichTextFieldModel(
				txtEvalBalanceStandStatic,
				"PtOtStPhysicalTherapy:EvalBalanceStandStatic");

		panel.add(txtEvalBalanceStandStatic);

		ageLabel_19 = new JLabel();
		ageLabel_19.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_19.setText("dyn");
		ageLabel_19.setBounds(478, 782, 29, 14);
		panel.add(ageLabel_19);

		txtEvalBalanceStandDyn = new JxRichTextField();
		txtEvalBalanceStandDyn.setBounds(503, 782, 76, 20);
		txtEvalBalanceStandDyn.setArc(0.1f);
		txtEvalBalanceStandDyn.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtEvalBalanceStandDyn.setRichTextFieldModel(txtEvalBalanceStandDyn,
				"PtOtStPhysicalTherapy:EvalBalanceStandDyn");

		panel.add(txtEvalBalanceStandDyn);

		ageLabel_20 = new JLabel();
		ageLabel_20.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_20.setText("Balance Test Scores:");
		ageLabel_20.setBounds(585, 782, 124, 14);
		panel.add(ageLabel_20);

		txtEvalBalanceTestScore = new JxRichTextField();
		txtEvalBalanceTestScore.setBounds(716, 782, 124, 20);
		txtEvalBalanceTestScore.setBounds(503, 782, 76, 20);
		txtEvalBalanceTestScore.setArc(0.1f);
		txtEvalBalanceTestScore.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtEvalBalanceTestScore.setRichTextFieldModel(txtEvalBalanceTestScore,
				"PtOtStPhysicalTherapy:EvalBalanceTestScore");
		panel.add(txtEvalBalanceTestScore);

		ageLabel_32 = new JLabel();
		ageLabel_32.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_32.setText("AMB: Distance:");
		ageLabel_32.setBounds(3, 805, 89, 14);
		panel.add(ageLabel_32);

		txtEvalAmbDistance = new JxRichTextField();
		txtEvalAmbDistance.setBounds(102, 805, 177, 20);
		txtEvalAmbDistance.setArc(0.1f);
		txtEvalAmbDistance.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalAmbDistance.setRichTextFieldModel(txtEvalAmbDistance,
				"PtOtStPhysicalTherapy:EvalAmbDistance");
		panel.add(txtEvalAmbDistance);

		ageLabel_33 = new JLabel();
		ageLabel_33.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_33.setText("Asst dev:");
		ageLabel_33.setBounds(288, 805, 55, 14);
		panel.add(ageLabel_33);

		txtEvalAmbAsstDev = new JxRichTextField();
		txtEvalAmbAsstDev.setBounds(349, 805, 177, 20);
		txtEvalAmbAsstDev.setArc(0.1f);
		txtEvalAmbAsstDev.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalAmbAsstDev.setRichTextFieldModel(txtEvalAmbAsstDev,
				"PtOtStPhysicalTherapy:EvalAmbAssDev");
		panel.add(txtEvalAmbAsstDev);

		ageLabel_34 = new JLabel();

		ageLabel_34.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_34.setText("Amt of Asst:");
		ageLabel_34.setBounds(537, 805, 76, 14);
		panel.add(ageLabel_34);

		txtEvalAmbAmtAsst = new JxRichTextField();
		txtEvalAmbAmtAsst.setBounds(619, 805, 221, 20);
		txtEvalAmbAmtAsst.setArc(0.1f);
		txtEvalAmbAmtAsst.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalAmbAmtAsst.setRichTextFieldModel(txtEvalAmbAmtAsst,
				"PtOtStPhysicalTherapy:EvalAmbAmtAss");
		panel.add(txtEvalAmbAmtAsst);

		ageLabel_35 = new JLabel();
		ageLabel_35.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_35.setText("GAINT PATTERN/POSTURE:");
		ageLabel_35.setBounds(3, 828, 159, 14);
		panel.add(ageLabel_35);

		Notes defaultPosture = new Notes();
		defaultPosture.setFormName("Physical Therapy");
		defaultPosture.setUserId(Global.currentLoggedInUserKey);
		defaultPosture.setNoteText("");

		txtEvalGaintPatternPosture = new JxNotes(isCategories);
		txtEvalGaintPatternPosture.setNotes(defaultPosture);
		txtEvalGaintPatternPosture.setAutoscrolls(false);
		// txtEvalGaintPatternPosture.setLineWrap(true);
		txtEvalGaintPatternPosture.setBounds(8, 845, 832, 50);
		panel.add(txtEvalGaintPatternPosture);

		ageLabel_36 = new JLabel();
		ageLabel_36.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_36.setText("PAIN/EDEMA:");
		ageLabel_36.setBounds(3, 904, 87, 14);
		panel.add(ageLabel_36);

		txtEvalPainEdema = new JTextField();
		txtEvalPainEdema.setBounds(95, 904, 745, 20);
		panel.add(txtEvalPainEdema);

		txtEvalSafetyAwareness = new JxRichTextField();
		txtEvalSafetyAwareness.setBounds(135, 927, 176, 20);
		txtEvalSafetyAwareness.setArc(0.1f);
		txtEvalSafetyAwareness.setBorder(GuiModes.CHANGE_SCREEN
				.getControlBorder());
		txtEvalSafetyAwareness.setRichTextFieldModel(txtEvalSafetyAwareness,
				"PtOtStPhysicalTherapy:EvalSafetyAwareness");
		panel.add(txtEvalSafetyAwareness);

		howIsPositioningLabel_1 = new JLabel();
		howIsPositioningLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		howIsPositioningLabel_1.setText("INTACT:");
		howIsPositioningLabel_1.setBounds(321, 927, 44, 18);
		panel.add(howIsPositioningLabel_1);

		txtEvalIntact = new JxRichTextField();
		txtEvalIntact.setBounds(368, 927, 166, 20);
		txtEvalIntact.setArc(0.1f);
		txtEvalIntact.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalIntact.setRichTextFieldModel(txtEvalIntact,
				"PtOtStPhysicalTherapy:EvalIntact");
		panel.add(txtEvalIntact);

		howIsPositioningLabel_2 = new JLabel();
		howIsPositioningLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		howIsPositioningLabel_2.setText("IMPAIRED:");
		howIsPositioningLabel_2.setBounds(546, 929, 62, 18);
		panel.add(howIsPositioningLabel_2);

		txtEvalImpaired = new JxRichTextField();
		txtEvalImpaired.setBounds(619, 927, 221, 20);
		txtEvalImpaired.setArc(0.1f);
		txtEvalImpaired.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtEvalImpaired.setRichTextFieldModel(txtEvalImpaired,
				"PtOtStPhysicalTherapy:EvalImpaired");
		panel.add(txtEvalImpaired);

		howIsPositioningLabel_3 = new JLabel();
		howIsPositioningLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		howIsPositioningLabel_3.setText("OTHER:");
		howIsPositioningLabel_3.setBounds(3, 951, 55, 18);
		panel.add(howIsPositioningLabel_3);

		cbCognitionAlert = new JCheckBox();
		// bgCognition.add(rbCognitionAlert);
		cbCognitionAlert.setActionCommand("1");
		cbCognitionAlert.setFont(new Font("", Font.BOLD, 12));
		cbCognitionAlert.setBackground(Color.WHITE);
		cbCognitionAlert.setText("ALERT");
		cbCognitionAlert.setBounds(135, 975, 55, 18);
		panel.add(cbCognitionAlert);

		cbCognitionOrientedX12 = new JCheckBox();
		// bgCognition.add(rbCognitionOrientedX12);
		cbCognitionOrientedX12.setActionCommand("2");
		cbCognitionOrientedX12.setFont(new Font("", Font.BOLD, 12));
		cbCognitionOrientedX12.setBackground(Color.WHITE);
		cbCognitionOrientedX12.setText("ORIENTED x");
		cbCognitionOrientedX12.setBounds(190, 975, 87, 18);
		panel.add(cbCognitionOrientedX12);

		ageLabel_37 = new JLabel();
		ageLabel_37.setFont(new Font("Dialog", Font.BOLD, 12));
		ageLabel_37.setText("FOLLOWS COMMANDS:");
		ageLabel_37.setBounds(315, 977, 134, 14);
		panel.add(ageLabel_37);

		circleOneLabel_2 = new JLabel();
		circleOneLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		circleOneLabel_2.setText("(circle)");
		circleOneLabel_2.setBounds(448, 975, 38, 14);
		panel.add(circleOneLabel_2);

		rbFollowsComTactileCuesNeeded = new JRadioButton();
		bgFollowCommands.add(rbFollowsComTactileCuesNeeded);
		rbFollowsComTactileCuesNeeded.setActionCommand("0");
		rbFollowsComTactileCuesNeeded.setFont(new Font("", Font.BOLD, 12));
		rbFollowsComTactileCuesNeeded.setBackground(Color.WHITE);
		rbFollowsComTactileCuesNeeded.setText("TACTILE CUES NEEDED");
		rbFollowsComTactileCuesNeeded.setBounds(487, 975, 147, 14);
		panel.add(rbFollowsComTactileCuesNeeded);

		rbFollowsCom1Step = new JRadioButton();
		bgFollowCommands.add(rbFollowsCom1Step);
		rbFollowsCom1Step.setActionCommand("1");
		rbFollowsCom1Step.setFont(new Font("", Font.BOLD, 12));
		rbFollowsCom1Step.setBackground(Color.WHITE);
		rbFollowsCom1Step.setText("1 STEP");
		rbFollowsCom1Step.setBounds(635, 975, 62, 14);
		panel.add(rbFollowsCom1Step);

		rbFollowsCom2Step = new JRadioButton();
		bgFollowCommands.add(rbFollowsCom2Step);
		rbFollowsCom2Step.setActionCommand("2");
		rbFollowsCom2Step.setFont(new Font("", Font.BOLD, 12));
		rbFollowsCom2Step.setBackground(Color.WHITE);
		rbFollowsCom2Step.setText("2 STEP");
		rbFollowsCom2Step.setBounds(697, 975, 62, 14);
		panel.add(rbFollowsCom2Step);

		rbFollowsComMultiStep = new JRadioButton();
		bgFollowCommands.add(rbFollowsComMultiStep);
		rbFollowsComMultiStep.setActionCommand("3");
		rbFollowsComMultiStep.setFont(new Font("", Font.BOLD, 12));
		rbFollowsComMultiStep.setBackground(Color.WHITE);
		rbFollowsComMultiStep.setText("MULTI-STEP");
		rbFollowsComMultiStep.setBounds(759, 975, 87, 14);
		panel.add(rbFollowsComMultiStep);

		cmbOriented = new JComboBox();
		cmbOriented.setBackground(Color.WHITE);
		cmbOriented.setModel(new DefaultComboBoxModel(new String[] { "1", "2",
				"3" }));
		cmbOriented.setBounds(280, 977, 29, 15);
		panel.add(cmbOriented);

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
		hcfa700FormLabel_1.setText("PHYSICAL THERAPY EVALUATION");
		hcfa700FormLabel_1.setBounds(181, 3, 229, 14);
		panel_2.add(hcfa700FormLabel_1);

		cbPhysicalPartB = new JCheckBox();
		cbPhysicalPartB.setFont(new Font("", Font.BOLD, 14));
		cbPhysicalPartB.setBackground(Color.WHITE);
		cbPhysicalPartB.setText("PART B");
		cbPhysicalPartB.setBounds(508, 3, 74, 18);
		panel_2.add(cbPhysicalPartB);

		cbPhysicalPartA = new JCheckBox();
		cbPhysicalPartA.setFont(new Font("", Font.BOLD, 14));
		cbPhysicalPartA.setBackground(Color.WHITE);
		cbPhysicalPartA.setText("PART A");
		cbPhysicalPartA.setBounds(427, 3, 67, 18);
		panel_2.add(cbPhysicalPartA);

		cbPhysicalOther = new JCheckBox();
		cbPhysicalOther.setFont(new Font("", Font.BOLD, 14));
		cbPhysicalOther.setBackground(Color.WHITE);
		cbPhysicalOther.setText("OTHER");
		cbPhysicalOther.setBounds(591, 3, 67, 18);
		panel_2.add(cbPhysicalOther);

		txtPhysicalOtherField = new JTextField();
		txtPhysicalOtherField.setBounds(664, 2, 183, 20);
		panel_2.add(txtPhysicalOtherField);
		if (!isEval()) {
			cbTherapyEx.setSelected(true);
		}
		fillcombo();
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

			e.printStackTrace();
		} catch (MedrexException e) {

			e.printStackTrace();
		}
		Users user = new Users();
		try {
			user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		} catch (RemoteException e) {

			e.printStackTrace();
		} catch (MedrexException e) {

			e.printStackTrace();
		}
		cmbSignatureTherapy.addItem(user.getUserName());
		cmbPhysicianCertifySign.addItem(user.getUserName());
		updateDiagnosis();
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
		if (dcCertificationToDate != null) {
			return dcCertificationToDate.getDate();
		}
		return null;
	}

	public void doSave() {

		PtOtStPhysicalTheray refPtOtStPhysicalTheray = new PtOtStPhysicalTheray();
		if (!(txtInitialAssessmentSituationType.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentSituationType
					.setRichTextFieldData("PtOtStPhysicalTherapy:InitialAssessmentSituationType");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtInitialAssessmentSituationType
							.getField());
		}
		if (!(txtInitialAssessmentStairs.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentStairs
					.setRichTextFieldData("PtOtStPhysicalTherapy:InitialAssessmentStairs");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtInitialAssessmentStairs
							.getField());
		}
		if (!(txtInitialAssessmentLiveWith.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentLiveWith
					.setRichTextFieldData("PtOtStPhysicalTherapy:InitialAssessmentLiveWith");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtInitialAssessmentLiveWith
							.getField());
		}
		if (!(txtInitialAssessmentAssistance.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentAssistance
					.setRichTextFieldData("PtOtStPhysicalTherapy:InitialAssessmentAssistance");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtInitialAssessmentAssistance
							.getField());
		}
		if (!(txtInitialAssessmentDcPlan.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentDcPlan
					.setRichTextFieldData("PtOtStPhysicalTherapy:InitialAssessmentDcPlan");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtInitialAssessmentDcPlan
							.getField());
		}
		if (!(txtInitialAssessmentPrecausions.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentPrecausions
					.setRichTextFieldData("PtOtStPhysicalTherapy:InitialAssessmentPrecautions");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtInitialAssessmentPrecausions
							.getField());
		}
		if (!(txtInitialAssessmentWbs.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentWbs
					.setRichTextFieldData("PtOtStPhysicalTherapy:InitialAssessmentWbs");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtInitialAssessmentWbs
							.getField());
		}
		if (!(txtInitialAssessmentRecTherapy.getText().equalsIgnoreCase(""))) {
			txtInitialAssessmentRecTherapy
					.setRichTextFieldData("PtOtStPhysicalTherapy:InitialAssessmentRecTherapy");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtInitialAssessmentRecTherapy
							.getField());
		}
		if (!(txtEvalRomUe.getText().equalsIgnoreCase(""))) {
			txtEvalRomUe
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalRomUe");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalRomUe.getField());
		}
		if (!(txtEvalRomLe.getText().equalsIgnoreCase(""))) {
			txtEvalRomLe
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalRomLe");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalRomLe.getField());
		}
		if (!(txtEvalStrengthUeR.getText().equalsIgnoreCase(""))) {
			txtEvalStrengthUeR
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalStrengthUeR");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalStrengthUeR
							.getField());
		}
		if (!(txtEvalStrengthUeL.getText().equalsIgnoreCase(""))) {
			txtEvalStrengthUeL
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalStrengthUeL");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalStrengthUeL
							.getField());
		}
		if (!(txtEvalStrengthLeR.getText().equalsIgnoreCase(""))) {
			txtEvalStrengthLeR
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalStrengthLeR");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalStrengthLeR
							.getField());
		}
		if (!(txtEvalStrengthLeL.getText().equalsIgnoreCase(""))) {
			txtEvalStrengthLeL
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalStrengthLeL");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalStrengthLeL
							.getField());
		}
		if (!(txtEvalStrengthLeL.getText().equalsIgnoreCase(""))) {
			txtEvalStrengthLeL
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalStrengthLeL");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalStrengthLeL
							.getField());
		}
		if (!(txtEvalBedMobRoll.getText().equalsIgnoreCase(""))) {
			txtEvalBedMobRoll
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalBedMobRoll");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalBedMobRoll
							.getField());
		}
		if (!(txtEvalBedMobSupSit.getText().equalsIgnoreCase(""))) {
			txtEvalBedMobSupSit
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalBedMobSupSit");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalBedMobSupSit
							.getField());
		}
		if (!(txtEvalTransferSupStand.getText().equalsIgnoreCase(""))) {
			txtEvalTransferSupStand
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalTransferSupStand");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalTransferSupStand
							.getField());
		}
		if (!(txtEvalTransferStandPivot.getText().equalsIgnoreCase(""))) {
			txtEvalTransferStandPivot
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalTransferStandPivot");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalTransferStandPivot
							.getField());
		}
		if (!(txtEvalBalanceSitStatic.getText().equalsIgnoreCase(""))) {
			txtEvalBalanceSitStatic
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalBalanceSitStatic");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalBalanceSitStatic
							.getField());
		}
		if (!(txtEvalBalanceSitDyn.getText().equalsIgnoreCase(""))) {
			txtEvalBalanceSitDyn
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalBalanceSitDyn");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalBalanceSitDyn
							.getField());
		}
		if (!(txtEvalBalanceStandStatic.getText().equalsIgnoreCase(""))) {
			txtEvalBalanceStandStatic
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalBalanceStandStatic");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalBalanceStandStatic
							.getField());
		}
		if (!(txtEvalBalanceStandDyn.getText().equalsIgnoreCase(""))) {
			txtEvalBalanceStandDyn
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalBalanceStandDyn");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalBalanceStandDyn
							.getField());
		}
		if (!(txtEvalBalanceTestScore.getText().equalsIgnoreCase(""))) {
			txtEvalBalanceTestScore
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalBalanceTestScore");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalBalanceTestScore
							.getField());
		}
		if (!(txtEvalAmbDistance.getText().equalsIgnoreCase(""))) {
			txtEvalAmbDistance
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalAmbDistance");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalAmbDistance
							.getField());
		}
		if (!(txtEvalAmbAsstDev.getText().equalsIgnoreCase(""))) {
			txtEvalAmbAsstDev
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalAmbAsstDev");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalAmbAsstDev
							.getField());
		}
		if (!(txtEvalAmbAmtAsst.getText().equalsIgnoreCase(""))) {
			txtEvalAmbAmtAsst
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalAmbAmtAsst");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalAmbAmtAsst
							.getField());
		}
		if (!(txtEvalSafetyAwareness.getText().equalsIgnoreCase(""))) {
			txtEvalSafetyAwareness
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalSafetyAwareness");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalSafetyAwareness
							.getField());
		}
		if (!(txtEvalIntact.getText().equalsIgnoreCase(""))) {
			txtEvalIntact
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalIntact");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalIntact.getField());
		}
		if (!(txtEvalImpaired.getText().equalsIgnoreCase(""))) {
			txtEvalImpaired
					.setRichTextFieldData("PtOtStPhysicalTherapy:EvalImpaired");
			refPtOtStPhysicalTheray
					.setInitialAssessmentSituationType(txtEvalImpaired
							.getField());
		}
		refPtOtStPhysicalTheray.setResidentId(Global.currentResidenceKey);
		refPtOtStPhysicalTheray.setFollowsCommands(SwingUtils
				.getSelectedButton(bgFollowCommands));
		refPtOtStPhysicalTheray.setEvalImpaired(txtEvalImpaired.getField());
		refPtOtStPhysicalTheray.setEvalIntact(txtEvalIntact.getField());
		refPtOtStPhysicalTheray.setEvalSafetyAwareness(txtEvalSafetyAwareness
				.getField());
		refPtOtStPhysicalTheray.setEvalPainEdema(txtEvalPainEdema.getText());
		refPtOtStPhysicalTheray
				.setEvalGaintPatternPosture(txtEvalGaintPatternPosture
						.getNotes());
		refPtOtStPhysicalTheray.setEvalAmbAmtAsst(txtEvalAmbAmtAsst.getField());
		refPtOtStPhysicalTheray.setEvalAmbAsstDev(txtEvalAmbAsstDev.getField());
		refPtOtStPhysicalTheray.setEvalAmbDistance(txtEvalAmbDistance
				.getField());
		refPtOtStPhysicalTheray.setEvalBalanceTestScore(txtEvalBalanceTestScore
				.getField());
		refPtOtStPhysicalTheray.setEvalBalanceStandDyn(txtEvalBalanceStandDyn
				.getField());
		refPtOtStPhysicalTheray
				.setEvalBalanceStandStatic(txtEvalBalanceStandStatic.getField());
		refPtOtStPhysicalTheray.setEvalBalanceSitDyn(txtEvalBalanceSitDyn
				.getField());
		refPtOtStPhysicalTheray.setEvalBalanceSitStatic(txtEvalBalanceSitStatic
				.getField());
		refPtOtStPhysicalTheray.setEvalTransferSupStand(txtEvalTransferSupStand
				.getField());
		refPtOtStPhysicalTheray.setEvalBedMobRoll(txtEvalBedMobRoll.getField());
		refPtOtStPhysicalTheray.setEvalStrengthLeR(txtEvalStrengthLeR
				.getField());
		refPtOtStPhysicalTheray.setEvalStrengthUeL(txtEvalStrengthUeL
				.getField());
		refPtOtStPhysicalTheray.setEvalStrengthUeR(txtEvalStrengthUeR
				.getField());
		refPtOtStPhysicalTheray.setEvalRomUe(txtEvalRomUe.getField());
		refPtOtStPhysicalTheray
				.setInitialAssessmentAssistance(txtInitialAssessmentAssistance
						.getField());
		refPtOtStPhysicalTheray
				.setInitialAssessmentLiveWith(txtInitialAssessmentLiveWith
						.getField());
		refPtOtStPhysicalTheray
				.setInitialAssessmentStairs(txtInitialAssessmentStairs
						.getField());
		refPtOtStPhysicalTheray
				.setInitialAssessmentSituationType(txtInitialAssessmentSituationType
						.getField());
		refPtOtStPhysicalTheray.setInitialAssessmentWbs(txtInitialAssessmentWbs
				.getField());
		refPtOtStPhysicalTheray
				.setPlanOfCareOther(txtPlanOfCareOther.getText());
		refPtOtStPhysicalTheray.setRecommendationImp(txtRecommendationImp
				.getNotes());
		refPtOtStPhysicalTheray.setEvalOther(txtEvalOther.getText());
		refPtOtStPhysicalTheray
				.setEvalTransferStandPivot(txtEvalTransferStandPivot.getField());
		refPtOtStPhysicalTheray.setEvalBedMobSupSit(txtEvalBedMobSupSit
				.getField());
		refPtOtStPhysicalTheray.setEvalStrengthLeL(txtEvalStrengthLeL
				.getField());
		refPtOtStPhysicalTheray
				.setSignatureTherapy((String) cmbSignatureTherapy
						.getSelectedItem());
		refPtOtStPhysicalTheray.setAlert(cbCognitionAlert.isSelected());
		refPtOtStPhysicalTheray
				.setOriented(cbCognitionOrientedX12.isSelected());
		refPtOtStPhysicalTheray.setEvalRomLe(txtEvalRomLe.getField());
		refPtOtStPhysicalTheray
				.setInitialAssessmentRecTherapy(txtInitialAssessmentRecTherapy
						.getField());
		refPtOtStPhysicalTheray
				.setInitialAssessmentRecTherapyNa(cbInitialAssessmentRecTherapyNa
						.isSelected());
		refPtOtStPhysicalTheray
				.setInitialAssessmentPrecausions(txtInitialAssessmentPrecausions
						.getField());
		refPtOtStPhysicalTheray
				.setInitialAssessmentDcPlan(txtInitialAssessmentDcPlan
						.getField());
		refPtOtStPhysicalTheray.setInitialAssessmentPmh(txtInitialAssessmentPmh
				.getText());
		refPtOtStPhysicalTheray
				.setInitialAssessmentPlof(txtInitialAssessmentPlof.getNotes());
		refPtOtStPhysicalTheray.setReasonForReferral(txtReasonForReferral
				.getNotes());
		refPtOtStPhysicalTheray.setRehabPot(SwingUtils
				.getSelectedButton(bgRehabPot));
		refPtOtStPhysicalTheray
				.setInitialAssessmentRefBy(txtInitialAssessmentRefBy.getText());
		refPtOtStPhysicalTheray.setInitialAssessmentAge(txtInitialAssessmentAge
				.getText());
		refPtOtStPhysicalTheray.setCertificationNa(cbCertificationNa
				.isSelected());
		refPtOtStPhysicalTheray.setCertificationToDate(dcCertificationToDate
				.getDate());
		refPtOtStPhysicalTheray
				.setCertificationFromDate(dcCertificationFromDate.getDate());
		refPtOtStPhysicalTheray
				.setPhysicianCertifyNaOnFileCheckBox(cbPhysicianCertifyNaOnFileCheckBox
						.isSelected());
		refPtOtStPhysicalTheray
				.setPhysicianCertifySign((String) cmbPhysicianCertifySign
						.getSelectedItem());
		refPtOtStPhysicalTheray.setPhysicianCertifyDate(dcPhysicianCertifyDate
				.getDate());
		refPtOtStPhysicalTheray.setPhysicianCertifyName(txtPhysicianCertifyName
				.getText());
		refPtOtStPhysicalTheray.setPlanOfTreatmentLong(txtPlanOfTreatmentLong
				.getNotes());
		refPtOtStPhysicalTheray
				.setPlanOfTreatmentLongWks(txtPlanOfTreatmentLongWks.getText());
		refPtOtStPhysicalTheray.setPlanOfTreatmentShort(txtPlanOfTreatmentShort
				.getNotes());
		refPtOtStPhysicalTheray
				.setPlanOfTreatmentShortWks(txtPlanOfTreatmentShortWks
						.getText());
		refPtOtStPhysicalTheray.setSocDate(dcSocDate.getDate());
		refPtOtStPhysicalTheray.setOnsetDate(dcOnsetDate.getDate());
		refPtOtStPhysicalTheray.setPrimaryDiagnosis(txtPrimaryDiagnosis
				.getText());
		refPtOtStPhysicalTheray.setTreatmentDiagnosis(txtTreatmentDiagnosis
				.getText());
		refPtOtStPhysicalTheray.setFrequencyDuration(cmbFrequencyDuration
				.getSelectedItem().toString());
		refPtOtStPhysicalTheray.setHospitalizationNa(cbHospitalizationNa
				.isSelected());
		refPtOtStPhysicalTheray
				.setHospitalizationToDate(dcHospitalizationToDate.getDate());
		refPtOtStPhysicalTheray
				.setHospitalizationFromDate(dcHospitalizationFromDate.getDate());
		refPtOtStPhysicalTheray.setProviderName(txtProviderName.getText());
		refPtOtStPhysicalTheray.setHicn(txtHicn.getText());
		refPtOtStPhysicalTheray.setProviderNo(txtNpiNo.getText());
		refPtOtStPhysicalTheray.setPhysicalOtherField(txtPhysicalOtherField
				.getText());
		refPtOtStPhysicalTheray.setPhysicalOther(cbPhysicalOther.isSelected());
		refPtOtStPhysicalTheray.setPhysicalPartA(cbPhysicalPartA.isSelected());
		refPtOtStPhysicalTheray.setPhysicalPartB(cbPhysicalPartB.isSelected());
		refPtOtStPhysicalTheray.setOrientedScale(cmbOriented.getSelectedItem()
				+ "");
		refPtOtStPhysicalTheray.setEvalTx(cbEvalTx.isSelected());
		refPtOtStPhysicalTheray.setTherapyEx(cbTherapyEx.isSelected());
		refPtOtStPhysicalTheray.setNeuromusc(cbNeumerousc.isSelected());
		refPtOtStPhysicalTheray.setReEd(cbReed.isSelected());
		refPtOtStPhysicalTheray.setGaintTrain(cbGaintTrain.isSelected());
		refPtOtStPhysicalTheray.setTherapyAct(cbTherapyAct.isSelected());
		refPtOtStPhysicalTheray.setCogSkills(cbCogSkills.isSelected());
		refPtOtStPhysicalTheray.setAdls(cbAdl.isSelected());
		refPtOtStPhysicalTheray.setWcManagePropulsion(cbWCManagePropulsion
				.isSelected());
		refPtOtStPhysicalTheray.setOrthotics(cbOrthotics.isSelected());
		refPtOtStPhysicalTheray.setProsthetics(cbProsthetics.isSelected());
		refPtOtStPhysicalTheray.setCheckoutArthoticProsthetic(cbCheckout
				.isSelected());
		refPtOtStPhysicalTheray.setMessage(cbMessage.isSelected());
		refPtOtStPhysicalTheray.setSensoryTech(cbSensoryTech.isSelected());
		refPtOtStPhysicalTheray.setPainMod(cbPainMod.isSelected());
		refPtOtStPhysicalTheray.setUsHeatStim(cbUsHeatStim.isSelected());

		try {
			Global.currentPtOtStPhysicalTherayKey = MedrexClientManager
					.getInstance().insertOrUpdatePtOtStPhysicalTheray(
							refPtOtStPhysicalTheray);
		} catch (Exception e) {
		}
	}

	public List<String> doValidate() {
		List<String> errorList = null;
		errorList = new ArrayList<String>();
		if (txtPlanOfTreatmentShort.getNotes().getNoteText().equalsIgnoreCase(
				"")) {
			errorList.add("Short Term Goals Field cannot be left Blank");
		}
		if (txtPlanOfTreatmentLong.getNotes().getNoteText()
				.equalsIgnoreCase("")) {
			errorList.add("Long Term Goals Field cannot be left Blank");
		}
		return errorList;
	}

	public void updateData() {
		ResidentMain rm = null;
		NursingHome nh = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			nh = MedrexClientManager.getInstance().getNursingHomeInfo(1);
			if (rm != null) {
				txt$PatientsFirstName.setText(rm.getUserName());
				txt$PatientsLastName.setText(rm.getUserPass());
				txtHicn.setText(rm.getMedicaidNum());
			}
			if (nh != null) {
				txtNpiNo.setText(nh.getNpi());
				txtProviderName.setText(nh.getName());
			}
			txtInitialAssessmentAge.setText(Utils.getResidentAgeYear() + "");

		} catch (Exception e) {
			e.printStackTrace();
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
		txtPhysicianCertifyName.setText(doctorName);

		PtOtStPhysicalTheray refPtOtStPhysicalTheray = null;

		if (Global.currentPtOtStPhysicalTherayKey != 0) {
			try {
				refPtOtStPhysicalTheray = MedrexClientManager.getInstance()
						.getPtOtStPhysicalTheray(
								Global.currentPtOtStPhysicalTherayKey);
			} catch (Exception e) {

			}
			SwingUtils.setSelectedButton(bgFollowCommands,
					refPtOtStPhysicalTheray.getFollowsCommands());
			txtEvalImpaired.setField(refPtOtStPhysicalTheray.getEvalImpaired());
			txtEvalIntact.setField(refPtOtStPhysicalTheray.getEvalIntact());
			txtEvalSafetyAwareness.setField(refPtOtStPhysicalTheray
					.getEvalSafetyAwareness());
			txtEvalPainEdema
					.setText(refPtOtStPhysicalTheray.getEvalPainEdema());
			txtEvalGaintPatternPosture.setNotes(refPtOtStPhysicalTheray
					.getEvalGaintPatternPosture());
			txtEvalAmbAmtAsst.setField(refPtOtStPhysicalTheray
					.getEvalAmbAmtAsst());
			txtEvalAmbAsstDev.setField(refPtOtStPhysicalTheray
					.getEvalAmbAsstDev());
			txtEvalAmbDistance.setField(refPtOtStPhysicalTheray
					.getEvalAmbDistance());
			txtEvalBalanceTestScore.setField(refPtOtStPhysicalTheray
					.getEvalBalanceTestScore());
			txtEvalBalanceStandDyn.setField(refPtOtStPhysicalTheray
					.getEvalBalanceStandDyn());
			txtEvalBalanceStandStatic.setField(refPtOtStPhysicalTheray
					.getEvalBalanceStandStatic());
			txtEvalBalanceSitDyn.setField(refPtOtStPhysicalTheray
					.getEvalBalanceSitDyn());
			txtEvalBalanceSitStatic.setField(refPtOtStPhysicalTheray
					.getEvalBalanceSitStatic());
			txtEvalTransferSupStand.setField(refPtOtStPhysicalTheray
					.getEvalTransferSupStand());
			txtEvalBedMobRoll.setField(refPtOtStPhysicalTheray
					.getEvalBedMobRoll());
			txtEvalStrengthLeR.setField(refPtOtStPhysicalTheray
					.getEvalStrengthLeR());
			txtEvalStrengthUeL.setField(refPtOtStPhysicalTheray
					.getEvalStrengthUeL());
			txtEvalStrengthUeR.setField(refPtOtStPhysicalTheray
					.getEvalStrengthUeR());
			txtEvalRomUe.setField(refPtOtStPhysicalTheray.getEvalRomUe());
			txtInitialAssessmentAssistance.setField(refPtOtStPhysicalTheray
					.getInitialAssessmentAssistance());
			txtInitialAssessmentLiveWith.setField(refPtOtStPhysicalTheray
					.getInitialAssessmentLiveWith());
			txtInitialAssessmentStairs.setField(refPtOtStPhysicalTheray
					.getInitialAssessmentStairs());
			txtInitialAssessmentSituationType.setField(refPtOtStPhysicalTheray
					.getInitialAssessmentSituationType());
			txtInitialAssessmentWbs.setField(refPtOtStPhysicalTheray
					.getInitialAssessmentWbs());
			txtPlanOfCareOther.setText(refPtOtStPhysicalTheray
					.getPlanOfCareOther());
			txtRecommendationImp.setNotes(refPtOtStPhysicalTheray
					.getRecommendationImp());
			txtEvalOther.setText(refPtOtStPhysicalTheray.getEvalOther());
			txtEvalTransferStandPivot.setField(refPtOtStPhysicalTheray
					.getEvalTransferStandPivot());
			txtEvalBedMobSupSit.setField(refPtOtStPhysicalTheray
					.getEvalBedMobSupSit());
			txtEvalStrengthLeL.setField(refPtOtStPhysicalTheray
					.getEvalStrengthLeL());
			cmbSignatureTherapy.setSelectedItem(refPtOtStPhysicalTheray
					.getSignatureTherapy());
			cbCognitionAlert.setSelected(refPtOtStPhysicalTheray.isAlert());
			cbCognitionOrientedX12.setSelected(refPtOtStPhysicalTheray
					.isOriented());
			txtEvalRomLe.setField(refPtOtStPhysicalTheray.getEvalRomLe());
			txtInitialAssessmentRecTherapy.setField(refPtOtStPhysicalTheray
					.getInitialAssessmentRecTherapy());
			cbInitialAssessmentRecTherapyNa.setSelected(refPtOtStPhysicalTheray
					.isInitialAssessmentRecTherapyNa());
			txtInitialAssessmentPrecausions.setField(refPtOtStPhysicalTheray
					.getInitialAssessmentPrecausions());
			txtInitialAssessmentDcPlan.setField(refPtOtStPhysicalTheray
					.getInitialAssessmentDcPlan());
			txtInitialAssessmentPmh.setText(refPtOtStPhysicalTheray
					.getInitialAssessmentPmh());
			txtInitialAssessmentPlof.setNotes(refPtOtStPhysicalTheray
					.getInitialAssessmentPlof());
			txtReasonForReferral.setNotes(refPtOtStPhysicalTheray
					.getReasonForReferral());
			SwingUtils.setSelectedButton(bgRehabPot, refPtOtStPhysicalTheray
					.getRehabPot());
			txtInitialAssessmentRefBy.setText(refPtOtStPhysicalTheray
					.getInitialAssessmentRefBy());
			txtInitialAssessmentAge.setText(refPtOtStPhysicalTheray
					.getInitialAssessmentAge());
			cbCertificationNa.setSelected(refPtOtStPhysicalTheray
					.isCertificationNa());
			dcCertificationToDate.setDate(refPtOtStPhysicalTheray
					.getCertificationToDate());
			dcCertificationFromDate.setDate(refPtOtStPhysicalTheray
					.getCertificationFromDate());
			cbPhysicianCertifyNaOnFileCheckBox
					.setSelected(refPtOtStPhysicalTheray
							.isPhysicianCertifyNaOnFileCheckBox());
			cmbPhysicianCertifySign.setSelectedItem(refPtOtStPhysicalTheray
					.getPhysicianCertifySign());
			dcPhysicianCertifyDate.setDate(refPtOtStPhysicalTheray
					.getPhysicianCertifyDate());
			txtPhysicianCertifyName.setText(refPtOtStPhysicalTheray
					.getPhysicianCertifyName());
			txtPlanOfTreatmentLong.setNotes(refPtOtStPhysicalTheray
					.getPlanOfTreatmentLong());
			txtPlanOfTreatmentLongWks.setText(refPtOtStPhysicalTheray
					.getPlanOfTreatmentLongWks());
			txtPlanOfTreatmentShort.setNotes(refPtOtStPhysicalTheray
					.getPlanOfTreatmentShort());
			txtPlanOfTreatmentShortWks.setText(refPtOtStPhysicalTheray
					.getPlanOfTreatmentShortWks());
			dcSocDate.setDate(refPtOtStPhysicalTheray.getSocDate());
			dcOnsetDate.setDate(refPtOtStPhysicalTheray.getOnsetDate());
			txtPrimaryDiagnosis.setText(refPtOtStPhysicalTheray
					.getPrimaryDiagnosis());
			txtTreatmentDiagnosis.setText(refPtOtStPhysicalTheray
					.getTreatmentDiagnosis());
			cmbFrequencyDuration.setSelectedItem(refPtOtStPhysicalTheray
					.getFrequencyDuration());
			cbHospitalizationNa.setSelected(refPtOtStPhysicalTheray
					.isHospitalizationNa());
			dcHospitalizationToDate.setDate(refPtOtStPhysicalTheray
					.getHospitalizationToDate());
			dcHospitalizationFromDate.setDate(refPtOtStPhysicalTheray
					.getHospitalizationFromDate());
			txtProviderName.setText(refPtOtStPhysicalTheray.getProviderName());
			// txtHicn.setText(refPtOtStPhysicalTheray.getHicn());
			// txtNpiNo.setText(refPtOtStPhysicalTheray.getProviderNo());
			txtPhysicalOtherField.setText(refPtOtStPhysicalTheray
					.getPhysicalOtherField());
			cbPhysicalOther.setSelected(refPtOtStPhysicalTheray
					.isPhysicalOther());
			cbPhysicalPartA.setSelected(refPtOtStPhysicalTheray
					.isPhysicalPartA());
			cbPhysicalPartB.setSelected(refPtOtStPhysicalTheray
					.isPhysicalPartB());
			cmbOriented.setSelectedItem(refPtOtStPhysicalTheray
					.getOrientedScale());
			cbEvalTx.setSelected(refPtOtStPhysicalTheray.isEvalTx());
			cbTherapyEx.setSelected(refPtOtStPhysicalTheray.isTherapyEx());
			cbNeumerousc.setSelected(refPtOtStPhysicalTheray.isNeuromusc());
			cbReed.setSelected(refPtOtStPhysicalTheray.isReEd());
			cbGaintTrain.setSelected(refPtOtStPhysicalTheray.isGaintTrain());
			cbTherapyAct.setSelected(refPtOtStPhysicalTheray.isTherapyAct());
			cbCogSkills.setSelected(refPtOtStPhysicalTheray.isCogSkills());
			cbAdl.setSelected(refPtOtStPhysicalTheray.isAdls());
			cbWCManagePropulsion.setSelected(refPtOtStPhysicalTheray
					.isWcManagePropulsion());
			cbOrthotics.setSelected(refPtOtStPhysicalTheray.isOrthotics());
			cbProsthetics.setSelected(refPtOtStPhysicalTheray.isProsthetics());
			cbCheckout.setSelected(refPtOtStPhysicalTheray
					.isCheckoutArthoticProsthetic());
			cbMessage.setSelected(refPtOtStPhysicalTheray.isMessage());
			cbSensoryTech.setSelected(refPtOtStPhysicalTheray.isSensoryTech());
			cbPainMod.setSelected(refPtOtStPhysicalTheray.isPainMod());
			cbUsHeatStim.setSelected(refPtOtStPhysicalTheray.isUsHeatStim());
		}
	}
}
