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
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA1500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9014654999628068043L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbPreadmissionScreeningAndReviewA1500;

	public PanelA1500() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 120));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(0, 0, 840, 120);

		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 120));
		add(panel_1_1);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 35);
		panel_1_1.add(panel_5_1);

		final JxLabel a0100Label_1 = new JxLabel();
		a0100Label_1.setTheme(theme);
		a0100Label_1.setBounds(11, 6, 354, 30);

		a0100Label_1.setFontSize(12);
		a0100Label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1
				.setText("<html><body><b>A1500. Preadmission Screening and Resident Review (PASRR)</b><br>Complete only if A0310 = 01");
		panel_5_1.add(a0100Label_1);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setLayout(null);
		// panel_6_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBounds(0, 35, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 85);
		panel_1_1.add(panel_6_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(15, 9, 54, 14);
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		cmbPreadmissionScreeningAndReviewA1500 = new JxComboBox();
		cmbPreadmissionScreeningAndReviewA1500.setTheme(theme);
		cmbPreadmissionScreeningAndReviewA1500.setBounds(15, 31, 50, 22);
		cmbPreadmissionScreeningAndReviewA1500
				.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
						"9" }));

		cmbPreadmissionScreeningAndReviewA1500.setPreferredSize(new Dimension(
				50, 20));
		panel_6_1.add(cmbPreadmissionScreeningAndReviewA1500);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(79, 35, 761, 86);
		panel_1_1.add(panel_7_1);

		final JxLabel aNationalProviderLabel_2 = new JxLabel();
		aNationalProviderLabel_2.setTheme(theme);

		aNationalProviderLabel_2.setFontSize(12);
		aNationalProviderLabel_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2
				.setText("<html><body>Has the resident been evaluated by level II PASRR and determined to have a serious mental illness and / or mental retardation or a <br> related condition");
		aNationalProviderLabel_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_2.setBounds(10, 0, 739, 40);
		panel_7_1.add(aNationalProviderLabel_2);

		final JxLabel aNationalProviderLabel_1_2 = new JxLabel();
		aNationalProviderLabel_1_2.setTheme(theme);

		aNationalProviderLabel_1_2.setFontSize(12);
		aNationalProviderLabel_1_2.setText("<html><body>0.<b> No");
		aNationalProviderLabel_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2.setBounds(25, 35, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_2);

		final JxLabel aNationalProviderLabel_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_1_1.setBounds(25, 50, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1);

		final JxLabel aNationalProviderLabel_1_1_1_3 = new JxLabel();
		aNationalProviderLabel_1_1_1_3.setTheme(theme);

		aNationalProviderLabel_1_1_1_3.setFontSize(12);
		aNationalProviderLabel_1_1_1_3
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_3
				.setText("<html><body>9.<b> Not a medical certificate ");
		aNationalProviderLabel_1_1_1_3.setBounds(25, 65, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1_3);
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
		PanelA1500 panel = new PanelA1500();
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
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		Object obj = cmbPreadmissionScreeningAndReviewA1500.getSelectedItem();
		if (obj != null) {
			sectionA.setA1500((cmbPreadmissionScreeningAndReviewA1500
					.getSelectedItem().toString()));
		} else {
			sectionA.setA1500("");
		}
	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbPreadmissionScreeningAndReviewA1500.setSelectedItem(sectionA
				.getA1500());
	}
}
