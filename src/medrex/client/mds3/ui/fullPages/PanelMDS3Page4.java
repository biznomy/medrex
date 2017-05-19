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

public class PanelMDS3Page4 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 998531042454410204L;

	public PanelMDS3Page4() {
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
		panel_1.setPreferredSize(new Dimension(840, 200));
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
		a0100Label.setText("A1800. Entered Form");
		panel_5.add(a0100Label);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 24, 84, 176);
		panel_1.add(panel_6);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 32, 54, 14);
		panel_6.add(enterCodeLabel_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setPreferredSize(new Dimension(50, 20));
		comboBox_2.setBounds(10, 52, 50, 20);
		panel_6.add(comboBox_2);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(91, 30, 739, 163);
		panel_1.add(panel_7);

		final JLabel aNationalProviderLabel = new JLabel();
		aNationalProviderLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel
				.setText("<html><body>01. <b>Community</b> (private home/apt., board/care,assisted living,group home)");
		aNationalProviderLabel.setBounds(10, 5, 417, 24);
		panel_7.add(aNationalProviderLabel);

		final JLabel aNationalProviderLabel_1 = new JLabel();
		aNationalProviderLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1
				.setText("<html><body>02. <b>Another nursing home or swing bed");
		aNationalProviderLabel_1.setBounds(10, 31, 268, 14);
		panel_7.add(aNationalProviderLabel_1);

		final JLabel aNationalProviderLabel_1_1 = new JLabel();
		aNationalProviderLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_1.setText("<html><body>03.<b> Acute hospital");
		aNationalProviderLabel_1_1.setBounds(10, 51, 120, 14);
		panel_7.add(aNationalProviderLabel_1_1);

		final JLabel label = new JLabel();
		label.setText("<html><body>04.<b> Psychiatric hospital");
		label.setBounds(10, 71, 163, 14);
		panel_7.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("<html><body>05. <b>Inpatient rehabilitation facility");
		label_1.setBounds(10, 91, 239, 14);
		panel_7.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setText("<html><body>06. <b>MR/DD facility");
		label_2.setBounds(10, 111, 255, 14);
		panel_7.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3.setText("<html><body>07.<b> Hospice");
		label_3.setBounds(10, 130, 142, 14);
		panel_7.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setText("<html><body>99. <b>Other");
		label_4.setBounds(10, 150, 54, 14);
		panel_7.add(label_4);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 120));
		add(panel_1_1);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5_1.setBounds(0, -1, 840, 43);
		panel_1_1.add(panel_5_1);

		final JLabel a0100Label_1 = new JLabel();
		a0100Label_1.setBounds(11, 6, 129, 15);
		a0100Label_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1.setText("A2000. Discharge Date");
		panel_5_1.add(a0100Label_1);

		final JLabel completeOnlyIfLabel = new JLabel();
		completeOnlyIfLabel.setText("Complete only if A0310F = 10,11, or 12");
		completeOnlyIfLabel.setBounds(11, 25, 207, 14);
		panel_5_1.add(completeOnlyIfLabel);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(8);
		panel_6_1.setLayout(flowLayout_4);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBounds(0, 40, 84, 80);
		panel_1_1.add(panel_6_1);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(91, 48, 739, 43);
		panel_1_1.add(panel_7_1);

		final JDateChooser dcDate_1 = new JDateChooser();
		dcDate_1.setBounds(37, 10, 143, 22);
		panel_7_1.add(dcDate_1);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setPreferredSize(new Dimension(840, 229));
		add(panel_1_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5_1_1.setBounds(0, -1, 840, 48);
		panel_1_1_1.add(panel_5_1_1);

		final JLabel a0100Label_1_1 = new JLabel();
		a0100Label_1_1.setBounds(11, 6, 140, 15);
		a0100Label_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1.setText("A2100. Discharge Status");
		panel_5_1_1.add(a0100Label_1_1);

		final JLabel completeOnlyIfLabel_1 = new JLabel();
		completeOnlyIfLabel_1.setText("Complete only if A0310F = 10,11, or 12");
		completeOnlyIfLabel_1.setBounds(11, 27, 207, 14);
		panel_5_1_1.add(completeOnlyIfLabel_1);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBounds(0, 46, 86, 182);
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

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7_1_1.setBackground(Color.WHITE);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(85, 46, 755, 182);
		panel_1_1_1.add(panel_7_1_1);

		final JLabel aNationalProviderLabel_1_2_1 = new JLabel();
		aNationalProviderLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_2_1
				.setText("<html><body>01. <b>Community</b> (private home/apt..,board/care,assisted living,group home)");
		aNationalProviderLabel_1_2_1.setBounds(10, 16, 541, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_2_1);

		final JLabel aNationalProviderLabel_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1
				.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_1_1_1
				.setText("<html><body>02. <b>Another nursing home or swing bed</b> ");
		aNationalProviderLabel_1_1_1_1.setBounds(10, 35, 342, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>03. <b>Acute Hospital</b> ");
		aNationalProviderLabel_1_1_1_1_1.setBounds(10, 53, 383, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_2
				.setText("<html><body>04.<b> Psychiatric hospital");
		aNationalProviderLabel_1_1_1_1_2.setBounds(10, 72, 617, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_2);

		final JLabel aNationalProviderLabel_1_1_1_1_3 = new JLabel();
		aNationalProviderLabel_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_3
				.setText("<html><body>05. <b>Inpatient rehabilitation facility");
		aNationalProviderLabel_1_1_1_1_3.setBounds(10, 91, 541, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_3);

		final JLabel aNationalProviderLabel_1_1_1_1_4 = new JLabel();
		aNationalProviderLabel_1_1_1_1_4.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_4
				.setText("<html><body>06. <b>MR/DD facility");
		aNationalProviderLabel_1_1_1_1_4.setBounds(10, 110, 594, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_4);

		final JLabel aNationalProviderLabel_1_1_1_1_5 = new JLabel();
		aNationalProviderLabel_1_1_1_1_5.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_5.setText("<html><body>07.<b> Hospice");
		aNationalProviderLabel_1_1_1_1_5.setBounds(10, 130, 567, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_5);

		final JLabel label_5 = new JLabel();
		label_5.setText("<html><body>99. <b>Other");
		label_5.setBounds(10, 150, 189, 14);
		panel_7_1_1.add(label_5);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 14));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setBounds(25, 803, 617, 14);
		panel_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);

		final JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(Color.WHITE);
		panel_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(840, 120));
		add(panel_1_1_2);

		final JPanel panel_5_1_2 = new JPanel();
		panel_5_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5_1_2.setLayout(null);
		panel_5_1_2.setBounds(0, -1, 840, 43);
		panel_1_1_2.add(panel_5_1_2);

		final JLabel a0100Label_1_2 = new JLabel();
		a0100Label_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_2
				.setText("A2200. Previous Assessment Reference Date for Significant Correction");
		a0100Label_1_2.setBounds(11, 6, 367, 15);
		panel_5_1_2.add(a0100Label_1_2);

		final JLabel completeOnlyIfLabel_2 = new JLabel();
		completeOnlyIfLabel_2.setText("Complete only if A0310F = 05, or 06");
		completeOnlyIfLabel_2.setBounds(11, 25, 207, 14);
		panel_5_1_2.add(completeOnlyIfLabel_2);

		final JPanel panel_6_1_2 = new JPanel();
		panel_6_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(8);
		panel_6_1_2.setLayout(flowLayout_3);
		panel_6_1_2.setBounds(0, 40, 84, 80);
		panel_1_1_2.add(panel_6_1_2);

		final JPanel panel_7_1_2 = new JPanel();
		panel_7_1_2.setBackground(Color.WHITE);
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(91, 48, 739, 62);
		panel_1_1_2.add(panel_7_1_2);

		final JDateChooser dcDate_1_1 = new JDateChooser();
		dcDate_1_1.setBounds(37, 10, 143, 22);
		panel_7_1_2.add(dcDate_1_1);

		final JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setBackground(Color.WHITE);
		panel_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setPreferredSize(new Dimension(840, 120));
		add(panel_1_1_3);

		final JPanel panel_5_1_3 = new JPanel();
		panel_5_1_3.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5_1_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5_1_3.setLayout(null);
		panel_5_1_3.setBounds(0, -1, 840, 27);
		panel_1_1_3.add(panel_5_1_3);

		final JLabel a0100Label_1_3 = new JLabel();
		a0100Label_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_3.setText("A2300. Assessment Reference Date");
		a0100Label_1_3.setBounds(11, 6, 219, 15);
		panel_5_1_3.add(a0100Label_1_3);

		final JPanel panel_6_1_3 = new JPanel();
		panel_6_1_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_3.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setVgap(8);
		panel_6_1_3.setLayout(flowLayout_5);
		panel_6_1_3.setBounds(0, 25, 84, 95);
		panel_1_1_3.add(panel_6_1_3);

		final JPanel panel_7_1_3 = new JPanel();
		panel_7_1_3.setBackground(Color.WHITE);
		panel_7_1_3.setLayout(null);
		panel_7_1_3.setBounds(91, 32, 739, 78);
		panel_1_1_3.add(panel_7_1_3);

		final JDateChooser dcDate_1_2 = new JDateChooser();
		dcDate_1_2.setBounds(37, 10, 143, 22);
		panel_7_1_3.add(dcDate_1_2);

		final JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setPreferredSize(new Dimension(840, 229));
		add(panel_1_1_1_1);

		final JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_5_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_5_1_1_1.setLayout(null);
		panel_5_1_1_1.setBounds(0, -1, 840, 35);
		panel_1_1_1_1.add(panel_5_1_1_1);

		final JLabel a0100Label_1_1_1 = new JLabel();
		a0100Label_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1.setText("A2400. Medicare Stay");
		a0100Label_1_1_1.setBounds(11, 6, 180, 15);
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 34, 86, 194);
		panel_1_1_1_1.add(panel_6_1_1_1);

		final JLabel enterCodeLabel_1_1 = new JLabel();
		enterCodeLabel_1_1.setText("Enter Code");
		enterCodeLabel_1_1.setBounds(16, 9, 54, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_1);

		final JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1.setBounds(18, 31, 50, 20);
		panel_6_1_1_1.add(comboBox_1_1);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(85, 34, 755, 194);
		panel_1_1_1_1.add(panel_7_1_1_1);

		final JLabel aNationalProviderLabel_1_2_1_1 = new JLabel();
		aNationalProviderLabel_1_2_1_1
				.setFont(new Font("Tahoma", Font.BOLD, 12));
		aNationalProviderLabel_1_2_1_1
				.setText("<html><body><b>A.  Has the resident had a Medicare-covered stay since the most recent entry?");
		aNationalProviderLabel_1_2_1_1.setBounds(10, 5, 541, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_6 = new JLabel();
		aNationalProviderLabel_1_1_1_1_6.setFont(new Font("Tahoma", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_6
				.setText("<html><body>0. <b> No --></b> Skip to B0100, Camatose");
		aNationalProviderLabel_1_1_1_1_6.setBounds(32, 34, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_6);

		final JLabel aNationalProviderLabel_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_1_1_1_1_1
				.setText("<html><body>1. <b>Yes-->Continue to A2400B, Start date of most recent Medicare stay");
		aNationalProviderLabel_1_1_1_1_1_1.setBounds(32, 63, 519, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1
				.setText("<html><body><b> B.  Start date of most recent Medicare stay:");
		aNationalProviderLabel_1_1_1_1_2_1.setBounds(10, 84, 617, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1);

		final JLabel endDateLabel = new JLabel();
		endDateLabel
				.setText("<html><body><b>C.  End date of most recent Medicare stay ");
		endDateLabel.setBounds(10, 132, 241, 14);
		panel_7_1_1_1.add(endDateLabel);

		final JDateChooser dcDate_1_2_1 = new JDateChooser();
		dcDate_1_2_1.setBounds(49, 106, 143, 22);
		panel_7_1_1_1.add(dcDate_1_2_1);

		final JLabel enterDashesLabel = new JLabel();
		enterDashesLabel.setText("- Enter dashes if stay is ongoing");
		enterDashesLabel.setBounds(253, 131, 189, 14);
		panel_7_1_1_1.add(enterDashesLabel);

		final JDateChooser dcDate_1_2_1_1 = new JDateChooser();
		dcDate_1_2_1_1.setBounds(49, 154, 143, 22);
		panel_7_1_1_1.add(dcDate_1_2_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1.setText("New JLabel");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setBounds(25, 803, 617, 14);
		panel_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1);

		final JPanel panel_8 = new JPanel();
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_8.setLayout(flowLayout_7);
		panel_8.setBackground(Color.WHITE);
		panel_8.setPreferredSize(new Dimension(840, 30));
		add(panel_8);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_2.setFont(new Font("Arial",
				Font.PLAIN, 14));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_2
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		panel_8.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_2);
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
		PanelMDS3Page4 panel = new PanelMDS3Page4();
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
