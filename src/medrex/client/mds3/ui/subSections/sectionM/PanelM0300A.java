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

public class PanelM0300A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7461777615701782900L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbM0300A;

	public PanelM0300A() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 50));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 50);
		add(panel);

		final JxPanel panel_31 = new JxPanel();
		panel_31.setTheme(theme);
		panel_31.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_31.setLayout(null);
		panel_31.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 50);
		panel_31.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.add(panel_31);

		cmbM0300A = new JxComboBox();
		cmbM0300A.setTheme(theme);

		cmbM0300A.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2", "3" }));
		cmbM0300A.setBounds(15, 22, 50, 22);
		panel_31.add(cmbM0300A);

		final JxLabel enterNumberLabel = new JxLabel();
		enterNumberLabel.setTheme(theme);

		enterNumberLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterNumberLabel.setText("Enter Number");
		enterNumberLabel.setBounds(12, 3, 69, 20);
		panel_31.add(enterNumberLabel);

		final JxPanel panel_27 = new JxPanel();
		panel_27.setTheme(theme);

		panel_27.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_27.setLayout(null);
		panel_27.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 50);
		panel.add(panel_27);

		final JxLabel aNumberLabel = new JxLabel();
		aNumberLabel.setTheme(theme);

		aNumberLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNumberLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNumberLabel.setFontSize(12);
		aNumberLabel
				.setText("<html><body><b> A. </b> &nbsp <b>  Number of stage 1 pressure ulcers <br> &nbsp &nbsp &nbsp Stage 1:</b> Intact skin with non-blanchable redness of a localized area usually over a bony prominence. Darkly pigmented skin may not <br>&nbsp &nbsp &nbsp have a visible blanching ;in dark skin tones only it may appear with persistent blue or purple hues.");
		aNumberLabel.setBounds(10, 2, 750, 46);
		panel_27.add(aNumberLabel);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);

		Object obj = cmbM0300A.getSelectedItem();
		if (obj != null) {
			mds3sectionM.setM0300A(cmbM0300A.getSelectedItem().toString());
		} else {
			mds3sectionM.setM0300A("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionM mds3sectionM = (Mds3SectionM) Mds3Controller.getInstance()
				.getSection(Mds3SectionM.class);
		cmbM0300A.setSelectedItem(mds3sectionM.getM0300A());

	}

}
