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

public class PanelQ0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5391261476421659469L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbQ0600;

	public PanelQ0600() {
		super();
		setPreferredSize(new Dimension(840, 110));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, 840, 110);
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
		q0400DischargePlanLabel.setText("Q0600.  Referral");
		q0400DischargePlanLabel.setBounds(10, 7, 350, 14);
		panel_1.add(q0400DischargePlanLabel);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);

		panel_3.setBounds(0, 30, 840, 80);
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

		cmbQ0600 = new JxComboBox();
		cmbQ0600.setTheme(theme);
		cmbQ0600.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));

		cmbQ0600.setBounds(17, 40, 43, 20);
		panel_6.add(cmbQ0600);

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
		bLabel.setFontStyle(Font.BOLD);
		bLabel
				.setText("Has a referral been made to the local contact agency ?");
		bLabel.setBounds(10, 10, 691, 14);
		panel_7.add(bLabel);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5.setText("<html><body>1. &nbsp <b> No</b> - referral not made");
		label_5.setBounds(27, 44, 501, 14);
		panel_7.add(label_5);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6
				.setText("<html><body> 0. &nbsp <b> No</b> - determination has been made by the resident and the care planning team that contact is not required");
		label_6.setBounds(27, 28, 674, 14);
		panel_7.add(label_6);

		final JxLabel body2nbspLabel = new JxLabel();
		body2nbspLabel.setTheme(theme);

		body2nbspLabel.setFontSize(12);
		body2nbspLabel.setText("<html><body>2. &nbsp <b> Yes </b>");
		body2nbspLabel.setBounds(27, 58, 652, 14);
		panel_7.add(body2nbspLabel);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionQ sectionQ = (Mds3SectionQ) Mds3Controller.getInstance()
				.getSection(Mds3SectionQ.class);
		Object obj = cmbQ0600.getSelectedItem();
		if (obj != null) {
			sectionQ.setQ0600(cmbQ0600.getSelectedItem().toString());
		} else {
			sectionQ.setQ0600("");
		}
	}

	public void doUpdate() {
		Mds3SectionQ mds3SectionQ = (Mds3SectionQ) Mds3Controller.getInstance()
				.getSection(Mds3SectionQ.class);
		cmbQ0600.setSelectedItem(mds3SectionQ.getQ0600());

	}

}
