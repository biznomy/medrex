package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelMHeader extends JxPanel implements Mds3SubSection {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5508016300352897403L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelMHeader() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setOpaque(true);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 30));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setOpaque(false);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		add(panel);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Mds3Constants.BACKGROUND_DARKGRAY);
		panel_3.setBounds(0, 0, 230, 25);
		panel.add(panel_3);

		final JxLabel sectionALabel = new JxLabel();
		sectionALabel.setFontSize(14);
		sectionALabel.setTheme(theme);
		sectionALabel.setBounds(10, 0, 90, 25);
		sectionALabel.setForeground(Color.WHITE);

		sectionALabel.setFontStyle(Font.BOLD);
		sectionALabel.setText("Section M");
		panel_3.add(sectionALabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_4.setBounds(230, 0, 610, 25);
		panel.add(panel_4);

		final JxLabel identificationInformationLabel = new JxLabel();
		identificationInformationLabel.setFontSize(14);
		identificationInformationLabel.setTheme(theme);
		identificationInformationLabel.setBounds(5, 5, 385, 16);
		identificationInformationLabel
				.setForeground(Mds3Constants.FONT_COLOR_DARKGRAY);

		identificationInformationLabel.setFontStyle(Font.BOLD);
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Skin Conditions");
		panel_4.add(identificationInformationLabel);
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
