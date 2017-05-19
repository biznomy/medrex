package medrex.client.mds3.ui.subSections.sectionB;

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
import medrex.commons.vo.mds3.SectionB.Mds3SectionB;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelB1200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8741868881525490206L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbB1200;

	public PanelB1200() {
		super();
		setPreferredSize(new Dimension(840, 91));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_1_2 = new JxPanel();
		panel_1_1_1_2.setTheme(theme);
		panel_1_1_1_2.setBounds(0, 0, 840, 90);

		panel_1_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setPreferredSize(new Dimension(840, 91));
		add(panel_1_1_1_2);

		final JxPanel panel_5_1_1_2 = new JxPanel();
		panel_5_1_1_2.setTheme(theme);
		panel_5_1_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		final FlowLayout flowLayout_16 = new FlowLayout();
		flowLayout_16.setHgap(10);
		flowLayout_16.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2.setLayout(flowLayout_16);
		panel_5_1_1_2.setBounds(0, 0, 840, 25);
		panel_1_1_1_2.add(panel_5_1_1_2);

		final JxLabel a0100Label_1_1_2 = new JxLabel();
		a0100Label_1_1_2.setTheme(theme);

		a0100Label_1_1_2.setFontSize(12);
		a0100Label_1_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_1_2.setText("B1200.  Corrective Lenses");
		panel_5_1_1_2.add(a0100Label_1_1_2);

		final JxPanel panel_6_1_1_2 = new JxPanel();
		panel_6_1_1_2.setTheme(theme);
		panel_6_1_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
		// 1, false));
		final FlowLayout flowLayout_17 = new FlowLayout();
		flowLayout_17.setVgap(8);
		panel_6_1_1_2.setLayout(flowLayout_17);
		panel_6_1_1_2.setBounds(0, 23, 80, 67);
		panel_1_1_1_2.add(panel_6_1_1_2);

		final JxLabel enterCodeLabel_1_2 = new JxLabel();
		enterCodeLabel_1_2.setTheme(theme);
		enterCodeLabel_1_2.setText("Enter Code");
		panel_6_1_1_2.add(enterCodeLabel_1_2);

		cmbB1200 = new JxComboBox();
		cmbB1200.setTheme(theme);

		cmbB1200.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));
		cmbB1200.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1_2.add(cmbB1200);

		final JxPanel panel_7_1_1_2 = new JxPanel();
		panel_7_1_1_2.setTheme(theme);
		panel_7_1_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));

		panel_7_1_1_2.setLayout(null);
		panel_7_1_1_2.setBounds(80, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				66);
		panel_1_1_1_2.add(panel_7_1_1_2);

		final JxLabel aNationalProviderLabel_2_1_2 = new JxLabel();
		aNationalProviderLabel_2_1_2.setTheme(theme);

		aNationalProviderLabel_2_1_2.setFontSize(12);
		aNationalProviderLabel_2_1_2
				.setText("<html><body><b>Corrective lenses(contacts, glasses, or magnifying glass) used </b>in completing B1000, Vision");
		aNationalProviderLabel_2_1_2.setBounds(10, 5, 613, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_2_1_2);

		final JxLabel aNationalProviderLabel_1_2_1_2 = new JxLabel();
		aNationalProviderLabel_1_2_1_2.setTheme(theme);

		aNationalProviderLabel_1_2_1_2.setFontSize(12);
		aNationalProviderLabel_1_2_1_2.setText("<html><body>0. &nbsp<b>No</b>");
		aNationalProviderLabel_1_2_1_2.setBounds(32, 25, 490, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_2_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_2
				.setText("<html><body>1. &nbsp<b>Yes</b>");
		aNationalProviderLabel_1_1_1_1_2.setBounds(32, 42, 642, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setPreferredSize(new Dimension(840, 35));
		add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);

		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFontSize(14);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
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
		PanelB1200 panel = new PanelB1200();
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
		Object obj = cmbB1200.getSelectedItem();
		if (obj != null) {
			sectionB.setB1200(cmbB1200.getSelectedItem().toString());
		} else {
			sectionB.setB1200("");
		}
	}

	public void doUpdate() {
		Mds3SectionB mds3SectionB = (Mds3SectionB) Mds3Controller.getInstance()
				.getSection(Mds3SectionB.class);
		cmbB1200.setSelectedItem(mds3SectionB.getB1200());

	}
}
