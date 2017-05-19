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

public class PanelJ1100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9196625317727736835L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbJ1100Z;
	private JxCheckBox cbJ1100C;
	private JxCheckBox cbJ1100B;
	private JxCheckBox cbJ1100A;

	public PanelJ1100() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 160));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_2_1 = new JxPanel();
		panel_1_1_2_1.setTheme(theme);
		panel_1_1_2_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 152);
		add(panel_1_1_2_1);

		panel_1_1_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH,
				151));

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);
		panel_6_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 72, Mds3Constants.SUBSECTION_WIDTH_LEFT_1,
				80);
		panel_1_1_2_1.add(panel_6_1_1_1);

		cbJ1100A = new JxCheckBox();
		cbJ1100A.setTheme(theme);

		cbJ1100A.setText("New JxCheckBox");
		cbJ1100A.setBounds(33, 3, 17, 14);
		panel_6_1_1_1.add(cbJ1100A);

		cbJ1100B = new JxCheckBox();
		cbJ1100B.setTheme(theme);

		cbJ1100B.setText("New JxCheckBox");
		cbJ1100B.setBounds(33, 23, 17, 14);
		panel_6_1_1_1.add(cbJ1100B);

		cbJ1100C = new JxCheckBox();
		cbJ1100C.setTheme(theme);

		cbJ1100C.setText("New JxCheckBox");
		cbJ1100C.setBounds(33, 42, 17, 14);
		panel_6_1_1_1.add(cbJ1100C);

		cbJ1100Z = new JxCheckBox();
		cbJ1100Z.setTheme(theme);

		cbJ1100Z.setText("New JxCheckBox");
		cbJ1100Z.setBounds(33, 60, 17, 14);
		panel_6_1_1_1.add(cbJ1100Z);

		final JxPanel panel_5_1_1_2_1 = new JxPanel();
		panel_5_1_1_2_1.setTheme(theme);
		panel_5_1_1_2_1.setLayout(null);
		panel_5_1_1_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_1_2_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1.setBounds(0, 0, 840, 25);
		panel_1_1_2_1.add(panel_5_1_1_2_1);

		final JxLabel a0100Label_1_1_2_1 = new JxLabel();
		a0100Label_1_1_2_1.setTheme(theme);
		a0100Label_1_1_2_1.setBounds(11, 6, 260, 15);

		a0100Label_1_1_2_1.setFontSize(14);
		a0100Label_1_1_2_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1.setText("<html><b> Other Health Coditions");
		panel_5_1_1_2_1.add(a0100Label_1_1_2_1);

		final JxPanel panel_5_1_1_2_1_1 = new JxPanel();
		panel_5_1_1_2_1_1.setTheme(theme);
		panel_5_1_1_2_1_1.setLayout(null);

		panel_5_1_1_2_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1.setBounds(0, 48, 840, 25);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1);

		final JxLabel a0100Label_1_1_2_1_1 = new JxLabel();
		a0100Label_1_1_2_1_1.setTheme(theme);
		a0100Label_1_1_2_1_1.setBounds(40, 6, 110, 15);
		panel_5_1_1_2_1_1.add(a0100Label_1_1_2_1_1);

		a0100Label_1_1_2_1_1.setFontSize(12);
		a0100Label_1_1_2_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1_1.setText("Check all that apply");

		final JxPanel panel_5_1_1_2_1_1_1 = new JxPanel();
		panel_5_1_1_2_1_1_1.setTheme(theme);
		panel_5_1_1_2_1_1_1.setLayout(null);
		panel_5_1_1_2_1_1_1.setOpaque(false);
		panel_5_1_1_2_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1.setBounds(79, 72,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 20);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1);

		final JxLabel a0100Label_1_1_2_1_1_1 = new JxLabel();
		a0100Label_1_1_2_1_1_1.setTheme(theme);
		a0100Label_1_1_2_1_1_1.setBounds(11, 3, 509, 15);

		a0100Label_1_1_2_1_1_1.setFontSize(12);
		a0100Label_1_1_2_1_1_1
				.setText("<html><b>A. </b> &nbsp <b> Shortness of breath </b> or trouble breathing<b> with exertion </b>(eg. walking ,bathing, transferring)");
		panel_5_1_1_2_1_1_1.add(a0100Label_1_1_2_1_1_1);

		final JxPanel panel_5_1_1_2_1_1_1_1 = new JxPanel();
		panel_5_1_1_2_1_1_1_1.setTheme(theme);
		panel_5_1_1_2_1_1_1_1.setLayout(null);
		panel_5_1_1_2_1_1_1_1.setOpaque(false);
		panel_5_1_1_2_1_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_1_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_1.setBounds(79, 91,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 20);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_1);

		final JxLabel a0100Label_1_1_2_1_1_1_1 = new JxLabel();
		a0100Label_1_1_2_1_1_1_1.setTheme(theme);
		a0100Label_1_1_2_1_1_1_1.setBounds(11, 3, 358, 15);

		a0100Label_1_1_2_1_1_1_1.setFontSize(12);
		a0100Label_1_1_2_1_1_1_1
				.setText("<html><b>B. </b> &nbsp <b>  Shortness of breath </b> or trouble breathing<b> when sitting at rest.");
		panel_5_1_1_2_1_1_1_1.add(a0100Label_1_1_2_1_1_1_1);

		final JxPanel panel_5_1_1_2_1_1_1_2 = new JxPanel();
		panel_5_1_1_2_1_1_1_2.setTheme(theme);
		panel_5_1_1_2_1_1_1_2.setLayout(null);
		panel_5_1_1_2_1_1_1_2.setOpaque(false);
		panel_5_1_1_2_1_1_1_2.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_1_1_1_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_2.setBounds(79, 110,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 20);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_2);

		final JxLabel a0100Label_1_1_2_1_1_1_2 = new JxLabel();
		a0100Label_1_1_2_1_1_1_2.setTheme(theme);
		a0100Label_1_1_2_1_1_1_2.setBounds(11, 3, 335, 15);

		a0100Label_1_1_2_1_1_1_2.setFontSize(12);
		a0100Label_1_1_2_1_1_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1_1_1_2
				.setText("<html><b>C. </b> &nbsp <b>  Shortness of breath </b> or trouble breathing<b> when lying flat.");
		panel_5_1_1_2_1_1_1_2.add(a0100Label_1_1_2_1_1_1_2);

		final JxPanel panel_5_1_1_2_1_1_1_4 = new JxPanel();
		panel_5_1_1_2_1_1_1_4.setTheme(theme);
		panel_5_1_1_2_1_1_1_4.setLayout(null);
		panel_5_1_1_2_1_1_1_4.setOpaque(false);
		panel_5_1_1_2_1_1_1_4.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_1_1_1_4.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1_1_4.setBounds(79, 129,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 23);
		panel_1_1_2_1.add(panel_5_1_1_2_1_1_1_4);

		final JxLabel a0100Label_1_1_2_1_1_1_4 = new JxLabel();
		a0100Label_1_1_2_1_1_1_4.setTheme(theme);
		a0100Label_1_1_2_1_1_1_4.setBounds(11, 3, 120, 15);

		a0100Label_1_1_2_1_1_1_4.setFontSize(12);
		a0100Label_1_1_2_1_1_1_4
				.setText("<html><b> Z. </b> &nbsp <b>None of the above</b> ");
		panel_5_1_1_2_1_1_1_4.add(a0100Label_1_1_2_1_1_1_4);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel.setLayout(null);
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.setBounds(0, 24, 840, 25);
		panel_1_1_2_1.add(panel);

		final JxLabel j1100ShprtnessOfLabel = new JxLabel();
		j1100ShprtnessOfLabel.setTheme(theme);

		j1100ShprtnessOfLabel.setFontSize(12);
		j1100ShprtnessOfLabel.setFontStyle(Font.BOLD);
		j1100ShprtnessOfLabel.setText("J1100.  Shprtness of Breath ( dyspnea)");
		j1100ShprtnessOfLabel.setBounds(10, 6, 236, 14);
		panel.add(j1100ShprtnessOfLabel);
		doUpdate();

	}

	@Override
	public void doSave() {

		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		mds3sectionJ.setJ1100A(cbJ1100A.isSelected());
		mds3sectionJ.setJ1100B(cbJ1100B.isSelected());
		mds3sectionJ.setJ1100B(cbJ1100C.isSelected());
		mds3sectionJ.setJ1100C(cbJ1100Z.isSelected());

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cbJ1100A.setSelected(mds3sectionJ.isJ1100A());
		cbJ1100B.setSelected(mds3sectionJ.isJ1100B());
		cbJ1100C.setSelected(mds3sectionJ.isJ1100C());
		cbJ1100Z.setSelected(mds3sectionJ.isJ1100Z());
	}

}
