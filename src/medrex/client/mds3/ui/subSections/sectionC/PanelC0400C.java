package medrex.client.mds3.ui.subSections.sectionC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelC0400C extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8141962984728950L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbAbleToRecallBed;

	public PanelC0400C() {
		super();
		setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		setPreferredSize(new Dimension(840, 88));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setOpaque(false);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 88);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(5, 0, 80, 88);
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 200);
		panel.add(panel_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(15, 9, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_1.add(enterCodeLabel_1);

		cmbAbleToRecallBed = new JxComboBox();
		cmbAbleToRecallBed.setTheme(theme);
		cmbAbleToRecallBed.setBounds(17, 31, 50, 20);
		cmbAbleToRecallBed.setModel(new DefaultComboBoxModel(new String[] { "",
				"0", "1", "2" }));

		cmbAbleToRecallBed.setPreferredSize(new Dimension(50, 20));
		panel_1.add(cmbAbleToRecallBed);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setAutoscrolls(false);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setOpaque(true);
		panel_2.setLayout(null);
		panel_2.setBounds(85, 0, 750, 88);
		panel.add(panel_2);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_3_1_1_1_2.setText("B .Able to recall \"BED\"");
		aNationalProviderLabel_1_3_1_1_1_2.setBounds(10, 5, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_2_1_2
				.setText("<html><body>0. <b>No -</b> could not recall");
		aNationalProviderLabel_1_3_1_2_1_2.setBounds(30, 25, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_2_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_3_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_3_1_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_3_1_2
				.setText("<html><body>1. <b>Yes after cueing -</b> (\"a piece of furniture\")");
		aNationalProviderLabel_1_3_1_3_1_2.setBounds(30, 45, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_3_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_4_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_4_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_4_1_1
				.setText("<html><body>2. <b>Yes,no cue required");
		aNationalProviderLabel_1_3_1_4_1_1.setBounds(30, 65, 706, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_4_1_1);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		Object obj = cmbAbleToRecallBed.getSelectedItem();
		if (obj != null) {
			sectionC.setC0400C(cmbAbleToRecallBed.getSelectedItem().toString());
		}
		sectionC.setC0400C("");
	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbAbleToRecallBed.setSelectedItem(mds3sectionC.getC0400C());
	}

}
