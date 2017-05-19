package medrex.client.mds3.ui.subSections.sectionD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionD.Mds3SectionD;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelD0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6082569457192161532L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbD0600;

	public PanelD0600() {
		super();
		setPreferredSize(new Dimension(840, 70));
		setLayout(null);
		setBackground(Mds3Constants.BACKGROUND_DARKGRAY);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBackground(Mds3Constants.BACKGROUND_DARKGRAY);
		panel_13.setLayout(null);
		panel_13.setBounds(0, 0, 840, 25);
		add(panel_13);

		final JxLabel d0300TotalSeverityLabel = new JxLabel();
		d0300TotalSeverityLabel.setTheme(theme);

		d0300TotalSeverityLabel.setFontSize(12);
		d0300TotalSeverityLabel.setFontStyle(Font.BOLD);
		d0300TotalSeverityLabel.setForeground(Color.WHITE);
		d0300TotalSeverityLabel.setText("D0600. Total Severity Score");
		d0300TotalSeverityLabel.setBounds(10, 5, 766, 15);
		panel_13.add(d0300TotalSeverityLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBackground(Mds3Constants.BACKGROUND_DARKGRAY);
		panel_14.setLayout(null);
		panel_14.setBounds(0, 25, 80, 45);
		add(panel_14);

		cmbD0600 = new JxComboBox();
		cmbD0600.setTheme(theme);

		cmbD0600.setModel(new DefaultComboBoxModel(new String[] { "", "00",
				"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
				"21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
		cmbD0600.setPreferredSize(new Dimension(50, 20));
		cmbD0600.setBounds(10, 5, 50, 22);
		panel_14.add(cmbD0600);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setForeground(Color.WHITE);
		enterCodeLabel.setText("Enter Score");
		enterCodeLabel.setBounds(10, 30, 70, 14);
		panel_14.add(enterCodeLabel);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(Color.black, 1, false));

		panel_15.setLayout(null);
		panel_15.setBounds(80, 25, 760, 42);
		add(panel_15);

		final JxLabel addScoresForLabel = new JxLabel();
		addScoresForLabel.setTheme(theme);

		addScoresForLabel.setFontSize(12);
		addScoresForLabel
				.setText("<html><body><b>Add scores for all frequency responses in Column 2</b>, Symptom Frequency. Total score must be between 00 and 30.");
		addScoresForLabel.setBounds(20, 10, 672, 24);
		panel_15.add(addScoresForLabel);
		doUpdate();

	}

	public void doSave() {
		Mds3SectionD mds3sectionD = (Mds3SectionD) Mds3Controller.getInstance()
				.getSection(Mds3SectionD.class);
		Object obj = cmbD0600.getSelectedItem();
		if (obj != null) {
			mds3sectionD.setD0600((String) cmbD0600.getSelectedItem());
		} else {
			mds3sectionD.setD0600("");
		}
	}

	public void doUpdate() {
		Mds3SectionD mds3sectionD = (Mds3SectionD) Mds3Controller.getInstance()
				.getSection(Mds3SectionD.class);
		cmbD0600.setSelectedItem(mds3sectionD.getD0600());

	}

}
