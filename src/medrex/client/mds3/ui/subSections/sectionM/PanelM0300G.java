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

public class PanelM0300G extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7222226172329713982L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbM0300G2;
	private JxComboBox cmbM0300G1;

	public PanelM0300G() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 120));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

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

		cmbM0300G1 = new JxComboBox();
		cmbM0300G1.setTheme(theme);
		cmbM0300G1.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2" }));

		cmbM0300G1.setBounds(15, 45, 50, 22);
		panel_32.add(cmbM0300G1);

		cmbM0300G2 = new JxComboBox();
		cmbM0300G2.setTheme(theme);
		cmbM0300G2.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2" }));

		cmbM0300G2.setBounds(15, 90, 50, 22);
		panel_32.add(cmbM0300G2);

		final JxLabel enterNumberLabel_1 = new JxLabel();
		enterNumberLabel_1.setTheme(theme);

		enterNumberLabel_1.setText("Enter Number");
		enterNumberLabel_1.setBounds(12, 28, 80, 16);
		panel_32.add(enterNumberLabel_1);

		final JxLabel enterNumberLabel_2 = new JxLabel();
		enterNumberLabel_2.setTheme(theme);

		enterNumberLabel_2.setText("Enter Number");
		enterNumberLabel_2.setBounds(12, 75, 80, 16);
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
				.setText("<html><body><b>G.</b> &nbsp <b> Unstable - Deep tissue: </b> suspected deep tissue injury in evolution</body></html> ");
		label.setBounds(10, 7, 740, 25);
		panel_28.add(label);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2
				.setText("<html><body><b>1. </b> &nbsp<b> Number of Unstageable pressure ulcers due to deep tissue injury in evolution </b> - if 0 --> Skip to M0610, Dimension <br> &nbsp &nbsp &nbsp of Unhealed stage 3 to 4 Pressure Ulcers or Eschar");
		label_2.setBounds(30, 35, 761, 38);
		panel_28.add(label_2);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1
				.setText("<html><body><b> 2. </b> &nbsp <b>  Number of these unstageable pressure ulcers that were present upon admission/reentry </b> - enter how many were noted at the <br> &nbsp &nbsp  &nbsp time of admission");
		label_1.setBounds(30, 75, 740, 38);
		panel_28.add(label_1);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		Object obj = cmbM0300G1.getSelectedItem();
		if (obj != null) {
			mds3sectionM.setM0300G_1(cmbM0300G1.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0300G_1("");
		}

		Object obj1 = cmbM0300G2.getSelectedItem();
		if (obj1 != null) {
			mds3sectionM.setM0300G_2(cmbM0300G2.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0300G_2("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cmbM0300G1.setSelectedItem(mds3sectionM.getM0300G_1());
		cmbM0300G2.setSelectedItem(mds3sectionM.getM0300G_2());

	}

}
