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
import medrex.commons.vo.historyAndPhysical.WeeklyWeightsFormRow;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxButton;

public class PanelWeeklyWeightsFormRowDialog extends JPanel {
	private JTextField txtWeight;
	private JTextField txtScale;
	private JTextField txtWeek4;
	private JTextField txtWeek3;
	private JTextField txtWeek2;
	private JTextField txtWeek1;
	private JTextField txtWt;
	private JTextField txtPhysician;
	private JTextField txtName;
	private JLabel diagnosisLabel_8;
	private JLabel diagnosisLabel_7;
	private JLabel diagnosisLabel_6;
	private JLabel diagnosisLabel_5;
	private JLabel diagnosisLabel_4;
	private JLabel diagnosisLabel_3;
	private JLabel diagnosisLabel_1;
	private static final long serialVersionUID = 1L;
	private JTextField txtRoom;
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
	public PanelWeeklyWeightsFormRowDialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(370, 410));
		setSize(new Dimension(373, 410));
		setLayout(null);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 367, 367);
		add(panel_2);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setForeground(DEF_COLOR);
		diagnosisLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel.setText("Room");
		diagnosisLabel.setBounds(10, 50, 70, 14);
		panel_2.add(diagnosisLabel);

		txtRoom = new JTextField();
		txtRoom.setForeground(DEF_COLOR);
		txtRoom.setBounds(139, 47, 200, 20);
		panel_2.add(txtRoom);

		orderLabel = new JLabel();
		orderLabel.setFont(new Font("Dialog", Font.BOLD, 11));
		orderLabel.setForeground(DEF_COLOR);
		orderLabel.setText("Name:");
		orderLabel.setBounds(10, 20, 70, 14);
		panel_2.add(orderLabel);
		// dcRdate.setDateFormatString("yyyy/MM/dd");

		diagnosisLabel_2 = new JLabel();
		diagnosisLabel_2.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_2.setForeground(DEF_COLOR);
		diagnosisLabel_2.setText("Physician");
		diagnosisLabel_2.setBounds(10, 80, 70, 14);
		panel_2.add(diagnosisLabel_2);

		diagnosisLabel_1 = new JLabel();
		diagnosisLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_1.setForeground(DEF_COLOR);
		diagnosisLabel_1.setText("Wt. Prior to Wkly");
		diagnosisLabel_1.setBounds(10, 110, 123, 14);
		panel_2.add(diagnosisLabel_1);

		diagnosisLabel_3 = new JLabel();
		diagnosisLabel_3.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_3.setForeground(DEF_COLOR);
		diagnosisLabel_3.setText("Week 1");
		diagnosisLabel_3.setBounds(10, 146, 46, 14);
		panel_2.add(diagnosisLabel_3);

		diagnosisLabel_4 = new JLabel();
		diagnosisLabel_4.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_4.setForeground(DEF_COLOR);
		diagnosisLabel_4.setText("Week 2");
		diagnosisLabel_4.setBounds(10, 180, 46, 14);
		panel_2.add(diagnosisLabel_4);

		diagnosisLabel_5 = new JLabel();
		diagnosisLabel_5.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_5.setForeground(DEF_COLOR);
		diagnosisLabel_5.setText("Week 3");
		diagnosisLabel_5.setBounds(10, 213, 46, 14);
		panel_2.add(diagnosisLabel_5);

		diagnosisLabel_6 = new JLabel();
		diagnosisLabel_6.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_6.setForeground(DEF_COLOR);
		diagnosisLabel_6.setText("Week 4");
		diagnosisLabel_6.setBounds(10, 246, 46, 14);
		panel_2.add(diagnosisLabel_6);

		diagnosisLabel_7 = new JLabel();
		diagnosisLabel_7.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_7.setForeground(DEF_COLOR);
		diagnosisLabel_7.setText("Scale Used");
		diagnosisLabel_7.setBounds(10, 282, 94, 14);
		panel_2.add(diagnosisLabel_7);

		diagnosisLabel_8 = new JLabel();
		diagnosisLabel_8.setFont(new Font("Dialog", Font.BOLD, 11));
		diagnosisLabel_8.setForeground(DEF_COLOR);
		diagnosisLabel_8.setText("Weight");
		diagnosisLabel_8.setBounds(10, 319, 46, 14);
		panel_2.add(diagnosisLabel_8);

		txtName = new JTextField();
		txtName.setForeground(DEF_COLOR);
		txtName.setBounds(139, 17, 200, 20);
		panel_2.add(txtName);

		txtPhysician = new JTextField();
		txtPhysician.setForeground(DEF_COLOR);
		txtPhysician.setBounds(139, 77, 200, 20);
		panel_2.add(txtPhysician);

		txtWt = new JTextField();
		txtWt.setForeground(DEF_COLOR);
		txtWt.setBounds(139, 107, 200, 20);
		panel_2.add(txtWt);

		txtWeek1 = new JTextField();
		txtWeek1.setForeground(DEF_COLOR);
		txtWeek1.setBounds(139, 143, 200, 20);
		panel_2.add(txtWeek1);

		txtWeek2 = new JTextField();
		txtWeek2.setForeground(DEF_COLOR);
		txtWeek2.setBounds(139, 177, 200, 20);
		panel_2.add(txtWeek2);

		txtWeek3 = new JTextField();
		txtWeek3.setForeground(DEF_COLOR);
		txtWeek3.setBounds(139, 210, 200, 20);
		panel_2.add(txtWeek3);

		txtWeek4 = new JTextField();
		txtWeek4.setForeground(DEF_COLOR);
		txtWeek4.setBounds(139, 243, 200, 20);
		panel_2.add(txtWeek4);

		txtScale = new JTextField();
		txtScale.setForeground(DEF_COLOR);
		txtScale.setBounds(139, 279, 200, 20);
		panel_2.add(txtScale);

		txtWeight = new JTextField();
		txtWeight.setForeground(DEF_COLOR);
		txtWeight.setBounds(139, 316, 200, 20);
		panel_2.add(txtWeight);

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
					Global.frameWeeklyWeightsFormRowDialog.dispose();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(42, 373, 93, 23);
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
				Global.frameWeeklyWeightsFormRowDialog.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(216, 373, 104, 23);
		add(cancelButton);

		updateData();
	}

	public void updateData() {
		if (Global.currentWeeklyWeightsFormRow != null) {
			txtName.setText(Global.currentWeeklyWeightsFormRow.getName());
			txtPhysician.setText(Global.currentWeeklyWeightsFormRow
					.getPhysician());
			txtRoom.setText(Global.currentWeeklyWeightsFormRow.getRoom());
			txtScale.setText(Global.currentWeeklyWeightsFormRow.getScaleUsed());
			txtWeek1.setText(Global.currentWeeklyWeightsFormRow.getWeight1());
			txtWeek2.setText(Global.currentWeeklyWeightsFormRow.getWeight2());
			txtWeek3.setText(Global.currentWeeklyWeightsFormRow.getWeight3());
			txtWeek4.setText(Global.currentWeeklyWeightsFormRow.getWeight4());
			txtWeight.setText(Global.currentWeeklyWeightsFormRow.getWeight());
			txtWt.setText(Global.currentWeeklyWeightsFormRow.getWeightPrior());

		} else {
			txtName.setText("");
			txtPhysician.setText("");
			txtRoom.setText("");
			txtScale.setText("");
			txtWeek1.setText("");
			txtWeek2.setText("");
			txtWeek3.setText("");
			txtWeek4.setText("");
			txtWeight.setText("");
			txtWt.setText("");
		}
	}

	public void doSave() {

		WeeklyWeightsFormRow pro = new WeeklyWeightsFormRow();
		pro.setName(txtName.getText());
		pro.setPhysician(txtPhysician.getText());
		pro.setRoom(txtRoom.getText());
		pro.setScaleUsed(txtScale.getText());
		pro.setWeight(txtWeight.getText());
		pro.setWeight1(txtWeek1.getText());
		pro.setWeight2(txtWeek2.getText());
		pro.setWeight3(txtWeek3.getText());
		pro.setWeight4(txtWeek4.getText());
		pro.setWeightPrior(txtWt.getText());
		Global.currentWeeklyWeightsFormRow = pro;
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtName,
				"Name Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtRoom,
				"Room Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtPhysician, "Physician Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtWt,
				"Wt. Prior to Wkly Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtWeek1, "Week1 Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtWeek2, "Week2 Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtWeek3, "Week3 Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtWeek4, "Week4 Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtScale, "Scale Used Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtWeight, "Weight Field"))) {
			vRes.addAllFrom(temp);
		}

		if (FieldValidation.isEmpty(vRes)) {
			return true;
		} else {
			FieldValidation.Msgbox(vRes, "Weekly Weights Form");
			return false;
		}
	}
}