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

public class PanelO0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5760137603008062072L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtO0600;

	public PanelO0600() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 64));

		final JxPanel panel_39 = new JxPanel();
		panel_39.setTheme(theme);

		panel_39.setLayout(null);
		panel_39.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 64);
		add(panel_39);

		final JxPanel panel_40 = new JxPanel();
		panel_40.setTheme(theme);
		panel_40.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_40.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_40.setLayout(null);
		panel_40.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_39.add(panel_40);

		final JxLabel o0600PhysicianExaminationsLabel = new JxLabel();
		o0600PhysicianExaminationsLabel.setTheme(theme);

		o0600PhysicianExaminationsLabel.setFontSize(12);
		o0600PhysicianExaminationsLabel.setFontStyle(Font.BOLD);
		o0600PhysicianExaminationsLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		o0600PhysicianExaminationsLabel
				.setText("O0600. Physician Examinations");
		o0600PhysicianExaminationsLabel.setBounds(10, 6, 292, 14);
		panel_40.add(o0600PhysicianExaminationsLabel);

		final JxPanel panel_41 = new JxPanel();
		panel_41.setTheme(theme);
		panel_41.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_41.setLayout(null);
		panel_41.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_41.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 40);
		panel_39.add(panel_41);

		txtO0600 = new JxText();
		txtO0600.setTheme(theme);
		txtO0600.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0600.setBounds(20, 19, 45, 18);
		panel_41.add(txtO0600);

		final JxLabel enterDaysLabel = new JxLabel();
		enterDaysLabel.setTheme(theme);

		enterDaysLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterDaysLabel.setText("Enter Days");
		enterDaysLabel.setBounds(15, 3, 54, 14);
		panel_41.add(enterDaysLabel);

		final JxPanel panel_42 = new JxPanel();
		panel_42.setTheme(theme);
		panel_42.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_42.setLayout(null);

		panel_42.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 40);
		panel_39.add(panel_42);

		final JxLabel overTheLastLabel = new JxLabel();
		overTheLastLabel.setTheme(theme);

		overTheLastLabel.setFontSize(12);
		overTheLastLabel.setFontStyle(Font.BOLD);
		overTheLastLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		overTheLastLabel
				.setText("<html><body>Over the last 14days, <b> on how many days did the physician ( or authorised assistant or practitioner) examine the resident ?</b>");
		overTheLastLabel.setBounds(10, 15, 723, 14);
		panel_42.add(overTheLastLabel);
		doUpdate();

	}

	@Override
	public void doSave() {
		Mds3SectionO sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		sectionO.setO0600(getInt(txtO0600.getText()));
	}

	int getInt(String string) {
		try {
			return (Integer.parseInt(string));
		} catch (Exception e) {
			return (-1);
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionO mds3SectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		txtO0600.setText(mds3SectionO.getO0600() + "");

	}

}
