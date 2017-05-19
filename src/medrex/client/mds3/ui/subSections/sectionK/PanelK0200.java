package medrex.client.mds3.ui.subSections.sectionK;

import java.awt.Dimension;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionK.Mds3SectionK;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelK0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8298833336454179359L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtK0200A;
	private JxText txtK0200B;

	public PanelK0200() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 132));
		setLayout(null);

		final JxPanel panel_36 = new JxPanel();
		panel_36.setTheme(theme);
		panel_36.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_36.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 130);
		panel_36.setLayout(null);

		panel_36.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 133));
		add(panel_36);

		final JxPanel panel_37 = new JxPanel();
		panel_37.setTheme(theme);
		panel_37.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_37.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_37.setLayout(null);
		panel_37.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 32);
		panel_36.add(panel_37);

		final JxLabel g0900FunctionalRehabilitationLabel = new JxLabel();
		g0900FunctionalRehabilitationLabel.setTheme(theme);

		g0900FunctionalRehabilitationLabel.setFontSize(12);
		g0900FunctionalRehabilitationLabel
				.setText("<html><body><b>K0200. Height and Weight  </b> - While measuring, if the number is X.1 - X.4 round down ; X.5 or greater round up");
		g0900FunctionalRehabilitationLabel.setBounds(10, 8, 737, 14);
		panel_37.add(g0900FunctionalRehabilitationLabel);

		final JxPanel panel_38 = new JxPanel();
		panel_38.setTheme(theme);
		panel_38.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_38.setLayout(null);
		panel_38.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_38.setBounds(0, 31, 80, 99);
		panel_36.add(panel_38);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 103, 58, 14);
		panel_38.add(enterCodeLabel_2);

		txtK0200A = new JxText();
		txtK0200A.setTheme(theme);
		txtK0200A.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		txtK0200A.setBounds(10, 10, 54, 20);
		panel_38.add(txtK0200A);

		final JxLabel inchesLabel = new JxLabel();
		inchesLabel.setTheme(theme);

		inchesLabel.setText("inches");
		inchesLabel.setBounds(10, 31, 54, 14);
		panel_38.add(inchesLabel);

		txtK0200B = new JxText();
		txtK0200B.setTheme(theme);
		txtK0200B.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		txtK0200B.setBounds(10, 65, 54, 20);
		panel_38.add(txtK0200B);

		final JxLabel poundsLabel = new JxLabel();
		poundsLabel.setTheme(theme);

		poundsLabel.setText("pounds");
		poundsLabel.setBounds(10, 81, 66, 14);
		panel_38.add(poundsLabel);

		final JxPanel panel_39 = new JxPanel();
		panel_39.setTheme(theme);
		panel_39.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_39.setLayout(null);

		panel_39.setBounds(79, 31, 760, 50);
		panel_36.add(panel_39);

		final JxLabel aResidentBelievesLabel = new JxLabel();
		aResidentBelievesLabel.setTheme(theme);

		aResidentBelievesLabel.setFontSize(12);
		aResidentBelievesLabel
				.setText("<html><body><b>A. Height </b> (in inches ). Record most recent height measure since admission");
		aResidentBelievesLabel.setBounds(10, 12, 532, 14);
		panel_39.add(aResidentBelievesLabel);

		final JxPanel panel_40 = new JxPanel();
		panel_40.setTheme(theme);
		panel_40.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_40.setLayout(null);

		panel_40.setBounds(79, 80, 760, 50);
		panel_36.add(panel_40);

		final JxLabel bDirectCareLabel = new JxLabel();
		bDirectCareLabel.setTheme(theme);

		bDirectCareLabel.setFontSize(12);
		bDirectCareLabel
				.setText("<html><body><b>B. Weight </b> (in ponds). Base weight on most recent measure in last 30days; measure weight consistently, according to standard </br> facility practice (eg. in a.m. after voiding, before meal, with shoes off, etc.)");
		bDirectCareLabel.setBounds(10, 10, 645, 30);
		panel_40.add(bDirectCareLabel);

		final JxText textField_5 = new JxText();
		textField_5.setTheme(theme);
		textField_5.setBounds(-37, 9, 22, 20);
		panel_40.add(textField_5);
		doUpdate();

	}

	@Override
	public void doSave() {

		Mds3SectionK mds3sectionK = (Mds3SectionK) Mds3Controller.getInstance()
				.getSection(Mds3SectionK.class);
		mds3sectionK.setK0200A(getDouble(txtK0200A.getText()));
		mds3sectionK.setK0200B(getDouble(txtK0200B.getText()));

	}

	double getDouble(String string) {
		try {
			return (Double.parseDouble(string));
		} catch (Exception e) {
			return 0.0;
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionK mds3sectionK = (Mds3SectionK) Mds3Controller.getInstance()
				.getSection(Mds3SectionK.class);
		txtK0200A.setText(mds3sectionK.getK0200A() + "");
		txtK0200B.setText(mds3sectionK.getK0200B() + "");

	}
}
