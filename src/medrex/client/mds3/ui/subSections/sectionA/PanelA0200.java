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
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2019720206802933988L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbA0200;

	public PanelA0200() {
		super();
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 100));
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setPreferredSize(new Dimension(0, 40));
		// panel.setPreferredSize(new Dimension(0, 0));

		panel.setLayout(null);
		// panel.setBounds(5, 5, 840, 95);
		add(panel);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);

		// panel_5_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		panel_5_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		panel_5_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1.setLayout(flowLayout_3);
		panel_5_1.setBounds(0, 0, 840, 25);
		panel.add(panel_5_1);

		final JxLabel a0100Label_1 = new JxLabel();
		a0100Label_1.setTheme(theme);

		a0100Label_1.setFontSize(12);
		a0100Label_1.setFontStyle(Font.BOLD);
		a0100Label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1.setText("A0200 Type of Provider");
		panel_5_1.add(a0100Label_1);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);

		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(8);
		panel_6_1.setLayout(flowLayout_4);
		panel_6_1.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 77);
		panel.add(panel_6_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_6_1.add(enterCodeLabel);

		cmbA0200 = new JxComboBox();
		cmbA0200.setTheme(theme);
		cmbA0200.setModel(new DefaultComboBoxModel(
				new String[] { " ", "1", "2" }));

		cmbA0200.setPreferredSize(new Dimension(50, 22));
		panel_6_1.add(cmbA0200);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		// panel_7_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_LIGHTGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 77);
		panel.add(panel_7_1);

		final JxLabel aNationalProviderLabel_2 = new JxLabel();
		aNationalProviderLabel_2.setTheme(theme);

		aNationalProviderLabel_2.setFontSize(12);
		aNationalProviderLabel_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2.setText("Type Of Provider");
		aNationalProviderLabel_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_2.setBounds(10, 5, 206, 14);
		panel_7_1.add(aNationalProviderLabel_2);

		final JxLabel aNationalProviderLabel_1_2 = new JxLabel();
		aNationalProviderLabel_1_2.setTheme(theme);

		aNationalProviderLabel_1_2.setFontSize(12);
		aNationalProviderLabel_1_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2.setText("1. Nursing Home");
		aNationalProviderLabel_1_2.setBounds(25, 25, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_2);

		final JxLabel aNationalProviderLabel_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1.setText("2. Swing Bed");
		aNationalProviderLabel_1_1_1.setBounds(25, 45, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		Object obj = cmbA0200.getSelectedItem();
		if (obj != null) {
			sectionA.setA0200((cmbA0200.getSelectedItem().toString()));
		} else {
			sectionA.setA0200("");
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
		PanelA0200 panel = new PanelA0200();
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

	/*
	 * public void doSave(){ Mds3SectionA sectionA =
	 * (Mds3SectionA)Mds3Controller
	 * .getInstance().getSection(Mds3SectionA.class); //Mds3SectionA sectionA =
	 * (Mds3SectionA) Global.mdsController.getSection(Mds3SectionA.class);
	 * sectionA.setA0200(cmbTypeOfProvider.getSelectedItem() + ""); }
	 */

	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbA0200.setSelectedItem(mds3SectionA.getA0100A());

	}
}
