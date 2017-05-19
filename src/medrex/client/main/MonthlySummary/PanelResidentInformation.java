package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.ResidentInformation;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;

public class PanelResidentInformation extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4156562725713822804L;
	private JTextField txtGlassess;
	private JTextField txtLower;
	private JTextField txtDenturesUpper;
	private JTextField txtHearingL;
	private JTextField txtHearingR;
	private JTextField txtChair;
	private JTextField txtWalker;
	private JTextField txtProsthesis;
	private JTextField txtCrutches;
	private JTextField txtCane;
	private JTextField txtColostomy;
	private JTextField txtCatheter;
	private JTextField txtAppliance;
	private JTextField txtDietAll;
	private JTextField txtPart;
	private JTextField txtNeedsHelp;
	private JTextField txtFeedSelf;
	private JTextField txtOtherDiet;
	private JTextField txtLowResidue;
	private JTextField txtBland;
	private JTextField txtDiabetic;
	private JTextField txtLowSalt;
	private JTextField txtRegular;
	private JTextField txtIfYesLanguage;
	private JRadioButton rbUnderstandEnglishNo;
	private JRadioButton rbUnderstandEnglishYes;
	private JRadioButton rbUnderstandGesturesNo;
	private JRadioButton rbUnderstandGesturesYes;
	private JRadioButton rbUnderstandWritingNo;
	private JRadioButton rbUnderstandWritingYes;
	private JRadioButton rbUnderstandSpeakingNo;
	private JRadioButton rbUnderstandSpeakingYes;
	private JRadioButton rbCanWriteNo;
	private JRadioButton rbCanWriteYes;
	private JRadioButton rbCanHearNo;
	private JRadioButton rbCanHearYes;
	private JRadioButton rbCanSpeakNo;
	private JRadioButton rbCanSpeak;
	private JRadioButton rbAbletoMakeNo;
	private JRadioButton rbAbletoMakeYes;
	private JTextField txtConfused;
	private JTextField txtForgetful;
	private JTextField txtAlert;
	private JTextField txtWanders;
	private JTextField txtWithdrawn;
	private JTextField txtSuspicious;
	private JTextField txtSenile;
	private JTextField txtCombative;
	private JTextField txtBelligerent;
	private JTextField txtDisruptive;
	private JTextField txtOrientedX;
	private JTextField txtCooperative;
	private JRadioButton noRadioButton;
	private JRadioButton yesRadioButton;
	private JTextField txtOtherReg;
	private JTextField txtReg;
	private JTextField txtMattressFirm;
	private JTextField txtBedLow;
	private JTextField txtLocomotion9;
	private JTextField txtLocomotion8;
	private JTextField txtLocomotion7;
	private JTextField txtLocomotion6;
	private JTextField txtLocomotion5;
	private JTextField txtLocomotion4;
	private JTextField txtLocomotion3;
	private JTextField txtLocomotion2;
	private JTextField txtLocomotion1;
	private JTextField txtTranfer12;
	private JTextField txtTranfer11;
	private JTextField txtTranfer10;
	private JTextField txtTranfer9;
	private JTextField txtTranfer8;
	private JTextField txtTranfer7;
	private JTextField txtTranfer6;
	private JTextField txtTranfer5;
	private JTextField txtTranfer4;
	private JTextField txtTranfer3;
	private JTextField txtTranfer2;
	private JTextField txtTranfer1;
	private JTextField txtFeeding3;
	private JTextField txtFeeding2;
	private JTextField txtFeeding1;
	private JTextField txtDressing12;
	private JTextField txtDressing11;
	private JTextField txtDressing10;
	private JTextField txtDressing9;
	private JTextField txtDressing8;
	private JTextField txtDressing7;
	private JTextField txtDressing6;
	private JTextField txtDressing5;
	private JTextField txtDressing4;
	private JTextField txtDressing3;
	private JTextField txtDressing2;
	private JTextField txtDressing1;
	private JTextField txtPersonalHygiene15;
	private JTextField txtPersonalHygiene14;
	private JTextField txtPersonalHygiene13;
	private JTextField txtPersonalHygiene12;
	private JTextField txtPersonalHygiene11;
	private JTextField txtPersonalHygiene10;
	private JTextField txtPersonalHygiene9;
	private JTextField txtPersonalHygiene8;
	private JTextField txtPersonalHygiene7;
	private JTextField txtPersonalHygiene6;
	private JTextField txtPersonalHygiene5;
	private JTextField txtPersonalHygiene4;
	private JTextField txtPersonalHygiene3;
	private JTextField txtPersonalHygiene2;
	private JTextField txtPersonalHygiene1;
	private JTextField txtBadActivity6;
	private JTextField txtBadActivity5;
	private JTextField txtBadActivity4;
	private JTextField txtBadActivity3;
	private JTextField txtBadActivity2;
	private JTextField txtBadActivity1;
	private ButtonGroup bgUnderstandEnglish = new ButtonGroup();
	private ButtonGroup bgGestures = new ButtonGroup();
	private ButtonGroup bgUnderstandWriting = new ButtonGroup();
	private ButtonGroup bgUnderstandSpeaking = new ButtonGroup();
	private ButtonGroup bgCanWrite = new ButtonGroup();
	private ButtonGroup bgCanHear = new ButtonGroup();
	private ButtonGroup bgCanSpeak = new ButtonGroup();
	private ButtonGroup bgAbletoMake = new ButtonGroup();
	private ButtonGroup bgSideRails = new ButtonGroup();
	private JLabel txtSocialInformation;
	private JLabel txtAdditionalPertinent;

	public PanelResidentInformation() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(1000, 1425));

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		residentInformationLabel.setText("RESIDENT INFORMATION");
		residentInformationLabel.setBounds(385, 10, 197, 14);
		add(residentInformationLabel);

		final JLabel selfCareStatusLabel = new JLabel();
		selfCareStatusLabel
				.setText("<html><body><u><b>SELF CARE STATUS</b></u></body></html>");
		selfCareStatusLabel.setBounds(266, 33, 67, 35);
		add(selfCareStatusLabel);

		final JLabel checkLevelOfLabel = new JLabel();
		checkLevelOfLabel.setFont(new Font("Tahoma", Font.PLAIN, 8));
		checkLevelOfLabel
				.setText("<html><body>(check level of ability. Write S in space if needs suptervision<br> only. Draw line across if inapplicable)");
		checkLevelOfLabel.setBounds(266, 68, 223, 20);
		add(checkLevelOfLabel);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBounds(0, 105, 333, 1303);
		add(panel);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 320, 52);
		panel.add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(0, 3, 70, 57);
		panel_2.add(panel_3);

		final JLabel bedActivityLabel = new JLabel();
		bedActivityLabel.setBackground(Color.WHITE);
		bedActivityLabel.setText("Bed Activity");
		bedActivityLabel.setBounds(5, -5, 66, 59);
		panel_3.add(bedActivityLabel);

		final JLabel turnsLabel = new JLabel();
		turnsLabel.setText("Turns");
		turnsLabel.setBounds(200, 3, 42, 14);
		panel_2.add(turnsLabel);

		final JLabel siteLabel = new JLabel();
		siteLabel.setText("Site");
		siteLabel.setBounds(202, 39, 27, 14);
		panel_2.add(siteLabel);

		final JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(70, 0, 42, 60);
		panel_2.add(panel_8);

		txtBadActivity1 = new JTextField();
		txtBadActivity1.setBounds(2, 3, 40, 25);
		panel_8.add(txtBadActivity1);

		txtBadActivity4 = new JTextField();
		txtBadActivity4.setBounds(2, 28, 40, 25);
		panel_8.add(txtBadActivity4);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(110, 0, 42, 60);
		panel_2.add(panel_8_1);

		txtBadActivity2 = new JTextField();
		txtBadActivity2.setBounds(2, 3, 40, 25);
		panel_8_1.add(txtBadActivity2);

		txtBadActivity5 = new JTextField();
		txtBadActivity5.setBounds(2, 28, 40, 25);
		panel_8_1.add(txtBadActivity5);

		final JPanel panel_8_2 = new JPanel();
		panel_8_2.setBackground(Color.WHITE);
		panel_8_2.setLayout(null);
		panel_8_2.setBounds(150, 0, 42, 60);
		panel_2.add(panel_8_2);

		txtBadActivity3 = new JTextField();
		txtBadActivity3.setBounds(2, 3, 40, 25);
		panel_8_2.add(txtBadActivity3);

		txtBadActivity6 = new JTextField();
		txtBadActivity6.setBounds(2, 28, 40, 25);
		panel_8_2.add(txtBadActivity6);

		final JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(2, 57, 329, 111);
		panel.add(panel_4);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBounds(0, 0, 71, 107);
		panel_4.add(panel_5);

		final JLabel personalHygieneLabel = new JLabel();
		personalHygieneLabel.setBackground(Color.WHITE);
		personalHygieneLabel.setBounds(0, 6, 71, 98);
		personalHygieneLabel
				.setText("<html><body>&nbsp;Personal <br>&nbsp;Hygiene</body><html>");
		panel_5.add(personalHygieneLabel);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(70, 0, 41, 107);
		panel_4.add(panel_6);

		txtPersonalHygiene1 = new JTextField();
		txtPersonalHygiene1.setBounds(0, 0, 40, 21);
		panel_6.add(txtPersonalHygiene1);

		txtPersonalHygiene4 = new JTextField();
		txtPersonalHygiene4.setBounds(0, 21, 40, 21);
		panel_6.add(txtPersonalHygiene4);

		txtPersonalHygiene7 = new JTextField();
		txtPersonalHygiene7.setBounds(0, 42, 40, 21);
		panel_6.add(txtPersonalHygiene7);

		txtPersonalHygiene10 = new JTextField();
		txtPersonalHygiene10.setBounds(0, 64, 40, 21);
		panel_6.add(txtPersonalHygiene10);

		txtPersonalHygiene13 = new JTextField();
		txtPersonalHygiene13.setBounds(0, 85, 40, 21);
		panel_6.add(txtPersonalHygiene13);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(109, 0, 41, 107);
		panel_4.add(panel_6_1);

		final JPanel panel_6_4 = new JPanel();
		panel_6_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4.setLayout(null);
		panel_6_4.setBounds(0, 0, 41, 106);
		panel_6_1.add(panel_6_4);

		txtPersonalHygiene2 = new JTextField();
		txtPersonalHygiene2.setBounds(0, 0, 40, 21);
		panel_6_4.add(txtPersonalHygiene2);

		txtPersonalHygiene5 = new JTextField();
		txtPersonalHygiene5.setBounds(0, 21, 40, 21);
		panel_6_4.add(txtPersonalHygiene5);

		txtPersonalHygiene8 = new JTextField();
		txtPersonalHygiene8.setBounds(0, 42, 40, 21);
		panel_6_4.add(txtPersonalHygiene8);

		txtPersonalHygiene11 = new JTextField();
		txtPersonalHygiene11.setBounds(0, 64, 40, 21);
		panel_6_4.add(txtPersonalHygiene11);

		txtPersonalHygiene14 = new JTextField();
		txtPersonalHygiene14.setBounds(0, 85, 40, 21);
		panel_6_4.add(txtPersonalHygiene14);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2.setLayout(null);
		panel_6_2.setBounds(150, -1, 39, 108);
		panel_4.add(panel_6_2);

		txtPersonalHygiene3 = new JTextField();
		txtPersonalHygiene3.setBounds(-1, 1, 40, 21);
		panel_6_2.add(txtPersonalHygiene3);

		txtPersonalHygiene6 = new JTextField();
		txtPersonalHygiene6.setBounds(-1, 22, 40, 21);
		panel_6_2.add(txtPersonalHygiene6);

		txtPersonalHygiene9 = new JTextField();
		txtPersonalHygiene9.setBounds(-1, 43, 40, 21);
		panel_6_2.add(txtPersonalHygiene9);

		txtPersonalHygiene12 = new JTextField();
		txtPersonalHygiene12.setBounds(-1, 64, 40, 21);
		panel_6_2.add(txtPersonalHygiene12);

		txtPersonalHygiene15 = new JTextField();
		txtPersonalHygiene15.setBounds(-1, 86, 40, 21);
		panel_6_2.add(txtPersonalHygiene15);

		final JLabel faceHairArmsLabel = new JLabel();
		faceHairArmsLabel.setText("Face, Hair, Arms");
		faceHairArmsLabel.setBounds(196, 0, 91, 14);
		panel_4.add(faceHairArmsLabel);

		final JLabel trunkPerineumLabel = new JLabel();
		trunkPerineumLabel.setText("Trunk & Perineum");
		trunkPerineumLabel.setBounds(196, 20, 122, 14);
		panel_4.add(trunkPerineumLabel);

		final JLabel lowerExtremitiesLabel = new JLabel();
		lowerExtremitiesLabel.setText("Lower Extremities");
		lowerExtremitiesLabel.setBounds(196, 40, 121, 14);
		panel_4.add(lowerExtremitiesLabel);

		final JLabel bladderProgramLabel = new JLabel();
		bladderProgramLabel.setText("Bladder Program");
		bladderProgramLabel.setBounds(197, 60, 102, 14);
		panel_4.add(bladderProgramLabel);

		final JLabel bowelProgramLabel = new JLabel();
		bowelProgramLabel.setText("Bowel Program");
		bowelProgramLabel.setBounds(197, 80, 90, 14);
		panel_4.add(bowelProgramLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(2, 258, 330, 20);
		panel.add(panel_9);

		final JLabel feedingLabel = new JLabel();
		feedingLabel.setBackground(Color.WHITE);
		feedingLabel.setText("Feeding");
		feedingLabel.setBounds(10, 5, 54, 14);
		panel_9.add(feedingLabel);

		txtFeeding1 = new JTextField();
		txtFeeding1.setBounds(70, 2, 42, 17);
		panel_9.add(txtFeeding1);

		txtFeeding2 = new JTextField();
		txtFeeding2.setBounds(111, 0, 37, 21);
		panel_9.add(txtFeeding2);

		txtFeeding3 = new JTextField();
		txtFeeding3.setBounds(147, 0, 43, 21);
		panel_9.add(txtFeeding3);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(2, 280, 329, 79);
		panel.add(panel_4_1);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(0, 0, 71, 78);
		panel_4_1.add(panel_5_1);

		final JLabel personalHygieneLabel_1 = new JLabel();
		personalHygieneLabel_1.setBackground(Color.WHITE);
		personalHygieneLabel_1.setText("Transfer");
		personalHygieneLabel_1.setBounds(0, 6, 71, 77);
		panel_5_1.add(personalHygieneLabel_1);

		final JPanel panel_6_6 = new JPanel();
		panel_6_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6.setLayout(null);
		panel_6_6.setBounds(70, 0, 41, 78);
		panel_4_1.add(panel_6_6);

		txtTranfer1 = new JTextField();
		txtTranfer1.setBounds(0, 1, 40, 19);
		panel_6_6.add(txtTranfer1);

		txtTranfer4 = new JTextField();
		txtTranfer4.setBounds(0, 19, 40, 21);
		panel_6_6.add(txtTranfer4);

		txtTranfer7 = new JTextField();
		txtTranfer7.setBounds(0, 39, 40, 21);
		panel_6_6.add(txtTranfer7);

		txtTranfer10 = new JTextField();
		txtTranfer10.setBounds(0, 58, 40, 21);
		panel_6_6.add(txtTranfer10);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(109, -2, 41, 78);
		panel_4_1.add(panel_6_1_1);

		txtTranfer2 = new JTextField();
		txtTranfer2.setBounds(0, 2, 40, 19);
		panel_6_1_1.add(txtTranfer2);

		txtTranfer5 = new JTextField();
		txtTranfer5.setBounds(0, 20, 40, 21);
		panel_6_1_1.add(txtTranfer5);

		txtTranfer8 = new JTextField();
		txtTranfer8.setBounds(0, 39, 40, 21);
		panel_6_1_1.add(txtTranfer8);

		txtTranfer11 = new JTextField();
		txtTranfer11.setBounds(0, 58, 40, 21);
		panel_6_1_1.add(txtTranfer11);

		final JPanel panel_6_2_1 = new JPanel();
		panel_6_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBounds(149, 0, 41, 78);
		panel_4_1.add(panel_6_2_1);

		txtTranfer3 = new JTextField();
		txtTranfer3.setBounds(0, 0, 40, 21);
		panel_6_2_1.add(txtTranfer3);

		txtTranfer6 = new JTextField();
		txtTranfer6.setBounds(0, 20, 40, 21);
		panel_6_2_1.add(txtTranfer6);

		txtTranfer9 = new JTextField();
		txtTranfer9.setBounds(0, 39, 40, 21);
		panel_6_2_1.add(txtTranfer9);

		txtTranfer12 = new JTextField();
		txtTranfer12.setBounds(0, 58, 40, 21);
		panel_6_2_1.add(txtTranfer12);

		final JLabel sittingLabel = new JLabel();
		sittingLabel.setText("Sitting");
		sittingLabel.setBounds(197, 1, 122, 14);
		panel_4_1.add(sittingLabel);

		final JLabel standingLabel = new JLabel();
		standingLabel.setText("Standing");
		standingLabel.setBounds(197, 21, 54, 14);
		panel_4_1.add(standingLabel);

		final JLabel tubLabel = new JLabel();
		tubLabel.setText("Tub");
		tubLabel.setBounds(197, 41, 41, 14);
		panel_4_1.add(tubLabel);

		final JLabel toiletLabel = new JLabel();
		toiletLabel.setText("Toilet");
		toiletLabel.setBounds(197, 61, 54, 14);
		panel_4_1.add(toiletLabel);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(2, 362, 329, 84);
		panel.add(panel_2_1);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(0, 3, 70, 78);
		panel_2_1.add(panel_3_1);

		final JLabel bedActivityLabel_1 = new JLabel();
		bedActivityLabel_1.setBackground(Color.WHITE);
		bedActivityLabel_1.setText("Locomotion");
		bedActivityLabel_1.setBounds(5, -1, 55, 69);
		panel_3_1.add(bedActivityLabel_1);

		final JLabel turnsLabel_1 = new JLabel();
		turnsLabel_1.setText("Wheelchair");
		turnsLabel_1.setBounds(200, 3, 70, 14);
		panel_2_1.add(turnsLabel_1);

		final JLabel siteLabel_1 = new JLabel();
		siteLabel_1.setText("Stairs");
		siteLabel_1.setBounds(202, 39, 27, 14);
		panel_2_1.add(siteLabel_1);

		final JLabel walkingLabel = new JLabel();
		walkingLabel.setText("Walking");
		walkingLabel.setBounds(200, 19, 54, 14);
		panel_2_1.add(walkingLabel);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(149, 3, 40, 78);
		panel_2_1.add(panel_10);

		txtLocomotion3 = new JTextField();
		txtLocomotion3.setBounds(0, 0, 40, 26);
		panel_10.add(txtLocomotion3);

		txtLocomotion6 = new JTextField();
		txtLocomotion6.setBounds(0, 25, 40, 26);
		panel_10.add(txtLocomotion6);

		txtLocomotion9 = new JTextField();
		txtLocomotion9.setBounds(0, 50, 40, 26);
		panel_10.add(txtLocomotion9);

		final JPanel panel_10_1 = new JPanel();
		panel_10_1.setLayout(null);
		panel_10_1.setBounds(69, 3, 40, 78);
		panel_2_1.add(panel_10_1);

		txtLocomotion1 = new JTextField();
		txtLocomotion1.setBounds(0, 0, 40, 26);
		panel_10_1.add(txtLocomotion1);

		txtLocomotion4 = new JTextField();
		txtLocomotion4.setBounds(0, 25, 40, 26);
		panel_10_1.add(txtLocomotion4);

		txtLocomotion7 = new JTextField();
		txtLocomotion7.setBounds(0, 50, 40, 26);
		panel_10_1.add(txtLocomotion7);

		final JPanel panel_10_2 = new JPanel();
		panel_10_2.setLayout(null);
		panel_10_2.setBounds(108, 3, 40, 78);
		panel_2_1.add(panel_10_2);

		txtLocomotion2 = new JTextField();
		txtLocomotion2.setBounds(0, 0, 40, 26);
		panel_10_2.add(txtLocomotion2);

		txtLocomotion5 = new JTextField();
		txtLocomotion5.setBounds(0, 25, 40, 26);
		panel_10_2.add(txtLocomotion5);

		txtLocomotion8 = new JTextField();
		txtLocomotion8.setBounds(0, 50, 40, 26);
		panel_10_2.add(txtLocomotion8);

		final JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(2, 450, 329, 60);
		panel.add(panel_11);

		final JLabel bedLowLabel = new JLabel();
		bedLowLabel.setText("<html><body><B>BED</B> Low");
		bedLowLabel.setBounds(0, 0, 49, 14);
		panel_11.add(bedLowLabel);

		txtBedLow = new JTextField();
		txtBedLow.setBounds(49, 1, 43, 16);
		panel_11.add(txtBedLow);

		final JLabel mattressLabel = new JLabel();
		mattressLabel.setText("Mattress :");
		mattressLabel.setBounds(95, 1, 54, 14);
		panel_11.add(mattressLabel);

		final JLabel firmLabel = new JLabel();
		firmLabel.setText("Firm");
		firmLabel.setBounds(148, 0, 34, 14);
		panel_11.add(firmLabel);

		txtMattressFirm = new JTextField();
		txtMattressFirm.setBounds(172, 0, 59, 18);
		panel_11.add(txtMattressFirm);

		final JLabel regLabel = new JLabel();
		regLabel.setText("Reg :");
		regLabel.setBounds(235, 1, 34, 14);
		panel_11.add(regLabel);

		txtReg = new JTextField();
		txtReg.setBounds(263, 0, 53, 18);
		panel_11.add(txtReg);

		final JLabel otherLabel = new JLabel();
		otherLabel.setText("Other");
		otherLabel.setBounds(0, 20, 34, 14);
		panel_11.add(otherLabel);

		txtOtherReg = new JTextField();
		txtOtherReg.setBounds(49, 20, 267, 18);
		panel_11.add(txtOtherReg);

		final JLabel sideRailsLabel = new JLabel();
		sideRailsLabel.setText("Side Rails :");
		sideRailsLabel.setBounds(0, 40, 54, 14);
		panel_11.add(sideRailsLabel);

		yesRadioButton = new JRadioButton();
		yesRadioButton.setActionCommand("1");
		bgSideRails.add(yesRadioButton);
		yesRadioButton.setBackground(Color.WHITE);
		yesRadioButton.setText("Yes");
		yesRadioButton.setBounds(49, 41, 49, 13);
		panel_11.add(yesRadioButton);

		noRadioButton = new JRadioButton();
		noRadioButton.setActionCommand("2");
		bgSideRails.add(noRadioButton);
		noRadioButton.setBackground(Color.WHITE);
		noRadioButton.setText("No");
		noRadioButton.setBounds(104, 39, 43, 17);
		panel_11.add(noRadioButton);

		final JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(2, 512, 329, 132);
		panel.add(panel_12);

		final JLabel behaviorLabel = new JLabel();
		behaviorLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		behaviorLabel.setText("BEHAVIOR");
		behaviorLabel.setBounds(4, 3, 61, 14);
		panel_12.add(behaviorLabel);

		final JLabel cooperativeLabel = new JLabel();
		cooperativeLabel.setText("Cooperative");
		cooperativeLabel.setBounds(4, 23, 71, 14);
		panel_12.add(cooperativeLabel);

		txtCooperative = new JTextField();
		txtCooperative.setBounds(70, 21, 77, 18);
		panel_12.add(txtCooperative);

		final JLabel orientedXLabel = new JLabel();
		orientedXLabel.setText("Oriented x");
		orientedXLabel.setBounds(150, 23, 61, 14);
		panel_12.add(orientedXLabel);

		txtOrientedX = new JTextField();
		txtOrientedX.setBounds(213, 21, 106, 18);
		panel_12.add(txtOrientedX);

		final JLabel disruptiveLabel = new JLabel();
		disruptiveLabel.setText("Disruptive");
		disruptiveLabel.setBounds(4, 55, 61, 14);
		panel_12.add(disruptiveLabel);

		txtDisruptive = new JTextField();
		txtDisruptive.setBounds(68, 52, 22, 18);
		panel_12.add(txtDisruptive);

		final JLabel belligerentLabel = new JLabel();
		belligerentLabel.setText("Belligerent");
		belligerentLabel.setBounds(96, 53, 54, 14);
		panel_12.add(belligerentLabel);

		txtBelligerent = new JTextField();
		txtBelligerent.setBounds(149, 51, 27, 18);
		panel_12.add(txtBelligerent);

		final JLabel combativeLabel = new JLabel();
		combativeLabel.setText("Combative");
		combativeLabel.setBounds(182, 51, 54, 14);
		panel_12.add(combativeLabel);

		txtCombative = new JTextField();
		txtCombative.setBounds(242, 49, 77, 18);
		panel_12.add(txtCombative);

		final JLabel senileLabel = new JLabel();
		senileLabel.setText("Senile");
		senileLabel.setBounds(4, 81, 28, 14);
		panel_12.add(senileLabel);

		txtSenile = new JTextField();
		txtSenile.setBounds(38, 79, 52, 18);
		panel_12.add(txtSenile);

		final JLabel suspiciousLabel = new JLabel();
		suspiciousLabel.setText("Suspicious");
		suspiciousLabel.setBounds(96, 81, 54, 14);
		panel_12.add(suspiciousLabel);

		txtSuspicious = new JTextField();
		txtSuspicious.setBounds(150, 79, 54, 18);
		panel_12.add(txtSuspicious);

		final JLabel withdrawnLabel = new JLabel();
		withdrawnLabel.setText("Withdrawn");
		withdrawnLabel.setBounds(205, 81, 54, 14);
		panel_12.add(withdrawnLabel);

		txtWithdrawn = new JTextField();
		txtWithdrawn.setBounds(265, 79, 56, 18);
		panel_12.add(txtWithdrawn);

		final JLabel wandersLabel = new JLabel();
		wandersLabel.setText("Wanders");
		wandersLabel.setBounds(4, 110, 52, 14);
		panel_12.add(wandersLabel);

		txtWanders = new JTextField();
		txtWanders.setBounds(52, 108, 77, 18);
		panel_12.add(txtWanders);

		final JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(2, 646, 329, 45);
		panel.add(panel_13);

		final JLabel mentalStatusLabel = new JLabel();
		mentalStatusLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		mentalStatusLabel.setText("MENTAL STATUS");
		mentalStatusLabel.setBounds(2, 0, 94, 14);
		panel_13.add(mentalStatusLabel);

		final JLabel alertLabel = new JLabel();
		alertLabel.setText("Alert");
		alertLabel.setBounds(2, 20, 31, 14);
		panel_13.add(alertLabel);

		txtAlert = new JTextField();
		txtAlert.setBounds(32, 20, 45, 18);
		panel_13.add(txtAlert);

		final JLabel forgetfulLabel = new JLabel();
		forgetfulLabel.setText("Forgetful");
		forgetfulLabel.setBounds(80, 20, 54, 14);
		panel_13.add(forgetfulLabel);

		txtForgetful = new JTextField();
		txtForgetful.setBounds(126, 18, 45, 18);
		panel_13.add(txtForgetful);

		final JLabel confusedLabel = new JLabel();
		confusedLabel.setText("Confused");
		confusedLabel.setBounds(179, 20, 54, 14);
		panel_13.add(confusedLabel);

		txtConfused = new JTextField();
		txtConfused.setBounds(229, 18, 77, 18);
		panel_13.add(txtConfused);

		final JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(2, 930, 329, 148);
		panel.add(panel_15);

		final JLabel dietLabel = new JLabel();
		dietLabel.setText("<HTML><BODY><B><U>DIET</B></BODY></HTML>");
		dietLabel.setBounds(0, 0, 54, 14);
		panel_15.add(dietLabel);

		final JLabel regularLabel = new JLabel();
		regularLabel.setText("Regular");
		regularLabel.setBounds(0, 20, 54, 14);
		panel_15.add(regularLabel);

		txtRegular = new JTextField();
		txtRegular.setBounds(45, 17, 48, 21);
		panel_15.add(txtRegular);

		final JLabel lowSaltLabel = new JLabel();
		lowSaltLabel.setText("Low Salt");
		lowSaltLabel.setBounds(98, 20, 48, 14);
		panel_15.add(lowSaltLabel);

		txtLowSalt = new JTextField();
		txtLowSalt.setBounds(144, 17, 30, 21);
		panel_15.add(txtLowSalt);

		final JLabel diabeticLabel = new JLabel();
		diabeticLabel.setText("Diabetic");
		diabeticLabel.setBounds(180, 20, 54, 14);
		panel_15.add(diabeticLabel);

		txtDiabetic = new JTextField();
		txtDiabetic.setBounds(224, 17, 72, 21);
		panel_15.add(txtDiabetic);

		final JLabel blandLabel = new JLabel();
		blandLabel.setText("Bland");
		blandLabel.setBounds(0, 47, 38, 14);
		panel_15.add(blandLabel);

		txtBland = new JTextField();
		txtBland.setBounds(38, 44, 42, 21);
		panel_15.add(txtBland);

		final JLabel lowResidueLabel = new JLabel();
		lowResidueLabel.setText("Low Residue");
		lowResidueLabel.setBounds(86, 47, 72, 14);
		panel_15.add(lowResidueLabel);

		txtLowResidue = new JTextField();
		txtLowResidue.setBounds(154, 44, 142, 21);
		panel_15.add(txtLowResidue);

		final JLabel otherLabel_2 = new JLabel();
		otherLabel_2.setText("Other");
		otherLabel_2.setBounds(0, 71, 38, 14);
		panel_15.add(otherLabel_2);

		txtOtherDiet = new JTextField();
		txtOtherDiet.setBounds(32, 67, 263, 21);
		panel_15.add(txtOtherDiet);

		final JLabel feedsSelfLabel = new JLabel();
		feedsSelfLabel.setText("Feeds self");
		feedsSelfLabel.setBounds(0, 94, 54, 14);
		panel_15.add(feedsSelfLabel);

		txtFeedSelf = new JTextField();
		txtFeedSelf.setBounds(55, 94, 79, 19);
		panel_15.add(txtFeedSelf);

		final JLabel needsHelpLabel = new JLabel();
		needsHelpLabel.setText("Needs Help");
		needsHelpLabel.setBounds(140, 94, 54, 14);
		panel_15.add(needsHelpLabel);

		txtNeedsHelp = new JTextField();
		txtNeedsHelp.setBounds(198, 91, 96, 21);
		panel_15.add(txtNeedsHelp);

		final JLabel partLabel = new JLabel();
		partLabel.setText("Part");
		partLabel.setBounds(0, 117, 38, 14);
		panel_15.add(partLabel);

		txtPart = new JTextField();
		txtPart.setBounds(31, 116, 102, 21);
		panel_15.add(txtPart);

		final JLabel allLabel = new JLabel();
		allLabel.setText("All");
		allLabel.setBounds(154, 117, 30, 14);
		panel_15.add(allLabel);

		txtDietAll = new JTextField();
		txtDietAll.setBounds(198, 117, 95, 21);
		panel_15.add(txtDietAll);

		final JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(2, 1083, 329, 177);
		panel.add(panel_16);

		final JLabel residentUsesLabel = new JLabel();
		residentUsesLabel.setText("RESIDENT USES");
		residentUsesLabel.setBounds(0, 0, 94, 14);
		panel_16.add(residentUsesLabel);

		final JLabel applianceLabel = new JLabel();
		applianceLabel.setText("Appliance");
		applianceLabel.setBounds(0, 20, 56, 14);
		panel_16.add(applianceLabel);

		txtAppliance = new JTextField();
		txtAppliance.setBounds(56, 20, 39, 21);
		panel_16.add(txtAppliance);

		final JLabel catheterLabel = new JLabel();
		catheterLabel.setText("Catheter");
		catheterLabel.setBounds(99, 23, 54, 14);
		panel_16.add(catheterLabel);

		txtCatheter = new JTextField();
		txtCatheter.setBounds(144, 20, 39, 21);
		panel_16.add(txtCatheter);

		final JLabel colostomyLabel = new JLabel();
		colostomyLabel.setText("Colostomy");
		colostomyLabel.setBounds(186, 23, 54, 14);
		panel_16.add(colostomyLabel);

		txtColostomy = new JTextField();
		txtColostomy.setBounds(240, 20, 79, 21);
		panel_16.add(txtColostomy);

		final JLabel caneLabel = new JLabel();
		caneLabel.setText("Cane");
		caneLabel.setBounds(0, 40, 39, 14);
		panel_16.add(caneLabel);

		txtCane = new JTextField();
		txtCane.setBounds(35, 43, 62, 23);
		panel_16.add(txtCane);

		final JLabel crutchesLabel = new JLabel();
		crutchesLabel.setText("Crutches");
		crutchesLabel.setBounds(99, 47, 54, 14);
		panel_16.add(crutchesLabel);

		txtCrutches = new JTextField();
		txtCrutches.setBounds(144, 43, 39, 21);
		panel_16.add(txtCrutches);

		final JLabel prosthesisLabel = new JLabel();
		prosthesisLabel.setText("Prosthesis");
		prosthesisLabel.setBounds(186, 47, 54, 14);
		panel_16.add(prosthesisLabel);

		txtProsthesis = new JTextField();
		txtProsthesis.setBounds(240, 44, 79, 21);
		panel_16.add(txtProsthesis);

		final JLabel walkerLabel = new JLabel();
		walkerLabel.setText("Walker");
		walkerLabel.setBounds(0, 71, 39, 14);
		panel_16.add(walkerLabel);

		txtWalker = new JTextField();
		txtWalker.setBounds(35, 72, 62, 21);
		panel_16.add(txtWalker);

		final JLabel chairLabel = new JLabel();
		chairLabel.setText("Chair");
		chairLabel.setBounds(99, 75, 33, 14);
		panel_16.add(chairLabel);

		txtChair = new JTextField();
		txtChair.setBounds(138, 72, 79, 21);
		panel_16.add(txtChair);

		final JLabel hearingAidLabel = new JLabel();
		hearingAidLabel.setText("Hearing Aid");
		hearingAidLabel.setBounds(0, 99, 79, 14);
		panel_16.add(hearingAidLabel);

		final JLabel rLabel = new JLabel();
		rLabel.setText("R");
		rLabel.setBounds(78, 99, 16, 14);
		panel_16.add(rLabel);

		txtHearingR = new JTextField();
		txtHearingR.setBounds(90, 95, 40, 21);
		panel_16.add(txtHearingR);

		final JLabel label = new JLabel();
		label.setText("L");
		label.setBounds(138, 99, 16, 14);
		panel_16.add(label);

		txtHearingL = new JTextField();
		txtHearingL.setBounds(148, 96, 50, 21);
		panel_16.add(txtHearingL);

		final JLabel denturesspecifyUpperLabel = new JLabel();
		denturesspecifyUpperLabel.setText("Dentures(Specify) Upper");
		denturesspecifyUpperLabel.setBounds(0, 124, 132, 14);
		panel_16.add(denturesspecifyUpperLabel);

		txtDenturesUpper = new JTextField();
		txtDenturesUpper.setBounds(119, 121, 79, 21);
		panel_16.add(txtDenturesUpper);

		final JLabel lowerLabel = new JLabel();
		lowerLabel.setText("Lower");
		lowerLabel.setBounds(201, 124, 39, 14);
		panel_16.add(lowerLabel);

		txtLower = new JTextField();
		txtLower.setBounds(232, 121, 79, 21);
		panel_16.add(txtLower);

		final JLabel glassesLabel = new JLabel();
		glassesLabel.setText("Glasses");
		glassesLabel.setBounds(0, 144, 62, 14);
		panel_16.add(glassesLabel);

		txtGlassess = new JTextField();
		txtGlassess.setBounds(53, 144, 164, 21);
		panel_16.add(txtGlassess);

		final JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 693, 329, 233);
		panel.add(panel_7);
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);

		final JLabel communicationAbilityLabel = new JLabel();
		communicationAbilityLabel.setBounds(10, 10, 148, 20);
		panel_7.add(communicationAbilityLabel);
		communicationAbilityLabel.setText("COMMUNICATION ABILITY");

		final JLabel ableToMakeLabel = new JLabel();
		ableToMakeLabel.setBounds(10, 35, 148, 14);
		panel_7.add(ableToMakeLabel);
		ableToMakeLabel.setText("Able to make needs known");

		final JLabel canSpeakLabel = new JLabel();
		canSpeakLabel.setBounds(10, 55, 54, 14);
		panel_7.add(canSpeakLabel);
		canSpeakLabel.setText("Can speak");

		final JLabel canHearLabel = new JLabel();
		canHearLabel.setBounds(10, 75, 54, 14);
		panel_7.add(canHearLabel);
		canHearLabel.setText("Can hear");

		final JLabel canWriteLabel = new JLabel();
		canWriteLabel.setBounds(10, 95, 54, 14);
		panel_7.add(canWriteLabel);
		canWriteLabel.setText("Can write");

		final JLabel understandsSpeakingLabel = new JLabel();
		understandsSpeakingLabel.setBounds(10, 115, 111, 14);
		panel_7.add(understandsSpeakingLabel);
		understandsSpeakingLabel.setText("Understands speaking");

		final JLabel understandsWritingLabel = new JLabel();
		understandsWritingLabel.setBounds(10, 135, 148, 14);
		panel_7.add(understandsWritingLabel);
		understandsWritingLabel.setText("Understands writing");

		final JLabel understandsWritingLabel_1 = new JLabel();
		understandsWritingLabel_1.setBounds(10, 155, 148, 14);
		panel_7.add(understandsWritingLabel_1);
		understandsWritingLabel_1.setText("Understands gestures");

		final JLabel understandsWritingLabel_1_1 = new JLabel();
		understandsWritingLabel_1_1.setBounds(10, 175, 123, 14);
		panel_7.add(understandsWritingLabel_1_1);
		understandsWritingLabel_1_1.setText("Understands English");

		final JLabel ifNoStateLabel = new JLabel();
		ifNoStateLabel.setBounds(10, 199, 169, 14);
		panel_7.add(ifNoStateLabel);
		ifNoStateLabel.setText("If no, state language spoken : ");

		final JLabel yesLabel = new JLabel();
		yesLabel.setBounds(200, 13, 33, 14);
		panel_7.add(yesLabel);
		yesLabel.setText("Yes");

		final JLabel noLabel = new JLabel();
		noLabel.setBounds(252, 13, 33, 14);
		panel_7.add(noLabel);
		noLabel.setText("No");

		rbAbletoMakeYes = new JRadioButton();
		rbAbletoMakeYes.setActionCommand("1");
		bgAbletoMake.add(rbAbletoMakeYes);
		rbAbletoMakeYes.setBackground(Color.WHITE);
		rbAbletoMakeYes.setBounds(200, 35, 21, 22);
		panel_7.add(rbAbletoMakeYes);
		rbAbletoMakeYes.setText("");

		rbAbletoMakeNo = new JRadioButton();
		rbAbletoMakeNo.setActionCommand("2");
		bgAbletoMake.add(rbAbletoMakeNo);
		rbAbletoMakeNo.setBackground(Color.WHITE);
		rbAbletoMakeNo.setBounds(252, 35, 21, 22);
		panel_7.add(rbAbletoMakeNo);
		rbAbletoMakeNo.setText("");

		rbCanSpeak = new JRadioButton();
		rbCanSpeak.setActionCommand("1");
		bgCanSpeak.add(rbCanSpeak);
		rbCanSpeak.setBackground(Color.WHITE);
		rbCanSpeak.setBounds(200, 55, 21, 22);
		panel_7.add(rbCanSpeak);
		rbCanSpeak.setText("");

		rbCanSpeakNo = new JRadioButton();
		rbCanSpeakNo.setActionCommand("2");
		bgCanSpeak.add(rbCanSpeakNo);
		rbCanSpeakNo.setBackground(Color.WHITE);
		rbCanSpeakNo.setBounds(252, 55, 21, 22);
		panel_7.add(rbCanSpeakNo);
		rbCanSpeakNo.setText("");

		rbCanHearYes = new JRadioButton();
		rbCanHearYes.setActionCommand("1");
		bgCanHear.add(rbCanHearYes);
		rbCanHearYes.setBackground(Color.WHITE);
		rbCanHearYes.setBounds(200, 75, 13, 22);
		panel_7.add(rbCanHearYes);
		rbCanHearYes.setText("New JRadioButton");

		rbCanHearNo = new JRadioButton();
		rbCanHearNo.setActionCommand("2");
		bgCanHear.add(rbCanHearNo);
		rbCanHearNo.setBackground(Color.WHITE);
		rbCanHearNo.setBounds(252, 77, 13, 22);
		panel_7.add(rbCanHearNo);
		rbCanHearNo.setText("New JRadioButton");

		rbCanWriteYes = new JRadioButton();
		rbCanWriteYes.setActionCommand("1");
		bgCanWrite.add(rbCanWriteYes);
		rbCanWriteYes.setBackground(Color.WHITE);
		rbCanWriteYes.setBounds(200, 95, 13, 18);
		panel_7.add(rbCanWriteYes);
		rbCanWriteYes.setText("New JRadioButton");

		rbCanWriteNo = new JRadioButton();
		rbCanWriteNo.setActionCommand("2");
		bgCanWrite.add(rbCanWriteNo);
		rbCanWriteNo.setBackground(Color.WHITE);
		rbCanWriteNo.setBounds(252, 95, 13, 22);
		panel_7.add(rbCanWriteNo);
		rbCanWriteNo.setText("New JRadioButton");

		rbUnderstandSpeakingYes = new JRadioButton();
		rbUnderstandSpeakingYes.setActionCommand("1");
		bgUnderstandSpeaking.add(rbUnderstandSpeakingYes);
		rbUnderstandSpeakingYes.setBackground(Color.WHITE);
		rbUnderstandSpeakingYes.setBounds(200, 115, 21, 22);
		panel_7.add(rbUnderstandSpeakingYes);
		rbUnderstandSpeakingYes.setText("");

		rbUnderstandSpeakingNo = new JRadioButton();
		rbUnderstandSpeakingNo.setActionCommand("2");
		bgUnderstandSpeaking.add(rbUnderstandSpeakingNo);
		rbUnderstandSpeakingNo.setBackground(Color.WHITE);
		rbUnderstandSpeakingNo.setBounds(252, 115, 20, 22);
		panel_7.add(rbUnderstandSpeakingNo);
		rbUnderstandSpeakingNo.setText("");

		rbUnderstandWritingYes = new JRadioButton();
		rbUnderstandWritingYes.setActionCommand("1");
		bgUnderstandWriting.add(rbUnderstandWritingYes);
		rbUnderstandWritingYes.setBackground(Color.WHITE);
		rbUnderstandWritingYes.setBounds(200, 135, 21, 22);
		panel_7.add(rbUnderstandWritingYes);
		rbUnderstandWritingYes.setText("");

		rbUnderstandWritingNo = new JRadioButton();
		rbUnderstandWritingNo.setActionCommand("2");
		bgUnderstandWriting.add(rbUnderstandWritingNo);
		rbUnderstandWritingNo.setBackground(Color.WHITE);
		rbUnderstandWritingNo.setBounds(252, 135, 21, 22);
		panel_7.add(rbUnderstandWritingNo);
		rbUnderstandWritingNo.setText("");

		rbUnderstandGesturesYes = new JRadioButton();
		rbUnderstandGesturesYes.setActionCommand("1");
		bgGestures.add(rbUnderstandGesturesYes);
		rbUnderstandGesturesYes.setBackground(Color.WHITE);
		rbUnderstandGesturesYes.setBounds(200, 155, 21, 22);
		panel_7.add(rbUnderstandGesturesYes);
		rbUnderstandGesturesYes.setText("");

		rbUnderstandGesturesNo = new JRadioButton();
		rbUnderstandGesturesNo.setActionCommand("2");
		bgGestures.add(rbUnderstandGesturesNo);
		rbUnderstandGesturesNo.setBackground(Color.WHITE);
		rbUnderstandGesturesNo.setBounds(252, 155, 21, 22);
		panel_7.add(rbUnderstandGesturesNo);
		rbUnderstandGesturesNo.setText("");

		rbUnderstandEnglishYes = new JRadioButton();
		rbUnderstandEnglishYes.setActionCommand("1");
		bgUnderstandEnglish.add(rbUnderstandEnglishYes);
		rbUnderstandEnglishYes.setBackground(Color.WHITE);
		rbUnderstandEnglishYes.setBounds(200, 175, 21, 22);
		panel_7.add(rbUnderstandEnglishYes);
		rbUnderstandEnglishYes.setText("");

		rbUnderstandEnglishNo = new JRadioButton();
		rbUnderstandEnglishNo.setActionCommand("2");
		bgUnderstandEnglish.add(rbUnderstandEnglishNo);
		rbUnderstandEnglishNo.setBackground(Color.WHITE);
		rbUnderstandEnglishNo.setBounds(252, 175, 21, 22);
		panel_7.add(rbUnderstandEnglishNo);
		rbUnderstandEnglishNo.setText("");

		txtIfYesLanguage = new JTextField();
		txtIfYesLanguage.setBounds(200, 197, 99, 18);
		panel_7.add(txtIfYesLanguage);

		final JPanel panel_4_3 = new JPanel();
		panel_4_3.setBackground(Color.WHITE);
		panel_4_3.setLayout(null);
		panel_4_3.setBounds(2, 167, 329, 86);
		panel.add(panel_4_3);

		final JPanel panel_5_3 = new JPanel();
		panel_5_3.setBackground(Color.WHITE);
		panel_5_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_3.setLayout(null);
		panel_5_3.setBounds(0, 0, 71, 87);
		panel_4_3.add(panel_5_3);

		final JLabel personalHygieneLabel_3 = new JLabel();
		personalHygieneLabel_3.setBackground(Color.WHITE);
		personalHygieneLabel_3.setText("Dressing");
		personalHygieneLabel_3.setBounds(0, 6, 71, 80);
		panel_5_3.add(personalHygieneLabel_3);

		final JPanel panel_6_3 = new JPanel();
		panel_6_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3.setLayout(null);
		panel_6_3.setBounds(70, 0, 41, 87);
		panel_4_3.add(panel_6_3);

		txtDressing1 = new JTextField();
		txtDressing1.setBounds(0, 0, 40, 21);
		panel_6_3.add(txtDressing1);

		txtDressing4 = new JTextField();
		txtDressing4.setBounds(0, 21, 40, 21);
		panel_6_3.add(txtDressing4);

		txtDressing7 = new JTextField();
		txtDressing7.setBounds(0, 42, 40, 21);
		panel_6_3.add(txtDressing7);

		txtDressing10 = new JTextField();
		txtDressing10.setBounds(0, 64, 40, 21);
		panel_6_3.add(txtDressing10);

		final JPanel panel_6_1_3 = new JPanel();
		panel_6_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_3.setLayout(null);
		panel_6_1_3.setBounds(109, 0, 41, 87);
		panel_4_3.add(panel_6_1_3);

		final JPanel panel_6_3_2 = new JPanel();
		panel_6_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3_2.setLayout(null);
		panel_6_3_2.setBounds(0, 0, 41, 87);
		panel_6_1_3.add(panel_6_3_2);

		txtDressing2 = new JTextField();
		txtDressing2.setBounds(0, 0, 40, 21);
		panel_6_3_2.add(txtDressing2);

		txtDressing5 = new JTextField();
		txtDressing5.setBounds(0, 21, 40, 21);
		panel_6_3_2.add(txtDressing5);

		txtDressing8 = new JTextField();
		txtDressing8.setBounds(0, 42, 40, 21);
		panel_6_3_2.add(txtDressing8);

		txtDressing11 = new JTextField();
		txtDressing11.setBounds(0, 64, 40, 21);
		panel_6_3_2.add(txtDressing11);

		final JPanel panel_6_2_3 = new JPanel();
		panel_6_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_3.setLayout(null);
		panel_6_2_3.setBounds(150, 0, 39, 87);
		panel_4_3.add(panel_6_2_3);

		txtDressing3 = new JTextField();
		txtDressing3.setBounds(-1, 0, 40, 21);
		panel_6_2_3.add(txtDressing3);

		txtDressing6 = new JTextField();
		txtDressing6.setBounds(-1, 22, 40, 21);
		panel_6_2_3.add(txtDressing6);

		txtDressing9 = new JTextField();
		txtDressing9.setBounds(-1, 43, 40, 21);
		panel_6_2_3.add(txtDressing9);

		txtDressing12 = new JTextField();
		txtDressing12.setBounds(-1, 64, 40, 21);
		panel_6_2_3.add(txtDressing12);

		final JLabel faceHairArmsLabel_2 = new JLabel();
		faceHairArmsLabel_2.setText("Upper Extremities");
		faceHairArmsLabel_2.setBounds(196, 0, 91, 14);
		panel_4_3.add(faceHairArmsLabel_2);

		final JLabel trunkPerineumLabel_2 = new JLabel();
		trunkPerineumLabel_2.setText("Trunk");
		trunkPerineumLabel_2.setBounds(196, 20, 122, 14);
		panel_4_3.add(trunkPerineumLabel_2);

		final JLabel lowerExtremitiesLabel_1 = new JLabel();
		lowerExtremitiesLabel_1.setText("Lower Extremities");
		lowerExtremitiesLabel_1.setBounds(196, 40, 121, 14);
		panel_4_3.add(lowerExtremitiesLabel_1);

		final JLabel bladderProgramLabel_2 = new JLabel();
		bladderProgramLabel_2.setText("Appliance, Splint");
		bladderProgramLabel_2.setBounds(197, 60, 102, 14);
		panel_4_3.add(bladderProgramLabel_2);

		final JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(2, 1264, 327, 35);
		panel.add(panel_20);

		final JLabel otherEquipmentLabel = new JLabel();
		otherEquipmentLabel.setText("OTHER EQUIPMENT");
		otherEquipmentLabel.setBounds(10, 10, 106, 14);
		panel_20.add(otherEquipmentLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBounds(339, 101, 578, 1307);
		add(panel_1);

		final JPanel panel_14 = new JPanel();
		panel_14.setBounds(288, 6, 1, 1);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_1.add(panel_14);

		final JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(2, 1, 329, 60);
		panel_14.add(panel_2_2);

		final JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(0, 3, 70, 57);
		panel_2_2.add(panel_3_2);

		final JLabel bedActivityLabel_2 = new JLabel();
		bedActivityLabel_2.setText("New JLabel");
		bedActivityLabel_2.setBounds(5, -5, 66, 59);
		panel_3_2.add(bedActivityLabel_2);

		final JLabel turnsLabel_2 = new JLabel();
		turnsLabel_2.setText("New JLabel");
		turnsLabel_2.setBounds(200, 3, 42, 14);
		panel_2_2.add(turnsLabel_2);

		final JLabel siteLabel_2 = new JLabel();
		siteLabel_2.setText("New JLabel");
		siteLabel_2.setBounds(202, 39, 27, 14);
		panel_2_2.add(siteLabel_2);

		final JPanel panel_8_3 = new JPanel();
		panel_8_3.setLayout(null);
		panel_8_3.setBounds(70, 0, 42, 60);
		panel_2_2.add(panel_8_3);

		final JTextField textField_4_4 = new JTextField();
		textField_4_4.setBounds(2, 3, 40, 31);
		panel_8_3.add(textField_4_4);

		final JTextField textField_4_1_3 = new JTextField();
		textField_4_1_3.setBounds(2, 34, 40, 25);
		panel_8_3.add(textField_4_1_3);

		final JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBounds(110, 0, 42, 60);
		panel_2_2.add(panel_8_1_1);

		final JTextField textField_4_2_1 = new JTextField();
		textField_4_2_1.setBounds(2, 3, 40, 31);
		panel_8_1_1.add(textField_4_2_1);

		final JTextField textField_4_1_1_1 = new JTextField();
		textField_4_1_1_1.setBounds(2, 34, 40, 25);
		panel_8_1_1.add(textField_4_1_1_1);

		final JPanel panel_8_2_1 = new JPanel();
		panel_8_2_1.setLayout(null);
		panel_8_2_1.setBounds(150, 0, 42, 60);
		panel_2_2.add(panel_8_2_1);

		final JTextField textField_4_3_1 = new JTextField();
		textField_4_3_1.setBounds(2, 3, 40, 31);
		panel_8_2_1.add(textField_4_3_1);

		final JTextField textField_4_1_2_1 = new JTextField();
		textField_4_1_2_1.setBounds(2, 34, 40, 25);
		panel_8_2_1.add(textField_4_1_2_1);

		final JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setBounds(2, 62, 329, 99);
		panel_14.add(panel_4_2);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2.setLayout(null);
		panel_5_2.setBounds(0, 0, 71, 117);
		panel_4_2.add(panel_5_2);

		final JLabel personalHygieneLabel_2 = new JLabel();
		personalHygieneLabel_2.setText("New JLabel");
		personalHygieneLabel_2.setBounds(0, 6, 71, 101);
		panel_5_2.add(personalHygieneLabel_2);

		final JPanel panel_6_7 = new JPanel();
		panel_6_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7.setLayout(null);
		panel_6_7.setBounds(71, 0, 41, 100);
		panel_4_2.add(panel_6_7);

		final JTextField textField_27 = new JTextField();
		textField_27.setBounds(0, 0, 40, 21);
		panel_6_7.add(textField_27);

		final JTextField textField_1_10 = new JTextField();
		textField_1_10.setBounds(0, 19, 40, 21);
		panel_6_7.add(textField_1_10);

		final JTextField textField_1_1_7 = new JTextField();
		textField_1_1_7.setBounds(0, 39, 40, 21);
		panel_6_7.add(textField_1_1_7);

		final JTextField textField_1_2_7 = new JTextField();
		textField_1_2_7.setBounds(0, 58, 40, 21);
		panel_6_7.add(textField_1_2_7);

		final JTextField textField_1_3_3 = new JTextField();
		textField_1_3_3.setBounds(0, 78, 40, 22);
		panel_6_7.add(textField_1_3_3);

		final JPanel panel_6_1_2 = new JPanel();
		panel_6_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2.setLayout(null);
		panel_6_1_2.setBounds(109, -2, 41, 100);
		panel_4_2.add(panel_6_1_2);

		final JTextField textField_2_2 = new JTextField();
		textField_2_2.setBounds(0, 0, 40, 21);
		panel_6_1_2.add(textField_2_2);

		final JTextField textField_1_4_2 = new JTextField();
		textField_1_4_2.setBounds(0, 20, 40, 21);
		panel_6_1_2.add(textField_1_4_2);

		final JTextField textField_1_1_1_2 = new JTextField();
		textField_1_1_1_2.setBounds(0, 39, 40, 21);
		panel_6_1_2.add(textField_1_1_1_2);

		final JTextField textField_1_2_1_2 = new JTextField();
		textField_1_2_1_2.setBounds(0, 58, 40, 21);
		panel_6_1_2.add(textField_1_2_1_2);

		final JTextField textField_1_3_1_1 = new JTextField();
		textField_1_3_1_1.setBounds(0, 78, 40, 21);
		panel_6_1_2.add(textField_1_3_1_1);

		final JPanel panel_6_2_2 = new JPanel();
		panel_6_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_2.setLayout(null);
		panel_6_2_2.setBounds(150, -1, 41, 100);
		panel_4_2.add(panel_6_2_2);

		final JTextField textField_3_2 = new JTextField();
		textField_3_2.setBounds(0, 0, 40, 21);
		panel_6_2_2.add(textField_3_2);

		final JTextField textField_1_5_2 = new JTextField();
		textField_1_5_2.setBounds(0, 20, 40, 21);
		panel_6_2_2.add(textField_1_5_2);

		final JTextField textField_1_1_2_2 = new JTextField();
		textField_1_1_2_2.setBounds(0, 39, 40, 21);
		panel_6_2_2.add(textField_1_1_2_2);

		final JTextField textField_1_2_2_2 = new JTextField();
		textField_1_2_2_2.setBounds(0, 58, 40, 21);
		panel_6_2_2.add(textField_1_2_2_2);

		final JTextField textField_1_3_2_1 = new JTextField();
		textField_1_3_2_1.setBounds(0, 78, 40, 21);
		panel_6_2_2.add(textField_1_3_2_1);

		final JLabel faceHairArmsLabel_1 = new JLabel();
		faceHairArmsLabel_1.setText("New JLabel");
		faceHairArmsLabel_1.setBounds(196, 0, 91, 14);
		panel_4_2.add(faceHairArmsLabel_1);

		final JLabel trunkPerineumLabel_1 = new JLabel();
		trunkPerineumLabel_1.setText("New JLabel");
		trunkPerineumLabel_1.setBounds(196, 20, 122, 14);
		panel_4_2.add(trunkPerineumLabel_1);

		final JLabel lowerExtremitiesLabel_2 = new JLabel();
		lowerExtremitiesLabel_2.setText("New JLabel");
		lowerExtremitiesLabel_2.setBounds(196, 40, 121, 14);
		panel_4_2.add(lowerExtremitiesLabel_2);

		final JLabel bladderProgramLabel_1 = new JLabel();
		bladderProgramLabel_1.setText("New JLabel");
		bladderProgramLabel_1.setBounds(197, 60, 102, 14);
		panel_4_2.add(bladderProgramLabel_1);

		final JLabel bowelProgramLabel_1 = new JLabel();
		bowelProgramLabel_1.setText("New JLabel");
		bowelProgramLabel_1.setBounds(197, 80, 90, 14);
		panel_4_2.add(bowelProgramLabel_1);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(2, 161, 72, 79);
		panel_14.add(panel_7_1);

		final JLabel dressingLabel_1 = new JLabel();
		dressingLabel_1.setText("New JLabel");
		dressingLabel_1.setBounds(8, 27, 41, 14);
		panel_7_1.add(dressingLabel_1);

		final JPanel panel_6_3_1 = new JPanel();
		panel_6_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3_1.setLayout(null);
		panel_6_3_1.setBounds(72, 161, 41, 78);
		panel_14.add(panel_6_3_1);

		final JTextField textField_5_1 = new JTextField();
		textField_5_1.setBounds(0, 0, 40, 21);
		panel_6_3_1.add(textField_5_1);

		final JTextField textField_1_6_1 = new JTextField();
		textField_1_6_1.setBounds(0, 20, 40, 21);
		panel_6_3_1.add(textField_1_6_1);

		final JTextField textField_1_1_3_1 = new JTextField();
		textField_1_1_3_1.setBounds(0, 39, 40, 21);
		panel_6_3_1.add(textField_1_1_3_1);

		final JTextField textField_1_2_3_1 = new JTextField();
		textField_1_2_3_1.setBounds(0, 58, 40, 21);
		panel_6_3_1.add(textField_1_2_3_1);

		final JPanel panel_6_4_1 = new JPanel();
		panel_6_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1.setLayout(null);
		panel_6_4_1.setBounds(109, 161, 41, 77);
		panel_14.add(panel_6_4_1);

		final JTextField textField_6_1 = new JTextField();
		textField_6_1.setBounds(0, 0, 40, 21);
		panel_6_4_1.add(textField_6_1);

		final JTextField textField_1_7_1 = new JTextField();
		textField_1_7_1.setBounds(0, 20, 40, 21);
		panel_6_4_1.add(textField_1_7_1);

		final JTextField textField_1_1_4_1 = new JTextField();
		textField_1_1_4_1.setBounds(0, 39, 40, 21);
		panel_6_4_1.add(textField_1_1_4_1);

		final JTextField textField_1_2_4_1 = new JTextField();
		textField_1_2_4_1.setBounds(0, 58, 40, 20);
		panel_6_4_1.add(textField_1_2_4_1);

		final JPanel panel_6_5_1 = new JPanel();
		panel_6_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1.setLayout(null);
		panel_6_5_1.setBounds(150, 160, 41, 78);
		panel_14.add(panel_6_5_1);

		final JTextField textField_7_1 = new JTextField();
		textField_7_1.setBounds(0, 0, 40, 21);
		panel_6_5_1.add(textField_7_1);

		final JTextField textField_1_8_1 = new JTextField();
		textField_1_8_1.setBounds(0, 20, 40, 21);
		panel_6_5_1.add(textField_1_8_1);

		final JTextField textField_1_1_5_1 = new JTextField();
		textField_1_1_5_1.setBounds(0, 39, 40, 21);
		panel_6_5_1.add(textField_1_1_5_1);

		final JTextField textField_1_2_5_1 = new JTextField();
		textField_1_2_5_1.setBounds(0, 58, 40, 21);
		panel_6_5_1.add(textField_1_2_5_1);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1.setLayout(null);
		panel_9_1.setBounds(2, 239, 330, 20);
		panel_14.add(panel_9_1);

		final JLabel feedingLabel_1 = new JLabel();
		feedingLabel_1.setText("New JLabel");
		feedingLabel_1.setBounds(10, 5, 54, 14);
		panel_9_1.add(feedingLabel_1);

		final JTextField textField_8_2 = new JTextField();
		textField_8_2.setBounds(70, 2, 42, 21);
		panel_9_1.add(textField_8_2);

		final JTextField textField_8_1_2 = new JTextField();
		textField_8_1_2.setBounds(111, 0, 37, 21);
		panel_9_1.add(textField_8_1_2);

		final JTextField textField_8_1_1_1 = new JTextField();
		textField_8_1_1_1.setBounds(147, 0, 43, 21);
		panel_9_1.add(textField_8_1_1_1);

		final JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(2, 258, 329, 79);
		panel_14.add(panel_4_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBounds(0, 0, 71, 78);
		panel_4_1_1.add(panel_5_1_1);

		final JLabel personalHygieneLabel_1_1 = new JLabel();
		personalHygieneLabel_1_1.setText("New JLabel");
		personalHygieneLabel_1_1.setBounds(0, 6, 71, 77);
		panel_5_1_1.add(personalHygieneLabel_1_1);

		final JPanel panel_6_6_1 = new JPanel();
		panel_6_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6_1.setLayout(null);
		panel_6_6_1.setBounds(71, 0, 41, 78);
		panel_4_1_1.add(panel_6_6_1);

		final JTextField textField_9_1 = new JTextField();
		textField_9_1.setBounds(0, 2, 40, 19);
		panel_6_6_1.add(textField_9_1);

		final JTextField textField_1_9_1 = new JTextField();
		textField_1_9_1.setBounds(0, 19, 40, 21);
		panel_6_6_1.add(textField_1_9_1);

		final JTextField textField_1_1_6_1 = new JTextField();
		textField_1_1_6_1.setBounds(0, 39, 40, 21);
		panel_6_6_1.add(textField_1_1_6_1);

		final JTextField textField_1_2_6_1 = new JTextField();
		textField_1_2_6_1.setBounds(0, 58, 40, 21);
		panel_6_6_1.add(textField_1_2_6_1);

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(109, -2, 41, 78);
		panel_4_1_1.add(panel_6_1_1_1);

		final JTextField textField_2_1_1 = new JTextField();
		textField_2_1_1.setBounds(0, 0, 40, 21);
		panel_6_1_1_1.add(textField_2_1_1);

		final JTextField textField_1_4_1_1 = new JTextField();
		textField_1_4_1_1.setBounds(0, 20, 40, 21);
		panel_6_1_1_1.add(textField_1_4_1_1);

		final JTextField textField_1_1_1_1_1 = new JTextField();
		textField_1_1_1_1_1.setBounds(0, 39, 40, 21);
		panel_6_1_1_1.add(textField_1_1_1_1_1);

		final JTextField textField_1_2_1_1_1 = new JTextField();
		textField_1_2_1_1_1.setBounds(0, 58, 40, 21);
		panel_6_1_1_1.add(textField_1_2_1_1_1);

		final JPanel panel_6_2_1_1 = new JPanel();
		panel_6_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_1_1.setLayout(null);
		panel_6_2_1_1.setBounds(150, -1, 41, 78);
		panel_4_1_1.add(panel_6_2_1_1);

		final JTextField textField_3_1_1 = new JTextField();
		textField_3_1_1.setBounds(0, 0, 40, 21);
		panel_6_2_1_1.add(textField_3_1_1);

		final JTextField textField_1_5_1_1 = new JTextField();
		textField_1_5_1_1.setBounds(0, 20, 40, 21);
		panel_6_2_1_1.add(textField_1_5_1_1);

		final JTextField textField_1_1_2_1_1 = new JTextField();
		textField_1_1_2_1_1.setBounds(0, 39, 40, 21);
		panel_6_2_1_1.add(textField_1_1_2_1_1);

		final JTextField textField_1_2_2_1_1 = new JTextField();
		textField_1_2_2_1_1.setBounds(0, 58, 40, 21);
		panel_6_2_1_1.add(textField_1_2_2_1_1);

		final JLabel sittingLabel_1 = new JLabel();
		sittingLabel_1.setText("New JLabel");
		sittingLabel_1.setBounds(197, 1, 122, 14);
		panel_4_1_1.add(sittingLabel_1);

		final JLabel standingLabel_1 = new JLabel();
		standingLabel_1.setText("New JLabel");
		standingLabel_1.setBounds(197, 21, 54, 14);
		panel_4_1_1.add(standingLabel_1);

		final JLabel tubLabel_1 = new JLabel();
		tubLabel_1.setText("New JLabel");
		tubLabel_1.setBounds(197, 41, 41, 14);
		panel_4_1_1.add(tubLabel_1);

		final JLabel toiletLabel_1 = new JLabel();
		toiletLabel_1.setText("New JLabel");
		toiletLabel_1.setBounds(197, 61, 54, 14);
		panel_4_1_1.add(toiletLabel_1);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(0, 333, 332, 84);
		panel_14.add(panel_2_1_1);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(0, 3, 70, 78);
		panel_2_1_1.add(panel_3_1_1);

		final JLabel bedActivityLabel_1_1 = new JLabel();
		bedActivityLabel_1_1.setText("New JLabel");
		bedActivityLabel_1_1.setBounds(5, -1, 55, 69);
		panel_3_1_1.add(bedActivityLabel_1_1);

		final JLabel turnsLabel_1_1 = new JLabel();
		turnsLabel_1_1.setText("New JLabel");
		turnsLabel_1_1.setBounds(200, 3, 70, 14);
		panel_2_1_1.add(turnsLabel_1_1);

		final JLabel siteLabel_1_1 = new JLabel();
		siteLabel_1_1.setText("New JLabel");
		siteLabel_1_1.setBounds(202, 39, 27, 14);
		panel_2_1_1.add(siteLabel_1_1);

		final JLabel walkingLabel_1 = new JLabel();
		walkingLabel_1.setText("New JLabel");
		walkingLabel_1.setBounds(200, 19, 54, 14);
		panel_2_1_1.add(walkingLabel_1);

		final JPanel panel_10_3 = new JPanel();
		panel_10_3.setLayout(null);
		panel_10_3.setBounds(149, 3, 40, 78);
		panel_2_1_1.add(panel_10_3);

		final JTextField textField_10_4 = new JTextField();
		textField_10_4.setBounds(0, 0, 40, 26);
		panel_10_3.add(textField_10_4);

		final JTextField textField_10_1_4 = new JTextField();
		textField_10_1_4.setBounds(0, 25, 40, 26);
		panel_10_3.add(textField_10_1_4);

		final JTextField textField_10_1_1_3 = new JTextField();
		textField_10_1_1_3.setBounds(0, 50, 40, 26);
		panel_10_3.add(textField_10_1_1_3);

		final JPanel panel_10_1_1 = new JPanel();
		panel_10_1_1.setLayout(null);
		panel_10_1_1.setBounds(69, 3, 40, 78);
		panel_2_1_1.add(panel_10_1_1);

		final JTextField textField_10_2_1 = new JTextField();
		textField_10_2_1.setBounds(0, 0, 40, 26);
		panel_10_1_1.add(textField_10_2_1);

		final JTextField textField_10_1_2_1 = new JTextField();
		textField_10_1_2_1.setBounds(0, 25, 40, 26);
		panel_10_1_1.add(textField_10_1_2_1);

		final JTextField textField_10_1_1_1_1 = new JTextField();
		textField_10_1_1_1_1.setBounds(0, 50, 40, 26);
		panel_10_1_1.add(textField_10_1_1_1_1);

		final JPanel panel_10_2_1 = new JPanel();
		panel_10_2_1.setLayout(null);
		panel_10_2_1.setBounds(108, 3, 40, 78);
		panel_2_1_1.add(panel_10_2_1);

		final JTextField textField_10_3_1 = new JTextField();
		textField_10_3_1.setBounds(0, 0, 40, 26);
		panel_10_2_1.add(textField_10_3_1);

		final JTextField textField_10_1_3_1 = new JTextField();
		textField_10_1_3_1.setBounds(0, 25, 40, 26);
		panel_10_2_1.add(textField_10_1_3_1);

		final JTextField textField_10_1_1_2_1 = new JTextField();
		textField_10_1_1_2_1.setBounds(0, 50, 40, 26);
		panel_10_2_1.add(textField_10_1_1_2_1);

		final JLabel upperExtremitiesLabel_1 = new JLabel();
		upperExtremitiesLabel_1.setText("New JLabel");
		upperExtremitiesLabel_1.setBounds(197, 162, 95, 14);
		panel_14.add(upperExtremitiesLabel_1);

		final JLabel trunkLabel_1 = new JLabel();
		trunkLabel_1.setText("New JLabel");
		trunkLabel_1.setBounds(197, 182, 41, 14);
		panel_14.add(trunkLabel_1);

		final JLabel lowerExtremitiesLabel_1_1 = new JLabel();
		lowerExtremitiesLabel_1_1.setText("New JLabel");
		lowerExtremitiesLabel_1_1.setBounds(197, 202, 95, 14);
		panel_14.add(lowerExtremitiesLabel_1_1);

		final JLabel applianceSplintLabel_1 = new JLabel();
		applianceSplintLabel_1.setText("New JLabel");
		applianceSplintLabel_1.setBounds(197, 222, 95, 14);
		panel_14.add(applianceSplintLabel_1);

		final JPanel panel_11_1 = new JPanel();
		panel_11_1.setLayout(null);
		panel_11_1.setBounds(2, 421, 329, 60);
		panel_14.add(panel_11_1);

		final JLabel bedLowLabel_1 = new JLabel();
		bedLowLabel_1.setText("New JLabel");
		bedLowLabel_1.setBounds(0, 0, 49, 14);
		panel_11_1.add(bedLowLabel_1);

		final JTextField textField_11_1 = new JTextField();
		textField_11_1.setBounds(49, 1, 43, 16);
		panel_11_1.add(textField_11_1);

		final JLabel mattressLabel_1 = new JLabel();
		mattressLabel_1.setText("New JLabel");
		mattressLabel_1.setBounds(95, 1, 54, 14);
		panel_11_1.add(mattressLabel_1);

		final JLabel firmLabel_1 = new JLabel();
		firmLabel_1.setText("New JLabel");
		firmLabel_1.setBounds(148, 0, 34, 14);
		panel_11_1.add(firmLabel_1);

		final JTextField textField_12_1 = new JTextField();
		textField_12_1.setBounds(172, 0, 59, 18);
		panel_11_1.add(textField_12_1);

		final JLabel regLabel_1 = new JLabel();
		regLabel_1.setText("New JLabel");
		regLabel_1.setBounds(235, 1, 34, 14);
		panel_11_1.add(regLabel_1);

		final JTextField textField_13_1 = new JTextField();
		textField_13_1.setBounds(263, 0, 53, 18);
		panel_11_1.add(textField_13_1);

		final JLabel otherLabel_1 = new JLabel();
		otherLabel_1.setText("New JLabel");
		otherLabel_1.setBounds(0, 20, 34, 14);
		panel_11_1.add(otherLabel_1);

		final JTextField textField_14_1 = new JTextField();
		textField_14_1.setBounds(49, 20, 267, 18);
		panel_11_1.add(textField_14_1);

		final JLabel sideRailsLabel_1 = new JLabel();
		sideRailsLabel_1.setText("New JLabel");
		sideRailsLabel_1.setBounds(0, 40, 54, 14);
		panel_11_1.add(sideRailsLabel_1);

		final JRadioButton yesRadioButton_1 = new JRadioButton();
		yesRadioButton_1.setText("New JRadioButton");
		yesRadioButton_1.setBounds(49, 41, 49, 13);
		panel_11_1.add(yesRadioButton_1);

		final JRadioButton noRadioButton_1 = new JRadioButton();
		noRadioButton_1.setText("New JRadioButton");
		noRadioButton_1.setBounds(104, 39, 43, 17);
		panel_11_1.add(noRadioButton_1);

		final JPanel panel_12_1 = new JPanel();
		panel_12_1.setLayout(null);
		panel_12_1.setBounds(2, 483, 329, 112);
		panel_14.add(panel_12_1);

		final JLabel behaviorLabel_1 = new JLabel();
		behaviorLabel_1.setText("New JLabel");
		behaviorLabel_1.setBounds(4, 3, 61, 14);
		panel_12_1.add(behaviorLabel_1);

		final JLabel cooperativeLabel_1 = new JLabel();
		cooperativeLabel_1.setText("New JLabel");
		cooperativeLabel_1.setBounds(4, 23, 71, 14);
		panel_12_1.add(cooperativeLabel_1);

		final JTextField textField_15_1 = new JTextField();
		textField_15_1.setBounds(70, 21, 77, 18);
		panel_12_1.add(textField_15_1);

		final JLabel orientedXLabel_1 = new JLabel();
		orientedXLabel_1.setText("New JLabel");
		orientedXLabel_1.setBounds(150, 23, 61, 14);
		panel_12_1.add(orientedXLabel_1);

		final JTextField textField_16_1 = new JTextField();
		textField_16_1.setBounds(213, 21, 106, 18);
		panel_12_1.add(textField_16_1);

		final JLabel disruptiveLabel_1 = new JLabel();
		disruptiveLabel_1.setText("New JLabel");
		disruptiveLabel_1.setBounds(4, 43, 61, 14);
		panel_12_1.add(disruptiveLabel_1);

		final JTextField textField_17_1 = new JTextField();
		textField_17_1.setBounds(68, 43, 22, 18);
		panel_12_1.add(textField_17_1);

		final JLabel belligerentLabel_1 = new JLabel();
		belligerentLabel_1.setText("New JLabel");
		belligerentLabel_1.setBounds(96, 45, 54, 14);
		panel_12_1.add(belligerentLabel_1);

		final JTextField textField_18_1 = new JTextField();
		textField_18_1.setBounds(149, 43, 27, 18);
		panel_12_1.add(textField_18_1);

		final JLabel combativeLabel_1 = new JLabel();
		combativeLabel_1.setText("New JLabel");
		combativeLabel_1.setBounds(182, 43, 54, 14);
		panel_12_1.add(combativeLabel_1);

		final JTextField textField_19_1 = new JTextField();
		textField_19_1.setBounds(242, 43, 77, 18);
		panel_12_1.add(textField_19_1);

		final JLabel senileLabel_1 = new JLabel();
		senileLabel_1.setText("New JLabel");
		senileLabel_1.setBounds(4, 63, 28, 14);
		panel_12_1.add(senileLabel_1);

		final JTextField textField_20_1 = new JTextField();
		textField_20_1.setBounds(38, 61, 52, 18);
		panel_12_1.add(textField_20_1);

		final JLabel suspiciousLabel_1 = new JLabel();
		suspiciousLabel_1.setText("New JLabel");
		suspiciousLabel_1.setBounds(96, 64, 54, 14);
		panel_12_1.add(suspiciousLabel_1);

		final JTextField textField_21_1 = new JTextField();
		textField_21_1.setBounds(150, 64, 54, 18);
		panel_12_1.add(textField_21_1);

		final JLabel withdrawnLabel_1 = new JLabel();
		withdrawnLabel_1.setText("New JLabel");
		withdrawnLabel_1.setBounds(207, 63, 54, 14);
		panel_12_1.add(withdrawnLabel_1);

		final JTextField textField_22_1 = new JTextField();
		textField_22_1.setBounds(263, 61, 56, 18);
		panel_12_1.add(textField_22_1);

		final JLabel wandersLabel_1 = new JLabel();
		wandersLabel_1.setText("New JLabel");
		wandersLabel_1.setBounds(4, 83, 52, 14);
		panel_12_1.add(wandersLabel_1);

		final JTextField textField_23_1 = new JTextField();
		textField_23_1.setBounds(48, 85, 77, 18);
		panel_12_1.add(textField_23_1);

		final JPanel panel_13_1 = new JPanel();
		panel_13_1.setLayout(null);
		panel_13_1.setBounds(2, 601, 329, 45);
		panel_14.add(panel_13_1);

		final JLabel mentalStatusLabel_1 = new JLabel();
		mentalStatusLabel_1.setText("New JLabel");
		mentalStatusLabel_1.setBounds(2, 0, 94, 14);
		panel_13_1.add(mentalStatusLabel_1);

		final JLabel alertLabel_1 = new JLabel();
		alertLabel_1.setText("New JLabel");
		alertLabel_1.setBounds(2, 20, 31, 14);
		panel_13_1.add(alertLabel_1);

		final JTextField textField_24_1 = new JTextField();
		textField_24_1.setBounds(32, 20, 45, 18);
		panel_13_1.add(textField_24_1);

		final JLabel forgetfulLabel_1 = new JLabel();
		forgetfulLabel_1.setText("New JLabel");
		forgetfulLabel_1.setBounds(80, 20, 54, 14);
		panel_13_1.add(forgetfulLabel_1);

		final JTextField textField_25_1 = new JTextField();
		textField_25_1.setBounds(126, 18, 45, 18);
		panel_13_1.add(textField_25_1);

		final JLabel confusedLabel_1 = new JLabel();
		confusedLabel_1.setText("New JLabel");
		confusedLabel_1.setBounds(179, 20, 54, 14);
		panel_13_1.add(confusedLabel_1);

		final JTextField textField_26_1 = new JTextField();
		textField_26_1.setBounds(229, 18, 77, 18);
		panel_13_1.add(textField_26_1);

		final JLabel communicationAbilityLabel_1 = new JLabel();
		communicationAbilityLabel_1.setText("New JLabel");
		communicationAbilityLabel_1.setBounds(2, 652, 148, 20);
		panel_14.add(communicationAbilityLabel_1);

		final JLabel yesLabel_1 = new JLabel();
		yesLabel_1.setText("New JLabel");
		yesLabel_1.setBounds(184, 655, 33, 14);
		panel_14.add(yesLabel_1);

		final JLabel noLabel_1 = new JLabel();
		noLabel_1.setText("New JLabel");
		noLabel_1.setBounds(257, 655, 33, 14);
		panel_14.add(noLabel_1);

		final JLabel ableToMakeLabel_1 = new JLabel();
		ableToMakeLabel_1.setText("New JLabel");
		ableToMakeLabel_1.setBounds(2, 674, 148, 14);
		panel_14.add(ableToMakeLabel_1);

		final JRadioButton radioButton_4 = new JRadioButton();
		radioButton_4.setText("New JRadioButton");
		radioButton_4.setBounds(179, 670, 21, 22);
		panel_14.add(radioButton_4);

		final JRadioButton radioButton_1_1 = new JRadioButton();
		radioButton_1_1.setText("New JRadioButton");
		radioButton_1_1.setBounds(257, 670, 21, 22);
		panel_14.add(radioButton_1_1);

		final JLabel canSpeakLabel_1 = new JLabel();
		canSpeakLabel_1.setText("New JLabel");
		canSpeakLabel_1.setBounds(2, 694, 54, 14);
		panel_14.add(canSpeakLabel_1);

		final JRadioButton radioButton_2_3 = new JRadioButton();
		radioButton_2_3.setText("New JRadioButton");
		radioButton_2_3.setBounds(179, 690, 21, 22);
		panel_14.add(radioButton_2_3);

		final JRadioButton radioButton_3_1 = new JRadioButton();
		radioButton_3_1.setText("New JRadioButton");
		radioButton_3_1.setBounds(257, 690, 21, 22);
		panel_14.add(radioButton_3_1);

		final JLabel canHearLabel_1 = new JLabel();
		canHearLabel_1.setText("New JLabel");
		canHearLabel_1.setBounds(2, 714, 54, 14);
		panel_14.add(canHearLabel_1);

		final JRadioButton radioButton_2_1_2 = new JRadioButton();
		radioButton_2_1_2.setText("New JRadioButton");
		radioButton_2_1_2.setBounds(181, 710, 21, 22);
		panel_14.add(radioButton_2_1_2);

		final JRadioButton radioButton_2_2_1 = new JRadioButton();
		radioButton_2_2_1.setText("New JRadioButton");
		radioButton_2_2_1.setBounds(257, 713, 21, 22);
		panel_14.add(radioButton_2_2_1);

		final JLabel canWriteLabel_1 = new JLabel();
		canWriteLabel_1.setText("New JLabel");
		canWriteLabel_1.setBounds(2, 734, 54, 14);
		panel_14.add(canWriteLabel_1);

		final JRadioButton radioButton_2_1_1_1 = new JRadioButton();
		radioButton_2_1_1_1.setText("New JRadioButton");
		radioButton_2_1_1_1.setBounds(179, 738, 21, 22);
		panel_14.add(radioButton_2_1_1_1);

		final JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setBounds(43, 31, 452, 69);
		panel_1.add(panel_17);

		final JLabel additionalPertinentInformationLabel = new JLabel();
		additionalPertinentInformationLabel
				.setText("ADDITIONAL PERTINENT INFORMATION");
		additionalPertinentInformationLabel.setBounds(77, 0, 205, 26);
		panel_17.add(additionalPertinentInformationLabel);

		final JLabel explainNecessaryDetailsLabel = new JLabel();
		explainNecessaryDetailsLabel
				.setText("(Explain necessary details of care,medications, treatments,prognosis, teaching, habits,");
		explainNecessaryDetailsLabel.setBounds(10, 25, 432, 26);
		panel_17.add(explainNecessaryDetailsLabel);

		final JLabel preferencesEtcTherapistsLabel = new JLabel();
		preferencesEtcTherapistsLabel
				.setText("preferences, etc. Therapists and social workers add signature and title to notes.)");
		preferencesEtcTherapistsLabel.setBounds(39, 48, 403, 14);
		panel_17.add(preferencesEtcTherapistsLabel);

		final JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.WHITE);
		panel_18.setLayout(null);
		panel_18.setBounds(0, 956, 577, 351);
		panel_1.add(panel_18);

		final JLabel socialInformationLabel = new JLabel();
		socialInformationLabel.setText("SOCIAL INFORMATION");
		socialInformationLabel.setBounds(80, 10, 118, 14);
		panel_18.add(socialInformationLabel);

		final JLabel adjustmentToDisabilityLabel = new JLabel();
		adjustmentToDisabilityLabel
				.setText("(Adjustment to disability, emotional support from family, motivation for");
		adjustmentToDisabilityLabel.setBounds(198, 10, 370, 14);
		panel_18.add(adjustmentToDisabilityLabel);

		final JLabel selfCareSocializingLabel = new JLabel();
		selfCareSocializingLabel
				.setText("self care, socializing ability, financial plan, family health problem etc.)");
		selfCareSocializingLabel.setBounds(154, 27, 381, 14);
		panel_18.add(selfCareSocializingLabel);

		final JTextField txtSocialInformation = new JTextField();
		txtSocialInformation.setBounds(0, 53, 577, 298);
		panel_18.add(txtSocialInformation);

		final JTextField txtAdditionalPertinent = new JTextField();
		txtAdditionalPertinent.setBounds(0, 106, 577, 846);
		panel_1.add(txtAdditionalPertinent);

		final JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setBackground(Color.WHITE);
		panel_19.setLayout(null);
		panel_19.setBounds(74, 0, 39, 104);
		add(panel_19);

		final JLabel independentLabel = new JLabel();
		independentLabel.setBorder(new LineBorder(Color.black, 1, false));
		independentLabel.setFont(new Font("", Font.BOLD, 8));
		independentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		independentLabel.setVerticalTextPosition(SwingConstants.CENTER);
		independentLabel
				.setText("<html><body><br>i<br>n<br>d<br>e<br>p<br>e<br>n<br>d<br>e<br>n<br>t");
		independentLabel.setBounds(0, 0, 39, 105);
		panel_19.add(independentLabel);

		final JPanel panel_19_1 = new JPanel();
		panel_19_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_19_1.setBackground(Color.WHITE);
		panel_19_1.setLayout(null);
		panel_19_1.setBounds(112, 0, 41, 104);
		add(panel_19_1);

		final JLabel needsAssistanceLabel = new JLabel();
		needsAssistanceLabel.setBackground(Color.WHITE);
		needsAssistanceLabel.setFont(new Font("", Font.BOLD, 8));
		needsAssistanceLabel
				.setText("<html><body><br>N<br>e<br>e<br>d<br>s<br> A<br>s<br>s<br>i<br>s<br>t<br>a<br>n<br>c<br>e<br></body><html>");
		needsAssistanceLabel.setBounds(10, 0, 18, 104);
		panel_19_1.add(needsAssistanceLabel);

		final JPanel panel_19_2 = new JPanel();
		panel_19_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_19_2.setBackground(Color.WHITE);
		panel_19_2.setFont(new Font("", Font.PLAIN, 8));
		panel_19_2.setLayout(null);
		panel_19_2.setBounds(152, 0, 41, 104);
		add(panel_19_2);

		final JLabel unableToDoLabel = new JLabel();
		unableToDoLabel.setBackground(Color.WHITE);
		unableToDoLabel.setFont(new Font("", Font.BOLD, 8));
		unableToDoLabel
				.setText("<html><body><br>U<br>n<br>a<br>b<br>l<br>e<br> t<br>o<br> D<br>o<br>");
		unableToDoLabel.setBounds(11, 0, 20, 104);
		panel_19_2.add(unableToDoLabel);
	}

	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PanelResidentInformation panelResidentInformation = new PanelResidentInformation();
		JFrame f = SwingUtils.wrapInFrame(panelResidentInformation);
		f.setVisible(true);
	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {

		ResidentInformation refResidentInformation = new ResidentInformation();

		refResidentInformation.setResidentId(Global.currentResidenceKey);
		refResidentInformation.setSerial(Global.currentResidentInformationKey);
		refResidentInformation.setFormId(Global.currentMsjnKey);
		refResidentInformation.setUnderstandEnglish(SwingUtils
				.getSelectedButton(bgUnderstandEnglish));
		refResidentInformation.setGestures(SwingUtils
				.getSelectedButton(bgGestures));
		refResidentInformation.setUnderstandWriting(SwingUtils
				.getSelectedButton(bgUnderstandWriting));
		refResidentInformation.setUnderstandSpeaking(SwingUtils
				.getSelectedButton(bgUnderstandSpeaking));
		refResidentInformation.setCanWrite(SwingUtils
				.getSelectedButton(bgCanWrite));
		refResidentInformation.setCanHear(SwingUtils
				.getSelectedButton(bgCanHear));
		refResidentInformation.setCanSpeak(SwingUtils
				.getSelectedButton(bgCanSpeak));
		refResidentInformation.setAbletoMake(SwingUtils
				.getSelectedButton(bgAbletoMake));
		refResidentInformation.setSideRails(SwingUtils
				.getSelectedButton(bgSideRails));
		refResidentInformation.setBadActivity1(txtBadActivity1.getText());
		refResidentInformation.setBadActivity4(txtBadActivity4.getText());
		refResidentInformation.setBadActivity2(txtBadActivity2.getText());
		refResidentInformation.setBadActivity5(txtBadActivity5.getText());
		refResidentInformation.setBadActivity3(txtBadActivity3.getText());
		refResidentInformation.setBadActivity6(txtBadActivity6.getText());
		refResidentInformation.setPersonalHygiene1(txtPersonalHygiene1
				.getText());
		refResidentInformation.setPersonalHygiene4(txtPersonalHygiene4
				.getText());
		refResidentInformation.setPersonalHygiene7(txtPersonalHygiene7
				.getText());
		refResidentInformation.setPersonalHygiene10(txtPersonalHygiene10
				.getText());
		refResidentInformation.setPersonalHygiene13(txtPersonalHygiene13
				.getText());
		refResidentInformation.setPersonalHygiene2(txtPersonalHygiene2
				.getText());
		refResidentInformation.setPersonalHygiene5(txtPersonalHygiene5
				.getText());
		refResidentInformation.setPersonalHygiene8(txtPersonalHygiene8
				.getText());
		refResidentInformation.setPersonalHygiene11(txtPersonalHygiene11
				.getText());
		refResidentInformation.setPersonalHygiene14(txtPersonalHygiene14
				.getText());
		refResidentInformation.setPersonalHygiene3(txtPersonalHygiene3
				.getText());
		refResidentInformation.setPersonalHygiene6(txtPersonalHygiene6
				.getText());
		refResidentInformation.setPersonalHygiene9(txtPersonalHygiene9
				.getText());
		refResidentInformation.setPersonalHygiene12(txtPersonalHygiene12
				.getText());
		refResidentInformation.setPersonalHygiene15(txtPersonalHygiene15
				.getText());
		refResidentInformation.setFeeding1(txtFeeding1.getText());
		refResidentInformation.setFeeding2(txtFeeding2.getText());
		refResidentInformation.setFeeding3(txtFeeding3.getText());
		refResidentInformation.setTranfer1(txtTranfer1.getText());
		refResidentInformation.setTranfer4(txtTranfer4.getText());
		refResidentInformation.setTranfer7(txtTranfer7.getText());
		refResidentInformation.setTranfer10(txtTranfer10.getText());
		refResidentInformation.setTranfer2(txtTranfer2.getText());
		refResidentInformation.setTranfer5(txtTranfer5.getText());
		refResidentInformation.setTranfer8(txtTranfer8.getText());
		refResidentInformation.setTranfer11(txtTranfer11.getText());
		refResidentInformation.setTranfer3(txtTranfer3.getText());
		refResidentInformation.setTranfer6(txtTranfer6.getText());
		refResidentInformation.setTranfer9(txtTranfer9.getText());
		refResidentInformation.setTranfer12(txtTranfer12.getText());
		refResidentInformation.setLocomotion3(txtLocomotion3.getText());
		refResidentInformation.setLocomotion6(txtLocomotion6.getText());
		refResidentInformation.setLocomotion9(txtLocomotion9.getText());
		refResidentInformation.setLocomotion1(txtLocomotion1.getText());
		refResidentInformation.setLocomotion4(txtLocomotion4.getText());
		refResidentInformation.setLocomotion7(txtLocomotion7.getText());
		refResidentInformation.setLocomotion2(txtLocomotion2.getText());
		refResidentInformation.setLocomotion5(txtLocomotion5.getText());
		refResidentInformation.setLocomotion8(txtLocomotion8.getText());
		refResidentInformation.setBedLow(txtBedLow.getText());
		refResidentInformation.setMattressFirm(txtMattressFirm.getText());
		refResidentInformation.setReg(txtReg.getText());
		refResidentInformation.setOtherReg(txtOtherReg.getText());
		refResidentInformation.setCooperative(txtCooperative.getText());
		refResidentInformation.setOrientedX(txtOrientedX.getText());
		refResidentInformation.setDisruptive(txtDisruptive.getText());
		refResidentInformation.setBelligerent(txtBelligerent.getText());
		refResidentInformation.setCombative(txtCombative.getText());
		refResidentInformation.setSenile(txtSenile.getText());
		refResidentInformation.setSuspicious(txtSuspicious.getText());
		refResidentInformation.setWithdrawn(txtWithdrawn.getText());
		refResidentInformation.setWanders(txtWanders.getText());
		refResidentInformation.setAlert(txtAlert.getText());
		refResidentInformation.setForgetful(txtForgetful.getText());
		refResidentInformation.setConfused(txtConfused.getText());
		refResidentInformation.setRegular(txtRegular.getText());
		refResidentInformation.setLowSalt(txtLowSalt.getText());
		refResidentInformation.setDiabetic(txtDiabetic.getText());
		refResidentInformation.setBland(txtBland.getText());
		refResidentInformation.setLowResidue(txtLowResidue.getText());
		refResidentInformation.setOtherDiet(txtOtherDiet.getText());
		refResidentInformation.setFeedSelf(txtFeedSelf.getText());
		refResidentInformation.setNeedsHelp(txtNeedsHelp.getText());
		refResidentInformation.setPart(txtPart.getText());
		refResidentInformation.setDietAll(txtDietAll.getText());
		refResidentInformation.setAppliance(txtAppliance.getText());
		refResidentInformation.setCatheter(txtCatheter.getText());
		refResidentInformation.setColostomy(txtColostomy.getText());
		refResidentInformation.setCane(txtCane.getText());
		refResidentInformation.setCrutches(txtCrutches.getText());
		refResidentInformation.setProsthesis(txtProsthesis.getText());
		refResidentInformation.setWalker(txtWalker.getText());
		refResidentInformation.setChair(txtChair.getText());
		refResidentInformation.setHearingR(txtHearingR.getText());
		refResidentInformation.setHearingL(txtHearingL.getText());
		refResidentInformation.setDenturesUpper(txtDenturesUpper.getText());
		refResidentInformation.setLower(txtLower.getText());
		refResidentInformation.setGlassess(txtGlassess.getText());
		refResidentInformation.setIfYesLanguage(txtIfYesLanguage.getText());
		refResidentInformation.setDressing1(txtDressing1.getText());
		refResidentInformation.setDressing4(txtDressing4.getText());
		refResidentInformation.setDressing7(txtDressing7.getText());
		refResidentInformation.setDressing10(txtDressing10.getText());
		refResidentInformation.setDressing2(txtDressing2.getText());
		refResidentInformation.setDressing5(txtDressing5.getText());
		refResidentInformation.setDressing8(txtDressing8.getText());
		refResidentInformation.setDressing11(txtDressing11.getText());
		refResidentInformation.setDressing3(txtDressing3.getText());
		refResidentInformation.setDressing6(txtDressing6.getText());
		refResidentInformation.setDressing9(txtDressing9.getText());
		refResidentInformation.setDressing12(txtDressing12.getText());
		// refResidentInformation.setSocialInformation(txtSocialInformation.getText());
		// refResidentInformation.setAdditionalPertinent(txtAdditionalPertinent.getText());
		try {
			Global.currentResidentInformationKey = MedrexClientManager
					.getInstance().insertOrUpdateResidentInformation(
							refResidentInformation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Global.currentResidentInformationKey;
	}

	public void doUpdate() {
		ResidentInformation refResidentInformation = null;
		if (Global.currentMsjnKey != 0) {
			try {
				refResidentInformation = MedrexClientManager.getInstance()
						.getResidentInformation(Global.currentMsjnKey);
				Global.currentResidentInformationKey = refResidentInformation
						.getSerial();
				SwingUtils.setSelectedButton(bgUnderstandEnglish,
						refResidentInformation.getUnderstandEnglish());
				SwingUtils.setSelectedButton(bgGestures, refResidentInformation
						.getGestures());
				SwingUtils.setSelectedButton(bgUnderstandWriting,
						refResidentInformation.getUnderstandWriting());
				SwingUtils.setSelectedButton(bgUnderstandSpeaking,
						refResidentInformation.getUnderstandSpeaking());
				SwingUtils.setSelectedButton(bgCanWrite, refResidentInformation
						.getCanWrite());
				SwingUtils.setSelectedButton(bgCanHear, refResidentInformation
						.getCanHear());
				SwingUtils.setSelectedButton(bgCanSpeak, refResidentInformation
						.getCanSpeak());
				SwingUtils.setSelectedButton(bgAbletoMake,
						refResidentInformation.getAbletoMake());
				SwingUtils.setSelectedButton(bgSideRails,
						refResidentInformation.getSideRails());
				txtBadActivity1.setText(refResidentInformation
						.getBadActivity1());
				txtBadActivity4.setText(refResidentInformation
						.getBadActivity4());
				txtBadActivity2.setText(refResidentInformation
						.getBadActivity2());
				txtBadActivity5.setText(refResidentInformation
						.getBadActivity5());
				txtBadActivity3.setText(refResidentInformation
						.getBadActivity3());
				txtBadActivity6.setText(refResidentInformation
						.getBadActivity6());
				txtPersonalHygiene1.setText(refResidentInformation
						.getPersonalHygiene1());
				txtPersonalHygiene4.setText(refResidentInformation
						.getPersonalHygiene4());
				txtPersonalHygiene7.setText(refResidentInformation
						.getPersonalHygiene7());
				txtPersonalHygiene10.setText(refResidentInformation
						.getPersonalHygiene10());
				txtPersonalHygiene13.setText(refResidentInformation
						.getPersonalHygiene13());
				txtPersonalHygiene2.setText(refResidentInformation
						.getPersonalHygiene2());
				txtPersonalHygiene5.setText(refResidentInformation
						.getPersonalHygiene5());
				txtPersonalHygiene8.setText(refResidentInformation
						.getPersonalHygiene8());
				txtPersonalHygiene11.setText(refResidentInformation
						.getPersonalHygiene11());
				txtPersonalHygiene14.setText(refResidentInformation
						.getPersonalHygiene14());
				txtPersonalHygiene3.setText(refResidentInformation
						.getPersonalHygiene3());
				txtPersonalHygiene6.setText(refResidentInformation
						.getPersonalHygiene6());
				txtPersonalHygiene9.setText(refResidentInformation
						.getPersonalHygiene9());
				txtPersonalHygiene12.setText(refResidentInformation
						.getPersonalHygiene12());
				txtPersonalHygiene15.setText(refResidentInformation
						.getPersonalHygiene15());
				txtFeeding1.setText(refResidentInformation.getFeeding1());
				txtFeeding2.setText(refResidentInformation.getFeeding2());
				txtFeeding3.setText(refResidentInformation.getFeeding3());
				txtTranfer1.setText(refResidentInformation.getTranfer1());
				txtTranfer4.setText(refResidentInformation.getTranfer4());
				txtTranfer7.setText(refResidentInformation.getTranfer7());
				txtTranfer10.setText(refResidentInformation.getTranfer10());
				txtTranfer2.setText(refResidentInformation.getTranfer2());
				txtTranfer5.setText(refResidentInformation.getTranfer5());
				txtTranfer8.setText(refResidentInformation.getTranfer8());
				txtTranfer11.setText(refResidentInformation.getTranfer11());
				txtTranfer3.setText(refResidentInformation.getTranfer3());
				txtTranfer6.setText(refResidentInformation.getTranfer6());
				txtTranfer9.setText(refResidentInformation.getTranfer9());
				txtTranfer12.setText(refResidentInformation.getTranfer12());
				txtLocomotion3.setText(refResidentInformation.getLocomotion3());
				txtLocomotion6.setText(refResidentInformation.getLocomotion6());
				txtLocomotion9.setText(refResidentInformation.getLocomotion9());
				txtLocomotion1.setText(refResidentInformation.getLocomotion1());
				txtLocomotion4.setText(refResidentInformation.getLocomotion4());
				txtLocomotion7.setText(refResidentInformation.getLocomotion7());
				txtLocomotion2.setText(refResidentInformation.getLocomotion2());
				txtLocomotion5.setText(refResidentInformation.getLocomotion5());
				txtLocomotion8.setText(refResidentInformation.getLocomotion8());
				txtBedLow.setText(refResidentInformation.getBedLow());
				txtMattressFirm.setText(refResidentInformation
						.getMattressFirm());
				txtReg.setText(refResidentInformation.getReg());
				txtOtherReg.setText(refResidentInformation.getOtherReg());
				txtCooperative.setText(refResidentInformation.getCooperative());
				txtOrientedX.setText(refResidentInformation.getOrientedX());
				txtDisruptive.setText(refResidentInformation.getDisruptive());
				txtBelligerent.setText(refResidentInformation.getBelligerent());
				txtCombative.setText(refResidentInformation.getCombative());
				txtSenile.setText(refResidentInformation.getSenile());
				txtSuspicious.setText(refResidentInformation.getSuspicious());
				txtWithdrawn.setText(refResidentInformation.getWithdrawn());
				txtWanders.setText(refResidentInformation.getWanders());
				txtAlert.setText(refResidentInformation.getAlert());
				txtForgetful.setText(refResidentInformation.getForgetful());
				txtConfused.setText(refResidentInformation.getConfused());
				txtRegular.setText(refResidentInformation.getRegular());
				txtLowSalt.setText(refResidentInformation.getLowSalt());
				txtDiabetic.setText(refResidentInformation.getDiabetic());
				txtBland.setText(refResidentInformation.getBland());
				txtLowResidue.setText(refResidentInformation.getLowResidue());
				txtOtherDiet.setText(refResidentInformation.getOtherDiet());
				txtFeedSelf.setText(refResidentInformation.getFeedSelf());
				txtNeedsHelp.setText(refResidentInformation.getNeedsHelp());
				txtPart.setText(refResidentInformation.getPart());
				txtDietAll.setText(refResidentInformation.getDietAll());
				txtAppliance.setText(refResidentInformation.getAppliance());
				txtCatheter.setText(refResidentInformation.getCatheter());
				txtColostomy.setText(refResidentInformation.getColostomy());
				txtCane.setText(refResidentInformation.getCane());
				txtCrutches.setText(refResidentInformation.getCrutches());
				txtProsthesis.setText(refResidentInformation.getProsthesis());
				txtWalker.setText(refResidentInformation.getWalker());
				txtChair.setText(refResidentInformation.getChair());
				txtHearingR.setText(refResidentInformation.getHearingR());
				txtHearingL.setText(refResidentInformation.getHearingL());
				txtDenturesUpper.setText(refResidentInformation
						.getDenturesUpper());
				txtLower.setText(refResidentInformation.getLower());
				txtGlassess.setText(refResidentInformation.getGlassess());
				txtIfYesLanguage.setText(refResidentInformation
						.getIfYesLanguage());
				txtDressing1.setText(refResidentInformation.getDressing1());
				txtDressing4.setText(refResidentInformation.getDressing4());
				txtDressing7.setText(refResidentInformation.getDressing7());
				txtDressing10.setText(refResidentInformation.getDressing10());
				txtDressing2.setText(refResidentInformation.getDressing2());
				txtDressing5.setText(refResidentInformation.getDressing5());
				txtDressing8.setText(refResidentInformation.getDressing8());
				txtDressing11.setText(refResidentInformation.getDressing11());
				txtDressing3.setText(refResidentInformation.getDressing3());
				txtDressing6.setText(refResidentInformation.getDressing6());
				txtDressing9.setText(refResidentInformation.getDressing9());
				txtDressing12.setText(refResidentInformation.getDressing12());
				// txtSocialInformation.setText(refResidentInformation.getSocialInformation());
				// txtAdditionalPertinent.setText(refResidentInformation.getAdditionalPertinent());
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
