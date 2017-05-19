package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelM0610 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8313954773001321014L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelM0610() {
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
				.setText("<html><body><b>M0610. Dimensions of Unhealed Stage 3 or 4 Pressure Ulcers or Eschar</b><br>Complete only if M0300C1,M0300D1 or M0300F1 is greater than 0");
		m0300CurrentNumberLabel.setBounds(10, 5, 475, 45);
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
				.setText("<html><body>If the resident has one or more unhealed (non-epithelialized) stage 3 or 4 pressure ulcers or an unstageable pressure ulcer due to slough or eschar,<br>identify the pressure ulcer with the largest surface area (length x width) and record in centimeters ");
		label_3.setBounds(10, 5, 820, 45);
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
