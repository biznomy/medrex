package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.TreatmentPRNRecordForm;

public class PanelTreatmentPRNRecordForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2539297200835070786L;
	private JLabel prnTreatmentsLabel_1;
	private JPanel panelRows;
	private JLabel prnTreatmentsLabel;
	private JPanel panel_3;
	private JPanel panel_1;
	private JLabel medicationRecordLabel;

	PanelTreatmentPRNRecordFormRow panelPRNRows[];

	/**
	 * Create the panel
	 */
	public PanelTreatmentPRNRecordForm() {
		super();
		setBorder(new LineBorder(new Color(72, 61, 139), 1, false));
		setSize(1200, 950);
		Global.panelTreatmentPRNRecordForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1570, 1200));
		setLayout(null);

		medicationRecordLabel = new JLabel();
		medicationRecordLabel.setForeground(new Color(0, 0, 255));

		medicationRecordLabel.setFont(new Font("", Font.BOLD, 14));
		medicationRecordLabel.setText("DETACH AND DISCARD THIS PORTION");
		medicationRecordLabel.setBounds(361, 23, 290, 17);
		add(medicationRecordLabel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 62, 1489, 868);
		add(panel_1);

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(72, 61, 139));
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 1489, 26);
		panel_1.add(panel_3);

		prnTreatmentsLabel = new JLabel();
		prnTreatmentsLabel.setBounds(200, 0, 141, 30);
		panel_3.add(prnTreatmentsLabel);
		prnTreatmentsLabel.setForeground(new Color(255, 255, 255));
		prnTreatmentsLabel.setFont(new Font("", Font.BOLD, 14));
		prnTreatmentsLabel.setText("PRN TREATMENTS");

		prnTreatmentsLabel_1 = new JLabel();
		prnTreatmentsLabel_1.setForeground(new Color(255, 255, 255));
		prnTreatmentsLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		prnTreatmentsLabel_1.setText("ADMIN HOURS");
		prnTreatmentsLabel_1.setBounds(414, 0, 110, 30);
		panel_3.add(prnTreatmentsLabel_1);

		panelRows = new JPanel();
		panelRows.setBackground(Color.WHITE);
		panelRows.setLayout(null);
		panelRows.setBounds(0, 26, 1489, 826);
		panel_1.add(panelRows);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 950, 1489, 173);
		add(panel);
		panel.setLayout(null);

		final JLabel diagnosisLabel = new JLabel();
		diagnosisLabel.setBackground(Color.BLACK);
		diagnosisLabel.setForeground(new Color(128, 128, 128));
		diagnosisLabel.setText("DIAGNOSIS:");
		diagnosisLabel.setBounds(13, 19, 77, 29);
		panel.add(diagnosisLabel);

		final JTextField txtDiagnosis = new JTextField();
		txtDiagnosis.setBackground(Color.WHITE);
		txtDiagnosis.setEditable(false);
		txtDiagnosis.setBounds(96, 14, 767, 39);
		panel.add(txtDiagnosis);

		final JLabel diagnosisLabel_1 = new JLabel();
		diagnosisLabel_1.setForeground(new Color(128, 128, 128));
		diagnosisLabel_1.setBackground(Color.BLACK);
		diagnosisLabel_1.setText("ALLERGIES:");
		diagnosisLabel_1.setBounds(10, 64, 77, 29);
		panel.add(diagnosisLabel_1);

		final JTextField txtAllergies = new JTextField();
		txtAllergies.setBackground(Color.WHITE);
		txtAllergies.setEditable(false);
		txtAllergies.setBounds(96, 59, 767, 39);
		panel.add(txtAllergies);

		final JLabel diagnosisLabel_1_1 = new JLabel();
		diagnosisLabel_1_1.setForeground(new Color(128, 128, 128));
		diagnosisLabel_1_1.setBackground(Color.BLACK);
		diagnosisLabel_1_1.setText("PATIENT :");
		diagnosisLabel_1_1.setBounds(13, 112, 77, 29);
		panel.add(diagnosisLabel_1_1);

		final JTextField txtPatient = new JTextField();
		txtPatient.setBackground(Color.WHITE);
		txtPatient.setEditable(false);
		txtPatient.setBounds(95, 116, 155, 20);
		panel.add(txtPatient);

		final JLabel diagnosisLabel_1_1_1 = new JLabel();
		diagnosisLabel_1_1_1.setForeground(new Color(128, 128, 128));
		diagnosisLabel_1_1_1.setBackground(Color.BLACK);
		diagnosisLabel_1_1_1.setText("D.O.B");
		diagnosisLabel_1_1_1.setBounds(267, 112, 41, 29);
		panel.add(diagnosisLabel_1_1_1);

		final JTextField txtDob = new JTextField();
		txtDob.setEditable(false);
		txtDob.setBackground(Color.WHITE);
		txtDob.setBounds(306, 116, 89, 20);
		panel.add(txtDob);

		final JLabel diagnosisLabel_1_1_1_1 = new JLabel();
		diagnosisLabel_1_1_1_1.setForeground(new Color(128, 128, 128));
		diagnosisLabel_1_1_1_1.setBackground(Color.BLACK);
		diagnosisLabel_1_1_1_1.setText("SEX");
		diagnosisLabel_1_1_1_1.setBounds(405, 112, 41, 29);
		panel.add(diagnosisLabel_1_1_1_1);

		final JTextField txtSex = new JTextField();
		txtSex.setEditable(false);
		txtSex.setBackground(Color.WHITE);
		txtSex.setBounds(448, 116, 120, 20);
		panel.add(txtSex);

		final JLabel diagnosisLabel_1_1_1_2 = new JLabel();
		diagnosisLabel_1_1_1_2.setForeground(new Color(128, 128, 128));
		diagnosisLabel_1_1_1_2.setBackground(Color.BLACK);
		diagnosisLabel_1_1_1_2.setText("DR.");
		diagnosisLabel_1_1_1_2.setBounds(591, 112, 41, 29);
		panel.add(diagnosisLabel_1_1_1_2);

		final JTextField txtDr = new JTextField();
		txtDr.setEditable(false);
		txtDr.setBackground(Color.WHITE);
		txtDr.setBounds(638, 116, 120, 20);
		panel.add(txtDr);

		int i;

		panelPRNRows = new PanelTreatmentPRNRecordFormRow[7];

		for (i = 0; i < 7; i++) {
			panelPRNRows[i] = new PanelTreatmentPRNRecordFormRow(i + 1);
			panelPRNRows[i].setBounds(0, (i * 122), 1489, 123);
			panelRows.add(panelPRNRows[i]);
		}

		updateData();

	}

	public void updateData() {
		if (Global.currentResidenceKey != 0) {
			try {
				MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 7; i++) {
			panelPRNRows[i].updateData();
		}

	}

	public void doSave() {
		TreatmentPRNRecordForm mprf = null;

		if (Global.currentTreatmentPRNRecordFormKey == 0) {
			mprf = new TreatmentPRNRecordForm();
			mprf.setSerial(Global.currentTreatmentPRNRecordFormKey);
			mprf.setResidentId(Global.currentResidenceKey);
			try {
				Global.currentTreatmentPRNRecordFormKey = MedrexClientManager
						.getInstance().insertOrUpdateTreatmentPRNRecordForm(
								mprf);
			} catch (Exception e) {

			}

		}

		for (int i = 0; i < 7; i++) {
			panelPRNRows[i].doSave();
		}
	}

}
