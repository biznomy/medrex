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

public class PanelI6200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -682768539463032190L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cb6200;

	public PanelI6200() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 30));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 30);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 30);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_1);

		cb6200 = new JxCheckBox();
		cb6200.setTheme(theme);

		cb6200.setBounds(30, 5, 16, 16);
		panel_1.add(cb6200);
		cb6200.setText(" ");

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(Mds3Constants.SUBSECTION_WIDTH_LEFT_1 - 1, -1,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1 + 1, 32);

		panel.add(panel_2);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label
				.setText("<html><body><b> 16200. Asthma,Chronic Obstructive Pulmonary Disease (COPD),or Chronic Lung Disease </b> (e.g., chronic bronchitis and restrictive lung diseases such as asbestosis ");
		label.setBounds(10, 0, 740, 30);
		panel_2.add(label);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionI mds3sectionI = (Mds3SectionI) Mds3Controller.getInstance()
				.getSection(Mds3SectionI.class);
		mds3sectionI.setI6200(cb6200.isSelected());
	}

	public void doUpdate() {
		Mds3SectionI mds3sectionI = (Mds3SectionI) Mds3Controller.getInstance()
				.getSection(Mds3SectionI.class);
		cb6200.setSelected(mds3sectionI.isI6200());
	}
}
