package medrex.client.mds3.ui.subSections.sectionH;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionH.Mds3SectionH;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelH0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4683135848749161121L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbH0200A;
	private JxComboBox cmbH0200B;
	private JxComboBox cmbH0200C;

	public PanelH0200() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 335));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_1 = new JxPanel();
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setBounds(0, 0, 840, 335);

		panel_1_1_1.setLayout(null);
		panel_1_1_1.setPreferredSize(new Dimension(840, 370));
		add(panel_1_1_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, 0, 840, 26);
		panel_1_1_1.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1.setText("H0200. Urinary Toileting Program");
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1.setBounds(0, 26, 80, 309);
		panel_1_1_1.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(15, 25, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbH0200A = new JxComboBox();
		cmbH0200A.setTheme(theme);
		cmbH0200A.setBounds(15, 50, 50, 20);

		cmbH0200A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbH0200A.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbH0200A);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(15, 140, 54, 14);
		panel_6_1_1.add(enterCodeLabel);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(15, 245, 54, 14);
		panel_6_1_1.add(enterCodeLabel_2);

		cmbH0200B = new JxComboBox();
		cmbH0200B.setTheme(theme);
		cmbH0200B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));

		cmbH0200B.setBounds(15, 165, 50, 21);
		panel_6_1_1.add(cmbH0200B);

		cmbH0200C = new JxComboBox();
		cmbH0200C.setTheme(theme);
		cmbH0200C.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbH0200C.setBounds(15, 265, 50, 21);
		panel_6_1_1.add(cmbH0200C);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(79, 26, 761, 120);
		panel_1_1_1.add(panel_7_1_1);

		final JxLabel aNationalProviderLabel_2_1 = new JxLabel();
		aNationalProviderLabel_2_1.setTheme(theme);

		aNationalProviderLabel_2_1.setFontSize(12);
		aNationalProviderLabel_2_1
				.setText("<html><body><b>A. Has a trial of a toileting program(e.g.., scheduled toileting,prompted voiding, or bladder training</b>) been attempted on <br> addmission/reentry or since urinary incontinence was noted in this facility?");
		aNationalProviderLabel_2_1.setBounds(10, 0, 701, 54);
		aNationalProviderLabel_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1.add(aNationalProviderLabel_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>0. <b>No --></b> Skip to H0300, Urinary Continence");
		aNationalProviderLabel_1_1_1_1_1.setBounds(30, 55, 383, 14);
		aNationalProviderLabel_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_2
				.setText("<html><body>01. <b>Yes --></b> Continue to H0200B, Response");
		aNationalProviderLabel_1_1_1_1_2.setBounds(30, 75, 617, 14);
		aNationalProviderLabel_1_1_1_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_3 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_3.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_3.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_3
				.setText("<html><body>9. <b>Unable to determine --></b>Skip to H0200C, Current toileting program or trial");
		aNationalProviderLabel_1_1_1_1_3.setBounds(30, 95, 541, 14);
		aNationalProviderLabel_1_1_1_1_3
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_3);

		final JxPanel panel_7_1_1_1 = new JxPanel();
		panel_7_1_1_1.setTheme(theme);
		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(79, 145, 761, 100);
		panel_1_1_1.add(panel_7_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1.setTheme(theme);

		aNationalProviderLabel_2_1_1.setFontSize(12);
		aNationalProviderLabel_2_1_1
				.setText("<html><body><b>B.  Response-</b> What was the resident's response to the trial program?");
		aNationalProviderLabel_2_1_1.setBounds(10, 5, 519, 14);
		aNationalProviderLabel_2_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1);

		final JxLabel aNationalProviderLabel_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1.setTheme(theme);

		aNationalProviderLabel_1_2_1_1.setFontSize(12);
		aNationalProviderLabel_1_2_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_2_1_1
				.setText("<html><body>0.<b> No improvement");
		aNationalProviderLabel_1_2_1_1.setBounds(32, 25, 342, 14);
		aNationalProviderLabel_1_2_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_6 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_6.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_6
				.setText("<html><body>1. <b>Decreased wetness");
		aNationalProviderLabel_1_1_1_1_6.setBounds(32, 45, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_6);

		final JxLabel aNationalProviderLabel_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1_1
				.setText("<html><body>2. <b>Completely dry</b>(continent)");
		aNationalProviderLabel_1_1_1_1_1_1.setBounds(32, 65, 383, 14);
		aNationalProviderLabel_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_2_1
				.setText("<html><body>9. <b>Unable to determine </b>or trial in progress");
		aNationalProviderLabel_1_1_1_1_2_1.setBounds(32, 85, 617, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1);

		final JxPanel panel_7_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(79, 244, 761, 91);
		panel_1_1_1.add(panel_7_1_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_2 = new JxLabel();
		aNationalProviderLabel_2_1_1_2.setTheme(theme);

		aNationalProviderLabel_2_1_1_2.setFontSize(12);
		aNationalProviderLabel_2_1_1_2
				.setText("<html><body><b>C. Current toileting program or trial</b> - Is a toileting program(e.g. scheduled toiletiong, prompted voiding, or bladder training) currently <br> being used to manage the resident's urinary continence?");
		aNationalProviderLabel_2_1_1_2.setBounds(10, 0, 735, 47);
		aNationalProviderLabel_2_1_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_1_1.add(aNationalProviderLabel_2_1_1_2);

		final JxLabel aNationalProviderLabel_1_2_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_2_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_2_1_1_2.setText("<html><body>0. <b> No");
		aNationalProviderLabel_1_2_1_1_2.setBounds(30, 45, 342, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_6_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_6_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_6_1.setText("<html><body>1.<b> Yes");
		aNationalProviderLabel_1_1_1_1_6_1.setBounds(30, 65, 342, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_6_1);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		Object obj = cmbH0200A.getSelectedItem();
		Object obj2 = cmbH0200B.getSelectedItem();
		Object obj3 = cmbH0200C.getSelectedItem();

		if (obj != null) {
			mds3sectionH.setH0200A((String) cmbH0200A.getSelectedItem());
		} else {
			mds3sectionH.setH0200A("");
		}
		if (obj2 != null) {
			mds3sectionH.setH0200B((String) cmbH0200B.getSelectedItem());
		} else {
			mds3sectionH.setH0200B("");
		}
		if (obj3 != null) {
			mds3sectionH.setH0200C((String) cmbH0200C.getSelectedItem());
		} else {
			mds3sectionH.setH0200C("");
		}

	}

	public void doUpdate() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		cmbH0200A.setSelectedItem(mds3sectionH.getH0200A());
		cmbH0200B.setSelectedItem(mds3sectionH.getH0200B());
		cmbH0200C.setSelectedItem(mds3sectionH.getH0200C());

	}

}
