package medrex.client.mds3.ui.subSections.sectionE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionE.Mds3SectionE;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelE0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4123232817835971847L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbE0100C;
	private JxCheckBox cbE0100B;
	private JxCheckBox cbE0100A;

	public PanelE0100() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 120));
		setBackground(Color.WHITE);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setBounds(0, 0, 840, 120);
		add(panel_1_2);

		panel_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 120));

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_7);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBounds(0, 0, 840, 25);
		panel_1_2.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);

		a0100Label_2.setFontSize(12);
		a0100Label_2.setFontStyle(Font.BOLD);
		a0100Label_2.setText("E0100. Psychosis");
		panel_5_2.add(a0100Label_2);

		final JxLabel checkAllThatLabel = new JxLabel();
		checkAllThatLabel.setTheme(theme);
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(49, 31, 373, 14);
		panel_1_2.add(checkAllThatLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));

		panel_5.setLayout(null);
		panel_5.setBounds(0, 51, 840, 69);
		panel_1_2.add(panel_5);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);

		panel_6.setBounds(0, 0, 840, 23);
		panel_5.add(panel_6);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setLayout(null);
		panel_12.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_12.setBounds(1, 0, 79, 23);
		panel_6.add(panel_12);

		cbE0100A = new JxCheckBox();
		cbE0100A.setTheme(theme);
		cbE0100A.setBounds(29, 5, 21, 21);

		cbE0100A.setText("");
		panel_12.add(cbE0100A);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_13.setLayout(null);

		panel_13.setBounds(80, 0, 760, 23);
		panel_6.add(panel_13);

		final JxLabel aHallucinationsperceptualLabel = new JxLabel();
		aHallucinationsperceptualLabel.setTheme(theme);

		aHallucinationsperceptualLabel.setFontSize(12);
		aHallucinationsperceptualLabel
				.setText("<html><body><b> A. Hallucinations </b> (perceptual experiences in the absence of real external sensory stimuli)");
		aHallucinationsperceptualLabel.setBounds(10, 0, 598, 23);
		panel_13.add(aHallucinationsperceptualLabel);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);

		panel_7.setBounds(0, 23, 840, 23);
		panel_5.add(panel_7);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setLayout(null);
		panel_14.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_14.setBounds(1, 0, 79, 23);
		panel_7.add(panel_14);

		cbE0100B = new JxCheckBox();
		cbE0100B.setTheme(theme);
		cbE0100B.setBounds(29, 5, 21, 21);

		cbE0100B.setText("");
		panel_14.add(cbE0100B);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_15.setLayout(null);

		panel_15.setBounds(80, 0, 760, 23);
		panel_7.add(panel_15);

		final JxLabel bDelusionsmisconceptionsLabel = new JxLabel();
		bDelusionsmisconceptionsLabel.setTheme(theme);

		bDelusionsmisconceptionsLabel.setFontSize(12);
		bDelusionsmisconceptionsLabel
				.setText("<html><body><b> B. Delusions</b>(misconceptions or beliefs that are firmly held ,contrary to reality)");
		bDelusionsmisconceptionsLabel.setBounds(10, 0, 508, 23);
		panel_15.add(bDelusionsmisconceptionsLabel);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);

		panel_8.setBounds(0, 46, 840, 23);
		panel_5.add(panel_8);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setLayout(null);
		panel_16.setBounds(1, 0, 79, 23);
		panel_16.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_8.add(panel_16);

		cbE0100C = new JxCheckBox();
		cbE0100C.setTheme(theme);
		cbE0100C.setBounds(29, 5, 21, 21);

		cbE0100C.setText("");
		panel_16.add(cbE0100C);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);
		panel_17.setLayout(null);
		panel_17.setBorder(new LineBorder(Color.black, 1, false));

		panel_17.setBounds(80, 0, 760, 23);
		panel_8.add(panel_17);

		final JxLabel zNoneOfLabel = new JxLabel();
		zNoneOfLabel.setTheme(theme);
		zNoneOfLabel.setText("<html><body><b>Z. None of the above");
		zNoneOfLabel.setBounds(10, 0, 503, 23);
		panel_17.add(zNoneOfLabel);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		mds3sectionE.setE0100A(cbE0100A.isSelected());
		mds3sectionE.setE0100B(cbE0100B.isSelected());
		mds3sectionE.setE0100C(cbE0100C.isSelected());
	}

	public void doUpdate() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		cbE0100A.setSelected(mds3sectionE.isE0100A());
		cbE0100B.setSelected(mds3sectionE.isE0100B());
		cbE0100C.setSelected(mds3sectionE.isE0100C());

	}
}
