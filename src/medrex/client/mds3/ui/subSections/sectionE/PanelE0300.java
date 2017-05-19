package medrex.client.mds3.ui.subSections.sectionE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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

public class PanelE0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5728579260133896106L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbE0300;

	public PanelE0300() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 109));
		setBackground(Color.WHITE);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBounds(0, 0, 840, 109);
		add(panel_1);
		panel_1.setLayout(null);

		panel_1.setPreferredSize(new Dimension(840, 109));

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);
		panel_5_1_1_1.setBounds(0, 0, 840, 30);
		panel_1.add(panel_5_1_1_1);
		panel_5_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1.setLayout(flowLayout_3);
		panel_5_1_1_1.setPreferredSize(new Dimension(820, 30));

		final JxLabel a0100Label_1_1_1 = new JxLabel();
		a0100Label_1_1_1.setTheme(theme);

		a0100Label_1_1_1.setFontSize(12);
		a0100Label_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1
				.setText("E0300.  Overall Presence of Behavioral Symptoms");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(0, 30, 840, 79);
		panel_1.add(panel_1_1);

		panel_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(820, 79));

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setVgap(8);
		panel_6_1.setLayout(flowLayout_9);
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBounds(0, -1, 80, 80);
		panel_1_1.add(panel_6_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		cmbE0300 = new JxComboBox();
		cmbE0300.setTheme(theme);
		cmbE0300.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));

		cmbE0300.setPreferredSize(new Dimension(50, 20));
		panel_6_1.add(cmbE0300);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(79, -1, 761, 80);
		panel_1_1.add(panel_7_1);

		final JxLabel aNationalProviderLabel_3_1 = new JxLabel();
		aNationalProviderLabel_3_1.setTheme(theme);
		aNationalProviderLabel_3_1
				.setText("<html><body><b> Were any behavioral symptoms in questins E0200 coded 1,2, or 3?");
		aNationalProviderLabel_3_1.setBounds(10, 0, 706, 21);
		panel_7_1.add(aNationalProviderLabel_3_1);

		final JxLabel aNationalProviderLabel_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_3_1.setTheme(theme);

		aNationalProviderLabel_1_3_1.setFontSize(12);
		aNationalProviderLabel_1_3_1
				.setText("<html><body>0. <b> No.--></b> Skip to E0800, Rejectiion of Care");
		aNationalProviderLabel_1_3_1.setBounds(30, 25, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1.setTheme(theme);

		aNationalProviderLabel_1_3_1_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1
				.setText("<html><body>1. <b> Yes.--></b> Considering all of E0200, Behavioral Symptoms, answer E0500 and E0600 below");
		aNationalProviderLabel_1_3_1_1.setBounds(30, 40, 574, 23);
		panel_7_1.add(aNationalProviderLabel_1_3_1_1);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionE mds3sectionD = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		Object obj = cmbE0300.getSelectedItem();
		if (obj != null) {
			mds3sectionD.setE0300((String) cmbE0300.getSelectedItem());
		} else {
			mds3sectionD.setE0300("");
		}

	}

	public void doUpdate() {
		Mds3SectionE mds3sectionD = (Mds3SectionE) Mds3Controller.getInstance()
				.getSection(Mds3SectionE.class);
		cmbE0300.setSelectedItem(mds3sectionD.getE0300());

	}
}
