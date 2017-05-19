package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelM0800 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3548296838074599745L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelM0800() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 100));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setOpaque(false);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel.setLayout(null);
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 100);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 50);
		panel.add(panel_1);

		final JxLabel m0300CurrentNumberLabel = new JxLabel();
		m0300CurrentNumberLabel.setTheme(theme);

		m0300CurrentNumberLabel.setFontSize(12);
		m0300CurrentNumberLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		m0300CurrentNumberLabel
				.setText("<html><body><b> M0800. Worsening in Pressure Ulcer Status Since Prior Assessment (OBRA,PPS,or Discharge) </b> <br> Complete only if A0310E=0  ");
		m0300CurrentNumberLabel.setBounds(10, 10, 679, 30);
		panel_1.add(m0300CurrentNumberLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setLayout(null);

		panel_2.setBounds(0, 49, Mds3Constants.PAGE_WIDTH, 51);
		panel.add(panel_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3
				.setText("<html><body>Indicate the number of current pressure ulcers that were <b> not present or were at lesser stage </b> on prior assessment (OBRA,PPS or Discharge) <br> if no current pressure ulcer at a given stage, enter 0 ");
		label_3.setBounds(10, 5, 825, 40);
		panel_2.add(label_3);

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
