package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

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

import com.toedter.calendar.JDateChooser;

public class PanelMds3Page24 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2247269494454652227L;

	public PanelMds3Page24() {
		super();
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
		panel_2.setBounds(0, 47, 840, 25);
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
		sectionALabel.setText("Section M");
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
		identificationInformationLabel.setText("Skin Conditions");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 72, 840, 400);
		add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 840, 20);
		panel_6.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5.add(panel_6);

		final JLabel m0300CurrentNumberLabel = new JLabel();
		m0300CurrentNumberLabel
				.setText("<html><body><b>M0300.  Current Number of Unhealed </b>( non-epithelialized) <b>Pressure Ulcers at Each Stage</b> -Continued </b>");
		m0300CurrentNumberLabel.setFont(new Font("Arial", Font.BOLD, 12));
		m0300CurrentNumberLabel.setBounds(10, 0, 800, 20);
		panel_6.add(m0300CurrentNumberLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setFont(new Font("", Font.PLAIN, 11));
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBounds(0, 20, 80, 430);
		panel_5.add(panel_7);

		final JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(0, 0, 80, 130);
		panel_11.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7.add(panel_11);

		final JTextField txtM0300E1 = new JTextField();
		txtM0300E1.setBounds(30, 46, 20, 20);
		panel_11.add(txtM0300E1);

		final JTextField txtM0300E2 = new JTextField();
		txtM0300E2.setBounds(30, 95, 20, 20);
		panel_11.add(txtM0300E2);

		final JLabel enterNumberLabel_1 = new JLabel();
		enterNumberLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_1.setText("Enter Number");
		enterNumberLabel_1.setBounds(0, 25, 80, 16);
		panel_11.add(enterNumberLabel_1);

		final JLabel enterNumberLabel_2 = new JLabel();
		enterNumberLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_2.setText("Enter Number");
		enterNumberLabel_2.setBounds(0, 75, 80, 16);
		panel_11.add(enterNumberLabel_2);

		final JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(0, 130, 80, 125);
		panel_12.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7.add(panel_12);

		final JTextField txtM0300F1 = new JTextField();
		txtM0300F1.setBounds(30, 24, 20, 20);
		panel_12.add(txtM0300F1);

		final JTextField txtM0300F2 = new JTextField();
		txtM0300F2.setBounds(30, 70, 20, 20);
		panel_12.add(txtM0300F2);

		final JLabel enterNumberLabel_3 = new JLabel();
		enterNumberLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_3.setText("Enter Number");
		enterNumberLabel_3.setBounds(0, 5, 80, 16);
		panel_12.add(enterNumberLabel_3);

		final JLabel enterNumberLabel_4 = new JLabel();
		enterNumberLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_4.setText("Enter Number");
		enterNumberLabel_4.setBounds(0, 50, 80, 16);
		panel_12.add(enterNumberLabel_4);

		final JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(0, 255, 80, 125);
		panel_13.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7.add(panel_13);

		final JTextField txtM0300G1 = new JTextField();
		txtM0300G1.setBounds(30, 23, 20, 20);
		panel_13.add(txtM0300G1);

		final JTextField txtM0300G2 = new JTextField();
		txtM0300G2.setBounds(30, 70, 20, 20);
		panel_13.add(txtM0300G2);

		final JLabel enterNumberLabel_5 = new JLabel();
		enterNumberLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_5.setText("Enter Number");
		enterNumberLabel_5.setBounds(0, 5, 80, 16);
		panel_13.add(enterNumberLabel_5);

		final JLabel enterNumberLabel_6 = new JLabel();
		enterNumberLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_6.setText("Enter Number");
		enterNumberLabel_6.setBounds(0, 49, 80, 16);
		panel_13.add(enterNumberLabel_6);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBounds(80, 20, 760, 130);
		panel_5.add(panel_8);

		final JLabel stage2partialThicknessLabel = new JLabel();
		stage2partialThicknessLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		stage2partialThicknessLabel
				.setText("<html><body><b>E. Unstageable -Non-removable dressing: </b>Known but not stageable due to non-removable dressing/device <br><br> &nbsp &nbsp <b> 1. Number of Unstageable pressure ulcers due to non -removable dressing /device- </b> if 0  Skip to M0300F,Unstageable. <br> &nbsp &nbsp Slough and/or eschar <br><b> &nbsp &nbsp 2. Number of these unstageable pressure ulcers that were present upon admission/reentry-</b> enter how many were noted at the <br> &nbsp &nbsp time of admission ");
		stage2partialThicknessLabel.setBounds(10, 10, 750, 110);
		panel_8.add(stage2partialThicknessLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setFont(new Font("", Font.PLAIN, 11));
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBounds(80, 150, 760, 125);
		panel_5.add(panel_9);

		final JLabel cStage3Label = new JLabel();
		cStage3Label.setFont(new Font("Arial", Font.PLAIN, 12));
		cStage3Label
				.setText("<html><body><b>F. Unstageable-Slough and /or eschar:</b>Known but not stageable due to coverage of wound bed by slough and/or eschar<br> <br> <b> &nbsp &nbsp 1. Number of Unstageable pressure ulcers due to coverage of wound bed by slough and /or eschar-</b> if 0 --> Skip to M0300G,<br> &nbsp &nbsp Unstageable :Deep tissue <br> &nbsp &nbsp <b> 2.Number of these Unstageable pressure ulcers that were present ulcers upon admission/reentry-</b> entry how many were noted at <br> &nbsp &nbsp the time of admission ");
		cStage3Label.setBounds(10, 10, 750, 110);
		panel_9.add(cStage3Label);

		final JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(80, 275, 760, 125);
		panel_5.add(panel_10);

		final JLabel cStage4Label = new JLabel();
		cStage4Label.setFont(new Font("Arial", Font.PLAIN, 12));
		cStage4Label
				.setText("<html><body><b>G.Unstageable -Deep tissue:</b> Suspected deep tissue injury in evolution <br> <br> <b> &nbsp &nbsp 1. Number of Unstageable pressure ulcers with suspected deep tissue injury in evolution -</b> if 0 --> Skip to M0610,Dimension </br> &nbsp &nbsp of Unhealed Stage 3 or 4 Pressure Ulcers or Eschar <br> &nbsp &nbsp <b> 2.Number of these Unstageable pressure ulcers that were present ulcers upon admission/reentry-</b> entry how many were noted at <br> &nbsp &nbsp the time of admission ");
		cStage4Label.setBounds(10, 10, 750, 110);
		panel_10.add(cStage4Label);

		final JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setBounds(0, 470, 840, 35);
		panel_14.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_14.setLayout(null);
		panel_14.setPreferredSize(new Dimension(840, 25));
		add(panel_14);

		final JLabel m0610DimensionsOfLabel = new JLabel();
		m0610DimensionsOfLabel
				.setText("<html><body><b>M0610. Dimensions of Unhealed Stage 3 or 4 Pressure Ulcers or Eschar</b><br>Complete only if M0300C1,M0300D1 or M0300F1 is greater than 0");
		m0610DimensionsOfLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		m0610DimensionsOfLabel.setBounds(10, 2, 820, 30);
		panel_14.add(m0610DimensionsOfLabel);

		final JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setBounds(0, 505, 840, 35);
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setPreferredSize(new Dimension(840, 25));
		add(panel_15);

		final JLabel label_3 = new JLabel();
		label_3
				.setText("<html><body>If the resident has one or more unhealed (non-epithelialized) stage 3 or 4 pressure ulcers or an unstageable pressure ulcer due to slough or eschar,<br>identify the pressure ulcer with the largest surface area (length x width) and record in centimeters ");
		label_3.setBounds(10, 0, 830, 30);
		panel_15.add(label_3);

		final JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBounds(0, 690, 840, 20);
		panel_20.setBackground(ColorConstants.MDS_BACK_COLOR);
		add(panel_20);

		final JLabel label_7 = new JLabel();
		label_7.setFont(new Font("", Font.BOLD, 11));
		label_7
				.setText("M0700. Most Severe Tissue Type for Any Pressure Ulcer ");
		label_7.setBounds(10, 0, 800, 20);
		panel_20.add(label_7);

		final JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(0, 710, 840, 100);
		add(panel_21);

		final JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setBounds(0, 0, 80, 100);
		panel_22.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_21.add(panel_22);

		final JTextField txtM0700 = new JTextField();
		txtM0700.setBounds(30, 47, 20, 20);
		panel_22.add(txtM0700);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(10, 25, 66, 16);
		panel_22.add(enterCodeLabel);

		final JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBounds(80, 0, 760, 100);
		panel_19.setBackground(Color.WHITE);
		panel_21.add(panel_19);

		final JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Arial", Font.PLAIN, 12));
		label_5
				.setText("<html><body>Select the best description of the most severe type of tissue present in any pressure ulcer bed<br> &nbsp &nbsp <b>1. Epithelial tissue -</b> new skin growing in superficial ulcer. it can be light pink and shiny, even in person with darkly pigmented skin <br> &nbsp &nbsp <b> 2. Granulation tissue </b>- pink or red tissue with shiny ,moist ,granular appearence <br> &nbsp &nbsp <b> 3. Slough </b>- yellow or white tissue that address to the ulcer bed in strings or thick clumps, or is mucinous <br> &nbsp &nbsp <b> 4. Necrotic tissue (Eschar) </b>-black,brown,or tan tissue that adheres firmly to the wound bed or ulcer edgs,may be softer or harder <br> &nbsp &nbsp &nbsp than surrounding skin  ");
		label_5.setBounds(10, 10, 750, 90);
		panel_19.add(label_5);

		final JPanel panel_23 = new JPanel();
		panel_23.setLayout(null);
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setBounds(0, 810, 840, 30);
		panel_23.setBackground(ColorConstants.MDS_BACK_COLOR);
		add(panel_23);

		final JLabel m0800WorseningLabel = new JLabel();
		m0800WorseningLabel.setFont(new Font("Arial", Font.BOLD, 12));
		m0800WorseningLabel
				.setText("<html><body><b> M0800. Worsening in Pressure Ulcer Status Since Prior Assessment (OBRA,PPS,or Discharge) </b> <br> Complete only if A0310E=0  ");
		m0800WorseningLabel.setFont(new Font("", Font.PLAIN, 11));
		m0800WorseningLabel.setBounds(10, 4, 830, 25);
		panel_23.add(m0800WorseningLabel);

		final JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setLayout(null);
		panel_24.setBounds(0, 840, 840, 30);
		panel_24.setBackground(Color.WHITE);
		add(panel_24);

		final JLabel label_6 = new JLabel();
		label_6.setBounds(8, 3, 800, 25);
		panel_24.add(label_6);
		label_6.setFont(new Font("Arial", Font.PLAIN, 12));
		label_6
				.setText("<html><body>Indicate the number of current pressure ulcers that were <b> not present or were at lesser stage </b> on prior assessment (OBRA,PPS or Discharge) <br> if no current pressure ulcer at a given stage, enter 0 ");

		final JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setBounds(0, 869, 840, 150);
		panel_25.setBackground(Color.WHITE);
		add(panel_25);

		final JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBounds(0, 0, 80, 50);
		panel_26.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_25.add(panel_26);

		final JTextField txtM0800A = new JTextField();
		txtM0800A.setBounds(30, 25, 20, 20);
		panel_26.add(txtM0800A);

		final JLabel enterNumberLabel = new JLabel();
		enterNumberLabel.setText("Enter Number");
		enterNumberLabel.setBounds(10, 5, 80, 16);
		panel_26.add(enterNumberLabel);

		final JPanel panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBounds(80, 0, 760, 50);
		panel_27.setBackground(Color.WHITE);
		panel_25.add(panel_27);

		final JLabel label_8 = new JLabel();
		label_8.setFont(new Font("Arial", Font.BOLD, 12));
		label_8.setText("A.   Stage 2");
		label_8.setBounds(15, 15, 112, 25);
		panel_27.add(label_8);

		final JPanel panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBounds(80, 50, 760, 50);
		panel_28.setBackground(Color.WHITE);
		panel_25.add(panel_28);

		final JLabel label_9 = new JLabel();
		label_9.setFont(new Font("Arial", Font.BOLD, 12));
		label_9.setText("B.   Stage 3");
		label_9.setBounds(15, 15, 119, 25);
		panel_28.add(label_9);

		final JPanel panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_29.setBounds(80, 100, 760, 50);
		panel_29.setBackground(Color.WHITE);
		panel_25.add(panel_29);

		final JLabel label_10 = new JLabel();
		label_10.setFont(new Font("Arial", Font.BOLD, 12));
		label_10.setText("C.   Stage 4");
		label_10.setBounds(15, 15, 141, 25);
		panel_29.add(label_10);

		final JPanel panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBounds(0, 50, 80, 50);
		panel_31.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_25.add(panel_31);

		final JLabel enterNumberLabel_7 = new JLabel();
		enterNumberLabel_7.setBounds(10, 0, 120, 30);
		panel_31.add(enterNumberLabel_7);
		enterNumberLabel_7.setText("Enter Number");

		final JTextField txtM0800B = new JTextField();
		txtM0800B.setBounds(30, 25, 20, 20);
		panel_31.add(txtM0800B);

		final JPanel panel_32 = new JPanel();
		panel_32.setLayout(null);
		panel_32.setBounds(0, 100, 80, 50);
		panel_32.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_25.add(panel_32);

		final JTextField txtM0800C = new JTextField();
		txtM0800C.setBounds(30, 27, 20, 20);
		panel_32.add(txtM0800C);

		final JLabel enterNumberLabel_8 = new JLabel();
		enterNumberLabel_8.setText("Enter Number");
		enterNumberLabel_8.setBounds(10, 0, 80, 25);
		panel_32.add(enterNumberLabel_8);

		final JPanel panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(Color.black, 1, false));
		panel_35.setLayout(null);
		panel_35.setBounds(0, 540, 840, 150);
		add(panel_35);

		final JPanel panel_34 = new JPanel();
		panel_34.setBounds(0, 0, 80, 50);
		panel_35.add(panel_34);
		panel_34.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_34.setLayout(null);

		final JLabel cmLabel_2 = new JLabel();
		cmLabel_2.setBounds(67, 15, 13, 20);
		panel_34.add(cmLabel_2);
		cmLabel_2.setText("cm");

		final JTextField txtM0610A1 = new JTextField();
		txtM0610A1.setBounds(3, 15, 20, 20);
		panel_34.add(txtM0610A1);

		final JTextField txtM0610A2 = new JTextField();
		txtM0610A2.setBounds(23, 15, 20, 20);
		panel_34.add(txtM0610A2);

		final JLabel label_2 = new JLabel();
		label_2.setBounds(43, 15, 5, 20);
		panel_34.add(label_2);
		label_2.setFont(new Font("", Font.BOLD, 14));
		label_2.setText(".");

		final JTextField txtM0610A3 = new JTextField();
		txtM0610A3.setBounds(47, 15, 20, 20);
		panel_34.add(txtM0610A3);

		final JPanel panel_33 = new JPanel();
		panel_33.setBounds(0, 50, 80, 50);
		panel_33.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_35.add(panel_33);
		panel_33.setLayout(null);

		final JTextField txtM0610B1 = new JTextField();
		txtM0610B1.setBounds(3, 15, 20, 20);
		panel_33.add(txtM0610B1);

		final JTextField txtM0610B2 = new JTextField();
		txtM0610B2.setBounds(23, 15, 20, 20);
		panel_33.add(txtM0610B2);

		final JLabel label_1 = new JLabel();
		label_1.setBounds(42, 15, 5, 20);
		panel_33.add(label_1);
		label_1.setFont(new Font("", Font.BOLD, 14));
		label_1.setText(".");

		final JTextField txtM0610B3 = new JTextField();
		txtM0610B3.setBounds(47, 15, 20, 20);
		panel_33.add(txtM0610B3);

		final JLabel cmLabel_1 = new JLabel();
		cmLabel_1.setBounds(67, 15, 13, 20);
		panel_33.add(cmLabel_1);
		cmLabel_1.setText("cm");

		final JPanel panel = new JPanel();
		panel.setBounds(0, 100, 80, 50);
		panel_35.add(panel);
		panel.setLayout(null);
		panel.setBackground(ColorConstants.MDS_BACK_COLOR);

		final JTextField txtM0610C1 = new JTextField();
		txtM0610C1.setBounds(3, 15, 20, 20);
		panel.add(txtM0610C1);

		final JTextField txtM0610C2 = new JTextField();
		txtM0610C2.setBounds(23, 15, 20, 20);
		panel.add(txtM0610C2);

		final JLabel label = new JLabel();
		label.setFont(new Font("", Font.BOLD, 14));
		label.setText(".");
		label.setBounds(42, 15, 5, 16);
		panel.add(label);

		final JTextField txtM0610C3 = new JTextField();
		txtM0610C3.setBounds(46, 15, 20, 20);
		panel.add(txtM0610C3);

		final JLabel cmLabel = new JLabel();
		cmLabel.setText("cm");
		cmLabel.setBounds(67, 15, 13, 16);
		panel.add(cmLabel);

		final JPanel panel_16 = new JPanel();
		panel_16.setBounds(80, 0, 760, 50);
		panel_35.add(panel_16);
		panel_16.setLayout(null);
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setBackground(Color.WHITE);

		final JLabel label_4 = new JLabel();
		label_4
				.setText("<html><body><b>  A.  Pressure ulcer length: </b>Longest length fromhead to toe ");
		label_4.setFont(new Font("Arial", Font.PLAIN, 12));
		label_4.setBounds(10, 10, 500, 40);
		panel_16.add(label_4);

		final JPanel panel_17 = new JPanel();
		panel_17.setBounds(80, 50, 760, 50);
		panel_35.add(panel_17);
		panel_17.setLayout(null);
		panel_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_17.setBackground(Color.WHITE);

		final JLabel bPressureUlcerLabel = new JLabel();
		bPressureUlcerLabel
				.setText("<html><body><b>B.  Pressure ulcer width: </b>Widest width of the same pressurulcer, side to side prependicular (90-degree angle) to length");
		bPressureUlcerLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bPressureUlcerLabel.setBounds(10, 10, 670, 40);
		panel_17.add(bPressureUlcerLabel);

		final JPanel panel_18 = new JPanel();
		panel_18.setBounds(80, 100, 760, 50);
		panel_35.add(panel_18);
		panel_18.setLayout(null);
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setBackground(Color.WHITE);

		final JLabel cPressureUlcerLabel = new JLabel();
		cPressureUlcerLabel
				.setText("<html><body><b>C.  Pressure ulcer depth :</b> depth of same pressure ulcer from the visible surface to the deepest area (if depth is unknown <br>,&nbsp &nbsp enter a dash in each box) ");
		cPressureUlcerLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		cPressureUlcerLabel.setBounds(10, 10, 670, 40);
		panel_18.add(cPressureUlcerLabel);

	}

	public static void main(String args[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JScrollPane scroller = new JScrollPane();
		PanelMds3Page24 panel = new PanelMds3Page24();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

	}
}
