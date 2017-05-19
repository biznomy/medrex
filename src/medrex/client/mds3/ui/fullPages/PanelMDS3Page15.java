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
import medrex.commons.intf.Form;

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page15 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3242931042984621580L;

	public PanelMDS3Page15() {
		super();
		setBorder(new LineBorder(Color.black, 0, false));
		setPreferredSize(new Dimension(840, 1170));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setHgap(0);
		flowLayout_6.setVgap(0);
		setLayout(flowLayout_6);
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
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

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(840, 230));
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
		a0100Label.setText("G0120. Bathing");
		panel_5.add(a0100Label);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.setBounds(0, 56, 70, 175);
		panel_1.add(panel_6);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setBounds(10, 6, 54, 14);
		panel_6.add(enterCodeLabel);
		enterCodeLabel.setText("Enter Code");

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(12, 25, 50, 20);
		panel_6.add(comboBox_1);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "8" }));
		comboBox_1.setPreferredSize(new Dimension(50, 20));

		final JLabel enterCodeLabel_1_1 = new JLabel();
		enterCodeLabel_1_1.setBounds(10, 122, 54, 14);
		panel_6.add(enterCodeLabel_1_1);
		enterCodeLabel_1_1.setText("Enter Code");

		final JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(12, 142, 50, 20);
		panel_6.add(comboBox_1_1);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setPreferredSize(new Dimension(50, 20));

		final JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(69, 56, 771, 122);
		panel_1.add(panel_7);

		final JLabel aNationalProviderLabel = new JLabel();
		aNationalProviderLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel.setText("A. Self-performance");
		aNationalProviderLabel.setBounds(10, 5, 206, 14);
		panel_7.add(aNationalProviderLabel);

		final JTextField textField_2_1_1 = new JTextField();
		textField_2_1_1.setBounds(25, 122, 341, 20);
		panel_7.add(textField_2_1_1);

		final JLabel aNationalProviderLabel_1_2_1 = new JLabel();
		aNationalProviderLabel_1_2_1.setBounds(20, 25, 342, 14);
		panel_7.add(aNationalProviderLabel_1_2_1);
		aNationalProviderLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_2_1
				.setText("<html><body>0. <b>Independent</b> - no help provided");

		final JLabel aNationalProviderLabel_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1.setBounds(20, 40, 342, 14);
		panel_7.add(aNationalProviderLabel_1_1_1_1);
		aNationalProviderLabel_1_1_1_1
				.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_1_1_1_1
				.setText("<html><body>1. <b>Supervision</b> -oversight help only");

		final JLabel aNationalProviderLabel_1_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_1_1_1_1.setBounds(60, 300, 383, 14);
		panel_7.add(aNationalProviderLabel_1_1_1_1_1);
		aNationalProviderLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>03. <b>Annual</b> Assessment");

		final JLabel aNationalProviderLabel_1_1_1_1_2 = new JLabel();
		aNationalProviderLabel_1_1_1_1_2.setBounds(20, 56, 308, 14);
		panel_7.add(aNationalProviderLabel_1_1_1_1_2);
		aNationalProviderLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_2
				.setText("<html><body>2. <b>Physical help limited to transfer only </b> ");

		final JLabel physicalHelpInLabel = new JLabel();
		physicalHelpInLabel
				.setText("<html><body>3.<b>Physical help in part of bathing activity</b>");
		physicalHelpInLabel.setBounds(20, 72, 617, 14);
		panel_7.add(physicalHelpInLabel);

		final JLabel label = new JLabel();
		label.setText("<html><body>4.<b>Total Dependence</b>");
		label.setBounds(20, 88, 600, 14);
		panel_7.add(label);

		final JLabel label_1 = new JLabel();
		label_1
				.setText("<html><body>8.<b>Activity itself did not occur</b> during the entire period");
		label_1.setBounds(20, 104, 600, 14);
		panel_7.add(label_1);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(0, 24, 840, 33);
		panel_1.add(panel_8);

		final JLabel howResidentLabel = new JLabel();
		howResidentLabel.setBorder(new LineBorder(Color.black, 0, false));
		howResidentLabel
				.setText("<HTML>  How resident takes full-body bath/shower,sponge bath, and transfers in/out of tub/shower (<b>excludes</b> washing of back and hair). Code for<b> most <br> dependent</b> in self-perfoemance and support </HTML>");
		howResidentLabel.setBounds(10, 0, 820, 33);
		panel_8.add(howResidentLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9.setLayout(null);
		panel_9.setBounds(69, 177, 771, 54);
		panel_1.add(panel_9);

		final JLabel bSupportProvidedLabel = new JLabel();
		bSupportProvidedLabel
				.setText("<html><body><b>B. Support Provided </b>");
		bSupportProvidedLabel.setBounds(10, 10, 182, 14);
		panel_9.add(bSupportProvidedLabel);

		final JLabel bathingSupportCodesLabel = new JLabel();
		bathingSupportCodesLabel
				.setText("<html><body>(Bathing support codes are as defined in item <b> G0110 column 2, ADL Support Provided,</b> above)");
		bathingSupportCodesLabel.setBounds(20, 28, 651, 14);
		panel_9.add(bathingSupportCodesLabel);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setPreferredSize(new Dimension(840, 283));
		add(panel_1_1_1);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, 0, 840, 26);
		panel_1_1_1.add(panel_5_1_1);

		final JLabel a0100Label_1_1 = new JLabel();
		a0100Label_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1.setText("G0300. Balance During Transitions and Walking");
		panel_5_1_1.add(a0100Label_1_1);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7_1_1.setBackground(Color.WHITE);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(0, 50, 421, 234);
		panel_1_1_1.add(panel_7_1_1);

		final JLabel aNationalProviderLabel_2_1 = new JLabel();
		aNationalProviderLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		aNationalProviderLabel_2_1.setText("Coding:");
		aNationalProviderLabel_2_1.setBounds(10, 28, 294, 14);
		panel_7_1_1.add(aNationalProviderLabel_2_1);

		final JLabel aNationalProviderLabel_1_1_1_1_3 = new JLabel();
		aNationalProviderLabel_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_3
				.setText("<html><body>0.  <b>Steady at all times </b> ");
		aNationalProviderLabel_1_1_1_1_3.setBounds(32, 48, 260, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_3);

		final JLabel aNationalProviderLabel_1_1_1_1_4 = new JLabel();
		aNationalProviderLabel_1_1_1_1_4.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_4
				.setText("<html><body>1. <b> Not steady, but able to stabilize without human <br> &nbsp &nbsp assistance</b>");
		aNationalProviderLabel_1_1_1_1_4.setBounds(32, 64, 321, 32);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_4);

		final JLabel aNationalProviderLabel_1_1_1_1_5 = new JLabel();
		aNationalProviderLabel_1_1_1_1_5.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_1_1_1_5
				.setText("<html><body>2. <b> Not steady, only able to stabilize with human <br>&nbsp &nbsp assistance </b>");
		aNationalProviderLabel_1_1_1_1_5.setBounds(32, 102, 272, 32);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_5);

		final JLabel label_2 = new JLabel();
		label_2.setText("<html><body> 8. <b> Activity did not occur </b>");
		label_2.setBounds(32, 136, 226, 14);
		panel_7_1_1.add(label_2);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(420, 50, 420, 234);
		panel_1_1_1.add(panel_7_1_1_1);

		final JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 0, 420, 28);
		panel_7_1_1_1.add(panel_11);

		final JLabel enterCodesInLabel = new JLabel();
		enterCodesInLabel.setBounds(35, 8, 201, 14);
		enterCodesInLabel.setText("<html><body><b>Enter Codes in Boxes");
		panel_11.add(enterCodesInLabel);

		final JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_12.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_12.setLayout(null);
		panel_12.setBounds(0, 27, 55, 207);
		panel_7_1_1_1.add(panel_12);

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "8" }));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(10, 10, 35, 20);
		panel_12.add(comboBox);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "8" }));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(10, 48, 35, 20);
		panel_12.add(comboBox_2);

		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "8" }));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(10, 86, 35, 20);
		panel_12.add(comboBox_3);

		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "8" }));
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(10, 124, 35, 20);
		panel_12.add(comboBox_4);

		final JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "8" }));
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setBounds(10, 162, 35, 20);
		panel_12.add(comboBox_5);

		final JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(54, 27, 366, 40);
		panel_7_1_1_1.add(panel_13);

		final JLabel aMovingFromLabel = new JLabel();
		aMovingFromLabel.setBounds(10, 10, 261, 14);
		aMovingFromLabel
				.setText("<html><body<b>A.  Moving from seated to standing position  ");
		panel_13.add(aMovingFromLabel);

		final JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_14.setBackground(Color.WHITE);
		panel_14.setLayout(null);
		panel_14.setBounds(54, 66, 366, 40);
		panel_7_1_1_1.add(panel_14);

		final JLabel bLabel = new JLabel();
		bLabel
				.setText("<html><body> <b> B.  Walking </b> (with assistive device if used )");
		bLabel.setBounds(10, 10, 255, 14);
		panel_14.add(bLabel);

		final JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(54, 105, 366, 40);
		panel_7_1_1_1.add(panel_15);

		final JLabel cTurningLabel = new JLabel();
		cTurningLabel
				.setText("<html><body><b> C. Turning around </b> and facing the opposite direction while walking ");
		cTurningLabel.setBounds(10, 10, 345, 14);
		panel_15.add(cTurningLabel);

		final JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_16.setLayout(null);
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(54, 144, 366, 40);
		panel_7_1_1_1.add(panel_16);

		final JLabel dMovingOnLabel = new JLabel();
		dMovingOnLabel
				.setText("<html><body><b>D.  Moving on and off toilet </b>");
		dMovingOnLabel.setBounds(10, 10, 327, 14);
		panel_16.add(dMovingOnLabel);

		final JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_17.setLayout(null);
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(54, 183, 366, 51);
		panel_7_1_1_1.add(panel_17);

		final JLabel eSurfacetosurfaceLabel = new JLabel();
		eSurfacetosurfaceLabel
				.setText("<html><body><b> E. Surface-to-surface transfer </b> (transfer between bed and chair or <br> &nbsp &nbsp wheelchair)");
		eSurfacetosurfaceLabel.setBounds(10, 7, 345, 30);
		panel_17.add(eSurfacetosurfaceLabel);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 25, 840, 26);
		panel_1_1_1.add(panel_10);

		final JLabel afterObservingTheLabel = new JLabel();
		afterObservingTheLabel
				.setText("<html><body>  After observing the resident, <b> code the following walking and transition items for most dependent</b>");
		afterObservingTheLabel.setBounds(10, 0, 548, 26);
		panel_10.add(afterObservingTheLabel);

		final JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.WHITE);
		panel_18.setLayout(null);
		panel_18.setPreferredSize(new Dimension(840, 159));
		add(panel_18);

		final JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_19.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_19.setLayout(null);
		panel_19.setBounds(0, 0, 840, 28);
		panel_18.add(panel_19);

		final JLabel g0400functionalLimitationInLabel = new JLabel();
		g0400functionalLimitationInLabel.setFont(new Font("Arial", Font.BOLD,
				12));
		g0400functionalLimitationInLabel.setBounds(10, 7, 307, 14);
		g0400functionalLimitationInLabel
				.setText("G0400.Functional Limitation in Range of Motion");
		panel_19.add(g0400functionalLimitationInLabel);

		final JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_20.setBackground(Color.WHITE);
		panel_20.setLayout(null);
		panel_20.setBounds(0, 26, 840, 26);
		panel_18.add(panel_20);

		final JLabel codeForLimitationLabel = new JLabel();
		codeForLimitationLabel
				.setText("<html><body><b>Code for limitation </b> that interfered with daily functions or placed resident at risk of injury");
		codeForLimitationLabel.setBounds(10, 7, 543, 14);
		panel_20.add(codeForLimitationLabel);

		final JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 51, 420, 108);
		panel_18.add(panel_21);

		final JLabel codingLabel = new JLabel();
		codingLabel.setFont(new Font("Arial", Font.BOLD, 12));
		codingLabel.setText("Coding:");
		codingLabel.setBounds(10, 28, 54, 14);
		panel_21.add(codingLabel);

		final JLabel label_3 = new JLabel();
		label_3.setText("<html><body> 0. <b> No impairment</b>");
		label_3.setBounds(32, 48, 162, 14);
		panel_21.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setText("<html><body>1. <b> Impairment on one side </b>");
		label_4.setBounds(32, 64, 162, 14);
		panel_21.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setText("<html><body>2. <b> Impairment on both sides </b>");
		label_5.setBounds(32, 80, 251, 14);
		panel_21.add(label_5);

		final JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBackground(Color.WHITE);
		panel_22.setBounds(420, 52, 420, 106);
		panel_18.add(panel_22);

		final JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_23.setBackground(Color.WHITE);
		panel_23.setLayout(null);
		panel_23.setBounds(-1, -2, 421, 28);
		panel_22.add(panel_23);

		final JLabel enterCodesInLabel_1 = new JLabel();
		enterCodesInLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		enterCodesInLabel_1.setText("Enter Codes in Boxes");
		enterCodesInLabel_1.setBounds(35, 8, 223, 14);
		panel_23.add(enterCodesInLabel_1);

		final JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_24.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_24.setLayout(null);
		panel_24.setBounds(0, 25, 55, 82);
		panel_22.add(panel_24);

		final JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 0,
				false));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setBounds(10, 10, 35, 20);
		panel_24.add(comboBox_6);

		final JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));
		comboBox_7.setBackground(Color.WHITE);
		comboBox_7.setBounds(10, 49, 35, 20);
		panel_24.add(comboBox_7);

		final JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_25.setBackground(Color.WHITE);
		panel_25.setLayout(null);
		panel_25.setBounds(55, 26, 365, 40);
		panel_22.add(panel_25);

		final JLabel aUpperLabel = new JLabel();
		aUpperLabel
				.setText("<html><body><b> A.  Upper extremity </b> (shoulder, elbow, wrist, hand)");
		aUpperLabel.setBounds(10, 10, 288, 14);
		panel_25.add(aUpperLabel);

		final JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_26.setLayout(null);
		panel_26.setBackground(Color.WHITE);
		panel_26.setBounds(55, 65, 365, 41);
		panel_22.add(panel_26);

		final JLabel bLowerLabel = new JLabel();
		bLowerLabel.setBounds(10, 10, 287, 14);
		bLowerLabel
				.setText("<html><body><b> B. Lower extremity </b> (hip,knee,ankle,foot)");
		panel_26.add(bLowerLabel);

		final JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_27.setPreferredSize(new Dimension(840, 223));
		add(panel_27);

		final JPanel panel_28 = new JPanel();
		panel_28.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_28.setBounds(0, 0, 840, 26);
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
		g0600MobilityDevicesLabel.setText("G0600. Mobility Devices");

		final JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_29.setLayout(null);
		panel_29.setBackground(Color.WHITE);
		panel_29.setBounds(0, 26, 840, 26);
		panel_27.add(panel_29);

		final JLabel codeForLimitationLabel_1 = new JLabel();
		codeForLimitationLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		codeForLimitationLabel_1.setText("Check all that were normally used");
		codeForLimitationLabel_1.setBounds(35, 7, 455, 14);
		panel_29.add(codeForLimitationLabel_1);

		final JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_30.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_30.setLayout(null);
		panel_30.setBounds(0, 52, 70, 172);
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
		panel_31.setBounds(70, 52, 770, 35);
		panel_27.add(panel_31);

		final JLabel aCanecrutchLabel = new JLabel();
		aCanecrutchLabel.setText("<html><body><b>A. Cane/crutch</b>");
		aCanecrutchLabel.setBounds(10, 10, 234, 14);
		panel_31.add(aCanecrutchLabel);

		final JPanel panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_32.setLayout(null);
		panel_32.setBackground(Color.WHITE);
		panel_32.setBounds(70, 86, 770, 35);
		panel_27.add(panel_32);

		final JLabel bWalkerLabel = new JLabel();
		bWalkerLabel.setBackground(Color.WHITE);
		bWalkerLabel.setText("<html><body><b>B. Walker </b>");
		bWalkerLabel.setBounds(10, 10, 191, 14);
		panel_32.add(bWalkerLabel);

		final JPanel panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_33.setLayout(null);
		panel_33.setBackground(Color.WHITE);
		panel_33.setBounds(70, 120, 770, 35);
		panel_27.add(panel_33);

		final JLabel cWheelchairLabel = new JLabel();
		cWheelchairLabel
				.setText("<html><body><b>C. Wheelchair </b> ( manual or electric )");
		cWheelchairLabel.setBounds(10, 10, 184, 14);
		panel_33.add(cWheelchairLabel);

		final JPanel panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_34.setLayout(null);
		panel_34.setBackground(Color.WHITE);
		panel_34.setBounds(70, 154, 770, 35);
		panel_27.add(panel_34);

		final JLabel dLimbProsthesisLabel = new JLabel();
		dLimbProsthesisLabel.setText("<html><body><b>D. Limb prosthesis </b>");
		dLimbProsthesisLabel.setBounds(10, 10, 146, 14);
		panel_34.add(dLimbProsthesisLabel);

		final JPanel panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_35.setLayout(null);
		panel_35.setBackground(Color.WHITE);
		panel_35.setBounds(70, 187, 770, 37);
		panel_27.add(panel_35);

		final JLabel zNoneOtLabel = new JLabel();
		zNoneOtLabel
				.setText("<html><body><b>Z. None ot the above </b>were used");
		zNoneOtLabel.setBounds(10, 10, 253, 14);
		panel_35.add(zNoneOtLabel);

		final JPanel panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBackground(Color.WHITE);
		panel_36.setPreferredSize(new Dimension(840, 200));
		add(panel_36);

		final JPanel panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_37.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_37.setLayout(null);
		panel_37.setBounds(0, 0, 840, 45);
		panel_36.add(panel_37);

		final JLabel g0900FunctionalRehabilitationLabel = new JLabel();
		g0900FunctionalRehabilitationLabel
				.setText("<html><body><b>G0900. Functional rehabilitation Potential </b><br>Complete only if A0310A = 01");
		g0900FunctionalRehabilitationLabel.setBounds(10, 10, 393, 25);
		panel_37.add(g0900FunctionalRehabilitationLabel);

		final JPanel panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_38.setLayout(null);
		panel_38.setBackground(Color.WHITE);
		panel_38.setBounds(0, 45, 70, 155);
		panel_36.add(panel_38);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setText("Enter code");
		enterCodeLabel_1.setBounds(10, 20, 58, 14);
		panel_38.add(enterCodeLabel_1);

		final JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		comboBox_8.setBackground(Color.WHITE);
		comboBox_8.setBounds(12, 38, 50, 20);
		panel_38.add(comboBox_8);

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

		final JPanel panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_39.setLayout(null);
		panel_39.setBackground(Color.WHITE);
		panel_39.setBounds(70, 44, 770, 90);
		panel_36.add(panel_39);

		final JLabel aResidentBelievesLabel = new JLabel();
		aResidentBelievesLabel
				.setText("<html><body><b>A. Resident believes he or she is capable of increased independence </b> in at least some ADLs");
		aResidentBelievesLabel.setBounds(10, 10, 532, 14);
		panel_39.add(aResidentBelievesLabel);

		final JLabel label_6 = new JLabel();
		label_6.setText("<html><body>0.<b> No </b>");
		label_6.setBounds(25, 30, 54, 14);
		panel_39.add(label_6);

		final JLabel label_7 = new JLabel();
		label_7.setText("<html><body>1.<b>Yes </b>");
		label_7.setBounds(25, 50, 54, 14);
		panel_39.add(label_7);

		final JLabel label_8 = new JLabel();
		label_8.setText("<html><body>9. <b> Unable to determine </b>");
		label_8.setBounds(25, 68, 139, 14);
		panel_39.add(label_8);

		final JPanel panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_40.setLayout(null);
		panel_40.setBackground(Color.WHITE);
		panel_40.setBounds(70, 134, 770, 65);
		panel_36.add(panel_40);

		final JLabel bDirectCareLabel = new JLabel();
		bDirectCareLabel
				.setText("<html><body><b>B. Direct care staff believe residents is capable of increased independence </b> in at least some ADLs");
		bDirectCareLabel.setBounds(10, 10, 599, 14);
		panel_40.add(bDirectCareLabel);

		final JLabel label_9 = new JLabel();
		label_9.setText("<html><body>0. <b> No </b>");
		label_9.setBounds(20, 26, 54, 14);
		panel_40.add(label_9);

		final JLabel label_10 = new JLabel();
		label_10.setText("<html><body>1.<b> Yes </b>");
		label_10.setBounds(20, 42, 54, 14);
		panel_40.add(label_10);
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
		PanelMDS3Page15 panel = new PanelMDS3Page15();
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
