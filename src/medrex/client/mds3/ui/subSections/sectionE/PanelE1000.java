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

public class PanelE1000 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5789501464676250778L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbE1000B;
	private JxComboBox cmbE1000A;

	public PanelE1000() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 181));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(0, 0, 840, 181);

		panel_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 189));
		add(panel_1_1);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1.setLayout(flowLayout_3);
		panel_5_1.setBounds(0, 0, 840, 25);
		panel_1_1.add(panel_5_1);

		final JxLabel a0100Label_1 = new JxLabel();
		a0100Label_1.setTheme(theme);

		a0100Label_1.setFontSize(12);
		a0100Label_1.setFontStyle(Font.BOLD);
		a0100Label_1.setText("E1000. Wandering - Impact");
		panel_5_1.add(a0100Label_1);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setLayout(null);
		panel_6_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBounds(0, 24, 80, 157);
		panel_1_1.add(panel_6_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(5, 20, 70, 14);
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		cmbE1000A = new JxComboBox();
		cmbE1000A.setTheme(theme);
		cmbE1000A.setBounds(15, 40, 50, 20);
		cmbE1000A.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbE1000A.setPreferredSize(new Dimension(50, 20));
		panel_6_1.add(cmbE1000A);

		cmbE1000B = new JxComboBox();
		cmbE1000B.setTheme(theme);
		cmbE1000B.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbE1000B.setBounds(15, 120, 50, 21);
		panel_6_1.add(cmbE1000B);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(5, 100, 70, 14);
		panel_6_1.add(enterCodeLabel_1);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(79, 24, 761, 86);
		panel_1_1.add(panel_7_1);

		final JxLabel aNationalProviderLabel_2 = new JxLabel();
		aNationalProviderLabel_2.setTheme(theme);

		aNationalProviderLabel_2.setFontSize(12);
		aNationalProviderLabel_2
				.setText("<html><body><b> A. Does the wandering place the resident at significant risk of getting to a potentially dangerous place</b>(e.g.. stairs, outside of the facility)?");
		aNationalProviderLabel_2.setBounds(10, 5, 719, 34);
		panel_7_1.add(aNationalProviderLabel_2);

		final JxLabel aNationalProviderLabel_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1.setText("<html><body>0. <b> No");
		aNationalProviderLabel_1_1_1.setBounds(30, 40, 206, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4.setText("<html><body>1. <b>Yes");
		label_4.setBounds(30, 60, 54, 14);
		panel_7_1.add(label_4);

		final JxPanel panel_7_1_2 = new JxPanel();
		panel_7_1_2.setTheme(theme);

		panel_7_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBounds(79, 109, 761, 72);
		panel_1_1.add(panel_7_1_2);

		final JxLabel aNationalProviderLabel_2_2 = new JxLabel();
		aNationalProviderLabel_2_2.setTheme(theme);
		aNationalProviderLabel_2_2
				.setText("B. Does the wandering significantly intrude on the privacy or activities of others");
		aNationalProviderLabel_2_2.setBounds(10, 5, 666, 22);
		panel_7_1_2.add(aNationalProviderLabel_2_2);

		final JxLabel aNationalProviderLabel_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_1_1_2.setText("<html><body>0. <b> No");
		aNationalProviderLabel_1_1_1_2.setBounds(35, 25, 206, 14);
		panel_7_1_2.add(aNationalProviderLabel_1_1_1_2);

		final JxLabel label_4_1 = new JxLabel();
		label_4_1.setTheme(theme);

		label_4_1.setFontSize(12);
		label_4_1.setText("<html><body>1. <b>Yes");
		label_4_1.setBounds(35, 45, 187, 14);
		panel_7_1_2.add(label_4_1);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		Object obj1 = cmbE1000B.getSelectedItem();
		if (obj1 != null) {
			mds3sectionE.setE1000B((String) cmbE1000B.getSelectedItem());
		} else {
			mds3sectionE.setE1000B("");
		}
		Object obj2 = cmbE1000A.getSelectedItem();
		if (obj2 != null) {
			mds3sectionE.setE1000A((String) cmbE1000A.getSelectedItem());
		} else {
			mds3sectionE.setE1000A("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		cmbE1000B.setSelectedItem(mds3sectionE.getE1000B());
		cmbE1000A.setSelectedItem(mds3sectionE.getE1000A());

	}
}
