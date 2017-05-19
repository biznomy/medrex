package medrex.client.mds3.ui.subSections.sectionO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionO.Mds3SectionO;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelO0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7428118160572566453L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtO0500J;
	private JxText txtO0500I;
	private JxText txtO0500H;
	private JxText txtO0500G;
	private JxText txtO0500F;
	private JxText txtO0500E;
	private JxText txtO0500D;
	private JxText txtO0500C;
	private JxText txtO0500B;
	private JxText txtO0500A;

	public PanelO0500() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 426));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);

		panel_18.setLayout(null);
		panel_18.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 426);
		add(panel_18);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_19.setLayout(null);
		panel_19.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_19.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_18.add(panel_19);

		final JxLabel o0500RestorativeNursingLabel = new JxLabel();
		o0500RestorativeNursingLabel.setTheme(theme);

		o0500RestorativeNursingLabel.setFontSize(12);
		o0500RestorativeNursingLabel.setFontStyle(Font.BOLD);
		o0500RestorativeNursingLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		o0500RestorativeNursingLabel
				.setText("O0500.  Restorative Nursing Programs");
		o0500RestorativeNursingLabel.setBounds(10, 6, 452, 14);
		panel_19.add(o0500RestorativeNursingLabel);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);
		panel_20.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_20.setLayout(null);

		panel_20.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 45);
		panel_18.add(panel_20);

		final JxLabel recordTheLabel = new JxLabel();
		recordTheLabel.setTheme(theme);

		recordTheLabel.setFontSize(12);
		recordTheLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		recordTheLabel
				.setText("<html><body>Record the <b> number of days </b> each of the following restorative programs was performed (for at least 15 minutes a day) in the last 7 calender days <br> (enter 0 if none or less than 15 minutes daily)");
		recordTheLabel.setBounds(10, 10, 820, 26);
		panel_20.add(recordTheLabel);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);

		panel_21.setLayout(null);
		panel_21.setBounds(0, 68, Mds3Constants.PAGE_WIDTH, 121);
		panel_18.add(panel_21);

		final JxPanel panel_22 = new JxPanel();
		panel_22.setTheme(theme);
		panel_22.setLayout(null);
		panel_22.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_22.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_22.setBounds(0, 30, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 91);
		panel_21.add(panel_22);

		txtO0500A = new JxText();
		txtO0500A.setTheme(theme);
		txtO0500A.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0500A.setBounds(20, 6, 40, 20);
		panel_22.add(txtO0500A);

		txtO0500B = new JxText();
		txtO0500B.setTheme(theme);
		txtO0500B.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0500B.setBounds(20, 35, 40, 20);
		panel_22.add(txtO0500B);

		txtO0500C = new JxText();
		txtO0500C.setTheme(theme);
		txtO0500C.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0500C.setBounds(20, 65, 40, 20);
		panel_22.add(txtO0500C);

		final JxPanel panel_23 = new JxPanel();
		panel_23.setTheme(theme);
		panel_23.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_23.setLayout(null);
		panel_23.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_23.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_21.add(panel_23);

		final JxLabel techniquesLabel = new JxLabel();
		techniquesLabel.setTheme(theme);

		techniquesLabel.setFontSize(12);
		techniquesLabel.setFontStyle(Font.BOLD);
		techniquesLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		techniquesLabel.setText("Techniques");
		techniquesLabel.setBounds(10, 10, 136, 14);
		panel_23.add(techniquesLabel);

		final JxPanel panel_24 = new JxPanel();
		panel_24.setTheme(theme);
		panel_24.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_24.setLayout(null);

		panel_24.setBounds(79, 30, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_21.add(panel_24);

		final JxLabel aRangeOfLabel = new JxLabel();
		aRangeOfLabel.setTheme(theme);

		aRangeOfLabel.setFontSize(12);
		aRangeOfLabel.setFontStyle(Font.BOLD);
		aRangeOfLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aRangeOfLabel.setText("A.  Range of motion (passive)");
		aRangeOfLabel.setBounds(10, 10, 236, 14);
		panel_24.add(aRangeOfLabel);

		final JxPanel panel_25 = new JxPanel();
		panel_25.setTheme(theme);
		panel_25.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_25.setLayout(null);

		panel_25.setBounds(79, 60, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_21.add(panel_25);

		final JxLabel bRangeOfLabel = new JxLabel();
		bRangeOfLabel.setTheme(theme);

		bRangeOfLabel.setFontSize(12);
		bRangeOfLabel.setFontStyle(Font.BOLD);
		bRangeOfLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bRangeOfLabel.setText("B.  Range of motion (active)");
		bRangeOfLabel.setBounds(10, 10, 157, 14);
		panel_25.add(bRangeOfLabel);

		final JxPanel panel_26 = new JxPanel();
		panel_26.setTheme(theme);
		panel_26.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_26.setLayout(null);

		panel_26.setBounds(79, 90, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_21.add(panel_26);

		final JxLabel cSplintOrLabel = new JxLabel();
		cSplintOrLabel.setTheme(theme);
		cSplintOrLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		cSplintOrLabel.setFontSize(12);
		cSplintOrLabel.setFontStyle(Font.BOLD);
		cSplintOrLabel.setText("C.  Splint or brace assistance");
		cSplintOrLabel.setBounds(10, 10, 194, 14);
		panel_26.add(cSplintOrLabel);

		final JxPanel panel_27 = new JxPanel();
		panel_27.setTheme(theme);
		panel_27.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 31);
		panel_21.add(panel_27);
		panel_27.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_27.setLayout(null);

		final JxLabel numberLabel = new JxLabel();
		numberLabel.setTheme(theme);

		numberLabel.setFontSize(12);
		numberLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		numberLabel.setText("<html><body><b> Number <br> of Days</b> ");
		numberLabel.setBounds(15, 3, 54, 26);
		panel_27.add(numberLabel);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme(theme);

		panel_28.setLayout(null);
		panel_28.setBounds(0, 188, Mds3Constants.PAGE_WIDTH, 238);
		panel_18.add(panel_28);

		final JxPanel panel_29 = new JxPanel();
		panel_29.setTheme(theme);
		panel_29.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_29.setLayout(null);
		panel_29.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_29.setBounds(0, 30, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 208);
		panel_28.add(panel_29);

		txtO0500D = new JxText();
		txtO0500D.setTheme(theme);
		txtO0500D.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0500D.setBounds(20, 6, 40, 20);
		panel_29.add(txtO0500D);

		txtO0500E = new JxText();
		txtO0500E.setTheme(theme);
		txtO0500E.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0500E.setBounds(20, 35, 40, 20);
		panel_29.add(txtO0500E);

		txtO0500F = new JxText();
		txtO0500F.setTheme(theme);
		txtO0500F.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0500F.setBounds(20, 65, 40, 20);
		panel_29.add(txtO0500F);

		txtO0500G = new JxText();
		txtO0500G.setTheme(theme);
		txtO0500G.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0500G.setBounds(20, 93, 40, 20);
		panel_29.add(txtO0500G);

		txtO0500H = new JxText();
		txtO0500H.setTheme(theme);
		txtO0500H.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0500H.setBounds(20, 122, 40, 20);
		panel_29.add(txtO0500H);

		txtO0500I = new JxText();
		txtO0500I.setTheme(theme);
		txtO0500I.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0500I.setBounds(20, 154, 40, 20);
		panel_29.add(txtO0500I);

		txtO0500J = new JxText();
		txtO0500J.setTheme(theme);
		txtO0500J.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		txtO0500J.setBounds(20, 183, 40, 20);
		panel_29.add(txtO0500J);

		final JxPanel panel_30 = new JxPanel();
		panel_30.setTheme(theme);
		panel_30.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_30.setLayout(null);
		panel_30.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_30.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_28.add(panel_30);

		final JxLabel trainingAndSkillLabel = new JxLabel();
		trainingAndSkillLabel.setTheme(theme);

		trainingAndSkillLabel.setFontSize(12);
		trainingAndSkillLabel.setFontStyle(Font.BOLD);
		trainingAndSkillLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		trainingAndSkillLabel.setText("Training and skill Practice in :");
		trainingAndSkillLabel.setBounds(10, 10, 172, 14);
		panel_30.add(trainingAndSkillLabel);

		final JxPanel panel_31 = new JxPanel();
		panel_31.setTheme(theme);
		panel_31.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_31.setLayout(null);

		panel_31.setBounds(79, 30, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_28.add(panel_31);

		final JxLabel dBedMobilityLabel = new JxLabel();
		dBedMobilityLabel.setTheme(theme);

		dBedMobilityLabel.setFontSize(12);
		dBedMobilityLabel.setFontStyle(Font.BOLD);
		dBedMobilityLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dBedMobilityLabel.setText("D.  Bed mobility");
		dBedMobilityLabel.setBounds(10, 10, 196, 14);
		panel_31.add(dBedMobilityLabel);

		final JxPanel panel_32 = new JxPanel();
		panel_32.setTheme(theme);
		panel_32.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_32.setLayout(null);

		panel_32.setBounds(79, 60, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_28.add(panel_32);

		final JxLabel eTransferLabel = new JxLabel();
		eTransferLabel.setTheme(theme);
		eTransferLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		eTransferLabel.setFontSize(12);
		eTransferLabel.setFontStyle(Font.BOLD);
		eTransferLabel.setText("E.  Transfer");
		eTransferLabel.setBounds(10, 10, 187, 14);
		panel_32.add(eTransferLabel);

		final JxPanel panel_33 = new JxPanel();
		panel_33.setTheme(theme);
		panel_33.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_33.setLayout(null);

		panel_33.setBounds(79, 90, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_28.add(panel_33);

		final JxLabel fWalkingLabel = new JxLabel();
		fWalkingLabel.setTheme(theme);

		fWalkingLabel.setFontSize(12);
		fWalkingLabel.setFontStyle(Font.BOLD);
		fWalkingLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		fWalkingLabel.setText("F.  Walking");
		fWalkingLabel.setBounds(10, 10, 193, 14);
		panel_33.add(fWalkingLabel);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_34.setLayout(null);

		panel_34.setBounds(79, 120, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_28.add(panel_34);

		final JxLabel gDressingAndorLabel = new JxLabel();
		gDressingAndorLabel.setTheme(theme);

		gDressingAndorLabel.setFontSize(12);
		gDressingAndorLabel.setFontStyle(Font.BOLD);
		gDressingAndorLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		gDressingAndorLabel.setText("G.  Dressing and/or grooming");
		gDressingAndorLabel.setBounds(10, 10, 254, 14);
		panel_34.add(gDressingAndorLabel);

		final JxPanel panel_35 = new JxPanel();
		panel_35.setTheme(theme);
		panel_35.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_35.setLayout(null);

		panel_35.setBounds(79, 150, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_28.add(panel_35);

		final JxLabel hEatingAndorLabel = new JxLabel();
		hEatingAndorLabel.setTheme(theme);

		hEatingAndorLabel.setFontSize(12);
		hEatingAndorLabel.setFontStyle(Font.BOLD);
		hEatingAndorLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		hEatingAndorLabel.setText("H.  Eating and/or swallowing");
		hEatingAndorLabel.setBounds(10, 10, 235, 14);
		panel_35.add(hEatingAndorLabel);

		final JxPanel panel_36 = new JxPanel();
		panel_36.setTheme(theme);
		panel_36.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_36.setLayout(null);

		panel_36.setBounds(79, 180, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 31);
		panel_28.add(panel_36);

		final JxLabel iAmputationprosthesesCareLabel = new JxLabel();
		iAmputationprosthesesCareLabel.setTheme(theme);

		iAmputationprosthesesCareLabel.setFontSize(12);
		iAmputationprosthesesCareLabel.setFontStyle(Font.BOLD);
		iAmputationprosthesesCareLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		iAmputationprosthesesCareLabel
				.setText("I.  Amputation/prostheses care");
		iAmputationprosthesesCareLabel.setBounds(10, 10, 198, 14);
		panel_36.add(iAmputationprosthesesCareLabel);

		final JxPanel panel_37 = new JxPanel();
		panel_37.setTheme(theme);
		panel_37.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_37.setLayout(null);

		panel_37.setBounds(79, 210, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 28);
		panel_28.add(panel_37);

		final JxLabel jCommunicaitonLabel = new JxLabel();
		jCommunicaitonLabel.setTheme(theme);

		jCommunicaitonLabel.setFontSize(12);
		jCommunicaitonLabel.setFontStyle(Font.BOLD);
		jCommunicaitonLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		jCommunicaitonLabel.setText("J.  Communicaiton");
		jCommunicaitonLabel.setBounds(10, 10, 213, 14);
		panel_37.add(jCommunicaitonLabel);

		final JxPanel panel_38 = new JxPanel();
		panel_38.setTheme(theme);
		panel_38.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_38.setLayout(null);

		panel_38.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 31);
		panel_28.add(panel_38);

		final JxLabel numberLabel_1 = new JxLabel();
		numberLabel_1.setTheme(theme);

		numberLabel_1.setFontSize(12);
		numberLabel_1.setFontStyle(Font.BOLD);
		numberLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		numberLabel_1.setText("<html><body><b> Number <br> of Days</b> ");
		numberLabel_1.setBounds(15, 3, 60, 26);
		panel_38.add(numberLabel_1);
		doUpdate();

	}

	@Override
	public void doSave() {
		Mds3SectionO sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		sectionO.setO0500A(getInt(txtO0500A.getText()));
		sectionO.setO0500B(getInt(txtO0500B.getText()));
		sectionO.setO0500C(getInt(txtO0500C.getText()));
		sectionO.setO0500D(getInt(txtO0500D.getText()));

		sectionO.setO0500E(getInt(txtO0500E.getText()));
		sectionO.setO0500F(getInt(txtO0500F.getText()));
		sectionO.setO0500G(getInt(txtO0500G.getText()));
		sectionO.setO0500H(getInt(txtO0500H.getText()));

		sectionO.setO0500I(getInt(txtO0500I.getText()));
		sectionO.setO0500J(getInt(txtO0500J.getText()));

	}

	int getInt(String string) {
		try {
			return (Integer.parseInt(string));
		} catch (Exception e) {
			return (-1);
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionO mds3SectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		txtO0500A.setText(mds3SectionO.getO0500A() + "");
		txtO0500B.setText(mds3SectionO.getO0500B() + "");
		txtO0500C.setText(mds3SectionO.getO0500C() + "");
		txtO0500D.setText(mds3SectionO.getO0500D() + "");
		txtO0500E.setText(mds3SectionO.getO0500E() + "");
		txtO0500F.setText(mds3SectionO.getO0500F() + "");
		txtO0500G.setText(mds3SectionO.getO0500G() + "");
		txtO0500H.setText(mds3SectionO.getO0500H() + "");
		txtO0500I.setText(mds3SectionO.getO0500I() + "");
		txtO0500J.setText(mds3SectionO.getO0500J() + "");
	}

}
