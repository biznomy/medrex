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

public class PanelA2000 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7564074280410383861L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcDate;

	public PanelA2000() {
		super();
		setPreferredSize(new Dimension(840, 112));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(0, 0, 840, 112);

		panel_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(0, 0));
		add(panel_1_1);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 50);
		panel_1_1.add(panel_5_1);

		final JxLabel a0100Label_1 = new JxLabel();
		a0100Label_1.setTheme(theme);
		a0100Label_1.setBounds(11, 6, 129, 15);
		a0100Label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		a0100Label_1.setFontSize(12);
		a0100Label_1.setFontStyle(Font.BOLD);
		a0100Label_1.setText("A2000. Discharge Date");
		panel_5_1.add(a0100Label_1);

		final JxLabel completeOnlyIfLabel = new JxLabel();
		completeOnlyIfLabel.setTheme(theme);
		completeOnlyIfLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		completeOnlyIfLabel.setText("Complete only if A0310F = 10, 11, or 12");
		completeOnlyIfLabel.setBounds(11, 25, 207, 14);
		panel_5_1.add(completeOnlyIfLabel);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		// panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(8);
		panel_6_1.setLayout(flowLayout_4);
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBounds(0, 49, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 64);
		panel_1_1.add(panel_6_1);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(79, 48, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 65);
		panel_1_1.add(panel_7_1);

		dcDate = new JxDateChooser();
		dcDate.setTheme(theme);
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(25, 10, 206, 22);
		panel_7_1.add(dcDate);

		final JxLabel monthLabel = new JxLabel();
		monthLabel.setTheme(theme);
		monthLabel.setText("Month");
		monthLabel.setBounds(45, 38, 54, 14);
		panel_7_1.add(monthLabel);

		final JxLabel dayLabel = new JxLabel();
		dayLabel.setTheme(theme);
		dayLabel.setText("Day");
		dayLabel.setBounds(100, 38, 24, 14);
		panel_7_1.add(dayLabel);

		final JxLabel yearLabel = new JxLabel();
		yearLabel.setTheme(theme);
		yearLabel.setText("Year");
		yearLabel.setBounds(145, 38, 24, 14);
		panel_7_1.add(yearLabel);
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
		PanelA2000 panel = new PanelA2000();
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
		sectionA.setA2000(dcDate.getDate());
	}

	public void doUpdate() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		dcDate.setDate(sectionA.getA2000());
	}

}
