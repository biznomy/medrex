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
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA2400 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3313441020031107944L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcDate_1_2_1;
	private JxDateChooser dcDate_1_2;
	private JxComboBox cmbA2400;

	public PanelA2400() {
		super();
		setPreferredSize(new Dimension(840, 230));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_1_1 = new JxPanel();
		panel_1_1_1_1.setTheme(theme);
		panel_1_1_1_1.setBounds(0, 0, 840, 220);

		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setPreferredSize(new Dimension(840, 229));
		add(panel_1_1_1_1);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);
		panel_5_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_1.setLayout(null);
		panel_5_1_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 26);
		panel_1_1_1_1.add(panel_5_1_1_1);

		final JxLabel a0100Label_1_1_1 = new JxLabel();
		a0100Label_1_1_1.setTheme(theme);

		a0100Label_1_1_1.setFontSize(12);
		a0100Label_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1.setText("A2400. Medicare Stay");
		a0100Label_1_1_1.setBounds(11, 6, 180, 15);
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);
		panel_6_1_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_6_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_1_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
		// 1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1,
				195);
		panel_1_1_1_1.add(panel_6_1_1_1);

		final JxLabel enterCodeLabel_1_1 = new JxLabel();
		enterCodeLabel_1_1.setTheme(theme);
		enterCodeLabel_1_1.setText("Enter Code");
		enterCodeLabel_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_1_1.setBounds(16, 9, 54, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_1);

		cmbA2400 = new JxComboBox();
		cmbA2400.setTheme(theme);

		cmbA2400.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));
		cmbA2400.setPreferredSize(new Dimension(50, 20));
		cmbA2400.setBounds(15, 31, 50, 22);
		panel_6_1_1_1.add(cmbA2400);

		final JxPanel panel_7_1_1_1 = new JxPanel();
		panel_7_1_1_1.setTheme(theme);

		panel_7_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				196);
		panel_1_1_1_1.add(panel_7_1_1_1);

		final JxLabel aNationalProviderLabel_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1.setTheme(theme);

		aNationalProviderLabel_1_2_1_1.setFontSize(12);
		aNationalProviderLabel_1_2_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_2_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2_1_1
				.setText("<html><body><b>A.  Has the resident had a Medicare-covered stay since the most recent entry?");
		aNationalProviderLabel_1_2_1_1.setBounds(10, 5, 541, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_2_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_6 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_6.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_6
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_6
				.setText("<html><body>0. &nbsp <b> No --> </b> Skip to B0100, Comatose");
		aNationalProviderLabel_1_1_1_1_6.setBounds(25, 34, 342, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_6);

		final JxLabel aNationalProviderLabel_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_1_1
				.setText("<html><body>1. &nbsp <b> Yes  --> </b> Continue to A2400B, Start date of most recent Medicare stay");
		aNationalProviderLabel_1_1_1_1_1_1.setBounds(25, 63, 519, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_1_1_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_1_1_1_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_2_1
				.setText("<html><body><b> B.</b> &nbsp <b>Start date of most recent Medicare stay:");
		aNationalProviderLabel_1_1_1_1_2_1.setBounds(10, 84, 617, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1);

		final JxLabel endDateLabel = new JxLabel();
		endDateLabel.setTheme(theme);

		endDateLabel.setFontSize(12);
		endDateLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		endDateLabel
				.setText("<html><body><b>C. </b> &nbsp <b> End date of most recent Medicare stay ");
		endDateLabel.setBounds(10, 132, 241, 14);
		panel_7_1_1_1.add(endDateLabel);

		dcDate_1_2 = new JxDateChooser();
		dcDate_1_2.setTheme(theme);
		dcDate_1_2.setBounds(25, 106, 189, 22);
		dcDate_1_2.setDateFormatString("MM/dd/yyyy");
		panel_7_1_1_1.add(dcDate_1_2);

		final JxLabel enterDashesLabel = new JxLabel();
		enterDashesLabel.setTheme(theme);

		enterDashesLabel.setFontSize(12);
		enterDashesLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterDashesLabel.setText("- Enter dashes if stay is ongoing :");
		enterDashesLabel.setBounds(253, 132, 189, 14);
		panel_7_1_1_1.add(enterDashesLabel);

		dcDate_1_2_1 = new JxDateChooser();
		dcDate_1_2_1.setTheme(theme);
		dcDate_1_2_1.setDateFormatString("MM/dd/yyyy");
		dcDate_1_2_1.setBounds(25, 154, 189, 22);
		panel_7_1_1_1.add(dcDate_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1.setText("New JxLabel");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1
				.setBounds(25, 803, 617, 14);
		panel_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1_1);
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
		PanelA2400 panel = new PanelA2400();
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

		Object obj = cmbA2400.getSelectedItem();
		if (obj != null) {
			sectionA.setA2400A(cmbA2400.getSelectedItem().toString());
		} else {
			sectionA.setA2400A("");
		}
		sectionA.setA2400B(dcDate_1_2.getDate());
		sectionA.setA2400C(dcDate_1_2_1.getDate());

	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbA2400.setSelectedItem(sectionA.getA2400A());
		dcDate_1_2.setDate(sectionA.getA2400B());
		dcDate_1_2_1.setDate(sectionA.getA2400C());

	}

}
