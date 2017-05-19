package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA0310 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1574534801244350108L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbFederalObraReasonForAssessment;

	public PanelA0310() {
		super();
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 820));
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setOpaque(false);
		panel.setLayout(null);
		// panel.setBounds(0, 0, 840, 820);
		add(panel);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, 0, 840, 25);
		panel.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1.setText("A0310. Type of Assessment");
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1.setBounds(0, 24, 80, 775);
		panel.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(16, 9, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbFederalObraReasonForAssessment = new JxComboBox();
		cmbFederalObraReasonForAssessment.setTheme(theme);
		cmbFederalObraReasonForAssessment.setBounds(10, 30, 50, 20);

		cmbFederalObraReasonForAssessment
				.setModel(new DefaultComboBoxModel(new String[] { " ", "01",
						"02", "03", "04", "05", "06", "99" }));
		cmbFederalObraReasonForAssessment
				.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbFederalObraReasonForAssessment);

		final JxLabel enterCodeLabel_1_1 = new JxLabel();
		enterCodeLabel_1_1.setTheme(theme);
		enterCodeLabel_1_1.setText("Enter Code");
		enterCodeLabel_1_1.setBounds(15, 190, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1);

		final JxComboBox comboBox_1_1 = new JxComboBox();
		comboBox_1_1.setTheme(theme);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));

		comboBox_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1.setBounds(15, 210, 50, 20);
		panel_6_1_1.add(comboBox_1_1);

		final JxLabel enterCodeLabel_1_1_1 = new JxLabel();
		enterCodeLabel_1_1_1.setTheme(theme);
		enterCodeLabel_1_1_1.setText("Enter Code");
		enterCodeLabel_1_1_1.setBounds(15, 435, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_1);

		final JxComboBox comboBox_1_1_1 = new JxComboBox();
		comboBox_1_1_1.setTheme(theme);
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] { "" }));

		comboBox_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1.setBounds(15, 460, 50, 20);
		panel_6_1_1.add(comboBox_1_1_1);

		final JxLabel enterCodeLabel_1_1_1_1 = new JxLabel();
		enterCodeLabel_1_1_1_1.setTheme(theme);
		enterCodeLabel_1_1_1_1.setText("Enter Code");
		enterCodeLabel_1_1_1_1.setBounds(16, 534, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_1_1);

		final JxLabel enterCodeLabel_1_1_2 = new JxLabel();
		enterCodeLabel_1_1_2.setTheme(theme);
		enterCodeLabel_1_1_2.setText("Enter Code");
		enterCodeLabel_1_1_2.setBounds(16, 595, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_2);

		final JxLabel enterCodeLabel_1_1_3 = new JxLabel();
		enterCodeLabel_1_1_3.setTheme(theme);
		enterCodeLabel_1_1_3.setText("Enter Code");
		enterCodeLabel_1_1_3.setBounds(16, 666, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_3);

		final JxComboBox comboBox_1_1_1_1 = new JxComboBox();
		comboBox_1_1_1_1.setTheme(theme);
		comboBox_1_1_1_1
				.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1_1.setName("");

		comboBox_1_1_1_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1_1.setBounds(15, 550, 50, 20);
		panel_6_1_1.add(comboBox_1_1_1_1);

		final JxComboBox comboBox_1_1_1_2 = new JxComboBox();
		comboBox_1_1_1_2.setTheme(theme);
		comboBox_1_1_1_2
				.setModel(new DefaultComboBoxModel(new String[] { "" }));

		comboBox_1_1_1_2.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1_2.setBounds(15, 620, 50, 20);
		panel_6_1_1.add(comboBox_1_1_1_2);

		final JxComboBox comboBox_1_1_1_3 = new JxComboBox();
		comboBox_1_1_1_3.setTheme(theme);

		comboBox_1_1_1_3
				.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_1_1_1_3.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_1_3.setBounds(15, 685, 50, 20);
		panel_6_1_1.add(comboBox_1_1_1_3);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(79, 24, 761, 172);
		panel.add(panel_7_1_1);

		final JxLabel aNationalProviderLabel_2_1 = new JxLabel();
		aNationalProviderLabel_2_1.setTheme(theme);

		aNationalProviderLabel_2_1.setFontSize(12);
		aNationalProviderLabel_2_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2_1
				.setText("A. Federal OBRA Reason for Assessment");
		aNationalProviderLabel_2_1.setBounds(10, 5, 294, 14);
		panel_7_1_1.add(aNationalProviderLabel_2_1);

		final JxLabel aNationalProviderLabel_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_2_1
				.setText("<html><body>01. <b>Admission</b> assessment (required by day 14)");
		aNationalProviderLabel_1_2_1.setBounds(32, 25, 342, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1
				.setText("<html><body>02. <b>Quarterly</b> review Assessment");
		aNationalProviderLabel_1_1_1_1.setBounds(32, 45, 342, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>03. <b>Annual</b> Assessment");
		aNationalProviderLabel_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_2
				.setText("<html><body>04. <b>Significant change in status</b> assessment");
		aNationalProviderLabel_1_1_1_1_2.setBounds(32, 85, 617, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_3 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_3.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_3.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_3
				.setText("<html><body>05. <b>Significant correction</b> to <b>prior comprehensive</b> assessment");
		aNationalProviderLabel_1_1_1_1_3.setBounds(32, 105, 541, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_3);

		final JxLabel aNationalProviderLabel_1_1_1_1_4 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_4.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_4.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_4
				.setText("<html><body>05. <b>Significant correction</b> to <b>prior quarterly</b> assessment");
		aNationalProviderLabel_1_1_1_1_4.setBounds(32, 125, 594, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_4);

		final JxLabel aNationalProviderLabel_1_1_1_1_5 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_5.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_5.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_5
				.setText("<html><body>99.<b> Not OBRA required</b> assessment");
		aNationalProviderLabel_1_1_1_1_5.setBounds(36, 158, 567, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_5);

		final JxPanel panel_7_1_1_1 = new JxPanel();
		panel_7_1_1_1.setTheme(theme);

		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(79, 195, 761, 254);
		panel.add(panel_7_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1.setTheme(theme);

		aNationalProviderLabel_2_1_1.setFontSize(12);
		aNationalProviderLabel_2_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2_1_1.setText("B.PPS Assessment");
		aNationalProviderLabel_2_1_1.setBounds(10, 5, 294, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1);

		final JxLabel aNationalProviderLabel_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1.setTheme(theme);

		aNationalProviderLabel_1_2_1_1.setFontSize(12);
		aNationalProviderLabel_1_2_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_2_1_1
				.setText("PPS Scheduled Assessments for a Medicare Part A Stay");
		aNationalProviderLabel_1_2_1_1.setBounds(32, 25, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_6 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_6
				.setText("<html><body>01. <b>5-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_6.setBounds(32, 45, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_6);

		final JxLabel aNationalProviderLabel_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_1_1
				.setText("<html><body>02. <b>14-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1
				.setText("<html><body>03. <b>30-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_2_1.setBounds(32, 85, 617, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_3_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_3_1
				.setText("<html><body>04. <b>60-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_3_1.setBounds(32, 105, 541, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_3_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_4_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_4_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_4_1
				.setText("<html><body>05. <b>90-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_4_1.setBounds(32, 125, 594, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_4_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_5_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_5_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_5_1
				.setText("<html><body>06. <b>Readmission/return </b> assessment");
		aNationalProviderLabel_1_1_1_1_5_1.setBounds(32, 145, 567, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_5_1);

		final JxLabel aNationalProviderLabel_1_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_2_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_2_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_2_1_1_1
				.setText("PPS Unscheduled Assessments for a Medicare Part A Stay");
		aNationalProviderLabel_1_2_1_1_1.setBounds(32, 165, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_1
				.setText("<html><body>07. <b>Unscheduled assessment used for PPS</b>(OMRA , significant or clinical change , or significant correction assessment)");
		aNationalProviderLabel_1_1_1_1_2_1_1.setBounds(32, 185, 617, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_2_1_1_1.setFontSize(12);
		aNationalProviderLabel_2_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2_1_1_1.setText("Not PPS Assessment");
		aNationalProviderLabel_2_1_1_1.setBounds(28, 205, 294, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_2_1_1_1_1.setText("99. Not PPS Assessment");
		aNationalProviderLabel_2_1_1_1_1.setBounds(32, 225, 294, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1_1_1);

		final JxPanel panel_7_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1.setTheme(theme);

		panel_7_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(79, 448, 761, 102);
		panel.add(panel_7_1_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_2 = new JxLabel();
		aNationalProviderLabel_2_1_1_2.setTheme(theme);

		aNationalProviderLabel_2_1_1_2.setFontSize(12);
		aNationalProviderLabel_2_1_1_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2_1_1_2
				.setText("C.PPS Other Medicare Required Assessment - OMRA");
		aNationalProviderLabel_2_1_1_2.setBounds(10, 5, 422, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_2_1_1_2);

		final JxLabel aNationalProviderLabel_1_2_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_2.setTheme(theme);
		aNationalProviderLabel_1_2_1_1_2.setText("<html><body>0. <b> No");
		aNationalProviderLabel_1_2_1_1_2.setBounds(32, 25, 342, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_6_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_6_1
				.setText("<html><body>1.<b> Start of therapy</b> assessment");
		aNationalProviderLabel_1_1_1_1_6_1.setBounds(32, 45, 342, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_6_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_1_1_1
				.setText("<html><body>2.<b> End of therapy</b> assessment");
		aNationalProviderLabel_1_1_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_2
				.setText("<html><body>3.<b>Both Start and End of therapy</b> assessment");
		aNationalProviderLabel_1_1_1_1_2_1_2.setBounds(32, 85, 617, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_2);

		final JxPanel panel_7_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1.setTheme(theme);

		panel_7_1_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBounds(79, 549, 761, 65);
		panel.add(panel_7_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_2_1_1_2_1.setTheme(theme);
		aNationalProviderLabel_2_1_1_2_1
				.setText("<html><body><b>D. Is this a swing Bed clinical change assessment?</b> Complete only if A0200 =2 ");
		aNationalProviderLabel_2_1_1_2_1.setBounds(10, 5, 422, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_2_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_2_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_2_1_1_2_1.setText("<html><body>01. <b>No</b>");
		aNationalProviderLabel_1_2_1_1_2_1.setBounds(32, 25, 342, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_6_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_6_1_1
				.setText("<html><body>02. <b>Yes</b>");
		aNationalProviderLabel_1_1_1_1_6_1_1.setBounds(32, 45, 342, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_6_1_1);

		final JxPanel panel_7_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1.setTheme(theme);

		panel_7_1_1_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_7_1_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1_1.setBounds(79, 613, 761, 65);
		panel.add(panel_7_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1_2_1_1.setTheme(theme);
		aNationalProviderLabel_2_1_1_2_1_1
				.setText("<html><body><b>E. Is this assessment the first assessment</b>(OBRA,PPS or Discharge)<b>since the most recent admission?");
		aNationalProviderLabel_2_1_1_2_1_1.setBounds(10, 5, 583, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_2_1_1_2_1_1);

		final JxLabel aNationalProviderLabel_1_2_1_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_2_1_1.setTheme(theme);
		aNationalProviderLabel_1_2_1_1_2_1_1
				.setText("<html><body>01. <b>No</b>");
		aNationalProviderLabel_1_2_1_1_2_1_1.setBounds(32, 25, 342, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_2_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_6_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_6_1_1_1
				.setText("<html><body>02. <b>Yes</b>");
		aNationalProviderLabel_1_1_1_1_6_1_1_1.setBounds(32, 45, 342, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_6_1_1_1);

		final JxPanel panel_7_1_1_1_1_2 = new JxPanel();
		panel_7_1_1_1_1_2.setTheme(theme);

		panel_7_1_1_1_1_2.setOpaque(false);
		panel_7_1_1_1_1_2.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_7_1_1_1_1_2.setLayout(null);
		panel_7_1_1_1_1_2.setBounds(79, 677, 761, 122);
		panel.add(panel_7_1_1_1_1_2);

		final JxLabel aNationalProviderLabel_2_1_1_2_2 = new JxLabel();
		aNationalProviderLabel_2_1_1_2_2.setTheme(theme);
		aNationalProviderLabel_2_1_1_2_2
				.setText("<html><body><b>F. Entry / Discharge reporting");
		aNationalProviderLabel_2_1_1_2_2.setBounds(10, 5, 422, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_2_1_1_2_2);

		final JxLabel aNationalProviderLabel_1_2_1_1_2_2 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_2_2.setTheme(theme);
		aNationalProviderLabel_1_2_1_1_2_2
				.setText("<html><body>01. <b>Entry Record</b>");
		aNationalProviderLabel_1_2_1_1_2_2.setBounds(32, 25, 342, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_2_1_1_2_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_6_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6_1_2.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_6_1_2
				.setText("<html><body>10. <b>Discharge </b>assessment-<b> return not anticipated Record</b>");
		aNationalProviderLabel_1_1_1_1_6_1_2.setBounds(32, 45, 342, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_6_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_1_1_1_1
				.setText("<html><body>11. <b>Discharge </b>assessment-<b> return anticipated Record</b>");
		aNationalProviderLabel_1_1_1_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_2_1
				.setText("<html><body>12. <b>Death in facility</b> record</b>");
		aNationalProviderLabel_1_1_1_1_2_1_2_1.setBounds(32, 85, 617, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_2_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1
				.setText("<html><body>99. <b>Not entry/ discharge</b> record</b>");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1.setBounds(32, 105, 617, 14);
		panel_7_1_1_1_1_2.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFontSize(14);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setBounds(25, 803, 617, 14);
		panel.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
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
		PanelA0310 panel = new PanelA0310();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJxPanel().setVisible(true);

	}

	public void doSave() {

	}

	public void doUpdate() {

	}

}
