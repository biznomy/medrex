package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.Form;

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page9 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7283962187814281794L;

	public PanelMDS3Page9() {
		super();
		setPreferredSize(new Dimension(840, 820));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setHgap(0);
		setLayout(flowLayout_6);
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(840, 40));
		add(panel);

		final JLabel residentLabel = new JLabel();
		residentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel.setText("Resident");
		residentLabel.setBounds(10, 9, 56, 16);
		panel.add(residentLabel);

		final JTextField textField = new JTextField();
		textField.setBounds(84, 8, 248, 20);
		panel.add(textField);

		final JLabel residentLabel_1 = new JLabel();
		residentLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1.setText("Identifier");
		residentLabel_1.setBounds(354, 10, 56, 16);
		panel.add(residentLabel_1);

		final JTextField textField_1 = new JTextField();
		textField_1.setBounds(429, 8, 213, 20);
		panel.add(textField_1);

		final JLabel residentLabel_1_1 = new JLabel();
		residentLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1_1.setText("Date");
		residentLabel_1_1.setBounds(668, 10, 56, 16);
		panel.add(residentLabel_1_1);

		final JDateChooser dcDate = new JDateChooser();
		dcDate.setBackground(Color.WHITE);
		dcDate.setBounds(730, 8, 100, 22);
		panel.add(dcDate);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(840, 25));
		add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(2);
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.setLayout(flowLayout_1);
		panel_3.setBounds(3, 3, 231, 18);
		panel_2.add(panel_3);

		final JLabel sectionALabel = new JLabel();
		sectionALabel.setForeground(Color.WHITE);
		sectionALabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectionALabel.setText("Section D");
		panel_3.add(sectionALabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(246, 2, 592, 21);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 16));
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Mood");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 580));
		add(panel_1_1);

		final JPanel panel_11 = new JPanel();
		panel_11.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_11.setLayout(null);
		panel_11.setBounds(0, 0, 840, 580);
		panel_1_1.add(panel_11);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setBounds(10, 68, 820, 185);
		panel_11.add(panel_7_1);
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setLayout(null);

		final JLabel ifSymptomIsLabel = new JLabel();
		ifSymptomIsLabel
				.setText("If symptom is present, enter 1(yes) in column 1, Symptom Presence.");
		ifSymptomIsLabel.setBounds(23, 10, 770, 14);
		panel_7_1.add(ifSymptomIsLabel);

		final JLabel readAndShowLabel = new JLabel();
		readAndShowLabel
				.setText("Then move to the column 2, Symptom Frequency , and indicate Symptom Frequency.");
		readAndShowLabel.setBounds(23, 30, 435, 14);
		panel_7_1.add(readAndShowLabel);

		final JLabel label = new JLabel();
		label.setText("1. Symptom Presence");
		label.setBounds(23, 62, 156, 14);
		panel_7_1.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("0. No(enter 0 in column 2)");
		label_1.setBounds(33, 82, 138, 14);
		panel_7_1.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("1. Yes(enter 0-3 in column 2)");
		label_2.setBounds(33, 102, 166, 14);
		panel_7_1.add(label_2);

		final JLabel label_4 = new JLabel();
		label_4.setText("2. Symptom Frequency");
		label_4.setBounds(265, 62, 224, 14);
		panel_7_1.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setText("0. Never or 1 day");
		label_5.setBounds(297, 82, 233, 14);
		panel_7_1.add(label_5);

		final JLabel label_6 = new JLabel();
		label_6.setText("1. 2 - 6 days(several days)");
		label_6.setBounds(297, 102, 156, 14);
		panel_7_1.add(label_6);

		final JLabel label_7 = new JLabel();
		label_7.setText("2. 7-11 days(half or more of the days)");
		label_7.setBounds(297, 122, 233, 14);
		panel_7_1.add(label_7);

		final JLabel label_8 = new JLabel();
		label_8.setText("3. 12- 14 days(nearly every day)");
		label_8.setBounds(297, 142, 247, 14);
		panel_7_1.add(label_8);

		final JPanel panel_6_1 = new JPanel();
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(10);
		panel_6_1.setLayout(flowLayout_2);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1.setBounds(624, 86, 99, 72);
		panel_7_1.add(panel_6_1);

		final JLabel label_4_1 = new JLabel();
		label_4_1.setText("<html><center><b>1.<br>Symptom <br>Presence");
		panel_6_1.add(label_4_1);

		final JPanel panel_6_2 = new JPanel();
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(10);
		panel_6_2.setLayout(flowLayout_3);
		panel_6_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(722, 86, 98, 72);
		panel_7_1.add(panel_6_2);

		final JLabel label_4_1_1 = new JLabel();
		label_4_1_1.setText("<html><center><b>2.<br>Symptom <br>Frequency");
		panel_6_2.add(label_4_1_1);

		final JLabel enterScoreInLabel = new JLabel();
		enterScoreInLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enterScoreInLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		enterScoreInLabel.setBorder(new LineBorder(Color.black, 1, false));
		enterScoreInLabel.setText("    Enter Score in Boxes");
		enterScoreInLabel.setBounds(624, 157, 196, 28);
		panel_7_1.add(enterScoreInLabel);

		final JPanel panel_12 = new JPanel();
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_12.setLayout(flowLayout_5);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBounds(10, 252, 625, 25);
		panel_11.add(panel_12);

		final JLabel aLittleInterestLabel = new JLabel();
		aLittleInterestLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel
				.setText("A. Little interest or pleasure in doing things");
		panel_12.add(aLittleInterestLabel);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBounds(634, 252, 104, 246);
		panel_11.add(panel_6_1_1);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_1.setBounds(21, 5, 50, 18);
		comboBox_1.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(comboBox_1);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_2.setPreferredSize(new Dimension(50, 20));
		comboBox_2.setBounds(21, 30, 50, 18);
		panel_6_1_1.add(comboBox_2);

		final JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_2_1.setBackground(Color.WHITE);
		comboBox_2_1.setPreferredSize(new Dimension(50, 20));
		comboBox_2_1.setBounds(21, 54, 50, 18);
		panel_6_1_1.add(comboBox_2_1);

		final JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_2_2.setBackground(Color.WHITE);
		comboBox_2_2.setPreferredSize(new Dimension(50, 20));
		comboBox_2_2.setBounds(21, 78, 50, 18);
		panel_6_1_1.add(comboBox_2_2);

		final JComboBox comboBox_2_3 = new JComboBox();
		comboBox_2_3.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_2_3.setBackground(Color.WHITE);
		comboBox_2_3.setPreferredSize(new Dimension(50, 20));
		comboBox_2_3.setBounds(21, 102, 50, 18);
		panel_6_1_1.add(comboBox_2_3);

		final JComboBox comboBox_2_4 = new JComboBox();
		comboBox_2_4.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_2_4.setBackground(Color.WHITE);
		comboBox_2_4.setPreferredSize(new Dimension(50, 20));
		comboBox_2_4.setBounds(21, 126, 50, 18);
		panel_6_1_1.add(comboBox_2_4);

		final JComboBox comboBox_2_4_1 = new JComboBox();
		comboBox_2_4_1.setModel(new DefaultComboBoxModel(new String[] { "",
				"0", "1" }));
		comboBox_2_4_1.setBackground(Color.WHITE);
		comboBox_2_4_1.setPreferredSize(new Dimension(50, 20));
		comboBox_2_4_1.setBounds(21, 150, 50, 18);
		panel_6_1_1.add(comboBox_2_4_1);

		final JComboBox comboBox_2_4_2 = new JComboBox();
		comboBox_2_4_2.setModel(new DefaultComboBoxModel(new String[] { "",
				"0", "1" }));
		comboBox_2_4_2.setBackground(Color.WHITE);
		comboBox_2_4_2.setPreferredSize(new Dimension(50, 20));
		comboBox_2_4_2.setBounds(21, 174, 50, 18);
		panel_6_1_1.add(comboBox_2_4_2);

		final JComboBox comboBox_2_4_3 = new JComboBox();
		comboBox_2_4_3.setModel(new DefaultComboBoxModel(new String[] { "",
				"0", "1" }));
		comboBox_2_4_3.setBackground(Color.WHITE);
		comboBox_2_4_3.setPreferredSize(new Dimension(50, 20));
		comboBox_2_4_3.setBounds(21, 198, 50, 18);
		panel_6_1_1.add(comboBox_2_4_3);

		final JComboBox comboBox_2_4_4 = new JComboBox();
		comboBox_2_4_4.setModel(new DefaultComboBoxModel(new String[] { "",
				"0", "1" }));
		comboBox_2_4_4.setBackground(Color.WHITE);
		comboBox_2_4_4.setPreferredSize(new Dimension(50, 20));
		comboBox_2_4_4.setBounds(21, 222, 50, 18);
		panel_6_1_1.add(comboBox_2_4_4);

		final JPanel panel_6_2_1 = new JPanel();
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2_1.setBounds(726, 252, 104, 246);
		panel_11.add(panel_6_2_1);

		final JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1.setBounds(30, 5, 50, 18);
		panel_6_2_1.add(comboBox_1_1);

		final JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		comboBox_1_2.setBackground(Color.WHITE);
		comboBox_1_2.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2.setBounds(30, 29, 50, 18);
		panel_6_2_1.add(comboBox_1_2);

		final JComboBox comboBox_1_3 = new JComboBox();
		comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		comboBox_1_3.setBackground(Color.WHITE);
		comboBox_1_3.setPreferredSize(new Dimension(50, 20));
		comboBox_1_3.setBounds(30, 53, 50, 18);
		panel_6_2_1.add(comboBox_1_3);

		final JComboBox comboBox_1_4 = new JComboBox();
		comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		comboBox_1_4.setBackground(Color.WHITE);
		comboBox_1_4.setPreferredSize(new Dimension(50, 20));
		comboBox_1_4.setBounds(30, 77, 50, 18);
		panel_6_2_1.add(comboBox_1_4);

		final JComboBox comboBox_1_5 = new JComboBox();
		comboBox_1_5.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		comboBox_1_5.setBackground(Color.WHITE);
		comboBox_1_5.setPreferredSize(new Dimension(50, 20));
		comboBox_1_5.setBounds(30, 101, 50, 18);
		panel_6_2_1.add(comboBox_1_5);

		final JComboBox comboBox_1_6 = new JComboBox();
		comboBox_1_6.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		comboBox_1_6.setBackground(Color.WHITE);
		comboBox_1_6.setPreferredSize(new Dimension(50, 20));
		comboBox_1_6.setBounds(30, 125, 50, 18);
		panel_6_2_1.add(comboBox_1_6);

		final JComboBox comboBox_1_7 = new JComboBox();
		comboBox_1_7.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		comboBox_1_7.setBackground(Color.WHITE);
		comboBox_1_7.setPreferredSize(new Dimension(50, 20));
		comboBox_1_7.setBounds(30, 149, 50, 18);
		panel_6_2_1.add(comboBox_1_7);

		final JComboBox comboBox_1_8 = new JComboBox();
		comboBox_1_8.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		comboBox_1_8.setBackground(Color.WHITE);
		comboBox_1_8.setPreferredSize(new Dimension(50, 20));
		comboBox_1_8.setBounds(30, 173, 50, 18);
		panel_6_2_1.add(comboBox_1_8);

		final JComboBox comboBox_1_9 = new JComboBox();
		comboBox_1_9.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		comboBox_1_9.setBackground(Color.WHITE);
		comboBox_1_9.setPreferredSize(new Dimension(50, 20));
		comboBox_1_9.setBounds(30, 197, 50, 18);
		panel_6_2_1.add(comboBox_1_9);

		final JComboBox comboBox_1_10 = new JComboBox();
		comboBox_1_10.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		comboBox_1_10.setBackground(Color.WHITE);
		comboBox_1_10.setPreferredSize(new Dimension(50, 20));
		comboBox_1_10.setBounds(30, 221, 50, 18);
		panel_6_2_1.add(comboBox_1_10);

		final JPanel panel_13 = new JPanel();
		panel_13.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_13.setLayout(null);
		panel_13.setBounds(10, 594, 382, 25);
		panel_11.add(panel_13);

		final JPanel panel_14 = new JPanel();
		panel_14.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_14.setLayout(null);
		panel_14.setBounds(10, 625, 102, 71);
		panel_11.add(panel_14);

		final JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setBounds(82, 530, 700, 40);
		panel_11.add(panel_15);

		final JLabel addScoresForLabel = new JLabel();
		addScoresForLabel
				.setText("<html><body><b>Add scores for all frequency responses in Column 2</b>, Symptom Frequency. Total score must be between 00 and 30.");
		addScoresForLabel.setBounds(10, 10, 667, 24);
		panel_15.add(addScoresForLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 10, 820, 40);
		panel_11.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);

		final JLabel a0100Label = new JLabel();
		a0100Label.setBounds(11, 6, 321, 15);
		a0100Label.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label
				.setText("D0500. Staff Assessment of Resident Mood (PHQ -9-OV*)");
		panel_5.add(a0100Label);

		final JLabel doNotConductLabel = new JLabel();
		doNotConductLabel.setBounds(11, 24, 669, 14);
		doNotConductLabel
				.setText("Do not conduct if resident Mood Interview (D)200 - D0300) was completed");
		panel_5.add(doNotConductLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 50, 820, 19);
		panel_11.add(panel_7);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);

		final JLabel doNotConductLabel_1 = new JLabel();
		doNotConductLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		doNotConductLabel_1
				.setText("Over the last 2 weeks , did the resident have any of the following problems or behavior?");
		doNotConductLabel_1.setBounds(10, 2, 669, 14);
		panel_7.add(doNotConductLabel_1);

		final JPanel panel_12_1 = new JPanel();
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_12_1.setLayout(flowLayout_7);
		panel_12_1.setBackground(Color.WHITE);
		panel_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1.setBounds(10, 276, 625, 25);
		panel_11.add(panel_12_1);

		final JLabel aLittleInterestLabel_1 = new JLabel();
		aLittleInterestLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel_1
				.setText("B. Feeling down, depressed, or hopeless");
		panel_12_1.add(aLittleInterestLabel_1);

		final JPanel panel_12_1_1 = new JPanel();
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_12_1_1.setLayout(flowLayout_8);
		panel_12_1_1.setBackground(Color.WHITE);
		panel_12_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1_1.setBounds(10, 300, 625, 25);
		panel_11.add(panel_12_1_1);

		final JLabel aLittleInterestLabel_2 = new JLabel();
		aLittleInterestLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel_2
				.setText("C. Trouble falling or staying asleep too much");
		panel_12_1_1.add(aLittleInterestLabel_2);

		final JPanel panel_12_1_2 = new JPanel();
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		panel_12_1_2.setLayout(flowLayout_9);
		panel_12_1_2.setBackground(Color.WHITE);
		panel_12_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1_2.setBounds(10, 324, 625, 25);
		panel_11.add(panel_12_1_2);

		final JLabel aLittleInterestLabel_3 = new JLabel();
		aLittleInterestLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel_3
				.setText("D. Feeling tired or having little energy");
		panel_12_1_2.add(aLittleInterestLabel_3);

		final JPanel panel_12_1_3 = new JPanel();
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_12_1_3.setLayout(flowLayout_10);
		panel_12_1_3.setBackground(Color.WHITE);
		panel_12_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1_3.setBounds(10, 348, 625, 25);
		panel_11.add(panel_12_1_3);

		final JLabel aLittleInterestLabel_4 = new JLabel();
		aLittleInterestLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel_4.setText("E. Poor appetite or overeating");
		panel_12_1_3.add(aLittleInterestLabel_4);

		final JPanel panel_12_1_4 = new JPanel();
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		panel_12_1_4.setLayout(flowLayout_11);
		panel_12_1_4.setBackground(Color.WHITE);
		panel_12_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1_4.setBounds(10, 372, 625, 25);
		panel_11.add(panel_12_1_4);

		final JLabel aLittleInterestLabel_5 = new JLabel();
		aLittleInterestLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel_5
				.setText("F. Feeling bad about yourself - or that you are a failure or have let yourself or your family down");
		panel_12_1_4.add(aLittleInterestLabel_5);

		final JPanel panel_12_1_5 = new JPanel();
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_12_1_5.setLayout(flowLayout_12);
		panel_12_1_5.setBackground(Color.WHITE);
		panel_12_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1_5.setBounds(10, 396, 625, 25);
		panel_11.add(panel_12_1_5);

		final JLabel aLittleInterestLabel_6 = new JLabel();
		aLittleInterestLabel_6.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel_6
				.setText("G. Trouble concentrating on things, such as reading the newspaper or watching television");
		panel_12_1_5.add(aLittleInterestLabel_6);

		final JPanel panel_12_1_6 = new JPanel();
		final FlowLayout flowLayout_13 = new FlowLayout();
		flowLayout_13.setVgap(0);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_12_1_6.setLayout(flowLayout_13);
		panel_12_1_6.setBackground(Color.WHITE);
		panel_12_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1_6.setBounds(10, 420, 625, 30);
		panel_11.add(panel_12_1_6);

		final JLabel aLittleInterestLabel_7 = new JLabel();
		aLittleInterestLabel_7.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel_7
				.setText("<html><body>H. Moving or speaking so slowly that other people could have noticed. Or the opposite- being so fidgety <br> or restless that you have been moving around a lot more than usual");
		panel_12_1_6.add(aLittleInterestLabel_7);

		final JPanel panel_12_1_7 = new JPanel();
		final FlowLayout flowLayout_14 = new FlowLayout();
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_12_1_7.setLayout(flowLayout_14);
		panel_12_1_7.setBackground(Color.WHITE);
		panel_12_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1_7.setBounds(10, 449, 625, 25);
		panel_11.add(panel_12_1_7);

		final JLabel aLittleInterestLabel_8 = new JLabel();
		aLittleInterestLabel_8.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel_8
				.setText("I. Thoughts that you would be better off dead, or of hurting yourself in some way");
		panel_12_1_7.add(aLittleInterestLabel_8);

		final JPanel panel_12_1_8 = new JPanel();
		final FlowLayout flowLayout_15 = new FlowLayout();
		flowLayout_15.setAlignment(FlowLayout.LEFT);
		panel_12_1_8.setLayout(flowLayout_15);
		panel_12_1_8.setBackground(Color.WHITE);
		panel_12_1_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1_8.setBounds(10, 473, 625, 25);
		panel_11.add(panel_12_1_8);

		final JLabel aLittleInterestLabel_9 = new JLabel();
		aLittleInterestLabel_9.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel_9
				.setText("J. Being Short - tempered, easily annoyed");
		panel_12_1_8.add(aLittleInterestLabel_9);

		final JLabel d0300TotalSeverityLabel = new JLabel();
		d0300TotalSeverityLabel.setBounds(10, 510, 347, 14);
		panel_11.add(d0300TotalSeverityLabel);
		d0300TotalSeverityLabel.setFont(new Font("Arial", Font.BOLD, 12));
		d0300TotalSeverityLabel.setForeground(Color.WHITE);
		d0300TotalSeverityLabel.setText("D0300. Total Severity Score");

		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(10, 530, 50, 20);
		panel_11.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox.setPreferredSize(new Dimension(50, 20));

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setBounds(10, 556, 66, 14);
		panel_11.add(enterCodeLabel);
		enterCodeLabel.setForeground(Color.WHITE);
		enterCodeLabel.setText("Enter Score");

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 100));
		add(panel_1_2);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(0, 0, 839, 98);
		panel_1_2.add(panel_8_1);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setHgap(10);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_4);
		panel_5_2.setBounds(0, 0, 839, 26);
		panel_8_1.add(panel_5_2);

		final JLabel a0100Label_2 = new JLabel();
		a0100Label_2
				.setText("D0350. Safety Notification - Complete only if D020011 = 1 indicating possibility of resident self harm");
		panel_5_2.add(a0100Label_2);

		final JPanel panel_6_3 = new JPanel();
		panel_6_3.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_3.setLayout(null);
		panel_6_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_3.setBounds(0, 25, 86, 74);
		panel_8_1.add(panel_6_3);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(9, 7, 62, 14);
		panel_6_3.add(enterCodeLabel_1);

		final JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setBackground(Color.WHITE);
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_17.setPreferredSize(new Dimension(50, 20));
		comboBox_17.setBounds(9, 27, 50, 20);
		panel_6_3.add(comboBox_17);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(92, 32, 727, 62);
		panel_8_1.add(panel_7_2);

		final JLabel aNationalProviderLabel_2 = new JLabel();
		aNationalProviderLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_2
				.setText("Was responsible staff or provider informed that there is a potential for resident staff harm ?");
		aNationalProviderLabel_2.setBounds(10, 5, 719, 14);
		panel_7_2.add(aNationalProviderLabel_2);

		final JLabel aNationalProviderLabel_1_1 = new JLabel();
		aNationalProviderLabel_1_1.setText("<html>1. <b>Yes");
		aNationalProviderLabel_1_1.setBounds(23, 43, 44, 14);
		panel_7_2.add(aNationalProviderLabel_1_1);

		final JLabel phq9ovLabel_1 = new JLabel();
		phq9ovLabel_1.setText("<html>0.<b> No");
		phq9ovLabel_1.setBounds(25, 25, 68, 14);
		panel_7_2.add(phq9ovLabel_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JLabel();
		add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setPreferredSize(new Dimension(820, 30));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");

	}

	public static void main(String ar[]) {
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
		PanelMDS3Page9 panel = new PanelMDS3Page9();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJPanel().setVisible(true);
	}

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}
}
