package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelMSubHeader extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4892994104033627916L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelMSubHeader() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 55));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_3, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 50);
		add(panel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBounds(10, 10, 820, 30);
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_6);
		panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setLayout(null);
		panel_6.setPreferredSize(new Dimension(820, 30));

		final JxLabel reportBasedOnLabel = new JxLabel();
		reportBasedOnLabel.setFontSize(14);
		reportBasedOnLabel.setTheme(theme);
		reportBasedOnLabel.setHorizontalAlignment(SwingConstants.CENTER);

		reportBasedOnLabel.setForeground(Mds3Constants.FONT_COLOR_DARKGRAY);

		reportBasedOnLabel.setFontStyle(Font.BOLD);
		reportBasedOnLabel
				.setText("Report Based on highest Stage of existing Ulcer(s) at its worst; do not \"reverse\" stage");
		reportBasedOnLabel.setBounds(0, 0, 820, 30);
		panel_6.add(reportBasedOnLabel);
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
