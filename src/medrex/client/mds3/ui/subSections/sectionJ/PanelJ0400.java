package medrex.client.mds3.ui.subSections.sectionJ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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

public class PanelJ0400 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8338058173797463074L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbJ0400;

	public PanelJ0400() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 152));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 152);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBounds(5, 0, 830, 152);
		panel.add(panel_1);

		final JxPanel panel_1_1_2 = new JxPanel();
		panel_1_1_2.setTheme(theme);
		panel_1_1_2.setBounds(0, 0, 830, 152);

		panel_1_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(820, 152));
		panel_1.add(panel_1_1_2);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1
				.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 128);
		panel_1_1_2.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(15, 9, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbJ0400 = new JxComboBox();
		cmbJ0400.setTheme(theme);
		cmbJ0400.setBounds(15, 31, 50, 22);
		cmbJ0400.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2",
				"3", "4", "9", "" }));

		cmbJ0400.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbJ0400);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1.setOpaque(false);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(79, 24, 751, 128);
		panel_1_1_2.add(panel_7_1_1);

		final JxLabel aNationalProviderLabel_3_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1
				.setText("<html><body>Ask resident:<i><b>\"How Much of the time have you experienced pain or hurting </b>over the last 5 days?\"");
		aNationalProviderLabel_3_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1.add(aNationalProviderLabel_3_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_5 = new JxLabel();
		aNationalProviderLabel_1_3_1_5.setTheme(theme);

		aNationalProviderLabel_1_3_1_5.setFontSize(12);
		aNationalProviderLabel_1_3_1_5
				.setText("<html>1. &nbsp <b>Almost Constantly");
		aNationalProviderLabel_1_3_1_5.setBounds(30, 25, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_5);

		final JxLabel aNationalProviderLabel_1_3_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1
				.setText("<html><body>2. &nbsp <b>Frequently");
		aNationalProviderLabel_1_3_1_1_1.setBounds(30, 45, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1
				.setText("<html><body> 3. &nbsp <b>Occasionally");
		aNationalProviderLabel_1_3_1_2_1.setBounds(30, 65, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_3_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_3_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_3_1
				.setText("<html><body>4. &nbsp <b>Rarely");
		aNationalProviderLabel_1_3_1_3_1.setBounds(30, 85, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_4_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_4_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_4_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_4_1
				.setText("<html><body>9. &nbsp <b>Unable to answer");
		aNationalProviderLabel_1_3_1_4_1.setBounds(30, 105, 706, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_4_1);

		final JxPanel panel_5_1_1_2 = new JxPanel();
		panel_5_1_1_2.setTheme(theme);
		panel_5_1_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setHgap(10);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2.setLayout(flowLayout_11);
		panel_5_1_1_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2.setBounds(0, 0, 830, 25);
		panel_1_1_2.add(panel_5_1_1_2);

		final JxLabel a0100Label_1_1_2 = new JxLabel();
		a0100Label_1_1_2.setTheme(theme);

		a0100Label_1_1_2.setFontSize(12);
		a0100Label_1_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_1_2.setText("J0400.  Pain Frequency");
		panel_5_1_1_2.add(a0100Label_1_1_2);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmbJ0400.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ0400(cmbJ0400.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0400("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmbJ0400.setSelectedItem(mds3sectionJ.getJ0400());

	}

}
