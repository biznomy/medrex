package medrex.client.main.progressNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.progressNotes.InterDisciplinaryProgressNotesFormRow;

import com.sX.frameFactory.FrameFactory;

public class PanelInterDisciplinaryProgressNotesFormRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3176535024903794255L;
	/**
	 * Create the panel
	 */

	int serial;
	int key;

	JTextField dateChooser;
	JTextField txtTime;
	JTextField txtDiscipline;
	JTextField txtNotes;

	public PanelInterDisciplinaryProgressNotesFormRow(int num) {
		super();
		setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		setSize(1200, 950);
		// Global.panelInterdisciplinaryProgressNotesForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(780, 28));
		setLayout(null);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 0, 780, 28);
		add(panel_4);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 0, 119, 28);
		panel_4.add(panel_5);

		dateChooser = new JTextField();
		dateChooser.setBackground(Color.WHITE);
		dateChooser.setEditable(false);
		dateChooser.setBounds(28, 3, 90, 22);
		panel_5.add(dateChooser);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				InterDisciplinaryProgressNotesFormRow row = new InterDisciplinaryProgressNotesFormRow();
				if (!dateChooser.getText().equals("")) {
					row.setDateRecord(new Date(dateChooser.getText()));
				}
				row.setDiscipline(txtDiscipline.getText());
				row.setNotes(txtNotes.getText());
				row.setTimeRecord(txtTime.getText());
				Global.currentInterdisciplinaryProgressNotesFormRow = row;
				openDialog();
			}
		});
		button.setText("+");
		button.setBounds(0, 0, 23, 28);
		panel_5.add(button);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setBounds(116, 0, 105, 28);
		panel_4.add(panel_5_1);

		txtTime = new JTextField();
		txtTime.setBackground(Color.WHITE);
		txtTime.setEditable(false);
		txtTime.setBounds(10, 3, 87, 20);
		panel_5_1.add(txtTime);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBackground(Color.WHITE);
		panel_5_1_1.setBounds(220, 0, 119, 28);
		panel_4.add(panel_5_1_1);

		txtDiscipline = new JTextField();
		txtDiscipline.setBackground(Color.WHITE);
		txtDiscipline.setEditable(false);
		txtDiscipline.setBounds(10, 3, 99, 20);
		panel_5_1_1.add(txtDiscipline);

		final JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1.setLayout(null);
		panel_5_1_1_1.setBackground(Color.WHITE);
		panel_5_1_1_1.setBounds(337, 0, 443, 28);
		panel_4.add(panel_5_1_1_1);

		txtNotes = new JTextField();
		txtNotes.setBackground(Color.WHITE);
		txtNotes.setEditable(false);
		txtNotes.setBounds(10, 3, 423, 20);
		panel_5_1_1_1.add(txtNotes);

		serial = num;

		updateData(null);
	}

	public void updateData(InterDisciplinaryProgressNotesFormRow row) {
		// key = serial;
		setValueObject(row);
	}

	public void doSave() {
		InterDisciplinaryProgressNotesFormRow r = getValueObject();
		if (r != null)
			Global.panelInterdisciplinaryProgressNotesForm.rows.add(r);
	}

	private void openDialog() {
		FrameInterDisciplinaryProgressNotesFormRowDialog frame = (FrameInterDisciplinaryProgressNotesFormRowDialog) FrameFactory
				.createWindowOfType(FrameInterDisciplinaryProgressNotesFormRowDialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		PanelInterDisciplinaryProgressNotesFormRowDialog dialogPanel = new PanelInterDisciplinaryProgressNotesFormRowDialog();
		frame.setSize(dialogPanel.getSize().width,
				dialogPanel.getSize().height + 30);
		SwingUtils.center(frame);

		frame.getContentPane().add(dialogPanel);
		frame.setVisible(true);
		setValueObject(Global.currentInterdisciplinaryProgressNotesFormRow);
		Global.currentInterdisciplinaryProgressNotesFormRow = null;
	}

	private InterDisciplinaryProgressNotesFormRow getValueObject() {
		if (dateChooser.getText().equals("") && txtNotes.getText().equals("")
				&& txtTime.getText().equals("")) {
			return null;
		} else {
			InterDisciplinaryProgressNotesFormRow row = new InterDisciplinaryProgressNotesFormRow();
			row.setSerial(key);
			row.setRowSerial(serial);
			row.setFormSerial(Global.currentInterdisciplinaryProgressNotesKey);
			if (!dateChooser.getText().equals("")) {
				row.setDateRecord(new Date(dateChooser.getText()));
			}
			row.setDiscipline(txtDiscipline.getText());
			row.setTimeRecord(txtTime.getText());
			row.setNotes(txtNotes.getText());
			return row;
		}
	}

	private void setValueObject(InterDisciplinaryProgressNotesFormRow row) {
		if (row != null) {
			if (row.getSerial() != 0) {
				key = row.getSerial();
			}
			if (row.getDateRecord() != null) {
				dateChooser.setText((new SimpleDateFormat("yyyy/MM/dd"))
						.format(row.getDateRecord()));
			}
			txtTime.setText(row.getTimeRecord());
			txtNotes.setText(row.getNotes());
			txtDiscipline.setText(row.getDiscipline());
		}
	}
}
