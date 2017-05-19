package medrex.client.mds3.ui.subSections.sectionK;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.engine.Mds3ClientEngine;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionK.Mds3SectionK;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelK0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5587539430634579461L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtK0300;

	public PanelK0300() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 110));
		setLayout(null);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 840, 110);
		add(panel_1);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 840, 30);
		panel_1.add(panel_5);

		final JxLabel k0300WeightLossLabel = new JxLabel();
		k0300WeightLossLabel.setTheme(theme);

		k0300WeightLossLabel.setFontSize(12);
		k0300WeightLossLabel.setFontStyle(Font.BOLD);
		k0300WeightLossLabel.setText("K0300. Weight Loss");
		k0300WeightLossLabel.setBounds(10, 10, 209, 14);
		panel_5.add(k0300WeightLossLabel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 29, 80, 80);
		panel_1.add(panel_6);

		txtK0300 = new JxText();
		txtK0300.setTheme(theme);
		txtK0300.setForeground(Color.BLACK);
		txtK0300.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		txtK0300.setBounds(15, 40, 40, 25);
		panel_6.add(txtK0300);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);

		enterCodeLabel.setText("Enter Code");
		enterCodeLabel.setBounds(10, 20, 54, 14);
		panel_6.add(enterCodeLabel);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);
		panel_7.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7.setLayout(null);
		panel_7.setBounds(79, 29, 761, 80);
		panel_1.add(panel_7);

		final JxLabel loss5Label = new JxLabel();
		loss5Label.setTheme(theme);

		loss5Label.setFontSize(12);
		loss5Label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		loss5Label
				.setText("<html><body><b> Loss 5% or more in the last month or loss of 10% or more in last 6 months</b>");
		loss5Label.setBounds(10, 10, 500, 20);
		panel_7.add(loss5Label);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setText("<html><body> 0. <b> No </b> or unknown");
		label.setBounds(41, 30, 500, 14);
		panel_7.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1
				.setText("<html><body>1. <b> Yes, on </b> physician-prescribed weight-loss regimen");
		label_1.setBounds(41, 45, 403, 14);
		panel_7.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2
				.setText("<html><body>2. <b> Yes, not on </b> physician-prescribed weight-loss regimen");
		label_2.setBounds(41, 60, 363, 14);
		panel_7.add(label_2);
		doUpdate();

	}

	public void doSave() {

		Mds3SectionK mds3sectionK = (Mds3SectionK) Mds3Controller.getInstance()
				.getSection(Mds3SectionK.class);
		mds3sectionK.setK0200A(Mds3ClientEngine.getDouble(txtK0300.getText()));

	}

	double getDouble(String string) {
		try {
			return (Double.parseDouble(string));
		} catch (Exception e) {
			return 0.0;
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionK mds3sectionK = (Mds3SectionK) Mds3Controller.getInstance()
				.getSection(Mds3SectionK.class);
		txtK0300.setText(mds3sectionK.getK0300() + "");
	}

}
