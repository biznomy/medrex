package medrex.client.mds3.ui.subSections.sectionV;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionV.Mds3SectionV;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelV0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5552631263487542303L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtV0100F;
	private JxText txtV0100E;
	private JxText txtV0100D;
	private JxDateChooser dcV0100C;
	private JxComboBox cmbV0100B;
	private JxComboBox cmbV0100A;

	public PanelV0100() {
		super();
		setPreferredSize(new Dimension(840, 545));
		setLayout(null);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBounds(0, 0, 840, 35);
		panel_9.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		add(panel_9);

		final JxLabel o0400TherapiesLabel = new JxLabel();
		o0400TherapiesLabel.setTheme(theme);

		o0400TherapiesLabel.setFontSize(12);
		o0400TherapiesLabel
				.setText("<html><body> <b>V0100.Items From the Most Recent Prior OBRA or Scheduled PPS Assessment </b> <br>Complete only if A0310E=0 and if the following is true for the <b> prior assessment :</b> A0310A=01-06 or A0310B=01-06");
		o0400TherapiesLabel.setBounds(25, 0, 780, 32);
		panel_9.add(o0400TherapiesLabel);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 35, 840, 510);

		add(panel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBounds(0, 0, 80, 510);
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_5);

		cmbV0100A = new JxComboBox();
		cmbV0100A.setTheme(theme);
		cmbV0100A.setModel(new DefaultComboBoxModel(new String[] { "", "01",
				"02", "03", "04", "05", "06", "99" }));

		cmbV0100A.setBounds(25, 60, 35, 20);
		panel_5.add(cmbV0100A);

		cmbV0100B = new JxComboBox();
		cmbV0100B.setTheme(theme);
		cmbV0100B.setModel(new DefaultComboBoxModel(new String[] { "", "01",
				"02", "03", "04", "05", "06", "07", "99" }));

		cmbV0100B.setBounds(25, 215, 35, 20);
		panel_5.add(cmbV0100B);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(10, 190, 70, 14);
		panel_5.add(enterCodeLabel);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 40, 70, 14);
		panel_5.add(enterCodeLabel_1);

		final JxLabel enterScoreLabel_2 = new JxLabel();
		enterScoreLabel_2.setTheme(theme);
		enterScoreLabel_2.setText("Enter Score");
		enterScoreLabel_2.setBounds(10, 370, 70, 14);
		panel_5.add(enterScoreLabel_2);

		final JxLabel enterScoreLabel_1 = new JxLabel();
		enterScoreLabel_1.setTheme(theme);
		enterScoreLabel_1.setText("Enter Score");
		enterScoreLabel_1.setBounds(10, 420, 70, 14);
		panel_5.add(enterScoreLabel_1);

		final JxLabel enterScoreLabel = new JxLabel();
		enterScoreLabel.setTheme(theme);
		enterScoreLabel.setText("Enter Score");
		enterScoreLabel.setBounds(10, 465, 70, 14);
		panel_5.add(enterScoreLabel);

		txtV0100F = new JxText();
		txtV0100F.setTheme(theme);
		txtV0100F.setBounds(10, 485, 60, 18);
		panel_5.add(txtV0100F);

		txtV0100E = new JxText();
		txtV0100E.setTheme(theme);
		txtV0100E.setBounds(10, 435, 60, 18);
		panel_5.add(txtV0100E);

		txtV0100D = new JxText();
		txtV0100D.setTheme(theme);
		txtV0100D.setBounds(10, 390, 60, 18);
		panel_5.add(txtV0100D);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(79, 0, 761, 140);

		panel.add(panel_6);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4
				.setText("<html><body><b> A. Prior Assessment federal OBRA Reason for Assessment </b> (A0310A value from prior assessment) <br> &nbsp &nbsp 01. <b> Admission </b> assessment (required by day 14) <br> &nbsp &nbsp 02. <b> Quarterly </b> review assessment <br> &nbsp &nbsp 03. <b> Annual </b> assessment <br> &nbsp &nbsp  04. <b> Significant Change in Status </b> Assessment <br> &nbsp &nbsp 05. <b> Significant correction </b> to <b> prior comprehensive </b> Assessment <br> &nbsp &nbsp 06. <b> Significant correction </b> to <b> prior quaterly </b> Assessment <br> &nbsp &nbsp 99.<b> Not OBRA required </b> assessment");
		label_4.setBounds(10, 0, 700, 130);
		panel_6.add(label_4);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setBounds(79, 139, 761, 150);

		panel.add(panel_7);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3
				.setText("<html><body> <b> B. Prior Assessment PPS Reason for Assessment </b> (A0310B value from prior assessment) <br> &nbsp &nbsp 01. <b> 5-day </b> scheduled assessment <br> &nbsp &nbsp 02. <b> 14-day </b> scheduled assessment <br> &nbsp &nbsp 03. <b> 30-day </b> scheduled assessment <br> &nbsp &nbsp 04. <b> 60-day </b> scheduled assessment <br> &nbsp &nbsp 05. <b> 90-day </b> scheduled assessment <br> &nbsp &nbsp 06. <b> Readmission/Return </b> assessment <br> &nbsp &nbsp 07. <b> Unscheduled assessment used for PPS </b> (OMRA,significant or clinical change,or significant correction assessment <br> &nbsp &nbsp 99. <b> Not PPS </b> assessment");
		label_3.setBounds(10, 0, 700, 155);
		panel_7.add(label_3);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBounds(79, 288, 761, 75);

		panel.add(panel_8);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5
				.setText("<html><body><b> C. Prior Assessment Reference Date</b> (A2300 value from prior assessment)");
		label_5.setBounds(10, 10, 700, 18);
		panel_8.add(label_5);

		dcV0100C = new JxDateChooser();
		dcV0100C.setTheme(theme);
		dcV0100C.setBounds(145, 35, 323, 18);
		dcV0100C.setDateFormatString("MM/dd/yyyy");
		panel_8.add(dcV0100C);

		final JxLabel monthLabel = new JxLabel();
		monthLabel.setTheme(theme);
		monthLabel.setText("Month");
		monthLabel.setBounds(145, 61, 54, 14);
		panel_8.add(monthLabel);

		final JxLabel dayLabel = new JxLabel();
		dayLabel.setTheme(theme);
		dayLabel.setText("Day");
		dayLabel.setBounds(267, 61, 54, 14);
		panel_8.add(dayLabel);

		final JxLabel yearLabel = new JxLabel();
		yearLabel.setTheme(theme);
		yearLabel.setText("Year");
		yearLabel.setBounds(414, 61, 54, 14);
		panel_8.add(yearLabel);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(79, 362, 761, 50);

		panel.add(panel_10);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2
				.setText("<html><body><b> D. Prior Assessment Brief Interview for Mental Status(BIMS)Summary Score </b> (C0500 value from prior assessment");
		label_2.setBounds(10, 10, 700, 40);
		panel_10.add(label_2);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBounds(79, 411, 761, 50);

		panel.add(panel_11);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1
				.setText("<html><body><b> E. Prior Assessment Resident Mood Interview(PHQ-9©)Total Severity Score </b> (D0300 value from prior assessment");
		label_1.setBounds(10, 10, 700, 40);
		panel_11.add(label_1);

		final JxPanel panel_11_1 = new JxPanel();
		panel_11_1.setTheme(theme);
		panel_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_1.setLayout(null);
		panel_11_1.setBounds(79, 460, 761, 50);

		panel.add(panel_11_1);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label
				.setText("<html><body><b> F. Prior Assessment Staff Assessment of Resident Mood (PHQ-9-OV)Total Severity Score </b> (D0600 value from prior assessment ");
		label.setBounds(10, 10, 750, 40);
		panel_11_1.add(label);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionV sectionV = (Mds3SectionV) Mds3Controller.getInstance()
				.getSection(Mds3SectionV.class);
		Object obj = cmbV0100A.getSelectedItem();
		if (obj != null) {
			sectionV.setV0100A(cmbV0100A.getSelectedItem().toString());
		} else {
			sectionV.setV0100A("");
		}
		Object obj1 = cmbV0100B.getSelectedItem();
		if (obj1 != null) {
			sectionV.setV0100B(cmbV0100B.getSelectedItem().toString());
		} else {
			sectionV.setV0100B("");
		}
		sectionV.setV0100C(dcV0100C.getDate());
		sectionV.setV0100D(txtV0100D.getText());
		sectionV.setV0100E(txtV0100E.getText());
		sectionV.setV0100F(txtV0100F.getText());
	}

	public void doUpdate() {
		Mds3SectionV mds3SectionV = (Mds3SectionV) Mds3Controller.getInstance()
				.getSection(Mds3SectionV.class);
		cmbV0100A.setSelectedItem(mds3SectionV.getV0100A());
		cmbV0100B.setSelectedItem(mds3SectionV.getV0100B());
		txtV0100D.setText(mds3SectionV.getV0100D());
		txtV0100E.setText(mds3SectionV.getV0100E());
		dcV0100C.setDate(mds3SectionV.getV0100C());
		txtV0100F.setText(mds3SectionV.getV0100F());

	}

}
