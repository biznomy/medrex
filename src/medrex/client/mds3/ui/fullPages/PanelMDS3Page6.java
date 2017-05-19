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

public class PanelMDS3Page6 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6284987438220809864L;

	public PanelMDS3Page6() {
		super();
		setPreferredSize(new Dimension(840, 1250));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setHgap(0);
		setLayout(flowLayout_6);
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(840, 35));
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
		sectionALabel.setText("Section C");
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
		identificationInformationLabel.setText("Cognitive Pattern");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setVgap(10);
		panel_8.setLayout(flowLayout_8);
		panel_8.setPreferredSize(new Dimension(840, 100));
		add(panel_8);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_8.add(panel_1_2);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(820, 80));

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(Color.WHITE);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_7);
		panel_5_2.setBounds(0, 0, 810, 25);
		panel_1_2.add(panel_5_2);

		final JLabel a0100Label_2 = new JLabel();
		a0100Label_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_2
				.setText("C0100. Should Brief Interview for mental status (C0200 - C0500) be conducted?");
		panel_5_2.add(a0100Label_2);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(Color.WHITE);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(0, 24, 84, 56);
		panel_1_2.add(panel_6_2);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_6_2.add(enterCodeLabel_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setPreferredSize(new Dimension(50, 20));
		comboBox_2.setBounds(10, 30, 50, 20);
		panel_6_2.add(comboBox_2);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(91, 30, 699, 47);
		panel_1_2.add(panel_7_2);

		final JLabel aNationalProviderLabel_3 = new JLabel();
		aNationalProviderLabel_3
				.setText("<html><body>0.<b> No</b>(resident is rarely / never understood)-> Skip to and complete C0700-C1000 , staff  Assessment for mental status");
		aNationalProviderLabel_3.setBounds(10, 5, 607, 14);
		panel_7_2.add(aNationalProviderLabel_3);

		final JLabel aNationalProviderLabel_1_3 = new JLabel();
		aNationalProviderLabel_1_3
				.setText("<html><body>01. <b>Yes</b> - > Continue to C0200, Repetetion of three Words.");
		aNationalProviderLabel_1_3.setBounds(10, 25, 311, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);

		final JPanel panel_1 = new JPanel();
		panel_1.setName("");
		panel_1.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setVgap(10);
		panel_1.setLayout(flowLayout_2);
		add(panel_1);

		final JPanel panel_1_1_1 = new JPanel();
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(0);
		flowLayout_4.setHgap(0);
		panel_1_1_1.setLayout(flowLayout_4);
		panel_1.add(panel_1_1_1);
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setPreferredSize(new Dimension(820, 1000));

		final JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1.setLayout(flowLayout_3);
		panel_5_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_1_1_1.add(panel_5_1_1_1);

		final JLabel a0100Label_1_1_1 = new JLabel();
		a0100Label_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1.setText("Brief Interview for Mental Status(BIMS)");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_1_1_1.add(panel_5_1_1);

		final JLabel a0100Label_1_1 = new JLabel();
		a0100Label_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1.setText("C0200. repetition of Three Words");
		panel_5_1_1.add(a0100Label_1_1);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1_1.add(panel_1_1);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(820, 180));

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setVgap(8);
		panel_6_1.setLayout(flowLayout_9);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBounds(0, 0, 84, 180);
		panel_1_1.add(panel_6_1);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox.setBackground(Color.WHITE);
		comboBox.setPreferredSize(new Dimension(50, 20));
		panel_6_1.add(comboBox);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(91, 10, 719, 166);
		panel_1_1.add(panel_7_1);

		final JLabel aNationalProviderLabel_3_1 = new JLabel();
		aNationalProviderLabel_3_1
				.setText("<html><body>Ask Resident : \"I am going to say three words for you to remember. Please repeat the words after I have said all three<br>The words are : <b> Sock ,Blue , Bed . </b>Now tell me the Three words.\"<br><b>Number of words repeated after first attempt");
		aNationalProviderLabel_3_1.setBounds(10, 5, 706, 42);
		panel_7_1.add(aNationalProviderLabel_3_1);

		final JLabel aNationalProviderLabel_1_3_1 = new JLabel();
		aNationalProviderLabel_1_3_1.setText("<html><body>0. <b>None.");
		aNationalProviderLabel_1_3_1.setBounds(31, 53, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1);

		final JLabel aNationalProviderLabel_1_3_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1.setText("<html><body>1. <b>One.");
		aNationalProviderLabel_1_3_1_1.setBounds(31, 73, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2.setText("<html><body>2. <b>Two.");
		aNationalProviderLabel_1_3_1_2.setBounds(31, 93, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_2);

		final JLabel aNationalProviderLabel_1_3_1_3 = new JLabel();
		aNationalProviderLabel_1_3_1_3.setText("<html><body>3. <b>Three.");
		aNationalProviderLabel_1_3_1_3.setBounds(31, 112, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_3);

		final JLabel aNationalProviderLabel_1_3_1_4 = new JLabel();
		aNationalProviderLabel_1_3_1_4
				.setText("<html><body>after the residents first attempt, repeat the words using cues(\"sock,something to wear ; blue , a color;bed,a piece<br>of furniture\").You may repeat the words upto two more times");
		aNationalProviderLabel_1_3_1_4.setBounds(10, 132, 706, 33);
		panel_7_1.add(aNationalProviderLabel_1_3_1_4);

		final JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(Color.WHITE);
		panel_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(820, 335));
		panel_1_1_1.add(panel_1_1_2);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBounds(0, 29, 84, 306);
		panel_1_1_2.add(panel_6_1_1);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setBounds(15, 9, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(17, 31, 50, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "", "" }));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(comboBox_1);

		final JLabel enterCodeLabel_1_1 = new JLabel();
		enterCodeLabel_1_1.setText("Enter Code");
		enterCodeLabel_1_1.setBounds(15, 133, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1);

		final JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1.setBounds(15, 153, 50, 20);
		panel_6_1_1.add(comboBox_1_1);

		final JLabel enterCodeLabel_1_1_2 = new JLabel();
		enterCodeLabel_1_1_2.setText("Enter Code");
		enterCodeLabel_1_1_2.setBounds(17, 232, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_2);

		final JComboBox comboBox_1_1_2 = new JComboBox();
		comboBox_1_1_2.setBackground(Color.WHITE);
		comboBox_1_1_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_2.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_2.setBounds(19, 253, 50, 20);
		panel_6_1_1.add(comboBox_1_1_2);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1.setOpaque(false);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(83, 29, 737, 123);
		panel_1_1_2.add(panel_7_1_1);

		final JLabel aNationalProviderLabel_3_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_3_1_1
				.setText("<html><body>Ask resident:<i>\"Please tell me what year it is right now.\"");
		aNationalProviderLabel_3_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1.add(aNationalProviderLabel_3_1_1);

		final JLabel aNationalProviderLabel_1_3_1_5 = new JLabel();
		aNationalProviderLabel_1_3_1_5
				.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1_3_1_5
				.setText("A. Able to report correct year");
		aNationalProviderLabel_1_3_1_5.setBounds(20, 25, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_5);

		final JLabel aNationalProviderLabel_1_3_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1
				.setText("<html><body>0. <b>Missed by > 5 Years </b> or no answer");
		aNationalProviderLabel_1_3_1_1_1.setBounds(30, 45, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1
				.setText("<html><body>1. <b>Missed by 2-5 years");
		aNationalProviderLabel_1_3_1_2_1.setBounds(30, 65, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_2_1);

		final JLabel aNationalProviderLabel_1_3_1_3_1 = new JLabel();
		aNationalProviderLabel_1_3_1_3_1
				.setText("<html><body>2. <b>Missed by 1 years");
		aNationalProviderLabel_1_3_1_3_1.setBounds(30, 85, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_3_1);

		final JLabel aNationalProviderLabel_1_3_1_4_1 = new JLabel();
		aNationalProviderLabel_1_3_1_4_1.setText("<html><body>3. <b>Correct");
		aNationalProviderLabel_1_3_1_4_1.setBounds(30, 105, 706, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_4_1);

		final JPanel panel_5_1_1_2 = new JPanel();
		panel_5_1_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setHgap(10);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2.setLayout(flowLayout_11);
		panel_5_1_1_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2.setBounds(0, 0, 820, 30);
		panel_1_1_2.add(panel_5_1_1_2);

		final JLabel a0100Label_1_1_2 = new JLabel();
		a0100Label_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		a0100Label_1_1_2
				.setText("<html><body><b>C0300. Temporal Orientation</b>. (orientation to year mouth and day)");
		panel_5_1_1_2.add(a0100Label_1_1_2);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(83, 151, 737, 102);
		panel_1_1_2.add(panel_7_1_1_1);

		final JLabel aNationalProviderLabel_3_1_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1_1
				.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_3_1_1_1
				.setText("<html><body>Ask resident:<i>\"Please tell me what month it is right now.\"");
		aNationalProviderLabel_3_1_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_3_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_5_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_1_3_1_5_1
				.setText("B. Able to report correct month");
		aNationalProviderLabel_1_3_1_5_1.setBounds(20, 25, 311, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_3_1_5_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_1
				.setText("<html><body>0. <b>Missed by >1 month </b> or no answer");
		aNationalProviderLabel_1_3_1_1_1_1.setBounds(30, 45, 311, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_3_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1
				.setText("<html><body>1. <b>Missed by 6 days to one month");
		aNationalProviderLabel_1_3_1_2_1_1.setBounds(30, 65, 311, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_3_1_2_1_1);

		final JLabel aNationalProviderLabel_1_3_1_3_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_3_1_1
				.setText("<html><body>2. <b>Accurate within 5 days");
		aNationalProviderLabel_1_3_1_3_1_1.setBounds(30, 85, 311, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_3_1_3_1_1);

		final JPanel panel_7_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(83, 252, 737, 85);
		panel_1_1_2.add(panel_7_1_1_1_1);

		final JLabel aNationalProviderLabel_3_1_1_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1_1_1.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_3_1_1_1_1
				.setText("<html><body>Ask resident:<i>\"Please tell me what day of the week is today?\"");
		aNationalProviderLabel_3_1_1_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_3_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_5_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_1_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_1_3_1_5_1_1
				.setText("C. Able to report correct day of the week");
		aNationalProviderLabel_1_3_1_5_1_1.setBounds(20, 25, 311, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_3_1_5_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_1_1
				.setText("<html><body>0. <b> incorrect </b> or no answer");
		aNationalProviderLabel_1_3_1_1_1_1_1.setBounds(30, 45, 311, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_3_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_1
				.setText("<html><body>1. <b>correct");
		aNationalProviderLabel_1_3_1_2_1_1_1.setBounds(30, 65, 311, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_3_1_2_1_1_1);

		final JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setBackground(Color.WHITE);
		panel_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setPreferredSize(new Dimension(820, 335));
		panel_1_1_1.add(panel_1_1_2_1);

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 29, 84, 306);
		panel_1_1_2_1.add(panel_6_1_1_1);

		final JLabel enterCodeLabel_1_2 = new JLabel();
		enterCodeLabel_1_2.setText("Enter Code");
		enterCodeLabel_1_2.setBounds(15, 9, 54, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_2);

		final JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_2.setBackground(Color.WHITE);
		comboBox_1_2.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2.setBounds(17, 31, 50, 20);
		panel_6_1_1_1.add(comboBox_1_2);

		final JLabel enterCodeLabel_1_1_1 = new JLabel();
		enterCodeLabel_1_1_1.setText("Enter Code");
		enterCodeLabel_1_1_1.setBounds(15, 133, 54, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_1_1);

		final JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1.setBounds(15, 153, 50, 20);
		panel_6_1_1_1.add(comboBox_1_1_1);

		final JLabel enterCodeLabel_1_1_1_1 = new JLabel();
		enterCodeLabel_1_1_1_1.setText("Enter Code");
		enterCodeLabel_1_1_1_1.setBounds(15, 234, 54, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_1_1_1);

		final JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1
				.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1_1.setBounds(15, 251, 50, 20);
		panel_6_1_1_1.add(comboBox_1_1_1_1);

		final JPanel panel_7_1_1_2 = new JPanel();
		panel_7_1_1_2.setOpaque(false);
		panel_7_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_2.setLayout(null);
		panel_7_1_1_2.setBounds(83, 29, 737, 123);
		panel_1_1_2_1.add(panel_7_1_1_2);

		final JLabel aNationalProviderLabel_3_1_1_2 = new JLabel();
		aNationalProviderLabel_3_1_1_2
				.setText("<html><body>Ask Resident:<i>\"Let's go back to an earlier question. what were those three words that i asked you to repeat ?\"</i><br>if unable to remember a word , give cue (something to wear ; a color ; a piece of furniture) for that word.");
		aNationalProviderLabel_3_1_1_2.setBounds(10, 5, 706, 34);
		panel_7_1_1_2.add(aNationalProviderLabel_3_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_2.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_1_3_1_1_1_2
				.setText("A .Able to recall \"sock\"");
		aNationalProviderLabel_1_3_1_1_1_2.setBounds(10, 45, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_2_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_2
				.setText("<html><body>0. <b>No -</b> could not recall");
		aNationalProviderLabel_1_3_1_2_1_2.setBounds(30, 65, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_2_1_2);

		final JLabel aNationalProviderLabel_1_3_1_3_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_3_1_2
				.setText("<html><body>1. <b>Yes after cueing -</b> (\"something to wear\")");
		aNationalProviderLabel_1_3_1_3_1_2.setBounds(30, 85, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_3_1_2);

		final JLabel aNationalProviderLabel_1_3_1_4_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_4_1_1
				.setText("<html><body>2. <b>Yes,no cue required");
		aNationalProviderLabel_1_3_1_4_1_1.setBounds(30, 105, 706, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_4_1_1);

		final JPanel panel_5_1_1_2_1 = new JPanel();
		panel_5_1_1_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setHgap(10);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1.setLayout(flowLayout_10);
		panel_5_1_1_2_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1.setBounds(0, 0, 820, 30);
		panel_1_1_2_1.add(panel_5_1_1_2_1);

		final JLabel a0100Label_1_1_2_1 = new JLabel();
		a0100Label_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2_1.setText("C0400 . Recall");
		panel_5_1_1_2_1.add(a0100Label_1_1_2_1);

		final JPanel panel_7_1_1_1_2 = new JPanel();
		panel_7_1_1_1_2.setOpaque(false);
		panel_7_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_2.setLayout(null);
		panel_7_1_1_1_2.setBounds(83, 151, 737, 102);
		panel_1_1_2_1.add(panel_7_1_1_1_2);

		final JLabel aNationalProviderLabel_3_1_1_1_2 = new JLabel();
		aNationalProviderLabel_3_1_1_1_2.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_3_1_1_1_2.setText("B .Able to recall \"Blue\"");
		aNationalProviderLabel_3_1_1_1_2.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_3_1_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_5_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_5_1_2
				.setText("<html><body>0. <b>No -</b> could not recall");
		aNationalProviderLabel_1_3_1_5_1_2.setBounds(30, 25, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_5_1_2);

		final JLabel aNationalProviderLabel_1_3_1_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_1_2
				.setText("<html><body>1. <b>Yes after cueing -</b> (\"a color\")");
		aNationalProviderLabel_1_3_1_1_1_1_2.setBounds(30, 45, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2
				.setText("<html><body>2. <b>Yes,no cue required");
		aNationalProviderLabel_1_3_1_2_1_1_2.setBounds(30, 65, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_2_1_1_2);

		final JPanel panel_7_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBounds(83, 252, 737, 83);
		panel_1_1_2_1.add(panel_7_1_1_1_1_1);

		final JLabel aNationalProviderLabel_3_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_3_1_1_1_1_1.setText("C .Able to recall \"Bed\"");
		aNationalProviderLabel_3_1_1_1_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_3_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_5_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_1_1_1
				.setText("<html><body>0. <b>No -</b> could not recall");
		aNationalProviderLabel_1_3_1_5_1_1_1.setBounds(30, 25, 311, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_3_1_5_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_1_1_1
				.setText("<html><body>1. <b>Yes after cueing -</b> (\"a piece of furniture\")");
		aNationalProviderLabel_1_3_1_1_1_1_1_1.setBounds(30, 45, 311, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_3_1_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_1_1
				.setText("<html><body>2. <b>Yes,no cue required");
		aNationalProviderLabel_1_3_1_2_1_1_1_1.setBounds(30, 65, 311, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_3_1_2_1_1_1_1);

		final JPanel panel_2_2 = new JPanel();
		panel_1_1_1.add(panel_2_2);
		panel_2_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2_2.setLayout(null);
		panel_2_2.setPreferredSize(new Dimension(820, 100));

		final JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_23 = new FlowLayout();
		flowLayout_23.setVgap(2);
		flowLayout_23.setHgap(10);
		flowLayout_23.setAlignment(FlowLayout.LEFT);
		panel_3_3.setLayout(flowLayout_23);
		panel_3_3.setBounds(3, 3, 231, 23);
		panel_2_2.add(panel_3_3);

		final JLabel sectioncLabel = new JLabel();
		sectioncLabel.setForeground(Color.WHITE);
		sectioncLabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectioncLabel.setText("C0500. Summary Score");
		panel_3_3.add(sectioncLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(84, 32, 736, 58);
		panel_2_2.add(panel_5);

		final JLabel aNationalProviderLabel_3_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1_1_1_1_1
				.setText("<html><body><b>Add Scores</b> for questions C0200-C0400 and fill in total score(00-15)");
		aNationalProviderLabel_3_1_1_1_1_1_1.setBounds(10, 10, 706, 14);
		panel_5.add(aNationalProviderLabel_3_1_1_1_1_1_1);

		final JLabel aNationalProviderLabel_3_1_1_1_1_1_2 = new JLabel();
		aNationalProviderLabel_3_1_1_1_1_1_2
				.setText("<html><body><b>Enter 99 if the resident was unable to complete the interview");
		aNationalProviderLabel_3_1_1_1_1_1_2.setBounds(10, 34, 706, 14);
		panel_5.add(aNationalProviderLabel_3_1_1_1_1_1_2);

		final JLabel enterCodeLabel_1_1_1_2 = new JLabel();
		enterCodeLabel_1_1_1_2.setForeground(Color.WHITE);
		enterCodeLabel_1_1_1_2.setText("Enter Score");
		enterCodeLabel_1_1_1_2.setBounds(10, 38, 68, 14);
		panel_2_2.add(enterCodeLabel_1_1_1_2);

		final JComboBox comboBox_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1.setModel(new DefaultComboBoxModel(
				new String[] { "" }));
		comboBox_1_1_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1_1_1.setBounds(10, 58, 50, 20);
		panel_2_2.add(comboBox_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JLabel();
		add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setPreferredSize(new Dimension(820, 30));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 14));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);

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
		PanelMDS3Page6 panel = new PanelMDS3Page6();
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
