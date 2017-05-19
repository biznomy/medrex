package medrex.client.main.medication.nurseTreatmentNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow1;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelNurseTreatmentNotesFormRow1Dialog extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6321845032195487709L;
	private JCheckBox cbInitialsDialog;
	private JLabel diagnosisLabel_3;
	private JLabel orderLabel;

	private JxButton cancelButton;
	private JxButton saveButton;
	public JLabel diagnosisLabel;
	public JPanel panel_2;
	private JxComboBox cmbShiftDialog;
	private JxComboBox cmbSignatureDialog;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	int serial;

	/**
	 * Create the panel
	 */
	public PanelNurseTreatmentNotesFormRow1Dialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(330, 200));
		setSize(new Dimension(339, 200));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 330, 129);
		add(panel_2);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(DEF_COLOR);
		diagnosisLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		diagnosisLabel.setText("Shift:");
		diagnosisLabel.setBounds(10, 50, 70, 14);
		panel_2.add(diagnosisLabel);

		orderLabel = new JLabel();
		orderLabel.setForeground(DEF_COLOR);
		orderLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		orderLabel.setText("Initials:");
		orderLabel.setBounds(10, 20, 70, 14);
		panel_2.add(orderLabel);

		diagnosisLabel_3 = new JLabel();
		diagnosisLabel_3.setForeground(DEF_COLOR);
		diagnosisLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		diagnosisLabel_3.setText("Signature:");
		diagnosisLabel_3.setBounds(10, 80, 59, 14);
		panel_2.add(diagnosisLabel_3);

		cbInitialsDialog = new JCheckBox();
		cbInitialsDialog.setForeground(DEF_COLOR);
		cbInitialsDialog.setBackground(Color.WHITE);
		cbInitialsDialog.setBounds(110, 20, 20, 20);
		panel_2.add(cbInitialsDialog);

		cmbShiftDialog = new JxComboBox();
		cmbShiftDialog.setArc(0.4f);
		cmbShiftDialog.setForeground(DEF_COLOR);
		cmbShiftDialog.setBackground(Color.WHITE);
		cmbShiftDialog.setBounds(110, 50, 123, 20);
		panel_2.add(cmbShiftDialog);

		cmbSignatureDialog = new JxComboBox();
		cmbSignatureDialog.setArc(0.4f);
		cmbSignatureDialog.setForeground(DEF_COLOR);
		cmbSignatureDialog.setBackground(Color.WHITE);
		cmbSignatureDialog.setBounds(110, 80, 123, 20);
		panel_2.add(cmbSignatureDialog);

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
					Global.frameNurseTreatmentNotesFormRow1DialogNew.dispose();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(40, 150, 93, 23);
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
				Global.currentNurseTreatmentNotesFormRow1 = null;
				Global.frameNurseTreatmentNotesFormRow1DialogNew.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(139, 150, 104, 23);
		add(cancelButton);

		fillCombos();
		updateData();
	}

	public void fillCombos() {

		cmbShiftDialog.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "7-3", "3-11", "11-7" }));
		cmbSignatureDialog.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "sue", "mary", "julie" }));
	}

	public void updateData() {
		if (Global.currentNurseTreatmentNotesFormRow1 != null) {

			cbInitialsDialog
					.setSelected(Global.currentNurseTreatmentNotesFormRow1
							.isNursesInitial());
			cmbShiftDialog
					.setSelectedItem(Global.currentNurseTreatmentNotesFormRow1
							.getShift());
			cmbSignatureDialog
					.setSelectedItem(Global.currentNurseTreatmentNotesFormRow1
							.getSignature());
		} else {

			cmbShiftDialog.setSelectedItem("");
			cmbSignatureDialog.setSelectedItem("");
			cbInitialsDialog.setSelected(false);
		}
	}

	public void doSave() {

		NurseTreatmentNotesFormRow1 pro = new NurseTreatmentNotesFormRow1();

		pro.setShift((String) cmbShiftDialog.getSelectedItem());
		pro.setSignature((String) cmbSignatureDialog.getSelectedItem());

		pro.setNursesInitial(cbInitialsDialog.isSelected());

		Global.currentNurseTreatmentNotesFormRow1 = pro;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				cmbShiftDialog, "Shift Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				cmbSignatureDialog, "Signature Field"))) {
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
