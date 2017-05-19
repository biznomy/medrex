package medrex.client.mds3.ui.subSections.sectionJ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionJ.Mds3SectionJ;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelJ1900 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8329818966177794059L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmb1900C;
	private JxComboBox cmb1900B;
	private JxComboBox cmb1900A;

	public PanelJ1900() {
		setLayout(null);
		setPreferredSize(new Dimension(840, 215));
		setBackground(Color.WHITE);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBounds(0, 0, 840, 215);
		panel_1.setPreferredSize(new Dimension(840, 215));
		panel_1.setName("");
		panel_1.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(0);
		flowLayout_2.setVgap(0);
		panel_1.setLayout(flowLayout_2);
		add(panel_1);

		final JxPanel panel_1_1_1 = new JxPanel();
		panel_1_1_1.setTheme(theme);
		panel_1_1_1.setRequestFocusEnabled(false);
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(0);
		flowLayout_4.setHgap(0);
		panel_1_1_1.setLayout(flowLayout_4);
		panel_1.add(panel_1_1_1);

		panel_1_1_1.setPreferredSize(new Dimension(840, 216));

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setPreferredSize(new Dimension(840, 30));
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_1_1_1.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1.setText("J1900. Pain presence");
		a0100Label_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setLayout(null);
		panel_6.setPreferredSize(new Dimension(840, 185));
		panel_1_1_1.add(panel_6);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);

		panel_7.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 168, 185);
		panel_6.add(panel_7);

		final JxLabel codingLabel = new JxLabel();
		codingLabel.setTheme(theme);

		codingLabel.setFontSize(12);
		codingLabel.setFontStyle(Font.BOLD);
		codingLabel.setText("Coding");
		codingLabel.setBounds(10, 24, 49, 14);
		codingLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7.add(codingLabel);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setText("<html>0. <b> None");
		label.setBounds(20, 49, 167, 14);
		label.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1.setText("<html>1. <b> One");
		label_1.setBounds(20, 70, 167, 14);
		label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7.add(label_1);

		final JxLabel label_1_1 = new JxLabel();
		label_1_1.setTheme(theme);
		label_1_1.setText("<html>2. <b>Two or More");
		label_1_1.setBounds(20, 90, 167, 14);
		label_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_7.add(label_1_1);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);

		panel_9.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(0);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_9.setLayout(flowLayout_3);
		panel_9.setBounds(168, 0, 672, 17);
		panel_6.add(panel_9);

		final JxLabel enterCodeInLabel = new JxLabel();
		enterCodeInLabel.setTheme(theme);
		enterCodeInLabel.setText("Enter Code in Boxes");
		enterCodeInLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_9.add(enterCodeInLabel);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_10.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(168, 16, 67, 169);
		panel_6.add(panel_10);

		cmb1900A = new JxComboBox();
		cmb1900A.setTheme(theme);
		cmb1900A.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2" }));

		cmb1900A.setBounds(10, 10, 47, 21);
		panel_10.add(cmb1900A);

		cmb1900B = new JxComboBox();
		cmb1900B.setTheme(theme);
		cmb1900B.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2" }));

		cmb1900B.setBounds(10, 68, 47, 21);
		panel_10.add(cmb1900B);

		cmb1900C = new JxComboBox();
		cmb1900C.setTheme(theme);
		cmb1900C.setModel(new DefaultComboBoxModel(new String[] { " ", "0",
				"1", "2" }));

		cmb1900C.setBounds(10, 124, 47, 21);
		panel_10.add(cmb1900C);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);

		panel_11.setOpaque(true);
		panel_11.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setHgap(30);
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_11.setLayout(flowLayout_8);
		panel_11.setBounds(234, 16, 606, 58);
		panel_6.add(panel_11);

		final JxLabel aInattentionLabel = new JxLabel();
		aInattentionLabel.setTheme(theme);

		aInattentionLabel.setFontSize(12);
		aInattentionLabel
				.setText("<Html><b>A. No Injury</b>- no evidence of any injury is noted on physical assessment by the nurse or primary<br>care clinian; no complaints of pain or injury by the resident; no change in the residents behavior <br>is noted  after the fall.");
		aInattentionLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_11.add(aInattentionLabel);

		final JxPanel panel_11_2 = new JxPanel();
		panel_11_2.setTheme(theme);

		panel_11_2.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setHgap(30);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_11_2.setLayout(flowLayout_10);
		panel_11_2.setBounds(234, 73, 606, 58);
		panel_6.add(panel_11_2);

		final JxLabel aInattentionLabel_1_1 = new JxLabel();
		aInattentionLabel_1_1.setTheme(theme);
		aInattentionLabel_1_1
				.setText("<html><b>B. Injury (except major) - </b> skin tears , abrassion, lacerations , superficial bruises, hematomas and <br>sprains or any fall related injury that causes the resident to complain of pain.");
		aInattentionLabel_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_11_2.add(aInattentionLabel_1_1);

		final JxPanel panel_11_3 = new JxPanel();
		panel_11_3.setTheme(theme);

		panel_11_3.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setHgap(30);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		panel_11_3.setLayout(flowLayout_11);
		panel_11_3.setBounds(234, 130, 606, 55);
		panel_6.add(panel_11_3);

		final JxLabel aInattentionLabel_1_2 = new JxLabel();
		aInattentionLabel_1_2.setTheme(theme);
		aInattentionLabel_1_2
				.setText("<html><b>C. Major injury -</b> bone fractures, joint dislocations, closed head injuries with altered <br>conciousness , subdural hematoma ");
		aInattentionLabel_1_2.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		panel_11_3.add(aInattentionLabel_1_2);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmb1900A.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ1900A(cmb1900A.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ1900A("");
		}

		Object obj1 = cmb1900B.getSelectedItem();
		if (obj1 != null) {
			mds3sectionJ.setJ1900B(cmb1900B.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ1900B("");
		}

		Object obj2 = cmb1900C.getSelectedItem();
		if (obj2 != null) {
			mds3sectionJ.setJ1900C(cmb1900C.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ1900C("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmb1900A.setSelectedItem(mds3sectionJ.getJ1900A());
		cmb1900B.setSelectedItem(mds3sectionJ.getJ1900B());
		cmb1900C.setSelectedItem(mds3sectionJ.getJ1900C());
	}

}
