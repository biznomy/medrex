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

public class PanelC0200 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4016231178132246719L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbC0200;

	public PanelC0200() {
		super();
		setPreferredSize(new Dimension(840, 235));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 235);
		add(panel);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);
		panel_5_1_1_1.setBounds(5, 5, 830, 30);
		panel_5_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1.setLayout(flowLayout_3);
		panel_5_1_1_1.setPreferredSize(new Dimension(840, 30));
		panel.add(panel_5_1_1_1);

		final JxLabel a0100Label_1_1_1 = new JxLabel();
		a0100Label_1_1_1.setTheme(theme);

		a0100Label_1_1_1.setFontSize(12);
		a0100Label_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1.setText("Brief Interview for Mental Status(BIMS)");
		panel_5_1_1_1.add(a0100Label_1_1_1);
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBounds(5, 35, 830, 30);
		panel_5_1_1.setPreferredSize(new Dimension(840, 30));
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		// final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel.add(panel_5_1_1);

		final JxLabel a0100Label_1_11 = new JxLabel();
		a0100Label_1_11.setTheme(theme);

		a0100Label_1_11.setFontSize(12);
		a0100Label_1_11.setFontStyle(Font.BOLD);
		a0100Label_1_11.setText("C0200. repetition of Three Words");
		panel_5_1_1.add(a0100Label_1_11);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(5, 65, 830, 170);
		panel.add(panel_1_1);

		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(840, 180));

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);

		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setVgap(8);
		panel_6_1.setLayout(flowLayout_9);
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		// panel_6_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 170);
		panel_1_1.add(panel_6_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setText("Enter Code");
		panel_6_1.add(enterCodeLabel);

		cmbC0200 = new JxComboBox();
		cmbC0200.setTheme(theme);
		cmbC0200.setName("");
		cmbC0200.setToolTipText("");
		cmbC0200.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2", "3" }));

		cmbC0200.setPreferredSize(new Dimension(50, 20));
		panel_6_1.add(cmbC0200);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1.setPreferredSize(new Dimension(755, 0));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(80, 0, 750, 170);
		panel_1_1.add(panel_7_1);

		final JxLabel aNationalProviderLabel_3_1 = new JxLabel();
		aNationalProviderLabel_3_1.setTheme(theme);
		aNationalProviderLabel_3_1
				.setText("<html><body>Ask Resident : \"I am going to say three words for you to remember. Please repeat the words after I have said all three<br>The words are : <b> Sock ,Blue , Bed . </b>Now tell me the Three words.\"<br><b>Number of words repeated after first attempt");
		aNationalProviderLabel_3_1.setBounds(10, 5, 706, 42);
		panel_7_1.add(aNationalProviderLabel_3_1);

		final JxLabel aNationalProviderLabel_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_3_1.setTheme(theme);
		aNationalProviderLabel_1_3_1.setText("<html><body>0. <b>None.");
		aNationalProviderLabel_1_3_1.setBounds(31, 53, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_1.setText("<html><body>1. <b>One.");
		aNationalProviderLabel_1_3_1_1.setBounds(31, 73, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_2.setText("<html><body>2. <b>Two.");
		aNationalProviderLabel_1_3_1_2.setBounds(31, 93, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_3 = new JxLabel();
		aNationalProviderLabel_1_3_1_3.setTheme(theme);
		aNationalProviderLabel_1_3_1_3.setText("<html><body>3. <b>Three.");
		aNationalProviderLabel_1_3_1_3.setBounds(31, 112, 311, 14);
		panel_7_1.add(aNationalProviderLabel_1_3_1_3);

		final JxLabel aNationalProviderLabel_1_3_1_4 = new JxLabel();
		aNationalProviderLabel_1_3_1_4.setTheme(theme);
		aNationalProviderLabel_1_3_1_4
				.setText("<html><body>after the residents first attempt, repeat the words using cues(\"sock,something to wear ; blue , a color;bed,a piece<br>of furniture\").You may repeat the words upto two more times");
		aNationalProviderLabel_1_3_1_4.setBounds(10, 132, 706, 33);
		panel_7_1.add(aNationalProviderLabel_1_3_1_4);
		doUpdate();

	}

	public void doSave() {
		Mds3SectionC sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		Object obj = cmbC0200.getSelectedItem();
		if (obj != null) {
			sectionC.setC0200(cmbC0200.getSelectedItem().toString());
		} else {
			sectionC.setC0200("");
		}
	}

	public void doUpdate() {
		Mds3SectionC mds3sectionC = (Mds3SectionC) Mds3Controller.getInstance()
				.getSection(Mds3SectionC.class);
		cmbC0200.setSelectedItem(mds3sectionC.getC0200());
	}

}
