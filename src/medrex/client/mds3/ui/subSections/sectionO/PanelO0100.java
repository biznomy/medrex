package medrex.client.mds3.ui.subSections.sectionO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionO.Mds3SectionO;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelO0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4521069409975100313L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbO0100Z2;
	private JxCheckBox cbO0100Z1;
	private JxCheckBox cbO0100M2;
	private JxCheckBox cbO0100L2;
	private JxCheckBox cbO0100K2;
	private JxCheckBox cbO0100J2;
	private JxCheckBox cbO0100I2;
	private JxCheckBox cbO0100H2;
	private JxCheckBox cbO0100M1;
	private JxCheckBox cbO0100K1;
	private JxCheckBox cbO0100J1;
	private JxCheckBox cbO0100I1;
	private JxCheckBox cbO0100H1;
	private JxCheckBox cbO0100G2;
	private JxCheckBox cbO0100G1;
	private JxCheckBox cbO0100F2;
	private JxCheckBox cbO0100F1;
	private JxCheckBox cbO0100E2;
	private JxCheckBox cbO0100E1;
	private JxCheckBox cbO0100D2;
	private JxCheckBox cbO0100D1;
	private JxCheckBox cbO0100C2;
	private JxCheckBox cbO0100C1;
	private JxCheckBox cbO0100B2;
	private JxCheckBox cbO0100B1;
	private JxCheckBox cbO0100A2;
	private JxCheckBox cbO0100A1;

	public PanelO0100() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 604));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 604);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 50);
		panel.add(panel_1);

		final JxLabel o0100SpecialTreatmentsLabel = new JxLabel();
		o0100SpecialTreatmentsLabel.setTheme(theme);

		o0100SpecialTreatmentsLabel.setFontSize(12);
		o0100SpecialTreatmentsLabel.setFontStyle(Font.BOLD);
		o0100SpecialTreatmentsLabel
				.setText("O0100. Special Treatments, Procedures, and Programs");
		o0100SpecialTreatmentsLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		o0100SpecialTreatmentsLabel.setBounds(10, 7, 347, 14);
		panel_1.add(o0100SpecialTreatmentsLabel);

		final JxLabel checkAllLabel = new JxLabel();
		checkAllLabel.setTheme(theme);

		checkAllLabel.setFontSize(12);
		checkAllLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		checkAllLabel
				.setText("<html><body> Check all of the following treatments, procedures, and programs that were performed during the last <b> 14 days </b>");
		checkAllLabel.setBounds(10, 27, 618, 14);
		panel_1.add(checkAllLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);

		panel_5.setLayout(null);
		panel_5.setBounds(0, 49, Mds3Constants.PAGE_WIDTH, 106);
		panel.add(panel_5);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 641, 106);
		panel_5.add(panel_6);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setFontStyle(Font.BOLD);
		label.setText("1.   While NOT a Resident");
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label.setBounds(10, 10, 228, 14);
		panel_6.add(label);

		final JxLabel performedLabel = new JxLabel();
		performedLabel.setTheme(theme);

		performedLabel.setFontSize(12);
		performedLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		performedLabel
				.setText("<html><body> performed <b> <i> while NOT a residen t</i> </b> of this facility and within the <b> <i> last 14days. </i> </b> Only check column 1 if <br> resident entered (admission or reentry) IN THE LAST 14 DAYS. If resident last entered 14 or more days <br> ago, leave column 1 blank");
		performedLabel.setBounds(27, 26, 564, 42);
		panel_6.add(performedLabel);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_1
				.setText("<html><body><b> 2. &nbsp <i> While a resident </i> </b> <br> &nbsp &nbsp &nbsp Performed <b> while a resident </b> ot this facility and within the <b> <i>last 14 days</i></b>");
		label_1.setBounds(10, 74, 394, 32);
		panel_6.add(label_1);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_10.setLayout(null);

		panel_10.setBounds(640, 86, 200, 20);
		panel_5.add(panel_10);

		final JxLabel checkAllThatLabel = new JxLabel();
		checkAllThatLabel.setTheme(theme);

		checkAllThatLabel.setFontSize(12);
		checkAllThatLabel.setFontStyle(Font.BOLD);
		checkAllThatLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(42, 4, 127, 14);
		panel_10.add(checkAllThatLabel);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBounds(640, 0, 200, 87);
		panel_5.add(panel_7);

		panel_7.setLayout(null);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_8.setBounds(0, 0, 100, 87);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		panel_8.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);

		final JxLabel nbspnbsp1Label = new JxLabel();
		nbspnbsp1Label.setTheme(theme);

		nbspnbsp1Label.setFontSize(12);
		nbspnbsp1Label
				.setText("<html><body>&nbsp &nbsp &nbsp &nbsp &nbsp<b> 1. <br> While NOT a</b> <br> &nbsp <b> Resident </b>");
		nbspnbsp1Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		nbspnbsp1Label.setBounds(13, 20, 70, 54);
		panel_8.add(nbspnbsp1Label);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9.setBounds(99, 0, 101, 87);
		panel_7.add(panel_9);
		panel_9.setLayout(null);
		panel_9.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);

		final JxLabel nbspnbspLabel = new JxLabel();
		nbspnbspLabel.setTheme(theme);

		nbspnbspLabel.setFontSize(12);
		nbspnbsp1Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		nbspnbspLabel
				.setText("<html><body> &nbsp &nbsp &nbsp <b> 2. </b><br>  &nbsp <b> While a <br> Resident </b>");
		nbspnbspLabel.setBounds(20, 20, 66, 57);
		panel_9.add(nbspnbspLabel);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setLayout(null);

		panel_11.setBounds(0, 155, Mds3Constants.PAGE_WIDTH, 70);
		panel.add(panel_11);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_12.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 21);
		panel_11.add(panel_12);

		final JxLabel cancerTreatmentsLabel = new JxLabel();
		cancerTreatmentsLabel.setTheme(theme);

		cancerTreatmentsLabel.setFontSize(12);
		cancerTreatmentsLabel.setFontStyle(Font.BOLD);
		cancerTreatmentsLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		cancerTreatmentsLabel.setText("Cancer Treatments");
		cancerTreatmentsLabel.setBounds(10, 4, 288, 14);
		panel_12.add(cancerTreatmentsLabel);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_13.setLayout(null);

		panel_13.setBounds(0, 20, 641, 25);
		panel_11.add(panel_13);

		final JxLabel aChemotherapyLabel = new JxLabel();
		aChemotherapyLabel.setTheme(theme);

		aChemotherapyLabel.setFontSize(12);
		aChemotherapyLabel.setFontStyle(Font.BOLD);
		aChemotherapyLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aChemotherapyLabel.setText("A.  Chemotherapy");
		aChemotherapyLabel.setBounds(10, 7, 187, 14);
		panel_13.add(aChemotherapyLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);

		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_14.setBounds(0, 44, 641, 26);
		panel_11.add(panel_14);

		final JxLabel bRadiationLabel = new JxLabel();
		bRadiationLabel.setTheme(theme);

		bRadiationLabel.setFontSize(12);
		bRadiationLabel.setFontStyle(Font.BOLD);
		bRadiationLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bRadiationLabel.setText("B.  Radiation");
		bRadiationLabel.setBounds(10, 7, 146, 14);
		panel_14.add(bRadiationLabel);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_15.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_15.setLayout(null);
		panel_15.setBounds(640, 20, 100, 50);
		panel_11.add(panel_15);

		cbO0100A1 = new JxCheckBox();
		cbO0100A1.setTheme(theme);

		cbO0100A1.setText("New JxCheckBox");
		cbO0100A1.setBounds(40, 5, 17, 17);
		panel_15.add(cbO0100A1);

		cbO0100B1 = new JxCheckBox();
		cbO0100B1.setTheme(theme);

		cbO0100B1.setText("New JxCheckBox");
		cbO0100B1.setBounds(40, 28, 17, 17);
		panel_15.add(cbO0100B1);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_16.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_16.setLayout(null);
		panel_16.setBounds(739, 20, 101, 50);
		panel_11.add(panel_16);

		cbO0100A2 = new JxCheckBox();
		cbO0100A2.setTheme(theme);

		cbO0100A2.setText("New JxCheckBox");
		cbO0100A2.setBounds(40, 5, 17, 17);
		panel_16.add(cbO0100A2);

		cbO0100B2 = new JxCheckBox();
		cbO0100B2.setTheme(theme);

		cbO0100B2.setText("New JxCheckBox");
		cbO0100B2.setBounds(40, 28, 17, 17);
		panel_16.add(cbO0100B2);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);

		panel_17.setLayout(null);
		panel_17.setBounds(0, 224, Mds3Constants.PAGE_WIDTH, 145);
		panel.add(panel_17);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		panel_18.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_18.setLayout(null);
		panel_18.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_18.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 21);
		panel_17.add(panel_18);

		final JxLabel respiratoryTreatmentsLabel = new JxLabel();
		respiratoryTreatmentsLabel.setTheme(theme);

		respiratoryTreatmentsLabel.setFontSize(12);
		respiratoryTreatmentsLabel.setFontStyle(Font.BOLD);
		respiratoryTreatmentsLabel.setText("Respiratory Treatments");
		respiratoryTreatmentsLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		respiratoryTreatmentsLabel.setBounds(10, 4, 271, 14);
		panel_18.add(respiratoryTreatmentsLabel);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_19.setLayout(null);
		panel_19.setBounds(0, 20, 641, 26);
		panel_17.add(panel_19);

		final JxLabel cOxygenTherapyLabel = new JxLabel();
		cOxygenTherapyLabel.setTheme(theme);

		cOxygenTherapyLabel.setFontSize(12);
		cOxygenTherapyLabel.setFontStyle(Font.BOLD);
		cOxygenTherapyLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		cOxygenTherapyLabel.setText("C.  Oxygen therapy");
		cOxygenTherapyLabel.setBounds(10, 7, 193, 14);
		panel_19.add(cOxygenTherapyLabel);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);
		panel_20.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_20.setLayout(null);

		panel_20.setBounds(0, 45, 641, 26);
		panel_17.add(panel_20);

		final JxLabel dSuctioningLabel = new JxLabel();
		dSuctioningLabel.setTheme(theme);

		dSuctioningLabel.setFontSize(12);
		dSuctioningLabel.setFontStyle(Font.BOLD);
		dSuctioningLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dSuctioningLabel.setText("D.  Suctioning");
		dSuctioningLabel.setBounds(10, 7, 158, 14);
		panel_20.add(dSuctioningLabel);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);
		panel_21.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_21.setLayout(null);

		panel_21.setBounds(0, 70, 641, 26);
		panel_17.add(panel_21);

		final JxLabel eTracheostomyCareLabel = new JxLabel();
		eTracheostomyCareLabel.setTheme(theme);

		eTracheostomyCareLabel.setFontSize(12);
		eTracheostomyCareLabel.setFontStyle(Font.BOLD);
		eTracheostomyCareLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		eTracheostomyCareLabel.setText("E.  Tracheostomy care");
		eTracheostomyCareLabel.setBounds(10, 7, 246, 14);
		panel_21.add(eTracheostomyCareLabel);

		final JxPanel panel_22 = new JxPanel();
		panel_22.setTheme(theme);
		panel_22.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_22.setLayout(null);

		panel_22.setBounds(0, 95, 641, 26);
		panel_17.add(panel_22);

		final JxLabel fVentilatorOrLabel = new JxLabel();
		fVentilatorOrLabel.setTheme(theme);

		fVentilatorOrLabel.setFontSize(12);
		fVentilatorOrLabel.setFontStyle(Font.BOLD);
		fVentilatorOrLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		fVentilatorOrLabel.setText("F.  Ventilator or respirator");
		fVentilatorOrLabel.setBounds(10, 7, 214, 14);
		panel_22.add(fVentilatorOrLabel);

		final JxPanel panel_23 = new JxPanel();
		panel_23.setTheme(theme);
		panel_23.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_23.setLayout(null);

		panel_23.setBounds(0, 120, 641, 25);
		panel_17.add(panel_23);

		final JxLabel gBipapcpapLabel = new JxLabel();
		gBipapcpapLabel.setTheme(theme);

		gBipapcpapLabel.setFontSize(12);
		gBipapcpapLabel.setFontStyle(Font.BOLD);
		gBipapcpapLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		gBipapcpapLabel.setText("G.  BiPAP/CPAP");
		gBipapcpapLabel.setBounds(10, 7, 232, 14);
		panel_23.add(gBipapcpapLabel);

		final JxPanel panel_24 = new JxPanel();
		panel_24.setTheme(theme);
		panel_24.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_24.setLayout(null);
		panel_24.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_24.setBounds(640, 20, 101, 125);
		panel_17.add(panel_24);

		cbO0100C1 = new JxCheckBox();
		cbO0100C1.setTheme(theme);

		cbO0100C1.setText("New JxCheckBox");
		cbO0100C1.setBounds(40, 5, 17, 17);
		panel_24.add(cbO0100C1);

		cbO0100D1 = new JxCheckBox();
		cbO0100D1.setTheme(theme);

		cbO0100D1.setText("New JxCheckBox");
		cbO0100D1.setBounds(40, 28, 17, 17);
		panel_24.add(cbO0100D1);

		cbO0100E1 = new JxCheckBox();
		cbO0100E1.setTheme(theme);

		cbO0100E1.setText("New JxCheckBox");
		cbO0100E1.setBounds(40, 54, 17, 17);
		panel_24.add(cbO0100E1);

		cbO0100F1 = new JxCheckBox();
		cbO0100F1.setTheme(theme);

		cbO0100F1.setText("New JxCheckBox");
		cbO0100F1.setBounds(40, 77, 17, 17);
		panel_24.add(cbO0100F1);

		cbO0100G1 = new JxCheckBox();
		cbO0100G1.setTheme(theme);

		cbO0100G1.setText("New JxCheckBox");
		cbO0100G1.setBounds(40, 102, 17, 17);
		panel_24.add(cbO0100G1);

		final JxPanel panel_25 = new JxPanel();
		panel_25.setTheme(theme);
		panel_25.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_25.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_25.setLayout(null);
		panel_25.setBounds(740, 20, 100, 125);
		panel_17.add(panel_25);

		cbO0100C2 = new JxCheckBox();
		cbO0100C2.setTheme(theme);

		cbO0100C2.setText("New JxCheckBox");
		cbO0100C2.setBounds(40, 5, 17, 17);
		panel_25.add(cbO0100C2);

		cbO0100D2 = new JxCheckBox();
		cbO0100D2.setTheme(theme);

		cbO0100D2.setText("New JxCheckBox");
		cbO0100D2.setBounds(40, 28, 17, 17);
		panel_25.add(cbO0100D2);

		cbO0100E2 = new JxCheckBox();
		cbO0100E2.setTheme(theme);

		cbO0100E2.setText("New JxCheckBox");
		cbO0100E2.setBounds(40, 54, 17, 17);
		panel_25.add(cbO0100E2);

		cbO0100F2 = new JxCheckBox();
		cbO0100F2.setTheme(theme);

		cbO0100F2.setText("New JxCheckBox");
		cbO0100F2.setBounds(40, 77, 17, 17);
		panel_25.add(cbO0100F2);

		cbO0100G2 = new JxCheckBox();
		cbO0100G2.setTheme(theme);

		cbO0100G2.setText("New JxCheckBox");
		cbO0100G2.setBounds(40, 102, 17, 17);
		panel_25.add(cbO0100G2);

		final JxPanel panel_26 = new JxPanel();
		panel_26.setTheme(theme);
		panel_26.setLayout(null);
		panel_26.setBounds(0, 369, Mds3Constants.PAGE_WIDTH, 190);
		panel.add(panel_26);

		final JxPanel panel_27 = new JxPanel();
		panel_27.setTheme(theme);
		panel_27.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_27.setLayout(null);
		panel_27.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_27.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 21);
		panel_26.add(panel_27);

		final JxLabel otherLabel = new JxLabel();
		otherLabel.setTheme(theme);

		otherLabel.setFontSize(12);
		otherLabel.setFontStyle(Font.BOLD);
		otherLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		otherLabel.setText("Other");
		otherLabel.setBounds(10, 4, 54, 14);
		panel_27.add(otherLabel);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme(theme);

		panel_28.setFontSize(12);
		panel_28.setLayout(null);

		panel_28.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_28.setBounds(0, 20, 641, 26);
		panel_26.add(panel_28);

		final JxLabel hIvMedicationLabel = new JxLabel();
		hIvMedicationLabel.setTheme(theme);

		hIvMedicationLabel.setFontSize(12);
		hIvMedicationLabel.setFontStyle(Font.BOLD);
		hIvMedicationLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		hIvMedicationLabel.setText("H.  IV medication");
		hIvMedicationLabel.setBounds(10, 7, 183, 14);
		panel_28.add(hIvMedicationLabel);

		final JxPanel panel_29 = new JxPanel();
		panel_29.setTheme(theme);

		panel_29.setLayout(null);
		panel_29.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_29.setBounds(0, 45, 641, 26);
		panel_26.add(panel_29);

		final JxLabel iTransfusionsLabel = new JxLabel();
		iTransfusionsLabel.setTheme(theme);

		iTransfusionsLabel.setFontSize(12);
		iTransfusionsLabel.setFontStyle(Font.BOLD);
		iTransfusionsLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		iTransfusionsLabel.setText("I.  Transfusions");
		iTransfusionsLabel.setBounds(12, 7, 260, 14);
		panel_29.add(iTransfusionsLabel);

		final JxPanel panel_30 = new JxPanel();
		panel_30.setTheme(theme);
		panel_30.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_30.setLayout(null);

		panel_30.setBounds(0, 70, 641, 26);
		panel_26.add(panel_30);

		final JxLabel jDialysisLabel = new JxLabel();
		jDialysisLabel.setTheme(theme);

		jDialysisLabel.setFontSize(12);
		jDialysisLabel.setFontStyle(Font.BOLD);
		jDialysisLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		jDialysisLabel.setText("J.  Dialysis");
		jDialysisLabel.setBounds(10, 7, 261, 14);
		panel_30.add(jDialysisLabel);

		final JxPanel panel_31 = new JxPanel();
		panel_31.setTheme(theme);
		panel_31.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_31.setLayout(null);

		panel_31.setBounds(0, 95, 641, 26);
		panel_26.add(panel_31);

		final JxLabel kHospiceCareLabel = new JxLabel();
		kHospiceCareLabel.setTheme(theme);

		kHospiceCareLabel.setFontSize(12);
		kHospiceCareLabel.setFontStyle(Font.BOLD);
		kHospiceCareLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		kHospiceCareLabel.setText("K.  Hospice care");
		kHospiceCareLabel.setBounds(10, 7, 231, 14);
		panel_31.add(kHospiceCareLabel);

		final JxPanel panel_32 = new JxPanel();
		panel_32.setTheme(theme);
		panel_32.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_32.setLayout(null);

		panel_32.setBounds(0, 120, 641, 26);
		panel_26.add(panel_32);

		final JxLabel lRespiteCareLabel = new JxLabel();
		lRespiteCareLabel.setTheme(theme);

		lRespiteCareLabel.setFontSize(12);
		lRespiteCareLabel.setFontStyle(Font.BOLD);
		lRespiteCareLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		lRespiteCareLabel.setText("L.  Respite care");
		lRespiteCareLabel.setBounds(10, 7, 192, 14);
		panel_32.add(lRespiteCareLabel);

		final JxPanel panel_33 = new JxPanel();
		panel_33.setTheme(theme);
		panel_33.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_33.setLayout(null);

		panel_33.setBounds(0, 145, 641, 45);
		panel_26.add(panel_33);

		final JxLabel mIsolationLabel = new JxLabel();
		mIsolationLabel.setTheme(theme);

		mIsolationLabel.setFontSize(12);
		mIsolationLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		mIsolationLabel
				.setText("<html><body><b> M. Isolation or quarantine for active infection disease </b> (does not include standard body/ fluid <br> &nbsp &nbsp &nbsp precautions )");
		mIsolationLabel.setBounds(10, 7, 533, 38);
		panel_33.add(mIsolationLabel);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_34.setLayout(null);
		panel_34.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_34.setBounds(640, 20, 101, 170);
		panel_26.add(panel_34);

		cbO0100H1 = new JxCheckBox();
		cbO0100H1.setTheme(theme);

		cbO0100H1.setText("New JxCheckBox");
		cbO0100H1.setBounds(40, 5, 17, 17);
		panel_34.add(cbO0100H1);

		cbO0100I1 = new JxCheckBox();
		cbO0100I1.setTheme(theme);

		cbO0100I1.setText("New JxCheckBox");
		cbO0100I1.setBounds(40, 28, 17, 17);
		panel_34.add(cbO0100I1);

		cbO0100J1 = new JxCheckBox();
		cbO0100J1.setTheme(theme);

		cbO0100J1.setText("New JxCheckBox");
		cbO0100J1.setBounds(40, 54, 17, 17);
		panel_34.add(cbO0100J1);

		cbO0100K1 = new JxCheckBox();
		cbO0100K1.setTheme(theme);

		cbO0100K1.setText("New JxCheckBox");
		cbO0100K1.setBounds(40, 77, 17, 17);
		panel_34.add(cbO0100K1);

		cbO0100M1 = new JxCheckBox();
		cbO0100M1.setTheme(theme);

		cbO0100M1.setText("New JxCheckBox");
		cbO0100M1.setBounds(40, 140, 17, 17);
		panel_34.add(cbO0100M1);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setLayout(null);
		panel_2.setBackground(Mds3Constants.BACKGROUND_DARKGRAY);
		panel_2.setBounds(0, 100, 101, 26);
		panel_34.add(panel_2);

		final JxPanel panel_35 = new JxPanel();
		panel_35.setTheme(theme);
		panel_35.setLayout(null);
		panel_35.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_35.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_35.setBounds(740, 20, 100, 170);
		panel_26.add(panel_35);

		cbO0100H2 = new JxCheckBox();
		cbO0100H2.setTheme(theme);

		cbO0100H2.setText("New JxCheckBox");
		cbO0100H2.setBounds(40, 5, 17, 17);
		panel_35.add(cbO0100H2);

		cbO0100I2 = new JxCheckBox();
		cbO0100I2.setTheme(theme);

		cbO0100I2.setText("New JxCheckBox");
		cbO0100I2.setBounds(40, 28, 17, 17);
		panel_35.add(cbO0100I2);

		cbO0100J2 = new JxCheckBox();
		cbO0100J2.setTheme(theme);

		cbO0100J2.setText("New JxCheckBox");
		cbO0100J2.setBounds(40, 54, 17, 17);
		panel_35.add(cbO0100J2);

		cbO0100K2 = new JxCheckBox();
		cbO0100K2.setTheme(theme);

		cbO0100K2.setText("New JxCheckBox");
		cbO0100K2.setBounds(40, 77, 17, 17);
		panel_35.add(cbO0100K2);

		cbO0100L2 = new JxCheckBox();
		cbO0100L2.setTheme(theme);

		cbO0100L2.setText("New JxCheckBox");
		cbO0100L2.setBounds(40, 104, 17, 17);
		panel_35.add(cbO0100L2);

		cbO0100M2 = new JxCheckBox();
		cbO0100M2.setTheme(theme);

		cbO0100M2.setText("New JxCheckBox");
		cbO0100M2.setBounds(40, 140, 17, 17);
		panel_35.add(cbO0100M2);

		final JxPanel panel_36 = new JxPanel();
		panel_36.setTheme(theme);
		panel_36.setLayout(null);

		panel_36.setBounds(0, 559, Mds3Constants.PAGE_WIDTH, 45);
		panel.add(panel_36);

		final JxPanel panel_37 = new JxPanel();
		panel_37.setTheme(theme);
		panel_37.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_37.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_37.setLayout(null);
		panel_37.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 21);
		panel_36.add(panel_37);

		final JxLabel noneOfTheLabel = new JxLabel();
		noneOfTheLabel.setTheme(theme);

		noneOfTheLabel.setFontSize(12);
		noneOfTheLabel.setFontStyle(Font.BOLD);
		noneOfTheLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		noneOfTheLabel.setText("None of the Above");
		noneOfTheLabel.setBounds(10, 4, 224, 14);
		panel_37.add(noneOfTheLabel);

		final JxPanel panel_38 = new JxPanel();
		panel_38.setTheme(theme);
		panel_38.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_38.setLayout(null);
		panel_38.setBounds(0, 20, 641, 25);
		panel_36.add(panel_38);

		final JxLabel zNoneOfLabel = new JxLabel();
		zNoneOfLabel.setTheme(theme);

		zNoneOfLabel.setFontSize(12);
		zNoneOfLabel.setFontStyle(Font.BOLD);
		zNoneOfLabel.setText("Z.  None of the above");
		zNoneOfLabel.setBounds(10, 7, 267, 14);
		panel_38.add(zNoneOfLabel);

		final JxPanel panel_39 = new JxPanel();
		panel_39.setTheme(theme);
		panel_39.setLayout(null);
		panel_39.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_39.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_39.setBounds(640, 20, 101, 25);
		panel_36.add(panel_39);

		cbO0100Z1 = new JxCheckBox();
		cbO0100Z1.setTheme(theme);

		cbO0100Z1.setText("New JxCheckBox");
		cbO0100Z1.setBounds(40, 5, 17, 17);
		panel_39.add(cbO0100Z1);

		final JxPanel panel_40 = new JxPanel();
		panel_40.setTheme(theme);
		panel_40.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_40.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_40.setLayout(null);
		panel_40.setBounds(740, 20, 100, 25);
		panel_36.add(panel_40);

		cbO0100Z2 = new JxCheckBox();
		cbO0100Z2.setTheme(theme);

		cbO0100Z2.setText("New JxCheckBox");
		cbO0100Z2.setBounds(40, 5, 17, 17);
		panel_40.add(cbO0100Z2);
		doUpdate();
	}

	@Override
	public void doSave() {

		Mds3SectionO mds3sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		mds3sectionO.setO0100A1(cbO0100A1.isSelected());
		mds3sectionO.setO0100A2(cbO0100A2.isSelected());
		mds3sectionO.setO0100B1(cbO0100B1.isSelected());
		mds3sectionO.setO0100B1(cbO0100B2.isSelected());
		mds3sectionO.setO0100C1(cbO0100C1.isSelected());
		mds3sectionO.setO0100C2(cbO0100C2.isSelected());
		mds3sectionO.setO0100D1(cbO0100D1.isSelected());
		mds3sectionO.setO0100D2(cbO0100D2.isSelected());
		mds3sectionO.setO0100E1(cbO0100E1.isSelected());
		mds3sectionO.setO0100E2(cbO0100E2.isSelected());
		mds3sectionO.setO0100F1(cbO0100F1.isSelected());
		mds3sectionO.setO0100F2(cbO0100F2.isSelected());
		mds3sectionO.setO0100G1(cbO0100G1.isSelected());
		mds3sectionO.setO0100G2(cbO0100G2.isSelected());
		mds3sectionO.setO0100H1(cbO0100H1.isSelected());
		mds3sectionO.setO0100H2(cbO0100H2.isSelected());
		mds3sectionO.setO0100I1(cbO0100I1.isSelected());
		mds3sectionO.setO0100I2(cbO0100I2.isSelected());
		mds3sectionO.setO0100J1(cbO0100J1.isSelected());
		mds3sectionO.setO0100J2(cbO0100J2.isSelected());
		mds3sectionO.setO0100K1(cbO0100K1.isSelected());
		mds3sectionO.setO0100K2(cbO0100K2.isSelected());
		mds3sectionO.setO0100L2(cbO0100L2.isSelected());
		mds3sectionO.setO0100M1(cbO0100M1.isSelected());
		mds3sectionO.setO0100M2(cbO0100M2.isSelected());
		mds3sectionO.setO0100Z1(cbO0100Z1.isSelected());
		mds3sectionO.setO0100Z2(cbO0100Z2.isSelected());
	}

	@Override
	public void doUpdate() {
		Mds3SectionO mds3sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		cbO0100A1.setSelected(mds3sectionO.isO0100A1());
		cbO0100A2.setSelected(mds3sectionO.isO0100A2());
		cbO0100B1.setSelected(mds3sectionO.isO0100B1());
		cbO0100B2.setSelected(mds3sectionO.isO0100B2());
		cbO0100C1.setSelected(mds3sectionO.isO0100C1());
		cbO0100C2.setSelected(mds3sectionO.isO0100C2());
		cbO0100D1.setSelected(mds3sectionO.isO0100D1());
		cbO0100D2.setSelected(mds3sectionO.isO0100D2());

		cbO0100E1.setSelected(mds3sectionO.isO0100E1());
		cbO0100E2.setSelected(mds3sectionO.isO0100E2());
		cbO0100F1.setSelected(mds3sectionO.isO0100F1());
		cbO0100F2.setSelected(mds3sectionO.isO0100F2());
		cbO0100G1.setSelected(mds3sectionO.isO0100G1());
		cbO0100G2.setSelected(mds3sectionO.isO0100G2());
		cbO0100H1.setSelected(mds3sectionO.isO0100H1());
		cbO0100H2.setSelected(mds3sectionO.isO0100H2());

		cbO0100I1.setSelected(mds3sectionO.isO0100I1());
		cbO0100I2.setSelected(mds3sectionO.isO0100I2());
		cbO0100J1.setSelected(mds3sectionO.isO0100J1());
		cbO0100J2.setSelected(mds3sectionO.isO0100J2());
		cbO0100K1.setSelected(mds3sectionO.isO0100K1());
		cbO0100K2.setSelected(mds3sectionO.isO0100K2());
		cbO0100L2.setSelected(mds3sectionO.isO0100L2());

		cbO0100M1.setSelected(mds3sectionO.isO0100M1());
		cbO0100M2.setSelected(mds3sectionO.isO0100M2());
		cbO0100Z1.setSelected(mds3sectionO.isO0100Z1());
		cbO0100Z2.setSelected(mds3sectionO.isO0100Z2());

	}

}
