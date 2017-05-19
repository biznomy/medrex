package medrex.client.mds3.ui.subSections.sectionF;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionF.Mds3SectionF;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelF0800 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -127641402999286368L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbF0800Z;
	private JxCheckBox cbF0800T;
	private JxCheckBox cbF0800S;
	private JxCheckBox cbF0800R;
	private JxCheckBox cbF0800Q;
	private JxCheckBox cbF0800P;
	private JxCheckBox cbF0800O;
	private JxCheckBox cbF0800N;
	private JxCheckBox cbF0800M;
	private JxCheckBox cbF0800L;
	private JxCheckBox cbF0800K;
	private JxCheckBox cbF0800J;
	private JxCheckBox cbF0800I;
	private JxCheckBox cbF0800H;
	private JxCheckBox cbF0800G;
	private JxCheckBox cbF0800F;
	private JxCheckBox cbF0800E;
	private JxCheckBox cbF0800D;
	private JxCheckBox cbF0800C;
	private JxCheckBox cbF0800B;
	private JxCheckBox cbF0800A;

	public PanelF0800() {
		super();
		setName("");
		setPreferredSize(new Dimension(841, 622));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panel.setBounds(0, 0, 841, 622);
		add(panel);

		final JxPanel panel_5_2_1 = new JxPanel();
		panel_5_2_1.setTheme(theme);
		panel_5_2_1.setLayout(null);
		panel_5_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_2_1.setBounds(4, 5, 834, 25);
		panel.add(panel_5_2_1);

		final JxLabel a0100Label_2_1 = new JxLabel();
		a0100Label_2_1.setTheme(theme);
		a0100Label_2_1.setBounds(10, 0, 800, 25);
		a0100Label_2_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		a0100Label_2_1.setFontSize(12);
		a0100Label_2_1.setFontStyle(Font.BOLD);
		a0100Label_2_1
				.setText("F0800. Staff Assessment of Daily and Activity Preferences");
		panel_5_2_1.add(a0100Label_2_1);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBounds(4, 30, 834, 25);

		panel.add(panel_1);

		final JxLabel a0100Label_2_2 = new JxLabel();
		a0100Label_2_2.setTheme(theme);
		a0100Label_2_2.setBounds(10, 0, 800, 25);

		a0100Label_2_2.setFontSize(12);
		a0100Label_2_2
				.setText("Do not conduct if Interview for Daily and Activity Preferences (F0400- F0500) was completed");
		panel_1.add(a0100Label_2_2);

		final JxPanel panel_9_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9_1_1_1_1.setLayout(null);
		panel_9_1_1_1_1.setBounds(4, 55, 834, 25);
		panel.add(panel_9_1_1_1_1);

		final JxLabel f0700ShouldTheLabel_1_1_1_1 = new JxLabel();
		f0700ShouldTheLabel_1_1_1_1.setTheme(theme);

		f0700ShouldTheLabel_1_1_1_1.setFontSize(12);
		f0700ShouldTheLabel_1_1_1_1.setFontStyle(Font.BOLD);
		f0700ShouldTheLabel_1_1_1_1.setText("Resident Prefers:");
		f0700ShouldTheLabel_1_1_1_1.setBounds(10, 4, 749, 16);
		panel_9_1_1_1_1.add(f0700ShouldTheLabel_1_1_1_1);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setLayout(null);
		panel_2.setBounds(5, 80, 832, 538);
		panel.add(panel_2);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_LIGHTGREY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 25, 80, 514);
		panel_2.add(panel_6_1);

		cbF0800A = new JxCheckBox();
		cbF0800A.setTheme(theme);

		cbF0800A.setBounds(25, 5, 21, 20);
		panel_6_1.add(cbF0800A);

		cbF0800B = new JxCheckBox();
		cbF0800B.setTheme(theme);

		cbF0800B.setText("");
		cbF0800B.setBounds(25, 28, 21, 20);
		panel_6_1.add(cbF0800B);

		cbF0800C = new JxCheckBox();
		cbF0800C.setTheme(theme);

		cbF0800C.setText("");
		cbF0800C.setBounds(25, 52, 21, 20);
		panel_6_1.add(cbF0800C);

		cbF0800D = new JxCheckBox();
		cbF0800D.setTheme(theme);

		cbF0800D.setText("");
		cbF0800D.setBounds(25, 75, 21, 20);
		panel_6_1.add(cbF0800D);

		cbF0800E = new JxCheckBox();
		cbF0800E.setTheme(theme);

		cbF0800E.setText("");
		cbF0800E.setBounds(25, 100, 21, 20);
		panel_6_1.add(cbF0800E);

		cbF0800F = new JxCheckBox();
		cbF0800F.setTheme(theme);

		cbF0800F.setText("");
		cbF0800F.setBounds(25, 125, 21, 20);
		panel_6_1.add(cbF0800F);

		cbF0800G = new JxCheckBox();
		cbF0800G.setTheme(theme);

		cbF0800G.setText("");
		cbF0800G.setBounds(25, 150, 21, 20);
		panel_6_1.add(cbF0800G);

		cbF0800H = new JxCheckBox();
		cbF0800H.setTheme(theme);

		cbF0800H.setText("");
		cbF0800H.setBounds(25, 175, 21, 20);
		panel_6_1.add(cbF0800H);

		cbF0800I = new JxCheckBox();
		cbF0800I.setTheme(theme);

		cbF0800I.setText("");
		cbF0800I.setBounds(25, 200, 21, 20);
		panel_6_1.add(cbF0800I);

		cbF0800J = new JxCheckBox();
		cbF0800J.setTheme(theme);

		cbF0800J.setText("");
		cbF0800J.setBounds(25, 225, 21, 20);
		panel_6_1.add(cbF0800J);

		cbF0800K = new JxCheckBox();
		cbF0800K.setTheme(theme);

		cbF0800K.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		cbF0800K.setText("");
		cbF0800K.setBounds(25, 250, 21, 20);
		panel_6_1.add(cbF0800K);

		cbF0800L = new JxCheckBox();
		cbF0800L.setTheme(theme);

		cbF0800L.setText("");
		cbF0800L.setBounds(25, 273, 21, 20);
		panel_6_1.add(cbF0800L);

		cbF0800M = new JxCheckBox();
		cbF0800M.setTheme(theme);

		cbF0800M.setText("");
		cbF0800M.setBounds(25, 295, 21, 20);
		panel_6_1.add(cbF0800M);

		cbF0800N = new JxCheckBox();
		cbF0800N.setTheme(theme);

		cbF0800N.setText("");
		cbF0800N.setBounds(25, 320, 21, 20);
		panel_6_1.add(cbF0800N);

		cbF0800O = new JxCheckBox();
		cbF0800O.setTheme(theme);

		cbF0800O.setText("");
		cbF0800O.setBounds(25, 343, 21, 20);
		panel_6_1.add(cbF0800O);

		cbF0800P = new JxCheckBox();
		cbF0800P.setTheme(theme);

		cbF0800P.setText("");
		cbF0800P.setBounds(25, 368, 21, 20);
		panel_6_1.add(cbF0800P);

		cbF0800Q = new JxCheckBox();
		cbF0800Q.setTheme(theme);

		cbF0800Q.setText("");
		cbF0800Q.setBounds(25, 394, 21, 20);
		panel_6_1.add(cbF0800Q);

		cbF0800R = new JxCheckBox();
		cbF0800R.setTheme(theme);

		cbF0800R.setText("");
		cbF0800R.setBounds(25, 418, 21, 20);
		panel_6_1.add(cbF0800R);

		cbF0800S = new JxCheckBox();
		cbF0800S.setTheme(theme);

		cbF0800S.setText("");
		cbF0800S.setBounds(25, 442, 21, 20);
		panel_6_1.add(cbF0800S);

		cbF0800T = new JxCheckBox();
		cbF0800T.setTheme(theme);

		cbF0800T.setText("");
		cbF0800T.setBounds(25, 465, 21, 20);
		panel_6_1.add(cbF0800T);

		cbF0800Z = new JxCheckBox();
		cbF0800Z.setTheme(theme);

		cbF0800Z.setText("");
		cbF0800Z.setBounds(25, 490, 21, 20);
		panel_6_1.add(cbF0800Z);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(81, 24, 750, 512);
		panel_2.add(panel_3);

		final JxPanel panel_9_1_1_1_1_1 = new JxPanel();
		panel_9_1_1_1_1_1.setTheme(theme);
		panel_9_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));

		panel_9_1_1_1_1_1.setLayout(null);
		panel_9_1_1_1_1_1.setBounds(-1, 0, 834, 25);
		panel_2.add(panel_9_1_1_1_1_1);

		final JxLabel f0700ShouldTheLabel_1_1_1_1_1 = new JxLabel();
		f0700ShouldTheLabel_1_1_1_1_1.setTheme(theme);

		f0700ShouldTheLabel_1_1_1_1_1.setFontSize(12);
		f0700ShouldTheLabel_1_1_1_1_1.setFontStyle(Font.BOLD);
		f0700ShouldTheLabel_1_1_1_1_1.setText("Check all that apply");
		f0700ShouldTheLabel_1_1_1_1_1.setBounds(20, 4, 749, 16);
		panel_9_1_1_1_1_1.add(f0700ShouldTheLabel_1_1_1_1_1);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));

		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 757, 25);
		panel_3.setLayout(null);
		panel_3.setBounds(79, 25, 761, 515);
		panel_3.add(panel_4);

		final JxLabel aChoosingClothesLabel = new JxLabel();
		aChoosingClothesLabel.setTheme(theme);

		aChoosingClothesLabel.setFontSize(12);
		aChoosingClothesLabel.setFontStyle(Font.BOLD);
		aChoosingClothesLabel.setText("A. Choosing clothes to wear");
		aChoosingClothesLabel.setBounds(5, 5, 158, 15);
		panel_4.add(aChoosingClothesLabel);

		final JxPanel panel_10_1 = new JxPanel();
		panel_10_1.setTheme(theme);
		panel_10_1.setLayout(null);

		panel_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_1.setBounds(0, 24, 757, 25);
		panel_3.add(panel_10_1);

		final JxLabel bCaringForLabel = new JxLabel();
		bCaringForLabel.setTheme(theme);

		bCaringForLabel.setFontSize(12);
		bCaringForLabel.setFontStyle(Font.BOLD);
		bCaringForLabel.setText("B. Caring for personal belongings");
		bCaringForLabel.setBounds(5, 10, 198, 14);
		panel_10_1.add(bCaringForLabel);

		final JxPanel panel_10_2 = new JxPanel();
		panel_10_2.setTheme(theme);
		panel_10_2.setLayout(null);

		panel_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2.setBounds(0, 48, 757, 25);
		panel_3.add(panel_10_2);

		final JxLabel cReceivingTubLabel = new JxLabel();
		cReceivingTubLabel.setTheme(theme);

		cReceivingTubLabel.setFontSize(12);
		cReceivingTubLabel.setFontStyle(Font.BOLD);
		cReceivingTubLabel.setText("C. Receiving tub bath");
		cReceivingTubLabel.setBounds(5, 10, 213, 14);
		panel_10_2.add(cReceivingTubLabel);

		final JxPanel panel_10_3 = new JxPanel();
		panel_10_3.setTheme(theme);
		panel_10_3.setLayout(null);

		panel_10_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3.setBounds(0, 72, 757, 25);
		panel_3.add(panel_10_3);

		final JxLabel receivingShowerLabel = new JxLabel();
		receivingShowerLabel.setTheme(theme);

		receivingShowerLabel.setFontSize(12);
		receivingShowerLabel.setFontStyle(Font.BOLD);
		receivingShowerLabel.setText("D.Receiving shower");
		receivingShowerLabel.setBounds(5, 10, 198, 14);
		panel_10_3.add(receivingShowerLabel);

		final JxPanel panel_10_4 = new JxPanel();
		panel_10_4.setTheme(theme);
		panel_10_4.setLayout(null);

		panel_10_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_4.setBounds(0, 96, 757, 25);
		panel_3.add(panel_10_4);

		final JxLabel eReceivingBedLabel = new JxLabel();
		eReceivingBedLabel.setTheme(theme);

		eReceivingBedLabel.setFontSize(12);
		eReceivingBedLabel.setFontStyle(Font.BOLD);
		eReceivingBedLabel.setText("E. Receiving bed bath");
		eReceivingBedLabel.setBounds(5, 10, 268, 14);
		panel_10_4.add(eReceivingBedLabel);

		final JxPanel panel_10_5 = new JxPanel();
		panel_10_5.setTheme(theme);
		panel_10_5.setLayout(null);

		panel_10_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_5.setBounds(0, 120, 757, 25);
		panel_3.add(panel_10_5);

		final JxLabel fReceivingSpongeLabel = new JxLabel();
		fReceivingSpongeLabel.setTheme(theme);

		fReceivingSpongeLabel.setFontSize(12);
		fReceivingSpongeLabel.setFontStyle(Font.BOLD);
		fReceivingSpongeLabel.setText("F. Receiving sponge bath");
		fReceivingSpongeLabel.setBounds(5, 10, 227, 14);
		panel_10_5.add(fReceivingSpongeLabel);

		final JxPanel panel_10_6 = new JxPanel();
		panel_10_6.setTheme(theme);
		panel_10_6.setLayout(null);

		panel_10_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6.setBounds(0, 144, 757, 25);
		panel_3.add(panel_10_6);

		final JxLabel fSnacksBetweenLabel = new JxLabel();
		fSnacksBetweenLabel.setTheme(theme);

		fSnacksBetweenLabel.setFontSize(12);
		fSnacksBetweenLabel.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel.setText("G. Snacks between meals");
		fSnacksBetweenLabel.setBounds(5, 10, 237, 14);
		panel_10_6.add(fSnacksBetweenLabel);

		final JxPanel panel_10_6_1 = new JxPanel();
		panel_10_6_1.setTheme(theme);

		panel_10_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_1.setLayout(null);
		panel_10_6_1.setBounds(0, 168, 757, 26);
		panel_3.add(panel_10_6_1);

		final JxLabel fSnacksBetweenLabel_1 = new JxLabel();
		fSnacksBetweenLabel_1.setTheme(theme);

		fSnacksBetweenLabel_1.setFontSize(12);
		fSnacksBetweenLabel_1.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_1.setText("H. Staying up past 8:00 pm");
		fSnacksBetweenLabel_1.setBounds(5, 10, 237, 14);
		panel_10_6_1.add(fSnacksBetweenLabel_1);

		final JxPanel panel_10_6_2 = new JxPanel();
		panel_10_6_2.setTheme(theme);

		panel_10_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_2.setLayout(null);
		panel_10_6_2.setBounds(0, 193, 757, 27);
		panel_3.add(panel_10_6_2);

		final JxLabel fSnacksBetweenLabel_2 = new JxLabel();
		fSnacksBetweenLabel_2.setTheme(theme);

		fSnacksBetweenLabel_2.setFontSize(12);
		fSnacksBetweenLabel_2.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_2
				.setText("I. Family or significant other involvement in care discussions");
		fSnacksBetweenLabel_2.setBounds(5, 10, 357, 14);
		panel_10_6_2.add(fSnacksBetweenLabel_2);

		final JxPanel panel_10_6_3 = new JxPanel();
		panel_10_6_3.setTheme(theme);

		panel_10_6_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_3.setLayout(null);
		panel_10_6_3.setBounds(0, 219, 757, 27);
		panel_3.add(panel_10_6_3);

		final JxLabel fSnacksBetweenLabel_3 = new JxLabel();
		fSnacksBetweenLabel_3.setTheme(theme);

		fSnacksBetweenLabel_3.setFontSize(12);
		fSnacksBetweenLabel_3.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_3.setText("J. Use of phone in private");
		fSnacksBetweenLabel_3.setBounds(5, 10, 237, 14);
		panel_10_6_3.add(fSnacksBetweenLabel_3);

		final JxPanel panel_10_6_4 = new JxPanel();
		panel_10_6_4.setTheme(theme);

		panel_10_6_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_4.setLayout(null);
		panel_10_6_4.setBounds(0, 244, 757, 27);
		panel_3.add(panel_10_6_4);

		final JxLabel fSnacksBetweenLabel_4 = new JxLabel();
		fSnacksBetweenLabel_4.setTheme(theme);

		fSnacksBetweenLabel_4.setFontSize(12);
		fSnacksBetweenLabel_4.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_4.setText("k. Place to lock personal belongings");
		fSnacksBetweenLabel_4.setBounds(5, 10, 237, 14);
		panel_10_6_4.add(fSnacksBetweenLabel_4);

		final JxPanel panel_10_6_5 = new JxPanel();
		panel_10_6_5.setTheme(theme);

		panel_10_6_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_5.setLayout(null);
		panel_10_6_5.setBounds(0, 270, 757, 26);
		panel_3.add(panel_10_6_5);

		final JxLabel fSnacksBetweenLabel_5 = new JxLabel();
		fSnacksBetweenLabel_5.setTheme(theme);

		fSnacksBetweenLabel_5.setFontSize(12);
		fSnacksBetweenLabel_5.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_5
				.setText("L. Reading books, newspapers, or magazines");
		fSnacksBetweenLabel_5.setBounds(5, 10, 324, 14);
		panel_10_6_5.add(fSnacksBetweenLabel_5);

		final JxPanel panel_10_6_6 = new JxPanel();
		panel_10_6_6.setTheme(theme);

		panel_10_6_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_6.setLayout(null);
		panel_10_6_6.setBounds(0, 294, 757, 25);
		panel_3.add(panel_10_6_6);

		final JxLabel fSnacksBetweenLabel_6 = new JxLabel();
		fSnacksBetweenLabel_6.setTheme(theme);

		fSnacksBetweenLabel_6.setFontSize(12);
		fSnacksBetweenLabel_6.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_6.setText("M. Listening to music");
		fSnacksBetweenLabel_6.setBounds(5, 10, 237, 14);
		panel_10_6_6.add(fSnacksBetweenLabel_6);

		final JxPanel panel_10_6_7 = new JxPanel();
		panel_10_6_7.setTheme(theme);

		panel_10_6_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_7.setLayout(null);
		panel_10_6_7.setBounds(0, 317, 757, 25);
		panel_3.add(panel_10_6_7);

		final JxLabel fSnacksBetweenLabel_7 = new JxLabel();
		fSnacksBetweenLabel_7.setTheme(theme);

		fSnacksBetweenLabel_7.setFontSize(12);
		fSnacksBetweenLabel_7.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_7.setText("N. Being around animals such as pets");
		fSnacksBetweenLabel_7.setBounds(5, 10, 237, 14);
		panel_10_6_7.add(fSnacksBetweenLabel_7);

		final JxPanel panel_10_6_8 = new JxPanel();
		panel_10_6_8.setTheme(theme);

		panel_10_6_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_8.setLayout(null);
		panel_10_6_8.setBounds(0, 341, 757, 25);
		panel_3.add(panel_10_6_8);

		final JxLabel fSnacksBetweenLabel_8 = new JxLabel();
		fSnacksBetweenLabel_8.setTheme(theme);

		fSnacksBetweenLabel_8.setFontSize(12);
		fSnacksBetweenLabel_8.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_8.setText("O. Keeping up with the news");
		fSnacksBetweenLabel_8.setBounds(5, 10, 237, 14);
		panel_10_6_8.add(fSnacksBetweenLabel_8);

		final JxPanel panel_10_6_9 = new JxPanel();
		panel_10_6_9.setTheme(theme);

		panel_10_6_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_9.setLayout(null);
		panel_10_6_9.setBounds(0, 365, 757, 25);
		panel_3.add(panel_10_6_9);

		final JxLabel fSnacksBetweenLabel_9 = new JxLabel();
		fSnacksBetweenLabel_9.setTheme(theme);

		fSnacksBetweenLabel_9.setFontSize(12);
		fSnacksBetweenLabel_9.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_9.setText("P. Doing things with group of people");
		fSnacksBetweenLabel_9.setBounds(5, 10, 237, 14);
		panel_10_6_9.add(fSnacksBetweenLabel_9);

		final JxPanel panel_10_6_10 = new JxPanel();
		panel_10_6_10.setTheme(theme);

		panel_10_6_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_10.setLayout(null);
		panel_10_6_10.setBounds(0, 389, 757, 25);
		panel_3.add(panel_10_6_10);

		final JxLabel fSnacksBetweenLabel_10 = new JxLabel();
		fSnacksBetweenLabel_10.setTheme(theme);

		fSnacksBetweenLabel_10.setFontSize(12);
		fSnacksBetweenLabel_10.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_10
				.setText("Q. Participating in favorite activities");
		fSnacksBetweenLabel_10.setBounds(5, 10, 237, 14);
		panel_10_6_10.add(fSnacksBetweenLabel_10);

		final JxPanel panel_10_6_11 = new JxPanel();
		panel_10_6_11.setTheme(theme);

		panel_10_6_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_11.setLayout(null);
		panel_10_6_11.setBounds(0, 413, 757, 25);
		panel_3.add(panel_10_6_11);

		final JxLabel fSnacksBetweenLabel_11 = new JxLabel();
		fSnacksBetweenLabel_11.setTheme(theme);

		fSnacksBetweenLabel_11.setFontSize(12);
		fSnacksBetweenLabel_11.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_11
				.setText("R. Spending time away from the nursing home");
		fSnacksBetweenLabel_11.setBounds(5, 10, 237, 14);
		panel_10_6_11.add(fSnacksBetweenLabel_11);

		final JxPanel panel_10_6_12 = new JxPanel();
		panel_10_6_12.setTheme(theme);

		panel_10_6_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_12.setLayout(null);
		panel_10_6_12.setBounds(0, 438, 761, 25);
		panel_3.add(panel_10_6_12);

		final JxLabel fSnacksBetweenLabel_12 = new JxLabel();
		fSnacksBetweenLabel_12.setTheme(theme);

		fSnacksBetweenLabel_12.setFontSize(12);
		fSnacksBetweenLabel_12.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_12.setText("S. Spending time outdoors");
		fSnacksBetweenLabel_12.setBounds(5, 10, 237, 14);
		panel_10_6_12.add(fSnacksBetweenLabel_12);

		final JxPanel panel_10_6_13 = new JxPanel();
		panel_10_6_13.setTheme(theme);

		panel_10_6_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_13.setLayout(null);
		panel_10_6_13.setBounds(0, 463, 757, 25);
		panel_3.add(panel_10_6_13);

		final JxLabel fSnacksBetweenLabel_13 = new JxLabel();
		fSnacksBetweenLabel_13.setTheme(theme);

		fSnacksBetweenLabel_13.setFontSize(13);
		fSnacksBetweenLabel_13.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_13
				.setText("T. Participating in religious activities or practices");
		fSnacksBetweenLabel_13.setBounds(5, 10, 237, 14);
		panel_10_6_13.add(fSnacksBetweenLabel_13);

		final JxPanel panel_10_6_14 = new JxPanel();
		panel_10_6_14.setTheme(theme);

		panel_10_6_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_6_14.setLayout(null);
		panel_10_6_14.setBounds(0, 487, 757, 26);
		panel_3.add(panel_10_6_14);

		final JxLabel fSnacksBetweenLabel_14 = new JxLabel();
		fSnacksBetweenLabel_14.setTheme(theme);

		fSnacksBetweenLabel_14.setFontSize(14);
		fSnacksBetweenLabel_14.setFontStyle(Font.BOLD);
		fSnacksBetweenLabel_14.setText("Z. None of the above");
		fSnacksBetweenLabel_14.setBounds(5, 10, 237, 14);
		panel_10_6_14.add(fSnacksBetweenLabel_14);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionF mds3sectionF = (Mds3SectionF) Mds3Controller.getInstance()
				.getSection(Mds3SectionF.class);
		mds3sectionF.setF0800Z(cbF0800Z.isSelected());
		mds3sectionF.setF0800T(cbF0800T.isSelected());
		mds3sectionF.setF0800S(cbF0800S.isSelected());
		mds3sectionF.setF0800R(cbF0800R.isSelected());
		mds3sectionF.setF0800Q(cbF0800Q.isSelected());
		mds3sectionF.setF0800P(cbF0800P.isSelected());
		mds3sectionF.setF0800O(cbF0800O.isSelected());
		mds3sectionF.setF0800N(cbF0800N.isSelected());
		mds3sectionF.setF0800M(cbF0800M.isSelected());
		mds3sectionF.setF0800L(cbF0800L.isSelected());
		mds3sectionF.setF0800K(cbF0800K.isSelected());
		mds3sectionF.setF0800J(cbF0800J.isSelected());
		mds3sectionF.setF0800I(cbF0800I.isSelected());
		mds3sectionF.setF0800H(cbF0800H.isSelected());
		mds3sectionF.setF0800G(cbF0800G.isSelected());
		mds3sectionF.setF0800F(cbF0800F.isSelected());
		mds3sectionF.setF0800E(cbF0800E.isSelected());
		mds3sectionF.setF0800D(cbF0800D.isSelected());
		mds3sectionF.setF0800C(cbF0800C.isSelected());
		mds3sectionF.setF0800B(cbF0800B.isSelected());
		mds3sectionF.setF0800A(cbF0800A.isSelected());

	}

	@Override
	public void doUpdate() {
		Mds3SectionF mds3sectionF = (Mds3SectionF) Mds3Controller.getInstance()
				.getSection(Mds3SectionF.class);
		cbF0800Z.setSelected(mds3sectionF.isF0800Z());
		cbF0800T.setSelected(mds3sectionF.isF0800T());
		cbF0800S.setSelected(mds3sectionF.isF0800S());
		cbF0800R.setSelected(mds3sectionF.isF0800R());
		cbF0800Q.setSelected(mds3sectionF.isF0800Q());
		cbF0800P.setSelected(mds3sectionF.isF0800P());
		cbF0800O.setSelected(mds3sectionF.isF0800O());
		cbF0800N.setSelected(mds3sectionF.isF0800N());
		cbF0800M.setSelected(mds3sectionF.isF0800M());
		cbF0800L.setSelected(mds3sectionF.isF0800L());
		cbF0800K.setSelected(mds3sectionF.isF0800K());
		cbF0800J.setSelected(mds3sectionF.isF0800J());
		cbF0800I.setSelected(mds3sectionF.isF0800I());
		cbF0800H.setSelected(mds3sectionF.isF0800H());
		cbF0800G.setSelected(mds3sectionF.isF0800G());
		cbF0800F.setSelected(mds3sectionF.isF0800F());
		cbF0800E.setSelected(mds3sectionF.isF0800E());
		cbF0800D.setSelected(mds3sectionF.isF0800D());
		cbF0800C.setSelected(mds3sectionF.isF0800C());
		cbF0800B.setSelected(mds3sectionF.isF0800B());
		cbF0800A.setSelected(mds3sectionF.isF0800A());

	}

}
