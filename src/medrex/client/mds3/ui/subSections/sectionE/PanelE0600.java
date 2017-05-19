package medrex.client.mds3.ui.subSections.sectionE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionE.Mds3SectionE;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelE0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6972271583494838678L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbE0600C;
	private JxComboBox cmbE0600B;
	private JxComboBox cmbE0600A;

	public PanelE0600() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 237));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_2_1 = new JxPanel();
		panel_1_1_2_1.setTheme(theme);
		panel_1_1_2_1.setBounds(0, 0, 840, 237);
		add(panel_1_1_2_1);

		panel_1_1_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setPreferredSize(new Dimension(840, 237));

		final JxPanel panel_1_1_2_2 = new JxPanel();
		panel_1_1_2_2.setTheme(theme);
		panel_1_1_2_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1_2_2.setLayout(null);
		panel_1_1_2_2.setPreferredSize(new Dimension(820, 210));
		panel_1_1_2_2.setBounds(0, 0, 840, 237);
		panel_1_1_2_1.add(panel_1_1_2_2);

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);
		panel_6_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 29, 80, 208);
		panel_1_1_2_2.add(panel_6_1_1_1);

		final JxLabel enterCodeLabel_1_2 = new JxLabel();
		enterCodeLabel_1_2.setTheme(theme);
		enterCodeLabel_1_2.setText("Enter Code");
		enterCodeLabel_1_2.setBounds(5, 25, 70, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_2);

		cmbE0600A = new JxComboBox();
		cmbE0600A.setTheme(theme);

		cmbE0600A.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));
		cmbE0600A.setPreferredSize(new Dimension(50, 20));
		cmbE0600A.setBounds(15, 45, 50, 20);
		panel_6_1_1_1.add(cmbE0600A);

		final JxLabel enterCodeLabel_1_1_1 = new JxLabel();
		enterCodeLabel_1_1_1.setTheme(theme);
		enterCodeLabel_1_1_1.setText("Enter Code");
		enterCodeLabel_1_1_1.setBounds(5, 155, 70, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_1_1);

		cmbE0600C = new JxComboBox();
		cmbE0600C.setTheme(theme);

		cmbE0600C.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));
		cmbE0600C.setPreferredSize(new Dimension(50, 20));
		cmbE0600C.setBounds(15, 175, 50, 20);
		panel_6_1_1_1.add(cmbE0600C);

		cmbE0600B = new JxComboBox();
		cmbE0600B.setTheme(theme);
		cmbE0600B.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbE0600B.setBounds(15, 115, 50, 20);
		panel_6_1_1_1.add(cmbE0600B);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(5, 95, 70, 14);
		panel_6_1_1_1.add(enterCodeLabel_2);

		final JxPanel panel_7_1_1_2 = new JxPanel();
		panel_7_1_1_2.setTheme(theme);

		panel_7_1_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_2.setLayout(null);
		panel_7_1_1_2.setBounds(79, 29, 761, 80);
		panel_1_1_2_2.add(panel_7_1_1_2);

		final JxLabel aNationalProviderLabel_3_1_1_2 = new JxLabel();
		aNationalProviderLabel_3_1_1_2.setTheme(theme);

		aNationalProviderLabel_3_1_1_2.setFontSize(12);
		aNationalProviderLabel_3_1_1_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_2
				.setText("Did any of the identified symptom(s):");
		aNationalProviderLabel_3_1_1_2.setBounds(10, 5, 706, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_3_1_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_5_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_3_1_5_1
				.setText("A. Put others at significant risk of physical injury?");
		aNationalProviderLabel_1_3_1_5_1.setBounds(5, 25, 474, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_5_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_2.setText("<html><body>0.<b> No ");
		aNationalProviderLabel_1_3_1_1_1_2.setBounds(30, 45, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_2.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_2_1_2.setBounds(30, 60, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_2_1_2);

		final JxPanel panel_5_1_1_2_2 = new JxPanel();
		panel_5_1_1_2_2.setTheme(theme);
		panel_5_1_1_2_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_2.setLayout(null);
		panel_5_1_1_2_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_1_2_2.setPreferredSize(new Dimension(840, 30));
		panel_5_1_1_2_2.setBounds(0, 0, 840, 29);
		panel_1_1_2_2.add(panel_5_1_1_2_2);

		final JxLabel a0100Label_1_1_2_2 = new JxLabel();
		a0100Label_1_1_2_2.setTheme(theme);

		a0100Label_1_1_2_2.setFontSize(14);
		a0100Label_1_1_2_2.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_2.setBounds(11, 6, 254, 14);
		a0100Label_1_1_2_2.setText("E0600. Impact on Others");
		panel_5_1_1_2_2.add(a0100Label_1_1_2_2);

		final JxPanel panel_7_1_1_1_2 = new JxPanel();
		panel_7_1_1_1_2.setTheme(theme);

		panel_7_1_1_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_1_2.setLayout(null);
		panel_7_1_1_1_2.setBounds(79, 108, 761, 70);
		panel_1_1_2_2.add(panel_7_1_1_1_2);

		final JxLabel aNationalProviderLabel_3_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_3_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_3_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_3_1_1_1_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_1_2
				.setText("B. Significantly intrude on the privacy or activity of others?");
		aNationalProviderLabel_3_1_1_1_2.setBounds(5, 5, 706, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_3_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_1_2.setText("<html><body>0. <b>No");
		aNationalProviderLabel_1_3_1_1_1_1_2.setBounds(30, 30, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_1_2.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_2_1_1_2.setBounds(30, 45, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_2_1_1_2);

		final JxPanel panel_7_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1.setTheme(theme);

		panel_7_1_1_1_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBounds(79, 177, 761, 60);
		panel_1_1_2_2.add(panel_7_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_3_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_1_1_1
				.setText("C. Significantly disrupt care or living environment?");
		aNationalProviderLabel_3_1_1_1_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_3_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_1_1_1.setText("<html><body>0.<b> No");
		aNationalProviderLabel_1_3_1_1_1_1_1_1.setBounds(30, 24, 311, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_3_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_1_1_1.setText("<html><body>1<b> Yes");
		aNationalProviderLabel_1_3_1_2_1_1_1_1.setBounds(30, 40, 311, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_3_1_2_1_1_1_1);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		Object obj1 = cmbE0600A.getSelectedItem();
		Object obj2 = cmbE0600B.getSelectedItem();
		Object obj3 = cmbE0600C.getSelectedItem();

		if (obj3 != null) {
			mds3sectionE.setE0600C((String) cmbE0600C.getSelectedItem());

		} else {
			mds3sectionE.setE0600C("");
		}
		if (obj2 != null) {
			mds3sectionE.setE0600B((String) cmbE0600B.getSelectedItem());
		} else {
			mds3sectionE.setE0600B("");
		}
		if (obj1 != null) {
			mds3sectionE.setE0600A((String) cmbE0600A.getSelectedItem());
		} else {
			mds3sectionE.setE0600A("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		cmbE0600C.setSelectedItem(mds3sectionE.getE0600C());
		cmbE0600B.setSelectedItem(mds3sectionE.getE0600B());
		cmbE0600A.setSelectedItem(mds3sectionE.getE0600A());
	}
}
