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
import medrex.client.main.consultant.PanelPharmacistEvaluationReportFormRow;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.progressNotes.DoctorsProgressNotesFormRow;

import com.sX.frameFactory.FrameFactory;

public class PanelDoctorsProgressNotesFormRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6002641232562675310L;

	PanelPharmacistEvaluationReportFormRow panelPharmacistEvaluationReportFormRows[];

	int serial;
	int key;
	/**
	 * Create the panel
	 */
	JTextField dateChooser;
	JTextField txtTime;
	JTextField txtNotes;

	public PanelDoctorsProgressNotesFormRow(int num) {
		super();
		setPreferredSize(new Dimension(780, 26));
		setLayout(null);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 0, 780, 26);
		add(panel_4);

		final JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(153, 204, 102));
		panel_5.setBounds(0, 0, 122, 26);
		panel_4.add(panel_5);

		dateChooser = new JTextField();
		dateChooser.setEditable(false);
		dateChooser.setBackground(new Color(153, 204, 102));
		dateChooser.setBounds(21, 2, 100, 23);
		panel_5.add(dateChooser);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentDoctorsProgressNotesFormRow = getValueObject();
				openDialog();
			}
		});
		button.setBackground(new Color(153, 204, 102));
		button.setText("+");
		button.setBounds(0, 2, 22, 24);
		panel_5.add(button);

		final JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(new Color(153, 204, 102));
		panel_5_1.setBounds(121, 0, 122, 26);
		panel_4.add(panel_5_1);

		txtTime = new JTextField();
		txtTime.setEditable(false);
		txtTime.setBackground(new Color(153, 204, 102));
		txtTime.setBounds(10, 4, 102, 18);
		panel_5_1.add(txtTime);

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBackground(new Color(153, 204, 102));
		panel_5_1_1.setBounds(242, 0, 538, 26);
		panel_4.add(panel_5_1_1);

		txtNotes = new JTextField();
		txtNotes.setEditable(false);
		txtNotes.setBackground(new Color(153, 204, 102));
		txtNotes.setBounds(10, 4, 518, 18);
		panel_5_1_1.add(txtNotes);
		serial = num;

		updateData(null);
	}

	public void updateData(DoctorsProgressNotesFormRow row) {
		setValueObject(row);
	}

	public void doSave() {
		DoctorsProgressNotesFormRow r = getValueObject();
		if (r != null) {
			Global.panelDoctorsProgressNotesForm.rows.add(r);
		}
	}

	private void openDialog() {
		FrameProgressNotesFormDialog frame = (FrameProgressNotesFormDialog) FrameFactory
				.createWindowOfType(FrameProgressNotesFormDialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		PanelProgressNotesFormDialog dialogPanel = new PanelProgressNotesFormDialog();
		frame.setSize(dialogPanel.getSize().width,
				dialogPanel.getSize().height + 30);
		SwingUtils.center(frame);

		frame.getContentPane().add(dialogPanel);
		frame.setVisible(true);
		setValueObject(Global.currentDoctorsProgressNotesFormRow);
		Global.currentDoctorsProgressNotesFormRow = null;
	}

	private DoctorsProgressNotesFormRow getValueObject() {
		if (dateChooser.getText().equals("") && txtNotes.getText().equals("")
				&& txtTime.getText().equals("")) {
			return null;
		} else {
			DoctorsProgressNotesFormRow row = new DoctorsProgressNotesFormRow();
			row.setSerial(key);
			row.setRowSerial(serial);
			row.setFormSerial(Global.currentDoctorsProgressNotesKey);
			if (!dateChooser.getText().equals("")) {
				row.setDateRecord(new Date(dateChooser.getText()));
			}
			row.setNotes(txtNotes.getText());
			row.setTimeRecord(txtTime.getText());
			return row;
		}
	}

	private void setValueObject(DoctorsProgressNotesFormRow ref) {
		if (ref != null) {
			if (ref.getSerial() != 0) {
				key = ref.getSerial();
			}
			if (ref.getDateRecord() != null) {
				dateChooser.setText((new SimpleDateFormat("yyyy/MM/dd"))
						.format(ref.getDateRecord()));
			}
			txtTime.setText(ref.getTimeRecord());
			txtNotes.setText(ref.getNotes());

		}
	}
}
