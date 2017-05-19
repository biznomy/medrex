package medrex.client.mds3.ui.subSections.sectionJ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionJ.Mds3SectionJ;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelJ1550 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 427019047261352451L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbJ1550Z;
	private JxCheckBox cbJ1550D;
	private JxCheckBox cbJ1550C;
	private JxCheckBox cbJ1550B;
	private JxCheckBox cbJ1550A;

	public PanelJ1550() {
		super();
		setPreferredSize(new Dimension(840, 155));
		setLayout(null);
		setBackground(Color.WHITE);
		final JxPanel panel_1_1_2_1 = new JxPanel();
		panel_1_1_2_1.setTheme(theme);
		panel_1_1_2_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 160);
		add(panel_1_1_2_1);

		panel_1_1_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH,
				160));

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);
		panel_6_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 48, Mds3Constants.SUBSECTION_WIDTH_LEFT_1,
				107);
		panel_1_1_2_1.add(panel_6_1_1_1);

		cbJ1550A = new JxCheckBox();
		cbJ1550A.setTheme(theme);

		cbJ1550A.setText("New JxCheckBox");
		cbJ1550A.setBounds(33, 3, 17, 14);
		panel_6_1_1_1.add(cbJ1550A);

		cbJ1550B = new JxCheckBox();
		cbJ1550B.setTheme(theme);

		cbJ1550B.setText("New JxCheckBox");
		cbJ1550B.setBounds(33, 25, 17, 14);
		panel_6_1_1_1.add(cbJ1550B);

		cbJ1550C = new JxCheckBox();
		cbJ1550C.setTheme(theme);

		cbJ1550C.setText("New JxCheckBox");
		cbJ1550C.setBounds(33, 45, 17, 14);
		panel_6_1_1_1.add(cbJ1550C);

		cbJ1550D = new JxCheckBox();
		cbJ1550D.setTheme(theme);

		cbJ1550D.setText("New JxCheckBox");
		cbJ1550D.setBounds(33, 65, 17, 14);
		panel_6_1_1_1.add(cbJ1550D);

		cbJ1550Z = new JxCheckBox();
		cbJ1550Z.setTheme(theme);

		cbJ1550Z.setText("New JxCheckBox");
		cbJ1550Z.setBounds(33, 88, 17, 14);
		panel_6_1_1_1.add(cbJ1550Z);

		final JxPanel panel_5_1_1_2_1_1 = new JxPanel();
		panel_5_1_1_2_1_1.setTheme(theme);
		panel_5_1_1_2_1_1.setLayout(null);

		panel_5_1_1_2_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_1_1.setPreferredSize(new Dimension(820, 25));
		panel_5_1_1_2_1_1.setBounds(0, 24, 840, 25);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1);

		final JxLabel a0100Label_1_1_2_1_1 = new JxLabel();
		a0100Label_1_1_2_1_1.setTheme(theme);
		a0100Label_1_1_2_1_1.setBounds(40, 6, 213, 15);

		a0100Label_1_1_2_1_1.setFontSize(12);
		a0100Label_1_1_2_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1_1.setText("Check all that apply");
		panel_5_1_1_2_1_1.add(a0100Label_1_1_2_1_1);

		final JxPanel panel_5_1_1_2_1_1_1 = new JxPanel();
		panel_5_1_1_2_1_1_1.setTheme(theme);
		panel_5_1_1_2_1_1_1.setLayout(null);
		panel_5_1_1_2_1_1_1.setOpaque(false);
		panel_5_1_1_2_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1.setBounds(79, 48,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 22);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1);

		final JxLabel a0100Label_1_1_2_1_1_1 = new JxLabel();
		a0100Label_1_1_2_1_1_1.setTheme(theme);
		a0100Label_1_1_2_1_1_1.setBounds(11, 3, 509, 15);

		a0100Label_1_1_2_1_1_1.setFontSize(12);
		a0100Label_1_1_2_1_1_1.setText("<html><b>A. </b> &nbsp <b> Fever");
		panel_5_1_1_2_1_1_1.add(a0100Label_1_1_2_1_1_1);

		final JxPanel panel_5_1_1_2_1_1_1_1 = new JxPanel();
		panel_5_1_1_2_1_1_1_1.setTheme(theme);
		panel_5_1_1_2_1_1_1_1.setLayout(null);
		panel_5_1_1_2_1_1_1_1.setOpaque(false);
		panel_5_1_1_2_1_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_1_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_1.setBounds(79, 69,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 22);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_1);

		final JxLabel a0100Label_1_1_2_1_1_1_1 = new JxLabel();
		a0100Label_1_1_2_1_1_1_1.setTheme(theme);
		a0100Label_1_1_2_1_1_1_1.setBounds(11, 3, 358, 15);

		a0100Label_1_1_2_1_1_1_1.setFontSize(12);
		a0100Label_1_1_2_1_1_1_1.setText("<html><b>B. </b> &nbsp <b> Vomiting");
		panel_5_1_1_2_1_1_1_1.add(a0100Label_1_1_2_1_1_1_1);

		final JxPanel panel_5_1_1_2_1_1_1_2 = new JxPanel();
		panel_5_1_1_2_1_1_1_2.setTheme(theme);
		panel_5_1_1_2_1_1_1_2.setLayout(null);
		panel_5_1_1_2_1_1_1_2.setOpaque(false);
		panel_5_1_1_2_1_1_1_2.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_1_1_1_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_2.setBounds(79, 90,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 22);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_2);

		final JxLabel a0100Label_1_1_2_1_1_1_2 = new JxLabel();
		a0100Label_1_1_2_1_1_1_2.setTheme(theme);
		a0100Label_1_1_2_1_1_1_2.setBounds(11, 3, 332, 15);

		a0100Label_1_1_2_1_1_1_2.setFontSize(12);
		a0100Label_1_1_2_1_1_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1_1_1_2
				.setText("<html><b>C. </b> &nbsp <b>Dehydrated");
		panel_5_1_1_2_1_1_1_2.add(a0100Label_1_1_2_1_1_1_2);

		final JxPanel panel_5_1_1_2_1_1_1_4 = new JxPanel();
		panel_5_1_1_2_1_1_1_4.setTheme(theme);
		panel_5_1_1_2_1_1_1_4.setLayout(null);
		panel_5_1_1_2_1_1_1_4.setOpaque(false);
		panel_5_1_1_2_1_1_1_4.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_1_1_1_4.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_4.setBounds(79, 130,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 25);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_4);

		final JxLabel a0100Label_1_1_2_1_1_1_4 = new JxLabel();
		a0100Label_1_1_2_1_1_1_4.setTheme(theme);

		a0100Label_1_1_2_1_1_1_4.setFontSize(12);
		a0100Label_1_1_2_1_1_1_4.setBounds(11, 3, 121, 14);
		a0100Label_1_1_2_1_1_1_4
				.setText("<html><b> Z. </b> &nbsp <b>None of the above</b> ");
		panel_5_1_1_2_1_1_1_4.add(a0100Label_1_1_2_1_1_1_4);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 25);
		panel_1_1_2_1.add(panel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setText("<html><body><b>J1550.  Problem Conditions");
		label.setBounds(10, 6, 337, 14);
		panel.add(label);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setBounds(79, 111, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 20);
		panel_1_1_2_1.add(panel_1);

		final JxLabel dLabel = new JxLabel();
		dLabel.setTheme(theme);

		dLabel.setFontSize(12);
		dLabel
				.setText("<html><body> <b>D. </b> &nbsp <b> Internal bleeding </b>");
		dLabel.setBounds(11, 3, 252, 14);
		panel_1.add(dLabel);
		doUpdate();
	}

	@Override
	public void doSave() {

		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		mds3sectionJ.setJ1550A(cbJ1550A.isSelected());
		mds3sectionJ.setJ1550B(cbJ1550B.isSelected());
		mds3sectionJ.setJ1550C(cbJ1550C.isSelected());
		mds3sectionJ.setJ1550D(cbJ1550D.isSelected());
		mds3sectionJ.setJ1550Z(cbJ1550Z.isSelected());

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cbJ1550A.setSelected(mds3sectionJ.isJ1550A());
		cbJ1550B.setSelected(mds3sectionJ.isJ1550B());
		cbJ1550C.setSelected(mds3sectionJ.isJ1550C());
		cbJ1550D.setSelected(mds3sectionJ.isJ1550D());
		cbJ1550Z.setSelected(mds3sectionJ.isJ1550Z());
	}

}
