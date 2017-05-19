package medrex.client.main.labspecial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.labSpecial.ReasonForStudy;

public class PanelLabReasonForStudyPage1 extends JPanel {

	private JCheckBox cbBreastMastodynia;

	private JLabel malignantNeoplasmOfLabel_62;

	private JCheckBox cbBreastPleuralEffusion_1;

	private JPanel panel_168;

	private JLabel malignantNeoplasmOfLabel_61;

	private JPanel panel_167;

	private JCheckBox cbArterialGangrene;

	private JCheckBox cbArterialUlcersChronic;

	private JCheckBox cbArterialArterialEmbolismLower;

	private JCheckBox cbArterialArterialEmbolismUpper;

	private JCheckBox cbArterialPeripheralVascular;

	private JCheckBox cbArterialAtherosGangrene;

	private JCheckBox cbArterialAtherosUlceration;

	private JCheckBox cbArterialAtherosRestPain;

	private JCheckBox cbArterialAtherosClaudication;

	private JCheckBox cbVenousAnomalies;

	private JCheckBox cbVenousCompression;

	private JCheckBox cbVenousHemmorrhage;

	private JCheckBox cbVenousPhlebitisUpper;

	private JCheckBox cbVenousPhlebitisLower;

	private JCheckBox cbVenousPulmonaryEmbolism;

	private JCheckBox cbVenousVaricoseUlcerOrInflam;

	private JCheckBox cbVenousVaricoseUlcerInflam;

	private JCheckBox cbVenousVaricoseInflam;

	private JCheckBox cbBreastPalpable;

	private JCheckBox cbBreastSolitary;

	private JCheckBox cbEchocardiogramCardiomegaly;

	private JCheckBox cbEchocardiogramMyocardities;

	private JCheckBox cbEchocardiogramCardiovascular;

	private JCheckBox cbEchocardiogramHeartFailure;

	private JCheckBox cbEchocardiogramCardiacArrest;

	private JCheckBox cbEchocardiogramPrematureBeats;

	private JCheckBox cbEchocardiogramOtherHeart;

	private JCheckBox cbEchocardiogramAneurysm;

	private JCheckBox cbEchocardiogramUnspecifiedDis;

	private JCheckBox cbEchocardiogramPulmonary;

	private JCheckBox cbEchocardiogramAcutePari;

	private JCheckBox cbEchocardiogramCoronary;

	private JCheckBox cbEchocardiogramAcuteMyocardial;

	private JCheckBox cbEchocardiogramRheumatic;

	private JCheckBox cbEchocardiogramHypertensive;

	private JLabel malignantNeoplasmOfLabel_26;

	private JCheckBox cbEchocardiogramEssential;

	private JPanel panel_62;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel label_73;

	private JPanel panel_166;

	private JLabel label_72;

	private JPanel panel_165;

	private JLabel label_71;

	private JPanel panel_164;

	private JLabel label_70;

	private JPanel panel_163;

	private JLabel label_69;

	private JPanel panel_162;

	private JLabel label_68;

	private JPanel panel_161;

	private JLabel label_67;

	private JPanel panel_160;

	private JLabel label_66;

	private JPanel panel_159;

	private JLabel label_65;

	private JPanel panel_158;

	private JLabel label_64;

	private JPanel panel_157;

	private JLabel label_63;

	private JPanel panel_156;

	private JLabel label_62;

	private JPanel panel_155;

	private JLabel label_61;

	private JPanel panel_154;

	private JLabel label_60;

	private JPanel panel_153;

	private JLabel label_59;

	private JPanel panel_152;

	private JLabel label_58;

	private JPanel panel_151;

	private JLabel label_57;

	private JPanel panel_150;

	private JLabel label_56;

	private JPanel panel_149;

	private JLabel label_55;

	private JPanel panel_148;

	private JLabel label_54;

	private JPanel panel_147;

	private JLabel label_53;

	private JPanel panel_146;

	private JLabel label_52;

	private JPanel panel_145;

	private JLabel label_51;

	private JPanel panel_144;

	private JLabel label_50;

	private JPanel panel_133;

	private JLabel malignantNeoplasmOfLabel_60;

	private JPanel panel_143;

	private JLabel malignantNeoplasmOfLabel_59;

	private JPanel panel_142;

	private JTextArea malignantNeoplasmotherSitesTextArea_10;

	private JPanel panel_141;

	private JTextArea malignantNeoplasmotherSitesTextArea_9;

	private JPanel panel_140;

	private JLabel malignantNeoplasmOfLabel_58;

	// private JCheckBox cbArterialPeripheral;

	private JPanel panel_139;

	private JLabel malignantNeoplasmOfLabel_57;

	// private JCheckBox cbArterialAtherosclerosisGangrene;

	private JPanel panel_138;

	private JLabel malignantNeoplasmOfLabel_56;

	// private JCheckBox cbArterialAtherosclerosisUlceration;

	private JPanel panel_137;

	private JLabel malignantNeoplasmOfLabel_55;

	// private JCheckBox cbArterialAtherosclerosisPain;

	private JPanel panel_136;

	private JLabel malignantNeoplasmOfLabel_54;

	// private JCheckBox cbArterialAtherosclerosisClaudication;

	private JPanel panel_135;

	private JLabel malignantNeoplasmOfLabel_53;

	private JCheckBox cbArterialDiabetes;

	private JPanel panel_134;

	private JLabel ultrasoundsLabel_7;

	private JPanel panel_132;

	private JTextArea malignantNeoplasmotherSitesTextArea_8;

	private JPanel panel_131;

	private JLabel malignantNeoplasmOfLabel_52;

	private JPanel panel_130;

	private JLabel malignantNeoplasmOfLabel_51;

	private JPanel panel_129;

	private JTextArea malignantNeoplasmotherSitesTextArea_7;

	private JPanel panel_128;

	private JTextArea malignantNeoplasmotherSitesTextArea_6;

	private JPanel panel_127;

	private JLabel malignantNeoplasmOfLabel_50;

	private JPanel panel_126;

	private JLabel malignantNeoplasmOfLabel_49;

	// private JCheckBox cbVenousvaricoseVeinsUlcerOrInflam;

	private JPanel panel_125;

	private JLabel malignantNeoplasmOfLabel_48;

	// private JCheckBox cbVenousvaricoseVeinsUlcerAndInflam;

	private JPanel panel_124;

	private JLabel malignantNeoplasmOfLabel_47;

	private JPanel panel_123;

	private JLabel malignantNeoplasmOfLabel_46;

	private JCheckBox cbVenousVaricoseveinsUlcer;

	private JPanel panel_122;

	private JLabel ultrasoundsLabel_6;

	private JPanel panel_121;

	private JPanel panel_120;

	private JLabel malignantNeoplasmOfLabel_45;

	private JPanel panel_119;

	private JLabel malignantNeoplasmOfLabel_44;

	private JPanel panel_118;

	private JLabel malignantNeoplasmOfLabel_43;

	private JPanel panel_117;

	private JLabel malignantNeoplasmOfLabel_42;

	private JCheckBox cbBreastPleuralEffusion;

	private JPanel panel_116;

	private JLabel ultrasoundsLabel_5;

	private JPanel panel_115;

	private JPanel panel_114;

	private JLabel label_49;

	private JPanel panel_113;

	private JLabel label_48;

	private JPanel panel_112;

	private JLabel label_47;

	private JPanel panel_111;

	private JLabel label_46;

	private JPanel panel_110;

	private JLabel label_45;

	private JPanel panel_109;

	private JLabel label_44;

	private JPanel panel_108;

	private JLabel label_43;

	private JPanel panel_107;

	private JLabel label_42;

	private JPanel panel_106;

	private JLabel label_41;

	private JPanel panel_105;

	private JLabel label_40;

	private JPanel panel_104;

	private JLabel label_39;

	private JPanel panel_103;

	private JLabel label_38;

	private JPanel panel_102;

	private JLabel label_37;

	private JPanel panel_101;

	private JLabel label_36;

	private JPanel panel_100;

	private JLabel label_35;

	private JPanel panel_99;

	private JLabel label_34;

	private JPanel panel_98;

	private JLabel label_33;

	private JPanel panel_97;

	private JLabel label_32;

	private JPanel panel_96;

	private JLabel label_31;

	private JPanel panel_95;

	private JLabel label_30;

	private JPanel panel_94;

	private JLabel label_29;

	private JPanel panel_93;

	private JLabel label_28;

	private JPanel panel_92;

	private JLabel label_27;

	private JPanel panel_91;

	private JLabel label_26;

	private JPanel panel_90;

	private JLabel label_25;

	private JPanel panel_89;

	private JLabel label_24;

	private JPanel panel_88;

	private JLabel label_23;

	private JPanel panel_87;

	private JLabel label_22;

	private JPanel panel_86;

	private JLabel label_21;

	private JPanel panel_85;

	private JLabel label_20;

	private JPanel panel_84;

	private JLabel label_19;

	private JPanel panel_83;

	private JLabel label_18;

	private JPanel panel_82;

	private JLabel label_17;

	private JPanel panel_81;

	private JLabel label_16;

	private JPanel panel_80;

	private JLabel label_15;

	private JPanel panel_79;

	private JLabel label_14;

	private JPanel panel_78;

	private JLabel malignantNeoplasmOfLabel_41;

	private JPanel panel_77;

	private JLabel malignantNeoplasmOfLabel_40;

	private JPanel panel_76;

	private JLabel malignantNeoplasmOfLabel_39;

	// private JCheckBox cbEchocardiogramCardiovascularDisease;

	private JPanel panel_75;

	private JLabel malignantNeoplasmOfLabel_38;

	// private JCheckBox cbEchocardiogramHeartfailure;

	private JPanel panel_74;

	private JLabel malignantNeoplasmOfLabel_37;

	private JPanel panel_73;

	private JLabel malignantNeoplasmOfLabel_36;

	private JPanel panel_72;

	private JLabel malignantNeoplasmOfLabel_35;

	private JCheckBox cbEchocardiogramAtrialFib;

	private JPanel panel_71;

	private JLabel malignantNeoplasmOfLabel_34;

	// private JCheckBox cbEchocardiogramOtherHeartBlock;

	private JPanel panel_70;

	private JLabel malignantNeoplasmOfLabel_33;

	// private JCheckBox cbEchocardiogramAneurysmOfHeart;

	private JPanel panel_69;

	private JLabel malignantNeoplasmOfLabel_32;

	private JPanel panel_68;

	private JLabel malignantNeoplasmOfLabel_31;

	// private JCheckBox cbEchocardiogramPulmonaryEmbolism;

	private JPanel panel_67;

	private JLabel malignantNeoplasmOfLabel_30;

	private JPanel panel_66;

	private JLabel malignantNeoplasmOfLabel_29;

	private JPanel panel_65;

	private JLabel malignantNeoplasmOfLabel_28;

	private JPanel panel_64;

	private JLabel malignantNeoplasmOfLabel_27;

	private JCheckBox cbEchocardiogramRheumaticHeart;

	private JPanel panel_63;

	// private JCheckBox cbEchocardiogramEssentialHypertension;

	private JLabel malignantNeoplasmOfLabel_25;

	// private JCheckBox cbEchocardiogramHypertensiveHeart;

	private JPanel panel_61;

	private JLabel malignantNeoplasmOfLabel_24;

	private JCheckBox cbEchocardiogramMitralAortic;

	private JPanel panel_60;

	private JLabel malignantNeoplasmOfLabel_23;

	private JCheckBox cbEchocardiogramUnspecifiedMV;

	private JPanel panel_59;

	private JLabel malignantNeoplasmOfLabel_22;

	private JCheckBox cbEchocardiogramMitralStenosis;

	private JPanel panel_58;

	private JLabel ultrasoundsLabel_4;

	private JPanel panel_57;

	private JPanel panel_56;

	private JTextArea malignantNeoplasmotherSitesTextArea_5;

	private JCheckBox cbCarotidOcclusionWithoutCI;

	private JPanel panel_55;

	private JTextArea malignantNeoplasmotherSitesTextArea_4;

	private JCheckBox cbCarotidOcclusionWithCI;

	private JPanel panel_54;

	private JLabel malignantNeoplasmOfLabel_21;

	private JCheckBox cbCarotidVisual;

	private JPanel panel_53;

	private JLabel malignantNeoplasmOfLabel_20;

	private JCheckBox cbCarotidUnspecified;

	private JPanel panel_52;

	private JLabel malignantNeoplasmOfLabel_19;

	private JCheckBox cbCarotidMigraine;

	private JPanel panel_51;

	private JLabel malignantNeoplasmOfLabel_18;

	private JCheckBox cbCarotidEpilepsy;

	private JPanel panel_50;

	private JLabel malignantNeoplasmOfLabel_17;

	private JCheckBox cbCarotidParalysis;

	private JPanel panel_49;

	private JLabel ultrasoundsLabel_3;

	private JPanel panel_48;

	private JPanel panel_47;

	private JLabel malignantNeoplasmOfLabel_16;

	private JCheckBox cbThyroidThyroiditis;

	private JPanel panel_46;

	private JLabel malignantNeoplasmOfLabel_15;

	private JCheckBox cbThyroidUnspecified;

	private JPanel panel_45;

	private JLabel malignantNeoplasmOfLabel_14;

	private JCheckBox cbThyroidHemorrhage;

	private JPanel panel_44;

	private JLabel malignantNeoplasmOfLabel_13;

	private JCheckBox cbThyroidHodgkins;

	private JPanel panel_43;

	private JPanel panel_20;

	private JTextArea icdTextArea_1;

	private JPanel panel_42;

	private JPanel panel_10;

	private JLabel malignantNeoplasmOfLabel_12;

	private JLabel malignantNeoplasmOfLabel_11;

	private JCheckBox cbThyroidDyshormonogenic;

	private JPanel panel_40;

	private JLabel malignantNeoplasmOfLabel_10;

	private JCheckBox cbThyroidDisorder;

	private JPanel panel_39;

	private JLabel malignantNeoplasmOfLabel_9;

	private JCheckBox cbThyroidCyst;

	private JPanel panel_38;

	private JCheckBox cbThyroidAnomalies;

	private JPanel panel_37;

	private JLabel ultrasoundsLabel_2;

	private JPanel panel_36;

	private JPanel panel_35;

	private JLabel label_13;

	private JPanel panel_34;

	private JLabel malignantNeoplasmOfLabel_8;

	private JCheckBox cbPelvisPelvisSwelling;

	private JPanel panel_33;

	private JTextArea malignantNeoplasmotherSitesTextArea_3;

	private JCheckBox cbPelvisMalignantNeoplasmOfMale;

	private JPanel panel_32;

	private JLabel malignantNeoplasmOfLabel_7;

	private JCheckBox cbPelvisMalignantProstate;

	private JPanel panel_31;

	private JLabel malignantNeoplasmOfLabel_6;

	private JCheckBox cbPelvisMalignantPelvis;

	private JPanel panel_30;

	private JLabel malignantNeoplasmOfLabel_5;

	private JCheckBox cbPelvisHyperplasia;

	private JPanel panel_29;

	private JLabel label_12;

	private JPanel panel_26;

	private JLabel label_11;

	private JPanel panel_25;

	private JLabel label_10;

	private JPanel panel_22;

	private JLabel label_9;

	private JPanel panel_21;

	private JLabel label_8;

	private JPanel panel_18;

	private JLabel malignantNeoplasmOfLabel_4;

	private JCheckBox cbPelvisDiverticulum;

	private JPanel panel_28;

	private JLabel malignantNeoplasmOfLabel_3;

	private JCheckBox cbPelvisCalculus;

	private JPanel panel_27;

	private JLabel label_7;

	private JPanel panel_17;

	private JLabel label_6;

	private JLabel label_5;

	private JLabel label_4;

	private JLabel label_1;

	private JLabel label_2;

	private JLabel label;

	private JTextArea malignantNeoplasmotherSitesTextArea_2;

	private JLabel pelvisbladderProstateLabel;

	private JPanel panel_24;

	private JPanel panel_23;

	private JCheckBox cbPelvisBenignNeoplasmMale;

	private JPanel panel_19;

	private JTextArea malignantNeoplasmotherSitesTextArea_1;

	private JCheckBox cbPelvisBenignNeoplasmFemale;

	private JPanel panel_16;

	private JLabel ultrasoundsLabel_1;

	private JPanel panel_15;

	private JPanel panel_14;

	private JPanel panel_13;

	private JPanel panel_12;

	private JPanel panel_11;

	private JPanel panel_9;

	private JPanel panel_5;

	private JLabel malignantNeoplasmOfLabel_2;

	private JCheckBox cbUltrasoundRenalFailure;

	private JPanel panel_8;

	private JLabel malignantNeoplasmOfLabel_1;

	private JCheckBox cbUltrasoundNiphritis;

	private JPanel panel_7;

	private JLabel malignantNeoplasmOfLabel;

	private JCheckBox cbUltrasoundMNfGallBladder;

	private JPanel panel_6;

	private JTextArea malignantNeoplasmotherSitesTextArea;

	private JCheckBox cbUltrasoundMalignantOterSites;

	private JPanel panel_4;

	private JTextArea icdTextArea;

	private JLabel ultrasoundsLabel;

	private JPanel panel_3;

	private JPanel panel_2;

	private JPanel panel_1;

	private JLabel resonForStudyLabel;

	private JPanel panel;

	/**
	 * Create the panel
	 */
	public PanelLabReasonForStudyPage1() {
		super();
		Global.panelLabReasonForStudyPage1 = this;
		setPreferredSize(new Dimension(800, 1200));
		setBackground(Color.WHITE);
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(13, 19, 775, 1137);
		add(panel);

		resonForStudyLabel = new JLabel();
		resonForStudyLabel.setFont(new Font("", Font.BOLD, 16));
		resonForStudyLabel.setText("REASON FOR STUDY (cont)");
		resonForStudyLabel.setBounds(286, 10, 214, 14);
		panel.add(resonForStudyLabel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBounds(17, 29, 748, 1089);
		panel.add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(1, 0, 258, 142);
		panel_1.add(panel_2);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBackground(Color.GRAY);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 259, 33);
		panel_2.add(panel_3);

		ultrasoundsLabel = new JLabel();
		ultrasoundsLabel.setForeground(Color.WHITE);
		ultrasoundsLabel.setFont(new Font("", Font.BOLD, 14));
		ultrasoundsLabel.setText("ULTRASOUNDS");
		ultrasoundsLabel.setBounds(10, 0, 119, 25);
		panel_3.add(ultrasoundsLabel);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(1, 33, 251, 32);
		panel_2.add(panel_4);

		cbUltrasoundMalignantOterSites = new JCheckBox();
		cbUltrasoundMalignantOterSites.setBackground(Color.WHITE);
		cbUltrasoundMalignantOterSites.setText("New JCheckBox");
		cbUltrasoundMalignantOterSites.setBounds(7, 3, 14, 18);
		panel_4.add(cbUltrasoundMalignantOterSites);

		malignantNeoplasmotherSitesTextArea = new JTextArea();
		malignantNeoplasmotherSitesTextArea.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea
				.setText("Malignant Neoplasm,Other Sites Of Digestive System Andintra-ABO Organ");
		malignantNeoplasmotherSitesTextArea.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea.setBounds(39, 0, 205, 32);
		panel_4.add(malignantNeoplasmotherSitesTextArea);

		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(1, 65, 251, 25);
		panel_2.add(panel_6);

		cbUltrasoundMNfGallBladder = new JCheckBox();
		cbUltrasoundMNfGallBladder.setBackground(Color.WHITE);
		cbUltrasoundMNfGallBladder.setText("New JCheckBox");
		cbUltrasoundMNfGallBladder.setBounds(7, 3, 14, 18);
		panel_6.add(cbUltrasoundMNfGallBladder);

		malignantNeoplasmOfLabel = new JLabel();
		malignantNeoplasmOfLabel.setText("Malignant Neoplasm Of Gall Bladder");
		malignantNeoplasmOfLabel.setBounds(39, 5, 189, 14);
		panel_6.add(malignantNeoplasmOfLabel);

		panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(1, 90, 251, 25);
		panel_2.add(panel_7);

		cbUltrasoundNiphritis = new JCheckBox();
		cbUltrasoundNiphritis.setBackground(Color.WHITE);
		cbUltrasoundNiphritis.setText("New JCheckBox");
		cbUltrasoundNiphritis.setBounds(7, 3, 14, 18);
		panel_7.add(cbUltrasoundNiphritis);

		malignantNeoplasmOfLabel_1 = new JLabel();
		malignantNeoplasmOfLabel_1.setText("Niphritis");
		malignantNeoplasmOfLabel_1.setBounds(39, 5, 189, 14);
		panel_7.add(malignantNeoplasmOfLabel_1);

		panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(1, 114, 251, 25);
		panel_2.add(panel_8);

		cbUltrasoundRenalFailure = new JCheckBox();
		cbUltrasoundRenalFailure.setBackground(Color.WHITE);
		cbUltrasoundRenalFailure.setText("New JCheckBox");
		cbUltrasoundRenalFailure.setBounds(7, 3, 14, 18);
		panel_8.add(cbUltrasoundRenalFailure);

		malignantNeoplasmOfLabel_2 = new JLabel();
		malignantNeoplasmOfLabel_2.setText("Renal Failure");
		malignantNeoplasmOfLabel_2.setBounds(39, 5, 189, 14);
		panel_8.add(malignantNeoplasmOfLabel_2);

		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(362, 0, 287, 309);
		panel_1.add(panel_14);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.GRAY);
		panel_15.setBounds(0, 0, 290, 33);
		panel_14.add(panel_15);

		ultrasoundsLabel_1 = new JLabel();
		ultrasoundsLabel_1.setForeground(Color.WHITE);
		ultrasoundsLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		ultrasoundsLabel_1.setText("ULTRASOUNDS");
		ultrasoundsLabel_1.setBounds(30, 0, 145, 25);
		panel_15.add(ultrasoundsLabel_1);

		panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(1, 65, 251, 32);
		panel_14.add(panel_16);

		cbPelvisBenignNeoplasmFemale = new JCheckBox();
		cbPelvisBenignNeoplasmFemale.setBackground(Color.WHITE);
		cbPelvisBenignNeoplasmFemale.setText("New JCheckBox");
		cbPelvisBenignNeoplasmFemale.setBounds(7, 3, 14, 18);
		panel_16.add(cbPelvisBenignNeoplasmFemale);

		malignantNeoplasmotherSitesTextArea_1 = new JTextArea();
		malignantNeoplasmotherSitesTextArea_1.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea_1
				.setText("Benign Neoplasm, Female Genital Organ, Site Unspecified");
		malignantNeoplasmotherSitesTextArea_1.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea_1.setBounds(39, 0, 205, 32);
		panel_16.add(malignantNeoplasmotherSitesTextArea_1);

		panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(1, 103, 251, 36);
		panel_14.add(panel_19);

		cbPelvisBenignNeoplasmMale = new JCheckBox();
		cbPelvisBenignNeoplasmMale.setBackground(Color.WHITE);
		cbPelvisBenignNeoplasmMale.setText("New JCheckBox");
		cbPelvisBenignNeoplasmMale.setBounds(7, 3, 14, 18);
		panel_19.add(cbPelvisBenignNeoplasmMale);

		malignantNeoplasmotherSitesTextArea_2 = new JTextArea();
		malignantNeoplasmotherSitesTextArea_2.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea_2
				.setText("Benign Neoplasm,Male Genital Organ, Site Unspecified");
		malignantNeoplasmotherSitesTextArea_2.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea_2.setBounds(39, 0, 205, 32);
		panel_19.add(malignantNeoplasmotherSitesTextArea_2);

		pelvisbladderProstateLabel = new JLabel();
		pelvisbladderProstateLabel.setFont(new Font("", Font.BOLD, 12));
		pelvisbladderProstateLabel
				.setText("PELVIS (Bladder, Prostate, Testicular-Scrotum)");
		pelvisbladderProstateLabel.setBounds(11, 38, 267, 14);
		panel_14.add(pelvisbladderProstateLabel);

		panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(1, 137, 251, 25);
		panel_14.add(panel_27);

		cbPelvisCalculus = new JCheckBox();
		cbPelvisCalculus.setBackground(Color.WHITE);
		cbPelvisCalculus.setText("New JCheckBox");
		cbPelvisCalculus.setBounds(7, 3, 14, 18);
		panel_27.add(cbPelvisCalculus);

		malignantNeoplasmOfLabel_3 = new JLabel();
		malignantNeoplasmOfLabel_3
				.setText("Calculus in Diverticulum of Blaoder");
		malignantNeoplasmOfLabel_3.setBounds(39, 5, 189, 14);
		panel_27.add(malignantNeoplasmOfLabel_3);

		panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(1, 161, 251, 25);
		panel_14.add(panel_28);

		cbPelvisDiverticulum = new JCheckBox();
		cbPelvisDiverticulum.setBackground(Color.WHITE);
		cbPelvisDiverticulum.setText("New JCheckBox");
		cbPelvisDiverticulum.setBounds(7, 3, 14, 18);
		panel_28.add(cbPelvisDiverticulum);

		malignantNeoplasmOfLabel_4 = new JLabel();
		malignantNeoplasmOfLabel_4.setText("Diverticulum of Bladder");
		malignantNeoplasmOfLabel_4.setBounds(39, 5, 189, 14);
		panel_28.add(malignantNeoplasmOfLabel_4);

		panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(1, 183, 251, 25);
		panel_14.add(panel_29);

		cbPelvisHyperplasia = new JCheckBox();
		cbPelvisHyperplasia.setBackground(Color.WHITE);
		cbPelvisHyperplasia.setText("New JCheckBox");
		cbPelvisHyperplasia.setBounds(7, 3, 14, 18);
		panel_29.add(cbPelvisHyperplasia);

		malignantNeoplasmOfLabel_5 = new JLabel();
		malignantNeoplasmOfLabel_5.setText("Hyperplasia of Prostate");
		malignantNeoplasmOfLabel_5.setBounds(39, 5, 189, 14);
		panel_29.add(malignantNeoplasmOfLabel_5);

		panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(1, 206, 251, 25);
		panel_14.add(panel_30);

		cbPelvisMalignantPelvis = new JCheckBox();
		cbPelvisMalignantPelvis.setBackground(Color.WHITE);
		cbPelvisMalignantPelvis.setText("New JCheckBox");
		cbPelvisMalignantPelvis.setBounds(7, 3, 14, 18);
		panel_30.add(cbPelvisMalignantPelvis);

		malignantNeoplasmOfLabel_6 = new JLabel();
		malignantNeoplasmOfLabel_6.setText("Malignant Neoplasm of Pelvis");
		malignantNeoplasmOfLabel_6.setBounds(39, 5, 189, 14);
		panel_30.add(malignantNeoplasmOfLabel_6);

		panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(1, 231, 251, 25);
		panel_14.add(panel_31);

		cbPelvisMalignantProstate = new JCheckBox();
		cbPelvisMalignantProstate.setBackground(Color.WHITE);
		cbPelvisMalignantProstate.setText("New JCheckBox");
		cbPelvisMalignantProstate.setBounds(7, 3, 14, 18);
		panel_31.add(cbPelvisMalignantProstate);

		malignantNeoplasmOfLabel_7 = new JLabel();
		malignantNeoplasmOfLabel_7.setText("Malignant Neoplasm of Prostate");
		malignantNeoplasmOfLabel_7.setBounds(39, 5, 189, 14);
		panel_31.add(malignantNeoplasmOfLabel_7);

		panel_32 = new JPanel();
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(1, 254, 251, 32);
		panel_14.add(panel_32);

		cbPelvisMalignantNeoplasmOfMale = new JCheckBox();
		cbPelvisMalignantNeoplasmOfMale.setBackground(Color.WHITE);
		cbPelvisMalignantNeoplasmOfMale.setText("New JCheckBox");
		cbPelvisMalignantNeoplasmOfMale.setBounds(7, 3, 14, 18);
		panel_32.add(cbPelvisMalignantNeoplasmOfMale);

		malignantNeoplasmotherSitesTextArea_3 = new JTextArea();
		malignantNeoplasmotherSitesTextArea_3.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea_3
				.setText("Malignant Neoplasm of Male Genital Organ, Site Unspecified");
		malignantNeoplasmotherSitesTextArea_3.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea_3.setBounds(39, 0, 205, 32);
		panel_32.add(malignantNeoplasmotherSitesTextArea_3);

		panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(1, 283, 251, 25);
		panel_14.add(panel_33);

		cbPelvisPelvisSwelling = new JCheckBox();
		cbPelvisPelvisSwelling.setBackground(Color.WHITE);
		cbPelvisPelvisSwelling.setText("New JCheckBox");
		cbPelvisPelvisSwelling.setBounds(7, 3, 14, 18);
		panel_33.add(cbPelvisPelvisSwelling);

		malignantNeoplasmOfLabel_8 = new JLabel();
		malignantNeoplasmOfLabel_8.setText("Pelvis Swelling");
		malignantNeoplasmOfLabel_8.setBounds(39, 5, 189, 14);
		panel_33.add(malignantNeoplasmOfLabel_8);

		panel_35 = new JPanel();
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(1, 140, 258, 198);
		panel_1.add(panel_35);

		panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setBounds(1, 0, 251, 20);
		panel_35.add(panel_36);

		ultrasoundsLabel_2 = new JLabel();
		ultrasoundsLabel_2.setForeground(Color.BLACK);
		ultrasoundsLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		ultrasoundsLabel_2.setText("THYROID");
		ultrasoundsLabel_2.setBounds(10, 0, 124, 25);
		panel_36.add(ultrasoundsLabel_2);

		panel_37 = new JPanel();
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(1, 23, 251, 25);
		panel_35.add(panel_37);

		cbThyroidAnomalies = new JCheckBox();
		cbThyroidAnomalies.setBackground(Color.WHITE);
		cbThyroidAnomalies.setText("New JCheckBox");
		cbThyroidAnomalies.setBounds(7, 3, 14, 18);
		panel_37.add(cbThyroidAnomalies);

		malignantNeoplasmOfLabel_12 = new JLabel();
		malignantNeoplasmOfLabel_12.setText("Anomalies of Endocrine Glands");
		malignantNeoplasmOfLabel_12.setBounds(39, 6, 189, 14);
		panel_37.add(malignantNeoplasmOfLabel_12);

		panel_38 = new JPanel();
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(1, 48, 251, 25);
		panel_35.add(panel_38);

		cbThyroidCyst = new JCheckBox();
		cbThyroidCyst.setBackground(Color.WHITE);
		cbThyroidCyst.setText("New JCheckBox");
		cbThyroidCyst.setBounds(7, 3, 14, 18);
		panel_38.add(cbThyroidCyst);

		malignantNeoplasmOfLabel_9 = new JLabel();
		malignantNeoplasmOfLabel_9.setText("Cyst of Thyroid");
		malignantNeoplasmOfLabel_9.setBounds(39, 5, 189, 14);
		panel_38.add(malignantNeoplasmOfLabel_9);

		panel_39 = new JPanel();
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(1, 70, 251, 25);
		panel_35.add(panel_39);

		cbThyroidDisorder = new JCheckBox();
		cbThyroidDisorder.setBackground(Color.WHITE);
		cbThyroidDisorder.setText("New JCheckBox");
		cbThyroidDisorder.setBounds(7, 3, 14, 18);
		panel_39.add(cbThyroidDisorder);

		malignantNeoplasmOfLabel_10 = new JLabel();
		malignantNeoplasmOfLabel_10
				.setText("Disorders of Thyrocalcitomnin Secretion");
		malignantNeoplasmOfLabel_10.setBounds(39, 5, 189, 14);
		panel_39.add(malignantNeoplasmOfLabel_10);

		panel_40 = new JPanel();
		panel_40.setLayout(null);
		panel_40.setBackground(Color.WHITE);
		panel_40.setBounds(1, 90, 251, 25);
		panel_35.add(panel_40);

		cbThyroidDyshormonogenic = new JCheckBox();
		cbThyroidDyshormonogenic.setBackground(Color.WHITE);
		cbThyroidDyshormonogenic.setText("New JCheckBox");
		cbThyroidDyshormonogenic.setBounds(7, 3, 14, 18);
		panel_40.add(cbThyroidDyshormonogenic);

		malignantNeoplasmOfLabel_11 = new JLabel();
		malignantNeoplasmOfLabel_11.setText("Dyshormonogenic Goiter");
		malignantNeoplasmOfLabel_11.setBounds(39, 5, 189, 14);
		panel_40.add(malignantNeoplasmOfLabel_11);

		panel_43 = new JPanel();
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(1, 110, 251, 25);
		panel_35.add(panel_43);

		cbThyroidHodgkins = new JCheckBox();
		cbThyroidHodgkins.setBackground(Color.WHITE);
		cbThyroidHodgkins.setText("New JCheckBox");
		cbThyroidHodgkins.setBounds(7, 3, 14, 18);
		panel_43.add(cbThyroidHodgkins);

		malignantNeoplasmOfLabel_13 = new JLabel();
		malignantNeoplasmOfLabel_13.setText("Hodgkins Disease");
		malignantNeoplasmOfLabel_13.setBounds(39, 5, 189, 14);
		panel_43.add(malignantNeoplasmOfLabel_13);

		panel_44 = new JPanel();
		panel_44.setLayout(null);
		panel_44.setBackground(Color.WHITE);
		panel_44.setBounds(1, 130, 251, 25);
		panel_35.add(panel_44);

		cbThyroidHemorrhage = new JCheckBox();
		cbThyroidHemorrhage.setBackground(Color.WHITE);
		cbThyroidHemorrhage.setText("New JCheckBox");
		cbThyroidHemorrhage.setBounds(7, 3, 14, 18);
		panel_44.add(cbThyroidHemorrhage);

		malignantNeoplasmOfLabel_14 = new JLabel();
		malignantNeoplasmOfLabel_14
				.setText("Hemorrhage & infarction of Thyroid");
		malignantNeoplasmOfLabel_14.setBounds(39, 5, 189, 14);
		panel_44.add(malignantNeoplasmOfLabel_14);

		panel_45 = new JPanel();
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(1, 150, 251, 25);
		panel_35.add(panel_45);

		cbThyroidUnspecified = new JCheckBox();
		cbThyroidUnspecified.setBackground(Color.WHITE);
		cbThyroidUnspecified.setText("New JCheckBox");
		cbThyroidUnspecified.setBounds(7, 3, 14, 18);
		panel_45.add(cbThyroidUnspecified);

		malignantNeoplasmOfLabel_15 = new JLabel();
		malignantNeoplasmOfLabel_15.setText("Unspecified Disorder of Thyroid");
		malignantNeoplasmOfLabel_15.setBounds(39, 5, 189, 14);
		panel_45.add(malignantNeoplasmOfLabel_15);

		panel_46 = new JPanel();
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(1, 170, 248, 25);
		panel_35.add(panel_46);

		cbThyroidThyroiditis = new JCheckBox();
		cbThyroidThyroiditis.setBackground(Color.WHITE);
		cbThyroidThyroiditis.setText("New JCheckBox");
		cbThyroidThyroiditis.setBounds(7, 3, 14, 18);
		panel_46.add(cbThyroidThyroiditis);

		malignantNeoplasmOfLabel_16 = new JLabel();
		malignantNeoplasmOfLabel_16.setText("Thyroiditis Acute");
		malignantNeoplasmOfLabel_16.setBounds(39, 5, 189, 14);
		panel_46.add(malignantNeoplasmOfLabel_16);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBounds(259, 33, 103, 1056);
		panel_1.add(panel_5);
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);

		panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(3, 0, 98, 32);
		panel_5.add(panel_9);

		label = new JLabel();
		label.setText("159.8");
		label.setBounds(10, 0, 54, 14);
		panel_9.add(label);

		panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(3, 31, 98, 26);
		panel_5.add(panel_11);

		label_2 = new JLabel();
		label_2.setText("156.0");
		label_2.setBounds(10, 0, 54, 14);
		panel_11.add(label_2);

		panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setBounds(3, 58, 98, 26);
		panel_5.add(panel_12);

		label_1 = new JLabel();
		label_1.setText("583.9");
		label_1.setBounds(10, 0, 54, 14);
		panel_12.add(label_1);

		panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(3, 84, 98, 26);
		panel_5.add(panel_13);

		label_4 = new JLabel();
		label_4.setText("586.0");
		label_4.setBounds(10, 0, 54, 14);
		panel_13.add(label_4);

		panel_78 = new JPanel();
		panel_78.setLayout(null);
		panel_78.setBackground(Color.WHITE);
		panel_78.setBounds(3, 128, 80, 20);
		panel_5.add(panel_78);

		label_14 = new JLabel();
		label_14.setText("759.2");
		label_14.setBounds(10, 0, 54, 14);
		panel_78.add(label_14);

		panel_79 = new JPanel();
		panel_79.setLayout(null);
		panel_79.setBackground(Color.WHITE);
		panel_79.setBounds(3, 154, 80, 20);
		panel_5.add(panel_79);

		label_15 = new JLabel();
		label_15.setText("246.2");
		label_15.setBounds(10, 0, 54, 14);
		panel_79.add(label_15);

		panel_80 = new JPanel();
		panel_80.setBounds(0, 20, 80, 20);
		panel_79.add(panel_80);
		panel_80.setLayout(null);
		panel_80.setBackground(Color.WHITE);

		label_16 = new JLabel();
		label_16.setText("594.0");
		label_16.setBounds(10, 0, 54, 14);
		panel_80.add(label_16);

		panel_81 = new JPanel();
		panel_81.setLayout(null);
		panel_81.setBackground(Color.WHITE);
		panel_81.setBounds(3, 195, 80, 20);
		panel_5.add(panel_81);

		label_17 = new JLabel();
		label_17.setText("246.1");
		label_17.setBounds(10, 0, 54, 14);
		panel_81.add(label_17);

		panel_82 = new JPanel();
		panel_82.setLayout(null);
		panel_82.setBackground(Color.WHITE);
		panel_82.setBounds(3, 173, 80, 20);
		panel_5.add(panel_82);

		label_18 = new JLabel();
		label_18.setText("246.0");
		label_18.setBounds(10, 0, 54, 14);
		panel_82.add(label_18);

		panel_83 = new JPanel();
		panel_83.setLayout(null);
		panel_83.setBackground(Color.WHITE);
		panel_83.setBounds(3, 217, 80, 20);
		panel_5.add(panel_83);

		label_19 = new JLabel();
		label_19.setText("201.1");
		label_19.setBounds(10, 0, 54, 14);
		panel_83.add(label_19);

		panel_84 = new JPanel();
		panel_84.setLayout(null);
		panel_84.setBackground(Color.WHITE);
		panel_84.setBounds(3, 236, 80, 20);
		panel_5.add(panel_84);

		label_20 = new JLabel();
		label_20.setText("246.3");
		label_20.setBounds(10, 0, 54, 14);
		panel_84.add(label_20);

		panel_85 = new JPanel();
		panel_85.setLayout(null);
		panel_85.setBackground(Color.WHITE);
		panel_85.setBounds(3, 257, 80, 20);
		panel_5.add(panel_85);

		label_21 = new JLabel();
		label_21.setText("246.9");
		label_21.setBounds(10, 0, 54, 14);
		panel_85.add(label_21);

		panel_86 = new JPanel();
		panel_86.setLayout(null);
		panel_86.setBackground(Color.WHITE);
		panel_86.setBounds(3, 283, 80, 20);
		panel_5.add(panel_86);

		label_22 = new JLabel();
		label_22.setText("245.0");
		label_22.setBounds(10, 0, 54, 14);
		panel_86.add(label_22);

		panel_87 = new JPanel();
		panel_87.setLayout(null);
		panel_87.setBackground(Color.WHITE);
		panel_87.setBounds(3, 336, 80, 20);
		panel_5.add(panel_87);

		label_23 = new JLabel();
		label_23.setText("344.9");
		label_23.setBounds(10, 0, 54, 14);
		panel_87.add(label_23);

		panel_88 = new JPanel();
		panel_88.setLayout(null);
		panel_88.setBackground(Color.WHITE);
		panel_88.setBounds(3, 369, 80, 20);
		panel_5.add(panel_88);

		label_24 = new JLabel();
		label_24.setText("345.9");
		label_24.setBounds(10, 0, 54, 14);
		panel_88.add(label_24);

		panel_89 = new JPanel();
		panel_89.setLayout(null);
		panel_89.setBackground(Color.WHITE);
		panel_89.setBounds(3, 396, 80, 20);
		panel_5.add(panel_89);

		label_25 = new JLabel();
		label_25.setText("346.9");
		label_25.setBounds(10, 0, 54, 14);
		panel_89.add(label_25);

		panel_90 = new JPanel();
		panel_90.setLayout(null);
		panel_90.setBackground(Color.WHITE);
		panel_90.setBounds(3, 417, 80, 20);
		panel_5.add(panel_90);

		label_26 = new JLabel();
		label_26.setText("348.4");
		label_26.setBounds(10, 0, 54, 14);
		panel_90.add(label_26);

		panel_91 = new JPanel();
		panel_91.setLayout(null);
		panel_91.setBackground(Color.WHITE);
		panel_91.setBounds(3, 438, 80, 20);
		panel_5.add(panel_91);

		label_27 = new JLabel();
		label_27.setText("368.4");
		label_27.setBounds(10, 0, 54, 14);
		panel_91.add(label_27);

		panel_92 = new JPanel();
		panel_92.setLayout(null);
		panel_92.setBackground(Color.WHITE);
		panel_92.setBounds(3, 465, 80, 20);
		panel_5.add(panel_92);

		label_28 = new JLabel();
		label_28.setText("433.1");
		label_28.setBounds(10, 0, 54, 14);
		panel_92.add(label_28);

		panel_93 = new JPanel();
		panel_93.setLayout(null);
		panel_93.setBackground(Color.WHITE);
		panel_93.setBounds(3, 493, 80, 20);
		panel_5.add(panel_93);

		label_29 = new JLabel();
		label_29.setText("433.0");
		label_29.setBounds(10, 0, 54, 14);
		panel_93.add(label_29);

		panel_94 = new JPanel();
		panel_94.setLayout(null);
		panel_94.setBackground(Color.WHITE);
		panel_94.setBounds(3, 560, 80, 20);
		panel_5.add(panel_94);

		label_30 = new JLabel();
		label_30.setText("394.0");
		label_30.setBounds(10, 0, 54, 14);
		panel_94.add(label_30);

		panel_95 = new JPanel();
		panel_95.setLayout(null);
		panel_95.setBackground(Color.WHITE);
		panel_95.setBounds(3, 597, 80, 20);
		panel_5.add(panel_95);

		label_31 = new JLabel();
		label_31.setText("394.9");
		label_31.setBounds(10, 0, 54, 14);
		panel_95.add(label_31);

		panel_96 = new JPanel();
		panel_96.setLayout(null);
		panel_96.setBackground(Color.WHITE);
		panel_96.setBounds(3, 618, 80, 20);
		panel_5.add(panel_96);

		label_32 = new JLabel();
		label_32.setText("396.9");
		label_32.setBounds(10, 0, 54, 14);
		panel_96.add(label_32);

		panel_97 = new JPanel();
		panel_97.setLayout(null);
		panel_97.setBackground(Color.WHITE);
		panel_97.setBounds(3, 642, 80, 20);
		panel_5.add(panel_97);

		label_33 = new JLabel();
		label_33.setText("402.9");
		label_33.setBounds(10, 0, 54, 14);
		panel_97.add(label_33);

		panel_98 = new JPanel();
		panel_98.setLayout(null);
		panel_98.setBackground(Color.WHITE);
		panel_98.setBounds(3, 662, 80, 20);
		panel_5.add(panel_98);

		label_34 = new JLabel();
		label_34.setText("401.9");
		label_34.setBounds(10, 0, 54, 14);
		panel_98.add(label_34);

		panel_99 = new JPanel();
		panel_99.setLayout(null);
		panel_99.setBackground(Color.WHITE);
		panel_99.setBounds(3, 685, 80, 20);
		panel_5.add(panel_99);

		label_35 = new JLabel();
		label_35.setText("398.9");
		label_35.setBounds(10, 0, 54, 14);
		panel_99.add(label_35);

		panel_100 = new JPanel();
		panel_100.setLayout(null);
		panel_100.setBackground(Color.WHITE);
		panel_100.setBounds(3, 708, 80, 20);
		panel_5.add(panel_100);

		label_36 = new JLabel();
		label_36.setText("410.0");
		label_36.setBounds(10, 0, 54, 14);
		panel_100.add(label_36);

		panel_101 = new JPanel();
		panel_101.setLayout(null);
		panel_101.setBackground(Color.WHITE);
		panel_101.setBounds(3, 730, 80, 20);
		panel_5.add(panel_101);

		label_37 = new JLabel();
		label_37.setText("411.81");
		label_37.setBounds(10, 0, 54, 14);
		panel_101.add(label_37);

		panel_102 = new JPanel();
		panel_102.setLayout(null);
		panel_102.setBackground(Color.WHITE);
		panel_102.setBounds(3, 753, 80, 20);
		panel_5.add(panel_102);

		label_38 = new JLabel();
		label_38.setText("420.9");
		label_38.setBounds(10, 0, 54, 14);
		panel_102.add(label_38);

		panel_103 = new JPanel();
		panel_103.setLayout(null);
		panel_103.setBackground(Color.WHITE);
		panel_103.setBounds(3, 776, 80, 20);
		panel_5.add(panel_103);

		label_39 = new JLabel();
		label_39.setText("475.1");
		label_39.setBounds(10, 0, 54, 14);
		panel_103.add(label_39);

		panel_104 = new JPanel();
		panel_104.setLayout(null);
		panel_104.setBackground(Color.WHITE);
		panel_104.setBounds(3, 802, 80, 20);
		panel_5.add(panel_104);

		label_40 = new JLabel();
		label_40.setText("417.9");
		label_40.setBounds(10, 0, 54, 14);
		panel_104.add(label_40);

		panel_105 = new JPanel();
		panel_105.setLayout(null);
		panel_105.setBackground(Color.WHITE);
		panel_105.setBounds(3, 828, 80, 20);
		panel_5.add(panel_105);

		label_41 = new JLabel();
		label_41.setText("414.1");
		label_41.setBounds(10, 0, 54, 14);
		panel_105.add(label_41);

		panel_106 = new JPanel();
		panel_106.setLayout(null);
		panel_106.setBackground(Color.WHITE);
		panel_106.setBounds(3, 847, 80, 20);
		panel_5.add(panel_106);

		label_42 = new JLabel();
		label_42.setText("426.6");
		label_42.setBounds(10, 0, 54, 14);
		panel_106.add(label_42);

		panel_107 = new JPanel();
		panel_107.setLayout(null);
		panel_107.setBackground(Color.WHITE);
		panel_107.setBounds(3, 873, 80, 20);
		panel_5.add(panel_107);

		label_43 = new JLabel();
		label_43.setText("427.3");
		label_43.setBounds(10, 0, 54, 14);
		panel_107.add(label_43);

		panel_108 = new JPanel();
		panel_108.setLayout(null);
		panel_108.setBackground(Color.WHITE);
		panel_108.setBounds(3, 899, 80, 20);
		panel_5.add(panel_108);

		label_44 = new JLabel();
		label_44.setText("427.6");
		label_44.setBounds(10, 0, 54, 14);
		panel_108.add(label_44);

		panel_109 = new JPanel();
		panel_109.setLayout(null);
		panel_109.setBackground(Color.WHITE);
		panel_109.setBounds(3, 923, 80, 20);
		panel_5.add(panel_109);

		label_45 = new JLabel();
		label_45.setText("427.5");
		label_45.setBounds(10, 0, 54, 14);
		panel_109.add(label_45);

		panel_110 = new JPanel();
		panel_110.setLayout(null);
		panel_110.setBackground(Color.WHITE);
		panel_110.setBounds(3, 945, 80, 20);
		panel_5.add(panel_110);

		label_46 = new JLabel();
		label_46.setText("428.9");
		label_46.setBounds(10, 0, 54, 14);
		panel_110.add(label_46);

		panel_111 = new JPanel();
		panel_111.setLayout(null);
		panel_111.setBackground(Color.WHITE);
		panel_111.setBounds(3, 971, 80, 20);
		panel_5.add(panel_111);

		label_47 = new JLabel();
		label_47.setText("429.2");
		label_47.setBounds(10, 0, 54, 14);
		panel_111.add(label_47);

		panel_112 = new JPanel();
		panel_112.setLayout(null);
		panel_112.setBackground(Color.WHITE);
		panel_112.setBounds(3, 992, 80, 20);
		panel_5.add(panel_112);

		label_48 = new JLabel();
		label_48.setText("429.0");
		label_48.setBounds(10, 0, 54, 14);
		panel_112.add(label_48);

		panel_113 = new JPanel();
		panel_113.setLayout(null);
		panel_113.setBackground(Color.WHITE);
		panel_113.setBounds(3, 1018, 80, 20);
		panel_5.add(panel_113);

		label_49 = new JLabel();
		label_49.setText("429.3");
		label_49.setBounds(10, 0, 54, 14);
		panel_113.add(label_49);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBackground(Color.GRAY);
		panel_10.setLayout(null);
		panel_10.setBounds(259, 0, 103, 33);
		panel_1.add(panel_10);

		icdTextArea = new JTextArea();
		icdTextArea.setBounds(23, 1, 45, 30);
		panel_10.add(icdTextArea);
		icdTextArea.setBackground(Color.GRAY);
		icdTextArea.setForeground(Color.WHITE);
		icdTextArea.setFont(new Font("", Font.BOLD, 11));
		icdTextArea.setWrapStyleWord(true);
		icdTextArea.setText("ICD CODE");
		icdTextArea.setLineWrap(true);

		panel_42 = new JPanel();
		panel_42.setBounds(649, 0, 99, 33);
		panel_1.add(panel_42);
		panel_42.setBorder(new LineBorder(Color.black, 1, false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.GRAY);

		icdTextArea_1 = new JTextArea();
		icdTextArea_1.setWrapStyleWord(true);
		icdTextArea_1.setText("ICD CODE");
		icdTextArea_1.setLineWrap(true);
		icdTextArea_1.setForeground(Color.WHITE);
		icdTextArea_1.setFont(new Font("Dialog", Font.BOLD, 11));
		icdTextArea_1.setBackground(Color.GRAY);
		icdTextArea_1.setBounds(25, 1, 45, 31);
		panel_42.add(icdTextArea_1);

		panel_20 = new JPanel();
		panel_20.setBackground(Color.WHITE);
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBounds(649, 33, 99, 1056);
		panel_1.add(panel_20);

		panel_23 = new JPanel();
		panel_23.setBounds(10, 30, 80, 26);
		panel_20.add(panel_23);
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);

		label_5 = new JLabel();
		label_5.setText("221.9");
		label_5.setBounds(10, 10, 54, 14);
		panel_23.add(label_5);

		panel_24 = new JPanel();
		panel_24.setBounds(10, 70, 80, 24);
		panel_20.add(panel_24);
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);

		label_6 = new JLabel();
		label_6.setText("222.9");
		label_6.setBounds(10, 10, 54, 14);
		panel_24.add(label_6);

		panel_17 = new JPanel();
		panel_17.setBounds(10, 107, 80, 20);
		panel_20.add(panel_17);
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);

		label_7 = new JLabel();
		label_7.setText("594.0");
		label_7.setBounds(10, 0, 54, 14);
		panel_17.add(label_7);

		panel_18 = new JPanel();
		panel_18.setBounds(10, 130, 80, 20);
		panel_20.add(panel_18);
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);

		label_8 = new JLabel();
		label_8.setText("596.3");
		label_8.setBounds(10, 0, 54, 14);
		panel_18.add(label_8);

		panel_34 = new JPanel();
		panel_34.setBounds(10, 155, 80, 20);
		panel_20.add(panel_34);
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);

		label_13 = new JLabel();
		label_13.setText("600.0");
		label_13.setBounds(10, 0, 54, 14);
		panel_34.add(label_13);

		panel_21 = new JPanel();
		panel_21.setBounds(10, 176, 80, 20);
		panel_20.add(panel_21);
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);

		label_9 = new JLabel();
		label_9.setText("195.3");
		label_9.setBounds(10, 0, 54, 14);
		panel_21.add(label_9);

		panel_22 = new JPanel();
		panel_22.setBounds(10, 197, 80, 20);
		panel_20.add(panel_22);
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);

		label_10 = new JLabel();
		label_10.setText("185.0");
		label_10.setBounds(10, 0, 54, 14);
		panel_22.add(label_10);

		panel_25 = new JPanel();
		panel_25.setBounds(10, 223, 80, 20);
		panel_20.add(panel_25);
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);

		label_11 = new JLabel();
		label_11.setText("187.9");
		label_11.setBounds(10, 0, 54, 14);
		panel_25.add(label_11);

		panel_26 = new JPanel();
		panel_26.setBounds(10, 249, 80, 20);
		panel_20.add(panel_26);
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);

		label_12 = new JLabel();
		label_12.setText("789.30");
		label_12.setBounds(10, 0, 54, 14);
		panel_26.add(label_12);

		panel_133 = new JPanel();
		panel_133.setLayout(null);
		panel_133.setBackground(Color.WHITE);
		panel_133.setBounds(10, 296, 80, 20);
		panel_20.add(panel_133);

		label_50 = new JLabel();
		label_50.setText("511.9");
		label_50.setBounds(10, 0, 54, 14);
		panel_133.add(label_50);

		panel_144 = new JPanel();
		panel_144.setLayout(null);
		panel_144.setBackground(Color.WHITE);
		panel_144.setBounds(10, 322, 80, 20);
		panel_20.add(panel_144);

		label_51 = new JLabel();
		label_51.setText("610.0");
		label_51.setBounds(10, 0, 54, 14);
		panel_144.add(label_51);

		panel_145 = new JPanel();
		panel_145.setLayout(null);
		panel_145.setBackground(Color.WHITE);
		panel_145.setBounds(10, 341, 80, 20);
		panel_20.add(panel_145);

		label_52 = new JLabel();
		label_52.setText("611.72");
		label_52.setBounds(10, 0, 54, 14);
		panel_145.add(label_52);

		panel_146 = new JPanel();
		panel_146.setLayout(null);
		panel_146.setBackground(Color.WHITE);
		panel_146.setBounds(10, 367, 80, 20);
		panel_20.add(panel_146);

		label_53 = new JLabel();
		label_53.setText("611.71");
		label_53.setBounds(10, 0, 54, 14);
		panel_146.add(label_53);

		panel_147 = new JPanel();
		panel_147.setLayout(null);
		panel_147.setBackground(Color.WHITE);
		panel_147.setBounds(10, 412, 80, 20);
		panel_20.add(panel_147);

		label_54 = new JLabel();
		label_54.setText("454.0");
		label_54.setBounds(10, 0, 54, 14);
		panel_147.add(label_54);

		panel_148 = new JPanel();
		panel_148.setLayout(null);
		panel_148.setBackground(Color.WHITE);
		panel_148.setBounds(10, 434, 80, 20);
		panel_20.add(panel_148);

		label_55 = new JLabel();
		label_55.setText("454.1");
		label_55.setBounds(10, 0, 54, 14);
		panel_148.add(label_55);

		panel_149 = new JPanel();
		panel_149.setLayout(null);
		panel_149.setBackground(Color.WHITE);
		panel_149.setBounds(10, 459, 80, 20);
		panel_20.add(panel_149);

		label_56 = new JLabel();
		label_56.setText("454.2");
		label_56.setBounds(10, 0, 54, 14);
		panel_149.add(label_56);

		panel_150 = new JPanel();
		panel_150.setLayout(null);
		panel_150.setBackground(Color.WHITE);
		panel_150.setBounds(10, 485, 80, 20);
		panel_20.add(panel_150);

		label_57 = new JLabel();
		label_57.setText("454.9");
		label_57.setBounds(10, 0, 54, 14);
		panel_150.add(label_57);

		panel_151 = new JPanel();
		panel_151.setLayout(null);
		panel_151.setBackground(Color.WHITE);
		panel_151.setBounds(10, 507, 80, 20);
		panel_20.add(panel_151);

		label_58 = new JLabel();
		label_58.setText("415.1");
		label_58.setBounds(10, 0, 54, 14);
		panel_151.add(label_58);

		panel_152 = new JPanel();
		panel_152.setLayout(null);
		panel_152.setBackground(Color.WHITE);
		panel_152.setBounds(10, 530, 80, 20);
		panel_20.add(panel_152);

		label_59 = new JLabel();
		label_59.setText("451.2");
		label_59.setBounds(10, 0, 54, 14);
		panel_152.add(label_59);

		panel_153 = new JPanel();
		panel_153.setLayout(null);
		panel_153.setBackground(Color.WHITE);
		panel_153.setBounds(10, 558, 80, 20);
		panel_20.add(panel_153);

		label_60 = new JLabel();
		label_60.setText("451.84");
		label_60.setBounds(10, 0, 54, 14);
		panel_153.add(label_60);

		panel_154 = new JPanel();
		panel_154.setLayout(null);
		panel_154.setBackground(Color.WHITE);
		panel_154.setBounds(10, 595, 80, 20);
		panel_20.add(panel_154);

		label_61 = new JLabel();
		label_61.setText("449.0");
		label_61.setBounds(10, 0, 54, 14);
		panel_154.add(label_61);

		panel_155 = new JPanel();
		panel_155.setLayout(null);
		panel_155.setBackground(Color.WHITE);
		panel_155.setBounds(10, 615, 80, 20);
		panel_20.add(panel_155);

		label_62 = new JLabel();
		label_62.setText("449.2");
		label_62.setBounds(10, 0, 54, 14);
		panel_155.add(label_62);

		panel_156 = new JPanel();
		panel_156.setLayout(null);
		panel_156.setBackground(Color.WHITE);
		panel_156.setBounds(10, 641, 80, 20);
		panel_20.add(panel_156);

		label_63 = new JLabel();
		label_63.setText("747.69");
		label_63.setBounds(10, 0, 54, 14);
		panel_156.add(label_63);

		panel_157 = new JPanel();
		panel_157.setLayout(null);
		panel_157.setBackground(Color.WHITE);
		panel_157.setBounds(10, 737, 80, 20);
		panel_20.add(panel_157);

		label_64 = new JLabel();
		label_64.setText("250.7");
		label_64.setBounds(10, 0, 54, 14);
		panel_157.add(label_64);

		panel_158 = new JPanel();
		panel_158.setLayout(null);
		panel_158.setBackground(Color.WHITE);
		panel_158.setBounds(10, 770, 80, 20);
		panel_20.add(panel_158);

		label_65 = new JLabel();
		label_65.setText("440.21");
		label_65.setBounds(10, 0, 54, 14);
		panel_158.add(label_65);

		panel_159 = new JPanel();
		panel_159.setLayout(null);
		panel_159.setBackground(Color.WHITE);
		panel_159.setBounds(10, 800, 80, 20);
		panel_20.add(panel_159);

		label_66 = new JLabel();
		label_66.setText("440.22");
		label_66.setBounds(10, 0, 54, 14);
		panel_159.add(label_66);

		panel_160 = new JPanel();
		panel_160.setLayout(null);
		panel_160.setBackground(Color.WHITE);
		panel_160.setBounds(10, 831, 80, 20);
		panel_20.add(panel_160);

		label_67 = new JLabel();
		label_67.setText("440.23");
		label_67.setBounds(10, 0, 54, 14);
		panel_160.add(label_67);

		panel_161 = new JPanel();
		panel_161.setLayout(null);
		panel_161.setBackground(Color.WHITE);
		panel_161.setBounds(10, 862, 80, 20);
		panel_20.add(panel_161);

		label_68 = new JLabel();
		label_68.setText("440.24");
		label_68.setBounds(10, 0, 54, 14);
		panel_161.add(label_68);

		panel_162 = new JPanel();
		panel_162.setLayout(null);
		panel_162.setBackground(Color.WHITE);
		panel_162.setBounds(10, 888, 80, 20);
		panel_20.add(panel_162);

		label_69 = new JLabel();
		label_69.setText("446.9");
		label_69.setBounds(10, 0, 54, 14);
		panel_162.add(label_69);

		panel_163 = new JPanel();
		panel_163.setLayout(null);
		panel_163.setBackground(Color.WHITE);
		panel_163.setBounds(10, 928, 80, 20);
		panel_20.add(panel_163);

		label_70 = new JLabel();
		label_70.setText("444.21");
		label_70.setBounds(10, 0, 54, 14);
		panel_163.add(label_70);

		panel_164 = new JPanel();
		panel_164.setLayout(null);
		panel_164.setBackground(Color.WHITE);
		panel_164.setBounds(10, 965, 80, 20);
		panel_20.add(panel_164);

		label_71 = new JLabel();
		label_71.setText("444.22");
		label_71.setBounds(10, 0, 54, 14);
		panel_164.add(label_71);

		panel_165 = new JPanel();
		panel_165.setLayout(null);
		panel_165.setBackground(Color.WHITE);
		panel_165.setBounds(10, 1000, 80, 20);
		panel_20.add(panel_165);

		label_72 = new JLabel();
		label_72.setText("707.9");
		label_72.setBounds(10, 0, 54, 14);
		panel_165.add(label_72);

		panel_166 = new JPanel();
		panel_166.setLayout(null);
		panel_166.setBackground(Color.WHITE);
		panel_166.setBounds(10, 1026, 80, 20);
		panel_20.add(panel_166);

		label_73 = new JLabel();
		label_73.setText("785.4");
		label_73.setBounds(10, 0, 54, 14);
		panel_166.add(label_73);

		panel_47 = new JPanel();
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(1, 335, 258, 225);
		panel_1.add(panel_47);

		panel_48 = new JPanel();
		panel_48.setLayout(null);
		panel_48.setBackground(Color.WHITE);
		panel_48.setBounds(1, 0, 251, 32);
		panel_47.add(panel_48);

		ultrasoundsLabel_3 = new JLabel();
		ultrasoundsLabel_3.setForeground(Color.BLACK);
		ultrasoundsLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		ultrasoundsLabel_3.setText("CAROTID DUPLEX");
		ultrasoundsLabel_3.setBounds(10, 0, 124, 25);
		panel_48.add(ultrasoundsLabel_3);

		panel_49 = new JPanel();
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(1, 33, 251, 25);
		panel_47.add(panel_49);

		cbCarotidParalysis = new JCheckBox();
		cbCarotidParalysis.setBackground(Color.WHITE);
		cbCarotidParalysis.setText("New JCheckBox");
		cbCarotidParalysis.setBounds(7, 3, 14, 18);
		panel_49.add(cbCarotidParalysis);

		malignantNeoplasmOfLabel_17 = new JLabel();
		malignantNeoplasmOfLabel_17.setText("Paralysis,  Unspecified");
		malignantNeoplasmOfLabel_17.setBounds(39, 6, 189, 14);
		panel_49.add(malignantNeoplasmOfLabel_17);

		panel_50 = new JPanel();
		panel_50.setLayout(null);
		panel_50.setBackground(Color.WHITE);
		panel_50.setBounds(1, 65, 251, 25);
		panel_47.add(panel_50);

		cbCarotidEpilepsy = new JCheckBox();
		cbCarotidEpilepsy.setBackground(Color.WHITE);
		cbCarotidEpilepsy.setText("New JCheckBox");
		cbCarotidEpilepsy.setBounds(7, 3, 14, 18);
		panel_50.add(cbCarotidEpilepsy);

		malignantNeoplasmOfLabel_18 = new JLabel();
		malignantNeoplasmOfLabel_18.setText("Epilepsy, Unspecified");
		malignantNeoplasmOfLabel_18.setBounds(39, 5, 189, 14);
		panel_50.add(malignantNeoplasmOfLabel_18);

		panel_51 = new JPanel();
		panel_51.setLayout(null);
		panel_51.setBackground(Color.WHITE);
		panel_51.setBounds(1, 90, 251, 25);
		panel_47.add(panel_51);

		cbCarotidMigraine = new JCheckBox();
		cbCarotidMigraine.setBackground(Color.WHITE);
		cbCarotidMigraine.setText("New JCheckBox");
		cbCarotidMigraine.setBounds(7, 3, 14, 18);
		panel_51.add(cbCarotidMigraine);

		malignantNeoplasmOfLabel_19 = new JLabel();
		malignantNeoplasmOfLabel_19.setText("Migraine");
		malignantNeoplasmOfLabel_19.setBounds(39, 5, 189, 14);
		panel_51.add(malignantNeoplasmOfLabel_19);

		panel_52 = new JPanel();
		panel_52.setLayout(null);
		panel_52.setBackground(Color.WHITE);
		panel_52.setBounds(1, 114, 251, 25);
		panel_47.add(panel_52);

		cbCarotidUnspecified = new JCheckBox();
		cbCarotidUnspecified.setBackground(Color.WHITE);
		cbCarotidUnspecified.setText("New JCheckBox");
		cbCarotidUnspecified.setBounds(7, 3, 14, 18);
		panel_52.add(cbCarotidUnspecified);

		malignantNeoplasmOfLabel_20 = new JLabel();
		malignantNeoplasmOfLabel_20.setText("Unspecified Condition of Brain");
		malignantNeoplasmOfLabel_20.setBounds(39, 5, 189, 14);
		panel_52.add(malignantNeoplasmOfLabel_20);

		panel_53 = new JPanel();
		panel_53.setLayout(null);
		panel_53.setBackground(Color.WHITE);
		panel_53.setBounds(1, 136, 251, 25);
		panel_47.add(panel_53);

		cbCarotidVisual = new JCheckBox();
		cbCarotidVisual.setBackground(Color.WHITE);
		cbCarotidVisual.setText("New JCheckBox");
		cbCarotidVisual.setBounds(7, 3, 14, 18);
		panel_53.add(cbCarotidVisual);

		malignantNeoplasmOfLabel_21 = new JLabel();
		malignantNeoplasmOfLabel_21.setText("Visual Field Defect, Unspecified");
		malignantNeoplasmOfLabel_21.setBounds(39, 5, 189, 14);
		panel_53.add(malignantNeoplasmOfLabel_21);

		panel_54 = new JPanel();
		panel_54.setLayout(null);
		panel_54.setBackground(Color.WHITE);
		panel_54.setBounds(1, 160, 251, 32);
		panel_47.add(panel_54);

		cbCarotidOcclusionWithCI = new JCheckBox();
		cbCarotidOcclusionWithCI.setBackground(Color.WHITE);
		cbCarotidOcclusionWithCI.setText("New JCheckBox");
		cbCarotidOcclusionWithCI.setBounds(7, 3, 14, 18);
		panel_54.add(cbCarotidOcclusionWithCI);

		malignantNeoplasmotherSitesTextArea_4 = new JTextArea();
		malignantNeoplasmotherSitesTextArea_4.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea_4
				.setText("Occlusion & Stenosis of Precerebral Arteries with Cerebral Infarction");
		malignantNeoplasmotherSitesTextArea_4.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea_4.setBounds(39, 0, 205, 32);
		panel_54.add(malignantNeoplasmotherSitesTextArea_4);

		panel_55 = new JPanel();
		panel_55.setLayout(null);
		panel_55.setBackground(Color.WHITE);
		panel_55.setBounds(1, 190, 251, 32);
		panel_47.add(panel_55);

		cbCarotidOcclusionWithoutCI = new JCheckBox();
		cbCarotidOcclusionWithoutCI.setBackground(Color.WHITE);
		cbCarotidOcclusionWithoutCI.setText("New JCheckBox");
		cbCarotidOcclusionWithoutCI.setBounds(7, 3, 14, 18);
		panel_55.add(cbCarotidOcclusionWithoutCI);

		malignantNeoplasmotherSitesTextArea_5 = new JTextArea();
		malignantNeoplasmotherSitesTextArea_5.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea_5
				.setText("Occlusion & Stenosis of Precerebral Arteries without infarction");
		malignantNeoplasmotherSitesTextArea_5.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea_5.setBounds(39, 0, 205, 32);
		panel_55.add(malignantNeoplasmotherSitesTextArea_5);

		panel_56 = new JPanel();
		panel_56.setLayout(null);
		panel_56.setBackground(Color.WHITE);
		panel_56.setBounds(1, 560, 258, 528);
		panel_1.add(panel_56);

		panel_57 = new JPanel();
		panel_57.setLayout(null);
		panel_57.setBackground(Color.WHITE);
		panel_57.setBounds(1, 0, 251, 32);
		panel_56.add(panel_57);

		ultrasoundsLabel_4 = new JLabel();
		ultrasoundsLabel_4.setForeground(Color.BLACK);
		ultrasoundsLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
		ultrasoundsLabel_4.setText("ECHOCARDIOGRAM");
		ultrasoundsLabel_4.setBounds(10, 0, 151, 25);
		panel_57.add(ultrasoundsLabel_4);

		panel_58 = new JPanel();
		panel_58.setLayout(null);
		panel_58.setBackground(Color.WHITE);
		panel_58.setBounds(1, 33, 251, 25);
		panel_56.add(panel_58);

		cbEchocardiogramMitralStenosis = new JCheckBox();
		cbEchocardiogramMitralStenosis.setBackground(Color.WHITE);
		cbEchocardiogramMitralStenosis.setText("New JCheckBox");
		cbEchocardiogramMitralStenosis.setBounds(7, 3, 14, 18);
		panel_58.add(cbEchocardiogramMitralStenosis);

		malignantNeoplasmOfLabel_22 = new JLabel();
		malignantNeoplasmOfLabel_22.setText("Mitral Stenosis");
		malignantNeoplasmOfLabel_22.setBounds(39, 6, 189, 14);
		panel_58.add(malignantNeoplasmOfLabel_22);

		panel_59 = new JPanel();
		panel_59.setLayout(null);
		panel_59.setBackground(Color.WHITE);
		panel_59.setBounds(1, 65, 251, 25);
		panel_56.add(panel_59);

		cbEchocardiogramUnspecifiedMV = new JCheckBox();
		cbEchocardiogramUnspecifiedMV.setBackground(Color.WHITE);
		cbEchocardiogramUnspecifiedMV.setText("New JCheckBox");
		cbEchocardiogramUnspecifiedMV.setBounds(7, 3, 14, 18);
		panel_59.add(cbEchocardiogramUnspecifiedMV);

		malignantNeoplasmOfLabel_23 = new JLabel();
		malignantNeoplasmOfLabel_23.setText("Unspecified Mitral Valve Disease");
		malignantNeoplasmOfLabel_23.setBounds(39, 5, 189, 14);
		panel_59.add(malignantNeoplasmOfLabel_23);

		panel_60 = new JPanel();
		panel_60.setLayout(null);
		panel_60.setBackground(Color.WHITE);
		panel_60.setBounds(1, 90, 251, 25);
		panel_56.add(panel_60);

		cbEchocardiogramMitralAortic = new JCheckBox();
		cbEchocardiogramMitralAortic.setBackground(Color.WHITE);
		cbEchocardiogramMitralAortic.setText("New JCheckBox");
		cbEchocardiogramMitralAortic.setBounds(7, 3, 14, 18);
		panel_60.add(cbEchocardiogramMitralAortic);

		malignantNeoplasmOfLabel_24 = new JLabel();
		malignantNeoplasmOfLabel_24
				.setText("Mitral & Aortic Valve Disease,Unspecified");
		malignantNeoplasmOfLabel_24.setBounds(39, 5, 212, 14);
		panel_60.add(malignantNeoplasmOfLabel_24);

		panel_61 = new JPanel();
		panel_61.setLayout(null);
		panel_61.setBackground(Color.WHITE);
		panel_61.setBounds(1, 114, 251, 25);
		panel_56.add(panel_61);

		malignantNeoplasmOfLabel_25 = new JLabel();
		malignantNeoplasmOfLabel_25
				.setText("Hypertensive Heart Disease, Unspecified");
		malignantNeoplasmOfLabel_25.setBounds(39, 5, 202, 14);
		panel_61.add(malignantNeoplasmOfLabel_25);

		cbEchocardiogramHypertensive = new JCheckBox();
		cbEchocardiogramHypertensive.setBackground(Color.WHITE);
		cbEchocardiogramHypertensive.setText("New JCheckBox");
		cbEchocardiogramHypertensive.setBounds(7, 1, 14, 18);
		panel_61.add(cbEchocardiogramHypertensive);

		panel_63 = new JPanel();
		panel_63.setLayout(null);
		panel_63.setBackground(Color.WHITE);
		panel_63.setBounds(1, 158, 251, 25);
		panel_56.add(panel_63);

		malignantNeoplasmOfLabel_27 = new JLabel();
		malignantNeoplasmOfLabel_27
				.setText("Rheumatic Heart Disease, Unspecified");
		malignantNeoplasmOfLabel_27.setBounds(39, 5, 189, 14);
		panel_63.add(malignantNeoplasmOfLabel_27);

		cbEchocardiogramRheumatic = new JCheckBox();
		cbEchocardiogramRheumatic.setBackground(Color.WHITE);
		cbEchocardiogramRheumatic.setText("New JCheckBox");
		cbEchocardiogramRheumatic.setBounds(7, 4, 13, 18);
		panel_63.add(cbEchocardiogramRheumatic);

		panel_64 = new JPanel();
		panel_64.setLayout(null);
		panel_64.setBackground(Color.WHITE);
		panel_64.setBounds(1, 181, 251, 25);
		panel_56.add(panel_64);

		malignantNeoplasmOfLabel_28 = new JLabel();
		malignantNeoplasmOfLabel_28
				.setText("Acute Myocardial Infarction, unspecified");
		malignantNeoplasmOfLabel_28.setBounds(39, 5, 199, 14);
		panel_64.add(malignantNeoplasmOfLabel_28);

		cbEchocardiogramAcuteMyocardial = new JCheckBox();
		cbEchocardiogramAcuteMyocardial.setBackground(Color.WHITE);
		cbEchocardiogramAcuteMyocardial.setText("New JCheckBox");
		cbEchocardiogramAcuteMyocardial.setBounds(7, 4, 13, 18);
		panel_64.add(cbEchocardiogramAcuteMyocardial);

		panel_65 = new JPanel();
		panel_65.setLayout(null);
		panel_65.setBackground(Color.WHITE);
		panel_65.setBounds(1, 203, 258, 25);
		panel_56.add(panel_65);

		malignantNeoplasmOfLabel_29 = new JLabel();
		malignantNeoplasmOfLabel_29
				.setText("Coronary Occlusion w/o Myocardial Infarction");
		malignantNeoplasmOfLabel_29.setBounds(39, 5, 218, 14);
		panel_65.add(malignantNeoplasmOfLabel_29);

		cbEchocardiogramCoronary = new JCheckBox();
		cbEchocardiogramCoronary.setBackground(Color.WHITE);
		cbEchocardiogramCoronary.setText("New JCheckBox");
		cbEchocardiogramCoronary.setBounds(7, 4, 13, 18);
		panel_65.add(cbEchocardiogramCoronary);

		panel_66 = new JPanel();
		panel_66.setLayout(null);
		panel_66.setBackground(Color.WHITE);
		panel_66.setBounds(1, 225, 248, 25);
		panel_56.add(panel_66);

		malignantNeoplasmOfLabel_30 = new JLabel();
		malignantNeoplasmOfLabel_30.setText("Acute Paricarditis, Unspecified");
		malignantNeoplasmOfLabel_30.setBounds(39, 5, 218, 14);
		panel_66.add(malignantNeoplasmOfLabel_30);

		cbEchocardiogramAcutePari = new JCheckBox();
		cbEchocardiogramAcutePari.setBackground(Color.WHITE);
		cbEchocardiogramAcutePari.setText("New JCheckBox");
		cbEchocardiogramAcutePari.setBounds(7, 4, 13, 18);
		panel_66.add(cbEchocardiogramAcutePari);

		panel_67 = new JPanel();
		panel_67.setLayout(null);
		panel_67.setBackground(Color.WHITE);
		panel_67.setBounds(1, 249, 248, 25);
		panel_56.add(panel_67);

		malignantNeoplasmOfLabel_31 = new JLabel();
		malignantNeoplasmOfLabel_31.setText("Pulmonary Embolism & Infarction ");
		malignantNeoplasmOfLabel_31.setBounds(39, 5, 218, 14);
		panel_67.add(malignantNeoplasmOfLabel_31);

		cbEchocardiogramPulmonary = new JCheckBox();
		cbEchocardiogramPulmonary.setBackground(Color.WHITE);
		cbEchocardiogramPulmonary.setText("New JCheckBox");
		cbEchocardiogramPulmonary.setBounds(7, 4, 13, 18);
		panel_67.add(cbEchocardiogramPulmonary);

		panel_68 = new JPanel();
		panel_68.setLayout(null);
		panel_68.setBackground(Color.WHITE);
		panel_68.setBounds(1, 273, 258, 25);
		panel_56.add(panel_68);

		malignantNeoplasmOfLabel_32 = new JLabel();
		malignantNeoplasmOfLabel_32
				.setText("Unspecified Disease of Pulmonary Circulation");
		malignantNeoplasmOfLabel_32.setBounds(39, 5, 218, 14);
		panel_68.add(malignantNeoplasmOfLabel_32);

		cbEchocardiogramUnspecifiedDis = new JCheckBox();
		cbEchocardiogramUnspecifiedDis.setBackground(Color.WHITE);
		cbEchocardiogramUnspecifiedDis.setText("New JCheckBox");
		cbEchocardiogramUnspecifiedDis.setBounds(7, 4, 13, 18);
		panel_68.add(cbEchocardiogramUnspecifiedDis);

		panel_69 = new JPanel();
		panel_69.setLayout(null);
		panel_69.setBackground(Color.WHITE);
		panel_69.setBounds(1, 295, 248, 25);
		panel_56.add(panel_69);

		malignantNeoplasmOfLabel_33 = new JLabel();
		malignantNeoplasmOfLabel_33.setText("Aneurysm of Heart ");
		malignantNeoplasmOfLabel_33.setBounds(39, 5, 218, 14);
		panel_69.add(malignantNeoplasmOfLabel_33);

		cbEchocardiogramAneurysm = new JCheckBox();
		cbEchocardiogramAneurysm.setBackground(Color.WHITE);
		cbEchocardiogramAneurysm.setText("New JCheckBox");
		cbEchocardiogramAneurysm.setBounds(7, 4, 13, 18);
		panel_69.add(cbEchocardiogramAneurysm);

		panel_70 = new JPanel();
		panel_70.setLayout(null);
		panel_70.setBackground(Color.WHITE);
		panel_70.setBounds(1, 320, 248, 25);
		panel_56.add(panel_70);

		malignantNeoplasmOfLabel_34 = new JLabel();
		malignantNeoplasmOfLabel_34.setText("Other Heart Block");
		malignantNeoplasmOfLabel_34.setBounds(39, 5, 218, 14);
		panel_70.add(malignantNeoplasmOfLabel_34);

		cbEchocardiogramOtherHeart = new JCheckBox();
		cbEchocardiogramOtherHeart.setBackground(Color.WHITE);
		cbEchocardiogramOtherHeart.setText("New JCheckBox");
		cbEchocardiogramOtherHeart.setBounds(7, 4, 13, 18);
		panel_70.add(cbEchocardiogramOtherHeart);

		panel_71 = new JPanel();
		panel_71.setLayout(null);
		panel_71.setBackground(Color.WHITE);
		panel_71.setBounds(1, 345, 248, 25);
		panel_56.add(panel_71);

		cbEchocardiogramAtrialFib = new JCheckBox();
		cbEchocardiogramAtrialFib.setBackground(Color.WHITE);
		cbEchocardiogramAtrialFib.setText("New JCheckBox");
		cbEchocardiogramAtrialFib.setBounds(7, 3, 14, 18);
		panel_71.add(cbEchocardiogramAtrialFib);

		malignantNeoplasmOfLabel_35 = new JLabel();
		malignantNeoplasmOfLabel_35.setText("Atrial Fibrillation and Flutter");
		malignantNeoplasmOfLabel_35.setBounds(39, 5, 218, 14);
		panel_71.add(malignantNeoplasmOfLabel_35);

		panel_72 = new JPanel();
		panel_72.setLayout(null);
		panel_72.setBackground(Color.WHITE);
		panel_72.setBounds(1, 369, 248, 25);
		panel_56.add(panel_72);

		malignantNeoplasmOfLabel_36 = new JLabel();
		malignantNeoplasmOfLabel_36.setText("Premature Beats");
		malignantNeoplasmOfLabel_36.setBounds(39, 5, 218, 14);
		panel_72.add(malignantNeoplasmOfLabel_36);

		cbEchocardiogramPrematureBeats = new JCheckBox();
		cbEchocardiogramPrematureBeats.setBackground(Color.WHITE);
		cbEchocardiogramPrematureBeats.setText("New JCheckBox");
		cbEchocardiogramPrematureBeats.setBounds(7, 4, 13, 18);
		panel_72.add(cbEchocardiogramPrematureBeats);

		panel_73 = new JPanel();
		panel_73.setLayout(null);
		panel_73.setBackground(Color.WHITE);
		panel_73.setBounds(1, 393, 248, 25);
		panel_56.add(panel_73);

		malignantNeoplasmOfLabel_37 = new JLabel();
		malignantNeoplasmOfLabel_37.setText("Cardiac Arrest");
		malignantNeoplasmOfLabel_37.setBounds(39, 5, 218, 14);
		panel_73.add(malignantNeoplasmOfLabel_37);

		cbEchocardiogramCardiacArrest = new JCheckBox();
		cbEchocardiogramCardiacArrest.setBackground(Color.WHITE);
		cbEchocardiogramCardiacArrest.setText("New JCheckBox");
		cbEchocardiogramCardiacArrest.setBounds(7, 4, 13, 18);
		panel_73.add(cbEchocardiogramCardiacArrest);

		panel_74 = new JPanel();
		panel_74.setLayout(null);
		panel_74.setBackground(Color.WHITE);
		panel_74.setBounds(1, 417, 248, 25);
		panel_56.add(panel_74);

		malignantNeoplasmOfLabel_38 = new JLabel();
		malignantNeoplasmOfLabel_38.setText("Heart failure, Unspecified");
		malignantNeoplasmOfLabel_38.setBounds(39, 5, 218, 14);
		panel_74.add(malignantNeoplasmOfLabel_38);

		cbEchocardiogramHeartFailure = new JCheckBox();
		cbEchocardiogramHeartFailure.setBackground(Color.WHITE);
		cbEchocardiogramHeartFailure.setText("New JCheckBox");
		cbEchocardiogramHeartFailure.setBounds(7, 4, 13, 18);
		panel_74.add(cbEchocardiogramHeartFailure);

		panel_75 = new JPanel();
		panel_75.setLayout(null);
		panel_75.setBackground(Color.WHITE);
		panel_75.setBounds(1, 441, 248, 25);
		panel_56.add(panel_75);

		malignantNeoplasmOfLabel_39 = new JLabel();
		malignantNeoplasmOfLabel_39
				.setText("Cardiovascular Disease, Unspecified");
		malignantNeoplasmOfLabel_39.setBounds(39, 5, 218, 14);
		panel_75.add(malignantNeoplasmOfLabel_39);

		cbEchocardiogramCardiovascular = new JCheckBox();
		cbEchocardiogramCardiovascular.setBackground(Color.WHITE);
		cbEchocardiogramCardiovascular.setText("New JCheckBox");
		cbEchocardiogramCardiovascular.setBounds(7, 4, 13, 18);
		panel_75.add(cbEchocardiogramCardiovascular);

		panel_76 = new JPanel();
		panel_76.setLayout(null);
		panel_76.setBackground(Color.WHITE);
		panel_76.setBounds(1, 465, 248, 27);
		panel_56.add(panel_76);

		malignantNeoplasmOfLabel_40 = new JLabel();
		malignantNeoplasmOfLabel_40.setText("Myocardities, Unspecified");
		malignantNeoplasmOfLabel_40.setBounds(39, 5, 218, 14);
		panel_76.add(malignantNeoplasmOfLabel_40);

		cbEchocardiogramMyocardities = new JCheckBox();
		cbEchocardiogramMyocardities.setBackground(Color.WHITE);
		cbEchocardiogramMyocardities.setText("New JCheckBox");
		cbEchocardiogramMyocardities.setBounds(7, 4, 13, 18);
		panel_76.add(cbEchocardiogramMyocardities);

		panel_77 = new JPanel();
		panel_77.setLayout(null);
		panel_77.setBackground(Color.WHITE);
		panel_77.setBounds(1, 491, 248, 27);
		panel_56.add(panel_77);

		malignantNeoplasmOfLabel_41 = new JLabel();
		malignantNeoplasmOfLabel_41.setText("Cardiomegaly");
		malignantNeoplasmOfLabel_41.setBounds(39, 5, 218, 14);
		panel_77.add(malignantNeoplasmOfLabel_41);

		cbEchocardiogramCardiomegaly = new JCheckBox();
		cbEchocardiogramCardiomegaly.setBackground(Color.WHITE);
		cbEchocardiogramCardiomegaly.setText("New JCheckBox");
		cbEchocardiogramCardiomegaly.setBounds(7, 4, 13, 18);
		panel_77.add(cbEchocardiogramCardiomegaly);

		panel_62 = new JPanel();
		panel_62.setLayout(null);
		panel_62.setBackground(Color.WHITE);
		panel_62.setBounds(1, 138, 251, 25);
		panel_56.add(panel_62);

		cbEchocardiogramEssential = new JCheckBox();
		cbEchocardiogramEssential.setBackground(Color.WHITE);
		cbEchocardiogramEssential.setText("New JCheckBox");
		cbEchocardiogramEssential.setBounds(7, 3, 13, 18);
		panel_62.add(cbEchocardiogramEssential);

		malignantNeoplasmOfLabel_26 = new JLabel();
		malignantNeoplasmOfLabel_26
				.setText("Essential Hypertention Unspecified");
		malignantNeoplasmOfLabel_26.setBounds(39, 5, 202, 14);
		panel_62.add(malignantNeoplasmOfLabel_26);

		panel_114 = new JPanel();
		panel_114.setLayout(null);
		panel_114.setBackground(Color.WHITE);
		panel_114.setBounds(360, 307, 290, 117);
		panel_1.add(panel_114);

		panel_115 = new JPanel();
		panel_115.setLayout(null);
		panel_115.setBackground(Color.WHITE);
		panel_115.setBounds(1, 0, 251, 20);
		panel_114.add(panel_115);

		ultrasoundsLabel_5 = new JLabel();
		ultrasoundsLabel_5.setForeground(Color.BLACK);
		ultrasoundsLabel_5.setFont(new Font("Dialog", Font.BOLD, 14));
		ultrasoundsLabel_5.setText("BREAST OR CHEST");
		ultrasoundsLabel_5.setBounds(10, 0, 169, 25);
		panel_115.add(ultrasoundsLabel_5);

		panel_116 = new JPanel();
		panel_116.setLayout(null);
		panel_116.setBackground(Color.WHITE);
		panel_116.setBounds(1, 23, 251, 25);
		panel_114.add(panel_116);

		cbBreastPleuralEffusion = new JCheckBox();
		cbBreastPleuralEffusion.setBackground(Color.WHITE);
		cbBreastPleuralEffusion.setText("New JCheckBox");
		cbBreastPleuralEffusion.setBounds(7, 3, 14, 18);
		panel_116.add(cbBreastPleuralEffusion);

		malignantNeoplasmOfLabel_42 = new JLabel();
		malignantNeoplasmOfLabel_42.setText("Pleural Effusion, Unspecified");
		malignantNeoplasmOfLabel_42.setBounds(39, 6, 189, 14);
		panel_116.add(malignantNeoplasmOfLabel_42);

		panel_117 = new JPanel();
		panel_117.setLayout(null);
		panel_117.setBackground(Color.WHITE);
		panel_117.setBounds(1, 48, 251, 25);
		panel_114.add(panel_117);

		malignantNeoplasmOfLabel_43 = new JLabel();
		malignantNeoplasmOfLabel_43.setText("Solitary Cyst of Breast");
		malignantNeoplasmOfLabel_43.setBounds(39, 5, 189, 14);
		panel_117.add(malignantNeoplasmOfLabel_43);

		cbBreastSolitary = new JCheckBox();
		cbBreastSolitary.setBackground(Color.WHITE);
		cbBreastSolitary.setText("New JCheckBox");
		cbBreastSolitary.setBounds(7, 3, 14, 18);
		panel_117.add(cbBreastSolitary);

		panel_118 = new JPanel();
		panel_118.setLayout(null);
		panel_118.setBackground(Color.WHITE);
		panel_118.setBounds(1, 70, 251, 25);
		panel_114.add(panel_118);

		malignantNeoplasmOfLabel_44 = new JLabel();
		malignantNeoplasmOfLabel_44.setText("Palpable Lump or Mass");
		malignantNeoplasmOfLabel_44.setBounds(39, 5, 189, 14);
		panel_118.add(malignantNeoplasmOfLabel_44);

		panel_119 = new JPanel();
		panel_119.setBounds(0, 27, 251, 25);
		panel_118.add(panel_119);
		panel_119.setLayout(null);
		panel_119.setBackground(Color.WHITE);

		cbBreastPleuralEffusion = new JCheckBox();
		cbBreastPleuralEffusion.setBackground(Color.WHITE);
		cbBreastPleuralEffusion.setText("New JCheckBox");
		cbBreastPleuralEffusion.setBounds(7, 3, 14, 18);
		panel_119.add(cbBreastPleuralEffusion);

		malignantNeoplasmOfLabel_45 = new JLabel();
		malignantNeoplasmOfLabel_45.setText("Mastodynia(Plain)");
		malignantNeoplasmOfLabel_45.setBounds(39, 5, 189, 14);
		panel_119.add(malignantNeoplasmOfLabel_45);

		cbBreastPalpable = new JCheckBox();
		cbBreastPalpable.setBackground(Color.WHITE);
		cbBreastPalpable.setText("New JCheckBox");
		cbBreastPalpable.setBounds(7, 4, 14, 18);
		panel_118.add(cbBreastPalpable);

		panel_167 = new JPanel();
		panel_167.setLayout(null);
		panel_167.setBackground(Color.WHITE);
		panel_167.setBounds(1, 92, 251, 25);
		panel_114.add(panel_167);

		malignantNeoplasmOfLabel_61 = new JLabel();
		malignantNeoplasmOfLabel_61.setText("Mastodynia( (Pain)");
		malignantNeoplasmOfLabel_61.setBounds(39, 5, 189, 14);
		panel_167.add(malignantNeoplasmOfLabel_61);

		panel_168 = new JPanel();
		panel_168.setLayout(null);
		panel_168.setBackground(Color.WHITE);
		panel_168.setBounds(0, 27, 251, 25);
		panel_167.add(panel_168);

		cbBreastPleuralEffusion_1 = new JCheckBox();
		cbBreastPleuralEffusion_1.setBackground(Color.WHITE);
		cbBreastPleuralEffusion_1.setText("New JCheckBox");
		cbBreastPleuralEffusion_1.setBounds(7, 3, 14, 18);
		panel_168.add(cbBreastPleuralEffusion_1);

		malignantNeoplasmOfLabel_62 = new JLabel();
		malignantNeoplasmOfLabel_62.setText("Mastodynia(Plain)");
		malignantNeoplasmOfLabel_62.setBounds(39, 5, 189, 14);
		panel_168.add(malignantNeoplasmOfLabel_62);

		cbBreastMastodynia = new JCheckBox();
		cbBreastMastodynia.setBackground(Color.WHITE);
		cbBreastMastodynia.setText("New JCheckBox");
		cbBreastMastodynia.setBounds(7, 4, 14, 18);
		panel_167.add(cbBreastMastodynia);

		panel_120 = new JPanel();
		panel_120.setLayout(null);
		panel_120.setBackground(Color.WHITE);
		panel_120.setBounds(360, 423, 290, 291);
		panel_1.add(panel_120);

		panel_121 = new JPanel();
		panel_121.setLayout(null);
		panel_121.setBackground(Color.WHITE);
		panel_121.setBounds(1, 3, 251, 20);
		panel_120.add(panel_121);

		ultrasoundsLabel_6 = new JLabel();
		ultrasoundsLabel_6.setForeground(Color.BLACK);
		ultrasoundsLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));
		ultrasoundsLabel_6.setText("VENOUS");
		ultrasoundsLabel_6.setBounds(10, 0, 169, 25);
		panel_121.add(ultrasoundsLabel_6);

		panel_122 = new JPanel();
		panel_122.setLayout(null);
		panel_122.setBackground(Color.WHITE);
		panel_122.setBounds(1, 23, 251, 25);
		panel_120.add(panel_122);

		cbVenousVaricoseveinsUlcer = new JCheckBox();
		cbVenousVaricoseveinsUlcer.setBackground(Color.WHITE);
		cbVenousVaricoseveinsUlcer.setText("New JCheckBox");
		cbVenousVaricoseveinsUlcer.setBounds(7, 3, 14, 18);
		panel_122.add(cbVenousVaricoseveinsUlcer);

		malignantNeoplasmOfLabel_46 = new JLabel();
		malignantNeoplasmOfLabel_46.setText("Varicose veins w/ Ulcer");
		malignantNeoplasmOfLabel_46.setBounds(39, 6, 189, 14);
		panel_122.add(malignantNeoplasmOfLabel_46);

		panel_123 = new JPanel();
		panel_123.setLayout(null);
		panel_123.setBackground(Color.WHITE);
		panel_123.setBounds(1, 48, 251, 25);
		panel_120.add(panel_123);

		malignantNeoplasmOfLabel_47 = new JLabel();
		malignantNeoplasmOfLabel_47.setText("Varicose Veins w/ Inflammation");
		malignantNeoplasmOfLabel_47.setBounds(39, 5, 189, 14);
		panel_123.add(malignantNeoplasmOfLabel_47);

		cbVenousVaricoseInflam = new JCheckBox();
		cbVenousVaricoseInflam.setBackground(Color.WHITE);
		cbVenousVaricoseInflam.setText("New JCheckBox");
		cbVenousVaricoseInflam.setBounds(7, 3, 14, 18);
		panel_123.add(cbVenousVaricoseInflam);

		panel_124 = new JPanel();
		panel_124.setLayout(null);
		panel_124.setBackground(Color.WHITE);
		panel_124.setBounds(1, 70, 251, 25);
		panel_120.add(panel_124);

		malignantNeoplasmOfLabel_48 = new JLabel();
		malignantNeoplasmOfLabel_48
				.setText("varicose Veins w/ Ulcer & Inflammation");
		malignantNeoplasmOfLabel_48.setBounds(39, 5, 189, 14);
		panel_124.add(malignantNeoplasmOfLabel_48);

		cbVenousVaricoseUlcerInflam = new JCheckBox();
		cbVenousVaricoseUlcerInflam.setBackground(Color.WHITE);
		cbVenousVaricoseUlcerInflam.setText("New JCheckBox");
		cbVenousVaricoseUlcerInflam.setBounds(7, 3, 14, 18);
		panel_124.add(cbVenousVaricoseUlcerInflam);

		panel_125 = new JPanel();
		panel_125.setLayout(null);
		panel_125.setBackground(Color.WHITE);
		panel_125.setBounds(1, 90, 251, 25);
		panel_120.add(panel_125);

		malignantNeoplasmOfLabel_49 = new JLabel();
		malignantNeoplasmOfLabel_49
				.setText("varicose Veins w/ Ulcer or Inflammation");
		malignantNeoplasmOfLabel_49.setBounds(39, 5, 189, 14);
		panel_125.add(malignantNeoplasmOfLabel_49);

		cbVenousVaricoseUlcerOrInflam = new JCheckBox();
		cbVenousVaricoseUlcerOrInflam.setBackground(Color.WHITE);
		cbVenousVaricoseUlcerOrInflam.setText("New JCheckBox");
		cbVenousVaricoseUlcerOrInflam.setBounds(7, 3, 14, 18);
		panel_125.add(cbVenousVaricoseUlcerOrInflam);

		panel_126 = new JPanel();
		panel_126.setLayout(null);
		panel_126.setBackground(Color.WHITE);
		panel_126.setBounds(1, 113, 251, 25);
		panel_120.add(panel_126);

		malignantNeoplasmOfLabel_50 = new JLabel();
		malignantNeoplasmOfLabel_50.setText("Pulmonary Embolism & Infarction");
		malignantNeoplasmOfLabel_50.setBounds(39, 5, 189, 14);
		panel_126.add(malignantNeoplasmOfLabel_50);

		cbVenousPulmonaryEmbolism = new JCheckBox();
		cbVenousPulmonaryEmbolism.setBackground(Color.WHITE);
		cbVenousPulmonaryEmbolism.setText("New JCheckBox");
		cbVenousPulmonaryEmbolism.setBounds(7, 3, 14, 18);
		panel_126.add(cbVenousPulmonaryEmbolism);

		panel_127 = new JPanel();
		panel_127.setLayout(null);
		panel_127.setBackground(Color.WHITE);
		panel_127.setBounds(1, 135, 251, 32);
		panel_120.add(panel_127);

		malignantNeoplasmotherSitesTextArea_6 = new JTextArea();
		malignantNeoplasmotherSitesTextArea_6.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea_6
				.setText("Phlebitis & Thrombophlebitis of Lower Extremities, Unspecified");
		malignantNeoplasmotherSitesTextArea_6.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea_6.setBounds(39, 0, 205, 32);
		panel_127.add(malignantNeoplasmotherSitesTextArea_6);

		cbVenousPhlebitisLower = new JCheckBox();
		cbVenousPhlebitisLower.setBackground(Color.WHITE);
		cbVenousPhlebitisLower.setText("New JCheckBox");
		cbVenousPhlebitisLower.setBounds(7, 3, 14, 18);
		panel_127.add(cbVenousPhlebitisLower);

		panel_128 = new JPanel();
		panel_128.setLayout(null);
		panel_128.setBackground(Color.WHITE);
		panel_128.setBounds(1, 167, 251, 32);
		panel_120.add(panel_128);

		malignantNeoplasmotherSitesTextArea_7 = new JTextArea();
		malignantNeoplasmotherSitesTextArea_7.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea_7
				.setText("Phlebitis & Thrombophlebitis of Upper Extremities, Unspecified");
		malignantNeoplasmotherSitesTextArea_7.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea_7.setBounds(39, 0, 205, 32);
		panel_128.add(malignantNeoplasmotherSitesTextArea_7);

		cbVenousPhlebitisUpper = new JCheckBox();
		cbVenousPhlebitisUpper.setBackground(Color.WHITE);
		cbVenousPhlebitisUpper.setText("New JCheckBox");
		cbVenousPhlebitisUpper.setBounds(7, 3, 14, 18);
		panel_128.add(cbVenousPhlebitisUpper);

		panel_129 = new JPanel();
		panel_129.setLayout(null);
		panel_129.setBackground(Color.WHITE);
		panel_129.setBounds(1, 199, 251, 25);
		panel_120.add(panel_129);

		malignantNeoplasmOfLabel_51 = new JLabel();
		malignantNeoplasmOfLabel_51.setText("Hemmorrhage, Unspecified");
		malignantNeoplasmOfLabel_51.setBounds(39, 5, 189, 14);
		panel_129.add(malignantNeoplasmOfLabel_51);

		cbVenousHemmorrhage = new JCheckBox();
		cbVenousHemmorrhage.setBackground(Color.WHITE);
		cbVenousHemmorrhage.setText("New JCheckBox");
		cbVenousHemmorrhage.setBounds(7, 4, 14, 18);
		panel_129.add(cbVenousHemmorrhage);

		panel_130 = new JPanel();
		panel_130.setLayout(null);
		panel_130.setBackground(Color.WHITE);
		panel_130.setBounds(1, 222, 251, 25);
		panel_120.add(panel_130);

		malignantNeoplasmOfLabel_52 = new JLabel();
		malignantNeoplasmOfLabel_52.setText("Compression of vein");
		malignantNeoplasmOfLabel_52.setBounds(39, 5, 189, 14);
		panel_130.add(malignantNeoplasmOfLabel_52);

		cbVenousCompression = new JCheckBox();
		cbVenousCompression.setBackground(Color.WHITE);
		cbVenousCompression.setText("New JCheckBox");
		cbVenousCompression.setBounds(7, 4, 14, 18);
		panel_130.add(cbVenousCompression);

		panel_131 = new JPanel();
		panel_131.setLayout(null);
		panel_131.setBackground(Color.WHITE);
		panel_131.setBounds(1, 246, 251, 32);
		panel_120.add(panel_131);

		malignantNeoplasmotherSitesTextArea_8 = new JTextArea();
		malignantNeoplasmotherSitesTextArea_8.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea_8
				.setText("Anomalies of Other Sites of Peripheral Vascular Systems ");
		malignantNeoplasmotherSitesTextArea_8.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea_8.setBounds(39, 0, 205, 32);
		panel_131.add(malignantNeoplasmotherSitesTextArea_8);

		cbVenousAnomalies = new JCheckBox();
		cbVenousAnomalies.setBackground(Color.WHITE);
		cbVenousAnomalies.setText("New JCheckBox");
		cbVenousAnomalies.setBounds(7, 3, 14, 18);
		panel_131.add(cbVenousAnomalies);

		panel_132 = new JPanel();
		panel_132.setLayout(null);
		panel_132.setBackground(Color.WHITE);
		panel_132.setBounds(360, 713, 290, 374);
		panel_1.add(panel_132);

		panel_134 = new JPanel();
		panel_134.setLayout(null);
		panel_134.setBackground(Color.WHITE);
		panel_134.setBounds(1, 57, 279, 25);
		panel_132.add(panel_134);

		cbArterialDiabetes = new JCheckBox();
		cbArterialDiabetes.setBackground(Color.WHITE);
		cbArterialDiabetes.setText("New JCheckBox");
		cbArterialDiabetes.setBounds(7, 3, 14, 18);
		panel_134.add(cbArterialDiabetes);

		malignantNeoplasmOfLabel_53 = new JLabel();
		malignantNeoplasmOfLabel_53
				.setText("Diabetes w/ Peripheral Circulatory Disorders");
		malignantNeoplasmOfLabel_53.setBounds(39, 6, 211, 14);
		panel_134.add(malignantNeoplasmOfLabel_53);

		panel_135 = new JPanel();
		panel_135.setLayout(null);
		panel_135.setBackground(Color.WHITE);
		panel_135.setBounds(1, 88, 279, 25);
		panel_132.add(panel_135);

		malignantNeoplasmOfLabel_54 = new JLabel();
		malignantNeoplasmOfLabel_54
				.setText("Atherosclerosis of Extremities w/ Claudication");
		malignantNeoplasmOfLabel_54.setBounds(39, 5, 230, 14);
		panel_135.add(malignantNeoplasmOfLabel_54);

		cbArterialAtherosClaudication = new JCheckBox();
		cbArterialAtherosClaudication.setBackground(Color.WHITE);
		cbArterialAtherosClaudication.setText("New JCheckBox");
		cbArterialAtherosClaudication.setBounds(7, 3, 14, 18);
		panel_135.add(cbArterialAtherosClaudication);

		panel_136 = new JPanel();
		panel_136.setLayout(null);
		panel_136.setBackground(Color.WHITE);
		panel_136.setBounds(1, 119, 279, 25);
		panel_132.add(panel_136);

		malignantNeoplasmOfLabel_55 = new JLabel();
		malignantNeoplasmOfLabel_55
				.setText("Atherosclerosis of Extremities w/ Rest pain");
		malignantNeoplasmOfLabel_55.setBounds(39, 5, 230, 14);
		panel_136.add(malignantNeoplasmOfLabel_55);

		cbArterialAtherosRestPain = new JCheckBox();
		cbArterialAtherosRestPain.setBackground(Color.WHITE);
		cbArterialAtherosRestPain.setText("New JCheckBox");
		cbArterialAtherosRestPain.setBounds(7, 4, 14, 18);
		panel_136.add(cbArterialAtherosRestPain);

		panel_137 = new JPanel();
		panel_137.setLayout(null);
		panel_137.setBackground(Color.WHITE);
		panel_137.setBounds(1, 150, 279, 25);
		panel_132.add(panel_137);

		malignantNeoplasmOfLabel_56 = new JLabel();
		malignantNeoplasmOfLabel_56
				.setText("Atherosclerosis of Extremities Ulceration");
		malignantNeoplasmOfLabel_56.setBounds(39, 5, 230, 14);
		panel_137.add(malignantNeoplasmOfLabel_56);

		cbArterialAtherosUlceration = new JCheckBox();
		cbArterialAtherosUlceration.setBackground(Color.WHITE);
		cbArterialAtherosUlceration.setText("New JCheckBox");
		cbArterialAtherosUlceration.setBounds(7, 4, 14, 18);
		panel_137.add(cbArterialAtherosUlceration);

		panel_138 = new JPanel();
		panel_138.setLayout(null);
		panel_138.setBackground(Color.WHITE);
		panel_138.setBounds(1, 181, 279, 25);
		panel_132.add(panel_138);

		malignantNeoplasmOfLabel_57 = new JLabel();
		malignantNeoplasmOfLabel_57
				.setText("Atherosclerosis of Extremities w/ Gangrene");
		malignantNeoplasmOfLabel_57.setBounds(39, 5, 214, 14);
		panel_138.add(malignantNeoplasmOfLabel_57);

		cbArterialAtherosGangrene = new JCheckBox();
		cbArterialAtherosGangrene.setBackground(Color.WHITE);
		cbArterialAtherosGangrene.setText("New JCheckBox");
		cbArterialAtherosGangrene.setBounds(7, 4, 14, 18);
		panel_138.add(cbArterialAtherosGangrene);

		panel_139 = new JPanel();
		panel_139.setLayout(null);
		panel_139.setBackground(Color.WHITE);
		panel_139.setBounds(1, 212, 279, 25);
		panel_132.add(panel_139);

		malignantNeoplasmOfLabel_58 = new JLabel();
		malignantNeoplasmOfLabel_58
				.setText("Peripheral Vascular Disease, Unspecified");
		malignantNeoplasmOfLabel_58.setBounds(39, 5, 230, 14);
		panel_139.add(malignantNeoplasmOfLabel_58);

		cbArterialPeripheralVascular = new JCheckBox();
		cbArterialPeripheralVascular.setBackground(Color.WHITE);
		cbArterialPeripheralVascular.setText("New JCheckBox");
		cbArterialPeripheralVascular.setBounds(7, 4, 14, 18);
		panel_139.add(cbArterialPeripheralVascular);

		panel_140 = new JPanel();
		panel_140.setLayout(null);
		panel_140.setBackground(Color.WHITE);
		panel_140.setBounds(1, 243, 277, 32);
		panel_132.add(panel_140);

		malignantNeoplasmotherSitesTextArea_9 = new JTextArea();
		malignantNeoplasmotherSitesTextArea_9.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea_9
				.setText("Arterial Embolism or Thrombosis of Upper Extremities ");
		malignantNeoplasmotherSitesTextArea_9.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea_9.setBounds(39, 0, 205, 32);
		panel_140.add(malignantNeoplasmotherSitesTextArea_9);

		cbArterialArterialEmbolismUpper = new JCheckBox();
		cbArterialArterialEmbolismUpper.setBackground(Color.WHITE);
		cbArterialArterialEmbolismUpper.setText("New JCheckBox");
		cbArterialArterialEmbolismUpper.setBounds(7, 3, 14, 18);
		panel_140.add(cbArterialArterialEmbolismUpper);

		panel_141 = new JPanel();
		panel_141.setLayout(null);
		panel_141.setBackground(Color.WHITE);
		panel_141.setBounds(1, 281, 251, 32);
		panel_132.add(panel_141);

		malignantNeoplasmotherSitesTextArea_10 = new JTextArea();
		malignantNeoplasmotherSitesTextArea_10.setWrapStyleWord(true);
		malignantNeoplasmotherSitesTextArea_10
				.setText("Arterial Embolism or Thrombosis of Lower Extremities");
		malignantNeoplasmotherSitesTextArea_10.setLineWrap(true);
		malignantNeoplasmotherSitesTextArea_10.setBounds(39, 0, 205, 32);
		panel_141.add(malignantNeoplasmotherSitesTextArea_10);

		cbArterialArterialEmbolismLower = new JCheckBox();
		cbArterialArterialEmbolismLower.setBackground(Color.WHITE);
		cbArterialArterialEmbolismLower.setText("New JCheckBox");
		cbArterialArterialEmbolismLower.setBounds(7, 3, 14, 18);
		panel_141.add(cbArterialArterialEmbolismLower);

		panel_142 = new JPanel();
		panel_142.setLayout(null);
		panel_142.setBackground(Color.WHITE);
		panel_142.setBounds(1, 319, 251, 25);
		panel_132.add(panel_142);

		malignantNeoplasmOfLabel_59 = new JLabel();
		malignantNeoplasmOfLabel_59
				.setText("Ulcers Chronic of Unspecified Site");
		malignantNeoplasmOfLabel_59.setBounds(39, 5, 189, 14);
		panel_142.add(malignantNeoplasmOfLabel_59);

		cbArterialUlcersChronic = new JCheckBox();
		cbArterialUlcersChronic.setBackground(Color.WHITE);
		cbArterialUlcersChronic.setText("New JCheckBox");
		cbArterialUlcersChronic.setBounds(7, 3, 14, 18);
		panel_142.add(cbArterialUlcersChronic);

		panel_143 = new JPanel();
		panel_143.setLayout(null);
		panel_143.setBackground(Color.WHITE);
		panel_143.setBounds(1, 350, 251, 24);
		panel_132.add(panel_143);

		malignantNeoplasmOfLabel_60 = new JLabel();
		malignantNeoplasmOfLabel_60.setText("Gangrene");
		malignantNeoplasmOfLabel_60.setBounds(39, 5, 189, 14);
		panel_143.add(malignantNeoplasmOfLabel_60);

		cbArterialGangrene = new JCheckBox();
		cbArterialGangrene.setBackground(Color.WHITE);
		cbArterialGangrene.setText("New JCheckBox");
		cbArterialGangrene.setBounds(7, 3, 14, 18);
		panel_143.add(cbArterialGangrene);

		ultrasoundsLabel_7 = new JLabel();
		ultrasoundsLabel_7.setBounds(10, 26, 169, 25);
		panel_132.add(ultrasoundsLabel_7);
		ultrasoundsLabel_7.setForeground(Color.BLACK);
		ultrasoundsLabel_7.setFont(new Font("Dialog", Font.BOLD, 14));
		ultrasoundsLabel_7.setText("ARTERIAL");
	}

	public void doSave() {

		ReasonForStudy rfStudy = new ReasonForStudy();
		rfStudy.setResidentId(Global.currentResidenceKey);

		rfStudy.setUltrasoundMalignantOterSites(cbUltrasoundMalignantOterSites
				.isSelected());
		rfStudy.setUltrasoundMNfGallBladder(cbUltrasoundMNfGallBladder
				.isSelected());
		rfStudy.setUltrasoundNiphritis(cbUltrasoundNiphritis.isSelected());
		rfStudy
				.setUltrasoundRenalFailure(cbUltrasoundRenalFailure
						.isSelected());

		rfStudy.setThyroidAnomalies(cbThyroidAnomalies.isSelected());
		rfStudy.setThyroidCyst(cbThyroidCyst.isSelected());
		rfStudy.setThyroidDisorder(cbThyroidDisorder.isSelected());
		rfStudy
				.setThyroidDyshormonogenic(cbThyroidDyshormonogenic
						.isSelected());
		rfStudy.setThyroidHodgkins(cbThyroidHodgkins.isSelected());
		rfStudy.setThyroidHemorrhage(cbThyroidHemorrhage.isSelected());
		rfStudy.setThyroidUnspecified(cbThyroidUnspecified.isSelected());
		rfStudy.setThyroidThyroiditis(cbThyroidThyroiditis.isSelected());

		rfStudy.setCarotidParalysis(cbCarotidParalysis.isSelected());
		rfStudy.setCarotidEpilepsy(cbCarotidEpilepsy.isSelected());
		rfStudy.setCarotidMigraine(cbCarotidMigraine.isSelected());
		rfStudy.setCarotidUnspecified(cbCarotidUnspecified.isSelected());
		rfStudy.setCarotidVisual(cbCarotidVisual.isSelected());
		rfStudy
				.setCarotidOcclusionWithCI(cbCarotidOcclusionWithCI
						.isSelected());
		rfStudy.setCarotidOcclusionWithoutCI(cbCarotidOcclusionWithoutCI
				.isSelected());

		rfStudy.setEchocardiogramMitralStenosis(cbEchocardiogramMitralStenosis
				.isSelected());
		rfStudy.setEchocardiogramUnspecifiedMV(cbEchocardiogramUnspecifiedMV
				.isSelected());
		rfStudy.setEchocardiogramMitralAortic(cbEchocardiogramMitralAortic
				.isSelected());
		rfStudy.setEchocardiogramHypertensive(cbEchocardiogramHypertensive
				.isSelected());
		rfStudy.setEchocardiogramEssential(cbEchocardiogramEssential
				.isSelected());
		rfStudy.setEchocardiogramRheumatic(cbEchocardiogramRheumatic
				.isSelected());
		rfStudy
				.setEchocardiogramAcuteMyocardial(cbEchocardiogramAcuteMyocardial
						.isSelected());
		rfStudy
				.setEchocardiogramCoronary(cbEchocardiogramCoronary
						.isSelected());
		rfStudy.setEchocardiogramAcutePari(cbEchocardiogramAcutePari
				.isSelected());
		rfStudy.setEchocardiogramPulmonary(cbEchocardiogramPulmonary
				.isSelected());
		rfStudy.setEchocardiogramUnspecifiedDis(cbEchocardiogramUnspecifiedDis
				.isSelected());
		rfStudy
				.setEchocardiogramAneurysm(cbEchocardiogramAneurysm
						.isSelected());
		rfStudy.setEchocardiogramOtherHeart(cbEchocardiogramOtherHeart
				.isSelected());
		rfStudy.setEchocardiogramAtrialFib(cbEchocardiogramAtrialFib
				.isSelected());
		rfStudy.setEchocardiogramPrematureBeats(cbEchocardiogramPrematureBeats
				.isSelected());
		rfStudy.setEchocardiogramCardiacArrest(cbEchocardiogramCardiacArrest
				.isSelected());
		rfStudy.setEchocardiogramHeartFailure(cbEchocardiogramHeartFailure
				.isSelected());
		rfStudy.setEchocardiogramCardiovascular(cbEchocardiogramCardiovascular
				.isSelected());
		rfStudy.setEchocardiogramMyocardities(cbEchocardiogramMyocardities
				.isSelected());
		rfStudy.setEchocardiogramCardiomegaly(cbEchocardiogramCardiomegaly
				.isSelected());

		rfStudy.setPelvisBenignNeoplasmFemale(cbPelvisBenignNeoplasmFemale
				.isSelected());
		rfStudy.setPelvisBenignNeoplasmMale(cbPelvisBenignNeoplasmMale
				.isSelected());
		rfStudy.setPelvisCalculus(cbPelvisCalculus.isSelected());
		rfStudy.setPelvisDiverticulum(cbPelvisDiverticulum.isSelected());
		rfStudy.setPelvisHyperplasia(cbPelvisHyperplasia.isSelected());
		rfStudy.setPelvisMalignantPelvis(cbPelvisMalignantPelvis.isSelected());
		rfStudy.setPelvisMalignantProstate(cbPelvisMalignantProstate
				.isSelected());
		rfStudy
				.setPelvisMalignantNeoplasmOfMale(cbPelvisMalignantNeoplasmOfMale
						.isSelected());
		rfStudy.setPelvisPelvisSwelling(cbPelvisPelvisSwelling.isSelected());

		rfStudy.setBreastPleuralEffusion(cbBreastPleuralEffusion.isSelected());
		rfStudy.setBreastSolitary(cbBreastSolitary.isSelected());
		rfStudy.setBreastPalpable(cbBreastPalpable.isSelected());
		rfStudy.setBreastMastodynia(cbBreastMastodynia.isSelected());

		rfStudy.setVenousVaricoseveinsUlcer(cbVenousVaricoseveinsUlcer
				.isSelected());
		rfStudy.setVenousVaricoseInflam(cbVenousVaricoseInflam.isSelected());
		rfStudy.setVenousVaricoseUlcerInflam(cbVenousVaricoseUlcerInflam
				.isSelected());
		rfStudy.setVenousVaricoseUlcerOrInflam(cbVenousVaricoseUlcerOrInflam
				.isSelected());
		rfStudy.setVenousPulmonaryEmbolism(cbVenousPulmonaryEmbolism
				.isSelected());
		rfStudy.setVenousPhlebitisLower(cbVenousPhlebitisLower.isSelected());
		rfStudy.setVenousPhlebitisUpper(cbVenousPhlebitisUpper.isSelected());
		rfStudy.setVenousHemmorrhage(cbVenousHemmorrhage.isSelected());
		rfStudy.setVenousCompression(cbVenousCompression.isSelected());
		rfStudy.setVenousAnomalies(cbVenousAnomalies.isSelected());

		rfStudy.setArterialDiabetes(cbArterialDiabetes.isSelected());
		rfStudy.setArterialAtherosClaudication(cbArterialAtherosClaudication
				.isSelected());
		rfStudy.setArterialAtherosRestPain(cbArterialAtherosRestPain
				.isSelected());
		rfStudy.setArterialAtherosUlceration(cbArterialAtherosUlceration
				.isSelected());
		rfStudy.setArterialAtherosGangrene(cbArterialAtherosGangrene
				.isSelected());
		rfStudy.setArterialPeripheralVascular(cbArterialPeripheralVascular
				.isSelected());
		rfStudy
				.setArterialArterialEmbolismUpper(cbArterialArterialEmbolismUpper
						.isSelected());
		rfStudy
				.setArterialArterialEmbolismLower(cbArterialArterialEmbolismLower
						.isSelected());
		rfStudy.setArterialUlcersChronic(cbArterialUlcersChronic.isSelected());
		rfStudy.setArterialGangrene(cbArterialGangrene.isSelected());

		try {
			Global.currentLabReasonFormKey = MedrexClientManager.getInstance()
					.insertOrUpdateReasonForStudy(rfStudy);
		} catch (Exception e) {
		}

	}

	public void updateData() {
		ReasonForStudy rfStudy = null;

		if (Global.currentLabReasonFormKey != 0) {
			try {
				rfStudy = MedrexClientManager.getInstance().getReasonForStudy(
						Global.currentLabReasonFormKey);
			} catch (Exception e) {

			}
			cbUltrasoundMalignantOterSites.setSelected(rfStudy
					.getUltrasoundMalignantOterSites());
			cbUltrasoundMNfGallBladder.setSelected(rfStudy
					.getUltrasoundMNfGallBladder());
			cbUltrasoundNiphritis.setSelected(rfStudy.getUltrasoundNiphritis());
			cbUltrasoundRenalFailure.setSelected(rfStudy
					.getUltrasoundRenalFailure());

			cbThyroidAnomalies.setSelected(rfStudy.getThyroidAnomalies());
			cbThyroidCyst.setSelected(rfStudy.getThyroidCyst());
			cbThyroidDisorder.setSelected(rfStudy.getThyroidDisorder());
			cbThyroidDyshormonogenic.setSelected(rfStudy
					.getThyroidDyshormonogenic());
			cbThyroidHodgkins.setSelected(rfStudy.getThyroidHodgkins());
			cbThyroidHemorrhage.setSelected(rfStudy.getThyroidHemorrhage());
			cbThyroidUnspecified.setSelected(rfStudy.getThyroidUnspecified());
			cbThyroidThyroiditis.setSelected(rfStudy.getThyroidThyroiditis());

			cbCarotidParalysis.setSelected(rfStudy.getCarotidParalysis());
			cbCarotidEpilepsy.setSelected(rfStudy.getCarotidEpilepsy());
			cbCarotidMigraine.setSelected(rfStudy.getCarotidMigraine());
			cbCarotidUnspecified.setSelected(rfStudy.getCarotidUnspecified());
			cbCarotidVisual.setSelected(rfStudy.getCarotidVisual());
			cbCarotidOcclusionWithCI.setSelected(rfStudy
					.getCarotidOcclusionWithCI());
			cbCarotidOcclusionWithoutCI.setSelected(rfStudy
					.getCarotidOcclusionWithoutCI());

			cbEchocardiogramMitralStenosis.setSelected(rfStudy
					.getEchocardiogramMitralStenosis());
			cbEchocardiogramUnspecifiedMV.setSelected(rfStudy
					.getEchocardiogramUnspecifiedMV());
			cbEchocardiogramMitralAortic.setSelected(rfStudy
					.getEchocardiogramMitralAortic());
			cbEchocardiogramHypertensive.setSelected(rfStudy
					.getEchocardiogramHypertensive());
			cbEchocardiogramEssential.setSelected(rfStudy
					.getEchocardiogramEssential());
			cbEchocardiogramRheumatic.setSelected(rfStudy
					.getEchocardiogramRheumatic());
			cbEchocardiogramAcuteMyocardial.setSelected(rfStudy
					.getEchocardiogramAcuteMyocardial());
			cbEchocardiogramCoronary.setSelected(rfStudy
					.getEchocardiogramCoronary());
			cbEchocardiogramAcutePari.setSelected(rfStudy
					.getEchocardiogramAcutePari());
			cbEchocardiogramPulmonary.setSelected(rfStudy
					.getEchocardiogramPulmonary());
			cbEchocardiogramUnspecifiedDis.setSelected(rfStudy
					.getEchocardiogramUnspecifiedDis());
			cbEchocardiogramAneurysm.setSelected(rfStudy
					.getEchocardiogramAneurysm());
			cbEchocardiogramOtherHeart.setSelected(rfStudy
					.getEchocardiogramOtherHeart());
			cbEchocardiogramAtrialFib.setSelected(rfStudy
					.getEchocardiogramAtrialFib());
			cbEchocardiogramPrematureBeats.setSelected(rfStudy
					.getEchocardiogramPrematureBeats());
			cbEchocardiogramCardiacArrest.setSelected(rfStudy
					.getEchocardiogramCardiacArrest());
			cbEchocardiogramHeartFailure.setSelected(rfStudy
					.getEchocardiogramHeartFailure());
			cbEchocardiogramCardiovascular.setSelected(rfStudy
					.getEchocardiogramCardiovascular());
			cbEchocardiogramMyocardities.setSelected(rfStudy
					.getEchocardiogramMyocardities());
			cbEchocardiogramCardiomegaly.setSelected(rfStudy
					.getEchocardiogramCardiomegaly());

			cbPelvisBenignNeoplasmFemale.setSelected(rfStudy
					.getPelvisBenignNeoplasmFemale());
			cbPelvisBenignNeoplasmMale.setSelected(rfStudy
					.getPelvisBenignNeoplasmMale());
			cbPelvisCalculus.setSelected(rfStudy.getPelvisCalculus());
			cbPelvisDiverticulum.setSelected(rfStudy.getPelvisDiverticulum());
			cbPelvisHyperplasia.setSelected(rfStudy.getPelvisHyperplasia());
			cbPelvisMalignantPelvis.setSelected(rfStudy
					.getPelvisMalignantPelvis());
			cbPelvisMalignantProstate.setSelected(rfStudy
					.getPelvisMalignantProstate());
			cbPelvisMalignantNeoplasmOfMale.setSelected(rfStudy
					.getPelvisMalignantNeoplasmOfMale());
			cbPelvisPelvisSwelling.setSelected(rfStudy
					.getPelvisPelvisSwelling());

			cbBreastPleuralEffusion.setSelected(rfStudy
					.getBreastPleuralEffusion());
			cbBreastSolitary.setSelected(rfStudy.getBreastSolitary());
			cbBreastPalpable.setSelected(rfStudy.getBreastPalpable());
			cbBreastMastodynia.setSelected(rfStudy.getBreastMastodynia());

			cbVenousVaricoseveinsUlcer.setSelected(rfStudy
					.getVenousVaricoseveinsUlcer());
			cbVenousVaricoseInflam.setSelected(rfStudy
					.getVenousVaricoseInflam());
			cbVenousVaricoseUlcerInflam.setSelected(rfStudy
					.getVenousVaricoseUlcerInflam());
			cbVenousVaricoseUlcerOrInflam.setSelected(rfStudy
					.getVenousVaricoseUlcerOrInflam());
			cbVenousPulmonaryEmbolism.setSelected(rfStudy
					.getVenousPulmonaryEmbolism());
			cbVenousPhlebitisLower.setSelected(rfStudy
					.getVenousPhlebitisLower());
			cbVenousPhlebitisUpper.setSelected(rfStudy
					.getVenousPhlebitisUpper());
			cbVenousHemmorrhage.setSelected(rfStudy.getVenousHemmorrhage());
			cbVenousCompression.setSelected(rfStudy.getVenousCompression());
			cbVenousAnomalies.setSelected(rfStudy.getVenousAnomalies());

			cbArterialDiabetes.setSelected(rfStudy.getArterialDiabetes());
			cbArterialAtherosClaudication.setSelected(rfStudy
					.getArterialAtherosClaudication());
			cbArterialAtherosRestPain.setSelected(rfStudy
					.getArterialAtherosRestPain());
			cbArterialAtherosUlceration.setSelected(rfStudy
					.getArterialAtherosUlceration());
			cbArterialAtherosGangrene.setSelected(rfStudy
					.getArterialAtherosGangrene());
			cbArterialPeripheralVascular.setSelected(rfStudy
					.getArterialPeripheralVascular());
			cbArterialArterialEmbolismUpper.setSelected(rfStudy
					.getArterialArterialEmbolismUpper());
			cbArterialArterialEmbolismLower.setSelected(rfStudy
					.getArterialArterialEmbolismLower());
			cbArterialUlcersChronic.setSelected(rfStudy
					.getArterialUlcersChronic());
			cbArterialGangrene.setSelected(rfStudy.getArterialGangrene());

		}

	}

}
