package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelX0600C extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2041076541900389661L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbX0600C;

	public PanelX0600C() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 85));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 85);
		add(panel_16);
		panel_16.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_16.setLayout(null);

		final JxPanel panel_5_8 = new JxPanel();
		panel_5_8.setTheme(theme);
		panel_5_8.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_8.setLayout(null);
		panel_5_8.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 85);
		panel_16.add(panel_5_8);

		final JxLabel enterCodeLabel_3 = new JxLabel();
		enterCodeLabel_3.setTheme(theme);

		enterCodeLabel_3.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_3.setText("Enter Code");
		enterCodeLabel_3.setBounds(15, 13, 66, 16);
		panel_5_8.add(enterCodeLabel_3);

		cmbX0600C = new JxComboBox();
		cmbX0600C.setTheme(theme);

		cmbX0600C.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));
		cmbX0600C.setBounds(15, 30, 50, 22);
		panel_5_8.add(cmbX0600C);

		final JxPanel panel_6_8 = new JxPanel();
		panel_6_8.setTheme(theme);

		panel_6_8.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_8.setLayout(null);
		panel_6_8.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 85);
		panel_16.add(panel_6_8);

		final JxLabel label_16 = new JxLabel();
		label_16.setTheme(theme);

		label_16.setFontSize(12);
		label_16.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_16
				.setText("<html><body> <b> C.</b> &nbsp <b> PPS Other Medicare Required Assessment -OMRA <br> &nbsp &nbsp &nbsp </b> 0. &nbsp <b> No </b> <br> &nbsp &nbsp &nbsp 1. &nbsp <b>Start of therapy </b> assessment <br> &nbsp &nbsp &nbsp 2. &nbsp  <b> End of therapy </b> assessment <br> &nbsp &nbsp &nbsp 3. &nbsp <b> Both Start and End of therapy </b> assessment");
		label_16.setBounds(10, 4, 371, 80);
		panel_6_8.add(label_16);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		Object obj = cmbX0600C.getSelectedItem();
		if (obj != null) {
			sectionX.setX0600C(cmbX0600C.getSelectedItem().toString());
		} else {
			sectionX.setX0600C("");
		}
	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		cmbX0600C.setSelectedItem(mds3SectionX.getX0600C());

	}

}
