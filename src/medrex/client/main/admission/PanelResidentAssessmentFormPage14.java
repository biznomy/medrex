package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldValidation;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage14;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.jgoodies.validation.ValidationResult;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxLabel;
import com.sX.swing.JxLayeredPanel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.swing.widgets.JClockButton;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;
import com.toedter.calendar.JDateChooser;

public class PanelResidentAssessmentFormPage14 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4690123789248752397L;
	private JxText txtTreatmentRecommedationWeek;
	private JxText txtTreatmentRecommedationWeek3;
	private JxText txtTreatmentRecommedationWeek2;
	private JxText txtTreatmentRecommedationWeek1;
	private JxText txtPainManagementWeek;
	private JxText txtPainManagementWeek3;
	private JxText txtPainManagementWeek2;
	private JxText txtPainManagementWeek1;
	private JxComboBox cmbAppetiteFluidIntakeWeek;
	private JxComboBox cmbAppetiteFluidIntakeWeek3;
	private JxComboBox cmbAppetiteFluidIntakeWeek2;
	private JxComboBox cmbAppetiteFluidIntakeWeek1;
	private JxComboBox cmbSupplementWeek;
	private JxComboBox cmbSupplementWeek3;
	private JxComboBox cmbSupplementWeek2;
	private JxComboBox cmbSupplementWeek1;
	private JDateChooser dcTreatmentOrderDateWeek;
	private JDateChooser dcTreatmentOrderDateWeek3;
	private JDateChooser dcTreatmentOrderDateWeek2;
	private JDateChooser dcTreatmentOrderDateWeek1;
	private JxComboBox cmbPressureRelievingDeviceWeek;
	private JxComboBox cmbPressureRelievingDeviceWeek3;
	private JxComboBox cmbPressureRelievingDeviceWeek2;
	private JxComboBox cmbPressureRelievingDeviceWeek1;
	private JxComboBox cmbSpecialBedWeek;
	private JxComboBox cmbSpecialBedWeek3;
	private JxComboBox cmbSpecialBedWeek2;
	private JxComboBox cmbSpecialBedWeek1;
	private JxText txtTurningScheduleWeek;
	private JxText txtTurningScheduleWeek3;
	private JxText txtTurningScheduleWeek2;
	private JxText txtTurningScheduleWeek1;
	private JxComboBox cmbExudateOdorWeek;
	private JxComboBox cmbExudateOdorWeek3;
	private JxComboBox cmbExudateOdorWeek2;
	private JxComboBox cmbExudateOdorWeek1;
	private JxComboBox cmbAmountOfExudateWeek;
	private JxComboBox cmbAmountOfExudateWeek3;
	private JxComboBox cmbAmountOfExudateWeek2;
	private JxComboBox cmbAmountOfExudateWeek1;
	private JxComboBox cmbDrainageExudateTypeOfWeek;
	private JxComboBox cmbDrainageExudateTypeOfWeek3;
	private JxComboBox cmbDrainageExudateTypeOfWeek2;
	private JxComboBox cmbDrainageExudateTypeOfWeek1;
	private JxText txtInflamationWeek;
	private JxText txtInflamationWeek3;
	private JxText txtInflamationWeek2;
	private JxText txtInflamationWeek1;
	private JxComboBox cmbSloughColorWeek;
	private JxComboBox cmbSloughColorWeek3;
	private JxComboBox cmbSloughColorWeek2;
	private JxComboBox cmbSloughColorWeek1;
	private JxText txtSloughNecrosisWeek;
	private JxText txtSloughNecrosisWeek3;
	private JxText txtSloughNecrosisWeek2;
	private JxText txtSloughNecrosisWeek1;
	private JxText txtUnderminingWeek;
	private JxText txtUnderminingWeek3;
	private JxText txtUnderminingWeek2;
	private JxText txtUnderminingWeek1;
	private JClockButton txtTunnelling9Week;
	private JClockButton txtTunnelling6Week;
	private JClockButton txtTunnelling3Week;
	private JClockButton txtTunnelling12Week;
	private JxText txtTunnelling9Week3;
	private JxText txtTunnelling6Week3;
	private JxText txtTunnelling3Week3;
	private JxText txtTunnelling12Week3;
	private JxText txtTunnelling9Week2;
	private JxText txtTunnelling6Week2;
	private JxText txtTunnelling3Week2;
	private JxText txtTunnelling12Week2;
	private JxText txtTunnelling9Week1;
	private JxText txtTunnelling6Week1;
	private JxText txtTunnelling3Week1;
	private JxText txtTunnelling12Week1;
	private JxText txtCurrentApperanceWeek;
	private JxText txtCurrentApperanceWeek3;
	private JxText txtCurrentApperanceWeek2;
	private JxText txtCurrentApperanceWeek1;
	private JxText txtDepthWeek;
	private JxText txtDepthWeek3;
	private JxText txtDepthWeek2;
	private JxText txtDepthWeek1;
	private JxText txtWidthWeek;
	private JxText txtWidthWeek3;
	private JxText txtWidthWeek2;
	private JxText txtWidthWeek1;
	private JxText txtLengthWeek;
	private JxText txtLengthWeek3;
	private JxText txtLengthWeek2;
	private JxText txtLengthWeek1;
	private JxComboBox cmbStageWeek;
	private JxComboBox cmbStageWeek3;
	private JxComboBox cmbStageWeek2;
	private JxComboBox cmbStageWeek1;
	private JxText txtSkinTear;
	private JxText txtSx;
	private JxText txtVenous;
	private JxText txtPressure;
	private JxText txtFacilityAcquired;
	private JxText txtHospitalAcquired;
	private JDateChooser dtIdentifiedDate;
	private JxText txtWoundLocation;
	private JxText txtFloorType;
	private JxText txtRoom;
	private JxText txtResidentName;
	private JxCheckBox cbPressure;
	private JxCheckBox cbVenous;
	private JxCheckBox cbSx;
	private JxCheckBox cbDiabetic;
	private JxCheckBox cbArterial;
	private JxCheckBox cbOther;
	private JxCheckBox cbSkinTear;
	private JxLayeredPanel layeredPanel;

	Theme theme = new BlackOverWhiteTheme();

	public PanelResidentAssessmentFormPage14() {
		super();
		Global.panelResidentAssessmentFormPage14 = this;
		setPreferredSize(new Dimension(890, 1050));
		setBackground(Color.WHITE);
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);

		panel.setLayout(null);
		panel.setBounds(10, 10, 883, 1040);
		add(panel);

		final JxLabel plazaHealthcareAndLabel = new JxLabel();
		plazaHealthcareAndLabel.setTheme(theme);

		plazaHealthcareAndLabel
				.setText("Plaza Healthcare and Rehabiliation Center1");
		plazaHealthcareAndLabel.setBounds(208, 10, 436, 20);
		panel.add(plazaHealthcareAndLabel);

		final JxLabel idcpWoundsFlowLabel = new JxLabel();
		idcpWoundsFlowLabel.setTheme(theme);

		idcpWoundsFlowLabel.setText("IDCP WOUNDS FLOW SHEETS");
		idcpWoundsFlowLabel.setBounds(255, 35, 278, 14);
		panel.add(idcpWoundsFlowLabel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);

		panel_1.setLayout(null);
		panel_1.setBounds(10, 50, 866, 144);
		panel.add(panel_1);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme(theme);

		residentNameLabel.setBounds(10, 10, 149, 22);
		panel_1.add(residentNameLabel);
		residentNameLabel.setText("RESIDENT NAME");

		final JxLabel roomLabel = new JxLabel();
		roomLabel.setTheme(theme);

		roomLabel.setBounds(441, 10, 77, 20);
		panel_1.add(roomLabel);
		roomLabel.setText("ROOM #");

		final JxLabel floorLabel = new JxLabel();
		floorLabel.setTheme(theme);

		floorLabel.setBounds(653, 10, 77, 20);
		panel_1.add(floorLabel);
		floorLabel.setText("FLOOR");

		final JxLabel locationOfTheLabel = new JxLabel();
		locationOfTheLabel.setTheme(theme);

		locationOfTheLabel.setBounds(10, 38, 251, 21);
		panel_1.add(locationOfTheLabel);
		locationOfTheLabel.setText("LOCATION OF THE WOUND");

		final JxLabel dateIdentifiedLabel = new JxLabel();
		dateIdentifiedLabel.setTheme(theme);

		dateIdentifiedLabel.setBounds(487, 38, 154, 21);
		panel_1.add(dateIdentifiedLabel);
		dateIdentifiedLabel.setText("DATE IDENTIFIED");

		final JxLabel hospitalAcquiredLabel = new JxLabel();
		hospitalAcquiredLabel.setTheme(theme);

		hospitalAcquiredLabel.setBounds(10, 65, 205, 22);
		panel_1.add(hospitalAcquiredLabel);
		hospitalAcquiredLabel.setText("HOSPITAL ACQUIRED");

		final JxLabel facilityAcquiredLabel = new JxLabel();
		facilityAcquiredLabel.setTheme(theme);

		facilityAcquiredLabel.setBounds(487, 65, 183, 20);
		panel_1.add(facilityAcquiredLabel);
		facilityAcquiredLabel.setText("FACILITY ACQUIRED");

		final JxLabel typeOfWoundsLabel = new JxLabel();
		typeOfWoundsLabel.setTheme(theme);

		typeOfWoundsLabel.setBounds(10, 95, 172, 22);
		panel_1.add(typeOfWoundsLabel);
		typeOfWoundsLabel.setText("TYPE OF WOUNDS:");

		txtResidentName = new JxText();
		txtResidentName.setTheme(theme);
		txtResidentName.setBounds(179, 13, 256, 21);
		panel_1.add(txtResidentName);

		txtRoom = new JxText();
		txtRoom.setTheme(theme);
		txtRoom.setBounds(524, 13, 123, 21);
		panel_1.add(txtRoom);

		txtFloorType = new JxText();
		txtFloorType.setTheme(theme);
		txtFloorType.setBounds(721, 13, 128, 21);
		panel_1.add(txtFloorType);

		txtWoundLocation = new JxText();
		txtWoundLocation.setTheme(theme);
		txtWoundLocation.setBounds(267, 40, 195, 21);
		panel_1.add(txtWoundLocation);

		dtIdentifiedDate = new JDateChooser();
		dtIdentifiedDate.setDateFormatString("MM/dd/yyyy");
		dtIdentifiedDate.setBounds(676, 36, 155, 22);
		panel_1.add(dtIdentifiedDate);

		txtHospitalAcquired = new JxText();
		txtHospitalAcquired.setTheme(theme);
		txtHospitalAcquired.setBounds(221, 65, 241, 21);
		panel_1.add(txtHospitalAcquired);

		txtFacilityAcquired = new JxText();
		txtFacilityAcquired.setTheme(theme);
		txtFacilityAcquired.setBounds(676, 68, 155, 21);
		panel_1.add(txtFacilityAcquired);

		/*
		 * txtPressure = new JxText(); txtPressure.setTheme (theme);
		 * txtPressure.setBounds(292, 98, 79, 21); panel_1.add(txtPressure);
		 * 
		 * txtVenous = new JxText(); txtVenous.setTheme (theme);
		 * txtVenous.setBounds(466, 98, 79, 21); panel_1.add(txtVenous);
		 * 
		 * txtSx = new JxText(); txtSx.setTheme (theme); txtSx.setBounds(578,
		 * 98, 79, 21); panel_1.add(txtSx);
		 * 
		 * txtSkinTear = new JxText(); txtSkinTear.setTheme (theme);
		 * txtSkinTear.setBounds(770, 95, 79, 21); panel_1.add(txtSkinTear);
		 */

		cbPressure = new JxCheckBox();
		cbPressure.setTheme(theme);

		cbPressure.setText("PRESSURE");
		cbPressure.setBounds(208, 96, 99, 22);
		panel_1.add(cbPressure);

		cbVenous = new JxCheckBox();
		cbVenous.setTheme(theme);

		cbVenous.setText("VENOUS");
		cbVenous.setBounds(313, 96, 99, 22);
		panel_1.add(cbVenous);

		cbSx = new JxCheckBox();
		cbSx.setTheme(theme);

		cbSx.setText("SX");
		cbSx.setBounds(418, 96, 57, 22);
		panel_1.add(cbSx);

		cbSkinTear = new JxCheckBox();
		cbSkinTear.setTheme(theme);

		cbSkinTear.setText("SKIN TEAR");
		cbSkinTear.setBounds(509, 96, 99, 22);
		panel_1.add(cbSkinTear);

		cbDiabetic = new JxCheckBox();
		cbDiabetic.setTheme(theme);

		cbDiabetic.setText("DIABETIC");
		cbDiabetic.setBounds(208, 120, 92, 22);
		panel_1.add(cbDiabetic);

		cbArterial = new JxCheckBox();
		cbArterial.setTheme(theme);

		cbArterial.setText("ARTERIAL");
		cbArterial.setBounds(313, 120, 92, 22);
		panel_1.add(cbArterial);

		cbOther = new JxCheckBox();
		cbOther.setTheme(theme);

		cbOther.setText("OTHER");
		cbOther.setBounds(418, 120, 77, 22);
		panel_1.add(cbOther);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);
		panel_2.setBorder(new LineBorder(Color.black, 1, false));

		panel_2.setLayout(null);
		panel_2.setBounds(10, 200, 866, 824);
		panel.add(panel_2);

		layeredPanel = new JxLayeredPanel();
		layeredPanel.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		layeredPanel.setLayout(flowLayout);
		layeredPanel.setBounds(304, 0, 428, 824);
		panel_2.add(layeredPanel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setPreferredSize(new Dimension(142, 823));
		layeredPanel.add(panel_4);

		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);

		final JxPanel panel_6_2 = new JxPanel();
		panel_6_2.setTheme(theme);

		panel_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_2.setLayout(null);
		panel_6_2.setBounds(0, 0, 142, 24);
		panel_4.add(panel_6_2);

		final JxLabel week3Label = new JxLabel();
		week3Label.setTheme(theme);
		week3Label.setText("Previous 3rd Week");
		week3Label.setBounds(10, 5, 122, 14);
		panel_6_2.add(week3Label);

		final JxPanel panel_6_5_1 = new JxPanel();
		panel_6_5_1.setTheme(theme);

		panel_6_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1.setLayout(null);
		panel_6_5_1.setBounds(0, 23, 142, 23);
		panel_4.add(panel_6_5_1);

		cmbStageWeek3 = new JxComboBox(new String[] { "", "I", "II", "III",
				"IV", "DTI" });
		cmbStageWeek3.setTheme(theme);
		cmbStageWeek3.setBounds(10, 2, 122, 18);

		panel_6_5_1.add(cmbStageWeek3);

		final JxPanel panel_6_4_3 = new JxPanel();
		panel_6_4_3.setTheme(theme);

		panel_6_4_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_3.setLayout(null);
		panel_6_4_3.setBounds(0, 45, 142, 24);
		panel_4.add(panel_6_4_3);

		txtLengthWeek3 = new JxText();
		txtLengthWeek3.setTheme(theme);
		txtLengthWeek3.setBounds(10, 2, 122, 18);
		panel_6_4_3.add(txtLengthWeek3);

		final JxPanel panel_6_4_3_1 = new JxPanel();
		panel_6_4_3_1.setTheme(theme);

		panel_6_4_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_3_1.setLayout(null);
		panel_6_4_3_1.setBounds(0, 68, 142, 24);
		panel_4.add(panel_6_4_3_1);

		txtWidthWeek3 = new JxText();
		txtWidthWeek3.setTheme(theme);
		txtWidthWeek3.setBounds(10, 2, 122, 18);
		panel_6_4_3_1.add(txtWidthWeek3);

		final JxPanel panel_6_4_3_1_1 = new JxPanel();
		panel_6_4_3_1_1.setTheme(theme);

		panel_6_4_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_3_1_1.setLayout(null);
		panel_6_4_3_1_1.setBounds(0, 90, 142, 24);
		panel_4.add(panel_6_4_3_1_1);

		txtDepthWeek3 = new JxText();
		txtDepthWeek3.setTheme(theme);
		txtDepthWeek3.setBounds(10, 4, 122, 18);
		panel_6_4_3_1_1.add(txtDepthWeek3);

		final JxPanel panel_6_4_1_1_1_3 = new JxPanel();
		panel_6_4_1_1_1_3.setTheme(theme);

		panel_6_4_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_3.setLayout(null);
		panel_6_4_1_1_1_3.setBounds(0, 111, 142, 24);
		panel_4.add(panel_6_4_1_1_1_3);

		txtCurrentApperanceWeek3 = new JxText();
		txtCurrentApperanceWeek3.setTheme(theme);
		txtCurrentApperanceWeek3.setBounds(10, 4, 122, 18);
		panel_6_4_1_1_1_3.add(txtCurrentApperanceWeek3);

		final JxPanel panel_6_4_1_1_1_6 = new JxPanel();
		panel_6_4_1_1_1_6.setTheme(theme);

		panel_6_4_1_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_6.setLayout(null);
		panel_6_4_1_1_1_6.setBounds(0, 134, 142, 114);
		panel_4.add(panel_6_4_1_1_1_6);

		txtTunnelling12Week3 = new JxText();
		txtTunnelling12Week3.setTheme(theme);
		txtTunnelling12Week3.setBounds(35, 7, 79, 21);
		panel_6_4_1_1_1_6.add(txtTunnelling12Week3);

		txtTunnelling3Week3 = new JxText();
		txtTunnelling3Week3.setTheme(theme);
		txtTunnelling3Week3.setBounds(35, 34, 79, 21);
		panel_6_4_1_1_1_6.add(txtTunnelling3Week3);

		txtTunnelling6Week3 = new JxText();
		txtTunnelling6Week3.setTheme(theme);
		txtTunnelling6Week3.setBounds(35, 61, 79, 21);
		panel_6_4_1_1_1_6.add(txtTunnelling6Week3);

		txtTunnelling9Week3 = new JxText();
		txtTunnelling9Week3.setTheme(theme);
		txtTunnelling9Week3.setBounds(35, 88, 79, 21);
		panel_6_4_1_1_1_6.add(txtTunnelling9Week3);

		final JxLabel label_8 = new JxLabel();
		label_8.setTheme(theme);
		label_8.setText("12 -");
		label_8.setBounds(10, 10, 20, 14);
		panel_6_4_1_1_1_6.add(label_8);

		final JxLabel label_9 = new JxLabel();
		label_9.setTheme(theme);
		label_9.setText("3 - ");
		label_9.setBounds(10, 37, 20, 14);
		panel_6_4_1_1_1_6.add(label_9);

		final JxLabel label_10 = new JxLabel();
		label_10.setTheme(theme);
		label_10.setText("6 -");
		label_10.setBounds(10, 64, 20, 14);
		panel_6_4_1_1_1_6.add(label_10);

		final JxLabel label_11 = new JxLabel();
		label_11.setTheme(theme);
		label_11.setText("9 -");
		label_11.setBounds(10, 91, 20, 14);
		panel_6_4_1_1_1_6.add(label_11);

		final JxPanel panel_6_4_1_1_1_9 = new JxPanel();
		panel_6_4_1_1_1_9.setTheme(theme);

		panel_6_4_1_1_1_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_9.setLayout(null);
		panel_6_4_1_1_1_9.setBounds(0, 247, 142, 50);
		panel_4.add(panel_6_4_1_1_1_9);

		txtUnderminingWeek3 = new JxText();
		txtUnderminingWeek3.setTheme(theme);
		txtUnderminingWeek3.setBounds(10, 10, 122, 18);
		panel_6_4_1_1_1_9.add(txtUnderminingWeek3);

		final JxPanel panel_6_4_1_1_1_7_1_2 = new JxPanel();
		panel_6_4_1_1_1_7_1_2.setTheme(theme);

		panel_6_4_1_1_1_7_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7_1_2.setLayout(null);
		panel_6_4_1_1_1_7_1_2.setBounds(0, 295, 142, 30);
		panel_4.add(panel_6_4_1_1_1_7_1_2);

		txtSloughNecrosisWeek3 = new JxText();
		txtSloughNecrosisWeek3.setTheme(theme);
		txtSloughNecrosisWeek3.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_1_2.add(txtSloughNecrosisWeek3);

		final JxPanel panel_6_4_1_1_1_7_4 = new JxPanel();
		panel_6_4_1_1_1_7_4.setTheme(theme);

		panel_6_4_1_1_1_7_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7_4.setLayout(null);
		panel_6_4_1_1_1_7_4.setBounds(0, 324, 142, 43);
		panel_4.add(panel_6_4_1_1_1_7_4);

		cmbSloughColorWeek3 = new JxComboBox(new String[] { "", "Black",
				"Yellow", "Loose", "Firm" });
		cmbSloughColorWeek3.setTheme(theme);
		cmbSloughColorWeek3.setBounds(10, 10, 122, 18);

		panel_6_4_1_1_1_7_4.add(cmbSloughColorWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_2 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_2.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_2.setLayout(null);
		panel_6_4_1_1_1_7_2_1_2.setBounds(0, 365, 142, 32);
		panel_4.add(panel_6_4_1_1_1_7_2_1_2);

		txtInflamationWeek3 = new JxText();
		txtInflamationWeek3.setTheme(theme);
		txtInflamationWeek3.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_2.add(txtInflamationWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_2 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_2.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_2.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_2.setBounds(0, 395, 142, 50);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_2);

		cmbDrainageExudateTypeOfWeek3 = new JxComboBox(new String[] { "",
				"Clear", "Serosanguinous", "Green", "Bloody" });
		cmbDrainageExudateTypeOfWeek3.setTheme(theme);
		cmbDrainageExudateTypeOfWeek3.setBounds(10, 7, 122, 18);

		panel_6_4_1_1_1_7_2_1_3_2.add(cmbDrainageExudateTypeOfWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_2 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_2.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_3_2.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_2.setBounds(0, 443, 142, 30);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_3_2);

		cmbAmountOfExudateWeek3 = new JxComboBox(new String[] { "", "Scant",
				"Moderate", "Cupious" });
		cmbAmountOfExudateWeek3.setTheme(theme);
		cmbAmountOfExudateWeek3.setBounds(10, 7, 122, 18);

		panel_6_4_1_1_1_7_2_1_3_3_2.add(cmbAmountOfExudateWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_5 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_5.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_5.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_3_5.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_5.setBounds(0, 471, 142, 30);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_3_5);

		cmbExudateOdorWeek3 = new JxComboBox(new String[] { "", "None",
				"Sweet", "Foul" });
		cmbExudateOdorWeek3.setTheme(theme);
		cmbExudateOdorWeek3.setBounds(10, 7, 122, 18);

		panel_6_4_1_1_1_7_2_1_3_3_5.add(cmbExudateOdorWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_4_2 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_4_2.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_4_2.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_3_4_2.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_4_2.setBounds(0, 499, 142, 30);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_3_4_2);

		txtTurningScheduleWeek3 = new JxText();
		txtTurningScheduleWeek3.setTheme(theme);
		txtTurningScheduleWeek3.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_4_2.add(txtTurningScheduleWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_2 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_2.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_2.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_2.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_2.setBounds(0, 527, 142, 50);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_2);

		cmbSpecialBedWeek3 = new JxComboBox(new String[] { "", "Gel Foam",
				"Air", "Water", "APM", "Low Air Loss" });
		cmbSpecialBedWeek3.setTheme(theme);
		cmbSpecialBedWeek3.setBounds(10, 10, 122, 18);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_2.add(cmbSpecialBedWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_5 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_5.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_5.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_5.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_5.setBounds(0, 575, 142, 50);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_5);

		cmbPressureRelievingDeviceWeek3 = new JxComboBox(new String[] { "",
				"Heel Pads", "W/c Cusions", "Offloading" });
		cmbPressureRelievingDeviceWeek3.setTheme(theme);
		cmbPressureRelievingDeviceWeek3.setBounds(10, 7, 122, 18);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_5.add(cmbPressureRelievingDeviceWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_3 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_3.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_3.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_3.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_3.setBounds(0, 624, 142, 50);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_3);

		dcTreatmentOrderDateWeek3 = new JDateChooser();
		dcTreatmentOrderDateWeek3.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_3.add(dcTreatmentOrderDateWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_2 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_2.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_2.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_2.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_2.setBounds(0, 672, 142, 50);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_2);

		cmbSupplementWeek3 = new JxComboBox(new String[] { "", "MVI", "Zinc",
				"Vit C", "Prostat", "Juven" });
		cmbSupplementWeek3.setTheme(theme);

		cmbSupplementWeek3.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_2.add(cmbSupplementWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_5 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_5.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_5.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_5.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_5.setBounds(0, 720, 142, 50);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_5);

		cmbAppetiteFluidIntakeWeek3 = new JxComboBox(new String[] { "", "Poor",
				"Fair", "Good" });
		cmbAppetiteFluidIntakeWeek3.setTheme(theme);

		cmbAppetiteFluidIntakeWeek3.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_5
				.add(cmbAppetiteFluidIntakeWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_4 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_4.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_4.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_4.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_4.setBounds(0, 768, 142, 30);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_4);

		txtPainManagementWeek3 = new JxText();
		txtPainManagementWeek3.setTheme(theme);
		txtPainManagementWeek3.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_4.add(txtPainManagementWeek3);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_3_2 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3_2.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_3_2.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3_2.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3_2.setBounds(0, 794, 142, 28);
		panel_4.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_3_2);

		txtTreatmentRecommedationWeek3 = new JxText();
		txtTreatmentRecommedationWeek3.setTheme(theme);
		txtTreatmentRecommedationWeek3.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3_2.add(txtTreatmentRecommedationWeek3);

		final JxPanel panel_4_1 = new JxPanel();
		panel_4_1.setTheme(theme);
		panel_4_1.setPreferredSize(new Dimension(142, 823));
		layeredPanel.add(panel_4_1);

		panel_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1.setLayout(null);

		final JxPanel panel_6_1 = new JxPanel();
		panel_6_1.setTheme(theme);
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));

		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 0, 142, 24);
		panel_4_1.add(panel_6_1);

		final JxLabel week2Label = new JxLabel();
		week2Label.setTheme(theme);
		week2Label.setText("Previous 2nd Week");
		week2Label.setBounds(10, 5, 122, 14);
		panel_6_1.add(week2Label);

		final JxPanel panel_6_5 = new JxPanel();
		panel_6_5.setTheme(theme);

		panel_6_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5.setLayout(null);
		panel_6_5.setBounds(0, 23, 142, 23);
		panel_4_1.add(panel_6_5);

		cmbStageWeek2 = new JxComboBox(new String[] { "", "I", "II", "III",
				"IV", "DTI" });
		cmbStageWeek2.setTheme(theme);
		cmbStageWeek2.setBounds(10, 2, 122, 18);

		panel_6_5.add(cmbStageWeek2);

		final JxPanel panel_6_4_2 = new JxPanel();
		panel_6_4_2.setTheme(theme);

		panel_6_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_2.setLayout(null);
		panel_6_4_2.setBounds(0, 45, 142, 24);
		panel_4_1.add(panel_6_4_2);

		txtLengthWeek2 = new JxText();
		txtLengthWeek2.setTheme(theme);
		txtLengthWeek2.setBounds(10, 2, 122, 18);
		panel_6_4_2.add(txtLengthWeek2);

		final JxPanel panel_6_4_2_1 = new JxPanel();
		panel_6_4_2_1.setTheme(theme);

		panel_6_4_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_2_1.setLayout(null);
		panel_6_4_2_1.setBounds(0, 68, 142, 24);
		panel_4_1.add(panel_6_4_2_1);

		txtWidthWeek2 = new JxText();
		txtWidthWeek2.setTheme(theme);
		txtWidthWeek2.setBounds(10, 2, 122, 18);
		panel_6_4_2_1.add(txtWidthWeek2);

		final JxPanel panel_6_4_2_1_1 = new JxPanel();
		panel_6_4_2_1_1.setTheme(theme);

		panel_6_4_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_2_1_1.setLayout(null);
		panel_6_4_2_1_1.setBounds(0, 90, 142, 24);
		panel_4_1.add(panel_6_4_2_1_1);

		txtDepthWeek2 = new JxText();
		txtDepthWeek2.setTheme(theme);
		txtDepthWeek2.setBounds(10, 4, 122, 18);
		panel_6_4_2_1_1.add(txtDepthWeek2);

		final JxPanel panel_6_4_1_1_1_2 = new JxPanel();
		panel_6_4_1_1_1_2.setTheme(theme);

		panel_6_4_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_2.setLayout(null);
		panel_6_4_1_1_1_2.setBounds(0, 111, 142, 24);
		panel_4_1.add(panel_6_4_1_1_1_2);

		txtCurrentApperanceWeek2 = new JxText();
		txtCurrentApperanceWeek2.setTheme(theme);
		txtCurrentApperanceWeek2.setBounds(10, 4, 122, 18);
		panel_6_4_1_1_1_2.add(txtCurrentApperanceWeek2);

		final JxPanel panel_6_4_1_1_1_5 = new JxPanel();
		panel_6_4_1_1_1_5.setTheme(theme);

		panel_6_4_1_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_5.setLayout(null);
		panel_6_4_1_1_1_5.setBounds(0, 134, 142, 114);
		panel_4_1.add(panel_6_4_1_1_1_5);

		txtTunnelling12Week2 = new JxText();
		txtTunnelling12Week2.setTheme(theme);
		txtTunnelling12Week2.setBounds(35, 7, 79, 21);
		panel_6_4_1_1_1_5.add(txtTunnelling12Week2);

		txtTunnelling3Week2 = new JxText();
		txtTunnelling3Week2.setTheme(theme);
		txtTunnelling3Week2.setBounds(35, 34, 79, 21);
		panel_6_4_1_1_1_5.add(txtTunnelling3Week2);

		txtTunnelling6Week2 = new JxText();
		txtTunnelling6Week2.setTheme(theme);
		txtTunnelling6Week2.setBounds(35, 61, 79, 21);
		panel_6_4_1_1_1_5.add(txtTunnelling6Week2);

		txtTunnelling9Week2 = new JxText();
		txtTunnelling9Week2.setTheme(theme);
		txtTunnelling9Week2.setBounds(35, 88, 79, 21);
		panel_6_4_1_1_1_5.add(txtTunnelling9Week2);

		final JxLabel label_4 = new JxLabel();
		label_4.setTheme(theme);
		label_4.setText("12 -");
		label_4.setBounds(10, 10, 20, 14);
		panel_6_4_1_1_1_5.add(label_4);

		final JxLabel label_5 = new JxLabel();
		label_5.setTheme(theme);
		label_5.setText("3 -");
		label_5.setBounds(10, 37, 20, 14);
		panel_6_4_1_1_1_5.add(label_5);

		final JxLabel label_6 = new JxLabel();
		label_6.setTheme(theme);
		label_6.setText("6 -");
		label_6.setBounds(10, 64, 20, 14);
		panel_6_4_1_1_1_5.add(label_6);

		final JxLabel label_7 = new JxLabel();
		label_7.setTheme(theme);
		label_7.setText("9 -");
		label_7.setBounds(10, 91, 20, 14);
		panel_6_4_1_1_1_5.add(label_7);

		final JxPanel panel_6_4_1_1_1_8 = new JxPanel();
		panel_6_4_1_1_1_8.setTheme(theme);

		panel_6_4_1_1_1_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_8.setLayout(null);
		panel_6_4_1_1_1_8.setBounds(0, 247, 142, 50);
		panel_4_1.add(panel_6_4_1_1_1_8);

		txtUnderminingWeek2 = new JxText();
		txtUnderminingWeek2.setTheme(theme);
		txtUnderminingWeek2.setBounds(10, 10, 122, 18);
		panel_6_4_1_1_1_8.add(txtUnderminingWeek2);

		final JxPanel panel_6_4_1_1_1_7_1_1 = new JxPanel();
		panel_6_4_1_1_1_7_1_1.setTheme(theme);

		panel_6_4_1_1_1_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7_1_1.setLayout(null);
		panel_6_4_1_1_1_7_1_1.setBounds(0, 295, 142, 30);
		panel_4_1.add(panel_6_4_1_1_1_7_1_1);

		txtSloughNecrosisWeek2 = new JxText();
		txtSloughNecrosisWeek2.setTheme(theme);
		txtSloughNecrosisWeek2.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_1_1.add(txtSloughNecrosisWeek2);

		final JxPanel panel_6_4_1_1_1_7_3 = new JxPanel();
		panel_6_4_1_1_1_7_3.setTheme(theme);

		panel_6_4_1_1_1_7_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7_3.setLayout(null);
		panel_6_4_1_1_1_7_3.setBounds(0, 324, 142, 43);
		panel_4_1.add(panel_6_4_1_1_1_7_3);

		cmbSloughColorWeek2 = new JxComboBox(new String[] { "", "Black",
				"Yellow", "Loose", "Firm" });
		cmbSloughColorWeek2.setTheme(theme);
		cmbSloughColorWeek2.setBounds(10, 10, 122, 18);

		panel_6_4_1_1_1_7_3.add(cmbSloughColorWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_1.setBounds(0, 365, 142, 32);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_1);

		txtInflamationWeek2 = new JxText();
		txtInflamationWeek2.setTheme(theme);
		txtInflamationWeek2.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_1.add(txtInflamationWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_1.setBounds(0, 395, 142, 50);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_1);

		cmbDrainageExudateTypeOfWeek2 = new JxComboBox(new String[] { "",
				"Clear", "Serosanguinous", "Green", "Bloody" });
		cmbDrainageExudateTypeOfWeek2.setTheme(theme);
		cmbDrainageExudateTypeOfWeek2.setBounds(10, 7, 122, 18);

		panel_6_4_1_1_1_7_2_1_3_1.add(cmbDrainageExudateTypeOfWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_3_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_1.setBounds(0, 443, 142, 30);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_3_1);

		cmbAmountOfExudateWeek2 = new JxComboBox(new String[] { "", "Scant",
				"Moderate", "Cupious" });
		cmbAmountOfExudateWeek2.setTheme(theme);

		cmbAmountOfExudateWeek2.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_1.add(cmbAmountOfExudateWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_4 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_4.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_4.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_3_4.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_4.setBounds(0, 471, 142, 30);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_3_4);

		cmbExudateOdorWeek2 = new JxComboBox(new String[] { "", "None",
				"Sweet", "Foul" });
		cmbExudateOdorWeek2.setTheme(theme);
		cmbExudateOdorWeek2.setBounds(10, 7, 122, 18);

		panel_6_4_1_1_1_7_2_1_3_3_4.add(cmbExudateOdorWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_4_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_4_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_4_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_3_4_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_4_1.setBounds(0, 499, 142, 30);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_3_4_1);

		txtTurningScheduleWeek2 = new JxText();
		txtTurningScheduleWeek2.setTheme(theme);
		txtTurningScheduleWeek2.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_4_1.add(txtTurningScheduleWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_1.setBounds(0, 527, 142, 50);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_1);

		cmbSpecialBedWeek2 = new JxComboBox(new String[] { "", "Gel Foam",
				"Air", "Water", "APM", "Low Air Loss" });
		cmbSpecialBedWeek2.setTheme(theme);

		cmbSpecialBedWeek2.setBounds(10, 10, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_1.add(cmbSpecialBedWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_4 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_4.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_4.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_4.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_4.setBounds(0, 575, 142, 50);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_4);

		cmbPressureRelievingDeviceWeek2 = new JxComboBox(new String[] { "",
				"Heel Pads", "W/c Cusions", "Offloading" });
		cmbPressureRelievingDeviceWeek2.setTheme(theme);
		cmbPressureRelievingDeviceWeek2.setBounds(10, 7, 122, 18);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_4.add(cmbPressureRelievingDeviceWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_2 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_2.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_2.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_2.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_2.setBounds(0, 624, 142, 50);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_2);

		dcTreatmentOrderDateWeek2 = new JDateChooser();
		dcTreatmentOrderDateWeek2.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_2.add(dcTreatmentOrderDateWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_1.setBounds(0, 672, 142, 50);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_1);

		cmbSupplementWeek2 = new JxComboBox(new String[] { "", "MVI", "Zinc",
				"Vit C", "Prostat", "Juven" });
		cmbSupplementWeek2.setTheme(theme);

		cmbSupplementWeek2.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_1.add(cmbSupplementWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_4 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_4.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_4.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_4.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_4.setBounds(0, 720, 142, 50);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_4);

		cmbAppetiteFluidIntakeWeek2 = new JxComboBox(new String[] { "", "Poor",
				"Fair", "Good" });
		cmbAppetiteFluidIntakeWeek2.setTheme(theme);

		cmbAppetiteFluidIntakeWeek2.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_4
				.add(cmbAppetiteFluidIntakeWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_3 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_3.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3.setBounds(0, 768, 142, 30);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_3);

		txtPainManagementWeek2 = new JxText();
		txtPainManagementWeek2.setTheme(theme);
		txtPainManagementWeek2.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3.add(txtPainManagementWeek2);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_3_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_3_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3_1.setBounds(0, 794, 142, 28);
		panel_4_1.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_3_1);

		txtTreatmentRecommedationWeek2 = new JxText();
		txtTreatmentRecommedationWeek2.setTheme(theme);
		txtTreatmentRecommedationWeek2.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_3_1.add(txtTreatmentRecommedationWeek2);

		final JxPanel panel_4_2 = new JxPanel();
		panel_4_2.setTheme(theme);
		panel_4_2.setPreferredSize(new Dimension(142, 823));
		layeredPanel.add(panel_4_2);

		panel_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2.setLayout(null);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme(theme);
		panel_6.setBorder(new LineBorder(Color.black, 1, false));

		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 142, 24);
		panel_4_2.add(panel_6);

		final JxLabel week1Label = new JxLabel();
		week1Label.setTheme(theme);
		week1Label.setText("Previous 1st Week");
		week1Label.setBounds(10, 5, 122, 14);
		panel_6.add(week1Label);

		final JxPanel panel_6_4 = new JxPanel();
		panel_6_4.setTheme(theme);

		panel_6_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4.setLayout(null);
		panel_6_4.setBounds(0, 23, 142, 23);
		panel_4_2.add(panel_6_4);

		cmbStageWeek1 = new JxComboBox(new String[] { "", "I", "II", "III",
				"IV", "DTI" });
		cmbStageWeek1.setTheme(theme);
		cmbStageWeek1.setEditable(true);

		cmbStageWeek1.setBounds(10, 2, 122, 18);
		panel_6_4.add(cmbStageWeek1);

		final JxPanel panel_6_4_1 = new JxPanel();
		panel_6_4_1.setTheme(theme);

		panel_6_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1.setLayout(null);
		panel_6_4_1.setBounds(0, 45, 142, 24);
		panel_4_2.add(panel_6_4_1);

		txtLengthWeek1 = new JxText();
		txtLengthWeek1.setTheme(theme);
		txtLengthWeek1.setEditable(true);
		txtLengthWeek1.setBounds(10, 2, 122, 18);
		panel_6_4_1.add(txtLengthWeek1);

		final JxPanel panel_6_4_1_1 = new JxPanel();
		panel_6_4_1_1.setTheme(theme);

		panel_6_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1.setLayout(null);
		panel_6_4_1_1.setBounds(0, 68, 142, 24);
		panel_4_2.add(panel_6_4_1_1);

		txtWidthWeek1 = new JxText();
		txtWidthWeek1.setTheme(theme);
		txtWidthWeek1.setBounds(10, 2, 122, 18);
		panel_6_4_1_1.add(txtWidthWeek1);

		final JxPanel panel_6_4_1_1_1 = new JxPanel();
		panel_6_4_1_1_1.setTheme(theme);

		panel_6_4_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1.setLayout(null);
		panel_6_4_1_1_1.setBounds(0, 90, 142, 24);
		panel_4_2.add(panel_6_4_1_1_1);

		txtDepthWeek1 = new JxText();
		txtDepthWeek1.setTheme(theme);
		txtDepthWeek1.setBounds(10, 4, 122, 18);
		panel_6_4_1_1_1.add(txtDepthWeek1);

		final JxPanel panel_6_4_1_1_1_1 = new JxPanel();
		panel_6_4_1_1_1_1.setTheme(theme);

		panel_6_4_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_1.setLayout(null);
		panel_6_4_1_1_1_1.setBounds(0, 112, 142, 24);
		panel_4_2.add(panel_6_4_1_1_1_1);

		txtCurrentApperanceWeek1 = new JxText();
		txtCurrentApperanceWeek1.setTheme(theme);
		txtCurrentApperanceWeek1.setBounds(10, 4, 122, 18);
		panel_6_4_1_1_1_1.add(txtCurrentApperanceWeek1);

		final JxPanel panel_6_4_1_1_1_4 = new JxPanel();
		panel_6_4_1_1_1_4.setTheme(theme);

		panel_6_4_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_4.setLayout(null);
		panel_6_4_1_1_1_4.setBounds(0, 134, 142, 114);
		panel_4_2.add(panel_6_4_1_1_1_4);

		final JxLabel label = new JxLabel();
		label.setTheme(theme);
		label.setText("12 -");
		label.setBounds(10, 10, 19, 14);
		panel_6_4_1_1_1_4.add(label);

		txtTunnelling12Week1 = new JxText();
		txtTunnelling12Week1.setTheme(theme);
		txtTunnelling12Week1.setBounds(35, 7, 79, 21);
		panel_6_4_1_1_1_4.add(txtTunnelling12Week1);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme(theme);
		label_1.setText("3 -");
		label_1.setBounds(10, 37, 19, 14);
		panel_6_4_1_1_1_4.add(label_1);

		txtTunnelling3Week1 = new JxText();
		txtTunnelling3Week1.setTheme(theme);
		txtTunnelling3Week1.setBounds(35, 34, 79, 21);
		panel_6_4_1_1_1_4.add(txtTunnelling3Week1);

		txtTunnelling6Week1 = new JxText();
		txtTunnelling6Week1.setTheme(theme);
		txtTunnelling6Week1.setBounds(35, 61, 79, 21);
		panel_6_4_1_1_1_4.add(txtTunnelling6Week1);

		txtTunnelling9Week1 = new JxText();
		txtTunnelling9Week1.setTheme(theme);
		txtTunnelling9Week1.setBounds(35, 88, 79, 21);
		panel_6_4_1_1_1_4.add(txtTunnelling9Week1);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme(theme);
		label_2.setText("6 -");
		label_2.setBounds(10, 64, 19, 14);
		panel_6_4_1_1_1_4.add(label_2);

		final JxLabel label_3 = new JxLabel();
		label_3.setTheme(theme);
		label_3.setText("9 -");
		label_3.setBounds(10, 91, 19, 14);
		panel_6_4_1_1_1_4.add(label_3);

		final JxPanel panel_6_4_1_1_1_7 = new JxPanel();
		panel_6_4_1_1_1_7.setTheme(theme);

		panel_6_4_1_1_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7.setLayout(null);
		panel_6_4_1_1_1_7.setBounds(0, 247, 142, 50);
		panel_4_2.add(panel_6_4_1_1_1_7);

		txtUnderminingWeek1 = new JxText();
		txtUnderminingWeek1.setTheme(theme);
		txtUnderminingWeek1.setBounds(10, 10, 122, 18);
		panel_6_4_1_1_1_7.add(txtUnderminingWeek1);

		final JxPanel panel_6_4_1_1_1_7_1 = new JxPanel();
		panel_6_4_1_1_1_7_1.setTheme(theme);

		panel_6_4_1_1_1_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7_1.setLayout(null);
		panel_6_4_1_1_1_7_1.setBounds(0, 295, 142, 30);
		panel_4_2.add(panel_6_4_1_1_1_7_1);

		txtSloughNecrosisWeek1 = new JxText();
		txtSloughNecrosisWeek1.setTheme(theme);
		txtSloughNecrosisWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_1.add(txtSloughNecrosisWeek1);

		final JxPanel panel_6_4_1_1_1_7_2 = new JxPanel();
		panel_6_4_1_1_1_7_2.setTheme(theme);

		panel_6_4_1_1_1_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7_2.setLayout(null);
		panel_6_4_1_1_1_7_2.setBounds(0, 324, 142, 43);
		panel_4_2.add(panel_6_4_1_1_1_7_2);

		cmbSloughColorWeek1 = new JxComboBox(new String[] { "", "Black",
				"Yellow", "Loose", "Firm" });
		cmbSloughColorWeek1.setTheme(theme);

		cmbSloughColorWeek1.setBounds(10, 10, 122, 18);
		panel_6_4_1_1_1_7_2.add(cmbSloughColorWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1.setBounds(0, 365, 142, 32);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1);

		txtInflamationWeek1 = new JxText();
		txtInflamationWeek1.setTheme(theme);
		txtInflamationWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1.add(txtInflamationWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_3.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3.setBounds(0, 395, 142, 50);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3);

		cmbDrainageExudateTypeOfWeek1 = new JxComboBox(new String[] { "",
				"Clear", "Serosanguinous", "Green", "Bloody" });
		cmbDrainageExudateTypeOfWeek1.setTheme(theme);

		cmbDrainageExudateTypeOfWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3.add(cmbDrainageExudateTypeOfWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_3.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3.setBounds(0, 443, 142, 30);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3_3);

		cmbAmountOfExudateWeek1 = new JxComboBox(new String[] { "", "Scant",
				"Moderate", "Cupious" });
		cmbAmountOfExudateWeek1.setTheme(theme);

		cmbAmountOfExudateWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3.add(cmbAmountOfExudateWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_3_3.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3.setBounds(0, 471, 142, 30);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3_3_3);

		cmbExudateOdorWeek1 = new JxComboBox(new String[] { "", "None",
				"Sweet", "Foul" });
		cmbExudateOdorWeek1.setTheme(theme);

		cmbExudateOdorWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3.add(cmbExudateOdorWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1.setBounds(0, 499, 142, 30);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3_3_3_1);

		txtTurningScheduleWeek1 = new JxText();
		txtTurningScheduleWeek1.setTheme(theme);
		txtTurningScheduleWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1.add(txtTurningScheduleWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1.setBounds(0, 527, 142, 50);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1);

		cmbSpecialBedWeek1 = new JxComboBox(new String[] { "", "Gel Foam",
				"Air", "Water", "APM", "Low Air Loss" });
		cmbSpecialBedWeek1.setTheme(theme);

		cmbSpecialBedWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1.add(cmbSpecialBedWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3.setBounds(0, 575, 142, 50);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3);

		cmbPressureRelievingDeviceWeek1 = new JxComboBox(new String[] { "",
				"Heel Pads", "W/c Cusions", "Offloading" });
		cmbPressureRelievingDeviceWeek1.setTheme(theme);

		cmbPressureRelievingDeviceWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3.add(cmbPressureRelievingDeviceWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1.setBounds(0, 624, 142, 50);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1);

		dcTreatmentOrderDateWeek1 = new JDateChooser();
		dcTreatmentOrderDateWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1.add(dcTreatmentOrderDateWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1.setBounds(0, 672, 142, 50);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1);

		cmbSupplementWeek1 = new JxComboBox(new String[] { "", "MVI", "Zinc",
				"Vit C", "Prostat", "Juven" });
		cmbSupplementWeek1.setTheme(theme);

		cmbSupplementWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1.add(cmbSupplementWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_3 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_3.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_3.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_3.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_3.setBounds(0, 720, 142, 50);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_3);

		cmbAppetiteFluidIntakeWeek1 = new JxComboBox(new String[] { "", "Poor",
				"Fair", "Good" });
		cmbAppetiteFluidIntakeWeek1.setTheme(theme);

		cmbAppetiteFluidIntakeWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_1_3_1_1_3
				.add(cmbAppetiteFluidIntakeWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_2 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_2.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_2.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_2.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_2.setBounds(0, 768, 142, 30);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_2);

		txtPainManagementWeek1 = new JxText();
		txtPainManagementWeek1.setTheme(theme);
		txtPainManagementWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_2.add(txtPainManagementWeek1);

		final JxPanel panel_6_4_1_1_1_7_2_1_3_3_3_1_2_1 = new JxPanel();
		panel_6_4_1_1_1_7_2_1_3_3_3_1_2_1.setTheme(theme);

		panel_6_4_1_1_1_7_2_1_3_3_3_1_2_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_4_1_1_1_7_2_1_3_3_3_1_2_1.setLayout(null);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_2_1.setBounds(0, 794, 142, 28);
		panel_4_2.add(panel_6_4_1_1_1_7_2_1_3_3_3_1_2_1);

		txtTreatmentRecommedationWeek1 = new JxText();
		txtTreatmentRecommedationWeek1.setTheme(theme);
		txtTreatmentRecommedationWeek1.setBounds(10, 7, 122, 18);
		panel_6_4_1_1_1_7_2_1_3_3_3_1_2_1.add(txtTreatmentRecommedationWeek1);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);

		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 305, 824);
		panel_2.add(panel_3);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme(theme);

		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBounds(1, 1, 305, 24);
		panel_3.add(panel_5);

		final JxLabel dateLabel = new JxLabel();
		dateLabel.setTheme(theme);
		dateLabel.setText("DATE");
		dateLabel.setBounds(10, 5, 54, 14);
		panel_5.add(dateLabel);

		final JxPanel panel_5_1 = new JxPanel();
		panel_5_1.setTheme(theme);

		panel_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1.setLayout(null);
		panel_5_1.setBounds(1, 22, 305, 24);
		panel_3.add(panel_5_1);

		final JxLabel stageiIiLabel = new JxLabel();
		stageiIiLabel.setTheme(theme);
		stageiIiLabel.setText("STAGE (I, II, III, IV, OR, DTI)");
		stageiIiLabel.setBounds(10, 5, 168, 14);
		panel_5_1.add(stageiIiLabel);

		final JxPanel panel_5_1_1 = new JxPanel();
		panel_5_1_1.setTheme(theme);

		panel_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBounds(1, 45, 305, 24);
		panel_3.add(panel_5_1_1);

		final JxLabel lengthinCmLabel = new JxLabel();
		lengthinCmLabel.setTheme(theme);
		lengthinCmLabel.setText("LENGTH (IN CM)");
		lengthinCmLabel.setBounds(10, 5, 123, 14);
		panel_5_1_1.add(lengthinCmLabel);

		final JxPanel panel_5_1_1_1 = new JxPanel();
		panel_5_1_1_1.setTheme(theme);

		panel_5_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_1.setLayout(null);
		panel_5_1_1_1.setBounds(1, 68, 305, 24);
		panel_3.add(panel_5_1_1_1);

		final JxLabel widthLabel = new JxLabel();
		widthLabel.setTheme(theme);
		widthLabel.setText("WIDTH");
		widthLabel.setBounds(10, 5, 54, 14);
		panel_5_1_1_1.add(widthLabel);

		final JxPanel panel_5_1_1_2 = new JxPanel();
		panel_5_1_1_2.setTheme(theme);

		panel_5_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_2.setLayout(null);
		panel_5_1_1_2.setBounds(1, 90, 305, 24);
		panel_3.add(panel_5_1_1_2);

		final JxLabel depthLabel = new JxLabel();
		depthLabel.setTheme(theme);
		depthLabel.setText("DEPTH");
		depthLabel.setBounds(10, 5, 54, 14);
		panel_5_1_1_2.add(depthLabel);

		final JxPanel panel_5_1_1_3 = new JxPanel();
		panel_5_1_1_3.setTheme(theme);

		panel_5_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_3.setLayout(null);
		panel_5_1_1_3.setBounds(1, 112, 305, 24);
		panel_3.add(panel_5_1_1_3);

		final JxLabel currentApperancestageLabel = new JxLabel();
		currentApperancestageLabel.setTheme(theme);
		currentApperancestageLabel.setText("CURRENT APPERANCE (STAGE)");
		currentApperancestageLabel.setBounds(10, 5, 224, 14);
		panel_5_1_1_3.add(currentApperancestageLabel);

		final JxPanel panel_5_1_1_4 = new JxPanel();
		panel_5_1_1_4.setTheme(theme);

		panel_5_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_4.setLayout(null);
		panel_5_1_1_4.setBounds(1, 134, 305, 114);
		panel_3.add(panel_5_1_1_4);

		final JxLabel tunnelingLabel = new JxLabel();
		tunnelingLabel.setTheme(theme);

		tunnelingLabel.setText("<html><u>TUNNELING</u></html>");
		tunnelingLabel.setBounds(10, 5, 56, 23);
		panel_5_1_1_4.add(tunnelingLabel);

		final JxLabel useClockAndLabel = new JxLabel();
		useClockAndLabel.setTheme(theme);
		useClockAndLabel
				.setText("(Use clock and fill in location in small blocks)");
		useClockAndLabel.setBounds(10, 30, 252, 14);
		panel_5_1_1_4.add(useClockAndLabel);

		final JxPanel panel_5_1_1_5 = new JxPanel();
		panel_5_1_1_5.setTheme(theme);

		panel_5_1_1_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_5.setLayout(null);
		panel_5_1_1_5.setBounds(1, 247, 305, 50);
		panel_3.add(panel_5_1_1_5);

		final JxLabel understandingLabel = new JxLabel();
		understandingLabel.setTheme(theme);
		understandingLabel.setText("<html> <u>UNDERSTANDING</u></html>");
		understandingLabel.setBounds(10, 10, 92, 14);
		panel_5_1_1_5.add(understandingLabel);

		final JxLabel underDermalLayerLabel = new JxLabel();
		underDermalLayerLabel.setTheme(theme);
		underDermalLayerLabel.setText("(Under dermal layer) Use Clock");
		underDermalLayerLabel.setBounds(10, 30, 162, 14);
		panel_5_1_1_5.add(underDermalLayerLabel);

		final JxPanel panel_5_1_1_6 = new JxPanel();
		panel_5_1_1_6.setTheme(theme);

		panel_5_1_1_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_6.setLayout(null);
		panel_5_1_1_6.setBounds(1, 295, 305, 30);
		panel_3.add(panel_5_1_1_6);

		final JxLabel presenceOfSloughnecrosisLabel = new JxLabel();
		presenceOfSloughnecrosisLabel.setTheme(theme);
		presenceOfSloughnecrosisLabel
				.setText("<HTML><U>PRESENCE OF SLOUGH/NECROSIS MEASURE BY %</U></HTML>");
		presenceOfSloughnecrosisLabel.setBounds(10, 10, 273, 14);
		panel_5_1_1_6.add(presenceOfSloughnecrosisLabel);

		final JxPanel panel_5_1_1_9 = new JxPanel();
		panel_5_1_1_9.setTheme(theme);

		panel_5_1_1_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_9.setLayout(null);
		panel_5_1_1_9.setBounds(1, 365, 305, 32);
		panel_3.add(panel_5_1_1_9);

		final JxLabel inflamationOfSurroundingLabel = new JxLabel();
		inflamationOfSurroundingLabel.setTheme(theme);
		inflamationOfSurroundingLabel
				.setText("<HTML><U>INFLAMATION OF SURROUNDING TISSUE AND SIZE</U> </HTML>");
		inflamationOfSurroundingLabel.setBounds(10, 10, 269, 14);
		panel_5_1_1_9.add(inflamationOfSurroundingLabel);

		final JxPanel panel_5_1_1_10 = new JxPanel();
		panel_5_1_1_10.setTheme(theme);

		panel_5_1_1_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_10.setLayout(null);
		panel_5_1_1_10.setBounds(1, 443, 305, 30);
		panel_3.add(panel_5_1_1_10);

		final JxLabel amountOfExudatescantLabel = new JxLabel();
		amountOfExudatescantLabel.setTheme(theme);
		amountOfExudatescantLabel
				.setText("Amount of Exudate (Scant, Moderate , Copious)");
		amountOfExudatescantLabel.setBounds(10, 10, 240, 14);
		panel_5_1_1_10.add(amountOfExudatescantLabel);

		final JxPanel panel_5_1_1_11 = new JxPanel();
		panel_5_1_1_11.setTheme(theme);

		panel_5_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_11.setLayout(null);
		panel_5_1_1_11.setBounds(1, 471, 305, 30);
		panel_3.add(panel_5_1_1_11);

		final JxLabel odorOfExudateLabel = new JxLabel();
		odorOfExudateLabel.setTheme(theme);
		odorOfExudateLabel.setText("Odor of Exudate (None, Sweet, Foul)");
		odorOfExudateLabel.setBounds(10, 10, 207, 14);
		panel_5_1_1_11.add(odorOfExudateLabel);

		final JxPanel panel_5_1_1_12 = new JxPanel();
		panel_5_1_1_12.setTheme(theme);

		panel_5_1_1_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_12.setLayout(null);
		panel_5_1_1_12.setBounds(1, 499, 305, 30);
		panel_3.add(panel_5_1_1_12);

		final JxLabel turningScheduleyesLabel = new JxLabel();
		turningScheduleyesLabel.setTheme(theme);
		turningScheduleyesLabel
				.setText("<HTML><U>TURNING SCHEDULE (YES) OR INDEPENDENT</U></HTML>");
		turningScheduleyesLabel.setBounds(10, 10, 232, 14);
		panel_5_1_1_12.add(turningScheduleyesLabel);

		final JxPanel panel_5_1_1_15 = new JxPanel();
		panel_5_1_1_15.setTheme(theme);

		panel_5_1_1_15.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_15.setLayout(null);
		panel_5_1_1_15.setBounds(1, 624, 305, 50);
		panel_3.add(panel_5_1_1_15);

		final JxLabel treatmentOrderAndLabel = new JxLabel();
		treatmentOrderAndLabel.setTheme(theme);
		treatmentOrderAndLabel
				.setText("<HTML><U>TREATMENT ORDER AND DATE STARTED</U></HTML>");
		treatmentOrderAndLabel.setBounds(10, 10, 209, 14);
		panel_5_1_1_15.add(treatmentOrderAndLabel);

		final JxPanel panel_5_1_1_17 = new JxPanel();
		panel_5_1_1_17.setTheme(theme);

		panel_5_1_1_17.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_17.setLayout(null);
		panel_5_1_1_17.setBounds(1, 672, 305, 50);
		panel_3.add(panel_5_1_1_17);

		final JxLabel supplementLabel = new JxLabel();
		supplementLabel.setTheme(theme);
		supplementLabel.setText("<HTML><U>SUPPLEMENT</U></HTML>");
		supplementLabel.setBounds(10, 10, 78, 14);
		panel_5_1_1_17.add(supplementLabel);

		final JxLabel mviZincVitLabel = new JxLabel();
		mviZincVitLabel.setTheme(theme);
		mviZincVitLabel.setText("(MVI, Zinc, Vit C, Prostat, Juven)");
		mviZincVitLabel.setBounds(10, 30, 177, 14);
		panel_5_1_1_17.add(mviZincVitLabel);

		final JxPanel panel_5_1_1_18 = new JxPanel();
		panel_5_1_1_18.setTheme(theme);

		panel_5_1_1_18.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_18.setLayout(null);
		panel_5_1_1_18.setBounds(1, 720, 305, 50);
		panel_3.add(panel_5_1_1_18);

		final JxLabel appettieFluidLabel = new JxLabel();
		appettieFluidLabel.setTheme(theme);
		appettieFluidLabel
				.setText("<HTML><U>APPETTIE / FLUID INTAKE</U></HTML>");
		appettieFluidLabel.setBounds(10, 10, 138, 14);
		panel_5_1_1_18.add(appettieFluidLabel);

		final JxLabel poorFairGoodLabel = new JxLabel();
		poorFairGoodLabel.setTheme(theme);
		poorFairGoodLabel.setText("(Poor, Fair, Good)");
		poorFairGoodLabel.setBounds(10, 30, 138, 14);
		panel_5_1_1_18.add(poorFairGoodLabel);

		final JxPanel panel_5_1_1_19 = new JxPanel();
		panel_5_1_1_19.setTheme(theme);

		panel_5_1_1_19.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_19.setLayout(null);
		panel_5_1_1_19.setBounds(1, 768, 305, 30);
		panel_3.add(panel_5_1_1_19);

		final JxLabel painManagementLabel = new JxLabel();
		painManagementLabel.setTheme(theme);
		painManagementLabel.setText("PAIN MANAGEMENT");
		painManagementLabel.setBounds(10, 10, 172, 14);
		panel_5_1_1_19.add(painManagementLabel);

		final JxPanel panel_5_1_1_8 = new JxPanel();
		panel_5_1_1_8.setTheme(theme);
		panel_5_1_1_8.setBounds(1, 395, 305, 50);
		panel_3.add(panel_5_1_1_8);

		panel_5_1_1_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_8.setLayout(null);

		final JxLabel drainageexudateTypeOfLabel = new JxLabel();
		drainageexudateTypeOfLabel.setTheme(theme);
		drainageexudateTypeOfLabel
				.setText("<HTML><U>DRAINAGE/EXUDATE, TYPE OF</U></HTML>");
		drainageexudateTypeOfLabel.setBounds(10, 10, 160, 14);
		panel_5_1_1_8.add(drainageexudateTypeOfLabel);

		final JxLabel clearSweosanguinousGreenLabel = new JxLabel();
		clearSweosanguinousGreenLabel.setTheme(theme);
		clearSweosanguinousGreenLabel
				.setText("(Clear, sweosanguinous, green, bloody)");
		clearSweosanguinousGreenLabel.setBounds(10, 30, 193, 14);
		panel_5_1_1_8.add(clearSweosanguinousGreenLabel);

		final JxPanel panel_5_1_1_7 = new JxPanel();
		panel_5_1_1_7.setTheme(theme);
		panel_5_1_1_7.setBounds(1, 324, 305, 43);
		panel_3.add(panel_5_1_1_7);

		panel_5_1_1_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_7.setLayout(null);

		final JxLabel colorTypeLabel = new JxLabel();
		colorTypeLabel.setTheme(theme);
		colorTypeLabel.setText("<HTML><U>COLOR & TYPE OF SLOUGH</U> </HTML>");
		colorTypeLabel.setBounds(10, 5, 141, 14);
		panel_5_1_1_7.add(colorTypeLabel);

		final JxLabel blackYellowLooseLabel = new JxLabel();
		blackYellowLooseLabel.setTheme(theme);
		blackYellowLooseLabel.setText("(Black, Yellow, Loose, Firm)");
		blackYellowLooseLabel.setBounds(10, 25, 141, 14);
		panel_5_1_1_7.add(blackYellowLooseLabel);

		final JxPanel panel_5_1_1_14 = new JxPanel();
		panel_5_1_1_14.setTheme(theme);
		panel_5_1_1_14.setBounds(1, 575, 305, 50);
		panel_3.add(panel_5_1_1_14);

		panel_5_1_1_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_14.setLayout(null);

		final JxLabel otherPressureRelievingLabel = new JxLabel();
		otherPressureRelievingLabel.setTheme(theme);
		otherPressureRelievingLabel
				.setText("<HTML><U>OTHER PRESSURE RELIEVING DEVICES");
		otherPressureRelievingLabel.setBounds(10, 10, 234, 14);
		panel_5_1_1_14.add(otherPressureRelievingLabel);

		final JxLabel heelPadsWcLabel = new JxLabel();
		heelPadsWcLabel.setTheme(theme);
		heelPadsWcLabel.setText("(Heel pads, w/c cushion, offloading)");
		heelPadsWcLabel.setBounds(10, 30, 189, 14);
		panel_5_1_1_14.add(heelPadsWcLabel);

		final JxPanel panel_5_1_1_13 = new JxPanel();
		panel_5_1_1_13.setTheme(theme);
		panel_5_1_1_13.setBounds(1, 527, 305, 50);
		panel_3.add(panel_5_1_1_13);

		panel_5_1_1_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_13.setLayout(null);

		final JxLabel specialBedLabel = new JxLabel();
		specialBedLabel.setTheme(theme);
		specialBedLabel
				.setText("<HTML><U>SPECIAL BED / MATTERSS</U><BR></HTML> ");
		specialBedLabel.setBounds(10, 10, 141, 14);
		panel_5_1_1_13.add(specialBedLabel);

		final JxLabel gelFoamAirLabel = new JxLabel();
		gelFoamAirLabel.setTheme(theme);
		gelFoamAirLabel.setText("(Gel foam, Air, Water, APM, Low Air loss)");
		gelFoamAirLabel.setBounds(10, 30, 221, 14);
		panel_5_1_1_13.add(gelFoamAirLabel);

		final JxPanel panel_5_1_1_19_1 = new JxPanel();
		panel_5_1_1_19_1.setTheme(theme);

		panel_5_1_1_19_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_5_1_1_19_1.setLayout(null);
		panel_5_1_1_19_1.setBounds(1, 794, 305, 29);
		panel_3.add(panel_5_1_1_19_1);

		final JxLabel painManagementLabel_1 = new JxLabel();
		painManagementLabel_1.setTheme(theme);
		painManagementLabel_1.setText("TEAM RECOMMENDATION");
		painManagementLabel_1.setBounds(10, 10, 172, 14);
		panel_5_1_1_19_1.add(painManagementLabel_1);

		final JxPanel panel_4_3 = new JxPanel();
		panel_4_3.setTheme(theme);

		panel_4_3.setBorder(new LineBorder(Color.black, 3, false));
		panel_4_3.setLayout(null);
		panel_4_3.setBounds(726, 0, 140, 824);
		panel_2.add(panel_4_3);

		final JxPanel panel_6_3 = new JxPanel();
		panel_6_3.setTheme(theme);

		panel_6_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_3.setLayout(null);
		panel_6_3.setBounds(0, 1, 139, 24);
		panel_4_3.add(panel_6_3);

		final JxLabel week4Label = new JxLabel();
		week4Label.setTheme(theme);
		week4Label.setText("Current Week");
		week4Label.setBounds(10, 5, 107, 14);
		panel_6_3.add(week4Label);

		final JxPanel panel_6_5_1_1 = new JxPanel();
		panel_6_5_1_1.setTheme(theme);

		panel_6_5_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1.setLayout(null);
		panel_6_5_1_1.setBounds(0, 23, 139, 23);
		panel_4_3.add(panel_6_5_1_1);

		cmbStageWeek = new JxComboBox(new String[] { "", "I", "II", "III",
				"IV", "DTI" });
		cmbStageWeek.setTheme(theme);

		cmbStageWeek.setBounds(10, 2, 122, 18);
		panel_6_5_1_1.add(cmbStageWeek);

		final JxPanel panel_6_5_1_1_1 = new JxPanel();
		panel_6_5_1_1_1.setTheme(theme);

		panel_6_5_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1_1.setLayout(null);
		panel_6_5_1_1_1.setBounds(0, 45, 139, 24);
		panel_4_3.add(panel_6_5_1_1_1);

		txtLengthWeek = new JxText();
		txtLengthWeek.setTheme(theme);
		txtLengthWeek.setBounds(10, 3, 122, 18);
		panel_6_5_1_1_1.add(txtLengthWeek);

		final JxPanel panel_6_5_1_1_1_1 = new JxPanel();
		panel_6_5_1_1_1_1.setTheme(theme);

		panel_6_5_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1_1_1.setLayout(null);
		panel_6_5_1_1_1_1.setBounds(0, 68, 139, 24);
		panel_4_3.add(panel_6_5_1_1_1_1);

		txtWidthWeek = new JxText();
		txtWidthWeek.setTheme(theme);
		txtWidthWeek.setBounds(10, 2, 122, 18);
		panel_6_5_1_1_1_1.add(txtWidthWeek);

		final JxPanel panel_6_5_1_1_1_1_1 = new JxPanel();
		panel_6_5_1_1_1_1_1.setTheme(theme);

		panel_6_5_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1_1_1_1.setLayout(null);
		panel_6_5_1_1_1_1_1.setBounds(0, 90, 139, 24);
		panel_4_3.add(panel_6_5_1_1_1_1_1);

		txtDepthWeek = new JxText();
		txtDepthWeek.setTheme(theme);
		txtDepthWeek.setBounds(10, 4, 122, 18);
		panel_6_5_1_1_1_1_1.add(txtDepthWeek);

		final JxPanel panel_6_5_1_1_1_1_1_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1_1_1_1_1.setLayout(null);
		panel_6_5_1_1_1_1_1_1.setBounds(0, 111, 139, 24);
		panel_4_3.add(panel_6_5_1_1_1_1_1_1);

		txtCurrentApperanceWeek = new JxText();
		txtCurrentApperanceWeek.setTheme(theme);
		txtCurrentApperanceWeek.setBounds(10, 4, 122, 18);
		panel_6_5_1_1_1_1_1_1.add(txtCurrentApperanceWeek);

		final JxPanel panel_6_5_1_1_1_1_1_2 = new JxPanel();
		panel_6_5_1_1_1_1_1_2.setTheme(theme);

		panel_6_5_1_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1_1_1_1_2.setLayout(null);
		panel_6_5_1_1_1_1_1_2.setBounds(0, 134, 139, 114);
		panel_4_3.add(panel_6_5_1_1_1_1_1_2);

		txtTunnelling12Week = new JClockButton();
		txtTunnelling12Week.setBounds(35, 7, 79, 21);
		panel_6_5_1_1_1_1_1_2.add(txtTunnelling12Week);

		txtTunnelling3Week = new JClockButton();
		txtTunnelling3Week.setBounds(35, 35, 79, 21);
		panel_6_5_1_1_1_1_1_2.add(txtTunnelling3Week);

		txtTunnelling6Week = new JClockButton();
		txtTunnelling6Week.setBounds(35, 62, 79, 21);
		panel_6_5_1_1_1_1_1_2.add(txtTunnelling6Week);

		txtTunnelling9Week = new JClockButton();
		txtTunnelling9Week.setBounds(35, 89, 79, 21);
		panel_6_5_1_1_1_1_1_2.add(txtTunnelling9Week);

		final JxLabel label_12 = new JxLabel();
		label_12.setTheme(theme);
		label_12.setText("12 -");
		label_12.setBounds(10, 10, 20, 14);
		panel_6_5_1_1_1_1_1_2.add(label_12);

		final JxLabel label_13 = new JxLabel();
		label_13.setTheme(theme);
		label_13.setText("3 -");
		label_13.setBounds(10, 38, 20, 14);
		panel_6_5_1_1_1_1_1_2.add(label_13);

		final JxLabel label_14 = new JxLabel();
		label_14.setTheme(theme);
		label_14.setText("6 -");
		label_14.setBounds(10, 65, 20, 14);
		panel_6_5_1_1_1_1_1_2.add(label_14);

		final JxLabel label_15 = new JxLabel();
		label_15.setTheme(theme);
		label_15.setText("9 -");
		label_15.setBounds(10, 92, 20, 14);
		panel_6_5_1_1_1_1_1_2.add(label_15);

		final JxPanel panel_6_5_1_1_1_1_1_3 = new JxPanel();
		panel_6_5_1_1_1_1_1_3.setTheme(theme);

		panel_6_5_1_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1_1_1_1_3.setLayout(null);
		panel_6_5_1_1_1_1_1_3.setBounds(0, 247, 139, 50);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3);

		txtUnderminingWeek = new JxText();
		txtUnderminingWeek.setTheme(theme);
		txtUnderminingWeek.setBounds(10, 10, 122, 18);
		panel_6_5_1_1_1_1_1_3.add(txtUnderminingWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1_1_1_1_3_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_1.setBounds(0, 295, 139, 30);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_1);

		txtSloughNecrosisWeek = new JxText();
		txtSloughNecrosisWeek.setTheme(theme);
		txtSloughNecrosisWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_1.add(txtSloughNecrosisWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1_1_1_1_3_2.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2.setBounds(0, 324, 139, 43);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2);

		cmbSloughColorWeek = new JxComboBox(new String[] { "", "Black",
				"Yellow", "Loose", "Firm" });
		cmbSloughColorWeek.setTheme(theme);
		cmbSloughColorWeek.setBounds(10, 10, 122, 18);

		panel_6_5_1_1_1_1_1_3_2.add(cmbSloughColorWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_5_1_1_1_1_1_3_2_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1.setBounds(0, 365, 139, 32);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1);

		txtInflamationWeek = new JxText();
		txtInflamationWeek.setTheme(theme);
		txtInflamationWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_2_1.add(txtInflamationWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_3 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_3.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_3
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_5_1_1_1_1_1_3_3.setLayout(null);
		panel_6_5_1_1_1_1_1_3_3.setBounds(0, 395, 139, 50);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_3);

		cmbDrainageExudateTypeOfWeek = new JxComboBox(new String[] { "",
				"Clear", "Serosanguinous", "Green", "Bloody" });
		cmbDrainageExudateTypeOfWeek.setTheme(theme);
		cmbDrainageExudateTypeOfWeek.setBounds(10, 10, 122, 18);

		panel_6_5_1_1_1_1_1_3_3.add(cmbDrainageExudateTypeOfWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_5_1_1_1_1_1_3_2_1_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1_1.setBounds(0, 443, 139, 30);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1_1);

		cmbAmountOfExudateWeek = new JxComboBox(new String[] { "", "Scant",
				"Moderate", "Cupious" });
		cmbAmountOfExudateWeek.setTheme(theme);
		cmbAmountOfExudateWeek.setBounds(10, 7, 122, 18);

		panel_6_5_1_1_1_1_1_3_2_1_1.add(cmbAmountOfExudateWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1_1_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1_1_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_6_5_1_1_1_1_1_3_2_1_1_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1_1_1.setBounds(0, 471, 139, 30);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1_1_1);

		cmbExudateOdorWeek = new JxComboBox(new String[] { "", "None", "Sweet",
				"Foul" });
		cmbExudateOdorWeek.setTheme(theme);

		cmbExudateOdorWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_2_1_1_1.add(cmbExudateOdorWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1_1_1_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1.setBounds(0, 499, 139, 30);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1_1_1_1);

		txtTurningScheduleWeek = new JxText();
		txtTurningScheduleWeek.setTheme(theme);
		txtTurningScheduleWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1.add(txtTurningScheduleWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1.setBounds(0, 527, 139, 50);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1);

		cmbSpecialBedWeek = new JxComboBox(new String[] { "", "Gel Foam",
				"Air", "Water", "APM", "Low Air Loss" });
		cmbSpecialBedWeek.setTheme(theme);

		cmbSpecialBedWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1.add(cmbSpecialBedWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1.setBounds(0, 575, 139, 50);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1);

		cmbPressureRelievingDeviceWeek = new JxComboBox(new String[] { "",
				"Heel Pads", "W/c Cusions", "Offloading" });
		cmbPressureRelievingDeviceWeek.setTheme(theme);

		cmbPressureRelievingDeviceWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1.add(cmbPressureRelievingDeviceWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1.setBounds(0, 624, 139, 50);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1);

		dcTreatmentOrderDateWeek = new JDateChooser(MedrexClientManager
				.getServerTime());
		dcTreatmentOrderDateWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1.add(dcTreatmentOrderDateWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1.setBounds(0, 672, 139, 50);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1);

		cmbSupplementWeek = new JxComboBox(new String[] { "", "MVI", "Zinc",
				"Vit C", "Prostat", "Juven" });
		cmbSupplementWeek.setTheme(theme);

		cmbSupplementWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1.add(cmbSupplementWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1_1.setBounds(0, 720, 139, 50);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1_1);

		cmbAppetiteFluidIntakeWeek = new JxComboBox(new String[] { "", "Poor",
				"Fair", "Good" });
		cmbAppetiteFluidIntakeWeek.setTheme(theme);

		cmbAppetiteFluidIntakeWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_1_1_1_1_1
				.add(cmbAppetiteFluidIntakeWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2.setBorder(new LineBorder(Color.black,
				1, false));
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2.setBounds(0, 768, 139, 30);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2);

		txtPainManagementWeek = new JxText();
		txtPainManagementWeek.setTheme(theme);
		txtPainManagementWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2.add(txtPainManagementWeek);

		final JxPanel panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2_1 = new JxPanel();
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2_1.setTheme(theme);

		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2_1.setBorder(new LineBorder(
				Color.black, 1, false));
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2_1.setLayout(null);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2_1.setBounds(0, 794, 139, 29);
		panel_4_3.add(panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2_1);

		txtTreatmentRecommedationWeek = new JxText();
		txtTreatmentRecommedationWeek.setTheme(theme);
		txtTreatmentRecommedationWeek.setBounds(10, 7, 122, 18);
		panel_6_5_1_1_1_1_1_3_2_1_1_1_1_2_1.add(txtTreatmentRecommedationWeek);

		doUpdate();
	}

	public void doUpdate() {
		layeredPanel.setLocked(true);
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(resId);
			txtResidentName.setText(rm.getUserName() + " " + rm.getUserPass());
			/* TODO: Migrating to room history */
			// txtRoom.setText(rm.getRoom());
			// txtFloorType.setText(rm.getFloorType());
		} catch (Exception e) {
		}

		if (Global.currentResidentAssessmentFormPage14Key != 0) {
			// ResidentAssessmentFormPage14 rafp14 = null;
			List<ResidentAssessmentFormPage14> rafList = null;

			try {
				rafList = MedrexClientManager.getInstance()
						.getResidentAssessmentFormPage14OfLast3Weeks(
								Global.currentResidenceKey,
								Global.currentResidentAssessmentFormPage14Key);
				// rafp14 = MedrexClientManager.getInstance()
				// .getResidentAssessmentFormPage14(Global.currentResidentAssessmentFormPage14Key);
			} catch (Exception e) {

			}

			if (rafList != null && rafList.size() > 0) {
				ResidentAssessmentFormPage14 rafp14 = rafList.get(0);

				Global.currentResidentAssessmentFormPage14Key = rafp14
						.getSerial();

				cmbStageWeek.setSelectedItem(rafp14.getStageWeek1());
				txtLengthWeek.setText(rafp14.getLengthWeek1());
				txtWidthWeek.setText(rafp14.getWidthWeek1());
				txtDepthWeek.setText(rafp14.getDepthWeek1());
				txtCurrentApperanceWeek.setText(rafp14
						.getCurrentApperanceWeek1());
				txtTunnelling12Week.setText(rafp14.getTunnelling12Week1());
				txtTunnelling3Week.setText(rafp14.getTunnelling3Week1());
				txtTunnelling6Week.setText(rafp14.getTunnelling6Week1());
				txtTunnelling9Week.setText(rafp14.getTunnelling9Week1());
				txtUnderminingWeek.setText(rafp14.getUnderminingWeek1());
				txtSloughNecrosisWeek.setText(rafp14.getSloughNecrosisWeek1());
				cmbSloughColorWeek
						.setSelectedItem(rafp14.getSloughColorWeek1());
				txtInflamationWeek.setText(rafp14.getInflamationWeek1());
				cmbExudateOdorWeek
						.setSelectedItem(rafp14.getExudateOdorWeek1());
				txtTurningScheduleWeek
						.setText(rafp14.getTurningScheduleWeek1());
				cmbSpecialBedWeek.setSelectedItem(rafp14.getSpecialBedWeek1());
				cmbPressureRelievingDeviceWeek.setSelectedItem(rafp14
						.getPressureRelievingDeviceWeek1());
				cmbSupplementWeek.setSelectedItem(rafp14.getSupplementWeek1());
				cmbAppetiteFluidIntakeWeek.setSelectedItem(rafp14
						.getAppetiteFluidIntakeWeek1());
				txtPainManagementWeek.setText(rafp14.getPainManagementWeek1());
				txtTreatmentRecommedationWeek.setText(rafp14
						.getTreatmentRecommedationWeek1());

				txtWoundLocation.setText(rafp14.getWoundLocation());
				dtIdentifiedDate.setDate(rafp14.getIdentifiedDate());
				txtHospitalAcquired.setText(rafp14.getHospitalAcquired());
				txtFacilityAcquired.setText(rafp14.getFacilityAcquired());
				cbPressure.setSelected(rafp14.isPressure());
				cbVenous.setSelected(rafp14.isVenous());
				cbSx.setSelected(rafp14.isSx());
				cbSkinTear.setSelected(rafp14.isSkinTear());
				cbDiabetic.setSelected(rafp14.isDiabetic());
				cbArterial.setSelected(rafp14.isArterial());
				cbOther.setSelected(rafp14.isOthers());
				txtRoom.setText(rafp14.getRoom());
				txtFloorType.setText(rafp14.getFloorType());
				txtResidentName.setText(rafp14.getResidentName());

			}
			if (rafList != null && rafList.size() > 1) {
				ResidentAssessmentFormPage14 ref1 = rafList.get(1);

				cmbStageWeek1.setSelectedItem(ref1.getStageWeek1());
				txtLengthWeek1.setText(ref1.getLengthWeek1());
				txtWidthWeek1.setText(ref1.getWidthWeek1());
				txtDepthWeek1.setText(ref1.getDepthWeek1());
				txtCurrentApperanceWeek1.setText(ref1
						.getCurrentApperanceWeek1());
				txtTunnelling12Week1.setText(ref1.getTunnelling12Week1());
				txtTunnelling3Week1.setText(ref1.getTunnelling3Week1());
				txtTunnelling6Week1.setText(ref1.getTunnelling6Week1());
				txtTunnelling9Week1.setText(ref1.getTunnelling9Week1());
				txtUnderminingWeek1.setText(ref1.getUnderminingWeek1());
				txtSloughNecrosisWeek1.setText(ref1.getSloughNecrosisWeek1());
				cmbSloughColorWeek1.setSelectedItem(ref1.getSloughColorWeek1());
				txtInflamationWeek1.setText(ref1.getInflamationWeek1());
				cmbExudateOdorWeek1.setSelectedItem(ref1.getExudateOdorWeek1());
				txtTurningScheduleWeek1.setText(ref1.getTurningScheduleWeek1());
				cmbSpecialBedWeek1.setSelectedItem(ref1.getSpecialBedWeek1());
				cmbPressureRelievingDeviceWeek1.setSelectedItem(ref1
						.getPressureRelievingDeviceWeek1());
				cmbSupplementWeek1.setSelectedItem(ref1.getSupplementWeek1());
				cmbAppetiteFluidIntakeWeek1.setSelectedItem(ref1
						.getAppetiteFluidIntakeWeek1());
				txtPainManagementWeek1.setText(ref1.getPainManagementWeek1());
				txtTreatmentRecommedationWeek1.setText(ref1
						.getTreatmentRecommedationWeek1());
				cmbDrainageExudateTypeOfWeek1.setSelectedItem(ref1
						.getDrainageExudateTypeOfWeek1());
				cmbAmountOfExudateWeek1.setSelectedItem(ref1
						.getAmountOfExudateWeek1());
			}
			if (rafList != null && rafList.size() > 2) {
				ResidentAssessmentFormPage14 ref2 = rafList.get(2);

				cmbStageWeek2.setSelectedItem(ref2.getStageWeek1());
				txtLengthWeek2.setText(ref2.getLengthWeek1());
				txtWidthWeek2.setText(ref2.getWidthWeek1());
				txtDepthWeek2.setText(ref2.getDepthWeek1());
				txtCurrentApperanceWeek2.setText(ref2
						.getCurrentApperanceWeek1());
				txtTunnelling12Week2.setText(ref2.getTunnelling12Week1());
				txtTunnelling3Week2.setText(ref2.getTunnelling3Week1());
				txtTunnelling6Week2.setText(ref2.getTunnelling6Week1());
				txtTunnelling9Week2.setText(ref2.getTunnelling9Week1());
				txtUnderminingWeek2.setText(ref2.getUnderminingWeek1());
				txtSloughNecrosisWeek2.setText(ref2.getSloughNecrosisWeek1());
				cmbSloughColorWeek2.setSelectedItem(ref2.getSloughColorWeek1());
				txtInflamationWeek2.setText(ref2.getInflamationWeek1());
				cmbExudateOdorWeek2.setSelectedItem(ref2.getExudateOdorWeek1());
				txtTurningScheduleWeek2.setText(ref2.getTurningScheduleWeek1());
				cmbSpecialBedWeek2.setSelectedItem(ref2.getSpecialBedWeek1());
				cmbPressureRelievingDeviceWeek2.setSelectedItem(ref2
						.getPressureRelievingDeviceWeek1());
				cmbSupplementWeek2.setSelectedItem(ref2.getSupplementWeek1());
				cmbAppetiteFluidIntakeWeek2.setSelectedItem(ref2
						.getAppetiteFluidIntakeWeek1());
				txtPainManagementWeek2.setText(ref2.getPainManagementWeek1());
				txtTreatmentRecommedationWeek2.setText(ref2
						.getTreatmentRecommedationWeek1());
				cmbDrainageExudateTypeOfWeek2.setSelectedItem(ref2
						.getDrainageExudateTypeOfWeek1());
				cmbAmountOfExudateWeek2.setSelectedItem(ref2
						.getAmountOfExudateWeek1());
			}
			if (rafList != null && rafList.size() > 3) {
				ResidentAssessmentFormPage14 ref3 = rafList.get(3);

				cmbStageWeek3.setSelectedItem(ref3.getStageWeek1());
				txtLengthWeek3.setText(ref3.getLengthWeek1());
				txtWidthWeek3.setText(ref3.getWidthWeek1());
				txtDepthWeek3.setText(ref3.getDepthWeek1());
				txtCurrentApperanceWeek3.setText(ref3
						.getCurrentApperanceWeek1());
				txtTunnelling12Week3.setText(ref3.getTunnelling12Week1());
				txtTunnelling3Week3.setText(ref3.getTunnelling3Week1());
				txtTunnelling6Week3.setText(ref3.getTunnelling6Week1());
				txtTunnelling9Week3.setText(ref3.getTunnelling9Week1());
				txtUnderminingWeek3.setText(ref3.getUnderminingWeek1());
				txtSloughNecrosisWeek3.setText(ref3.getSloughNecrosisWeek1());
				cmbSloughColorWeek3.setSelectedItem(ref3.getSloughColorWeek1());
				txtInflamationWeek3.setText(ref3.getInflamationWeek1());
				cmbExudateOdorWeek3.setSelectedItem(ref3.getExudateOdorWeek1());
				txtTurningScheduleWeek3.setText(ref3.getTurningScheduleWeek1());
				cmbSpecialBedWeek3.setSelectedItem(ref3.getSpecialBedWeek1());
				cmbPressureRelievingDeviceWeek3.setSelectedItem(ref3
						.getPressureRelievingDeviceWeek1());
				cmbSupplementWeek3.setSelectedItem(ref3.getSupplementWeek1());
				cmbAppetiteFluidIntakeWeek3.setSelectedItem(ref3
						.getAppetiteFluidIntakeWeek1());
				txtPainManagementWeek3.setText(ref3.getPainManagementWeek1());
				txtTreatmentRecommedationWeek3.setText(ref3
						.getTreatmentRecommedationWeek1());
				cmbDrainageExudateTypeOfWeek3.setSelectedItem(ref3
						.getDrainageExudateTypeOfWeek1());
				cmbAmountOfExudateWeek3.setSelectedItem(ref3
						.getAmountOfExudateWeek1());
			}
			/*
			 * txtStageWeek4.setText(rafp14.getStageWeek4());
			 * txtLengthWeek4.setText(rafp14.getLengthWeek4());
			 * txtWidthWeek4.setText(rafp14.getWidthWeek4());
			 * txtDepthWeek4.setText(rafp14.getDepthWeek4());
			 * txtCurrentApperanceWeek4
			 * .setText(rafp14.getCurrentApperanceWeek4());
			 * txtTunnelling12Week4.setText(rafp14.getTunnelling12Week4());
			 * txtTunnelling3Week4.setText(rafp14.getTunnelling3Week4());
			 * txtTunnelling6Week4.setText(rafp14.getTunnelling6Week4());
			 * txtTunnelling9Week4.setText(rafp14.getTunnelling9Week4());
			 * txtUnderminingWeek4.setText(rafp14.getUnderminingWeek4());
			 * txtSloughNecrosisWeek4.setText(rafp14.getSloughNecrosisWeek4());
			 * txtSloughColorWeek4.setText(rafp14.getSloughColorWeek4());
			 * txtInflamationWeek4.setText(rafp14.getInflamationWeek4());
			 * txtExudateOdorWeek4.setText(rafp14.getExudateOdorWeek4());
			 * txtTurningScheduleWeek4
			 * .setText(rafp14.getTurningScheduleWeek4());
			 * txtSpecialBedWeek4.setText(rafp14.getSpecialBedWeek4());
			 * txtPressureRelievingDeviceWeek4
			 * .setText(rafp14.getPressureRelievingDeviceWeek4());
			 * txtSupplementWeek4.setText(rafp14.getSupplementWeek4());
			 * txtAppetiteFluidIntakeWeek4
			 * .setText(rafp14.getAppetiteFluidIntakeWeek4());
			 * txtPainManagementWeek4.setText(rafp14.getPainManagementWeek4());
			 * txtTreatmentRecommedationWeek4
			 * .setText(rafp14.getTreatmentRecommedationWeek4());
			 */

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
				txtFloorType.setText(roomHist.getFloor());
			}
		}
	}

	public int doSave() {
		ResidentAssessmentFormPage14 residentAssessmentFormPage14 = new ResidentAssessmentFormPage14();

		residentAssessmentFormPage14
				.setSerial(Global.currentResidentAssessmentFormPage14Key);
		residentAssessmentFormPage14
				.setFormId(Global.currentResidentAssessmentFormKey);
		residentAssessmentFormPage14.setResidentName(txtResidentName.getText());
		residentAssessmentFormPage14.setRoom(txtRoom.getText());
		residentAssessmentFormPage14.setFloorType(txtFloorType.getText());
		residentAssessmentFormPage14.setWoundLocation(txtWoundLocation
				.getText());
		residentAssessmentFormPage14.setIdentifiedDate(dtIdentifiedDate
				.getDate());
		residentAssessmentFormPage14.setHospitalAcquired(txtHospitalAcquired
				.getText());
		residentAssessmentFormPage14.setFacilityAcquired(txtFacilityAcquired
				.getText());
		residentAssessmentFormPage14.setPressure(cbPressure.isSelected());
		residentAssessmentFormPage14.setVenous(cbVenous.isSelected());
		residentAssessmentFormPage14.setSx(cbSx.isSelected());
		residentAssessmentFormPage14.setSkinTear(cbSkinTear.isSelected());
		residentAssessmentFormPage14.setDiabetic(cbDiabetic.isSelected());
		residentAssessmentFormPage14.setArterial(cbArterial.isSelected());
		residentAssessmentFormPage14.setOthers(cbOther.isSelected());

		residentAssessmentFormPage14.setStageWeek1(cmbStageWeek
				.getSelectedItem().toString());
		residentAssessmentFormPage14.setLengthWeek1(txtLengthWeek.getText());
		residentAssessmentFormPage14.setWidthWeek1(txtWidthWeek.getText());
		residentAssessmentFormPage14.setDepthWeek1(txtDepthWeek.getText());
		residentAssessmentFormPage14
				.setCurrentApperanceWeek1(txtCurrentApperanceWeek.getText());
		residentAssessmentFormPage14.setTunnelling12Week1(txtTunnelling12Week
				.getText());
		residentAssessmentFormPage14.setTunnelling3Week1(txtTunnelling3Week
				.getText());
		residentAssessmentFormPage14.setTunnelling6Week1(txtTunnelling6Week
				.getText());
		residentAssessmentFormPage14.setTunnelling9Week1(txtTunnelling9Week
				.getText());
		residentAssessmentFormPage14.setUnderminingWeek1(txtUnderminingWeek
				.getText());
		residentAssessmentFormPage14
				.setSloughNecrosisWeek1(txtSloughNecrosisWeek.getText());
		residentAssessmentFormPage14.setSloughColorWeek1(cmbSloughColorWeek
				.getSelectedItem().toString());
		residentAssessmentFormPage14.setInflamationWeek1(txtInflamationWeek
				.getText());
		residentAssessmentFormPage14.setExudateOdorWeek1(cmbExudateOdorWeek
				.getSelectedItem().toString());
		residentAssessmentFormPage14
				.setTurningScheduleWeek1(txtTurningScheduleWeek.getText());
		residentAssessmentFormPage14.setSpecialBedWeek1(cmbSpecialBedWeek
				.getSelectedItem().toString());
		residentAssessmentFormPage14
				.setPressureRelievingDeviceWeek1(cmbPressureRelievingDeviceWeek
						.getSelectedItem().toString());
		residentAssessmentFormPage14.setSupplementWeek1(cmbSupplementWeek
				.getSelectedItem().toString());
		residentAssessmentFormPage14
				.setAppetiteFluidIntakeWeek1(cmbAppetiteFluidIntakeWeek
						.getSelectedItem().toString());
		residentAssessmentFormPage14
				.setDrainageExudateTypeOfWeek1(cmbDrainageExudateTypeOfWeek
						.getSelectedItem().toString());
		residentAssessmentFormPage14
				.setAmountOfExudateWeek1(cmbAmountOfExudateWeek
						.getSelectedItem().toString());
		residentAssessmentFormPage14
				.setPainManagementWeek1(txtPainManagementWeek.getText());
		residentAssessmentFormPage14
				.setTreatmentRecommedationWeek1(txtTreatmentRecommedationWeek
						.getText());

		/*
		 * residentAssessmentFormPage14.setStageWeek2(txtStageWeek2.getText());
		 * residentAssessmentFormPage14
		 * .setLengthWeek2(txtLengthWeek2.getText());
		 * residentAssessmentFormPage14.setWidthWeek2(txtWidthWeek2.getText());
		 * residentAssessmentFormPage14.setDepthWeek2(txtDepthWeek2.getText());
		 * residentAssessmentFormPage14
		 * .setCurrentApperanceWeek2(txtCurrentApperanceWeek2.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling12Week2(txtTunnelling12Week2.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling3Week2(txtTunnelling3Week2.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling6Week2(txtTunnelling6Week2.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling9Week2(txtTunnelling9Week2.getText());
		 * residentAssessmentFormPage14
		 * .setUnderminingWeek2(txtUnderminingWeek2.getText());
		 * residentAssessmentFormPage14
		 * .setSloughNecrosisWeek2(txtSloughNecrosisWeek2.getText());
		 * residentAssessmentFormPage14
		 * .setSloughColorWeek2(txtSloughColorWeek2.getText());
		 * residentAssessmentFormPage14
		 * .setInflamationWeek2(txtInflamationWeek2.getText());
		 * residentAssessmentFormPage14
		 * .setExudateOdorWeek2(txtExudateOdorWeek2.getText());
		 * residentAssessmentFormPage14
		 * .setTurningScheduleWeek2(txtTurningScheduleWeek2.getText());
		 * residentAssessmentFormPage14
		 * .setSpecialBedWeek2(txtSpecialBedWeek2.getText());
		 * residentAssessmentFormPage14
		 * .setPressureRelievingDeviceWeek2(txtPressureRelievingDeviceWeek2
		 * .getText());
		 * residentAssessmentFormPage14.setSupplementWeek2(txtSupplementWeek2
		 * .getText());
		 * residentAssessmentFormPage14.setAppetiteFluidIntakeWeek2(
		 * txtAppetiteFluidIntakeWeek2.getText());
		 * residentAssessmentFormPage14.setPainManagementWeek2
		 * (txtPainManagementWeek2.getText());
		 * residentAssessmentFormPage14.setTreatmentRecommedationWeek2
		 * (txtTreatmentRecommedationWeek2.getText());
		 * 
		 * residentAssessmentFormPage14.setStageWeek3(txtStageWeek3.getText());
		 * residentAssessmentFormPage14
		 * .setLengthWeek3(txtLengthWeek3.getText());
		 * residentAssessmentFormPage14.setWidthWeek3(txtWidthWeek3.getText());
		 * residentAssessmentFormPage14.setDepthWeek3(txtDepthWeek3.getText());
		 * residentAssessmentFormPage14
		 * .setCurrentApperanceWeek3(txtCurrentApperanceWeek3.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling12Week3(txtTunnelling12Week3.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling3Week3(txtTunnelling3Week3.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling6Week3(txtTunnelling6Week3.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling9Week3(txtTunnelling9Week3.getText());
		 * residentAssessmentFormPage14
		 * .setUnderminingWeek3(txtUnderminingWeek3.getText());
		 * residentAssessmentFormPage14
		 * .setSloughNecrosisWeek3(txtSloughNecrosisWeek3.getText());
		 * residentAssessmentFormPage14
		 * .setSloughColorWeek3(txtSloughColorWeek3.getText());
		 * residentAssessmentFormPage14
		 * .setInflamationWeek3(txtInflamationWeek3.getText());
		 * residentAssessmentFormPage14
		 * .setExudateOdorWeek3(txtExudateOdorWeek3.getText());
		 * residentAssessmentFormPage14
		 * .setTurningScheduleWeek3(txtTurningScheduleWeek3.getText());
		 * residentAssessmentFormPage14
		 * .setSpecialBedWeek3(txtSpecialBedWeek3.getText());
		 * residentAssessmentFormPage14
		 * .setPressureRelievingDeviceWeek3(txtPressureRelievingDeviceWeek3
		 * .getText());
		 * residentAssessmentFormPage14.setSupplementWeek3(txtSupplementWeek3
		 * .getText());
		 * residentAssessmentFormPage14.setAppetiteFluidIntakeWeek3(
		 * txtAppetiteFluidIntakeWeek3.getText());
		 * residentAssessmentFormPage14.setPainManagementWeek3
		 * (txtPainManagementWeek3.getText());
		 * residentAssessmentFormPage14.setTreatmentRecommedationWeek3
		 * (txtTreatmentRecommedationWeek3.getText());
		 * 
		 * residentAssessmentFormPage14.setStageWeek4(txtStageWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setLengthWeek4(txtLengthWeek4.getText());
		 * residentAssessmentFormPage14.setWidthWeek4(txtWidthWeek4.getText());
		 * residentAssessmentFormPage14.setDepthWeek4(txtDepthWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setCurrentApperanceWeek4(txtCurrentApperanceWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling12Week4(txtTunnelling12Week3.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling3Week4(txtTunnelling3Week4.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling6Week4(txtTunnelling6Week4.getText());
		 * residentAssessmentFormPage14
		 * .setTunnelling9Week4(txtTunnelling9Week4.getText());
		 * residentAssessmentFormPage14
		 * .setUnderminingWeek4(txtUnderminingWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setSloughNecrosisWeek4(txtSloughNecrosisWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setSloughColorWeek4(txtSloughColorWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setInflamationWeek4(txtInflamationWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setExudateOdorWeek4(txtExudateOdorWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setTurningScheduleWeek4(txtTurningScheduleWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setSpecialBedWeek4(txtSpecialBedWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setPressureRelievingDeviceWeek4(txtPressureRelievingDeviceWeek4
		 * .getText());
		 * residentAssessmentFormPage14.setSupplementWeek4(txtSupplementWeek4
		 * .getText());
		 * residentAssessmentFormPage14.setAppetiteFluidIntakeWeek4(
		 * txtAppetiteFluidIntakeWeek4.getText());
		 * residentAssessmentFormPage14.setPainManagementWeek4
		 * (txtPainManagementWeek4.getText());
		 * residentAssessmentFormPage14.setTreatmentRecommedationWeek4
		 * (txtTreatmentRecommedationWeek4.getText());
		 * residentAssessmentFormPage14
		 * .setResidentName(txtResidentName.getText());
		 */

		/* TODO new master table for wound assessment has to be created */

		residentAssessmentFormPage14.setDateOfCreation(MedrexClientManager
				.getServerTime());
		residentAssessmentFormPage14.setFormName("Wound Assessment Form");
		residentAssessmentFormPage14.setResidentId(Global.currentResidenceKey);
		try {
			residentAssessmentFormPage14.setUser(MedrexClientManager
					.getInstance().getUser(Global.currentLoggedInUserKey));
		} catch (Exception e1) {

		}
		try {
			Global.currentResidentAssessmentFormPage14Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage14(
							residentAssessmentFormPage14);
			return (0);
		} catch (Exception e) {
			return (0);
		}

	}

	public void doLoad() {

	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtResidentName, "Resident Name", 0, 25))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation
				.isNonEmptyAlphaField(txtWoundLocation,
						"Location of the wound", 0, 25))) {
			vRes.addAllFrom(temp);
		}

		// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Resident Assessment Form: Page 14");
			return false;
		} else {
			return true;
		}
	}

	public static void main(String ar[]) {
		SwingUtils.wrapInDialog(new PanelResidentAssessmentFormPage14())
				.setVisible(true);
	}
}
