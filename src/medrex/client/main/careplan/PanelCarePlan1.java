package medrex.client.main.careplan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.carePlan.CarePlanRecord;

import com.toedter.calendar.JDateChooser;

public class PanelCarePlan1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final Color DEF_COLOR = null;

	private JDateChooser date;
	private JList list;
	private JTextArea textArea;
	private JTextArea textArea_1;

	public PanelCarePlan1() {
		super();
		setBackground(Color.WHITE);
		Global.panelCarePaln1 = this;
		setPreferredSize(new Dimension(900, 580));
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 0, 419, 575);
		add(panel);

		final JLabel carePlanLabel = new JLabel();
		carePlanLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		carePlanLabel.setHorizontalAlignment(SwingConstants.CENTER);
		carePlanLabel.setForeground(SystemColor.desktop);
		carePlanLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		carePlanLabel.setText("CARE PLAN");
		carePlanLabel.setBounds(61, 10, 297, 14);
		panel.add(carePlanLabel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setForeground(SystemColor.desktop);
		dateLabel.setFont(new Font("", Font.BOLD, 12));
		dateLabel.setText("DATE");
		dateLabel.setBounds(42, 41, 31, 14);
		panel.add(dateLabel);

		date = new JDateChooser();
		date.setDateFormatString("MM/dd/yyyy");
		date.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		date.setBounds(113, 39, 124, 21);
		panel.add(date);

		final JLabel rapLabel = new JLabel();
		rapLabel.setForeground(SystemColor.desktop);
		rapLabel.setFont(new Font("", Font.BOLD, 12));
		rapLabel.setText("RAP");
		rapLabel.setBounds(42, 86, 31, 14);
		panel.add(rapLabel);

		final JLabel problemLabel = new JLabel();
		problemLabel.setForeground(SystemColor.desktop);
		problemLabel.setFont(new Font("", Font.BOLD, 12));
		problemLabel.setText("PROBLEM");
		problemLabel.setBounds(42, 348, 57, 14);
		panel.add(problemLabel);

		final JLabel goalsLabel = new JLabel();
		goalsLabel.setForeground(SystemColor.desktop);
		goalsLabel.setFont(new Font("", Font.BOLD, 12));
		goalsLabel.setText("GOALS");
		goalsLabel.setBounds(42, 500, 42, 14);
		panel.add(goalsLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 84, 270, 196);
		panel.add(scrollPane);

		list = new JList();
		scrollPane.setViewportView(list);
		list.setForeground(SystemColor.desktop);
		list.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		list.setModel(new DefaultComboBoxModel(new String[] { "DELIRIUM",
				"COGNITIVE LOSS", "VISUAL FUNCTION", "COMMUNICATION",
				"ADL FUNCTION / REHABILITATION POTENTIAL",
				"URINARY INCONTINENCE AND INDWELLING CATHETER",
				"PSYCHOSOCIAL WELL-BEING", "MOOD STATE", "BEHAVIORAL SYMPTOMS",
				"ACTIVITIES", "FALLS", "NUTRITIONAL STATUS", "FEEDING TUBES",
				"DEHYDRATIONA / FLUID MAINTENANCE", "DENTAL CARE",
				"PRESSURE ULCERS", "PSYCHOTROPIC DRUG USE",
				"PHYSICAL RESTRAINTS" }));

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(113, 290, 270, 134);
		panel.add(scrollPane_1);

		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setForeground(SystemColor.desktop);
		textArea.setBorder(new LineBorder(SystemColor.desktop, 1, false));

		final JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(113, 440, 270, 134);
		panel.add(scrollPane_2);

		textArea_1 = new JTextArea();
		textArea_1.setForeground(SystemColor.desktop);
		scrollPane_2.setViewportView(textArea_1);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setBorder(new LineBorder(SystemColor.desktop, 1, false));

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				CarePlanRecord carePlanRecord = new CarePlanRecord();

				carePlanRecord.setSerial(Global.currentCarePalnRecordKey);

				carePlanRecord.setResidentId(Global.currentResidenceKey);

				carePlanRecord.setCarePlanDate(date.getDate());
				carePlanRecord.setProblem(textArea.getText());
				carePlanRecord.setGoals(textArea_1.getText());

				Object obj[] = list.getSelectedValues();

				for (int i = 0; i < obj.length; i++) {
					if (obj[i].equals("DELIRIUM")) {
						carePlanRecord.setDelirium(true);
					}
					if (obj[i].equals("COGNITIVE LOSS")) {
						carePlanRecord.setCogitiveLoss(true);
					}
					if (obj[i].equals("VISUAL FUNCTION")) {
						carePlanRecord.setVisualFunction(true);
					}
					if (obj[i].equals("COMMUNICATION")) {
						carePlanRecord.setCommunication(true);
					}
					if (obj[i]
							.equals("ADL FUNCTION / REHABILITATION POTENTIAL")) {
						carePlanRecord
								.setAdlFuncationRehabitationPotential(true);
					}
					if (obj[i]
							.equals("URINARY INCONTINENCE AND INDWELLING CATHETER")) {
						carePlanRecord
								.setUninaryIncontinenceAndIndwellingCatheter(true);
					}
					if (obj[i].equals("PSYCHOSOCIAL WELL-BEING")) {
						carePlanRecord.setPsychosocialWellBeing(true);
					}
					if (obj[i].equals("MOOD STATE")) {
						carePlanRecord.setMoodState(true);
					}
					if (obj[i].equals("BEHAVIORAL SYMPTOMS")) {
						carePlanRecord.setBehavioralSymptoms(true);
					}
					if (obj[i].equals("ACTIVITIES")) {
						carePlanRecord.setActivities(true);
					}
					if (obj[i].equals("FALLS")) {
						carePlanRecord.setFalls(true);
					}
					if (obj[i].equals("NUTRITIONAL STATUS")) {
						carePlanRecord.setNutritionalStatus(true);
					}
					if (obj[i].equals("FEEDING TUBES")) {
						carePlanRecord.setFeedingTubes(true);
					}
					if (obj[i].equals("DEHYDRATIONA / FLUID MAINTENANCE")) {
						carePlanRecord.setDehydrationaFluidMaintenance(true);
					}
					if (obj[i].equals("DENTAL CARE")) {
						carePlanRecord.setDentalCare(true);
					}
					if (obj[i].equals("PRESSURE ULCERS")) {
						carePlanRecord.setPressureUlcers(true);
					}
					if (obj[i].equals("PSYCHOTROPIC DRUG USE")) {
						carePlanRecord.setPsychotropicDrugUse(true);
					}
					if (obj[i].equals("PHYSICAL RESTRAINTS")) {
						carePlanRecord.setPhysicalRestraints(true);
					}
				}

				FrameCarePlanGoalsTip fcpgt = new FrameCarePlanGoalsTip(
						carePlanRecord);
				fcpgt.setModal(true);
				fcpgt.setVisible(true);

			}
		});
		button.setText("New JButton");
		button.setBounds(389, 558, 24, 14);
		panel.add(button);

		updateData();

	}

	public void doSave() {

		CarePlanRecord carePlanRecord = new CarePlanRecord();

		carePlanRecord.setSerial(Global.currentCarePalnRecordKey);
		carePlanRecord.setResidentId(Global.currentResidenceKey);

		carePlanRecord.setCarePlanDate(date.getDate());
		carePlanRecord.setProblem(textArea.getText());
		carePlanRecord.setGoals(textArea_1.getText());
		carePlanRecord.setSubmittedUser(Global.currentLoggedInUserName);

		Object obj[] = list.getSelectedValues();

		for (int i = 0; i < obj.length; i++) {
			if (obj[i].equals("DELIRIUM")) {
				carePlanRecord.setDelirium(true);
			}
			if (obj[i].equals("COGNITIVE LOSS")) {
				carePlanRecord.setCogitiveLoss(true);
			}
			if (obj[i].equals("VISUAL FUNCTION")) {
				carePlanRecord.setVisualFunction(true);
			}
			if (obj[i].equals("COMMUNICATION")) {
				carePlanRecord.setCommunication(true);
			}
			if (obj[i].equals("ADL FUNCTION / REHABILITATION POTENTIAL")) {
				carePlanRecord.setAdlFuncationRehabitationPotential(true);
			}
			if (obj[i].equals("URINARY INCONTINENCE AND INDWELLING CATHETER")) {
				carePlanRecord
						.setUninaryIncontinenceAndIndwellingCatheter(true);
			}
			if (obj[i].equals("PSYCHOSOCIAL WELL-BEING")) {
				carePlanRecord.setPsychosocialWellBeing(true);
			}
			if (obj[i].equals("MOOD STATE")) {
				carePlanRecord.setMoodState(true);
			}
			if (obj[i].equals("BEHAVIORAL SYMPTOMS")) {
				carePlanRecord.setBehavioralSymptoms(true);
			}
			if (obj[i].equals("ACTIVITIES")) {
				carePlanRecord.setActivities(true);
			}
			if (obj[i].equals("FALLS")) {
				carePlanRecord.setFalls(true);
			}
			if (obj[i].equals("NUTRITIONAL STATUS")) {
				carePlanRecord.setNutritionalStatus(true);
			}
			if (obj[i].equals("FEEDING TUBES")) {
				carePlanRecord.setFeedingTubes(true);
			}
			if (obj[i].equals("DEHYDRATIONA / FLUID MAINTENANCE")) {
				carePlanRecord.setDehydrationaFluidMaintenance(true);
			}
			if (obj[i].equals("DENTAL CARE")) {
				carePlanRecord.setDentalCare(true);
			}
			if (obj[i].equals("PRESSURE ULCERS")) {
				carePlanRecord.setPressureUlcers(true);
			}
			if (obj[i].equals("PSYCHOTROPIC DRUG USE")) {
				carePlanRecord.setPsychotropicDrugUse(true);
			}
			if (obj[i].equals("PHYSICAL RESTRAINTS")) {
				carePlanRecord.setPhysicalRestraints(true);
			}

		}

		try {
			Global.currentCarePalnRecordKey = MedrexClientManager.getInstance()
					.insertOrUpdateCarePlanRecord(carePlanRecord);
		} catch (Exception e) {
		}

	}

	public void updateData() {
		CarePlanRecord carePlanRecord = null;

		if (Global.currentCarePalnRecordKey != 0) {
			try {
				carePlanRecord = MedrexClientManager.getInstance()
						.getCarePlanRecord(Global.currentCarePalnRecordKey);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (carePlanRecord != null) {

			date.setDate(carePlanRecord.getCarePlanDate());

			List<Integer> selectList = new ArrayList<Integer>();

			if (carePlanRecord.isDelirium()) {
				selectList.add(0);
			}

			if (carePlanRecord.isCogitiveLoss()) {
				selectList.add(1);
			}
			if (carePlanRecord.isVisualFunction()) {
				selectList.add(2);
			}
			if (carePlanRecord.isCommunication()) {
				selectList.add(3);
			}
			if (carePlanRecord.isAdlFuncationRehabitationPotential()) {
				selectList.add(4);
			}
			if (carePlanRecord.isUninaryIncontinenceAndIndwellingCatheter()) {
				selectList.add(5);
			}
			if (carePlanRecord.isPsychosocialWellBeing()) {
				selectList.add(6);
			}
			if (carePlanRecord.isMoodState()) {
				selectList.add(7);
			}
			if (carePlanRecord.isBehavioralSymptoms()) {
				selectList.add(8);
			}
			if (carePlanRecord.isActivities()) {
				selectList.add(9);
			}
			if (carePlanRecord.isFalls()) {
				selectList.add(10);
			}
			if (carePlanRecord.isNutritionalStatus()) {
				selectList.add(11);
			}
			if (carePlanRecord.isFeedingTubes()) {
				selectList.add(12);
			}
			if (carePlanRecord.isDehydrationaFluidMaintenance()) {
				selectList.add(13);
			}
			if (carePlanRecord.isDentalCare()) {
				selectList.add(14);
			}
			if (carePlanRecord.isPressureUlcers()) {
				selectList.add(15);
			}
			if (carePlanRecord.isPsychotropicDrugUse()) {
				selectList.add(16);
			}
			if (carePlanRecord.isPhysicalRestraints()) {
				selectList.add(17);
			}
			int indices[] = new int[selectList.size()];
			for (int i = 0; i < selectList.size(); i++) {
				indices[i] = selectList.get(i);
			}
			list.setSelectedIndices(indices);

			textArea.setText(carePlanRecord.getProblem());
			textArea_1.setText(carePlanRecord.getGoals());
		}

	}

}
