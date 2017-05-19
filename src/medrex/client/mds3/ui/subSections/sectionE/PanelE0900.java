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
import medrex.commons.vo.mds3.SectionE.Mds3SectionE;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelE0900 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1799516853319252231L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbE0900;

	public PanelE0900() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 135));
		setBackground(Color.WHITE);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBounds(0, 0, 840, 135);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);

		panel_1.setPreferredSize(new Dimension(840, 135));
		add(panel_1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setLayout(flowLayout_2);
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setBounds(0, 0, 840, 25);
		panel_1.add(panel_5);

		final JxLabel a0100Label = new JxLabel();
		a0100Label.setTheme(theme);

		a0100Label.setFontSize(12);
		a0100Label.setFontStyle(Font.BOLD);
		a0100Label.setText("E0900. Wandering - Presence & Frequency");
		panel_5.add(a0100Label);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setBounds(0, 24, 80, 111);
		panel_1.add(panel_6);

		final JxLabel enterCodeLabel_2 = new JxLabel();
		enterCodeLabel_2.setTheme(theme);
		enterCodeLabel_2.setBounds(5, 10, 70, 14);
		enterCodeLabel_2.setText("Enter Code");
		panel_6.add(enterCodeLabel_2);

		cmbE0900 = new JxComboBox();
		cmbE0900.setTheme(theme);
		cmbE0900.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3" }));

		cmbE0900.setPreferredSize(new Dimension(50, 20));
		cmbE0900.setBounds(15, 35, 50, 20);
		panel_6.add(cmbE0900);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);

		panel_7.setBounds(79, 24, 761, 111);
		panel_1.add(panel_7);

		final JxLabel aNationalProviderLabel = new JxLabel();
		aNationalProviderLabel.setTheme(theme);

		aNationalProviderLabel.setFontSize(12);
		aNationalProviderLabel.setFontStyle(Font.BOLD);
		aNationalProviderLabel.setText("Has the resident wandered?");
		aNationalProviderLabel.setBounds(10, 5, 206, 14);
		panel_7.add(aNationalProviderLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label
				.setText("<html><body>0.<b> Behavior not exhibited --></b> Skip to E1100, Change in Behavioral or Other Symptoms");
		label.setBounds(43, 25, 567, 14);
		panel_7.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1
				.setText("<html><body>1. <b> Behavior of this type occurred 1 to 3 days.</b>");
		label_1.setBounds(43, 45, 281, 14);
		panel_7.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2
				.setText("<html><body>2.<b> Behavior of this type occurred 4 to 6 days</b> ,but less than daily");
		label_2.setBounds(43, 64, 470, 14);
		panel_7.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3
				.setText("<html><body>3. <b> Behavior of this type occurred daily");
		label_3.setBounds(43, 84, 252, 14);
		panel_7.add(label_3);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		Object obj = cmbE0900.getSelectedItem();
		if (obj != null) {
			mds3sectionE.setE0900((String) cmbE0900.getSelectedItem());
		} else {
			mds3sectionE.setE0900("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		cmbE0900.setSelectedItem(mds3sectionE.getE0900());

	}
}
