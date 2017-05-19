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

public class PanelA0900 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5782816135970946347L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcA0900;

	public PanelA0900() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 60));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setPreferredSize(new Dimension(840, 50));
		panel.setLayout(null);

		panel.setBounds(0, 0, 840, 60);
		add(panel);

		final JxPanel panel_17_1 = new JxPanel();
		panel_17_1.setTheme(theme);
		panel_17_1.setBounds(0, 0, 840, 60);
		panel_17_1.setLayout(null);
		panel_17_1.setPreferredSize(new Dimension(820, 50));
		panel.add(panel_17_1);

		final JxPanel panel_19_1 = new JxPanel();
		panel_19_1.setTheme(theme);

		panel_19_1.setOpaque(true);
		panel_19_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_19_1.setLayout(null);
		panel_19_1
				.setBounds(79, 25, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 35);
		panel_17_1.add(panel_19_1);

		dcA0900 = new JxDateChooser();
		dcA0900.setTheme(theme);
		dcA0900.setBounds(25, 10, 316, 22);
		dcA0900.setDateFormatString("MM/dd/yyyy");
		panel_19_1.add(dcA0900);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_20.setLayout(flowLayout_7);
		panel_20.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_20.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_17_1.add(panel_20);

		final JxLabel a0900BirthDateLabel = new JxLabel();
		a0900BirthDateLabel.setTheme(theme);

		a0900BirthDateLabel.setFontSize(12);
		a0900BirthDateLabel.setFontStyle(Font.BOLD);
		a0900BirthDateLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0900BirthDateLabel.setText("A0900. Birth Date");
		panel_20.add(a0900BirthDateLabel);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);
		panel_21.setBorder(new LineBorder(Color.black, 1, false));
		// panel_21.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_21.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_21.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 35);
		panel_17_1.add(panel_21);
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
		PanelA0900 panel = new PanelA0900();
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
		sectionA.setA0900(dcA0900.getDate());
	}

	@Override
	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		dcA0900.setDate(mds3SectionA.getA0900());
	}

}
