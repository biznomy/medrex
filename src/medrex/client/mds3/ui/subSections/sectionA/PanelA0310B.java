package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA0310B extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5967844630961909752L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbA0310B;

	public PanelA0310B() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 240));
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBounds(0, 0, 840, 240);
		panel.setPreferredSize(new Dimension(840, 240));

		panel.setOpaque(false);
		panel.setLayout(null);
		// panel.setBounds(0, 0, 840, 820);
		add(panel);

		final JxPanel panel_7_1_1_1 = new JxPanel();
		panel_7_1_1_1.setTheme(theme);

		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				241);
		panel.add(panel_7_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1.setTheme(theme);

		aNationalProviderLabel_2_1_1.setFontSize(12);
		aNationalProviderLabel_2_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2_1_1.setText("B.PPS Assessment");
		aNationalProviderLabel_2_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_2_1_1.setBounds(10, 5, 294, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1);

		final JxLabel aNationalProviderLabel_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1.setTheme(theme);

		aNationalProviderLabel_1_2_1_1.setFontSize(12);
		aNationalProviderLabel_1_2_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_2_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2_1_1
				.setText("PPS Scheduled Assessments for a Medicare Part A Stay");
		aNationalProviderLabel_1_2_1_1.setBounds(32, 25, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_6 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_6
				.setText("<html><body>01. <b>5-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_6
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_6.setBounds(32, 45, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_6);

		final JxLabel aNationalProviderLabel_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_1_1
				.setText("<html><body>02. <b>14-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_1_1.setBounds(32, 65, 383, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1
				.setText("<html><body>03. <b>30-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_2_1.setBounds(32, 85, 617, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_3_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_3_1
				.setText("<html><body>04. <b>60-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_3_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_3_1.setBounds(32, 105, 541, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_3_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_4_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_4_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_4_1
				.setText("<html><body>05. <b>90-Day</b> Scheduled assessment");
		aNationalProviderLabel_1_1_1_1_4_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_4_1.setBounds(32, 125, 594, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_4_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_5_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_5_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_5_1
				.setText("<html><body>06. <b>Readmission/return </b> assessment");
		aNationalProviderLabel_1_1_1_1_5_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_5_1.setBounds(32, 145, 567, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_5_1);

		final JxLabel aNationalProviderLabel_1_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_2_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_2_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_2_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2_1_1_1
				.setText("PPS Unscheduled Assessments for a Medicare Part A Stay");
		aNationalProviderLabel_1_2_1_1_1.setBounds(32, 165, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_1
				.setText("<html><body>07. <b>Unscheduled assessment used for PPS</b>(OMRA , significant or clinical change , or significant correction assessment)");
		aNationalProviderLabel_1_1_1_1_2_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_2_1_1.setBounds(32, 185, 617, 26);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_2_1_1_1.setFontSize(12);
		aNationalProviderLabel_2_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_2_1_1_1.setText("Not PPS Assessment");
		aNationalProviderLabel_2_1_1_1.setBounds(35, 210, 294, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_2_1_1_1_1.setText("99. Not PPS Assessment");
		aNationalProviderLabel_2_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_2_1_1_1_1.setBounds(32, 225, 294, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1_1_1);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBorder(new LineBorder(Color.BLACK, 1, true));// top,left,bottom,right
		panel_6_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_LIGHTGREY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 241);
		panel.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(10, 10, 70, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbA0310B = new JxComboBox();
		cmbA0310B.setTheme(theme);
		cmbA0310B.setBounds(18, 31, 50, 22);

		cmbA0310B.setModel(new DefaultComboBoxModel(new String[] { " ", "01",
				"02", "03", "04", "05", "06", "99" }));
		cmbA0310B.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbA0310B);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		Object obj = cmbA0310B.getSelectedItem();
		if (obj != null) {
			sectionA.setA0310B((cmbA0310B.getSelectedItem().toString()));
		} else {
			sectionA.setA0310B("");
		}

	}

	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbA0310B.setSelectedItem(mds3SectionA.getA0310B());

	}

}
