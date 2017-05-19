package medrex.client.mds3.ui.subSections.sectionG;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionG.Mds3SectionG;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelG0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1234900041731002996L;

	Theme theme = new BlackOverWhiteTheme();

	private JxCheckBox cbG0600E;
	private JxCheckBox cbG0600D;
	private JxCheckBox cbG0600C;
	private JxCheckBox cbG0600B;
	private JxCheckBox cbG0600A;

	public PanelG0600() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 224));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 224);
		add(panel);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme(theme);
		panel_28.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_28.setBounds(0, 0, 840, 26);
		panel_28.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_28.setLayout(null);
		panel_28.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 26));
		panel.add(panel_28);

		final JxLabel g0600MobilityDevicesLabel = new JxLabel();
		g0600MobilityDevicesLabel.setTheme(theme);
		g0600MobilityDevicesLabel.setBackground(ColorConstants.MDS_BACK_COLOR);
		g0600MobilityDevicesLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		g0600MobilityDevicesLabel.setFontSize(12);
		g0600MobilityDevicesLabel.setFontStyle(Font.BOLD);
		g0600MobilityDevicesLabel.setBounds(10, 7, 248, 14);
		panel_28.add(g0600MobilityDevicesLabel);
		g0600MobilityDevicesLabel.setText("G0600. Mobility Devices");

		final JxPanel panel_29 = new JxPanel();
		panel_29.setTheme(theme);
		panel_29.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_29.setLayout(null);

		panel_29.setBounds(0, 26, 840, 26);
		panel.add(panel_29);

		final JxLabel codeForLimitationLabel_1 = new JxLabel();
		codeForLimitationLabel_1.setTheme(theme);

		codeForLimitationLabel_1.setFontSize(12);
		codeForLimitationLabel_1.setFontStyle(Font.BOLD);
		codeForLimitationLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		codeForLimitationLabel_1.setText("Check all that were normally used");
		codeForLimitationLabel_1.setBounds(35, 7, 455, 14);
		panel_29.add(codeForLimitationLabel_1);

		final JxPanel panel_30 = new JxPanel();
		panel_30.setTheme(theme);
		// panel_30.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		panel_30.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_30.setLayout(null);
		panel_30.setBounds(0, 52, 70, 172);
		panel.add(panel_30);

		cbG0600A = new JxCheckBox();
		cbG0600A.setTheme(theme);

		cbG0600A.setText("");
		cbG0600A.setBounds(30, 10, 14, 17);
		panel_30.add(cbG0600A);

		cbG0600B = new JxCheckBox();
		cbG0600B.setTheme(theme);

		cbG0600B.setText("New JxCheckBox");
		cbG0600B.setBounds(30, 43, 14, 17);
		panel_30.add(cbG0600B);

		cbG0600C = new JxCheckBox();
		cbG0600C.setTheme(theme);

		cbG0600C.setBounds(30, 81, 14, 17);
		panel_30.add(cbG0600C);
		cbG0600C.setText("New JxCheckBox");

		cbG0600D = new JxCheckBox();
		cbG0600D.setTheme(theme);

		cbG0600D.setText("New JxCheckBox");
		cbG0600D.setBounds(30, 117, 14, 17);
		panel_30.add(cbG0600D);

		cbG0600E = new JxCheckBox();
		cbG0600E.setTheme(theme);

		cbG0600E.setText("New JxCheckBox");
		cbG0600E.setBounds(30, 150, 14, 17);
		panel_30.add(cbG0600E);

		final JxPanel panel_31 = new JxPanel();
		panel_31.setTheme(theme);
		panel_31.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_31.setLayout(null);

		panel_31.setBounds(70, 52, 770, 35);
		panel.add(panel_31);

		final JxLabel aCanecrutchLabel = new JxLabel();
		aCanecrutchLabel.setTheme(theme);
		aCanecrutchLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aCanecrutchLabel.setText("<html><body><b>A. Cane/crutch</b>");
		aCanecrutchLabel.setBounds(10, 10, 234, 14);
		panel_31.add(aCanecrutchLabel);

		final JxPanel panel_32 = new JxPanel();
		panel_32.setTheme(theme);
		panel_32.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_32.setLayout(null);

		panel_32.setBounds(70, 86, 770, 35);
		panel.add(panel_32);

		final JxLabel bWalkerLabel = new JxLabel();
		bWalkerLabel.setTheme(theme);

		g0600MobilityDevicesLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bWalkerLabel.setText("<html><body><b>B. Walker </b>");
		bWalkerLabel.setBounds(10, 10, 191, 14);
		panel_32.add(bWalkerLabel);

		final JxPanel panel_33 = new JxPanel();
		panel_33.setTheme(theme);
		panel_33.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_33.setLayout(null);

		panel_33.setBounds(70, 120, 770, 35);
		panel.add(panel_33);

		final JxLabel cWheelchairLabel = new JxLabel();
		cWheelchairLabel.setTheme(theme);
		cWheelchairLabel
				.setText("<html><body><b>C. Wheelchair </b> ( manual or electric )");
		cWheelchairLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		cWheelchairLabel.setBounds(10, 10, 184, 14);
		panel_33.add(cWheelchairLabel);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_34.setLayout(null);

		panel_34.setBounds(70, 154, 770, 35);
		panel.add(panel_34);

		final JxLabel dLimbProsthesisLabel = new JxLabel();
		dLimbProsthesisLabel.setTheme(theme);
		dLimbProsthesisLabel.setText("<html><body><b>D. Limb prosthesis </b>");
		dLimbProsthesisLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dLimbProsthesisLabel.setBounds(10, 10, 146, 14);
		panel_34.add(dLimbProsthesisLabel);

		final JxPanel panel_35 = new JxPanel();
		panel_35.setTheme(theme);
		panel_35.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_35.setLayout(null);

		panel_35.setBounds(70, 187, 770, 37);
		panel.add(panel_35);

		final JxLabel zNoneOtLabel = new JxLabel();
		zNoneOtLabel.setTheme(theme);
		zNoneOtLabel
				.setText("<html><body><b>Z. None ot the above </b>were used");
		zNoneOtLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		zNoneOtLabel.setBounds(10, 10, 253, 14);
		panel_35.add(zNoneOtLabel);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		mds3sectionG.setG0600A(cbG0600A.isSelected());
		mds3sectionG.setG0600B(cbG0600B.isSelected());
		mds3sectionG.setG0600C(cbG0600C.isSelected());
		mds3sectionG.setG0600D(cbG0600D.isSelected());
		mds3sectionG.setG0600E(cbG0600E.isSelected());

	}

	public void doUpdate() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		cbG0600A.setSelected(mds3sectionG.isG0600A());
		cbG0600B.setSelected(mds3sectionG.isG0600B());
		cbG0600C.setSelected(mds3sectionG.isG0600C());
		cbG0600D.setSelected(mds3sectionG.isG0600D());
		cbG0600E.setSelected(mds3sectionG.isG0600E());

	}
}
