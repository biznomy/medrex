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

public class PanelMDS3Page10 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7877698550393882128L;

	public PanelMDS3Page10() {
		super();
		setPreferredSize(new Dimension(840, 1500));
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
		sectionALabel.setText("Section E");
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
		identificationInformationLabel.setText("Behavior");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setVgap(10);
		panel_8.setLayout(flowLayout_8);
		panel_8.setPreferredSize(new Dimension(840, 387));
		add(panel_8);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_8.add(panel_1_2);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(820, 120));

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(Color.WHITE);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_7);
		panel_5_2.setBounds(0, 0, 820, 25);
		panel_1_2.add(panel_5_2);

		final JLabel a0100Label_2 = new JLabel();
		a0100Label_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_2.setText("E0100. Psychosis");
		panel_5_2.add(a0100Label_2);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(Color.WHITE);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(0, 48, 84, 72);
		panel_1_2.add(panel_6_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setPreferredSize(new Dimension(50, 20));
		comboBox_2.setBounds(10, 21, 50, 20);
		panel_6_2.add(comboBox_2);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(91, 48, 699, 69);
		panel_1_2.add(panel_7_2);

		final JLabel aNationalProviderLabel_3 = new JLabel();
		aNationalProviderLabel_3.setBounds(10, 10, 607, 14);
		panel_7_2.add(aNationalProviderLabel_3);
		aNationalProviderLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_3
				.setText("<html><body><b> A. Hallucinations</b>(perceptual experiences in the absence of real external sensory stimuli)");

		final JLabel aNationalProviderLabel_1_3 = new JLabel();
		aNationalProviderLabel_1_3.setBounds(10, 30, 586, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);
		aNationalProviderLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_3
				.setText("<html><body><b> B. Delusions</b>(misconceptions or beliefs that are firmly held ,contrary to reality)");

		final JLabel aNationalProviderLabel_1_3_2 = new JLabel();
		aNationalProviderLabel_1_3_2.setBounds(10, 50, 586, 14);
		panel_7_2.add(aNationalProviderLabel_1_3_2);
		aNationalProviderLabel_1_3_2.setFont(new Font("Arial", Font.PLAIN, 11));
		aNationalProviderLabel_1_3_2
				.setText("<html><body><b>Z. None of the above");

		final JLabel checkAllThatLabel = new JLabel();
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(26, 31, 373, 14);
		panel_1_2.add(checkAllThatLabel);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(Color.WHITE);
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setHgap(0);
		flowLayout_12.setVgap(0);
		panel_8_1.setLayout(flowLayout_12);
		panel_8_1.setPreferredSize(new Dimension(840, 250));
		panel_8.add(panel_8_1);

		final JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setPreferredSize(new Dimension(820, 245));
		panel_8_1.add(panel_1_2_1);

		final JPanel panel_5_2_1 = new JPanel();
		panel_5_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_13 = new FlowLayout();
		flowLayout_13.setHgap(10);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_5_2_1.setLayout(flowLayout_13);
		panel_5_2_1.setBounds(0, 0, 820, 25);
		panel_1_2_1.add(panel_5_2_1);

		final JLabel a0100Label_2_1 = new JLabel();
		a0100Label_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_2_1.setToolTipText("");
		a0100Label_2_1.setText("Behavioral Symptoms");
		panel_5_2_1.add(a0100Label_2_1);

		final JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setBackground(Color.WHITE);
		panel_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(0, 70, 301, 176);
		panel_1_2_1.add(panel_7_2_1);

		final JPanel panel_6_3 = new JPanel();
		panel_6_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3.setBackground(Color.WHITE);
		panel_6_3.setLayout(null);
		panel_6_3.setBounds(0, 0, 301, 175);
		panel_7_2_1.add(panel_6_3);

		final JLabel aNationalProviderLabel_3_2 = new JLabel();
		aNationalProviderLabel_3_2.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_3_2.setText("Coding");
		aNationalProviderLabel_3_2.setBounds(5, 10, 129, 14);
		panel_6_3.add(aNationalProviderLabel_3_2);

		final JLabel label = new JLabel();
		label.setText("<html><body>0.<b> Behavior not exhiited ");
		label.setBounds(27, 30, 147, 14);
		panel_6_3.add(label);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body>2.<b> Behavior of this type occurred 4 to 6 days,</b><br> but less than daily");
		label_1.setBounds(27, 50, 297, 28);
		panel_6_3.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2
				.setText("<html><body>3. <b>Behavior of this type occurred daily");
		label_2.setBounds(27, 84, 247, 14);
		panel_6_3.add(label_2);

		final JLabel notePresenceOfLabel = new JLabel();
		notePresenceOfLabel.setFont(new Font("Arial", Font.BOLD, 12));
		notePresenceOfLabel
				.setText("Note presence of symptoms and their frequency");
		notePresenceOfLabel.setBounds(10, 50, 343, 14);
		panel_1_2_1.add(notePresenceOfLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 23, 820, 27);
		panel_1_2_1.add(panel_9);

		final JLabel checkAllThatLabel_1 = new JLabel();
		checkAllThatLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		checkAllThatLabel_1.setBounds(10, 7, 363, 14);
		panel_9.add(checkAllThatLabel_1);
		checkAllThatLabel_1
				.setText("E0200. Behavioral Symptom - Presence & Frequency");

		final JPanel panel_7_2_1_1 = new JPanel();
		panel_7_2_1_1.setBackground(Color.WHITE);
		panel_7_2_1_1.setLayout(null);
		panel_7_2_1_1.setBounds(300, 70, 520, 177);
		panel_1_2_1.add(panel_7_2_1_1);

		final JPanel panel_6_3_1 = new JPanel();
		panel_6_3_1.setLayout(null);
		panel_6_3_1.setBounds(0, -1, 520, 176);
		panel_7_2_1_1.add(panel_6_3_1);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(0, 1, 520, 23);
		panel_6_3_1.add(panel_10);

		final JLabel enterCodesInLabel = new JLabel();
		enterCodesInLabel.setText("Enter Codes in Boxes");
		enterCodesInLabel.setBounds(81, 4, 140, 14);
		panel_10.add(enterCodesInLabel);

		final JPanel panel_6_1_2 = new JPanel();
		panel_6_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_14 = new FlowLayout();
		flowLayout_14.setVgap(8);
		panel_6_1_2.setLayout(flowLayout_14);
		panel_6_1_2.setBounds(0, 23, 84, 153);
		panel_6_3_1.add(panel_6_1_2);

		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setPreferredSize(new Dimension(50, 20));
		panel_6_1_2.add(comboBox_3);

		final JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(83, 24, 436, 53);
		panel_6_3_1.add(panel_11);

		final JLabel aPhysicalBehavioralLabel = new JLabel();
		aPhysicalBehavioralLabel
				.setText("<html><body><b>A. Physical behavioral symptoms directed toward others.</b>(eg..hitting,kicking,pushing,scratching,grabbing,abusing others sexually)");
		aPhysicalBehavioralLabel.setBounds(10, 0, 424, 53);
		panel_11.add(aPhysicalBehavioralLabel);

		final JPanel panel_11_1 = new JPanel();
		panel_11_1.setBackground(Color.WHITE);
		panel_11_1.setLayout(null);
		panel_11_1.setBounds(83, 77, 435, 36);
		panel_6_3_1.add(panel_11_1);

		final JLabel bVerbalLabel = new JLabel();
		bVerbalLabel
				.setText("<html><body><b> B. Verbal behavioural symptoms directed toward others</b> (eg. threatening<br> others, screaming at others, cursing at others)");
		bVerbalLabel.setBounds(10, 0, 415, 36);
		panel_11_1.add(bVerbalLabel);

		final JPanel panel_11_1_1 = new JPanel();
		panel_11_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_1_1.setBackground(Color.WHITE);
		panel_11_1_1.setLayout(null);
		panel_11_1_1.setBounds(83, 111, 436, 65);
		panel_6_3_1.add(panel_11_1_1);

		final JLabel cOtherLabel = new JLabel();
		cOtherLabel
				.setText("<html><body><b> C. Other behavioral symptoms not directed toward others(e.g... physical<br> symptoms such as hitting or scratching self, pacing,rummaging,public <br>sexual acts,disrobing in public,throwing or smearing food or bodily wastes,<br> or verbal/vocal symptoms like screaming, disruptive sounds)");
		cOtherLabel.setBounds(10, 3, 426, 65);
		panel_11_1_1.add(cOtherLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setName("");
		panel_1.setBackground(Color.WHITE);
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
		panel_1_1_1.setPreferredSize(new Dimension(820, 790));

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
		a0100Label_1_1_1
				.setText("E0300.  Overall Presence of Behavioral Symptoms");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1_1.add(panel_1_1);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(820, 79));

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setVgap(8);
		panel_6_1.setLayout(flowLayout_9);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBounds(0, 0, 84, 80);
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
		panel_7_1.setBounds(91, 10, 719, 70);
		panel_1_1.add(panel_7_1);

		final JLabel aNationalProviderLabel_3_1 = new JLabel();
		aNationalProviderLabel_3_1
				.setText("<html><body><b> Were any behavioral symptoms in questins E0200 coded 1,2, or 3?");
		aNationalProviderLabel_3_1.setBounds(10, 5, 706, 21);
		panel_7_1.add(aNationalProviderLabel_3_1);

		final JLabel aNationalProviderLabel_1_3_1 = new JLabel();
		aNationalProviderLabel_1_3_1
				.setText("<html><body>0. <b>No.--></b> Skip to E0800, Rejectiion of Care");
		aNationalProviderLabel_1_3_1.setBounds(31, 28, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1);

		final JLabel aNationalProviderLabel_1_3_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1
				.setText("<html><body>1. <b>Yes.--></b> Considering all of E0200, Behavioral Symptoms, answer E0500 and E0600 below");
		aNationalProviderLabel_1_3_1_1.setBounds(31, 46, 483, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_1);

		final JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(Color.WHITE);
		panel_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(820, 246));
		panel_1_1_1.add(panel_1_1_2);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBounds(0, 29, 84, 218);
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

		final JLabel enterCodeLabel_1_1 = new JLabel();
		enterCodeLabel_1_1.setText("Enter Code");
		enterCodeLabel_1_1.setBounds(15, 133, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1);

		final JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1.setBounds(15, 153, 50, 20);
		panel_6_1_1.add(comboBox_1_1);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1.setOpaque(false);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(83, 29, 737, 102);
		panel_1_1_2.add(panel_7_1_1);

		final JLabel aNationalProviderLabel_3_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_3_1_1
				.setText("Did any of the identified symptom(s);");
		aNationalProviderLabel_3_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1.add(aNationalProviderLabel_3_1_1);

		final JLabel aNationalProviderLabel_1_3_1_5 = new JLabel();
		aNationalProviderLabel_1_3_1_5
				.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1_3_1_5
				.setText("A. Put the resident at significant risk for physical illness or injury?");
		aNationalProviderLabel_1_3_1_5.setBounds(5, 25, 474, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_5);

		final JLabel aNationalProviderLabel_1_3_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1
				.setText("<html><body>0. <b>Missed by > 5 Years </b> or no answer");
		aNationalProviderLabel_1_3_1_1_1.setBounds(30, 45, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1.setText("<html><body>0. <b>No");
		aNationalProviderLabel_1_3_1_2_1.setBounds(30, 65, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_2_1);

		final JLabel aNationalProviderLabel_1_3_1_3_1 = new JLabel();
		aNationalProviderLabel_1_3_1_3_1.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_3_1.setBounds(30, 85, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_3_1);

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
		a0100Label_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		a0100Label_1_1_2.setText("E0500. Impact on Resident");
		panel_5_1_1_2.add(a0100Label_1_1_2);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(83, 130, 737, 59);
		panel_1_1_2.add(panel_7_1_1_1);

		final JLabel aNationalProviderLabel_3_1_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1_1
				.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_3_1_1_1
				.setText("B. Significantly interfere with the resident's care");
		aNationalProviderLabel_3_1_1_1.setBounds(5, 5, 706, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_3_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_1.setText("<html><body>0. <b>No");
		aNationalProviderLabel_1_3_1_1_1_1.setBounds(30, 22, 311, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_3_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_2_1_1.setBounds(30, 42, 311, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_3_1_2_1_1);

		final JPanel panel_7_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(83, 188, 737, 59);
		panel_1_1_2.add(panel_7_1_1_1_1);

		final JLabel aNationalProviderLabel_3_1_1_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1_1_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_3_1_1_1_1
				.setText("C. Significantly interfere with the resident's participation in activities or social interactions?");
		aNationalProviderLabel_3_1_1_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_3_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_1_1.setText("<html><body>0. <b> No");
		aNationalProviderLabel_1_3_1_1_1_1_1.setBounds(30, 24, 311, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_3_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_1.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_2_1_1_1.setBounds(30, 43, 311, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_3_1_2_1_1_1);

		final JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setBackground(Color.WHITE);
		panel_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setPreferredSize(new Dimension(820, 245));
		panel_1_1_1.add(panel_1_1_2_1);

		final JPanel panel_5_1_1_2_1 = new JPanel();
		panel_5_1_1_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setHgap(10);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1.setLayout(flowLayout_10);
		panel_5_1_1_2_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1.setBounds(0, -89, 820, 89);
		panel_1_1_2_1.add(panel_5_1_1_2_1);

		final JLabel a0100Label_1_1_2_1 = new JLabel();
		a0100Label_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_2_1.setText("C0400 . Recall");
		panel_5_1_1_2_1.add(a0100Label_1_1_2_1);

		final JPanel panel_1_1_2_2 = new JPanel();
		panel_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_2.setLayout(null);
		panel_1_1_2_2.setPreferredSize(new Dimension(820, 210));
		panel_1_1_2_2.setBounds(0, -1, 820, 247);
		panel_1_1_2_1.add(panel_1_1_2_2);

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 29, 84, 217);
		panel_1_1_2_2.add(panel_6_1_1_1);

		final JLabel enterCodeLabel_1_2 = new JLabel();
		enterCodeLabel_1_2.setText("Enter Code");
		enterCodeLabel_1_2.setBounds(15, 9, 54, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_2);

		final JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBackground(Color.WHITE);
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_2.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2.setBounds(17, 31, 50, 20);
		panel_6_1_1_1.add(comboBox_1_2);

		final JLabel enterCodeLabel_1_1_1 = new JLabel();
		enterCodeLabel_1_1_1.setText("New JLabel");
		enterCodeLabel_1_1_1.setBounds(15, 133, 54, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_1_1);

		final JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1.setBounds(15, 153, 50, 20);
		panel_6_1_1_1.add(comboBox_1_1_1);

		final JPanel panel_7_1_1_2 = new JPanel();
		panel_7_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_2.setLayout(null);
		panel_7_1_1_2.setBounds(83, 29, 737, 80);
		panel_1_1_2_2.add(panel_7_1_1_2);

		final JLabel aNationalProviderLabel_3_1_1_2 = new JLabel();
		aNationalProviderLabel_3_1_1_2
				.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_3_1_1_2
				.setText("Did any of the identified symptom(s):");
		aNationalProviderLabel_3_1_1_2.setBounds(10, 5, 706, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_3_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_5_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_1_3_1_5_1
				.setText("A. Put others at significant risk of physical injury?");
		aNationalProviderLabel_1_3_1_5_1.setBounds(5, 25, 474, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_5_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_2.setText("<html><body>0.<b>No ");
		aNationalProviderLabel_1_3_1_1_1_2.setBounds(30, 45, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_2_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_2.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_2_1_2.setBounds(30, 65, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_2_1_2);

		final JPanel panel_5_1_1_2_2 = new JPanel();
		panel_5_1_1_2_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2_2.setLayout(null);
		panel_5_1_1_2_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_5_1_1_2_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_2.setBounds(0, 1, 820, 29);
		panel_1_1_2_2.add(panel_5_1_1_2_2);

		final JLabel a0100Label_1_1_2_2 = new JLabel();
		a0100Label_1_1_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		a0100Label_1_1_2_2.setBounds(11, 6, 254, 14);
		a0100Label_1_1_2_2.setText("E0600. Impact on Others");
		panel_5_1_1_2_2.add(a0100Label_1_1_2_2);

		final JPanel panel_7_1_1_1_2 = new JPanel();
		panel_7_1_1_1_2.setBackground(Color.WHITE);
		panel_7_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_2.setLayout(null);
		panel_7_1_1_1_2.setBounds(83, 108, 737, 80);
		panel_1_1_2_2.add(panel_7_1_1_1_2);

		final JLabel aNationalProviderLabel_3_1_1_1_2 = new JLabel();
		aNationalProviderLabel_3_1_1_1_2.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_3_1_1_1_2
				.setText("B. Significantly intrude on the privacy or activity of others?");
		aNationalProviderLabel_3_1_1_1_2.setBounds(5, 5, 706, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_3_1_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_1_2.setText("<html><body>0. <b>No");
		aNationalProviderLabel_1_3_1_1_1_1_2.setBounds(30, 22, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_2_1_1_2.setBounds(30, 42, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_2_1_1_2);

		final JPanel panel_7_1_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBounds(83, 187, 737, 60);
		panel_1_1_2_2.add(panel_7_1_1_1_1_1);

		final JLabel aNationalProviderLabel_3_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_3_1_1_1_1_1
				.setText("C. Significantly disrupt care or living environment?");
		aNationalProviderLabel_3_1_1_1_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_3_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_1_1_1.setText("<html><body>0.<b>No");
		aNationalProviderLabel_1_3_1_1_1_1_1_1.setBounds(30, 24, 311, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_3_1_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_2_1_1_1_1.setText("<html><body>1<b>Yes");
		aNationalProviderLabel_1_3_1_2_1_1_1_1.setBounds(30, 43, 311, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_3_1_2_1_1_1_1);

		final JPanel panel_1_1_2_2_1 = new JPanel();
		panel_1_1_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_2_1.setLayout(null);
		panel_1_1_2_2_1.setPreferredSize(new Dimension(820, 190));
		panel_1_1_1.add(panel_1_1_2_2_1);

		final JPanel panel_6_1_1_1_1 = new JPanel();
		panel_6_1_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1.setBounds(0, 29, 84, 161);
		panel_1_1_2_2_1.add(panel_6_1_1_1_1);

		final JLabel enterCodeLabel_1_2_1 = new JLabel();
		enterCodeLabel_1_2_1.setText("New JLabel");
		enterCodeLabel_1_2_1.setBounds(15, 9, 54, 14);
		panel_6_1_1_1_1.add(enterCodeLabel_1_2_1);

		final JComboBox comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setBackground(Color.WHITE);
		comboBox_1_2_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_2_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2_1.setBounds(17, 31, 50, 20);
		panel_6_1_1_1_1.add(comboBox_1_2_1);

		final JPanel panel_7_1_1_2_1 = new JPanel();
		panel_7_1_1_2_1.setBackground(Color.WHITE);
		panel_7_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_2_1.setLayout(null);
		panel_7_1_1_2_1.setBounds(83, 28, 737, 162);
		panel_1_1_2_2_1.add(panel_7_1_1_2_1);

		final JLabel aNationalProviderLabel_3_1_1_2_1 = new JLabel();
		aNationalProviderLabel_3_1_1_2_1
				.setText("<html><body><b>Did the resident reject evaluation or care</b>(e.g.., bloodwork,taking medications, ADL assistance) <b> that is necessary to archieve the <br> resident's goals for health and well-being?</b> Do not include behaviors that have already been addressed(e.g.. by discussion or care <br> planning with the resident or family), and / or determined to be consistent with resident values, preferences, or goals.");
		aNationalProviderLabel_3_1_1_2_1.setBounds(10, 5, 706, 54);
		panel_7_1_1_2_1.add(aNationalProviderLabel_3_1_1_2_1);

		final JLabel label_3 = new JLabel();
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3.setText("<html><body>0.<b>Behavior not exhibited");
		label_3.setBounds(43, 76, 441, 14);
		panel_7_1_1_2_1.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setFont(new Font("Arial", Font.BOLD, 12));
		label_4
				.setText("<html><body>1.  <b>Behavior of this type occurred 1 to 3 days");
		label_4.setBounds(43, 96, 441, 14);
		panel_7_1_1_2_1.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Arial", Font.PLAIN, 12));
		label_5
				.setText("<html><body>2.<b> Behavior of this type occurred 4 to 6 days</b> , but less than daily");
		label_5.setBounds(43, 116, 441, 14);
		panel_7_1_1_2_1.add(label_5);

		final JLabel label_6 = new JLabel();
		label_6.setFont(new Font("Arial", Font.PLAIN, 12));
		label_6
				.setText("<html><body>3.  <b> Behavior of this type occurred daily");
		label_6.setBounds(43, 136, 441, 14);
		panel_7_1_1_2_1.add(label_6);

		final JPanel panel_5_1_1_2_2_1 = new JPanel();
		panel_5_1_1_2_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2_2_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_5_1_1_2_2_1.setLayout(null);
		panel_5_1_1_2_2_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_2_1.setBounds(0, 0, 820, 30);
		panel_1_1_2_2_1.add(panel_5_1_1_2_2_1);

		final JLabel a0100Label_1_1_2_2_1 = new JLabel();
		a0100Label_1_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		a0100Label_1_1_2_2_1
				.setText("E0800. Rejection of Care - Presence & Frequency");
		a0100Label_1_1_2_2_1.setBounds(11, 6, 399, 14);
		panel_5_1_1_2_2_1.add(a0100Label_1_1_2_2_1);
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
		PanelMDS3Page10 panel = new PanelMDS3Page10();
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
