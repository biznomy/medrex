package medrex.client.mds3.ui.subSections.sectionN;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionN.Mds3SectionN;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelN0350 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4957269915322556425L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbN0350B;
	private JxComboBox cmbN0350A;

	public PanelN0350() {
		super();
		setPreferredSize(new Dimension(840, 120));
		setLayout(null);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 840, 120);

		add(panel_7);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_15.setLayout(null);
		panel_15.setBounds(0, 0, 840, 20);
		panel_15.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_7.add(panel_15);

		final JxLabel n0300injectionsLabel_1 = new JxLabel();
		n0300injectionsLabel_1.setTheme(theme);
		n0300injectionsLabel_1.setBounds(35, 0, 120, 20);
		panel_15.add(n0300injectionsLabel_1);

		n0300injectionsLabel_1.setFontSize(12);
		n0300injectionsLabel_1.setFontStyle(Font.BOLD);
		n0300injectionsLabel_1.setText("N0350. Insulin");

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBounds(0, 20, 80, 100);
		panel_7.add(panel_8);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_8.setLayout(null);

		cmbN0350A = new JxComboBox();
		cmbN0350A.setTheme(theme);
		cmbN0350A.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2", "3", "4", "5", "6", "7" }));

		cmbN0350A.setBounds(20, 20, 50, 23);
		panel_8.add(cmbN0350A);

		cmbN0350B = new JxComboBox();
		cmbN0350B.setTheme(theme);
		cmbN0350B.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2", "3", "4", "5", "6", "7" }));

		cmbN0350B.setBounds(20, 65, 50, 23);
		panel_8.add(cmbN0350B);

		final JxLabel enterDaysLabel_1 = new JxLabel();
		enterDaysLabel_1.setTheme(theme);
		enterDaysLabel_1.setText("Enter Days ");
		enterDaysLabel_1.setBounds(10, 47, 70, 14);
		panel_8.add(enterDaysLabel_1);

		final JxLabel enterDaysLabel_2 = new JxLabel();
		enterDaysLabel_2.setTheme(theme);
		enterDaysLabel_2.setText("Enter Days ");
		enterDaysLabel_2.setBounds(10, 0, 70, 14);
		panel_8.add(enterDaysLabel_2);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBounds(80, 20, 760, 100);
		panel_7.add(panel_9);
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(0, 0, 760, 50);

		panel_9.add(panel_10);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1
				.setText("<html><body><b> A. Insulin injections -Record the number of days that insulin injections </b> were received during the last 7 days or since admission/<br> &nbsp &nbsp reenry if less than 7 days ");
		label_1.setBounds(10, 5, 750, 45);
		panel_10.add(label_1);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBounds(0, 50, 760, 50);

		panel_9.add(panel_11);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2.setBounds(10, 5, 750, 45);
		label_2
				.setText("<html><body><b> B. Order for insulin -Record the number of days the physician (or authorized assistant or practitioner)changed the resident's <br> &nbsp &nbsp insulin orders </b> during the last 7 days or since admission /reentry if less than 7 days");
		panel_11.add(label_2);

		doUpdate();

	}

	@Override
	public void doSave() {
		Mds3SectionN mds3sectionN = (Mds3SectionN) Mds3Controller.getInstance()
				.getSection(Mds3SectionN.class);

		Object obj = cmbN0350A.getSelectedItem();
		if (obj != null) {
			mds3sectionN.setN0350A(cmbN0350A.getSelectedItem().toString());
		} else {
			mds3sectionN.setN0350A("");
		}

		Object obj1 = cmbN0350B.getSelectedItem();
		if (obj1 != null) {
			mds3sectionN.setN0350B(cmbN0350B.getSelectedItem().toString());
		} else {
			mds3sectionN.setN0350B("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionN mds3sectionN = (Mds3SectionN) Mds3Controller.getInstance()
				.getSection(Mds3SectionN.class);
		cmbN0350A.setSelectedItem(mds3sectionN.getN0350A());
		cmbN0350B.setSelectedItem(mds3sectionN.getN0350B());

	}

}
