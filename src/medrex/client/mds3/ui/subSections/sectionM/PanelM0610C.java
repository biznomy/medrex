package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionM.Mds3SectionM;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelM0610C extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 904600155979785288L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtM0610C;

	public PanelM0610C() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 50));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 50);
		add(panel);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_34.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 50);
		panel.add(panel_34);
		panel_34.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_34.setLayout(null);

		final JxLabel cmLabel_2 = new JxLabel();
		cmLabel_2.setTheme(theme);
		cmLabel_2.setBounds(66, 15, 13, 20);
		panel_34.add(cmLabel_2);
		cmLabel_2.setText("cm");

		txtM0610C = new JxText();
		txtM0610C.setTheme(theme);
		txtM0610C.setBounds(2, 15, 58, 22);
		panel_34.add(txtM0610C);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 50);
		panel.add(panel_16);
		panel_16.setLayout(null);
		panel_16.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		final JxLabel cPressureUlcerLabel = new JxLabel();
		cPressureUlcerLabel.setTheme(theme);
		cPressureUlcerLabel
				.setText("<html><body><b>C. </b> &nbsp <b> Pressure ulcer depth :</b> depth of same pressure ulcer from the visible surface to the deepest area (if depth is unknown, <br> &nbsp &nbsp &nbsp enter a dash in each box) ");

		cPressureUlcerLabel.setFontSize(12);
		cPressureUlcerLabel.setBounds(10, 10, 670, 35);
		panel_16.add(cPressureUlcerLabel);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		mds3sectionM.setM0610C(txtM0610C.getText());
	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		txtM0610C.setText(mds3sectionM.getM0610C());
	}

}
