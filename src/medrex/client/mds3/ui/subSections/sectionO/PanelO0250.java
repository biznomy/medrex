package medrex.client.mds3.ui.subSections.sectionO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionO.Mds3SectionO;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelO0250 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8411896246851691590L;
	Theme theme = new BlackOverWhiteTheme();
	private JxDateChooser dcO0250B;
	private JxComboBox cmbO0250C;
	private JxComboBox cmbO0250A;

	public PanelO0250() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 285));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_41 = new JxPanel();
		panel_41.setTheme(theme);

		panel_41.setLayout(null);
		panel_41.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 285);
		add(panel_41);

		final JxPanel panel_42 = new JxPanel();
		panel_42.setTheme(theme);
		panel_42.setLayout(null);
		panel_42.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_42.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_42.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_41.add(panel_42);

		final JxLabel o0250InfluenzaVaccineLabel = new JxLabel();
		o0250InfluenzaVaccineLabel.setTheme(theme);
		o0250InfluenzaVaccineLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		o0250InfluenzaVaccineLabel.setFontSize(12);
		o0250InfluenzaVaccineLabel
				.setText("<html><body><b>O0250. Influenza Vaccine </b> - Refer to current version of RAI manual for current flu season and reporting period ");
		o0250InfluenzaVaccineLabel.setBounds(10, 7, 670, 14);
		panel_42.add(o0250InfluenzaVaccineLabel);

		final JxPanel panel_O0250A = new JxPanel();
		panel_O0250A.setTheme(theme);

		panel_O0250A.setLayout(null);
		panel_O0250A.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 60);
		panel_41.add(panel_O0250A);

		final JxPanel panel_45 = new JxPanel();
		panel_45.setTheme(theme);
		panel_45.setLayout(null);
		panel_45.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_45.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_45.setBounds(0, 0, 80, 60);
		panel_O0250A.add(panel_45);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);

		enterCodeLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(15, 10, 54, 14);
		panel_45.add(enterCodeLabel_1);

		cmbO0250A = new JxComboBox();
		cmbO0250A.setTheme(theme);

		cmbO0250A.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));
		cmbO0250A.setBounds(15, 30, 50, 22);
		panel_45.add(cmbO0250A);

		final JxPanel panel_43 = new JxPanel();
		panel_43.setTheme(theme);
		panel_43.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_43.setLayout(null);
		panel_43.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 60);
		panel_O0250A.add(panel_43);

		final JxLabel aDidLabel = new JxLabel();
		aDidLabel.setTheme(theme);

		aDidLabel.setFontSize(12);
		aDidLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aDidLabel
				.setText("<html><body><b>A. </b>  Did the <b> resident receive the influenza vaccine in this facility </b> for this year's Influenza season ?");
		aDidLabel.setBounds(10, 10, 554, 14);
		panel_43.add(aDidLabel);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_2
				.setText("<html><body>0. &nbsp<b>  No </b>  Skip to O0250C, If Influenza vaccine not received, state reason");
		label_2.setBounds(25, 28, 492, 14);
		panel_43.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_3
				.setText("<html><body> 1. &nbsp<b> Yes </b> Continue to O0250B, Date vaccine received");
		label_3.setBounds(25, 42, 390, 14);
		panel_43.add(label_3);

		final JxPanel panel_O0250B = new JxPanel();
		panel_O0250B.setTheme(theme);
		panel_O0250B.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_O0250B.setLayout(null);
		panel_O0250B.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_O0250B.setBounds(0, 83, Mds3Constants.PAGE_WIDTH, 71);
		panel_41.add(panel_O0250B);

		final JxPanel panel_47 = new JxPanel();
		panel_47.setTheme(theme);
		panel_47.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 71);
		panel_O0250B.add(panel_47);
		panel_47.setForeground(Color.WHITE);

		panel_47.setLayout(null);
		panel_47.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		final JxLabel bDateLabel = new JxLabel();
		bDateLabel.setTheme(theme);

		bDateLabel.setFontSize(12);
		bDateLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bDateLabel
				.setText("<html><body><b> B.  Date vaccine received  </b>  Complete date and skip to O0300A, Is the resident's Pneumococcal vaccination up to date ?");
		bDateLabel.setBounds(10, 10, 718, 14);
		panel_47.add(bDateLabel);

		dcO0250B = new JxDateChooser();
		dcO0250B.setTheme(theme);
		dcO0250B.setDateFormatString("MM/dd/yyyy");

		dcO0250B.setBounds(25, 30, 160, 18);
		panel_47.add(dcO0250B);

		final JxLabel monthLabel = new JxLabel();
		monthLabel.setTheme(theme);

		monthLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		monthLabel.setText("Month");
		monthLabel.setBounds(32, 50, 54, 14);
		panel_47.add(monthLabel);

		final JxLabel dayLabel = new JxLabel();
		dayLabel.setTheme(theme);

		dayLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		dayLabel.setText("Day");
		dayLabel.setBounds(91, 50, 54, 14);
		panel_47.add(dayLabel);

		final JxLabel yearLabel = new JxLabel();
		yearLabel.setTheme(theme);

		yearLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		yearLabel.setText("Year");
		yearLabel.setBounds(151, 50, 54, 14);
		panel_47.add(yearLabel);

		final JxPanel panel_O0250C = new JxPanel();
		panel_O0250C.setTheme(theme);
		panel_O0250C.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_O0250C.setLayout(null);

		panel_O0250C.setBounds(0, 153, Mds3Constants.PAGE_WIDTH, 131);
		panel_41.add(panel_O0250C);

		final JxPanel panel_49 = new JxPanel();
		panel_49.setTheme(theme);
		panel_49.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_49.setLayout(null);
		panel_49.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_49.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 131);
		panel_O0250C.add(panel_49);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);

		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(15, 40, 67, 14);
		panel_49.add(enterCodeLabel);

		cmbO0250C = new JxComboBox();
		cmbO0250C.setTheme(theme);

		cmbO0250C.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "6", "9" }));
		cmbO0250C.setBounds(15, 58, 50, 22);
		panel_49.add(cmbO0250C);

		final JxPanel panel_50 = new JxPanel();
		panel_50.setTheme(theme);
		panel_50.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_50.setLayout(null);

		panel_50.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 131);
		panel_O0250C.add(panel_50);

		final JxLabel cIfInfluenzaLabel = new JxLabel();
		cIfInfluenzaLabel.setTheme(theme);

		cIfInfluenzaLabel.setFontSize(12);
		cIfInfluenzaLabel.setFontStyle(Font.BOLD);
		cIfInfluenzaLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		cIfInfluenzaLabel
				.setText("C.  If influenza vaccine not received, state reason :");
		cIfInfluenzaLabel.setBounds(10, 10, 350, 14);
		panel_50.add(cIfInfluenzaLabel);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_6
				.setText("<html><body>1. &nbsp <b> Resident not in facility </b> during this year's flu season");
		label_6.setBounds(25, 28, 313, 14);
		panel_50.add(label_6);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);

		label_7.setFontSize(12);
		label_7.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_7
				.setText("<html><body>2. &nbsp<b> Received outside of this facility </b>");
		label_7.setBounds(25, 42, 313, 14);
		panel_50.add(label_7);

		final JxLabel label_8 = new JxLabel();
		label_8.setTheme(theme);

		label_8.setFontSize(12);
		label_8.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_8
				.setText("<html><body>3. &nbsp <b> Not eligible </b> - medical contraindication ");
		label_8.setBounds(25, 56, 335, 14);
		panel_50.add(label_8);

		final JxLabel label_9 = new JxLabel();
		label_9.setTheme(theme);
		label_9.setText("<html><body>4. &nbsp <b> Offered and declined </b>");
		label_9.setBounds(26, 70, 138, 14);
		label_9.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_50.add(label_9);

		final JxLabel label_10 = new JxLabel();
		label_10.setTheme(theme);
		label_10.setText("<html><body>5. &nbsp <b> Not Offered </b>");
		label_10.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_10.setBounds(26, 84, 202, 14);
		panel_50.add(label_10);

		final JxLabel label_11 = new JxLabel();
		label_11.setTheme(theme);

		label_11.setFontSize(12);
		label_11.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_11
				.setText("<html><body>6. &nbsp <b> Inability to obtain vaccine </b> due to a declared shortage");
		label_11.setBounds(25, 98, 369, 14);
		panel_50.add(label_11);

		final JxLabel label_12 = new JxLabel();
		label_12.setTheme(theme);

		label_12.setFontSize(12);
		label_12.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_12.setText("<html><body>9. &nbsp <b> None of the above </b>");
		label_12.setBounds(26, 112, 313, 14);
		panel_50.add(label_12);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionO mds3sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);

		Object obj = cmbO0250A.getSelectedItem();
		if (obj != null) {
			mds3sectionO.setO0250A(cmbO0250A.getSelectedItem().toString());
		} else {
			mds3sectionO.setO0250A("");
		}
		Object obj1 = cmbO0250C.getSelectedItem();
		if (obj1 != null) {
			mds3sectionO.setO0250C(cmbO0250C.getSelectedItem().toString());
		} else {
			mds3sectionO.setO0250C("");
		}
		mds3sectionO.setO0250B(dcO0250B.getDate());
	}

	@Override
	public void doUpdate() {
		Mds3SectionO mds3sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		cmbO0250A.setSelectedItem(mds3sectionO.getO0250A());
		cmbO0250C.setSelectedItem(mds3sectionO.getO0250C());
		dcO0250B.setDate(mds3sectionO.getO0250B());
	}

}
