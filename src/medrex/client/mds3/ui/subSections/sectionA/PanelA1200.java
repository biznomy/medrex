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

public class PanelA1200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2311127887036117827L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbMaritalStatusA1200;

	public PanelA1200() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 130));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_2 = new JxPanel();
		panel_1_1_2.setTheme(theme);
		panel_1_1_2.setBounds(0, 0, 840, 130);

		panel_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(840, 130));
		add(panel_1_1_2);

		final JxPanel panel_5_1_2 = new JxPanel();
		panel_5_1_2.setTheme(theme);
		panel_5_1_2.setLayout(null);
		panel_5_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_2.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_1_1_2.add(panel_5_1_2);

		final JxLabel a0100Label_1_2 = new JxLabel();
		a0100Label_1_2.setTheme(theme);
		a0100Label_1_2.setBounds(11, 6, 121, 15);

		a0100Label_1_2.setFontSize(12);
		a0100Label_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_2.setName("");
		a0100Label_1_2.setText("A1200. Marital Status");
		panel_5_1_2.add(a0100Label_1_2);

		final JxPanel panel_6_1_2 = new JxPanel();
		panel_6_1_2.setTheme(theme);
		panel_6_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_2.setLayout(null);
		// panel_6_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_2
				.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 106);
		panel_1_1_2.add(panel_6_1_2);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setBounds(15, 9, 54, 14);
		enterCodeLabel_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_2.setText("Enter Code");
		panel_6_1_2.add(enterCodeLabel_2);

		cmbMaritalStatusA1200 = new JxComboBox();
		cmbMaritalStatusA1200.setTheme(theme);
		cmbMaritalStatusA1200.setBounds(15, 31, 50, 22);
		cmbMaritalStatusA1200.setModel(new DefaultComboBoxModel(new String[] {
				"", "1", "2", "3", "4", "5" }));

		cmbMaritalStatusA1200.setPreferredSize(new Dimension(50, 20));
		panel_6_1_2.add(cmbMaritalStatusA1200);

		final JxPanel panel_7_1_2 = new JxPanel();
		panel_7_1_2.setTheme(theme);

		panel_7_1_2.setFontSize(12);
		panel_7_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_2.setOpaque(false);
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(79, 24, 761, 106);
		panel_1_1_2.add(panel_7_1_2);

		final JxLabel aNationalProviderLabel_2_2 = new JxLabel();
		aNationalProviderLabel_2_2.setTheme(theme);
		aNationalProviderLabel_2_2.setText("<html><body>1.<b> Never Married");
		aNationalProviderLabel_2_2.setBounds(10, 5, 184, 14);
		aNationalProviderLabel_2_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_2.add(aNationalProviderLabel_2_2);

		final JxLabel aNationalProviderLabel_1_2_2 = new JxLabel();
		aNationalProviderLabel_1_2_2.setTheme(theme);
		aNationalProviderLabel_1_2_2.setText("<html><body>2. <b>Married");
		aNationalProviderLabel_1_2_2.setBounds(10, 25, 206, 14);
		aNationalProviderLabel_1_2_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_2.add(aNationalProviderLabel_1_2_2);

		final JxLabel aNationalProviderLabel_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_2.setTheme(theme);
		aNationalProviderLabel_1_1_1_2.setText("<html><body>3.<b> Widowed");
		aNationalProviderLabel_1_1_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_2.setBounds(10, 45, 206, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_2_1.setText("<html><body>4. <b>Separated");
		aNationalProviderLabel_1_1_1_2_1.setBounds(10, 65, 206, 14);
		aNationalProviderLabel_1_1_1_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_2.add(aNationalProviderLabel_1_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_2_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_2_2.setTheme(theme);
		aNationalProviderLabel_1_1_1_2_2.setText("<html><body>5.<b> Divorced");
		aNationalProviderLabel_1_1_1_2_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_2_2.setBounds(10, 83, 206, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_1_1_2_2);
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
		PanelA1200 panel = new PanelA1200();
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
		Object obj = cmbMaritalStatusA1200.getSelectedItem();
		if (obj != null) {
			sectionA.setA1200((cmbMaritalStatusA1200.getSelectedItem()
					.toString()));
		} else {
			sectionA.setA1200("");
		}
	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbMaritalStatusA1200.setSelectedItem(sectionA.getA1200());

	}
}
