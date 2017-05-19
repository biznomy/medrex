package medrex.client.mds3.ui.subSections.sectionK;

import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionK.Mds3SectionK;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelK0700 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1625174874574684129L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbK0700B;
	private JxComboBox cmbK0700A;

	public PanelK0700() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 170));
		setLayout(null);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);

		panel_17.setLayout(null);
		panel_17.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 170);
		add(panel_17);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		panel_18.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_18.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_18.setLayout(null);
		panel_18.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 30);
		panel_17.add(panel_18);

		final JxPanel panel_51 = new JxPanel();
		panel_51.setTheme(theme);

		panel_51.setLayout(null);
		panel_51.setBounds(0, 30, Mds3Constants.PAGE_WIDTH, 80);
		panel_17.add(panel_51);

		final JxLabel k0700PercentIntakeLabel = new JxLabel();
		k0700PercentIntakeLabel.setTheme(theme);

		k0700PercentIntakeLabel.setFontSize(12);
		k0700PercentIntakeLabel
				.setText("<html><body><b>K0700. Percent intake by artificial Route </b> - Complete K0700 only if K0500A or K0500B is checked");
		k0700PercentIntakeLabel.setBounds(10, 10, 607, 14);
		panel_18.add(k0700PercentIntakeLabel);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_19.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_19.setLayout(null);
		panel_19.setBounds(0, 0, 80, 80);
		panel_51.add(panel_19);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);

		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 15, 54, 14);
		panel_19.add(enterCodeLabel_1);

		cmbK0700A = new JxComboBox();
		cmbK0700A.setTheme(theme);

		cmbK0700A.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3" }));
		cmbK0700A.setBounds(15, 35, 50, 22);
		panel_19.add(cmbK0700A);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);
		panel_20.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_20.setLayout(null);
		panel_20.setBounds(79, 0, 761, 80);
		panel_51.add(panel_20);

		final JxLabel aProportionLabel = new JxLabel();
		aProportionLabel.setTheme(theme);

		aProportionLabel.setFontSize(12);
		aProportionLabel
				.setText("<html><body><b> A. Proportion of total calories the resident received through parenteral or tube feeding </b>");
		aProportionLabel.setBounds(10, 10, 648, 14);
		panel_20.add(aProportionLabel);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);

		label_3.setFontSize(12);
		label_3.setText("<html><body>1. <b> 25% or less </b>");
		label_3.setBounds(41, 30, 214, 14);
		panel_20.add(label_3);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);

		label_4.setFontSize(12);
		label_4.setText("<html><body>2. <b> 26-50% </b>");
		label_4.setBounds(41, 45, 228, 14);
		panel_20.add(label_4);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);

		label_5.setFontSize(12);
		label_5.setText("<html><body>3.<b>  51% or more</b>");
		label_5.setBounds(41, 60, 241, 14);
		panel_20.add(label_5);

		final JxPanel panel_52 = new JxPanel();
		panel_52.setTheme(theme);
		panel_52.setBounds(0, 110, Mds3Constants.PAGE_WIDTH, 61);
		panel_17.add(panel_52);

		panel_52.setLayout(null);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);
		panel_21.setBounds(79, 0, 761, 60);
		panel_52.add(panel_21);
		panel_21.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_21.setLayout(null);

		final JxLabel bAverageLabel = new JxLabel();
		bAverageLabel.setTheme(theme);

		bAverageLabel.setFontSize(12);
		bAverageLabel
				.setText("<html><body><b> B. Average fluid intake per day by IV or tube feeding");
		bAverageLabel.setBounds(10, 10, 399, 14);
		panel_21.add(bAverageLabel);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);

		label_6.setFontSize(12);
		label_6.setText("<html><body>1.<b> 500 cc/day or less </b>");
		label_6.setBounds(41, 30, 255, 14);
		panel_21.add(label_6);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);

		label_7.setFontSize(12);
		label_7.setText("<html><body>2. <b> 501 cc/day or more");
		label_7.setBounds(41, 45, 206, 14);
		panel_21.add(label_7);

		final JxPanel panel_53 = new JxPanel();
		panel_53.setTheme(theme);
		panel_53.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_53.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_53.setLayout(null);
		panel_53.setBounds(0, 0, 80, 60);
		panel_52.add(panel_53);

		final JxLabel enterCodeLabel_3 = new JxLabel();
		enterCodeLabel_3.setTheme(theme);
		enterCodeLabel_3.setText("Enter Code");
		enterCodeLabel_3.setBounds(10, 15, 54, 14);
		panel_53.add(enterCodeLabel_3);

		cmbK0700B = new JxComboBox();
		cmbK0700B.setTheme(theme);
		cmbK0700B.setModel(new DefaultComboBoxModel(
				new String[] { "", "1", "2" }));

		cmbK0700B.setBounds(15, 30, 50, 22);
		panel_53.add(cmbK0700B);
		doUpdate();

	}

	@Override
	public void doSave() {
		Mds3SectionK mds3sectionK = (Mds3SectionK) Mds3Controller.getInstance()
				.getSection(Mds3SectionK.class);

		Object obj = cmbK0700A.getSelectedItem();
		if (obj != null) {
			mds3sectionK.setK0700A(cmbK0700A.getSelectedItem().toString());
		} else {
			mds3sectionK.setK0700A("");
		}

		Object obj1 = cmbK0700B.getSelectedItem();
		if (obj1 != null) {
			mds3sectionK.setK0700B(cmbK0700B.getSelectedItem().toString());
		} else {
			mds3sectionK.setK0700B("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionK mds3sectionK = (Mds3SectionK) Mds3Controller.getInstance()
				.getSection(Mds3SectionK.class);
		cmbK0700A.setSelectedItem(mds3sectionK.getK0700A());
		cmbK0700B.setSelectedItem(mds3sectionK.getK0700B());
	}

}
