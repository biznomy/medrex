package medrex.client.main.dialysis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.consultant.RenalDialysisCommunicationFormPage2;
import medrex.commons.vo.others.Users;

import com.toedter.calendar.JDateChooser;

public class PanelRenalDialysisCommunicationFormPage2 extends JPanel implements
		Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5694790488633109245L;
	private JTextField txtTelephoneNumber;
	private JLabel newOrdersLabel_3;
	private JPanel panel_13;
	private JDateChooser dcDate;
	private JLabel newOrdersLabel_2;
	private JPanel panel_12;
	private JComboBox cmbCompletedBySignature;
	private JLabel newOrdersLabel_1;
	private JPanel panel_11;
	private JTextField txtNewOrders;
	private JLabel newOrdersLabel;
	private JPanel panel_10;
	private JTextArea txtChangesInMedication;
	private JLabel changesInMedicationLabel_2;
	private JPanel panel_9;
	private JTextField txtNextDialysisTime;
	private JDateChooser dcNextDialysis;
	private JLabel medicationGivenDuringLabel_2;
	private JPanel panel_8;
	private JTextArea txtDietaryConcerns;
	private JLabel medicationGivenDuringLabel_1;
	private JPanel panel_7;
	private JTextArea txtMedications;
	private JLabel medicationGivenDuringLabel;
	private JPanel panel_6;
	private JTextArea txtKineticModeling;
	private JLabel changesInMedicationLabel_1;
	private JTextArea txtLabsDrawnNPCR;
	private JLabel changesInMedicationLabel;
	private JPanel panel_5;
	private JTextField txtPulse;
	private JLabel postDialysisWeightLabel_2;
	private JTextField txtBloodPressure;
	private JLabel postDialysisWeightLabel_1;
	private JTextField txtPostDialysisTemprature;
	private JLabel predialysisWeightLabel_1;
	private JPanel panel_4;
	private JTextField txtPostDialysisWeight;
	private JLabel postDialysisWeightLabel;
	private JTextField txtPreDialysisWeight;
	private JLabel predialysisWeightLabel;
	private JPanel panel_3;
	private JTextField txtCompletedByDialysis;
	private JLabel completedByDialysisLabel;
	private JPanel panel_2;
	private JLabel communicationFormForLabel;
	private JLabel rentalDialysisLabel;
	private JPanel panel_1;

	/**
	 * Create the panel
	 */
	public PanelRenalDialysisCommunicationFormPage2() {
		super();
		setPreferredSize(new Dimension(800, 900));
		Global.panelRenalDialysisCommunicationFormPage2 = this;
		setLayout(null);
		setSize(800, 900);
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 800, 900);
		add(panel_1);

		rentalDialysisLabel = new JLabel();
		rentalDialysisLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		rentalDialysisLabel.setText("RENAL DIALYSIS -");
		rentalDialysisLabel.setBounds(298, 17, 210, 23);
		panel_1.add(rentalDialysisLabel);

		communicationFormForLabel = new JLabel();
		communicationFormForLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		communicationFormForLabel
				.setText("COMMUNICATION FORM FOR HEMODIALYSIS(Cont'd)");
		communicationFormForLabel.setBounds(152, 40, 581, 29);
		panel_1.add(communicationFormForLabel);

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(20, 75, 713, 42);
		panel_1.add(panel_2);

		completedByDialysisLabel = new JLabel();
		completedByDialysisLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		completedByDialysisLabel.setText("Completed by Dialysis Unit:");
		completedByDialysisLabel.setBounds(10, 10, 205, 26);
		panel_2.add(completedByDialysisLabel);

		txtCompletedByDialysis = new JTextField();
		txtCompletedByDialysis.setBounds(221, 15, 346, 20);
		panel_2.add(txtCompletedByDialysis);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(20, 241, 713, 50);
		panel_1.add(panel_3);

		predialysisWeightLabel = new JLabel();
		predialysisWeightLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		predialysisWeightLabel.setText("Pre-Dialysis Weight:");
		predialysisWeightLabel.setBounds(10, 0, 162, 19);
		panel_3.add(predialysisWeightLabel);

		txtPreDialysisWeight = new JTextField();
		txtPreDialysisWeight.setBounds(10, 25, 198, 20);
		panel_3.add(txtPreDialysisWeight);

		postDialysisWeightLabel = new JLabel();
		postDialysisWeightLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		postDialysisWeightLabel.setText("Post Dialysis Weight:");
		postDialysisWeightLabel.setBounds(375, 0, 209, 19);
		panel_3.add(postDialysisWeightLabel);

		txtPostDialysisWeight = new JTextField();
		txtPostDialysisWeight.setBounds(375, 25, 198, 20);
		panel_3.add(txtPostDialysisWeight);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(20, 297, 713, 57);
		panel_1.add(panel_4);

		predialysisWeightLabel_1 = new JLabel();
		predialysisWeightLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		predialysisWeightLabel_1.setText("Post Dialysis Temperature:");
		predialysisWeightLabel_1.setBounds(10, 0, 193, 19);
		panel_4.add(predialysisWeightLabel_1);

		txtPostDialysisTemprature = new JTextField();
		txtPostDialysisTemprature.setBounds(10, 35, 198, 20);
		panel_4.add(txtPostDialysisTemprature);

		postDialysisWeightLabel_1 = new JLabel();
		postDialysisWeightLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		postDialysisWeightLabel_1.setText("Blood Pressure:");
		postDialysisWeightLabel_1.setBounds(261, 0, 125, 19);
		panel_4.add(postDialysisWeightLabel_1);

		txtBloodPressure = new JTextField();
		txtBloodPressure.setBounds(229, 35, 198, 20);
		panel_4.add(txtBloodPressure);

		postDialysisWeightLabel_2 = new JLabel();
		postDialysisWeightLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		postDialysisWeightLabel_2.setText("Pulse:");
		postDialysisWeightLabel_2.setBounds(529, 0, 125, 19);
		panel_4.add(postDialysisWeightLabel_2);

		txtPulse = new JTextField();
		txtPulse.setBounds(459, 35, 198, 20);
		panel_4.add(txtPulse);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(20, 360, 713, 102);
		panel_1.add(panel_5);

		changesInMedicationLabel = new JLabel();
		changesInMedicationLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		changesInMedicationLabel.setText("Labs Drawn:");
		changesInMedicationLabel.setBounds(5, 0, 193, 19);
		panel_5.add(changesInMedicationLabel);

		txtLabsDrawnNPCR = new JTextArea();
		txtLabsDrawnNPCR.setBorder(new LineBorder(Color.black, 1, false));
		txtLabsDrawnNPCR.setWrapStyleWord(true);
		txtLabsDrawnNPCR.setLineWrap(true);
		txtLabsDrawnNPCR.setBounds(10, 25, 262, 70);
		panel_5.add(txtLabsDrawnNPCR);

		changesInMedicationLabel_1 = new JLabel();
		changesInMedicationLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		changesInMedicationLabel_1
				.setText("Kinetic Modeling Results (KT/URR,NPCR)");
		changesInMedicationLabel_1.setBounds(370, -1, 343, 21);
		panel_5.add(changesInMedicationLabel_1);

		txtKineticModeling = new JTextArea();
		txtKineticModeling.setBorder(new LineBorder(Color.black, 1, false));
		txtKineticModeling.setWrapStyleWord(true);
		txtKineticModeling.setLineWrap(true);
		txtKineticModeling.setBounds(370, 25, 272, 70);
		panel_5.add(txtKineticModeling);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(20, 468, 713, 77);
		panel_1.add(panel_6);

		medicationGivenDuringLabel = new JLabel();
		medicationGivenDuringLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		medicationGivenDuringLabel.setText("Medication Given During Dialysis:");
		medicationGivenDuringLabel.setBounds(17, 0, 261, 20);
		panel_6.add(medicationGivenDuringLabel);

		txtMedications = new JTextArea();
		txtMedications.setBorder(new LineBorder(Color.black, 1, false));
		txtMedications.setWrapStyleWord(true);
		txtMedications.setLineWrap(true);
		txtMedications.setBounds(10, 26, 454, 43);
		panel_6.add(txtMedications);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(20, 551, 713, 77);
		panel_1.add(panel_7);

		medicationGivenDuringLabel_1 = new JLabel();
		medicationGivenDuringLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		medicationGivenDuringLabel_1.setText("Dietary Concerns:");
		medicationGivenDuringLabel_1.setBounds(10, 0, 261, 19);
		panel_7.add(medicationGivenDuringLabel_1);

		txtDietaryConcerns = new JTextArea();
		txtDietaryConcerns.setBorder(new LineBorder(Color.black, 1, false));
		txtDietaryConcerns.setWrapStyleWord(true);
		txtDietaryConcerns.setLineWrap(true);
		txtDietaryConcerns.setBounds(10, 25, 464, 43);
		panel_7.add(txtDietaryConcerns);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(20, 634, 713, 57);
		panel_1.add(panel_8);

		medicationGivenDuringLabel_2 = new JLabel();
		medicationGivenDuringLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		medicationGivenDuringLabel_2
				.setText("Next Dialysis Treatment(Date/Time):");
		medicationGivenDuringLabel_2.setBounds(17, 0, 261, 20);
		panel_8.add(medicationGivenDuringLabel_2);

		dcNextDialysis = new JDateChooser();
		dcNextDialysis.setDateFormatString("MM/dd/yyyy");
		dcNextDialysis.setBounds(10, 26, 159, 19);
		panel_8.add(dcNextDialysis);

		txtNextDialysisTime = new JTextField();
		txtNextDialysisTime.setBounds(219, 26, 159, 20);
		panel_8.add(txtNextDialysisTime);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(20, 123, 713, 112);
		panel_1.add(panel_9);

		changesInMedicationLabel_2 = new JLabel();
		changesInMedicationLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		changesInMedicationLabel_2.setText("Changes in Medication:");
		changesInMedicationLabel_2.setBounds(10, 0, 177, 21);
		panel_9.add(changesInMedicationLabel_2);

		txtChangesInMedication = new JTextArea();
		txtChangesInMedication.setBorder(new LineBorder(Color.black, 1, false));
		txtChangesInMedication.setWrapStyleWord(true);
		txtChangesInMedication.setLineWrap(true);
		txtChangesInMedication.setBounds(10, 27, 558, 80);
		panel_9.add(txtChangesInMedication);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(20, 703, 713, 50);
		panel_1.add(panel_10);

		newOrdersLabel = new JLabel();
		newOrdersLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		newOrdersLabel.setText("New Orders:");
		newOrdersLabel.setBounds(10, 0, 102, 14);
		panel_10.add(newOrdersLabel);

		txtNewOrders = new JTextField();
		txtNewOrders.setBounds(8, 18, 466, 23);
		panel_10.add(txtNewOrders);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(20, 759, 232, 50);
		panel_1.add(panel_11);

		newOrdersLabel_1 = new JLabel();
		newOrdersLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		newOrdersLabel_1.setText("Completed By: Signature/Tile");
		newOrdersLabel_1.setBounds(10, 0, 216, 14);
		panel_11.add(newOrdersLabel_1);

		cmbCompletedBySignature = new JComboBox();
		cmbCompletedBySignature.setBackground(Color.WHITE);
		cmbCompletedBySignature.setBounds(10, 20, 192, 21);
		panel_11.add(cmbCompletedBySignature);

		panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(258, 759, 232, 50);
		panel_1.add(panel_12);

		newOrdersLabel_2 = new JLabel();
		newOrdersLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		newOrdersLabel_2.setText("Date:");
		newOrdersLabel_2.setBounds(10, 0, 216, 14);
		panel_12.add(newOrdersLabel_2);

		dcDate = new JDateChooser();
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(10, 20, 159, 19);
		panel_12.add(dcDate);

		panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(496, 759, 237, 50);
		panel_1.add(panel_13);

		newOrdersLabel_3 = new JLabel();
		newOrdersLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		newOrdersLabel_3.setText("Telephone Number:");
		newOrdersLabel_3.setBounds(10, 0, 216, 14);
		panel_13.add(newOrdersLabel_3);

		txtTelephoneNumber = new JTextField();
		txtTelephoneNumber.setBounds(10, 20, 181, 20);
		panel_13.add(txtTelephoneNumber);

		fillCombos();
		updateData();
	}

	public void fillCombos() {
		UserLogon ul = new UserLogon();
		try {
			ul = MedrexClientManager.getInstance().getcurrentUserLogon();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Users user = new Users();
		try {
			user = MedrexClientManager.getInstance().getUser(ul.getUserId());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cmbCompletedBySignature.addItem(user.getUserName());
	}

	public void updateData() {
		if (Global.currentRenalDialysisCommunicationFormKey == 0) {
			Global.currentRenalDialysisCommunicationFormPage2Key = 0;
			txtCompletedByDialysis.setText("");
			txtChangesInMedication.setText("");
			txtPreDialysisWeight.setText("");
			txtPostDialysisWeight.setText("");
			txtPostDialysisTemprature.setText("");
			txtBloodPressure.setText("");
			txtPulse.setText("");
			txtLabsDrawnNPCR.setText("");
			txtKineticModeling.setText("");
			txtMedications.setText("");
			txtDietaryConcerns.setText("");
			dcNextDialysis.setDate(null);
			txtNextDialysisTime.setText("");
			txtNewOrders.setText("");
			cmbCompletedBySignature.setSelectedItem("");
			dcDate.setDate(null);
			txtTelephoneNumber.setText("");

		} else {
			RenalDialysisCommunicationFormPage2 rdcfp2 = null;
			try {
				rdcfp2 = MedrexClientManager
						.getInstance()
						.getRenalDialysisCommunicationFormPage2(
								Global.currentRenalDialysisCommunicationFormKey);
			} catch (Exception e) {

			}
			Global.currentRenalDialysisCommunicationFormPage2Key = rdcfp2
					.getSerial();

			txtCompletedByDialysis.setText(rdcfp2.getCompletedBy());
			txtChangesInMedication.setText(rdcfp2.getChangesInMedication());
			txtPreDialysisWeight.setText(rdcfp2.getPreDialysisWeight());
			txtPostDialysisWeight.setText(rdcfp2.getPostDialysisWeight());
			txtPostDialysisTemprature.setText(rdcfp2
					.getPostDialysisTemperature());
			txtBloodPressure.setText(rdcfp2.getBloodPressure());
			txtPulse.setText(rdcfp2.getPulse());
			txtLabsDrawnNPCR.setText(rdcfp2.getLabsDrawn());
			txtKineticModeling.setText(rdcfp2.getKineticModeling());
			txtMedications.setText(rdcfp2.getMedicationGiven());
			txtDietaryConcerns.setText(rdcfp2.getDietaryConcerns());
			dcNextDialysis.setDate(rdcfp2.getNextDialysis());
			txtNextDialysisTime.setText(rdcfp2.getNextDialysisTime());
			txtNewOrders.setText(rdcfp2.getNewOrders());
			cmbCompletedBySignature.setSelectedItem(rdcfp2.getSignature());
			dcDate.setDate(rdcfp2.getDateRecord());
			txtTelephoneNumber.setText(rdcfp2.getTelephoneNumber());

		}

	}

	public int doSave() {
		RenalDialysisCommunicationFormPage2 rdcfp2 = new RenalDialysisCommunicationFormPage2();
		rdcfp2.setSerial(Global.currentRenalDialysisCommunicationFormPage2Key);
		rdcfp2.setFormId(Global.currentRenalDialysisCommunicationFormKey);
		rdcfp2.setCompletedBy(txtCompletedByDialysis.getText());
		rdcfp2.setChangesInMedication(txtChangesInMedication.getText());
		rdcfp2.setPreDialysisWeight(txtPreDialysisWeight.getText());
		rdcfp2.setPostDialysisWeight(txtPostDialysisWeight.getText());
		rdcfp2.setPostDialysisTemperature(txtPostDialysisTemprature.getText());
		rdcfp2.setBloodPressure(txtBloodPressure.getText());
		rdcfp2.setPulse(txtPulse.getText());
		rdcfp2.setLabsDrawn(txtLabsDrawnNPCR.getText());
		rdcfp2.setKineticModeling(txtKineticModeling.getText());
		rdcfp2.setMedicationGiven(txtMedications.getText());
		rdcfp2.setDietaryConcerns(txtDietaryConcerns.getText());
		rdcfp2.setNextDialysis(dcNextDialysis.getDate());
		rdcfp2.setNextDialysisTime(txtNextDialysisTime.getText());
		rdcfp2.setNewOrders(txtNewOrders.getText());
		rdcfp2.setSignature((String) cmbCompletedBySignature.getSelectedItem());
		rdcfp2.setDateRecord(dcDate.getDate());
		rdcfp2.setTelephoneNumber(txtTelephoneNumber.getText());
		try {
			Global.currentRenalDialysisCommunicationFormPage2Key = MedrexClientManager
					.getInstance()
					.insertOrUpdateRenalDialysisCommunicationFormPage2(rdcfp2);
		} catch (Exception e) {

		}
		return Global.currentRenalDialysisCommunicationFormPage2Key;
	}

	public void doLoad() {

	}

	public void doUpdate() {

	}

	public boolean doValidate() {
		return true;
	}

}
