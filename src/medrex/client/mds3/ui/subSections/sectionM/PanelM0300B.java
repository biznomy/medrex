package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionM.Mds3SectionM;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelM0300B extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6785398547849858164L;

	Theme theme = new BlackOverWhiteTheme();

	private JxDateChooser dcM0300B3;
	private JxComboBox cmbM0300B2;
	private JxComboBox cmbM0300B1;

	public PanelM0300B() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 200));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 200);
		add(panel);

		final JxPanel panel_32 = new JxPanel();
		panel_32.setTheme(theme);
		panel_32.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_32.setLayout(null);
		panel_32.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 200);
		panel_32.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_32);

		cmbM0300B1 = new JxComboBox();
		cmbM0300B1.setTheme(theme);
		cmbM0300B1.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2", "3" }));

		cmbM0300B1.setBounds(15, 46, 50, 22);
		panel_32.add(cmbM0300B1);

		cmbM0300B2 = new JxComboBox();
		cmbM0300B2.setTheme(theme);
		cmbM0300B2.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2", "3" }));

		cmbM0300B2.setBounds(15, 95, 50, 22);
		panel_32.add(cmbM0300B2);

		final JxLabel enterNumberLabel_1 = new JxLabel();
		enterNumberLabel_1.setTheme(theme);

		enterNumberLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberLabel_1.setText("Enter Number");
		enterNumberLabel_1.setBounds(12, 27, 80, 16);
		panel_32.add(enterNumberLabel_1);

		final JxLabel enterNumberLabel_2 = new JxLabel();
		enterNumberLabel_2.setTheme(theme);

		enterNumberLabel_2.setText("Enter Number");
		enterNumberLabel_2.setBounds(12, 75, 68, 16);
		panel_32.add(enterNumberLabel_2);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme(theme);

		panel_28.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_28.setLayout(null);
		panel_28.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 200);
		panel.add(panel_28);

		final JxLabel stage2partialThicknessLabel = new JxLabel();
		stage2partialThicknessLabel.setTheme(theme);

		stage2partialThicknessLabel.setFontSize(12);
		stage2partialThicknessLabel
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		stage2partialThicknessLabel
				.setText("<html><body><b>B. </b> &nbsp <b> Stage 2:</b>Partial thickness loss of dermis presenting as a shallow open ulcer with a red or pink wound  bed ,without slough .May also <br> &nbsp &nbsp &nbsp present as an intact or open /ruptured blister <br><br> &nbsp &nbsp &nbsp <b> 1. </b> &nbsp <b> Number of Stage 2 pressure ulcers </b> -  if 0  Skip to M0300C, Stage 3 <br><br> <b> &nbsp &nbsp &nbsp 2. </b> &nbsp <b> Number of these Stage 2 pressure ulcers that were present upon admission/reentry </b> - enter how many were noted at the time <br> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp of admission <br><br> <b> &nbsp &nbsp &nbsp 3. </b> &nbsp <b> Date of oldest Stage 2 pressure ulcer </b> - Enter dashes if date is unknown: <br> ");
		stage2partialThicknessLabel.setBounds(10, 5, 750, 150);
		panel_28.add(stage2partialThicknessLabel);

		dcM0300B3 = new JxDateChooser();
		dcM0300B3.setTheme(theme);
		dcM0300B3.setBounds(40, 157, 204, 22);
		dcM0300B3.setDateFormatString("MM/dd/yyyy");
		panel_28.add(dcM0300B3);

		final JxLabel monthLabel = new JxLabel();
		monthLabel.setTheme(theme);

		monthLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		monthLabel.setText("Month");
		monthLabel.setBounds(40, 176, 66, 16);
		panel_28.add(monthLabel);

		final JxLabel yearLabel = new JxLabel();
		yearLabel.setTheme(theme);

		yearLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		yearLabel.setText("Year");
		yearLabel.setBounds(195, 176, 66, 16);
		panel_28.add(yearLabel);

		final JxLabel dateLabel = new JxLabel();
		dateLabel.setTheme(theme);
		dateLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		dateLabel.setText("Day");
		dateLabel.setBounds(125, 176, 66, 16);
		panel_28.add(dateLabel);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		Object obj = cmbM0300B1.getSelectedItem();
		if (obj != null) {
			mds3sectionM.setM0300B_1(cmbM0300B1.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0300B_1("");
		}

		Object obj1 = cmbM0300B2.getSelectedItem();
		if (obj1 != null) {
			mds3sectionM.setM0300B_2(cmbM0300B2.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0300B_2("");
		}
		/* mds3sectionM.setM0300B_3(dcM0300B3.getDate()); */

	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cmbM0300B1.setSelectedItem(mds3sectionM.getM0300B_1());
		cmbM0300B2.setSelectedItem(mds3sectionM.getM0300B_2());
		dcM0300B3.setDate(mds3sectionM.getM0300B_3());

	}

}
