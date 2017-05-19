package medrex.client.main.medication.nurseTreatmentNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow1;

import com.sX.frameFactory.FrameFactory;

public class PanelNurseTreatmentNotesRow1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1502669326094722016L;
	private JTextField txtSignature;
	private JTextField txtShift;
	private JCheckBox cbInitials;

	private JPanel panel_3;

	private JPanel panel_2;

	private JPanel panel_1;

	/**
	 * Create the panel
	 */

	int key;

	int serial;

	public PanelNurseTreatmentNotesRow1(int num) {
		super();
		serial = num;
		setPreferredSize(new Dimension(393, 30));
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 100, 30);
		add(panel_1);

		cbInitials = new JCheckBox();
		cbInitials.setRequestFocusEnabled(false);
		cbInitials.setContentAreaFilled(false);
		cbInitials.setFocusable(false);
		cbInitials.setBackground(Color.WHITE);
		cbInitials.setBounds(43, 5, 16, 18);
		cbInitials.setEnabled(false);
		panel_1.add(cbInitials);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				NurseTreatmentNotesFormRow1 row = getValueObject();
				Global.currentNurseTreatmentNotesFormRow1 = row;
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
		button.setBounds(2, 2, 23, 27);
		panel_1.add(button);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(99, 0, 80, 30);
		add(panel_2);

		txtShift = new JTextField();
		txtShift.setBackground(Color.WHITE);
		txtShift.setEditable(false);
		txtShift.setBounds(3, 3, 75, 24);
		panel_2.add(txtShift);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(178, 0, 215, 30);
		add(panel_3);

		txtSignature = new JTextField();
		txtSignature.setBackground(Color.WHITE);
		txtSignature.setEditable(false);
		txtSignature.setBounds(3, 3, 209, 24);
		panel_3.add(txtSignature);

		fillCombos();
		updateData(null);
	}

	public void fillCombos() {
	}

	public void updateData(NurseTreatmentNotesFormRow1 row) {
		setValueObject(row);
	}

	public void doSave() {
		NurseTreatmentNotesFormRow1 n = getValueObject();
		if (n != null)
			Global.panelNurseTreatmentNotes.rows1.add(n);
	}

	private void openDialog() {
		FrameNurseTreatmentNotesFormRow1Dialog frame = (FrameNurseTreatmentNotesFormRow1Dialog) FrameFactory
				.createWindowOfType(FrameNurseTreatmentNotesFormRow1Dialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		PanelNurseTreatmentNotesFormRow1Dialog dialogPanel = new PanelNurseTreatmentNotesFormRow1Dialog();
		frame.setSize(dialogPanel.getSize().width,
				dialogPanel.getSize().height + 30);
		SwingUtils.center(frame);

		frame.getContentPane().add(dialogPanel);
		frame.setVisible(true);
		setValueObject(Global.currentNurseTreatmentNotesFormRow1);
		Global.currentNurseTreatmentNotesFormRow1 = null;
	}

	private NurseTreatmentNotesFormRow1 getValueObject() {

		if (txtShift.getText().equals("") && txtSignature.getText().equals("")) {
			return null;
		} else {
			NurseTreatmentNotesFormRow1 row = new NurseTreatmentNotesFormRow1();
			row.setSerial(key);
			row.setRowSerial(serial);
			row.setFormSerial(Global.currentNurseTreatmentNotesFormKey);

			row.setNursesInitial(cbInitials.isSelected());
			row.setShift(txtShift.getText());
			row.setSignature(txtSignature.getText());

			return row;
		}
	}

	private void setValueObject(NurseTreatmentNotesFormRow1 row) {
		if (row != null) {
			if (row.getSerial() != 0) {
				key = row.getSerial();
			}
			cbInitials.setSelected(row.isNursesInitial());
			txtShift.setText(row.getShift());
			txtSignature.setText(row.getSignature());
		}
	}

	/*
	 * public void updateData() { if (Global.currentNurseTreatmentNotesFormKey
	 * == 0) { key = 0; cbInitials.setSelected(false);
	 * cmbShift.setSelectedItem(""); cmbSignature.setSelectedItem(""); } else {
	 * NurseTreatmentNotesFormRow1 ntnfr1 = null; cbInitials.setSelected(false);
	 * cmbShift.setSelectedItem(""); cmbSignature.setSelectedItem(""); try {
	 * ntnfr1 = Global.ltcServer.getNurseTreatmentNotesFormRow1(
	 * Global.currentNurseTreatmentNotesFormKey, serial); } catch (Exception e)
	 * {
	 * 
	 * } key = ntnfr1.getSerial();
	 * 
	 * cmbShift.setSelectedItem((ntnfr1.getShift()));
	 * cmbSignature.setSelectedItem((ntnfr1.getSignature()));
	 * cbInitials.setSelected(ntnfr1.isNursesInitial());
	 * 
	 * }
	 * 
	 * }
	 */
	/*
	 * public void doSave() { NurseTreatmentNotesFormRow1 ntnfr1 = new
	 * NurseTreatmentNotesFormRow1();
	 * 
	 * ntnfr1.setSerial(key); ntnfr1
	 * .setNurseTreatmentNotesFormSerial(Global.currentNurseTreatmentNotesFormKey
	 * ); ntnfr1.setNurseTreatmentNotesRowSerial(serial);
	 * 
	 * ntnfr1.setShift((String) cmbShift.getSelectedItem());
	 * ntnfr1.setSignature((String) cmbSignature.getSelectedItem());
	 * ntnfr1.setNursesInitial(cbInitials.isSelected());
	 * 
	 * try { Global.ltcServer.insertOrUpdateNurseTreatmentNotesFormRow1(ntnfr1);
	 * } catch (Exception e) {
	 * 
	 * } }
	 */

}