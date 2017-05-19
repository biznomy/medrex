package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

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

public class PanelX0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2395524142439089587L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtX0200B;
	private JxText txtX0200A;

	public PanelX0200() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 105));

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_19.setLayout(null);
		panel_19.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 105);
		add(panel_19);

		final JxPanel panel_9_1_1 = new JxPanel();
		panel_9_1_1.setTheme(theme);
		panel_9_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_19.add(panel_9_1_1);
		panel_9_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9_1_1.setLayout(null);

		final JxLabel x0100TypeOfLabel_1_1 = new JxLabel();
		x0100TypeOfLabel_1_1.setTheme(theme);

		x0100TypeOfLabel_1_1.setFontSize(12);
		x0100TypeOfLabel_1_1.setForeground(Mds3Constants.BORDER_BLACK);
		x0100TypeOfLabel_1_1
				.setText("<html><body> <b> X0200. </b> &nbsp <b>  Name of Resident </b> on existing record to be modified/inactivated");
		x0100TypeOfLabel_1_1.setBounds(10, 5, 603, 14);
		panel_9_1_1.add(x0100TypeOfLabel_1_1);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 80);
		panel_19.add(panel_10);
		panel_10.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_10.setLayout(null);

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_2.setLayout(null);
		panel_5_2.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 81);
		panel_10.add(panel_5_2);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);

		panel_6_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2.setLayout(null);
		panel_6_2.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 81);
		panel_10.add(panel_6_2);

		final JxLabel aFirstNameLabel = new JxLabel();
		aFirstNameLabel.setTheme(theme);

		aFirstNameLabel.setFontSize(12);
		aFirstNameLabel.setFontStyle(Font.BOLD);
		aFirstNameLabel.setForeground(Mds3Constants.BORDER_BLACK);
		aFirstNameLabel.setText("   A.        First Name");
		aFirstNameLabel.setBounds(0, 3, 171, 16);
		panel_6_2.add(aFirstNameLabel);

		final JxLabel bLastNameLabel = new JxLabel();
		bLastNameLabel.setTheme(theme);

		bLastNameLabel.setFontSize(12);
		bLastNameLabel.setFontStyle(Font.BOLD);
		bLastNameLabel.setForeground(Mds3Constants.BORDER_BLACK);
		bLastNameLabel.setText("   B.       Last Name");
		bLastNameLabel.setBounds(0, 39, 246, 16);
		panel_6_2.add(bLastNameLabel);

		txtX0200A = new JxText();
		txtX0200A.setTheme(theme);
		txtX0200A.setBounds(40, 20, 165, 20);
		panel_6_2.add(txtX0200A);

		txtX0200B = new JxText();
		txtX0200B.setTheme(theme);
		txtX0200B.setBounds(40, 57, 165, 20);
		panel_6_2.add(txtX0200B);

		doUpdate();

	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		sectionX.setX0200A(txtX0200A.getText());
		sectionX.setX0200B(txtX0200B.getText());

	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		txtX0200A.setText(mds3SectionX.getX0200A());
		txtX0200B.setText(mds3SectionX.getX0200B());
	}

}
