package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;

import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX0400 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5278802621696784675L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcX0400;
	private Object sectionX;

	public PanelX0400() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 65));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);

		panel_21.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_21.setLayout(null);
		panel_21.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 65);
		add(panel_21);

		final JxPanel panel_9_1_2 = new JxPanel();
		panel_9_1_2.setTheme(theme);
		panel_9_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9_1_2.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_21.add(panel_9_1_2);
		panel_9_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9_1_2.setLayout(null);

		final JxLabel x0100TypeOfLabel_1_2 = new JxLabel();
		x0100TypeOfLabel_1_2.setTheme(theme);

		x0100TypeOfLabel_1_2.setFontSize(12);
		x0100TypeOfLabel_1_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		x0100TypeOfLabel_1_2
				.setText("<html><body> <b> X0400.</b> &nbsp <b> Birth Date </b> on existing record to be modified/inactivated ");
		x0100TypeOfLabel_1_2.setBounds(10, 5, 603, 14);
		panel_9_1_2.add(x0100TypeOfLabel_1_2);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);

		panel_12.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 41);
		panel_21.add(panel_12);
		panel_12.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12.setLayout(null);

		final JxPanel panel_5_4 = new JxPanel();
		panel_5_4.setTheme(theme);
		panel_5_4.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_4.setLayout(null);
		panel_5_4.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 41);
		panel_12.add(panel_5_4);

		final JxPanel panel_6_4 = new JxPanel();
		panel_6_4.setTheme(theme);

		panel_6_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_4.setLayout(null);
		panel_6_4.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 41);
		panel_12.add(panel_6_4);

		final JxLabel monthLabel = new JxLabel();
		monthLabel.setTheme(theme);
		monthLabel.setText("Month");
		monthLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		monthLabel.setBounds(10, 24, 66, 14);
		panel_6_4.add(monthLabel);

		final JxLabel dayLabel = new JxLabel();
		dayLabel.setTheme(theme);
		dayLabel.setText("Day");
		dayLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dayLabel.setBounds(82, 24, 66, 14);
		panel_6_4.add(dayLabel);

		final JxLabel yearLabel = new JxLabel();
		yearLabel.setTheme(theme);
		yearLabel.setText("Year");
		yearLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		yearLabel.setBounds(154, 24, 66, 14);
		panel_6_4.add(yearLabel);

		dcX0400 = new JxDateChooser();
		dcX0400.setTheme(theme);
		dcX0400.setDateFormatString("MM/dd/yyyy");
		dcX0400.setBounds(10, 5, 230, 20);
		panel_6_4.add(dcX0400);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		sectionX.setX0400(dcX0400.getDate());
	}

	public void doUpdate() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		dcX0400.setDate(sectionX.getX0400());
	}

}
