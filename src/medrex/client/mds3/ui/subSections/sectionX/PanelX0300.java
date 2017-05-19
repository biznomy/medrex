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

public class PanelX0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1142661357096807749L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbX0300;

	public PanelX0300() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 75));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);

		panel_20.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_20.setLayout(null);
		panel_20.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 75);
		add(panel_20);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);
		panel_21.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_21.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_21.setLayout(null);
		panel_21.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_20.add(panel_21);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 50);
		panel_20.add(panel_11);
		panel_11.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_11.setLayout(null);

		final JxPanel panel_5_3 = new JxPanel();
		panel_5_3.setTheme(theme);
		panel_5_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_3.setLayout(null);
		panel_5_3.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 51);
		panel_11.add(panel_5_3);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel.setBounds(13, 3, 66, 16);
		panel_5_3.add(enterCodeLabel);

		cmbX0300 = new JxComboBox();
		cmbX0300.setTheme(theme);
		cmbX0300.setModel(new DefaultComboBoxModel(
				new String[] { "", "1", "2" }));

		cmbX0300.setBounds(15, 22, 50, 22);
		panel_5_3.add(cmbX0300);

		final JxPanel panel_6_3 = new JxPanel();
		panel_6_3.setTheme(theme);

		panel_6_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_3.setLayout(null);
		panel_6_3.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 51);
		panel_11.add(panel_6_3);

		final JxLabel label_10 = new JxLabel();
		label_10.setTheme(theme);

		label_10.setFontSize(12);
		label_10.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_10.setText("<html><body> 1. &nbsp <b>  Male ");
		label_10.setBounds(20, 10, 458, 15);
		panel_6_3.add(label_10);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label.setText("<html><body> 2. &nbsp <b> Female");
		label.setBounds(20, 29, 101, 15);
		panel_6_3.add(label);

		final JxLabel x0100TypeOfLabel_1_1_1 = new JxLabel();
		x0100TypeOfLabel_1_1_1.setTheme(theme);

		x0100TypeOfLabel_1_1_1.setFontSize(12);
		x0100TypeOfLabel_1_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		x0100TypeOfLabel_1_1_1
				.setText("<html><body> <b> X0300. Gender </b> on existing record to be modified/inactivated");
		x0100TypeOfLabel_1_1_1.setBounds(10, 5, 603, 14);
		panel_21.add(x0100TypeOfLabel_1_1_1);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		Object obj = cmbX0300.getSelectedItem();
		if (obj != null) {
			sectionX.setX0300(cmbX0300.getSelectedItem().toString());
		} else {
			sectionX.setX0300("");
		}

	}

	public void doUpdate() {
		Mds3SectionX mds3SectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		cmbX0300.setSelectedItem(mds3SectionX.getX0300());
	}
}
