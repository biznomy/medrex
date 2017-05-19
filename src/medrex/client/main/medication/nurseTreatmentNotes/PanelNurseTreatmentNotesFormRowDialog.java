package medrex.client.main.medication.nurseTreatmentNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class PanelNurseTreatmentNotesFormRowDialog extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8403392499527672169L;
	private JTextField txtTreatmentDialog;
	private JLabel diagnosisLabel_4;
	private JCheckBox cbInitialsDialog;
	private JLabel diagnosisLabel_3;
	private JTextField txtReasonDialog;
	private JLabel diagnosisLabel_1;
	private JTextField txtResultDialog;
	private JLabel diagnosisLabel_2;
	private JDateChooser dcDateFieldDialog;
	private JLabel orderLabel;

	private JFormattedTextField txtTimeDialog;

	private JxButton cancelButton;
	private JxButton saveButton;

	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public JLabel diagnosisLabel;
	public JPanel panel_2;
	int serial;

	/**
	 * Create the panel
	 */
	public PanelNurseTreatmentNotesFormRowDialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(330, 300));
		setSize(new Dimension(339, 302));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 330, 223);
		add(panel_2);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(DEF_COLOR);
		diagnosisLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel.setText("Time:");
		diagnosisLabel.setBounds(10, 50, 70, 14);
		panel_2.add(diagnosisLabel);

		txtTimeDialog = new JFormattedTextField(FieldFormatter.ZIP);
		txtTimeDialog.setForeground(DEF_COLOR);
		txtTimeDialog.setBounds(110, 50, 200, 20);
		panel_2.add(txtTimeDialog);

		orderLabel = new JLabel();
		orderLabel.setForeground(DEF_COLOR);
		orderLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		orderLabel.setText("Date:");
		orderLabel.setBounds(10, 20, 70, 14);
		panel_2.add(orderLabel);

		dcDateFieldDialog = new JDateChooser();
		dcDateFieldDialog.setForeground(DEF_COLOR);
		dcDateFieldDialog.setDateFormatString("MM/dd/yyyy");

		dcDateFieldDialog.setBounds(110, 20, 200, 20);
		panel_2.add(dcDateFieldDialog);

		diagnosisLabel_2 = new JLabel();
		diagnosisLabel_2.setForeground(DEF_COLOR);
		diagnosisLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_2.setText("Result:");
		diagnosisLabel_2.setBounds(10, 140, 70, 14);
		panel_2.add(diagnosisLabel_2);

		txtResultDialog = new JTextField();
		txtResultDialog.setForeground(DEF_COLOR);
		txtResultDialog.setBounds(110, 140, 200, 20);
		panel_2.add(txtResultDialog);

		diagnosisLabel_1 = new JLabel();
		diagnosisLabel_1.setForeground(DEF_COLOR);
		diagnosisLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_1.setText("Reason:");
		diagnosisLabel_1.setBounds(10, 170, 70, 14);
		panel_2.add(diagnosisLabel_1);

		txtReasonDialog = new JTextField();
		txtReasonDialog.setForeground(DEF_COLOR);
		txtReasonDialog.setBounds(110, 170, 200, 20);
		panel_2.add(txtReasonDialog);

		diagnosisLabel_3 = new JLabel();
		diagnosisLabel_3.setForeground(DEF_COLOR);
		diagnosisLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_3.setText("Initials:");
		diagnosisLabel_3.setBounds(10, 80, 59, 14);
		panel_2.add(diagnosisLabel_3);

		cbInitialsDialog = new JCheckBox();
		cbInitialsDialog.setForeground(DEF_COLOR);
		cbInitialsDialog.setBackground(Color.WHITE);
		cbInitialsDialog.setBounds(110, 80, 20, 20);
		panel_2.add(cbInitialsDialog);

		diagnosisLabel_4 = new JLabel();
		diagnosisLabel_4.setForeground(DEF_COLOR);
		diagnosisLabel_4.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_4.setText("Treatment:");
		diagnosisLabel_4.setBounds(10, 110, 70, 14);
		panel_2.add(diagnosisLabel_4);

		txtTreatmentDialog = new JTextField();
		txtTreatmentDialog.setForeground(DEF_COLOR);
		txtTreatmentDialog.setBounds(110, 110, 200, 20);
		panel_2.add(txtTreatmentDialog);

		saveButton = new JxButton();
		saveButton.setArc(0.4f);
		saveButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		saveButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent arg0) {

				if (doValidate()) {
					doSave();
					Global.frameNurseTreatmentNotesFormRowDialogNew.dispose();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(42, 233, 93, 23);
		add(saveButton);

		cancelButton = new JxButton(0.4f);
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cancelButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentNurseTreatmentNotesFormRow = null;
				Global.frameNurseTreatmentNotesFormRowDialogNew.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(153, 233, 104, 23);
		add(cancelButton);

		updateData();
	}

	public void updateData() {
		if (Global.currentNurseTreatmentNotesFormRow != null) {
			dcDateFieldDialog.setDate(Global.currentNurseTreatmentNotesFormRow
					.getDateRecord());
			txtTimeDialog.setText(Global.currentNurseTreatmentNotesFormRow
					.getTimeRecord());
			txtReasonDialog.setText(Global.currentNurseTreatmentNotesFormRow
					.getReason());
			txtResultDialog.setText(Global.currentNurseTreatmentNotesFormRow
					.getResult());
			txtTreatmentDialog.setText(Global.currentNurseTreatmentNotesFormRow
					.getTreatment());

			cbInitialsDialog
					.setSelected(Global.currentNurseTreatmentNotesFormRow
							.isNursesInitial());

		} else {
			dcDateFieldDialog.setDate(null);
			txtTimeDialog.setText("");
			txtResultDialog.setText("");
			txtReasonDialog.setText("");
			txtTreatmentDialog.setText("");
			cbInitialsDialog.setSelected(false);
		}
	}

	public void doSave() {

		NurseTreatmentNotesFormRow pro = new NurseTreatmentNotesFormRow();

		pro.setDateRecord(dcDateFieldDialog.getDate());
		pro.setTimeRecord(txtTimeDialog.getText());
		pro.setReason(txtReasonDialog.getText());
		pro.setResult(txtResultDialog.getText());
		pro.setTreatment(txtTreatmentDialog.getText());

		pro.setNursesInitial(cbInitialsDialog.isSelected());

		Global.currentNurseTreatmentNotesFormRow = pro;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dcDateFieldDialog, "Date Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtTimeDialog, "Time Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtResultDialog, "Result Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtReasonDialog, "Reason Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtTreatmentDialog, "Treatment Field"))) {
			vRes.addAllFrom(temp);
		}

		if (FieldValidation.isEmpty(vRes)) {
			// JOptionPane.showMessageDialog(null, "Validation successfull!!!");
			return true;
		} else {
			FieldValidation.Msgbox(vRes, "Nurse Treatment Notes");
			return false;
		}
	}
}
