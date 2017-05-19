package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.MedicationPRNRecordFormRow;

import com.toedter.calendar.JDateChooser;

public class PanelMedicationPRNRecordFormRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2482817901093808729L;
	private JPanel panelCols;
	private JLabel dateLabel_4;
	private JPanel panel_15;
	private JLabel dateLabel_3;
	private JPanel panel_14;
	private JLabel dateLabel_2;
	private JPanel panel_13;
	private JLabel dateLabel_1;
	private JPanel panel_12;
	private JLabel dateLabel;
	private JPanel panel_9;
	private JPanel panel_10;
	private JTextArea txtPRNMedications;
	private JPanel panel_6;
	private JDateChooser dateChooser;
	private JLabel facilityNameLabel_3;
	private JPanel panel_8;
	private JTextField txtRxNumber;
	private JLabel facilityNameLabel_2;
	private JPanel panel_7;
	private JPanel panel_5;
	private JPanel panel_4;

	PanelMedicationPRNRecordFormCol panelPRNCols[];
	/**
	 * Create the panel
	 */

	int serial;
	int key;

	public PanelMedicationPRNRecordFormRow(int num) {
		super();
		setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		setSize(1200, 950);
		// Global.panelNurseMedicationNotes = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1489, 123));
		setLayout(null);

		panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 1489, 123);
		add(panel_4);
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 149, 120);
		panel_4.add(panel_5);

		panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(1, 0, 138, 51);
		panel_5.add(panel_7);

		facilityNameLabel_2 = new JLabel();
		facilityNameLabel_2.setForeground(new Color(128, 0, 0));
		facilityNameLabel_2.setText("Rx Number");
		facilityNameLabel_2.setBounds(10, 0, 88, 17);
		panel_7.add(facilityNameLabel_2);

		txtRxNumber = new JTextField();
		txtRxNumber.setBackground(Color.WHITE);
		txtRxNumber.setBounds(10, 23, 118, 21);
		panel_7.add(txtRxNumber);

		panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(1, 59, 138, 51);
		panel_5.add(panel_8);

		facilityNameLabel_3 = new JLabel();
		facilityNameLabel_3.setForeground(new Color(128, 0, 0));
		facilityNameLabel_3.setText("Order Date");
		facilityNameLabel_3.setBounds(10, 0, 88, 17);
		panel_8.add(facilityNameLabel_3);

		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("MM/dd/yyyy");
		dateChooser.setBounds(10, 23, 118, 21);
		panel_8.add(dateChooser);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(148, 0, 202, 120);
		panel_4.add(panel_6);

		txtPRNMedications = new JTextArea();
		txtPRNMedications.setLineWrap(true);
		txtPRNMedications.setBounds(10, 10, 182, 100);
		panel_6.add(txtPRNMedications);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(348, 0, 1139, 120);
		panel_4.add(panel_10);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 0, 150, 20);
		panel_10.add(panel_9);

		dateLabel = new JLabel();
		dateLabel.setForeground(new Color(0, 128, 0));
		dateLabel.setText("DATE");
		dateLabel.setBounds(26, 0, 67, 17);
		panel_9.add(dateLabel);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(new Color(255, 235, 205));
		panel_12.setBounds(0, 19, 150, 20);
		panel_10.add(panel_12);

		dateLabel_1 = new JLabel();
		dateLabel_1.setForeground(new Color(0, 128, 0));
		dateLabel_1.setText("HOUR");
		dateLabel_1.setBounds(26, 0, 67, 17);
		panel_12.add(dateLabel_1);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(0, 38, 150, 20);
		panel_10.add(panel_13);

		dateLabel_2 = new JLabel();
		dateLabel_2.setForeground(new Color(0, 128, 0));
		dateLabel_2.setText("INITIAL");
		dateLabel_2.setBounds(26, 0, 67, 17);
		panel_13.add(dateLabel_2);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(new Color(255, 239, 213));
		panel_14.setBounds(0, 57, 150, 20);
		panel_10.add(panel_14);

		dateLabel_3 = new JLabel();
		dateLabel_3.setForeground(new Color(0, 128, 0));
		dateLabel_3.setText("RESULT");
		dateLabel_3.setBounds(26, 0, 67, 17);
		panel_14.add(dateLabel_3);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_15.setLayout(null);
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(0, 76, 150, 20);
		panel_10.add(panel_15);

		dateLabel_4 = new JLabel();
		dateLabel_4.setForeground(new Color(0, 128, 0));
		dateLabel_4.setText("OBSERV.");
		dateLabel_4.setBounds(26, 0, 67, 17);
		panel_15.add(dateLabel_4);

		panelCols = new JPanel();
		panelCols.setBackground(Color.WHITE);
		panelCols.setLayout(null);
		panelCols.setBounds(156, 0, 983, 120);
		panel_10.add(panelCols);

		serial = num;
		int i;

		panelPRNCols = new PanelMedicationPRNRecordFormCol[31];

		for (i = 0; i < 31; i++) {
			panelPRNCols[i] = new PanelMedicationPRNRecordFormCol(num, i);
			panelPRNCols[i].setBounds((i * 32), 0, 33, 118);
			panelCols.add(panelPRNCols[i]);
		}

		updateData();
	}

	public void updateData() {
		if (Global.currentMedicationPRNRecordFormKey == 0) {
			key = 0;
			txtPRNMedications.setText("");
			txtRxNumber.setText("");
			dateChooser.setDate(null);

		} else {
			MedicationPRNRecordFormRow mprfr = null;
			try {
				mprfr = MedrexClientManager.getInstance()
						.getMedicationPRNRecordFormRow(
								Global.currentMedicationPRNRecordFormKey,
								serial);

			} catch (Exception e) {

			}

			key = mprfr.getSerial();
			txtRxNumber.setText(mprfr.getRxNumber());
			txtPRNMedications.setText(mprfr.getMedicationPRN());
			dateChooser.setDate(mprfr.getOrderDate());

		}

		for (int i = 0; i < 31; i++) {
			panelPRNCols[i].updateData();
		}

	}

	public void doSave() {
		MedicationPRNRecordFormRow mprfr = new MedicationPRNRecordFormRow();

		mprfr.setSerial(key);
		mprfr
				.setMedicationPRNRecordFormSerial(Global.currentMedicationPRNRecordFormKey);
		mprfr.setMedicationPRNRecordFormRowSerial(serial);

		mprfr.setOrderDate(dateChooser.getDate());
		mprfr.setRxNumber(txtRxNumber.getText());
		mprfr.setMedicationPRN(txtPRNMedications.getText());

		try {
			/* Global.currentMedicationPRNRecordFormKey = */MedrexClientManager
					.getInstance().insertOrUpdateMedicationPRNRecordFormRow(
							mprfr);
		} catch (Exception e) {

		}

		for (int i = 0; i < 31; i++) {
			panelPRNCols[i].doSave();
		}

	}

}
