package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.TreatmentRoutineRecordFormRow;

import com.toedter.calendar.JDateChooser;

public class PanelTreatmentRoutineRecordFormRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2837219133298624736L;
	private JDateChooser dcDate;
	private JPanel panelCols;
	private JPanel panel_15;
	private JPanel panel_14;
	private JPanel panel_13;
	private JPanel panel_12;
	private JPanel panel_9;
	private JPanel panel_10;
	private JTextArea txtRoutineTreatment;
	private JPanel panel_6;
	private JDateChooser orderDate;
	private JLabel facilityNameLabel_3;
	private JPanel panel_8;
	private JLabel facilityNameLabel_2;
	private JPanel panel_7;
	private JPanel panel_5;
	private JPanel panel_4;

	PanelTreatmentRoutineRecordFormCol panelRoutineCols[];
	/**
	 * Create the panel
	 */

	int serial;
	int key;

	public PanelTreatmentRoutineRecordFormRow(int num) {
		super();
		setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		setSize(1200, 950);
		// Global.panelNurseTreatmentNotes = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1489, 98));
		setLayout(null);

		panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 1489, 98);
		add(panel_4);
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 149, 98);
		panel_4.add(panel_5);

		panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(1, 0, 138, 40);
		panel_5.add(panel_7);

		facilityNameLabel_2 = new JLabel();
		facilityNameLabel_2.setForeground(new Color(192, 192, 192));
		facilityNameLabel_2.setText("DC Date");
		facilityNameLabel_2.setBounds(10, 0, 88, 17);
		panel_7.add(facilityNameLabel_2);

		dcDate = new JDateChooser();
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(10, 16, 118, 21);
		panel_7.add(dcDate);

		panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(1, 42, 138, 51);
		panel_5.add(panel_8);

		facilityNameLabel_3 = new JLabel();
		facilityNameLabel_3.setForeground(new Color(192, 192, 192));
		facilityNameLabel_3.setText("Order Date");
		facilityNameLabel_3.setBounds(10, 0, 88, 17);
		panel_8.add(facilityNameLabel_3);

		orderDate = new JDateChooser();
		orderDate.setDateFormatString("MM/dd/yyyy");
		orderDate.setBounds(10, 16, 118, 21);
		panel_8.add(orderDate);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(148, 0, 202, 98);
		panel_4.add(panel_6);

		txtRoutineTreatment = new JTextArea();
		txtRoutineTreatment.setLineWrap(true);
		txtRoutineTreatment.setBounds(10, 10, 182, 78);
		panel_6.add(txtRoutineTreatment);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(348, 0, 1139, 98);
		panel_4.add(panel_10);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_9.setBackground(new Color(230, 230, 250));
		panel_9.setLayout(null);
		panel_9.setBounds(0, 0, 150, 20);
		panel_10.add(panel_9);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(new Color(230, 230, 250));
		panel_12.setBounds(0, 19, 150, 20);
		panel_10.add(panel_12);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(new Color(230, 230, 250));
		panel_13.setBounds(0, 38, 150, 20);
		panel_10.add(panel_13);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(new Color(230, 230, 250));
		panel_14.setBounds(0, 57, 150, 20);
		panel_10.add(panel_14);

		panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_15.setLayout(null);
		panel_15.setBackground(new Color(230, 230, 250));
		panel_15.setBounds(0, 76, 150, 20);
		panel_10.add(panel_15);

		panelCols = new JPanel();
		panelCols.setBackground(Color.WHITE);
		panelCols.setLayout(null);
		panelCols.setBounds(156, 0, 983, 120);
		panel_10.add(panelCols);

		serial = num;
		int i;

		panelRoutineCols = new PanelTreatmentRoutineRecordFormCol[31];

		for (i = 0; i < 31; i++) {
			panelRoutineCols[i] = new PanelTreatmentRoutineRecordFormCol(num, i);
			panelRoutineCols[i].setBounds((i * 32), 0, 33, 118);
			panelCols.add(panelRoutineCols[i]);
		}

		updateData();
	}

	public void updateData() {
		if (Global.currentTreatmentRoutineRecordFormKey == 0) {
			key = 0;
			txtRoutineTreatment.setText("");
			orderDate.setDate(null);
			dcDate.setDate(null);

		} else {
			TreatmentRoutineRecordFormRow mprfr = null;
			try {
				mprfr = MedrexClientManager.getInstance()
						.getTreatmentRoutineRecordFormRow(
								Global.currentTreatmentRoutineRecordFormKey,
								serial);

			} catch (Exception e) {

			}

			key = mprfr.getSerial();

			txtRoutineTreatment.setText(mprfr.getTreatmentRoutine());
			orderDate.setDate(mprfr.getOrderDate());
			dcDate.setDate(mprfr.getDcDate());
		}

		for (int i = 0; i < 31; i++) {
			panelRoutineCols[i].updateData();
		}

	}

	public void doSave() {
		TreatmentRoutineRecordFormRow mprfr = new TreatmentRoutineRecordFormRow();

		mprfr.setSerial(key);
		mprfr
				.setTreatmentRoutineRecordFormSerial(Global.currentTreatmentRoutineRecordFormKey);
		mprfr.setTreatmentRoutineRecordFormRowSerial(serial);

		mprfr.setOrderDate(orderDate.getDate());
		mprfr.setDcDate(dcDate.getDate());
		mprfr.setTreatmentRoutine(txtRoutineTreatment.getText());

		try {
			/* Global.currentTreatmentRoutineRecordFormKey = */MedrexClientManager
					.getInstance().insertOrUpdateTreatmentRoutineRecordFormRow(
							mprfr);
		} catch (Exception e) {

		}

		for (int i = 0; i < 31; i++) {
			panelRoutineCols[i].doSave();
		}

	}

}
