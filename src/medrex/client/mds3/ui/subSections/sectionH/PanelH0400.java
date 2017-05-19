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

public class PanelH0400 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4894648543239426266L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbH0400;

	public PanelH0400() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 155));
		setBackground(Color.WHITE);

		final JxPanel panel_1_1_2 = new JxPanel();
		panel_1_1_2.setTheme(theme);
		panel_1_1_2.setBounds(0, 0, 840, 155);

		panel_1_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setPreferredSize(new Dimension(840, 180));
		add(panel_1_1_2);

		final JxPanel panel_5_1_2 = new JxPanel();
		panel_5_1_2.setTheme(theme);
		panel_5_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setHgap(10);
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_5_1_2.setLayout(flowLayout_8);
		panel_5_1_2.setBounds(0, 0, 840, 25);
		panel_1_1_2.add(panel_5_1_2);

		final JxLabel a0100Label_1_2 = new JxLabel();
		a0100Label_1_2.setTheme(theme);

		a0100Label_1_2.setFontSize(12);
		a0100Label_1_2.setFontStyle(Font.BOLD);
		a0100Label_1_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_2.setText("H0400. Bowel  Continence");
		panel_5_1_2.add(a0100Label_1_2);

		final JxPanel panel_6_1_2 = new JxPanel();
		panel_6_1_2.setTheme(theme);
		panel_6_1_2.setLayout(null);
		panel_6_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_2.setBounds(0, 25, 80, 130);
		panel_1_1_2.add(panel_6_1_2);

		final JxLabel enterCodeLabel_1_2_1 = new JxLabel();
		enterCodeLabel_1_2_1.setTheme(theme);

		enterCodeLabel_1_2_1.setBounds(15, 15, 54, 14);
		enterCodeLabel_1_2_1.setText("Enter Code");
		panel_6_1_2.add(enterCodeLabel_1_2_1);

		cmbH0400 = new JxComboBox();
		cmbH0400.setTheme(theme);
		cmbH0400.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3", "9" }));

		cmbH0400.setPreferredSize(new Dimension(50, 20));
		cmbH0400.setBounds(15, 40, 50, 20);
		panel_6_1_2.add(cmbH0400);

		final JxPanel panel_10_1 = new JxPanel();
		panel_10_1.setTheme(theme);
		panel_10_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_10_1.setLayout(null);
		panel_10_1.setBounds(79, 25, 761, 130);
		panel_1_1_2.add(panel_10_1);

		final JxLabel urinaryContinenceLabel_1 = new JxLabel();
		urinaryContinenceLabel_1.setTheme(theme);

		urinaryContinenceLabel_1.setFontSize(12);
		urinaryContinenceLabel_1
				.setText("<html><body><b>Bowel continence - </b> Select the one category that best describes the resident");
		urinaryContinenceLabel_1.setBounds(5, 10, 617, 14);
		panel_10_1.add(urinaryContinenceLabel_1);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6.setText("<html><body>0. <b>Always continent</b>");
		label_6.setBounds(30, 30, 389, 14);
		panel_10_1.add(label_6);

		final JxLabel occasionallyIncontinentLabel = new JxLabel();
		occasionallyIncontinentLabel.setTheme(theme);

		occasionallyIncontinentLabel.setFontSize(12);
		occasionallyIncontinentLabel
				.setText("<html>1.  <b> Occasionally incontinent </b>(one episode of bowel incontinence)");
		occasionallyIncontinentLabel.setBounds(30, 45, 402, 14);
		panel_10_1.add(occasionallyIncontinentLabel);

		final JxLabel frequentlyIncontinent7Label_1 = new JxLabel();
		frequentlyIncontinent7Label_1.setTheme(theme);

		frequentlyIncontinent7Label_1.setFontSize(12);
		frequentlyIncontinent7Label_1
				.setText("<html><body>2. <b>Frequently incontinent </b>(2 or more episodes of bowel incontinence, but at least one continent bowel movement)");
		frequentlyIncontinent7Label_1.setBounds(30, 60, 694, 14);
		panel_10_1.add(frequentlyIncontinent7Label_1);

		final JxLabel label_2_1 = new JxLabel();
		label_2_1.setTheme(theme);

		label_2_1.setFontSize(12);
		label_2_1
				.setText("<html><body>3. <b>Always incontinent</b>(no episodes of continent bowel movements)");
		label_2_1.setBounds(30, 75, 402, 14);
		panel_10_1.add(label_2_1);

		final JxLabel label_3_1 = new JxLabel();
		label_3_1.setTheme(theme);

		label_3_1.setFontSize(12);
		label_3_1
				.setText("<html><body>9. <b>Not rated</b>, resident had an ostomy or did not have a bowel movement for the entire 7 days");
		label_3_1.setBounds(30, 90, 576, 14);
		panel_10_1.add(label_3_1);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		Object obj = cmbH0400.getSelectedItem();
		if (obj != null) {
			mds3sectionH.setH0400(cmbH0400.getSelectedItem().toString());
		} else {
			mds3sectionH.setH0400("");
		}
	}

	public void doUpdate() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		cmbH0400.setSelectedItem(mds3sectionH.getH0400());
	}

}
