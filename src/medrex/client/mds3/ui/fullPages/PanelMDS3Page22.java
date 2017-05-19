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

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page22 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7121647940923468272L;

	public PanelMDS3Page22() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(840, 1170));
		final JPanel panel = new JPanel();
		panel.setBounds(0, 5, 840, 45);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(840, 45));
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
		dcDate.setDateFormatString("dd/MM/yyyy");
		dcDate.setBackground(Color.WHITE);
		dcDate.setBounds(730, 8, 100, 22);
		panel.add(dcDate);

		final JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 55, 840, 25);
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
		sectionALabel.setText("Section K");
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
		identificationInformationLabel.setText("Swallowing/Nutritional Status");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setBounds(0, 85, 840, 244);
		panel_27.setLayout(null);
		panel_27.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_27.setPreferredSize(new Dimension(840, 248));
		add(panel_27);

		final JPanel panel_28 = new JPanel();
		panel_28.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_28.setBounds(0, 0, 840, 46);
		panel_28.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_28.setLayout(null);
		panel_28.setPreferredSize(new Dimension(840, 26));
		panel_27.add(panel_28);

		final JLabel g0600MobilityDevicesLabel = new JLabel();
		g0600MobilityDevicesLabel.setBackground(ColorConstants.MDS_BACK_COLOR);
		g0600MobilityDevicesLabel.setFont(new Font("Arial", Font.BOLD, 12));
		g0600MobilityDevicesLabel.setBounds(10, 7, 248, 14);
		panel_28.add(g0600MobilityDevicesLabel);
		g0600MobilityDevicesLabel.setText("K0100. Swallowing Disorder");

		final JLabel signsAndSymptomsLabel = new JLabel();
		signsAndSymptomsLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		signsAndSymptomsLabel
				.setText("Signs and symptoms of possible swallowing disorder");
		signsAndSymptomsLabel.setBounds(10, 27, 323, 14);
		panel_28.add(signsAndSymptomsLabel);

		final JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(0, 46, 840, 26);
		panel_27.add(panel_29);

		final JLabel codeForLimitationLabel_1 = new JLabel();
		codeForLimitationLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		codeForLimitationLabel_1.setText("Chech all that apply");
		codeForLimitationLabel_1.setBounds(55, 7, 455, 14);
		panel_29.add(codeForLimitationLabel_1);

		final JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_30.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_30.setLayout(null);
		panel_30.setBounds(0, 72, 70, 172);
		panel_27.add(panel_30);

		final JCheckBox checkBox = new JCheckBox();
		checkBox.setBackground(Color.WHITE);
		checkBox.setText("");
		checkBox.setBounds(30, 10, 14, 17);
		panel_30.add(checkBox);

		final JCheckBox checkBox_1 = new JCheckBox();
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setText("New JCheckBox");
		checkBox_1.setBounds(30, 43, 14, 17);
		panel_30.add(checkBox_1);

		final JCheckBox checkBox_2 = new JCheckBox();
		checkBox_2.setBackground(Color.WHITE);
		checkBox_2.setBounds(30, 81, 14, 17);
		panel_30.add(checkBox_2);
		checkBox_2.setText("New JCheckBox");

		final JCheckBox checkBox_3 = new JCheckBox();
		checkBox_3.setBackground(Color.WHITE);
		checkBox_3.setText("New JCheckBox");
		checkBox_3.setBounds(30, 117, 14, 17);
		panel_30.add(checkBox_3);

		final JCheckBox checkBox_4 = new JCheckBox();
		checkBox_4.setBackground(Color.WHITE);
		checkBox_4.setText("New JCheckBox");
		checkBox_4.setBounds(30, 150, 14, 17);
		panel_30.add(checkBox_4);

		final JPanel panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(70, 72, 770, 35);
		panel_27.add(panel_31);

		final JLabel aCanecrutchLabel = new JLabel();
		aCanecrutchLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aCanecrutchLabel
				.setText("<html><body><b>A. Loss of liquids/soilds from mouth when eating or drinking</b>");
		aCanecrutchLabel.setBounds(10, 10, 344, 14);
		panel_31.add(aCanecrutchLabel);

		final JPanel panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(70, 106, 770, 35);
		panel_27.add(panel_32);

		final JLabel bWalkerLabel = new JLabel();
		bWalkerLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bWalkerLabel.setBackground(Color.WHITE);
		bWalkerLabel
				.setText("<html><body><b>B. Holding food in mouth/cheeks or residual food in mouth after meals </b>");
		bWalkerLabel.setBounds(10, 10, 415, 14);
		panel_32.add(bWalkerLabel);

		final JPanel panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(70, 140, 770, 35);
		panel_27.add(panel_33);

		final JLabel cWheelchairLabel = new JLabel();
		cWheelchairLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		cWheelchairLabel
				.setText("<html><body><b>C. Coughing or choking during meals or when swallowing medications</b> ");
		cWheelchairLabel.setBounds(10, 10, 413, 14);
		panel_33.add(cWheelchairLabel);

		final JPanel panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(70, 174, 770, 35);
		panel_27.add(panel_34);

		final JLabel dLimbProsthesisLabel = new JLabel();
		dLimbProsthesisLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		dLimbProsthesisLabel
				.setText("<html><body><b>D. Complaints of difficulty or pain with swallowing medications </b>");
		dLimbProsthesisLabel.setBounds(10, 10, 383, 14);
		panel_34.add(dLimbProsthesisLabel);

		final JPanel panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(70, 208, 770, 36);
		panel_27.add(panel_35);

		final JLabel zNoneOtLabel = new JLabel();
		zNoneOtLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		zNoneOtLabel.setText("<html><body><b>Z. None ot the above </b>");
		zNoneOtLabel.setBounds(10, 10, 253, 14);
		panel_35.add(zNoneOtLabel);

		final JPanel panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(Color.black, 1, false));
		panel_36.setBounds(0, 329, 840, 132);
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setPreferredSize(new Dimension(840, 133));
		add(panel_36);

		final JPanel panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_37.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_37.setLayout(null);
		panel_37.setBounds(0, 0, 840, 32);
		panel_36.add(panel_37);

		final JLabel g0900FunctionalRehabilitationLabel = new JLabel();
		g0900FunctionalRehabilitationLabel.setFont(new Font("Arial",
				Font.PLAIN, 12));
		g0900FunctionalRehabilitationLabel
				.setText("<html><body><b>K0200. Height and Weight  </b> - While measuring, if the number is X.1 - X.4 round down ; X.5 or greater round up");
		g0900FunctionalRehabilitationLabel.setBounds(10, 8, 737, 14);
		panel_37.add(g0900FunctionalRehabilitationLabel);

		final JPanel panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_38.setLayout(null);
		panel_38.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_38.setBounds(0, 32, 80, 99);
		panel_36.add(panel_38);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 103, 58, 14);
		panel_38.add(enterCodeLabel_2);

		final JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_9.setBackground(Color.WHITE);
		comboBox_9.setBounds(12, 123, 50, 20);
		panel_38.add(comboBox_9);

		final JTextField textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(Color.black, 1, false));
		textField_2.setBounds(10, 10, 22, 20);
		panel_38.add(textField_2);

		final JTextField textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(Color.black, 1, false));
		textField_3.setBounds(30, 10, 22, 20);
		panel_38.add(textField_3);

		final JLabel inchesLabel = new JLabel();
		inchesLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		inchesLabel.setText("inches");
		inchesLabel.setBounds(10, 31, 54, 14);
		panel_38.add(inchesLabel);

		final JTextField textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(Color.black, 1, false));
		textField_4.setBounds(31, 65, 22, 20);
		panel_38.add(textField_4);

		final JTextField textField_6 = new JTextField();
		textField_6.setBorder(new LineBorder(Color.black, 1, false));
		textField_6.setBounds(10, 65, 22, 20);
		panel_38.add(textField_6);

		final JTextField textField_7 = new JTextField();
		textField_7.setBorder(new LineBorder(Color.black, 1, false));
		textField_7.setBounds(52, 65, 22, 20);
		panel_38.add(textField_7);

		final JLabel poundsLabel = new JLabel();
		poundsLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		poundsLabel.setText("pounds");
		poundsLabel.setBounds(10, 81, 66, 14);
		panel_38.add(poundsLabel);

		final JPanel panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(80, 32, 760, 50);
		panel_36.add(panel_39);

		final JLabel aResidentBelievesLabel = new JLabel();
		aResidentBelievesLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aResidentBelievesLabel
				.setText("<html><body><b>A. Height </b> (in inches ). Record most recent height measure since admission");
		aResidentBelievesLabel.setBounds(10, 12, 532, 14);
		panel_39.add(aResidentBelievesLabel);

		final JPanel panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_40.setLayout(null);
		panel_40.setBackground(Color.WHITE);
		panel_40.setBounds(80, 81, 760, 50);
		panel_36.add(panel_40);

		final JLabel bDirectCareLabel = new JLabel();
		bDirectCareLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bDirectCareLabel
				.setText("<html><body><b>B. Weight </b> (in ponds). Base weight on most recent measure in last 30days; measure weight consistently, according to standard </br> facility practice (eg. in a.m. after voiding, before meal, with shoes off, etc.)");
		bDirectCareLabel.setBounds(10, 10, 645, 30);
		panel_40.add(bDirectCareLabel);

		final JTextField textField_5 = new JTextField();
		textField_5.setBounds(-37, 9, 22, 20);
		panel_40.add(textField_5);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 460, 840, 110);
		add(panel_1);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 840, 30);
		panel_1.add(panel_5);

		final JLabel k0300WeightLossLabel = new JLabel();
		k0300WeightLossLabel.setFont(new Font("Arial", Font.BOLD, 12));
		k0300WeightLossLabel.setText("K0300. Weight Loss");
		k0300WeightLossLabel.setBounds(10, 10, 209, 14);
		panel_5.add(k0300WeightLossLabel);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 30, 70, 80);
		panel_1.add(panel_6);

		final JTextField textField_8 = new JTextField();
		textField_8.setForeground(Color.BLACK);
		textField_8.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField_8.setBounds(20, 40, 33, 24);
		panel_6.add(textField_8);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(10, 20, 54, 14);
		panel_6.add(enterCodeLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		panel_7.setBounds(70, 30, 770, 80);
		panel_1.add(panel_7);

		final JLabel loss5Label = new JLabel();
		loss5Label.setFont(new Font("Arial", Font.PLAIN, 12));
		loss5Label
				.setText("<html><body><b> Loss 5% or more in the last month or loss of 10% or more in last 6 months</b>");
		loss5Label.setBounds(10, 10, 500, 20);
		panel_7.add(loss5Label);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label.setText("<html><body> 0. <b> No </b> or unknown");
		label.setBounds(41, 30, 500, 14);
		panel_7.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_1
				.setText("<html><body>1. <b> Yes, on </b> physician-prescribed weight-loss regimen");
		label_1.setBounds(41, 45, 403, 14);
		panel_7.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2
				.setText("<html><body>2. <b> Yes, not on </b> physician-prescribed weight-loss regimen");
		label_2.setBounds(41, 60, 363, 14);
		panel_7.add(label_2);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(0, 570, 840, 177);
		add(panel_8);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9.setLayout(null);
		panel_9.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_9.setBounds(0, 0, 840, 30);
		panel_8.add(panel_9);

		final JLabel k0500NutritionalApproachesLabel = new JLabel();
		k0500NutritionalApproachesLabel
				.setFont(new Font("Arial", Font.BOLD, 12));
		k0500NutritionalApproachesLabel
				.setText("K0500. Nutritional Approaches");
		k0500NutritionalApproachesLabel.setBounds(10, 10, 487, 14);
		panel_9.add(k0500NutritionalApproachesLabel);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(0, 30, 840, 26);
		panel_8.add(panel_10);

		final JLabel checkAllLabel = new JLabel();
		checkAllLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		checkAllLabel.setText("<html><body><b> Check all that apply </b>");
		checkAllLabel.setBounds(50, 7, 230, 14);
		panel_10.add(checkAllLabel);

		final JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_11.setLayout(null);
		panel_11.setBounds(0, 56, 70, 121);
		panel_8.add(panel_11);

		final JCheckBox checkBox_5 = new JCheckBox();
		checkBox_5.setBackground(Color.WHITE);
		checkBox_5.setText("New JCheckBox");
		checkBox_5.setBounds(25, 6, 14, 17);
		panel_11.add(checkBox_5);

		final JCheckBox checkBox_6 = new JCheckBox();
		checkBox_6.setBackground(Color.WHITE);
		checkBox_6.setText("New JCheckBox");
		checkBox_6.setBounds(25, 29, 14, 17);
		panel_11.add(checkBox_6);

		final JCheckBox checkBox_7 = new JCheckBox();
		checkBox_7.setBackground(Color.WHITE);
		checkBox_7.setText("New JCheckBox");
		checkBox_7.setBounds(25, 52, 14, 17);
		panel_11.add(checkBox_7);

		final JCheckBox checkBox_8 = new JCheckBox();
		checkBox_8.setBackground(Color.WHITE);
		checkBox_8.setText("New JCheckBox");
		checkBox_8.setBounds(25, 75, 14, 17);
		panel_11.add(checkBox_8);

		final JCheckBox checkBox_9 = new JCheckBox();
		checkBox_9.setBackground(Color.WHITE);
		checkBox_9.setText("New JCheckBox");
		checkBox_9.setBounds(25, 98, 14, 17);
		panel_11.add(checkBox_9);

		final JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setBounds(70, 56, 770, 25);
		panel_8.add(panel_12);

		final JLabel aParenteralivLabel = new JLabel();
		aParenteralivLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aParenteralivLabel.setText("<html><body><b> A. Parenteral/IV feeding");
		aParenteralivLabel.setBounds(10, 6, 223, 14);
		panel_12.add(aParenteralivLabel);

		final JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(70, 80, 770, 25);
		panel_8.add(panel_13);

		final JLabel bLabel = new JLabel();
		bLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bLabel
				.setText("<html><body> <b> B. Feeding tube </b> - nasogastric or abdominal (PEG)");
		bLabel.setBounds(10, 6, 290, 14);
		panel_13.add(bLabel);

		final JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_14.setBackground(Color.WHITE);
		panel_14.setLayout(null);
		panel_14.setBounds(70, 104, 770, 25);
		panel_8.add(panel_14);

		final JLabel cMechanicallyLabel = new JLabel();
		cMechanicallyLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		cMechanicallyLabel
				.setText("<html><body><b> C. Mechanically altered diet </b> -require change in texture of food or liquids (e.g., pured food, thickened liquids)");
		cMechanicallyLabel.setBounds(10, 6, 612, 14);
		panel_14.add(cMechanicallyLabel);

		final JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setBounds(70, 128, 770, 25);
		panel_8.add(panel_15);

		final JLabel dTherapeuticLabel = new JLabel();
		dTherapeuticLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		dTherapeuticLabel
				.setText("<html><body><b> D. Therapeutic diet </b> (e.g.,low salt, diabetic, low cholesterol)");
		dTherapeuticLabel.setBounds(10, 6, 391, 14);
		panel_15.add(dTherapeuticLabel);

		final JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_16.setBackground(Color.WHITE);
		panel_16.setLayout(null);
		panel_16.setBounds(70, 152, 770, 25);
		panel_8.add(panel_16);

		final JLabel zNoneLabel = new JLabel();
		zNoneLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		zNoneLabel.setText("<html><body><b> Z. None of the above </b>");
		zNoneLabel.setBounds(10, 6, 303, 14);
		panel_16.add(zNoneLabel);

		final JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setBounds(0, 747, 840, 170);
		add(panel_17);

		final JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_18.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_18.setLayout(null);
		panel_18.setBounds(0, 0, 840, 30);
		panel_17.add(panel_18);

		final JPanel panel_51 = new JPanel();
		panel_51.setBackground(Color.WHITE);
		panel_51.setLayout(null);
		panel_51.setBounds(0, 30, 840, 80);
		panel_17.add(panel_51);

		final JLabel k0700PercentIntakeLabel = new JLabel();
		k0700PercentIntakeLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		k0700PercentIntakeLabel
				.setText("<html><body><b>K0700. Percent intake by artificial Route </b> - Complete K0700 only if K0500A or K0500B is checked");
		k0700PercentIntakeLabel.setBounds(10, 10, 607, 14);
		panel_18.add(k0700PercentIntakeLabel);

		final JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_19.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.setLayout(null);
		panel_19.setBounds(0, 0, 70, 80);
		panel_51.add(panel_19);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 15, 54, 14);
		panel_19.add(enterCodeLabel_1);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2",
				"3" }));
		comboBox.setBounds(13, 42, 43, 17);
		panel_19.add(comboBox);

		final JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_20.setBackground(Color.WHITE);
		panel_20.setLayout(null);
		panel_20.setBounds(70, 0, 770, 80);
		panel_51.add(panel_20);

		final JLabel aProportionLabel = new JLabel();
		aProportionLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aProportionLabel
				.setText("<html><body><b> A. Proportion of total calories the resident received through parenteral or tube feeding </b>");
		aProportionLabel.setBounds(10, 10, 648, 14);
		panel_20.add(aProportionLabel);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3.setText("<html><body>1. <b> 25% or less </b>");
		label_3.setBounds(41, 30, 214, 14);
		panel_20.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Arial", Font.PLAIN, 12));
		label_4.setBorder(new LineBorder(Color.WHITE, 1, false));
		label_4.setText("<html><body>2. <b> 26-50% </b>");
		label_4.setBounds(41, 45, 228, 14);
		panel_20.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Arial", Font.PLAIN, 12));
		label_5.setText("<html><body>3.<b>  51% or more</b>");
		label_5.setBounds(41, 60, 241, 14);
		panel_20.add(label_5);

		final JPanel panel_52 = new JPanel();
		panel_52.setBounds(0, 110, 840, 61);
		panel_17.add(panel_52);
		panel_52.setBackground(Color.WHITE);
		panel_52.setLayout(null);

		final JPanel panel_21 = new JPanel();
		panel_21.setBounds(70, 0, 770, 60);
		panel_52.add(panel_21);
		panel_21.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_21.setBackground(Color.WHITE);
		panel_21.setLayout(null);

		final JLabel bAverageLabel = new JLabel();
		bAverageLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bAverageLabel
				.setText("<html><body><b> B. Average fluid intake per day by IV or tube feeding");
		bAverageLabel.setBounds(10, 10, 399, 14);
		panel_21.add(bAverageLabel);

		final JLabel label_6 = new JLabel();
		label_6.setFont(new Font("Arial", Font.PLAIN, 12));
		label_6.setText("<html><body>1.<b> 500 cc/day or less </b>");
		label_6.setBounds(41, 30, 255, 14);
		panel_21.add(label_6);

		final JLabel label_7 = new JLabel();
		label_7.setFont(new Font("Arial", Font.PLAIN, 12));
		label_7.setText("<html><body>2. <b> 501 cc/day or more");
		label_7.setBounds(41, 45, 206, 14);
		panel_21.add(label_7);

		final JPanel panel_53 = new JPanel();
		panel_53.setBorder(new LineBorder(Color.black, 1, false));
		panel_53.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_53.setLayout(null);
		panel_53.setBounds(0, 0, 70, 60);
		panel_52.add(panel_53);

		final JLabel enterCodeLabel_3 = new JLabel();
		enterCodeLabel_3.setText("Enter Code");
		enterCodeLabel_3.setBounds(10, 15, 54, 14);
		panel_53.add(enterCodeLabel_3);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(10, 35, 24, 21);
		panel_53.add(comboBox_1);

		final JPanel panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_22.setBackground(Color.WHITE);
		panel_22.setLayout(null);
		panel_22.setBounds(0, 930, 840, 25);
		add(panel_22);

		final JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_23.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_23.setLayout(null);
		panel_23.setBounds(0, 0, 231, 25);
		panel_22.add(panel_23);

		final JLabel sectionLLabel = new JLabel();
		sectionLLabel.setForeground(Color.WHITE);
		sectionLLabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectionLLabel.setText("Section L");
		sectionLLabel.setBounds(10, 6, 141, 14);
		panel_23.add(sectionLLabel);

		final JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_24.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_24.setLayout(null);
		panel_24.setBounds(230, 0, 610, 25);
		panel_22.add(panel_24);

		final JLabel oraldentalStatusLabel = new JLabel();
		oraldentalStatusLabel.setForeground(ColorConstants.MDS_FONT_COLOR);
		oraldentalStatusLabel.setFont(new Font("Arial", Font.BOLD, 16));
		oraldentalStatusLabel.setBounds(10, 6, 391, 14);
		panel_24.add(oraldentalStatusLabel);
		oraldentalStatusLabel.setText("Oral/Dental Status");

		final JPanel panel_25 = new JPanel();
		panel_25.setBackground(Color.WHITE);
		panel_25.setLayout(null);
		panel_25.setBounds(0, 960, 840, 210);
		add(panel_25);

		final JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_26.setBackground(ColorConstants.MDS_BACK_COLOR);

		panel_26.setLayout(null);
		panel_26.setBounds(0, 0, 840, 25);
		panel_25.add(panel_26);

		final JLabel l0200DentalLabel = new JLabel();
		l0200DentalLabel.setFont(new Font("Arial", Font.BOLD, 12));
		l0200DentalLabel.setText("L0200. Dental");
		l0200DentalLabel.setBounds(10, 6, 236, 14);
		panel_26.add(l0200DentalLabel);

		final JPanel panel_41 = new JPanel();
		panel_41.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_41.setBackground(Color.WHITE);
		panel_41.setLayout(null);
		panel_41.setBounds(0, 25, 840, 25);
		panel_25.add(panel_41);

		final JLabel checkAllThatLabel = new JLabel();
		checkAllThatLabel.setFont(new Font("Arial", Font.BOLD, 12));
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(58, 6, 221, 14);
		panel_41.add(checkAllThatLabel);

		final JPanel panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_42.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_42.setLayout(null);
		panel_42.setBounds(0, 50, 70, 160);
		panel_25.add(panel_42);

		final JCheckBox checkBox_10 = new JCheckBox();
		checkBox_10.setBackground(Color.WHITE);
		checkBox_10.setText("New JCheckBox");
		checkBox_10.setBounds(25, 4, 14, 15);
		panel_42.add(checkBox_10);

		final JCheckBox checkBox_11 = new JCheckBox();
		checkBox_11.setBackground(Color.WHITE);
		checkBox_11.setText("New JCheckBox");
		checkBox_11.setBounds(25, 24, 14, 15);
		panel_42.add(checkBox_11);

		final JCheckBox checkBox_12 = new JCheckBox();
		checkBox_12.setBackground(Color.WHITE);
		checkBox_12.setBounds(25, 44, 14, 15);
		panel_42.add(checkBox_12);
		checkBox_12.setText("New JCheckBox");

		final JCheckBox checkBox_13 = new JCheckBox();
		checkBox_13.setBackground(Color.WHITE);
		checkBox_13.setText("New JCheckBox");
		checkBox_13.setBounds(25, 64, 14, 15);
		panel_42.add(checkBox_13);

		final JCheckBox checkBox_14 = new JCheckBox();
		checkBox_14.setBackground(Color.WHITE);
		checkBox_14.setText("New JCheckBox");
		checkBox_14.setBounds(25, 84, 14, 15);
		panel_42.add(checkBox_14);

		final JCheckBox checkBox_15 = new JCheckBox();
		checkBox_15.setBackground(Color.WHITE);
		checkBox_15.setText("New JCheckBox");
		checkBox_15.setBounds(25, 104, 14, 15);
		panel_42.add(checkBox_15);

		final JCheckBox checkBox_16 = new JCheckBox();
		checkBox_16.setBackground(Color.WHITE);
		checkBox_16.setText("New JCheckBox");
		checkBox_16.setBounds(25, 124, 14, 15);
		panel_42.add(checkBox_16);

		final JCheckBox checkBox_17 = new JCheckBox();
		checkBox_17.setBackground(Color.WHITE);
		checkBox_17.setText("New JCheckBox");
		checkBox_17.setBounds(25, 144, 14, 15);
		panel_42.add(checkBox_17);

		final JPanel panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_43.setBackground(Color.WHITE);
		panel_43.setLayout(null);
		panel_43.setBounds(70, 50, 770, 21);
		panel_25.add(panel_43);

		final JLabel aBrokenLabel = new JLabel();
		aBrokenLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aBrokenLabel
				.setText("<html><body><b> A. Broken or loosely fitting full or partial denture </b> (chipped, cracked, uncleanable, or loose)");
		aBrokenLabel.setBounds(10, 4, 644, 14);
		panel_43.add(aBrokenLabel);

		final JPanel panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_44.setBackground(Color.WHITE);
		panel_44.setLayout(null);
		panel_44.setBounds(70, 70, 770, 21);
		panel_25.add(panel_44);

		final JLabel bNoLabel = new JLabel();
		bNoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bNoLabel
				.setText("<html><body><b> B. No natural teeth or tooth fragment(s) </b> (edentulous)");
		bNoLabel.setBounds(10, 4, 467, 14);
		panel_44.add(bNoLabel);

		final JPanel panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_45.setLayout(null);
		panel_45.setBackground(Color.WHITE);
		panel_45.setBounds(70, 90, 770, 21);
		panel_25.add(panel_45);

		final JLabel cAbnormalLabel = new JLabel();
		cAbnormalLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		cAbnormalLabel
				.setText("<html><body><b> C. Abnormal mouth tissue </b> (ulcers, masses, oral lesions, including under denture or partial if one is worn )");
		cAbnormalLabel.setBounds(10, 4, 588, 14);
		panel_45.add(cAbnormalLabel);

		final JPanel panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_46.setBackground(Color.WHITE);
		panel_46.setLayout(null);
		panel_46.setBounds(70, 110, 770, 21);
		panel_25.add(panel_46);

		final JLabel dObviousLabel = new JLabel();
		dObviousLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		dObviousLabel
				.setText("<html><body><b> D. Obvious or likely cavity or broken natural teeth </b>");
		dObviousLabel.setBounds(10, 4, 400, 14);
		panel_46.add(dObviousLabel);

		final JPanel panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_47.setLayout(null);
		panel_47.setBackground(Color.WHITE);
		panel_47.setBounds(70, 130, 770, 21);
		panel_25.add(panel_47);

		final JLabel eInflamedLabel = new JLabel();
		eInflamedLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		eInflamedLabel
				.setText("<html><body><b> E. Inflamed or bleeding gums or loose natural teeth</b>");
		eInflamedLabel.setBounds(10, 4, 575, 14);
		panel_47.add(eInflamedLabel);

		final JPanel panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_48.setBackground(Color.WHITE);
		panel_48.setLayout(null);
		panel_48.setBounds(70, 150, 770, 21);
		panel_25.add(panel_48);

		final JLabel fMouthOrLabel = new JLabel();
		fMouthOrLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		fMouthOrLabel
				.setText("<html><body><b>F. Mouth or facial pain, discomfort or difficulty with chewing");
		fMouthOrLabel.setBounds(10, 4, 388, 14);
		panel_48.add(fMouthOrLabel);

		final JPanel panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_49.setLayout(null);
		panel_49.setBackground(Color.WHITE);
		panel_49.setBounds(70, 170, 770, 21);
		panel_25.add(panel_49);

		final JLabel gUnableToLabel = new JLabel();
		gUnableToLabel.setText("<html><body><b>G. Unable to examine </b>");
		gUnableToLabel.setBounds(10, 4, 315, 14);
		panel_49.add(gUnableToLabel);

		final JPanel panel_50 = new JPanel();
		panel_50.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_50.setBackground(Color.WHITE);
		panel_50.setLayout(null);
		panel_50.setBounds(70, 190, 770, 20);
		panel_25.add(panel_50);

		final JLabel zNoneLabel_1 = new JLabel();
		zNoneLabel_1
				.setText("<html><body><b> Z. None of the above were present");
		zNoneLabel_1.setBounds(10, 4, 232, 14);
		panel_50.add(zNoneLabel_1);

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
		PanelMDS3Page22 panel = new PanelMDS3Page22();
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

}
