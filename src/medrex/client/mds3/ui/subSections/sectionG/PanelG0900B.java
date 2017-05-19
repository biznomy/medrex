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

public class PanelG0900B extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4486381908682366688L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbG0900B;

	public PanelG0900B() {
		super();
		setLayout(null);
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 66));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 66);
		add(panel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);
		// panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 66);
		panel.add(panel_6);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(15, 6, 54, 14);
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_6.add(enterCodeLabel);
		enterCodeLabel.setText("Enter Code");

		cmbG0900B = new JxComboBox();
		cmbG0900B.setTheme(theme);
		cmbG0900B.setBounds(15, 25, 50, 22);
		panel_6.add(cmbG0900B);

		cmbG0900B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "8" }));
		cmbG0900B.setPreferredSize(new Dimension(50, 20));

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);

		panel_7.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 66);
		panel.add(panel_7);

		final JxLabel aNationalProviderLabel = new JxLabel();
		aNationalProviderLabel.setTheme(theme);

		aNationalProviderLabel.setFontSize(12);
		aNationalProviderLabel.setFontStyle(Font.BOLD);
		aNationalProviderLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel
				.setText("<html><body><b>B. Direct care staff believe residents is capable of increased independence </b> in at least some ADLs");
		aNationalProviderLabel.setBounds(10, 5, 569, 20);
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
		Object obj = cmbG0900B.getSelectedItem();
		if (obj != null) {
			mds3sectionG.setG0900b(cmbG0900B.getSelectedItem().toString());
		} else {
			mds3sectionG.setG0900b("");
		}
	}

	public void doUpdate() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		cmbG0900B.setSelectedItem(mds3sectionG.getG0900b());
	}
}
