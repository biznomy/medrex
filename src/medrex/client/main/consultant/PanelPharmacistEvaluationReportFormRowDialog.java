package medrex.client.main.consultant;

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
import medrex.commons.vo.consultant.PharmacistEvaluationReportFormRow;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.toedter.calendar.JDateChooser;

public class PanelPharmacistEvaluationReportFormRowDialog extends JPanel {
	private JxComboBox cmbSignature;
	private static final long serialVersionUID = 1L;
	private JTextField txtRcomments;
	private JLabel diagnosisLabel_2;
	private JDateChooser dcRdate;
	private JLabel orderLabel;
	private JxButton cancelButton;
	private JxButton saveButton;

	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public JLabel diagnosisLabel;
	public JPanel panel_2;
	int serial;

	/**
	 * Create the panel
	 */
	public PanelPharmacistEvaluationReportFormRowDialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(330, 180));
		setSize(new Dimension(330, 204));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 330, 138);
		add(panel_2);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(DEF_COLOR);
		diagnosisLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel.setBackground(DEF_COLOR);
		diagnosisLabel.setText("Comments");
		diagnosisLabel.setBounds(10, 60, 70, 14);
		panel_2.add(diagnosisLabel);

		txtRcomments = new JTextField();
		txtRcomments.setForeground(DEF_COLOR);
		txtRcomments.setBackground(Color.WHITE);
		txtRcomments.setBounds(110, 60, 200, 20);
		panel_2.add(txtRcomments);

		orderLabel = new JLabel();
		orderLabel.setForeground(DEF_COLOR);
		orderLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		orderLabel.setBackground(DEF_COLOR);
		orderLabel.setText("Date:");
		orderLabel.setBounds(10, 23, 70, 14);
		panel_2.add(orderLabel);

		dcRdate = new JDateChooser();
		dcRdate.setForeground(DEF_COLOR);
		dcRdate.setBackground(Color.WHITE);
		dcRdate.setDateFormatString("MM/dd/yyyy");
		// dcRdate.setDateFormatString(DateFormat.yyyyMMdd.getFormat());

		dcRdate.setBounds(110, 23, 200, 20);
		panel_2.add(dcRdate);

		diagnosisLabel_2 = new JLabel();
		diagnosisLabel_2.setForeground(DEF_COLOR);
		diagnosisLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_2.setBackground(DEF_COLOR);
		diagnosisLabel_2.setText("Signature");
		diagnosisLabel_2.setBounds(10, 97, 70, 14);
		panel_2.add(diagnosisLabel_2);

		cmbSignature = new JxComboBox();
		cmbSignature.setArc(0.4f);
		cmbSignature.setForeground(DEF_COLOR);
		cmbSignature.setBackground(Color.WHITE);
		cmbSignature.setBounds(110, 97, 200, 20);
		panel_2.add(cmbSignature);

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
					Global.framePharmacistEvaluationReportFormRowDialog
							.dispose();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(52, 144, 93, 23);
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
				Global.framePharmacistEvaluationReportFormRowDialog.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(170, 144, 104, 23);
		add(cancelButton);

		fillCombos();
		updateData();
	}

	public void fillCombos() {
		cmbSignature.setModel(new DefaultComboBoxModel(new String[] { "",
				"Peter", "John", "Mary" }));
	}

	public void updateData() {
		if (Global.currentPharmacistResidentEvaluationFormRow != null) {
			dcRdate.setDate(Global.currentPharmacistResidentEvaluationFormRow
					.getDcDate());
			txtRcomments
					.setText(Global.currentPharmacistResidentEvaluationFormRow
							.getComments());
			cmbSignature
					.setSelectedItem(Global.currentPharmacistResidentEvaluationFormRow
							.getSignature());

		} else {
			dcRdate.setDate(null);
			txtRcomments.setText("");
		}
	}

	public void doSave() {
		PharmacistEvaluationReportFormRow pro = new PharmacistEvaluationReportFormRow();
		pro.setDcDate(dcRdate.getDate());
		pro.setComments(txtRcomments.getText());
		pro.setSignature((String) cmbSignature.getSelectedItem());
		Global.currentPharmacistResidentEvaluationFormRow = pro;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dcRdate, "Date Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtRcomments, "Comments Field"))) {
			vRes.addAllFrom(temp);
		}
		if (cmbSignature.getSelectedItem().equals("")) {
			vRes.addError("Signature Field must not be empty!!!");
		}
		if (FieldValidation.isEmpty(vRes)) {
			// JOptionPane.showMessageDialog(null, "Validation successfull!!!");
			return true;
		} else {
			FieldValidation.Msgbox(vRes, "Pharmacist Evaluation Report");
			return false;
		}
	}
}