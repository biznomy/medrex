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

public class PanelN0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4566288914111891995L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbN0300;

	public PanelN0300() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 70));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 70);
		add(panel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBounds(0, 24, 80, 45);
		panel.add(panel_5);
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setLayout(null);

		cmbN0300 = new JxComboBox();
		cmbN0300.setTheme(theme);
		cmbN0300.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2", "3", "4", "5", "6", "7" }));

		cmbN0300.setBounds(15, 18, 50, 23);
		panel_5.add(cmbN0300);

		final JxLabel enterDaysLabel = new JxLabel();
		enterDaysLabel.setTheme(theme);
		enterDaysLabel.setText("Enter Days");
		enterDaysLabel.setBounds(10, 0, 54, 14);
		panel_5.add(enterDaysLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBounds(79, 24, 761, 45);

		panel.add(panel_14);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label
				.setText("<html><body><b> Record the number of days that injections of any type </b> were received during the last 7 days or since admission/<br> 7 days .If 0-->Skip to N0400,Medication received ");
		label.setBounds(5, 0, 750, 45);
		panel_14.add(label);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 840, 25);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_1);

		final JxLabel n0300InjectionsLabel = new JxLabel();
		n0300InjectionsLabel.setTheme(theme);

		n0300InjectionsLabel.setFontSize(12);
		n0300InjectionsLabel.setFontStyle(Font.BOLD);
		n0300InjectionsLabel.setBounds(25, 5, 390, 14);
		n0300InjectionsLabel.setText("N0300. Injections");
		panel_1.add(n0300InjectionsLabel);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionN mds3sectionN = (Mds3SectionN) Mds3Controller.getInstance()
				.getSection(Mds3SectionN.class);

		Object obj = cmbN0300.getSelectedItem();
		if (obj != null) {
			mds3sectionN.setN0300(cmbN0300.getSelectedItem().toString());
		} else {
			mds3sectionN.setN0300("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionN mds3sectionN = (Mds3SectionN) Mds3Controller.getInstance()
				.getSection(Mds3SectionN.class);
		cmbN0300.setSelectedItem(mds3sectionN.getN0300());

	}

}
