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

public class PanelG0400 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3098134337869406321L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox G0400B;
	private JxComboBox cmbG0400A;

	public PanelG0400() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 157));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 157);
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
		a0100Label_1_1
				.setText("G0400.Functional Limitation in Range of Motion");
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(0, 50, 421, 107);
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
				.setText("<html><body> 0. <b> No impairment</b> ");
		aNationalProviderLabel_1_1_1_1_3.setBounds(32, 48, 260, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_3);

		final JxLabel aNationalProviderLabel_1_1_1_1_4 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_4.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_4.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_4
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_4
				.setText("<html><body>1. <b> Impairment on one side </b>");
		aNationalProviderLabel_1_1_1_1_4.setBounds(32, 55, 321, 32);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_4);

		final JxLabel aNationalProviderLabel_1_1_1_1_5 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_5.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_5.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_5
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_5
				.setText("<html><body>2. <b> Impairment on both sides </b>");
		aNationalProviderLabel_1_1_1_1_5.setBounds(32, 70, 272, 32);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_5);

		final JxPanel panel_7_1_1_1 = new JxPanel();
		panel_7_1_1_1.setTheme(theme);
		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(420, 50, 420, 105);
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
		panel_12.setBounds(0, 27, 55, 80);
		panel_7_1_1_1.add(panel_12);

		cmbG0400A = new JxComboBox();
		cmbG0400A.setTheme(theme);
		cmbG0400A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));

		cmbG0400A.setBounds(10, 10, 35, 20);
		panel_12.add(cmbG0400A);

		G0400B = new JxComboBox();
		G0400B.setTheme(theme);
		G0400B.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));

		G0400B.setBounds(10, 48, 35, 20);
		panel_12.add(G0400B);

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
				.setText("<html><body><b> A.  Upper extremity </b> (shoulder, elbow, wrist, hand) ");
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
				.setText("<html><body><b> B. Lower extremity </b> (hip,knee,ankle,foot) )");
		bLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bLabel.setBounds(10, 10, 255, 14);
		panel_14.add(bLabel);

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
				.setText("<html><body><b>Code for limitation </b> that interfered with daily functions or placed resident at risk of injury");
		afterObservingTheLabel.setBounds(10, 0, 548, 26);
		panel_10.add(afterObservingTheLabel);
		doUpdate();

	}

	@Override
	public void doSave() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		Object obj = cmbG0400A.getSelectedItem();
		if (obj != null) {
			mds3sectionG.setG0400A((String) cmbG0400A.getSelectedItem());
		} else {
			mds3sectionG.setG0400A("");
		}
		Object obj2 = G0400B.getSelectedItem();
		if (obj2 != null) {
			mds3sectionG.setG0400B((String) G0400B.getSelectedItem());
		} else {
			mds3sectionG.setG0400B("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		cmbG0400A.setSelectedItem(mds3sectionG.getG0400A());
		G0400B.setSelectedItem(mds3sectionG.getG0400A());

	}

}
