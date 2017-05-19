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

public class PanelMDS3Page12 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5941702204228070350L;

	public PanelMDS3Page12() {
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
		sectionALabel.setText("Section F");
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
		identificationInformationLabel
				.setText("Preferences for Coustomary Routine and Activities");
		panel_4.add(identificationInformationLabel);

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
		panel_5_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_7);
		panel_5_2.setBounds(0, 0, 820, 42);
		panel_1_2.add(panel_5_2);

		final JLabel a0100Label_2 = new JLabel();
		a0100Label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		a0100Label_2
				.setText("<html><b>F0300. Should interview for Daily and Activity Preferences has Conducted?-</b>Attemp to interview all residents able to communicate.<br>if resident is unable to complete , attempt to complete interview with family member or significant other");
		panel_5_2.add(a0100Label_2);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(0, 41, 84, 59);
		panel_1_2.add(panel_6_2);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_6_2.add(enterCodeLabel_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setPreferredSize(new Dimension(50, 20));
		comboBox_2.setBounds(10, 30, 50, 20);
		panel_6_2.add(comboBox_2);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(90, 44, 699, 47);
		panel_1_2.add(panel_7_2);

		final JLabel aNationalProviderLabel_3 = new JLabel();
		aNationalProviderLabel_3
				.setText("<html><body>0.<b> No</b>(resident is rarely / never understood) <u>and</u> family / significant other not available ) - > skip to and complete F0800 Staff<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Assessment of Daily and Activity Preferences");
		aNationalProviderLabel_3.setBounds(10, 5, 607, 23);
		panel_7_2.add(aNationalProviderLabel_3);

		final JLabel aNationalProviderLabel_1_3 = new JLabel();
		aNationalProviderLabel_1_3
				.setText("<html><body>01. <b>Yes</b> - > Continue to F0400 , Interview for Daily Preferences");
		aNationalProviderLabel_1_3.setBounds(10, 30, 311, 14);
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
		panel_1_1_1.setPreferredSize(new Dimension(820, 760));

		final JPanel panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(820, 330));
		final FlowLayout flowLayout_28 = new FlowLayout();
		flowLayout_28.setHgap(0);
		flowLayout_28.setVgap(0);
		flowLayout_28.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_28);
		panel_1_1_1.add(panel_5);

		final JPanel panel_5_1_1_1 = new JPanel();
		panel_5.add(panel_5_1_1_1);
		panel_5_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1.setLayout(flowLayout_3);
		panel_5_1_1_1.setPreferredSize(new Dimension(820, 30));

		final JLabel a0100Label_1_1_1 = new JLabel();
		a0100Label_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1.setText("F0400. Interview for Daily Preferences");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5.add(panel_5_1_1);
		panel_5_1_1.setPreferredSize(new Dimension(820, 20));
		panel_5_1_1.setBackground(Color.WHITE);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setVgap(2);
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);

		final JLabel a0100Label_1_1 = new JLabel();
		a0100Label_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		a0100Label_1_1
				.setText("<html>Show Residents the response options and say :<b> \"While you are in this facility..\"");
		panel_5_1_1.add(a0100Label_1_1);

		final JPanel panel_1_1 = new JPanel();
		panel_5.add(panel_1_1);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(820, 280));

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(274, 20, 546, 260);
		panel_1_1.add(panel_7_1);

		final JPanel panel_6_8 = new JPanel();
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		panel_6_8.setLayout(flowLayout_9);
		panel_6_8.setBackground(Color.WHITE);
		panel_6_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8.setBounds(0, 0, 546, 33);
		panel_7_1.add(panel_6_8);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2
				.setText("<html><body><b>A.   </b><i>how important is to you to <b>choose what clothes to wear?");
		panel_6_8.add(aNationalProviderLabel_1_3_1_1_1_3_2);

		final JPanel panel_6_8_1 = new JPanel();
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_6_8_1.setLayout(flowLayout_12);
		panel_6_8_1.setBackground(Color.WHITE);
		panel_6_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1.setBounds(0, 32, 546, 32);
		panel_7_1.add(panel_6_8_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_1
				.setText("<html><body><b>B.   </b><i>how important is to you to <b>take care of your personal belongings or things?");
		panel_6_8_1.add(aNationalProviderLabel_1_3_1_1_1_3_2_1);

		final JPanel panel_6_8_1_1 = new JPanel();
		final FlowLayout flowLayout_13 = new FlowLayout();
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_1.setLayout(flowLayout_13);
		panel_6_8_1_1.setBackground(Color.WHITE);
		panel_6_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_1.setBounds(0, 62, 546, 32);
		panel_7_1.add(panel_6_8_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_2.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_2
				.setText("<html><body><b>C.   </b><i>how important is to you to <b>choose between a tub bath , shower, bedbath or sponge bath");
		panel_6_8_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_2_2);

		final JPanel panel_6_8_1_2 = new JPanel();
		final FlowLayout flowLayout_14 = new FlowLayout();
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_2.setLayout(flowLayout_14);
		panel_6_8_1_2.setBackground(Color.WHITE);
		panel_6_8_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_2.setBounds(0, 93, 546, 32);
		panel_7_1.add(panel_6_8_1_2);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_3 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_3.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_3
				.setText("<html><body><b>D.   </b><i>how important is to you to <b> have snacks available between meals?");
		panel_6_8_1_2.add(aNationalProviderLabel_1_3_1_1_1_3_2_3);

		final JPanel panel_6_8_1_3 = new JPanel();
		final FlowLayout flowLayout_15 = new FlowLayout();
		flowLayout_15.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_3.setLayout(flowLayout_15);
		panel_6_8_1_3.setBackground(Color.WHITE);
		panel_6_8_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_3.setBounds(0, 124, 546, 32);
		panel_7_1.add(panel_6_8_1_3);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_4 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_4
				.setText("<html><body><b>E.   </b><i>how important is to you to <b> choose your own bed time?");
		panel_6_8_1_3.add(aNationalProviderLabel_1_3_1_1_1_3_2_4);

		final JPanel panel_6_8_1_4 = new JPanel();
		final FlowLayout flowLayout_16 = new FlowLayout();
		flowLayout_16.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_4.setLayout(flowLayout_16);
		panel_6_8_1_4.setBackground(Color.WHITE);
		panel_6_8_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_4.setBounds(0, 155, 546, 42);
		panel_7_1.add(panel_6_8_1_4);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_5 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_5.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_5
				.setText("<html><body><b>F.   </b><i>how important is to you to <b> have your family or a close friend involved in discussions about<br> you care?");
		panel_6_8_1_4.add(aNationalProviderLabel_1_3_1_1_1_3_2_5);

		final JPanel panel_6_8_1_5 = new JPanel();
		final FlowLayout flowLayout_17 = new FlowLayout();
		flowLayout_17.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_5.setLayout(flowLayout_17);
		panel_6_8_1_5.setBackground(Color.WHITE);
		panel_6_8_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_5.setBounds(0, 195, 546, 33);
		panel_7_1.add(panel_6_8_1_5);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_6 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_6.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_6
				.setText("<html><body><b>G.   </b><i>how important is to you to <b> be able to use the phone in private?");
		panel_6_8_1_5.add(aNationalProviderLabel_1_3_1_1_1_3_2_6);

		final JPanel panel_6_8_1_6 = new JPanel();
		final FlowLayout flowLayout_18 = new FlowLayout();
		flowLayout_18.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_6.setLayout(flowLayout_18);
		panel_6_8_1_6.setBackground(Color.WHITE);
		panel_6_8_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_6.setBounds(0, 227, 546, 33);
		panel_7_1.add(panel_6_8_1_6);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_7 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_7.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_7
				.setText("<html><body><b>H.   </b><i>how important is to you to <b> have a place to lock your things to keep them safe?");
		panel_6_8_1_6.add(aNationalProviderLabel_1_3_1_1_1_3_2_7);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setBounds(286, 3, 240, 14);
		panel_1_1.add(enterCodeLabel);
		enterCodeLabel.setText("Select code in the boxes");

		final JLabel aNationalProviderLabel_1_3_1_5_2 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_1_3_1_5_2.setText("Coding  :");
		aNationalProviderLabel_1_3_1_5_2.setBounds(10, 37, 115, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_5_2);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3
				.setText("<html><body>1. <b>Very Important");
		aNationalProviderLabel_1_3_1_1_1_3.setBounds(20, 57, 188, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1
				.setText("<html><body>2. <b>Somewhat Important");
		aNationalProviderLabel_1_3_1_1_1_3_1.setBounds(20, 77, 188, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1
				.setText("<html><body>3. <b>Not Very Important");
		aNationalProviderLabel_1_3_1_1_1_3_1_1.setBounds(20, 94, 188, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1
				.setText("<html><body>4. <b>Not Important at all");
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1.setBounds(20, 114, 188, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1
				.setText("<html><body>5. <b>Important but cant do or no &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;choice");
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1.setBounds(20, 134, 188, 25);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2
				.setText("<html><body>9. <b>No Respons or non- responsive");
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2.setBounds(20, 165, 188, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2);

		final JPanel panel_6_1_1_1 = new JPanel();
		panel_6_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(214, 0, 60, 280);
		panel_1_1.add(panel_6_1_1_1);

		final JComboBox comboBox_1_8 = new JComboBox();
		comboBox_1_8.setBackground(Color.WHITE);
		comboBox_1_8.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		comboBox_1_8.setPreferredSize(new Dimension(50, 20));
		comboBox_1_8.setBounds(10, 22, 41, 20);
		panel_6_1_1_1.add(comboBox_1_8);

		final JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2", "3", "4", "5", "9" }));
		comboBox_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1.setBounds(10, 54, 41, 20);
		panel_6_1_1_1.add(comboBox_1_1_1);

		final JComboBox comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setBackground(Color.WHITE);
		comboBox_1_2_1.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2", "3", "4", "5", "9" }));
		comboBox_1_2_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2_1.setBounds(10, 87, 41, 20);
		panel_6_1_1_1.add(comboBox_1_2_1);

		final JComboBox comboBox_1_3_1 = new JComboBox();
		comboBox_1_3_1.setBackground(Color.WHITE);
		comboBox_1_3_1.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2", "3", "4", "5", "9" }));
		comboBox_1_3_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_3_1.setBounds(10, 122, 41, 20);
		panel_6_1_1_1.add(comboBox_1_3_1);

		final JComboBox comboBox_1_4_1 = new JComboBox();
		comboBox_1_4_1.setBackground(Color.WHITE);
		comboBox_1_4_1.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2", "3", "4", "5", "9" }));
		comboBox_1_4_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_4_1.setBounds(10, 152, 41, 20);
		panel_6_1_1_1.add(comboBox_1_4_1);

		final JComboBox comboBox_1_5_1 = new JComboBox();
		comboBox_1_5_1.setBackground(Color.WHITE);
		comboBox_1_5_1.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2", "3", "4", "5", "9" }));
		comboBox_1_5_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_5_1.setBounds(10, 189, 41, 20);
		panel_6_1_1_1.add(comboBox_1_5_1);

		final JComboBox comboBox_1_6_1 = new JComboBox();
		comboBox_1_6_1.setBackground(Color.WHITE);
		comboBox_1_6_1.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2", "3", "4", "5", "9" }));
		comboBox_1_6_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_6_1.setBounds(10, 223, 41, 20);
		panel_6_1_1_1.add(comboBox_1_6_1);

		final JComboBox comboBox_1_7_1 = new JComboBox();
		comboBox_1_7_1.setBackground(Color.WHITE);
		comboBox_1_7_1.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2", "3", "4", "5", "9" }));
		comboBox_1_7_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_7_1.setBounds(10, 255, 41, 20);
		panel_6_1_1_1.add(comboBox_1_7_1);

		final JPanel panel_5_1 = new JPanel();
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setVgap(0);
		flowLayout_10.setHgap(0);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_5_1.setLayout(flowLayout_10);
		panel_5_1.setPreferredSize(new Dimension(820, 330));
		panel_1_1_1.add(panel_5_1);

		final JPanel panel_5_1_1_1_1 = new JPanel();
		panel_5_1_1_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setHgap(10);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1.setLayout(flowLayout_11);
		panel_5_1_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1.add(panel_5_1_1_1_1);

		final JLabel a0100Label_1_1_1_1 = new JLabel();
		a0100Label_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1_1_1.setText("F0500. Interview for Activity Preferences");
		panel_5_1_1_1_1.add(a0100Label_1_1_1_1);

		final JPanel panel_5_1_1_2 = new JPanel();
		panel_5_1_1_2.setBackground(Color.WHITE);
		panel_5_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_19 = new FlowLayout();
		flowLayout_19.setVgap(2);
		flowLayout_19.setHgap(10);
		flowLayout_19.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2.setLayout(flowLayout_19);
		panel_5_1_1_2.setPreferredSize(new Dimension(820, 20));
		panel_5_1.add(panel_5_1_1_2);

		final JLabel a0100Label_1_1_2 = new JLabel();
		a0100Label_1_1_2
				.setText("<html>Show Residents the response options and say :<b> \"While you are in this facility..\"");
		panel_5_1_1_2.add(a0100Label_1_1_2);

		final JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(Color.WHITE);
		panel_1_1_2.setOpaque(true);
		panel_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(820, 280));
		panel_5_1.add(panel_1_1_2);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(214, 0, 60, 280);
		panel_1_1_2.add(panel_6_1_1);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1.setBounds(10, 22, 41, 20);
		panel_6_1_1.add(comboBox_1);

		final JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		comboBox_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1.setBounds(10, 54, 41, 20);
		panel_6_1_1.add(comboBox_1_1);

		final JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBackground(Color.WHITE);
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		comboBox_1_2.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2.setBounds(10, 87, 41, 20);
		panel_6_1_1.add(comboBox_1_2);

		final JComboBox comboBox_1_3 = new JComboBox();
		comboBox_1_3.setBackground(Color.WHITE);
		comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		comboBox_1_3.setPreferredSize(new Dimension(50, 20));
		comboBox_1_3.setBounds(10, 122, 41, 20);
		panel_6_1_1.add(comboBox_1_3);

		final JComboBox comboBox_1_4 = new JComboBox();
		comboBox_1_4.setBackground(Color.WHITE);
		comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		comboBox_1_4.setPreferredSize(new Dimension(50, 20));
		comboBox_1_4.setBounds(10, 152, 41, 20);
		panel_6_1_1.add(comboBox_1_4);

		final JComboBox comboBox_1_5 = new JComboBox();
		comboBox_1_5.setBackground(Color.WHITE);
		comboBox_1_5.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		comboBox_1_5.setPreferredSize(new Dimension(50, 20));
		comboBox_1_5.setBounds(10, 189, 41, 20);
		panel_6_1_1.add(comboBox_1_5);

		final JComboBox comboBox_1_6 = new JComboBox();
		comboBox_1_6.setBackground(Color.WHITE);
		comboBox_1_6.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		comboBox_1_6.setPreferredSize(new Dimension(50, 20));
		comboBox_1_6.setBounds(10, 223, 41, 20);
		panel_6_1_1.add(comboBox_1_6);

		final JComboBox comboBox_1_7 = new JComboBox();
		comboBox_1_7.setBackground(Color.WHITE);
		comboBox_1_7.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		comboBox_1_7.setPreferredSize(new Dimension(50, 20));
		comboBox_1_7.setBounds(10, 255, 41, 20);
		panel_6_1_1.add(comboBox_1_7);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBackground(Color.WHITE);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(274, 20, 546, 260);
		panel_1_1_2.add(panel_7_1_1);

		final JPanel panel_6_8_2 = new JPanel();
		panel_6_8_2.setOpaque(false);
		panel_6_8_2.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_20 = new FlowLayout();
		flowLayout_20.setAlignment(FlowLayout.LEFT);
		panel_6_8_2.setLayout(flowLayout_20);
		panel_6_8_2.setBounds(0, 0, 546, 33);
		panel_7_1_1.add(panel_6_8_2);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_8 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_8.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_8
				.setText("<html><body><b>A.   </b><i>how important is to you to <b>have books , newspapers, and magazines to read?");
		panel_6_8_2.add(aNationalProviderLabel_1_3_1_1_1_3_2_8);

		final JPanel panel_6_8_1_7 = new JPanel();
		panel_6_8_1_7.setOpaque(false);
		panel_6_8_1_7.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_21 = new FlowLayout();
		flowLayout_21.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_7.setLayout(flowLayout_21);
		panel_6_8_1_7.setBounds(0, 32, 546, 32);
		panel_7_1_1.add(panel_6_8_1_7);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_1_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_1_1
				.setText("<html><body><b>B.   </b><i>how important is to you to <b> listen to music you like?");
		panel_6_8_1_7.add(aNationalProviderLabel_1_3_1_1_1_3_2_1_1);

		final JPanel panel_6_8_1_1_1 = new JPanel();
		panel_6_8_1_1_1.setOpaque(false);
		panel_6_8_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_22 = new FlowLayout();
		flowLayout_22.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_1_1.setLayout(flowLayout_22);
		panel_6_8_1_1_1.setBounds(0, 63, 546, 30);
		panel_7_1_1.add(panel_6_8_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_2_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_2_1
				.setText("<html><body><b>C.   </b><i>how important is to you to <b>be around animals such as pets?");
		panel_6_8_1_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_2_2_1);

		final JPanel panel_6_8_1_2_1 = new JPanel();
		panel_6_8_1_2_1.setBackground(Color.WHITE);
		panel_6_8_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_23 = new FlowLayout();
		flowLayout_23.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_2_1.setLayout(flowLayout_23);
		panel_6_8_1_2_1.setBounds(0, 92, 546, 34);
		panel_7_1_1.add(panel_6_8_1_2_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_3_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_3_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_3_1
				.setText("<html><body><b>D.   </b><i>how important is to you to <b> keep up with the news?");
		panel_6_8_1_2_1.add(aNationalProviderLabel_1_3_1_1_1_3_2_3_1);

		final JPanel panel_6_8_1_3_1 = new JPanel();
		panel_6_8_1_3_1.setBackground(Color.WHITE);
		panel_6_8_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_24 = new FlowLayout();
		flowLayout_24.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_3_1.setLayout(flowLayout_24);
		panel_6_8_1_3_1.setBounds(0, 124, 546, 32);
		panel_7_1_1.add(panel_6_8_1_3_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_4_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_4_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_4_1
				.setText("<html><body><b>E.   </b><i>how important is to you to <b> do things with groups of people?");
		panel_6_8_1_3_1.add(aNationalProviderLabel_1_3_1_1_1_3_2_4_1);

		final JPanel panel_6_8_1_4_1 = new JPanel();
		panel_6_8_1_4_1.setBackground(Color.WHITE);
		panel_6_8_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_25 = new FlowLayout();
		flowLayout_25.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_4_1.setLayout(flowLayout_25);
		panel_6_8_1_4_1.setBounds(0, 155, 546, 42);
		panel_7_1_1.add(panel_6_8_1_4_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_5_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_5_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_5_1
				.setText("<html><body><b>F.   </b><i>how important is to you to <b> do your favourite activities?");
		panel_6_8_1_4_1.add(aNationalProviderLabel_1_3_1_1_1_3_2_5_1);

		final JPanel panel_6_8_1_5_1 = new JPanel();
		panel_6_8_1_5_1.setBackground(Color.WHITE);
		panel_6_8_1_5_1.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_26 = new FlowLayout();
		flowLayout_26.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_5_1.setLayout(flowLayout_26);
		panel_6_8_1_5_1.setBounds(0, 195, 546, 33);
		panel_7_1_1.add(panel_6_8_1_5_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_6_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_6_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_6_1
				.setText("<html><body><b>G.   </b><i>how important is to you to <b> go outside to get fresh air when the weather is good?");
		panel_6_8_1_5_1.add(aNationalProviderLabel_1_3_1_1_1_3_2_6_1);

		final JPanel panel_6_8_1_6_1 = new JPanel();
		panel_6_8_1_6_1.setBackground(Color.WHITE);
		panel_6_8_1_6_1.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_27 = new FlowLayout();
		flowLayout_27.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_6_1.setLayout(flowLayout_27);
		panel_6_8_1_6_1.setBounds(0, 227, 546, 33);
		panel_7_1_1.add(panel_6_8_1_6_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_2_7_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_7_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_1_3_1_1_1_3_2_7_1
				.setText("<html><body><b>H.   </b><i>how important is to you to <b> participation in religious services or practices?");
		panel_6_8_1_6_1.add(aNationalProviderLabel_1_3_1_1_1_3_2_7_1);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setText("Select code in the boxes");
		enterCodeLabel_1.setBounds(286, 3, 240, 14);
		panel_1_1_2.add(enterCodeLabel_1);

		final JLabel aNationalProviderLabel_1_3_1_5_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_1.setFont(new Font("Arial", Font.BOLD,
				12));
		aNationalProviderLabel_1_3_1_5_2_1.setText("Coding  :");
		aNationalProviderLabel_1_3_1_5_2_1.setBounds(10, 37, 115, 14);
		panel_1_1_2.add(aNationalProviderLabel_1_3_1_5_2_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_3 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_3
				.setText("<html><body>1. <b>Very Important");
		aNationalProviderLabel_1_3_1_1_1_3_3.setBounds(20, 57, 188, 14);
		panel_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_3_3);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_2
				.setText("<html><body>2. <b>Somewhat Important");
		aNationalProviderLabel_1_3_1_1_1_3_1_2.setBounds(20, 77, 188, 14);
		panel_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_3_1_2);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1_2
				.setText("<html><body>3. <b>Not Very Important");
		aNationalProviderLabel_1_3_1_1_1_3_1_1_2.setBounds(20, 94, 188, 14);
		panel_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_3_1_1_2);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_1_1_1_3 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_3
				.setText("<html><body>4. <b>Not Important at all");
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_3.setBounds(20, 114, 188, 14);
		panel_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_3_1_1_1_3);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1_1
				.setText("<html><body>5. <b>Important but cant do or no &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;choice");
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1_1
				.setBounds(20, 134, 188, 25);
		panel_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2_1
				.setText("<html><body>9. <b>No Respons or non- responsive");
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2_1
				.setBounds(20, 165, 188, 14);
		panel_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2_1);

		final JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBackground(Color.WHITE);
		panel_1_1_1.add(panel_1_2_1);
		panel_1_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setPreferredSize(new Dimension(820, 100));

		final JPanel panel_5_2_1 = new JPanel();
		panel_5_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_29 = new FlowLayout();
		flowLayout_29.setHgap(10);
		flowLayout_29.setAlignment(FlowLayout.LEFT);
		panel_5_2_1.setLayout(flowLayout_29);
		panel_5_2_1.setBounds(0, 0, 820, 26);
		panel_1_2_1.add(panel_5_2_1);

		final JLabel a0100Label_2_1 = new JLabel();
		a0100Label_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_2_1
				.setText("F0600. Daily and Activity Preferences Primary Respondant");
		panel_5_2_1.add(a0100Label_2_1);

		final JPanel panel_6_2_1 = new JPanel();
		panel_6_2_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBounds(0, 25, 84, 75);
		panel_1_2_1.add(panel_6_2_1);

		final JLabel enterCodeLabel_2_1 = new JLabel();
		enterCodeLabel_2_1.setText("Enter Code");
		enterCodeLabel_2_1.setBounds(10, 10, 54, 14);
		panel_6_2_1.add(enterCodeLabel_2_1);

		final JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBackground(Color.WHITE);
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "9" }));
		comboBox_2_1.setPreferredSize(new Dimension(50, 20));
		comboBox_2_1.setBounds(10, 30, 50, 20);
		panel_6_2_1.add(comboBox_2_1);

		final JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setOpaque(false);
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(90, 27, 720, 68);
		panel_1_2_1.add(panel_7_2_1);

		final JLabel aNationalProviderLabel_3_1 = new JLabel();
		aNationalProviderLabel_3_1
				.setText("<html><b>Indicate primary respondant</b>for daily and activity preferences(F0400 and F0500)");
		aNationalProviderLabel_3_1.setBounds(10, 5, 607, 14);
		panel_7_2_1.add(aNationalProviderLabel_3_1);

		final JLabel aNationalProviderLabel_1_3_1 = new JLabel();
		aNationalProviderLabel_1_3_1.setText("<html>1. <b>Resident");
		aNationalProviderLabel_1_3_1.setBounds(39, 22, 311, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_1);

		final JLabel aNationalProviderLabel_1_3_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_1
				.setText("<html>2. <b>Family or significant other </b>(close friend or other representative)");
		aNationalProviderLabel_1_3_1_1.setBounds(39, 38, 419, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_1_1);

		final JLabel aNationalProviderLabel_1_3_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_2
				.setText("<html>9. <b>Interview could not be completed</b> by resident or family/significant others(\"No Response\" to 3 or more items)");
		aNationalProviderLabel_1_3_1_2.setBounds(39, 54, 637, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_1_2);

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
		PanelMDS3Page12 panel = new PanelMDS3Page12();
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
