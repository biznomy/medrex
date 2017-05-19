package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;

public class PanelMDS3Page30 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8328008266301457734L;

	public PanelMDS3Page30() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(840, 470));

		final JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 840, 25);
		panel_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(840, 25));
		add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(2);
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.setLayout(flowLayout_1);
		panel_3.setBounds(3, 3, 231, 18);
		panel_2.add(panel_3);

		final JLabel sectionALabel = new JLabel();
		sectionALabel.setForeground(Color.WHITE);
		sectionALabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectionALabel.setText("Section P");
		panel_3.add(sectionALabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(246, 2, 592, 22);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 16));
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Restraints");
		panel_4.add(identificationInformationLabel);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 30, 840, 421);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 840, 30);
		panel.add(panel_1);

		final JLabel p0100PhysicalRestraintsLabel = new JLabel();
		p0100PhysicalRestraintsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		p0100PhysicalRestraintsLabel.setText("P0100.  Physical Restraints");
		p0100PhysicalRestraintsLabel.setBounds(10, 7, 311, 14);
		panel_1.add(p0100PhysicalRestraintsLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 29, 840, 45);
		panel.add(panel_5);

		final JLabel physicalRestraintsLabel = new JLabel();
		physicalRestraintsLabel
				.setText("<html><body> Physical restraints are any manual method or physical or mechanical device, material or equipment attached or adjacent to the resident's body that <br> the individual cannot remove easily which restricts freedom of movement or normal access to one's body");
		physicalRestraintsLabel.setBounds(0, 2, 830, 38);
		panel_5.add(physicalRestraintsLabel);

		final JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 74, 380, 347);
		panel.add(panel_6);

		final JLabel codingLabel = new JLabel();
		codingLabel
				.setText("<html><body><b> Coding : </b> <br>&nbsp &nbsp 0. &nbsp<b> Not Used </b> <br> &nbsp &nbsp 1. &nbsp <b> Used Less than daily </b> <br> &nbsp &nbsp 2. &nbsp <b> Used daily </b>");
		codingLabel.setBounds(26, 149, 172, 92);
		panel_6.add(codingLabel);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		panel_7.setBounds(380, 74, 460, 347);
		panel.add(panel_7);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 0, 460, 25);
		panel_7.add(panel_8);

		final JLabel enterCodesInLabel = new JLabel();
		enterCodesInLabel.setFont(new Font("Arial", Font.BOLD, 12));
		enterCodesInLabel.setText("Enter Codes in Boxes");
		enterCodesInLabel.setBounds(35, 4, 178, 14);
		panel_8.add(enterCodesInLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 25, 460, 161);
		panel_7.add(panel_9);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_10.setBounds(0, 0, 61, 161);
		panel_9.add(panel_10);

		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));
		comboBox_1.setBounds(10, 64, 43, 20);
		panel_10.add(comboBox_1);

		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "0", "1",
				"2" }));
		comboBox.setBounds(10, 25, 43, 20);
		panel_10.add(comboBox);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));
		comboBox_2.setBounds(10, 97, 43, 20);
		panel_10.add(comboBox_2);

		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));
		comboBox_3.setBounds(10, 130, 43, 20);
		panel_10.add(comboBox_3);

		final JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_11.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_11.setBounds(60, 0, 400, 21);
		panel_9.add(panel_11);

		final JLabel usedInBedLabel = new JLabel();
		usedInBedLabel.setFont(new Font("Arial", Font.BOLD, 12));
		usedInBedLabel.setText("Used in Bed");
		usedInBedLabel.setBounds(10, 4, 196, 14);
		panel_11.add(usedInBedLabel);

		final JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(60, 20, 400, 36);
		panel_9.add(panel_12);

		final JLabel aBedRailLabel = new JLabel();
		aBedRailLabel.setFont(new Font("Arial", Font.BOLD, 12));
		aBedRailLabel.setText("A.  Bed rail");
		aBedRailLabel.setBounds(10, 10, 113, 14);
		panel_12.add(aBedRailLabel);

		final JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(60, 55, 400, 36);
		panel_9.add(panel_13);

		final JLabel bTrunkRestraintLabel = new JLabel();
		bTrunkRestraintLabel.setFont(new Font("Arial", Font.BOLD, 12));
		bTrunkRestraintLabel.setText("B.  Trunk restraint");
		bTrunkRestraintLabel.setBounds(10, 10, 139, 14);
		panel_13.add(bTrunkRestraintLabel);

		final JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_14.setLayout(null);
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(60, 90, 400, 36);
		panel_9.add(panel_14);

		final JLabel cLimbRestraintLabel = new JLabel();
		cLimbRestraintLabel.setFont(new Font("Arial", Font.BOLD, 12));
		cLimbRestraintLabel.setText("C.  Limb restraint");
		cLimbRestraintLabel.setBounds(10, 10, 135, 16);
		panel_14.add(cLimbRestraintLabel);

		final JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(60, 125, 400, 36);
		panel_9.add(panel_15);

		final JLabel dOtherLabel = new JLabel();
		dOtherLabel.setFont(new Font("Arial", Font.BOLD, 12));
		dOtherLabel.setText("D.  Other");
		dOtherLabel.setBounds(10, 10, 86, 14);
		panel_15.add(dOtherLabel);

		final JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_16.setLayout(null);
		panel_16.setBounds(0, 186, 460, 161);
		panel_7.add(panel_16);

		final JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_17.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_17.setBounds(0, 0, 61, 161);
		panel_16.add(panel_17);

		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(10, 31, 43, 20);
		panel_17.add(comboBox_4);

		final JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setBounds(10, 65, 43, 20);
		panel_17.add(comboBox_5);

		final JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));
		comboBox_6.setBounds(10, 100, 43, 20);
		panel_17.add(comboBox_6);

		final JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBackground(Color.WHITE);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1", "2" }));
		comboBox_7.setBounds(10, 130, 43, 20);
		panel_17.add(comboBox_7);

		final JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_18.setLayout(null);
		panel_18.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_18.setBounds(60, 0, 400, 21);
		panel_16.add(panel_18);

		final JLabel usedInChairLabel = new JLabel();
		usedInChairLabel.setFont(new Font("Arial", Font.BOLD, 12));
		usedInChairLabel.setText("Used in chair or Out of Bed");
		usedInChairLabel.setBounds(10, 4, 199, 14);
		panel_18.add(usedInChairLabel);

		final JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_19.setLayout(null);
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(60, 20, 400, 36);
		panel_16.add(panel_19);

		final JLabel eTrunkRestraintLabel = new JLabel();
		eTrunkRestraintLabel.setFont(new Font("Arial", Font.BOLD, 12));
		eTrunkRestraintLabel.setText("E.  Trunk restraint");
		eTrunkRestraintLabel.setBounds(10, 10, 116, 14);
		panel_19.add(eTrunkRestraintLabel);

		final JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_20.setLayout(null);
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(60, 55, 400, 36);
		panel_16.add(panel_20);

		final JLabel fLimbRestraintLabel = new JLabel();
		fLimbRestraintLabel.setFont(new Font("Arial", Font.BOLD, 12));
		fLimbRestraintLabel.setText("F.  Limb restraint");
		fLimbRestraintLabel.setBounds(10, 10, 116, 14);
		panel_20.add(fLimbRestraintLabel);

		final JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(60, 90, 400, 36);
		panel_16.add(panel_21);

		final JLabel gChairPreventsLabel = new JLabel();
		gChairPreventsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		gChairPreventsLabel.setText("G.  Chair prevents rising");
		gChairPreventsLabel.setBounds(10, 10, 164, 14);
		panel_21.add(gChairPreventsLabel);

		final JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.WHITE);
		panel_22.setLayout(null);
		panel_22.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_22.setBounds(60, 125, 400, 36);
		panel_16.add(panel_22);

		final JLabel hOtherLabel = new JLabel();
		hOtherLabel.setFont(new Font("Arial", Font.BOLD, 12));
		hOtherLabel.setText("H.  Other");
		hOtherLabel.setBounds(10, 10, 54, 14);
		panel_22.add(hOtherLabel);

	}

}
