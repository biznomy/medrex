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
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA1600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5839167408649430471L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcEntryDateA1600;

	public PanelA1600() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 88));
		setBackground(Color.WHITE);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setBounds(0, 0, 840, 88);

		add(panel_1_2);
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 90));

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_19 = new FlowLayout();
		flowLayout_19.setHgap(10);
		flowLayout_19.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_19);
		panel_5_2.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_1_2.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);

		a0100Label_2.setFontSize(12);
		a0100Label_2.setFontStyle(Font.BOLD);
		a0100Label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_2
				.setText("A1600. Entry Date (date of this admission / reentry into the facility)");
		panel_5_2.add(a0100Label_2);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		panel_6_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		panel_6_2.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 64);
		panel_1_2.add(panel_6_2);

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 65);
		panel_1_2.add(panel_7_2);

		dcEntryDateA1600 = new JxDateChooser();
		dcEntryDateA1600.setTheme(theme);
		dcEntryDateA1600.setBounds(10, 10, 171, 20);
		dcEntryDateA1600.setDateFormatString("MM/dd/yyyy");
		panel_7_2.add(dcEntryDateA1600);

		final JxLabel aNationalProviderLabel_1_3 = new JxLabel();
		aNationalProviderLabel_1_3.setTheme(theme);
		aNationalProviderLabel_1_3.setText("Month ");
		aNationalProviderLabel_1_3.setBounds(35, 36, 74, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);

		final JxLabel aNationalProviderLabel_1_1_3 = new JxLabel();
		aNationalProviderLabel_1_1_3.setTheme(theme);
		aNationalProviderLabel_1_1_3.setText("Day ");
		aNationalProviderLabel_1_1_3.setBounds(93, 36, 63, 14);
		panel_7_2.add(aNationalProviderLabel_1_1_3);

		final JxLabel aNationalProviderLabel_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_1_2_1.setText("Year");
		aNationalProviderLabel_1_1_2_1.setBounds(152, 36, 74, 14);
		panel_7_2.add(aNationalProviderLabel_1_1_2_1);
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
		PanelA1600 panel = new PanelA1600();
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
		sectionA.setA0900(dcEntryDateA1600.getDate());

	}

	@Override
	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		dcEntryDateA1600.setDate(mds3SectionA.getA0900());

	}
}
