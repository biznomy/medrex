package medrex.client.mds3.ui.subSections.sectionF;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionF.Mds3SectionF;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelF0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8099105506954919061L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbF0300;

	public PanelF0300() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(840, 130));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_3, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 120);
		add(panel);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setBounds(10, 10, 820, 100);

		panel.add(panel_1_2);

		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(820, 100));

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setLayout(null);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5_2.setBounds(0, 0, 820, 40);
		panel_1_2.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);
		a0100Label_2.setBounds(11, 6, 799, 30);

		a0100Label_2.setFontSize(12);
		a0100Label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_2
				.setText("<html><b>F0300. Should interview for Daily and Activity Preferences has Conducted?-</b>Attemp to interview all residents able to communicate.<br>if resident is unable to complete , attempt to complete interview with family member or significant other");
		panel_5_2.add(a0100Label_2);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		panel_6_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(0, 39, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 61);
		panel_1_2.add(panel_6_2);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_2.setBounds(15, 10, 54, 14);
		panel_6_2.add(enterCodeLabel_2);

		cmbF0300 = new JxComboBox();
		cmbF0300.setTheme(theme);
		cmbF0300.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbF0300.setPreferredSize(new Dimension(50, 20));
		cmbF0300.setBounds(15, 28, 50, 22);
		panel_6_2.add(cmbF0300);

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(79, 39, 751, 61);
		panel_1_2.add(panel_7_2);

		final JxLabel aNationalProviderLabel_3 = new JxLabel();
		aNationalProviderLabel_3.setTheme(theme);

		aNationalProviderLabel_3.setFontSize(12);
		aNationalProviderLabel_3
				.setText("<html><body>0.<b> No</b>(resident is rarely / never understood) <u>and</u> family / significant other not available ) - > skip to and complete F0800 Staff<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Assessment of Daily and Activity Preferences");
		aNationalProviderLabel_3.setBounds(10, 5, 694, 34);
		panel_7_2.add(aNationalProviderLabel_3);

		final JxLabel aNationalProviderLabel_1_3 = new JxLabel();
		aNationalProviderLabel_1_3.setTheme(theme);

		aNationalProviderLabel_1_3.setFontSize(12);
		aNationalProviderLabel_1_3
				.setText("<html><body>1. <b>Yes</b> - > Continue to F0400 , Interview for Daily Preferences");
		aNationalProviderLabel_1_3.setBounds(10, 40, 455, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);
		// doUpdate();
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
		PanelF0300 panel = new PanelF0300();
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

	@Override
	public void doSave() {
		Mds3SectionF mds3sectionF = (Mds3SectionF) Mds3Controller.getInstance()
				.getSection(Mds3SectionF.class);
		Object obj = cmbF0300.getSelectedItem();
		if (obj != null) {
			mds3sectionF.setF0300(cmbF0300.getSelectedItem().toString());
		} else {
			mds3sectionF.setF0300("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionF mds3sectionF = (Mds3SectionF) Mds3Controller.getInstance()
				.getSection(Mds3SectionF.class);
		cmbF0300.setSelectedItem(mds3sectionF.getF0300());
	}

}
