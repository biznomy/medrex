package medrex.client.main.physicanOrders;

import static medrex.client.main.physicanOrders.PanelPhysicianOrderForm2.FormColor;
import static medrex.client.main.physicanOrders.PanelPhysicianOrderForm2.FormColor2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm2Row;

public class PanelPhysicianOrderForm2Row extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6164411224430365771L;
	private JTextArea txtDiagnosis;
	private JLabel diagnosisLabel;
	private JPanel panel;
	private JTextField txtPrnIndicator;
	private JLabel prnIndicatorLabel;
	private JTextField txtPhyFrequency;
	private JLabel frequencyLabel;
	private JTextField txtPhyRoute;
	private JLabel routeLabel;
	private JTextField txtPhyDosage;
	private JLabel dosageLabel;
	private JTextField txtPhyMedication;
	private JLabel medicationLabel;
	private JPanel panel_2;

	int serial;
	int key;

	/**
	 * Create the panel
	 */
	public PanelPhysicianOrderForm2Row(int num) {
		super();
		serial = num;
		setBorder(new LineBorder(FormColor, 1, false));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(305, 161));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(FormColor, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 305, 81);
		add(panel_2);

		medicationLabel = new JLabel();
		medicationLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		medicationLabel.setText("MEDICATION:");
		medicationLabel.setBounds(3, 5, 77, 14);
		panel_2.add(medicationLabel);

		txtPhyMedication = new JTextField();
		txtPhyMedication.setBounds(81, 3, 222, 18);
		panel_2.add(txtPhyMedication);

		dosageLabel = new JLabel();
		dosageLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		dosageLabel.setText("DOSAGE:");
		dosageLabel.setBounds(3, 24, 49, 14);
		panel_2.add(dosageLabel);

		txtPhyDosage = new JTextField();
		txtPhyDosage.setBounds(52, 22, 87, 18);
		panel_2.add(txtPhyDosage);

		routeLabel = new JLabel();
		routeLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		routeLabel.setText("ROUTE:");
		routeLabel.setBounds(145, 24, 42, 14);
		panel_2.add(routeLabel);

		txtPhyRoute = new JTextField();
		txtPhyRoute.setBounds(189, 22, 114, 18);
		panel_2.add(txtPhyRoute);

		frequencyLabel = new JLabel();
		frequencyLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		frequencyLabel.setText("FREQUENCY:");
		frequencyLabel.setBounds(3, 43, 70, 14);
		panel_2.add(frequencyLabel);

		txtPhyFrequency = new JTextField();
		txtPhyFrequency.setBounds(75, 41, 228, 18);
		panel_2.add(txtPhyFrequency);

		prnIndicatorLabel = new JLabel();
		prnIndicatorLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		prnIndicatorLabel.setText("PRN INDICATOR:");
		prnIndicatorLabel.setBounds(3, 62, 98, 14);
		panel_2.add(prnIndicatorLabel);

		txtPrnIndicator = new JTextField();
		txtPrnIndicator.setBounds(103, 60, 200, 18);
		panel_2.add(txtPrnIndicator);

		panel = new JPanel();
		panel.setBackground(FormColor2);
		panel.setBorder(new LineBorder(FormColor, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 80, 305, 81);
		add(panel);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		diagnosisLabel.setText("DIAGNOSIS:");
		diagnosisLabel.setBounds(3, 3, 70, 14);
		panel.add(diagnosisLabel);

		txtDiagnosis = new JTextArea();
		txtDiagnosis.setForeground(Color.WHITE);
		txtDiagnosis.setBackground(FormColor2);
		txtDiagnosis.setBounds(3, 20, 299, 58);
		panel.add(txtDiagnosis);
		fillCombos();
		updateData();
	}

	public void fillCombos() {

	}

	public void updateData() {

		if (Global.currentPhysicianOrderForm2Key == 0) {
			key = 0;
			txtDiagnosis.setText("");
			txtPrnIndicator.setText("");
			txtPhyFrequency.setText("");
			txtPhyRoute.setText("");
			txtPhyDosage.setText("");
			txtPhyMedication.setText("");

		} else {

			PhysicianOrderForm2Row refPhysicianOrderForm2Row = null;

			try {
				refPhysicianOrderForm2Row = MedrexClientManager.getInstance()
						.getPhysicianOrderForm2Row(
								Global.currentPhysicianOrderForm2Key, serial);
			} catch (Exception e) {

			}
			key = refPhysicianOrderForm2Row.getSerial();
			txtDiagnosis.setText(refPhysicianOrderForm2Row.getDiagnosis());
			txtPrnIndicator
					.setText(refPhysicianOrderForm2Row.getPrnIndicator());
			txtPhyFrequency
					.setText(refPhysicianOrderForm2Row.getPhyFrequency());
			txtPhyRoute.setText(refPhysicianOrderForm2Row.getPhyRoute());
			txtPhyDosage.setText(refPhysicianOrderForm2Row.getPhyDosage());
			txtPhyMedication.setText(refPhysicianOrderForm2Row
					.getPhyMedication());
		}
	}

	public void doSave() {

		PhysicianOrderForm2Row refPhysicianOrderForm2Row = new PhysicianOrderForm2Row();
		refPhysicianOrderForm2Row.setSerial(key);
		refPhysicianOrderForm2Row
				.setPhysicianOrderForm2Serial(Global.currentPhysicianOrderForm2Key);
		refPhysicianOrderForm2Row.setPhysicianOrderForm2RowSerial(serial);

		refPhysicianOrderForm2Row.setDiagnosis(txtDiagnosis.getText());
		refPhysicianOrderForm2Row.setPrnIndicator(txtPrnIndicator.getText());
		refPhysicianOrderForm2Row.setPhyFrequency(txtPhyFrequency.getText());
		refPhysicianOrderForm2Row.setPhyRoute(txtPhyRoute.getText());
		refPhysicianOrderForm2Row.setPhyDosage(txtPhyDosage.getText());
		refPhysicianOrderForm2Row.setPhyMedication(txtPhyMedication.getText());

		try {
			Global.currentPhysicianOrderForm2RowKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderForm2Row(
							refPhysicianOrderForm2Row);
		} catch (Exception e) {
		}
	}

}
