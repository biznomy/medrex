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

public class PanelD0650 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6253361081752885952L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbD0650;

	public PanelD0650() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 70));
		setLayout(null);

		final JxPanel panel_8_1 = new JxPanel();
		panel_8_1.setTheme(theme);
		panel_8_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_8_1.setLayout(null);
		panel_8_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 70);
		add(panel_8_1);

		final JxPanel panel_5_2 = new JxPanel();
		panel_5_2.setTheme(theme);
		panel_5_2.setLayout(null);
		panel_5_2.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_2.setBounds(0, 0, 840, 25);
		panel_8_1.add(panel_5_2);

		final JxLabel a0100Label_2 = new JxLabel();
		a0100Label_2.setTheme(theme);

		a0100Label_2.setFontSize(12);
		a0100Label_2.setFontStyle(Font.BOLD);
		a0100Label_2.setBounds(11, 6, 655, 14);
		a0100Label_2
				.setText("<html><body> <b> D0650. Safety Notification - </b> Complete only if D050011 = 1 indicating possibility of resident self harm");
		panel_5_2.add(a0100Label_2);

		final JxPanel panel_6_3 = new JxPanel();
		panel_6_3.setTheme(theme);
		panel_6_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_3.setLayout(null);
		panel_6_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_3.setBounds(0, 24, 80, 45);
		panel_8_1.add(panel_6_3);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setText("Enter Code");
		enterCodeLabel_1.setBounds(10, 5, 62, 14);
		panel_6_3.add(enterCodeLabel_1);

		cmbD0650 = new JxComboBox();
		cmbD0650.setTheme(theme);

		cmbD0650.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));
		cmbD0650.setPreferredSize(new Dimension(50, 20));
		cmbD0650.setBounds(9, 20, 50, 22);
		panel_6_3.add(cmbD0650);

		final JxPanel panel_7_2 = new JxPanel();
		panel_7_2.setTheme(theme);
		panel_7_2.setBorder(new LineBorder(Color.black, 1, false));

		panel_7_2.setLayout(null);
		panel_7_2.setBounds(79, 24, 761, 45);
		panel_8_1.add(panel_7_2);

		final JxLabel aNationalProviderLabel_2 = new JxLabel();
		aNationalProviderLabel_2.setTheme(theme);

		aNationalProviderLabel_2.setFontSize(12);
		aNationalProviderLabel_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_2
				.setText("Was responsible staff or provider informed that there is a potential for resident staff harm ?");
		aNationalProviderLabel_2.setBounds(10, 0, 719, 14);
		panel_7_2.add(aNationalProviderLabel_2);

		final JxLabel aNationalProviderLabel_1_1 = new JxLabel();
		aNationalProviderLabel_1_1.setTheme(theme);

		aNationalProviderLabel_1_1.setFontSize(12);
		aNationalProviderLabel_1_1.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_1.setText("1. Yes");
		aNationalProviderLabel_1_1.setBounds(25, 30, 44, 14);
		panel_7_2.add(aNationalProviderLabel_1_1);

		final JxLabel phq9ovLabel_1 = new JxLabel();
		phq9ovLabel_1.setTheme(theme);

		phq9ovLabel_1.setFontSize(12);
		phq9ovLabel_1.setFontStyle(Font.BOLD);
		phq9ovLabel_1.setText("0. No");
		phq9ovLabel_1.setBounds(25, 15, 68, 14);
		panel_7_2.add(phq9ovLabel_1);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionD mds3sectionD = (Mds3SectionD) Mds3Controller.getInstance()
				.getSection(Mds3SectionD.class);
		Object obj = cmbD0650.getSelectedItem();
		if (obj != null) {
			mds3sectionD.setD0650((String) cmbD0650.getSelectedItem());
		} else {
			mds3sectionD.setD0650("");
		}
	}

	@Override
	public void doUpdate() {
		Mds3SectionD mds3sectionD = (Mds3SectionD) Mds3Controller.getInstance()
				.getSection(Mds3SectionD.class);
		cmbD0650.setSelectedItem(mds3sectionD.getD0650());
	}
}
