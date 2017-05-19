package medrex.client.main.consultant;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.consultant.ReferralForm;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxPanel;
import com.toedter.calendar.JDateChooser;

public class PanelReferralForm extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5178321057829049295L;
	private JLabel refforpsychassesstreatdoc12282000Label_1;
	private JLabel refforpsychassesstreatdoc12282000Label;
	private JLabel dontThinLabel;
	private JTextField txtReferralAuthorizedBy;
	private JLabel referralAuthorizedByLabel;
	private JLabel dateLabel;
	private JTextArea txtNarrativeComments;
	private JLabel narrativeCommentsLabel;
	private JPanel panel_33;
	private JLabel anAfterLabel;
	private JPanel panel_11;
	private JCheckBox cbSocialUnhappyWithOther;
	private JPanel panel_32;
	private JCheckBox cbSocialConstantly;
	private JCheckBox cbSocialSadness;
	private JPanel panel_31;
	private JCheckBox cbSocialAdjustment;
	private JCheckBox cbSocialConflict;
	private JPanel panel_30;
	private JCheckBox cbSocialLoss;
	private JCheckBox cbSocialUnhappyWithRoommate;
	private JPanel panel_29;
	private JLabel informationFromTheLabel_7;
	private JLabel refferalFormLabel_7;
	private JPanel panel_28;
	private JCheckBox cbInteractiveBlind;
	private JCheckBox cbInteractiveNoSpeech;
	private JPanel panel_27;
	private JLabel informationFromTheLabel_6;
	private JCheckBox cbInteractiverRarelyUnderstands;
	private JCheckBox cbInteractiveDeteriorated;
	private JCheckBox cbInteractiveUnclearSpeech;
	private JPanel panel_26;
	private JCheckBox cbInteractiveRarelyUnderstood;
	private JCheckBox cbInteractiveHighlyImpairedVision;
	private JCheckBox cbInteractiveHighlyImpairedHearing;
	private JPanel panel_25;
	private JLabel informationFromTheLabel_5;
	private JLabel refferalFormLabel_6;
	private JPanel panel_22;
	private JLabel informationFromTheLabel_4;
	private JCheckBox cbBehavioralPhysical;
	private JCheckBox cbBehavioralDisruptive;
	private JCheckBox cbBehavioralResident;
	private JPanel panel_24;
	private JCheckBox cbBehavioralVerbal;
	private JCheckBox cbBehavioralInappropriate;
	private JCheckBox cbBehavioralWandering;
	private JPanel panel_23;
	private JLabel informationFromTheLabel_3;
	private JLabel refferalFormLabel_5;
	private JPanel panel_21;
	private JCheckBox cbEmotionalFear;
	private JCheckBox cbEmotionalSuicideThreats;
	private JPanel panel_20;
	private JCheckBox cbEmotionalMoodSwings;
	private JCheckBox cbEmotionalWithdrawal;
	private JCheckBox cbEmotionalSuicideAttempts;
	private JPanel panel_19;
	private JCheckBox cbEmotionalSleepPattern;
	private JCheckBox cbEmotionalRepetitiveQuestions;
	private JCheckBox cbEmotionalWorried;
	private JPanel panel_18;
	private JCheckBox cbEmotionalInsomnia;
	private JCheckBox cbEmotionalExcessive;
	private JCheckBox cbEmotionalUnrealistic;
	private JPanel panel_17;
	private JCheckBox cbEmotionalCrying;
	private JCheckBox cbEmotionalSeeksConatantReassurances;
	private JCheckBox cbEmotionalHand;
	private JPanel panel_16;
	private JCheckBox cbEmotionalHealth;
	private JCheckBox cbEmotionalSeeksConstantAttentions;
	private JCheckBox cbEmotionalPacing;
	private JPanel panel_15;
	private JCheckBox cbEmotionalSelfDeprecation;
	private JCheckBox cbEmotionalRepetitiveVerbalizations;
	private JCheckBox cbEmotionalAnger;
	private JPanel panel_14;
	private JCheckBox cbEmotionalThreats;
	private JCheckBox cbEmotionalReducedSocial;
	private JCheckBox cbEmotionalNegativeStatements;
	private JPanel panel_13;
	private JCheckBox cbEmotionalPlanSuicide;
	private JCheckBox cbEmotionalInBedcloths;
	private JCheckBox cbEmotionalSadness;
	private JPanel panel_12;
	private JLabel informationFromTheLabel_2;
	private JLabel refferalFormLabel_4;
	private JPanel panel_5;
	private JCheckBox cbCognitiveShort;
	private JCheckBox cbCognitiveDisorganized;
	private JPanel panel_9;
	private JCheckBox cbCognitiveLethargy_1;
	private JCheckBox cbCognitiveRestlessness_1;
	private JPanel panel_8;
	private JCheckBox cbCognitiveLethargy;
	private JCheckBox cbCognitiveRestlessness;
	private JPanel panel_7;
	private JCheckBox cbCognitiveDelusions;
	private JCheckBox cbCognitiveOrganiseCondition;
	private JPanel panel_6;
	private JCheckBox cbCognitiveConfusion;
	private JCheckBox cbCognitiveMrDevelopmental;
	private JPanel panel_4;
	private JPanel panel_3;
	private JLabel informationFromTheLabel_1;
	private JPanel panel_2;
	private JLabel refferalFormLabel_3;
	private JLabel informationFromTheLabel;
	private JLabel refferalFormLabel_2;
	private JTextField txtRequestedBy;
	private JLabel patientsNameLabel_2;
	private JTextField txtRoom;
	private JLabel patientsNameLabel_1;
	private JTextField txtPatientsName;
	private JLabel patientsNameLabel;
	private JPanel panel_1;
	private JLabel refferalFormLabel_1;
	private JLabel refferalFormLabel;
	private JPanel panel;
	final JDateChooser dcDate;

	/**
	 * Create the panel
	 */
	public PanelReferralForm() {
		super();
		setCurvedView(false);

		Global.panelReferralForm = this;
		setSize(new Dimension(726, 1012));
		setPreferredSize(new Dimension(726, 1012));
		setBackground(Color.WHITE);
		setLayout(null);
		// setLinearGradient(Color.BLUE, Color.BLACK, Direction.LEFT_TO_RIGHT);
		// doZoomIn();
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 10, 720, 1012);
		panel.setOpaque(false);
		add(panel);

		refferalFormLabel = new JLabel();
		refferalFormLabel.setFont(new Font("", Font.BOLD, 14));
		refferalFormLabel.setText("REFERRAL FORM");
		refferalFormLabel.setBounds(271, 26, 136, 14);
		panel.add(refferalFormLabel);

		refferalFormLabel_1 = new JLabel();
		refferalFormLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		refferalFormLabel_1
				.setText("(FOR PSYCHOLOGICAL ASSESSMENT & TREATMENT)");
		refferalFormLabel_1.setBounds(194, 61, 364, 14);
		panel.add(refferalFormLabel_1);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(14, 95, 725, 24);
		panel.add(panel_1);

		patientsNameLabel = new JLabel();
		patientsNameLabel.setText("PATIENT'S NAME");
		patientsNameLabel.setBounds(10, 5, 86, 14);
		panel_1.add(patientsNameLabel);

		txtPatientsName = new JTextField();
		txtPatientsName.setBackground(Color.WHITE);
		txtPatientsName.setEditable(false);
		txtPatientsName.setBounds(102, 2, 201, 20);
		panel_1.add(txtPatientsName);

		patientsNameLabel_1 = new JLabel();
		patientsNameLabel_1.setText("ROOM#");
		patientsNameLabel_1.setBounds(309, 5, 40, 14);
		panel_1.add(patientsNameLabel_1);

		txtRoom = new JTextField();
		txtRoom.setBackground(Color.WHITE);
		txtRoom.setEditable(false);
		txtRoom.setBounds(355, 2, 86, 20);
		panel_1.add(txtRoom);

		patientsNameLabel_2 = new JLabel();
		patientsNameLabel_2.setText("Requested By");
		patientsNameLabel_2.setBounds(447, 5, 67, 14);
		panel_1.add(patientsNameLabel_2);

		txtRequestedBy = new JTextField();
		txtRequestedBy.setBackground(Color.WHITE);
		txtRequestedBy.setEditable(false);
		txtRequestedBy.setBounds(520, 3, 181, 20);
		panel_1.add(txtRequestedBy);

		refferalFormLabel_2 = new JLabel();
		refferalFormLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		refferalFormLabel_2.setText("TARGET SIGNS & SYMPTOMS");
		refferalFormLabel_2.setBounds(271, 142, 202, 14);
		panel.add(refferalFormLabel_2);

		informationFromTheLabel = new JLabel();
		informationFromTheLabel
				.setText("Information from the minimum data Set (MDS)may be used for referral.");
		informationFromTheLabel.setBounds(14, 162, 437, 14);
		panel.add(informationFromTheLabel);

		refferalFormLabel_3 = new JLabel();
		refferalFormLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		refferalFormLabel_3.setText("COGNITIVE SIGNS & SYMPTOMS");
		refferalFormLabel_3.setBounds(257, 182, 237, 14);
		panel.add(refferalFormLabel_3);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(20, 215, 690, 77);
		panel.add(panel_2);

		informationFromTheLabel_1 = new JLabel();
		informationFromTheLabel_1
				.setText("Many factors contribute to changes or decline.If addressed,these symptoms may be minimized to improve quality of life ");
		informationFromTheLabel_1.setBounds(0, 0, 575, 14);
		panel_2.add(informationFromTheLabel_1);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 17, 690, 59);
		panel_2.add(panel_3);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(49, 0, 642, 15);
		panel_3.add(panel_4);

		cbCognitiveMrDevelopmental = new JCheckBox();
		cbCognitiveMrDevelopmental.setBackground(Color.WHITE);
		cbCognitiveMrDevelopmental
				.setText("MR Developmental Disorder with organize condition");
		cbCognitiveMrDevelopmental.setBounds(0, 0, 372, 15);
		panel_4.add(cbCognitiveMrDevelopmental);

		cbCognitiveConfusion = new JCheckBox();
		cbCognitiveConfusion.setBackground(Color.WHITE);
		cbCognitiveConfusion.setText("Confusion");
		cbCognitiveConfusion.setBounds(443, 0, 190, 15);
		panel_4.add(cbCognitiveConfusion);

		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(49, 15, 642, 15);
		panel_3.add(panel_6);

		cbCognitiveOrganiseCondition = new JCheckBox();
		cbCognitiveOrganiseCondition.setBackground(Color.WHITE);
		cbCognitiveOrganiseCondition
				.setText("Organic condition related to Development Disorder");
		cbCognitiveOrganiseCondition.setBounds(0, 0, 372, 15);
		panel_6.add(cbCognitiveOrganiseCondition);

		cbCognitiveDelusions = new JCheckBox();
		cbCognitiveDelusions.setBackground(Color.WHITE);
		cbCognitiveDelusions.setText("Delusions");
		cbCognitiveDelusions.setBounds(443, 0, 190, 15);
		panel_6.add(cbCognitiveDelusions);

		panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(49, 30, 642, 15);
		panel_3.add(panel_7);

		cbCognitiveRestlessness = new JCheckBox();
		cbCognitiveRestlessness.setBackground(Color.WHITE);
		cbCognitiveRestlessness.setText("Restlessness");
		cbCognitiveRestlessness.setBounds(0, 0, 372, 15);
		panel_7.add(cbCognitiveRestlessness);

		cbCognitiveLethargy = new JCheckBox();
		cbCognitiveLethargy.setBackground(Color.WHITE);
		cbCognitiveLethargy.setText("Lethargy");
		cbCognitiveLethargy.setBounds(443, 0, 190, 15);
		panel_7.add(cbCognitiveLethargy);

		panel_8 = new JPanel();
		panel_8.setBounds(0, 20, 706, 15);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);

		cbCognitiveRestlessness_1 = new JCheckBox();
		cbCognitiveRestlessness_1.setBackground(Color.WHITE);
		cbCognitiveRestlessness_1.setText("Restlessness");
		cbCognitiveRestlessness_1.setBounds(0, 0, 372, 15);
		panel_8.add(cbCognitiveRestlessness_1);

		cbCognitiveLethargy_1 = new JCheckBox();
		cbCognitiveLethargy_1.setBackground(Color.WHITE);
		cbCognitiveLethargy_1.setText("Lethargy");
		cbCognitiveLethargy_1.setBounds(443, 0, 263, 15);
		panel_8.add(cbCognitiveLethargy_1);

		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(49, 45, 642, 15);
		panel_3.add(panel_9);

		cbCognitiveDisorganized = new JCheckBox();
		cbCognitiveDisorganized.setBackground(Color.WHITE);
		cbCognitiveDisorganized.setText("Disorganized Speech");
		cbCognitiveDisorganized.setBounds(0, 0, 372, 15);
		panel_9.add(cbCognitiveDisorganized);

		cbCognitiveShort = new JCheckBox();
		cbCognitiveShort.setBackground(Color.WHITE);
		cbCognitiveShort.setText("Short/Long term memory problems");
		cbCognitiveShort.setBounds(443, 0, 190, 15);
		panel_9.add(cbCognitiveShort);

		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(20, 308, 690, 166);
		panel.add(panel_5);

		refferalFormLabel_4 = new JLabel();
		refferalFormLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
		refferalFormLabel_4.setText("EMOTIONAL SIGNS & SYMPTOMS");
		refferalFormLabel_4.setBounds(230, 0, 237, 14);
		panel_5.add(refferalFormLabel_4);

		informationFromTheLabel_2 = new JLabel();
		informationFromTheLabel_2
				.setText("A resident's emotional status interferes or enhances his/her ability to adjust to the institutional environment or to achieve self-actualization.");
		informationFromTheLabel_2.setBounds(0, 15, 676, 14);
		panel_5.add(informationFromTheLabel_2);

		panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(50, 35, 640, 15);
		panel_5.add(panel_12);

		cbEmotionalSadness = new JCheckBox();
		cbEmotionalSadness.setBackground(Color.WHITE);
		cbEmotionalSadness.setText("sadness");
		cbEmotionalSadness.setBounds(0, 0, 166, 15);
		panel_12.add(cbEmotionalSadness);

		cbEmotionalInBedcloths = new JCheckBox();
		cbEmotionalInBedcloths.setBackground(Color.WHITE);
		cbEmotionalInBedcloths.setText("In bedclothes much of day");
		cbEmotionalInBedcloths.setBounds(428, 0, 210, 15);
		panel_12.add(cbEmotionalInBedcloths);

		cbEmotionalPlanSuicide = new JCheckBox();
		cbEmotionalPlanSuicide.setBackground(Color.WHITE);
		cbEmotionalPlanSuicide.setText("plans for suicide*");
		cbEmotionalPlanSuicide.setBounds(191, 0, 166, 15);
		panel_12.add(cbEmotionalPlanSuicide);

		panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(50, 48, 640, 15);
		panel_5.add(panel_13);

		cbEmotionalNegativeStatements = new JCheckBox();
		cbEmotionalNegativeStatements.setBackground(Color.WHITE);
		cbEmotionalNegativeStatements.setText("negative statements");
		cbEmotionalNegativeStatements.setBounds(0, 0, 166, 15);
		panel_13.add(cbEmotionalNegativeStatements);

		cbEmotionalReducedSocial = new JCheckBox();
		cbEmotionalReducedSocial.setBackground(Color.WHITE);
		cbEmotionalReducedSocial.setText("reduced social interaction");
		cbEmotionalReducedSocial.setBounds(428, 0, 210, 15);
		panel_13.add(cbEmotionalReducedSocial);

		cbEmotionalThreats = new JCheckBox();
		cbEmotionalThreats.setBackground(Color.WHITE);
		cbEmotionalThreats.setText("threats of self-harm*");
		cbEmotionalThreats.setBounds(191, 0, 166, 15);
		panel_13.add(cbEmotionalThreats);

		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(50, 63, 640, 15);
		panel_5.add(panel_14);

		cbEmotionalAnger = new JCheckBox();
		cbEmotionalAnger.setBackground(Color.WHITE);
		cbEmotionalAnger.setText("anger*");
		cbEmotionalAnger.setBounds(0, 0, 166, 15);
		panel_14.add(cbEmotionalAnger);

		cbEmotionalRepetitiveVerbalizations = new JCheckBox();
		cbEmotionalRepetitiveVerbalizations.setBackground(Color.WHITE);
		cbEmotionalRepetitiveVerbalizations
				.setText("repetitive verbalizations");
		cbEmotionalRepetitiveVerbalizations.setBounds(428, 0, 210, 15);
		panel_14.add(cbEmotionalRepetitiveVerbalizations);

		cbEmotionalSelfDeprecation = new JCheckBox();
		cbEmotionalSelfDeprecation.setBackground(Color.WHITE);
		cbEmotionalSelfDeprecation.setText("self-deprecation");
		cbEmotionalSelfDeprecation.setBounds(191, 0, 166, 15);
		panel_14.add(cbEmotionalSelfDeprecation);

		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(50, 78, 640, 15);
		panel_5.add(panel_15);

		cbEmotionalPacing = new JCheckBox();
		cbEmotionalPacing.setBackground(Color.WHITE);
		cbEmotionalPacing.setText("pacing");
		cbEmotionalPacing.setBounds(0, 0, 166, 15);
		panel_15.add(cbEmotionalPacing);

		cbEmotionalSeeksConstantAttentions = new JCheckBox();
		cbEmotionalSeeksConstantAttentions.setBackground(Color.WHITE);
		cbEmotionalSeeksConstantAttentions.setText("seeks constant attention");
		cbEmotionalSeeksConstantAttentions.setBounds(428, 0, 213, 15);
		panel_15.add(cbEmotionalSeeksConstantAttentions);

		cbEmotionalHealth = new JCheckBox();
		cbEmotionalHealth.setBackground(Color.WHITE);
		cbEmotionalHealth.setText("health complaints ");
		cbEmotionalHealth.setBounds(191, 0, 166, 15);
		panel_15.add(cbEmotionalHealth);

		panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(50, 92, 640, 15);
		panel_5.add(panel_16);

		cbEmotionalHand = new JCheckBox();
		cbEmotionalHand.setBackground(Color.WHITE);
		cbEmotionalHand.setText("hand wringing ");
		cbEmotionalHand.setBounds(0, 0, 166, 15);
		panel_16.add(cbEmotionalHand);

		cbEmotionalSeeksConatantReassurances = new JCheckBox();
		cbEmotionalSeeksConatantReassurances.setBackground(Color.WHITE);
		cbEmotionalSeeksConatantReassurances
				.setText("seeks constant reassurances");
		cbEmotionalSeeksConatantReassurances.setBounds(428, 0, 214, 15);
		panel_16.add(cbEmotionalSeeksConatantReassurances);

		cbEmotionalCrying = new JCheckBox();
		cbEmotionalCrying.setBackground(Color.WHITE);
		cbEmotionalCrying.setText("crying and tearfulness");
		cbEmotionalCrying.setBounds(191, 0, 166, 15);
		panel_16.add(cbEmotionalCrying);

		panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(50, 106, 640, 15);
		panel_5.add(panel_17);

		cbEmotionalUnrealistic = new JCheckBox();
		cbEmotionalUnrealistic.setBackground(Color.WHITE);
		cbEmotionalUnrealistic.setText("unrealistic fears");
		cbEmotionalUnrealistic.setBounds(0, 0, 166, 15);
		panel_17.add(cbEmotionalUnrealistic);

		cbEmotionalExcessive = new JCheckBox();
		cbEmotionalExcessive.setBackground(Color.WHITE);
		cbEmotionalExcessive.setText("excessive television");
		cbEmotionalExcessive.setBounds(428, 0, 210, 15);
		panel_17.add(cbEmotionalExcessive);

		cbEmotionalInsomnia = new JCheckBox();
		cbEmotionalInsomnia.setBackground(Color.WHITE);
		cbEmotionalInsomnia.setText("insomnia");
		cbEmotionalInsomnia.setBounds(191, 0, 166, 15);
		panel_17.add(cbEmotionalInsomnia);

		panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(50, 120, 640, 15);
		panel_5.add(panel_18);

		cbEmotionalWorried = new JCheckBox();
		cbEmotionalWorried.setBackground(Color.WHITE);
		cbEmotionalWorried.setText("worried");
		cbEmotionalWorried.setBounds(0, 0, 166, 15);
		panel_18.add(cbEmotionalWorried);

		cbEmotionalRepetitiveQuestions = new JCheckBox();
		cbEmotionalRepetitiveQuestions.setBackground(Color.WHITE);
		cbEmotionalRepetitiveQuestions.setText("repetitive questions");
		cbEmotionalRepetitiveQuestions.setBounds(428, 0, 211, 15);
		panel_18.add(cbEmotionalRepetitiveQuestions);

		cbEmotionalSleepPattern = new JCheckBox();
		cbEmotionalSleepPattern.setBackground(Color.WHITE);
		cbEmotionalSleepPattern.setText("sleep pattern change");
		cbEmotionalSleepPattern.setBounds(191, 0, 166, 15);
		panel_18.add(cbEmotionalSleepPattern);

		panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(50, 135, 640, 15);
		panel_5.add(panel_19);

		cbEmotionalSuicideAttempts = new JCheckBox();
		cbEmotionalSuicideAttempts.setBackground(Color.WHITE);
		cbEmotionalSuicideAttempts.setText("suicide attempts*");
		cbEmotionalSuicideAttempts.setBounds(0, 0, 166, 15);
		panel_19.add(cbEmotionalSuicideAttempts);

		cbEmotionalWithdrawal = new JCheckBox();
		cbEmotionalWithdrawal.setBackground(Color.WHITE);
		cbEmotionalWithdrawal.setText("withdrawal from normal activities");
		cbEmotionalWithdrawal.setBounds(428, 0, 212, 15);
		panel_19.add(cbEmotionalWithdrawal);

		cbEmotionalMoodSwings = new JCheckBox();
		cbEmotionalMoodSwings.setBackground(Color.WHITE);
		cbEmotionalMoodSwings.setText("mood swings");
		cbEmotionalMoodSwings.setBounds(191, 0, 166, 15);
		panel_19.add(cbEmotionalMoodSwings);

		panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(50, 150, 640, 15);
		panel_5.add(panel_20);

		cbEmotionalSuicideThreats = new JCheckBox();
		cbEmotionalSuicideThreats.setBackground(Color.WHITE);
		cbEmotionalSuicideThreats.setText("suicide threats*");
		cbEmotionalSuicideThreats.setBounds(0, 0, 166, 15);
		panel_20.add(cbEmotionalSuicideThreats);

		cbEmotionalFear = new JCheckBox();
		cbEmotionalFear.setBackground(Color.WHITE);
		cbEmotionalFear.setText("fear of impending danger");
		cbEmotionalFear.setBounds(191, 0, 166, 15);
		panel_20.add(cbEmotionalFear);

		panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(20, 475, 690, 77);
		panel.add(panel_21);

		refferalFormLabel_5 = new JLabel();
		refferalFormLabel_5.setFont(new Font("Dialog", Font.BOLD, 14));
		refferalFormLabel_5.setText("BIHAVIORAL SIGNS & SYMPTOMS");
		refferalFormLabel_5.setBounds(231, 0, 237, 14);
		panel_21.add(refferalFormLabel_5);

		informationFromTheLabel_3 = new JLabel();
		informationFromTheLabel_3
				.setText("Behavioral associated with cognitive, emotional or diagnostic symptomology may interface with the efficient and safe ");
		informationFromTheLabel_3.setBounds(0, 15, 676, 14);
		panel_21.add(informationFromTheLabel_3);

		panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(50, 48, 640, 15);
		panel_21.add(panel_23);

		cbBehavioralWandering = new JCheckBox();
		cbBehavioralWandering.setBackground(Color.WHITE);
		cbBehavioralWandering.setText("wandering");
		cbBehavioralWandering.setBounds(0, 0, 166, 15);
		panel_23.add(cbBehavioralWandering);

		cbBehavioralInappropriate = new JCheckBox();
		cbBehavioralInappropriate.setBackground(Color.WHITE);
		cbBehavioralInappropriate.setText("inappropriate behaviors");
		cbBehavioralInappropriate.setBounds(428, 0, 212, 15);
		panel_23.add(cbBehavioralInappropriate);

		cbBehavioralVerbal = new JCheckBox();
		cbBehavioralVerbal.setBackground(Color.WHITE);
		cbBehavioralVerbal.setText("verbal aggression*");
		cbBehavioralVerbal.setBounds(191, 0, 166, 15);
		panel_23.add(cbBehavioralVerbal);

		panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(50, 63, 640, 15);
		panel_21.add(panel_24);

		cbBehavioralResident = new JCheckBox();
		cbBehavioralResident.setBackground(Color.WHITE);
		cbBehavioralResident.setText("resistance to care ");
		cbBehavioralResident.setBounds(0, 0, 166, 15);
		panel_24.add(cbBehavioralResident);

		cbBehavioralDisruptive = new JCheckBox();
		cbBehavioralDisruptive.setBackground(Color.WHITE);
		cbBehavioralDisruptive.setText("disruptive behaviors");
		cbBehavioralDisruptive.setBounds(428, 0, 212, 15);
		panel_24.add(cbBehavioralDisruptive);

		cbBehavioralPhysical = new JCheckBox();
		cbBehavioralPhysical.setBackground(Color.WHITE);
		cbBehavioralPhysical.setText("physical aggression*");
		cbBehavioralPhysical.setBounds(191, 0, 166, 15);
		panel_24.add(cbBehavioralPhysical);

		informationFromTheLabel_4 = new JLabel();
		informationFromTheLabel_4
				.setText("operation of a facility.Such behaviors include:");
		informationFromTheLabel_4.setBounds(0, 28, 676, 14);
		panel_21.add(informationFromTheLabel_4);

		panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(20, 558, 690, 92);
		panel.add(panel_22);

		refferalFormLabel_6 = new JLabel();
		refferalFormLabel_6.setFont(new Font("Dialog", Font.BOLD, 14));
		refferalFormLabel_6.setText("INTERACTIVE SIGNS & SYMPTOMS");
		refferalFormLabel_6.setBounds(232, 0, 237, 14);
		panel_22.add(refferalFormLabel_6);

		informationFromTheLabel_5 = new JLabel();
		informationFromTheLabel_5
				.setText("Speech, hearing and communication problems may interface with an individual's ability to interact in positive ways,");
		informationFromTheLabel_5.setBounds(0, 15, 676, 14);
		panel_22.add(informationFromTheLabel_5);

		panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(50, 48, 640, 15);
		panel_22.add(panel_25);

		cbInteractiveHighlyImpairedHearing = new JCheckBox();
		cbInteractiveHighlyImpairedHearing.setBackground(Color.WHITE);
		cbInteractiveHighlyImpairedHearing.setText("highly impaired hearing ");
		cbInteractiveHighlyImpairedHearing.setBounds(0, 0, 166, 15);
		panel_25.add(cbInteractiveHighlyImpairedHearing);

		cbInteractiveHighlyImpairedVision = new JCheckBox();
		cbInteractiveHighlyImpairedVision.setBackground(Color.WHITE);
		cbInteractiveHighlyImpairedVision.setText("highly impaired vision");
		cbInteractiveHighlyImpairedVision.setBounds(428, 0, 278, 15);
		panel_25.add(cbInteractiveHighlyImpairedVision);

		cbInteractiveRarelyUnderstood = new JCheckBox();
		cbInteractiveRarelyUnderstood.setBackground(Color.WHITE);
		cbInteractiveRarelyUnderstood.setText("rarely understood");
		cbInteractiveRarelyUnderstood.setBounds(191, 0, 166, 15);
		panel_25.add(cbInteractiveRarelyUnderstood);

		panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(50, 63, 640, 15);
		panel_22.add(panel_26);

		cbInteractiveUnclearSpeech = new JCheckBox();
		cbInteractiveUnclearSpeech.setBackground(Color.WHITE);
		cbInteractiveUnclearSpeech.setText("unclear speech");
		cbInteractiveUnclearSpeech.setBounds(0, 0, 166, 15);
		panel_26.add(cbInteractiveUnclearSpeech);

		cbInteractiveDeteriorated = new JCheckBox();
		cbInteractiveDeteriorated.setBackground(Color.WHITE);
		cbInteractiveDeteriorated.setText("deteriorated hearing/communication");
		cbInteractiveDeteriorated.setBounds(428, 0, 278, 15);
		panel_26.add(cbInteractiveDeteriorated);

		cbInteractiverRarelyUnderstands = new JCheckBox();
		cbInteractiverRarelyUnderstands.setBackground(Color.WHITE);
		cbInteractiverRarelyUnderstands.setText("rarely understands");
		cbInteractiverRarelyUnderstands.setBounds(191, 0, 166, 15);
		panel_26.add(cbInteractiverRarelyUnderstands);

		informationFromTheLabel_6 = new JLabel();
		informationFromTheLabel_6
				.setText("putting them at risk for isolation and sensory deprivation. The following are indicators.");
		informationFromTheLabel_6.setBounds(0, 28, 676, 14);
		panel_22.add(informationFromTheLabel_6);

		panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBounds(50, 78, 640, 15);
		panel_22.add(panel_27);

		cbInteractiveNoSpeech = new JCheckBox();
		cbInteractiveNoSpeech.setBackground(Color.WHITE);
		cbInteractiveNoSpeech.setText("no speech");
		cbInteractiveNoSpeech.setBounds(0, 0, 166, 15);
		panel_27.add(cbInteractiveNoSpeech);

		cbInteractiveBlind = new JCheckBox();
		cbInteractiveBlind.setBackground(Color.WHITE);
		cbInteractiveBlind.setText("blind");
		cbInteractiveBlind.setBounds(191, 0, 166, 15);
		panel_27.add(cbInteractiveBlind);

		panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(20, 655, 690, 108);
		panel.add(panel_28);

		refferalFormLabel_7 = new JLabel();
		refferalFormLabel_7.setFont(new Font("Dialog", Font.BOLD, 14));
		refferalFormLabel_7.setText("SOCIAL SIGNS & SYMPTOMS");
		refferalFormLabel_7.setBounds(246, 0, 237, 14);
		panel_28.add(refferalFormLabel_7);

		informationFromTheLabel_7 = new JLabel();
		informationFromTheLabel_7
				.setText("Difficulties in social relationships may lead to emotional and/or behavioral problems.");
		informationFromTheLabel_7.setBounds(0, 15, 676, 14);
		panel_28.add(informationFromTheLabel_7);

		panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(50, 48, 640, 15);
		panel_28.add(panel_29);

		cbSocialUnhappyWithRoommate = new JCheckBox();
		cbSocialUnhappyWithRoommate.setBackground(Color.WHITE);
		cbSocialUnhappyWithRoommate.setText("unhappy with roommate");
		cbSocialUnhappyWithRoommate.setBounds(0, 0, 166, 15);
		panel_29.add(cbSocialUnhappyWithRoommate);

		cbSocialLoss = new JCheckBox();
		cbSocialLoss.setBackground(Color.WHITE);
		cbSocialLoss.setText("loss off close family/friend");
		cbSocialLoss.setBounds(428, 0, 210, 15);
		panel_29.add(cbSocialLoss);

		panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBackground(Color.WHITE);
		panel_30.setBounds(50, 63, 640, 15);
		panel_28.add(panel_30);

		cbSocialConflict = new JCheckBox();
		cbSocialConflict.setBackground(Color.WHITE);
		cbSocialConflict.setText("conflict/anger with family/friend");
		cbSocialConflict.setBounds(0, 0, 182, 15);
		panel_30.add(cbSocialConflict);

		cbSocialAdjustment = new JCheckBox();
		cbSocialAdjustment.setBackground(Color.WHITE);
		cbSocialAdjustment.setText("adjustment difficulty");
		cbSocialAdjustment.setBounds(428, 0, 208, 15);
		panel_30.add(cbSocialAdjustment);

		panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(50, 78, 640, 15);
		panel_28.add(panel_31);

		cbSocialSadness = new JCheckBox();
		cbSocialSadness.setBackground(Color.WHITE);
		cbSocialSadness
				.setText("sadness/anger/emptiness over lost role or status");
		cbSocialSadness.setBounds(0, 0, 253, 15);
		panel_31.add(cbSocialSadness);

		cbSocialConstantly = new JCheckBox();
		cbSocialConstantly.setBackground(Color.WHITE);
		cbSocialConstantly.setText("constantly critical");
		cbSocialConstantly.setBounds(428, 0, 208, 15);
		panel_31.add(cbSocialConstantly);

		panel_32 = new JPanel();
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(50, 93, 640, 15);
		panel_28.add(panel_32);

		cbSocialUnhappyWithOther = new JCheckBox();
		cbSocialUnhappyWithOther.setBackground(Color.WHITE);
		cbSocialUnhappyWithOther.setText("unhappy with other residents");
		cbSocialUnhappyWithOther.setBounds(0, 0, 253, 15);
		panel_32.add(cbSocialUnhappyWithOther);

		panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(21, 777, 690, 14);
		panel.add(panel_11);

		anAfterLabel = new JLabel();
		anAfterLabel.setFont(new Font("", Font.BOLD, 12));
		anAfterLabel
				.setText("An * after a sign or symptom indicates a need for immediate referral.");
		anAfterLabel.setBounds(0, 0, 408, 14);
		panel_11.add(anAfterLabel);

		panel_33 = new JPanel();
		panel_33.setBackground(Color.WHITE);
		panel_33.setLayout(null);
		panel_33.setBounds(20, 813, 690, 101);
		panel.add(panel_33);

		narrativeCommentsLabel = new JLabel();
		narrativeCommentsLabel.setText("Narrative Comments:");
		narrativeCommentsLabel.setBounds(0, 0, 102, 14);
		panel_33.add(narrativeCommentsLabel);

		txtNarrativeComments = new JTextArea();
		txtNarrativeComments.setBorder(new LineBorder(Color.black, 1, false));
		txtNarrativeComments.setBounds(10, 15, 680, 52);
		panel_33.add(txtNarrativeComments);

		dateLabel = new JLabel();
		dateLabel.setText("Date:");
		dateLabel.setBounds(48, 73, 54, 14);
		panel_33.add(dateLabel);

		referralAuthorizedByLabel = new JLabel();
		referralAuthorizedByLabel.setText("Referral authorized by:");
		referralAuthorizedByLabel.setBounds(400, 73, 112, 14);
		panel_33.add(referralAuthorizedByLabel);

		txtReferralAuthorizedBy = new JTextField();
		txtReferralAuthorizedBy.setBounds(518, 73, 172, 20);
		panel_33.add(txtReferralAuthorizedBy);

		dcDate = new JDateChooser();
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(86, 73, 119, 20);
		panel_33.add(dcDate);

		dontThinLabel = new JLabel();
		dontThinLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		dontThinLabel.setText("DON'T THIN");
		dontThinLabel.setBounds(586, 934, 136, 38);
		panel.add(dontThinLabel);

		refforpsychassesstreatdoc12282000Label = new JLabel();
		refforpsychassesstreatdoc12282000Label
				.setText("RefForPsychAssessTreat.doc 12/28/2000");
		refforpsychassesstreatdoc12282000Label.setBounds(32, 934, 237, 14);
		panel.add(refforpsychassesstreatdoc12282000Label);

		refforpsychassesstreatdoc12282000Label_1 = new JLabel();
		refforpsychassesstreatdoc12282000Label_1
				.setText("The Human Element, 1998-2000");
		refforpsychassesstreatdoc12282000Label_1.setBounds(33, 951, 237, 14);
		panel.add(refforpsychassesstreatdoc12282000Label_1);
		fillCombos();
		updateData();

	}

	public void fillCombos() {

	}

	public void updateData() {
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txtPatientsName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txtRoom.setText(rm.getRoom());
		} catch (Exception e) {

		}

		if (Global.currentReferralFormKey == 0) {

			cbCognitiveMrDevelopmental.setSelected(false);
			cbCognitiveOrganiseCondition.setSelected(false);
			cbCognitiveRestlessness.setSelected(false);
			cbCognitiveDisorganized.setSelected(false);
			cbCognitiveConfusion.setSelected(false);
			cbCognitiveDelusions.setSelected(false);
			cbCognitiveLethargy.setSelected(false);
			cbCognitiveShort.setSelected(false);

			cbEmotionalSadness.setSelected(false);
			cbEmotionalNegativeStatements.setSelected(false);
			cbEmotionalAnger.setSelected(false);
			cbEmotionalPacing.setSelected(false);
			cbEmotionalHand.setSelected(false);
			cbEmotionalUnrealistic.setSelected(false);
			cbEmotionalWorried.setSelected(false);
			cbEmotionalSuicideAttempts.setSelected(false);
			cbEmotionalSuicideThreats.setSelected(false);
			cbEmotionalPlanSuicide.setSelected(false);
			cbEmotionalThreats.setSelected(false);
			cbEmotionalSelfDeprecation.setSelected(false);
			cbEmotionalHealth.setSelected(false);
			cbEmotionalCrying.setSelected(false);
			cbEmotionalInsomnia.setSelected(false);
			cbEmotionalSleepPattern.setSelected(false);
			cbEmotionalMoodSwings.setSelected(false);
			cbEmotionalFear.setSelected(false);
			cbEmotionalInBedcloths.setSelected(false);
			cbEmotionalReducedSocial.setSelected(false);
			cbEmotionalRepetitiveVerbalizations.setSelected(false);
			cbEmotionalSeeksConstantAttentions.setSelected(false);
			cbEmotionalSeeksConatantReassurances.setSelected(false);
			cbEmotionalExcessive.setSelected(false);
			cbEmotionalRepetitiveQuestions.setSelected(false);
			cbEmotionalWithdrawal.setSelected(false);

			cbBehavioralWandering.setSelected(false);
			cbBehavioralVerbal.setSelected(false);
			cbBehavioralInappropriate.setSelected(false);
			cbBehavioralResident.setSelected(false);
			cbBehavioralPhysical.setSelected(false);
			cbBehavioralDisruptive.setSelected(false);

			cbInteractiveHighlyImpairedHearing.setSelected(false);
			cbInteractiveRarelyUnderstood.setSelected(false);
			cbInteractiveHighlyImpairedVision.setSelected(false);
			cbInteractiveUnclearSpeech.setSelected(false);
			cbInteractiverRarelyUnderstands.setSelected(false);
			cbInteractiveDeteriorated.setSelected(false);
			cbInteractiveNoSpeech.setSelected(false);
			cbInteractiveBlind.setSelected(false);

			cbSocialUnhappyWithRoommate.setSelected(false);
			cbSocialConflict.setSelected(false);
			cbSocialSadness.setSelected(false);
			cbSocialUnhappyWithOther.setSelected(false);
			cbSocialLoss.setSelected(false);
			cbSocialAdjustment.setSelected(false);
			cbSocialConstantly.setSelected(false);

			txtNarrativeComments.setText("");
			txtReferralAuthorizedBy.setText("");

		} else {
			ReferralForm rf = null;
			try {
				rf = MedrexClientManager.getInstance().getReferralForm(
						((Global.currentReferralFormKey)));
			} catch (Exception e) {

			}

			cbCognitiveMrDevelopmental.setSelected(rf
					.isCognitiveMrDevelopment());
			cbCognitiveOrganiseCondition.setSelected(rf
					.isCognitiveOrganicCondition());
			cbCognitiveRestlessness.setSelected(rf.isCognitiveRestlessness());
			cbCognitiveDisorganized.setSelected(rf
					.isCognitiveDisorganizedSpeech());
			cbCognitiveConfusion.setSelected(rf.isCognitiveConfusion());
			cbCognitiveDelusions.setSelected(rf.isCognitiveDelusions());
			cbCognitiveLethargy.setSelected(rf.isCognitiveLethargy());
			cbCognitiveShort.setSelected(rf.isCognitiveShortLongTerm());

			cbEmotionalSadness.setSelected(rf.isEmotionalSadness());
			cbEmotionalNegativeStatements.setSelected(rf.isEmotionalNegative());
			cbEmotionalAnger.setSelected(rf.isEmotionalAnger());
			cbEmotionalPacing.setSelected(rf.isEmotionalPacing());
			cbEmotionalHand.setSelected(rf.isEmotionalHandWringing());
			cbEmotionalUnrealistic
					.setSelected(rf.isEmotionalUnrealisticFears());
			cbEmotionalWorried.setSelected(rf.isEmotionalWorried());
			cbEmotionalSuicideAttempts.setSelected(rf
					.isEmotionalSuicideAttempts());
			cbEmotionalSuicideThreats.setSelected(rf
					.isEmotionalSuicideThreats());
			cbEmotionalPlanSuicide.setSelected(rf.isEmotionalPlansForSuicide());
			cbEmotionalThreats.setSelected(rf.isEmotionalThreats());
			cbEmotionalSelfDeprecation.setSelected(rf
					.isEmotionalSelfDeprecation());
			cbEmotionalHealth.setSelected(rf.isEmotionalHealthComplaints());
			cbEmotionalCrying.setSelected(rf.isEmotionalCrying());
			cbEmotionalInsomnia.setSelected(rf.isEmotionalInsomnia());
			cbEmotionalSleepPattern.setSelected(rf.isEmotionalSleep());
			cbEmotionalMoodSwings.setSelected(rf.isEmotionalMood());
			cbEmotionalFear.setSelected(rf.isEmotionalFear());
			cbEmotionalInBedcloths.setSelected(rf.isEmotionalInBedclothes());
			cbEmotionalReducedSocial.setSelected(rf.isEmotionalReducedSocial());
			cbEmotionalRepetitiveVerbalizations.setSelected(rf
					.isEmotionalRepetitiveVerbalizations());
			cbEmotionalSeeksConstantAttentions.setSelected(rf
					.isEmotionalSeeksAttention());
			cbEmotionalSeeksConatantReassurances.setSelected(rf
					.isEmotionalSeeksReassurances());
			cbEmotionalExcessive.setSelected(rf.isEmotionalExcessive());
			cbEmotionalRepetitiveQuestions.setSelected(rf
					.isEmotionalRepetitiveQuestions());
			cbEmotionalWithdrawal.setSelected(rf.isEmotionalWithdrawal());

			cbBehavioralWandering.setSelected(rf.isBehavioralWandering());
			cbBehavioralVerbal.setSelected(rf.isBehavioralVerbal());
			cbBehavioralInappropriate.setSelected(rf
					.isBehavioralInappropriate());
			cbBehavioralResident.setSelected(rf.isBehavioralResistance());
			cbBehavioralPhysical.setSelected(rf.isBehavioralPhysical());
			cbBehavioralDisruptive.setSelected(rf.isBehavioralDisruptive());

			cbInteractiveHighlyImpairedHearing.setSelected(rf
					.isInteractiveHighlyImpaired());
			cbInteractiveRarelyUnderstood.setSelected(rf
					.isInteractiveRarelyUnderstood());
			cbInteractiveHighlyImpairedVision.setSelected(rf
					.isInteractiveHighlyImpaired());
			cbInteractiveUnclearSpeech.setSelected(rf
					.isInteractiveUnclearSpeech());
			cbInteractiverRarelyUnderstands.setSelected(rf
					.isInteractiveRarelyUnderstands());
			cbInteractiveDeteriorated.setSelected(rf
					.isInteractiveDeteriorated());
			cbInteractiveNoSpeech.setSelected(rf.isInteractiveNoSpeech());
			cbInteractiveBlind.setSelected(rf.isInteractiveBlind());

			cbSocialUnhappyWithRoommate.setSelected(rf
					.isSocialUnhappyRoommate());
			cbSocialConflict.setSelected(rf.isSocialConflict());
			cbSocialSadness.setSelected(rf.isSocialSadness());
			cbSocialUnhappyWithOther.setSelected(rf.isSocialUnhappyResidents());
			cbSocialLoss.setSelected(rf.isSocialLoss());
			cbSocialAdjustment.setSelected(rf.isSocialAdjustment());
			cbSocialConstantly.setSelected(rf.isSocialConstantly());

			txtNarrativeComments.setText(rf.getNarrativeComments());
			dcDate.setDate(rf.getDateRecord());
			txtReferralAuthorizedBy.setText(rf.getReferralAuthorizedBy());

		}

	}

	public void doSave() {
		ReferralForm rf = new ReferralForm();

		rf.setSerial(Global.currentReferralFormKey);
		rf.setResidentId(Global.currentResidenceKey);

		rf.setCognitiveMrDevelopment(cbCognitiveMrDevelopmental.isSelected());

		rf.setCognitiveOrganicCondition(cbCognitiveOrganiseCondition
				.isSelected());
		rf.setCognitiveRestlessness(cbCognitiveRestlessness.isSelected());
		rf.setCognitiveDisorganizedSpeech(cbCognitiveDisorganized.isSelected());
		rf.setCognitiveConfusion(cbCognitiveConfusion.isSelected());
		rf.setCognitiveDelusions(cbCognitiveDelusions.isSelected());
		rf.setCognitiveLethargy(cbCognitiveLethargy.isSelected());
		rf.setCognitiveShortLongTerm(cbCognitiveShort.isSelected());

		rf.setEmotionalSadness(cbEmotionalSadness.isSelected());
		rf.setEmotionalNegative(cbEmotionalNegativeStatements.isSelected());
		rf.setEmotionalAnger(cbEmotionalAnger.isSelected());
		rf.setEmotionalPacing(cbEmotionalPacing.isSelected());
		rf.setEmotionalHandWringing(cbEmotionalHand.isSelected());
		rf.setEmotionalUnrealisticFears(cbEmotionalUnrealistic.isSelected());
		rf.setEmotionalWorried(cbEmotionalWorried.isSelected());
		rf.setEmotionalSuicideAttempts(cbEmotionalSuicideAttempts.isSelected());
		rf.setEmotionalSuicideThreats(cbEmotionalSuicideThreats.isSelected());
		rf.setEmotionalPlansForSuicide(cbEmotionalPlanSuicide.isSelected());
		rf.setEmotionalThreats(cbEmotionalThreats.isSelected());
		rf.setEmotionalSelfDeprecation(cbEmotionalSelfDeprecation.isSelected());
		rf.setEmotionalHealthComplaints(cbEmotionalHealth.isSelected());
		rf.setEmotionalCrying(cbEmotionalCrying.isSelected());
		rf.setEmotionalInsomnia(cbEmotionalInsomnia.isSelected());
		rf.setEmotionalSleep(cbEmotionalSleepPattern.isSelected());
		rf.setEmotionalMood(cbEmotionalMoodSwings.isSelected());
		rf.setEmotionalFear(cbEmotionalFear.isSelected());
		rf.setEmotionalInBedclothes(cbEmotionalInBedcloths.isSelected());
		rf.setEmotionalReducedSocial(cbEmotionalReducedSocial.isSelected());
		rf
				.setEmotionalRepetitiveVerbalizations(cbEmotionalRepetitiveVerbalizations
						.isSelected());
		rf.setEmotionalSeeksAttention(cbEmotionalSeeksConstantAttentions
				.isSelected());
		rf.setEmotionalSeeksReassurances(cbEmotionalSeeksConatantReassurances
				.isSelected());
		rf.setEmotionalExcessive(cbEmotionalExcessive.isSelected());
		rf.setEmotionalRepetitiveQuestions(cbEmotionalRepetitiveQuestions
				.isSelected());
		rf.setEmotionalWithdrawal(cbEmotionalWithdrawal.isSelected());

		rf.setBehavioralWandering(cbBehavioralWandering.isSelected());
		rf.setBehavioralVerbal(cbBehavioralVerbal.isSelected());
		rf.setBehavioralInappropriate(cbBehavioralInappropriate.isSelected());
		rf.setBehavioralResistance(cbBehavioralResident.isSelected());
		rf.setBehavioralPhysical(cbBehavioralPhysical.isSelected());
		rf.setBehavioralDisruptive(cbBehavioralDisruptive.isSelected());

		rf.setInteractiveHighlyImpaired(cbInteractiveHighlyImpairedHearing
				.isSelected());
		rf.setInteractiveRarelyUnderstood(cbInteractiveRarelyUnderstood
				.isSelected());
		rf.setInteractiveHighlyImpaired(cbInteractiveHighlyImpairedVision
				.isSelected());
		rf.setInteractiveUnclearSpeech(cbInteractiveUnclearSpeech.isSelected());
		rf.setInteractiveRarelyUnderstands(cbInteractiverRarelyUnderstands
				.isSelected());
		rf.setInteractiveDeteriorated(cbInteractiveDeteriorated.isSelected());
		rf.setInteractiveNoSpeech(cbInteractiveNoSpeech.isSelected());
		rf.setInteractiveBlind(cbInteractiveBlind.isSelected());

		rf.setSocialUnhappyRoommate(cbSocialUnhappyWithRoommate.isSelected());
		rf.setSocialConflict(cbSocialConflict.isSelected());
		rf.setSocialSadness(cbSocialSadness.isSelected());
		rf.setSocialUnhappyResidents(cbSocialUnhappyWithOther.isSelected());
		rf.setSocialLoss(cbSocialLoss.isSelected());
		rf.setSocialAdjustment(cbSocialAdjustment.isSelected());
		rf.setSocialConstantly(cbSocialConstantly.isSelected());

		rf.setNarrativeComments(txtNarrativeComments.getText());
		rf.setReferralAuthorizedBy(txtReferralAuthorizedBy.getText());

		try {
			Global.currentReferralFormKey = MedrexClientManager.getInstance()
					.insertOrUpdateReferralForm(rf);
		} catch (Exception e) {
		}

	}

}
