package medrex.client.main.consultant;

import java.awt.Color;
import java.awt.Dimension;
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
import medrex.commons.vo.consultant.PharmacistEvaluationReportFormRow;

import com.sX.frameFactory.FrameFactory;

public class PanelPharmacistEvaluationReportFormRow extends JPanel {

	private static final long serialVersionUID = 1L;

	JTextField txtComments;
	JTextField cmbSignature;
	JTextField dateChooser;

	int serial;
	int key;

	public PanelPharmacistEvaluationReportFormRow(int i) {
		super();
		setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		setSize(1200, 950);
		// Global.panelPharmacistEvaluationReportForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(780, 26));
		setLayout(null);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 780, 26);
		add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 0, 136, 26);
		panel_2.add(panel_3);

		dateChooser = new JTextField();
		dateChooser.setBackground(Color.WHITE);
		dateChooser.setEditable(false);
		dateChooser.setBounds(33, 2, 100, 22);
		panel_3.add(dateChooser);

		final JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				PharmacistEvaluationReportFormRow row = new PharmacistEvaluationReportFormRow();
				row.setComments(txtComments.getText());
				if (!dateChooser.getText().equals("")) {
					row.setDcDate(new Date(dateChooser.getText()));
				}
				row.setSignature(cmbSignature.getText());
				Global.currentPharmacistResidentEvaluationFormRow = row;
				openDialog();
			}
		});

		button.setText("+");
		button.setBounds(0, 0, 33, 26);
		panel_3.add(button);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(135, 0, 370, 26);
		panel_2.add(panel_3_1);

		txtComments = new JTextField();
		txtComments.setBackground(Color.WHITE);
		txtComments.setEditable(false);
		txtComments.setBounds(3, 3, 364, 20);
		panel_3_1.add(txtComments);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBackground(Color.WHITE);
		panel_3_1_1.setBounds(504, 0, 276, 26);
		panel_2.add(panel_3_1_1);

		cmbSignature = new JTextField();
		cmbSignature.setEditable(false);
		cmbSignature.setBackground(Color.WHITE);
		cmbSignature.setBounds(3, 3, 266, 20);
		panel_3_1_1.add(cmbSignature);

		serial = i;
		updateData(null);

	}

	public void updateData(PharmacistEvaluationReportFormRow row) {
		// key = serial;
		setValueObject(row);
	}

	public PharmacistEvaluationReportFormRow getValueObject() {
		if (dateChooser.getText().equals("")
				&& txtComments.getText().equals("")
				&& cmbSignature.getText().equals("")) {
			return null;
		} else {
			PharmacistEvaluationReportFormRow row = new PharmacistEvaluationReportFormRow();

			// changes in following

			row.setPharmacistEvaluationReportRowSerial(serial);

			row
					.setPharmacistEvaluationReportFormSerial(Global.currentPharmacistResidentEvaluationFormKey);
			row.setSerial(key);
			if (!dateChooser.getText().equals("")) {
				row.setDcDate(new Date(dateChooser.getText()));
			}
			row.setComments(txtComments.getText());
			row.setSignature(cmbSignature.getText());
			return row;
		}
	}

	public void setValueObject(PharmacistEvaluationReportFormRow ref) {
		if (ref != null) {

			// changes in following

			if (ref.getSerial() != 0) {
				key = ref.getSerial();
			}
			if (ref.getDcDate() != null) {
				dateChooser.setText(medrex.commons.enums.DateFormat.yyyyMMdd
						.getFormatter().format(ref.getDcDate()));
			}
			txtComments.setText(ref.getComments());
			cmbSignature.setText(ref.getSignature());
		}
	}

	private void openDialog() {
		FramePharmacistEvaluationReportFormRowDialog frame = (FramePharmacistEvaluationReportFormRowDialog) FrameFactory
				.createWindowOfType(FramePharmacistEvaluationReportFormRowDialog.class);
		frame.setModal(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		PanelPharmacistEvaluationReportFormRowDialog dialogPanel = new PanelPharmacistEvaluationReportFormRowDialog();
		// frame.setSize(dialogPanel.getSize().width,
		// dialogPanel.getSize().height + 30);
		SwingUtils.center(frame);
		frame.getContentPane().add(dialogPanel);
		frame.setVisible(true);

		setValueObject(Global.currentPharmacistResidentEvaluationFormRow);
		Global.currentPharmacistResidentEvaluationFormRow = null;
	}

	public void doSave()

	{
		PharmacistEvaluationReportFormRow r = getValueObject();
		if (r != null) {
			Global.panelPharmacistEvaluationReportForm.rows.add(r);
		}
	}

}
