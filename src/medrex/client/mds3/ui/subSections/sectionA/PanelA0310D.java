package medrex.client.mds3.ui.subSections.sectionA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionA.Mds3SectionA;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelA0310D extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6407589820201116997L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbA0310D;

	public PanelA0310D() {
		super();
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 68));
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setOpaque(false);
		panel.setLayout(null);
		// panel.setBounds(0, 0, 840, 820);
		add(panel);

		final JxPanel panel_7_1_1_1_1_1 = new JxPanel();
		panel_7_1_1_1_1_1.setTheme(theme);

		panel_7_1_1_1_1_1.setOpaque(false);
		panel_7_1_1_1_1_1.setBorder(new LineBorder(
				ColorConstants.MDS_FONT_COLOR, 1, false));
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBounds(79, 0,
				Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 70);
		panel.add(panel_7_1_1_1_1_1);

		final JxLabel aNationalProviderLabel_2_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_2_1_1_2_1.setTheme(theme);
		aNationalProviderLabel_2_1_1_2_1
				.setText("<html><body><b>D. Is this a swing Bed clinical change assessment?</b> Complete only if A0200 =2 ");
		aNationalProviderLabel_2_1_1_2_1.setBounds(10, 5, 422, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_2_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_2_1_1_2_1 = new JxLabel();
		aNationalProviderLabel_1_2_1_1_2_1.setTheme(theme);
		aNationalProviderLabel_1_2_1_1_2_1.setText("<html><body>01. <b>No</b>");
		aNationalProviderLabel_1_2_1_1_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_2_1_1_2_1.setBounds(32, 25, 342, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_2_1_1_2_1);

		final JxLabel aNationalProviderLabel_1_1_1_1_6_1_1 = new JxLabel();
		aNationalProviderLabel_1_1_1_1_6_1_1.setTheme(theme);
		aNationalProviderLabel_1_1_1_1_6_1_1
				.setText("<html><body>02. <b>Yes</b>");
		aNationalProviderLabel_1_1_1_1_6_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_1_1_1_6_1_1.setBounds(32, 45, 342, 14);
		panel_7_1_1_1_1_1.add(aNationalProviderLabel_1_1_1_1_6_1_1);

		final JxPanel panel_6_1_1 = new JxPanel();
		panel_6_1_1.setTheme(theme);
		panel_6_1_1.setLayout(null);
		// panel_6_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
		// 1, false));
		panel_6_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 70);
		panel.add(panel_6_1_1);

		final JxLabel enterCodeLabel_1 = new JxLabel();
		enterCodeLabel_1.setTheme(theme);
		enterCodeLabel_1.setBounds(16, 9, 54, 14);
		enterCodeLabel_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		enterCodeLabel_1.setText("Enter Code");
		panel_6_1_1.add(enterCodeLabel_1);

		cmbA0310D = new JxComboBox();
		cmbA0310D.setTheme(theme);
		cmbA0310D.setBounds(18, 31, 50, 20);

		cmbA0310D.setModel(new DefaultComboBoxModel(
				new String[] { "", "0", "1" }));
		cmbA0310D.setPreferredSize(new Dimension(50, 20));
		panel_6_1_1.add(cmbA0310D);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionA sectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		Object obj = cmbA0310D.getSelectedItem();
		if (obj != null) {
			sectionA.setA0310D((cmbA0310D.getSelectedItem().toString()));
		} else {
			sectionA.setA0310D("");
		}
	}

	public void doUpdate() {
		Mds3SectionA mds3SectionA = (Mds3SectionA) Mds3Controller.getInstance()
				.getSection(Mds3SectionA.class);
		cmbA0310D.setSelectedItem(mds3SectionA.getA0310D());

	}

}
