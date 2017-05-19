package medrex.client.mds3.ui.subSections.sectionN;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelMDS3Page26 extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7349340155367239363L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelMDS3Page26() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 1250));

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBounds(0, 7, 840, 35);

		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(840, 35));
		add(panel_1);

		final JxLabel residentLabel = new JxLabel();
		residentLabel.setTheme(theme);

		residentLabel.setFontSize(12);
		residentLabel.setText("Resident");
		residentLabel.setBounds(10, 9, 56, 16);
		panel_1.add(residentLabel);

		final JxText txtresident = new JxText();
		txtresident.setTheme(theme);
		txtresident.setBounds(84, 8, 248, 20);
		panel_1.add(txtresident);

		final JxLabel residentLabel_1 = new JxLabel();
		residentLabel_1.setTheme(theme);

		residentLabel_1.setFontSize(12);
		residentLabel_1.setText("Identifier");
		residentLabel_1.setBounds(354, 10, 56, 16);
		panel_1.add(residentLabel_1);

		final JxText txtidentifier = new JxText();
		txtidentifier.setTheme(theme);
		txtidentifier.setBounds(429, 8, 213, 20);
		panel_1.add(txtidentifier);

		final JxLabel residentLabel_1_1 = new JxLabel();
		residentLabel_1_1.setTheme(theme);

		residentLabel_1_1.setFontSize(12);
		residentLabel_1_1.setText("Date");
		residentLabel_1_1.setBounds(668, 10, 56, 16);
		panel_1.add(residentLabel_1_1);

		final JxDateChooser dcDate = new JxDateChooser();
		dcDate.setTheme(theme);

		dcDate.setBounds(730, 8, 100, 22);
		panel_1.add(dcDate);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBounds(0, 47, 840, 25);
		panel_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(840, 25));
		add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_3.setBounds(3, 3, 231, 18);
		panel_2.add(panel_3);

		final JxLabel sectionALabel = new JxLabel();
		sectionALabel.setTheme(theme);
		sectionALabel.setBounds(10, 2, 74, 19);
		sectionALabel.setForeground(Color.WHITE);

		sectionALabel.setFontStyle(Font.BOLD);
		sectionALabel.setText("Section N");
		panel_3.add(sectionALabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setLayout(null);
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_4.setBounds(246, 2, 592, 21);
		panel_2.add(panel_4);

		final JxLabel identificationInformationLabel = new JxLabel();
		identificationInformationLabel.setTheme(theme);
		identificationInformationLabel.setBounds(5, 2, 92, 19);
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);

		identificationInformationLabel.setFontStyle(Font.BOLD);
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Medications");
		panel_4.add(identificationInformationLabel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 72, 840, 70);

		add(panel_6);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 20);
		panel.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6.add(panel);

		final JxLabel n0300injectionsLabel = new JxLabel();
		n0300injectionsLabel.setTheme(theme);

		n0300injectionsLabel.setFontSize(12);
		n0300injectionsLabel.setFontStyle(Font.BOLD);
		n0300injectionsLabel.setText("N0300.Injection");
		n0300injectionsLabel.setBounds(10, 2, 200, 14);
		panel.add(n0300injectionsLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBounds(0, 20, 80, 50);
		panel_6.add(panel_5);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5.setLayout(null);

		final JxComboBox comboBox = new JxComboBox();
		comboBox.setTheme(theme);

		comboBox.setBounds(20, 20, 35, 23);
		panel_5.add(comboBox);

		final JxLabel enterDaysLabel = new JxLabel();
		enterDaysLabel.setTheme(theme);
		enterDaysLabel.setText("Enter Days");
		enterDaysLabel.setBounds(10, 0, 54, 14);
		panel_5.add(enterDaysLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBounds(80, 20, 760, 50);

		panel_6.add(panel_14);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label
				.setText("<html><body><b> Record the number of days that injections of any type </b> were received during the last 7 days or since admission/<br> 7 days .If 0-->Skip to N0400,Medication received ");
		label.setBounds(10, 5, 750, 45);
		panel_14.add(label);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 142, 840, 120);

		add(panel_7);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBounds(0, 0, 840, 20);
		panel_15.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_7.add(panel_15);

		final JxLabel n0300injectionsLabel_1 = new JxLabel();
		n0300injectionsLabel_1.setTheme(theme);
		n0300injectionsLabel_1.setBounds(35, 0, 120, 20);
		panel_15.add(n0300injectionsLabel_1);

		n0300injectionsLabel_1.setFontSize(12);
		n0300injectionsLabel_1.setFontStyle(Font.BOLD);
		n0300injectionsLabel_1.setText("N0350. Insulin");

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBounds(0, 20, 80, 100);
		panel_7.add(panel_8);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_8.setLayout(null);

		final JxComboBox comboBox_1 = new JxComboBox();
		comboBox_1.setTheme(theme);

		comboBox_1.setBounds(20, 20, 35, 23);
		panel_8.add(comboBox_1);

		final JxComboBox comboBox_2 = new JxComboBox();
		comboBox_2.setTheme(theme);

		comboBox_2.setBounds(20, 65, 35, 23);
		panel_8.add(comboBox_2);

		final JxLabel enterDaysLabel_1 = new JxLabel();
		enterDaysLabel_1.setTheme(theme);
		enterDaysLabel_1.setText("Enter Days ");
		enterDaysLabel_1.setBounds(10, 47, 70, 14);
		panel_8.add(enterDaysLabel_1);

		final JxLabel enterDaysLabel_2 = new JxLabel();
		enterDaysLabel_2.setTheme(theme);
		enterDaysLabel_2.setText("Enter Days ");
		enterDaysLabel_2.setBounds(10, 0, 70, 14);
		panel_8.add(enterDaysLabel_2);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBounds(80, 20, 760, 100);
		panel_7.add(panel_9);
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(0, 0, 760, 50);

		panel_9.add(panel_10);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1
				.setText("<html><body><b> A. Insulin injections -Record the number of days that insulin injections </b> were received during the last 7 days or since admission/<br> &nbsp &nbsp reenry if less than 7 days ");
		label_1.setBounds(10, 5, 750, 45);
		panel_10.add(label_1);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBounds(0, 50, 760, 50);

		panel_9.add(panel_11);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2.setBounds(10, 5, 750, 45);
		label_2
				.setText("<html><body><b> B. Order for insulin -Record the number of days the physician (or authorized assistant or practitioner)changed the resident's <br> &nbsp &nbsp insulin orders </b> during the last 7 days or since admission /reentry if less than 7 days");
		panel_11.add(label_2);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 262, 840, 240);

		add(panel_7_1);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBorder(new LineBorder(Color.black, 1, false));
		panel_16.setLayout(null);
		panel_16.setBounds(0, 0, 840, 20);
		panel_16.setBackground(ColorConstants.MDS_BACK_COLOR);
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
		panel_12.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_12.setLayout(null);

		final JxCheckBox checkBox = new JxCheckBox();
		checkBox.setTheme(theme);

		checkBox.setText("New JxCheckBox");
		checkBox.setBounds(30, 5, 15, 15);
		panel_12.add(checkBox);

		final JxCheckBox checkBox_1 = new JxCheckBox();
		checkBox_1.setTheme(theme);

		checkBox_1.setText("New JxCheckBox");
		checkBox_1.setBounds(30, 30, 15, 15);
		panel_12.add(checkBox_1);

		final JxCheckBox checkBox_2 = new JxCheckBox();
		checkBox_2.setTheme(theme);

		checkBox_2.setText("New JxCheckBox");
		checkBox_2.setBounds(30, 55, 15, 15);
		panel_12.add(checkBox_2);

		final JxCheckBox checkBox_3 = new JxCheckBox();
		checkBox_3.setTheme(theme);

		checkBox_3.setText("New JxCheckBox");
		checkBox_3.setBounds(30, 80, 15, 15);
		panel_12.add(checkBox_3);

		final JxCheckBox checkBox_4 = new JxCheckBox();
		checkBox_4.setTheme(theme);

		checkBox_4.setText("New JxCheckBox");
		checkBox_4.setBounds(30, 105, 15, 15);
		panel_12.add(checkBox_4);

		final JxCheckBox checkBox_5 = new JxCheckBox();
		checkBox_5.setTheme(theme);

		checkBox_5.setText("New JxCheckBox");
		checkBox_5.setBounds(30, 130, 15, 15);
		panel_12.add(checkBox_5);

		final JxCheckBox checkBox_6 = new JxCheckBox();
		checkBox_6.setTheme(theme);

		checkBox_6.setText("New JxCheckBox");
		checkBox_6.setBounds(30, 155, 15, 15);
		panel_12.add(checkBox_6);

		final JxCheckBox checkBox_7 = new JxCheckBox();
		checkBox_7.setTheme(theme);

		checkBox_7.setText("New JxCheckBox");
		checkBox_7.setBounds(30, 180, 15, 15);
		panel_12.add(checkBox_7);

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

		final JxLabel label_3_7 = new JxLabel();
		label_3_7.setTheme(theme);

		label_3_7.setFontSize(12);
		label_3_7.setFontStyle(Font.BOLD);
		label_3_7.setText("Z. None of the above were received");
		label_3_7.setBounds(10, 2, 386, 15);
		panel_13_8.add(label_3_7);
	}

}
