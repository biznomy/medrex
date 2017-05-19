package medrex.client.mds3.ui.subSections.sectionJ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

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

public class PanelJ1700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1233165044274021644L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbJ1700C;
	private JxComboBox cmbJ1700B;
	private JxComboBox cmbJ1700A;

	public PanelJ1700() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 280));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_2_2 = new JxPanel();
		panel_1_1_2_2.setTheme(theme);
		panel_1_1_2_2.setBounds(0, 0, 840, 280);

		panel_1_1_2_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_1_1_2_2.setLayout(null);
		panel_1_1_2_2.setPreferredSize(new Dimension(840, 280));
		add(panel_1_1_2_2);

		final JxPanel panel_6_1_1_2 = new JxPanel();
		panel_6_1_1_2.setTheme(theme);
		panel_6_1_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_6_1_1_2.setLayout(null);
		panel_6_1_1_2.setBounds(0, 29, 80, 251);
		panel_1_1_2_2.add(panel_6_1_1_2);

		final JxLabel enterCodeLabel_1_3 = new JxLabel();
		enterCodeLabel_1_3.setTheme(theme);
		enterCodeLabel_1_3.setText("Enter Code");
		enterCodeLabel_1_3.setBounds(15, 21, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_3);

		cmbJ1700A = new JxComboBox();
		cmbJ1700A.setTheme(theme);
		cmbJ1700A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));

		cmbJ1700A.setPreferredSize(new Dimension(50, 20));
		cmbJ1700A.setBounds(15, 41, 50, 20);
		panel_6_1_1_2.add(cmbJ1700A);

		final JxLabel enterCodeLabel_1_1_3 = new JxLabel();
		enterCodeLabel_1_1_3.setTheme(theme);
		enterCodeLabel_1_1_3.setText("Enter Code");
		enterCodeLabel_1_1_3.setBounds(15, 110, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_1_3);

		cmbJ1700B = new JxComboBox();
		cmbJ1700B.setTheme(theme);
		cmbJ1700B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));

		cmbJ1700B.setPreferredSize(new Dimension(50, 20));
		cmbJ1700B.setBounds(15, 130, 50, 20);
		panel_6_1_1_2.add(cmbJ1700B);

		final JxLabel enterCodeLabel_1_1_2_1 = new JxLabel();
		enterCodeLabel_1_1_2_1.setTheme(theme);
		enterCodeLabel_1_1_2_1.setText("Enter Code");
		enterCodeLabel_1_1_2_1.setBounds(15, 189, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_1_2_1);

		cmbJ1700C = new JxComboBox();
		cmbJ1700C.setTheme(theme);
		cmbJ1700C.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));

		cmbJ1700C.setPreferredSize(new Dimension(50, 20));
		cmbJ1700C.setBounds(15, 209, 50, 20);
		panel_6_1_1_2.add(cmbJ1700C);

		final JxPanel panel_7_1_1_3 = new JxPanel();
		panel_7_1_1_3.setTheme(theme);

		panel_7_1_1_3.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_7_1_1_3.setLayout(null);
		panel_7_1_1_3.setBounds(79, 29, 761, 86);
		panel_1_1_2_2.add(panel_7_1_1_3);

		final JxLabel aNationalProviderLabel_3_1_1_3 = new JxLabel();
		aNationalProviderLabel_3_1_1_3.setTheme(theme);

		aNationalProviderLabel_3_1_1_3.setFontSize(12);
		aNationalProviderLabel_3_1_1_3
				.setText("<html><b>A.</b> Did the resident have fall any time in the <b>last month</b> prior to admission?");
		aNationalProviderLabel_3_1_1_3.setBounds(10, 5, 706, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_3_1_1_3);

		final JxLabel aNationalProviderLabel_1_3_1_5_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_2.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2.setBounds(20, 25, 311, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_1_3_1_5_2);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_5_2_1.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1.setBounds(20, 45, 311, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_1_3_1_5_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_5_2_1_1
				.setText("<html>9. <b>Unable to answer");
		aNationalProviderLabel_1_3_1_5_2_1_1.setBounds(20, 65, 311, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_1_3_1_5_2_1_1);

		final JxPanel panel_5_1_1_2_2 = new JxPanel();
		panel_5_1_1_2_2.setTheme(theme);
		panel_5_1_1_2_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_2.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setVgap(0);
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_2.setLayout(flowLayout_12);
		panel_5_1_1_2_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_2.setBounds(0, 0, 840, 30);
		panel_1_1_2_2.add(panel_5_1_1_2_2);

		final JxPanel panel_7_1_1_3_1 = new JxPanel();
		panel_7_1_1_3_1.setTheme(theme);

		panel_7_1_1_3_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_7_1_1_3_1.setLayout(null);
		panel_7_1_1_3_1.setBounds(79, 114, 761, 86);
		panel_1_1_2_2.add(panel_7_1_1_3_1);

		final JxLabel aNationalProviderLabel_3_1_1_3_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_3_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_3_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_3_1
				.setText("<html> <b> B.</b> Did the resident have a fall any time in the <b>last 2-6 months</b> prior to admission?");
		aNationalProviderLabel_3_1_1_3_1.setBounds(10, 5, 706, 14);
		aNationalProviderLabel_3_1_1_3_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_3_1.add(aNationalProviderLabel_3_1_1_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_5_2_2.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2_2.setBounds(20, 25, 311, 14);
		aNationalProviderLabel_1_3_1_5_2_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_3_1.add(aNationalProviderLabel_1_3_1_5_2_2);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_1_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_5_2_1_2.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1_2.setBounds(20, 45, 311, 14);
		aNationalProviderLabel_1_3_1_5_2_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_3_1.add(aNationalProviderLabel_1_3_1_5_2_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_5_2_1_1_2
				.setText("<html>9. <b>Unable to answer");
		aNationalProviderLabel_1_3_1_5_2_1_1_2.setBounds(20, 65, 311, 14);
		aNationalProviderLabel_1_3_1_5_2_1_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_3_1.add(aNationalProviderLabel_1_3_1_5_2_1_1_2);

		final JxPanel panel_7_1_1_3_1_1 = new JxPanel();
		panel_7_1_1_3_1_1.setTheme(theme);

		panel_7_1_1_3_1_1.setBorder(new LineBorder(
				Mds3Constants.BACKGROUND_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_7_1_1_3_1_1.setLayout(null);
		panel_7_1_1_3_1_1.setBounds(79, 200, 761, 79);
		panel_1_1_2_2.add(panel_7_1_1_3_1_1);

		final JxLabel aNationalProviderLabel_3_1_1_3_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_3_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_3_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_3_1_1
				.setText("<html><b>C.</b> Did the resident have any <b>fracture related to a fall in the last 6 months</b>prior to admission?");
		aNationalProviderLabel_3_1_1_3_1_1.setBounds(10, 5, 706, 14);
		aNationalProviderLabel_3_1_1_3_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_3_1_1_3_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_2_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_5_2_2_1.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2_2_1.setBounds(20, 25, 311, 14);
		aNationalProviderLabel_1_3_1_5_2_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_1_3_1_5_2_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_5_2_1_1_1.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1_1_1.setBounds(20, 40, 311, 14);
		aNationalProviderLabel_1_3_1_5_2_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_1_3_1_5_2_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_5_2_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_5_2_1_1_1_1
				.setText("<html>9. <b>Unable to answer");
		aNationalProviderLabel_1_3_1_5_2_1_1_1_1.setBounds(20, 55, 311, 14);
		aNationalProviderLabel_1_3_1_5_2_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_1_3_1_5_2_1_1_1_1);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmbJ1700A.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ1700A(cmbJ1700A.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ1700A("");
		}

		Object obj1 = cmbJ1700B.getSelectedItem();
		if (obj1 != null) {
			mds3sectionJ.setJ1700B(cmbJ1700B.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ1700B("");
		}

		Object obj2 = cmbJ1700C.getSelectedItem();
		if (obj2 != null) {
			mds3sectionJ.setJ1700C(cmbJ1700C.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ1700C("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmbJ1700A.setSelectedItem(mds3sectionJ.getJ1700A());
		cmbJ1700B.setSelectedItem(mds3sectionJ.getJ1700B());
		cmbJ1700C.setSelectedItem(mds3sectionJ.getJ1700C());
	}

}
