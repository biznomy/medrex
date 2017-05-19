package medrex.client.mds3.ui.subSections.sectionJ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionJ.Mds3SectionJ;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelJ0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8446598692290434084L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbJ0300;

	public PanelJ0300() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 155));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 155);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBounds(5, 5, 830, 150);
		panel.add(panel_1);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);

		panel_5_1_1_1.setFontSize(12);
		panel_5_1_1_1.setLayout(null);
		panel_5_1_1_1.setBounds(0, 0, 830, 25);
		panel_5_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_1.add(panel_5_1_1_1);

		final JxLabel a0100Label_1_1_1 = new JxLabel();
		a0100Label_1_1_1.setTheme(theme);
		a0100Label_1_1_1.setBounds(11, 6, 228, 17);

		a0100Label_1_1_1.setFontSize(14);
		a0100Label_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1.setText("Pain Assessment Interview");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBounds(0, 24, 830, 25);
		panel_5_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);
		a0100Label_1_1.setBounds(11, 6, 352, 15);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1.setText("J0300.  Pain Presence");
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(0, 0, 820, 155);
		panel_1.add(panel_1_1);

		panel_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(820, 100));

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(79, 48, 751, 102);
		panel_1_1.add(panel_7_1);

		final JxLabel aNationalProviderLabel_3_1 = new JxLabel();
		aNationalProviderLabel_3_1.setTheme(theme);

		aNationalProviderLabel_3_1.setFontSize(12);
		aNationalProviderLabel_3_1
				.setText("<html>Ask resident :<b> <i> \"Have you had pain or hurting at any time </b> in the last 5 days?\" </i>");
		aNationalProviderLabel_3_1.setBounds(10, 5, 472, 20);
		panel_7_1.add(aNationalProviderLabel_3_1);

		final JxLabel aNationalProviderLabel_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_3_1.setTheme(theme);

		aNationalProviderLabel_1_3_1.setFontSize(12);
		aNationalProviderLabel_1_3_1
				.setText("<html><body>0. <b>No </b> -> Skip to J1100, Shortness of Breath");
		aNationalProviderLabel_1_3_1.setBounds(31, 31, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1
				.setText("<html><body>1. <b>Yes </b> -> Continue to J0400, Pain Frequency");
		aNationalProviderLabel_1_3_1_1.setBounds(31, 51, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_2
				.setText("<html><body>9. <b>Unable to answer </b> -> Skip to J0800, Indicators of Pain or Possible Pain");
		aNationalProviderLabel_1_3_1_2.setBounds(31, 71, 553, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_2);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 48, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 102);
		panel_1_1.add(panel_6_1);
		panel_6_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(15, 28, 54, 14);
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		cmbJ0300 = new JxComboBox();
		cmbJ0300.setTheme(theme);
		cmbJ0300.setBounds(15, 48, 50, 22);
		cmbJ0300.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"9" }));

		cmbJ0300.setPreferredSize(new Dimension(50, 22));
		panel_6_1.add(cmbJ0300);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmbJ0300.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ0300(cmbJ0300.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0300("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmbJ0300.setSelectedItem(mds3sectionJ.getJ0300());

	}

}
