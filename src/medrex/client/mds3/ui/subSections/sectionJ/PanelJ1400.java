package medrex.client.mds3.ui.subSections.sectionJ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionJ.Mds3SectionJ;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelJ1400 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4112434651464824015L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbJ1400;

	public PanelJ1400() {
		super();
		setPreferredSize(new Dimension(840, 100));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 85);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel j1300CurrentTobaccoLabel = new JxLabel();
		j1300CurrentTobaccoLabel.setTheme(theme);

		j1300CurrentTobaccoLabel.setFontSize(13);
		j1300CurrentTobaccoLabel.setFontStyle(Font.BOLD);
		j1300CurrentTobaccoLabel.setText("J1400.  Prognosis");
		j1300CurrentTobaccoLabel.setBounds(11, 6, 240, 14);
		panel_1.add(j1300CurrentTobaccoLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_2.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 61);
		panel.add(panel_2);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);

		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(15, 13, 54, 14);
		panel_2.add(enterCodeLabel);

		cmbJ1400 = new JxComboBox();
		cmbJ1400.setTheme(theme);
		cmbJ1400.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbJ1400.setBounds(15, 33, 50, 22);
		panel_2.add(cmbJ1400);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_3.setLayout(null);

		panel_3.setBounds(79, 24, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 61);
		panel.add(panel_3);

		final JxLabel tobaccoUseLabel = new JxLabel();
		tobaccoUseLabel.setTheme(theme);

		tobaccoUseLabel.setFontSize(12);
		tobaccoUseLabel
				.setText("<html><body> Does the resident have a condition or chronic disease that may result in a <b> life expectancy of less than 6 months ? </b> ( Requires physician <br> documentation)");
		tobaccoUseLabel.setBounds(10, 6, 741, 25);
		panel_3.add(tobaccoUseLabel);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1.setText("<html><body> 0. &nbsp <b> No");
		label_1.setBounds(25, 32, 54, 14);
		panel_3.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2.setText("<html><body> 1. &nbsp <b> Yes </b>");
		label_2.setBounds(25, 45, 54, 14);
		panel_3.add(label_2);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmbJ1400.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ1400(cmbJ1400.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ1400("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmbJ1400.setSelectedItem(mds3sectionJ.getJ1400());

	}

}
