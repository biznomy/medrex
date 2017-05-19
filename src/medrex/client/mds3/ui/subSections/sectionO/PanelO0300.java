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
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelO0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6322982216357453191L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbO0300B;
	private JxComboBox cmbO0300A;

	public PanelO0300() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 163));

		final JxPanel panel_51 = new JxPanel();
		panel_51.setTheme(theme);

		panel_51.setLayout(null);
		panel_51.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 163);
		add(panel_51);

		final JxPanel panel_52 = new JxPanel();
		panel_52.setTheme(theme);
		panel_52.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_52.setLayout(null);
		panel_52.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_52.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_51.add(panel_52);

		final JxLabel o0300PneumococcalVaccineLabel = new JxLabel();
		o0300PneumococcalVaccineLabel.setTheme(theme);

		o0300PneumococcalVaccineLabel.setFontSize(12);
		o0300PneumococcalVaccineLabel.setFontStyle(Font.BOLD);
		o0300PneumococcalVaccineLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		o0300PneumococcalVaccineLabel.setText("O0300.  Pneumococcal Vaccine");
		o0300PneumococcalVaccineLabel.setBounds(10, 7, 357, 14);
		panel_52.add(o0300PneumococcalVaccineLabel);

		final JxPanel panel_O0300A = new JxPanel();
		panel_O0300A.setTheme(theme);

		panel_O0300A.setLayout(null);
		panel_O0300A.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 60);
		panel_51.add(panel_O0300A);

		final JxPanel panel_54 = new JxPanel();
		panel_54.setTheme(theme);
		panel_54.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_54.setLayout(null);
		panel_54.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_54.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 60);
		panel_O0300A.add(panel_54);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);

		enterCodeLabel_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(15, 10, 54, 14);
		panel_54.add(enterCodeLabel_2);

		cmbO0300A = new JxComboBox();
		cmbO0300A.setTheme(theme);
		cmbO0300A.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbO0300A.setBounds(15, 30, 50, 22);
		panel_54.add(cmbO0300A);

		final JxPanel panel_55 = new JxPanel();
		panel_55.setTheme(theme);
		panel_55.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_55.setLayout(null);

		panel_55.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 60);
		panel_O0300A.add(panel_55);

		final JxLabel anbspLabel = new JxLabel();
		anbspLabel.setTheme(theme);

		anbspLabel.setFontSize(12);
		anbspLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		anbspLabel
				.setText("<html><body><b> A.</b> &nbsp<b>Is the resident's Pneumococcal vaccination up to date ? </b> ");
		anbspLabel.setBounds(10, 10, 382, 14);
		panel_55.add(anbspLabel);

		final JxLabel label_13 = new JxLabel();
		label_13.setTheme(theme);

		label_13.setFontSize(13);
		label_13.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_13
				.setText("<html><body>0. &nbsp <b> No </b> Continue to O0300B, if Pneumococcal vaccine not received, state reason");
		label_13.setBounds(25, 30, 483, 14);
		panel_55.add(label_13);

		final JxLabel label_14 = new JxLabel();
		label_14.setTheme(theme);

		label_14.setFontSize(14);
		label_14.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_14
				.setText("<html><body>1. &nbsp <b> Yes </b> Skip to O0400, Therapies");
		label_14.setBounds(25, 44, 329, 14);
		panel_55.add(label_14);

		final JxPanel panel_O0300B = new JxPanel();
		panel_O0300B.setTheme(theme);
		panel_O0300B.setLayout(null);

		panel_O0300B.setBounds(0, 83, Mds3Constants.PAGE_WIDTH, 80);
		panel_51.add(panel_O0300B);

		final JxPanel panel_57 = new JxPanel();
		panel_57.setTheme(theme);
		panel_57.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_57.setLayout(null);
		panel_57.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_57.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 80);
		panel_O0300B.add(panel_57);

		final JxLabel enterCodeLabel_3 = new JxLabel();
		enterCodeLabel_3.setTheme(theme);

		enterCodeLabel_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_3.setText("Enter Code");
		enterCodeLabel_3.setBounds(15, 22, 54, 14);
		panel_57.add(enterCodeLabel_3);

		cmbO0300B = new JxComboBox();
		cmbO0300B.setTheme(theme);

		cmbO0300B.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3" }));
		cmbO0300B.setBounds(15, 42, 50, 22);
		panel_57.add(cmbO0300B);

		final JxPanel panel_58 = new JxPanel();
		panel_58.setTheme(theme);
		panel_58.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_58.setLayout(null);

		panel_58.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 80);
		panel_O0300B.add(panel_58);

		final JxLabel bIfLabel = new JxLabel();
		bIfLabel.setTheme(theme);

		bIfLabel.setFontSize(12);
		bIfLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bIfLabel
				.setText("<html><body><b> B.</b>&nbsp<b>  If pneumococcal vaccine not received, state reason : </b>");
		bIfLabel.setBounds(10, 10, 424, 14);
		panel_58.add(bIfLabel);

		final JxLabel label_15 = new JxLabel();
		label_15.setTheme(theme);

		label_15.setFontSize(12);
		label_15.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_15
				.setText("<html><body>1. &nbsp<b> Not eligible </b> - medical contraindication");
		label_15.setBounds(25, 30, 348, 14);
		panel_58.add(label_15);

		final JxLabel label_16 = new JxLabel();
		label_16.setTheme(theme);

		label_16.setFontSize(12);
		label_16.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_16.setText("<html><body>2. &nbsp<b> Offered and declined</b>");
		label_16.setBounds(25, 45, 306, 14);
		panel_58.add(label_16);

		final JxLabel label_17 = new JxLabel();
		label_17.setTheme(theme);

		label_17.setFontSize(12);
		label_17.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_17.setText("<html><body>3. &nbsp <b> Not offered</b>");
		label_17.setBounds(25, 60, 132, 14);
		panel_58.add(label_17);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionO mds3sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);

		Object obj = cmbO0300A.getSelectedItem();
		if (obj != null) {
			mds3sectionO.setO0300A(cmbO0300A.getSelectedItem().toString());
		} else {
			mds3sectionO.setO0300A("");
		}
		Object obj1 = cmbO0300B.getSelectedItem();
		if (obj1 != null) {
			mds3sectionO.setO0300B(cmbO0300B.getSelectedItem().toString());
		} else {
			mds3sectionO.setO0300B("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionO mds3sectionO = (Mds3SectionO) Mds3Controller.getInstance()
				.getSection(Mds3SectionO.class);
		cmbO0300A.setSelectedItem(mds3sectionO.getO0300A());
		cmbO0300B.setSelectedItem(mds3sectionO.getO0300B());

	}

}
