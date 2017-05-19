package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX0600F extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2668920825654645971L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbX0600F;

	public PanelX0600F() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 112));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 112);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 112);
		panel.add(panel_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);

		enterCodeLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(15, 11, 54, 14);
		panel_1.add(enterCodeLabel_1);

		cmbX0600F = new JxComboBox();
		cmbX0600F.setTheme(theme);
		cmbX0600F.setModel(new DefaultComboBoxModel(new String[] { "", "01",
				"10", "11", "12", "99" }));

		cmbX0600F.setBounds(15, 30, 50, 22);
		panel_1.add(cmbX0600F);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_4.setLayout(null);

		panel_4.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 112);
		panel.add(panel_4);

		final JxLabel aNationalProviderLabel_2_1_1_2_2 = new JxLabel();
		aNationalProviderLabel_2_1_1_2_2.setTheme(theme);

		aNationalProviderLabel_2_1_1_2_2.setFontSize(12);
		aNationalProviderLabel_2_1_1_2_2
				.setText("<html><body><b>F. </b> &nbsp <b>Entry / Discharge reporting");
		aNationalProviderLabel_2_1_1_2_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_2_1_1_2_2.setBounds(10, 5, 422, 14);
		panel_4.add(aNationalProviderLabel_2_1_1_2_2);

		final JxLabel aNationalProviderLabel_1_2_1_1_2_2 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_2_2.setTheme(theme);

		aNationalProviderLabel_1_2_1_1_2_2.setFontSize(12);
		aNationalProviderLabel_1_2_1_1_2_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2_1_1_2_2
				.setText("<html><body> 01. &nbsp<b>Entry Record</b>");
		aNationalProviderLabel_1_2_1_1_2_2.setBounds(32, 25, 342, 14);
		panel_4.add(aNationalProviderLabel_1_2_1_1_2_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_6_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6_1_2.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_6_1_2.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_6_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_6_1_2
				.setText("<html><body> 10. &nbsp <b>Discharge </b>assessment-<b> return not anticipated </b>");
		aNationalProviderLabel_1_1_1_1_6_1_2.setBounds(32, 41, 342, 14);
		panel_4.add(aNationalProviderLabel_1_1_1_1_6_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_1_1_1_1
				.setText("<html><body> 11. &nbsp<b>Discharge </b>assessment-<b> return anticipated </b>");
		aNationalProviderLabel_1_1_1_1_1_1_1_1.setBounds(32, 58, 383, 14);
		panel_4.add(aNationalProviderLabel_1_1_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_2_1_2_1
				.setText("<html><body> 12. &nbsp<b>Death in facility</b> record</b>");
		aNationalProviderLabel_1_1_1_1_2_1_2_1.setBounds(32, 74, 617, 14);
		panel_4.add(aNationalProviderLabel_1_1_1_1_2_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2_1_2_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1
				.setText("<html><body> 99. &nbsp<b>Not entry/ discharge</b> record</b>");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1.setBounds(33, 90, 617, 14);
		panel_4.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		Object obj = cmbX0600F.getSelectedItem();
		if (obj != null) {
			sectionX.setX0600F(cmbX0600F.getSelectedItem().toString());
		} else {
			sectionX.setX0600F("");
		}
	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		cmbX0600F.setSelectedItem(mds3SectionX.getX0600F());

	}

}
