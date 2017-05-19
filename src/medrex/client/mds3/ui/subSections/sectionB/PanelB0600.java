package medrex.client.mds3.ui.subSections.sectionB;

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
import medrex.commons.vo.mds3.SectionB.Mds3SectionB;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelB0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7657120727562939738L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbB0600;

	public PanelB0600() {
		super();
		setPreferredSize(new Dimension(840, 105));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel_1_1_1_1 = new JxPanel();
		panel_1_1_1_1.setTheme(theme);
		panel_1_1_1_1.setBounds(0, 0, 840, 105);

		panel_1_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				1, false));
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setPreferredSize(new Dimension(840, 112));
		add(panel_1_1_1_1);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);
		panel_5_1_1_1.setLayout(null);
		panel_5_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);

		panel_1_1_1_1.add(panel_5_1_1_1);

		final JxLabel a0100Label_1_1_1 = new JxLabel();
		a0100Label_1_1_1.setTheme(theme);
		a0100Label_1_1_1.setBounds(11, 6, 127, 15);
		a0100Label_1_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		a0100Label_1_1_1.setFontSize(12);
		a0100Label_1_1_1.setFontStyle(Font.BOLD);

		a0100Label_1_1_1.setText("B0600.  Speech Clarity");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
		// 1, false));
		panel_6_1_1_1.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1,
				80);
		panel_1_1_1_1.add(panel_6_1_1_1);

		final JxLabel enterCodeLabel_1_1 = new JxLabel();
		enterCodeLabel_1_1.setTheme(theme);
		enterCodeLabel_1_1.setBounds(15, 9, 54, 14);
		enterCodeLabel_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_1_1.setText("Enter Code");
		panel_6_1_1_1.add(enterCodeLabel_1_1);

		cmbB0600 = new JxComboBox();
		cmbB0600.setTheme(theme);
		cmbB0600.setBounds(15, 31, 50, 22);

		cmbB0600.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));
		cmbB0600.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1_1.add(cmbB0600);

		final JxPanel panel_7_1_1_1 = new JxPanel();
		panel_7_1_1_1.setTheme(theme);
		panel_7_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				1, false));

		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(80, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				80);
		panel_1_1_1_1.add(panel_7_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1.setTheme(theme);

		aNationalProviderLabel_2_1_1.setFontSize(12);
		aNationalProviderLabel_2_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_2_1_1
				.setText("<html><body><b> Select best description of speech pattern");
		aNationalProviderLabel_2_1_1.setBounds(10, 5, 246, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_2_1_1);

		final JxLabel aNationalProviderLabel_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1.setTheme(theme);

		aNationalProviderLabel_1_2_1_1.setFontSize(12);
		aNationalProviderLabel_1_2_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2_1_1
				.setText("<html><body>0. &nbsp <b>Clear speech </b>- distinct intelligible words");
		aNationalProviderLabel_1_2_1_1.setBounds(32, 25, 490, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>1. &nbsp<b>Unclear speech </b>- slurred or mumbled words");
		aNationalProviderLabel_1_1_1_1_1.setBounds(32, 45, 642, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_1);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_3
				.setText("<html><body>2. &nbsp<b> No speech </b>- absence of spoken words");
		label_3.setBounds(32, 65, 305, 14);
		panel_7_1_1_1.add(label_3);
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
		PanelB0600 panel = new PanelB0600();
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
		Mds3SectionB sectionB = (Mds3SectionB) Mds3Controller.getInstance()
				.getSection(Mds3SectionB.class);
		Object obj = cmbB0600.getSelectedItem();
		if (obj != null) {
			sectionB.setB0600(cmbB0600.getSelectedItem().toString());
		} else {
			sectionB.setB0600("");
		}

	}

	public void doUpdate() {
		Mds3SectionB mds3SectionB = (Mds3SectionB) Mds3Controller.getInstance()
				.getSection(Mds3SectionB.class);
		cmbB0600.setSelectedItem(mds3SectionB.getB0600());

	}
}
