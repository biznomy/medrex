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

public class PanelJ0700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7641425696291844658L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbJ0700;

	public PanelJ0700() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 100));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_3, false));
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 100);
		add(panel);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setBounds(10, 10, 820, 80);
		panel.add(panel_1_2);

		panel_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(820, 80));

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setLayout(null);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_2.setBounds(0, 0, 820, 25);
		panel_1_2.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);
		a0100Label_2.setBounds(11, 6, 338, 15);

		a0100Label_2.setFontSize(12);
		a0100Label_2.setFontStyle(Font.BOLD);
		a0100Label_2
				.setText("J0700. Should the staff Assessment for pain be conducted?");
		panel_5_2.add(a0100Label_2);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		panel_6_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 56);
		panel_1_2.add(panel_6_2);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_6_2.add(enterCodeLabel_2);

		cmbJ0700 = new JxComboBox();
		cmbJ0700.setTheme(theme);
		cmbJ0700.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbJ0700.setPreferredSize(new Dimension(50, 20));
		cmbJ0700.setBounds(15, 30, 50, 22);
		panel_6_2.add(cmbJ0700);

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(79, 24, 741, 56);
		panel_1_2.add(panel_7_2);

		final JxLabel aNationalProviderLabel_3 = new JxLabel();
		aNationalProviderLabel_3.setTheme(theme);

		aNationalProviderLabel_3.setFontSize(12);
		aNationalProviderLabel_3
				.setText("<html><body>0.<b>  No </b>(J0400 =1 thru 4)-> skip to J1100, Shortness of breath(dyspnea)");
		aNationalProviderLabel_3.setBounds(10, 10, 607, 14);
		panel_7_2.add(aNationalProviderLabel_3);

		final JxLabel aNationalProviderLabel_1_3 = new JxLabel();
		aNationalProviderLabel_1_3.setTheme(theme);

		aNationalProviderLabel_1_3.setFontSize(12);
		aNationalProviderLabel_1_3
				.setText("<html><body>1. <b>Yes</b>(J0400 = 9)-> Continue to J0800, Indicators of pain or possible Pain ");
		aNationalProviderLabel_1_3.setBounds(10, 30, 679, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmbJ0700.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ0700(cmbJ0700.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0700("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmbJ0700.setSelectedItem(mds3sectionJ.getJ0700());

	}

}
