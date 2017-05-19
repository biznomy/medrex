package medrex.client.mds3.ui.subSections.sectionV;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.sectionV.Mds3SectionV;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelV0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4915609024284382771L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcV0200B2;
	private JxDateChooser dcV0200B1;
	private JxCheckBox cbV0200B20;
	private JxCheckBox cbV0200B19;
	private JxCheckBox cbV0200B18;
	private JxCheckBox cbV0200B17;
	private JxCheckBox cbV0200B16;
	private JxCheckBox cbV0200B15;
	private JxCheckBox cbV0200B14;
	private JxCheckBox cbV0200B13;
	private JxCheckBox cbV0200B12;
	private JxCheckBox cbV0200B11;
	private JxCheckBox cbV0200B10;
	private JxCheckBox cbV0200B09;
	private JxCheckBox cbV0200B08;
	private JxCheckBox cbV0200B07;
	private JxCheckBox cbV0200B06;
	private JxCheckBox cbV0200B05;
	private JxCheckBox cbV0200B04;
	private JxCheckBox cbV0200B03;
	private JxCheckBox cbV0200B02;
	private JxCheckBox cbV0200B01;
	private JxCheckBox cbV0200A20;
	private JxCheckBox cbV0200A19;
	private JxCheckBox cbV0200A18;
	private JxCheckBox cbV0200A17;
	private JxCheckBox cbV0200A16;
	private JxCheckBox cbV0200A15;
	private JxCheckBox cbV0200A14;
	private JxCheckBox cbV0200A13;
	private JxCheckBox cbV0200A12;
	private JxCheckBox cbV0200A11;
	private JxCheckBox cbV0200A10;
	private JxCheckBox cbV0200A09;
	private JxCheckBox cbV0200A08;
	private JxCheckBox cbV0200A07;
	private JxCheckBox cbV0200A06;
	private JxCheckBox cbV0200A05;
	private JxCheckBox cbV0200A04;
	private JxCheckBox cbV0200A03;
	private JxCheckBox cbV0200A02;
	private JxCheckBox cbV0200A01;
	private JxPanel panel_48;

	public PanelV0200() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(840, 910));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel
				.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
						false));
		panel.setLayout(null);
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.setBounds(0, 0, 840, 31);
		add(panel);

		final JxLabel v0200CaasAndLabel = new JxLabel();
		v0200CaasAndLabel.setTheme(theme);

		v0200CaasAndLabel.setFontSize(12);
		v0200CaasAndLabel.setFontStyle(Font.BOLD);
		v0200CaasAndLabel.setText("V0200.  CAAs and Care Planning");
		v0200CaasAndLabel.setBounds(10, 10, 320, 14);
		panel.add(v0200CaasAndLabel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);

		panel_1.setBounds(0, 30, 840, 121);
		add(panel_1);

		final JxLabel label_20 = new JxLabel();
		label_20.setTheme(theme);

		label_20.setFontSize(12);
		label_20
				.setText("<html><body> 1. &nbsp Check column A if Care Area is triggered.");
		label_20.setBounds(10, 10, 565, 14);
		panel_1.add(label_20);

		final JxLabel label_21 = new JxLabel();
		label_21.setTheme(theme);

		label_21.setFontSize(12);
		label_21
				.setText("<html><body>2. &nbsp For each triggered Care Area, indicate whether a new care plan, care plan revision, or continuation of current care plan is necessary to address <br> &nbsp &nbsp &nbsp the problem(s) identified in your assessment ot the care area. The addressed in Care Plan column must be completed within &days of <br> &nbsp &nbsp &nbsp completing the RAI (MDS and CAA(s)). Check column B if the triggered care is addressed in the care plan.");
		label_21.setBounds(10, 28, 838, 46);
		panel_1.add(label_21);

		final JxLabel body3nbspIndicateLabel = new JxLabel();
		body3nbspIndicateLabel.setTheme(theme);

		body3nbspIndicateLabel.setFontSize(12);
		body3nbspIndicateLabel
				.setText("<html><body>3. &nbsp Indicate in the location and Date of CAA Information column where information related to the CAA can be found. CAA documentation should <br> &nbsp &nbsp &nbsp include information on the complicating factors, risks, and any referrals for this resident for this care area.");
		body3nbspIndicateLabel.setBounds(10, 80, 800, 30);
		panel_1.add(body3nbspIndicateLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_2.setLayout(null);
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_2.setBounds(0, 150, 840, 26);
		add(panel_2);

		final JxLabel aCaaResultsLabel = new JxLabel();
		aCaaResultsLabel.setTheme(theme);

		aCaaResultsLabel.setFontSize(12);
		aCaaResultsLabel.setFontStyle(Font.BOLD);
		aCaaResultsLabel.setText("A.  CAA Results");
		aCaaResultsLabel.setBounds(10, 7, 270, 14);
		panel_2.add(aCaaResultsLabel);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);

		panel_3.setBorder(new MatteBorder(0, 0, 0, 0,
				ColorConstants.MDS_FONT_COLOR));
		panel_3.setBounds(0, 175, 341, 585);
		add(panel_3);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);

		panel_7.setBounds(0, 0, 341, 76);
		panel_3.add(panel_7);

		final JxLabel careAreaLabel = new JxLabel();
		careAreaLabel.setTheme(theme);

		careAreaLabel.setFontSize(12);
		careAreaLabel.setFontStyle(Font.BOLD);
		careAreaLabel.setText("Care Area");
		careAreaLabel.setBounds(125, 29, 63, 24);
		panel_7.add(careAreaLabel);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_8.setLayout(null);

		panel_8.setBounds(0, 75, 341, 26);
		panel_3.add(panel_8);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setText("<html><body><b> 01. </b> &nbsp <b> Delirium </b>");
		label.setBounds(10, 5, 244, 14);
		panel_8.add(label);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9.setLayout(null);

		panel_9.setBounds(0, 100, 341, 26);
		panel_3.add(panel_9);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1
				.setText("<html><body><b> 02. </b> &nbsp <b> Cognitive Loss/Dementia </b>");
		label_1.setBounds(10, 5, 254, 14);
		panel_9.add(label_1);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);

		panel_10.setFontSize(12);
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setLayout(null);

		panel_10.setBounds(0, 125, 341, 26);
		panel_3.add(panel_10);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2
				.setText("<html><body><b> 03. </b> &nbsp <b> Visual Function </b>");
		label_2.setBounds(10, 5, 189, 14);
		panel_10.add(label_2);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11.setLayout(null);

		panel_11.setBounds(0, 150, 341, 26);
		panel_3.add(panel_11);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3
				.setText("<html><body><b> 04. </b> &nbsp <b> Communication </b>");
		label_3.setBounds(10, 5, 160, 14);
		panel_11.add(label_3);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_12.setLayout(null);

		panel_12.setBounds(0, 175, 341, 26);
		panel_3.add(panel_12);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4
				.setText("<html><body><b> 05. </b> &nbsp <b> ADL Functional/Rehabilitation Potential </b>");
		label_4.setBounds(10, 5, 308, 14);
		panel_12.add(label_4);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_13.setLayout(null);

		panel_13.setBounds(0, 200, 341, 36);
		panel_3.add(panel_13);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5
				.setText("<html><body><b> 06. </b> &nbsp <b> Urinary Incontinence and Indwelling </b> <br> &nbsp &nbsp &nbsp &nbsp <b> Catheter </b>");
		label_5.setBounds(10, 5, 294, 31);
		panel_13.add(label_5);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_14.setLayout(null);

		panel_14.setBounds(0, 235, 341, 26);
		panel_3.add(panel_14);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6
				.setText("<html><body><b> 07. </b> &nbsp <b> Psychosocial Well-Being</b>");
		label_6.setBounds(10, 5, 280, 14);
		panel_14.add(label_6);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setLayout(null);

		panel_15.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_15.setBounds(0, 260, 341, 26);
		panel_3.add(panel_15);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);

		label_7.setFontSize(12);
		label_7.setText("<html><body><b> 08. </b> &nbsp <b> Mood State </b>");
		label_7.setBounds(10, 5, 146, 14);
		panel_15.add(label_7);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_16.setLayout(null);

		panel_16.setBounds(0, 285, 341, 26);
		panel_3.add(panel_16);

		final JxLabel label_8 = new JxLabel();
		label_8.setTheme(theme);

		label_8.setFontSize(12);
		label_8
				.setText("<html><body><b> 09. </b> &nbsp <b> Behavioral Symptoms </b>");
		label_8.setBounds(10, 5, 264, 14);
		panel_16.add(label_8);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);
		panel_17.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_17.setLayout(null);

		panel_17.setBounds(0, 310, 341, 26);
		panel_3.add(panel_17);

		final JxLabel label_9 = new JxLabel();
		label_9.setTheme(theme);

		label_9.setFontSize(12);
		label_9.setText("<html><body><b> 10. </b> &nbsp <b> Activities </b>");
		label_9.setBounds(10, 5, 133, 14);
		panel_17.add(label_9);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		panel_18.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_18.setLayout(null);

		panel_18.setBounds(0, 335, 341, 26);
		panel_3.add(panel_18);

		final JxLabel label_10 = new JxLabel();
		label_10.setTheme(theme);

		label_10.setFontSize(12);
		label_10.setText("<html><body><b> 11. </b> &nbsp <b> Falls </b>");
		label_10.setBounds(10, 5, 174, 14);
		panel_18.add(label_10);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_19.setLayout(null);

		panel_19.setBounds(0, 360, 341, 26);
		panel_3.add(panel_19);

		final JxLabel label_11 = new JxLabel();
		label_11.setTheme(theme);

		label_11.setFontSize(12);
		label_11
				.setText("<html><body><b> 12. </b> &nbsp <b> Nutritional Status </b>");
		label_11.setBounds(10, 5, 188, 14);
		panel_19.add(label_11);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);
		panel_20.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_20.setLayout(null);

		panel_20.setBounds(0, 385, 341, 26);
		panel_3.add(panel_20);

		final JxLabel label_12 = new JxLabel();
		label_12.setTheme(theme);

		label_12.setFontSize(12);
		label_12
				.setText("<html><body><b> 13. </b> &nbsp <b> Feeding Tube </b>");
		label_12.setBounds(10, 5, 201, 14);
		panel_20.add(label_12);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);
		panel_21.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_21.setLayout(null);

		panel_21.setBounds(0, 410, 341, 26);
		panel_3.add(panel_21);

		final JxLabel label_13 = new JxLabel();
		label_13.setTheme(theme);

		label_13.setFontSize(13);
		label_13
				.setText("<html><body><b> 14. </b> &nbsp <b> Dehydration/Fluid Maintenance </b>");
		label_13.setBounds(10, 5, 241, 14);
		panel_21.add(label_13);

		final JxPanel panel_22 = new JxPanel();
		panel_22.setTheme(theme);
		panel_22.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_22.setLayout(null);

		panel_22.setBounds(0, 435, 341, 26);
		panel_3.add(panel_22);

		final JxLabel label_14 = new JxLabel();
		label_14.setTheme(theme);

		label_14.setFontSize(14);
		label_14.setText("<html><body><b> 15. </b> &nbsp <b> Dental Care </b>");
		label_14.setBounds(10, 5, 143, 14);
		panel_22.add(label_14);

		final JxPanel panel_23 = new JxPanel();
		panel_23.setTheme(theme);
		panel_23.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_23.setLayout(null);

		panel_23.setBounds(0, 460, 341, 26);
		panel_3.add(panel_23);

		final JxLabel label_15 = new JxLabel();
		label_15.setTheme(theme);

		label_15.setFontSize(12);
		label_15
				.setText("<html><body><b> 16. </b> &nbsp <b> Pressure Ulcer </b>");
		label_15.setBounds(10, 5, 149, 14);
		panel_23.add(label_15);

		final JxPanel panel_24 = new JxPanel();
		panel_24.setTheme(theme);
		panel_24.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_24.setLayout(null);

		panel_24.setBounds(0, 485, 341, 26);
		panel_3.add(panel_24);

		final JxLabel label_16 = new JxLabel();
		label_16.setTheme(theme);

		label_16.setFontSize(12);
		label_16
				.setText("<html><body><b> 17. </b> &nbsp <b> Psychotropic Drug Use </b>");
		label_16.setBounds(10, 5, 163, 14);
		panel_24.add(label_16);

		final JxPanel panel_25 = new JxPanel();
		panel_25.setTheme(theme);
		panel_25.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_25.setLayout(null);

		panel_25.setBounds(0, 510, 341, 26);
		panel_3.add(panel_25);

		final JxLabel label_17 = new JxLabel();
		label_17.setTheme(theme);

		label_17.setFontSize(12);
		label_17
				.setText("<html><body><b> 18. </b> &nbsp <b> Physical Restraints</b>");
		label_17.setBounds(10, 5, 194, 14);
		panel_25.add(label_17);

		final JxPanel panel_26 = new JxPanel();
		panel_26.setTheme(theme);
		panel_26.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_26.setLayout(null);

		panel_26.setBounds(0, 535, 341, 26);
		panel_3.add(panel_26);

		final JxLabel label_18 = new JxLabel();
		label_18.setTheme(theme);

		label_18.setFontSize(12);
		label_18.setText("<html><body><b> 19. </b> &nbsp <b> Pain</b>");
		label_18.setBounds(10, 5, 195, 14);
		panel_26.add(label_18);

		final JxPanel panel_27 = new JxPanel();
		panel_27.setTheme(theme);
		panel_27.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_27.setLayout(null);

		panel_27.setBounds(0, 560, 341, 25);
		panel_3.add(panel_27);

		final JxLabel label_19 = new JxLabel();
		label_19.setTheme(theme);

		label_19.setFontSize(12);
		label_19
				.setText("<html><body><b> 20. </b> &nbsp <b> Return to community Referral </b>");
		label_19.setBounds(10, 5, 225, 14);
		panel_27.add(label_19);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setLayout(null);

		panel_4.setBounds(340, 175, 81, 585);
		add(panel_4);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme(theme);
		panel_28.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_28.setLayout(null);
		panel_28.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_28.setBounds(0, 0, 81, 51);
		panel_4.add(panel_28);

		final JxLabel nbspnbspnbspLabel = new JxLabel();
		nbspnbspnbspLabel.setTheme(theme);
		nbspnbspnbspLabel
				.setText("<html><body>&nbsp &nbsp &nbsp <b> A. <br> Care Area <br> Triggered </b>");
		nbspnbspnbspLabel.setBounds(10, 5, 71, 46);
		panel_28.add(nbspnbspnbspLabel);

		final JxPanel panel_30 = new JxPanel();
		panel_30.setTheme(theme);
		panel_30.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_30.setLayout(null);

		panel_30.setBounds(0, 50, 81, 26);
		panel_4.add(panel_30);

		final JxPanel panel_32 = new JxPanel();
		panel_32.setTheme(theme);
		panel_32.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_32.setLayout(null);
		panel_32.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_32.setBounds(0, 75, 81, 26);
		panel_4.add(panel_32);

		cbV0200A01 = new JxCheckBox();
		cbV0200A01.setTheme(theme);

		cbV0200A01.setText("New JxCheckBox");
		cbV0200A01.setBounds(27, 5, 17, 20);
		panel_32.add(cbV0200A01);

		final JxPanel panel_33 = new JxPanel();
		panel_33.setTheme(theme);
		panel_33.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_33.setLayout(null);
		panel_33.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_33.setBounds(0, 100, 81, 26);
		panel_4.add(panel_33);

		cbV0200A02 = new JxCheckBox();
		cbV0200A02.setTheme(theme);

		cbV0200A02.setText("New JxCheckBox");
		cbV0200A02.setBounds(27, 5, 17, 20);
		panel_33.add(cbV0200A02);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_34.setLayout(null);
		panel_34.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_34.setBounds(0, 125, 81, 26);
		panel_4.add(panel_34);

		cbV0200A03 = new JxCheckBox();
		cbV0200A03.setTheme(theme);

		cbV0200A03.setText("New JxCheckBox");
		cbV0200A03.setBounds(27, 5, 17, 20);
		panel_34.add(cbV0200A03);

		final JxPanel panel_35 = new JxPanel();
		panel_35.setTheme(theme);
		panel_35.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_35.setLayout(null);
		panel_35.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_35.setBounds(0, 150, 81, 26);
		panel_4.add(panel_35);

		cbV0200A04 = new JxCheckBox();
		cbV0200A04.setTheme(theme);

		cbV0200A04.setText("New JxCheckBox");
		cbV0200A04.setBounds(27, 5, 17, 20);
		panel_35.add(cbV0200A04);

		final JxPanel panel_36 = new JxPanel();
		panel_36.setTheme(theme);
		panel_36.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_36.setLayout(null);
		panel_36.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_36.setBounds(0, 175, 81, 26);
		panel_4.add(panel_36);

		cbV0200A05 = new JxCheckBox();
		cbV0200A05.setTheme(theme);

		cbV0200A05.setText("New JxCheckBox");
		cbV0200A05.setBounds(27, 5, 17, 20);
		panel_36.add(cbV0200A05);

		final JxPanel panel_37 = new JxPanel();
		panel_37.setTheme(theme);
		panel_37.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_37.setLayout(null);
		panel_37.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_37.setBounds(0, 200, 81, 36);
		panel_4.add(panel_37);

		cbV0200A06 = new JxCheckBox();
		cbV0200A06.setTheme(theme);

		cbV0200A06.setText("New JxCheckBox");
		cbV0200A06.setBounds(27, 7, 17, 20);
		panel_37.add(cbV0200A06);

		final JxPanel panel_38 = new JxPanel();
		panel_38.setTheme(theme);
		panel_38.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_38.setLayout(null);
		panel_38.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_38.setBounds(0, 235, 81, 26);
		panel_4.add(panel_38);

		cbV0200A07 = new JxCheckBox();
		cbV0200A07.setTheme(theme);

		cbV0200A07.setText("New JxCheckBox");
		cbV0200A07.setBounds(27, 5, 17, 20);
		panel_38.add(cbV0200A07);

		final JxPanel panel_39 = new JxPanel();
		panel_39.setTheme(theme);
		panel_39.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_39.setLayout(null);
		panel_39.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_39.setBounds(0, 260, 81, 26);
		panel_4.add(panel_39);

		cbV0200A08 = new JxCheckBox();
		cbV0200A08.setTheme(theme);

		cbV0200A08.setText("New JxCheckBox");
		cbV0200A08.setBounds(27, 5, 17, 20);
		panel_39.add(cbV0200A08);

		final JxPanel panel_40 = new JxPanel();
		panel_40.setTheme(theme);
		panel_40.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_40.setLayout(null);
		panel_40.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_40.setBounds(0, 285, 81, 26);
		panel_4.add(panel_40);

		cbV0200A09 = new JxCheckBox();
		cbV0200A09.setTheme(theme);

		cbV0200A09.setText("New JxCheckBox");
		cbV0200A09.setBounds(27, 5, 17, 20);
		panel_40.add(cbV0200A09);

		final JxPanel panel_41 = new JxPanel();
		panel_41.setTheme(theme);
		panel_41.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_41.setLayout(null);
		panel_41.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_41.setBounds(0, 310, 81, 26);
		panel_4.add(panel_41);

		cbV0200A10 = new JxCheckBox();
		cbV0200A10.setTheme(theme);

		cbV0200A10.setText("New JxCheckBox");
		cbV0200A10.setBounds(27, 5, 17, 20);
		panel_41.add(cbV0200A10);

		final JxPanel panel_42 = new JxPanel();
		panel_42.setTheme(theme);
		panel_42.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_42.setLayout(null);
		panel_42.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_42.setBounds(0, 335, 81, 26);
		panel_4.add(panel_42);

		cbV0200A11 = new JxCheckBox();
		cbV0200A11.setTheme(theme);

		cbV0200A11.setText("New JxCheckBox");
		cbV0200A11.setBounds(27, 5, 17, 20);
		panel_42.add(cbV0200A11);

		final JxPanel panel_43 = new JxPanel();
		panel_43.setTheme(theme);
		panel_43.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_43.setLayout(null);
		panel_43.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_43.setBounds(0, 360, 81, 26);
		panel_4.add(panel_43);

		cbV0200A12 = new JxCheckBox();
		cbV0200A12.setTheme(theme);

		cbV0200A12.setText("New JxCheckBox");
		cbV0200A12.setBounds(27, 5, 17, 20);
		panel_43.add(cbV0200A12);

		final JxPanel panel_44 = new JxPanel();
		panel_44.setTheme(theme);
		panel_44.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_44.setLayout(null);
		panel_44.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_44.setBounds(0, 385, 81, 26);
		panel_4.add(panel_44);

		cbV0200A13 = new JxCheckBox();
		cbV0200A13.setTheme(theme);

		cbV0200A13.setText("New JxCheckBox");
		cbV0200A13.setBounds(27, 5, 17, 20);
		panel_44.add(cbV0200A13);

		final JxPanel panel_45 = new JxPanel();
		panel_45.setTheme(theme);
		panel_45.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_45.setLayout(null);
		panel_45.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_45.setBounds(0, 410, 81, 26);
		panel_4.add(panel_45);

		cbV0200A14 = new JxCheckBox();
		cbV0200A14.setTheme(theme);

		cbV0200A14.setText("New JxCheckBox");
		cbV0200A14.setBounds(27, 5, 17, 20);
		panel_45.add(cbV0200A14);

		final JxPanel panel_46 = new JxPanel();
		panel_46.setTheme(theme);
		panel_46.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_46.setLayout(null);
		panel_46.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_46.setBounds(0, 435, 81, 26);
		panel_4.add(panel_46);

		cbV0200A15 = new JxCheckBox();
		cbV0200A15.setTheme(theme);

		cbV0200A15.setBounds(27, 5, 17, 20);
		panel_46.add(cbV0200A15);
		cbV0200A15.setText("New JxCheckBox");

		final JxPanel panel_47 = new JxPanel();
		panel_47.setTheme(theme);
		panel_47.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_47.setLayout(null);
		panel_47.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_47.setBounds(0, 460, 81, 26);
		panel_4.add(panel_47);

		cbV0200A16 = new JxCheckBox();
		cbV0200A16.setTheme(theme);

		cbV0200A16.setText("New JxCheckBox");
		cbV0200A16.setBounds(27, 5, 17, 20);
		panel_47.add(cbV0200A16);

		panel_48 = new JxPanel();
		panel_48.setTheme(theme);
		panel_48.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_48.setLayout(null);
		panel_48.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_48.setBounds(0, 485, 81, 26);
		panel_4.add(panel_48);

		cbV0200A17 = new JxCheckBox();
		cbV0200A17.setTheme(theme);

		cbV0200A17.setText("New JxCheckBox");
		cbV0200A17.setBounds(27, 5, 17, 20);
		panel_48.add(cbV0200A17);

		final JxPanel panel_49 = new JxPanel();
		panel_49.setTheme(theme);
		panel_49.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_49.setLayout(null);
		panel_49.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_49.setBounds(0, 510, 81, 26);
		panel_4.add(panel_49);

		cbV0200A18 = new JxCheckBox();
		cbV0200A18.setTheme(theme);

		cbV0200A18.setText("New JxCheckBox");
		cbV0200A18.setBounds(27, 5, 17, 20);
		panel_49.add(cbV0200A18);

		final JxPanel panel_50 = new JxPanel();
		panel_50.setTheme(theme);
		panel_50.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_50.setLayout(null);
		panel_50.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_50.setBounds(0, 535, 81, 26);
		panel_4.add(panel_50);

		cbV0200A19 = new JxCheckBox();
		cbV0200A19.setTheme(theme);

		cbV0200A19.setText("New JxCheckBox");
		cbV0200A19.setBounds(27, 5, 17, 20);
		panel_50.add(cbV0200A19);

		final JxPanel panel_51 = new JxPanel();
		panel_51.setTheme(theme);
		panel_51.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_51.setLayout(null);
		panel_51.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_51.setBounds(0, 560, 81, 25);
		panel_4.add(panel_51);

		cbV0200A20 = new JxCheckBox();
		cbV0200A20.setTheme(theme);

		cbV0200A20.setText("New JxCheckBox");
		cbV0200A20.setBounds(27, 5, 17, 20);
		panel_51.add(cbV0200A20);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setLayout(null);

		panel_5.setBounds(420, 175, 81, 585);
		add(panel_5);

		final JxPanel panel_29 = new JxPanel();
		panel_29.setTheme(theme);
		panel_29.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_29.setLayout(null);
		panel_29.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_29.setBounds(0, 0, 81, 51);
		panel_5.add(panel_29);

		final JxLabel nbspnbspnbspLabel_1 = new JxLabel();
		nbspnbspnbspLabel_1.setTheme(theme);
		nbspnbspnbspLabel_1
				.setText("<html><body>&nbsp &nbsp &nbsp  &nbsp <b> B. <br>  Addressed in</b> <br> &nbsp  <b>Care Plan</b>");
		nbspnbspnbspLabel_1.setBounds(5, 5, 76, 45);
		panel_29.add(nbspnbspnbspLabel_1);

		final JxPanel panel_31 = new JxPanel();
		panel_31.setTheme(theme);
		panel_31.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_31.setLayout(null);

		panel_31.setBounds(0, 50, 81, 26);
		panel_5.add(panel_31);

		final JxPanel panel_73 = new JxPanel();
		panel_73.setTheme(theme);
		panel_73.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_73.setLayout(null);
		panel_73.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_73.setBounds(0, 75, 81, 26);
		panel_5.add(panel_73);

		cbV0200B01 = new JxCheckBox();
		cbV0200B01.setTheme(theme);

		cbV0200B01.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		cbV0200B01.setText("New JxCheckBox");
		cbV0200B01.setBounds(27, 5, 17, 20);
		panel_73.add(cbV0200B01);

		final JxPanel panel_74 = new JxPanel();
		panel_74.setTheme(theme);
		panel_74.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_74.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_74.setLayout(null);
		panel_74.setBounds(0, 100, 81, 26);
		panel_5.add(panel_74);

		cbV0200B02 = new JxCheckBox();
		cbV0200B02.setTheme(theme);

		cbV0200B02.setText("New JxCheckBox");
		cbV0200B02.setBounds(27, 5, 17, 20);
		panel_74.add(cbV0200B02);

		final JxPanel panel_75 = new JxPanel();
		panel_75.setTheme(theme);
		panel_75.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_75.setLayout(null);
		panel_75.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_75.setBounds(0, 125, 81, 26);
		panel_5.add(panel_75);

		cbV0200B03 = new JxCheckBox();
		cbV0200B03.setTheme(theme);

		cbV0200B03.setText("New JxCheckBox");
		cbV0200B03.setBounds(27, 5, 17, 20);
		panel_75.add(cbV0200B03);

		final JxPanel panel_76 = new JxPanel();
		panel_76.setTheme(theme);
		panel_76.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_76.setLayout(null);
		panel_76.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_76.setBounds(0, 150, 81, 26);
		panel_5.add(panel_76);

		cbV0200B04 = new JxCheckBox();
		cbV0200B04.setTheme(theme);

		cbV0200B04.setText("New JxCheckBox");
		cbV0200B04.setBounds(27, 5, 17, 20);
		panel_76.add(cbV0200B04);

		final JxPanel panel_77 = new JxPanel();
		panel_77.setTheme(theme);
		panel_77.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_77.setLayout(null);
		panel_77.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_77.setBounds(0, 175, 81, 26);
		panel_5.add(panel_77);

		cbV0200B05 = new JxCheckBox();
		cbV0200B05.setTheme(theme);

		cbV0200B05.setText("New JxCheckBox");
		cbV0200B05.setBounds(27, 5, 17, 20);
		panel_77.add(cbV0200B05);

		final JxPanel panel_78 = new JxPanel();
		panel_78.setTheme(theme);
		panel_78.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_78.setLayout(null);
		panel_78.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_78.setBounds(0, 200, 81, 36);
		panel_5.add(panel_78);

		cbV0200B06 = new JxCheckBox();
		cbV0200B06.setTheme(theme);

		cbV0200B06.setText("New JxCheckBox");
		cbV0200B06.setBounds(27, 8, 17, 20);
		panel_78.add(cbV0200B06);

		final JxPanel panel_79 = new JxPanel();
		panel_79.setTheme(theme);
		panel_79.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_79.setLayout(null);
		panel_79.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_79.setBounds(0, 235, 81, 26);
		panel_5.add(panel_79);

		cbV0200B07 = new JxCheckBox();
		cbV0200B07.setTheme(theme);

		cbV0200B07.setText("New JxCheckBox");
		cbV0200B07.setBounds(27, 5, 17, 20);
		panel_79.add(cbV0200B07);

		final JxPanel panel_80 = new JxPanel();
		panel_80.setTheme(theme);
		panel_80.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_80.setLayout(null);
		panel_80.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_80.setBounds(0, 260, 81, 26);
		panel_5.add(panel_80);

		cbV0200B08 = new JxCheckBox();
		cbV0200B08.setTheme(theme);

		cbV0200B08.setText("New JxCheckBox");
		cbV0200B08.setBounds(27, 5, 17, 20);
		panel_80.add(cbV0200B08);

		final JxPanel panel_81 = new JxPanel();
		panel_81.setTheme(theme);
		panel_81.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_81.setLayout(null);
		panel_81.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_81.setBounds(0, 285, 81, 26);
		panel_5.add(panel_81);

		cbV0200B09 = new JxCheckBox();
		cbV0200B09.setTheme(theme);

		cbV0200B09.setText("New JxCheckBox");
		cbV0200B09.setBounds(27, 5, 17, 20);
		panel_81.add(cbV0200B09);

		final JxPanel panel_82 = new JxPanel();
		panel_82.setTheme(theme);
		panel_82.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_82.setLayout(null);
		panel_82.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_82.setBounds(0, 310, 81, 26);
		panel_5.add(panel_82);

		cbV0200B10 = new JxCheckBox();
		cbV0200B10.setTheme(theme);

		cbV0200B10.setText("New JxCheckBox");
		cbV0200B10.setBounds(27, 5, 17, 20);
		panel_82.add(cbV0200B10);

		final JxPanel panel_83 = new JxPanel();
		panel_83.setTheme(theme);
		panel_83.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_83.setLayout(null);
		panel_83.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_83.setBounds(0, 335, 81, 26);
		panel_5.add(panel_83);

		cbV0200B11 = new JxCheckBox();
		cbV0200B11.setTheme(theme);

		cbV0200B11.setText("New JxCheckBox");
		cbV0200B11.setBounds(27, 5, 17, 20);
		panel_83.add(cbV0200B11);

		final JxPanel panel_84 = new JxPanel();
		panel_84.setTheme(theme);
		panel_84.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_84.setLayout(null);
		panel_84.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_84.setBounds(0, 360, 81, 26);
		panel_5.add(panel_84);

		cbV0200B12 = new JxCheckBox();
		cbV0200B12.setTheme(theme);

		cbV0200B12.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		cbV0200B12.setText("New JxCheckBox");
		cbV0200B12.setBounds(27, 5, 17, 20);
		panel_84.add(cbV0200B12);

		final JxPanel panel_85 = new JxPanel();
		panel_85.setTheme(theme);
		panel_85.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_85.setLayout(null);
		panel_85.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_85.setBounds(0, 385, 81, 26);
		panel_5.add(panel_85);

		cbV0200B13 = new JxCheckBox();
		cbV0200B13.setTheme(theme);

		cbV0200B13.setText("New JxCheckBox");
		cbV0200B13.setBounds(27, 5, 17, 20);
		panel_85.add(cbV0200B13);

		final JxPanel panel_86 = new JxPanel();
		panel_86.setTheme(theme);
		panel_86.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_86.setLayout(null);
		panel_86.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_86.setBounds(0, 410, 81, 26);
		panel_5.add(panel_86);

		cbV0200B14 = new JxCheckBox();
		cbV0200B14.setTheme(theme);

		cbV0200B14.setText("New JxCheckBox");
		cbV0200B14.setBounds(27, 5, 17, 20);
		panel_86.add(cbV0200B14);

		final JxPanel panel_87 = new JxPanel();
		panel_87.setTheme(theme);
		panel_87.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_87.setLayout(null);
		panel_87.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_87.setBounds(0, 435, 81, 26);
		panel_5.add(panel_87);

		cbV0200B15 = new JxCheckBox();
		cbV0200B15.setTheme(theme);

		cbV0200B15.setText("New JxCheckBox");
		cbV0200B15.setBounds(27, 5, 17, 20);
		panel_87.add(cbV0200B15);

		final JxPanel panel_88 = new JxPanel();
		panel_88.setTheme(theme);
		panel_88.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_88.setLayout(null);
		panel_88.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_88.setBounds(0, 460, 81, 26);
		panel_5.add(panel_88);

		cbV0200B16 = new JxCheckBox();
		cbV0200B16.setTheme(theme);

		cbV0200B16.setText("New JxCheckBox");
		cbV0200B16.setBounds(27, 5, 17, 20);
		panel_88.add(cbV0200B16);

		final JxPanel panel_89 = new JxPanel();
		panel_89.setTheme(theme);
		panel_89.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_89.setLayout(null);
		panel_89.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_89.setBounds(0, 485, 81, 26);
		panel_5.add(panel_89);

		cbV0200B17 = new JxCheckBox();
		cbV0200B17.setTheme(theme);

		cbV0200B17.setText("New JxCheckBox");
		cbV0200B17.setBounds(27, 5, 17, 20);
		panel_89.add(cbV0200B17);

		final JxPanel panel_90 = new JxPanel();
		panel_90.setTheme(theme);
		panel_90.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_90.setLayout(null);
		panel_90.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_90.setBounds(0, 510, 81, 26);
		panel_5.add(panel_90);

		cbV0200B18 = new JxCheckBox();
		cbV0200B18.setTheme(theme);

		cbV0200B18.setText("New JxCheckBox");
		cbV0200B18.setBounds(27, 5, 17, 20);
		panel_90.add(cbV0200B18);

		final JxPanel panel_91 = new JxPanel();
		panel_91.setTheme(theme);
		panel_91.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_91.setLayout(null);
		panel_91.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_91.setBounds(0, 535, 81, 26);
		panel_5.add(panel_91);

		cbV0200B19 = new JxCheckBox();
		cbV0200B19.setTheme(theme);

		cbV0200B19.setText("New JxCheckBox");
		cbV0200B19.setBounds(27, 5, 17, 20);
		panel_91.add(cbV0200B19);

		final JxPanel panel_92 = new JxPanel();
		panel_92.setTheme(theme);
		panel_92.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_92.setLayout(null);
		panel_92.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_92.setBounds(0, 560, 81, 25);
		panel_5.add(panel_92);

		cbV0200B20 = new JxCheckBox();
		cbV0200B20.setTheme(theme);

		cbV0200B20.setText("New JxCheckBox");
		cbV0200B20.setBounds(27, 5, 17, 20);
		panel_92.add(cbV0200B20);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);

		panel_6.setBounds(500, 175, 340, 585);
		add(panel_6);

		final JxPanel panel_52 = new JxPanel();
		panel_52.setTheme(theme);
		panel_52.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_52.setLayout(null);
		panel_52.setBounds(0, 0, 340, 76);
		panel_6.add(panel_52);

		final JxLabel locationAndDateLabel = new JxLabel();
		locationAndDateLabel.setTheme(theme);

		locationAndDateLabel.setFontSize(12);
		locationAndDateLabel.setFontStyle(Font.BOLD);
		locationAndDateLabel.setText("Location and Date of CAA Information");
		locationAndDateLabel.setBounds(55, 31, 231, 16);
		panel_52.add(locationAndDateLabel);

		final JxPanel panel_53 = new JxPanel();
		panel_53.setTheme(theme);
		panel_53.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_53.setLayout(null);

		panel_53.setBounds(0, 75, 340, 26);
		panel_6.add(panel_53);

		final JxPanel panel_54 = new JxPanel();
		panel_54.setTheme(theme);
		panel_54.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_54.setLayout(null);

		panel_54.setBounds(0, 100, 340, 26);
		panel_6.add(panel_54);

		final JxPanel panel_55 = new JxPanel();
		panel_55.setTheme(theme);
		panel_55.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_55.setLayout(null);

		panel_55.setBounds(0, 125, 340, 26);
		panel_6.add(panel_55);

		final JxPanel panel_56 = new JxPanel();
		panel_56.setTheme(theme);
		panel_56.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_56.setLayout(null);

		panel_56.setBounds(0, 150, 340, 26);
		panel_6.add(panel_56);

		final JxPanel panel_57 = new JxPanel();
		panel_57.setTheme(theme);
		panel_57.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_57.setLayout(null);

		panel_57.setBounds(0, 175, 340, 26);
		panel_6.add(panel_57);

		final JxPanel panel_58 = new JxPanel();
		panel_58.setTheme(theme);
		panel_58.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_58.setLayout(null);

		panel_58.setBounds(0, 200, 340, 36);
		panel_6.add(panel_58);

		final JxPanel panel_59 = new JxPanel();
		panel_59.setTheme(theme);
		panel_59.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_59.setLayout(null);

		panel_59.setBounds(0, 235, 340, 26);
		panel_6.add(panel_59);

		final JxPanel panel_60 = new JxPanel();
		panel_60.setTheme(theme);
		panel_60.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_60.setLayout(null);

		panel_60.setBounds(0, 260, 340, 26);
		panel_6.add(panel_60);

		final JxPanel panel_61 = new JxPanel();
		panel_61.setTheme(theme);
		panel_61.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_61.setLayout(null);

		panel_61.setBounds(0, 285, 340, 26);
		panel_6.add(panel_61);

		final JxPanel panel_62 = new JxPanel();
		panel_62.setTheme(theme);
		panel_62.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_62.setLayout(null);

		panel_62.setBounds(0, 310, 340, 26);
		panel_6.add(panel_62);

		final JxPanel panel_63 = new JxPanel();
		panel_63.setTheme(theme);
		panel_63.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_63.setLayout(null);

		panel_63.setBounds(0, 335, 340, 26);
		panel_6.add(panel_63);

		final JxPanel panel_64 = new JxPanel();
		panel_64.setTheme(theme);
		panel_64.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_64.setLayout(null);

		panel_64.setBounds(0, 360, 340, 26);
		panel_6.add(panel_64);

		final JxPanel panel_65 = new JxPanel();
		panel_65.setTheme(theme);
		panel_65.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_65.setLayout(null);

		panel_65.setBounds(0, 385, 340, 26);
		panel_6.add(panel_65);

		final JxPanel panel_66 = new JxPanel();
		panel_66.setTheme(theme);
		panel_66.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_66.setLayout(null);

		panel_66.setBounds(0, 410, 340, 26);
		panel_6.add(panel_66);

		final JxPanel panel_67 = new JxPanel();
		panel_67.setTheme(theme);
		panel_67.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_67.setLayout(null);

		panel_67.setBounds(0, 435, 340, 26);
		panel_6.add(panel_67);

		final JxPanel panel_68 = new JxPanel();
		panel_68.setTheme(theme);
		panel_68.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_68.setLayout(null);

		panel_68.setBounds(0, 460, 340, 26);
		panel_6.add(panel_68);

		final JxPanel panel_69 = new JxPanel();
		panel_69.setTheme(theme);
		panel_69.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_69.setLayout(null);

		panel_69.setBounds(0, 485, 340, 26);
		panel_6.add(panel_69);

		final JxPanel panel_70 = new JxPanel();
		panel_70.setTheme(theme);
		panel_70.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_70.setLayout(null);

		panel_70.setBounds(0, 510, 340, 26);
		panel_6.add(panel_70);

		final JxPanel panel_71 = new JxPanel();
		panel_71.setTheme(theme);
		panel_71.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_71.setLayout(null);

		panel_71.setBounds(0, 535, 340, 26);
		panel_6.add(panel_71);

		final JxPanel panel_72 = new JxPanel();
		panel_72.setTheme(theme);
		panel_72.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_72.setLayout(null);

		panel_72.setBounds(0, 560, 340, 25);
		panel_6.add(panel_72);

		final JxPanel panel_93 = new JxPanel();
		panel_93.setTheme(theme);
		panel_93.setLayout(null);

		panel_93.setBounds(0, 760, 840, 75);
		add(panel_93);

		final JxPanel panel_94 = new JxPanel();
		panel_94.setTheme(theme);
		panel_94.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_94.setLayout(null);
		panel_94.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_94.setBounds(0, 0, 840, 26);
		panel_93.add(panel_94);

		final JxLabel bSignatureOfLabel = new JxLabel();
		bSignatureOfLabel.setTheme(theme);

		bSignatureOfLabel.setFontSize(12);
		bSignatureOfLabel.setFontStyle(Font.BOLD);
		bSignatureOfLabel
				.setText("B.  Signature of RN Coordinator for CAA Process and Date Signed");
		bSignatureOfLabel.setBounds(10, 7, 422, 14);
		panel_94.add(bSignatureOfLabel);

		final JxPanel panel_95 = new JxPanel();
		panel_95.setTheme(theme);
		panel_95.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_95.setLayout(null);

		panel_95.setBounds(0, 25, 840, 50);
		panel_93.add(panel_95);

		final JxLabel label_22 = new JxLabel();
		label_22.setTheme(theme);

		label_22.setFontSize(12);
		label_22.setFontStyle(Font.BOLD);
		label_22.setText("1.  Signature");
		label_22.setBounds(27, 7, 166, 14);
		panel_95.add(label_22);

		final JxLabel label_23 = new JxLabel();
		label_23.setTheme(theme);

		label_23.setFontSize(12);
		label_23.setFontStyle(Font.BOLD);
		label_23.setText("2.  Date");
		label_23.setBounds(514, 7, 54, 14);
		panel_95.add(label_23);

		dcV0200B1 = new JxDateChooser();
		dcV0200B1.setTheme(theme);
		dcV0200B1.setBounds(514, 27, 188, 18);
		dcV0200B1.setDateFormatString("MM/dd/yyyy");
		panel_95.add(dcV0200B1);

		final JxPanel panel_96 = new JxPanel();
		panel_96.setTheme(theme);
		panel_96.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_96.setLayout(null);

		panel_96.setBounds(0, 835, 840, 75);
		add(panel_96);

		final JxPanel panel_97 = new JxPanel();
		panel_97.setTheme(theme);
		panel_97.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_97.setLayout(null);
		panel_97.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_97.setBounds(0, 0, 840, 26);
		panel_96.add(panel_97);

		final JxLabel cSignatureOfLabel = new JxLabel();
		cSignatureOfLabel.setTheme(theme);

		cSignatureOfLabel.setFontSize(12);
		cSignatureOfLabel.setFontStyle(Font.BOLD);
		cSignatureOfLabel
				.setText("C.  Signature of Person Completing Care Plan and Date Signed");
		cSignatureOfLabel.setBounds(10, 7, 426, 14);
		panel_97.add(cSignatureOfLabel);

		final JxPanel panel_98 = new JxPanel();
		panel_98.setTheme(theme);
		panel_98.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_98.setLayout(null);

		panel_98.setBounds(0, 25, 840, 50);
		panel_96.add(panel_98);

		final JxLabel label_24 = new JxLabel();
		label_24.setTheme(theme);

		label_24.setFontSize(12);
		label_24.setFontStyle(Font.BOLD);
		label_24.setText("1.  Signature");
		label_24.setBounds(27, 7, 192, 14);
		panel_98.add(label_24);

		final JxLabel label_25 = new JxLabel();
		label_25.setTheme(theme);

		label_25.setFontSize(12);
		label_25.setFontStyle(Font.BOLD);
		label_25.setText("2.  Date");
		label_25.setBounds(515, 7, 54, 14);
		panel_98.add(label_25);

		dcV0200B2 = new JxDateChooser();
		dcV0200B2.setTheme(theme);
		dcV0200B2.setBounds(515, 27, 185, 18);
		dcV0200B2.setDateFormatString("MM/dd/yyyy");
		panel_98.add(dcV0200B2);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionV mds3sectionV = (Mds3SectionV) Mds3Controller.getInstance()
				.getSection(Mds3SectionV.class);
		mds3sectionV.setV0200A_01A(cbV0200A01.isSelected());
		mds3sectionV.setV0200A_02A(cbV0200A02.isSelected());
		mds3sectionV.setV0200A_03A(cbV0200A03.isSelected());
		mds3sectionV.setV0200A_04A(cbV0200A04.isSelected());
		mds3sectionV.setV0200A_05A(cbV0200A05.isSelected());
		mds3sectionV.setV0200A_06A(cbV0200A06.isSelected());
		mds3sectionV.setV0200A_07A(cbV0200A07.isSelected());
		mds3sectionV.setV0200A_08A(cbV0200A08.isSelected());
		mds3sectionV.setV0200A_09A(cbV0200A09.isSelected());
		mds3sectionV.setV0200A_10A(cbV0200A10.isSelected());
		mds3sectionV.setV0200A_11A(cbV0200A11.isSelected());
		mds3sectionV.setV0200A_12A(cbV0200A12.isSelected());
		mds3sectionV.setV0200A_13A(cbV0200A13.isSelected());
		mds3sectionV.setV0200A_14A(cbV0200A14.isSelected());
		mds3sectionV.setV0200A_15A(cbV0200A15.isSelected());
		mds3sectionV.setV0200A_16A(cbV0200A16.isSelected());
		mds3sectionV.setV0200A_17A(cbV0200A17.isSelected());
		mds3sectionV.setV0200A_18A(cbV0200A18.isSelected());
		mds3sectionV.setV0200A_19A(cbV0200A19.isSelected());
		mds3sectionV.setV0200A_20A(cbV0200A20.isSelected());
		mds3sectionV.setV0200A_01B(cbV0200B01.isSelected());
		mds3sectionV.setV0200A_02B(cbV0200B02.isSelected());
		mds3sectionV.setV0200A_03B(cbV0200B03.isSelected());
		mds3sectionV.setV0200A_04B(cbV0200B04.isSelected());
		mds3sectionV.setV0200A_05B(cbV0200B05.isSelected());
		mds3sectionV.setV0200A_06B(cbV0200B06.isSelected());
		mds3sectionV.setV0200A_07B(cbV0200B07.isSelected());
		mds3sectionV.setV0200A_08B(cbV0200B08.isSelected());
		mds3sectionV.setV0200A_09B(cbV0200B09.isSelected());
		mds3sectionV.setV0200A_10B(cbV0200B10.isSelected());
		mds3sectionV.setV0200A_11B(cbV0200B11.isSelected());
		mds3sectionV.setV0200A_12B(cbV0200B12.isSelected());
		mds3sectionV.setV0200A_13B(cbV0200B13.isSelected());
		mds3sectionV.setV0200A_14B(cbV0200B14.isSelected());
		mds3sectionV.setV0200A_15B(cbV0200B15.isSelected());
		mds3sectionV.setV0200A_16B(cbV0200B16.isSelected());
		mds3sectionV.setV0200A_17B(cbV0200B17.isSelected());
		mds3sectionV.setV0200A_18B(cbV0200B18.isSelected());
		mds3sectionV.setV0200A_19B(cbV0200B19.isSelected());
		mds3sectionV.setV0200A_20B(cbV0200B20.isSelected());
	}

	public void doUpdate() {
		Mds3SectionV mds3sectionV = (Mds3SectionV) Mds3Controller.getInstance()
				.getSection(Mds3SectionV.class);
		mds3sectionV.setV0200A_01A(mds3sectionV.isV0200A_01A());
		mds3sectionV.setV0200A_02A(mds3sectionV.isV0200A_02A());
		mds3sectionV.setV0200A_03A(mds3sectionV.isV0200A_03A());
		mds3sectionV.setV0200A_04A(mds3sectionV.isV0200A_04A());
		mds3sectionV.setV0200A_05A(mds3sectionV.isV0200A_05A());
		mds3sectionV.setV0200A_06A(mds3sectionV.isV0200A_06A());
		mds3sectionV.setV0200A_07A(mds3sectionV.isV0200A_07A());
		mds3sectionV.setV0200A_08A(mds3sectionV.isV0200A_08A());
		mds3sectionV.setV0200A_09A(mds3sectionV.isV0200A_09A());
		mds3sectionV.setV0200A_10A(mds3sectionV.isV0200A_10A());
		mds3sectionV.setV0200A_11A(mds3sectionV.isV0200A_11A());
		mds3sectionV.setV0200A_12A(mds3sectionV.isV0200A_12A());
		mds3sectionV.setV0200A_13A(mds3sectionV.isV0200A_13A());
		mds3sectionV.setV0200A_14A(mds3sectionV.isV0200A_14A());
		mds3sectionV.setV0200A_15A(mds3sectionV.isV0200A_15A());
		mds3sectionV.setV0200A_16A(mds3sectionV.isV0200A_16A());
		mds3sectionV.setV0200A_17A(mds3sectionV.isV0200A_17A());
		mds3sectionV.setV0200A_18A(mds3sectionV.isV0200A_18A());
		mds3sectionV.setV0200A_19A(mds3sectionV.isV0200A_19A());
		mds3sectionV.setV0200A_20A(mds3sectionV.isV0200A_20A());
		mds3sectionV.setV0200A_01B(mds3sectionV.isV0200A_01B());
		mds3sectionV.setV0200A_02B(mds3sectionV.isV0200A_02B());
		mds3sectionV.setV0200A_03B(mds3sectionV.isV0200A_03B());
		mds3sectionV.setV0200A_04B(mds3sectionV.isV0200A_04B());
		mds3sectionV.setV0200A_05B(mds3sectionV.isV0200A_05B());
		mds3sectionV.setV0200A_06B(mds3sectionV.isV0200A_06B());
		mds3sectionV.setV0200A_07B(mds3sectionV.isV0200A_07B());
		mds3sectionV.setV0200A_08B(mds3sectionV.isV0200A_08B());
		mds3sectionV.setV0200A_09B(mds3sectionV.isV0200A_09B());
		mds3sectionV.setV0200A_10B(mds3sectionV.isV0200A_10B());
		mds3sectionV.setV0200A_11B(mds3sectionV.isV0200A_11B());
		mds3sectionV.setV0200A_12B(mds3sectionV.isV0200A_12B());
		mds3sectionV.setV0200A_13B(mds3sectionV.isV0200A_13B());
		mds3sectionV.setV0200A_14B(mds3sectionV.isV0200A_14B());
		mds3sectionV.setV0200A_15B(mds3sectionV.isV0200A_15B());
		mds3sectionV.setV0200A_16B(mds3sectionV.isV0200A_16B());
		mds3sectionV.setV0200A_17B(mds3sectionV.isV0200A_17B());
		mds3sectionV.setV0200A_18B(mds3sectionV.isV0200A_18B());
		mds3sectionV.setV0200A_19B(mds3sectionV.isV0200A_19B());
		mds3sectionV.setV0200A_20B(mds3sectionV.isV0200A_20B());

	}

}
