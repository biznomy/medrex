package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.PainManagementRecordRow;

import com.toedter.calendar.JDateChooser;

public class PanelPainManagementRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8711534244672185428L;
	JCheckBox cbNurseInitial;
	private JPanel panel_12;
	private JComboBox cmbResPainGoal;
	private JPanel panel_11;
	private JComboBox cmbResAccLevel;
	private JPanel panel_10;
	private JComboBox cmbPainRatingLevelPostTime;
	private JPanel panel_9;
	private JComboBox cmbPharInterSBPRN;
	private JPanel panel_8;
	private JTextField txtNonPharInter;
	private JPanel panel_7;
	private JComboBox cmbPainRatingLevel;
	private JPanel panel_6;
	private JComboBox cmbPainScaleUsed;
	private JPanel panel_5;
	private JTextField txtLocationOfPain;
	private JPanel panel_4;
	private JTextField txtTime;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel_1;
	private JDateChooser dateChooser;

	int painManagementRecordRowSerial;
	int painManagementRecordRowKey;

	/**
	 * Create the panel
	 */
	public PanelPainManagementRow(int num) {
		super();

		painManagementRecordRowSerial = num;

		setPreferredSize(new Dimension(1170, 50));
		setLayout(null);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 979, 50);
		add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 59, 50);
		panel_1.add(panel_2);

		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("MM/dd/yyyy");
		dateChooser.setBounds(5, 10, 50, 30);
		panel_2.add(dateChooser);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(58, 0, 59, 50);
		panel_1.add(panel_3);

		txtTime = new JTextField();
		txtTime.setBackground(Color.WHITE);
		txtTime.setBounds(5, 10, 50, 30);
		panel_3.add(txtTime);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(116, 0, 120, 50);
		panel_1.add(panel_4);

		txtLocationOfPain = new JTextField();
		txtLocationOfPain.setBackground(Color.WHITE);
		txtLocationOfPain.setBounds(5, 10, 109, 30);
		panel_4.add(txtLocationOfPain);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(229, 0, 59, 50);
		panel_1.add(panel_5);

		cmbPainScaleUsed = new JComboBox();
		cmbPainScaleUsed.setBackground(Color.WHITE);
		cmbPainScaleUsed.setBounds(10, 10, 45, 30);
		panel_5.add(cmbPainScaleUsed);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(287, 0, 78, 50);
		panel_1.add(panel_6);

		cmbPainRatingLevel = new JComboBox();
		cmbPainRatingLevel.setBackground(Color.WHITE);
		cmbPainRatingLevel.setBounds(10, 10, 60, 30);
		panel_6.add(cmbPainRatingLevel);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(363, 0, 137, 50);
		panel_1.add(panel_7);

		txtNonPharInter = new JTextField();
		txtNonPharInter.setBackground(Color.WHITE);
		txtNonPharInter.setBounds(10, 10, 118, 30);
		panel_7.add(txtNonPharInter);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(499, 0, 140, 50);
		panel_1.add(panel_8);

		cmbPharInterSBPRN = new JComboBox();
		cmbPharInterSBPRN.setBackground(Color.WHITE);
		cmbPharInterSBPRN.setBounds(10, 10, 120, 30);
		panel_8.add(cmbPharInterSBPRN);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(638, 0, 120, 50);
		panel_1.add(panel_9);

		cmbPainRatingLevelPostTime = new JComboBox();
		cmbPainRatingLevelPostTime.setBackground(Color.WHITE);
		cmbPainRatingLevelPostTime.setBounds(10, 10, 100, 30);
		panel_9.add(cmbPainRatingLevelPostTime);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(757, 0, 83, 50);
		panel_1.add(panel_10);

		cmbResAccLevel = new JComboBox();
		cmbResAccLevel.setBackground(Color.WHITE);
		cmbResAccLevel.setBounds(10, 10, 65, 30);
		panel_10.add(cmbResAccLevel);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(838, 0, 85, 50);
		panel_1.add(panel_11);

		cmbResPainGoal = new JComboBox();
		cmbResPainGoal.setBackground(Color.WHITE);
		cmbResPainGoal.setBounds(10, 10, 65, 30);
		panel_11.add(cmbResPainGoal);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(922, 0, 57, 50);
		panel_1.add(panel_12);

		cbNurseInitial = new JCheckBox();
		cbNurseInitial.setBackground(Color.WHITE);
		cbNurseInitial.setBounds(15, 10, 27, 30);
		panel_12.add(cbNurseInitial);
		fillCombos();
		updateData();
	}

	public void fillCombos() {

		cmbPainScaleUsed.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "VNS", "WFS", "OBS" }));
		cmbPainScaleUsed.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8",
						"9", "10" }));
		cmbPharInterSBPRN.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "S", "B", "PRN" }));
		cmbPainRatingLevel.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8",
						"9", "10" }));
		cmbPainRatingLevelPostTime
				.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
						"", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
						"10" }));

		cmbResAccLevel.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "Y", "N" }));
		cmbResPainGoal.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "Y", "N" }));
	}

	public void updateData() {
		if (Global.currentPainManagementFormPage1Key == 0) {
			painManagementRecordRowKey = 0;

			dateChooser.setDate(null);
			txtTime.setText("");
			txtLocationOfPain.setText("");
			cmbPainScaleUsed.setSelectedItem("");
			cmbPainRatingLevel.setSelectedItem("");
			txtNonPharInter.setText("");
			cmbPharInterSBPRN.setSelectedItem("");
			cmbPainRatingLevelPostTime.setSelectedItem("");
			cmbResAccLevel.setSelectedItem("");
			cmbResPainGoal.setSelectedItem("");

		} else {
			PainManagementRecordRow pmrr = null;

			dateChooser.setDate(null);
			txtTime.setText("");
			txtLocationOfPain.setText("");
			cmbPainScaleUsed.setSelectedItem("");
			cmbPainRatingLevel.setSelectedItem("");
			txtNonPharInter.setText("");
			cmbPharInterSBPRN.setSelectedItem("");
			cmbPainRatingLevelPostTime.setSelectedItem("");
			cmbResAccLevel.setSelectedItem("");
			cmbResPainGoal.setSelectedItem("");

			try {
				pmrr = MedrexClientManager.getInstance()
						.getPainManagementRecordRow(
								Global.currentPainManagementFormPage1Key,
								painManagementRecordRowSerial);
			} catch (Exception e) {

			}

			painManagementRecordRowKey = pmrr.getSerial();

			dateChooser.setDate(pmrr.getDateRecord());
			txtTime.setText(pmrr.getTimeRecord());
			txtLocationOfPain.setText(pmrr.getLocationOfPain());
			cmbPainScaleUsed.setSelectedItem(pmrr.getPainScaleUsed());
			cmbPainRatingLevel.setSelectedItem(pmrr.getPainRatingLevelPre());
			txtNonPharInter.setText(pmrr.getNonPharmaIntervention());
			cmbPharInterSBPRN.setSelectedItem(pmrr.getPharmaIntervention());
			cmbPainRatingLevelPostTime.setSelectedItem(pmrr
					.getPainRatingLevelPost());
			cmbResAccLevel.setSelectedItem(pmrr.getResidentAcceptableLevel());
			cmbResPainGoal.setSelectedItem(pmrr.getResidentPainGoal());

		}

	}

	public void doSave() {
		PainManagementRecordRow pmrr = new PainManagementRecordRow();

		pmrr.setSerial(painManagementRecordRowKey);
		pmrr
				.setPainManagementRecordFormSerial(Global.currentPainManagementFormPage1Key);
		pmrr.setPainManagementRecordRowSerial(painManagementRecordRowSerial);

		pmrr.setDateRecord(dateChooser.getDate());
		pmrr.setTimeRecord(txtTime.getText());
		pmrr.setLocationOfPain(txtLocationOfPain.getText());
		pmrr.setPainScaleUsed((String) cmbPainScaleUsed.getSelectedItem());
		pmrr.setPainRatingLevelPre((String) cmbPainRatingLevel
				.getSelectedItem());
		pmrr.setNonPharmaIntervention(txtNonPharInter.getText());
		pmrr
				.setPharmaIntervention((String) cmbPharInterSBPRN
						.getSelectedItem());
		pmrr.setPainRatingLevelPost((String) cmbPainRatingLevelPostTime
				.getSelectedItem());
		pmrr.setResidentAcceptableLevel((String) cmbResAccLevel
				.getSelectedItem());
		pmrr.setResidentPainGoal((String) cmbResPainGoal.getSelectedItem());
		pmrr.setNursesInitial(cbNurseInitial.isSelected());

		try {
			/* Global.currentPainManagementFormPage1Key = */MedrexClientManager
					.getInstance().insertOrUpdatePainManagementRecordRow(pmrr);
		} catch (Exception e) {

		}
	}

}
