package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7604400448888718686L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtX0500;

	public PanelX0500() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 65));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_21_1 = new JxPanel();
		panel_21_1.setTheme(theme);
		panel_21_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_21_1.setLayout(null);
		panel_21_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 65);
		add(panel_21_1);

		final JxPanel panel_9_1_2_1 = new JxPanel();
		panel_9_1_2_1.setTheme(theme);
		panel_9_1_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9_1_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9_1_2_1.setLayout(null);
		panel_9_1_2_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_21_1.add(panel_9_1_2_1);

		final JxLabel x0100TypeOfLabel_1_2_1 = new JxLabel();
		x0100TypeOfLabel_1_2_1.setTheme(theme);

		x0100TypeOfLabel_1_2_1.setFontSize(12);
		x0100TypeOfLabel_1_2_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		x0100TypeOfLabel_1_2_1
				.setText("<html><body> <b> X0500. </b> &nbsp <b> Social Security Number </b> on existing record to be modified/inactivated");
		x0100TypeOfLabel_1_2_1.setBounds(10, 6, 432, 14);
		panel_9_1_2_1.add(x0100TypeOfLabel_1_2_1);

		final JxPanel panel_12_1 = new JxPanel();
		panel_12_1.setTheme(theme);

		panel_12_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12_1.setLayout(null);
		panel_12_1.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 41);
		panel_21_1.add(panel_12_1);

		final JxPanel panel_5_4_1 = new JxPanel();
		panel_5_4_1.setTheme(theme);
		panel_5_4_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_4_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_4_1.setLayout(null);
		panel_5_4_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 41);
		panel_12_1.add(panel_5_4_1);

		final JxPanel panel_6_4_1 = new JxPanel();
		panel_6_4_1.setTheme(theme);

		panel_6_4_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_4_1.setLayout(null);
		panel_6_4_1
				.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 41);
		panel_12_1.add(panel_6_4_1);

		txtX0500 = new JxText();
		txtX0500.setTheme(theme);
		txtX0500.setBounds(10, 10, 283, 20);
		panel_6_4_1.add(txtX0500);
		doUpdate();

	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		sectionX.setX0500(txtX0500.getText());

	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		txtX0500.setText(mds3SectionX.getX0500());

	}
}
