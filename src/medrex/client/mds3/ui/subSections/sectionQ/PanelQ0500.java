package medrex.client.mds3.ui.subSections.sectionQ;

import java.awt.Color;
import java.awt.Dimension;

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

public class PanelQ0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5998169295978640450L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbQ0500B;
	private JxComboBox cmbQ0500A;

	public PanelQ0500() {
		super();
		setPreferredSize(new Dimension(840, 250));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 230);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, 840, 31);
		panel.add(panel_1);

		final JxLabel q0300ResidentsLabel = new JxLabel();
		q0300ResidentsLabel.setTheme(theme);

		q0300ResidentsLabel.setFontSize(12);
		q0300ResidentsLabel
				.setText("<html><body><b> Q0500. Return to Community </b>");
		q0300ResidentsLabel.setBounds(10, 7, 448, 14);
		panel_1.add(q0300ResidentsLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setLayout(null);

		panel_2.setBounds(0, 30, 840, 101);
		panel.add(panel_2);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_4.setLayout(null);
		panel_4.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_4.setBounds(0, 0, 71, 101);
		panel_2.add(panel_4);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);

		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(10, 25, 54, 14);
		panel_4.add(enterCodeLabel);

		cmbQ0500A = new JxComboBox();
		cmbQ0500A.setTheme(theme);
		cmbQ0500A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbQ0500A.setBounds(17, 50, 43, 20);
		panel_4.add(cmbQ0500A);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5.setLayout(null);

		panel_5.setBounds(70, 0, 770, 101);
		panel_2.add(panel_5);

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);
		aLabel
				.setText("<html><body><b> A. </b> &nbsp <b>Resident's overall goal established during assessment process </b>");
		aLabel.setBounds(10, 10, 414, 14);
		panel_5.add(aLabel);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1.setText("<html><body> 0. &nbsp <b> No</b>");
		label_1.setBounds(27, 30, 293, 14);
		panel_5.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2
				.setText("<html><body> 1. &nbsp <b> Yes </b> - previous response was <b>\"no\"</b>");
		label_2.setBounds(27, 44, 368, 14);
		panel_5.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);
		label_3
				.setText("<html><body> 2. &nbsp <b> Yes </b> - previous response was <b>\"yes\"</b> Skip to Q0600, Referral");
		label_3.setBounds(27, 58, 456, 14);
		panel_5.add(label_3);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);
		label_4
				.setText("<html><body> 3. &nbsp <b> Yes </b> - previous response was <b>\"unknown\"</b>");
		label_4.setBounds(27, 74, 399, 14);
		panel_5.add(label_4);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);

		panel_3.setBounds(0, 130, 840, 100);
		panel.add(panel_3);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setLayout(null);
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 0, 71, 100);
		panel_3.add(panel_6);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);

		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 25, 54, 14);
		panel_6.add(enterCodeLabel_1);

		cmbQ0500B = new JxComboBox();
		cmbQ0500B.setTheme(theme);
		cmbQ0500B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));

		cmbQ0500B.setBounds(17, 50, 43, 20);
		panel_6.add(cmbQ0500B);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);

		panel_7.setBounds(70, 0, 770, 100);
		panel_3.add(panel_7);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);
		bLabel
				.setText("<html><body><b> B. </b> &nbsp <b>Ask the resident</b> (or family or significant other if resident is unable to respond): <b> \" Do you want to talk to someone about the</b> <br> &nbsp &nbsp &nbsp <b>    possibility of returning to the community? \" </b> ");
		bLabel.setBounds(10, 10, 750, 25);
		panel_7.add(bLabel);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);
		label_7.setText("<html><body> 0. &nbsp <b> No</b>");
		label_7.setBounds(27, 44, 529, 14);
		panel_7.add(label_7);

		final JxLabel label_8 = new JxLabel();
		label_8.setTheme(theme);
		label_8.setText("<html><body> 1. &nbsp <b> Yes </b>");
		label_8.setBounds(27, 58, 596, 14);
		panel_7.add(label_8);

		final JxLabel label_9 = new JxLabel();
		label_9.setTheme(theme);
		label_9.setText("<html><body> 9. &nbsp <b> Unknown or uncertain</b>");
		label_9.setBounds(27, 74, 417, 14);
		panel_7.add(label_9);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionQ sectionQ = (Mds3SectionQ) Mds3Controller.getInstance()
				.getSection(Mds3SectionQ.class);
		Object obj = cmbQ0500A.getSelectedItem();
		if (obj != null) {
			sectionQ.setQ0500A(cmbQ0500A.getSelectedItem().toString());
		} else {
			sectionQ.setQ0500A("");
		}
		Object obj1 = cmbQ0500B.getSelectedItem();
		if (obj1 != null) {
			sectionQ.setQ0500B(cmbQ0500B.getSelectedItem().toString());
		} else {
			sectionQ.setQ0500B("");
		}
	}

	public void doUpdate() {
		Mds3SectionQ mds3SectionQ = (Mds3SectionQ) Mds3Controller.getInstance()
				.getSection(Mds3SectionQ.class);
		cmbQ0500A.setSelectedItem(mds3SectionQ.getQ0500A());
		cmbQ0500B.setSelectedItem(mds3SectionQ.getQ0500B());

	}

}
