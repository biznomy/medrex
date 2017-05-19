package medrex.client.main.dietary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.dietary.DietaryPlazaHealthRow;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.toedter.calendar.JDateChooser;

public class PanelDietaryPlazaHealthRowDialog extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3804658418187124364L;
	private JxComboBox cmbNurseSign;
	private JxComboBox cmbDiticianSign;
	private JLabel diagnosisLabel_1;
	private JLabel diagnosisLabel_2;
	private JDateChooser dcDateField;
	private JLabel orderLabel;

	private JTextField txtRconsult;

	private JxButton cancelButton;
	private JxButton saveButton;

	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public JLabel diagnosisLabel;
	public JPanel panel_2;
	int serial;

	/**
	 * Create the panel
	 */
	public PanelDietaryPlazaHealthRowDialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(490, 240));
		setSize(new Dimension(490, 240));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 464, 197);
		add(panel_2);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(DEF_COLOR);
		diagnosisLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel.setText("Consultant Dietician Recomendations");
		diagnosisLabel.setBounds(10, 60, 218, 14);
		panel_2.add(diagnosisLabel);

		txtRconsult = new JTextField();
		txtRconsult.setForeground(DEF_COLOR);
		txtRconsult.setBounds(254, 57, 200, 20);
		panel_2.add(txtRconsult);

		orderLabel = new JLabel();
		orderLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		orderLabel.setForeground(DEF_COLOR);
		orderLabel.setText("Date:");
		orderLabel.setBounds(10, 23, 70, 14);
		panel_2.add(orderLabel);

		dcDateField = new JDateChooser();
		dcDateField.setForeground(DEF_COLOR);
		dcDateField.setDateFormatString("MM/dd/yyyy");

		// dcDateField.setDateFormatString(DateFormat.yyyyMMdd.getFormat());

		dcDateField.setBounds(254, 23, 200, 20);
		panel_2.add(dcDateField);

		diagnosisLabel_2 = new JLabel();
		diagnosisLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_2.setForeground(DEF_COLOR);
		diagnosisLabel_2.setText("Dietician Signature");
		diagnosisLabel_2.setBounds(10, 97, 109, 14);
		panel_2.add(diagnosisLabel_2);

		diagnosisLabel_1 = new JLabel();
		diagnosisLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_1.setForeground(DEF_COLOR);
		diagnosisLabel_1.setText("Nurse/Physician's Fellow Up & Signature");
		diagnosisLabel_1.setBounds(10, 133, 226, 14);
		panel_2.add(diagnosisLabel_1);

		cmbDiticianSign = new JxComboBox();
		cmbDiticianSign.setForeground(DEF_COLOR);
		cmbDiticianSign.setArc(0.4f);
		cmbDiticianSign.setBackground(Color.WHITE);
		cmbDiticianSign.setBounds(254, 94, 200, 20);
		panel_2.add(cmbDiticianSign);

		cmbNurseSign = new JxComboBox();
		cmbNurseSign.setForeground(DEF_COLOR);
		cmbNurseSign.setArc(0.4f);
		cmbNurseSign.setBackground(Color.WHITE);
		cmbNurseSign.setBounds(254, 130, 200, 20);
		panel_2.add(cmbNurseSign);

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
					Global.frameDietaryPlazaHealthRowDialog.dispose();

				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(128, 203, 93, 23);
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
				Global.currentDietaryPlazaHealthRow = null;
				Global.frameDietaryPlazaHealthRowDialog.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(265, 203, 104, 23);
		add(cancelButton);

		fillCombos();
		updateData();

	}

	public void fillCombos() {
		cmbDiticianSign.setModel(new DefaultComboBoxModel(new String[] { "",
				"Peter", "John", "Mary" }));
		cmbNurseSign.setModel(new DefaultComboBoxModel(new String[] { "",
				"sue", "Barbra", "Llex" }));

	}

	public void updateData() {
		if (Global.currentDietaryPlazaHealthRow != null) {
			dcDateField.setDate(Global.currentDietaryPlazaHealthRow
					.getDateField());
			txtRconsult.setText(Global.currentDietaryPlazaHealthRow
					.getConsultant());
			cmbDiticianSign.setSelectedItem(Global.currentDietaryPlazaHealthRow
					.getDieticianSign());
			cmbNurseSign.setSelectedItem(Global.currentDietaryPlazaHealthRow
					.getNurseSign());

		} else {

			// To Set the default Values;

			dcDateField.setDate(null);
			txtRconsult.setText("");
			cmbDiticianSign.setSelectedItem("");
			cmbNurseSign.setSelectedItem("");

			// cmbDiticianSign.setSelectedItem(Global.currentDietaryPlazaHealthRow.getDieticianSign(""));
			// cmbNurseSign.setSelectedItem(Global.currentDietaryPlazaHealthRow.getNurseSign());
			// //cmbDiticianSign.setText("");
			// txtRfellowup.setText("");
		}
	}

	public void doSave() {

		DietaryPlazaHealthRow pro = new DietaryPlazaHealthRow();

		pro.setDateField(dcDateField.getDate());
		pro.setConsultant(txtRconsult.getText());
		pro.setDieticianSign((String) cmbDiticianSign.getSelectedItem());
		pro.setNurseSign((String) cmbNurseSign.getSelectedItem());
		Global.currentDietaryPlazaHealthRow = pro;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dcDateField, "Date Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtRconsult, "Consultant Field"))) {
			vRes.addAllFrom(temp);
		}
		if (cmbDiticianSign.getSelectedItem().equals("")) {
			vRes.addError("Dietician Signature Field must not be empty!!!");
		}
		if (cmbNurseSign.getSelectedItem().equals("")) {
			vRes.addError("Nurse Signature Field must not be empty!!!");
		}
		if (FieldValidation.isEmpty(vRes)) {
			// JOptionPane.showMessageDialog(null, "Validation successfull!!!");
			return true;
		} else {
			FieldValidation.Msgbox(vRes, "Consultant Plaza  Health");
			return false;
		}
	}
}
