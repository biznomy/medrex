package medrex.client.mds3.ui.subSections.sectionK;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.sectionK.Mds3SectionK;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelK0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -790782006512656885L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbK0100Z;
	private JxCheckBox cbK0100D;
	private JxCheckBox cbK0100C;
	private JxCheckBox cbK0100B;
	private JxCheckBox cbK0100A;

	public PanelK0100() {
		super();
		setPreferredSize(new Dimension(840, 220));
		setLayout(null);

		final JxPanel panel_27 = new JxPanel();
		panel_27.setTheme(theme);
		panel_27.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_27.setBounds(0, 0, 840, 220);
		panel_27.setLayout(null);
		panel_27.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_27.setPreferredSize(new Dimension(840, 248));
		add(panel_27);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme(theme);
		panel_28.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_28.setBounds(0, 0, 840, 50);
		panel_28.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_28.setLayout(null);
		panel_28.setPreferredSize(new Dimension(840, 26));
		panel_27.add(panel_28);

		final JxLabel g0600MobilityDevicesLabel = new JxLabel();
		g0600MobilityDevicesLabel.setTheme(theme);
		g0600MobilityDevicesLabel.setBackground(ColorConstants.MDS_BACK_COLOR);

		g0600MobilityDevicesLabel.setFontSize(12);
		g0600MobilityDevicesLabel.setFontStyle(Font.BOLD);
		g0600MobilityDevicesLabel.setBounds(10, 7, 248, 14);
		panel_28.add(g0600MobilityDevicesLabel);
		g0600MobilityDevicesLabel.setText("K0100. Swallowing Disorder");

		final JxLabel signsAndSymptomsLabel = new JxLabel();
		signsAndSymptomsLabel.setTheme(theme);

		signsAndSymptomsLabel.setFontSize(12);
		signsAndSymptomsLabel
				.setText("Signs and symptoms of possible swallowing disorder");
		signsAndSymptomsLabel.setBounds(10, 27, 323, 14);
		panel_28.add(signsAndSymptomsLabel);

		final JxPanel panel_29 = new JxPanel();
		panel_29.setTheme(theme);
		panel_29.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_29.setLayout(null);

		panel_29.setBounds(0, 49, 840, 25);
		panel_27.add(panel_29);

		final JxLabel codeForLimitationLabel_1 = new JxLabel();
		codeForLimitationLabel_1.setTheme(theme);

		codeForLimitationLabel_1.setFontSize(12);
		codeForLimitationLabel_1.setFontStyle(Font.BOLD);
		codeForLimitationLabel_1.setText("Chech all that apply");
		codeForLimitationLabel_1.setBounds(55, 7, 455, 14);
		panel_29.add(codeForLimitationLabel_1);

		final JxPanel panel_30 = new JxPanel();
		panel_30.setTheme(theme);
		panel_30.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_30.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_30.setLayout(null);
		panel_30.setBounds(0, 73, 80, 146);
		panel_27.add(panel_30);

		cbK0100A = new JxCheckBox();
		cbK0100A.setTheme(theme);

		cbK0100A.setText("");
		cbK0100A.setBounds(30, 10, 14, 17);
		panel_30.add(cbK0100A);

		cbK0100B = new JxCheckBox();
		cbK0100B.setTheme(theme);

		cbK0100B.setText("New JxCheckBox");
		cbK0100B.setBounds(30, 35, 14, 17);
		panel_30.add(cbK0100B);

		cbK0100C = new JxCheckBox();
		cbK0100C.setTheme(theme);

		cbK0100C.setBounds(30, 65, 14, 17);
		panel_30.add(cbK0100C);
		cbK0100C.setText("New JxCheckBox");

		cbK0100D = new JxCheckBox();
		cbK0100D.setTheme(theme);

		cbK0100D.setText("New JxCheckBox");
		cbK0100D.setBounds(30, 95, 14, 17);
		panel_30.add(cbK0100D);

		cbK0100Z = new JxCheckBox();
		cbK0100Z.setTheme(theme);

		cbK0100Z.setText("New JxCheckBox");
		cbK0100Z.setBounds(30, 125, 14, 17);
		panel_30.add(cbK0100Z);

		final JxPanel panel_31 = new JxPanel();
		panel_31.setTheme(theme);
		panel_31.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_31.setLayout(null);

		panel_31.setBounds(79, 73, 761, 30);
		panel_27.add(panel_31);

		final JxLabel aCanecrutchLabel = new JxLabel();
		aCanecrutchLabel.setTheme(theme);

		aCanecrutchLabel.setFontSize(12);
		aCanecrutchLabel
				.setText("<html><body><b>A. Loss of liquids/soilds from mouth when eating or drinking</b>");
		aCanecrutchLabel.setBounds(10, 10, 344, 14);
		panel_31.add(aCanecrutchLabel);

		final JxPanel panel_32 = new JxPanel();
		panel_32.setTheme(theme);
		panel_32.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_32.setLayout(null);

		panel_32.setBounds(79, 102, 761, 30);
		panel_27.add(panel_32);

		final JxLabel bWalkerLabel = new JxLabel();
		bWalkerLabel.setTheme(theme);

		bWalkerLabel.setFontSize(12);

		bWalkerLabel
				.setText("<html><body><b>B. Holding food in mouth/cheeks or residual food in mouth after meals </b>");
		bWalkerLabel.setBounds(10, 10, 415, 14);
		panel_32.add(bWalkerLabel);

		final JxPanel panel_33 = new JxPanel();
		panel_33.setTheme(theme);
		panel_33.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_33.setLayout(null);

		panel_33.setBounds(79, 131, 761, 30);
		panel_27.add(panel_33);

		final JxLabel cWheelchairLabel = new JxLabel();
		cWheelchairLabel.setTheme(theme);

		cWheelchairLabel.setFontSize(12);
		cWheelchairLabel
				.setText("<html><body><b>C. Coughing or choking during meals or when swallowing medications</b> ");
		cWheelchairLabel.setBounds(10, 10, 413, 14);
		panel_33.add(cWheelchairLabel);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_34.setLayout(null);

		panel_34.setBounds(79, 160, 761, 30);
		panel_27.add(panel_34);

		final JxLabel dLimbProsthesisLabel = new JxLabel();
		dLimbProsthesisLabel.setTheme(theme);

		dLimbProsthesisLabel.setFontSize(12);
		dLimbProsthesisLabel
				.setText("<html><body><b>D. Complaints of difficulty or pain with swallowing medications </b>");
		dLimbProsthesisLabel.setBounds(10, 10, 383, 14);
		panel_34.add(dLimbProsthesisLabel);

		final JxPanel panel_35 = new JxPanel();
		panel_35.setTheme(theme);
		panel_35.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_35.setLayout(null);

		panel_35.setBounds(79, 189, 761, 30);
		panel_27.add(panel_35);

		final JxLabel zNoneOtLabel = new JxLabel();
		zNoneOtLabel.setTheme(theme);

		zNoneOtLabel.setFontSize(12);
		zNoneOtLabel.setText("<html><body><b>Z. None ot the above </b>");
		zNoneOtLabel.setBounds(10, 10, 253, 14);
		panel_35.add(zNoneOtLabel);

		final JxPanel panel_36 = new JxPanel();
		panel_36.setTheme(theme);
		panel_36.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_36.setBounds(0, 329, 840, 132);
		panel_36.setLayout(null);

		panel_36.setPreferredSize(new Dimension(840, 133));
		add(panel_36);
		doUpdate();
	}

	@Override
	public void doSave() {

		Mds3SectionK mds3sectionK = (Mds3SectionK) Mds3Controller.getInstance()
				.getSection(Mds3SectionK.class);
		mds3sectionK.setK0100A(cbK0100A.isSelected());
		mds3sectionK.setK0100B(cbK0100B.isSelected());
		mds3sectionK.setK0100C(cbK0100C.isSelected());
		mds3sectionK.setK0100D(cbK0100D.isSelected());
		mds3sectionK.setK0100Z(cbK0100Z.isSelected());

	}

	@Override
	public void doUpdate() {
		Mds3SectionK mds3sectionK = (Mds3SectionK) Mds3Controller.getInstance()
				.getSection(Mds3SectionK.class);
		cbK0100A.setSelected(mds3sectionK.isK0100A());
		cbK0100B.setSelected(mds3sectionK.isK0100B());
		cbK0100C.setSelected(mds3sectionK.isK0100C());
		cbK0100D.setSelected(mds3sectionK.isK0100D());
		cbK0100Z.setSelected(mds3sectionK.isK0100Z());
	}
}
