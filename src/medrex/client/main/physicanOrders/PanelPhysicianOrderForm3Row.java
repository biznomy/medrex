package medrex.client.main.physicanOrders;

import static medrex.client.main.physicanOrders.PanelPhysicianOrderForm3.FormColor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.DateFormat;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;

import com.sX.frameFactory.FrameFactory;
import com.toedter.calendar.JDateChooser;

public class PanelPhysicianOrderForm3Row extends JPanel {
	private JButton button_1;
	public JTextField txtDuplecateDc;
	public JTextField txtDuplicate;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField txtDiagnosis;
	public JLabel diagnosisLabel;
	public JTextField txtPrnIndicator;
	public JLabel prnIndicatorLabel;
	public JTextField txtPhyFrequency;
	public JLabel frequencyLabel;
	public JTextField txtPhyRoute;
	public JLabel routeLabel;
	public JTextField txtPhyDosage;
	public JLabel dosageLabel;
	public JTextField txtPhyMedication;
	public JLabel medicationLabel;
	public JDateChooser dcPhyDcDate;
	public JLabel orderLabel_1;
	public JPanel panel_6;
	public JDateChooser dcPhyOrderDate;
	public JLabel orderLabel;
	public JPanel panel_5;
	public JPanel panel_4;
	public JTextField txtPhyHr05;
	public JTextField txtPhyHr04;
	public JTextField txtPhyHr03;
	public JTextField txtPhyHr02;
	public JTextField txtPhyHr01;
	public JPanel panel_3;
	public JPanel panel_2;

	int serial;
	int key;
	private AbstractButton dateChooser;

	/**
	 * Create the panel
	 */
	public PanelPhysicianOrderForm3Row(int num) {
		super();
		serial = num;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(305, 120));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(FormColor, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 212, 101);
		add(panel_2);

		medicationLabel = new JLabel();
		medicationLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		medicationLabel.setText("MEDICATION:");
		medicationLabel.setBounds(3, 5, 77, 14);
		panel_2.add(medicationLabel);

		txtPhyMedication = new JTextField();
		txtPhyMedication.setBackground(Color.WHITE);
		txtPhyMedication.setEditable(false);
		txtPhyMedication.setBounds(81, 3, 129, 18);
		panel_2.add(txtPhyMedication);

		dosageLabel = new JLabel();
		dosageLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		dosageLabel.setText("DOSAGE:");
		dosageLabel.setBounds(3, 24, 49, 14);
		panel_2.add(dosageLabel);

		txtPhyDosage = new JTextField();
		txtPhyDosage.setBackground(Color.WHITE);
		txtPhyDosage.setEditable(false);
		txtPhyDosage.setBounds(52, 22, 49, 18);
		panel_2.add(txtPhyDosage);

		routeLabel = new JLabel();
		routeLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		routeLabel.setText("ROUTE:");
		routeLabel.setBounds(103, 24, 42, 14);
		panel_2.add(routeLabel);

		txtPhyRoute = new JTextField();
		txtPhyRoute.setBackground(Color.WHITE);
		txtPhyRoute.setEditable(false);
		txtPhyRoute.setBounds(147, 22, 63, 18);
		panel_2.add(txtPhyRoute);

		frequencyLabel = new JLabel();
		frequencyLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		frequencyLabel.setText("FREQUENCY:");
		frequencyLabel.setBounds(3, 43, 70, 14);
		panel_2.add(frequencyLabel);

		txtPhyFrequency = new JTextField();
		txtPhyFrequency.setBackground(Color.WHITE);
		txtPhyFrequency.setEditable(false);
		txtPhyFrequency.setBounds(75, 41, 135, 18);
		panel_2.add(txtPhyFrequency);

		prnIndicatorLabel = new JLabel();
		prnIndicatorLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		prnIndicatorLabel.setText("PRN INDICATOR:");
		prnIndicatorLabel.setBounds(3, 62, 98, 14);
		panel_2.add(prnIndicatorLabel);

		txtPrnIndicator = new JTextField();
		txtPrnIndicator.setBackground(Color.WHITE);
		txtPrnIndicator.setEditable(false);
		txtPrnIndicator.setBounds(103, 60, 107, 18);
		panel_2.add(txtPrnIndicator);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setFont(new Font("Courier New", Font.PLAIN, 12));
		diagnosisLabel.setText("DIAGNOSIS:");
		diagnosisLabel.setBounds(3, 81, 70, 14);
		panel_2.add(diagnosisLabel);

		txtDiagnosis = new JTextField();
		txtDiagnosis.setBackground(Color.WHITE);
		txtDiagnosis.setEditable(false);
		txtDiagnosis.setBounds(72, 79, 138, 18);
		panel_2.add(txtDiagnosis);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(FormColor, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(211, 0, 20, 101);
		add(panel_3);

		txtPhyHr01 = new JTextField();
		txtPhyHr01.setBorder(new LineBorder(FormColor, 1, false));
		txtPhyHr01.setBounds(0, 0, 20, 21);
		panel_3.add(txtPhyHr01);

		txtPhyHr02 = new JTextField();
		txtPhyHr02.setBorder(new LineBorder(FormColor, 1, false));
		txtPhyHr02.setForeground(Color.BLACK);
		txtPhyHr02.setBounds(0, 20, 20, 21);
		panel_3.add(txtPhyHr02);

		txtPhyHr03 = new JTextField();
		txtPhyHr03.setBorder(new LineBorder(FormColor, 1, false));
		txtPhyHr03.setForeground(Color.BLACK);
		txtPhyHr03.setBounds(0, 40, 20, 21);
		panel_3.add(txtPhyHr03);

		txtPhyHr04 = new JTextField();
		txtPhyHr04.setBorder(new LineBorder(FormColor, 1, false));
		txtPhyHr04.setForeground(Color.BLACK);
		txtPhyHr04.setBounds(0, 60, 20, 21);
		panel_3.add(txtPhyHr04);

		txtPhyHr05 = new JTextField();
		txtPhyHr05.setBorder(new LineBorder(FormColor, 1, false));
		txtPhyHr05.setForeground(Color.BLACK);
		txtPhyHr05.setBounds(0, 80, 20, 21);
		panel_3.add(txtPhyHr05);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(FormColor, 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(230, 0, 75, 101);
		add(panel_4);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(FormColor, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 0, 75, 21);
		panel_4.add(panel_5);

		orderLabel = new JLabel();
		orderLabel.setForeground(FormColor);
		orderLabel.setText("Order");
		orderLabel.setBounds(10, 3, 33, 14);
		panel_5.add(orderLabel);

		button_1 = new JButton();
		button_1.setFont(new Font("", Font.BOLD, 16));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(FormColor);
		// button_1.setBounds(276, 0, 29, 21);

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				PhysicianOrderForm3Row row = getValueObject();
				Global.currentPhysicianOrderForm3row = row;
				openDialog();
			}
		});
		button_1.setText("+");
		button_1.setBounds(46, 0, 29, 21);
		panel_5.add(button_1);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(FormColor, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(FormColor);
		panel_6.setBounds(0, 50, 75, 21);
		panel_4.add(panel_6);

		orderLabel_1 = new JLabel();
		orderLabel_1.setForeground(Color.WHITE);
		orderLabel_1.setText("D/C");
		orderLabel_1.setBounds(23, 3, 28, 14);
		panel_6.add(orderLabel_1);

		dcPhyOrderDate = new JDateChooser();
		dcPhyOrderDate.setBackground(Color.WHITE);
		dcPhyOrderDate.setBounds(0, 23, 5, 16);
		panel_4.add(dcPhyOrderDate);
		dcPhyOrderDate.setDateFormatString("MM/dd/yyyy");
		dcPhyOrderDate.setEnabled(false);
		dcPhyOrderDate.setVisible(false);

		dcPhyDcDate = new JDateChooser();
		dcPhyDcDate.setBounds(0, 77, 5, 16);
		panel_4.add(dcPhyDcDate);
		dcPhyDcDate.setDateFormatString("MM/dd/yyyy");
		dcPhyDcDate.setEnabled(false);

		txtDuplicate = new JTextField();
		txtDuplicate.setEditable(false);
		txtDuplicate.setBackground(Color.WHITE);
		txtDuplicate.setBounds(0, 21, 74, 30);
		panel_4.add(txtDuplicate);

		txtDuplecateDc = new JTextField();
		txtDuplecateDc.setBackground(Color.WHITE);
		txtDuplecateDc.setEditable(false);
		txtDuplecateDc.setBounds(0, 70, 74, 30);
		panel_4.add(txtDuplecateDc);
		fillCombos();
		updateData(null);
	}

	public void fillCombos() {

	}

	public void updateData(PhysicianOrderForm3Row row) {
		// key = serial;
		setValueObject(row);
	}

	public void doSave() {
		PhysicianOrderForm3Row r = getValueObject();
		if (r != null) {
			Global.panelPhysicianOrderForm3.rows.add(r);

		}
	}

	private void openDialog() {
		FramePhysicianOrderForm3Dialog frame = (FramePhysicianOrderForm3Dialog) FrameFactory
				.createWindowOfType(FramePhysicianOrderForm3Dialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(819, 165));
		frame.setBounds(100, 100, 819, 165);
		SwingUtils.center(frame);
		frame.setVisible(true);
		setValueObject(Global.currentPhysicianOrderForm3row);
		Global.currentPhysicianOrderForm3row = null;
	}

	private PhysicianOrderForm3Row getValueObject() {
		if (txtPhyMedication.getText().equals("")
				&& txtPhyDosage.getText().equals("")
				&& txtPhyRoute.getText().equals("")
				&& txtPhyFrequency.getText().equals("")
				&& txtPrnIndicator.getText().equals("")
				&& txtDiagnosis.getText().equals("")
				&& txtDuplicate.getText().equals("")
				&& txtDuplecateDc.getText().equals("")) {
			return null;
		} else {
			PhysicianOrderForm3Row row = new PhysicianOrderForm3Row();

			row.setSerial(key);
			row.setPhysicianOrderForm3RowSerial(serial);
			row
					.setPhysicianOrderForm3Serial(Global.currentPhysicianOrderForm3Key);

			row.setDiagnosis(txtDiagnosis.getText());
			row.setPhyDcDate(dcPhyDcDate.getDate());
			row.setPhyDosage(txtPhyDosage.getText());
			row.setPhyFrequency(txtPhyFrequency.getText());
			row.setPhyMedication(txtPhyMedication.getText());
			row.setPhyRoute(txtPhyRoute.getText());
			row.setPhyOrderDate(dcPhyOrderDate.getDate());
			row.setPrnIndicator(txtPrnIndicator.getText());
			row.setDuplicate(txtDuplicate.getText());
			row.setDuplicateDc(txtDuplecateDc.getText());
			return row;
		}
	}

	private void setValueObject(PhysicianOrderForm3Row ref) {
		if (ref != null) {

			if (ref.getSerial() != 0) {
				key = ref.getSerial();
			}
			// if(ref.getDateRecord() != null) { dateChooser.setText((new
			// SimpleDateFormat("yyyy/MM/dd")).format(ref.getDateRecord())); }
			txtDiagnosis.setText(ref.getDiagnosis());
			txtPhyDosage.setText(ref.getPhyDosage());
			txtPhyFrequency.setText(ref.getPhyFrequency());
			txtPhyMedication.setText(ref.getPhyMedication());
			txtPhyRoute.setText(ref.getPhyRoute());
			txtPrnIndicator.setText(ref.getPrnIndicator());
			dcPhyDcDate.setDate(ref.getPhyDcDate());
			dcPhyOrderDate.setDate(ref.getPhyOrderDate());
			txtDuplicate.setText(DateFormat.yyyyMMdd.getFormatter().format(
					ref.getPhyOrderDate()));
			txtDuplecateDc.setText(DateFormat.yyyyMMdd.getFormatter().format(
					ref.getPhyDcDate()));
		}
	}
}
