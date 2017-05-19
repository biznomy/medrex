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

public class PanelM0800C extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1681233927174660752L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbM0800C;

	public PanelM0800C() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(841, 50));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, 841, 50);
		add(panel);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBounds(0, 0, 80, 50);
		panel.add(panel_34);
		panel_34.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_34.setLayout(null);

		cmbM0800C = new JxComboBox();
		cmbM0800C.setTheme(theme);

		cmbM0800C.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"C" }));
		cmbM0800C.setBounds(15, 20, 50, 22);
		panel_34.add(cmbM0800C);

		final JxLabel enterNumberLabel = new JxLabel();
		enterNumberLabel.setTheme(theme);
		enterNumberLabel.setText("Enter Number");
		enterNumberLabel.setBounds(5, 2, 73, 14);
		panel_34.add(enterNumberLabel);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBounds(79, 0, 760, 50);
		panel.add(panel_16);
		panel_16.setLayout(null);
		panel_16.setBorder(new LineBorder(Color.black, 1, false));

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);
		label_4.setText("<html><body><b>  C.  Stage 4 ");

		label_4.setFontSize(12);
		label_4.setBounds(10, 0, 500, 40);
		panel_16.add(label_4);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		Object obj = cmbM0800C.getSelectedItem();
		if (obj != null) {
			mds3sectionM.setM0800C(cmbM0800C.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0800C("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cmbM0800C.setSelectedItem(mds3sectionM.getM0800C());

	}

}
