package medrex.client.mds3.ui.subSections.sectionQ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.sectionQ.Mds3SectionQ;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelQ0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6389580795981369624L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbQ0100C;
	private JxComboBox cmbQ0100B;
	private JxComboBox cmbQ0100A;

	public PanelQ0100() {
		super();
		setPreferredSize(new Dimension(840, 260));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 250);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, 840, 31);
		panel.add(panel_1);

		final JxLabel q0100ParticipationInLabel = new JxLabel();
		q0100ParticipationInLabel.setTheme(theme);

		q0100ParticipationInLabel.setFontSize(12);
		q0100ParticipationInLabel.setFontStyle(Font.BOLD);
		q0100ParticipationInLabel.setText("Q0100. Participation in Assessment");
		q0100ParticipationInLabel.setBounds(10, 7, 225, 14);
		panel_1.add(q0100ParticipationInLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_2.setLayout(null);

		panel_2.setBounds(0, 30, 840, 61);
		panel.add(panel_2);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 71, 61);
		panel_2.add(panel_5);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);

		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(10, 10, 54, 14);
		panel_5.add(enterCodeLabel);

		cmbQ0100A = new JxComboBox();
		cmbQ0100A.setTheme(theme);
		cmbQ0100A.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbQ0100A.setBounds(17, 30, 43, 20);
		panel_5.add(cmbQ0100A);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_8.setLayout(null);

		panel_8.setBounds(70, 0, 770, 61);
		panel_2.add(panel_8);

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);

		aLabel.setFontSize(12);
		aLabel
				.setText("<html><body><b> A. </b> &nbsp <b>Resident participated in assessment</b>");
		aLabel.setBounds(10, 10, 326, 14);
		panel_8.add(aLabel);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setText("<html><body>1. &nbsp <b> Yes</b>");
		label_1.setBounds(25, 42, 54, 14);
		panel_8.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setText("<html><body>0. &nbsp <b> No</b>");
		label_2.setBounds(25, 28, 54, 14);
		panel_8.add(label_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_3.setLayout(null);

		panel_3.setBounds(0, 90, 840, 81);
		panel.add(panel_3);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setLayout(null);
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 0, 71, 81);
		panel_3.add(panel_6);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);

		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 22, 54, 14);
		panel_6.add(enterCodeLabel_1);

		cmbQ0100B = new JxComboBox();
		cmbQ0100B.setTheme(theme);

		cmbQ0100B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbQ0100B.setBounds(17, 40, 43, 20);
		panel_6.add(cmbQ0100B);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_9.setLayout(null);

		panel_9.setBounds(70, 0, 770, 81);
		panel_3.add(panel_9);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label
				.setText("<html><body><b> B. </b>&nbsp <b> Family or significant other participated in assessment </b>");
		label.setBounds(10, 10, 334, 14);
		panel_9.add(label);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3.setText("<html><body>0. &nbsp <b> No</b>");
		label_3.setBounds(25, 28, 54, 14);
		panel_9.add(label_3);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4.setText("<html><body>1. &nbsp <b> Yes</b>");
		label_4.setBounds(25, 42, 54, 14);
		panel_9.add(label_4);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5
				.setText("<html><body>9. &nbsp <b> No family or significant other</b>");
		label_5.setBounds(25, 56, 298, 14);
		panel_9.add(label_5);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_4.setLayout(null);

		panel_4.setBounds(0, 170, 840, 80);
		panel.add(panel_4);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);
		panel_7.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_7.setBounds(0, 0, 71, 80);
		panel_4.add(panel_7);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);

		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 22, 54, 14);
		panel_7.add(enterCodeLabel_2);

		cmbQ0100C = new JxComboBox();
		cmbQ0100C.setTheme(theme);

		cmbQ0100C.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));
		cmbQ0100C.setBounds(17, 40, 43, 20);
		panel_7.add(cmbQ0100C);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setLayout(null);

		panel_10.setBounds(70, 0, 770, 80);
		panel_4.add(panel_10);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6
				.setText("<html><body><b> C. </b> &nbsp <b> Guardian or legally authorised representative participated in assessment</b>");
		label_6.setBounds(10, 10, 441, 14);
		panel_10.add(label_6);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);

		label_7.setFontSize(12);
		label_7.setText("<html><body>0. &nbsp <b> No</b>");
		label_7.setBounds(25, 28, 54, 14);
		panel_10.add(label_7);

		final JxLabel label_8 = new JxLabel();
		label_8.setTheme(theme);

		label_8.setFontSize(12);
		label_8.setText("<html><body>1. &nbsp <b> Yes</b>");
		label_8.setBounds(25, 42, 54, 14);
		panel_10.add(label_8);

		final JxLabel label_9 = new JxLabel();
		label_9.setTheme(theme);

		label_9.setFontSize(12);
		label_9
				.setText("<html><body>9. &nbsp <b> No guardian or legally authorised representative</b>");
		label_9.setBounds(25, 56, 304, 14);
		panel_10.add(label_9);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionQ sectionQ = (Mds3SectionQ) Mds3Controller.getInstance()
				.getSection(Mds3SectionQ.class);
		Object obj = cmbQ0100A.getSelectedItem();
		if (obj != null) {
			sectionQ.setQ0100A(cmbQ0100A.getSelectedItem().toString());
		} else {
			sectionQ.setQ0100A("");
		}
		Object obj1 = cmbQ0100B.getSelectedItem();
		if (obj1 != null) {
			sectionQ.setQ0100B(cmbQ0100B.getSelectedItem().toString());
		} else {
			sectionQ.setQ0100B("");
		}
		Object obj2 = cmbQ0100C.getSelectedItem();
		if (obj2 != null) {
			sectionQ.setQ0100C(cmbQ0100C.getSelectedItem().toString());
		} else {
			sectionQ.setQ0100C("");
		}
	}

	public void doUpdate() {
		Mds3SectionQ mds3SectionQ = (Mds3SectionQ) Mds3Controller.getInstance()
				.getSection(Mds3SectionQ.class);
		cmbQ0100A.setSelectedItem(mds3SectionQ.getQ0100A());
		cmbQ0100B.setSelectedItem(mds3SectionQ.getQ0100B());
		cmbQ0100C.setSelectedItem(mds3SectionQ.getQ0100C());

	}

}
