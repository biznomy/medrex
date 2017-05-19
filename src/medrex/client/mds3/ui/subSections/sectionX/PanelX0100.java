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

public class PanelX0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4915065896059230550L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbX0100;

	public PanelX0100() {
		super();

		setFont(new Font("", Font.PLAIN, 10));
		setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 125));

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);

		panel_17.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_17.setLayout(null);
		panel_17.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 125);
		add(panel_17);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9.setLayout(null);
		panel_9.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel_17.add(panel_9);

		final JxLabel x0100TypeOfLabel = new JxLabel();
		x0100TypeOfLabel.setTheme(theme);

		x0100TypeOfLabel.setFontSize(12);
		x0100TypeOfLabel.setFontStyle(Font.BOLD);
		x0100TypeOfLabel.setText("X0100. Types of Record ");
		x0100TypeOfLabel.setBounds(10, 6, 450, 14);
		panel_9.add(x0100TypeOfLabel);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 50);
		panel_17.add(panel);
		panel.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel.setLayout(null);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);

		panel_6.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setLayout(null);
		panel_6.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 50);
		panel.add(panel_6);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6
				.setText("<html><body> &nbsp &nbsp 1. &nbsp <b>  Add new record --></b> Skip to Z0100, Medicare Part A Billing <br> &nbsp &nbsp  2. &nbsp <b>  Modify existing record --> </b> Continue to X0150, Type of Provider <br> &nbsp &nbsp  3. &nbsp <b> Inactivate existing record --></b> Continue to X0150, Type of Provider ");
		label_6.setBounds(10, 5, 436, 40);
		panel_6.add(label_6);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 50);
		panel.add(panel_5);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setText("Enter Code");
		label.setBounds(13, 4, 70, 16);
		panel_5.add(label);

		cmbX0100 = new JxComboBox();
		cmbX0100.setTheme(theme);
		cmbX0100.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2",
				"3" }));

		cmbX0100.setBounds(15, 22, 50, 22);
		panel_5.add(cmbX0100);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(0, 73, Mds3Constants.PAGE_WIDTH, 52);
		panel_17.add(panel_1);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1
				.setText("<html><body><b> Identification of Record to be Modified/Inactivated </b> - The following items identify the existing assessment record that is in error. In this <br> section, reproduce the information EXACTLY as it appeared to the existing errorneous record, even if the information is incorrect. <br> This information is necessary to locate the existing record in the National MDS Database. ");
		label_1.setBounds(10, 7, 805, 40);
		panel_1.add(label_1);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionX sectionX = (Mds3SectionX) Mds3Controller.getInstance()
				.getSection(Mds3SectionX.class);
		Object obj = cmbX0100.getSelectedItem();
		if (obj != null) {
			sectionX.setX0100(cmbX0100.getSelectedItem().toString());
		} else {
			sectionX.setX0100("");
		}

	}

	public void doUpdate() {
	}
}
