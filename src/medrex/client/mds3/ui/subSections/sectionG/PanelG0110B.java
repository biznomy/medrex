package medrex.client.mds3.ui.subSections.sectionG;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

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
import medrex.commons.vo.mds3.SectionG.Mds3SectionG;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelG0110B extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7444965873627747134L;

	Theme theme = new BlackOverWhiteTheme();

	private JxComboBox cmbG0110J2;
	private JxComboBox cmbG0110I2;
	private JxComboBox cmbG0110H2;
	private JxComboBox cmbG0110G2;
	private JxComboBox cmbG0110F2;
	private JxComboBox cmbG0110E2;
	private JxComboBox cmbG0110D2;
	private JxComboBox cmbG0110C2;
	private JxComboBox cmbG0110B2;
	private JxComboBox cmbG0110A2;
	private JxComboBox cmbG0110J1;
	private JxComboBox cmbG0110I1;
	private JxComboBox cmbG0110H1;
	private JxComboBox cmbG0110G1;
	private JxComboBox cmbG0110F1;
	private JxComboBox cmbG0110E1;
	private JxComboBox cmbG0110D1;
	private JxComboBox cmbG0110C1;
	private JxComboBox cmbG0110B1;
	private JxComboBox cmbG0110A1;

	public PanelG0110B() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 438));
		setLayout(null);

		final JxPanel panel_main = new JxPanel();
		panel_main.setTheme(theme);
		panel_main.setBorder(new LineBorder(Color.black, 1, false));

		panel_main.setLayout(null);
		panel_main.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 438);
		add(panel_main);

		final JxPanel panel1_11 = new JxPanel();
		panel1_11.setTheme(theme);
		panel1_11.setBounds(0, 0, 550, 435);
		panel1_11.setLayout(null);

		panel1_11.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel1_11.setPreferredSize(new Dimension(550, 435));
		panel_main.add(panel1_11);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel
				.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
						false));
		panel.setLayout(new BorderLayout());

		panel.setBounds(0, 0, 550, 35);
		panel1_11.add(panel);

		final JxLabel nbspaBadLabel = new JxLabel();
		nbspaBadLabel.setTheme(theme);

		nbspaBadLabel.setFontSize(12);
		nbspaBadLabel
				.setText("<html><b> &nbsp;A. Bad mobiltiy</b> - how resident moves to and from lying positions, turns side to side, and<br> &nbsp; &nbsp; &nbsp; positions body while in bed or alternate sleep furniture</html>");
		panel.add(nbspaBadLabel, BorderLayout.CENTER);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setLayout(new BorderLayout());

		panel_10.setBounds(0, 35, 550, 35);
		panel1_11.add(panel_10);

		final JxLabel nbspBLabel = new JxLabel();
		nbspBLabel.setTheme(theme);

		nbspBLabel.setFontSize(12);
		nbspBLabel
				.setText("<html><b> &nbsp; B. Transfer</b> - how resident moves between surfaces including to and from: bed, chair, wheelchair,<br> &nbsp; &nbsp; &nbsp; standing position (<b>excludes</b> to/from bath/toilet)</html>");
		panel_10.add(nbspBLabel, BorderLayout.CENTER);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11.setLayout(new BorderLayout());

		panel_11.setBounds(0, 70, 550, 30);
		panel1_11.add(panel_11);

		final JxLabel cWalkInLabel = new JxLabel();
		cWalkInLabel.setTheme(theme);

		cWalkInLabel.setFontSize(12);
		cWalkInLabel
				.setText("<html><b> &nbsp; C. Walk in room</b> - how residents walks in lodcation of his/her room.</html>");
		panel_11.add(cWalkInLabel, BorderLayout.CENTER);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_12.setLayout(new BorderLayout());

		panel_12.setBounds(0, 100, 550, 30);
		panel1_11.add(panel_12);

		final JxLabel nbspDLabel = new JxLabel();
		nbspDLabel.setTheme(theme);

		nbspDLabel.setFontSize(12);
		nbspDLabel
				.setText("<html><b> &nbsp; D. Walk in corridor</b> - how resident walks in corridor or unit</html>");
		panel_12.add(nbspDLabel, BorderLayout.CENTER);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_13.setLayout(new BorderLayout());

		panel_13.setBounds(0, 130, 550, 35);
		panel1_11.add(panel_13);

		final JxLabel nbspELabel = new JxLabel();
		nbspELabel.setTheme(theme);
		nbspELabel
				.setText("<html><b> &nbsp; E. Locomotion on unit</b> - how residents move in location in his/her room and adjacent<br> &nbsp; &nbsp; &nbsp; corridor on same floor. if in wheelchair, self-sufficiency once in chair</html>");
		panel_13.add(nbspELabel, BorderLayout.CENTER);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_14.setLayout(new BorderLayout());

		panel_14.setBounds(0, 165, 550, 50);
		panel1_11.add(panel_14);

		final JxLabel nbspFLabel = new JxLabel();
		nbspFLabel.setTheme(theme);

		nbspFLabel.setFontSize(12);

		nbspFLabel
				.setText("<html><b> &nbsp; F. Locomotion off unit</b> - how resident moves to and returns from off unit location (e.g., areas<br> &nbsp; &nbsp; &nbsp;set aside for dinning, activities or treatments). <b>If facility has only one floor</b>, how resident<br> &nbsp; &nbsp; &nbsp; moves to and from distant areas on the floor. If in wheelchair, self-sufficeincy once in chair</html>");
		panel_14.add(nbspFLabel, BorderLayout.WEST);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setLayout(new BorderLayout());
		panel_15.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_15.setBounds(0, 215, 550, 50);
		panel1_11.add(panel_15);

		final JxLabel nbspgDressingLabel = new JxLabel();
		nbspgDressingLabel.setTheme(theme);

		nbspgDressingLabel.setFontSize(12);
		nbspgDressingLabel
				.setText("<html><b> &nbsp;G. Dressing</b> - how resident puts on, fastens and take off all the items of clothing, including<br> &nbsp; &nbsp; &nbsp;donning/removing a prothesis or TED hose. Dressing includes putting on and changing<br> &nbsp; &nbsp; &nbsp; pajamas and housedresses.</html>");
		panel_15.add(nbspgDressingLabel, BorderLayout.CENTER);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);
		panel_16.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_16.setLayout(new BorderLayout());

		panel_16.setBounds(0, 265, 550, 50);
		panel1_11.add(panel_16);

		final JxLabel nbspHLabel = new JxLabel();
		nbspHLabel.setTheme(theme);

		nbspHLabel.setFontSize(12);
		nbspHLabel
				.setText("<html><b> &nbsp; H. Eating</b> - how residents eats and drinks, regardless of skill. Do not include eating/drinking<br>  &nbsp;  &nbsp;  &nbsp; during medical pass. Includes intake of nurishment by other means (e.g., tube feeding, <br>  &nbsp;  &nbsp;  &nbsp; total parenteral nutrition, IV fliuds administered for nutrition or hydration)</html>");
		panel_16.add(nbspHLabel, BorderLayout.CENTER);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);
		panel_17.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_17.setLayout(new BorderLayout());

		panel_17.setBounds(0, 315, 550, 70);
		panel1_11.add(panel_17);

		final JxLabel nbspILabel = new JxLabel();
		nbspILabel.setTheme(theme);

		nbspILabel.setFontSize(12);
		nbspILabel
				.setText("<html><b>  &nbsp; I. Toilet use</b> - how resident uses the toilet room, commode, bedpan, or urinal; transfers on/off<br>  &nbsp;  &nbsp;  &nbsp; toilet; cleans self after elimination; changes pad; manages ostomy or catheter; and adjusts<br>  &nbsp;  &nbsp;  &nbsp; cloths. Do not inlude empting of bedpan, urinal, bedside commode, cathetor bag or<br>  &nbsp;  &nbsp;  &nbsp; ostomy bag");
		panel_17.add(nbspILabel, BorderLayout.CENTER);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		panel_18.setLayout(new BorderLayout());
		panel_18.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_18.setBounds(0, 385, 550, 51);
		panel1_11.add(panel_18);

		final JxLabel nbspJxLabel = new JxLabel();
		nbspJxLabel.setTheme(theme);

		nbspJxLabel.setFontSize(12);
		nbspJxLabel
				.setText("<html><b>  &nbsp; J. Personal hygiene</b> - how resident maintains personal hygiene, including combing hair,<br>  &nbsp;  &nbsp;  &nbsp; brushing teeth, shaving, applying makeup, washing/drying face and hands (<b>excludes</b> baths<br>  &nbsp;  &nbsp;  &nbsp; and showers)</html>");
		panel_18.add(nbspJxLabel, BorderLayout.CENTER);

		final JxPanel panel1_12 = new JxPanel();
		panel1_12.setTheme(theme);
		panel1_12.setBounds(550, 0, 290, 437);
		panel1_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel1_12.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel1_12.setLayout(null);
		panel1_12.setPreferredSize(new Dimension(278, 437));
		panel_main.add(panel1_12);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setLayout(null);
		panel_19.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_19.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_19.setBounds(0, 0, 145, 437);
		panel1_12.add(panel_19);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);
		panel_21.setLayout(null);
		panel_21.setBounds(1, 2, 144, 36);
		// panel_21.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_21.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_21.setPreferredSize(new Dimension(138, 35));
		panel_19.add(panel_21);

		cmbG0110A1 = new JxComboBox();
		cmbG0110A1.setTheme(theme);
		cmbG0110A1.setBounds(55, 5, 50, 21);
		cmbG0110A1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "7", "8" }));

		panel_21.add(cmbG0110A1);

		final JxPanel panel_22 = new JxPanel();
		panel_22.setTheme(theme);
		panel_22.setLayout(null);
		// /panel_22.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_22.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_22.setBounds(1, 35, 144, 35);
		panel_19.add(panel_22);

		cmbG0110B1 = new JxComboBox();
		cmbG0110B1.setTheme(theme);
		cmbG0110B1.setBounds(55, 5, 50, 21);
		cmbG0110B1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "7", "8" }));

		panel_22.add(cmbG0110B1);

		final JxPanel panel_23 = new JxPanel();
		panel_23.setTheme(theme);
		panel_23.setLayout(null);
		panel_23.setBounds(1, 70, 144, 30);
		// panel_23.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_23.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_19.add(panel_23);

		cmbG0110C1 = new JxComboBox();
		cmbG0110C1.setTheme(theme);
		cmbG0110C1.setBounds(55, 5, 50, 21);
		cmbG0110C1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "7", "8" }));

		panel_23.add(cmbG0110C1);

		final JxPanel panel_24 = new JxPanel();
		panel_24.setTheme(theme);
		panel_24.setLayout(null);
		// panel_24.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_24.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_24.setBounds(1, 100, 144, 30);
		panel_19.add(panel_24);

		cmbG0110D1 = new JxComboBox();
		cmbG0110D1.setTheme(theme);
		cmbG0110D1.setBounds(55, 5, 50, 21);
		cmbG0110D1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "7", "8" }));

		panel_24.add(cmbG0110D1);

		final JxPanel panel_25 = new JxPanel();
		panel_25.setTheme(theme);
		panel_25.setLayout(null);
		panel_25.setBounds(1, 130, 144, 35);
		// panel_25.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_25.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_19.add(panel_25);

		cmbG0110E1 = new JxComboBox();
		cmbG0110E1.setTheme(theme);
		cmbG0110E1.setBounds(55, 5, 50, 21);
		cmbG0110E1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "7", "8" }));

		panel_25.add(cmbG0110E1);

		final JxPanel panel_26 = new JxPanel();
		panel_26.setTheme(theme);
		panel_26.setLayout(null);
		panel_26.setBounds(1, 165, 144, 50);
		// panel_26.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_26.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_19.add(panel_26);

		cmbG0110F1 = new JxComboBox();
		cmbG0110F1.setTheme(theme);
		cmbG0110F1.setBounds(55, 5, 50, 21);
		cmbG0110F1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "7", "8" }));

		panel_26.add(cmbG0110F1);

		final JxPanel panel_27 = new JxPanel();
		panel_27.setTheme(theme);
		panel_27.setLayout(null);
		panel_27.setBounds(1, 215, 144, 50);
		// panel_27.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_27.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_19.add(panel_27);

		cmbG0110G1 = new JxComboBox();
		cmbG0110G1.setTheme(theme);
		cmbG0110G1.setBounds(55, 5, 50, 21);
		cmbG0110G1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "7", "8" }));

		panel_27.add(cmbG0110G1);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme(theme);
		panel_28.setLayout(null);
		panel_28.setBounds(1, 265, 144, 50);
		// panel_28.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
		// Mds3Constants.BORDER_SIZE_1, false));
		panel_28.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_19.add(panel_28);

		cmbG0110H1 = new JxComboBox();
		cmbG0110H1.setTheme(theme);
		cmbG0110H1.setBounds(55, 5, 50, 21);
		cmbG0110H1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "7", "8" }));

		panel_28.add(cmbG0110H1);

		final JxPanel panel_29 = new JxPanel();
		panel_29.setTheme(theme);
		panel_29.setLayout(null);
		panel_29.setBounds(1, 315, 144, 70);
		panel_29.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_19.add(panel_29);

		cmbG0110I1 = new JxComboBox();
		cmbG0110I1.setTheme(theme);
		cmbG0110I1.setBounds(55, 5, 50, 21);
		cmbG0110I1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "7", "8" }));

		panel_29.add(cmbG0110I1);

		final JxPanel panel_30 = new JxPanel();
		panel_30.setTheme(theme);
		panel_30.setLayout(null);
		panel_30.setBounds(1, 385, 144, 42);
		panel_30.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_19.add(panel_30);

		cmbG0110J1 = new JxComboBox();
		cmbG0110J1.setTheme(theme);
		cmbG0110J1.setBounds(55, 5, 50, 21);
		cmbG0110J1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "4", "7", "8" }));

		panel_30.add(cmbG0110J1);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);
		panel_20.setLayout(null);
		panel_20.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_20.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.setBounds(145, 0, 144, 437);
		panel1_12.add(panel_20);

		final JxPanel panel_31 = new JxPanel();
		panel_31.setTheme(theme);
		panel_31.setBounds(1, 2, 142, 35);
		panel_31.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.add(panel_31);

		cmbG0110A2 = new JxComboBox();
		cmbG0110A2.setTheme(theme);

		cmbG0110A2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "8" }));
		panel_31.add(cmbG0110A2);

		final JxPanel panel_32 = new JxPanel();
		panel_32.setTheme(theme);
		panel_32.setBounds(1, 35, 142, 35);
		panel_32.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.add(panel_32);

		cmbG0110B2 = new JxComboBox();
		cmbG0110B2.setTheme(theme);
		cmbG0110B2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "8" }));

		panel_32.add(cmbG0110B2);

		final JxPanel panel_33 = new JxPanel();
		panel_33.setTheme(theme);
		panel_33.setBounds(1, 70, 142, 30);
		panel_33.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.add(panel_33);

		cmbG0110C2 = new JxComboBox();
		cmbG0110C2.setTheme(theme);
		cmbG0110C2.setModel(new DefaultComboBoxModel(new String[] { "", "0.",
				"1", "2", "3", "8" }));

		panel_33.add(cmbG0110C2);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme(theme);
		panel_34.setBounds(1, 100, 142, 30);
		panel_34.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.add(panel_34);

		cmbG0110D2 = new JxComboBox();
		cmbG0110D2.setTheme(theme);
		cmbG0110D2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "8" }));

		panel_34.add(cmbG0110D2);

		final JxPanel panel_35 = new JxPanel();
		panel_35.setTheme(theme);
		panel_35.setBounds(1, 130, 142, 35);
		panel_35.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.add(panel_35);

		cmbG0110E2 = new JxComboBox();
		cmbG0110E2.setTheme(theme);
		cmbG0110E2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "8" }));

		panel_35.add(cmbG0110E2);

		final JxPanel panel_36 = new JxPanel();
		panel_36.setTheme(theme);
		panel_36.setBounds(1, 165, 142, 50);
		panel_36.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.add(panel_36);

		cmbG0110F2 = new JxComboBox();
		cmbG0110F2.setTheme(theme);
		cmbG0110F2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "8" }));

		panel_36.add(cmbG0110F2);

		final JxPanel panel_37 = new JxPanel();
		panel_37.setTheme(theme);
		panel_37.setBounds(1, 215, 142, 50);
		panel_37.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.add(panel_37);

		cmbG0110G2 = new JxComboBox();
		cmbG0110G2.setTheme(theme);
		cmbG0110G2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "8" }));

		panel_37.add(cmbG0110G2);

		final JxPanel panel_38 = new JxPanel();
		panel_38.setTheme(theme);
		panel_38.setBounds(1, 265, 142, 50);
		panel_38.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.add(panel_38);

		cmbG0110H2 = new JxComboBox();
		cmbG0110H2.setTheme(theme);
		cmbG0110H2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "8" }));

		panel_38.add(cmbG0110H2);

		final JxPanel panel_39 = new JxPanel();
		panel_39.setTheme(theme);
		panel_39.setBounds(1, 315, 142, 70);
		panel_39.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.add(panel_39);

		cmbG0110I2 = new JxComboBox();
		cmbG0110I2.setTheme(theme);
		cmbG0110I2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "8" }));

		panel_39.add(cmbG0110I2);

		final JxPanel panel_40 = new JxPanel();
		panel_40.setTheme(theme);
		panel_40.setBounds(1, 385, 142, 42);
		panel_40.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_20.add(panel_40);

		cmbG0110J2 = new JxComboBox();
		cmbG0110J2.setTheme(theme);
		cmbG0110J2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2", "3", "8" }));

		panel_40.add(cmbG0110J2);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		Object obj1 = cmbG0110A1.getSelectedItem();
		Object obj2 = cmbG0110B1.getSelectedItem();
		Object obj3 = cmbG0110C1.getSelectedItem();
		Object obj4 = cmbG0110D1.getSelectedItem();
		Object obj5 = cmbG0110E1.getSelectedItem();
		Object obj6 = cmbG0110F1.getSelectedItem();
		Object obj7 = cmbG0110G1.getSelectedItem();
		Object obj8 = cmbG0110H1.getSelectedItem();
		Object obj9 = cmbG0110I1.getSelectedItem();
		Object obj10 = cmbG0110J1.getSelectedItem();
		Object obj11 = cmbG0110A2.getSelectedItem();
		Object obj12 = cmbG0110B2.getSelectedItem();
		Object obj13 = cmbG0110C2.getSelectedItem();
		Object obj14 = cmbG0110D2.getSelectedItem();
		Object obj15 = cmbG0110E2.getSelectedItem();
		Object obj16 = cmbG0110F2.getSelectedItem();
		Object obj17 = cmbG0110G2.getSelectedItem();
		Object obj18 = cmbG0110H2.getSelectedItem();
		Object obj19 = cmbG0110I2.getSelectedItem();
		Object obj20 = cmbG0110J2.getSelectedItem();

		if (obj1 != null) {
			mds3sectionG.setG0110A1((String) cmbG0110A1.getSelectedItem());
		} else {
			mds3sectionG.setG0110A1("");
		}
		if (obj2 != null) {
			mds3sectionG.setG0110B1((String) cmbG0110B1.getSelectedItem());
		} else {
			mds3sectionG.setG0110B1("");
		}
		if (obj3 != null) {
			mds3sectionG.setG0110C1((String) cmbG0110C1.getSelectedItem());
		} else {
			mds3sectionG.setG0110C1("");
		}
		if (obj4 != null) {
			mds3sectionG.setG0110D1((String) cmbG0110D1.getSelectedItem());
		} else {
			mds3sectionG.setG0110D1("");
		}
		if (obj5 != null) {
			mds3sectionG.setG0110E1((String) cmbG0110E1.getSelectedItem());
		} else {
			mds3sectionG.setG0110E1("");
		}
		if (obj6 != null) {
			mds3sectionG.setG0110F1((String) cmbG0110F1.getSelectedItem());
		} else {
			mds3sectionG.setG0110F1("");
		}
		if (obj7 != null) {
			mds3sectionG.setG0110G1((String) cmbG0110G1.getSelectedItem());
		} else {
			mds3sectionG.setG0110G1("");
		}
		if (obj8 != null) {
			mds3sectionG.setG0110H1((String) cmbG0110H1.getSelectedItem());
		} else {
			mds3sectionG.setG0110H1("");
		}
		if (obj9 != null) {
			mds3sectionG.setG0110I1((String) cmbG0110I1.getSelectedItem());
		} else {
			mds3sectionG.setG0110I1("");
		}
		if (obj10 != null) {
			mds3sectionG.setG0110J1((String) cmbG0110J1.getSelectedItem());
		} else {
			mds3sectionG.setG0110J1("");
		}
		if (obj11 != null) {
			mds3sectionG.setG0110A2((String) cmbG0110A2.getSelectedItem());
		} else {
			mds3sectionG.setG0110A2("");
		}
		if (obj12 != null) {
			mds3sectionG.setG0110B2((String) cmbG0110B2.getSelectedItem());
		} else {
			mds3sectionG.setG0110B2("");
		}
		if (obj13 != null) {
			mds3sectionG.setG0110C2((String) cmbG0110C2.getSelectedItem());
		} else {
			mds3sectionG.setG0110C2("");
		}
		if (obj14 != null) {
			mds3sectionG.setG0110D2((String) cmbG0110D2.getSelectedItem());
		} else {
			mds3sectionG.setG0110D2("");
		}
		if (obj15 != null) {
			mds3sectionG.setG0110E2((String) cmbG0110E2.getSelectedItem());
		} else {
			mds3sectionG.setG0110E2("");
		}
		if (obj16 != null) {
			mds3sectionG.setG0110F2((String) cmbG0110F2.getSelectedItem());
		} else {
			mds3sectionG.setG0110F2("");
		}
		if (obj17 != null) {
			mds3sectionG.setG0110G2((String) cmbG0110G2.getSelectedItem());
		} else {
			mds3sectionG.setG0110G2("");
		}
		if (obj18 != null) {
			mds3sectionG.setG0110H2((String) cmbG0110H2.getSelectedItem());
		} else {
			mds3sectionG.setG0110H2("");
		}
		if (obj19 != null) {
			mds3sectionG.setG0110I2((String) cmbG0110I2.getSelectedItem());
		} else {
			mds3sectionG.setG0110I2("");
		}
		if (obj20 != null) {
			mds3sectionG.setG0110J2((String) cmbG0110J2.getSelectedItem());
		} else {
			mds3sectionG.setG0110J2("");
		}

	}

	@Override
	public void doUpdate() {
		Mds3SectionG mds3sectionG = (Mds3SectionG) Mds3Controller.getInstance()
				.getSection(Mds3SectionG.class);
		cmbG0110A1.setSelectedItem(mds3sectionG.getG0110A1());
		cmbG0110B1.setSelectedItem(mds3sectionG.getG0110B1());
		cmbG0110C1.setSelectedItem(mds3sectionG.getG0110C1());
		cmbG0110D1.setSelectedItem(mds3sectionG.getG0110D1());
		cmbG0110E1.setSelectedItem(mds3sectionG.getG0110E1());
		cmbG0110F1.setSelectedItem(mds3sectionG.getG0110F1());
		cmbG0110G1.setSelectedItem(mds3sectionG.getG0110G1());
		cmbG0110H1.setSelectedItem(mds3sectionG.getG0110H1());
		cmbG0110I1.setSelectedItem(mds3sectionG.getG0110I1());
		cmbG0110J1.setSelectedItem(mds3sectionG.getG0110J1());
		cmbG0110A2.setSelectedItem(mds3sectionG.getG0110A2());
		cmbG0110B2.setSelectedItem(mds3sectionG.getG0110B2());
		cmbG0110C2.setSelectedItem(mds3sectionG.getG0110C2());
		cmbG0110D2.setSelectedItem(mds3sectionG.getG0110D2());
		cmbG0110E2.setSelectedItem(mds3sectionG.getG0110E2());
		cmbG0110F2.setSelectedItem(mds3sectionG.getG0110F2());
		cmbG0110G2.setSelectedItem(mds3sectionG.getG0110G2());
		cmbG0110H2.setSelectedItem(mds3sectionG.getG0110H2());
		cmbG0110I2.setSelectedItem(mds3sectionG.getG0110I2());
		cmbG0110J2.setSelectedItem(mds3sectionG.getG0110J2());

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
		PanelG0110B panel = new PanelG0110B();
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
