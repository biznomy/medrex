package medrex.client.mds3.ui.subSections.sectionJ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionJ.Mds3SectionJ;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelJ0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6845306696199771394L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbJ0100C;
	private JxComboBox cmbJ0100B;
	private JxComboBox cmbJ0100A;

	public PanelJ0100() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 235));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel_1_1_2_2 = new JxPanel();
		panel_1_1_2_2.setTheme(theme);

		panel_1_1_2_2.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 225);
		panel_1_1_2_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				1, false));
		panel_1_1_2_2.setLayout(null);
		panel_1_1_2_2.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH,
				225));
		add(panel_1_1_2_2);

		final JxPanel panel_6_1_1_2 = new JxPanel();
		panel_6_1_1_2.setTheme(theme);
		panel_6_1_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				1, false));
		panel_6_1_1_2.setLayout(null);
		panel_6_1_1_2.setBounds(0, 50, Mds3Constants.SUBSECTION_WIDTH_LEFT_1,
				175);
		panel_1_1_2_2.add(panel_6_1_1_2);

		final JxLabel enterCodeLabel_1_3 = new JxLabel();
		enterCodeLabel_1_3.setTheme(theme);
		enterCodeLabel_1_3.setText("Enter Code");
		enterCodeLabel_1_3.setBounds(15, 9, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_3);

		cmbJ0100A = new JxComboBox();
		cmbJ0100A.setTheme(theme);
		cmbJ0100A.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbJ0100A.setPreferredSize(new Dimension(50, 20));
		cmbJ0100A.setBounds(15, 29, 50, 22);
		panel_6_1_1_2.add(cmbJ0100A);

		final JxLabel enterCodeLabel_1_1_3 = new JxLabel();
		enterCodeLabel_1_1_3.setTheme(theme);
		enterCodeLabel_1_1_3.setText("Enter Code");
		enterCodeLabel_1_1_3.setBounds(15, 68, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_1_3);

		cmbJ0100B = new JxComboBox();
		cmbJ0100B.setTheme(theme);
		cmbJ0100B.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbJ0100B.setPreferredSize(new Dimension(50, 20));
		cmbJ0100B.setBounds(15, 88, 50, 22);
		panel_6_1_1_2.add(cmbJ0100B);

		final JxLabel enterCodeLabel_1_1_2_1 = new JxLabel();
		enterCodeLabel_1_1_2_1.setTheme(theme);
		enterCodeLabel_1_1_2_1.setText("Enter Code");
		enterCodeLabel_1_1_2_1.setBounds(15, 128, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_1_2_1);

		cmbJ0100C = new JxComboBox();
		cmbJ0100C.setTheme(theme);
		cmbJ0100C.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbJ0100C.setPreferredSize(new Dimension(50, 20));
		cmbJ0100C.setBounds(15, 148, 50, 22);
		panel_6_1_1_2.add(cmbJ0100C);

		final JxPanel panel_7_1_1_3 = new JxPanel();
		panel_7_1_1_3.setTheme(theme);

		panel_7_1_1_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				1, false));
		panel_7_1_1_3.setLayout(null);
		panel_7_1_1_3.setBounds(79, 50, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1,
				58);
		panel_1_1_2_2.add(panel_7_1_1_3);

		final JxLabel aNationalProviderLabel_3_1_1_3 = new JxLabel();
		aNationalProviderLabel_3_1_1_3.setTheme(theme);

		aNationalProviderLabel_3_1_1_3.setFontSize(12);
		aNationalProviderLabel_3_1_1_3.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_3
				.setText("A.  Been on a scheduled pain medication regimen?");
		aNationalProviderLabel_3_1_1_3.setBounds(10, 5, 706, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_3_1_1_3);

		final JxLabel aNationalProviderLabel_1_3_1_5_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_2.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2.setBounds(23, 25, 311, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_1_3_1_5_2);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_2_1.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1.setBounds(23, 42, 311, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_1_3_1_5_2_1);

		final JxPanel panel_5_1_1_2_2 = new JxPanel();
		panel_5_1_1_2_2.setTheme(theme);
		panel_5_1_1_2_2.setLayout(null);
		panel_5_1_1_2_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				1, false));
		panel_5_1_1_2_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_2.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_1_1_2_2.add(panel_5_1_1_2_2);

		final JxLabel a0100Label_1_1_2_2 = new JxLabel();
		a0100Label_1_1_2_2.setTheme(theme);

		a0100Label_1_1_2_2.setFontSize(12);
		a0100Label_1_1_2_2.setBounds(10, 6, 629, 14);
		a0100Label_1_1_2_2
				.setText("<html><b>J0100. Pain Management - </b>Complete for all residents, regardless of current pain leve");
		panel_5_1_1_2_2.add(a0100Label_1_1_2_2);

		final JxPanel panel_7_1_1_3_1 = new JxPanel();
		panel_7_1_1_3_1.setTheme(theme);

		panel_7_1_1_3_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				1, false));
		panel_7_1_1_3_1.setLayout(null);
		panel_7_1_1_3_1.setBounds(79, 107,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 58);
		panel_1_1_2_2.add(panel_7_1_1_3_1);

		final JxLabel aNationalProviderLabel_3_1_1_3_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_3_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_3_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_3_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_3_1
				.setText("B.  Recieved PRN pain medications?");
		aNationalProviderLabel_3_1_1_3_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_3_1.add(aNationalProviderLabel_3_1_1_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_2_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_2_2.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2_2.setBounds(23, 25, 311, 14);
		panel_7_1_1_3_1.add(aNationalProviderLabel_1_3_1_5_2_2);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_2_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_2_1_1.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1_1.setBounds(23, 42, 311, 14);
		panel_7_1_1_3_1.add(aNationalProviderLabel_1_3_1_5_2_1_1);

		final JxPanel panel_7_1_1_3_1_1 = new JxPanel();
		panel_7_1_1_3_1_1.setTheme(theme);

		panel_7_1_1_3_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, 1, false));
		panel_7_1_1_3_1_1.setLayout(null);
		panel_7_1_1_3_1_1.setBounds(79, 164,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 61);
		panel_1_1_2_2.add(panel_7_1_1_3_1_1);

		final JxLabel aNationalProviderLabel_3_1_1_3_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_3_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_3_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_3_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_3_1_1
				.setText("C.  Recieved non-medication intervention for pain?");
		aNationalProviderLabel_3_1_1_3_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_3_1_1_3_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_2_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_2_2_1.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2_2_1.setBounds(23, 25, 311, 14);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_1_3_1_5_2_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_2_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_2_1_1_1.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1_1_1.setBounds(23, 42, 311, 14);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_1_3_1_5_2_1_1_1);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setOpaque(true);

		panel
				.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY, 1,
						false));
		panel.setLayout(null);
		panel.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 25);
		add(panel);

		final JxLabel srsrtdLabel = new JxLabel();
		srsrtdLabel.setTheme(theme);
		srsrtdLabel.setOpaque(true);
		srsrtdLabel.setText("srsrtd");
		srsrtdLabel.setBounds(22, 10, 244, 14);
		panel.add(srsrtdLabel);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmbJ0100A.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ0100A(cmbJ0100A.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0100A("");
		}

		Object obj1 = cmbJ0100B.getSelectedItem();
		if (obj1 != null) {
			mds3sectionJ.setJ0100B(cmbJ0100B.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0100B("");
		}

		Object obj2 = cmbJ0100C.getSelectedItem();
		if (obj2 != null) {
			mds3sectionJ.setJ0100C(cmbJ0100C.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0100C("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmbJ0100A.setSelectedItem(mds3sectionJ.getJ0100A());
		cmbJ0100B.setSelectedItem(mds3sectionJ.getJ0100B());
		cmbJ0100C.setSelectedItem(mds3sectionJ.getJ0100C());
	}

}
