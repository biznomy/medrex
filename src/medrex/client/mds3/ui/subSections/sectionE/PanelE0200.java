package medrex.client.mds3.ui.subSections.sectionE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionE.Mds3SectionE;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelE0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8461551586807634510L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbE0200C;
	private JxComboBox cmbE0200B;
	private JxComboBox cmbE0200A;

	public PanelE0200() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 245));
		setBackground(Color.WHITE);

		final JxPanel panel_1_2_1 = new JxPanel();
		panel_1_2_1.setTheme(theme);
		panel_1_2_1.setBounds(0, 0, 840, 245);
		add(panel_1_2_1);

		panel_1_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setPreferredSize(new Dimension(840, 245));

		final JxPanel panel_5_2_1 = new JxPanel();
		panel_5_2_1.setTheme(theme);
		panel_5_2_1.setLayout(null);
		panel_5_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_2_1.setBounds(0, 0, 840, 25);
		panel_1_2_1.add(panel_5_2_1);

		final JxLabel a0100Label_2_1 = new JxLabel();
		a0100Label_2_1.setTheme(theme);
		a0100Label_2_1.setBounds(11, 6, 124, 15);

		a0100Label_2_1.setFontSize(12);
		a0100Label_2_1.setFontStyle(Font.BOLD);
		a0100Label_2_1.setToolTipText("");
		a0100Label_2_1.setText("Behavioral Symptoms");
		panel_5_2_1.add(a0100Label_2_1);

		final JxPanel panel_7_2_1 = new JxPanel();
		panel_7_2_1.setTheme(theme);

		panel_7_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBounds(0, 70, 301, 176);
		panel_1_2_1.add(panel_7_2_1);

		final JxPanel panel_6_3 = new JxPanel();
		panel_6_3.setTheme(theme);
		panel_6_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_6_3.setLayout(null);
		panel_6_3.setBounds(0, 0, 301, 175);
		panel_7_2_1.add(panel_6_3);

		final JxLabel aNationalProviderLabel_3_2 = new JxLabel();
		aNationalProviderLabel_3_2.setTheme(theme);

		aNationalProviderLabel_3_2.setFontSize(12);
		aNationalProviderLabel_3_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_2.setText("Coding");
		aNationalProviderLabel_3_2.setBounds(5, 10, 129, 14);
		panel_6_3.add(aNationalProviderLabel_3_2);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);

		label.setFontSize(12);
		label.setText("<html><body>0.<b> Behavior not exhiited ");
		label.setBounds(27, 30, 147, 14);
		panel_6_3.add(label);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);

		label_1.setFontSize(12);
		label_1
				.setText("<html><body>2.<b> Behavior of this type occurred 4 to 6 days,</b><br> but less than daily");
		label_1.setBounds(27, 50, 264, 28);
		panel_6_3.add(label_1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);

		label_2.setFontSize(12);
		label_2
				.setText("<html><body>3. <b>Behavior of this type occurred daily");
		label_2.setBounds(27, 84, 247, 14);
		panel_6_3.add(label_2);

		final JxLabel notePresenceOfLabel = new JxLabel();
		notePresenceOfLabel.setTheme(theme);

		notePresenceOfLabel.setFontSize(12);
		notePresenceOfLabel.setFontStyle(Font.BOLD);
		notePresenceOfLabel
				.setText("Note presence of symptoms and their frequency");
		notePresenceOfLabel.setBounds(10, 50, 343, 14);
		panel_1_2_1.add(notePresenceOfLabel);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);
		panel_9.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_9.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 23, 840, 27);
		panel_1_2_1.add(panel_9);

		final JxLabel checkAllThatLabel_1 = new JxLabel();
		checkAllThatLabel_1.setTheme(theme);

		checkAllThatLabel_1.setFontSize(12);
		checkAllThatLabel_1.setFontStyle(Font.BOLD);
		checkAllThatLabel_1.setBounds(10, 7, 363, 14);
		panel_9.add(checkAllThatLabel_1);
		checkAllThatLabel_1
				.setText("E0200. Behavioral Symptom - Presence & Frequency");

		final JxPanel panel_7_2_1_1 = new JxPanel();
		panel_7_2_1_1.setTheme(theme);

		panel_7_2_1_1.setLayout(null);
		panel_7_2_1_1.setBounds(300, 70, 540, 177);
		panel_1_2_1.add(panel_7_2_1_1);

		final JxPanel panel_6_3_1 = new JxPanel();
		panel_6_3_1.setTheme(theme);

		panel_6_3_1.setLayout(null);
		panel_6_3_1.setBounds(0, -1, 540, 176);
		panel_7_2_1_1.add(panel_6_3_1);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);

		panel_10.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(0, 1, 540, 23);
		panel_6_3_1.add(panel_10);

		final JxLabel enterCodesInLabel = new JxLabel();
		enterCodesInLabel.setTheme(theme);
		enterCodesInLabel.setText("Enter Codes in Boxes");
		enterCodesInLabel.setBounds(81, 4, 140, 14);
		panel_10.add(enterCodesInLabel);

		final JxPanel panel_6_1_2 = new JxPanel();
		panel_6_1_2.setTheme(theme);
		panel_6_1_2.setLayout(null);
		panel_6_1_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_2.setBounds(0, 23, 80, 153);
		panel_6_3_1.add(panel_6_1_2);

		cmbE0200A = new JxComboBox();
		cmbE0200A.setTheme(theme);
		cmbE0200A.setBounds(17, 23, 50, 20);
		cmbE0200A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbE0200A.setPreferredSize(new Dimension(50, 20));
		panel_6_1_2.add(cmbE0200A);

		cmbE0200B = new JxComboBox();
		cmbE0200B.setTheme(theme);
		cmbE0200B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbE0200B.setBounds(17, 61, 50, 21);
		panel_6_1_2.add(cmbE0200B);

		cmbE0200C = new JxComboBox();
		cmbE0200C.setTheme(theme);
		cmbE0200C.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3" }));

		cmbE0200C.setBounds(17, 111, 50, 21);
		panel_6_1_2.add(cmbE0200C);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));

		panel_11.setLayout(null);
		panel_11.setBounds(79, 23, 461, 53);
		panel_6_3_1.add(panel_11);

		final JxLabel aPhysicalBehavioralLabel = new JxLabel();
		aPhysicalBehavioralLabel.setTheme(theme);

		aPhysicalBehavioralLabel.setFontSize(12);
		aPhysicalBehavioralLabel
				.setText("<html><body><b>A. Physical behavioral symptoms directed toward others.(eg..hitting, </b> kicking,pushing,scratching,grabbing,abusing others sexually)");
		aPhysicalBehavioralLabel.setBounds(10, 0, 426, 53);
		panel_11.add(aPhysicalBehavioralLabel);

		final JxPanel panel_11_1 = new JxPanel();
		panel_11_1.setTheme(theme);
		panel_11_1.setBorder(new LineBorder(Color.black, 1, false));

		panel_11_1.setLayout(null);
		panel_11_1.setBounds(79, 75, 461, 37);
		panel_6_3_1.add(panel_11_1);

		final JxLabel bVerbalLabel = new JxLabel();
		bVerbalLabel.setTheme(theme);

		bVerbalLabel.setFontSize(12);
		bVerbalLabel
				.setText("<html><body><b> B. Verbal behavioural symptoms directed toward others </b> (eg. threatening<br> others, screaming at others, cursing at others)");
		bVerbalLabel.setBounds(10, 0, 415, 36);
		panel_11_1.add(bVerbalLabel);

		final JxPanel panel_11_1_1 = new JxPanel();
		panel_11_1_1.setTheme(theme);
		panel_11_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_11_1_1.setLayout(null);
		panel_11_1_1.setBounds(79, 111, 461, 65);
		panel_6_3_1.add(panel_11_1_1);

		final JxLabel cOtherLabel = new JxLabel();
		cOtherLabel.setTheme(theme);

		cOtherLabel.setFontSize(12);
		cOtherLabel
				.setText("<html><body><b> C. Other behavioral symptoms not directed toward others </b> (e.g... physical <br> symptoms such as hitting or scratching self, pacing,rummaging,public <br>sexual acts,disrobing in public,throwing or smearing food or bodily wastes,<br> or verbal/vocal symptoms like screaming, disruptive sounds)");
		cOtherLabel.setBounds(10, 2, 447, 61);
		panel_11_1_1.add(cOtherLabel);
		doUpdate();
	}

	public void doSave() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		Object obj1 = cmbE0200A.getSelectedItem();
		Object obj2 = cmbE0200B.getSelectedItem();
		Object obj3 = cmbE0200C.getSelectedItem();
		if (obj3 != null) {
			mds3sectionE.setE0200C((String) cmbE0200C.getSelectedItem());
		} else {
			mds3sectionE.setE0200C("");
		}
		if (obj2 != null) {
			mds3sectionE.setE0200B((String) cmbE0200B.getSelectedItem());
		} else {
			mds3sectionE.setE0200B("");
		}
		if (obj1 != null) {
			mds3sectionE.setE0200A((String) cmbE0200A.getSelectedItem());
		} else {
			mds3sectionE.setE0200A("");
		}

	}

	public void doUpdate() {
		Mds3SectionE mds3sectionE = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		cmbE0200C.setSelectedItem(mds3sectionE.getE0200C());
		cmbE0200B.setSelectedItem(mds3sectionE.getE0200B());
		cmbE0200A.setSelectedItem(mds3sectionE.getE0200A());
	}
}
