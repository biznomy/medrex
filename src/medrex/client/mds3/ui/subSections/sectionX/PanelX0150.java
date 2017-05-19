package medrex.client.mds3.ui.subSections.sectionX;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

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

public class PanelX0150 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8924640515888483470L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbX0150;

	public PanelX0150() {
		super();

		setFont(new Font("", Font.PLAIN, 10));
		setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 75));

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		panel_18.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_18.setLayout(null);
		panel_18.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 75);
		add(panel_18);

		final JxPanel panel_9_1 = new JxPanel();
		panel_9_1.setTheme(theme);
		panel_9_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_18.add(panel_9_1);
		panel_9_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9_1.setLayout(null);

		final JxLabel x0100TypeOfLabel_1 = new JxLabel();
		x0100TypeOfLabel_1.setTheme(theme);

		x0100TypeOfLabel_1.setFontSize(12);
		x0100TypeOfLabel_1.setFontStyle(Font.BOLD);
		x0100TypeOfLabel_1.setText("X0150. Type of Provider");
		x0100TypeOfLabel_1.setBounds(10, 0, 603, 26);
		panel_9_1.add(x0100TypeOfLabel_1);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 50);
		panel_18.add(panel_8);
		panel_8.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_8.setLayout(null);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 51);
		panel_8.add(panel_5_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);

		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(13, 6, 70, 16);
		panel_5_1.add(enterCodeLabel);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);

		panel_6_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 51);
		panel_8.add(panel_6_1);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);

		label_7.setFontSize(12);
		label_7.setFontStyle(Font.BOLD);
		label_7
				.setText("<html><body><b> Type of provider <br> &nbsp &nbsp 1.</b> &nbsp <b> Nursing home (SNF/NF) <br> &nbsp &nbsp 2. </b> &nbsp <b> Swing Bed");
		label_7.setBounds(10, 5, 386, 45);
		panel_6_1.add(label_7);

		cmbX0150 = new JxComboBox();
		cmbX0150.setTheme(theme);

		cmbX0150.setModel(new DefaultComboBoxModel(
				new String[] { "", "1", "2" }));
		cmbX0150.setBounds(12, 22, 50, 22);
		panel_5_1.add(cmbX0150);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		Object obj = cmbX0150.getSelectedItem();
		if (obj != null) {
			sectionX.setX0150(cmbX0150.getSelectedItem().toString());
		} else {
			sectionX.setX0150("");
		}

	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		cmbX0150.setSelectedItem(mds3SectionX.getX0150());
	}
}
