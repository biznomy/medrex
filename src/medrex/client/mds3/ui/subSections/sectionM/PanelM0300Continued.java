package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelM0300Continued extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1934071356023621628L;
	Theme theme = new BlackOverWhiteTheme();

	@Override
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	public PanelM0300Continued() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 25));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		add(panel);

		final JxLabel m0300ContinuedOnLabel = new JxLabel();
		m0300ContinuedOnLabel.setTheme(theme);

		m0300ContinuedOnLabel.setFontSize(12);
		m0300ContinuedOnLabel.setFontStyle(Font.BOLD);
		m0300ContinuedOnLabel.setText("M0300 continued on the next Page");
		m0300ContinuedOnLabel.setBounds(10, 5, 298, 17);
		panel.add(m0300ContinuedOnLabel);
	}

}
