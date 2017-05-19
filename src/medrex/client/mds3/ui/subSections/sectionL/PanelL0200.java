package medrex.client.mds3.ui.subSections.sectionL;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.sectionL.Mds3SectionL;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelL0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3577552051952440447L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbL0200Z;
	private JxCheckBox cbL0200G;
	private JxCheckBox cbL0200F;
	private JxCheckBox cbL0200E;
	private JxCheckBox cbL0200D;
	private JxCheckBox cbL0200C;
	private JxCheckBox cbL0200B;
	private JxCheckBox cbL0200A;

	public PanelL0200() {
		super();
		setPreferredSize(new Dimension(840, 205));
		setLayout(null);

		final JxPanel panel_25 = new JxPanel();
		panel_25.setTheme(theme);

		panel_25.setLayout(null);
		panel_25.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 205);
		add(panel_25);

		final JxPanel panel_26 = new JxPanel();
		panel_26.setTheme(theme);
		panel_26.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_26.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);

		panel_26.setLayout(null);
		panel_26.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_25.add(panel_26);

		final JxLabel l0200DentalLabel = new JxLabel();
		l0200DentalLabel.setTheme(theme);

		l0200DentalLabel.setFontSize(12);
		l0200DentalLabel.setFontStyle(Font.BOLD);
		l0200DentalLabel.setText("L0200. Dental");
		l0200DentalLabel.setBounds(10, 6, 236, 14);
		panel_26.add(l0200DentalLabel);

		final JxPanel panel_41 = new JxPanel();
		panel_41.setTheme(theme);
		panel_41.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_41.setLayout(null);
		panel_41.setBounds(0, 24, 840, 25);
		panel_25.add(panel_41);

		final JxLabel checkAllThatLabel = new JxLabel();
		checkAllThatLabel.setTheme(theme);

		checkAllThatLabel.setFontSize(12);
		checkAllThatLabel.setFontStyle(Font.BOLD);
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(58, 6, 221, 14);
		panel_41.add(checkAllThatLabel);

		final JxPanel panel_42 = new JxPanel();
		panel_42.setTheme(theme);
		panel_42.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_42.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_42.setLayout(null);
		panel_42.setBounds(0, 48, 80, 156);
		panel_25.add(panel_42);

		cbL0200A = new JxCheckBox();
		cbL0200A.setTheme(theme);

		cbL0200A.setText("New JxCheckBox");
		cbL0200A.setBounds(25, 4, 14, 15);
		panel_42.add(cbL0200A);

		cbL0200B = new JxCheckBox();
		cbL0200B.setTheme(theme);

		cbL0200B.setText("New JxCheckBox");
		cbL0200B.setBounds(25, 23, 14, 15);
		panel_42.add(cbL0200B);

		cbL0200C = new JxCheckBox();
		cbL0200C.setTheme(theme);

		cbL0200C.setBounds(25, 41, 14, 15);
		panel_42.add(cbL0200C);
		cbL0200C.setText("New JxCheckBox");

		cbL0200D = new JxCheckBox();
		cbL0200D.setTheme(theme);

		cbL0200D.setText("New JxCheckBox");
		cbL0200D.setBounds(25, 60, 14, 15);
		panel_42.add(cbL0200D);

		cbL0200E = new JxCheckBox();
		cbL0200E.setTheme(theme);

		cbL0200E.setText("New JxCheckBox");
		cbL0200E.setBounds(25, 80, 14, 15);
		panel_42.add(cbL0200E);

		cbL0200F = new JxCheckBox();
		cbL0200F.setTheme(theme);

		cbL0200F.setText("New JxCheckBox");
		cbL0200F.setBounds(25, 100, 14, 15);
		panel_42.add(cbL0200F);

		cbL0200G = new JxCheckBox();
		cbL0200G.setTheme(theme);

		cbL0200G.setText("New JxCheckBox");
		cbL0200G.setBounds(25, 119, 14, 15);
		panel_42.add(cbL0200G);

		cbL0200Z = new JxCheckBox();
		cbL0200Z.setTheme(theme);

		cbL0200Z.setText("New JxCheckBox");
		cbL0200Z.setBounds(25, 140, 14, 15);
		panel_42.add(cbL0200Z);

		final JxPanel panel_43 = new JxPanel();
		panel_43.setTheme(theme);
		panel_43.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_43.setLayout(null);
		panel_43.setBounds(79, 48, 761, 21);
		panel_25.add(panel_43);

		final JxLabel aBrokenLabel = new JxLabel();
		aBrokenLabel.setTheme(theme);

		aBrokenLabel.setFontSize(12);
		aBrokenLabel
				.setText("<html><body><b> A. Broken or loosely fitting full or partial denture </b> (chipped, cracked, uncleanable, or loose)");
		aBrokenLabel.setBounds(10, 4, 644, 14);
		panel_43.add(aBrokenLabel);

		final JxPanel panel_44 = new JxPanel();
		panel_44.setTheme(theme);
		panel_44.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_44.setLayout(null);
		panel_44.setBounds(79, 67, 761, 21);
		panel_25.add(panel_44);

		final JxLabel bNoLabel = new JxLabel();
		bNoLabel.setTheme(theme);

		bNoLabel.setFontSize(12);
		bNoLabel
				.setText("<html><body><b> B. No natural teeth or tooth fragment(s) </b> (edentulous)");
		bNoLabel.setBounds(10, 4, 467, 14);
		panel_44.add(bNoLabel);

		final JxPanel panel_45 = new JxPanel();
		panel_45.setTheme(theme);
		panel_45.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_45.setLayout(null);

		panel_45.setBounds(79, 86, 761, 21);
		panel_25.add(panel_45);

		final JxLabel cAbnormalLabel = new JxLabel();
		cAbnormalLabel.setTheme(theme);

		cAbnormalLabel.setFontSize(12);
		cAbnormalLabel
				.setText("<html><body><b> C. Abnormal mouth tissue </b> (ulcers, masses, oral lesions, including under denture or partial if one is worn )");
		cAbnormalLabel.setBounds(10, 4, 588, 14);
		panel_45.add(cAbnormalLabel);

		final JxPanel panel_46 = new JxPanel();
		panel_46.setTheme(theme);
		panel_46.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_46.setLayout(null);
		panel_46.setBounds(79, 105, 761, 21);
		panel_25.add(panel_46);

		final JxLabel dObviousLabel = new JxLabel();
		dObviousLabel.setTheme(theme);

		dObviousLabel.setFontSize(12);
		dObviousLabel
				.setText("<html><body><b> D. Obvious or likely cavity or broken natural teeth </b>");
		dObviousLabel.setBounds(10, 4, 400, 14);
		panel_46.add(dObviousLabel);

		final JxPanel panel_47 = new JxPanel();
		panel_47.setTheme(theme);
		panel_47.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_47.setLayout(null);

		panel_47.setBounds(79, 124, 761, 21);
		panel_25.add(panel_47);

		final JxLabel eInflamedLabel = new JxLabel();
		eInflamedLabel.setTheme(theme);

		eInflamedLabel.setFontSize(12);
		eInflamedLabel
				.setText("<html><body><b> E. Inflamed or bleeding gums or loose natural teeth</b>");
		eInflamedLabel.setBounds(10, 4, 575, 14);
		panel_47.add(eInflamedLabel);

		final JxPanel panel_48 = new JxPanel();
		panel_48.setTheme(theme);
		panel_48.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_48.setLayout(null);
		panel_48.setBounds(79, 143, 761, 21);
		panel_25.add(panel_48);

		final JxLabel fMouthOrLabel = new JxLabel();
		fMouthOrLabel.setTheme(theme);

		fMouthOrLabel.setFontSize(12);
		fMouthOrLabel
				.setText("<html><body><b>F. Mouth or facial pain, discomfort or difficulty with chewing");
		fMouthOrLabel.setBounds(10, 4, 388, 14);
		panel_48.add(fMouthOrLabel);

		final JxPanel panel_49 = new JxPanel();
		panel_49.setTheme(theme);
		panel_49.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_49.setLayout(null);

		panel_49.setBounds(79, 163, 761, 21);
		panel_25.add(panel_49);

		final JxLabel gUnableToLabel = new JxLabel();
		gUnableToLabel.setTheme(theme);

		gUnableToLabel.setFontSize(12);
		gUnableToLabel.setFontStyle(Font.BOLD);
		gUnableToLabel.setText("<html><body><b>G. Unable to examine </b>");
		gUnableToLabel.setBounds(10, 4, 315, 14);
		panel_49.add(gUnableToLabel);

		final JxPanel panel_50 = new JxPanel();
		panel_50.setTheme(theme);
		panel_50.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_50.setLayout(null);
		panel_50.setBounds(79, 183, 761, 21);
		panel_25.add(panel_50);

		final JxLabel zNoneLabel_1 = new JxLabel();
		zNoneLabel_1.setTheme(theme);

		zNoneLabel_1.setFontSize(12);
		zNoneLabel_1.setFontStyle(Font.BOLD);
		zNoneLabel_1
				.setText("<html><body><b> Z. None of the above were present");
		zNoneLabel_1.setBounds(10, 4, 232, 14);
		panel_50.add(zNoneLabel_1);
		doUpdate();

	}

	@Override
	public void doSave() {

		Mds3SectionL mds3sectionL = (Mds3SectionL) Mds3Controller.getInstance()
				.getSection(Mds3SectionL.class);
		mds3sectionL.setL0200A(cbL0200A.isSelected());
		mds3sectionL.setL0200B(cbL0200B.isSelected());
		mds3sectionL.setL0200C(cbL0200C.isSelected());
		mds3sectionL.setL0200D(cbL0200D.isSelected());
		mds3sectionL.setL0200E(cbL0200E.isSelected());
		mds3sectionL.setL0200F(cbL0200F.isSelected());
		mds3sectionL.setL0200G(cbL0200G.isSelected());
		mds3sectionL.setL0200Z(cbL0200Z.isSelected());

	}

	@Override
	public void doUpdate() {
		Mds3SectionL mds3sectionL = (Mds3SectionL) Mds3Controller.getInstance()
				.getSection(Mds3SectionL.class);
		cbL0200A.setSelected(mds3sectionL.isL0200A());
		cbL0200B.setSelected(mds3sectionL.isL0200B());
		cbL0200C.setSelected(mds3sectionL.isL0200C());
		cbL0200D.setSelected(mds3sectionL.isL0200D());
		cbL0200E.setSelected(mds3sectionL.isL0200E());
		cbL0200F.setSelected(mds3sectionL.isL0200F());
		cbL0200G.setSelected(mds3sectionL.isL0200G());
		cbL0200Z.setSelected(mds3sectionL.isL0200Z());
	}

}
