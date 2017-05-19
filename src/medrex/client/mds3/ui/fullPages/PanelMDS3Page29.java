package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

public class PanelMDS3Page29 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1744394897731478248L;

	public PanelMDS3Page29() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(840, 1170));

		final JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 840, 25);
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
		sectionALabel.setText("Section O");
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
		identificationInformationLabel
				.setText("Special Treatments, Procedures, and programs");
		panel_4.add(identificationInformationLabel);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 31, 840, 392);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setBounds(0, 0, 840, 31);
		panel.add(panel_1);

		final JLabel o0400TherapiesLabel = new JLabel();
		o0400TherapiesLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		o0400TherapiesLabel
				.setText("<html><body><b> O0400.  Therapies </b> - Continued");
		o0400TherapiesLabel.setBounds(10, 10, 265, 14);
		panel_1.add(o0400TherapiesLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 30, 840, 121);
		panel.add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setLayout(null);
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 0, 126, 121);
		panel_5.add(panel_6);

		final JTextField textField = new JTextField();
		textField.setBorder(new LineBorder(Color.black, 1, false));
		textField.setBounds(10, 38, 26, 20);
		panel_6.add(textField);

		final JTextField textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(Color.black, 1, false));
		textField_1.setBounds(35, 38, 26, 20);
		panel_6.add(textField_1);

		final JTextField textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(Color.black, 1, false));
		textField_2.setBounds(60, 38, 26, 20);
		panel_6.add(textField_2);

		final JTextField textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(Color.black, 1, false));
		textField_3.setBounds(85, 38, 26, 20);
		panel_6.add(textField_3);

		final JLabel enterNumberOfLabel = new JLabel();
		enterNumberOfLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		enterNumberOfLabel.setText("Enter Number of minutes");
		enterNumberOfLabel.setBounds(3, 18, 123, 14);
		panel_6.add(enterNumberOfLabel);

		final JLabel enterNumberOfLabel_1 = new JLabel();
		enterNumberOfLabel_1.setFont(new Font("Arial", Font.PLAIN, 10));
		enterNumberOfLabel_1.setText("Enter Number of Days");
		enterNumberOfLabel_1.setBounds(3, 74, 108, 14);
		panel_6.add(enterNumberOfLabel_1);

		final JTextField textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField_4.setBounds(10, 94, 26, 20);
		panel_6.add(textField_4);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		panel_7.setBounds(125, 0, 720, 121);
		panel_5.add(panel_7);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_8.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 715, 21);
		panel_7.add(panel_8);

		final JLabel dRespiratoryTherapyLabel = new JLabel();
		dRespiratoryTherapyLabel.setFont(new Font("Arial", Font.BOLD, 12));
		dRespiratoryTherapyLabel.setText("D.  Respiratory Therapy");
		dRespiratoryTherapyLabel.setBounds(10, 4, 357, 14);
		panel_8.add(dRespiratoryTherapyLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 20, 715, 101);
		panel_7.add(panel_9);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label
				.setText("<html><body><b> 1. </b> &nbsp <b>Total minutes</b> - record the total number of minutes this therapy was administered to the resident in the last 7 days <br> &nbsp &nbsp  &nbsp if zero,  skip to O0400E, Psychological Therapy");
		label.setBounds(15, 10, 664, 40);
		panel_9.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_1
				.setText("<html><body><b> 2. </b> &nbsp <b> Days </b> - record the <b> number of days </b> this therapy was administered for <b> at least 15 minutes </b> a day in the 7 days");
		label_1.setBounds(15, 56, 618, 35);
		panel_9.add(label_1);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(0, 150, 840, 121);
		panel.add(panel_10);

		final JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_12.setLayout(null);
		panel_12.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_12.setBounds(0, 0, 126, 121);
		panel_10.add(panel_12);

		final JLabel enterNumberOfLabel_2 = new JLabel();
		enterNumberOfLabel_2.setFont(new Font("Arial", Font.PLAIN, 10));
		enterNumberOfLabel_2.setText("Enter Number of Minutes");
		enterNumberOfLabel_2.setBounds(3, 18, 123, 14);
		panel_12.add(enterNumberOfLabel_2);

		final JTextField textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(Color.black, 1, false));
		textField_5.setBounds(10, 38, 26, 20);
		panel_12.add(textField_5);

		final JTextField textField_6 = new JTextField();
		textField_6.setBorder(new LineBorder(Color.black, 1, false));
		textField_6.setBounds(35, 38, 26, 20);
		panel_12.add(textField_6);

		final JTextField textField_7 = new JTextField();
		textField_7.setBorder(new LineBorder(Color.black, 1, false));
		textField_7.setBounds(60, 38, 26, 20);
		panel_12.add(textField_7);

		final JTextField textField_8 = new JTextField();
		textField_8.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		textField_8.setBounds(85, 38, 26, 20);
		panel_12.add(textField_8);

		final JLabel enterNumberOfLabel_3 = new JLabel();
		enterNumberOfLabel_3.setFont(new Font("Arial", Font.PLAIN, 10));
		enterNumberOfLabel_3.setText("Enter Number of Days");
		enterNumberOfLabel_3.setBounds(3, 74, 108, 14);
		panel_12.add(enterNumberOfLabel_3);

		final JTextField textField_9 = new JTextField();
		textField_9.setBorder(new LineBorder(Color.black, 1, false));
		textField_9.setBounds(10, 94, 25, 20);
		panel_12.add(textField_9);

		final JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_13.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_13.setBounds(125, 0, 715, 21);
		panel_10.add(panel_13);

		final JLabel enbspLabel = new JLabel();
		enbspLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		enbspLabel
				.setText("<html><body><b>E. </b> &nbsp <b>  Psychological Therapy</b> (by any licensed mental health professional)");
		enbspLabel.setBounds(10, 4, 434, 14);
		panel_13.add(enbspLabel);

		final JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(125, 20, 715, 101);
		panel_10.add(panel_14);

		final JLabel label_2 = new JLabel();
		label_2
				.setText("<html><body><b> 1. </b> &nbsp <b>Total minutes</b> - record the total number of minutes this therapy was administered to the resident in the last 7 days <br> &nbsp &nbsp  &nbsp if zero,  skip to O0400F, Recreational Therapy");
		label_2.setBounds(15, 10, 664, 40);
		panel_14.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3
				.setText("<html><body><b> 2. </b> &nbsp <b> Days </b> - record the <b> number of days </b> this therapy was administered for <b> at least 15 minutes </b> a day in the 7 days");
		label_3.setBounds(15, 56, 618, 35);
		panel_14.add(label_3);

		final JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 0,
				false));
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 270, 840, 121);
		panel.add(panel_11);

		final JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(0, 0, 126, 121);
		panel_11.add(panel_15);

		final JLabel enterNumberOfLabel_4 = new JLabel();
		enterNumberOfLabel_4.setFont(new Font("Arial", Font.PLAIN, 10));
		enterNumberOfLabel_4.setText("Enter Number of Minutes");
		enterNumberOfLabel_4.setBounds(3, 18, 123, 14);
		panel_15.add(enterNumberOfLabel_4);

		final JTextField textField_10 = new JTextField();
		textField_10.setBorder(new LineBorder(Color.black, 1, false));
		textField_10.setBounds(10, 38, 26, 20);
		panel_15.add(textField_10);

		final JTextField textField_11 = new JTextField();
		textField_11.setBorder(new LineBorder(Color.black, 1, false));
		textField_11.setBounds(35, 38, 26, 20);
		panel_15.add(textField_11);

		final JTextField textField_12 = new JTextField();
		textField_12.setBorder(new LineBorder(Color.black, 1, false));
		textField_12.setBounds(60, 38, 26, 20);
		panel_15.add(textField_12);

		final JTextField textField_13 = new JTextField();
		textField_13.setBorder(new LineBorder(Color.black, 1, false));
		textField_13.setBounds(85, 38, 26, 20);
		panel_15.add(textField_13);

		final JLabel enterNumberOfLabel_5 = new JLabel();
		enterNumberOfLabel_5.setFont(new Font("Arial", Font.PLAIN, 10));
		enterNumberOfLabel_5.setText("Enter Number of days");
		enterNumberOfLabel_5.setBounds(3, 74, 108, 14);
		panel_15.add(enterNumberOfLabel_5);

		final JTextField textField_14 = new JTextField();
		textField_14.setBorder(new LineBorder(Color.black, 1, false));
		textField_14.setBounds(10, 94, 26, 20);
		panel_15.add(textField_14);

		final JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_16.setBounds(125, 0, 715, 21);
		panel_11.add(panel_16);

		final JLabel fLabel = new JLabel();
		fLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		fLabel
				.setText("<html><body><b> F. </b> &nbsp <b> Recreational Therapy </b> (includes recreational and music therapy )");
		fLabel.setBounds(10, 4, 452, 14);
		panel_16.add(fLabel);

		final JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(125, 20, 715, 101);
		panel_11.add(panel_17);

		final JLabel label_4 = new JLabel();
		label_4
				.setText("<html><body><b> 1. </b> &nbsp <b>Total minutes</b> - record the total number of minutes this therapy was administered to the resident in the last 7 days <br> &nbsp &nbsp  &nbsp if zero,  skip to O05000, Restorative Nursing Programs");
		label_4.setBounds(15, 10, 664, 40);
		panel_17.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5
				.setText("<html><body><b> 2. </b> &nbsp <b> Days </b> - record the <b> number of days </b> this therapy was administered for <b> at least 15 minutes </b> a day in the 7 days");
		label_5.setBounds(15, 56, 618, 35);
		panel_17.add(label_5);

		final JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.WHITE);
		panel_18.setLayout(null);
		panel_18.setBounds(0, 421, 840, 436);
		add(panel_18);

		final JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_19.setLayout(null);
		panel_19.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.setBounds(0, 0, 840, 31);
		panel_18.add(panel_19);

		final JLabel o0500RestorativeNursingLabel = new JLabel();
		o0500RestorativeNursingLabel.setFont(new Font("Arial", Font.BOLD, 12));
		o0500RestorativeNursingLabel
				.setText("O0500.  Restorative Nursing Programs");
		o0500RestorativeNursingLabel.setBounds(10, 10, 452, 14);
		panel_19.add(o0500RestorativeNursingLabel);

		final JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(0, 30, 840, 46);
		panel_18.add(panel_20);

		final JLabel recordTheLabel = new JLabel();
		recordTheLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		recordTheLabel
				.setText("<html><body>Record the <b> number of days </b> each of the following restorative programs was performed (for at least 15 minutes a day) in the last 7 calender days <br> (enter 0 if none or less than 15 minutes daily)");
		recordTheLabel.setBounds(10, 10, 820, 26);
		panel_20.add(recordTheLabel);

		final JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.WHITE);
		panel_21.setLayout(null);
		panel_21.setBounds(0, 75, 840, 121);
		panel_18.add(panel_21);

		final JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_22.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_22.setBounds(0, 30, 71, 91);
		panel_21.add(panel_22);

		final JTextField textField_15 = new JTextField();
		textField_15.setBorder(new LineBorder(Color.black, 1, false));
		textField_15.setBounds(20, 6, 25, 20);
		panel_22.add(textField_15);

		final JTextField textField_16 = new JTextField();
		textField_16.setBorder(new LineBorder(Color.black, 1, false));
		textField_16.setBounds(20, 35, 25, 20);
		panel_22.add(textField_16);

		final JTextField textField_17 = new JTextField();
		textField_17.setBorder(new LineBorder(Color.black, 1, false));
		textField_17.setBounds(20, 65, 25, 20);
		panel_22.add(textField_17);

		final JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_23.setBounds(70, 0, 770, 31);
		panel_21.add(panel_23);

		final JLabel techniquesLabel = new JLabel();
		techniquesLabel.setFont(new Font("Arial", Font.BOLD, 12));
		techniquesLabel.setText("Techniques");
		techniquesLabel.setBounds(10, 10, 136, 14);
		panel_23.add(techniquesLabel);

		final JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_24.setLayout(null);
		panel_24.setBackground(Color.WHITE);
		panel_24.setBounds(70, 30, 770, 31);
		panel_21.add(panel_24);

		final JLabel aRangeOfLabel = new JLabel();
		aRangeOfLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aRangeOfLabel.setText("A.  Range of motion (passive)");
		aRangeOfLabel.setBounds(10, 10, 236, 14);
		panel_24.add(aRangeOfLabel);

		final JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_25.setLayout(null);
		panel_25.setBackground(Color.WHITE);
		panel_25.setBounds(70, 60, 770, 31);
		panel_21.add(panel_25);

		final JLabel bRangeOfLabel = new JLabel();
		bRangeOfLabel.setFont(new Font("Arial", Font.BOLD, 12));
		bRangeOfLabel.setText("B.  Range of motion (active)");
		bRangeOfLabel.setBounds(10, 10, 157, 14);
		panel_25.add(bRangeOfLabel);

		final JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(70, 90, 770, 31);
		panel_21.add(panel_26);

		final JLabel cSplintOrLabel = new JLabel();
		cSplintOrLabel.setFont(new Font("Arial", Font.BOLD, 12));
		cSplintOrLabel.setText("C.  Splint or brace assistance");
		cSplintOrLabel.setBounds(10, 10, 194, 14);
		panel_26.add(cSplintOrLabel);

		final JPanel panel_27 = new JPanel();
		panel_27.setBounds(0, 0, 71, 31);
		panel_21.add(panel_27);
		panel_27.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_27.setLayout(null);
		panel_27.setBackground(Color.WHITE);

		final JLabel numberLabel = new JLabel();
		numberLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		numberLabel.setText("<html><body><b> Number <br> of Days</b> ");
		numberLabel.setBounds(10, 3, 54, 26);
		panel_27.add(numberLabel);

		final JPanel panel_28 = new JPanel();
		panel_28.setBackground(Color.WHITE);
		panel_28.setLayout(null);
		panel_28.setBounds(0, 196, 840, 240);
		panel_18.add(panel_28);

		final JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_29.setLayout(null);
		panel_29.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_29.setBounds(0, 30, 71, 210);
		panel_28.add(panel_29);

		final JTextField textField_18 = new JTextField();
		textField_18.setBorder(new LineBorder(Color.black, 1, false));
		textField_18.setBounds(20, 6, 25, 20);
		panel_29.add(textField_18);

		final JTextField textField_19 = new JTextField();
		textField_19.setBorder(new LineBorder(Color.black, 1, false));
		textField_19.setBounds(20, 35, 25, 20);
		panel_29.add(textField_19);

		final JTextField textField_20 = new JTextField();
		textField_20.setBorder(new LineBorder(Color.black, 1, false));
		textField_20.setBounds(20, 65, 25, 20);
		panel_29.add(textField_20);

		final JTextField textField_21 = new JTextField();
		textField_21.setBorder(new LineBorder(Color.black, 1, false));
		textField_21.setBounds(20, 93, 25, 20);
		panel_29.add(textField_21);

		final JTextField textField_22 = new JTextField();
		textField_22.setBorder(new LineBorder(Color.black, 1, false));
		textField_22.setBounds(20, 122, 25, 20);
		panel_29.add(textField_22);

		final JTextField textField_23 = new JTextField();
		textField_23.setBorder(new LineBorder(Color.black, 1, false));
		textField_23.setBounds(20, 154, 25, 20);
		panel_29.add(textField_23);

		final JTextField textField_24 = new JTextField();
		textField_24.setBorder(new LineBorder(Color.black, 1, false));
		textField_24.setBounds(20, 183, 25, 20);
		panel_29.add(textField_24);

		final JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_30.setLayout(null);
		panel_30.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_30.setBounds(70, 0, 770, 31);
		panel_28.add(panel_30);

		final JLabel trainingAndSkillLabel = new JLabel();
		trainingAndSkillLabel.setFont(new Font("Arial", Font.BOLD, 12));
		trainingAndSkillLabel.setText("Training and skill Practice in :");
		trainingAndSkillLabel.setBounds(10, 10, 172, 14);
		panel_30.add(trainingAndSkillLabel);

		final JPanel panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_31.setLayout(null);
		panel_31.setBackground(Color.WHITE);
		panel_31.setBounds(70, 30, 770, 31);
		panel_28.add(panel_31);

		final JLabel dBedMobilityLabel = new JLabel();
		dBedMobilityLabel.setFont(new Font("Arial", Font.BOLD, 12));
		dBedMobilityLabel.setText("D.  Bed mobility");
		dBedMobilityLabel.setBounds(10, 10, 196, 14);
		panel_31.add(dBedMobilityLabel);

		final JPanel panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(70, 60, 770, 31);
		panel_28.add(panel_32);

		final JLabel eTransferLabel = new JLabel();
		eTransferLabel.setFont(new Font("Arial", Font.BOLD, 12));
		eTransferLabel.setText("E.  Transfer");
		eTransferLabel.setBounds(10, 10, 187, 14);
		panel_32.add(eTransferLabel);

		final JPanel panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(70, 90, 770, 31);
		panel_28.add(panel_33);

		final JLabel fWalkingLabel = new JLabel();
		fWalkingLabel.setFont(new Font("Arial", Font.BOLD, 12));
		fWalkingLabel.setText("F.  Walking");
		fWalkingLabel.setBounds(10, 10, 193, 14);
		panel_33.add(fWalkingLabel);

		final JPanel panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(70, 120, 770, 31);
		panel_28.add(panel_34);

		final JLabel gDressingAndorLabel = new JLabel();
		gDressingAndorLabel.setFont(new Font("Arial", Font.BOLD, 12));
		gDressingAndorLabel.setText("G.  Dressing and/or grooming");
		gDressingAndorLabel.setBounds(10, 10, 254, 14);
		panel_34.add(gDressingAndorLabel);

		final JPanel panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(70, 150, 770, 31);
		panel_28.add(panel_35);

		final JLabel hEatingAndorLabel = new JLabel();
		hEatingAndorLabel.setFont(new Font("Arial", Font.BOLD, 12));
		hEatingAndorLabel.setText("H.  Eating and/or swallowing");
		hEatingAndorLabel.setBounds(10, 10, 235, 14);
		panel_35.add(hEatingAndorLabel);

		final JPanel panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setBounds(70, 180, 770, 31);
		panel_28.add(panel_36);

		final JLabel iAmputationprosthesesCareLabel = new JLabel();
		iAmputationprosthesesCareLabel
				.setFont(new Font("Arial", Font.BOLD, 12));
		iAmputationprosthesesCareLabel
				.setText("I.  Amputation/prostheses care");
		iAmputationprosthesesCareLabel.setBounds(10, 10, 198, 14);
		panel_36.add(iAmputationprosthesesCareLabel);

		final JPanel panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_37.setLayout(null);
		panel_37.setBackground(Color.WHITE);
		panel_37.setBounds(70, 210, 770, 30);
		panel_28.add(panel_37);

		final JLabel jCommunicaitonLabel = new JLabel();
		jCommunicaitonLabel.setFont(new Font("Arial", Font.BOLD, 12));
		jCommunicaitonLabel.setText("J.  Communicaiton");
		jCommunicaitonLabel.setBounds(10, 10, 213, 14);
		panel_37.add(jCommunicaitonLabel);

		final JPanel panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(0, 0, 71, 31);
		panel_28.add(panel_38);

		final JLabel numberLabel_1 = new JLabel();
		numberLabel_1.setText("<html><body><b> Number <br> of Days</b> ");
		numberLabel_1.setBounds(10, 3, 54, 26);
		panel_38.add(numberLabel_1);

		final JPanel panel_39 = new JPanel();
		panel_39.setBackground(Color.WHITE);
		panel_39.setLayout(null);
		panel_39.setBounds(0, 857, 840, 70);
		add(panel_39);

		final JPanel panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_40.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_40.setLayout(null);
		panel_40.setBounds(0, 0, 840, 31);
		panel_39.add(panel_40);

		final JLabel o0600PhysicianExaminationsLabel = new JLabel();
		o0600PhysicianExaminationsLabel
				.setFont(new Font("Arial", Font.BOLD, 12));
		o0600PhysicianExaminationsLabel
				.setText("O0600. Physician Examinations");
		o0600PhysicianExaminationsLabel.setBounds(10, 10, 292, 14);
		panel_40.add(o0600PhysicianExaminationsLabel);

		final JPanel panel_41 = new JPanel();
		panel_41.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_41.setLayout(null);
		panel_41.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_41.setBounds(0, 30, 71, 40);
		panel_39.add(panel_41);

		final JTextField textField_25 = new JTextField();
		textField_25.setBorder(new LineBorder(Color.black, 1, false));
		textField_25.setBounds(10, 19, 25, 18);
		panel_41.add(textField_25);

		final JTextField textField_27 = new JTextField();
		textField_27.setBorder(new LineBorder(Color.black, 1, false));
		textField_27.setBounds(35, 19, 25, 18);
		panel_41.add(textField_27);

		final JLabel enterDaysLabel = new JLabel();
		enterDaysLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		enterDaysLabel.setText("Enter Days");
		enterDaysLabel.setBounds(10, 3, 54, 14);
		panel_41.add(enterDaysLabel);

		final JPanel panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_42.setLayout(null);
		panel_42.setBackground(Color.WHITE);
		panel_42.setBounds(70, 30, 770, 40);
		panel_39.add(panel_42);

		final JLabel overTheLastLabel = new JLabel();
		overTheLastLabel
				.setText("<html><body>Over the last 14days, <b> on how many days did the physician ( or authorised assistant or practitioner) examine the resident ?</b>");
		overTheLastLabel.setBounds(10, 15, 723, 14);
		panel_42.add(overTheLastLabel);

		final JPanel panel_43 = new JPanel();
		panel_43.setLayout(null);
		panel_43.setBackground(Color.WHITE);
		panel_43.setBounds(0, 927, 840, 70);
		add(panel_43);

		final JPanel panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_44.setLayout(null);
		panel_44.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_44.setBounds(0, 0, 840, 31);
		panel_43.add(panel_44);

		final JLabel o0700PhysicianOrdersLabel = new JLabel();
		o0700PhysicianOrdersLabel.setFont(new Font("Arial", Font.BOLD, 12));
		o0700PhysicianOrdersLabel.setText("O0700. Physician Orders");
		o0700PhysicianOrdersLabel.setBounds(10, 10, 198, 14);
		panel_44.add(o0700PhysicianOrdersLabel);

		final JPanel panel_45 = new JPanel();
		panel_45.setLayout(null);
		panel_45.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_45.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_45.setBounds(0, 30, 71, 40);
		panel_43.add(panel_45);

		final JTextField textField_26 = new JTextField();
		textField_26.setBorder(new LineBorder(Color.black, 1, false));
		textField_26.setBounds(10, 19, 25, 18);
		panel_45.add(textField_26);

		final JTextField textField_28 = new JTextField();
		textField_28.setBorder(new LineBorder(Color.black, 1, false));
		textField_28.setBounds(35, 19, 25, 18);
		panel_45.add(textField_28);

		final JLabel enterDaysLabel_1 = new JLabel();
		enterDaysLabel_1.setFont(new Font("Arial", Font.PLAIN, 10));
		enterDaysLabel_1.setText("Enter Days");
		enterDaysLabel_1.setBounds(10, 3, 54, 14);
		panel_45.add(enterDaysLabel_1);

		final JPanel panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_46.setLayout(null);
		panel_46.setBackground(Color.WHITE);
		panel_46.setBounds(70, 30, 770, 40);
		panel_43.add(panel_46);

		final JLabel label_6 = new JLabel();
		label_6
				.setText("<html><body>Over the last 14days, <b> on how many days did the physician ( or authorised assistant or practitioner) change the resident's orders ?</b>");
		label_6.setBounds(10, 15, 54, 14);
		panel_46.add(label_6);

	}

}
