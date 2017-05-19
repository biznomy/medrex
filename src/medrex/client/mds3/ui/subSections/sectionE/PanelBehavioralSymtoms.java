package medrex.client.mds3.ui.subSections.sectionE;

import java.awt.Dimension;
import java.awt.Font;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelBehavioralSymtoms extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6246789708666338431L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelBehavioralSymtoms() {
		super();
		setPreferredSize(new Dimension(840, 25));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		add(panel);

		final JxLabel behavioralSymptomsLabel = new JxLabel();
		behavioralSymptomsLabel.setTheme(theme);

		behavioralSymptomsLabel.setFontSize(12);
		behavioralSymptomsLabel.setFontStyle(Font.BOLD);
		behavioralSymptomsLabel.setText("Behavioral Symptoms");
		behavioralSymptomsLabel.setBounds(10, 5, 472, 16);
		panel.add(behavioralSymptomsLabel);

	}

	public void doSave() {
	}

	public void doUpdate() {

	}

}
