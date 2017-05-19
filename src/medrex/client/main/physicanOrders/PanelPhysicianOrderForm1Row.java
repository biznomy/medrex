package medrex.client.main.physicanOrders;

import static medrex.client.main.physicanOrders.PanelPhysicianOrderForm1.FormColor;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm1Row;

import com.toedter.calendar.JDateChooser;

public class PanelPhysicianOrderForm1Row extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6412099389610703629L;
	private JTextArea txtPhysiciansCurOrders;
	private JDateChooser dcDcDate;
	private JLabel orderLabel_1;
	private JPanel panel_6;
	private JDateChooser dcOrderDate;
	private JLabel orderLabel;
	private JPanel panel_5;
	private JPanel panel_4;
	private JTextField txtHr05;
	private JTextField txtHr04;
	private JTextField txtHr03;
	private JTextField txtHr02;
	private JTextField txtHr01;
	private JPanel panel_3;
	private JPanel panel_2;

	int serial;
	int key;

	/**
	 * Create the panel
	 */
	public PanelPhysicianOrderForm1Row(int num) {
		super();
		serial = num;
		setBorder(new LineBorder(FormColor, 1, false));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(305, 101));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(FormColor, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 212, 101);
		add(panel_2);

		txtPhysiciansCurOrders = new JTextArea();
		txtPhysiciansCurOrders.setLineWrap(true);
		txtPhysiciansCurOrders.setWrapStyleWord(true);
		txtPhysiciansCurOrders.setBounds(1, 1, 210, 99);
		panel_2.add(txtPhysiciansCurOrders);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(FormColor, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(211, 0, 20, 101);
		add(panel_3);

		txtHr01 = new JTextField();
		txtHr01.setBorder(new LineBorder(FormColor, 1, false));
		txtHr01.setBounds(0, 0, 20, 21);
		panel_3.add(txtHr01);

		txtHr02 = new JTextField();
		txtHr02.setBorder(new LineBorder(FormColor, 1, false));
		txtHr02.setForeground(Color.BLACK);
		txtHr02.setBounds(0, 20, 20, 21);
		panel_3.add(txtHr02);

		txtHr03 = new JTextField();
		txtHr03.setBorder(new LineBorder(FormColor, 1, false));
		txtHr03.setForeground(Color.BLACK);
		txtHr03.setBounds(0, 40, 20, 21);
		panel_3.add(txtHr03);

		txtHr04 = new JTextField();
		txtHr04.setBorder(new LineBorder(FormColor, 1, false));
		txtHr04.setForeground(Color.BLACK);
		txtHr04.setBounds(0, 60, 20, 21);
		panel_3.add(txtHr04);

		txtHr05 = new JTextField();
		txtHr05.setBorder(new LineBorder(FormColor, 1, false));
		txtHr05.setForeground(Color.BLACK);
		txtHr05.setBounds(0, 80, 20, 21);
		panel_3.add(txtHr05);

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
		orderLabel.setBounds(23, 3, 28, 14);
		panel_5.add(orderLabel);

		dcOrderDate = new JDateChooser();
		dcOrderDate.setDateFormatString("MM/dd/yyyy");
		dcOrderDate.setBounds(1, 21, 73, 29);
		panel_4.add(dcOrderDate);

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

		dcDcDate = new JDateChooser();
		dcDcDate.setDateFormatString("MM/dd/yyyy");
		dcDcDate.setBounds(1, 71, 73, 29);
		panel_4.add(dcDcDate);

		fillCombos();
		updateData();
	}

	public void fillCombos() {

	}

	public void updateData() {
		if (Global.currentPhysicianOrderForm1Key == 0) {
			key = 0;

			txtPhysiciansCurOrders.setText("");
			dcDcDate.setDate(null);
			dcOrderDate.setDate(null);
			txtHr05.setText("");
			txtHr04.setText("");
			txtHr03.setText("");
			txtHr02.setText("");
			txtHr01.setText("");

		} else {
			PhysicianOrderForm1Row psr = null;

			try {
				psr = MedrexClientManager.getInstance()
						.getPhysicianOrderForm1Row(
								Global.currentPhysicianOrderForm1Key, serial);
			} catch (Exception e) {

			}
			key = psr.getSerial();
			txtPhysiciansCurOrders.setText(psr.getPhysiciansCurOrders());
			dcDcDate.setDate(psr.getDcDate());
			dcOrderDate.setDate(psr.getOrderDate());
			txtHr05.setText(psr.getHr05());
			txtHr04.setText(psr.getHr04());
			txtHr03.setText(psr.getHr03());
			txtHr02.setText(psr.getHr02());
			txtHr01.setText(psr.getHr01());

		}

	}

	public void doSave() {
		PhysicianOrderForm1Row psr = new PhysicianOrderForm1Row();

		psr.setSerial(key);
		psr.setPhysicianOrderForm1Serial(Global.currentPhysicianOrderForm1Key);
		psr.setPhysicianOrderForm1RowSerial(serial);

		psr.setPhysiciansCurOrders(txtPhysiciansCurOrders.getText());
		psr.setDcDate(dcDcDate.getDate());
		psr.setOrderDate(dcOrderDate.getDate());
		psr.setHr05(txtHr05.getText());
		psr.setHr04(txtHr04.getText());
		psr.setHr03(txtHr03.getText());
		psr.setHr02(txtHr02.getText());
		psr.setHr01(txtHr01.getText());

		try {
			/* Global.currentPhysicianOrderForm1Key = */MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderForm1Row(psr);
		} catch (Exception e) {

		}

	}

}
