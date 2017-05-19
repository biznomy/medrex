package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.TreatmentPRNRecordFormRow;

import com.toedter.calendar.JDateChooser;

public class PanelTreatmentPRNRecordFormRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8330235555724187805L;
	private JDateChooser dcDate;
	private JPanel panelCols;
	private JPanel panel_15;
	private JPanel panel_14;
	private JPanel panel_13;
	private JPanel panel_12;
	private JPanel panel_9;
	private JPanel panel_10;
	private JTextArea txtPRNTreatment;
	private JPanel panel_6;
	private JDateChooser orderDate;
	private JLabel facilityNameLabel_3;
	private JPanel panel_8;
	private JLabel facilityNameLabel_2;
	private JPanel panel_7;
	private JPanel panel_5;
	private JPanel panel_4;

	PanelTreatmentPRNRecordFormCol panelPRNCols[];
	/**
	 * Create the panel
	 */

	int serial;
	int key;

	public PanelTreatmentPRNRecordFormRow(int num) {
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

		txtPRNTreatment = new JTextArea();
		txtPRNTreatment.setLineWrap(true);
		txtPRNTreatment.setBounds(10, 10, 182, 78);
		panel_6.add(txtPRNTreatment);

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

		final JLabel hourLabel = new JLabel();
		hourLabel.setForeground(new Color(192, 192, 192));
		hourLabel.setText("HOUR");
		hourLabel.setBounds(37, 0, 66, 16);
		panel_9.add(hourLabel);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(new Color(230, 230, 250));
		panel_12.setBounds(0, 19, 150, 20);
		panel_10.add(panel_12);

		final JLabel hourLabel_1 = new JLabel();
		hourLabel_1.setForeground(new Color(192, 192, 192));
		hourLabel_1.setText("INITIAL");
		hourLabel_1.setBounds(36, 0, 66, 16);
		panel_12.add(hourLabel_1);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(new Color(230, 230, 250));
		panel_13.setBounds(0, 38, 150, 20);
		panel_10.add(panel_13);

		final JLabel hourLabel_2 = new JLabel();
		hourLabel_2.setForeground(new Color(192, 192, 192));
		hourLabel_2.setText("HOUR");
		hourLabel_2.setBounds(39, 0, 66, 16);
		panel_13.add(hourLabel_2);

		panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, false));
		panel_14.setLayout(null);
		panel_14.setBackground(new Color(230, 230, 250));
		panel_14.setBounds(0, 57, 150, 20);
		panel_10.add(panel_14);

		final JLabel hourLabel_1_1 = new JLabel();
		hourLabel_1_1.setForeground(new Color(192, 192, 192));
		hourLabel_1_1.setText("INITIAL");
		hourLabel_1_1.setBounds(36, 0, 66, 16);
		panel_14.add(hourLabel_1_1);

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

		panelPRNCols = new PanelTreatmentPRNRecordFormCol[31];

		for (i = 0; i < 31; i++) {
			panelPRNCols[i] = new PanelTreatmentPRNRecordFormCol(num, i);
			panelPRNCols[i].setBounds((i * 32), 0, 33, 118);
			panelCols.add(panelPRNCols[i]);
		}

		updateData();
	}

	public void updateData() {
		if (Global.currentTreatmentPRNRecordFormKey == 0) {
			key = 0;
			txtPRNTreatment.setText("");
			orderDate.setDate(null);
			dcDate.setDate(null);

		} else {
			TreatmentPRNRecordFormRow mprfr = null;
			try {
				mprfr = MedrexClientManager
						.getInstance()
						.getTreatmentPRNRecordFormRow(
								Global.currentTreatmentPRNRecordFormKey, serial);

			} catch (Exception e) {

			}

			key = mprfr.getSerial();

			txtPRNTreatment.setText(mprfr.getTreatmentPRN());
			orderDate.setDate(mprfr.getOrderDate());
			dcDate.setDate(mprfr.getDcDate());
		}

		for (int i = 0; i < 31; i++) {
			panelPRNCols[i].updateData();
		}

	}

	public void doSave() {
		TreatmentPRNRecordFormRow mprfr = new TreatmentPRNRecordFormRow();

		mprfr.setSerial(key);
		mprfr
				.setTreatmentPRNRecordFormSerial(Global.currentTreatmentPRNRecordFormKey);
		mprfr.setTreatmentPRNRecordFormRowSerial(serial);

		mprfr.setOrderDate(orderDate.getDate());
		mprfr.setDcDate(dcDate.getDate());
		mprfr.setTreatmentPRN(txtPRNTreatment.getText());

		try {
			/* Global.currentTreatmentPRNRecordFormKey = */MedrexClientManager
					.getInstance().insertOrUpdateTreatmentPRNRecordFormRow(
							mprfr);
		} catch (Exception e) {

		}

		for (int i = 0; i < 31; i++) {
			panelPRNCols[i].doSave();
		}

	}

}
