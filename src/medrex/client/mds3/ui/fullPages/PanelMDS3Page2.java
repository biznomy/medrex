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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.Form;

public class PanelMDS3Page2 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1384701758711825947L;

	public PanelMDS3Page2() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 1050));

		final JPanel panel = new JPanel();
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		panel.setLayout(flowLayout_1);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 840, 937);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(820, 35));
		panel.add(panel_1);

		final JLabel residentLabel = new JLabel();
		residentLabel.setText("Resident");
		residentLabel.setBounds(25, 10, 61, 14);
		panel_1.add(residentLabel);

		final JTextField textField = new JTextField();
		textField.setBounds(92, 5, 146, 20);
		panel_1.add(textField);

		final JLabel identifierLabel = new JLabel();
		identifierLabel.setText("Identifier");
		identifierLabel.setBounds(331, 10, 51, 14);
		panel_1.add(identifierLabel);

		final JTextField textField_1 = new JTextField();
		textField_1.setBounds(388, 5, 125, 20);
		panel_1.add(textField_1);

		final JLabel dateLabel = new JLabel();
		dateLabel.setText("Date");
		dateLabel.setBounds(640, 10, 37, 14);
		panel_1.add(dateLabel);

		final JTextField textField_2 = new JTextField();
		textField_2.setBounds(685, 5, 105, 20);
		panel_1.add(textField_2);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(820, 25));
		panel.add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 178, 25);
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.add(panel_3);

		final JLabel sectionLabel = new JLabel();
		sectionLabel.setFont(new Font("Arial", Font.BOLD, 14));
		sectionLabel.setForeground(Color.WHITE);
		sectionLabel.setText("Section A");
		sectionLabel.setBounds(10, 0, 158, 25);
		panel_3.add(sectionLabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setHgap(10);
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(178, 0, 642, 26);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 14));
		identificationInformationLabel.setText("Identification Information");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setPreferredSize(new Dimension(820, 75));
		panel.add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_6.setLayout(flowLayout_2);
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 0, 820, 24);
		panel_5.add(panel_6);

		final JLabel a0500Label = new JLabel();
		a0500Label.setFont(new Font("Arial", Font.BOLD, 12));
		a0500Label.setText("A0500.Submission Requirement");
		panel_6.add(a0500Label);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 23, 75, 53);
		panel_5.add(panel_7);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setBounds(10, 0, 54, 14);
		panel_7.add(enterCodeLabel);
		enterCodeLabel.setText("Enter Code");

		final JComboBox comboBox = new JComboBox();
		comboBox.setPreferredSize(new Dimension(50, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(10, 20, 43, 24);
		panel_7.add(comboBox);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(74, 27, 744, 48);
		panel_5.add(panel_8);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label.setText("1. Neither federal nor state required submission");
		label.setBounds(21, 3, 283, 14);
		panel_8.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1.setText("2. State but not federal required submission");
		label_1.setBounds(21, 18, 248, 14);
		panel_8.add(label_1);

		final JLabel federalRequiredSubmissionLabel = new JLabel();
		federalRequiredSubmissionLabel
				.setFont(new Font("Arial", Font.BOLD, 12));
		federalRequiredSubmissionLabel.setText("3.Federal required submission");
		federalRequiredSubmissionLabel.setBounds(21, 32, 335, 14);
		panel_8.add(federalRequiredSubmissionLabel);

		final JLabel forNursingHomesLabel = new JLabel();
		forNursingHomesLabel.setText("(FOR NURSING hOMES ONLY)");
		forNursingHomesLabel.setBounds(270, 16, 181, 14);
		panel_8.add(forNursingHomesLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setPreferredSize(new Dimension(820, 110));
		panel.add(panel_9);

		final JPanel panel_10 = new JPanel();
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_10.setLayout(flowLayout_3);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_10.setBounds(0, 0, 820, 24);
		panel_9.add(panel_10);

		final JLabel a0500LegalNameLabel = new JLabel();
		a0500LegalNameLabel.setFont(new Font("Arial", Font.BOLD, 12));
		a0500LegalNameLabel.setText("A0500. Legal Name of Resident");
		panel_10.add(a0500LegalNameLabel);

		final JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_11.setBounds(0, 21, 75, 89);
		panel_9.add(panel_11);

		final JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);
		panel_13.setBounds(73, 21, 747, 89);
		panel_9.add(panel_13);

		final JLabel aFirstNameLabel = new JLabel();
		aFirstNameLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aFirstNameLabel.setBounds(21, 1, 164, 14);
		panel_13.add(aFirstNameLabel);
		aFirstNameLabel.setText("A. First Name");

		final JTextField textField_3 = new JTextField();
		textField_3.setBounds(21, 20, 252, 18);
		panel_13.add(textField_3);

		final JLabel bMiddleInitialLabel = new JLabel();
		bMiddleInitialLabel.setFont(new Font("Arial", Font.BOLD, 12));
		bMiddleInitialLabel.setText("B. Middle initial");
		bMiddleInitialLabel.setBounds(307, 22, 88, 14);
		panel_13.add(bMiddleInitialLabel);

		final JTextField textField_4 = new JTextField();
		textField_4.setBounds(415, 20, 78, 18);
		panel_13.add(textField_4);

		final JLabel cLastNameLabel = new JLabel();
		cLastNameLabel.setFont(new Font("Arial", Font.BOLD, 12));
		cLastNameLabel.setText("c. Last name");
		cLastNameLabel.setBounds(21, 46, 88, 14);
		panel_13.add(cLastNameLabel);

		final JTextField textField_5 = new JTextField();
		textField_5.setBounds(21, 66, 252, 18);
		panel_13.add(textField_5);

		final JLabel dSuffixLabel = new JLabel();
		dSuffixLabel.setFont(new Font("Arial", Font.BOLD, 12));
		dSuffixLabel.setText("D. Suffix");
		dSuffixLabel.setBounds(305, 50, 54, 14);
		panel_13.add(dSuffixLabel);

		final JTextField textField_6 = new JTextField();
		textField_6.setBounds(414, 48, 79, 18);
		panel_13.add(textField_6);

		final JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setPreferredSize(new Dimension(840, 117));
		panel.add(panel_12);

		final JPanel panel_14 = new JPanel();
		panel_14.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setBounds(10, 22, 75, 96);
		panel_12.add(panel_14);

		final JPanel panel_15 = new JPanel();
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_15.setLayout(flowLayout_4);
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_15.setPreferredSize(new Dimension(0, 0));
		panel_15.setBounds(10, -1, 820, 25);
		panel_12.add(panel_15);

		final JLabel a0600SocialSecurityLabel = new JLabel();
		a0600SocialSecurityLabel.setFont(new Font("Arial", Font.BOLD, 12));

		a0600SocialSecurityLabel
				.setText("A0600. Social Security and Medicare Numbers");
		panel_15.add(a0600SocialSecurityLabel);

		final JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setBackground(Color.WHITE);
		panel_16.setLayout(null);
		panel_16.setBounds(83, 22, 747, 96);
		panel_12.add(panel_16);

		final JLabel aSocialSecurityLabel = new JLabel();
		aSocialSecurityLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aSocialSecurityLabel.setText("A. Social Security Number");
		aSocialSecurityLabel.setBounds(21, 0, 218, 22);
		panel_16.add(aSocialSecurityLabel);

		final JTextField textField_7 = new JTextField();
		textField_7.setBounds(21, 21, 379, 21);
		panel_16.add(textField_7);

		final JLabel bMedicareNumberorLabel = new JLabel();
		bMedicareNumberorLabel.setFont(new Font("Arial", Font.BOLD, 12));
		bMedicareNumberorLabel.setText("B. Medicare number");
		bMedicareNumberorLabel.setBounds(21, 48, 121, 14);
		panel_16.add(bMedicareNumberorLabel);

		final JTextField textField_8 = new JTextField();
		textField_8.setBounds(21, 68, 379, 21);
		panel_16.add(textField_8);

		final JLabel orComparableRailroadLabel = new JLabel();
		orComparableRailroadLabel
				.setText("(or comparable railroad insurance number);");
		orComparableRailroadLabel.setBounds(148, 49, 252, 14);
		panel_16.add(orComparableRailroadLabel);

		final JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setPreferredSize(new Dimension(820, 50));
		panel.add(panel_17);

		final JPanel panel_18 = new JPanel();
		panel_18.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setBounds(0, 23, 75, 28);
		panel_17.add(panel_18);

		final JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.WHITE);
		panel_19.setLayout(null);
		panel_19.setBounds(75, 24, 744, 26);
		panel_17.add(panel_19);

		final JTextField textField_9 = new JTextField();
		textField_9.setBounds(21, 5, 384, 18);
		panel_19.add(textField_9);

		final JPanel panel_22 = new JPanel();
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_22.setLayout(flowLayout_5);
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(0, 0, 820, 24);
		panel_17.add(panel_22);

		final JLabel a1000RaceethnicityLabel = new JLabel();
		a1000RaceethnicityLabel.setFont(new Font("Arial", Font.BOLD, 12));
		a1000RaceethnicityLabel.setText("A1000. Race/Ethnicity");
		panel_22.add(a1000RaceethnicityLabel);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setPreferredSize(new Dimension(820, 75));
		panel.add(panel_5_1);

		final JPanel panel_6_1 = new JPanel();
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		panel_6_1.setLayout(flowLayout_6);
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBounds(0, 0, 820, 24);
		panel_5_1.add(panel_6_1);

		final JLabel a0500Label_1 = new JLabel();
		a0500Label_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0500Label_1.setText("A0800. Gender");
		panel_6_1.add(a0500Label_1);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 23, 75, 51);
		panel_5_1.add(panel_7_1);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 0, 54, 14);
		panel_7_1.add(enterCodeLabel_1);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1.setBounds(10, 20, 43, 24);
		panel_7_1.add(comboBox_1);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(74, 23, 746, 52);
		panel_5_1.add(panel_8_1);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Arial", Font.BOLD, 12));
		label_2.setText("1. Male");
		label_2.setBounds(21, 8, 238, 14);
		panel_8_1.add(label_2);

		final JLabel label_1_1 = new JLabel();
		label_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1_1.setText("2. Female");
		label_1_1.setBounds(21, 28, 396, 14);
		panel_8_1.add(label_1_1);

		final JPanel panel_17_1 = new JPanel();
		panel_17_1.setLayout(null);
		panel_17_1.setPreferredSize(new Dimension(820, 50));
		panel.add(panel_17_1);

		final JPanel panel_19_1 = new JPanel();
		panel_19_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_19_1.setBackground(Color.WHITE);
		panel_19_1.setLayout(null);
		panel_19_1.setBounds(74, 23, 746, 27);
		panel_17_1.add(panel_19_1);

		final JTextField textField_10 = new JTextField();
		textField_10.setBounds(21, 5, 316, 18);
		panel_19_1.add(textField_10);

		final JPanel panel_20 = new JPanel();
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_20.setLayout(flowLayout_7);
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.setBounds(0, -1, 820, 25);
		panel_17_1.add(panel_20);

		final JLabel a0900BirthDateLabel = new JLabel();
		a0900BirthDateLabel.setFont(new Font("Arial", Font.BOLD, 12));
		a0900BirthDateLabel.setText("A0900. Birth Date");
		panel_20.add(a0900BirthDateLabel);

		final JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_21.setBounds(0, 22, 75, 28);
		panel_17_1.add(panel_21);

		final JPanel panel_12_1 = new JPanel();
		panel_12_1.setBackground(Color.WHITE);
		panel_12_1.setLayout(null);
		panel_12_1.setPreferredSize(new Dimension(840, 207));
		panel.add(panel_12_1);

		final JPanel panel_14_1 = new JPanel();
		panel_14_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_14_1.setLayout(null);
		panel_14_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1.setBounds(9, 46, 75, 163);
		panel_12_1.add(panel_14_1);

		final JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1.setBounds(10, 57, 43, 24);
		panel_14_1.add(comboBox_1_1);

		final JPanel panel_15_1 = new JPanel();
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_15_1.setLayout(flowLayout_8);
		panel_15_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_15_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_15_1.setPreferredSize(new Dimension(0, 0));
		panel_15_1.setBounds(10, -1, 820, 27);
		panel_12_1.add(panel_15_1);

		final JLabel a0600SocialSecurityLabel_1 = new JLabel();
		a0600SocialSecurityLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0600SocialSecurityLabel_1.setText("A1000. Race/Ethnicity");
		panel_15_1.add(a0600SocialSecurityLabel_1);

		final JPanel panel_16_1 = new JPanel();
		panel_16_1.setLayout(null);
		panel_16_1.setBounds(83, 47, 747, 161);
		panel_12_1.add(panel_16_1);

		final JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setBounds(0, -1, 747, 25);
		panel_16_1.add(panel_24);

		final JLabel aAmericanIndianLabel = new JLabel();
		aAmericanIndianLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aAmericanIndianLabel.setText("A. American Indian or Alaska Native");
		aAmericanIndianLabel.setBounds(21, 0, 216, 14);
		panel_24.add(aAmericanIndianLabel);

		final JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setBounds(0, 23, 747, 28);
		panel_16_1.add(panel_25);

		final JLabel bAsianLabel = new JLabel();
		bAsianLabel.setFont(new Font("Arial", Font.BOLD, 12));
		bAsianLabel.setText("B. Asian");
		bAsianLabel.setBounds(21, 0, 213, 14);
		panel_25.add(bAsianLabel);

		final JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setBounds(0, 50, 747, 27);
		panel_16_1.add(panel_26);

		final JLabel blackOrAfricanLabel = new JLabel();
		blackOrAfricanLabel.setFont(new Font("Arial", Font.BOLD, 12));
		blackOrAfricanLabel.setText("Black or African American");
		blackOrAfricanLabel.setBounds(21, 10, 233, 14);
		panel_26.add(blackOrAfricanLabel);

		final JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setBounds(0, 76, 747, 30);
		panel_16_1.add(panel_27);

		final JLabel hispanicOrLatinoLabel = new JLabel();
		hispanicOrLatinoLabel.setFont(new Font("Arial", Font.BOLD, 12));
		hispanicOrLatinoLabel.setText("Hispanic or Latino");
		hispanicOrLatinoLabel.setBounds(21, 0, 332, 14);
		panel_27.add(hispanicOrLatinoLabel);

		final JPanel panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBackground(Color.WHITE);
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setBounds(0, 105, 747, 31);
		panel_16_1.add(panel_28);

		final JLabel nativeHawaiianOrLabel = new JLabel();
		nativeHawaiianOrLabel.setFont(new Font("Arial", Font.BOLD, 12));
		nativeHawaiianOrLabel
				.setText("Native Hawaiian or Other Pacific Islander");
		nativeHawaiianOrLabel.setBounds(21, 0, 424, 14);
		panel_28.add(nativeHawaiianOrLabel);

		final JPanel panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_29.setBounds(0, 135, 747, 26);
		panel_16_1.add(panel_29);

		final JLabel whiteLabel = new JLabel();
		whiteLabel.setFont(new Font("Arial", Font.BOLD, 12));
		whiteLabel.setText("White");
		whiteLabel.setBounds(21, 0, 367, 14);
		panel_29.add(whiteLabel);

		final JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setBackground(Color.WHITE);
		panel_23.setBounds(9, 25, 821, 22);
		panel_12_1.add(panel_23);

		final JLabel checkAllThatLabel = new JLabel();
		checkAllThatLabel.setFont(new Font("Arial", Font.BOLD, 12));
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(40, 0, 193, 14);
		panel_23.add(checkAllThatLabel);

		final JPanel panel_12_2 = new JPanel();
		panel_12_2.setBackground(Color.WHITE);
		panel_12_2.setLayout(null);
		panel_12_2.setPreferredSize(new Dimension(840, 150));
		panel.add(panel_12_2);

		final JPanel panel_14_2 = new JPanel();
		panel_14_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_14_2.setLayout(null);
		panel_14_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_2.setBounds(9, 22, 75, 128);
		panel_12_2.add(panel_14_2);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_14_2.add(enterCodeLabel_2);

		final JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1.setBounds(10, 30, 44, 24);
		panel_14_2.add(comboBox_1_1_1);

		final JPanel panel_15_2 = new JPanel();
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		panel_15_2.setLayout(flowLayout_9);
		panel_15_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_15_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_15_2.setPreferredSize(new Dimension(0, 0));
		panel_15_2.setBounds(9, 0, 821, 24);
		panel_12_2.add(panel_15_2);

		final JLabel a0600SocialSecurityLabel_2 = new JLabel();
		a0600SocialSecurityLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0600SocialSecurityLabel_2.setText("A1100. Language");
		panel_15_2.add(a0600SocialSecurityLabel_2);

		final JPanel panel_16_2 = new JPanel();
		panel_16_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_16_2.setBackground(Color.WHITE);
		panel_16_2.setLayout(null);
		panel_16_2.setBounds(81, 22, 749, 128);
		panel_12_2.add(panel_16_2);

		final JLabel aDoesTheLabel = new JLabel();
		aDoesTheLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aDoesTheLabel
				.setText("A. Does the resident need or want an interpreter to communicate with a doctor or health care staff?");
		aDoesTheLabel.setBounds(21, 3, 563, 14);
		panel_16_2.add(aDoesTheLabel);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3.setText("<HTML><BODY>0.<B> No");
		label_3.setBounds(21, 20, 225, 14);
		panel_16_2.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Arial", Font.PLAIN, 12));
		label_4
				.setText("<HTML><BODY>1.<B> Yes -> </B>Specify in A1100B, Preferred language");
		label_4.setBounds(21, 37, 309, 14);
		panel_16_2.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Arial", Font.BOLD, 12));
		label_5.setText("9. Unable to determine");
		label_5.setBounds(21, 57, 327, 14);
		panel_16_2.add(label_5);

		final JLabel bPreferredLanguageLabel = new JLabel();
		bPreferredLanguageLabel.setFont(new Font("Arial", Font.BOLD, 12));
		bPreferredLanguageLabel.setText("B. Preferred language.");
		bPreferredLanguageLabel.setBounds(21, 84, 470, 14);
		panel_16_2.add(bPreferredLanguageLabel);

		final JTextField textField_11 = new JTextField();
		textField_11.setBounds(21, 104, 553, 18);
		panel_16_2.add(textField_11);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 14));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setPreferredSize(new Dimension(820, 30));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		panel.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);

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
		PanelMDS3Page2 panel = new PanelMDS3Page2();
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
