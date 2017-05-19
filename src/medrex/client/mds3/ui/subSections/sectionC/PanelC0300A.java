package medrex.client.mds3.ui.subSections.sectionC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelC0300A extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5784712516312840970L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbAbleToCorrectYear;

	public PanelC0300A() {
		super();
		setAutoscrolls(true);
		setOpaque(true);
		setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		setLayout(null);
		setPreferredSize(new Dimension(840, 123));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 123);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(5, 0, 80, 123);
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 200);
		panel.add(panel_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(15, 9, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_1.add(enterCodeLabel_1);

		cmbAbleToCorrectYear = new JxComboBox();
		cmbAbleToCorrectYear.setTheme(theme);
		cmbAbleToCorrectYear.setBounds(17, 31, 50, 20);
		cmbAbleToCorrectYear.setModel(new DefaultComboBoxModel(new String[] {
				"", "0", "1", "2", "3" }));

		cmbAbleToCorrectYear.setPreferredSize(new Dimension(50, 20));
		panel_1.add(cmbAbleToCorrectYear);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setOpaque(true);
		panel_2.setLayout(null);
		panel_2.setBounds(85, 0, 750, 123);
		panel.add(panel_2);

		final JxLabel aNationalProviderLabel_3_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1
				.setText("<html><body>Ask resident:<i>\"Please tell me what year it is right now.\"");
		aNationalProviderLabel_3_1_1.setBounds(10, 5, 706, 14);
		panel_2.add(aNationalProviderLabel_3_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_5 = new JxLabel();
		aNationalProviderLabel_1_3_1_5.setTheme(theme);

		aNationalProviderLabel_1_3_1_5.setFontSize(12);
		aNationalProviderLabel_1_3_1_5.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_3_1_5
				.setText("A. Able to report correct year");
		aNationalProviderLabel_1_3_1_5.setBounds(20, 25, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_5);

		final JxLabel aNationalProviderLabel_1_3_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1
				.setText("<html><body>0. <b>Missed by > 5 Years </b> or no answer");
		aNationalProviderLabel_1_3_1_1_1.setBounds(30, 45, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_2_1
				.setText("<html><body>1. <b>Missed by 2-5 years");
		aNationalProviderLabel_1_3_1_2_1.setBounds(30, 65, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_3_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_3_1
				.setText("<html><body>2. <b>Missed by 1 years");
		aNationalProviderLabel_1_3_1_3_1.setBounds(30, 85, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_4_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_4_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_4_1.setText("<html><body>3. <b>Correct");
		aNationalProviderLabel_1_3_1_4_1.setBounds(30, 105, 706, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_4_1);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		Object obj = cmbAbleToCorrectYear.getSelectedItem();
		if (obj != null) {
			sectionC.setC0300A(cmbAbleToCorrectYear.getSelectedItem() + "");
		} else {
			sectionC.setC0300A("");
		}
	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbAbleToCorrectYear.setSelectedItem(mds3sectionC.getC0300A());
	}

}
