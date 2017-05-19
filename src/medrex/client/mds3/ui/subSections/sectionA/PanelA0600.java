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

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1582741739993588450L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtA0600B;
	private JxText txtA0600A;

	public PanelA0600() {
		super();
		setName("");
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 120));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		panel.setLayout(flowLayout_1);

		panel.setBounds(0, 0, 840, 120);
		add(panel);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setName("");

		panel_12.setLayout(null);
		panel_12.setPreferredSize(new Dimension(840, 120));
		panel.add(panel_12);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_14.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_14.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 96);
		panel_12.add(panel_14);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_15.setLayout(null);

		panel_15.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_15.setPreferredSize(new Dimension(0, 0));
		panel_15.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_12.add(panel_15);

		final JxLabel a0600SocialSecurityLabel = new JxLabel();
		a0600SocialSecurityLabel.setTheme(theme);
		a0600SocialSecurityLabel.setBounds(10, 6, 262, 15);
		a0600SocialSecurityLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		a0600SocialSecurityLabel.setFontSize(12);
		a0600SocialSecurityLabel.setFontStyle(Font.BOLD);

		a0600SocialSecurityLabel
				.setText("A0600. Social Security and Medicare Numbers");
		panel_15.add(a0600SocialSecurityLabel);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY, 1,
				false));

		panel_16.setLayout(null);
		panel_16.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 96);
		panel_12.add(panel_16);

		final JxLabel aSocialSecurityLabel = new JxLabel();
		aSocialSecurityLabel.setTheme(theme);

		aSocialSecurityLabel.setFontSize(12);
		aSocialSecurityLabel.setFontStyle(Font.BOLD);
		aSocialSecurityLabel.setText("A. Social Security Number:");
		aSocialSecurityLabel.setBounds(10, 0, 218, 22);
		aSocialSecurityLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_16.add(aSocialSecurityLabel);

		txtA0600A = new JxText();
		txtA0600A.setTheme(theme);
		txtA0600A.setBounds(25, 20, 379, 22);
		panel_16.add(txtA0600A);

		final JxLabel bMedicareNumberorLabel = new JxLabel();
		bMedicareNumberorLabel.setTheme(theme);

		bMedicareNumberorLabel.setFontSize(12);
		bMedicareNumberorLabel.setFontStyle(Font.BOLD);
		bMedicareNumberorLabel.setText("B. Medicare number");
		bMedicareNumberorLabel.setBounds(10, 45, 121, 14);
		panel_16.add(bMedicareNumberorLabel);

		txtA0600B = new JxText();
		txtA0600B.setTheme(theme);
		txtA0600B.setBounds(25, 65, 379, 22);
		panel_16.add(txtA0600B);

		final JxLabel orComparableRailroadLabel = new JxLabel();
		orComparableRailroadLabel.setTheme(theme);
		orComparableRailroadLabel
				.setText("(or comparable railroad insurance number):");
		orComparableRailroadLabel.setBounds(125, 45, 252, 14);
		panel_16.add(orComparableRailroadLabel);

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
		PanelA0600 panel = new PanelA0600();
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
		sectionA.setA0600A((txtA0600A.getText()));
		sectionA.setA0600B(txtA0600B.getText());

	}

	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		txtA0600A.setText(mds3SectionA.getA0600A());
		txtA0600B.setText(mds3SectionA.getA0600B());

	}
}
