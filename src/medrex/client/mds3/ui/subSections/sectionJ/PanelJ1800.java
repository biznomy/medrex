package medrex.client.mds3.ui.subSections.sectionJ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

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

public class PanelJ1800 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3227069404742980490L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbJ1800;

	public PanelJ1800() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 100));
		setBackground(Color.WHITE);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setBounds(0, 0, 840, 100);
		add(panel_1_2);

		panel_1_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 100));

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_7);
		panel_5_2.setBounds(0, 0, 840, 25);
		panel_1_2.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);

		a0100Label_2.setFontSize(12);
		a0100Label_2
				.setText("<html><b>J1800. Any Falls Since Admission or prior Assessment (OBRA,PPS,or Discharge),</b>whichever is more recent.");
		a0100Label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_5_2.add(a0100Label_2);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		panel_6_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2.setBounds(0, 24, 80, 76);
		panel_1_2.add(panel_6_2);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_6_2.add(enterCodeLabel_2);

		cmbJ1800 = new JxComboBox();
		cmbJ1800.setTheme(theme);
		cmbJ1800.setModel(new DefaultComboBoxModel(
				new String[] { " ", "0", "1" }));

		cmbJ1800.setPreferredSize(new Dimension(50, 20));
		cmbJ1800.setBounds(10, 30, 50, 20);
		panel_6_2.add(cmbJ1800);

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(79, 24, 761, 76);
		panel_1_2.add(panel_7_2);

		final JxLabel aNationalProviderLabel_3 = new JxLabel();
		aNationalProviderLabel_3.setTheme(theme);
		aNationalProviderLabel_3
				.setText("<html><body>Has the resident <b>had any falls since admission or the prior assessment</b>(OBRA,PPS,or Discharge), whichever is more recent.");
		aNationalProviderLabel_3.setBounds(10, 5, 706, 14);
		aNationalProviderLabel_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_2.add(aNationalProviderLabel_3);

		final JxLabel aNationalProviderLabel_1_3 = new JxLabel();
		aNationalProviderLabel_1_3.setTheme(theme);
		aNationalProviderLabel_1_3
				.setText("<html><body>01. <b>Yes</b> - > Continue to J1900 Number of falls Since admission or prior Assessment (OBRA,PPS,Or Discharge)");
		aNationalProviderLabel_1_3.setBounds(21, 43, 676, 14);
		aNationalProviderLabel_1_3
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_2.add(aNationalProviderLabel_1_3);

		final JxLabel aNationalProviderLabel_1_3_2 = new JxLabel();
		aNationalProviderLabel_1_3_2.setTheme(theme);
		aNationalProviderLabel_1_3_2
				.setText("<html>0. <b>No - > </b>skip to K0100 swallowing Disorder");
		aNationalProviderLabel_1_3_2.setBounds(20, 25, 311, 14);
		aNationalProviderLabel_1_3_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_2.add(aNationalProviderLabel_1_3_2);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmbJ1800.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ1800(cmbJ1800.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ1800("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmbJ1800.setSelectedItem(mds3sectionJ.getJ1800());

	}

}
