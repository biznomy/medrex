package medrex.client.main.medication.nurseTreatmentNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow;

import com.sX.frameFactory.FrameFactory;

public class PanelNurseTreatmentNotesRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4773460985640274295L;
	private JCheckBox cbInitials;
	private JTextField txtReason;
	private JTextField txtResult;
	private JTextField txtTreatment;
	private JTextField txtTime;
	private JPanel panel_7;
	private JPanel panel_6;
	private JPanel panel_5;
	private JPanel panel_4;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel_1;
	private JTextField txtDateField;

	int serial;
	int key;

	/**
	 * Create the panel
	 */
	public PanelNurseTreatmentNotesRow(int num) {
		super();
		serial = num;
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1180, 30));
		setLayout(null);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 1180, 30);
		add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 116, 30);
		panel_1.add(panel_2);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				NurseTreatmentNotesFormRow row = getValueObject();
				Global.currentNurseTreatmentNotesFormRow = row;
				if (!Global.currentNurseTreatmentNotesFormDialogMode
						&& row == null) {
					JOptionPane.showMessageDialog(
							Global.frameMedicationTreatmentFormAddNew,
							"New form required to add a new record!!!");
				} else {
					openDialog();
				}
			}
		});
		button.setText("+");
		button.setBounds(1, 1, 23, 27);
		panel_2.add(button);

		txtDateField = new JTextField();
		txtDateField.setBackground(Color.WHITE);
		txtDateField.setEditable(false);
		txtDateField.setBounds(24, 2, 90, 26);
		panel_2.add(txtDateField);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(115, 0, 84, 30);
		panel_1.add(panel_3);

		txtTime = new JTextField();
		txtTime.setBackground(Color.WHITE);
		txtTime.setEditable(false);
		txtTime.setBounds(3, 2, 79, 26);
		panel_3.add(txtTime);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(198, 0, 100, 30);
		panel_1.add(panel_4);

		cbInitials = new JCheckBox();
		cbInitials.setEnabled(false);
		cbInitials.setBackground(Color.WHITE);
		cbInitials.setBounds(40, 5, 20, 20);
		panel_4.add(cbInitials);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(297, 0, 330, 30);
		panel_1.add(panel_5);

		txtTreatment = new JTextField();
		txtTreatment.setBackground(Color.WHITE);
		txtTreatment.setEditable(false);
		txtTreatment.setBounds(2, 2, 325, 26);
		panel_5.add(txtTreatment);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(626, 0, 226, 30);
		panel_1.add(panel_6);

		txtResult = new JTextField();
		txtResult.setBackground(Color.WHITE);
		txtResult.setEditable(false);
		txtResult.setBounds(2, 2, 222, 26);
		panel_6.add(txtResult);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(850, 0, 330, 30);
		panel_1.add(panel_7);

		txtReason = new JTextField();
		txtReason.setBackground(Color.WHITE);
		txtReason.setEditable(false);
		txtReason.setBounds(4, 2, 324, 26);
		panel_7.add(txtReason);

		fillCombos();
		updateData(null);
	}

	public void fillCombos() {

		// cmbPainScaleUsed.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { "", "VNS", "WFS", "OBS" }));
		// cmbPainScaleUsed.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8",
		// "9", "10" }));
	}

	public void updateData(NurseTreatmentNotesFormRow row) {
		setValueObject(row);
	}

	/*
	 * if (Global.currentNurseTreatmentNotesFormKey == 0) { key=0;
	 * txtDateField.setText(""); txtTime.setText("");
	 * cbInitials.setSelected(false); txtTreatment.setText("");
	 * txtResult.setText(""); txtReason.setText("");
	 * 
	 * } else { NurseTreatmentNotesFormRow ntnfr = null;
	 * 
	 * try{ ntnfr =Global.ltcServer.getNurseTreatmentNotesFormRow(Global.
	 * currentNurseTreatmentNotesFormKey, serial);
	 * 
	 * 
	 * } catch(Exception e){
	 * 
	 * } key = ntnfr.getSerial();
	 * 
	 * dateChooser.setDate(ntnfr.getDateRecord());
	 * txtTime.setText(ntnfr.getTimeRecord());
	 * cbInitials.setSelected(ntnfr.isNursesInitial());
	 * txtTreatment.setText(ntnfr.getTreatment());
	 * txtResult.setText(ntnfr.getResult());
	 * txtReason.setText(ntnfr.getReason());
	 * 
	 * }
	 */

	public void doSave() {
		NurseTreatmentNotesFormRow n = getValueObject();
		if (n != null)
			Global.panelNurseTreatmentNotes.rows.add(n);

	}

	private void openDialog() {
		FrameNurseTreatmentNotesFormRowDialog frame = (FrameNurseTreatmentNotesFormRowDialog) FrameFactory
				.createWindowOfType(FrameNurseTreatmentNotesFormRowDialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		PanelNurseTreatmentNotesFormRowDialog dialogPanel = new PanelNurseTreatmentNotesFormRowDialog();
		frame.setSize(dialogPanel.getSize().width,
				dialogPanel.getSize().height + 30);
		SwingUtils.center(frame);

		frame.getContentPane().add(dialogPanel);
		frame.setVisible(true);
		setValueObject(Global.currentNurseTreatmentNotesFormRow);
		Global.currentNurseTreatmentNotesFormRow = null;
	}

	private NurseTreatmentNotesFormRow getValueObject() {
		if (txtDateField.getText().equals("") && txtReason.getText().equals("")
				&& txtResult.getText().equals("")
				&& txtTime.getText().equals("")
				&& txtTreatment.getText().equals("")) {
			return null;
		} else {
			NurseTreatmentNotesFormRow row = new NurseTreatmentNotesFormRow();
			row.setSerial(key);
			row.setRowSerial(serial);
			row.setFormSerial(Global.currentNurseTreatmentNotesFormKey);
			if (!txtDateField.getText().equals("")) {
				row.setDateRecord(new Date(txtDateField.getText()));
			}

			row.setNursesInitial(cbInitials.isSelected());
			row.setReason(txtReason.getText());
			row.setResult(txtResult.getText());
			row.setTimeRecord(txtTime.getText());
			row.setTreatment(txtTreatment.getText());

			return row;
		}
	}

	private void setValueObject(NurseTreatmentNotesFormRow row) {
		if (row != null) {
			if (row.getSerial() != 0) {
				key = row.getSerial();
			}
			if (row.getDateRecord() != null) {
				txtDateField.setText((new SimpleDateFormat("yyyy/MM/dd"))
						.format(row.getDateRecord()));
			}
			txtTime.setText(row.getTimeRecord());
			txtReason.setText(row.getReason());
			txtResult.setText(row.getResult());
			txtTreatment.setText(row.getTreatment());
			cbInitials.setSelected(row.isNursesInitial());
		}
	}
	/*
	 * doSave(){ NurseTreatmentNotesFormRow ntnfr = new
	 * NurseTreatmentNotesFormRow();
	 * 
	 * ntnfr.setSerial(key);ntnfr.setNurseTreatmentNotesFormSerial(Global.
	 * currentNurseTreatmentNotesFormKey);
	 * ntnfr.setNurseTreatmentNotesRowSerial(serial);
	 * ntnfr.setTimeRecord(txtTime.getText());
	 * ntnfr.setNursesInitial(cbInitials.isSelected());
	 * ntnfr.setTreatment(txtTreatment.getText());
	 * ntnfr.setResult(txtResult.getText());
	 * ntnfr.setReason(txtReason.getText());
	 * 
	 * try { Global.ltcServer.insertOrUpdateNurseTreatmentNotesFormRow(ntnfr); }
	 * catch (Exception e) {
	 * 
	 * } }
	 */
}