package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.commons.dataObj.physicianOrders.Fungal;
import medrex.commons.enums.ColorConstants;

public class PanelSkinInfectionFungal extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2158928523590875614L;
	private JCheckBox cbCleanse;
	private JTextField txtAntifungal;
	private Fungal fungal;

	public PanelSkinInfectionFungal() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);

		final JPanel panel_fungal = new JPanel();
		panel_fungal.setBackground(Color.WHITE);
		panel_fungal.setLayout(null);
		panel_fungal.setOpaque(false);
		panel_fungal.setBounds(0, 0, 533, 128);
		add(panel_fungal);

		cbCleanse = new JCheckBox();
		cbCleanse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbCleanse.setForeground(ColorConstants.DEF_COLOR);
		cbCleanse.setBackground(Color.WHITE);
		cbCleanse.setText("Cleanse affected area with wound Cleanser.");
		cbCleanse.setBounds(0, 60, 232, 18);
		panel_fungal.add(cbCleanse);

		final JLabel gentlyPatDryLabel = new JLabel();
		gentlyPatDryLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gentlyPatDryLabel.setForeground(ColorConstants.DEF_COLOR);
		gentlyPatDryLabel.setText("Gently pat dry. Apply a thin layer of");
		gentlyPatDryLabel.setBounds(238, 62, 179, 14);
		panel_fungal.add(gentlyPatDryLabel);

		txtAntifungal = new JTextField();
		txtAntifungal.setBounds(423, 59, 79, 21);
		panel_fungal.add(txtAntifungal);

		final JLabel antifungalCreamcontainingLabel = new JLabel();
		antifungalCreamcontainingLabel
				.setText("Antifungal Cream (containing miconozole nitrate 2%) twice daily to the affected area for 14 days ");
		antifungalCreamcontainingLabel.setForeground(ColorConstants.DEF_COLOR);
		antifungalCreamcontainingLabel.setBounds(0, 84, 490, 14);
		panel_fungal.add(antifungalCreamcontainingLabel);

		final JLabel andReEvalLabel = new JLabel();
		andReEvalLabel.setText("and RE EVAL");
		andReEvalLabel.setForeground(ColorConstants.DEF_COLOR);
		andReEvalLabel.setBounds(0, 104, 145, 14);
		panel_fungal.add(andReEvalLabel);

		final JLabel skinCareOrdersLabel = new JLabel();
		skinCareOrdersLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		skinCareOrdersLabel.setForeground(ColorConstants.DEF_COLOR);
		skinCareOrdersLabel
				.setText("SKIN CARE ORDERS FOR PATIENTS/RESIDENTS WITH FUNGAL/YEAST INFECTION");
		skinCareOrdersLabel.setBounds(51, 10, 414, 30);
		panel_fungal.add(skinCareOrdersLabel);
	}

	public void doSave() {
		Fungal refFungal = new Fungal();

		refFungal.setAntifungal(txtAntifungal.getText());
		refFungal.setCleanse(cbCleanse.isSelected());

		setFungal(refFungal);

	}

	public void doUpdate() {

		txtAntifungal.setText(this.fungal.getAntifungal());
		cbCleanse.setSelected(this.fungal.isCleanse());

	}

	public Fungal getFungal() {
		return fungal;
	}

	public void setFungal(Fungal fungal) {
		this.fungal = fungal;
	}

}
