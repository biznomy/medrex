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

public class PanelMDS3Page20 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7041381164725264559L;

	public PanelMDS3Page20() {
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
		sectionALabel.setText("Section J");
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
		identificationInformationLabel.setText("Health Condition");
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
				.setText("J0700. Should the staff Assessment for pain be conducted?");
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
				.setText("<html><body>0.<b>  No </b>(J0400 =1 thru 4)-> skip to J1100, Shortness of breath(dyspnea)");
		aNationalProviderLabel_3.setBounds(10, 5, 607, 14);
		panel_7_2.add(aNationalProviderLabel_3);

		final JLabel aNationalProviderLabel_1_3 = new JLabel();
		aNationalProviderLabel_1_3
				.setText("<html><body>01. <b>Yes</b>(J0400 = 9)-> Continue to J0800, Indicators of pain or possible Pain ");
		aNationalProviderLabel_1_3.setBounds(10, 25, 679, 14);
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
		panel_1_1_1.setPreferredSize(new Dimension(820, 335));

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
		a0100Label_1_1_1.setText("Staff Assessment for Pain");
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
		a0100Label_1_1
				.setText("J0800. Indicators of Pain or possible Pain in the last 5 days.");
		panel_5_1_1.add(a0100Label_1_1);

		final JPanel panel_5_1_1_3 = new JPanel();
		panel_5_1_1_3.setBackground(Color.WHITE);
		panel_5_1_1_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_3.setLayout(flowLayout_12);
		panel_5_1_1_3.setPreferredSize(new Dimension(820, 30));
		panel_1_1_1.add(panel_5_1_1_3);

		final JLabel a0100Label_1_1_3 = new JLabel();
		a0100Label_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		a0100Label_1_1_3.setText("Check all that apply");
		panel_5_1_1_3.add(a0100Label_1_1_3);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1_1.add(panel_1_1);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(820, 146));

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setVgap(8);
		panel_6_1.setLayout(flowLayout_9);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBounds(0, 0, 67, 146);
		panel_1_1.add(panel_6_1);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(66, 0, 754, 28);
		panel_1_1.add(panel_7_1);

		final JLabel aNationalProviderLabel_3_1 = new JLabel();
		aNationalProviderLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_3_1
				.setText("<html><b>A. Non Verbal sounds</b>(eg. crying,  whining, gasping, moaning or groaning)");
		aNationalProviderLabel_3_1.setBounds(10, 5, 706, 14);
		panel_7_1.add(aNationalProviderLabel_3_1);

		final JPanel panel_7_1_3 = new JPanel();
		panel_7_1_3.setBackground(Color.WHITE);
		panel_7_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_3.setLayout(null);
		panel_7_1_3.setBounds(66, 27, 754, 28);
		panel_1_1.add(panel_7_1_3);

		final JLabel aNationalProviderLabel_3_1_2 = new JLabel();
		aNationalProviderLabel_3_1_2
				.setText("<html><b>B. Vocal complaints of pain </b>(eg. that hurts , ouch , stop)");
		aNationalProviderLabel_3_1_2.setBounds(10, 5, 706, 14);
		panel_7_1_3.add(aNationalProviderLabel_3_1_2);

		final JPanel panel_7_1_4 = new JPanel();
		panel_7_1_4.setBackground(Color.WHITE);
		panel_7_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_4.setLayout(null);
		panel_7_1_4.setBounds(66, 54, 754, 28);
		panel_1_1.add(panel_7_1_4);

		final JLabel aNationalProviderLabel_3_1_3 = new JLabel();
		aNationalProviderLabel_3_1_3
				.setText("<html><b>C. Facial Expressions </b>(eg. grimaces , winces, wrinkled forehead, furrowed brow ,cleanched teeth or jaw)");
		aNationalProviderLabel_3_1_3.setBounds(10, 5, 706, 14);
		panel_7_1_4.add(aNationalProviderLabel_3_1_3);

		final JPanel panel_7_1_5 = new JPanel();
		panel_7_1_5.setBackground(Color.WHITE);
		panel_7_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_5.setLayout(null);
		panel_7_1_5.setBounds(66, 81, 754, 28);
		panel_1_1.add(panel_7_1_5);

		final JLabel aNationalProviderLabel_3_1_4 = new JLabel();
		aNationalProviderLabel_3_1_4
				.setText("<html><b>D. Protective body movement or postures</b>(eg. bracing , guarding, rubbing or massaging, a body part area , clutching or<br>holding a body part during movement)");
		aNationalProviderLabel_3_1_4.setBounds(10, 0, 706, 28);
		panel_7_1_5.add(aNationalProviderLabel_3_1_4);

		final JPanel panel_7_1_6 = new JPanel();
		panel_7_1_6.setBackground(Color.WHITE);
		panel_7_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_6.setLayout(null);
		panel_7_1_6.setBounds(66, 108, 754, 38);
		panel_1_1.add(panel_7_1_6);

		final JLabel aNationalProviderLabel_3_1_5 = new JLabel();
		aNationalProviderLabel_3_1_5
				.setText("<html><b>Z. None of these signs observed or documented.");
		aNationalProviderLabel_3_1_5.setBounds(10, 5, 706, 14);
		panel_7_1_6.add(aNationalProviderLabel_3_1_5);

		final JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(Color.WHITE);
		panel_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(820, 100));
		panel_1_1_1.add(panel_1_1_2);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBounds(0, 29, 84, 71);
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

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1.setOpaque(false);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(83, 29, 737, 71);
		panel_1_1_2.add(panel_7_1_1);

		final JPanel panel_7_1_2 = new JPanel();
		panel_7_1_2.setOpaque(false);
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(10, 3, 719, 68);
		panel_7_1_1.add(panel_7_1_2);

		final JLabel aNationalProviderLabel_3_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_3_1_1
				.setText("Frequency with which resident complain or shows evidence of pain or possible pain.");
		aNationalProviderLabel_3_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_2.add(aNationalProviderLabel_3_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2
				.setText("<html><body>1. <b>Indicators of pain</b> or possible pain observed 1 to 2 days");
		aNationalProviderLabel_1_3_1_2.setBounds(20, 22, 311, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_3_1_2);

		final JLabel aNationalProviderLabel_1_3_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1
				.setText("<html><body>2. <b>Indicators of pain</b>or possible pain observed 3 to 4 days");
		aNationalProviderLabel_1_3_1_1_1.setBounds(20, 40, 311, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_3_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_2
				.setText("<html><body>3. <b>Indicators of pain</b>or possible pain observed Daily");
		aNationalProviderLabel_1_3_1_1_1_2.setBounds(20, 54, 311, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_3_1_1_1_2);

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
		a0100Label_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2
				.setText("J0850. Frequency of indicator of Pain or Possible Pain in the last 5 days");
		panel_5_1_1_2.add(a0100Label_1_1_2);

		final JPanel panel_1_1_2_1 = new JPanel();
		add(panel_1_1_2_1);
		panel_1_1_2_1.setBackground(Color.WHITE);
		panel_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setPreferredSize(new Dimension(840, 151));

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 50, 84, 100);
		panel_1_1_2_1.add(panel_6_1_1_1);

		final JPanel panel_5_1_1_2_1 = new JPanel();
		panel_5_1_1_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setVgap(0);
		flowLayout_10.setHgap(10);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1.setLayout(flowLayout_10);
		panel_5_1_1_2_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1.setBounds(0, 0, 840, 30);
		panel_1_1_2_1.add(panel_5_1_1_2_1);

		final JLabel a0100Label_1_1_2_1 = new JLabel();
		a0100Label_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2_1
				.setText("<html><b>Other Health Coditions<br>J1100 Shortness of Breath(dyspnea)");
		panel_5_1_1_2_1.add(a0100Label_1_1_2_1);

		final JPanel panel_5_1_1_2_1_1 = new JPanel();
		panel_5_1_1_2_1_1.setBackground(Color.WHITE);
		panel_5_1_1_2_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_13 = new FlowLayout();
		flowLayout_13.setVgap(0);
		flowLayout_13.setHgap(10);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1.setLayout(flowLayout_13);
		panel_5_1_1_2_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1.setBounds(0, 30, 840, 20);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1);

		final JLabel a0100Label_1_1_2_1_1 = new JLabel();
		a0100Label_1_1_2_1_1.setText("Check all that apply");
		panel_5_1_1_2_1_1.add(a0100Label_1_1_2_1_1);

		final JPanel panel_5_1_1_2_1_1_1 = new JPanel();
		panel_5_1_1_2_1_1_1.setOpaque(false);
		panel_5_1_1_2_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_14 = new FlowLayout();
		flowLayout_14.setVgap(0);
		flowLayout_14.setHgap(10);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1_1.setLayout(flowLayout_14);
		panel_5_1_1_2_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1.setBounds(84, 50, 756, 20);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1);

		final JLabel a0100Label_1_1_2_1_1_1 = new JLabel();
		a0100Label_1_1_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		a0100Label_1_1_2_1_1_1
				.setText("<html><b>A. Shortness of breath </b> or trouble breathing<b> with exertion </b>(eg. walking ,bathing, transferring)");
		panel_5_1_1_2_1_1_1.add(a0100Label_1_1_2_1_1_1);

		final JPanel panel_5_1_1_2_1_1_1_1 = new JPanel();
		panel_5_1_1_2_1_1_1_1.setOpaque(false);
		panel_5_1_1_2_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_15 = new FlowLayout();
		flowLayout_15.setVgap(0);
		flowLayout_15.setHgap(10);
		flowLayout_15.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1_1_1.setLayout(flowLayout_15);
		panel_5_1_1_2_1_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_1.setBounds(84, 70, 756, 20);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_1);

		final JLabel a0100Label_1_1_2_1_1_1_1 = new JLabel();
		a0100Label_1_1_2_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		a0100Label_1_1_2_1_1_1_1
				.setText("<html><b>B. Shortness of breath </b> or trouble breathing<b> when sitting at rest.");
		panel_5_1_1_2_1_1_1_1.add(a0100Label_1_1_2_1_1_1_1);

		final JPanel panel_5_1_1_2_1_1_1_2 = new JPanel();
		panel_5_1_1_2_1_1_1_2.setOpaque(false);
		panel_5_1_1_2_1_1_1_2.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_16 = new FlowLayout();
		flowLayout_16.setVgap(0);
		flowLayout_16.setHgap(10);
		flowLayout_16.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1_1_2.setLayout(flowLayout_16);
		panel_5_1_1_2_1_1_1_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_2.setBounds(84, 90, 756, 20);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_2);

		final JLabel a0100Label_1_1_2_1_1_1_2 = new JLabel();
		a0100Label_1_1_2_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2_1_1_1_2.setText("C. Staff names and faces");
		panel_5_1_1_2_1_1_1_2.add(a0100Label_1_1_2_1_1_1_2);

		final JPanel panel_5_1_1_2_1_1_1_3 = new JPanel();
		panel_5_1_1_2_1_1_1_3.setOpaque(false);
		panel_5_1_1_2_1_1_1_3.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_17 = new FlowLayout();
		flowLayout_17.setVgap(0);
		flowLayout_17.setHgap(10);
		flowLayout_17.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1_1_3.setLayout(flowLayout_17);
		panel_5_1_1_2_1_1_1_3.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_3.setBounds(84, 110, 756, 20);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_3);

		final JLabel a0100Label_1_1_2_1_1_1_3 = new JLabel();
		a0100Label_1_1_2_1_1_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2_1_1_1_3
				.setText("D. That he or she is in nursing home");
		panel_5_1_1_2_1_1_1_3.add(a0100Label_1_1_2_1_1_1_3);

		final JPanel panel_5_1_1_2_1_1_1_4 = new JPanel();
		panel_5_1_1_2_1_1_1_4.setOpaque(false);
		panel_5_1_1_2_1_1_1_4.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_18 = new FlowLayout();
		flowLayout_18.setVgap(0);
		flowLayout_18.setHgap(10);
		flowLayout_18.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1_1_4.setLayout(flowLayout_18);
		panel_5_1_1_2_1_1_1_4.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_4.setBounds(84, 130, 756, 20);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_4);

		final JLabel a0100Label_1_1_2_1_1_1_4 = new JLabel();
		a0100Label_1_1_2_1_1_1_4
				.setText("<html>Z. <b>None of the above</b> were recalled");
		panel_5_1_1_2_1_1_1_4.add(a0100Label_1_1_2_1_1_1_4);

		final JPanel panel_5 = new JPanel();
		final FlowLayout flowLayout_22 = new FlowLayout();
		flowLayout_22.setVgap(0);
		flowLayout_22.setHgap(0);
		panel_5.setLayout(flowLayout_22);
		panel_5.setBackground(Color.WHITE);
		panel_5.setPreferredSize(new Dimension(840, 300));
		add(panel_5);

		final JPanel panel_5_1_1_2_2_1 = new JPanel();
		panel_5_1_1_2_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2_2_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_20 = new FlowLayout();
		flowLayout_20.setHgap(10);
		flowLayout_20.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_2_1.setLayout(flowLayout_20);
		panel_5_1_1_2_2_1.setPreferredSize(new Dimension(840, 30));
		panel_5.add(panel_5_1_1_2_2_1);

		final JLabel a0100Label_1_1_2_2_1 = new JLabel();
		a0100Label_1_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2_2_1.setText("Delirium");
		panel_5_1_1_2_2_1.add(a0100Label_1_1_2_2_1);

		final JPanel panel_5_1_1_2_2_1_1 = new JPanel();
		panel_5_1_1_2_2_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2_2_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_21 = new FlowLayout();
		flowLayout_21.setHgap(10);
		flowLayout_21.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_2_1_1.setLayout(flowLayout_21);
		panel_5_1_1_2_2_1_1.setPreferredSize(new Dimension(840, 30));
		panel_5.add(panel_5_1_1_2_2_1_1);

		final JLabel a0100Label_1_1_2_2_1_1 = new JLabel();
		a0100Label_1_1_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2_2_1_1
				.setText("C1300. Signs and symptoms of Delirium(from CAM@)");
		panel_5_1_1_2_2_1_1.add(a0100Label_1_1_2_2_1_1);

		final JPanel panel_5_1_1_2_2_1_1_1 = new JPanel();
		panel_5_1_1_2_2_1_1_1.setOpaque(false);
		panel_5_1_1_2_2_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_23 = new FlowLayout();
		flowLayout_23.setVgap(0);
		flowLayout_23.setHgap(10);
		flowLayout_23.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_2_1_1_1.setLayout(flowLayout_23);
		panel_5_1_1_2_2_1_1_1.setPreferredSize(new Dimension(840, 20));
		panel_5.add(panel_5_1_1_2_2_1_1_1);

		final JLabel a0100Label_1_1_2_2_1_1_1 = new JLabel();
		a0100Label_1_1_2_2_1_1_1
				.setText("<html>Code <b>after completing </b>Brief interview for Mental Status or staff assessment , and reviewing medical record");
		panel_5_1_1_2_2_1_1_1.add(a0100Label_1_1_2_2_1_1_1);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setPreferredSize(new Dimension(840, 220));
		panel_5.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 197, 220);
		panel_6.add(panel_7);

		final JLabel codingLabel = new JLabel();
		codingLabel.setText("Coding");
		codingLabel.setBounds(10, 10, 49, 14);
		panel_7.add(codingLabel);

		final JLabel label = new JLabel();
		label.setText("<html>0. <b>Behavior not present");
		label.setBounds(20, 30, 167, 14);
		panel_7.add(label);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html>1. <b>Behavior continuously<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;present , does not <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fluctuate");
		label_1.setBounds(20, 57, 167, 42);
		panel_7.add(label_1);

		final JLabel label_1_1 = new JLabel();
		label_1_1
				.setText("<html>2. <b>Behavior present<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fluctuates</b>(comes and <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;goes , changes in severity)");
		label_1_1.setBounds(20, 117, 167, 42);
		panel_7.add(label_1_1);

		final JPanel panel_9 = new JPanel();
		final FlowLayout flowLayout_24 = new FlowLayout();
		flowLayout_24.setAlignment(FlowLayout.LEFT);
		flowLayout_24.setVgap(0);
		panel_9.setLayout(flowLayout_24);
		panel_9.setOpaque(false);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBounds(196, 0, 644, 17);
		panel_6.add(panel_9);

		final JLabel enterCodeInLabel = new JLabel();
		enterCodeInLabel.setText("Enter Code in Boxes");
		panel_9.add(enterCodeInLabel);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBounds(196, 16, 39, 204);
		panel_6.add(panel_10);

		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(2, 10, 34, 21);
		panel_10.add(comboBox_3);

		final JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_3_1.setBackground(Color.WHITE);
		comboBox_3_1.setBounds(2, 51, 34, 21);
		panel_10.add(comboBox_3_1);

		final JComboBox comboBox_3_2 = new JComboBox();
		comboBox_3_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_3_2.setBackground(Color.WHITE);
		comboBox_3_2.setBounds(2, 103, 34, 21);
		panel_10.add(comboBox_3_2);

		final JComboBox comboBox_3_3 = new JComboBox();
		comboBox_3_3.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_3_3.setBackground(Color.WHITE);
		comboBox_3_3.setBounds(2, 173, 34, 21);
		panel_10.add(comboBox_3_3);

		final JPanel panel_11 = new JPanel();
		final FlowLayout flowLayout_25 = new FlowLayout();
		flowLayout_25.setHgap(30);
		flowLayout_25.setAlignment(FlowLayout.LEFT);
		panel_11.setLayout(flowLayout_25);
		panel_11.setOpaque(false);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBounds(234, 16, 606, 40);
		panel_6.add(panel_11);

		final JLabel aInattentionLabel = new JLabel();
		aInattentionLabel
				.setText("<html><b>A.  Inattention - </b> Did the resident have difficulty focusing attention (easily distracted, out of touch or <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; dificulty following what was said)?");
		panel_11.add(aInattentionLabel);

		final JPanel panel_11_1 = new JPanel();
		final FlowLayout flowLayout_26 = new FlowLayout();
		flowLayout_26.setHgap(30);
		flowLayout_26.setAlignment(FlowLayout.LEFT);
		panel_11_1.setLayout(flowLayout_26);
		panel_11_1.setOpaque(false);
		panel_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_1.setBounds(234, 55, 606, 40);
		panel_6.add(panel_11_1);

		final JLabel aInattentionLabel_1 = new JLabel();
		aInattentionLabel_1
				.setText("<html><b>B. Disorganized thinking -</b> was the resident thinking disorganized or incoherent(rambling or irrelevant<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; conversation, unclear or illogical flow of ideas, or unpredictable switching from subject to subject)?");
		panel_11_1.add(aInattentionLabel_1);

		final JPanel panel_11_2 = new JPanel();
		final FlowLayout flowLayout_27 = new FlowLayout();
		flowLayout_27.setHgap(30);
		flowLayout_27.setAlignment(FlowLayout.LEFT);
		panel_11_2.setLayout(flowLayout_27);
		panel_11_2.setOpaque(false);
		panel_11_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_2.setBounds(234, 94, 606, 81);
		panel_6.add(panel_11_2);

		final JLabel aInattentionLabel_1_1 = new JLabel();
		aInattentionLabel_1_1
				.setText("<html><b>C. Altered level of consciousness</b> - Dis the resident have altered level of consciousness(eg. <b>vigilant</b>-<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; startled easily to any sound or touch ;<b>lethargic</b>- repeatedly dozed off when being asked questions, but<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; responded to voice or touch ; <b>stuporous</b> - very difficult to arouse and keep aroused for the interview;<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>comatose</b> - could not be aroused");
		panel_11_2.add(aInattentionLabel_1_1);

		final JPanel panel_11_3 = new JPanel();
		final FlowLayout flowLayout_28 = new FlowLayout();
		flowLayout_28.setAlignment(FlowLayout.LEFT);
		flowLayout_28.setHgap(30);
		panel_11_3.setLayout(flowLayout_28);
		panel_11_3.setOpaque(false);
		panel_11_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_3.setBounds(234, 174, 606, 46);
		panel_6.add(panel_11_3);

		final JLabel aInattentionLabel_1_2 = new JLabel();
		aInattentionLabel_1_2
				.setText("<html><b>D. Psycomotor Retardation -</b> Did the resident have an unusaually decreased level of activity such as <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;sluggishness , starting into space , staying in one position, moving very slowly");
		panel_11_3.add(aInattentionLabel_1_2);

		final JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setPreferredSize(new Dimension(840, 80));
		add(panel_1_2_1);

		final JPanel panel_5_2_1 = new JPanel();
		panel_5_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_29 = new FlowLayout();
		flowLayout_29.setHgap(10);
		flowLayout_29.setAlignment(FlowLayout.LEFT);
		panel_5_2_1.setLayout(flowLayout_29);
		panel_5_2_1.setBounds(0, 0, 840, 25);
		panel_1_2_1.add(panel_5_2_1);

		final JLabel a0100Label_2_1 = new JLabel();
		a0100Label_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_2_1.setText("C1600 . Acute Onset Mental Status Change");
		panel_5_2_1.add(a0100Label_2_1);

		final JPanel panel_6_2_1 = new JPanel();
		panel_6_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBounds(0, 24, 84, 56);
		panel_1_2_1.add(panel_6_2_1);

		final JLabel enterCodeLabel_2_1 = new JLabel();
		enterCodeLabel_2_1.setText("Enter Code");
		enterCodeLabel_2_1.setBounds(10, 10, 54, 14);
		panel_6_2_1.add(enterCodeLabel_2_1);

		final JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_2_1.setBackground(Color.WHITE);
		comboBox_2_1.setPreferredSize(new Dimension(50, 20));
		comboBox_2_1.setBounds(10, 30, 50, 20);
		panel_6_2_1.add(comboBox_2_1);

		final JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setOpaque(false);
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(91, 30, 739, 40);
		panel_1_2_1.add(panel_7_2_1);

		final JLabel aNationalProviderLabel_3_2 = new JLabel();
		aNationalProviderLabel_3_2
				.setText("<html><b>Is there evidence of acute change in mental status </b> from the resident's baseline?");
		aNationalProviderLabel_3_2.setBounds(10, 5, 607, 14);
		panel_7_2_1.add(aNationalProviderLabel_3_2);

		final JLabel aNationalProviderLabel_1_3_2 = new JLabel();
		aNationalProviderLabel_1_3_2.setText("<html>0. <b>NO");
		aNationalProviderLabel_1_3_2.setBounds(10, 25, 49, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_2);

		final JLabel aNationalProviderLabel_1_3_2_1 = new JLabel();
		aNationalProviderLabel_1_3_2_1.setText("<html>1. <b>Yes");
		aNationalProviderLabel_1_3_2_1.setBounds(78, 25, 62, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_2_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JLabel();
		add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setPreferredSize(new Dimension(820, 30));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("<html>Copyright (c) 1990 Annals of internal medicines. All rights reserved. Adapted with permission.<br>MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");

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
		PanelMDS3Page7 panel = new PanelMDS3Page7();
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
