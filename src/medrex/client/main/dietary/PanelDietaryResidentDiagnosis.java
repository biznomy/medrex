package medrex.client.main.dietary;

import java.awt.Color;
import java.awt.Dimension;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.Utils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.dietary.DietaryResidentDiagnosis;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.sX.swing.JxRichTextField;
import com.sX.swing.notes.JxNotes;
import com.toedter.calendar.JDateChooser;

public class PanelDietaryResidentDiagnosis extends JPanel {

	private ButtonGroup bgAppetite = new ButtonGroup();
	private ButtonGroup bgNormal = new ButtonGroup();
	private JRadioButton rbAppetite1;
	private JRadioButton rbAppetite5;
	private JRadioButton rbAppetite4;
	private JRadioButton rbAppetite3;
	private JRadioButton rbAppetite2;
	private JTextArea txtApproaches7;
	private JTextArea txtApproaches6;
	private JTextArea txtApproaches5;
	private JTextArea txtApproaches4;
	private JTextArea txtApproaches3;
	private JTextArea txtApproaches2;
	private JTextArea txtApproaches1;
	private JTextArea txtProblems7;
	private JTextArea txtProblems6;
	private JTextArea txtProblems5;
	private JTextArea txtProblems4;
	private JTextArea txtProblems3;
	private JTextArea txtProblems2;
	private JTextArea txtProblems1;
	private JDateChooser dcDateField2;
	private JLabel dateLabel_49;
	private JComboBox cmbDieticianSign;
	private JLabel dateLabel_48;
	// private JTextArea txtDieticianComment;
	private JLabel dateLabel_47;
	private JxNotes txtGoal;
	private JLabel dateLabel_46;
	private JLabel dateLabel_45;
	private JLabel dateLabel_44;
	private JPanel panel_18;
	private JPanel panel_17;
	private JPanel panel_16;
	private JPanel panel_15;
	private JPanel panel_14;
	private JPanel panel_13;
	private JPanel panel_12;
	private JPanel panel_11;
	private JPanel panel_10;
	private JPanel panel_9;
	private JPanel panel_8;
	private JPanel panel_7;
	private JPanel panel_6;
	private JPanel panel_5;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel;
	private JTextField txtFluidField;
	private JLabel dateLabel_43;
	private JTextField txtProtien;
	private JLabel dateLabel_42;
	private JTextField txtEstRequirement;
	private JLabel dateLabel_41;
	private JTextField txtBee;
	private JLabel dateLabel_40;
	private JTextField txtEdemaField;
	private JLabel dateLabel_39;
	private JTextField txtConstipation;
	private JLabel dateLabel_38;
	private JTextField txtOpenAreas;
	private JLabel dateLabel_37;
	private JTextField txtEstDbw;
	private JTextField txtUbw;
	private JTextField txtWeight;
	private JTextField txtHeight;
	private JLabel dateLabel_36;
	private JLabel dateLabel_35;
	private JLabel dateLabel_34;
	private JLabel dateLabel_33;
	private JTextField txtRroom;
	private JTextField txtDinningRoom;
	private JTextField txtLoungRoom;
	private JLabel dateLabel_32;
	private JLabel dateLabel_31;
	private JLabel dateLabel_30;
	private JxRichTextField txtFoodAllergy;
	private JLabel dateLabel_29;
	private JTextField txtFoodDislikes;
	private JLabel dateLabel_28;
	private JTextField txtFoodLikes;
	private JLabel dateLabel_27;
	private JTextField txtFeeder;
	private JTextField txtNeedsHelp;
	private JTextField txtResidentFeeds;
	private JLabel dateLabel_26;
	private JLabel dateLabel_25;
	private JLabel dateLabel_24;
	private JTextField txtSwallowing;
	private JLabel dateLabel_23;
	private JTextField txtChewingAbility;
	private JLabel dateLabel_22;
	private JTextField txtDentureOwn;
	private JTextField txtDentureEd;
	private JTextField txtDentureBottom;
	private JTextField txtDentureTop;
	private JLabel dateLabel_21;
	private JLabel dateLabel_20;
	private JLabel dateLabel_19;
	private JLabel dateLabel_18;
	private JTextField txtFluid;
	private JLabel dateLabel_17;
	private JLabel dateLabel_12;
	private JxRichTextField txtmentalStatus;
	private JxRichTextField txtPhysicalDis;
	private JxRichTextField txtCultural;
	private JLabel dateLabel_9;
	private JLabel dateLabel_8;
	private JLabel dateLabel_7;
	private JTextArea txtMedication;
	private JTextArea txtDiagnosis;
	private JTextField txtAge;
	private JLabel dateLabel_11;
	private JTextField txtRoomNo;
	private JLabel dateLabel_10;
	private JTextField txtLabData;
	private JxRichTextField txtDiet;
	private JTextField txtResidentName;
	private JLabel dateLabel_6;
	private JLabel dateLabel_5;
	private JLabel dateLabel_4;
	private JLabel dateLabel_3;
	private JLabel dateLabel_2;
	private JTextField txtPhysicianName;
	private JLabel dateLabel_1;
	private JDateChooser dcDateField1;
	private JLabel dateLabel;

	private JPanel panel_1;
	private JxNotes txtProblemApproches;
	private Notes notesProblemApproches;
	private JTextField txtAdaptiveEquipment;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;
	private Notes notesGoals;
	private TempRoomHistory list;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelDietaryResidentDiagnosis() {
		super();
		Global.panelDietaryResidentDiagnosis = this;
		setPreferredSize(new Dimension(800, 1200));
		setBackground(Color.WHITE);
		setLayout(null);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 50, 790, 1190);
		add(panel_1);

		dateLabel = new JLabel();
		dateLabel.setText("Date:");
		dateLabel.setBounds(10, 10, 40, 14);
		panel_1.add(dateLabel);

		dcDateField1 = new JDateChooser();
		dcDateField1.setDateFormatString("MM/dd/yyyy");
		dcDateField1.setBounds(49, 10, 130, 20);
		panel_1.add(dcDateField1);

		dateLabel_1 = new JLabel();
		dateLabel_1.setText("Physician:");
		dateLabel_1.setBounds(400, 10, 65, 14);
		panel_1.add(dateLabel_1);

		List<PhysicianForm> phyform = null;
		String tempPhysicianForm = "";
		try {
			phyform = MedrexClientManager.getInstance().getPhysicianForms(
					Global.currentResidenceKey);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MedrexException e) {
			e.printStackTrace();
		}
		Iterator<PhysicianForm> phy = phyform.iterator();
		while (phy.hasNext()) {
			PhysicianForm phydata = phy.next();
			if (phydata.getPhyName() != null) {
				tempPhysicianForm += phydata.getPhyName();
				tempPhysicianForm += "  ";
			}
		}

		txtPhysicianName = new JTextField();
		txtPhysicianName.setBackground(Color.WHITE);
		txtPhysicianName.setBounds(465, 10, 296, 20);
		txtPhysicianName.setEditable(false);
		txtPhysicianName.setText(tempPhysicianForm);
		panel_1.add(txtPhysicianName);

		dateLabel_2 = new JLabel();
		dateLabel_2.setText("Resident Name:");
		dateLabel_2.setBounds(10, 40, 90, 14);
		panel_1.add(dateLabel_2);

		dateLabel_3 = new JLabel();
		dateLabel_3.setText("Diet:");
		dateLabel_3.setBounds(10, 70, 90, 14);
		panel_1.add(dateLabel_3);

		dateLabel_4 = new JLabel();
		dateLabel_4.setText("Diagnosises:");
		dateLabel_4.setBounds(10, 100, 74, 14);
		panel_1.add(dateLabel_4);

		dateLabel_5 = new JLabel();
		dateLabel_5.setText("Medications:");
		dateLabel_5.setBounds(10, 160, 104, 14);
		panel_1.add(dateLabel_5);

		dateLabel_6 = new JLabel();
		dateLabel_6.setText("Lab Data:");
		dateLabel_6.setBounds(10, 220, 74, 14);
		panel_1.add(dateLabel_6);

		txtResidentName = new JTextField();
		txtResidentName.setBackground(Color.WHITE);
		txtResidentName.setEditable(false);
		txtResidentName.setBounds(104, 40, 540, 20);
		panel_1.add(txtResidentName);

		// txtOralMotorWfl = new JxRichTextField();
		// txtOralMotorWfl.setArc(0.1f);
		// txtOralMotorWfl.setBorder(GuiModes.CHANGE_SCREEN
		// .getControlBorder());
		// txtOralMotorWfl.setRichTextFieldModel(txtOralMotorWfl,
		// "Speech Therapy: OralMotorWfl");
		// txtOralMotorWfl.setBounds(3, 3, 140, 18);
		// panel_93.add(txtOralMotorWfl);

		txtDiet = new JxRichTextField();
		txtDiet.setArc(0.1f);
		txtDiet.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtDiet.setRichTextFieldModel(txtDiet,
				"Dietary Resident Diagnosis: Diet");
		txtDiet.setBounds(104, 70, 657, 20);
		panel_1.add(txtDiet);

		txtLabData = new JTextField();
		txtLabData.setBounds(104, 220, 657, 20);
		panel_1.add(txtLabData);

		dateLabel_10 = new JLabel();
		dateLabel_10.setText("Room No:");
		dateLabel_10.setBounds(204, 10, 47, 14);
		panel_1.add(dateLabel_10);

		txtRoomNo = new JTextField();
		txtRoomNo.setBackground(Color.WHITE);
		txtRoomNo.setEditable(false);
		txtRoomNo.setBounds(257, 10, 121, 20);
		try {
			TempRoomHistory list = MedrexClientManager.getInstance()
					.getLastRoomHistory(Global.currentResidenceKey);
			if (list.getRoom() != null) {
				txtRoomNo.setText(list.getRoom());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MedrexException e) {
			e.printStackTrace();
		}

		panel_1.add(txtRoomNo);

		dateLabel_11 = new JLabel();
		dateLabel_11.setText("Age:");
		dateLabel_11.setBounds(661, 40, 29, 14);
		panel_1.add(dateLabel_11);

		txtAge = new JTextField();
		txtAge.setBackground(Color.WHITE);
		txtAge.setEditable(false);
		txtAge.setBounds(696, 40, 65, 20);
		panel_1.add(txtAge);

		txtDiagnosis = new JTextArea();
		txtDiagnosis.setBackground(Color.WHITE);
		txtDiagnosis.setBorder(new LineBorder(Color.black, 1, false));
		txtDiagnosis.setEditable(false);
		// txtDiagnosis.setBounds(104, 100, 657, 44);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(104, 100, 657, 44);
		scrollPane.setViewportView(txtDiagnosis);
		panel_1.add(scrollPane);

		List<ResidentDiagnosis> diagnosis = null;
		String tempDiagnosis = "";
		try {
			diagnosis = MedrexClientManager.getInstance()
					.getResidentDiagnosiss(Global.currentResidenceKey);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MedrexException e) {
			e.printStackTrace();
		}
		Iterator<ResidentDiagnosis> it = diagnosis.iterator();
		while (it.hasNext()) {
			ResidentDiagnosis dia = it.next();
			tempDiagnosis += dia.getName();
			tempDiagnosis += "\n";
		}
		txtDiagnosis.setText(tempDiagnosis);
		panel_1.add(scrollPane);

		txtMedication = new JTextArea();
		txtMedication.setBorder(new LineBorder(Color.black, 1, false));
		txtMedication.setBounds(104, 160, 657, 44);
		panel_1.add(txtMedication);

		dateLabel_7 = new JLabel();
		dateLabel_7.setText("Cultural / Religious Preferences:");
		dateLabel_7.setBounds(10, 250, 154, 14);
		panel_1.add(dateLabel_7);

		dateLabel_8 = new JLabel();
		dateLabel_8.setText("Physical Disabilities:");
		dateLabel_8.setBounds(10, 280, 121, 14);
		panel_1.add(dateLabel_8);

		dateLabel_9 = new JLabel();
		dateLabel_9.setText("Mental Status:");
		dateLabel_9.setBounds(10, 310, 74, 14);
		panel_1.add(dateLabel_9);

		txtCultural = new JxRichTextField();
		txtCultural.setArc(0.1f);
		txtCultural.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtCultural.setRichTextFieldModel(txtCultural,
				"Dietary Resident Diagnosis: Culture");
		txtCultural.setBounds(170, 250, 591, 20);
		panel_1.add(txtCultural);

		txtPhysicalDis = new JxRichTextField();
		txtPhysicalDis.setArc(0.1f);
		txtPhysicalDis.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtPhysicalDis.setRichTextFieldModel(txtPhysicalDis,
				"Dietary Resident Diagnosis: PhysicalDisability");
		txtPhysicalDis.setBounds(170, 280, 591, 20);
		panel_1.add(txtPhysicalDis);

		txtmentalStatus = new JxRichTextField();
		txtmentalStatus.setArc(0.1f);
		txtmentalStatus.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtmentalStatus.setRichTextFieldModel(txtmentalStatus,
				"Dietary Resident Diagnosis: MentalStatus");
		txtmentalStatus.setBounds(170, 310, 591, 20);
		panel_1.add(txtmentalStatus);

		dateLabel_12 = new JLabel();
		dateLabel_12.setText("Appetite:");
		dateLabel_12.setBounds(10, 340, 83, 14);
		panel_1.add(dateLabel_12);

		// dateLabel_17 = new JLabel();
		// dateLabel_17.setText("Fluid Intake:");
		// dateLabel_17.setBounds(10, 370, 83, 14);
		// panel_1.add(dateLabel_17);

		// txtFluid = new JTextField();
		// txtFluid.setBounds(170, 370, 591, 20);
		// panel_1.add(txtFluid);

		dateLabel_18 = new JLabel();
		dateLabel_18.setText("Dentures:  Top");
		dateLabel_18.setBounds(10, 400, 83, 14);
		panel_1.add(dateLabel_18);

		dateLabel_19 = new JLabel();
		dateLabel_19.setText("Bottom");
		dateLabel_19.setBounds(239, 400, 40, 14);
		panel_1.add(dateLabel_19);

		dateLabel_20 = new JLabel();
		dateLabel_20.setText("EDentulous");
		dateLabel_20.setBounds(427, 400, 54, 14);
		panel_1.add(dateLabel_20);

		dateLabel_21 = new JLabel();
		dateLabel_21.setText("Own");
		dateLabel_21.setBounds(626, 400, 22, 14);
		panel_1.add(dateLabel_21);

		txtDentureTop = new JTextField();
		txtDentureTop.setBounds(91, 396, 130, 20);
		panel_1.add(txtDentureTop);

		txtDentureBottom = new JTextField();
		txtDentureBottom.setBounds(285, 400, 130, 20);
		panel_1.add(txtDentureBottom);

		txtDentureEd = new JTextField();
		txtDentureEd.setBounds(485, 400, 130, 20);
		panel_1.add(txtDentureEd);

		txtDentureOwn = new JTextField();
		txtDentureOwn.setBounds(654, 400, 107, 20);
		panel_1.add(txtDentureOwn);

		dateLabel_22 = new JLabel();
		dateLabel_22.setText("Chewing Ability:");
		dateLabel_22.setBounds(10, 430, 83, 14);
		panel_1.add(dateLabel_22);

		txtChewingAbility = new JTextField();
		txtChewingAbility.setBounds(99, 430, 316, 20);
		panel_1.add(txtChewingAbility);

		dateLabel_23 = new JLabel();
		dateLabel_23.setText("Swallowing Difficulty:");
		dateLabel_23.setBounds(427, 430, 104, 14);
		panel_1.add(dateLabel_23);

		txtSwallowing = new JTextField();
		txtSwallowing.setBounds(535, 430, 226, 20);
		panel_1.add(txtSwallowing);

		dateLabel_24 = new JLabel();
		dateLabel_24.setText("Resident Feeds Self:");
		dateLabel_24.setBounds(10, 460, 104, 14);
		panel_1.add(dateLabel_24);

		dateLabel_25 = new JLabel();
		dateLabel_25.setText("Needs Help:");
		dateLabel_25.setBounds(328, 460, 65, 14);
		panel_1.add(dateLabel_25);

		dateLabel_26 = new JLabel();
		dateLabel_26.setText("Feeder:");
		dateLabel_26.setBounds(568, 460, 40, 14);
		panel_1.add(dateLabel_26);

		txtResidentFeeds = new JTextField();
		txtResidentFeeds.setBounds(115, 460, 200, 20);
		panel_1.add(txtResidentFeeds);

		txtNeedsHelp = new JTextField();
		txtNeedsHelp.setBounds(390, 460, 162, 20);
		panel_1.add(txtNeedsHelp);

		txtFeeder = new JTextField();
		txtFeeder.setBounds(614, 460, 147, 20);
		panel_1.add(txtFeeder);

		dateLabel_27 = new JLabel();
		dateLabel_27.setText("Food Likes:");
		dateLabel_27.setBounds(10, 490, 65, 14);
		panel_1.add(dateLabel_27);

		txtFoodLikes = new JTextField();
		txtFoodLikes.setBounds(170, 490, 591, 20);
		panel_1.add(txtFoodLikes);

		dateLabel_28 = new JLabel();
		dateLabel_28.setText("Food Dislikes:");
		dateLabel_28.setBounds(10, 520, 65, 14);
		panel_1.add(dateLabel_28);

		txtFoodDislikes = new JTextField();
		txtFoodDislikes.setBounds(170, 520, 591, 20);
		panel_1.add(txtFoodDislikes);

		dateLabel_29 = new JLabel();
		dateLabel_29.setText("Food Allergy:");
		dateLabel_29.setBounds(10, 550, 65, 14);
		panel_1.add(dateLabel_29);

		txtFoodAllergy = new JxRichTextField();
		txtFoodAllergy.setArc(0.1f);
		txtFoodAllergy.setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		txtFoodAllergy.setRichTextFieldModel(txtFoodAllergy,
				"Dietary Resident Diagnosis: FoodAllergies");
		txtFoodAllergy.setBounds(170, 550, 591, 20);
		panel_1.add(txtFoodAllergy);

		dateLabel_30 = new JLabel();
		dateLabel_30.setText("Where Residents Eats:   Room:");
		dateLabel_30.setBounds(10, 580, 154, 14);
		panel_1.add(dateLabel_30);

		dateLabel_31 = new JLabel();
		dateLabel_31.setText("Dinning Room:");
		dateLabel_31.setBounds(319, 580, 74, 14);
		panel_1.add(dateLabel_31);

		dateLabel_32 = new JLabel();
		dateLabel_32.setText("Loung Room:");
		dateLabel_32.setBounds(557, 580, 74, 14);
		panel_1.add(dateLabel_32);

		txtLoungRoom = new JTextField();
		txtLoungRoom.setBounds(631, 580, 130, 20);
		panel_1.add(txtLoungRoom);

		txtDinningRoom = new JTextField();
		txtDinningRoom.setBounds(398, 580, 138, 20);
		panel_1.add(txtDinningRoom);

		txtRroom = new JTextField();
		txtRroom.setBounds(170, 580, 130, 20);
		panel_1.add(txtRroom);

		dateLabel_33 = new JLabel();
		dateLabel_33.setText("Height:");
		dateLabel_33.setBounds(10, 610, 40, 14);
		panel_1.add(dateLabel_33);

		dateLabel_34 = new JLabel();
		dateLabel_34.setText("Weight:");
		dateLabel_34.setBounds(204, 610, 47, 14);
		panel_1.add(dateLabel_34);

		dateLabel_35 = new JLabel();
		dateLabel_35.setText("Est. DBW:");
		dateLabel_35.setBounds(418, 610, 54, 14);
		panel_1.add(dateLabel_35);

		dateLabel_36 = new JLabel();
		dateLabel_36.setText("UBW:");
		dateLabel_36.setBounds(626, 610, 29, 14);
		panel_1.add(dateLabel_36);

		txtHeight = new JTextField();
		txtHeight.setBounds(56, 610, 123, 20);
		panel_1.add(txtHeight);

		txtWeight = new JTextField();
		txtWeight.setBounds(255, 610, 123, 20);
		panel_1.add(txtWeight);

		txtUbw = new JTextField();
		txtUbw.setBounds(665, 610, 96, 20);
		panel_1.add(txtUbw);

		txtEstDbw = new JTextField();
		txtEstDbw.setBounds(481, 610, 104, 20);
		panel_1.add(txtEstDbw);

		dateLabel_37 = new JLabel();
		dateLabel_37.setText("Open Areas:");
		dateLabel_37.setBounds(10, 663, 65, 14);
		panel_1.add(dateLabel_37);

		txtOpenAreas = new JTextField();
		txtOpenAreas.setBounds(91, 660, 200, 20);
		panel_1.add(txtOpenAreas);

		dateLabel_38 = new JLabel();
		dateLabel_38.setText("Constipation:");
		dateLabel_38.setBounds(319, 663, 65, 14);
		panel_1.add(dateLabel_38);

		txtConstipation = new JTextField();
		txtConstipation.setBounds(393, 660, 192, 20);
		panel_1.add(txtConstipation);

		dateLabel_39 = new JLabel();
		dateLabel_39.setText("Edema:");
		dateLabel_39.setBounds(601, 663, 40, 14);
		panel_1.add(dateLabel_39);

		txtEdemaField = new JTextField();
		txtEdemaField.setBounds(643, 660, 118, 20);
		panel_1.add(txtEdemaField);

		dateLabel_40 = new JLabel();
		dateLabel_40.setText("B.E.E.:");
		dateLabel_40.setBounds(10, 694, 40, 14);
		panel_1.add(dateLabel_40);

		txtBee = new JTextField();
		txtBee.setBounds(56, 691, 121, 20);
		panel_1.add(txtBee);

		dateLabel_41 = new JLabel();
		dateLabel_41.setText("Est. Requirements: K-Cals:");
		dateLabel_41.setBounds(204, 694, 130, 14);
		panel_1.add(dateLabel_41);

		txtEstRequirement = new JTextField();
		txtEstRequirement.setBounds(340, 691, 130, 20);
		panel_1.add(txtEstRequirement);

		dateLabel_42 = new JLabel();
		dateLabel_42.setText("Protein:");
		dateLabel_42.setBounds(491, 694, 40, 14);
		panel_1.add(dateLabel_42);

		txtProtien = new JTextField();
		txtProtien.setBounds(541, 691, 90, 20);
		panel_1.add(txtProtien);

		dateLabel_43 = new JLabel();
		dateLabel_43.setText("Fluid:");
		dateLabel_43.setBounds(637, 694, 29, 14);
		panel_1.add(dateLabel_43);

		txtFluidField = new JTextField();
		txtFluidField.setBounds(668, 691, 93, 20);
		panel_1.add(txtFluidField);

		/*
		 * panel = new JPanel(); panel.setBackground(Color.WHITE);
		 * panel.setBorder(new LineBorder(Color.black, 1, false));
		 * panel.setLayout(null); panel.setBounds(11, 697, 750, 313);
		 * panel_1.add(panel);
		 */

		/*
		 * panel_2 = new JPanel(); panel_2.setBackground(Color.WHITE);
		 * panel_2.setBorder(new LineBorder(Color.black, 1, false));
		 * panel_2.setLayout(null); panel_2.setBounds(0, 0, 750, 40);
		 * panel.add(panel_2);
		 */

		/*
		 * panel_3 = new JPanel(); panel_3.setBorder(new LineBorder(Color.black,
		 * 1, false)); panel_3.setBackground(Color.WHITE);
		 * panel_3.setLayout(null); panel_3.setBounds(0, 0, 375, 40);
		 * panel_2.add(panel_3);
		 */

		/*
		 * dateLabel_44 = new JLabel(); dateLabel_44.setFont(new Font("",
		 * Font.PLAIN, 14)); dateLabel_44.setText("Problems");
		 * dateLabel_44.setBounds(117, 10, 85, 20); panel_3.add(dateLabel_44);
		 */

		/*
		 * dateLabel_45 = new JLabel(); dateLabel_45.setFont(new Font("Dialog",
		 * Font.PLAIN, 14)); dateLabel_45.setText("Approaches");
		 * dateLabel_45.setBounds(498, 10, 85, 20); panel_2.add(dateLabel_45);
		 */

		/*
		 * panel_5 = new JPanel(); panel_5.setBorder(new LineBorder(Color.black,
		 * 1, false)); panel_5.setLayout(null);
		 * panel_5.setBackground(Color.WHITE); panel_5.setBounds(0, 39, 750,
		 * 40); panel.add(panel_5);
		 */
		/*
		 * panel_6 = new JPanel(); panel_6.setBorder(new LineBorder(Color.black,
		 * 1, false)); panel_6.setLayout(null);
		 * panel_6.setBackground(Color.WHITE); panel_6.setBounds(0, 0, 375, 40);
		 * panel_5.add(panel_6);
		 * 
		 * txtProblems1 = new JTextArea(); txtProblems1.setWrapStyleWord(true);
		 * txtProblems1.setLineWrap(true); txtProblems1.setBounds(1, 1, 373,
		 * 38); panel_6.add(txtProblems1);
		 */
		/*
		 * txtApproaches1 = new JTextArea(); txtApproaches1.setLineWrap(true);
		 * txtApproaches1.setWrapStyleWord(true); txtApproaches1.setBounds(375,
		 * 1, 373, 38); panel_5.add(txtApproaches1);
		 */

		/*
		 * panel_7 = new JPanel(); panel_7.setBorder(new LineBorder(Color.black,
		 * 1, false)); panel_7.setLayout(null);
		 * panel_7.setBackground(Color.WHITE); panel_7.setBounds(0, 78, 750,
		 * 40); panel.add(panel_7);
		 */

		/*
		 * panel_8 = new JPanel(); panel_8.setBorder(new LineBorder(Color.black,
		 * 1, false)); panel_8.setLayout(null);
		 * panel_8.setBackground(Color.WHITE); panel_8.setBounds(0, 0, 375, 40);
		 * panel_7.add(panel_8);
		 * 
		 * txtProblems2 = new JTextArea(); txtProblems2.setWrapStyleWord(true);
		 * txtProblems2.setLineWrap(true); txtProblems2.setBounds(1, 1, 373,
		 * 38); panel_8.add(txtProblems2);
		 * 
		 * txtApproaches2 = new JTextArea();
		 * txtApproaches2.setWrapStyleWord(true);
		 * txtApproaches2.setLineWrap(true); txtApproaches2.setBounds(375, 1,
		 * 373, 38); panel_7.add(txtApproaches2);
		 * 
		 * panel_9 = new JPanel(); panel_9.setBorder(new LineBorder(Color.black,
		 * 1, false)); panel_9.setLayout(null);
		 * panel_9.setBackground(Color.WHITE); panel_9.setBounds(0, 117, 750,
		 * 40); panel.add(panel_9);
		 * 
		 * panel_10 = new JPanel(); panel_10.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_10.setLayout(null);
		 * panel_10.setBackground(Color.WHITE); panel_10.setBounds(0, 0, 375,
		 * 40); panel_9.add(panel_10);
		 * 
		 * txtProblems3 = new JTextArea(); txtProblems3.setWrapStyleWord(true);
		 * txtProblems3.setLineWrap(true); txtProblems3.setBounds(1, 1, 373,
		 * 38); panel_10.add(txtProblems3);
		 * 
		 * txtApproaches3 = new JTextArea();
		 * txtApproaches3.setWrapStyleWord(true);
		 * txtApproaches3.setLineWrap(true); txtApproaches3.setBounds(375, 1,
		 * 373, 38); panel_9.add(txtApproaches3);
		 * 
		 * panel_11 = new JPanel(); panel_11.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_11.setLayout(null);
		 * panel_11.setBackground(Color.WHITE); panel_11.setBounds(0, 156, 750,
		 * 40); panel.add(panel_11);
		 * 
		 * panel_12 = new JPanel(); panel_12.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_12.setLayout(null);
		 * panel_12.setBackground(Color.WHITE); panel_12.setBounds(0, 0, 375,
		 * 40); panel_11.add(panel_12);
		 * 
		 * txtProblems4 = new JTextArea(); txtProblems4.setWrapStyleWord(true);
		 * txtProblems4.setLineWrap(true); txtProblems4.setBounds(1, 1, 373,
		 * 38); panel_12.add(txtProblems4);
		 * 
		 * txtApproaches4 = new JTextArea();
		 * txtApproaches4.setWrapStyleWord(true);
		 * txtApproaches4.setLineWrap(true); txtApproaches4.setBounds(375, 1,
		 * 373, 38); panel_11.add(txtApproaches4);
		 * 
		 * panel_13 = new JPanel(); panel_13.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_13.setLayout(null);
		 * panel_13.setBackground(Color.WHITE); panel_13.setBounds(0, 195, 750,
		 * 40); panel.add(panel_13);
		 * 
		 * panel_14 = new JPanel(); panel_14.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_14.setLayout(null);
		 * panel_14.setBackground(Color.WHITE); panel_14.setBounds(0, 0, 375,
		 * 40); panel_13.add(panel_14);
		 * 
		 * txtProblems5 = new JTextArea(); txtProblems5.setLineWrap(true);
		 * txtProblems5.setWrapStyleWord(true); txtProblems5.setBounds(1, 1,
		 * 373, 38); panel_14.add(txtProblems5);
		 * 
		 * txtApproaches5 = new JTextArea();
		 * txtApproaches5.setWrapStyleWord(true);
		 * txtApproaches5.setLineWrap(true); txtApproaches5.setBounds(375, 1,
		 * 373, 38); panel_13.add(txtApproaches5);
		 * 
		 * panel_15 = new JPanel(); panel_15.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_15.setLayout(null);
		 * panel_15.setBackground(Color.WHITE); panel_15.setBounds(0, 234, 750,
		 * 40); panel.add(panel_15);
		 * 
		 * panel_16 = new JPanel(); panel_16.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_16.setLayout(null);
		 * panel_16.setBackground(Color.WHITE); panel_16.setBounds(0, 0, 375,
		 * 40); panel_15.add(panel_16);
		 * 
		 * txtProblems6 = new JTextArea(); txtProblems6.setWrapStyleWord(true);
		 * txtProblems6.setLineWrap(true); txtProblems6.setBounds(1, 1, 373,
		 * 38); panel_16.add(txtProblems6);
		 * 
		 * txtApproaches6 = new JTextArea();
		 * txtApproaches6.setWrapStyleWord(true);
		 * txtApproaches6.setLineWrap(true); txtApproaches6.setBounds(375, 1,
		 * 373, 38); panel_15.add(txtApproaches6);
		 * 
		 * panel_17 = new JPanel(); panel_17.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_17.setLayout(null);
		 * panel_17.setBackground(Color.WHITE); panel_17.setBounds(0, 273, 750,
		 * 40); panel.add(panel_17);
		 * 
		 * panel_18 = new JPanel(); panel_18.setBorder(new
		 * LineBorder(Color.black, 1, false)); panel_18.setLayout(null);
		 * panel_18.setBackground(Color.WHITE); panel_18.setBounds(0, 0, 375,
		 * 40); panel_17.add(panel_18);
		 * 
		 * txtProblems7 = new JTextArea(); txtProblems7.setWrapStyleWord(true);
		 * txtProblems7.setLineWrap(true); txtProblems7.setBounds(1, 1, 373,
		 * 38); panel_18.add(txtProblems7);
		 * 
		 * txtApproaches7 = new JTextArea();
		 * txtApproaches7.setWrapStyleWord(true);
		 * txtApproaches7.setLineWrap(true); txtApproaches7.setBounds(375, 1,
		 * 373, 38); panel_17.add(txtApproaches7);
		 */

		dateLabel_46 = new JLabel();
		dateLabel_46.setText("Goal:");
		dateLabel_46.setBounds(10, 1061, 29, 14);
		panel_1.add(dateLabel_46);

		/*
		 * dateLabel_47 = new JLabel();
		 * dateLabel_47.setText("Dietician's Comment:");
		 * dateLabel_47.setBounds(10, 1070, 104, 14); panel_1.add(dateLabel_47);
		 * 
		 * txtDieticianComment = new JTextArea();
		 * txtDieticianComment.setBorder(new LineBorder(Color.black, 1, false));
		 * txtDieticianComment.setBounds(123, 1070, 638, 44);
		 * panel_1.add(txtDieticianComment);
		 */

		dateLabel_48 = new JLabel();
		dateLabel_48.setText("Dietician's Signature:");
		dateLabel_48.setBounds(10, 1101, 104, 14);
		panel_1.add(dateLabel_48);

		cmbDieticianSign = new JComboBox();
		cmbDieticianSign.setBackground(Color.WHITE);
		cmbDieticianSign.setBounds(123, 1098, 408, 20);
		panel_1.add(cmbDieticianSign);

		dateLabel_49 = new JLabel();
		dateLabel_49.setText("Date:");
		dateLabel_49.setBounds(601, 1101, 29, 14);
		panel_1.add(dateLabel_49);

		dcDateField2 = new JDateChooser();
		dcDateField2.setDateFormatString("MM/dd/yyyy");
		dcDateField2.setBounds(643, 1101, 118, 20);
		panel_1.add(dcDateField2);

		rbAppetite2 = new JRadioButton();
		rbAppetite2.setActionCommand("2");
		bgAppetite.add(rbAppetite2);
		rbAppetite2.setBackground(Color.WHITE);
		rbAppetite2.setText("75-100%");
		rbAppetite2.setBounds(204, 340, 96, 20);
		panel_1.add(rbAppetite2);

		rbAppetite3 = new JRadioButton();
		rbAppetite3.setActionCommand("3");
		bgAppetite.add(rbAppetite3);
		rbAppetite3.setBackground(Color.WHITE);
		rbAppetite3.setText("50%");
		rbAppetite3.setBounds(306, 340, 95, 20);
		panel_1.add(rbAppetite3);

		rbAppetite4 = new JRadioButton();
		rbAppetite4.setActionCommand("4");
		bgAppetite.add(rbAppetite4);
		rbAppetite4.setBackground(Color.WHITE);
		rbAppetite4.setText("25-50%");
		rbAppetite4.setBounds(410, 340, 93, 20);
		panel_1.add(rbAppetite4);

		rbAppetite5 = new JRadioButton();
		rbAppetite5.setActionCommand("5");
		bgAppetite.add(rbAppetite5);
		rbAppetite5.setBackground(Color.WHITE);
		rbAppetite5.setText("25%");
		rbAppetite5.setBounds(509, 340, 91, 20);
		panel_1.add(rbAppetite5);

		rbAppetite1 = new JRadioButton();
		rbAppetite1.setActionCommand("1");
		bgAppetite.add(rbAppetite1);
		rbAppetite1.setBackground(Color.WHITE);
		rbAppetite1.setOpaque(true);
		rbAppetite1.setText("100 %");
		rbAppetite1.setBounds(102, 340, 96, 20);
		panel_1.add(rbAppetite1);

		final JLabel problemsAndApprochesLabel = new JLabel();
		problemsAndApprochesLabel.setText("Problems and Approches");
		problemsAndApprochesLabel.setBounds(339, 761, 138, 14);
		panel_1.add(problemsAndApprochesLabel);

		final JLabel skinIntegrityLabel = new JLabel();
		skinIntegrityLabel.setText("Skin integrity");
		skinIntegrityLabel.setBounds(10, 638, 74, 14);
		panel_1.add(skinIntegrityLabel);

		final JRadioButton rbNormal = new JRadioButton();
		rbNormal.setActionCommand("1");
		bgNormal.add(rbNormal);
		rbNormal.setBackground(Color.WHITE);
		rbNormal.setText("Normal");
		rbNormal.setBounds(204, 636, 65, 18);
		panel_1.add(rbNormal);

		final JRadioButton rbImpared = new JRadioButton();
		rbImpared.setActionCommand("0");
		bgNormal.add(rbImpared);
		rbImpared.setBackground(Color.WHITE);
		rbImpared.setText("Impared");
		rbImpared.setBounds(104, 636, 65, 18);
		panel_1.add(rbImpared);

		final JLabel adaptiveEquipmentLabel = new JLabel();
		adaptiveEquipmentLabel.setText("Adaptive equipment");
		adaptiveEquipmentLabel.setBounds(10, 722, 104, 14);
		panel_1.add(adaptiveEquipmentLabel);

		txtAdaptiveEquipment = new JTextField();
		txtAdaptiveEquipment.setBounds(136, 719, 281, 21);
		panel_1.add(txtAdaptiveEquipment);

		notesProblemApproches = new Notes();
		notesProblemApproches.setFormName("Dietary Resident Diagnosis Form");
		notesProblemApproches.setUserId(Global.currentLoggedInUserKey);

		txtProblemApproches = new JxNotes(isCategories);
		txtProblemApproches.setNotes(notesProblemApproches);
		txtProblemApproches.setBounds(10, 781, 751, 238);
		panel_1.add(txtProblemApproches);

		notesGoals = new Notes();
		notesGoals.setFormName("Dietary Resident Diagnosis Form");
		notesGoals.setUserId(Global.currentLoggedInUserKey);

		txtGoal = new JxNotes(isCategories);
		txtGoal.setBorder(new LineBorder(Color.black, 1, false));
		txtGoal.setBounds(123, 1040, 408, 35);
		txtGoal.setNotes(notesGoals);
		panel_1.add(txtGoal);

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
		cmbDieticianSign.addItem(user.getUserName());

	}

	public void doSave() {

		DietaryResidentDiagnosis refDietaryResidentDiagnosis = new DietaryResidentDiagnosis();
		refDietaryResidentDiagnosis.setResidentId(Global.currentResidenceKey);
		refDietaryResidentDiagnosis
				.setSerial(Global.currentDietaryResidentDiagnosisKey);
		refDietaryResidentDiagnosis.setAppetite(SwingUtils
				.getSelectedButton(bgAppetite));
		// refDietaryResidentDiagnosis.setAppetite5(rbAppetite5.getText());
		// refDietaryResidentDiagnosis.setAppetite4(rbAppetite4.getText());
		// refDietaryResidentDiagnosis.setAppetite3(rbAppetite3.getText());
		// refDietaryResidentDiagnosis.setAppetite2(rbAppetite2.getText());
		// refDietaryResidentDiagnosis.setApproaches7(txtApproaches7.getText());
		// refDietaryResidentDiagnosis.setApproaches6(txtApproaches6.getText());
		// refDietaryResidentDiagnosis.setApproaches5(txtApproaches5.getText());
		// refDietaryResidentDiagnosis.setApproaches4(txtApproaches4.getText());
		// refDietaryResidentDiagnosis.setApproaches3(txtApproaches3.getText());
		// refDietaryResidentDiagnosis.setApproaches2(txtApproaches2.getText());
		// refDietaryResidentDiagnosis.setApproaches1(txtApproaches1.getText());
		refDietaryResidentDiagnosis.setProblemApproches(txtProblemApproches
				.getNotes());
		// refDietaryResidentDiagnosis.setProblems7(txtProblems7.getText());
		// refDietaryResidentDiagnosis.setProblems6(txtProblems6.getText());
		// refDietaryResidentDiagnosis.setProblems5(txtProblems5.getText());
		// refDietaryResidentDiagnosis.setProblems4(txtProblems4.getText());
		// refDietaryResidentDiagnosis.setProblems3(txtProblems3.getText());
		// refDietaryResidentDiagnosis.setProblems2(txtProblems2.getText());
		// refDietaryResidentDiagnosis.setProblems1(txtProblems1.getText());
		refDietaryResidentDiagnosis.setDateField2(dcDateField2.getDate());
		refDietaryResidentDiagnosis.setDieticianSign((String) cmbDieticianSign
				.getSelectedItem());
		refDietaryResidentDiagnosis.setGoal(txtGoal.getNotes());
		refDietaryResidentDiagnosis.setFluidField(txtFluidField.getText());
		refDietaryResidentDiagnosis.setProtien(txtProtien.getText());
		refDietaryResidentDiagnosis.setEstRequirement(txtEstRequirement
				.getText());
		refDietaryResidentDiagnosis.setBee(txtBee.getText());
		refDietaryResidentDiagnosis.setEdemaField(txtEdemaField.getText());
		refDietaryResidentDiagnosis.setConstipation(txtConstipation.getText());
		refDietaryResidentDiagnosis.setOpenAreas(txtOpenAreas.getText());
		refDietaryResidentDiagnosis.setEstDbw(txtEstDbw.getText());
		refDietaryResidentDiagnosis.setUbw(txtUbw.getText());
		refDietaryResidentDiagnosis.setWeight(txtWeight.getText());
		refDietaryResidentDiagnosis.setHeight(txtHeight.getText());
		refDietaryResidentDiagnosis.setRroom(txtRroom.getText());
		refDietaryResidentDiagnosis.setDinningRoom(txtDinningRoom.getText());
		refDietaryResidentDiagnosis.setLoungRoom(txtLoungRoom.getText());

		// refDietaryResidentDiagnosis.setFoodAllergy(txtFoodAllergy.getText());
		refDietaryResidentDiagnosis.setFoodDislikes(txtFoodDislikes.getText());
		refDietaryResidentDiagnosis.setFoodLikes(txtFoodLikes.getText());
		refDietaryResidentDiagnosis.setFeeder(txtFeeder.getText());
		refDietaryResidentDiagnosis.setNeedsHelp(txtNeedsHelp.getText());
		refDietaryResidentDiagnosis
				.setResidentFeeds(txtResidentFeeds.getText());
		refDietaryResidentDiagnosis.setSwallowing(txtSwallowing.getText());
		refDietaryResidentDiagnosis.setChewingAbility(txtChewingAbility
				.getText());
		refDietaryResidentDiagnosis.setDentureOwn(txtDentureOwn.getText());
		refDietaryResidentDiagnosis.setDentureEd(txtDentureEd.getText());
		refDietaryResidentDiagnosis
				.setDentureBottom(txtDentureBottom.getText());
		refDietaryResidentDiagnosis.setDentureTop(txtDentureTop.getText());
		// refDietaryResidentDiagnosis.setFluid(txtFluid.getText());
		// refDietaryResidentDiagnosis.setmentalStatus(txtmentalStatus.getText());
		// refDietaryResidentDiagnosis.setPhysicalDis(txtPhysicalDis.getText());
		// refDietaryResidentDiagnosis.setCultural(txtCultural.getText());
		refDietaryResidentDiagnosis.setMedication(txtMedication.getText());
		refDietaryResidentDiagnosis.setDiagnosis(txtDiagnosis.getText());
		refDietaryResidentDiagnosis.setAge(txtAge.getText());
		refDietaryResidentDiagnosis.setRoomNo(txtRoomNo.getText());
		refDietaryResidentDiagnosis.setLabData(txtLabData.getText());
		if (!(txtmentalStatus.getText().equalsIgnoreCase(""))) {
			txtmentalStatus
					.setRichTextFieldData("Dietary Resident Diagnosis:MentalStatus");
			refDietaryResidentDiagnosis.setMentalStatus(txtmentalStatus
					.getField());
		}
		if (!(txtPhysicalDis.getText().equalsIgnoreCase(""))) {
			txtPhysicalDis
					.setRichTextFieldData("Dietary Resident Diagnosis:PhysicalDisability");
			refDietaryResidentDiagnosis.setPhysicalDis(txtPhysicalDis
					.getField());
		}
		if (!(txtCultural.getText().equalsIgnoreCase(""))) {
			txtCultural
					.setRichTextFieldData("Dietary Resident Diagnosis:Culture");
			refDietaryResidentDiagnosis.setCultural(txtCultural.getField());
		}
		if (!(txtDiet.getText().equalsIgnoreCase(""))) {
			txtDiet.setRichTextFieldData("Dietary Resident Diagnosis:Diet");
			refDietaryResidentDiagnosis.setDiet(txtDiet.getField());
		}
		if (!(txtFoodAllergy.getText().equalsIgnoreCase(""))) {
			txtFoodAllergy
					.setRichTextFieldData("Dietary Resident Diagnosis: FoodAllergies");
			refDietaryResidentDiagnosis.setFoodAllergy(txtFoodAllergy
					.getField());
		}
		// refDietaryResidentDiagnosis.setDiet(txtDiet.getText());
		refDietaryResidentDiagnosis.setResidentName(txtResidentName.getText());
		refDietaryResidentDiagnosis
				.setPhysicianName(txtPhysicianName.getText());
		refDietaryResidentDiagnosis.setDateField1(dcDateField1.getDate());
		refDietaryResidentDiagnosis.setNormal(SwingUtils
				.getSelectedButton(bgNormal));
		refDietaryResidentDiagnosis.setAdaptiveEquipment(txtAdaptiveEquipment
				.getText());

		try {
			Global.currentDietaryResidentDiagnosisKey = MedrexClientManager
					.getInstance().insertOrUpdateDietaryResidentDiagnosis(
							refDietaryResidentDiagnosis);
		} catch (Exception e) {
		}
	}

	public void updateData() {
		DietaryResidentDiagnosis refDietaryResidentDiagnosis = null;
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txtRoomNo.setText(rm.getRoom());
			txtAge.setText(Utils.getResidentAgeYear() + "");
			// + "."
			// + Utils.getResidentAgeMonth());

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
			if (doct.getDoctorType().toString().equals("PHYS")) {
				txtPhysicianName.setText(doct.getPhysicianName());
				break;
			}
		}

		if (Global.currentDietaryResidentDiagnosisKey != 0) {
			try {
				refDietaryResidentDiagnosis = MedrexClientManager.getInstance()
						.getDietaryResidentDiagnosis(
								Global.currentDietaryResidentDiagnosisKey);
			} catch (Exception e) {

			}
			txtDiet.setField(refDietaryResidentDiagnosis.getDiet());
			txtFoodAllergy.setField(refDietaryResidentDiagnosis
					.getFoodAllergy());
			txtmentalStatus.setField(refDietaryResidentDiagnosis
					.getMentalStatus());
			txtCultural.setField(refDietaryResidentDiagnosis.getCultural());
			txtPhysicalDis.setField(refDietaryResidentDiagnosis
					.getPhysicalDis());
			// rbAppetite1.setText(refDietaryResidentDiagnosis.getAppetite1());
			// rbAppetite5.setText(refDietaryResidentDiagnosis.getAppetite5());
			// rbAppetite4.setText(refDietaryResidentDiagnosis.getAppetite4());
			// rbAppetite3.setText(refDietaryResidentDiagnosis.getAppetite3());
			// rbAppetite2.setText(refDietaryResidentDiagnosis.getAppetite2());
			SwingUtils.setSelectedButton(bgAppetite,
					refDietaryResidentDiagnosis.getAppetite());
			// txtApproaches7
			// .setText(refDietaryResidentDiagnosis.getApproaches7());
			// txtApproaches6
			// .setText(refDietaryResidentDiagnosis.getApproaches6());
			// txtApproaches5
			// .setText(refDietaryResidentDiagnosis.getApproaches5());
			// txtApproaches4
			// .setText(refDietaryResidentDiagnosis.getApproaches4());
			// txtApproaches3
			// .setText(refDietaryResidentDiagnosis.getApproaches3());
			// txtApproaches2
			// .setText(refDietaryResidentDiagnosis.getApproaches2());
			// txtApproaches1
			// .setText(refDietaryResidentDiagnosis.getApproaches1());
			// txtProblems7.setText(refDietaryResidentDiagnosis.getProblems7());
			// txtProblems6.setText(refDietaryResidentDiagnosis.getProblems6());
			// txtProblems5.setText(refDietaryResidentDiagnosis.getProblems5());
			// txtProblems4.setText(refDietaryResidentDiagnosis.getProblems4());
			// txtProblems3.setText(refDietaryResidentDiagnosis.getProblems3());
			// txtProblems2.setText(refDietaryResidentDiagnosis.getProblems2());
			// txtProblems1.setText(refDietaryResidentDiagnosis.getProblems1());
			dcDateField2.setDate(refDietaryResidentDiagnosis.getDateField2());
			cmbDieticianSign.setSelectedItem(refDietaryResidentDiagnosis
					.getDieticianSign());
			txtGoal.setNotes(refDietaryResidentDiagnosis.getGoal());
			txtFluidField.setText(refDietaryResidentDiagnosis.getFluidField());
			txtProtien.setText(refDietaryResidentDiagnosis.getProtien());
			txtEstRequirement.setText(refDietaryResidentDiagnosis
					.getEstRequirement());
			txtBee.setText(refDietaryResidentDiagnosis.getBee());
			txtEdemaField.setText(refDietaryResidentDiagnosis.getEdemaField());
			txtConstipation.setText(refDietaryResidentDiagnosis
					.getConstipation());
			txtOpenAreas.setText(refDietaryResidentDiagnosis.getOpenAreas());
			txtEstDbw.setText(refDietaryResidentDiagnosis.getEstDbw());
			txtUbw.setText(refDietaryResidentDiagnosis.getUbw());
			txtWeight.setText(refDietaryResidentDiagnosis.getWeight());
			txtHeight.setText(refDietaryResidentDiagnosis.getHeight());
			txtRroom.setText(refDietaryResidentDiagnosis.getRroom());
			txtDinningRoom
					.setText(refDietaryResidentDiagnosis.getDinningRoom());
			txtLoungRoom.setText(refDietaryResidentDiagnosis.getLoungRoom());
			// txtFoodAllergy
			// .setText(refDietaryResidentDiagnosis.getFoodAllergy());
			txtFoodDislikes.setText(refDietaryResidentDiagnosis
					.getFoodDislikes());
			txtFoodLikes.setText(refDietaryResidentDiagnosis.getFoodLikes());
			txtFeeder.setText(refDietaryResidentDiagnosis.getFeeder());
			txtNeedsHelp.setText(refDietaryResidentDiagnosis.getNeedsHelp());
			txtResidentFeeds.setText(refDietaryResidentDiagnosis
					.getResidentFeeds());
			txtSwallowing.setText(refDietaryResidentDiagnosis.getSwallowing());
			txtChewingAbility.setText(refDietaryResidentDiagnosis
					.getChewingAbility());
			txtDentureOwn.setText(refDietaryResidentDiagnosis.getDentureOwn());
			txtDentureEd.setText(refDietaryResidentDiagnosis.getDentureEd());
			txtDentureBottom.setText(refDietaryResidentDiagnosis
					.getDentureBottom());
			txtDentureTop.setText(refDietaryResidentDiagnosis.getDentureTop());
			// txtFluid.setText(refDietaryResidentDiagnosis.getFluid());
			// txtmentalStatus.setText(refDietaryResidentDiagnosis
			// .getmentalStatus());
			// txtPhysicalDis
			// .setText(refDietaryResidentDiagnosis.getPhysicalDis());
			// txtCultural.setText(refDietaryResidentDiagnosis.getCultural());
			txtMedication.setText(refDietaryResidentDiagnosis.getMedication());
			txtDiagnosis.setText(refDietaryResidentDiagnosis.getDiagnosis());
			// txtAge.setText(refDietaryResidentDiagnosis.getAge());
			txtRoomNo.setText(refDietaryResidentDiagnosis.getRoomNo());
			txtLabData.setText(refDietaryResidentDiagnosis.getLabData());
			// txtDiet.setText(refDietaryResidentDiagnosis.getDiet());
			txtResidentName.setText(refDietaryResidentDiagnosis
					.getResidentName());
			// txtPhysicianName.setText(refDietaryResidentDiagnosis
			// .getPhysicianName());
			dcDateField1.setDate(refDietaryResidentDiagnosis.getDateField1());
			txtProblemApproches.setNotes(refDietaryResidentDiagnosis
					.getProblemApproches());
			SwingUtils.setSelectedButton(bgNormal, refDietaryResidentDiagnosis
					.getNormal());
			txtAdaptiveEquipment.setText(refDietaryResidentDiagnosis
					.getAdaptiveEquipment());

			try {
				TempRoomHistory list = MedrexClientManager.getInstance()
						.getLastRoomHistory(Global.currentResidenceKey);
				if (list.getRoom() != null) {
					txtRoomNo.setText(list.getRoom());
				}
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (MedrexException e) {
				e.printStackTrace();
			}

		}
	}

}
