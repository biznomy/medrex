package medrex.client.mds3.ui.subSections.sectionI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelActiveDignosis extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4253608083171839610L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelActiveDignosis() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 40));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 40);
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		add(panel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label
				.setText("<html><b>Active diagnosis in the last 7 days - Check all that apply<br></b>Diagnosis listed in the parantheses are provided as examples and shouls not be considered as all - inclusive lists ");
		label.setBounds(10, 0, 700, 40);
		panel.add(label);

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
