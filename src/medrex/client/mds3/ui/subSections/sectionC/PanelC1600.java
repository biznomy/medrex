package medrex.client.mds3.ui.subSections.sectionC;

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
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelC1600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2847303975922048462L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbC1600;

	public PanelC1600() {
		super();
		setPreferredSize(new Dimension(840, 90));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel_1_2_1 = new JxPanel();
		panel_1_2_1.setTheme(theme);
		panel_1_2_1.setBounds(0, 0, 840, 90);

		panel_1_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setPreferredSize(new Dimension(840, 80));
		add(panel_1_2_1);

		final JxPanel panel_5_2_1 = new JxPanel();
		panel_5_2_1.setTheme(theme);
		panel_5_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_29 = new FlowLayout();
		flowLayout_29.setHgap(10);
		flowLayout_29.setAlignment(FlowLayout.LEFT);
		panel_5_2_1.setLayout(flowLayout_29);
		panel_5_2_1.setBounds(0, 0, 840, 26);
		panel_1_2_1.add(panel_5_2_1);

		final JxLabel a0100Label_2_1 = new JxLabel();
		a0100Label_2_1.setTheme(theme);

		a0100Label_2_1.setFontSize(12);
		a0100Label_2_1.setFontStyle(Font.BOLD);
		a0100Label_2_1.setText("C1600 .  Acute Onset Mental Status Change");
		panel_5_2_1.add(a0100Label_2_1);

		final JxPanel panel_6_2_1 = new JxPanel();
		panel_6_2_1.setTheme(theme);
		panel_6_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBounds(0, 25, 81, 65);
		panel_1_2_1.add(panel_6_2_1);

		final JxLabel enterCodeLabel_2_1 = new JxLabel();
		enterCodeLabel_2_1.setTheme(theme);
		enterCodeLabel_2_1.setText("Enter Code");
		enterCodeLabel_2_1.setBounds(10, 10, 54, 14);
		panel_6_2_1.add(enterCodeLabel_2_1);

		cmbC1600 = new JxComboBox();
		cmbC1600.setTheme(theme);
		cmbC1600.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbC1600.setPreferredSize(new Dimension(50, 20));
		cmbC1600.setBounds(10, 30, 50, 20);
		panel_6_2_1.add(cmbC1600);

		final JxPanel panel_7_2_1 = new JxPanel();
		panel_7_2_1.setTheme(theme);
		panel_7_2_1.setOpaque(false);
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(80, 25, 760, 65);
		panel_1_2_1.add(panel_7_2_1);

		final JxLabel aNationalProviderLabel_3_2 = new JxLabel();
		aNationalProviderLabel_3_2.setTheme(theme);
		aNationalProviderLabel_3_2
				.setText("<html><b>Is there evidence of acute change in mental status </b> from the resident's baseline?");
		aNationalProviderLabel_3_2.setBounds(10, 5, 607, 14);
		panel_7_2_1.add(aNationalProviderLabel_3_2);

		final JxLabel aNationalProviderLabel_1_3_2 = new JxLabel();
		aNationalProviderLabel_1_3_2.setTheme(theme);

		aNationalProviderLabel_1_3_2.setFontSize(12);
		aNationalProviderLabel_1_3_2.setText("<html>0. &nbsp <b>NO");
		aNationalProviderLabel_1_3_2.setBounds(48, 26, 62, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_2);

		final JxLabel aNationalProviderLabel_1_3_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_2_1.setText("<html>1. &nbsp <b>Yes");
		aNationalProviderLabel_1_3_2_1.setBounds(48, 44, 62, 14);
		panel_7_2_1.add(aNationalProviderLabel_1_3_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setTheme(theme);
		add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setPreferredSize(new Dimension(820, 30));

		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("<html>Copyright (c) 1990 Annals of internal medicines. All rights reserved. Adapted with permission.<br>MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
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
		PanelC1600 panel = new PanelC1600();
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
		Object obj = cmbC1600.getSelectedItem();
		if (obj != null) {
			sectionC.setC1600(cmbC1600.getSelectedItem().toString());
		} else {
			sectionC.setC1600("");
		}
	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbC1600.setSelectedItem(mds3sectionC.getC1600());

	}
}
