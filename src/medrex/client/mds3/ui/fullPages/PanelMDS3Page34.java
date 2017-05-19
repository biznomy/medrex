package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page34 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7678923201817795548L;

	PanelMDS3Page34() {
		super();
		setFont(new Font("", Font.PLAIN, 10));
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 1250));

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 7, 840, 35);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(840, 35));
		add(panel_1);

		final JLabel residentLabel = new JLabel();
		residentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel.setText("Resident");
		residentLabel.setBounds(10, 9, 56, 16);
		panel_1.add(residentLabel);

		final JTextField txtresident = new JTextField();
		txtresident.setBounds(84, 8, 248, 20);
		panel_1.add(txtresident);

		final JLabel residentLabel_1 = new JLabel();
		residentLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1.setText("Identifier");
		residentLabel_1.setBounds(354, 10, 56, 16);
		panel_1.add(residentLabel_1);

		final JTextField txtidentifier = new JTextField();
		txtidentifier.setBounds(429, 8, 213, 20);
		panel_1.add(txtidentifier);

		final JLabel residentLabel_1_1 = new JLabel();
		residentLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1_1.setText("Date");
		residentLabel_1_1.setBounds(668, 10, 56, 16);
		panel_1.add(residentLabel_1_1);

		final JDateChooser dcDate = new JDateChooser();
		dcDate.setBackground(Color.WHITE);
		dcDate.setBounds(730, 8, 100, 22);
		panel_1.add(dcDate);

		final JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 42, 840, 25);
		panel_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(840, 25));
		add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_3.setBounds(3, 3, 245, 18);
		panel_2.add(panel_3);

		final JLabel sectionALabel = new JLabel();
		sectionALabel.setBounds(10, 2, 74, 19);
		sectionALabel.setForeground(Color.WHITE);
		sectionALabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectionALabel.setText("Section X");
		panel_3.add(sectionALabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_4.setBounds(246, 2, 595, 21);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel.setBounds(5, 2, 498, 19);
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 16));
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Correction Request");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);
		panel_13.setBounds(0, 594, 840, 425);
		add(panel_13);

		final JPanel panel_14 = new JPanel();
		panel_14.setBounds(0, 30, 840, 120);
		panel_13.add(panel_14);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);

		final JPanel panel_5_6 = new JPanel();
		panel_5_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_6.setLayout(null);
		panel_5_6.setBounds(0, 0, 80, 120);
		panel_14.add(panel_5_6);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 15, 66, 16);
		panel_5_6.add(enterCodeLabel_1);

		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(20, 45, 31, 25);
		panel_5_6.add(comboBox_3);

		final JPanel panel_6_6 = new JPanel();
		panel_6_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_6.setLayout(null);
		panel_6_6.setBounds(80, 0, 760, 120);
		panel_14.add(panel_6_6);

		final JLabel aPriorLabel = new JLabel();
		aPriorLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aPriorLabel
				.setText("<html><body><b> A. Federal OBRA Reason for Assessment </b> <br> &nbsp &nbsp 01. <b> Admission </b> assessment (required by day 14) <br> &nbsp &nbsp 02. <b> Quarterly </b> review assessment <br> &nbsp &nbsp 03. <b> Annual </b> assessment <br> &nbsp &nbsp  04. <b> Significant Change in Status </b> Assessment <br> &nbsp &nbsp 05. <b> Significant correction </b> to <b> prior comprehensive </b> Assessment <br> &nbsp &nbsp 06. <b> Significant correction </b> to <b> prior quaterly </b> Assessment <br> &nbsp &nbsp 99.<b> Not OBRA required </b> assessment");
		aPriorLabel.setBounds(10, 2, 750, 115);
		panel_6_6.add(aPriorLabel);

		final JPanel panel_15 = new JPanel();
		panel_15.setBounds(0, 150, 840, 190);
		panel_13.add(panel_15);
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);

		final JPanel panel_5_7 = new JPanel();
		panel_5_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_7.setLayout(null);
		panel_5_7.setBounds(0, 0, 80, 190);
		panel_15.add(panel_5_7);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 40, 66, 16);
		panel_5_7.add(enterCodeLabel_2);

		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(20, 75, 31, 25);
		panel_5_7.add(comboBox_4);

		final JPanel panel_6_7 = new JPanel();
		panel_6_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_7.setLayout(null);
		panel_6_7.setBounds(80, 0, 760, 195);
		panel_15.add(panel_6_7);

		final JLabel bLabel = new JLabel();
		bLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bLabel
				.setText("<html><body> <b> B. PPS Assessment <br> &nbsp &nbsp <u> PPS Scheduled Assessment for a Medicare Part A Stay </u> <br> &nbsp &nbsp 01. 5-day </b> scheduled assessment <br> &nbsp &nbsp 02. <b> 14-day </b> scheduled assessment <br> &nbsp &nbsp 03. <b> 30-day </b> scheduled assessment <br> &nbsp &nbsp 04. <b> 60-day </b> scheduled assessment <br> &nbsp &nbsp 05. <b> 90-day </b> scheduled assessment <br> &nbsp &nbsp 06. <b> Readmission/Return </b> assessment <br> &nbsp &nbsp <b><u> PPS Unscheduled Assessment for a Medicare Part A Stay </b></u><br> &nbsp &nbsp 07. <b> Unscheduled assessment used for PPS </b> (OMRA,significant or clinical change,or significant correction assessment <br> &nbsp &nbsp <u><b> Not PPS Assessment </b></u><br> &nbsp &nbsp 99. <b> Not PPS </b> assessment");
		bLabel.setBounds(10, 2, 750, 185);
		panel_6_7.add(bLabel);

		final JPanel panel_16 = new JPanel();
		panel_16.setBounds(0, 340, 840, 85);
		panel_13.add(panel_16);
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);

		final JPanel panel_5_8 = new JPanel();
		panel_5_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_8.setLayout(null);
		panel_5_8.setBounds(0, 0, 80, 85);
		panel_16.add(panel_5_8);

		final JLabel enterCodeLabel_3 = new JLabel();
		enterCodeLabel_3.setText("Enter Code");
		enterCodeLabel_3.setBounds(10, 5, 66, 16);
		panel_5_8.add(enterCodeLabel_3);

		final JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(20, 30, 31, 25);
		panel_5_8.add(comboBox_5);

		final JPanel panel_6_8 = new JPanel();
		panel_6_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8.setLayout(null);
		panel_6_8.setBounds(80, 0, 760, 85);
		panel_16.add(panel_6_8);

		final JLabel label_16 = new JLabel();
		label_16.setFont(new Font("Arial", Font.PLAIN, 12));
		label_16
				.setText("<html><body> <b> C. PPS Other Medicare Required Assessment -OMRA <br> &nbsp &nbsp </b> 0. <b> No </b> <br> &nbsp &nbsp 1. <b>Start of therapy </b> assessment <br> &nbsp &nbsp 2. <b> End of therapy </b> assessment <br> &nbsp &nbsp 3. <b> Both Start and End of therapy </b> assessment");
		label_16.setBounds(10, 2, 750, 80);
		panel_6_8.add(label_16);

		final JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBounds(0, 0, 840, 30);
		panel_13.add(panel_22);

		final JLabel x0500Label = new JLabel();
		x0500Label.setFont(new Font("Arial", Font.PLAIN, 12));
		x0500Label.setBounds(10, 5, 459, 16);
		x0500Label
				.setText("<html><body> <b> X0600. Type of Assessment </b> on existing record to be modified/inactivated");
		panel_22.add(x0500Label);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBounds(0, 145, 840, 50);
		add(panel_7);

		final JLabel label_17 = new JLabel();
		label_17.setFont(new Font("Arial", Font.PLAIN, 12));
		label_17.setBounds(10, 5, 800, 40);
		label_17
				.setText("<html><body> <b> Identification of Record to be Modified/Inactivated-</b> The following items identifying the existing assessment record that is in error. In this <br> section, reproduse the information EXACTLY as it appeared on the existing erroneous record, even if the information is incorrect. <br> This information is necessary to locate the existing record in the National MDS Database.");
		panel_7.add(label_17);

		final JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_17.setLayout(null);
		panel_17.setBounds(0, 67, 840, 80);
		add(panel_17);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBounds(0, 0, 840, 30);
		panel_17.add(panel_9);

		final JLabel x0100TypeOfLabel = new JLabel();
		x0100TypeOfLabel.setText("X0100. Types of Record ");
		x0100TypeOfLabel.setBounds(10, 0, 450, 26);
		panel_9.add(x0100TypeOfLabel);

		final JPanel panel = new JPanel();
		panel.setBounds(0, 30, 840, 50);
		panel_17.add(panel);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 80, 50);
		panel.add(panel_5);

		final JLabel label = new JLabel();
		label.setText("Enter Code");
		label.setBounds(10, 0, 70, 16);
		panel_5.add(label);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 22, 31, 25);
		panel_5.add(comboBox);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(80, 0, 760, 50);
		panel.add(panel_6);

		final JLabel label_6 = new JLabel();
		label_6.setFont(new Font("Arial", Font.PLAIN, 12));
		label_6
				.setText("<html><body><b> &nbsp &nbsp 1. add new record --></b> Skip to Z0100, Medicare Part A Billing <br> &nbsp &nbsp <b> 2. Modify existing record --></b> Continue to X0150, Type of Provider <br> &nbsp &nbsp <b> 3. Inactivate existing record --></b> Continue to X0150, Type of Provider ");
		label_6.setBounds(10, 5, 750, 40);
		panel_6.add(label_6);

		final JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBounds(0, 194, 840, 80);
		add(panel_18);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBounds(0, 0, 840, 30);
		panel_18.add(panel_9_1);
		panel_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1.setLayout(null);

		final JLabel x0100TypeOfLabel_1 = new JLabel();
		x0100TypeOfLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		x0100TypeOfLabel_1.setText("X0150. Type of Provider");
		x0100TypeOfLabel_1.setBounds(10, 0, 603, 26);
		panel_9_1.add(x0100TypeOfLabel_1);

		final JPanel panel_8 = new JPanel();
		panel_8.setBounds(0, 30, 840, 50);
		panel_18.add(panel_8);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(0, 0, 80, 50);
		panel_8.add(panel_5_1);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(10, 0, 70, 16);
		panel_5_1.add(enterCodeLabel);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(20, 22, 31, 25);
		panel_5_1.add(comboBox_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(80, 0, 760, 50);
		panel_8.add(panel_6_1);

		final JLabel label_7 = new JLabel();
		label_7
				.setText("<html><body><b> Type of provider <br> &nbsp &nbsp 1. Nursing home (SNF/NF) <br> &nbsp &nbsp 2. Swing Bed");
		label_7.setBounds(10, 5, 750, 45);
		panel_6_1.add(label_7);

		final JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBounds(0, 274, 840, 100);
		add(panel_19);

		final JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setBounds(0, 0, 840, 30);
		panel_19.add(panel_9_1_1);
		panel_9_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1.setLayout(null);

		final JLabel x0100TypeOfLabel_1_1 = new JLabel();
		x0100TypeOfLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		x0100TypeOfLabel_1_1
				.setText("<html><body> <b> X0200. Name of Resident </b> on existing record to be modified/inactivated");
		x0100TypeOfLabel_1_1.setBounds(10, 0, 603, 26);
		panel_9_1_1.add(x0100TypeOfLabel_1_1);

		final JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 30, 840, 70);
		panel_19.add(panel_10);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_2.setLayout(null);
		panel_5_2.setBounds(0, 0, 80, 70);
		panel_10.add(panel_5_2);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2.setLayout(null);
		panel_6_2.setBounds(80, 0, 760, 70);
		panel_10.add(panel_6_2);

		final JLabel aFirstNameLabel = new JLabel();
		aFirstNameLabel.setText("   A. First Name");
		aFirstNameLabel.setBounds(0, 0, 171, 16);
		panel_6_2.add(aFirstNameLabel);

		final JLabel bLastNameLabel = new JLabel();
		bLastNameLabel.setText("   B. Last Name");
		bLastNameLabel.setBounds(0, 34, 246, 16);
		panel_6_2.add(bLastNameLabel);

		final JTextField textField = new JTextField();
		textField.setBounds(55, 15, 246, 20);
		panel_6_2.add(textField);

		final JTextField textField_1 = new JTextField();
		textField_1.setBounds(55, 48, 246, 20);
		panel_6_2.add(textField_1);

		final JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBounds(0, 374, 840, 80);
		add(panel_20);

		final JPanel panel_11 = new JPanel();
		panel_11.setBounds(0, 30, 840, 50);
		panel_20.add(panel_11);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);

		final JPanel panel_5_3 = new JPanel();
		panel_5_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_3.setLayout(null);
		panel_5_3.setBounds(0, 0, 80, 50);
		panel_11.add(panel_5_3);

		final JLabel label_2 = new JLabel();
		label_2.setText("New JLabel");
		label_2.setBounds(10, 0, 66, 16);
		panel_5_3.add(label_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(20, 22, 31, 25);
		panel_5_3.add(comboBox_2);

		final JPanel panel_6_3 = new JPanel();
		panel_6_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3.setLayout(null);
		panel_6_3.setBounds(80, 0, 760, 50);
		panel_11.add(panel_6_3);

		final JLabel label_10 = new JLabel();
		label_10
				.setText("<html><body> <b> &nbsp &nbsp  1. Male <br> &nbsp &nbsp 2. Female");
		label_10.setBounds(15, 5, 458, 35);
		panel_6_3.add(label_10);

		final JLabel x0100TypeOfLabel_1_1_1 = new JLabel();
		x0100TypeOfLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		x0100TypeOfLabel_1_1_1
				.setText("<html><body> <b> X0300. Gender </b> on existing record to be modified/inactivated");
		x0100TypeOfLabel_1_1_1.setBounds(10, -2, 603, 26);
		panel_20.add(x0100TypeOfLabel_1_1_1);

		final JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBounds(0, 454, 840, 70);
		add(panel_21);

		final JPanel panel_9_1_2 = new JPanel();
		panel_9_1_2.setBounds(0, 0, 840, 30);
		panel_21.add(panel_9_1_2);
		panel_9_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2.setLayout(null);

		final JLabel x0100TypeOfLabel_1_2 = new JLabel();
		x0100TypeOfLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		x0100TypeOfLabel_1_2
				.setText("<html><body> <b> X0400. Birth Date </b> on existing record to be modified/inactivated");
		x0100TypeOfLabel_1_2.setBounds(10, 0, 603, 26);
		panel_9_1_2.add(x0100TypeOfLabel_1_2);

		final JPanel panel_12 = new JPanel();
		panel_12.setBounds(0, 30, 840, 40);
		panel_21.add(panel_12);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);

		final JPanel panel_5_4 = new JPanel();
		panel_5_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_4.setLayout(null);
		panel_5_4.setBounds(0, 0, 80, 40);
		panel_12.add(panel_5_4);

		final JPanel panel_6_4 = new JPanel();
		panel_6_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4.setLayout(null);
		panel_6_4.setBounds(80, 0, 760, 40);
		panel_12.add(panel_6_4);

		final JLabel monthLabel = new JLabel();
		monthLabel.setText("Month");
		monthLabel.setBounds(10, 20, 66, 16);
		panel_6_4.add(monthLabel);

		final JLabel dayLabel = new JLabel();
		dayLabel.setText("Day");
		dayLabel.setBounds(135, 20, 66, 16);
		panel_6_4.add(dayLabel);

		final JLabel yearLabel = new JLabel();
		yearLabel.setText("Year");
		yearLabel.setBounds(267, 20, 66, 16);
		panel_6_4.add(yearLabel);

		final JDateChooser textField_2 = new JDateChooser();
		textField_2.setBounds(10, 0, 283, 20);
		panel_6_4.add(textField_2);

		final JPanel panel_21_1 = new JPanel();
		panel_21_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_21_1.setLayout(null);
		panel_21_1.setBounds(0, 524, 840, 70);
		add(panel_21_1);

		final JPanel panel_9_1_2_1 = new JPanel();
		panel_9_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2_1.setLayout(null);
		panel_9_1_2_1.setBounds(0, 0, 840, 30);
		panel_21_1.add(panel_9_1_2_1);

		final JLabel x0100TypeOfLabel_1_2_1 = new JLabel();
		x0100TypeOfLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		x0100TypeOfLabel_1_2_1
				.setText("<html><body> <b> X0500. Social Security Number </b> on existing record to be modified/inactivated");
		x0100TypeOfLabel_1_2_1.setBounds(10, 0, 603, 26);
		panel_9_1_2_1.add(x0100TypeOfLabel_1_2_1);

		final JPanel panel_12_1 = new JPanel();
		panel_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1.setLayout(null);
		panel_12_1.setBounds(0, 30, 840, 40);
		panel_21_1.add(panel_12_1);

		final JPanel panel_5_4_1 = new JPanel();
		panel_5_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_4_1.setLayout(null);
		panel_5_4_1.setBounds(0, 0, 80, 40);
		panel_12_1.add(panel_5_4_1);

		final JPanel panel_6_4_1 = new JPanel();
		panel_6_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1.setLayout(null);
		panel_6_4_1.setBounds(80, 0, 760, 40);
		panel_12_1.add(panel_6_4_1);

		final JTextField textField_2_1 = new JTextField();
		textField_2_1.setBounds(10, 10, 283, 20);
		panel_6_4_1.add(textField_2_1);
	}

}
