package medrex.client.mds3.ui.subSections.sectionZ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelZHeader extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4361430259769090553L;
	Theme theme = new BlackOverWhiteTheme();
	private JxPanel panel;

	public PanelZHeader() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 30));
		setLayout(null);
		setBackground(Color.WHITE);
		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_2.setBackground(Mds3Constants.BACKGROUND_DARKGRAY);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 21));
		add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);
		panel_3.setBackground(Mds3Constants.BACKGROUND_DARKGRAY);
		panel_3.setBounds(10, 2, 201, 18);
		panel_2.add(panel_3);

		final JxLabel sectionALabel = new JxLabel();
		sectionALabel.setFontSize(14);
		sectionALabel.setTheme(theme);
		sectionALabel.setBounds(10, 2, 74, 19);
		sectionALabel.setForeground(Color.WHITE);

		sectionALabel.setFontStyle(Font.BOLD);
		sectionALabel.setText("Section Z");
		panel_3.add(sectionALabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setLayout(null);
		panel_4.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_4.setBounds(246, 2, 592, 21);
		panel_2.add(panel_4);

		final JxLabel correctionRequestLabel = new JxLabel();
		correctionRequestLabel.setFontSize(14);
		correctionRequestLabel.setTheme(theme);

		correctionRequestLabel.setFontStyle(Font.BOLD);
		correctionRequestLabel.setText("Assessment Administration");
		correctionRequestLabel.setBounds(10, 4, 273, 17);
		panel_4.add(correctionRequestLabel);

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
