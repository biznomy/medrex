package medrex.client.mds3.ui.subSections.sectionO;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionO.Mds3SectionO;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelO0400E extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5557720367513612439L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtO0400E2;
	private JxText txtO0400E1;

	public PanelO0400E() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 121));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);

		panel_10.setLayout(null);
		panel_10.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 121);
		add(panel_10);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_12.setBounds(0, 0, 125, 121);
		panel_10.add(panel_12);

		final JxLabel enterNumberOfLabel_2 = new JxLabel();
		enterNumberOfLabel_2.setTheme(theme);

		enterNumberOfLabel_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberOfLabel_2.setText("Enter Number of Minutes");
		enterNumberOfLabel_2.setBounds(6, 18, 123, 14);
		panel_12.add(enterNumberOfLabel_2);

		txtO0400E1 = new JxText();
		txtO0400E1.setTheme(theme);
		txtO0400E1.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0400E1.setBounds(30, 38, 60, 20);
		panel_12.add(txtO0400E1);

		final JxLabel enterNumberOfLabel_3 = new JxLabel();
		enterNumberOfLabel_3.setTheme(theme);

		enterNumberOfLabel_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberOfLabel_3.setText("Enter Number of Days");
		enterNumberOfLabel_3.setBounds(6, 74, 108, 14);
		panel_12.add(enterNumberOfLabel_3);

		txtO0400E2 = new JxText();
		txtO0400E2.setTheme(theme);
		txtO0400E2.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0400E2.setBounds(30, 94, 60, 20);
		panel_12.add(txtO0400E2);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_13.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_13.setBounds(124, 0, 716, 21);
		panel_10.add(panel_13);

		final JxLabel enbspLabel = new JxLabel();
		enbspLabel.setTheme(theme);

		enbspLabel.setFontSize(12);
		enbspLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enbspLabel
				.setText("<html><body><b>E. </b> &nbsp <b>  Psychological Therapy</b> (by any licensed mental health professional)");
		enbspLabel.setBounds(10, 4, 434, 14);
		panel_13.add(enbspLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_14.setBounds(124, 20, 716, 101);
		panel_10.add(panel_14);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_2
				.setText("<html><body><b> 1. </b> &nbsp <b>Total minutes</b> - record the total number of minutes this therapy was administered to the resident in the last 7 days <br> &nbsp &nbsp  &nbsp  if zero,  skip to O0400F, Recreational Therapy");
		label_2.setBounds(15, 10, 664, 40);
		panel_14.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);
		label_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_3
				.setText("<html><body><b> 2. </b> &nbsp <b> Days </b> - record the <b> number of days </b> this therapy was administered for <b> at least 15 minutes </b> a day in the 7 days");
		label_3.setBounds(15, 56, 664, 35);
		panel_14.add(label_3);
		doUpdate();

	}

	@Override
	public void doSave() {
		Mds3SectionO sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		sectionO.setO0400E1(getDouble(txtO0400E1.getText()));
		sectionO.setO0400E2(getDouble(txtO0400E2.getText()));

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
		txtO0400E1.setText(mds3SectionO.getO0400E1() + "");
		txtO0400E2.setText(mds3SectionO.getO0400E2() + "");

	}

}
