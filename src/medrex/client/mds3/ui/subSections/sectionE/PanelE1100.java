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

public class PanelE1100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2293274476596986189L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbE1100;

	public PanelE1100() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 156));
		setBackground(Color.WHITE);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setBounds(0, 0, 840, 156);

		panel_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 156));
		add(panel_1_2);

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setLayout(null);
		panel_5_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_2.setBounds(0, 0, 840, 47);
		panel_1_2.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);

		a0100Label_2.setFontSize(12);
		a0100Label_2.setFontStyle(Font.BOLD);
		a0100Label_2.setBounds(11, 6, 399, 14);
		a0100Label_2.setText("E1100. Change in Behavior or Other Symptoms");
		panel_5_2.add(a0100Label_2);

		final JxLabel considerAllOfLabel = new JxLabel();
		considerAllOfLabel.setTheme(theme);

		considerAllOfLabel.setFontSize(12);
		considerAllOfLabel
				.setText("Consider all of the symptoms assessed in items E0100 through E1000");
		considerAllOfLabel.setBounds(10, 20, 498, 14);
		panel_5_2.add(considerAllOfLabel);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		panel_6_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2.setLayout(null);
		panel_6_2.setBounds(0, 46, 80, 110);
		panel_1_2.add(panel_6_2);

		final JxLabel enterCodeLabel_2_1 = new JxLabel();
		enterCodeLabel_2_1.setTheme(theme);
		enterCodeLabel_2_1.setText("Enter Code");
		enterCodeLabel_2_1.setBounds(5, 31, 70, 14);
		panel_6_2.add(enterCodeLabel_2_1);

		cmbE1100 = new JxComboBox();
		cmbE1100.setTheme(theme);
		cmbE1100.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3" }));

		cmbE1100.setPreferredSize(new Dimension(50, 20));
		cmbE1100.setBounds(15, 51, 50, 20);
		panel_6_2.add(cmbE1100);

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_2.setLayout(null);
		panel_7_2.setBounds(79, 46, 761, 110);
		panel_1_2.add(panel_7_2);

		final JxLabel aNationalProviderLabel_1 = new JxLabel();
		aNationalProviderLabel_1.setTheme(theme);

		aNationalProviderLabel_1.setFontSize(12);
		aNationalProviderLabel_1
				.setText("<html><body> How does resident's current behavior status, care rejection, or wandering <b> compare to prior assessment(OBRA or PPS)?");
		aNationalProviderLabel_1.setBounds(10, 5, 741, 34);
		panel_7_2.add(aNationalProviderLabel_1);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5.setText("<html><body> 0.<b> Same");
		label_5.setBounds(45, 40, 567, 14);
		panel_7_2.add(label_5);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);

		label_1_1.setFontSize(12);
		label_1_1.setText("<html><body>1. <b>Improved");
		label_1_1.setBounds(45, 55, 281, 14);
		panel_7_2.add(label_1_1);

		final JxLabel label_2_1 = new JxLabel();
		label_2_1.setTheme(theme);

		label_2_1.setFontSize(12);
		label_2_1.setText("<html><body> 2. <b>  Worse");
		label_2_1.setBounds(45, 70, 470, 14);
		panel_7_2.add(label_2_1);

		final JxLabel label_3_1 = new JxLabel();
		label_3_1.setTheme(theme);

		label_3_1.setFontSize(12);
		label_3_1
				.setText("<html><body>3. <b> N/A </b> because no prior MDS assessment");
		label_3_1.setBounds(45, 85, 252, 14);
		panel_7_2.add(label_3_1);

		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		Object obj = cmbE1100.getSelectedItem();
		if (obj != null) {
			mds3sectionE.setE1000A(cmbE1100.getSelectedItem().toString());
		} else {
			mds3sectionE.setE1000A("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		cmbE1100.setSelectedItem(mds3sectionE.getE1000A());

	}
}
