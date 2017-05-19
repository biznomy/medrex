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

public class PanelMDS3Page16 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3010937240316344279L;

	public PanelMDS3Page16() {
		super();
		setPreferredSize(new Dimension(840, 1250));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setHgap(0);
		flowLayout_6.setVgap(0);
		setLayout(flowLayout_6);
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(840, 40));
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
		sectionALabel.setText("Section H");
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
		identificationInformationLabel.setText("Bladder and Bowel");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(840, 180));
		add(panel_1);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_2);
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5.setBounds(0, 0, 840, 25);
		panel_1.add(panel_5);

		final JLabel a0100Label = new JLabel();
		a0100Label.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label.setText("H0100. Appliances");
		panel_5.add(a0100Label);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 49, 84, 131);
		panel_1.add(panel_6);

		final JLabel enterCodeLabel_1_1 = new JLabel();
		enterCodeLabel_1_1.setBounds(15, 6, 54, 14);
		enterCodeLabel_1_1.setText("Enter Code");
		panel_6.add(enterCodeLabel_1_1);

		final JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1.setBounds(15, 26, 50, 20);
		panel_6.add(comboBox_1_1);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(83, 49, 757, 128);
		panel_1.add(panel_7);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 0, 757, 32);
		panel_7.add(panel_9);

		final JLabel aIndwellingCatherLabel = new JLabel();
		aIndwellingCatherLabel
				.setText("<html><body><b>A. Indwelling cather</b> (including suprapublic catheter and nephrostomy tube");
		aIndwellingCatherLabel.setBounds(6, 10, 486, 14);
		panel_9.add(aIndwellingCatherLabel);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1.setLayout(null);
		panel_9_1.setBackground(Color.WHITE);
		panel_9_1.setBounds(0, 31, 757, 31);
		panel_7.add(panel_9_1);

		final JLabel bExternalCatheterLabel = new JLabel();
		bExternalCatheterLabel.setText("<html>B. External catheter");
		bExternalCatheterLabel.setBounds(6, 10, 653, 14);
		panel_9_1.add(bExternalCatheterLabel);

		final JPanel panel_9_2 = new JPanel();
		panel_9_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2.setLayout(null);
		panel_9_2.setBackground(Color.WHITE);
		panel_9_2.setBounds(0, 59, 757, 31);
		panel_7.add(panel_9_2);

		final JLabel cOstomyincludingLabel = new JLabel();
		cOstomyincludingLabel
				.setText("C. Ostomy (including urostomy, ileostomy , and colostomy)");
		cOstomyincludingLabel.setBounds(8, 10, 612, 14);
		panel_9_2.add(cOstomyincludingLabel);

		final JPanel panel_9_3 = new JPanel();
		panel_9_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3.setLayout(null);
		panel_9_3.setBackground(Color.WHITE);
		panel_9_3.setBounds(0, 88, 757, 42);
		panel_7.add(panel_9_3);

		final JLabel dIntermittendCatheterizationLabel = new JLabel();
		dIntermittendCatheterizationLabel
				.setText("D. Intermittend catheterization");
		dIntermittendCatheterizationLabel.setBounds(8, 12, 279, 14);
		panel_9_3.add(dIntermittendCatheterizationLabel);

		final JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(1, 25, 839, 25);
		panel_1.add(panel_8);

		final JLabel checkAllThatLabel = new JLabel();
		checkAllThatLabel.setFont(new Font("Arial", Font.BOLD, 12));
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(54, 6, 228, 14);
		panel_8.add(checkAllThatLabel);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setPreferredSize(new Dimension(840, 370));
		add(panel_1_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, -1, 840, 26);
		panel_1_1_1.add(panel_5_1_1);

		final JLabel a0100Label_1_1 = new JLabel();
		a0100Label_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1.setText("H0200. Urinary Toileting Program");
		panel_5_1_1.add(a0100Label_1_1);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1.setBounds(0, 24, 86, 342);
		panel_1_1_1.add(panel_6_1_1);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setBounds(16, 9, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(18, 31, 50, 20);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(comboBox_1);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7_1_1.setBackground(Color.WHITE);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(85, 24, 755, 132);
		panel_1_1_1.add(panel_7_1_1);

		final JLabel aNationalProviderLabel_2_1 = new JLabel();
		aNationalProviderLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_2_1
				.setText("<html><body><b>A. Has a trial of a toileting program(e.g.., scheduled toileting,prompted voiding, or bladder training</b>) been attempted on <br> addmission/reentry or since urinary incontinence was noted in this facility?");
		aNationalProviderLabel_2_1.setBounds(10, 5, 701, 54);
		panel_7_1_1.add(aNationalProviderLabel_2_1);

		final JLabel aNationalProviderLabel_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>0. <b>No --></b> Skip to H0300, Urinary Continence");
		aNationalProviderLabel_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_2
				.setText("<html><body>01. <b>Yes --></b> Continue to H0200B, Response");
		aNationalProviderLabel_1_1_1_1_2.setBounds(32, 85, 617, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_2);

		final JLabel aNationalProviderLabel_1_1_1_1_3 = new JLabel();
		aNationalProviderLabel_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_3
				.setText("<html><body>9. <b>Unable to determine --></b>Skip to H0200C, Current toileting program or trial");
		aNationalProviderLabel_1_1_1_1_3.setBounds(32, 105, 541, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_3);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(85, 156, 755, 109);
		panel_1_1_1.add(panel_7_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1 = new JLabel();
		aNationalProviderLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_2_1_1
				.setText("<html><body><b>B.  Response-</b> What was the resident's response to the trial program?");
		aNationalProviderLabel_2_1_1.setBounds(10, 5, 519, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1);

		final JLabel aNationalProviderLabel_1_2_1_1 = new JLabel();
		aNationalProviderLabel_1_2_1_1
				.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_1_2_1_1
				.setText("<html><body>0.<b> No improvement");
		aNationalProviderLabel_1_2_1_1.setBounds(32, 25, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_6 = new JLabel();
		aNationalProviderLabel_1_1_1_1_6
				.setText("<html><body>1. <b>Decreased wetness");
		aNationalProviderLabel_1_1_1_1_6.setBounds(32, 45, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_6);

		final JLabel aNationalProviderLabel_1_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1_1
				.setText("<html><body>02. <b>Completely dry</b>(continent)");
		aNationalProviderLabel_1_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2_1
				.setText("<html><body>9. <b>Unable to determine </b>or trial in progress");
		aNationalProviderLabel_1_1_1_1_2_1.setBounds(32, 85, 617, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1);

		final JPanel panel_7_1_1_1_1 = new JPanel();
		panel_7_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(85, 264, 755, 102);
		panel_1_1_1.add(panel_7_1_1_1_1);

		final JLabel aNationalProviderLabel_2_1_1_2 = new JLabel();
		aNationalProviderLabel_2_1_1_2
				.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_2_1_1_2
				.setText("<html><body><b>C. Current toileting program or trial</b> - Is a toileting program(e.g. scheduled toiletiong, prompted voiding, or bladder training) currently <br> being used to manage the resident's urinary continence?");
		aNationalProviderLabel_2_1_1_2.setBounds(10, 5, 735, 47);
		panel_7_1_1_1_1.add(aNationalProviderLabel_2_1_1_2);

		final JLabel aNationalProviderLabel_1_2_1_1_2 = new JLabel();
		aNationalProviderLabel_1_2_1_1_2.setText("<html><body>0. <b> No");
		aNationalProviderLabel_1_2_1_1_2.setBounds(32, 53, 342, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_2);

		final JLabel aNationalProviderLabel_1_1_1_1_6_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_6_1.setText("<html><body>1.<b> Yes");
		aNationalProviderLabel_1_1_1_1_6_1.setBounds(32, 70, 342, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_6_1);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 180));
		add(panel_1_1);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1.setLayout(flowLayout_3);
		panel_5_1.setBounds(0, 0, 840, 25);
		panel_1_1.add(panel_5_1);

		final JLabel a0100Label_1 = new JLabel();
		a0100Label_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1.setText("H0300. Urinary Continence");
		panel_5_1.add(a0100Label_1);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setLayout(null);
		panel_6_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1.setBounds(0, 25, 84, 155);
		panel_1_1.add(panel_6_1);

		final JLabel enterCodeLabel_1_2 = new JLabel();
		enterCodeLabel_1_2.setBounds(15, 6, 54, 14);
		enterCodeLabel_1_2.setText("Enter Code");
		panel_6_1.add(enterCodeLabel_1_2);

		final JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_2.setBackground(Color.WHITE);
		comboBox_1_2.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2.setBounds(15, 26, 50, 20);
		panel_6_1.add(comboBox_1_2);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(83, 31, 726, 146);
		panel_1_1.add(panel_10);

		final JLabel urinaryContinenceLabel = new JLabel();
		urinaryContinenceLabel
				.setText("<html><body><b>Urinary continence </b>- Select the one category that best describes the resident");
		urinaryContinenceLabel.setBounds(5, 10, 617, 14);
		panel_10.add(urinaryContinenceLabel);

		final JLabel label = new JLabel();
		label.setText("<html><body>0. <b>Always continent</b>");
		label.setBounds(5, 28, 389, 14);
		panel_10.add(label);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body1. <b>Occasionally incontinent </b>(less than 7 episodes of incontinence");
		label_1.setBounds(5, 43, 402, 14);
		panel_10.add(label_1);

		final JLabel frequentlyIncontinent7Label = new JLabel();
		frequentlyIncontinent7Label
				.setText("<html><body>2. <b>Frequently incontinent </b>(7 or more episodes of urinary incontinence, but at least one episode of continent voiding)");
		frequentlyIncontinent7Label.setBounds(5, 63, 617, 14);
		panel_10.add(frequentlyIncontinent7Label);

		final JLabel label_2 = new JLabel();
		label_2
				.setText("<html><body>3. <b>Always incontinent</b>( no episodes of continent voiding)");
		label_2.setBounds(5, 80, 402, 14);
		panel_10.add(label_2);

		final JLabel label_3 = new JLabel();
		label_3
				.setText("<html><body>9. <b>Not rated</b>, resident had an ostomy or did not have a bowel movement for the entire 7 days");
		label_3.setBounds(5, 100, 576, 14);
		panel_10.add(label_3);

		final JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(Color.WHITE);
		panel_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(840, 180));
		add(panel_1_1_2);

		final JPanel panel_5_1_2 = new JPanel();
		panel_5_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setHgap(10);
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_5_1_2.setLayout(flowLayout_8);
		panel_5_1_2.setBounds(0, 0, 840, 25);
		panel_1_1_2.add(panel_5_1_2);

		final JLabel a0100Label_1_2 = new JLabel();
		a0100Label_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_2.setText("H0300. Bowel  Continence");
		panel_5_1_2.add(a0100Label_1_2);

		final JPanel panel_6_1_2 = new JPanel();
		panel_6_1_2.setLayout(null);
		panel_6_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_2.setBounds(0, 25, 84, 155);
		panel_1_1_2.add(panel_6_1_2);

		final JLabel enterCodeLabel_1_2_1 = new JLabel();
		enterCodeLabel_1_2_1.setBounds(15, 6, 54, 14);
		enterCodeLabel_1_2_1.setText("Enter Code");
		panel_6_1_2.add(enterCodeLabel_1_2_1);

		final JComboBox comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_2_1.setBackground(Color.WHITE);
		comboBox_1_2_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2_1.setBounds(15, 26, 50, 20);
		panel_6_1_2.add(comboBox_1_2_1);

		final JPanel panel_10_1 = new JPanel();
		panel_10_1.setBackground(Color.WHITE);
		panel_10_1.setLayout(null);
		panel_10_1.setBounds(84, 31, 731, 146);
		panel_1_1_2.add(panel_10_1);

		final JLabel urinaryContinenceLabel_1 = new JLabel();
		urinaryContinenceLabel_1
				.setText("<html><body><b>Bowel continence - </b> Select the one category that best describes the resident");
		urinaryContinenceLabel_1.setBounds(5, 10, 617, 14);
		panel_10_1.add(urinaryContinenceLabel_1);

		final JLabel label_6 = new JLabel();
		label_6.setText("<html><body>0. <b>Always continent</b>");
		label_6.setBounds(5, 28, 389, 14);
		panel_10_1.add(label_6);

		final JLabel occasionallyIncontinentLabel = new JLabel();
		occasionallyIncontinentLabel
				.setText("<html><body1. <b>Occasionally incontinent </b>(one episode of bowel incontinence)");
		occasionallyIncontinentLabel.setBounds(5, 43, 402, 14);
		panel_10_1.add(occasionallyIncontinentLabel);

		final JLabel frequentlyIncontinent7Label_1 = new JLabel();
		frequentlyIncontinent7Label_1
				.setText("<html><body>2. <b>Frequently incontinent </b>(2 or more episodes of bowel incontinence, but at least one continent bowel movement)");
		frequentlyIncontinent7Label_1.setBounds(5, 63, 617, 14);
		panel_10_1.add(frequentlyIncontinent7Label_1);

		final JLabel label_2_1 = new JLabel();
		label_2_1
				.setText("<html><body>3. <b>Always incontinent</b>(no episodes of continent bowel movements)");
		label_2_1.setBounds(5, 80, 402, 14);
		panel_10_1.add(label_2_1);

		final JLabel label_3_1 = new JLabel();
		label_3_1
				.setText("<html><body>9. <b>Not rated</b>, resident had an ostomy or did not have a bowel movement for the entire 7 days");
		label_3_1.setBounds(5, 100, 576, 14);
		panel_10_1.add(label_3_1);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 115));
		add(panel_1_2);

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setHgap(10);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_4);
		panel_5_2.setBounds(0, 0, 840, 25);
		panel_1_2.add(panel_5_2);

		final JLabel a0100Label_2 = new JLabel();
		a0100Label_2.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_2.setText("H0500. Bowel Toileting Program");
		panel_5_2.add(a0100Label_2);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2.setBounds(0, 24, 84, 91);
		panel_1_2.add(panel_6_2);

		final JLabel enterCodeLabel_1_2_1_1 = new JLabel();
		enterCodeLabel_1_2_1_1.setText("Enter Code");
		enterCodeLabel_1_2_1_1.setBounds(10, 10, 54, 14);
		panel_6_2.add(enterCodeLabel_1_2_1_1);

		final JComboBox comboBox_1_2_1_1 = new JComboBox();
		comboBox_1_2_1_1
				.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_2_1_1.setBackground(Color.WHITE);
		comboBox_1_2_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2_1_1.setBounds(10, 30, 50, 20);
		panel_6_2.add(comboBox_1_2_1_1);

		final JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(83, 31, 747, 81);
		panel_1_2.add(panel_11);

		final JLabel isAToiletingLabel = new JLabel();
		isAToiletingLabel.setFont(new Font("Arial", Font.BOLD, 12));
		isAToiletingLabel
				.setText("Is a toileting program currently being used to manage the resident's bowel continence?");
		isAToiletingLabel.setBounds(10, 10, 699, 29);
		panel_11.add(isAToiletingLabel);

		final JLabel label_4 = new JLabel();
		label_4.setText("<html><body>0.<b> No</b>");
		label_4.setBounds(10, 45, 142, 14);
		panel_11.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setText("<html><body>1.<b>Yes</b>");
		label_5.setBounds(10, 65, 54, 14);
		panel_11.add(label_5);

		final JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_3.setLayout(null);
		panel_1_3.setPreferredSize(new Dimension(840, 105));
		add(panel_1_3);

		final JPanel panel_5_3 = new JPanel();
		panel_5_3.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_3.setLayout(flowLayout_7);
		panel_5_3.setBounds(0, 0, 840, 25);
		panel_1_3.add(panel_5_3);

		final JLabel a0100Label_3 = new JLabel();
		a0100Label_3.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_3.setText("H0600. Bowel Patterns");
		panel_5_3.add(a0100Label_3);

		final JPanel panel_6_3 = new JPanel();
		panel_6_3.setLayout(null);
		panel_6_3.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_3.setBounds(0, 24, 84, 80);
		panel_1_3.add(panel_6_3);

		final JLabel enterCodeLabel_1_2_1_1_1 = new JLabel();
		enterCodeLabel_1_2_1_1_1.setBounds(16, 6, 52, 14);
		enterCodeLabel_1_2_1_1_1.setText("Enter code");
		panel_6_3.add(enterCodeLabel_1_2_1_1_1);

		final JComboBox comboBox_1_2_1_1_1 = new JComboBox();
		comboBox_1_2_1_1_1.setModel(new DefaultComboBoxModel(
				new String[] { "" }));
		comboBox_1_2_1_1_1.setBackground(Color.WHITE);
		comboBox_1_2_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_2_1_1_1.setBounds(16, 26, 50, 20);
		panel_6_3.add(comboBox_1_2_1_1_1);

		final JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setBounds(84, 31, 731, 72);
		panel_1_3.add(panel_12);

		final JLabel constipationPresentLabel = new JLabel();
		constipationPresentLabel.setFont(new Font("Arial", Font.BOLD, 12));
		constipationPresentLabel.setText("Constipation present?");
		constipationPresentLabel.setBounds(10, 10, 361, 14);
		panel_12.add(constipationPresentLabel);

		final JLabel label_7 = new JLabel();
		label_7.setText("<html><body>0.<b> No</b>");
		label_7.setBounds(38, 30, 54, 14);
		panel_12.add(label_7);

		final JLabel label_8 = new JLabel();
		label_8.setText("<html><body>1.<b>Yes</b>");
		label_8.setBounds(38, 50, 54, 14);
		panel_12.add(label_8);
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
		PanelMDS3Page16 panel = new PanelMDS3Page16();
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
