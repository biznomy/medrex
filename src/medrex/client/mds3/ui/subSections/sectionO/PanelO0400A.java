package medrex.client.mds3.ui.subSections.sectionO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionO.Mds3SectionO;

import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelO0400A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6408307839603604610L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcO0400A6;
	private JxDateChooser dcO0400A5;
	private JxText txtO0400A4;
	private JxText txtO0400A3;
	private JxText txtO0400A2;
	private JxText txtO0400A1;

	public PanelO0400A() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 309));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 309);
		add(panel);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_9);
		panel_9.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);

		final JxLabel o0400TherapiesLabel = new JxLabel();
		o0400TherapiesLabel.setTheme(theme);

		o0400TherapiesLabel.setFontSize(12);
		o0400TherapiesLabel.setFontStyle(Font.BOLD);
		o0400TherapiesLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		o0400TherapiesLabel.setText("O0400. Therapies");
		o0400TherapiesLabel.setBounds(11, 5, 517, 14);
		panel_9.add(o0400TherapiesLabel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);

		panel_1.setBounds(0, 24, 840, 285);
		panel.add(panel_1);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setBounds(0, 0, 125, 285);
		panel_1.add(panel_2);
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_2.setLayout(null);

		txtO0400A1 = new JxText();
		txtO0400A1.setTheme(theme);
		txtO0400A1.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0400A1.setBounds(33, 30, 60, 20);
		panel_2.add(txtO0400A1);

		txtO0400A2 = new JxText();
		txtO0400A2.setTheme(theme);
		txtO0400A2.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0400A2.setBounds(33, 75, 60, 20);
		panel_2.add(txtO0400A2);

		txtO0400A3 = new JxText();
		txtO0400A3.setTheme(theme);
		txtO0400A3.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0400A3.setBounds(33, 115, 60, 20);
		panel_2.add(txtO0400A3);

		txtO0400A4 = new JxText();
		txtO0400A4.setTheme(theme);
		txtO0400A4.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0400A4.setBounds(33, 180, 60, 20);
		panel_2.add(txtO0400A4);

		final JxLabel enterNumberOfLabel = new JxLabel();
		enterNumberOfLabel.setTheme(theme);

		enterNumberOfLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberOfLabel.setText("<html><body>Enter Number of Minutes");
		enterNumberOfLabel.setBounds(4, 15, 123, 14);
		panel_2.add(enterNumberOfLabel);

		final JxLabel enterNumberofLabel = new JxLabel();
		enterNumberofLabel.setTheme(theme);

		enterNumberOfLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberofLabel.setText("Enter Number of Minutes");
		enterNumberofLabel.setBounds(4, 60, 123, 14);
		panel_2.add(enterNumberofLabel);

		final JxLabel enterNumberOfLabel_1 = new JxLabel();
		enterNumberOfLabel_1.setTheme(theme);

		enterNumberOfLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberOfLabel_1.setText("Enter Number of Minutes");
		enterNumberOfLabel_1.setBounds(4, 100, 123, 14);
		panel_2.add(enterNumberOfLabel_1);

		final JxLabel enterNumberofLabel_1 = new JxLabel();
		enterNumberofLabel_1.setTheme(theme);

		enterNumberofLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberofLabel_1.setText("Enter Number of Days");
		enterNumberofLabel_1.setBounds(10, 165, 105, 14);
		panel_2.add(enterNumberofLabel_1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBounds(124, 0, 716, 285);
		panel_1.add(panel_5);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setLayout(null);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 716, 20);
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.add(panel_6);

		final JxLabel aSpeechlanguageLabel = new JxLabel();
		aSpeechlanguageLabel.setTheme(theme);

		aSpeechlanguageLabel.setFontSize(12);
		aSpeechlanguageLabel.setFontStyle(Font.BOLD);
		aSpeechlanguageLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aSpeechlanguageLabel
				.setText(" A. Speech -Language Pathology and Audiology Services");
		aSpeechlanguageLabel.setBounds(10, 2, 417, 14);
		panel_6.add(aSpeechlanguageLabel);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_1
				.setText("<html><body><b> If the sum of individual , concurrent,and group minutes is zero ,--></b> skip to O0400B,Occupational Therapy   ");
		label_1.setBounds(10, 140, 750, 27);
		panel_5.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_2
				.setText("<html><body><b> 5. </b> &nbsp <b> Threapy start date </b> - record the date the most recent <br> &nbsp &nbsp &nbsp  therapy regimen(since the most recent entry )started");
		label_2.setBounds(15, 195, 362, 35);
		panel_5.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_3
				.setText("<html><body><b> 6. </b> &nbsp <b> Therapy end date </b> - record the date the most recent <br> &nbsp &nbsp &nbsp therapy regimen (since the most recent entry) ended <br> &nbsp &nbsp &nbsp - enter dashes if therapy is ongoing");
		label_3.setBounds(400, 195, 340, 45);
		panel_5.add(label_3);

		dcO0400A5 = new JxDateChooser();
		dcO0400A5.setTheme(theme);
		dcO0400A5.setBounds(55, 245, 160, 20);
		dcO0400A5.setDateFormatString("MM/dd/yyyy");
		panel_5.add(dcO0400A5);

		final JxLabel monthLabel = new JxLabel();
		monthLabel.setTheme(theme);

		monthLabel.setFontSize(12);
		monthLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		monthLabel.setText("Month");
		monthLabel.setBounds(50, 265, 54, 14);
		panel_5.add(monthLabel);

		final JxLabel dayLabel = new JxLabel();
		dayLabel.setTheme(theme);

		dayLabel.setFontSize(12);
		dayLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dayLabel.setText("Day");
		dayLabel.setBounds(110, 265, 54, 14);
		panel_5.add(dayLabel);

		final JxLabel yearLabel = new JxLabel();
		yearLabel.setTheme(theme);

		yearLabel.setFontSize(12);
		yearLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		yearLabel.setText("Year");
		yearLabel.setBounds(170, 265, 54, 14);
		panel_5.add(yearLabel);

		dcO0400A6 = new JxDateChooser();
		dcO0400A6.setTheme(theme);
		dcO0400A6.setBounds(435, 245, 160, 20);
		dcO0400A6.setDateFormatString("MM/dd/yyyy");
		panel_5.add(dcO0400A6);

		final JxLabel monthLabel_1 = new JxLabel();
		monthLabel_1.setTheme(theme);

		monthLabel_1.setFontSize(12);
		monthLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		monthLabel_1.setText("Month");
		monthLabel_1.setBounds(440, 265, 54, 14);
		panel_5.add(monthLabel_1);

		final JxLabel dayLabel_1 = new JxLabel();
		dayLabel_1.setTheme(theme);

		dayLabel_1.setFontSize(12);
		dayLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dayLabel_1.setText("Day");
		dayLabel_1.setBounds(500, 265, 54, 14);
		panel_5.add(dayLabel_1);

		final JxLabel yearLabel_1 = new JxLabel();
		yearLabel_1.setTheme(theme);

		yearLabel_1.setFontSize(12);
		yearLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		yearLabel_1.setText("Year");
		yearLabel_1.setBounds(560, 265, 54, 14);
		panel_5.add(yearLabel_1);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_4
				.setText("<html><body> <b> 1. </b> &nbsp <b> Individual minutes </b> - record the total number of minutes this therapy was administered to the residents <b> individually </b> <br> &nbsp &nbsp &nbsp in the last 7 days");
		label_4.setBounds(15, 26, 660, 33);
		panel_5.add(label_4);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label
				.setText("<html><body><b> 2. </b> &nbsp <b> Concurrent minutes </b> - record the total number of minutes this therapy was administered to the resident <br> &nbsp &nbsp &nbsp <b>  concurrent with one other resident </b> in the last 7 days");
		label.setBounds(15, 64, 660, 33);
		panel_5.add(label);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_5
				.setText("<html><body><b> 3. </b> &nbsp <b> Group minutes </b> - record the total number of minutes this therapy was administered to the resident as <b> part of a group </b> <br> &nbsp &nbsp &nbsp <b> of residents </b> in the last 7days ");
		label_5.setBounds(15, 102, 660, 33);
		panel_5.add(label_5);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_6
				.setText("<html><body><b> 4. </b> &nbsp <b> Days </b> - record the <b> number of days </b> this therapy was administrated for <b> at least 15 minutes </b> a day in the last 7 days ");
		label_6.setBounds(15, 168, 669, 16);
		panel_5.add(label_6);
		doUpdate();

	}

	@Override
	public void doSave() {
		try {
			Mds3SectionO sectionO = (Mds3SectionO) Mds3Controller.getInstance()
					.getSection(Mds3SectionO.class);
			sectionO.setO0400A1(getDouble(txtO0400A1.getText()));
			sectionO.setO0400A2(getDouble(txtO0400A2.getText()));
			sectionO.setO0400A3(getDouble(txtO0400A3.getText()));
			sectionO.setO0400A4(getDouble(txtO0400A4.getText()));
			sectionO.setO0400A5((dcO0400A5.getDate()));
			sectionO.setO0400A6((dcO0400A6.getDate()));
		} catch (Exception e) {

			e.printStackTrace();
		}

		//		
	}

	double getDouble(String string) {
		try {
			return (Double.parseDouble(string));
		} catch (Exception e) {
			return (-1);
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionO mds3SectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		txtO0400A1.setText(mds3SectionO.getO0400A1() + "");
		txtO0400A2.setText(mds3SectionO.getO0400A2() + "");
		txtO0400A3.setText(mds3SectionO.getO0400A3() + "");
		txtO0400A4.setText(mds3SectionO.getO0400A4() + "");
		dcO0400A5.setDate(mds3SectionO.getO0400A5());
		dcO0400A6.setDate(mds3SectionO.getO0400A6());

	}

}
