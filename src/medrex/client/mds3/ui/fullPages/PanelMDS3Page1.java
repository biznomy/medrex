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

public class PanelMDS3Page1 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6245691418911334968L;

	public PanelMDS3Page1() {
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
		panel.setPreferredSize(new Dimension(840, 120));
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

		final JLabel minimumDataSetLabel = new JLabel();
		minimumDataSetLabel.setFont(new Font("Arial", Font.BOLD, 18));
		minimumDataSetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		minimumDataSetLabel.setForeground(ColorConstants.MDS_FONT_COLOR);
		minimumDataSetLabel.setText("MINIMUM DATA SET (MDS) - VERSION 3.0");
		minimumDataSetLabel.setBounds(241, 34, 379, 26);
		panel.add(minimumDataSetLabel);

		final JLabel residentAssessmentAndLabel = new JLabel();
		residentAssessmentAndLabel.setFont(new Font("", Font.BOLD, 16));
		residentAssessmentAndLabel
				.setHorizontalAlignment(SwingConstants.CENTER);
		residentAssessmentAndLabel.setForeground(ColorConstants.MDS_FONT_COLOR);
		residentAssessmentAndLabel
				.setText("RESIDENT ASSESSMENT AND CARE SCREENING");
		residentAssessmentAndLabel.setBounds(226, 66, 422, 16);
		panel.add(residentAssessmentAndLabel);

		final JLabel residentAssessmentAndLabel_1 = new JLabel();
		residentAssessmentAndLabel_1.setFont(new Font("Arial", Font.BOLD
				| Font.ITALIC, 16));
		residentAssessmentAndLabel_1
				.setHorizontalAlignment(SwingConstants.CENTER);
		residentAssessmentAndLabel_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		residentAssessmentAndLabel_1
				.setText("Nursing Home Comprehensive (NC) Item Set");
		residentAssessmentAndLabel_1.setBounds(226, 88, 422, 16);
		panel.add(residentAssessmentAndLabel_1);

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
		sectionALabel.setText("Section A");
		panel_3.add(sectionALabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(246, 2, 592, 22);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 16));
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Identification information");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(840, 180));
		add(panel_1);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_2);
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5.setBounds(0, 0, 840, 25);
		panel_1.add(panel_5);

		final JLabel a0100Label = new JLabel();
		a0100Label.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label.setText("A0100. Facility Provider Numbers");
		panel_5.add(a0100Label);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 24, 84, 156);
		panel_1.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(91, 30, 739, 144);
		panel_1.add(panel_7);

		final JLabel aNationalProviderLabel = new JLabel();
		aNationalProviderLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel.setText("A. National Provider Identifier(NPI)");
		aNationalProviderLabel.setBounds(10, 5, 206, 14);
		panel_7.add(aNationalProviderLabel);

		final JTextField textField_2 = new JTextField();
		textField_2.setBounds(25, 28, 206, 20);
		panel_7.add(textField_2);

		final JLabel aNationalProviderLabel_1 = new JLabel();
		aNationalProviderLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1.setText("CMS Certification Number(CCN):");
		aNationalProviderLabel_1.setBounds(10, 54, 206, 14);
		panel_7.add(aNationalProviderLabel_1);

		final JTextField textField_2_1 = new JTextField();
		textField_2_1.setBounds(25, 74, 248, 20);
		panel_7.add(textField_2_1);

		final JLabel aNationalProviderLabel_1_1 = new JLabel();
		aNationalProviderLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1_1.setText("State Provider Number : ");
		aNationalProviderLabel_1_1.setBounds(10, 102, 206, 14);
		panel_7.add(aNationalProviderLabel_1_1);

		final JTextField textField_2_1_1 = new JTextField();
		textField_2_1_1.setBounds(25, 122, 341, 20);
		panel_7.add(textField_2_1_1);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 95));
		add(panel_1_1);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1.setLayout(flowLayout_3);
		panel_5_1.setBounds(0, -1, 840, 25);
		panel_1_1.add(panel_5_1);

		final JLabel a0100Label_1 = new JLabel();
		a0100Label_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1.setText("A0200 Type of Provider");
		panel_5_1.add(a0100Label_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(8);
		panel_6_1.setLayout(flowLayout_4);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBounds(0, 23, 84, 72);
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
		panel_7_1.setBounds(91, 30, 739, 62);
		panel_1_1.add(panel_7_1);

		final JLabel aNationalProviderLabel_2 = new JLabel();
		aNationalProviderLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_2.setText("Type Of Provider");
		aNationalProviderLabel_2.setBounds(10, 5, 206, 14);
		panel_7_1.add(aNationalProviderLabel_2);

		final JLabel aNationalProviderLabel_1_2 = new JLabel();
		aNationalProviderLabel_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1_2.setText("1. Nursing Home");
		aNationalProviderLabel_1_2.setBounds(32, 25, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_2);

		final JLabel aNationalProviderLabel_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1_1_1.setText("2. Swing Bed");
		aNationalProviderLabel_1_1_1.setBounds(32, 45, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setPreferredSize(new Dimension(840, 820));
		add(panel_1_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, -1, 840, 26);
		panel_1_1_1.add(panel_5_1_1);

		final JLabel a0100Label_1_1 = new JLabel();
		a0100Label_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1.setText("A0310. Type of Assessment");
		panel_5_1_1.add(a0100Label_1_1);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBounds(0, 24, 86, 775);
		panel_1_1_1.add(panel_6_1_1);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setBounds(16, 9, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(18, 31, 50, 20);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(comboBox_1);

		final JLabel enterCodeLabel_1_1 = new JLabel();
		enterCodeLabel_1_1.setText("Enter Code");
		enterCodeLabel_1_1.setBounds(16, 175, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1);

		final JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1.setBounds(20, 210, 50, 20);
		panel_6_1_1.add(comboBox_1_1);

		final JLabel enterCodeLabel_1_1_1 = new JLabel();
		enterCodeLabel_1_1_1.setText("Enter Code");
		enterCodeLabel_1_1_1.setBounds(16, 431, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_1);

		final JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1.setBounds(20, 461, 50, 20);
		panel_6_1_1.add(comboBox_1_1_1);

		final JLabel enterCodeLabel_1_1_1_1 = new JLabel();
		enterCodeLabel_1_1_1_1.setText("Enter Code");
		enterCodeLabel_1_1_1_1.setBounds(16, 534, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_1_1);

		final JLabel enterCodeLabel_1_1_2 = new JLabel();
		enterCodeLabel_1_1_2.setText("Enter Code");
		enterCodeLabel_1_1_2.setBounds(16, 595, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_2);

		final JLabel enterCodeLabel_1_1_3 = new JLabel();
		enterCodeLabel_1_1_3.setText("Enter Code");
		enterCodeLabel_1_1_3.setBounds(16, 666, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_3);

		final JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1
				.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1_1.setName("");
		comboBox_1_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1_1.setBounds(20, 554, 50, 20);
		panel_6_1_1.add(comboBox_1_1_1_1);

		final JComboBox comboBox_1_1_1_2 = new JComboBox();
		comboBox_1_1_1_2
				.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1_2.setBackground(Color.WHITE);
		comboBox_1_1_1_2.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1_2.setBounds(20, 621, 50, 20);
		panel_6_1_1.add(comboBox_1_1_1_2);

		final JComboBox comboBox_1_1_1_3 = new JComboBox();
		comboBox_1_1_1_3.setBackground(Color.WHITE);
		comboBox_1_1_1_3
				.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1_3.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1_3.setBounds(20, 686, 50, 20);
		panel_6_1_1.add(comboBox_1_1_1_3);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7_1_1.setBackground(Color.WHITE);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(85, 24, 755, 172);
		panel_1_1_1.add(panel_7_1_1);

		final JLabel aNationalProviderLabel_2_1 = new JLabel();
		aNationalProviderLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_2_1
				.setText("A. Federal OBRA Reason for Assessment");
		aNationalProviderLabel_2_1.setBounds(10, 5, 294, 14);
		panel_7_1_1.add(aNationalProviderLabel_2_1);

		final JLabel aNationalProviderLabel_1_2_1 = new JLabel();
		aNationalProviderLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_2_1
				.setText("<html><body>01. <b>Admission</b> assessment (required by day 14)");
		aNationalProviderLabel_1_2_1.setBounds(32, 25, 342, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_2_1);

		final JLabel aNationalProviderLabel_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1
				.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_1_1_1
				.setText("<html><body>02. <b>Quarterly</b> review Assessment");
		aNationalProviderLabel_1_1_1_1.setBounds(32, 45, 342, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>03. <b>Annual</b> Assessment");
		aNationalProviderLabel_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_2
				.setText("<html><body>04. <b>Significant change in status</b> assessment");
		aNationalProviderLabel_1_1_1_1_2.setBounds(32, 85, 617, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_2);

		final JLabel aNationalProviderLabel_1_1_1_1_3 = new JLabel();
		aNationalProviderLabel_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_3
				.setText("<html><body>05. <b>Significant correction</b> to <b>prior comprehensive</b> assessment");
		aNationalProviderLabel_1_1_1_1_3.setBounds(32, 105, 541, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_3);

		final JLabel aNationalProviderLabel_1_1_1_1_4 = new JLabel();
		aNationalProviderLabel_1_1_1_1_4.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_4
				.setText("<html><body>05. <b>Significant correction</b> to <b>prior quarterly</b> assessment");
		aNationalProviderLabel_1_1_1_1_4.setBounds(32, 125, 594, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_4);

		final JLabel aNationalProviderLabel_1_1_1_1_5 = new JLabel();
		aNationalProviderLabel_1_1_1_1_5.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_5
				.setText("<html><body>99.<b> Not OBRA required</b> assessment");
		aNationalProviderLabel_1_1_1_1_5.setBounds(32, 145, 567, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_5);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(85, 195, 755, 254);
		panel_1_1_1.add(panel_7_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1 = new JLabel();
		aNationalProviderLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_2_1_1.setText("B.PPS Assessment");
		aNationalProviderLabel_2_1_1.setBounds(10, 5, 294, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1);

		final JLabel aNationalProviderLabel_1_2_1_1 = new JLabel();
		aNationalProviderLabel_1_2_1_1
				.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1_2_1_1
				.setText("PPS Scheduled Assessments for a Medicare Part A Stay");
		aNationalProviderLabel_1_2_1_1.setBounds(32, 25, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_6 = new JLabel();
		aNationalProviderLabel_1_1_1_1_6
				.setText("<html><body>01. <b>5-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_6.setBounds(32, 45, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_6);

		final JLabel aNationalProviderLabel_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1_1
				.setText("<html><body>02. <b>14-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1
				.setText("<html><body>03. <b>30-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_2_1.setBounds(32, 85, 617, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1);

		final JLabel aNationalProviderLabel_1_1_1_1_3_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_3_1
				.setText("<html><body>04. <b>60-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_3_1.setBounds(32, 105, 541, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_3_1);

		final JLabel aNationalProviderLabel_1_1_1_1_4_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_4_1
				.setText("<html><body>05. <b>90-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_4_1.setBounds(32, 125, 594, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_4_1);

		final JLabel aNationalProviderLabel_1_1_1_1_5_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_5_1
				.setText("<html><body>06. <b>Readmission/return </b> assessment");
		aNationalProviderLabel_1_1_1_1_5_1.setBounds(32, 145, 567, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_5_1);

		final JLabel aNationalProviderLabel_1_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_2_1_1_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_1_2_1_1_1
				.setText("PPS Unscheduled Assessments for a Medicare Part A Stay");
		aNationalProviderLabel_1_2_1_1_1.setBounds(32, 165, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_1
				.setText("<html><body>07. <b>Unscheduled assessment used for PPS</b>(OMRA , significant or clinical change , or significant correction assessment)");
		aNationalProviderLabel_1_1_1_1_2_1_1.setBounds(32, 185, 617, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_1);

		final JLabel aNationalProviderLabel_2_1_1_1 = new JLabel();
		aNationalProviderLabel_2_1_1_1
				.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_2_1_1_1.setText("Not PPS Assessment");
		aNationalProviderLabel_2_1_1_1.setBounds(28, 205, 294, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1_1_1 = new JLabel();
		aNationalProviderLabel_2_1_1_1_1.setText("99. Not PPS Assessment");
		aNationalProviderLabel_2_1_1_1_1.setBounds(32, 225, 294, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1_1_1);

		final JPanel panel_7_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(85, 448, 755, 102);
		panel_1_1_1.add(panel_7_1_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1_2 = new JLabel();
		aNationalProviderLabel_2_1_1_2
				.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_2_1_1_2
				.setText("C.PPS Other Medicare Required Assessment - OMRA");
		aNationalProviderLabel_2_1_1_2.setBounds(10, 5, 422, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_2_1_1_2);

		final JLabel aNationalProviderLabel_1_2_1_1_2 = new JLabel();
		aNationalProviderLabel_1_2_1_1_2.setText("<html><body>0. <b> No");
		aNationalProviderLabel_1_2_1_1_2.setBounds(32, 25, 342, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_2);

		final JLabel aNationalProviderLabel_1_1_1_1_6_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_6_1
				.setText("<html><body>1.<b> Start of therapy</b> assessment");
		aNationalProviderLabel_1_1_1_1_6_1.setBounds(32, 45, 342, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_6_1);

		final JLabel aNationalProviderLabel_1_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1_1_1
				.setText("<html><body>2.<b> End of therapy</b> assessment");
		aNationalProviderLabel_1_1_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2
				.setText("<html><body>3.<b>Both Start and End of therapy</b> assessment");
		aNationalProviderLabel_1_1_1_1_2_1_2.setBounds(32, 85, 617, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_2);

		final JPanel panel_7_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBounds(85, 549, 755, 65);
		panel_1_1_1.add(panel_7_1_1_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1_2_1 = new JLabel();
		aNationalProviderLabel_2_1_1_2_1
				.setText("<html><body><b>D. Is this a swing Bed clinical change assessment?</b> Complete only if A0200 =2 ");
		aNationalProviderLabel_2_1_1_2_1.setBounds(10, 5, 422, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_2_1_1_2_1);

		final JLabel aNationalProviderLabel_1_2_1_1_2_1 = new JLabel();
		aNationalProviderLabel_1_2_1_1_2_1.setText("<html><body>01. <b>No</b>");
		aNationalProviderLabel_1_2_1_1_2_1.setBounds(32, 25, 342, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_2_1);

		final JLabel aNationalProviderLabel_1_1_1_1_6_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_6_1_1
				.setText("<html><body>02. <b>Yes</b>");
		aNationalProviderLabel_1_1_1_1_6_1_1.setBounds(32, 45, 342, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_6_1_1);

		final JPanel panel_7_1_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_7_1_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1_1.setBounds(85, 613, 755, 65);
		panel_1_1_1.add(panel_7_1_1_1_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1_2_1_1 = new JLabel();
		aNationalProviderLabel_2_1_1_2_1_1
				.setText("<html><body><b>E. Is this assessment the first assessment</b>(OBRA,PPS or Discharge)<b>since the most recent admission?");
		aNationalProviderLabel_2_1_1_2_1_1.setBounds(10, 5, 583, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_2_1_1_2_1_1);

		final JLabel aNationalProviderLabel_1_2_1_1_2_1_1 = new JLabel();
		aNationalProviderLabel_1_2_1_1_2_1_1
				.setText("<html><body>01. <b>No</b>");
		aNationalProviderLabel_1_2_1_1_2_1_1.setBounds(32, 25, 342, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_2_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_6_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_6_1_1_1
				.setText("<html><body>02. <b>Yes</b>");
		aNationalProviderLabel_1_1_1_1_6_1_1_1.setBounds(32, 45, 342, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_6_1_1_1);

		final JPanel panel_7_1_1_1_1_2 = new JPanel();
		panel_7_1_1_1_1_2.setOpaque(false);
		panel_7_1_1_1_1_2.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_7_1_1_1_1_2.setLayout(null);
		panel_7_1_1_1_1_2.setBounds(85, 677, 755, 122);
		panel_1_1_1.add(panel_7_1_1_1_1_2);

		final JLabel aNationalProviderLabel_2_1_1_2_2 = new JLabel();
		aNationalProviderLabel_2_1_1_2_2
				.setText("<html><body><b>F. Entry / Discharge reporting");
		aNationalProviderLabel_2_1_1_2_2.setBounds(10, 5, 422, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_2_1_1_2_2);

		final JLabel aNationalProviderLabel_1_2_1_1_2_2 = new JLabel();
		aNationalProviderLabel_1_2_1_1_2_2
				.setText("<html><body>01. <b>Entry Record</b>");
		aNationalProviderLabel_1_2_1_1_2_2.setBounds(32, 25, 342, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_2_1_1_2_2);

		final JLabel aNationalProviderLabel_1_1_1_1_6_1_2 = new JLabel();
		aNationalProviderLabel_1_1_1_1_6_1_2
				.setText("<html><body>10. <b>Discharge </b>assessment-<b> return not anticipated Record</b>");
		aNationalProviderLabel_1_1_1_1_6_1_2.setBounds(32, 45, 342, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_6_1_2);

		final JLabel aNationalProviderLabel_1_1_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1_1_1_1
				.setText("<html><body>11. <b>Discharge </b>assessment-<b> return anticipated Record</b>");
		aNationalProviderLabel_1_1_1_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1
				.setText("<html><body>12. <b>Death in facility</b> record</b>");
		aNationalProviderLabel_1_1_1_1_2_1_2_1.setBounds(32, 85, 617, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_2_1_2_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1
				.setText("<html><body>99. <b>Not entry/ discharge</b> record</b>");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1.setBounds(32, 105, 617, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 14));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setBounds(25, 803, 617, 14);
		panel_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
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
		PanelMDS3Page1 panel = new PanelMDS3Page1();
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
