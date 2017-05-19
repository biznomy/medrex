package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.MonthlySummaryMainPage;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.commons.vo.others.Nurse;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelMonthlySummaryMainPage extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 52336586066354392L;
	private ButtonGroup bgMeal = new ButtonGroup();
	private ButtonGroup bgOstomy = new ButtonGroup();
	private ButtonGroup bgContinentOfBowelFrequency = new ButtonGroup();
	private ButtonGroup bgContinentOfBowel = new ButtonGroup();
	private ButtonGroup bgFoleyCatheter = new ButtonGroup();
	private ButtonGroup bgContinentOfBladderFrequency = new ButtonGroup();
	private ButtonGroup bgContinentBladder = new ButtonGroup();
	private ButtonGroup bgSkinEdema = new ButtonGroup();
	private ButtonGroup bgBehavior = new ButtonGroup();
	private ButtonGroup bgMoods = new ButtonGroup();
	private ButtonGroup bgPhysicalCuesDecision = new ButtonGroup();
	private ButtonGroup bgRecallLongPast = new ButtonGroup();
	private ButtonGroup bgPhysicalCuesSafety = new ButtonGroup();
	private ButtonGroup bgReasonable = new ButtonGroup();
	private ButtonGroup bgRecallWords = new ButtonGroup();
	private JTextField txtTubeFeeding;
	private JTextArea txtReasonMeal;
	private JRadioButton rbMeal0;
	private JRadioButton rbMeal25;
	private JRadioButton rbMeal50;
	private JRadioButton rbMeal75;
	private JCheckBox cbPedsBriefs;
	private JCheckBox cbDepends;
	private JCheckBox cbBedsideCommode;
	private JCheckBox cbToiletBathroom;
	private JCheckBox cbBedPanUrinal;
	private JCheckBox cbCheckAll;
	private JRadioButton rbOstomyNo;
	private JRadioButton rbOstomyYes;
	private JRadioButton rbContinentBowelDaily;
	private JRadioButton rbContinentBowel2OrMore;
	private JRadioButton rbContinentBowelOnce;
	private JRadioButton rbContinentBowelNo;
	private JRadioButton rbContinentBowelYes;
	private JRadioButton rbContinentDaily;
	private JRadioButton rbContinent2OrMore;
	private JRadioButton rbContinentOnce;
	private JRadioButton rbFoleyCatheterNo;
	private JRadioButton rbFoleyCatheterYes;
	private JRadioButton rbContinentNo;
	private JRadioButton rbContinentYes;
	private JCheckBox cbSling;
	private JCheckBox cbTrapeze;
	private JCheckBox cbCrutch;
	private JCheckBox cbCane;
	private JCheckBox cbSlidingBoard;
	private JCheckBox cbWalker;
	private JCheckBox cbWheelChair;
	private JCheckBox cbBraceSplint;
	private JTextArea txtDevicesRestraintsReason;
	private JTextField txtSpecifyOthers;
	private JCheckBox cbOther;
	private JCheckBox cbLapBuddy;
	private JCheckBox cbWcSeatBelt;
	private JCheckBox cbGeriChairWithTray;
	private JCheckBox cbRecliningGeriChair;
	private JCheckBox cbWcAlarm;
	private JCheckBox cbWedgeCushion;
	private JCheckBox cbPostureSupport;
	private JCheckBox cbMitts;
	private JCheckBox cbOneSideRailsUp;
	private JCheckBox cbBothSideRailsUp;
	private JTextArea txtSkinEdema;
	private JRadioButton rbSkinEdemaNo;
	private JRadioButton rbSkinEdemaYes;
	private JRadioButton rbBehave4_7Days;
	private JRadioButton rbBehave1_3Days;
	private JRadioButton rbBehaveDaily;
	private JCheckBox cbResistiveToMedication;
	private JCheckBox cbSexuallyInappropriateBehave;
	private JCheckBox cbCursing;
	private JCheckBox cbHitting;
	private JCheckBox cbPushing;
	private JCheckBox cbScratching;
	private JCheckBox cbBiting;
	private JCheckBox cbKicking;
	private JCheckBox cbScreaming;
	private JCheckBox cbResistiveToEating;
	private JCheckBox cbResistiveToCare;
	private JCheckBox cbThreatensOthers;
	private JCheckBox cbWanders;
	private JCheckBox cbRummages;
	private JCheckBox cbHoarding;
	private JCheckBox cbSmearsFeces;
	private JCheckBox cbSmearsFood;
	private JCheckBox cbDisrobesInPublic;
	private JCheckBox cbCriesYells;
	private JRadioButton rbMoods4_7Days;
	private JRadioButton rbMoods1_3Days;
	private JRadioButton rbMoodsDaily;
	private JCheckBox cbWithdrawnFromActivities;
	private JCheckBox cbSadPained;
	private JCheckBox cbUnpleasantMood;
	private JCheckBox cbRepeatitiveNonHealthComplaints;
	private JCheckBox cbRepeatitiveHealthComplaints;
	private JCheckBox cbExpressesUnrealisticFears;
	private JCheckBox cbRecurrentStatements;
	private JCheckBox cbCryingFearfulness;
	private JCheckBox cbSelfDeprecation;
	private JCheckBox cbPersistentAnger;
	private JCheckBox cbRepetitiveVerbalization;
	private JCheckBox cbRepetitiveQuestions;
	private JCheckBox cbMakesNegativeStatements;
	private JCheckBox cbNoneOfTheAbove;
	private JCheckBox cbLittleBodyMovement;
	private JCheckBox cbStaresIntoSpace;
	private JCheckBox cbRepetitivePhysicalMovements;
	private JCheckBox cbPicksAtSkin;
	private JCheckBox cbLosesTrain;
	private JCheckBox cbMovesLips;
	private JCheckBox cbConfusesNight;
	private JCheckBox cbMentalFunctionVaries;
	private JCheckBox cbDifficultToArouse;
	private JCheckBox cbRepetitiveCalling;
	private JCheckBox cbChangesPosition;
	private JCheckBox cbFidgets;
	private JCheckBox cbIncoherentSpeech;
	private JCheckBox cbBelievesSomewhereElse;
	private JCheckBox cbDifficultyAttention;
	private JRadioButton rbPhysicalCuesDecisionNo;
	private JRadioButton rbPhysicalCuesDecisionYes;
	private JRadioButton rbRecallLongPastNo;
	private JRadioButton rbRecallLongPastYes;
	private JRadioButton rbPhysicalCuesSafetyNo;
	private JRadioButton rbPhysicalCuesSafetyYes;
	private JRadioButton rbReasonableDecisionNo;
	private JRadioButton rbReasonableDecisionYes;
	private JRadioButton rbRecallWordsNo;
	private JRadioButton rbRecallWordsYes;
	private JComboBox cmbNurse;
	private JDateChooser dcMonthYear;
	private JTextField txtRoomNo;
	private JTextField txtResidentName;

	public PanelMonthlySummaryMainPage() {
		super();
		Global.panelMonthlySummaryMainPage = this;
		setBackground(Color.WHITE);
		setLayout(null);
		// setBackground(Color.WHITE);
		setBounds(0, 0, 942, 1609);
		setPreferredSize(new Dimension(900, 1650));

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(61, 0, 839, 35);
		add(panel);

		final JLabel plazaNursingLabel = new JLabel();
		plazaNursingLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		plazaNursingLabel.setText("Plaza Nursing And Rehabilitation");
		plazaNursingLabel.setBounds(323, 0, 296, 14);
		panel.add(plazaNursingLabel);

		final JLabel monthlySummaryLabel = new JLabel();
		monthlySummaryLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		monthlySummaryLabel.setText("Monthly Summary");
		monthlySummaryLabel.setBounds(357, 20, 151, 14);
		panel.add(monthlySummaryLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(61, 40, 851, 122);
		add(panel_1);

		final JLabel nameOfTheLabel = new JLabel();
		nameOfTheLabel.setText("Name of the resident");
		nameOfTheLabel.setBounds(10, 10, 108, 14);
		panel_1.add(nameOfTheLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(124, 8, 219, 18);
		panel_1.add(txtResidentName);

		final JLabel monthYearLabel = new JLabel();
		monthYearLabel.setText("Month / year");
		monthYearLabel.setBounds(366, 10, 79, 14);
		panel_1.add(monthYearLabel);

		dcMonthYear = new JDateChooser();
		dcMonthYear.setBounds(451, 8, 134, 18);
		panel_1.add(dcMonthYear);

		final JLabel nurseNameLabel = new JLabel();
		nurseNameLabel.setText("Nurse Name");
		nurseNameLabel.setBounds(619, 10, 73, 14);
		panel_1.add(nurseNameLabel);

		cmbNurse = new JComboBox();
		cmbNurse.setBackground(Color.WHITE);
		cmbNurse.setBounds(698, 10, 143, 19);
		panel_1.add(cmbNurse);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room#");
		roomLabel.setBounds(10, 35, 108, 14);
		panel_1.add(roomLabel);

		txtRoomNo = new JTextField();
		txtRoomNo.setBounds(124, 33, 219, 18);
		panel_1.add(txtRoomNo);

		final JLabel ableToRecallLabel = new JLabel();
		ableToRecallLabel
				.setText("<html></body>Able to recall words/phrases after 5 minutes?<br>able to make reasonable decisions?<br>Require verbal physical cues for safety?");
		ableToRecallLabel.setBounds(10, 63, 271, 55);
		panel_1.add(ableToRecallLabel);

		rbRecallWordsYes = new JRadioButton();
		rbRecallWordsYes.setActionCommand("1");
		bgRecallWords.add(rbRecallWordsYes);
		rbRecallWordsYes.setBackground(Color.WHITE);
		rbRecallWordsYes.setOpaque(false);
		rbRecallWordsYes.setText("Yes");
		rbRecallWordsYes.setBounds(356, 65, 52, 14);
		panel_1.add(rbRecallWordsYes);

		rbRecallWordsNo = new JRadioButton();
		rbRecallWordsNo.setActionCommand("2");
		bgRecallWords.add(rbRecallWordsNo);
		rbRecallWordsNo.setBackground(Color.WHITE);
		rbRecallWordsNo.setText("No");
		rbRecallWordsNo.setBounds(414, 65, 52, 14);
		panel_1.add(rbRecallWordsNo);

		rbReasonableDecisionYes = new JRadioButton();
		rbReasonableDecisionYes.setActionCommand("1");
		bgReasonable.add(rbReasonableDecisionYes);
		rbReasonableDecisionYes.setBackground(Color.WHITE);
		rbReasonableDecisionYes.setText("Yes");
		rbReasonableDecisionYes.setBounds(356, 82, 52, 14);
		panel_1.add(rbReasonableDecisionYes);

		rbReasonableDecisionNo = new JRadioButton();
		rbReasonableDecisionNo.setActionCommand("2");
		bgReasonable.add(rbReasonableDecisionNo);
		rbReasonableDecisionNo.setBackground(Color.WHITE);
		rbReasonableDecisionNo.setText("No");
		rbReasonableDecisionNo.setBounds(414, 82, 52, 14);
		panel_1.add(rbReasonableDecisionNo);

		final JLabel ableToRecallLabel_1 = new JLabel();
		ableToRecallLabel_1
				.setText("<html><body>Able to recall long past?<br>Require verbal physical cues for decisions?");
		ableToRecallLabel_1.setBounds(472, 65, 220, 28);
		panel_1.add(ableToRecallLabel_1);

		rbRecallLongPastYes = new JRadioButton();
		rbRecallLongPastYes.setActionCommand("1");
		bgRecallLongPast.add(rbRecallLongPastYes);
		rbRecallLongPastYes.setBackground(Color.WHITE);
		rbRecallLongPastYes.setText("Yes");
		rbRecallLongPastYes.setBounds(698, 63, 52, 14);
		panel_1.add(rbRecallLongPastYes);

		rbRecallLongPastNo = new JRadioButton();
		rbRecallLongPastNo.setActionCommand("2");
		bgRecallLongPast.add(rbRecallLongPastNo);
		rbRecallLongPastNo.setBackground(Color.WHITE);
		rbRecallLongPastNo.setText("No");
		rbRecallLongPastNo.setBounds(754, 63, 52, 14);
		panel_1.add(rbRecallLongPastNo);

		rbPhysicalCuesDecisionYes = new JRadioButton();
		rbPhysicalCuesDecisionYes.setActionCommand("1");
		bgPhysicalCuesDecision.add(rbPhysicalCuesDecisionYes);
		rbPhysicalCuesDecisionYes.setBackground(Color.WHITE);
		rbPhysicalCuesDecisionYes.setText("Yes");
		rbPhysicalCuesDecisionYes.setBounds(698, 82, 52, 14);
		panel_1.add(rbPhysicalCuesDecisionYes);

		rbPhysicalCuesDecisionNo = new JRadioButton();
		rbPhysicalCuesDecisionNo.setActionCommand("2");
		bgPhysicalCuesDecision.add(rbPhysicalCuesDecisionNo);
		rbPhysicalCuesDecisionNo.setBackground(Color.WHITE);
		rbPhysicalCuesDecisionNo.setText("No");
		rbPhysicalCuesDecisionNo.setBounds(754, 82, 52, 14);
		panel_1.add(rbPhysicalCuesDecisionNo);

		rbPhysicalCuesSafetyYes = new JRadioButton();
		rbPhysicalCuesSafetyYes.setActionCommand("1");
		bgPhysicalCuesSafety.add(rbPhysicalCuesSafetyYes);
		rbPhysicalCuesSafetyYes.setBackground(Color.WHITE);
		rbPhysicalCuesSafetyYes.setText("Yes");
		rbPhysicalCuesSafetyYes.setBounds(356, 100, 52, 14);
		panel_1.add(rbPhysicalCuesSafetyYes);

		rbPhysicalCuesSafetyNo = new JRadioButton();
		rbPhysicalCuesSafetyNo.setActionCommand("2");
		bgPhysicalCuesSafety.add(rbPhysicalCuesSafetyNo);
		rbPhysicalCuesSafetyNo.setBackground(Color.WHITE);
		rbPhysicalCuesSafetyNo.setText("No");
		rbPhysicalCuesSafetyNo.setBounds(414, 100, 52, 14);
		panel_1.add(rbPhysicalCuesSafetyNo);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBounds(61, 185, 850, 185);
		add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBounds(0, 0, 425, 24);
		panel_2.add(panel_3);

		final JLabel difficultyPayingAttentiongetsLabel = new JLabel();
		difficultyPayingAttentiongetsLabel.setBounds(105, 10, 239, 14);
		difficultyPayingAttentiongetsLabel
				.setText("Difficulty paying attention:gets sidetracked");
		panel_3.add(difficultyPayingAttentiongetsLabel);

		cbDifficultyAttention = new JCheckBox();
		cbDifficultyAttention.setBackground(Color.WHITE);
		cbDifficultyAttention.setBounds(372, 2, 43, 20);
		cbDifficultyAttention.setText("");
		panel_3.add(cbDifficultyAttention);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1.setBounds(424, 0, 426, 24);
		panel_2.add(panel_3_1);

		final JLabel confusesNightdayLabel = new JLabel();
		confusesNightdayLabel.setBounds(165, 6, 95, 14);
		confusesNightdayLabel.setText("Confuses night/Day");
		panel_3_1.add(confusesNightdayLabel);

		cbConfusesNight = new JCheckBox();
		cbConfusesNight.setBackground(Color.WHITE);
		cbConfusesNight.setText("");
		cbConfusesNight.setBounds(373, 3, 43, 20);
		panel_3_1.add(cbConfusesNight);

		final JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2.setBounds(0, 23, 425, 24);
		panel_2.add(panel_3_2);

		final JLabel believesHesheIsLabel = new JLabel();
		believesHesheIsLabel.setBounds(130, 6, 165, 14);
		believesHesheIsLabel.setText("Believes he/she is somewhere else");
		panel_3_2.add(believesHesheIsLabel);

		cbBelievesSomewhereElse = new JCheckBox();
		cbBelievesSomewhereElse.setBackground(Color.WHITE);
		cbBelievesSomewhereElse.setText("");
		cbBelievesSomewhereElse.setBounds(372, 3, 43, 20);
		panel_3_2.add(cbBelievesSomewhereElse);

		final JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBackground(Color.WHITE);
		panel_3_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1.setBounds(424, 23, 426, 24);
		panel_2.add(panel_3_2_1);

		final JLabel movesLipstalksToLabel = new JLabel();
		movesLipstalksToLabel.setBounds(116, 6, 193, 14);
		movesLipstalksToLabel
				.setText("Moves lips/talks to someone not present");
		panel_3_2_1.add(movesLipstalksToLabel);

		cbMovesLips = new JCheckBox();
		cbMovesLips.setBackground(Color.WHITE);
		cbMovesLips.setText("");
		cbMovesLips.setBounds(373, 3, 43, 20);
		panel_3_2_1.add(cbMovesLips);

		final JPanel panel_3_2_2 = new JPanel();
		panel_3_2_2.setLayout(null);
		panel_3_2_2.setBackground(Color.WHITE);
		panel_3_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2.setBounds(0, 46, 425, 24);
		panel_2.add(panel_3_2_2);

		final JLabel speechIsIncoherentLabel = new JLabel();
		speechIsIncoherentLabel.setBounds(116, 6, 193, 14);
		speechIsIncoherentLabel
				.setText("Speech is incoherent,irrelevent,rambling");
		panel_3_2_2.add(speechIsIncoherentLabel);

		cbIncoherentSpeech = new JCheckBox();
		cbIncoherentSpeech.setBackground(Color.WHITE);
		cbIncoherentSpeech.setText("");
		cbIncoherentSpeech.setBounds(372, 3, 43, 20);
		panel_3_2_2.add(cbIncoherentSpeech);

		final JPanel panel_3_2_1_1 = new JPanel();
		panel_3_2_1_1.setLayout(null);
		panel_3_2_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1.setBounds(424, 46, 426, 24);
		panel_2.add(panel_3_2_1_1);

		final JLabel losesTrainOfLabel = new JLabel();
		losesTrainOfLabel.setBounds(161, 6, 103, 14);
		losesTrainOfLabel.setText("loses train of thought");
		panel_3_2_1_1.add(losesTrainOfLabel);

		cbLosesTrain = new JCheckBox();
		cbLosesTrain.setBackground(Color.WHITE);
		cbLosesTrain.setText("");
		cbLosesTrain.setBounds(373, 3, 43, 20);
		panel_3_2_1_1.add(cbLosesTrain);

		final JPanel panel_3_2_2_1 = new JPanel();
		panel_3_2_2_1.setLayout(null);
		panel_3_2_2_1.setBackground(Color.WHITE);
		panel_3_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1.setBounds(0, 69, 425, 24);
		panel_2.add(panel_3_2_2_1);

		final JLabel fidgetsLabel = new JLabel();
		fidgetsLabel.setBounds(195, 6, 35, 14);
		fidgetsLabel.setText("Fidgets");
		panel_3_2_2_1.add(fidgetsLabel);

		cbFidgets = new JCheckBox();
		cbFidgets.setBackground(Color.WHITE);
		cbFidgets.setText("");
		cbFidgets.setBounds(372, 3, 43, 20);
		panel_3_2_2_1.add(cbFidgets);

		final JPanel panel_3_2_1_1_1 = new JPanel();
		panel_3_2_1_1_1.setLayout(null);
		panel_3_2_1_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1.setBounds(424, 69, 426, 24);
		panel_2.add(panel_3_2_1_1_1);

		final JLabel picksAtSkinLabel = new JLabel();
		picksAtSkinLabel.setBounds(155, 6, 115, 14);
		picksAtSkinLabel.setText("picks at skin clothing etc");
		panel_3_2_1_1_1.add(picksAtSkinLabel);

		cbPicksAtSkin = new JCheckBox();
		cbPicksAtSkin.setBackground(Color.WHITE);
		cbPicksAtSkin.setText("");
		cbPicksAtSkin.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1.add(cbPicksAtSkin);

		final JPanel panel_3_2_2_1_1 = new JPanel();
		panel_3_2_2_1_1.setLayout(null);
		panel_3_2_2_1_1.setBackground(Color.WHITE);
		panel_3_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1.setBounds(0, 92, 425, 24);
		panel_2.add(panel_3_2_2_1_1);

		final JLabel changesPositionFrequentlyLabel = new JLabel();
		changesPositionFrequentlyLabel.setBounds(145, 6, 135, 14);
		changesPositionFrequentlyLabel.setText("Changes position frequently");
		panel_3_2_2_1_1.add(changesPositionFrequentlyLabel);

		cbChangesPosition = new JCheckBox();
		cbChangesPosition.setBackground(Color.WHITE);
		cbChangesPosition.setText("");
		cbChangesPosition.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1.add(cbChangesPosition);

		final JPanel panel_3_2_1_1_1_1 = new JPanel();
		panel_3_2_1_1_1_1.setLayout(null);
		panel_3_2_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1.setBounds(424, 92, 426, 24);
		panel_2.add(panel_3_2_1_1_1_1);

		final JLabel repetativePhysicalMovementsLabel = new JLabel();
		repetativePhysicalMovementsLabel.setBounds(137, 6, 152, 14);
		repetativePhysicalMovementsLabel
				.setText("Repetative physical movements");
		panel_3_2_1_1_1_1.add(repetativePhysicalMovementsLabel);

		cbRepetitivePhysicalMovements = new JCheckBox();
		cbRepetitivePhysicalMovements.setBackground(Color.WHITE);
		cbRepetitivePhysicalMovements.setText("");
		cbRepetitivePhysicalMovements.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1.add(cbRepetitivePhysicalMovements);

		final JPanel panel_3_2_2_1_1_1 = new JPanel();
		panel_3_2_2_1_1_1.setLayout(null);
		panel_3_2_2_1_1_1.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_1.setBounds(0, 115, 425, 24);
		panel_2.add(panel_3_2_2_1_1_1);

		final JLabel repetativeCallingOutLabel = new JLabel();
		repetativeCallingOutLabel.setBounds(160, 6, 104, 14);
		repetativeCallingOutLabel.setText("Repetative calling out");
		panel_3_2_2_1_1_1.add(repetativeCallingOutLabel);

		cbRepetitiveCalling = new JCheckBox();
		cbRepetitiveCalling.setBackground(Color.WHITE);
		cbRepetitiveCalling.setText("");
		cbRepetitiveCalling.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1.add(cbRepetitiveCalling);

		final JPanel panel_3_2_1_1_1_1_1 = new JPanel();
		panel_3_2_1_1_1_1_1.setLayout(null);
		panel_3_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1_1.setBounds(424, 115, 426, 24);
		panel_2.add(panel_3_2_1_1_1_1_1);

		final JLabel staresIntoSpacesluggishLabel = new JLabel();
		staresIntoSpacesluggishLabel.setBounds(151, 6, 124, 14);
		staresIntoSpacesluggishLabel.setText("stares into space:sluggish");
		panel_3_2_1_1_1_1_1.add(staresIntoSpacesluggishLabel);

		cbStaresIntoSpace = new JCheckBox();
		cbStaresIntoSpace.setBackground(Color.WHITE);
		cbStaresIntoSpace.setText("");
		cbStaresIntoSpace.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_1.add(cbStaresIntoSpace);

		final JPanel panel_3_2_2_1_1_1_1 = new JPanel();
		panel_3_2_2_1_1_1_1.setLayout(null);
		panel_3_2_2_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_1_1.setBounds(0, 138, 425, 24);
		panel_2.add(panel_3_2_2_1_1_1_1);

		final JLabel difficultToArouseLabel = new JLabel();
		difficultToArouseLabel.setBounds(170, 6, 85, 14);
		difficultToArouseLabel.setText("Difficult to arouse");
		panel_3_2_2_1_1_1_1.add(difficultToArouseLabel);

		cbDifficultToArouse = new JCheckBox();
		cbDifficultToArouse.setBackground(Color.WHITE);
		cbDifficultToArouse.setText("");
		cbDifficultToArouse.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1_1.add(cbDifficultToArouse);

		final JPanel panel_3_2_1_1_1_1_1_1 = new JPanel();
		panel_3_2_1_1_1_1_1_1.setLayout(null);
		panel_3_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1_1_1.setBounds(424, 138, 426, 24);
		panel_2.add(panel_3_2_1_1_1_1_1_1);

		final JLabel littleBodyMovementLabel = new JLabel();
		littleBodyMovementLabel.setBounds(163, 6, 100, 14);
		littleBodyMovementLabel.setText("little body movement");
		panel_3_2_1_1_1_1_1_1.add(littleBodyMovementLabel);

		cbLittleBodyMovement = new JCheckBox();
		cbLittleBodyMovement.setBackground(Color.WHITE);
		cbLittleBodyMovement.setText("");
		cbLittleBodyMovement.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_1_1.add(cbLittleBodyMovement);

		final JPanel panel_3_2_2_1_1_1_1_1 = new JPanel();
		panel_3_2_2_1_1_1_1_1.setLayout(null);
		panel_3_2_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_1_1_1.setBounds(0, 161, 425, 24);
		panel_2.add(panel_3_2_2_1_1_1_1_1);

		final JLabel mentalFunctionVariesLabel = new JLabel();
		mentalFunctionVariesLabel.setBounds(119, 6, 187, 14);
		mentalFunctionVariesLabel
				.setText("Mental function varies throughout shift");
		panel_3_2_2_1_1_1_1_1.add(mentalFunctionVariesLabel);

		cbMentalFunctionVaries = new JCheckBox();
		cbMentalFunctionVaries.setBackground(Color.WHITE);
		cbMentalFunctionVaries.setText("");
		cbMentalFunctionVaries.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1_1_1.add(cbMentalFunctionVaries);

		final JPanel panel_3_2_1_1_1_1_1_1_1 = new JPanel();
		panel_3_2_1_1_1_1_1_1_1.setLayout(null);
		panel_3_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1_1_1_1.setBounds(424, 161, 426, 24);
		panel_2.add(panel_3_2_1_1_1_1_1_1_1);

		final JLabel noneOfTheLabel = new JLabel();
		noneOfTheLabel.setBounds(168, 6, 90, 14);
		noneOfTheLabel.setText("None of the above");
		panel_3_2_1_1_1_1_1_1_1.add(noneOfTheLabel);

		cbNoneOfTheAbove = new JCheckBox();
		cbNoneOfTheAbove.setBackground(Color.WHITE);
		cbNoneOfTheAbove.setText("");
		cbNoneOfTheAbove.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_1_1_1.add(cbNoneOfTheAbove);

		final JLabel deliriumIndicatorscheckLabel = new JLabel();
		deliriumIndicatorscheckLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		deliriumIndicatorscheckLabel
				.setText("DELIRIUM INDICATORS (Check all that apply)");
		deliriumIndicatorscheckLabel.setBounds(380, 168, 261, 14);
		add(deliriumIndicatorscheckLabel);

		final JLabel moodsAndBehaviorsLabel = new JLabel();
		moodsAndBehaviorsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		moodsAndBehaviorsLabel.setText("Moods And Behaviors");
		moodsAndBehaviorsLabel.setBounds(430, 376, 225, 14);
		add(moodsAndBehaviorsLabel);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(62, 396, 850, 185);
		add(panel_2_1);

		final JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(Color.WHITE);
		panel_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_3.setLayout(null);
		panel_3_3.setBounds(0, 0, 425, 24);
		panel_2_1.add(panel_3_3);

		final JLabel difficultyPayingAttentiongetsLabel_1 = new JLabel();
		difficultyPayingAttentiongetsLabel_1
				.setText("Makes negative Statements");
		difficultyPayingAttentiongetsLabel_1.setBounds(127, 8, 239, 14);
		panel_3_3.add(difficultyPayingAttentiongetsLabel_1);

		cbMakesNegativeStatements = new JCheckBox();
		cbMakesNegativeStatements.setBackground(Color.WHITE);
		cbMakesNegativeStatements.setText("");
		cbMakesNegativeStatements.setBounds(372, 2, 43, 20);
		panel_3_3.add(cbMakesNegativeStatements);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(Color.WHITE);
		panel_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(424, 0, 426, 24);
		panel_2_1.add(panel_3_1_1);

		final JLabel confusesNightdayLabel_1 = new JLabel();
		confusesNightdayLabel_1.setText("Expresses unrealistic fears");
		confusesNightdayLabel_1.setBounds(143, 6, 171, 14);
		panel_3_1_1.add(confusesNightdayLabel_1);

		cbExpressesUnrealisticFears = new JCheckBox();
		cbExpressesUnrealisticFears.setBackground(Color.WHITE);
		cbExpressesUnrealisticFears.setText("");
		cbExpressesUnrealisticFears.setBounds(373, 3, 43, 20);
		panel_3_1_1.add(cbExpressesUnrealisticFears);

		final JPanel panel_3_2_3 = new JPanel();
		panel_3_2_3.setBackground(Color.WHITE);
		panel_3_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_3.setLayout(null);
		panel_3_2_3.setBounds(0, 23, 425, 24);
		panel_2_1.add(panel_3_2_3);

		final JLabel believesHesheIsLabel_1 = new JLabel();
		believesHesheIsLabel_1.setText("Repeatitive questions");
		believesHesheIsLabel_1.setBounds(159, 9, 165, 14);
		panel_3_2_3.add(believesHesheIsLabel_1);

		cbRepetitiveQuestions = new JCheckBox();
		cbRepetitiveQuestions.setBackground(Color.WHITE);
		cbRepetitiveQuestions.setActionCommand("");
		cbRepetitiveQuestions.setText("");
		cbRepetitiveQuestions.setBounds(372, 3, 43, 20);
		panel_3_2_3.add(cbRepetitiveQuestions);

		final JPanel panel_3_2_1_2 = new JPanel();
		panel_3_2_1_2.setBackground(Color.WHITE);
		panel_3_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_2.setLayout(null);
		panel_3_2_1_2.setBounds(424, 23, 426, 24);
		panel_2_1.add(panel_3_2_1_2);

		final JLabel movesLipstalksToLabel_1 = new JLabel();
		movesLipstalksToLabel_1.setText("Repeatitive health complaints");
		movesLipstalksToLabel_1.setBounds(136, 6, 173, 14);
		panel_3_2_1_2.add(movesLipstalksToLabel_1);

		cbRepeatitiveHealthComplaints = new JCheckBox();
		cbRepeatitiveHealthComplaints.setBackground(Color.WHITE);
		cbRepeatitiveHealthComplaints.setText("");
		cbRepeatitiveHealthComplaints.setBounds(373, 3, 43, 20);
		panel_3_2_1_2.add(cbRepeatitiveHealthComplaints);

		final JPanel panel_3_2_2_2 = new JPanel();
		panel_3_2_2_2.setBackground(Color.WHITE);
		panel_3_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_2.setLayout(null);
		panel_3_2_2_2.setBounds(0, 46, 425, 24);
		panel_2_1.add(panel_3_2_2_2);

		final JLabel speechIsIncoherentLabel_1 = new JLabel();
		speechIsIncoherentLabel_1.setText("repeatitive verbalization");
		speechIsIncoherentLabel_1.setBounds(151, 9, 193, 14);
		panel_3_2_2_2.add(speechIsIncoherentLabel_1);

		cbRepetitiveVerbalization = new JCheckBox();
		cbRepetitiveVerbalization.setBackground(Color.WHITE);
		cbRepetitiveVerbalization.setText("");
		cbRepetitiveVerbalization.setBounds(372, 3, 43, 20);
		panel_3_2_2_2.add(cbRepetitiveVerbalization);

		final JPanel panel_3_2_1_1_2 = new JPanel();
		panel_3_2_1_1_2.setBackground(Color.WHITE);
		panel_3_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_2.setLayout(null);
		panel_3_2_1_1_2.setBounds(424, 46, 426, 24);
		panel_2_1.add(panel_3_2_1_1_2);

		final JLabel losesTrainOfLabel_1 = new JLabel();
		losesTrainOfLabel_1.setText("Repeatitive non health complaints");
		losesTrainOfLabel_1.setBounds(131, 6, 179, 14);
		panel_3_2_1_1_2.add(losesTrainOfLabel_1);

		cbRepeatitiveNonHealthComplaints = new JCheckBox();
		cbRepeatitiveNonHealthComplaints.setBackground(Color.WHITE);
		cbRepeatitiveNonHealthComplaints.setText("");
		cbRepeatitiveNonHealthComplaints.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_2.add(cbRepeatitiveNonHealthComplaints);

		final JPanel panel_3_2_2_1_2 = new JPanel();
		panel_3_2_2_1_2.setBackground(Color.WHITE);
		panel_3_2_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_2.setLayout(null);
		panel_3_2_2_1_2.setBounds(0, 69, 425, 24);
		panel_2_1.add(panel_3_2_2_1_2);

		final JLabel fidgetsLabel_1 = new JLabel();
		fidgetsLabel_1.setText("Persistent anger");
		fidgetsLabel_1.setBounds(168, 9, 91, 14);
		panel_3_2_2_1_2.add(fidgetsLabel_1);

		cbPersistentAnger = new JCheckBox();
		cbPersistentAnger.setBackground(Color.WHITE);
		cbPersistentAnger.setText("");
		cbPersistentAnger.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_2.add(cbPersistentAnger);

		final JPanel panel_3_2_1_1_1_2 = new JPanel();
		panel_3_2_1_1_1_2.setBackground(Color.WHITE);
		panel_3_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_2.setLayout(null);
		panel_3_2_1_1_1_2.setBounds(424, 69, 426, 24);
		panel_2_1.add(panel_3_2_1_1_1_2);

		final JLabel picksAtSkinLabel_1 = new JLabel();
		picksAtSkinLabel_1.setText("Unpleasant mood in AM");
		picksAtSkinLabel_1.setBounds(157, 5, 158, 14);
		panel_3_2_1_1_1_2.add(picksAtSkinLabel_1);

		cbUnpleasantMood = new JCheckBox();
		cbUnpleasantMood.setBackground(Color.WHITE);
		cbUnpleasantMood.setText("");
		cbUnpleasantMood.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_2.add(cbUnpleasantMood);

		final JPanel panel_3_2_2_1_1_2 = new JPanel();
		panel_3_2_2_1_1_2.setBackground(Color.WHITE);
		panel_3_2_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_2.setLayout(null);
		panel_3_2_2_1_1_2.setBounds(0, 92, 425, 24);
		panel_2_1.add(panel_3_2_2_1_1_2);

		final JLabel changesPositionFrequentlyLabel_1 = new JLabel();
		changesPositionFrequentlyLabel_1.setText("Self deprecation");
		changesPositionFrequentlyLabel_1.setBounds(162, 9, 135, 14);
		panel_3_2_2_1_1_2.add(changesPositionFrequentlyLabel_1);

		cbSelfDeprecation = new JCheckBox();
		cbSelfDeprecation.setBackground(Color.WHITE);
		cbSelfDeprecation.setText("");
		cbSelfDeprecation.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_2.add(cbSelfDeprecation);

		final JPanel panel_3_2_1_1_1_1_2 = new JPanel();
		panel_3_2_1_1_1_1_2.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1_2.setLayout(null);
		panel_3_2_1_1_1_1_2.setBounds(424, 92, 426, 24);
		panel_2_1.add(panel_3_2_1_1_1_1_2);

		final JLabel repetativePhysicalMovementsLabel_1 = new JLabel();
		repetativePhysicalMovementsLabel_1
				.setText("Sad , Pained worried Expressions");
		repetativePhysicalMovementsLabel_1.setBounds(137, 6, 171, 14);
		panel_3_2_1_1_1_1_2.add(repetativePhysicalMovementsLabel_1);

		cbSadPained = new JCheckBox();
		cbSadPained.setBackground(Color.WHITE);
		cbSadPained.setText("");
		cbSadPained.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_2.add(cbSadPained);

		final JPanel panel_3_2_2_1_1_1_2 = new JPanel();
		panel_3_2_2_1_1_1_2.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_1_2.setLayout(null);
		panel_3_2_2_1_1_1_2.setBounds(0, 115, 425, 24);
		panel_2_1.add(panel_3_2_2_1_1_1_2);

		final JLabel repetativeCallingOutLabel_1 = new JLabel();
		repetativeCallingOutLabel_1.setText("Crying fearfulness");
		repetativeCallingOutLabel_1.setBounds(166, 9, 127, 14);
		panel_3_2_2_1_1_1_2.add(repetativeCallingOutLabel_1);

		cbCryingFearfulness = new JCheckBox();
		cbCryingFearfulness.setBackground(Color.WHITE);
		cbCryingFearfulness.setText("");
		cbCryingFearfulness.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1_2.add(cbCryingFearfulness);

		final JPanel panel_3_2_1_1_1_1_1_2 = new JPanel();
		panel_3_2_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1_1_2.setLayout(null);
		panel_3_2_1_1_1_1_1_2.setBounds(424, 115, 426, 24);
		panel_2_1.add(panel_3_2_1_1_1_1_1_2);

		final JLabel staresIntoSpacesluggishLabel_1 = new JLabel();
		staresIntoSpacesluggishLabel_1
				.setText("Withdrawn from activities of interests");
		staresIntoSpacesluggishLabel_1.setBounds(135, 6, 195, 14);
		panel_3_2_1_1_1_1_1_2.add(staresIntoSpacesluggishLabel_1);

		cbWithdrawnFromActivities = new JCheckBox();
		cbWithdrawnFromActivities.setBackground(Color.WHITE);
		cbWithdrawnFromActivities.setText("");
		cbWithdrawnFromActivities.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_1_2.add(cbWithdrawnFromActivities);

		final JPanel panel_3_2_2_1_1_1_1_2 = new JPanel();
		panel_3_2_2_1_1_1_1_2.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_1_1_2.setLayout(null);
		panel_3_2_2_1_1_1_1_2.setBounds(0, 138, 425, 47);
		panel_2_1.add(panel_3_2_2_1_1_1_1_2);

		final JLabel difficultToArouseLabel_1 = new JLabel();
		difficultToArouseLabel_1
				.setText("Recurrent statements that something bad");
		difficultToArouseLabel_1.setBounds(131, 9, 209, 14);
		panel_3_2_2_1_1_1_1_2.add(difficultToArouseLabel_1);

		cbRecurrentStatements = new JCheckBox();
		cbRecurrentStatements.setBackground(Color.WHITE);
		cbRecurrentStatements.setText("");
		cbRecurrentStatements.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1_1_2.add(cbRecurrentStatements);

		final JLabel mentalFunctionVariesLabel_1 = new JLabel();
		mentalFunctionVariesLabel_1.setBounds(163, 29, 125, 14);
		panel_3_2_2_1_1_1_1_2.add(mentalFunctionVariesLabel_1);
		mentalFunctionVariesLabel_1.setText("will happen");

		final JPanel panel_3_2_1_1_1_1_1_1_2 = new JPanel();
		panel_3_2_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_1_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1_1_1_2.setLayout(null);
		panel_3_2_1_1_1_1_1_1_2.setBounds(424, 138, 426, 47);
		panel_2_1.add(panel_3_2_1_1_1_1_1_1_2);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(62, 583, 849, 28);
		add(panel_4);

		final JLabel ifAnyOfLabel = new JLabel();
		ifAnyOfLabel.setText("if any of the above is checked .Note frequency");
		ifAnyOfLabel.setBounds(10, 5, 342, 14);
		panel_4.add(ifAnyOfLabel);

		rbMoodsDaily = new JRadioButton();
		rbMoodsDaily.setActionCommand("1");
		bgMoods.add(rbMoodsDaily);
		rbMoodsDaily.setBackground(Color.WHITE);
		rbMoodsDaily.setText("Daily");
		rbMoodsDaily.setBounds(421, 1, 66, 22);
		panel_4.add(rbMoodsDaily);

		rbMoods1_3Days = new JRadioButton();
		rbMoods1_3Days.setActionCommand("2");
		bgMoods.add(rbMoods1_3Days);
		rbMoods1_3Days.setBackground(Color.WHITE);
		rbMoods1_3Days.setText("1-3 days a week");
		rbMoods1_3Days.setBounds(548, 1, 127, 22);
		panel_4.add(rbMoods1_3Days);

		rbMoods4_7Days = new JRadioButton();
		rbMoods4_7Days.setActionCommand("3");
		bgMoods.add(rbMoods4_7Days);
		rbMoods4_7Days.setBackground(Color.WHITE);
		rbMoods4_7Days.setText("4-7 days a week");
		rbMoods4_7Days.setBounds(712, 1, 127, 22);
		panel_4.add(rbMoods4_7Days);

		final JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(62, 612, 850, 231);
		add(panel_2_2);

		final JPanel panel_3_4 = new JPanel();
		panel_3_4.setBackground(Color.WHITE);
		panel_3_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_4.setLayout(null);
		panel_3_4.setBounds(0, 0, 425, 24);
		panel_2_2.add(panel_3_4);

		final JLabel difficultyPayingAttentiongetsLabel_2 = new JLabel();
		difficultyPayingAttentiongetsLabel_2
				.setText("Cries / yells out appropriately");
		difficultyPayingAttentiongetsLabel_2.setBounds(105, 10, 239, 14);
		panel_3_4.add(difficultyPayingAttentiongetsLabel_2);

		cbCriesYells = new JCheckBox();
		cbCriesYells.setBackground(Color.WHITE);
		cbCriesYells.setText("");
		cbCriesYells.setBounds(372, 2, 43, 20);
		panel_3_4.add(cbCriesYells);

		final JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBackground(Color.WHITE);
		panel_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBounds(424, 0, 426, 24);
		panel_2_2.add(panel_3_1_2);

		final JLabel confusesNightdayLabel_2 = new JLabel();
		confusesNightdayLabel_2.setText("Screaming");
		confusesNightdayLabel_2.setBounds(165, 6, 95, 14);
		panel_3_1_2.add(confusesNightdayLabel_2);

		cbScreaming = new JCheckBox();
		cbScreaming.setBackground(Color.WHITE);
		cbScreaming.setText("");
		cbScreaming.setBounds(373, 3, 43, 20);
		panel_3_1_2.add(cbScreaming);

		final JPanel panel_3_2_4 = new JPanel();
		panel_3_2_4.setBackground(Color.WHITE);
		panel_3_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_4.setLayout(null);
		panel_3_2_4.setBounds(0, 23, 425, 24);
		panel_2_2.add(panel_3_2_4);

		final JLabel believesHesheIsLabel_2 = new JLabel();
		believesHesheIsLabel_2.setText("Disrobes in public");
		believesHesheIsLabel_2.setBounds(130, 6, 165, 14);
		panel_3_2_4.add(believesHesheIsLabel_2);

		cbDisrobesInPublic = new JCheckBox();
		cbDisrobesInPublic.setBackground(Color.WHITE);
		cbDisrobesInPublic.setText("");
		cbDisrobesInPublic.setBounds(372, 3, 43, 20);
		panel_3_2_4.add(cbDisrobesInPublic);

		final JPanel panel_3_2_1_3 = new JPanel();
		panel_3_2_1_3.setBackground(Color.WHITE);
		panel_3_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_3.setLayout(null);
		panel_3_2_1_3.setBounds(424, 23, 426, 24);
		panel_2_2.add(panel_3_2_1_3);

		final JLabel movesLipstalksToLabel_2 = new JLabel();
		movesLipstalksToLabel_2.setText("Kicking");
		movesLipstalksToLabel_2.setBounds(174, 3, 193, 14);
		panel_3_2_1_3.add(movesLipstalksToLabel_2);

		cbKicking = new JCheckBox();
		cbKicking.setBackground(Color.WHITE);
		cbKicking.setText("");
		cbKicking.setBounds(373, 3, 43, 20);
		panel_3_2_1_3.add(cbKicking);

		final JPanel panel_3_2_2_3 = new JPanel();
		panel_3_2_2_3.setBackground(Color.WHITE);
		panel_3_2_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_3.setLayout(null);
		panel_3_2_2_3.setBounds(0, 46, 425, 24);
		panel_2_2.add(panel_3_2_2_3);

		final JLabel speechIsIncoherentLabel_2 = new JLabel();
		speechIsIncoherentLabel_2.setText("Smears Food");
		speechIsIncoherentLabel_2.setBounds(140, 6, 169, 14);
		panel_3_2_2_3.add(speechIsIncoherentLabel_2);

		cbSmearsFood = new JCheckBox();
		cbSmearsFood.setBackground(Color.WHITE);
		cbSmearsFood.setText("");
		cbSmearsFood.setBounds(372, 3, 43, 20);
		panel_3_2_2_3.add(cbSmearsFood);

		final JPanel panel_3_2_1_1_3 = new JPanel();
		panel_3_2_1_1_3.setBackground(Color.WHITE);
		panel_3_2_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_3.setLayout(null);
		panel_3_2_1_1_3.setBounds(424, 46, 426, 24);
		panel_2_2.add(panel_3_2_1_1_3);

		final JLabel losesTrainOfLabel_2 = new JLabel();
		losesTrainOfLabel_2.setText("Biting");
		losesTrainOfLabel_2.setBounds(172, 3, 103, 14);
		panel_3_2_1_1_3.add(losesTrainOfLabel_2);

		cbBiting = new JCheckBox();
		cbBiting.setBackground(Color.WHITE);
		cbBiting.setText("");
		cbBiting.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_3.add(cbBiting);

		final JPanel panel_3_2_2_1_3 = new JPanel();
		panel_3_2_2_1_3.setBackground(Color.WHITE);
		panel_3_2_2_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_3.setLayout(null);
		panel_3_2_2_1_3.setBounds(0, 69, 425, 24);
		panel_2_2.add(panel_3_2_2_1_3);

		cbSmearsFeces = new JCheckBox();
		cbSmearsFeces.setBackground(Color.WHITE);
		cbSmearsFeces.setText("");
		cbSmearsFeces.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_3.add(cbSmearsFeces);

		final JLabel mentalFunctionVariesLabel_2_1_1 = new JLabel();
		mentalFunctionVariesLabel_2_1_1.setBounds(143, 5, 178, 14);
		panel_3_2_2_1_3.add(mentalFunctionVariesLabel_2_1_1);
		mentalFunctionVariesLabel_2_1_1.setText("Smears feces");

		final JPanel panel_3_2_1_1_1_3 = new JPanel();
		panel_3_2_1_1_1_3.setBackground(Color.WHITE);
		panel_3_2_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_3.setLayout(null);
		panel_3_2_1_1_1_3.setBounds(424, 69, 426, 24);
		panel_2_2.add(panel_3_2_1_1_1_3);

		final JLabel picksAtSkinLabel_2 = new JLabel();
		picksAtSkinLabel_2.setText("Scratching");
		picksAtSkinLabel_2.setBounds(162, 3, 115, 14);
		panel_3_2_1_1_1_3.add(picksAtSkinLabel_2);

		cbScratching = new JCheckBox();
		cbScratching.setBackground(Color.WHITE);
		cbScratching.setText("");
		cbScratching.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_3.add(cbScratching);

		final JPanel panel_3_2_2_1_1_3 = new JPanel();
		panel_3_2_2_1_1_3.setBackground(Color.WHITE);
		panel_3_2_2_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_3.setLayout(null);
		panel_3_2_2_1_1_3.setBounds(0, 92, 425, 24);
		panel_2_2.add(panel_3_2_2_1_1_3);

		cbHoarding = new JCheckBox();
		cbHoarding.setBackground(Color.WHITE);
		cbHoarding.setText("");
		cbHoarding.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_3.add(cbHoarding);

		final JLabel fidgetsLabel_2 = new JLabel();
		fidgetsLabel_2.setBounds(154, 5, 83, 14);
		panel_3_2_2_1_1_3.add(fidgetsLabel_2);
		fidgetsLabel_2.setText("Hoarding");

		final JPanel panel_3_2_1_1_1_1_3 = new JPanel();
		panel_3_2_1_1_1_1_3.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1_3.setLayout(null);
		panel_3_2_1_1_1_1_3.setBounds(424, 92, 426, 24);
		panel_2_2.add(panel_3_2_1_1_1_1_3);

		final JLabel repetativePhysicalMovementsLabel_2 = new JLabel();
		repetativePhysicalMovementsLabel_2.setText("Pushing");
		repetativePhysicalMovementsLabel_2.setBounds(168, 3, 152, 14);
		panel_3_2_1_1_1_1_3.add(repetativePhysicalMovementsLabel_2);

		cbPushing = new JCheckBox();
		cbPushing.setBackground(Color.WHITE);
		cbPushing.setText("");
		cbPushing.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_3.add(cbPushing);

		final JPanel panel_3_2_2_1_1_1_3 = new JPanel();
		panel_3_2_2_1_1_1_3.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_1_3.setLayout(null);
		panel_3_2_2_1_1_1_3.setBounds(0, 115, 425, 24);
		panel_2_2.add(panel_3_2_2_1_1_1_3);

		cbRummages = new JCheckBox();
		cbRummages.setBackground(Color.WHITE);
		cbRummages.setText("");
		cbRummages.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1_3.add(cbRummages);

		final JLabel changesPositionFrequentlyLabel_2 = new JLabel();
		changesPositionFrequentlyLabel_2.setBounds(121, 5, 176, 14);
		panel_3_2_2_1_1_1_3.add(changesPositionFrequentlyLabel_2);
		changesPositionFrequentlyLabel_2
				.setText("Rummages through other belongings");

		final JPanel panel_3_2_1_1_1_1_1_3 = new JPanel();
		panel_3_2_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1_1_3.setLayout(null);
		panel_3_2_1_1_1_1_1_3.setBounds(424, 115, 426, 24);
		panel_2_2.add(panel_3_2_1_1_1_1_1_3);

		final JLabel staresIntoSpacesluggishLabel_2 = new JLabel();
		staresIntoSpacesluggishLabel_2.setText("Hitting/punching");
		staresIntoSpacesluggishLabel_2.setBounds(151, 6, 124, 14);
		panel_3_2_1_1_1_1_1_3.add(staresIntoSpacesluggishLabel_2);

		cbHitting = new JCheckBox();
		cbHitting.setBackground(Color.WHITE);
		cbHitting.setText("");
		cbHitting.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_1_3.add(cbHitting);

		final JPanel panel_3_2_2_1_1_1_1_3 = new JPanel();
		panel_3_2_2_1_1_1_1_3.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_1_1_3.setLayout(null);
		panel_3_2_2_1_1_1_1_3.setBounds(0, 138, 425, 24);
		panel_2_2.add(panel_3_2_2_1_1_1_1_3);

		cbWanders = new JCheckBox();
		cbWanders.setBackground(Color.WHITE);
		cbWanders.setText("");
		cbWanders.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1_1_3.add(cbWanders);

		final JLabel repetativeCallingOutLabel_2 = new JLabel();
		repetativeCallingOutLabel_2.setBounds(152, 5, 104, 14);
		panel_3_2_2_1_1_1_1_3.add(repetativeCallingOutLabel_2);
		repetativeCallingOutLabel_2.setText("Wanders");

		final JPanel panel_3_2_1_1_1_1_1_1_3 = new JPanel();
		panel_3_2_1_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_1_1_3
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1_1_1_3.setLayout(null);
		panel_3_2_1_1_1_1_1_1_3.setBounds(424, 138, 426, 24);
		panel_2_2.add(panel_3_2_1_1_1_1_1_1_3);

		final JLabel littleBodyMovementLabel_1 = new JLabel();
		littleBodyMovementLabel_1.setText("Cursing");
		littleBodyMovementLabel_1.setBounds(170, 3, 100, 14);
		panel_3_2_1_1_1_1_1_1_3.add(littleBodyMovementLabel_1);

		cbCursing = new JCheckBox();
		cbCursing.setBackground(Color.WHITE);
		cbCursing.setText("");
		cbCursing.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_1_1_3.add(cbCursing);

		final JPanel panel_3_2_2_1_1_1_1_1_1 = new JPanel();
		panel_3_2_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_1_1_1_1.setLayout(null);
		panel_3_2_2_1_1_1_1_1_1.setBounds(0, 161, 425, 24);
		panel_2_2.add(panel_3_2_2_1_1_1_1_1_1);

		cbThreatensOthers = new JCheckBox();
		cbThreatensOthers.setBackground(Color.WHITE);
		cbThreatensOthers.setText("");
		cbThreatensOthers.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1_1_1_1.add(cbThreatensOthers);

		final JLabel difficultToArouseLabel_2 = new JLabel();
		difficultToArouseLabel_2.setBounds(140, 3, 116, 14);
		panel_3_2_2_1_1_1_1_1_1.add(difficultToArouseLabel_2);
		difficultToArouseLabel_2.setText("Threatens others");

		final JPanel panel_3_2_1_1_1_1_1_1_1_1 = new JPanel();
		panel_3_2_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_3_2_1_1_1_1_1_1_1_1.setLayout(null);
		panel_3_2_1_1_1_1_1_1_1_1.setBounds(424, 161, 426, 24);
		panel_2_2.add(panel_3_2_1_1_1_1_1_1_1_1);

		final JLabel noneOfTheLabel_1 = new JLabel();
		noneOfTheLabel_1.setText("sexually inappropriate behavior");
		noneOfTheLabel_1.setBounds(124, 3, 175, 14);
		panel_3_2_1_1_1_1_1_1_1_1.add(noneOfTheLabel_1);

		cbSexuallyInappropriateBehave = new JCheckBox();
		cbSexuallyInappropriateBehave.setBackground(Color.WHITE);
		cbSexuallyInappropriateBehave.setText("");
		cbSexuallyInappropriateBehave.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_1_1_1_1.add(cbSexuallyInappropriateBehave);

		final JPanel panel_3_2_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_3_2_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_3_2_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_3_2_1_1_1_1_1_1_1_1_1.setBounds(424, 184, 426, 24);
		panel_2_2.add(panel_3_2_1_1_1_1_1_1_1_1_1);

		final JLabel noneOfTheLabel_1_1 = new JLabel();
		noneOfTheLabel_1_1.setText("Resistive to taking medication");
		noneOfTheLabel_1_1.setBounds(125, 6, 159, 14);
		panel_3_2_1_1_1_1_1_1_1_1_1.add(noneOfTheLabel_1_1);

		cbResistiveToMedication = new JCheckBox();
		cbResistiveToMedication.setBackground(Color.WHITE);
		cbResistiveToMedication.setText("");
		cbResistiveToMedication.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_1_1_1_1_1.add(cbResistiveToMedication);

		final JPanel panel_3_2_2_1_1_1_1_1_1_1_1 = new JPanel();
		panel_3_2_2_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_3_2_2_1_1_1_1_1_1_1_1.setLayout(null);
		panel_3_2_2_1_1_1_1_1_1_1_1.setBounds(0, 207, 425, 24);
		panel_2_2.add(panel_3_2_2_1_1_1_1_1_1_1_1);

		cbResistiveToEating = new JCheckBox();
		cbResistiveToEating.setBackground(Color.WHITE);
		cbResistiveToEating.setText("");
		cbResistiveToEating.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1_1_1_1_1_1.add(cbResistiveToEating);

		final JLabel mentalFunctionVariesLabel_2_1 = new JLabel();
		mentalFunctionVariesLabel_2_1.setBounds(145, 5, 187, 14);
		panel_3_2_2_1_1_1_1_1_1_1_1.add(mentalFunctionVariesLabel_2_1);
		mentalFunctionVariesLabel_2_1.setText("Resistive to eating");

		final JPanel panel_3_2_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_3_2_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_3_2_1_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_3_2_1_1_1_1_1_1_1_1_1_1.setBounds(424, 207, 426, 24);
		panel_2_2.add(panel_3_2_1_1_1_1_1_1_1_1_1_1);

		final JPanel panel_3_2_2_1_1_1_1_1_1_1 = new JPanel();
		panel_3_2_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1_1_1_1_1.setBounds(0, 184, 425, 24);
		panel_2_2.add(panel_3_2_2_1_1_1_1_1_1_1);
		panel_3_2_2_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_3_2_2_1_1_1_1_1_1_1.setLayout(null);

		cbResistiveToCare = new JCheckBox();
		cbResistiveToCare.setBackground(Color.WHITE);
		cbResistiveToCare.setText("");
		cbResistiveToCare.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1_1_1_1_1.add(cbResistiveToCare);

		final JLabel mentalFunctionVariesLabel_2 = new JLabel();
		mentalFunctionVariesLabel_2.setBounds(144, 3, 166, 14);
		panel_3_2_2_1_1_1_1_1_1_1.add(mentalFunctionVariesLabel_2);
		mentalFunctionVariesLabel_2.setText("Resistive to care");

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(62, 845, 849, 28);
		add(panel_4_1);

		final JLabel ifAnyOfLabel_1 = new JLabel();
		ifAnyOfLabel_1
				.setText("if any of the above is checked .Note frequency");
		ifAnyOfLabel_1.setBounds(10, 5, 342, 14);
		panel_4_1.add(ifAnyOfLabel_1);

		rbBehaveDaily = new JRadioButton();
		rbBehaveDaily.setActionCommand("1");
		bgBehavior.add(rbBehaveDaily);
		rbBehaveDaily.setBackground(Color.WHITE);
		rbBehaveDaily.setText("Daily");
		rbBehaveDaily.setBounds(421, 1, 66, 22);
		panel_4_1.add(rbBehaveDaily);

		rbBehave1_3Days = new JRadioButton();
		rbBehave1_3Days.setActionCommand("2");
		bgBehavior.add(rbBehave1_3Days);
		rbBehave1_3Days.setBackground(Color.WHITE);
		rbBehave1_3Days.setText("1-3 days a week");
		rbBehave1_3Days.setBounds(548, 1, 127, 22);
		panel_4_1.add(rbBehave1_3Days);

		rbBehave4_7Days = new JRadioButton();
		rbBehave4_7Days.setActionCommand("3");
		bgBehavior.add(rbBehave4_7Days);
		rbBehave4_7Days.setBackground(Color.WHITE);
		rbBehave4_7Days.setText("4-7 days a week");
		rbBehave4_7Days.setBounds(712, 1, 127, 22);
		panel_4_1.add(rbBehave4_7Days);

		final JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(62, 873, 849, 85);
		add(panel_5);

		final JLabel skincircleYesLabel = new JLabel();
		skincircleYesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		skincircleYesLabel.setText("Skin: (circle Yes or No)");
		skincircleYesLabel.setBounds(10, 5, 207, 14);
		panel_5.add(skincircleYesLabel);

		final JLabel presenceOfEdemaLabel = new JLabel();
		presenceOfEdemaLabel.setText("Presence of edema in past 7 days");
		presenceOfEdemaLabel.setBounds(10, 25, 266, 14);
		panel_5.add(presenceOfEdemaLabel);

		rbSkinEdemaYes = new JRadioButton();
		rbSkinEdemaYes.setActionCommand("1");
		bgSkinEdema.add(rbSkinEdemaYes);
		rbSkinEdemaYes.setBackground(Color.WHITE);
		rbSkinEdemaYes.setText("Yes");
		rbSkinEdemaYes.setBounds(210, 23, 66, 14);
		panel_5.add(rbSkinEdemaYes);

		rbSkinEdemaNo = new JRadioButton();
		rbSkinEdemaNo.setActionCommand("2");
		bgSkinEdema.add(rbSkinEdemaNo);
		rbSkinEdemaNo.setBackground(Color.WHITE);
		rbSkinEdemaNo.setText("No");
		rbSkinEdemaNo.setBounds(297, 25, 66, 14);
		panel_5.add(rbSkinEdemaNo);

		final JLabel ifYesWhereLabel = new JLabel();
		ifYesWhereLabel.setText("if yes where?");
		ifYesWhereLabel.setBounds(10, 45, 167, 14);
		panel_5.add(ifYesWhereLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 45, 629, 40);
		panel_5.add(scrollPane);

		txtSkinEdema = new JTextArea();
		scrollPane.setViewportView(txtSkinEdema);

		final JLabel devicesrestraintscheckAnyUtilizedLabel = new JLabel();
		devicesrestraintscheckAnyUtilizedLabel.setFont(new Font("Tahoma",
				Font.BOLD, 12));
		devicesrestraintscheckAnyUtilizedLabel
				.setText("DEVICES/RESTRAINTS(Check any utilized on this shift in past 7 days))");
		devicesrestraintscheckAnyUtilizedLabel.setBounds(320, 964, 470, 14);
		add(devicesrestraintscheckAnyUtilizedLabel);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(62, 984, 850, 116);
		add(panel_2_1_1);

		final JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setBackground(Color.WHITE);
		panel_3_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_3_1.setLayout(null);
		panel_3_3_1.setBounds(0, 0, 425, 24);
		panel_2_1_1.add(panel_3_3_1);

		final JLabel difficultyPayingAttentiongetsLabel_1_1 = new JLabel();
		difficultyPayingAttentiongetsLabel_1_1.setText("Both side rails up");
		difficultyPayingAttentiongetsLabel_1_1.setBounds(127, 8, 239, 14);
		panel_3_3_1.add(difficultyPayingAttentiongetsLabel_1_1);

		cbBothSideRailsUp = new JCheckBox();
		cbBothSideRailsUp.setBackground(Color.WHITE);
		cbBothSideRailsUp.setText("");
		cbBothSideRailsUp.setBounds(372, 2, 43, 20);
		panel_3_3_1.add(cbBothSideRailsUp);

		final JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBounds(424, 0, 426, 24);
		panel_2_1_1.add(panel_3_1_1_1);

		final JLabel confusesNightdayLabel_1_1 = new JLabel();
		confusesNightdayLabel_1_1.setText("W/C alarm");
		confusesNightdayLabel_1_1.setBounds(143, 6, 171, 14);
		panel_3_1_1_1.add(confusesNightdayLabel_1_1);

		cbWcAlarm = new JCheckBox();
		cbWcAlarm.setBackground(Color.WHITE);
		cbWcAlarm.setText("");
		cbWcAlarm.setBounds(373, 3, 43, 20);
		panel_3_1_1_1.add(cbWcAlarm);

		final JPanel panel_3_2_3_1 = new JPanel();
		panel_3_2_3_1.setBackground(Color.WHITE);
		panel_3_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_3_1.setLayout(null);
		panel_3_2_3_1.setBounds(0, 23, 425, 24);
		panel_2_1_1.add(panel_3_2_3_1);

		final JLabel believesHesheIsLabel_1_1 = new JLabel();
		believesHesheIsLabel_1_1.setText("One side rails up");
		believesHesheIsLabel_1_1.setBounds(127, 9, 165, 14);
		panel_3_2_3_1.add(believesHesheIsLabel_1_1);

		cbOneSideRailsUp = new JCheckBox();
		cbOneSideRailsUp.setBackground(Color.WHITE);
		cbOneSideRailsUp.setText("");
		cbOneSideRailsUp.setBounds(372, 3, 43, 20);
		panel_3_2_3_1.add(cbOneSideRailsUp);

		final JPanel panel_3_2_1_2_1 = new JPanel();
		panel_3_2_1_2_1.setBackground(Color.WHITE);
		panel_3_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_2_1.setLayout(null);
		panel_3_2_1_2_1.setBounds(424, 23, 426, 24);
		panel_2_1_1.add(panel_3_2_1_2_1);

		final JLabel movesLipstalksToLabel_1_1 = new JLabel();
		movesLipstalksToLabel_1_1.setText("Reclining Geri chair");
		movesLipstalksToLabel_1_1.setBounds(136, 6, 173, 14);
		panel_3_2_1_2_1.add(movesLipstalksToLabel_1_1);

		cbRecliningGeriChair = new JCheckBox();
		cbRecliningGeriChair.setBackground(Color.WHITE);
		cbRecliningGeriChair.setText("");
		cbRecliningGeriChair.setBounds(373, 3, 43, 20);
		panel_3_2_1_2_1.add(cbRecliningGeriChair);

		final JPanel panel_3_2_2_2_1 = new JPanel();
		panel_3_2_2_2_1.setBackground(Color.WHITE);
		panel_3_2_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_2_1.setLayout(null);
		panel_3_2_2_2_1.setBounds(0, 46, 425, 24);
		panel_2_1_1.add(panel_3_2_2_2_1);

		final JLabel speechIsIncoherentLabel_1_1 = new JLabel();
		speechIsIncoherentLabel_1_1.setText("Mitts");
		speechIsIncoherentLabel_1_1.setBounds(151, 9, 193, 14);
		panel_3_2_2_2_1.add(speechIsIncoherentLabel_1_1);

		cbMitts = new JCheckBox();
		cbMitts.setBackground(Color.WHITE);
		cbMitts.setText("");
		cbMitts.setBounds(372, 3, 43, 20);
		panel_3_2_2_2_1.add(cbMitts);

		final JPanel panel_3_2_1_1_2_1 = new JPanel();
		panel_3_2_1_1_2_1.setBackground(Color.WHITE);
		panel_3_2_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_2_1.setLayout(null);
		panel_3_2_1_1_2_1.setBounds(424, 46, 426, 24);
		panel_2_1_1.add(panel_3_2_1_1_2_1);

		final JLabel losesTrainOfLabel_1_1 = new JLabel();
		losesTrainOfLabel_1_1.setText("Reclining Geri chair with tray");
		losesTrainOfLabel_1_1.setBounds(131, 6, 179, 14);
		panel_3_2_1_1_2_1.add(losesTrainOfLabel_1_1);

		cbGeriChairWithTray = new JCheckBox();
		cbGeriChairWithTray.setBackground(Color.WHITE);
		cbGeriChairWithTray.setText("");
		cbGeriChairWithTray.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_2_1.add(cbGeriChairWithTray);

		final JPanel panel_3_2_2_1_2_1 = new JPanel();
		panel_3_2_2_1_2_1.setBackground(Color.WHITE);
		panel_3_2_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_2_1.setLayout(null);
		panel_3_2_2_1_2_1.setBounds(0, 69, 425, 24);
		panel_2_1_1.add(panel_3_2_2_1_2_1);

		final JLabel fidgetsLabel_1_1 = new JLabel();
		fidgetsLabel_1_1.setText("Posture support");
		fidgetsLabel_1_1.setBounds(128, 9, 91, 14);
		panel_3_2_2_1_2_1.add(fidgetsLabel_1_1);

		cbPostureSupport = new JCheckBox();
		cbPostureSupport.setBackground(Color.WHITE);
		cbPostureSupport.setText("");
		cbPostureSupport.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_2_1.add(cbPostureSupport);

		final JPanel panel_3_2_1_1_1_2_1 = new JPanel();
		panel_3_2_1_1_1_2_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_2_1.setLayout(null);
		panel_3_2_1_1_1_2_1.setBounds(424, 69, 426, 24);
		panel_2_1_1.add(panel_3_2_1_1_1_2_1);

		final JLabel picksAtSkinLabel_1_1 = new JLabel();
		picksAtSkinLabel_1_1.setText("W/C seat belt");
		picksAtSkinLabel_1_1.setBounds(140, 9, 158, 14);
		panel_3_2_1_1_1_2_1.add(picksAtSkinLabel_1_1);

		cbWcSeatBelt = new JCheckBox();
		cbWcSeatBelt.setBackground(Color.WHITE);
		cbWcSeatBelt.setText("");
		cbWcSeatBelt.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_2_1.add(cbWcSeatBelt);

		final JPanel panel_3_2_2_1_1_2_1 = new JPanel();
		panel_3_2_2_1_1_2_1.setBackground(Color.WHITE);
		panel_3_2_2_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_2_1.setLayout(null);
		panel_3_2_2_1_1_2_1.setBounds(0, 92, 425, 24);
		panel_2_1_1.add(panel_3_2_2_1_1_2_1);

		final JLabel changesPositionFrequentlyLabel_1_1 = new JLabel();
		changesPositionFrequentlyLabel_1_1.setText("Wedge Cushion");
		changesPositionFrequentlyLabel_1_1.setBounds(126, 9, 135, 14);
		panel_3_2_2_1_1_2_1.add(changesPositionFrequentlyLabel_1_1);

		cbWedgeCushion = new JCheckBox();
		cbWedgeCushion.setBackground(Color.WHITE);
		cbWedgeCushion.setText("");
		cbWedgeCushion.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_2_1.add(cbWedgeCushion);

		final JPanel panel_3_2_1_1_1_1_2_1 = new JPanel();
		panel_3_2_1_1_1_1_2_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_1_2_1.setLayout(null);
		panel_3_2_1_1_1_1_2_1.setBounds(424, 92, 426, 24);
		panel_2_1_1.add(panel_3_2_1_1_1_1_2_1);

		final JLabel repetativePhysicalMovementsLabel_1_1 = new JLabel();
		repetativePhysicalMovementsLabel_1_1.setText("Lap buddy");
		repetativePhysicalMovementsLabel_1_1.setBounds(144, 9, 171, 14);
		panel_3_2_1_1_1_1_2_1.add(repetativePhysicalMovementsLabel_1_1);

		cbLapBuddy = new JCheckBox();
		cbLapBuddy.setBackground(Color.WHITE);
		cbLapBuddy.setText("");
		cbLapBuddy.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_1_2_1.add(cbLapBuddy);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(62, 1106, 849, 85);
		add(panel_6);

		final JLabel otherSpecifyLabel = new JLabel();
		otherSpecifyLabel.setText("Other ");
		otherSpecifyLabel.setBounds(10, 5, 88, 14);
		panel_6.add(otherSpecifyLabel);

		final JLabel specifyLabel = new JLabel();
		specifyLabel.setText("Specify");
		specifyLabel.setBounds(275, 10, 54, 14);
		panel_6.add(specifyLabel);

		txtSpecifyOthers = new JTextField();
		txtSpecifyOthers.setBounds(335, 3, 514, 18);
		panel_6.add(txtSpecifyOthers);

		cbOther = new JCheckBox();
		cbOther.setBackground(Color.WHITE);
		cbOther.setText("");
		cbOther.setBounds(52, 5, 101, 14);
		panel_6.add(cbOther);

		final JLabel ifAnyOfLabel_2 = new JLabel();
		ifAnyOfLabel_2
				.setText("if any of the above checked state frequency and reason for use");
		ifAnyOfLabel_2.setBounds(10, 36, 319, 14);
		panel_6.add(ifAnyOfLabel_2);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(335, 36, 514, 49);
		panel_6.add(scrollPane_1);

		txtDevicesRestraintsReason = new JTextArea();
		scrollPane_1.setViewportView(txtDevicesRestraintsReason);

		final JLabel assistiveDevicesLabel = new JLabel();
		assistiveDevicesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		assistiveDevicesLabel.setText("Assistive Devices");
		assistiveDevicesLabel.setBounds(440, 1197, 235, 14);
		add(assistiveDevicesLabel);

		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(62, 1217, 850, 93);
		add(panel_2_1_1_1);

		final JPanel panel_3_3_1_1 = new JPanel();
		panel_3_3_1_1.setBackground(Color.WHITE);
		panel_3_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_3_1_1.setLayout(null);
		panel_3_3_1_1.setBounds(0, 0, 425, 24);
		panel_2_1_1_1.add(panel_3_3_1_1);

		final JLabel difficultyPayingAttentiongetsLabel_1_1_1 = new JLabel();
		difficultyPayingAttentiongetsLabel_1_1_1.setText("Brace/Splint");
		difficultyPayingAttentiongetsLabel_1_1_1.setBounds(127, 8, 239, 14);
		panel_3_3_1_1.add(difficultyPayingAttentiongetsLabel_1_1_1);

		cbBraceSplint = new JCheckBox();
		cbBraceSplint.setBackground(Color.WHITE);
		cbBraceSplint.setText("");
		cbBraceSplint.setBounds(372, 2, 43, 20);
		panel_3_3_1_1.add(cbBraceSplint);

		final JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1.setBounds(424, 0, 426, 24);
		panel_2_1_1_1.add(panel_3_1_1_1_1);

		final JLabel confusesNightdayLabel_1_1_1 = new JLabel();
		confusesNightdayLabel_1_1_1.setText("Cane");
		confusesNightdayLabel_1_1_1.setBounds(143, 6, 171, 14);
		panel_3_1_1_1_1.add(confusesNightdayLabel_1_1_1);

		cbCane = new JCheckBox();
		cbCane.setBackground(Color.WHITE);
		cbCane.setText("");
		cbCane.setBounds(373, 3, 43, 20);
		panel_3_1_1_1_1.add(cbCane);

		final JPanel panel_3_2_3_1_1 = new JPanel();
		panel_3_2_3_1_1.setBackground(Color.WHITE);
		panel_3_2_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_3_1_1.setLayout(null);
		panel_3_2_3_1_1.setBounds(0, 23, 425, 24);
		panel_2_1_1_1.add(panel_3_2_3_1_1);

		final JLabel believesHesheIsLabel_1_1_1 = new JLabel();
		believesHesheIsLabel_1_1_1.setText("Wheel Chair");
		believesHesheIsLabel_1_1_1.setBounds(127, 9, 165, 14);
		panel_3_2_3_1_1.add(believesHesheIsLabel_1_1_1);

		cbWheelChair = new JCheckBox();
		cbWheelChair.setBackground(Color.WHITE);
		cbWheelChair.setText("");
		cbWheelChair.setBounds(372, 3, 43, 20);
		panel_3_2_3_1_1.add(cbWheelChair);

		final JPanel panel_3_2_1_2_1_1 = new JPanel();
		panel_3_2_1_2_1_1.setBackground(Color.WHITE);
		panel_3_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_2_1_1.setLayout(null);
		panel_3_2_1_2_1_1.setBounds(424, 23, 426, 24);
		panel_2_1_1_1.add(panel_3_2_1_2_1_1);

		final JLabel movesLipstalksToLabel_1_1_1 = new JLabel();
		movesLipstalksToLabel_1_1_1.setText("Crutch");
		movesLipstalksToLabel_1_1_1.setBounds(136, 6, 173, 14);
		panel_3_2_1_2_1_1.add(movesLipstalksToLabel_1_1_1);

		cbCrutch = new JCheckBox();
		cbCrutch.setBackground(Color.WHITE);
		cbCrutch.setText("");
		cbCrutch.setBounds(373, 3, 43, 20);
		panel_3_2_1_2_1_1.add(cbCrutch);

		final JPanel panel_3_2_2_2_1_1 = new JPanel();
		panel_3_2_2_2_1_1.setBackground(Color.WHITE);
		panel_3_2_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_2_1_1.setLayout(null);
		panel_3_2_2_2_1_1.setBounds(0, 46, 425, 24);
		panel_2_1_1_1.add(panel_3_2_2_2_1_1);

		final JLabel speechIsIncoherentLabel_1_1_1 = new JLabel();
		speechIsIncoherentLabel_1_1_1.setText("Walker");
		speechIsIncoherentLabel_1_1_1.setBounds(139, 9, 205, 14);
		panel_3_2_2_2_1_1.add(speechIsIncoherentLabel_1_1_1);

		cbWalker = new JCheckBox();
		cbWalker.setBackground(Color.WHITE);
		cbWalker.setText("");
		cbWalker.setBounds(372, 3, 43, 20);
		panel_3_2_2_2_1_1.add(cbWalker);

		final JPanel panel_3_2_1_1_2_1_1 = new JPanel();
		panel_3_2_1_1_2_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_2_1_1.setLayout(null);
		panel_3_2_1_1_2_1_1.setBounds(424, 46, 426, 24);
		panel_2_1_1_1.add(panel_3_2_1_1_2_1_1);

		final JLabel losesTrainOfLabel_1_1_1 = new JLabel();
		losesTrainOfLabel_1_1_1.setText("Trapeze");
		losesTrainOfLabel_1_1_1.setBounds(131, 6, 179, 14);
		panel_3_2_1_1_2_1_1.add(losesTrainOfLabel_1_1_1);

		cbTrapeze = new JCheckBox();
		cbTrapeze.setBackground(Color.WHITE);
		cbTrapeze.setText("");
		cbTrapeze.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_2_1_1.add(cbTrapeze);

		final JPanel panel_3_2_2_1_2_1_1 = new JPanel();
		panel_3_2_2_1_2_1_1.setBackground(Color.WHITE);
		panel_3_2_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_2_1_1.setLayout(null);
		panel_3_2_2_1_2_1_1.setBounds(0, 69, 425, 24);
		panel_2_1_1_1.add(panel_3_2_2_1_2_1_1);

		final JLabel fidgetsLabel_1_1_1 = new JLabel();
		fidgetsLabel_1_1_1.setText("Sliding Board");
		fidgetsLabel_1_1_1.setBounds(128, 9, 91, 14);
		panel_3_2_2_1_2_1_1.add(fidgetsLabel_1_1_1);

		cbSlidingBoard = new JCheckBox();
		cbSlidingBoard.setBackground(Color.WHITE);
		cbSlidingBoard.setText("");
		cbSlidingBoard.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_2_1_1.add(cbSlidingBoard);

		final JPanel panel_3_2_1_1_1_2_1_1 = new JPanel();
		panel_3_2_1_1_1_2_1_1.setBackground(Color.WHITE);
		panel_3_2_1_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_1_1_1_2_1_1.setLayout(null);
		panel_3_2_1_1_1_2_1_1.setBounds(424, 69, 426, 24);
		panel_2_1_1_1.add(panel_3_2_1_1_1_2_1_1);

		final JLabel picksAtSkinLabel_1_1_1 = new JLabel();
		picksAtSkinLabel_1_1_1.setText("Sling");
		picksAtSkinLabel_1_1_1.setBounds(140, 9, 158, 14);
		panel_3_2_1_1_1_2_1_1.add(picksAtSkinLabel_1_1_1);

		cbSling = new JCheckBox();
		cbSling.setBackground(Color.WHITE);
		cbSling.setText("");
		cbSling.setBounds(373, 3, 43, 20);
		panel_3_2_1_1_1_2_1_1.add(cbSling);

		final JLabel bowelAndBladderLabel = new JLabel();
		bowelAndBladderLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		bowelAndBladderLabel.setText("Bowel And Bladder");
		bowelAndBladderLabel.setBounds(440, 1316, 131, 14);
		add(bowelAndBladderLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(62, 1337, 849, 122);
		add(panel_7);

		final JLabel continentOfBladderifLabel = new JLabel();
		continentOfBladderifLabel
				.setText("<html><body>Continent of bladder?<br>if no, how many incontinent episodes in this shift in past 7 days?<br>Foley Catheter?<br>Continent of Bowel?<br>if no, how many incontinent episodes on this shift in past 7 days?<br>Ostomy?");
		continentOfBladderifLabel.setBounds(10, 5, 359, 107);
		panel_7.add(continentOfBladderifLabel);

		rbContinentYes = new JRadioButton();
		rbContinentYes.setActionCommand("1");
		bgContinentBladder.add(rbContinentYes);
		rbContinentYes.setBackground(Color.WHITE);
		rbContinentYes.setText("Yes");
		rbContinentYes.setBounds(375, 12, 51, 15);
		panel_7.add(rbContinentYes);

		rbContinentNo = new JRadioButton();
		rbContinentNo.setActionCommand("2");
		bgContinentBladder.add(rbContinentNo);
		rbContinentNo.setBackground(Color.WHITE);
		rbContinentNo.setText("No");
		rbContinentNo.setBounds(432, 12, 51, 15);
		panel_7.add(rbContinentNo);

		rbFoleyCatheterYes = new JRadioButton();
		rbFoleyCatheterYes.setActionCommand("1");
		bgFoleyCatheter.add(rbFoleyCatheterYes);
		rbFoleyCatheterYes.setBackground(Color.WHITE);
		rbFoleyCatheterYes.setText("Yes");
		rbFoleyCatheterYes.setBounds(375, 42, 51, 15);
		panel_7.add(rbFoleyCatheterYes);

		rbFoleyCatheterNo = new JRadioButton();
		rbFoleyCatheterNo.setActionCommand("2");
		bgFoleyCatheter.add(rbFoleyCatheterNo);
		rbFoleyCatheterNo.setBackground(Color.WHITE);
		rbFoleyCatheterNo.setText("No");
		rbFoleyCatheterNo.setBounds(432, 42, 51, 15);
		panel_7.add(rbFoleyCatheterNo);

		rbContinentBowelYes = new JRadioButton();
		rbContinentBowelYes.setActionCommand("1");
		bgContinentOfBowel.add(rbContinentBowelYes);
		rbContinentBowelYes.setBackground(Color.WHITE);
		rbContinentBowelYes.setText("Yes");
		rbContinentBowelYes.setBounds(375, 57, 51, 15);
		panel_7.add(rbContinentBowelYes);

		rbContinentBowelNo = new JRadioButton();
		rbContinentBowelNo.setActionCommand("2");
		bgContinentOfBowel.add(rbContinentBowelNo);
		rbContinentBowelNo.setBackground(Color.WHITE);
		rbContinentBowelNo.setText("No");
		rbContinentBowelNo.setBounds(432, 57, 51, 15);
		panel_7.add(rbContinentBowelNo);

		rbOstomyYes = new JRadioButton();
		rbOstomyYes.setActionCommand("1");
		bgOstomy.add(rbOstomyYes);
		rbOstomyYes.setBackground(Color.WHITE);
		rbOstomyYes.setText("Yes");
		rbOstomyYes.setBounds(375, 86, 51, 15);
		panel_7.add(rbOstomyYes);

		rbOstomyNo = new JRadioButton();
		rbOstomyNo.setActionCommand("2");
		bgOstomy.add(rbOstomyNo);
		rbOstomyNo.setBackground(Color.WHITE);
		rbOstomyNo.setText("No");
		rbOstomyNo.setBounds(432, 86, 51, 15);
		panel_7.add(rbOstomyNo);

		rbContinentOnce = new JRadioButton();
		rbContinentOnce.setActionCommand("1");
		bgContinentOfBladderFrequency.add(rbContinentOnce);
		rbContinentOnce.setBackground(Color.WHITE);
		rbContinentOnce.setText("Once");
		rbContinentOnce.setBounds(503, 25, 51, 15);
		panel_7.add(rbContinentOnce);

		rbContinent2OrMore = new JRadioButton();
		rbContinent2OrMore.setActionCommand("2");
		bgContinentOfBladderFrequency.add(rbContinent2OrMore);
		rbContinent2OrMore.setBackground(Color.WHITE);
		rbContinent2OrMore.setText("2 or more");
		rbContinent2OrMore.setBounds(567, 25, 68, 15);
		panel_7.add(rbContinent2OrMore);

		rbContinentDaily = new JRadioButton();
		rbContinentDaily.setActionCommand("3");
		bgContinentOfBladderFrequency.add(rbContinentDaily);
		rbContinentDaily.setBackground(Color.WHITE);
		rbContinentDaily.setText("Daily");
		rbContinentDaily.setBounds(641, 25, 51, 15);
		panel_7.add(rbContinentDaily);

		rbContinentBowelOnce = new JRadioButton();
		rbContinentBowelOnce.setActionCommand("1");
		bgContinentOfBowelFrequency.add(rbContinentBowelOnce);
		rbContinentBowelOnce.setBackground(Color.WHITE);
		rbContinentBowelOnce.setText("Once");
		rbContinentBowelOnce.setBounds(503, 71, 51, 15);
		panel_7.add(rbContinentBowelOnce);

		rbContinentBowel2OrMore = new JRadioButton();
		rbContinentBowel2OrMore.setActionCommand("2");
		bgContinentOfBowelFrequency.add(rbContinentBowel2OrMore);
		rbContinentBowel2OrMore.setBackground(Color.WHITE);
		rbContinentBowel2OrMore.setText("2 or more");
		rbContinentBowel2OrMore.setBounds(567, 71, 68, 15);
		panel_7.add(rbContinentBowel2OrMore);

		rbContinentBowelDaily = new JRadioButton();
		rbContinentBowelDaily.setActionCommand("3");
		bgContinentOfBowelFrequency.add(rbContinentBowelDaily);
		rbContinentBowelDaily.setBackground(Color.WHITE);
		rbContinentBowelDaily.setText("Daily");
		rbContinentBowelDaily.setBounds(641, 71, 51, 15);
		panel_7.add(rbContinentBowelDaily);

		final JLabel mealConsumptionLabel = new JLabel();
		mealConsumptionLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		mealConsumptionLabel.setText("Meal Consumption");
		mealConsumptionLabel.setBounds(489, 98, 166, 14);
		panel_7.add(mealConsumptionLabel);

		final JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBounds(62, 1459, 425, 139);
		add(panel_2_1_2);

		final JPanel panel_3_3_2 = new JPanel();
		panel_3_3_2.setBackground(Color.WHITE);
		panel_3_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_3_2.setLayout(null);
		panel_3_3_2.setBounds(0, 0, 425, 24);
		panel_2_1_2.add(panel_3_3_2);

		final JLabel difficultyPayingAttentiongetsLabel_1_2 = new JLabel();
		difficultyPayingAttentiongetsLabel_1_2
				.setText("Check All Used on this shift");
		difficultyPayingAttentiongetsLabel_1_2.setBounds(10, 5, 239, 14);
		panel_3_3_2.add(difficultyPayingAttentiongetsLabel_1_2);

		cbCheckAll = new JCheckBox();
		cbCheckAll.setBackground(Color.WHITE);
		cbCheckAll.setText("");
		cbCheckAll.setBounds(372, 2, 43, 20);
		panel_3_3_2.add(cbCheckAll);

		final JPanel panel_3_2_3_2 = new JPanel();
		panel_3_2_3_2.setBackground(Color.WHITE);
		panel_3_2_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_3_2.setLayout(null);
		panel_3_2_3_2.setBounds(0, 23, 425, 24);
		panel_2_1_2.add(panel_3_2_3_2);

		final JLabel believesHesheIsLabel_1_2 = new JLabel();
		believesHesheIsLabel_1_2.setText("BedPan/urinal");
		believesHesheIsLabel_1_2.setBounds(10, 6, 165, 14);
		panel_3_2_3_2.add(believesHesheIsLabel_1_2);

		cbBedPanUrinal = new JCheckBox();
		cbBedPanUrinal.setBackground(Color.WHITE);
		cbBedPanUrinal.setText("");
		cbBedPanUrinal.setBounds(372, 3, 43, 20);
		panel_3_2_3_2.add(cbBedPanUrinal);

		final JPanel panel_3_2_2_2_2 = new JPanel();
		panel_3_2_2_2_2.setBackground(Color.WHITE);
		panel_3_2_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_2_2.setLayout(null);
		panel_3_2_2_2_2.setBounds(0, 46, 425, 24);
		panel_2_1_2.add(panel_3_2_2_2_2);

		final JLabel speechIsIncoherentLabel_1_2 = new JLabel();
		speechIsIncoherentLabel_1_2.setText("Toilet/Bathroom");
		speechIsIncoherentLabel_1_2.setBounds(10, 6, 193, 14);
		panel_3_2_2_2_2.add(speechIsIncoherentLabel_1_2);

		cbToiletBathroom = new JCheckBox();
		cbToiletBathroom.setBackground(Color.WHITE);
		cbToiletBathroom.setText("");
		cbToiletBathroom.setBounds(372, 3, 43, 20);
		panel_3_2_2_2_2.add(cbToiletBathroom);

		final JPanel panel_3_2_2_1_2_2 = new JPanel();
		panel_3_2_2_1_2_2.setBackground(Color.WHITE);
		panel_3_2_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_2_2.setLayout(null);
		panel_3_2_2_1_2_2.setBounds(0, 69, 425, 24);
		panel_2_1_2.add(panel_3_2_2_1_2_2);

		final JLabel fidgetsLabel_1_2 = new JLabel();
		fidgetsLabel_1_2.setBackground(Color.WHITE);
		fidgetsLabel_1_2.setText("Bedside commode");
		fidgetsLabel_1_2.setBounds(10, 6, 323, 14);
		panel_3_2_2_1_2_2.add(fidgetsLabel_1_2);

		cbBedsideCommode = new JCheckBox();
		cbBedsideCommode.setBackground(Color.WHITE);
		cbBedsideCommode.setText("");
		cbBedsideCommode.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_2_2.add(cbBedsideCommode);

		final JPanel panel_3_2_2_1_1_2_2 = new JPanel();
		panel_3_2_2_1_1_2_2.setBackground(Color.WHITE);
		panel_3_2_2_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_2_2.setLayout(null);
		panel_3_2_2_1_1_2_2.setBounds(0, 92, 425, 24);
		panel_2_1_2.add(panel_3_2_2_1_1_2_2);

		final JLabel changesPositionFrequentlyLabel_1_2 = new JLabel();
		changesPositionFrequentlyLabel_1_2.setText("Depends");
		changesPositionFrequentlyLabel_1_2.setBounds(10, 6, 135, 14);
		panel_3_2_2_1_1_2_2.add(changesPositionFrequentlyLabel_1_2);

		cbDepends = new JCheckBox();
		cbDepends.setBackground(Color.WHITE);
		cbDepends.setText("");
		cbDepends.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_2_2.add(cbDepends);

		final JPanel panel_3_2_2_1_1_1_2_1 = new JPanel();
		panel_3_2_2_1_1_1_2_1.setBackground(Color.WHITE);
		panel_3_2_2_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2_2_1_1_1_2_1.setLayout(null);
		panel_3_2_2_1_1_1_2_1.setBounds(0, 115, 425, 24);
		panel_2_1_2.add(panel_3_2_2_1_1_1_2_1);

		final JLabel repetativeCallingOutLabel_1_1 = new JLabel();
		repetativeCallingOutLabel_1_1.setText("Pads/Briefs");
		repetativeCallingOutLabel_1_1.setBounds(10, 6, 336, 14);
		panel_3_2_2_1_1_1_2_1.add(repetativeCallingOutLabel_1_1);

		cbPedsBriefs = new JCheckBox();
		cbPedsBriefs.setBackground(Color.WHITE);
		cbPedsBriefs.setText("");
		cbPedsBriefs.setBounds(372, 3, 43, 20);
		panel_3_2_2_1_1_1_2_1.add(cbPedsBriefs);

		final JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(493, 1459, 418, 139);
		add(panel_8);

		rbMeal75 = new JRadioButton();
		rbMeal75.setActionCommand("1");
		bgMeal.add(rbMeal75);
		rbMeal75.setBackground(Color.WHITE);
		rbMeal75.setText("75-100%");
		rbMeal75.setBounds(49, 10, 78, 18);
		panel_8.add(rbMeal75);

		rbMeal50 = new JRadioButton();
		rbMeal50.setActionCommand("2");
		bgMeal.add(rbMeal50);
		rbMeal50.setBackground(Color.WHITE);
		rbMeal50.setText("50-75%");
		rbMeal50.setBounds(149, 11, 78, 18);
		panel_8.add(rbMeal50);

		rbMeal25 = new JRadioButton();
		rbMeal25.setActionCommand("3");
		bgMeal.add(rbMeal25);
		rbMeal25.setBackground(Color.WHITE);
		rbMeal25.setText("25-50%");
		rbMeal25.setBounds(233, 10, 78, 18);
		panel_8.add(rbMeal25);

		rbMeal0 = new JRadioButton();
		rbMeal0.setActionCommand("4");
		bgMeal.add(rbMeal0);
		rbMeal0.setBackground(Color.WHITE);
		rbMeal0.setText("0-25%");
		rbMeal0.setBounds(317, 11, 78, 18);
		panel_8.add(rbMeal0);

		final JLabel if50OrLabel = new JLabel();
		if50OrLabel.setText("if 50% or less why?");
		if50OrLabel.setBounds(49, 43, 100, 14);
		panel_8.add(if50OrLabel);

		final JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(149, 37, 259, 48);
		panel_8.add(scrollPane_2);

		txtReasonMeal = new JTextArea();
		scrollPane_2.setViewportView(txtReasonMeal);

		final JLabel tubeFeedingLabel = new JLabel();
		tubeFeedingLabel.setText("Tube Feeding");
		tubeFeedingLabel.setBounds(49, 100, 100, 14);
		panel_8.add(tubeFeedingLabel);

		txtTubeFeeding = new JTextField();
		txtTubeFeeding.setBounds(149, 97, 259, 21);
		panel_8.add(txtTubeFeeding);
		updateData();
	}

	public static void main(String[] args) {

	}

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public void doUpdate() {
		// updateData();

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

	public void updateData() {
		List<Nurse> nurList = null;
		try {
			nurList = MedrexClientManager.getInstance().getNurseRecords();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		Iterator<Nurse> i = nurList.iterator();
		while (i.hasNext()) {
			Nurse nur = i.next();
			cmbNurse
					.addItem(nur.getNurseSurName() + " , " + nur.getNurseName());
		}
		// System.out.println("in update data"+Global.currentMonthlySummaryMainPageKey);
		MonthlySummaryMainPage refMonthlySummaryMainPage = null;
		if (Global.currentMonthlySummaryRecordKey != 0
				&& Global.currentMonthlySummaryMainPageKey != 0) {

			try {
				MonthlySummaryRecord msr = MedrexClientManager.getInstance()
						.getMonthlySummaryRecord(
								Global.currentMonthlySummaryRecordKey);
				refMonthlySummaryMainPage = MedrexClientManager.getInstance()
						.getMonthlySummaryMainPage(msr);
			} catch (Exception e) {
				e.printStackTrace();
			}
			SwingUtils.setSelectedButton(bgMeal, refMonthlySummaryMainPage
					.getMeal());
			SwingUtils.setSelectedButton(bgOstomy, refMonthlySummaryMainPage
					.getOstomy());
			SwingUtils.setSelectedButton(bgContinentOfBowelFrequency,
					refMonthlySummaryMainPage.getContinentOfBowelFrequency());
			SwingUtils.setSelectedButton(bgContinentOfBowel,
					refMonthlySummaryMainPage.getContinentOfBowel());
			SwingUtils.setSelectedButton(bgFoleyCatheter,
					refMonthlySummaryMainPage.getFoleyCatheter());
			SwingUtils.setSelectedButton(bgContinentOfBladderFrequency,
					refMonthlySummaryMainPage.getContinentOfBladderFrequency());
			SwingUtils.setSelectedButton(bgContinentBladder,
					refMonthlySummaryMainPage.getContinentBladder());
			SwingUtils.setSelectedButton(bgSkinEdema, refMonthlySummaryMainPage
					.getSkinEdema());
			SwingUtils.setSelectedButton(bgBehavior, refMonthlySummaryMainPage
					.getBehavior());
			SwingUtils.setSelectedButton(bgMoods, refMonthlySummaryMainPage
					.getMoods());
			SwingUtils.setSelectedButton(bgPhysicalCuesDecision,
					refMonthlySummaryMainPage.getPhysicalCuesDecision());
			SwingUtils.setSelectedButton(bgRecallLongPast,
					refMonthlySummaryMainPage.getRecallLongPast());
			SwingUtils.setSelectedButton(bgPhysicalCuesSafety,
					refMonthlySummaryMainPage.getPhysicalCuesSafety());
			SwingUtils.setSelectedButton(bgReasonable,
					refMonthlySummaryMainPage.getReasonable());
			SwingUtils.setSelectedButton(bgRecallWords,
					refMonthlySummaryMainPage.getRecallWords());
			txtTubeFeeding.setText(refMonthlySummaryMainPage.getTubeFeeding());
			txtReasonMeal.setText(refMonthlySummaryMainPage.getReasonMeal());
			cbPedsBriefs.setSelected(refMonthlySummaryMainPage.isPedsBriefs());
			cbDepends.setSelected(refMonthlySummaryMainPage.isDepends());
			cbBedsideCommode.setSelected(refMonthlySummaryMainPage
					.isBedsideCommode());
			cbToiletBathroom.setSelected(refMonthlySummaryMainPage
					.isToiletBathroom());
			cbBedPanUrinal.setSelected(refMonthlySummaryMainPage
					.isBedPanUrinal());
			cbCheckAll.setSelected(refMonthlySummaryMainPage.isCheckAll());
			cbSling.setSelected(refMonthlySummaryMainPage.isSling());
			cbTrapeze.setSelected(refMonthlySummaryMainPage.isTrapeze());
			cbCrutch.setSelected(refMonthlySummaryMainPage.isCrutch());
			cbCane.setSelected(refMonthlySummaryMainPage.isCane());
			cbSlidingBoard.setSelected(refMonthlySummaryMainPage
					.isSlidingBoard());
			cbWalker.setSelected(refMonthlySummaryMainPage.isWalker());
			cbWheelChair.setSelected(refMonthlySummaryMainPage.isWheelChair());
			cbBraceSplint
					.setSelected(refMonthlySummaryMainPage.isBraceSplint());
			txtDevicesRestraintsReason.setText(refMonthlySummaryMainPage
					.getDevicesRestraintsReason());
			txtSpecifyOthers.setText(refMonthlySummaryMainPage
					.getSpecifyOthers());
			cbOther.setSelected(refMonthlySummaryMainPage.isOther());
			cbLapBuddy.setSelected(refMonthlySummaryMainPage.isLapBuddy());
			cbWcSeatBelt.setSelected(refMonthlySummaryMainPage.isWcSeatBelt());
			cbGeriChairWithTray.setSelected(refMonthlySummaryMainPage
					.isGeriChairWithTray());
			cbRecliningGeriChair.setSelected(refMonthlySummaryMainPage
					.isRecliningGeriChair());
			cbWcAlarm.setSelected(refMonthlySummaryMainPage.isWcAlarm());
			cbWedgeCushion.setSelected(refMonthlySummaryMainPage
					.isWedgeCushion());
			cbPostureSupport.setSelected(refMonthlySummaryMainPage
					.isPostureSupport());
			cbMitts.setSelected(refMonthlySummaryMainPage.isMitts());
			cbOneSideRailsUp.setSelected(refMonthlySummaryMainPage
					.isOneSideRailsUp());
			cbBothSideRailsUp.setSelected(refMonthlySummaryMainPage
					.isBothSideRailsUp());
			txtSkinEdema.setText(refMonthlySummaryMainPage
					.getSkinEdemaLocation());
			cbResistiveToMedication.setSelected(refMonthlySummaryMainPage
					.isResistiveToMedication());
			cbSexuallyInappropriateBehave.setSelected(refMonthlySummaryMainPage
					.isSexuallyInappropriateBehave());
			cbCursing.setSelected(refMonthlySummaryMainPage.isCursing());
			cbHitting.setSelected(refMonthlySummaryMainPage.isHitting());
			cbPushing.setSelected(refMonthlySummaryMainPage.isPushing());
			cbScratching.setSelected(refMonthlySummaryMainPage.isScratching());
			cbBiting.setSelected(refMonthlySummaryMainPage.isBiting());
			cbKicking.setSelected(refMonthlySummaryMainPage.isKicking());
			cbScreaming.setSelected(refMonthlySummaryMainPage.isScreaming());
			cbResistiveToEating.setSelected(refMonthlySummaryMainPage
					.isResistiveToEating());
			cbResistiveToCare.setSelected(refMonthlySummaryMainPage
					.isResistiveToCare());
			cbThreatensOthers.setSelected(refMonthlySummaryMainPage
					.isThreatensOthers());
			cbWanders.setSelected(refMonthlySummaryMainPage.isWanders());
			cbRummages.setSelected(refMonthlySummaryMainPage.isRummages());
			cbHoarding.setSelected(refMonthlySummaryMainPage.isHoarding());
			cbSmearsFeces
					.setSelected(refMonthlySummaryMainPage.isSmearsFeces());
			cbSmearsFood.setSelected(refMonthlySummaryMainPage.isSmearsFood());
			cbDisrobesInPublic.setSelected(refMonthlySummaryMainPage
					.isDisrobesInPublic());
			cbCriesYells.setSelected(refMonthlySummaryMainPage.isCriesYells());
			cbWithdrawnFromActivities.setSelected(refMonthlySummaryMainPage
					.isWithdrawnFromActivities());
			cbSadPained.setSelected(refMonthlySummaryMainPage.isSadPained());
			cbUnpleasantMood.setSelected(refMonthlySummaryMainPage
					.isUnpleasantMood());
			cbRepeatitiveNonHealthComplaints
					.setSelected(refMonthlySummaryMainPage
							.isRepeatitiveNonHealthComplaints());
			cbRepeatitiveHealthComplaints.setSelected(refMonthlySummaryMainPage
					.isRepeatitiveHealthComplaints());
			cbExpressesUnrealisticFears.setSelected(refMonthlySummaryMainPage
					.isExpressesUnrealisticFears());
			cbRecurrentStatements.setSelected(refMonthlySummaryMainPage
					.isRecurrentStatements());
			cbCryingFearfulness.setSelected(refMonthlySummaryMainPage
					.isCryingFearfulness());
			cbSelfDeprecation.setSelected(refMonthlySummaryMainPage
					.isSelfDeprecation());
			cbPersistentAnger.setSelected(refMonthlySummaryMainPage
					.isPersistentAnger());
			cbRepetitiveVerbalization.setSelected(refMonthlySummaryMainPage
					.isRepetitiveVerbalization());
			cbRepetitiveQuestions.setSelected(refMonthlySummaryMainPage
					.isRepetitiveQuestions());
			cbMakesNegativeStatements.setSelected(refMonthlySummaryMainPage
					.isMakesNegativeStatements());
			cbNoneOfTheAbove.setSelected(refMonthlySummaryMainPage
					.isNoneOfTheAbove());
			cbLittleBodyMovement.setSelected(refMonthlySummaryMainPage
					.isLittleBodyMovement());
			cbStaresIntoSpace.setSelected(refMonthlySummaryMainPage
					.isStaresIntoSpace());
			cbRepetitivePhysicalMovements.setSelected(refMonthlySummaryMainPage
					.isRepetitivePhysicalMovements());
			cbPicksAtSkin
					.setSelected(refMonthlySummaryMainPage.isPicksAtSkin());
			cbLosesTrain.setSelected(refMonthlySummaryMainPage.isLosesTrain());
			cbMovesLips.setSelected(refMonthlySummaryMainPage.isMovesLips());
			cbConfusesNight.setSelected(refMonthlySummaryMainPage
					.isConfusesNight());
			cbMentalFunctionVaries.setSelected(refMonthlySummaryMainPage
					.isMentalFunctionVaries());
			cbDifficultToArouse.setSelected(refMonthlySummaryMainPage
					.isDifficultToArouse());
			cbRepetitiveCalling.setSelected(refMonthlySummaryMainPage
					.isRepetitiveCalling());
			cbChangesPosition.setSelected(refMonthlySummaryMainPage
					.isChangesPosition());
			cbFidgets.setSelected(refMonthlySummaryMainPage.isFidgets());
			cbIncoherentSpeech.setSelected(refMonthlySummaryMainPage
					.isIncoherentSpeech());
			cbBelievesSomewhereElse.setSelected(refMonthlySummaryMainPage
					.isBelievesSomewhereElse());
			cbDifficultyAttention.setSelected(refMonthlySummaryMainPage
					.isDifficultyAttention());
			// System.out.println("nurse name is"+refMonthlySummaryMainPage.getNurse());
			cmbNurse.setSelectedItem(refMonthlySummaryMainPage.getNurse() + "");
			dcMonthYear.setDate(refMonthlySummaryMainPage.getMonthYear());
			txtRoomNo.setText(refMonthlySummaryMainPage.getRoomNo());
			txtResidentName
					.setText(refMonthlySummaryMainPage.getResidentName());
			Global.currentMonthlySummaryMainPageKey = refMonthlySummaryMainPage
					.getSerial();

		} else {
			Global.currentMonthlySummaryMainPageKey = 0;
			ResidentMain rm = null;
			try {
				rm = MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
				if (rm != null) {
					txtResidentName.setText(rm.getUserPass() + " , "
							+ rm.getUserName());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public int doSave() {
		MonthlySummaryMainPage refMonthlySummaryMainPage = new MonthlySummaryMainPage();
		MonthlySummaryRecord msr = null;
		try {
			msr = MedrexClientManager.getInstance().getMonthlySummaryRecord(
					Global.currentMonthlySummaryRecordKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		refMonthlySummaryMainPage.setFormId(msr);
		refMonthlySummaryMainPage
				.setSerial(Global.currentMonthlySummaryMainPageKey);
		refMonthlySummaryMainPage.setResidentId(Global.currentResidenceKey);
		refMonthlySummaryMainPage.setMeal(SwingUtils.getSelectedButton(bgMeal));
		refMonthlySummaryMainPage.setOstomy(SwingUtils
				.getSelectedButton(bgOstomy));
		refMonthlySummaryMainPage.setContinentOfBowelFrequency(SwingUtils
				.getSelectedButton(bgContinentOfBowelFrequency));
		refMonthlySummaryMainPage.setContinentOfBowel(SwingUtils
				.getSelectedButton(bgContinentOfBowel));
		refMonthlySummaryMainPage.setFoleyCatheter(SwingUtils
				.getSelectedButton(bgFoleyCatheter));
		refMonthlySummaryMainPage.setContinentOfBladderFrequency(SwingUtils
				.getSelectedButton(bgContinentOfBladderFrequency));
		refMonthlySummaryMainPage.setContinentBladder(SwingUtils
				.getSelectedButton(bgContinentBladder));
		refMonthlySummaryMainPage.setSkinEdema(SwingUtils
				.getSelectedButton(bgSkinEdema));
		refMonthlySummaryMainPage.setBehavior(SwingUtils
				.getSelectedButton(bgBehavior));
		refMonthlySummaryMainPage.setMoods(SwingUtils
				.getSelectedButton(bgMoods));
		refMonthlySummaryMainPage.setPhysicalCuesDecision(SwingUtils
				.getSelectedButton(bgPhysicalCuesDecision));
		refMonthlySummaryMainPage.setRecallLongPast(SwingUtils
				.getSelectedButton(bgRecallLongPast));
		refMonthlySummaryMainPage.setPhysicalCuesSafety(SwingUtils
				.getSelectedButton(bgPhysicalCuesSafety));
		refMonthlySummaryMainPage.setReasonable(SwingUtils
				.getSelectedButton(bgReasonable));
		refMonthlySummaryMainPage.setRecallWords(SwingUtils
				.getSelectedButton(bgRecallWords));
		refMonthlySummaryMainPage.setTubeFeeding(txtTubeFeeding.getText());
		refMonthlySummaryMainPage.setReasonMeal(txtReasonMeal.getText());
		refMonthlySummaryMainPage.setPedsBriefs(cbPedsBriefs.isSelected());
		refMonthlySummaryMainPage.setDepends(cbDepends.isSelected());
		refMonthlySummaryMainPage.setBedsideCommode(cbBedsideCommode
				.isSelected());
		refMonthlySummaryMainPage.setToiletBathroom(cbToiletBathroom
				.isSelected());
		refMonthlySummaryMainPage.setBedPanUrinal(cbBedPanUrinal.isSelected());
		refMonthlySummaryMainPage.setCheckAll(cbCheckAll.isSelected());
		refMonthlySummaryMainPage.setSling(cbSling.isSelected());
		refMonthlySummaryMainPage.setTrapeze(cbTrapeze.isSelected());
		refMonthlySummaryMainPage.setCrutch(cbCrutch.isSelected());
		refMonthlySummaryMainPage.setCane(cbCane.isSelected());
		refMonthlySummaryMainPage.setSlidingBoard(cbSlidingBoard.isSelected());
		refMonthlySummaryMainPage.setWalker(cbWalker.isSelected());
		refMonthlySummaryMainPage.setWheelChair(cbWheelChair.isSelected());
		refMonthlySummaryMainPage.setBraceSplint(cbBraceSplint.isSelected());
		refMonthlySummaryMainPage
				.setDevicesRestraintsReason(txtDevicesRestraintsReason
						.getText());
		refMonthlySummaryMainPage.setSpecifyOthers(txtSpecifyOthers.getText());
		refMonthlySummaryMainPage.setOther(cbOther.isSelected());
		refMonthlySummaryMainPage.setLapBuddy(cbLapBuddy.isSelected());
		refMonthlySummaryMainPage.setWcSeatBelt(cbWcSeatBelt.isSelected());
		refMonthlySummaryMainPage.setGeriChairWithTray(cbGeriChairWithTray
				.isSelected());
		refMonthlySummaryMainPage.setRecliningGeriChair(cbRecliningGeriChair
				.isSelected());
		refMonthlySummaryMainPage.setWcAlarm(cbWcAlarm.isSelected());
		refMonthlySummaryMainPage.setWedgeCushion(cbWedgeCushion.isSelected());
		refMonthlySummaryMainPage.setPostureSupport(cbPostureSupport
				.isSelected());
		refMonthlySummaryMainPage.setMitts(cbMitts.isSelected());
		refMonthlySummaryMainPage.setOneSideRailsUp(cbOneSideRailsUp
				.isSelected());
		refMonthlySummaryMainPage.setBothSideRailsUp(cbBothSideRailsUp
				.isSelected());
		refMonthlySummaryMainPage.setSkinEdemaLocation(txtSkinEdema.getText());
		refMonthlySummaryMainPage
				.setResistiveToMedication(cbResistiveToMedication.isSelected());
		refMonthlySummaryMainPage
				.setSexuallyInappropriateBehave(cbSexuallyInappropriateBehave
						.isSelected());
		refMonthlySummaryMainPage.setCursing(cbCursing.isSelected());
		refMonthlySummaryMainPage.setHitting(cbHitting.isSelected());
		refMonthlySummaryMainPage.setPushing(cbPushing.isSelected());
		refMonthlySummaryMainPage.setScratching(cbScratching.isSelected());
		refMonthlySummaryMainPage.setBiting(cbBiting.isSelected());
		refMonthlySummaryMainPage.setKicking(cbKicking.isSelected());
		refMonthlySummaryMainPage.setScreaming(cbScreaming.isSelected());
		refMonthlySummaryMainPage.setResistiveToEating(cbResistiveToEating
				.isSelected());
		refMonthlySummaryMainPage.setResistiveToCare(cbResistiveToCare
				.isSelected());
		refMonthlySummaryMainPage.setThreatensOthers(cbThreatensOthers
				.isSelected());
		refMonthlySummaryMainPage.setWanders(cbWanders.isSelected());
		refMonthlySummaryMainPage.setRummages(cbRummages.isSelected());
		refMonthlySummaryMainPage.setHoarding(cbHoarding.isSelected());
		refMonthlySummaryMainPage.setSmearsFeces(cbSmearsFeces.isSelected());
		refMonthlySummaryMainPage.setSmearsFood(cbSmearsFood.isSelected());
		refMonthlySummaryMainPage.setDisrobesInPublic(cbDisrobesInPublic
				.isSelected());
		refMonthlySummaryMainPage.setCriesYells(cbCriesYells.isSelected());
		refMonthlySummaryMainPage
				.setWithdrawnFromActivities(cbWithdrawnFromActivities
						.isSelected());
		refMonthlySummaryMainPage.setSadPained(cbSadPained.isSelected());
		refMonthlySummaryMainPage.setUnpleasantMood(cbUnpleasantMood
				.isSelected());
		refMonthlySummaryMainPage
				.setRepeatitiveNonHealthComplaints(cbRepeatitiveNonHealthComplaints
						.isSelected());
		refMonthlySummaryMainPage
				.setRepeatitiveHealthComplaints(cbRepeatitiveHealthComplaints
						.isSelected());
		refMonthlySummaryMainPage
				.setExpressesUnrealisticFears(cbExpressesUnrealisticFears
						.isSelected());
		refMonthlySummaryMainPage.setRecurrentStatements(cbRecurrentStatements
				.isSelected());
		refMonthlySummaryMainPage.setCryingFearfulness(cbCryingFearfulness
				.isSelected());
		refMonthlySummaryMainPage.setSelfDeprecation(cbSelfDeprecation
				.isSelected());
		refMonthlySummaryMainPage.setPersistentAnger(cbPersistentAnger
				.isSelected());
		refMonthlySummaryMainPage
				.setRepetitiveVerbalization(cbRepetitiveVerbalization
						.isSelected());
		refMonthlySummaryMainPage.setRepetitiveQuestions(cbRepetitiveQuestions
				.isSelected());
		refMonthlySummaryMainPage
				.setMakesNegativeStatements(cbMakesNegativeStatements
						.isSelected());
		refMonthlySummaryMainPage.setNoneOfTheAbove(cbNoneOfTheAbove
				.isSelected());
		refMonthlySummaryMainPage.setLittleBodyMovement(cbLittleBodyMovement
				.isSelected());
		refMonthlySummaryMainPage.setStaresIntoSpace(cbStaresIntoSpace
				.isSelected());
		refMonthlySummaryMainPage
				.setRepetitivePhysicalMovements(cbRepetitivePhysicalMovements
						.isSelected());
		refMonthlySummaryMainPage.setPicksAtSkin(cbPicksAtSkin.isSelected());
		refMonthlySummaryMainPage.setLosesTrain(cbLosesTrain.isSelected());
		refMonthlySummaryMainPage.setMovesLips(cbMovesLips.isSelected());
		refMonthlySummaryMainPage
				.setConfusesNight(cbConfusesNight.isSelected());
		refMonthlySummaryMainPage
				.setMentalFunctionVaries(cbMentalFunctionVaries.isSelected());
		refMonthlySummaryMainPage.setDifficultToArouse(cbDifficultToArouse
				.isSelected());
		refMonthlySummaryMainPage.setRepetitiveCalling(cbRepetitiveCalling
				.isSelected());
		refMonthlySummaryMainPage.setChangesPosition(cbChangesPosition
				.isSelected());
		refMonthlySummaryMainPage.setFidgets(cbFidgets.isSelected());
		refMonthlySummaryMainPage.setIncoherentSpeech(cbIncoherentSpeech
				.isSelected());
		refMonthlySummaryMainPage
				.setBelievesSomewhereElse(cbBelievesSomewhereElse.isSelected());
		refMonthlySummaryMainPage.setDifficultyAttention(cbDifficultyAttention
				.isSelected());
		refMonthlySummaryMainPage.setNurse((String) cmbNurse.getSelectedItem());
		refMonthlySummaryMainPage.setMonthYear(dcMonthYear.getDate());
		refMonthlySummaryMainPage.setRoomNo(txtRoomNo.getText());
		refMonthlySummaryMainPage.setResidentName(txtResidentName.getText());

		try {
			Global.currentMonthlySummaryMainPageKey = MedrexClientManager
					.getInstance().insertOrUpdateMonthlySummaryMainPage(
							refMonthlySummaryMainPage);
			return Global.currentMonthlySummaryMainPageKey;
		} catch (Exception e) {
		}
		return 0;
	}
}
