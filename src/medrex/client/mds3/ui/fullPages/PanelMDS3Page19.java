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

public class PanelMDS3Page19 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6173201364547050980L;

	public PanelMDS3Page19() {
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
		identificationInformationLabel.setText("Health Conditions");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_1_1_2_2 = new JPanel();
		panel_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_2.setLayout(null);
		panel_1_1_2_2.setPreferredSize(new Dimension(840, 210));
		add(panel_1_1_2_2);

		final JPanel panel_6_1_1_2 = new JPanel();
		panel_6_1_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_2.setLayout(null);
		panel_6_1_1_2.setBounds(0, 29, 84, 181);
		panel_1_1_2_2.add(panel_6_1_1_2);

		final JLabel enterCodeLabel_1_3 = new JLabel();
		enterCodeLabel_1_3.setText("Enter Code");
		enterCodeLabel_1_3.setBounds(15, 9, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_3);

		final JComboBox comboBox_1_3 = new JComboBox();
		comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_1_3.setBackground(Color.WHITE);
		comboBox_1_3.setPreferredSize(new Dimension(50, 20));
		comboBox_1_3.setBounds(17, 31, 50, 20);
		panel_6_1_1_2.add(comboBox_1_3);

		final JLabel enterCodeLabel_1_1_3 = new JLabel();
		enterCodeLabel_1_1_3.setText("Enter Code");
		enterCodeLabel_1_1_3.setBounds(15, 68, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_1_3);

		final JComboBox comboBox_1_1_3 = new JComboBox();
		comboBox_1_1_3.setModel(new DefaultComboBoxModel(new String[] { "",
				"0", "1" }));
		comboBox_1_1_3.setBackground(Color.WHITE);
		comboBox_1_1_3.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_3.setBounds(15, 88, 50, 20);
		panel_6_1_1_2.add(comboBox_1_1_3);

		final JLabel enterCodeLabel_1_1_2_1 = new JLabel();
		enterCodeLabel_1_1_2_1.setText("Enter Code");
		enterCodeLabel_1_1_2_1.setBounds(15, 130, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_1_2_1);

		final JComboBox comboBox_1_1_2_1 = new JComboBox();
		comboBox_1_1_2_1.setModel(new DefaultComboBoxModel(new String[] { "",
				"0", "1" }));
		comboBox_1_1_2_1.setBackground(Color.WHITE);
		comboBox_1_1_2_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_2_1.setBounds(15, 150, 50, 20);
		panel_6_1_1_2.add(comboBox_1_1_2_1);

		final JPanel panel_7_1_1_3 = new JPanel();
		panel_7_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_3.setLayout(null);
		panel_7_1_1_3.setBounds(83, 29, 757, 61);
		panel_1_1_2_2.add(panel_7_1_1_3);

		final JLabel aNationalProviderLabel_3_1_1_3 = new JLabel();
		aNationalProviderLabel_3_1_1_3
				.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_3_1_1_3
				.setText("A. Been on a scheduled pain medical regiment?");
		aNationalProviderLabel_3_1_1_3.setBounds(10, 5, 706, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_3_1_1_3);

		final JLabel aNationalProviderLabel_1_3_1_5_2 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_3_1_5_2.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2.setBounds(20, 25, 311, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_1_3_1_5_2);

		final JLabel aNationalProviderLabel_1_3_1_5_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_1.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1.setBounds(20, 45, 311, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_1_3_1_5_2_1);

		final JPanel panel_5_1_1_2_2 = new JPanel();
		panel_5_1_1_2_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setVgap(0);
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_2.setLayout(flowLayout_12);
		panel_5_1_1_2_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_2.setBounds(0, 0, 840, 30);
		panel_1_1_2_2.add(panel_5_1_1_2_2);

		final JLabel a0100Label_1_1_2_2 = new JLabel();
		a0100Label_1_1_2_2
				.setText("<html><b>J0100. Pain Management - </b>Complete for all residents, regardless of current pain level<br> at any time in the last 5 days, has the resident:");
		panel_5_1_1_2_2.add(a0100Label_1_1_2_2);

		final JPanel panel_7_1_1_3_1 = new JPanel();
		panel_7_1_1_3_1.setBackground(Color.WHITE);
		panel_7_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_3_1.setLayout(null);
		panel_7_1_1_3_1.setBounds(83, 89, 757, 61);
		panel_1_1_2_2.add(panel_7_1_1_3_1);

		final JLabel aNationalProviderLabel_3_1_1_3_1 = new JLabel();
		aNationalProviderLabel_3_1_1_3_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_3_1_1_3_1
				.setText("B. Recieved PRN pain medication");
		aNationalProviderLabel_3_1_1_3_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_3_1.add(aNationalProviderLabel_3_1_1_3_1);

		final JLabel aNationalProviderLabel_1_3_1_5_2_2 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_2.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2_2.setBounds(20, 25, 311, 14);
		panel_7_1_1_3_1.add(aNationalProviderLabel_1_3_1_5_2_2);

		final JLabel aNationalProviderLabel_1_3_1_5_2_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1_1.setBounds(20, 45, 311, 14);
		panel_7_1_1_3_1.add(aNationalProviderLabel_1_3_1_5_2_1_1);

		final JPanel panel_7_1_1_3_1_1 = new JPanel();
		panel_7_1_1_3_1_1.setBackground(Color.WHITE);
		panel_7_1_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_3_1_1.setLayout(null);
		panel_7_1_1_3_1_1.setBounds(83, 149, 757, 61);
		panel_1_1_2_2.add(panel_7_1_1_3_1_1);

		final JLabel aNationalProviderLabel_3_1_1_3_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1_3_1_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_3_1_1_3_1_1
				.setText("C. Recieved non medical intervention");
		aNationalProviderLabel_3_1_1_3_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_3_1_1_3_1_1);

		final JLabel aNationalProviderLabel_1_3_1_5_2_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_2_1.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2_2_1.setBounds(20, 25, 311, 14);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_1_3_1_5_2_2_1);

		final JLabel aNationalProviderLabel_1_3_1_5_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1_1.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1_1_1.setBounds(20, 45, 311, 14);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_1_3_1_5_2_1_1_1);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setVgap(10);
		panel_8.setLayout(flowLayout_8);
		panel_8.setPreferredSize(new Dimension(840, 120));
		add(panel_8);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_8.add(panel_1_2);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(820, 100));

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(Color.WHITE);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_7);
		panel_5_2.setBounds(0, 0, 820, 37);
		panel_1_2.add(panel_5_2);

		final JLabel a0100Label_2 = new JLabel();
		a0100Label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		a0100Label_2
				.setText("<html><b>J0200. Should Pain Assessment Interview be conducted?</b><br>Attempt to conduct Interview with all Residents. if if resident is comatose, skip to J1100. Shortness of breath (dyspnea)");
		panel_5_2.add(a0100Label_2);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(Color.WHITE);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(0, 36, 84, 64);
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
		panel_7_2.setBounds(90, 43, 699, 47);
		panel_1_2.add(panel_7_2);

		final JLabel aNationalProviderLabel_3 = new JLabel();
		aNationalProviderLabel_3
				.setText("<html><body>0.<b> No</b>(resident is rarely / never understood)-> Skip to and complete J0800 , indicators of pain or possible pain");
		aNationalProviderLabel_3.setBounds(10, 5, 607, 14);
		panel_7_2.add(aNationalProviderLabel_3);

		final JLabel aNationalProviderLabel_1_3 = new JLabel();
		aNationalProviderLabel_1_3
				.setText("<html><body>01. <b>Yes</b> - > Continue to J0300,Pain presence");
		aNationalProviderLabel_1_3.setBounds(10, 25, 311, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);

		final JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(840, 800));
		panel_1.setName("");
		panel_1.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setVgap(10);
		panel_1.setLayout(flowLayout_2);
		add(panel_1);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setRequestFocusEnabled(false);
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(0);
		flowLayout_4.setHgap(0);
		panel_1_1_1.setLayout(flowLayout_4);
		panel_1.add(panel_1_1_1);
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setPreferredSize(new Dimension(820, 780));

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
		a0100Label_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		a0100Label_1_1_1.setText("Pain Assessment Interview");
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
		a0100Label_1_1.setText("J0300. Pain presence");
		panel_5_1_1.add(a0100Label_1_1);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1_1.add(panel_1_1);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(820, 100));

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setVgap(8);
		panel_6_1.setLayout(flowLayout_9);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBounds(0, 0, 84, 101);
		panel_1_1.add(panel_6_1);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));
		comboBox.setBackground(Color.WHITE);
		comboBox.setPreferredSize(new Dimension(50, 20));
		panel_6_1.add(comboBox);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(85, 10, 735, 90);
		panel_1_1.add(panel_7_1);

		final JLabel aNationalProviderLabel_3_1 = new JLabel();
		aNationalProviderLabel_3_1
				.setText("<html>Ask resident :<b>\"Have you had pain or hurting at any time in the last 5 days?\"");
		aNationalProviderLabel_3_1.setBounds(10, 5, 706, 20);
		panel_7_1.add(aNationalProviderLabel_3_1);

		final JLabel aNationalProviderLabel_1_3_1 = new JLabel();
		aNationalProviderLabel_1_3_1.setText("<html><body>0. <b>No");
		aNationalProviderLabel_1_3_1.setBounds(31, 31, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1);

		final JLabel aNationalProviderLabel_1_3_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_1.setBounds(31, 51, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2
				.setText("<html><body>2. <b>Unable to answer");
		aNationalProviderLabel_1_3_1_2.setBounds(31, 71, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_2);

		final JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(Color.WHITE);
		panel_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(820, 152));
		panel_1_1_1.add(panel_1_1_2);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBounds(0, 29, 84, 123);
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
		panel_7_1_1.setBounds(83, 29, 737, 123);
		panel_1_1_2.add(panel_7_1_1);

		final JLabel aNationalProviderLabel_3_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_3_1_1
				.setText("<html><body>Ask resident:<i><b>\"How Much of the time have you experienced pain or hurting over the last 5 days?\"");
		aNationalProviderLabel_3_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1.add(aNationalProviderLabel_3_1_1);

		final JLabel aNationalProviderLabel_1_3_1_5 = new JLabel();
		aNationalProviderLabel_1_3_1_5
				.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1_3_1_5.setText("<html>1. <b>Almost Constantly");
		aNationalProviderLabel_1_3_1_5.setBounds(30, 25, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_5);

		final JLabel aNationalProviderLabel_1_3_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1
				.setText("<html><body>2. <b>Frequently");
		aNationalProviderLabel_1_3_1_1_1.setBounds(30, 45, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1
				.setText("<html><body>3. <b>Occasionally");
		aNationalProviderLabel_1_3_1_2_1.setBounds(30, 65, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_2_1);

		final JLabel aNationalProviderLabel_1_3_1_3_1 = new JLabel();
		aNationalProviderLabel_1_3_1_3_1.setText("<html><body>4. <b>Rarely");
		aNationalProviderLabel_1_3_1_3_1.setBounds(30, 85, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_3_1);

		final JLabel aNationalProviderLabel_1_3_1_4_1 = new JLabel();
		aNationalProviderLabel_1_3_1_4_1
				.setText("<html><body>9. <b>Unable to answer");
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
		a0100Label_1_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2.setText("J0400 Pain Frequency");
		panel_5_1_1_2.add(a0100Label_1_1_2);

		final JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setBackground(Color.WHITE);
		panel_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setPreferredSize(new Dimension(820, 210));
		panel_1_1_1.add(panel_1_1_2_1);

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 29, 84, 181);
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

		final JPanel panel_7_1_1_2 = new JPanel();
		panel_7_1_1_2.setOpaque(false);
		panel_7_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_2.setLayout(null);
		panel_7_1_1_2.setBounds(83, 29, 737, 93);
		panel_1_1_2_1.add(panel_7_1_1_2);

		final JLabel aNationalProviderLabel_3_1_1_2 = new JLabel();
		aNationalProviderLabel_3_1_1_2
				.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_3_1_1_2
				.setText("<html><body>Ask Resident:<i><b>\"Over The past 5 days,has pain made it hard for you to sleep at night?\"");
		aNationalProviderLabel_3_1_1_2.setBounds(10, 5, 706, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_3_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_2_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_2.setText("<html><body>0. <b>No ");
		aNationalProviderLabel_1_3_1_2_1_2.setBounds(30, 25, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_2_1_2);

		final JLabel aNationalProviderLabel_1_3_1_3_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_3_1_2.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_3_1_2.setBounds(30, 45, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_3_1_2);

		final JLabel aNationalProviderLabel_1_3_1_4_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_4_1_1
				.setText("<html><body>9. <b> Unable to answer");
		aNationalProviderLabel_1_3_1_4_1_1.setBounds(30, 65, 706, 14);
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
		a0100Label_1_1_2_1.setText("J0500 Pain Effect on function");
		panel_5_1_1_2_1.add(a0100Label_1_1_2_1);

		final JPanel panel_7_1_1_1_2 = new JPanel();
		panel_7_1_1_1_2.setOpaque(false);
		panel_7_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_2.setLayout(null);
		panel_7_1_1_1_2.setBounds(83, 121, 737, 89);
		panel_1_1_2_1.add(panel_7_1_1_1_2);

		final JLabel aNationalProviderLabel_3_1_1_1_2 = new JLabel();
		aNationalProviderLabel_3_1_1_1_2.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_3_1_1_1_2
				.setText("<html>B .Ask resident:<i>\"Over The past 5 days, <b>Have you limited your day to day activities because of pain? \"");
		aNationalProviderLabel_3_1_1_1_2.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_3_1_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_5_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_5_1_2.setText("<html><body>0. <b>No ");
		aNationalProviderLabel_1_3_1_5_1_2.setBounds(30, 25, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_5_1_2);

		final JLabel aNationalProviderLabel_1_3_1_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_1_2.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_1_1_1_2.setBounds(30, 45, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2
				.setText("<html><body>9. <b> Unable to answer");
		aNationalProviderLabel_1_3_1_2_1_1_2.setBounds(30, 65, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_2_1_1_2);

		final JPanel panel_1_1_2_1_1 = new JPanel();
		panel_1_1_2_1_1.setBackground(Color.WHITE);
		panel_1_1_1.add(panel_1_1_2_1_1);
		panel_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1_1.setLayout(null);
		panel_1_1_2_1_1.setPreferredSize(new Dimension(820, 260));

		final JPanel panel_6_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1.setBounds(0, 29, 84, 232);
		panel_1_1_2_1_1.add(panel_6_1_1_1_1);

		final JLabel enterCodeLabel_1_2_1 = new JLabel();
		enterCodeLabel_1_2_1.setText("Enter Code");
		enterCodeLabel_1_2_1.setBounds(15, 9, 54, 14);
		panel_6_1_1_1_1.add(enterCodeLabel_1_2_1);

		final JComboBox comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_2_1.setBackground(Color.WHITE);
		comboBox_1_2_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2_1.setBounds(17, 31, 50, 20);
		panel_6_1_1_1_1.add(comboBox_1_2_1);

		final JLabel enterCodeLabel_1_1_1_1 = new JLabel();
		enterCodeLabel_1_1_1_1.setText("Enter Code");
		enterCodeLabel_1_1_1_1.setBounds(15, 133, 54, 14);
		panel_6_1_1_1_1.add(enterCodeLabel_1_1_1_1);

		final JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1
				.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1_1.setBounds(15, 153, 50, 20);
		panel_6_1_1_1_1.add(comboBox_1_1_1_1);

		final JPanel panel_7_1_1_2_1 = new JPanel();
		panel_7_1_1_2_1.setBackground(Color.WHITE);
		panel_7_1_1_2_1.setOpaque(true);
		panel_7_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_2_1.setLayout(null);
		panel_7_1_1_2_1.setBounds(83, 29, 737, 93);
		panel_1_1_2_1_1.add(panel_7_1_1_2_1);

		final JLabel aNationalProviderLabel_3_1_1_2_1 = new JLabel();
		aNationalProviderLabel_3_1_1_2_1
				.setText("A. Numerical Rating Scale(00-10)");
		aNationalProviderLabel_3_1_1_2_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_2_1.add(aNationalProviderLabel_3_1_1_2_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_2_1
				.setText("<html> Ask Resident :\"Plaese rate your worst pain over the last 5 days on a zero to 10 scale with zero being no pain and ten being <br>as the worst pain you can imagine\"(show resident 00-10 pain scale)");
		aNationalProviderLabel_1_3_1_2_1_2_1.setBounds(30, 25, 653, 34);
		panel_7_1_1_2_1.add(aNationalProviderLabel_1_3_1_2_1_2_1);

		final JLabel aNationalProviderLabel_1_3_1_4_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_4_1_1_1.setFont(new Font("Arial",
				Font.BOLD, 12));
		aNationalProviderLabel_1_3_1_4_1_1_1
				.setText("Enter Two digit Response. Enter 99 if unable to answer.");
		aNationalProviderLabel_1_3_1_4_1_1_1.setBounds(30, 65, 706, 14);
		panel_7_1_1_2_1.add(aNationalProviderLabel_1_3_1_4_1_1_1);

		final JPanel panel_5_1_1_2_1_1 = new JPanel();
		panel_5_1_1_2_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_13 = new FlowLayout();
		flowLayout_13.setHgap(10);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1.setLayout(flowLayout_13);
		panel_5_1_1_2_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1.setBounds(0, 0, 820, 30);
		panel_1_1_2_1_1.add(panel_5_1_1_2_1_1);

		final JLabel a0100Label_1_1_2_1_1 = new JLabel();
		a0100Label_1_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2_1_1
				.setText("J0600. Pain Intensity - Administer ONLY ONE of the follwing pain Intensity questions (A or B)");
		panel_5_1_1_2_1_1.add(a0100Label_1_1_2_1_1);

		final JPanel panel_7_1_1_1_2_1 = new JPanel();
		panel_7_1_1_1_2_1.setBackground(Color.WHITE);
		panel_7_1_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_2_1.setLayout(null);
		panel_7_1_1_1_2_1.setBounds(83, 121, 737, 139);
		panel_1_1_2_1_1.add(panel_7_1_1_1_2_1);

		final JLabel aNationalProviderLabel_3_1_1_1_2_1 = new JLabel();
		aNationalProviderLabel_3_1_1_1_2_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_3_1_1_1_2_1
				.setText("B. Verbal Descriptor Scale");
		aNationalProviderLabel_3_1_1_1_2_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_3_1_1_1_2_1);

		final JLabel aNationalProviderLabel_1_3_1_5_1_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_1_2_1
				.setText("Ask resident : \"Please rate the intensity of your worst pain over the last 5 days\"(show resident verbal scale.)");
		aNationalProviderLabel_1_3_1_5_1_2_1.setBounds(30, 25, 630, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_5_1_2_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_1_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_1_2_1.setText("<html>1. <b>Mild");
		aNationalProviderLabel_1_3_1_1_1_1_2_1.setBounds(30, 45, 311, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_1_1_1_2_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2_1.setText("<html>2. <b>Moderate");
		aNationalProviderLabel_1_3_1_2_1_1_2_1.setBounds(30, 65, 311, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_2_1_1_2_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_2_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2_1_1.setText("<html>3. <b>Severe");
		aNationalProviderLabel_1_3_1_2_1_1_2_1_1.setBounds(30, 83, 311, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_2_1_1_2_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_2_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2_1_2
				.setText("<html>4. <b>Very Savere Horrible");
		aNationalProviderLabel_1_3_1_2_1_1_2_1_2.setBounds(30, 103, 311, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_2_1_1_2_1_2);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_2_1_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2_1_2_1
				.setText("<html>5.<b>Unable to answer");
		aNationalProviderLabel_1_3_1_2_1_1_2_1_2_1.setBounds(30, 123, 311, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_2_1_1_2_1_2_1);

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
