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

public class PanelMDS3Page8 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8156875903214708661L;

	public PanelMDS3Page8() {
		super();
		setPreferredSize(new Dimension(840, 1250));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setHgap(0);
		flowLayout_6.setVgap(0);
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
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.setLayout(flowLayout_1);
		panel_3.setBounds(0, 0, 234, 25);
		panel_2.add(panel_3);

		final JLabel sectionALabel = new JLabel();
		sectionALabel.setForeground(Color.WHITE);
		sectionALabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectionALabel.setText("Section A");
		panel_3.add(sectionALabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(238, 1, 600, 30);
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

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(840, 119));
		add(panel_1);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 840, 118);
		panel_1.add(panel_8);

		final JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 10, 821, 25);
		panel_8.add(panel_5);
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_2);
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);

		final JLabel a0100Label = new JLabel();
		a0100Label.setFont(new Font("Arial", Font.PLAIN, 12));
		a0100Label
				.setText("<html><body><b>D0200. Resident Mood Interview be Conducted?</b> - Attempt to conduct interview with all residents");
		panel_5.add(a0100Label);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(10, 34, 95, 72);
		panel_8.add(panel_6);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);

		final JComboBox comboBox_17_1 = new JComboBox();
		comboBox_17_1.setBackground(Color.WHITE);
		comboBox_17_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_17_1.setPreferredSize(new Dimension(50, 20));
		comboBox_17_1.setBounds(10, 23, 50, 20);
		panel_6.add(comboBox_17_1);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 3, 54, 14);
		panel_6.add(enterCodeLabel_2);

		final JPanel panel_7 = new JPanel();
		panel_7.setBounds(103, 33, 728, 73);
		panel_8.add(panel_7);
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);

		final JLabel aNationalProviderLabel = new JLabel();
		aNationalProviderLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel
				.setText("<html><body>0. <b>No </b>(resident is rarely/never understood)<b>--></b> Skip to and complete D0500-D0600, Staff Assessment of Resident Mood");
		aNationalProviderLabel.setBounds(10, 5, 707, 14);
		panel_7.add(aNationalProviderLabel);

		final JLabel aNationalProviderLabel_1 = new JLabel();
		aNationalProviderLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1
				.setText("<html><body>1. <b>Yes --> </b>Continue to D0200, Resident Mood Interview(PHQ-9©");
		aNationalProviderLabel_1.setBounds(10, 43, 529, 14);
		panel_7.add(aNationalProviderLabel_1);

		final JLabel phq9ovLabel = new JLabel();
		phq9ovLabel.setText("(PHQ-9-OV)");
		phq9ovLabel.setBounds(25, 25, 68, 14);
		panel_7.add(phq9ovLabel);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 740));
		add(panel_1_1);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 0, 840, 10);
		panel_1_1.add(panel_9);

		final JPanel panel_11 = new JPanel();
		panel_11.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_11.setLayout(null);
		panel_11.setBounds(0, 16, 840, 724);
		panel_1_1.add(panel_11);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBounds(10, 9, 820, 25);
		panel_11.add(panel_5_1);
		panel_5_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1.setLayout(flowLayout_3);

		final JLabel a0100Label_1 = new JLabel();
		a0100Label_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1.setText("D0200. Resident Mood Interview(PH-Q©)");
		panel_5_1.add(a0100Label_1);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBounds(10, 33, 820, 34);
		panel_11.add(panel_10);
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);

		final JLabel sayToResidentLabel = new JLabel();
		sayToResidentLabel
				.setText("<html><body><b>Say to resident: \"Over the last 2 weeks, have you been bothered by any of the following problems?\"");
		sayToResidentLabel.setBounds(10, 0, 743, 24);
		panel_10.add(sayToResidentLabel);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setBounds(10, 65, 820, 185);
		panel_11.add(panel_7_1);
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setLayout(null);

		final JLabel ifSymptomIsLabel = new JLabel();
		ifSymptomIsLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		ifSymptomIsLabel
				.setText("If symptom is present, enter 1(yes) in column 1, Symptom Presence.");
		ifSymptomIsLabel.setBounds(3, 0, 806, 24);
		panel_7_1.add(ifSymptomIsLabel);

		final JLabel ifYesInLabel = new JLabel();
		ifYesInLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		ifYesInLabel
				.setText("If yes in column 1, then ask the resident:\"About how often have you been bothered by this?\"");
		ifYesInLabel.setBounds(3, 30, 714, 14);
		panel_7_1.add(ifYesInLabel);

		final JLabel readAndShowLabel = new JLabel();
		readAndShowLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		readAndShowLabel
				.setText("Read and show the resident a card with the symptom frequency choices. Indicate response in column 2, Symptom Frequency.");
		readAndShowLabel.setBounds(3, 50, 760, 14);
		panel_7_1.add(readAndShowLabel);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label.setText("<html><body><b>1. Symptom Presence</b>");
		label.setBounds(3, 88, 156, 14);
		panel_7_1.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_1.setText("<html><body>0. <b>No</b>(enter 0 in column 2)");
		label_1.setBounds(13, 108, 166, 14);
		panel_7_1.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2.setText("<html><body>1. <b>Yes</b>(enter 0-3 in column 2)");
		label_2.setBounds(13, 128, 184, 14);
		panel_7_1.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3
				.setText("<html><body>9.<b> No response</b>(leave column 2 blank)");
		label_3.setBounds(13, 148, 247, 14);
		panel_7_1.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Arial", Font.PLAIN, 12));
		label_4.setText("<html><body><b>2. Symptom Frequency</b>");
		label_4.setBounds(332, 88, 224, 14);
		panel_7_1.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Arial", Font.PLAIN, 12));
		label_5.setText("<html><body>0. <b>Never or 1 day</b>");
		label_5.setBounds(342, 108, 233, 14);
		panel_7_1.add(label_5);

		final JLabel label_6 = new JLabel();
		label_6.setFont(new Font("Arial", Font.PLAIN, 12));
		label_6.setText("<html><body>1.<b> 2 - 6 days</b>(several days)");
		label_6.setBounds(341, 128, 156, 14);
		panel_7_1.add(label_6);

		final JLabel label_7 = new JLabel();
		label_7.setFont(new Font("Arial", Font.PLAIN, 12));
		label_7
				.setText("<html><body>2.<b>7-11 days</b>(half or more of the days)");
		label_7.setBounds(342, 148, 233, 14);
		panel_7_1.add(label_7);

		final JLabel label_8 = new JLabel();
		label_8.setFont(new Font("Arial", Font.PLAIN, 12));
		label_8.setText("<html><body>3.<b> 12- 14 days</b>(nearly every day)");
		label_8.setBounds(342, 166, 247, 14);
		panel_7_1.add(label_8);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setLayout(null);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1.setBounds(624, 86, 93, 72);
		panel_7_1.add(panel_6_1);

		final JLabel label_9 = new JLabel();
		label_9.setText("<html><body><b>1.<br> Symptom <br>Presence");
		label_9.setBounds(10, 10, 54, 52);
		panel_6_1.add(label_9);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setLayout(null);
		panel_6_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(716, 86, 90, 72);
		panel_7_1.add(panel_6_2);

		final JLabel label_10 = new JLabel();
		label_10.setText("<html><body><b>2. <br>Symptom<br> Frequency");
		label_10.setBounds(10, 10, 72, 52);
		panel_6_2.add(label_10);

		final JLabel enterScoreInLabel = new JLabel();
		enterScoreInLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enterScoreInLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		enterScoreInLabel.setBorder(new LineBorder(Color.black, 1, false));
		enterScoreInLabel.setText("    Enter Score in Boxes");
		enterScoreInLabel.setBounds(624, 157, 182, 28);
		panel_7_1.add(enterScoreInLabel);

		final JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBounds(10, 249, 625, 43);
		panel_11.add(panel_12);

		final JLabel aLittleInterestLabel = new JLabel();
		aLittleInterestLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aLittleInterestLabel
				.setText("A. Little interest or pleasure in doing things");
		aLittleInterestLabel.setBounds(10, 10, 518, 14);
		panel_12.add(aLittleInterestLabel);

		final JPanel panel_12_1 = new JPanel();
		panel_12_1.setLayout(null);
		panel_12_1.setBackground(Color.WHITE);
		panel_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1.setBounds(10, 290, 625, 42);
		panel_11.add(panel_12_1);

		final JLabel feelingDownDepressedLabel = new JLabel();
		feelingDownDepressedLabel.setFont(new Font("Arial", Font.BOLD, 12));
		feelingDownDepressedLabel
				.setText("B. Feeling down, depressed, or hopeless");
		feelingDownDepressedLabel.setBounds(10, 10, 518, 14);
		panel_12_1.add(feelingDownDepressedLabel);

		final JPanel panel_12_2 = new JPanel();
		panel_12_2.setFont(new Font("Arial", Font.BOLD, 12));
		panel_12_2.setLayout(null);
		panel_12_2.setBackground(Color.WHITE);
		panel_12_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_2.setBounds(10, 330, 625, 42);
		panel_11.add(panel_12_2);

		final JLabel troubleFallingOrLabel = new JLabel();
		troubleFallingOrLabel.setFont(new Font("Arial", Font.BOLD, 12));
		troubleFallingOrLabel
				.setText("C. Trouble falling or staying asleep too much");
		troubleFallingOrLabel.setBounds(10, 10, 518, 14);
		panel_12_2.add(troubleFallingOrLabel);

		final JPanel panel_12_3 = new JPanel();
		panel_12_3.setLayout(null);
		panel_12_3.setBackground(Color.WHITE);
		panel_12_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_3.setBounds(10, 370, 625, 42);
		panel_11.add(panel_12_3);

		final JLabel feelingTiredOrLabel = new JLabel();
		feelingTiredOrLabel.setFont(new Font("Arial", Font.BOLD, 12));
		feelingTiredOrLabel.setText("D. Feeling tired or having little energy");
		feelingTiredOrLabel.setBounds(10, 10, 518, 14);
		panel_12_3.add(feelingTiredOrLabel);

		final JPanel panel_12_4 = new JPanel();
		panel_12_4.setLayout(null);
		panel_12_4.setBackground(Color.WHITE);
		panel_12_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_4.setBounds(10, 410, 625, 44);
		panel_11.add(panel_12_4);

		final JLabel poorAppetiteOrLabel = new JLabel();
		poorAppetiteOrLabel.setFont(new Font("Arial", Font.BOLD, 12));
		poorAppetiteOrLabel.setText("E. Poor appetite or overeating");
		poorAppetiteOrLabel.setBounds(10, 10, 518, 14);
		panel_12_4.add(poorAppetiteOrLabel);

		final JPanel panel_12_5 = new JPanel();
		panel_12_5.setLayout(null);
		panel_12_5.setBackground(Color.WHITE);
		panel_12_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_5.setBounds(10, 452, 625, 42);
		panel_11.add(panel_12_5);

		final JLabel fFeelingBadLabel = new JLabel();
		fFeelingBadLabel.setFont(new Font("Arial", Font.BOLD, 12));
		fFeelingBadLabel
				.setText("F. Feeling bad about yourself - or that you are a failure or have let yourself or your family down");
		fFeelingBadLabel.setBounds(10, 10, 564, 14);
		panel_12_5.add(fFeelingBadLabel);

		final JPanel panel_12_6 = new JPanel();
		panel_12_6.setLayout(null);
		panel_12_6.setBackground(Color.WHITE);
		panel_12_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_6.setBounds(10, 492, 625, 42);
		panel_11.add(panel_12_6);

		final JLabel gTroubleConcentratingLabel = new JLabel();
		gTroubleConcentratingLabel.setFont(new Font("Arial", Font.BOLD, 12));
		gTroubleConcentratingLabel
				.setText("G. Trouble concentrating on things, such as reading the newspaper or watching television");
		gTroubleConcentratingLabel.setBounds(10, 10, 518, 14);
		panel_12_6.add(gTroubleConcentratingLabel);

		final JPanel panel_12_7 = new JPanel();
		panel_12_7.setLayout(null);
		panel_12_7.setBackground(Color.WHITE);
		panel_12_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_7.setBounds(10, 533, 625, 42);
		panel_11.add(panel_12_7);

		final JLabel gTroubleConcentratingLabel_3 = new JLabel();
		gTroubleConcentratingLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		gTroubleConcentratingLabel_3
				.setText("<html><body>G. Moving or speaking so slowly that other people could have noticed. Or the opposite- being so fidgety <br> or restless that you have been moving around a lot more than usual");
		gTroubleConcentratingLabel_3.setBounds(10, 4, 605, 29);
		panel_12_7.add(gTroubleConcentratingLabel_3);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBounds(634, 249, 92, 367);
		panel_11.add(panel_6_1_1);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1.setBounds(21, 6, 50, 20);
		comboBox_1.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(comboBox_1);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_2.setPreferredSize(new Dimension(50, 20));
		comboBox_2.setBounds(21, 55, 50, 20);
		panel_6_1_1.add(comboBox_2);

		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_3.setPreferredSize(new Dimension(50, 20));
		comboBox_3.setBounds(21, 94, 50, 20);
		panel_6_1_1.add(comboBox_3);

		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_4.setPreferredSize(new Dimension(50, 20));
		comboBox_4.setBounds(21, 136, 50, 20);
		panel_6_1_1.add(comboBox_4);

		final JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_5.setPreferredSize(new Dimension(50, 20));
		comboBox_5.setBounds(21, 174, 50, 20);
		panel_6_1_1.add(comboBox_5);

		final JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_6.setPreferredSize(new Dimension(50, 20));
		comboBox_6.setBounds(21, 218, 50, 20);
		panel_6_1_1.add(comboBox_6);

		final JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBackground(Color.WHITE);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_7.setPreferredSize(new Dimension(50, 20));
		comboBox_7.setBounds(21, 255, 50, 20);
		panel_6_1_1.add(comboBox_7);

		final JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBackground(Color.WHITE);
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_8.setPreferredSize(new Dimension(50, 20));
		comboBox_8.setBounds(21, 294, 50, 20);
		panel_6_1_1.add(comboBox_8);

		final JComboBox comboBox_8_1 = new JComboBox();
		comboBox_8_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_8_1.setBackground(Color.WHITE);
		comboBox_8_1.setPreferredSize(new Dimension(50, 20));
		comboBox_8_1.setBounds(21, 336, 50, 20);
		panel_6_1_1.add(comboBox_8_1);

		final JPanel panel_6_2_1 = new JPanel();
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2_1.setBounds(724, 248, 92, 368);
		panel_11.add(panel_6_2_1);

		final JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBackground(Color.WHITE);
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_9.setBounds(21, 6, 50, 20);
		comboBox_9.setPreferredSize(new Dimension(50, 20));
		panel_6_2_1.add(comboBox_9);

		final JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBackground(Color.WHITE);
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_10.setPreferredSize(new Dimension(50, 20));
		comboBox_10.setBounds(21, 54, 50, 20);
		panel_6_2_1.add(comboBox_10);

		final JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setBackground(Color.WHITE);
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_11.setPreferredSize(new Dimension(50, 20));
		comboBox_11.setBounds(21, 97, 50, 20);
		panel_6_2_1.add(comboBox_11);

		final JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setBackground(Color.WHITE);
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_12.setPreferredSize(new Dimension(50, 20));
		comboBox_12.setBounds(21, 134, 50, 20);
		panel_6_2_1.add(comboBox_12);

		final JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setBackground(Color.WHITE);
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_13.setPreferredSize(new Dimension(50, 20));
		comboBox_13.setBounds(21, 175, 50, 20);
		panel_6_2_1.add(comboBox_13);

		final JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setBackground(Color.WHITE);
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_14.setPreferredSize(new Dimension(50, 20));
		comboBox_14.setBounds(21, 216, 50, 20);
		panel_6_2_1.add(comboBox_14);

		final JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setBackground(Color.WHITE);
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_15.setPreferredSize(new Dimension(50, 20));
		comboBox_15.setBounds(21, 254, 50, 20);
		panel_6_2_1.add(comboBox_15);

		final JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setBackground(Color.WHITE);
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_16.setPreferredSize(new Dimension(50, 20));
		comboBox_16.setBounds(21, 294, 50, 20);
		panel_6_2_1.add(comboBox_16);

		final JComboBox comboBox_8_2 = new JComboBox();
		comboBox_8_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_8_2.setBackground(Color.WHITE);
		comboBox_8_2.setPreferredSize(new Dimension(50, 20));
		comboBox_8_2.setBounds(21, 336, 50, 20);
		panel_6_2_1.add(comboBox_8_2);

		final JPanel panel_13 = new JPanel();
		panel_13.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_13.setLayout(null);
		panel_13.setBounds(10, 623, 382, 25);
		panel_11.add(panel_13);

		final JLabel d0300TotalSeverityLabel = new JLabel();
		d0300TotalSeverityLabel.setFont(new Font("Arial", Font.BOLD, 12));
		d0300TotalSeverityLabel.setForeground(Color.WHITE);
		d0300TotalSeverityLabel.setText("D0300. Total Severity Score");
		d0300TotalSeverityLabel.setBounds(9, 5, 347, 14);
		panel_13.add(d0300TotalSeverityLabel);

		final JPanel panel_14 = new JPanel();
		panel_14.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_14.setLayout(null);
		panel_14.setBounds(6, 650, 102, 71);
		panel_11.add(panel_14);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox.setPreferredSize(new Dimension(50, 20));
		comboBox.setBounds(10, 14, 50, 20);
		panel_14.add(comboBox);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setForeground(Color.WHITE);
		enterCodeLabel.setText("Enter Score");
		enterCodeLabel.setBounds(7, 40, 82, 14);
		panel_14.add(enterCodeLabel);

		final JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setBounds(118, 654, 700, 54);
		panel_11.add(panel_15);

		final JLabel addScoresForLabel = new JLabel();
		addScoresForLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		addScoresForLabel
				.setText("<html><body><b>Add scores for all frequency responses in Column 2</b>, Symptom Frequency. Total score must be between 00 and 27.");
		addScoresForLabel.setBounds(28, 0, 672, 24);
		panel_15.add(addScoresForLabel);

		final JLabel enter99IfLabel = new JLabel();
		enter99IfLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		enter99IfLabel
				.setText("Enter 99 if unable to complete interview(i.e , Symptom Frequency is blank for 3 or more items).");
		enter99IfLabel.setBounds(28, 30, 638, 24);
		panel_15.add(enter99IfLabel);

		final JPanel panel_12_6_1 = new JPanel();
		panel_12_6_1.setBackground(Color.WHITE);
		panel_12_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_6_1.setLayout(null);
		panel_12_6_1.setBounds(10, 574, 625, 42);
		panel_11.add(panel_12_6_1);

		final JLabel gTroubleConcentratingLabel_1 = new JLabel();
		gTroubleConcentratingLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		gTroubleConcentratingLabel_1
				.setText("I. Thoughts that you would be better off dead, or of hurting yourself in some way");
		gTroubleConcentratingLabel_1.setBounds(10, 10, 518, 14);
		panel_12_6_1.add(gTroubleConcentratingLabel_1);

		final JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(814, 249, 16, 367);
		panel_11.add(panel_17);

		final JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(0, 830, 840, 10);
		panel_1_1.add(panel_16);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 103));
		add(panel_1_2);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(0, 0, 839, 101);
		panel_1_2.add(panel_8_1);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setHgap(10);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_4);
		panel_5_2.setBounds(2, 0, 838, 25);
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
		panel_6_3.setBounds(2, 25, 86, 75);
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
		panel_7_2.setBackground(Color.WHITE);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(88, 25, 743, 74);
		panel_8_1.add(panel_7_2);

		final JLabel aNationalProviderLabel_2 = new JLabel();
		aNationalProviderLabel_2
				.setText("Was responsible staff or provider informed that there is a potential for resident staff harm ?");
		aNationalProviderLabel_2.setBounds(10, 5, 719, 14);
		panel_7_2.add(aNationalProviderLabel_2);

		final JLabel aNationalProviderLabel_1_1 = new JLabel();
		aNationalProviderLabel_1_1.setText("1. Yes");
		aNationalProviderLabel_1_1.setBounds(23, 43, 44, 14);
		panel_7_2.add(aNationalProviderLabel_1_1);

		final JLabel phq9ovLabel_1 = new JLabel();
		phq9ovLabel_1.setText("0. No");
		phq9ovLabel_1.setBounds(25, 25, 68, 14);
		panel_7_2.add(phq9ovLabel_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setPreferredSize(new Dimension(840, 35));
		add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 14));
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
		PanelMDS3Page8 panel = new PanelMDS3Page8();
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
