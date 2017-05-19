package medrex.client.mds3.ui.subSections.sectionJ;

import java.awt.Color;
import java.awt.Dimension;

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

public class PanelJ0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2473376123740182345L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbJ0200;

	public PanelJ0200() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 130));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_3, false));
		panel_8.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 120);

		panel_8.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 120));
		add(panel_8);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setBounds(10, 10, 820, 100);

		panel_8.add(panel_1_2);
		panel_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(820, 100));

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setLayout(null);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_2.setBounds(0, 0, 820, 50);
		panel_1_2.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);
		a0100Label_2.setBounds(11, 6, 635, 35);

		a0100Label_2.setFontSize(12);
		a0100Label_2
				.setText("<html><b>J0200. Should Pain Assessment Interview be conducted?</b><br>Attempt to conduct Interview with all Residents. If resident is comatose, skip to J1100, Shortness of Breath (dyspnea)");
		panel_5_2.add(a0100Label_2);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		panel_6_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2.setBounds(0, 49, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 50);
		panel_1_2.add(panel_6_2);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(15, 8, 54, 14);
		panel_6_2.add(enterCodeLabel_2);

		cmbJ0200 = new JxComboBox();
		cmbJ0200.setTheme(theme);
		cmbJ0200.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbJ0200.setPreferredSize(new Dimension(50, 20));
		cmbJ0200.setBounds(15, 25, 50, 22);
		panel_6_2.add(cmbJ0200);

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(79, 49, 741, 50);
		panel_1_2.add(panel_7_2);

		final JxLabel aNationalProviderLabel_3 = new JxLabel();
		aNationalProviderLabel_3.setTheme(theme);

		aNationalProviderLabel_3.setFontSize(12);
		aNationalProviderLabel_3
				.setText("<html><body>0.<b> No </b> (resident is rarely/never understood) -> Skip to and complete J0800 , indicators of Pain or Possible Pain");
		aNationalProviderLabel_3.setBounds(10, 5, 607, 14);
		panel_7_2.add(aNationalProviderLabel_3);

		final JxLabel aNationalProviderLabel_1_3 = new JxLabel();
		aNationalProviderLabel_1_3.setTheme(theme);

		aNationalProviderLabel_1_3.setFontSize(12);
		aNationalProviderLabel_1_3
				.setText("<html><body>1. <b>Yes</b> -> Continue to J0300, Pain Presence");
		aNationalProviderLabel_1_3.setBounds(10, 25, 311, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmbJ0200.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ0200(cmbJ0200.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0200("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmbJ0200.setSelectedItem(mds3sectionJ.getJ0200());

	}

}
