package medrex.client.mds3.ui.subSections.sectionD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.SwingConstants;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelDHeader extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2814120556104552256L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelDHeader() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 30));
		setBackground(Color.WHITE);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBounds(0, 0, 840, 25);
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(840, 25));
		add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBackground(Mds3Constants.BACKGROUND_DARKGRAY);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(2);
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.setLayout(flowLayout_1);
		panel_3.setBounds(0, 0, 231, 25);
		panel_2.add(panel_3);

		final JxLabel sectionALabel = new JxLabel();
		sectionALabel.setFontSize(14);
		sectionALabel.setTheme(theme);
		sectionALabel.setForeground(Color.WHITE);

		sectionALabel.setFontStyle(Font.BOLD);
		sectionALabel.setText("Section D");
		panel_3.add(sectionALabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(246, 2, 592, 21);
		panel_2.add(panel_4);

		final JxLabel identificationInformationLabel = new JxLabel();
		identificationInformationLabel.setFontSize(14);
		identificationInformationLabel.setTheme(theme);
		identificationInformationLabel
				.setForeground(Mds3Constants.FONT_COLOR_DARKGRAY);

		identificationInformationLabel.setFontStyle(Font.BOLD);
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Mood");
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
