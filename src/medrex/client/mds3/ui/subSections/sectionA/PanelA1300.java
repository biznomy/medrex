package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

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

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA1300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2936454677445515490L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtLifeTimeOccupationA1300;
	private JxText txtNameByWhichResidentA1300;
	private JxText txtMedicalRecordNmberA1300;
	private JxText txtRoomNumberA1300;

	public PanelA1300() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 215));
		setBackground(Color.WHITE);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBounds(0, 0, 840, 215);
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);

		panel_1.setPreferredSize(new Dimension(840, 215));
		add(panel_1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_1.add(panel_5);

		final JxLabel a0100Label = new JxLabel();
		a0100Label.setTheme(theme);
		a0100Label.setBounds(11, 6, 177, 15);

		a0100Label.setFontSize(12);
		a0100Label.setFontStyle(Font.BOLD);
		a0100Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label.setText("A1300. Optional Resident Items");
		panel_5.add(a0100Label);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);
		// panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 190);
		panel_1.add(panel_6);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);

		panel_7.setBounds(79, 25, 761, 191);
		panel_1.add(panel_7);

		final JxLabel aNationalProviderLabel = new JxLabel();
		aNationalProviderLabel.setTheme(theme);

		aNationalProviderLabel.setFontSize(12);
		aNationalProviderLabel.setFontStyle(Font.BOLD);
		aNationalProviderLabel.setText("A. Medical Record Number");
		aNationalProviderLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel.setBounds(10, 5, 206, 14);
		panel_7.add(aNationalProviderLabel);

		txtMedicalRecordNmberA1300 = new JxText();
		txtMedicalRecordNmberA1300.setTheme(theme);
		txtMedicalRecordNmberA1300.setBounds(25, 25, 341, 22);
		panel_7.add(txtMedicalRecordNmberA1300);

		final JxLabel aNationalProviderLabel_1 = new JxLabel();
		aNationalProviderLabel_1.setTheme(theme);

		aNationalProviderLabel_1.setFontSize(12);
		aNationalProviderLabel_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1.setText("B. Room Number");
		aNationalProviderLabel_1.setBounds(10, 54, 206, 14);
		panel_7.add(aNationalProviderLabel_1);

		txtRoomNumberA1300 = new JxText();
		txtRoomNumberA1300.setTheme(theme);
		txtRoomNumberA1300.setBounds(25, 74, 312, 22);
		panel_7.add(txtRoomNumberA1300);

		final JxLabel aNationalProviderLabel_1_1 = new JxLabel();
		aNationalProviderLabel_1_1.setTheme(theme);

		aNationalProviderLabel_1_1.setFontSize(12);
		aNationalProviderLabel_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1
				.setText("C. Name by which resident prefers to be addressed");
		aNationalProviderLabel_1_1.setBounds(10, 100, 327, 14);
		panel_7.add(aNationalProviderLabel_1_1);

		txtNameByWhichResidentA1300 = new JxText();
		txtNameByWhichResidentA1300.setTheme(theme);
		txtNameByWhichResidentA1300.setBounds(25, 120, 663, 22);
		panel_7.add(txtNameByWhichResidentA1300);

		final JxLabel aNationalProviderLabel_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_2
				.setText("<html><body>D. <b>LifeTime Occupation(s)-</b> put ' / '  between two occupations :");
		aNationalProviderLabel_1_1_2.setBounds(10, 146, 389, 14);
		panel_7.add(aNationalProviderLabel_1_1_2);

		txtLifeTimeOccupationA1300 = new JxText();
		txtLifeTimeOccupationA1300.setTheme(theme);
		txtLifeTimeOccupationA1300.setBounds(25, 166, 663, 22);
		panel_7.add(txtLifeTimeOccupationA1300);
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
		PanelA1300 panel = new PanelA1300();
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
		sectionA.setA1300A(txtMedicalRecordNmberA1300.getText());
		sectionA.setA1300B(txtRoomNumberA1300.getText());
		sectionA.setA1300C(txtNameByWhichResidentA1300.getText());
		sectionA.setA1300D(txtLifeTimeOccupationA1300.getText());

	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		txtLifeTimeOccupationA1300.setText(sectionA.getA1300A());
		txtNameByWhichResidentA1300.setText(sectionA.getA1300B());
		txtMedicalRecordNmberA1300.setText(sectionA.getA1300C());
		txtRoomNumberA1300.setText(sectionA.getA1300D());
	}

}
