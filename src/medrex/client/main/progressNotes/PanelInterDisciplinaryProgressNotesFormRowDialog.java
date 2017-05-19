package medrex.client.main.progressNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.progressNotes.InterDisciplinaryProgressNotesFormRow;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class PanelInterDisciplinaryProgressNotesFormRowDialog extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2127532513324667523L;
	private JTextField txtRdescription;
	private JLabel diagnosisLabel_1;
	private JTextField txtRdicipline;
	private JLabel diagnosisLabel_2;
	private JDateChooser dcRdate;
	private JLabel orderLabel;

	private JFormattedTextField txtRhours;

	private JxButton cancelButton;
	private JxButton saveButton;

	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public JLabel diagnosisLabel;
	public JPanel panel_2;
	int serial;

	/**
	 * Create the panel
	 */
	public PanelInterDisciplinaryProgressNotesFormRowDialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(330, 240));
		setSize(new Dimension(330, 273));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 330, 165);
		add(panel_2);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(DEF_COLOR);
		diagnosisLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel.setText("Time");
		diagnosisLabel.setBounds(10, 60, 70, 14);
		panel_2.add(diagnosisLabel);

		txtRhours = new JFormattedTextField(FieldFormatter.ZIP);
		txtRhours.setForeground(DEF_COLOR);
		txtRhours.setBounds(110, 60, 200, 20);
		panel_2.add(txtRhours);

		orderLabel = new JLabel();
		orderLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		orderLabel.setForeground(DEF_COLOR);
		orderLabel.setText("Date");
		orderLabel.setBounds(10, 23, 70, 14);
		panel_2.add(orderLabel);

		dcRdate = new JDateChooser();
		dcRdate.setForeground(DEF_COLOR);
		// dcRdate.setDateFormatString("yyyy/MM/dd");

		dcRdate.setDateFormatString("MM/dd/yyyy");

		dcRdate.setBounds(110, 23, 200, 20);
		panel_2.add(dcRdate);

		diagnosisLabel_2 = new JLabel();
		diagnosisLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_2.setForeground(DEF_COLOR);
		diagnosisLabel_2.setText("Descipline");
		diagnosisLabel_2.setBounds(10, 97, 70, 14);
		panel_2.add(diagnosisLabel_2);

		txtRdicipline = new JTextField();
		txtRdicipline.setForeground(DEF_COLOR);
		txtRdicipline.setBounds(110, 97, 200, 20);
		panel_2.add(txtRdicipline);

		diagnosisLabel_1 = new JLabel();
		diagnosisLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_1.setForeground(DEF_COLOR);
		diagnosisLabel_1.setText("Notes");
		diagnosisLabel_1.setBounds(10, 133, 70, 14);
		panel_2.add(diagnosisLabel_1);

		txtRdescription = new JTextField();
		txtRdescription.setForeground(DEF_COLOR);
		txtRdescription.setBounds(110, 130, 200, 20);
		panel_2.add(txtRdescription);

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
					Global.frameInterDisciplinaryProgressNotesFormRowDialog
							.dispose();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(50, 171, 93, 23);
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
				Global.currentInterdisciplinaryProgressNotesFormRow = null;
				Global.frameInterDisciplinaryProgressNotesFormRowDialog
						.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(161, 171, 104, 23);
		add(cancelButton);

		updateData();

	}

	public void updateData() {
		if (Global.currentInterdisciplinaryProgressNotesFormRow != null) {
			dcRdate.setDate(Global.currentInterdisciplinaryProgressNotesFormRow
					.getDateRecord());
			txtRhours
					.setText(Global.currentInterdisciplinaryProgressNotesFormRow
							.getTimeRecord());
			txtRdescription
					.setText(Global.currentInterdisciplinaryProgressNotesFormRow
							.getNotes());
			txtRdicipline
					.setText(Global.currentInterdisciplinaryProgressNotesFormRow
							.getDiscipline());
		} else {
			dcRdate.setDate(null);
			txtRhours.setText("");
			txtRdicipline.setText("");
			txtRdescription.setText("");
		}
	}

	public void doSave() {

		InterDisciplinaryProgressNotesFormRow pro = new InterDisciplinaryProgressNotesFormRow();

		pro.setDateRecord(dcRdate.getDate());
		pro.setTimeRecord(txtRhours.getText());
		pro.setNotes(txtRdescription.getText());
		pro.setDiscipline(txtRdicipline.getText());
		pro.setDiscipline(txtRdicipline.getText());
		Global.currentInterdisciplinaryProgressNotesFormRow = pro;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dcRdate, "Date Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtRhours, "Time Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtRdicipline, "Dicipline Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtRdescription, "Notes Field"))) {
			vRes.addAllFrom(temp);
		}
		if (FieldValidation.isEmpty(vRes)) {
			// JOptionPane.showMessageDialog(null, "Validation successfull!!!");
			return true;
		} else {
			FieldValidation.Msgbox(vRes, "Interdicipline Progress Notes");
			return false;
		}
	}
}
