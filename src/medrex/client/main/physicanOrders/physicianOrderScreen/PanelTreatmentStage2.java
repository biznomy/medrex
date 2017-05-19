package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import medrex.client.utils.SwingUtils;
import medrex.commons.dataObj.physicianOrders.Stage2;
import medrex.commons.enums.ColorConstants;

public class PanelTreatmentStage2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2502708393730078969L;
	private JRadioButton rbCdd;
	private JRadioButton rbCovrsite;
	private ButtonGroup bgDays = new ButtonGroup();
	private JLabel lLocation;
	private JTextField txtLocation;
	private JCheckBox cbApplyNoSting;
	private JCheckBox cbCleanseArea;
	private JCheckBox cbHydrocolloid;
	private JCheckBox cbFoamDressing;
	private JCheckBox cbDaysAndPrn;
	private Stage2 stage2;
	private JCheckBox cbHydrogel;

	public PanelTreatmentStage2() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(535, 145));
		setLayout(null);

		final JPanel panel_stage2 = new JPanel();
		panel_stage2.setPreferredSize(new Dimension(535, 145));
		panel_stage2.setBackground(Color.WHITE);
		panel_stage2.setLayout(null);
		panel_stage2.setBounds(0, 0, 535, 145);
		add(panel_stage2);

		lLocation = new JLabel();
		lLocation.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lLocation.setForeground(ColorConstants.DEF_COLOR);
		lLocation.setText("LOCATION");
		lLocation.setBounds(10, 10, 54, 14);
		panel_stage2.add(lLocation);

		txtLocation = new JTextField();
		txtLocation.setBounds(72, 7, 123, 21);
		panel_stage2.add(txtLocation);

		final JLabel periWoundArea = new JLabel();
		periWoundArea.setFont(new Font("Tahoma", Font.PLAIN, 10));
		periWoundArea.setForeground(ColorConstants.DEF_COLOR);
		periWoundArea.setText("Peri Wound Area : ");
		periWoundArea.setBounds(10, 30, 98, 14);
		panel_stage2.add(periWoundArea);

		cbApplyNoSting = new JCheckBox();
		cbApplyNoSting.setForeground(ColorConstants.DEF_COLOR);
		cbApplyNoSting.setBackground(Color.WHITE);
		cbApplyNoSting.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbApplyNoSting.setText("Apply No Sting Skin Prep daily");
		cbApplyNoSting.setBounds(133, 28, 198, 18);
		panel_stage2.add(cbApplyNoSting);

		cbCleanseArea = new JCheckBox();
		cbCleanseArea.setForeground(ColorConstants.DEF_COLOR);
		cbCleanseArea.setBackground(Color.WHITE);
		cbCleanseArea.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbCleanseArea
				.setText("Cleanse area with normal saline for each dsg. daily");
		cbCleanseArea.setBounds(10, 50, 253, 18);
		panel_stage2.add(cbCleanseArea);

		final JLabel continentResidentsLabel = new JLabel();
		continentResidentsLabel.setForeground(ColorConstants.DEF_COLOR);
		continentResidentsLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		continentResidentsLabel.setBackground(Color.WHITE);
		continentResidentsLabel.setText("Granulating Tissue : ");
		continentResidentsLabel.setBounds(10, 91, 98, 14);
		panel_stage2.add(continentResidentsLabel);

		cbHydrocolloid = new JCheckBox();
		cbHydrocolloid.setForeground(ColorConstants.DEF_COLOR);
		cbHydrocolloid.setBackground(Color.WHITE);
		cbHydrocolloid.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbHydrocolloid
				.setText("Hydrocolloid ( wounds with scant to small drainage)");
		cbHydrocolloid.setBounds(10, 67, 266, 18);
		panel_stage2.add(cbHydrocolloid);

		cbFoamDressing = new JCheckBox();
		cbFoamDressing.setForeground(ColorConstants.DEF_COLOR);
		cbFoamDressing.setBackground(Color.WHITE);
		cbFoamDressing.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbFoamDressing.setText("Foam Dressing ( small to moderate Drainage )");
		cbFoamDressing.setBounds(282, 67, 253, 18);
		panel_stage2.add(cbFoamDressing);

		cbDaysAndPrn = new JCheckBox();
		cbDaysAndPrn.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				enableComponent();
			}

			private void enableComponent() {
				if (cbDaysAndPrn.isSelected()) {
					rbCovrsite.setEnabled(true);
					rbCdd.setEnabled(true);
				} else {
					rbCovrsite.setEnabled(false);
					rbCdd.setEnabled(false);
				}
			}
		});
		cbDaysAndPrn.setActionCommand("");
		cbDaysAndPrn.setForeground(ColorConstants.DEF_COLOR);
		cbDaysAndPrn.setBackground(Color.WHITE);
		cbDaysAndPrn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbDaysAndPrn.setText("Days and PRN covered with ");
		cbDaysAndPrn.setBounds(110, 111, 174, 18);
		panel_stage2.add(cbDaysAndPrn);

		cbHydrogel = new JCheckBox();
		cbHydrogel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				disableComponent();
			}

			private void disableComponent() {
				if (!cbDaysAndPrn.isSelected()) {
					rbCovrsite.setEnabled(false);
					rbCdd.setEnabled(false);
				}
			}
		});
		cbHydrogel.setForeground(ColorConstants.DEF_COLOR);
		cbHydrogel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbHydrogel.setBackground(Color.WHITE);
		cbHydrogel.setText("Hydrogel");
		cbHydrogel.setBounds(10, 111, 94, 18);
		panel_stage2.add(cbHydrogel);

		rbCovrsite = new JRadioButton();
		rbCovrsite.setForeground(ColorConstants.DEF_COLOR);
		rbCovrsite.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rbCovrsite.setActionCommand("1");
		bgDays.add(rbCovrsite);
		rbCovrsite.setBackground(Color.WHITE);
		rbCovrsite.setText("CovRSite");
		rbCovrsite.setBounds(290, 111, 89, 18);
		panel_stage2.add(rbCovrsite);

		rbCdd = new JRadioButton();
		rbCdd.setForeground(ColorConstants.DEF_COLOR);
		rbCdd.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rbCdd.setActionCommand("2");
		bgDays.add(rbCdd);
		rbCdd.setBackground(Color.WHITE);
		rbCdd.setText("CDD");
		rbCdd.setBounds(385, 111, 70, 18);
		panel_stage2.add(rbCdd);

	}

	public void doSave() {
		Stage2 refStage2 = new Stage2();

		refStage2.setDays(SwingUtils.getSelectedButton(bgDays));
		refStage2.setLocation(txtLocation.getText());
		refStage2.setApplyNoSting(cbApplyNoSting.isSelected());
		refStage2.setCleanseArea(cbCleanseArea.isSelected());
		refStage2.setHydrocolloid(cbHydrocolloid.isSelected());
		refStage2.setFoamDressing(cbFoamDressing.isSelected());
		refStage2.setDaysAndPrn(cbDaysAndPrn.isSelected());
		refStage2.setHydrogel(cbHydrogel.isSelected());

		setStage2(refStage2);

	}

	public Stage2 getStage2() {
		return stage2;
	}

	public void setStage2(Stage2 stage2) {
		this.stage2 = stage2;
	}

	public void doUpdate() {

		SwingUtils.setSelectedButton(bgDays, this.stage2.getDays());
		txtLocation.setText(this.stage2.getLocation());
		cbApplyNoSting.setSelected(this.stage2.isApplyNoSting());
		cbCleanseArea.setSelected(this.stage2.isCleanseArea());
		cbHydrocolloid.setSelected(this.stage2.isHydrocolloid());
		cbFoamDressing.setSelected(this.stage2.isFoamDressing());
		cbDaysAndPrn.setSelected(this.stage2.isDaysAndPrn());
		cbHydrogel.setSelected(this.stage2.isHydrogel());

	}

}
