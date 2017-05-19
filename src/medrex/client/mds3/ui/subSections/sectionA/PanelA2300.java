package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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

import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA2300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7222259285456910683L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcDate_1;

	public PanelA2300() {
		super();
		setPreferredSize(new Dimension(840, 103));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_3 = new JxPanel();
		panel_1_1_3.setTheme(theme);
		panel_1_1_3.setBounds(0, 0, 840, 103);

		panel_1_1_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setPreferredSize(new Dimension(0, 0));
		add(panel_1_1_3);

		final JxPanel panel_5_1_3 = new JxPanel();
		panel_5_1_3.setTheme(theme);
		panel_5_1_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_5_1_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
		// 1, false));
		panel_5_1_3.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_3.setLayout(null);
		panel_5_1_3.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 26);
		panel_1_1_3.add(panel_5_1_3);

		final JxLabel a0100Label_1_3 = new JxLabel();
		a0100Label_1_3.setTheme(theme);

		a0100Label_1_3.setFontSize(12);
		a0100Label_1_3.setFontStyle(Font.BOLD);
		a0100Label_1_3.setText("A2300.  Assessment Reference Date");
		a0100Label_1_3.setBounds(11, 6, 219, 15);
		panel_5_1_3.add(a0100Label_1_3);

		final JxPanel panel_6_1_3 = new JxPanel();
		panel_6_1_3.setTheme(theme);
		panel_6_1_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_1_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
		// 1, false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setVgap(8);
		panel_6_1_3.setLayout(flowLayout_5);
		panel_6_1_3.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 80);
		panel_1_1_3.add(panel_6_1_3);

		final JxPanel panel_7_1_3 = new JxPanel();
		panel_7_1_3.setTheme(theme);
		panel_7_1_3.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1_3.setLayout(null);
		panel_7_1_3.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				80);
		panel_1_1_3.add(panel_7_1_3);

		dcDate_1 = new JxDateChooser();
		dcDate_1.setTheme(theme);
		dcDate_1.setBounds(37, 30, 217, 22);
		dcDate_1.setDateFormatString("MM/dd/yyyy");
		panel_7_1_3.add(dcDate_1);

		final JxLabel observationEndDateLabel = new JxLabel();
		observationEndDateLabel.setTheme(theme);

		observationEndDateLabel.setFontSize(12);
		observationEndDateLabel.setFontStyle(Font.BOLD);
		observationEndDateLabel.setText("Observation end date:");
		observationEndDateLabel.setBounds(10, 5, 217, 14);
		panel_7_1_3.add(observationEndDateLabel);
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
		PanelA2300 panel = new PanelA2300();
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
		sectionA.setA2300(dcDate_1.getDate());

	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		dcDate_1.setDate(sectionA.getA2300());

	}

}
