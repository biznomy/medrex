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

public class PanelB0700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5618402950184692009L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbB0700;

	public PanelB0700() {
		super();
		setPreferredSize(new Dimension(840, 135));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel_1_1_1_1_1 = new JxPanel();
		panel_1_1_1_1_1.setTheme(theme);
		panel_1_1_1_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 135);

		panel_1_1_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				1, false));
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setPreferredSize(new Dimension(840, 135));
		add(panel_1_1_1_1_1);

		final JxPanel panel_5_1_1_1_1 = new JxPanel();
		panel_5_1_1_1_1.setTheme(theme);
		panel_5_1_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setHgap(10);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1_1.setLayout(flowLayout_10);
		panel_5_1_1_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_1_1_1_1_1.add(panel_5_1_1_1_1);

		final JxLabel a0100Label_1_1_1_1 = new JxLabel();
		a0100Label_1_1_1_1.setTheme(theme);

		a0100Label_1_1_1_1.setFontSize(12);
		a0100Label_1_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1_1.setText("B0700.  Makes Self Understood");
		panel_5_1_1_1_1.add(a0100Label_1_1_1_1);

		final JxPanel panel_6_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_1_1_1_1.setBorder(new
		// LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1_1_1.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1,
				110);
		panel_1_1_1_1_1.add(panel_6_1_1_1_1);

		final JxLabel enterCodeLabel_1_1_1 = new JxLabel();
		enterCodeLabel_1_1_1.setTheme(theme);
		enterCodeLabel_1_1_1.setBounds(15, 8, 54, 14);
		enterCodeLabel_1_1_1.setText("Enter Code");
		panel_6_1_1_1_1.add(enterCodeLabel_1_1_1);

		cmbB0700 = new JxComboBox();
		cmbB0700.setTheme(theme);
		cmbB0700.setBounds(15, 30, 50, 20);

		cmbB0700.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3" }));
		cmbB0700.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1_1_1.add(cmbB0700);

		final JxPanel panel_7_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				1, false));

		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(80, 24,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 111);
		panel_1_1_1_1_1.add(panel_7_1_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_2_1_1_1.setFontSize(12);
		aNationalProviderLabel_2_1_1_1
				.setText("<html><body><b>Ability to express ideas and wants</b>, consider both verbal and non-verbal expression");
		aNationalProviderLabel_2_1_1_1.setBounds(10, 5, 612, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_2_1_1_1);

		final JxLabel aNationalProviderLabel_1_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_2_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_2_1_1_1
				.setText("<html><body>0. &nbsp <b>Understood</b>");
		aNationalProviderLabel_1_2_1_1_1.setBounds(32, 25, 490, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1_1
				.setText("<html><body>1. &nbsp <b>Usually understood </b>- difficulty communicating some words or finishing thoughts <b> but</b> is able if prompted or given time ");
		aNationalProviderLabel_1_1_1_1_1_1.setBounds(32, 45, 686, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1);

		final JxLabel label_3_1 = new JxLabel();
		label_3_1.setTheme(theme);

		label_3_1.setFontSize(12);
		label_3_1
				.setText("<html><body>2. &nbsp <b>Sometimes understood </b>- ability is limited to making concrete requests");
		label_3_1.setBounds(32, 65, 532, 14);
		panel_7_1_1_1_1.add(label_3_1);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4.setText("<html><body>3. &nbsp <b>Rarely/never understood</b>");
		label_4.setBounds(32, 85, 410, 14);
		panel_7_1_1_1_1.add(label_4);
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
		PanelB0700 panel = new PanelB0700();
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
	public void doSave() {
		Mds3SectionB sectionB = (Mds3SectionB) Mds3Controller.getInstance()
				.getSection(Mds3SectionB.class);
		Object obj = cmbB0700.getSelectedItem();
		if (obj != null) {
			sectionB.setB0700(cmbB0700.getSelectedItem().toString());
		} else {
			sectionB.setB0700("");
		}

	}

	public void doUpdate() {
		Mds3SectionB sectionB = (Mds3SectionB) Mds3Controller.getInstance()
				.getSection(Mds3SectionB.class);
		cmbB0700.setSelectedItem(sectionB.getB0700());
	}

}
