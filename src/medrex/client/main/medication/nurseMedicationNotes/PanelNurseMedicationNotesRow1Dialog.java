package medrex.client.main.medication.nurseMedicationNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow1;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelNurseMedicationNotesRow1Dialog extends JPanel {
	private JCheckBox checkBoxInit;
	private JxComboBox cmbSignature;
	private JTextField txtTitle;

	private JLabel diagnosisLabel_4;
	private JLabel diagnosisLabel_3;
	private static final long serialVersionUID = 1L;
	private JLabel diagnosisLabel_2;
	private JxButton cancelButton;
	private JxButton saveButton;
	public JPanel panel_2;

	private static final Color DEF_COLOR = new Color(49, 104, 127);
	int serial;

	/**
	 * Create the panel
	 */
	public PanelNurseMedicationNotesRow1Dialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(370, 220));
		setSize(new Dimension(385, 130));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 360, 139);
		add(panel_2);
		// dcRdate.setDateFormatString("yyyy/MM/dd");

		diagnosisLabel_2 = new JLabel();
		diagnosisLabel_2.setForeground(DEF_COLOR);
		diagnosisLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_2.setText("Initial");
		diagnosisLabel_2.setBounds(10, 30, 70, 14);
		panel_2.add(diagnosisLabel_2);

		diagnosisLabel_3 = new JLabel();
		diagnosisLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_3.setForeground(DEF_COLOR);
		diagnosisLabel_3.setText("Full Signature");
		diagnosisLabel_3.setBounds(10, 68, 94, 14);
		panel_2.add(diagnosisLabel_3);

		diagnosisLabel_4 = new JLabel();
		diagnosisLabel_4.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_4.setForeground(DEF_COLOR);
		diagnosisLabel_4.setText("Title");
		diagnosisLabel_4.setBounds(10, 107, 46, 14);
		panel_2.add(diagnosisLabel_4);

		txtTitle = new JTextField();
		txtTitle.setForeground(DEF_COLOR);
		txtTitle.setBounds(137, 104, 200, 20);
		panel_2.add(txtTitle);

		checkBoxInit = new JCheckBox();
		checkBoxInit.setBackground(Color.WHITE);
		checkBoxInit.setForeground(DEF_COLOR);
		checkBoxInit.setText("");
		checkBoxInit.setBounds(137, 25, 200, 24);
		panel_2.add(checkBoxInit);

		cmbSignature = new JxComboBox();
		cmbSignature.setArc(0.4f);
		cmbSignature.setBackground(Color.WHITE);
		cmbSignature.setForeground(DEF_COLOR);
		cmbSignature.setKeySelectionManager(null);
		cmbSignature.setBounds(139, 65, 200, 20);
		panel_2.add(cmbSignature);

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
					Global.frameNurseMedicationNotesRow1Dialog.dispose();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(40, 145, 93, 23);
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
				Global.frameNurseMedicationNotesRow1Dialog.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(198, 145, 104, 23);
		add(cancelButton);
		fillCombos();
		updateData();
	}

	public void fillCombos() {
		cmbSignature.setModel(new DefaultComboBoxModel(new String[] { "",
				"Sue", "Marry", "Bush", "Obama" }));
	}

	public void updateData() {
		if (Global.currentNurseMedicationNotesFormRow1 != null) {
			txtTitle.setText(Global.currentNurseMedicationNotesFormRow1
					.getTitle());
			cmbSignature
					.setSelectedItem(Global.currentNurseMedicationNotesFormRow1
							.getSignature());
			checkBoxInit.setSelected(Global.currentNurseMedicationNotesFormRow1
					.isNursesInitial());

		} else {

			txtTitle.setText("");
			cmbSignature.setSelectedItem(null);
			checkBoxInit.setSelected(false);
		}
	}

	public void doSave() {

		NurseMedicationNotesFormRow1 pro = new NurseMedicationNotesFormRow1();
		pro.setNursesInitial(checkBoxInit.isSelected());
		cmbSignature.setSelectedItem(cmbSignature.getSelectedItem());
		pro.setTitle(txtTitle.getText());
		pro.setSignature((String) cmbSignature.getSelectedItem());
		Global.currentNurseMedicationNotesFormRow1 = pro;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (cmbSignature.getSelectedItem() == ""
				|| cmbSignature.getSelectedItem() == null) {
			vRes.addError("Full Signature Field is mandetory");
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtTitle, "Title Field"))) {
			vRes.addAllFrom(temp);
		}
		if (FieldValidation.isEmpty(vRes)) {
			return true;
		} else {
			FieldValidation.Msgbox(vRes,
					"Nurse Medication Notes Form Row1 Form");
			return false;
		}
	}
}