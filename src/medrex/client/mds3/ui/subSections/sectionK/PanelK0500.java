package medrex.client.mds3.ui.subSections.sectionK;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionK.Mds3SectionK;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelK0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4216491723891018637L;

	Theme theme = new BlackOverWhiteTheme();

	private JxCheckBox cbk0500Z;
	private JxCheckBox cbk0500D;
	private JxCheckBox cbk0500C;
	private JxCheckBox cbk0500B;
	private JxCheckBox cbk0500A;

	public PanelK0500() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 175));
		setLayout(null);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_8.setLayout(null);

		panel_8.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 174);
		add(panel_8);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 30);
		panel_8.add(panel_9);

		final JxLabel k0500NutritionalApproachesLabel = new JxLabel();
		k0500NutritionalApproachesLabel.setTheme(theme);

		k0500NutritionalApproachesLabel.setFontSize(12);
		k0500NutritionalApproachesLabel.setFontStyle(Font.BOLD);
		k0500NutritionalApproachesLabel
				.setText("K0500. Nutritional Approaches");
		k0500NutritionalApproachesLabel.setBounds(10, 10, 487, 14);
		panel_9.add(k0500NutritionalApproachesLabel);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_10.setLayout(null);
		panel_10.setBounds(0, 29, Mds3Constants.PAGE_WIDTH, 26);
		panel_8.add(panel_10);

		final JxLabel checkAllLabel = new JxLabel();
		checkAllLabel.setTheme(theme);

		checkAllLabel.setFontSize(12);
		checkAllLabel.setText("<html><body><b> Check all that apply </b>");
		checkAllLabel.setBounds(50, 7, 230, 14);
		panel_10.add(checkAllLabel);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_11.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_11.setLayout(null);
		panel_11.setBounds(0, 54, 80, 119);
		panel_8.add(panel_11);

		cbk0500A = new JxCheckBox();
		cbk0500A.setTheme(theme);

		cbk0500A.setText("New JxCheckBox");
		cbk0500A.setBounds(25, 6, 14, 17);
		panel_11.add(cbk0500A);

		cbk0500B = new JxCheckBox();
		cbk0500B.setTheme(theme);

		cbk0500B.setText("New JxCheckBox");
		cbk0500B.setBounds(25, 29, 14, 17);
		panel_11.add(cbk0500B);

		cbk0500C = new JxCheckBox();
		cbk0500C.setTheme(theme);

		cbk0500C.setText("New JxCheckBox");
		cbk0500C.setBounds(25, 52, 14, 17);
		panel_11.add(cbk0500C);

		cbk0500D = new JxCheckBox();
		cbk0500D.setTheme(theme);

		cbk0500D.setText("New JxCheckBox");
		cbk0500D.setBounds(25, 75, 14, 17);
		panel_11.add(cbk0500D);

		cbk0500Z = new JxCheckBox();
		cbk0500Z.setTheme(theme);

		cbk0500Z.setText("New JxCheckBox");
		cbk0500Z.setBounds(25, 98, 14, 17);
		panel_11.add(cbk0500Z);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_12.setLayout(null);
		panel_12.setBounds(79, 54, 761, 26);
		panel_8.add(panel_12);

		final JxLabel aParenteralivLabel = new JxLabel();
		aParenteralivLabel.setTheme(theme);

		aParenteralivLabel.setFontSize(12);
		aParenteralivLabel.setText("<html><body><b> A. Parenteral/IV feeding");
		aParenteralivLabel.setBounds(10, 6, 223, 14);
		panel_12.add(aParenteralivLabel);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_13.setLayout(null);
		panel_13.setBounds(79, 79, 761, 25);
		panel_8.add(panel_13);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);

		bLabel.setFontSize(12);
		bLabel
				.setText("<html><body> <b> B. Feeding tube </b> - nasogastric or abdominal (PEG)");
		bLabel.setBounds(10, 6, 290, 14);
		panel_13.add(bLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_14.setLayout(null);
		panel_14.setBounds(79, 102, 761, 25);
		panel_8.add(panel_14);

		final JxLabel cMechanicallyLabel = new JxLabel();
		cMechanicallyLabel.setTheme(theme);

		cMechanicallyLabel.setFontSize(12);
		cMechanicallyLabel
				.setText("<html><body><b> C. Mechanically altered diet </b> -require change in texture of food or liquids (e.g., pured food, thickened liquids)");
		cMechanicallyLabel.setBounds(10, 6, 612, 14);
		panel_14.add(cMechanicallyLabel);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_15.setLayout(null);
		panel_15.setBounds(79, 125, 761, 25);
		panel_8.add(panel_15);

		final JxLabel dTherapeuticLabel = new JxLabel();
		dTherapeuticLabel.setTheme(theme);

		dTherapeuticLabel.setFontSize(12);
		dTherapeuticLabel
				.setText("<html><body><b> D. Therapeutic diet </b> (e.g.,low salt, diabetic, low cholesterol)");
		dTherapeuticLabel.setBounds(10, 6, 391, 14);
		panel_15.add(dTherapeuticLabel);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_16.setLayout(null);
		panel_16.setBounds(79, 148, 761, 25);
		panel_8.add(panel_16);

		final JxLabel zNoneLabel = new JxLabel();
		zNoneLabel.setTheme(theme);

		zNoneLabel.setFontSize(12);
		zNoneLabel.setText("<html><body><b> Z. None of the above </b>");
		zNoneLabel.setBounds(10, 6, 303, 14);
		panel_16.add(zNoneLabel);
		doUpdate();

	}

	public void doSave() {

		Mds3SectionK mds3sectionK = (Mds3SectionK) Mds3Controller.getInstance()
				.getSection(Mds3SectionK.class);
		mds3sectionK.setK0500A(cbk0500A.isSelected());
		mds3sectionK.setK0500B(cbk0500B.isSelected());
		mds3sectionK.setK0500C(cbk0500C.isSelected());
		mds3sectionK.setK0500D(cbk0500D.isSelected());
		mds3sectionK.setK0500Z(cbk0500Z.isSelected());

	}

	@Override
	public void doUpdate() {
		Mds3SectionK mds3sectionK = (Mds3SectionK) Mds3Controller.getInstance()
				.getSection(Mds3SectionK.class);
		cbk0500A.setSelected(mds3sectionK.isK0500A());
		cbk0500B.setSelected(mds3sectionK.isK0500B());
		cbk0500C.setSelected(mds3sectionK.isK0500C());
		cbk0500D.setSelected(mds3sectionK.isK0500D());
		cbk0500Z.setSelected(mds3sectionK.isK0500Z());
	}

}
