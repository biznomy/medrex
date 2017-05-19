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

public class PanelM1040 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1900800401271207411L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelM1040() {
		super();
		setPreferredSize(new Dimension(840, 235));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, 840, 235);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBounds(0, 0, 840, 25);
		panel.add(panel_1);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);

		final JxLabel m1040OtherUlcersLabel = new JxLabel();
		m1040OtherUlcersLabel.setTheme(theme);

		m1040OtherUlcersLabel.setFontSize(12);
		m1040OtherUlcersLabel.setFontStyle(Font.BOLD);
		m1040OtherUlcersLabel
				.setText("M1040.   Other Ulcers, Wounds and skin problem");
		m1040OtherUlcersLabel.setBounds(10, 6, 387, 16);
		panel_1.add(m1040OtherUlcersLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setLayout(null);

		panel_2.setBounds(0, 24, 840, 220);
		panel.add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);

		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBounds(0, 0, 840, 20);
		panel_2.add(panel_3);

		final JxLabel checkAllThatLabel = new JxLabel();
		checkAllThatLabel.setTheme(theme);

		checkAllThatLabel.setFontSize(12);
		checkAllThatLabel.setFontStyle(Font.BOLD);
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(50, 3, 176, 14);
		panel_3.add(checkAllThatLabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setLayout(null);
		panel_4.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBounds(0, 19, 80, 191);
		panel_2.add(panel_4);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setLayout(null);
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBounds(79, 19, 761, 20);
		panel_2.add(panel_5);

		final JxLabel footProblemsLabel = new JxLabel();
		footProblemsLabel.setTheme(theme);

		footProblemsLabel.setFontSize(12);
		footProblemsLabel.setFontStyle(Font.BOLD);
		footProblemsLabel.setText("Foot problems");
		footProblemsLabel.setBounds(10, 3, 199, 14);
		panel_5.add(footProblemsLabel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);

		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setBounds(79, 38, 761, 20);
		panel_2.add(panel_6);

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);
		aLabel.setText("<html><body><b> A.");
		aLabel.setBounds(10, 3, 66, 16);
		panel_6.add(aLabel);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setLayout(null);

		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBounds(79, 57, 761, 20);
		panel_2.add(panel_7);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setLayout(null);

		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBounds(79, 76, 761, 20);
		panel_2.add(panel_8);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9.setBounds(79, 95, 761, 20);
		panel_2.add(panel_9);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);

		panel_10.setBounds(79, 114, 761, 20);
		panel_2.add(panel_10);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);

		panel_11.setBounds(79, 133, 761, 20);
		panel_2.add(panel_11);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);

		panel_12.setBounds(79, 152, 761, 20);
		panel_2.add(panel_12);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_13.setBounds(79, 171, 761, 20);
		panel_2.add(panel_13);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);

		panel_14.setBounds(79, 190, 761, 20);
		panel_2.add(panel_14);
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
