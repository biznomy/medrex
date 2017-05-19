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
import medrex.commons.vo.mds3.SectionB.Mds3SectionB;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelB0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 691635311141573087L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbB0300;

	public PanelB0300() {
		super();
		setPreferredSize(new Dimension(840, 92));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_1 = new JxPanel();
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setBounds(0, 0, 840, 92);

		panel_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY, 1,
				false));
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setPreferredSize(new Dimension(840, 92));
		add(panel_1_1_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_5_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 26);
		panel_1_1_1.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1.setText("B0300.   Hearing Aid");
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setVgap(8);
		panel_6_1_1.setLayout(flowLayout_7);
		panel_6_1_1.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 66);
		panel_1_1_1.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(13, 9, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbB0300 = new JxComboBox();
		cmbB0300.setTheme(theme);
		cmbB0300.setBounds(15, 31, 50, 22);
		cmbB0300.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbB0300.setPreferredSize(new Dimension(50, 22));
		panel_6_1_1.add(cmbB0300);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY, 1,
				false));

		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(80, 25, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				66);
		panel_1_1_1.add(panel_7_1_1);

		final JxLabel aNationalProviderLabel_2_1 = new JxLabel();
		aNationalProviderLabel_2_1.setTheme(theme);

		aNationalProviderLabel_2_1.setFontSize(12);
		aNationalProviderLabel_2_1
				.setText("<html><body><b> Hearing aid or other hearing appliance used </b> in completing B0200, Hearing");
		aNationalProviderLabel_2_1.setBounds(10, 5, 524, 14);
		panel_7_1_1.add(aNationalProviderLabel_2_1);

		final JxLabel aNationalProviderLabel_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_2_1.setText("<html><body>0. &nbsp<b>No</b>");
		aNationalProviderLabel_1_2_1.setBounds(32, 25, 490, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1
				.setText("<html><body>1.&nbsp <b>Yes</b>");
		aNationalProviderLabel_1_1_1_1.setBounds(32, 43, 642, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_1_1_1);
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
		PanelB0300 panel = new PanelB0300();
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
		sectionB.setB0300(cmbB0300.getSelectedItem() + "");

	}

	public void doUpdate() {
		Mds3SectionB mds3SectionB = (Mds3SectionB) Mds3Controller.getInstance()
				.getSection(Mds3SectionB.class);
		cmbB0300.setSelectedItem(mds3SectionB.getB0300());
	}

}
