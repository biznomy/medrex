package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page28 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4485836965683147642L;

	PanelMDS3Page28() {

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
		sectionALabel.setText("Section N");
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
				.setText("Special Treatments,Procedures,and Programs");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(0, 93, 840, 840);
		add(panel_7);

		final JPanel panel = new JPanel();
		panel.setBounds(0, 0, 80, 280);
		panel_7.add(panel);
		panel.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel.setLayout(null);

		final JTextField textField_2 = new JTextField();
		textField_2.setBounds(25, 38, 30, 18);
		panel.add(textField_2);

		final JTextField textField_2_1 = new JTextField();
		textField_2_1.setBounds(25, 90, 30, 18);
		panel.add(textField_2_1);

		final JTextField textField_2_2 = new JTextField();
		textField_2_2.setBounds(25, 135, 30, 18);
		panel.add(textField_2_2);

		final JTextField textField_2_3 = new JTextField();
		textField_2_3.setBounds(25, 190, 30, 18);
		panel.add(textField_2_3);

		final JLabel enterNumberOfLabel = new JLabel();
		enterNumberOfLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		enterNumberOfLabel.setText("<html><body>Enter Number <br>of Minutes");
		enterNumberOfLabel.setBounds(10, 10, 70, 28);
		panel.add(enterNumberOfLabel);

		final JLabel enterNumberofLabel = new JLabel();
		enterNumberofLabel.setText("<html><body>Enter Number <br>of Minutes");
		enterNumberofLabel.setBounds(10, 60, 70, 28);
		panel.add(enterNumberofLabel);

		final JLabel label_4_2 = new JLabel();
		label_4_2.setText("<html><body>Enter Number <br>of Minutes");
		label_4_2.setBounds(10, 108, 70, 28);
		panel.add(label_4_2);

		final JLabel enterNumberofLabel_1 = new JLabel();
		enterNumberofLabel_1.setText("<html><body>Enter Number <br>of Days");
		enterNumberofLabel_1.setBounds(10, 160, 70, 28);
		panel.add(enterNumberofLabel_1);

		final JPanel panel_5 = new JPanel();
		panel_5.setBounds(80, 0, 760, 280);
		panel_7.add(panel_5);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 760, 20);
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5.add(panel_6);

		final JLabel aSpeechlanguageLabel = new JLabel();
		aSpeechlanguageLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		aSpeechlanguageLabel
				.setText(" A. Speech -Language Pathology and Audiology Service");
		aSpeechlanguageLabel.setBounds(10, 2, 313, 14);
		panel_6.add(aSpeechlanguageLabel);

		final JLabel label = new JLabel();
		label
				.setText("<html><body><b> &nbsp &nbsp 1. Individual minutes - </b> record the total number of minutes this therapy was administrated to the resident <b> individually </b> <br> &nbsp &nbsp  in the last 7 days <br><br> &nbsp &nbsp <b> 2. concurrent minutes- </b> record the total number of minutes this therapy was administrated to the resident <br> &nbsp &nbsp <b> concurrently with one other resident </b>in the last 7 days <br> <br> &nbsp &nbsp <b> 3. Group minutes -</b> record the total number of minutes this therapy was administrated to the resident as a <b> part of a group <br> &nbsp &nbsp of residents </b> in the last 7 days ");
		label.setBounds(0, 20, 750, 112);
		panel_5.add(label);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body><b> If the sum of individual , concurrent,and group minutes is zero ,--></b> skip to O0400B,Occupational therapy <br><br> &nbsp &nbsp <b> 4. Days -</b> record the <b> number of days </b> this therapy was administrated for <b> at least 15 minutes </b> a day in the last 7 days  ");
		label_1.setBounds(10, 132, 750, 52);
		panel_5.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2
				.setText("<html><body><b> 5. Threapy start date-</b> record the date the most recent <br> &nbsp &nbsp therapy regimen(since the most recent entry )started");
		label_2.setBounds(25, 185, 362, 35);
		panel_5.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3
				.setText("<html><body><b>6. Therapy end date- </b> record the date the most recent <br> &nbsp &nbsp therapy regimen (since the most recent entry) ended <br> &nbsp &nbsp -enter dashes if therapy is ongoing");
		label_3.setBounds(400, 185, 340, 45);
		panel_5.add(label_3);

		final JDateChooser textField = new JDateChooser();
		textField.setBounds(55, 230, 160, 20);
		panel_5.add(textField);

		final JLabel monthLabel = new JLabel();
		monthLabel.setText("Month");
		monthLabel.setBounds(50, 255, 54, 14);
		panel_5.add(monthLabel);

		final JLabel dayLabel = new JLabel();
		dayLabel.setText("Day");
		dayLabel.setBounds(110, 255, 54, 14);
		panel_5.add(dayLabel);

		final JLabel yearLabel = new JLabel();
		yearLabel.setText("Year");
		yearLabel.setBounds(170, 255, 54, 14);
		panel_5.add(yearLabel);

		final JDateChooser textField_1 = new JDateChooser();
		textField_1.setBounds(435, 230, 160, 20);
		panel_5.add(textField_1);

		final JLabel monthLabel_1 = new JLabel();
		monthLabel_1.setText("Month");
		monthLabel_1.setBounds(440, 255, 54, 14);
		panel_5.add(monthLabel_1);

		final JLabel dayLabel_1 = new JLabel();
		dayLabel_1.setText("Day");
		dayLabel_1.setBounds(500, 255, 54, 14);
		panel_5.add(dayLabel_1);

		final JLabel yearLabel_1 = new JLabel();
		yearLabel_1.setText("Year");
		yearLabel_1.setBounds(560, 255, 54, 14);
		panel_5.add(yearLabel_1);

		final JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(0, 280, 80, 280);
		panel_8.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7.add(panel_8);

		final JTextField textField_2_4 = new JTextField();
		textField_2_4.setBounds(25, 38, 30, 18);
		panel_8.add(textField_2_4);

		final JTextField textField_2_1_1 = new JTextField();
		textField_2_1_1.setBounds(25, 90, 30, 18);
		panel_8.add(textField_2_1_1);

		final JTextField textField_2_2_1 = new JTextField();
		textField_2_2_1.setBounds(25, 135, 30, 18);
		panel_8.add(textField_2_2_1);

		final JTextField textField_2_3_1 = new JTextField();
		textField_2_3_1.setBounds(25, 190, 30, 18);
		panel_8.add(textField_2_3_1);

		final JLabel enterNumberOfLabel_1 = new JLabel();
		enterNumberOfLabel_1.setText("<html><body>Enter Number <br>of Minutes");
		enterNumberOfLabel_1.setBounds(10, 10, 70, 28);
		panel_8.add(enterNumberOfLabel_1);

		final JLabel enterNumberofLabel_2 = new JLabel();
		enterNumberofLabel_2.setText("<html><body>Enter Number <br>of Minutes");
		enterNumberofLabel_2.setBounds(10, 60, 70, 28);
		panel_8.add(enterNumberofLabel_2);

		final JLabel enterNumberofLabel_3 = new JLabel();
		enterNumberofLabel_3.setText("<html><body>Enter Number <br>of Minutes");
		enterNumberofLabel_3.setBounds(10, 108, 70, 28);
		panel_8.add(enterNumberofLabel_3);

		final JLabel enterNumberofLabel_1_1 = new JLabel();
		enterNumberofLabel_1_1.setText("<html><body>Enter Number <br>of Days");
		enterNumberofLabel_1_1.setBounds(10, 160, 70, 28);
		panel_8.add(enterNumberofLabel_1_1);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(80, 280, 760, 280);
		panel_7.add(panel_5_1);

		final JLabel nbspnbspLabel = new JLabel();
		nbspnbspLabel
				.setText("<html><body><b> &nbsp &nbsp 1. Individual minutes - </b> record the total number of minutes this therapy was administrated to the resident <b> individually </b> <br> &nbsp &nbsp  in the last 7 days <br><br> &nbsp &nbsp <b> 2. concurrent minutes- </b> record the total number of minutes this therapy was administrated to the resident <br> &nbsp &nbsp <b> concurrently with one other resident </b>in the last 7 days <br> <br> &nbsp &nbsp <b> 3. Group minutes -</b> record the total number of minutes this therapy was administrated to the resident as a <b> part of a group <br> &nbsp &nbsp of residents </b> in the last 7 days ");
		nbspnbspLabel.setBounds(10, 20, 750, 112);
		panel_5_1.add(nbspnbspLabel);

		final JLabel ifTheLabel = new JLabel();
		ifTheLabel
				.setText("<html><body><b> If the sum of individual , concurrent,and group minutes is zero ,--></b> skip to O0400C,Occupational therapy <br><br> &nbsp &nbsp <b> 4. Days -</b> record the <b> number of days </b> this therapy was administrated for <b> at least 15 minutes </b> a day in the last 7 days  ");
		ifTheLabel.setBounds(10, 135, 750, 45);
		panel_5_1.add(ifTheLabel);

		final JLabel label_2_1 = new JLabel();
		label_2_1
				.setText("<html><body><b> 5. Threapy start date-</b> record the date the most recent <br> &nbsp &nbsp therapy regimen(since the most recent entry )started");
		label_2_1.setBounds(20, 185, 362, 35);
		panel_5_1.add(label_2_1);

		final JLabel label_3_1 = new JLabel();
		label_3_1
				.setText("<html><body><b>6. Therapy end date- </b> record the date the most recent <br> &nbsp &nbsp therapy regimen (since the most recent entry) ended <br> &nbsp &nbsp -enter dashes if therapy is ongoing");
		label_3_1.setBounds(400, 185, 340, 45);
		panel_5_1.add(label_3_1);

		final JDateChooser textField_3 = new JDateChooser();
		textField_3.setBounds(50, 230, 160, 20);
		panel_5_1.add(textField_3);

		final JLabel monthLabel_2 = new JLabel();
		monthLabel_2.setText("Month");
		monthLabel_2.setBounds(50, 255, 54, 14);
		panel_5_1.add(monthLabel_2);

		final JLabel dayLabel_2 = new JLabel();
		dayLabel_2.setText("Day");
		dayLabel_2.setBounds(110, 255, 54, 14);
		panel_5_1.add(dayLabel_2);

		final JLabel yearLabel_2 = new JLabel();
		yearLabel_2.setText("Year");
		yearLabel_2.setBounds(170, 255, 54, 14);
		panel_5_1.add(yearLabel_2);

		final JDateChooser textField_1_1 = new JDateChooser();
		textField_1_1.setBounds(435, 230, 160, 20);
		panel_5_1.add(textField_1_1);

		final JLabel monthLabel_1_1 = new JLabel();
		monthLabel_1_1.setText("Month");
		monthLabel_1_1.setBounds(440, 255, 54, 14);
		panel_5_1.add(monthLabel_1_1);

		final JLabel dayLabel_1_1 = new JLabel();
		dayLabel_1_1.setText("Day");
		dayLabel_1_1.setBounds(500, 255, 54, 14);
		panel_5_1.add(dayLabel_1_1);

		final JLabel yearLabel_1_1 = new JLabel();
		yearLabel_1_1.setText("Year");
		yearLabel_1_1.setBounds(560, 255, 54, 14);
		panel_5_1.add(yearLabel_1_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBounds(0, 0, 760, 20);
		panel_5_1.add(panel_6_1);
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);

		final JLabel aSpeechlanguageLabel_1 = new JLabel();
		aSpeechlanguageLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		aSpeechlanguageLabel_1.setText(" B. Occupational Therapy");
		aSpeechlanguageLabel_1.setBounds(10, 2, 313, 14);
		panel_6_1.add(aSpeechlanguageLabel_1);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBounds(0, 560, 80, 280);
		panel_7.add(panel_8_1);
		panel_8_1.setLayout(null);
		panel_8_1.setBackground(ColorConstants.MDS_BACK_COLOR);

		final JTextField textField_2_4_1 = new JTextField();
		textField_2_4_1.setBounds(25, 38, 30, 18);
		panel_8_1.add(textField_2_4_1);

		final JTextField textField_2_1_1_1 = new JTextField();
		textField_2_1_1_1.setBounds(25, 90, 30, 18);
		panel_8_1.add(textField_2_1_1_1);

		final JTextField textField_2_2_1_1 = new JTextField();
		textField_2_2_1_1.setBounds(25, 135, 30, 18);
		panel_8_1.add(textField_2_2_1_1);

		final JTextField textField_2_3_1_1 = new JTextField();
		textField_2_3_1_1.setBounds(25, 190, 30, 18);
		panel_8_1.add(textField_2_3_1_1);

		final JLabel enterNumberOfLabel_1_1 = new JLabel();
		enterNumberOfLabel_1_1
				.setText("<html><body>Enter Number <br>of Minutes");
		enterNumberOfLabel_1_1.setBounds(10, 10, 70, 28);
		panel_8_1.add(enterNumberOfLabel_1_1);

		final JLabel enterNumberofLabel_2_1 = new JLabel();
		enterNumberofLabel_2_1
				.setText("<html><body>Enter Number <br>of Minutes");
		enterNumberofLabel_2_1.setBounds(10, 60, 70, 28);
		panel_8_1.add(enterNumberofLabel_2_1);

		final JLabel enterNumberofLabel_3_1 = new JLabel();
		enterNumberofLabel_3_1
				.setText("<html><body>Enter Number <br>of Minutes");
		enterNumberofLabel_3_1.setBounds(10, 108, 70, 28);
		panel_8_1.add(enterNumberofLabel_3_1);

		final JLabel enterNumberofLabel_1_1_1 = new JLabel();
		enterNumberofLabel_1_1_1
				.setText("<html><body>Enter Number <br>of Days");
		enterNumberofLabel_1_1_1.setBounds(10, 160, 70, 28);
		panel_8_1.add(enterNumberofLabel_1_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBounds(80, 560, 760, 280);
		panel_7.add(panel_5_1_1);
		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBackground(Color.WHITE);

		final JLabel nbspnbspLabel_1 = new JLabel();
		nbspnbspLabel_1
				.setText("<html><body><b> &nbsp &nbsp 1. Individual minutes - </b> record the total number of minutes this therapy was administrated to the resident <b> individually </b> <br> &nbsp &nbsp  in the last 7 days <br><br> &nbsp &nbsp <b> 2. concurrent minutes- </b> record the total number of minutes this therapy was administrated to the resident <br> &nbsp &nbsp <b> concurrently with one other resident </b>in the last 7 days <br> <br> &nbsp &nbsp <b> 3. Group minutes -</b> record the total number of minutes this therapy was administrated to the resident as a <b> part of a group <br> &nbsp &nbsp of residents </b> in the last 7 days ");
		nbspnbspLabel_1.setBounds(10, 20, 750, 112);
		panel_5_1_1.add(nbspnbspLabel_1);

		final JLabel ifTheLabel_1 = new JLabel();
		ifTheLabel_1
				.setText("<html><body><b> If the sum of individual , concurrent,and group minutes is zero ,--></b> skip to O0400D,Occupational therapy <br><br> &nbsp &nbsp <b> 4. Days -</b> record the <b> number of days </b> this therapy was administrated for <b> at least 15 minutes </b> a day in the last 7 days  ");
		ifTheLabel_1.setBounds(10, 130, 750, 52);
		panel_5_1_1.add(ifTheLabel_1);

		final JLabel label_2_1_1 = new JLabel();
		label_2_1_1
				.setText("<html><body><b> 5. Threapy start date-</b> record the date the most recent <br> &nbsp &nbsp therapy regimen(since the most recent entry )started");
		label_2_1_1.setBounds(20, 180, 362, 35);
		panel_5_1_1.add(label_2_1_1);

		final JLabel label_3_1_1 = new JLabel();
		label_3_1_1
				.setText("<html><body><b>6. Therapy end date- </b> record the date the most recent <br> &nbsp &nbsp therapy regimen (since the most recent entry) ended <br> &nbsp &nbsp -enter dashes if therapy is ongoing");
		label_3_1_1.setBounds(400, 180, 340, 45);
		panel_5_1_1.add(label_3_1_1);

		final JDateChooser textField_3_1 = new JDateChooser();
		textField_3_1.setBounds(50, 225, 160, 20);
		panel_5_1_1.add(textField_3_1);

		final JLabel monthLabel_2_1 = new JLabel();
		monthLabel_2_1.setText("Month");
		monthLabel_2_1.setBounds(50, 255, 54, 14);
		panel_5_1_1.add(monthLabel_2_1);

		final JLabel dayLabel_2_1 = new JLabel();
		dayLabel_2_1.setText("Day");
		dayLabel_2_1.setBounds(110, 255, 54, 14);
		panel_5_1_1.add(dayLabel_2_1);

		final JLabel yearLabel_2_1 = new JLabel();
		yearLabel_2_1.setText("Year");
		yearLabel_2_1.setBounds(170, 255, 54, 14);
		panel_5_1_1.add(yearLabel_2_1);

		final JDateChooser textField_1_1_1 = new JDateChooser();
		textField_1_1_1.setBounds(435, 225, 160, 20);
		panel_5_1_1.add(textField_1_1_1);

		final JLabel monthLabel_1_1_1 = new JLabel();
		monthLabel_1_1_1.setText("Month");
		monthLabel_1_1_1.setBounds(440, 255, 54, 14);
		panel_5_1_1.add(monthLabel_1_1_1);

		final JLabel dayLabel_1_1_1 = new JLabel();
		dayLabel_1_1_1.setText("Day");
		dayLabel_1_1_1.setBounds(500, 255, 54, 14);
		panel_5_1_1.add(dayLabel_1_1_1);

		final JLabel yearLabel_1_1_1 = new JLabel();
		yearLabel_1_1_1.setText("Year");
		yearLabel_1_1_1.setBounds(560, 255, 54, 14);
		panel_5_1_1.add(yearLabel_1_1_1);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(0, 0, 760, 20);
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1.add(panel_6_1_1);

		final JLabel aSpeechlanguageLabel_1_1 = new JLabel();
		aSpeechlanguageLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		aSpeechlanguageLabel_1_1.setText("C. Physical Therapy");
		aSpeechlanguageLabel_1_1.setBounds(10, 2, 313, 14);
		panel_6_1_1.add(aSpeechlanguageLabel_1_1);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBounds(0, 70, 840, 22);
		panel_9.setBackground(ColorConstants.MDS_BACK_COLOR);
		add(panel_9);

		final JLabel o0400TherapiesLabel = new JLabel();
		o0400TherapiesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		o0400TherapiesLabel.setText("O0400. Therapies");
		o0400TherapiesLabel.setBounds(25, 5, 517, 14);
		panel_9.add(o0400TherapiesLabel);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1.setLayout(null);
		panel_9_1.setBounds(0, 932, 840, 22);
		panel_9_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		add(panel_9_1);

		final JLabel o0400ContinuedOnLabel = new JLabel();
		o0400ContinuedOnLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		o0400ContinuedOnLabel.setText("O0400 continued on next page");
		o0400ContinuedOnLabel.setBounds(30, 5, 353, 14);
		panel_9_1.add(o0400ContinuedOnLabel);

	}
}
