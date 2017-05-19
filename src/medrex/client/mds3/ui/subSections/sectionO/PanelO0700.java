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

public class PanelO0700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8259726014617413094L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtO0700;

	public PanelO0700() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 65));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_43 = new JxPanel();
		panel_43.setTheme(theme);
		panel_43.setLayout(null);

		panel_43.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 64);
		add(panel_43);

		final JxPanel panel_44 = new JxPanel();
		panel_44.setTheme(theme);
		panel_44.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_44.setLayout(null);
		panel_44.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_44.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_43.add(panel_44);

		final JxLabel o0700PhysicianOrdersLabel = new JxLabel();
		o0700PhysicianOrdersLabel.setTheme(theme);

		o0700PhysicianOrdersLabel.setFontSize(12);
		o0700PhysicianOrdersLabel.setFontStyle(Font.BOLD);
		o0700PhysicianOrdersLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		o0700PhysicianOrdersLabel.setText("O0700. Physician Orders");
		o0700PhysicianOrdersLabel.setBounds(10, 6, 198, 14);
		panel_44.add(o0700PhysicianOrdersLabel);

		final JxPanel panel_45 = new JxPanel();
		panel_45.setTheme(theme);
		panel_45.setLayout(null);
		panel_45.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_45.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_45.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 40);
		panel_43.add(panel_45);

		txtO0700 = new JxText();
		txtO0700.setTheme(theme);
		txtO0700.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0700.setBounds(20, 19, 40, 18);
		panel_45.add(txtO0700);

		final JxLabel enterDaysLabel_1 = new JxLabel();
		enterDaysLabel_1.setTheme(theme);

		enterDaysLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterDaysLabel_1.setText("Enter Days");
		enterDaysLabel_1.setBounds(15, 3, 54, 14);
		panel_45.add(enterDaysLabel_1);

		final JxPanel panel_46 = new JxPanel();
		panel_46.setTheme(theme);
		panel_46.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_46.setLayout(null);

		panel_46.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 40);
		panel_43.add(panel_46);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6.setFontStyle(Font.BOLD);
		label_6.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_6
				.setText("<html><body>Over the last 14days, <b> on how many days did the physician ( or authorised assistant or practitioner) change the resident's orders ?</b>");
		label_6.setBounds(10, 15, 750, 14);
		panel_46.add(label_6);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionO sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		sectionO.setO0700(getInt(txtO0700.getText()));
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
		txtO0700.setText(mds3SectionO.getO0700() + "");

	}

}
