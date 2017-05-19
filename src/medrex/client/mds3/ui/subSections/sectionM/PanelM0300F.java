package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionM.Mds3SectionM;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelM0300F extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5125590356741396967L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbM0300F2;
	private JxComboBox cmbM0300F1;

	public PanelM0300F() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 120));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setForeground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 120);
		add(panel);

		final JxPanel panel_32 = new JxPanel();
		panel_32.setTheme(theme);
		panel_32.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_32.setLayout(null);
		panel_32.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 120);
		panel_32.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_32);

		cmbM0300F1 = new JxComboBox();
		cmbM0300F1.setTheme(theme);
		cmbM0300F1.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2" }));

		cmbM0300F1.setBounds(15, 45, 50, 22);
		panel_32.add(cmbM0300F1);

		cmbM0300F2 = new JxComboBox();
		cmbM0300F2.setTheme(theme);
		cmbM0300F2.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2" }));

		cmbM0300F2.setBounds(15, 90, 50, 22);
		panel_32.add(cmbM0300F2);

		final JxLabel enterNumberLabel_1 = new JxLabel();
		enterNumberLabel_1.setTheme(theme);

		enterNumberLabel_1.setText("Enter Number");
		enterNumberLabel_1.setBounds(12, 29, 67, 16);
		panel_32.add(enterNumberLabel_1);

		final JxLabel enterNumberLabel_2 = new JxLabel();
		enterNumberLabel_2.setTheme(theme);

		enterNumberLabel_2.setText("Enter Number");
		enterNumberLabel_2.setBounds(13, 75, 80, 16);
		panel_32.add(enterNumberLabel_2);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme(theme);

		panel_28.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_28.setLayout(null);
		panel_28.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 120);
		panel.add(panel_28);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label
				.setText("<html><body><b>F. </b> &nbsp <b> Unstageable-Slough and /or eschar: </b> Known but not stageable due to coverage of wound bed by slough and/or eschar </body></html> ");
		label.setBounds(10, 10, 740, 25);
		panel_28.add(label);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2
				.setText("<html><body><b>1. </b> &nbsp <b> Number of Unstageable pressure ulcers due to coverage of wound bed by slough and /or eschar </b> - if 0 --> Skip to M0300G, <br> &nbsp &nbsp &nbsp  Unstageable: Deep tissue ");
		label_2.setBounds(30, 40, 726, 38);
		panel_28.add(label_2);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1
				.setText("<html><body><b> 2. </b> &nbsp <b> Number of these unstageable pressure ulcers that were present upon admission/reentry </b> - enter how many were noted at the <br> &nbsp &nbsp &nbsp time of admission");
		label_1.setBounds(30, 80, 740, 38);
		panel_28.add(label_1);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		Object obj = cmbM0300F1.getSelectedItem();
		if (obj != null) {
			mds3sectionM.setM0300F_1(cmbM0300F1.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0300F_1("");
		}

		Object obj1 = cmbM0300F2.getSelectedItem();
		if (obj1 != null) {
			mds3sectionM.setM0300F_2(cmbM0300F2.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0300F_2("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cmbM0300F1.setSelectedItem(mds3sectionM.getM0300F_1());
		cmbM0300F2.setSelectedItem(mds3sectionM.getM0300F_2());

	}

}
