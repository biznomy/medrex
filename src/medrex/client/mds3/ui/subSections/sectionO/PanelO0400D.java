package medrex.client.mds3.ui.subSections.sectionO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

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

public class PanelO0400D extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8023224975385633649L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtO0400D2;
	private JxText txtO0400D1;

	public PanelO0400D() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 144));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 144);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel o0400TherapiesLabel = new JxLabel();
		o0400TherapiesLabel.setTheme(theme);

		o0400TherapiesLabel.setFontSize(12);
		o0400TherapiesLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		o0400TherapiesLabel
				.setText("<html><body><b> O0400.  Therapies </b> - Continued");
		o0400TherapiesLabel.setBounds(10, 6, 265, 14);
		panel_1.add(o0400TherapiesLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_5.setLayout(null);
		panel_5.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 120);
		panel.add(panel_5);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 0, 125, 120);
		panel_5.add(panel_6);

		txtO0400D1 = new JxText();
		txtO0400D1.setTheme(theme);
		txtO0400D1.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0400D1.setBounds(30, 38, 60, 20);
		panel_6.add(txtO0400D1);

		final JxLabel enterNumberOfLabel = new JxLabel();
		enterNumberOfLabel.setTheme(theme);

		enterNumberOfLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberOfLabel.setText("Enter Number of minutes");
		enterNumberOfLabel.setBounds(6, 18, 123, 14);
		panel_6.add(enterNumberOfLabel);

		final JxLabel enterNumberOfLabel_1 = new JxLabel();
		enterNumberOfLabel_1.setTheme(theme);

		enterNumberOfLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberOfLabel_1.setText("Enter Number of Days");
		enterNumberOfLabel_1.setBounds(6, 74, 108, 14);
		panel_6.add(enterNumberOfLabel_1);

		txtO0400D2 = new JxText();
		txtO0400D2.setTheme(theme);
		txtO0400D2.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0400D2.setBounds(30, 94, 60, 20);
		panel_6.add(txtO0400D2);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);

		panel_7.setLayout(null);
		panel_7.setBounds(124, 0, 716, 120);
		panel_5.add(panel_7);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_8.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 716, 21);
		panel_7.add(panel_8);

		final JxLabel dRespiratoryTherapyLabel = new JxLabel();
		dRespiratoryTherapyLabel.setTheme(theme);

		dRespiratoryTherapyLabel.setFontSize(12);
		dRespiratoryTherapyLabel.setFontStyle(Font.BOLD);
		dRespiratoryTherapyLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dRespiratoryTherapyLabel.setText("D.  Respiratory Therapy");
		dRespiratoryTherapyLabel.setBounds(10, 4, 357, 14);
		panel_8.add(dRespiratoryTherapyLabel);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_9.setLayout(null);
		panel_9.setBounds(0, 20, 716, 100);
		panel_7.add(panel_9);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label
				.setText("<html><body><b> 1. </b> &nbsp <b>Total minutes</b> - record the total number of minutes this therapy was administered to the resident in the last 7 days <br> &nbsp &nbsp  &nbsp if zero,  skip to O0400E, Psychological Therapy");
		label.setBounds(15, 10, 664, 40);
		panel_9.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_1
				.setText("<html><body><b> 2. </b> &nbsp <b> Days </b> - record the <b> number of days </b> this therapy was administered for <b> at least 15 minutes </b> a day in the 7 days");
		label_1.setBounds(15, 56, 618, 35);
		panel_9.add(label_1);

		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionO sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		sectionO.setO0400D1(getDouble(txtO0400D1.getText()));
		sectionO.setO0400D2(getDouble(txtO0400D2.getText()));

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
		txtO0400D1.setText(mds3SectionO.getO0400C1() + "");
		txtO0400D2.setText(mds3SectionO.getO0400C2() + "");

	}

}
