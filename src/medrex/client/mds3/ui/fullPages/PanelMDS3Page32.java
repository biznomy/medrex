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

public class PanelMDS3Page32 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5883139889269096603L;

	PanelMDS3Page32() {
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
		sectionALabel.setText("Section V");
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
		identificationInformationLabel
				.setText("Care Area Assessment (CAA) Summary");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBounds(0, 70, 840, 32);
		panel_9.setBackground(ColorConstants.MDS_BACK_COLOR);
		add(panel_9);

		final JLabel o0400TherapiesLabel = new JLabel();
		o0400TherapiesLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		o0400TherapiesLabel
				.setText("<html><body> <b>V0100.Items From the Most Recent Prior OBRA or Scheduled PPS Assessment </b> <br>Complete only if A0310E=0 and if the following is true for the <b> prior assessment :</b> A0310A=01-06 or A0310B=01-06");
		o0400TherapiesLabel.setBounds(25, 5, 780, 27);
		panel_9.add(o0400TherapiesLabel);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 102, 840, 550);
		panel.setBackground(Color.WHITE);
		add(panel);

		final JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBounds(0, 0, 80, 550);
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel.add(panel_5);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(25, 60, 30, 20);
		panel_5.add(comboBox);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(25, 221, 30, 20);
		panel_5.add(comboBox_1);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(10, 200, 70, 14);
		panel_5.add(enterCodeLabel);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 40, 70, 14);
		panel_5.add(enterCodeLabel_1);

		final JLabel enterScoreLabel_2 = new JLabel();
		enterScoreLabel_2.setText("Enter Score");
		enterScoreLabel_2.setBounds(10, 395, 70, 14);
		panel_5.add(enterScoreLabel_2);

		final JLabel enterScoreLabel_1 = new JLabel();
		enterScoreLabel_1.setText("Enter Score");
		enterScoreLabel_1.setBounds(10, 455, 70, 14);
		panel_5.add(enterScoreLabel_1);

		final JLabel enterScoreLabel = new JLabel();
		enterScoreLabel.setText("Enter Score");
		enterScoreLabel.setBounds(10, 500, 70, 14);
		panel_5.add(enterScoreLabel);

		final JTextField textField = new JTextField();
		textField.setBounds(10, 522, 60, 18);
		panel_5.add(textField);

		final JTextField textField_1 = new JTextField();
		textField_1.setBounds(10, 475, 60, 18);
		panel_5.add(textField_1);

		final JTextField textField_2 = new JTextField();
		textField_2.setBounds(10, 415, 60, 18);
		panel_5.add(textField_2);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(80, 0, 760, 150);
		panel_6.setBackground(Color.WHITE);
		panel.add(panel_6);

		final JLabel label_4 = new JLabel();
		label_4
				.setText("<html><body><b> A. Prior Assessment federal OBRA Reason for Assessment </b> (A0310A value from prior assessment) <br> &nbsp &nbsp 01. <b> Admission </b> assessment (required by day 14) <br> &nbsp &nbsp 02. <b> Quarterly </b> review assessment <br> &nbsp &nbsp 03. <b> Annual </b> assessment <br> &nbsp &nbsp  04. <b> Significant Change in Status </b> Assessment <br> &nbsp &nbsp 05. <b> Significant correction </b> to <b> prior comprehensive </b> Assessment <br> &nbsp &nbsp 06. <b> Significant correction </b> to <b> prior quaterly </b> Assessment <br> &nbsp &nbsp 99.<b> Not OBRA required </b> assessment");
		label_4.setBounds(10, 0, 700, 130);
		panel_6.add(label_4);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBounds(80, 150, 760, 175);
		panel_7.setBackground(Color.WHITE);
		panel.add(panel_7);

		final JLabel label_3 = new JLabel();
		label_3
				.setText("<html><body> <b> B. Prior Assessment PPS Reason for Assessment </b> (A0310B value from prior assessment) <br> &nbsp &nbsp 01. <b> 5-day </b> scheduled assessment <br> &nbsp &nbsp 02. <b> 14-day </b> scheduled assessment <br> &nbsp &nbsp 03. <b> 30-day </b> scheduled assessment <br> &nbsp &nbsp 04. <b> 60-day </b> scheduled assessment <br> &nbsp &nbsp 05. <b> 90-day </b> scheduled assessment <br> &nbsp &nbsp 06. <b> Readmission/Return </b> assessment <br> &nbsp &nbsp 07. <b> Unscheduled assessment used for PPS </b> (OMRA,significant or clinical change,or significant correction assessment <br> &nbsp &nbsp 99. <b> Not PPS </b> assessment");
		label_3.setBounds(10, 0, 700, 155);
		panel_7.add(label_3);

		final JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBounds(80, 325, 760, 75);
		panel_8.setBackground(Color.WHITE);
		panel.add(panel_8);

		final JLabel label_5 = new JLabel();
		label_5
				.setText("<html><body><b> C. Prior Assessment Reference Date</b> (A2300 value from prior assessment)");
		label_5.setBounds(10, 10, 700, 18);
		panel_8.add(label_5);

		final JDateChooser textField_3 = new JDateChooser();
		textField_3.setBounds(145, 35, 323, 18);
		panel_8.add(textField_3);

		final JLabel monthLabel = new JLabel();
		monthLabel.setText("Month");
		monthLabel.setBounds(145, 61, 54, 14);
		panel_8.add(monthLabel);

		final JLabel dayLabel = new JLabel();
		dayLabel.setText("Day");
		dayLabel.setBounds(267, 61, 54, 14);
		panel_8.add(dayLabel);

		final JLabel yearLabel = new JLabel();
		yearLabel.setText("Year");
		yearLabel.setBounds(414, 61, 54, 14);
		panel_8.add(yearLabel);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(80, 400, 760, 50);
		panel_10.setBackground(Color.WHITE);
		panel.add(panel_10);

		final JLabel label_2 = new JLabel();
		label_2
				.setText("<html><body><b> D. Prior Assessment Brief Interview for Mental Status(BIMS)Summary Score </b> (C0500 value from prior assessment");
		label_2.setBounds(10, 10, 700, 40);
		panel_10.add(label_2);

		final JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBounds(80, 450, 760, 50);
		panel_11.setBackground(Color.WHITE);
		panel.add(panel_11);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body><b> E. Prior Assessment Resident Mood Interview(PHQ-9©)Total Severity Score </b> (D0300 value from prior assessment");
		label_1.setBounds(10, 10, 700, 40);
		panel_11.add(label_1);

		final JPanel panel_11_1 = new JPanel();
		panel_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_1.setLayout(null);
		panel_11_1.setBounds(80, 500, 760, 50);
		panel_11_1.setBackground(Color.WHITE);
		panel.add(panel_11_1);

		final JLabel label = new JLabel();
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label
				.setText("<html><body><b> F. Prior Assessment Staff Assessment of Resident Mood (PHQ-9-OV)Total Severity Score </b> (D0600 value from prior assessment ");
		label.setBounds(10, 10, 750, 40);
		panel_11_1.add(label);
	}
}
