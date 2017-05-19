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

public class PanelB1000 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1714246475796485062L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbB1000;

	public PanelB1000() {
		super();
		setPreferredSize(new Dimension(840, 150));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_1_1_1_1_1 = new JxPanel();
		panel_1_1_1_1_1_1_1.setTheme(theme);
		panel_1_1_1_1_1_1_1.setBounds(0, 0, 840, 150);

		panel_1_1_1_1_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, 1, false));
		panel_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1.setPreferredSize(new Dimension(840, 150));
		add(panel_1_1_1_1_1_1_1);

		final JxPanel panel_5_1_1_1_1_1_1 = new JxPanel();
		panel_5_1_1_1_1_1_1.setTheme(theme);
		panel_5_1_1_1_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, 1, false));
		final FlowLayout flowLayout_14 = new FlowLayout();
		flowLayout_14.setHgap(10);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1_1_1.setLayout(flowLayout_14);
		panel_5_1_1_1_1_1_1.setBounds(0, 0, 840, 26);
		panel_1_1_1_1_1_1_1.add(panel_5_1_1_1_1_1_1);

		final JxLabel a0100Label_1_1_1_1_1_1 = new JxLabel();
		a0100Label_1_1_1_1_1_1.setTheme(theme);

		a0100Label_1_1_1_1_1_1.setFontSize(12);
		a0100Label_1_1_1_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1_1_1.setText("B1000.  Vision");
		panel_5_1_1_1_1_1_1.add(a0100Label_1_1_1_1_1_1);

		final JxPanel panel_6_1_1_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_1_1_1_1_1_1.setBorder(new
		// LineBorder(Mds3Constants.BORDER_DARKGRAY, 1, false));
		final FlowLayout flowLayout_15 = new FlowLayout();
		flowLayout_15.setVgap(8);
		panel_6_1_1_1_1_1_1.setLayout(flowLayout_15);
		panel_6_1_1_1_1_1_1.setBounds(0, 25,
				Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 125);
		panel_1_1_1_1_1_1_1.add(panel_6_1_1_1_1_1_1);

		final JxLabel enterCodeLabel_1_1_1_1_1 = new JxLabel();
		enterCodeLabel_1_1_1_1_1.setTheme(theme);
		enterCodeLabel_1_1_1_1_1.setText("Enter Code");
		panel_6_1_1_1_1_1_1.add(enterCodeLabel_1_1_1_1_1);

		cmbB1000 = new JxComboBox();
		cmbB1000.setTheme(theme);

		cmbB1000.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3", "4" }));
		cmbB1000.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1_1_1_1_1.add(cmbB1000);

		final JxPanel panel_7_1_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));

		panel_7_1_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1_1.setBounds(80, 25,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 125);
		panel_1_1_1_1_1_1_1.add(panel_7_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_2_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_2_1_1_1_1_1
				.setText("<html><body><b>Ability to see in adequate light</b>(with glasses or other visual appliances)");
		aNationalProviderLabel_2_1_1_1_1_1.setBounds(10, 5, 458, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_2_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_2_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_2_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_2_1_1_1_1_1
				.setText("<html><body>0. &nbsp <b>Adequate</b> - sees fine detail, including reqular print in newspapers/books");
		aNationalProviderLabel_1_2_1_1_1_1_1.setBounds(32, 25, 490, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1_1_1_1
				.setText("<html><body>1. &nbsp<b>Impaired </b>- sees large print, but not regular print in newspapers/books");
		aNationalProviderLabel_1_1_1_1_1_1_1_1.setBounds(32, 45, 642, 14);
		panel_7_1_1_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1_1_1);

		final JxLabel label_3_1_1_1 = new JxLabel();
		label_3_1_1_1.setTheme(theme);

		label_3_1_1_1.setFontSize(12);
		label_3_1_1_1
				.setText("<html><body>2. &nbsp<b>Moderately impaired</b> - limited vision; not able to see newspaper headlines but can identify objects");
		label_3_1_1_1.setBounds(32, 65, 615, 14);
		panel_7_1_1_1_1_1_1.add(label_3_1_1_1);

		final JxLabel label_4_1_1 = new JxLabel();
		label_4_1_1.setTheme(theme);

		label_4_1_1.setFontSize(12);
		label_4_1_1
				.setText("<html><body>4. &nbsp <b>Severely impaired </b>- no vision or sees only light, colors or shapes; eyes do not appear to follow objects");
		label_4_1_1.setBounds(32, 105, 583, 14);
		panel_7_1_1_1_1_1_1.add(label_4_1_1);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label
				.setText("<html><body>3. &nbsp <b> Highly inpaired </b> - object identification in question, but eyes appear to follow objects");
		label.setBounds(32, 85, 527, 14);
		panel_7_1_1_1_1_1_1.add(label);
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
		PanelB1000 panel = new PanelB1000();
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
		Object obj = cmbB1000.getSelectedItem();
		if (obj != null) {
			sectionB.setB1000(cmbB1000.getSelectedItem() + "");
		} else {
			sectionB.setB1000("");
		}

	}

	public void doUpdate() {
		Mds3SectionB mds3SectionB = (Mds3SectionB) Mds3Controller.getInstance()
				.getSection(Mds3SectionB.class);
		cmbB1000.setSelectedItem(mds3SectionB.getB1000());

	}

}
