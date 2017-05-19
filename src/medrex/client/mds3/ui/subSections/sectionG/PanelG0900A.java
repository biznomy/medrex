package medrex.client.mds3.ui.subSections.sectionG;

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

public class PanelG0900A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8435407995193346438L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbG0900A;

	public PanelG0900A() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 125));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 125);
		add(panel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setBounds(0, 0, 840, 50);
		panel.add(panel_5);

		final JxLabel a0100Label = new JxLabel();
		a0100Label.setTheme(theme);
		a0100Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label.setBounds(10, 0, 392, 50);

		a0100Label.setFontSize(12);
		a0100Label.setFontStyle(Font.BOLD);
		a0100Label
				.setText("<html><body><b>G0900. Functional rehabilitation Potential </b><br>Complete only if A0310A = 01");
		panel_5.add(a0100Label);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);
		// panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 49, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 75);
		panel.add(panel_6);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(15, 6, 54, 14);
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_6.add(enterCodeLabel);
		enterCodeLabel.setText("Enter Code");

		cmbG0900A = new JxComboBox();
		cmbG0900A.setTheme(theme);
		cmbG0900A.setBounds(15, 25, 50, 22);
		panel_6.add(cmbG0900A);

		cmbG0900A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "8" }));
		cmbG0900A.setPreferredSize(new Dimension(50, 20));

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);

		panel_7.setBounds(79, 49, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 76);
		panel.add(panel_7);

		final JxLabel aNationalProviderLabel = new JxLabel();
		aNationalProviderLabel.setTheme(theme);

		aNationalProviderLabel.setFontSize(12);
		aNationalProviderLabel.setFontStyle(Font.BOLD);
		aNationalProviderLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel
				.setText("<html><body><b>A. Resident believes he or she is capable of increased independence </b> in at least some ADLs");
		aNationalProviderLabel.setBounds(10, 5, 577, 20);
		panel_7.add(aNationalProviderLabel);

		final JxText textField_2_1_1 = new JxText();
		textField_2_1_1.setTheme(theme);
		textField_2_1_1.setBounds(25, 122, 341, 20);
		panel_7.add(textField_2_1_1);

		final JxLabel aNationalProviderLabel_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_2_1.setBounds(20, 25, 342, 14);
		panel_7.add(aNationalProviderLabel_1_2_1);

		aNationalProviderLabel_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_2_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_2_1.setText("0. NO");

		final JxLabel aNationalProviderLabel_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1.setBounds(20, 40, 342, 14);
		panel_7.add(aNationalProviderLabel_1_1_1_1);

		aNationalProviderLabel_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_1_1_1.setText("1.Yes");

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
		panel_7.add(aNationalProviderLabel_1_1_1_1_2);

		aNationalProviderLabel_1_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_1_1_1_2.setText("9.Unable to determine.");

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
		Object obj = cmbG0900A.getSelectedItem();
		if (obj != null) {
			mds3sectionG.setG0900a(cmbG0900A.getSelectedItem().toString());
		} else {
			mds3sectionG.setG0900a("");
		}
	}

	public void doUpdate() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		cmbG0900A.setSelectedItem(mds3sectionG.getG0900a());
	}
}
