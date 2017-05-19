package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

import com.toedter.calendar.JDateChooser;

public class PanelMds3Page23 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8944247364338641614L;

	public PanelMds3Page23() {
		super();
		setFont(new Font("", Font.BOLD, 14));
		setOpaque(true);
		setLayout(null);
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		// setFont(new Font("", Font.PLAIN, 11));
		setBackground(Color.WHITE);
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
		panel_5.setBounds(0, 77, 840, 50);
		panel_5.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setVgap(10);
		panel_5.setLayout(flowLayout_8);
		panel_5.setPreferredSize(new Dimension(840, 50));
		add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_5.add(panel_6);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setLayout(null);
		panel_6.setPreferredSize(new Dimension(820, 30));

		final JLabel reportBasedOnLabel = new JLabel();
		reportBasedOnLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reportBasedOnLabel.setFont(new Font("Arial", Font.BOLD, 12));
		reportBasedOnLabel
				.setText("Report Based on highest Stage of existing Ulcer(s) at its worst; do not \"reverse\" stage");
		reportBasedOnLabel.setBounds(10, 0, 800, 24);
		panel_6.add(reportBasedOnLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 132, 840, 120);
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setPreferredSize(new Dimension(840, 120));
		add(panel_7);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_8.setBounds(0, 0, 840, 20);
		panel_7.add(panel_8);

		final JLabel m0100DeterminationOfLabel = new JLabel();
		m0100DeterminationOfLabel.setFont(new Font("Arial", Font.BOLD, 12));
		m0100DeterminationOfLabel
				.setText("M0100. Determination of Pressure Ulcer Risk");
		m0100DeterminationOfLabel.setBounds(10, 0, 493, 20);
		panel_8.add(m0100DeterminationOfLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 20, 840, 20);
		panel_7.add(panel_9);

		final JLabel checkAllThatLabel = new JLabel();
		checkAllThatLabel.setFont(new Font("Arial", Font.BOLD, 12));
		checkAllThatLabel.setBounds(49, 0, 408, 20);
		panel_9.add(checkAllThatLabel);
		checkAllThatLabel.setText("Check all that apply");

		final JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(0, 40, 80, 80);
		panel_7.add(panel_10);

		final JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_11.setBounds(0, 0, 80, 80);
		panel_10.add(panel_11);

		final JCheckBox checkBox_1 = new JCheckBox();
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setBounds(32, 4, 15, 15);
		checkBox_1.setText("");
		panel_11.add(checkBox_1);

		final JCheckBox checkBox_3 = new JCheckBox();
		checkBox_3.setBackground(Color.WHITE);
		checkBox_3.setBounds(32, 42, 15, 15);
		checkBox_3.setText("");
		panel_11.add(checkBox_3);

		final JCheckBox checkBox_2 = new JCheckBox();
		checkBox_2.setBackground(Color.WHITE);
		checkBox_2.setBounds(32, 23, 15, 15);
		checkBox_2.setText("");
		panel_11.add(checkBox_2);

		final JCheckBox checkBox_4 = new JCheckBox();
		checkBox_4.setBackground(Color.WHITE);
		checkBox_4.setBounds(32, 61, 15, 15);
		checkBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		checkBox_4.setText("");
		panel_11.add(checkBox_4);

		final JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(80, 40, 760, 20);
		panel_7.add(panel_12);

		final JLabel aresidentHasALabel = new JLabel();
		aresidentHasALabel.setFont(new Font("Arial", Font.BOLD, 12));
		aresidentHasALabel.setBounds(10, 2, 598, 16);
		aresidentHasALabel
				.setText("A. Resident has a stage 1 or greater , a scar over bony prominence , or a non- removable dressing /device");
		panel_12.add(aresidentHasALabel);

		final JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setBounds(80, 60, 760, 20);
		panel_13.setBackground(Color.WHITE);
		panel_7.add(panel_13);

		final JLabel bFormalAssessmentLabel = new JLabel();
		bFormalAssessmentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		bFormalAssessmentLabel
				.setText("<html><body><b>B.   Formal assessment instrument/tool</b> (e.g Braden,Norton,or other)</body></html>");
		bFormalAssessmentLabel.setBounds(10, 0, 760, 20);
		panel_13.add(bFormalAssessmentLabel);

		final JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setBounds(80, 80, 760, 20);
		panel_14.setBackground(Color.WHITE);
		panel_7.add(panel_14);

		final JLabel cClinicalAssessmentLabel = new JLabel();
		cClinicalAssessmentLabel.setFont(new Font("Arial", Font.BOLD, 12));
		cClinicalAssessmentLabel.setText("C. Clinical assessment");
		cClinicalAssessmentLabel.setBounds(10, 0, 760, 20);
		panel_14.add(cClinicalAssessmentLabel);

		final JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setBounds(80, 100, 760, 20);
		panel_15.setBackground(Color.WHITE);
		panel_7.add(panel_15);

		final JLabel dNoneOfLabel = new JLabel();
		dNoneOfLabel.setFont(new Font("Arial", Font.BOLD, 12));
		dNoneOfLabel.setText("D.  None of the above");
		dNoneOfLabel.setBounds(10, 0, 760, 20);
		panel_15.add(dNoneOfLabel);

		final JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBounds(0, 252, 840, 70);
		add(panel_16);

		final JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBounds(0, 0, 840, 20);
		panel_17.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_16.add(panel_17);

		final JLabel m0150RiskOfLabel = new JLabel();
		m0150RiskOfLabel.setBorder(new LineBorder(Color.black, 1, false));
		m0150RiskOfLabel.setBackground(ColorConstants.MDS_BACK_COLOR);
		m0150RiskOfLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		m0150RiskOfLabel.setText("   M0150. Risk of Pressure Ulcers");
		m0150RiskOfLabel.setBounds(0, 0, 840, 20);
		panel_17.add(m0150RiskOfLabel);

		final JPanel panel_18 = new JPanel();
		panel_18.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_18.setFont(new Font("", Font.PLAIN, 11));
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setLayout(null);
		panel_18.setBounds(0, 20, 80, 50);
		panel_16.add(panel_18);

		final JLabel enterCodeLabel = new JLabel();
		enterCodeLabel.setFont(new Font("", Font.BOLD, 11));
		enterCodeLabel.setText("Enter Code ");
		enterCodeLabel.setBounds(10, 0, 66, 20);
		panel_18.add(enterCodeLabel);

		final JTextField textField_2 = new JTextField();
		textField_2.setBounds(30, 22, 20, 20);
		panel_18.add(textField_2);

		final JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.WHITE);
		panel_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_19.setLayout(null);
		panel_19.setBounds(80, 20, 760, 50);
		panel_16.add(panel_19);

		final JLabel isThisResidentLabel = new JLabel();
		isThisResidentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		isThisResidentLabel
				.setText("<html><body><b>   Is this resident at risk of developing pressure ulcers?</b> <br> &nbsp &nbsp 0.<b>No</b><br> &nbsp &nbsp 1.<b>Yes</b>");
		isThisResidentLabel.setBounds(10, 0, 760, 50);
		panel_19.add(isThisResidentLabel);

		final JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(Color.black, 1, false));
		panel_20.setLayout(null);
		panel_20.setBounds(0, 322, 840, 70);
		add(panel_20);

		final JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_21.setLayout(null);
		panel_21.setBounds(0, 0, 840, 20);
		panel_21.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_21);

		final JLabel m0210RiskOfLabel = new JLabel();
		m0210RiskOfLabel.setBorder(new LineBorder(Color.black, 1, false));
		m0210RiskOfLabel.setBackground(ColorConstants.MDS_BACK_COLOR);
		m0210RiskOfLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		m0210RiskOfLabel.setText("   M0210. Unhealed Pressure Ulcers(s)");
		m0210RiskOfLabel.setBounds(0, 0, 840, 20);
		panel_21.add(m0210RiskOfLabel);

		final JPanel panel_22 = new JPanel();
		panel_22.setFont(new Font("", Font.PLAIN, 11));
		panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setLayout(null);
		panel_22.setBounds(0, 20, 80, 50);
		panel_22.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_20.add(panel_22);

		final JTextField textField_3 = new JTextField();
		textField_3.setBounds(30, 22, 20, 20);
		panel_22.add(textField_3);

		final JLabel enterCodeLabel_1 = new JLabel();
		enterCodeLabel_1.setBackground(UIManager.getColor("Button.background"));
		enterCodeLabel_1.setFont(new Font("", Font.BOLD, 11));
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 2, 66, 20);
		panel_22.add(enterCodeLabel_1);

		final JPanel panel_23 = new JPanel();
		panel_23.setBackground(Color.WHITE);
		panel_23.setBorder(new LineBorder(Color.black, 1, false));
		panel_23.setLayout(null);
		panel_23.setBounds(80, 20, 760, 50);
		panel_20.add(panel_23);

		final JLabel doesThisResidentLabel = new JLabel();
		doesThisResidentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		doesThisResidentLabel
				.setText("<html><body><b>Does this resident have one or more unhealed pressure ulcer(s) at Stage 1 or higher></b>");
		doesThisResidentLabel.setBounds(10, 0, 750, 16);
		panel_23.add(doesThisResidentLabel);

		final JLabel label_2 = new JLabel();
		label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2
				.setText("<html><body> &nbsp 0. <b>No--></b>Skip to M0900, Healed Pressure ulcers <br> &nbsp 1.<b> Yes--> </b>continue to M0300, Current number of Unhealed( non-epithelialized )Pressure Ulcers at each Stage");
		label_2.setBounds(10, 16, 740, 28);
		panel_23.add(label_2);

		final JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(Color.black, 1, false));
		panel_24.setBackground(Color.WHITE);
		panel_24.setLayout(null);
		panel_24.setBounds(0, 392, 840, 450);
		add(panel_24);

		final JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(Color.black, 1, false));
		panel_25.setLayout(null);
		panel_25.setBounds(0, 0, 840, 20);
		panel_25.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_24.add(panel_25);

		final JLabel m0300CurrentNumberLabel = new JLabel();
		m0300CurrentNumberLabel
				.setText("<html><body><b>M0300.  Current Number of Unhealed </b>( non-epithelialized) <b>Pressure Ulcers at Each Stage  </b>");
		m0300CurrentNumberLabel.setBounds(10, 0, 800, 20);
		panel_25.add(m0300CurrentNumberLabel);

		final JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setFont(new Font("", Font.PLAIN, 11));
		panel_26.setBorder(new LineBorder(Color.black, 1, false));
		panel_26.setBounds(0, 20, 80, 430);
		panel_24.add(panel_26);

		final JPanel panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBounds(0, 0, 80, 50);
		panel_31.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_26.add(panel_31);

		final JTextField textField_12 = new JTextField();
		textField_12.setBounds(30, 20, 20, 20);
		panel_31.add(textField_12);

		final JLabel enterNumberLabel = new JLabel();
		enterNumberLabel.setFont(new Font("", Font.BOLD, 11));
		enterNumberLabel.setText("Enter Number");
		enterNumberLabel.setBounds(2, 0, 76, 20);
		panel_31.add(enterNumberLabel);

		final JPanel panel_32 = new JPanel();
		panel_32.setLayout(null);
		panel_32.setBounds(0, 50, 80, 180);
		panel_32.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_26.add(panel_32);

		final JTextField textField_13 = new JTextField();
		textField_13.setBounds(30, 46, 20, 20);
		panel_32.add(textField_13);

		final JTextField textField_14 = new JTextField();
		textField_14.setBounds(30, 95, 20, 20);
		panel_32.add(textField_14);

		final JLabel enterNumberLabel_1 = new JLabel();
		enterNumberLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_1.setText("Enter Number");
		enterNumberLabel_1.setBounds(0, 25, 80, 16);
		panel_32.add(enterNumberLabel_1);

		final JLabel enterNumberLabel_2 = new JLabel();
		enterNumberLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_2.setText("Enter Number");
		enterNumberLabel_2.setBounds(0, 75, 80, 16);
		panel_32.add(enterNumberLabel_2);

		final JPanel panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBounds(0, 230, 80, 100);
		panel_33.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_26.add(panel_33);

		final JTextField textField_15 = new JTextField();
		textField_15.setBounds(30, 24, 20, 20);
		panel_33.add(textField_15);

		final JTextField textField_16 = new JTextField();
		textField_16.setBounds(30, 70, 20, 20);
		panel_33.add(textField_16);

		final JLabel enterNumberLabel_3 = new JLabel();
		enterNumberLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_3.setText("Enter Number");
		enterNumberLabel_3.setBounds(0, 5, 80, 16);
		panel_33.add(enterNumberLabel_3);

		final JLabel enterNumberLabel_4 = new JLabel();
		enterNumberLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_4.setText("Enter Number");
		enterNumberLabel_4.setBounds(0, 50, 80, 16);
		panel_33.add(enterNumberLabel_4);

		final JPanel panel_34 = new JPanel();
		panel_34.setLayout(null);
		panel_34.setBounds(0, 330, 80, 100);
		panel_34.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_26.add(panel_34);

		final JTextField textField_17 = new JTextField();
		textField_17.setBounds(30, 23, 20, 20);
		panel_34.add(textField_17);

		final JTextField textField_18 = new JTextField();
		textField_18.setBounds(30, 70, 20, 20);
		panel_34.add(textField_18);

		final JLabel enterNumberLabel_5 = new JLabel();
		enterNumberLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_5.setText("Enter Number");
		enterNumberLabel_5.setBounds(0, 5, 80, 16);
		panel_34.add(enterNumberLabel_5);

		final JLabel enterNumberLabel_6 = new JLabel();
		enterNumberLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		enterNumberLabel_6.setText("Enter Number");
		enterNumberLabel_6.setBounds(0, 49, 80, 16);
		panel_34.add(enterNumberLabel_6);

		final JPanel panel_27 = new JPanel();
		panel_27.setBackground(Color.WHITE);
		panel_27.setBorder(new LineBorder(Color.black, 1, false));
		panel_27.setLayout(null);
		panel_27.setBounds(80, 20, 760, 50);
		panel_24.add(panel_27);

		final JLabel aNumberLabel = new JLabel();
		aNumberLabel.setBackground(Color.WHITE);
		aNumberLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aNumberLabel
				.setText("<html><body><b> A.  Number of stage 1 pressure ulcers<br>&nbsp &nbsp Stage 1:</b> Intact skin with non-blanchable redness of a localized area usually over a bony prominence. Darkly pigmented skin may not <br>&nbsp &nbsp have a visible blanching ;in dark skin tones only it may appear with persistent blue or purple hues.");
		aNumberLabel.setBounds(10, 2, 750, 46);
		panel_27.add(aNumberLabel);

		final JPanel panel_28 = new JPanel();
		panel_28.setBackground(Color.WHITE);
		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setLayout(null);
		panel_28.setBounds(80, 70, 760, 180);
		panel_24.add(panel_28);

		final JLabel stage2partialThicknessLabel = new JLabel();
		stage2partialThicknessLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		stage2partialThicknessLabel
				.setText("<html><body><b>B. Stage 2:</b>Partial thickness loss of dermis presenting as a shallow open ulcer with a red or pink wound  bed ,without slough .May also <br> &nbsp present as an intact or open /ruptured blister <br><br> &nbsp &nbsp <b> 1. Number of Stage 2 pressure ulcers- </b> if 0  Skip to M0300C,Stage 3 <br><br><b> &nbsp &nbsp 2. Number of these Stage 2 pressure ulcers that were present upon admission/reentry-</b>enter how many were noted at the time of <br> <&nbsp &nbsp &nbsp &nbsp admission <br> <b> &nbsp &nbsp 3. Date of oldest Stage 2 pressure ulcer -</b> Enter dashes if date is unknown:<br> ");
		stage2partialThicknessLabel.setBounds(10, 4, 750, 120);
		panel_28.add(stage2partialThicknessLabel);

		final JTextField textField_4 = new JTextField();
		textField_4.setBounds(40, 130, 30, 20);
		panel_28.add(textField_4);

		final JTextField textField_5 = new JTextField();
		textField_5.setBounds(70, 130, 30, 20);
		panel_28.add(textField_5);

		final JTextField textField_6 = new JTextField();
		textField_6.setBounds(120, 130, 30, 20);
		panel_28.add(textField_6);

		final JTextField textField_7 = new JTextField();
		textField_7.setBounds(150, 130, 30, 20);
		panel_28.add(textField_7);

		final JTextField textField_8 = new JTextField();
		textField_8.setBounds(200, 130, 30, 20);
		panel_28.add(textField_8);

		final JTextField textField_9 = new JTextField();
		textField_9.setBounds(230, 130, 30, 20);
		panel_28.add(textField_9);

		final JTextField textField_10 = new JTextField();
		textField_10.setBounds(260, 130, 30, 20);
		panel_28.add(textField_10);

		final JTextField textField_11 = new JTextField();
		textField_11.setBounds(290, 130, 30, 20);
		panel_28.add(textField_11);

		final JLabel monthLabel = new JLabel();
		monthLabel.setFont(new Font("", Font.PLAIN, 11));
		monthLabel.setText("Month");
		monthLabel.setBounds(50, 155, 66, 16);
		panel_28.add(monthLabel);

		final JLabel yearLabel = new JLabel();
		yearLabel.setFont(new Font("", Font.PLAIN, 11));
		yearLabel.setText("Year");
		yearLabel.setBounds(250, 155, 66, 16);
		panel_28.add(yearLabel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("", Font.PLAIN, 11));
		dateLabel.setText("Day");
		dateLabel.setBounds(140, 155, 66, 16);
		panel_28.add(dateLabel);

		final JLabel label = new JLabel();
		label.setFont(new Font("", Font.BOLD, 16));
		label.setText("-");
		label.setBounds(110, 135, 10, 10);
		panel_28.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("", Font.BOLD, 14));
		label_1.setText("-");
		label_1.setBounds(185, 135, 10, 10);
		panel_28.add(label_1);

		final JPanel panel_29 = new JPanel();
		panel_29.setBackground(Color.WHITE);
		panel_29.setFont(new Font("", Font.PLAIN, 11));
		panel_29.setLayout(null);
		panel_29.setBorder(new LineBorder(Color.black, 1, false));
		panel_29.setBounds(80, 250, 760, 100);
		panel_24.add(panel_29);

		final JLabel cStage3Label = new JLabel();
		cStage3Label.setFont(new Font("Arial", Font.PLAIN, 12));
		cStage3Label
				.setText("<html><body><b>C. Stage 3:</b>Full thickness tissue loss. Subcutaneous fat may be visible but bone, tendon or muscle is not exposed. <br> Slough may be present but does not obscure the depth of tissue loss.May include undermining and tunneling. <br> <b> &nbsp &nbsp 1. Number of Stage 3 pressure ulcers -</b> if 0 --> Skip to M0300D,Stage 4 <br> &nbsp &nbsp <b> 2.Number of these Stage 3 pressure ulcers that were present ulcers upon admission/reentry-</b> entry how many were noted at the time of admission ");
		cStage3Label.setBounds(10, 5, 750, 90);
		panel_29.add(cStage3Label);

		final JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(Color.black, 1, false));
		panel_30.setBackground(Color.WHITE);
		panel_30.setLayout(null);
		panel_30.setBounds(80, 350, 760, 100);
		panel_24.add(panel_30);

		final JLabel cStage4Label = new JLabel();
		cStage4Label.setFont(new Font("Arial", Font.PLAIN, 12));
		cStage4Label
				.setText("<html><body><b>D. Stage 4:</b> Full thickness tissue loss with exposed bone, tendon or muscle.Slough or eschar may be present on some parts of the wound bed.often includes undermining and tunneling. <br> <b> &nbsp &nbsp 1. Number of Stage 4 pressure ulcers -</b> if 0 --> Skip to M0300E,Unstageale :Non -removable dressing <br> &nbsp &nbsp <b> 2.Number of these Stage 4 pressure ulcers that were present ulcers upon admission/reentry-</b> entry how many were noted at the <br>time of admission ");
		cStage4Label.setBounds(10, 5, 750, 90);
		panel_30.add(cStage4Label);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel.setBounds(0, 840, 840, 30);
		add(panel);

		final JLabel m0300ContinuedOnLabel = new JLabel();
		m0300ContinuedOnLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		m0300ContinuedOnLabel.setText("M0300 Continued on next page");
		m0300ContinuedOnLabel.setBounds(10, 2, 830, 26);
		panel.add(m0300ContinuedOnLabel);
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
		PanelMds3Page23 panel = new PanelMds3Page23();
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
