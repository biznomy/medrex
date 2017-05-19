package medrex.client.main.dietary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.dietary.DietaryCommunicationForm;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelDietaryCommunicationForm extends JPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ButtonGroup bgAdmission = new ButtonGroup();
	private JRadioButton rbReadmission;
	private JRadioButton rbNewAdmission;
	private ButtonGroup bgEatingSt = new ButtonGroup();
	private JLabel nurseSignatureLabel;
	private JComboBox cmbNurse;
	private JPanel panel_18;
	private JTextField txtEnternalTube;
	private JLabel enternalTubeLabel;
	private JDateChooser dateChooser;
	private ButtonGroup bgResidentdc = new ButtonGroup();
	private JTextField txtIndependent;
	private JTextField txtPartialAssistance;
	private JTextField txtSupplement;
	private JTextField txtNewDiet;
	private JLabel readmissionLabel_13;
	private JTextField txtPreviousDiet;
	private JLabel readmissionLabel_12;
	private JPanel panel_13;
	private JTextField txtDietChange;
	private JLabel readmissionLabel_11;
	private JPanel panel_12;
	private JTextField txtDietOrder;
	private JLabel readmissionLabel_10;
	private JPanel panel_11;
	private JRadioButton rbOnUnit;
	private JLabel readmissionLabel_9;
	private JRadioButton rbRoom;
	private JLabel readmissionLabel_8;
	private JRadioButton rbDiningRoom;
	private JLabel readmissionLabel_7;
	private JLabel readmissionLabel_6;
	private JTextField txtEating;
	private JPanel panel_10;
	private JTextField txtTime;
	private JLabel readmissionLabel_5;
	private JTextField txtEarly;
	private JCheckBox cbVisually;
	private JPanel panel_9;
	private JLabel readmissionLabel_4;
	private JTextField txtDietitian;
	private JLabel readmissionLabel_3;
	private JTextField txtWeight;
	private JPanel panel_7;
	private JTextField txtRoomChangeTo;
	private JLabel toLabel;
	private JTextField txtRoomChangeFrom;
	private JLabel readmissionLabel_2;
	private JTextField txtRoomChange;
	private JLabel readmissionLabel_1;
	private JTextField txtHeight;
	private JPanel panel_6;
	private JRadioButton rbExpired;
	private JRadioButton rbhosp;
	private JRadioButton rbHome;
	private JLabel residentDcToLabel;
	private JTextField txtResidentDC;
	private JPanel panel_5;
	private JLabel statusLabel;
	private JTextField txtStage;
	private JLabel decubitusLabel;
	private JTextField txtDecubitus;
	private JPanel panel_4;
	private JLabel adaptiveFeedingDocumentLabel;
	private JTextField txtAdaptiveFeeding;
	private JLabel foodAllergiesLabel;
	private JTextField txtFoodAllergies;
	private JPanel panel_3;
	private JTextField txtPhysician;
	private JLabel physicianLabel;
	private JTextField txtResidentName;
	private JLabel residentNameLabel;
	private JPanel panel_2;
	private JTextField txtRoom;
	private JLabel roomLabel;
	private JLabel dateLabel;
	private JPanel panel_1;
	private JLabel dietLabel;
	private JPanel panel;

	public PanelDietaryCommunicationForm() {
		super();
		Global.panelDietaryCommunicationForm = this;
		setLayout(null);
		// setPreferredSize(new Dimension(950, 730));
		setPreferredSize(new Dimension(950, 575));
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(2, 2, 940, 588);
		add(panel);

		dietLabel = new JLabel();
		dietLabel.setFont(new Font("", Font.BOLD, 20));
		dietLabel.setText("DIETARY COMMUNICATION FORM");
		dietLabel.setBounds(245, 0, 400, 34);
		panel.add(dietLabel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 28, 940, 30);
		panel.add(panel_1);

		dateLabel = new JLabel();
		dateLabel.setText("Date");
		dateLabel.setBounds(10, 10, 31, 14);
		panel_1.add(dateLabel);

		roomLabel = new JLabel();
		roomLabel.setText("Room#");
		roomLabel.setBounds(518, 10, 54, 14);
		panel_1.add(roomLabel);

		txtRoom = new JTextField();
		txtRoom.setBackground(Color.WHITE);
		txtRoom.setEditable(false);
		txtRoom.setBounds(563, 9, 183, 20);
		panel_1.add(txtRoom);

		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("MM/dd/yyyy");
		dateChooser.setBounds(53, 10, 156, 21);
		panel_1.add(dateChooser);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 59, 940, 30);
		panel.add(panel_2);

		residentNameLabel = new JLabel();
		residentNameLabel.setText("Resident Name");
		residentNameLabel.setBounds(10, 10, 80, 14);
		panel_2.add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBackground(Color.WHITE);
		txtResidentName.setEditable(false);
		txtResidentName.setBounds(95, 10, 183, 20);
		panel_2.add(txtResidentName);

		physicianLabel = new JLabel();
		physicianLabel.setText("Physician");
		physicianLabel.setBounds(358, 15, 60, 14);
		panel_2.add(physicianLabel);

		txtPhysician = new JTextField();
		txtPhysician.setBackground(Color.WHITE);
		txtPhysician.setEditable(false);
		txtPhysician.setBounds(412, 10, 334, 20);
		panel_2.add(txtPhysician);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 91, 940, 30);
		panel.add(panel_3);

		txtFoodAllergies = new JTextField();
		txtFoodAllergies.setBounds(10, 10, 268, 20);
		panel_3.add(txtFoodAllergies);

		foodAllergiesLabel = new JLabel();
		foodAllergiesLabel.setText("Food Allergies");
		foodAllergiesLabel.setBounds(284, 15, 80, 14);
		panel_3.add(foodAllergiesLabel);

		txtAdaptiveFeeding = new JTextField();
		txtAdaptiveFeeding.setBounds(519, 10, 256, 20);
		panel_3.add(txtAdaptiveFeeding);

		adaptiveFeedingDocumentLabel = new JLabel();
		adaptiveFeedingDocumentLabel.setText("Adaptive Feeding Document");
		adaptiveFeedingDocumentLabel.setBounds(370, 12, 160, 21);
		panel_3.add(adaptiveFeedingDocumentLabel);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 124, 940, 30);
		panel.add(panel_4);

		txtDecubitus = new JTextField();
		txtDecubitus.setBounds(301, 10, 232, 20);
		panel_4.add(txtDecubitus);

		decubitusLabel = new JLabel();
		decubitusLabel.setText("Decubitus");
		decubitusLabel.setBounds(542, 15, 54, 14);
		panel_4.add(decubitusLabel);

		txtStage = new JTextField();
		txtStage.setBounds(602, 10, 255, 20);
		panel_4.add(txtStage);

		statusLabel = new JLabel();
		statusLabel.setText("Stage");
		statusLabel.setBounds(863, 15, 28, 14);
		panel_4.add(statusLabel);

		rbNewAdmission = new JRadioButton();
		rbNewAdmission.setActionCommand("1");
		bgAdmission.add(rbNewAdmission);
		rbNewAdmission.setBackground(Color.WHITE);
		rbNewAdmission.setText("New Admission");
		rbNewAdmission.setBounds(205, 11, 92, 18);
		panel_4.add(rbNewAdmission);

		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 155, 940, 30);
		panel.add(panel_5);

		txtResidentDC = new JTextField();
		txtResidentDC.setBounds(352, 10, 209, 20);
		panel_5.add(txtResidentDC);

		residentDcToLabel = new JLabel();
		residentDcToLabel.setText("Resident D/C to");
		residentDcToLabel.setBounds(567, 13, 80, 14);
		panel_5.add(residentDcToLabel);

		rbHome = new JRadioButton();
		rbHome.setActionCommand("1");
		bgResidentdc.add(rbHome);
		rbHome.setBackground(Color.WHITE);
		rbHome.setText("Home");
		rbHome.setBounds(653, 11, 51, 18);
		panel_5.add(rbHome);

		rbhosp = new JRadioButton();
		rbhosp.setActionCommand("2");
		bgResidentdc.add(rbhosp);
		rbhosp.setBackground(Color.WHITE);
		rbhosp.setText("Hosp");
		rbhosp.setBounds(710, 11, 51, 18);
		panel_5.add(rbhosp);

		rbExpired = new JRadioButton();
		rbExpired.setActionCommand("3");
		bgResidentdc.add(rbExpired);
		rbExpired.setBackground(Color.WHITE);
		rbExpired.setText("Expired");
		rbExpired.setBounds(767, 11, 60, 18);
		panel_5.add(rbExpired);

		rbReadmission = new JRadioButton();
		bgAdmission.add(rbReadmission);
		rbReadmission.setActionCommand("2");
		rbReadmission.setBackground(Color.WHITE);
		rbReadmission.setText("Readmission");
		rbReadmission.setBounds(205, 11, 106, 18);
		panel_5.add(rbReadmission);

		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 191, 940, 30);
		panel.add(panel_6);

		txtHeight = new JTextField();
		txtHeight.setBounds(10, 10, 206, 20);
		panel_6.add(txtHeight);

		readmissionLabel_1 = new JLabel();
		readmissionLabel_1.setText("Height");
		readmissionLabel_1.setBounds(222, 16, 62, 14);
		panel_6.add(readmissionLabel_1);

		txtRoomChange = new JTextField();
		txtRoomChange.setBounds(353, 10, 206, 20);
		panel_6.add(txtRoomChange);

		readmissionLabel_2 = new JLabel();
		readmissionLabel_2.setText("Room Change From #");
		readmissionLabel_2.setBounds(565, 13, 105, 14);
		panel_6.add(readmissionLabel_2);

		txtRoomChangeFrom = new JTextField();
		txtRoomChangeFrom.setBounds(676, 10, 120, 20);
		panel_6.add(txtRoomChangeFrom);

		toLabel = new JLabel();
		toLabel.setText("to #");
		toLabel.setBounds(802, 13, 30, 14);
		panel_6.add(toLabel);

		txtRoomChangeTo = new JTextField();
		txtRoomChangeTo.setBounds(827, 10, 105, 20);
		panel_6.add(txtRoomChangeTo);

		panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		panel_7.setBounds(0, 222, 940, 30);
		panel.add(panel_7);

		txtWeight = new JTextField();
		txtWeight.setBounds(10, 10, 206, 20);
		panel_7.add(txtWeight);

		readmissionLabel_3 = new JLabel();
		readmissionLabel_3.setText("Weight");
		readmissionLabel_3.setBounds(222, 14, 62, 14);
		panel_7.add(readmissionLabel_3);

		txtDietitian = new JTextField();
		txtDietitian.setBounds(353, 11, 206, 20);
		panel_7.add(txtDietitian);

		readmissionLabel_4 = new JLabel();
		readmissionLabel_4
				.setText("Dietitian/Food Service Supervisor Visit Resident");
		readmissionLabel_4.setBounds(565, 13, 250, 14);
		panel_7.add(readmissionLabel_4);

		panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 258, 940, 30);
		panel.add(panel_9);

		cbVisually = new JCheckBox();
		cbVisually.setBackground(Color.WHITE);
		cbVisually.setText("Visually Impaired");
		cbVisually.setBounds(10, 10, 100, 18);
		panel_9.add(cbVisually);

		txtEarly = new JTextField();
		txtEarly.setBounds(353, 10, 207, 20);
		panel_9.add(txtEarly);

		readmissionLabel_5 = new JLabel();
		readmissionLabel_5.setText("Early/Late Tray - Time ");
		readmissionLabel_5.setBounds(566, 12, 109, 14);
		panel_9.add(readmissionLabel_5);

		txtTime = new JTextField();
		txtTime.setBounds(681, 9, 198, 20);
		panel_9.add(txtTime);

		panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBounds(0, 290, 940, 30);
		panel.add(panel_10);

		txtEating = new JTextField();
		txtEating.setBounds(10, 10, 206, 20);
		panel_10.add(txtEating);

		readmissionLabel_6 = new JLabel();
		readmissionLabel_6.setText("Eating st:");
		readmissionLabel_6.setBounds(222, 14, 50, 14);
		panel_10.add(readmissionLabel_6);

		readmissionLabel_7 = new JLabel();
		readmissionLabel_7.setText("Dinning Room");
		readmissionLabel_7.setBounds(278, 14, 70, 14);
		panel_10.add(readmissionLabel_7);

		rbDiningRoom = new JRadioButton();
		rbDiningRoom.setActionCommand("1");
		bgEatingSt.add(rbDiningRoom);
		rbDiningRoom.setBackground(Color.WHITE);
		rbDiningRoom.setBounds(354, 11, 20, 18);
		panel_10.add(rbDiningRoom);

		readmissionLabel_8 = new JLabel();
		readmissionLabel_8.setText("Room");
		readmissionLabel_8.setBounds(400, 14, 43, 14);
		panel_10.add(readmissionLabel_8);

		rbRoom = new JRadioButton();
		rbRoom.setActionCommand("2");
		bgEatingSt.add(rbRoom);
		rbRoom.setBackground(Color.WHITE);
		rbRoom.setBounds(435, 12, 20, 18);
		panel_10.add(rbRoom);

		readmissionLabel_9 = new JLabel();
		readmissionLabel_9.setText("on Unit Dining Room");
		readmissionLabel_9.setBounds(489, 14, 100, 14);
		panel_10.add(readmissionLabel_9);

		rbOnUnit = new JRadioButton();
		rbOnUnit.setActionCommand("3");
		bgEatingSt.add(rbOnUnit);
		rbOnUnit.setBackground(Color.WHITE);
		rbOnUnit.setBounds(595, 12, 20, 18);
		panel_10.add(rbOnUnit);

		panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null);
		panel_11.setBounds(0, 326, 940, 24);
		panel.add(panel_11);

		readmissionLabel_10 = new JLabel();
		readmissionLabel_10.setText("Diet Order:");
		readmissionLabel_10.setBounds(10, 3, 60, 14);
		panel_11.add(readmissionLabel_10);

		txtDietOrder = new JTextField();
		txtDietOrder.setBounds(130, 2, 484, 20);
		panel_11.add(txtDietOrder);

		panel_12 = new JPanel();
		panel_12.setBounds(0, 352, 940, 95);
		panel.add(panel_12);
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);

		readmissionLabel_11 = new JLabel();
		readmissionLabel_11.setText("Diet Change:");
		readmissionLabel_11.setBounds(10, 5, 70, 14);
		panel_12.add(readmissionLabel_11);

		txtDietChange = new JTextField();
		txtDietChange.setBounds(131, 5, 484, 20);
		panel_12.add(txtDietChange);

		panel_13 = new JPanel();
		panel_13.setBounds(0, 30, 691, 61);
		panel_12.add(panel_13);
		panel_13.setBackground(Color.WHITE);
		panel_13.setLayout(null);

		readmissionLabel_12 = new JLabel();
		readmissionLabel_12.setText("Previous Diet:");
		readmissionLabel_12.setBounds(10, 5, 70, 15);
		panel_13.add(readmissionLabel_12);

		txtPreviousDiet = new JTextField();
		txtPreviousDiet.setBounds(131, 5, 484, 20);
		panel_13.add(txtPreviousDiet);

		readmissionLabel_13 = new JLabel();
		readmissionLabel_13.setText("New Diet:");
		readmissionLabel_13.setBounds(10, 35, 70, 15);
		panel_13.add(readmissionLabel_13);

		txtNewDiet = new JTextField();
		txtNewDiet.setBounds(131, 35, 484, 20);
		panel_13.add(txtNewDiet);

		final JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setLayout(null);
		panel_14.setBounds(0, 450, 940, 28);
		panel.add(panel_14);

		final JLabel supplementLabel = new JLabel();
		supplementLabel.setText("Supplement");
		supplementLabel.setBounds(10, 10, 100, 14);
		panel_14.add(supplementLabel);

		txtSupplement = new JTextField();
		txtSupplement.setBounds(131, 2, 482, 21);
		panel_14.add(txtSupplement);

		final JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setLayout(null);
		panel_15.setBounds(0, 475, 687, 30);
		panel.add(panel_15);

		final JLabel partialAssistanceLabel = new JLabel();
		partialAssistanceLabel.setText("Partial Assistance");
		partialAssistanceLabel.setBounds(10, 10, 91, 14);
		panel_15.add(partialAssistanceLabel);

		txtPartialAssistance = new JTextField();
		txtPartialAssistance.setBounds(130, 7, 483, 21);
		panel_15.add(txtPartialAssistance);

		final JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_16.setLayout(null);
		panel_16.setBounds(0, 510, 687, 24);
		panel.add(panel_16);

		final JLabel independentLabel = new JLabel();
		independentLabel.setText("Independent");
		independentLabel.setBounds(10, 3, 80, 14);
		panel_16.add(independentLabel);

		txtIndependent = new JTextField();
		txtIndependent.setBounds(130, 0, 482, 21);
		panel_16.add(txtIndependent);

		final JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setLayout(null);
		panel_17.setBounds(0, 540, 687, 25);
		panel.add(panel_17);

		enternalTubeLabel = new JLabel();
		enternalTubeLabel.setText("Enternal Tube");
		enternalTubeLabel.setBounds(10, 5, 87, 14);
		panel_17.add(enternalTubeLabel);

		txtEnternalTube = new JTextField();
		txtEnternalTube.setBounds(130, 2, 483, 21);
		panel_17.add(txtEnternalTube);

		panel_18 = new JPanel();
		panel_18.setBackground(Color.WHITE);
		panel_18.setLayout(null);
		panel_18.setBounds(692, 531, 248, 34);
		panel.add(panel_18);

		cmbNurse = new JComboBox();
		cmbNurse.setBackground(Color.WHITE);
		cmbNurse.setBounds(0, 10, 219, 20);
		panel_18.add(cmbNurse);

		nurseSignatureLabel = new JLabel();
		nurseSignatureLabel.setText("Nurse Signature");
		nurseSignatureLabel.setBounds(106, 47, 200, 22);
		panel_18.add(nurseSignatureLabel);

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
		cmbNurse.addItem(user.getUserName());
		String doctorName = "";
		List l = new ArrayList();
		if (Global.currentResidenceKey != 0) {
			try {
				l = MedrexClientManager.getInstance().getPhysicianForms(
						Global.currentResidenceKey);
				Iterator<PhysicianForm> i = l.iterator();
				while (i.hasNext()) {
					PhysicianForm Phyform = i.next();
					Doctors d = Phyform.getPhysician();// MedrexClientManager.getInstance().getDoctorsRecord(Phyform.getPhysicianId());
					if (d.getDoctorType().getMsterName().equalsIgnoreCase(
							"PHYSICIAN")) {
						doctorName = d.getPhysicianSurName() + " , "
								+ d.getPhysicianName();
					}
				}
			} catch (Exception e) {
			}
		}
		txtPhysician.setText(doctorName);
	}

	public void updateData() {
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txtRoom.setText(rm.getRoom());
		} catch (Exception e) {

		}

		List physicianFormList = null;
		try {
			physicianFormList = MedrexClientManager.getInstance()
					.getPhysicianForms(Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator itr = physicianFormList.iterator();
		while (itr.hasNext()) {
			PhysicianForm physicianForm = (PhysicianForm) itr.next();
			Doctors doct = null;
			try {
				doct = physicianForm.getPhysician();// MedrexClientManager.getInstance().getDoctorsRecord(physicianForm.getPhysicianId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (doct.getDoctorType().toString().equals("Physicians")) {
				txtPhysician.setText(doct.getPhysicianName());
				break;
			}
		}

		if (Global.currentDietaryCommunicationFormKey == 0) {

			dateChooser.setDate(null);
			// txtPhysician.setText("");
			txtFoodAllergies.setText("");
			txtAdaptiveFeeding.setText("");
			txtDecubitus.setText("");
			txtStage.setText("");
			txtResidentDC.setText("");
			SwingUtils.setSelectedButton(bgResidentdc, 0);
			txtHeight.setText("");
			txtRoomChange.setText("");
			txtWeight.setText("");
			txtDietitian.setText("");
			cbVisually.setSelected(false);
			txtEarly.setText("");
			txtTime.setText("");
			txtEating.setText("");
			SwingUtils.setSelectedButton(bgEatingSt, 0);
			txtDietOrder.setText("");
			txtPreviousDiet.setText("");
			txtNewDiet.setText("");
			txtSupplement.setText("");
			txtPartialAssistance.setText("");
			txtIndependent.setText("");
			txtEnternalTube.setText("");
			cmbNurse.setSelectedItem("");

		} else {
			DietaryCommunicationForm dcf = null;
			try {
				dcf = MedrexClientManager.getInstance()
						.getDietaryCommunicationForm(
								(Global.currentDietaryCommunicationFormKey));
			} catch (Exception e) {

			}

			SwingUtils.setSelectedButton(bgAdmission, dcf.getAdmission());

			dateChooser.setDate(dcf.getDateCreated());
			// txtPhysician.setText("");
			txtFoodAllergies.setText(dcf.getFoodAllergies());
			txtAdaptiveFeeding.setText(dcf.getAdaptiveFeedingEquipment());

			txtDecubitus.setText(dcf.getDecubitis());
			txtStage.setText(dcf.getStage());

			txtResidentDC.setText(dcf.getResidentDC());
			SwingUtils.setSelectedButton(bgResidentdc, dcf.getResidentDCTo());
			txtHeight.setText(dcf.getHeight());
			txtRoomChange.setText(dcf.getRoomChange());
			txtWeight.setText(dcf.getWeight());
			txtDietitian.setText(dcf.getDietitian());
			cbVisually.setSelected(dcf.isVisuallyImpaired());
			txtEarly.setText(dcf.getEarlyLate());
			txtTime.setText(dcf.getEarlyLateTime());
			txtEating.setText(dcf.getEating());
			SwingUtils.setSelectedButton(bgEatingSt, 0);
			txtDietOrder.setText(dcf.getDietOrder());
			txtPreviousDiet.setText(dcf.getPreviousDiet());
			txtNewDiet.setText(dcf.getNewDiet());
			txtSupplement.setText(dcf.getSupplement());
			txtPartialAssistance.setText(dcf.getPartialAssistance());
			txtIndependent.setText(dcf.getIndependent());
			txtEnternalTube.setText(dcf.getEnternalTube());
			cmbNurse.setSelectedItem(dcf.getNurseSignature());

		}

	}

	public int doSave() {
		DietaryCommunicationForm dcf = new DietaryCommunicationForm();
		dcf.setSerial(Global.currentDietaryCommunicationFormKey);
		dcf.setResidentId(Global.currentResidenceKey);

		dcf.setFormId(Global.currentDietaryCommunicationFormKey);

		dcf.setAdmission(SwingUtils.getSelectedButton(bgAdmission));

		dcf.setDateCreated(dateChooser.getDate());
		dcf.setFoodAllergies(txtFoodAllergies.getText());
		dcf.setAdaptiveFeedingEquipment(txtAdaptiveFeeding.getText());
		dcf.setDecubitis(txtDecubitus.getText());
		dcf.setStage(txtStage.getText());
		dcf.setResidentDC(txtResidentDC.getText());
		dcf.setResidentDCTo(SwingUtils.getSelectedButton(bgResidentdc));
		dcf.setHeight(txtHeight.getText());
		dcf.setRoomChange(txtRoomChange.getText());
		dcf.setWeight(txtWeight.getText());
		dcf.setDietitian(txtDietitian.getText());
		dcf.setVisuallyImpaired(cbVisually.isSelected());
		dcf.setEarlyLate(txtEarly.getText());
		dcf.setEarlyLateTime(txtTime.getText());
		dcf.setEating(txtEating.getText());
		// SwingUtils.getSelectedButton(bgEatingSt, 0);
		dcf.setDietOrder(txtDietOrder.getText());
		dcf.setPreviousDiet(txtPreviousDiet.getText());
		dcf.setNewDiet(txtNewDiet.getText());
		dcf.setSupplement(txtSupplement.getText());
		dcf.setPartialAssistance(txtPartialAssistance.getText());
		dcf.setIndependent(txtIndependent.getText());
		dcf.setEnternalTube(txtEnternalTube.getText());
		dcf.setNurseSignature((String) cmbNurse.getSelectedItem());

		try {
			Global.currentDietaryCommunicationFormKey = MedrexClientManager
					.getInstance().insertOrUpdateDietaryCommunicationForm(dcf);
		} catch (Exception e) {
		}
		return Global.currentDietaryCommunicationFormKey;
	}

	public void doLoad() {

	}

	public void doUpdate() {

	}

	public boolean doValidate() {
		return true;
	}

}
