package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA0700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5419328384844427113L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtA0700;

	public PanelA0700() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 60));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		panel.setLayout(flowLayout_1);

		panel.setBounds(0, 0, 840, 60);
		add(panel);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);
		panel_17.setBorder(new LineBorder(Mds3Constants.BACKGROUND_LIGHTGREY,
				1, false));

		panel_17.setLayout(null);
		panel_17.setPreferredSize(new Dimension(840, 60));
		panel.add(panel_17);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		panel_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_18.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_18.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_18.setBounds(0, 25, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 35);
		panel_17.add(panel_18);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_19.setLayout(null);
		panel_19.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 36);
		panel_17.add(panel_19);

		txtA0700 = new JxText();
		txtA0700.setTheme(theme);
		txtA0700.setBounds(25, 10, 384, 22);
		panel_19.add(txtA0700);

		final JxPanel panel_22 = new JxPanel();
		panel_22.setTheme(theme);
		panel_22.setLayout(null);
		panel_22.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_22.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_22.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_17.add(panel_22);

		final JxLabel a1000RaceethnicityLabel = new JxLabel();
		a1000RaceethnicityLabel.setTheme(theme);
		a1000RaceethnicityLabel.setBounds(10, 6, 413, 15);

		a1000RaceethnicityLabel.setFontSize(12);
		a1000RaceethnicityLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a1000RaceethnicityLabel
				.setText("<html><body><b> A0700. Medicaid Number- </b> Enter \"+\"if pending ,\"N\" if not a Medicaid recipient");
		panel_22.add(a1000RaceethnicityLabel);
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
		PanelA0700 panel = new PanelA0700();
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
		sectionA.setA0700((txtA0700.getText()));

	}

	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		txtA0700.setText(mds3SectionA.getA0700());
	}

}
