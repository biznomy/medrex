package medrex.client.mds3.ui.subSections.sectionD;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionD.Mds3SectionD;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelD0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7277124722219125359L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbD02002I;
	private JxComboBox cmbD02002H;
	private JxComboBox cmbD02002G;
	private JxComboBox cmbD02002F;
	private JxComboBox cmbD02002E;
	private JxComboBox cmbD02002D;
	private JxComboBox cmbD02002C;
	private JxComboBox cmbD02002B;
	private JxComboBox cmbD02002A;
	private JxComboBox cmbD02001I;
	private JxComboBox cmbD02001H;
	private JxComboBox cmbD02001G;
	private JxComboBox cmbD02001F;
	private JxComboBox cmbD02001E;
	private JxComboBox cmbD02001D;
	private JxComboBox cmbD02001C;
	private JxComboBox cmbD02001B;
	private JxComboBox cmbD02001A;

	public PanelD0200() {
		super();
		setPreferredSize(new Dimension(840, 564));
		setLayout(null);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_11.setLayout(null);
		panel_11.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 564);
		panel_11.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		add(panel_11);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_10.setBounds(5, 5, 830, 20);
		panel_11.add(panel_10);
		panel_10.setLayout(null);

		final JxLabel sayToResidentLabel = new JxLabel();
		sayToResidentLabel.setTheme(theme);
		sayToResidentLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		sayToResidentLabel.setFontSize(12);
		sayToResidentLabel.setFontStyle(Font.BOLD);
		sayToResidentLabel
				.setText("<html><body><b>Say to resident: \"<i>Over the last 2 weeks, have you been bothered by any of the following problems?\"");
		sayToResidentLabel.setBounds(10, 5, 743, 15);
		panel_10.add(sayToResidentLabel);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1.setBounds(5, 24, 830, 184);
		panel_11.add(panel_7_1);

		panel_7_1.setLayout(null);

		final JxLabel ifSymptomIsLabel = new JxLabel();
		ifSymptomIsLabel.setTheme(theme);
		ifSymptomIsLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		ifSymptomIsLabel.setFontSize(12);
		ifSymptomIsLabel
				.setText("If symptom is present, enter 1(yes) in column 1, Symptom Presence.");
		ifSymptomIsLabel.setBounds(10, 0, 806, 24);
		panel_7_1.add(ifSymptomIsLabel);

		final JxLabel ifYesInLabel = new JxLabel();
		ifYesInLabel.setTheme(theme);
		ifYesInLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		ifYesInLabel.setFontSize(12);
		ifYesInLabel
				.setText("<html><body> If yes in column 1, then ask the resident:\"<i> About <b> how often </b>have you been bothered by this?\"");
		ifYesInLabel.setBounds(10, 25, 714, 14);
		panel_7_1.add(ifYesInLabel);

		final JxLabel readAndShowLabel = new JxLabel();
		readAndShowLabel.setTheme(theme);
		readAndShowLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		readAndShowLabel.setFontSize(12);
		readAndShowLabel
				.setText("Read and show the resident a card with the symptom frequency choices. Indicate response in column 2, Symptom Frequency.");
		readAndShowLabel.setBounds(10, 45, 760, 14);
		panel_7_1.add(readAndShowLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		label.setFontSize(12);
		label.setText("<html><body><b>1. Symptom Presence</b>");
		label.setBounds(10, 80, 156, 14);
		panel_7_1.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setText("<html><body>0. <b>No</b>(enter 0 in column 2)");
		label_1.setBounds(25, 100, 166, 14);
		panel_7_1.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		label_2.setFontSize(12);
		label_2.setText("<html><body>1. <b>Yes</b>(enter 0-3 in column 2)");
		label_2.setBounds(25, 120, 184, 14);
		panel_7_1.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);
		label_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		label_3.setFontSize(12);
		label_3
				.setText("<html><body>9.<b> No response</b>(leave column 2  <br> &nbsp &nbsp blank)");
		label_3.setBounds(25, 140, 184, 32);
		panel_7_1.add(label_3);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);
		label_4.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		label_4.setFontSize(12);
		label_4.setText("<html><body><b>2. Symptom Frequency</b>");
		label_4.setBounds(330, 80, 224, 14);
		panel_7_1.add(label_4);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);
		label_5.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		label_5.setFontSize(12);
		label_5.setText("<html><body>0. <b>Never or 1 day</b>");
		label_5.setBounds(340, 100, 233, 14);
		panel_7_1.add(label_5);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);
		label_6.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		label_6.setFontSize(12);
		label_6.setText("<html><body>1.<b> 2 - 6 days</b>(several days)");
		label_6.setBounds(340, 120, 156, 14);
		panel_7_1.add(label_6);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);
		label_7.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		label_7.setFontSize(12);
		label_7
				.setText("<html><body>2.<b> 7-11 days</b>(half or more of the days)");
		label_7.setBounds(340, 140, 233, 14);
		panel_7_1.add(label_7);

		final JxLabel label_8 = new JxLabel();
		label_8.setTheme(theme);
		label_8.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		label_8.setFontSize(12);
		label_8.setText("<html><body>3.<b> 12- 14 days</b>(nearly every day)");
		label_8.setBounds(340, 160, 247, 14);
		panel_7_1.add(label_8);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setLayout(null);
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setBounds(624, 86, 103, 72);
		panel_7_1.add(panel_6_1);

		final JxLabel label_9 = new JxLabel();
		label_9.setTheme(theme);
		label_9.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_9
				.setText("<html><body><b> &nbsp &nbsp 1.<br> Symptom <br>Presence");
		label_9.setBounds(20, 10, 54, 52);
		panel_6_1.add(label_9);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		panel_6_2.setLayout(null);
		panel_6_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2.setBounds(726, 86, 104, 72);
		panel_7_1.add(panel_6_2);

		final JxLabel label_10 = new JxLabel();
		label_10.setTheme(theme);
		label_10.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_10
				.setText("<html><body><b> &nbsp &nbsp 2. <br>Symptom<br> Frequency");
		label_10.setBounds(20, 10, 72, 52);
		panel_6_2.add(label_10);

		final JxLabel enterScoreInLabel = new JxLabel();
		enterScoreInLabel.setTheme(theme);

		enterScoreInLabel.setFontSize(12);
		enterScoreInLabel.setFontStyle(Font.BOLD);
		enterScoreInLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enterScoreInLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		enterScoreInLabel.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		enterScoreInLabel.setText("    Enter Score in Boxes");
		enterScoreInLabel.setBounds(624, 157, 209, 28);
		panel_7_1.add(enterScoreInLabel);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setLayout(null);

		panel_12.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12.setBounds(5, 208, 625, 40);
		panel_11.add(panel_12);

		final JxLabel aLittleInterestLabel = new JxLabel();
		aLittleInterestLabel.setTheme(theme);
		aLittleInterestLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aLittleInterestLabel.setFontSize(12);
		aLittleInterestLabel.setFontStyle(Font.BOLD);
		aLittleInterestLabel
				.setText("<html><body> <i>A. Little interest or pleasure in doing things");
		aLittleInterestLabel.setBounds(10, 10, 518, 14);
		panel_12.add(aLittleInterestLabel);

		final JxPanel panel_12_1 = new JxPanel();
		panel_12_1.setTheme(theme);
		panel_12_1.setLayout(null);

		panel_12_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1.setBounds(5, 246, 625, 40);
		panel_11.add(panel_12_1);

		final JxLabel feelingDownDepressedLabel = new JxLabel();
		feelingDownDepressedLabel.setTheme(theme);
		feelingDownDepressedLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		feelingDownDepressedLabel.setFontSize(12);
		feelingDownDepressedLabel.setFontStyle(Font.BOLD);
		feelingDownDepressedLabel
				.setText("<html><body> <i>B. Feeling down, depressed, or hopeless");
		feelingDownDepressedLabel.setBounds(10, 10, 518, 14);
		panel_12_1.add(feelingDownDepressedLabel);

		final JxPanel panel_12_2 = new JxPanel();
		panel_12_2.setTheme(theme);

		panel_12_2.setFontSize(12);
		panel_12_2.setFontStyle(Font.BOLD);
		panel_12_2.setLayout(null);

		panel_12_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_2.setBounds(5, 285, 625, 40);
		panel_11.add(panel_12_2);

		final JxLabel troubleFallingOrLabel = new JxLabel();
		troubleFallingOrLabel.setTheme(theme);
		troubleFallingOrLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		troubleFallingOrLabel.setFontSize(12);
		troubleFallingOrLabel.setFontStyle(Font.BOLD);
		troubleFallingOrLabel
				.setText("<html><body> <i>C. Trouble falling or staying asleep too much");
		troubleFallingOrLabel.setBounds(10, 10, 518, 14);
		panel_12_2.add(troubleFallingOrLabel);

		final JxPanel panel_12_3 = new JxPanel();
		panel_12_3.setTheme(theme);
		panel_12_3.setLayout(null);

		panel_12_3.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_3.setBounds(5, 324, 625, 40);
		panel_11.add(panel_12_3);

		final JxLabel feelingTiredOrLabel = new JxLabel();
		feelingTiredOrLabel.setTheme(theme);
		feelingDownDepressedLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		feelingTiredOrLabel.setFontSize(12);
		feelingTiredOrLabel.setFontStyle(Font.BOLD);
		feelingTiredOrLabel
				.setText("<html><body> <i>D. Feeling tired or having little energy");
		feelingTiredOrLabel.setBounds(10, 10, 518, 14);
		panel_12_3.add(feelingTiredOrLabel);

		final JxPanel panel_12_4 = new JxPanel();
		panel_12_4.setTheme(theme);
		panel_12_4.setLayout(null);

		panel_12_4.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_4.setBounds(5, 363, 625, 40);
		panel_11.add(panel_12_4);

		final JxLabel poorAppetiteOrLabel = new JxLabel();
		poorAppetiteOrLabel.setTheme(theme);
		poorAppetiteOrLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		poorAppetiteOrLabel.setFontSize(12);
		poorAppetiteOrLabel.setFontStyle(Font.BOLD);
		poorAppetiteOrLabel
				.setText("<html><body> <i>E. Poor appetite or overeating");
		poorAppetiteOrLabel.setBounds(10, 10, 518, 14);
		panel_12_4.add(poorAppetiteOrLabel);

		final JxPanel panel_12_5 = new JxPanel();
		panel_12_5.setTheme(theme);
		panel_12_5.setLayout(null);

		panel_12_5.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_5.setBounds(5, 402, 625, 40);
		panel_11.add(panel_12_5);

		final JxLabel fFeelingBadLabel = new JxLabel();
		fFeelingBadLabel.setTheme(theme);

		fFeelingBadLabel.setFontSize(12);
		fFeelingBadLabel.setFontStyle(Font.BOLD);
		fFeelingBadLabel
				.setText("<html><body> <i>F. Feeling bad about yourself - or that you are a failure or have let yourself or your family down");
		fFeelingBadLabel.setBounds(10, 10, 564, 14);
		panel_12_5.add(fFeelingBadLabel);

		final JxPanel panel_12_6 = new JxPanel();
		panel_12_6.setTheme(theme);
		panel_12_6.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_12_6.setLayout(null);

		panel_12_6.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_6.setBounds(5, 441, 625, 40);
		panel_11.add(panel_12_6);

		final JxLabel gTroubleConcentratingLabel = new JxLabel();
		gTroubleConcentratingLabel.setTheme(theme);
		gTroubleConcentratingLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		gTroubleConcentratingLabel.setFontSize(12);
		gTroubleConcentratingLabel.setFontStyle(Font.BOLD);
		gTroubleConcentratingLabel
				.setText("<html><body> <i>G.Trouble concentrating on things, such as reading the newspaper or watching television");
		gTroubleConcentratingLabel.setBounds(10, 10, 518, 14);
		panel_12_6.add(gTroubleConcentratingLabel);

		final JxPanel panel_12_7 = new JxPanel();
		panel_12_7.setTheme(theme);
		panel_12_7.setLayout(null);

		panel_12_7.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_7.setBounds(5, 480, 625, 40);
		panel_11.add(panel_12_7);

		final JxLabel gTroubleConcentratingLabel_3 = new JxLabel();
		gTroubleConcentratingLabel_3.setTheme(theme);
		gTroubleConcentratingLabel_3
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		gTroubleConcentratingLabel_3.setFontSize(12);
		gTroubleConcentratingLabel_3.setFontStyle(Font.BOLD);
		gTroubleConcentratingLabel_3
				.setText("<html><body>H. Moving or speaking so slowly that other people could have noticed. Or the opposite- being so fidgety <br> &nbsp &nbsp or restless that you have been moving around a lot more than usual");
		gTroubleConcentratingLabel_3.setBounds(10, 4, 605, 29);
		panel_12_7.add(gTroubleConcentratingLabel_3);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1.setBounds(629, 208, 103, 351);
		panel_11.add(panel_6_1_1);

		cmbD02001A = new JxComboBox();
		cmbD02001A.setTheme(theme);

		cmbD02001A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbD02001A.setBounds(21, 6, 50, 20);
		cmbD02001A.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbD02001A);

		cmbD02001B = new JxComboBox();
		cmbD02001B.setTheme(theme);

		cmbD02001B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbD02001B.setPreferredSize(new Dimension(50, 20));
		cmbD02001B.setBounds(20, 45, 50, 20);
		panel_6_1_1.add(cmbD02001B);

		cmbD02001C = new JxComboBox();
		cmbD02001C.setTheme(theme);

		cmbD02001C.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbD02001C.setPreferredSize(new Dimension(50, 20));
		cmbD02001C.setBounds(20, 85, 50, 20);
		panel_6_1_1.add(cmbD02001C);

		cmbD02001D = new JxComboBox();
		cmbD02001D.setTheme(theme);

		cmbD02001D.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbD02001D.setPreferredSize(new Dimension(50, 20));
		cmbD02001D.setBounds(20, 125, 50, 20);
		panel_6_1_1.add(cmbD02001D);

		cmbD02001E = new JxComboBox();
		cmbD02001E.setTheme(theme);

		cmbD02001E.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbD02001E.setPreferredSize(new Dimension(50, 20));
		cmbD02001E.setBounds(20, 165, 50, 20);
		panel_6_1_1.add(cmbD02001E);

		cmbD02001F = new JxComboBox();
		cmbD02001F.setTheme(theme);

		cmbD02001F.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbD02001F.setPreferredSize(new Dimension(50, 20));
		cmbD02001F.setBounds(20, 205, 50, 20);
		panel_6_1_1.add(cmbD02001F);

		cmbD02001G = new JxComboBox();
		cmbD02001G.setTheme(theme);

		cmbD02001G.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbD02001G.setPreferredSize(new Dimension(50, 20));
		cmbD02001G.setBounds(20, 245, 50, 20);
		panel_6_1_1.add(cmbD02001G);

		cmbD02001H = new JxComboBox();
		cmbD02001H.setTheme(theme);

		cmbD02001H.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbD02001H.setPreferredSize(new Dimension(50, 20));
		cmbD02001H.setBounds(20, 285, 50, 20);
		panel_6_1_1.add(cmbD02001H);

		cmbD02001I = new JxComboBox();
		cmbD02001I.setTheme(theme);
		cmbD02001I.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));

		cmbD02001I.setPreferredSize(new Dimension(50, 20));
		cmbD02001I.setBounds(20, 325, 50, 20);
		panel_6_1_1.add(cmbD02001I);

		final JxPanel panel_6_2_1 = new JxPanel();
		panel_6_2_1.setTheme(theme);
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2_1.setBounds(731, 208, 104, 351);
		panel_11.add(panel_6_2_1);

		cmbD02002A = new JxComboBox();
		cmbD02002A.setTheme(theme);

		cmbD02002A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbD02002A.setBounds(21, 6, 50, 20);
		cmbD02002A.setPreferredSize(new Dimension(50, 20));
		panel_6_2_1.add(cmbD02002A);

		cmbD02002B = new JxComboBox();
		cmbD02002B.setTheme(theme);

		cmbD02002B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbD02002B.setPreferredSize(new Dimension(50, 20));
		cmbD02002B.setBounds(20, 45, 50, 20);
		panel_6_2_1.add(cmbD02002B);

		cmbD02002C = new JxComboBox();
		cmbD02002C.setTheme(theme);

		cmbD02002C.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbD02002C.setPreferredSize(new Dimension(50, 20));
		cmbD02002C.setBounds(20, 85, 50, 20);
		panel_6_2_1.add(cmbD02002C);

		cmbD02002D = new JxComboBox();
		cmbD02002D.setTheme(theme);

		cmbD02002D.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbD02002D.setPreferredSize(new Dimension(50, 20));
		cmbD02002D.setBounds(20, 125, 50, 20);
		panel_6_2_1.add(cmbD02002D);

		cmbD02002E = new JxComboBox();
		cmbD02002E.setTheme(theme);

		cmbD02002E.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbD02002E.setPreferredSize(new Dimension(50, 20));
		cmbD02002E.setBounds(20, 165, 50, 20);
		panel_6_2_1.add(cmbD02002E);

		cmbD02002F = new JxComboBox();
		cmbD02002F.setTheme(theme);

		cmbD02002F.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbD02002F.setPreferredSize(new Dimension(50, 20));
		cmbD02002F.setBounds(20, 205, 50, 20);
		panel_6_2_1.add(cmbD02002F);

		cmbD02002G = new JxComboBox();
		cmbD02002G.setTheme(theme);

		cmbD02002G.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbD02002G.setPreferredSize(new Dimension(50, 20));
		cmbD02002G.setBounds(20, 245, 50, 20);
		panel_6_2_1.add(cmbD02002G);

		cmbD02002H = new JxComboBox();
		cmbD02002H.setTheme(theme);

		cmbD02002H.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbD02002H.setPreferredSize(new Dimension(50, 20));
		cmbD02002H.setBounds(20, 285, 50, 20);
		panel_6_2_1.add(cmbD02002H);

		cmbD02002I = new JxComboBox();
		cmbD02002I.setTheme(theme);
		cmbD02002I.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbD02002I.setPreferredSize(new Dimension(50, 20));
		cmbD02002I.setBounds(20, 325, 50, 20);
		panel_6_2_1.add(cmbD02002I);

		final JxPanel panel_12_6_1 = new JxPanel();
		panel_12_6_1.setTheme(theme);

		panel_12_6_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_12_6_1.setLayout(null);
		panel_12_6_1.setBounds(5, 519, 625, 40);
		panel_11.add(panel_12_6_1);

		final JxLabel gTroubleConcentratingLabel_1 = new JxLabel();
		gTroubleConcentratingLabel_1.setTheme(theme);
		gTroubleConcentratingLabel_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		gTroubleConcentratingLabel_1.setFontSize(12);
		gTroubleConcentratingLabel_1.setFontStyle(Font.BOLD);
		gTroubleConcentratingLabel_1
				.setText("I. Thoughts that you would be better off dead, or of hurting yourself in some way");
		gTroubleConcentratingLabel_1.setBounds(10, 10, 518, 14);
		panel_12_6_1.add(gTroubleConcentratingLabel_1);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionD mds3sectionD = (Mds3SectionD) Mds3Controller.getInstance()
				.getSection(Mds3SectionD.class);
		Object obj1 = cmbD02002I.getSelectedItem();
		Object obj2 = cmbD02002G.getSelectedItem();
		Object obj3 = cmbD02002F.getSelectedItem();
		Object obj4 = cmbD02002E.getSelectedItem();
		Object obj5 = cmbD02002D.getSelectedItem();
		Object obj6 = cmbD02002C.getSelectedItem();
		Object obj7 = cmbD02002B.getSelectedItem();
		Object obj8 = cmbD02002A.getSelectedItem();
		Object obj9 = cmbD02001I.getSelectedItem();
		Object obj10 = cmbD02001H.getSelectedItem();
		Object obj11 = cmbD02001G.getSelectedItem();
		Object obj12 = cmbD02001F.getSelectedItem();
		Object obj13 = cmbD02001E.getSelectedItem();
		Object obj14 = cmbD02001D.getSelectedItem();
		Object obj15 = cmbD02001C.getSelectedItem();
		Object obj16 = cmbD02001B.getSelectedItem();
		Object obj17 = cmbD02001A.getSelectedItem();

		if (obj1 != null) {
			mds3sectionD.setD02002I(cmbD02002I.getSelectedItem().toString());
		} else {
			mds3sectionD.setD02002I("");
		}

		if (obj2 != null) {
			mds3sectionD.setD02002G((String) cmbD02002G.getSelectedItem());
		} else {
			mds3sectionD.setD02002G("");
		}

		if (obj3 != null) {
			mds3sectionD.setD02002F((String) cmbD02002F.getSelectedItem());
		} else {
			mds3sectionD.setD02002F("");
		}

		if (obj4 != null) {
			mds3sectionD.setD02002E((String) cmbD02002E.getSelectedItem());
		} else {
			mds3sectionD.setD02002E("");
		}
		if (obj5 != null) {
			mds3sectionD.setD02002D((String) cmbD02002D.getSelectedItem());
		} else {
			mds3sectionD.setD02002D("");
		}

		if (obj6 != null) {
			mds3sectionD.setD02002C((String) cmbD02002C.getSelectedItem());
		} else {
			mds3sectionD.setD02002C("");
		}

		if (obj7 != null) {
			mds3sectionD.setD02002B((String) cmbD02002B.getSelectedItem());
		} else {
			mds3sectionD.setD02002B("");
		}

		if (obj8 != null) {
			mds3sectionD.setD02002A((String) cmbD02002A.getSelectedItem());
		} else {
			mds3sectionD.setD02002A("");
		}

		if (obj9 != null) {
			mds3sectionD.setD02001I((String) cmbD02001I.getSelectedItem());
		} else {
			mds3sectionD.setD02001I("");
		}
		if (obj10 != null) {
			mds3sectionD.setD02001H((String) cmbD02001H.getSelectedItem());
		} else {
			mds3sectionD.setD02001H("");
		}
		if (obj11 != null) {
			mds3sectionD.setD02001G((String) cmbD02001G.getSelectedItem());
		} else {
			mds3sectionD.setD02001G("");
		}

		if (obj12 != null) {
			mds3sectionD.setD02001F((String) cmbD02001F.getSelectedItem());
		} else {
			mds3sectionD.setD02001F("");
		}
		if (obj13 != null) {
			mds3sectionD.setD02001E((String) cmbD02001E.getSelectedItem());
		} else {
			mds3sectionD.setD02001E("");
		}

		if (obj14 != null) {
			mds3sectionD.setD02001D((String) cmbD02001D.getSelectedItem());
		} else {
			mds3sectionD.setD02001D("");
		}
		if (obj15 != null) {
			mds3sectionD.setD02001C((String) cmbD02001C.getSelectedItem());
		} else {
			mds3sectionD.setD02001C("");
		}
		if (obj16 != null) {
			mds3sectionD.setD02001B((String) cmbD02001B.getSelectedItem());
		} else {
			mds3sectionD.setD02001B("");
		}
		if (obj17 != null) {
			mds3sectionD.setD02001A((String) cmbD02001A.getSelectedItem());
		} else {
			mds3sectionD.setD02001A("");
		}
	}

	public void doUpdate() {
		Mds3SectionD mds3sectionD = (Mds3SectionD) Mds3Controller.getInstance()
				.getSection(Mds3SectionD.class);
		cmbD02002I.setSelectedItem(mds3sectionD.getD02002I());
		cmbD02002H.setSelectedItem(mds3sectionD.getD02002H());
		cmbD02002G.setSelectedItem(mds3sectionD.getD02002G());
		cmbD02002F.setSelectedItem(mds3sectionD.getD02002F());
		cmbD02002E.setSelectedItem(mds3sectionD.getD02002E());
		cmbD02002D.setSelectedItem(mds3sectionD.getD02002D());
		cmbD02002C.setSelectedItem(mds3sectionD.getD02002C());
		cmbD02002B.setSelectedItem(mds3sectionD.getD02002B());
		cmbD02002A.setSelectedItem(mds3sectionD.getD02002A());
		cmbD02001I.setSelectedItem(mds3sectionD.getD02001I());
		cmbD02001H.setSelectedItem(mds3sectionD.getD02001H());
		cmbD02001G.setSelectedItem(mds3sectionD.getD02001G());
		cmbD02001F.setSelectedItem(mds3sectionD.getD02001F());
		cmbD02001E.setSelectedItem(mds3sectionD.getD02001E());
		cmbD02001D.setSelectedItem(mds3sectionD.getD02001D());
		cmbD02001C.setSelectedItem(mds3sectionD.getD02001C());
		cmbD02001B.setSelectedItem(mds3sectionD.getD02001B());
		cmbD02001A.setSelectedItem(mds3sectionD.getD02001A());

	}

}
