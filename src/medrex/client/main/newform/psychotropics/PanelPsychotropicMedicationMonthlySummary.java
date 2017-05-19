package medrex.client.main.newform.psychotropics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.intf.Form;

public class PanelPsychotropicMedicationMonthlySummary extends JPanel implements
		Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4687908066792815047L;
	private JTextField txtHowManyTimes;
	private JLabel lblHowManyTimes;
	private JRadioButton rbNO_2;
	private JRadioButton rbYes_2;
	private JCheckBox cbDrooling;
	private JCheckBox cbDisturbedGailt;
	private JCheckBox cbIncreasedAgitation;
	private JCheckBox cbIncreased;
	private JCheckBox cbSlowInvoluntaryMovement;
	private JCheckBox cbConfusion;
	private JCheckBox cbTremors;
	private JCheckBox cbMotorRestlessness;
	private JCheckBox cbIncreasedFalls;
	private JCheckBox cbMuscle;
	private JCheckBox cbstooped;
	private JLabel lblBehavioralApproaches_7;
	private JCheckBox cbdrowsiness;
	private JCheckBox cbSkinChange;
	private JCheckBox cbOrthostatic;
	private JCheckBox cbConstipation;
	private JCheckBox cbRedirection_4;
	private JCheckBox cbDryMouth;
	private JRadioButton rbNO_1;
	private JRadioButton rbYes_1;
	private JCheckBox cbUrinaryRetention;
	private JCheckBox cbURI;
	private JLabel lblBehavioralApproaches_5;
	private JTextArea txtimprovedorstablebehavior;
	private JTextArea txtWorsenedBehavoir;
	private JLabel lblImprovedOrStableLabel;
	private JLabel lblWorsenedBehavoir;
	private JRadioButton rbNO;
	private JRadioButton rbYes;
	private JLabel lblBehavioralApproaches_6;
	private JLabel lblBehavioralApproaches_4;
	private JCheckBox cbExposure;
	private JCheckBox cbTherapeutic;
	private JLabel lblBehavioralApproaches_3;
	private JCheckBox cbSimpleTask;
	private JCheckBox cbLables;
	private JCheckBox cbChangeofScenery;
	private JLabel lblBehavioralApproaches_2;
	private JCheckBox cbRedirection_2;
	private JCheckBox cbSensoryStimulation_2;
	private JCheckBox rbLifeSkills;
	private JCheckBox cbreminiscence;
	private JCheckBox cbExercise;
	private JCheckBox cbMusic;
	private JLabel lblBehavioralApproaches_1;
	private JCheckBox cbSensoryStimulation;
	private JCheckBox cbValidation;
	private JCheckBox cbDistraction;
	private JCheckBox cbRedirection;
	private JLabel lblBehavioralApproaches;
	private JRadioButton rbSame;
	private JRadioButton rbWorsened;
	private JRadioButton rbImproved;
	private JTextField txtSummary;
	private JLabel lblSummary;
	private JTextField txtRoomNo;
	private JLabel lblRoomNo;
	private JTextField txtResidentName;
	private JLabel lblResidentName;

	public PanelPsychotropicMedicationMonthlySummary() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setPreferredSize(new Dimension(800, 1067));
		setBackground(new Color(254, 252, 252));

		final JPanel panel = new JPanel();
		panel.setAutoscrolls(true);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(5, 5, 785, 1066);
		add(panel);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label
				.setText("<html><body><u>Plaza HealthCare and Rehabilitation Center");
		label.setBounds(151, 10, 435, 14);
		panel.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1
				.setText("<html><body><u>PSYCHOTROPIC MEDICATION MONTHLY SUMMARY ");
		label_1.setBounds(151, 30, 435, 14);
		panel.add(label_1);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 50, 765, 39);
		panel.add(panel_1);

		lblResidentName = new JLabel();
		lblResidentName.setFont(new Font("Arial", Font.BOLD, 12));
		lblResidentName.setText("Resident Name:");
		lblResidentName.setBounds(10, 10, 89, 16);
		panel_1.add(lblResidentName);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(105, 10, 179, 21);
		panel_1.add(txtResidentName);

		lblRoomNo = new JLabel();
		lblRoomNo.setFont(new Font("Arial", Font.BOLD, 12));
		lblRoomNo.setText("Room No:");
		lblRoomNo.setBounds(290, 10, 54, 14);
		panel_1.add(lblRoomNo);

		txtRoomNo = new JTextField();
		txtRoomNo.setBounds(345, 10, 142, 21);
		panel_1.add(txtRoomNo);

		lblSummary = new JLabel();
		lblSummary.setFont(new Font("Arial", Font.BOLD, 12));
		lblSummary.setText("Summary Month/Year:");
		lblSummary.setBounds(500, 10, 134, 16);
		panel_1.add(lblSummary);

		txtSummary = new JTextField();
		txtSummary.setBounds(640, 10, 115, 21);
		panel_1.add(txtSummary);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 95, 765, 52);
		panel.add(panel_2);

		final JLabel diagnosisLabel = new JLabel();
		diagnosisLabel.setFont(new Font("Arial", Font.BOLD, 12));
		diagnosisLabel.setText("Diagnosis:");
		diagnosisLabel.setBounds(10, 10, 89, 16);
		panel_2.add(diagnosisLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 10, 677, 39);
		panel_2.add(scrollPane);

		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		final JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 153, 765, 195);
		panel.add(panel_3);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Arial", Font.BOLD, 12));
		label_2.setText("1.");
		label_2.setBounds(10, 10, 25, 16);
		panel_3.add(label_2);

		final JLabel medicationsLabel = new JLabel();
		medicationsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		medicationsLabel.setText("Medication(s)");
		medicationsLabel.setBounds(41, 11, 88, 14);
		panel_3.add(medicationsLabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setOpaque(false);
		panel_4.setLayout(null);
		panel_4.setBounds(26, 30, 729, 162);
		panel_3.add(panel_4);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setOpaque(false);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 243, 162);
		panel_4.add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 729, 27);
		panel_4.add(panel_6);

		final JLabel nameOfMedicationfrequencyLabel = new JLabel();
		nameOfMedicationfrequencyLabel
				.setFont(new Font("Arial", Font.PLAIN, 12));
		nameOfMedicationfrequencyLabel.setText("Name Of medication/Frequency");
		nameOfMedicationfrequencyLabel.setBounds(20, 5, 186, 16);
		panel_6.add(nameOfMedicationfrequencyLabel);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setOpaque(false);
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(243, 0, 243, 162);
		panel_4.add(panel_5_1);

		final JLabel targetBehaviorsLabel = new JLabel();
		targetBehaviorsLabel.setText("Target Behaviors");
		targetBehaviorsLabel.setBounds(20, 5, 136, 16);
		panel_5_1.add(targetBehaviorsLabel);

		final JPanel panel_6_1_3 = new JPanel();
		panel_6_1_3.setOpaque(false);
		panel_6_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_3.setLayout(null);
		panel_6_1_3.setBounds(0, 108, 729, 27);
		panel_4.add(panel_6_1_3);

		final JPanel panel_6_1_2 = new JPanel();
		panel_6_1_2.setOpaque(false);
		panel_6_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2.setLayout(null);
		panel_6_1_2.setBounds(0, 81, 729, 27);
		panel_4.add(panel_6_1_2);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setOpaque(false);
		panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(0, 54, 729, 27);
		panel_4.add(panel_6_1_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setOpaque(false);
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 27, 729, 27);
		panel_4.add(panel_6_1);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBorder(new LineBorder(Color.black, 1, false));

		panel_5_2.setOpaque(false);
		panel_5_2.setLayout(null);
		panel_5_2.setBounds(486, 0, 243, 162);
		panel_4.add(panel_5_2);

		final JLabel numberOfLabel = new JLabel();
		numberOfLabel.setText("Number of Occurrences");
		numberOfLabel.setBounds(20, 5, 213, 16);
		panel_5_2.add(numberOfLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_7.setLayout(null);
		panel_7.setBounds(10, 354, 765, 52);
		panel.add(panel_7);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Arial", Font.BOLD, 12));
		label_3.setText("2.");
		label_3.setBounds(10, 10, 25, 16);
		panel_7.add(label_3);

		final JLabel overallAssesssmentLabel = new JLabel();
		overallAssesssmentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		overallAssesssmentLabel.setText("Overall Assesssment:");
		overallAssesssmentLabel.setBounds(35, 10, 451, 16);
		panel_7.add(overallAssesssmentLabel);

		final JLabel overallAssesssmentLabel_1 = new JLabel();
		overallAssesssmentLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		overallAssesssmentLabel_1.setText("Resident's behavior has");
		overallAssesssmentLabel_1.setBounds(67, 32, 114, 16);
		panel_7.add(overallAssesssmentLabel_1);

		rbImproved = new JRadioButton();
		rbImproved.setFont(new Font("Arial", Font.PLAIN, 12));
		rbImproved.setOpaque(false);
		rbImproved.setText("improved");
		rbImproved.setBounds(220, 30, 73, 18);
		panel_7.add(rbImproved);

		rbWorsened = new JRadioButton();
		rbWorsened.setFont(new Font("Arial", Font.PLAIN, 12));
		rbWorsened.setOpaque(false);
		rbWorsened.setText("worsened");
		rbWorsened.setBounds(335, 30, 73, 18);
		panel_7.add(rbWorsened);

		rbSame = new JRadioButton();
		rbSame.setFont(new Font("Arial", Font.PLAIN, 12));
		rbSame.setOpaque(false);
		rbSame.setText("same");
		rbSame.setBounds(470, 30, 73, 18);
		panel_7.add(rbSame);

		// To add radio button in Button Group.........
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rbImproved);
		bgroup.add(rbWorsened);
		bgroup.add(rbSame);

		final JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		panel_8.setLayout(null);
		panel_8.setBounds(10, 412, 765, 233);
		panel.add(panel_8);

		final JLabel label_3_1 = new JLabel();
		label_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_3_1.setText("3.");
		label_3_1.setBounds(10, 10, 25, 16);
		panel_8.add(label_3_1);

		final JLabel overallAssesssmentLabel_2 = new JLabel();
		overallAssesssmentLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		overallAssesssmentLabel_2
				.setText("If worsened indicate interventions implemented.");
		overallAssesssmentLabel_2.setBounds(35, 10, 451, 16);
		panel_8.add(overallAssesssmentLabel_2);

		final JLabel overallAssesssmentLabel_2_1 = new JLabel();
		overallAssesssmentLabel_2_1.setVerticalTextPosition(SwingConstants.TOP);
		overallAssesssmentLabel_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		overallAssesssmentLabel_2_1.setText(".");
		overallAssesssmentLabel_2_1.setBounds(35, 32, 16, 16);
		panel_8.add(overallAssesssmentLabel_2_1);

		final JLabel overallAssesssmentLabel_2_2 = new JLabel();
		overallAssesssmentLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		overallAssesssmentLabel_2_2
				.setText("Non-drug interventions implemented:");
		overallAssesssmentLabel_2_2.setBounds(57, 36, 451, 16);
		panel_8.add(overallAssesssmentLabel_2_2);
		final JPanel panel_9 = new JPanel();
		panel_9.setOpaque(false);
		panel_9.setLayout(null);
		panel_9.setBounds(57, 64, 698, 25);
		panel_8.add(panel_9);

		lblBehavioralApproaches = new JLabel();
		lblBehavioralApproaches.setFont(new Font("Arial", Font.BOLD, 12));
		lblBehavioralApproaches.setBounds(5, 5, 135, 16);
		lblBehavioralApproaches.setText("Behavioral Approaches:");
		panel_9.add(lblBehavioralApproaches);

		cbRedirection = new JCheckBox();
		cbRedirection.setOpaque(false);
		cbRedirection.setText("Redirection;");
		cbRedirection.setBounds(160, 5, 100, 16);
		panel_9.add(cbRedirection);

		cbDistraction = new JCheckBox();

		cbDistraction.setOpaque(false);
		cbDistraction.setText("Distraction");
		cbDistraction.setBounds(280, 5, 100, 16);
		panel_9.add(cbDistraction);

		cbValidation = new JCheckBox();
		cbValidation.setOpaque(false);
		cbValidation.setText("Validation;");
		cbValidation.setBounds(400, 5, 100, 16);
		panel_9.add(cbValidation);

		cbSensoryStimulation = new JCheckBox();
		cbSensoryStimulation.setOpaque(false);
		cbSensoryStimulation.setText("Sensory Stimulation");
		cbSensoryStimulation.setBounds(520, 5, 150, 16);
		panel_9.add(cbSensoryStimulation);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setOpaque(false);
		panel_9_1.setLayout(null);
		panel_9_1.setBounds(57, 95, 698, 50);
		panel_8.add(panel_9_1);

		lblBehavioralApproaches_1 = new JLabel();
		lblBehavioralApproaches_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblBehavioralApproaches_1.setText("Activities:");
		lblBehavioralApproaches_1.setBounds(5, 5, 135, 16);
		panel_9_1.add(lblBehavioralApproaches_1);

		cbMusic = new JCheckBox();
		cbMusic.setOpaque(false);
		cbMusic.setText("Music;");
		cbMusic.setBounds(160, 5, 100, 16);
		panel_9_1.add(cbMusic);

		cbExercise = new JCheckBox();
		cbExercise.setOpaque(false);
		cbExercise.setText("Exercise;");
		cbExercise.setBounds(280, 5, 100, 16);
		panel_9_1.add(cbExercise);

		cbreminiscence = new JCheckBox();
		cbreminiscence.setOpaque(false);
		cbreminiscence.setText("Reminiscence;");
		cbreminiscence.setBounds(400, 5, 100, 16);
		panel_9_1.add(cbreminiscence);

		rbLifeSkills = new JCheckBox();
		rbLifeSkills.setOpaque(false);
		rbLifeSkills.setText("Life skills;");
		rbLifeSkills.setBounds(520, 5, 100, 16);
		panel_9_1.add(rbLifeSkills);

		cbSensoryStimulation_2 = new JCheckBox();
		cbSensoryStimulation_2.setOpaque(false);
		cbSensoryStimulation_2.setText("Walking;");
		cbSensoryStimulation_2.setBounds(640, 7, 100, 16);
		panel_9_1.add(cbSensoryStimulation_2);

		cbRedirection_2 = new JCheckBox();
		cbRedirection_2.setOpaque(false);
		cbRedirection_2.setText("Resting;");
		cbRedirection_2.setBounds(160, 27, 100, 16);
		panel_9_1.add(cbRedirection_2);

		final JPanel panel_9_2 = new JPanel();
		panel_9_2.setOpaque(false);
		panel_9_2.setLayout(null);
		panel_9_2.setBounds(57, 148, 698, 25);
		panel_8.add(panel_9_2);

		lblBehavioralApproaches_2 = new JLabel();
		lblBehavioralApproaches_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblBehavioralApproaches_2.setText("Envirnmental:");
		lblBehavioralApproaches_2.setBounds(5, 5, 135, 16);
		panel_9_2.add(lblBehavioralApproaches_2);

		cbChangeofScenery = new JCheckBox();
		cbChangeofScenery.setOpaque(false);
		cbChangeofScenery.setText("Change of scenery;");
		cbChangeofScenery.setBounds(160, 5, 114, 16);
		panel_9_2.add(cbChangeofScenery);

		cbLables = new JCheckBox();
		cbLables.setOpaque(false);
		cbLables.setText("Lables/signs/cues;");
		cbLables.setBounds(280, 5, 106, 16);
		panel_9_2.add(cbLables);

		cbSimpleTask = new JCheckBox();
		cbSimpleTask.setOpaque(false);
		cbSimpleTask.setText("Simple tasks;");
		cbSimpleTask.setBounds(400, 5, 100, 16);
		panel_9_2.add(cbSimpleTask);

		final JPanel panel_9_2_1 = new JPanel();
		panel_9_2_1.setOpaque(false);
		panel_9_2_1.setLayout(null);
		panel_9_2_1.setBounds(57, 179, 698, 25);
		panel_8.add(panel_9_2_1);

		lblBehavioralApproaches_3 = new JLabel();
		lblBehavioralApproaches_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblBehavioralApproaches_3.setText("Alternative Therapies: ");
		lblBehavioralApproaches_3.setBounds(5, 5, 135, 16);
		panel_9_2_1.add(lblBehavioralApproaches_3);

		cbTherapeutic = new JCheckBox();
		cbTherapeutic.setOpaque(false);
		cbTherapeutic.setText("Therapeutic touch;");
		cbTherapeutic.setBounds(160, 5, 114, 16);
		panel_9_2_1.add(cbTherapeutic);

		cbExposure = new JCheckBox();
		cbExposure.setOpaque(false);
		cbExposure.setText("Exposure to bright light;");
		cbExposure.setBounds(280, 5, 135, 16);
		panel_9_2_1.add(cbExposure);

		final JPanel panel_9_2_1_1 = new JPanel();
		panel_9_2_1_1.setOpaque(false);
		panel_9_2_1_1.setLayout(null);
		panel_9_2_1_1.setBounds(57, 210, 698, 25);
		panel_8.add(panel_9_2_1_1);

		lblBehavioralApproaches_4 = new JLabel();
		lblBehavioralApproaches_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblBehavioralApproaches_4.setText("Others:");
		lblBehavioralApproaches_4.setBounds(5, 5, 135, 16);
		panel_9_2_1_1.add(lblBehavioralApproaches_4);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setOpaque(true);
		scrollPane_1.setBounds(60, 2, 638, 20);
		panel_9_2_1_1.add(scrollPane_1);

		final JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setOpaque(false);
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(10, 645, 765, 133);
		panel.add(panel_8_1);

		final JLabel overallAssesssmentLabel_2_3 = new JLabel();
		overallAssesssmentLabel_2_3.setFont(new Font("Arial", Font.BOLD, 20));
		overallAssesssmentLabel_2_3.setText(".");
		overallAssesssmentLabel_2_3.setBounds(35, 5, 16, 16);
		panel_8_1.add(overallAssesssmentLabel_2_3);

		final JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setOpaque(false);
		panel_9_1_1.setLayout(null);
		panel_9_1_1.setBounds(80, 55, 675, 74);
		panel_8_1.add(panel_9_1_1);

		lblBehavioralApproaches_6 = new JLabel();
		lblBehavioralApproaches_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBehavioralApproaches_6
				.setText("If Yes,explain reason for medication change:");
		lblBehavioralApproaches_6.setBounds(5, 5, 255, 16);
		panel_9_1_1.add(lblBehavioralApproaches_6);

		final JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(5, 27, 186, 20);
		panel_9_1_1.add(scrollPane_2);

		txtWorsenedBehavoir = new JTextArea();
		scrollPane_2.setViewportView(txtWorsenedBehavoir);

		final JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(5, 53, 186, 20);
		panel_9_1_1.add(scrollPane_3);

		txtimprovedorstablebehavior = new JTextArea();
		scrollPane_3.setViewportView(txtimprovedorstablebehavior);

		lblWorsenedBehavoir = new JLabel();
		lblWorsenedBehavoir.setFont(new Font("Arial", Font.PLAIN, 12));
		lblWorsenedBehavoir.setText("Worsened behavoir ");
		lblWorsenedBehavoir.setBounds(206, 27, 153, 16);
		panel_9_1_1.add(lblWorsenedBehavoir);

		lblImprovedOrStableLabel = new JLabel();
		lblImprovedOrStableLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblImprovedOrStableLabel.setText("improved or stable behavior");
		lblImprovedOrStableLabel.setBounds(206, 53, 153, 16);
		panel_9_1_1.add(lblImprovedOrStableLabel);

		final JLabel overallAssesssmentLabel_2_2_2 = new JLabel();
		overallAssesssmentLabel_2_2_2
				.setText("Drug Interventions implemented:");
		overallAssesssmentLabel_2_2_2.setBounds(55, 5, 451, 16);
		panel_8_1.add(overallAssesssmentLabel_2_2_2);

		final JPanel panel_10 = new JPanel();
		panel_10.setOpaque(false);
		panel_10.setLayout(null);
		panel_10.setBounds(80, 25, 675, 25);
		panel_8_1.add(panel_10);

		final JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Arial", Font.BOLD, 14));
		label_4.setText("*");
		label_4.setBounds(5, 1, 16, 16);
		panel_10.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Arial", Font.PLAIN, 12));
		label_5
				.setText("There was a change in psychotropic medication(s) since last assessment: ");
		label_5.setBounds(27, 5, 411, 16);
		panel_10.add(label_5);

		rbYes = new JRadioButton();
		rbYes.setOpaque(false);
		rbYes.setFont(new Font("Arial", Font.BOLD, 12));
		rbYes.setText("Yes");
		rbYes.setBounds(463, 5, 73, 18);
		panel_10.add(rbYes);

		rbNO = new JRadioButton();
		rbNO.setOpaque(false);
		rbNO.setFont(new Font("Arial", Font.BOLD, 12));
		rbNO.setText("NO");
		rbNO.setBounds(558, 5, 73, 18);
		panel_10.add(rbNO);

		ButtonGroup bgGroup1 = new ButtonGroup();
		bgGroup1.add(rbYes);
		bgGroup1.add(rbNO);

		final JPanel panel_8_2 = new JPanel();
		panel_8_2.setOpaque(false);
		panel_8_2.setLayout(null);
		panel_8_2.setBounds(10, 775, 765, 261);
		panel.add(panel_8_2);

		final JLabel label_3_1_1 = new JLabel();
		label_3_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_3_1_1.setText("4");
		label_3_1_1.setBounds(10, 10, 25, 16);
		panel_8_2.add(label_3_1_1);

		final JLabel overallAssesssmentLabel_2_2_1 = new JLabel();
		overallAssesssmentLabel_2_2_1
				.setFont(new Font("Arial", Font.PLAIN, 12));
		overallAssesssmentLabel_2_2_1.setText("If yes,check all that apply:");
		overallAssesssmentLabel_2_2_1.setBounds(35, 36, 451, 16);
		panel_8_2.add(overallAssesssmentLabel_2_2_1);

		final JPanel panel_9_3 = new JPanel();
		panel_9_3.setOpaque(false);
		panel_9_3.setLayout(null);
		panel_9_3.setBounds(35, 58, 698, 68);
		panel_8_2.add(panel_9_3);

		lblBehavioralApproaches_5 = new JLabel();
		lblBehavioralApproaches_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBehavioralApproaches_5.setText("A.");
		lblBehavioralApproaches_5.setBounds(5, 5, 16, 16);
		panel_9_3.add(lblBehavioralApproaches_5);

		cbURI = new JCheckBox();
		cbURI.setOpaque(false);
		cbURI.setText("URI");
		cbURI.setBounds(160, 5, 100, 16);
		panel_9_3.add(cbURI);

		cbUrinaryRetention = new JCheckBox();
		cbUrinaryRetention.setOpaque(false);
		cbUrinaryRetention.setText("Urinary retention");
		cbUrinaryRetention.setBounds(280, 5, 100, 16);
		panel_9_3.add(cbUrinaryRetention);

		final JLabel medicalConditionsLabel = new JLabel();
		medicalConditionsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		medicalConditionsLabel.setText("Medical Condition(s):");
		medicalConditionsLabel.setBounds(27, 5, 127, 16);
		panel_9_3.add(medicalConditionsLabel);

		cbDryMouth = new JCheckBox();
		cbDryMouth.setOpaque(false);
		cbDryMouth.setText("Dry Mouth");
		cbDryMouth.setBounds(5, 27, 100, 16);
		panel_9_3.add(cbDryMouth);

		cbRedirection_4 = new JCheckBox();
		cbRedirection_4.setOpaque(false);
		cbRedirection_4.setText("Blurred Vision");
		cbRedirection_4.setBounds(160, 28, 100, 16);
		panel_9_3.add(cbRedirection_4);

		cbConstipation = new JCheckBox();
		cbConstipation.setOpaque(false);
		cbConstipation.setText("Constipation");
		cbConstipation.setBounds(280, 28, 100, 16);
		panel_9_3.add(cbConstipation);

		cbOrthostatic = new JCheckBox();
		cbOrthostatic.setOpaque(false);
		cbOrthostatic.setText("Orthostatic Hypotension");
		cbOrthostatic.setBounds(400, 27, 135, 16);
		panel_9_3.add(cbOrthostatic);

		cbSkinChange = new JCheckBox();
		cbSkinChange.setOpaque(false);
		cbSkinChange.setText("Skin Change");
		cbSkinChange.setBounds(565, 27, 100, 16);
		panel_9_3.add(cbSkinChange);

		cbdrowsiness = new JCheckBox();
		cbdrowsiness.setOpaque(false);
		cbdrowsiness.setText("Drowsiness");
		cbdrowsiness.setBounds(5, 49, 100, 16);
		panel_9_3.add(cbdrowsiness);

		final JPanel panel_10_1 = new JPanel();
		panel_10_1.setOpaque(false);
		panel_10_1.setLayout(null);
		panel_10_1.setBounds(35, 7, 675, 25);
		panel_8_2.add(panel_10_1);

		final JLabel hideEffectsOfLabel = new JLabel();
		hideEffectsOfLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		hideEffectsOfLabel
				.setText("Side effects of psychotropic medication(s) during the last month: ");
		hideEffectsOfLabel.setBounds(5, 5, 428, 16);
		panel_10_1.add(hideEffectsOfLabel);

		rbYes_1 = new JRadioButton();
		rbYes_1.setOpaque(false);
		rbYes_1.setFont(new Font("Arial", Font.BOLD, 12));
		rbYes_1.setText("Yes");
		rbYes_1.setBounds(463, 5, 73, 18);
		panel_10_1.add(rbYes_1);

		rbNO_1 = new JRadioButton();
		rbNO_1.setOpaque(false);
		rbNO_1.setFont(new Font("Arial", Font.BOLD, 12));
		rbNO_1.setText("No");
		rbNO_1.setBounds(558, 5, 73, 18);
		panel_10_1.add(rbNO_1);

		ButtonGroup bgButtonGroup = new ButtonGroup();
		bgButtonGroup.add(rbYes_1);
		bgButtonGroup.add(rbNO_1);

		final JPanel panel_9_3_1 = new JPanel();
		panel_9_3_1.setOpaque(false);
		panel_9_3_1.setLayout(null);
		panel_9_3_1.setBounds(35, 125, 698, 85);
		panel_8_2.add(panel_9_3_1);

		lblBehavioralApproaches_7 = new JLabel();
		lblBehavioralApproaches_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBehavioralApproaches_7.setText("B.");
		lblBehavioralApproaches_7.setBounds(5, 5, 16, 16);
		panel_9_3_1.add(lblBehavioralApproaches_7);

		cbstooped = new JCheckBox();
		cbstooped.setOpaque(false);
		cbstooped.setText("Stooped posture");
		cbstooped.setBounds(160, 5, 100, 16);
		panel_9_3_1.add(cbstooped);

		cbMuscle = new JCheckBox();
		cbMuscle.setOpaque(false);
		cbMuscle.setText("Muscle spasm/stiffness");
		cbMuscle.setBounds(280, 5, 135, 16);
		panel_9_3_1.add(cbMuscle);

		final JLabel medicalConditionsLabel_1 = new JLabel();
		medicalConditionsLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		medicalConditionsLabel_1.setText("Movements Behaviors:");
		medicalConditionsLabel_1.setBounds(27, 5, 135, 16);
		panel_9_3_1.add(medicalConditionsLabel_1);

		cbIncreasedFalls = new JCheckBox();
		cbIncreasedFalls.setOpaque(false);
		cbIncreasedFalls.setText("Increased falls");
		cbIncreasedFalls.setBounds(5, 27, 100, 16);
		panel_9_3_1.add(cbIncreasedFalls);

		cbMotorRestlessness = new JCheckBox();
		cbMotorRestlessness.setOpaque(false);
		cbMotorRestlessness.setText("Motor restlessness");
		cbMotorRestlessness.setBounds(160, 28, 114, 16);
		panel_9_3_1.add(cbMotorRestlessness);

		cbTremors = new JCheckBox();
		cbTremors.setOpaque(false);
		cbTremors.setText("Tremors");
		cbTremors.setBounds(280, 28, 100, 16);
		panel_9_3_1.add(cbTremors);

		cbConfusion = new JCheckBox();
		cbConfusion.setOpaque(false);
		cbConfusion.setText("Confusion");
		cbConfusion.setBounds(400, 27, 135, 16);
		panel_9_3_1.add(cbConfusion);

		cbSlowInvoluntaryMovement = new JCheckBox();
		cbSlowInvoluntaryMovement.setOpaque(false);
		cbSlowInvoluntaryMovement.setText("Slow Involuntary Movement");
		cbSlowInvoluntaryMovement.setBounds(5, 49, 152, 16);
		panel_9_3_1.add(cbSlowInvoluntaryMovement);

		cbIncreased = new JCheckBox();
		cbIncreased.setOpaque(false);
		cbIncreased.setText("Increased behavior");
		cbIncreased.setBounds(432, 7, 135, 16);
		panel_9_3_1.add(cbIncreased);

		cbIncreasedAgitation = new JCheckBox();
		cbIncreasedAgitation.setOpaque(false);
		cbIncreasedAgitation.setText("Increased agitation");
		cbIncreasedAgitation.setBounds(160, 50, 114, 16);
		panel_9_3_1.add(cbIncreasedAgitation);

		cbDisturbedGailt = new JCheckBox();
		cbDisturbedGailt.setOpaque(false);
		cbDisturbedGailt.setText("Disturbed gailt");
		cbDisturbedGailt.setBounds(280, 50, 100, 16);
		panel_9_3_1.add(cbDisturbedGailt);

		cbDrooling = new JCheckBox();
		cbDrooling.setOpaque(false);
		cbDrooling.setText("Drooling");
		cbDrooling.setBounds(400, 50, 100, 16);
		panel_9_3_1.add(cbDrooling);

		final JLabel medicalConditionsLabel_1_1 = new JLabel();
		medicalConditionsLabel_1_1.setText("Other:");
		medicalConditionsLabel_1_1.setBounds(5, 66, 64, 16);
		panel_9_3_1.add(medicalConditionsLabel_1_1);

		final JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(54, 66, 644, 19);
		panel_9_3_1.add(scrollPane_4);

		final JTextArea textArea_2 = new JTextArea();
		scrollPane_4.setViewportView(textArea_2);

		final JPanel panel_10_1_1 = new JPanel();
		panel_10_1_1.setOpaque(false);
		panel_10_1_1.setLayout(null);
		panel_10_1_1.setBounds(10, 216, 723, 25);
		panel_8_2.add(panel_10_1_1);

		final JLabel hideEffectsOfLabel_1 = new JLabel();
		hideEffectsOfLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		hideEffectsOfLabel_1.setText("Psychiatrist/APN Geropsychiatry visird:");
		hideEffectsOfLabel_1.setBounds(35, 5, 420, 16);
		panel_10_1_1.add(hideEffectsOfLabel_1);

		rbYes_2 = new JRadioButton();
		rbYes_2.setFont(new Font("Arial", Font.BOLD, 12));
		rbYes_2.setOpaque(false);
		rbYes_2.setText("Yes");
		rbYes_2.setBounds(250, 5, 73, 18);
		panel_10_1_1.add(rbYes_2);

		rbNO_2 = new JRadioButton();
		rbNO_2.setFont(new Font("Arial", Font.BOLD, 12));
		rbNO_2.setOpaque(false);
		rbNO_2.setText("No");
		rbNO_2.setBounds(550, 5, 73, 18);
		panel_10_1_1.add(rbNO_2);

		ButtonGroup bgGroup2 = new ButtonGroup();
		bgGroup2.add(rbYes_2);
		bgGroup2.add(rbNO_2);

		final JLabel label_3_1_1_1 = new JLabel();
		label_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_3_1_1_1.setText("5.");
		label_3_1_1_1.setBounds(2, 5, 16, 16);
		panel_10_1_1.add(label_3_1_1_1);

		lblHowManyTimes = new JLabel();
		lblHowManyTimes.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHowManyTimes.setText("how many times?");
		lblHowManyTimes.setBounds(329, 7, 97, 16);
		panel_10_1_1.add(lblHowManyTimes);

		txtHowManyTimes = new JTextField();
		txtHowManyTimes.setBounds(432, 4, 97, 21);
		panel_10_1_1.add(txtHowManyTimes);

	}

	public static void main(String args[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelPsychotropicMedicationMonthlySummary panel = new PanelPsychotropicMedicationMonthlySummary();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	@Override
	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}

}
