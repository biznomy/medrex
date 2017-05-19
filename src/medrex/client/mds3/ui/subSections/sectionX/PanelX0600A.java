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

public class PanelX0600A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6884485195861719075L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbX0600A;

	public PanelX0600A() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 120));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 120);
		add(panel_14);
		panel_14.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_14.setLayout(null);

		final JxPanel panel_5_6 = new JxPanel();
		panel_5_6.setTheme(theme);
		panel_5_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_6.setLayout(null);
		panel_5_6.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 120);
		panel_14.add(panel_5_6);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_1.setBounds(14, 25, 66, 16);
		panel_5_6.add(enterCodeLabel_1);

		cmbX0600A = new JxComboBox();
		cmbX0600A.setTheme(theme);
		cmbX0600A.setModel(new DefaultComboBoxModel(new String[] { "", "01",
				"02", "03", "04", "05", "06", "99" }));

		cmbX0600A.setBounds(15, 42, 50, 22);
		panel_5_6.add(cmbX0600A);

		final JxPanel panel_6_6 = new JxPanel();
		panel_6_6.setTheme(theme);

		panel_6_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_6.setLayout(null);
		panel_6_6.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 120);
		panel_14.add(panel_6_6);

		final JxLabel aPriorLabel = new JxLabel();
		aPriorLabel.setTheme(theme);

		aPriorLabel.setFontSize(12);
		aPriorLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aPriorLabel
				.setText("<html><body><b> A. </b> &nbsp <b> Federal OBRA Reason for Assessment </b> <br> &nbsp &nbsp &nbsp 01. &nbsp  <b> Admission </b> assessment (required by day 14) <br> &nbsp &nbsp &nbsp 02. &nbsp <b> Quarterly </b> review assessment <br> &nbsp &nbsp &nbsp 03. &nbsp <b> Annual </b> assessment <br> &nbsp &nbsp &nbsp  04. &nbsp <b> Significant Change in Status </b> Assessment <br> &nbsp &nbsp &nbsp 05. &nbsp <b> Significant correction </b> to <b> prior comprehensive </b> Assessment <br> &nbsp &nbsp &nbsp 06. &nbsp <b> Significant correction </b> to <b> prior quaterly </b> Assessment <br> &nbsp &nbsp &nbsp 99. &nbsp <b> Not OBRA required </b> assessment");
		aPriorLabel.setBounds(10, 3, 519, 115);
		panel_6_6.add(aPriorLabel);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		Object obj = cmbX0600A.getSelectedItem();
		if (obj != null) {
			sectionX.setX0600A(cmbX0600A.getSelectedItem().toString());
		} else {
			sectionX.setX0600A("");
		}
	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		cmbX0600A.setSelectedItem(mds3SectionX.getX0600A());

	}

}
