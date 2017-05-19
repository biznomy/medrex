package medrex.client.mds3.ui.subSections.sectionC;

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
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelC0800 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7959200883380682227L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbC0800;

	public PanelC0800() {
		super();
		setPreferredSize(new Dimension(840, 95));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panelC0800 = new JxPanel();
		panelC0800.setTheme(theme);
		panelC0800.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panelC0800.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panelC0800.setLayout(null);
		panelC0800.setBounds(0, 0, 840, 100);
		add(panelC0800);

		final JxPanel panel_1_1_2 = new JxPanel();
		panel_1_1_2.setTheme(theme);
		panel_1_1_2.setBounds(5, 0, 830, 95);

		panel_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(820, 100));
		panelC0800.add(panel_1_1_2);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_1_1.setBounds(0, 25, 81, 70);
		panel_1_1_2.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(15, 9, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbC0800 = new JxComboBox();
		cmbC0800.setTheme(theme);
		cmbC0800.setBounds(17, 31, 50, 20);
		cmbC0800.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"" }));

		cmbC0800.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbC0800);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7_1_1.setOpaque(false);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(80, 25, 750, 70);
		panel_1_1_2.add(panel_7_1_1);

		final JxPanel panel_7_1_2 = new JxPanel();
		panel_7_1_2.setTheme(theme);
		panel_7_1_2.setOpaque(false);
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(10, 3, 719, 62);
		panel_7_1_1.add(panel_7_1_2);

		final JxLabel aNationalProviderLabel_3_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1
				.setText("Seems or appears to recall long past");
		aNationalProviderLabel_3_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_2.add(aNationalProviderLabel_3_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_2
				.setText("<html><body>0. &nbsp <b>Memory OK");
		aNationalProviderLabel_1_3_1_2.setBounds(20, 25, 311, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_3_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1
				.setText("<html><body>1. &nbsp<b> Memory Problem");
		aNationalProviderLabel_1_3_1_1_1.setBounds(20, 45, 311, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_3_1_1_1);

		final JxPanel panel_5_1_1_2 = new JxPanel();
		panel_5_1_1_2.setTheme(theme);
		panel_5_1_1_2.setLayout(null);
		panel_5_1_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_5_1_1_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2.setBounds(0, 0, 830, 25);
		panel_1_1_2.add(panel_5_1_1_2);

		final JxLabel a0100Label_1_1_2 = new JxLabel();
		a0100Label_1_1_2.setTheme(theme);
		a0100Label_1_1_2.setBounds(11, 6, 175, 15);

		a0100Label_1_1_2.setFontSize(12);
		a0100Label_1_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_1_2.setText("C0800.  Long Term Memory OK");
		panel_5_1_1_2.add(a0100Label_1_1_2);
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
		PanelC0800 panel = new PanelC0800();
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
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		Object ob = cmbC0800.getSelectedItem();
		if (ob != null) {
			sectionC.setC0800(cmbC0800.getSelectedItem().toString());
		} else {
			sectionC.setC0800("");
		}
	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbC0800.setSelectedItem(mds3sectionC.getC0800());
	}

}
