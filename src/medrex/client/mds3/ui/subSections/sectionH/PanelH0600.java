package medrex.client.mds3.ui.subSections.sectionH;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionH.Mds3SectionH;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelH0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7890549047963726273L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbH0600;

	public PanelH0600() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 95));
		setBackground(Color.WHITE);

		final JxPanel panel_1_3 = new JxPanel();
		panel_1_3.setTheme(theme);
		panel_1_3.setBounds(0, 0, 840, 95);

		panel_1_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_3.setLayout(null);
		panel_1_3.setPreferredSize(new Dimension(840, 105));
		add(panel_1_3);

		final JxPanel panel_5_3 = new JxPanel();
		panel_5_3.setTheme(theme);
		panel_5_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_3.setLayout(flowLayout_7);
		panel_5_3.setBounds(0, 0, 840, 25);
		panel_1_3.add(panel_5_3);

		final JxLabel a0100Label_3 = new JxLabel();
		a0100Label_3.setTheme(theme);

		a0100Label_3.setFontSize(12);
		a0100Label_3.setFontStyle(Font.BOLD);
		a0100Label_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_3.setText("H0600. Bowel Patterns");
		panel_5_3.add(a0100Label_3);

		final JxPanel panel_6_3 = new JxPanel();
		panel_6_3.setTheme(theme);
		panel_6_3.setLayout(null);
		panel_6_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_3.setBounds(0, 24, 80, 70);
		panel_1_3.add(panel_6_3);

		final JxLabel enterCodeLabel_1_2_1_1_1 = new JxLabel();
		enterCodeLabel_1_2_1_1_1.setTheme(theme);
		enterCodeLabel_1_2_1_1_1.setBounds(14, 6, 52, 14);
		enterCodeLabel_1_2_1_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_1_2_1_1_1.setText("Enter code");
		panel_6_3.add(enterCodeLabel_1_2_1_1_1);

		cmbH0600 = new JxComboBox();
		cmbH0600.setTheme(theme);
		cmbH0600.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbH0600.setPreferredSize(new Dimension(50, 20));
		cmbH0600.setBounds(16, 26, 50, 20);
		panel_6_3.add(cmbH0600);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_12.setLayout(null);
		panel_12.setBounds(79, 24, 761, 70);
		panel_1_3.add(panel_12);

		final JxLabel constipationPresentLabel = new JxLabel();
		constipationPresentLabel.setTheme(theme);

		constipationPresentLabel.setFontSize(12);
		constipationPresentLabel.setFontStyle(Font.BOLD);
		constipationPresentLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		constipationPresentLabel.setText("Constipation present?");
		constipationPresentLabel.setBounds(10, 10, 361, 14);
		panel_12.add(constipationPresentLabel);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);
		label_7.setText("<html><body>0.<b> No</b>");
		label_7.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_7.setBounds(38, 30, 54, 14);
		panel_12.add(label_7);

		final JxLabel label_8 = new JxLabel();
		label_8.setTheme(theme);
		label_8.setText("<html><body>1.<b>Yes</b>");
		label_8.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_8.setBounds(38, 50, 54, 14);
		panel_12.add(label_8);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		Object obj = cmbH0600.getSelectedItem();
		if (obj != null) {
			mds3sectionH.setH0600(cmbH0600.getSelectedItem().toString());
		} else {
			mds3sectionH.setH0600("");
		}

	}

	public void doUpdate() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		cmbH0600.setSelectedItem(mds3sectionH.getH0600());
	}

}
