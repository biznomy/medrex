package medrex.client.mds3.ui.subSections.sectionF;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.SectionF.Mds3SectionF;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelF0500 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8445521513887767714L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbF0500H;
	private JxComboBox cmbF0500G;
	private JxComboBox cmbF0500F;
	private JxComboBox cmbF0500E;
	private JxComboBox cmbF0500D;
	private JxComboBox cmbF0500C;
	private JxComboBox cmbF0500B;
	private JxComboBox cmbF0500A;

	public PanelF0500() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(840, 335));
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 330);
		add(panel);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);
		panel_5_1_1_1.setBounds(5, 0, 830, 25);
		panel.add(panel_5_1_1_1);
		panel_5_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1.setLayout(flowLayout_3);
		panel_5_1_1_1.setPreferredSize(new Dimension(836, 30));

		final JxLabel a0100Label_1_1_1 = new JxLabel();
		a0100Label_1_1_1.setTheme(theme);

		a0100Label_1_1_1.setFontSize(12);
		a0100Label_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1_1.setText("F0500. Interview for Daily Preferences");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBounds(5, 25, 830, 20);
		panel.add(panel_5_1_1);
		panel_5_1_1.setPreferredSize(new Dimension(820, 20));

		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setVgap(2);
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		a0100Label_1_1
				.setText("<html>Show Residents the response options and say :<b> \"While you are in this facility..\"");
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(5, 45, 830, 280);
		panel.add(panel_1_1);

		panel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(836, 280));

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(274, 20, 555, 260);
		panel_1_1.add(panel_7_1);

		final JxPanel panel_6_8 = new JxPanel();
		panel_6_8.setTheme(theme);
		final FlowLayout flowLayout_9 = new FlowLayout();
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		panel_6_8.setLayout(flowLayout_9);

		panel_6_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8.setBounds(0, 0, 557, 33);
		panel_7_1.add(panel_6_8);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_3_1_1_1_3_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_3_2
				.setText("<html><body><b>A.   </b><i>how important is to you to <b>have books , newspapers, and magazines to read?");
		panel_6_8.add(aNationalProviderLabel_1_3_1_1_1_3_2);

		final JxPanel panel_6_8_1 = new JxPanel();
		panel_6_8_1.setTheme(theme);
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_6_8_1.setLayout(flowLayout_12);

		panel_6_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1.setBounds(0, 32, 557, 32);
		panel_7_1.add(panel_6_8_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_2_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_2_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_3_1_1_1_3_2_1.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_3_2_1
				.setText("<html><body><b>B.   </b><i>how important is to you to <b> listen to music you like?");
		panel_6_8_1.add(aNationalProviderLabel_1_3_1_1_1_3_2_1);

		final JxPanel panel_6_8_1_1 = new JxPanel();
		panel_6_8_1_1.setTheme(theme);
		final FlowLayout flowLayout_13 = new FlowLayout();
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_1.setLayout(flowLayout_13);

		panel_6_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_1.setBounds(0, 62, 557, 32);
		panel_7_1.add(panel_6_8_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_2_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_2_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_3_1_1_1_3_2_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_3_2_2
				.setText("<html><body><b>C.   </b><i>how important is to you to <b>be around animals such as pets?");
		panel_6_8_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_2_2);

		final JxPanel panel_6_8_1_2 = new JxPanel();
		panel_6_8_1_2.setTheme(theme);
		final FlowLayout flowLayout_14 = new FlowLayout();
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_2.setLayout(flowLayout_14);

		panel_6_8_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_2.setBounds(0, 93, 557, 32);
		panel_7_1.add(panel_6_8_1_2);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_2_3 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_3.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_2_3
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_3_1_1_1_3_2_3.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_3_2_3
				.setText("<html><body><b>D.   </b><i>how important is to you to <b> keep up with the news?");
		panel_6_8_1_2.add(aNationalProviderLabel_1_3_1_1_1_3_2_3);

		final JxPanel panel_6_8_1_3 = new JxPanel();
		panel_6_8_1_3.setTheme(theme);
		final FlowLayout flowLayout_15 = new FlowLayout();
		flowLayout_15.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_3.setLayout(flowLayout_15);

		panel_6_8_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_3.setBounds(0, 124, 557, 32);
		panel_7_1.add(panel_6_8_1_3);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_2_4 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_4.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_2_4
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_1_1_3_2_4
				.setText("<html><body><b>E.   </b><i>how important is to you to <b> do things with groups of people?");
		panel_6_8_1_3.add(aNationalProviderLabel_1_3_1_1_1_3_2_4);

		final JxPanel panel_6_8_1_4 = new JxPanel();
		panel_6_8_1_4.setTheme(theme);
		final FlowLayout flowLayout_16 = new FlowLayout();
		flowLayout_16.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_4.setLayout(flowLayout_16);

		panel_6_8_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_4.setBounds(0, 155, 557, 42);
		panel_7_1.add(panel_6_8_1_4);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_2_5 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_5.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_2_5
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_3_1_1_1_3_2_5.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_3_2_5
				.setText("<html><body><b>F.   </b><i>how important is to you to <b> do your favourite activities?");
		panel_6_8_1_4.add(aNationalProviderLabel_1_3_1_1_1_3_2_5);

		final JxPanel panel_6_8_1_5 = new JxPanel();
		panel_6_8_1_5.setTheme(theme);
		final FlowLayout flowLayout_17 = new FlowLayout();
		flowLayout_17.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_5.setLayout(flowLayout_17);

		panel_6_8_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_5.setBounds(0, 195, 557, 33);
		panel_7_1.add(panel_6_8_1_5);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_2_6 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_6.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_2_6
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_3_1_1_1_3_2_6.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_3_2_6
				.setText("<html><body><b>G.   </b><i>how important is to you to <b> go outside to get fresh air when the weather is good?");
		panel_6_8_1_5.add(aNationalProviderLabel_1_3_1_1_1_3_2_6);

		final JxPanel panel_6_8_1_6 = new JxPanel();
		panel_6_8_1_6.setTheme(theme);
		final FlowLayout flowLayout_18 = new FlowLayout();
		flowLayout_18.setAlignment(FlowLayout.LEFT);
		panel_6_8_1_6.setLayout(flowLayout_18);

		panel_6_8_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_8_1_6.setBounds(0, 227, 557, 33);
		panel_7_1.add(panel_6_8_1_6);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_2_7 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_2_7.setTheme(theme);

		aNationalProviderLabel_1_3_1_1_1_3_2_7.setFontSize(12);
		aNationalProviderLabel_1_3_1_1_1_3_2_7
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_1_1_3_2_7
				.setText("<html><body><b>H.   </b><i>how important is to you to <b> participation in religious services or practices?");

		panel_6_8_1_6.add(aNationalProviderLabel_1_3_1_1_1_3_2_7);

		final JxLabel aNationalProviderLabel_1_3_1_5_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_5_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_5_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);

		aNationalProviderLabel_1_3_1_5_2.setFontSize(12);
		aNationalProviderLabel_1_3_1_5_2.setFontStyle(Font.BOLD);
		aNationalProviderLabel_1_3_1_5_2.setText("Coding  :");
		aNationalProviderLabel_1_3_1_5_2.setBounds(10, 37, 115, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_5_2);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_1_1_3
				.setText("<html><body>1. <b>Very Important");
		aNationalProviderLabel_1_3_1_1_1_3.setBounds(20, 57, 188, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_1_1_3_1
				.setText("<html><body>2. <b>Somewhat Important");
		aNationalProviderLabel_1_3_1_1_1_3_1.setBounds(20, 77, 188, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_1_1_3_1_1
				.setText("<html><body>3. <b>Not Very Important");
		aNationalProviderLabel_1_3_1_1_1_3_1_1.setBounds(20, 94, 188, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1
				.setText("<html><body>4. <b>Not Important at all");
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1.setBounds(20, 114, 188, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1
				.setText("<html><body>5. <b>Important but cant do or no &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;choice");
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1.setBounds(20, 134, 188, 25);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_1_1_1_1);

		final JxLabel aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2 = new JxLabel();
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2.setTheme(theme);
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2
				.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2
				.setText("<html><body>9. <b>No Respons or non- responsive");
		aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2.setBounds(20, 165, 188, 14);
		panel_1_1.add(aNationalProviderLabel_1_3_1_1_1_3_1_1_1_2);

		final JxPanel panel_6_1_1_1 = new JxPanel();
		panel_6_1_1_1.setTheme(theme);
		panel_6_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1_1_1.setLayout(null);
		panel_6_1_1_1.setBounds(214, 20, 60, 260);
		panel_1_1.add(panel_6_1_1_1);

		cmbF0500A = new JxComboBox();
		cmbF0500A.setTheme(theme);

		cmbF0500A.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		cmbF0500A.setPreferredSize(new Dimension(50, 20));
		cmbF0500A.setBounds(10, 10, 41, 20);
		panel_6_1_1_1.add(cmbF0500A);

		cmbF0500B = new JxComboBox();
		cmbF0500B.setTheme(theme);

		cmbF0500B.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		cmbF0500B.setPreferredSize(new Dimension(50, 20));
		cmbF0500B.setBounds(10, 40, 41, 20);
		panel_6_1_1_1.add(cmbF0500B);

		cmbF0500C = new JxComboBox();
		cmbF0500C.setTheme(theme);

		cmbF0500C.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		cmbF0500C.setPreferredSize(new Dimension(50, 20));
		cmbF0500C.setBounds(10, 70, 41, 20);
		panel_6_1_1_1.add(cmbF0500C);

		cmbF0500D = new JxComboBox();
		cmbF0500D.setTheme(theme);

		cmbF0500D.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		cmbF0500D.setPreferredSize(new Dimension(50, 20));
		cmbF0500D.setBounds(10, 100, 41, 20);
		panel_6_1_1_1.add(cmbF0500D);

		cmbF0500E = new JxComboBox();
		cmbF0500E.setTheme(theme);

		cmbF0500E.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		cmbF0500E.setPreferredSize(new Dimension(50, 20));
		cmbF0500E.setBounds(10, 130, 41, 20);
		panel_6_1_1_1.add(cmbF0500E);

		cmbF0500F = new JxComboBox();
		cmbF0500F.setTheme(theme);

		cmbF0500F.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		cmbF0500F.setPreferredSize(new Dimension(50, 20));
		cmbF0500F.setBounds(10, 165, 41, 20);
		panel_6_1_1_1.add(cmbF0500F);

		cmbF0500G = new JxComboBox();
		cmbF0500G.setTheme(theme);

		cmbF0500G.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		cmbF0500G.setPreferredSize(new Dimension(50, 20));
		cmbF0500G.setBounds(10, 200, 41, 20);
		panel_6_1_1_1.add(cmbF0500G);

		cmbF0500H = new JxComboBox();
		cmbF0500H.setTheme(theme);

		cmbF0500H.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "9" }));
		cmbF0500H.setPreferredSize(new Dimension(50, 20));
		cmbF0500H.setBounds(10, 235, 41, 20);
		panel_6_1_1_1.add(cmbF0500H);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setLayout(null);

		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBounds(214, 0, 616, 20);
		panel_1_1.add(panel_1);

		final JxLabel enterCodeLabel = new JxLabel();
		enterCodeLabel.setTheme(theme);
		enterCodeLabel.setBounds(40, 5, 152, 15);
		panel_1.add(enterCodeLabel);

		enterCodeLabel.setFontSize(12);
		enterCodeLabel.setFontStyle(Font.BOLD);
		enterCodeLabel.setText("Entert code in the boxes");

		doUpdate();

	}

	public void doSave() {
		Mds3SectionF mds3sectionF = (Mds3SectionF) Mds3Controller.getInstance()
				.getSection(Mds3SectionF.class);
		Object obj1 = cmbF0500H.getSelectedItem();
		Object obj2 = cmbF0500G.getSelectedItem();
		Object obj3 = cmbF0500F.getSelectedItem();
		Object obj4 = cmbF0500E.getSelectedItem();
		Object obj5 = cmbF0500D.getSelectedItem();
		Object obj6 = cmbF0500C.getSelectedItem();
		Object obj7 = cmbF0500B.getSelectedItem();
		Object obj8 = cmbF0500A.getSelectedItem();

		if (obj1 != null) {
			mds3sectionF.setF0500H((String) cmbF0500H.getSelectedItem());
		} else {
			mds3sectionF.setF0500H("");
		}
		if (obj2 != null) {
			mds3sectionF.setF0500G((String) cmbF0500G.getSelectedItem());
		} else {
			mds3sectionF.setF0500G("");
		}
		if (obj3 != null) {
			mds3sectionF.setF0500F((String) cmbF0500F.getSelectedItem());
		} else {
			mds3sectionF.setF0500F("");
		}
		if (obj4 != null) {
			mds3sectionF.setF0500E((String) cmbF0500E.getSelectedItem());
		} else {
			mds3sectionF.setF0500E("");
		}
		if (obj5 != null) {
			mds3sectionF.setF0500D((String) cmbF0500D.getSelectedItem());
		} else {
			mds3sectionF.setF0500D("");
		}
		if (obj6 != null) {
			mds3sectionF.setF0500C((String) cmbF0500C.getSelectedItem());
		} else {
			mds3sectionF.setF0500C("");
		}
		if (obj7 != null) {
			mds3sectionF.setF0500B((String) cmbF0500B.getSelectedItem());
		} else {
			mds3sectionF.setF0500B("");
		}
		if (obj8 != null) {
			mds3sectionF.setF0500A((String) cmbF0500A.getSelectedItem());
		} else {
			mds3sectionF.setF0500A("");
		}
	}

	public void doUpdate() {
		Mds3SectionF mds3sectionF = (Mds3SectionF) Mds3Controller.getInstance()
				.getSection(Mds3SectionF.class);
		cmbF0500H.setSelectedItem(mds3sectionF.getF0500H());
		cmbF0500G.setSelectedItem(mds3sectionF.getF0500G());
		cmbF0500F.setSelectedItem(mds3sectionF.getF0500F());
		cmbF0500E.setSelectedItem(mds3sectionF.getF0500E());
		cmbF0500D.setSelectedItem(mds3sectionF.getF0500D());
		cmbF0500C.setSelectedItem(mds3sectionF.getF0500C());
		cmbF0500B.setSelectedItem(mds3sectionF.getF0500B());
		cmbF0500A.setSelectedItem(mds3sectionF.getF0500A());

	}

	public static void main(String ar[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelF0500 panel = new PanelF0500();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);
		// SwingUtils.openInDialogforJxPanel().setVisible(true);

	}

}
