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
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA2100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7128089409416326756L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbA2100;

	public PanelA2100() {
		super();
		setPreferredSize(new Dimension(840, 230));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel_1_1_1 = new JxPanel();
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setBounds(0, 0, 840, 230);

		panel_1_1_1.setLayout(null);
		panel_1_1_1.setPreferredSize(new Dimension(840, 229));
		add(panel_1_1_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);

		panel_5_1_1.setFontSize(12);
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 41);
		panel_1_1_1.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);
		a0100Label_1_1.setBounds(11, 6, 140, 15);
		a0100Label_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1.setText("A2100. Discharge Status");
		panel_5_1_1.add(a0100Label_1_1);

		final JxLabel completeOnlyIfLabel_1 = new JxLabel();
		completeOnlyIfLabel_1.setTheme(theme);

		completeOnlyIfLabel_1.setFontSize(12);
		completeOnlyIfLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		completeOnlyIfLabel_1.setText("Complete only if A0310F = 10,11, or 12");
		completeOnlyIfLabel_1.setBounds(11, 25, 242, 14);
		panel_5_1_1.add(completeOnlyIfLabel_1);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		// panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setLayout(null);
		// panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
		// 1, false));
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1
				.setBounds(0, 40, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 190);
		panel_1_1_1.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_1.setBounds(15, 20, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbA2100 = new JxComboBox();
		cmbA2100.setTheme(theme);
		cmbA2100.setBounds(15, 41, 50, 22);

		cmbA2100.setModel(new DefaultComboBoxModel(new String[] { "", "01",
				"02", "03", "04", "05", "06", "07", "08", "99" }));
		cmbA2100.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbA2100);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(80, 40, 760, 191);
		panel_1_1_1.add(panel_7_1_1);

		final JxLabel aNationalProviderLabel_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2_1
				.setText("<html><body>01. <b>Community</b> (private home/apt..,board/care,assisted living,group home)");
		aNationalProviderLabel_1_2_1.setBounds(10, 10, 541, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1
				.setText("<html><body>02. <b>Another nursing home or swing bed</b> ");
		aNationalProviderLabel_1_1_1_1.setBounds(10, 30, 342, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>03. <b>Acute Hospital</b> ");
		aNationalProviderLabel_1_1_1_1_1.setBounds(10, 50, 383, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_2
				.setText("<html><body>04.<b> Psychiatric hospital");
		aNationalProviderLabel_1_1_1_1_2.setBounds(10, 70, 617, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_3 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_3.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_3.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_3
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_3
				.setText("<html><body>05. <b>Inpatient rehabilitation facility");
		aNationalProviderLabel_1_1_1_1_3.setBounds(10, 90, 541, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_3);

		final JxLabel aNationalProviderLabel_1_1_1_1_4 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_4.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_4.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_4
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_4
				.setText("<html><body>06. <b>MR/DD facility");
		aNationalProviderLabel_1_1_1_1_4.setBounds(10, 110, 594, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_4);

		final JxLabel aNationalProviderLabel_1_1_1_1_5 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_5.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_5.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_5
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_5.setText("<html><body>07.<b> Hospice");
		aNationalProviderLabel_1_1_1_1_5.setBounds(10, 130, 567, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_5);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);
		label_5.setText("<html><body>99. <b>Other");
		label_5.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_5.setBounds(10, 170, 189, 14);
		panel_7_1_1.add(label_5);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label.setText("<html><body>08.<b> Deceased");
		label.setBounds(10, 150, 142, 14);
		panel_7_1_1.add(label);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFontSize(14);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setBounds(25, 803, 617, 14);
		panel_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
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
		PanelA2100 panel = new PanelA2100();
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

		Object obj = cmbA2100.getSelectedItem();
		if (obj != null) {
			sectionA.setA2100(cmbA2100.getSelectedItem().toString());
		} else {
			sectionA.setA2100("");
		}

	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbA2100.setSelectedItem(sectionA.getA2100());
	}

}
