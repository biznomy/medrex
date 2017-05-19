package medrex.client.mds3.ui.commons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class Mds3Footer extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4481794826063556217L;
	Theme theme = new BlackOverWhiteTheme();

	public Mds3Footer() {
		setOpaque(false);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 30));
		setBackground(Color.WHITE);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);

		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1.setFontSize(14);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setPreferredSize(new Dimension(800, 30));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1);
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
