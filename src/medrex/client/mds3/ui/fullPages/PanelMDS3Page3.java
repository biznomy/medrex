package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
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

public class PanelMDS3Page3 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1882229462609643094L;

	public PanelMDS3Page3() {
		super();
		setPreferredSize(new Dimension(840, 1050));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setHgap(0);
		flowLayout_6.setVgap(0);
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

		final JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(Color.WHITE);
		panel_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(840, 130));
		add(panel_1_1_2);

		final JPanel panel_5_1_2 = new JPanel();
		panel_5_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_1_2.setLayout(flowLayout_7);
		panel_5_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_2.setBounds(0, -1, 840, 25);
		panel_1_1_2.add(panel_5_1_2);

		final JLabel a0100Label_1_2 = new JLabel();
		a0100Label_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_2.setName("");
		a0100Label_1_2.setText("A1200. Marital Status");
		panel_5_1_2.add(a0100Label_1_2);

		final JPanel panel_6_1_2 = new JPanel();
		panel_6_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setVgap(8);
		panel_6_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2.setLayout(flowLayout_8);
		panel_6_1_2.setBounds(0, 23, 84, 107);
		panel_1_1_2.add(panel_6_1_2);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setText("Enter Code");
		panel_6_1_2.add(enterCodeLabel_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "", "" }));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setPreferredSize(new Dimension(50, 20));
		panel_6_1_2.add(comboBox_2);

		final JPanel panel_7_1_2 = new JPanel();
		panel_7_1_2.setOpaque(false);
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(91, 30, 739, 98);
		panel_1_1_2.add(panel_7_1_2);

		final JLabel aNationalProviderLabel_2_2 = new JLabel();
		aNationalProviderLabel_2_2.setText("<html><body>1.<b> Never Married");
		aNationalProviderLabel_2_2.setBounds(32, 5, 184, 14);
		panel_7_1_2.add(aNationalProviderLabel_2_2);

		final JLabel aNationalProviderLabel_1_2_2 = new JLabel();
		aNationalProviderLabel_1_2_2.setText("<html><body>2. <b>Married");
		aNationalProviderLabel_1_2_2.setBounds(32, 25, 206, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_2_2);

		final JLabel aNationalProviderLabel_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_1_1_2.setText("<html><body>3.<b> Widowed");
		aNationalProviderLabel_1_1_1_2.setBounds(32, 45, 206, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_1_1_2);

		final JLabel aNationalProviderLabel_1_1_1_2_1 = new JLabel();
		aNationalProviderLabel_1_1_1_2_1.setText("<html><body>4. <b>Separated");
		aNationalProviderLabel_1_1_1_2_1.setBounds(32, 65, 206, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_1_1_2_1);

		final JLabel aNationalProviderLabel_1_1_1_2_2 = new JLabel();
		aNationalProviderLabel_1_1_1_2_2.setText("<html><body>5.<b> Divorced");
		aNationalProviderLabel_1_1_1_2_2.setBounds(32, 83, 206, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_1_1_2_2);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(840, 220));
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
		a0100Label.setText("A1300. Optional Resident Items");
		panel_5.add(a0100Label);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 24, 84, 196);
		panel_1.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(91, 30, 739, 187);
		panel_1.add(panel_7);

		final JLabel aNationalProviderLabel = new JLabel();
		aNationalProviderLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel.setText("A. Medical Record Number");
		aNationalProviderLabel.setBounds(10, 5, 206, 14);
		panel_7.add(aNationalProviderLabel);

		final JTextField textField_2 = new JTextField();
		textField_2.setBounds(20, 25, 341, 20);
		panel_7.add(textField_2);

		final JLabel aNationalProviderLabel_1 = new JLabel();
		aNationalProviderLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1.setText("B. Room Number");
		aNationalProviderLabel_1.setBounds(10, 54, 206, 14);
		panel_7.add(aNationalProviderLabel_1);

		final JTextField textField_2_1 = new JTextField();
		textField_2_1.setBounds(25, 74, 312, 20);
		panel_7.add(textField_2_1);

		final JLabel aNationalProviderLabel_1_1 = new JLabel();
		aNationalProviderLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1_1
				.setText("C. Name by which resident prefers to be addressed");
		aNationalProviderLabel_1_1.setBounds(10, 100, 327, 14);
		panel_7.add(aNationalProviderLabel_1_1);

		final JTextField textField_2_1_1 = new JTextField();
		textField_2_1_1.setBounds(25, 120, 663, 20);
		panel_7.add(textField_2_1_1);

		final JLabel aNationalProviderLabel_1_1_2 = new JLabel();
		aNationalProviderLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_1_2
				.setText("<html><body>D. <b>LifeTime Occupation(s)-</b> put ' / '  between two occupations :");
		aNationalProviderLabel_1_1_2.setBounds(10, 146, 389, 14);
		panel_7.add(aNationalProviderLabel_1_1_2);

		final JTextField textField_2_1_1_1 = new JTextField();
		textField_2_1_1_1.setBounds(25, 166, 663, 20);
		panel_7.add(textField_2_1_1_1);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 150));
		add(panel_1_1);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1.setLayout(flowLayout_3);
		panel_5_1.setBounds(0, -1, 840, 42);
		panel_1_1.add(panel_5_1);

		final JLabel a0100Label_1 = new JLabel();
		a0100Label_1.setFont(new Font("Arial", Font.PLAIN, 12));
		a0100Label_1
				.setText("<html><body><b>A1500. Preadmission Screening and Resident Review (PASRR)</b><br>Complete only if A0310 = 01");
		panel_5_1.add(a0100Label_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(8);
		panel_6_1.setLayout(flowLayout_4);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBounds(0, 37, 84, 113);
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
		panel_7_1.setBounds(91, 43, 739, 97);
		panel_1_1.add(panel_7_1);

		final JLabel aNationalProviderLabel_2 = new JLabel();
		aNationalProviderLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_2
				.setText("<html><body>Has the resident been evaluated by level II PASRR and determined to have a serious mental illness and / or mental retardation or a <br> related condition");
		aNationalProviderLabel_2.setBounds(0, 5, 739, 40);
		panel_7_1.add(aNationalProviderLabel_2);

		final JLabel aNationalProviderLabel_1_2 = new JLabel();
		aNationalProviderLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_2.setText("<html><body>1.<b> Nursing Home");
		aNationalProviderLabel_1_2.setBounds(32, 43, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_2);

		final JLabel aNationalProviderLabel_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_1_1.setText("<html><body>2. <b>Swing Bed");
		aNationalProviderLabel_1_1_1.setBounds(32, 63, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_3 = new JLabel();
		aNationalProviderLabel_1_1_1_3
				.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_1_1_3
				.setText("<html><body>9.<b> Not a medical certificate ");
		aNationalProviderLabel_1_1_1_3.setBounds(32, 83, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1_3);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setPreferredSize(new Dimension(840, 300));
		add(panel_1_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, -1, 840, 53);
		panel_1_1_1.add(panel_5_1_1);

		final JLabel a0100Label_1_1 = new JLabel();
		a0100Label_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		a0100Label_1_1
				.setText("<html><body><b>A1550. Condition Related to MR/DD Status</b><br>if the resident is 22 years of age or older , complete only if A0310A = 01<br>if the resident is 21 years of age or younger, complete only if A0310A = 01, 03, 04 or 05");
		panel_5_1_1.add(a0100Label_1_1);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBounds(0, 76, 86, 226);
		panel_1_1_1.add(panel_6_1_1);

		final JLabel enterCodeLabel_1_1_3 = new JLabel();
		enterCodeLabel_1_1_3.setText("Enter Code");
		enterCodeLabel_1_1_3.setBounds(16, 666, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_3);

		final JComboBox comboBox_1_1_1_3 = new JComboBox();
		comboBox_1_1_1_3.setBackground(Color.WHITE);
		comboBox_1_1_1_3
				.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1_3.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1_3.setBounds(20, 686, 50, 20);
		panel_6_1_1.add(comboBox_1_1_1_3);

		final JCheckBox checkBox = new JCheckBox();
		checkBox.setBackground(Color.WHITE);
		checkBox.setBounds(35, 35, 15, 18);
		panel_6_1_1.add(checkBox);
		checkBox.setOpaque(true);
		checkBox.setText("");

		final JCheckBox checkBox_1 = new JCheckBox();
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setText("");
		checkBox_1.setBounds(35, 59, 15, 18);
		panel_6_1_1.add(checkBox_1);

		final JCheckBox checkBox_2 = new JCheckBox();
		checkBox_2.setBackground(Color.WHITE);
		checkBox_2.setText("");
		checkBox_2.setBounds(35, 83, 15, 18);
		panel_6_1_1.add(checkBox_2);

		final JCheckBox checkBox_3 = new JCheckBox();
		checkBox_3.setBackground(Color.WHITE);
		checkBox_3.setText("");
		checkBox_3.setBounds(35, 107, 15, 18);
		panel_6_1_1.add(checkBox_3);

		final JCheckBox checkBox_4 = new JCheckBox();
		checkBox_4.setBackground(Color.WHITE);
		checkBox_4.setText("");
		checkBox_4.setBounds(35, 152, 15, 18);
		panel_6_1_1.add(checkBox_4);

		final JCheckBox checkBox_5 = new JCheckBox();
		checkBox_5.setBackground(Color.WHITE);
		checkBox_5.setText("");
		checkBox_5.setBounds(35, 205, 15, 18);
		panel_6_1_1.add(checkBox_5);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 14));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setBounds(25, 803, 617, 14);
		panel_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);

		final JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setHgap(40);
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1.setLayout(flowLayout_9);
		panel_5_1_1_1.setBounds(0, 51, 840, 26);
		panel_1_1_1.add(panel_5_1_1_1);

		final JLabel a0100Label_1_1_1 = new JLabel();
		a0100Label_1_1_1
				.setText("<html><body><b>Check all conditions that are related to MR/DD status</b> that were manifested before age 22, and are likely to continue indefinitely");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JPanel panel_5_1_1_1_1 = new JPanel();
		panel_5_1_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setHgap(40);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1.setLayout(flowLayout_10);
		panel_5_1_1_1_1.setBounds(84, 76, 756, 26);
		panel_1_1_1.add(panel_5_1_1_1_1);

		final JLabel a0100Label_1_1_1_1 = new JLabel();
		a0100Label_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1.setText("MR / DD With Organic Condition");
		panel_5_1_1_1_1.add(a0100Label_1_1_1_1);

		final JPanel panel_5_1_1_1_1_1 = new JPanel();
		panel_5_1_1_1_1_1.setOpaque(false);
		panel_5_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setHgap(40);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_1.setLayout(flowLayout_11);
		panel_5_1_1_1_1_1.setBounds(84, 101, 756, 26);
		panel_1_1_1.add(panel_5_1_1_1_1_1);

		final JLabel a0100Label_1_1_1_1_1 = new JLabel();
		a0100Label_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1_1.setText("A. Down syndrome");
		panel_5_1_1_1_1_1.add(a0100Label_1_1_1_1_1);

		final JPanel panel_5_1_1_1_1_2 = new JPanel();
		panel_5_1_1_1_1_2.setOpaque(false);
		panel_5_1_1_1_1_2.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setHgap(40);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_2.setLayout(flowLayout_12);
		panel_5_1_1_1_1_2.setBounds(84, 126, 756, 26);
		panel_1_1_1.add(panel_5_1_1_1_1_2);

		final JLabel a0100Label_1_1_1_1_2 = new JLabel();
		a0100Label_1_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1_2.setText("B. Autism");
		panel_5_1_1_1_1_2.add(a0100Label_1_1_1_1_2);

		final JPanel panel_5_1_1_1_1_3 = new JPanel();
		panel_5_1_1_1_1_3.setOpaque(false);
		panel_5_1_1_1_1_3.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_13 = new FlowLayout();
		flowLayout_13.setHgap(40);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_3.setLayout(flowLayout_13);
		panel_5_1_1_1_1_3.setBounds(84, 151, 756, 26);
		panel_1_1_1.add(panel_5_1_1_1_1_3);

		final JLabel a0100Label_1_1_1_1_3 = new JLabel();
		a0100Label_1_1_1_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1_3.setText("C. Epilepsy");
		panel_5_1_1_1_1_3.add(a0100Label_1_1_1_1_3);

		final JPanel panel_5_1_1_1_1_4 = new JPanel();
		panel_5_1_1_1_1_4.setOpaque(false);
		panel_5_1_1_1_1_4.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_14 = new FlowLayout();
		flowLayout_14.setHgap(40);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_4.setLayout(flowLayout_14);
		panel_5_1_1_1_1_4.setBounds(84, 176, 756, 26);
		panel_1_1_1.add(panel_5_1_1_1_1_4);

		final JLabel a0100Label_1_1_1_1_4 = new JLabel();
		a0100Label_1_1_1_1_4.setOpaque(false);
		a0100Label_1_1_1_1_4.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1_4
				.setText("D. Other Organic condition related to MR/ DD");
		panel_5_1_1_1_1_4.add(a0100Label_1_1_1_1_4);

		final JPanel panel_5_1_1_1_1_5 = new JPanel();
		panel_5_1_1_1_1_5.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1_1_5.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_15 = new FlowLayout();
		flowLayout_15.setHgap(40);
		flowLayout_15.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_5.setLayout(flowLayout_15);
		panel_5_1_1_1_1_5.setBounds(84, 201, 756, 26);
		panel_1_1_1.add(panel_5_1_1_1_1_5);

		final JLabel a0100Label_1_1_1_1_5 = new JLabel();
		a0100Label_1_1_1_1_5.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1_5.setText("MR/DD without Organic Condition");
		panel_5_1_1_1_1_5.add(a0100Label_1_1_1_1_5);

		final JPanel panel_5_1_1_1_1_6 = new JPanel();
		panel_5_1_1_1_1_6.setOpaque(false);
		panel_5_1_1_1_1_6.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_16 = new FlowLayout();
		flowLayout_16.setHgap(40);
		flowLayout_16.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_6.setLayout(flowLayout_16);
		panel_5_1_1_1_1_6.setBounds(84, 226, 756, 26);
		panel_1_1_1.add(panel_5_1_1_1_1_6);

		final JLabel a0100Label_1_1_1_1_6 = new JLabel();
		a0100Label_1_1_1_1_6.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1_6.setText("E. MR/DD with no organic Condition");
		panel_5_1_1_1_1_6.add(a0100Label_1_1_1_1_6);

		final JPanel panel_5_1_1_1_1_7 = new JPanel();
		panel_5_1_1_1_1_7.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1_1_7.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_17 = new FlowLayout();
		flowLayout_17.setHgap(40);
		flowLayout_17.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_7.setLayout(flowLayout_17);
		panel_5_1_1_1_1_7.setBounds(84, 251, 756, 26);
		panel_1_1_1.add(panel_5_1_1_1_1_7);

		final JLabel a0100Label_1_1_1_1_7 = new JLabel();
		a0100Label_1_1_1_1_7.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1_7.setText("No MR/DD");
		panel_5_1_1_1_1_7.add(a0100Label_1_1_1_1_7);

		final JPanel panel_5_1_1_1_1_7_1 = new JPanel();
		panel_5_1_1_1_1_7_1.setOpaque(false);
		panel_5_1_1_1_1_7_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_18 = new FlowLayout();
		flowLayout_18.setHgap(40);
		flowLayout_18.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_7_1.setLayout(flowLayout_18);
		panel_5_1_1_1_1_7_1.setBounds(84, 276, 756, 26);
		panel_1_1_1.add(panel_5_1_1_1_1_7_1);

		final JLabel a0100Label_1_1_1_1_7_1 = new JLabel();
		a0100Label_1_1_1_1_7_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1_7_1.setText("Z. None of the above");
		panel_5_1_1_1_1_7_1.add(a0100Label_1_1_1_1_7_1);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		add(panel_1_2);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 90));

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_19 = new FlowLayout();
		flowLayout_19.setHgap(10);
		flowLayout_19.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_19);
		panel_5_2.setBounds(0, 0, 840, 25);
		panel_1_2.add(panel_5_2);

		final JLabel a0100Label_2 = new JLabel();
		a0100Label_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_2
				.setText("A1600. Entry Date (date of this admission / reentry into the facility)");
		panel_5_2.add(a0100Label_2);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(0, 24, 84, 66);
		panel_1_2.add(panel_6_2);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(90, 30, 739, 55);
		panel_1_2.add(panel_7_2);

		final JTextField textField_2_2 = new JTextField();
		textField_2_2.setBounds(10, 10, 171, 20);
		panel_7_2.add(textField_2_2);

		final JLabel aNationalProviderLabel_1_3 = new JLabel();
		aNationalProviderLabel_1_3.setText("Month ");
		aNationalProviderLabel_1_3.setBounds(10, 36, 74, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);

		final JLabel aNationalProviderLabel_1_1_3 = new JLabel();
		aNationalProviderLabel_1_1_3.setText("Day ");
		aNationalProviderLabel_1_1_3.setBounds(89, 36, 63, 14);
		panel_7_2.add(aNationalProviderLabel_1_1_3);

		final JLabel aNationalProviderLabel_1_1_2_1 = new JLabel();
		aNationalProviderLabel_1_1_2_1.setText("Year");
		aNationalProviderLabel_1_1_2_1.setBounds(158, 36, 74, 14);
		panel_7_2.add(aNationalProviderLabel_1_1_2_1);

		final JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setPreferredSize(new Dimension(840, 65));
		add(panel_1_2_1);

		final JPanel panel_5_2_1 = new JPanel();
		panel_5_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_20 = new FlowLayout();
		flowLayout_20.setHgap(10);
		flowLayout_20.setAlignment(FlowLayout.LEFT);
		panel_5_2_1.setLayout(flowLayout_20);
		panel_5_2_1.setBounds(0, -1, 840, 26);
		panel_1_2_1.add(panel_5_2_1);

		final JLabel a0100Label_2_1 = new JLabel();
		a0100Label_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_2_1.setText("A1700. Type of Entry");
		panel_5_2_1.add(a0100Label_2_1);

		final JPanel panel_6_2_1 = new JPanel();
		panel_6_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2_1.setBounds(0, 24, 84, 41);
		panel_1_2_1.add(panel_6_2_1);

		final JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setOpaque(false);
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(90, 30, 739, 32);
		panel_1_2_1.add(panel_7_2_1);

		final JLabel aNationalProviderLabel_1_3_1 = new JLabel();
		aNationalProviderLabel_1_3_1.setText("<html><body>1. <b>Admission");
		aNationalProviderLabel_1_3_1.setBounds(35, 0, 74, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_1);

		final JLabel aNationalProviderLabel_1_1_3_1 = new JLabel();
		aNationalProviderLabel_1_1_3_1.setText("<html><body>2. <b>Reentry");
		aNationalProviderLabel_1_1_3_1.setBounds(35, 15, 63, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_1_3_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 14));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setPreferredSize(new Dimension(840, 30));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1);
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
		PanelMDS3Page3 panel = new PanelMDS3Page3();
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
