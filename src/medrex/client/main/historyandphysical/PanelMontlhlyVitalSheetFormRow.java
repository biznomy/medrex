package medrex.client.main.historyandphysical;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.DateFormat;
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetFormRow;

import com.sX.frameFactory.FrameFactory;

public class PanelMontlhlyVitalSheetFormRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7221916950085583394L;
	private JTextField txtMonth;
	/**
	 * Create the panel
	 */
	int serial;
	int key;

	JTextField txtBP;
	JTextField txtP;
	JTextField txtR;
	JTextField txtTemp;
	JTextField txtWeight;
	JTextField txtW1;
	JTextField txtW2;
	JTextField txtW3;
	JTextField txtW4;
	JTextField date1;
	JTextField date2;
	JTextField date3;
	JTextField date4;

	public PanelMontlhlyVitalSheetFormRow(int num) {
		super();

		setBorder(new LineBorder(Color.black, 1, false));

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(890, 50));
		setLayout(null);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 890, 50);
		add(panel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 114, 50);
		panel_1.add(panel_2);

		final JButton button = new JButton();
		button.setMargin(new Insets(0, 5, 0, 5));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				MonthlyVitalSheetFormRow row = new MonthlyVitalSheetFormRow();
				// if(!dcDateField.getText().equals("")) { row.setDateField(new
				// Date(dcDateField.getText())); }

				if (!date1.getText().equals("")) {
					row.setDate1(new Date(date1.getText()));
				}
				if (!date2.getText().equals("")) {
					row.setDate1(new Date(date2.getText()));
				}
				if (!date3.getText().equals("")) {
					row.setDate1(new Date(date3.getText()));
				}
				if (!date4.getText().equals("")) {
					row.setDate1(new Date(date4.getText()));
				}
				row.setMonth(txtMonth.getText());
				row.setBp(txtBP.getText());
				row.setP(txtP.getText());
				row.setR(txtR.getText());
				row.setTemp(txtTemp.getText());
				row.setW1(txtW1.getText());
				row.setW2(txtW2.getText());
				row.setW3(txtW3.getText());
				row.setW4(txtW4.getText());
				Global.currentMonthlyVitalSheetFormRow = row;
				openDialog();

			}
		});
		button.setText("+");
		button.setBounds(3, 3, 30, 50);
		panel_2.add(button);

		txtMonth = new JTextField();
		txtMonth.setBounds(46, 10, 58, 20);
		panel_2.add(txtMonth);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(112, 0, 63, 50);
		panel_1.add(panel_2_1);

		txtBP = new JTextField();
		txtBP.setBackground(Color.WHITE);
		txtBP.setEditable(false);
		txtBP.setBounds(10, 12, 43, 20);
		panel_2_1.add(txtBP);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(174, 0, 63, 50);
		panel_1.add(panel_2_1_1);

		txtP = new JTextField();
		txtP.setBackground(Color.WHITE);
		txtP.setEditable(false);
		txtP.setBounds(10, 12, 43, 20);
		panel_2_1_1.add(txtP);

		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setBounds(235, 0, 63, 50);
		panel_1.add(panel_2_1_1_1);

		txtR = new JTextField();
		txtR.setBackground(Color.WHITE);
		txtR.setEditable(false);
		txtR.setBounds(10, 12, 43, 20);
		panel_2_1_1_1.add(txtR);

		final JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setBounds(296, 0, 69, 50);
		panel_1.add(panel_2_1_1_1_1);

		txtTemp = new JTextField();
		txtTemp.setBackground(Color.WHITE);
		txtTemp.setEditable(false);
		txtTemp.setBounds(10, 12, 49, 20);
		panel_2_1_1_1_1.add(txtTemp);

		final JPanel panel_2_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1.setBounds(363, 0, 76, 50);
		panel_1.add(panel_2_1_1_1_1_1);

		txtWeight = new JTextField();
		txtWeight.setBackground(Color.WHITE);
		txtWeight.setEditable(false);
		txtWeight.setBounds(10, 12, 56, 20);
		panel_2_1_1_1_1_1.add(txtWeight);

		final JPanel panel_2_1_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1.setBounds(437, 0, 114, 50);
		panel_1.add(panel_2_1_1_1_1_1_1);

		txtW1 = new JTextField();
		txtW1.setBackground(Color.WHITE);
		txtW1.setEditable(false);
		txtW1.setBounds(10, 2, 92, 20);
		panel_2_1_1_1_1_1_1.add(txtW1);

		date1 = new JTextField();
		date1.setBackground(Color.WHITE);
		date1.setEditable(false);
		date1.setBounds(5, 26, 102, 20);
		panel_2_1_1_1_1_1_1.add(date1);

		final JPanel panel_2_1_1_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1_1.setBounds(548, 0, 114, 50);
		panel_1.add(panel_2_1_1_1_1_1_1_1);

		txtW2 = new JTextField();
		txtW2.setBackground(Color.WHITE);
		txtW2.setEditable(false);
		txtW2.setBounds(10, 2, 92, 20);
		panel_2_1_1_1_1_1_1_1.add(txtW2);

		date2 = new JTextField();
		date2.setBackground(Color.WHITE);
		date2.setEditable(false);
		date2.setBounds(5, 26, 102, 20);
		panel_2_1_1_1_1_1_1_1.add(date2);

		final JPanel panel_2_1_1_1_1_1_1_2 = new JPanel();
		panel_2_1_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1_2.setLayout(null);
		panel_2_1_1_1_1_1_1_2.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1_2.setBounds(659, 0, 114, 50);
		panel_1.add(panel_2_1_1_1_1_1_1_2);

		txtW3 = new JTextField();
		txtW3.setBackground(Color.WHITE);
		txtW3.setEditable(false);
		txtW3.setBounds(10, 2, 92, 20);
		panel_2_1_1_1_1_1_1_2.add(txtW3);

		date3 = new JTextField();
		date3.setBackground(Color.WHITE);
		date3.setEditable(false);
		date3.setBounds(5, 26, 102, 20);
		panel_2_1_1_1_1_1_1_2.add(date3);

		final JPanel panel_2_1_1_1_1_1_1_3 = new JPanel();
		panel_2_1_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1_3.setLayout(null);
		panel_2_1_1_1_1_1_1_3.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1_3.setBounds(772, 0, 114, 50);
		panel_1.add(panel_2_1_1_1_1_1_1_3);

		txtW4 = new JTextField();
		txtW4.setBackground(Color.WHITE);
		txtW4.setEditable(false);
		txtW4.setBounds(10, 2, 92, 20);
		panel_2_1_1_1_1_1_1_3.add(txtW4);

		date4 = new JTextField();
		date4.setBackground(Color.WHITE);
		date4.setEditable(false);
		date4.setBounds(5, 26, 102, 20);
		panel_2_1_1_1_1_1_1_3.add(date4);

		serial = num;
		updateData(null);
	}

	public void updateData(MonthlyVitalSheetFormRow row) {
		// key = serial;
		setValueObject(row);
	}

	public void doSave() {
		MonthlyVitalSheetFormRow r = getValueObject();
		if (r != null) {
			Global.panelMontlhlyVitalSheetForm.rows.add(r);
		}
	}

	private MonthlyVitalSheetFormRow getValueObject() {
		if (date1.getText().equals("") && txtBP.getText().equals("")
				&& txtP.getText().equals("") && txtR.getText().equals("")
				&& txtTemp.getText().equals("") && txtW1.getText().equals("")
				&& txtW2.getText().equals("") && txtW2.getText().equals("")
				&& txtW3.getText().equals("") && txtW4.getText().equals("")
				&& txtWeight.getText().equals("") && date2.getText().equals("")
				&& date3.getText().equals("") && date4.getText().equals("")) {
			return null;
		} else {
			MonthlyVitalSheetFormRow row = new MonthlyVitalSheetFormRow();
			row.setRowSerial(serial);
			row.setSerial(key);
			row.setFormSerial(Global.currentMonthlyVitalSheetFormKey);
			row.setMonth(txtMonth.getText());
			row.setBp(txtBP.getText());
			row.setP(txtP.getText());
			row.setR(txtR.getText());
			row.setTemp(txtTemp.getText());
			row.setWeight(txtWeight.getText());
			row.setW1(txtW1.getText());
			row.setW2(txtW2.getText());
			row.setW3(txtW3.getText());
			row.setW4(txtW4.getText());

			if (!date1.getText().equals("")) {
				row.setDate1(new Date(date1.getText()));
			}
			if (!date2.getText().equals("")) {
				row.setDate2(new Date(date2.getText()));
			}
			if (!date3.getText().equals("")) {
				row.setDate3(new Date(date3.getText()));
			}
			if (!date4.getText().equals("")) {
				row.setDate4(new Date(date4.getText()));
			}
			return row;
		}
	}

	private void setValueObject(MonthlyVitalSheetFormRow ref) {
		if (ref != null) {
			if (ref.getSerial() != 0) {
				key = ref.getSerial();
			}
			txtMonth.setText(ref.getMonth());
			txtBP.setText(ref.getBp());
			txtP.setText(ref.getP());
			txtR.setText(ref.getR());
			txtTemp.setText(ref.getTemp());
			txtWeight.setText(ref.getWeight());
			txtW1.setText(ref.getW1());
			txtW2.setText(ref.getW2());
			txtW3.setText(ref.getW3());
			txtW4.setText(ref.getW4());
			if (ref.getDate1() != null) {
				date1.setText(DateFormat.yyyyMMdd.getFormatter().format(
						ref.getDate1()));
			}
			if (ref.getDate2() != null) {
				date2.setText(DateFormat.yyyyMMdd.getFormatter().format(
						ref.getDate2()));
			}
			if (ref.getDate3() != null) {
				date3.setText(DateFormat.yyyyMMdd.getFormatter().format(
						ref.getDate3()));
			}
			if (ref.getDate4() != null) {
				date4.setText(DateFormat.yyyyMMdd.getFormatter().format(
						ref.getDate4()));
			}
		}

	}

	private void openDialog() {

		FrameMonthlyVitalSheetFormRowDialog frame = (FrameMonthlyVitalSheetFormRowDialog) FrameFactory
				.createWindowOfType(FrameMonthlyVitalSheetFormRowDialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		PanelMonthlyVitalSheetFormRowDialog dialogPanel = new PanelMonthlyVitalSheetFormRowDialog();
		frame.setSize(dialogPanel.getSize().width,
				dialogPanel.getSize().height + 40);
		SwingUtils.center(frame);
		frame.getContentPane().add(dialogPanel);
		frame.setVisible(true);
		setValueObject(Global.currentMonthlyVitalSheetFormRow);
		Global.currentMonthlyVitalSheetFormRow = null;
	}

}
