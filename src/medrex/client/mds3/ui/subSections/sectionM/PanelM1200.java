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

public class PanelM1200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6875175002473735899L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cb1200J;
	private JxCheckBox cb1200I;
	private JxCheckBox cb1200H;
	private JxCheckBox cb1200G;
	private JxCheckBox cb1200F;
	private JxCheckBox cb1200E;
	private JxCheckBox cb1200D;
	private JxCheckBox cb1200C;
	private JxCheckBox cb1200B;
	private JxCheckBox cb1200A;
	private JxCheckBox cbM0100B;
	private JxCheckBox cbM0100C;
	private JxCheckBox cbM0100D;
	private JxCheckBox cbM0100A;

	public PanelM1200() {
		super();
		setPreferredSize(new Dimension(840, 284));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 284);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, 840, 25);
		panel.add(panel_1);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setFontStyle(Font.BOLD);
		label.setText("M1200. Skin and Ulcer Treatments");
		label.setBounds(0, 0, 841, 25);
		panel_1.add(label);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 24, 840, 25);

		panel.add(panel_1_1);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setFontStyle(Font.BOLD);
		label_1.setText("Check all that apply");
		label_1.setBounds(10, 0, 785, 25);
		panel_1_1.add(label_1);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(0, 49, 80, 235);
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_2);

		cb1200A = new JxCheckBox();
		cb1200A.setTheme(theme);

		cb1200A.setText("New JxCheckBox");
		cb1200A.setBounds(25, 5, 20, 24);
		panel_2.add(cb1200A);

		cb1200B = new JxCheckBox();
		cb1200B.setTheme(theme);

		cb1200B.setText("New JxCheckBox");
		cb1200B.setBounds(25, 25, 20, 24);
		panel_2.add(cb1200B);

		cb1200C = new JxCheckBox();
		cb1200C.setTheme(theme);

		cb1200C.setText("New JxCheckBox");
		cb1200C.setBounds(25, 50, 20, 24);
		panel_2.add(cb1200C);

		cb1200D = new JxCheckBox();
		cb1200D.setTheme(theme);

		cb1200D.setText("New JxCheckBox");
		cb1200D.setBounds(25, 69, 20, 24);
		panel_2.add(cb1200D);

		cb1200E = new JxCheckBox();
		cb1200E.setTheme(theme);

		cb1200E.setText("New JxCheckBox");
		cb1200E.setBounds(25, 90, 20, 24);
		panel_2.add(cb1200E);

		cb1200J = new JxCheckBox();
		cb1200J.setTheme(theme);

		cb1200J.setText("New JxCheckBox");
		cb1200J.setBounds(25, 208, 20, 24);
		panel_2.add(cb1200J);

		cb1200I = new JxCheckBox();
		cb1200I.setTheme(theme);

		cb1200I.setText("New JxCheckBox");
		cb1200I.setBounds(25, 190, 20, 24);
		panel_2.add(cb1200I);

		cb1200H = new JxCheckBox();
		cb1200H.setTheme(theme);

		cb1200H.setText("New JxCheckBox");
		cb1200H.setBounds(25, 165, 20, 24);
		panel_2.add(cb1200H);

		cb1200G = new JxCheckBox();
		cb1200G.setTheme(theme);

		cb1200G.setText("New JxCheckBox");
		cb1200G.setBounds(25, 140, 20, 24);
		panel_2.add(cb1200G);

		cb1200F = new JxCheckBox();
		cb1200F.setTheme(theme);

		cb1200F.setText("New JxCheckBox");
		cb1200F.setBounds(25, 115, 20, 24);
		panel_2.add(cb1200F);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(79, 49, 761, 234);

		panel.add(panel_3);

		final JxPanel panel_1_1_1 = new JxPanel();
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(1, 0, 759, 25);

		panel_3.add(panel_1_1_1);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);

		label_1_1.setFontSize(12);
		label_1_1
				.setText("<html><body> <b> A. Pressure reducing device for chair");
		label_1_1.setBounds(10, 0, 687, 25);
		panel_1_1_1.add(label_1_1);

		final JxPanel panel_1_1_1_1 = new JxPanel();
		panel_1_1_1_1.setTheme(theme);
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBounds(1, 23, 759, 25);

		panel_3.add(panel_1_1_1_1);

		final JxLabel label_1_1_1 = new JxLabel();
		label_1_1_1.setTheme(theme);

		label_1_1_1.setFontSize(12);
		label_1_1_1
				.setText("<html><body> <b> B. Pressure reducing device for bed");
		label_1_1_1.setBounds(10, 5, 725, 25);
		panel_1_1_1_1.add(label_1_1_1);

		final JxPanel panel_1_1_1_2 = new JxPanel();
		panel_1_1_1_2.setTheme(theme);
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBounds(1, 47, 759, 25);

		panel_3.add(panel_1_1_1_2);

		final JxLabel label_1_1_2 = new JxLabel();
		label_1_1_2.setTheme(theme);

		label_1_1_2.setFontSize(12);
		label_1_1_2
				.setText("<html><body> <b> C. Turning/repositioning program");
		label_1_1_2.setBounds(10, 0, 741, 25);
		panel_1_1_1_2.add(label_1_1_2);

		final JxPanel panel_1_1_1_3 = new JxPanel();
		panel_1_1_1_3.setTheme(theme);
		panel_1_1_1_3.setLayout(null);
		panel_1_1_1_3.setBounds(1, 69, 759, 25);

		panel_3.add(panel_1_1_1_3);

		final JxLabel label_1_1_3 = new JxLabel();
		label_1_1_3.setTheme(theme);

		label_1_1_3.setFontSize(12);
		label_1_1_3
				.setText("<html><body> <b>D. Nutrition or hydration intervention </b> to manage skin problems");
		label_1_1_3.setBounds(10, 0, 700, 25);
		panel_1_1_1_3.add(label_1_1_3);

		final JxPanel panel_1_1_1_4 = new JxPanel();
		panel_1_1_1_4.setTheme(theme);
		panel_1_1_1_4.setLayout(null);
		panel_1_1_1_4.setBounds(1, 92, 691, 25);

		panel_3.add(panel_1_1_1_4);

		final JxLabel label_1_1_4 = new JxLabel();
		label_1_1_4.setTheme(theme);

		label_1_1_4.setFontSize(12);
		label_1_1_4.setText("<html><body> <b> E. Ulcer care");
		label_1_1_4.setBounds(10, 0, 831, 25);
		panel_1_1_1_4.add(label_1_1_4);

		final JxPanel panel_1_1_1_5 = new JxPanel();
		panel_1_1_1_5.setTheme(theme);
		panel_1_1_1_5.setLayout(null);
		panel_1_1_1_5.setBounds(1, 116, 759, 25);

		panel_3.add(panel_1_1_1_5);

		final JxLabel label_1_1_5 = new JxLabel();
		label_1_1_5.setTheme(theme);

		label_1_1_5.setFontSize(12);
		label_1_1_5.setText("<html><body> <b> F. Surgical wound care");
		label_1_1_5.setBounds(10, 0, 668, 25);
		panel_1_1_1_5.add(label_1_1_5);

		final JxPanel panel_1_1_1_6 = new JxPanel();
		panel_1_1_1_6.setTheme(theme);
		panel_1_1_1_6.setLayout(null);
		panel_1_1_1_6.setBounds(1, 139, 759, 25);

		panel_3.add(panel_1_1_1_6);

		final JxLabel label_1_1_6 = new JxLabel();
		label_1_1_6.setTheme(theme);

		label_1_1_6.setFontSize(12);
		label_1_1_6
				.setText("<html><body> <b> G. Application of nonsurgical dressings </b> (with or without topical medications) other than to feet ");
		label_1_1_6.setBounds(10, 0, 729, 25);
		panel_1_1_1_6.add(label_1_1_6);

		final JxPanel panel_1_1_1_7 = new JxPanel();
		panel_1_1_1_7.setTheme(theme);
		panel_1_1_1_7.setLayout(null);
		panel_1_1_1_7.setBounds(1, 166, 759, 25);

		panel_3.add(panel_1_1_1_7);

		final JxLabel label_1_1_7 = new JxLabel();
		label_1_1_7.setTheme(theme);

		label_1_1_7.setFontSize(12);
		label_1_1_7
				.setText("<html><body> <b> H. Application of ointments /medications </b> other than to feet");
		label_1_1_7.setBounds(10, 0, 661, 25);
		panel_1_1_1_7.add(label_1_1_7);

		final JxPanel panel_1_1_1_8 = new JxPanel();
		panel_1_1_1_8.setTheme(theme);
		panel_1_1_1_8.setLayout(null);
		panel_1_1_1_8.setBounds(1, 188, 759, 25);

		panel_3.add(panel_1_1_1_8);

		final JxLabel label_1_1_8 = new JxLabel();
		label_1_1_8.setTheme(theme);

		label_1_1_8.setFontSize(12);
		label_1_1_8
				.setText("<html><body> <b> I. Application of dressings to feet </b> (with or without topical medications) ");
		label_1_1_8.setBounds(10, 0, 629, 25);
		panel_1_1_1_8.add(label_1_1_8);

		final JxPanel panel_1_1_1_9 = new JxPanel();
		panel_1_1_1_9.setTheme(theme);
		panel_1_1_1_9.setLayout(null);
		panel_1_1_1_9.setBounds(1, 211, 751, 23);

		panel_3.add(panel_1_1_1_9);

		final JxLabel label_1_1_9 = new JxLabel();
		label_1_1_9.setTheme(theme);

		label_1_1_9.setFontSize(12);
		label_1_1_9
				.setText("<html><body> <b>J. None of the above </b> were provided");
		label_1_1_9.setBounds(10, 0, 673, 23);
		panel_1_1_1_9.add(label_1_1_9);
		doUpdate();
	}

	@Override
	public void doSave() {

		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		mds3sectionM.setM1200J(cb1200J.isSelected());
		mds3sectionM.setM1200I(cb1200I.isSelected());
		mds3sectionM.setM1200H(cb1200H.isSelected());
		mds3sectionM.setM1200G(cb1200G.isSelected());
		mds3sectionM.setM1200F(cb1200F.isSelected());
		mds3sectionM.setM1200E(cb1200E.isSelected());
		mds3sectionM.setM1200D(cb1200D.isSelected());
		mds3sectionM.setM1200C(cb1200C.isSelected());
		mds3sectionM.setM1200B(cb1200B.isSelected());
		mds3sectionM.setM1200A(cb1200A.isSelected());
		/*
		 * mds3sectionM.setM0100B(cbM0100B.isSelected());
		 * mds3sectionM.setM0100C(cbM0100C.isSelected());
		 * mds3sectionM.setM0100D(cbM0100D.isSelected());
		 */
		// mds3sectionM.setM0100A(cbM0100A.isSelected());
	}

	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cb1200J.setSelected(mds3sectionM.isM1200J());
		cb1200I.setSelected(mds3sectionM.isM1200I());
		cb1200H.setSelected(mds3sectionM.isM1200H());
		cb1200G.setSelected(mds3sectionM.isM1200G());
		cb1200F.setSelected(mds3sectionM.isM1200F());
		cb1200E.setSelected(mds3sectionM.isM1200E());
		cb1200D.setSelected(mds3sectionM.isM1200D());
		cb1200C.setSelected(mds3sectionM.isM1200C());
		cb1200B.setSelected(mds3sectionM.isM1200B());
		cb1200A.setSelected(mds3sectionM.isM1200A());
		// cbM0100B.setSelected(mds3sectionM.isM0100B());
		// cbM0100C.setSelected(mds3sectionM.isM0100C());
		// cbM0100D.setSelected(mds3sectionM.isM0100D());
		// cbM0100A.setSelected(mds3sectionM.isM0100A());

	}

}
