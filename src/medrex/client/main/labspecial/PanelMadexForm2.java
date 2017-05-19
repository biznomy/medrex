package medrex.client.main.labspecial;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.labSpecial.MadexForm2;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelMadexForm2 extends JPanel {

	// Color redcolor = new Color(255, 102, 102);

	private JCheckBox cbCardioUnspecifiedEssential;
	private JLabel chest1ViewLabel_63;
	private JPanel panel_114;
	private JCheckBox cbCardioBenign;
	private JLabel chest1ViewLabel_62;
	private JPanel panel_113;
	private JCheckBox cbCardioDiseasesAortic;
	private JLabel chest1ViewLabel_61;
	private JPanel panel_112;
	private JCheckBox cbCardioDiseasesMitral;
	private JLabel chest1ViewLabel_60;
	private JPanel panel_111;
	private JCheckBox cbCardioDizziness;
	private JLabel chest1ViewLabel_59;
	private JPanel panel_110;
	private JCheckBox cbCardioConvulsions;
	private JLabel chest1ViewLabel_58;
	private JPanel panel_109;
	private JCheckBox cbCardioCardiomyopathy;
	private JLabel chest1ViewLabel_57;
	private JPanel panel_108;
	private JCheckBox cbCardioCardiac;
	private JLabel chest1ViewLabel_56;
	private JPanel panel_107;
	private JCheckBox cbCardioChronic;
	private JLabel chest1ViewLabel_55;
	private JPanel panel_106;
	private JCheckBox cbCardioUndiagnosed;
	private JLabel chest1ViewLabel_54;
	private JPanel panel_105;
	private JCheckBox cbCardioChestPain;
	private JLabel chest1ViewLabel_53;
	private JPanel panel_104;
	private JCheckBox cbCardioAortic;
	private JLabel chest1ViewLabel_52;
	private JPanel panel_103;
	private JCheckBox cbCardioAngina;
	private JLabel chest1ViewLabel_33;
	private JPanel panel_102;
	private JCheckBox cbCardioAcutePulmonary;
	private JLabel chest1ViewLabel_29;
	private JPanel panel_86;
	private JCheckBox cbCardioAcuteParicarditis;
	private JLabel chest1ViewLabel_25;
	private JPanel panel_53;
	private JCheckBox cbCardioAcuteMyocarditis;
	private JLabel chest1ViewLabel_24;
	private JPanel panel_52;
	private JCheckBox cbCardioAcuteEdema;
	private JLabel chest1ViewLabel_23;
	private JPanel panel_51;
	private JTextArea abnormalLabsfluidselectrolyteAndTextArea;
	private JCheckBox cbCardioAbdominalLabs;
	private JPanel panel_50;
	private JCheckBox cbCardioAbdominalHeart;
	private JLabel chest1ViewLabel_22;
	private JPanel panel_38;
	private JCheckBox cbCardioAbdominalPain;
	private JLabel chest1ViewLabel_12;
	private JPanel panel_37;
	private JLabel chestAndThoraxdLabel_1;
	private JPanel panel_36;
	private JPanel panel_35;
	private JCheckBox cbUltrasoundsVenousRT;
	private JTextField txtPulseRate;
	private JTextField txtCardiologicalOxygen;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label_39;
	private JCheckBox cbUltraABDAbd;
	private JLabel chest1ViewLabel_78;
	private JPanel panel_115;
	private JTextArea malignantNeoplasmOfTextArea;
	private JLabel chest1ViewLabel_64;
	private JCheckBox cbUltraABDAcute;
	private JLabel chest1ViewLabel_41;
	private JLabel label_81;
	private JLabel label_80;
	private JLabel label_79;
	private JLabel label_78;
	private JLabel label_77;
	private JLabel label_76;
	private JLabel label_75;
	private JLabel label_74;
	private JLabel label_73;
	private JLabel label_72;
	private JTextArea abnormalLabsfluidselectrolyteAndTextArea_1;
	private JLabel chest1ViewLabel_94;
	private JCheckBox cbUltrasoundsMalignant;
	private JLabel label_70;
	private JLabel label_69;
	private JLabel label_68;
	private JLabel label_67;
	private JLabel label_66;
	private JLabel label_65;
	private JLabel label_64;
	private JLabel label_63;
	private JLabel label_62;
	private JLabel label_61;
	private JLabel label_60;
	private JLabel label_59;
	private JLabel label_29;
	private JLabel label_10;
	private JLabel chest1ViewLabel_93;
	private JCheckBox cbUltrasoundsArterialUpper2;
	private JLabel chest1ViewLabel_92;
	private JCheckBox cbUltrasoundsArterialBoth2;
	private JLabel chest1ViewLabel_91;
	private JCheckBox cbUltrasoundsArterialLT2;
	private JLabel chest1ViewLabel_89;
	private JCheckBox cbUltrasoundsArterialRT2;
	private JLabel chest1ViewLabel_32;
	private JPanel panel_49;
	private JLabel chest1ViewLabel_90;
	private JCheckBox cbUltrasoundsVenousBoth;
	private JLabel chest1ViewLabel_88;
	private JCheckBox cbUltrasoundsVenousLT;
	private JLabel chest1ViewLabel_87;
	private JCheckBox cbUltrasoundsRT;
	private JLabel chest1ViewLabel_67;
	private JPanel panel_46;
	private JLabel label_57;
	private JLabel label_55;
	private JLabel label_54;
	private JLabel label_53;
	private JLabel label_52;
	private JLabel label_51;
	private JLabel label_50;
	private JLabel label_49;
	private JLabel label_48;
	private JLabel label_47;
	private JLabel label_46;
	private JLabel label_45;
	private JLabel label_44;
	private JLabel label_43;
	private JLabel label_42;
	private JLabel label_41;
	private JLabel label_40;
	private JTextArea icdTextArea_5;
	private JPanel panel_140;
	private JPanel panel_118;
	private JCheckBox cbUltraABDMalIntestinal;
	private JPanel panel_136;
	private JCheckBox cbUltraABDMalPancreas;
	private JLabel chest1ViewLabel_82;
	private JPanel panel_135;
	private JCheckBox cbUltraABDLiverDisease;
	private JLabel chest1ViewLabel_81;
	private JPanel panel_134;
	private JCheckBox cbUltraABDKidneyInfac;
	private JLabel chest1ViewLabel_80;
	private JPanel panel_133;
	private JCheckBox cbUltraABDKidneyCal;
	private JLabel chest1ViewLabel_79;
	private JPanel panel_132;
	private JCheckBox cbUltraABDJaundice;
	private JLabel chest1ViewLabel_77;
	private JPanel panel_130;
	private JCheckBox cbUltraABDHydonephrosis;
	private JLabel chest1ViewLabel_76;
	private JPanel panel_129;
	private JCheckBox cbUltraABDCyst;
	private JLabel chest1ViewLabel_51;
	private JPanel panel_128;
	private JCheckBox cbUltraABDCholelith;
	private JLabel chest1ViewLabel_50;
	private JPanel panel_127;
	private JCheckBox cbUltraABDBenign;
	private JLabel chest1ViewLabel_49;
	private JPanel panel_101;
	private JCheckBox cbUltraABDLiver;
	private JLabel chest1ViewLabel_48;
	private JPanel panel_100;
	private JCheckBox cbUltraABDSwelling;
	private JLabel chest1ViewLabel_47;
	private JPanel panel_99;
	private JCheckBox cbUltraABDAscites;
	private JLabel chest1ViewLabel_46;
	private JPanel panel_98;
	private JCheckBox cbUltraABDRupture;
	private JLabel chest1ViewLabel_45;
	private JPanel panel_97;
	private JCheckBox cbUltraABDChronic;
	private JLabel chest1ViewLabel_44;
	private JPanel panel_96;
	private JCheckBox cbUltraABDAortic;
	private JLabel chest1ViewLabel_43;
	private JPanel panel_95;
	private JPanel panel_94;
	private JLabel chest1ViewLabel_42;
	private JPanel panel_93;
	private JLabel chestAndThoraxdLabel_5;
	private JPanel panel_91;
	private JPanel panel_90;
	private JCheckBox cbUltrasoundsThroat;
	private JLabel chest1ViewLabel_75;
	private JPanel panel_126;
	private JCheckBox cbUltrasoundsTechycardia;
	private JLabel chest1ViewLabel_74;
	private JPanel panel_125;
	private JCheckBox cbUltrasoundsSyncope;
	private JLabel chest1ViewLabel_73;
	private JPanel panel_124;
	private JCheckBox cbUltrasoundsResptryArrest;
	private JLabel chest1ViewLabel_72;
	private JPanel panel_123;
	private JCheckBox cbUltrasoundsResptryDistress;
	private JLabel chest1ViewLabel_71;
	private JPanel panel_122;
	private JCheckBox cbUltrasoundsRheumatic;
	private JLabel chest1ViewLabel_70;
	private JPanel panel_121;
	private JCheckBox cbUltrasoundsChronic;
	private JLabel chest1ViewLabel_69;
	private JPanel panel_120;
	private JCheckBox cbUltrasoundsResptryFail;
	private JLabel chest1ViewLabel_68;
	private JPanel panel_119;
	private JCheckBox cbUltrasoundsPain;
	private JLabel chest1ViewLabel_66;
	private JPanel panel_117;
	private JCheckBox cbUltrasoundsPalpitations;
	private JLabel chest1ViewLabel_65;
	private JPanel panel_116;
	private JLabel label_38;
	private JLabel label_37;
	private JLabel label_36;
	private JLabel label_35;
	private JLabel label_34;
	private JLabel label_26;
	private JLabel label_25;
	private JLabel label_24;
	private JLabel label_22;
	private JLabel label_13;
	private JTextArea icdTextArea_4;
	private JPanel panel_89;
	private JPanel panel_88;
	private JCheckBox cbUltrasoundsMalignantNeoplasm;
	private JPanel panel_87;
	private JCheckBox cbUltrasoundsMyalgia;
	private JLabel chest1ViewLabel_40;
	private JPanel panel_85;
	private JCheckBox cbUltrasoundsOld;
	private JLabel chest1ViewLabel_39;
	private JPanel panel_84;
	private JCheckBox cbUltrasoundsMyocardial;
	private JLabel chest1ViewLabel_38;
	private JPanel panel_83;
	private JCheckBox cbUltrasoundsHeartFailure;
	private JLabel chest1ViewLabel_37;
	private JPanel panel_82;
	private JCheckBox cbUltrasoundsHypertensionHrt;
	private JLabel chest1ViewLabel_36;
	private JPanel panel_69;
	private JCheckBox cbUltrasoundsHypertension;
	private JLabel chest1ViewLabel_35;
	private JPanel panel_68;
	private JCheckBox cbUltrasoundsHeartDisease;
	private JLabel chest1ViewLabel_34;
	private JPanel panel_66;
	private JPanel panel_65;
	private JCheckBox cbUltrasoundsHypertensiveHeart;
	private JLabel chest1ViewLabel_31;
	private JPanel panel_64;
	private JLabel chestAndThoraxdLabel_3;
	private JPanel panel_61;
	private JPanel panel_59;
	private JLabel label_12;
	private JLabel label_11;
	private JLabel label_9;
	private JLabel label_8;
	private JLabel label_7;
	private JTextArea icdTextArea_3;
	private JPanel panel_55;
	private JPanel panel_54;
	private JPanel panel_32;
	private JLabel yesLabel_3;
	private JCheckBox cbXrayYes;
	private JLabel yesLabel_2;
	private JCheckBox cbUltrasoundsRenal;
	private JLabel chest1ViewLabel_11;
	private JPanel panel_21;
	private JLabel chest1ViewLabel_10;
	private JCheckBox cbUltrasoundsArterialLower;
	private JLabel chest1ViewLabel_9;
	private JCheckBox cbUltrasoundsArterialBoth;
	private JLabel chest1ViewLabel_8;
	private JCheckBox cbUltrasoundsArterialLT;
	private JLabel chest1ViewLabel_7;
	private JCheckBox cbUltrasoundsArterialRT;
	private JLabel chest1ViewLabel_6;
	private JCheckBox cbCardioOxygenNo;
	private JPanel panel_20;
	private JPanel panel_19;
	private JPanel panel_18;
	private JLabel oxygenDuringExamLabel;
	private JLabel pulseRateLabel;
	private JLabel oxygenSaturationLabel;
	private JPanel panel_17;
	private JPanel panel_16;
	private JPanel panel_14;
	private JLabel previousXrayLabel;
	private ButtonGroup bgDescTpt = new ButtonGroup();
	private JTextField txtRadiologistCode;
	private JTextField txtNoOfViews;
	private JTextField txtNoPTSeen;
	private JTextField txtTech;
	private JDateChooser dcDateDone;
	private JTextField txtTime;
	private JTextArea txtTechnicalComments;
	private JTextArea txtCardiologicalOther;
	private JLabel label_103;
	private JLabel nursingOfficeLabel_3;
	private JLabel notePortableXrayLabel_4;
	private JLabel nursingOfficeLabel_2;
	private JLabel notePortableXrayLabel_3;
	private JLabel nursingOfficeLabel_1;
	private JLabel notePortableXrayLabel_2;
	private JLabel nursingOfficeLabel;
	private JLabel notePortableXrayLabel_1;
	private JLabel notePortableXrayLabel;
	private JPanel panel_166;
	private JDateChooser dcDateReportReceived;
	private JTextArea requestingPhysicianTextArea_2;
	private JPanel panel_169;
	private JDateChooser dcDateOrdered;
	private JTextArea requestingPhysicianTextArea_1;
	private JPanel panel_168;
	private JLabel nurseLabel;
	private JTextField txtNurse;
	private JPanel panel_167;
	private JTextField txtRequestPhysician;
	private JTextArea requestingPhysicianTextArea;
	private JPanel panel_165;
	private JTextField txtClinicalHistory;
	private JLabel alcoholismLabel_6;
	private JPanel panel_92;
	private JLabel reasonForStudyLabel;
	private JPanel panel_77;
	private JCheckBox cbChestPneumonia;
	private JTextField txtChargeNurse;
	private JLabel weightLabel_13;
	private JPanel panel_81;
	private JCheckBox cbSt;
	private JCheckBox cbOt;
	private JPanel panel_80;
	private JLabel weightLabel_12;
	private JPanel panel_79;
	private JTextField txtAuthorizedSign;
	private JLabel weightLabel_11;
	private JPanel panel_78;
	private JLabel weightLabel_10;
	private JPanel panel_76;
	private JCheckBox cbXrayNo;
	private JCheckBox cbCardioOxygenYes;
	private JLabel yesLabel_1;
	private JLabel yesLabel;
	private JPanel panel_75;
	private JLabel weightLabel_5;
	private JPanel panel_74;
	private JTextArea ofPtTextArea_1;
	private JPanel panel_73;
	private JTextArea ofPtTextArea;
	private JPanel panel_72;
	private JLabel weightLabel_4;
	private JPanel panel_71;
	private JLabel weightLabel_3;
	private JPanel panel_70;
	private JLabel weightLabel_2;
	private JPanel panel_67;
	private JPanel panel_63;
	private JLabel otherLabel_1;
	private JPanel panel_62;
	private JPanel panel_22;
	private JLabel otherLabel;
	private JLabel chestAndThoraxdLabel_6;
	private JPanel panel_56;
	private JPanel panel_60;
	private JCheckBox cbUltrasoundsProstate;
	private JLabel chest1ViewLabel_21;
	private JPanel panel_34;
	private JCheckBox cbUltrasoundsPelvis;
	private JLabel chest1ViewLabel_20;
	private JPanel panel_33;
	private JLabel label_33;
	private JLabel label_32;
	private JLabel label_31;
	private JLabel label_30;
	private JLabel v73970Label;
	private JLabel label_28;
	private JLabel label_27;
	private JTextArea icdTextArea_2;
	private JPanel panel_58;
	private JPanel panel_57;
	private JPanel panel_48;
	private JCheckBox cbUltrasoundsArterial;
	private JLabel chest1ViewLabel_30;
	private JPanel panel_47;
	private JCheckBox cbUltrasoundsVenous;
	private JLabel chest1ViewLabel_28;
	private JPanel panel_45;
	private JCheckBox cbUltrasoundsChest;
	private JLabel chest1ViewLabel_27;
	private JPanel panel_44;
	private JCheckBox cbUltrasoundsBreast;
	private JLabel chest1ViewLabel_26;
	private JPanel panel_43;
	private JLabel chestAndThoraxdLabel_4;
	private JPanel panel_42;
	private JPanel panel_41;
	private JLabel label_23;
	private JLabel label_21;
	private JLabel label_20;
	private JLabel label_19;
	private JLabel label_18;
	private JLabel label_17;
	private JLabel label_16;
	private JLabel label_15;
	private JLabel label_14;
	private JTextArea icdTextArea_1;
	private JPanel panel_40;
	private JPanel panel_39;
	private JCheckBox cbUltrasoundsAbdominalRetro;
	private JLabel chest1ViewLabel_19;
	private JPanel panel_31;
	private JCheckBox cbUltrasoundsAbdominalMulti;
	private JLabel chest1ViewLabel_18;
	private JPanel panel_30;
	private JCheckBox cbUltrasoundsCarotid;
	private JLabel chest1ViewLabel_17;
	private JPanel panel_29;
	private JCheckBox cbUltrasoundsTesticular;
	private JLabel chest1ViewLabel_16;
	private JPanel panel_28;
	private JCheckBox cbUltrasoundsThyroid;
	private JLabel chest1ViewLabel_15;
	private JPanel panel_27;
	private JLabel chest1ViewLabel_14;
	private JPanel panel_26;
	private JCheckBox cbUltrasoundsEcho;
	private JLabel chest1ViewLabel_13;
	private JPanel panel_25;
	private JLabel chestAndThoraxdLabel_2;
	private JPanel panel_24;
	private JPanel panel_23;
	private JLabel label_6;
	private JLabel label_5;
	private JLabel label_4;
	private JLabel label_3;
	private JLabel label_2;
	private JLabel label;
	private JTextArea icdTextArea;
	private JPanel panel_8;
	private JPanel panel_5;
	private JCheckBox cbCardiologicalPulse;
	private JLabel chest1ViewLabel_5;
	private JPanel panel_13;
	private JCheckBox cbCardiologicalHolter;
	private JLabel chest1ViewLabel_4;
	private JPanel panel_12;
	private JCheckBox cbCardiologicalDual;
	private JLabel chest1ViewLabel_3;
	private JPanel panel_11;
	private JCheckBox cbCardiologicalPacemaker;
	private JLabel chest1ViewLabel_2;
	private JPanel panel_10;
	private JCheckBox cbCardiologicalLong;
	private JLabel chest1ViewLabel_1;
	private JPanel panel_9;
	private JCheckBox cbCardiological12;
	private JLabel chest1ViewLabel;
	private JPanel panel_7;
	private JLabel chestAndThoraxdLabel;
	private JPanel panel_6;
	private JPanel panel_4;
	private JPanel panel_3;
	private JTextArea txtCaseField;
	private JLabel facilityLabel_8;
	private JTextArea txtPreApproval;
	private JLabel facilityLabel_7;
	private JTextArea txtInsurance;
	private JLabel facilityLabel_6;
	private JLabel suffixLabel;
	private JTextField txtMedicaidNo;
	private JLabel facilityLabel_5;
	private JTextField txtRmNo;
	private JLabel facilityLabel_4;
	private JDateChooser dcBirth;
	private JLabel facilityLabel_3;
	private JTextArea txtMedicareNo;
	private JCheckBox cbMedicareB;
	private JCheckBox cbMedicareA;
	private JLabel facilityLabel_2;
	private JCheckBox cbFemale;
	private JCheckBox cbMale;
	private JTextField txtPatient;
	private JLabel facilityLabel_1;
	private JTextArea txtFacility;
	private JLabel facilityLabel;
	private JPanel panel_2;
	private JLabel portableDiagnosticsLabel_3;
	private JLabel portableDiagnosticsLabel_2;
	private JLabel portableDiagnosticsLabel_1;
	private JLabel portableDiagnosticsLabel;
	private JLabel medfaxLabel;
	private JPanel panel_1;
	private JPanel panel;

	/**
	 * Create the panel
	 */
	public PanelMadexForm2() {
		super();
		Global.panelMadexForm2 = this;
		setPreferredSize(new Dimension(850, 1100));
		setBackground(Color.WHITE);
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(17, 10, 805, 1092);
		add(panel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(108, 0, 231, 126);
		panel.add(panel_1);

		medfaxLabel = new JLabel();
		medfaxLabel.setForeground(new Color(255, 102, 102));
		medfaxLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		medfaxLabel.setText("MEDFAX");
		medfaxLabel.setBounds(29, 0, 107, 23);
		panel_1.add(medfaxLabel);

		portableDiagnosticsLabel = new JLabel();
		portableDiagnosticsLabel.setForeground(new Color(255, 102, 102));

		portableDiagnosticsLabel.setFont(new Font("", Font.BOLD, 14));
		portableDiagnosticsLabel.setText("Portable Diagnostics");
		portableDiagnosticsLabel.setBounds(23, 24, 179, 23);
		panel_1.add(portableDiagnosticsLabel);

		portableDiagnosticsLabel_1 = new JLabel();
		portableDiagnosticsLabel_1.setForeground(new Color(255, 102, 102));
		portableDiagnosticsLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		portableDiagnosticsLabel_1.setText("PRECISION HEALTH INC.");
		portableDiagnosticsLabel_1.setBounds(23, 48, 179, 23);
		panel_1.add(portableDiagnosticsLabel_1);

		portableDiagnosticsLabel_2 = new JLabel();
		portableDiagnosticsLabel_2.setForeground(new Color(255, 102, 102));
		portableDiagnosticsLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		portableDiagnosticsLabel_2.setText("1(800) XRAY-EXAM");
		portableDiagnosticsLabel_2.setBounds(23, 72, 179, 23);
		panel_1.add(portableDiagnosticsLabel_2);

		portableDiagnosticsLabel_3 = new JLabel();
		portableDiagnosticsLabel_3.setForeground(new Color(255, 102, 102));
		portableDiagnosticsLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		portableDiagnosticsLabel_3.setText("1(800) 972-9392");
		portableDiagnosticsLabel_3.setBounds(23, 101, 179, 23);
		panel_1.add(portableDiagnosticsLabel_3);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(2, 119, 803, 77);
		panel.add(panel_2);

		facilityLabel = new JLabel();
		facilityLabel.setForeground(new Color(255, 102, 102));
		facilityLabel.setText("Facility:");
		facilityLabel.setBounds(5, 3, 37, 14);
		panel_2.add(facilityLabel);

		txtFacility = new JTextArea();
		txtFacility.setBounds(51, 1, 254, 18);
		panel_2.add(txtFacility);

		facilityLabel_1 = new JLabel();
		facilityLabel_1.setForeground(new Color(255, 102, 102));
		facilityLabel_1.setText("Patient:");
		facilityLabel_1.setBounds(311, 4, 46, 14);
		panel_2.add(facilityLabel_1);

		txtPatient = new JTextField();
		txtPatient.setBounds(352, 1, 342, 18);
		panel_2.add(txtPatient);

		cbMale = new JCheckBox();
		cbMale.setForeground(new Color(255, 102, 102));
		cbMale.setBackground(Color.WHITE);
		cbMale.setText("M");
		cbMale.setBounds(700, 1, 37, 18);
		panel_2.add(cbMale);

		cbFemale = new JCheckBox();
		cbFemale.setForeground(new Color(255, 102, 102));
		cbFemale.setBackground(Color.WHITE);
		cbFemale.setText("F");
		cbFemale.setBounds(743, 1, 37, 18);
		panel_2.add(cbFemale);

		facilityLabel_2 = new JLabel();
		facilityLabel_2.setForeground(new Color(255, 102, 102));
		facilityLabel_2.setText("Medicare No.:");
		facilityLabel_2.setBounds(5, 25, 67, 14);
		panel_2.add(facilityLabel_2);

		cbMedicareA = new JCheckBox();
		cbMedicareA.setForeground(new Color(255, 102, 102));
		cbMedicareA.setBackground(Color.WHITE);
		cbMedicareA.setText("A");
		cbMedicareA.setBounds(78, 25, 26, 18);
		panel_2.add(cbMedicareA);

		cbMedicareB = new JCheckBox();
		cbMedicareB.setForeground(new Color(255, 102, 102));
		cbMedicareB.setBackground(Color.WHITE);
		cbMedicareB.setText("B");
		cbMedicareB.setBounds(110, 25, 26, 18);
		panel_2.add(cbMedicareB);

		txtMedicareNo = new JTextArea();
		txtMedicareNo.setBounds(149, 22, 254, 18);
		panel_2.add(txtMedicareNo);

		facilityLabel_3 = new JLabel();
		facilityLabel_3.setForeground(new Color(255, 102, 102));
		facilityLabel_3.setText("Date of Birth:");
		facilityLabel_3.setBounds(418, 25, 67, 14);
		panel_2.add(facilityLabel_3);

		dcBirth = new JDateChooser();
		dcBirth.setDateFormatString("MM/dd/yyyy");
		dcBirth.setBounds(491, 22, 121, 18);
		panel_2.add(dcBirth);

		facilityLabel_4 = new JLabel();
		facilityLabel_4.setForeground(new Color(255, 102, 102));
		facilityLabel_4.setText("Rm. No.");
		facilityLabel_4.setBounds(618, 25, 46, 14);
		panel_2.add(facilityLabel_4);

		txtRmNo = new JTextField();
		txtRmNo.setBounds(663, 22, 125, 18);
		panel_2.add(txtRmNo);

		facilityLabel_5 = new JLabel();
		facilityLabel_5.setForeground(new Color(255, 102, 102));
		facilityLabel_5.setText("Medicaid No.:");
		facilityLabel_5.setBounds(5, 55, 69, 14);
		panel_2.add(facilityLabel_5);

		txtMedicaidNo = new JTextField();
		txtMedicaidNo.setBounds(78, 55, 109, 18);
		panel_2.add(txtMedicaidNo);

		suffixLabel = new JLabel();
		suffixLabel.setForeground(new Color(255, 102, 102));
		suffixLabel.setFont(new Font("", Font.PLAIN, 10));
		suffixLabel.setText("(Suffix)");
		suffixLabel.setBounds(120, 40, 46, 13);
		panel_2.add(suffixLabel);

		facilityLabel_6 = new JLabel();
		facilityLabel_6.setForeground(new Color(255, 102, 102));
		facilityLabel_6.setText("Insurance Policy #:");
		facilityLabel_6.setBounds(193, 55, 99, 14);
		panel_2.add(facilityLabel_6);

		txtInsurance = new JTextArea();
		txtInsurance.setBounds(290, 55, 117, 18);
		panel_2.add(txtInsurance);

		facilityLabel_7 = new JLabel();
		facilityLabel_7.setForeground(new Color(255, 102, 102));
		facilityLabel_7.setText("Pre-Approval#:");
		facilityLabel_7.setBounds(418, 56, 83, 14);
		panel_2.add(facilityLabel_7);

		txtPreApproval = new JTextArea();
		txtPreApproval.setBounds(507, 55, 117, 18);
		panel_2.add(txtPreApproval);

		facilityLabel_8 = new JLabel();
		facilityLabel_8.setForeground(new Color(255, 102, 102));
		facilityLabel_8.setText("Case#:");
		facilityLabel_8.setBounds(636, 55, 46, 14);
		panel_2.add(facilityLabel_8);

		txtCaseField = new JTextArea();
		txtCaseField.setBounds(681, 55, 107, 18);
		panel_2.add(txtCaseField);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(2, 205, 803, 213);
		panel.add(panel_3);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 210, 125);
		panel_3.add(panel_4);

		panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 102, 102));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 208, 22);
		panel_4.add(panel_6);

		chestAndThoraxdLabel = new JLabel();
		chestAndThoraxdLabel.setForeground(Color.WHITE);
		chestAndThoraxdLabel.setText("CARDIOLOGICAL SERVICES");
		chestAndThoraxdLabel.setBounds(28, 0, 144, 18);
		panel_6.add(chestAndThoraxdLabel);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		panel_7.setBounds(0, 22, 210, 18);
		panel_4.add(panel_7);

		chest1ViewLabel = new JLabel();
		chest1ViewLabel
				.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		chest1ViewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel.setBackground(Color.WHITE);
		chest1ViewLabel.setForeground(new Color(255, 102, 102));
		chest1ViewLabel.setText("12 Lead EKG INC. Rhythm Strip");
		chest1ViewLabel.setBounds(32, 1, 170, 14);
		panel_7.add(chest1ViewLabel);

		cbCardiological12 = new JCheckBox();
		cbCardiological12.setForeground(new Color(255, 102, 102));
		cbCardiological12.setText("cbChestAndThoraxChest");
		cbCardiological12.setBounds(12, 1, 14, 16);
		panel_7.add(cbCardiological12);
		cbCardiological12.setBackground(Color.WHITE);

		panel_9 = new JPanel();
		panel_9.setForeground(new Color(255, 102, 102));
		panel_9.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 39, 210, 18);
		panel_4.add(panel_9);

		chest1ViewLabel_1 = new JLabel();
		chest1ViewLabel_1.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_1.setText("Long Rhythm Strip");
		chest1ViewLabel_1.setBounds(32, 1, 143, 14);
		panel_9.add(chest1ViewLabel_1);

		cbCardiologicalLong = new JCheckBox();
		cbCardiologicalLong.setBackground(Color.WHITE);
		cbCardiologicalLong.setText("cbChestAndThoraxChestAPL");
		cbCardiologicalLong.setBounds(12, 1, 14, 16);
		panel_9.add(cbCardiologicalLong);

		panel_10 = new JPanel();
		panel_10.setForeground(new Color(255, 102, 102));
		panel_10.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 56, 210, 18);
		panel_4.add(panel_10);

		chest1ViewLabel_2 = new JLabel();
		chest1ViewLabel_2.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_2.setText("Pacemaker Check (Single)");
		chest1ViewLabel_2.setBounds(32, 1, 180, 14);
		panel_10.add(chest1ViewLabel_2);

		cbCardiologicalPacemaker = new JCheckBox();
		cbCardiologicalPacemaker.setBackground(Color.WHITE);
		cbCardiologicalPacemaker.setText("cbChestAndThoraxChestAPAL");
		cbCardiologicalPacemaker.setBounds(12, 1, 14, 16);
		panel_10.add(cbCardiologicalPacemaker);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 73, 210, 18);
		panel_4.add(panel_11);

		chest1ViewLabel_3 = new JLabel();
		chest1ViewLabel_3.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_3.setText("Dual Pacemaker");
		chest1ViewLabel_3.setBounds(32, 1, 127, 14);
		panel_11.add(chest1ViewLabel_3);

		cbCardiologicalDual = new JCheckBox();
		cbCardiologicalDual.setBackground(Color.WHITE);
		cbCardiologicalDual.setText("cbChestAndThoraxDecub");
		cbCardiologicalDual.setBounds(12, 1, 14, 16);
		panel_11.add(cbCardiologicalDual);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(0, 90, 210, 18);
		panel_4.add(panel_12);

		chest1ViewLabel_4 = new JLabel();
		chest1ViewLabel_4.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_4.setText("Holter Monitor");
		chest1ViewLabel_4.setBounds(32, 1, 143, 14);
		panel_12.add(chest1ViewLabel_4);

		cbCardiologicalHolter = new JCheckBox();
		cbCardiologicalHolter.setBackground(Color.WHITE);
		cbCardiologicalHolter.setText("cbChestAndThoraxRibsUnil");
		cbCardiologicalHolter.setBounds(12, 1, 14, 16);
		panel_12.add(cbCardiologicalHolter);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(0, 107, 210, 18);
		panel_4.add(panel_13);

		chest1ViewLabel_5 = new JLabel();
		chest1ViewLabel_5.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_5.setText("Pulse Oximetry - oxygen saturation");
		chest1ViewLabel_5.setBounds(32, 1, 178, 14);
		panel_13.add(chest1ViewLabel_5);

		cbCardiologicalPulse = new JCheckBox();
		cbCardiologicalPulse.setBackground(Color.WHITE);
		cbCardiologicalPulse.setText("cbChestAndThoraxRibsUniC");
		cbCardiologicalPulse.setBounds(12, 1, 14, 16);
		panel_13.add(cbCardiologicalPulse);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(209, 0, 38, 125);
		panel_3.add(panel_5);

		panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 102, 102));
		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 36, 22);
		panel_5.add(panel_8);

		icdTextArea = new JTextArea();
		icdTextArea.setWrapStyleWord(true);
		icdTextArea.setText("CPT CODE");
		icdTextArea.setLineWrap(true);
		icdTextArea.setForeground(Color.WHITE);
		icdTextArea.setFont(new Font("", Font.PLAIN, 8));
		icdTextArea.setBackground(new Color(255, 102, 102));
		icdTextArea.setBounds(5, 1, 26, 20);
		panel_8.add(icdTextArea);

		label = new JLabel();
		label.setForeground(new Color(255, 102, 102));
		label.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label.setText("93000");
		label.setBounds(0, 22, 39, 18);
		panel_5.add(label);

		label_2 = new JLabel();
		label_2.setForeground(new Color(255, 102, 102));
		label_2.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_2.setText("93041");
		label_2.setBounds(0, 39, 39, 18);
		panel_5.add(label_2);

		label_3 = new JLabel();
		label_3.setForeground(new Color(255, 102, 102));
		label_3.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_3.setText("93733");
		label_3.setBounds(0, 73, 39, 18);
		panel_5.add(label_3);

		label_4 = new JLabel();
		label_4.setForeground(new Color(255, 102, 102));
		label_4.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_4.setText("93231");
		label_4.setBounds(0, 56, 39, 18);
		panel_5.add(label_4);

		label_5 = new JLabel();
		label_5.setForeground(new Color(255, 102, 102));
		label_5.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_5.setText("93231");
		label_5.setBounds(0, 90, 39, 18);
		panel_5.add(label_5);

		label_6 = new JLabel();
		label_6.setForeground(new Color(255, 102, 102));
		label_6.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_6.setText("94760");
		label_6.setBounds(0, 107, 38, 18);
		panel_5.add(label_6);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(245, 0, 245, 212);
		panel_3.add(panel_23);

		panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBackground(new Color(255, 102, 102));
		panel_24.setBounds(2, 0, 241, 22);
		panel_23.add(panel_24);

		chestAndThoraxdLabel_2 = new JLabel();
		chestAndThoraxdLabel_2.setForeground(Color.WHITE);
		chestAndThoraxdLabel_2.setText("ULTRASOUNDS");
		chestAndThoraxdLabel_2.setBounds(28, 0, 113, 18);
		panel_24.add(chestAndThoraxdLabel_2);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(0, 22, 245, 18);
		panel_23.add(panel_25);

		chest1ViewLabel_13 = new JLabel();
		chest1ViewLabel_13.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_13.setText("Echocardiogram");
		chest1ViewLabel_13.setBounds(32, 1, 136, 14);
		panel_25.add(chest1ViewLabel_13);

		cbUltrasoundsEcho = new JCheckBox();
		cbUltrasoundsEcho.setBackground(Color.WHITE);
		cbUltrasoundsEcho.setText("cbUpperShoulder");
		cbUltrasoundsEcho.setBounds(12, 1, 14, 16);
		panel_25.add(cbUltrasoundsEcho);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(0, 39, 242, 18);
		panel_23.add(panel_26);

		chest1ViewLabel_14 = new JLabel();
		chest1ViewLabel_14.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_14
				.setText(" (color flow,mapping,doppler-93307,93320,93325)");
		chest1ViewLabel_14.setBounds(0, 1, 246, 14);
		panel_26.add(chest1ViewLabel_14);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(0, 56, 245, 18);
		panel_23.add(panel_27);

		chest1ViewLabel_15 = new JLabel();
		chest1ViewLabel_15.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_15.setText("Thyroid");
		chest1ViewLabel_15.setBounds(32, 1, 180, 14);
		panel_27.add(chest1ViewLabel_15);

		cbUltrasoundsThyroid = new JCheckBox();
		cbUltrasoundsThyroid.setBackground(Color.WHITE);
		cbUltrasoundsThyroid.setText("cbUpperScapula");
		cbUltrasoundsThyroid.setBounds(12, 1, 14, 16);
		panel_27.add(cbUltrasoundsThyroid);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 73, 245, 18);
		panel_23.add(panel_28);

		chest1ViewLabel_16 = new JLabel();
		chest1ViewLabel_16.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_16.setText("Testicular, Scrotum");
		chest1ViewLabel_16.setBounds(32, 1, 127, 14);
		panel_28.add(chest1ViewLabel_16);

		cbUltrasoundsTesticular = new JCheckBox();
		cbUltrasoundsTesticular.setBackground(Color.WHITE);
		cbUltrasoundsTesticular.setText("New JCheckBox");
		cbUltrasoundsTesticular.setBounds(12, 1, 14, 16);
		panel_28.add(cbUltrasoundsTesticular);

		panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(0, 90, 245, 18);
		panel_23.add(panel_29);

		chest1ViewLabel_17 = new JLabel();
		chest1ViewLabel_17.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_17.setText("Carotid Duplex Doppler (color)");
		chest1ViewLabel_17.setBounds(32, 1, 175, 14);
		panel_29.add(chest1ViewLabel_17);

		cbUltrasoundsCarotid = new JCheckBox();
		cbUltrasoundsCarotid.setBackground(Color.WHITE);
		cbUltrasoundsCarotid.setText("New JCheckBox");
		cbUltrasoundsCarotid.setBounds(12, 1, 14, 16);
		panel_29.add(cbUltrasoundsCarotid);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(0, 107, 245, 18);
		panel_23.add(panel_30);

		chest1ViewLabel_18 = new JLabel();
		chest1ViewLabel_18.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_18.setText("Abdominal (Multi Sites)");
		chest1ViewLabel_18.setBounds(32, 1, 160, 14);
		panel_30.add(chest1ViewLabel_18);

		cbUltrasoundsAbdominalMulti = new JCheckBox();
		cbUltrasoundsAbdominalMulti.setBackground(Color.WHITE);
		cbUltrasoundsAbdominalMulti.setText("New JCheckBox");
		cbUltrasoundsAbdominalMulti.setBounds(12, 1, 14, 16);
		panel_30.add(cbUltrasoundsAbdominalMulti);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 124, 245, 18);
		panel_23.add(panel_31);

		chest1ViewLabel_19 = new JLabel();
		chest1ViewLabel_19.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_19.setText("Abdominal (Retroperitoneal)");
		chest1ViewLabel_19.setBounds(32, 1, 132, 14);
		panel_31.add(chest1ViewLabel_19);

		cbUltrasoundsAbdominalRetro = new JCheckBox();
		cbUltrasoundsAbdominalRetro.setBackground(Color.WHITE);
		cbUltrasoundsAbdominalRetro.setText("New JCheckBox");
		cbUltrasoundsAbdominalRetro.setBounds(12, 1, 14, 16);
		panel_31.add(cbUltrasoundsAbdominalRetro);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 141, 245, 18);
		panel_23.add(panel_33);

		chest1ViewLabel_20 = new JLabel();
		chest1ViewLabel_20.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_20.setText("Pelvis");
		chest1ViewLabel_20.setBounds(32, 1, 132, 14);
		panel_33.add(chest1ViewLabel_20);

		cbUltrasoundsPelvis = new JCheckBox();
		cbUltrasoundsPelvis.setBackground(Color.WHITE);
		cbUltrasoundsPelvis.setText("New JCheckBox");
		cbUltrasoundsPelvis.setBounds(12, 1, 14, 16);
		panel_33.add(cbUltrasoundsPelvis);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(0, 158, 245, 18);
		panel_23.add(panel_34);

		chest1ViewLabel_21 = new JLabel();
		chest1ViewLabel_21.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_21.setText("Prostate");
		chest1ViewLabel_21.setBounds(32, 1, 80, 14);
		panel_34.add(chest1ViewLabel_21);

		cbUltrasoundsProstate = new JCheckBox();
		cbUltrasoundsProstate.setBackground(Color.WHITE);
		cbUltrasoundsProstate.setText("New JCheckBox");
		cbUltrasoundsProstate.setBounds(12, 1, 14, 16);
		panel_34.add(cbUltrasoundsProstate);

		panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_60.setLayout(null);
		panel_60.setBackground(Color.WHITE);
		panel_60.setBounds(0, 279, 247, 18);
		panel_23.add(panel_60);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 175, 245, 18);
		panel_23.add(panel_21);

		chest1ViewLabel_11 = new JLabel();
		chest1ViewLabel_11.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_11.setText("Renal");
		chest1ViewLabel_11.setBounds(32, 1, 80, 14);
		panel_21.add(chest1ViewLabel_11);

		cbUltrasoundsRenal = new JCheckBox();
		cbUltrasoundsRenal.setBackground(Color.WHITE);
		cbUltrasoundsRenal.setText("New JCheckBox");
		cbUltrasoundsRenal.setBounds(12, 1, 14, 16);
		panel_21.add(cbUltrasoundsRenal);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(490, 0, 45, 212);
		panel_3.add(panel_39);

		panel_40 = new JPanel();
		panel_40.setLayout(null);
		panel_40.setBackground(new Color(255, 102, 102));
		panel_40.setBounds(0, 0, 43, 22);
		panel_39.add(panel_40);

		icdTextArea_1 = new JTextArea();
		icdTextArea_1.setWrapStyleWord(true);
		icdTextArea_1.setText("CPT CODE");
		icdTextArea_1.setLineWrap(true);
		icdTextArea_1.setForeground(Color.WHITE);
		icdTextArea_1.setFont(new Font("Dialog", Font.BOLD, 8));
		icdTextArea_1.setBackground(new Color(255, 102, 102));
		icdTextArea_1.setBounds(10, 1, 25, 20);
		panel_40.add(icdTextArea_1);

		label_14 = new JLabel();
		label_14.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_14.setBounds(0, 22, 45, 18);
		panel_39.add(label_14);

		label_15 = new JLabel();
		label_15.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_15.setBounds(0, 39, 45, 18);
		panel_39.add(label_15);

		label_16 = new JLabel();
		label_16.setForeground(new Color(255, 102, 102));
		label_16.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_16.setText("79536");
		label_16.setBounds(0, 56, 45, 18);
		panel_39.add(label_16);

		label_17 = new JLabel();
		label_17.setForeground(new Color(255, 102, 102));
		label_17.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_17.setText("76870");
		label_17.setBounds(0, 73, 45, 18);
		panel_39.add(label_17);

		label_18 = new JLabel();
		label_18.setForeground(new Color(255, 102, 102));
		label_18.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_18.setText("93675");
		label_18.setBounds(0, 90, 45, 18);
		panel_39.add(label_18);

		label_19 = new JLabel();
		label_19.setForeground(new Color(255, 102, 102));
		label_19.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_19.setText("76700");
		label_19.setBounds(0, 107, 45, 18);
		panel_39.add(label_19);

		label_20 = new JLabel();
		label_20.setForeground(new Color(255, 102, 102));
		label_20.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_20.setText("76770");
		label_20.setBounds(0, 124, 45, 18);
		panel_39.add(label_20);

		label_21 = new JLabel();
		label_21.setForeground(new Color(255, 102, 102));
		label_21.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_21.setText("76856");
		label_21.setBounds(0, 141, 45, 18);
		panel_39.add(label_21);

		label_23 = new JLabel();
		label_23.setForeground(new Color(255, 102, 102));
		label_23.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_23.setText("76770");
		label_23.setBounds(0, 175, 45, 18);
		panel_39.add(label_23);

		label_103 = new JLabel();
		label_103.setForeground(new Color(255, 102, 102));
		label_103.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_103.setText("76872");
		label_103.setBounds(0, 158, 45, 18);
		panel_39.add(label_103);

		panel_41 = new JPanel();
		panel_41.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_41.setLayout(null);
		panel_41.setBackground(Color.WHITE);
		panel_41.setBounds(535, 0, 210, 142);
		panel_3.add(panel_41);

		panel_42 = new JPanel();
		panel_42.setLayout(null);
		panel_42.setBackground(new Color(255, 102, 102));
		panel_42.setBounds(0, 0, 208, 22);
		panel_41.add(panel_42);

		chestAndThoraxdLabel_4 = new JLabel();
		chestAndThoraxdLabel_4.setForeground(Color.WHITE);
		chestAndThoraxdLabel_4.setText("ULTRASOUNDS");
		chestAndThoraxdLabel_4.setBounds(28, 0, 113, 18);
		panel_42.add(chestAndThoraxdLabel_4);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(0, 22, 210, 18);
		panel_41.add(panel_43);

		chest1ViewLabel_26 = new JLabel();
		chest1ViewLabel_26.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_26.setText("Breast");
		chest1ViewLabel_26.setBounds(32, 1, 136, 14);
		panel_43.add(chest1ViewLabel_26);

		cbUltrasoundsBreast = new JCheckBox();
		cbUltrasoundsBreast.setBackground(Color.WHITE);
		cbUltrasoundsBreast.setText("New JCheckBox");
		cbUltrasoundsBreast.setBounds(12, 1, 14, 16);
		panel_43.add(cbUltrasoundsBreast);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(0, 39, 210, 18);
		panel_41.add(panel_44);

		chest1ViewLabel_27 = new JLabel();
		chest1ViewLabel_27.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_27.setText("Chest");
		chest1ViewLabel_27.setBounds(32, 1, 143, 14);
		panel_44.add(chest1ViewLabel_27);

		cbUltrasoundsChest = new JCheckBox();
		cbUltrasoundsChest.setBackground(Color.WHITE);
		cbUltrasoundsChest.setText("New JCheckBox");
		cbUltrasoundsChest.setBounds(12, 1, 14, 16);
		panel_44.add(cbUltrasoundsChest);

		panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(0, 56, 210, 18);
		panel_41.add(panel_45);

		chest1ViewLabel_28 = new JLabel();
		chest1ViewLabel_28.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_28.setText("Venous Duplex with Doppler");
		chest1ViewLabel_28.setBounds(32, 1, 168, 14);
		panel_45.add(chest1ViewLabel_28);

		cbUltrasoundsVenous = new JCheckBox();
		cbUltrasoundsVenous.setBackground(Color.WHITE);
		cbUltrasoundsVenous.setText("New JCheckBox");
		cbUltrasoundsVenous.setBounds(12, 1, 14, 16);
		panel_45.add(cbUltrasoundsVenous);

		panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(0, 90, 210, 18);
		panel_41.add(panel_47);

		chest1ViewLabel_30 = new JLabel();
		chest1ViewLabel_30.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_30.setText("Arterial Duplex with Doppler");
		chest1ViewLabel_30.setBounds(32, 1, 143, 14);
		panel_47.add(chest1ViewLabel_30);

		cbUltrasoundsArterial = new JCheckBox();
		cbUltrasoundsArterial.setBackground(Color.WHITE);
		cbUltrasoundsArterial.setText("New JCheckBox");
		cbUltrasoundsArterial.setBounds(12, 1, 14, 16);
		panel_47.add(cbUltrasoundsArterial);

		panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_48.setLayout(null);
		panel_48.setBackground(Color.WHITE);
		panel_48.setBounds(0, 107, 210, 18);
		panel_41.add(panel_48);

		chest1ViewLabel_6 = new JLabel();
		chest1ViewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_6.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_6.setBackground(Color.WHITE);
		chest1ViewLabel_6.setText("(RT");
		chest1ViewLabel_6.setBounds(5, 0, 19, 14);
		panel_48.add(chest1ViewLabel_6);

		this.cbUltrasoundsArterialRT = new JCheckBox();
		this.cbUltrasoundsArterialRT.setBackground(Color.WHITE);
		this.cbUltrasoundsArterialRT.setText("New JCheckBox");
		this.cbUltrasoundsArterialRT.setBounds(28, 0, 14, 16);
		panel_48.add(this.cbUltrasoundsArterialRT);

		chest1ViewLabel_7 = new JLabel();
		chest1ViewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_7.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_7.setBackground(Color.WHITE);
		chest1ViewLabel_7.setText("LT");
		chest1ViewLabel_7.setBounds(45, 1, 14, 14);
		panel_48.add(chest1ViewLabel_7);

		cbUltrasoundsArterialLT = new JCheckBox();
		cbUltrasoundsArterialLT.setBackground(Color.WHITE);
		cbUltrasoundsArterialLT.setText("New JCheckBox");
		cbUltrasoundsArterialLT.setBounds(65, 0, 14, 16);
		panel_48.add(cbUltrasoundsArterialLT);

		chest1ViewLabel_8 = new JLabel();
		chest1ViewLabel_8.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_8.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_8.setBackground(Color.WHITE);
		chest1ViewLabel_8.setText("BOTH");
		chest1ViewLabel_8.setBounds(85, 1, 27, 14);
		panel_48.add(chest1ViewLabel_8);

		cbUltrasoundsArterialBoth = new JCheckBox();
		cbUltrasoundsArterialBoth.setBackground(Color.WHITE);
		cbUltrasoundsArterialBoth.setText("New JCheckBox");
		cbUltrasoundsArterialBoth.setBounds(118, 0, 14, 16);
		panel_48.add(cbUltrasoundsArterialBoth);

		chest1ViewLabel_9 = new JLabel();
		chest1ViewLabel_9.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_9.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_9.setBackground(Color.WHITE);
		chest1ViewLabel_9.setText("LOWER");
		chest1ViewLabel_9.setBounds(138, 1, 36, 14);
		panel_48.add(chest1ViewLabel_9);

		cbUltrasoundsArterialLower = new JCheckBox();
		cbUltrasoundsArterialLower.setBackground(Color.WHITE);
		cbUltrasoundsArterialLower.setText("New JCheckBox");
		cbUltrasoundsArterialLower.setBounds(178, 0, 14, 16);
		panel_48.add(cbUltrasoundsArterialLower);

		chest1ViewLabel_10 = new JLabel();
		chest1ViewLabel_10.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_10.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_10.setBackground(Color.WHITE);
		chest1ViewLabel_10.setText(")");
		chest1ViewLabel_10.setBounds(191, 1, 9, 14);
		panel_48.add(chest1ViewLabel_10);

		panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(0, 73, 210, 18);
		panel_41.add(panel_46);

		chest1ViewLabel_67 = new JLabel();
		chest1ViewLabel_67.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_67.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_67.setBackground(Color.WHITE);
		chest1ViewLabel_67.setText("(RT");
		chest1ViewLabel_67.setBounds(5, 0, 19, 14);
		panel_46.add(chest1ViewLabel_67);

		chest1ViewLabel_87 = new JLabel();
		chest1ViewLabel_87.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_87.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_87.setBackground(Color.WHITE);
		chest1ViewLabel_87.setText("LT");
		chest1ViewLabel_87.setBounds(45, 1, 14, 14);
		panel_46.add(chest1ViewLabel_87);

		cbUltrasoundsVenousLT = new JCheckBox();
		cbUltrasoundsVenousLT.setBackground(Color.WHITE);
		cbUltrasoundsVenousLT.setText("New JCheckBox");
		cbUltrasoundsVenousLT.setBounds(65, 0, 14, 16);
		panel_46.add(cbUltrasoundsVenousLT);

		chest1ViewLabel_88 = new JLabel();
		chest1ViewLabel_88.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_88.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_88.setBackground(Color.WHITE);
		chest1ViewLabel_88.setText("BOTH");
		chest1ViewLabel_88.setBounds(85, 1, 27, 14);
		panel_46.add(chest1ViewLabel_88);

		cbUltrasoundsVenousBoth = new JCheckBox();
		cbUltrasoundsVenousBoth.setBackground(Color.WHITE);
		cbUltrasoundsVenousBoth.setText("New JCheckBox");
		cbUltrasoundsVenousBoth.setBounds(118, 0, 14, 16);
		panel_46.add(cbUltrasoundsVenousBoth);

		chest1ViewLabel_90 = new JLabel();
		chest1ViewLabel_90.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_90.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_90.setBackground(Color.WHITE);
		chest1ViewLabel_90.setText(")");
		chest1ViewLabel_90.setBounds(138, 1, 4, 14);
		panel_46.add(chest1ViewLabel_90);

		cbUltrasoundsVenousRT = new JCheckBox();
		cbUltrasoundsVenousRT.setBackground(Color.WHITE);
		cbUltrasoundsVenousRT.setText("New JCheckBox");
		cbUltrasoundsVenousRT.setBounds(30, 0, 14, 16);
		panel_46.add(cbUltrasoundsVenousRT);

		panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(0, 124, 210, 18);
		panel_41.add(panel_49);

		chest1ViewLabel_32 = new JLabel();
		chest1ViewLabel_32.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_32.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_32.setBackground(Color.WHITE);
		chest1ViewLabel_32.setText("(RT");
		chest1ViewLabel_32.setBounds(5, 0, 19, 14);
		panel_49.add(chest1ViewLabel_32);

		cbUltrasoundsArterialRT2 = new JCheckBox();
		cbUltrasoundsArterialRT2.setBackground(Color.WHITE);
		cbUltrasoundsArterialRT2.setText("New JCheckBox");
		cbUltrasoundsArterialRT2.setBounds(28, 0, 14, 16);
		panel_49.add(cbUltrasoundsArterialRT2);

		chest1ViewLabel_89 = new JLabel();
		chest1ViewLabel_89.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_89.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_89.setBackground(Color.WHITE);
		chest1ViewLabel_89.setText("LT");
		chest1ViewLabel_89.setBounds(45, 1, 14, 14);
		panel_49.add(chest1ViewLabel_89);

		cbUltrasoundsArterialLT2 = new JCheckBox();
		cbUltrasoundsArterialLT2.setBackground(Color.WHITE);
		cbUltrasoundsArterialLT2.setText("New JCheckBox");
		cbUltrasoundsArterialLT2.setBounds(65, 0, 14, 16);
		panel_49.add(cbUltrasoundsArterialLT2);

		chest1ViewLabel_91 = new JLabel();
		chest1ViewLabel_91.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_91.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_91.setBackground(Color.WHITE);
		chest1ViewLabel_91.setText("BOTH");
		chest1ViewLabel_91.setBounds(85, 1, 27, 14);
		panel_49.add(chest1ViewLabel_91);

		cbUltrasoundsArterialBoth2 = new JCheckBox();
		cbUltrasoundsArterialBoth2.setBackground(Color.WHITE);
		cbUltrasoundsArterialBoth2.setText("New JCheckBox");
		cbUltrasoundsArterialBoth2.setBounds(118, 0, 14, 16);
		panel_49.add(cbUltrasoundsArterialBoth2);

		chest1ViewLabel_92 = new JLabel();
		chest1ViewLabel_92.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_92.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_92.setBackground(Color.WHITE);
		chest1ViewLabel_92.setText("UPPER");
		chest1ViewLabel_92.setBounds(138, 1, 36, 14);
		panel_49.add(chest1ViewLabel_92);

		cbUltrasoundsArterialUpper2 = new JCheckBox();
		cbUltrasoundsArterialUpper2.setBackground(Color.WHITE);
		cbUltrasoundsArterialUpper2.setText("New JCheckBox");
		cbUltrasoundsArterialUpper2.setBounds(178, 0, 14, 16);
		panel_49.add(cbUltrasoundsArterialUpper2);

		chest1ViewLabel_93 = new JLabel();
		chest1ViewLabel_93.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_93.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_93.setBackground(Color.WHITE);
		chest1ViewLabel_93.setText(")");
		chest1ViewLabel_93.setBounds(191, 1, 9, 14);
		panel_49.add(chest1ViewLabel_93);

		panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(744, 0, 59, 142);
		panel_3.add(panel_57);

		panel_58 = new JPanel();
		panel_58.setLayout(null);
		panel_58.setBackground(new Color(255, 102, 102));
		panel_58.setBounds(0, 0, 59, 22);
		panel_57.add(panel_58);

		icdTextArea_2 = new JTextArea();
		icdTextArea_2.setWrapStyleWord(true);
		icdTextArea_2.setText("CPT CODE");
		icdTextArea_2.setLineWrap(true);
		icdTextArea_2.setForeground(Color.WHITE);
		icdTextArea_2.setFont(new Font("Dialog", Font.BOLD, 8));
		icdTextArea_2.setBackground(new Color(255, 102, 102));
		icdTextArea_2.setBounds(25, 1, 33, 20);
		panel_58.add(icdTextArea_2);

		label_27 = new JLabel();
		label_27.setForeground(new Color(255, 102, 102));
		label_27.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_27.setText("76645");
		label_27.setBounds(0, 22, 59, 18);
		panel_57.add(label_27);

		label_28 = new JLabel();
		label_28.setForeground(new Color(255, 102, 102));
		label_28.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_28.setText("76604");
		label_28.setBounds(0, 39, 59, 18);
		panel_57.add(label_28);

		v73970Label = new JLabel();
		v73970Label.setForeground(new Color(255, 102, 102));
		v73970Label
				.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		v73970Label.setText("V73970");
		v73970Label.setBounds(0, 56, 59, 18);
		panel_57.add(v73970Label);

		label_30 = new JLabel();
		label_30.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_30.setBounds(0, 73, 59, 18);
		panel_57.add(label_30);

		label_31 = new JLabel();
		label_31.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_31.setBounds(0, 90, 59, 18);
		panel_57.add(label_31);

		label_32 = new JLabel();
		label_32.setForeground(new Color(255, 102, 102));
		label_32.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_32.setText("93925");
		label_32.setBounds(0, 107, 59, 18);
		panel_57.add(label_32);

		label_33 = new JLabel();
		label_33.setForeground(new Color(255, 102, 102));
		label_33.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		label_33.setText("93930");
		label_33.setBounds(0, 124, 59, 18);
		panel_57.add(label_33);

		panel_56 = new JPanel();
		panel_56.setLayout(null);
		panel_56.setBackground(new Color(255, 102, 102));
		panel_56.setBounds(535, 141, 268, 18);
		panel_3.add(panel_56);

		chestAndThoraxdLabel_6 = new JLabel();
		chestAndThoraxdLabel_6.setForeground(Color.WHITE);
		chestAndThoraxdLabel_6.setText("TECHNICAL NOTES");
		chestAndThoraxdLabel_6.setBounds(59, 0, 104, 18);
		panel_56.add(chestAndThoraxdLabel_6);

		panel_22 = new JPanel();
		panel_22.setBackground(Color.WHITE);
		panel_22.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_22.setLayout(null);
		panel_22.setBounds(0, 159, 247, 53);
		panel_3.add(panel_22);

		otherLabel = new JLabel();
		otherLabel.setForeground(new Color(255, 102, 102));
		otherLabel.setBounds(0, 0, 54, 14);
		panel_22.add(otherLabel);
		otherLabel.setText("OTHER:");

		txtCardiologicalOther = new JTextArea();
		txtCardiologicalOther.setWrapStyleWord(true);
		txtCardiologicalOther.setLineWrap(true);
		txtCardiologicalOther.setBounds(47, 3, 176, 31);
		panel_22.add(txtCardiologicalOther);

		panel_62 = new JPanel();
		panel_62.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_62.setLayout(null);
		panel_62.setBackground(Color.WHITE);
		panel_62.setBounds(535, 158, 268, 54);
		panel_3.add(panel_62);

		otherLabel_1 = new JLabel();
		otherLabel_1.setForeground(new Color(255, 102, 102));
		otherLabel_1.setText("COMMENTS:");
		otherLabel_1.setBounds(0, 0, 60, 14);
		panel_62.add(otherLabel_1);

		txtTechnicalComments = new JTextArea();
		txtTechnicalComments.setWrapStyleWord(true);
		txtTechnicalComments.setLineWrap(true);
		txtTechnicalComments.setBounds(69, 3, 189, 31);
		panel_62.add(txtTechnicalComments);

		panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_14.setLayout(null);
		panel_14.setBounds(0, 124, 95, 18);
		panel_3.add(panel_14);

		oxygenSaturationLabel = new JLabel();
		oxygenSaturationLabel.setForeground(new Color(255, 102, 102));
		oxygenSaturationLabel.setText("oxygen saturation ");
		oxygenSaturationLabel.setBounds(1, 0, 93, 14);
		panel_14.add(oxygenSaturationLabel);

		panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_16.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_16.setLayout(null);
		panel_16.setBounds(93, 124, 54, 18);
		panel_3.add(panel_16);

		pulseRateLabel = new JLabel();
		pulseRateLabel.setForeground(new Color(255, 102, 102));
		pulseRateLabel.setText("pulse rate");
		pulseRateLabel.setBounds(2, 0, 54, 14);
		panel_16.add(pulseRateLabel);

		panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_17.setLayout(null);
		panel_17.setBounds(145, 124, 102, 18);
		panel_3.add(panel_17);

		oxygenDuringExamLabel = new JLabel();
		oxygenDuringExamLabel.setForeground(new Color(255, 102, 102));
		oxygenDuringExamLabel.setText("oxygen during exam");
		oxygenDuringExamLabel.setBounds(2, 0, 102, 14);
		panel_17.add(oxygenDuringExamLabel);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 140, 95, 20);
		panel_3.add(panel_18);

		txtCardiologicalOxygen = new JTextField();
		txtCardiologicalOxygen.setBounds(10, 0, 79, 21);
		panel_18.add(txtCardiologicalOxygen);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(93, 140, 54, 20);
		panel_3.add(panel_19);

		txtPulseRate = new JTextField();
		txtPulseRate.setBounds(10, 0, 34, 21);
		panel_19.add(txtPulseRate);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(145, 140, 102, 20);
		panel_3.add(panel_20);

		yesLabel = new JLabel();
		yesLabel.setForeground(new Color(255, 102, 102));
		yesLabel.setBounds(10, 5, 18, 14);
		panel_20.add(yesLabel);
		yesLabel.setText("YES");

		cbCardioOxygenYes = new JCheckBox();
		cbCardioOxygenYes.setBounds(34, 3, 18, 16);
		panel_20.add(cbCardioOxygenYes);
		cbCardioOxygenYes.setBackground(Color.WHITE);

		yesLabel_1 = new JLabel();
		yesLabel_1.setForeground(new Color(255, 102, 102));
		yesLabel_1.setBounds(58, 5, 18, 14);
		panel_20.add(yesLabel_1);
		yesLabel_1.setText("NO");

		cbCardioOxygenNo = new JCheckBox();
		cbCardioOxygenNo.setBackground(Color.WHITE);
		cbCardioOxygenNo.setText("New JCheckBox");
		cbCardioOxygenNo.setBounds(82, 3, 18, 16);
		panel_20.add(cbCardioOxygenNo);

		panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_63.setBackground(Color.WHITE);
		panel_63.setLayout(null);
		panel_63.setBounds(2, 416, 804, 53);
		panel.add(panel_63);

		panel_67 = new JPanel();
		panel_67.setBackground(Color.WHITE);
		panel_67.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_67.setLayout(null);
		panel_67.setBounds(0, 1, 64, 51);
		panel_63.add(panel_67);

		weightLabel_2 = new JLabel();
		weightLabel_2.setForeground(new Color(255, 102, 102));
		weightLabel_2.setText("TIME");
		weightLabel_2.setBounds(3, 0, 41, 14);
		panel_67.add(weightLabel_2);

		txtTime = new JTextField();
		txtTime.setBounds(3, 33, 59, 17);
		panel_67.add(txtTime);

		panel_70 = new JPanel();
		panel_70.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_70.setLayout(null);
		panel_70.setBackground(Color.WHITE);
		panel_70.setBounds(64, 1, 84, 51);
		panel_63.add(panel_70);

		weightLabel_3 = new JLabel();
		weightLabel_3.setForeground(new Color(255, 102, 102));
		weightLabel_3.setText("DATE DONE");
		weightLabel_3.setBounds(3, 0, 57, 14);
		panel_70.add(weightLabel_3);

		dcDateDone = new JDateChooser();
		dcDateDone.setDateFormatString("MM/dd/yyyy");
		dcDateDone.setBounds(3, 33, 79, 17);
		panel_70.add(dcDateDone);

		panel_71 = new JPanel();
		panel_71.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_71.setLayout(null);
		panel_71.setBackground(Color.WHITE);
		panel_71.setBounds(147, 1, 97, 51);
		panel_63.add(panel_71);

		weightLabel_4 = new JLabel();
		weightLabel_4.setForeground(new Color(255, 102, 102));
		weightLabel_4.setText("TECH");
		weightLabel_4.setBounds(3, 0, 41, 14);
		panel_71.add(weightLabel_4);

		txtTech = new JTextField();
		txtTech.setBounds(3, 33, 92, 17);
		panel_71.add(txtTech);

		panel_72 = new JPanel();
		panel_72.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_72.setLayout(null);
		panel_72.setBackground(Color.WHITE);
		panel_72.setBounds(242, 1, 107, 51);
		panel_63.add(panel_72);

		ofPtTextArea = new JTextArea();
		ofPtTextArea.setForeground(new Color(255, 102, 102));
		ofPtTextArea.setText("# OF PT SEEN ON THIS VISIT");
		ofPtTextArea.setWrapStyleWord(true);
		ofPtTextArea.setLineWrap(true);
		ofPtTextArea.setBounds(3, 2, 76, 29);
		panel_72.add(ofPtTextArea);

		txtNoPTSeen = new JTextField();
		txtNoPTSeen.setBounds(3, 33, 102, 17);
		panel_72.add(txtNoPTSeen);

		panel_73 = new JPanel();
		panel_73.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_73.setLayout(null);
		panel_73.setBackground(Color.WHITE);
		panel_73.setBounds(349, 1, 84, 51);
		panel_63.add(panel_73);

		ofPtTextArea_1 = new JTextArea();
		ofPtTextArea_1.setForeground(new Color(255, 102, 102));
		ofPtTextArea_1.setWrapStyleWord(true);
		ofPtTextArea_1.setText("# OF VIEWS");
		ofPtTextArea_1.setLineWrap(true);
		ofPtTextArea_1.setBounds(3, 2, 48, 30);
		panel_73.add(ofPtTextArea_1);

		txtNoOfViews = new JTextField();
		txtNoOfViews.setBounds(3, 33, 79, 17);
		panel_73.add(txtNoOfViews);

		panel_74 = new JPanel();
		panel_74.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_74.setLayout(null);
		panel_74.setBackground(Color.WHITE);
		panel_74.setBounds(433, 1, 120, 51);
		panel_63.add(panel_74);

		weightLabel_5 = new JLabel();
		weightLabel_5.setForeground(new Color(255, 102, 102));
		weightLabel_5.setText("RADIOLOGIST CODE");
		weightLabel_5.setBounds(3, 0, 100, 14);
		panel_74.add(weightLabel_5);

		txtRadiologistCode = new JTextField();
		txtRadiologistCode.setBounds(3, 33, 115, 17);
		panel_74.add(txtRadiologistCode);

		panel_75 = new JPanel();
		panel_75.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_75.setLayout(null);
		panel_75.setBackground(Color.WHITE);
		panel_75.setBounds(553, 1, 252, 51);
		panel_63.add(panel_75);

		cbXrayNo = new JCheckBox();
		cbXrayNo.setBackground(Color.WHITE);
		cbXrayNo.setBounds(223, 10, 18, 31);
		panel_75.add(cbXrayNo);

		previousXrayLabel = new JLabel();
		previousXrayLabel.setForeground(new Color(255, 102, 102));
		previousXrayLabel.setFont(new Font("", Font.BOLD, 12));
		previousXrayLabel.setText("PREVIOUS X-Ray");
		previousXrayLabel.setBounds(10, 18, 119, 14);
		panel_75.add(previousXrayLabel);

		yesLabel_2 = new JLabel();
		yesLabel_2.setForeground(new Color(255, 102, 102));
		yesLabel_2.setText("NO");
		yesLabel_2.setBounds(199, 19, 18, 14);
		panel_75.add(yesLabel_2);

		cbXrayYes = new JCheckBox();
		cbXrayYes.setBackground(Color.WHITE);
		cbXrayYes.setText("New JCheckBox");
		cbXrayYes.setBounds(165, 19, 18, 16);
		panel_75.add(cbXrayYes);

		yesLabel_3 = new JLabel();
		yesLabel_3.setForeground(new Color(255, 102, 102));
		yesLabel_3.setText("YES");
		yesLabel_3.setBounds(135, 19, 18, 14);
		panel_75.add(yesLabel_3);

		panel_76 = new JPanel();
		panel_76.setBackground(Color.WHITE);
		panel_76.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_76.setLayout(null);
		panel_76.setBounds(0, 483, 412, 23);
		panel.add(panel_76);

		weightLabel_10 = new JLabel();
		weightLabel_10.setForeground(new Color(255, 102, 102));
		weightLabel_10
				.setText("I authorize the release of any medical information necessary to process this claim.");
		weightLabel_10.setBounds(3, 3, 393, 14);
		panel_76.add(weightLabel_10);

		panel_78 = new JPanel();
		panel_78.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_78.setLayout(null);
		panel_78.setBackground(Color.WHITE);
		panel_78.setBounds(411, 483, 393, 23);
		panel.add(panel_78);

		weightLabel_11 = new JLabel();
		weightLabel_11.setForeground(new Color(255, 102, 102));
		weightLabel_11.setText("AUTHORIZED SIGNATURE:");
		weightLabel_11.setBounds(3, 3, 129, 14);
		panel_78.add(weightLabel_11);

		txtAuthorizedSign = new JTextField();
		txtAuthorizedSign.setBounds(138, 3, 252, 18);
		panel_78.add(txtAuthorizedSign);

		panel_79 = new JPanel();
		panel_79.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_79.setLayout(null);
		panel_79.setBackground(Color.WHITE);
		panel_79.setBounds(0, 505, 299, 23);
		panel.add(panel_79);

		weightLabel_12 = new JLabel();
		weightLabel_12.setForeground(new Color(255, 102, 102));
		weightLabel_12
				.setText("This cause was not available during technologist last entry.");
		weightLabel_12.setBounds(3, 3, 290, 14);
		panel_79.add(weightLabel_12);

		panel_80 = new JPanel();
		panel_80.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_80.setLayout(null);
		panel_80.setBackground(Color.WHITE);
		panel_80.setBounds(298, 505, 114, 23);
		panel.add(panel_80);

		cbOt = new JCheckBox();
		cbOt.setForeground(new Color(255, 102, 102));
		cbOt.setBackground(Color.WHITE);
		cbOt.setText("OT");
		cbOt.setBounds(10, 2, 39, 18);
		panel_80.add(cbOt);

		cbSt = new JCheckBox();
		cbSt.setForeground(new Color(255, 102, 102));
		cbSt.setBackground(Color.WHITE);
		cbSt.setText("ST");
		cbSt.setBounds(55, 3, 39, 18);
		panel_80.add(cbSt);

		panel_81 = new JPanel();
		panel_81.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_81.setLayout(null);
		panel_81.setBackground(Color.WHITE);
		panel_81.setBounds(411, 505, 393, 23);
		panel.add(panel_81);

		weightLabel_13 = new JLabel();
		weightLabel_13.setForeground(new Color(255, 102, 102));
		weightLabel_13.setText("CHARGE NURSE:");
		weightLabel_13.setBounds(3, 3, 129, 14);
		panel_81.add(weightLabel_13);

		txtChargeNurse = new JTextField();
		txtChargeNurse.setBounds(138, 3, 252, 18);
		panel_81.add(txtChargeNurse);

		panel_77 = new JPanel();
		panel_77.setBackground(Color.WHITE);
		panel_77.setLayout(null);
		panel_77.setBounds(0, 540, 805, 25);
		panel.add(panel_77);

		reasonForStudyLabel = new JLabel();
		reasonForStudyLabel.setForeground(new Color(255, 102, 102));
		reasonForStudyLabel.setFont(new Font("", Font.BOLD, 14));
		reasonForStudyLabel.setText("REASON FOR STUDY");
		reasonForStudyLabel.setBounds(367, 3, 179, 14);
		panel_77.add(reasonForStudyLabel);

		panel_92 = new JPanel();
		panel_92.setBackground(Color.WHITE);
		panel_92.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_92.setLayout(null);
		panel_92.setBounds(0, 960, 805, 26);
		panel.add(panel_92);

		alcoholismLabel_6 = new JLabel();
		alcoholismLabel_6.setForeground(new Color(255, 102, 102));
		alcoholismLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		alcoholismLabel_6.setText("CLINICAL HISTORY");
		alcoholismLabel_6.setBounds(10, 10, 122, 14);
		panel_92.add(alcoholismLabel_6);

		txtClinicalHistory = new JTextField();
		txtClinicalHistory.setBounds(138, 5, 664, 18);
		panel_92.add(txtClinicalHistory);

		panel_165 = new JPanel();
		panel_165.setBackground(Color.WHITE);
		panel_165.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_165.setLayout(null);
		panel_165.setBounds(0, 986, 211, 34);
		panel.add(panel_165);

		requestingPhysicianTextArea = new JTextArea();
		requestingPhysicianTextArea.setForeground(new Color(255, 102, 102));
		requestingPhysicianTextArea.setLineWrap(true);
		requestingPhysicianTextArea.setWrapStyleWord(true);
		requestingPhysicianTextArea.setText("REQUESTING PHYSICIAN:");
		requestingPhysicianTextArea.setBounds(3, 2, 73, 30);
		panel_165.add(requestingPhysicianTextArea);

		txtRequestPhysician = new JTextField();
		txtRequestPhysician.setBounds(79, 5, 130, 20);
		panel_165.add(txtRequestPhysician);

		panel_167 = new JPanel();
		panel_167.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_167.setLayout(null);
		panel_167.setBackground(Color.WHITE);
		panel_167.setBounds(210, 986, 224, 34);
		panel.add(panel_167);

		txtNurse = new JTextField();
		txtNurse.setBounds(50, 5, 172, 20);
		panel_167.add(txtNurse);

		nurseLabel = new JLabel();
		nurseLabel.setForeground(new Color(255, 102, 102));
		nurseLabel.setText("NURSE:");
		nurseLabel.setBounds(10, 14, 54, 14);
		panel_167.add(nurseLabel);

		panel_168 = new JPanel();
		panel_168.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_168.setLayout(null);
		panel_168.setBackground(Color.WHITE);
		panel_168.setBounds(435, 986, 176, 34);
		panel.add(panel_168);

		requestingPhysicianTextArea_1 = new JTextArea();
		requestingPhysicianTextArea_1.setForeground(new Color(255, 102, 102));
		requestingPhysicianTextArea_1.setWrapStyleWord(true);
		requestingPhysicianTextArea_1.setText("DATE ORDERED:");
		requestingPhysicianTextArea_1.setLineWrap(true);
		requestingPhysicianTextArea_1.setBounds(0, 0, 54, 32);
		panel_168.add(requestingPhysicianTextArea_1);

		dcDateOrdered = new JDateChooser();
		dcDateOrdered.setDateFormatString("MM/dd/yyyy");
		dcDateOrdered.setBounds(56, 5, 118, 20);
		panel_168.add(dcDateOrdered);

		panel_169 = new JPanel();
		panel_169.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_169.setLayout(null);
		panel_169.setBackground(Color.WHITE);
		panel_169.setBounds(610, 986, 196, 34);
		panel.add(panel_169);

		requestingPhysicianTextArea_2 = new JTextArea();
		requestingPhysicianTextArea_2.setForeground(new Color(255, 102, 102));
		requestingPhysicianTextArea_2.setWrapStyleWord(true);
		requestingPhysicianTextArea_2.setText("DATE REPORT RECEIVED:");
		requestingPhysicianTextArea_2.setLineWrap(true);
		requestingPhysicianTextArea_2.setBounds(3, 0, 74, 32);
		panel_169.add(requestingPhysicianTextArea_2);

		dcDateReportReceived = new JDateChooser();
		dcDateReportReceived.setDateFormatString("MM/dd/yyyy");
		dcDateReportReceived.setBounds(78, 5, 114, 20);
		panel_169.add(dcDateReportReceived);

		panel_166 = new JPanel();
		panel_166.setBackground(Color.WHITE);
		panel_166.setLayout(null);
		panel_166.setBounds(0, 1030, 805, 53);
		panel.add(panel_166);

		notePortableXrayLabel = new JLabel();
		notePortableXrayLabel.setForeground(new Color(255, 102, 102));
		notePortableXrayLabel
				.setText("NOTE: Portable x-ray is required due to patient's physical or mental ability to be transported from facility");
		notePortableXrayLabel.setBounds(0, 3, 542, 14);
		panel_166.add(notePortableXrayLabel);

		notePortableXrayLabel_1 = new JLabel();
		notePortableXrayLabel_1.setForeground(new Color(255, 102, 102));
		notePortableXrayLabel_1.setFont(new Font("", Font.BOLD, 12));
		notePortableXrayLabel_1.setText("WHITE-");
		notePortableXrayLabel_1.setBounds(103, 20, 43, 14);
		panel_166.add(notePortableXrayLabel_1);

		nursingOfficeLabel = new JLabel();
		nursingOfficeLabel.setForeground(new Color(255, 102, 102));
		nursingOfficeLabel.setText("NURSING OFFICE *");
		nursingOfficeLabel.setBounds(152, 21, 95, 14);
		panel_166.add(nursingOfficeLabel);

		notePortableXrayLabel_2 = new JLabel();
		notePortableXrayLabel_2.setForeground(new Color(255, 102, 102));
		notePortableXrayLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		notePortableXrayLabel_2.setText("YELLOW-");
		notePortableXrayLabel_2.setBounds(253, 22, 55, 14);
		panel_166.add(notePortableXrayLabel_2);

		nursingOfficeLabel_1 = new JLabel();
		nursingOfficeLabel_1.setForeground(new Color(255, 102, 102));
		nursingOfficeLabel_1.setText("PHI BILLING DEPT. * ");
		nursingOfficeLabel_1.setBounds(307, 22, 102, 14);
		panel_166.add(nursingOfficeLabel_1);

		notePortableXrayLabel_3 = new JLabel();
		notePortableXrayLabel_3.setForeground(new Color(255, 102, 102));
		notePortableXrayLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		notePortableXrayLabel_3.setText("PINK-");
		notePortableXrayLabel_3.setBounds(415, 22, 31, 14);
		panel_166.add(notePortableXrayLabel_3);

		nursingOfficeLabel_2 = new JLabel();
		nursingOfficeLabel_2.setForeground(new Color(255, 102, 102));
		nursingOfficeLabel_2.setText("FILE COPY *");
		nursingOfficeLabel_2.setBounds(452, 22, 68, 14);
		panel_166.add(nursingOfficeLabel_2);

		notePortableXrayLabel_4 = new JLabel();
		notePortableXrayLabel_4.setForeground(new Color(255, 102, 102));
		notePortableXrayLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		notePortableXrayLabel_4.setText("BLUE-");
		notePortableXrayLabel_4.setBounds(519, 22, 43, 14);
		panel_166.add(notePortableXrayLabel_4);

		nursingOfficeLabel_3 = new JLabel();
		nursingOfficeLabel_3.setForeground(new Color(255, 102, 102));
		nursingOfficeLabel_3.setText("NHF FINANCE DEPT. ");
		nursingOfficeLabel_3.setBounds(557, 22, 102, 14);
		panel_166.add(nursingOfficeLabel_3);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(0, 565, 805, 381);
		panel.add(panel_32);

		panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(208, 0, 38, 380);
		panel_32.add(panel_54);

		panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_55.setLayout(null);
		panel_55.setBackground(new Color(255, 102, 102));
		panel_55.setBounds(0, 0, 38, 22);
		panel_54.add(panel_55);

		icdTextArea_3 = new JTextArea();
		icdTextArea_3.setWrapStyleWord(true);
		icdTextArea_3.setText("CPT CODE");
		icdTextArea_3.setLineWrap(true);
		icdTextArea_3.setForeground(Color.WHITE);
		icdTextArea_3.setFont(new Font("Dialog", Font.PLAIN, 8));
		icdTextArea_3.setBackground(new Color(255, 102, 102));
		icdTextArea_3.setBounds(5, 1, 26, 20);
		panel_55.add(icdTextArea_3);

		label_7 = new JLabel();
		label_7.setForeground(new Color(255, 102, 102));
		label_7.setText("769.0");
		label_7.setBounds(3, 22, 39, 18);
		panel_54.add(label_7);

		label_8 = new JLabel();
		label_8.setForeground(new Color(255, 102, 102));
		label_8.setText("785.2");
		label_8.setBounds(3, 39, 39, 18);
		panel_54.add(label_8);

		label_9 = new JLabel();
		label_9.setForeground(new Color(255, 102, 102));
		label_9.setText("276.0");
		label_9.setBounds(3, 73, 39, 18);
		panel_54.add(label_9);

		label_11 = new JLabel();
		label_11.setForeground(new Color(255, 102, 102));
		label_11.setText("518.4");
		label_11.setBounds(3, 90, 39, 18);
		panel_54.add(label_11);

		label_12 = new JLabel();
		label_12.setForeground(new Color(255, 102, 102));
		label_12.setText("422.0");
		label_12.setBounds(3, 107, 38, 18);
		panel_54.add(label_12);

		label_10 = new JLabel();
		label_10.setForeground(new Color(255, 102, 102));
		label_10.setText("420.0");
		label_10.setBounds(3, 124, 38, 18);
		panel_54.add(label_10);

		label_29 = new JLabel();
		label_29.setForeground(new Color(255, 102, 102));
		label_29.setText("415.0");
		label_29.setBounds(3, 141, 38, 18);
		panel_54.add(label_29);

		label_59 = new JLabel();
		label_59.setForeground(new Color(255, 102, 102));
		label_59.setText("413.0");
		label_59.setBounds(3, 158, 38, 18);
		panel_54.add(label_59);

		label_60 = new JLabel();
		label_60.setForeground(new Color(255, 102, 102));
		label_60.setText("441.01");
		label_60.setBounds(3, 175, 38, 18);
		panel_54.add(label_60);

		label_61 = new JLabel();
		label_61.setForeground(new Color(255, 102, 102));
		label_61.setText("786.5");
		label_61.setBounds(3, 192, 38, 18);
		panel_54.add(label_61);

		label_62 = new JLabel();
		label_62.setForeground(new Color(255, 102, 102));
		label_62.setText("785.2");
		label_62.setBounds(3, 209, 38, 18);
		panel_54.add(label_62);

		label_63 = new JLabel();
		label_63.setForeground(new Color(255, 102, 102));
		label_63.setText("416.0");
		label_63.setBounds(3, 226, 38, 18);
		panel_54.add(label_63);

		label_64 = new JLabel();
		label_64.setForeground(new Color(255, 102, 102));
		label_64.setText("427.0");
		label_64.setBounds(3, 243, 38, 18);
		panel_54.add(label_64);

		label_65 = new JLabel();
		label_65.setForeground(new Color(255, 102, 102));
		label_65.setText("425.0");
		label_65.setBounds(3, 260, 38, 18);
		panel_54.add(label_65);

		label_66 = new JLabel();
		label_66.setForeground(new Color(255, 102, 102));
		label_66.setText("780.4");
		label_66.setBounds(3, 277, 38, 18);
		panel_54.add(label_66);

		label_67 = new JLabel();
		label_67.setForeground(new Color(255, 102, 102));
		label_67.setText("780.3");
		label_67.setBounds(3, 294, 38, 18);
		panel_54.add(label_67);

		label_68 = new JLabel();
		label_68.setForeground(new Color(255, 102, 102));
		label_68.setText("396.0");
		label_68.setBounds(3, 311, 38, 18);
		panel_54.add(label_68);

		label_69 = new JLabel();
		label_69.setForeground(new Color(255, 102, 102));
		label_69.setText("395.0");
		label_69.setBounds(3, 328, 38, 18);
		panel_54.add(label_69);

		label_70 = new JLabel();
		label_70.setForeground(new Color(255, 102, 102));
		label_70.setText("401.1");
		label_70.setBounds(3, 345, 38, 18);
		panel_54.add(label_70);

		panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_59.setLayout(null);
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(245, 0, 222, 380);
		panel_32.add(panel_59);

		panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_61.setLayout(null);
		panel_61.setBackground(new Color(255, 102, 102));
		panel_61.setBounds(0, 0, 222, 22);
		panel_59.add(panel_61);

		chestAndThoraxdLabel_3 = new JLabel();
		chestAndThoraxdLabel_3.setForeground(Color.WHITE);
		chestAndThoraxdLabel_3.setText("ULTRASOUNDS");
		chestAndThoraxdLabel_3.setBounds(28, 0, 113, 18);
		panel_61.add(chestAndThoraxdLabel_3);

		panel_64 = new JPanel();
		panel_64.setLayout(null);
		panel_64.setBackground(Color.WHITE);
		panel_64.setBounds(0, 22, 209, 18);
		panel_59.add(panel_64);

		chest1ViewLabel_31 = new JLabel();
		chest1ViewLabel_31.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_31.setText("Hypertensive Heart Disease");
		chest1ViewLabel_31.setBounds(28, 1, 136, 14);
		panel_64.add(chest1ViewLabel_31);

		cbUltrasoundsHypertensiveHeart = new JCheckBox();
		cbUltrasoundsHypertensiveHeart.setBackground(Color.WHITE);
		cbUltrasoundsHypertensiveHeart.setText("cbUpperShoulder");
		cbUltrasoundsHypertensiveHeart.setBounds(10, 1, 14, 16);
		panel_64.add(cbUltrasoundsHypertensiveHeart);

		panel_65 = new JPanel();
		panel_65.setLayout(null);
		panel_65.setBackground(Color.WHITE);
		panel_65.setBounds(0, 39, 209, 18);
		panel_59.add(panel_65);

		cbUltrasoundsMalignant = new JCheckBox();
		cbUltrasoundsMalignant.setBackground(Color.WHITE);
		cbUltrasoundsMalignant.setText("cbUpperShoulder");
		cbUltrasoundsMalignant.setBounds(10, 1, 14, 16);
		panel_65.add(cbUltrasoundsMalignant);

		chest1ViewLabel_94 = new JLabel();
		chest1ViewLabel_94.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_94.setText("Malignant Essential Hypertension");
		chest1ViewLabel_94.setBounds(28, 1, 174, 14);
		panel_65.add(chest1ViewLabel_94);

		panel_66 = new JPanel();
		panel_66.setLayout(null);
		panel_66.setBackground(Color.WHITE);
		panel_66.setBounds(0, 56, 209, 18);
		panel_59.add(panel_66);

		chest1ViewLabel_34 = new JLabel();
		chest1ViewLabel_34.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_34.setText("Heart Disease");
		chest1ViewLabel_34.setBounds(28, 1, 177, 14);
		panel_66.add(chest1ViewLabel_34);

		cbUltrasoundsHeartDisease = new JCheckBox();
		cbUltrasoundsHeartDisease.setBackground(Color.WHITE);
		cbUltrasoundsHeartDisease.setText("cbUpperScapula");
		cbUltrasoundsHeartDisease.setBounds(10, 1, 14, 16);
		panel_66.add(cbUltrasoundsHeartDisease);

		panel_68 = new JPanel();
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(0, 73, 209, 18);
		panel_59.add(panel_68);

		chest1ViewLabel_35 = new JLabel();
		chest1ViewLabel_35.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_35.setText("Hypotension");
		chest1ViewLabel_35.setBounds(28, 1, 127, 14);
		panel_68.add(chest1ViewLabel_35);

		cbUltrasoundsHypertension = new JCheckBox();
		cbUltrasoundsHypertension.setBackground(Color.WHITE);
		cbUltrasoundsHypertension.setText("New JCheckBox");
		cbUltrasoundsHypertension.setBounds(10, 1, 14, 16);
		panel_68.add(cbUltrasoundsHypertension);

		panel_69 = new JPanel();
		panel_69.setLayout(null);
		panel_69.setBackground(Color.WHITE);
		panel_69.setBounds(0, 90, 209, 18);
		panel_59.add(panel_69);

		chest1ViewLabel_36 = new JLabel();
		chest1ViewLabel_36.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_36.setText("Hypertensive Hrt & Renal Dis.");
		chest1ViewLabel_36.setBounds(28, 1, 143, 14);
		panel_69.add(chest1ViewLabel_36);

		cbUltrasoundsHypertensionHrt = new JCheckBox();
		cbUltrasoundsHypertensionHrt.setBackground(Color.WHITE);
		cbUltrasoundsHypertensionHrt.setText("New JCheckBox");
		cbUltrasoundsHypertensionHrt.setBounds(10, 1, 14, 16);
		panel_69.add(cbUltrasoundsHypertensionHrt);

		panel_82 = new JPanel();
		panel_82.setLayout(null);
		panel_82.setBackground(Color.WHITE);
		panel_82.setBounds(0, 107, 209, 18);
		panel_59.add(panel_82);

		chest1ViewLabel_37 = new JLabel();
		chest1ViewLabel_37.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_37.setText("Heart Failure");
		chest1ViewLabel_37.setBounds(28, 1, 160, 14);
		panel_82.add(chest1ViewLabel_37);

		cbUltrasoundsHeartFailure = new JCheckBox();
		cbUltrasoundsHeartFailure.setBackground(Color.WHITE);
		cbUltrasoundsHeartFailure.setText("New JCheckBox");
		cbUltrasoundsHeartFailure.setBounds(10, 1, 14, 16);
		panel_82.add(cbUltrasoundsHeartFailure);

		panel_83 = new JPanel();
		panel_83.setLayout(null);
		panel_83.setBackground(Color.WHITE);
		panel_83.setBounds(0, 124, 209, 18);
		panel_59.add(panel_83);

		chest1ViewLabel_38 = new JLabel();
		chest1ViewLabel_38.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_38.setText("Myocardial Infarction");
		chest1ViewLabel_38.setBounds(28, 1, 132, 14);
		panel_83.add(chest1ViewLabel_38);

		cbUltrasoundsMyocardial = new JCheckBox();
		cbUltrasoundsMyocardial.setBackground(Color.WHITE);
		cbUltrasoundsMyocardial.setText("New JCheckBox");
		cbUltrasoundsMyocardial.setBounds(10, 1, 14, 16);
		panel_83.add(cbUltrasoundsMyocardial);

		panel_84 = new JPanel();
		panel_84.setLayout(null);
		panel_84.setBackground(Color.WHITE);
		panel_84.setBounds(0, 141, 209, 18);
		panel_59.add(panel_84);

		chest1ViewLabel_39 = new JLabel();
		chest1ViewLabel_39.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_39.setText("Old Myocardial Infarction");
		chest1ViewLabel_39.setBounds(28, 1, 132, 14);
		panel_84.add(chest1ViewLabel_39);

		cbUltrasoundsOld = new JCheckBox();
		cbUltrasoundsOld.setBackground(Color.WHITE);
		cbUltrasoundsOld.setText("New JCheckBox");
		cbUltrasoundsOld.setBounds(10, 1, 14, 16);
		panel_84.add(cbUltrasoundsOld);

		panel_85 = new JPanel();
		panel_85.setLayout(null);
		panel_85.setBackground(Color.WHITE);
		panel_85.setBounds(0, 158, 209, 18);
		panel_59.add(panel_85);

		chest1ViewLabel_40 = new JLabel();
		chest1ViewLabel_40.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_40.setText("Myalgia and Myositis, Unspecified");
		chest1ViewLabel_40.setBounds(28, 1, 160, 14);
		panel_85.add(chest1ViewLabel_40);

		cbUltrasoundsMyalgia = new JCheckBox();
		cbUltrasoundsMyalgia.setBackground(Color.WHITE);
		cbUltrasoundsMyalgia.setText("New JCheckBox");
		cbUltrasoundsMyalgia.setBounds(10, 1, 14, 16);
		panel_85.add(cbUltrasoundsMyalgia);

		panel_87 = new JPanel();
		panel_87.setLayout(null);
		panel_87.setBackground(Color.WHITE);
		panel_87.setBounds(0, 175, 209, 35);
		panel_59.add(panel_87);

		cbUltrasoundsMalignantNeoplasm = new JCheckBox();
		cbUltrasoundsMalignantNeoplasm.setBackground(Color.WHITE);
		cbUltrasoundsMalignantNeoplasm.setText("New JCheckBox");
		cbUltrasoundsMalignantNeoplasm.setBounds(10, 1, 14, 16);
		panel_87.add(cbUltrasoundsMalignantNeoplasm);

		abnormalLabsfluidselectrolyteAndTextArea_1 = new JTextArea();
		abnormalLabsfluidselectrolyteAndTextArea_1.setWrapStyleWord(true);
		abnormalLabsfluidselectrolyteAndTextArea_1
				.setText("Malignant Neoplasm of Thymus, Heart and Mediastinum");
		abnormalLabsfluidselectrolyteAndTextArea_1.setLineWrap(true);
		abnormalLabsfluidselectrolyteAndTextArea_1.setForeground(new Color(255,
				102, 102));
		abnormalLabsfluidselectrolyteAndTextArea_1.setBounds(28, 1, 168, 33);
		panel_87.add(abnormalLabsfluidselectrolyteAndTextArea_1);

		panel_116 = new JPanel();
		panel_116.setLayout(null);
		panel_116.setBackground(Color.WHITE);
		panel_116.setBounds(0, 209, 209, 18);
		panel_59.add(panel_116);

		chest1ViewLabel_65 = new JLabel();
		chest1ViewLabel_65.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_65.setText("Palpitations");
		chest1ViewLabel_65.setBounds(28, 1, 80, 14);
		panel_116.add(chest1ViewLabel_65);

		cbUltrasoundsPalpitations = new JCheckBox();
		cbUltrasoundsPalpitations.setBackground(Color.WHITE);
		cbUltrasoundsPalpitations.setText("New JCheckBox");
		cbUltrasoundsPalpitations.setBounds(10, 1, 14, 16);
		panel_116.add(cbUltrasoundsPalpitations);

		panel_117 = new JPanel();
		panel_117.setLayout(null);
		panel_117.setBackground(Color.WHITE);
		panel_117.setBounds(0, 226, 209, 18);
		panel_59.add(panel_117);

		chest1ViewLabel_66 = new JLabel();
		chest1ViewLabel_66.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_66.setText("Pain in Limb");
		chest1ViewLabel_66.setBounds(28, 1, 80, 14);
		panel_117.add(chest1ViewLabel_66);

		cbUltrasoundsPain = new JCheckBox();
		cbUltrasoundsPain.setBackground(Color.WHITE);
		cbUltrasoundsPain.setText("New JCheckBox");
		cbUltrasoundsPain.setBounds(10, 1, 14, 16);
		panel_117.add(cbUltrasoundsPain);

		panel_119 = new JPanel();
		panel_119.setLayout(null);
		panel_119.setBackground(Color.WHITE);
		panel_119.setBounds(0, 243, 209, 18);
		panel_59.add(panel_119);

		chest1ViewLabel_68 = new JLabel();
		chest1ViewLabel_68.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_68.setText("Respiratory Failure");
		chest1ViewLabel_68.setBounds(28, 1, 119, 14);
		panel_119.add(chest1ViewLabel_68);

		cbUltrasoundsResptryFail = new JCheckBox();
		cbUltrasoundsResptryFail.setBackground(Color.WHITE);
		cbUltrasoundsResptryFail.setText("New JCheckBox");
		cbUltrasoundsResptryFail.setBounds(10, 1, 14, 16);
		panel_119.add(cbUltrasoundsResptryFail);

		panel_120 = new JPanel();
		panel_120.setLayout(null);
		panel_120.setBackground(Color.WHITE);
		panel_120.setBounds(0, 260, 209, 18);
		panel_59.add(panel_120);

		chest1ViewLabel_69 = new JLabel();
		chest1ViewLabel_69.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_69.setText("Chronic Rheumatic Pericarditis");
		chest1ViewLabel_69.setBounds(28, 1, 144, 14);
		panel_120.add(chest1ViewLabel_69);

		cbUltrasoundsChronic = new JCheckBox();
		cbUltrasoundsChronic.setBackground(Color.WHITE);
		cbUltrasoundsChronic.setText("New JCheckBox");
		cbUltrasoundsChronic.setBounds(10, 1, 14, 16);
		panel_120.add(cbUltrasoundsChronic);

		panel_121 = new JPanel();
		panel_121.setLayout(null);
		panel_121.setBackground(Color.WHITE);
		panel_121.setBounds(0, 277, 219, 18);
		panel_59.add(panel_121);

		chest1ViewLabel_70 = new JLabel();
		chest1ViewLabel_70.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_70.setText("Rheumatic Fever w/ Heart Involvement");
		chest1ViewLabel_70.setBounds(28, 1, 190, 14);
		panel_121.add(chest1ViewLabel_70);

		cbUltrasoundsRheumatic = new JCheckBox();
		cbUltrasoundsRheumatic.setBackground(Color.WHITE);
		cbUltrasoundsRheumatic.setText("New JCheckBox");
		cbUltrasoundsRheumatic.setBounds(10, 1, 14, 16);
		panel_121.add(cbUltrasoundsRheumatic);

		panel_122 = new JPanel();
		panel_122.setLayout(null);
		panel_122.setBackground(Color.WHITE);
		panel_122.setBounds(0, 294, 209, 18);
		panel_59.add(panel_122);

		chest1ViewLabel_71 = new JLabel();
		chest1ViewLabel_71.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_71.setText("Respiratory Distress Syndrome ");
		chest1ViewLabel_71.setBounds(28, 1, 166, 14);
		panel_122.add(chest1ViewLabel_71);

		cbUltrasoundsResptryDistress = new JCheckBox();
		cbUltrasoundsResptryDistress.setBackground(Color.WHITE);
		cbUltrasoundsResptryDistress.setText("New JCheckBox");
		cbUltrasoundsResptryDistress.setBounds(10, 1, 14, 16);
		panel_122.add(cbUltrasoundsResptryDistress);

		panel_123 = new JPanel();
		panel_123.setLayout(null);
		panel_123.setBackground(Color.WHITE);
		panel_123.setBounds(0, 311, 209, 18);
		panel_59.add(panel_123);

		chest1ViewLabel_72 = new JLabel();
		chest1ViewLabel_72.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_72.setText("Respiratory Arrest ");
		chest1ViewLabel_72.setBounds(28, 1, 115, 14);
		panel_123.add(chest1ViewLabel_72);

		cbUltrasoundsResptryArrest = new JCheckBox();
		cbUltrasoundsResptryArrest.setBackground(Color.WHITE);
		cbUltrasoundsResptryArrest.setText("New JCheckBox");
		cbUltrasoundsResptryArrest.setBounds(10, 1, 14, 16);
		panel_123.add(cbUltrasoundsResptryArrest);

		panel_124 = new JPanel();
		panel_124.setLayout(null);
		panel_124.setBackground(Color.WHITE);
		panel_124.setBounds(0, 328, 209, 18);
		panel_59.add(panel_124);

		chest1ViewLabel_73 = new JLabel();
		chest1ViewLabel_73.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_73.setText("Syncope");
		chest1ViewLabel_73.setBounds(28, 1, 80, 14);
		panel_124.add(chest1ViewLabel_73);

		cbUltrasoundsSyncope = new JCheckBox();
		cbUltrasoundsSyncope.setBackground(Color.WHITE);
		cbUltrasoundsSyncope.setText("New JCheckBox");
		cbUltrasoundsSyncope.setBounds(10, 1, 14, 16);
		panel_124.add(cbUltrasoundsSyncope);

		panel_125 = new JPanel();
		panel_125.setLayout(null);
		panel_125.setBackground(Color.WHITE);
		panel_125.setBounds(0, 345, 209, 18);
		panel_59.add(panel_125);

		chest1ViewLabel_74 = new JLabel();
		chest1ViewLabel_74.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_74.setText("Techycardia");
		chest1ViewLabel_74.setBounds(28, 1, 80, 14);
		panel_125.add(chest1ViewLabel_74);

		cbUltrasoundsTechycardia = new JCheckBox();
		cbUltrasoundsTechycardia.setBackground(Color.WHITE);
		cbUltrasoundsTechycardia.setText("New JCheckBox");
		cbUltrasoundsTechycardia.setBounds(10, 1, 14, 16);
		panel_125.add(cbUltrasoundsTechycardia);

		panel_126 = new JPanel();
		panel_126.setLayout(null);
		panel_126.setBackground(Color.WHITE);
		panel_126.setBounds(0, 362, 209, 18);
		panel_59.add(panel_126);

		chest1ViewLabel_75 = new JLabel();
		chest1ViewLabel_75.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_75.setText("Throat Pain");
		chest1ViewLabel_75.setBounds(28, 1, 80, 14);
		panel_126.add(chest1ViewLabel_75);

		cbUltrasoundsThroat = new JCheckBox();
		cbUltrasoundsThroat.setBackground(Color.WHITE);
		cbUltrasoundsThroat.setText("New JCheckBox");
		cbUltrasoundsThroat.setBounds(10, 1, 14, 16);
		panel_126.add(cbUltrasoundsThroat);

		panel_88 = new JPanel();
		panel_88.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_88.setLayout(null);
		panel_88.setBackground(Color.WHITE);
		panel_88.setBounds(466, 0, 42, 380);
		panel_32.add(panel_88);

		panel_89 = new JPanel();
		panel_89.setLayout(null);
		panel_89.setBackground(new Color(255, 102, 102));
		panel_89.setBounds(0, 0, 45, 22);
		panel_88.add(panel_89);

		icdTextArea_4 = new JTextArea();
		icdTextArea_4.setWrapStyleWord(true);
		icdTextArea_4.setText("CPT CODE");
		icdTextArea_4.setLineWrap(true);
		icdTextArea_4.setForeground(Color.WHITE);
		icdTextArea_4.setFont(new Font("Dialog", Font.BOLD, 8));
		icdTextArea_4.setBackground(new Color(255, 102, 102));
		icdTextArea_4.setBounds(0, 1, 35, 20);
		panel_89.add(icdTextArea_4);

		label_13 = new JLabel();
		label_13.setForeground(new Color(255, 102, 102));
		label_13.setText("402.0");
		label_13.setBounds(3, 22, 45, 18);
		panel_88.add(label_13);

		label_22 = new JLabel();
		label_22.setForeground(new Color(255, 102, 102));
		label_22.setText("401.0");
		label_22.setBounds(3, 39, 45, 18);
		panel_88.add(label_22);

		label_24 = new JLabel();
		label_24.setForeground(new Color(255, 102, 102));
		label_24.setText("729.5");
		label_24.setBounds(3, 56, 45, 18);
		panel_88.add(label_24);

		label_25 = new JLabel();
		label_25.setForeground(new Color(255, 102, 102));
		label_25.setText("458.0");
		label_25.setBounds(3, 73, 45, 18);
		panel_88.add(label_25);

		label_26 = new JLabel();
		label_26.setForeground(new Color(255, 102, 102));
		label_26.setText("404.0");
		label_26.setBounds(3, 90, 45, 18);
		panel_88.add(label_26);

		label_34 = new JLabel();
		label_34.setForeground(new Color(255, 102, 102));
		label_34.setText("428.0");
		label_34.setBounds(3, 107, 45, 18);
		panel_88.add(label_34);

		label_35 = new JLabel();
		label_35.setForeground(new Color(255, 102, 102));
		label_35.setText("410.0");
		label_35.setBounds(3, 124, 45, 18);
		panel_88.add(label_35);

		label_36 = new JLabel();
		label_36.setForeground(new Color(255, 102, 102));
		label_36.setText("412.0");
		label_36.setBounds(3, 141, 45, 18);
		panel_88.add(label_36);

		label_37 = new JLabel();
		label_37.setForeground(new Color(255, 102, 102));
		label_37.setText("164.0");
		label_37.setBounds(3, 185, 45, 18);
		panel_88.add(label_37);

		label_38 = new JLabel();
		label_38.setForeground(new Color(255, 102, 102));
		label_38.setText("729.1");
		label_38.setBounds(3, 158, 45, 18);
		panel_88.add(label_38);

		label_72 = new JLabel();
		label_72.setForeground(new Color(255, 102, 102));
		label_72.setText("785.1");
		label_72.setBounds(3, 209, 45, 18);
		panel_88.add(label_72);

		label_73 = new JLabel();
		label_73.setForeground(new Color(255, 102, 102));
		label_73.setText("729.5");
		label_73.setBounds(3, 226, 45, 18);
		panel_88.add(label_73);

		label_74 = new JLabel();
		label_74.setForeground(new Color(255, 102, 102));
		label_74.setText("518.81");
		label_74.setBounds(3, 243, 45, 18);
		panel_88.add(label_74);

		label_75 = new JLabel();
		label_75.setForeground(new Color(255, 102, 102));
		label_75.setText("393.0");
		label_75.setBounds(3, 260, 45, 18);
		panel_88.add(label_75);

		label_76 = new JLabel();
		label_76.setForeground(new Color(255, 102, 102));
		label_76.setText("391.0");
		label_76.setBounds(3, 277, 45, 18);
		panel_88.add(label_76);

		label_77 = new JLabel();
		label_77.setForeground(new Color(255, 102, 102));
		label_77.setText("769.0");
		label_77.setBounds(3, 294, 45, 18);
		panel_88.add(label_77);

		label_78 = new JLabel();
		label_78.setForeground(new Color(255, 102, 102));
		label_78.setText("799.1");
		label_78.setBounds(3, 311, 45, 18);
		panel_88.add(label_78);

		label_79 = new JLabel();
		label_79.setForeground(new Color(255, 102, 102));
		label_79.setText("780.2");
		label_79.setBounds(3, 328, 45, 18);
		panel_88.add(label_79);

		label_80 = new JLabel();
		label_80.setForeground(new Color(255, 102, 102));
		label_80.setText("785.0");
		label_80.setBounds(3, 345, 45, 18);
		panel_88.add(label_80);

		label_81 = new JLabel();
		label_81.setForeground(new Color(255, 102, 102));
		label_81.setText("784.1");
		label_81.setBounds(3, 362, 45, 18);
		panel_88.add(label_81);

		panel_90 = new JPanel();
		panel_90.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_90.setLayout(null);
		panel_90.setBackground(Color.WHITE);
		panel_90.setBounds(506, 0, 299, 380);
		panel_32.add(panel_90);

		panel_91 = new JPanel();
		panel_91.setLayout(null);
		panel_91.setBackground(new Color(255, 102, 102));
		panel_91.setBounds(0, 0, 251, 22);
		panel_90.add(panel_91);

		chestAndThoraxdLabel_5 = new JLabel();
		chestAndThoraxdLabel_5.setForeground(Color.WHITE);
		chestAndThoraxdLabel_5.setText("ULTRASOUNDS");
		chestAndThoraxdLabel_5.setBounds(28, 0, 113, 18);
		panel_91.add(chestAndThoraxdLabel_5);

		panel_93 = new JPanel();
		panel_93.setLayout(null);
		panel_93.setBackground(Color.WHITE);
		panel_93.setBounds(0, 22, 245, 18);
		panel_90.add(panel_93);

		chest1ViewLabel_42 = new JLabel();
		chest1ViewLabel_42.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_42.setFont(new Font("", Font.BOLD, 11));
		chest1ViewLabel_42.setText("ABDOMINAL (RETROPERITONEAL OR RENAL) ");
		chest1ViewLabel_42.setBounds(2, 1, 243, 14);
		panel_93.add(chest1ViewLabel_42);

		panel_94 = new JPanel();
		panel_94.setLayout(null);
		panel_94.setBackground(Color.WHITE);
		panel_94.setBounds(0, 39, 245, 18);
		panel_90.add(panel_94);

		cbUltraABDAcute = new JCheckBox();
		cbUltraABDAcute.setBackground(Color.WHITE);
		cbUltraABDAcute.setText("cbUpperScapula");
		cbUltraABDAcute.setBounds(12, 1, 14, 16);
		panel_94.add(cbUltraABDAcute);

		chest1ViewLabel_64 = new JLabel();
		chest1ViewLabel_64.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_64.setText("Acute Renal Failure");
		chest1ViewLabel_64.setBounds(30, 1, 180, 14);
		panel_94.add(chest1ViewLabel_64);

		panel_95 = new JPanel();
		panel_95.setLayout(null);
		panel_95.setBackground(Color.WHITE);
		panel_95.setBounds(0, 56, 245, 18);
		panel_90.add(panel_95);

		chest1ViewLabel_43 = new JLabel();
		chest1ViewLabel_43.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_43.setText("Aortic Aneurysm & Dissection");
		chest1ViewLabel_43.setBounds(30, 1, 180, 14);
		panel_95.add(chest1ViewLabel_43);

		cbUltraABDAortic = new JCheckBox();
		cbUltraABDAortic.setBackground(Color.WHITE);
		cbUltraABDAortic.setText("cbUpperScapula");
		cbUltraABDAortic.setBounds(12, 1, 14, 16);
		panel_95.add(cbUltraABDAortic);

		panel_96 = new JPanel();
		panel_96.setLayout(null);
		panel_96.setBackground(Color.WHITE);
		panel_96.setBounds(0, 73, 245, 18);
		panel_90.add(panel_96);

		chest1ViewLabel_44 = new JLabel();
		chest1ViewLabel_44.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_44.setText("Chronic Renal Failure ");
		chest1ViewLabel_44.setBounds(30, 1, 127, 14);
		panel_96.add(chest1ViewLabel_44);

		cbUltraABDChronic = new JCheckBox();
		cbUltraABDChronic.setBackground(Color.WHITE);
		cbUltraABDChronic.setText("New JCheckBox");
		cbUltraABDChronic.setBounds(12, 1, 14, 16);
		panel_96.add(cbUltraABDChronic);

		panel_97 = new JPanel();
		panel_97.setLayout(null);
		panel_97.setBackground(Color.WHITE);
		panel_97.setBounds(0, 108, 245, 18);
		panel_90.add(panel_97);

		chest1ViewLabel_45 = new JLabel();
		chest1ViewLabel_45.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_45.setText("ABD Aneurysm Without Rupture ");
		chest1ViewLabel_45.setBounds(30, 1, 169, 14);
		panel_97.add(chest1ViewLabel_45);

		cbUltraABDRupture = new JCheckBox();
		cbUltraABDRupture.setBackground(Color.WHITE);
		cbUltraABDRupture.setText("New JCheckBox");
		cbUltraABDRupture.setBounds(12, 1, 14, 16);
		panel_97.add(cbUltraABDRupture);

		panel_98 = new JPanel();
		panel_98.setLayout(null);
		panel_98.setBackground(Color.WHITE);
		panel_98.setBounds(0, 124, 245, 18);
		panel_90.add(panel_98);

		chest1ViewLabel_46 = new JLabel();
		chest1ViewLabel_46.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_46.setText("Ascites");
		chest1ViewLabel_46.setBounds(30, 1, 160, 14);
		panel_98.add(chest1ViewLabel_46);

		cbUltraABDAscites = new JCheckBox();
		cbUltraABDAscites.setBackground(Color.WHITE);
		cbUltraABDAscites.setText("New JCheckBox");
		cbUltraABDAscites.setBounds(12, 1, 14, 16);
		panel_98.add(cbUltraABDAscites);

		panel_99 = new JPanel();
		panel_99.setLayout(null);
		panel_99.setBackground(Color.WHITE);
		panel_99.setBounds(0, 141, 245, 18);
		panel_90.add(panel_99);

		chest1ViewLabel_47 = new JLabel();
		chest1ViewLabel_47.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_47.setText("ABD Swelling Generalized");
		chest1ViewLabel_47.setBounds(30, 1, 132, 14);
		panel_99.add(chest1ViewLabel_47);

		cbUltraABDSwelling = new JCheckBox();
		cbUltraABDSwelling.setBackground(Color.WHITE);
		cbUltraABDSwelling.setText("New JCheckBox");
		cbUltraABDSwelling.setBounds(12, 1, 14, 16);
		panel_99.add(cbUltraABDSwelling);

		panel_100 = new JPanel();
		panel_100.setLayout(null);
		panel_100.setBackground(Color.WHITE);
		panel_100.setBounds(0, 158, 245, 18);
		panel_90.add(panel_100);

		chest1ViewLabel_48 = new JLabel();
		chest1ViewLabel_48.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_48.setText("ABD Liver Scan");
		chest1ViewLabel_48.setBounds(30, 1, 132, 14);
		panel_100.add(chest1ViewLabel_48);

		cbUltraABDLiver = new JCheckBox();
		cbUltraABDLiver.setBackground(Color.WHITE);
		cbUltraABDLiver.setText("New JCheckBox");
		cbUltraABDLiver.setBounds(12, 1, 14, 16);
		panel_100.add(cbUltraABDLiver);

		panel_101 = new JPanel();
		panel_101.setLayout(null);
		panel_101.setBackground(Color.WHITE);
		panel_101.setBounds(0, 176, 245, 18);
		panel_90.add(panel_101);

		chest1ViewLabel_49 = new JLabel();
		chest1ViewLabel_49.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_49.setText("Benign Neoplasm of Urinary Organ Unspecfd");
		chest1ViewLabel_49.setBounds(30, 1, 213, 14);
		panel_101.add(chest1ViewLabel_49);

		cbUltraABDBenign = new JCheckBox();
		cbUltraABDBenign.setForeground(new Color(255, 102, 102));
		cbUltraABDBenign.setBackground(Color.WHITE);
		cbUltraABDBenign.setText("New JCheckBox");
		cbUltraABDBenign.setBounds(12, 1, 14, 16);
		panel_101.add(cbUltraABDBenign);

		panel_127 = new JPanel();
		panel_127.setLayout(null);
		panel_127.setBackground(Color.WHITE);
		panel_127.setBounds(0, 193, 245, 18);
		panel_90.add(panel_127);

		chest1ViewLabel_50 = new JLabel();
		chest1ViewLabel_50.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_50.setText("Cholelithiasis");
		chest1ViewLabel_50.setBounds(30, 1, 80, 14);
		panel_127.add(chest1ViewLabel_50);

		cbUltraABDCholelith = new JCheckBox();
		cbUltraABDCholelith.setBackground(Color.WHITE);
		cbUltraABDCholelith.setText("New JCheckBox");
		cbUltraABDCholelith.setBounds(12, 1, 14, 16);
		panel_127.add(cbUltraABDCholelith);

		panel_128 = new JPanel();
		panel_128.setLayout(null);
		panel_128.setBackground(Color.WHITE);
		panel_128.setBounds(0, 209, 245, 18);
		panel_90.add(panel_128);

		chest1ViewLabel_51 = new JLabel();
		chest1ViewLabel_51.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_51.setText("Cyst of Kidney");
		chest1ViewLabel_51.setBounds(30, 1, 80, 14);
		panel_128.add(chest1ViewLabel_51);

		cbUltraABDCyst = new JCheckBox();
		cbUltraABDCyst.setBackground(Color.WHITE);
		cbUltraABDCyst.setText("New JCheckBox");
		cbUltraABDCyst.setBounds(12, 1, 14, 16);
		panel_128.add(cbUltraABDCyst);

		panel_129 = new JPanel();
		panel_129.setLayout(null);
		panel_129.setBackground(Color.WHITE);
		panel_129.setBounds(0, 226, 245, 18);
		panel_90.add(panel_129);

		chest1ViewLabel_76 = new JLabel();
		chest1ViewLabel_76.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_76.setText("Hydonephrosis");
		chest1ViewLabel_76.setBounds(30, 1, 80, 14);
		panel_129.add(chest1ViewLabel_76);

		cbUltraABDHydonephrosis = new JCheckBox();
		cbUltraABDHydonephrosis.setBackground(Color.WHITE);
		cbUltraABDHydonephrosis.setText("New JCheckBox");
		cbUltraABDHydonephrosis.setBounds(12, 1, 14, 16);
		panel_129.add(cbUltraABDHydonephrosis);

		panel_130 = new JPanel();
		panel_130.setLayout(null);
		panel_130.setBackground(Color.WHITE);
		panel_130.setBounds(0, 243, 245, 18);
		panel_90.add(panel_130);

		chest1ViewLabel_77 = new JLabel();
		chest1ViewLabel_77.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_77.setText("Jaundice Unspecified");
		chest1ViewLabel_77.setBounds(30, 1, 111, 14);
		panel_130.add(chest1ViewLabel_77);

		cbUltraABDJaundice = new JCheckBox();
		cbUltraABDJaundice.setBackground(Color.WHITE);
		cbUltraABDJaundice.setText("New JCheckBox");
		cbUltraABDJaundice.setBounds(12, 1, 14, 16);
		panel_130.add(cbUltraABDJaundice);

		panel_132 = new JPanel();
		panel_132.setLayout(null);
		panel_132.setBackground(Color.WHITE);
		panel_132.setBounds(0, 260, 245, 18);
		panel_90.add(panel_132);

		chest1ViewLabel_79 = new JLabel();
		chest1ViewLabel_79.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_79.setText("Kidney Calculus");
		chest1ViewLabel_79.setBounds(30, 1, 80, 14);
		panel_132.add(chest1ViewLabel_79);

		cbUltraABDKidneyCal = new JCheckBox();
		cbUltraABDKidneyCal.setBackground(Color.WHITE);
		cbUltraABDKidneyCal.setText("New JCheckBox");
		cbUltraABDKidneyCal.setBounds(12, 1, 14, 16);
		panel_132.add(cbUltraABDKidneyCal);

		panel_133 = new JPanel();
		panel_133.setLayout(null);
		panel_133.setBackground(Color.WHITE);
		panel_133.setBounds(0, 277, 245, 18);
		panel_90.add(panel_133);

		chest1ViewLabel_80 = new JLabel();
		chest1ViewLabel_80.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_80.setText("Kidney Infection");
		chest1ViewLabel_80.setBounds(30, 1, 80, 14);
		panel_133.add(chest1ViewLabel_80);

		cbUltraABDKidneyInfac = new JCheckBox();
		cbUltraABDKidneyInfac.setBackground(Color.WHITE);
		cbUltraABDKidneyInfac.setText("New JCheckBox");
		cbUltraABDKidneyInfac.setBounds(12, 1, 14, 16);
		panel_133.add(cbUltraABDKidneyInfac);

		panel_134 = new JPanel();
		panel_134.setLayout(null);
		panel_134.setBackground(Color.WHITE);
		panel_134.setBounds(0, 294, 245, 18);
		panel_90.add(panel_134);

		chest1ViewLabel_81 = new JLabel();
		chest1ViewLabel_81.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_81.setText("Liver Disease");
		chest1ViewLabel_81.setBounds(30, 1, 80, 14);
		panel_134.add(chest1ViewLabel_81);

		cbUltraABDLiverDisease = new JCheckBox();
		cbUltraABDLiverDisease.setBackground(Color.WHITE);
		cbUltraABDLiverDisease.setText("New JCheckBox");
		cbUltraABDLiverDisease.setBounds(12, 1, 14, 16);
		panel_134.add(cbUltraABDLiverDisease);

		panel_135 = new JPanel();
		panel_135.setLayout(null);
		panel_135.setBackground(Color.WHITE);
		panel_135.setBounds(0, 311, 245, 18);
		panel_90.add(panel_135);

		chest1ViewLabel_82 = new JLabel();
		chest1ViewLabel_82.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_82.setText("Malignant Neoplasm Pancreas Part Unspcfd");
		chest1ViewLabel_82.setBounds(30, 1, 213, 14);
		panel_135.add(chest1ViewLabel_82);

		cbUltraABDMalPancreas = new JCheckBox();
		cbUltraABDMalPancreas.setBackground(Color.WHITE);
		cbUltraABDMalPancreas.setText("New JCheckBox");
		cbUltraABDMalPancreas.setBounds(12, 1, 14, 16);
		panel_135.add(cbUltraABDMalPancreas);

		panel_136 = new JPanel();
		panel_136.setLayout(null);
		panel_136.setBackground(Color.WHITE);
		panel_136.setBounds(0, 330, 245, 36);
		panel_90.add(panel_136);

		cbUltraABDMalIntestinal = new JCheckBox();
		cbUltraABDMalIntestinal.setBackground(Color.WHITE);
		cbUltraABDMalIntestinal.setText("New JCheckBox");
		cbUltraABDMalIntestinal.setBounds(12, 1, 14, 16);
		panel_136.add(cbUltraABDMalIntestinal);

		malignantNeoplasmOfTextArea = new JTextArea();
		malignantNeoplasmOfTextArea.setWrapStyleWord(true);
		malignantNeoplasmOfTextArea.setForeground(new Color(255, 102, 102));
		malignantNeoplasmOfTextArea.setLineWrap(true);
		malignantNeoplasmOfTextArea
				.setText("Malignant Neoplasm of Intestinal Tract, Part Unspecified");
		malignantNeoplasmOfTextArea.setBounds(30, 1, 201, 36);
		panel_136.add(malignantNeoplasmOfTextArea);

		panel_118 = new JPanel();
		panel_118.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_118.setLayout(null);
		panel_118.setBackground(Color.WHITE);
		panel_118.setBounds(250, 0, 49, 380);
		panel_90.add(panel_118);

		panel_140 = new JPanel();
		panel_140.setLayout(null);
		panel_140.setBackground(new Color(255, 102, 102));
		panel_140.setBounds(0, 0, 50, 22);
		panel_118.add(panel_140);

		icdTextArea_5 = new JTextArea();
		icdTextArea_5.setWrapStyleWord(true);
		icdTextArea_5.setText("CPT CODE");
		icdTextArea_5.setLineWrap(true);
		icdTextArea_5.setForeground(Color.WHITE);
		icdTextArea_5.setFont(new Font("Dialog", Font.BOLD, 8));
		icdTextArea_5.setBackground(new Color(255, 102, 102));
		icdTextArea_5.setBounds(3, 1, 35, 20);
		panel_140.add(icdTextArea_5);

		label_40 = new JLabel();
		label_40.setForeground(new Color(255, 102, 102));
		label_40.setText("584.5");
		label_40.setBounds(3, 39, 40, 18);
		panel_118.add(label_40);

		label_41 = new JLabel();
		label_41.setForeground(new Color(255, 102, 102));
		label_41.setText("441.02");
		label_41.setBounds(3, 56, 40, 18);
		panel_118.add(label_41);

		label_42 = new JLabel();
		label_42.setForeground(new Color(255, 102, 102));
		label_42.setText("585.0");
		label_42.setBounds(3, 73, 40, 18);
		panel_118.add(label_42);

		label_43 = new JLabel();
		label_43.setForeground(new Color(255, 102, 102));
		label_43.setText("441.3");
		label_43.setBounds(3, 90, 40, 18);
		panel_118.add(label_43);

		label_44 = new JLabel();
		label_44.setForeground(new Color(255, 102, 102));
		label_44.setText("441.4");
		label_44.setBounds(3, 107, 40, 18);
		panel_118.add(label_44);

		label_45 = new JLabel();
		label_45.setForeground(new Color(255, 102, 102));
		label_45.setText("789.5");
		label_45.setBounds(3, 124, 40, 18);
		panel_118.add(label_45);

		label_46 = new JLabel();
		label_46.setForeground(new Color(255, 102, 102));
		label_46.setText("789.37");
		label_46.setBounds(3, 141, 40, 18);
		panel_118.add(label_46);

		label_47 = new JLabel();
		label_47.setForeground(new Color(255, 102, 102));
		label_47.setText("223.9");
		label_47.setBounds(3, 175, 40, 18);
		panel_118.add(label_47);

		label_48 = new JLabel();
		label_48.setForeground(new Color(255, 102, 102));
		label_48.setText("794.8");
		label_48.setBounds(3, 158, 40, 18);
		panel_118.add(label_48);

		label_49 = new JLabel();
		label_49.setForeground(new Color(255, 102, 102));
		label_49.setText("574.2");
		label_49.setBounds(3, 192, 40, 18);
		panel_118.add(label_49);

		label_50 = new JLabel();
		label_50.setForeground(new Color(255, 102, 102));
		label_50.setText("593.2");
		label_50.setBounds(3, 209, 40, 18);
		panel_118.add(label_50);

		label_51 = new JLabel();
		label_51.setForeground(new Color(255, 102, 102));
		label_51.setText("591.0");
		label_51.setBounds(3, 226, 40, 18);
		panel_118.add(label_51);

		label_52 = new JLabel();
		label_52.setForeground(new Color(255, 102, 102));
		label_52.setText("782.4");
		label_52.setBounds(3, 243, 40, 18);
		panel_118.add(label_52);

		label_53 = new JLabel();
		label_53.setForeground(new Color(255, 102, 102));
		label_53.setText("592.0");
		label_53.setBounds(3, 260, 40, 18);
		panel_118.add(label_53);

		label_54 = new JLabel();
		label_54.setForeground(new Color(255, 102, 102));
		label_54.setText("590.9");
		label_54.setBounds(3, 277, 40, 18);
		panel_118.add(label_54);

		label_55 = new JLabel();
		label_55.setForeground(new Color(255, 102, 102));
		label_55.setText("573.8");
		label_55.setBounds(3, 294, 40, 18);
		panel_118.add(label_55);

		label_57 = new JLabel();
		label_57.setForeground(new Color(255, 102, 102));
		label_57.setText("159.1");
		label_57.setBounds(3, 340, 40, 18);
		panel_118.add(label_57);

		label_39 = new JLabel();
		label_39.setForeground(new Color(255, 102, 102));
		label_39.setText("157.9");
		label_39.setBounds(3, 311, 40, 18);
		panel_118.add(label_39);

		chest1ViewLabel_41 = new JLabel();
		chest1ViewLabel_41.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_41.setText("Continued on reverse");
		chest1ViewLabel_41.setBounds(54, 366, 104, 14);
		panel_90.add(chest1ViewLabel_41);

		panel_115 = new JPanel();
		panel_115.setLayout(null);
		panel_115.setBackground(Color.WHITE);
		panel_115.setBounds(0, 90, 245, 18);
		panel_90.add(panel_115);

		chest1ViewLabel_78 = new JLabel();
		chest1ViewLabel_78.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_78.setText("ABD Aneurysm Rupture ");
		chest1ViewLabel_78.setBounds(30, 1, 169, 14);
		panel_115.add(chest1ViewLabel_78);

		cbUltraABDAbd = new JCheckBox();
		cbUltraABDAbd.setBackground(Color.WHITE);
		cbUltraABDAbd.setText("New JCheckBox");
		cbUltraABDAbd.setBounds(12, 1, 14, 16);
		panel_115.add(cbUltraABDAbd);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(0, 0, 210, 380);
		panel_32.add(panel_35);

		panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(new Color(255, 102, 102), 1, false));
		panel_36.setLayout(null);
		panel_36.setBackground(new Color(255, 102, 102));
		panel_36.setBounds(0, 0, 210, 22);
		panel_35.add(panel_36);

		chestAndThoraxdLabel_1 = new JLabel();
		chestAndThoraxdLabel_1.setForeground(Color.WHITE);
		chestAndThoraxdLabel_1.setText("CARDIOLOGICAL SERVICES");
		chestAndThoraxdLabel_1.setBounds(28, 0, 144, 18);
		panel_36.add(chestAndThoraxdLabel_1);

		panel_37 = new JPanel();
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(1, 22, 206, 18);
		panel_35.add(panel_37);

		chest1ViewLabel_12 = new JLabel();
		chest1ViewLabel_12.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel_12.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_12.setBackground(Color.WHITE);
		chest1ViewLabel_12.setText("Abdominal Pain");
		chest1ViewLabel_12.setBounds(32, 1, 72, 14);
		panel_37.add(chest1ViewLabel_12);

		cbCardioAbdominalPain = new JCheckBox();
		cbCardioAbdominalPain.setBackground(Color.WHITE);
		cbCardioAbdominalPain.setText("cbChestAndThoraxChest");
		cbCardioAbdominalPain.setBounds(12, 1, 14, 16);
		panel_37.add(cbCardioAbdominalPain);

		panel_38 = new JPanel();
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(1, 39, 206, 18);
		panel_35.add(panel_38);

		chest1ViewLabel_22 = new JLabel();
		chest1ViewLabel_22.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_22.setText("Abnormal Heart Sounds");
		chest1ViewLabel_22.setBounds(32, 1, 143, 14);
		panel_38.add(chest1ViewLabel_22);

		cbCardioAbdominalHeart = new JCheckBox();
		cbCardioAbdominalHeart.setBackground(Color.WHITE);
		cbCardioAbdominalHeart.setText("cbChestAndThoraxChestAPL");
		cbCardioAbdominalHeart.setBounds(12, 1, 14, 16);
		panel_38.add(cbCardioAbdominalHeart);

		panel_50 = new JPanel();
		panel_50.setLayout(null);
		panel_50.setBackground(Color.WHITE);
		panel_50.setBounds(1, 56, 206, 35);
		panel_35.add(panel_50);

		cbCardioAbdominalLabs = new JCheckBox();
		cbCardioAbdominalLabs.setBackground(Color.WHITE);
		cbCardioAbdominalLabs.setText("cbChestAndThoraxChestAPAL");
		cbCardioAbdominalLabs.setBounds(12, 1, 14, 16);
		panel_50.add(cbCardioAbdominalLabs);

		abnormalLabsfluidselectrolyteAndTextArea = new JTextArea();
		abnormalLabsfluidselectrolyteAndTextArea.setWrapStyleWord(true);
		abnormalLabsfluidselectrolyteAndTextArea
				.setText("Abnormal Labs(Fluids,Electrolyte and Acid-Base Balance");
		abnormalLabsfluidselectrolyteAndTextArea.setLineWrap(true);
		abnormalLabsfluidselectrolyteAndTextArea.setForeground(new Color(255,
				102, 102));
		abnormalLabsfluidselectrolyteAndTextArea.setBounds(32, 1, 168, 33);
		panel_50.add(abnormalLabsfluidselectrolyteAndTextArea);

		panel_51 = new JPanel();
		panel_51.setLayout(null);
		panel_51.setBackground(Color.WHITE);
		panel_51.setBounds(1, 90, 206, 18);
		panel_35.add(panel_51);

		chest1ViewLabel_23 = new JLabel();
		chest1ViewLabel_23.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_23.setText("Acute Edema Of the Lung");
		chest1ViewLabel_23.setBounds(32, 1, 143, 14);
		panel_51.add(chest1ViewLabel_23);

		cbCardioAcuteEdema = new JCheckBox();
		cbCardioAcuteEdema.setBackground(Color.WHITE);
		cbCardioAcuteEdema.setText("cbChestAndThoraxRibsUnil");
		cbCardioAcuteEdema.setBounds(12, 1, 14, 16);
		panel_51.add(cbCardioAcuteEdema);

		panel_52 = new JPanel();
		panel_52.setLayout(null);
		panel_52.setBackground(Color.WHITE);
		panel_52.setBounds(1, 107, 206, 18);
		panel_35.add(panel_52);

		chest1ViewLabel_24 = new JLabel();
		chest1ViewLabel_24.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_24.setText("Acute Myocarditis");
		chest1ViewLabel_24.setBounds(32, 1, 128, 14);
		panel_52.add(chest1ViewLabel_24);

		cbCardioAcuteMyocarditis = new JCheckBox();
		cbCardioAcuteMyocarditis.setBackground(Color.WHITE);
		cbCardioAcuteMyocarditis.setText("cbChestAndThoraxRibsUniC");
		cbCardioAcuteMyocarditis.setBounds(12, 1, 14, 16);
		panel_52.add(cbCardioAcuteMyocarditis);

		panel_53 = new JPanel();
		panel_53.setLayout(null);
		panel_53.setBackground(Color.WHITE);
		panel_53.setBounds(1, 124, 206, 18);
		panel_35.add(panel_53);

		chest1ViewLabel_25 = new JLabel();
		chest1ViewLabel_25.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_25.setText("Acute Paricarditis");
		chest1ViewLabel_25.setBounds(32, 1, 160, 14);
		panel_53.add(chest1ViewLabel_25);

		cbCardioAcuteParicarditis = new JCheckBox();
		cbCardioAcuteParicarditis.setBackground(Color.WHITE);
		cbCardioAcuteParicarditis.setText("cbChestAndThoraxRibsUniC");
		cbCardioAcuteParicarditis.setBounds(12, 1, 14, 16);
		panel_53.add(cbCardioAcuteParicarditis);

		panel_86 = new JPanel();
		panel_86.setLayout(null);
		panel_86.setBackground(Color.WHITE);
		panel_86.setBounds(1, 141, 206, 18);
		panel_35.add(panel_86);

		chest1ViewLabel_29 = new JLabel();
		chest1ViewLabel_29.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_29.setText("Acute Pulmonary Heart Disease");
		chest1ViewLabel_29.setBounds(32, 1, 160, 14);
		panel_86.add(chest1ViewLabel_29);

		cbCardioAcutePulmonary = new JCheckBox();
		cbCardioAcutePulmonary.setBackground(Color.WHITE);
		cbCardioAcutePulmonary.setText("cbChestAndThoraxRibsUniC");
		cbCardioAcutePulmonary.setBounds(12, 1, 14, 16);
		panel_86.add(cbCardioAcutePulmonary);

		panel_102 = new JPanel();
		panel_102.setLayout(null);
		panel_102.setBackground(Color.WHITE);
		panel_102.setBounds(1, 158, 206, 18);
		panel_35.add(panel_102);

		chest1ViewLabel_33 = new JLabel();
		chest1ViewLabel_33.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_33.setText("Angina Pectoris");
		chest1ViewLabel_33.setBounds(32, 1, 160, 14);
		panel_102.add(chest1ViewLabel_33);

		cbCardioAngina = new JCheckBox();
		cbCardioAngina.setBackground(Color.WHITE);
		cbCardioAngina.setText("cbChestAndThoraxRibsUniC");
		cbCardioAngina.setBounds(12, 1, 14, 16);
		panel_102.add(cbCardioAngina);

		panel_103 = new JPanel();
		panel_103.setLayout(null);
		panel_103.setBackground(Color.WHITE);
		panel_103.setBounds(1, 175, 206, 18);
		panel_35.add(panel_103);

		chest1ViewLabel_52 = new JLabel();
		chest1ViewLabel_52.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_52.setText("Aortic Aneurysm & Dissection");
		chest1ViewLabel_52.setBounds(32, 1, 160, 14);
		panel_103.add(chest1ViewLabel_52);

		cbCardioAortic = new JCheckBox();
		cbCardioAortic.setBackground(Color.WHITE);
		cbCardioAortic.setText("cbChestAndThoraxRibsUniC");
		cbCardioAortic.setBounds(12, 1, 14, 16);
		panel_103.add(cbCardioAortic);

		panel_104 = new JPanel();
		panel_104.setLayout(null);
		panel_104.setBackground(Color.WHITE);
		panel_104.setBounds(1, 192, 206, 18);
		panel_35.add(panel_104);

		chest1ViewLabel_53 = new JLabel();
		chest1ViewLabel_53.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_53.setText("Chest Pain");
		chest1ViewLabel_53.setBounds(32, 1, 160, 14);
		panel_104.add(chest1ViewLabel_53);

		cbCardioChestPain = new JCheckBox();
		cbCardioChestPain.setBackground(Color.WHITE);
		cbCardioChestPain.setText("cbChestAndThoraxRibsUniC");
		cbCardioChestPain.setBounds(12, 1, 14, 16);
		panel_104.add(cbCardioChestPain);

		panel_105 = new JPanel();
		panel_105.setLayout(null);
		panel_105.setBackground(Color.WHITE);
		panel_105.setBounds(1, 209, 206, 18);
		panel_35.add(panel_105);

		chest1ViewLabel_54 = new JLabel();
		chest1ViewLabel_54.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_54.setText("Undiagnosed Quardiac Murmurs");
		chest1ViewLabel_54.setBounds(32, 1, 160, 14);
		panel_105.add(chest1ViewLabel_54);

		cbCardioUndiagnosed = new JCheckBox();
		cbCardioUndiagnosed.setBackground(Color.WHITE);
		cbCardioUndiagnosed.setText("cbChestAndThoraxRibsUniC");
		cbCardioUndiagnosed.setBounds(12, 1, 14, 16);
		panel_105.add(cbCardioUndiagnosed);

		panel_106 = new JPanel();
		panel_106.setLayout(null);
		panel_106.setBackground(Color.WHITE);
		panel_106.setBounds(1, 226, 206, 18);
		panel_35.add(panel_106);

		chest1ViewLabel_55 = new JLabel();
		chest1ViewLabel_55.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_55.setText("Chronic Pulmonary Heart Disease");
		chest1ViewLabel_55.setBounds(32, 1, 160, 14);
		panel_106.add(chest1ViewLabel_55);

		cbCardioChronic = new JCheckBox();
		cbCardioChronic.setBackground(Color.WHITE);
		cbCardioChronic.setText("cbChestAndThoraxRibsUniC");
		cbCardioChronic.setBounds(12, 1, 14, 16);
		panel_106.add(cbCardioChronic);

		panel_107 = new JPanel();
		panel_107.setLayout(null);
		panel_107.setBackground(Color.WHITE);
		panel_107.setBounds(1, 243, 206, 18);
		panel_35.add(panel_107);

		chest1ViewLabel_56 = new JLabel();
		chest1ViewLabel_56.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_56.setText("Cardiac Dysrhythmia");
		chest1ViewLabel_56.setBounds(32, 1, 160, 14);
		panel_107.add(chest1ViewLabel_56);

		cbCardioCardiac = new JCheckBox();
		cbCardioCardiac.setBackground(Color.WHITE);
		cbCardioCardiac.setText("cbChestAndThoraxRibsUniC");
		cbCardioCardiac.setBounds(12, 1, 14, 16);
		panel_107.add(cbCardioCardiac);

		panel_108 = new JPanel();
		panel_108.setLayout(null);
		panel_108.setBackground(Color.WHITE);
		panel_108.setBounds(1, 260, 206, 18);
		panel_35.add(panel_108);

		chest1ViewLabel_57 = new JLabel();
		chest1ViewLabel_57.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_57.setText("Cardiomyopathy");
		chest1ViewLabel_57.setBounds(32, 1, 160, 14);
		panel_108.add(chest1ViewLabel_57);

		cbCardioCardiomyopathy = new JCheckBox();
		cbCardioCardiomyopathy.setBackground(Color.WHITE);
		cbCardioCardiomyopathy.setText("cbChestAndThoraxRibsUniC");
		cbCardioCardiomyopathy.setBounds(12, 1, 14, 16);
		panel_108.add(cbCardioCardiomyopathy);

		panel_109 = new JPanel();
		panel_109.setLayout(null);
		panel_109.setBackground(Color.WHITE);
		panel_109.setBounds(1, 277, 206, 18);
		panel_35.add(panel_109);

		chest1ViewLabel_58 = new JLabel();
		chest1ViewLabel_58.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_58.setText("Convulsions");
		chest1ViewLabel_58.setBounds(32, 1, 160, 14);
		panel_109.add(chest1ViewLabel_58);

		cbCardioConvulsions = new JCheckBox();
		cbCardioConvulsions.setBackground(Color.WHITE);
		cbCardioConvulsions.setText("cbChestAndThoraxRibsUniC");
		cbCardioConvulsions.setBounds(12, 1, 14, 16);
		panel_109.add(cbCardioConvulsions);

		panel_110 = new JPanel();
		panel_110.setLayout(null);
		panel_110.setBackground(Color.WHITE);
		panel_110.setBounds(1, 294, 206, 18);
		panel_35.add(panel_110);

		chest1ViewLabel_59 = new JLabel();
		chest1ViewLabel_59.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_59.setText("Dizziness");
		chest1ViewLabel_59.setBounds(32, 1, 160, 14);
		panel_110.add(chest1ViewLabel_59);

		cbCardioDizziness = new JCheckBox();
		cbCardioDizziness.setBackground(Color.WHITE);
		cbCardioDizziness.setText("cbChestAndThoraxRibsUniC");
		cbCardioDizziness.setBounds(12, 1, 14, 16);
		panel_110.add(cbCardioDizziness);

		panel_111 = new JPanel();
		panel_111.setLayout(null);
		panel_111.setBackground(Color.WHITE);
		panel_111.setBounds(1, 311, 206, 18);
		panel_35.add(panel_111);

		chest1ViewLabel_60 = new JLabel();
		chest1ViewLabel_60.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_60.setText("Diseases of Mitral & Aortic Valves");
		chest1ViewLabel_60.setBounds(32, 1, 160, 14);
		panel_111.add(chest1ViewLabel_60);

		cbCardioDiseasesMitral = new JCheckBox();
		cbCardioDiseasesMitral.setBackground(Color.WHITE);
		cbCardioDiseasesMitral.setText("cbChestAndThoraxRibsUniC");
		cbCardioDiseasesMitral.setBounds(12, 1, 14, 16);
		panel_111.add(cbCardioDiseasesMitral);

		panel_112 = new JPanel();
		panel_112.setLayout(null);
		panel_112.setBackground(Color.WHITE);
		panel_112.setBounds(1, 328, 206, 18);
		panel_35.add(panel_112);

		chest1ViewLabel_61 = new JLabel();
		chest1ViewLabel_61.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_61.setText("Diseases of Aortic Valve");
		chest1ViewLabel_61.setBounds(32, 1, 160, 14);
		panel_112.add(chest1ViewLabel_61);

		cbCardioDiseasesAortic = new JCheckBox();
		cbCardioDiseasesAortic.setBackground(Color.WHITE);
		cbCardioDiseasesAortic.setText("cbChestAndThoraxRibsUniC");
		cbCardioDiseasesAortic.setBounds(12, 1, 14, 16);
		panel_112.add(cbCardioDiseasesAortic);

		panel_113 = new JPanel();
		panel_113.setLayout(null);
		panel_113.setBackground(Color.WHITE);
		panel_113.setBounds(1, 345, 206, 18);
		panel_35.add(panel_113);

		chest1ViewLabel_62 = new JLabel();
		chest1ViewLabel_62.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_62.setText("Benign Hypertension");
		chest1ViewLabel_62.setBounds(32, 1, 160, 14);
		panel_113.add(chest1ViewLabel_62);

		cbCardioBenign = new JCheckBox();
		cbCardioBenign.setBackground(Color.WHITE);
		cbCardioBenign.setText("cbChestAndThoraxRibsUniC");
		cbCardioBenign.setBounds(12, 1, 14, 16);
		panel_113.add(cbCardioBenign);

		panel_114 = new JPanel();
		panel_114.setLayout(null);
		panel_114.setBackground(Color.WHITE);
		panel_114.setBounds(1, 362, 206, 18);
		panel_35.add(panel_114);

		chest1ViewLabel_63 = new JLabel();
		chest1ViewLabel_63.setForeground(new Color(255, 102, 102));
		chest1ViewLabel_63.setText("Unspecified Essential Hytension");
		chest1ViewLabel_63.setBounds(32, 1, 160, 14);
		panel_114.add(chest1ViewLabel_63);

		cbCardioUnspecifiedEssential = new JCheckBox();
		cbCardioUnspecifiedEssential.setBackground(Color.WHITE);
		cbCardioUnspecifiedEssential.setText("cbChestAndThoraxRibsUniC");
		cbCardioUnspecifiedEssential.setBounds(12, 1, 14, 16);
		panel_114.add(cbCardioUnspecifiedEssential);
	}

	public void doSave() {

		MadexForm2 refMadexForm2 = new MadexForm2();
		refMadexForm2.setResidentId(Global.currentResidenceKey);

		refMadexForm2.setAuthorizedSign(txtAuthorizedSign.getText());
		refMadexForm2.setBirth(dcBirth.getDate());
		refMadexForm2.setCardioAbdominalHeart(cbCardioAbdominalHeart
				.isSelected());
		refMadexForm2
				.setCardioAbdominalLabs(cbCardioAbdominalLabs.isSelected());
		refMadexForm2
				.setCardioAbdominalPain(cbCardioAbdominalPain.isSelected());
		refMadexForm2.setCardioAcuteEdema(cbCardioAcuteEdema.isSelected());
		refMadexForm2.setCardioAcuteMyocarditis(cbCardioAcuteMyocarditis
				.isSelected());
		refMadexForm2.setCardioAcuteParicarditis(cbCardioAcuteParicarditis
				.isSelected());
		refMadexForm2.setCardioAcutePulmonary(cbCardioAcutePulmonary
				.isSelected());
		refMadexForm2.setCardioAngina(cbCardioAngina.isSelected());
		refMadexForm2.setCardioAortic(cbCardioAortic.isSelected());
		refMadexForm2.setCardioBenign(cbCardioBenign.isSelected());
		refMadexForm2.setCardioCardiac(cbCardioCardiac.isSelected());
		refMadexForm2.setCardioCardiomyopathy(cbCardioCardiomyopathy
				.isSelected());
		refMadexForm2.setCardioChestPain(cbCardioChestPain.isSelected());
		refMadexForm2.setCardioChronic(cbCardioChronic.isSelected());
		refMadexForm2.setCardioConvulsions(cbCardioConvulsions.isSelected());
		refMadexForm2.setCardioDiseasesAortic(cbCardioDiseasesAortic
				.isSelected());
		refMadexForm2.setCardioDiseasesMitral(cbCardioDiseasesMitral
				.isSelected());
		refMadexForm2.setCardioDizziness(cbCardioDizziness.isSelected());
		refMadexForm2.setCardiological12(cbCardiological12.isSelected());
		refMadexForm2.setCardiologicalDual(cbCardiologicalDual.isSelected());
		refMadexForm2
				.setCardiologicalHolter(cbCardiologicalHolter.isSelected());
		refMadexForm2.setCardiologicalLong(cbCardiologicalLong.isSelected());
		refMadexForm2.setCardiologicalOther(txtCardiologicalOther.getText());
		refMadexForm2.setCardiologicalOxygen(txtCardiologicalOxygen.getText());
		refMadexForm2.setCardiologicalPacemaker(cbCardiologicalPacemaker
				.isSelected());
		refMadexForm2.setCardiologicalPulse(cbCardiologicalPulse.isSelected());
		refMadexForm2.setCardioOxygenNo(cbCardioOxygenNo.isSelected());
		refMadexForm2.setCardioOxygenYes(cbCardioOxygenYes.isSelected());
		refMadexForm2.setCardioUndiagnosed(cbCardioUndiagnosed.isSelected());
		refMadexForm2
				.setCardioUnspecifiedEssential(cbCardioUnspecifiedEssential
						.isSelected());
		refMadexForm2.setCaseField(txtCaseField.getText());
		refMadexForm2.setChargeNurse(txtChargeNurse.getText());
		refMadexForm2.setClinicalHistory(txtClinicalHistory.getText());
		refMadexForm2.setDateDone(dcDateDone.getDate());
		refMadexForm2.setDateOrdered(dcDateOrdered.getDate());
		refMadexForm2.setDateReportReceived(dcDateReportReceived.getDate());
		refMadexForm2.setFacility(txtFacility.getText());
		refMadexForm2.setFemale(cbFemale.isSelected());
		refMadexForm2.setInsurance(txtInsurance.getText());
		refMadexForm2.setMale(cbMale.isSelected());
		refMadexForm2.setMedicaidNo(txtMedicaidNo.getText());
		refMadexForm2.setMedicareA(cbMedicareA.isSelected());
		refMadexForm2.setMedicareB(cbMedicareB.isSelected());
		refMadexForm2.setMedicareNo(txtMedicareNo.getText());
		refMadexForm2.setNoOfViews(txtNoOfViews.getText());
		refMadexForm2.setNoPTSeen(txtNoPTSeen.getText());
		refMadexForm2.setNurse(txtNurse.getText());
		refMadexForm2.setOt(cbOt.isSelected());
		refMadexForm2.setPatient(txtPatient.getText());
		refMadexForm2.setPreApproval(txtPreApproval.getText());
		refMadexForm2.setPulseRate(txtPulseRate.getText());
		refMadexForm2.setRadiologistCode(txtRadiologistCode.getText());
		refMadexForm2.setRequestPhysician(txtRequestPhysician.getText());
		refMadexForm2.setRmNo(txtRmNo.getText());
		refMadexForm2.setSt(cbSt.isSelected());
		refMadexForm2.setTech(txtTech.getText());
		refMadexForm2.setTechnicalComments(txtTechnicalComments.getText());
		refMadexForm2.setTime(txtTime.getText());
		refMadexForm2.setUltraABDAbd(cbUltraABDAbd.isSelected());
		refMadexForm2.setUltraABDAcute(cbUltraABDAcute.isSelected());
		refMadexForm2.setUltraABDAortic(cbUltraABDAortic.isSelected());
		refMadexForm2.setUltraABDAscites(cbUltraABDAscites.isSelected());
		refMadexForm2.setUltraABDBenign(cbUltraABDBenign.isSelected());
		refMadexForm2.setUltraABDCholelith(cbUltraABDCholelith.isSelected());
		refMadexForm2.setUltraABDChronic(cbUltraABDChronic.isSelected());
		refMadexForm2.setUltraABDCyst(cbUltraABDCyst.isSelected());
		refMadexForm2.setUltraABDHydonephrosis(cbUltraABDHydonephrosis
				.isSelected());
		refMadexForm2.setUltraABDJaundice(cbUltraABDJaundice.isSelected());
		refMadexForm2.setUltraABDKidneyCal(cbUltraABDKidneyCal.isSelected());
		refMadexForm2
				.setUltraABDKidneyInfac(cbUltraABDKidneyInfac.isSelected());
		refMadexForm2.setUltraABDLiver(cbUltraABDLiver.isSelected());
		refMadexForm2.setUltraABDLiverDisease(cbUltraABDLiverDisease
				.isSelected());
		refMadexForm2.setUltraABDMalIntestinal(cbUltraABDMalIntestinal
				.isSelected());
		refMadexForm2
				.setUltraABDMalPancreas(cbUltraABDMalPancreas.isSelected());
		refMadexForm2.setUltraABDRupture(cbUltraABDRupture.isSelected());
		refMadexForm2.setUltraABDSwelling(cbUltraABDSwelling.isSelected());
		refMadexForm2.setUltrasoundsAbdominalMulti(cbUltrasoundsAbdominalMulti
				.isSelected());
		refMadexForm2.setUltrasoundsAbdominalRetro(cbUltrasoundsAbdominalRetro
				.isSelected());
		refMadexForm2
				.setUltrasoundsArterial(cbUltrasoundsArterial.isSelected());
		refMadexForm2.setUltrasoundsArterialBoth(cbUltrasoundsArterialBoth
				.isSelected());
		refMadexForm2.setUltrasoundsArterialBoth2(cbUltrasoundsArterialBoth2
				.isSelected());
		refMadexForm2.setUltrasoundsArterialLower2(cbUltrasoundsArterialLower
				.isSelected());
		refMadexForm2.setUltrasoundsArterialLT(cbUltrasoundsArterialLT
				.isSelected());
		refMadexForm2.setUltrasoundsArterialLT2(cbUltrasoundsArterialLT2
				.isSelected());
		refMadexForm2.setUltrasoundsArterialRT(cbUltrasoundsArterialRT
				.isSelected());
		refMadexForm2.setUltrasoundsArterialRT2(cbUltrasoundsArterialRT2
				.isSelected());
		refMadexForm2.setUltrasoundsArterialUpper(cbUltrasoundsArterialUpper2
				.isSelected());
		refMadexForm2.setUltrasoundsBreast(cbUltrasoundsBreast.isSelected());
		refMadexForm2.setUltrasoundsCarotid(cbUltrasoundsCarotid.isSelected());
		refMadexForm2.setUltrasoundsChest(cbUltrasoundsChest.isSelected());
		refMadexForm2.setUltrasoundsChronic(cbUltrasoundsChronic.isSelected());
		refMadexForm2.setUltrasoundsEcho(cbUltrasoundsEcho.isSelected());
		refMadexForm2.setUltrasoundsHeartDisease(cbUltrasoundsHeartDisease
				.isSelected());
		refMadexForm2.setUltrasoundsHeartFailure(cbUltrasoundsHeartFailure
				.isSelected());
		refMadexForm2.setUltrasoundsHypertension(cbUltrasoundsHypertension
				.isSelected());
		refMadexForm2
				.setUltrasoundsHypertensionHrt(cbUltrasoundsHypertensionHrt
						.isSelected());
		refMadexForm2
				.setUltrasoundsHypertensiveHeart(cbUltrasoundsHypertensiveHeart
						.isSelected());
		refMadexForm2.setUltrasoundsMalignant(cbUltrasoundsMalignant
				.isSelected());
		refMadexForm2
				.setUltrasoundsMalignantNeoplasm(cbUltrasoundsMalignantNeoplasm
						.isSelected());
		refMadexForm2.setUltrasoundsMyalgia(cbUltrasoundsMyalgia.isSelected());
		refMadexForm2.setUltrasoundsMyocardial(cbUltrasoundsMyocardial
				.isSelected());
		refMadexForm2.setUltrasoundsOld(cbUltrasoundsOld.isSelected());
		refMadexForm2.setUltrasoundsPain(cbUltrasoundsPain.isSelected());
		refMadexForm2.setUltrasoundsPalpitations(cbUltrasoundsPalpitations
				.isSelected());
		refMadexForm2.setUltrasoundsPelvis(cbUltrasoundsPelvis.isSelected());
		refMadexForm2
				.setUltrasoundsProstate(cbUltrasoundsProstate.isSelected());
		refMadexForm2.setUltrasoundsRenal(cbUltrasoundsRenal.isSelected());
		refMadexForm2.setUltrasoundsResptryArrest(cbUltrasoundsResptryArrest
				.isSelected());
		refMadexForm2
				.setUltrasoundsResptryDistress(cbUltrasoundsResptryDistress
						.isSelected());
		refMadexForm2.setUltrasoundsResptryFail(cbUltrasoundsResptryFail
				.isSelected());
		refMadexForm2.setUltrasoundsRheumatic(cbUltrasoundsRheumatic
				.isSelected());
		refMadexForm2.setUltrasoundsSyncope(cbUltrasoundsSyncope.isSelected());
		refMadexForm2.setUltrasoundsTechycardia(cbUltrasoundsTechycardia
				.isSelected());
		refMadexForm2.setUltrasoundsTesticular(cbUltrasoundsTesticular
				.isSelected());
		refMadexForm2.setUltrasoundsThroat(cbUltrasoundsThroat.isSelected());
		refMadexForm2.setUltrasoundsThyroid(cbUltrasoundsThyroid.isSelected());
		refMadexForm2.setUltrasoundsVenous(cbUltrasoundsVenous.isSelected());
		refMadexForm2.setUltrasoundsVenousBoth(cbUltrasoundsVenousBoth
				.isSelected());
		refMadexForm2
				.setUltrasoundsVenousLT(cbUltrasoundsVenousLT.isSelected());
		refMadexForm2
				.setUltrasoundsVenousRT(cbUltrasoundsVenousRT.isSelected());

		try {
			Global.currentMadexForm2Key = MedrexClientManager.getInstance()
					.insertOrUpdateMadexForm2(refMadexForm2);
		} catch (Exception e) {
		}

	}

	public void updateData() {
		MadexForm2 refMadexForm2 = null;

		if (Global.currentMadexForm2Key != 0) {
			try {
				refMadexForm2 = MedrexClientManager.getInstance()
						.getMadexForm2(Global.currentMadexForm2Key);
			} catch (Exception e) {

			}
			cbMedicareA.setSelected(refMadexForm2.isMedicareA());
			cbMedicareB.setSelected(refMadexForm2.isMedicareB());
			txtFacility.setText(refMadexForm2.getFacility());
			txtPatient.setText(refMadexForm2.getPatient());
			cbMale.setSelected(refMadexForm2.isMale());
			cbFemale.setSelected(refMadexForm2.isFemale());
			txtMedicareNo.setText(refMadexForm2.getMedicareNo());
			dcBirth.setDate(refMadexForm2.getBirth());
			txtRmNo.setText(refMadexForm2.getRmNo());
			txtMedicaidNo.setText(refMadexForm2.getMedicaidNo());
			txtInsurance.setText(refMadexForm2.getInsurance());
			txtPreApproval.setText(refMadexForm2.getPreApproval());
			txtCaseField.setText(refMadexForm2.getCaseField());
			cbCardiological12.setSelected(refMadexForm2.isCardiological12());
			cbCardiologicalLong
					.setSelected(refMadexForm2.isCardiologicalLong());
			cbCardiologicalPacemaker.setSelected(refMadexForm2
					.isCardiologicalPacemaker());
			cbCardiologicalDual
					.setSelected(refMadexForm2.isCardiologicalDual());
			cbCardiologicalHolter.setSelected(refMadexForm2
					.isCardiologicalHolter());
			cbCardiologicalPulse.setSelected(refMadexForm2
					.isCardiologicalPulse());
			txtCardiologicalOxygen.setText(refMadexForm2
					.getCardiologicalOxygen());
			txtPulseRate.setText(refMadexForm2.getPulseRate());
			cbCardioOxygenYes.setSelected(refMadexForm2.isCardioOxygenYes());
			cbCardioOxygenNo.setSelected(refMadexForm2.isCardioOxygenNo());
			txtCardiologicalOther
					.setText(refMadexForm2.getCardiologicalOther());
			txtTime.setText(refMadexForm2.getTime());
			dcDateDone.setDate(refMadexForm2.getDateDone());
			txtTech.setText(refMadexForm2.getTech());
			cbUltrasoundsEcho.setSelected(refMadexForm2.isUltrasoundsEcho());
			cbUltrasoundsThyroid.setSelected(refMadexForm2
					.isUltrasoundsThyroid());
			cbUltrasoundsTesticular.setSelected(refMadexForm2
					.isUltrasoundsTesticular());
			cbUltrasoundsCarotid.setSelected(refMadexForm2
					.isUltrasoundsCarotid());
			cbUltrasoundsAbdominalMulti.setSelected(refMadexForm2
					.isUltrasoundsAbdominalMulti());
			cbUltrasoundsAbdominalRetro.setSelected(refMadexForm2
					.isUltrasoundsAbdominalRetro());
			cbUltrasoundsPelvis
					.setSelected(refMadexForm2.isUltrasoundsPelvis());
			cbUltrasoundsProstate.setSelected(refMadexForm2
					.isUltrasoundsProstate());
			cbUltrasoundsRenal.setSelected(refMadexForm2.isUltrasoundsRenal());
			txtNoPTSeen.setText(refMadexForm2.getNoPTSeen());
			txtNoOfViews.setText(refMadexForm2.getNoOfViews());
			txtRadiologistCode.setText(refMadexForm2.getRadiologistCode());
			cbUltrasoundsBreast
					.setSelected(refMadexForm2.isUltrasoundsBreast());
			cbUltrasoundsChest.setSelected(refMadexForm2.isUltrasoundsChest());
			cbUltrasoundsVenous
					.setSelected(refMadexForm2.isUltrasoundsVenous());
			cbUltrasoundsVenousRT.setSelected(refMadexForm2
					.isUltrasoundsVenousRT());
			cbUltrasoundsVenousLT.setSelected(refMadexForm2
					.isUltrasoundsVenousLT());
			cbUltrasoundsVenousBoth.setSelected(refMadexForm2
					.isUltrasoundsVenousBoth());
			cbUltrasoundsArterial.setSelected(refMadexForm2
					.isUltrasoundsArterial());
			cbUltrasoundsArterialRT.setSelected(refMadexForm2
					.isUltrasoundsArterialRT());
			cbUltrasoundsArterialLT.setSelected(refMadexForm2
					.isUltrasoundsArterialLT());
			cbUltrasoundsArterialBoth.setSelected(refMadexForm2
					.isUltrasoundsArterialBoth());
			cbUltrasoundsArterialUpper2.setSelected(refMadexForm2
					.isUltrasoundsArterialUpper());
			cbUltrasoundsArterialRT2.setSelected(refMadexForm2
					.isUltrasoundsArterialRT2());
			cbUltrasoundsArterialLT2.setSelected(refMadexForm2
					.isUltrasoundsArterialLT2());
			cbUltrasoundsArterialBoth2.setSelected(refMadexForm2
					.isUltrasoundsArterialBoth2());
			cbUltrasoundsArterialLower.setSelected(refMadexForm2
					.isUltrasoundsArterialLower2());
			txtTechnicalComments.setText(refMadexForm2.getTechnicalComments());
			cbXrayYes.setSelected(refMadexForm2.isXrayYes());
			cbXrayNo.setSelected(refMadexForm2.isXrayNo());
			txtAuthorizedSign.setText(refMadexForm2.getAuthorizedSign());
			cbOt.setSelected(refMadexForm2.isOt());
			cbSt.setSelected(refMadexForm2.isSt());
			txtChargeNurse.setText(refMadexForm2.getChargeNurse());
			cbCardioAbdominalPain.setSelected(refMadexForm2
					.isCardioAbdominalPain());
			cbCardioAbdominalHeart.setSelected(refMadexForm2
					.isCardioAbdominalHeart());
			cbCardioAbdominalLabs.setSelected(refMadexForm2
					.isCardioAbdominalLabs());
			cbCardioAcuteEdema.setSelected(refMadexForm2.isCardioAcuteEdema());
			cbCardioAcuteMyocarditis.setSelected(refMadexForm2
					.isCardioAcuteMyocarditis());
			cbCardioAcuteParicarditis.setSelected(refMadexForm2
					.isCardioAcuteParicarditis());
			cbCardioAcutePulmonary.setSelected(refMadexForm2
					.isCardioAcutePulmonary());
			cbCardioAngina.setSelected(refMadexForm2.isCardioAngina());
			cbCardioAortic.setSelected(refMadexForm2.isCardioAortic());
			cbCardioChestPain.setSelected(refMadexForm2.isCardioChestPain());
			cbCardioUndiagnosed
					.setSelected(refMadexForm2.isCardioUndiagnosed());
			cbCardioChronic.setSelected(refMadexForm2.isCardioChronic());
			cbCardioCardiac.setSelected(refMadexForm2.isCardioCardiac());
			cbCardioCardiomyopathy.setSelected(refMadexForm2
					.isCardioCardiomyopathy());
			cbCardioConvulsions
					.setSelected(refMadexForm2.isCardioConvulsions());
			cbCardioDizziness.setSelected(refMadexForm2.isCardioDizziness());
			cbCardioDiseasesMitral.setSelected(refMadexForm2
					.isCardioDiseasesMitral());
			cbCardioDiseasesAortic.setSelected(refMadexForm2
					.isCardioDiseasesAortic());
			cbCardioBenign.setSelected(refMadexForm2.isCardioBenign());
			cbCardioUnspecifiedEssential.setSelected(refMadexForm2
					.isCardioUnspecifiedEssential());
			cbUltrasoundsHypertensiveHeart.setSelected(refMadexForm2
					.isUltrasoundsHypertensiveHeart());
			cbUltrasoundsMalignant.setSelected(refMadexForm2
					.isUltrasoundsMalignant());
			cbUltrasoundsHeartDisease.setSelected(refMadexForm2
					.isUltrasoundsHeartDisease());
			cbUltrasoundsHypertension.setSelected(refMadexForm2
					.isUltrasoundsHypertension());
			cbUltrasoundsHypertensionHrt.setSelected(refMadexForm2
					.isUltrasoundsHypertensionHrt());
			cbUltrasoundsHeartFailure.setSelected(refMadexForm2
					.isUltrasoundsHeartFailure());
			cbUltrasoundsMyocardial.setSelected(refMadexForm2
					.isUltrasoundsMyocardial());
			cbUltrasoundsOld.setSelected(refMadexForm2.isUltrasoundsOld());
			cbUltrasoundsMyalgia.setSelected(refMadexForm2
					.isUltrasoundsMyalgia());
			cbUltrasoundsMalignantNeoplasm.setSelected(refMadexForm2
					.isUltrasoundsMalignantNeoplasm());
			cbUltrasoundsPalpitations.setSelected(refMadexForm2
					.isUltrasoundsPalpitations());
			cbUltrasoundsPain.setSelected(refMadexForm2.isUltrasoundsPain());
			cbUltrasoundsResptryFail.setSelected(refMadexForm2
					.isUltrasoundsResptryFail());
			cbUltrasoundsChronic.setSelected(refMadexForm2
					.isUltrasoundsChronic());
			cbUltrasoundsRheumatic.setSelected(refMadexForm2
					.isUltrasoundsRheumatic());
			cbUltrasoundsResptryDistress.setSelected(refMadexForm2
					.isUltrasoundsResptryDistress());
			cbUltrasoundsResptryArrest.setSelected(refMadexForm2
					.isUltrasoundsResptryArrest());
			cbUltrasoundsSyncope.setSelected(refMadexForm2
					.isUltrasoundsSyncope());
			cbUltrasoundsTechycardia.setSelected(refMadexForm2
					.isUltrasoundsTechycardia());
			cbUltrasoundsThroat
					.setSelected(refMadexForm2.isUltrasoundsThroat());
			cbUltraABDAcute.setSelected(refMadexForm2.isUltraABDAcute());
			cbUltraABDAortic.setSelected(refMadexForm2.isUltraABDAortic());
			cbUltraABDChronic.setSelected(refMadexForm2.isUltraABDChronic());
			cbUltraABDAbd.setSelected(refMadexForm2.isUltraABDAbd());
			cbUltraABDRupture.setSelected(refMadexForm2.isUltraABDRupture());
			cbUltraABDAscites.setSelected(refMadexForm2.isUltraABDAscites());
			cbUltraABDSwelling.setSelected(refMadexForm2.isUltraABDSwelling());
			cbUltraABDLiver.setSelected(refMadexForm2.isUltraABDLiver());
			cbUltraABDBenign.setSelected(refMadexForm2.isUltraABDBenign());
			cbUltraABDCholelith
					.setSelected(refMadexForm2.isUltraABDCholelith());
			cbUltraABDCyst.setSelected(refMadexForm2.isUltraABDCyst());
			cbUltraABDHydonephrosis.setSelected(refMadexForm2
					.isUltraABDHydonephrosis());
			cbUltraABDJaundice.setSelected(refMadexForm2.isUltraABDJaundice());
			cbUltraABDKidneyCal
					.setSelected(refMadexForm2.isUltraABDKidneyCal());
			cbUltraABDKidneyInfac.setSelected(refMadexForm2
					.isUltraABDKidneyInfac());
			cbUltraABDLiverDisease.setSelected(refMadexForm2
					.isUltraABDLiverDisease());
			cbUltraABDMalPancreas.setSelected(refMadexForm2
					.isUltraABDMalPancreas());
			cbUltraABDMalIntestinal.setSelected(refMadexForm2
					.isUltraABDMalIntestinal());
			txtClinicalHistory.setText(refMadexForm2.getClinicalHistory());
			txtRequestPhysician.setText(refMadexForm2.getRequestPhysician());
			txtNurse.setText(refMadexForm2.getNurse());
			dcDateOrdered.setDate(refMadexForm2.getDateOrdered());
			dcDateReportReceived.setDate(refMadexForm2.getDateReportReceived());

			ResidentMain rm = null;
			try {
				rm = MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
				txtPatient.setText(rm.getUserPass() + " " + rm.getUserName());
				/* TODO: Migrating to room history */
				// txtRmNo.setText(rm.getRoom());
				dcBirth.setDate(rm.getDob());
				txtMedicaidNo.setText(rm.getMedicaidNum());
				if (rm.getSex().toString().equals("Male")) {
					cbMale.setSelected(true);
					cbFemale.setSelected(false);
				} else {
					cbMale.setSelected(false);
					cbFemale.setSelected(true);
				}

			} catch (Exception e) {

			}
		}
	}
}
