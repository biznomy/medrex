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
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA1800 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8760454046879184007L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbA1800;

	public PanelA1800() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 200));
		setName("");
		setBackground(Color.WHITE);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBounds(0, 0, 840, 200);
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);

		panel_1.setPreferredSize(new Dimension(840, 200));
		add(panel_1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_2);
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 26);
		panel_1.add(panel_5);

		final JxLabel a0100Label = new JxLabel();
		a0100Label.setTheme(theme);

		a0100Label.setFontSize(12);
		a0100Label.setFontStyle(Font.BOLD);
		a0100Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label.setText("A1800.  Entered Form");
		panel_5.add(a0100Label);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);
		// panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 175);
		panel_1.add(panel_6);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_2.setBounds(15, 32, 54, 14);
		panel_6.add(enterCodeLabel_2);

		cmbA1800 = new JxComboBox();
		cmbA1800.setTheme(theme);
		cmbA1800.setModel(new DefaultComboBoxModel(new String[] { "", "01",
				"02", "03", "04", "05", "06", "07", "99" }));

		cmbA1800.setPreferredSize(new Dimension(50, 20));
		cmbA1800.setBounds(15, 52, 50, 22);
		panel_6.add(cmbA1800);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7.setLayout(null);

		panel_7.setBounds(80, 25, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 176);
		panel_1.add(panel_7);

		final JxLabel aNationalProviderLabel = new JxLabel();
		aNationalProviderLabel.setTheme(theme);

		aNationalProviderLabel.setFontSize(12);
		aNationalProviderLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel
				.setText("<html><body>01. <b>Community</b> (private home/apt., board/care,assisted living,group home)");
		aNationalProviderLabel.setBounds(10, 5, 417, 24);
		panel_7.add(aNationalProviderLabel);

		final JxLabel aNationalProviderLabel_1 = new JxLabel();
		aNationalProviderLabel_1.setTheme(theme);

		aNationalProviderLabel_1.setFontSize(12);
		aNationalProviderLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1
				.setText("<html><body>02. <b>Another nursing home or swing bed");
		aNationalProviderLabel_1.setBounds(10, 31, 268, 14);
		panel_7.add(aNationalProviderLabel_1);

		final JxLabel aNationalProviderLabel_1_1 = new JxLabel();
		aNationalProviderLabel_1_1.setTheme(theme);

		aNationalProviderLabel_1_1.setFontSize(12);
		aNationalProviderLabel_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1.setText("<html><body>03.<b> Acute hospital");
		aNationalProviderLabel_1_1.setBounds(10, 51, 120, 14);
		panel_7.add(aNationalProviderLabel_1_1);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label.setText("<html><body>04.<b> Psychiatric hospital");
		label.setBounds(10, 71, 163, 14);
		panel_7.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_1.setText("<html><body>05. <b>Inpatient rehabilitation facility");
		label_1.setBounds(10, 91, 239, 14);
		panel_7.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_2.setText("<html><body>06. <b>MR/DD facility");
		label_2.setBounds(10, 111, 255, 14);
		panel_7.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_3.setText("<html><body>07.<b> Hospice");
		label_3.setBounds(10, 130, 142, 14);
		panel_7.add(label_3);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_4.setText("<html><body>99. <b>Other");
		label_4.setBounds(10, 150, 54, 14);
		panel_7.add(label_4);
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
		PanelA1800 panel = new PanelA1800();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);
	}

	public void doSave() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		Object obj = cmbA1800.getSelectedItem();
		if (obj != null) {
			sectionA.setA1800((cmbA1800.getSelectedItem().toString()));
		} else {
			sectionA.setA1800("");
		}
	}

	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbA1800.setSelectedItem(mds3SectionA.getA1800());

	}

}
