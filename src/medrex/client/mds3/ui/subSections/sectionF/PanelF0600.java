package medrex.client.mds3.ui.subSections.sectionF;

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
import medrex.commons.vo.mds3.SectionF.Mds3SectionF;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelF0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1711469210685223471L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbF0600;

	public PanelF0600() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 100));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 100);
		add(panel);
		final JxPanel panel_5_2_1 = new JxPanel();
		panel_5_2_1.setTheme(theme);
		panel_5_2_1.setLayout(null);
		panel_5_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_2_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_5_2_1);

		final JxLabel a0100Label_2_1 = new JxLabel();
		a0100Label_2_1.setTheme(theme);
		a0100Label_2_1.setBounds(5, 0, Mds3Constants.PAGE_WIDTH, 25);
		a0100Label_2_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		a0100Label_2_1.setFontSize(12);
		a0100Label_2_1.setFontStyle(Font.BOLD);
		a0100Label_2_1
				.setText("F0600. Daily and Activity Preferences Primary Respondant");
		panel_5_2_1.add(a0100Label_2_1);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 25, 841, 75);
		panel.add(panel_1);

		final JxPanel panel_6_2_1 = new JxPanel();
		panel_6_2_1.setTheme(theme);
		panel_6_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 75);
		panel_1.add(panel_6_2_1);

		final JxLabel enterCodeLabel_2_1 = new JxLabel();
		enterCodeLabel_2_1.setTheme(theme);
		enterCodeLabel_2_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_2_1.setText("Enter Code");
		enterCodeLabel_2_1.setBounds(15, 10, 54, 14);
		panel_6_2_1.add(enterCodeLabel_2_1);

		cmbF0600 = new JxComboBox();
		cmbF0600.setTheme(theme);

		cmbF0600.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2",
				"9" }));
		cmbF0600.setPreferredSize(new Dimension(50, 20));
		cmbF0600.setBounds(15, 30, 50, 20);
		panel_6_2_1.add(cmbF0600);

		final JxPanel panel_7_2_1 = new JxPanel();
		panel_7_2_1.setTheme(theme);
		panel_7_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_2_1.setOpaque(true);
		panel_7_2_1.setLayout(null);
		panel_7_2_1
				.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 75);
		panel_1.add(panel_7_2_1);

		final JxLabel aNationalProviderLabel_3_1 = new JxLabel();
		aNationalProviderLabel_3_1.setTheme(theme);
		aNationalProviderLabel_3_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_3_1
				.setText("<html><b>Indicate primary respondant</b>for daily and activity preferences(F0400 and F0500)");
		aNationalProviderLabel_3_1.setBounds(10, 5, 607, 14);
		panel_7_2_1.add(aNationalProviderLabel_3_1);

		final JxLabel aNationalProviderLabel_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_3_1.setTheme(theme);
		aNationalProviderLabel_1_3_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1.setText("<html>1. <b>Resident");
		aNationalProviderLabel_1_3_1.setBounds(39, 22, 311, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_1
				.setText("<html>2. <b>Family or significant other </b>(close friend or other representative)");
		aNationalProviderLabel_1_3_1_1.setBounds(39, 38, 419, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_2
				.setText("<html>9. <b>Interview could not be completed</b> by resident or family/significant others(\"No Response\" to 3 or more items)");
		aNationalProviderLabel_1_3_1_2.setBounds(39, 54, 637, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_1_2);

		doUpdate();

	}

	@Override
	public void doSave() {
		Mds3SectionF mds3sectionF = (Mds3SectionF) Mds3Controller.getInstance()
				.getSection(Mds3SectionF.class);
		Object obj = cmbF0600.getSelectedItem();
		if (obj != null) {
			mds3sectionF.setF0600((String) cmbF0600.getSelectedItem());
		} else {
			mds3sectionF.setF0600("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionF mds3sectionF = (Mds3SectionF) Mds3Controller.getInstance()
				.getSection(Mds3SectionF.class);
		cmbF0600.setSelectedItem(mds3sectionF.getF0600());

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
		PanelF0600 panel = new PanelF0600();
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

}
