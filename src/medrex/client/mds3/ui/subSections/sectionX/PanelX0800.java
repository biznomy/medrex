package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX0800 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -205653711283434166L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtX0800;

	public PanelX0800() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 95));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 95);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel correctionAttestationLabel = new JxLabel();
		correctionAttestationLabel.setTheme(theme);

		correctionAttestationLabel.setFontSize(12);
		correctionAttestationLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		correctionAttestationLabel
				.setText("<html><body><b> Correction Attestation Section </b> - Complete this section to explain and attest to the modification/inactivation request");
		correctionAttestationLabel.setBounds(10, 5, 726, 14);
		panel_1.add(correctionAttestationLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_2.setBounds(0, 24, 840, 25);
		panel.add(panel_2);

		final JxLabel x0800CorrectionNumberLabel = new JxLabel();
		x0800CorrectionNumberLabel.setTheme(theme);

		x0800CorrectionNumberLabel.setFontSize(12);
		x0800CorrectionNumberLabel.setFontStyle(Font.BOLD);
		x0800CorrectionNumberLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		x0800CorrectionNumberLabel.setText("X0800.  Correction Number");
		x0800CorrectionNumberLabel.setBounds(10, 5, 283, 14);
		panel_2.add(x0800CorrectionNumberLabel);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);
		panel_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_3.setBounds(0, 48, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 47);
		panel.add(panel_3);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);

		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(15, 10, 54, 14);
		panel_3.add(enterCodeLabel);

		txtX0800 = new JxText();
		txtX0800.setTheme(theme);
		txtX0800.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtX0800.setBounds(15, 25, 50, 18);
		panel_3.add(txtX0800);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_4.setLayout(null);

		panel_4.setBounds(79, 48, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 47);
		panel.add(panel_4);

		final JxLabel enterLabel = new JxLabel();
		enterLabel.setTheme(theme);

		enterLabel.setFontSize(12);
		enterLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterLabel
				.setText("<html><body> <b> Enter the number of correction requests to modify/inactivate the existing record , including the present one");
		enterLabel.setBounds(22, 15, 686, 14);
		panel_4.add(enterLabel);
		doUpdate();

	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		sectionX.setX0800(txtX0800.getText());

	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		txtX0800.setText(mds3SectionX.getX0800());

	}

}
