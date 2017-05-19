package medrex.client.mds3.ui.subSections.sectionJ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.SectionJ.Mds3SectionJ;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelJ0800 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1002225583717593755L;
	Theme theme = new BlackOverWhiteTheme();
	private JxCheckBox cbJ0800Z;
	private JxCheckBox cbJ0800D;
	private JxCheckBox cbJ0800C;
	private JxCheckBox cbJ0800B;
	private JxCheckBox cbJ0800A;

	public PanelJ0800() {
		super();
		setPreferredSize(new Dimension(Mds3Constants.PAGE_WIDTH, 226));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_2, false));
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 226);
		add(panel);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);
		panel_5_1_1_1.setBounds(5, 5, 830, 25);
		panel_5_1_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setHgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_1.setLayout(flowLayout_3);
		panel_5_1_1_1.setPreferredSize(new Dimension(820, 30));
		panel.add(panel_5_1_1_1);

		final JxLabel a0100Label_1_1_1 = new JxLabel();
		a0100Label_1_1_1.setTheme(theme);

		a0100Label_1_1_1.setFontSize(12);
		a0100Label_1_1_1.setFontStyle(Font.BOLD);
		a0100Label_1_1_1.setText("Staff Assessment for Pain");
		panel_5_1_1_1.add(a0100Label_1_1_1);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);
		panel_5_1_1.setBounds(5, 29, 830, 25);
		panel_5_1_1.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_5_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel.add(panel_5_1_1);

		final JxLabel a0100Label_1_1 = new JxLabel();
		a0100Label_1_1.setTheme(theme);

		a0100Label_1_1.setFontSize(12);
		a0100Label_1_1
				.setText("<html><body><b> J0800.  Indicators of Pain or possible Pain </b> in the last 5 days");
		panel_5_1_1.add(a0100Label_1_1);

		final JxPanel panel_5_1_1_3 = new JxPanel();
		panel_5_1_1_3.setTheme(theme);
		panel_5_1_1_3.setLayout(null);
		panel_5_1_1_3.setBounds(5, 53, 830, 26);

		panel_5_1_1_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_5_1_1_3.setPreferredSize(new Dimension(820, 30));
		panel.add(panel_5_1_1_3);

		final JxLabel a0100Label_1_1_3 = new JxLabel();
		a0100Label_1_1_3.setTheme(theme);
		a0100Label_1_1_3.setBounds(40, 6, 110, 15);

		a0100Label_1_1_3.setFontSize(12);
		a0100Label_1_1_3.setFontStyle(Font.BOLD);
		a0100Label_1_1_3.setText("Check all that apply");
		panel_5_1_1_3.add(a0100Label_1_1_3);

		final JxPanel panel_1_1 = new JxPanel();
		panel_1_1.setTheme(theme);
		panel_1_1.setBounds(5, 78, 830, 146);
		panel.add(panel_1_1);

		panel_1_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1_1.setLayout(null);
		panel_1_1.setPreferredSize(new Dimension(820, 146));

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setLayout(null);
		panel_6_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_6_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_6_1.setBounds(0, 0, 80, 147);
		panel_1_1.add(panel_6_1);

		cbJ0800A = new JxCheckBox();
		cbJ0800A.setTheme(theme);

		cbJ0800A.setBounds(33, 10, 17, 17);
		cbJ0800A.setText("New JxCheckBox");
		panel_6_1.add(cbJ0800A);

		cbJ0800B = new JxCheckBox();
		cbJ0800B.setTheme(theme);

		cbJ0800B.setText("New JxCheckBox");
		cbJ0800B.setBounds(33, 35, 17, 17);
		panel_6_1.add(cbJ0800B);

		cbJ0800C = new JxCheckBox();
		cbJ0800C.setTheme(theme);

		cbJ0800C.setText("New JxCheckBox");
		cbJ0800C.setBounds(33, 60, 17, 17);
		panel_6_1.add(cbJ0800C);

		cbJ0800D = new JxCheckBox();
		cbJ0800D.setTheme(theme);

		cbJ0800D.setText("New JxCheckBox");
		cbJ0800D.setBounds(33, 90, 17, 17);
		panel_6_1.add(cbJ0800D);

		cbJ0800Z = new JxCheckBox();
		cbJ0800Z.setTheme(theme);

		cbJ0800Z.setText("New JxCheckBox");
		cbJ0800Z.setBounds(33, 120, 17, 17);
		panel_6_1.add(cbJ0800Z);

		final JxPanel panel_7_1 = new JxPanel();
		panel_7_1.setTheme(theme);
		panel_7_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));

		panel_7_1.setLayout(null);
		panel_7_1.setBounds(79, 0, 751, 28);
		panel_1_1.add(panel_7_1);

		final JxLabel aNationalProviderLabel_3_1 = new JxLabel();
		aNationalProviderLabel_3_1.setTheme(theme);

		aNationalProviderLabel_3_1.setFontSize(12);
		aNationalProviderLabel_3_1
				.setText("<html><b>A. </b> &nbsp <b> Non Verbal sounds</b>(eg. crying,  whining, gasping, moaning or groaning)");
		aNationalProviderLabel_3_1.setBounds(10, 5, 706, 14);
		panel_7_1.add(aNationalProviderLabel_3_1);

		final JxPanel panel_7_1_3 = new JxPanel();
		panel_7_1_3.setTheme(theme);

		panel_7_1_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_3.setLayout(null);
		panel_7_1_3.setBounds(79, 27, 751, 28);
		panel_1_1.add(panel_7_1_3);

		final JxLabel aNationalProviderLabel_3_1_2 = new JxLabel();
		aNationalProviderLabel_3_1_2.setTheme(theme);

		aNationalProviderLabel_3_1_2.setFontSize(12);
		aNationalProviderLabel_3_1_2
				.setText("<html><b>B. </b> &nbsp <b>Vocal complaints of pain </b>(eg. that hurts , ouch , stop)");
		aNationalProviderLabel_3_1_2.setBounds(10, 5, 706, 14);
		panel_7_1_3.add(aNationalProviderLabel_3_1_2);

		final JxPanel panel_7_1_4 = new JxPanel();
		panel_7_1_4.setTheme(theme);

		panel_7_1_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_4.setLayout(null);
		panel_7_1_4.setBounds(79, 54, 751, 28);
		panel_1_1.add(panel_7_1_4);

		final JxLabel aNationalProviderLabel_3_1_3 = new JxLabel();
		aNationalProviderLabel_3_1_3.setTheme(theme);

		aNationalProviderLabel_3_1_3.setFontSize(12);
		aNationalProviderLabel_3_1_3
				.setText("<html><b>C. </b> &nbsp <b>Facial Expressions </b>(eg. grimaces , winces, wrinkled forehead, furrowed brow ,cleanched teeth or jaw)");
		aNationalProviderLabel_3_1_3.setBounds(10, 5, 706, 14);
		panel_7_1_4.add(aNationalProviderLabel_3_1_3);

		final JxPanel panel_7_1_6 = new JxPanel();
		panel_7_1_6.setTheme(theme);

		panel_7_1_6.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_6.setLayout(null);
		panel_7_1_6.setBounds(79, 115, 751, 32);
		panel_1_1.add(panel_7_1_6);

		final JxLabel aNationalProviderLabel_3_1_5 = new JxLabel();
		aNationalProviderLabel_3_1_5.setTheme(theme);

		aNationalProviderLabel_3_1_5.setFontSize(12);
		aNationalProviderLabel_3_1_5
				.setText("<html><b>Z. </b> &nbsp <b>None of these signs observed or documented.</b> -> If checked, skip to J1100, Shortness of Breath (dyspnea)");
		aNationalProviderLabel_3_1_5.setBounds(10, 5, 706, 14);
		panel_7_1_6.add(aNationalProviderLabel_3_1_5);

		final JxPanel panel_7_1_5 = new JxPanel();
		panel_7_1_5.setTheme(theme);
		panel_7_1_5.setBounds(79, 81, 751, 35);
		panel_1_1.add(panel_7_1_5);

		panel_7_1_5.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_7_1_5.setLayout(null);

		final JxLabel aNationalProviderLabel_3_1_4 = new JxLabel();
		aNationalProviderLabel_3_1_4.setTheme(theme);

		aNationalProviderLabel_3_1_4.setFontSize(12);
		aNationalProviderLabel_3_1_4
				.setText("<html><b>D. </b> &nbsp <b>Protective body movement or postures</b>(eg. bracing , guarding, rubbing or massaging, a body part area , clutching or holding a <br> &nbsp &nbsp &nbsp body part during movement)");
		aNationalProviderLabel_3_1_4.setBounds(10, 3, 731, 30);
		panel_7_1_5.add(aNationalProviderLabel_3_1_4);
		doUpdate();
	}

	@Override
	public void doSave() {

		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		mds3sectionJ.setJ0800A(cbJ0800A.isSelected());
		mds3sectionJ.setJ0800B(cbJ0800B.isSelected());
		mds3sectionJ.setJ0800C(cbJ0800C.isSelected());
		mds3sectionJ.setJ0800D(cbJ0800D.isSelected());
		mds3sectionJ.setJ0800Z(cbJ0800Z.isSelected());

	}

	@Override
	public void doUpdate() {
		Mds3SectionJ mds3sectionJ = (Mds3SectionJ) Mds3Controller.getInstance()
				.getSection(Mds3SectionJ.class);
		cbJ0800A.setSelected(mds3sectionJ.isJ0800A());
		cbJ0800B.setSelected(mds3sectionJ.isJ0800B());
		cbJ0800C.setSelected(mds3sectionJ.isJ0800C());
		cbJ0800D.setSelected(mds3sectionJ.isJ0800D());
		cbJ0800Z.setSelected(mds3sectionJ.isJ0800Z());
	}

}
