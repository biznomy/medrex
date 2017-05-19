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
import medrex.commons.vo.mds3.SectionJ.Mds3SectionJ;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelJ0600 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8207031440063394477L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbJ0600B;
	private JxComboBox cmbJ0600A;

	public PanelJ0600() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 265));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 260);
		add(panel);

		final JxPanel panel_1_1_2_1_1 = new JxPanel();
		panel_1_1_2_1_1.setTheme(theme);
		panel_1_1_2_1_1.setBounds(5, 0, 830, 255);

		panel.add(panel_1_1_2_1_1);
		panel_1_1_2_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1_2_1_1.setLayout(null);
		panel_1_1_2_1_1.setPreferredSize(new Dimension(820, 260));

		final JxPanel panel_6_1_1_1_1 = new JxPanel();
		panel_6_1_1_1_1.setTheme(theme);
		panel_6_1_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1_1_1.setLayout(null);
		panel_6_1_1_1_1.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1,
				232);
		panel_1_1_2_1_1.add(panel_6_1_1_1_1);

		final JxLabel enterCodeLabel_1_2_1 = new JxLabel();
		enterCodeLabel_1_2_1.setTheme(theme);
		enterCodeLabel_1_2_1.setText("Enter Code");
		enterCodeLabel_1_2_1.setBounds(15, 15, 54, 14);
		panel_6_1_1_1_1.add(enterCodeLabel_1_2_1);

		cmbJ0600A = new JxComboBox();
		cmbJ0600A.setTheme(theme);
		cmbJ0600A.setModel(new DefaultComboBoxModel(new String[] { "", "00",
				"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
				"99" }));

		cmbJ0600A.setPreferredSize(new Dimension(50, 20));
		cmbJ0600A.setBounds(15, 31, 50, 22);
		panel_6_1_1_1_1.add(cmbJ0600A);

		final JxLabel enterCodeLabel_1_1_1_1 = new JxLabel();
		enterCodeLabel_1_1_1_1.setTheme(theme);
		enterCodeLabel_1_1_1_1.setText("Enter Code");
		enterCodeLabel_1_1_1_1.setBounds(15, 133, 54, 14);
		panel_6_1_1_1_1.add(enterCodeLabel_1_1_1_1);

		cmbJ0600B = new JxComboBox();
		cmbJ0600B.setTheme(theme);
		cmbJ0600B.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "9" }));

		cmbJ0600B.setPreferredSize(new Dimension(50, 20));
		cmbJ0600B.setBounds(15, 150, 50, 22);
		panel_6_1_1_1_1.add(cmbJ0600B);

		final JxPanel panel_7_1_1_2_1 = new JxPanel();
		panel_7_1_1_2_1.setTheme(theme);

		panel_7_1_1_2_1.setOpaque(true);
		panel_7_1_1_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_2_1.setLayout(null);
		panel_7_1_1_2_1.setBounds(79, 24, 751, 93);
		panel_1_1_2_1_1.add(panel_7_1_1_2_1);

		final JxLabel aNationalProviderLabel_3_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_2_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_2_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_2_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_2_1
				.setText("A.  Numerical Rating Scale(00-10)");
		aNationalProviderLabel_3_1_1_2_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_2_1.add(aNationalProviderLabel_3_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_2_1
				.setText("<html> Ask Resident :\"Plaese rate your worst pain over the last 5 days on a zero to 10 scale with zero being no pain and ten being <br>as the worst pain you can imagine\"(show resident 00-10 pain scale)");
		aNationalProviderLabel_1_3_1_2_1_2_1.setBounds(26, 25, 686, 34);
		panel_7_1_1_2_1.add(aNationalProviderLabel_1_3_1_2_1_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_4_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_4_1_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_4_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_4_1_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_3_1_4_1_1_1
				.setText("Enter Two-digit response. Enter 99 if unable to answer.");
		aNationalProviderLabel_1_3_1_4_1_1_1.setBounds(27, 65, 706, 14);
		panel_7_1_1_2_1.add(aNationalProviderLabel_1_3_1_4_1_1_1);

		final JxPanel panel_5_1_1_2_1_1 = new JxPanel();
		panel_5_1_1_2_1_1.setTheme(theme);
		panel_5_1_1_2_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_1_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		final FlowLayout flowLayout_13 = new FlowLayout();
		flowLayout_13.setHgap(10);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1_1.setLayout(flowLayout_13);
		panel_5_1_1_2_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1_1.setBounds(0, 0, 830, 25);
		panel_1_1_2_1_1.add(panel_5_1_1_2_1_1);

		final JxLabel a0100Label_1_1_2_1_1 = new JxLabel();
		a0100Label_1_1_2_1_1.setTheme(theme);

		a0100Label_1_1_2_1_1.setFontSize(12);
		a0100Label_1_1_2_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1_1
				.setText("J0600. Pain Intensity - Administer ONLY ONE of the follwing pain Intensity questions (A or B)");
		panel_5_1_1_2_1_1.add(a0100Label_1_1_2_1_1);

		final JxPanel panel_7_1_1_1_2_1 = new JxPanel();
		panel_7_1_1_1_2_1.setTheme(theme);

		panel_7_1_1_1_2_1.setBorder(new LineBorder(
				Mds3Constants.BORDER_DARKGRAY, Mds3Constants.BORDER_SIZE_1,
				false));
		panel_7_1_1_1_2_1.setLayout(null);
		panel_7_1_1_1_2_1.setBounds(79, 116, 751, 140);
		panel_1_1_2_1_1.add(panel_7_1_1_1_2_1);

		final JxLabel aNationalProviderLabel_3_1_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_1_2_1.setTheme(theme);

		aNationalProviderLabel_3_1_1_1_2_1.setFontSize(12);
		aNationalProviderLabel_3_1_1_1_2_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_3_1_1_1_2_1
				.setText("B.   Verbal Descriptor Scale");
		aNationalProviderLabel_3_1_1_1_2_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_3_1_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_5_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_1_2_1
				.setText("<html><body> Ask resident : <i> \"Please rate the intensity of your worst pain over the last 5 days\" </i> (show resident verbal scale.)");
		aNationalProviderLabel_1_3_1_5_1_2_1.setBounds(30, 25, 630, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_5_1_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_1_2_1.setText("<html>1. &nbsp<b>Mild");
		aNationalProviderLabel_1_3_1_1_1_1_2_1.setBounds(30, 45, 311, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_1_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_1_2_1
				.setText("<html>2. &nbsp<b>Moderate");
		aNationalProviderLabel_1_3_1_2_1_1_2_1.setBounds(30, 65, 311, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_2_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_1_2_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_1_2_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_1_2_1_1
				.setText("<html>3. &nbsp<b>Severe");
		aNationalProviderLabel_1_3_1_2_1_1_2_1_1.setBounds(30, 83, 311, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_2_1_1_2_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_1_2_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_1_2_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_1_2_1_2
				.setText("<html>4. &nbsp<b>Very Savere Horrible");
		aNationalProviderLabel_1_3_1_2_1_1_2_1_2.setBounds(30, 103, 311, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_2_1_1_2_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_1_2_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2_1_2_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_1_2_1_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_1_2_1_2_1
				.setText("<html>9. &nbsp<b>Unable to answer");
		aNationalProviderLabel_1_3_1_2_1_1_2_1_2_1.setBounds(30, 123, 311, 14);
		panel_7_1_1_1_2_1.add(aNationalProviderLabel_1_3_1_2_1_1_2_1_2_1);
		doUpdate();

	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmbJ0600A.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ0600A(cmbJ0600A.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0600A("");
		}

		Object obj1 = cmbJ0600B.getSelectedItem();
		if (obj1 != null) {
			mds3sectionJ.setJ0600B(cmbJ0600B.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0600B("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmbJ0600A.setSelectedItem(mds3sectionJ.getJ0600A());
		cmbJ0600B.setSelectedItem(mds3sectionJ.getJ0600B());

	}

}
