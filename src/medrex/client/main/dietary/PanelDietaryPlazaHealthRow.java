package medrex.client.main.dietary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.dietary.DietaryPlazaHealthRow;

import com.sX.frameFactory.FrameFactory;

public class PanelDietaryPlazaHealthRow extends JPanel {

	private JTextField txtNurseSign;
	private JTextField txtDieticianSign;
	private JTextField txtConsultant;
	private JTextField dcDateField;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel;
	/**
	 * 
	 */
	int key;
	int serial;

	private static final long serialVersionUID = 1L;

	public PanelDietaryPlazaHealthRow(int num) {
		super();
		serial = num;
		setPreferredSize(new Dimension(790, 35));
		setBackground(Color.WHITE);
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setLayout(null);
		panel.setBounds(0, 0, 790, 35);
		add(panel);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 109, 35);
		panel.add(panel_2);

		dcDateField = new JTextField();
		dcDateField.setBackground(Color.WHITE);
		dcDateField.setEditable(false);
		dcDateField.setBounds(35, 3, 71, 30);
		panel_2.add(dcDateField);

		final JButton button = new JButton();
		button.setMargin(new Insets(0, 5, 0, 5));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentDietaryPlazaHealthRow = getValueObject();

				/*
				 * DietaryPlazaHealthRow row = new DietaryPlazaHealthRow();
				 * if(!dcDateField.getText().equals("")) { row.setDateField(new
				 * Date(dcDateField.getText())); }
				 * row.setConsultant(txtConsultant.getText());
				 * row.setDieticianSign(txtDieticianSign.getText());
				 * row.setNurseSign(txtNurseSign.getText());
				 * 
				 * Global.currentDietaryPlazaHealthRow = row;
				 */

				openDialog();
			}
		});

		button.setText("+");
		button.setBounds(3, 3, 30, 30);
		panel_2.add(button);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(368, 0, 99, 35);
		panel.add(panel_3);

		txtDieticianSign = new JTextField();
		txtDieticianSign.setBackground(Color.WHITE);
		txtDieticianSign.setEditable(false);
		txtDieticianSign.setBounds(3, 3, 93, 30);
		panel_3.add(txtDieticianSign);

		txtConsultant = new JTextField();
		txtConsultant.setBackground(Color.WHITE);
		txtConsultant.setEditable(false);
		txtConsultant.setBounds(112, 3, 254, 30);
		panel.add(txtConsultant);

		txtNurseSign = new JTextField();
		txtNurseSign.setBackground(Color.WHITE);
		txtNurseSign.setEditable(false);
		txtNurseSign.setBounds(469, 3, 318, 30);
		panel.add(txtNurseSign);

		updateData(null);
	}

	public void updateData(DietaryPlazaHealthRow row) {
		setValueObject(row);
	}

	public void doSave() {
		DietaryPlazaHealthRow r = getValueObject();
		if (r != null) {
			Global.panelDietaryPlazaHealth.rows.add(r);
		}
	}

	/*
	 * public void updateData() { if (Global.currentDietaryPlazaHealthKey == 0)
	 * { key=0; txtConsultant.setText(""); dcDateField.setText("");
	 * txtDieticianSign.setText(""); txtNurseSign.setText(""); } else {
	 * DietaryPlazaHealthRow psr = null; txtConsultant.setText("");
	 * dcDateField.setText(""); txtDieticianSign.setText("");
	 * txtNurseSign.setText("");
	 * 
	 * try{ psr =
	 * Global.ltcServer.getDietaryPlazaHealthRow(Global.currentDietaryPlazaHealthKey
	 * , serial); } catch(Exception e){ } key = psr.getSerial();
	 * txtNurseSign.setText(psr.getNurseSign());
	 * txtDieticianSign.setText(psr.getDieticianSign());
	 * txtConsultant.setText(psr.getConsultant()); if(psr.getDateField() !=
	 * null) {
	 * dcDateField.setText(DateFormat.yyyyMMdd.getFormatter().format(psr.
	 * getDateField())); } } }
	 */

	/*
	 * public void doSave() { DietaryPlazaHealthRow psr = new
	 * DietaryPlazaHealthRow(); psr.setSerial(key);
	 * psr.setDietaryPlazaHealthSerial(Global.currentDietaryPlazaHealthKey);
	 * psr.setDietaryPlazaHealthRowSerial(serial);
	 * 
	 * psr.setConsultant(txtConsultant.getText());
	 * if(!dcDateField.getText().equals("")) { psr.setDateField(new
	 * Date(dcDateField.getText())); }
	 * psr.setDieticianSign(txtDieticianSign.getText());
	 * psr.setNurseSign(txtNurseSign.getText()); try {
	 * Global.ltcServer.insertOrUpdateDietaryPlazaHealthRow(psr); } catch
	 * (Exception e) {
	 * 
	 * } }
	 */

	private void openDialog() {

		FrameDietaryPlazaHealthRowDialog frame = (FrameDietaryPlazaHealthRowDialog) FrameFactory
				.createWindowOfType(FrameDietaryPlazaHealthRowDialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		PanelDietaryPlazaHealthRowDialog dialogPanel = new PanelDietaryPlazaHealthRowDialog();
		frame.setSize(dialogPanel.getSize().width,
				dialogPanel.getSize().height + 30);
		SwingUtils.center(frame);
		frame.getContentPane().add(dialogPanel);
		frame.setVisible(true);
		doUpdate(Global.currentDietaryPlazaHealthRow);
		Global.currentDietaryPlazaHealthRow = null;
	}

	private void doUpdate(DietaryPlazaHealthRow ref) {
		System.out.println("ref: " + ref);
		if (ref != null) {
			setValueObject(ref);
		}
	}

	private DietaryPlazaHealthRow getValueObject() {
		if (dcDateField.getText().equals("")
				&& txtConsultant.getText().equals("")
				&& txtDieticianSign.getText().equals("")
				&& txtNurseSign.getText().equals("")) {
			return null;
		} else {
			DietaryPlazaHealthRow row = new DietaryPlazaHealthRow();

			row.setDietaryPlazaHealthRowSerial(serial);
			row.setSerial(key);
			row
					.setDietaryPlazaHealthSerial(Global.currentDietaryPlazaHealthKey);

			try {
				row.setDateField(new SimpleDateFormat("yyyy/MM/dd")
						.parse(dcDateField.getText()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			row.setConsultant(txtConsultant.getText());
			row.setDieticianSign(txtDieticianSign.getText());
			row.setNurseSign(txtNurseSign.getText());
			return row;
		}
	}

	private void setValueObject(DietaryPlazaHealthRow ref) {
		if (ref != null) {
			if (ref.getSerial() != 0) {
				key = ref.getSerial();
			}

			if (ref.getDateField() != null) {
				dcDateField.setText((new SimpleDateFormat("yyyy/MM/dd"))
						.format(ref.getDateField()));
			}
			txtConsultant.setText(ref.getConsultant());
			txtDieticianSign.setText(ref.getDieticianSign());
			txtNurseSign.setText(ref.getNurseSign());

		}
	}
}
