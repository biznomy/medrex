package medrex.client.main.ptOtSt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.ptOtSt.PtOtStRehabCarePlan;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelPtOtStRehabCarePlan extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 94401942680393571L;
	private JTextArea txtInterOther;
	private JTextArea txtGoalsOther;
	private JTextArea txtProbOther;
	private JLabel othersLabel_2;
	private JLabel othersLabel_1;
	private JLabel othersLabel;
	private JTextField txtOutField01;
	private JPanel panel_33;
	private JLabel outcomesLabel_1;
	private JPanel panel_32;
	private JTextField txtOutcomes01;
	private JPanel panel_31;
	private JLabel outcomesLabel;
	private JPanel panel_29;
	private JCheckBox cbInterDischarge;
	private JCheckBox cbInterPosturalEdu;
	private JCheckBox cbInterEquipmentNeeds;
	private JLabel awarenessAndEduLabel;
	private JCheckBox cbInterPatientCaregiver;
	private JCheckBox cbInterStairs;
	private JCheckBox cbInterGait;
	private JCheckBox cbInterTransfer;
	private JCheckBox cbInterAdl;
	private JCheckBox cbInterEndurance;
	private JCheckBox cbInterBalance;
	private JLabel activitiesLabel;
	private JCheckBox cbInterTherapeutic;
	private JTextPane pleaseCheckAppropriateTextPane_2;
	private JLabel interventionsLabel;
	private JPanel panel_27;
	private JDateChooser dcTargDate01;
	private JPanel panel_28;
	private JLabel targDateLabel;
	private JPanel panel_12;
	private JLabel usingAeAsLabel_4;
	private JLabel bodyAdlLabel_4;
	private JTextField txtGoalsSafetyAwarePercent;
	private JLabel toNStrengthLabel_6;
	private JCheckBox cbGoalsSafetyAware;
	private JPanel panel_26;
	private JLabel label_12;
	private JLabel label_11;
	private JPanel panel_25;
	private JLabel label_10;
	private JLabel label_9;
	private JPanel panel_24;
	private JTextField txtGoalsMobStairUsing;
	private JLabel usingAeAsLabel_3;
	private JLabel bodyAdlLabel_3;
	private JTextField txtGoalsMobStairSteps;
	private JCheckBox decreaseInStrengthCheckBox_14;
	private JPanel panel_23;
	private JTextField txtGoalsAmbulateUsing;
	private JLabel usingAeAsLabel_2;
	private JLabel bodyAdlLabel_2;
	private JTextField txtGoalsAmublateIf;
	private JCheckBox cbGoalsAmbulate;
	private JPanel panel_22;
	private JTextField txtGoalsMobChair;
	private JLabel usingAeAsLabel_1;
	private JLabel bodyAdlLabel_1;
	private JTextField txtGoalsMobToilet;
	private JLabel toNStrengthLabel_5;
	private JCheckBox cbGoalsMob;
	private JPanel panel_21;
	private JLabel usingAeAsLabel;
	private JLabel bodyAdlLabel;
	private JTextField txtGoalsAdlField;
	private JLabel toNStrengthLabel_4;
	private JCheckBox cbGoalsAdl;
	private JPanel panel_20;
	private JTextField txtGoalsEnduranceTo;
	private JLabel label_8;
	private JLabel label_7;
	private JPanel panel_19;
	private JLabel toNStrengthLabel_3;
	private JCheckBox cbGoalsEndurance;
	private JPanel panel_18;
	private JLabel toImproveInLabel;
	private JTextField txtGoalsBalanceTo;
	private JTextPane leBy12TextPane_2;
	private JLabel label_6;
	private JLabel label_5;
	private JPanel panel_17;
	private JLabel toNStrengthLabel_2;
	private JCheckBox cbGoalsBalance;
	private JPanel panel_16;
	private JTextPane leBy12TextPane_1;
	private JTextField txtGoalsRomBy;
	private JLabel ueLabel_1;
	private JTextField txtGoalsRomOf;
	private JLabel label_4;
	private JLabel label_3;
	private JPanel panel_15;
	private JLabel toNStrengthLabel_1;
	private JCheckBox decreaseInStrengthCheckBox_8;
	private JPanel panel_14;
	private JTextPane leBy12TextPane;
	private JTextField txtGoalsStrengthUeLe;
	private JLabel ueLabel;
	private JTextField txtGoalsStrengthOf;
	private JLabel label_2;
	private JLabel label_1;
	private JPanel panel_13;
	private JLabel toNStrengthLabel;
	private JCheckBox cbGoalsStrength;
	private JPanel panel_11;
	private JTextPane pleaseCheckAppropriateTextPane_1;
	private JTextPane pleaseCheckAppropriateTextPane;
	private JTextPane decreaseInSafetyTextPane;
	private JTextPane decreaseInFunctionalTextPane;
	private JTextPane decreaseInAbilityTextPane_;
	private JLabel goalsLabel;
	private JPanel panel_10;
	private JLabel otptLabel_8;
	private JLabel otptLabel_7;
	private JLabel otptLabel_6;
	private JLabel otptLabel_5;
	private JLabel otptLabel_4;
	private JLabel otptLabel_3;
	private JLabel otptLabel_2;
	private JLabel otptLabel_1;
	private JLabel otptLabel;
	private JLabel respDiscLabel;
	private JPanel panel_9;
	private JCheckBox cbProbDecSafetyAware;
	private JCheckBox cbProbDecMob;
	private JCheckBox cbProbDecAdl;
	private JCheckBox cbProbDecEndurance;
	private JCheckBox cbProbDecBalance;
	private JCheckBox cbProbDecRom;
	private JCheckBox cbProbDecStrength;
	private JLabel problemsLabel;
	private JPanel panel_8;
	private JTextField txtCarePlanNo01;
	private JPanel panel_6;
	private JLabel dateLabel_1;
	private JPanel panel_7;
	private JPanel panel_5;
	private JDateChooser dcCarePlanDate01;
	private JPanel panel_4;
	private JLabel dateLabel;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel_1;
	private JTextField txt$ResidentRmNo;
	private JLabel residentLabel_1;
	private JTextField txt$ResidentName;
	private JLabel residentLabel;
	private JLabel plazaHealthCareLabel_1;
	private JLabel plazaHealthCareLabel;
	private JPanel panel;

	/**
	 * Create the panel
	 */
	public PanelPtOtStRehabCarePlan() {
		super();
		Global.panelPtOtStRehabCarePlan = this;
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1000, 1000));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(2, 2, 996, 72);
		add(panel);

		plazaHealthCareLabel = new JLabel();
		plazaHealthCareLabel.setFont(new Font("", Font.PLAIN, 20));
		plazaHealthCareLabel
				.setText("PLAZA HEALTH CARE AND REHABILITION CENTER");
		plazaHealthCareLabel.setBounds(10, 10, 476, 20);
		panel.add(plazaHealthCareLabel);

		plazaHealthCareLabel_1 = new JLabel();
		plazaHealthCareLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		plazaHealthCareLabel_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		plazaHealthCareLabel_1.setText("REAHAB CARE PLAN");
		plazaHealthCareLabel_1.setBounds(492, 10, 498, 20);
		panel.add(plazaHealthCareLabel_1);

		residentLabel = new JLabel();
		residentLabel.setFont(new Font("", Font.PLAIN, 14));
		residentLabel.setText("RESIDENT:");
		residentLabel.setBounds(10, 49, 73, 14);
		panel.add(residentLabel);

		txt$ResidentName = new JTextField();
		txt$ResidentName.setFocusable(false);
		txt$ResidentName.setBackground(Color.WHITE);
		txt$ResidentName.setEditable(false);
		txt$ResidentName.setBounds(89, 46, 331, 21);
		panel.add(txt$ResidentName);

		residentLabel_1 = new JLabel();
		residentLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentLabel_1.setText("RM#:");
		residentLabel_1.setBounds(426, 49, 41, 14);
		panel.add(residentLabel_1);

		txt$ResidentRmNo = new JTextField();
		txt$ResidentRmNo.setFocusable(false);
		txt$ResidentRmNo.setBackground(Color.WHITE);
		txt$ResidentRmNo.setEditable(false);
		txt$ResidentRmNo.setBounds(473, 46, 106, 21);
		panel.add(txt$ResidentRmNo);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 78, 980, 912);
		add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 100, 912);
		panel_1.add(panel_2);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 100, 28);
		panel_2.add(panel_3);

		dateLabel = new JLabel();
		dateLabel.setFont(new Font("", Font.BOLD, 12));
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel.setBorder(new LineBorder(Color.black, 1, false));
		dateLabel.setText("DATE");
		dateLabel.setBounds(0, 0, 100, 28);
		panel_3.add(dateLabel);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBounds(0, 27, 100, 25);
		panel_2.add(panel_4);

		dcCarePlanDate01 = new JDateChooser();
		dcCarePlanDate01.setDateFormatString("MM/dd/yyyy");
		dcCarePlanDate01.setBounds(2, 2, 96, 21);
		panel_4.add(dcCarePlanDate01);

		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBounds(99, 0, 25, 912);
		panel_1.add(panel_5);

		panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 25, 28);
		panel_5.add(panel_7);

		dateLabel_1 = new JLabel();
		dateLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		dateLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		dateLabel_1.setText("#");
		dateLabel_1.setBounds(0, 0, 25, 28);
		panel_7.add(dateLabel_1);

		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 27, 25, 25);
		panel_5.add(panel_6);

		txtCarePlanNo01 = new JTextField();
		txtCarePlanNo01.setBounds(2, 2, 21, 21);
		panel_6.add(txtCarePlanNo01);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(123, 0, 150, 912);
		panel_1.add(panel_8);

		problemsLabel = new JLabel();
		problemsLabel.setBorder(new LineBorder(Color.black, 1, false));
		problemsLabel.setFont(new Font("", Font.BOLD, 12));
		problemsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		problemsLabel.setText("PROBLEM(s)");
		problemsLabel.setBounds(0, 0, 150, 28);
		panel_8.add(problemsLabel);

		cbProbDecStrength = new JCheckBox();
		cbProbDecStrength.setBackground(Color.WHITE);
		cbProbDecStrength.setText("Decrease in Strength");
		cbProbDecStrength.setBounds(3, 100, 146, 18);
		panel_8.add(cbProbDecStrength);

		cbProbDecRom = new JCheckBox();
		cbProbDecRom.setBackground(Color.WHITE);
		cbProbDecRom.setText("Decrease in ROM");
		cbProbDecRom.setBounds(3, 172, 146, 18);
		panel_8.add(cbProbDecRom);

		cbProbDecBalance = new JCheckBox();
		cbProbDecBalance.setBackground(Color.WHITE);
		cbProbDecBalance.setText("Decrease in Balance");
		cbProbDecBalance.setBounds(3, 244, 146, 18);
		panel_8.add(cbProbDecBalance);

		cbProbDecEndurance = new JCheckBox();
		cbProbDecEndurance.setBackground(Color.WHITE);
		cbProbDecEndurance.setText("Decrease in Endurance");
		cbProbDecEndurance.setBounds(3, 316, 146, 18);
		panel_8.add(cbProbDecEndurance);

		cbProbDecAdl = new JCheckBox();
		cbProbDecAdl.setBackground(Color.WHITE);
		cbProbDecAdl.setBounds(3, 388, 14, 18);
		panel_8.add(cbProbDecAdl);

		cbProbDecMob = new JCheckBox();
		cbProbDecMob.setBackground(Color.WHITE);
		cbProbDecMob.setText("Decrease in Functional Mobility");
		cbProbDecMob.setBounds(3, 460, 14, 18);
		panel_8.add(cbProbDecMob);

		cbProbDecSafetyAware = new JCheckBox();
		cbProbDecSafetyAware.setBackground(Color.WHITE);
		cbProbDecSafetyAware.setBounds(3, 676, 14, 18);
		panel_8.add(cbProbDecSafetyAware);

		decreaseInAbilityTextPane_ = new JTextPane();
		decreaseInAbilityTextPane_.setEditable(false);
		decreaseInAbilityTextPane_.setFocusable(false);
		decreaseInAbilityTextPane_.setMargin(new Insets(0, 0, 0, 0));
		decreaseInAbilityTextPane_
				.setText("Decrease in ability to perform ADL");
		decreaseInAbilityTextPane_.setBounds(18, 386, 130, 28);
		panel_8.add(decreaseInAbilityTextPane_);

		decreaseInFunctionalTextPane = new JTextPane();
		decreaseInFunctionalTextPane.setEditable(false);
		decreaseInFunctionalTextPane.setFocusable(false);
		decreaseInFunctionalTextPane.setMargin(new Insets(0, 0, 0, 0));
		decreaseInFunctionalTextPane.setText("Decrease in Functional Mobility");
		decreaseInFunctionalTextPane.setBounds(18, 460, 130, 28);
		panel_8.add(decreaseInFunctionalTextPane);

		decreaseInSafetyTextPane = new JTextPane();
		decreaseInSafetyTextPane.setMargin(new Insets(0, 0, 0, 0));
		decreaseInSafetyTextPane.setText("Decrease in Safety Awareness");
		decreaseInSafetyTextPane.setBounds(18, 676, 130, 28);
		panel_8.add(decreaseInSafetyTextPane);

		pleaseCheckAppropriateTextPane = new JTextPane();
		pleaseCheckAppropriateTextPane.setMargin(new Insets(0, 0, 0, 0));
		pleaseCheckAppropriateTextPane
				.setText("Please check appropriate problems below:");
		pleaseCheckAppropriateTextPane.setBounds(3, 32, 143, 34);
		panel_8.add(pleaseCheckAppropriateTextPane);

		othersLabel = new JLabel();
		othersLabel.setFont(new Font("", Font.BOLD, 12));
		othersLabel.setText("Others");
		othersLabel.setBounds(55, 725, 39, 14);
		panel_8.add(othersLabel);

		txtProbOther = new JTextArea();
		txtProbOther.setWrapStyleWord(true);
		txtProbOther.setLineWrap(true);
		txtProbOther.setBounds(3, 745, 144, 164);
		panel_8.add(txtProbOther);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(272, 0, 100, 912);
		panel_1.add(panel_9);

		respDiscLabel = new JLabel();
		respDiscLabel.setFont(new Font("", Font.BOLD, 12));
		respDiscLabel.setHorizontalAlignment(SwingConstants.CENTER);
		respDiscLabel.setBorder(new LineBorder(Color.black, 1, false));
		respDiscLabel.setText("RESP. DISC.");
		respDiscLabel.setBounds(0, 0, 100, 28);
		panel_9.add(respDiscLabel);

		otptLabel = new JLabel();
		otptLabel.setHorizontalAlignment(SwingConstants.CENTER);
		otptLabel.setText("OT/PT");
		otptLabel.setBounds(35, 102, 30, 14);
		panel_9.add(otptLabel);

		otptLabel_1 = new JLabel();
		otptLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		otptLabel_1.setText("OT/PT");
		otptLabel_1.setBounds(35, 176, 30, 14);
		panel_9.add(otptLabel_1);

		otptLabel_2 = new JLabel();
		otptLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		otptLabel_2.setText("OT/PT");
		otptLabel_2.setBounds(35, 246, 30, 14);
		panel_9.add(otptLabel_2);

		otptLabel_3 = new JLabel();
		otptLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		otptLabel_3.setText("OT/PT");
		otptLabel_3.setBounds(35, 318, 30, 14);
		panel_9.add(otptLabel_3);

		otptLabel_4 = new JLabel();
		otptLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		otptLabel_4.setText("OT");
		otptLabel_4.setBounds(35, 390, 30, 14);
		panel_9.add(otptLabel_4);

		otptLabel_5 = new JLabel();
		otptLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		otptLabel_5.setText("OT/PT");
		otptLabel_5.setBounds(35, 462, 30, 14);
		panel_9.add(otptLabel_5);

		otptLabel_6 = new JLabel();
		otptLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		otptLabel_6.setText("PT");
		otptLabel_6.setBounds(35, 534, 30, 14);
		panel_9.add(otptLabel_6);

		otptLabel_7 = new JLabel();
		otptLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		otptLabel_7.setText("PT");
		otptLabel_7.setBounds(42, 606, 17, 14);
		panel_9.add(otptLabel_7);

		otptLabel_8 = new JLabel();
		otptLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		otptLabel_8.setText("ALL");
		otptLabel_8.setBounds(42, 678, 17, 14);
		panel_9.add(otptLabel_8);

		panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(371, 0, 200, 912);
		panel_1.add(panel_10);

		goalsLabel = new JLabel();
		goalsLabel.setBorder(new LineBorder(Color.black, 1, false));
		goalsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		goalsLabel.setFont(new Font("", Font.BOLD, 12));
		goalsLabel.setText("GOAL(s)");
		goalsLabel.setBounds(0, 0, 200, 28);
		panel_10.add(goalsLabel);

		pleaseCheckAppropriateTextPane_1 = new JTextPane();
		pleaseCheckAppropriateTextPane_1
				.setText("Please # and complete the goals that are appropriate for patient:");
		pleaseCheckAppropriateTextPane_1.setMargin(new Insets(0, 0, 0, 0));
		pleaseCheckAppropriateTextPane_1.setBounds(3, 32, 194, 34);
		panel_10.add(pleaseCheckAppropriateTextPane_1);

		panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(4, 85, 194, 48);
		panel_10.add(panel_11);

		cbGoalsStrength = new JCheckBox();
		cbGoalsStrength.setBackground(Color.WHITE);
		cbGoalsStrength.setText("New JCheckBox");
		cbGoalsStrength.setBounds(0, 3, 14, 18);
		panel_11.add(cbGoalsStrength);

		toNStrengthLabel = new JLabel();
		toNStrengthLabel.setText("To   in strength of");
		toNStrengthLabel.setBounds(17, 5, 90, 14);
		panel_11.add(toNStrengthLabel);

		panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(31, 0, 7, 20);
		panel_11.add(panel_13);

		label_1 = new JLabel();
		label_1.setBackground(Color.WHITE);
		label_1.setText("^");
		label_1.setBounds(0, 0, 8, 14);
		panel_13.add(label_1);

		label_2 = new JLabel();
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBackground(Color.WHITE);
		label_2.setText("|");
		label_2.setBounds(0, 4, 8, 14);
		panel_13.add(label_2);

		txtGoalsStrengthOf = new JTextField();
		txtGoalsStrengthOf.setBounds(113, 2, 28, 20);
		panel_11.add(txtGoalsStrengthOf);

		ueLabel = new JLabel();
		ueLabel.setText("UE/");
		ueLabel.setBounds(143, 6, 17, 14);
		panel_11.add(ueLabel);

		txtGoalsStrengthUeLe = new JTextField();
		txtGoalsStrengthUeLe.setBounds(166, 2, 28, 20);
		panel_11.add(txtGoalsStrengthUeLe);

		leBy12TextPane = new JTextPane();
		leBy12TextPane.setEditable(false);
		leBy12TextPane.setFocusable(false);
		leBy12TextPane
				.setText("LE by 1/2 to 1 grade to facilitate selfcare and mobility");
		leBy12TextPane.setMargin(new Insets(0, 0, 0, 0));
		leBy12TextPane.setBounds(0, 21, 194, 28);
		panel_11.add(leBy12TextPane);

		panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(3, 165, 194, 36);
		panel_10.add(panel_14);

		decreaseInStrengthCheckBox_8 = new JCheckBox();
		decreaseInStrengthCheckBox_8.setBackground(Color.WHITE);
		decreaseInStrengthCheckBox_8.setText("cbGoalsRom");
		decreaseInStrengthCheckBox_8.setBounds(0, 3, 14, 18);
		panel_14.add(decreaseInStrengthCheckBox_8);

		toNStrengthLabel_1 = new JLabel();
		toNStrengthLabel_1.setText("To    in ROM of");
		toNStrengthLabel_1.setBounds(17, 5, 84, 14);
		panel_14.add(toNStrengthLabel_1);

		panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(31, 0, 7, 20);
		panel_14.add(panel_15);

		label_3 = new JLabel();
		label_3.setBackground(Color.WHITE);
		label_3.setText("^");
		label_3.setBounds(0, 0, 8, 14);
		panel_15.add(label_3);

		label_4 = new JLabel();
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBackground(Color.WHITE);
		label_4.setText("|");
		label_4.setBounds(0, 4, 8, 14);
		panel_15.add(label_4);

		txtGoalsRomOf = new JTextField();
		txtGoalsRomOf.setBounds(104, 2, 28, 20);
		panel_14.add(txtGoalsRomOf);

		ueLabel_1 = new JLabel();
		ueLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		ueLabel_1.setText("by");
		ueLabel_1.setBounds(134, 5, 17, 14);
		panel_14.add(ueLabel_1);

		txtGoalsRomBy = new JTextField();
		txtGoalsRomBy.setBounds(154, 2, 40, 20);
		panel_14.add(txtGoalsRomBy);

		leBy12TextPane_1 = new JTextPane();
		leBy12TextPane_1.setEditable(false);
		leBy12TextPane_1.setFocusable(false);
		leBy12TextPane_1.setText("to facilitate selfcare & mobility");
		leBy12TextPane_1.setMargin(new Insets(0, 0, 0, 0));
		leBy12TextPane_1.setBounds(0, 21, 194, 17);
		panel_14.add(leBy12TextPane_1);

		panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(3, 224, 194, 58);
		panel_10.add(panel_16);

		cbGoalsBalance = new JCheckBox();
		cbGoalsBalance.setBackground(Color.WHITE);
		cbGoalsBalance.setText("New JCheckBox");
		cbGoalsBalance.setBounds(0, 3, 14, 18);
		panel_16.add(cbGoalsBalance);

		toNStrengthLabel_2 = new JLabel();
		toNStrengthLabel_2.setText("To    in sitting/standing balance to");
		toNStrengthLabel_2.setBounds(17, 5, 167, 14);
		panel_16.add(toNStrengthLabel_2);

		panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(31, 0, 7, 20);
		panel_16.add(panel_17);

		label_5 = new JLabel();
		label_5.setBackground(Color.WHITE);
		label_5.setText("^");
		label_5.setBounds(0, 0, 8, 14);
		panel_17.add(label_5);

		label_6 = new JLabel();
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBackground(Color.WHITE);
		label_6.setText("|");
		label_6.setBounds(0, 4, 8, 14);
		panel_17.add(label_6);

		leBy12TextPane_2 = new JTextPane();
		leBy12TextPane_2.setEditable(false);
		leBy12TextPane_2.setFocusable(false);
		leBy12TextPane_2.setText("while performing selfcare & mobility");
		leBy12TextPane_2.setMargin(new Insets(0, 0, 0, 0));
		leBy12TextPane_2.setBounds(0, 41, 194, 17);
		panel_16.add(leBy12TextPane_2);

		txtGoalsBalanceTo = new JTextField();
		txtGoalsBalanceTo.setBounds(0, 21, 64, 20);
		panel_16.add(txtGoalsBalanceTo);

		toImproveInLabel = new JLabel();
		toImproveInLabel.setText("to improve in stability");
		toImproveInLabel.setBounds(70, 24, 102, 14);
		panel_16.add(toImproveInLabel);

		panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(3, 304, 194, 42);
		panel_10.add(panel_18);

		cbGoalsEndurance = new JCheckBox();
		cbGoalsEndurance.setBackground(Color.WHITE);
		cbGoalsEndurance.setText("New JCheckBox");
		cbGoalsEndurance.setBounds(0, 3, 14, 18);
		panel_18.add(cbGoalsEndurance);

		toNStrengthLabel_3 = new JLabel();
		toNStrengthLabel_3.setText("To    endurance for all activies to");
		toNStrengthLabel_3.setBounds(17, 5, 167, 14);
		panel_18.add(toNStrengthLabel_3);

		panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(31, 0, 7, 20);
		panel_18.add(panel_19);

		label_7 = new JLabel();
		label_7.setBackground(Color.WHITE);
		label_7.setText("^");
		label_7.setBounds(0, 0, 8, 14);
		panel_19.add(label_7);

		label_8 = new JLabel();
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBackground(Color.WHITE);
		label_8.setText("|");
		label_8.setBounds(0, 4, 8, 14);
		panel_19.add(label_8);

		txtGoalsEnduranceTo = new JTextField();
		txtGoalsEnduranceTo.setBounds(0, 21, 64, 20);
		panel_18.add(txtGoalsEnduranceTo);

		panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(3, 376, 194, 42);
		panel_10.add(panel_20);

		cbGoalsAdl = new JCheckBox();
		cbGoalsAdl.setBackground(Color.WHITE);
		cbGoalsAdl.setText("New JCheckBox");
		cbGoalsAdl.setBounds(0, 3, 14, 18);
		panel_20.add(cbGoalsAdl);

		toNStrengthLabel_4 = new JLabel();
		toNStrengthLabel_4.setText("Able to perform upper body/lower");
		toNStrengthLabel_4.setBounds(17, 5, 175, 14);
		panel_20.add(toNStrengthLabel_4);

		txtGoalsAdlField = new JTextField();
		txtGoalsAdlField.setBounds(48, 21, 48, 20);
		panel_20.add(txtGoalsAdlField);

		bodyAdlLabel = new JLabel();
		bodyAdlLabel.setText("body ADL");
		bodyAdlLabel.setBounds(0, 24, 46, 14);
		panel_20.add(bodyAdlLabel);

		usingAeAsLabel = new JLabel();
		usingAeAsLabel.setText("using AE as needed");
		usingAeAsLabel.setBounds(98, 24, 94, 14);
		panel_20.add(usingAeAsLabel);

		panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(3, 448, 194, 42);
		panel_10.add(panel_21);

		cbGoalsMob = new JCheckBox();
		cbGoalsMob.setBackground(Color.WHITE);
		cbGoalsMob.setText("New JCheckBox");
		cbGoalsMob.setBounds(0, 3, 14, 18);
		panel_21.add(cbGoalsMob);

		toNStrengthLabel_5 = new JLabel();
		toNStrengthLabel_5.setText("Able to perform functional transfers:");
		toNStrengthLabel_5.setBounds(17, 5, 176, 14);
		panel_21.add(toNStrengthLabel_5);

		txtGoalsMobToilet = new JTextField();
		txtGoalsMobToilet.setBounds(38, 21, 28, 20);
		panel_21.add(txtGoalsMobToilet);

		bodyAdlLabel_1 = new JLabel();
		bodyAdlLabel_1.setText("to toilet");
		bodyAdlLabel_1.setBounds(0, 24, 37, 14);
		panel_21.add(bodyAdlLabel_1);

		usingAeAsLabel_1 = new JLabel();
		usingAeAsLabel_1.setText("from OOB Chair");
		usingAeAsLabel_1.setBounds(67, 24, 75, 14);
		panel_21.add(usingAeAsLabel_1);

		txtGoalsMobChair = new JTextField();
		txtGoalsMobChair.setBounds(142, 21, 52, 20);
		panel_21.add(txtGoalsMobChair);

		panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(3, 520, 194, 42);
		panel_10.add(panel_22);

		cbGoalsAmbulate = new JCheckBox();
		cbGoalsAmbulate.setBackground(Color.WHITE);
		cbGoalsAmbulate.setText("New JCheckBox");
		cbGoalsAmbulate.setBounds(0, 3, 14, 18);
		panel_22.add(cbGoalsAmbulate);

		txtGoalsAmublateIf = new JTextField();
		txtGoalsAmublateIf.setBounds(108, 2, 36, 20);
		panel_22.add(txtGoalsAmublateIf);

		bodyAdlLabel_2 = new JLabel();
		bodyAdlLabel_2.setText("Able to ambulate");
		bodyAdlLabel_2.setBounds(17, 4, 85, 14);
		panel_22.add(bodyAdlLabel_2);

		usingAeAsLabel_2 = new JLabel();
		usingAeAsLabel_2.setText("if using");
		usingAeAsLabel_2.setBounds(150, 5, 34, 14);
		panel_22.add(usingAeAsLabel_2);

		txtGoalsAmbulateUsing = new JTextField();
		txtGoalsAmbulateUsing.setBounds(0, 22, 194, 20);
		panel_22.add(txtGoalsAmbulateUsing);

		panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(3, 592, 194, 42);
		panel_10.add(panel_23);

		decreaseInStrengthCheckBox_14 = new JCheckBox();
		decreaseInStrengthCheckBox_14.setBackground(Color.WHITE);
		decreaseInStrengthCheckBox_14.setText("cbGoalsMobStair");
		decreaseInStrengthCheckBox_14.setBounds(0, 3, 14, 18);
		panel_23.add(decreaseInStrengthCheckBox_14);

		txtGoalsMobStairSteps = new JTextField();
		txtGoalsMobStairSteps.setBounds(88, 2, 28, 20);
		panel_23.add(txtGoalsMobStairSteps);

		bodyAdlLabel_3 = new JLabel();
		bodyAdlLabel_3.setText("Able to go");
		bodyAdlLabel_3.setBounds(17, 4, 49, 14);
		panel_23.add(bodyAdlLabel_3);

		usingAeAsLabel_3 = new JLabel();
		usingAeAsLabel_3.setText("steps stair using");
		usingAeAsLabel_3.setBounds(116, 5, 78, 14);
		panel_23.add(usingAeAsLabel_3);

		txtGoalsMobStairUsing = new JTextField();
		txtGoalsMobStairUsing.setBounds(0, 22, 194, 20);
		panel_23.add(txtGoalsMobStairUsing);

		panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(67, 3, 7, 20);
		panel_23.add(panel_24);

		label_9 = new JLabel();
		label_9.setBackground(Color.WHITE);
		label_9.setText("^");
		label_9.setBounds(0, 0, 8, 14);
		panel_24.add(label_9);

		label_10 = new JLabel();
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBackground(Color.WHITE);
		label_10.setText("|");
		label_10.setBounds(0, 4, 8, 14);
		panel_24.add(label_10);

		panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(75, 3, 7, 20);
		panel_23.add(panel_25);

		label_11 = new JLabel();
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBackground(Color.WHITE);
		label_11.setText("|");
		label_11.setBounds(0, 0, 8, 14);
		panel_25.add(label_11);

		label_12 = new JLabel();
		label_12.setVerticalAlignment(SwingConstants.BOTTOM);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("", Font.PLAIN, 10));
		label_12.setBackground(Color.WHITE);
		label_12.setText("\\/");
		label_12.setBounds(0, 6, 8, 14);
		panel_25.add(label_12);

		panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(3, 655, 194, 60);
		panel_10.add(panel_26);

		cbGoalsSafetyAware = new JCheckBox();
		cbGoalsSafetyAware.setBackground(Color.WHITE);
		cbGoalsSafetyAware.setText("New JCheckBox");
		cbGoalsSafetyAware.setBounds(0, 3, 14, 18);
		panel_26.add(cbGoalsSafetyAware);

		toNStrengthLabel_6 = new JLabel();
		toNStrengthLabel_6.setText("Able to demonstrate safety");
		toNStrengthLabel_6.setBounds(14, 5, 180, 14);
		panel_26.add(toNStrengthLabel_6);

		txtGoalsSafetyAwarePercent = new JTextField();
		txtGoalsSafetyAwarePercent.setBounds(0, 40, 66, 20);
		panel_26.add(txtGoalsSafetyAwarePercent);

		bodyAdlLabel_4 = new JLabel();
		bodyAdlLabel_4.setText("awareness during functional mobility");
		bodyAdlLabel_4.setBounds(0, 24, 194, 14);
		panel_26.add(bodyAdlLabel_4);

		usingAeAsLabel_4 = new JLabel();
		usingAeAsLabel_4.setText("% of time");
		usingAeAsLabel_4.setBounds(72, 43, 48, 14);
		panel_26.add(usingAeAsLabel_4);

		othersLabel_1 = new JLabel();
		othersLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		othersLabel_1.setText("Others");
		othersLabel_1.setBounds(80, 725, 39, 14);
		panel_10.add(othersLabel_1);

		txtGoalsOther = new JTextArea();
		txtGoalsOther.setWrapStyleWord(true);
		txtGoalsOther.setLineWrap(true);
		txtGoalsOther.setBounds(3, 745, 194, 164);
		panel_10.add(txtGoalsOther);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setBounds(570, 0, 96, 912);
		panel_1.add(panel_12);

		targDateLabel = new JLabel();
		targDateLabel.setBorder(new LineBorder(Color.black, 1, false));
		targDateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		targDateLabel.setFont(new Font("", Font.BOLD, 12));
		targDateLabel.setText("TARG. DATE");
		targDateLabel.setBounds(0, 0, 96, 28);
		panel_12.add(targDateLabel);

		panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBounds(0, 27, 96, 25);
		panel_12.add(panel_28);

		dcTargDate01 = new JDateChooser();
		dcTargDate01.setDateFormatString("MM/dd/yyyy");
		dcTargDate01.setBounds(2, 2, 92, 21);
		panel_28.add(dcTargDate01);

		panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setBackground(Color.WHITE);
		panel_27.setLayout(null);
		panel_27.setBounds(665, 0, 150, 912);
		panel_1.add(panel_27);

		interventionsLabel = new JLabel();
		interventionsLabel.setBorder(new LineBorder(Color.black, 1, false));
		interventionsLabel.setFont(new Font("", Font.BOLD, 12));
		interventionsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		interventionsLabel.setText("INTERVENTIONS");
		interventionsLabel.setBounds(0, 0, 150, 28);
		panel_27.add(interventionsLabel);

		pleaseCheckAppropriateTextPane_2 = new JTextPane();
		pleaseCheckAppropriateTextPane_2
				.setText("Please check appropriate interventions below:");
		pleaseCheckAppropriateTextPane_2.setMargin(new Insets(0, 0, 0, 0));
		pleaseCheckAppropriateTextPane_2.setBounds(3, 32, 144, 28);
		panel_27.add(pleaseCheckAppropriateTextPane_2);

		cbInterTherapeutic = new JCheckBox();
		cbInterTherapeutic.setBackground(Color.WHITE);
		cbInterTherapeutic.setText("Therapeutic Exercise/");
		cbInterTherapeutic.setBounds(3, 92, 144, 18);
		panel_27.add(cbInterTherapeutic);

		activitiesLabel = new JLabel();
		activitiesLabel.setText("Activities");
		activitiesLabel.setBounds(3, 110, 54, 14);
		panel_27.add(activitiesLabel);

		cbInterBalance = new JCheckBox();
		cbInterBalance.setBackground(Color.WHITE);
		cbInterBalance.setText("Balance Training");
		cbInterBalance.setBounds(3, 152, 96, 18);
		panel_27.add(cbInterBalance);

		cbInterEndurance = new JCheckBox();
		cbInterEndurance.setBackground(Color.WHITE);
		cbInterEndurance.setText("Endurance Training");
		cbInterEndurance.setBounds(3, 199, 110, 18);
		panel_27.add(cbInterEndurance);

		cbInterAdl = new JCheckBox();
		cbInterAdl.setBackground(Color.WHITE);
		cbInterAdl.setText("ADL Training");
		cbInterAdl.setBounds(3, 250, 94, 18);
		panel_27.add(cbInterAdl);

		cbInterTransfer = new JCheckBox();
		cbInterTransfer.setBackground(Color.WHITE);
		cbInterTransfer.setText("Transfer Training");
		cbInterTransfer.setBounds(3, 310, 110, 18);
		panel_27.add(cbInterTransfer);

		cbInterGait = new JCheckBox();
		cbInterGait.setBackground(Color.WHITE);
		cbInterGait.setText("Gait Training");
		cbInterGait.setBounds(3, 360, 94, 18);
		panel_27.add(cbInterGait);

		cbInterStairs = new JCheckBox();
		cbInterStairs.setBackground(Color.WHITE);
		cbInterStairs.setText("Stairs Training");
		cbInterStairs.setBounds(3, 412, 94, 18);
		panel_27.add(cbInterStairs);

		cbInterPatientCaregiver = new JCheckBox();
		cbInterPatientCaregiver.setBackground(Color.WHITE);
		cbInterPatientCaregiver.setText("Patient/Caregiver Safety");
		cbInterPatientCaregiver.setBounds(3, 466, 144, 18);
		panel_27.add(cbInterPatientCaregiver);

		awarenessAndEduLabel = new JLabel();
		awarenessAndEduLabel.setText("Awareness and Edu.");
		awarenessAndEduLabel.setBounds(3, 484, 99, 14);
		panel_27.add(awarenessAndEduLabel);

		cbInterEquipmentNeeds = new JCheckBox();
		cbInterEquipmentNeeds.setBackground(Color.WHITE);
		cbInterEquipmentNeeds.setText("Equipment Needs");
		cbInterEquipmentNeeds.setBounds(3, 532, 110, 18);
		panel_27.add(cbInterEquipmentNeeds);

		cbInterPosturalEdu = new JCheckBox();
		cbInterPosturalEdu.setBackground(Color.WHITE);
		cbInterPosturalEdu.setText("Postural Edu.");
		cbInterPosturalEdu.setBounds(3, 587, 94, 18);
		panel_27.add(cbInterPosturalEdu);

		cbInterDischarge = new JCheckBox();
		cbInterDischarge.setBackground(Color.WHITE);
		cbInterDischarge.setText("Discharge Planning");
		cbInterDischarge.setBounds(3, 654, 137, 18);
		panel_27.add(cbInterDischarge);

		othersLabel_2 = new JLabel();
		othersLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		othersLabel_2.setText("Others");
		othersLabel_2.setBounds(55, 725, 39, 14);
		panel_27.add(othersLabel_2);

		txtInterOther = new JTextArea();
		txtInterOther.setWrapStyleWord(true);
		txtInterOther.setLineWrap(true);
		txtInterOther.setBounds(3, 745, 144, 164);
		panel_27.add(txtInterOther);

		panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_29.setBackground(Color.WHITE);
		panel_29.setLayout(null);
		panel_29.setBounds(814, 0, 125, 912);
		panel_1.add(panel_29);

		outcomesLabel = new JLabel();
		outcomesLabel.setBorder(new LineBorder(Color.black, 1, false));
		outcomesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		outcomesLabel.setFont(new Font("", Font.BOLD, 12));
		outcomesLabel.setText("OUTCOMES");
		outcomesLabel.setBounds(0, 0, 125, 28);
		panel_29.add(outcomesLabel);

		panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(Color.black, 1, false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(0, 27, 125, 25);
		panel_29.add(panel_31);

		txtOutcomes01 = new JTextField();
		txtOutcomes01.setBounds(2, 2, 121, 21);
		panel_31.add(txtOutcomes01);

		panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(Color.black, 1, false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(938, 0, 42, 912);
		panel_1.add(panel_32);

		outcomesLabel_1 = new JLabel();
		outcomesLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		outcomesLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		outcomesLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		outcomesLabel_1.setBounds(0, 0, 42, 28);
		panel_32.add(outcomesLabel_1);

		panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(Color.black, 1, false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(0, 27, 42, 25);
		panel_32.add(panel_33);

		txtOutField01 = new JTextField();
		txtOutField01.setBounds(2, 2, 38, 21);
		panel_33.add(txtOutField01);
	}

	public void doSave() {

		PtOtStRehabCarePlan refPtOtStRehabCarePlan = new PtOtStRehabCarePlan();
		refPtOtStRehabCarePlan.setResidentId(Global.currentResidenceKey);

		refPtOtStRehabCarePlan.setInterOther(txtInterOther.getText());
		refPtOtStRehabCarePlan.setGoalsOther(txtGoalsOther.getText());
		refPtOtStRehabCarePlan.setProbOther(txtProbOther.getText());
		refPtOtStRehabCarePlan.setOutField01(txtOutField01.getText());
		refPtOtStRehabCarePlan.setOutcomes01(txtOutcomes01.getText());
		refPtOtStRehabCarePlan.setInterDischarge(cbInterDischarge.isSelected());
		refPtOtStRehabCarePlan.setInterPosturalEdu(cbInterPosturalEdu
				.isSelected());
		refPtOtStRehabCarePlan.setInterEquipmentNeeds(cbInterEquipmentNeeds
				.isSelected());
		refPtOtStRehabCarePlan.setInterPatientCaregiver(cbInterPatientCaregiver
				.isSelected());
		refPtOtStRehabCarePlan.setInterStairs(cbInterStairs.isSelected());
		refPtOtStRehabCarePlan.setInterGait(cbInterGait.isSelected());
		refPtOtStRehabCarePlan.setInterTransfer(cbInterTransfer.isSelected());
		refPtOtStRehabCarePlan.setInterAdl(cbInterAdl.isSelected());
		refPtOtStRehabCarePlan.setInterEndurance(cbInterEndurance.isSelected());
		refPtOtStRehabCarePlan.setInterBalance(cbInterBalance.isSelected());
		refPtOtStRehabCarePlan.setInterTherapeutic(cbInterTherapeutic
				.isSelected());
		refPtOtStRehabCarePlan.setTargDate01(dcTargDate01.getDate());
		refPtOtStRehabCarePlan
				.setGoalsSafetyAwarePercent(txtGoalsSafetyAwarePercent
						.getText());
		refPtOtStRehabCarePlan.setGoalsSafetyAware(cbGoalsSafetyAware
				.isSelected());
		refPtOtStRehabCarePlan.setGoalsMobStairUsing(txtGoalsMobStairUsing
				.getText());
		refPtOtStRehabCarePlan.setGoalsMobStairSteps(txtGoalsMobStairSteps
				.getText());
		refPtOtStRehabCarePlan.setGoalsAmbulateUsing(txtGoalsAmbulateUsing
				.getText());
		refPtOtStRehabCarePlan.setGoalsAmublateIf(txtGoalsAmublateIf.getText());
		refPtOtStRehabCarePlan.setGoalsAmbulate(cbGoalsAmbulate.isSelected());
		refPtOtStRehabCarePlan.setGoalsMobChair(txtGoalsMobChair.getText());
		refPtOtStRehabCarePlan.setGoalsMobToilet(txtGoalsMobToilet.getText());
		refPtOtStRehabCarePlan.setGoalsMob(cbGoalsMob.isSelected());
		refPtOtStRehabCarePlan.setGoalsAdlField(txtGoalsAdlField.getText());
		refPtOtStRehabCarePlan.setGoalsAdl(cbGoalsAdl.isSelected());
		refPtOtStRehabCarePlan.setGoalsEnduranceTo(txtGoalsEnduranceTo
				.getText());
		refPtOtStRehabCarePlan.setGoalsEndurance(cbGoalsEndurance.isSelected());
		refPtOtStRehabCarePlan.setGoalsBalanceTo(txtGoalsBalanceTo.getText());
		refPtOtStRehabCarePlan.setGoalsBalance(cbGoalsBalance.isSelected());
		refPtOtStRehabCarePlan.setGoalsRomBy(txtGoalsRomBy.getText());
		refPtOtStRehabCarePlan.setGoalsRomOf(txtGoalsRomOf.getText());
		refPtOtStRehabCarePlan.setGoalsStrengthUeLe(txtGoalsStrengthUeLe
				.getText());
		refPtOtStRehabCarePlan.setGoalsStrengthOf(txtGoalsStrengthOf.getText());
		refPtOtStRehabCarePlan.setGoalsStrength(cbGoalsStrength.isSelected());
		refPtOtStRehabCarePlan.setProbDecSafetyAware(cbProbDecSafetyAware
				.isSelected());
		refPtOtStRehabCarePlan.setProbDecMob(cbProbDecMob.isSelected());
		refPtOtStRehabCarePlan.setProbDecAdl(cbProbDecAdl.isSelected());
		refPtOtStRehabCarePlan.setProbDecEndurance(cbProbDecEndurance
				.isSelected());
		refPtOtStRehabCarePlan.setProbDecBalance(cbProbDecBalance.isSelected());
		refPtOtStRehabCarePlan.setProbDecRom(cbProbDecRom.isSelected());
		refPtOtStRehabCarePlan.setProbDecStrength(cbProbDecStrength
				.isSelected());
		refPtOtStRehabCarePlan.setCarePlanNo01(txtCarePlanNo01.getText());
		refPtOtStRehabCarePlan.setCarePlanDate01(dcCarePlanDate01.getDate());

		try {
			Global.currentPtOtStRehabCarePlanKey = MedrexClientManager
					.getInstance().insertOrUpdatePtOtStRehabCarePlan(
							refPtOtStRehabCarePlan);
		} catch (Exception e) {
		}
	}

	public void updateData() {
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txt$ResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txt$ResidentRmNo.setText(rm.getRoom());
		} catch (Exception e) {

		}
		PtOtStRehabCarePlan refPtOtStRehabCarePlan = null;

		if (Global.currentPtOtStRehabCarePlanKey != 0) {
			try {
				refPtOtStRehabCarePlan = MedrexClientManager.getInstance()
						.getPtOtStRehabCarePlan(
								Global.currentPtOtStRehabCarePlanKey);
			} catch (Exception e) {

			}
			txtInterOther.setText(refPtOtStRehabCarePlan.getInterOther());
			txtGoalsOther.setText(refPtOtStRehabCarePlan.getGoalsOther());
			txtProbOther.setText(refPtOtStRehabCarePlan.getProbOther());
			txtOutField01.setText(refPtOtStRehabCarePlan.getOutField01());
			txtOutcomes01.setText(refPtOtStRehabCarePlan.getOutcomes01());
			cbInterDischarge.setSelected(refPtOtStRehabCarePlan
					.isInterDischarge());
			cbInterPosturalEdu.setSelected(refPtOtStRehabCarePlan
					.isInterPosturalEdu());
			cbInterEquipmentNeeds.setSelected(refPtOtStRehabCarePlan
					.isInterEquipmentNeeds());
			cbInterPatientCaregiver.setSelected(refPtOtStRehabCarePlan
					.isInterPatientCaregiver());
			cbInterStairs.setSelected(refPtOtStRehabCarePlan.isInterStairs());
			cbInterGait.setSelected(refPtOtStRehabCarePlan.isInterGait());
			cbInterTransfer.setSelected(refPtOtStRehabCarePlan
					.isInterTransfer());
			cbInterAdl.setSelected(refPtOtStRehabCarePlan.isInterAdl());
			cbInterEndurance.setSelected(refPtOtStRehabCarePlan
					.isInterEndurance());
			cbInterBalance.setSelected(refPtOtStRehabCarePlan.isInterBalance());
			cbInterTherapeutic.setSelected(refPtOtStRehabCarePlan
					.isInterTherapeutic());
			dcTargDate01.setDate(refPtOtStRehabCarePlan.getTargDate01());
			txtGoalsSafetyAwarePercent.setText(refPtOtStRehabCarePlan
					.getGoalsSafetyAwarePercent());
			cbGoalsSafetyAware.setSelected(refPtOtStRehabCarePlan
					.isGoalsSafetyAware());
			txtGoalsMobStairUsing.setText(refPtOtStRehabCarePlan
					.getGoalsMobStairUsing());
			txtGoalsMobStairSteps.setText(refPtOtStRehabCarePlan
					.getGoalsMobStairSteps());
			txtGoalsAmbulateUsing.setText(refPtOtStRehabCarePlan
					.getGoalsAmbulateUsing());
			txtGoalsAmublateIf.setText(refPtOtStRehabCarePlan
					.getGoalsAmublateIf());
			cbGoalsAmbulate.setSelected(refPtOtStRehabCarePlan
					.isGoalsAmbulate());
			txtGoalsMobChair.setText(refPtOtStRehabCarePlan.getGoalsMobChair());
			txtGoalsMobToilet.setText(refPtOtStRehabCarePlan
					.getGoalsMobToilet());
			cbGoalsMob.setSelected(refPtOtStRehabCarePlan.isGoalsMob());
			txtGoalsAdlField.setText(refPtOtStRehabCarePlan.getGoalsAdlField());
			cbGoalsAdl.setSelected(refPtOtStRehabCarePlan.isGoalsAdl());
			txtGoalsEnduranceTo.setText(refPtOtStRehabCarePlan
					.getGoalsEnduranceTo());
			cbGoalsEndurance.setSelected(refPtOtStRehabCarePlan
					.isGoalsEndurance());
			txtGoalsBalanceTo.setText(refPtOtStRehabCarePlan
					.getGoalsBalanceTo());
			cbGoalsBalance.setSelected(refPtOtStRehabCarePlan.isGoalsBalance());
			txtGoalsRomBy.setText(refPtOtStRehabCarePlan.getGoalsRomBy());
			txtGoalsRomOf.setText(refPtOtStRehabCarePlan.getGoalsRomOf());
			txtGoalsStrengthUeLe.setText(refPtOtStRehabCarePlan
					.getGoalsStrengthUeLe());
			txtGoalsStrengthOf.setText(refPtOtStRehabCarePlan
					.getGoalsStrengthOf());
			cbGoalsStrength.setSelected(refPtOtStRehabCarePlan
					.isGoalsStrength());
			cbProbDecSafetyAware.setSelected(refPtOtStRehabCarePlan
					.isProbDecSafetyAware());
			cbProbDecMob.setSelected(refPtOtStRehabCarePlan.isProbDecMob());
			cbProbDecAdl.setSelected(refPtOtStRehabCarePlan.isProbDecAdl());
			cbProbDecEndurance.setSelected(refPtOtStRehabCarePlan
					.isProbDecEndurance());
			cbProbDecBalance.setSelected(refPtOtStRehabCarePlan
					.isProbDecBalance());
			cbProbDecRom.setSelected(refPtOtStRehabCarePlan.isProbDecRom());
			cbProbDecStrength.setSelected(refPtOtStRehabCarePlan
					.isProbDecStrength());
			txtCarePlanNo01.setText(refPtOtStRehabCarePlan.getCarePlanNo01());
			dcCarePlanDate01
					.setDate(refPtOtStRehabCarePlan.getCarePlanDate01());
		}
	}
}
