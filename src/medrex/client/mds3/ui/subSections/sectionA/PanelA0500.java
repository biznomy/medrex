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

public class PanelA0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5761629971324153325L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtA0500D;
	private JxText txtA0500C;
	private JxText txtA0500B;
	private JxText txtA0500A;

	public PanelA0500() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 110));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		panel.setLayout(flowLayout_1);

		panel.setBounds(0, 0, 840, 110);
		add(panel);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);

		panel_9.setLayout(null);
		panel_9.setPreferredSize(new Dimension(840, 110));
		panel.add(panel_9);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_10.setLayout(flowLayout_3);
		panel_10.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_10.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_10.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_9.add(panel_10);

		final JxLabel a0500LegalNameLabel = new JxLabel();
		a0500LegalNameLabel.setTheme(theme);

		a0500LegalNameLabel.setFontSize(12);
		a0500LegalNameLabel.setFontStyle(Font.BOLD);
		a0500LegalNameLabel.setText("A0500. Legal Name of Resident");
		a0500LegalNameLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_10.add(a0500LegalNameLabel);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		// panel_11.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_11.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_11.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 86);
		panel_9.add(panel_11);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_13.setLayout(null);
		panel_13.setBounds(79, 24, 761, 86);
		panel_9.add(panel_13);

		final JxLabel aFirstNameLabel = new JxLabel();
		aFirstNameLabel.setTheme(theme);

		aFirstNameLabel.setFontSize(12);
		aFirstNameLabel.setFontStyle(Font.BOLD);
		aFirstNameLabel.setBounds(10, 5, 164, 14);
		aFirstNameLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_13.add(aFirstNameLabel);
		aFirstNameLabel.setText("A. First Name:");

		txtA0500A = new JxText();
		txtA0500A.setTheme(theme);
		txtA0500A.setBounds(25, 23, 252, 22);
		panel_13.add(txtA0500A);

		final JxLabel bMiddleInitialLabel = new JxLabel();
		bMiddleInitialLabel.setTheme(theme);

		bMiddleInitialLabel.setFontSize(12);
		bMiddleInitialLabel.setFontStyle(Font.BOLD);
		bMiddleInitialLabel.setText("B. Middle initial:");
		bMiddleInitialLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bMiddleInitialLabel.setBounds(395, 5, 88, 14);
		panel_13.add(bMiddleInitialLabel);

		txtA0500B = new JxText();
		txtA0500B.setTheme(theme);
		txtA0500B.setBounds(410, 23, 48, 22);
		panel_13.add(txtA0500B);

		final JxLabel cLastNameLabel = new JxLabel();
		cLastNameLabel.setTheme(theme);

		cLastNameLabel.setFontSize(12);
		cLastNameLabel.setFontStyle(Font.BOLD);
		cLastNameLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		cLastNameLabel.setText("c. Last name:");
		cLastNameLabel.setBounds(10, 44, 88, 14);
		panel_13.add(cLastNameLabel);

		txtA0500C = new JxText();
		txtA0500C.setTheme(theme);
		txtA0500C.setBounds(25, 61, 285, 22);
		panel_13.add(txtA0500C);

		final JxLabel dSuffixLabel = new JxLabel();
		dSuffixLabel.setTheme(theme);

		dSuffixLabel.setFontSize(12);
		dSuffixLabel.setFontStyle(Font.BOLD);
		dSuffixLabel.setText("D. Suffix:");
		dSuffixLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dSuffixLabel.setBounds(395, 44, 54, 14);
		panel_13.add(dSuffixLabel);

		txtA0500D = new JxText();
		txtA0500D.setTheme(theme);
		txtA0500D.setBounds(410, 61, 79, 22);
		panel_13.add(txtA0500D);

		doUpdate();

	}

	public void doSave() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		sectionA.setA0500A((txtA0500A.getText()));
		sectionA.setA0500B(txtA0500B.getText());
		sectionA.setA0500C(txtA0500C.getText());
		sectionA.setA0500D(txtA0500D.getText());
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
		PanelA0500 panel = new PanelA0500();
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

	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		txtA0500A.setText(mds3SectionA.getA0500A());
		txtA0500B.setText(mds3SectionA.getA0500B());
		txtA0500C.setText(mds3SectionA.getA0500C());
		txtA0500D.setText(mds3SectionA.getA0500D());

	}
}
