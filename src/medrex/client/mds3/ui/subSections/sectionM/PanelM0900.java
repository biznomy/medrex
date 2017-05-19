package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelM0900 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5530705431415113925L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelM0900() {
		super();
		setPreferredSize(new Dimension(841, 50));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel.setLayout(null);
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.setBounds(0, 0, 841, 50);
		add(panel);

		final JxLabel m0300CurrentNumberLabel = new JxLabel();
		m0300CurrentNumberLabel.setTheme(theme);

		m0300CurrentNumberLabel.setFontSize(12);
		m0300CurrentNumberLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		m0300CurrentNumberLabel
				.setText("<html><body><b>M0900.  Healted Pressure Ulcers </b><br> Complete only if A0310E=0  </b>");
		m0300CurrentNumberLabel.setBounds(10, 0, 465, 50);
		panel.add(m0300CurrentNumberLabel);
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
