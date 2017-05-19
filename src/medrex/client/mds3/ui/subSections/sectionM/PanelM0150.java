package medrex.client.mds3.ui.subSections.sectionM;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

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

public class PanelM0150 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8983399621720927637L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbM0150;

	public PanelM0150() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 75));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 75);
		add(panel);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);
		panel_17.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_17.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_17.setLayout(null);
		panel_17.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);

		panel.add(panel_17);

		final JxLabel m0150RiskOfLabel = new JxLabel();
		m0150RiskOfLabel.setTheme(theme);

		m0150RiskOfLabel.setFontSize(12);
		m0150RiskOfLabel.setFontStyle(Font.BOLD);
		m0150RiskOfLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		m0150RiskOfLabel.setText("   M0150. Risk of Pressure Ulcers");
		m0150RiskOfLabel.setBounds(0, 0, 840, 25);
		panel_17.add(m0150RiskOfLabel);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		// m0150RiskOfLabel.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_18.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);

		panel_18.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_18.setLayout(null);
		panel_18.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 51);
		panel.add(panel_18);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);

		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel.setText("Enter Code ");
		enterCodeLabel.setBounds(15, 3, 66, 20);
		panel_18.add(enterCodeLabel);

		cmbM0150 = new JxComboBox();
		cmbM0150.setTheme(theme);
		cmbM0150.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbM0150.setBounds(15, 22, 50, 22);
		panel_18.add(cmbM0150);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);

		panel_19.setBorder(new LineBorder(Mds3Constants.BORDER_BLACK,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_19.setLayout(null);
		panel_19.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 51);
		panel.add(panel_19);

		final JxLabel isThisResidentLabel = new JxLabel();
		isThisResidentLabel.setTheme(theme);
		isThisResidentLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		isThisResidentLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		isThisResidentLabel.setFontSize(12);
		isThisResidentLabel
				.setText("<html><body><b>   Is this resident at risk of developing pressure ulcers?</b> <br> &nbsp &nbsp 0. &nbsp <b> No </b> <br> &nbsp &nbsp 1. &nbsp <b> Yes</b>");
		isThisResidentLabel.setBounds(10, 5, 365, 45);
		panel_19.add(isThisResidentLabel);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		Object obj = cmbM0150.getSelectedItem();
		if (obj != null) {
			mds3sectionM.setM0150(cmbM0150.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0150("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cmbM0150.setSelectedItem(mds3sectionM.getM0150());

	}

}
