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

public class PanelMDS3Page5 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7808217300003088520L;

	public PanelMDS3Page5() {
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

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 43, 840, 67);
		panel.add(panel_8);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_9.setLayout(null);
		panel_9.setBounds(10, 10, 820, 47);
		panel_8.add(panel_9);

		final JLabel lookBackPeriodLabel = new JLabel();
		lookBackPeriodLabel.setForeground(ColorConstants.MDS_FONT_COLOR);
		lookBackPeriodLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lookBackPeriodLabel
				.setText("Look back period for all items is 7 days unless another time frame is indicated");
		lookBackPeriodLabel.setBounds(44, 10, 735, 27);
		panel_9.add(lookBackPeriodLabel);

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
		sectionALabel.setText("Section B");
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
		identificationInformationLabel.setText("Hearing,Speech, and Vision");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(840, 110));
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
		a0100Label.setText("B0100.Comatose");
		panel_5.add(a0100Label);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 24, 84, 86);
		panel_1.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(91, 30, 739, 79);
		panel_1.add(panel_7);

		final JLabel aNationalProviderLabel = new JLabel();
		aNationalProviderLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel
				.setText("Persistent vegetative state/no discernible consciousness");
		aNationalProviderLabel.setBounds(10, 5, 333, 14);
		panel_7.add(aNationalProviderLabel);

		final JLabel label = new JLabel();
		label
				.setText("<html><body> 0. <b>No--></b> Continue to B0200, Hearing");
		label.setBounds(10, 25, 219, 14);
		panel_7.add(label);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body>1.<b>Yes --></b> Skip to G0110, Activities of Daily Living(ADL) Assistance ");
		label_1.setBounds(10, 45, 395, 27);
		panel_7.add(label_1);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 113));
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
		a0100Label_1.setText("B0200. Hearing");
		panel_5_1.add(a0100Label_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(8);
		panel_6_1.setLayout(flowLayout_4);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBounds(0, 23, 84, 90);
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
		panel_7_1.setBounds(91, 30, 739, 82);
		panel_1_1.add(panel_7_1);

		final JLabel aNationalProviderLabel_2 = new JLabel();
		aNationalProviderLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_2
				.setText("<html><body><b>Ability to hear</b>(with hearing aid or hearing appliances if normally used)");
		aNationalProviderLabel_2.setBounds(10, 5, 512, 14);
		panel_7_1.add(aNationalProviderLabel_2);

		final JLabel aNationalProviderLabel_1_2 = new JLabel();
		aNationalProviderLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_2
				.setText("<html><body>0. <b>Adequate</b> - no difficulty in normal conversation,social interaction,listening to TV");
		aNationalProviderLabel_1_2.setBounds(32, 25, 490, 14);
		panel_7_1.add(aNationalProviderLabel_1_2);

		final JLabel aNationalProviderLabel_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_1_1
				.setText("<html><body>1.<b>Minimal difficulty</b>-difficulty in some environments(e.g. when perosn speaks softly or setting is noisy)");
		aNationalProviderLabel_1_1_1.setBounds(32, 45, 642, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1);

		final JLabel label_2 = new JLabel();
		label_2
				.setText("<html><body>3. <b>Highly impaired</b>absence of useful hearing");
		label_2.setBounds(32, 65, 413, 14);
		panel_7_1.add(label_2);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setPreferredSize(new Dimension(840, 90));
		add(panel_1_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, -1, 840, 25);
		panel_1_1_1.add(panel_5_1_1);

		final JLabel a0100Label_1_1 = new JLabel();
		a0100Label_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1.setText("B0300. Hearing Aid");
		panel_5_1_1.add(a0100Label_1_1);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setVgap(8);
		panel_6_1_1.setLayout(flowLayout_7);
		panel_6_1_1.setBounds(0, 23, 84, 68);
		panel_1_1_1.add(panel_6_1_1);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(comboBox_1);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBackground(Color.WHITE);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(91, 30, 739, 58);
		panel_1_1_1.add(panel_7_1_1);

		final JLabel aNationalProviderLabel_2_1 = new JLabel();
		aNationalProviderLabel_2_1
				.setText("Hearing aid or other hearing appliance used");
		aNationalProviderLabel_2_1.setBounds(10, 5, 217, 14);
		panel_7_1_1.add(aNationalProviderLabel_2_1);

		final JLabel aNationalProviderLabel_1_2_1 = new JLabel();
		aNationalProviderLabel_1_2_1.setText("<html><body>0.<b>No</b>");
		aNationalProviderLabel_1_2_1.setBounds(32, 25, 490, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_2_1);

		final JLabel aNationalProviderLabel_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1.setText("<html><body>1.<b>Yes</b>");
		aNationalProviderLabel_1_1_1_1.setBounds(32, 45, 642, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1);

		final JLabel inCompletingB0200Label = new JLabel();
		inCompletingB0200Label.setText("in completing B0200, Hearing");
		inCompletingB0200Label.setBounds(233, 5, 192, 14);
		panel_7_1_1.add(inCompletingB0200Label);

		final JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setPreferredSize(new Dimension(840, 112));
		add(panel_1_1_1_1);

		final JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setHgap(10);
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1.setLayout(flowLayout_8);
		panel_5_1_1_1.setBounds(0, -1, 840, 25);
		panel_1_1_1_1.add(panel_5_1_1_1);

		final JLabel a0100Label_1_1_1 = new JLabel();
		a0100Label_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1.setText("B0300.  Hearing Clarity");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setVgap(8);
		panel_6_1_1_1.setLayout(flowLayout_9);
		panel_6_1_1_1.setBounds(0, 23, 84, 89);
		panel_1_1_1_1.add(panel_6_1_1_1);

		final JLabel enterCodeLabel_1_1 = new JLabel();
		enterCodeLabel_1_1.setText("Enter Code");
		panel_6_1_1_1.add(enterCodeLabel_1_1);

		final JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1_1.add(comboBox_1_1);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(91, 30, 739, 80);
		panel_1_1_1_1.add(panel_7_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1 = new JLabel();
		aNationalProviderLabel_2_1_1
				.setText("Select best description of speech pattern");
		aNationalProviderLabel_2_1_1.setBounds(10, 5, 246, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1);

		final JLabel aNationalProviderLabel_1_2_1_1 = new JLabel();
		aNationalProviderLabel_1_2_1_1
				.setText("<html><body>0. <b>Clear speech </b>- distinct intelligible words");
		aNationalProviderLabel_1_2_1_1.setBounds(32, 25, 490, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>1. <b>Unclear speech </b>- slurred or mumbled words");
		aNationalProviderLabel_1_1_1_1_1.setBounds(32, 45, 642, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_1);

		final JLabel label_3 = new JLabel();
		label_3
				.setText("<html><body>2.<b> No speech </b>- absence of spoken words");
		label_3.setBounds(32, 65, 305, 14);
		panel_7_1_1_1.add(label_3);

		final JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setPreferredSize(new Dimension(840, 135));
		add(panel_1_1_1_1_1);

		final JPanel panel_5_1_1_1_1 = new JPanel();
		panel_5_1_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setHgap(10);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1.setLayout(flowLayout_10);
		panel_5_1_1_1_1.setBounds(0, -1, 840, 25);
		panel_1_1_1_1_1.add(panel_5_1_1_1_1);

		final JLabel a0100Label_1_1_1_1 = new JLabel();
		a0100Label_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1.setText("B0700. Makes Self Understood");
		panel_5_1_1_1_1.add(a0100Label_1_1_1_1);

		final JPanel panel_6_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));

		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setVgap(8);
		panel_6_1_1_1_1.setLayout(flowLayout_11);
		panel_6_1_1_1_1.setBounds(0, 23, 84, 112);
		panel_1_1_1_1_1.add(panel_6_1_1_1_1);

		final JLabel enterCodeLabel_1_1_1 = new JLabel();
		enterCodeLabel_1_1_1.setText("Enter Code");
		panel_6_1_1_1_1.add(enterCodeLabel_1_1_1);

		final JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1_1_1.add(comboBox_1_1_1);

		final JPanel panel_7_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(91, 30, 739, 100);
		panel_1_1_1_1_1.add(panel_7_1_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1_1 = new JLabel();
		aNationalProviderLabel_2_1_1_1
				.setText("<html><body><b>Ability to express ideas and wants</b>, consider both verbal and non-verbal expression");
		aNationalProviderLabel_2_1_1_1.setBounds(10, 5, 512, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_2_1_1_1);

		final JLabel aNationalProviderLabel_1_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_2_1_1_1
				.setText("<html><body>0. <b>Understood</b>");
		aNationalProviderLabel_1_2_1_1_1.setBounds(32, 25, 490, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1_1
				.setText("<html><body>1. <b>Usually understood </b>- difficulty communication some words or finishing thoughts but is able if prompted or given time ");
		aNationalProviderLabel_1_1_1_1_1_1.setBounds(32, 45, 642, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1);

		final JLabel label_3_1 = new JLabel();
		label_3_1
				.setText("<html><body>2. <b>Sometimes understood </b>- ability is limited to making concrete requests");
		label_3_1.setBounds(32, 65, 396, 14);
		panel_7_1_1_1_1.add(label_3_1);

		final JLabel label_4 = new JLabel();
		label_4.setText("<html><body>3. <b>Rarely/never understood</b>");
		label_4.setBounds(32, 85, 410, 14);
		panel_7_1_1_1_1.add(label_4);

		final JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1.setPreferredSize(new Dimension(840, 135));
		add(panel_1_1_1_1_1_1);

		final JPanel panel_5_1_1_1_1_1 = new JPanel();
		panel_5_1_1_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_1.setLayout(flowLayout_12);
		panel_5_1_1_1_1_1.setBounds(0, -1, 840, 25);
		panel_1_1_1_1_1_1.add(panel_5_1_1_1_1_1);

		final JLabel a0100Label_1_1_1_1_1 = new JLabel();
		a0100Label_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1_1.setText("B0800. Ability To Understand Others");
		panel_5_1_1_1_1_1.add(a0100Label_1_1_1_1_1);

		final JPanel panel_6_1_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_13 = new FlowLayout();
		flowLayout_13.setVgap(8);
		panel_6_1_1_1_1_1.setLayout(flowLayout_13);
		panel_6_1_1_1_1_1.setBounds(0, 23, 84, 112);
		panel_1_1_1_1_1_1.add(panel_6_1_1_1_1_1);

		final JLabel enterCodeLabel_1_1_1_1 = new JLabel();
		enterCodeLabel_1_1_1_1.setText("Enter Code");
		panel_6_1_1_1_1_1.add(enterCodeLabel_1_1_1_1);

		final JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1_1
				.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1_1.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1_1_1_1.add(comboBox_1_1_1_1);

		final JPanel panel_7_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBounds(91, 30, 739, 100);
		panel_1_1_1_1_1_1.add(panel_7_1_1_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1_1_1 = new JLabel();
		aNationalProviderLabel_2_1_1_1_1
				.setText("<html><body><b>Understanding verbal content,however able</b> (with hearing aid or device if used)");
		aNationalProviderLabel_2_1_1_1_1.setBounds(10, 5, 458, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_2_1_1_1_1);

		final JLabel aNationalProviderLabel_1_2_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_2_1_1_1_1
				.setText("<html><body>0. <b>Understands</b> - clear comprehension");
		aNationalProviderLabel_1_2_1_1_1_1.setBounds(32, 25, 490, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1_1_1
				.setText("<html><body>1.<b>Usually understands</b> - misses some part/intend of message but comprehends most conversation");
		aNationalProviderLabel_1_1_1_1_1_1_1.setBounds(32, 45, 642, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1_1);

		final JLabel label_3_1_1 = new JLabel();
		label_3_1_1
				.setText("<html><body>2. <b>Sometimes understands </b>- responds adequately to simple, direct communicatiion only");
		label_3_1_1.setBounds(32, 65, 396, 14);
		panel_7_1_1_1_1_1.add(label_3_1_1);

		final JLabel label_4_1 = new JLabel();
		label_4_1.setText("<html><body>3. <b>Rarely/nerver understands</b>");
		label_4_1.setBounds(32, 85, 410, 14);
		panel_7_1_1_1_1_1.add(label_4_1);

		final JPanel panel_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1.setPreferredSize(new Dimension(840, 135));
		add(panel_1_1_1_1_1_1_1);

		final JPanel panel_5_1_1_1_1_1_1 = new JPanel();
		panel_5_1_1_1_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_14 = new FlowLayout();
		flowLayout_14.setHgap(10);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_1_1.setLayout(flowLayout_14);
		panel_5_1_1_1_1_1_1.setBounds(0, -1, 840, 25);
		panel_1_1_1_1_1_1_1.add(panel_5_1_1_1_1_1_1);

		final JLabel a0100Label_1_1_1_1_1_1 = new JLabel();
		a0100Label_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1_1_1.setText("B1000. Vision");
		panel_5_1_1_1_1_1_1.add(a0100Label_1_1_1_1_1_1);

		final JPanel panel_6_1_1_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_15 = new FlowLayout();
		flowLayout_15.setVgap(8);
		panel_6_1_1_1_1_1_1.setLayout(flowLayout_15);
		panel_6_1_1_1_1_1_1.setBounds(0, 23, 84, 112);
		panel_1_1_1_1_1_1_1.add(panel_6_1_1_1_1_1_1);

		final JLabel enterCodeLabel_1_1_1_1_1 = new JLabel();
		enterCodeLabel_1_1_1_1_1.setText("Enter Code");
		panel_6_1_1_1_1_1_1.add(enterCodeLabel_1_1_1_1_1);

		final JComboBox comboBox_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1_1_1.setModel(new DefaultComboBoxModel(
				new String[] { "" }));
		comboBox_1_1_1_1_1.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1_1_1_1_1.add(comboBox_1_1_1_1_1);

		final JPanel panel_7_1_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1_1.setBounds(91, 30, 739, 100);
		panel_1_1_1_1_1_1_1.add(panel_7_1_1_1_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_2_1_1_1_1_1
				.setText("<html><body><b>Ability to see in adequate light</b>(with glasses or other visual appliances)");
		aNationalProviderLabel_2_1_1_1_1_1.setBounds(10, 5, 458, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_2_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_2_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_2_1_1_1_1_1
				.setText("<html><body>0. <b>Adequate</b> - sees fine detail, including reqular print in newspapers/books");
		aNationalProviderLabel_1_2_1_1_1_1_1.setBounds(32, 25, 490, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1_1_1_1
				.setText("<html><body>1. <b>Impaired </b>- sees large print, but not regular print in newspapers/books");
		aNationalProviderLabel_1_1_1_1_1_1_1_1.setBounds(32, 45, 642, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1_1_1);

		final JLabel label_3_1_1_1 = new JLabel();
		label_3_1_1_1
				.setText("<html><body>2. <b>Moderately impaired</b> - limited vision; not able to see newspaper headlines but can identify objects");
		label_3_1_1_1.setBounds(32, 65, 527, 14);
		panel_7_1_1_1_1_1_1.add(label_3_1_1_1);

		final JLabel label_4_1_1 = new JLabel();
		label_4_1_1
				.setText("<html><body>3. <b>Severely impaired </b>- no vision or sees only light, colors or shapes; eyes do not appear to follow objects");
		label_4_1_1.setBounds(32, 85, 583, 14);
		panel_7_1_1_1_1_1_1.add(label_4_1_1);

		final JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBackground(Color.WHITE);
		panel_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setPreferredSize(new Dimension(840, 90));
		add(panel_1_1_1_2);

		final JPanel panel_5_1_1_2 = new JPanel();
		panel_5_1_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_16 = new FlowLayout();
		flowLayout_16.setHgap(10);
		flowLayout_16.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2.setLayout(flowLayout_16);
		panel_5_1_1_2.setBounds(0, -1, 840, 25);
		panel_1_1_1_2.add(panel_5_1_1_2);

		final JLabel a0100Label_1_1_2 = new JLabel();
		a0100Label_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2.setText("B1200. Corrective Lenses");
		panel_5_1_1_2.add(a0100Label_1_1_2);

		final JPanel panel_6_1_1_2 = new JPanel();
		panel_6_1_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_17 = new FlowLayout();
		flowLayout_17.setVgap(8);
		panel_6_1_1_2.setLayout(flowLayout_17);
		panel_6_1_1_2.setBounds(0, 23, 84, 67);
		panel_1_1_1_2.add(panel_6_1_1_2);

		final JLabel enterCodeLabel_1_2 = new JLabel();
		enterCodeLabel_1_2.setText("Enter Code");
		panel_6_1_1_2.add(enterCodeLabel_1_2);

		final JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBackground(Color.WHITE);
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_2.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1_2.add(comboBox_1_2);

		final JPanel panel_7_1_1_2 = new JPanel();
		panel_7_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_2.setLayout(null);
		panel_7_1_1_2.setBounds(91, 30, 739, 58);
		panel_1_1_1_2.add(panel_7_1_1_2);

		final JLabel aNationalProviderLabel_2_1_2 = new JLabel();
		aNationalProviderLabel_2_1_2
				.setText("<html><body><b>Corrective lenses(contacts,glasses,or magnifying glass) used </b>in completing B1000, Vision");
		aNationalProviderLabel_2_1_2.setBounds(10, 5, 483, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_2_1_2);

		final JLabel aNationalProviderLabel_1_2_1_2 = new JLabel();
		aNationalProviderLabel_1_2_1_2.setText("<html><body>0. <b>No</b>");
		aNationalProviderLabel_1_2_1_2.setBounds(32, 25, 490, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_2_1_2);

		final JLabel aNationalProviderLabel_1_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2.setText("<html><body>1.<b>Yes</b>");
		aNationalProviderLabel_1_1_1_1_2.setBounds(32, 45, 642, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_1_1_1_2);

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
		PanelMDS3Page5 panel = new PanelMDS3Page5();
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
