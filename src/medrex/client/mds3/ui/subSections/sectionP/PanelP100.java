package medrex.client.mds3.ui.subSections.sectionP;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.mds3.sectionP.Mds3SectionP;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelP100 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8464031981515374879L;
	Theme theme = new BlackOverWhiteTheme();
	private JxComboBox cmbP100H;
	private JxComboBox cmbP100G;
	private JxComboBox cmbP100F;
	private JxComboBox cmbP100E;
	private JxComboBox cmbP100D;
	private JxComboBox cmbP100C;
	private JxComboBox cmbP100B;
	private JxComboBox cmbP100A;

	public PanelP100() {
		super();

		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 470));

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setBorder(new LineBorder(Color.black, 1, false));

		panel.setLayout(null);
		panel.setBounds(0, 0, 840, 421);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BACKGROUND_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 840, 30);
		panel.add(panel_1);

		final JxLabel p0100PhysicalRestraintsLabel = new JxLabel();
		p0100PhysicalRestraintsLabel.setTheme(theme);

		p0100PhysicalRestraintsLabel.setFontSize(12);
		p0100PhysicalRestraintsLabel.setFontStyle(Font.BOLD);
		p0100PhysicalRestraintsLabel.setText("P0100.  Physical Restraints");
		p0100PhysicalRestraintsLabel.setBounds(10, 7, 311, 14);
		panel_1.add(p0100PhysicalRestraintsLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_5.setLayout(null);
		panel_5.setBounds(0, 29, 840, 45);
		panel.add(panel_5);

		final JxLabel physicalRestraintsLabel = new JxLabel();
		physicalRestraintsLabel.setTheme(theme);

		physicalRestraintsLabel.setFontSize(12);
		physicalRestraintsLabel
				.setText("<html><body> Physical restraints are any manual method or physical or mechanical device, material or equipment attached or adjacent to the resident's body that the individual cannot remove easily which restricts freedom of movement or normal access to one's body");
		physicalRestraintsLabel.setBounds(15, 5, 837, 38);
		panel_5.add(physicalRestraintsLabel);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_6.setLayout(null);
		panel_6.setBounds(0, 73, 380, 348);
		panel.add(panel_6);

		final JxLabel codingLabel = new JxLabel();
		codingLabel.setTheme(theme);

		codingLabel.setFontSize(12);
		codingLabel
				.setText("<html><body><b> Coding : </b> <br>&nbsp &nbsp 0. &nbsp<b> Not Used </b> <br> &nbsp &nbsp 1. &nbsp <b> Used Less than daily </b> <br> &nbsp &nbsp 2. &nbsp <b> Used daily </b>");
		codingLabel.setBounds(25, 100, 172, 92);
		panel_6.add(codingLabel);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme(theme);

		panel_7.setLayout(null);
		panel_7.setBounds(380, 74, 460, 347);
		panel.add(panel_7);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme(theme);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));

		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 460, 25);
		panel_7.add(panel_8);

		final JxLabel enterCodesInLabel = new JxLabel();
		enterCodesInLabel.setTheme(theme);

		enterCodesInLabel.setFontSize(12);
		enterCodesInLabel.setFontStyle(Font.BOLD);
		enterCodesInLabel.setText("Enter Codes in Boxes");
		enterCodesInLabel.setBounds(35, 4, 178, 14);
		panel_8.add(enterCodesInLabel);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme(theme);

		panel_9.setLayout(null);
		panel_9.setBounds(0, 25, 460, 161);
		panel_7.add(panel_9);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme(theme);
		panel_10.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setBounds(0, 0, 61, 161);
		panel_9.add(panel_10);

		cmbP100B = new JxComboBox();
		cmbP100B.setTheme(theme);

		cmbP100B.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));
		cmbP100B.setBounds(10, 64, 43, 20);
		panel_10.add(cmbP100B);

		cmbP100A = new JxComboBox();
		cmbP100A.setTheme(theme);

		cmbP100A.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));
		cmbP100A.setBounds(10, 30, 43, 20);
		panel_10.add(cmbP100A);

		cmbP100C = new JxComboBox();
		cmbP100C.setTheme(theme);

		cmbP100C.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));
		cmbP100C.setBounds(10, 97, 43, 20);
		panel_10.add(cmbP100C);

		cmbP100D = new JxComboBox();
		cmbP100D.setTheme(theme);

		cmbP100D.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));
		cmbP100D.setBounds(10, 130, 43, 20);
		panel_10.add(cmbP100D);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme(theme);
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_11.setBounds(60, 0, 400, 21);
		panel_9.add(panel_11);

		final JxLabel usedInBedLabel = new JxLabel();
		usedInBedLabel.setTheme(theme);

		usedInBedLabel.setFontSize(12);
		usedInBedLabel.setFontStyle(Font.BOLD);
		usedInBedLabel.setText("Used in Bed");
		usedInBedLabel.setBounds(10, 4, 196, 14);
		panel_11.add(usedInBedLabel);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme(theme);
		panel_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_12.setLayout(null);

		panel_12.setBounds(60, 20, 400, 36);
		panel_9.add(panel_12);

		final JxLabel aBedRailLabel = new JxLabel();
		aBedRailLabel.setTheme(theme);

		aBedRailLabel.setFontSize(12);
		aBedRailLabel.setFontStyle(Font.BOLD);
		aBedRailLabel.setText("A.  Bed rail");
		aBedRailLabel.setBounds(10, 10, 113, 14);
		panel_12.add(aBedRailLabel);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setTheme(theme);
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));

		panel_13.setBounds(60, 55, 400, 36);
		panel_9.add(panel_13);

		final JxLabel bTrunkRestraintLabel = new JxLabel();
		bTrunkRestraintLabel.setTheme(theme);

		bTrunkRestraintLabel.setFontSize(12);
		bTrunkRestraintLabel.setFontStyle(Font.BOLD);
		bTrunkRestraintLabel.setText("B.  Trunk restraint");
		bTrunkRestraintLabel.setBounds(10, 10, 139, 14);
		panel_13.add(bTrunkRestraintLabel);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setTheme(theme);
		panel_14.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_14.setLayout(null);

		panel_14.setBounds(60, 90, 400, 36);
		panel_9.add(panel_14);

		final JxLabel cLimbRestraintLabel = new JxLabel();
		cLimbRestraintLabel.setTheme(theme);

		cLimbRestraintLabel.setFontSize(12);
		cLimbRestraintLabel.setFontStyle(Font.BOLD);
		cLimbRestraintLabel.setText("C.  Limb restraint");
		cLimbRestraintLabel.setBounds(10, 10, 135, 16);
		panel_14.add(cLimbRestraintLabel);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme(theme);
		panel_15.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_15.setLayout(null);

		panel_15.setBounds(60, 125, 400, 36);
		panel_9.add(panel_15);

		final JxLabel dOtherLabel = new JxLabel();
		dOtherLabel.setTheme(theme);

		dOtherLabel.setFontSize(12);
		dOtherLabel.setFontStyle(Font.BOLD);
		dOtherLabel.setText("D.  Other");
		dOtherLabel.setBounds(10, 10, 86, 14);
		panel_15.add(dOtherLabel);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme(theme);

		panel_16.setLayout(null);
		panel_16.setBounds(0, 186, 460, 161);
		panel_7.add(panel_16);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme(theme);
		panel_17.setLayout(null);
		panel_17.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_17.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_17.setBounds(0, 0, 61, 161);
		panel_16.add(panel_17);

		cmbP100E = new JxComboBox();
		cmbP100E.setTheme(theme);
		cmbP100E.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));

		cmbP100E.setBounds(10, 31, 43, 20);
		panel_17.add(cmbP100E);

		cmbP100F = new JxComboBox();
		cmbP100F.setTheme(theme);
		cmbP100F.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));

		cmbP100F.setBounds(10, 65, 43, 20);
		panel_17.add(cmbP100F);

		cmbP100G = new JxComboBox();
		cmbP100G.setTheme(theme);

		cmbP100G.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));
		cmbP100G.setBounds(10, 100, 43, 20);
		panel_17.add(cmbP100G);

		cmbP100H = new JxComboBox();
		cmbP100H.setTheme(theme);

		cmbP100H.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));
		cmbP100H.setBounds(10, 130, 43, 20);
		panel_17.add(cmbP100H);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setTheme(theme);
		panel_18.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_18.setLayout(null);
		panel_18.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_18.setBounds(60, 0, 400, 21);
		panel_16.add(panel_18);

		final JxLabel usedInChairLabel = new JxLabel();
		usedInChairLabel.setTheme(theme);

		usedInChairLabel.setFontSize(12);
		usedInChairLabel.setFontStyle(Font.BOLD);
		usedInChairLabel.setText("Used in chair or Out of Bed");
		usedInChairLabel.setBounds(10, 4, 199, 14);
		panel_18.add(usedInChairLabel);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme(theme);
		panel_19.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_19.setLayout(null);

		panel_19.setBounds(60, 20, 400, 36);
		panel_16.add(panel_19);

		final JxLabel eTrunkRestraintLabel = new JxLabel();
		eTrunkRestraintLabel.setTheme(theme);

		eTrunkRestraintLabel.setFontSize(12);
		eTrunkRestraintLabel.setFontStyle(Font.BOLD);
		eTrunkRestraintLabel.setText("E.  Trunk restraint");
		eTrunkRestraintLabel.setBounds(10, 10, 116, 14);
		panel_19.add(eTrunkRestraintLabel);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme(theme);
		panel_20.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_20.setLayout(null);

		panel_20.setBounds(60, 55, 400, 36);
		panel_16.add(panel_20);

		final JxLabel fLimbRestraintLabel = new JxLabel();
		fLimbRestraintLabel.setTheme(theme);

		fLimbRestraintLabel.setFontSize(12);
		fLimbRestraintLabel.setFontStyle(Font.BOLD);
		fLimbRestraintLabel.setText("F.  Limb restraint");
		fLimbRestraintLabel.setBounds(10, 10, 116, 14);
		panel_20.add(fLimbRestraintLabel);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme(theme);
		panel_21.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_21.setLayout(null);

		panel_21.setBounds(60, 90, 400, 36);
		panel_16.add(panel_21);

		final JxLabel gChairPreventsLabel = new JxLabel();
		gChairPreventsLabel.setTheme(theme);

		gChairPreventsLabel.setFontSize(12);
		gChairPreventsLabel.setFontStyle(Font.BOLD);
		gChairPreventsLabel.setText("G.  Chair prevents rising");
		gChairPreventsLabel.setBounds(10, 10, 164, 14);
		panel_21.add(gChairPreventsLabel);

		final JxPanel panel_22 = new JxPanel();
		panel_22.setTheme(theme);

		panel_22.setLayout(null);
		panel_22.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_22.setBounds(60, 125, 400, 36);
		panel_16.add(panel_22);

		final JxLabel hOtherLabel = new JxLabel();
		hOtherLabel.setTheme(theme);

		hOtherLabel.setFontSize(12);
		hOtherLabel.setFontStyle(Font.BOLD);
		hOtherLabel.setText("H.  Other");
		hOtherLabel.setBounds(10, 10, 54, 14);
		panel_22.add(hOtherLabel);

		doUpdate();
	}

	public void doSave() {
		Mds3SectionP sectionP = (Mds3SectionP) Mds3Controller.getInstance()
				.getSection(Mds3SectionP.class);
		Object obj = cmbP100A.getSelectedItem();
		if (obj != null) {
			sectionP.setP0100A(cmbP100A.getSelectedItem().toString());
		} else {
			sectionP.setP0100A("");
		}
		Object obj1 = cmbP100B.getSelectedItem();
		if (obj1 != null) {
			sectionP.setP0100B(cmbP100B.getSelectedItem().toString());
		} else {
			sectionP.setP0100B("");
		}
		Object obj2 = cmbP100C.getSelectedItem();
		if (obj2 != null) {
			sectionP.setP0100C(cmbP100C.getSelectedItem().toString());
		} else {
			sectionP.setP0100C("");
		}
		Object obj3 = cmbP100D.getSelectedItem();
		if (obj3 != null) {
			sectionP.setP0100D(cmbP100D.getSelectedItem().toString());
		} else {
			sectionP.setP0100D("");
		}
		Object obj4 = cmbP100E.getSelectedItem();
		if (obj4 != null) {
			sectionP.setP0100E(cmbP100E.getSelectedItem().toString());
		} else {
			sectionP.setP0100E("");
		}
		Object obj5 = cmbP100F.getSelectedItem();
		if (obj5 != null) {
			sectionP.setP0100F(cmbP100F.getSelectedItem().toString());
		} else {
			sectionP.setP0100F("");
		}
		Object obj6 = cmbP100G.getSelectedItem();
		if (obj6 != null) {
			sectionP.setP0100G(cmbP100G.getSelectedItem().toString());
		} else {
			sectionP.setP0100G("");
		}
		Object obj7 = cmbP100H.getSelectedItem();
		if (obj7 != null) {
			sectionP.setP0100H(cmbP100H.getSelectedItem().toString());
		} else {
			sectionP.setP0100H("");
		}
	}

	public void doUpdate() {
		Mds3SectionP mds3SectionP = (Mds3SectionP) Mds3Controller.getInstance()
				.getSection(Mds3SectionP.class);
		cmbP100A.setSelectedItem(mds3SectionP.getP0100A());
		cmbP100B.setSelectedItem(mds3SectionP.getP0100B());
		cmbP100C.setSelectedItem(mds3SectionP.getP0100C());
		cmbP100D.setSelectedItem(mds3SectionP.getP0100D());
		cmbP100E.setSelectedItem(mds3SectionP.getP0100E());
		cmbP100F.setSelectedItem(mds3SectionP.getP0100F());
		cmbP100G.setSelectedItem(mds3SectionP.getP0100G());
		cmbP100H.setSelectedItem(mds3SectionP.getP0100H());

	}

}
