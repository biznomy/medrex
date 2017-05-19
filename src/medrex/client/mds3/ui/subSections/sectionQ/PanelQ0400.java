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

public class PanelQ0400 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -387814770825517734L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbQ0400B;
	private JxComboBox cmbQ0400A;

	public PanelQ0400() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(840, 180));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, 840, 170);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, 840, 31);
		panel.add(panel_1);

		final JxLabel q0400DischargePlanLabel = new JxLabel();
		q0400DischargePlanLabel.setTheme(theme);

		q0400DischargePlanLabel.setFontSize(12);
		q0400DischargePlanLabel.setFontStyle(Font.BOLD);
		q0400DischargePlanLabel.setText("Q0400. Discharge Plan");
		q0400DischargePlanLabel.setBounds(10, 7, 350, 14);
		panel_1.add(q0400DischargePlanLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setLayout(null);

		panel_2.setBounds(0, 30, 840, 61);
		panel.add(panel_2);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_4.setLayout(null);
		panel_4.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_4.setBounds(0, 0, 71, 61);
		panel_2.add(panel_4);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);

		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(10, 10, 54, 14);
		panel_4.add(enterCodeLabel);

		cmbQ0400A = new JxComboBox();
		cmbQ0400A.setTheme(theme);
		cmbQ0400A.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbQ0400A.setBounds(17, 30, 43, 20);
		panel_4.add(cmbQ0400A);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5.setLayout(null);

		panel_5.setBounds(70, 0, 770, 61);
		panel_2.add(panel_5);

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);

		aLabel.setFontSize(12);
		aLabel
				.setText("<html><body><b> A. </b> &nbsp <b>Is there an active discharge plan in place for the resident to return to the community? </b>");
		aLabel.setBounds(10, 10, 644, 14);
		panel_5.add(aLabel);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setText("<html><body> 0. &nbsp <b> No </b>");
		label_2.setBounds(27, 28, 265, 14);
		panel_5.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3
				.setText("<html><body> 1. &nbsp <b> Yes </b> skip to Q0600, Referral");
		label_3.setBounds(27, 42, 253, 14);
		panel_5.add(label_3);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);

		panel_3.setBounds(0, 90, 840, 80);
		panel.add(panel_3);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setLayout(null);
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 0, 71, 80);
		panel_3.add(panel_6);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);

		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 22, 54, 14);
		panel_6.add(enterCodeLabel_1);

		cmbQ0400B = new JxComboBox();
		cmbQ0400B.setTheme(theme);
		cmbQ0400B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));

		cmbQ0400B.setBounds(17, 40, 43, 20);
		panel_6.add(cmbQ0400B);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);

		panel_7.setBounds(70, 0, 770, 80);
		panel_3.add(panel_7);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);

		bLabel.setFontSize(12);
		bLabel
				.setText("<html><body><b> B. </b> &nbsp <b> What determination was made by the resident and the care planning team regarding discharge to the community ?</b>");
		bLabel.setBounds(10, 10, 691, 14);
		panel_7.add(bLabel);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5
				.setText("<html><body>1. &nbsp <b> Discharge to community determined to be feasible</b>  Skip to Q0600, Referral");
		label_5.setBounds(27, 44, 501, 14);
		panel_7.add(label_5);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6.setText("<html><body> 0. &nbsp <b> Determination not made</b>");
		label_6.setBounds(27, 28, 241, 14);
		panel_7.add(label_6);

		final JxLabel body2nbspLabel = new JxLabel();
		body2nbspLabel.setTheme(theme);

		body2nbspLabel.setFontSize(12);
		body2nbspLabel
				.setText("<html><body>2. &nbsp <b> Discharge to community determined to be feasible </b> Skip to next active section ( V to X )");
		body2nbspLabel.setBounds(27, 58, 652, 14);
		panel_7.add(body2nbspLabel);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionQ sectionQ = (Mds3SectionQ) Mds3Controller.getInstance()
				.getSection(Mds3SectionQ.class);
		Object obj = cmbQ0400A.getSelectedItem();
		if (obj != null) {
			sectionQ.setQ0400A(cmbQ0400A.getSelectedItem().toString());
		} else {
			sectionQ.setQ0400A("");
		}
		Object obj1 = cmbQ0400B.getSelectedItem();
		if (obj1 != null) {
			sectionQ.setQ0400B(cmbQ0400B.getSelectedItem().toString());
		} else {
			sectionQ.setQ0400B("");
		}
	}

	public void doUpdate() {
		Mds3SectionQ mds3SectionQ = (Mds3SectionQ) Mds3Controller.getInstance()
				.getSection(Mds3SectionQ.class);
		cmbQ0400A.setSelectedItem(mds3SectionQ.getQ0400A());
		cmbQ0400B.setSelectedItem(mds3SectionQ.getQ0400B());

	}

}
