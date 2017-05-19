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

public class PanelH0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5920683461072310185L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbH0500;

	public PanelH0500() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 104));
		setBackground(Color.WHITE);

		final JxPanel panel_1_2 = new JxPanel();
		panel_1_2.setTheme(theme);
		panel_1_2.setBounds(0, 0, 840, 104);

		panel_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 115));
		add(panel_1_2);

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setHgap(10);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_4);
		panel_5_2.setBounds(0, 0, 840, 25);
		panel_1_2.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);

		a0100Label_2.setFontSize(12);
		a0100Label_2.setFontStyle(Font.BOLD);
		a0100Label_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_2.setText("H0500. Bowel Toileting Program");
		panel_5_2.add(a0100Label_2);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_2.setBounds(0, 24, 80, 80);
		panel_1_2.add(panel_6_2);

		final JxLabel enterCodeLabel_1_2_1_1 = new JxLabel();
		enterCodeLabel_1_2_1_1.setTheme(theme);
		enterCodeLabel_1_2_1_1.setText("Enter Code");
		enterCodeLabel_1_2_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_1_2_1_1.setBounds(10, 10, 54, 14);
		panel_6_2.add(enterCodeLabel_1_2_1_1);

		cmbH0500 = new JxComboBox();
		cmbH0500.setTheme(theme);
		cmbH0500.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbH0500.setPreferredSize(new Dimension(50, 20));
		cmbH0500.setBounds(10, 30, 50, 20);
		panel_6_2.add(cmbH0500);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_11.setLayout(null);
		panel_11.setBounds(79, 24, 761, 80);
		panel_1_2.add(panel_11);

		final JxLabel isAToiletingLabel = new JxLabel();
		isAToiletingLabel.setTheme(theme);

		isAToiletingLabel.setFontSize(12);
		isAToiletingLabel.setFontStyle(Font.BOLD);
		isAToiletingLabel
				.setText("Is a toileting program currently being used to manage the resident's bowel continence?");
		isAToiletingLabel.setBounds(10, 5, 699, 29);
		isAToiletingLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_11.add(isAToiletingLabel);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);
		label_4.setText("<html><body>0.<b> No</b>");
		label_4.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_4.setBounds(25, 35, 142, 14);
		panel_11.add(label_4);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);
		label_5.setText("<html><body>1.<b>Yes</b>");
		label_5.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		label_5.setBounds(25, 50, 54, 14);
		panel_11.add(label_5);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		Object obj = cmbH0500.getSelectedItem();
		if (obj != null) {
			mds3sectionH.setH0500(cmbH0500.getSelectedItem().toString());
		} else {
			mds3sectionH.setH0500("");
		}

	}

	public void doUpdate() {
		Mds3SectionH mds3sectionH = (Mds3SectionH) Mds3Controller.getInstance()
				.getSection(Mds3SectionH.class);
		cmbH0500.setSelectedItem(mds3sectionH.getH0500());

	}

}
