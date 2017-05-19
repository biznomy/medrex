package medrex.client.mds3.ui.subSections.sectionG;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionG.Mds3SectionG;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelG0120A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7302608254701377777L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbG0120;

	public PanelG0120A() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 178));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 177);
		add(panel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setBounds(0, 0, 840, 25);
		panel.add(panel_5);

		final JxLabel a0100Label = new JxLabel();
		a0100Label.setTheme(theme);
		a0100Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label.setBounds(11, 6, 85, 15);

		a0100Label.setFontSize(12);
		a0100Label.setFontStyle(Font.BOLD);
		a0100Label.setText("G0120. Bathing");
		panel_5.add(a0100Label);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_8.setLayout(null);

		panel_8.setBounds(0, 24, 840, 50);
		panel.add(panel_8);

		final JxLabel howResidentLabel = new JxLabel();
		howResidentLabel.setTheme(theme);

		howResidentLabel.setFontSize(12);
		howResidentLabel.setBorder(new LineBorder(Color.black, 0, false));
		howResidentLabel
				.setText("<HTML>  How resident takes full-body bath/shower,sponge bath, and transfers in/out of tub/shower (<b>excludes</b> washing of back and hair). Code for<b> most <br> dependent</b> in self-perfoemance and support </HTML>");
		howResidentLabel.setBounds(10, 0, 820, 50);
		panel_8.add(howResidentLabel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);
		// panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 74, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 104);
		panel.add(panel_6);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(15, 6, 54, 14);
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_6.add(enterCodeLabel);
		enterCodeLabel.setText("Enter Code");

		cmbG0120 = new JxComboBox();
		cmbG0120.setTheme(theme);
		cmbG0120.setBounds(15, 25, 50, 22);
		panel_6.add(cmbG0120);
		cmbG0120.setSelectedItem("");

		cmbG0120.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3", "4", "8" }));
		cmbG0120.setPreferredSize(new Dimension(50, 20));

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);

		panel_7.setFontSize(12);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);

		panel_7.setBounds(79, 74, 761, 104);
		panel.add(panel_7);

		final JxLabel aNationalProviderLabel = new JxLabel();
		aNationalProviderLabel.setTheme(theme);

		aNationalProviderLabel.setFontSize(12);
		aNationalProviderLabel.setFontStyle(Font.BOLD);
		aNationalProviderLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel.setText("A. Self-performance");
		aNationalProviderLabel.setBounds(10, 5, 206, 14);
		panel_7.add(aNationalProviderLabel);

		final JxText textField_2_1_1 = new JxText();
		textField_2_1_1.setTheme(theme);
		textField_2_1_1.setBounds(25, 122, 341, 20);
		panel_7.add(textField_2_1_1);

		final JxLabel aNationalProviderLabel_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_2_1.setBounds(20, 25, 342, 14);
		aNationalProviderLabel_1_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7.add(aNationalProviderLabel_1_2_1);

		aNationalProviderLabel_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_2_1
				.setText("<html><body>0. <b>Independent</b> - no help provided");

		final JxLabel aNationalProviderLabel_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1.setBounds(20, 40, 342, 14);
		panel_7.add(aNationalProviderLabel_1_1_1_1);
		aNationalProviderLabel_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1
				.setText("<html><body>1. <b>Supervision</b> -oversight help only");

		final JxLabel aNationalProviderLabel_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_1.setBounds(60, 300, 383, 14);
		panel_7.add(aNationalProviderLabel_1_1_1_1_1);

		aNationalProviderLabel_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>03. <b>Annual</b> Assessment");

		final JxLabel aNationalProviderLabel_1_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2.setBounds(20, 56, 308, 14);
		aNationalProviderLabel_1_1_1_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7.add(aNationalProviderLabel_1_1_1_1_2);

		aNationalProviderLabel_1_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_2
				.setText("<html><body>2. <b>Physical help limited to transfer only </b> ");

		final JxLabel physicalHelpInLabel = new JxLabel();
		physicalHelpInLabel.setTheme(theme);
		physicalHelpInLabel
				.setText("<html><body>3.<b>Physical help in part of bathing activity</b>");
		physicalHelpInLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		physicalHelpInLabel.setBounds(20, 72, 617, 14);
		panel_7.add(physicalHelpInLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setText("<html><body>4.<b>Total Dependence</b>");
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label.setBounds(20, 88, 600, 14);
		panel_7.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1
				.setText("<html><body>8.<b>Activity itself did not occur</b> during the entire period");
		label_1.setBounds(20, 104, 600, 14);
		panel_7.add(label_1);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		mds3sectionG.setG0120((String) cmbG0120.getSelectedItem());
	}

	public void doUpdate() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		cmbG0120.setSelectedItem(mds3sectionG.getG0120());

	}

}
