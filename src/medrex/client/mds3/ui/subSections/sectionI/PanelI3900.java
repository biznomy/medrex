package medrex.client.mds3.ui.subSections.sectionI;

import java.awt.Dimension;

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

public class PanelI3900 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8562375713919438407L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cb3900;

	public PanelI3900() {
		super();
		setPreferredSize(new Dimension(840, 35));
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

		cb3900 = new JxCheckBox();
		cb3900.setTheme(theme);

		cb3900.setBounds(30, 10, 16, 16);
		panel_1.add(cb3900);
		cb3900.setText(" ");

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
		label
				.setText("<html><b>13900.Hip Fracture - </b> any fracture that has a relationship to current status , treatments , monitoring (e.g., sub-capital fractures, and <br> &nbsp &nbsp &nbsp  &nbsp &nbsp fractures of the trochanter and femoral neck)");
		label.setBounds(10, 0, 741, 37);
		panel_2.add(label);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionI mds3sectionI = (Mds3SectionI) Mds3Controller.getInstance()
				.getSection(Mds3SectionI.class);
		mds3sectionI.setI3900(cb3900.isSelected());
	}

	public void doUpdate() {
		Mds3SectionI mds3sectionI = (Mds3SectionI) Mds3Controller.getInstance()
				.getSection(Mds3SectionI.class);
		cb3900.setSelected(mds3sectionI.isI3900());
	}
}
