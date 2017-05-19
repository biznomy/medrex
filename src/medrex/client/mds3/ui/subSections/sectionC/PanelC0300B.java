package medrex.client.mds3.ui.subSections.sectionC;

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

public class PanelC0300B extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6328661298937053350L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbAbleToReportCorrectMonth;

	public PanelC0300B() {
		super();
		setAutoscrolls(true);
		setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		setLayout(null);
		setPreferredSize(new Dimension(840, 102));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 102);
		add(panel);
		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setBounds(5, 0, 80, 102);
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 200);
		panel.add(panel_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(13, 5, 54, 14);
		enterCodeLabel_1.setText("Enter Code");
		panel_1.add(enterCodeLabel_1);

		cmbAbleToReportCorrectMonth = new JxComboBox();
		cmbAbleToReportCorrectMonth.setTheme(theme);
		cmbAbleToReportCorrectMonth.setBounds(15, 24, 50, 20);
		cmbAbleToReportCorrectMonth.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "" }));

		cmbAbleToReportCorrectMonth.setPreferredSize(new Dimension(50, 20));
		panel_1.add(cmbAbleToReportCorrectMonth);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setOpaque(true);
		panel_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2.setLayout(null);
		panel_2.setBounds(85, 0, 750, 102);
		panel.add(panel_2);

		final JxLabel aNationalProviderLabel_3_1_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_1
				.setText("<html><body>Ask resident:<i>\"Please tell me what month it is right now.\"");
		aNationalProviderLabel_3_1_1_1.setBounds(10, 5, 706, 14);
		panel_2.add(aNationalProviderLabel_3_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_5_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_3_1_5_1
				.setText("B. Able to report correct month");
		aNationalProviderLabel_1_3_1_5_1.setBounds(20, 25, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_5_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_1
				.setText("<html><body>0. <b>Missed by >1 month </b> or no answer");
		aNationalProviderLabel_1_3_1_1_1_1.setBounds(30, 45, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_2_1_1
				.setText("<html><body>1. <b>Missed by 6 days to one month");
		aNationalProviderLabel_1_3_1_2_1_1.setBounds(30, 65, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_2_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_3_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_3_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_3_1_1
				.setText("<html><body>2. <b>Accurate within 5 days");
		aNationalProviderLabel_1_3_1_3_1_1.setBounds(30, 85, 311, 14);
		panel_2.add(aNationalProviderLabel_1_3_1_3_1_1);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		Object obj = cmbAbleToReportCorrectMonth.getSelectedItem();
		if (obj != null) {
			sectionC.setC0300B(cmbAbleToReportCorrectMonth.getSelectedItem()
					.toString());
		}
		sectionC.setC0300B("");

	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbAbleToReportCorrectMonth.setSelectedItem(mds3sectionC.getC0300B());
	}

}
