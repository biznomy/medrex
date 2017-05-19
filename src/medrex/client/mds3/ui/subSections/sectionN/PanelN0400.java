package medrex.client.mds3.ui.subSections.sectionN;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionN.Mds3SectionN;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelN0400 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5692843605407653486L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbN0400Z;
	private JxCheckBox cbN0400G;
	private JxCheckBox cbN0400F;
	private JxCheckBox cbN0400E;
	private JxCheckBox cbN0400D;
	private JxCheckBox cbN0400C;
	private JxCheckBox cbN0400B;
	private JxCheckBox cbN0400A;

	public PanelN0400() {
		super();

		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 242));

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 2, 840, 240);

		add(panel_7_1);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBounds(0, 0, 840, 20);
		panel_16.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_7_1.add(panel_16);

		final JxLabel n0300injectionsLabel_1_1 = new JxLabel();
		n0300injectionsLabel_1_1.setTheme(theme);
		n0300injectionsLabel_1_1.setBounds(22, 0, 387, 20);
		panel_16.add(n0300injectionsLabel_1_1);

		n0300injectionsLabel_1_1.setFontSize(12);
		n0300injectionsLabel_1_1.setFontStyle(Font.BOLD);
		n0300injectionsLabel_1_1.setText("N0400.Medications Received");

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setBounds(0, 20, 840, 20);
		panel_7_1.add(panel_7_2);
		panel_7_2.setBorder(new LineBorder(Color.black, 1, false));

		panel_7_2.setLayout(null);

		final JxLabel n0300injectionsLabel_1_2 = new JxLabel();
		n0300injectionsLabel_1_2.setTheme(theme);

		n0300injectionsLabel_1_2.setFontSize(12);
		n0300injectionsLabel_1_2.setFontStyle(Font.BOLD);
		n0300injectionsLabel_1_2
				.setText("Check all medications the resident received at any time during the last7 days or since admission/reentry if less than 7 days ");
		n0300injectionsLabel_1_2.setBounds(45, 2, 750, 14);
		panel_7_2.add(n0300injectionsLabel_1_2);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setBounds(0, 40, 80, 200);
		panel_7_1.add(panel_12);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_12.setLayout(null);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBounds(80, 40, 760, 200);
		panel_7_1.add(panel_13);
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);

		final JxPanel panel_13_1 = new JxPanel();
		panel_13_1.setTheme(theme);
		panel_13_1.setBounds(0, 0, 760, 25);
		panel_13.add(panel_13_1);
		panel_13_1.setBorder(new LineBorder(Color.black, 1, false));

		panel_13_1.setLayout(null);

		final JxLabel aantipsychoticLabel = new JxLabel();
		aantipsychoticLabel.setTheme(theme);

		aantipsychoticLabel.setFontSize(12);
		aantipsychoticLabel.setFontStyle(Font.BOLD);
		aantipsychoticLabel.setText("A. Antipsychotic");
		aantipsychoticLabel.setBounds(10, 2, 200, 15);
		panel_13_1.add(aantipsychoticLabel);

		final JxPanel panel_13_2 = new JxPanel();
		panel_13_2.setTheme(theme);
		panel_13_2.setBounds(0, 25, 760, 25);
		panel_13.add(panel_13_2);
		panel_13_2.setBorder(new LineBorder(Color.black, 1, false));

		panel_13_2.setLayout(null);

		final JxLabel bAntianxietyLabel = new JxLabel();
		bAntianxietyLabel.setTheme(theme);

		bAntianxietyLabel.setFontSize(12);
		bAntianxietyLabel.setFontStyle(Font.BOLD);
		bAntianxietyLabel.setText("B. Antianxiety");
		bAntianxietyLabel.setBounds(10, 2, 200, 15);
		panel_13_2.add(bAntianxietyLabel);

		final JxPanel panel_13_3 = new JxPanel();
		panel_13_3.setTheme(theme);
		panel_13_3.setBounds(0, 50, 760, 25);
		panel_13.add(panel_13_3);
		panel_13_3.setBorder(new LineBorder(Color.black, 1, false));

		panel_13_3.setLayout(null);

		final JxLabel cAntidepressantLabel = new JxLabel();
		cAntidepressantLabel.setTheme(theme);

		cAntidepressantLabel.setFontSize(12);
		cAntidepressantLabel.setFontStyle(Font.BOLD);
		cAntidepressantLabel.setText("C. Antidepressant");
		cAntidepressantLabel.setBounds(10, 2, 200, 15);
		panel_13_3.add(cAntidepressantLabel);

		final JxPanel panel_13_4 = new JxPanel();
		panel_13_4.setTheme(theme);
		panel_13_4.setBounds(0, 75, 760, 25);
		panel_13.add(panel_13_4);
		panel_13_4.setBorder(new LineBorder(Color.black, 1, false));

		panel_13_4.setLayout(null);

		final JxLabel dHypnoticLabel = new JxLabel();
		dHypnoticLabel.setTheme(theme);

		dHypnoticLabel.setFontSize(12);
		dHypnoticLabel.setFontStyle(Font.BOLD);
		dHypnoticLabel.setText("D. Hypnotic");
		dHypnoticLabel.setBounds(10, 2, 200, 15);
		panel_13_4.add(dHypnoticLabel);

		final JxPanel panel_13_5 = new JxPanel();
		panel_13_5.setTheme(theme);
		panel_13_5.setBounds(0, 100, 760, 25);
		panel_13.add(panel_13_5);
		panel_13_5.setBorder(new LineBorder(Color.black, 1, false));

		panel_13_5.setLayout(null);

		final JxLabel label_3_4 = new JxLabel();
		label_3_4.setTheme(theme);

		label_3_4.setFontSize(12);
		label_3_4
				.setText("<html><body><b> E. Anticoagulant</b> (warfarin,heparin,or low- molecular weight heparin)");
		label_3_4.setBounds(10, 2, 460, 15);
		panel_13_5.add(label_3_4);

		final JxPanel panel_13_6 = new JxPanel();
		panel_13_6.setTheme(theme);
		panel_13_6.setBounds(0, 125, 760, 25);
		panel_13.add(panel_13_6);
		panel_13_6.setBorder(new LineBorder(Color.black, 1, false));

		panel_13_6.setLayout(null);

		final JxLabel fAntibioticLabel = new JxLabel();
		fAntibioticLabel.setTheme(theme);

		fAntibioticLabel.setFontSize(12);
		fAntibioticLabel.setFontStyle(Font.BOLD);
		fAntibioticLabel.setText("F. Antibiotic");
		fAntibioticLabel.setBounds(10, 2, 200, 15);
		panel_13_6.add(fAntibioticLabel);

		final JxPanel panel_13_7 = new JxPanel();
		panel_13_7.setTheme(theme);
		panel_13_7.setBounds(0, 150, 760, 25);
		panel_13.add(panel_13_7);
		panel_13_7.setBorder(new LineBorder(Color.black, 1, false));

		panel_13_7.setLayout(null);

		final JxLabel gDiureticLabel = new JxLabel();
		gDiureticLabel.setTheme(theme);

		gDiureticLabel.setFontSize(12);
		gDiureticLabel.setFontStyle(Font.BOLD);
		gDiureticLabel.setText("G. Diuretic");
		gDiureticLabel.setBounds(10, 2, 200, 15);
		panel_13_7.add(gDiureticLabel);

		final JxPanel panel_13_8 = new JxPanel();
		panel_13_8.setTheme(theme);
		panel_13_8.setBounds(0, 175, 760, 25);
		panel_13.add(panel_13_8);
		panel_13_8.setBorder(new LineBorder(Color.black, 1, false));

		panel_13_8.setLayout(null);

		final JxLabel gDiureticLabel_1 = new JxLabel();
		gDiureticLabel_1.setTheme(theme);

		gDiureticLabel_1.setFontSize(12);
		gDiureticLabel_1.setFontStyle(Font.BOLD);
		gDiureticLabel_1.setText("Z. None of the above were received ");
		gDiureticLabel_1.setBounds(10, 0, 200, 15);
		panel_13_8.add(gDiureticLabel_1);

		cbN0400A = new JxCheckBox();
		cbN0400A.setTheme(theme);

		cbN0400A.setText("New JxCheckBox");
		cbN0400A.setBounds(30, 5, 15, 15);
		panel_12.add(cbN0400A);

		cbN0400B = new JxCheckBox();
		cbN0400B.setTheme(theme);

		cbN0400B.setText("New JxCheckBox");
		cbN0400B.setBounds(30, 30, 15, 15);
		panel_12.add(cbN0400B);

		cbN0400C = new JxCheckBox();
		cbN0400C.setTheme(theme);

		cbN0400C.setText("New JxCheckBox");
		cbN0400C.setBounds(30, 55, 15, 15);
		panel_12.add(cbN0400C);

		cbN0400D = new JxCheckBox();
		cbN0400D.setTheme(theme);

		cbN0400D.setText("New JxCheckBox");
		cbN0400D.setBounds(30, 80, 15, 15);
		panel_12.add(cbN0400D);

		cbN0400E = new JxCheckBox();
		cbN0400E.setTheme(theme);

		cbN0400E.setText("New JxCheckBox");
		cbN0400E.setBounds(30, 105, 15, 15);
		panel_12.add(cbN0400E);

		cbN0400F = new JxCheckBox();
		cbN0400F.setTheme(theme);

		cbN0400F.setText("New JxCheckBox");
		cbN0400F.setBounds(30, 130, 15, 15);
		panel_12.add(cbN0400F);

		cbN0400G = new JxCheckBox();
		cbN0400G.setTheme(theme);

		cbN0400G.setText("New JxCheckBox");
		cbN0400G.setBounds(30, 155, 15, 15);
		panel_12.add(cbN0400G);

		cbN0400Z = new JxCheckBox();
		cbN0400Z.setTheme(theme);

		cbN0400Z.setText("New JxCheckBox");
		cbN0400Z.setBounds(30, 180, 15, 15);
		panel_12.add(cbN0400Z);

		doUpdate();
	}

	@Override
	public void doSave() {

		Mds3SectionN mds3sectionN = (Mds3SectionN) Mds3Controller.getInstance()
				.getSection(Mds3SectionN.class);
		mds3sectionN.setN0400A(cbN0400A.isSelected());
		mds3sectionN.setN0400B(cbN0400B.isSelected());
		mds3sectionN.setN0400C(cbN0400C.isSelected());
		mds3sectionN.setN0400D(cbN0400D.isSelected());
		mds3sectionN.setN0400E(cbN0400E.isSelected());
		mds3sectionN.setN0400F(cbN0400F.isSelected());
		mds3sectionN.setN0400G(cbN0400G.isSelected());
		mds3sectionN.setN0400Z(cbN0400Z.isSelected());
	}

	@Override
	public void doUpdate() {
		Mds3SectionN mds3sectionN = (Mds3SectionN) Mds3Controller.getInstance()
				.getSection(Mds3SectionN.class);
		cbN0400A.setSelected(mds3sectionN.isN0400A());
		cbN0400B.setSelected(mds3sectionN.isN0400B());
		cbN0400C.setSelected(mds3sectionN.isN0400C());
		cbN0400D.setSelected(mds3sectionN.isN0400D());
		cbN0400E.setSelected(mds3sectionN.isN0400E());
		cbN0400F.setSelected(mds3sectionN.isN0400F());
		cbN0400G.setSelected(mds3sectionN.isN0400G());
		cbN0400Z.setSelected(mds3sectionN.isN0400Z());

	}

}
