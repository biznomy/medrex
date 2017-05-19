package medrex.client.mds3.ui.subSections.sectionH;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionH.Mds3SectionH;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelH0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2355902631634106366L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbH0300;

	public PanelH0300() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 155));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(0, 0, 840, 155);

		panel_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 180));
		add(panel_1_1);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1.setLayout(flowLayout_3);
		panel_5_1.setBounds(0, 0, 840, 25);
		panel_1_1.add(panel_5_1);

		final JxLabel a0100Label_1 = new JxLabel();
		a0100Label_1.setTheme(theme);

		a0100Label_1.setFontSize(12);
		a0100Label_1.setFontStyle(Font.BOLD);
		a0100Label_1.setText("H0300. Urinary Continence");
		a0100Label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_5_1.add(a0100Label_1);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setLayout(null);
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setBounds(0, 25, 80, 130);
		panel_1_1.add(panel_6_1);

		final JxLabel enterCodeLabel_1_2 = new JxLabel();
		enterCodeLabel_1_2.setTheme(theme);
		enterCodeLabel_1_2.setBounds(15, 35, 54, 14);
		enterCodeLabel_1_2.setText("Enter Code");
		panel_6_1.add(enterCodeLabel_1_2);

		cmbH0300 = new JxComboBox();
		cmbH0300.setTheme(theme);
		cmbH0300.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3", "9" }));

		cmbH0300.setPreferredSize(new Dimension(50, 20));
		cmbH0300.setBounds(15, 60, 50, 20);
		panel_6_1.add(cmbH0300);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_10.setLayout(null);
		panel_10.setBounds(79, 25, 761, 130);
		panel_1_1.add(panel_10);

		final JxLabel urinaryContinenceLabel = new JxLabel();
		urinaryContinenceLabel.setTheme(theme);
		urinaryContinenceLabel
				.setText("<html><body><b>Urinary continence </b>- Select the one category that best describes the resident");
		urinaryContinenceLabel.setBounds(5, 10, 617, 14);
		urinaryContinenceLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_10.add(urinaryContinenceLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setText("<html><body>0. <b>Always continent</b>");
		label.setBounds(30, 35, 389, 14);
		panel_10.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1
				.setText("<html>1. <b>Occasionally incontinent </b>(less than 7 episodes of incontinence)");
		label_1.setBounds(30, 50, 402, 14);
		panel_10.add(label_1);

		final JxLabel frequentlyIncontinent7Label = new JxLabel();
		frequentlyIncontinent7Label.setTheme(theme);

		frequentlyIncontinent7Label.setFontSize(12);
		frequentlyIncontinent7Label
				.setText("<html><body>2. <b>Frequently incontinent </b>(7 or more episodes of urinary incontinence, but at least one episode of continent voiding)");
		frequentlyIncontinent7Label.setBounds(30, 65, 685, 14);
		panel_10.add(frequentlyIncontinent7Label);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2
				.setText("<html><body>3. <b>Always incontinent</b>( no episodes of continent voiding)");
		label_2.setBounds(30, 80, 402, 14);
		panel_10.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3
				.setText("<html><body>9. <b>Not rated</b>, resident had an ostomy or did not have a bowel movement for the entire 7 days");
		label_3.setBounds(30, 95, 576, 14);
		panel_10.add(label_3);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		Object obj = cmbH0300.getSelectedItem();
		if (obj != null) {
			mds3sectionH.setH0300(cmbH0300.getSelectedItem().toString());
		} else {
			mds3sectionH.setH0300("");
		}

	}

	public void doUpdate() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		cmbH0300.setSelectedItem(mds3sectionH.getH0300());
	}

}
