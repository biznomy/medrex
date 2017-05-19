package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.Color;
import java.awt.Dimension;
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
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA1700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 781915707314347491L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbTypeOfEntryA1700;

	public PanelA1700() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 75));
		setBackground(Color.WHITE);

		final JxPanel panel_1_2_1 = new JxPanel();
		panel_1_2_1.setTheme(theme);
		panel_1_2_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 75);

		panel_1_2_1.setLayout(null);
		panel_1_2_1
				.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 75));
		add(panel_1_2_1);

		final JxPanel panel_5_2_1 = new JxPanel();
		panel_5_2_1.setTheme(theme);
		panel_5_2_1.setLayout(null);
		panel_5_2_1
				.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 75));
		panel_5_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_2_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 26);
		panel_1_2_1.add(panel_5_2_1);

		final JxLabel a0100Label_2_1 = new JxLabel();
		a0100Label_2_1.setTheme(theme);
		a0100Label_2_1.setBounds(10, 6, 115, 15);
		a0100Label_2_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		a0100Label_2_1.setFontSize(12);
		a0100Label_2_1.setFontStyle(Font.BOLD);
		a0100Label_2_1.setText("A1700. Type of Entry");
		panel_5_2_1.add(a0100Label_2_1);

		final JxPanel panel_6_2_1 = new JxPanel();
		panel_6_2_1.setTheme(theme);
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// 1, false));
		panel_6_2_1.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 51);
		panel_1_2_1.add(panel_6_2_1);

		cmbTypeOfEntryA1700 = new JxComboBox();
		cmbTypeOfEntryA1700.setTheme(theme);

		cmbTypeOfEntryA1700.setModel(new DefaultComboBoxModel(new String[] {
				"", "1", "2" }));
		cmbTypeOfEntryA1700.setBounds(15, 20, 50, 22);
		panel_6_2_1.add(cmbTypeOfEntryA1700);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setText("Enter Code");
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label.setBounds(15, 5, 54, 14);
		panel_6_2_1.add(label);

		final JxPanel panel_7_2_1 = new JxPanel();
		panel_7_2_1.setTheme(theme);
		panel_7_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY, 1,
				false));
		panel_7_2_1.setOpaque(false);
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(79, 25, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				50);
		panel_1_2_1.add(panel_7_2_1);

		final JxLabel aNationalProviderLabel_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_3_1.setTheme(theme);

		aNationalProviderLabel_1_3_1.setFontSize(12);
		aNationalProviderLabel_1_3_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1
				.setText("<html><body>1. &nbsp <b> Admission </b>");
		aNationalProviderLabel_1_3_1.setBounds(25, 10, 178, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_1);

		final JxLabel aNationalProviderLabel_1_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_1_3_1.setTheme(theme);

		aNationalProviderLabel_1_1_3_1.setFontSize(12);
		aNationalProviderLabel_1_1_3_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_3_1
				.setText("<html><body>2. &nbsp <b> Reentry</b>");
		aNationalProviderLabel_1_1_3_1.setBounds(25, 25, 131, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_1_3_1);
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
		PanelA1700 panel = new PanelA1700();
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
		Object obj = cmbTypeOfEntryA1700.getSelectedItem();
		if (obj != null) {
			sectionA
					.setA1700((cmbTypeOfEntryA1700.getSelectedItem().toString()));
		} else {
			sectionA.setA1700("");
		}

	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbTypeOfEntryA1700.setSelectedItem(sectionA.getA1700());

	}
}
