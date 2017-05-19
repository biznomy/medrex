package medrex.client.mds3.ui.subSections.sectionI;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelMusculoskeletal extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1451203579929948530L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelMusculoskeletal() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 20));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 20);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 20);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_1);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 0,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 20);
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_2);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setFontStyle(Font.BOLD);
		label.setText("Musculoskeletal ");
		label.setBounds(10, 0, 598, 14);
		panel_2.add(label);

	}

	@Override
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

}
