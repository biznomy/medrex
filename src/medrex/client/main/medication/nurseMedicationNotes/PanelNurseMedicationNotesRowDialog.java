package medrex.client.main.medication.nurseMedicationNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.toedter.calendar.JDateChooser;

public class PanelNurseMedicationNotesRowDialog extends JPanel {
	private JCheckBox checkBoxOBser;
	private JCheckBox checkBoxInit;
	private JxComboBox cmbSiteNonOral;
	private JTextField txtResult;
	private JTextField txtReason;
	private JTextField txtDrugStrength;

	private JLabel diagnosisLabel_6;
	private JLabel diagnosisLabel_5;
	private JLabel diagnosisLabel_4;
	private JLabel diagnosisLabel_3;
	private JLabel diagnosisLabel_1;
	private static final long serialVersionUID = 1L;
	private JTextField txtTime;
	private JLabel diagnosisLabel_2;
	private JLabel orderLabel;
	private JButton cancelButton;
	private JButton saveButton;
	public JLabel diagnosisLabel;
	public JPanel panel_2;
	int serial;
	private JDateChooser dcDate;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	/**
	 * Create the panel
	 */
	public PanelNurseMedicationNotesRowDialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(393, 350));
		setSize(new Dimension(419, 350));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 383, 286);
		add(panel_2);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(DEF_COLOR);
		diagnosisLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel.setBackground(Color.WHITE);
		diagnosisLabel.setText("Time");
		diagnosisLabel.setBounds(10, 50, 70, 14);
		panel_2.add(diagnosisLabel);

		txtTime = new JTextField();
		txtTime.setForeground(DEF_COLOR);
		txtTime.setBackground(Color.WHITE);
		txtTime.setBounds(139, 47, 200, 20);
		panel_2.add(txtTime);

		orderLabel = new JLabel();
		orderLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		orderLabel.setForeground(DEF_COLOR);
		orderLabel.setBackground(Color.WHITE);
		orderLabel.setText("Date");
		orderLabel.setBounds(10, 20, 70, 14);
		panel_2.add(orderLabel);
		// dcRdate.setDateFormatString("yyyy/MM/dd");

		diagnosisLabel_2 = new JLabel();
		diagnosisLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_2.setForeground(DEF_COLOR);
		diagnosisLabel_2.setBackground(Color.WHITE);
		diagnosisLabel_2.setText("Init");
		diagnosisLabel_2.setBounds(10, 80, 70, 14);
		panel_2.add(diagnosisLabel_2);

		diagnosisLabel_1 = new JLabel();
		diagnosisLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_1.setForeground(DEF_COLOR);
		diagnosisLabel_1.setBackground(Color.WHITE);
		diagnosisLabel_1.setText("Drug-Strength-Dose");
		diagnosisLabel_1.setBounds(10, 110, 123, 14);
		panel_2.add(diagnosisLabel_1);

		diagnosisLabel_3 = new JLabel();
		diagnosisLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_3.setForeground(DEF_COLOR);
		diagnosisLabel_3.setBackground(Color.WHITE);
		diagnosisLabel_3.setText("Site Non oral");
		diagnosisLabel_3.setBounds(10, 146, 94, 14);
		panel_2.add(diagnosisLabel_3);

		diagnosisLabel_4 = new JLabel();
		diagnosisLabel_4.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_4.setForeground(DEF_COLOR);
		diagnosisLabel_4.setBackground(Color.WHITE);
		diagnosisLabel_4.setText("Reason");
		diagnosisLabel_4.setBounds(10, 180, 46, 14);
		panel_2.add(diagnosisLabel_4);

		diagnosisLabel_5 = new JLabel();
		diagnosisLabel_5.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_5.setForeground(DEF_COLOR);
		diagnosisLabel_5.setBackground(Color.WHITE);
		diagnosisLabel_5.setText("Result");
		diagnosisLabel_5.setBounds(10, 213, 46, 14);
		panel_2.add(diagnosisLabel_5);

		diagnosisLabel_6 = new JLabel();
		diagnosisLabel_6.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_6.setForeground(DEF_COLOR);
		diagnosisLabel_6.setBackground(Color.WHITE);
		diagnosisLabel_6.setText("Obser Init");
		diagnosisLabel_6.setBounds(10, 246, 94, 14);
		panel_2.add(diagnosisLabel_6);

		txtDrugStrength = new JTextField();
		txtDrugStrength.setForeground(DEF_COLOR);
		txtDrugStrength.setBackground(Color.WHITE);
		txtDrugStrength.setBounds(139, 107, 200, 20);
		panel_2.add(txtDrugStrength);

		txtReason = new JTextField();
		txtReason.setForeground(DEF_COLOR);
		txtReason.setBackground(Color.WHITE);
		txtReason.setBounds(139, 177, 200, 20);
		panel_2.add(txtReason);

		txtResult = new JTextField();
		txtResult.setForeground(DEF_COLOR);
		txtResult.setBackground(Color.WHITE);
		txtResult.setBounds(139, 210, 200, 20);
		panel_2.add(txtResult);

		dcDate = new JDateChooser();
		dcDate.setForeground(DEF_COLOR);
		dcDate.setBackground(Color.WHITE);
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(139, 17, 200, 20);
		panel_2.add(dcDate);

		checkBoxInit = new JCheckBox();
		checkBoxInit.setForeground(DEF_COLOR);
		checkBoxInit.setBackground(Color.WHITE);
		checkBoxInit.setText("");
		checkBoxInit.setBounds(137, 73, 21, 24);
		panel_2.add(checkBoxInit);

		checkBoxOBser = new JCheckBox();
		checkBoxOBser.setForeground(DEF_COLOR);
		checkBoxOBser.setBackground(Color.WHITE);
		checkBoxOBser.setText("");
		checkBoxOBser.setBounds(136, 241, 21, 24);
		panel_2.add(checkBoxOBser);

		cmbSiteNonOral = new JxComboBox();
		cmbSiteNonOral.setForeground(DEF_COLOR);
		cmbSiteNonOral.setBackground(Color.WHITE);
		cmbSiteNonOral.setKeySelectionManager(null);
		cmbSiteNonOral.setBounds(139, 143, 200, 20);
		panel_2.add(cmbSiteNonOral);

		saveButton = new JxButton(0.4f);
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
					Global.frameNurseMedicationNotesRowDialog.dispose();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(42, 305, 93, 23);
		add(saveButton);

		cancelButton = new JxButton(0.4f);
		cancelButton.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		cancelButton.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameNurseMedicationNotesRowDialog.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(216, 305, 104, 23);
		add(cancelButton);
		fillCombos();
		updateData();
	}

	public void fillCombos() {
		cmbSiteNonOral.setModel(new DefaultComboBoxModel(new String[] { "",
				"1", "2", "3", "4", "5", "6", "7" }));
	}

	public void updateData() {
		if (Global.currentNurseMedicationNotesFormRow != null) {
			dcDate.setDate(Global.currentNurseMedicationNotesFormRow
					.getDateRecord());
			txtTime.setText(Global.currentNurseMedicationNotesFormRow
					.getTimeRecord());
			txtReason.setText(Global.currentNurseMedicationNotesFormRow
					.getReason());
			txtResult.setText(Global.currentNurseMedicationNotesFormRow
					.getResult());
			txtDrugStrength.setText(Global.currentNurseMedicationNotesFormRow
					.getDrugStrength());
			cmbSiteNonOral
					.setSelectedItem(Global.currentNurseMedicationNotesFormRow
							.getSite());
			checkBoxInit.setSelected(Global.currentNurseMedicationNotesFormRow
					.isNursesInitial());
			checkBoxOBser.setSelected(Global.currentNurseMedicationNotesFormRow
					.isObsInitial());

		} else {
			txtTime.setText("");
			txtReason.setText("");
			txtResult.setText("");
			txtDrugStrength.setText("");
			cmbSiteNonOral.setSelectedItem(null);
			dcDate.setDate(null);
			checkBoxInit.setSelected(false);
			checkBoxOBser.setSelected(false);
		}
	}

	public void doSave() {
		NurseMedicationNotesFormRow pro = new NurseMedicationNotesFormRow();
		pro.setDateRecord(dcDate.getDate());
		pro.setDrugStrength(txtDrugStrength.getText());
		pro.setTimeRecord(txtTime.getText());
		pro.setSite((String) cmbSiteNonOral.getSelectedItem());
		pro.setNursesInitial(checkBoxInit.isSelected());
		pro.setReason(txtReason.getText());
		pro.setResult(txtResult.getText());
		pro.setObsInitial(checkBoxOBser.isSelected());
		Global.currentNurseMedicationNotesFormRow = pro;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dcDate, "Date Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtTime,
				"Time Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtDrugStrength, "Drug-Strength-Dose Field"))) {
			vRes.addAllFrom(temp);
		}

		if (cmbSiteNonOral.getSelectedItem() == ""
				|| cmbSiteNonOral.getSelectedItem() == null) {
			vRes.addError("Site Non Oral Field is mandetory");
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtReason, "Reason Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtResult, "Result Field"))) {
			vRes.addAllFrom(temp);
		}

		if (FieldValidation.isEmpty(vRes)) {
			return true;
		} else {
			FieldValidation.Msgbox(vRes, "Nurse Medication Notes Form Form");
			return false;
		}
	}
}