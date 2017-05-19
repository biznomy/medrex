package medrex.client.mds3.ui.subSections.sectionF;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionF.Mds3SectionF;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelF0700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6543184291363462075L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbF0700;

	public PanelF0700() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 130));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_3, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 120);
		add(panel);
		final JxPanel panel_5_2_1 = new JxPanel();
		panel_5_2_1.setTheme(theme);
		panel_5_2_1.setLayout(null);
		panel_5_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_2_1.setBounds(9, 10, 821, 25);
		panel.add(panel_5_2_1);

		final JxLabel a0100Label_2_1 = new JxLabel();
		a0100Label_2_1.setTheme(theme);
		a0100Label_2_1.setBounds(10, 0, 810, 25);
		a0100Label_2_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		a0100Label_2_1.setFontSize(12);
		a0100Label_2_1.setFontStyle(Font.BOLD);
		a0100Label_2_1
				.setText("F0700. Should the Staff Assessment of Daily and Activity Preferences be Conducted?");
		panel_5_2_1.add(a0100Label_2_1);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 35, 820, 75);
		panel.add(panel_1);

		final JxPanel panel_6_2_1 = new JxPanel();
		panel_6_2_1.setTheme(theme);
		panel_6_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 75);
		panel_1.add(panel_6_2_1);

		final JxLabel enterCodeLabel_2_1 = new JxLabel();
		enterCodeLabel_2_1.setTheme(theme);
		enterCodeLabel_2_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_2_1.setText("Enter Code");
		enterCodeLabel_2_1.setBounds(15, 10, 54, 14);
		panel_6_2_1.add(enterCodeLabel_2_1);

		cmbF0700 = new JxComboBox();
		cmbF0700.setTheme(theme);

		cmbF0700.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2",
				"9" }));
		cmbF0700.setPreferredSize(new Dimension(50, 20));
		cmbF0700.setBounds(15, 30, 50, 22);
		panel_6_2_1.add(cmbF0700);

		final JxPanel panel_7_2_1 = new JxPanel();
		panel_7_2_1.setTheme(theme);
		panel_7_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_2_1.setOpaque(true);
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(79, 0, 741, 75);
		panel_1.add(panel_7_2_1);

		final JxLabel aNationalProviderLabel_3_1 = new JxLabel();
		aNationalProviderLabel_3_1.setTheme(theme);
		aNationalProviderLabel_3_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_3_1
				.setText("<html><body> 0. <b> No </b> (because Interview for Daily and Activity PLreferences (D0400 and F0500) was completed by resident or family/significant <br> &nbsp &nbsp other)<b>--></b> Skip to and complete G0110, Activities of Daily Living (ADL) Assisstance");
		aNationalProviderLabel_3_1.setBounds(10, 5, 680, 28);
		panel_7_2_1.add(aNationalProviderLabel_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_2
				.setText("<html><body>1. <b> Yes</b>(because 3 or more items in Interview for Daily and Activity Preferences(F0400 and F0500) were not completed by resident <br> &nbsp &nbsp or familly/significant other)<b>--></b> Continue to F0800, Staff Assessment of Daily and Activity Preferences");
		aNationalProviderLabel_1_3_1_2.setBounds(10, 39, 637, 29);
		panel_7_2_1.add(aNationalProviderLabel_1_3_1_2);
		doUpdate();

	}

	@Override
	public void doSave() {
		Mds3SectionF mds3sectionF = (Mds3SectionF) Mds3Controller.getInstance()
				.getSection(Mds3SectionF.class);
		Object obj = cmbF0700.getSelectedItem();
		if (obj != null) {
			mds3sectionF.setF0700((String) cmbF0700.getSelectedItem());
		} else {
			mds3sectionF.setF0700("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionF mds3sectionF = (Mds3SectionF) Mds3Controller.getInstance()
				.getSection(Mds3SectionF.class);
		cmbF0700.setSelectedItem(mds3sectionF.getF0700());
	}
}
