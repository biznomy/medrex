package medrex.client.mds3.ui.subSections.sectionG;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionG.Mds3SectionG;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelG0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6448550622238528186L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbG0300E;
	private JxComboBox cmbG0300D;
	private JxComboBox cmbG0300C;
	private JxComboBox cmbG0300B;
	private JxComboBox cmbG0300A;

	public PanelG0300() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 283));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 283);
		add(panel);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, 0, 840, 26);
		panel.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1.setText("G0300. Balance During Transitions and Walking");
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(0, 50, 421, 234);
		panel.add(panel_7_1_1);

		final JxLabel aNationalProviderLabel_2_1 = new JxLabel();
		aNationalProviderLabel_2_1.setTheme(theme);
		aNationalProviderLabel_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_2_1.setFontSize(12);
		aNationalProviderLabel_2_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2_1.setText("Coding:");
		aNationalProviderLabel_2_1.setBounds(10, 28, 294, 14);
		panel_7_1_1.add(aNationalProviderLabel_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_3 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_3.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_3
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_1_1_1_3.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_3
				.setText("<html><body>0.  <b>Steady at all times </b> ");
		aNationalProviderLabel_1_1_1_1_3.setBounds(32, 48, 260, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_3);

		final JxLabel aNationalProviderLabel_1_1_1_1_4 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_4.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_4.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_4
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_4
				.setText("<html><body>1. <b> Not steady, but able to stabilize without human <br> &nbsp &nbsp assistance</b>");
		aNationalProviderLabel_1_1_1_1_4.setBounds(32, 64, 321, 32);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_4);

		final JxLabel aNationalProviderLabel_1_1_1_1_5 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_5.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_5.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_5
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_5
				.setText("<html><body>2. <b> Not steady, only able to stabilize with human <br>&nbsp &nbsp assistance </b>");
		aNationalProviderLabel_1_1_1_1_5.setBounds(32, 102, 272, 32);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_5);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2.setText("<html><body> 8. <b> Activity did not occur </b>");
		label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_2.setBounds(32, 136, 226, 14);
		panel_7_1_1.add(label_2);

		final JxPanel panel_7_1_1_1 = new JxPanel();
		panel_7_1_1_1.setTheme(theme);
		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(420, 50, 420, 234);
		panel.add(panel_7_1_1_1);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11.setLayout(null);

		panel_11.setBounds(0, 0, 420, 28);
		panel_7_1_1_1.add(panel_11);

		final JxLabel enterCodesInLabel = new JxLabel();
		enterCodesInLabel.setTheme(theme);
		enterCodesInLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodesInLabel.setBounds(35, 8, 201, 14);
		enterCodesInLabel.setText("<html><body><b>Enter Codes in Boxes");
		panel_11.add(enterCodesInLabel);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_12.setLayout(null);
		panel_12.setBounds(0, 27, 55, 207);
		panel_7_1_1_1.add(panel_12);

		cmbG0300A = new JxComboBox();
		cmbG0300A.setTheme(theme);
		cmbG0300A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "8" }));

		cmbG0300A.setBounds(10, 10, 35, 20);
		panel_12.add(cmbG0300A);

		cmbG0300B = new JxComboBox();
		cmbG0300B.setTheme(theme);
		cmbG0300B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "8" }));

		cmbG0300B.setBounds(10, 48, 35, 20);
		panel_12.add(cmbG0300B);

		cmbG0300C = new JxComboBox();
		cmbG0300C.setTheme(theme);
		cmbG0300C.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "8" }));

		cmbG0300C.setBounds(10, 86, 35, 20);
		panel_12.add(cmbG0300C);

		cmbG0300D = new JxComboBox();
		cmbG0300D.setTheme(theme);
		cmbG0300D.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "8" }));

		cmbG0300D.setBounds(10, 124, 35, 20);
		panel_12.add(cmbG0300D);

		cmbG0300E = new JxComboBox();
		cmbG0300E.setTheme(theme);
		cmbG0300E.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "8" }));

		cmbG0300E.setBounds(10, 162, 35, 20);
		panel_12.add(cmbG0300E);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_13.setLayout(null);

		panel_13.setBounds(54, 27, 366, 40);
		panel_7_1_1_1.add(panel_13);

		final JxLabel aMovingFromLabel = new JxLabel();
		aMovingFromLabel.setTheme(theme);
		aMovingFromLabel.setBounds(10, 10, 261, 14);
		aMovingFromLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aMovingFromLabel
				.setText("<html><body<b>A.  Moving from seated to standing position  ");
		panel_13.add(aMovingFromLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_14.setLayout(null);
		panel_14.setBounds(54, 66, 366, 40);
		panel_7_1_1_1.add(panel_14);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);
		bLabel
				.setText("<html><body> <b> B.  Walking </b> (with assistive device if used )");
		bLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bLabel.setBounds(10, 10, 255, 14);
		panel_14.add(bLabel);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_15.setLayout(null);

		panel_15.setBounds(54, 105, 366, 40);
		panel_7_1_1_1.add(panel_15);

		final JxLabel cTurningLabel = new JxLabel();
		cTurningLabel.setTheme(theme);
		cTurningLabel
				.setText("<html><body><b> C. Turning around </b> and facing the opposite direction while walking ");
		cTurningLabel.setBounds(10, 10, 345, 14);
		cTurningLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_15.add(cTurningLabel);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_16.setLayout(null);

		panel_16.setBounds(54, 144, 366, 40);
		panel_7_1_1_1.add(panel_16);

		final JxLabel dMovingOnLabel = new JxLabel();
		dMovingOnLabel.setTheme(theme);
		dMovingOnLabel
				.setText("<html><body><b>D.  Moving on and off toilet </b>");
		dMovingOnLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dMovingOnLabel.setBounds(10, 10, 327, 14);
		panel_16.add(dMovingOnLabel);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);
		panel_17.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_17.setLayout(null);

		panel_17.setBounds(54, 183, 366, 51);
		panel_7_1_1_1.add(panel_17);

		final JxLabel eSurfacetosurfaceLabel = new JxLabel();
		eSurfacetosurfaceLabel.setTheme(theme);
		eSurfacetosurfaceLabel
				.setText("<html><body><b> E. Surface-to-surface transfer </b> (transfer between bed and chair or <br> &nbsp &nbsp wheelchair)");
		eSurfacetosurfaceLabel.setBounds(10, 7, 345, 30);
		eSurfacetosurfaceLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_17.add(eSurfacetosurfaceLabel);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setLayout(null);

		panel_10.setBounds(0, 25, 840, 26);
		panel.add(panel_10);

		final JxLabel afterObservingTheLabel = new JxLabel();
		afterObservingTheLabel.setTheme(theme);
		afterObservingTheLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		afterObservingTheLabel
				.setText("<html><body>  After observing the resident, <b> code the following walking and transition items for most dependent</b>");
		afterObservingTheLabel.setBounds(10, 0, 548, 26);
		panel_10.add(afterObservingTheLabel);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		Object obj1 = cmbG0300E.getSelectedItem();
		if (obj1 != null) {
			mds3sectionG.setG0300E((String) cmbG0300E.getSelectedItem());
		} else {
			mds3sectionG.setG0300E("");
		}
		Object obj2 = cmbG0300D.getSelectedItem();
		if (obj2 != null) {
			mds3sectionG.setG0300D((String) cmbG0300D.getSelectedItem());
		} else {
			mds3sectionG.setG0300D("");
		}
		Object obj3 = cmbG0300C.getSelectedItem();
		if (obj3 != null) {
			mds3sectionG.setG0300C((String) cmbG0300C.getSelectedItem());
		} else {
			mds3sectionG.setG0300C("");
		}
		Object obj4 = cmbG0300B.getSelectedItem();
		if (obj4 != null) {
			mds3sectionG.setG0300B((String) cmbG0300B.getSelectedItem());
		} else {
			mds3sectionG.setG0300B("");
		}
		Object obj5 = cmbG0300A.getSelectedItem();
		if (obj5 != null) {
			mds3sectionG.setG0300A((String) cmbG0300A.getSelectedItem());
		} else {
			mds3sectionG.setG0300A("");
		}
	}

	public void doUpdate() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		cmbG0300E.setSelectedItem(mds3sectionG.getG0300E());
		cmbG0300D.setSelectedItem(mds3sectionG.getG0300D());
		cmbG0300C.setSelectedItem(mds3sectionG.getG0300C());
		cmbG0300B.setSelectedItem(mds3sectionG.getG0300B());
		cmbG0300A.setSelectedItem(mds3sectionG.getG0300A());

	}
}
