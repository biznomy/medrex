package medrex.client.main.historyandphysical;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisFormRow;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;

public class PanelCumulativeDiagnosisFormRowDialog extends JPanel {
	private JTextField txtData3;
	private JTextField txtData2;

	private JLabel diagnosisLabel_4;
	private JLabel diagnosisLabel_1;
	private static final long serialVersionUID = 1L;
	private JTextField txtData1;
	private JxButton cancelButton;
	private JxButton saveButton;

	private static final Color DEF_COLOR = new Color(49, 104, 127);
	public JLabel diagnosisLabel;
	public JPanel panel_2;
	int serial;

	/**
	 * Create the panel
	 */
	public PanelCumulativeDiagnosisFormRowDialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(290, 240));
		setSize(new Dimension(290, 224));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 290, 148);
		add(panel_2);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(DEF_COLOR);
		diagnosisLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel.setText("Field 1");
		diagnosisLabel.setBounds(10, 22, 70, 14);
		panel_2.add(diagnosisLabel);

		txtData1 = new JTextField();
		txtData1.setForeground(DEF_COLOR);
		txtData1.setBounds(86, 19, 200, 20);
		panel_2.add(txtData1);
		// dcRdate.setDateFormatString("yyyy/MM/dd");

		diagnosisLabel_1 = new JLabel();
		diagnosisLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_1.setForeground(DEF_COLOR);
		diagnosisLabel_1.setText("Field 2");
		diagnosisLabel_1.setBounds(10, 69, 123, 14);
		panel_2.add(diagnosisLabel_1);

		diagnosisLabel_4 = new JLabel();
		diagnosisLabel_4.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_4.setForeground(DEF_COLOR);
		diagnosisLabel_4.setText("Field 3");
		diagnosisLabel_4.setBounds(10, 118, 46, 14);
		panel_2.add(diagnosisLabel_4);

		txtData2 = new JTextField();
		txtData2.setForeground(DEF_COLOR);
		txtData2.setBounds(86, 66, 200, 20);
		panel_2.add(txtData2);

		txtData3 = new JTextField();
		txtData3.setForeground(DEF_COLOR);
		txtData3.setBounds(86, 115, 200, 20);
		panel_2.add(txtData3);

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
					Global.frameCumulativeDiagnosisFormRowDialog.dispose();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(43, 169, 93, 23);
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
				Global.frameCumulativeDiagnosisFormRowDialog.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(176, 169, 104, 23);
		add(cancelButton);
		fillCombos();
		updateData();
	}

	public void fillCombos() {
	}

	public void updateData() {
		if (Global.currentCumulativeDiagnosisFormRow != null) {
			txtData1.setText(Global.currentCumulativeDiagnosisFormRow
					.getData1());
			txtData2.setText(Global.currentCumulativeDiagnosisFormRow
					.getData2());
			txtData3.setText(Global.currentCumulativeDiagnosisFormRow
					.getData3());

		} else {
			txtData1.setText("");
			txtData2.setText("");
			txtData3.setText("");
		}
	}

	public void doSave() {
		CumulativeDiagnosisFormRow pro = new CumulativeDiagnosisFormRow();
		pro.setData1(txtData1.getText());
		pro.setData2(txtData1.getText());
		pro.setData3(txtData1.getText());
		Global.currentCumulativeDiagnosisFormRow = pro;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtData1, "Field 1"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtData2, "Field 2 "))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtData3, "Field 3"))) {
			vRes.addAllFrom(temp);
		}
		if (FieldValidation.isEmpty(vRes)) {
			return true;
		} else {
			FieldValidation.Msgbox(vRes, "Cumulative Diagnosis Form");
			return false;
		}
	}
}