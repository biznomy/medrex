package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.MedicationRoutineRecordForm;
import medrex.commons.vo.resident.ResidentMain;

public class PanelMedicationRoutineRecordForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1273480068237376954L;
	private JLabel prnMedicationsLabel_1;
	private JPanel panelRows;
	private JLabel eIndicateSiteLabel;
	private JLabel dPrnMedicationsLabel;
	private JLabel cStateReasonLabel;
	private JLabel rightDeltoidLabel_3;
	private JLabel aPutInitialsLabel;
	private JPanel panel_111;
	private JLabel label_17;
	private JLabel label_16;
	private JLabel label_15;
	private JLabel rightDeltoidLabel_2;
	private JLabel label_14;
	private JPanel panel_110;
	private JLabel label_13;
	private JLabel label_12;
	private JLabel label_11;
	private JLabel rightDeltoidLabel_1;
	private JLabel label_7;
	private JPanel panel_109;
	private JLabel label_10;
	private JLabel label_9;
	private JLabel label_8;
	private JLabel rightDeltoidLabel;
	private JLabel label_6;
	private JPanel panel_108;
	private JLabel label_5;
	private JLabel label_4;
	private JLabel label_3;
	private JPanel panel_100;
	private JLabel label_2;
	private JTextField txtPhysicianName;
	private JLabel facilityNameLabel_24;
	private JPanel panel_106;
	private JTextField txtSex;
	private JLabel facilityNameLabel_23;
	private JPanel panel_105;
	private JTextField txtAdmissionDate;
	private JLabel facilityNameLabel_22;
	private JPanel panel_104;
	private JTextField txtMedRecordNum;
	private JLabel facilityNameLabel_21;
	private JPanel panel_103;
	private JTextField txtRoomNum;
	private JLabel facilityNameLabel_20;
	private JPanel panel_102;
	private JTextField txtResidentName;
	private JLabel facilityNameLabel_19;
	private JPanel panel_101;
	private JLabel label;
	private JPanel panel_99;
	private JPanel panel_83;
	private JTextArea txtDiagnosis;
	private JLabel facilityNameLabel_18;
	private JPanel panel_98;
	private JTextField txtDiet;
	private JLabel facilityNameLabel_17;
	private JPanel panel_97;
	private JTextField txtAllergies;
	private JLabel facilityNameLabel_16;
	private JPanel panel_96;
	private JLabel prnMedicationsLabel;
	private JPanel panel_3;
	private JPanel panel_1;
	private JLabel medicationRecordLabel;
	private JTextField txtPeriod;
	private JLabel facilityNameLabel_1;
	private JPanel panel_2;
	private JTextField txtFacilityName;
	private JLabel facilityNameLabel;
	private JPanel panel;
	private JTextArea seeSection4TextArea;

	PanelMedicationRoutineRecordFormRow panelRoutineRows[];

	/**
	 * Create the panel
	 */
	public PanelMedicationRoutineRecordForm() {
		super();
		setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		setSize(1200, 950);
		Global.panelMedicationRoutineRecordForm = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1570, 1200));
		setLayout(null);

		seeSection4TextArea = new JTextArea();
		seeSection4TextArea.setEditable(false);
		seeSection4TextArea.setForeground(new Color(128, 0, 0));
		seeSection4TextArea.setWrapStyleWord(true);
		seeSection4TextArea.setLineWrap(true);
		seeSection4TextArea.setText("see Section 4");
		seeSection4TextArea.setBounds(10, 10, 92, 51);
		add(seeSection4TextArea);

		panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setLayout(null);
		panel.setBounds(108, 10, 364, 51);
		add(panel);

		facilityNameLabel = new JLabel();
		facilityNameLabel.setBounds(20, 0, 120, 17);
		panel.add(facilityNameLabel);
		facilityNameLabel.setForeground(new Color(128, 0, 0));
		facilityNameLabel.setText("Facility Name");

		txtFacilityName = new JTextField();
		txtFacilityName.setEditable(false);
		txtFacilityName.setBorder(null);
		txtFacilityName.setBackground(new Color(255, 235, 205));
		txtFacilityName.setBounds(20, 23, 225, 21);
		panel.add(txtFacilityName);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(204, 255, 204));
		panel_2.setBounds(471, 10, 364, 51);
		add(panel_2);

		facilityNameLabel_1 = new JLabel();
		facilityNameLabel_1.setForeground(new Color(128, 0, 0));
		facilityNameLabel_1.setText("Period");
		facilityNameLabel_1.setBounds(20, 0, 120, 17);
		panel_2.add(facilityNameLabel_1);

		txtPeriod = new JTextField();
		txtPeriod.setEditable(false);
		txtPeriod.setBackground(new Color(204, 255, 204));
		txtPeriod.setBounds(20, 23, 225, 21);
		panel_2.add(txtPeriod);

		medicationRecordLabel = new JLabel();
		medicationRecordLabel.setForeground(new Color(0, 128, 0));
		medicationRecordLabel.setFont(new Font("", Font.BOLD, 14));
		medicationRecordLabel.setText("MEDICATION RECORD");
		medicationRecordLabel.setBounds(841, 44, 236, 17);
		add(medicationRecordLabel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 62, 1489, 1105);
		add(panel_1);

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(34, 139, 34));
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 1489, 26);
		panel_1.add(panel_3);

		prnMedicationsLabel = new JLabel();
		prnMedicationsLabel.setBounds(200, 0, 145, 30);
		panel_3.add(prnMedicationsLabel);
		prnMedicationsLabel.setForeground(new Color(255, 255, 255));
		prnMedicationsLabel.setFont(new Font("", Font.BOLD, 14));
		prnMedicationsLabel.setText("Routine Medications");

		prnMedicationsLabel_1 = new JLabel();
		prnMedicationsLabel_1.setForeground(new Color(255, 255, 255));
		prnMedicationsLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		prnMedicationsLabel_1.setText("HOURS");
		prnMedicationsLabel_1.setBounds(462, 0, 145, 30);
		panel_3.add(prnMedicationsLabel_1);

		panel_96 = new JPanel();
		panel_96.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_96.setLayout(null);
		panel_96.setBackground(new Color(255, 235, 205));
		panel_96.setBounds(0, 858, 364, 51);
		panel_1.add(panel_96);

		facilityNameLabel_16 = new JLabel();
		facilityNameLabel_16.setForeground(new Color(128, 0, 0));
		facilityNameLabel_16.setText("Allergies");
		facilityNameLabel_16.setBounds(20, 0, 120, 17);
		panel_96.add(facilityNameLabel_16);

		txtAllergies = new JTextField();
		txtAllergies.setEditable(false);
		txtAllergies.setBackground(new Color(255, 235, 205));
		txtAllergies.setBounds(20, 23, 334, 21);
		panel_96.add(txtAllergies);

		panel_97 = new JPanel();
		panel_97.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_97.setLayout(null);
		panel_97.setBackground(new Color(204, 255, 204));
		panel_97.setBounds(364, 858, 364, 51);
		panel_1.add(panel_97);

		facilityNameLabel_17 = new JLabel();
		facilityNameLabel_17.setForeground(new Color(0, 128, 0));
		facilityNameLabel_17.setText("Diet");
		facilityNameLabel_17.setBounds(20, 0, 120, 17);
		panel_97.add(facilityNameLabel_17);

		txtDiet = new JTextField();
		txtDiet.setEditable(false);
		txtDiet.setBackground(new Color(204, 255, 204));
		txtDiet.setBounds(20, 23, 334, 21);
		panel_97.add(txtDiet);

		panel_98 = new JPanel();
		panel_98.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_98.setLayout(null);
		panel_98.setBackground(Color.WHITE);
		panel_98.setBounds(0, 907, 728, 89);
		panel_1.add(panel_98);

		facilityNameLabel_18 = new JLabel();
		facilityNameLabel_18.setForeground(new Color(0, 128, 0));
		facilityNameLabel_18.setText("Diagnosis");
		facilityNameLabel_18.setBounds(20, 0, 120, 17);
		panel_98.add(facilityNameLabel_18);

		txtDiagnosis = new JTextArea();
		txtDiagnosis.setEditable(false);
		txtDiagnosis.setBounds(20, 23, 698, 56);
		panel_98.add(txtDiagnosis);

		panel_83 = new JPanel();
		panel_83.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_83.setBackground(Color.WHITE);
		panel_83.setLayout(null);
		panel_83.setBounds(728, 857, 755, 248);
		panel_1.add(panel_83);

		panel_100 = new JPanel();
		panel_100.setBackground(Color.WHITE);
		panel_100.setLayout(null);
		panel_100.setBounds(10, 140, 735, 80);
		panel_83.add(panel_100);

		panel_99 = new JPanel();
		panel_99.setBounds(0, 0, 163, 80);
		panel_100.add(panel_99);
		panel_99.setBackground(Color.WHITE);
		panel_99.setLayout(null);

		label = new JLabel();
		label.setForeground(new Color(0, 128, 0));
		label.setFont(new Font("", Font.PLAIN, 11));
		label.setText("1. RIGHT DORSAL GLUTEUS");
		label.setBounds(10, 5, 147, 16);
		panel_99.add(label);

		label_2 = new JLabel();
		label_2.setForeground(new Color(0, 128, 0));
		label_2.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_2.setText("2. LEFT DORSAL GLUTEUS");
		label_2.setBounds(10, 20, 159, 16);
		panel_99.add(label_2);

		label_3 = new JLabel();
		label_3.setForeground(new Color(0, 128, 0));
		label_3.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_3.setText("3. RIGHT VENTRAL GLUTEUS");
		label_3.setBounds(10, 35, 159, 16);
		panel_99.add(label_3);

		label_4 = new JLabel();
		label_4.setForeground(new Color(0, 128, 0));
		label_4.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_4.setText("4. LEFT VENTRAL GLUTEUS");
		label_4.setBounds(10, 49, 159, 16);
		panel_99.add(label_4);

		label_5 = new JLabel();
		label_5.setForeground(new Color(0, 128, 0));
		label_5.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_5.setText("5. RIGHT LATERAL THIGH");
		label_5.setBounds(10, 62, 159, 16);
		panel_99.add(label_5);

		panel_108 = new JPanel();
		panel_108.setLayout(null);
		panel_108.setBackground(Color.WHITE);
		panel_108.setBounds(166, 0, 140, 80);
		panel_100.add(panel_108);

		label_6 = new JLabel();
		label_6.setForeground(new Color(0, 128, 0));
		label_6.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_6.setText("6. LEFT LATERAL THIGH");
		label_6.setBounds(10, 5, 147, 16);
		panel_108.add(label_6);

		rightDeltoidLabel = new JLabel();
		rightDeltoidLabel.setForeground(new Color(0, 128, 0));
		rightDeltoidLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		rightDeltoidLabel.setText("7. RIGHT DELTOID");
		rightDeltoidLabel.setBounds(10, 20, 159, 16);
		panel_108.add(rightDeltoidLabel);

		label_8 = new JLabel();
		label_8.setForeground(new Color(0, 128, 0));
		label_8.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_8.setText("8. LEFT DELTOID");
		label_8.setBounds(10, 35, 159, 16);
		panel_108.add(label_8);

		label_9 = new JLabel();
		label_9.setForeground(new Color(0, 128, 0));
		label_9.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_9.setText("9. RIGHT UPPER ARM");
		label_9.setBounds(10, 49, 159, 16);
		panel_108.add(label_9);

		label_10 = new JLabel();

		label_10.setForeground(new Color(0, 128, 0));
		label_10.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_10.setText("10. LEFT UPPER ARM");
		label_10.setBounds(10, 62, 159, 16);
		panel_108.add(label_10);

		panel_109 = new JPanel();
		panel_109.setLayout(null);
		panel_109.setBackground(Color.WHITE);
		panel_109.setBounds(303, 0, 151, 80);
		panel_100.add(panel_109);

		label_7 = new JLabel();
		label_7.setForeground(new Color(0, 128, 0));
		label_7.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_7.setText("11. RIGHT ANTERIOR THIGH");
		label_7.setBounds(10, 5, 141, 16);
		panel_109.add(label_7);

		rightDeltoidLabel_1 = new JLabel();
		rightDeltoidLabel_1.setForeground(new Color(0, 128, 0));
		rightDeltoidLabel_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		rightDeltoidLabel_1.setText("12. LEFT ANTERIOR THIGH");
		rightDeltoidLabel_1.setBounds(10, 20, 131, 16);
		panel_109.add(rightDeltoidLabel_1);

		label_11 = new JLabel();
		label_11.setForeground(new Color(0, 128, 0));
		label_11.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_11.setText("13. UPPER BACK LEFT");
		label_11.setBounds(10, 35, 131, 16);
		panel_109.add(label_11);

		label_12 = new JLabel();
		label_12.setForeground(new Color(0, 128, 0));
		label_12.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_12.setText("14. UPPER BACK RIGHT");
		label_12.setBounds(10, 49, 131, 16);
		panel_109.add(label_12);

		label_13 = new JLabel();
		label_13.setForeground(new Color(0, 128, 0));
		label_13.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_13.setText("15. UPPER CHEST LEFT");
		label_13.setBounds(10, 62, 131, 16);
		panel_109.add(label_13);

		panel_110 = new JPanel();
		panel_110.setLayout(null);
		panel_110.setBackground(Color.WHITE);
		panel_110.setBounds(453, 0, 272, 80);
		panel_100.add(panel_110);

		label_14 = new JLabel();
		label_14.setForeground(new Color(0, 128, 0));
		label_14.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_14.setText("16. UPPER CHEST RIGHT");
		label_14.setBounds(10, 5, 141, 16);
		panel_110.add(label_14);

		rightDeltoidLabel_2 = new JLabel();
		rightDeltoidLabel_2.setForeground(new Color(0, 128, 0));
		rightDeltoidLabel_2.setFont(new Font("Dialog", Font.PLAIN, 11));
		rightDeltoidLabel_2
				.setText("17. TO RIGHT AND ABOVE LEVEL OF UMBILICUS");
		rightDeltoidLabel_2.setBounds(10, 20, 252, 16);
		panel_110.add(rightDeltoidLabel_2);

		label_15 = new JLabel();
		label_15.setForeground(new Color(0, 128, 0));
		label_15.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_15.setText("18. TO LEFT AND ABOVE LEVEL OF UMBILICUS");
		label_15.setBounds(10, 35, 252, 16);
		panel_110.add(label_15);

		label_16 = new JLabel();
		label_16.setForeground(new Color(0, 128, 0));
		label_16.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_16.setText("19. TO RIGHT AND BELOW LEVEL OF UMBILICUS");
		label_16.setBounds(10, 49, 252, 16);
		panel_110.add(label_16);

		label_17 = new JLabel();
		label_17.setForeground(new Color(0, 128, 0));
		label_17.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_17.setText("20. TO LEFT AND BELOW LEVEL OF UMBILICUS");
		label_17.setBounds(10, 62, 252, 16);
		panel_110.add(label_17);

		panel_111 = new JPanel();
		panel_111.setLayout(null);
		panel_111.setBackground(Color.WHITE);
		panel_111.setBounds(10, 10, 542, 80);
		panel_83.add(panel_111);

		aPutInitialsLabel = new JLabel();
		aPutInitialsLabel.setForeground(new Color(0, 128, 0));
		aPutInitialsLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		aPutInitialsLabel
				.setText("A. Put initials in appropriate box when medication given");
		aPutInitialsLabel.setBounds(10, 5, 424, 16);
		panel_111.add(aPutInitialsLabel);

		rightDeltoidLabel_3 = new JLabel();
		rightDeltoidLabel_3.setForeground(new Color(0, 128, 0));
		rightDeltoidLabel_3.setFont(new Font("Dialog", Font.PLAIN, 11));
		rightDeltoidLabel_3
				.setText("B. Circle initials when medication refused.");
		rightDeltoidLabel_3.setBounds(10, 20, 252, 16);
		panel_111.add(rightDeltoidLabel_3);

		cStateReasonLabel = new JLabel();
		cStateReasonLabel.setForeground(new Color(0, 128, 0));
		cStateReasonLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		cStateReasonLabel.setText("C. State reason for refusal.");
		cStateReasonLabel.setBounds(10, 35, 252, 16);
		panel_111.add(cStateReasonLabel);

		dPrnMedicationsLabel = new JLabel();
		dPrnMedicationsLabel.setForeground(new Color(0, 128, 0));
		dPrnMedicationsLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		dPrnMedicationsLabel
				.setText("D. Routine Medications: Reason given results must be noted");
		dPrnMedicationsLabel.setBounds(10, 49, 252, 16);
		panel_111.add(dPrnMedicationsLabel);

		eIndicateSiteLabel = new JLabel();
		eIndicateSiteLabel.setForeground(new Color(0, 128, 0));
		eIndicateSiteLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		eIndicateSiteLabel
				.setText("E. Indicate site of injection with appropriate number ");
		eIndicateSiteLabel.setBounds(10, 62, 252, 16);
		panel_111.add(eIndicateSiteLabel);

		panel_101 = new JPanel();
		panel_101.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_101.setLayout(null);
		panel_101.setBackground(new Color(204, 255, 204));
		panel_101.setBounds(0, 995, 193, 51);
		panel_1.add(panel_101);

		facilityNameLabel_19 = new JLabel();
		facilityNameLabel_19.setForeground(new Color(0, 128, 0));
		facilityNameLabel_19.setText("Resident Name");
		facilityNameLabel_19.setBounds(20, 0, 120, 17);
		panel_101.add(facilityNameLabel_19);

		txtResidentName = new JTextField();
		txtResidentName.setEditable(false);
		txtResidentName.setBackground(new Color(204, 255, 204));
		txtResidentName.setBounds(20, 23, 166, 21);
		panel_101.add(txtResidentName);

		panel_102 = new JPanel();
		panel_102.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_102.setLayout(null);
		panel_102.setBackground(new Color(204, 255, 204));
		panel_102.setBounds(192, 995, 133, 51);
		panel_1.add(panel_102);

		facilityNameLabel_20 = new JLabel();
		facilityNameLabel_20.setForeground(new Color(0, 128, 0));
		facilityNameLabel_20.setText("Room / Bed / Wing");
		facilityNameLabel_20.setBounds(20, 0, 120, 17);
		panel_102.add(facilityNameLabel_20);

		txtRoomNum = new JTextField();
		txtRoomNum.setEditable(false);
		txtRoomNum.setBackground(new Color(204, 255, 204));
		txtRoomNum.setBounds(20, 23, 102, 21);
		panel_102.add(txtRoomNum);

		panel_103 = new JPanel();
		panel_103.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_103.setLayout(null);
		panel_103.setBackground(new Color(204, 255, 204));
		panel_103.setBounds(324, 995, 133, 51);
		panel_1.add(panel_103);

		facilityNameLabel_21 = new JLabel();
		facilityNameLabel_21.setForeground(new Color(0, 128, 0));
		facilityNameLabel_21.setText("Med. Record #");
		facilityNameLabel_21.setBounds(20, 0, 90, 17);
		panel_103.add(facilityNameLabel_21);

		txtMedRecordNum = new JTextField();
		txtMedRecordNum.setEditable(false);
		txtMedRecordNum.setBackground(new Color(204, 255, 204));
		txtMedRecordNum.setBounds(20, 23, 102, 21);
		panel_103.add(txtMedRecordNum);

		panel_104 = new JPanel();
		panel_104.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_104.setLayout(null);
		panel_104.setBackground(new Color(204, 255, 204));
		panel_104.setBounds(456, 995, 133, 51);
		panel_1.add(panel_104);

		facilityNameLabel_22 = new JLabel();
		facilityNameLabel_22.setForeground(new Color(0, 128, 0));
		facilityNameLabel_22.setText("Admission Date");
		facilityNameLabel_22.setBounds(20, 0, 90, 17);
		panel_104.add(facilityNameLabel_22);

		txtAdmissionDate = new JTextField();
		txtAdmissionDate.setEditable(false);
		txtAdmissionDate.setBackground(new Color(204, 255, 204));
		txtAdmissionDate.setBounds(20, 23, 102, 21);
		panel_104.add(txtAdmissionDate);

		panel_105 = new JPanel();
		panel_105.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_105.setLayout(null);
		panel_105.setBackground(new Color(204, 255, 204));
		panel_105.setBounds(589, 995, 133, 51);
		panel_1.add(panel_105);

		facilityNameLabel_23 = new JLabel();
		facilityNameLabel_23.setForeground(new Color(0, 128, 0));
		facilityNameLabel_23.setText("Sex");
		facilityNameLabel_23.setBounds(20, 0, 90, 17);
		panel_105.add(facilityNameLabel_23);

		txtSex = new JTextField();
		txtSex.setEditable(false);
		txtSex.setBackground(new Color(204, 255, 204));
		txtSex.setBounds(20, 23, 102, 21);
		panel_105.add(txtSex);

		panel_106 = new JPanel();
		panel_106.setBorder(new LineBorder(new Color(34, 139, 34), 1, false));
		panel_106.setLayout(null);
		panel_106.setBackground(new Color(204, 255, 204));
		panel_106.setBounds(0, 1045, 193, 51);
		panel_1.add(panel_106);

		facilityNameLabel_24 = new JLabel();
		facilityNameLabel_24.setForeground(new Color(0, 128, 0));
		facilityNameLabel_24.setText("Physician Name");
		facilityNameLabel_24.setBounds(20, 0, 120, 17);
		panel_106.add(facilityNameLabel_24);

		txtPhysicianName = new JTextField();
		txtPhysicianName.setEditable(false);
		txtPhysicianName.setBackground(new Color(204, 255, 204));
		txtPhysicianName.setBounds(20, 23, 166, 21);
		panel_106.add(txtPhysicianName);

		panelRows = new JPanel();
		panelRows.setBackground(Color.WHITE);
		panelRows.setLayout(null);
		panelRows.setBounds(0, 26, 1489, 826);
		panel_1.add(panelRows);

		int i;

		panelRoutineRows = new PanelMedicationRoutineRecordFormRow[7];

		for (i = 0; i < 7; i++) {
			panelRoutineRows[i] = new PanelMedicationRoutineRecordFormRow(i + 1);
			panelRoutineRows[i].setBounds(0, (i * 122), 1489, 123);
			panelRows.add(panelRoutineRows[i]);
		}

		updateData();
	}

	public void updateData() {
		ResidentMain rm = null;
		if (Global.currentResidenceKey != 0) {
			try {
				rm = MedrexClientManager.getInstance().getResident(
						Global.currentResidenceKey);
			} catch (Exception e) {

			}
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txtRoomNum.setText(rm.getRoom());
			txtSex.setText(rm.getSex().toString());
		}

		for (int i = 0; i < 7; i++) {
			panelRoutineRows[i].updateData();
		}

	}

	public void doSave() {
		MedicationRoutineRecordForm mprf = null;

		if (Global.currentMedicationRoutineRecordFormKey == 0) {
			mprf = new MedicationRoutineRecordForm();
			mprf.setSerial(Global.currentMedicationRoutineRecordFormKey);
			mprf.setResidentId(Global.currentResidenceKey);
			try {
				Global.currentMedicationRoutineRecordFormKey = MedrexClientManager
						.getInstance()
						.insertOrUpdateMedicationRoutineRecordForm(mprf);
			} catch (Exception e) {

			}

		}

		for (int i = 0; i < 7; i++) {
			panelRoutineRows[i].doSave();
		}
	}

}
