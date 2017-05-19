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

public class PanelM0610A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6108972931833939139L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtM0610A1;

	public PanelM0610A() {
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

		txtM0610A1 = new JxText();
		txtM0610A1.setTheme(theme);
		txtM0610A1.setBounds(2, 15, 58, 22);
		panel_34.add(txtM0610A1);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 50);
		panel.add(panel_16);
		panel_16.setLayout(null);
		panel_16.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);
		label_4
				.setText("<html><body><b>  A. </b> &nbsp Pressure ulcer length: </b>Longest length fromhead to toe ");

		label_4.setFontSize(12);
		label_4.setBounds(10, 10, 500, 30);
		panel_16.add(label_4);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		mds3sectionM.setM0300E_1(txtM0610A1.getText());
	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		txtM0610A1.setText(mds3sectionM.getM0300E_1());
	}

}
