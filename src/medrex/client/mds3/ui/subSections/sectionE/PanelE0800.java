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

public class PanelE0800 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7939465779165497255L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbE0800;

	public PanelE0800() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 190));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_2_2_1 = new JxPanel();
		panel_1_1_2_2_1.setTheme(theme);
		panel_1_1_2_2_1.setBounds(0, 0, 840, 179);
		add(panel_1_1_2_2_1);
		panel_1_1_2_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1_2_2_1.setLayout(null);
		panel_1_1_2_2_1.setPreferredSize(new Dimension(840, 190));

		final JxPanel panel_6_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1.setBounds(0, 29, 80, 150);
		panel_1_1_2_2_1.add(panel_6_1_1_1_1);

		final JxLabel enterCodeLabel_1_2_1 = new JxLabel();
		enterCodeLabel_1_2_1.setTheme(theme);
		enterCodeLabel_1_2_1.setText("Enter Code");
		enterCodeLabel_1_2_1.setBounds(8, 55, 70, 14);
		panel_6_1_1_1_1.add(enterCodeLabel_1_2_1);

		cmbE0800 = new JxComboBox();
		cmbE0800.setTheme(theme);

		cmbE0800.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3" }));
		cmbE0800.setPreferredSize(new Dimension(50, 20));
		cmbE0800.setBounds(15, 80, 50, 20);
		panel_6_1_1_1_1.add(cmbE0800);

		final JxPanel panel_7_1_1_2_1 = new JxPanel();
		panel_7_1_1_2_1.setTheme(theme);

		panel_7_1_1_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_2_1.setLayout(null);
		panel_7_1_1_2_1.setBounds(79, 29, 761, 150);
		panel_1_1_2_2_1.add(panel_7_1_1_2_1);

		final JxLabel aNationalProviderLabel_3_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_2_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_2_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_2_1
				.setText("<html><body><b> Did the resident reject evaluation or care </b> (e.g.., bloodwork,taking medications, ADL assistance) <b> that is necessary to achieve the <br> resident's goals for health and well-being? </b> Do not include behaviors that have already been addressed(e.g.. by discussion or care <br> planning with the resident or family), and / or determined to be consistent with resident values, preferences, or goals.");
		aNationalProviderLabel_3_1_1_2_1.setBounds(10, 5, 737, 54);
		panel_7_1_1_2_1.add(aNationalProviderLabel_3_1_1_2_1);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3.setText("<html><body> 0. <b>Behavior not exhibited");
		label_3.setBounds(40, 65, 441, 14);
		panel_7_1_1_2_1.add(label_3);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4
				.setText("<html><body>1. <b> Behavior of this type occurred 1 to 3 days");
		label_4.setBounds(40, 85, 441, 14);
		panel_7_1_1_2_1.add(label_4);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5
				.setText("<html><body>2. <b> Behavior of this type occurred 4 to 6 days</b> , but less than daily");
		label_5.setBounds(40, 105, 441, 14);
		panel_7_1_1_2_1.add(label_5);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6
				.setText("<html><body>3. <b> Behavior of this type occurred daily");
		label_6.setBounds(40, 125, 441, 14);
		panel_7_1_1_2_1.add(label_6);

		final JxPanel panel_5_1_1_2_2_1 = new JxPanel();
		panel_5_1_1_2_2_1.setTheme(theme);
		panel_5_1_1_2_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_2_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_5_1_1_2_2_1.setLayout(null);
		panel_5_1_1_2_2_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_2_1.setBounds(0, 0, 840, 30);
		panel_1_1_2_2_1.add(panel_5_1_1_2_2_1);

		final JxLabel a0100Label_1_1_2_2_1 = new JxLabel();
		a0100Label_1_1_2_2_1.setTheme(theme);

		a0100Label_1_1_2_2_1.setFontSize(14);
		a0100Label_1_1_2_2_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_2_1
				.setText("E0800. Rejection of Care - Presence & Frequency");
		a0100Label_1_1_2_2_1.setBounds(11, 6, 399, 14);
		panel_5_1_1_2_2_1.add(a0100Label_1_1_2_2_1);

		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		Object obj = cmbE0800.getSelectedItem();
		if (obj != null) {
			mds3sectionE.setE0800((String) cmbE0800.getSelectedItem());
		} else {
			mds3sectionE.setE0800("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		cmbE0800.setSelectedItem(mds3sectionE.getE0800());

	}
}
