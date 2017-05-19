package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionM.Mds3SectionM;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelM0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3407588518845214938L;

	Theme theme = new BlackOverWhiteTheme();

	private JxCheckBox cbM0100D;
	private JxCheckBox cbM0100C;
	private JxCheckBox cbM0100B;
	private JxCheckBox cbM0100A;

	public PanelM0100() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 145));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 145);
		add(panel);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_8.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_8);

		final JxLabel m0100DeterminationOfLabel = new JxLabel();
		m0100DeterminationOfLabel.setTheme(theme);
		m0100DeterminationOfLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		m0100DeterminationOfLabel.setFontSize(12);
		m0100DeterminationOfLabel.setFontStyle(Font.BOLD);
		m0100DeterminationOfLabel
				.setText("M0100.  Determination of Pressure Ulcer Risk");
		m0100DeterminationOfLabel.setBounds(10, 5, 493, 14);
		panel_8.add(m0100DeterminationOfLabel);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9.setLayout(null);

		panel_9.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 20);
		panel.add(panel_9);

		final JxLabel checkAllThatLabel = new JxLabel();
		checkAllThatLabel.setTheme(theme);

		checkAllThatLabel.setFontSize(12);
		checkAllThatLabel.setFontStyle(Font.BOLD);
		checkAllThatLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		checkAllThatLabel.setBounds(49, 0, 408, 20);
		panel_9.add(checkAllThatLabel);
		checkAllThatLabel.setText("Check all that apply");

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setLayout(null);

		panel_10.setBounds(0, 43, 80, 102);
		panel.add(panel_10);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_11.setLayout(null);
		// panel_11.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_11.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_11.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 102);
		panel_10.add(panel_11);

		cbM0100A = new JxCheckBox();
		cbM0100A.setTheme(theme);

		cbM0100A.setBounds(33, 6, 17, 15);
		cbM0100A.setText("");
		panel_11.add(cbM0100A);

		cbM0100C = new JxCheckBox();
		cbM0100C.setTheme(theme);

		cbM0100C.setBounds(33, 56, 17, 15);
		cbM0100C.setText("");
		panel_11.add(cbM0100C);

		cbM0100B = new JxCheckBox();
		cbM0100B.setTheme(theme);

		cbM0100B.setBounds(33, 31, 17, 15);
		cbM0100B.setText("");
		panel_11.add(cbM0100B);

		cbM0100D = new JxCheckBox();
		cbM0100D.setTheme(theme);

		cbM0100D.setBounds(33, 80, 17, 15);

		cbM0100D.setText("");
		panel_11.add(cbM0100D);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setLayout(null);
		panel_12.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_12.setBounds(79, 43, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 27);
		panel.add(panel_12);

		final JxLabel aresidentHasALabel = new JxLabel();
		aresidentHasALabel.setTheme(theme);

		aresidentHasALabel.setFontSize(12);
		aresidentHasALabel.setFontStyle(Font.BOLD);
		aresidentHasALabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aresidentHasALabel.setBounds(10, 5, 598, 16);
		aresidentHasALabel
				.setText("A.   Resident has a stage 1 or greater , a scar over bony prominence , or a non- removable dressing /device");
		panel_12.add(aresidentHasALabel);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setLayout(null);

		panel_13.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_13.setBounds(79, 69, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 27);

		panel.add(panel_13);

		final JxLabel bFormalAssessmentLabel = new JxLabel();
		bFormalAssessmentLabel.setTheme(theme);

		bFormalAssessmentLabel.setFontSize(12);
		bFormalAssessmentLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bFormalAssessmentLabel
				.setText("<html><body><b>B. </b>&nbsp<b>   Formal assessment instrument/tool</b> (e.g Braden,Norton,or other)</body></html>");
		bFormalAssessmentLabel.setBounds(10, 5, 381, 17);
		panel_13.add(bFormalAssessmentLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_14.setBounds(79, 95, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 25);

		panel.add(panel_14);

		final JxLabel cClinicalAssessmentLabel = new JxLabel();
		cClinicalAssessmentLabel.setTheme(theme);

		cClinicalAssessmentLabel.setFontSize(12);
		cClinicalAssessmentLabel.setFontStyle(Font.BOLD);
		cClinicalAssessmentLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		cClinicalAssessmentLabel.setText("C.  Clinical assessment");
		cClinicalAssessmentLabel.setBounds(10, 5, 162, 16);
		panel_14.add(cClinicalAssessmentLabel);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setLayout(null);
		panel_15.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_15.setBounds(79, 119, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 26);

		panel.add(panel_15);

		final JxLabel dNoneOfLabel = new JxLabel();
		dNoneOfLabel.setTheme(theme);

		dNoneOfLabel.setFontSize(12);
		dNoneOfLabel.setFontStyle(Font.BOLD);
		dNoneOfLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dNoneOfLabel.setText("D.   None of the above");
		dNoneOfLabel.setBounds(10, 5, 443, 14);
		panel_15.add(dNoneOfLabel);

		doUpdate();
	}

	@Override
	public void doSave() {

		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		mds3sectionM.setM0100A(cbM0100A.isSelected());
		mds3sectionM.setM0100B(cbM0100B.isSelected());
		mds3sectionM.setM0100C(cbM0100C.isSelected());
		mds3sectionM.setM0100Z(cbM0100D.isSelected());
	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cbM0100A.setSelected(mds3sectionM.isM0100A());
		cbM0100B.setSelected(mds3sectionM.isM0100B());
		cbM0100C.setSelected(mds3sectionM.isM0100C());
		cbM0100D.setSelected(mds3sectionM.isM0100Z());

	}

}
