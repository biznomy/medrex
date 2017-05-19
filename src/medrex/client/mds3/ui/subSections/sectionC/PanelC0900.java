package medrex.client.mds3.ui.subSections.sectionC;

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
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelC0900 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7939464554628433030L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbC0900Z;
	private JxCheckBox cbC0900D;
	private JxCheckBox cbC0900C;
	private JxCheckBox cbC0900B;
	private JxCheckBox cbC0900A;

	public PanelC0900() {
		super();
		setPreferredSize(new Dimension(840, 150));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panelC0900 = new JxPanel();
		panelC0900.setTheme(theme);
		panelC0900.setBackground(ColorConstants.MDS_FONT_COLOR);
		panelC0900.setPreferredSize(new Dimension(840, 150));
		panelC0900.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panelC0900.setLayout(null);
		panelC0900.setBounds(0, 0, 840, 150);
		add(panelC0900);

		final JxPanel panel_1_1_2_1 = new JxPanel();
		panel_1_1_2_1.setTheme(theme);
		panel_1_1_2_1.setBounds(5, 0, 830, 150);

		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setPreferredSize(new Dimension(820, 151));
		panelC0900.add(panel_1_1_2_1);

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);
		panel_6_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 50, 81, 100);
		panel_1_1_2_1.add(panel_6_1_1_1);

		cbC0900A = new JxCheckBox();
		cbC0900A.setTheme(theme);

		cbC0900A.setText("New JxCheckBox");
		cbC0900A.setBounds(35, 4, 17, 14);
		panel_6_1_1_1.add(cbC0900A);

		cbC0900B = new JxCheckBox();
		cbC0900B.setTheme(theme);

		cbC0900B.setText("New JxCheckBox");
		cbC0900B.setBounds(35, 24, 17, 14);
		panel_6_1_1_1.add(cbC0900B);

		cbC0900C = new JxCheckBox();
		cbC0900C.setTheme(theme);

		cbC0900C.setText("New JxCheckBox");
		cbC0900C.setBounds(35, 44, 17, 14);
		panel_6_1_1_1.add(cbC0900C);

		cbC0900D = new JxCheckBox();
		cbC0900D.setTheme(theme);

		cbC0900D.setText("New JxCheckBox");
		cbC0900D.setBounds(35, 64, 17, 14);
		panel_6_1_1_1.add(cbC0900D);

		cbC0900Z = new JxCheckBox();
		cbC0900Z.setTheme(theme);

		cbC0900Z.setText("New JxCheckBox");
		cbC0900Z.setBounds(35, 84, 17, 14);
		panel_6_1_1_1.add(cbC0900Z);

		final JxPanel panel_5_1_1_2_1 = new JxPanel();
		panel_5_1_1_2_1.setTheme(theme);
		panel_5_1_1_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setHgap(10);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1.setLayout(flowLayout_10);
		panel_5_1_1_2_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1.setBounds(0, 0, 830, 30);
		panel_1_1_2_1.add(panel_5_1_1_2_1);

		final JxLabel a0100Label_1_1_2_1 = new JxLabel();
		a0100Label_1_1_2_1.setTheme(theme);

		a0100Label_1_1_2_1.setFontSize(12);
		a0100Label_1_1_2_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1.setText("C0900 .  Memory / Recall Ability");
		panel_5_1_1_2_1.add(a0100Label_1_1_2_1);

		final JxPanel panel_5_1_1_2_1_1 = new JxPanel();
		panel_5_1_1_2_1_1.setTheme(theme);
		panel_5_1_1_2_1_1.setLayout(null);

		panel_5_1_1_2_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_5_1_1_2_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1.setBounds(0, 30, 830, 21);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1);

		final JxLabel a0100Label_1_1_2_1_1 = new JxLabel();
		a0100Label_1_1_2_1_1.setTheme(theme);
		a0100Label_1_1_2_1_1.setBounds(30, 4, 282, 15);

		a0100Label_1_1_2_1_1.setFontSize(12);
		a0100Label_1_1_2_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1_1
				.setText("Check all that resident was normally able to recall");
		panel_5_1_1_2_1_1.add(a0100Label_1_1_2_1_1);

		final JxPanel panel_5_1_1_2_1_1_1 = new JxPanel();
		panel_5_1_1_2_1_1_1.setTheme(theme);
		panel_5_1_1_2_1_1_1.setOpaque(false);
		panel_5_1_1_2_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_14 = new FlowLayout();
		flowLayout_14.setVgap(0);
		flowLayout_14.setHgap(10);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1_1.setLayout(flowLayout_14);
		panel_5_1_1_2_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1.setBounds(80, 50, 750, 21);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1);

		final JxLabel a0100Label_1_1_2_1_1_1 = new JxLabel();
		a0100Label_1_1_2_1_1_1.setTheme(theme);

		a0100Label_1_1_2_1_1_1.setFontSize(12);
		a0100Label_1_1_2_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1_1_1.setText("A.   Current Season");
		panel_5_1_1_2_1_1_1.add(a0100Label_1_1_2_1_1_1);

		final JxPanel panel_5_1_1_2_1_1_1_1 = new JxPanel();
		panel_5_1_1_2_1_1_1_1.setTheme(theme);
		panel_5_1_1_2_1_1_1_1.setOpaque(false);
		panel_5_1_1_2_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_15 = new FlowLayout();
		flowLayout_15.setVgap(0);
		flowLayout_15.setHgap(10);
		flowLayout_15.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1_1_1.setLayout(flowLayout_15);
		panel_5_1_1_2_1_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_1.setBounds(80, 70, 750, 21);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_1);

		final JxLabel a0100Label_1_1_2_1_1_1_1 = new JxLabel();
		a0100Label_1_1_2_1_1_1_1.setTheme(theme);

		a0100Label_1_1_2_1_1_1_1.setFontSize(12);
		a0100Label_1_1_2_1_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1_1_1_1.setText("B.   Location of own room");
		panel_5_1_1_2_1_1_1_1.add(a0100Label_1_1_2_1_1_1_1);

		final JxPanel panel_5_1_1_2_1_1_1_2 = new JxPanel();
		panel_5_1_1_2_1_1_1_2.setTheme(theme);
		panel_5_1_1_2_1_1_1_2.setOpaque(false);
		panel_5_1_1_2_1_1_1_2.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_16 = new FlowLayout();
		flowLayout_16.setVgap(0);
		flowLayout_16.setHgap(10);
		flowLayout_16.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1_1_2.setLayout(flowLayout_16);
		panel_5_1_1_2_1_1_1_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_2.setBounds(80, 90, 750, 21);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_2);

		final JxLabel a0100Label_1_1_2_1_1_1_2 = new JxLabel();
		a0100Label_1_1_2_1_1_1_2.setTheme(theme);

		a0100Label_1_1_2_1_1_1_2.setFontSize(12);
		a0100Label_1_1_2_1_1_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1_1_1_2.setText("C.   Staff names and faces");
		panel_5_1_1_2_1_1_1_2.add(a0100Label_1_1_2_1_1_1_2);

		final JxPanel panel_5_1_1_2_1_1_1_3 = new JxPanel();
		panel_5_1_1_2_1_1_1_3.setTheme(theme);
		panel_5_1_1_2_1_1_1_3.setOpaque(false);
		panel_5_1_1_2_1_1_1_3.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_17 = new FlowLayout();
		flowLayout_17.setVgap(0);
		flowLayout_17.setHgap(10);
		flowLayout_17.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1_1_3.setLayout(flowLayout_17);
		panel_5_1_1_2_1_1_1_3.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_3.setBounds(80, 110, 750, 21);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_3);

		final JxLabel a0100Label_1_1_2_1_1_1_3 = new JxLabel();
		a0100Label_1_1_2_1_1_1_3.setTheme(theme);

		a0100Label_1_1_2_1_1_1_3.setFontSize(12);
		a0100Label_1_1_2_1_1_1_3.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1_1_1_3
				.setText("D.   That he or she is in nursing home");
		panel_5_1_1_2_1_1_1_3.add(a0100Label_1_1_2_1_1_1_3);

		final JxPanel panel_5_1_1_2_1_1_1_4 = new JxPanel();
		panel_5_1_1_2_1_1_1_4.setTheme(theme);
		panel_5_1_1_2_1_1_1_4.setOpaque(false);
		panel_5_1_1_2_1_1_1_4.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		final FlowLayout flowLayout_18 = new FlowLayout();
		flowLayout_18.setVgap(0);
		flowLayout_18.setHgap(10);
		flowLayout_18.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1_1_4.setLayout(flowLayout_18);
		panel_5_1_1_2_1_1_1_4.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_4.setBounds(80, 130, 750, 25);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_4);

		final JxLabel a0100Label_1_1_2_1_1_1_4 = new JxLabel();
		a0100Label_1_1_2_1_1_1_4.setTheme(theme);

		a0100Label_1_1_2_1_1_1_4.setFontSize(12);
		a0100Label_1_1_2_1_1_1_4
				.setText("<html><b>Z.</b> &nbsp <b>None of the above</b> were recalled");
		panel_5_1_1_2_1_1_1_4.add(a0100Label_1_1_2_1_1_1_4);
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
		PanelC0900 panel = new PanelC0900();
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
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		sectionC.setC0900A(cbC0900A.isSelected());
		sectionC.setC0900B(cbC0900B.isSelected());
		sectionC.setC0900C(cbC0900C.isSelected());
		sectionC.setC0900Z(cbC0900Z.isSelected());
	}

	public void doUpdate() {
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cbC0900A.setSelected(sectionC.isC0900A());
		cbC0900B.setSelected(sectionC.isC0900B());
		cbC0900C.setSelected(sectionC.isC0900C());
		cbC0900D.setSelected(sectionC.isC0900D());
		cbC0900Z.setSelected(sectionC.isC0900Z());
	}

}
