package medrex.client.mds3.ui.subSections.sectionZ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelZ0400 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6323619413036076310L;
	Theme theme = new BlackOverWhiteTheme();

	@Override
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	public PanelZ0400() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 450));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 450);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setFontStyle(Font.BOLD);

		label
				.setText("<html><body><b>Z0400. Signature of Persons Completing the Assessment or Entry/Death Reporting</b>");
		label.setBounds(10, 6, 490, 16);
		panel_1.add(label);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_2.setBounds(0, 24, 24, 427);
		panel.add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_3.setLayout(null);
		panel_3.setBounds(23, 24, 816, 128);
		panel.add(panel_3);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1.setBounds(10, 2, 802, 122);
		panel_3.add(label_1);

		label_1.setFontSize(12);
		label_1
				.setText("<html><body> I certify that the accompanying accurately reflects resident assessment information for this resident and that I collected or coordinated <br>"
						+ "Collection of this information on the dates specified.To the best of my knowledge,this information was collected in accordance with applicalbe<br>"
						+ "Medicare and Medicaid requirements.I understand that this information is used as a basis for ensuring that resident receive appropriate and quality<br>"
						+ "care,and as a basis for payment from fedral funds.I further undersatnd that payment of such fedral funds and continued participation in the <br>"
						+ "goverment-funded health care programs is conditioned on the accuracy and truthfullness of this information,and that I may be personally subject to<br>"
						+ "or may subject my organization to substantal criminal,civil,and/or administrative penalties for submitting false information.I also certify that I am <br>"
						+ "authorized to submit this information by this facility on its behalf");

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBounds(23, 151, 816, 299);
		panel.add(panel_4);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 263, 299);
		panel_4.add(panel_5);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);

		panel_6.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 263, 26);
		panel_5.add(panel_6);

		final JxLabel signatureLabel = new JxLabel();
		signatureLabel.setTheme(theme);

		signatureLabel.setFontSize(12);
		signatureLabel.setFontStyle(Font.BOLD);
		signatureLabel.setText("Signature");
		signatureLabel.setBounds(80, 5, 66, 16);
		panel_6.add(signatureLabel);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);

		panel_6_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 25, 263, 25);
		panel_5.add(panel_6_1);

		final JxLabel signatureLabel_1 = new JxLabel();
		signatureLabel_1.setTheme(theme);
		signatureLabel_1.setText("A.");
		signatureLabel_1.setBounds(5, 0, 66, 16);
		panel_6_1.add(signatureLabel_1);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);

		panel_6_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2.setLayout(null);
		panel_6_2.setBounds(0, 49, 263, 25);
		panel_5.add(panel_6_2);

		final JxLabel signatureLabel_2 = new JxLabel();
		signatureLabel_2.setTheme(theme);
		signatureLabel_2.setText("B.");
		signatureLabel_2.setBounds(5, 0, 66, 16);
		panel_6_2.add(signatureLabel_2);

		final JxPanel panel_6_3 = new JxPanel();
		panel_6_3.setTheme(theme);

		panel_6_3.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_3.setLayout(null);
		panel_6_3.setBounds(0, 71, 263, 25);
		panel_5.add(panel_6_3);

		final JxLabel signatureLabel_3 = new JxLabel();
		signatureLabel_3.setTheme(theme);
		signatureLabel_3.setText("C.");
		signatureLabel_3.setBounds(5, 0, 66, 16);
		panel_6_3.add(signatureLabel_3);

		final JxPanel panel_6_4 = new JxPanel();
		panel_6_4.setTheme(theme);

		panel_6_4.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_4.setLayout(null);
		panel_6_4.setBounds(0, 95, 263, 25);
		panel_5.add(panel_6_4);

		final JxLabel signatureLabel_4 = new JxLabel();
		signatureLabel_4.setTheme(theme);
		signatureLabel_4.setText("D.");
		signatureLabel_4.setBounds(5, 0, 66, 16);
		panel_6_4.add(signatureLabel_4);

		final JxPanel panel_6_5 = new JxPanel();
		panel_6_5.setTheme(theme);

		panel_6_5.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_5.setLayout(null);
		panel_6_5.setBounds(0, 117, 263, 25);
		panel_5.add(panel_6_5);

		final JxLabel signatureLabel_5 = new JxLabel();
		signatureLabel_5.setTheme(theme);
		signatureLabel_5.setText("E.");
		signatureLabel_5.setBounds(5, 0, 66, 16);
		panel_6_5.add(signatureLabel_5);

		final JxPanel panel_6_6 = new JxPanel();
		panel_6_6.setTheme(theme);

		panel_6_6.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_6.setLayout(null);
		panel_6_6.setBounds(0, 140, 263, 25);
		panel_5.add(panel_6_6);

		final JxLabel signatureLabel_6 = new JxLabel();
		signatureLabel_6.setTheme(theme);
		signatureLabel_6.setText("F.");
		signatureLabel_6.setBounds(5, 0, 66, 16);
		panel_6_6.add(signatureLabel_6);

		final JxPanel panel_6_7 = new JxPanel();
		panel_6_7.setTheme(theme);

		panel_6_7.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_7.setLayout(null);
		panel_6_7.setBounds(0, 163, 263, 25);
		panel_5.add(panel_6_7);

		final JxLabel signatureLabel_7 = new JxLabel();
		signatureLabel_7.setTheme(theme);
		signatureLabel_7.setText("G.");
		signatureLabel_7.setBounds(5, 0, 66, 16);
		panel_6_7.add(signatureLabel_7);

		final JxPanel panel_6_8 = new JxPanel();
		panel_6_8.setTheme(theme);

		panel_6_8.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_8.setLayout(null);
		panel_6_8.setBounds(0, 185, 263, 25);
		panel_5.add(panel_6_8);

		final JxLabel signatureLabel_8 = new JxLabel();
		signatureLabel_8.setTheme(theme);
		signatureLabel_8.setText("H.");
		signatureLabel_8.setBounds(5, 0, 66, 16);
		panel_6_8.add(signatureLabel_8);

		final JxPanel panel_6_9 = new JxPanel();
		panel_6_9.setTheme(theme);

		panel_6_9.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_9.setLayout(null);
		panel_6_9.setBounds(0, 207, 263, 25);
		panel_5.add(panel_6_9);

		final JxLabel signatureLabel_9 = new JxLabel();
		signatureLabel_9.setTheme(theme);
		signatureLabel_9.setText("I.");
		signatureLabel_9.setBounds(5, 0, 66, 16);
		panel_6_9.add(signatureLabel_9);

		final JxPanel panel_6_10 = new JxPanel();
		panel_6_10.setTheme(theme);

		panel_6_10.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_10.setLayout(null);
		panel_6_10.setBounds(0, 231, 263, 25);
		panel_5.add(panel_6_10);

		final JxLabel signatureLabel_10 = new JxLabel();
		signatureLabel_10.setTheme(theme);
		signatureLabel_10.setText("J.");
		signatureLabel_10.setBounds(5, 0, 66, 16);
		panel_6_10.add(signatureLabel_10);

		final JxPanel panel_6_11 = new JxPanel();
		panel_6_11.setTheme(theme);

		panel_6_11.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_11.setLayout(null);
		panel_6_11.setBounds(0, 254, 263, 25);
		panel_5.add(panel_6_11);

		final JxLabel signatureLabel_11 = new JxLabel();
		signatureLabel_11.setTheme(theme);
		signatureLabel_11.setText("K.");
		signatureLabel_11.setBounds(5, 0, 66, 16);
		panel_6_11.add(signatureLabel_11);

		final JxPanel panel_6_12 = new JxPanel();
		panel_6_12.setTheme(theme);

		panel_6_12.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_12.setLayout(null);
		panel_6_12.setBounds(0, 277, 263, 25);
		panel_5.add(panel_6_12);

		final JxLabel signatureLabel_12 = new JxLabel();
		signatureLabel_12.setTheme(theme);
		signatureLabel_12.setText("L.");
		signatureLabel_12.setBounds(5, 0, 66, 16);
		panel_6_12.add(signatureLabel_12);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(261, 0, 203, 299);
		panel_4.add(panel_5_1);

		final JxPanel panel_6_13 = new JxPanel();
		panel_6_13.setTheme(theme);

		panel_6_13.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_13.setLayout(null);
		panel_6_13.setBounds(0, 0, 203, 26);
		panel_5_1.add(panel_6_13);

		final JxLabel titleLabel = new JxLabel();
		titleLabel.setTheme(theme);

		titleLabel.setFontSize(12);
		titleLabel.setFontStyle(Font.BOLD);
		titleLabel.setText("Title");
		titleLabel.setBounds(56, 5, 66, 16);
		panel_6_13.add(titleLabel);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);

		panel_6_1_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(0, 25, 203, 25);
		panel_5_1.add(panel_6_1_1);

		final JxPanel panel_6_2_1 = new JxPanel();
		panel_6_2_1.setTheme(theme);

		panel_6_2_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2_1.setLayout(null);
		panel_6_2_1.setBounds(0, 49, 203, 25);
		panel_5_1.add(panel_6_2_1);

		final JxPanel panel_6_3_1 = new JxPanel();
		panel_6_3_1.setTheme(theme);

		panel_6_3_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_3_1.setLayout(null);
		panel_6_3_1.setBounds(0, 71, 203, 25);
		panel_5_1.add(panel_6_3_1);

		final JxPanel panel_6_4_1 = new JxPanel();
		panel_6_4_1.setTheme(theme);

		panel_6_4_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_4_1.setLayout(null);
		panel_6_4_1.setBounds(0, 95, 203, 25);
		panel_5_1.add(panel_6_4_1);

		final JxPanel panel_6_5_1 = new JxPanel();
		panel_6_5_1.setTheme(theme);

		panel_6_5_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_5_1.setLayout(null);
		panel_6_5_1.setBounds(0, 117, 203, 25);
		panel_5_1.add(panel_6_5_1);

		final JxPanel panel_6_6_1 = new JxPanel();
		panel_6_6_1.setTheme(theme);

		panel_6_6_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_6_1.setLayout(null);
		panel_6_6_1.setBounds(0, 140, 203, 25);
		panel_5_1.add(panel_6_6_1);

		final JxPanel panel_6_7_1 = new JxPanel();
		panel_6_7_1.setTheme(theme);

		panel_6_7_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_7_1.setLayout(null);
		panel_6_7_1.setBounds(0, 163, 203, 25);
		panel_5_1.add(panel_6_7_1);

		final JxPanel panel_6_8_1 = new JxPanel();
		panel_6_8_1.setTheme(theme);

		panel_6_8_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_8_1.setLayout(null);
		panel_6_8_1.setBounds(0, 185, 203, 25);
		panel_5_1.add(panel_6_8_1);

		final JxPanel panel_6_9_1 = new JxPanel();
		panel_6_9_1.setTheme(theme);

		panel_6_9_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_9_1.setLayout(null);
		panel_6_9_1.setBounds(0, 207, 203, 25);
		panel_5_1.add(panel_6_9_1);

		final JxPanel panel_6_10_1 = new JxPanel();
		panel_6_10_1.setTheme(theme);

		panel_6_10_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_10_1.setLayout(null);
		panel_6_10_1.setBounds(0, 231, 203, 25);
		panel_5_1.add(panel_6_10_1);

		final JxPanel panel_6_11_1 = new JxPanel();
		panel_6_11_1.setTheme(theme);

		panel_6_11_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_11_1.setLayout(null);
		panel_6_11_1.setBounds(0, 254, 203, 25);
		panel_5_1.add(panel_6_11_1);

		final JxPanel panel_6_12_1 = new JxPanel();
		panel_6_12_1.setTheme(theme);

		panel_6_12_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_12_1.setLayout(null);
		panel_6_12_1.setBounds(0, 277, 203, 25);
		panel_5_1.add(panel_6_12_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBounds(463, 0, 203, 299);
		panel_4.add(panel_5_1_1);

		final JxPanel panel_6_13_1 = new JxPanel();
		panel_6_13_1.setTheme(theme);

		panel_6_13_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_13_1.setLayout(null);
		panel_6_13_1.setBounds(0, 0, 203, 26);
		panel_5_1_1.add(panel_6_13_1);

		final JxLabel sectionsLabel = new JxLabel();
		sectionsLabel.setTheme(theme);

		sectionsLabel.setFontSize(12);
		sectionsLabel.setFontStyle(Font.BOLD);
		sectionsLabel.setText("Sections");
		sectionsLabel.setBounds(61, 5, 66, 16);
		panel_6_13_1.add(sectionsLabel);

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);

		panel_6_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 25, 203, 25);
		panel_5_1_1.add(panel_6_1_1_1);

		final JxPanel panel_6_2_1_1 = new JxPanel();
		panel_6_2_1_1.setTheme(theme);

		panel_6_2_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_2_1_1.setLayout(null);
		panel_6_2_1_1.setBounds(0, 49, 203, 25);
		panel_5_1_1.add(panel_6_2_1_1);

		final JxPanel panel_6_3_1_1 = new JxPanel();
		panel_6_3_1_1.setTheme(theme);

		panel_6_3_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_3_1_1.setLayout(null);
		panel_6_3_1_1.setBounds(0, 71, 203, 25);
		panel_5_1_1.add(panel_6_3_1_1);

		final JxPanel panel_6_4_1_1 = new JxPanel();
		panel_6_4_1_1.setTheme(theme);

		panel_6_4_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_4_1_1.setLayout(null);
		panel_6_4_1_1.setBounds(0, 95, 203, 25);
		panel_5_1_1.add(panel_6_4_1_1);

		final JxPanel panel_6_5_1_1 = new JxPanel();
		panel_6_5_1_1.setTheme(theme);

		panel_6_5_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_5_1_1.setLayout(null);
		panel_6_5_1_1.setBounds(0, 117, 203, 25);
		panel_5_1_1.add(panel_6_5_1_1);

		final JxPanel panel_6_6_1_1 = new JxPanel();
		panel_6_6_1_1.setTheme(theme);

		panel_6_6_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_6_1_1.setLayout(null);
		panel_6_6_1_1.setBounds(0, 140, 203, 25);
		panel_5_1_1.add(panel_6_6_1_1);

		final JxPanel panel_6_7_1_1 = new JxPanel();
		panel_6_7_1_1.setTheme(theme);

		panel_6_7_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_7_1_1.setLayout(null);
		panel_6_7_1_1.setBounds(0, 163, 203, 25);
		panel_5_1_1.add(panel_6_7_1_1);

		final JxPanel panel_6_8_1_1 = new JxPanel();
		panel_6_8_1_1.setTheme(theme);

		panel_6_8_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_8_1_1.setLayout(null);
		panel_6_8_1_1.setBounds(0, 185, 203, 25);
		panel_5_1_1.add(panel_6_8_1_1);

		final JxPanel panel_6_9_1_1 = new JxPanel();
		panel_6_9_1_1.setTheme(theme);

		panel_6_9_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_9_1_1.setLayout(null);
		panel_6_9_1_1.setBounds(0, 207, 203, 25);
		panel_5_1_1.add(panel_6_9_1_1);

		final JxPanel panel_6_10_1_1 = new JxPanel();
		panel_6_10_1_1.setTheme(theme);

		panel_6_10_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_10_1_1.setLayout(null);
		panel_6_10_1_1.setBounds(0, 231, 203, 25);
		panel_5_1_1.add(panel_6_10_1_1);

		final JxPanel panel_6_11_1_1 = new JxPanel();
		panel_6_11_1_1.setTheme(theme);

		panel_6_11_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_11_1_1.setLayout(null);
		panel_6_11_1_1.setBounds(0, 254, 203, 25);
		panel_5_1_1.add(panel_6_11_1_1);

		final JxPanel panel_6_12_1_1 = new JxPanel();
		panel_6_12_1_1.setTheme(theme);

		panel_6_12_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_12_1_1.setLayout(null);
		panel_6_12_1_1.setBounds(0, 277, 203, 25);
		panel_5_1_1.add(panel_6_12_1_1);

		final JxPanel panel_5_1_2 = new JxPanel();
		panel_5_1_2.setTheme(theme);
		panel_5_1_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_2.setLayout(null);
		panel_5_1_2.setBounds(664, 0, 151, 299);
		panel_4.add(panel_5_1_2);

		final JxPanel panel_6_13_2 = new JxPanel();
		panel_6_13_2.setTheme(theme);

		panel_6_13_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_13_2.setLayout(null);
		panel_6_13_2.setBounds(0, 0, 153, 26);
		panel_5_1_2.add(panel_6_13_2);

		final JxLabel dateSectionLabel = new JxLabel();
		dateSectionLabel.setTheme(theme);

		dateSectionLabel.setFontStyle(Font.BOLD);
		dateSectionLabel.setText("<html><body><b> Date Section <br> Completed");
		dateSectionLabel.setBounds(43, 1, 79, 22);
		panel_6_13_2.add(dateSectionLabel);

		final JxPanel panel_6_1_1_2 = new JxPanel();
		panel_6_1_1_2.setTheme(theme);

		panel_6_1_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_1_1_2.setLayout(null);
		panel_6_1_1_2.setBounds(0, 25, 153, 25);
		panel_5_1_2.add(panel_6_1_1_2);

		final JxPanel panel_6_2_1_2 = new JxPanel();
		panel_6_2_1_2.setTheme(theme);

		panel_6_2_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_2_1_2.setLayout(null);
		panel_6_2_1_2.setBounds(0, 49, 153, 25);
		panel_5_1_2.add(panel_6_2_1_2);

		final JxPanel panel_6_3_1_2 = new JxPanel();
		panel_6_3_1_2.setTheme(theme);

		panel_6_3_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_3_1_2.setLayout(null);
		panel_6_3_1_2.setBounds(0, 71, 153, 25);
		panel_5_1_2.add(panel_6_3_1_2);

		final JxPanel panel_6_4_1_2 = new JxPanel();
		panel_6_4_1_2.setTheme(theme);

		panel_6_4_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_4_1_2.setLayout(null);
		panel_6_4_1_2.setBounds(0, 95, 153, 25);
		panel_5_1_2.add(panel_6_4_1_2);

		final JxPanel panel_6_5_1_2 = new JxPanel();
		panel_6_5_1_2.setTheme(theme);

		panel_6_5_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_5_1_2.setLayout(null);
		panel_6_5_1_2.setBounds(0, 117, 153, 25);
		panel_5_1_2.add(panel_6_5_1_2);

		final JxPanel panel_6_6_1_2 = new JxPanel();
		panel_6_6_1_2.setTheme(theme);

		panel_6_6_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_6_1_2.setLayout(null);
		panel_6_6_1_2.setBounds(0, 140, 153, 25);
		panel_5_1_2.add(panel_6_6_1_2);

		final JxPanel panel_6_7_1_2 = new JxPanel();
		panel_6_7_1_2.setTheme(theme);

		panel_6_7_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_7_1_2.setLayout(null);
		panel_6_7_1_2.setBounds(0, 163, 153, 25);
		panel_5_1_2.add(panel_6_7_1_2);

		final JxPanel panel_6_8_1_2 = new JxPanel();
		panel_6_8_1_2.setTheme(theme);

		panel_6_8_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_8_1_2.setLayout(null);
		panel_6_8_1_2.setBounds(0, 185, 153, 25);
		panel_5_1_2.add(panel_6_8_1_2);

		final JxPanel panel_6_9_1_2 = new JxPanel();
		panel_6_9_1_2.setTheme(theme);

		panel_6_9_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_9_1_2.setLayout(null);
		panel_6_9_1_2.setBounds(0, 207, 153, 25);
		panel_5_1_2.add(panel_6_9_1_2);

		final JxPanel panel_6_10_1_2 = new JxPanel();
		panel_6_10_1_2.setTheme(theme);

		panel_6_10_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_10_1_2.setLayout(null);
		panel_6_10_1_2.setBounds(0, 231, 153, 25);
		panel_5_1_2.add(panel_6_10_1_2);

		final JxPanel panel_6_11_1_2 = new JxPanel();
		panel_6_11_1_2.setTheme(theme);

		panel_6_11_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_11_1_2.setLayout(null);
		panel_6_11_1_2.setBounds(0, 254, 153, 25);
		panel_5_1_2.add(panel_6_11_1_2);

		final JxPanel panel_6_12_1_2 = new JxPanel();
		panel_6_12_1_2.setTheme(theme);

		panel_6_12_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_12_1_2.setLayout(null);
		panel_6_12_1_2.setBounds(0, 277, 153, 25);
		panel_5_1_2.add(panel_6_12_1_2);
	}

}
