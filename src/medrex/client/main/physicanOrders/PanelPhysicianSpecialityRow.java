package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.physicianOrders.PhysicianSpecialityRow;

import com.toedter.calendar.JDateChooser;

public class PanelPhysicianSpecialityRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5799275823923685313L;
	private JTextField txtMedicationOrders;
	private JPanel panel_3;
	private JTextField txtMedicationTime;
	private JPanel panel_2;
	private JDateChooser dcMedicationDate;
	private JPanel panel_1;

	int serial;
	int key;

	/**
	 * Create the panel
	 */
	public PanelPhysicianSpecialityRow(int num) {
		super();
		serial = num;
		setBorder(new LineBorder(Color.black, 1, false));
		setPreferredSize(new Dimension(760, 22));
		setLayout(null);

		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(null);
		setBackground(Color.WHITE);
		// setBounds(20, 0, 760, 22);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 75, 22);
		add(panel_1);

		dcMedicationDate = new JDateChooser();
		dcMedicationDate.setDateFormatString("MM/dd/yyyy");
		dcMedicationDate.setBounds(2, 1, 73, 20);
		panel_1.add(dcMedicationDate);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(74, 0, 75, 22);
		add(panel_2);

		txtMedicationTime = new JTextField();
		txtMedicationTime.setBorder(new LineBorder(Color.WHITE, 1, false));
		txtMedicationTime.setBounds(2, 1, 71, 20);
		panel_2.add(txtMedicationTime);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(148, 0, 612, 22);
		add(panel_3);

		txtMedicationOrders = new JTextField();
		txtMedicationOrders.setBorder(new LineBorder(Color.WHITE, 1, false));
		txtMedicationOrders.setBounds(2, 1, 608, 20);
		panel_3.add(txtMedicationOrders);

		fillCombos();
		updateData();
	}

	public void fillCombos() {

	}

	public void updateData() {
		if (Global.currentPhysicianSpecialityKey == 0) {
			key = 0;
			txtMedicationOrders.setText("");
			txtMedicationTime.setText("");
			dcMedicationDate.setDate(null);

		} else {
			PhysicianSpecialityRow psr = null;

			try {
				psr = MedrexClientManager.getInstance()
						.getPhysicianSpecialityRow(
								Global.currentPhysicianSpecialityKey, serial);
			} catch (Exception e) {

			}
			key = psr.getSerial();
			txtMedicationOrders.setText(psr.getMedicationOrders());
			txtMedicationTime.setText(psr.getMedicationTime());
			dcMedicationDate.setDate(psr.getMedicationDate());

		}

	}

	public void doSave() {
		PhysicianSpecialityRow psr = new PhysicianSpecialityRow();

		psr.setSerial(key);
		psr.setPhysicianSpecialitySerial(Global.currentPhysicianSpecialityKey);
		psr.setPhysicianSpecialityRowSerial(serial);

		psr.setMedicationOrders(txtMedicationOrders.getText());
		psr.setMedicationTime(txtMedicationTime.getText());
		psr.setMedicationDate(dcMedicationDate.getDate());

		try {
			/* Global.currentPhysicianSpecialityKey = */MedrexClientManager
					.getInstance().insertOrUpdatePhysicianSpecialityRow(psr);
		} catch (Exception e) {

		}
	}

}
