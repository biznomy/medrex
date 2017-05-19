package medrex.client.mds3.ui.subSections.sectionM;

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

public class PanelM0800A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 512774022253835728L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbM0800A;

	public PanelM0800A() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 50));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 50);
		add(panel);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_34.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 50);
		panel.add(panel_34);
		panel_34.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_34.setLayout(null);

		cmbM0800A = new JxComboBox();
		cmbM0800A.setTheme(theme);
		cmbM0800A.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"A" }));

		cmbM0800A.setBounds(15, 23, 50, 22);
		panel_34.add(cmbM0800A);

		final JxLabel enterNumberLabel = new JxLabel();
		enterNumberLabel.setTheme(theme);
		enterNumberLabel.setText("Enter Number");
		enterNumberLabel.setBounds(12, 6, 73, 14);
		panel_34.add(enterNumberLabel);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 50);
		panel.add(panel_16);
		panel_16.setLayout(null);
		panel_16.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);
		aLabel.setText("<html><body><b>  A.  </b> &nbsp <b> Stage 2 ");

		aLabel.setFontSize(12);
		aLabel.setBounds(10, 10, 500, 30);
		panel_16.add(aLabel);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		Object obj = cmbM0800A.getSelectedItem();
		if (obj != null) {
			mds3sectionM.setM0800A(cmbM0800A.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0800A("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cmbM0800A.setSelectedItem(mds3sectionM.getM0800A());

	}

}
