package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.PhysicianPlazaHealthCare;

import com.toedter.calendar.JDateChooser;

public class PanelPhysicianPlazaHealthCare extends JPanel {

	private JComboBox cmbTherapistSignature;
	private JLabel pttx5X3X5Label_49;
	private JComboBox cmbMdSignature;
	private JComboBox cmbNurseSignature;
	private JLabel pttx5X3X5Label_48;
	private JLabel pttx5X3X5Label_47;
	private JTextField txtStOther;
	private JTextField txtStDietTo;
	private JCheckBox cbStOtherCb;
	private JCheckBox cbStSpeech;
	private JCheckBox cbStVocal;
	private JCheckBox cbStWHExercises;
	private JCheckBox cbStCategorization;
	private JCheckBox cbStYNExercises;
	private JCheckBox cbStDirection;
	private JCheckBox cbStOrientation;
	private JCheckBox cbStAutomatic;
	private JCheckBox cbStWord;
	private JCheckBox cbStArticulation;
	private JCheckBox cbStLaryngeal;
	private JCheckBox cbStCompensatory;
	private JCheckBox cbStOm;
	private JCheckBox cbStDietCb;
	private JLabel pttx5X3X5Label_46;
	private JLabel pttx5X3X5Label_45;
	private JLabel pttx5X3X5Label_44;
	private JLabel pttx5X3X5Label_43;
	private JLabel pttx5X3X5Label_42;
	private JLabel pttx5X3X5Label_41;
	private JLabel pttx5X3X5Label_40;
	private JLabel pttx5X3X5Label_39;
	private JLabel pttx5X3X5Label_38;
	private JLabel pttx5X3X5Label_37;
	private JLabel pttx5X3X5Label_36;
	private JLabel pttx5X3X5Label_35;
	private JLabel pttx5X3X5Label_34;
	private JLabel pttx5X3X5Label_33;
	private JLabel pttx5X3X5Label_32;
	private JLabel pttx5X3X5Label_31;
	private JLabel pttx5X3X5Label_30;
	private JCheckBox cbOtPlanning;
	private JCheckBox cbOtPtStaff;
	private JCheckBox cbOtContracture;
	private JCheckBox cbOtWcPositioning;
	private JCheckBox cbOtModalityCb;
	private JCheckBox cbOtAdls;
	private JCheckBox cbOtTransfer;
	private JCheckBox cbOtBalance;
	private JCheckBox cbOtActivities;
	private JCheckBox cbOtTherapeuticActivities;
	private JCheckBox cbOtTherapeuticExercise;
	private JLabel pttx5X3X5Label_29;
	private JLabel pttx5X3X5Label_28;
	private JTextField txtOtModality;
	private JTextField txtOtOther;
	private JLabel pttx5X3X5Label_27;
	private JLabel pttx5X3X5Label_26;
	private JLabel pttx5X3X5Label_25;
	private JLabel pttx5X3X5Label_24;
	private JLabel pttx5X3X5Label_23;
	private JLabel pttx5X3X5Label_22;
	private JLabel pttx5X3X5Label_21;
	private JLabel pttx5X3X5Label_20;
	private JLabel pttx5X3X5Label_19;
	private JLabel pttx5X3X5Label_18;
	private JLabel pttx5X3X5Label_17;
	private JLabel pttx5X3X5Label_16;
	private JTextField txtPtModality;
	private JTextField txtPtOther;
	private JCheckBox cbPtModalityCb;
	private JCheckBox cbPtOtherCb;
	private JCheckBox cbPtPlanning;
	private JCheckBox cbPtPtStaff;
	private JCheckBox cbPtStair;
	private JCheckBox cbPtGaint;
	private JCheckBox cbPtTherapeuticActivities;
	private JCheckBox cbPtCoordination;
	private JCheckBox cbPtBalance;
	private JCheckBox cbPtTransfer;
	private JCheckBox cbPtTherapeuticExercise;
	private JLabel pttx5X3X5Label_15;
	private JLabel pttx5X3X5Label_14;
	private JLabel pttx5X3X5Label_13;
	private JLabel pttx5X3X5Label_12;
	private JLabel pttx5X3X5Label_11;
	private JLabel pttx5X3X5Label_10;
	private JLabel pttx5X3X5Label_9;
	private JLabel pttx5X3X5Label_8;
	private JLabel pttx5X3X5Label_7;
	private JLabel pttx5X3X5Label_6;
	private JLabel pttx5X3X5Label_5;
	private JLabel pttx5X3X5Label_4;
	private JLabel pttx5X3X5Label_3;
	private JLabel pttx5X3X5Label_2;
	private JLabel pttx5X3X5Label_1;
	private JLabel pttx5X3X5Label;
	private JLabel residentsNameLabel_14;
	private JLabel residentsNameLabel_13;
	private JPanel panel_5;
	private JPanel panel_4;
	private JPanel panel_2;
	private JLabel residentsNameLabel_12;
	private JPanel panel_1;
	private JDateChooser dcStDate;
	private JDateChooser dcOtDate;
	private JDateChooser dcPtDate;
	private JLabel residentsNameLabel_11;
	private JLabel residentsNameLabel_10;
	private JLabel residentsNameLabel_9;
	private JLabel residentsNameLabel_8;
	private JLabel residentsNameLabel_7;
	private JLabel residentsNameLabel_6;
	private JTextField txtStRecert;
	private JTextField txtOtRecert;
	private JTextField txtPtRecert;
	private JLabel residentsNameLabel_5;
	private JLabel residentsNameLabel_4;
	private JLabel residentsNameLabel_3;
	private JDateChooser dcDateField;
	private JTextField txtRoom;
	private JLabel residentsNameLabel_2;
	private JLabel residentsNameLabel_1;
	private JTextField txtResidentsName;
	private JLabel residentsNameLabel;
	private JPanel panel;
	private JLabel plazaHealthcareLabel_3;
	private JLabel plazaHealthcareLabel_2;
	private JLabel plazaHealthcareLabel_1;
	private JLabel plazaHealthcareLabel;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public PanelPhysicianPlazaHealthCare() {
		super();
		Global.panelPhysicianPlazaHealthCare = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(900, 1200));
		setLayout(null);

		plazaHealthcareLabel = new JLabel();
		plazaHealthcareLabel.setFont(new Font("", Font.BOLD, 18));
		plazaHealthcareLabel
				.setText("PLAZA HEALTHCARE & REHABILITATION CENTER");
		plazaHealthcareLabel.setBounds(187, 10, 442, 14);
		add(plazaHealthcareLabel);

		plazaHealthcareLabel_1 = new JLabel();
		plazaHealthcareLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		plazaHealthcareLabel_1.setText("456 RAHWAY AVENUE");
		plazaHealthcareLabel_1.setBounds(294, 30, 208, 14);
		add(plazaHealthcareLabel_1);

		plazaHealthcareLabel_2 = new JLabel();
		plazaHealthcareLabel_2.setFont(new Font("Dialog", Font.BOLD, 18));
		plazaHealthcareLabel_2.setText("ELIZABETH, NEW JERSEY 07202");
		plazaHealthcareLabel_2.setBounds(257, 50, 304, 14);
		add(plazaHealthcareLabel_2);

		plazaHealthcareLabel_3 = new JLabel();
		plazaHealthcareLabel_3.setFont(new Font("Dialog", Font.BOLD, 18));
		plazaHealthcareLabel_3.setText("PHYSICIAN'S TELEPHONE ORDER FOR REHAB");
		plazaHealthcareLabel_3.setBounds(187, 87, 442, 14);
		add(plazaHealthcareLabel_3);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 147, 890, 147);
		add(panel);

		residentsNameLabel = new JLabel();
		residentsNameLabel.setFont(new Font("", Font.PLAIN, 14));
		residentsNameLabel.setText("Resident's Name:");
		residentsNameLabel.setBounds(10, 10, 110, 14);
		panel.add(residentsNameLabel);

		txtResidentsName = new JTextField();
		txtResidentsName.setBackground(Color.WHITE);
		txtResidentsName.setEditable(false);
		txtResidentsName.setBounds(126, 9, 317, 20);
		panel.add(txtResidentsName);

		residentsNameLabel_1 = new JLabel();
		residentsNameLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_1.setText("Room#:");
		residentsNameLabel_1.setBounds(465, 13, 49, 14);
		panel.add(residentsNameLabel_1);

		residentsNameLabel_2 = new JLabel();
		residentsNameLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_2.setText("Date:");
		residentsNameLabel_2.setBounds(690, 13, 42, 14);
		panel.add(residentsNameLabel_2);

		txtRoom = new JTextField();
		txtRoom.setBackground(Color.WHITE);
		txtRoom.setEditable(false);
		txtRoom.setBounds(520, 9, 164, 20);
		panel.add(txtRoom);

		dcDateField = new JDateChooser();
		dcDateField.setDateFormatString("MM/dd/yyyy");
		dcDateField.setFocusable(false);
		dcDateField.setBounds(766, 7, 102, 17);
		panel.add(dcDateField);

		residentsNameLabel_3 = new JLabel();
		residentsNameLabel_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_3.setText("PT Eval ( )");
		residentsNameLabel_3.setBounds(48, 46, 72, 14);
		panel.add(residentsNameLabel_3);

		residentsNameLabel_4 = new JLabel();
		residentsNameLabel_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_4.setText("OT Eval ( )");
		residentsNameLabel_4.setBounds(48, 82, 72, 14);
		panel.add(residentsNameLabel_4);

		residentsNameLabel_5 = new JLabel();
		residentsNameLabel_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_5.setText("ST Eval ( )");
		residentsNameLabel_5.setBounds(48, 116, 72, 14);
		panel.add(residentsNameLabel_5);

		txtPtRecert = new JTextField();
		txtPtRecert.setBounds(412, 45, 155, 20);
		panel.add(txtPtRecert);

		txtOtRecert = new JTextField();
		txtOtRecert.setBounds(412, 81, 155, 20);
		panel.add(txtOtRecert);

		txtStRecert = new JTextField();
		txtStRecert.setBounds(412, 116, 155, 20);
		panel.add(txtStRecert);

		residentsNameLabel_6 = new JLabel();
		residentsNameLabel_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_6.setText("PT Re-Cert:");
		residentsNameLabel_6.setBounds(304, 49, 83, 14);
		panel.add(residentsNameLabel_6);

		residentsNameLabel_7 = new JLabel();
		residentsNameLabel_7.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_7.setText("OT Re-Cert:");
		residentsNameLabel_7.setBounds(304, 85, 83, 14);
		panel.add(residentsNameLabel_7);

		residentsNameLabel_8 = new JLabel();
		residentsNameLabel_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_8.setText("ST Re-Cert:");
		residentsNameLabel_8.setBounds(304, 119, 83, 14);
		panel.add(residentsNameLabel_8);

		residentsNameLabel_9 = new JLabel();
		residentsNameLabel_9.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_9.setText("Date:");
		residentsNameLabel_9.setBounds(635, 49, 49, 14);
		panel.add(residentsNameLabel_9);

		residentsNameLabel_10 = new JLabel();
		residentsNameLabel_10.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_10.setText("Date:");
		residentsNameLabel_10.setBounds(635, 85, 42, 14);
		panel.add(residentsNameLabel_10);

		residentsNameLabel_11 = new JLabel();
		residentsNameLabel_11.setFont(new Font("Dialog", Font.PLAIN, 14));
		residentsNameLabel_11.setText("Date:");
		residentsNameLabel_11.setBounds(635, 119, 42, 14);
		panel.add(residentsNameLabel_11);

		dcPtDate = new JDateChooser();
		dcPtDate.setDateFormatString("MM/dd/yyyy");
		dcPtDate.setBounds(691, 47, 102, 17);
		panel.add(dcPtDate);

		dcOtDate = new JDateChooser();
		dcOtDate.setDateFormatString("MM/dd/yyyy");
		dcOtDate.setBounds(690, 83, 102, 17);
		panel.add(dcOtDate);

		dcStDate = new JDateChooser();
		dcStDate.setDateFormatString("MM/dd/yyyy");
		dcStDate.setBounds(691, 117, 102, 17);
		panel.add(dcStDate);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 300, 890, 716);
		add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(2, 2, 290, 705);
		panel_1.add(panel_2);

		residentsNameLabel_12 = new JLabel();
		residentsNameLabel_12.setBounds(90, 10, 72, 14);
		panel_2.add(residentsNameLabel_12);
		residentsNameLabel_12.setFont(new Font("Arial", Font.BOLD, 16));
		residentsNameLabel_12.setText(" PT Eval ");

		pttx5X3X5Label = new JLabel();
		pttx5X3X5Label.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label.setText("PTTXs   X3   X5   X6   WK / 4  WKS");
		pttx5X3X5Label.setBounds(10, 42, 187, 14);
		panel_2.add(pttx5X3X5Label);

		pttx5X3X5Label_3 = new JLabel();
		pttx5X3X5Label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_3.setText("Therapeutic exercises");
		pttx5X3X5Label_3.setBounds(10, 110, 121, 14);
		panel_2.add(pttx5X3X5Label_3);

		pttx5X3X5Label_4 = new JLabel();
		pttx5X3X5Label_4.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_4.setText("Transfer training");
		pttx5X3X5Label_4.setBounds(10, 140, 100, 14);
		panel_2.add(pttx5X3X5Label_4);

		pttx5X3X5Label_5 = new JLabel();
		pttx5X3X5Label_5.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_5.setText("balance training");
		pttx5X3X5Label_5.setBounds(10, 170, 88, 14);
		panel_2.add(pttx5X3X5Label_5);

		pttx5X3X5Label_6 = new JLabel();
		pttx5X3X5Label_6.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_6.setText("Coordination training");
		pttx5X3X5Label_6.setBounds(10, 200, 121, 14);
		panel_2.add(pttx5X3X5Label_6);

		pttx5X3X5Label_7 = new JLabel();
		pttx5X3X5Label_7.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_7.setText("Therapeutic activities");
		pttx5X3X5Label_7.setBounds(10, 230, 121, 14);
		panel_2.add(pttx5X3X5Label_7);

		pttx5X3X5Label_8 = new JLabel();
		pttx5X3X5Label_8.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_8.setText("Gaint training ");
		pttx5X3X5Label_8.setBounds(10, 260, 83, 14);
		panel_2.add(pttx5X3X5Label_8);

		pttx5X3X5Label_9 = new JLabel();
		pttx5X3X5Label_9.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_9.setText("Stair training");
		pttx5X3X5Label_9.setBounds(10, 290, 72, 14);
		panel_2.add(pttx5X3X5Label_9);

		pttx5X3X5Label_10 = new JLabel();
		pttx5X3X5Label_10.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_10.setText("PT - Staff -Family Education ");
		pttx5X3X5Label_10.setBounds(10, 320, 153, 14);
		panel_2.add(pttx5X3X5Label_10);

		pttx5X3X5Label_11 = new JLabel();
		pttx5X3X5Label_11.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_11.setText("D/C Planning ");
		pttx5X3X5Label_11.setBounds(10, 350, 83, 14);
		panel_2.add(pttx5X3X5Label_11);

		pttx5X3X5Label_12 = new JLabel();
		pttx5X3X5Label_12.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_12.setText("Other");
		pttx5X3X5Label_12.setBounds(10, 380, 36, 14);
		panel_2.add(pttx5X3X5Label_12);

		pttx5X3X5Label_13 = new JLabel();
		pttx5X3X5Label_13.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_13.setText("Modality PRN");
		pttx5X3X5Label_13.setBounds(10, 410, 83, 14);
		panel_2.add(pttx5X3X5Label_13);

		pttx5X3X5Label_14 = new JLabel();
		pttx5X3X5Label_14.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_14.setText("Continue PTTXs   X3   X5   X6   WK / 4 WKS");
		pttx5X3X5Label_14.setBounds(10, 440, 243, 14);
		panel_2.add(pttx5X3X5Label_14);

		pttx5X3X5Label_15 = new JLabel();
		pttx5X3X5Label_15.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_15.setText("D/C PT to restorative nursing program ");
		pttx5X3X5Label_15.setBounds(10, 470, 224, 14);
		panel_2.add(pttx5X3X5Label_15);

		cbPtTherapeuticExercise = new JCheckBox();
		cbPtTherapeuticExercise.setBackground(Color.WHITE);
		cbPtTherapeuticExercise.setBounds(138, 110, 21, 18);
		panel_2.add(cbPtTherapeuticExercise);

		cbPtTransfer = new JCheckBox();
		cbPtTransfer.setBackground(Color.WHITE);
		cbPtTransfer.setBounds(116, 140, 21, 18);
		panel_2.add(cbPtTransfer);

		cbPtBalance = new JCheckBox();
		cbPtBalance.setBackground(Color.WHITE);
		cbPtBalance.setBounds(116, 170, 21, 18);
		panel_2.add(cbPtBalance);

		cbPtCoordination = new JCheckBox();
		cbPtCoordination.setBackground(Color.WHITE);
		cbPtCoordination.setBounds(137, 200, 28, 18);
		panel_2.add(cbPtCoordination);

		cbPtTherapeuticActivities = new JCheckBox();
		cbPtTherapeuticActivities.setBackground(Color.WHITE);
		cbPtTherapeuticActivities.setBounds(137, 230, 25, 18);
		panel_2.add(cbPtTherapeuticActivities);

		cbPtGaint = new JCheckBox();
		cbPtGaint.setBackground(Color.WHITE);
		cbPtGaint.setBounds(99, 260, 25, 18);
		panel_2.add(cbPtGaint);

		cbPtStair = new JCheckBox();
		cbPtStair.setBackground(Color.WHITE);
		cbPtStair.setBounds(99, 290, 25, 18);
		panel_2.add(cbPtStair);

		cbPtPtStaff = new JCheckBox();
		cbPtPtStaff.setBackground(Color.WHITE);
		cbPtPtStaff.setBounds(180, 320, 25, 18);
		panel_2.add(cbPtPtStaff);

		cbPtPlanning = new JCheckBox();
		cbPtPlanning.setBackground(Color.WHITE);
		cbPtPlanning.setBounds(103, 350, 28, 18);
		panel_2.add(cbPtPlanning);

		cbPtOtherCb = new JCheckBox();
		cbPtOtherCb.setBackground(Color.WHITE);
		cbPtOtherCb.setBounds(243, 380, 25, 18);
		panel_2.add(cbPtOtherCb);

		cbPtModalityCb = new JCheckBox();
		cbPtModalityCb.setBackground(Color.WHITE);
		cbPtModalityCb.setBounds(243, 410, 25, 18);
		panel_2.add(cbPtModalityCb);

		txtPtOther = new JTextField();
		txtPtOther.setBounds(52, 378, 164, 20);
		panel_2.add(txtPtOther);

		txtPtModality = new JTextField();
		txtPtModality.setBounds(90, 409, 139, 20);
		panel_2.add(txtPtModality);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBounds(294, 0, 295, 716);
		panel_1.add(panel_4);

		residentsNameLabel_13 = new JLabel();
		residentsNameLabel_13.setFont(new Font("Arial", Font.BOLD, 16));
		residentsNameLabel_13.setText("OT Eval");
		residentsNameLabel_13.setBounds(108, 10, 72, 14);
		panel_4.add(residentsNameLabel_13);

		pttx5X3X5Label_1 = new JLabel();
		pttx5X3X5Label_1.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_1.setText("OTTXs   X3   X5   X6   WK / 4  WKS");
		pttx5X3X5Label_1.setBounds(10, 42, 187, 14);
		panel_4.add(pttx5X3X5Label_1);

		pttx5X3X5Label_16 = new JLabel();
		pttx5X3X5Label_16.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_16.setText("Therapeutic exercises");
		pttx5X3X5Label_16.setBounds(10, 110, 121, 14);
		panel_4.add(pttx5X3X5Label_16);

		pttx5X3X5Label_17 = new JLabel();
		pttx5X3X5Label_17.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_17.setText("Therapeutic activities");
		pttx5X3X5Label_17.setBounds(10, 140, 121, 14);
		panel_4.add(pttx5X3X5Label_17);

		pttx5X3X5Label_18 = new JLabel();
		pttx5X3X5Label_18.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_18.setText("Activities tolerance");
		pttx5X3X5Label_18.setBounds(10, 170, 101, 14);
		panel_4.add(pttx5X3X5Label_18);

		pttx5X3X5Label_19 = new JLabel();
		pttx5X3X5Label_19.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_19.setText("Balance tarining");
		pttx5X3X5Label_19.setBounds(10, 200, 89, 14);
		panel_4.add(pttx5X3X5Label_19);

		pttx5X3X5Label_20 = new JLabel();
		pttx5X3X5Label_20.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_20.setText("Transfer training");
		pttx5X3X5Label_20.setBounds(10, 230, 100, 14);
		panel_4.add(pttx5X3X5Label_20);

		pttx5X3X5Label_21 = new JLabel();
		pttx5X3X5Label_21.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_21.setText("ADLs training");
		pttx5X3X5Label_21.setBounds(10, 260, 88, 14);
		panel_4.add(pttx5X3X5Label_21);

		pttx5X3X5Label_22 = new JLabel();
		pttx5X3X5Label_22.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_22.setText("Modality PRN");
		pttx5X3X5Label_22.setBounds(10, 290, 83, 14);
		panel_4.add(pttx5X3X5Label_22);

		pttx5X3X5Label_23 = new JLabel();
		pttx5X3X5Label_23.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_23.setText("W/C positioning / management");
		pttx5X3X5Label_23.setBounds(10, 320, 187, 14);
		panel_4.add(pttx5X3X5Label_23);

		pttx5X3X5Label_24 = new JLabel();
		pttx5X3X5Label_24.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_24.setText("Contracture management");
		pttx5X3X5Label_24.setBounds(10, 350, 150, 14);
		panel_4.add(pttx5X3X5Label_24);

		pttx5X3X5Label_25 = new JLabel();
		pttx5X3X5Label_25.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_25.setText("PT / Staff / Caregiver Education");
		pttx5X3X5Label_25.setBounds(10, 380, 170, 14);
		panel_4.add(pttx5X3X5Label_25);

		pttx5X3X5Label_26 = new JLabel();
		pttx5X3X5Label_26.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_26.setText("D/C Planning ");
		pttx5X3X5Label_26.setBounds(10, 410, 83, 14);
		panel_4.add(pttx5X3X5Label_26);

		pttx5X3X5Label_27 = new JLabel();
		pttx5X3X5Label_27.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_27.setText("Other");
		pttx5X3X5Label_27.setBounds(10, 440, 36, 14);
		panel_4.add(pttx5X3X5Label_27);

		txtOtOther = new JTextField();
		txtOtOther.setBounds(52, 440, 183, 20);
		panel_4.add(txtOtOther);

		txtOtModality = new JTextField();
		txtOtModality.setBounds(98, 290, 137, 20);
		panel_4.add(txtOtModality);

		pttx5X3X5Label_28 = new JLabel();
		pttx5X3X5Label_28.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_28.setText("Continue OTTXs   X3   X5   X6   WK / 4 WKS");
		pttx5X3X5Label_28.setBounds(10, 480, 243, 14);
		panel_4.add(pttx5X3X5Label_28);

		pttx5X3X5Label_29 = new JLabel();
		pttx5X3X5Label_29.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_29.setText("D/C OT to restorative nursing program ");
		pttx5X3X5Label_29.setBounds(11, 564, 224, 14);
		panel_4.add(pttx5X3X5Label_29);

		cbOtTherapeuticExercise = new JCheckBox();
		cbOtTherapeuticExercise.setBackground(Color.WHITE);
		cbOtTherapeuticExercise.setBounds(137, 110, 21, 18);
		panel_4.add(cbOtTherapeuticExercise);

		cbOtTherapeuticActivities = new JCheckBox();
		cbOtTherapeuticActivities.setBackground(Color.WHITE);
		cbOtTherapeuticActivities.setBounds(137, 140, 25, 18);
		panel_4.add(cbOtTherapeuticActivities);

		cbOtActivities = new JCheckBox();
		cbOtActivities.setBackground(Color.WHITE);
		cbOtActivities.setBounds(120, 170, 25, 18);
		panel_4.add(cbOtActivities);

		cbOtBalance = new JCheckBox();
		cbOtBalance.setBackground(Color.WHITE);
		cbOtBalance.setBounds(120, 200, 21, 18);
		panel_4.add(cbOtBalance);

		cbOtTransfer = new JCheckBox();
		cbOtTransfer.setBackground(Color.WHITE);
		cbOtTransfer.setBounds(116, 230, 21, 18);
		panel_4.add(cbOtTransfer);

		cbOtAdls = new JCheckBox();
		cbOtAdls.setBackground(Color.WHITE);
		cbOtAdls.setBounds(108, 260, 21, 18);
		panel_4.add(cbOtAdls);

		cbOtModalityCb = new JCheckBox();
		cbOtModalityCb.setBackground(Color.WHITE);
		cbOtModalityCb.setBounds(241, 290, 25, 18);
		panel_4.add(cbOtModalityCb);

		cbOtWcPositioning = new JCheckBox();
		cbOtWcPositioning.setBackground(Color.WHITE);
		cbOtWcPositioning.setBounds(196, 320, 25, 18);
		panel_4.add(cbOtWcPositioning);

		cbOtContracture = new JCheckBox();
		cbOtContracture.setBackground(Color.WHITE);
		cbOtContracture.setBounds(166, 350, 25, 18);
		panel_4.add(cbOtContracture);

		cbOtPtStaff = new JCheckBox();
		cbOtPtStaff.setBackground(Color.WHITE);
		cbOtPtStaff.setBounds(196, 380, 25, 18);
		panel_4.add(cbOtPtStaff);

		cbOtPlanning = new JCheckBox();
		cbOtPlanning.setBackground(Color.WHITE);
		cbOtPlanning.setBounds(99, 410, 28, 18);
		panel_4.add(cbOtPlanning);

		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(588, 2, 300, 705);
		panel_1.add(panel_5);

		residentsNameLabel_14 = new JLabel();
		residentsNameLabel_14.setFont(new Font("Arial", Font.BOLD, 16));
		residentsNameLabel_14.setText("ST Eval");
		residentsNameLabel_14.setBounds(107, 10, 72, 14);
		panel_5.add(residentsNameLabel_14);

		pttx5X3X5Label_2 = new JLabel();
		pttx5X3X5Label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_2.setText("STTXs   X3   X5   X6   WK / 4  WKS");
		pttx5X3X5Label_2.setBounds(36, 42, 187, 14);
		panel_5.add(pttx5X3X5Label_2);

		pttx5X3X5Label_30 = new JLabel();
		pttx5X3X5Label_30.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_30.setText("OM exercises");
		pttx5X3X5Label_30.setBounds(40, 110, 132, 14);
		panel_5.add(pttx5X3X5Label_30);

		pttx5X3X5Label_31 = new JLabel();
		pttx5X3X5Label_31.setText("diet to");
		pttx5X3X5Label_31.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_31.setBounds(40, 90, 54, 14);
		panel_5.add(pttx5X3X5Label_31);

		pttx5X3X5Label_32 = new JLabel();
		pttx5X3X5Label_32.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_32.setText("Compensatory strategy training");
		pttx5X3X5Label_32.setBounds(40, 140, 183, 14);
		panel_5.add(pttx5X3X5Label_32);

		pttx5X3X5Label_33 = new JLabel();
		pttx5X3X5Label_33.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_33.setText("Laryngeal exercises");
		pttx5X3X5Label_33.setBounds(40, 170, 132, 14);
		panel_5.add(pttx5X3X5Label_33);

		pttx5X3X5Label_34 = new JLabel();
		pttx5X3X5Label_34.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_34.setText("Articulation exercises");
		pttx5X3X5Label_34.setBounds(40, 200, 132, 14);
		panel_5.add(pttx5X3X5Label_34);

		pttx5X3X5Label_35 = new JLabel();
		pttx5X3X5Label_35.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_35.setText("Word-retrieval exercises");
		pttx5X3X5Label_35.setBounds(40, 230, 132, 14);
		panel_5.add(pttx5X3X5Label_35);

		pttx5X3X5Label_36 = new JLabel();
		pttx5X3X5Label_36.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_36.setText("Automatic speech exercises");
		pttx5X3X5Label_36.setBounds(40, 260, 154, 14);
		panel_5.add(pttx5X3X5Label_36);

		pttx5X3X5Label_37 = new JLabel();
		pttx5X3X5Label_37.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_37.setText("Orientation exercises");
		pttx5X3X5Label_37.setBounds(40, 290, 132, 14);
		panel_5.add(pttx5X3X5Label_37);

		pttx5X3X5Label_38 = new JLabel();
		pttx5X3X5Label_38.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_38.setText("Direction following exercises");
		pttx5X3X5Label_38.setBounds(40, 320, 187, 14);
		panel_5.add(pttx5X3X5Label_38);

		pttx5X3X5Label_39 = new JLabel();
		pttx5X3X5Label_39.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_39.setText("Y/N ? exercises");
		pttx5X3X5Label_39.setBounds(40, 350, 132, 14);
		panel_5.add(pttx5X3X5Label_39);

		pttx5X3X5Label_40 = new JLabel();
		pttx5X3X5Label_40.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_40.setText("Categorization exercises");
		pttx5X3X5Label_40.setBounds(40, 380, 154, 14);
		panel_5.add(pttx5X3X5Label_40);

		pttx5X3X5Label_41 = new JLabel();
		pttx5X3X5Label_41.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_41.setText("WH ? exercises");
		pttx5X3X5Label_41.setBounds(40, 410, 132, 14);
		panel_5.add(pttx5X3X5Label_41);

		pttx5X3X5Label_42 = new JLabel();
		pttx5X3X5Label_42.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_42.setText("Vocal intensity exercises");
		pttx5X3X5Label_42.setBounds(40, 440, 139, 14);
		panel_5.add(pttx5X3X5Label_42);

		pttx5X3X5Label_43 = new JLabel();
		pttx5X3X5Label_43.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_43.setText("Speech rate exercises");
		pttx5X3X5Label_43.setBounds(40, 470, 132, 14);
		panel_5.add(pttx5X3X5Label_43);

		pttx5X3X5Label_44 = new JLabel();
		pttx5X3X5Label_44.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_44.setText("Other");
		pttx5X3X5Label_44.setBounds(40, 500, 30, 14);
		panel_5.add(pttx5X3X5Label_44);

		pttx5X3X5Label_45 = new JLabel();
		pttx5X3X5Label_45.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_45.setText("Continue OTTXs   X3   X5   X6   WK / 4 WKS");
		pttx5X3X5Label_45.setBounds(40, 564, 243, 14);
		panel_5.add(pttx5X3X5Label_45);

		pttx5X3X5Label_46 = new JLabel();
		pttx5X3X5Label_46.setFont(new Font("Arial", Font.PLAIN, 12));
		pttx5X3X5Label_46.setText("D/C OT to restorative nursing program ");
		pttx5X3X5Label_46.setBounds(40, 627, 224, 14);
		panel_5.add(pttx5X3X5Label_46);

		cbStDietCb = new JCheckBox();
		cbStDietCb.setBackground(Color.WHITE);
		cbStDietCb.setBounds(13, 90, 21, 18);
		panel_5.add(cbStDietCb);

		cbStOm = new JCheckBox();
		cbStOm.setBackground(Color.WHITE);
		cbStOm.setBounds(13, 110, 21, 18);
		panel_5.add(cbStOm);

		cbStCompensatory = new JCheckBox();
		cbStCompensatory.setBackground(Color.WHITE);
		cbStCompensatory.setBounds(13, 140, 21, 18);
		panel_5.add(cbStCompensatory);

		cbStLaryngeal = new JCheckBox();
		cbStLaryngeal.setBackground(Color.WHITE);
		cbStLaryngeal.setBounds(13, 170, 21, 18);
		panel_5.add(cbStLaryngeal);

		cbStArticulation = new JCheckBox();
		cbStArticulation.setBackground(Color.WHITE);
		cbStArticulation.setBounds(13, 200, 21, 18);
		panel_5.add(cbStArticulation);

		cbStWord = new JCheckBox();
		cbStWord.setBackground(Color.WHITE);
		cbStWord.setBounds(13, 230, 21, 18);
		panel_5.add(cbStWord);

		cbStAutomatic = new JCheckBox();
		cbStAutomatic.setBackground(Color.WHITE);
		cbStAutomatic.setBounds(13, 260, 21, 18);
		panel_5.add(cbStAutomatic);

		cbStOrientation = new JCheckBox();
		cbStOrientation.setBackground(Color.WHITE);
		cbStOrientation.setBounds(13, 290, 21, 18);
		panel_5.add(cbStOrientation);

		cbStDirection = new JCheckBox();
		cbStDirection.setBackground(Color.WHITE);
		cbStDirection.setBounds(13, 320, 21, 18);
		panel_5.add(cbStDirection);

		cbStYNExercises = new JCheckBox();
		cbStYNExercises.setBackground(Color.WHITE);
		cbStYNExercises.setBounds(13, 350, 21, 18);
		panel_5.add(cbStYNExercises);

		cbStCategorization = new JCheckBox();
		cbStCategorization.setBackground(Color.WHITE);
		cbStCategorization.setBounds(13, 380, 21, 18);
		panel_5.add(cbStCategorization);

		cbStWHExercises = new JCheckBox();
		cbStWHExercises.setBackground(Color.WHITE);
		cbStWHExercises.setBounds(13, 410, 21, 18);
		panel_5.add(cbStWHExercises);

		cbStVocal = new JCheckBox();
		cbStVocal.setBackground(Color.WHITE);
		cbStVocal.setBounds(13, 440, 21, 18);
		panel_5.add(cbStVocal);

		cbStSpeech = new JCheckBox();
		cbStSpeech.setBackground(Color.WHITE);
		cbStSpeech.setBounds(13, 470, 21, 18);
		panel_5.add(cbStSpeech);

		cbStOtherCb = new JCheckBox();
		cbStOtherCb.setBackground(Color.WHITE);
		cbStOtherCb.setBounds(13, 500, 21, 18);
		panel_5.add(cbStOtherCb);

		txtStDietTo = new JTextField();
		txtStDietTo.setBounds(100, 83, 132, 21);
		panel_5.add(txtStDietTo);

		txtStOther = new JTextField();
		txtStOther.setBounds(100, 500, 183, 20);
		panel_5.add(txtStOther);

		pttx5X3X5Label_47 = new JLabel();
		pttx5X3X5Label_47.setFont(new Font("Arial", Font.PLAIN, 14));
		pttx5X3X5Label_47.setText("Nursing Signature");
		pttx5X3X5Label_47.setBounds(53, 1048, 122, 18);
		add(pttx5X3X5Label_47);

		pttx5X3X5Label_48 = new JLabel();
		pttx5X3X5Label_48.setFont(new Font("Arial", Font.PLAIN, 14));
		pttx5X3X5Label_48.setText("MD Signature");
		pttx5X3X5Label_48.setBounds(53, 1087, 86, 18);
		add(pttx5X3X5Label_48);

		cmbNurseSignature = new JComboBox();
		cmbNurseSignature.setBounds(187, 1048, 248, 21);
		add(cmbNurseSignature);

		cmbMdSignature = new JComboBox();
		cmbMdSignature.setBounds(187, 1087, 248, 21);
		add(cmbMdSignature);

		pttx5X3X5Label_49 = new JLabel();
		pttx5X3X5Label_49.setFont(new Font("Arial", Font.PLAIN, 14));
		pttx5X3X5Label_49.setText("Therapist's Signature");
		pttx5X3X5Label_49.setBounds(506, 1069, 150, 18);
		add(pttx5X3X5Label_49);

		cmbTherapistSignature = new JComboBox();
		cmbTherapistSignature.setBounds(662, 1069, 228, 21);
		add(cmbTherapistSignature);

		fillCombos();
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
		cmbNurseSignature.addItem(user.getUserName());
		cmbMdSignature.addItem(user.getUserName());
		cmbTherapistSignature.addItem(user.getUserName());
		// cmbNurseSignature.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { "", "sue", "mary", "julie", }));
		// cmbMdSignature.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { "", "XYZ" }));
		// cmbTherapistSignature.setModel(new javax.swing.DefaultComboBoxModel(
		// new String[] { "", "Tom", "John" }));

	}

	public void doSave() {

		PhysicianPlazaHealthCare refPhysicianPlazaHealthCare = new PhysicianPlazaHealthCare();
		refPhysicianPlazaHealthCare.setResidentId(Global.currentResidenceKey);

		refPhysicianPlazaHealthCare
				.setTherapistSignature((String) cmbTherapistSignature
						.getSelectedItem());
		refPhysicianPlazaHealthCare.setMdSignature((String) cmbMdSignature
				.getSelectedItem());
		refPhysicianPlazaHealthCare
				.setNurseSignature((String) cmbNurseSignature.getSelectedItem());
		refPhysicianPlazaHealthCare.setStOther(txtStOther.getText());
		refPhysicianPlazaHealthCare.setStDietTo(txtStDietTo.getText());
		refPhysicianPlazaHealthCare.setStOtherCb(cbStOtherCb.isSelected());
		refPhysicianPlazaHealthCare.setStSpeech(cbStSpeech.isSelected());
		refPhysicianPlazaHealthCare.setStVocal(cbStVocal.isSelected());
		refPhysicianPlazaHealthCare.setStWHExercises(cbStWHExercises
				.isSelected());
		refPhysicianPlazaHealthCare.setStCategorization(cbStCategorization
				.isSelected());
		refPhysicianPlazaHealthCare.setStYNExercises(cbStYNExercises
				.isSelected());
		refPhysicianPlazaHealthCare.setStDirection(cbStDirection.isSelected());
		refPhysicianPlazaHealthCare.setStOrientation(cbStOrientation
				.isSelected());
		refPhysicianPlazaHealthCare.setStAutomatic(cbStAutomatic.isSelected());
		refPhysicianPlazaHealthCare.setStWord(cbStWord.isSelected());
		refPhysicianPlazaHealthCare.setStArticulation(cbStArticulation
				.isSelected());
		refPhysicianPlazaHealthCare.setStLaryngeal(cbStLaryngeal.isSelected());
		refPhysicianPlazaHealthCare.setStCompensatory(cbStCompensatory
				.isSelected());
		refPhysicianPlazaHealthCare.setStOm(cbStOm.isSelected());
		refPhysicianPlazaHealthCare.setStDietCb(cbStDietCb.isSelected());
		refPhysicianPlazaHealthCare.setOtPlanning(cbOtPlanning.isSelected());
		refPhysicianPlazaHealthCare.setOtPtStaff(cbOtPtStaff.isSelected());
		refPhysicianPlazaHealthCare.setOtContracture(cbOtContracture
				.isSelected());
		refPhysicianPlazaHealthCare.setOtWcPositioning(cbOtWcPositioning
				.isSelected());
		refPhysicianPlazaHealthCare
				.setOtModalityCb(cbOtModalityCb.isSelected());
		refPhysicianPlazaHealthCare.setOtAdls(cbOtAdls.isSelected());
		refPhysicianPlazaHealthCare.setOtTransfer(cbOtTransfer.isSelected());
		refPhysicianPlazaHealthCare.setOtBalance(cbOtBalance.isSelected());
		refPhysicianPlazaHealthCare
				.setOtActivities(cbOtActivities.isSelected());
		refPhysicianPlazaHealthCare
				.setOtTherapeuticActivities(cbOtTherapeuticActivities
						.isSelected());
		refPhysicianPlazaHealthCare
				.setOtTherapeuticExercise(cbOtTherapeuticExercise.isSelected());
		refPhysicianPlazaHealthCare.setOtModality(txtOtModality.getText());
		refPhysicianPlazaHealthCare.setOtOther(txtOtOther.getText());
		refPhysicianPlazaHealthCare.setPtModality(txtPtModality.getText());
		refPhysicianPlazaHealthCare.setPtOther(txtPtOther.getText());
		refPhysicianPlazaHealthCare
				.setPtModalityCb(cbPtModalityCb.isSelected());
		refPhysicianPlazaHealthCare.setPtOtherCb(cbPtOtherCb.isSelected());
		refPhysicianPlazaHealthCare.setPtPlanning(cbPtPlanning.isSelected());
		refPhysicianPlazaHealthCare.setPtPtStaff(cbPtPtStaff.isSelected());
		refPhysicianPlazaHealthCare.setPtStair(cbPtStair.isSelected());
		refPhysicianPlazaHealthCare.setPtGaint(cbPtGaint.isSelected());
		refPhysicianPlazaHealthCare
				.setPtTherapeuticActivities(cbPtTherapeuticActivities
						.isSelected());
		refPhysicianPlazaHealthCare.setPtCoordination(cbPtCoordination
				.isSelected());
		refPhysicianPlazaHealthCare.setPtBalance(cbPtBalance.isSelected());
		refPhysicianPlazaHealthCare.setPtTransfer(cbPtTransfer.isSelected());
		refPhysicianPlazaHealthCare
				.setPtTherapeuticExercise(cbPtTherapeuticExercise.isSelected());
		refPhysicianPlazaHealthCare.setStDate(dcStDate.getDate());
		refPhysicianPlazaHealthCare.setOtDate(dcOtDate.getDate());
		refPhysicianPlazaHealthCare.setPtDate(dcPtDate.getDate());
		refPhysicianPlazaHealthCare.setStRecert(txtStRecert.getText());
		refPhysicianPlazaHealthCare.setOtRecert(txtOtRecert.getText());
		refPhysicianPlazaHealthCare.setPtRecert(txtPtRecert.getText());
		refPhysicianPlazaHealthCare.setDateField(dcDateField.getDate());
		refPhysicianPlazaHealthCare.setRoom(txtRoom.getText());
		refPhysicianPlazaHealthCare
				.setResidentsName(txtResidentsName.getText());

		try {
			Global.currentPhysicianPlazaHealthCareKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianPlazaHealthCare(
							refPhysicianPlazaHealthCare);
		} catch (Exception e) {
		}
	}

	public void updateData() {
		PhysicianPlazaHealthCare refPhysicianPlazaHealthCare = null;

		if (Global.currentPhysicianPlazaHealthCareKey != 0) {
			try {
				refPhysicianPlazaHealthCare = MedrexClientManager.getInstance()
						.getPhysicianPlazaHealthCare(
								Global.currentPhysicianPlazaHealthCareKey);
			} catch (Exception e) {

			}
			cmbTherapistSignature.setSelectedItem(refPhysicianPlazaHealthCare
					.getTherapistSignature());
			cmbMdSignature.setSelectedItem(refPhysicianPlazaHealthCare
					.getMdSignature());
			cmbNurseSignature.setSelectedItem(refPhysicianPlazaHealthCare
					.getNurseSignature());
			txtStOther.setText(refPhysicianPlazaHealthCare.getStOther());
			txtStDietTo.setText(refPhysicianPlazaHealthCare.getStDietTo());
			cbStOtherCb.setSelected(refPhysicianPlazaHealthCare.isStOtherCb());
			cbStSpeech.setSelected(refPhysicianPlazaHealthCare.isStSpeech());
			cbStVocal.setSelected(refPhysicianPlazaHealthCare.isStVocal());
			cbStWHExercises.setSelected(refPhysicianPlazaHealthCare
					.isStWHExercises());
			cbStCategorization.setSelected(refPhysicianPlazaHealthCare
					.isStCategorization());
			cbStYNExercises.setSelected(refPhysicianPlazaHealthCare
					.isStYNExercises());
			cbStDirection.setSelected(refPhysicianPlazaHealthCare
					.isStDirection());
			cbStOrientation.setSelected(refPhysicianPlazaHealthCare
					.isStOrientation());
			cbStAutomatic.setSelected(refPhysicianPlazaHealthCare
					.isStAutomatic());
			cbStWord.setSelected(refPhysicianPlazaHealthCare.isStWord());
			cbStArticulation.setSelected(refPhysicianPlazaHealthCare
					.isStArticulation());
			cbStLaryngeal.setSelected(refPhysicianPlazaHealthCare
					.isStLaryngeal());
			cbStCompensatory.setSelected(refPhysicianPlazaHealthCare
					.isStCompensatory());
			cbStOm.setSelected(refPhysicianPlazaHealthCare.isStOm());
			cbStDietCb.setSelected(refPhysicianPlazaHealthCare.isStDietCb());
			cbOtPlanning
					.setSelected(refPhysicianPlazaHealthCare.isOtPlanning());
			cbOtPtStaff.setSelected(refPhysicianPlazaHealthCare.isOtPtStaff());
			cbOtContracture.setSelected(refPhysicianPlazaHealthCare
					.isOtContracture());
			cbOtWcPositioning.setSelected(refPhysicianPlazaHealthCare
					.isOtWcPositioning());
			cbOtModalityCb.setSelected(refPhysicianPlazaHealthCare
					.isOtModalityCb());
			cbOtAdls.setSelected(refPhysicianPlazaHealthCare.isOtAdls());
			cbOtTransfer
					.setSelected(refPhysicianPlazaHealthCare.isOtTransfer());
			cbOtBalance.setSelected(refPhysicianPlazaHealthCare.isOtBalance());
			cbOtActivities.setSelected(refPhysicianPlazaHealthCare
					.isOtActivities());
			cbOtTherapeuticActivities.setSelected(refPhysicianPlazaHealthCare
					.isOtTherapeuticActivities());
			cbOtTherapeuticExercise.setSelected(refPhysicianPlazaHealthCare
					.isOtTherapeuticExercise());
			txtOtModality.setText(refPhysicianPlazaHealthCare.getOtModality());
			txtOtOther.setText(refPhysicianPlazaHealthCare.getOtOther());
			txtPtModality.setText(refPhysicianPlazaHealthCare.getPtModality());
			txtPtOther.setText(refPhysicianPlazaHealthCare.getPtOther());
			cbPtModalityCb.setSelected(refPhysicianPlazaHealthCare
					.isPtModalityCb());
			cbPtOtherCb.setSelected(refPhysicianPlazaHealthCare.isPtOtherCb());
			cbPtPlanning
					.setSelected(refPhysicianPlazaHealthCare.isPtPlanning());
			cbPtPtStaff.setSelected(refPhysicianPlazaHealthCare.isPtPtStaff());
			cbPtStair.setSelected(refPhysicianPlazaHealthCare.isPtStair());
			cbPtGaint.setSelected(refPhysicianPlazaHealthCare.isPtGaint());
			cbPtTherapeuticActivities.setSelected(refPhysicianPlazaHealthCare
					.isPtTherapeuticActivities());
			cbPtCoordination.setSelected(refPhysicianPlazaHealthCare
					.isPtCoordination());
			cbPtBalance.setSelected(refPhysicianPlazaHealthCare.isPtBalance());
			cbPtTransfer
					.setSelected(refPhysicianPlazaHealthCare.isPtTransfer());
			cbPtTherapeuticExercise.setSelected(refPhysicianPlazaHealthCare
					.isPtTherapeuticExercise());
			dcStDate.setDate(refPhysicianPlazaHealthCare.getStDate());
			dcOtDate.setDate(refPhysicianPlazaHealthCare.getOtDate());
			dcPtDate.setDate(refPhysicianPlazaHealthCare.getPtDate());
			txtStRecert.setText(refPhysicianPlazaHealthCare.getStRecert());
			txtOtRecert.setText(refPhysicianPlazaHealthCare.getOtRecert());
			txtPtRecert.setText(refPhysicianPlazaHealthCare.getPtRecert());
			dcDateField.setDate(refPhysicianPlazaHealthCare.getDateField());
			txtRoom.setText(refPhysicianPlazaHealthCare.getRoom());
			txtResidentsName.setText(refPhysicianPlazaHealthCare
					.getResidentsName());
		}
	}

}