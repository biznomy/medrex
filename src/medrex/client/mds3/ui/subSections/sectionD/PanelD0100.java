package medrex.client.mds3.ui.subSections.sectionD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelD0100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4786941910793730677L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbB0200;

	public PanelD0100() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 128));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 118);

		panel_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_3, false));
		panel_1_1.setLayout(null);
		panel_1_1
				.setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 112));
		add(panel_1_1);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1.setBounds(10, 10, 820, 25);
		panel_1_1.add(panel_5_1);

		final JxLabel a0100Label_1 = new JxLabel();
		a0100Label_1.setTheme(theme);
		a0100Label_1.setBounds(11, 6, Mds3Constants.PAGE_WIDTH, 15);

		a0100Label_1.setFontSize(12);
		a0100Label_1.setFontStyle(Font.BOLD);
		a0100Label_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1
				.setText("<html><body> <b>D0100.   Should Resident Mood Interview be Conducted?-</b> Attempt to Conduct interview with all residents ");
		panel_5_1.add(a0100Label_1);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setLayout(null);
		// panel_6_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
		// false));
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBounds(10, 35, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 73);
		panel_1_1.add(panel_6_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel.setBounds(15, 9, 54, 14);
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		cmbB0200 = new JxComboBox();
		cmbB0200.setTheme(theme);
		cmbB0200.setBounds(15, 31, 50, 22);
		cmbB0200.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3" }));

		cmbB0200.setPreferredSize(new Dimension(50, 22));
		panel_6_1.add(cmbB0200);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(90, 35, 740, 73);
		panel_1_1.add(panel_7_1);

		final JxLabel aNationalProviderLabel_1_2 = new JxLabel();
		aNationalProviderLabel_1_2.setTheme(theme);

		aNationalProviderLabel_1_2.setFontSize(12);
		aNationalProviderLabel_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2
				.setText("<html><body><b>0. No </b>(resident is rarely/never understood)-->)skip and complete D0500-D0600,staff Assessment of Resident Mood(PHQ-9-OV)");
		aNationalProviderLabel_1_2.setBounds(32, 10, 490, 32);
		panel_7_1.add(aNationalProviderLabel_1_2);

		final JxLabel aNationalProviderLabel_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_1_1.setFontSize(12);
		aNationalProviderLabel_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1
				.setText("<html><body><b>1. Yes </b>Continue to D0200,Resident Mood Interview(PHQ-9©)");
		aNationalProviderLabel_1_1_1.setBounds(32, 48, 642, 14);
		panel_7_1.add(aNationalProviderLabel_1_1_1);
		doUpdate();
	}

	@Override
	public void doSave() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

}
