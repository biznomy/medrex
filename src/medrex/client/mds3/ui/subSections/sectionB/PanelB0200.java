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

public class PanelB0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5984490739267711206L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbB0200;

	public PanelB0200() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 124));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 124);

		panel_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY, 1,
				false));
		panel_1_1.setLayout(null);
		panel_1_1
				.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 112));
		add(panel_1_1);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1.setLayout(flowLayout_3);
		panel_5_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_1_1.add(panel_5_1);

		final JxLabel a0100Label_1 = new JxLabel();
		a0100Label_1.setTheme(theme);

		a0100Label_1.setFontSize(12);
		a0100Label_1.setFontStyle(Font.BOLD);
		a0100Label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1.setText("B0200.   Hearing");
		panel_5_1.add(a0100Label_1);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setLayout(null);
		// panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 99);
		panel_1_1.add(panel_6_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(15, 9, 54, 14);
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		cmbB0200 = new JxComboBox();
		cmbB0200.setTheme(theme);
		cmbB0200.setBounds(15, 31, 50, 22);
		cmbB0200.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3" }));

		cmbB0200.setPreferredSize(new Dimension(50, 20));
		panel_6_1.add(cmbB0200);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(80, 25, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 99);
		panel_1_1.add(panel_7_1);

		final JxLabel aNationalProviderLabel_2 = new JxLabel();
		aNationalProviderLabel_2.setTheme(theme);

		aNationalProviderLabel_2.setFontSize(12);
		aNationalProviderLabel_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_2
				.setText("<html><body><b>Ability to hear</b>(with hearing aid or hearing appliances if normally used)");
		aNationalProviderLabel_2.setBounds(10, 10, 512, 14);
		panel_7_1.add(aNationalProviderLabel_2);

		final JxLabel aNationalProviderLabel_1_2 = new JxLabel();
		aNationalProviderLabel_1_2.setTheme(theme);

		aNationalProviderLabel_1_2.setFontSize(12);
		aNationalProviderLabel_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2
				.setText("<html><body>0. &nbsp <b>Adequate</b> - no difficulty in normal conversation,social interaction,listening to TV");
		aNationalProviderLabel_1_2.setBounds(32, 30, 490, 14);
		panel_7_1.add(aNationalProviderLabel_1_2);

		final JxLabel aNationalProviderLabel_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1
				.setText("<html><body>1. &nbsp <b>Minimal difficulty</b> - difficulty in some environments(e.g. when person speaks softly or setting is noisy)");
		aNationalProviderLabel_1_1_1.setBounds(32, 48, 642, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_2
				.setText("<html><body>3. &nbsp <b>Highly impaired</b> - absence of useful hearing");
		label_2.setBounds(32, 80, 413, 14);
		panel_7_1.add(label_2);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label
				.setText("<html><body>2. &nbsp <b> Moderate difficulty </b> - speaker has to increase volume and speak distinctly");
		label.setBounds(32, 65, 521, 14);
		panel_7_1.add(label);
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
		PanelB0200 panel = new PanelB0200();
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
		Object obj = cmbB0200.getSelectedItem();
		if (obj != null) {
			sectionB.setB0200(cmbB0200.getSelectedItem().toString());
		} else {
			sectionB.setB0200("");
		}

	}

	public void doUpdate() {
		Mds3SectionB mds3SectionB = (Mds3SectionB) Mds3Controller.getInstance()
				.getSection(Mds3SectionB.class);
		cmbB0200.setSelectedItem(mds3SectionB.getB0200());

	}

}
