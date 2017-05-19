package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.commons.dataObj.physicianOrders.Ulcer;
import medrex.commons.enums.ColorConstants;

public class PanelSkinInfectionUlcer extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3492287189031584116L;
	private JCheckBox cbBarrierFilm;
	private JCheckBox cbHeelLift;
	private JCheckBox cbOffLoad;
	private Ulcer ulcer;

	public PanelSkinInfectionUlcer() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0, 0, 533, 128);
		setOpaque(false);

		final JPanel panel_ulcer = new JPanel();
		panel_ulcer.setBackground(Color.WHITE);
		panel_ulcer.setLayout(null);
		panel_ulcer.setBounds(0, 0, 533, 128);
		panel_ulcer.setOpaque(false);
		add(panel_ulcer);

		final JLabel stableHeelUlcerLabel = new JLabel();
		stableHeelUlcerLabel.setForeground(ColorConstants.DEF_COLOR);
		stableHeelUlcerLabel
				.setText("STABLE HEEL ULCER with protective Eschar");
		stableHeelUlcerLabel.setBounds(145, 10, 260, 29);
		panel_ulcer.add(stableHeelUlcerLabel);

		cbOffLoad = new JCheckBox();
		cbOffLoad.setBackground(Color.WHITE);
		cbOffLoad.setForeground(ColorConstants.DEF_COLOR);
		cbOffLoad.setText("Off Load Heels");
		cbOffLoad.setBounds(10, 55, 102, 18);
		panel_ulcer.add(cbOffLoad);

		cbHeelLift = new JCheckBox();
		cbHeelLift.setBackground(Color.WHITE);
		cbHeelLift.setForeground(ColorConstants.DEF_COLOR);
		cbHeelLift.setText("Heel lift boot");
		cbHeelLift.setBounds(195, 55, 94, 18);
		panel_ulcer.add(cbHeelLift);

		cbBarrierFilm = new JCheckBox();
		cbBarrierFilm.setBackground(Color.WHITE);
		cbBarrierFilm.setForeground(ColorConstants.DEF_COLOR);
		cbBarrierFilm.setText("Barrier film twice daily");
		cbBarrierFilm.setBounds(341, 55, 132, 18);
		panel_ulcer.add(cbBarrierFilm);
	}

	public void doSave() {
		Ulcer refUlcer = new Ulcer();

		refUlcer.setOffLoad(cbOffLoad.isSelected());
		refUlcer.setHeelLift(cbHeelLift.isSelected());
		refUlcer.setBarrierFilm(cbBarrierFilm.isSelected());

		setUlcer(refUlcer);

	}

	public void doUpdate() {

		cbOffLoad.setSelected(this.ulcer.isOffLoad());
		cbHeelLift.setSelected(this.ulcer.isHeelLift());
		cbBarrierFilm.setSelected(this.ulcer.isBarrierFilm());

	}

	public Ulcer getUlcer() {
		return ulcer;
	}

	public void setUlcer(Ulcer ulcer) {
		this.ulcer = ulcer;
	}

}
