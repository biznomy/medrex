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

public class PanelA2200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7957210879348112309L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcDate_1;

	public PanelA2200() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 112));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_2 = new JxPanel();
		panel_1_1_2.setTheme(theme);
		panel_1_1_2.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 112);

		panel_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(0, 0));
		add(panel_1_1_2);

		final JxPanel panel_5_1_2 = new JxPanel();
		panel_5_1_2.setTheme(theme);
		panel_5_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_2.setLayout(null);
		panel_5_1_2.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 50);
		panel_1_1_2.add(panel_5_1_2);

		final JxLabel a0100Label_1_2 = new JxLabel();
		a0100Label_1_2.setTheme(theme);

		a0100Label_1_2.setFontSize(12);
		a0100Label_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_2
				.setText("A2200.  Previous Assessment Reference Date for Significant Correction");
		a0100Label_1_2.setBounds(11, 6, 437, 15);
		panel_5_1_2.add(a0100Label_1_2);

		final JxLabel completeOnlyIfLabel_2 = new JxLabel();
		completeOnlyIfLabel_2.setTheme(theme);

		completeOnlyIfLabel_2.setFontSize(12);
		completeOnlyIfLabel_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		completeOnlyIfLabel_2.setText("Complete only if A0310A = 05 or 06");
		completeOnlyIfLabel_2.setBounds(11, 25, 207, 14);
		panel_5_1_2.add(completeOnlyIfLabel_2);

		final JxPanel panel_6_1_2 = new JxPanel();
		panel_6_1_2.setTheme(theme);
		// panel_6_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
		// 1, false));
		panel_6_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(8);
		panel_6_1_2.setLayout(flowLayout_3);
		panel_6_1_2.setBounds(0, 49, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 64);
		panel_1_1_2.add(panel_6_1_2);

		final JxPanel panel_7_1_2 = new JxPanel();
		panel_7_1_2.setTheme(theme);
		panel_7_1_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(79, 48, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				65);
		panel_1_1_2.add(panel_7_1_2);

		dcDate_1 = new JxDateChooser();
		dcDate_1.setTheme(theme);
		dcDate_1.setBounds(25, 10, 170, 22);
		dcDate_1.setDateFormatString("MM/dd/yyyy");
		panel_7_1_2.add(dcDate_1);

		final JxLabel monthLabel = new JxLabel();
		monthLabel.setTheme(theme);
		monthLabel.setText("Month");
		monthLabel.setBounds(45, 38, 30, 14);
		panel_7_1_2.add(monthLabel);

		final JxLabel dayLabel = new JxLabel();
		dayLabel.setTheme(theme);
		dayLabel.setText("Day");
		dayLabel.setBounds(88, 38, 30, 14);
		panel_7_1_2.add(dayLabel);

		final JxLabel yearLabel = new JxLabel();
		yearLabel.setTheme(theme);
		yearLabel.setText("year");
		yearLabel.setBounds(125, 38, 54, 14);
		panel_7_1_2.add(yearLabel);
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
		PanelA2200 panel = new PanelA2200();
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
		sectionA.setA2200(dcDate_1.getDate());

	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		dcDate_1.setDate(sectionA.getA2200());
	}

}
