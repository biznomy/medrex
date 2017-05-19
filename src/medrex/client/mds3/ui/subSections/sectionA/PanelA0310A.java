package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.BorderLayout;
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
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA0310A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8569695811751548599L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbA0310A;

	public PanelA0310A() {
		super();
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 189));
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Color.black, 1, false));

		panel.setOpaque(false);
		panel.setLayout(null);
		// panel.setBounds(0, 0, 840, 820);
		add(panel);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, 0, 840, 25);
		panel.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1.setText("A0310. Type of Assessment");
		a0100Label_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				166);
		panel.add(panel_7_1_1);

		final JxLabel aNationalProviderLabel_2_1 = new JxLabel();
		aNationalProviderLabel_2_1.setTheme(theme);

		aNationalProviderLabel_2_1.setFontSize(12);
		aNationalProviderLabel_2_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_2_1
				.setText("A. Federal OBRA Reason for Assessment");
		aNationalProviderLabel_2_1.setBounds(10, 5, 294, 14);
		panel_7_1_1.add(aNationalProviderLabel_2_1);

		final JxLabel aNationalProviderLabel_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_2_1
				.setText("<html><body>01. <b>Admission</b> assessment (required by day 14)");
		aNationalProviderLabel_1_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2_1.setBounds(25, 25, 342, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1
				.setText("<html><body>02. <b>Quarterly</b> review Assessment");
		aNationalProviderLabel_1_1_1_1.setBounds(25, 45, 342, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_1
				.setText("<html><body>03. <b>Annual</b> Assessment");
		aNationalProviderLabel_1_1_1_1_1.setBounds(25, 65, 383, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_2
				.setText("<html><body>04. <b>Significant change in status</b> assessment");
		aNationalProviderLabel_1_1_1_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_2.setBounds(25, 85, 617, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_3 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_3.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_3.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_3
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_3
				.setText("<html><body>05. <b>Significant correction</b> to <b>prior comprehensive</b> assessment");
		aNationalProviderLabel_1_1_1_1_3.setBounds(25, 105, 541, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_3);

		final JxLabel aNationalProviderLabel_1_1_1_1_4 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_4.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_4.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_4
				.setText("<html><body>05. <b>Significant correction</b> to <b>prior quarterly</b> assessment");
		aNationalProviderLabel_1_1_1_1_4
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_4.setBounds(25, 125, 594, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_4);

		final JxLabel aNationalProviderLabel_1_1_1_1_5 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_5.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_5.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_5
				.setText("<html><body>99.<b> Not OBRA required</b> assessment");
		aNationalProviderLabel_1_1_1_1_5
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_5.setBounds(25, 145, 567, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1_5);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);

		// panel_6_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1
				.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 166);
		panel.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(16, 9, 54, 14);
		enterCodeLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbA0310A = new JxComboBox();
		cmbA0310A.setTheme(theme);
		cmbA0310A.setBounds(15, 31, 50, 22);

		cmbA0310A.setModel(new DefaultComboBoxModel(new String[] { " ", "01",
				"02", "03", "04", "05", "06", "99" }));
		cmbA0310A.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbA0310A);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		Object obj = cmbA0310A.getSelectedItem();
		if (obj != null) {
			sectionA.setA0310A((cmbA0310A.getSelectedItem().toString()));
		} else {
			sectionA.setA0310A("");
		}

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
		PanelA0310A panel = new PanelA0310A();
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
	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbA0310A.setSelectedItem(mds3SectionA.getA0310A());

	}

}
