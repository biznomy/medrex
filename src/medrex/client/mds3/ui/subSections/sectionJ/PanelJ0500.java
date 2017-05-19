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

public class PanelJ0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -541130109237204139L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbJ0500B;
	private JxComboBox cmbJ0500A;

	public PanelJ0500() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 205));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 205);
		add(panel);

		final JxPanel panel_1_1_2_1 = new JxPanel();
		panel_1_1_2_1.setTheme(theme);
		panel_1_1_2_1.setBounds(5, 0, 830, 205);

		panel_1_1_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setPreferredSize(new Dimension(820, 210));
		panel.add(panel_1_1_2_1);

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);
		panel_6_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(0, 24, Mds3Constants.SUBSECTION_WIDTH_LEFT_1,
				181);
		panel_1_1_2_1.add(panel_6_1_1_1);

		final JxLabel enterCodeLabel_1_2 = new JxLabel();
		enterCodeLabel_1_2.setTheme(theme);
		enterCodeLabel_1_2.setText("Enter Code");
		enterCodeLabel_1_2.setBounds(15, 19, 54, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_2);

		cmbJ0500A = new JxComboBox();
		cmbJ0500A.setTheme(theme);
		cmbJ0500A.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));

		cmbJ0500A.setPreferredSize(new Dimension(50, 20));
		cmbJ0500A.setBounds(15, 40, 50, 22);
		panel_6_1_1_1.add(cmbJ0500A);

		final JxLabel enterCodeLabel_1_1_1 = new JxLabel();
		enterCodeLabel_1_1_1.setTheme(theme);
		enterCodeLabel_1_1_1.setText("Enter Code");
		enterCodeLabel_1_1_1.setBounds(15, 110, 54, 14);
		panel_6_1_1_1.add(enterCodeLabel_1_1_1);

		cmbJ0500B = new JxComboBox();
		cmbJ0500B.setTheme(theme);
		cmbJ0500B.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "9" }));

		cmbJ0500B.setPreferredSize(new Dimension(50, 20));
		cmbJ0500B.setBounds(15, 130, 50, 22);
		panel_6_1_1_1.add(cmbJ0500B);

		final JxPanel panel_7_1_1_2 = new JxPanel();
		panel_7_1_1_2.setTheme(theme);
		panel_7_1_1_2.setOpaque(false);
		panel_7_1_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_2.setLayout(null);
		panel_7_1_1_2.setBounds(79, 24, 751, 90);
		panel_1_1_2_1.add(panel_7_1_1_2);

		final JxLabel aNationalProviderLabel_3_1_1_2 = new JxLabel();
		aNationalProviderLabel_3_1_1_2.setTheme(theme);

		aNationalProviderLabel_3_1_1_2.setFontSize(12);
		aNationalProviderLabel_3_1_1_2
				.setText("<html><body><b> A. &nbsp</b> Ask Resident:<i>\" Over The past 5 days,<b> has pain made it hard for you to sleep at night?\"");
		aNationalProviderLabel_3_1_1_2.setBounds(10, 5, 706, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_3_1_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_2.setText("<html><body>0. <b> No ");
		aNationalProviderLabel_1_3_1_2_1_2.setBounds(30, 25, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_2_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_3_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_3_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_3_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_3_1_2.setText("<html><body>1. <b> Yes");
		aNationalProviderLabel_1_3_1_3_1_2.setBounds(30, 45, 311, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_3_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_4_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_4_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_4_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_4_1_1
				.setText("<html><body>9. <b> Unable to answer");
		aNationalProviderLabel_1_3_1_4_1_1.setBounds(30, 65, 706, 14);
		panel_7_1_1_2.add(aNationalProviderLabel_1_3_1_4_1_1);

		final JxPanel panel_5_1_1_2_1 = new JxPanel();
		panel_5_1_1_2_1.setTheme(theme);
		panel_5_1_1_2_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_2_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setHgap(10);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_1.setLayout(flowLayout_10);
		panel_5_1_1_2_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_1.setBounds(0, 0, 830, 25);
		panel_1_1_2_1.add(panel_5_1_1_2_1);

		final JxLabel a0100Label_1_1_2_1 = new JxLabel();
		a0100Label_1_1_2_1.setTheme(theme);

		a0100Label_1_1_2_1.setFontSize(12);
		a0100Label_1_1_2_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_2_1.setText("J0500 Pain Effect on function");
		panel_5_1_1_2_1.add(a0100Label_1_1_2_1);

		final JxPanel panel_7_1_1_1_2 = new JxPanel();
		panel_7_1_1_1_2.setTheme(theme);
		panel_7_1_1_1_2.setOpaque(false);
		panel_7_1_1_1_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_1_1_2.setLayout(null);
		panel_7_1_1_1_2.setBounds(79, 113, 751, 92);
		panel_1_1_2_1.add(panel_7_1_1_1_2);

		final JxLabel aNationalProviderLabel_3_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_3_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_3_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_3_1_1_1_2
				.setText("<html><b>B. </b>&nbsp Ask resident: <i>\" Over The past 5 days, <b> have you limited your day-to-day activities because of pain</b> ? \"");
		aNationalProviderLabel_3_1_1_1_2.setBounds(10, 5, 706, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_3_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_5_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_5_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_1_2.setText("<html><body>0. <b>No ");
		aNationalProviderLabel_1_3_1_5_1_2.setBounds(30, 25, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_5_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_1_2.setText("<html><body>1. <b>Yes");
		aNationalProviderLabel_1_3_1_1_1_1_2.setBounds(30, 45, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_1_1_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_2_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2_1_1_2.setTheme(theme);

		aNationalProviderLabel_1_3_1_2_1_1_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_2_1_1_2
				.setText("<html><body>9. <b> Unable to answer");
		aNationalProviderLabel_1_3_1_2_1_1_2.setBounds(30, 65, 311, 14);
		panel_7_1_1_1_2.add(aNationalProviderLabel_1_3_1_2_1_1_2);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);

		Object obj = cmbJ0500A.getSelectedItem();
		if (obj != null) {
			mds3sectionJ.setJ0500A(cmbJ0500A.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0500A("");
		}

		Object obj1 = cmbJ0500A.getSelectedItem();
		if (obj1 != null) {
			mds3sectionJ.setJ0500B(cmbJ0500B.getSelectedItem().toString());
		} else {
			mds3sectionJ.setJ0500B("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cmbJ0500A.setSelectedItem(mds3sectionJ.getJ0500A());
		cmbJ0500B.setSelectedItem(mds3sectionJ.getJ0500B());

	}

}
