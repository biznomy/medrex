package medrex.client.mds3.ui.subSections.sectionM;

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

public class PanelM0700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8382145113340222533L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbM0700;

	public PanelM0700() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 125));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 125);
		add(panel);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);
		panel_20.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_20.setLayout(null);
		panel_20.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);

		panel.add(panel_20);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);

		label_7.setFontSize(12);
		label_7.setFontStyle(Font.BOLD);
		label_7
				.setText("M0700. Most Severe Tissue Type for Any Pressure Ulcer ");
		label_7.setBounds(10, 5, 339, 17);
		panel_20.add(label_7);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);
		panel_21.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_21.setLayout(null);

		panel_21.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 101);
		panel.add(panel_21);

		final JxPanel panel_22 = new JxPanel();
		panel_22.setTheme(theme);
		panel_22.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_22.setLayout(null);
		panel_22.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_22.setBorder(new LineBorder(Color.black, 1, false));
		panel_22.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 101);

		panel_21.add(panel_22);

		cmbM0700 = new JxComboBox();
		cmbM0700.setTheme(theme);
		cmbM0700.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2",
				"3", "4" }));

		cmbM0700.setBounds(15, 47, 50, 22);
		panel_22.add(cmbM0700);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(15, 25, 66, 16);
		panel_22.add(enterCodeLabel);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_19.setLayout(null);
		panel_19.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 101);

		panel_21.add(panel_19);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5
				.setText("<html><body> Select the best description of the most severe type of tissue present in any pressure ulcer bed <br> &nbsp &nbsp &nbsp 1. &nbsp <b>  Epithelial tissue </b> - new skin growing in superficial ulcer. it can be light pink and shiny, even in person with darkly pigmented skin <br> &nbsp &nbsp &nbsp  2. &nbsp <b> Granulation tissue </b>- pink or red tissue with shiny ,moist ,granular appearence <br> &nbsp &nbsp &nbsp  3. &nbsp <b> Slough </b> - yellow or white tissue that address to the ulcer bed in strings or thick clumps, or is mucinous <br> &nbsp &nbsp &nbsp  4. &nbsp <b> Necrotic tissue (Eschar) </b> - black, brown, or tan tissue that adheres firmly to the wound bed or ulcer edgs, may be softer or harder <br> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp than surrounding skin  ");
		label_5.setBounds(10, 10, 750, 90);
		panel_19.add(label_5);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		Object obj = cmbM0700.getSelectedItem();
		if (obj != null) {
			mds3sectionM.setM0700(cmbM0700.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0700("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cmbM0700.setSelectedItem(mds3sectionM.getM0700());

	}

}
