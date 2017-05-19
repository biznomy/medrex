package medrex.client.mds3.ui.subSections.sectionE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionE.Mds3SectionE;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelE0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4941517347762643013L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbE0500C;
	private JxComboBox cmbE0500B;
	private JxComboBox cmbE0500A;

	public PanelE0500() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 225));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_2 = new JxPanel();
		panel_1_1_2.setTheme(theme);
		panel_1_1_2.setBounds(0, 0, 840, 225);
		add(panel_1_1_2);

		panel_1_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(840, 246));

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1.setBounds(0, 29, 80, 196);
		panel_1_1_2.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(5, 30, 70, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbE0500A = new JxComboBox();
		cmbE0500A.setTheme(theme);
		cmbE0500A.setBounds(15, 50, 50, 20);
		cmbE0500A.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbE0500A.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbE0500A);

		final JxLabel enterCodeLabel_1_1 = new JxLabel();
		enterCodeLabel_1_1.setTheme(theme);
		enterCodeLabel_1_1.setText("Enter Code");
		enterCodeLabel_1_1.setBounds(5, 145, 70, 14);
		panel_6_1_1.add(enterCodeLabel_1_1);

		cmbE0500C = new JxComboBox();
		cmbE0500C.setTheme(theme);
		cmbE0500C.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbE0500C.setPreferredSize(new Dimension(50, 20));
		cmbE0500C.setBounds(15, 165, 50, 20);
		panel_6_1_1.add(cmbE0500C);

		cmbE0500B = new JxComboBox();
		cmbE0500B.setTheme(theme);
		cmbE0500B.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbE0500B.setBounds(15, 105, 50, 20);
		panel_6_1_1.add(cmbE0500B);

		final JxLabel enterCodeLabel_3 = new JxLabel();
		enterCodeLabel_3.setTheme(theme);
		enterCodeLabel_3.setText("Enter Code");
		enterCodeLabel_3.setBounds(5, 85, 70, 14);
		panel_6_1_1.add(enterCodeLabel_3);

		final JxPanel panel_7_1_1 = new JxPanel();
		panel_7_1_1.setTheme(theme);
		panel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1.setOpaque(false);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(79, 29, 761, 80);
		panel_1_1_2.add(panel_7_1_1);

		final JxLabel aNationalProviderLabel_3_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1
				.setText("Did any of the identified symptom(s);");
		aNationalProviderLabel_3_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1.add(aNationalProviderLabel_3_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_5 = new JxLabel();
		aNationalProviderLabel_1_3_1_5.setTheme(theme);

		aNationalProviderLabel_1_3_1_5.setFontSize(12);
		aNationalProviderLabel_1_3_1_5.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_3_1_5
				.setText("A. Put the resident at significant risk for physical illness or injury?");
		aNationalProviderLabel_1_3_1_5.setBounds(5, 25, 474, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_5);

		final JxLabel aNationalProviderLabel_1_3_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1.setText("<html><body>0. <b>No");
		aNationalProviderLabel_1_3_1_2_1.setBounds(30, 45, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_3_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_3_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_3_1.setText("<html><body>1. <b> Yes");
		aNationalProviderLabel_1_3_1_3_1.setBounds(30, 60, 311, 14);
		panel_7_1_1.add(aNationalProviderLabel_1_3_1_3_1);

		final JxPanel panel_5_1_1_2 = new JxPanel();
		panel_5_1_1_2.setTheme(theme);
		panel_5_1_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setHgap(10);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2.setLayout(flowLayout_11);
		panel_5_1_1_2.setPreferredSize(new Dimension(840, 30));
		panel_5_1_1_2.setBounds(0, 0, 840, 30);
		panel_1_1_2.add(panel_5_1_1_2);

		final JxLabel a0100Label_1_1_2 = new JxLabel();
		a0100Label_1_1_2.setTheme(theme);

		a0100Label_1_1_2.setFontSize(14);
		a0100Label_1_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_1_2.setText("E0500. Impact on Resident");
		panel_5_1_1_2.add(a0100Label_1_1_2);

		final JxPanel panel_7_1_1_1 = new JxPanel();
		panel_7_1_1_1.setTheme(theme);
		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(79, 108, 761, 60);
		panel_1_1_2.add(panel_7_1_1_1);

		final JxLabel aNationalProviderLabel_3_1_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_1
				.setText("B. Significantly interfere with the resident's care");
		aNationalProviderLabel_3_1_1_1.setBounds(5, 5, 706, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_3_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_1.setText("<html><body>0. <b>No");
		aNationalProviderLabel_1_3_1_1_1_1.setBounds(30, 22, 311, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_3_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_1.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_2_1_1.setBounds(30, 35, 311, 14);
		panel_7_1_1_1.add(aNationalProviderLabel_1_3_1_2_1_1);

		final JxPanel panel_7_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1.setTheme(theme);
		panel_7_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBounds(79, 167, 761, 59);
		panel_1_1_2.add(panel_7_1_1_1_1);

		final JxLabel aNationalProviderLabel_3_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_1_1
				.setText("C. Significantly interfere with the resident's participation in activities or social interactions?");
		aNationalProviderLabel_3_1_1_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_3_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_1_1.setText("<html><body>0. <b> No");
		aNationalProviderLabel_1_3_1_1_1_1_1.setBounds(30, 20, 311, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_3_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_1_1.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_2_1_1_1.setBounds(30, 35, 311, 14);
		panel_7_1_1_1_1.add(aNationalProviderLabel_1_3_1_2_1_1_1);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		Object obj1 = cmbE0500C.getSelectedItem();
		Object obj2 = cmbE0500B.getSelectedItem();
		Object obj3 = cmbE0500A.getSelectedItem();
		if (obj1 != null) {
			mds3sectionE.setE0500C((String) cmbE0500C.getSelectedItem());
		} else {
			mds3sectionE.setE0500C("");
		}
		if (obj2 != null) {
			mds3sectionE.setE0500B((String) cmbE0500B.getSelectedItem());
		} else {
			mds3sectionE.setE0500B("");
		}
		if (obj3 != null) {
			mds3sectionE.setE0500A((String) cmbE0500A.getSelectedItem());
		} else {
			mds3sectionE.setE0500A("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		cmbE0500C.setSelectedItem(mds3sectionE.getE0500C());
		cmbE0500B.setSelectedItem(mds3sectionE.getE0500B());
		cmbE0500A.setSelectedItem(mds3sectionE.getE0500A());
	}

}
