package medrex.client.main.labspecial;

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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.labSpecial.MadexForm1;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelMadexForm1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1620623947511341234L;
	private JCheckBox cbChestAndThoraxRibsUniCRL;
	private JCheckBox cbChestAndThoraxRibsUnilL;
	private JCheckBox cbChestAndThoraxRibsUnilR;
	private JCheckBox cbLowerToeL;
	private JCheckBox cbLowerHeelL;
	private JCheckBox cbLowerFootL;
	private JCheckBox cbLowerAnkleL;
	private JCheckBox cbLowerTibiaL;
	private JCheckBox cbLowerKneeCompL;
	private JCheckBox cbLowerKneeL;
	private JCheckBox cbLowerFemurL;
	private JCheckBox cbLowerHipL;
	private JCheckBox cbUpperFingerL;
	private JCheckBox cbUpperHandL;
	private JCheckBox cbUpperWristL;
	private JCheckBox cbUpperElbowL;
	private JCheckBox cbUpperForearmL;
	private JCheckBox cbUpperHumerusL;
	private JCheckBox cbUpperScapulaL;
	private JCheckBox cbUpperClavicleL;
	private JCheckBox cbUpperShoulderL;
	/*
	 * private class SwingAction extends AbstractAction { SwingAction() {
	 * super("New Action", null); } public void actionPerformed(ActionEvent e) {
	 * } }
	 */
	// private SwingAction action = new SwingAction();
	private ButtonGroup bgDescTpt = new ButtonGroup();
	private JTextField txtRadiologistCode;
	private JTextField txtNoOfViews;
	private JTextField txtNoPTSeen;
	private JTextField txtTech;
	private JDateChooser dcDateDone;
	private JTextField txtTime;
	private JTextArea txtTechnicalComments;
	private JTextArea txtHeadOther;
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
	private JDateChooser dcDateReceive;
	private JTextArea requestingPhysicianTextArea_2;
	private JPanel panel_169;
	private JDateChooser dcDateOrder;
	private JTextArea requestingPhysicianTextArea_1;
	private JPanel panel_168;
	private JLabel nurseLabel;
	private JTextField txtNurse;
	private JPanel panel_167;
	private JTextField txtRequestPhysician;
	private JTextArea requesting_PhysicianTextArea;
	private JPanel panel_165;
	private JTextField txtClinicalHistory;
	private JLabel alcoholismLabel_6;
	private JPanel panel_92;
	private JLabel label_102;
	private JLabel label_101;
	private JLabel label_100;
	private JLabel label_99;
	private JLabel label_98;
	private JLabel label_97;
	private JLabel label_96;
	private JLabel label_95;
	private JLabel label_94;
	private JLabel label_93;
	private JLabel label_72;
	private JCheckBox cbHypoMineral;
	private JLabel chest1ViewLabel_104;
	private JPanel panel_164;
	private JCheckBox cbHypoMalabsorption;
	private JLabel chest1ViewLabel_103;
	private JPanel panel_163;
	private JCheckBox cbHypoCongenital;
	private JLabel chest1ViewLabel_102;
	private JPanel panel_162;
	private JLabel alcoholismLabel_5;
	private JCheckBox cbNeoplasmNutritional;
	private JLabel chest1ViewLabel_101;
	private JPanel panel_161;
	private JTextArea bengin_Neoplasmbrainother;
	private JCheckBox cbNeoplasmBrain;
	private JCheckBox cbNeoplasmKidney;
	private JLabel chest1ViewLabel_100;
	private JPanel panel_160;
	private JLabel alcoholismLabel_4;
	private JCheckBox cbRenalVitamin;
	private JLabel chest1ViewLabel_99;
	private JPanel panel_159;
	private JCheckBox cbRenalTesticular;
	private JLabel chest1ViewLabel_98;
	private JPanel panel_158;
	private JCheckBox cbRenalRickets;
	private JLabel chest1ViewLabel_97;
	private JPanel panel_157;
	private JCheckBox cbRenalRheumatoid;
	private JLabel chest1ViewLabel_96;
	private JPanel panel_156;
	private JCheckBox cbRenalOsteoDystrophy;
	private JLabel chest1ViewLabel_95;
	private JPanel panel_155;
	private JCheckBox cbRenalNeptirogenic;
	private JLabel chest1ViewLabel_94;
	private JPanel panel_131;
	private JCheckBox cbRenalImpaired;
	private JLabel chest1ViewLabel_93;
	private JPanel panel_127;
	private JCheckBox cbRenalChronic;
	private JLabel chest1ViewLabel_61;
	private JPanel panel_120;
	private JLabel alcoholismLabel_3;
	private JLabel alcoholismLabel_2;
	private JLabel label_91;
	private JLabel label_90;
	private JLabel label_89;
	private JLabel label_88;
	private JLabel label_87;
	private JLabel label_86;
	private JLabel label_85;
	private JLabel label_57;
	private JCheckBox cbFracturePathologicFxUnspecified;
	private JLabel chest1ViewLabel_92;
	private JPanel panel_154;
	private JCheckBox cbFracturePathologicFxDistal;
	private JLabel chest1ViewLabel_91;
	private JPanel panel_153;
	private JCheckBox cbFracturePathologicFx;
	private JLabel chest1ViewLabel_90;
	private JPanel panel_152;
	private JCheckBox cbFractureICD;
	private JLabel chest1ViewLabel_89;
	private JPanel panel_151;
	private JLabel alcoholismLabel_1;
	private JCheckBox cbAlcohalDiabetic;
	private JLabel chest1ViewLabel_88;
	private JPanel panel_122;
	private JCheckBox cbAlcohalAnorexia;
	private JLabel chest1ViewLabel_87;
	private JPanel panel_112;
	private JCheckBox cbAlcohalCirrhosis;
	private JLabel chest1ViewLabel_86;
	private JPanel panel_110;
	private JLabel alcoholismLabel;
	private JCheckBox cbAlcohalAddiction;
	private JLabel chest1ViewLabel_85;
	private JPanel panel_150;
	private JCheckBox cbAlcohalAbuse;
	private JLabel chest1ViewLabel_84;
	private JPanel panel_149;
	private JLabel chestAndThoraxdLabel_16;
	private JPanel panel_148;
	private JCheckBox cbHeadOtherICD;
	private JLabel chest1ViewLabel_83;
	private JPanel panel_147;
	private JCheckBox cbHeadBruise;
	private JLabel chest1ViewLabel_82;
	private JPanel panel_146;
	private JCheckBox cbHeadPain;
	private JLabel chest1ViewLabel_81;
	private JPanel panel_145;
	private JCheckBox cbHeadConcussion;
	private JLabel chest1ViewLabel_80;
	private JPanel panel_144;
	private JLabel label_84;
	private JLabel label_83;
	private JLabel v549Label;
	private JLabel label_81;
	private JLabel label_80;
	private JLabel label_79;
	private JLabel label_78;
	private JLabel label_77;
	private JLabel label_76;
	private JCheckBox cbAbdomenHematuria;
	private JLabel chest1ViewLabel_79;
	private JPanel panel_143;
	private JCheckBox cbAbdomenDist;
	private JLabel chest1ViewLabel_78;
	private JPanel panel_142;
	private JLabel chestAndThoraxdLabel_15;
	private JPanel panel_141;
	private JCheckBox cbSkeletalSwellingOther;
	private JLabel chest1ViewLabel_76;
	private JPanel panel_140;
	private JCheckBox cbSkeletalHealing;
	private JLabel chest1ViewLabel_75;
	private JPanel panel_139;
	private JCheckBox cbSkeletalSwellingExt;
	private JLabel chest1ViewLabel_73;
	private JPanel panel_138;
	private JCheckBox cbSkeletalPainMultiple;
	private JLabel chest1ViewLabel_72;
	private JPanel panel_137;
	private JCheckBox cbSkeletalPainRibs;
	private JLabel chest1ViewLabel_67;
	private JPanel panel_136;
	private JCheckBox cbSkeletalPainExt;
	private JLabel chest1ViewLabel_66;
	private JPanel panel_135;
	private JCheckBox cbSkeletalBruiseLower;
	private JLabel chest1ViewLabel_65;
	private JPanel panel_134;
	private JCheckBox cbSkeletalBruiseUpper;
	private JLabel chest1ViewLabel_62;
	private JPanel panel_132;
	private JLabel label_75;
	private JLabel label_74;
	private JLabel label_73;
	private JLabel label_71;
	private JLabel label_70;
	private JLabel label_69;
	private JLabel label_68;
	private JLabel label_67;
	private JPanel panel_128;
	private JCheckBox cbOsteoSenile;
	private JLabel chest1ViewLabel_60;
	private JPanel panel_119;
	private JCheckBox cbOsteoOvarian;
	private JLabel chest1ViewLabel_52;
	private JPanel panel_118;
	private JCheckBox cbOsteoOsteo;
	private JLabel chest1ViewLabel_51;
	private JPanel panel_117;
	private JCheckBox cbOsteoDrug;
	private JLabel chest1ViewLabel_50;
	private JPanel panel_116;
	private JCheckBox cbOsteoDisUse;
	private JLabel chest1ViewLabel_49;
	private JPanel panel_113;
	private JPanel panel_111;
	private JLabel label_66;
	private JLabel label_65;
	private JLabel label_64;
	private JLabel label_62;
	private JLabel label_61;
	private JLabel label_60;
	private JLabel label_59;
	private JLabel label_58;
	private JPanel panel_100;
	private JTextArea icdTextArea_4;
	private JPanel panel_96;
	private JLabel label_56;
	private JLabel label_55;
	private JLabel label_54;
	private JLabel label_53;
	private JLabel label_51;
	private JLabel label_50;
	private JLabel label_49;
	private JLabel label_48;
	private JPanel panel_95;
	private JTextArea icdTextArea_3;
	private JPanel panel_98;
	private JLabel chestAndThoraxdLabel_9;
	private JPanel panel_97;
	private JLabel reasonForStudyLabel;
	private JPanel panel_77;
	private JCheckBox cbAbdomenOther;
	private JLabel chest1ViewLabel_77;
	private JPanel panel_133;
	private JLabel chestAndThoraxdLabel_13;
	private JPanel panel_130;
	private JCheckBox cbAbdomenPersistent;
	private JLabel chest1ViewLabel_74;
	private JPanel panel_129;
	private JCheckBox cbAbdomenFeeding;
	private JLabel chest1ViewLabel_71;
	private JPanel panel_126;
	private JCheckBox cbAbdomenPain;
	private JLabel chest1ViewLabel_70;
	private JPanel panel_125;
	private JCheckBox cbAbdomenDiarrhea;
	private JLabel chest1ViewLabel_69;
	private JPanel panel_124;
	private JCheckBox cbAbdomenNausea;
	private JLabel chest1ViewLabel_68;
	private JPanel panel_123;
	private JPanel panel_121;
	private JCheckBox cbChestOther;
	private JLabel chest1ViewLabel_64;
	private JPanel panel_115;
	private JCheckBox cbChestRespiratoryFailure;
	private JLabel chest1ViewLabel_63;
	private JPanel panel_114;
	private JCheckBox cbChestTuberculosis;
	private JLabel chest1ViewLabel_59;
	private JPanel panel_109;
	private JCheckBox cbChestPneumothorax;
	private JLabel chest1ViewLabel_58;
	private JPanel panel_108;
	private JCheckBox cbChestPneumonia;
	private JLabel chest1ViewLabel_57;
	private JPanel panel_107;
	private JCheckBox cbChestPain;
	private JLabel chest1ViewLabel_56;
	private JPanel panel_106;
	private JCheckBox cbChestInfiltrate;
	private JLabel chest1ViewLabel_55;
	private JPanel panel_105;
	private JCheckBox cbChestRales;
	private JLabel chest1ViewLabel_54;
	private JPanel panel_104;
	private JCheckBox cbChestShort;
	private JLabel chest1ViewLabel_53;
	private JPanel panel_103;
	private JLabel chestAndThoraxdLabel_10;
	private JPanel panel_102;
	private JPanel panel_101;
	private JLabel label_52;
	private JLabel label_47;
	private JLabel label_46;
	private JLabel label_45;
	private JLabel label_44;
	private JLabel label_43;
	private JLabel label_42;
	private JLabel label_41;
	private JLabel label_37;
	private JPanel panel_99;
	private JCheckBox cbChestWheezing;
	private JLabel chest1ViewLabel_48;
	private JPanel panel_94;
	private JCheckBox cbChestPost;
	private JLabel chest1ViewLabel_47;
	private JPanel panel_93;
	private JCheckBox cbChestTemp;
	private JLabel chest1ViewLabel_46;
	private JPanel panel_91;
	private JCheckBox cbChestCardiomegaly;
	private JLabel chest1ViewLabel_45;
	private JPanel panel_90;
	private JCheckBox cbChestCongestion;
	private JLabel chest1ViewLabel_44;
	private JPanel panel_89;
	private JCheckBox cbChestCOPD;
	private JLabel chest1ViewLabel_43;
	private JPanel panel_88;
	private JCheckBox cbChestCough;
	private JLabel chest1ViewLabel_42;
	private JPanel panel_87;
	private JCheckBox cbChestCHF;
	private JLabel chest1ViewLabel_41;
	private JPanel panel_86;
	private JCheckBox cbChestAtelectasis;
	private JLabel chest1ViewLabel_38;
	private JPanel panel_85;
	private JLabel chestAndThoraxdLabel_8;
	private JPanel panel_84;
	private JPanel panel_83;
	private JPanel panel_82;
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
	private JRadioButton rbDescTptQ0092;
	private JRadioButton rbDescTptR0075;
	private JRadioButton rbDescTptR0070;
	private JLabel weightLabel_9;
	private JLabel weightLabel_8;
	private JLabel weightLabel_7;
	private JLabel weightLabel_6;
	private JPanel panel_69;
	private JCheckBox cbXrayNo;
	private JCheckBox cbXrayYes;
	private JLabel yesLabel_1;
	private JLabel yesLabel;
	private JTextArea ofPtTextArea_2;
	private JPanel panel_75;
	private JLabel weightLabel_5;
	private JPanel panel_74;
	private JTextArea ofPtTextArea_1;
	private JPanel panel_73;
	private JTextArea ofPt_TextArea;
	private JPanel panel_72;
	private JLabel weightLabel_4;
	private JPanel panel_71;
	private JLabel weightLabel_3;
	private JPanel panel_70;
	private JLabel weightLabel_2;
	private JPanel panel_67;
	private JTextField txtBoneWeight;
	private JTextField txtBoneHeight;
	private JLabel weightLabel_1;
	private JPanel panel_68;
	private JLabel weightLabel;
	private JPanel panel_65;
	private JCheckBox cbBone;
	private JLabel chestAndThoraxdLabel_7;
	private JPanel panel_66;
	private JPanel panel_64;
	private JPanel panel_63;
	private JPanel panel_61;
	private JLabel otherLabel_1;
	private JPanel panel_62;
	private JPanel panel_22;
	private JLabel otherLabel;
	private JLabel chestAndThoraxdLabel_6;
	private JPanel panel_56;
	private JCheckBox cbLowerToeR;
	private JLabel chest1ViewLabel_35;
	private JPanel panel_53;
	private JCheckBox cbLowerHeelR;
	private JLabel chest1ViewLabel_34;
	private JPanel panel_52;
	private JCheckBox cbLowerFootR;
	private JLabel chest1ViewLabel_33;
	private JPanel panel_51;
	private JLabel label_40;
	private JLabel label_22;
	private JCheckBox cbSpinalSacrum;
	private JLabel chest1ViewLabel_40;
	private JPanel panel_60;
	private JCheckBox cbSpinalPelvis;
	private JLabel chest1ViewLabel_39;
	private JPanel panel_59;
	private JCheckBox cbSpinalPelvisComp;
	private JLabel chest1ViewLabel_22;
	private JPanel panel_35;
	private JCheckBox cbUpperFingerR;
	private JLabel chest1ViewLabel_21;
	private JPanel panel_34;
	private JCheckBox cbUpperHandR;
	private JLabel chest1ViewLabel_20;
	private JPanel panel_33;
	private JLabel label_39;
	private JLabel label_38;
	private JLabel label_36;
	private JLabel label_35;
	private JLabel label_34;
	private JLabel label_33;
	private JLabel label_32;
	private JLabel label_31;
	private JLabel label_30;
	private JLabel label_29;
	private JLabel label_28;
	private JLabel label_27;
	private JTextArea icdTextArea_2;
	private JPanel panel_58;
	private JPanel panel_57;
	private JCheckBox cbAbdomenAcute;
	private JLabel chest1ViewLabel_37;
	private JPanel panel_55;
	private JCheckBox cbAbdomenKUB;
	private JLabel chest1ViewLabel_36;
	private JPanel panel_54;
	private JLabel chestAndThoraxdLabel_5;
	private JPanel panel_50;
	private JCheckBox cbLowerAnkleR;
	private JLabel chest1ViewLabel_32;
	private JPanel panel_49;
	private JCheckBox cbLowerTibiaR;
	private JLabel chest1ViewLabel_31;
	private JPanel panel_48;
	private JCheckBox cbLowerKneeCompR;
	private JLabel chest1ViewLabel_30;
	private JPanel panel_47;
	private JCheckBox cbLowerKneeR;
	private JLabel chest1ViewLabel_29;
	private JPanel panel_46;
	private JCheckBox cbLowerFemurR;
	private JLabel chest1ViewLabel_28;
	private JPanel panel_45;
	private JCheckBox cbLowerHipBilat;
	private JLabel chest1ViewLabel_27;
	private JPanel panel_44;
	private JCheckBox cbLowerHipR;
	private JLabel chest1ViewLabel_26;
	private JPanel panel_43;
	private JLabel chestAndThoraxdLabel_4;
	private JPanel panel_42;
	private JPanel panel_41;
	private JLabel label_26;
	private JLabel label_25;
	private JLabel label_24;
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
	private JCheckBox cbSpinalThoracic;
	private JLabel chest1ViewLabel_25;
	private JPanel panel_38;
	private JCheckBox cbSpinalCervical;
	private JLabel chest1ViewLabel_24;
	private JPanel panel_37;
	private JCheckBox cbSpinalLumbosacral;
	private JLabel chest1ViewLabel_23;
	private JPanel panel_36;
	private JLabel chestAndThoraxdLabel_3;
	private JPanel panel_32;
	private JCheckBox cbUpperWristR;
	private JLabel chest1ViewLabel_19;
	private JPanel panel_31;
	private JCheckBox cbUpperElbowR;
	private JLabel chest1ViewLabel_18;
	private JPanel panel_30;
	private JCheckBox cbUpperForearmR;
	private JLabel chest1ViewLabel_17;
	private JPanel panel_29;
	private JCheckBox cbUpperHumerusR;
	private JLabel chest1ViewLabel_16;
	private JPanel panel_28;
	private JCheckBox cbUpperScapulaR;
	private JLabel chest1ViewLabel_15;
	private JPanel panel_27;
	private JCheckBox cbUpperClavicleR;
	private JLabel chest1ViewLabel_14;
	private JPanel panel_26;
	private JCheckBox cbUpperShoulderR;
	private JLabel chest1ViewLabel_13;
	private JPanel panel_25;
	private JLabel chestAndThoraxdLabel_2;
	private JPanel panel_24;
	private JPanel panel_23;
	private JLabel label_13;
	private JLabel label_12;
	private JLabel label_11;
	private JLabel label_10;
	private JLabel label_9;
	private JLabel label_8;
	private JLabel label_7;
	private JLabel label_6;
	private JLabel label_5;
	private JLabel label_4;
	private JLabel label_3;
	private JLabel label_2;
	private JLabel label;
	private JTextArea icd_TextArea;
	private JPanel panel_8;
	private JPanel panel_5;
	private JCheckBox cbHeadOrbits;
	private JLabel chest1ViewLabel_12;
	private JPanel panel_21;
	private JCheckBox cbHeadSinuses;
	private JLabel chest1ViewLabel_11;
	private JPanel panel_20;
	private JCheckBox cbHeadMandible;
	private JLabel chest1ViewLabel_10;
	private JPanel panel_19;
	private JCheckBox cbHeadFBSinuses;
	private JLabel chest1ViewLabel_9;
	private JPanel panel_18;
	private JCheckBox cbHeadFBNasal;
	private JLabel chest1ViewLabel_8;
	private JPanel panel_17;
	private JCheckBox cbHeadSkull;
	private JLabel chest1ViewLabel_7;
	private JPanel panel_16;
	private JLabel chestAndThoraxdLabel_1;
	private JPanel panel_15;
	private JCheckBox cbChestAndThoraxRibsB;
	private JLabel chest1ViewLabel_6;
	private JPanel panel_14;
	private JCheckBox cbChestAndThoraxRibsUniCRR;
	private JLabel chest1ViewLabel_5;
	private JPanel panel_13;
	private JLabel chest1ViewLabel_4;
	private JPanel panel_12;
	private JCheckBox cbChestAndThoraxDecub;
	private JLabel chest1ViewLabel_3;
	private JPanel panel_11;
	private JCheckBox cbChestAndThoraxChestAPAL;
	private JLabel chest1ViewLabel_2;
	private JPanel panel_10;
	private JCheckBox cbChestAndThoraxChestAPL;
	private JLabel chest1ViewLabel_1;
	private JPanel panel_9;
	private JCheckBox cbChestAndThoraxChest;
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
	public PanelMadexForm1() {
		super();
		Global.panelMadexForm1 = this;
		setPreferredSize(new Dimension(900, 1200));
		setBackground(Color.WHITE);
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(17, 10, 836, 1156);
		add(panel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(108, 0, 231, 126);
		panel.add(panel_1);

		medfaxLabel = new JLabel();
		medfaxLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		medfaxLabel.setText("MEDFAX");
		medfaxLabel.setBounds(29, 0, 107, 23);
		panel_1.add(medfaxLabel);

		portableDiagnosticsLabel = new JLabel();
		portableDiagnosticsLabel.setFont(new Font("", Font.BOLD, 14));
		portableDiagnosticsLabel.setText("Portable Diagnostics");
		portableDiagnosticsLabel.setBounds(23, 24, 179, 23);
		panel_1.add(portableDiagnosticsLabel);

		portableDiagnosticsLabel_1 = new JLabel();
		portableDiagnosticsLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		portableDiagnosticsLabel_1.setText("PRECISION HEALTH INC.");
		portableDiagnosticsLabel_1.setBounds(23, 48, 179, 23);
		panel_1.add(portableDiagnosticsLabel_1);

		portableDiagnosticsLabel_2 = new JLabel();
		portableDiagnosticsLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		portableDiagnosticsLabel_2.setText("1(800) XRAY-EXAM");
		portableDiagnosticsLabel_2.setBounds(23, 72, 179, 23);
		panel_1.add(portableDiagnosticsLabel_2);

		portableDiagnosticsLabel_3 = new JLabel();
		portableDiagnosticsLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		portableDiagnosticsLabel_3.setText("1(800) 972-9392");
		portableDiagnosticsLabel_3.setBounds(23, 101, 179, 23);
		panel_1.add(portableDiagnosticsLabel_3);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(2, 127, 798, 77);
		panel.add(panel_2);

		facilityLabel = new JLabel();
		facilityLabel.setText("Facility:");
		facilityLabel.setBounds(5, 3, 37, 14);
		panel_2.add(facilityLabel);

		txtFacility = new JTextArea();
		txtFacility.setBounds(51, 1, 254, 20);
		panel_2.add(txtFacility);

		facilityLabel_1 = new JLabel();
		facilityLabel_1.setText("Patient:");
		facilityLabel_1.setBounds(311, 4, 46, 14);
		panel_2.add(facilityLabel_1);

		txtPatient = new JTextField();
		txtPatient.setBounds(367, 1, 254, 20);
		panel_2.add(txtPatient);

		cbMale = new JCheckBox();
		cbMale.setBackground(Color.WHITE);
		cbMale.setText("M");
		cbMale.setBounds(700, 1, 37, 18);
		panel_2.add(cbMale);

		cbFemale = new JCheckBox();
		cbFemale.setBackground(Color.WHITE);
		cbFemale.setText("F");
		cbFemale.setBounds(743, 1, 37, 18);
		panel_2.add(cbFemale);

		facilityLabel_2 = new JLabel();
		facilityLabel_2.setText("Medicare No.:");
		facilityLabel_2.setBounds(5, 25, 67, 14);
		panel_2.add(facilityLabel_2);

		cbMedicareA = new JCheckBox();
		cbMedicareA.setBackground(Color.WHITE);
		cbMedicareA.setText("A");
		cbMedicareA.setBounds(78, 25, 26, 18);
		panel_2.add(cbMedicareA);

		cbMedicareB = new JCheckBox();
		cbMedicareB.setBackground(Color.WHITE);
		cbMedicareB.setText("B");
		cbMedicareB.setBounds(110, 25, 26, 18);
		panel_2.add(cbMedicareB);

		txtMedicareNo = new JTextArea();
		txtMedicareNo.setBounds(149, 20, 254, 20);
		panel_2.add(txtMedicareNo);

		facilityLabel_3 = new JLabel();
		facilityLabel_3.setText("Date of Birth:");
		facilityLabel_3.setBounds(418, 25, 67, 14);
		panel_2.add(facilityLabel_3);

		dcBirth = new JDateChooser();
		dcBirth.setDateFormatString("MM/dd/yyyy");
		dcBirth.setBounds(491, 23, 92, 20);
		panel_2.add(dcBirth);

		facilityLabel_4 = new JLabel();
		facilityLabel_4.setText("Rm. No.");
		facilityLabel_4.setBounds(618, 25, 46, 14);
		panel_2.add(facilityLabel_4);

		txtRmNo = new JTextField();
		txtRmNo.setBounds(663, 20, 125, 20);
		panel_2.add(txtRmNo);

		facilityLabel_5 = new JLabel();
		facilityLabel_5.setText("Medicaid No.:");
		facilityLabel_5.setBounds(5, 55, 69, 14);
		panel_2.add(facilityLabel_5);

		txtMedicaidNo = new JTextField();
		txtMedicaidNo.setBounds(78, 55, 109, 20);
		panel_2.add(txtMedicaidNo);

		suffixLabel = new JLabel();
		suffixLabel.setFont(new Font("", Font.PLAIN, 10));
		suffixLabel.setText("(Suffix)");
		suffixLabel.setBounds(120, 40, 46, 13);
		panel_2.add(suffixLabel);

		facilityLabel_6 = new JLabel();
		facilityLabel_6.setText("Insurance Policy #:");
		facilityLabel_6.setBounds(193, 55, 99, 14);
		panel_2.add(facilityLabel_6);

		txtInsurance = new JTextArea();
		txtInsurance.setBounds(290, 55, 117, 20);
		panel_2.add(txtInsurance);

		facilityLabel_7 = new JLabel();
		facilityLabel_7.setText("Pre-Approval#:");
		facilityLabel_7.setBounds(418, 56, 83, 14);
		panel_2.add(facilityLabel_7);

		txtPreApproval = new JTextArea();
		txtPreApproval.setBounds(507, 55, 117, 20);
		panel_2.add(txtPreApproval);

		facilityLabel_8 = new JLabel();
		facilityLabel_8.setText("Case#:");
		facilityLabel_8.setBounds(636, 55, 46, 14);
		panel_2.add(facilityLabel_8);

		txtCaseField = new JTextArea();
		txtCaseField.setBounds(681, 55, 107, 20);
		panel_2.add(txtCaseField);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(2, 205, 803, 299);
		panel.add(panel_3);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 210, 263);
		panel_3.add(panel_4);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setBackground(Color.GRAY);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 210, 22);
		panel_4.add(panel_6);

		chestAndThoraxdLabel = new JLabel();
		chestAndThoraxdLabel.setForeground(Color.WHITE);
		chestAndThoraxdLabel.setText("CHEST AND THORAX");
		chestAndThoraxdLabel.setBounds(28, 0, 113, 18);
		panel_6.add(chestAndThoraxdLabel);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		panel_7.setBounds(0, 22, 210, 18);
		panel_4.add(panel_7);

		chest1ViewLabel = new JLabel();
		chest1ViewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		chest1ViewLabel.setBackground(Color.WHITE);
		chest1ViewLabel.setForeground(Color.BLACK);
		chest1ViewLabel.setText("Chest (1 View)");
		chest1ViewLabel.setBounds(32, 1, 80, 14);
		panel_7.add(chest1ViewLabel);

		cbChestAndThoraxChest = new JCheckBox();
		cbChestAndThoraxChest.setText("cbChestAndThoraxChest");
		cbChestAndThoraxChest.setBounds(12, 1, 14, 16);
		panel_7.add(cbChestAndThoraxChest);
		cbChestAndThoraxChest.setBackground(Color.WHITE);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 39, 210, 18);
		panel_4.add(panel_9);

		chest1ViewLabel_1 = new JLabel();
		chest1ViewLabel_1.setText("Chest AP & Lateral (2 views)");
		chest1ViewLabel_1.setBounds(32, 1, 143, 14);
		panel_9.add(chest1ViewLabel_1);

		cbChestAndThoraxChestAPL = new JCheckBox();
		cbChestAndThoraxChestAPL.setBackground(Color.WHITE);
		cbChestAndThoraxChestAPL.setBounds(12, 1, 14, 16);
		panel_9.add(cbChestAndThoraxChestAPL);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 56, 210, 18);
		panel_4.add(panel_10);

		chest1ViewLabel_2 = new JLabel();
		chest1ViewLabel_2.setText("Chest AP & Apical Lordotic (2 Views)");
		chest1ViewLabel_2.setBounds(32, 1, 180, 14);
		panel_10.add(chest1ViewLabel_2);

		cbChestAndThoraxChestAPAL = new JCheckBox();
		cbChestAndThoraxChestAPAL.setBackground(Color.WHITE);
		cbChestAndThoraxChestAPAL.setBounds(12, 1, 14, 16);
		panel_10.add(cbChestAndThoraxChestAPAL);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 73, 210, 18);
		panel_4.add(panel_11);

		chest1ViewLabel_3 = new JLabel();
		chest1ViewLabel_3.setText("Decub. Obi Lat or Sternum");
		chest1ViewLabel_3.setBounds(32, 1, 127, 14);
		panel_11.add(chest1ViewLabel_3);

		cbChestAndThoraxDecub = new JCheckBox();
		cbChestAndThoraxDecub.setBackground(Color.WHITE);
		cbChestAndThoraxDecub.setBounds(12, 1, 14, 16);
		panel_11.add(cbChestAndThoraxDecub);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(0, 90, 210, 18);
		panel_4.add(panel_12);

		chest1ViewLabel_4 = new JLabel();
		chest1ViewLabel_4.setText("Ribs Unilateral (2 views)");
		chest1ViewLabel_4.setBounds(80, 1, 115, 14);
		panel_12.add(chest1ViewLabel_4);

		cbChestAndThoraxRibsUnilR = new JCheckBox();
		cbChestAndThoraxRibsUnilR.setBackground(Color.WHITE);
		cbChestAndThoraxRibsUnilR.setText("R");
		cbChestAndThoraxRibsUnilR.setBounds(12, -1, 30, 18);
		panel_12.add(cbChestAndThoraxRibsUnilR);

		cbChestAndThoraxRibsUnilL = new JCheckBox();
		cbChestAndThoraxRibsUnilL.setBackground(Color.WHITE);
		cbChestAndThoraxRibsUnilL.setText("L");
		cbChestAndThoraxRibsUnilL.setBounds(43, -1, 30, 18);
		panel_12.add(cbChestAndThoraxRibsUnilL);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(0, 107, 210, 18);
		panel_4.add(panel_13);

		chest1ViewLabel_5 = new JLabel();
		chest1ViewLabel_5.setText("Ribs Uni & Chest (3 Views)");
		chest1ViewLabel_5.setBounds(80, 1, 132, 14);
		panel_13.add(chest1ViewLabel_5);

		cbChestAndThoraxRibsUniCRR = new JCheckBox();
		cbChestAndThoraxRibsUniCRR.setText("R");
		cbChestAndThoraxRibsUniCRR.setBackground(Color.WHITE);
		cbChestAndThoraxRibsUniCRR.setBounds(12, 1, 25, 16);
		panel_13.add(cbChestAndThoraxRibsUniCRR);

		cbChestAndThoraxRibsUniCRL = new JCheckBox();
		cbChestAndThoraxRibsUniCRL.setBackground(Color.WHITE);
		cbChestAndThoraxRibsUniCRL.setText("L");
		cbChestAndThoraxRibsUniCRL.setBounds(43, 1, 25, 16);
		panel_13.add(cbChestAndThoraxRibsUniCRL);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 124, 210, 18);
		panel_4.add(panel_14);

		chest1ViewLabel_6 = new JLabel();
		chest1ViewLabel_6.setText("Ribs Bilat. & Chest (4 views)");
		chest1ViewLabel_6.setBounds(32, 1, 132, 14);
		panel_14.add(chest1ViewLabel_6);

		cbChestAndThoraxRibsB = new JCheckBox();
		cbChestAndThoraxRibsB.setBackground(Color.WHITE);
		cbChestAndThoraxRibsB.setBounds(12, 1, 14, 16);
		panel_14.add(cbChestAndThoraxRibsB);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.GRAY);
		panel_15.setBounds(0, 142, 210, 18);
		panel_4.add(panel_15);

		chestAndThoraxdLabel_1 = new JLabel();
		chestAndThoraxdLabel_1.setForeground(Color.WHITE);
		chestAndThoraxdLabel_1.setText("HEAD");
		chestAndThoraxdLabel_1.setBounds(59, 0, 59, 18);
		panel_15.add(chestAndThoraxdLabel_1);

		panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(0, 160, 210, 18);
		panel_4.add(panel_16);

		chest1ViewLabel_7 = new JLabel();
		chest1ViewLabel_7.setText("Skull (3 Views)/Orbits");
		chest1ViewLabel_7.setBounds(32, 1, 101, 14);
		panel_16.add(chest1ViewLabel_7);

		cbHeadSkull = new JCheckBox();
		cbHeadSkull.setBackground(Color.WHITE);
		cbHeadSkull.setBounds(12, 1, 14, 16);
		panel_16.add(cbHeadSkull);

		panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(0, 177, 210, 18);
		panel_4.add(panel_17);

		chest1ViewLabel_8 = new JLabel();
		chest1ViewLabel_8.setText("Facial Bones (2 Views) / Nasal");
		chest1ViewLabel_8.setBounds(32, 1, 142, 14);
		panel_17.add(chest1ViewLabel_8);

		cbHeadFBNasal = new JCheckBox();
		cbHeadFBNasal.setBackground(Color.WHITE);
		cbHeadFBNasal.setBounds(12, 1, 14, 16);
		panel_17.add(cbHeadFBNasal);

		panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 194, 210, 18);
		panel_4.add(panel_18);

		chest1ViewLabel_9 = new JLabel();
		chest1ViewLabel_9.setText("Facial Bones (2 Views) / Sinuses");
		chest1ViewLabel_9.setBounds(32, 1, 152, 14);
		panel_18.add(chest1ViewLabel_9);

		cbHeadFBSinuses = new JCheckBox();
		cbHeadFBSinuses.setBackground(Color.WHITE);
		cbHeadFBSinuses.setText("cbHeadFBSinuses");
		cbHeadFBSinuses.setBounds(12, 1, 14, 16);
		panel_18.add(cbHeadFBSinuses);

		panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(0, 211, 210, 18);
		panel_4.add(panel_19);

		chest1ViewLabel_10 = new JLabel();
		chest1ViewLabel_10.setText("Mandible (2 Views)");
		chest1ViewLabel_10.setBounds(32, 1, 110, 14);
		panel_19.add(chest1ViewLabel_10);

		cbHeadMandible = new JCheckBox();
		cbHeadMandible.setBackground(Color.WHITE);
		cbHeadMandible.setBounds(12, 1, 14, 16);
		panel_19.add(cbHeadMandible);

		panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(0, 228, 210, 18);
		panel_4.add(panel_20);

		chest1ViewLabel_11 = new JLabel();
		chest1ViewLabel_11.setText("Sinuses (3 Views)");
		chest1ViewLabel_11.setBounds(32, 1, 115, 14);
		panel_20.add(chest1ViewLabel_11);

		cbHeadSinuses = new JCheckBox();
		cbHeadSinuses.setBackground(Color.WHITE);
		cbHeadSinuses.setBounds(12, 1, 14, 16);
		panel_20.add(cbHeadSinuses);

		panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 245, 210, 18);
		panel_4.add(panel_21);

		chest1ViewLabel_12 = new JLabel();
		chest1ViewLabel_12.setText("Orbits Complete (4 Views)");
		chest1ViewLabel_12.setBounds(32, 1, 124, 14);
		panel_21.add(chest1ViewLabel_12);

		cbHeadOrbits = new JCheckBox();
		cbHeadOrbits.setBackground(Color.WHITE);
		cbHeadOrbits.setBounds(12, 1, 14, 16);
		panel_21.add(cbHeadOrbits);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(209, 0, 59, 263);
		panel_3.add(panel_5);

		panel_8 = new JPanel();
		panel_8.setBackground(Color.GRAY);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 59, 22);
		panel_5.add(panel_8);

		icd_TextArea = new JTextArea();
		icd_TextArea.setWrapStyleWord(true);
		icd_TextArea.setText("CPT CODE");
		icd_TextArea.setLineWrap(true);
		icd_TextArea.setForeground(Color.WHITE);
		icd_TextArea.setFont(new Font("", Font.PLAIN, 8));
		icd_TextArea.setBackground(Color.GRAY);
		icd_TextArea.setBounds(25, 1, 26, 20);
		panel_8.add(icd_TextArea);

		label = new JLabel();
		label.setBorder(new LineBorder(Color.black, 1, false));
		label.setText("71010");
		label.setBounds(0, 22, 59, 18);
		panel_5.add(label);

		label_2 = new JLabel();
		label_2.setBorder(new LineBorder(Color.black, 1, false));
		label_2.setText("71020");
		label_2.setBounds(0, 39, 59, 18);
		panel_5.add(label_2);

		label_3 = new JLabel();
		label_3.setBorder(new LineBorder(Color.black, 1, false));
		label_3.setText("71035");
		label_3.setBounds(0, 73, 59, 18);
		panel_5.add(label_3);

		label_4 = new JLabel();
		label_4.setBorder(new LineBorder(Color.black, 1, false));
		label_4.setText("71021");
		label_4.setBounds(0, 56, 59, 18);
		panel_5.add(label_4);

		label_5 = new JLabel();
		label_5.setBorder(new LineBorder(Color.black, 1, false));
		label_5.setText("71100");
		label_5.setBounds(0, 90, 59, 18);
		panel_5.add(label_5);

		label_6 = new JLabel();
		label_6.setBorder(new LineBorder(Color.black, 1, false));
		label_6.setText("71101");
		label_6.setBounds(0, 107, 59, 18);
		panel_5.add(label_6);

		label_7 = new JLabel();
		label_7.setBorder(new LineBorder(Color.black, 1, false));
		label_7.setText("71111");
		label_7.setBounds(0, 124, 59, 18);
		panel_5.add(label_7);

		label_8 = new JLabel();
		label_8.setBorder(new LineBorder(Color.black, 1, false));
		label_8.setText("70250");
		label_8.setBounds(0, 160, 59, 18);
		panel_5.add(label_8);

		label_9 = new JLabel();
		label_9.setBorder(new LineBorder(Color.black, 1, false));
		label_9.setText("70140");
		label_9.setBounds(0, 177, 59, 18);
		panel_5.add(label_9);

		label_10 = new JLabel();
		label_10.setBorder(new LineBorder(Color.black, 1, false));
		label_10.setText("70140");
		label_10.setBounds(0, 194, 59, 18);
		panel_5.add(label_10);

		label_11 = new JLabel();
		label_11.setBorder(new LineBorder(Color.black, 1, false));
		label_11.setText("70100");
		label_11.setBounds(0, 211, 59, 18);
		panel_5.add(label_11);

		label_12 = new JLabel();
		label_12.setBorder(new LineBorder(Color.black, 1, false));
		label_12.setText("70220");
		label_12.setBounds(0, 228, 59, 18);
		panel_5.add(label_12);

		label_13 = new JLabel();
		label_13.setBorder(new LineBorder(Color.black, 1, false));
		label_13.setText("70200");
		label_13.setBounds(0, 245, 59, 18);
		panel_5.add(label_13);

		panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(267, 0, 210, 298);
		panel_3.add(panel_23);

		panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.GRAY);
		panel_24.setBounds(0, 0, 210, 22);
		panel_23.add(panel_24);

		chestAndThoraxdLabel_2 = new JLabel();
		chestAndThoraxdLabel_2.setForeground(Color.WHITE);
		chestAndThoraxdLabel_2.setText("UPPER EXTREMITIES");
		chestAndThoraxdLabel_2.setBounds(28, 0, 113, 18);
		panel_24.add(chestAndThoraxdLabel_2);

		panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(0, 22, 210, 18);
		panel_23.add(panel_25);

		chest1ViewLabel_13 = new JLabel();
		chest1ViewLabel_13.setText("Shoulder (2 Views)");
		chest1ViewLabel_13.setBounds(80, 1, 89, 14);
		panel_25.add(chest1ViewLabel_13);

		cbUpperShoulderR = new JCheckBox();
		cbUpperShoulderR.setText("R");
		cbUpperShoulderR.setBackground(Color.WHITE);
		cbUpperShoulderR.setBounds(12, 1, 25, 16);
		panel_25.add(cbUpperShoulderR);

		cbUpperShoulderL = new JCheckBox();
		cbUpperShoulderL.setBackground(Color.WHITE);
		cbUpperShoulderL.setText("L");
		cbUpperShoulderL.setBounds(43, 1, 25, 16);
		panel_25.add(cbUpperShoulderL);

		panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(0, 39, 210, 18);
		panel_23.add(panel_26);

		chest1ViewLabel_14 = new JLabel();
		chest1ViewLabel_14.setText("Clavicle  (2 Views)");
		chest1ViewLabel_14.setBounds(80, 1, 86, 14);
		panel_26.add(chest1ViewLabel_14);

		cbUpperClavicleR = new JCheckBox();
		cbUpperClavicleR.setText("R");
		cbUpperClavicleR.setBackground(Color.WHITE);
		cbUpperClavicleR.setBounds(12, 1, 25, 16);
		panel_26.add(cbUpperClavicleR);

		cbUpperClavicleL = new JCheckBox();
		cbUpperClavicleL.setBackground(Color.WHITE);
		cbUpperClavicleL.setText("L");
		cbUpperClavicleL.setBounds(43, 1, 25, 16);
		panel_26.add(cbUpperClavicleL);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(0, 56, 210, 18);
		panel_23.add(panel_27);

		chest1ViewLabel_15 = new JLabel();
		chest1ViewLabel_15.setText("Scapula  (2 Views)");
		chest1ViewLabel_15.setBounds(80, 1, 87, 14);
		panel_27.add(chest1ViewLabel_15);

		cbUpperScapulaR = new JCheckBox();
		cbUpperScapulaR.setText("R");
		cbUpperScapulaR.setBackground(Color.WHITE);
		cbUpperScapulaR.setBounds(12, 1, 25, 16);
		panel_27.add(cbUpperScapulaR);

		cbUpperScapulaL = new JCheckBox();
		cbUpperScapulaL.setBackground(Color.WHITE);
		cbUpperScapulaL.setText("L");
		cbUpperScapulaL.setBounds(43, 1, 25, 16);
		panel_27.add(cbUpperScapulaL);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 73, 210, 18);
		panel_23.add(panel_28);

		chest1ViewLabel_16 = new JLabel();
		chest1ViewLabel_16.setText("Humerus (2 Views)");
		chest1ViewLabel_16.setBounds(80, 1, 89, 14);
		panel_28.add(chest1ViewLabel_16);

		cbUpperHumerusR = new JCheckBox();
		cbUpperHumerusR.setBackground(Color.WHITE);
		cbUpperHumerusR.setText("R");
		cbUpperHumerusR.setBounds(12, 1, 25, 16);
		panel_28.add(cbUpperHumerusR);

		cbUpperHumerusL = new JCheckBox();
		cbUpperHumerusL.setBackground(Color.WHITE);
		cbUpperHumerusL.setText("L");
		cbUpperHumerusL.setBounds(43, 1, 25, 16);
		panel_28.add(cbUpperHumerusL);

		panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(0, 90, 210, 18);
		panel_23.add(panel_29);

		chest1ViewLabel_17 = new JLabel();
		chest1ViewLabel_17.setText("Forearm  (2 Views)");
		chest1ViewLabel_17.setBounds(80, 1, 90, 14);
		panel_29.add(chest1ViewLabel_17);

		cbUpperForearmR = new JCheckBox();
		cbUpperForearmR.setBackground(Color.WHITE);
		cbUpperForearmR.setText("R");
		cbUpperForearmR.setBounds(12, 1, 25, 16);
		panel_29.add(cbUpperForearmR);

		cbUpperForearmL = new JCheckBox();
		cbUpperForearmL.setBackground(Color.WHITE);
		cbUpperForearmL.setText("L");
		cbUpperForearmL.setBounds(43, 1, 25, 16);
		panel_29.add(cbUpperForearmL);

		panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(0, 107, 210, 18);
		panel_23.add(panel_30);

		chest1ViewLabel_18 = new JLabel();
		chest1ViewLabel_18.setText("Elbow  (3 Views)");
		chest1ViewLabel_18.setBounds(80, 1, 85, 14);
		panel_30.add(chest1ViewLabel_18);

		cbUpperElbowR = new JCheckBox();
		cbUpperElbowR.setBackground(Color.WHITE);
		cbUpperElbowR.setText("R");
		cbUpperElbowR.setBounds(12, 1, 25, 16);
		panel_30.add(cbUpperElbowR);

		cbUpperElbowL = new JCheckBox();
		cbUpperElbowL.setBackground(Color.WHITE);
		cbUpperElbowL.setText("L");
		cbUpperElbowL.setBounds(43, 1, 25, 16);
		panel_30.add(cbUpperElbowL);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 124, 210, 18);
		panel_23.add(panel_31);

		chest1ViewLabel_19 = new JLabel();
		chest1ViewLabel_19.setText(" Wrist Comp(3 Views)");
		chest1ViewLabel_19.setBounds(80, 1, 102, 14);
		panel_31.add(chest1ViewLabel_19);

		cbUpperWristR = new JCheckBox();
		cbUpperWristR.setBackground(Color.WHITE);
		cbUpperWristR.setText("R");
		cbUpperWristR.setBounds(12, 1, 25, 16);
		panel_31.add(cbUpperWristR);

		cbUpperWristL = new JCheckBox();
		cbUpperWristL.setBackground(Color.WHITE);
		cbUpperWristL.setText("L");
		cbUpperWristL.setBounds(43, 1, 25, 16);
		panel_31.add(cbUpperWristL);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.GRAY);
		panel_32.setBounds(0, 177, 210, 18);
		panel_23.add(panel_32);

		chestAndThoraxdLabel_3 = new JLabel();
		chestAndThoraxdLabel_3.setForeground(Color.WHITE);
		chestAndThoraxdLabel_3.setText("SPINAL COLUMN");
		chestAndThoraxdLabel_3.setBounds(38, 0, 94, 18);
		panel_32.add(chestAndThoraxdLabel_3);

		panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setBounds(0, 194, 210, 18);
		panel_23.add(panel_36);

		chest1ViewLabel_23 = new JLabel();
		chest1ViewLabel_23.setText("Lumbosacral  (2 Views)");
		chest1ViewLabel_23.setBounds(32, 1, 120, 14);
		panel_36.add(chest1ViewLabel_23);

		cbSpinalLumbosacral = new JCheckBox();
		cbSpinalLumbosacral.setBackground(Color.WHITE);
		cbSpinalLumbosacral.setText("New JCheckBox");
		cbSpinalLumbosacral.setBounds(12, 1, 14, 16);
		panel_36.add(cbSpinalLumbosacral);

		panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(Color.black, 1, false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(0, 211, 210, 18);
		panel_23.add(panel_37);

		chest1ViewLabel_24 = new JLabel();
		chest1ViewLabel_24.setText("Cervical (2 Views)");
		chest1ViewLabel_24.setBounds(32, 1, 114, 14);
		panel_37.add(chest1ViewLabel_24);

		cbSpinalCervical = new JCheckBox();
		cbSpinalCervical.setBackground(Color.WHITE);
		cbSpinalCervical.setText("New JCheckBox");
		cbSpinalCervical.setBounds(12, 1, 14, 16);
		panel_37.add(cbSpinalCervical);

		panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(Color.black, 1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(0, 228, 210, 18);
		panel_23.add(panel_38);

		chest1ViewLabel_25 = new JLabel();
		chest1ViewLabel_25.setText(" Thoracic (2 Views)");
		chest1ViewLabel_25.setBounds(32, 1, 124, 14);
		panel_38.add(chest1ViewLabel_25);

		cbSpinalThoracic = new JCheckBox();
		cbSpinalThoracic.setBackground(Color.WHITE);
		cbSpinalThoracic.setText("New JCheckBox");
		cbSpinalThoracic.setBounds(12, 1, 14, 16);
		panel_38.add(cbSpinalThoracic);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 142, 210, 18);
		panel_23.add(panel_33);

		chest1ViewLabel_20 = new JLabel();
		chest1ViewLabel_20.setText("Hand Comp (3 Views)");
		chest1ViewLabel_20.setBounds(80, 1, 102, 14);
		panel_33.add(chest1ViewLabel_20);

		cbUpperHandR = new JCheckBox();
		cbUpperHandR.setBackground(Color.WHITE);
		cbUpperHandR.setText("R");
		cbUpperHandR.setBounds(12, 1, 25, 16);
		panel_33.add(cbUpperHandR);

		cbUpperHandL = new JCheckBox();
		cbUpperHandL.setBackground(Color.WHITE);
		cbUpperHandL.setText("L");
		cbUpperHandL.setBounds(43, 1, 25, 16);
		panel_33.add(cbUpperHandL);

		panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(Color.black, 1, false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(0, 160, 210, 18);
		panel_23.add(panel_34);

		chest1ViewLabel_21 = new JLabel();
		chest1ViewLabel_21.setText(" Finger (2 Views)");
		chest1ViewLabel_21.setBounds(80, 1, 80, 14);
		panel_34.add(chest1ViewLabel_21);

		cbUpperFingerR = new JCheckBox();
		cbUpperFingerR.setBackground(Color.WHITE);
		cbUpperFingerR.setText("R");
		cbUpperFingerR.setBounds(12, 1, 25, 16);
		panel_34.add(cbUpperFingerR);

		cbUpperFingerL = new JCheckBox();
		cbUpperFingerL.setBackground(Color.WHITE);
		cbUpperFingerL.setText("L");
		cbUpperFingerL.setBounds(43, 1, 25, 16);
		panel_34.add(cbUpperFingerL);

		panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(Color.black, 1, false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(0, 245, 210, 18);
		panel_23.add(panel_35);

		chest1ViewLabel_22 = new JLabel();
		chest1ViewLabel_22.setText(" Pelvis Comp (3 Views)");
		chest1ViewLabel_22.setBounds(32, 1, 115, 14);
		panel_35.add(chest1ViewLabel_22);

		cbSpinalPelvisComp = new JCheckBox();
		cbSpinalPelvisComp.setBackground(Color.WHITE);
		cbSpinalPelvisComp.setText("New JCheckBox");
		cbSpinalPelvisComp.setBounds(12, 1, 14, 16);
		panel_35.add(cbSpinalPelvisComp);

		panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(Color.black, 1, false));
		panel_59.setLayout(null);
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(0, 262, 210, 18);
		panel_23.add(panel_59);

		chest1ViewLabel_39 = new JLabel();
		chest1ViewLabel_39.setText("Pelvis (1 View)");
		chest1ViewLabel_39.setBounds(32, 1, 80, 14);
		panel_59.add(chest1ViewLabel_39);

		cbSpinalPelvis = new JCheckBox();
		cbSpinalPelvis.setBackground(Color.WHITE);
		cbSpinalPelvis.setText("New JCheckBox");
		cbSpinalPelvis.setBounds(12, 1, 14, 16);
		panel_59.add(cbSpinalPelvis);

		panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(Color.black, 1, false));
		panel_60.setLayout(null);
		panel_60.setBackground(Color.WHITE);
		panel_60.setBounds(0, 279, 210, 18);
		panel_23.add(panel_60);

		chest1ViewLabel_40 = new JLabel();
		chest1ViewLabel_40.setText("Sacrum & Coccyx (2 Views)");
		chest1ViewLabel_40.setBounds(32, 1, 130, 14);
		panel_60.add(chest1ViewLabel_40);

		cbSpinalSacrum = new JCheckBox();
		cbSpinalSacrum.setBackground(Color.WHITE);
		cbSpinalSacrum.setText("New JCheckBox");
		cbSpinalSacrum.setBounds(12, 1, 14, 16);
		panel_60.add(cbSpinalSacrum);

		panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(Color.black, 1, false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(477, 0, 59, 298);
		panel_3.add(panel_39);

		panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(Color.black, 1, false));
		panel_40.setLayout(null);
		panel_40.setBackground(Color.GRAY);
		panel_40.setBounds(0, 0, 59, 22);
		panel_39.add(panel_40);

		icdTextArea_1 = new JTextArea();
		icdTextArea_1.setWrapStyleWord(true);
		icdTextArea_1.setText("CPT CODE");
		icdTextArea_1.setLineWrap(true);
		icdTextArea_1.setForeground(Color.WHITE);
		icdTextArea_1.setFont(new Font("Dialog", Font.BOLD, 8));
		icdTextArea_1.setBackground(Color.GRAY);
		icdTextArea_1.setBounds(25, 1, 33, 20);
		panel_40.add(icdTextArea_1);

		label_14 = new JLabel();
		label_14.setBorder(new LineBorder(Color.black, 1, false));
		label_14.setText("73030");
		label_14.setBounds(0, 22, 59, 18);
		panel_39.add(label_14);

		label_15 = new JLabel();
		label_15.setBorder(new LineBorder(Color.black, 1, false));
		label_15.setText("73000");
		label_15.setBounds(0, 39, 59, 18);
		panel_39.add(label_15);

		label_16 = new JLabel();
		label_16.setBorder(new LineBorder(Color.black, 1, false));
		label_16.setText("73010");
		label_16.setBounds(0, 56, 59, 18);
		panel_39.add(label_16);

		label_17 = new JLabel();
		label_17.setBorder(new LineBorder(Color.black, 1, false));
		label_17.setText("73060");
		label_17.setBounds(0, 73, 59, 18);
		panel_39.add(label_17);

		label_18 = new JLabel();
		label_18.setBorder(new LineBorder(Color.black, 1, false));
		label_18.setText("73090");
		label_18.setBounds(0, 90, 59, 18);
		panel_39.add(label_18);

		label_19 = new JLabel();
		label_19.setBorder(new LineBorder(Color.black, 1, false));
		label_19.setText("73080");
		label_19.setBounds(0, 107, 59, 18);
		panel_39.add(label_19);

		label_20 = new JLabel();
		label_20.setBorder(new LineBorder(Color.black, 1, false));
		label_20.setText("73110");
		label_20.setBounds(0, 124, 59, 18);
		panel_39.add(label_20);

		label_21 = new JLabel();
		label_21.setBorder(new LineBorder(Color.black, 1, false));
		label_21.setText("73130");
		label_21.setBounds(0, 141, 59, 18);
		panel_39.add(label_21);

		label_23 = new JLabel();
		label_23.setBorder(new LineBorder(Color.black, 1, false));
		label_23.setText("72100");
		label_23.setBounds(0, 194, 59, 18);
		panel_39.add(label_23);

		label_24 = new JLabel();
		label_24.setBorder(new LineBorder(Color.black, 1, false));
		label_24.setText("72040");
		label_24.setBounds(0, 211, 59, 18);
		panel_39.add(label_24);

		label_25 = new JLabel();
		label_25.setBorder(new LineBorder(Color.black, 1, false));
		label_25.setText("72070");
		label_25.setBounds(0, 228, 59, 18);
		panel_39.add(label_25);

		label_26 = new JLabel();
		label_26.setBorder(new LineBorder(Color.black, 1, false));
		label_26.setText("72190");
		label_26.setBounds(0, 245, 59, 18);
		panel_39.add(label_26);

		label_22 = new JLabel();
		label_22.setBorder(new LineBorder(Color.black, 1, false));
		label_22.setText("72170");
		label_22.setBounds(0, 262, 59, 18);
		panel_39.add(label_22);

		label_40 = new JLabel();
		label_40.setBorder(new LineBorder(Color.black, 1, false));
		label_40.setText("72220");
		label_40.setBounds(0, 279, 59, 18);
		panel_39.add(label_40);

		label_103 = new JLabel();
		label_103.setBorder(new LineBorder(Color.black, 1, false));
		label_103.setText("73140");
		label_103.setBounds(0, 157, 59, 18);
		panel_39.add(label_103);

		panel_41 = new JPanel();
		panel_41.setBorder(new LineBorder(Color.black, 1, false));
		panel_41.setLayout(null);
		panel_41.setBackground(Color.WHITE);
		panel_41.setBounds(535, 0, 210, 246);
		panel_3.add(panel_41);

		panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(Color.black, 1, false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.GRAY);
		panel_42.setBounds(0, 0, 210, 22);
		panel_41.add(panel_42);

		chestAndThoraxdLabel_4 = new JLabel();
		chestAndThoraxdLabel_4.setForeground(Color.WHITE);
		chestAndThoraxdLabel_4.setText("LOWER EXTREMITIES");
		chestAndThoraxdLabel_4.setBounds(28, 0, 113, 18);
		panel_42.add(chestAndThoraxdLabel_4);

		panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(Color.black, 1, false));
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(0, 22, 210, 18);
		panel_41.add(panel_43);

		chest1ViewLabel_26 = new JLabel();
		chest1ViewLabel_26.setText("Hip (2 Views)");
		chest1ViewLabel_26.setBounds(80, 1, 62, 14);
		panel_43.add(chest1ViewLabel_26);

		cbLowerHipR = new JCheckBox();
		cbLowerHipR.setBackground(Color.WHITE);
		cbLowerHipR.setText("R");
		cbLowerHipR.setBounds(12, 1, 25, 16);
		panel_43.add(cbLowerHipR);

		cbLowerHipL = new JCheckBox();
		cbLowerHipL.setBackground(Color.WHITE);
		cbLowerHipL.setText("L");
		cbLowerHipL.setBounds(43, 1, 25, 16);
		panel_43.add(cbLowerHipL);

		panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(Color.black, 1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(0, 39, 210, 18);
		panel_41.add(panel_44);

		chest1ViewLabel_27 = new JLabel();
		chest1ViewLabel_27.setText("Hip Bilat & Pelvis (5 Views)");
		chest1ViewLabel_27.setBounds(32, 1, 143, 14);
		panel_44.add(chest1ViewLabel_27);

		cbLowerHipBilat = new JCheckBox();
		cbLowerHipBilat.setBackground(Color.WHITE);
		cbLowerHipBilat.setText("New JCheckBox");
		cbLowerHipBilat.setBounds(12, 1, 14, 16);
		panel_44.add(cbLowerHipBilat);

		panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(Color.black, 1, false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(0, 56, 210, 18);
		panel_41.add(panel_45);

		chest1ViewLabel_28 = new JLabel();
		chest1ViewLabel_28.setText("Femur (2 Views)");
		chest1ViewLabel_28.setBounds(80, 1, 77, 14);
		panel_45.add(chest1ViewLabel_28);

		cbLowerFemurR = new JCheckBox();
		cbLowerFemurR.setBackground(Color.WHITE);
		cbLowerFemurR.setText("R");
		cbLowerFemurR.setBounds(12, 1, 25, 16);
		panel_45.add(cbLowerFemurR);

		cbLowerFemurL = new JCheckBox();
		cbLowerFemurL.setBackground(Color.WHITE);
		cbLowerFemurL.setText("L");
		cbLowerFemurL.setBounds(43, 1, 25, 16);
		panel_45.add(cbLowerFemurL);

		panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(Color.black, 1, false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(0, 73, 210, 18);
		panel_41.add(panel_46);

		chest1ViewLabel_29 = new JLabel();
		chest1ViewLabel_29.setText("Knee (2 Views)");
		chest1ViewLabel_29.setBounds(80, 1, 77, 14);
		panel_46.add(chest1ViewLabel_29);

		cbLowerKneeR = new JCheckBox();
		cbLowerKneeR.setBackground(Color.WHITE);
		cbLowerKneeR.setText("R");
		cbLowerKneeR.setBounds(12, 1, 25, 16);
		panel_46.add(cbLowerKneeR);

		cbLowerKneeL = new JCheckBox();
		cbLowerKneeL.setBackground(Color.WHITE);
		cbLowerKneeL.setText("L");
		cbLowerKneeL.setBounds(43, 1, 25, 16);
		panel_46.add(cbLowerKneeL);

		panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(Color.black, 1, false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(0, 90, 210, 18);
		panel_41.add(panel_47);

		chest1ViewLabel_30 = new JLabel();
		chest1ViewLabel_30.setText("Knee Comp (3 views)");
		chest1ViewLabel_30.setBounds(80, 1, 101, 14);
		panel_47.add(chest1ViewLabel_30);

		cbLowerKneeCompR = new JCheckBox();
		cbLowerKneeCompR.setBackground(Color.WHITE);
		cbLowerKneeCompR.setText("R");
		cbLowerKneeCompR.setBounds(12, 1, 25, 16);
		panel_47.add(cbLowerKneeCompR);

		cbLowerKneeCompL = new JCheckBox();
		cbLowerKneeCompL.setBackground(Color.WHITE);
		cbLowerKneeCompL.setText("L");
		cbLowerKneeCompL.setBounds(43, 1, 25, 16);
		panel_47.add(cbLowerKneeCompL);

		panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(Color.black, 1, false));
		panel_48.setLayout(null);
		panel_48.setBackground(Color.WHITE);
		panel_48.setBounds(0, 107, 210, 18);
		panel_41.add(panel_48);

		chest1ViewLabel_31 = new JLabel();
		chest1ViewLabel_31.setText("Tibia/Fibule (2 Views)");
		chest1ViewLabel_31.setBounds(80, 1, 101, 14);
		panel_48.add(chest1ViewLabel_31);

		cbLowerTibiaR = new JCheckBox();
		cbLowerTibiaR.setBackground(Color.WHITE);
		cbLowerTibiaR.setText("R");
		cbLowerTibiaR.setBounds(12, 1, 25, 16);
		panel_48.add(cbLowerTibiaR);

		cbLowerTibiaL = new JCheckBox();
		cbLowerTibiaL.setBackground(Color.WHITE);
		cbLowerTibiaL.setText("L");
		cbLowerTibiaL.setBounds(43, 1, 25, 16);
		panel_48.add(cbLowerTibiaL);

		panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(Color.black, 1, false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(0, 124, 210, 18);
		panel_41.add(panel_49);

		chest1ViewLabel_32 = new JLabel();
		chest1ViewLabel_32.setText("Ankle (3 views)");
		chest1ViewLabel_32.setBounds(80, 1, 81, 14);
		panel_49.add(chest1ViewLabel_32);

		cbLowerAnkleR = new JCheckBox();
		cbLowerAnkleR.setBackground(Color.WHITE);
		cbLowerAnkleR.setText("R");
		cbLowerAnkleR.setBounds(12, 1, 31, 16);
		panel_49.add(cbLowerAnkleR);

		cbLowerAnkleL = new JCheckBox();

		cbLowerAnkleL.setBackground(Color.WHITE);
		cbLowerAnkleL.setText("L");
		cbLowerAnkleL.setBounds(43, 1, 31, 16);
		panel_49.add(cbLowerAnkleL);

		panel_50 = new JPanel();
		panel_50.setBorder(new LineBorder(Color.black, 1, false));
		panel_50.setLayout(null);
		panel_50.setBackground(Color.GRAY);
		panel_50.setBounds(0, 194, 210, 18);
		panel_41.add(panel_50);

		chestAndThoraxdLabel_5 = new JLabel();
		chestAndThoraxdLabel_5.setForeground(Color.WHITE);
		chestAndThoraxdLabel_5.setText("ABDOMEN");
		chestAndThoraxdLabel_5.setBounds(59, 0, 59, 18);
		panel_50.add(chestAndThoraxdLabel_5);

		panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(Color.black, 1, false));
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(0, 211, 210, 18);
		panel_41.add(panel_54);

		chest1ViewLabel_36 = new JLabel();
		chest1ViewLabel_36.setText("KUB (1 View)");
		chest1ViewLabel_36.setBounds(32, 1, 80, 14);
		panel_54.add(chest1ViewLabel_36);

		cbAbdomenKUB = new JCheckBox();
		cbAbdomenKUB.setBackground(Color.WHITE);
		cbAbdomenKUB.setText("New JCheckBox");
		cbAbdomenKUB.setBounds(12, 1, 14, 16);
		panel_54.add(cbAbdomenKUB);

		panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(Color.black, 1, false));
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(0, 228, 210, 18);
		panel_41.add(panel_55);

		chest1ViewLabel_37 = new JLabel();
		chest1ViewLabel_37.setText("Acute Abd,AP,Erect & Chest(3 views)");
		chest1ViewLabel_37.setBounds(22, 1, 188, 14);
		panel_55.add(chest1ViewLabel_37);

		cbAbdomenAcute = new JCheckBox();
		cbAbdomenAcute.setBackground(Color.WHITE);
		cbAbdomenAcute.setText("New JCheckBox");
		cbAbdomenAcute.setBounds(10, 1, 14, 16);
		panel_55.add(cbAbdomenAcute);

		panel_51 = new JPanel();
		panel_51.setBorder(new LineBorder(Color.black, 1, false));
		panel_51.setLayout(null);
		panel_51.setBackground(Color.WHITE);
		panel_51.setBounds(0, 142, 210, 18);
		panel_41.add(panel_51);

		chest1ViewLabel_33 = new JLabel();
		chest1ViewLabel_33.setText("Foot (3 Views)");
		chest1ViewLabel_33.setBounds(80, 1, 69, 14);
		panel_51.add(chest1ViewLabel_33);

		cbLowerFootR = new JCheckBox();
		cbLowerFootR.setBackground(Color.WHITE);
		cbLowerFootR.setText("R");
		cbLowerFootR.setBounds(12, 1, 25, 16);
		panel_51.add(cbLowerFootR);

		cbLowerFootL = new JCheckBox();
		cbLowerFootL.setBackground(Color.WHITE);
		cbLowerFootL.setText("L");
		cbLowerFootL.setBounds(43, 1, 25, 16);
		panel_51.add(cbLowerFootL);

		panel_52 = new JPanel();
		panel_52.setBorder(new LineBorder(Color.black, 1, false));
		panel_52.setLayout(null);
		panel_52.setBackground(Color.WHITE);
		panel_52.setBounds(0, 160, 210, 18);
		panel_41.add(panel_52);

		chest1ViewLabel_34 = new JLabel();
		chest1ViewLabel_34.setText("Heel (2 views)");
		chest1ViewLabel_34.setBounds(80, 1, 77, 14);
		panel_52.add(chest1ViewLabel_34);

		cbLowerHeelR = new JCheckBox();
		cbLowerHeelR.setBackground(Color.WHITE);
		cbLowerHeelR.setText("R");
		cbLowerHeelR.setBounds(12, 1, 25, 16);
		panel_52.add(cbLowerHeelR);

		cbLowerHeelL = new JCheckBox();
		cbLowerHeelL.setBackground(Color.WHITE);
		cbLowerHeelL.setText("L");
		cbLowerHeelL.setBounds(43, 1, 25, 16);
		panel_52.add(cbLowerHeelL);

		panel_53 = new JPanel();
		panel_53.setBorder(new LineBorder(Color.black, 1, false));
		panel_53.setLayout(null);
		panel_53.setBackground(Color.WHITE);
		panel_53.setBounds(0, 177, 210, 18);
		panel_41.add(panel_53);

		chest1ViewLabel_35 = new JLabel();
		chest1ViewLabel_35.setText("Toe (2 views)");
		chest1ViewLabel_35.setBounds(80, 1, 76, 14);
		panel_53.add(chest1ViewLabel_35);

		cbLowerToeR = new JCheckBox();
		cbLowerToeR.setBackground(Color.WHITE);
		cbLowerToeR.setText("R");
		cbLowerToeR.setBounds(12, 1, 25, 16);
		panel_53.add(cbLowerToeR);

		cbLowerToeL = new JCheckBox();
		cbLowerToeL.setBackground(Color.WHITE);
		cbLowerToeL.setText("L");
		cbLowerToeL.setBounds(43, 1, 25, 16);
		panel_53.add(cbLowerToeL);

		panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(Color.black, 1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(744, 0, 59, 195);
		panel_3.add(panel_57);

		panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(Color.black, 1, false));
		panel_58.setLayout(null);
		panel_58.setBackground(Color.GRAY);
		panel_58.setBounds(0, 0, 59, 22);
		panel_57.add(panel_58);

		icdTextArea_2 = new JTextArea();
		icdTextArea_2.setWrapStyleWord(true);
		icdTextArea_2.setText("CPT CODE");
		icdTextArea_2.setLineWrap(true);
		icdTextArea_2.setForeground(Color.WHITE);
		icdTextArea_2.setFont(new Font("Dialog", Font.BOLD, 8));
		icdTextArea_2.setBackground(Color.GRAY);
		icdTextArea_2.setBounds(25, 1, 33, 20);
		panel_58.add(icdTextArea_2);

		label_27 = new JLabel();
		label_27.setBorder(new LineBorder(Color.black, 1, false));
		label_27.setText("73510");
		label_27.setBounds(0, 22, 59, 18);
		panel_57.add(label_27);

		label_28 = new JLabel();
		label_28.setBorder(new LineBorder(Color.black, 1, false));
		label_28.setText("73520");
		label_28.setBounds(0, 39, 59, 18);
		panel_57.add(label_28);

		label_29 = new JLabel();
		label_29.setBorder(new LineBorder(Color.black, 1, false));
		label_29.setText("73550");
		label_29.setBounds(0, 56, 59, 18);
		panel_57.add(label_29);

		label_30 = new JLabel();
		label_30.setBorder(new LineBorder(Color.black, 1, false));
		label_30.setText("73560");
		label_30.setBounds(0, 73, 59, 18);
		panel_57.add(label_30);

		label_31 = new JLabel();
		label_31.setBorder(new LineBorder(Color.black, 1, false));
		label_31.setText("73562");
		label_31.setBounds(0, 90, 59, 18);
		panel_57.add(label_31);

		label_32 = new JLabel();
		label_32.setBorder(new LineBorder(Color.black, 1, false));
		label_32.setText("73590");
		label_32.setBounds(0, 107, 59, 18);
		panel_57.add(label_32);

		label_33 = new JLabel();
		label_33.setBorder(new LineBorder(Color.black, 1, false));
		label_33.setText("73610");
		label_33.setBounds(0, 124, 59, 18);
		panel_57.add(label_33);

		label_34 = new JLabel();
		label_34.setBorder(new LineBorder(Color.black, 1, false));
		label_34.setText("73630");
		label_34.setBounds(0, 142, 59, 18);
		panel_57.add(label_34);

		label_35 = new JLabel();
		label_35.setBorder(new LineBorder(Color.black, 1, false));
		label_35.setText("73650");
		label_35.setBounds(0, 160, 59, 18);
		panel_57.add(label_35);

		label_36 = new JLabel();
		label_36.setBorder(new LineBorder(Color.black, 1, false));
		label_36.setText("73660");
		label_36.setBounds(0, 177, 59, 18);
		panel_57.add(label_36);

		panel_56 = new JPanel();
		panel_56.setBorder(new LineBorder(Color.black, 1, false));
		panel_56.setLayout(null);
		panel_56.setBackground(Color.GRAY);
		panel_56.setBounds(535, 245, 268, 18);
		panel_3.add(panel_56);

		chestAndThoraxdLabel_6 = new JLabel();
		chestAndThoraxdLabel_6.setForeground(Color.WHITE);
		chestAndThoraxdLabel_6.setText("TECHNICAL NOTES");
		chestAndThoraxdLabel_6.setBounds(59, 0, 104, 18);
		panel_56.add(chestAndThoraxdLabel_6);

		panel_22 = new JPanel();
		panel_22.setBackground(Color.WHITE);
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setLayout(null);
		panel_22.setBounds(0, 262, 268, 37);
		panel_3.add(panel_22);

		otherLabel = new JLabel();
		otherLabel.setBounds(0, 0, 54, 14);
		panel_22.add(otherLabel);
		otherLabel.setText("OTHER:");

		panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(Color.black, 1, false));
		panel_61.setLayout(null);
		panel_61.setBounds(0, 35, 654, 80);
		panel_22.add(panel_61);

		txtHeadOther = new JTextArea();
		txtHeadOther.setWrapStyleWord(true);
		txtHeadOther.setLineWrap(true);
		txtHeadOther.setBounds(47, 3, 211, 31);
		panel_22.add(txtHeadOther);

		panel_62 = new JPanel();
		panel_62.setBorder(new LineBorder(Color.black, 1, false));
		panel_62.setLayout(null);
		panel_62.setBackground(Color.WHITE);
		panel_62.setBounds(535, 261, 268, 37);
		panel_3.add(panel_62);

		otherLabel_1 = new JLabel();
		otherLabel_1.setText("COMMENTS:");
		otherLabel_1.setBounds(0, 0, 60, 14);
		panel_62.add(otherLabel_1);

		txtTechnicalComments = new JTextArea();
		txtTechnicalComments.setWrapStyleWord(true);
		txtTechnicalComments.setLineWrap(true);
		txtTechnicalComments.setBounds(69, 3, 189, 31);
		panel_62.add(txtTechnicalComments);

		label_39 = new JLabel();
		label_39.setBounds(744, 211, 59, 18);
		panel_3.add(label_39);
		label_39.setBorder(new LineBorder(Color.black, 1, false));
		label_39.setText("74000");

		label_38 = new JLabel();
		label_38.setBounds(744, 228, 59, 18);
		panel_3.add(label_38);
		label_38.setBorder(new LineBorder(Color.black, 1, false));
		label_38.setText("74022");

		panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(Color.black, 1, false));
		panel_63.setBackground(Color.WHITE);
		panel_63.setLayout(null);
		panel_63.setBounds(0, 503, 804, 53);
		panel.add(panel_63);

		panel_64 = new JPanel();
		panel_64.setBackground(Color.WHITE);
		panel_64.setBorder(new LineBorder(Color.black, 1, false));
		panel_64.setLayout(null);
		panel_64.setBounds(1, 0, 270, 20);
		panel_63.add(panel_64);

		panel_66 = new JPanel();
		panel_66.setBorder(new LineBorder(Color.black, 1, false));
		panel_66.setLayout(null);
		panel_66.setBackground(Color.GRAY);
		panel_66.setBounds(34, 0, 236, 20);
		panel_64.add(panel_66);

		chestAndThoraxdLabel_7 = new JLabel();
		chestAndThoraxdLabel_7.setForeground(Color.WHITE);
		chestAndThoraxdLabel_7.setText("BONE DENSITOMETRY - 76075");
		chestAndThoraxdLabel_7.setBounds(10, 0, 216, 18);
		panel_66.add(chestAndThoraxdLabel_7);

		cbBone = new JCheckBox();
		cbBone.setBackground(Color.WHITE);
		cbBone.setBounds(10, 0, 18, 18);
		panel_64.add(cbBone);

		panel_65 = new JPanel();
		panel_65.setBorder(new LineBorder(Color.black, 1, false));
		panel_65.setBackground(Color.WHITE);
		panel_65.setLayout(null);
		panel_65.setBounds(1, 20, 140, 32);
		panel_63.add(panel_65);

		weightLabel = new JLabel();
		weightLabel.setText("HEIGHT:");
		weightLabel.setBounds(3, 10, 41, 14);
		panel_65.add(weightLabel);

		txtBoneHeight = new JTextField();
		txtBoneHeight.setBounds(51, 7, 79, 21);
		panel_65.add(txtBoneHeight);

		panel_68 = new JPanel();
		panel_68.setBorder(new LineBorder(Color.black, 1, false));
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(140, 20, 131, 32);
		panel_63.add(panel_68);

		weightLabel_1 = new JLabel();
		weightLabel_1.setText("WEIGHT:");
		weightLabel_1.setBounds(3, 10, 54, 14);
		panel_68.add(weightLabel_1);

		txtBoneWeight = new JTextField();
		txtBoneWeight.setBounds(52, 7, 69, 21);
		panel_68.add(txtBoneWeight);

		panel_67 = new JPanel();
		panel_67.setBackground(Color.WHITE);
		panel_67.setBorder(new LineBorder(Color.black, 1, false));
		panel_67.setLayout(null);
		panel_67.setBounds(271, 1, 52, 51);
		panel_63.add(panel_67);

		weightLabel_2 = new JLabel();
		weightLabel_2.setText("TIME");
		weightLabel_2.setBounds(3, 0, 41, 14);
		panel_67.add(weightLabel_2);

		txtTime = new JTextField();
		txtTime.setBounds(3, 20, 39, 21);
		panel_67.add(txtTime);

		panel_70 = new JPanel();
		panel_70.setBorder(new LineBorder(Color.black, 1, false));
		panel_70.setLayout(null);
		panel_70.setBackground(Color.WHITE);
		panel_70.setBounds(321, 1, 64, 51);
		panel_63.add(panel_70);

		weightLabel_3 = new JLabel();
		weightLabel_3.setText("DATE DONE");
		weightLabel_3.setBounds(3, 0, 57, 14);
		panel_70.add(weightLabel_3);

		dcDateDone = new JDateChooser();
		dcDateDone.setDateFormatString("MM/dd/yyyy");
		dcDateDone.setBounds(0, 24, 54, 26);
		panel_70.add(dcDateDone);

		panel_71 = new JPanel();
		panel_71.setBorder(new LineBorder(Color.black, 1, false));
		panel_71.setLayout(null);
		panel_71.setBackground(Color.WHITE);
		panel_71.setBounds(383, 1, 52, 51);
		panel_63.add(panel_71);

		weightLabel_4 = new JLabel();
		weightLabel_4.setText("TECH");
		weightLabel_4.setBounds(3, 0, 41, 14);
		panel_71.add(weightLabel_4);

		txtTech = new JTextField();
		txtTech.setBounds(3, 20, 39, 21);
		panel_71.add(txtTech);

		panel_72 = new JPanel();
		panel_72.setBorder(new LineBorder(Color.black, 1, false));
		panel_72.setLayout(null);
		panel_72.setBackground(Color.WHITE);
		panel_72.setBounds(433, 1, 84, 51);
		panel_63.add(panel_72);

		ofPt_TextArea = new JTextArea();
		ofPt_TextArea.setText("# OF PT SEEN ON THIS VISIT");
		ofPt_TextArea.setWrapStyleWord(true);
		ofPt_TextArea.setLineWrap(true);
		ofPt_TextArea.setBounds(3, 0, 76, 32);
		panel_72.add(ofPt_TextArea);

		txtNoPTSeen = new JTextField();
		txtNoPTSeen.setBounds(4, 30, 76, 18);
		panel_72.add(txtNoPTSeen);

		panel_73 = new JPanel();
		panel_73.setBorder(new LineBorder(Color.black, 1, false));
		panel_73.setLayout(null);
		panel_73.setBackground(Color.WHITE);
		panel_73.setBounds(516, 0, 52, 51);
		panel_63.add(panel_73);

		ofPtTextArea_1 = new JTextArea();
		ofPtTextArea_1.setWrapStyleWord(true);
		ofPtTextArea_1.setText("# OF VIEWS");
		ofPtTextArea_1.setLineWrap(true);
		ofPtTextArea_1.setBounds(3, 0, 48, 32);
		panel_73.add(ofPtTextArea_1);

		txtNoOfViews = new JTextField();
		txtNoOfViews.setBounds(3, 33, 39, 17);
		panel_73.add(txtNoOfViews);

		panel_74 = new JPanel();
		panel_74.setBorder(new LineBorder(Color.black, 1, false));
		panel_74.setLayout(null);
		panel_74.setBackground(Color.WHITE);
		panel_74.setBounds(567, 1, 107, 51);
		panel_63.add(panel_74);

		weightLabel_5 = new JLabel();
		weightLabel_5.setText("RADIOLOGIST CODE");
		weightLabel_5.setBounds(3, 0, 100, 14);
		panel_74.add(weightLabel_5);

		txtRadiologistCode = new JTextField();
		txtRadiologistCode.setBounds(3, 20, 94, 21);
		panel_74.add(txtRadiologistCode);

		panel_75 = new JPanel();
		panel_75.setBorder(new LineBorder(Color.black, 1, false));
		panel_75.setLayout(null);
		panel_75.setBackground(Color.WHITE);
		panel_75.setBounds(673, 1, 131, 51);
		panel_63.add(panel_75);

		ofPtTextArea_2 = new JTextArea();
		ofPtTextArea_2.setWrapStyleWord(true);
		ofPtTextArea_2.setText("PREVIOUS X-Ray");
		ofPtTextArea_2.setLineWrap(true);
		ofPtTextArea_2.setBounds(3, 0, 54, 29);
		panel_75.add(ofPtTextArea_2);

		yesLabel = new JLabel();
		yesLabel.setText("YES");
		yesLabel.setBounds(3, 31, 18, 14);
		panel_75.add(yesLabel);

		yesLabel_1 = new JLabel();
		yesLabel_1.setText("NO");
		yesLabel_1.setBounds(70, 31, 18, 14);
		panel_75.add(yesLabel_1);

		cbXrayYes = new JCheckBox();
		cbXrayYes.setBackground(Color.WHITE);
		cbXrayYes.setBounds(27, 31, 18, 18);
		panel_75.add(cbXrayYes);

		cbXrayNo = new JCheckBox();
		cbXrayNo.setBackground(Color.WHITE);
		cbXrayNo.setText("New JCheckBox");
		cbXrayNo.setBounds(94, 31, 18, 18);
		panel_75.add(cbXrayNo);

		panel_69 = new JPanel();
		panel_69.setBorder(new LineBorder(Color.black, 1, false));
		panel_69.setBackground(Color.WHITE);
		panel_69.setLayout(null);
		panel_69.setBounds(0, 555, 804, 23);
		panel.add(panel_69);

		weightLabel_6 = new JLabel();
		weightLabel_6.setText("DESCRIPTION/PROCEDURE:");
		weightLabel_6.setBounds(3, 3, 140, 14);
		panel_69.add(weightLabel_6);

		weightLabel_7 = new JLabel();
		weightLabel_7.setText("Transport Portable X-Ray/R0070");
		weightLabel_7.setBounds(192, 3, 157, 14);
		panel_69.add(weightLabel_7);

		weightLabel_8 = new JLabel();
		weightLabel_8.setText("Transport Portable X-Ray-Multiple/R0075");
		weightLabel_8.setBounds(402, 3, 197, 14);
		panel_69.add(weightLabel_8);

		weightLabel_9 = new JLabel();
		weightLabel_9.setText("Transport X-Ray Set up/Q0092");
		weightLabel_9.setBounds(637, 3, 157, 14);
		panel_69.add(weightLabel_9);

		rbDescTptR0070 = new JRadioButton();
		bgDescTpt.add(rbDescTptR0070);
		rbDescTptR0070.setBackground(Color.WHITE);
		rbDescTptR0070.setBounds(172, 1, 14, 18);
		panel_69.add(rbDescTptR0070);

		rbDescTptR0075 = new JRadioButton();
		bgDescTpt.add(rbDescTptR0075);
		rbDescTptR0075.setBackground(Color.WHITE);
		rbDescTptR0075.setBounds(373, 2, 23, 18);
		panel_69.add(rbDescTptR0075);

		rbDescTptQ0092 = new JRadioButton();
		bgDescTpt.add(rbDescTptQ0092);
		rbDescTptQ0092.setBackground(Color.WHITE);
		rbDescTptQ0092.setBounds(617, 2, 14, 18);
		panel_69.add(rbDescTptQ0092);

		panel_76 = new JPanel();
		panel_76.setBackground(Color.WHITE);
		panel_76.setBorder(new LineBorder(Color.black, 1, false));
		panel_76.setLayout(null);
		panel_76.setBounds(0, 577, 412, 23);
		panel.add(panel_76);

		weightLabel_10 = new JLabel();
		weightLabel_10
				.setText("I authorize the release of any medical information necessary to process this claim.");
		weightLabel_10.setBounds(3, 3, 393, 14);
		panel_76.add(weightLabel_10);

		panel_78 = new JPanel();
		panel_78.setBorder(new LineBorder(Color.black, 1, false));
		panel_78.setLayout(null);
		panel_78.setBackground(Color.WHITE);
		panel_78.setBounds(411, 577, 393, 23);
		panel.add(panel_78);

		weightLabel_11 = new JLabel();
		weightLabel_11.setText("AUTHORIZED SIGNATURE:");
		weightLabel_11.setBounds(3, 3, 129, 14);
		panel_78.add(weightLabel_11);

		txtAuthorizedSign = new JTextField();
		txtAuthorizedSign.setBounds(154, 2, 226, 18);
		panel_78.add(txtAuthorizedSign);

		panel_79 = new JPanel();
		panel_79.setBorder(new LineBorder(Color.black, 1, false));
		panel_79.setLayout(null);
		panel_79.setBackground(Color.WHITE);
		panel_79.setBounds(0, 599, 298, 23);
		panel.add(panel_79);

		weightLabel_12 = new JLabel();
		weightLabel_12
				.setText("This cause was not available during technologist last entry.");
		weightLabel_12.setBounds(3, 3, 290, 14);
		panel_79.add(weightLabel_12);

		panel_80 = new JPanel();
		panel_80.setBorder(new LineBorder(Color.black, 1, false));
		panel_80.setLayout(null);
		panel_80.setBackground(Color.WHITE);
		panel_80.setBounds(298, 599, 114, 23);
		panel.add(panel_80);

		cbOt = new JCheckBox();
		cbOt.setBackground(Color.WHITE);
		cbOt.setText("OT");
		cbOt.setBounds(10, 2, 39, 18);
		panel_80.add(cbOt);

		cbSt = new JCheckBox();
		cbSt.setBackground(Color.WHITE);
		cbSt.setText("ST");
		cbSt.setBounds(55, 3, 39, 18);
		panel_80.add(cbSt);

		panel_81 = new JPanel();
		panel_81.setBorder(new LineBorder(Color.black, 1, false));
		panel_81.setLayout(null);
		panel_81.setBackground(Color.WHITE);
		panel_81.setBounds(411, 599, 393, 23);
		panel.add(panel_81);

		weightLabel_13 = new JLabel();
		weightLabel_13.setText("CHARGE NURSE:");
		weightLabel_13.setBounds(3, 3, 129, 14);
		panel_81.add(weightLabel_13);

		txtChargeNurse = new JTextField();
		txtChargeNurse.setBounds(156, 2, 227, 18);
		panel_81.add(txtChargeNurse);

		panel_82 = new JPanel();
		panel_82.setBorder(new LineBorder(Color.black, 1, false));
		panel_82.setLayout(null);
		panel_82.setBackground(Color.WHITE);
		panel_82.setBounds(0, 655, 801, 392);
		panel.add(panel_82);

		panel_83 = new JPanel();
		panel_83.setBorder(new LineBorder(Color.black, 1, false));
		panel_83.setLayout(null);
		panel_83.setBackground(Color.WHITE);
		panel_83.setBounds(0, 0, 84, 179);
		panel_82.add(panel_83);

		panel_84 = new JPanel();
		panel_84.setBorder(new LineBorder(Color.black, 1, false));
		panel_84.setLayout(null);
		panel_84.setBackground(Color.GRAY);
		panel_84.setBounds(0, 0, 85, 22);
		panel_83.add(panel_84);

		chestAndThoraxdLabel_8 = new JLabel();
		chestAndThoraxdLabel_8.setForeground(Color.WHITE);
		chestAndThoraxdLabel_8.setText("CHEST");
		chestAndThoraxdLabel_8.setBounds(28, 0, 41, 18);
		panel_84.add(chestAndThoraxdLabel_8);

		panel_85 = new JPanel();
		panel_85.setLayout(null);
		panel_85.setBackground(Color.WHITE);
		panel_85.setBounds(0, 22, 85, 18);
		panel_83.add(panel_85);

		chest1ViewLabel_38 = new JLabel();
		chest1ViewLabel_38.setText("Atelectasis");
		chest1ViewLabel_38.setBounds(23, 1, 52, 14);
		panel_85.add(chest1ViewLabel_38);

		cbChestAtelectasis = new JCheckBox();
		cbChestAtelectasis.setBackground(Color.WHITE);
		cbChestAtelectasis.setText("New JCheckBox");
		cbChestAtelectasis.setBounds(3, 1, 14, 16);
		panel_85.add(cbChestAtelectasis);

		panel_86 = new JPanel();
		panel_86.setLayout(null);
		panel_86.setBackground(Color.WHITE);
		panel_86.setBounds(0, 39, 85, 18);
		panel_83.add(panel_86);

		chest1ViewLabel_41 = new JLabel();
		chest1ViewLabel_41.setText("CHF");
		chest1ViewLabel_41.setBounds(23, 1, 50, 14);
		panel_86.add(chest1ViewLabel_41);

		cbChestCHF = new JCheckBox();
		cbChestCHF.setBackground(Color.WHITE);
		cbChestCHF.setText("New JCheckBox");
		cbChestCHF.setBounds(3, 1, 14, 16);
		panel_86.add(cbChestCHF);

		panel_87 = new JPanel();
		panel_87.setLayout(null);
		panel_87.setBackground(Color.WHITE);
		panel_87.setBounds(0, 56, 85, 18);
		panel_83.add(panel_87);

		chest1ViewLabel_42 = new JLabel();
		chest1ViewLabel_42.setText("Cough");
		chest1ViewLabel_42.setBounds(23, 1, 50, 14);
		panel_87.add(chest1ViewLabel_42);

		cbChestCough = new JCheckBox();
		cbChestCough.setBackground(Color.WHITE);
		cbChestCough.setText("New JCheckBox");
		cbChestCough.setBounds(3, 1, 14, 16);
		panel_87.add(cbChestCough);

		panel_88 = new JPanel();
		panel_88.setLayout(null);
		panel_88.setBackground(Color.WHITE);
		panel_88.setBounds(0, 73, 85, 18);
		panel_83.add(panel_88);

		chest1ViewLabel_43 = new JLabel();
		chest1ViewLabel_43.setText("COPD");
		chest1ViewLabel_43.setBounds(32, 1, 36, 14);
		panel_88.add(chest1ViewLabel_43);

		cbChestCOPD = new JCheckBox();
		cbChestCOPD.setBackground(Color.WHITE);
		cbChestCOPD.setText("New JCheckBox");
		cbChestCOPD.setBounds(3, 1, 14, 16);
		panel_88.add(cbChestCOPD);

		panel_89 = new JPanel();
		panel_89.setLayout(null);
		panel_89.setBackground(Color.WHITE);
		panel_89.setBounds(0, 90, 85, 18);
		panel_83.add(panel_89);

		chest1ViewLabel_44 = new JLabel();
		chest1ViewLabel_44.setText("Congestion");
		chest1ViewLabel_44.setBounds(23, 1, 52, 14);
		panel_89.add(chest1ViewLabel_44);

		cbChestCongestion = new JCheckBox();
		cbChestCongestion.setBackground(Color.WHITE);
		cbChestCongestion.setText("New JCheckBox");
		cbChestCongestion.setBounds(3, 1, 14, 16);
		panel_89.add(cbChestCongestion);

		panel_90 = new JPanel();
		panel_90.setLayout(null);
		panel_90.setBackground(Color.WHITE);
		panel_90.setBounds(0, 107, 85, 18);
		panel_83.add(panel_90);

		chest1ViewLabel_45 = new JLabel();
		chest1ViewLabel_45.setText("Cardiomegaly");
		chest1ViewLabel_45.setBounds(17, 1, 68, 14);
		panel_90.add(chest1ViewLabel_45);

		cbChestCardiomegaly = new JCheckBox();
		cbChestCardiomegaly.setBackground(Color.WHITE);
		cbChestCardiomegaly.setText("New JCheckBox");
		cbChestCardiomegaly.setBounds(3, 1, 14, 16);
		panel_90.add(cbChestCardiomegaly);

		panel_91 = new JPanel();
		panel_91.setLayout(null);
		panel_91.setBackground(Color.WHITE);
		panel_91.setBounds(0, 124, 85, 18);
		panel_83.add(panel_91);

		chest1ViewLabel_46 = new JLabel();
		chest1ViewLabel_46.setText("Temp");
		chest1ViewLabel_46.setBounds(23, 1, 64, 14);
		panel_91.add(chest1ViewLabel_46);

		cbChestTemp = new JCheckBox();
		cbChestTemp.setBackground(Color.WHITE);
		cbChestTemp.setText("New JCheckBox");
		cbChestTemp.setBounds(3, 1, 14, 16);
		panel_91.add(cbChestTemp);

		panel_93 = new JPanel();
		panel_93.setLayout(null);
		panel_93.setBackground(Color.WHITE);
		panel_93.setBounds(0, 142, 85, 18);
		panel_83.add(panel_93);

		chest1ViewLabel_47 = new JLabel();
		chest1ViewLabel_47.setText("POST(PPD)");
		chest1ViewLabel_47.setBounds(17, 1, 65, 14);
		panel_93.add(chest1ViewLabel_47);

		cbChestPost = new JCheckBox();
		cbChestPost.setBackground(Color.WHITE);
		cbChestPost.setText("New JCheckBox");
		cbChestPost.setBounds(2, 1, 14, 16);
		panel_93.add(cbChestPost);

		panel_94 = new JPanel();
		panel_94.setLayout(null);
		panel_94.setBackground(Color.WHITE);
		panel_94.setBounds(0, 160, 85, 18);
		panel_83.add(panel_94);

		chest1ViewLabel_48 = new JLabel();
		chest1ViewLabel_48.setText("Wheezing");
		chest1ViewLabel_48.setBounds(23, 1, 52, 14);
		panel_94.add(chest1ViewLabel_48);

		cbChestWheezing = new JCheckBox();
		cbChestWheezing.setBackground(Color.WHITE);
		cbChestWheezing.setText("New JCheckBox");
		cbChestWheezing.setBounds(3, 1, 14, 16);
		panel_94.add(cbChestWheezing);

		panel_99 = new JPanel();
		panel_99.setBorder(new LineBorder(Color.black, 1, false));
		panel_99.setLayout(null);
		panel_99.setBackground(Color.WHITE);
		panel_99.setBounds(84, 0, 40, 179);
		panel_82.add(panel_99);

		label_37 = new JLabel();
		label_37.setText("518.0");
		label_37.setBounds(0, 22, 40, 18);
		panel_99.add(label_37);

		label_41 = new JLabel();
		label_41.setText("428.0");
		label_41.setBounds(0, 39, 40, 18);
		panel_99.add(label_41);

		label_42 = new JLabel();
		label_42.setText("491.2");
		label_42.setBounds(0, 73, 40, 18);
		panel_99.add(label_42);

		label_43 = new JLabel();
		label_43.setText("786.0");
		label_43.setBounds(0, 56, 40, 18);
		panel_99.add(label_43);

		label_44 = new JLabel();
		label_44.setText("514.0");
		label_44.setBounds(0, 90, 40, 18);
		panel_99.add(label_44);

		label_45 = new JLabel();
		label_45.setText("429.3");
		label_45.setBounds(0, 107, 40, 18);
		panel_99.add(label_45);

		label_46 = new JLabel();
		label_46.setText("780.6");
		label_46.setBounds(0, 124, 40, 18);
		panel_99.add(label_46);

		label_47 = new JLabel();
		label_47.setText("795.5");
		label_47.setBounds(0, 142, 40, 18);
		panel_99.add(label_47);

		label_52 = new JLabel();
		label_52.setText("786.9");
		label_52.setBounds(0, 160, 40, 18);
		panel_99.add(label_52);

		panel_98 = new JPanel();
		panel_98.setBorder(new LineBorder(Color.black, 1, false));
		panel_98.setLayout(null);
		panel_98.setBackground(Color.GRAY);
		panel_98.setBounds(0, 0, 40, 22);
		panel_99.add(panel_98);

		icdTextArea_3 = new JTextArea();
		icdTextArea_3.setWrapStyleWord(true);
		icdTextArea_3.setText("CPT CODE");
		icdTextArea_3.setLineWrap(true);
		icdTextArea_3.setForeground(Color.WHITE);
		icdTextArea_3.setFont(new Font("Dialog", Font.BOLD, 8));
		icdTextArea_3.setBackground(Color.GRAY);
		icdTextArea_3.setBounds(2, 1, 33, 20);
		panel_98.add(icdTextArea_3);

		panel_101 = new JPanel();
		panel_101.setBorder(new LineBorder(Color.black, 1, false));
		panel_101.setLayout(null);
		panel_101.setBackground(Color.WHITE);
		panel_101.setBounds(123, 0, 145, 179);
		panel_82.add(panel_101);

		panel_102 = new JPanel();
		panel_102.setBorder(new LineBorder(Color.black, 1, false));
		panel_102.setLayout(null);
		panel_102.setBackground(Color.GRAY);
		panel_102.setBounds(0, 0, 146, 22);
		panel_101.add(panel_102);

		chestAndThoraxdLabel_10 = new JLabel();
		chestAndThoraxdLabel_10.setForeground(Color.WHITE);
		chestAndThoraxdLabel_10.setText("CHEST (cont)");
		chestAndThoraxdLabel_10.setBounds(28, 0, 71, 18);
		panel_102.add(chestAndThoraxdLabel_10);

		panel_103 = new JPanel();
		panel_103.setLayout(null);
		panel_103.setBackground(Color.WHITE);
		panel_103.setBounds(0, 22, 146, 18);
		panel_101.add(panel_103);

		chest1ViewLabel_53 = new JLabel();
		chest1ViewLabel_53.setText("Shortness of Breath");
		chest1ViewLabel_53.setBounds(32, 1, 96, 14);
		panel_103.add(chest1ViewLabel_53);

		cbChestShort = new JCheckBox();
		cbChestShort.setBackground(Color.WHITE);
		cbChestShort.setText("New JCheckBox");
		cbChestShort.setBounds(3, 1, 14, 16);
		panel_103.add(cbChestShort);

		panel_104 = new JPanel();
		panel_104.setLayout(null);
		panel_104.setBackground(Color.WHITE);
		panel_104.setBounds(0, 39, 146, 18);
		panel_101.add(panel_104);

		chest1ViewLabel_54 = new JLabel();
		chest1ViewLabel_54.setText("Rales");
		chest1ViewLabel_54.setBounds(32, 1, 104, 14);
		panel_104.add(chest1ViewLabel_54);

		cbChestRales = new JCheckBox();
		cbChestRales.setBackground(Color.WHITE);
		cbChestRales.setText("New JCheckBox");
		cbChestRales.setBounds(3, 1, 14, 16);
		panel_104.add(cbChestRales);

		panel_105 = new JPanel();
		panel_105.setLayout(null);
		panel_105.setBackground(Color.WHITE);
		panel_105.setBounds(0, 56, 146, 18);
		panel_101.add(panel_105);

		chest1ViewLabel_55 = new JLabel();
		chest1ViewLabel_55.setText("Infiltrate/Effusion");
		chest1ViewLabel_55.setBounds(32, 1, 104, 14);
		panel_105.add(chest1ViewLabel_55);

		cbChestInfiltrate = new JCheckBox();
		cbChestInfiltrate.setBackground(Color.WHITE);
		cbChestInfiltrate.setText("New JCheckBox");
		cbChestInfiltrate.setBounds(3, 1, 14, 16);
		panel_105.add(cbChestInfiltrate);

		panel_106 = new JPanel();
		panel_106.setLayout(null);
		panel_106.setBackground(Color.WHITE);
		panel_106.setBounds(0, 73, 146, 18);
		panel_101.add(panel_106);

		chest1ViewLabel_56 = new JLabel();
		chest1ViewLabel_56.setText("Pain-Chest");
		chest1ViewLabel_56.setBounds(32, 1, 104, 14);
		panel_106.add(chest1ViewLabel_56);

		cbChestPain = new JCheckBox();
		cbChestPain.setBackground(Color.WHITE);
		cbChestPain.setText("New JCheckBox");
		cbChestPain.setBounds(3, 1, 14, 16);
		panel_106.add(cbChestPain);

		panel_107 = new JPanel();
		panel_107.setLayout(null);
		panel_107.setBackground(Color.WHITE);
		panel_107.setBounds(0, 90, 146, 18);
		panel_101.add(panel_107);

		chest1ViewLabel_57 = new JLabel();
		chest1ViewLabel_57.setText("Pneumonia");
		chest1ViewLabel_57.setBounds(32, 1, 104, 14);
		panel_107.add(chest1ViewLabel_57);

		cbChestPneumonia = new JCheckBox();
		cbChestPneumonia.setBackground(Color.WHITE);
		cbChestPneumonia.setText("New JCheckBox");
		cbChestPneumonia.setBounds(3, 1, 14, 16);
		panel_107.add(cbChestPneumonia);

		panel_108 = new JPanel();
		panel_108.setLayout(null);
		panel_108.setBackground(Color.WHITE);
		panel_108.setBounds(0, 107, 146, 18);
		panel_101.add(panel_108);

		chest1ViewLabel_58 = new JLabel();
		chest1ViewLabel_58.setText("Pneumothorax");
		chest1ViewLabel_58.setBounds(32, 1, 104, 14);
		panel_108.add(chest1ViewLabel_58);

		cbChestPneumothorax = new JCheckBox();
		cbChestPneumothorax.setBackground(Color.WHITE);
		cbChestPneumothorax.setText("New JCheckBox");
		cbChestPneumothorax.setBounds(3, 1, 14, 16);
		panel_108.add(cbChestPneumothorax);

		panel_109 = new JPanel();
		panel_109.setLayout(null);
		panel_109.setBackground(Color.WHITE);
		panel_109.setBounds(0, 124, 146, 18);
		panel_101.add(panel_109);

		chest1ViewLabel_59 = new JLabel();
		chest1ViewLabel_59.setText("Tuberculosis");
		chest1ViewLabel_59.setBounds(32, 1, 104, 14);
		panel_109.add(chest1ViewLabel_59);

		cbChestTuberculosis = new JCheckBox();
		cbChestTuberculosis.setBackground(Color.WHITE);
		cbChestTuberculosis.setText("New JCheckBox");
		cbChestTuberculosis.setBounds(3, 1, 14, 16);
		panel_109.add(cbChestTuberculosis);

		panel_114 = new JPanel();
		panel_114.setLayout(null);
		panel_114.setBackground(Color.WHITE);
		panel_114.setBounds(0, 142, 146, 18);
		panel_101.add(panel_114);

		chest1ViewLabel_63 = new JLabel();
		chest1ViewLabel_63.setText("Respiratory Failure");
		chest1ViewLabel_63.setBounds(32, 1, 104, 14);
		panel_114.add(chest1ViewLabel_63);

		cbChestRespiratoryFailure = new JCheckBox();
		cbChestRespiratoryFailure.setBackground(Color.WHITE);
		cbChestRespiratoryFailure.setText("New JCheckBox");
		cbChestRespiratoryFailure.setBounds(3, 1, 14, 16);
		panel_114.add(cbChestRespiratoryFailure);

		panel_115 = new JPanel();
		panel_115.setLayout(null);
		panel_115.setBackground(Color.WHITE);
		panel_115.setBounds(0, 160, 146, 18);
		panel_101.add(panel_115);

		chest1ViewLabel_64 = new JLabel();
		chest1ViewLabel_64.setText("Other-ICD Det. By Part");
		chest1ViewLabel_64.setBounds(32, 1, 112, 14);
		panel_115.add(chest1ViewLabel_64);

		cbChestOther = new JCheckBox();
		cbChestOther.setBackground(Color.WHITE);
		cbChestOther.setText("New JCheckBox");
		cbChestOther.setBounds(3, 1, 14, 16);
		panel_115.add(cbChestOther);

		panel_121 = new JPanel();
		panel_121.setBorder(new LineBorder(Color.black, 1, false));
		panel_121.setLayout(null);
		panel_121.setBackground(Color.WHITE);
		panel_121.setBounds(307, 1, 190, 391);
		panel_82.add(panel_121);

		panel_123 = new JPanel();
		panel_123.setLayout(null);
		panel_123.setBackground(Color.WHITE);
		panel_123.setBounds(0, 0, 191, 17);
		panel_121.add(panel_123);

		chest1ViewLabel_68 = new JLabel();
		chest1ViewLabel_68.setText("Nausea & Vomiting");
		chest1ViewLabel_68.setBounds(32, 1, 130, 14);
		panel_123.add(chest1ViewLabel_68);

		cbAbdomenNausea = new JCheckBox();
		cbAbdomenNausea.setBackground(Color.WHITE);
		cbAbdomenNausea.setText("New JCheckBox");
		cbAbdomenNausea.setBounds(3, 1, 14, 16);
		panel_123.add(cbAbdomenNausea);

		panel_124 = new JPanel();
		panel_124.setLayout(null);
		panel_124.setBackground(Color.WHITE);
		panel_124.setBounds(0, 16, 191, 17);
		panel_121.add(panel_124);

		chest1ViewLabel_69 = new JLabel();
		chest1ViewLabel_69.setText("Diarrhea");
		chest1ViewLabel_69.setBounds(32, 1, 143, 14);
		panel_124.add(chest1ViewLabel_69);

		cbAbdomenDiarrhea = new JCheckBox();
		cbAbdomenDiarrhea.setBackground(Color.WHITE);
		cbAbdomenDiarrhea.setText("New JCheckBox");
		cbAbdomenDiarrhea.setBounds(3, 1, 14, 16);
		panel_124.add(cbAbdomenDiarrhea);

		panel_125 = new JPanel();
		panel_125.setBorder(new LineBorder(Color.black, 1, false));
		panel_125.setLayout(null);
		panel_125.setBackground(Color.WHITE);
		panel_125.setBounds(0, 32, 191, 17);
		panel_121.add(panel_125);

		chest1ViewLabel_70 = new JLabel();
		chest1ViewLabel_70.setText("Pain/Epigastric");
		chest1ViewLabel_70.setBounds(20, 1, 169, 14);
		panel_125.add(chest1ViewLabel_70);

		cbAbdomenPain = new JCheckBox();
		cbAbdomenPain.setBackground(Color.WHITE);
		cbAbdomenPain.setText("New JCheckBox");
		cbAbdomenPain.setBounds(3, 1, 14, 16);
		panel_125.add(cbAbdomenPain);

		panel_126 = new JPanel();
		panel_126.setLayout(null);
		panel_126.setBackground(Color.WHITE);
		panel_126.setBounds(0, 48, 191, 17);
		panel_121.add(panel_126);

		chest1ViewLabel_71 = new JLabel();
		chest1ViewLabel_71.setText("Feeding Difficulties/Tube Placement");
		chest1ViewLabel_71.setBounds(17, 1, 172, 14);
		panel_126.add(chest1ViewLabel_71);

		cbAbdomenFeeding = new JCheckBox();
		cbAbdomenFeeding.setBackground(Color.WHITE);
		cbAbdomenFeeding.setText("New JCheckBox");
		cbAbdomenFeeding.setBounds(2, 1, 14, 16);
		panel_126.add(cbAbdomenFeeding);

		panel_129 = new JPanel();
		panel_129.setLayout(null);
		panel_129.setBackground(Color.WHITE);
		panel_129.setBounds(0, 64, 191, 17);
		panel_121.add(panel_129);

		chest1ViewLabel_74 = new JLabel();
		chest1ViewLabel_74.setText("Persistent Vomiting/Tube Placement");
		chest1ViewLabel_74.setBounds(17, 1, 172, 14);
		panel_129.add(chest1ViewLabel_74);

		cbAbdomenPersistent = new JCheckBox();
		cbAbdomenPersistent.setBackground(Color.WHITE);
		cbAbdomenPersistent.setText("New JCheckBox");
		cbAbdomenPersistent.setBounds(2, 1, 14, 16);
		panel_129.add(cbAbdomenPersistent);

		panel_130 = new JPanel();
		panel_130.setBorder(new LineBorder(Color.black, 1, false));
		panel_130.setLayout(null);
		panel_130.setBackground(Color.GRAY);
		panel_130.setBounds(0, 97, 191, 18);
		panel_121.add(panel_130);

		chestAndThoraxdLabel_13 = new JLabel();
		chestAndThoraxdLabel_13.setForeground(Color.WHITE);
		chestAndThoraxdLabel_13.setText("HEAD");
		chestAndThoraxdLabel_13.setBounds(59, 0, 59, 18);
		panel_130.add(chestAndThoraxdLabel_13);

		panel_133 = new JPanel();
		panel_133.setBorder(new LineBorder(Color.black, 1, false));
		panel_133.setLayout(null);
		panel_133.setBackground(Color.WHITE);
		panel_133.setBounds(0, 80, 191, 17);
		panel_121.add(panel_133);

		chest1ViewLabel_77 = new JLabel();
		chest1ViewLabel_77.setText("Other - ICD Det. By Part");
		chest1ViewLabel_77.setBounds(32, 1, 132, 14);
		panel_133.add(chest1ViewLabel_77);

		cbAbdomenOther = new JCheckBox();
		cbAbdomenOther.setBackground(Color.WHITE);
		cbAbdomenOther.setText("New JCheckBox");
		cbAbdomenOther.setBounds(3, 1, 14, 16);
		panel_133.add(cbAbdomenOther);

		panel_144 = new JPanel();
		panel_144.setLayout(null);
		panel_144.setBackground(Color.WHITE);
		panel_144.setBounds(0, 114, 191, 17);
		panel_121.add(panel_144);

		chest1ViewLabel_80 = new JLabel();
		chest1ViewLabel_80.setText("Concussion");
		chest1ViewLabel_80.setBounds(32, 1, 132, 14);
		panel_144.add(chest1ViewLabel_80);

		cbHeadConcussion = new JCheckBox();
		cbHeadConcussion.setBackground(Color.WHITE);
		cbHeadConcussion.setText("New JCheckBox");
		cbHeadConcussion.setBounds(3, 1, 14, 16);
		panel_144.add(cbHeadConcussion);

		panel_145 = new JPanel();
		panel_145.setBorder(new LineBorder(Color.black, 1, false));
		panel_145.setLayout(null);
		panel_145.setBackground(Color.WHITE);
		panel_145.setBounds(0, 130, 191, 17);
		panel_121.add(panel_145);

		chest1ViewLabel_81 = new JLabel();
		chest1ViewLabel_81.setText("Pain in Head/Facial");
		chest1ViewLabel_81.setBounds(32, 1, 132, 14);
		panel_145.add(chest1ViewLabel_81);

		cbHeadPain = new JCheckBox();
		cbHeadPain.setBackground(Color.WHITE);
		cbHeadPain.setText("New JCheckBox");
		cbHeadPain.setBounds(3, 1, 14, 16);
		panel_145.add(cbHeadPain);

		panel_146 = new JPanel();
		panel_146.setLayout(null);
		panel_146.setBackground(Color.WHITE);
		panel_146.setBounds(0, 146, 191, 17);
		panel_121.add(panel_146);

		chest1ViewLabel_82 = new JLabel();
		chest1ViewLabel_82.setText("Bruise/Laceration");
		chest1ViewLabel_82.setBounds(32, 1, 132, 14);
		panel_146.add(chest1ViewLabel_82);

		cbHeadBruise = new JCheckBox();
		cbHeadBruise.setBackground(Color.WHITE);
		cbHeadBruise.setText("New JCheckBox");
		cbHeadBruise.setBounds(3, 1, 14, 16);
		panel_146.add(cbHeadBruise);

		panel_147 = new JPanel();
		panel_147.setBorder(new LineBorder(Color.black, 1, false));
		panel_147.setLayout(null);
		panel_147.setBackground(Color.WHITE);
		panel_147.setBounds(0, 162, 191, 17);
		panel_121.add(panel_147);

		chest1ViewLabel_83 = new JLabel();
		chest1ViewLabel_83.setText("Other - ICD Det. By Part1");
		chest1ViewLabel_83.setBounds(32, 1, 132, 14);
		panel_147.add(chest1ViewLabel_83);

		cbHeadOtherICD = new JCheckBox();
		cbHeadOtherICD.setBackground(Color.WHITE);
		cbHeadOtherICD.setText("New JCheckBox");
		cbHeadOtherICD.setBounds(3, 1, 14, 16);
		panel_147.add(cbHeadOtherICD);

		panel_148 = new JPanel();
		panel_148.setBorder(new LineBorder(Color.black, 1, false));
		panel_148.setLayout(null);
		panel_148.setBackground(Color.GRAY);
		panel_148.setBounds(0, 178, 191, 18);
		panel_121.add(panel_148);

		chestAndThoraxdLabel_16 = new JLabel();
		chestAndThoraxdLabel_16.setForeground(Color.WHITE);
		chestAndThoraxdLabel_16.setText("BONE DENSITOMETRY");
		chestAndThoraxdLabel_16.setBounds(38, 0, 116, 18);
		panel_148.add(chestAndThoraxdLabel_16);

		panel_149 = new JPanel();
		panel_149.setLayout(null);
		panel_149.setBackground(Color.WHITE);
		panel_149.setBounds(0, 212, 191, 17);
		panel_121.add(panel_149);

		chest1ViewLabel_84 = new JLabel();
		chest1ViewLabel_84.setText("Alcohal Abuse");
		chest1ViewLabel_84.setBounds(32, 1, 132, 14);
		panel_149.add(chest1ViewLabel_84);

		cbAlcohalAbuse = new JCheckBox();
		cbAlcohalAbuse.setBackground(Color.WHITE);
		cbAlcohalAbuse.setText("New JCheckBox");
		cbAlcohalAbuse.setBounds(3, 1, 14, 16);
		panel_149.add(cbAlcohalAbuse);

		panel_150 = new JPanel();
		panel_150.setLayout(null);
		panel_150.setBackground(Color.WHITE);
		panel_150.setBounds(0, 228, 191, 18);
		panel_121.add(panel_150);

		chest1ViewLabel_85 = new JLabel();
		chest1ViewLabel_85.setText("Alcohal Addiction");
		chest1ViewLabel_85.setBounds(32, 1, 132, 14);
		panel_150.add(chest1ViewLabel_85);

		cbAlcohalAddiction = new JCheckBox();
		cbAlcohalAddiction.setBackground(Color.WHITE);
		cbAlcohalAddiction.setText("New JCheckBox");
		cbAlcohalAddiction.setBounds(3, 1, 14, 16);
		panel_150.add(cbAlcohalAddiction);

		alcoholismLabel = new JLabel();
		alcoholismLabel.setFont(new Font("", Font.BOLD, 12));
		alcoholismLabel.setText("ALCOHOLISM:");
		alcoholismLabel.setBounds(0, 196, 80, 14);
		panel_121.add(alcoholismLabel);

		panel_110 = new JPanel();
		panel_110.setLayout(null);
		panel_110.setBackground(Color.WHITE);
		panel_110.setBounds(0, 245, 191, 18);
		panel_121.add(panel_110);

		chest1ViewLabel_86 = new JLabel();
		chest1ViewLabel_86.setText("Alcohal Cirrhosis");
		chest1ViewLabel_86.setBounds(32, 1, 132, 14);
		panel_110.add(chest1ViewLabel_86);

		cbAlcohalCirrhosis = new JCheckBox();
		cbAlcohalCirrhosis.setBackground(Color.WHITE);
		cbAlcohalCirrhosis.setText("New JCheckBox");
		cbAlcohalCirrhosis.setBounds(3, 1, 14, 16);
		panel_110.add(cbAlcohalCirrhosis);

		panel_112 = new JPanel();
		panel_112.setLayout(null);
		panel_112.setBackground(Color.WHITE);
		panel_112.setBounds(0, 262, 191, 18);
		panel_121.add(panel_112);

		chest1ViewLabel_87 = new JLabel();
		chest1ViewLabel_87.setText("Anorexia");
		chest1ViewLabel_87.setBounds(32, 1, 132, 14);
		panel_112.add(chest1ViewLabel_87);

		cbAlcohalAnorexia = new JCheckBox();
		cbAlcohalAnorexia.setBackground(Color.WHITE);
		cbAlcohalAnorexia.setText("New JCheckBox");
		cbAlcohalAnorexia.setBounds(3, 1, 14, 16);
		panel_112.add(cbAlcohalAnorexia);

		panel_122 = new JPanel();
		panel_122.setLayout(null);
		panel_122.setBackground(Color.WHITE);
		panel_122.setBounds(0, 279, 191, 18);
		panel_121.add(panel_122);

		chest1ViewLabel_88 = new JLabel();
		chest1ViewLabel_88.setText("Diabetic Bone Changes");
		chest1ViewLabel_88.setBounds(32, 1, 132, 14);
		panel_122.add(chest1ViewLabel_88);

		cbAlcohalDiabetic = new JCheckBox();
		cbAlcohalDiabetic.setBackground(Color.WHITE);
		cbAlcohalDiabetic.setText("New JCheckBox");
		cbAlcohalDiabetic.setBounds(3, 1, 14, 16);
		panel_122.add(cbAlcohalDiabetic);

		alcoholismLabel_1 = new JLabel();
		alcoholismLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		alcoholismLabel_1.setText("FRACTURE:");
		alcoholismLabel_1.setBounds(0, 303, 80, 14);
		panel_121.add(alcoholismLabel_1);

		panel_151 = new JPanel();
		panel_151.setLayout(null);
		panel_151.setBackground(Color.WHITE);
		panel_151.setBounds(0, 322, 191, 18);
		panel_121.add(panel_151);

		chest1ViewLabel_89 = new JLabel();
		chest1ViewLabel_89.setText("Fracture-ICD Code Det. By Site");
		chest1ViewLabel_89.setBounds(23, 1, 158, 14);
		panel_151.add(chest1ViewLabel_89);

		cbFractureICD = new JCheckBox();
		cbFractureICD.setBackground(Color.WHITE);
		cbFractureICD.setText("New JCheckBox");
		cbFractureICD.setBounds(3, 1, 14, 16);
		panel_151.add(cbFractureICD);

		panel_152 = new JPanel();
		panel_152.setLayout(null);
		panel_152.setBackground(Color.WHITE);
		panel_152.setBounds(0, 339, 191, 18);
		panel_121.add(panel_152);

		chest1ViewLabel_90 = new JLabel();
		chest1ViewLabel_90.setText("Pathologic Fx");
		chest1ViewLabel_90.setBounds(32, 1, 132, 14);
		panel_152.add(chest1ViewLabel_90);

		cbFracturePathologicFx = new JCheckBox();
		cbFracturePathologicFx.setBackground(Color.WHITE);
		cbFracturePathologicFx.setText("New JCheckBox");
		cbFracturePathologicFx.setBounds(3, 1, 14, 16);
		panel_152.add(cbFracturePathologicFx);

		panel_153 = new JPanel();
		panel_153.setLayout(null);
		panel_153.setBackground(Color.WHITE);
		panel_153.setBounds(0, 356, 191, 18);
		panel_121.add(panel_153);

		chest1ViewLabel_91 = new JLabel();
		chest1ViewLabel_91.setText("Pathologic Fx of Distal Radius & Ulfa");
		chest1ViewLabel_91.setBounds(17, 1, 173, 14);
		panel_153.add(chest1ViewLabel_91);

		cbFracturePathologicFxDistal = new JCheckBox();
		cbFracturePathologicFxDistal.setBackground(Color.WHITE);
		cbFracturePathologicFxDistal.setText("New JCheckBox");
		cbFracturePathologicFxDistal.setBounds(3, 1, 14, 16);
		panel_153.add(cbFracturePathologicFxDistal);

		panel_154 = new JPanel();
		panel_154.setLayout(null);
		panel_154.setBackground(Color.WHITE);
		panel_154.setBounds(0, 373, 191, 17);
		panel_121.add(panel_154);

		chest1ViewLabel_92 = new JLabel();
		chest1ViewLabel_92.setText("Pathologic Fx unspecified site");
		chest1ViewLabel_92.setBounds(32, 1, 149, 14);
		panel_154.add(chest1ViewLabel_92);

		cbFracturePathologicFxUnspecified = new JCheckBox();
		cbFracturePathologicFxUnspecified.setBackground(Color.WHITE);
		cbFracturePathologicFxUnspecified.setText("New JCheckBox");
		cbFracturePathologicFxUnspecified.setBounds(3, 1, 14, 16);
		panel_154.add(cbFracturePathologicFxUnspecified);

		panel_97 = new JPanel();
		panel_97.setBorder(new LineBorder(Color.black, 1, false));
		panel_97.setLayout(null);
		panel_97.setBackground(Color.GRAY);
		panel_97.setBounds(0, 177, 269, 22);
		panel_82.add(panel_97);

		chestAndThoraxdLabel_9 = new JLabel();
		chestAndThoraxdLabel_9.setForeground(Color.WHITE);
		chestAndThoraxdLabel_9.setText("SKELETAL/BONE");
		chestAndThoraxdLabel_9.setBounds(69, 0, 104, 18);
		panel_97.add(chestAndThoraxdLabel_9);

		panel_95 = new JPanel();
		panel_95.setBorder(new LineBorder(Color.black, 1, false));
		panel_95.setLayout(null);
		panel_95.setBackground(Color.WHITE);
		panel_95.setBounds(268, 0, 39, 391);
		panel_82.add(panel_95);

		label_48 = new JLabel();
		label_48.setText("786.9");
		label_48.setBounds(0, 22, 40, 18);
		panel_95.add(label_48);

		label_49 = new JLabel();
		label_49.setText("786.7");
		label_49.setBounds(0, 39, 40, 18);
		panel_95.add(label_49);

		label_50 = new JLabel();
		label_50.setText("786.5");
		label_50.setBounds(0, 73, 40, 18);
		panel_95.add(label_50);

		label_51 = new JLabel();
		label_51.setText("518.3");
		label_51.setBounds(0, 56, 40, 18);
		panel_95.add(label_51);

		label_53 = new JLabel();
		label_53.setText("486.0");
		label_53.setBounds(0, 90, 40, 18);
		panel_95.add(label_53);

		label_54 = new JLabel();
		label_54.setText("512.8");
		label_54.setBounds(0, 107, 40, 18);
		panel_95.add(label_54);

		label_55 = new JLabel();
		label_55.setText("011.6");
		label_55.setBounds(0, 124, 40, 18);
		panel_95.add(label_55);

		label_56 = new JLabel();
		label_56.setText("518.81");
		label_56.setBounds(0, 142, 40, 18);
		panel_95.add(label_56);

		panel_96 = new JPanel();
		panel_96.setBorder(new LineBorder(Color.black, 1, false));
		panel_96.setLayout(null);
		panel_96.setBackground(Color.GRAY);
		panel_96.setBounds(0, 0, 40, 22);
		panel_95.add(panel_96);

		icdTextArea_4 = new JTextArea();
		icdTextArea_4.setWrapStyleWord(true);
		icdTextArea_4.setText("CPT CODE");
		icdTextArea_4.setLineWrap(true);
		icdTextArea_4.setForeground(Color.WHITE);
		icdTextArea_4.setFont(new Font("Dialog", Font.BOLD, 8));
		icdTextArea_4.setBackground(Color.GRAY);
		icdTextArea_4.setBounds(2, 1, 33, 20);
		panel_96.add(icdTextArea_4);

		label_76 = new JLabel();
		label_76.setText("923.0");
		label_76.setBounds(0, 198, 40, 18);
		panel_95.add(label_76);

		label_77 = new JLabel();
		label_77.setText("924.0");
		label_77.setBounds(0, 215, 40, 18);
		panel_95.add(label_77);

		label_78 = new JLabel();
		label_78.setText("729.5");
		label_78.setBounds(0, 232, 40, 18);
		panel_95.add(label_78);

		label_79 = new JLabel();
		label_79.setText("786.5");
		label_79.setBounds(0, 249, 40, 18);
		panel_95.add(label_79);

		label_80 = new JLabel();
		label_80.setText("719.49");
		label_80.setBounds(0, 266, 40, 18);
		panel_95.add(label_80);

		label_81 = new JLabel();
		label_81.setText("729.81");
		label_81.setBounds(0, 283, 40, 18);
		panel_95.add(label_81);

		v549Label = new JLabel();
		v549Label.setText("V54.9");
		v549Label.setBounds(0, 300, 40, 18);
		panel_95.add(v549Label);

		label_83 = new JLabel();
		label_83.setText("787.3");
		label_83.setBounds(0, 356, 40, 18);
		panel_95.add(label_83);

		label_84 = new JLabel();
		label_84.setText("599.7");
		label_84.setBounds(0, 373, 40, 18);
		panel_95.add(label_84);

		panel_100 = new JPanel();
		panel_100.setBorder(new LineBorder(Color.black, 1, false));
		panel_100.setLayout(null);
		panel_100.setBackground(Color.WHITE);
		panel_100.setBounds(497, 0, 40, 391);
		panel_82.add(panel_100);

		label_58 = new JLabel();
		label_58.setText("787.01");
		label_58.setBounds(0, 0, 40, 17);
		panel_100.add(label_58);

		label_59 = new JLabel();
		label_59.setText("787.91");
		label_59.setBounds(0, 16, 40, 17);
		panel_100.add(label_59);

		label_60 = new JLabel();
		label_60.setText("783.3");
		label_60.setBounds(0, 48, 40, 17);
		panel_100.add(label_60);

		label_61 = new JLabel();
		label_61.setText("789.06");
		label_61.setBounds(0, 32, 40, 17);
		panel_100.add(label_61);

		label_62 = new JLabel();
		label_62.setText("536.2");
		label_62.setBounds(0, 64, 40, 17);
		panel_100.add(label_62);

		label_64 = new JLabel();
		label_64.setText("850.9");
		label_64.setBounds(0, 114, 40, 17);
		panel_100.add(label_64);

		label_65 = new JLabel();
		label_65.setText("784.0");
		label_65.setBounds(0, 130, 40, 17);
		panel_100.add(label_65);

		label_66 = new JLabel();
		label_66.setText("723.0");
		label_66.setBounds(0, 146, 40, 17);
		panel_100.add(label_66);

		label_57 = new JLabel();
		label_57.setText("305.0");
		label_57.setBounds(0, 212, 40, 17);
		panel_100.add(label_57);

		label_85 = new JLabel();
		label_85.setText("303.0");
		label_85.setBounds(0, 228, 40, 18);
		panel_100.add(label_85);

		label_86 = new JLabel();
		label_86.setText("571.2");
		label_86.setBounds(0, 245, 40, 18);
		panel_100.add(label_86);

		label_87 = new JLabel();
		label_87.setText("307.1");
		label_87.setBounds(0, 262, 40, 18);
		panel_100.add(label_87);

		label_88 = new JLabel();
		label_88.setText("731.6");
		label_88.setBounds(0, 279, 40, 18);
		panel_100.add(label_88);

		label_89 = new JLabel();
		label_89.setText("733.1");
		label_89.setBounds(0, 339, 40, 18);
		panel_100.add(label_89);

		label_90 = new JLabel();
		label_90.setText("733.12");
		label_90.setBounds(0, 356, 40, 18);
		panel_100.add(label_90);

		label_91 = new JLabel();
		label_91.setText("733.10");
		label_91.setBounds(0, 373, 40, 18);
		panel_100.add(label_91);

		panel_111 = new JPanel();
		panel_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_111.setLayout(null);
		panel_111.setBackground(Color.WHITE);
		panel_111.setBounds(536, 0, 225, 391);
		panel_82.add(panel_111);

		panel_113 = new JPanel();
		panel_113.setLayout(null);
		panel_113.setBackground(Color.WHITE);
		panel_113.setBounds(0, 16, 215, 17);
		panel_111.add(panel_113);

		chest1ViewLabel_49 = new JLabel();
		chest1ViewLabel_49.setText("Disuse Osteoporosis");
		chest1ViewLabel_49.setBounds(32, 1, 117, 14);
		panel_113.add(chest1ViewLabel_49);

		cbOsteoDisUse = new JCheckBox();
		cbOsteoDisUse.setBackground(Color.WHITE);
		cbOsteoDisUse.setText("New JCheckBox");
		cbOsteoDisUse.setBounds(3, 1, 14, 16);
		panel_113.add(cbOsteoDisUse);

		panel_116 = new JPanel();
		panel_116.setLayout(null);
		panel_116.setBackground(Color.WHITE);
		panel_116.setBounds(0, 32, 201, 17);
		panel_111.add(panel_116);

		chest1ViewLabel_50 = new JLabel();
		chest1ViewLabel_50.setText("Drug Induced Osteoporosis");
		chest1ViewLabel_50.setBounds(32, 1, 143, 14);
		panel_116.add(chest1ViewLabel_50);

		cbOsteoDrug = new JCheckBox();
		cbOsteoDrug.setBackground(Color.WHITE);
		cbOsteoDrug.setText("New JCheckBox");
		cbOsteoDrug.setBounds(3, 1, 14, 16);
		panel_116.add(cbOsteoDrug);

		panel_117 = new JPanel();
		panel_117.setLayout(null);
		panel_117.setBackground(Color.WHITE);
		panel_117.setBounds(0, 48, 201, 17);
		panel_111.add(panel_117);

		chest1ViewLabel_51 = new JLabel();
		chest1ViewLabel_51.setText("Osteomalasia Osteoporosis");
		chest1ViewLabel_51.setBounds(18, 1, 167, 14);
		panel_117.add(chest1ViewLabel_51);

		cbOsteoOsteo = new JCheckBox();
		cbOsteoOsteo.setBackground(Color.WHITE);
		cbOsteoOsteo.setText("New JCheckBox");
		cbOsteoOsteo.setBounds(3, 1, 14, 16);
		panel_117.add(cbOsteoOsteo);

		panel_118 = new JPanel();
		panel_118.setLayout(null);
		panel_118.setBackground(Color.WHITE);
		panel_118.setBounds(0, 64, 201, 17);
		panel_111.add(panel_118);

		chest1ViewLabel_52 = new JLabel();
		chest1ViewLabel_52.setText("Ovarian Dysfunction");
		chest1ViewLabel_52.setBounds(32, 1, 127, 14);
		panel_118.add(chest1ViewLabel_52);

		cbOsteoOvarian = new JCheckBox();
		cbOsteoOvarian.setBackground(Color.WHITE);
		cbOsteoOvarian.setText("New JCheckBox");
		cbOsteoOvarian.setBounds(3, 1, 14, 16);
		panel_118.add(cbOsteoOvarian);

		panel_119 = new JPanel();
		panel_119.setLayout(null);
		panel_119.setBackground(Color.WHITE);
		panel_119.setBounds(0, 80, 191, 17);
		panel_111.add(panel_119);

		chest1ViewLabel_60 = new JLabel();
		chest1ViewLabel_60.setText("Senile Osteoporosis");
		chest1ViewLabel_60.setBounds(32, 1, 132, 14);
		panel_119.add(chest1ViewLabel_60);

		cbOsteoSenile = new JCheckBox();
		cbOsteoSenile.setBackground(Color.WHITE);
		cbOsteoSenile.setText("New JCheckBox");
		cbOsteoSenile.setBounds(3, 1, 14, 16);
		panel_119.add(cbOsteoSenile);

		alcoholismLabel_2 = new JLabel();
		alcoholismLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		alcoholismLabel_2.setText("OSTEOPOROSIS:");
		alcoholismLabel_2.setBounds(10, 2, 116, 14);
		panel_111.add(alcoholismLabel_2);

		alcoholismLabel_3 = new JLabel();
		alcoholismLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		alcoholismLabel_3.setText("RENAL:");
		alcoholismLabel_3.setBounds(0, 97, 80, 14);
		panel_111.add(alcoholismLabel_3);

		panel_120 = new JPanel();
		panel_120.setLayout(null);
		panel_120.setBackground(Color.WHITE);
		panel_120.setBounds(0, 114, 191, 17);
		panel_111.add(panel_120);

		chest1ViewLabel_61 = new JLabel();
		chest1ViewLabel_61.setText("Chronic Failure");
		chest1ViewLabel_61.setBounds(32, 1, 132, 14);
		panel_120.add(chest1ViewLabel_61);

		cbRenalChronic = new JCheckBox();
		cbRenalChronic.setBackground(Color.WHITE);
		cbRenalChronic.setText("New JCheckBox");
		cbRenalChronic.setBounds(3, 1, 14, 16);
		panel_120.add(cbRenalChronic);

		panel_127 = new JPanel();
		panel_127.setLayout(null);
		panel_127.setBackground(Color.WHITE);
		panel_127.setBounds(0, 130, 191, 17);
		panel_111.add(panel_127);

		chest1ViewLabel_93 = new JLabel();
		chest1ViewLabel_93.setText("Impaired Renal Function");
		chest1ViewLabel_93.setBounds(32, 1, 132, 14);
		panel_127.add(chest1ViewLabel_93);

		cbRenalImpaired = new JCheckBox();
		cbRenalImpaired.setBackground(Color.WHITE);
		cbRenalImpaired.setText("New JCheckBox");
		cbRenalImpaired.setBounds(3, 1, 14, 16);
		panel_127.add(cbRenalImpaired);

		panel_131 = new JPanel();
		panel_131.setLayout(null);
		panel_131.setBackground(Color.WHITE);
		panel_131.setBounds(0, 146, 191, 17);
		panel_111.add(panel_131);

		chest1ViewLabel_94 = new JLabel();
		chest1ViewLabel_94.setText("Neptirogenic Diabetes");
		chest1ViewLabel_94.setBounds(32, 1, 132, 14);
		panel_131.add(chest1ViewLabel_94);

		cbRenalNeptirogenic = new JCheckBox();
		cbRenalNeptirogenic.setBackground(Color.WHITE);
		cbRenalNeptirogenic.setText("New JCheckBox");
		cbRenalNeptirogenic.setBounds(3, 1, 14, 16);
		panel_131.add(cbRenalNeptirogenic);

		panel_155 = new JPanel();
		panel_155.setLayout(null);
		panel_155.setBackground(Color.WHITE);
		panel_155.setBounds(0, 162, 191, 17);
		panel_111.add(panel_155);

		chest1ViewLabel_95 = new JLabel();
		chest1ViewLabel_95.setText("Renal Osteodystrophy");
		chest1ViewLabel_95.setBounds(32, 1, 132, 14);
		panel_155.add(chest1ViewLabel_95);

		cbRenalOsteoDystrophy = new JCheckBox();
		cbRenalOsteoDystrophy.setBackground(Color.WHITE);
		cbRenalOsteoDystrophy.setText("New JCheckBox");
		cbRenalOsteoDystrophy.setBounds(3, 1, 14, 16);
		panel_155.add(cbRenalOsteoDystrophy);

		panel_156 = new JPanel();
		panel_156.setLayout(null);
		panel_156.setBackground(Color.WHITE);
		panel_156.setBounds(0, 178, 191, 17);
		panel_111.add(panel_156);

		chest1ViewLabel_96 = new JLabel();
		chest1ViewLabel_96.setText("Rheumatoid Arthritis");
		chest1ViewLabel_96.setBounds(32, 1, 132, 14);
		panel_156.add(chest1ViewLabel_96);

		cbRenalRheumatoid = new JCheckBox();
		cbRenalRheumatoid.setBackground(Color.WHITE);
		cbRenalRheumatoid.setText("New JCheckBox");
		cbRenalRheumatoid.setBounds(3, 1, 14, 16);
		panel_156.add(cbRenalRheumatoid);

		panel_157 = new JPanel();
		panel_157.setLayout(null);
		panel_157.setBackground(Color.WHITE);
		panel_157.setBounds(0, 194, 191, 17);
		panel_111.add(panel_157);

		chest1ViewLabel_97 = new JLabel();
		chest1ViewLabel_97.setText("Rickets");
		chest1ViewLabel_97.setBounds(32, 1, 132, 14);
		panel_157.add(chest1ViewLabel_97);

		cbRenalRickets = new JCheckBox();
		cbRenalRickets.setBackground(Color.WHITE);
		cbRenalRickets.setText("New JCheckBox");
		cbRenalRickets.setBounds(3, 1, 14, 16);
		panel_157.add(cbRenalRickets);

		panel_158 = new JPanel();
		panel_158.setLayout(null);
		panel_158.setBackground(Color.WHITE);
		panel_158.setBounds(0, 210, 191, 17);
		panel_111.add(panel_158);

		chest1ViewLabel_98 = new JLabel();
		chest1ViewLabel_98.setText("Testicular Dysfunction");
		chest1ViewLabel_98.setBounds(32, 1, 132, 14);
		panel_158.add(chest1ViewLabel_98);

		cbRenalTesticular = new JCheckBox();
		cbRenalTesticular.setBackground(Color.WHITE);
		cbRenalTesticular.setText("New JCheckBox");
		cbRenalTesticular.setBounds(3, 1, 14, 16);
		panel_158.add(cbRenalTesticular);

		panel_159 = new JPanel();
		panel_159.setLayout(null);
		panel_159.setBackground(Color.WHITE);
		panel_159.setBounds(0, 226, 191, 17);
		panel_111.add(panel_159);

		chest1ViewLabel_99 = new JLabel();
		chest1ViewLabel_99.setText("Vitamin D Deficiency");
		chest1ViewLabel_99.setBounds(32, 1, 132, 14);
		panel_159.add(chest1ViewLabel_99);

		cbRenalVitamin = new JCheckBox();
		cbRenalVitamin.setBackground(Color.WHITE);
		cbRenalVitamin.setText("New JCheckBox");
		cbRenalVitamin.setBounds(3, 1, 14, 16);
		panel_159.add(cbRenalVitamin);

		alcoholismLabel_4 = new JLabel();
		alcoholismLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		alcoholismLabel_4.setText("NEOPLASM:");
		alcoholismLabel_4.setBounds(0, 243, 80, 14);
		panel_111.add(alcoholismLabel_4);

		panel_160 = new JPanel();
		panel_160.setLayout(null);
		panel_160.setBackground(Color.WHITE);
		panel_160.setBounds(0, 258, 218, 17);
		panel_111.add(panel_160);

		chest1ViewLabel_100 = new JLabel();
		chest1ViewLabel_100.setText("Benign Neoplasm(Kidney,Urinary,Organs)");
		chest1ViewLabel_100.setBounds(20, 1, 203, 14);
		panel_160.add(chest1ViewLabel_100);

		cbNeoplasmKidney = new JCheckBox();
		cbNeoplasmKidney.setBackground(Color.WHITE);
		cbNeoplasmKidney.setText("New JCheckBox");
		cbNeoplasmKidney.setBounds(3, 1, 14, 16);
		panel_160.add(cbNeoplasmKidney);

		cbNeoplasmBrain = new JCheckBox();
		cbNeoplasmBrain.setBackground(Color.WHITE);
		cbNeoplasmBrain.setText("New JCheckBox");
		cbNeoplasmBrain.setBounds(3, 279, 14, 16);
		panel_111.add(cbNeoplasmBrain);

		bengin_Neoplasmbrainother = new JTextArea();
		bengin_Neoplasmbrainother.setWrapStyleWord(true);
		bengin_Neoplasmbrainother
				.setText("Bengin Neoplasm (Brain,Other Parts of Nervous System)");
		bengin_Neoplasmbrainother.setLineWrap(true);
		bengin_Neoplasmbrainother.setBounds(23, 276, 192, 30);
		panel_111.add(bengin_Neoplasmbrainother);

		panel_161 = new JPanel();
		panel_161.setLayout(null);
		panel_161.setBackground(Color.WHITE);
		panel_161.setBounds(0, 305, 215, 17);
		panel_111.add(panel_161);

		chest1ViewLabel_101 = new JLabel();
		chest1ViewLabel_101.setText("Nutritional Deficiencies(Mineral)");
		chest1ViewLabel_101.setBounds(32, 1, 183, 14);
		panel_161.add(chest1ViewLabel_101);

		cbNeoplasmNutritional = new JCheckBox();
		cbNeoplasmNutritional.setBackground(Color.WHITE);
		cbNeoplasmNutritional.setText("New JCheckBox");
		cbNeoplasmNutritional.setBounds(3, 1, 14, 16);
		panel_161.add(cbNeoplasmNutritional);

		alcoholismLabel_5 = new JLabel();
		alcoholismLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		alcoholismLabel_5.setText("HYPOTHYROIDISM:");
		alcoholismLabel_5.setBounds(0, 321, 126, 14);
		panel_111.add(alcoholismLabel_5);

		panel_162 = new JPanel();
		panel_162.setLayout(null);
		panel_162.setBackground(Color.WHITE);
		panel_162.setBounds(0, 339, 191, 18);
		panel_111.add(panel_162);

		chest1ViewLabel_102 = new JLabel();
		chest1ViewLabel_102.setText("Congenital");
		chest1ViewLabel_102.setBounds(32, 1, 132, 14);
		panel_162.add(chest1ViewLabel_102);

		cbHypoCongenital = new JCheckBox();
		cbHypoCongenital.setBackground(Color.WHITE);
		cbHypoCongenital.setText("New JCheckBox");
		cbHypoCongenital.setBounds(3, 1, 14, 16);
		panel_162.add(cbHypoCongenital);

		panel_163 = new JPanel();
		panel_163.setLayout(null);
		panel_163.setBackground(Color.WHITE);
		panel_163.setBounds(0, 356, 191, 18);
		panel_111.add(panel_163);

		chest1ViewLabel_103 = new JLabel();
		chest1ViewLabel_103.setText("Malabsorption (Calcium)");
		chest1ViewLabel_103.setBounds(32, 1, 132, 14);
		panel_163.add(chest1ViewLabel_103);

		cbHypoMalabsorption = new JCheckBox();
		cbHypoMalabsorption.setBackground(Color.WHITE);
		cbHypoMalabsorption.setText("New JCheckBox");
		cbHypoMalabsorption.setBounds(3, 1, 14, 16);
		panel_163.add(cbHypoMalabsorption);

		panel_164 = new JPanel();
		panel_164.setLayout(null);
		panel_164.setBackground(Color.WHITE);
		panel_164.setBounds(0, 373, 191, 18);
		panel_111.add(panel_164);

		chest1ViewLabel_104 = new JLabel();
		chest1ViewLabel_104.setText("Mineral Defeciency");
		chest1ViewLabel_104.setBounds(32, 1, 132, 14);
		panel_164.add(chest1ViewLabel_104);

		cbHypoMineral = new JCheckBox();
		cbHypoMineral.setBackground(Color.WHITE);
		cbHypoMineral.setText("New JCheckBox");
		cbHypoMineral.setBounds(3, 1, 14, 16);
		panel_164.add(cbHypoMineral);

		panel_128 = new JPanel();
		panel_128.setBorder(new LineBorder(Color.black, 1, false));
		panel_128.setLayout(null);
		panel_128.setBackground(Color.WHITE);
		panel_128.setBounds(760, 0, 41, 391);
		panel_82.add(panel_128);

		label_67 = new JLabel();
		label_67.setText("733.3");
		label_67.setBounds(0, 16, 40, 17);
		panel_128.add(label_67);

		label_68 = new JLabel();
		label_68.setText("733.01");
		label_68.setBounds(0, 32, 40, 17);
		panel_128.add(label_68);

		label_69 = new JLabel();
		label_69.setText("256.8");
		label_69.setBounds(0, 64, 40, 17);
		panel_128.add(label_69);

		label_70 = new JLabel();
		label_70.setText("268.2");
		label_70.setBounds(0, 48, 40, 17);
		panel_128.add(label_70);

		label_71 = new JLabel();
		label_71.setText("733.01");
		label_71.setBounds(0, 80, 40, 17);
		panel_128.add(label_71);

		label_73 = new JLabel();
		label_73.setText("585.0");
		label_73.setBounds(0, 114, 40, 17);
		panel_128.add(label_73);

		label_74 = new JLabel();
		label_74.setText("588.9");
		label_74.setBounds(0, 130, 40, 17);
		panel_128.add(label_74);

		label_75 = new JLabel();
		label_75.setText("588.1");
		label_75.setBounds(0, 146, 40, 17);
		panel_128.add(label_75);

		label_72 = new JLabel();
		label_72.setText("588.0");
		label_72.setBounds(0, 162, 40, 17);
		panel_128.add(label_72);

		label_93 = new JLabel();
		label_93.setText("588.0");
		label_93.setBounds(0, 178, 40, 17);
		panel_128.add(label_93);

		label_94 = new JLabel();
		label_94.setText("268.0");
		label_94.setBounds(0, 194, 40, 17);
		panel_128.add(label_94);

		label_95 = new JLabel();
		label_95.setText("257.2");
		label_95.setBounds(0, 210, 40, 17);
		panel_128.add(label_95);

		label_96 = new JLabel();
		label_96.setText("268.0");
		label_96.setBounds(0, 226, 40, 17);
		panel_128.add(label_96);

		label_97 = new JLabel();
		label_97.setText("223.0");
		label_97.setBounds(0, 258, 40, 17);
		panel_128.add(label_97);

		label_98 = new JLabel();
		label_98.setText("225.0");
		label_98.setBounds(0, 274, 40, 17);
		panel_128.add(label_98);

		label_99 = new JLabel();
		label_99.setText("269.3");
		label_99.setBounds(0, 300, 40, 17);
		panel_128.add(label_99);

		label_100 = new JLabel();
		label_100.setText("243.0");
		label_100.setBounds(0, 339, 40, 17);
		panel_128.add(label_100);

		label_101 = new JLabel();
		label_101.setText("579.8");
		label_101.setBounds(0, 355, 40, 17);
		panel_128.add(label_101);

		label_102 = new JLabel();
		label_102.setText("269.1");
		label_102.setBounds(0, 372, 40, 18);
		panel_128.add(label_102);

		panel_132 = new JPanel();
		panel_132.setLayout(null);
		panel_132.setBackground(Color.WHITE);
		panel_132.setBounds(0, 198, 269, 18);
		panel_82.add(panel_132);

		chest1ViewLabel_62 = new JLabel();
		chest1ViewLabel_62.setText("Bruise/Contusion Upper Limb");
		chest1ViewLabel_62.setBounds(32, 1, 137, 14);
		panel_132.add(chest1ViewLabel_62);

		cbSkeletalBruiseUpper = new JCheckBox();
		cbSkeletalBruiseUpper.setBackground(Color.WHITE);
		cbSkeletalBruiseUpper.setText("New JCheckBox");
		cbSkeletalBruiseUpper.setBounds(12, 1, 14, 16);
		panel_132.add(cbSkeletalBruiseUpper);

		panel_134 = new JPanel();
		panel_134.setLayout(null);
		panel_134.setBackground(Color.WHITE);
		panel_134.setBounds(0, 215, 269, 18);
		panel_82.add(panel_134);

		chest1ViewLabel_65 = new JLabel();
		chest1ViewLabel_65.setText("Bruise/Contusion Lower Limb");
		chest1ViewLabel_65.setBounds(32, 1, 143, 14);
		panel_134.add(chest1ViewLabel_65);

		cbSkeletalBruiseLower = new JCheckBox();
		cbSkeletalBruiseLower.setBackground(Color.WHITE);
		cbSkeletalBruiseLower.setText("New JCheckBox");
		cbSkeletalBruiseLower.setBounds(12, 1, 14, 16);
		panel_134.add(cbSkeletalBruiseLower);

		panel_135 = new JPanel();
		panel_135.setLayout(null);
		panel_135.setBackground(Color.WHITE);
		panel_135.setBounds(0, 232, 269, 18);
		panel_82.add(panel_135);

		chest1ViewLabel_66 = new JLabel();
		chest1ViewLabel_66.setText("Pain in Extremities");
		chest1ViewLabel_66.setBounds(32, 1, 124, 14);
		panel_135.add(chest1ViewLabel_66);

		cbSkeletalPainExt = new JCheckBox();
		cbSkeletalPainExt.setBackground(Color.WHITE);
		cbSkeletalPainExt.setText("New JCheckBox");
		cbSkeletalPainExt.setBounds(12, 1, 14, 16);
		panel_135.add(cbSkeletalPainExt);

		panel_136 = new JPanel();
		panel_136.setLayout(null);
		panel_136.setBackground(Color.WHITE);
		panel_136.setBounds(0, 249, 269, 18);
		panel_82.add(panel_136);

		chest1ViewLabel_67 = new JLabel();
		chest1ViewLabel_67.setText("Pain in Ribs");
		chest1ViewLabel_67.setBounds(32, 1, 80, 14);
		panel_136.add(chest1ViewLabel_67);

		cbSkeletalPainRibs = new JCheckBox();
		cbSkeletalPainRibs.setBackground(Color.WHITE);
		cbSkeletalPainRibs.setText("New JCheckBox");
		cbSkeletalPainRibs.setBounds(12, 1, 14, 16);
		panel_136.add(cbSkeletalPainRibs);

		panel_137 = new JPanel();
		panel_137.setLayout(null);
		panel_137.setBackground(Color.WHITE);
		panel_137.setBounds(0, 266, 269, 18);
		panel_82.add(panel_137);

		chest1ViewLabel_72 = new JLabel();
		chest1ViewLabel_72.setText("Pain in Multiple Sites");
		chest1ViewLabel_72.setBounds(32, 1, 181, 14);
		panel_137.add(chest1ViewLabel_72);

		cbSkeletalPainMultiple = new JCheckBox();
		cbSkeletalPainMultiple.setBackground(Color.WHITE);
		cbSkeletalPainMultiple.setText("New JCheckBox");
		cbSkeletalPainMultiple.setBounds(12, 1, 14, 16);
		panel_137.add(cbSkeletalPainMultiple);

		panel_138 = new JPanel();
		panel_138.setLayout(null);
		panel_138.setBackground(Color.WHITE);
		panel_138.setBounds(0, 283, 269, 18);
		panel_82.add(panel_138);

		chest1ViewLabel_73 = new JLabel();
		chest1ViewLabel_73.setText("Swelling of Extremity");
		chest1ViewLabel_73.setBounds(32, 1, 152, 14);
		panel_138.add(chest1ViewLabel_73);

		cbSkeletalSwellingExt = new JCheckBox();
		cbSkeletalSwellingExt.setBackground(Color.WHITE);
		cbSkeletalSwellingExt.setText("New JCheckBox");
		cbSkeletalSwellingExt.setBounds(12, 1, 14, 16);
		panel_138.add(cbSkeletalSwellingExt);

		panel_139 = new JPanel();
		panel_139.setLayout(null);
		panel_139.setBackground(Color.WHITE);
		panel_139.setBounds(0, 300, 269, 18);
		panel_82.add(panel_139);

		chest1ViewLabel_75 = new JLabel();
		chest1ViewLabel_75.setText("Healing Fracture");
		chest1ViewLabel_75.setBounds(32, 1, 80, 14);
		panel_139.add(chest1ViewLabel_75);

		cbSkeletalHealing = new JCheckBox();
		cbSkeletalHealing.setBackground(Color.WHITE);
		cbSkeletalHealing.setText("New JCheckBox");
		cbSkeletalHealing.setBounds(12, 1, 14, 16);
		panel_139.add(cbSkeletalHealing);

		panel_140 = new JPanel();
		panel_140.setLayout(null);
		panel_140.setBackground(Color.WHITE);
		panel_140.setBounds(0, 317, 269, 18);
		panel_82.add(panel_140);

		chest1ViewLabel_76 = new JLabel();
		chest1ViewLabel_76.setText("Swelling - Other - ICD Det. By Part");
		chest1ViewLabel_76.setBounds(32, 1, 189, 14);
		panel_140.add(chest1ViewLabel_76);

		cbSkeletalSwellingOther = new JCheckBox();
		cbSkeletalSwellingOther.setBackground(Color.WHITE);
		cbSkeletalSwellingOther.setText("New JCheckBox");
		cbSkeletalSwellingOther.setBounds(12, 1, 14, 16);
		panel_140.add(cbSkeletalSwellingOther);

		panel_141 = new JPanel();
		panel_141.setBorder(new LineBorder(Color.black, 1, false));
		panel_141.setLayout(null);
		panel_141.setBackground(Color.GRAY);
		panel_141.setBounds(0, 335, 269, 22);
		panel_82.add(panel_141);

		chestAndThoraxdLabel_15 = new JLabel();
		chestAndThoraxdLabel_15.setForeground(Color.WHITE);
		chestAndThoraxdLabel_15.setText("ABDOMEN");
		chestAndThoraxdLabel_15.setBounds(69, 0, 190, 18);
		panel_141.add(chestAndThoraxdLabel_15);

		panel_142 = new JPanel();
		panel_142.setLayout(null);
		panel_142.setBackground(Color.WHITE);
		panel_142.setBounds(0, 356, 269, 18);
		panel_82.add(panel_142);

		chest1ViewLabel_78 = new JLabel();
		chest1ViewLabel_78.setText("Distented Abdomen");
		chest1ViewLabel_78.setBounds(32, 1, 157, 14);
		panel_142.add(chest1ViewLabel_78);

		cbAbdomenDist = new JCheckBox();
		cbAbdomenDist.setBackground(Color.WHITE);
		cbAbdomenDist.setText("New JCheckBox");
		cbAbdomenDist.setBounds(12, 1, 14, 16);
		panel_142.add(cbAbdomenDist);

		panel_143 = new JPanel();
		panel_143.setLayout(null);
		panel_143.setBackground(Color.WHITE);
		panel_143.setBounds(0, 373, 269, 18);
		panel_82.add(panel_143);

		chest1ViewLabel_79 = new JLabel();
		chest1ViewLabel_79.setText("Hematuria");
		chest1ViewLabel_79.setBounds(32, 1, 80, 14);
		panel_143.add(chest1ViewLabel_79);

		cbAbdomenHematuria = new JCheckBox();
		cbAbdomenHematuria.setBackground(Color.WHITE);
		cbAbdomenHematuria.setText("New JCheckBox");
		cbAbdomenHematuria.setBounds(12, 1, 14, 16);
		panel_143.add(cbAbdomenHematuria);

		panel_77 = new JPanel();
		panel_77.setBackground(Color.WHITE);
		panel_77.setLayout(null);
		panel_77.setBounds(0, 623, 800, 25);
		panel.add(panel_77);

		reasonForStudyLabel = new JLabel();
		reasonForStudyLabel.setFont(new Font("", Font.BOLD, 14));
		reasonForStudyLabel.setText("REASON FOR STUDY");
		reasonForStudyLabel.setBounds(367, 3, 179, 14);
		panel_77.add(reasonForStudyLabel);

		panel_92 = new JPanel();
		panel_92.setBackground(Color.WHITE);
		panel_92.setBorder(new LineBorder(Color.black, 1, false));
		panel_92.setLayout(null);
		panel_92.setBounds(0, 1046, 805, 26);
		panel.add(panel_92);

		alcoholismLabel_6 = new JLabel();
		alcoholismLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		alcoholismLabel_6.setText("CLINICAL HISTORY");
		alcoholismLabel_6.setBounds(10, 10, 122, 14);
		panel_92.add(alcoholismLabel_6);

		txtClinicalHistory = new JTextField();
		txtClinicalHistory.setBounds(180, 5, 615, 18);
		panel_92.add(txtClinicalHistory);

		panel_165 = new JPanel();
		panel_165.setBackground(Color.WHITE);
		panel_165.setBorder(new LineBorder(Color.black, 1, false));
		panel_165.setLayout(null);
		panel_165.setBounds(0, 1070, 211, 34);
		panel.add(panel_165);

		requesting_PhysicianTextArea = new JTextArea();
		requesting_PhysicianTextArea.setLineWrap(true);
		requesting_PhysicianTextArea.setWrapStyleWord(true);
		requesting_PhysicianTextArea.setText("REQUESTING PHYSICIAN:");
		requesting_PhysicianTextArea.setBounds(3, 0, 73, 32);
		panel_165.add(requesting_PhysicianTextArea);

		txtRequestPhysician = new JTextField();
		txtRequestPhysician.setBounds(79, 11, 124, 21);
		panel_165.add(txtRequestPhysician);

		panel_167 = new JPanel();
		panel_167.setBorder(new LineBorder(Color.black, 1, false));
		panel_167.setLayout(null);
		panel_167.setBackground(Color.WHITE);
		panel_167.setBounds(210, 1070, 224, 34);
		panel.add(panel_167);

		txtNurse = new JTextField();
		txtNurse.setBounds(70, 11, 141, 21);
		panel_167.add(txtNurse);

		nurseLabel = new JLabel();
		nurseLabel.setText("NURSE:");
		nurseLabel.setBounds(10, 14, 54, 14);
		panel_167.add(nurseLabel);

		panel_168 = new JPanel();
		panel_168.setBorder(new LineBorder(Color.black, 1, false));
		panel_168.setLayout(null);
		panel_168.setBackground(Color.WHITE);
		panel_168.setBounds(435, 1070, 176, 34);
		panel.add(panel_168);

		requestingPhysicianTextArea_1 = new JTextArea();
		requestingPhysicianTextArea_1.setWrapStyleWord(true);
		requestingPhysicianTextArea_1.setText("DATE ORDERED:");
		requestingPhysicianTextArea_1.setLineWrap(true);
		requestingPhysicianTextArea_1.setBounds(0, 0, 70, 32);
		panel_168.add(requestingPhysicianTextArea_1);

		dcDateOrder = new JDateChooser();
		dcDateOrder.setDateFormatString("MM/dd/yyyy");
		dcDateOrder.setBounds(73, 5, 90, 24);
		panel_168.add(dcDateOrder);

		panel_169 = new JPanel();
		panel_169.setBorder(new LineBorder(Color.black, 1, false));
		panel_169.setLayout(null);
		panel_169.setBackground(Color.WHITE);
		panel_169.setBounds(610, 1070, 196, 34);
		panel.add(panel_169);

		requestingPhysicianTextArea_2 = new JTextArea();
		requestingPhysicianTextArea_2.setWrapStyleWord(true);
		requestingPhysicianTextArea_2.setText("DATE REPORT RECEIVED:");
		requestingPhysicianTextArea_2.setLineWrap(true);
		requestingPhysicianTextArea_2.setBounds(0, 0, 76, 32);
		panel_169.add(requestingPhysicianTextArea_2);

		dcDateReceive = new JDateChooser();
		dcDateReceive.setDateFormatString("MM/dd/yyyy");
		dcDateReceive.setBounds(82, 5, 104, 24);
		panel_169.add(dcDateReceive);

		panel_166 = new JPanel();
		panel_166.setBorder(new LineBorder(Color.black, 1, false));
		panel_166.setBackground(Color.WHITE);
		panel_166.setLayout(null);
		panel_166.setBounds(0, 1103, 805, 53);
		panel.add(panel_166);

		notePortableXrayLabel = new JLabel();
		notePortableXrayLabel
				.setText("NOTE: Portable x-ray is required due to patient's physical or mental ability to be transported from facility");
		notePortableXrayLabel.setBounds(0, 0, 542, 14);
		panel_166.add(notePortableXrayLabel);

		notePortableXrayLabel_1 = new JLabel();
		notePortableXrayLabel_1.setFont(new Font("", Font.BOLD, 12));
		notePortableXrayLabel_1.setText("WHITE-");
		notePortableXrayLabel_1.setBounds(103, 20, 43, 14);
		panel_166.add(notePortableXrayLabel_1);

		nursingOfficeLabel = new JLabel();
		nursingOfficeLabel.setText("NURSING OFFICE *");
		nursingOfficeLabel.setBounds(152, 21, 95, 14);
		panel_166.add(nursingOfficeLabel);

		notePortableXrayLabel_2 = new JLabel();
		notePortableXrayLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		notePortableXrayLabel_2.setText("YELLOW-");
		notePortableXrayLabel_2.setBounds(253, 22, 55, 14);
		panel_166.add(notePortableXrayLabel_2);

		nursingOfficeLabel_1 = new JLabel();
		nursingOfficeLabel_1.setText("PHI BILLING DEPT. * ");
		nursingOfficeLabel_1.setBounds(307, 22, 102, 14);
		panel_166.add(nursingOfficeLabel_1);

		notePortableXrayLabel_3 = new JLabel();
		notePortableXrayLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		notePortableXrayLabel_3.setText("PINK-");
		notePortableXrayLabel_3.setBounds(415, 22, 31, 14);
		panel_166.add(notePortableXrayLabel_3);

		nursingOfficeLabel_2 = new JLabel();
		nursingOfficeLabel_2.setText("FILE COPY *");
		nursingOfficeLabel_2.setBounds(452, 22, 68, 14);
		panel_166.add(nursingOfficeLabel_2);

		notePortableXrayLabel_4 = new JLabel();
		notePortableXrayLabel_4.setFont(new Font("Dialog", Font.BOLD, 12));
		notePortableXrayLabel_4.setText("BLUE-");
		notePortableXrayLabel_4.setBounds(519, 22, 43, 14);
		panel_166.add(notePortableXrayLabel_4);

		nursingOfficeLabel_3 = new JLabel();
		nursingOfficeLabel_3.setText("NHF FINANCE DEPT. ");
		nursingOfficeLabel_3.setBounds(557, 22, 102, 14);
		panel_166.add(nursingOfficeLabel_3);

		updateData();
	}

	public void doSave() {

		MadexForm1 refMadexForm1 = new MadexForm1();
		refMadexForm1.setResidentId(Global.currentResidenceKey);

		refMadexForm1.setChestAndThoraxRibsUniCRL(cbChestAndThoraxRibsUniCRL
				.isSelected());
		refMadexForm1.setChestAndThoraxRibsUnilL(cbChestAndThoraxRibsUnilL
				.isSelected());
		refMadexForm1.setChestAndThoraxRibsUnilR(cbChestAndThoraxRibsUnilR
				.isSelected());
		refMadexForm1.setLowerToeL(cbLowerToeL.isSelected());
		refMadexForm1.setLowerHeelL(cbLowerHeelL.isSelected());
		refMadexForm1.setLowerFootL(cbLowerFootL.isSelected());
		refMadexForm1.setLowerAnkleL(cbLowerAnkleL.isSelected());
		refMadexForm1.setLowerTibiaL(cbLowerTibiaL.isSelected());
		refMadexForm1.setLowerKneeCompL(cbLowerKneeCompL.isSelected());
		refMadexForm1.setLowerKneeL(cbLowerKneeL.isSelected());
		refMadexForm1.setLowerFemurL(cbLowerFemurL.isSelected());
		refMadexForm1.setLowerHipL(cbLowerHipL.isSelected());
		refMadexForm1.setUpperFingerL(cbUpperFingerL.isSelected());
		refMadexForm1.setUpperHandL(cbUpperHandL.isSelected());
		refMadexForm1.setUpperWristL(cbUpperWristL.isSelected());
		refMadexForm1.setUpperElbowL(cbUpperElbowL.isSelected());
		refMadexForm1.setUpperForearmL(cbUpperForearmL.isSelected());
		refMadexForm1.setUpperHumerusL(cbUpperHumerusL.isSelected());
		refMadexForm1.setUpperScapulaL(cbUpperScapulaL.isSelected());
		refMadexForm1.setUpperClavicleL(cbUpperClavicleL.isSelected());
		refMadexForm1.setUpperShoulderL(cbUpperShoulderL.isSelected());
		refMadexForm1.setRadiologistCode(txtRadiologistCode.getText());
		refMadexForm1.setNoOfViews(txtNoOfViews.getText());
		refMadexForm1.setNoPTSeen(txtNoPTSeen.getText());
		refMadexForm1.setTech(txtTech.getText());
		refMadexForm1.setDateDone(dcDateDone.getDate());
		refMadexForm1.setTime(txtTime.getText());
		refMadexForm1.setTechnicalComments(txtTechnicalComments.getText());
		refMadexForm1.setHeadOther(txtHeadOther.getText());
		refMadexForm1.setDateReceive(dcDateReceive.getDate());
		refMadexForm1.setDateOrder(dcDateOrder.getDate());
		refMadexForm1.setNurse(txtNurse.getText());
		refMadexForm1.setRequestPhysician(txtRequestPhysician.getText());
		refMadexForm1.setClinicalHistory(txtClinicalHistory.getText());
		refMadexForm1.setHypoMineral(cbHypoMineral.isSelected());
		refMadexForm1.setHypoMalabsorption(cbHypoMalabsorption.isSelected());
		refMadexForm1.setHypoCongenital(cbHypoCongenital.isSelected());
		refMadexForm1
				.setNeoplasmNutritional(cbNeoplasmNutritional.isSelected());
		refMadexForm1.setNeoplasmBrain(cbNeoplasmBrain.isSelected());
		refMadexForm1.setNeoplasmKidney(cbNeoplasmKidney.isSelected());
		refMadexForm1.setRenalVitamin(cbRenalVitamin.isSelected());
		refMadexForm1.setRenalTesticular(cbRenalTesticular.isSelected());
		refMadexForm1.setRenalRickets(cbRenalRickets.isSelected());
		refMadexForm1.setRenalRheumatoid(cbRenalRheumatoid.isSelected());
		refMadexForm1
				.setRenalOsteoDystrophy(cbRenalOsteoDystrophy.isSelected());
		refMadexForm1.setRenalNeptirogenic(cbRenalNeptirogenic.isSelected());
		refMadexForm1.setRenalImpaired(cbRenalImpaired.isSelected());
		refMadexForm1.setRenalChronic(cbRenalChronic.isSelected());
		refMadexForm1
				.setFracturePathologicFxUnspecified(cbFracturePathologicFxUnspecified
						.isSelected());
		refMadexForm1
				.setFracturePathologicFxDistal(cbFracturePathologicFxDistal
						.isSelected());
		refMadexForm1.setFracturePathologicFx(cbFracturePathologicFx
				.isSelected());
		refMadexForm1.setFractureICD(cbFractureICD.isSelected());
		refMadexForm1.setAlcohalDiabetic(cbAlcohalDiabetic.isSelected());
		refMadexForm1.setAlcohalAnorexia(cbAlcohalAnorexia.isSelected());
		refMadexForm1.setAlcohalCirrhosis(cbAlcohalCirrhosis.isSelected());
		refMadexForm1.setAlcohalAddiction(cbAlcohalAddiction.isSelected());
		refMadexForm1.setAlcohalAbuse(cbAlcohalAbuse.isSelected());
		refMadexForm1.setHeadOtherICD(cbHeadOtherICD.isSelected());
		refMadexForm1.setHeadBruise(cbHeadBruise.isSelected());
		refMadexForm1.setHeadPain(cbHeadPain.isSelected());
		refMadexForm1.setHeadConcussion(cbHeadConcussion.isSelected());
		refMadexForm1.setAbdomenHematuria(cbAbdomenHematuria.isSelected());
		refMadexForm1.setAbdomenDist(cbAbdomenDist.isSelected());
		refMadexForm1.setSkeletalSwellingOther(cbSkeletalSwellingOther
				.isSelected());
		refMadexForm1.setSkeletalHealing(cbSkeletalHealing.isSelected());
		refMadexForm1
				.setSkeletalSwellingExt(cbSkeletalSwellingExt.isSelected());
		refMadexForm1.setSkeletalPainMultiple(cbSkeletalPainMultiple
				.isSelected());
		refMadexForm1.setSkeletalPainRibs(cbSkeletalPainRibs.isSelected());
		refMadexForm1.setSkeletalPainExt(cbSkeletalPainExt.isSelected());
		refMadexForm1
				.setSkeletalBruiseLower(cbSkeletalBruiseLower.isSelected());
		refMadexForm1
				.setSkeletalBruiseUpper(cbSkeletalBruiseUpper.isSelected());
		refMadexForm1.setOsteoSenile(cbOsteoSenile.isSelected());
		refMadexForm1.setOsteoOvarian(cbOsteoOvarian.isSelected());
		refMadexForm1.setOsteoOsteo(cbOsteoOsteo.isSelected());
		refMadexForm1.setOsteoDrug(cbOsteoDrug.isSelected());
		refMadexForm1.setOsteoDisUse(cbOsteoDisUse.isSelected());
		refMadexForm1.setAbdomenOther(cbAbdomenOther.isSelected());
		refMadexForm1.setAbdomenPersistent(cbAbdomenPersistent.isSelected());
		refMadexForm1.setAbdomenFeeding(cbAbdomenFeeding.isSelected());
		refMadexForm1.setAbdomenPain(cbAbdomenPain.isSelected());
		refMadexForm1.setAbdomenDiarrhea(cbAbdomenDiarrhea.isSelected());
		refMadexForm1.setAbdomenNausea(cbAbdomenNausea.isSelected());
		refMadexForm1.setChestOther(cbChestOther.isSelected());
		refMadexForm1.setChestRespiratoryFailure(cbChestRespiratoryFailure
				.isSelected());
		refMadexForm1.setChestTuberculosis(cbChestTuberculosis.isSelected());
		refMadexForm1.setChestPneumothorax(cbChestPneumothorax.isSelected());
		refMadexForm1.setChestPneumonia(cbChestPneumonia.isSelected());
		refMadexForm1.setChestPain(cbChestPain.isSelected());
		refMadexForm1.setChestInfiltrate(cbChestInfiltrate.isSelected());
		refMadexForm1.setChestRales(cbChestRales.isSelected());
		refMadexForm1.setChestShort(cbChestShort.isSelected());
		refMadexForm1.setChestWheezing(cbChestWheezing.isSelected());
		refMadexForm1.setChestPost(cbChestPost.isSelected());
		refMadexForm1.setChestTemp(cbChestTemp.isSelected());
		refMadexForm1.setChestCardiomegaly(cbChestCardiomegaly.isSelected());
		refMadexForm1.setChestCongestion(cbChestCongestion.isSelected());
		refMadexForm1.setChestCOPD(cbChestCOPD.isSelected());
		refMadexForm1.setChestCough(cbChestCough.isSelected());
		refMadexForm1.setChestCHF(cbChestCHF.isSelected());
		refMadexForm1.setChestAtelectasis(cbChestAtelectasis.isSelected());
		refMadexForm1.setChargeNurse(txtChargeNurse.getText());
		refMadexForm1.setSt(cbSt.isSelected());
		refMadexForm1.setOt(cbOt.isSelected());
		refMadexForm1.setAuthorizedSign(txtAuthorizedSign.getText());
		refMadexForm1.setXrayNo(cbXrayNo.isSelected());
		refMadexForm1.setXrayYes(cbXrayYes.isSelected());
		refMadexForm1.setBoneWeight(txtBoneWeight.getText());
		refMadexForm1.setBoneHeight(txtBoneHeight.getText());
		refMadexForm1.setBone(cbBone.isSelected());
		refMadexForm1.setLowerToeR(cbLowerToeR.isSelected());
		refMadexForm1.setLowerHeelR(cbLowerHeelR.isSelected());
		refMadexForm1.setLowerFootR(cbLowerFootR.isSelected());
		refMadexForm1.setSpinalSacrum(cbSpinalSacrum.isSelected());
		refMadexForm1.setSpinalPelvis(cbSpinalPelvis.isSelected());
		refMadexForm1.setSpinalPelvisComp(cbSpinalPelvisComp.isSelected());
		refMadexForm1.setUpperFingerR(cbUpperFingerR.isSelected());
		refMadexForm1.setUpperHandR(cbUpperHandR.isSelected());
		refMadexForm1.setAbdomenAcute(cbAbdomenAcute.isSelected());
		refMadexForm1.setAbdomenKUB(cbAbdomenKUB.isSelected());
		refMadexForm1.setLowerAnkleR(cbLowerAnkleR.isSelected());
		refMadexForm1.setLowerTibiaR(cbLowerTibiaR.isSelected());
		refMadexForm1.setLowerKneeCompR(cbLowerKneeCompR.isSelected());
		refMadexForm1.setLowerKneeR(cbLowerKneeR.isSelected());
		refMadexForm1.setLowerFemurR(cbLowerFemurR.isSelected());
		refMadexForm1.setLowerHipBilat(cbLowerHipBilat.isSelected());
		refMadexForm1.setLowerHipR(cbLowerHipR.isSelected());
		refMadexForm1.setSpinalThoracic(cbSpinalThoracic.isSelected());
		refMadexForm1.setSpinalCervical(cbSpinalCervical.isSelected());
		refMadexForm1.setSpinalLumbosacral(cbSpinalLumbosacral.isSelected());
		refMadexForm1.setUpperWristR(cbUpperWristR.isSelected());
		refMadexForm1.setUpperElbowR(cbUpperElbowR.isSelected());
		refMadexForm1.setUpperForearmR(cbUpperForearmR.isSelected());
		refMadexForm1.setUpperHumerusR(cbUpperHumerusR.isSelected());
		refMadexForm1.setUpperScapulaR(cbUpperScapulaR.isSelected());
		refMadexForm1.setUpperClavicleR(cbUpperClavicleR.isSelected());
		refMadexForm1.setUpperShoulderR(cbUpperShoulderR.isSelected());
		refMadexForm1.setHeadOrbits(cbHeadOrbits.isSelected());
		refMadexForm1.setHeadSinuses(cbHeadSinuses.isSelected());
		refMadexForm1.setHeadMandible(cbHeadMandible.isSelected());
		refMadexForm1.setHeadFBSinuses(cbHeadFBSinuses.isSelected());
		refMadexForm1.setHeadFBNasal(cbHeadFBNasal.isSelected());
		refMadexForm1.setHeadSkull(cbHeadSkull.isSelected());
		refMadexForm1
				.setChestAndThoraxRibsB(cbChestAndThoraxRibsB.isSelected());
		refMadexForm1.setChestAndThoraxRibsUniCRR(cbChestAndThoraxRibsUniCRR
				.isSelected());
		refMadexForm1
				.setChestAndThoraxDecub(cbChestAndThoraxDecub.isSelected());
		refMadexForm1.setChestAndThoraxChestAPAL(cbChestAndThoraxChestAPAL
				.isSelected());
		refMadexForm1.setChestAndThoraxChestAPL(cbChestAndThoraxChestAPL
				.isSelected());
		refMadexForm1
				.setChestAndThoraxChest(cbChestAndThoraxChest.isSelected());
		refMadexForm1.setCaseField(txtCaseField.getText());
		refMadexForm1.setPreApproval(txtPreApproval.getText());
		refMadexForm1.setInsurance(txtInsurance.getText());
		refMadexForm1.setMedicaidNo(txtMedicaidNo.getText());
		refMadexForm1.setRmNo(txtRmNo.getText());
		refMadexForm1.setBirth(dcBirth.getDate());
		refMadexForm1.setMedicareNo(txtMedicareNo.getText());
		refMadexForm1.setMedicareB(cbMedicareB.isSelected());
		refMadexForm1.setMedicareA(cbMedicareA.isSelected());
		refMadexForm1.setFemale(cbFemale.isSelected());
		refMadexForm1.setMale(cbMale.isSelected());
		refMadexForm1.setPatient(txtPatient.getText());
		refMadexForm1.setFacility(txtFacility.getText());

		try {
			Global.currentMadexForm1Key = MedrexClientManager.getInstance()
					.insertOrUpdateMadexForm1(refMadexForm1);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void updateData() {

		MadexForm1 refMadexForm1 = null;

		if (Global.currentMadexForm1Key != 0) {
			try {
				refMadexForm1 = MedrexClientManager.getInstance()
						.getMadexForm1(Global.currentMadexForm1Key);
			} catch (Exception e) {

			}
			cbChestAndThoraxRibsUniCRL.setSelected(refMadexForm1
					.isChestAndThoraxRibsUniCRL());
			cbChestAndThoraxRibsUnilL.setSelected(refMadexForm1
					.isChestAndThoraxRibsUnilL());
			cbChestAndThoraxRibsUnilR.setSelected(refMadexForm1
					.isChestAndThoraxRibsUnilR());
			cbLowerToeL.setSelected(refMadexForm1.isLowerToeL());
			cbLowerHeelL.setSelected(refMadexForm1.isLowerHeelL());
			cbLowerFootL.setSelected(refMadexForm1.isLowerFootL());
			cbLowerAnkleL.setSelected(refMadexForm1.isLowerAnkleL());
			cbLowerTibiaL.setSelected(refMadexForm1.isLowerTibiaL());
			cbLowerKneeCompL.setSelected(refMadexForm1.isLowerKneeCompL());
			cbLowerKneeL.setSelected(refMadexForm1.isLowerKneeL());
			cbLowerFemurL.setSelected(refMadexForm1.isLowerFemurL());
			cbLowerHipL.setSelected(refMadexForm1.isLowerHipL());
			cbUpperFingerL.setSelected(refMadexForm1.isUpperFingerL());
			cbUpperHandL.setSelected(refMadexForm1.isUpperHandL());
			cbUpperWristL.setSelected(refMadexForm1.isUpperWristL());
			cbUpperElbowL.setSelected(refMadexForm1.isUpperElbowL());
			cbUpperForearmL.setSelected(refMadexForm1.isUpperForearmL());
			cbUpperHumerusL.setSelected(refMadexForm1.isUpperHumerusL());
			cbUpperScapulaL.setSelected(refMadexForm1.isUpperScapulaL());
			cbUpperClavicleL.setSelected(refMadexForm1.isUpperClavicleL());
			cbUpperShoulderL.setSelected(refMadexForm1.isUpperShoulderL());
			txtRadiologistCode.setText(refMadexForm1.getRadiologistCode());
			txtNoOfViews.setText(refMadexForm1.getNoOfViews());
			txtNoPTSeen.setText(refMadexForm1.getNoPTSeen());
			txtTech.setText(refMadexForm1.getTech());
			dcDateDone.setDate(refMadexForm1.getDateDone());
			txtTime.setText(refMadexForm1.getTime());
			txtTechnicalComments.setText(refMadexForm1.getTechnicalComments());
			txtHeadOther.setText(refMadexForm1.getHeadOther());
			dcDateReceive.setDate(refMadexForm1.getDateReceive());
			dcDateOrder.setDate(refMadexForm1.getDateOrder());
			txtNurse.setText(refMadexForm1.getNurse());
			txtRequestPhysician.setText(refMadexForm1.getRequestPhysician());
			txtClinicalHistory.setText(refMadexForm1.getClinicalHistory());
			cbHypoMineral.setSelected(refMadexForm1.isHypoMineral());
			cbHypoMalabsorption
					.setSelected(refMadexForm1.isHypoMalabsorption());
			cbHypoCongenital.setSelected(refMadexForm1.isHypoCongenital());
			cbNeoplasmNutritional.setSelected(refMadexForm1
					.isNeoplasmNutritional());
			cbNeoplasmBrain.setSelected(refMadexForm1.isNeoplasmBrain());
			cbNeoplasmKidney.setSelected(refMadexForm1.isNeoplasmKidney());
			cbRenalVitamin.setSelected(refMadexForm1.isRenalVitamin());
			cbRenalTesticular.setSelected(refMadexForm1.isRenalTesticular());
			cbRenalRickets.setSelected(refMadexForm1.isRenalRickets());
			cbRenalRheumatoid.setSelected(refMadexForm1.isRenalRheumatoid());
			cbRenalOsteoDystrophy.setSelected(refMadexForm1
					.isRenalOsteoDystrophy());
			cbRenalNeptirogenic
					.setSelected(refMadexForm1.isRenalNeptirogenic());
			cbRenalImpaired.setSelected(refMadexForm1.isRenalImpaired());
			cbRenalChronic.setSelected(refMadexForm1.isRenalChronic());
			cbFracturePathologicFxUnspecified.setSelected(refMadexForm1
					.isFracturePathologicFxUnspecified());
			cbFracturePathologicFxDistal.setSelected(refMadexForm1
					.isFracturePathologicFxDistal());
			cbFracturePathologicFx.setSelected(refMadexForm1
					.isFracturePathologicFx());
			cbFractureICD.setSelected(refMadexForm1.isFractureICD());
			cbAlcohalDiabetic.setSelected(refMadexForm1.isAlcohalDiabetic());
			cbAlcohalAnorexia.setSelected(refMadexForm1.isAlcohalAnorexia());
			cbAlcohalCirrhosis.setSelected(refMadexForm1.isAlcohalCirrhosis());
			cbAlcohalAddiction.setSelected(refMadexForm1.isAlcohalAddiction());
			cbAlcohalAbuse.setSelected(refMadexForm1.isAlcohalAbuse());
			cbHeadOtherICD.setSelected(refMadexForm1.isHeadOtherICD());
			cbHeadBruise.setSelected(refMadexForm1.isHeadBruise());
			cbHeadPain.setSelected(refMadexForm1.isHeadPain());
			cbHeadConcussion.setSelected(refMadexForm1.isHeadConcussion());
			cbAbdomenHematuria.setSelected(refMadexForm1.isAbdomenHematuria());
			cbAbdomenDist.setSelected(refMadexForm1.isAbdomenDist());
			cbSkeletalSwellingOther.setSelected(refMadexForm1
					.isSkeletalSwellingOther());
			cbSkeletalHealing.setSelected(refMadexForm1.isSkeletalHealing());
			cbSkeletalSwellingExt.setSelected(refMadexForm1
					.isSkeletalSwellingExt());
			cbSkeletalPainMultiple.setSelected(refMadexForm1
					.isSkeletalPainMultiple());
			cbSkeletalPainRibs.setSelected(refMadexForm1.isSkeletalPainRibs());
			cbSkeletalPainExt.setSelected(refMadexForm1.isSkeletalPainExt());
			cbSkeletalBruiseLower.setSelected(refMadexForm1
					.isSkeletalBruiseLower());
			cbSkeletalBruiseUpper.setSelected(refMadexForm1
					.isSkeletalBruiseUpper());
			cbOsteoSenile.setSelected(refMadexForm1.isOsteoSenile());
			cbOsteoOvarian.setSelected(refMadexForm1.isOsteoOvarian());
			cbOsteoOsteo.setSelected(refMadexForm1.isOsteoOsteo());
			cbOsteoDrug.setSelected(refMadexForm1.isOsteoDrug());
			cbOsteoDisUse.setSelected(refMadexForm1.isOsteoDisUse());
			cbAbdomenOther.setSelected(refMadexForm1.isAbdomenOther());
			cbAbdomenPersistent
					.setSelected(refMadexForm1.isAbdomenPersistent());
			cbAbdomenFeeding.setSelected(refMadexForm1.isAbdomenFeeding());
			cbAbdomenPain.setSelected(refMadexForm1.isAbdomenPain());
			cbAbdomenDiarrhea.setSelected(refMadexForm1.isAbdomenDiarrhea());
			cbAbdomenNausea.setSelected(refMadexForm1.isAbdomenNausea());
			cbChestOther.setSelected(refMadexForm1.isChestOther());
			cbChestRespiratoryFailure.setSelected(refMadexForm1
					.isChestRespiratoryFailure());
			cbChestTuberculosis
					.setSelected(refMadexForm1.isChestTuberculosis());
			cbChestPneumothorax
					.setSelected(refMadexForm1.isChestPneumothorax());
			cbChestPneumonia.setSelected(refMadexForm1.isChestPneumonia());
			cbChestPain.setSelected(refMadexForm1.isChestPain());
			cbChestInfiltrate.setSelected(refMadexForm1.isChestInfiltrate());
			cbChestRales.setSelected(refMadexForm1.isChestRales());
			cbChestShort.setSelected(refMadexForm1.isChestShort());
			cbChestWheezing.setSelected(refMadexForm1.isChestWheezing());
			cbChestPost.setSelected(refMadexForm1.isChestPost());
			cbChestTemp.setSelected(refMadexForm1.isChestTemp());
			cbChestCardiomegaly
					.setSelected(refMadexForm1.isChestCardiomegaly());
			cbChestCongestion.setSelected(refMadexForm1.isChestCongestion());
			cbChestCOPD.setSelected(refMadexForm1.isChestCOPD());
			cbChestCough.setSelected(refMadexForm1.isChestCough());
			cbChestCHF.setSelected(refMadexForm1.isChestCHF());
			cbChestAtelectasis.setSelected(refMadexForm1.isChestAtelectasis());
			txtChargeNurse.setText(refMadexForm1.getChargeNurse());
			cbSt.setSelected(refMadexForm1.isSt());
			cbOt.setSelected(refMadexForm1.isOt());
			txtAuthorizedSign.setText(refMadexForm1.getAuthorizedSign());
			cbXrayNo.setSelected(refMadexForm1.isXrayNo());
			cbXrayYes.setSelected(refMadexForm1.isXrayYes());
			txtBoneWeight.setText(refMadexForm1.getBoneWeight());
			txtBoneHeight.setText(refMadexForm1.getBoneHeight());
			cbBone.setSelected(refMadexForm1.isBone());
			cbLowerToeR.setSelected(refMadexForm1.isLowerToeR());
			cbLowerHeelR.setSelected(refMadexForm1.isLowerHeelR());
			cbLowerFootR.setSelected(refMadexForm1.isLowerFootR());
			cbSpinalSacrum.setSelected(refMadexForm1.isSpinalSacrum());
			cbSpinalPelvis.setSelected(refMadexForm1.isSpinalPelvis());
			cbSpinalPelvisComp.setSelected(refMadexForm1.isSpinalPelvisComp());
			cbUpperFingerR.setSelected(refMadexForm1.isUpperFingerR());
			cbUpperHandR.setSelected(refMadexForm1.isUpperHandR());
			cbAbdomenAcute.setSelected(refMadexForm1.isAbdomenAcute());
			cbAbdomenKUB.setSelected(refMadexForm1.isAbdomenKUB());
			cbLowerAnkleR.setSelected(refMadexForm1.isLowerAnkleR());
			cbLowerTibiaR.setSelected(refMadexForm1.isLowerTibiaR());
			cbLowerKneeCompR.setSelected(refMadexForm1.isLowerKneeCompR());
			cbLowerKneeR.setSelected(refMadexForm1.isLowerKneeR());
			cbLowerFemurR.setSelected(refMadexForm1.isLowerFemurR());
			cbLowerHipBilat.setSelected(refMadexForm1.isLowerHipBilat());
			cbLowerHipR.setSelected(refMadexForm1.isLowerHipR());
			cbSpinalThoracic.setSelected(refMadexForm1.isSpinalThoracic());
			cbSpinalCervical.setSelected(refMadexForm1.isSpinalCervical());
			cbSpinalLumbosacral
					.setSelected(refMadexForm1.isSpinalLumbosacral());
			cbUpperWristR.setSelected(refMadexForm1.isUpperWristR());
			cbUpperElbowR.setSelected(refMadexForm1.isUpperElbowR());
			cbUpperForearmR.setSelected(refMadexForm1.isUpperForearmR());
			cbUpperHumerusR.setSelected(refMadexForm1.isUpperHumerusR());
			cbUpperScapulaR.setSelected(refMadexForm1.isUpperScapulaR());
			cbUpperClavicleR.setSelected(refMadexForm1.isUpperClavicleR());
			cbUpperShoulderR.setSelected(refMadexForm1.isUpperShoulderR());
			cbHeadOrbits.setSelected(refMadexForm1.isHeadOrbits());
			cbHeadSinuses.setSelected(refMadexForm1.isHeadSinuses());
			cbHeadMandible.setSelected(refMadexForm1.isHeadMandible());
			cbHeadFBSinuses.setSelected(refMadexForm1.isHeadFBSinuses());
			cbHeadFBNasal.setSelected(refMadexForm1.isHeadFBNasal());
			cbHeadSkull.setSelected(refMadexForm1.isHeadSkull());
			cbChestAndThoraxRibsB.setSelected(refMadexForm1
					.isChestAndThoraxRibsB());
			cbChestAndThoraxRibsUniCRR.setSelected(refMadexForm1
					.isChestAndThoraxRibsUniCRR());
			cbChestAndThoraxDecub.setSelected(refMadexForm1
					.isChestAndThoraxDecub());
			cbChestAndThoraxChestAPAL.setSelected(refMadexForm1
					.isChestAndThoraxChestAPAL());
			cbChestAndThoraxChestAPL.setSelected(refMadexForm1
					.isChestAndThoraxChestAPL());
			cbChestAndThoraxChest.setSelected(refMadexForm1
					.isChestAndThoraxChest());
			txtCaseField.setText(refMadexForm1.getCaseField());
			txtPreApproval.setText(refMadexForm1.getPreApproval());
			txtInsurance.setText(refMadexForm1.getInsurance());
			txtMedicaidNo.setText(refMadexForm1.getMedicaidNo());
			txtRmNo.setText(refMadexForm1.getRmNo());
			dcBirth.setDate(refMadexForm1.getBirth());
			txtMedicareNo.setText(refMadexForm1.getMedicareNo());
			cbMedicareB.setSelected(refMadexForm1.isMedicareB());
			cbMedicareA.setSelected(refMadexForm1.isMedicareA());
			cbFemale.setSelected(refMadexForm1.isFemale());
			cbMale.setSelected(refMadexForm1.isMale());
			txtPatient.setText(refMadexForm1.getPatient());
			txtFacility.setText(refMadexForm1.getFacility());

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
