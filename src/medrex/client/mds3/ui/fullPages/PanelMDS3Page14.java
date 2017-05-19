package medrex.client.mds3.ui.fullPages;

import java.awt.BorderLayout;
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

public class PanelMDS3Page14 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 894224644825100483L;

	public PanelMDS3Page14() {
		super();
		setPreferredSize(new Dimension(840, 1000));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setHgap(0);
		flowLayout_6.setVgap(0);
		setLayout(flowLayout_6);
		setBackground(Color.WHITE);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(840, 40));
		add(panel_1);

		final JLabel residentLabel = new JLabel();
		residentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel.setText("Resident");
		residentLabel.setBounds(10, 9, 56, 16);
		panel_1.add(residentLabel);

		final JTextField textField = new JTextField();
		textField.setBounds(84, 8, 248, 20);
		panel_1.add(textField);

		final JLabel residentLabel_1 = new JLabel();
		residentLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1.setText("Identifier");
		residentLabel_1.setBounds(354, 10, 56, 16);
		panel_1.add(residentLabel_1);

		final JTextField textField_1 = new JTextField();
		textField_1.setBounds(429, 8, 213, 20);
		panel_1.add(textField_1);

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
		sectionALabel.setText("Section G");
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
		identificationInformationLabel.setText("Functional Status");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setPreferredSize(new Dimension(840, 180));
		add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_6.setLayout(flowLayout_2);
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 0, 840, 40);
		panel_5.add(panel_6);

		final JLabel a0100Label = new JLabel();
		a0100Label.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label
				.setText("<html><b>G0110. Activities of Daily Living (ADL)Assistance</b><br>Refer to the ADL flow chart in the RAI manual to facilitate accurate coding</html>");
		panel_6.add(a0100Label);

		final JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 40, 840, 140);
		panel_5.add(panel_7);

		final JLabel instructionForRuleLabel = new JLabel();
		instructionForRuleLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		instructionForRuleLabel.setBounds(10, 0, 820, 140);
		instructionForRuleLabel
				.setText("<html><b>Instruction for Rule 3</b><br>* When an activity occurs thre times at any one given level, code that level.<br>* When an activity occurs three times at multiple levels, code the most dependent, exceptions are total dependence (4), activity must require full assist<br> &nbsp; &nbsp; &nbsp; everytime, and activity did not occur (8), activity must not have occured at all. Exmaples, three timesextensive assistance (3) and three times limited<br> &nbsp; &nbsp; &nbsp; assistance(2), code extensive assistance(3).<br>* When an activity occurs at various levels, but not three times at any given level, apply the the following:<br> &nbsp; &nbsp; &nbsp; *When there is combination of full staff performance, and extensive assistance, code extensive assistance.<br> &nbsp; &nbsp; &nbsp; *When there is combination of full staff performance, weight bearing assistance and/or non-weight bearing assistance code limited assistance (2).<br><b>If none of the above are met, code supervision</b></html>");
		panel_7.add(instructionForRuleLabel);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setPreferredSize(new Dimension(840, 260));
		add(panel_8);

		final JLabel adlSelfperformancenbspLabel = new JLabel();
		adlSelfperformancenbspLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		adlSelfperformancenbspLabel.setBounds(10, 0, 533, 260);
		adlSelfperformancenbspLabel
				.setText("<html><b>1. ADL Self-performance</b><br> &nbsp; &nbsp; &nbsp; Code for <b>resident's performance</b> over all shifts - not including setup. If the ADL activity<br>  &nbsp; &nbsp; &nbsp; occured for three or more times at various levels of assistance, code the most dependent - except for<br> &nbsp; &nbsp; &nbsp; total dependence, which requires full staff performance everytime.<br<b>Coding:</b><br> &nbsp; &nbsp; &nbsp; <b><u>Activity Occurred 3 or More Times</u></b><br> &nbsp;0. <b>Independent</b> - no help or staff oversight at any time.<br> &nbsp;1. <b>Supervision</b> - oversight, encouragement or cueing<br> &nbsp;2. <b>Limited assistance</b> - resident involved in activity; staff provide guided maneuvering<br> &nbsp; &nbsp; &nbsp;of limbs or non-weight-bearing assistance.<br> &nbsp;3. <b>Extensive assistance</b> - resident involved in activity, staff provide weight bearing support<br> &nbsp;4. <b>Total Dependence</b> - full staff performance evertime during entire 7-day period<br> &nbsp; &nbsp; &nbsp; <b><u>Activity Occurred 2 or Fewer Times</u></b><br> &nbsp; 8. <b>Activity occurred only once or twice</b> - activity did occur but only once or twice<br> &nbsp; 8. <b>Activity did not occur</b> - activity(or any part of ADL) was not performed by resident or<br> &nbsp;&nbsp;&nbsp; staff all over the entire 7-day period.</html>");
		panel_8.add(adlSelfperformancenbspLabel);

		final JLabel label = new JLabel();
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label
				.setText("<html><b>2. ADL Support Provided</b><br> &nbsp; &nbsp; &nbsp; Code for <b>most support provided</b> over all<br> &nbsp; &nbsp; &nbsp; shifts; code regaredless of residents self-<br>&nbsp; &nbsp; &nbsp; &nbsp;performance classification<br><b>Coding</b><br> &nbsp; &nbsp; &nbsp;0. <b>No</b> setup or physical help from staff<br> &nbsp; &nbsp; &nbsp;1. <b>setup</b> help only<br> &nbsp; &nbsp; &nbsp;2. <b>One</b> person physical assist<br> &nbsp; &nbsp; &nbsp;3. <b>Two+</b> persons physical assist<br> &nbsp; &nbsp; &nbsp;8. ADL activity itself <b>did not occur</b> during<br> &nbsp; &nbsp; &nbsp; entire period.</html>");
		label.setBounds(565, 0, 265, 180);
		panel_8.add(label);

		final JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9.setBounds(550, 186, 280, 70);
		panel_8.add(panel_9);

		final JLabel label_1 = new JLabel();
		label_1.setOpaque(true);
		label_1.setFont(new Font("Arial", Font.PLAIN, 12));
		label_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		label_1.setText("<html><b><center>1.</center> Self-Performance");
		label_1.setBounds(0, 0, 140, 42);
		panel_9.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setOpaque(true);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBorder(new LineBorder(Color.black, 1, false));
		label_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		label_2.setText("<html><b><center>2.</center> Support</b></html>");
		label_2.setBounds(140, 0, 140, 42);
		panel_9.add(label_2);

		final JLabel enterCodesInLabel = new JLabel();
		enterCodesInLabel.setBorder(new LineBorder(Color.black, 1, false));
		enterCodesInLabel.setOpaque(true);
		enterCodesInLabel.setBackground(Color.WHITE);
		enterCodesInLabel.setFont(new Font("Arial", Font.BOLD, 12));
		enterCodesInLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enterCodesInLabel.setText("Enter Codes in Boxes");
		enterCodesInLabel.setBounds(0, 42, 280, 28);
		panel_9.add(enterCodesInLabel);

		final JPanel panel1_10 = new JPanel();
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(0);
		flowLayout_3.setHgap(0);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel1_10.setLayout(flowLayout_3);
		panel1_10.setBorder(new LineBorder(Color.black, 1, false));
		panel1_10.setBackground(Color.WHITE);
		panel1_10.setPreferredSize(new Dimension(840, 438));
		add(panel1_10);

		final JPanel panel1_11 = new JPanel();
		panel1_11.setLayout(null);
		panel1_11.setBackground(Color.WHITE);
		panel1_11.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel1_11.setPreferredSize(new Dimension(550, 435));
		panel1_10.add(panel1_11);

		final JPanel panel = new JPanel();
		panel
				.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
						false));
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 550, 35);
		panel1_11.add(panel);

		final JLabel nbspaBadLabel = new JLabel();
		nbspaBadLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		nbspaBadLabel
				.setText("<html><b> &nbsp;A. Bad mobiltiy</b> - how resident moves to and from lying positions, turns side to side, and<br> &nbsp; &nbsp; &nbsp; positions body while in bed or alternate sleep furniture</html>");
		panel.add(nbspaBadLabel, BorderLayout.CENTER);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setLayout(new BorderLayout());
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 35, 550, 35);
		panel1_11.add(panel_10);

		final JLabel nbspBLabel = new JLabel();
		nbspBLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		nbspBLabel
				.setText("<html><b> &nbsp; B. Transfer</b> - how resident moves between surfaces including to and from: bed, chair, wheelchair,<br> &nbsp; &nbsp; &nbsp; standing position (<b>excludes</b> to/from bath/toilet)</html>");
		panel_10.add(nbspBLabel, BorderLayout.CENTER);

		final JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11.setLayout(new BorderLayout());
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 70, 550, 30);
		panel1_11.add(panel_11);

		final JLabel cWalkInLabel = new JLabel();
		cWalkInLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		cWalkInLabel
				.setText("<html><b> &nbsp; C. Walk in room</b> - how residents walks in lodcation of his/her room.</html>");
		panel_11.add(cWalkInLabel, BorderLayout.CENTER);

		final JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_12.setLayout(new BorderLayout());
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(0, 100, 550, 30);
		panel1_11.add(panel_12);

		final JLabel nbspDLabel = new JLabel();
		nbspDLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		nbspDLabel
				.setText("<html><b> &nbsp; D. Walk in corridor</b> - how resident walks in corridor or unit</html>");
		panel_12.add(nbspDLabel, BorderLayout.CENTER);

		final JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_13.setLayout(new BorderLayout());
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(0, 130, 550, 35);
		panel1_11.add(panel_13);

		final JLabel nbspELabel = new JLabel();
		nbspELabel
				.setText("<html><b> &nbsp; E. Locomotion on unit</b> - how residents move in location in his/her room and adjacent<br> &nbsp; &nbsp; &nbsp; corridor on same floor. if in wheelchair, self-sufficiency once in chair</html>");
		panel_13.add(nbspELabel, BorderLayout.CENTER);

		final JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_14.setLayout(new BorderLayout());
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(0, 165, 550, 50);
		panel1_11.add(panel_14);

		final JLabel nbspFLabel = new JLabel();
		nbspFLabel.setFont(new Font("Arial", Font.PLAIN, 12));

		nbspFLabel
				.setText("<html><b> &nbsp; F. Locomotion off unit</b> - how resident moves to and returns from off unit location (e.g., areas<br> &nbsp; &nbsp; &nbsp;set aside for dinning, activities or treatments). <b>If facility has only one floor</b>, how resident<br> &nbsp; &nbsp; &nbsp; moves to and from distant areas on the floor. If in wheelchair, self-sufficeincy once in chair</html>");
		panel_14.add(nbspFLabel, BorderLayout.CENTER);

		final JPanel panel_15 = new JPanel();
		panel_15.setLayout(new BorderLayout());
		panel_15.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(0, 215, 550, 50);
		panel1_11.add(panel_15);

		final JLabel nbspgDressingLabel = new JLabel();
		nbspgDressingLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		nbspgDressingLabel
				.setText("<html><b> &nbsp;G. Dressing</b> - how resident puts on, fastens and take off all the items of clothing, including<br> &nbsp; &nbsp; &nbsp;donning/removing a prothesis or TED hose. Dressing includes putting on and changing<br> &nbsp; &nbsp; &nbsp; pajamas and housedresses.</html>");
		panel_15.add(nbspgDressingLabel, BorderLayout.CENTER);

		final JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_16.setLayout(new BorderLayout());
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(0, 265, 550, 50);
		panel1_11.add(panel_16);

		final JLabel nbspHLabel = new JLabel();
		nbspHLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		nbspHLabel
				.setText("<html><b> &nbsp; H. Eating</b> - how residents eats and drinks, regardless of skill. Do not include eating/drinking<br>  &nbsp;  &nbsp;  &nbsp; during medical pass. Includes intake of nurishment by other means (e.g., tube feeding, <br>  &nbsp;  &nbsp;  &nbsp; total parenteral nutrition, IV fliuds administered for nutrition or hydration)</html>");
		panel_16.add(nbspHLabel, BorderLayout.CENTER);

		final JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_17.setLayout(new BorderLayout());
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(0, 315, 550, 70);
		panel1_11.add(panel_17);

		final JLabel nbspILabel = new JLabel();
		nbspILabel.setFont(new Font("Arial", Font.PLAIN, 12));
		nbspILabel
				.setText("<html><b>  &nbsp; I. Toilet use</b> - how resident uses the toilet room, commode, bedpan, or urinal; transfers on/off<br>  &nbsp;  &nbsp;  &nbsp; toilet; cleans self after elimination; changes pad; manages ostomy or catheter; and adjusts<br>  &nbsp;  &nbsp;  &nbsp; cloths. Do not inlude empting of bedpan, urinal, bedside commode, cathetor bag or<br>  &nbsp;  &nbsp;  &nbsp; ostomy bag");
		panel_17.add(nbspILabel, BorderLayout.CENTER);

		final JPanel panel_18 = new JPanel();
		panel_18.setLayout(new BorderLayout());
		panel_18.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(0, 385, 550, 50);
		panel1_11.add(panel_18);

		final JLabel nbspJLabel = new JLabel();
		nbspJLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		nbspJLabel
				.setText("<html><b>  &nbsp; J. Personal hygiene</b> - how resident maintains personal hygiene, including combing hair,<br>  &nbsp;  &nbsp;  &nbsp; brushing teeth, shaving, applying makeup, washing/drying face and hands (<b>excludes</b> baths<br>  &nbsp;  &nbsp;  &nbsp; and showers)</html>");
		panel_18.add(nbspJLabel, BorderLayout.CENTER);

		final JPanel panel1_12 = new JPanel();
		panel1_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel1_12.setBackground(Color.WHITE);
		panel1_12.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel1_12.setLayout(null);
		panel1_12.setPreferredSize(new Dimension(278, 437));
		panel1_10.add(panel1_12);

		final JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_19.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.setBounds(0, 0, 138, 436);
		panel1_12.add(panel_19);

		final JPanel panel_21 = new JPanel();
		panel_21.setBounds(1, 0, 136, 36);
		panel_21.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_21.setPreferredSize(new Dimension(138, 35));
		panel_19.add(panel_21);

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "4.", "7.", "8." }));
		comboBox.setBackground(Color.WHITE);
		panel_21.add(comboBox);

		final JPanel panel_22 = new JPanel();
		panel_22.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_22.setBounds(1, 35, 136, 35);
		panel_19.add(panel_22);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "4.", "7.", "8." }));
		comboBox_1.setBackground(Color.WHITE);
		panel_22.add(comboBox_1);

		final JPanel panel_23 = new JPanel();
		panel_23.setBounds(1, 70, 136, 30);
		panel_23.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.add(panel_23);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "4.", "7.", "8." }));
		comboBox_2.setBackground(Color.WHITE);
		panel_23.add(comboBox_2);

		final JPanel panel_24 = new JPanel();
		panel_24.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_24.setBounds(1, 100, 136, 30);
		panel_19.add(panel_24);

		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "4.", "7.", "8." }));
		comboBox_3.setBackground(Color.WHITE);
		panel_24.add(comboBox_3);

		final JPanel panel_25 = new JPanel();
		panel_25.setBounds(1, 130, 136, 35);
		panel_25.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.add(panel_25);

		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "4.", "7.", "8." }));
		comboBox_4.setBackground(Color.WHITE);
		panel_25.add(comboBox_4);

		final JPanel panel_26 = new JPanel();
		panel_26.setBounds(1, 165, 136, 50);
		panel_26.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.add(panel_26);

		final JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "4.", "7.", "8." }));
		comboBox_5.setBackground(Color.WHITE);
		panel_26.add(comboBox_5);

		final JPanel panel_27 = new JPanel();
		panel_27.setBounds(1, 215, 136, 50);
		panel_27.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.add(panel_27);

		final JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "4.", "7.", "8." }));
		comboBox_6.setBackground(Color.WHITE);
		panel_27.add(comboBox_6);

		final JPanel panel_28 = new JPanel();
		panel_28.setBounds(1, 265, 136, 50);
		panel_28.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.add(panel_28);

		final JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "4.", "7.", "8." }));
		comboBox_7.setBackground(Color.WHITE);
		panel_28.add(comboBox_7);

		final JPanel panel_29 = new JPanel();
		panel_29.setBounds(1, 315, 136, 70);
		panel_29.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.add(panel_29);

		final JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "4.", "7.", "8." }));
		comboBox_8.setBackground(Color.WHITE);
		panel_29.add(comboBox_8);

		final JPanel panel_30 = new JPanel();
		panel_30.setBounds(1, 385, 136, 42);
		panel_30.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.add(panel_30);

		final JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "4.", "7.", "8." }));
		comboBox_9.setBackground(Color.WHITE);
		panel_30.add(comboBox_9);

		final JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.setBounds(138, 0, 138, 436);
		panel1_12.add(panel_20);

		final JPanel panel_31 = new JPanel();
		panel_31.setBounds(1, 1, 136, 35);
		panel_31.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_31);

		final JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBackground(Color.WHITE);
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "8." }));
		panel_31.add(comboBox_10);

		final JPanel panel_32 = new JPanel();
		panel_32.setBounds(1, 35, 136, 35);
		panel_32.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_32);

		final JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "8." }));
		comboBox_18.setBackground(Color.WHITE);
		panel_32.add(comboBox_18);

		final JPanel panel_33 = new JPanel();
		panel_33.setBounds(1, 70, 136, 30);
		panel_33.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_33);

		final JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "8." }));
		comboBox_19.setBackground(Color.WHITE);
		panel_33.add(comboBox_19);

		final JPanel panel_34 = new JPanel();
		panel_34.setBounds(1, 100, 136, 30);
		panel_34.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_34);

		final JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "8." }));
		comboBox_17.setBackground(Color.WHITE);
		panel_34.add(comboBox_17);

		final JPanel panel_35 = new JPanel();
		panel_35.setBounds(1, 130, 136, 35);
		panel_35.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_35);

		final JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "8." }));
		comboBox_16.setBackground(Color.WHITE);
		panel_35.add(comboBox_16);

		final JPanel panel_36 = new JPanel();
		panel_36.setBounds(1, 165, 136, 50);
		panel_36.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_36);

		final JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "8." }));
		comboBox_15.setBackground(Color.WHITE);
		panel_36.add(comboBox_15);

		final JPanel panel_37 = new JPanel();
		panel_37.setBounds(1, 215, 136, 50);
		panel_37.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_37);

		final JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "8." }));
		comboBox_14.setBackground(Color.WHITE);
		panel_37.add(comboBox_14);

		final JPanel panel_38 = new JPanel();
		panel_38.setBounds(1, 265, 136, 50);
		panel_38.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_38);

		final JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "8." }));
		comboBox_13.setBackground(Color.WHITE);
		panel_38.add(comboBox_13);

		final JPanel panel_39 = new JPanel();
		panel_39.setBounds(1, 315, 136, 70);
		panel_39.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_39);

		final JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "8." }));
		comboBox_12.setBackground(Color.WHITE);
		panel_39.add(comboBox_12);

		final JPanel panel_40 = new JPanel();
		panel_40.setBounds(1, 385, 136, 42);
		panel_40.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_40);

		final JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1.", "2.", "3.", "8." }));
		comboBox_11.setBackground(Color.WHITE);
		panel_40.add(comboBox_11);
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
		PanelMDS3Page14 panel = new PanelMDS3Page14();
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
