package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX0600B extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3524823088984653684L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbX0600B;

	public PanelX0600B() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 190));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 190);
		add(panel_15);
		panel_15.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_15.setLayout(null);

		final JxPanel panel_5_7 = new JxPanel();
		panel_5_7.setTheme(theme);
		panel_5_7.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_7.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_7.setLayout(null);
		panel_5_7.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 190);
		panel_15.add(panel_5_7);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_2.setBounds(14, 40, 66, 16);
		panel_5_7.add(enterCodeLabel_2);

		cmbX0600B = new JxComboBox();
		cmbX0600B.setTheme(theme);
		cmbX0600B.setModel(new DefaultComboBoxModel(new String[] { "", "01",
				"02", "03", "04", "05", "06", "07", "99" }));

		cmbX0600B.setBounds(14, 60, 50, 22);
		panel_5_7.add(cmbX0600B);

		final JxPanel panel_6_7 = new JxPanel();
		panel_6_7.setTheme(theme);

		panel_6_7.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_7.setLayout(null);
		panel_6_7.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 190);
		panel_15.add(panel_6_7);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);

		bLabel.setFontSize(12);
		bLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bLabel
				.setText("<html><body> <b> B. </b> &nbsp <b> PPS Assessment <br> &nbsp &nbsp &nbsp <u> <b> PPS Scheduled Assessment for a Medicare Part A Stay </u> </b> <br> &nbsp &nbsp &nbsp 01. &nbsp <b> 5-day </b> scheduled assessment <br> &nbsp &nbsp &nbsp 02. &nbsp <b> 14-day </b> scheduled assessment <br> &nbsp &nbsp &nbsp 03. &nbsp <b> 30-day </b> scheduled assessment <br> &nbsp &nbsp &nbsp 04. &nbsp <b> 60-day </b> scheduled assessment <br> &nbsp &nbsp &nbsp 05. &nbsp  <b> 90-day </b> scheduled assessment <br> &nbsp &nbsp &nbsp 06. &nbsp <b> Readmission/Return </b> assessment <br> &nbsp &nbsp &nbsp <b> <u> PPS Unscheduled Assessment for a Medicare Part A Stay </b></u> <br> &nbsp &nbsp &nbsp 07. &nbsp  <b> Unscheduled assessment used for PPS </b> (OMRA,significant or clinical change,or significant correction assessment <br> &nbsp &nbsp &nbsp <u><b> Not PPS Assessment </b> </u> <br> &nbsp &nbsp &nbsp 99. &nbsp <b> Not PPS </b> assessment");
		bLabel.setBounds(10, 4, 684, 183);
		panel_6_7.add(bLabel);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		Object obj = cmbX0600B.getSelectedItem();
		if (obj != null) {
			sectionX.setX0600B(cmbX0600B.getSelectedItem().toString());
		} else {
			sectionX.setX0600B("");
		}
	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		cmbX0600B.setSelectedItem(mds3SectionX.getX0600B());

	}

}
