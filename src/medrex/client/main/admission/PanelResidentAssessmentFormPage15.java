package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage15;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.toedter.calendar.JDateChooser;

public class PanelResidentAssessmentFormPage15 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6546456544371489741L;
	private JDateChooser dtIdentifiedDate;
	private JTextField dtWeek4Date10;
	private JTextField dtWeek4Date9;
	private JTextField dtWeek4Date8;
	private JTextField dtWeek4Date7;
	private JTextField dtWeek4Date6;
	private JTextField dtWeek4Date5;
	private JTextField dtWeek4Date4;
	private JTextField dtWeek4Date3;
	private JTextField dtWeek4Date2;
	private JTextField dtWeek4Date1;
	private JTextField dtWeek3Date10;
	private JTextField dtWeek3Date9;
	private JTextField dtWeek3Date8;
	private JTextField dtWeek3Date7;
	private JTextField dtWeek3Date6;
	private JTextField dtWeek3Date5;
	private JTextField dtWeek3Date4;
	private JTextField dtWeek3Date3;
	private JTextField dtWeek3Date2;
	private JTextField dtWeek3Date1;
	private JTextField dtWeek2Date10;
	private JTextField dtWeek2Date9;
	private JTextField dtWeek2Date8;
	private JTextField dtWeek2Date7;
	private JTextField dtWeek2Date6;
	private JTextField dtWeek2Date5;
	private JTextField dtWeek2Date4;
	private JTextField dtWeek2Date3;
	private JTextField dtWeek2Date2;
	private JTextField dtWeek2Date1;
	private JTextField dtWeek1Date10;
	private JTextField dtWeek1Date9;
	private JTextField dtWeek1Date8;
	private JTextField dtWeek1Date7;
	private JTextField dtWeek1Date6;
	private JTextField dtWeek1Date5;
	private JTextField dtWeek1Date4;
	private JTextField dtWeek1Date3;
	private JTextField dtWeek1Date2;
	private JTextField dtWeek1Date1;
	private JTextField txtIdcpTeamSignature10;
	private JTextField txtIdcpTeamSignature9;
	private JTextField txtIdcpTeamSignature8;
	private JTextField txtIdcpTeamSignature7;
	private JTextField txtIdcpTeamSignature6;
	private JTextField txtIdcpTeamSignature5;
	private JTextField txtIdcpTeamSignature4;
	private JTextField txtIdcpTeamSignature3;
	private JTextField txtIdcpTeamSignature2;
	private JTextField txtIdcpTeamSignature1;
	private JTextField txtSkinTear;
	private JTextField txtSx;
	private JTextField txtVenous;
	private JTextField txtPressure;
	private JTextField txtFacilityAcquired;
	private JTextField txtHospitalAcquired;
	private JTextField txtLocationOfTheWound;
	private JTextField txtFloor;
	private JTextField txtRoom;
	private JTextField txtResidentName;

	public PanelResidentAssessmentFormPage15() {
		super();
		setLayout(null);
		setPreferredSize(new Dimension(900, 550));
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 900, 550);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(new FlowLayout());
		panel_1.setBounds(0, 0, 900, 32);
		panel.add(panel_1);

		final JLabel plazaHealthcareAndLabel = new JLabel();
		plazaHealthcareAndLabel.setBackground(Color.WHITE);
		plazaHealthcareAndLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		plazaHealthcareAndLabel
				.setText("Plaza Healthcare and Rehabilitation Center");
		panel_1.add(plazaHealthcareAndLabel);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 31, 900, 32);
		panel.add(panel_2);

		final JLabel idcpWoundFlowLabel = new JLabel();
		idcpWoundFlowLabel.setBackground(Color.WHITE);
		idcpWoundFlowLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		idcpWoundFlowLabel.setText("IDCP WOUND EVALUATION");
		panel_2.add(idcpWoundFlowLabel);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 62, 900, 32);
		panel.add(panel_3);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setBackground(Color.WHITE);
		residentNameLabel.setBounds(45, 8, 120, 16);
		residentNameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		residentNameLabel.setText("RESIDENT NAME");
		panel_3.add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(171, 7, 217, 20);
		panel_3.add(txtResidentName);

		final JLabel roomLabel = new JLabel();
		roomLabel.setBackground(Color.WHITE);
		roomLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		roomLabel.setText("ROOM#");
		roomLabel.setBounds(409, 8, 55, 16);
		panel_3.add(roomLabel);

		txtRoom = new JTextField();
		txtRoom.setBounds(470, 7, 99, 20);
		panel_3.add(txtRoom);

		final JLabel floorLabel = new JLabel();
		floorLabel.setBackground(Color.WHITE);
		floorLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		floorLabel.setText("FLOOR");
		floorLabel.setBounds(660, 8, 54, 16);
		panel_3.add(floorLabel);

		txtFloor = new JTextField();
		txtFloor.setBounds(720, 7, 150, 20);
		panel_3.add(txtFloor);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 93, 900, 32);
		panel.add(panel_4);

		final JLabel locationOfTheLabel = new JLabel();
		locationOfTheLabel.setBackground(Color.WHITE);
		locationOfTheLabel.setBounds(45, 8, 193, 16);
		locationOfTheLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		locationOfTheLabel.setText("LOCATION OF THE WOUND");
		panel_4.add(locationOfTheLabel);

		txtLocationOfTheWound = new JTextField();
		txtLocationOfTheWound.setBounds(244, 7, 229, 20);
		panel_4.add(txtLocationOfTheWound);

		final JLabel dateIdentifiedLabel = new JLabel();
		dateIdentifiedLabel.setBackground(Color.WHITE);
		dateIdentifiedLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		dateIdentifiedLabel.setText("DATE IDENTIFIED");
		dateIdentifiedLabel.setBounds(507, 8, 129, 16);
		panel_4.add(dateIdentifiedLabel);

		dtIdentifiedDate = new JDateChooser();
		dtIdentifiedDate.setDateFormatString("MM/dd/yyyy");
		dtIdentifiedDate.setBounds(658, 6, 129, 20);
		panel_4.add(dtIdentifiedDate);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 124, 900, 32);
		panel.add(panel_5);

		final JLabel hospitalAcquiredLabel = new JLabel();
		hospitalAcquiredLabel.setBackground(Color.WHITE);
		hospitalAcquiredLabel.setBounds(45, 8, 155, 16);
		hospitalAcquiredLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		hospitalAcquiredLabel.setText("HOSPITAL ACQUIRED");
		panel_5.add(hospitalAcquiredLabel);

		txtHospitalAcquired = new JTextField();
		txtHospitalAcquired.setBounds(206, 7, 184, 20);
		panel_5.add(txtHospitalAcquired);

		final JLabel facilityAcquiredLabel = new JLabel();
		facilityAcquiredLabel.setBackground(Color.WHITE);
		facilityAcquiredLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		facilityAcquiredLabel.setText("FACILITY ACQUIRED");
		facilityAcquiredLabel.setBounds(409, 8, 155, 16);
		panel_5.add(facilityAcquiredLabel);

		txtFacilityAcquired = new JTextField();
		txtFacilityAcquired.setBounds(570, 7, 226, 20);
		panel_5.add(txtFacilityAcquired);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 155, 900, 32);
		panel.add(panel_6);

		final JLabel typeOfWoundLabel = new JLabel();
		typeOfWoundLabel.setBackground(Color.WHITE);
		typeOfWoundLabel.setBounds(45, 8, 124, 16);
		typeOfWoundLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		typeOfWoundLabel.setText("TYPE OF WOUND:");
		panel_6.add(typeOfWoundLabel);

		final JLabel pressureLabel = new JLabel();
		pressureLabel.setBackground(Color.WHITE);
		pressureLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		pressureLabel.setText("PRESSURE");
		pressureLabel.setBounds(175, 8, 75, 16);
		panel_6.add(pressureLabel);

		txtPressure = new JTextField();
		txtPressure.setBounds(256, 7, 91, 20);
		panel_6.add(txtPressure);

		final JLabel venousLabel = new JLabel();
		venousLabel.setBackground(Color.WHITE);
		venousLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		venousLabel.setText("VENOUS");
		venousLabel.setBounds(375, 8, 60, 16);
		panel_6.add(venousLabel);

		txtVenous = new JTextField();
		txtVenous.setBounds(445, 7, 77, 20);
		panel_6.add(txtVenous);

		final JLabel sxLabel = new JLabel();
		sxLabel.setBackground(Color.WHITE);
		sxLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		sxLabel.setText("SX");
		sxLabel.setBounds(535, 8, 19, 16);
		panel_6.add(sxLabel);

		txtSx = new JTextField();
		txtSx.setBounds(560, 7, 77, 20);
		panel_6.add(txtSx);

		final JLabel skinTearLabel = new JLabel();
		skinTearLabel.setBackground(Color.WHITE);
		skinTearLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		skinTearLabel.setText("SKIN TEAR");
		skinTearLabel.setBounds(648, 8, 79, 16);
		panel_6.add(skinTearLabel);

		txtSkinTear = new JTextField();
		txtSkinTear.setBounds(733, 7, 62, 20);
		panel_6.add(txtSkinTear);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(0, 190, 900, 352);
		panel.add(panel_9);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 0, 360, 342);
		panel_9.add(panel_7);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBounds(0, 0, 360, 32);
		panel_7.add(panel_8);

		final JLabel idcpTeamSignaturesLabel = new JLabel();
		idcpTeamSignaturesLabel.setBackground(Color.WHITE);
		idcpTeamSignaturesLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		idcpTeamSignaturesLabel.setText("IDCP TEAM SIGNATURES:");
		panel_8.add(idcpTeamSignaturesLabel);

		final JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_12.setLayout(null);
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setBounds(0, 31, 360, 32);
		panel_7.add(panel_12);

		txtIdcpTeamSignature1 = new JTextField();
		txtIdcpTeamSignature1.setBounds(1, 1, 358, 30);
		panel_12.add(txtIdcpTeamSignature1);

		final JPanel panel_12_1 = new JPanel();
		panel_12_1.setLayout(null);
		panel_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1.setBounds(0, 62, 360, 32);
		panel_7.add(panel_12_1);

		txtIdcpTeamSignature2 = new JTextField();
		txtIdcpTeamSignature2.setBounds(1, 1, 358, 30);
		panel_12_1.add(txtIdcpTeamSignature2);

		final JPanel panel_12_2 = new JPanel();
		panel_12_2.setLayout(null);
		panel_12_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_2.setBounds(0, 93, 360, 32);
		panel_7.add(panel_12_2);

		txtIdcpTeamSignature3 = new JTextField();
		txtIdcpTeamSignature3.setBounds(1, 1, 358, 30);
		panel_12_2.add(txtIdcpTeamSignature3);

		final JPanel panel_12_3 = new JPanel();
		panel_12_3.setLayout(null);
		panel_12_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_3.setBounds(0, 124, 360, 32);
		panel_7.add(panel_12_3);

		txtIdcpTeamSignature4 = new JTextField();
		txtIdcpTeamSignature4.setBounds(1, 1, 358, 30);
		panel_12_3.add(txtIdcpTeamSignature4);

		final JPanel panel_12_4 = new JPanel();
		panel_12_4.setLayout(null);
		panel_12_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_4.setBounds(0, 155, 360, 32);
		panel_7.add(panel_12_4);

		txtIdcpTeamSignature5 = new JTextField();
		txtIdcpTeamSignature5.setBounds(1, 1, 358, 30);
		panel_12_4.add(txtIdcpTeamSignature5);

		final JPanel panel_12_5 = new JPanel();
		panel_12_5.setLayout(null);
		panel_12_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_5.setBounds(0, 186, 360, 32);
		panel_7.add(panel_12_5);

		txtIdcpTeamSignature6 = new JTextField();
		txtIdcpTeamSignature6.setBounds(1, 1, 358, 30);
		panel_12_5.add(txtIdcpTeamSignature6);

		final JPanel panel_12_5_1 = new JPanel();
		panel_12_5_1.setLayout(null);
		panel_12_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_5_1.setBounds(0, 217, 360, 32);
		panel_7.add(panel_12_5_1);

		txtIdcpTeamSignature7 = new JTextField();
		txtIdcpTeamSignature7.setBounds(1, 1, 358, 30);
		panel_12_5_1.add(txtIdcpTeamSignature7);

		final JPanel panel_12_5_2 = new JPanel();
		panel_12_5_2.setLayout(null);
		panel_12_5_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_5_2.setBounds(0, 248, 360, 32);
		panel_7.add(panel_12_5_2);

		txtIdcpTeamSignature8 = new JTextField();
		txtIdcpTeamSignature8.setBounds(1, 1, 358, 30);
		panel_12_5_2.add(txtIdcpTeamSignature8);

		final JPanel panel_12_5_2_1 = new JPanel();
		panel_12_5_2_1.setLayout(null);
		panel_12_5_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_5_2_1.setBounds(0, 279, 360, 32);
		panel_7.add(panel_12_5_2_1);

		txtIdcpTeamSignature9 = new JTextField();
		txtIdcpTeamSignature9.setBounds(1, 1, 358, 30);
		panel_12_5_2_1.add(txtIdcpTeamSignature9);

		final JPanel panel_12_5_2_1_1 = new JPanel();
		panel_12_5_2_1_1.setLayout(null);
		panel_12_5_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_5_2_1_1.setBounds(0, 310, 360, 32);
		panel_7.add(panel_12_5_2_1_1);

		txtIdcpTeamSignature10 = new JTextField();
		txtIdcpTeamSignature10.setBounds(1, 1, 358, 30);
		panel_12_5_2_1_1.add(txtIdcpTeamSignature10);

		final JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBounds(359, 0, 135, 342);
		panel_9.add(panel_10);

		final JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setBounds(0, 0, 135, 32);
		panel_10.add(panel_11);

		final JLabel weekIDateLabel = new JLabel();
		weekIDateLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		weekIDateLabel.setText("Week 1 Date:");
		panel_11.add(weekIDateLabel);

		final JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setBounds(0, 31, 135, 32);
		panel_10.add(panel_13);

		dtWeek1Date1 = new JTextField();
		dtWeek1Date1.setBounds(1, 1, 133, 30);
		panel_13.add(dtWeek1Date1);

		final JPanel panel_13_1 = new JPanel();
		panel_13_1.setLayout(null);
		panel_13_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_1.setBounds(0, 62, 135, 32);
		panel_10.add(panel_13_1);

		dtWeek1Date2 = new JTextField();
		dtWeek1Date2.setBounds(1, 1, 133, 30);
		panel_13_1.add(dtWeek1Date2);

		final JPanel panel_13_2 = new JPanel();
		panel_13_2.setLayout(null);
		panel_13_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_2.setBounds(0, 93, 135, 32);
		panel_10.add(panel_13_2);

		dtWeek1Date3 = new JTextField();
		dtWeek1Date3.setBounds(1, 1, 133, 30);
		panel_13_2.add(dtWeek1Date3);

		final JPanel panel_13_3 = new JPanel();
		panel_13_3.setLayout(null);
		panel_13_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3.setBounds(0, 124, 135, 32);
		panel_10.add(panel_13_3);

		dtWeek1Date4 = new JTextField();
		dtWeek1Date4.setBounds(1, 1, 133, 30);
		panel_13_3.add(dtWeek1Date4);

		final JPanel panel_13_3_1 = new JPanel();
		panel_13_3_1.setLayout(null);
		panel_13_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_1.setBounds(0, 155, 135, 32);
		panel_10.add(panel_13_3_1);

		dtWeek1Date5 = new JTextField();
		dtWeek1Date5.setBounds(1, 1, 133, 30);
		panel_13_3_1.add(dtWeek1Date5);

		final JPanel panel_13_3_2 = new JPanel();
		panel_13_3_2.setLayout(null);
		panel_13_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_2.setBounds(0, 186, 135, 32);
		panel_10.add(panel_13_3_2);

		dtWeek1Date6 = new JTextField();
		dtWeek1Date6.setBounds(1, 1, 133, 30);
		panel_13_3_2.add(dtWeek1Date6);

		final JPanel panel_13_3_3 = new JPanel();
		panel_13_3_3.setLayout(null);
		panel_13_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_3.setBounds(0, 217, 135, 32);
		panel_10.add(panel_13_3_3);

		dtWeek1Date7 = new JTextField();
		dtWeek1Date7.setBounds(1, 1, 133, 30);
		panel_13_3_3.add(dtWeek1Date7);

		final JPanel panel_13_3_4 = new JPanel();
		panel_13_3_4.setLayout(null);
		panel_13_3_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4.setBounds(0, 248, 135, 32);
		panel_10.add(panel_13_3_4);

		dtWeek1Date8 = new JTextField();
		dtWeek1Date8.setBounds(1, 1, 133, 30);
		panel_13_3_4.add(dtWeek1Date8);

		final JPanel panel_13_3_4_1 = new JPanel();
		panel_13_3_4_1.setLayout(null);
		panel_13_3_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_1.setBounds(0, 279, 135, 32);
		panel_10.add(panel_13_3_4_1);

		dtWeek1Date9 = new JTextField();
		dtWeek1Date9.setBounds(1, 1, 133, 30);
		panel_13_3_4_1.add(dtWeek1Date9);

		final JPanel panel_13_3_4_2 = new JPanel();
		panel_13_3_4_2.setLayout(null);
		panel_13_3_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_2.setBounds(0, 310, 135, 32);
		panel_10.add(panel_13_3_4_2);

		dtWeek1Date10 = new JTextField();
		dtWeek1Date10.setBounds(1, 1, 133, 30);
		panel_13_3_4_2.add(dtWeek1Date10);

		final JPanel panel_10_1 = new JPanel();
		panel_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_1.setLayout(null);
		panel_10_1.setBounds(493, 0, 135, 342);
		panel_9.add(panel_10_1);

		final JPanel panel_11_1 = new JPanel();
		panel_11_1.setBackground(Color.WHITE);
		panel_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_1.setBounds(0, 0, 135, 32);
		panel_10_1.add(panel_11_1);

		final JLabel weekIDateLabel_1 = new JLabel();
		weekIDateLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		weekIDateLabel_1.setText("Week 2 Date:");
		panel_11_1.add(weekIDateLabel_1);

		final JPanel panel_13_4 = new JPanel();
		panel_13_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_4.setLayout(null);
		panel_13_4.setBounds(0, 31, 135, 32);
		panel_10_1.add(panel_13_4);

		dtWeek2Date1 = new JTextField();
		dtWeek2Date1.setBounds(1, 1, 133, 30);
		panel_13_4.add(dtWeek2Date1);

		final JPanel panel_13_1_1 = new JPanel();
		panel_13_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_1_1.setLayout(null);
		panel_13_1_1.setBounds(0, 62, 135, 32);
		panel_10_1.add(panel_13_1_1);

		dtWeek2Date2 = new JTextField();
		dtWeek2Date2.setBounds(1, 1, 133, 30);
		panel_13_1_1.add(dtWeek2Date2);

		final JPanel panel_13_2_1 = new JPanel();
		panel_13_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_2_1.setLayout(null);
		panel_13_2_1.setBounds(0, 93, 135, 32);
		panel_10_1.add(panel_13_2_1);

		dtWeek2Date3 = new JTextField();
		dtWeek2Date3.setBounds(1, 1, 133, 30);
		panel_13_2_1.add(dtWeek2Date3);

		final JPanel panel_13_3_5 = new JPanel();
		panel_13_3_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_5.setLayout(null);
		panel_13_3_5.setBounds(0, 124, 135, 32);
		panel_10_1.add(panel_13_3_5);

		dtWeek2Date4 = new JTextField();
		dtWeek2Date4.setBounds(1, 1, 133, 30);
		panel_13_3_5.add(dtWeek2Date4);

		final JPanel panel_13_3_1_1 = new JPanel();
		panel_13_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_1_1.setLayout(null);
		panel_13_3_1_1.setBounds(0, 155, 135, 32);
		panel_10_1.add(panel_13_3_1_1);

		dtWeek2Date5 = new JTextField();
		dtWeek2Date5.setBounds(1, 1, 133, 30);
		panel_13_3_1_1.add(dtWeek2Date5);

		final JPanel panel_13_3_2_1 = new JPanel();
		panel_13_3_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_2_1.setLayout(null);
		panel_13_3_2_1.setBounds(0, 186, 135, 32);
		panel_10_1.add(panel_13_3_2_1);

		dtWeek2Date6 = new JTextField();
		dtWeek2Date6.setBounds(1, 1, 133, 30);
		panel_13_3_2_1.add(dtWeek2Date6);

		final JPanel panel_13_3_3_1 = new JPanel();
		panel_13_3_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_3_1.setLayout(null);
		panel_13_3_3_1.setBounds(0, 217, 135, 32);
		panel_10_1.add(panel_13_3_3_1);

		dtWeek2Date7 = new JTextField();
		dtWeek2Date7.setBounds(1, 1, 133, 30);
		panel_13_3_3_1.add(dtWeek2Date7);

		final JPanel panel_13_3_4_3 = new JPanel();
		panel_13_3_4_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_3.setLayout(null);
		panel_13_3_4_3.setBounds(0, 248, 135, 32);
		panel_10_1.add(panel_13_3_4_3);

		dtWeek2Date8 = new JTextField();
		dtWeek2Date8.setBounds(1, 1, 133, 30);
		panel_13_3_4_3.add(dtWeek2Date8);

		final JPanel panel_13_3_4_1_1 = new JPanel();
		panel_13_3_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_1_1.setLayout(null);
		panel_13_3_4_1_1.setBounds(0, 279, 135, 32);
		panel_10_1.add(panel_13_3_4_1_1);

		dtWeek2Date9 = new JTextField();
		dtWeek2Date9.setBounds(1, 1, 133, 30);
		panel_13_3_4_1_1.add(dtWeek2Date9);

		final JPanel panel_13_3_4_2_1 = new JPanel();
		panel_13_3_4_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_2_1.setLayout(null);
		panel_13_3_4_2_1.setBounds(0, 310, 135, 32);
		panel_10_1.add(panel_13_3_4_2_1);

		dtWeek2Date10 = new JTextField();
		dtWeek2Date10.setBounds(1, 1, 133, 30);
		panel_13_3_4_2_1.add(dtWeek2Date10);

		final JPanel panel_10_2 = new JPanel();
		panel_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2.setLayout(null);
		panel_10_2.setBounds(627, 0, 135, 342);
		panel_9.add(panel_10_2);

		final JPanel panel_11_2 = new JPanel();
		panel_11_2.setBackground(Color.WHITE);
		panel_11_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_2.setBounds(0, 0, 135, 32);
		panel_10_2.add(panel_11_2);

		final JLabel weekIDateLabel_2 = new JLabel();
		weekIDateLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		weekIDateLabel_2.setText("Week 3 Date:");
		panel_11_2.add(weekIDateLabel_2);

		final JPanel panel_13_5 = new JPanel();
		panel_13_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_5.setLayout(null);
		panel_13_5.setBounds(0, 31, 135, 32);
		panel_10_2.add(panel_13_5);

		dtWeek3Date1 = new JTextField();
		dtWeek3Date1.setBounds(1, 1, 133, 30);
		panel_13_5.add(dtWeek3Date1);

		final JPanel panel_13_1_2 = new JPanel();
		panel_13_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_1_2.setLayout(null);
		panel_13_1_2.setBounds(0, 62, 135, 32);
		panel_10_2.add(panel_13_1_2);

		dtWeek3Date2 = new JTextField();
		dtWeek3Date2.setBounds(1, 1, 133, 30);
		panel_13_1_2.add(dtWeek3Date2);

		final JPanel panel_13_2_2 = new JPanel();
		panel_13_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_2_2.setLayout(null);
		panel_13_2_2.setBounds(0, 93, 135, 32);
		panel_10_2.add(panel_13_2_2);

		dtWeek3Date3 = new JTextField();
		dtWeek3Date3.setBounds(1, 1, 133, 30);
		panel_13_2_2.add(dtWeek3Date3);

		final JPanel panel_13_3_6 = new JPanel();
		panel_13_3_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_6.setLayout(null);
		panel_13_3_6.setBounds(0, 124, 135, 32);
		panel_10_2.add(panel_13_3_6);

		dtWeek3Date4 = new JTextField();
		dtWeek3Date4.setBounds(1, 1, 133, 30);
		panel_13_3_6.add(dtWeek3Date4);

		final JPanel panel_13_3_1_2 = new JPanel();
		panel_13_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_1_2.setLayout(null);
		panel_13_3_1_2.setBounds(0, 155, 135, 32);
		panel_10_2.add(panel_13_3_1_2);

		dtWeek3Date5 = new JTextField();
		dtWeek3Date5.setBounds(1, 1, 133, 30);
		panel_13_3_1_2.add(dtWeek3Date5);

		final JPanel panel_13_3_2_2 = new JPanel();
		panel_13_3_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_2_2.setLayout(null);
		panel_13_3_2_2.setBounds(0, 186, 135, 32);
		panel_10_2.add(panel_13_3_2_2);

		dtWeek3Date6 = new JTextField();
		dtWeek3Date6.setBounds(1, 1, 133, 30);
		panel_13_3_2_2.add(dtWeek3Date6);

		final JPanel panel_13_3_3_2 = new JPanel();
		panel_13_3_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_3_2.setLayout(null);
		panel_13_3_3_2.setBounds(0, 217, 135, 32);
		panel_10_2.add(panel_13_3_3_2);

		dtWeek3Date7 = new JTextField();
		dtWeek3Date7.setBounds(1, 1, 133, 30);
		panel_13_3_3_2.add(dtWeek3Date7);

		final JPanel panel_13_3_4_4 = new JPanel();
		panel_13_3_4_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_4.setLayout(null);
		panel_13_3_4_4.setBounds(0, 248, 135, 32);
		panel_10_2.add(panel_13_3_4_4);

		dtWeek3Date8 = new JTextField();
		dtWeek3Date8.setBounds(1, 1, 133, 30);
		panel_13_3_4_4.add(dtWeek3Date8);

		final JPanel panel_13_3_4_1_2 = new JPanel();
		panel_13_3_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_1_2.setLayout(null);
		panel_13_3_4_1_2.setBounds(0, 279, 135, 32);
		panel_10_2.add(panel_13_3_4_1_2);

		dtWeek3Date9 = new JTextField();
		dtWeek3Date9.setBounds(1, 1, 133, 30);
		panel_13_3_4_1_2.add(dtWeek3Date9);

		final JPanel panel_13_3_4_2_2 = new JPanel();
		panel_13_3_4_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_2_2.setLayout(null);
		panel_13_3_4_2_2.setBounds(0, 310, 135, 32);
		panel_10_2.add(panel_13_3_4_2_2);

		dtWeek3Date10 = new JTextField();
		dtWeek3Date10.setBounds(1, 1, 133, 30);
		panel_13_3_4_2_2.add(dtWeek3Date10);

		final JPanel panel_10_3 = new JPanel();
		panel_10_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3.setLayout(null);
		panel_10_3.setBounds(761, 0, 135, 342);
		panel_9.add(panel_10_3);

		final JPanel panel_11_3 = new JPanel();
		panel_11_3.setBackground(Color.WHITE);
		panel_11_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_3.setBounds(0, 0, 135, 32);
		panel_10_3.add(panel_11_3);

		final JLabel weekIDateLabel_3 = new JLabel();
		weekIDateLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		weekIDateLabel_3.setText("Week 4 Date:");
		panel_11_3.add(weekIDateLabel_3);

		final JPanel panel_13_6 = new JPanel();
		panel_13_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_6.setLayout(null);
		panel_13_6.setBounds(0, 31, 135, 32);
		panel_10_3.add(panel_13_6);

		dtWeek4Date1 = new JTextField();
		dtWeek4Date1.setBounds(1, 1, 133, 30);
		panel_13_6.add(dtWeek4Date1);

		final JPanel panel_13_1_3 = new JPanel();
		panel_13_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_1_3.setLayout(null);
		panel_13_1_3.setBounds(0, 62, 135, 32);
		panel_10_3.add(panel_13_1_3);

		dtWeek4Date2 = new JTextField();
		dtWeek4Date2.setBounds(1, 1, 133, 30);
		panel_13_1_3.add(dtWeek4Date2);

		final JPanel panel_13_2_3 = new JPanel();
		panel_13_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_2_3.setLayout(null);
		panel_13_2_3.setBounds(0, 93, 135, 32);
		panel_10_3.add(panel_13_2_3);

		dtWeek4Date3 = new JTextField();
		dtWeek4Date3.setBounds(1, 1, 133, 30);
		panel_13_2_3.add(dtWeek4Date3);

		final JPanel panel_13_3_7 = new JPanel();
		panel_13_3_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_7.setLayout(null);
		panel_13_3_7.setBounds(0, 124, 135, 32);
		panel_10_3.add(panel_13_3_7);

		dtWeek4Date4 = new JTextField();
		dtWeek4Date4.setBounds(1, 1, 133, 30);
		panel_13_3_7.add(dtWeek4Date4);

		final JPanel panel_13_3_1_3 = new JPanel();
		panel_13_3_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_1_3.setLayout(null);
		panel_13_3_1_3.setBounds(0, 155, 135, 32);
		panel_10_3.add(panel_13_3_1_3);

		dtWeek4Date5 = new JTextField();
		dtWeek4Date5.setBounds(1, 1, 133, 30);
		panel_13_3_1_3.add(dtWeek4Date5);

		final JPanel panel_13_3_2_3 = new JPanel();
		panel_13_3_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_2_3.setLayout(null);
		panel_13_3_2_3.setBounds(0, 186, 135, 32);
		panel_10_3.add(panel_13_3_2_3);

		dtWeek4Date6 = new JTextField();
		dtWeek4Date6.setBounds(1, 1, 133, 30);
		panel_13_3_2_3.add(dtWeek4Date6);

		final JPanel panel_13_3_3_3 = new JPanel();
		panel_13_3_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_3_3.setLayout(null);
		panel_13_3_3_3.setBounds(0, 217, 135, 32);
		panel_10_3.add(panel_13_3_3_3);

		dtWeek4Date7 = new JTextField();
		dtWeek4Date7.setBounds(1, 1, 133, 30);
		panel_13_3_3_3.add(dtWeek4Date7);

		final JPanel panel_13_3_4_5 = new JPanel();
		panel_13_3_4_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_5.setLayout(null);
		panel_13_3_4_5.setBounds(0, 248, 135, 32);
		panel_10_3.add(panel_13_3_4_5);

		dtWeek4Date8 = new JTextField();
		dtWeek4Date8.setBounds(1, 1, 133, 30);
		panel_13_3_4_5.add(dtWeek4Date8);

		final JPanel panel_13_3_4_1_3 = new JPanel();
		panel_13_3_4_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_1_3.setLayout(null);
		panel_13_3_4_1_3.setBounds(0, 279, 135, 32);
		panel_10_3.add(panel_13_3_4_1_3);

		dtWeek4Date9 = new JTextField();
		dtWeek4Date9.setBounds(1, 1, 133, 30);
		panel_13_3_4_1_3.add(dtWeek4Date9);

		final JPanel panel_13_3_4_2_3 = new JPanel();
		panel_13_3_4_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_3_4_2_3.setLayout(null);
		panel_13_3_4_2_3.setBounds(0, 310, 135, 32);
		panel_10_3.add(panel_13_3_4_2_3);

		dtWeek4Date10 = new JTextField();
		dtWeek4Date10.setBounds(1, 1, 133, 30);
		panel_13_3_4_2_3.add(dtWeek4Date10);

		doUpdate();

	}

	public void doLoad() {

	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txtRoom.setText(rm.getRoom());
			// txtFloor.setText(rm.getFloorType());
		} catch (Exception e) {
		}

		if (Global.currentDietaryCommunicationFormKey != 0) {
			ResidentAssessmentFormPage15 rafp15 = null;
			try {
				rafp15 = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage15(
								Global.currentDietaryCommunicationFormKey);
			} catch (Exception e) {

			}
			Global.currentResidentAssessmentFormPage15Key = rafp15.getSerial();
			txtIdcpTeamSignature1.setText(rafp15.getIdcpTeamSignature1());
			txtIdcpTeamSignature2.setText(rafp15.getIdcpTeamSignature2());
			txtIdcpTeamSignature3.setText(rafp15.getIdcpTeamSignature3());
			txtIdcpTeamSignature4.setText(rafp15.getIdcpTeamSignature4());
			txtIdcpTeamSignature5.setText(rafp15.getIdcpTeamSignature5());
			txtIdcpTeamSignature6.setText(rafp15.getIdcpTeamSignature6());
			txtIdcpTeamSignature7.setText(rafp15.getIdcpTeamSignature7());
			txtIdcpTeamSignature8.setText(rafp15.getIdcpTeamSignature8());
			txtIdcpTeamSignature9.setText(rafp15.getIdcpTeamSignature9());
			txtIdcpTeamSignature10.setText(rafp15.getIdcpTeamSignature10());

			dtWeek4Date10.setText(rafp15.getWeek4Date10());
			dtWeek4Date9.setText(rafp15.getWeek4Date9());
			dtWeek4Date8.setText(rafp15.getWeek4Date8());
			dtWeek4Date7.setText(rafp15.getWeek4Date7());
			dtWeek4Date6.setText(rafp15.getWeek4Date6());
			dtWeek4Date5.setText(rafp15.getWeek4Date5());
			dtWeek4Date4.setText(rafp15.getWeek4Date4());
			dtWeek4Date3.setText(rafp15.getWeek4Date3());
			dtWeek4Date2.setText(rafp15.getWeek4Date2());
			dtWeek4Date1.setText(rafp15.getWeek4Date1());
			dtWeek3Date10.setText(rafp15.getWeek3Date10());
			dtWeek3Date9.setText(rafp15.getWeek3Date9());
			dtWeek3Date8.setText(rafp15.getWeek3Date8());
			dtWeek3Date7.setText(rafp15.getWeek3Date7());
			dtWeek3Date6.setText(rafp15.getWeek3Date6());
			dtWeek3Date5.setText(rafp15.getWeek3Date5());
			dtWeek3Date4.setText(rafp15.getWeek3Date4());
			dtWeek3Date3.setText(rafp15.getWeek3Date3());
			dtWeek3Date2.setText(rafp15.getWeek3Date2());
			dtWeek3Date1.setText(rafp15.getWeek3Date1());
			dtWeek2Date10.setText(rafp15.getWeek2Date10());
			dtWeek2Date9.setText(rafp15.getWeek2Date9());
			dtWeek2Date8.setText(rafp15.getWeek2Date8());
			dtWeek2Date7.setText(rafp15.getWeek2Date7());
			dtWeek2Date6.setText(rafp15.getWeek2Date6());
			dtWeek2Date5.setText(rafp15.getWeek2Date5());
			dtWeek2Date4.setText(rafp15.getWeek2Date4());
			dtWeek2Date3.setText(rafp15.getWeek2Date3());
			dtWeek2Date2.setText(rafp15.getWeek2Date2());
			dtWeek2Date1.setText(rafp15.getWeek2Date1());
			dtWeek1Date10.setText(rafp15.getWeek1Date10());
			dtWeek1Date9.setText(rafp15.getWeek1Date9());
			dtWeek1Date8.setText(rafp15.getWeek1Date8());
			dtWeek1Date7.setText(rafp15.getWeek1Date7());
			dtWeek1Date6.setText(rafp15.getWeek1Date6());
			dtWeek1Date5.setText(rafp15.getWeek1Date5());
			dtWeek1Date4.setText(rafp15.getWeek1Date4());
			dtWeek1Date3.setText(rafp15.getWeek1Date3());
			dtWeek1Date2.setText(rafp15.getWeek1Date2());
			dtWeek1Date1.setText(rafp15.getWeek1Date1());

			txtLocationOfTheWound.setText(rafp15.getLocationOfTheWound());
			txtHospitalAcquired.setText(rafp15.getHospitalAcquired());
			txtFacilityAcquired.setText(rafp15.getFacilityAcquired());
			txtPressure.setText(rafp15.getPressure());
			txtVenous.setText(rafp15.getVenous());
			txtSx.setText(rafp15.getSx());
			txtSkinTear.setText(rafp15.getSkinTear());
			dtIdentifiedDate.setDate(rafp15.getIdentifiedDate());
			txtResidentName.setText(rafp15.getResidentName());
			txtRoom.setText(rafp15.getRoom());
		} else {
			TempRoomHistory roomHist = null;
			try {
				roomHist = MedrexClientManager.getInstance()
						.getCurrentRoomForResident(resId);
			} catch (Exception e) {
				e.printStackTrace();
			}
			/* TODO: Migrating to room history ----- Done */
			if (roomHist != null) {
				txtRoom.setText(roomHist.getRoom());
				txtFloor.setText(roomHist.getFloor());
			}
		}

	}

	public int doSave() {
		ResidentAssessmentFormPage15 residentAssessmentFormPage15 = new ResidentAssessmentFormPage15();
		residentAssessmentFormPage15
				.setSerial(Global.currentResidentAssessmentFormPage15Key);
		residentAssessmentFormPage15
				.setFormId(Global.currentDietaryCommunicationFormKey);
		residentAssessmentFormPage15.setRoom(txtRoom.getText());
		residentAssessmentFormPage15.setFloor(txtFloor.getText());
		residentAssessmentFormPage15
				.setLocationOfTheWound(txtLocationOfTheWound.getText());
		residentAssessmentFormPage15.setIdentifiedDate(dtIdentifiedDate
				.getDate());
		residentAssessmentFormPage15.setHospitalAcquired(txtHospitalAcquired
				.getText());
		residentAssessmentFormPage15.setFacilityAcquired(txtFacilityAcquired
				.getText());
		residentAssessmentFormPage15.setPressure(txtPressure.getText());
		residentAssessmentFormPage15.setVenous(txtVenous.getText());
		residentAssessmentFormPage15.setSx(txtSx.getText());
		residentAssessmentFormPage15.setSkinTear(txtSkinTear.getText());

		residentAssessmentFormPage15
				.setIdcpTeamSignature1(txtIdcpTeamSignature1.getText());
		residentAssessmentFormPage15
				.setIdcpTeamSignature2(txtIdcpTeamSignature2.getText());
		residentAssessmentFormPage15
				.setIdcpTeamSignature3(txtIdcpTeamSignature3.getText());
		residentAssessmentFormPage15
				.setIdcpTeamSignature4(txtIdcpTeamSignature4.getText());
		residentAssessmentFormPage15
				.setIdcpTeamSignature5(txtIdcpTeamSignature5.getText());
		residentAssessmentFormPage15
				.setIdcpTeamSignature6(txtIdcpTeamSignature6.getText());
		residentAssessmentFormPage15
				.setIdcpTeamSignature7(txtIdcpTeamSignature7.getText());
		residentAssessmentFormPage15
				.setIdcpTeamSignature8(txtIdcpTeamSignature8.getText());
		residentAssessmentFormPage15
				.setIdcpTeamSignature9(txtIdcpTeamSignature9.getText());
		residentAssessmentFormPage15
				.setIdcpTeamSignature10(txtIdcpTeamSignature10.getText());

		residentAssessmentFormPage15.setWeek1Date1(dtWeek1Date1.getText());
		residentAssessmentFormPage15.setWeek1Date2(dtWeek1Date2.getText());
		residentAssessmentFormPage15.setWeek1Date3(dtWeek1Date3.getText());
		residentAssessmentFormPage15.setWeek1Date4(dtWeek1Date4.getText());
		residentAssessmentFormPage15.setWeek1Date5(dtWeek1Date5.getText());
		residentAssessmentFormPage15.setWeek1Date6(dtWeek1Date6.getText());
		residentAssessmentFormPage15.setWeek1Date7(dtWeek1Date7.getText());
		residentAssessmentFormPage15.setWeek1Date8(dtWeek1Date8.getText());
		residentAssessmentFormPage15.setWeek1Date9(dtWeek1Date9.getText());
		residentAssessmentFormPage15.setWeek1Date10(dtWeek1Date10.getText());

		residentAssessmentFormPage15.setWeek2Date1(dtWeek2Date1.getText());
		residentAssessmentFormPage15.setWeek2Date2(dtWeek2Date2.getText());
		residentAssessmentFormPage15.setWeek2Date3(dtWeek2Date3.getText());
		residentAssessmentFormPage15.setWeek2Date4(dtWeek2Date4.getText());
		residentAssessmentFormPage15.setWeek2Date5(dtWeek2Date5.getText());
		residentAssessmentFormPage15.setWeek2Date6(dtWeek2Date6.getText());
		residentAssessmentFormPage15.setWeek2Date7(dtWeek2Date7.getText());
		residentAssessmentFormPage15.setWeek2Date8(dtWeek2Date8.getText());
		residentAssessmentFormPage15.setWeek2Date9(dtWeek2Date9.getText());
		residentAssessmentFormPage15.setWeek2Date10(dtWeek2Date10.getText());

		residentAssessmentFormPage15.setWeek3Date1(dtWeek3Date1.getText());
		residentAssessmentFormPage15.setWeek3Date2(dtWeek3Date2.getText());
		residentAssessmentFormPage15.setWeek3Date3(dtWeek3Date3.getText());
		residentAssessmentFormPage15.setWeek3Date4(dtWeek3Date4.getText());
		residentAssessmentFormPage15.setWeek3Date5(dtWeek3Date5.getText());
		residentAssessmentFormPage15.setWeek3Date6(dtWeek3Date6.getText());
		residentAssessmentFormPage15.setWeek3Date7(dtWeek3Date7.getText());
		residentAssessmentFormPage15.setWeek3Date8(dtWeek3Date8.getText());
		residentAssessmentFormPage15.setWeek3Date9(dtWeek3Date9.getText());
		residentAssessmentFormPage15.setWeek3Date10(dtWeek3Date10.getText());

		residentAssessmentFormPage15.setWeek4Date1(dtWeek4Date1.getText());
		residentAssessmentFormPage15.setWeek4Date2(dtWeek4Date2.getText());
		residentAssessmentFormPage15.setWeek4Date3(dtWeek4Date3.getText());
		residentAssessmentFormPage15.setWeek4Date4(dtWeek4Date4.getText());
		residentAssessmentFormPage15.setWeek4Date5(dtWeek4Date5.getText());
		residentAssessmentFormPage15.setWeek4Date6(dtWeek4Date6.getText());
		residentAssessmentFormPage15.setWeek4Date7(dtWeek4Date7.getText());
		residentAssessmentFormPage15.setWeek4Date8(dtWeek4Date8.getText());
		residentAssessmentFormPage15.setWeek4Date9(dtWeek4Date9.getText());
		residentAssessmentFormPage15.setWeek4Date10(dtWeek4Date10.getText());
		residentAssessmentFormPage15.setResidentName(txtResidentName.getText());

		try {
			Global.currentResidentAssessmentFormPage15Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage15(
							residentAssessmentFormPage15);
			return (0);
		} catch (Exception e) {
			return (0);
		}
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtResidentName, "Resident Name", 0, 25))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtLocationOfTheWound,
						"Location of the wound", 0, 25))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 15");
			return false;
		} else {
			return true;
		}
	}
}
