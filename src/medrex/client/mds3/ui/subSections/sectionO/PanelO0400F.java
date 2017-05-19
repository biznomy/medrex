package medrex.client.mds3.ui.subSections.sectionO;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.sectionO.Mds3SectionO;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelO0400F extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2770044551820700430L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtO0400F2;
	private JxText txtO0400F1;

	public PanelO0400F() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 121));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_11.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 121);
		add(panel_11);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_15.setLayout(null);
		panel_15.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_15.setBounds(0, 0, 125, 121);
		panel_11.add(panel_15);

		final JxLabel enterNumberOfLabel_4 = new JxLabel();
		enterNumberOfLabel_4.setTheme(theme);

		enterNumberOfLabel_4.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberOfLabel_4.setText("Enter Number of Minutes");
		enterNumberOfLabel_4.setBounds(3, 18, 123, 14);
		panel_15.add(enterNumberOfLabel_4);

		txtO0400F1 = new JxText();
		txtO0400F1.setTheme(theme);
		txtO0400F1.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0400F1.setBounds(30, 38, 60, 20);
		panel_15.add(txtO0400F1);

		final JxLabel enterNumberOfLabel_5 = new JxLabel();
		enterNumberOfLabel_5.setTheme(theme);

		enterNumberOfLabel_5.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberOfLabel_5.setText("Enter Number of days");
		enterNumberOfLabel_5.setBounds(3, 74, 108, 14);
		panel_15.add(enterNumberOfLabel_5);

		txtO0400F2 = new JxText();
		txtO0400F2.setTheme(theme);
		txtO0400F2.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0400F2.setBounds(30, 94, 60, 20);
		panel_15.add(txtO0400F2);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_16.setLayout(null);
		panel_16.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_16.setBounds(124, 0, 716, 21);
		panel_11.add(panel_16);

		final JxLabel fLabel = new JxLabel();
		fLabel.setTheme(theme);

		fLabel.setFontSize(12);
		fLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		fLabel
				.setText("<html><body><b> F. </b> &nbsp <b> Recreational Therapy </b> (includes recreational and music therapy )");
		fLabel.setBounds(10, 4, 452, 14);
		panel_16.add(fLabel);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);
		panel_17.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_17.setLayout(null);

		panel_17.setBounds(124, 20, 716, 101);
		panel_11.add(panel_17);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_4
				.setText("<html><body><b> 1. </b> &nbsp <b>Total minutes</b> - record the total number of minutes this therapy was administered to the resident in the last 7 days <br> &nbsp &nbsp  &nbsp if zero,  skip to O05000, Restorative Nursing Programs");
		label_4.setBounds(15, 10, 664, 40);
		panel_17.add(label_4);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_5
				.setText("<html><body><b> 2. </b> &nbsp <b> Days </b> - record the <b> number of days </b> this therapy was administered for <b> at least 15 minutes </b> a day in the 7 days");
		label_5.setBounds(15, 56, 664, 35);
		panel_17.add(label_5);
	}

	@Override
	public void doSave() {
		Mds3SectionO sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		sectionO.setO0400F1(getDouble(txtO0400F1.getText()));
		sectionO.setO0400F2(getDouble(txtO0400F2.getText()));

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
		txtO0400F1.setText(mds3SectionO.getO0400F1() + "");
		txtO0400F2.setText(mds3SectionO.getO0400F2() + "");

	}

}
