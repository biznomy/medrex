package medrex.client.mds3.ui.subSections.sectionD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.sectionD.Mds3SectionD;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelD0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2479416639291478342L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbD05002J;
	private JxComboBox cmbD05002I;
	private JxComboBox cmbD05002H;
	private JxComboBox cmbD05002G;
	private JxComboBox cmbD05002F;
	private JxComboBox cmbD05002E;
	private JxComboBox cmbD05002D;
	private JxComboBox cmbD05002C;
	private JxComboBox cmbD05002B;
	private JxComboBox cmbD05002A;
	private JxComboBox cmbD05001J;
	private JxComboBox cmbD05001I;
	private JxComboBox cmbD05001H;
	private JxComboBox cmbD05001G;
	private JxComboBox cmbD05001F;
	private JxComboBox cmbD05001E;
	private JxComboBox cmbD05001D;
	private JxComboBox cmbD05001C;
	private JxComboBox cmbD05001B;
	private JxComboBox cmbD05001A;

	public PanelD0500() {
		super();
		setPreferredSize(new Dimension(840, 495));
		setLayout(null);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panel_11.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_11.setLayout(null);
		panel_11.setBounds(0, 0, 840, 495);
		add(panel_11);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1.setBounds(5, 74, 830, 170);
		panel_11.add(panel_7_1);

		panel_7_1.setLayout(null);

		final JxLabel ifSymptomIsLabel = new JxLabel();
		ifSymptomIsLabel.setTheme(theme);

		ifSymptomIsLabel.setFontSize(12);
		ifSymptomIsLabel
				.setText("If symptom is present, enter 1(yes) in column 1, Symptom Presence.");
		ifSymptomIsLabel.setBounds(23, 10, 770, 14);
		panel_7_1.add(ifSymptomIsLabel);

		final JxLabel readAndShowLabel = new JxLabel();
		readAndShowLabel.setTheme(theme);

		readAndShowLabel.setFontSize(12);
		readAndShowLabel
				.setText("Then move to the column 2, Symptom Frequency , and indicate Symptom Frequency.");
		readAndShowLabel.setBounds(23, 30, 435, 14);
		panel_7_1.add(readAndShowLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setFontStyle(Font.BOLD);
		label.setText("1. Symptom Presence");
		label.setBounds(23, 62, 156, 14);
		panel_7_1.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setText("<html><body> 0.<b> No</b>(enter 0 in column 2)");
		label_1.setBounds(33, 82, 146, 14);
		panel_7_1.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setText("<html><body> 1.<b> Yes</b>(enter 0-3 in column 2)");
		label_2.setBounds(33, 102, 166, 14);
		panel_7_1.add(label_2);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4.setFontStyle(Font.BOLD);
		label_4.setText("2. Symptom Frequency");
		label_4.setBounds(265, 62, 224, 14);
		panel_7_1.add(label_4);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5.setText("<html><body> 0.<b> Never or 1 day");
		label_5.setBounds(297, 82, 233, 14);
		panel_7_1.add(label_5);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6.setText("<html><body> 1.<b> 2 - 6 days</b>(several days)");
		label_6.setBounds(297, 102, 156, 14);
		panel_7_1.add(label_6);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);

		label_7.setFontSize(12);
		label_7
				.setText("<html><body> 2.<b> 7-11 days</b>(half or more of the days)");
		label_7.setBounds(297, 122, 233, 14);
		panel_7_1.add(label_7);

		final JxLabel label_8 = new JxLabel();
		label_8.setTheme(theme);

		label_8.setFontSize(12);
		label_8.setText("<html><body> 3.<b> 12- 14 days</b>(nearly every day)");
		label_8.setBounds(297, 142, 247, 14);
		panel_7_1.add(label_8);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setVgap(10);
		panel_6_1.setLayout(flowLayout_2);
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1.setBounds(624, 75, 104, 72);
		panel_7_1.add(panel_6_1);

		final JxLabel label_4_1 = new JxLabel();
		label_4_1.setTheme(theme);
		label_4_1.setText("<html><center><b>1.<br>Symptom <br>Presence");
		panel_6_1.add(label_4_1);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(10);
		panel_6_2.setLayout(flowLayout_3);
		panel_6_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(727, 75, 103, 72);
		panel_7_1.add(panel_6_2);

		final JxLabel label_4_1_1 = new JxLabel();
		label_4_1_1.setTheme(theme);
		label_4_1_1.setText("<html><center><b>2.<br>Symptom <br>Frequency");
		panel_6_2.add(label_4_1_1);

		final JxLabel enterScoreInLabel = new JxLabel();
		enterScoreInLabel.setTheme(theme);
		enterScoreInLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enterScoreInLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		enterScoreInLabel.setBorder(new LineBorder(Color.black, 1, false));
		enterScoreInLabel.setText("    Enter Score in Boxes");
		enterScoreInLabel.setBounds(624, 145, 206, 25);
		panel_7_1.add(enterScoreInLabel);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_12.setLayout(flowLayout_5);

		panel_12.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12.setBounds(5, 243, 625, 26);
		panel_11.add(panel_12);

		final JxLabel aLittleInterestLabel = new JxLabel();
		aLittleInterestLabel.setTheme(theme);

		aLittleInterestLabel.setFontSize(12);
		aLittleInterestLabel.setFontStyle(Font.BOLD);
		aLittleInterestLabel
				.setText("A. Little interest or pleasure in doing things");
		panel_12.add(aLittleInterestLabel);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1.setBounds(629, 243, 106, 247);
		panel_11.add(panel_6_1_1);

		cmbD05001A = new JxComboBox();
		cmbD05001A.setTheme(theme);

		cmbD05001A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		cmbD05001A.setBounds(25, 0, 50, 18);
		cmbD05001A.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbD05001A);

		cmbD05001B = new JxComboBox();
		cmbD05001B.setTheme(theme);

		cmbD05001B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		cmbD05001B.setPreferredSize(new Dimension(50, 20));
		cmbD05001B.setBounds(25, 25, 50, 18);
		panel_6_1_1.add(cmbD05001B);

		cmbD05001C = new JxComboBox();
		cmbD05001C.setTheme(theme);
		cmbD05001C.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));

		cmbD05001C.setPreferredSize(new Dimension(50, 20));
		cmbD05001C.setBounds(25, 50, 50, 18);
		panel_6_1_1.add(cmbD05001C);

		cmbD05001D = new JxComboBox();
		cmbD05001D.setTheme(theme);
		cmbD05001D.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));

		cmbD05001D.setPreferredSize(new Dimension(50, 20));
		cmbD05001D.setBounds(25, 75, 50, 18);
		panel_6_1_1.add(cmbD05001D);

		cmbD05001E = new JxComboBox();
		cmbD05001E.setTheme(theme);
		cmbD05001E.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));

		cmbD05001E.setPreferredSize(new Dimension(50, 20));
		cmbD05001E.setBounds(25, 100, 50, 18);
		panel_6_1_1.add(cmbD05001E);

		cmbD05001F = new JxComboBox();
		cmbD05001F.setTheme(theme);
		cmbD05001F.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));

		cmbD05001F.setPreferredSize(new Dimension(50, 20));
		cmbD05001F.setBounds(25, 125, 50, 18);
		panel_6_1_1.add(cmbD05001F);

		cmbD05001G = new JxComboBox();
		cmbD05001G.setTheme(theme);
		cmbD05001G.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));

		cmbD05001G.setPreferredSize(new Dimension(50, 20));
		cmbD05001G.setBounds(25, 150, 50, 18);
		panel_6_1_1.add(cmbD05001G);

		cmbD05001H = new JxComboBox();
		cmbD05001H.setTheme(theme);
		cmbD05001H.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));

		cmbD05001H.setPreferredSize(new Dimension(50, 20));
		cmbD05001H.setBounds(25, 175, 50, 18);
		panel_6_1_1.add(cmbD05001H);

		cmbD05001I = new JxComboBox();
		cmbD05001I.setTheme(theme);
		cmbD05001I.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));

		cmbD05001I.setPreferredSize(new Dimension(50, 20));
		cmbD05001I.setBounds(25, 200, 50, 18);
		panel_6_1_1.add(cmbD05001I);

		cmbD05001J = new JxComboBox();
		cmbD05001J.setTheme(theme);
		cmbD05001J.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));

		cmbD05001J.setPreferredSize(new Dimension(50, 20));
		cmbD05001J.setBounds(25, 225, 50, 18);
		panel_6_1_1.add(cmbD05001J);

		final JxPanel panel_6_2_1 = new JxPanel();
		panel_6_2_1.setTheme(theme);
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2_1.setBounds(734, 243, 101, 247);
		panel_11.add(panel_6_2_1);

		cmbD05002A = new JxComboBox();
		cmbD05002A.setTheme(theme);
		cmbD05002A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD05002A.setPreferredSize(new Dimension(50, 20));
		cmbD05002A.setBounds(30, 0, 50, 18);
		panel_6_2_1.add(cmbD05002A);

		cmbD05002B = new JxComboBox();
		cmbD05002B.setTheme(theme);
		cmbD05002B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD05002B.setPreferredSize(new Dimension(50, 20));
		cmbD05002B.setBounds(30, 25, 50, 18);
		panel_6_2_1.add(cmbD05002B);

		cmbD05002C = new JxComboBox();
		cmbD05002C.setTheme(theme);
		cmbD05002C.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD05002C.setPreferredSize(new Dimension(50, 20));
		cmbD05002C.setBounds(30, 50, 50, 18);
		panel_6_2_1.add(cmbD05002C);

		cmbD05002D = new JxComboBox();
		cmbD05002D.setTheme(theme);
		cmbD05002D.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD05002D.setPreferredSize(new Dimension(50, 20));
		cmbD05002D.setBounds(30, 75, 50, 18);
		panel_6_2_1.add(cmbD05002D);

		cmbD05002E = new JxComboBox();
		cmbD05002E.setTheme(theme);
		cmbD05002E.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD05002E.setPreferredSize(new Dimension(50, 20));
		cmbD05002E.setBounds(30, 100, 50, 18);
		panel_6_2_1.add(cmbD05002E);

		cmbD05002F = new JxComboBox();
		cmbD05002F.setTheme(theme);
		cmbD05002F.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD05002F.setPreferredSize(new Dimension(50, 20));
		cmbD05002F.setBounds(30, 125, 50, 18);
		panel_6_2_1.add(cmbD05002F);

		cmbD05002G = new JxComboBox();
		cmbD05002G.setTheme(theme);
		cmbD05002G.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD05002G.setPreferredSize(new Dimension(50, 20));
		cmbD05002G.setBounds(30, 150, 50, 18);
		panel_6_2_1.add(cmbD05002G);

		cmbD05002H = new JxComboBox();
		cmbD05002H.setTheme(theme);
		cmbD05002H.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD05002H.setPreferredSize(new Dimension(50, 20));
		cmbD05002H.setBounds(30, 175, 50, 18);
		panel_6_2_1.add(cmbD05002H);

		cmbD05002I = new JxComboBox();
		cmbD05002I.setTheme(theme);
		cmbD05002I.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD05002I.setPreferredSize(new Dimension(50, 20));
		cmbD05002I.setBounds(30, 200, 50, 18);
		panel_6_2_1.add(cmbD05002I);

		cmbD05002J = new JxComboBox();
		cmbD05002J.setTheme(theme);
		cmbD05002J.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD05002J.setPreferredSize(new Dimension(50, 20));
		cmbD05002J.setBounds(30, 225, 50, 18);
		panel_6_2_1.add(cmbD05002J);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_13.setLayout(null);
		panel_13.setBounds(10, 594, 382, 25);
		panel_11.add(panel_13);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_14.setLayout(null);
		panel_14.setBounds(10, 625, 102, 71);
		panel_11.add(panel_14);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBounds(5, 5, 830, 50);
		panel_11.add(panel_5);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);

		final JxLabel a0100Label = new JxLabel();
		a0100Label.setTheme(theme);
		a0100Label.setBounds(11, 6, 321, 15);

		a0100Label.setFontSize(12);
		a0100Label.setFontStyle(Font.BOLD);
		a0100Label
				.setText("D0500. Staff Assessment of Resident Mood (PHQ -9-OV*)");
		panel_5.add(a0100Label);

		final JxLabel doNotConductLabel = new JxLabel();
		doNotConductLabel.setTheme(theme);

		doNotConductLabel.setFontSize(12);
		doNotConductLabel.setBounds(11, 24, 669, 14);
		doNotConductLabel
				.setText("Do not conduct if resident Mood Interview (D)200 - D0300) was completed");
		panel_5.add(doNotConductLabel);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBounds(5, 54, 830, 21);
		panel_11.add(panel_7);
		panel_7.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7.setLayout(null);

		final JxLabel doNotConductLabel_1 = new JxLabel();
		doNotConductLabel_1.setTheme(theme);

		doNotConductLabel_1.setFontSize(12);
		doNotConductLabel_1.setFontStyle(Font.BOLD);
		doNotConductLabel_1
				.setText("Over the last 2 weeks , did the resident have any of the following problems or behavior?");
		doNotConductLabel_1.setBounds(10, 2, 669, 14);
		panel_7.add(doNotConductLabel_1);

		final JxPanel panel_12_1 = new JxPanel();
		panel_12_1.setTheme(theme);
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_12_1.setLayout(flowLayout_7);

		panel_12_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1.setBounds(5, 268, 625, 25);
		panel_11.add(panel_12_1);

		final JxLabel aLittleInterestLabel_1 = new JxLabel();
		aLittleInterestLabel_1.setTheme(theme);

		aLittleInterestLabel_1.setFontSize(12);
		aLittleInterestLabel_1.setFontStyle(Font.BOLD);
		aLittleInterestLabel_1
				.setText("B. Feeling down, depressed, or hopeless");
		panel_12_1.add(aLittleInterestLabel_1);

		final JxPanel panel_12_1_1 = new JxPanel();
		panel_12_1_1.setTheme(theme);
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_12_1_1.setLayout(flowLayout_8);

		panel_12_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1_1.setBounds(5, 292, 625, 25);
		panel_11.add(panel_12_1_1);

		final JxLabel aLittleInterestLabel_2 = new JxLabel();
		aLittleInterestLabel_2.setTheme(theme);

		aLittleInterestLabel_2.setFontSize(12);
		aLittleInterestLabel_2.setFontStyle(Font.BOLD);
		aLittleInterestLabel_2
				.setText("C. Trouble falling or staying asleep too much");
		panel_12_1_1.add(aLittleInterestLabel_2);

		final JxPanel panel_12_1_2 = new JxPanel();
		panel_12_1_2.setTheme(theme);
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		panel_12_1_2.setLayout(flowLayout_9);

		panel_12_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1_2.setBounds(5, 316, 625, 25);
		panel_11.add(panel_12_1_2);

		final JxLabel aLittleInterestLabel_3 = new JxLabel();
		aLittleInterestLabel_3.setTheme(theme);

		aLittleInterestLabel_3.setFontSize(12);
		aLittleInterestLabel_3.setFontStyle(Font.BOLD);
		aLittleInterestLabel_3
				.setText("D. Feeling tired or having little energy");
		panel_12_1_2.add(aLittleInterestLabel_3);

		final JxPanel panel_12_1_3 = new JxPanel();
		panel_12_1_3.setTheme(theme);
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_12_1_3.setLayout(flowLayout_10);

		panel_12_1_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1_3.setBounds(5, 340, 625, 25);
		panel_11.add(panel_12_1_3);

		final JxLabel aLittleInterestLabel_4 = new JxLabel();
		aLittleInterestLabel_4.setTheme(theme);

		aLittleInterestLabel_4.setFontSize(12);
		aLittleInterestLabel_4.setFontStyle(Font.BOLD);
		aLittleInterestLabel_4.setText("E. Poor appetite or overeating");
		panel_12_1_3.add(aLittleInterestLabel_4);

		final JxPanel panel_12_1_4 = new JxPanel();
		panel_12_1_4.setTheme(theme);
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		panel_12_1_4.setLayout(flowLayout_11);

		panel_12_1_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1_4.setBounds(5, 364, 625, 25);
		panel_11.add(panel_12_1_4);

		final JxLabel aLittleInterestLabel_5 = new JxLabel();
		aLittleInterestLabel_5.setTheme(theme);

		aLittleInterestLabel_5.setFontSize(12);
		aLittleInterestLabel_5.setFontStyle(Font.BOLD);
		aLittleInterestLabel_5
				.setText("F. Feeling bad about yourself - or that you are a failure or have let yourself or your family down");
		panel_12_1_4.add(aLittleInterestLabel_5);

		final JxPanel panel_12_1_5 = new JxPanel();
		panel_12_1_5.setTheme(theme);
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_12_1_5.setLayout(flowLayout_12);

		panel_12_1_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1_5.setBounds(5, 388, 625, 25);
		panel_11.add(panel_12_1_5);

		final JxLabel aLittleInterestLabel_6 = new JxLabel();
		aLittleInterestLabel_6.setTheme(theme);

		aLittleInterestLabel_6.setFontSize(12);
		aLittleInterestLabel_6.setFontStyle(Font.BOLD);
		aLittleInterestLabel_6
				.setText("G. Trouble concentrating on things, such as reading the newspaper or watching television");
		panel_12_1_5.add(aLittleInterestLabel_6);

		final JxPanel panel_12_1_6 = new JxPanel();
		panel_12_1_6.setTheme(theme);
		final FlowLayout flowLayout_13 = new FlowLayout();
		flowLayout_13.setVgap(0);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_12_1_6.setLayout(flowLayout_13);

		panel_12_1_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1_6.setBounds(5, 412, 625, 30);
		panel_11.add(panel_12_1_6);

		final JxLabel aLittleInterestLabel_7 = new JxLabel();
		aLittleInterestLabel_7.setTheme(theme);

		aLittleInterestLabel_7.setFontSize(12);
		aLittleInterestLabel_7.setFontStyle(Font.BOLD);
		aLittleInterestLabel_7
				.setText("<html><body>H. Moving or speaking so slowly that other people could have noticed. Or the opposite- being so fidgety <br> &nbsp &nbsp  or restless that you have been moving around a lot more than usual");
		panel_12_1_6.add(aLittleInterestLabel_7);

		final JxPanel panel_12_1_7 = new JxPanel();
		panel_12_1_7.setTheme(theme);
		final FlowLayout flowLayout_14 = new FlowLayout();
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_12_1_7.setLayout(flowLayout_14);

		panel_12_1_7.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1_7.setBounds(5, 441, 625, 25);
		panel_11.add(panel_12_1_7);

		final JxLabel aLittleInterestLabel_8 = new JxLabel();
		aLittleInterestLabel_8.setTheme(theme);

		aLittleInterestLabel_8.setFontSize(12);
		aLittleInterestLabel_8.setFontStyle(Font.BOLD);
		aLittleInterestLabel_8
				.setText("I. Thoughts that you would be better off dead, or of hurting yourself in some way");
		panel_12_1_7.add(aLittleInterestLabel_8);

		final JxPanel panel_12_1_8 = new JxPanel();
		panel_12_1_8.setTheme(theme);
		final FlowLayout flowLayout_15 = new FlowLayout();
		flowLayout_15.setAlignment(FlowLayout.LEFT);
		panel_12_1_8.setLayout(flowLayout_15);

		panel_12_1_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1_8.setBounds(5, 465, 625, 25);
		panel_11.add(panel_12_1_8);

		final JxLabel aLittleInterestLabel_9 = new JxLabel();
		aLittleInterestLabel_9.setTheme(theme);

		aLittleInterestLabel_9.setFontSize(12);
		aLittleInterestLabel_9.setFontStyle(Font.BOLD);
		aLittleInterestLabel_9
				.setText("J.Being short-tempered , easily annoyed");
		panel_12_1_8.add(aLittleInterestLabel_9);
		doUpdate();

	}

	public void doSave() {
		Mds3SectionD mds3sectionD = (Mds3SectionD) Mds3Controller.getInstance()
				.getSection(Mds3SectionD.class);
		Object obj1 = cmbD05002J.getSelectedItem();
		if (obj1 != null) {
			mds3sectionD.setD05002J((String) cmbD05002J.getSelectedItem());
		} else {
			mds3sectionD.setD05002J("");
		}
		Object obj2 = cmbD05002I.getSelectedItem();
		if (obj2 != null) {
			mds3sectionD.setD05002I((String) cmbD05002I.getSelectedItem());
		} else {
			mds3sectionD.setD05002I("");
		}
		Object obj3 = cmbD05002H.getSelectedItem();
		if (obj3 != null) {
			mds3sectionD.setD05002H((String) cmbD05002H.getSelectedItem());
		} else {
			mds3sectionD.setD05002H("");
		}
		Object obj4 = cmbD05002G.getSelectedItem();
		if (obj4 != null) {
			mds3sectionD.setD05002G((String) cmbD05002G.getSelectedItem());
		} else {
			mds3sectionD.setD05002G("");
		}
		Object obj5 = cmbD05002F.getSelectedItem();
		if (obj5 != null) {
			mds3sectionD.setD05002F((String) cmbD05002F.getSelectedItem());
		} else {
			mds3sectionD.setD05002F("");
		}
		Object obj6 = cmbD05002E.getSelectedItem();
		if (obj6 != null) {
			mds3sectionD.setD05002E((String) cmbD05002E.getSelectedItem());
		} else {
			mds3sectionD.setD05002E("");
		}
		Object obj7 = cmbD05002D.getSelectedItem();
		if (obj7 != null) {
			mds3sectionD.setD05002D((String) cmbD05002D.getSelectedItem());
		} else {
			mds3sectionD.setD05002D("");
		}
		Object obj8 = cmbD05002C.getSelectedItem();
		if (obj8 != null) {
			mds3sectionD.setD05002C((String) cmbD05002C.getSelectedItem());
		} else {
			mds3sectionD.setD05002C("");
		}
		Object obj9 = cmbD05002B.getSelectedItem();
		if (obj9 != null) {
			mds3sectionD.setD05002B((String) cmbD05002B.getSelectedItem());
		} else {
			mds3sectionD.setD05002B("");
		}
		Object obj10 = cmbD05002A.getSelectedItem();
		if (obj10 != null) {
			mds3sectionD.setD05002A((String) cmbD05002A.getSelectedItem());
		} else {
			mds3sectionD.setD05002A("");
		}
		Object obj11 = cmbD05001J.getSelectedItem();
		if (obj11 != null) {
			mds3sectionD.setD05001J((String) cmbD05001J.getSelectedItem());
		} else {
			mds3sectionD.setD05001J("");
		}
		Object obj12 = cmbD05001I.getSelectedItem();
		if (obj12 != null) {
			mds3sectionD.setD05001I((String) cmbD05001I.getSelectedItem());
		} else {
			mds3sectionD.setD05001I("");
		}
		Object obj13 = cmbD05001H.getSelectedItem();
		if (obj13 != null) {
			mds3sectionD.setD05001H((String) cmbD05001H.getSelectedItem());
		} else {
			mds3sectionD.setD05001H("");
		}
		Object obj14 = cmbD05001G.getSelectedItem();
		if (obj14 != null) {
			mds3sectionD.setD05001G((String) cmbD05001G.getSelectedItem());
		} else {
			mds3sectionD.setD05001G("");
		}
		Object obj15 = cmbD05001F.getSelectedItem();
		if (obj15 != null) {
			mds3sectionD.setD05001F((String) cmbD05001F.getSelectedItem());
		} else {
			mds3sectionD.setD05001F("");
		}
		Object obj16 = cmbD05001E.getSelectedItem();
		if (obj16 != null) {
			mds3sectionD.setD05001E((String) cmbD05001E.getSelectedItem());
		} else {
			mds3sectionD.setD05001E("");
		}
		Object obj17 = cmbD05001D.getSelectedItem();
		if (obj17 != null) {
			mds3sectionD.setD05001D((String) cmbD05001D.getSelectedItem());
		} else {
			mds3sectionD.setD05001D("");
		}
		Object Obj18 = cmbD05001C.getSelectedItem();
		if (Obj18 != null) {
			mds3sectionD.setD05001C((String) cmbD05001C.getSelectedItem());
		} else {
			mds3sectionD.setD05001C("");
		}
		Object obj19 = cmbD05001B.getSelectedItem();
		if (obj19 != null) {
			mds3sectionD.setD05001B((String) cmbD05001B.getSelectedItem());
		} else {
			mds3sectionD.setD05001B("");
		}
		Object obj20 = cmbD05001A.getSelectedItem();
		if (obj20 != null) {
			mds3sectionD.setD05001A((String) cmbD05001A.getSelectedItem());
		} else {
			mds3sectionD.setD05001A("");
		}
	}

	public void doUpdate() {
		Mds3SectionD mds3sectionD = (Mds3SectionD) Mds3Controller.getInstance()
				.getSection(Mds3SectionD.class);
		cmbD05002J.setSelectedItem(mds3sectionD.getD05002J());
		cmbD05002I.setSelectedItem(mds3sectionD.getD05002I());
		cmbD05002H.setSelectedItem(mds3sectionD.getD05002H());
		cmbD05002G.setSelectedItem(mds3sectionD.getD05002G());
		cmbD05002F.setSelectedItem(mds3sectionD.getD05002F());
		cmbD05002E.setSelectedItem(mds3sectionD.getD05002E());
		cmbD05002D.setSelectedItem(mds3sectionD.getD05002D());
		cmbD05002C.setSelectedItem(mds3sectionD.getD05002C());
		cmbD05002B.setSelectedItem(mds3sectionD.getD05002B());
		cmbD05002A.setSelectedItem(mds3sectionD.getD05002A());
		cmbD05001J.setSelectedItem(mds3sectionD.getD05001J());
		cmbD05001I.setSelectedItem(mds3sectionD.getD05001I());
		cmbD05001H.setSelectedItem(mds3sectionD.getD05001H());
		cmbD05001G.setSelectedItem(mds3sectionD.getD05001G());
		cmbD05001F.setSelectedItem(mds3sectionD.getD05001F());
		cmbD05001E.setSelectedItem(mds3sectionD.getD05001E());
		cmbD05001D.setSelectedItem(mds3sectionD.getD05001D());
		cmbD05001C.setSelectedItem(mds3sectionD.getD05001C());
		cmbD05001B.setSelectedItem(mds3sectionD.getD05001B());
		cmbD05001A.setSelectedItem(mds3sectionD.getD05001A());

	}
}
