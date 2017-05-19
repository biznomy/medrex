package medrex.client.mds3.ui.subSections.sectionH;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionH.Mds3SectionH;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelH0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8227738748821452655L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbH0100Z;
	private JxCheckBox cbH0100D;
	private JxCheckBox cbH0100C;
	private JxCheckBox cbH0100B;
	private JxCheckBox cbH0100A;

	public PanelH0100() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setPreferredSize(new Dimension(840, 180));
		setBackground(Color.WHITE);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBounds(0, 0, 840, 180);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);

		panel_1.setPreferredSize(new Dimension(840, 180));
		add(panel_1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_2);
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setBounds(0, 0, 840, 25);
		panel_1.add(panel_5);

		final JxLabel a0100Label = new JxLabel();
		a0100Label.setTheme(theme);

		a0100Label.setFontSize(12);
		a0100Label.setFontStyle(Font.BOLD);
		a0100Label.setText("H0100. Appliances");
		panel_5.add(a0100Label);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_8.setBounds(1, 25, 839, 20);
		panel_1.add(panel_8);

		final JxLabel checkAllThatLabel = new JxLabel();
		checkAllThatLabel.setTheme(theme);

		checkAllThatLabel.setFontSize(12);
		checkAllThatLabel.setFontStyle(Font.BOLD);
		checkAllThatLabel.setText("Check all that apply");
		checkAllThatLabel.setBounds(54, 0, 228, 20);
		panel_8.add(checkAllThatLabel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);

		panel_6.setBounds(1, 45, 839, 27);
		panel_1.add(panel_6);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBounds(0, 0, 80, 27);
		panel_15.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.add(panel_15);

		cbH0100A = new JxCheckBox();
		cbH0100A.setTheme(theme);

		cbH0100A.setText("");
		panel_15.add(cbH0100A);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_16.setLayout(null);

		panel_16.setBounds(80, 0, 759, 27);
		panel_6.add(panel_16);

		final JxLabel aIndwellingCatherLabel = new JxLabel();
		aIndwellingCatherLabel.setTheme(theme);

		aIndwellingCatherLabel.setFontSize(12);
		aIndwellingCatherLabel
				.setText("<html><body><b>A. Indwelling cather</b> (including suprapublic catheter and nephrostomy tube)</html>");
		aIndwellingCatherLabel.setBounds(10, 0, 583, 27);
		panel_16.add(aIndwellingCatherLabel);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setLayout(null);

		panel_7.setBounds(1, 72, 839, 27);
		panel_1.add(panel_7);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);
		panel_17.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_17.setBounds(0, 0, 80, 27);
		panel_7.add(panel_17);

		cbH0100B = new JxCheckBox();
		cbH0100B.setTheme(theme);

		cbH0100B.setText("");
		panel_17.add(cbH0100B);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		panel_18.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_18.setLayout(null);

		panel_18.setBounds(80, 0, 759, 27);
		panel_7.add(panel_18);

		final JxLabel bExternalCatheterLabel = new JxLabel();
		bExternalCatheterLabel.setTheme(theme);

		bExternalCatheterLabel.setFontSize(12);
		bExternalCatheterLabel
				.setText("<html><b>B. External catheter</b></html>");
		bExternalCatheterLabel.setBounds(10, 0, 637, 27);
		panel_18.add(bExternalCatheterLabel);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setLayout(null);

		panel_9.setBounds(1, 99, 839, 27);
		panel_1.add(panel_9);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setBounds(0, 0, 80, 27);
		panel_19.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9.add(panel_19);

		cbH0100C = new JxCheckBox();
		cbH0100C.setTheme(theme);

		cbH0100C.setText("");
		panel_19.add(cbH0100C);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);
		panel_20.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_20.setLayout(null);

		panel_20.setBounds(80, 0, 759, 27);
		panel_9.add(panel_20);

		final JxLabel cOstomyincludingLabel = new JxLabel();
		cOstomyincludingLabel.setTheme(theme);

		cOstomyincludingLabel.setFontSize(12);
		cOstomyincludingLabel
				.setText("<html><b>C. Ostomy</b> (including urostomy, ileostomy , and colostomy)</html>");
		cOstomyincludingLabel.setBounds(10, 0, 576, 27);
		panel_20.add(cOstomyincludingLabel);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setLayout(null);

		panel_13.setBounds(1, 126, 839, 27);
		panel_1.add(panel_13);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);
		panel_21.setBounds(0, 0, 80, 27);
		panel_21.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_13.add(panel_21);

		cbH0100D = new JxCheckBox();
		cbH0100D.setTheme(theme);

		cbH0100D.setText("");
		panel_21.add(cbH0100D);

		final JxPanel panel_22 = new JxPanel();
		panel_22.setTheme(theme);
		panel_22.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_22.setLayout(null);

		panel_22.setBounds(80, 0, 759, 27);
		panel_13.add(panel_22);

		final JxLabel dIntermittendCatheterizationLabel = new JxLabel();
		dIntermittendCatheterizationLabel.setTheme(theme);

		dIntermittendCatheterizationLabel.setFontSize(12);
		dIntermittendCatheterizationLabel
				.setText("<html><b>D. Intermittend catheterization</b></html>");
		dIntermittendCatheterizationLabel.setBounds(10, 0, 560, 27);
		panel_22.add(dIntermittendCatheterizationLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);

		panel_14.setBounds(1, 153, 839, 27);
		panel_1.add(panel_14);

		final JxPanel panel_23 = new JxPanel();
		panel_23.setTheme(theme);
		panel_23.setBounds(0, 0, 80, 26);
		panel_23.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_14.add(panel_23);

		cbH0100Z = new JxCheckBox();
		cbH0100Z.setTheme(theme);

		cbH0100Z.setText("");
		panel_23.add(cbH0100Z);

		final JxPanel panel_24 = new JxPanel();
		panel_24.setTheme(theme);
		panel_24.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_24.setLayout(null);

		panel_24.setBounds(80, 0, 759, 27);
		panel_14.add(panel_24);

		final JxLabel zNoneOfLabel = new JxLabel();
		zNoneOfLabel.setTheme(theme);

		zNoneOfLabel.setFontSize(12);
		zNoneOfLabel.setText("<html><b>Z. None of the above</b></html>");
		zNoneOfLabel.setBounds(10, 0, 547, 26);
		panel_24.add(zNoneOfLabel);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		mds3sectionH.setH0100Z(cbH0100Z.isSelected());
		mds3sectionH.setH0100D(cbH0100D.isSelected());
		mds3sectionH.setH0100C(cbH0100C.isSelected());
		mds3sectionH.setH0100B(cbH0100B.isSelected());
		mds3sectionH.setH0100A(cbH0100A.isSelected());

	}

	public void doUpdate() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		cbH0100Z.setSelected(mds3sectionH.isH0100Z());
		cbH0100D.setSelected(mds3sectionH.isH0100D());
		cbH0100C.setSelected(mds3sectionH.isH0100C());
		cbH0100B.setSelected(mds3sectionH.isH0100B());
		cbH0100A.setSelected(mds3sectionH.isH0100A());

	}

}
