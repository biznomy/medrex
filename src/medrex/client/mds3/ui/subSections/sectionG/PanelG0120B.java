package medrex.client.mds3.ui.subSections.sectionG;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionG.Mds3SectionG;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelG0120B extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4123805391567333595L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbG0120B;

	public PanelG0120B() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 54));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 54);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 54);
		panel.add(panel_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(15, 6, 54, 14);
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_1.add(enterCodeLabel);
		enterCodeLabel.setText("Enter Code");

		cmbG0120B = new JxComboBox();
		cmbG0120B.setTheme(theme);
		cmbG0120B.setBounds(15, 25, 50, 22);
		panel_1.add(cmbG0120B);
		cmbG0120B.setSelectedItem("");

		cmbG0120B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "8" }));
		cmbG0120B.setPreferredSize(new Dimension(50, 20));

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBounds(79, 0, 761, 55);
		panel.add(panel_7);
		panel_7.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7.setLayout(null);

		final JxLabel aNationalProviderLabel = new JxLabel();
		aNationalProviderLabel.setTheme(theme);

		aNationalProviderLabel.setFontSize(12);
		aNationalProviderLabel.setFontStyle(Font.BOLD);
		aNationalProviderLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel
				.setText("<html><body><b>B. Support Provided </b>");
		aNationalProviderLabel.setBounds(10, 5, 206, 14);
		panel_7.add(aNationalProviderLabel);

		final JxLabel aNationalProviderLabel_1 = new JxLabel();
		aNationalProviderLabel_1.setTheme(theme);

		aNationalProviderLabel_1.setFontSize(12);
		aNationalProviderLabel_1
				.setText("<html><body>(Bathing support codes are as defined in item <b> G0110 column 2, ADL Support Provided,</b> above)");
		aNationalProviderLabel_1.setBounds(10, 25, 605, 14);
		panel_7.add(aNationalProviderLabel_1);
		doUpdate();

	}

	public void doSave() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		Object obj = cmbG0120B.getSelectedItem();
		if (obj != null) {
			mds3sectionG.setG0120B(cmbG0120B.getSelectedItem().toString());
		} else {
			mds3sectionG.setG0120B("");
		}

	}

	public void doUpdate() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		cmbG0120B.setSelectedItem(mds3sectionG.getG0120B());
	}
}
