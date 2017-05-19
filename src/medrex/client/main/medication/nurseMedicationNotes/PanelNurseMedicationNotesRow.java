package medrex.client.main.medication.nurseMedicationNotes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;

import com.sX.frameFactory.FrameFactory;

public class PanelNurseMedicationNotesRow extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 816587420742503259L;

	NurseMedicationNotesFormRow panelNurseMedicationNotesFormRows[];

	/**
	 * Create the panel
	 */

	private JTextField txtDate;
	private JTextField txtTime;
	private JCheckBox cbInitials;
	private JTextField txtDrugStrength;
	private JTextField txtSite;
	private JTextField txtReason;
	private JTextField txtResult;

	JCheckBox cbObsInitials;

	int serial;

	int key;

	public PanelNurseMedicationNotesRow(int num) {
		super();
		serial = num;
		setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		setSize(779, 20);
		// Global.panelNurseTreatmentNotes = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(779, 20));
		setLayout(null);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(0, 0, 778, 20);
		add(panel_2_1);
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);

		final JButton button = new JButton();
		button.setFont(new Font("Dialog", Font.PLAIN, 14));
		button.setBackground(new Color(204, 255, 204));
		button.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		button.setMargin(new Insets(2, 2, 2, 2));
		button.setBounds(0, 0, 28, 20);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				NurseMedicationNotesFormRow row = getValueObject();
				Global.currentNurseMedicationNotesFormRow = row;
				openDialog();

			}
		});
		button.setText("+");
		panel_2_1.add(button, BorderLayout.WEST);

		txtTime = new JTextField();
		txtTime.setEditable(false);
		txtTime.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txtTime.setBackground(new Color(204, 255, 204));
		txtTime.setBounds(100, 0, 62, 20);
		panel_2_1.add(txtTime);

		txtDate = new JTextField();
		txtDate.setEditable(false);
		txtDate.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txtDate.setBackground(new Color(204, 255, 204));
		txtDate.setBounds(27, 0, 74, 20);
		panel_2_1.add(txtDate);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_3.setBackground(new Color(204, 255, 204));
		panel_3.setBounds(161, 0, 51, 20);
		panel_2_1.add(panel_3);

		cbInitials = new JCheckBox();
		cbInitials.setEnabled(false);
		cbInitials.setBounds(12, 2, 17, 17);
		cbInitials.setBackground(new Color(204, 255, 204));

		panel_3.add(cbInitials);

		txtDrugStrength = new JTextField();
		txtDrugStrength.setEditable(false);
		txtDrugStrength.setBorder(new LineBorder(new Color(34, 139, 34), 1,
				false));
		txtDrugStrength.setBackground(new Color(204, 255, 204));
		txtDrugStrength.setBounds(209, 0, 171, 20);
		panel_2_1.add(txtDrugStrength);

		txtSite = new JTextField();
		txtSite.setEditable(false);
		txtSite.setBackground(new Color(204, 255, 204));
		txtSite.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txtSite.setBounds(378, 0, 104, 20);
		panel_2_1.add(txtSite);

		txtReason = new JTextField();
		txtReason.setEditable(false);
		txtReason.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txtReason.setBackground(new Color(204, 255, 204));
		txtReason.setBounds(480, 0, 104, 20);
		panel_2_1.add(txtReason);

		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		txtResult.setBackground(new Color(204, 255, 204));
		txtResult.setBounds(583, 0, 104, 20);
		panel_2_1.add(txtResult);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(204, 255, 204));
		panel_3_1.setBounds(684, 0, 96, 20);
		panel_2_1.add(panel_3_1);

		cbObsInitials = new JCheckBox();
		cbObsInitials.setEnabled(false);
		cbObsInitials.setBackground(new Color(204, 255, 204));
		cbObsInitials.setBounds(40, 2, 17, 17);
		panel_3_1.add(cbObsInitials);

		// fillCombos();

		updateData(null);

	}

	public void setValueObject(NurseMedicationNotesFormRow ref) {
		if (ref != null) {
			if (ref.getSerial() != 0) {
				key = ref.getSerial();
			}
			if (ref.getDateRecord() != null) {
				txtDate.setText(medrex.commons.enums.DateFormat.yyyyMMdd
						.getFormatter().format(ref.getDateRecord()));
			}
			txtSite.setText(ref.getSite());
			txtTime.setText(ref.getTimeRecord());
			txtReason.setText(ref.getReason());
			txtResult.setText(ref.getResult());
			txtDrugStrength.setText(ref.getDrugStrength());
			cbInitials.setSelected(ref.isNursesInitial());
			cbObsInitials.setSelected(ref.isObsInitial());
		}
	}

	public NurseMedicationNotesFormRow getValueObject() {
		if (txtDate.getText().equals("")
				&& txtDrugStrength.getText().equals("")
				&& txtReason.getText().equals("")
				&& txtResult.getText().equals("")
				&& txtTime.getText().equals("") && txtSite.getText().equals("")) {
			return null;
		} else {
			NurseMedicationNotesFormRow row = new NurseMedicationNotesFormRow();
			row.setFormSerial(Global.currentNurseMedicationNotesFormKey);
			row.setSerial(key);
			row.setRowSerial(serial);

			if (!txtDate.getText().equals("")) {
				row.setDateRecord(new Date(txtDate.getText()));
			}
			row.setDrugStrength(txtDrugStrength.getText());
			row.setReason(txtReason.getText());
			row.setResult(txtResult.getText());
			row.setTimeRecord(txtTime.getText());
			row.setSite(txtSite.getText());
			row.setNursesInitial(cbInitials.isSelected());
			row.setObsInitial(cbObsInitials.isSelected());
			return row;
		}
	}

	public void updateData(NurseMedicationNotesFormRow row) {
		// key = serial;
		setValueObject(row);
	}

	private void openDialog() {
		FrameNurseMedicationNotesRowDialog frame = (FrameNurseMedicationNotesRowDialog) FrameFactory
				.createWindowOfType(FrameNurseMedicationNotesRowDialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(frame);
		frame.setVisible(true);

		setValueObject(Global.currentNurseMedicationNotesFormRow);
		Global.currentNurseMedicationNotesFormRow = null;
	}

	public void doSave() {
		NurseMedicationNotesFormRow r = getValueObject();
		if (r != null) {
			Global.panelNurseMedicationNotes.rows.add(r);
		}
	}
}
