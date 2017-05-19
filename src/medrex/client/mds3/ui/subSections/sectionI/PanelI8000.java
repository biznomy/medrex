package medrex.client.mds3.ui.subSections.sectionI;

import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionI.Mds3SectionI;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelI8000 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7691804499437106774L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txt8000J2;
	private JxText txt8000I2;
	private JxText txt8000H2;
	private JxText txt8000G2;
	private JxText txt8000F2;
	private JxText txt8000E2;
	private JxText txt8000D2;
	private JxText txt8000C2;
	private JxText txt8000B2;
	private JxText txt8000A2;
	private JxText txt8000J1;
	private JxText txt8000I1;
	private JxText txt8000H1;
	private JxText txt8000G1;
	private JxText txt8000F1;
	private JxText txt8000E1;
	private JxText txt8000D1;
	private JxText txt8000C1;
	private JxText txt8000B1;
	private JxText txt8000A1;
	private JxCheckBox cb8000;

	public PanelI8000() {
		super();
		setPreferredSize(new Dimension(840, 310));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 310);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 310);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_1);

		cb8000 = new JxCheckBox();
		cb8000.setTheme(theme);

		cb8000.setText("New JxCheckBox");
		cb8000.setBounds(25, 15, 16, 16);
		panel_1.add(cb8000);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(Mds3Constants.SUBSECTION_WIDTH_LEFT_1 - 1, 0,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1 + 1, 310);

		panel.add(panel_2);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label
				.setText("<html><body><b> 11800. Additional active diagnoses </b> <br> Enter diagnosis on line and ICD code in boxes . Include the decimal for the code in the appropriate box.   ");
		label.setBounds(10, 5, 527, 28);
		panel_2.add(label);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);
		panel_3.setBounds(10, 39, 725, 25);

		panel_2.add(panel_3);

		final JxLabel jLabel_2 = new JxLabel();
		jLabel_2.setTheme(theme);
		jLabel_2.setText("A");
		jLabel_2.setBounds(10, 2, 25, 20);
		panel_3.add(jLabel_2);

		txt8000A1 = new JxText();
		txt8000A1.setTheme(theme);
		txt8000A1.setBounds(50, 0, 357, 18);
		panel_3.add(txt8000A1);

		txt8000A2 = new JxText();
		txt8000A2.setTheme(theme);
		txt8000A2.setBounds(444, 0, 243, 18);
		panel_3.add(txt8000A2);

		final JxPanel panel_3_1 = new JxPanel();
		panel_3_1.setTheme(theme);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 63, 725, 25);

		panel_2.add(panel_3_1);

		final JxLabel jLabel_3 = new JxLabel();
		jLabel_3.setTheme(theme);
		jLabel_3.setText("B");
		jLabel_3.setBounds(10, 0, 25, 20);
		panel_3_1.add(jLabel_3);

		txt8000B1 = new JxText();
		txt8000B1.setTheme(theme);
		txt8000B1.setBounds(50, 0, 357, 18);
		panel_3_1.add(txt8000B1);

		txt8000B2 = new JxText();
		txt8000B2.setTheme(theme);
		txt8000B2.setBounds(445, 0, 243, 18);
		panel_3_1.add(txt8000B2);

		final JxPanel panel_3_2 = new JxPanel();
		panel_3_2.setTheme(theme);
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(10, 87, 725, 25);

		panel_2.add(panel_3_2);

		final JxLabel jLabel_4 = new JxLabel();
		jLabel_4.setTheme(theme);
		jLabel_4.setText("C");
		jLabel_4.setBounds(10, 0, 25, 20);
		panel_3_2.add(jLabel_4);

		txt8000C1 = new JxText();
		txt8000C1.setTheme(theme);
		txt8000C1.setBounds(50, 0, 357, 18);
		panel_3_2.add(txt8000C1);

		txt8000C2 = new JxText();
		txt8000C2.setTheme(theme);
		txt8000C2.setBounds(445, 0, 243, 18);
		panel_3_2.add(txt8000C2);

		final JxPanel panel_3_3 = new JxPanel();
		panel_3_3.setTheme(theme);
		panel_3_3.setLayout(null);
		panel_3_3.setBounds(10, 110, 725, 25);

		panel_2.add(panel_3_3);

		final JxLabel jLabel_5 = new JxLabel();
		jLabel_5.setTheme(theme);
		jLabel_5.setText("D");
		jLabel_5.setBounds(10, 0, 25, 20);
		panel_3_3.add(jLabel_5);

		txt8000D1 = new JxText();
		txt8000D1.setTheme(theme);
		txt8000D1.setBounds(50, 0, 357, 18);
		panel_3_3.add(txt8000D1);

		txt8000D2 = new JxText();
		txt8000D2.setTheme(theme);
		txt8000D2.setBounds(445, 0, 243, 18);
		panel_3_3.add(txt8000D2);

		final JxPanel panel_3_4 = new JxPanel();
		panel_3_4.setTheme(theme);
		panel_3_4.setLayout(null);
		panel_3_4.setBounds(10, 135, 725, 25);

		panel_2.add(panel_3_4);

		final JxLabel jLabel_6 = new JxLabel();
		jLabel_6.setTheme(theme);
		jLabel_6.setText("E");
		jLabel_6.setBounds(10, 0, 25, 20);
		panel_3_4.add(jLabel_6);

		txt8000E1 = new JxText();
		txt8000E1.setTheme(theme);
		txt8000E1.setBounds(50, 0, 357, 18);
		panel_3_4.add(txt8000E1);

		txt8000E2 = new JxText();
		txt8000E2.setTheme(theme);
		txt8000E2.setBounds(445, 0, 243, 18);
		panel_3_4.add(txt8000E2);

		final JxPanel panel_3_5 = new JxPanel();
		panel_3_5.setTheme(theme);
		panel_3_5.setLayout(null);
		panel_3_5.setBounds(10, 159, 725, 25);

		panel_2.add(panel_3_5);

		final JxLabel jLabel_7 = new JxLabel();
		jLabel_7.setTheme(theme);
		jLabel_7.setText("F");
		jLabel_7.setBounds(10, 0, 25, 20);
		panel_3_5.add(jLabel_7);

		txt8000F1 = new JxText();
		txt8000F1.setTheme(theme);
		txt8000F1.setBounds(50, 0, 357, 18);
		panel_3_5.add(txt8000F1);

		txt8000F2 = new JxText();
		txt8000F2.setTheme(theme);
		txt8000F2.setBounds(445, 0, 243, 18);
		panel_3_5.add(txt8000F2);

		final JxPanel panel_3_6 = new JxPanel();
		panel_3_6.setTheme(theme);
		panel_3_6.setLayout(null);
		panel_3_6.setBounds(10, 183, 725, 25);

		panel_2.add(panel_3_6);

		final JxLabel jLabel_8 = new JxLabel();
		jLabel_8.setTheme(theme);
		jLabel_8.setText("G");
		jLabel_8.setBounds(10, 0, 25, 20);
		panel_3_6.add(jLabel_8);

		txt8000G1 = new JxText();
		txt8000G1.setTheme(theme);
		txt8000G1.setBounds(50, 0, 357, 18);
		panel_3_6.add(txt8000G1);

		txt8000G2 = new JxText();
		txt8000G2.setTheme(theme);
		txt8000G2.setBounds(445, 0, 243, 18);
		panel_3_6.add(txt8000G2);

		final JxPanel panel_3_7 = new JxPanel();
		panel_3_7.setTheme(theme);
		panel_3_7.setLayout(null);
		panel_3_7.setBounds(10, 208, 725, 25);

		panel_2.add(panel_3_7);

		final JxLabel jLabel_9 = new JxLabel();
		jLabel_9.setTheme(theme);
		jLabel_9.setText("H");
		jLabel_9.setBounds(10, 0, 25, 20);
		panel_3_7.add(jLabel_9);

		txt8000H1 = new JxText();
		txt8000H1.setTheme(theme);
		txt8000H1.setBounds(50, 0, 357, 18);
		panel_3_7.add(txt8000H1);

		txt8000H2 = new JxText();
		txt8000H2.setTheme(theme);
		txt8000H2.setBounds(446, 1, 243, 18);
		panel_3_7.add(txt8000H2);

		final JxPanel panel_3_8 = new JxPanel();
		panel_3_8.setTheme(theme);
		panel_3_8.setLayout(null);
		panel_3_8.setBounds(10, 233, 725, 25);

		panel_2.add(panel_3_8);

		final JxLabel jLabel_10 = new JxLabel();
		jLabel_10.setTheme(theme);
		jLabel_10.setText("I");
		jLabel_10.setBounds(10, 0, 25, 20);
		panel_3_8.add(jLabel_10);

		txt8000I1 = new JxText();
		txt8000I1.setTheme(theme);
		txt8000I1.setBounds(50, 0, 357, 18);
		panel_3_8.add(txt8000I1);

		txt8000I2 = new JxText();
		txt8000I2.setTheme(theme);
		txt8000I2.setBounds(445, 0, 243, 18);
		panel_3_8.add(txt8000I2);

		final JxPanel panel_3_8_1 = new JxPanel();
		panel_3_8_1.setTheme(theme);

		panel_3_8_1.setLayout(null);
		panel_3_8_1.setBounds(10, 260, 725, 25);
		panel_2.add(panel_3_8_1);

		final JxLabel jLabel_10_1 = new JxLabel();
		jLabel_10_1.setTheme(theme);
		jLabel_10_1.setText("J");
		jLabel_10_1.setBounds(10, 0, 25, 20);
		panel_3_8_1.add(jLabel_10_1);

		txt8000J1 = new JxText();
		txt8000J1.setTheme(theme);
		txt8000J1.setBounds(50, 0, 357, 18);
		panel_3_8_1.add(txt8000J1);

		txt8000J2 = new JxText();
		txt8000J2.setTheme(theme);
		txt8000J2.setBounds(445, 0, 243, 18);
		panel_3_8_1.add(txt8000J2);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionI mds3sectionI = (Mds3SectionI) Mds3Controller.getInstance()
				.getSection(Mds3SectionI.class);
		// mds3sectionI.setI8000cb(cb8000.isSelected());
		mds3sectionI.setI8000A1(txt8000A1.getText());
		mds3sectionI.setI8000B1(txt8000B1.getText());
		mds3sectionI.setI8000C1(txt8000C1.getText());
		mds3sectionI.setI8000D1(txt8000D1.getText());
		mds3sectionI.setI8000E1(txt8000E1.getText());
		mds3sectionI.setI8000F1(txt8000F1.getText());
		mds3sectionI.setI8000G1(txt8000G1.getText());
		mds3sectionI.setI8000H1(txt8000H1.getText());
		mds3sectionI.setI8000I1(txt8000I1.getText());
		mds3sectionI.setI8000J1(txt8000J1.getText());
	}

	public void doUpdate() {
		Mds3SectionI mds3sectionI = (Mds3SectionI) Mds3Controller.getInstance()
				.getSection(Mds3SectionI.class);
		// mds3sectionI.setI8000cb(mds3sectionI.isI8000cb());
		txt8000A1.setText(mds3sectionI.getI8000A1());
		txt8000B1.setText(mds3sectionI.getI8000B1());
		txt8000C1.setText(mds3sectionI.getI8000C1());
		txt8000D1.setText(mds3sectionI.getI8000D1());
		txt8000E1.setText(mds3sectionI.getI8000E1());
		txt8000F1.setText(mds3sectionI.getI8000F1());
		txt8000G1.setText(mds3sectionI.getI8000G1());
		txt8000H1.setText(mds3sectionI.getI8000H1());
		txt8000I1.setText(mds3sectionI.getI8000I1());
		txt8000J1.setText(mds3sectionI.getI8000J1());
	}

}
