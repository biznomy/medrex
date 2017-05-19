package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.commons.dataObj.physicianOrders.Stage1;
import medrex.commons.enums.ColorConstants;

public class PanelTreatmentStage1 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6516987348246425071L;
	private JLabel lLocation;
	private JTextField txtLocation;
	private JCheckBox cbApplyProtective;
	private JCheckBox cbSkinSealants;
	private JCheckBox cbHydrocolloid;
	private JCheckBox cbDays;
	private JCheckBox cbFoamDressing;
	private JCheckBox cbProtectiveBarrier;
	private JCheckBox cbOther;
	private Stage1 stage1;

	public PanelTreatmentStage1() {
		super();
		setPreferredSize(new Dimension(535, 145));
		setLayout(null);

		final JPanel panel_stage1 = new JPanel();
		panel_stage1.setPreferredSize(new Dimension(535, 145));
		panel_stage1.setBackground(Color.WHITE);
		panel_stage1.setLayout(null);
		panel_stage1.setBounds(0, 0, 551, 145);
		add(panel_stage1);

		lLocation = new JLabel();
		lLocation.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lLocation.setForeground(ColorConstants.DEF_COLOR);
		lLocation.setText("LOCATION");
		lLocation.setBounds(10, 10, 54, 14);
		panel_stage1.add(lLocation);

		txtLocation = new JTextField();
		txtLocation.setBounds(72, 7, 123, 21);
		panel_stage1.add(txtLocation);

		final JLabel incontinentResidentsLabel = new JLabel();
		incontinentResidentsLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		incontinentResidentsLabel.setForeground(ColorConstants.DEF_COLOR);
		incontinentResidentsLabel.setText("INCONTINENT RESIDENTS");
		incontinentResidentsLabel.setBounds(10, 30, 150, 14);
		panel_stage1.add(incontinentResidentsLabel);

		cbApplyProtective = new JCheckBox();
		cbApplyProtective.setForeground(ColorConstants.DEF_COLOR);
		cbApplyProtective.setBackground(Color.WHITE);
		cbApplyProtective.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbApplyProtective
				.setText("Apply Protective Barrier Cream every shift and after each episode of incontinence ");
		cbApplyProtective.setBounds(0, 50, 412, 18);
		panel_stage1.add(cbApplyProtective);

		cbSkinSealants = new JCheckBox();
		cbSkinSealants.setForeground(ColorConstants.DEF_COLOR);
		cbSkinSealants.setBackground(Color.WHITE);
		cbSkinSealants.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbSkinSealants.setText("Skin Sealants (Barrier film) daily");
		cbSkinSealants.setBounds(0, 66, 195, 18);
		panel_stage1.add(cbSkinSealants);

		final JLabel continentResidentsLabel = new JLabel();
		continentResidentsLabel.setForeground(ColorConstants.DEF_COLOR);
		continentResidentsLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		continentResidentsLabel.setBackground(Color.WHITE);
		continentResidentsLabel.setText("CONTINENT RESIDENTS");
		continentResidentsLabel.setBounds(10, 90, 150, 14);
		panel_stage1.add(continentResidentsLabel);

		cbHydrocolloid = new JCheckBox();
		cbHydrocolloid.setForeground(ColorConstants.DEF_COLOR);
		cbHydrocolloid.setBackground(Color.WHITE);
		cbHydrocolloid.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbHydrocolloid.setText("Hydrocolloid dressing-change weekly");
		cbHydrocolloid.setBounds(0, 110, 195, 18);
		panel_stage1.add(cbHydrocolloid);

		cbDays = new JCheckBox();
		cbDays.setForeground(ColorConstants.DEF_COLOR);
		cbDays.setBackground(Color.WHITE);
		cbDays.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbDays.setText("Days");
		cbDays.setBounds(195, 110, 47, 18);
		panel_stage1.add(cbDays);

		cbFoamDressing = new JCheckBox();

		cbFoamDressing.setForeground(ColorConstants.DEF_COLOR);
		cbFoamDressing.setBackground(Color.WHITE);
		cbFoamDressing.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbFoamDressing.setText("Foam Dressing");
		cbFoamDressing.setBounds(242, 110, 92, 18);
		panel_stage1.add(cbFoamDressing);

		cbProtectiveBarrier = new JCheckBox();
		cbProtectiveBarrier.setForeground(ColorConstants.DEF_COLOR);
		cbProtectiveBarrier.setBackground(Color.WHITE);
		cbProtectiveBarrier.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbProtectiveBarrier.setText("Protective Barrier(Same as above)");
		cbProtectiveBarrier.setBounds(334, 110, 186, 18);
		panel_stage1.add(cbProtectiveBarrier);

		cbOther = new JCheckBox();
		cbOther.setForeground(ColorConstants.DEF_COLOR);
		cbOther.setBackground(Color.WHITE);
		cbOther.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cbOther.setText("Other");
		cbOther.setBounds(201, 66, 186, 18);
		panel_stage1.add(cbOther);

	}

	public void doSave() {
		// data object representing stage 1

		Stage1 refStage1 = new Stage1();

		refStage1.setLocation(txtLocation.getText());
		refStage1.setApplyProtective(cbApplyProtective.isSelected());
		refStage1.setSkinSealants(cbSkinSealants.isSelected());
		refStage1.setHydrocolloid(cbHydrocolloid.isSelected());
		refStage1.setDays(cbDays.isSelected());
		refStage1.setFoamDressing(cbFoamDressing.isSelected());
		refStage1.setProtectiveBarrier(cbProtectiveBarrier.isSelected());
		refStage1.setOther(cbOther.isSelected());

		setStage1(refStage1);

	}

	public void doUpdate() {

		txtLocation.setText(this.stage1.getLocation());
		cbApplyProtective.setSelected(this.stage1.isApplyProtective());
		cbSkinSealants.setSelected(this.stage1.isSkinSealants());
		cbHydrocolloid.setSelected(this.stage1.isHydrocolloid());
		cbDays.setSelected(this.stage1.isDays());
		cbFoamDressing.setSelected(this.stage1.isFoamDressing());
		cbProtectiveBarrier.setSelected(this.stage1.isProtectiveBarrier());
		cbOther.setSelected(this.stage1.isOther());
	}

	public Stage1 getStage1() {
		return stage1;
	}

	public void setStage1(Stage1 stage1) {
		this.stage1 = stage1;
	}

}
