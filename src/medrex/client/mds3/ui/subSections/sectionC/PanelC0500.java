package medrex.client.mds3.ui.subSections.sectionC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelC0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1183909920711570526L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbC0500;

	public PanelC0500() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(840, 100));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panel.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 100);
		add(panel);

		final JxPanel panel_2_2 = new JxPanel();
		panel_2_2.setTheme(theme);
		panel_2_2.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_2_2.setBounds(5, 0, 830, 95);
		panel.add(panel_2_2);
		panel_2_2.setBackground(Mds3Constants.BACKGROUND_DARKGRAY);
		panel_2_2.setLayout(null);
		panel_2_2.setPreferredSize(new Dimension(820, 100));

		final JxPanel panel_3_3 = new JxPanel();
		panel_3_3.setTheme(theme);
		panel_3_3.setOpaque(false);

		final FlowLayout flowLayout_23 = new FlowLayout();
		flowLayout_23.setVgap(2);
		flowLayout_23.setHgap(10);
		flowLayout_23.setAlignment(FlowLayout.LEFT);
		panel_3_3.setLayout(flowLayout_23);
		panel_3_3.setBounds(3, 3, 231, 23);
		panel_2_2.add(panel_3_3);

		final JxLabel sectioncLabel = new JxLabel();
		sectioncLabel.setTheme(theme);
		sectioncLabel.setForeground(Color.WHITE);

		sectioncLabel.setFontStyle(Font.BOLD);
		sectioncLabel.setText("C0500. Summary Score");
		panel_3_3.add(sectioncLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setLayout(null);

		panel_5.setBounds(84, 32, 745, 62);
		panel_2_2.add(panel_5);

		final JxLabel aNationalProviderLabel_3_1_1_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_3_1_1_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_3_1_1_1_1_1_1
				.setText("<html><body><b>Add Scores</b> for questions C0200-C0400 and fill in total score(00-15)");
		aNationalProviderLabel_3_1_1_1_1_1_1.setBounds(10, 10, 706, 14);
		panel_5.add(aNationalProviderLabel_3_1_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_3_1_1_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_3_1_1_1_1_1_2.setTheme(theme);
		aNationalProviderLabel_3_1_1_1_1_1_2
				.setText("<html><body><b>Enter 99 if the resident was unable to complete the interview");
		aNationalProviderLabel_3_1_1_1_1_1_2.setBounds(10, 34, 706, 14);
		panel_5.add(aNationalProviderLabel_3_1_1_1_1_1_2);

		final JxLabel enterCodeLabel_1_1_1_2 = new JxLabel();
		enterCodeLabel_1_1_1_2.setTheme(theme);
		enterCodeLabel_1_1_1_2.setForeground(Color.WHITE);
		enterCodeLabel_1_1_1_2.setText("Enter Score");
		enterCodeLabel_1_1_1_2.setBounds(10, 38, 68, 14);
		panel_2_2.add(enterCodeLabel_1_1_1_2);

		cmbC0500 = new JxComboBox();
		cmbC0500.setTheme(theme);
		cmbC0500.setModel(new DefaultComboBoxModel(new String[] { "", "00",
				"15" }));

		cmbC0500.setPreferredSize(new Dimension(50, 20));
		cmbC0500.setBounds(10, 58, 50, 20);
		panel_2_2.add(cmbC0500);
		doUpdate();

	}

	public void doSave() {
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		Object obj = cmbC0500.getSelectedItem();
		if (obj != null) {
			sectionC.setC0500(cmbC0500.getSelectedItem().toString());
		} else {
			sectionC.setC0500("");
		}
	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbC0500.setSelectedItem(mds3sectionC.getC0500());
	}

}
