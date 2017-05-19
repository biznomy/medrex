package medrex.client.main.medication.nurseMedicationNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow1;

import com.sX.frameFactory.FrameFactory;

public class PanelNurseMedicationNotesRow1 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6338281621706045768L;

	NurseMedicationNotesFormRow1 panelNurseMedicationNotesFormRows[];

	JTextField txtSignature;
	JTextField txtTitle;
	JCheckBox cbInitials;

	int serial;
	int key;

	public PanelNurseMedicationNotesRow1(int num) {
		super();
		setPreferredSize(new Dimension(525, 26));
		setLayout(null);

		final JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 0, 525, 26);
		add(panel_7);

		final JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(0, 0, 101, 26);
		panel_7.add(panel_8);

		cbInitials = new JCheckBox();
		cbInitials.setBackground(Color.WHITE);
		cbInitials.setEnabled(false);
		cbInitials.setText("cbInitials");
		cbInitials.setBounds(33, 3, 19, 19);
		panel_8.add(cbInitials);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				NurseMedicationNotesFormRow1 row = getValueObject();
				Global.currentNurseMedicationNotesFormRow1 = row;
				openDialog();
			}
		});
		button.setText("+");
		button.setBounds(0, 0, 27, 25);
		panel_8.add(button);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_8_1.setLayout(null);
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setBounds(100, 0, 299, 26);
		panel_7.add(panel_8_1);

		txtSignature = new JTextField();
		txtSignature.setEditable(false);
		txtSignature.setBackground(Color.WHITE);
		txtSignature.setBounds(10, 2, 267, 22);
		panel_8_1.add(txtSignature);

		final JPanel panel_8_2 = new JPanel();
		panel_8_2.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_8_2.setLayout(null);
		panel_8_2.setBackground(Color.WHITE);
		panel_8_2.setBounds(398, 0, 126, 26);
		panel_7.add(panel_8_2);

		txtTitle = new JTextField();
		txtTitle.setBackground(Color.WHITE);
		txtTitle.setEditable(false);
		txtTitle.setBounds(15, 3, 87, 20);
		panel_8_2.add(txtTitle);

		serial = num;

		updateData(null);

	}

	public void setValueObject(NurseMedicationNotesFormRow1 ref) {
		if (ref != null) {
			if (ref.getSerial() != 0) {
				key = ref.getSerial();
			}
			txtTitle.setText(ref.getTitle());
			txtSignature.setText(ref.getSignature());
			cbInitials.setSelected(ref.isNursesInitial());
		}
	}

	public NurseMedicationNotesFormRow1 getValueObject() {
		if (txtTitle.getText().equals("") && txtSignature.getText().equals("")) {
			return null;
		} else {
			NurseMedicationNotesFormRow1 row = new NurseMedicationNotesFormRow1();
			row.setFormSerial(Global.currentNurseMedicationNotesFormKey);
			row.setRowSerial(serial);
			row.setSerial(key);
			row.setTitle(txtTitle.getText());
			row.setSignature(txtSignature.getText());
			row.setNursesInitial(cbInitials.isSelected());
			return row;
		}
	}

	public void updateData(NurseMedicationNotesFormRow1 row) {
		// key = serial;
		setValueObject(row);
	}

	private void openDialog() {
		FrameNurseMedicationNotesRow1Dialog frame = (FrameNurseMedicationNotesRow1Dialog) FrameFactory
				.createWindowOfType(FrameNurseMedicationNotesRow1Dialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(frame);
		frame.setVisible(true);
		setValueObject(Global.currentNurseMedicationNotesFormRow1);
		Global.currentNurseMedicationNotesFormRow1 = null;
	}

	public void doSave() {
		NurseMedicationNotesFormRow1 r = getValueObject();
		if (r != null) {
			Global.panelNurseMedicationNotes.rows1.add(r);
		}
	}

}
