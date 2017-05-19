package medrex.client.mds3.ui.subSections.sectionC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelC0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1246001388447789290L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbC0100;

	public PanelC0100() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(840, 135));
		setLayout(null);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_3, false));
		panel_8.setBounds(0, 0, 840, 125);
		panel_8.setPreferredSize(new Dimension(840, 100));
		add(panel_8);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setBounds(10, 10, 820, 105);

		panel_8.add(panel_1_2);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(820, 105));

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setLayout(null);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5_2.setBounds(0, 0, 820, 50);
		panel_1_2.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);
		a0100Label_2.setBounds(10, 6, 446, 15);

		a0100Label_2.setFontSize(12);
		a0100Label_2.setFontStyle(Font.BOLD);
		a0100Label_2
				.setText("C0100. Should Brief Interview for mental status (C0200 - C0500) be conducted?");
		panel_5_2.add(a0100Label_2);

		final JxLabel attemtToConductLabel = new JxLabel();
		attemtToConductLabel.setTheme(theme);

		attemtToConductLabel.setFontSize(12);
		attemtToConductLabel.setBounds(10, 27, 409, 14);
		attemtToConductLabel
				.setText("Attemt to conduct interview with all residents");
		panel_5_2.add(attemtToConductLabel);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		panel_6_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(0, 49, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 56);
		panel_1_2.add(panel_6_2);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_6_2.add(enterCodeLabel_2);

		cmbC0100 = new JxComboBox();
		cmbC0100.setTheme(theme);
		cmbC0100.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbC0100.setPreferredSize(new Dimension(50, 20));
		cmbC0100.setBounds(15, 30, 50, 22);
		panel_6_2.add(cmbC0100);

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(80, 49, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 56);
		panel_1_2.add(panel_7_2);

		final JxLabel aNationalProviderLabel_3 = new JxLabel();
		aNationalProviderLabel_3.setTheme(theme);
		aNationalProviderLabel_3
				.setText("<html><body>0.<b> No</b>  (resident is rarely / never understood)-> Skip to and complete C0700-C1000 , staff  Assessment for mental status");
		aNationalProviderLabel_3.setBounds(10, 5, 607, 14);
		panel_7_2.add(aNationalProviderLabel_3);

		final JxLabel aNationalProviderLabel_1_3 = new JxLabel();
		aNationalProviderLabel_1_3.setTheme(theme);
		aNationalProviderLabel_1_3
				.setText("<html><body>1. <b>Yes</b> - > Continue to C0200, Repetetion of three Words.");
		aNationalProviderLabel_1_3.setBounds(10, 25, 311, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);
	}

	public void doSave() {
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		sectionC.setC0100(cmbC0100.getSelectedItem().toString());
	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbC0100.setSelectedItem(mds3sectionC.getC0100());
	}

}
