package medrex.client.mds3.ui.subSections.sectionI;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionI.Mds3SectionI;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelI4800 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1701990831727618750L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cb4800;

	public PanelI4800() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 35));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 35);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);
		panel_1.setBounds(0, -1, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 37);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_1);

		cb4800 = new JxCheckBox();
		cb4800.setTheme(theme);

		cb4800.setBounds(30, 10, 16, 16);
		panel_1.add(cb4800);
		cb4800.setText(" ");

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(Mds3Constants.SUBSECTION_WIDTH_LEFT_1 - 1, -1,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1 + 1, 37);

		panel.add(panel_2);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setFontStyle(Font.BOLD);
		label
				.setText("<html><b> 14800. Dementia</b> (eg) Non - Alzheimer's dematia such as vascular or multi - infract demantia; mixed dementialfrontemporal demantia<br> such as Pick's Disease ; and demantia related to stroke, pakinson's or creutzfeldt-jakob disease");
		label.setBounds(10, 5, 741, 27);
		panel_2.add(label);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionI mds3sectionI = (Mds3SectionI) Mds3Controller.getInstance()
				.getSection(Mds3SectionI.class);
		mds3sectionI.setI4800(cb4800.isSelected());
	}

	public void doUpdate() {
		Mds3SectionI mds3sectionI = (Mds3SectionI) Mds3Controller.getInstance()
				.getSection(Mds3SectionI.class);
		cb4800.setSelected(mds3sectionI.isI4800());
	}
}
