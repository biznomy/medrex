package medrex.client.mds3.ui.subSections.sectionC;

import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelC0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5244878942881845740L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelC0300() {
		super();
		setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		setPreferredSize(new Dimension(840, 25));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.setLayout(null);
		panel.setBounds(5, 0, 830, 25);
		add(panel);

		final JxLabel a0100Label_1_1_2 = new JxLabel();
		a0100Label_1_1_2.setTheme(theme);
		a0100Label_1_1_2.setBounds(5, 0, 500, 25);

		a0100Label_1_1_2.setFontSize(12);
		a0100Label_1_1_2
				.setText("<html><body><b>C0300. Temporal Orientation</b>. (orientation to year mouth and day)");
		panel.add(a0100Label_1_1_2);
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
