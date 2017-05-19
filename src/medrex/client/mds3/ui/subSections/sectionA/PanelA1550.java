package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA1550 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5509342518683837290L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbNoneOfTheAboveA1550;
	private JxCheckBox cbMRDDWithNoOrganicA1550;
	private JxCheckBox cbOtherOrganicA1550;
	private JxCheckBox cbEpilepsyA1550;
	private JxCheckBox cbAustinA1550;
	private JxCheckBox cbDownSyndromeA1550;

	public PanelA1550() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 298));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_1 = new JxPanel();
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 298);

		panel_1_1_1.setLayout(null);
		panel_1_1_1.setPreferredSize(new Dimension(840, 298));
		add(panel_1_1_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 55);
		panel_1_1_1.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1
				.setText("<html><body><b>A1550. Condition Related to MR/DD Status</b><br>if the resident is 22 years of age or older , complete only if A0310A = 01<br>if the resident is 21 years of age or younger, complete only if A0310A = 01, 03, 04 or 05");
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		// panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
		// 1, false));
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1
				.setBounds(0, 80, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 218);
		panel_1_1_1.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1_1_3 = new JxLabel();
		enterCodeLabel_1_1_3.setTheme(theme);
		enterCodeLabel_1_1_3.setText("Enter Code");
		enterCodeLabel_1_1_3.setBounds(16, 666, 54, 14);
		panel_6_1_1.add(enterCodeLabel_1_1_3);

		cbDownSyndromeA1550 = new JxCheckBox();
		cbDownSyndromeA1550.setTheme(theme);

		cbDownSyndromeA1550.setBounds(35, 30, 15, 18);
		panel_6_1_1.add(cbDownSyndromeA1550);
		cbDownSyndromeA1550.setOpaque(true);
		cbDownSyndromeA1550.setText("");

		cbAustinA1550 = new JxCheckBox();
		cbAustinA1550.setTheme(theme);

		cbAustinA1550.setText("");
		cbAustinA1550.setBounds(35, 55, 15, 18);
		panel_6_1_1.add(cbAustinA1550);

		cbEpilepsyA1550 = new JxCheckBox();
		cbEpilepsyA1550.setTheme(theme);

		cbEpilepsyA1550.setText("");
		cbEpilepsyA1550.setBounds(35, 80, 15, 18);
		panel_6_1_1.add(cbEpilepsyA1550);

		cbOtherOrganicA1550 = new JxCheckBox();
		cbOtherOrganicA1550.setTheme(theme);

		cbOtherOrganicA1550.setText("");
		cbOtherOrganicA1550.setBounds(35, 107, 15, 18);
		panel_6_1_1.add(cbOtherOrganicA1550);

		cbMRDDWithNoOrganicA1550 = new JxCheckBox();
		cbMRDDWithNoOrganicA1550.setTheme(theme);

		cbMRDDWithNoOrganicA1550.setText("");
		cbMRDDWithNoOrganicA1550.setBounds(35, 155, 15, 18);
		panel_6_1_1.add(cbMRDDWithNoOrganicA1550);

		cbNoneOfTheAboveA1550 = new JxCheckBox();
		cbNoneOfTheAboveA1550.setTheme(theme);

		cbNoneOfTheAboveA1550.setText("");
		cbNoneOfTheAboveA1550.setBounds(35, 194, 15, 18);
		panel_6_1_1.add(cbNoneOfTheAboveA1550);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFontSize(14);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setBounds(25, 803, 617, 14);
		panel_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);

		panel_5_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setHgap(40);
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1.setLayout(flowLayout_9);
		panel_5_1_1_1.setBounds(0, 55, 840, 25);
		panel_1_1_1.add(panel_5_1_1_1);

		final JxLabel a0100Label_1_1_1 = new JxLabel();
		a0100Label_1_1_1.setTheme(theme);
		a0100Label_1_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1
				.setText("<html><body><b>Check all conditions that are related to MR/DD status</b> that were manifested before age 22, and are likely to continue indefinitely");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JxPanel panel_5_1_1_1_1 = new JxPanel();
		panel_5_1_1_1_1.setTheme(theme);
		panel_5_1_1_1_1.setLayout(null);
		panel_5_1_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_1_1.setBounds(80, 80, 760, 25);
		panel_1_1_1.add(panel_5_1_1_1_1);

		final JxLabel a0100Label_1_1_1_1 = new JxLabel();
		a0100Label_1_1_1_1.setTheme(theme);
		a0100Label_1_1_1_1.setBounds(41, 6, 176, 15);

		a0100Label_1_1_1_1.setFontSize(12);
		a0100Label_1_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1_1.setText("MR / DD With Organic Condition");
		panel_5_1_1_1_1.add(a0100Label_1_1_1_1);

		final JxPanel panel_5_1_1_1_1_1 = new JxPanel();
		panel_5_1_1_1_1_1.setTheme(theme);
		panel_5_1_1_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_1_1_1.setLayout(null);
		panel_5_1_1_1_1_1.setOpaque(false);
		panel_5_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_5_1_1_1_1_1.setBounds(79, 104, 761, 25);
		panel_1_1_1.add(panel_5_1_1_1_1_1);

		final JxLabel a0100Label_1_1_1_1_1 = new JxLabel();
		a0100Label_1_1_1_1_1.setTheme(theme);
		a0100Label_1_1_1_1_1.setBounds(10, 6, 106, 15);

		a0100Label_1_1_1_1_1.setFontSize(12);
		a0100Label_1_1_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1_1_1.setText("A. Down syndrome");
		panel_5_1_1_1_1_1.add(a0100Label_1_1_1_1_1);

		final JxPanel panel_5_1_1_1_1_2 = new JxPanel();
		panel_5_1_1_1_1_2.setTheme(theme);
		panel_5_1_1_1_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_1_1_2.setLayout(null);
		panel_5_1_1_1_1_2.setOpaque(false);
		panel_5_1_1_1_1_2.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_5_1_1_1_1_2.setBounds(79, 128, 761, 25);
		panel_1_1_1.add(panel_5_1_1_1_1_2);

		final JxLabel a0100Label_1_1_1_1_2 = new JxLabel();
		a0100Label_1_1_1_1_2.setTheme(theme);
		a0100Label_1_1_1_1_2.setBounds(10, 6, 54, 15);

		a0100Label_1_1_1_1_2.setFontSize(12);
		a0100Label_1_1_1_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1_1_2.setText("B. Autism");
		panel_5_1_1_1_1_2.add(a0100Label_1_1_1_1_2);

		final JxPanel panel_5_1_1_1_1_3 = new JxPanel();
		panel_5_1_1_1_1_3.setTheme(theme);
		panel_5_1_1_1_1_3.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_1_1_3.setLayout(null);
		panel_5_1_1_1_1_3.setOpaque(false);
		panel_5_1_1_1_1_3.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_5_1_1_1_1_3.setBounds(79, 152, 761, 25);
		panel_1_1_1.add(panel_5_1_1_1_1_3);

		final JxLabel a0100Label_1_1_1_1_3 = new JxLabel();
		a0100Label_1_1_1_1_3.setTheme(theme);
		a0100Label_1_1_1_1_3.setBounds(10, 6, 61, 15);

		a0100Label_1_1_1_1_3.setFontSize(12);
		a0100Label_1_1_1_1_3.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1_1_3.setText("C. Epilepsy");
		panel_5_1_1_1_1_3.add(a0100Label_1_1_1_1_3);

		final JxPanel panel_5_1_1_1_1_4 = new JxPanel();
		panel_5_1_1_1_1_4.setTheme(theme);
		panel_5_1_1_1_1_4.setLayout(null);
		panel_5_1_1_1_1_4.setOpaque(false);
		panel_5_1_1_1_1_4.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_1_1_4.setBounds(79, 176, 761, 25);
		panel_1_1_1.add(panel_5_1_1_1_1_4);

		final JxLabel a0100Label_1_1_1_1_4 = new JxLabel();
		a0100Label_1_1_1_1_4.setTheme(theme);
		a0100Label_1_1_1_1_4.setBounds(10, 6, 249, 15);
		a0100Label_1_1_1_1_4.setOpaque(false);

		a0100Label_1_1_1_1_4.setFontSize(12);
		a0100Label_1_1_1_1_4.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1_4.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1_1_4
				.setText("D. Other Organic condition related to MR/ DD");
		panel_5_1_1_1_1_4.add(a0100Label_1_1_1_1_4);

		final JxPanel panel_5_1_1_1_1_5 = new JxPanel();
		panel_5_1_1_1_1_5.setTheme(theme);
		panel_5_1_1_1_1_5.setLayout(null);
		panel_5_1_1_1_1_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1_1_5.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_1_1_5.setBounds(79, 200,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 25);
		panel_1_1_1.add(panel_5_1_1_1_1_5);

		final JxLabel a0100Label_1_1_1_1_5 = new JxLabel();
		a0100Label_1_1_1_1_5.setTheme(theme);
		a0100Label_1_1_1_1_5.setBounds(10, 6, 186, 15);

		a0100Label_1_1_1_1_5.setFontSize(12);
		a0100Label_1_1_1_1_5.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1_5.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1_1_5.setText("MR/DD without Organic Condition");
		panel_5_1_1_1_1_5.add(a0100Label_1_1_1_1_5);

		final JxPanel panel_5_1_1_1_1_6 = new JxPanel();
		panel_5_1_1_1_1_6.setTheme(theme);
		panel_5_1_1_1_1_6.setLayout(null);
		panel_5_1_1_1_1_6.setOpaque(false);
		panel_5_1_1_1_1_6.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_1_1_6.setBounds(79, 224, 761, 25);
		panel_1_1_1.add(panel_5_1_1_1_1_6);

		final JxLabel a0100Label_1_1_1_1_6 = new JxLabel();
		a0100Label_1_1_1_1_6.setTheme(theme);
		a0100Label_1_1_1_1_6.setBounds(10, 6, 196, 15);

		a0100Label_1_1_1_1_6.setFontSize(12);
		a0100Label_1_1_1_1_6.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1_6.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1_1_6.setText("E. MR/DD with no organic Condition");
		panel_5_1_1_1_1_6.add(a0100Label_1_1_1_1_6);

		final JxPanel panel_5_1_1_1_1_7 = new JxPanel();
		panel_5_1_1_1_1_7.setTheme(theme);
		panel_5_1_1_1_1_7.setLayout(null);
		panel_5_1_1_1_1_7.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1_1_7.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_1_1_7.setBounds(79, 248,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 25);
		panel_1_1_1.add(panel_5_1_1_1_1_7);

		final JxLabel a0100Label_1_1_1_1_7 = new JxLabel();
		a0100Label_1_1_1_1_7.setTheme(theme);
		a0100Label_1_1_1_1_7.setBounds(10, 6, 55, 15);

		a0100Label_1_1_1_1_7.setFontSize(12);
		a0100Label_1_1_1_1_7.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1_7.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1_1_7.setText("No MR/DD");
		panel_5_1_1_1_1_7.add(a0100Label_1_1_1_1_7);

		final JxPanel panel_5_1_1_1_1_7_1 = new JxPanel();
		panel_5_1_1_1_1_7_1.setTheme(theme);
		panel_5_1_1_1_1_7_1.setLayout(null);
		panel_5_1_1_1_1_7_1.setOpaque(false);
		panel_5_1_1_1_1_7_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_1_1_7_1.setBounds(79, 272, 761, 27);
		panel_1_1_1.add(panel_5_1_1_1_1_7_1);

		final JxLabel a0100Label_1_1_1_1_7_1 = new JxLabel();
		a0100Label_1_1_1_1_7_1.setTheme(theme);
		a0100Label_1_1_1_1_7_1.setBounds(10, 6, 114, 15);

		a0100Label_1_1_1_1_7_1.setFontSize(12);
		a0100Label_1_1_1_1_7_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1_7_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1_1_7_1.setText("Z. None of the above");
		panel_5_1_1_1_1_7_1.add(a0100Label_1_1_1_1_7_1);
		doUpdate();
	}

	public static void main(String ar[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelA1550 panel = new PanelA1550();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJxPanel().setVisible(true);
	}

	public void doSave() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		sectionA.setA1550A(cbDownSyndromeA1550.isSelected());
		sectionA.setA1550B(cbAustinA1550.isSelected());
		sectionA.setA1550C(cbEpilepsyA1550.isSelected());
		sectionA.setA1550D(cbOtherOrganicA1550.isSelected());
		sectionA.setA1550E(cbMRDDWithNoOrganicA1550.isSelected());
		sectionA.setA1550E(cbNoneOfTheAboveA1550.isSelected());
	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cbDownSyndromeA1550.setSelected(sectionA.isA1550A());
		cbAustinA1550.setSelected(sectionA.isA1550B());
		cbEpilepsyA1550.setSelected(sectionA.isA1550C());
		cbOtherOrganicA1550.setSelected(sectionA.isA1550D());
		cbMRDDWithNoOrganicA1550.setSelected(sectionA.isA1550E());
		cbNoneOfTheAboveA1550.setSelected(sectionA.isA1550Z());

	}
}
