package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA1100 extends JxPanel implements Mds3SubSection {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5559055400327324656L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtPreferredLanguageA1100;
	private JxComboBox cmbLanguageA1100;

	public PanelA1100() {

		super();
		setPreferredSize(new Dimension(840, 150));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setPreferredSize(new Dimension(840, 150));
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 150);
		add(panel);

		final JxPanel panel_14_2 = new JxPanel();
		panel_14_2.setTheme(theme);
		panel_14_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_14_2.setLayout(null);
		// panel_14_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_14_2.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 125);
		panel.add(panel_14_2);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(15, 10, 54, 14);
		panel_14_2.add(enterCodeLabel_2);

		cmbLanguageA1100 = new JxComboBox();
		cmbLanguageA1100.setTheme(theme);

		cmbLanguageA1100.setModel(new DefaultComboBoxModel(new String[] { "",
				"0", "1", "9" }));
		cmbLanguageA1100.setBounds(15, 30, 50, 22);
		panel_14_2.add(cmbLanguageA1100);

		final JxPanel panel_15_2 = new JxPanel();
		panel_15_2.setTheme(theme);
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		panel_15_2.setLayout(flowLayout_9);
		panel_15_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_15_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_15_2.setPreferredSize(new Dimension(0, 0));
		panel_15_2.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_15_2);

		final JxLabel a0600SocialSecurityLabel_2 = new JxLabel();
		a0600SocialSecurityLabel_2.setTheme(theme);

		a0600SocialSecurityLabel_2.setFontSize(12);
		a0600SocialSecurityLabel_2.setFontStyle(Font.BOLD);
		a0600SocialSecurityLabel_2.setText("A1100. Language");
		panel_15_2.add(a0600SocialSecurityLabel_2);

		final JxPanel panel_16_2 = new JxPanel();
		panel_16_2.setTheme(theme);

		panel_16_2.setFontSize(12);
		panel_16_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_16_2.setLayout(null);
		panel_16_2.setBounds(79, 25, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				125);
		panel.add(panel_16_2);

		final JxLabel aDoesTheLabel = new JxLabel();
		aDoesTheLabel.setTheme(theme);

		aDoesTheLabel.setFontSize(12);
		aDoesTheLabel.setFontStyle(Font.BOLD);
		aDoesTheLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aDoesTheLabel
				.setText("A. Does the resident need or want an interpreter to communicate with a doctor or health care staff?");
		aDoesTheLabel.setBounds(10, 3, 563, 14);
		panel_16_2.add(aDoesTheLabel);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_3.setText("<HTML><BODY>0.<B> No");
		label_3.setBounds(10, 20, 225, 14);
		panel_16_2.add(label_3);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_4
				.setText("<HTML><BODY>1.<B> Yes -> </B>Specify in A1100B, Preferred language");
		label_4.setBounds(10, 37, 309, 14);
		panel_16_2.add(label_4);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5.setFontStyle(Font.BOLD);
		label_5.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_5.setText("<html><body>9.<b> Unable to determine</b>");
		label_5.setBounds(10, 57, 327, 14);
		panel_16_2.add(label_5);

		final JxLabel bPreferredLanguageLabel = new JxLabel();
		bPreferredLanguageLabel.setTheme(theme);

		bPreferredLanguageLabel.setFontSize(12);
		bPreferredLanguageLabel.setFontStyle(Font.BOLD);
		bPreferredLanguageLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bPreferredLanguageLabel.setText("B. Preferred language.");
		bPreferredLanguageLabel.setBounds(10, 84, 470, 14);
		panel_16_2.add(bPreferredLanguageLabel);

		txtPreferredLanguageA1100 = new JxText();
		txtPreferredLanguageA1100.setTheme(theme);
		txtPreferredLanguageA1100.setBounds(25, 98, 553, 22);
		panel_16_2.add(txtPreferredLanguageA1100);
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
		PanelA1100 panel = new PanelA1100();
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
		Object obj = cmbLanguageA1100.getSelectedItem();
		if (obj != null) {
			sectionA.setA1100A((cmbLanguageA1100.getSelectedItem().toString()));
		} else {
			sectionA.setA1100A("");
		}
		sectionA.setA1100B(txtPreferredLanguageA1100.getText());
	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		txtPreferredLanguageA1100.setText(sectionA.getA1100B());
		cmbLanguageA1100.setSelectedItem(sectionA.getA1100A());
	}

}
