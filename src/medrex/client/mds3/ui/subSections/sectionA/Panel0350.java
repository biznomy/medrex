package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class Panel0350 extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8725191365343262369L;
	Theme theme = new BlackOverWhiteTheme();

	public Panel0350() {
		super();

		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 120));

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 840, 120);

		add(panel_7);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBounds(0, 0, 840, 20);
		panel_15.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_7.add(panel_15);

		final JxLabel n0300injectionsLabel_1 = new JxLabel();
		n0300injectionsLabel_1.setTheme(theme);
		n0300injectionsLabel_1.setBounds(35, 0, 120, 20);
		panel_15.add(n0300injectionsLabel_1);

		n0300injectionsLabel_1.setFontSize(12);
		n0300injectionsLabel_1.setFontStyle(Font.BOLD);
		n0300injectionsLabel_1.setText("N0350. Insulin");

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBounds(0, 20, 80, 100);
		panel_7.add(panel_8);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_8.setLayout(null);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBounds(80, 20, 760, 100);
		panel_7.add(panel_9);
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(0, 0, 760, 50);

		panel_9.add(panel_10);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1
				.setText("<html><body><b> A. Insulin injections -Record the number of days that insulin injections </b> were received during the last 7 days or since admission/<br> &nbsp &nbsp reenry if less than 7 days ");
		label_1.setBounds(10, 5, 750, 45);
		panel_10.add(label_1);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBounds(0, 50, 760, 50);

		panel_9.add(panel_11);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2.setBounds(10, 5, 750, 45);
		label_2
				.setText("<html><body><b> B. Order for insulin -Record the number of days the physician (or authorized assistant or practitioner)changed the resident's <br> &nbsp &nbsp insulin orders </b> during the last 7 days or since admission /reentry if less than 7 days");
		panel_11.add(label_2);

	}

}
