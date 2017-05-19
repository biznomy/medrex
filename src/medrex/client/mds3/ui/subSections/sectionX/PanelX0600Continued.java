package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX0600Continued extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 831921371503415312L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbX0600D;

	public PanelX0600Continued() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 25));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel x0600TypeOfLabel = new JxLabel();
		x0600TypeOfLabel.setTheme(theme);

		x0600TypeOfLabel.setFontSize(12);
		x0600TypeOfLabel.setFontStyle(Font.BOLD);
		x0600TypeOfLabel.setText("X0600.   Type of Assessment - Continued");
		x0600TypeOfLabel.setBounds(10, 5, 231, 16);
		panel_1.add(x0600TypeOfLabel);

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
