package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.ResidentCarePlan;

import com.toedter.calendar.JDateChooser;

public class PanelCarePlan extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1650512441746245743L;
	private JDateChooser dcNextAppointment;
	private JDateChooser dcUpdatedDate;
	private JTextField txtCarePlanPreparedBy;
	private JTextField txtDischargePlan;
	private JTextField txtOverAllGoal;
	private JCheckBox cbPoorPotential;
	private JCheckBox cbFairPotential;
	private JCheckBox cbGoodPtential;
	private JTextField txtStrengths;
	private JTextField txtDiagnosis;
	private JTextField txtDiet;
	private JTextField txtAllergies;
	private JTextField txtOthers;
	private JCheckBox cbOthers;
	private JCheckBox cbHearingAid;
	private JCheckBox cbProstheresis;
	private JCheckBox cbDentures;
	private JCheckBox cbGlasses;
	private JTextField txtCatheterSize;
	private JTextField txtRoutineLabWork;
	private JTextField txtImmunizationType4;
	private JTextField txtImmunizationType3;
	private JTextField txtImmunizationType2;
	private JTextField txtImmunizationType1;
	private JTextField txtTbScreeningResult;
	private JCheckBox cbChestXray;
	private JCheckBox cbMantoux;
	private JTextArea txtElimination;
	private JTextArea txtBathing;
	private JTextArea txtSkinCondition;
	private JTextArea txtOralCare;
	private JTextArea txtDressing;
	private JTextArea txtGrooming;
	private JTextArea txtMobility;
	private JTextArea txtEatingHabits;
	private JTextArea txtSpeechHearing;
	private JTextArea txtMentalStatus;
	private JTextArea txtRestraints;
	private JTextArea txtTheraples;
	private JTextArea txtActivityInterest;
	private JTextArea txtPrivileges;
	private JDateChooser dcDateChanged;
	private JDateChooser dcImmunizationType4;
	private JDateChooser dcImmunizationType3;
	private JDateChooser dcImmunizationType2;
	private JDateChooser dcTbScreeningDate;
	private JDateChooser dcImmunizationType1;

	public PanelCarePlan() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(930, 1450));

		final JLabel carePlanLabel = new JLabel();
		carePlanLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		carePlanLabel.setText("CARE PLAN");
		carePlanLabel.setBounds(481, 21, 136, 23);
		add(carePlanLabel);

		final JLabel componentsLabel = new JLabel();
		componentsLabel.setText("Components");
		componentsLabel.setBounds(35, 68, 83, 14);
		add(componentsLabel);

		final JLabel componentsLabel_1 = new JLabel();
		componentsLabel_1.setText("Elimination(Bowel and Bladder)");
		componentsLabel_1.setBounds(35, 88, 168, 14);
		add(componentsLabel_1);

		final JLabel componentsLabel_1_1 = new JLabel();
		componentsLabel_1_1.setText("Bathing");
		componentsLabel_1_1.setBounds(35, 151, 36, 14);
		add(componentsLabel_1_1);

		final JLabel componentsLabel_1_1_1 = new JLabel();
		componentsLabel_1_1_1.setText("Skin Condition");
		componentsLabel_1_1_1.setBounds(35, 225, 76, 14);
		add(componentsLabel_1_1_1);

		final JLabel componentsLabel_1_1_1_1 = new JLabel();
		componentsLabel_1_1_1_1.setText("Oral Care");
		componentsLabel_1_1_1_1.setBounds(35, 292, 98, 14);
		add(componentsLabel_1_1_1_1);

		final JLabel componentsLabel_1_1_1_1_1 = new JLabel();
		componentsLabel_1_1_1_1_1.setText("Dressing");
		componentsLabel_1_1_1_1_1.setBounds(35, 362, 98, 14);
		add(componentsLabel_1_1_1_1_1);

		final JLabel componentsLabel_1_1_1_1_1_1 = new JLabel();
		componentsLabel_1_1_1_1_1_1.setText("Grooming (Hair, Nails, Beard)");
		componentsLabel_1_1_1_1_1_1.setBounds(35, 432, 146, 14);
		add(componentsLabel_1_1_1_1_1_1);

		final JLabel mobilityLocomotionDexterityLabel = new JLabel();
		mobilityLocomotionDexterityLabel
				.setText("Mobility, Locomotion, Dexterity (Paralysis, ROM, WeightBearing) ");
		mobilityLocomotionDexterityLabel.setBounds(35, 502, 418, 14);
		add(mobilityLocomotionDexterityLabel);

		final JLabel componentsLabel_1_1_1_1_1_2 = new JLabel();
		componentsLabel_1_1_1_1_1_2.setText("Eating Habits");
		componentsLabel_1_1_1_1_1_2.setBounds(35, 572, 181, 14);
		add(componentsLabel_1_1_1_1_1_2);

		final JLabel componentsLabel_1_1_1_1_1_2_1 = new JLabel();
		componentsLabel_1_1_1_1_1_2_1.setText("Speech, Hearing, Sight");
		componentsLabel_1_1_1_1_1_2_1.setBounds(35, 642, 168, 14);
		add(componentsLabel_1_1_1_1_1_2_1);

		final JLabel componentsLabel_1_1_1_1_1_2_1_1 = new JLabel();
		componentsLabel_1_1_1_1_1_2_1_1
				.setText("Mental Status , Behavior, Orientation");
		componentsLabel_1_1_1_1_1_2_1_1.setBounds(35, 712, 213, 14);
		add(componentsLabel_1_1_1_1_1_2_1_1);

		final JLabel componentsLabel_1_1_1_1_1_2_1_1_1 = new JLabel();
		componentsLabel_1_1_1_1_1_2_1_1_1
				.setText("Restraints, Siderails, Braces, Supportive or Special Equipment");
		componentsLabel_1_1_1_1_1_2_1_1_1.setBounds(35, 779, 576, 14);
		add(componentsLabel_1_1_1_1_1_2_1_1_1);

		final JLabel componentsLabel_1_1_1_1_1_2_1_1_2 = new JLabel();
		componentsLabel_1_1_1_1_1_2_1_1_2.setText("Theraples");
		componentsLabel_1_1_1_1_1_2_1_1_2.setBounds(35, 849, 76, 14);
		add(componentsLabel_1_1_1_1_1_2_1_1_2);

		final JLabel activityInterestLabel = new JLabel();
		activityInterestLabel.setText("Activity Interest");
		activityInterestLabel.setBounds(35, 918, 98, 14);
		add(activityInterestLabel);

		final JLabel privilegesLabel = new JLabel();
		privilegesLabel.setText("Privileges");
		privilegesLabel.setBounds(35, 988, 181, 14);
		add(privilegesLabel);

		final JLabel privilegesLabel_1 = new JLabel();
		privilegesLabel_1.setText("T.B. Screening");
		privilegesLabel_1.setBounds(35, 1066, 83, 14);
		add(privilegesLabel_1);

		cbMantoux = new JCheckBox();
		cbMantoux.setBackground(Color.WHITE);
		cbMantoux.setText("Mantoux");
		cbMantoux.setBounds(124, 1066, 63, 14);
		add(cbMantoux);

		cbChestXray = new JCheckBox();
		cbChestXray.setBackground(Color.WHITE);
		cbChestXray.setText("Chest X-Ray");
		cbChestXray.setBounds(195, 1066, 91, 14);
		add(cbChestXray);

		final JLabel privilegesLabel_2 = new JLabel();
		privilegesLabel_2.setText("Date");
		privilegesLabel_2.setBounds(292, 1066, 36, 14);
		add(privilegesLabel_2);

		final JLabel privilegesLabel_3 = new JLabel();
		privilegesLabel_3.setText("Result");
		privilegesLabel_3.setBounds(454, 1066, 36, 14);
		add(privilegesLabel_3);

		final JLabel privilegesLabel_4 = new JLabel();
		privilegesLabel_4.setText("Immunizations:   Type");
		privilegesLabel_4.setBounds(35, 1086, 112, 14);
		add(privilegesLabel_4);

		txtImmunizationType1 = new JTextField();
		txtImmunizationType1.setBounds(153, 1086, 51, 18);
		add(txtImmunizationType1);

		final JLabel privilegesLabel_2_1 = new JLabel();
		privilegesLabel_2_1.setText("Date");
		privilegesLabel_2_1.setBounds(222, 1086, 23, 14);
		add(privilegesLabel_2_1);

		dcImmunizationType1 = new JDateChooser();
		dcImmunizationType1.setBounds(251, 1086, 63, 20);
		add(dcImmunizationType1);

		txtTbScreeningResult = new JTextField();
		txtTbScreeningResult.setBounds(516, 1064, 393, 18);
		add(txtTbScreeningResult);

		dcTbScreeningDate = new JDateChooser();
		dcTbScreeningDate.setBounds(333, 1064, 66, 20);
		add(dcTbScreeningDate);

		final JLabel privilegesLabel_6 = new JLabel();
		privilegesLabel_6.setText("Routine Lab Work");
		privilegesLabel_6.setBounds(35, 1118, 98, 14);
		add(privilegesLabel_6);

		final JLabel privilegesLabel_5_1 = new JLabel();
		privilegesLabel_5_1.setText("Type");
		privilegesLabel_5_1.setBounds(320, 1086, 36, 14);
		add(privilegesLabel_5_1);

		txtImmunizationType2 = new JTextField();
		txtImmunizationType2.setBounds(355, 1087, 51, 18);
		add(txtImmunizationType2);

		final JLabel privilegesLabel_2_1_1 = new JLabel();
		privilegesLabel_2_1_1.setText("Date");
		privilegesLabel_2_1_1.setBounds(412, 1087, 36, 14);
		add(privilegesLabel_2_1_1);

		dcImmunizationType2 = new JDateChooser();
		dcImmunizationType2.setBounds(444, 1087, 63, 19);
		add(dcImmunizationType2);

		final JLabel privilegesLabel_5_1_1 = new JLabel();
		privilegesLabel_5_1_1.setText("Type");
		privilegesLabel_5_1_1.setBounds(516, 1086, 36, 14);
		add(privilegesLabel_5_1_1);

		txtImmunizationType3 = new JTextField();
		txtImmunizationType3.setBounds(543, 1087, 51, 18);
		add(txtImmunizationType3);

		final JLabel privilegesLabel_2_1_1_1 = new JLabel();
		privilegesLabel_2_1_1_1.setText("Date");
		privilegesLabel_2_1_1_1.setBounds(600, 1086, 36, 14);
		add(privilegesLabel_2_1_1_1);

		dcImmunizationType3 = new JDateChooser();
		dcImmunizationType3.setBounds(642, 1086, 63, 20);
		add(dcImmunizationType3);

		final JLabel privilegesLabel_5_1_1_1 = new JLabel();
		privilegesLabel_5_1_1_1.setText("Type");
		privilegesLabel_5_1_1_1.setBounds(711, 1086, 36, 14);
		add(privilegesLabel_5_1_1_1);

		dcImmunizationType4 = new JDateChooser();
		dcImmunizationType4.setBounds(844, 1087, 63, 20);
		add(dcImmunizationType4);

		txtImmunizationType4 = new JTextField();
		txtImmunizationType4.setBounds(747, 1087, 51, 18);
		add(txtImmunizationType4);

		final JLabel privilegesLabel_2_1_1_1_1 = new JLabel();
		privilegesLabel_2_1_1_1_1.setText("Date");
		privilegesLabel_2_1_1_1_1.setBounds(804, 1086, 36, 14);
		add(privilegesLabel_2_1_1_1_1);

		txtRoutineLabWork = new JTextField();
		txtRoutineLabWork.setBounds(138, 1116, 771, 18);
		add(txtRoutineLabWork);

		final JLabel privilegesLabel_6_1 = new JLabel();
		privilegesLabel_6_1.setText("Catheter Size");
		privilegesLabel_6_1.setBounds(35, 1150, 76, 14);
		add(privilegesLabel_6_1);

		txtCatheterSize = new JTextField();
		txtCatheterSize.setBounds(137, 1148, 63, 18);
		add(txtCatheterSize);

		final JLabel privilegesLabel_6_1_1 = new JLabel();
		privilegesLabel_6_1_1.setText("Date Changed");
		privilegesLabel_6_1_1.setBounds(209, 1150, 77, 14);
		add(privilegesLabel_6_1_1);

		dcDateChanged = new JDateChooser();
		dcDateChanged.setBounds(292, 1150, 118, 20);
		add(dcDateChanged);

		final JLabel privilegesLabel_6_1_2 = new JLabel();
		privilegesLabel_6_1_2.setText("Artificial Aids");
		privilegesLabel_6_1_2.setBounds(416, 1150, 63, 14);
		add(privilegesLabel_6_1_2);

		cbGlasses = new JCheckBox();
		cbGlasses.setBackground(Color.WHITE);
		cbGlasses.setText("Glassess");
		cbGlasses.setBounds(486, 1146, 63, 22);
		add(cbGlasses);

		cbDentures = new JCheckBox();
		cbDentures.setBackground(Color.WHITE);
		cbDentures.setText("Dentures");
		cbDentures.setBounds(554, 1146, 63, 22);
		add(cbDentures);

		cbProstheresis = new JCheckBox();
		cbProstheresis.setBackground(Color.WHITE);
		cbProstheresis.setText("Prosthesis");
		cbProstheresis.setBounds(627, 1146, 70, 22);
		add(cbProstheresis);

		cbHearingAid = new JCheckBox();
		cbHearingAid.setBackground(Color.WHITE);
		cbHearingAid.setText("Hearing Aid");
		cbHearingAid.setBounds(699, 1146, 76, 22);
		add(cbHearingAid);

		cbOthers = new JCheckBox();
		cbOthers.setBackground(Color.WHITE);
		cbOthers.setText("Other");
		cbOthers.setBounds(780, 1146, 51, 22);
		add(cbOthers);

		txtOthers = new JTextField();
		txtOthers.setBorder(new LineBorder(Color.black, 1, false));
		txtOthers.setBounds(841, 1148, 68, 18);
		add(txtOthers);

		final JLabel privilegesLabel_6_1_3 = new JLabel();
		privilegesLabel_6_1_3.setText("Allergies");
		privilegesLabel_6_1_3.setBounds(35, 1185, 51, 14);
		add(privilegesLabel_6_1_3);

		txtAllergies = new JTextField();
		txtAllergies.setBounds(139, 1183, 267, 18);
		add(txtAllergies);

		final JLabel privilegesLabel_6_2 = new JLabel();
		privilegesLabel_6_2.setText("Diet");
		privilegesLabel_6_2.setBounds(454, 1185, 36, 14);
		add(privilegesLabel_6_2);

		txtDiet = new JTextField();
		txtDiet.setBounds(516, 1183, 393, 18);
		add(txtDiet);

		final JLabel privilegesLabel_6_1_3_1 = new JLabel();
		privilegesLabel_6_1_3_1.setText("Diagnosis");
		privilegesLabel_6_1_3_1.setBounds(35, 1217, 76, 14);
		add(privilegesLabel_6_1_3_1);

		txtDiagnosis = new JTextField();
		txtDiagnosis.setBounds(139, 1217, 771, 71);
		add(txtDiagnosis);

		final JLabel privilegesLabel_6_1_3_1_1 = new JLabel();
		privilegesLabel_6_1_3_1_1.setText("Strengths");
		privilegesLabel_6_1_3_1_1.setBounds(35, 1305, 76, 14);
		add(privilegesLabel_6_1_3_1_1);

		txtStrengths = new JTextField();
		txtStrengths.setBounds(139, 1305, 335, 18);
		add(txtStrengths);

		final JLabel privilegesLabel_6_1_3_1_1_1 = new JLabel();
		privilegesLabel_6_1_3_1_1_1.setText("Rehab. Potential");
		privilegesLabel_6_1_3_1_1_1.setBounds(486, 1305, 91, 14);
		add(privilegesLabel_6_1_3_1_1_1);

		cbGoodPtential = new JCheckBox();
		cbGoodPtential.setBackground(Color.WHITE);
		cbGoodPtential.setText("Good");
		cbGoodPtential.setBounds(575, 1305, 51, 14);
		add(cbGoodPtential);

		cbFairPotential = new JCheckBox();
		cbFairPotential.setBackground(Color.WHITE);
		cbFairPotential.setText("Fair");
		cbFairPotential.setBounds(648, 1305, 63, 14);
		add(cbFairPotential);

		cbPoorPotential = new JCheckBox();
		cbPoorPotential.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		cbPoorPotential.setBackground(Color.WHITE);
		cbPoorPotential.setText("Poor");
		cbPoorPotential.setBounds(717, 1305, 118, 14);
		add(cbPoorPotential);

		final JLabel privilegesLabel_6_1_3_1_1_2 = new JLabel();
		privilegesLabel_6_1_3_1_1_2.setText("Overall Goal");
		privilegesLabel_6_1_3_1_1_2.setBounds(35, 1334, 76, 14);
		add(privilegesLabel_6_1_3_1_1_2);

		txtOverAllGoal = new JTextField();
		txtOverAllGoal.setBounds(139, 1334, 771, 18);
		add(txtOverAllGoal);

		final JLabel privilegesLabel_6_1_3_1_1_2_1 = new JLabel();
		privilegesLabel_6_1_3_1_1_2_1.setText("Discharge Plan");
		privilegesLabel_6_1_3_1_1_2_1.setBounds(35, 1369, 76, 14);
		add(privilegesLabel_6_1_3_1_1_2_1);

		txtDischargePlan = new JTextField();
		txtDischargePlan.setBounds(140, 1367, 769, 18);
		add(txtDischargePlan);

		final JLabel privilegesLabel_6_1_3_1_1_2_1_1 = new JLabel();
		privilegesLabel_6_1_3_1_1_2_1_1
				.setText("Care Plan prepared By (Signature)");
		privilegesLabel_6_1_3_1_1_2_1_1.setBounds(29, 1401, 198, 14);
		add(privilegesLabel_6_1_3_1_1_2_1_1);

		txtCarePlanPreparedBy = new JTextField();
		txtCarePlanPreparedBy.setBounds(253, 1399, 98, 18);
		add(txtCarePlanPreparedBy);

		final JLabel privilegesLabel_6_1_3_1_1_2_1_1_1 = new JLabel();
		privilegesLabel_6_1_3_1_1_2_1_1_1.setText("Updated(Date)");
		privilegesLabel_6_1_3_1_1_2_1_1_1.setBounds(380, 1401, 76, 14);
		add(privilegesLabel_6_1_3_1_1_2_1_1_1);

		dcUpdatedDate = new JDateChooser();
		dcUpdatedDate.setBounds(462, 1399, 168, 18);
		add(dcUpdatedDate);

		final JLabel privilegesLabel_6_1_3_1_1_2_1_1_1_1 = new JLabel();
		privilegesLabel_6_1_3_1_1_2_1_1_1_1.setText("Next Clinic Appt");
		privilegesLabel_6_1_3_1_1_2_1_1_1_1.setBounds(662, 1401, 91, 14);
		add(privilegesLabel_6_1_3_1_1_2_1_1_1_1);

		dcNextAppointment = new JDateChooser();
		dcNextAppointment.setBounds(747, 1399, 162, 18);
		add(dcNextAppointment);

		txtElimination = new JTextArea();
		txtElimination.setBorder(new LineBorder(Color.black, 1, false));
		txtElimination.setBounds(35, 108, 1074, 37);
		add(txtElimination);

		JScrollPane pane1 = new JScrollPane();
		pane1.setBounds(35, 108, 877, 37);
		pane1.setViewportView(txtElimination);
		add(pane1);

		txtBathing = new JTextArea();
		txtBathing.setBorder(new LineBorder(Color.black, 1, false));
		txtBathing.setBounds(35, 175, 1074, 44);
		add(txtBathing);

		JScrollPane pane2 = new JScrollPane();
		pane2.setBounds(35, 175, 877, 44);
		pane2.setViewportView(txtBathing);
		add(pane2);

		txtSkinCondition = new JTextArea();
		txtSkinCondition.setBorder(new LineBorder(Color.black, 1, false));
		txtSkinCondition.setBounds(35, 242, 1074, 44);
		add(txtSkinCondition);

		JScrollPane pane3 = new JScrollPane();
		pane3.setBounds(35, 242, 877, 44);
		pane3.setViewportView(txtSkinCondition);
		add(pane3);

		txtOralCare = new JTextArea();
		txtOralCare.setBorder(new LineBorder(Color.black, 1, false));
		txtOralCare.setBounds(35, 312, 1074, 44);
		add(txtOralCare);

		JScrollPane pane4 = new JScrollPane();
		pane4.setBounds(35, 312, 877, 44);
		pane4.setViewportView(txtOralCare);
		add(pane4);
		txtDressing = new JTextArea();
		txtDressing.setBorder(new LineBorder(Color.black, 1, false));
		txtDressing.setBounds(35, 382, 1074, 44);
		add(txtDressing);

		JScrollPane pane5 = new JScrollPane();
		pane5.setBounds(35, 382, 877, 44);
		pane5.setViewportView(txtDressing);

		txtGrooming = new JTextArea();
		txtGrooming.setBorder(new LineBorder(Color.black, 1, false));
		txtGrooming.setBounds(35, 452, 1074, 44);
		add(txtGrooming);
		add(pane5);
		JScrollPane pane6 = new JScrollPane();
		pane6.setBounds(35, 452, 877, 44);
		pane6.setViewportView(txtGrooming);
		add(pane6);
		txtMobility = new JTextArea();
		txtMobility.setBorder(new LineBorder(Color.black, 1, false));
		txtMobility.setBounds(35, 522, 1074, 44);
		add(txtMobility);

		JScrollPane pane7 = new JScrollPane();
		pane7.setBounds(35, 522, 877, 44);
		pane7.setViewportView(txtMobility);
		add(pane7);
		txtEatingHabits = new JTextArea();
		txtEatingHabits.setBorder(new LineBorder(Color.black, 1, false));
		txtEatingHabits.setBounds(35, 592, 1074, 44);
		add(txtEatingHabits);

		JScrollPane pane8 = new JScrollPane();
		pane8.setBounds(35, 592, 877, 44);
		pane8.setViewportView(txtEatingHabits);
		add(pane8);
		txtSpeechHearing = new JTextArea();
		txtSpeechHearing.setBorder(new LineBorder(Color.black, 1, false));
		txtSpeechHearing.setBounds(35, 662, 1074, 44);
		add(txtSpeechHearing);

		JScrollPane pane9 = new JScrollPane();
		pane9.setBounds(35, 662, 877, 44);
		pane9.setViewportView(txtSpeechHearing);
		add(pane9);
		txtMentalStatus = new JTextArea();
		txtMentalStatus.setBorder(new LineBorder(Color.black, 1, false));
		txtMentalStatus.setBounds(35, 729, 1074, 44);
		add(txtMentalStatus);

		JScrollPane pane10 = new JScrollPane();
		pane10.setBounds(35, 729, 877, 44);
		pane10.setViewportView(txtMentalStatus);
		add(pane10);
		txtRestraints = new JTextArea();
		txtRestraints.setBorder(new LineBorder(Color.black, 1, false));
		txtRestraints.setBounds(35, 799, 1074, 44);
		add(txtRestraints);

		JScrollPane pane11 = new JScrollPane();
		pane11.setBounds(35, 799, 877, 44);
		pane11.setViewportView(txtRestraints);
		add(pane11);
		txtTheraples = new JTextArea();
		txtTheraples.setBorder(new LineBorder(Color.black, 1, false));
		txtTheraples.setBounds(35, 868, 1074, 44);
		add(txtTheraples);

		JScrollPane pane12 = new JScrollPane();
		pane12.setBounds(35, 868, 877, 44);
		pane12.setViewportView(txtTheraples);
		add(pane12);
		txtActivityInterest = new JTextArea();
		txtActivityInterest.setBorder(new LineBorder(Color.black, 1, false));
		txtActivityInterest.setBounds(35, 938, 1074, 44);
		add(txtActivityInterest);

		JScrollPane pane13 = new JScrollPane();
		pane13.setBounds(35, 938, 877, 44);
		pane13.setViewportView(txtActivityInterest);
		add(pane13);
		txtPrivileges = new JTextArea();
		txtPrivileges.setBorder(new LineBorder(Color.black, 1, false));
		txtPrivileges.setBounds(35, 1008, 1072, 44);
		add(txtPrivileges);

		JScrollPane pane14 = new JScrollPane();
		pane14.setBounds(35, 1008, 877, 44);
		pane14.setViewportView(txtPrivileges);
		add(pane14);
		doUpdate();
	}

	public void doLoad() {

	}

	public int doSave() {

		ResidentCarePlan refResidentCarePlan = new ResidentCarePlan();
		refResidentCarePlan.setResidentId(Global.currentResidenceKey);
		refResidentCarePlan.setSerial(Global.currentResidentCarePlanFormKey);
		refResidentCarePlan.setFormId(Global.currentMsjnKey);
		refResidentCarePlan.setNextAppointment(dcNextAppointment.getDate());
		refResidentCarePlan.setUpdatedDate(dcUpdatedDate.getDate());
		refResidentCarePlan.setCarePlanPreparedBy(txtCarePlanPreparedBy
				.getText());
		refResidentCarePlan.setDischargePlan(txtDischargePlan.getText());
		refResidentCarePlan.setOverAllGoal(txtOverAllGoal.getText());
		refResidentCarePlan.setPoorPotential(cbPoorPotential.isSelected());
		refResidentCarePlan.setFairPotential(cbFairPotential.isSelected());
		refResidentCarePlan.setGoodPtential(cbGoodPtential.isSelected());
		refResidentCarePlan.setStrengths(txtStrengths.getText());
		refResidentCarePlan.setDiagnosis(txtDiagnosis.getText());
		refResidentCarePlan.setDiet(txtDiet.getText());
		refResidentCarePlan.setAllergies(txtAllergies.getText());
		refResidentCarePlan.setOthersValue(txtOthers.getText());
		refResidentCarePlan.setOthers(cbOthers.isSelected());
		refResidentCarePlan.setHearingAid(cbHearingAid.isSelected());
		refResidentCarePlan.setProstheresis(cbProstheresis.isSelected());
		refResidentCarePlan.setDentures(cbDentures.isSelected());
		refResidentCarePlan.setGlasses(cbGlasses.isSelected());
		refResidentCarePlan.setCatheterSize(txtCatheterSize.getText());
		refResidentCarePlan.setRoutineLabWork(txtRoutineLabWork.getText());
		refResidentCarePlan
				.setImmunizationType4(txtImmunizationType4.getText());
		refResidentCarePlan
				.setImmunizationType3(txtImmunizationType3.getText());
		refResidentCarePlan
				.setImmunizationType2(txtImmunizationType2.getText());
		refResidentCarePlan
				.setImmunizationType1(txtImmunizationType1.getText());
		refResidentCarePlan
				.setTbScreeningResult(txtTbScreeningResult.getText());
		refResidentCarePlan.setChestXray(cbChestXray.isSelected());
		refResidentCarePlan.setMantoux(cbMantoux.isSelected());
		refResidentCarePlan.setElimination(txtElimination.getText());
		refResidentCarePlan.setBathing(txtBathing.getText());
		refResidentCarePlan.setSkinCondition(txtSkinCondition.getText());
		refResidentCarePlan.setOralCare(txtOralCare.getText());
		refResidentCarePlan.setDressing(txtDressing.getText());
		refResidentCarePlan.setGrooming(txtGrooming.getText());
		refResidentCarePlan.setMobility(txtMobility.getText());
		refResidentCarePlan.setEatingHabits(txtEatingHabits.getText());
		refResidentCarePlan.setSpeechHearing(txtSpeechHearing.getText());
		refResidentCarePlan.setMentalStatus(txtMentalStatus.getText());
		refResidentCarePlan.setRestraints(txtRestraints.getText());
		refResidentCarePlan.setTheraples(txtTheraples.getText());
		refResidentCarePlan.setActivityInterest(txtActivityInterest.getText());
		refResidentCarePlan.setPrivileges(txtPrivileges.getText());
		refResidentCarePlan.setDateChanged(dcDateChanged.getDate());
		refResidentCarePlan.setImmunizationType4Date(dcImmunizationType4
				.getDate());
		refResidentCarePlan.setImmunizationType3Date(dcImmunizationType3
				.getDate());
		refResidentCarePlan.setImmunizationType2Date(dcImmunizationType2
				.getDate());
		refResidentCarePlan.setTbScreeningDate(dcTbScreeningDate.getDate());
		refResidentCarePlan.setImmunizationType1Date(dcImmunizationType1
				.getDate());

		try {
			Global.currentResidentCarePlanFormKey = MedrexClientManager
					.getInstance().insertOrUpdateResidentCarePlan(
							refResidentCarePlan);
		} catch (Exception e) {
		}
		return Global.currentResidentCarePlanFormKey;
	}

	public void doUpdate() {

		ResidentCarePlan refResidentCarePlan = null;
		if (Global.currentMsjnKey != 0) {
			try {
				refResidentCarePlan = MedrexClientManager.getInstance()
						.getResidentCarePlan(Global.currentMsjnKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Global.currentResidentCarePlanFormKey = refResidentCarePlan
					.getSerial();
			dcNextAppointment.setDate(refResidentCarePlan.getNextAppointment());
			dcUpdatedDate.setDate(refResidentCarePlan.getUpdatedDate());
			txtCarePlanPreparedBy.setText(refResidentCarePlan
					.getCarePlanPreparedBy());
			txtDischargePlan.setText(refResidentCarePlan.getDischargePlan());
			txtOverAllGoal.setText(refResidentCarePlan.getOverAllGoal());
			cbPoorPotential.setSelected(refResidentCarePlan.isPoorPotential());
			cbFairPotential.setSelected(refResidentCarePlan.isFairPotential());
			cbGoodPtential.setSelected(refResidentCarePlan.isGoodPtential());
			txtStrengths.setText(refResidentCarePlan.getStrengths());
			txtDiagnosis.setText(refResidentCarePlan.getDiagnosis());
			txtDiet.setText(refResidentCarePlan.getDiet());
			txtAllergies.setText(refResidentCarePlan.getAllergies());
			txtOthers.setText(refResidentCarePlan.getOthersValue());
			cbOthers.setSelected(refResidentCarePlan.isOthers());
			cbHearingAid.setSelected(refResidentCarePlan.isHearingAid());
			cbProstheresis.setSelected(refResidentCarePlan.isProstheresis());
			cbDentures.setSelected(refResidentCarePlan.isDentures());
			cbGlasses.setSelected(refResidentCarePlan.isGlasses());
			txtCatheterSize.setText(refResidentCarePlan.getCatheterSize());
			txtRoutineLabWork.setText(refResidentCarePlan.getRoutineLabWork());
			txtImmunizationType4.setText(refResidentCarePlan
					.getImmunizationType4());
			txtImmunizationType3.setText(refResidentCarePlan
					.getImmunizationType3());
			txtImmunizationType2.setText(refResidentCarePlan
					.getImmunizationType2());
			txtImmunizationType1.setText(refResidentCarePlan
					.getImmunizationType1());
			txtTbScreeningResult.setText(refResidentCarePlan
					.getTbScreeningResult());
			cbChestXray.setSelected(refResidentCarePlan.isChestXray());
			cbMantoux.setSelected(refResidentCarePlan.isMantoux());
			txtElimination.setText(refResidentCarePlan.getElimination());
			txtBathing.setText(refResidentCarePlan.getBathing());
			txtSkinCondition.setText(refResidentCarePlan.getSkinCondition());
			txtOralCare.setText(refResidentCarePlan.getOralCare());
			txtDressing.setText(refResidentCarePlan.getDressing());
			txtGrooming.setText(refResidentCarePlan.getGrooming());
			txtMobility.setText(refResidentCarePlan.getMobility());
			txtEatingHabits.setText(refResidentCarePlan.getEatingHabits());
			txtSpeechHearing.setText(refResidentCarePlan.getSpeechHearing());
			txtMentalStatus.setText(refResidentCarePlan.getMentalStatus());
			txtRestraints.setText(refResidentCarePlan.getRestraints());
			txtTheraples.setText(refResidentCarePlan.getTheraples());
			txtActivityInterest.setText(refResidentCarePlan
					.getActivityInterest());
			txtPrivileges.setText(refResidentCarePlan.getPrivileges());
			dcDateChanged.setDate(refResidentCarePlan.getDateChanged());
			dcImmunizationType4.setDate(refResidentCarePlan
					.getImmunizationType4Date());
			dcImmunizationType3.setDate(refResidentCarePlan
					.getImmunizationType3Date());
			dcImmunizationType2.setDate(refResidentCarePlan
					.getImmunizationType2Date());
			dcTbScreeningDate.setDate(refResidentCarePlan.getTbScreeningDate());
			dcImmunizationType1.setDate(refResidentCarePlan
					.getImmunizationType1Date());
		}

	}

	public boolean doValidate() {

		return true;
	}
	/*
	 * public static void main(String ar[]){ JScrollPane scroll = new
	 * JScrollPane(); scroll.setBackground(Color.RED);
	 * 
	 * JFrame frm = new JFrame(); PanelCarePlan row = new PanelCarePlan();
	 * frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * scroll.setViewportView(row); frm.getContentPane().add(scroll);
	 * frm.setSize(new Dimension(900,700)); frm.setVisible(true);
	 * 
	 * }
	 */

}
