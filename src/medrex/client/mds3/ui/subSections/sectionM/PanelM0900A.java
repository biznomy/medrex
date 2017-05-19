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

public class PanelM0900A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4890222900582894914L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbM0900A;

	public PanelM0900A() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(841, 100));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, 841, 100);
		add(panel);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBounds(0, 0, 80, 50);
		panel.add(panel_34);
		panel_34.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_34.setLayout(null);

		cmbM0900A = new JxComboBox();
		cmbM0900A.setTheme(theme);
		cmbM0900A.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1" }));

		cmbM0900A.setBounds(15, 20, 58, 22);
		panel_34.add(cmbM0900A);

		final JxLabel enterNumberLabel = new JxLabel();
		enterNumberLabel.setTheme(theme);
		enterNumberLabel.setText("Enter Number");
		enterNumberLabel.setBounds(5, 2, 73, 14);
		panel_34.add(enterNumberLabel);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBounds(79, 0, 761, 50);
		panel.add(panel_16);
		panel_16.setLayout(null);
		panel_16.setBorder(new LineBorder(Color.black, 1, false));

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);
		label_4
				.setText("<html><body><b>  A.  Were Pressure ulcers on the prior assessment (OBRA,PPS,or Discharge)<br></b>   0.<b>NO--></b> Skip to M1030,Number of Vendors and Arterial Ulcers <br>  1.  <b> Yes </b> Continue to M0900B,stage 2 ");

		label_4.setFontSize(12);
		label_4.setBounds(10, 5, 500, 40);
		panel_16.add(label_4);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 49, 840, 50);
		panel.add(panel_1);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setBounds(10, 0, 830, 50);
		label
				.setText("<html><body>Indicate the number of pressure ulcers that were noted on the prior assessment (OBRA,PPS,or Discharge) that have completely closed <br>"
						+ "(resurfaced with epithelium). If no healted pressure ulcer at a given stage since the assessment (OBRA,PPS,or Discharge),enter 0 ");
		panel_1.add(label);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		Object obj = cmbM0900A.getSelectedItem();
		if (obj != null) {
			mds3sectionM.setM0900A(cmbM0900A.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0900A("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cmbM0900A.setSelectedItem(mds3sectionM.getM0900A());

	}

}
