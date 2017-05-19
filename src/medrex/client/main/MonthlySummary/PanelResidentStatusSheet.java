package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import medrex.commons.vo.monthlySummary.ResidentStatusSheet;

import com.toedter.calendar.JDateChooser;

public class PanelResidentStatusSheet extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3474954555488523164L;
	private JTextField txtDiet;
	private JTextField txtLevelCare;
	private JTextField txtPhoneNumber;
	private JTextField txtChartNumber;
	private JTextField txtPhysician;
	private JTextField txtPrefferedName;
	private JRadioButton rbSingle;
	private JTextField txtName;
	private JTextField txtRoom;
	private JTextField txtAge;
	private JTextArea txtRestorativeOthers;
	private JCheckBox cbRestorativeOthers;
	private JCheckBox cbRestorativeCommunication;
	private JCheckBox cbRestorativeAmputation;
	private JCheckBox cbRestorativeEatingSwallowing;
	private JCheckBox cbRestorativeDressingGrooming;
	private JCheckBox cbRestorativeWalking;
	private JCheckBox cbRestorativeTransfer;
	private JCheckBox cbRestorativeBedMobility;
	private JCheckBox cbRestorativeSplintBraceAssist;
	private JCheckBox cbRestorativeAarom;
	private JCheckBox cbRestorativeProm;
	private JCheckBox cbRestorativeRoom;
	private JCheckBox cbGroomingPodatrist;
	private JCheckBox cbGroomingTotalCare;
	private JCheckBox cbGroomingSupervise;
	private JCheckBox cbGroomingAssist;
	private JCheckBox cbGroomingSelfCare;
	private JCheckBox cbGroomingHairDresser;
	private JCheckBox cbGroomingFeet;
	private JCheckBox cbGroomingNails;
	private JCheckBox cbGroomingShave;
	private JCheckBox cbGroomingComb;
	private JCheckBox cbDressTotalCare;
	private JCheckBox cbDressSupervise;
	private JCheckBox cbDressAssist;
	private JCheckBox cbDressSelfCare;
	private JCheckBox cbDressClothes;
	private JCheckBox cbDressShocking;
	private JCheckBox cbDressShoes;
	private JTextArea txtSkinContracturesSite;
	private JTextArea txtSkinDecubitusSite;
	private JCheckBox cbSkinContractures;
	private JCheckBox cbSkinDecubitus;
	private JCheckBox cbSkinSpecial;
	private JCheckBox cbSkinRoutine;
	private JCheckBox cbMouthCareTotalCare;
	private JCheckBox cbMouthCareSupervise;
	private JCheckBox cbMouthCareAssist;
	private JCheckBox cbMouthCareSelfCare;
	private JCheckBox cbMouthCareAtBedSise;
	private JCheckBox cbMouthCareNoTeeth;
	private JCheckBox cbMouthCareNoDentures;
	private JCheckBox cbMouthCareLower;
	private JCheckBox cbMouthCareUpper;
	private JCheckBox cbMouthCareDentures;
	private JCheckBox cbBathBed;
	private JCheckBox cbBathTotalCare;
	private JCheckBox cbBathAssist;
	private JCheckBox cbBathHairCare;
	private JCheckBox cbBathSelfCare;
	private JCheckBox cbBathShower;
	private JCheckBox cbBathTub;
	private JTextField txtSpecificTask;
	private JTextField txtRiskFactors;
	private JTextField txtResidentStrengths;
	private JCheckBox cbMentalAttitudeForgetFul;
	private JCheckBox cbMentalAttitudeAgitated;
	private JCheckBox cbMentalAttitudeAlert;
	private JCheckBox cbMentalAttitudeConfused;
	private JCheckBox cbMentalAttitudeDepressed;
	private JCheckBox cbMentalAttitudeCheerful;
	private JCheckBox cbMentalAttitudeMoody;
	private JCheckBox cbMentalAttitudeWellAdjusted;
	private JCheckBox cbMentalAttitudeOriented;
	private JTextField txtBracesType;
	private JCheckBox cbBracesTotalCare;
	private JCheckBox cbBracesAssist;
	private JCheckBox cbBracesSelf;
	private JTextField txtSpecialEquipmentTotalCareType;
	private JCheckBox cbSpecialEquipmentTotalCare;
	private JCheckBox cbSpecialEquipmentAssist;
	private JCheckBox cbSpecialEquipmentSelf;
	private JCheckBox cbSpecialEquipmentProsthesis;
	private JCheckBox cbSupportiveAfterPressurePad;
	private JCheckBox cbSupportiveWaterBed;
	private JCheckBox cbSupportiveWaterMattress;
	private JCheckBox cbSupportiveSpecialMattress;
	private JCheckBox cbSupportiveFoamRubber;
	private JCheckBox cbSupportiveBrace;
	private JCheckBox cbSupportiveBedBoard;
	private JCheckBox cbSupportivePillows;
	private JCheckBox cbSupportiveTrapeze;
	private JCheckBox cbSupportiveFootBoard;
	private JCheckBox cbSupportiveBedCradle;
	private JCheckBox cbSideRailsOmit;
	private JCheckBox cbSideRailsAtNight;
	private JCheckBox cbSideRailsConstantly;
	private JCheckBox cbRestraintJacket;
	private JCheckBox cbRestraintWaist;
	private JCheckBox cbRestraintChair;
	private JCheckBox cbRestraintBed;
	private JCheckBox cbPositionChangeAfterTwoHour;
	private JCheckBox cbPositionChangeAfterOneHour;
	private JCheckBox cbPositionChangeAfterHalfHour;
	private JCheckBox cbPositionWith2Assist;
	private JCheckBox cbPositionWith1Assist;
	private JCheckBox cbPositionChangeBySelf;
	private JCheckBox cbParalysisParaplegla;
	private JCheckBox cbParalysisQuadriplegia;
	private JCheckBox cbParalysisLtSideOfFace;
	private JCheckBox cbParalysisLeftLeg;
	private JCheckBox cbParalysisRtsideOfFace;
	private JCheckBox cbParalysisRtLeg;
	private JCheckBox cbParalysisLeftArm;
	private JCheckBox cbParalysisRtArm;
	private JCheckBox cbDexterityLeftHand;
	private JCheckBox cbDexterityRightHand;
	private JCheckBox cbFullAmbulatory;
	private JCheckBox cbWith2Assist;
	private JCheckBox cbWithOneAssist;
	private JCheckBox cbStrecher;
	private JCheckBox cbWheelChair;
	private JCheckBox cbLifttoChair;
	private JCheckBox cbBedtoChair;
	private JCheckBox cbWalker;
	private JCheckBox cbCane;
	private JCheckBox cbCrutches;
	private JCheckBox cbWalks;
	private JCheckBox cbLanguageSpoken;
	private JCheckBox cbAphasic;
	private JCheckBox cbDeficit;
	private JCheckBox cbSpeaksWell;
	private JCheckBox cbUsesHearingAid;
	private JCheckBox cbHearingLeft;
	private JCheckBox cbHearingRight;
	private JCheckBox cbPartiallyDeaf;
	private JCheckBox cbTotallyDeaf;
	private JCheckBox cbBlindLegally;
	private JCheckBox cbBlindLeft;
	private JCheckBox cbBlindBoth;
	private JCheckBox cbBlindRight;
	private JCheckBox cbBlind;
	private JCheckBox cbWearsGlasses;
	private JCheckBox cbCataracts;
	private JCheckBox cbBoth;
	private JCheckBox cbLeft;
	private JCheckBox cbRight;
	private JTextField txtDRs;
	private JTextField txtDRd;
	private JTextField txtDRb;
	private JCheckBox cbSugarSubstitute;
	private JCheckBox cbSupplementFeeding;
	private JCheckBox cbDR;
	private JCheckBox cbNeedBib;
	private JCheckBox cbEatingAssist;
	private JDateChooser dcDateChange;
	private JTextField txtTubeFeedingSize;
	private JCheckBox cbTubeFeeding;
	private JCheckBox cbFeeder;
	private JCheckBox cbOOBinChair;
	private JCheckBox cbPrepareFood;
	private JCheckBox cbFeedsSelf;
	private JTextField txtOfferQuantity;
	private JCheckBox cbOutPut;
	private JCheckBox cbIntake;
	private JCheckBox cbOffer;
	private JCheckBox cbRestrict;
	private JTextField txtRestrictQuantity;
	private JCheckBox cbBowelTotalCare;
	private JCheckBox cbBowelAssist;
	private JCheckBox cbBowelSelfControl;
	private JCheckBox cbBowelIncontinent;
	private JCheckBox cbBowelCommode;
	private JCheckBox cbBowelBedPan;
	private JCheckBox cbBowelBR;
	private JCheckBox cbBowelTraining;
	private JCheckBox cbAdultBriefs;
	private JTextArea txtSchedule;
	private JCheckBox cbToiletProgram;
	private JCheckBox cbBladderRetraining;
	private JCheckBox cbAssist;
	private JCheckBox cbTotalCare;
	private JCheckBox cbSelfControl;
	private JCheckBox cbIncontinent;
	private JTextField txtIrrigationA;
	private JTextField txtIrrigationC;
	private JCheckBox cbIrrigation;
	private JDateChooser dcCatheterDateChange;
	private JTextField txtCatheterSize;
	private JCheckBox cbCatheter;
	private JCheckBox cbCommode;
	private JCheckBox cbUrinal;
	private JCheckBox cbBedPan;
	private JCheckBox cbBr;
	private ButtonGroup bgMaritalStatus = new ButtonGroup();
	private JDateChooser dcBirthDate;

	public PanelResidentStatusSheet() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(1150, 1020));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(20, 0, 1116, 994);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBounds(0, 30, 168, 323);
		panel.add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 281, 26);
		panel_1.add(panel_2);

		final JLabel bladderLabel = new JLabel();
		bladderLabel.setBackground(Color.BLACK);
		bladderLabel.setForeground(Color.WHITE);
		bladderLabel.setText("BLADDER");
		bladderLabel.setBounds(8, 0, 69, 24);
		panel_2.add(bladderLabel);

		cbBr = new JCheckBox();
		cbBr.setOpaque(false);
		cbBr.setText("B.R.");
		cbBr.setBounds(10, 32, 54, 18);
		panel_1.add(cbBr);

		cbBedPan = new JCheckBox();
		cbBedPan.setOpaque(false);
		cbBedPan.setText("Bedpan");
		cbBedPan.setBounds(10, 50, 78, 18);
		panel_1.add(cbBedPan);

		cbUrinal = new JCheckBox();
		cbUrinal.setOpaque(false);
		cbUrinal.setText("Urinal");
		cbUrinal.setBounds(10, 70, 69, 18);
		panel_1.add(cbUrinal);

		cbCommode = new JCheckBox();
		cbCommode.setOpaque(false);
		cbCommode.setText("Commode");
		cbCommode.setBounds(10, 91, 78, 18);
		panel_1.add(cbCommode);

		cbCatheter = new JCheckBox();
		cbCatheter.setOpaque(false);
		cbCatheter.setText("Catheter");
		cbCatheter.setBounds(10, 115, 78, 18);
		panel_1.add(cbCatheter);

		final JLabel sizeLabel = new JLabel();
		sizeLabel.setText("Size");
		sizeLabel.setBounds(10, 139, 54, 14);
		panel_1.add(sizeLabel);

		final JLabel dateChangeLabel = new JLabel();
		dateChangeLabel.setText("Date change");
		dateChangeLabel.setBounds(10, 159, 69, 14);
		panel_1.add(dateChangeLabel);

		cbIrrigation = new JCheckBox();
		cbIrrigation.setOpaque(false);
		cbIrrigation.setText("Irrigation");
		cbIrrigation.setBounds(10, 179, 87, 14);
		panel_1.add(cbIrrigation);

		final JLabel cLabel = new JLabel();
		cLabel.setText("c");
		cLabel.setBounds(34, 199, 18, 14);
		panel_1.add(cLabel);

		final JLabel label_3 = new JLabel();
		label_3.setText("a");
		label_3.setBounds(34, 219, 18, 14);
		panel_1.add(label_3);

		cbIncontinent = new JCheckBox();
		cbIncontinent.setOpaque(false);
		cbIncontinent.setText("Incontinent");
		cbIncontinent.setBounds(10, 239, 101, 14);
		panel_1.add(cbIncontinent);

		cbSelfControl = new JCheckBox();
		cbSelfControl.setOpaque(false);
		cbSelfControl.setText("Self control");
		cbSelfControl.setBounds(10, 259, 101, 14);
		panel_1.add(cbSelfControl);

		cbTotalCare = new JCheckBox();
		cbTotalCare.setOpaque(false);
		cbTotalCare.setText("Total care");
		cbTotalCare.setBounds(10, 279, 101, 14);
		panel_1.add(cbTotalCare);

		cbAssist = new JCheckBox();
		cbAssist.setOpaque(false);
		cbAssist.setText("Assist");
		cbAssist.setBounds(10, 299, 101, 14);
		panel_1.add(cbAssist);

		txtCatheterSize = new JTextField();
		txtCatheterSize.setBounds(80, 139, 78, 18);
		panel_1.add(txtCatheterSize);

		dcCatheterDateChange = new JDateChooser();
		dcCatheterDateChange.setBounds(80, 157, 78, 18);
		panel_1.add(dcCatheterDateChange);

		txtIrrigationC = new JTextField();
		txtIrrigationC.setBounds(80, 199, 78, 18);
		panel_1.add(txtIrrigationC);

		txtIrrigationA = new JTextField();
		txtIrrigationA.setBounds(79, 219, 79, 18);
		panel_1.add(txtIrrigationA);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 351, 168, 180);
		panel.add(panel_1_1);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(0, 0, 281, 43);
		panel_1_1.add(panel_2_1);

		final JLabel bladderLabel_1 = new JLabel();
		bladderLabel_1.setForeground(Color.WHITE);
		bladderLabel_1
				.setText("<HTML><BODY>RESTORATIVE<BR>INCONTINENCE PROGRAMS</BODY></HTML>");
		bladderLabel_1.setBounds(8, 0, 160, 43);
		panel_2_1.add(bladderLabel_1);

		cbBladderRetraining = new JCheckBox();
		cbBladderRetraining.setOpaque(false);
		cbBladderRetraining.setText("Bladder Retraining");
		cbBladderRetraining.setBounds(10, 49, 120, 14);
		panel_1_1.add(cbBladderRetraining);

		cbToiletProgram = new JCheckBox();
		cbToiletProgram.setOpaque(false);
		cbToiletProgram.setText("Tolleting Program");
		cbToiletProgram.setBounds(10, 69, 135, 14);
		panel_1_1.add(cbToiletProgram);

		final JLabel sizeLabel_1 = new JLabel();
		sizeLabel_1.setText("Schedule");
		sizeLabel_1.setBounds(10, 89, 54, 14);
		panel_1_1.add(sizeLabel_1);

		txtSchedule = new JTextArea();
		txtSchedule.setBorder(new LineBorder(Color.black, 1, false));
		txtSchedule.setBounds(10, 106, 148, 48);
		panel_1_1.add(txtSchedule);

		cbAdultBriefs = new JCheckBox();
		cbAdultBriefs.setOpaque(false);
		cbAdultBriefs.setText("Adult briefs");
		cbAdultBriefs.setBounds(10, 160, 148, 18);
		panel_1_1.add(cbAdultBriefs);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(0, 531, 168, 221);
		panel.add(panel_1_1_1);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(0, 0, 168, 30);
		panel_1_1_1.add(panel_2_1_1);

		final JLabel bladderLabel_1_1 = new JLabel();
		bladderLabel_1_1.setForeground(Color.WHITE);
		bladderLabel_1_1.setText("BOWEL");
		bladderLabel_1_1.setBounds(8, 0, 139, 33);
		panel_2_1_1.add(bladderLabel_1_1);

		cbBowelTraining = new JCheckBox();
		cbBowelTraining.setOpaque(false);
		cbBowelTraining.setText("Bowel Training");
		cbBowelTraining.setBounds(10, 39, 120, 14);
		panel_1_1_1.add(cbBowelTraining);

		cbBowelBR = new JCheckBox();
		cbBowelBR.setOpaque(false);
		cbBowelBR.setText("B.R");
		cbBowelBR.setBounds(10, 59, 135, 14);
		panel_1_1_1.add(cbBowelBR);

		cbBowelBedPan = new JCheckBox();
		cbBowelBedPan.setOpaque(false);
		cbBowelBedPan.setText("Bedpan");
		cbBowelBedPan.setBounds(10, 79, 135, 18);
		panel_1_1_1.add(cbBowelBedPan);

		cbBowelCommode = new JCheckBox();
		cbBowelCommode.setOpaque(false);
		cbBowelCommode.setText("Commode");
		cbBowelCommode.setBounds(10, 103, 243, 14);
		panel_1_1_1.add(cbBowelCommode);

		cbBowelIncontinent = new JCheckBox();
		cbBowelIncontinent.setOpaque(false);
		cbBowelIncontinent.setText("Incontinant");
		cbBowelIncontinent.setBounds(10, 123, 94, 18);
		panel_1_1_1.add(cbBowelIncontinent);

		cbBowelSelfControl = new JCheckBox();
		cbBowelSelfControl.setOpaque(false);
		cbBowelSelfControl.setText("Self control");
		cbBowelSelfControl.setBounds(10, 147, 94, 18);
		panel_1_1_1.add(cbBowelSelfControl);

		cbBowelAssist = new JCheckBox();
		cbBowelAssist.setOpaque(false);
		cbBowelAssist.setText("Assist");
		cbBowelAssist.setBounds(10, 171, 65, 18);
		panel_1_1_1.add(cbBowelAssist);

		cbBowelTotalCare = new JCheckBox();
		cbBowelTotalCare.setOpaque(false);
		cbBowelTotalCare.setText("Total care");
		cbBowelTotalCare.setBounds(10, 195, 78, 18);
		panel_1_1_1.add(cbBowelTotalCare);

		final JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBounds(0, 752, 168, 158);
		panel.add(panel_1_1_1_1);

		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBackground(Color.BLACK);
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(0, 0, 167, 30);
		panel_1_1_1_1.add(panel_2_1_1_1);

		final JLabel bladderLabel_1_1_1 = new JLabel();
		bladderLabel_1_1_1.setBackground(Color.BLACK);
		bladderLabel_1_1_1.setForeground(Color.WHITE);
		bladderLabel_1_1_1.setText("FLUIDS");
		bladderLabel_1_1_1.setBounds(8, 0, 157, 30);
		panel_2_1_1_1.add(bladderLabel_1_1_1);

		cbRestrict = new JCheckBox();
		cbRestrict.setOpaque(false);
		cbRestrict.setText("Restrict");
		cbRestrict.setBounds(10, 59, 65, 22);
		panel_1_1_1_1.add(cbRestrict);

		cbOffer = new JCheckBox();
		cbOffer.setOpaque(false);
		cbOffer.setText("Offer");
		cbOffer.setBounds(10, 82, 60, 22);
		panel_1_1_1_1.add(cbOffer);

		cbIntake = new JCheckBox();
		cbIntake.setOpaque(false);
		cbIntake.setText("Intake");
		cbIntake.setBounds(10, 110, 78, 18);
		panel_1_1_1_1.add(cbIntake);

		cbOutPut = new JCheckBox();
		cbOutPut.setOpaque(false);
		cbOutPut.setText("Output");
		cbOutPut.setBounds(10, 134, 65, 18);
		panel_1_1_1_1.add(cbOutPut);

		txtRestrictQuantity = new JTextField();
		txtRestrictQuantity.setBounds(84, 60, 48, 21);
		panel_1_1_1_1.add(txtRestrictQuantity);

		final JLabel mlLabel = new JLabel();
		mlLabel.setText("ml.");
		mlLabel.setBounds(138, 63, 25, 14);
		panel_1_1_1_1.add(mlLabel);

		txtOfferQuantity = new JTextField();
		txtOfferQuantity.setBounds(84, 89, 48, 21);
		panel_1_1_1_1.add(txtOfferQuantity);

		final JLabel mlLabel_1 = new JLabel();
		mlLabel_1.setText("ml.");
		mlLabel_1.setBounds(138, 90, 25, 14);
		panel_1_1_1_1.add(mlLabel_1);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(168, 30, 199, 277);
		panel.add(panel_1_2);

		final JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.BLACK);
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(0, 0, 281, 26);
		panel_1_2.add(panel_2_2);

		final JLabel bladderLabel_2 = new JLabel();
		bladderLabel_2.setForeground(Color.WHITE);
		bladderLabel_2.setText("EATING HABITS");
		bladderLabel_2.setBounds(8, 0, 105, 24);
		panel_2_2.add(bladderLabel_2);

		cbFeedsSelf = new JCheckBox();
		cbFeedsSelf.setOpaque(false);
		cbFeedsSelf.setText("Feeds self");
		cbFeedsSelf.setBounds(10, 32, 101, 14);
		panel_1_2.add(cbFeedsSelf);

		cbPrepareFood = new JCheckBox();
		cbPrepareFood.setOpaque(false);
		cbPrepareFood.setText("Prepare food");
		cbPrepareFood.setBounds(10, 52, 101, 14);
		panel_1_2.add(cbPrepareFood);

		cbOOBinChair = new JCheckBox();
		cbOOBinChair.setOpaque(false);
		cbOOBinChair.setText(" OOB in Chair");
		cbOOBinChair.setBounds(10, 72, 101, 14);
		panel_1_2.add(cbOOBinChair);

		cbFeeder = new JCheckBox();
		cbFeeder.setOpaque(false);
		cbFeeder.setText("Feeder");
		cbFeeder.setBounds(10, 88, 63, 14);
		panel_1_2.add(cbFeeder);

		cbTubeFeeding = new JCheckBox();
		cbTubeFeeding.setOpaque(false);
		cbTubeFeeding.setText("Tube feeding");
		cbTubeFeeding.setBounds(10, 108, 101, 14);
		panel_1_2.add(cbTubeFeeding);

		final JLabel sizeLabel_2 = new JLabel();
		sizeLabel_2.setText("size");
		sizeLabel_2.setBounds(20, 128, 24, 14);
		panel_1_2.add(sizeLabel_2);

		final JLabel dateChangeLabel_1 = new JLabel();
		dateChangeLabel_1.setText("Date change");
		dateChangeLabel_1.setBounds(20, 148, 78, 14);
		panel_1_2.add(dateChangeLabel_1);

		cbEatingAssist = new JCheckBox();
		cbEatingAssist.setOpaque(false);
		cbEatingAssist.setText("Assist");
		cbEatingAssist.setBounds(10, 167, 87, 14);
		panel_1_2.add(cbEatingAssist);

		cbNeedBib = new JCheckBox();
		cbNeedBib.setOpaque(false);
		cbNeedBib.setText("Needs bib");
		cbNeedBib.setBounds(10, 187, 101, 14);
		panel_1_2.add(cbNeedBib);

		cbDR = new JCheckBox();
		cbDR.setOpaque(false);
		cbDR.setText("D.R");
		cbDR.setBounds(10, 207, 43, 22);
		panel_1_2.add(cbDR);

		cbSupplementFeeding = new JCheckBox();
		cbSupplementFeeding.setOpaque(false);
		cbSupplementFeeding.setText("Supplement feeding");
		cbSupplementFeeding.setBounds(10, 235, 135, 14);
		panel_1_2.add(cbSupplementFeeding);

		cbSugarSubstitute = new JCheckBox();
		cbSugarSubstitute.setOpaque(false);
		cbSugarSubstitute.setText("Sugar substitute");
		cbSugarSubstitute.setBounds(10, 255, 237, 14);
		panel_1_2.add(cbSugarSubstitute);

		txtTubeFeedingSize = new JTextField();
		txtTubeFeedingSize.setBounds(83, 128, 87, 18);
		panel_1_2.add(txtTubeFeedingSize);

		dcDateChange = new JDateChooser();
		dcDateChange.setBounds(83, 148, 87, 18);
		panel_1_2.add(dcDateChange);

		txtDRb = new JTextField();
		txtDRb.setBounds(50, 210, 24, 15);
		panel_1_2.add(txtDRb);

		final JLabel label = new JLabel();
		label.setText("B");
		label.setBounds(80, 211, 14, 14);
		panel_1_2.add(label);

		txtDRd = new JTextField();
		txtDRd.setBounds(94, 211, 24, 15);
		panel_1_2.add(txtDRd);

		final JLabel dLabel = new JLabel();
		dLabel.setText("D");
		dLabel.setBounds(124, 211, 14, 14);
		panel_1_2.add(dLabel);

		txtDRs = new JTextField();
		txtDRs.setBounds(133, 211, 24, 15);
		panel_1_2.add(txtDRs);

		final JLabel sLabel = new JLabel();
		sLabel.setText("S");
		sLabel.setBounds(163, 211, 14, 14);
		panel_1_2.add(sLabel);

		final JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBackground(Color.WHITE);
		panel_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBounds(168, 308, 199, 237);
		panel.add(panel_1_1_1_2);

		final JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.setBackground(Color.BLACK);
		panel_2_1_1_2.setLayout(null);
		panel_2_1_1_2.setBounds(0, 0, 281, 29);
		panel_1_1_1_2.add(panel_2_1_1_2);

		final JLabel bladderLabel_1_1_2 = new JLabel();
		bladderLabel_1_1_2.setBackground(Color.BLACK);
		bladderLabel_1_1_2.setForeground(Color.WHITE);
		bladderLabel_1_1_2.setText("EYE SIGHT");
		bladderLabel_1_1_2.setBounds(8, 0, 204, 29);
		panel_2_1_1_2.add(bladderLabel_1_1_2);

		cbRight = new JCheckBox();
		cbRight.setOpaque(false);
		cbRight.setText("Right");
		cbRight.setBounds(10, 49, 120, 14);
		panel_1_1_1_2.add(cbRight);

		cbLeft = new JCheckBox();
		cbLeft.setOpaque(false);
		cbLeft.setText("Left");
		cbLeft.setBounds(10, 69, 135, 14);
		panel_1_1_1_2.add(cbLeft);

		cbBoth = new JCheckBox();
		cbBoth.setOpaque(false);
		cbBoth.setText("Both");
		cbBoth.setBounds(10, 89, 60, 18);
		panel_1_1_1_2.add(cbBoth);

		cbCataracts = new JCheckBox();
		cbCataracts.setOpaque(false);
		cbCataracts.setText("Cataracts");
		cbCataracts.setBounds(10, 113, 159, 18);
		panel_1_1_1_2.add(cbCataracts);

		cbWearsGlasses = new JCheckBox();
		cbWearsGlasses.setOpaque(false);
		cbWearsGlasses.setText("Wears glasses");
		cbWearsGlasses.setBounds(10, 137, 94, 14);
		panel_1_1_1_2.add(cbWearsGlasses);

		cbBlind = new JCheckBox();
		cbBlind.setOpaque(false);
		cbBlind.setText("Blind");
		cbBlind.setBounds(10, 157, 94, 14);
		panel_1_1_1_2.add(cbBlind);

		cbBlindRight = new JCheckBox();
		cbBlindRight.setOpaque(false);
		cbBlindRight.setText("Right");
		cbBlindRight.setBounds(52, 177, 60, 18);
		panel_1_1_1_2.add(cbBlindRight);

		cbBlindLeft = new JCheckBox();
		cbBlindLeft.setOpaque(false);
		cbBlindLeft.setText("Left");
		cbBlindLeft.setBounds(52, 201, 60, 18);
		panel_1_1_1_2.add(cbBlindLeft);

		cbBlindBoth = new JCheckBox();
		cbBlindBoth.setOpaque(false);
		cbBlindBoth.setText("Both");
		cbBlindBoth.setBounds(109, 179, 100, 14);
		panel_1_1_1_2.add(cbBlindBoth);

		cbBlindLegally = new JCheckBox();
		cbBlindLegally.setOpaque(false);
		cbBlindLegally.setText("Legally");
		cbBlindLegally.setBounds(109, 201, 65, 14);
		panel_1_1_1_2.add(cbBlindLegally);

		final JPanel panel_1_1_1_3 = new JPanel();
		panel_1_1_1_3.setBackground(Color.WHITE);
		panel_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_3.setLayout(null);
		panel_1_1_1_3.setBounds(168, 674, 199, 236);
		panel.add(panel_1_1_1_3);

		final JPanel panel_2_1_1_3 = new JPanel();
		panel_2_1_1_3.setBackground(Color.BLACK);
		panel_2_1_1_3.setLayout(null);
		panel_2_1_1_3.setBounds(0, 0, 281, 30);
		panel_1_1_1_3.add(panel_2_1_1_3);

		final JLabel bladderLabel_1_1_3 = new JLabel();
		bladderLabel_1_1_3.setForeground(Color.WHITE);
		bladderLabel_1_1_3.setText("SPEECH");
		bladderLabel_1_1_3.setBounds(8, 0, 204, 30);
		panel_2_1_1_3.add(bladderLabel_1_1_3);

		cbSpeaksWell = new JCheckBox();
		cbSpeaksWell.setOpaque(false);
		cbSpeaksWell.setText("Speaks well");
		cbSpeaksWell.setBounds(49, 56, 120, 22);
		panel_1_1_1_3.add(cbSpeaksWell);

		cbDeficit = new JCheckBox();
		cbDeficit.setOpaque(false);
		cbDeficit.setText("Deficit");
		cbDeficit.setBounds(49, 84, 135, 22);
		panel_1_1_1_3.add(cbDeficit);

		cbAphasic = new JCheckBox();
		cbAphasic.setOpaque(false);
		cbAphasic.setText("Aphasic");
		cbAphasic.setBounds(49, 112, 83, 18);
		panel_1_1_1_3.add(cbAphasic);

		cbLanguageSpoken = new JCheckBox();
		cbLanguageSpoken.setOpaque(false);
		cbLanguageSpoken.setText("Language Spoken");
		cbLanguageSpoken.setBounds(49, 136, 120, 18);
		panel_1_1_1_3.add(cbLanguageSpoken);

		final JPanel panel_1_1_1_4 = new JPanel();
		panel_1_1_1_4.setBackground(Color.WHITE);
		panel_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4.setLayout(null);
		panel_1_1_1_4.setBounds(367, 30, 207, 277);
		panel.add(panel_1_1_1_4);

		final JPanel panel_2_1_1_4 = new JPanel();
		panel_2_1_1_4.setBackground(Color.BLACK);
		panel_2_1_1_4.setLayout(null);
		panel_2_1_1_4.setBounds(0, 0, 281, 26);
		panel_1_1_1_4.add(panel_2_1_1_4);

		final JLabel bladderLabel_1_1_4 = new JLabel();
		bladderLabel_1_1_4.setForeground(Color.WHITE);
		bladderLabel_1_1_4.setText("LOCOMOTION");
		bladderLabel_1_1_4.setBounds(8, 0, 204, 21);
		panel_2_1_1_4.add(bladderLabel_1_1_4);

		cbWalks = new JCheckBox();
		cbWalks.setOpaque(false);
		cbWalks.setText("Walks");
		cbWalks.setBounds(10, 46, 110, 18);
		panel_1_1_1_4.add(cbWalks);

		cbCrutches = new JCheckBox();
		cbCrutches.setOpaque(false);
		cbCrutches.setText("Crutches");
		cbCrutches.setBounds(10, 64, 125, 22);
		panel_1_1_1_4.add(cbCrutches);

		cbCane = new JCheckBox();
		cbCane.setOpaque(false);
		cbCane.setText("Cane");
		cbCane.setBounds(10, 83, 144, 18);
		panel_1_1_1_4.add(cbCane);

		cbWalker = new JCheckBox();
		cbWalker.setOpaque(false);
		cbWalker.setText("Walker");
		cbWalker.setBounds(10, 103, 65, 18);
		panel_1_1_1_4.add(cbWalker);

		cbBedtoChair = new JCheckBox();
		cbBedtoChair.setOpaque(false);
		cbBedtoChair.setText("Bed to chair");
		cbBedtoChair.setBounds(10, 124, 94, 18);
		panel_1_1_1_4.add(cbBedtoChair);

		cbLifttoChair = new JCheckBox();
		cbLifttoChair.setOpaque(false);
		cbLifttoChair.setText("Lift to chair");
		cbLifttoChair.setBounds(10, 143, 94, 18);
		panel_1_1_1_4.add(cbLifttoChair);

		cbWheelChair = new JCheckBox();
		cbWheelChair.setOpaque(false);
		cbWheelChair.setText("Wheelchair");
		cbWheelChair.setBounds(10, 163, 120, 18);
		panel_1_1_1_4.add(cbWheelChair);

		cbStrecher = new JCheckBox();
		cbStrecher.setOpaque(false);
		cbStrecher.setText("Stretcher");
		cbStrecher.setBounds(10, 186, 78, 18);
		panel_1_1_1_4.add(cbStrecher);

		cbWithOneAssist = new JCheckBox();
		cbWithOneAssist.setOpaque(false);
		cbWithOneAssist.setText("With 1 assist");
		cbWithOneAssist.setBounds(10, 211, 109, 18);
		panel_1_1_1_4.add(cbWithOneAssist);

		cbWith2Assist = new JCheckBox();
		cbWith2Assist.setOpaque(false);
		cbWith2Assist.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		cbWith2Assist.setText("With 2 assist");
		cbWith2Assist.setBounds(10, 233, 109, 18);
		panel_1_1_1_4.add(cbWith2Assist);

		cbFullAmbulatory = new JCheckBox();
		cbFullAmbulatory.setOpaque(false);
		cbFullAmbulatory.setText("Fully ambulatory");
		cbFullAmbulatory.setBounds(10, 255, 109, 18);
		panel_1_1_1_4.add(cbFullAmbulatory);

		final JPanel panel_1_1_1_2_1_1 = new JPanel();
		panel_1_1_1_2_1_1.setBackground(Color.WHITE);
		panel_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_2_1_1.setLayout(null);
		panel_1_1_1_2_1_1.setBounds(367, 511, 207, 116);
		panel.add(panel_1_1_1_2_1_1);

		final JPanel panel_2_1_1_2_1_1 = new JPanel();
		panel_2_1_1_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1_2_1_1.setLayout(null);
		panel_2_1_1_2_1_1.setBounds(0, 0, 281, 22);
		panel_1_1_1_2_1_1.add(panel_2_1_1_2_1_1);

		final JLabel bladderLabel_1_1_2_1_1 = new JLabel();
		bladderLabel_1_1_2_1_1.setForeground(Color.WHITE);
		bladderLabel_1_1_2_1_1.setText("POSITION");
		bladderLabel_1_1_2_1_1.setBounds(8, 0, 204, 22);
		panel_2_1_1_2_1_1.add(bladderLabel_1_1_2_1_1);

		cbPositionChangeBySelf = new JCheckBox();
		cbPositionChangeBySelf.setOpaque(false);
		cbPositionChangeBySelf.setText("Change by self");
		cbPositionChangeBySelf.setBounds(10, 28, 120, 14);
		panel_1_1_1_2_1_1.add(cbPositionChangeBySelf);

		cbPositionWith1Assist = new JCheckBox();
		cbPositionWith1Assist.setOpaque(false);
		cbPositionWith1Assist.setText("With 1 assist");
		cbPositionWith1Assist.setBounds(10, 48, 135, 14);
		panel_1_1_1_2_1_1.add(cbPositionWith1Assist);

		cbPositionChangeAfterHalfHour = new JCheckBox();
		cbPositionChangeAfterHalfHour.setOpaque(false);
		cbPositionChangeAfterHalfHour.setText(" 1/2 hr.");
		cbPositionChangeAfterHalfHour.setBounds(10, 85, 67, 18);
		panel_1_1_1_2_1_1.add(cbPositionChangeAfterHalfHour);

		cbPositionChangeAfterOneHour = new JCheckBox();
		cbPositionChangeAfterOneHour.setOpaque(false);
		cbPositionChangeAfterOneHour.setText("1 hr.");
		cbPositionChangeAfterOneHour.setBounds(83, 87, 60, 14);
		panel_1_1_1_2_1_1.add(cbPositionChangeAfterOneHour);

		cbPositionWith2Assist = new JCheckBox();
		cbPositionWith2Assist.setOpaque(false);
		cbPositionWith2Assist.setText("With 2 assist");
		cbPositionWith2Assist.setBounds(10, 65, 111, 14);
		panel_1_1_1_2_1_1.add(cbPositionWith2Assist);

		cbPositionChangeAfterTwoHour = new JCheckBox();
		cbPositionChangeAfterTwoHour.setOpaque(false);
		cbPositionChangeAfterTwoHour.setText("2 hr.");
		cbPositionChangeAfterTwoHour.setBounds(157, 87, 67, 14);
		panel_1_1_1_2_1_1.add(cbPositionChangeAfterTwoHour);

		final JPanel panel_1_1_1_1_2 = new JPanel();
		panel_1_1_1_1_2.setBackground(Color.WHITE);
		panel_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_2.setLayout(null);
		panel_1_1_1_1_2.setBounds(367, 623, 207, 102);
		panel.add(panel_1_1_1_1_2);

		final JPanel panel_2_1_1_1_2 = new JPanel();
		panel_2_1_1_1_2.setBackground(Color.BLACK);
		panel_2_1_1_1_2.setLayout(null);
		panel_2_1_1_1_2.setBounds(0, 0, 281, 31);
		panel_1_1_1_1_2.add(panel_2_1_1_1_2);

		final JLabel bladderLabel_1_1_1_2 = new JLabel();
		bladderLabel_1_1_1_2.setForeground(Color.WHITE);
		bladderLabel_1_1_1_2.setText("RESTRAINTS");
		bladderLabel_1_1_1_2.setBounds(8, 0, 206, 33);
		panel_2_1_1_1_2.add(bladderLabel_1_1_1_2);

		cbRestraintBed = new JCheckBox();
		cbRestraintBed.setOpaque(false);
		cbRestraintBed.setText("Bed");
		cbRestraintBed.setBounds(10, 37, 78, 22);
		panel_1_1_1_1_2.add(cbRestraintBed);

		cbRestraintWaist = new JCheckBox();
		cbRestraintWaist.setOpaque(false);
		cbRestraintWaist.setText("Waist");
		cbRestraintWaist.setBounds(10, 65, 60, 22);
		panel_1_1_1_1_2.add(cbRestraintWaist);

		cbRestraintChair = new JCheckBox();
		cbRestraintChair.setOpaque(false);
		cbRestraintChair.setText("Chair");
		cbRestraintChair.setBounds(112, 37, 78, 22);
		panel_1_1_1_1_2.add(cbRestraintChair);

		cbRestraintJacket = new JCheckBox();
		cbRestraintJacket.setOpaque(false);
		cbRestraintJacket.setText("Jacket");
		cbRestraintJacket.setBounds(112, 65, 78, 22);
		panel_1_1_1_1_2.add(cbRestraintJacket);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setLayout(null);
		panel_3.setBounds(367, 731, 207, 42);
		panel.add(panel_3);

		final JLabel bladderLabel_1_1_1_2_1 = new JLabel();
		bladderLabel_1_1_1_2_1.setBounds(0, 0, 208, 43);
		panel_3.add(bladderLabel_1_1_1_2_1);
		bladderLabel_1_1_1_2_1.setBackground(Color.BLACK);
		bladderLabel_1_1_1_2_1.setForeground(Color.WHITE);
		bladderLabel_1_1_1_2_1
				.setText("<HTML><BODY>IMPORTANT : CHECK EVERY 30 MINS.<BR>AND RELEASE AT LEAST EVERY TWO HOURS</BODY></HTML>");

		final JPanel panel_1_1_1_1_2_1 = new JPanel();
		panel_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_2_1.setLayout(null);
		panel_1_1_1_1_2_1.setBounds(367, 775, 207, 135);
		panel.add(panel_1_1_1_1_2_1);

		final JPanel panel_2_1_1_1_2_1 = new JPanel();
		panel_2_1_1_1_2_1.setBackground(Color.BLACK);
		panel_2_1_1_1_2_1.setLayout(null);
		panel_2_1_1_1_2_1.setBounds(0, 10, 281, 33);
		panel_1_1_1_1_2_1.add(panel_2_1_1_1_2_1);

		final JLabel bladderLabel_1_1_1_2_2 = new JLabel();
		bladderLabel_1_1_1_2_2.setBackground(Color.BLACK);
		bladderLabel_1_1_1_2_2.setForeground(Color.WHITE);
		bladderLabel_1_1_1_2_2.setText("SIDERAILS");
		bladderLabel_1_1_1_2_2.setBounds(8, 0, 206, 33);
		panel_2_1_1_1_2_1.add(bladderLabel_1_1_1_2_2);

		cbSideRailsConstantly = new JCheckBox();
		cbSideRailsConstantly.setOpaque(false);
		cbSideRailsConstantly.setText("Constantly");
		cbSideRailsConstantly.setBounds(19, 58, 81, 17);
		panel_1_1_1_1_2_1.add(cbSideRailsConstantly);

		cbSideRailsAtNight = new JCheckBox();
		cbSideRailsAtNight.setOpaque(false);
		cbSideRailsAtNight.setText("At night");
		cbSideRailsAtNight.setBounds(19, 81, 138, 16);
		panel_1_1_1_1_2_1.add(cbSideRailsAtNight);

		cbSideRailsOmit = new JCheckBox();
		cbSideRailsOmit.setOpaque(false);
		cbSideRailsOmit.setText("Omit");
		cbSideRailsOmit.setBounds(19, 103, 60, 22);
		panel_1_1_1_1_2_1.add(cbSideRailsOmit);

		final JPanel panel_1_1_1_4_1 = new JPanel();
		panel_1_1_1_4_1.setBackground(Color.WHITE);
		panel_1_1_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4_1.setLayout(null);
		panel_1_1_1_4_1.setBounds(574, 30, 193, 314);
		panel.add(panel_1_1_1_4_1);

		final JPanel panel_2_1_1_4_1 = new JPanel();
		panel_2_1_1_4_1.setBackground(Color.BLACK);
		panel_2_1_1_4_1.setLayout(null);
		panel_2_1_1_4_1.setBounds(0, 0, 281, 26);
		panel_1_1_1_4_1.add(panel_2_1_1_4_1);

		final JLabel bladderLabel_1_1_4_1 = new JLabel();
		bladderLabel_1_1_4_1.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1.setText("SUPPORTIVE");
		bladderLabel_1_1_4_1.setBounds(8, 0, 204, 33);
		panel_2_1_1_4_1.add(bladderLabel_1_1_4_1);

		cbSupportiveBedCradle = new JCheckBox();
		cbSupportiveBedCradle.setOpaque(false);
		cbSupportiveBedCradle.setText("Bed Cradle");
		cbSupportiveBedCradle.setBounds(10, 32, 120, 22);
		panel_1_1_1_4_1.add(cbSupportiveBedCradle);

		cbSupportiveFootBoard = new JCheckBox();
		cbSupportiveFootBoard.setOpaque(false);
		cbSupportiveFootBoard.setText("Foot board");
		cbSupportiveFootBoard.setBounds(10, 60, 135, 22);
		panel_1_1_1_4_1.add(cbSupportiveFootBoard);

		cbSupportiveTrapeze = new JCheckBox();
		cbSupportiveTrapeze.setOpaque(false);
		cbSupportiveTrapeze.setText("Trapaze");
		cbSupportiveTrapeze.setBounds(10, 88, 94, 18);
		panel_1_1_1_4_1.add(cbSupportiveTrapeze);

		cbSupportivePillows = new JCheckBox();
		cbSupportivePillows.setOpaque(false);
		cbSupportivePillows.setText("Pllows");
		cbSupportivePillows.setBounds(10, 112, 65, 18);
		panel_1_1_1_4_1.add(cbSupportivePillows);

		cbSupportiveBedBoard = new JCheckBox();
		cbSupportiveBedBoard.setOpaque(false);
		cbSupportiveBedBoard.setText("Bed board");
		cbSupportiveBedBoard.setBounds(10, 136, 94, 18);
		panel_1_1_1_4_1.add(cbSupportiveBedBoard);

		cbSupportiveBrace = new JCheckBox();
		cbSupportiveBrace.setOpaque(false);
		cbSupportiveBrace.setText("Brace");
		cbSupportiveBrace.setBounds(10, 160, 94, 18);
		panel_1_1_1_4_1.add(cbSupportiveBrace);

		cbSupportiveFoamRubber = new JCheckBox();
		cbSupportiveFoamRubber.setOpaque(false);
		cbSupportiveFoamRubber.setText("Foam rubber");
		cbSupportiveFoamRubber.setBounds(10, 184, 120, 18);
		panel_1_1_1_4_1.add(cbSupportiveFoamRubber);

		cbSupportiveSpecialMattress = new JCheckBox();
		cbSupportiveSpecialMattress.setOpaque(false);
		cbSupportiveSpecialMattress.setText("Special mattress");
		cbSupportiveSpecialMattress.setBounds(10, 208, 109, 18);
		panel_1_1_1_4_1.add(cbSupportiveSpecialMattress);

		cbSupportiveWaterMattress = new JCheckBox();
		cbSupportiveWaterMattress.setOpaque(false);
		cbSupportiveWaterMattress.setText("Water mattress");
		cbSupportiveWaterMattress.setBounds(10, 237, 109, 18);
		panel_1_1_1_4_1.add(cbSupportiveWaterMattress);

		cbSupportiveWaterBed = new JCheckBox();
		cbSupportiveWaterBed.setOpaque(false);
		cbSupportiveWaterBed.setText("Water bed");
		cbSupportiveWaterBed.setBounds(10, 261, 109, 18);
		panel_1_1_1_4_1.add(cbSupportiveWaterBed);

		cbSupportiveAfterPressurePad = new JCheckBox();
		cbSupportiveAfterPressurePad.setOpaque(false);
		cbSupportiveAfterPressurePad.setText("After pressure pad");
		cbSupportiveAfterPressurePad.setBounds(10, 285, 186, 14);
		panel_1_1_1_4_1.add(cbSupportiveAfterPressurePad);

		final JPanel panel_1_1_1_4_1_1 = new JPanel();
		panel_1_1_1_4_1_1.setBackground(Color.WHITE);
		panel_1_1_1_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4_1_1.setLayout(null);
		panel_1_1_1_4_1_1.setBounds(574, 344, 193, 123);
		panel.add(panel_1_1_1_4_1_1);

		final JPanel panel_2_1_1_4_1_1 = new JPanel();
		panel_2_1_1_4_1_1.setBackground(Color.BLACK);
		panel_2_1_1_4_1_1.setLayout(null);
		panel_2_1_1_4_1_1.setBounds(0, 0, 281, 33);
		panel_1_1_1_4_1_1.add(panel_2_1_1_4_1_1);

		final JLabel bladderLabel_1_1_4_1_1 = new JLabel();
		bladderLabel_1_1_4_1_1.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1_1.setText("SPECIAL EQUIPMENT");
		bladderLabel_1_1_4_1_1.setBounds(8, 0, 204, 33);
		panel_2_1_1_4_1_1.add(bladderLabel_1_1_4_1_1);

		cbSpecialEquipmentProsthesis = new JCheckBox();
		cbSpecialEquipmentProsthesis.setOpaque(false);
		cbSpecialEquipmentProsthesis.setText("Prosthesis");
		cbSpecialEquipmentProsthesis.setBounds(14, 39, 120, 14);
		panel_1_1_1_4_1_1.add(cbSpecialEquipmentProsthesis);

		cbSpecialEquipmentTotalCare = new JCheckBox();
		cbSpecialEquipmentTotalCare.setOpaque(false);
		cbSpecialEquipmentTotalCare.setText("Total Care");
		cbSpecialEquipmentTotalCare.setBounds(15, 97, 76, 18);
		panel_1_1_1_4_1_1.add(cbSpecialEquipmentTotalCare);

		final JLabel typeLabel = new JLabel();
		typeLabel.setText("Type");
		typeLabel.setBounds(104, 101, 30, 14);
		panel_1_1_1_4_1_1.add(typeLabel);

		txtSpecialEquipmentTotalCareType = new JTextField();
		txtSpecialEquipmentTotalCareType.setBounds(140, 96, 46, 21);
		panel_1_1_1_4_1_1.add(txtSpecialEquipmentTotalCareType);

		cbSpecialEquipmentSelf = new JCheckBox();
		cbSpecialEquipmentSelf.setOpaque(false);
		cbSpecialEquipmentSelf.setText("Self");
		cbSpecialEquipmentSelf.setBounds(14, 59, 135, 14);
		panel_1_1_1_4_1_1.add(cbSpecialEquipmentSelf);

		cbSpecialEquipmentAssist = new JCheckBox();
		cbSpecialEquipmentAssist.setOpaque(false);
		cbSpecialEquipmentAssist.setBounds(14, 78, 94, 18);
		panel_1_1_1_4_1_1.add(cbSpecialEquipmentAssist);
		cbSpecialEquipmentAssist.setText("Assist");

		final JPanel panel_1_1_1_4_1_1_1 = new JPanel();
		panel_1_1_1_4_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_4_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4_1_1_1.setLayout(null);
		panel_1_1_1_4_1_1_1.setBounds(574, 466, 193, 123);
		panel.add(panel_1_1_1_4_1_1_1);

		final JPanel panel_2_1_1_4_1_1_1 = new JPanel();
		panel_2_1_1_4_1_1_1.setBackground(Color.BLACK);
		panel_2_1_1_4_1_1_1.setLayout(null);
		panel_2_1_1_4_1_1_1.setBounds(0, 0, 281, 30);
		panel_1_1_1_4_1_1_1.add(panel_2_1_1_4_1_1_1);

		final JLabel bladderLabel_1_1_4_1_1_1 = new JLabel();
		bladderLabel_1_1_4_1_1_1.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1_1_1.setText("BRACES");
		bladderLabel_1_1_4_1_1_1.setBounds(8, 0, 204, 33);
		panel_2_1_1_4_1_1_1.add(bladderLabel_1_1_4_1_1_1);

		cbBracesSelf = new JCheckBox();
		cbBracesSelf.setOpaque(false);
		cbBracesSelf.setText("Self");
		cbBracesSelf.setBounds(22, 36, 120, 14);
		panel_1_1_1_4_1_1_1.add(cbBracesSelf);

		cbBracesAssist = new JCheckBox();
		cbBracesAssist.setOpaque(false);
		cbBracesAssist.setText("Assist");
		cbBracesAssist.setBounds(22, 57, 135, 14);
		panel_1_1_1_4_1_1_1.add(cbBracesAssist);

		cbBracesTotalCare = new JCheckBox();
		cbBracesTotalCare.setOpaque(false);
		cbBracesTotalCare.setText("Total Care");
		cbBracesTotalCare.setBounds(22, 77, 94, 14);
		panel_1_1_1_4_1_1_1.add(cbBracesTotalCare);

		final JLabel typeLabel_1 = new JLabel();
		typeLabel_1.setText("Type");
		typeLabel_1.setBounds(22, 97, 41, 14);
		panel_1_1_1_4_1_1_1.add(typeLabel_1);

		txtBracesType = new JTextField();
		txtBracesType.setBounds(69, 94, 94, 21);
		panel_1_1_1_4_1_1_1.add(txtBracesType);

		final JPanel panel_1_1_1_4_1_2 = new JPanel();
		panel_1_1_1_4_1_2.setBackground(Color.WHITE);
		panel_1_1_1_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4_1_2.setLayout(null);
		panel_1_1_1_4_1_2.setBounds(574, 588, 193, 231);
		panel.add(panel_1_1_1_4_1_2);

		final JPanel panel_2_1_1_4_1_2 = new JPanel();
		panel_2_1_1_4_1_2.setBackground(Color.BLACK);
		panel_2_1_1_4_1_2.setLayout(null);
		panel_2_1_1_4_1_2.setBounds(0, 0, 281, 30);
		panel_1_1_1_4_1_2.add(panel_2_1_1_4_1_2);

		final JLabel bladderLabel_1_1_4_1_2 = new JLabel();
		bladderLabel_1_1_4_1_2.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1_2.setText("MENTAL ATTITUDE");
		bladderLabel_1_1_4_1_2.setBounds(8, 0, 204, 33);
		panel_2_1_1_4_1_2.add(bladderLabel_1_1_4_1_2);

		cbMentalAttitudeOriented = new JCheckBox();
		cbMentalAttitudeOriented.setOpaque(false);
		cbMentalAttitudeOriented.setText("Oriented");
		cbMentalAttitudeOriented.setBounds(10, 42, 120, 22);
		panel_1_1_1_4_1_2.add(cbMentalAttitudeOriented);

		cbMentalAttitudeWellAdjusted = new JCheckBox();
		cbMentalAttitudeWellAdjusted.setOpaque(false);
		cbMentalAttitudeWellAdjusted.setText("Well adjusted");
		cbMentalAttitudeWellAdjusted.setBounds(10, 62, 135, 22);
		panel_1_1_1_4_1_2.add(cbMentalAttitudeWellAdjusted);

		cbMentalAttitudeMoody = new JCheckBox();
		cbMentalAttitudeMoody.setOpaque(false);
		cbMentalAttitudeMoody.setText("Moody");
		cbMentalAttitudeMoody.setBounds(10, 82, 94, 18);
		panel_1_1_1_4_1_2.add(cbMentalAttitudeMoody);

		cbMentalAttitudeCheerful = new JCheckBox();
		cbMentalAttitudeCheerful.setOpaque(false);
		cbMentalAttitudeCheerful.setText("Cheerful");
		cbMentalAttitudeCheerful.setBounds(10, 101, 186, 18);
		panel_1_1_1_4_1_2.add(cbMentalAttitudeCheerful);

		cbMentalAttitudeDepressed = new JCheckBox();
		cbMentalAttitudeDepressed.setOpaque(false);
		cbMentalAttitudeDepressed.setText("Depressed");
		cbMentalAttitudeDepressed.setBounds(10, 120, 94, 18);
		panel_1_1_1_4_1_2.add(cbMentalAttitudeDepressed);

		cbMentalAttitudeConfused = new JCheckBox();
		cbMentalAttitudeConfused.setOpaque(false);
		cbMentalAttitudeConfused.setText("Confused");
		cbMentalAttitudeConfused.setBounds(10, 139, 94, 18);
		panel_1_1_1_4_1_2.add(cbMentalAttitudeConfused);

		cbMentalAttitudeAlert = new JCheckBox();
		cbMentalAttitudeAlert.setOpaque(false);
		cbMentalAttitudeAlert.setText("Alert");
		cbMentalAttitudeAlert.setBounds(10, 163, 120, 18);
		panel_1_1_1_4_1_2.add(cbMentalAttitudeAlert);

		cbMentalAttitudeAgitated = new JCheckBox();
		cbMentalAttitudeAgitated.setOpaque(false);
		cbMentalAttitudeAgitated.setText("Agitated");
		cbMentalAttitudeAgitated.setBounds(10, 188, 109, 18);
		panel_1_1_1_4_1_2.add(cbMentalAttitudeAgitated);

		cbMentalAttitudeForgetFul = new JCheckBox();
		cbMentalAttitudeForgetFul.setOpaque(false);
		cbMentalAttitudeForgetFul.setText("Forgetful");
		cbMentalAttitudeForgetFul.setBounds(10, 209, 109, 18);
		panel_1_1_1_4_1_2.add(cbMentalAttitudeForgetFul);

		final JPanel panel_1_1_1_1_2_1_1 = new JPanel();
		panel_1_1_1_1_2_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_2_1_1.setLayout(null);
		panel_1_1_1_1_2_1_1.setBounds(574, 817, 361, 93);
		panel.add(panel_1_1_1_1_2_1_1);

		final JPanel panel_2_1_1_1_2_1_1 = new JPanel();
		panel_2_1_1_1_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1_1_2_1_1.setLayout(null);
		panel_2_1_1_1_2_1_1.setBounds(0, 0, 561, 30);
		panel_1_1_1_1_2_1_1.add(panel_2_1_1_1_2_1_1);

		final JLabel bladderLabel_1_1_1_2_2_1 = new JLabel();
		bladderLabel_1_1_1_2_2_1.setForeground(Color.WHITE);
		bladderLabel_1_1_1_2_2_1.setText("SPECIAL CARE NEEDS/REQUESTS");
		bladderLabel_1_1_1_2_2_1.setBounds(8, 0, 206, 30);
		panel_2_1_1_1_2_1_1.add(bladderLabel_1_1_1_2_2_1);

		final JLabel residentStrengthsLabel = new JLabel();
		residentStrengthsLabel.setText("Resident Strengths :");
		residentStrengthsLabel.setBounds(10, 36, 128, 14);
		panel_1_1_1_1_2_1_1.add(residentStrengthsLabel);

		final JLabel riskFactorsToLabel = new JLabel();
		riskFactorsToLabel.setText("Risk Factors to Consider: ");
		riskFactorsToLabel.setBounds(10, 56, 192, 14);
		panel_1_1_1_1_2_1_1.add(riskFactorsToLabel);

		final JLabel specificLabel = new JLabel();
		specificLabel.setText("Specific Task Segmentations");
		specificLabel.setBounds(10, 76, 145, 14);
		panel_1_1_1_1_2_1_1.add(specificLabel);

		txtResidentStrengths = new JTextField();
		txtResidentStrengths.setBounds(157, 36, 185, 18);
		panel_1_1_1_1_2_1_1.add(txtResidentStrengths);

		txtRiskFactors = new JTextField();
		txtRiskFactors.setBounds(157, 54, 185, 18);
		panel_1_1_1_1_2_1_1.add(txtRiskFactors);

		txtSpecificTask = new JTextField();
		txtSpecificTask.setBounds(156, 73, 185, 18);
		panel_1_1_1_1_2_1_1.add(txtSpecificTask);

		final JPanel panel_1_1_1_4_1_3 = new JPanel();
		panel_1_1_1_4_1_3.setBackground(Color.WHITE);
		panel_1_1_1_4_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4_1_3.setLayout(null);
		panel_1_1_1_4_1_3.setBounds(767, 30, 168, 231);
		panel.add(panel_1_1_1_4_1_3);

		final JPanel panel_2_1_1_4_1_3 = new JPanel();
		panel_2_1_1_4_1_3.setBackground(Color.BLACK);
		panel_2_1_1_4_1_3.setLayout(null);
		panel_2_1_1_4_1_3.setBounds(0, 0, 281, 26);
		panel_1_1_1_4_1_3.add(panel_2_1_1_4_1_3);

		final JLabel bladderLabel_1_1_4_1_3 = new JLabel();
		bladderLabel_1_1_4_1_3.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1_3.setText("BATH");
		bladderLabel_1_1_4_1_3.setBounds(8, 0, 204, 20);
		panel_2_1_1_4_1_3.add(bladderLabel_1_1_4_1_3);

		cbBathTub = new JCheckBox();
		cbBathTub.setOpaque(false);
		cbBathTub.setText("Tub/Whirlpool");
		cbBathTub.setBounds(10, 32, 110, 22);
		panel_1_1_1_4_1_3.add(cbBathTub);

		cbBathShower = new JCheckBox();
		cbBathShower.setOpaque(false);
		cbBathShower.setText("Shower");
		cbBathShower.setBounds(10, 60, 135, 22);
		panel_1_1_1_4_1_3.add(cbBathShower);

		cbBathSelfCare = new JCheckBox();
		cbBathSelfCare.setOpaque(false);
		cbBathSelfCare.setText("Self Care");
		cbBathSelfCare.setBounds(10, 88, 94, 18);
		panel_1_1_1_4_1_3.add(cbBathSelfCare);

		cbBathHairCare = new JCheckBox();
		cbBathHairCare.setOpaque(false);
		cbBathHairCare.setText("Hair Care");
		cbBathHairCare.setBounds(10, 120, 183, 18);
		panel_1_1_1_4_1_3.add(cbBathHairCare);

		cbBathAssist = new JCheckBox();
		cbBathAssist.setOpaque(false);
		cbBathAssist.setText("Assist");
		cbBathAssist.setBounds(10, 144, 94, 18);
		panel_1_1_1_4_1_3.add(cbBathAssist);

		cbBathTotalCare = new JCheckBox();
		cbBathTotalCare.setOpaque(false);
		cbBathTotalCare.setText("Total care");
		cbBathTotalCare.setBounds(10, 168, 94, 18);
		panel_1_1_1_4_1_3.add(cbBathTotalCare);

		cbBathBed = new JCheckBox();
		cbBathBed.setOpaque(false);
		cbBathBed.setText("Bed");
		cbBathBed.setBounds(10, 192, 120, 18);
		panel_1_1_1_4_1_3.add(cbBathBed);

		final JPanel panel_1_1_1_4_1_3_1 = new JPanel();
		panel_1_1_1_4_1_3_1.setBackground(Color.WHITE);
		panel_1_1_1_4_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4_1_3_1.setLayout(null);
		panel_1_1_1_4_1_3_1.setBounds(767, 256, 168, 266);
		panel.add(panel_1_1_1_4_1_3_1);

		final JPanel panel_2_1_1_4_1_3_1 = new JPanel();
		panel_2_1_1_4_1_3_1.setBackground(Color.BLACK);
		panel_2_1_1_4_1_3_1.setLayout(null);
		panel_2_1_1_4_1_3_1.setBounds(0, 0, 281, 28);
		panel_1_1_1_4_1_3_1.add(panel_2_1_1_4_1_3_1);

		final JLabel bladderLabel_1_1_4_1_3_1 = new JLabel();
		bladderLabel_1_1_4_1_3_1.setBackground(Color.BLACK);
		bladderLabel_1_1_4_1_3_1.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1_3_1.setText("MOUTH CARE");
		bladderLabel_1_1_4_1_3_1.setBounds(8, 0, 204, 28);
		panel_2_1_1_4_1_3_1.add(bladderLabel_1_1_4_1_3_1);

		cbMouthCareDentures = new JCheckBox();
		cbMouthCareDentures.setOpaque(false);
		cbMouthCareDentures.setText("Dentures");
		cbMouthCareDentures.setBounds(10, 34, 120, 22);
		panel_1_1_1_4_1_3_1.add(cbMouthCareDentures);

		cbMouthCareUpper = new JCheckBox();
		cbMouthCareUpper.setOpaque(false);
		cbMouthCareUpper.setText("Upper");
		cbMouthCareUpper.setBounds(10, 62, 135, 14);
		panel_1_1_1_4_1_3_1.add(cbMouthCareUpper);

		cbMouthCareLower = new JCheckBox();
		cbMouthCareLower.setOpaque(false);
		cbMouthCareLower.setText("Lower");
		cbMouthCareLower.setBounds(10, 82, 94, 14);
		panel_1_1_1_4_1_3_1.add(cbMouthCareLower);

		cbMouthCareNoDentures = new JCheckBox();
		cbMouthCareNoDentures.setOpaque(false);
		cbMouthCareNoDentures.setText("No dentures");
		cbMouthCareNoDentures.setBounds(10, 102, 135, 18);
		panel_1_1_1_4_1_3_1.add(cbMouthCareNoDentures);

		cbMouthCareNoTeeth = new JCheckBox();
		cbMouthCareNoTeeth.setOpaque(false);
		cbMouthCareNoTeeth.setText("No teeth");
		cbMouthCareNoTeeth.setBounds(10, 126, 94, 18);
		panel_1_1_1_4_1_3_1.add(cbMouthCareNoTeeth);

		cbMouthCareAtBedSise = new JCheckBox();
		cbMouthCareAtBedSise.setOpaque(false);
		cbMouthCareAtBedSise.setText("At bedside");
		cbMouthCareAtBedSise.setBounds(10, 150, 94, 18);
		panel_1_1_1_4_1_3_1.add(cbMouthCareAtBedSise);

		cbMouthCareSelfCare = new JCheckBox();
		cbMouthCareSelfCare.setOpaque(false);
		cbMouthCareSelfCare.setText("Self Care");
		cbMouthCareSelfCare.setBounds(10, 174, 120, 18);
		panel_1_1_1_4_1_3_1.add(cbMouthCareSelfCare);

		cbMouthCareAssist = new JCheckBox();
		cbMouthCareAssist.setOpaque(false);
		cbMouthCareAssist.setText("Assist");
		cbMouthCareAssist.setBounds(10, 198, 120, 18);
		panel_1_1_1_4_1_3_1.add(cbMouthCareAssist);

		cbMouthCareSupervise = new JCheckBox();
		cbMouthCareSupervise.setOpaque(false);
		cbMouthCareSupervise.setText("Supervise");
		cbMouthCareSupervise.setBounds(10, 222, 120, 18);
		panel_1_1_1_4_1_3_1.add(cbMouthCareSupervise);

		cbMouthCareTotalCare = new JCheckBox();
		cbMouthCareTotalCare.setOpaque(false);
		cbMouthCareTotalCare.setText("Total Care");
		cbMouthCareTotalCare.setBounds(10, 246, 120, 18);
		panel_1_1_1_4_1_3_1.add(cbMouthCareTotalCare);

		final JPanel panel_1_1_1_4_1_3_1_1 = new JPanel();
		panel_1_1_1_4_1_3_1_1.setBackground(Color.WHITE);
		panel_1_1_1_4_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4_1_3_1_1.setLayout(null);
		panel_1_1_1_4_1_3_1_1.setBounds(767, 521, 168, 187);
		panel.add(panel_1_1_1_4_1_3_1_1);

		final JPanel panel_2_1_1_4_1_3_1_1 = new JPanel();
		panel_2_1_1_4_1_3_1_1.setBackground(Color.BLACK);
		panel_2_1_1_4_1_3_1_1.setLayout(null);
		panel_2_1_1_4_1_3_1_1.setBounds(0, 0, 281, 28);
		panel_1_1_1_4_1_3_1_1.add(panel_2_1_1_4_1_3_1_1);

		final JLabel bladderLabel_1_1_4_1_3_1_1 = new JLabel();
		bladderLabel_1_1_4_1_3_1_1.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1_3_1_1.setText("SKIN");
		bladderLabel_1_1_4_1_3_1_1.setBounds(8, 0, 204, 27);
		panel_2_1_1_4_1_3_1_1.add(bladderLabel_1_1_4_1_3_1_1);

		cbSkinRoutine = new JCheckBox();
		cbSkinRoutine.setOpaque(false);
		cbSkinRoutine.setText("Routine");
		cbSkinRoutine.setBounds(15, 49, 120, 14);
		panel_1_1_1_4_1_3_1_1.add(cbSkinRoutine);

		cbSkinSpecial = new JCheckBox();
		cbSkinSpecial.setOpaque(false);
		cbSkinSpecial.setText("Special");
		cbSkinSpecial.setBounds(15, 69, 135, 18);
		panel_1_1_1_4_1_3_1_1.add(cbSkinSpecial);

		cbSkinDecubitus = new JCheckBox();
		cbSkinDecubitus.setOpaque(false);
		cbSkinDecubitus.setText("Decubitus");
		cbSkinDecubitus.setBounds(15, 93, 94, 18);
		panel_1_1_1_4_1_3_1_1.add(cbSkinDecubitus);

		final JLabel siteLabel = new JLabel();
		siteLabel.setText("Site :");
		siteLabel.setBounds(25, 117, 25, 14);
		panel_1_1_1_4_1_3_1_1.add(siteLabel);

		txtSkinDecubitusSite = new JTextArea();
		txtSkinDecubitusSite.setBorder(new LineBorder(Color.black, 1, false));
		txtSkinDecubitusSite.setBounds(56, 117, 94, 18);
		panel_1_1_1_4_1_3_1_1.add(txtSkinDecubitusSite);

		cbSkinContractures = new JCheckBox();
		cbSkinContractures.setOpaque(false);
		cbSkinContractures.setText("Contractures");
		cbSkinContractures.setBounds(15, 137, 94, 18);
		panel_1_1_1_4_1_3_1_1.add(cbSkinContractures);

		final JLabel siteLabel_1 = new JLabel();
		siteLabel_1.setText("Site: ");
		siteLabel_1.setBounds(25, 161, 54, 14);
		panel_1_1_1_4_1_3_1_1.add(siteLabel_1);

		txtSkinContracturesSite = new JTextArea();
		txtSkinContracturesSite
				.setBorder(new LineBorder(Color.black, 1, false));
		txtSkinContracturesSite.setBounds(56, 161, 94, 18);
		panel_1_1_1_4_1_3_1_1.add(txtSkinContracturesSite);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(767, 733, 168, 86);
		panel.add(panel_5);

		final JPanel panel_1_1_1_4_1_3_2 = new JPanel();
		panel_1_1_1_4_1_3_2.setBackground(Color.WHITE);
		panel_1_1_1_4_1_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4_1_3_2.setLayout(null);
		panel_1_1_1_4_1_3_2.setBounds(935, 30, 168, 231);
		panel.add(panel_1_1_1_4_1_3_2);

		final JPanel panel_2_1_1_4_1_3_2 = new JPanel();
		panel_2_1_1_4_1_3_2.setBackground(Color.BLACK);
		panel_2_1_1_4_1_3_2.setLayout(null);
		panel_2_1_1_4_1_3_2.setBounds(0, 0, 281, 26);
		panel_1_1_1_4_1_3_2.add(panel_2_1_1_4_1_3_2);

		final JLabel bladderLabel_1_1_4_1_3_2 = new JLabel();
		bladderLabel_1_1_4_1_3_2.setBackground(Color.BLACK);
		bladderLabel_1_1_4_1_3_2.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1_3_2.setText("DRESS");
		bladderLabel_1_1_4_1_3_2.setBounds(8, 0, 204, 22);
		panel_2_1_1_4_1_3_2.add(bladderLabel_1_1_4_1_3_2);

		cbDressShoes = new JCheckBox();
		cbDressShoes.setOpaque(false);
		cbDressShoes.setText("Shoes");
		cbDressShoes.setBounds(32, 49, 120, 22);
		panel_1_1_1_4_1_3_2.add(cbDressShoes);

		cbDressShocking = new JCheckBox();
		cbDressShocking.setOpaque(false);
		cbDressShocking.setText("Stockings");
		cbDressShocking.setBounds(32, 77, 135, 22);
		panel_1_1_1_4_1_3_2.add(cbDressShocking);

		cbDressClothes = new JCheckBox();
		cbDressClothes.setOpaque(false);
		cbDressClothes.setText("Clothes");
		cbDressClothes.setBounds(32, 105, 94, 18);
		panel_1_1_1_4_1_3_2.add(cbDressClothes);

		cbDressSelfCare = new JCheckBox();
		cbDressSelfCare.setOpaque(false);
		cbDressSelfCare.setText("Self Care");
		cbDressSelfCare.setBounds(32, 129, 94, 18);
		panel_1_1_1_4_1_3_2.add(cbDressSelfCare);

		cbDressAssist = new JCheckBox();
		cbDressAssist.setOpaque(false);
		cbDressAssist.setText("Assist");
		cbDressAssist.setBounds(32, 153, 94, 18);
		panel_1_1_1_4_1_3_2.add(cbDressAssist);

		cbDressSupervise = new JCheckBox();
		cbDressSupervise.setOpaque(false);
		cbDressSupervise.setText("Supervise");
		cbDressSupervise.setBounds(32, 177, 94, 18);
		panel_1_1_1_4_1_3_2.add(cbDressSupervise);

		cbDressTotalCare = new JCheckBox();
		cbDressTotalCare.setOpaque(false);
		cbDressTotalCare.setText("Total Care");
		cbDressTotalCare.setBounds(32, 203, 120, 18);
		panel_1_1_1_4_1_3_2.add(cbDressTotalCare);

		final JPanel panel_1_1_1_4_1_3_2_1 = new JPanel();
		panel_1_1_1_4_1_3_2_1.setBackground(Color.WHITE);
		panel_1_1_1_4_1_3_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4_1_3_2_1.setLayout(null);
		panel_1_1_1_4_1_3_2_1.setBounds(935, 256, 168, 285);
		panel.add(panel_1_1_1_4_1_3_2_1);

		final JPanel panel_2_1_1_4_1_3_2_1 = new JPanel();
		panel_2_1_1_4_1_3_2_1.setBackground(Color.BLACK);
		panel_2_1_1_4_1_3_2_1.setForeground(Color.WHITE);
		panel_2_1_1_4_1_3_2_1.setLayout(null);
		panel_2_1_1_4_1_3_2_1.setBounds(0, 0, 281, 28);
		panel_1_1_1_4_1_3_2_1.add(panel_2_1_1_4_1_3_2_1);

		final JLabel bladderLabel_1_1_4_1_3_2_1 = new JLabel();
		bladderLabel_1_1_4_1_3_2_1.setBounds(22, 0, 204, 33);
		panel_2_1_1_4_1_3_2_1.add(bladderLabel_1_1_4_1_3_2_1);
		bladderLabel_1_1_4_1_3_2_1.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1_3_2_1.setText("GROOMING");

		cbGroomingComb = new JCheckBox();
		cbGroomingComb.setOpaque(false);
		cbGroomingComb.setText("Comb/brush hair");
		cbGroomingComb.setBounds(28, 36, 120, 22);
		panel_1_1_1_4_1_3_2_1.add(cbGroomingComb);

		cbGroomingShave = new JCheckBox();
		cbGroomingShave.setOpaque(false);
		cbGroomingShave.setText("Shave");
		cbGroomingShave.setBounds(28, 64, 135, 22);
		panel_1_1_1_4_1_3_2_1.add(cbGroomingShave);

		cbGroomingNails = new JCheckBox();
		cbGroomingNails.setOpaque(false);
		cbGroomingNails.setText("Nails");
		cbGroomingNails.setBounds(28, 92, 94, 18);
		panel_1_1_1_4_1_3_2_1.add(cbGroomingNails);

		cbGroomingFeet = new JCheckBox();
		cbGroomingFeet.setOpaque(false);
		cbGroomingFeet.setText("Feet");
		cbGroomingFeet.setBounds(28, 116, 94, 18);
		panel_1_1_1_4_1_3_2_1.add(cbGroomingFeet);

		cbGroomingHairDresser = new JCheckBox();
		cbGroomingHairDresser.setOpaque(false);
		cbGroomingHairDresser.setText("Hairdressar");
		cbGroomingHairDresser.setBounds(28, 140, 94, 18);
		panel_1_1_1_4_1_3_2_1.add(cbGroomingHairDresser);

		cbGroomingSelfCare = new JCheckBox();
		cbGroomingSelfCare.setOpaque(false);
		cbGroomingSelfCare.setText("Self care");
		cbGroomingSelfCare.setBounds(28, 164, 94, 18);
		panel_1_1_1_4_1_3_2_1.add(cbGroomingSelfCare);

		cbGroomingAssist = new JCheckBox();
		cbGroomingAssist.setOpaque(false);
		cbGroomingAssist.setText("Assist");
		cbGroomingAssist.setBounds(28, 188, 120, 18);
		panel_1_1_1_4_1_3_2_1.add(cbGroomingAssist);

		cbGroomingSupervise = new JCheckBox();
		cbGroomingSupervise.setOpaque(false);
		cbGroomingSupervise.setText("Supervise");
		cbGroomingSupervise.setBounds(28, 212, 120, 18);
		panel_1_1_1_4_1_3_2_1.add(cbGroomingSupervise);

		cbGroomingTotalCare = new JCheckBox();
		cbGroomingTotalCare.setOpaque(false);
		cbGroomingTotalCare.setText("Total care");
		cbGroomingTotalCare.setBounds(28, 236, 120, 18);
		panel_1_1_1_4_1_3_2_1.add(cbGroomingTotalCare);

		cbGroomingPodatrist = new JCheckBox();
		cbGroomingPodatrist.setOpaque(false);
		cbGroomingPodatrist.setText("Podiatrist");
		cbGroomingPodatrist.setBounds(28, 260, 120, 18);
		panel_1_1_1_4_1_3_2_1.add(cbGroomingPodatrist);

		final JPanel panel_1_1_1_4_1_3_2_1_1 = new JPanel();
		panel_1_1_1_4_1_3_2_1_1.setBackground(Color.WHITE);
		panel_1_1_1_4_1_3_2_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_4_1_3_2_1_1.setLayout(null);
		panel_1_1_1_4_1_3_2_1_1.setBounds(935, 545, 168, 365);
		panel.add(panel_1_1_1_4_1_3_2_1_1);

		final JPanel panel_2_1_1_4_1_3_2_1_1 = new JPanel();
		panel_2_1_1_4_1_3_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1_4_1_3_2_1_1.setLayout(null);
		panel_2_1_1_4_1_3_2_1_1.setBounds(0, 0, 281, 30);
		panel_1_1_1_4_1_3_2_1_1.add(panel_2_1_1_4_1_3_2_1_1);

		final JLabel bladderLabel_1_1_4_1_3_2_1_1 = new JLabel();
		bladderLabel_1_1_4_1_3_2_1_1.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1_3_2_1_1.setText("RESTORATIVE");
		bladderLabel_1_1_4_1_3_2_1_1.setBounds(22, 0, 204, 33);
		panel_2_1_1_4_1_3_2_1_1.add(bladderLabel_1_1_4_1_3_2_1_1);

		cbRestorativeRoom = new JCheckBox();
		cbRestorativeRoom.setOpaque(false);
		cbRestorativeRoom.setText("ROM");
		cbRestorativeRoom.setBounds(28, 36, 120, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeRoom);

		cbRestorativeProm = new JCheckBox();
		cbRestorativeProm.setOpaque(false);
		cbRestorativeProm.setText("PROM");
		cbRestorativeProm.setBounds(28, 56, 135, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeProm);

		cbRestorativeAarom = new JCheckBox();
		cbRestorativeAarom.setOpaque(false);
		cbRestorativeAarom.setText("AAROM");
		cbRestorativeAarom.setBounds(28, 76, 94, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeAarom);

		cbRestorativeSplintBraceAssist = new JCheckBox();
		cbRestorativeSplintBraceAssist.setOpaque(false);
		cbRestorativeSplintBraceAssist.setText("Splint/Brace Assist");
		cbRestorativeSplintBraceAssist.setBounds(29, 96, 134, 18);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeSplintBraceAssist);

		cbRestorativeBedMobility = new JCheckBox();
		cbRestorativeBedMobility.setOpaque(false);
		cbRestorativeBedMobility.setText("Bed Mobility");
		cbRestorativeBedMobility.setBounds(28, 140, 94, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeBedMobility);

		cbRestorativeTransfer = new JCheckBox();
		cbRestorativeTransfer.setOpaque(false);
		cbRestorativeTransfer.setText("Transfer");
		cbRestorativeTransfer.setBounds(28, 160, 120, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeTransfer);

		cbRestorativeWalking = new JCheckBox();
		cbRestorativeWalking.setOpaque(false);
		cbRestorativeWalking.setText("Walking");
		cbRestorativeWalking.setBounds(28, 180, 120, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeWalking);

		cbRestorativeDressingGrooming = new JCheckBox();
		cbRestorativeDressingGrooming.setOpaque(false);
		cbRestorativeDressingGrooming.setText("Dressing/Grooming");
		cbRestorativeDressingGrooming.setBounds(28, 200, 120, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeDressingGrooming);

		cbRestorativeEatingSwallowing = new JCheckBox();
		cbRestorativeEatingSwallowing.setOpaque(false);
		cbRestorativeEatingSwallowing.setText("Eating/swallowing");
		cbRestorativeEatingSwallowing.setBounds(28, 220, 120, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeEatingSwallowing);

		final JLabel trainingskillPracticeLabel = new JLabel();
		trainingskillPracticeLabel.setText("Training/Skill Practice");
		trainingskillPracticeLabel.setBounds(28, 120, 147, 14);
		panel_1_1_1_4_1_3_2_1_1.add(trainingskillPracticeLabel);

		cbRestorativeAmputation = new JCheckBox();
		cbRestorativeAmputation.setOpaque(false);
		cbRestorativeAmputation.setText("Amputation/prosthess");
		cbRestorativeAmputation.setBounds(28, 240, 160, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeAmputation);

		cbRestorativeCommunication = new JCheckBox();
		cbRestorativeCommunication.setOpaque(false);
		cbRestorativeCommunication.setText("Communication");
		cbRestorativeCommunication.setBounds(28, 260, 120, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeCommunication);

		cbRestorativeOthers = new JCheckBox();
		cbRestorativeOthers.setOpaque(false);
		cbRestorativeOthers.setText("Other");
		cbRestorativeOthers.setBounds(28, 280, 61, 14);
		panel_1_1_1_4_1_3_2_1_1.add(cbRestorativeOthers);

		txtRestorativeOthers = new JTextArea();
		txtRestorativeOthers.setBorder(new LineBorder(Color.black, 1, false));
		txtRestorativeOthers.setBounds(28, 300, 120, 41);
		panel_1_1_1_4_1_3_2_1_1.add(txtRestorativeOthers);

		final JPanel panel_1_1_1_3_1 = new JPanel();
		panel_1_1_1_3_1.setBackground(Color.WHITE);
		panel_1_1_1_3_1.setBounds(367, 308, 207, 57);
		panel.add(panel_1_1_1_3_1);
		panel_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_3_1.setLayout(null);

		final JPanel panel_2_1_1_3_1 = new JPanel();
		panel_2_1_1_3_1.setBackground(Color.BLACK);
		panel_2_1_1_3_1.setLayout(null);
		panel_2_1_1_3_1.setBounds(0, 0, 281, 28);
		panel_1_1_1_3_1.add(panel_2_1_1_3_1);

		final JLabel bladderLabel_1_1_3_1 = new JLabel();
		bladderLabel_1_1_3_1.setForeground(Color.WHITE);
		bladderLabel_1_1_3_1.setText("DEXTERITY");
		bladderLabel_1_1_3_1.setBounds(8, 0, 204, 23);
		panel_2_1_1_3_1.add(bladderLabel_1_1_3_1);

		cbDexterityRightHand = new JCheckBox();
		cbDexterityRightHand.setOpaque(false);
		cbDexterityRightHand.setText("Right hand");
		cbDexterityRightHand.setBounds(27, 34, 81, 22);
		panel_1_1_1_3_1.add(cbDexterityRightHand);

		cbDexterityLeftHand = new JCheckBox();
		cbDexterityLeftHand.setOpaque(false);
		cbDexterityLeftHand.setText("Left hand");
		cbDexterityLeftHand.setBounds(134, 34, 81, 22);
		panel_1_1_1_3_1.add(cbDexterityLeftHand);

		final JPanel panel_1_1_1_2_1 = new JPanel();
		panel_1_1_1_2_1.setBackground(Color.WHITE);
		panel_1_1_1_2_1.setBounds(168, 545, 199, 132);
		panel.add(panel_1_1_1_2_1);
		panel_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_2_1.setLayout(null);

		final JPanel panel_2_1_1_2_1 = new JPanel();
		panel_2_1_1_2_1.setBackground(Color.BLACK);
		panel_2_1_1_2_1.setLayout(null);
		panel_2_1_1_2_1.setBounds(0, 0, 281, 28);
		panel_1_1_1_2_1.add(panel_2_1_1_2_1);

		final JLabel bladderLabel_1_1_2_1 = new JLabel();
		bladderLabel_1_1_2_1.setForeground(Color.WHITE);
		bladderLabel_1_1_2_1.setText("HEARING");
		bladderLabel_1_1_2_1.setBounds(8, 0, 204, 21);
		panel_2_1_1_2_1.add(bladderLabel_1_1_2_1);

		cbTotallyDeaf = new JCheckBox();
		cbTotallyDeaf.setOpaque(false);
		cbTotallyDeaf.setText("Totally deaf");
		cbTotallyDeaf.setBounds(10, 34, 120, 14);
		panel_1_1_1_2_1.add(cbTotallyDeaf);

		cbPartiallyDeaf = new JCheckBox();
		cbPartiallyDeaf.setOpaque(false);
		cbPartiallyDeaf.setText("Partially deaf");
		cbPartiallyDeaf.setBounds(10, 54, 135, 14);
		panel_1_1_1_2_1.add(cbPartiallyDeaf);

		cbHearingRight = new JCheckBox();
		cbHearingRight.setOpaque(false);
		cbHearingRight.setText("Right");
		cbHearingRight.setBounds(10, 74, 60, 18);
		panel_1_1_1_2_1.add(cbHearingRight);

		cbUsesHearingAid = new JCheckBox();
		cbUsesHearingAid.setOpaque(false);
		cbUsesHearingAid.setText("Uses hearing aid");
		cbUsesHearingAid.setBounds(10, 98, 104, 14);
		panel_1_1_1_2_1.add(cbUsesHearingAid);

		cbHearingLeft = new JCheckBox();
		cbHearingLeft.setOpaque(false);
		cbHearingLeft.setLabel("Left");
		cbHearingLeft.setText("Left");
		cbHearingLeft.setBounds(69, 74, 87, 18);
		panel_1_1_1_2_1.add(cbHearingLeft);

		final JPanel panel_4 = new JPanel();
		panel_4.setBounds(767, 708, 168, 31);
		panel.add(panel_4);
		panel_4.setBackground(Color.BLACK);
		panel_4.setLayout(null);

		final JLabel bladderLabel_1_1_4_1_3_1_1_1 = new JLabel();
		bladderLabel_1_1_4_1_3_1_1_1.setBackground(Color.BLACK);
		bladderLabel_1_1_4_1_3_1_1_1.setForeground(Color.WHITE);
		bladderLabel_1_1_4_1_3_1_1_1.setText("ALLERGIES");
		bladderLabel_1_1_4_1_3_1_1_1.setBounds(0, 0, 253, 31);
		panel_4.add(bladderLabel_1_1_4_1_3_1_1_1);

		final JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 920, 1103, 34);
		panel.add(panel_7);
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 115, 35);
		panel_7.add(panel_8);

		final JLabel ageLabel = new JLabel();
		ageLabel.setBounds(10, 10, 20, 14);
		panel_8.add(ageLabel);
		ageLabel.setText("AGE");

		txtAge = new JTextField();
		txtAge.setBounds(43, 7, 60, 21);
		panel_8.add(txtAge);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBounds(114, 0, 156, 35);
		panel_7.add(panel_9);

		final JLabel birthdateLabel = new JLabel();
		birthdateLabel.setText("BIRTHDATE");
		birthdateLabel.setBounds(10, 10, 74, 14);
		panel_9.add(birthdateLabel);

		dcBirthDate = new JDateChooser();
		dcBirthDate.setBackground(Color.WHITE);
		dcBirthDate.setBounds(72, 10, 74, 18);
		panel_9.add(dcBirthDate);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(269, 0, 298, 35);
		panel_7.add(panel_10);

		final JLabel maritalStatusLabel = new JLabel();
		maritalStatusLabel.setText("MARITAL STATUS");
		maritalStatusLabel.setBounds(10, 12, 93, 14);
		panel_10.add(maritalStatusLabel);

		rbSingle = new JRadioButton();
		bgMaritalStatus.add(rbSingle);
		rbSingle.setBackground(Color.WHITE);
		rbSingle.setText("S");
		rbSingle.setBounds(103, 10, 31, 18);
		panel_10.add(rbSingle);

		final JRadioButton rbMarried = new JRadioButton();
		bgMaritalStatus.add(rbMarried);
		rbMarried.setBackground(Color.WHITE);
		rbMarried.setText("M");
		rbMarried.setBounds(156, 10, 35, 18);
		panel_10.add(rbMarried);

		final JRadioButton rbWidowed = new JRadioButton();
		bgMaritalStatus.add(rbWidowed);
		rbWidowed.setBackground(Color.WHITE);
		rbWidowed.setText("W");
		rbWidowed.setBounds(197, 10, 35, 18);
		panel_10.add(rbWidowed);

		final JRadioButton rbOthers = new JRadioButton();
		bgMaritalStatus.add(rbOthers);
		rbOthers.setBackground(Color.WHITE);
		rbOthers.setText("O");
		rbOthers.setBounds(242, 10, 45, 18);
		panel_10.add(rbOthers);

		final JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBounds(565, 0, 221, 35);
		panel_7.add(panel_11);

		final JLabel physicianLabel = new JLabel();
		physicianLabel.setText("PHYSICIAN");
		physicianLabel.setBounds(10, 4, 72, 23);
		panel_11.add(physicianLabel);

		txtPhysician = new JTextField();
		txtPhysician.setBounds(89, 5, 117, 21);
		panel_11.add(txtPhysician);

		final JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBounds(784, 0, 180, 34);
		panel_7.add(panel_12);

		final JLabel phoneNoLabel = new JLabel();
		phoneNoLabel.setText("PHONE NO.");
		phoneNoLabel.setBounds(10, 8, 73, 14);
		panel_12.add(phoneNoLabel);

		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(85, 6, 88, 22);
		panel_12.add(txtPhoneNumber);

		final JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(963, 1, 138, 32);
		panel_7.add(panel_13);

		final JLabel dietLabel = new JLabel();
		dietLabel.setText("Diet");
		dietLabel.setBounds(10, 8, 26, 14);
		panel_13.add(dietLabel);

		txtDiet = new JTextField();
		txtDiet.setBounds(42, 6, 82, 18);
		panel_13.add(txtDiet);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 953, 1103, 34);
		panel.add(panel_7_1);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(0, 1, 115, 33);
		panel_7_1.add(panel_8_1);

		final JLabel ageLabel_1 = new JLabel();
		ageLabel_1.setText("ROOM");
		ageLabel_1.setBounds(5, 10, 31, 14);
		panel_8_1.add(ageLabel_1);

		txtRoom = new JTextField();
		txtRoom.setBounds(43, 7, 60, 21);
		panel_8_1.add(txtRoom);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(Color.WHITE);
		panel_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1.setLayout(null);
		panel_9_1.setBounds(114, 1, 156, 33);
		panel_7_1.add(panel_9_1);

		final JLabel birthdateLabel_1 = new JLabel();
		birthdateLabel_1.setText("NAME");
		birthdateLabel_1.setBounds(10, 10, 47, 14);
		panel_9_1.add(birthdateLabel_1);

		txtName = new JTextField();
		txtName.setBounds(74, 7, 69, 21);
		panel_9_1.add(txtName);

		final JPanel panel_10_1 = new JPanel();
		panel_10_1.setBackground(Color.WHITE);
		panel_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_1.setLayout(null);
		panel_10_1.setBounds(268, 1, 299, 33);
		panel_7_1.add(panel_10_1);

		final JLabel maritalStatusLabel_1 = new JLabel();
		maritalStatusLabel_1.setText("PREFFERRED NAME");
		maritalStatusLabel_1.setBounds(10, 12, 106, 14);
		panel_10_1.add(maritalStatusLabel_1);

		txtPrefferedName = new JTextField();
		txtPrefferedName.setBounds(151, 5, 120, 21);
		panel_10_1.add(txtPrefferedName);

		final JPanel panel_11_1 = new JPanel();
		panel_11_1.setBackground(Color.WHITE);
		panel_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_1.setLayout(null);
		panel_11_1.setBounds(565, 1, 221, 33);
		panel_7_1.add(panel_11_1);

		final JLabel physicianLabel_1 = new JLabel();
		physicianLabel_1.setText("CHART NUMBER");
		physicianLabel_1.setBounds(10, 4, 195, 23);
		panel_11_1.add(physicianLabel_1);

		txtChartNumber = new JTextField();
		txtChartNumber.setBounds(94, 5, 111, 21);
		panel_11_1.add(txtChartNumber);

		final JPanel panel_12_1 = new JPanel();
		panel_12_1.setBackground(Color.WHITE);
		panel_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1.setLayout(null);
		panel_12_1.setBounds(785, 0, 179, 34);
		panel_7_1.add(panel_12_1);

		final JLabel phoneNoLabel_1 = new JLabel();
		phoneNoLabel_1.setText("LEVEL OF CARE");
		phoneNoLabel_1.setBounds(10, 8, 88, 14);
		panel_12_1.add(phoneNoLabel_1);

		txtLevelCare = new JTextField();
		txtLevelCare.setBounds(87, 5, 81, 22);
		panel_12_1.add(txtLevelCare);

		final JLabel residentStatusSheetLabel = new JLabel();
		residentStatusSheetLabel.setBounds(546, 10, 263, 15);
		panel.add(residentStatusSheetLabel);
		residentStatusSheetLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		residentStatusSheetLabel.setText("RESIDENT STATUS SHEET");

		final JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBounds(367, 365, 207, 145);
		panel.add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_1.setLayout(null);

		final JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setBackground(Color.BLACK);
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBounds(0, 0, 281, 22);
		panel_1_1_1_1_1.add(panel_2_1_1_1_1);

		final JLabel bladderLabel_1_1_1_1 = new JLabel();
		bladderLabel_1_1_1_1.setForeground(Color.WHITE);
		bladderLabel_1_1_1_1.setText("PARALYSIS");
		bladderLabel_1_1_1_1.setBounds(8, 0, 206, 20);
		panel_2_1_1_1_1.add(bladderLabel_1_1_1_1);

		cbParalysisRtArm = new JCheckBox();
		cbParalysisRtArm.setOpaque(false);
		cbParalysisRtArm.setText("Rt. Arm");
		cbParalysisRtArm.setBounds(10, 28, 78, 14);
		panel_1_1_1_1_1.add(cbParalysisRtArm);

		cbParalysisRtLeg = new JCheckBox();
		cbParalysisRtLeg.setOpaque(false);
		cbParalysisRtLeg.setText("Rt. Leg.");
		cbParalysisRtLeg.setBounds(10, 48, 109, 22);
		panel_1_1_1_1_1.add(cbParalysisRtLeg);

		cbParalysisRtsideOfFace = new JCheckBox();
		cbParalysisRtsideOfFace.setOpaque(false);
		cbParalysisRtsideOfFace.setText("Rt. side of face");
		cbParalysisRtsideOfFace.setBounds(10, 72, 119, 18);
		panel_1_1_1_1_1.add(cbParalysisRtsideOfFace);

		cbParalysisLtSideOfFace = new JCheckBox();
		cbParalysisLtSideOfFace.setOpaque(false);
		cbParalysisLtSideOfFace.setText("Lt. side of face");
		cbParalysisLtSideOfFace.setBounds(10, 92, 101, 18);
		panel_1_1_1_1_1.add(cbParalysisLtSideOfFace);

		cbParalysisQuadriplegia = new JCheckBox();
		cbParalysisQuadriplegia.setOpaque(false);
		cbParalysisQuadriplegia.setText("Quadriplegia");
		cbParalysisQuadriplegia.setBounds(10, 116, 101, 14);
		panel_1_1_1_1_1.add(cbParalysisQuadriplegia);

		cbParalysisParaplegla = new JCheckBox();
		cbParalysisParaplegla.setOpaque(false);
		cbParalysisParaplegla.setText("Paraplegla");
		cbParalysisParaplegla.setBounds(138, 114, 101, 18);
		panel_1_1_1_1_1.add(cbParalysisParaplegla);

		cbParalysisLeftArm = new JCheckBox();
		cbParalysisLeftArm.setOpaque(false);
		cbParalysisLeftArm.setText("Left Arm");
		cbParalysisLeftArm.setBounds(137, 28, 78, 14);
		panel_1_1_1_1_1.add(cbParalysisLeftArm);

		cbParalysisLeftLeg = new JCheckBox();
		cbParalysisLeftLeg.setOpaque(false);
		cbParalysisLeftLeg.setText("Left Leg");
		cbParalysisLeftLeg.setBounds(137, 52, 78, 14);
		panel_1_1_1_1_1.add(cbParalysisLeftLeg);

		doUpdate();
	}

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {

		ResidentStatusSheet refResidentStatusSheet = new ResidentStatusSheet();
		refResidentStatusSheet.setResidentId(Global.currentResidenceKey);

		refResidentStatusSheet.setSerial(Global.currentResidentStatusSheetKey);
		refResidentStatusSheet.setFormId(Global.currentMsjnKey);
		refResidentStatusSheet.setDiet(txtDiet.getText());
		refResidentStatusSheet.setLevelCare(txtLevelCare.getText());
		refResidentStatusSheet.setPhoneNumber(txtPhoneNumber.getText());
		refResidentStatusSheet.setChartNumber(txtChartNumber.getText());
		refResidentStatusSheet.setPhysician(txtPhysician.getText());
		refResidentStatusSheet.setPrefferedName(txtPrefferedName.getText());
		refResidentStatusSheet.setResidentName(txtName.getText());
		refResidentStatusSheet.setRoom(txtRoom.getText());
		refResidentStatusSheet.setAge(txtAge.getText());
		refResidentStatusSheet.setRestorativeOthersValue(txtRestorativeOthers
				.getText());
		refResidentStatusSheet.setRestorativeOthers(cbRestorativeOthers
				.isSelected());
		refResidentStatusSheet
				.setRestorativeCommunication(cbRestorativeCommunication
						.isSelected());
		refResidentStatusSheet.setRestorativeAmputation(cbRestorativeAmputation
				.isSelected());
		refResidentStatusSheet
				.setRestorativeEatingSwallowing(cbRestorativeEatingSwallowing
						.isSelected());
		refResidentStatusSheet
				.setRestorativeDressingGrooming(cbRestorativeDressingGrooming
						.isSelected());
		refResidentStatusSheet.setRestorativeWalking(cbRestorativeWalking
				.isSelected());
		refResidentStatusSheet.setRestorativeTransfer(cbRestorativeTransfer
				.isSelected());
		refResidentStatusSheet
				.setRestorativeBedMobility(cbRestorativeBedMobility
						.isSelected());
		refResidentStatusSheet
				.setRestorativeSplintBraceAssist(cbRestorativeSplintBraceAssist
						.isSelected());
		refResidentStatusSheet.setRestorativeAarom(cbRestorativeAarom
				.isSelected());
		refResidentStatusSheet.setRestorativeProm(cbRestorativeProm
				.isSelected());
		refResidentStatusSheet.setRestorativeRoom(cbRestorativeRoom
				.isSelected());
		refResidentStatusSheet.setGroomingPodatrist(cbGroomingPodatrist
				.isSelected());
		refResidentStatusSheet.setGroomingTotalCare(cbGroomingTotalCare
				.isSelected());
		refResidentStatusSheet.setGroomingSupervise(cbGroomingSupervise
				.isSelected());
		refResidentStatusSheet.setGroomingAssist(cbGroomingAssist.isSelected());
		refResidentStatusSheet.setGroomingSelfCare(cbGroomingSelfCare
				.isSelected());
		refResidentStatusSheet.setGroomingHairDresser(cbGroomingHairDresser
				.isSelected());
		refResidentStatusSheet.setGroomingFeet(cbGroomingFeet.isSelected());
		refResidentStatusSheet.setGroomingNails(cbGroomingNails.isSelected());
		refResidentStatusSheet.setGroomingShave(cbGroomingShave.isSelected());
		refResidentStatusSheet.setGroomingComb(cbGroomingComb.isSelected());
		refResidentStatusSheet.setDressTotalCare(cbDressTotalCare.isSelected());
		refResidentStatusSheet.setDressSupervise(cbDressSupervise.isSelected());
		refResidentStatusSheet.setDressAssist(cbDressAssist.isSelected());
		refResidentStatusSheet.setDressSelfCare(cbDressSelfCare.isSelected());
		refResidentStatusSheet.setDressClothes(cbDressClothes.isSelected());
		refResidentStatusSheet.setDressShocking(cbDressShocking.isSelected());
		refResidentStatusSheet.setDressShoes(cbDressShoes.isSelected());
		refResidentStatusSheet.setSkinContracturesSite(txtSkinContracturesSite
				.getText());
		refResidentStatusSheet.setSkinDecubitusSite(txtSkinDecubitusSite
				.getText());
		refResidentStatusSheet.setSkinContractures(cbSkinContractures
				.isSelected());
		refResidentStatusSheet.setSkinDecubitus(cbSkinDecubitus.isSelected());
		refResidentStatusSheet.setSkinSpecial(cbSkinSpecial.isSelected());
		refResidentStatusSheet.setSkinRoutine(cbSkinRoutine.isSelected());
		refResidentStatusSheet.setMouthCareTotalCare(cbMouthCareTotalCare
				.isSelected());
		refResidentStatusSheet.setMouthCareSupervise(cbMouthCareSupervise
				.isSelected());
		refResidentStatusSheet.setMouthCareAssist(cbMouthCareAssist
				.isSelected());
		refResidentStatusSheet.setMouthCareSelfCare(cbMouthCareSelfCare
				.isSelected());
		refResidentStatusSheet.setMouthCareAtBedSise(cbMouthCareAtBedSise
				.isSelected());
		refResidentStatusSheet.setMouthCareNoTeeth(cbMouthCareNoTeeth
				.isSelected());
		refResidentStatusSheet.setMouthCareNoDentures(cbMouthCareNoDentures
				.isSelected());
		refResidentStatusSheet.setMouthCareLower(cbMouthCareLower.isSelected());
		refResidentStatusSheet.setMouthCareUpper(cbMouthCareUpper.isSelected());
		refResidentStatusSheet.setMouthCareDentures(cbMouthCareDentures
				.isSelected());
		refResidentStatusSheet.setBathBed(cbBathBed.isSelected());
		refResidentStatusSheet.setBathTotalCare(cbBathTotalCare.isSelected());
		refResidentStatusSheet.setBathAssist(cbBathAssist.isSelected());
		refResidentStatusSheet.setBathHairCare(cbBathHairCare.isSelected());
		refResidentStatusSheet.setBathSelfCare(cbBathSelfCare.isSelected());
		refResidentStatusSheet.setBathShower(cbBathShower.isSelected());
		refResidentStatusSheet.setBathTub(cbBathTub.isSelected());
		refResidentStatusSheet.setSpecificTask(txtSpecificTask.getText());
		refResidentStatusSheet.setRiskFactors(txtRiskFactors.getText());
		refResidentStatusSheet.setResidentStrengths(txtResidentStrengths
				.getText());
		refResidentStatusSheet
				.setMentalAttitudeForgetFul(cbMentalAttitudeForgetFul
						.isSelected());
		refResidentStatusSheet
				.setMentalAttitudeAgitated(cbMentalAttitudeAgitated
						.isSelected());
		refResidentStatusSheet.setMentalAttitudeAlert(cbMentalAttitudeAlert
				.isSelected());
		refResidentStatusSheet
				.setMentalAttitudeConfused(cbMentalAttitudeConfused
						.isSelected());
		refResidentStatusSheet
				.setMentalAttitudeDepressed(cbMentalAttitudeDepressed
						.isSelected());
		refResidentStatusSheet
				.setMentalAttitudeCheerful(cbMentalAttitudeCheerful
						.isSelected());
		refResidentStatusSheet.setMentalAttitudeMoody(cbMentalAttitudeMoody
				.isSelected());
		refResidentStatusSheet
				.setMentalAttitudeWellAdjusted(cbMentalAttitudeWellAdjusted
						.isSelected());
		refResidentStatusSheet
				.setMentalAttitudeOriented(cbMentalAttitudeOriented
						.isSelected());
		refResidentStatusSheet.setBracesType(txtBracesType.getText());
		refResidentStatusSheet.setBracesTotalCare(cbBracesTotalCare
				.isSelected());
		refResidentStatusSheet.setBracesAssist(cbBracesAssist.isSelected());
		refResidentStatusSheet.setBracesSelf(cbBracesSelf.isSelected());
		refResidentStatusSheet
				.setSpecialEquipmentTotalCareType(txtSpecialEquipmentTotalCareType
						.getText());
		refResidentStatusSheet
				.setSpecialEquipmentTotalCare(cbSpecialEquipmentTotalCare
						.isSelected());
		refResidentStatusSheet
				.setSpecialEquipmentAssist(cbSpecialEquipmentAssist
						.isSelected());
		refResidentStatusSheet.setSpecialEquipmentSelf(cbSpecialEquipmentSelf
				.isSelected());
		refResidentStatusSheet
				.setSpecialEquipmentProsthesis(cbSpecialEquipmentProsthesis
						.isSelected());
		refResidentStatusSheet
				.setSupportiveAfterPressurePad(cbSupportiveAfterPressurePad
						.isSelected());
		refResidentStatusSheet.setSupportiveWaterBed(cbSupportiveWaterBed
				.isSelected());
		refResidentStatusSheet
				.setSupportiveWaterMattress(cbSupportiveWaterMattress
						.isSelected());
		refResidentStatusSheet
				.setSupportiveSpecialMattress(cbSupportiveSpecialMattress
						.isSelected());
		refResidentStatusSheet.setSupportiveFoamRubber(cbSupportiveFoamRubber
				.isSelected());
		refResidentStatusSheet.setSupportiveBrace(cbSupportiveBrace
				.isSelected());
		refResidentStatusSheet.setSupportiveBedBoard(cbSupportiveBedBoard
				.isSelected());
		refResidentStatusSheet.setSupportivePillows(cbSupportivePillows
				.isSelected());
		refResidentStatusSheet.setSupportiveTrapeze(cbSupportiveTrapeze
				.isSelected());
		refResidentStatusSheet.setSupportiveFootBoard(cbSupportiveFootBoard
				.isSelected());
		refResidentStatusSheet.setSupportiveBedCradle(cbSupportiveBedCradle
				.isSelected());
		refResidentStatusSheet.setSideRailsOmit(cbSideRailsOmit.isSelected());
		refResidentStatusSheet.setSideRailsAtNight(cbSideRailsAtNight
				.isSelected());
		refResidentStatusSheet.setSideRailsConstantly(cbSideRailsConstantly
				.isSelected());
		refResidentStatusSheet.setRestraintJacket(cbRestraintJacket
				.isSelected());
		refResidentStatusSheet.setRestraintWaist(cbRestraintWaist.isSelected());
		refResidentStatusSheet.setRestraintChair(cbRestraintChair.isSelected());
		refResidentStatusSheet.setRestraintBed(cbRestraintBed.isSelected());
		refResidentStatusSheet
				.setPositionChangeAfterTwoHour(cbPositionChangeAfterTwoHour
						.isSelected());
		refResidentStatusSheet
				.setPositionChangeAfterOneHour(cbPositionChangeAfterOneHour
						.isSelected());
		refResidentStatusSheet
				.setPositionChangeAfterHalfHour(cbPositionChangeAfterHalfHour
						.isSelected());
		refResidentStatusSheet.setPositionWith2Assist(cbPositionWith2Assist
				.isSelected());
		refResidentStatusSheet.setPositionWith1Assist(cbPositionWith1Assist
				.isSelected());
		refResidentStatusSheet.setPositionChangeBySelf(cbPositionChangeBySelf
				.isSelected());
		refResidentStatusSheet.setParalysisParaplegla(cbParalysisParaplegla
				.isSelected());
		refResidentStatusSheet.setParalysisQuadriplegia(cbParalysisQuadriplegia
				.isSelected());
		refResidentStatusSheet.setParalysisLtSideOfFace(cbParalysisLtSideOfFace
				.isSelected());
		refResidentStatusSheet.setParalysisLeftLeg(cbParalysisLeftLeg
				.isSelected());
		refResidentStatusSheet.setParalysisRtsideOfFace(cbParalysisRtsideOfFace
				.isSelected());
		refResidentStatusSheet.setParalysisRtLeg(cbParalysisRtLeg.isSelected());
		refResidentStatusSheet.setParalysisLeftArm(cbParalysisLeftArm
				.isSelected());
		refResidentStatusSheet.setParalysisRtArm(cbParalysisRtArm.isSelected());
		refResidentStatusSheet.setDexterityLeftHand(cbDexterityLeftHand
				.isSelected());
		refResidentStatusSheet.setDexterityRightHand(cbDexterityRightHand
				.isSelected());
		refResidentStatusSheet.setFullAmbulatory(cbFullAmbulatory.isSelected());
		refResidentStatusSheet.setWith2Assist(cbWith2Assist.isSelected());
		refResidentStatusSheet.setWithOneAssist(cbWithOneAssist.isSelected());
		refResidentStatusSheet.setStrecher(cbStrecher.isSelected());
		refResidentStatusSheet.setWheelChair(cbWheelChair.isSelected());
		refResidentStatusSheet.setLifttoChair(cbLifttoChair.isSelected());
		refResidentStatusSheet.setBedtoChair(cbBedtoChair.isSelected());
		refResidentStatusSheet.setWalker(cbWalker.isSelected());
		refResidentStatusSheet.setCane(cbCane.isSelected());
		refResidentStatusSheet.setCrutches(cbCrutches.isSelected());
		refResidentStatusSheet.setWalks(cbWalks.isSelected());
		refResidentStatusSheet.setLanguageSpoken(cbLanguageSpoken.isSelected());
		refResidentStatusSheet.setAphasic(cbAphasic.isSelected());
		refResidentStatusSheet.setDeficit(cbDeficit.isSelected());
		refResidentStatusSheet.setSpeaksWell(cbSpeaksWell.isSelected());
		refResidentStatusSheet.setUsesHearingAid(cbUsesHearingAid.isSelected());
		refResidentStatusSheet.setHearingLeft(cbHearingLeft.isSelected());
		refResidentStatusSheet.setHearingRight(cbHearingRight.isSelected());
		refResidentStatusSheet.setPartiallyDeaf(cbPartiallyDeaf.isSelected());
		refResidentStatusSheet.setTotallyDeaf(cbTotallyDeaf.isSelected());
		refResidentStatusSheet.setBlindLegally(cbBlindLegally.isSelected());
		refResidentStatusSheet.setBlindLeft(cbBlindLeft.isSelected());
		refResidentStatusSheet.setBlindBoth(cbBlindBoth.isSelected());
		refResidentStatusSheet.setBlindRight(cbBlindRight.isSelected());
		refResidentStatusSheet.setBlind(cbBlind.isSelected());
		refResidentStatusSheet.setWearsGlasses(cbWearsGlasses.isSelected());
		refResidentStatusSheet.setCataracts(cbCataracts.isSelected());
		refResidentStatusSheet.setBoth(cbBoth.isSelected());
		refResidentStatusSheet.setLeft(cbLeft.isSelected());
		refResidentStatusSheet.setRight(cbRight.isSelected());
		refResidentStatusSheet.setDRs(txtDRs.getText());
		refResidentStatusSheet.setDRd(txtDRd.getText());
		refResidentStatusSheet.setDRb(txtDRb.getText());
		refResidentStatusSheet.setSugarSubstitute(cbSugarSubstitute
				.isSelected());
		refResidentStatusSheet.setSupplementFeeding(cbSupplementFeeding
				.isSelected());
		refResidentStatusSheet.setDR(cbDR.isSelected());
		refResidentStatusSheet.setNeedBib(cbNeedBib.isSelected());
		refResidentStatusSheet.setEatingAssist(cbEatingAssist.isSelected());
		refResidentStatusSheet.setDateChange(dcDateChange.getDate());
		refResidentStatusSheet.setTubeFeedingSize(txtTubeFeedingSize.getText());
		refResidentStatusSheet.setTubeFeeding(cbTubeFeeding.isSelected());
		refResidentStatusSheet.setFeeder(cbFeeder.isSelected());
		refResidentStatusSheet.setOOBinChair(cbOOBinChair.isSelected());
		refResidentStatusSheet.setPrepareFood(cbPrepareFood.isSelected());
		refResidentStatusSheet.setFeedsSelf(cbFeedsSelf.isSelected());
		refResidentStatusSheet.setOfferQuantity(txtOfferQuantity.getText());
		refResidentStatusSheet.setOutPut(cbOutPut.isSelected());
		refResidentStatusSheet.setIntake(cbIntake.isSelected());
		refResidentStatusSheet.setOffer(cbOffer.isSelected());
		refResidentStatusSheet.setRestrict(cbRestrict.isSelected());
		refResidentStatusSheet.setRestrictQuantity(txtRestrictQuantity
				.getText());
		refResidentStatusSheet.setBowelTotalCare(cbBowelTotalCare.isSelected());
		refResidentStatusSheet.setBowelAssist(cbBowelAssist.isSelected());
		refResidentStatusSheet.setBowelSelfControl(cbBowelSelfControl
				.isSelected());
		refResidentStatusSheet.setBowelIncontinent(cbBowelIncontinent
				.isSelected());
		refResidentStatusSheet.setBowelCommode(cbBowelCommode.isSelected());
		refResidentStatusSheet.setBowelBedPan(cbBowelBedPan.isSelected());
		refResidentStatusSheet.setBowelBR(cbBowelBR.isSelected());
		refResidentStatusSheet.setBowelTraining(cbBowelTraining.isSelected());
		refResidentStatusSheet.setAdultBriefs(cbAdultBriefs.isSelected());
		refResidentStatusSheet.setSchedule(txtSchedule.getText());
		refResidentStatusSheet.setToiletProgram(cbToiletProgram.isSelected());
		refResidentStatusSheet.setBladderRetraining(cbBladderRetraining
				.isSelected());
		refResidentStatusSheet.setAssist(cbAssist.isSelected());
		refResidentStatusSheet.setTotalCare(cbTotalCare.isSelected());
		refResidentStatusSheet.setSelfControl(cbSelfControl.isSelected());
		refResidentStatusSheet.setIncontinent(cbIncontinent.isSelected());
		refResidentStatusSheet.setIrrigationA(txtIrrigationA.getText());
		refResidentStatusSheet.setIrrigationC(txtIrrigationC.getText());
		refResidentStatusSheet.setIrrigation(cbIrrigation.isSelected());
		refResidentStatusSheet.setCatheterDateChange(dcCatheterDateChange
				.getDate());
		refResidentStatusSheet.setCatheterSize(txtCatheterSize.getText());
		refResidentStatusSheet.setCatheter(cbCatheter.isSelected());
		refResidentStatusSheet.setCommode(cbCommode.isSelected());
		refResidentStatusSheet.setUrinal(cbUrinal.isSelected());
		refResidentStatusSheet.setBedPan(cbBedPan.isSelected());
		refResidentStatusSheet.setBr(cbBr.isSelected());
		refResidentStatusSheet.setMaritalStatus(SwingUtils
				.getSelectedButton(bgMaritalStatus));
		refResidentStatusSheet.setBirthDate(dcBirthDate.getDate());

		try {
			Global.currentResidentStatusSheetKey = MedrexClientManager
					.getInstance().insertOrUpdateResidentStatusSheet(
							refResidentStatusSheet);
		} catch (Exception e) {
		}
		return Global.currentResidentStatusSheetKey;
	}

	public void doUpdate() {

		ResidentStatusSheet refResidentStatusSheet = null;
		if (Global.currentMsjnKey != 0) {
			try {
				refResidentStatusSheet = MedrexClientManager.getInstance()
						.getResidentStatusSheet(Global.currentMsjnKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Global.currentResidentStatusSheetKey = refResidentStatusSheet
					.getSerial();
			txtDiet.setText(refResidentStatusSheet.getDiet());
			txtLevelCare.setText(refResidentStatusSheet.getLevelCare());
			txtPhoneNumber.setText(refResidentStatusSheet.getPhoneNumber());
			txtChartNumber.setText(refResidentStatusSheet.getChartNumber());
			txtPhysician.setText(refResidentStatusSheet.getPhysician());
			txtPrefferedName.setText(refResidentStatusSheet.getPrefferedName());
			txtName.setText(refResidentStatusSheet.getResidentName());
			txtRoom.setText(refResidentStatusSheet.getRoom());
			txtAge.setText(refResidentStatusSheet.getAge());
			txtRestorativeOthers.setText(refResidentStatusSheet
					.getRestorativeOthersValue());
			cbRestorativeOthers.setSelected(refResidentStatusSheet
					.isRestorativeOthers());
			cbRestorativeCommunication.setSelected(refResidentStatusSheet
					.isRestorativeCommunication());
			cbRestorativeAmputation.setSelected(refResidentStatusSheet
					.isRestorativeAmputation());
			cbRestorativeEatingSwallowing.setSelected(refResidentStatusSheet
					.isRestorativeEatingSwallowing());
			cbRestorativeDressingGrooming.setSelected(refResidentStatusSheet
					.isRestorativeDressingGrooming());
			cbRestorativeWalking.setSelected(refResidentStatusSheet
					.isRestorativeWalking());
			cbRestorativeTransfer.setSelected(refResidentStatusSheet
					.isRestorativeTransfer());
			cbRestorativeBedMobility.setSelected(refResidentStatusSheet
					.isRestorativeBedMobility());
			cbRestorativeSplintBraceAssist.setSelected(refResidentStatusSheet
					.isRestorativeSplintBraceAssist());
			cbRestorativeAarom.setSelected(refResidentStatusSheet
					.isRestorativeAarom());
			cbRestorativeProm.setSelected(refResidentStatusSheet
					.isRestorativeProm());
			cbRestorativeRoom.setSelected(refResidentStatusSheet
					.isRestorativeRoom());
			cbGroomingPodatrist.setSelected(refResidentStatusSheet
					.isGroomingPodatrist());
			cbGroomingTotalCare.setSelected(refResidentStatusSheet
					.isGroomingTotalCare());
			cbGroomingSupervise.setSelected(refResidentStatusSheet
					.isGroomingSupervise());
			cbGroomingAssist.setSelected(refResidentStatusSheet
					.isGroomingAssist());
			cbGroomingSelfCare.setSelected(refResidentStatusSheet
					.isGroomingSelfCare());
			cbGroomingHairDresser.setSelected(refResidentStatusSheet
					.isGroomingHairDresser());
			cbGroomingFeet.setSelected(refResidentStatusSheet.isGroomingFeet());
			cbGroomingNails.setSelected(refResidentStatusSheet
					.isGroomingNails());
			cbGroomingShave.setSelected(refResidentStatusSheet
					.isGroomingShave());
			cbGroomingComb.setSelected(refResidentStatusSheet.isGroomingComb());
			cbDressTotalCare.setSelected(refResidentStatusSheet
					.isDressTotalCare());
			cbDressSupervise.setSelected(refResidentStatusSheet
					.isDressSupervise());
			cbDressAssist.setSelected(refResidentStatusSheet.isDressAssist());
			cbDressSelfCare.setSelected(refResidentStatusSheet
					.isDressSelfCare());
			cbDressClothes.setSelected(refResidentStatusSheet.isDressClothes());
			cbDressShocking.setSelected(refResidentStatusSheet
					.isDressShocking());
			cbDressShoes.setSelected(refResidentStatusSheet.isDressShoes());
			txtSkinContracturesSite.setText(refResidentStatusSheet
					.getSkinContracturesSite());
			txtSkinDecubitusSite.setText(refResidentStatusSheet
					.getSkinDecubitusSite());
			cbSkinContractures.setSelected(refResidentStatusSheet
					.isSkinContractures());
			cbSkinDecubitus.setSelected(refResidentStatusSheet
					.isSkinDecubitus());
			cbSkinSpecial.setSelected(refResidentStatusSheet.isSkinSpecial());
			cbSkinRoutine.setSelected(refResidentStatusSheet.isSkinRoutine());
			cbMouthCareTotalCare.setSelected(refResidentStatusSheet
					.isMouthCareTotalCare());
			cbMouthCareSupervise.setSelected(refResidentStatusSheet
					.isMouthCareSupervise());
			cbMouthCareAssist.setSelected(refResidentStatusSheet
					.isMouthCareAssist());
			cbMouthCareSelfCare.setSelected(refResidentStatusSheet
					.isMouthCareSelfCare());
			cbMouthCareAtBedSise.setSelected(refResidentStatusSheet
					.isMouthCareAtBedSise());
			cbMouthCareNoTeeth.setSelected(refResidentStatusSheet
					.isMouthCareNoTeeth());
			cbMouthCareNoDentures.setSelected(refResidentStatusSheet
					.isMouthCareNoDentures());
			cbMouthCareLower.setSelected(refResidentStatusSheet
					.isMouthCareLower());
			cbMouthCareUpper.setSelected(refResidentStatusSheet
					.isMouthCareUpper());
			cbMouthCareDentures.setSelected(refResidentStatusSheet
					.isMouthCareDentures());
			cbBathBed.setSelected(refResidentStatusSheet.isBathBed());
			cbBathTotalCare.setSelected(refResidentStatusSheet
					.isBathTotalCare());
			cbBathAssist.setSelected(refResidentStatusSheet.isBathAssist());
			cbBathHairCare.setSelected(refResidentStatusSheet.isBathHairCare());
			cbBathSelfCare.setSelected(refResidentStatusSheet.isBathSelfCare());
			cbBathShower.setSelected(refResidentStatusSheet.isBathShower());
			cbBathTub.setSelected(refResidentStatusSheet.isBathTub());
			txtSpecificTask.setText(refResidentStatusSheet.getSpecificTask());
			txtRiskFactors.setText(refResidentStatusSheet.getRiskFactors());
			txtResidentStrengths.setText(refResidentStatusSheet
					.getResidentStrengths());
			cbMentalAttitudeForgetFul.setSelected(refResidentStatusSheet
					.isMentalAttitudeForgetFul());
			cbMentalAttitudeAgitated.setSelected(refResidentStatusSheet
					.isMentalAttitudeAgitated());
			cbMentalAttitudeAlert.setSelected(refResidentStatusSheet
					.isMentalAttitudeAlert());
			cbMentalAttitudeConfused.setSelected(refResidentStatusSheet
					.isMentalAttitudeConfused());
			cbMentalAttitudeDepressed.setSelected(refResidentStatusSheet
					.isMentalAttitudeDepressed());
			cbMentalAttitudeCheerful.setSelected(refResidentStatusSheet
					.isMentalAttitudeCheerful());
			cbMentalAttitudeMoody.setSelected(refResidentStatusSheet
					.isMentalAttitudeMoody());
			cbMentalAttitudeWellAdjusted.setSelected(refResidentStatusSheet
					.isMentalAttitudeWellAdjusted());
			cbMentalAttitudeOriented.setSelected(refResidentStatusSheet
					.isMentalAttitudeOriented());
			txtBracesType.setText(refResidentStatusSheet.getBracesType());
			cbBracesTotalCare.setSelected(refResidentStatusSheet
					.isBracesTotalCare());
			cbBracesAssist.setSelected(refResidentStatusSheet.isBracesAssist());
			cbBracesSelf.setSelected(refResidentStatusSheet.isBracesSelf());
			txtSpecialEquipmentTotalCareType.setText(refResidentStatusSheet
					.getSpecialEquipmentTotalCareType());
			cbSpecialEquipmentTotalCare.setSelected(refResidentStatusSheet
					.isSpecialEquipmentTotalCare());
			cbSpecialEquipmentAssist.setSelected(refResidentStatusSheet
					.isSpecialEquipmentAssist());
			cbSpecialEquipmentSelf.setSelected(refResidentStatusSheet
					.isSpecialEquipmentSelf());
			cbSpecialEquipmentProsthesis.setSelected(refResidentStatusSheet
					.isSpecialEquipmentProsthesis());
			cbSupportiveAfterPressurePad.setSelected(refResidentStatusSheet
					.isSupportiveAfterPressurePad());
			cbSupportiveWaterBed.setSelected(refResidentStatusSheet
					.isSupportiveWaterBed());
			cbSupportiveWaterMattress.setSelected(refResidentStatusSheet
					.isSupportiveWaterMattress());
			cbSupportiveSpecialMattress.setSelected(refResidentStatusSheet
					.isSupportiveSpecialMattress());
			cbSupportiveFoamRubber.setSelected(refResidentStatusSheet
					.isSupportiveFoamRubber());
			cbSupportiveBrace.setSelected(refResidentStatusSheet
					.isSupportiveBrace());
			cbSupportiveBedBoard.setSelected(refResidentStatusSheet
					.isSupportiveBedBoard());
			cbSupportivePillows.setSelected(refResidentStatusSheet
					.isSupportivePillows());
			cbSupportiveTrapeze.setSelected(refResidentStatusSheet
					.isSupportiveTrapeze());
			cbSupportiveFootBoard.setSelected(refResidentStatusSheet
					.isSupportiveFootBoard());
			cbSupportiveBedCradle.setSelected(refResidentStatusSheet
					.isSupportiveBedCradle());
			cbSideRailsOmit.setSelected(refResidentStatusSheet
					.isSideRailsOmit());
			cbSideRailsAtNight.setSelected(refResidentStatusSheet
					.isSideRailsAtNight());
			cbSideRailsConstantly.setSelected(refResidentStatusSheet
					.isSideRailsConstantly());
			cbRestraintJacket.setSelected(refResidentStatusSheet
					.isRestraintJacket());
			cbRestraintWaist.setSelected(refResidentStatusSheet
					.isRestraintWaist());
			cbRestraintChair.setSelected(refResidentStatusSheet
					.isRestraintChair());
			cbRestraintBed.setSelected(refResidentStatusSheet.isRestraintBed());
			cbPositionChangeAfterTwoHour.setSelected(refResidentStatusSheet
					.isPositionChangeAfterTwoHour());
			cbPositionChangeAfterOneHour.setSelected(refResidentStatusSheet
					.isPositionChangeAfterOneHour());
			cbPositionChangeAfterHalfHour.setSelected(refResidentStatusSheet
					.isPositionChangeAfterHalfHour());
			cbPositionWith2Assist.setSelected(refResidentStatusSheet
					.isPositionWith2Assist());
			cbPositionWith1Assist.setSelected(refResidentStatusSheet
					.isPositionWith1Assist());
			cbPositionChangeBySelf.setSelected(refResidentStatusSheet
					.isPositionChangeBySelf());
			cbParalysisParaplegla.setSelected(refResidentStatusSheet
					.isParalysisParaplegla());
			cbParalysisQuadriplegia.setSelected(refResidentStatusSheet
					.isParalysisQuadriplegia());
			cbParalysisLtSideOfFace.setSelected(refResidentStatusSheet
					.isParalysisLtSideOfFace());
			cbParalysisLeftLeg.setSelected(refResidentStatusSheet
					.isParalysisLeftLeg());
			cbParalysisRtsideOfFace.setSelected(refResidentStatusSheet
					.isParalysisRtsideOfFace());
			cbParalysisRtLeg.setSelected(refResidentStatusSheet
					.isParalysisRtLeg());
			cbParalysisLeftArm.setSelected(refResidentStatusSheet
					.isParalysisLeftArm());
			cbParalysisRtArm.setSelected(refResidentStatusSheet
					.isParalysisRtArm());
			cbDexterityLeftHand.setSelected(refResidentStatusSheet
					.isDexterityLeftHand());
			cbDexterityRightHand.setSelected(refResidentStatusSheet
					.isDexterityRightHand());
			cbFullAmbulatory.setSelected(refResidentStatusSheet
					.isFullAmbulatory());
			cbWith2Assist.setSelected(refResidentStatusSheet.isWith2Assist());
			cbWithOneAssist.setSelected(refResidentStatusSheet
					.isWithOneAssist());
			cbStrecher.setSelected(refResidentStatusSheet.isStrecher());
			cbWheelChair.setSelected(refResidentStatusSheet.isWheelChair());
			cbLifttoChair.setSelected(refResidentStatusSheet.isLifttoChair());
			cbBedtoChair.setSelected(refResidentStatusSheet.isBedtoChair());
			cbWalker.setSelected(refResidentStatusSheet.isWalker());
			cbCane.setSelected(refResidentStatusSheet.isCane());
			cbCrutches.setSelected(refResidentStatusSheet.isCrutches());
			cbWalks.setSelected(refResidentStatusSheet.isWalks());
			cbLanguageSpoken.setSelected(refResidentStatusSheet
					.isLanguageSpoken());
			cbAphasic.setSelected(refResidentStatusSheet.isAphasic());
			cbDeficit.setSelected(refResidentStatusSheet.isDeficit());
			cbSpeaksWell.setSelected(refResidentStatusSheet.isSpeaksWell());
			cbUsesHearingAid.setSelected(refResidentStatusSheet
					.isUsesHearingAid());
			cbHearingLeft.setSelected(refResidentStatusSheet.isHearingLeft());
			cbHearingRight.setSelected(refResidentStatusSheet.isHearingRight());
			cbPartiallyDeaf.setSelected(refResidentStatusSheet
					.isPartiallyDeaf());
			cbTotallyDeaf.setSelected(refResidentStatusSheet.isTotallyDeaf());
			cbBlindLegally.setSelected(refResidentStatusSheet.isBlindLegally());
			cbBlindLeft.setSelected(refResidentStatusSheet.isBlindLeft());
			cbBlindBoth.setSelected(refResidentStatusSheet.isBlindBoth());
			cbBlindRight.setSelected(refResidentStatusSheet.isBlindRight());
			cbBlind.setSelected(refResidentStatusSheet.isBlind());
			cbWearsGlasses.setSelected(refResidentStatusSheet.isWearsGlasses());
			cbCataracts.setSelected(refResidentStatusSheet.isCataracts());
			cbBoth.setSelected(refResidentStatusSheet.isBoth());
			cbLeft.setSelected(refResidentStatusSheet.isLeft());
			cbRight.setSelected(refResidentStatusSheet.isRight());
			txtDRs.setText(refResidentStatusSheet.getDRs());
			txtDRd.setText(refResidentStatusSheet.getDRd());
			txtDRb.setText(refResidentStatusSheet.getDRb());
			cbSugarSubstitute.setSelected(refResidentStatusSheet
					.isSugarSubstitute());
			cbSupplementFeeding.setSelected(refResidentStatusSheet
					.isSupplementFeeding());
			cbDR.setSelected(refResidentStatusSheet.isDR());
			cbNeedBib.setSelected(refResidentStatusSheet.isNeedBib());
			cbEatingAssist.setSelected(refResidentStatusSheet.isEatingAssist());
			dcDateChange.setDate(refResidentStatusSheet.getDateChange());
			txtTubeFeedingSize.setText(refResidentStatusSheet
					.getTubeFeedingSize());
			cbTubeFeeding.setSelected(refResidentStatusSheet.isTubeFeeding());
			cbFeeder.setSelected(refResidentStatusSheet.isFeeder());
			cbOOBinChair.setSelected(refResidentStatusSheet.isOOBinChair());
			cbPrepareFood.setSelected(refResidentStatusSheet.isPrepareFood());
			cbFeedsSelf.setSelected(refResidentStatusSheet.isFeedsSelf());
			txtOfferQuantity.setText(refResidentStatusSheet.getOfferQuantity());
			cbOutPut.setSelected(refResidentStatusSheet.isOutPut());
			cbIntake.setSelected(refResidentStatusSheet.isIntake());
			cbOffer.setSelected(refResidentStatusSheet.isOffer());
			cbRestrict.setSelected(refResidentStatusSheet.isRestrict());
			txtRestrictQuantity.setText(refResidentStatusSheet
					.getRestrictQuantity());
			cbBowelTotalCare.setSelected(refResidentStatusSheet
					.isBowelTotalCare());
			cbBowelAssist.setSelected(refResidentStatusSheet.isBowelAssist());
			cbBowelSelfControl.setSelected(refResidentStatusSheet
					.isBowelSelfControl());
			cbBowelIncontinent.setSelected(refResidentStatusSheet
					.isBowelIncontinent());
			cbBowelCommode.setSelected(refResidentStatusSheet.isBowelCommode());
			cbBowelBedPan.setSelected(refResidentStatusSheet.isBowelBedPan());
			cbBowelBR.setSelected(refResidentStatusSheet.isBowelBR());
			cbBowelTraining.setSelected(refResidentStatusSheet
					.isBowelTraining());
			cbAdultBriefs.setSelected(refResidentStatusSheet.isAdultBriefs());
			txtSchedule.setText(refResidentStatusSheet.getSchedule());
			cbToiletProgram.setSelected(refResidentStatusSheet
					.isToiletProgram());
			cbBladderRetraining.setSelected(refResidentStatusSheet
					.isBladderRetraining());
			cbAssist.setSelected(refResidentStatusSheet.isAssist());
			cbTotalCare.setSelected(refResidentStatusSheet.isTotalCare());
			cbSelfControl.setSelected(refResidentStatusSheet.isSelfControl());
			cbIncontinent.setSelected(refResidentStatusSheet.isIncontinent());
			txtIrrigationA.setText(refResidentStatusSheet.getIrrigationA());
			txtIrrigationC.setText(refResidentStatusSheet.getIrrigationC());
			cbIrrigation.setSelected(refResidentStatusSheet.isIrrigation());
			dcCatheterDateChange.setDate(refResidentStatusSheet
					.getCatheterDateChange());
			txtCatheterSize.setText(refResidentStatusSheet.getCatheterSize());
			cbCatheter.setSelected(refResidentStatusSheet.isCatheter());
			cbCommode.setSelected(refResidentStatusSheet.isCommode());
			cbUrinal.setSelected(refResidentStatusSheet.isUrinal());
			cbBedPan.setSelected(refResidentStatusSheet.isBedPan());
			cbBr.setSelected(refResidentStatusSheet.isBr());
			SwingUtils.setSelectedButton(bgMaritalStatus,
					refResidentStatusSheet.getMaritalStatus());
			dcBirthDate.setDate(refResidentStatusSheet.getBirthDate());
		}
	}

	public boolean doValidate() {

		return true;
	}

}
