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

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA1000 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5996248948383230992L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbA1000F;
	private JxCheckBox cbA1000E;
	private JxCheckBox cbA1000D;
	private JxCheckBox cbA1000C;
	private JxCheckBox cbA1000B;
	private JxCheckBox cbA1000A;

	public PanelA1000() {
		super();
		setPreferredSize(new Dimension(840, 195));
		setFont(new Font("Arial", Font.PLAIN, 12));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 197);

		add(panel);

		final JxPanel panel_14_1 = new JxPanel();
		panel_14_1.setTheme(theme);
		panel_14_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_14_1.setLayout(null);
		// panel_14_1.setBorder(new
		// LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_14_1.setBounds(0, 49, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 145);
		panel.add(panel_14_1);

		cbA1000A = new JxCheckBox();
		cbA1000A.setTheme(theme);

		cbA1000A.setText("");
		cbA1000A.setBounds(30, 5, 15, 18);
		panel_14_1.add(cbA1000A);

		cbA1000B = new JxCheckBox();
		cbA1000B.setTheme(theme);

		cbA1000B.setText("");
		cbA1000B.setBounds(30, 30, 15, 18);
		panel_14_1.add(cbA1000B);

		cbA1000C = new JxCheckBox();
		cbA1000C.setTheme(theme);

		cbA1000C.setText("");
		cbA1000C.setBounds(30, 55, 15, 18);
		panel_14_1.add(cbA1000C);

		cbA1000D = new JxCheckBox();
		cbA1000D.setTheme(theme);

		cbA1000D.setText("");
		cbA1000D.setBounds(30, 80, 15, 18);
		panel_14_1.add(cbA1000D);

		cbA1000E = new JxCheckBox();
		cbA1000E.setTheme(theme);

		cbA1000E.setText("");
		cbA1000E.setBounds(30, 104, 15, 18);
		panel_14_1.add(cbA1000E);

		cbA1000F = new JxCheckBox();
		cbA1000F.setTheme(theme);

		cbA1000F.setText("");
		cbA1000F.setBounds(30, 126, 15, 18);
		panel_14_1.add(cbA1000F);

		final JxPanel panel_15_1 = new JxPanel();
		panel_15_1.setTheme(theme);
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_15_1.setLayout(flowLayout_8);
		panel_15_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_15_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_15_1.setPreferredSize(new Dimension(0, 0));
		panel_15_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_15_1);

		final JxLabel a0600SocialSecurityLabel_1 = new JxLabel();
		a0600SocialSecurityLabel_1.setTheme(theme);

		a0600SocialSecurityLabel_1.setFontSize(12);
		a0600SocialSecurityLabel_1.setFontStyle(Font.BOLD);
		a0600SocialSecurityLabel_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0600SocialSecurityLabel_1.setText("A1000. Race/Ethnicity");
		panel_15_1.add(a0600SocialSecurityLabel_1);

		final JxPanel panel_16_1 = new JxPanel();
		panel_16_1.setTheme(theme);
		panel_16_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_16_1.setLayout(null);
		panel_16_1.setBounds(79, 50, 761, 144);
		panel.add(panel_16_1);

		final JxPanel panel_24 = new JxPanel();
		panel_24.setTheme(theme);
		panel_24.setLayout(null);

		panel_24.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_24.setBounds(0, -1, 760, 25);
		panel_16_1.add(panel_24);

		final JxLabel aAmericanIndianLabel = new JxLabel();
		aAmericanIndianLabel.setTheme(theme);

		aAmericanIndianLabel.setFontSize(12);
		aAmericanIndianLabel.setFontStyle(Font.BOLD);
		aAmericanIndianLabel.setText("A. American Indian or Alaska Native");
		aAmericanIndianLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aAmericanIndianLabel.setBounds(10, 5, 216, 14);
		panel_24.add(aAmericanIndianLabel);

		final JxPanel panel_25 = new JxPanel();
		panel_25.setTheme(theme);
		panel_25.setLayout(null);

		panel_25.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_25.setBounds(0, 23, 760, 25);
		panel_16_1.add(panel_25);

		final JxLabel bAsianLabel = new JxLabel();
		bAsianLabel.setTheme(theme);

		bAsianLabel.setFontSize(12);
		bAsianLabel.setFontStyle(Font.BOLD);
		bAsianLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bAsianLabel.setText("B. Asian");
		bAsianLabel.setBounds(10, 5, 213, 14);
		panel_25.add(bAsianLabel);

		final JxPanel panel_26 = new JxPanel();
		panel_26.setTheme(theme);
		panel_26.setLayout(null);

		panel_26.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_26.setBounds(0, 47, 760, 25);
		panel_16_1.add(panel_26);

		final JxLabel blackOrAfricanLabel = new JxLabel();
		blackOrAfricanLabel.setTheme(theme);

		blackOrAfricanLabel.setFontSize(12);
		blackOrAfricanLabel.setFontStyle(Font.BOLD);
		blackOrAfricanLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		blackOrAfricanLabel.setText("C. Black or African American");
		blackOrAfricanLabel.setBounds(10, 5, 233, 14);
		panel_26.add(blackOrAfricanLabel);

		final JxPanel panel_27 = new JxPanel();
		panel_27.setTheme(theme);
		panel_27.setLayout(null);

		panel_27.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_27.setBounds(0, 71, 760, 25);
		panel_16_1.add(panel_27);

		final JxLabel hispanicOrLatinoLabel = new JxLabel();
		hispanicOrLatinoLabel.setTheme(theme);

		hispanicOrLatinoLabel.setFontSize(12);
		hispanicOrLatinoLabel.setFontStyle(Font.BOLD);
		hispanicOrLatinoLabel.setText("D. Hispanic or Latino");
		hispanicOrLatinoLabel.setBounds(10, 5, 332, 14);
		panel_27.add(hispanicOrLatinoLabel);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme(theme);
		panel_28.setLayout(null);

		panel_28.setBorder(new LineBorder(Color.black, 1, false));
		panel_28.setBounds(0, 95, 760, 25);
		panel_16_1.add(panel_28);

		final JxLabel nativeHawaiianOrLabel = new JxLabel();
		nativeHawaiianOrLabel.setTheme(theme);

		nativeHawaiianOrLabel.setFontSize(12);
		nativeHawaiianOrLabel.setFontStyle(Font.BOLD);
		nativeHawaiianOrLabel
				.setText("E. Native Hawaiian or Other Pacific Islander");
		nativeHawaiianOrLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		nativeHawaiianOrLabel.setBounds(10, 5, 424, 14);
		panel_28.add(nativeHawaiianOrLabel);

		final JxPanel panel_29 = new JxPanel();
		panel_29.setTheme(theme);
		panel_29.setLayout(null);

		panel_29.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_29.setBounds(0, 119, 760, 24);
		panel_16_1.add(panel_29);

		final JxLabel whiteLabel = new JxLabel();
		whiteLabel.setTheme(theme);

		whiteLabel.setFontSize(12);
		whiteLabel.setFontStyle(Font.BOLD);
		whiteLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		whiteLabel.setText("F. White");
		whiteLabel.setBounds(10, 5, 367, 14);
		panel_29.add(whiteLabel);

		final JxPanel panel_23 = new JxPanel();
		panel_23.setTheme(theme);
		panel_23.setLayout(null);
		panel_23.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_23.setBounds(0, 25, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_23);

		final JxLabel checkAllThatLabel = new JxLabel();
		checkAllThatLabel.setTheme(theme);

		checkAllThatLabel.setFontSize(12);
		checkAllThatLabel.setFontStyle(Font.BOLD);
		checkAllThatLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(40, 5, 193, 14);
		panel_23.add(checkAllThatLabel);
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
		PanelA1000 panel = new PanelA1000();
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
		sectionA.setA1000A(cbA1000A.isSelected());
		sectionA.setA1000B(cbA1000B.isSelected());
		sectionA.setA1000C(cbA1000C.isSelected());
		sectionA.setA1000D(cbA1000D.isSelected());
		sectionA.setA1000E(cbA1000E.isSelected());
		sectionA.setA1000F(cbA1000F.isSelected());
	}

	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cbA1000F.setSelected(mds3SectionA.isA1000F());
		cbA1000E.setSelected(mds3SectionA.isA1000E());
		cbA1000D.setSelected(mds3SectionA.isA1000D());
		cbA1000C.setSelected(mds3SectionA.isA1000C());
		cbA1000B.setSelected(mds3SectionA.isA1000B());
		cbA1000A.setSelected(mds3SectionA.isA1000A());
	}
}
