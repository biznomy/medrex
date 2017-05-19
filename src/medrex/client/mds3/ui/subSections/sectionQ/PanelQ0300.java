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

public class PanelQ0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1241793955851863961L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbQ0300B;
	private JxComboBox cmbQ0300A;

	public PanelQ0300() {
		super();
		setPreferredSize(new Dimension(840, 250));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 245);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, 840, 46);
		panel.add(panel_1);

		final JxLabel q0300ResidentsLabel = new JxLabel();
		q0300ResidentsLabel.setTheme(theme);

		q0300ResidentsLabel.setFontSize(12);
		q0300ResidentsLabel
				.setText("<html><body><b> Q0300. Resident's Overall Expectation </b><br> Complete only if A0310E = 1");
		q0300ResidentsLabel.setBounds(10, 10, 448, 26);
		panel_1.add(q0300ResidentsLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setLayout(null);

		panel_2.setBounds(0, 45, 840, 101);
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

		cmbQ0300A = new JxComboBox();
		cmbQ0300A.setTheme(theme);
		cmbQ0300A.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "9" }));

		cmbQ0300A.setBounds(17, 50, 43, 20);
		panel_4.add(cmbQ0300A);

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
		label_1
				.setText("<html><body> 1. &nbsp Expects to be <b> discharged to the community</b>");
		label_1.setBounds(25, 30, 293, 14);
		panel_5.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2
				.setText("<html><body> 2. &nbsp Expects to <b> remain in this facility </b>");
		label_2.setBounds(25, 44, 368, 14);
		panel_5.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);
		label_3
				.setText("<html><body> 3. &nbsp Expects to be <b> discharged to another facility/institution</b>");
		label_3.setBounds(25, 58, 456, 14);
		panel_5.add(label_3);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);
		label_4.setText("<html><body> 9. &nbsp <b> Unknown or uncertain</b>");
		label_4.setBounds(25, 74, 183, 14);
		panel_5.add(label_4);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setLayout(null);

		panel_3.setBounds(0, 145, 840, 100);
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

		cmbQ0300B = new JxComboBox();
		cmbQ0300B.setTheme(theme);
		cmbQ0300B.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "9" }));

		cmbQ0300B.setBounds(17, 50, 43, 20);
		panel_6.add(cmbQ0300B);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_7.setLayout(null);

		panel_7.setBounds(70, 0, 770, 100);
		panel_3.add(panel_7);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);
		label_5
				.setText("<html><body><b> B. </b> &nbsp <b>Indicate information source for Q0300A </b>");
		label_5.setBounds(10, 10, 432, 14);
		panel_7.add(label_5);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);
		label_6.setText("<html><body> 1. &nbsp <b>Resident</b>");
		label_6.setBounds(25, 30, 292, 14);
		panel_7.add(label_6);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);
		label_7
				.setText("<html><body> 2. &nbsp If not resident, then <b> family or significant other </b>");
		label_7.setBounds(25, 44, 529, 14);
		panel_7.add(label_7);

		final JxLabel label_8 = new JxLabel();
		label_8.setTheme(theme);
		label_8
				.setText("<html><body> 3. &nbsp If not resident, family , or significant other, then <b> guardian or legally authorised representative</b>");
		label_8.setBounds(25, 58, 596, 14);
		panel_7.add(label_8);

		final JxLabel label_9 = new JxLabel();
		label_9.setTheme(theme);
		label_9.setText("<html><body> 9. &nbsp <b> None of the above </b>");
		label_9.setBounds(25, 74, 417, 14);
		panel_7.add(label_9);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionQ sectionQ = (Mds3SectionQ) Mds3Controller.getInstance()
				.getSection(Mds3SectionQ.class);
		Object obj = cmbQ0300A.getSelectedItem();
		if (obj != null) {
			sectionQ.setQ0300A(cmbQ0300A.getSelectedItem().toString());
		} else {
			sectionQ.setQ0300A("");
		}
		Object obj1 = cmbQ0300B.getSelectedItem();
		if (obj1 != null) {
			sectionQ.setQ0300B(cmbQ0300B.getSelectedItem().toString());
		} else {
			sectionQ.setQ0300B("");
		}
	}

	public void doUpdate() {
		Mds3SectionQ mds3SectionQ = (Mds3SectionQ) Mds3Controller.getInstance()
				.getSection(Mds3SectionQ.class);
		cmbQ0300A.setSelectedItem(mds3SectionQ.getQ0300A());
		cmbQ0300B.setSelectedItem(mds3SectionQ.getQ0300B());

	}

}
