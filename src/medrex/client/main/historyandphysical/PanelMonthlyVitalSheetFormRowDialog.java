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
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetFormRow;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

public class PanelMonthlyVitalSheetFormRowDialog extends JPanel {
	private JTextField txtW4;
	private JTextField txtW3;
	private JTextField txtW2;
	private JTextField txtW1;
	private JDateChooser dateChooser4;
	private JDateChooser dateChooser3;
	private JDateChooser dateChooser2;
	private JDateChooser dateChooser1;
	private JTextField txtWeight;
	private JTextField txtTemp;
	private JTextField txtR;
	private JTextField txtP;
	private JTextField txtMonth;
	private JLabel diagnosisLabel_8;
	private JLabel diagnosisLabel_7;
	private JLabel diagnosisLabel_6;
	private JLabel diagnosisLabel_5;
	private JLabel diagnosisLabel_4;
	private JLabel diagnosisLabel_3;
	private JLabel diagnosisLabel_1;
	private static final long serialVersionUID = 1L;
	private JTextField txtBp;
	private JLabel diagnosisLabel_2;
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
	public PanelMonthlyVitalSheetFormRowDialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(450, 410));
		setSize(new Dimension(449, 410));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 450, 367);
		add(panel_2);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(DEF_COLOR);
		diagnosisLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel.setText("B/P");
		diagnosisLabel.setBounds(10, 50, 70, 14);
		panel_2.add(diagnosisLabel);

		txtBp = new JTextField();
		txtBp.setForeground(DEF_COLOR);
		txtBp.setBounds(139, 47, 200, 20);
		panel_2.add(txtBp);

		orderLabel = new JLabel();
		orderLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		orderLabel.setForeground(DEF_COLOR);
		orderLabel.setText("Month");
		orderLabel.setBounds(10, 20, 70, 14);
		panel_2.add(orderLabel);
		// dcRdate.setDateFormatString("yyyy/MM/dd");

		diagnosisLabel_2 = new JLabel();
		diagnosisLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_2.setForeground(DEF_COLOR);
		diagnosisLabel_2.setText("P");
		diagnosisLabel_2.setBounds(10, 80, 70, 14);
		panel_2.add(diagnosisLabel_2);

		diagnosisLabel_1 = new JLabel();
		diagnosisLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_1.setForeground(DEF_COLOR);
		diagnosisLabel_1.setText("R");
		diagnosisLabel_1.setBounds(10, 110, 123, 14);
		panel_2.add(diagnosisLabel_1);

		diagnosisLabel_3 = new JLabel();
		diagnosisLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_3.setForeground(DEF_COLOR);
		diagnosisLabel_3.setText("TEMP");
		diagnosisLabel_3.setBounds(10, 146, 46, 14);
		panel_2.add(diagnosisLabel_3);

		diagnosisLabel_4 = new JLabel();
		diagnosisLabel_4.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_4.setForeground(DEF_COLOR);
		diagnosisLabel_4.setText("WEIGHT");
		diagnosisLabel_4.setBounds(10, 180, 46, 14);
		panel_2.add(diagnosisLabel_4);

		diagnosisLabel_5 = new JLabel();
		diagnosisLabel_5.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_5.setForeground(DEF_COLOR);
		diagnosisLabel_5.setText("W#1  DATE");
		diagnosisLabel_5.setBounds(10, 213, 70, 14);
		panel_2.add(diagnosisLabel_5);

		diagnosisLabel_6 = new JLabel();
		diagnosisLabel_6.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_6.setForeground(DEF_COLOR);
		diagnosisLabel_6.setText("W#2 DATE");
		diagnosisLabel_6.setBounds(10, 246, 70, 14);
		panel_2.add(diagnosisLabel_6);

		diagnosisLabel_7 = new JLabel();
		diagnosisLabel_7.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_7.setForeground(DEF_COLOR);
		diagnosisLabel_7.setText("W#3 DATE");
		diagnosisLabel_7.setBounds(10, 282, 94, 14);
		panel_2.add(diagnosisLabel_7);

		diagnosisLabel_8 = new JLabel();
		diagnosisLabel_8.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_8.setForeground(DEF_COLOR);
		diagnosisLabel_8.setText("W#4 DATE");
		diagnosisLabel_8.setBounds(10, 319, 70, 14);
		panel_2.add(diagnosisLabel_8);

		txtMonth = new JTextField();
		txtMonth.setForeground(DEF_COLOR);
		txtMonth.setBounds(139, 17, 200, 20);
		panel_2.add(txtMonth);

		txtP = new JTextField();
		txtP.setForeground(DEF_COLOR);
		txtP.setBounds(139, 77, 200, 20);
		panel_2.add(txtP);

		txtR = new JTextField();
		txtR.setForeground(DEF_COLOR);
		txtR.setBounds(139, 107, 200, 20);
		panel_2.add(txtR);

		txtTemp = new JTextField();
		txtTemp.setForeground(DEF_COLOR);
		txtTemp.setBounds(139, 143, 200, 20);
		panel_2.add(txtTemp);

		txtWeight = new JTextField();
		txtWeight.setForeground(DEF_COLOR);
		txtWeight.setBounds(139, 177, 200, 20);
		panel_2.add(txtWeight);

		dateChooser1 = new JDateChooser();
		dateChooser1.setDateFormatString("MM/dd/yyyy");
		dateChooser1.setForeground(DEF_COLOR);
		dateChooser1.setBounds(299, 207, 123, 20);
		panel_2.add(dateChooser1);

		dateChooser2 = new JDateChooser();
		dateChooser2.setDateFormatString("MM/dd/yyyy");
		dateChooser2.setForeground(DEF_COLOR);
		dateChooser2.setBounds(299, 246, 123, 20);
		panel_2.add(dateChooser2);

		dateChooser3 = new JDateChooser();
		dateChooser3.setDateFormatString("MM/dd/yyyy");
		dateChooser3.setForeground(DEF_COLOR);
		dateChooser3.setBounds(299, 282, 123, 20);
		panel_2.add(dateChooser3);

		dateChooser4 = new JDateChooser();
		dateChooser4.setDateFormatString("MM/dd/yyyy");
		dateChooser4.setForeground(DEF_COLOR);
		dateChooser4.setBounds(299, 319, 123, 20);
		panel_2.add(dateChooser4);

		txtW1 = new JTextField();
		txtW1.setForeground(DEF_COLOR);
		txtW1.setBounds(139, 210, 92, 20);
		panel_2.add(txtW1);

		txtW2 = new JTextField();
		txtW2.setForeground(DEF_COLOR);
		txtW2.setBounds(139, 243, 92, 20);
		panel_2.add(txtW2);

		txtW3 = new JTextField();
		txtW3.setForeground(DEF_COLOR);
		txtW3.setBounds(139, 279, 92, 20);
		panel_2.add(txtW3);

		txtW4 = new JTextField();
		txtW4.setForeground(DEF_COLOR);
		txtW4.setBounds(139, 316, 92, 20);
		panel_2.add(txtW4);

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
					Global.frameMonthlyVitalSheetFormRowDialog.dispose();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(129, 373, 93, 23);
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
				Global.frameMonthlyVitalSheetFormRowDialog.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(265, 373, 104, 23);
		add(cancelButton);

		updateData();
	}

	public void updateData() {
		if (Global.currentMonthlyVitalSheetFormRow != null) {
			txtMonth.setText(Global.currentMonthlyVitalSheetFormRow.getMonth());
			dateChooser1.setDate(Global.currentMonthlyVitalSheetFormRow
					.getDate1());
			dateChooser2.setDate(Global.currentMonthlyVitalSheetFormRow
					.getDate2());
			dateChooser3.setDate(Global.currentMonthlyVitalSheetFormRow
					.getDate3());
			dateChooser4.setDate(Global.currentMonthlyVitalSheetFormRow
					.getDate4());
			txtP.setText(Global.currentMonthlyVitalSheetFormRow.getP());
			txtBp.setText(Global.currentMonthlyVitalSheetFormRow.getBp());
			txtTemp.setText(Global.currentMonthlyVitalSheetFormRow.getTemp());
			txtWeight.setText(Global.currentMonthlyVitalSheetFormRow
					.getWeight());
			txtR.setText(Global.currentMonthlyVitalSheetFormRow.getR());
			txtW1.setText(Global.currentMonthlyVitalSheetFormRow.getW1());
			txtW2.setText(Global.currentMonthlyVitalSheetFormRow.getW2());
			txtW3.setText(Global.currentMonthlyVitalSheetFormRow.getW3());
			txtW4.setText(Global.currentMonthlyVitalSheetFormRow.getW4());

		} else {
			txtMonth.setText("");
			txtP.setText("");
			txtBp.setText("");
			dateChooser1.setDate(null);
			dateChooser2.setDate(null);
			dateChooser3.setDate(null);
			dateChooser4.setDate(null);
			txtTemp.setText("");
			txtWeight.setText("");
			txtR.setText("");
			txtW1.setText("");
			txtW2.setText("");
			txtW3.setText("");
			txtW4.setText("");
			txtWeight.setText("");

		}
	}

	public void doSave() {

		MonthlyVitalSheetFormRow pro = new MonthlyVitalSheetFormRow();
		pro.setMonth(txtMonth.getText());
		pro.setBp(txtBp.getText());
		pro.setDate1(dateChooser1.getDate());
		pro.setDate2(dateChooser2.getDate());
		pro.setDate3(dateChooser3.getDate());
		pro.setDate4(dateChooser4.getDate());
		pro.setP(txtP.getText());
		pro.setR(txtR.getText());
		pro.setTemp(txtTemp.getText());
		pro.setW1(txtW1.getText());
		pro.setW2(txtW2.getText());
		pro.setW3(txtW3.getText());
		pro.setW4(txtW4.getText());
		pro.setWeight(txtWeight.getText());
		Global.currentMonthlyVitalSheetFormRow = pro;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtMonth, "Month  Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtBp,
				"BP  Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtP,
				"P Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtR,
				"R Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtTemp,
				"Temperature Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtWeight, "Weight Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtW1,
				"Weight1 Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtW2,
				"Weight2 Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtW3,
				"Weight3 Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtW4,
				"Weight4 Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dateChooser1, "W#1  DATE Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dateChooser2, "W#2  DATE Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dateChooser3, "W#3  DATE Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dateChooser4, "W#4  DATE Field"))) {
			vRes.addAllFrom(temp);
		}

		if (FieldValidation.isEmpty(vRes)) {
			return true;
		} else {
			FieldValidation.Msgbox(vRes, "Monthly  Vital Form");
			return false;
		}
	}
}