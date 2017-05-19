package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiets;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.PhysicianOrderEnteralProtocol;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.RoomHistory;

import com.sX.swing.JxButton;
import com.toedter.calendar.JDateChooser;

import com.sX.swing.JxButton;
import com.sX.swing.JxLabel;
import com.sX.swing.JxText;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxTextA;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.BlueOverWhiteTheme;
import com.sX.theme.Theme;


public class PanelEnteralProtocol extends PopUpView implements Form{

	private JxLabel lblAddmissionDate;
	private JxLabel lblDOB;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2179484552825229617L;
	private JxText txtPlacement_1;
	private JxDateChooser dcDOB_1;
	private JxCheckBox mayNotReplaceCheckBox;
	private JxCheckBox mayCheckBox;
	private JxText txtTotalNutrient_1;
	private JxText txtFeedingFrequencyTimesPerDay_1;
	private JxText txtFeeding_1;
	private JxCheckBox cbBolus_1;
	private JxCheckBox cbGravity_1;
	private JxCheckBox cbPump_1;
	
	private JxCheckBox cbJ_T;
	private JxCheckBox cbPeg_1;
	private JxCheckBox cbG_T;
	private JxCheckBox cbN_G;
	private JxText txtResidualMLNotifyMD;
	private JxText txtFeedingFor;
	private JxText txtResidualML;
	private JxText txtCheckForResidual;
	private JxText txtFlushBetweenMedication;
	private JxText txtFlushBefore_AfterMedication;
	private JxText txtFlushHours;
	private JxText txtFlushML;
	private JxText txtFeedingFrequencyHoursPerDay;
	private JxText txtFeedingFrequencyMLPerHour;
	private JxText txtBolusViaPumpRatePerHour;
	private JxText txtBolusViaPumpML;
	private JxText txtTotalCalories;
	private JxText txtTimeUp;
	// private JxText txtTimeDown;
	private JxText txtCleanseSiteWith;
	private JxText txtCleanseSite;
	private JxText txtChangeEquipment;
	private JxText txtChangeFeeding;
	private JxText txtTubeSize;
	private JxText txtTubeFeeding;
	private JxText txtAllergyHistory3;
	private JxText txtAllergyHistory2;
	private JxText txtAllergyHistory1;
	private JxText txtDiagnosis3;
	private JxText txtDiagnosis2;
	private JxText txtDiagnosis1;
	private JxText txtHeight;
	private JxText txtWeight;
	private JxText txtPhysicianLastName;
	private JxText txtPhysicianFirstName;
	// private JxText dcDOB;
	private JxText txtUnit_Room;
	private JxText txtFacilityName;
	private JxText txtMonth_Year;
	private JxLabel lblLastName;
	private JxLabel lblFirstName;
	private JxText txtNotedByDetails;
	private JxText txtPhysicianSign;
	private JxText txtNurseSign;
	private JxDateChooser dcNotedBy;
	private JxDateChooser dcPhysician;
	private JxDateChooser dcNurse;
	private JxText txtNotedByTime;
	private JxText txtPhysicianTime;
	private JxText txtNurseTime;
	private JxText txtOB;
	private JxText txtotedBy;
	private JxText txthysician;
	private JxText txturse;
	private JxCheckBox cbPeg;
	private JxCheckBox cbPump;
	private JxCheckBox cbGravity;
	private JxCheckBox cbBolus;
	private JxText txtFeeding;
	private JxText txtFeedingFrequencyTimesPerDay;
	private JxText txtTotalNutrient;
	private JxCheckBox cbyCheckBox;
	private JxCheckBox cbyNotReplaceCheckBox;
	private JxText txtPlacement;
	private JxText txttArea;
	private JxText textArea;
	
	Theme theme = new BlueOverWhiteTheme();
	public static int currentGTubeKey;

	/**
	 * @param args
	 */
	// public static void main(String[] args) {
	// try {
	// UIManager
	// .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	// UIManager
	// .setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
	// } catch (ClassNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (InstantiationException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (IllegalAccessException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (UnsupportedLookAndFeelException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//		
	// // UIManager.put("F")
	// JFrame frm = new JFrame();
	// JScrollPane scroll = new JScrollPane();
	// PanelEnteralProtocol t = new PanelEnteralProtocol();
	// scroll.setViewportView(t);
	// frm.getContentPane().add(scroll);
	// frm.setSize(940, 900);
	// frm.setVisible(true);
	//		
	//
	// }
	public PanelEnteralProtocol() {
		super();
		Global.panelEnteralProtocol = this;
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(new Dimension(960, 700));
		setPreferredSize(new Dimension(960, 1000));

		JScrollPane scroll = new JScrollPane();
		scroll.setBackground(Color.WHITE);
		scroll.setBounds(0, 0, 955, 990);
		add(scroll);
		
		final JxPanel panel = new JxPanel();
		scroll.setCorner(JScrollPane.LOWER_LEFT_CORNER, panel);
		scroll.setViewportView(panel);
		panel.setTheme (theme);
        panel.setFontSize(12);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(955, 1300));

		// panel.setBounds(0, 0, 1000, 1080);

		

		final JxLabel enteralProtocolLabel = new JxLabel();
		enteralProtocolLabel.setTheme (theme);
		//enteralProtocolLabel.setForeground(new Color(128, 128, 128));

enteralProtocolLabel.setFontSize(12);
enteralProtocolLabel.setFontStyle(Font.BOLD);
enteralProtocolLabel.setFontSize(18);
		enteralProtocolLabel.setBounds(363, 10, 244, 16);
		enteralProtocolLabel.setText("ENTERAL PROTOCOL");
		panel.add(enteralProtocolLabel);

		/*final JxLabel specialtyRxLabel = new JxLabel();
		specialtyRxLabel.setTheme (theme);
		specialtyRxLabel.setForeground(new Color(128, 128, 128));

specialtyRxLabel.setFontSize(14);
specialtyRxLabel.setFontStyle(Font.BOLD);
		specialtyRxLabel.setText("Specialty RX");
		specialtyRxLabel.setBounds(834, 11, 88, 16);
		panel.add(specialtyRxLabel);*/

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme (theme);
		//panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 32, 933, 927);
		panel.add(panel_1);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme (theme);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 10, 912, 49);
		panel_1.add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme (theme);
		panel_3.setLayout(null);

		panel_3.setBounds(0, 0, 912, 29);
		//panel_2.add(panel_3);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setTheme (theme);

		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 456, 29);
		panel_3.add(panel_5);

		final JxLabel residentNameLabel = new JxLabel();
		residentNameLabel.setTheme (theme);

		residentNameLabel.setText("Resident Name:");
		residentNameLabel.setBounds(10, 5, 89, 20);
		panel_5.add(residentNameLabel);

		final JxLabel lastLabel = new JxLabel();
		lastLabel.setTheme (theme);

		lastLabel.setText("(Last/First)");
		lastLabel.setBounds(105, 5, 56, 20);
		panel_5.add(lastLabel);

		ResidentMain residentMain = null;
		try {
			residentMain = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (MedrexException e1) {
			e1.printStackTrace();
		}

		lblFirstName = new JxLabel();
		lblFirstName.setText("");
		lblFirstName.setTheme (theme);
		lblFirstName.setBounds(200, 5, 110, 20);
		lblFirstName.setText(residentMain.getUserName());
		lblFirstName.setFontStyle(Font.BOLD);
		panel_5.add(lblFirstName);

		lblLastName = new JxLabel();
		lblLastName.setText("");
		lblLastName.setTheme (theme);
		lblLastName.setBounds(315, 5, 110, 20);
		lblLastName.setText(residentMain.getUserPass());
		lblLastName.setFontStyle(Font.BOLD);
		panel_5.add(lblLastName);

		final JxPanel panel_6 = new JxPanel();
		panel_6.setTheme (theme);
		panel_6.setLayout(null);

		panel_6.setBounds(455, 0, 230, 29);
		panel_3.add(panel_6);

		final JxLabel admissionLabel = new JxLabel();
		admissionLabel.setTheme (theme);

		admissionLabel.setText("Admission #");
		admissionLabel.setBounds(10, 7, 66, 20);
		panel_6.add(admissionLabel);

		lblAddmissionDate = new JxLabel();
		lblAddmissionDate.setTheme(theme);
		lblAddmissionDate.setFontStyle(Font.BOLD);
		//lblAddmissionDate.setText("");
		if(residentMain.getAdmittedOn() != null){
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		lblAddmissionDate.setText("" + sdf.format(residentMain.getAdmittedOn()));}
		lblAddmissionDate.setBounds(75, 8, 110, 20);
		panel_6.add(lblAddmissionDate);

		final JxPanel panel_7 = new JxPanel();
		panel_7.setTheme (theme);

		panel_7.setLayout(null);
		panel_7.setBounds(684, 0, 228, 29);
		panel_3.add(panel_7);

		final JxLabel monthyearLabel = new JxLabel();
		monthyearLabel.setTheme (theme);

		monthyearLabel.setText("Month/Year");
		monthyearLabel.setBounds(20, 7, 56, 20);
		panel_7.add(monthyearLabel);

		txtMonth_Year = new JxText();
		txtMonth_Year.setTheme (theme);
		txtMonth_Year.setBounds(80, 5, 131, 20);
		panel_7.add(txtMonth_Year);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme (theme);
		panel_4.setLayout(null);

		panel_4.setBounds(0, 29, 912, 29);
		//panel_2.add(panel_4);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setTheme (theme);
		panel_8.setLayout(null);

		panel_8.setBounds(0, 0, 456, 29);
		panel_4.add(panel_8);

		final JxLabel facilityNameLabel = new JxLabel();
		facilityNameLabel.setTheme (theme);

		facilityNameLabel.setBounds(10, 7, 80, 20);
		panel_8.add(facilityNameLabel);
		facilityNameLabel.setText("Facility Name:");

		txtFacilityName = new JxText();
		txtFacilityName.setTheme (theme);
		txtFacilityName.setBounds(96, 5, 327, 20);
		panel_8.add(txtFacilityName);

		final JxPanel panel_9 = new JxPanel();
		panel_9.setTheme (theme);
		panel_9.setLayout(null);

		panel_9.setBounds(455, 0, 230, 29);
		panel_4.add(panel_9);

		final JxLabel unitroomLabel = new JxLabel();
		unitroomLabel.setTheme (theme);

		unitroomLabel.setBounds(10, 7, 66, 20);
		panel_9.add(unitroomLabel);
		unitroomLabel.setText("Unit/Room");

		txtUnit_Room = new JxText();
		txtUnit_Room.setTheme (theme);
		txtUnit_Room.setBounds(71, 5, 131, 20);
		new RoomHistory();
		panel_9.add(txtUnit_Room);

		final JxPanel panel_10 = new JxPanel();
		panel_10.setTheme (theme);
		panel_10.setLayout(null);

		panel_10.setBounds(684, 0, 228, 29);
		panel_4.add(panel_10);

		final JxLabel dobLabel = new JxLabel();
		dobLabel.setTheme (theme);

		dobLabel.setBounds(20, 5, 66, 20);
		dobLabel.setText("DOB");
		panel_10.add(dobLabel);		

		lblDOB = new JxLabel();
		lblDOB.setTheme(theme);
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		lblDOB.setText(sdf1.format(residentMain.getDob()));
		//lblDOB.setText("");
		lblDOB.setFontStyle(Font.BOLD);
		lblDOB.setBounds(80, 5, 131, 20);
		panel_10.add(lblDOB);

		final JxPanel panel_11 = new JxPanel();
		panel_11.setTheme (theme);
		panel_11.setLayout(null);

		panel_11.setBounds(0, 58, 912, 29);
		//panel_2.add(panel_11);

		final JxPanel panel_12 = new JxPanel();
		panel_12.setTheme (theme);

		panel_12.setLayout(null);
		panel_12.setBounds(0, 0, 456, 29);
		//panel_11.add(panel_12);

		final JxLabel attendingPhysicianLabel = new JxLabel();
		attendingPhysicianLabel.setTheme (theme);

				//9));
		attendingPhysicianLabel.setText("Attending Physician:");
		attendingPhysicianLabel.setBounds(10, 7, 101, 20);
		panel_12.add(attendingPhysicianLabel);

		final JxLabel firstLabel = new JxLabel();
		firstLabel.setTheme (theme);

		firstLabel.setText("(Last/First)");
		firstLabel.setBounds(117, 7, 64, 20);
		panel_12.add(firstLabel);

		txtPhysicianFirstName = new JxText();
		txtPhysicianFirstName.setTheme (theme);
		txtPhysicianFirstName.setBounds(200, 5, 109, 20);
		panel_12.add(txtPhysicianFirstName);

		txtPhysicianLastName = new JxText();
		txtPhysicianLastName.setTheme (theme);
		txtPhysicianLastName.setBounds(315, 7, 109, 20);
		panel_12.add(txtPhysicianLastName);

		final JxPanel panel_13 = new JxPanel();
		panel_13.setBounds(0, 10, 231, 29);
		panel_2.add(panel_13);
		panel_13.setTheme (theme);

		panel_13.setLayout(null);

		final JxLabel weightLabel = new JxLabel();
		weightLabel.setTheme (theme);

		weightLabel.setText("Weight");
		weightLabel.setBounds(10, 7, 40, 20);
		panel_13.add(weightLabel);

		txtWeight = new JxText();
		txtWeight.setTheme (theme);
		txtWeight.setBounds(71, 5, 131, 20);
		panel_13.add(txtWeight);

		final JxPanel panel_14 = new JxPanel();
		panel_14.setBounds(444, 10, 231, 29);
		panel_2.add(panel_14);
		panel_14.setTheme (theme);

		panel_14.setLayout(null);

		final JxLabel heightLabel = new JxLabel();
		heightLabel.setTheme (theme);

		heightLabel.setText("Height");
		heightLabel.setBounds(23, 7, 35, 20);
		panel_14.add(heightLabel);

		txtHeight = new JxText();
		txtHeight.setTheme (theme);
		txtHeight.setBounds(83, 5, 131, 20);
		panel_14.add(txtHeight);

		final JxPanel panel_15 = new JxPanel();
		panel_15.setTheme (theme);

		panel_15.setLayout(null);
		panel_15.setBounds(10, 98, 912, 90);
		panel_1.add(panel_15);

		final JxPanel panel_16 = new JxPanel();
		panel_16.setTheme (theme);

		panel_16.setLayout(null);
		panel_16.setBounds(0, 0, 456, 86);
		panel_15.add(panel_16);

		final JxPanel panel_19 = new JxPanel();
		panel_19.setTheme (theme);

		panel_19.setLayout(null);
		panel_19.setBounds(0, 0, 456, 29);
		//panel_16.add(panel_19);

		final JxPanel panel_20 = new JxPanel();
		panel_20.setTheme (theme);

		panel_20.setLayout(null);
		panel_20.setBounds(0, 29, 456, 29);
		panel_16.add(panel_20);

		txtDiagnosis2 = new JxText();
		txtDiagnosis2.setBounds(0, 0, 457, 30);
		panel_20.add(txtDiagnosis2);
		txtDiagnosis2.setTheme (theme);

		final JxPanel panel_21 = new JxPanel();
		panel_21.setTheme (theme);

		panel_21.setLayout(null);
		panel_21.setBounds(0, 58, 456, 29);
		panel_16.add(panel_21);

		txtDiagnosis3 = new JxText();
		txtDiagnosis3.setBounds(0, 0, 457, 27);
		panel_21.add(txtDiagnosis3);
		txtDiagnosis3.setTheme (theme);

		final JxPanel panel_22 = new JxPanel();
		panel_22.setTheme (theme);

		panel_22.setLayout(null);
		panel_22.setBounds(0, 87, 456, 29);
		//panel_16.add(panel_22);

		txtDiagnosis1 = new JxText();
		txtDiagnosis1.setBounds(0, 0, 457, 30);
		panel_16.add(txtDiagnosis1);
		txtDiagnosis1.setTheme (theme);

		final JxPanel panel_17 = new JxPanel();
		panel_17.setTheme (theme);

		panel_17.setLayout(null);
		panel_17.setBounds(456, 0, 456, 86);
		panel_15.add(panel_17);

		final JxPanel panel_23 = new JxPanel();
		panel_23.setTheme (theme);

		panel_23.setLayout(null);
		panel_23.setBounds(0, 0, 456, 29);
		panel_17.add(panel_23);

		txtAllergyHistory1 = new JxText();
		txtAllergyHistory1.setBounds(0, 0, 450, 30);
		panel_23.add(txtAllergyHistory1);
		txtAllergyHistory1.setTheme (theme);

		final JxPanel panel_24 = new JxPanel();
		panel_24.setTheme (theme);

		panel_24.setLayout(null);
		panel_24.setBounds(0, 29, 456, 29);
		panel_17.add(panel_24);

		txtAllergyHistory2 = new JxText();
		txtAllergyHistory2.setBounds(0, 0, 450, 30);
		panel_24.add(txtAllergyHistory2);
		txtAllergyHistory2.setTheme (theme);

		final JxPanel panel_25 = new JxPanel();
		panel_25.setTheme (theme);
		panel_25.setLayout(null);

		panel_25.setBounds(0, 58, 456, 29);
		panel_17.add(panel_25);

		txtAllergyHistory3 = new JxText();
		txtAllergyHistory3.setBounds(0, 0, 450, 27);
		panel_25.add(txtAllergyHistory3);
		txtAllergyHistory3.setTheme (theme);

		final JxPanel panel_26 = new JxPanel();
		panel_26.setTheme (theme);

		panel_26.setLayout(null);
		panel_26.setBounds(0, 87, 456, 29);

		final JxPanel panel_27 = new JxPanel();
		panel_27.setTheme (theme);

		panel_27.setLayout(null);
		panel_27.setBounds(10, 243, 912, 425);
		panel_1.add(panel_27);

		final JxPanel panel_28 = new JxPanel();
		panel_28.setTheme (theme);
		panel_28.setBackground(Color.LIGHT_GRAY);
		panel_28.setLayout(null);
		panel_28.setBounds(0, 0, 456, 425);
		panel_27.add(panel_28);

		final JxPanel panel_30 = new JxPanel();
		panel_30.setTheme (theme);
		panel_30.setOpaque(false);
		//panel_30.setBackground(Color.LIGHT_GRAY);
		panel_30.setLayout(null);
		panel_30.setBounds(0, 0, 456, 110);
		panel_28.add(panel_30);

		final JxLabel tubeFeedingMethodLabel = new JxLabel();
		tubeFeedingMethodLabel.setTheme (theme);

tubeFeedingMethodLabel.setFontStyle(Font.BOLD);
		tubeFeedingMethodLabel.setText("TUBE FEEDING METHOD:");
		tubeFeedingMethodLabel.setBounds(10, 10, 151, 14);
		panel_30.add(tubeFeedingMethodLabel);

		cbN_G = new JxCheckBox();
		cbN_G.setTheme (theme);
		cbN_G.setOpaque(false);


		cbN_G.setText("N/G");
		cbN_G.setBounds(20, 30, 80, 20);
		panel_30.add(cbN_G);

		cbG_T = new JxCheckBox();
		cbG_T.setTheme (theme);

		cbG_T.setOpaque(false);
		cbG_T.setText("G/T");
		cbG_T.setBounds(20, 50, 80, 20);
		panel_30.add(cbG_T);

		cbPeg = new JxCheckBox();
		cbPeg.setTheme (theme);

		cbPeg.setOpaque(false);
		cbPeg.setText("PEG");
		cbPeg.setBounds(20, 70, 80, 20);
		panel_30.add(cbPeg);

		cbJ_T = new JxCheckBox();
		cbJ_T.setTheme (theme);

		cbJ_T.setOpaque(false);
		cbJ_T.setText("J/T");
		cbJ_T.setBounds(20, 90, 80, 20);
		panel_30.add(cbJ_T);

		cbPump = new JxCheckBox();
		cbPump.setTheme (theme);

		cbPump.setOpaque(false);
		cbPump.setText("Pump");
		cbPump.setBounds(133, 30, 80, 20);
		panel_30.add(cbPump);

		cbGravity = new JxCheckBox();
		cbGravity.setTheme (theme);

		cbGravity.setOpaque(false);
		cbGravity.setText("Gravity");
		cbGravity.setBounds(133, 50, 80, 20);
		panel_30.add(cbGravity);

		cbBolus = new JxCheckBox();
		cbBolus.setTheme (theme);

		cbBolus.setOpaque(false);
		cbBolus.setText("Bolus");
		cbBolus.setBounds(133, 70, 80, 20);
		panel_30.add(cbBolus);

		final JxPanel panel_31 = new JxPanel();
		panel_31.setTheme (theme);
		panel_31.setLayout(null);
		panel_31.setOpaque(false);
		panel_31.setBounds(0, 110, 456, 183);
		panel_28.add(panel_31);

		final JxLabel feedingFrequencyLabel = new JxLabel();
		feedingFrequencyLabel.setTheme (theme);

feedingFrequencyLabel.setFontStyle(Font.BOLD);
		feedingFrequencyLabel.setText("FEEDING FREQUENCY:");
		feedingFrequencyLabel.setBounds(10, 10, 135, 14);
		panel_31.add(feedingFrequencyLabel);

		final JxLabel label = new JxLabel();
		label.setTheme (theme);
		label.setText("1.)");
		label.setBounds(20, 30, 20, 15);
		panel_31.add(label);

		txtFeeding = new JxText();
		txtFeeding.setTheme (theme);
		txtFeeding.setBounds(40, 30, 70, 15);
		panel_31.add(txtFeeding);

		final JxLabel mlLabel = new JxLabel();
		mlLabel.setTheme (theme);

		mlLabel.setText("ML");
		mlLabel.setBounds(115, 30, 20, 15);
		panel_31.add(mlLabel);

		txtFeedingFrequencyTimesPerDay = new JxText();
		txtFeedingFrequencyTimesPerDay.setTheme (theme);
		txtFeedingFrequencyTimesPerDay.setBounds(133, 30, 70, 15);
		panel_31.add(txtFeedingFrequencyTimesPerDay);

		final JxLabel timesPerDayLabel = new JxLabel();
		timesPerDayLabel.setTheme (theme);
		timesPerDayLabel.setText("times per day (Bolus/Gravity)");
		timesPerDayLabel.setBounds(209, 30, 205, 20);
		panel_31.add(timesPerDayLabel);

		final JxLabel orLabel = new JxLabel();
		orLabel.setTheme (theme);
		orLabel.setText("(OR)");
		orLabel.setBounds(181, 51, 54, 15);
		panel_31.add(orLabel);

		final JxLabel label_1 = new JxLabel();
		label_1.setTheme (theme);
		label_1.setText("2.)");
		label_1.setBounds(20, 70, 20, 15);
		panel_31.add(label_1);

		txtFeedingFrequencyMLPerHour = new JxText();
		txtFeedingFrequencyMLPerHour.setTheme (theme);
		txtFeedingFrequencyMLPerHour.setBounds(40, 70, 70, 15);
		panel_31.add(txtFeedingFrequencyMLPerHour);

		final JxLabel mlPerHourLabel = new JxLabel();
		mlPerHourLabel.setTheme (theme);

		mlPerHourLabel.setText("ML per hour. Hours per day");
		mlPerHourLabel.setBounds(115, 70, 135, 15);
		panel_31.add(mlPerHourLabel);

		txtFeedingFrequencyHoursPerDay = new JxText();
		txtFeedingFrequencyHoursPerDay.setTheme (theme);
		txtFeedingFrequencyHoursPerDay.setBounds(250, 70, 70, 15);
		panel_31.add(txtFeedingFrequencyHoursPerDay);

		final JxLabel orLabel_1 = new JxLabel();
		orLabel_1.setTheme (theme);
		orLabel_1.setText("or until total volume");
		orLabel_1.setBounds(325, 70, 111, 15);
		panel_31.add(orLabel_1);

		final JxLabel untilDeliveredpumpLabel = new JxLabel();
		untilDeliveredpumpLabel.setTheme (theme);
		untilDeliveredpumpLabel.setText("delivered (Pump)");
		untilDeliveredpumpLabel.setBounds(40, 90, 103, 15);
		panel_31.add(untilDeliveredpumpLabel);

		final JxLabel orLabel_2 = new JxLabel();
		orLabel_2.setTheme (theme);
		orLabel_2.setText("(OR)");
		orLabel_2.setBounds(181, 107, 54, 15);
		panel_31.add(orLabel_2);

		final JxLabel bolusViaPumpLabel = new JxLabel();
		bolusViaPumpLabel.setTheme (theme);
		bolusViaPumpLabel.setText("Bolus via Pump");
		bolusViaPumpLabel.setBounds(40, 125, 75, 15);
		panel_31.add(bolusViaPumpLabel);

		txtBolusViaPumpML = new JxText();
		txtBolusViaPumpML.setTheme (theme);
		txtBolusViaPumpML.setBounds(120, 125, 60, 15);
		panel_31.add(txtBolusViaPumpML);

		final JxLabel mlLabel_1 = new JxLabel();
		mlLabel_1.setTheme (theme);
		mlLabel_1.setText("ML");
		mlLabel_1.setBounds(185, 125, 20, 15);
		panel_31.add(mlLabel_1);

		txtBolusViaPumpRatePerHour = new JxText();
		txtBolusViaPumpRatePerHour.setTheme (theme);
		txtBolusViaPumpRatePerHour.setBounds(274, 125, 70, 15);
		panel_31.add(txtBolusViaPumpRatePerHour);

		final JxLabel ratePerHourLabel = new JxLabel();
		ratePerHourLabel.setTheme (theme);
		ratePerHourLabel.setText("rate per hour");
		ratePerHourLabel.setBounds(350, 125, 84, 15);
		panel_31.add(ratePerHourLabel);

		final JxLabel totalNutrientLabel = new JxLabel();
		totalNutrientLabel.setTheme (theme);
		totalNutrientLabel.setText("Total Nutrient");
		totalNutrientLabel.setBounds(40, 143, 70, 15);
		panel_31.add(totalNutrientLabel);

		txtTotalNutrient = new JxText();
		txtTotalNutrient.setTheme (theme);
		txtTotalNutrient.setBounds(120, 143, 60, 15);
		panel_31.add(txtTotalNutrient);

		final JxLabel label_2 = new JxLabel();
		label_2.setTheme (theme);
		label_2.setText("3.)");
		label_2.setBounds(20, 125, 20, 15);
		panel_31.add(label_2);

		final JxLabel mlLabel_2 = new JxLabel();
		mlLabel_2.setTheme (theme);
		mlLabel_2.setText("ML ");
		mlLabel_2.setBounds(185, 143, 20, 15);
		panel_31.add(mlLabel_2);

		final JxLabel totalCaloriesLabel = new JxLabel();
		totalCaloriesLabel.setTheme (theme);
		totalCaloriesLabel.setText("Total Calories");
		totalCaloriesLabel.setBounds(203, 143, 70, 15);
		panel_31.add(totalCaloriesLabel);

		txtTotalCalories = new JxText();
		txtTotalCalories.setTheme (theme);
		txtTotalCalories.setBounds(274, 143, 70, 15);
		panel_31.add(txtTotalCalories);

		final JxLabel calLabel = new JxLabel();
		calLabel.setTheme (theme);
		calLabel.setText("CAL");
		calLabel.setBounds(350, 143, 54, 15);
		panel_31.add(calLabel);

		final JxLabel timeUpLabel = new JxLabel();
		timeUpLabel.setTheme (theme);
		timeUpLabel.setText("Time up ");
		timeUpLabel.setBounds(40, 160, 46, 14);
		panel_31.add(timeUpLabel);

		txtTimeUp = new JxText();
		txtTimeUp.setTheme (theme);
		txtTimeUp.setBounds(120, 160, 60, 15);
		panel_31.add(txtTimeUp);

		/*
		 * txtTimeDown = new JxText(); txtTimeDown.setBounds(263, 160, 80,
		txtTimeDown.setTheme (theme);
		 * 15); panel_31.add(txtTimeDown);
		 */
		final JxPanel panel_32 = new JxPanel();
		panel_32.setTheme (theme);
		panel_32.setOpaque(false);
		panel_32.setLayout(null);
		panel_32.setBounds(0, 293, 456, 132);
		panel_28.add(panel_32);

		final JxLabel tubeLabel = new JxLabel();
		tubeLabel.setTheme (theme);

tubeLabel.setFontStyle(Font.BOLD);
		tubeLabel.setText("TUBE:");
		tubeLabel.setBounds(10, 10, 54, 14);
		panel_32.add(tubeLabel);

		final JxLabel sizeLabel = new JxLabel();
		sizeLabel.setTheme (theme);
		sizeLabel.setText("Size");
		sizeLabel.setBounds(20, 30, 54, 15);
		panel_32.add(sizeLabel);

		txtTubeSize = new JxText();
		txtTubeSize.setTheme (theme);
		txtTubeSize.setBounds(59, 30, 70, 15);
		panel_32.add(txtTubeSize);

		mayCheckBox = new JxCheckBox();
		mayCheckBox.setTheme (theme);
		mayCheckBox.setOpaque(false);
		mayCheckBox.setText("may");
		mayCheckBox.setBounds(146, 30, 94, 15);
		panel_32.add(mayCheckBox);

		mayNotReplaceCheckBox = new JxCheckBox();
		mayNotReplaceCheckBox.setTheme (theme);
		mayNotReplaceCheckBox
				.setActionCommand("<HTML><BODY> may not replace if <br> occluded or dislodged <BODY><HTML>");
		mayNotReplaceCheckBox.setOpaque(false);
		mayNotReplaceCheckBox
				.setText("<HTML><BODY>may not replace if <br> occluded or dislodged <BODY><HTML>");
		mayNotReplaceCheckBox.setBounds(201, 22, 167, 32);
		panel_32.add(mayNotReplaceCheckBox);

		final JxLabel changeFeedingQLabel = new JxLabel();
		changeFeedingQLabel.setTheme (theme);
		changeFeedingQLabel.setText("Change feeding q");
		changeFeedingQLabel.setBounds(20, 63, 99, 15);
		panel_32.add(changeFeedingQLabel);

		txtChangeFeeding = new JxText();
		txtChangeFeeding.setTheme (theme);
		txtChangeFeeding.setBounds(135, 63, 65, 15);
		panel_32.add(txtChangeFeeding);

		final JxLabel changeEquipmentQLabel = new JxLabel();
		changeEquipmentQLabel.setTheme (theme);
		changeEquipmentQLabel.setText("Change equipment q");
		changeEquipmentQLabel.setBounds(20, 84, 115, 15);
		panel_32.add(changeEquipmentQLabel);

		txtChangeEquipment = new JxText();
		txtChangeEquipment.setTheme (theme);
		txtChangeEquipment.setBounds(135, 84, 65, 15);
		panel_32.add(txtChangeEquipment);

		final JxLabel cleanseSiteQLabel = new JxLabel();
		cleanseSiteQLabel.setTheme (theme);
		cleanseSiteQLabel.setText("Cleanse site q");
		cleanseSiteQLabel.setBounds(20, 105, 80, 15);
		panel_32.add(cleanseSiteQLabel);

		txtCleanseSite = new JxText();
		txtCleanseSite.setTheme (theme);
		txtCleanseSite.setBounds(135, 105, 65, 15);
		panel_32.add(txtCleanseSite);

		final JxLabel withLabel = new JxLabel();
		withLabel.setTheme (theme);
		withLabel.setText("with");
		withLabel.setBounds(210, 105, 30, 15);
		panel_32.add(withLabel);

		txtCleanseSiteWith = new JxText();
		txtCleanseSiteWith.setTheme (theme);
		txtCleanseSiteWith.setBounds(236, 105, 120, 15);
		panel_32.add(txtCleanseSiteWith);

		final JxPanel panel_29 = new JxPanel();
		panel_29.setTheme (theme);
		panel_29.setOpaque(true);
		panel_29.setBackground(Color.LIGHT_GRAY);
		panel_29.setLayout(null);
		panel_29.setBounds(456, 0, 456, 425);
		panel_27.add(panel_29);

		final JxPanel panel_33 = new JxPanel();
		panel_33.setTheme (theme);
		panel_33.setBounds(456, 53, 10, 10);
		panel_29.add(panel_33);

		final JxPanel panel_34 = new JxPanel();
		panel_34.setTheme (theme);
		panel_34.setLayout(null);
		panel_34.setOpaque(false);
		panel_34.setBounds(0, 0, 456, 150);
		panel_29.add(panel_34);

		final JxLabel flushLabel = new JxLabel();
		flushLabel.setTheme (theme);

flushLabel.setFontStyle(Font.BOLD);
		flushLabel.setBounds(10, 10, 54, 15);
		flushLabel.setText("FLUSH:");
		panel_34.add(flushLabel);

		txtFlushML = new JxText();
		txtFlushML.setTheme (theme);
		txtFlushML.setBounds(114, 36, 65, 15);
		panel_34.add(txtFlushML);

		final JxLabel mlH2oQLabel = new JxLabel();
		mlH2oQLabel.setTheme (theme);
		mlH2oQLabel.setText("ML H2O q");
		mlH2oQLabel.setBounds(190, 35, 54, 15);
		panel_34.add(mlH2oQLabel);

		txtFlushHours = new JxText();
		txtFlushHours.setTheme (theme);
		txtFlushHours.setBounds(253, 35, 80, 15);
		panel_34.add(txtFlushHours);

		final JxLabel hoursLabel = new JxLabel();
		hoursLabel.setTheme (theme);
		hoursLabel.setText("hours");
		hoursLabel.setBounds(337, 35, 54, 15);
		panel_34.add(hoursLabel);

		final JxLabel flushTubeWithLabel = new JxLabel();
		flushTubeWithLabel.setTheme (theme);
		flushTubeWithLabel.setText("FLUSH tube with ");
		flushTubeWithLabel.setBounds(20, 60, 95, 15);
		panel_34.add(flushTubeWithLabel);

		txtFlushBefore_AfterMedication = new JxText();
		txtFlushBefore_AfterMedication.setTheme (theme);
		txtFlushBefore_AfterMedication.setBounds(114, 60, 65, 15);
		panel_34.add(txtFlushBefore_AfterMedication);

		final JxLabel mlH2oLabel = new JxLabel();
		mlH2oLabel.setTheme (theme);
		mlH2oLabel.setText("ML H2O");
		mlH2oLabel.setBounds(190, 60, 54, 15);
		panel_34.add(mlH2oLabel);

		final JxLabel beforeafterEachMedicationLabel = new JxLabel();
		beforeafterEachMedicationLabel.setTheme (theme);
		beforeafterEachMedicationLabel
				.setText("before/after each medication pass.");
		beforeafterEachMedicationLabel.setBounds(20, 80, 200, 15);
		panel_34.add(beforeafterEachMedicationLabel);

		final JxLabel flushTubeWithLabel_1 = new JxLabel();
		flushTubeWithLabel_1.setTheme (theme);
		flushTubeWithLabel_1.setText("FLUSH tube with ");
		flushTubeWithLabel_1.setBounds(20, 105, 95, 15);
		panel_34.add(flushTubeWithLabel_1);

		txtFlushBetweenMedication = new JxText();
		txtFlushBetweenMedication.setTheme (theme);
		txtFlushBetweenMedication.setBounds(114, 105, 65, 15);
		panel_34.add(txtFlushBetweenMedication);

		final JxLabel mlH2oLabel_1 = new JxLabel();
		mlH2oLabel_1.setTheme (theme);
		mlH2oLabel_1.setText("ML H2O");
		mlH2oLabel_1.setBounds(190, 105, 54, 15);
		panel_34.add(mlH2oLabel_1);

		final JxLabel betweenEachMedicationLabel = new JxLabel();
		betweenEachMedicationLabel.setTheme (theme);
		betweenEachMedicationLabel.setText("between each medication");
		betweenEachMedicationLabel.setBounds(20, 126, 146, 15);
		panel_34.add(betweenEachMedicationLabel);

		final JxLabel mlH2oQLabel_1 = new JxLabel();
		mlH2oQLabel_1.setTheme (theme);
		mlH2oQLabel_1.setText("FLUSH tube with ");
		mlH2oQLabel_1.setBounds(20, 36, 95, 15);
		panel_34.add(mlH2oQLabel_1);

		final JxPanel panel_35 = new JxPanel();
		panel_35.setTheme (theme);
		panel_35.setOpaque(false);
		panel_35.setLayout(null);
		panel_35.setBounds(0, 150, 456, 120);
		panel_29.add(panel_35);

		final JxLabel placementLabel = new JxLabel();
		placementLabel.setTheme (theme);

placementLabel.setFontStyle(Font.BOLD);
		placementLabel.setText("PLACEMENT:");
		placementLabel.setBounds(10, 10, 90, 15);
		panel_35.add(placementLabel);

		final JxLabel checkTubeForLabel = new JxLabel();
		checkTubeForLabel.setTheme (theme);
		checkTubeForLabel
				.setText("<HTML><BODY>Check tube for proper placement prior to each feeding, flush or <br>      medication administration.<BODY><HTML>");
		checkTubeForLabel.setBounds(20, 35, 367, 28);
		panel_35.add(checkTubeForLabel);

		final JxLabel elevateHeadOfLabel = new JxLabel();
		elevateHeadOfLabel.setTheme (theme);
		elevateHeadOfLabel.setText("Elevate head of bed ");
		elevateHeadOfLabel.setBounds(20, 80, 113, 15);
		panel_35.add(elevateHeadOfLabel);

		txtPlacement = new JxText();
		txtPlacement.setTheme (theme);
		txtPlacement.setBounds(125, 80, 80, 15);
		panel_35.add(txtPlacement);

		final JxLabel degreesDuringFeedingLabel = new JxLabel();
		degreesDuringFeedingLabel.setTheme (theme);
		degreesDuringFeedingLabel
				.setText("degrees during feeding and 1hr after.");
		degreesDuringFeedingLabel.setBounds(213, 80, 201, 15);
		panel_35.add(degreesDuringFeedingLabel);

		final JxPanel panel_36 = new JxPanel();
		panel_36.setTheme (theme);
		panel_36.setOpaque(false);
		panel_36.setLayout(null);
		panel_36.setBounds(0, 270, 456, 155);
		panel_29.add(panel_36);

		final JxLabel residualLabel = new JxLabel();
		residualLabel.setTheme (theme);

residualLabel.setFontStyle(Font.BOLD);
		residualLabel.setText("RESIDUAL:");
		residualLabel.setBounds(10, 10, 67, 15);
		panel_36.add(residualLabel);

		final JxLabel checkForResidualLabel = new JxLabel();
		checkForResidualLabel.setTheme (theme);
		checkForResidualLabel.setText("Check for residual q");
		checkForResidualLabel.setBounds(20, 35, 107, 15);
		panel_36.add(checkForResidualLabel);

		txtCheckForResidual = new JxText();
		txtCheckForResidual.setTheme (theme);
		txtCheckForResidual.setBounds(133, 35, 80, 15);
		panel_36.add(txtCheckForResidual);

		final JxLabel hourLabel = new JxLabel();
		hourLabel.setTheme (theme);
		hourLabel.setText("hours.");
		hourLabel.setBounds(219, 35, 54, 15);
		panel_36.add(hourLabel);

		final JxLabel ifLabel = new JxLabel();
		ifLabel.setTheme (theme);
		ifLabel.setText("if");
		ifLabel.setBounds(20, 65, 14, 15);
		panel_36.add(ifLabel);

		txtResidualML = new JxText();
		txtResidualML.setTheme (theme);
		txtResidualML.setBounds(40, 65, 80, 15);
		panel_36.add(txtResidualML);

		final JxLabel mlOrOverLabel = new JxLabel();
		mlOrOverLabel.setTheme (theme);
		mlOrOverLabel.setText("ML or over, hold feeding for ");
		mlOrOverLabel.setBounds(127, 65, 146, 15);
		panel_36.add(mlOrOverLabel);

		txtFeedingFor = new JxText();
		txtFeedingFor.setTheme (theme);
		txtFeedingFor.setBounds(272, 65, 85, 15);
		panel_36.add(txtFeedingFor);

		final JxLabel hoursLabel_1 = new JxLabel();
		hoursLabel_1.setTheme (theme);
		hoursLabel_1.setText("hours.");
		hoursLabel_1.setBounds(364, 65, 54, 14);
		panel_36.add(hoursLabel_1);

		final JxLabel ifResidualLabel = new JxLabel();
		ifResidualLabel.setTheme (theme);
		ifResidualLabel.setText("If residual");
		ifResidualLabel.setBounds(20, 90, 61, 15);
		panel_36.add(ifResidualLabel);

		txtResidualMLNotifyMD = new JxText();
		txtResidualMLNotifyMD.setTheme (theme);
		txtResidualMLNotifyMD.setBounds(87, 90, 65, 15);
		panel_36.add(txtResidualMLNotifyMD);

		final JxLabel mlNotifyMdLabel = new JxLabel();
		mlNotifyMdLabel.setTheme (theme);
		mlNotifyMdLabel.setText("ML,   notify MD.");
		mlNotifyMdLabel.setBounds(158, 90, 92, 15);
		panel_36.add(mlNotifyMdLabel);

		final JxLabel ifResidualLabel_1 = new JxLabel();
		ifResidualLabel_1.setTheme (theme);
		ifResidualLabel_1.setText("MOUTH CARE");
		ifResidualLabel_1.setBounds(20, 111, 92, 15);
		panel_36.add(ifResidualLabel_1);

		final JxLabel ifResidualLabel_1_1 = new JxLabel();
		ifResidualLabel_1_1.setTheme (theme);
		ifResidualLabel_1_1.setText("Perform mouth care every shift");
		ifResidualLabel_1_1.setBounds(20, 130, 194, 15);
		panel_36.add(ifResidualLabel_1_1);

		final JxPanel panel_37 = new JxPanel();
		panel_37.setTheme (theme);
		panel_37.setLayout(null);
		panel_37.setOpaque(false);
		panel_37.setBounds(10, 667, 912, 145);
		panel_1.add(panel_37);

		final JxLabel additionalEnteralOrdersLabel = new JxLabel();
		additionalEnteralOrdersLabel.setTheme (theme);

additionalEnteralOrdersLabel.setFontStyle(Font.BOLD);
		additionalEnteralOrdersLabel
				.setText("Additional Enteral Orders / Comments");
		additionalEnteralOrdersLabel.setBounds(10, 10, 227, 15);
		panel_37.add(additionalEnteralOrdersLabel);

		final JScrollPane txtAdditionalEnteralOrders = new JScrollPane();
		txtAdditionalEnteralOrders.setBorder(new LineBorder(Color.black, 1,
				false));
		txtAdditionalEnteralOrders.setOpaque(false);
		txtAdditionalEnteralOrders.setBounds(0, 31, 912, 104);
		panel_37.add(txtAdditionalEnteralOrders);

		final JxTextA textArea = new JxTextA();
		textArea.setTheme (theme);
		//textArea.setBackground(Color.LIGHT_GRAY);
		txtAdditionalEnteralOrders.setViewportView(textArea);
		
		
		final JxButton saveButton = new JxButton();
		saveButton.setTheme (theme);
		saveButton.setArc(0.4f);

		saveButton.setForeground(ColorConstants.DEF_COLOR);

saveButton.setFontSize(12);
saveButton.setFontStyle(Font.BOLD);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				// setBlankField();
				close();
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(392, 903, 136, 24);
		panel_1.add(saveButton);
		

		final JxPanel panel_38 = new JxPanel();
		panel_38.setTheme (theme);
		panel_38.setOpaque(false);
		panel_38.setLayout(null);
		panel_38.setBounds(10, 812, 912, 90);
		panel_1.add(panel_38);

		final JxPanel panel_39 = new JxPanel();
		panel_39.setTheme (theme);

		panel_39.setLayout(null);
		panel_39.setBounds(0, 0, 912, 30);
		panel_38.add(panel_39);

		final JxPanel panel_42 = new JxPanel();
		panel_42.setTheme (theme);

		panel_42.setLayout(null);
		panel_42.setBounds(0, 0, 550, 30);
		panel_39.add(panel_42);

		final JxLabel nurseSignatureLabel = new JxLabel();
		nurseSignatureLabel.setTheme (theme);

		nurseSignatureLabel.setText("Nurse Signature :");
		nurseSignatureLabel.setBounds(10, 8, 92, 15);
		panel_42.add(nurseSignatureLabel);

		txtNurseSign = new JxText();
		txtNurseSign.setTheme (theme);
		txtNurseSign.setBounds(120, 8, 162, 15);
		panel_42.add(txtNurseSign);

		final JxPanel panel_43 = new JxPanel();
		panel_43.setTheme (theme);

		panel_43.setLayout(null);
		panel_43.setBounds(550, 0, 181, 30);
		panel_39.add(panel_43);

		final JxLabel dateLabel = new JxLabel();
		dateLabel.setTheme (theme);

		dateLabel.setText("Date :");
		dateLabel.setBounds(10, 8, 54, 14);
		panel_43.add(dateLabel);

		dcNurse = new JxDateChooser();
		dcNurse.setTheme (theme);
		dcNurse.setBounds(50, 8, 85, 15);
		panel_43.add(dcNurse);

		final JxPanel panel_44 = new JxPanel();
		panel_44.setTheme (theme);

		panel_44.setLayout(null);
		panel_44.setBounds(731, 0, 181, 30);
		panel_39.add(panel_44);

		final JxLabel timeLabel = new JxLabel();
		timeLabel.setTheme (theme);

		timeLabel.setText("Time :");
		timeLabel.setBounds(10, 8, 54, 15);
		panel_44.add(timeLabel);

		txtNurseTime = new JxText();
		txtNurseTime.setTheme (theme);
		txtNurseTime.setBounds(50, 8, 85, 15);
		panel_44.add(txtNurseTime);

		final JxPanel panel_40 = new JxPanel();
		panel_40.setTheme (theme);

		panel_40.setLayout(null);
		panel_40.setBounds(0, 30, 912, 30);
		panel_38.add(panel_40);

		final JxPanel panel_45 = new JxPanel();
		panel_45.setTheme (theme);

		panel_45.setLayout(null);
		panel_45.setBounds(0, 0, 550, 30);
		panel_40.add(panel_45);

		final JxLabel physicianSignatureLabel = new JxLabel();
		physicianSignatureLabel.setTheme (theme);

		physicianSignatureLabel.setText("Physician Signature :");
		physicianSignatureLabel.setBounds(10, 8, 104, 15);
		panel_45.add(physicianSignatureLabel);

		txtPhysicianSign = new JxText();
		txtPhysicianSign.setTheme (theme);
		txtPhysicianSign.setBounds(120, 8, 162, 15);
		panel_45.add(txtPhysicianSign);

		final JxPanel panel_46 = new JxPanel();
		panel_46.setTheme (theme);

		panel_46.setLayout(null);
		panel_46.setBounds(550, 0, 181, 30);
		panel_40.add(panel_46);

		final JxLabel dateLabel_1 = new JxLabel();
		dateLabel_1.setTheme (theme);

		dateLabel_1.setText("Date :");
		dateLabel_1.setBounds(10, 8, 54, 15);
		panel_46.add(dateLabel_1);

		dcPhysician = new JxDateChooser();
		dcPhysician.setTheme (theme);
		dcPhysician.setBounds(50, 8, 85, 15);
		panel_46.add(dcPhysician);

		final JxPanel panel_47 = new JxPanel();
		panel_47.setTheme (theme);

		panel_47.setLayout(null);
		panel_47.setBounds(731, 0, 181, 30);
		panel_40.add(panel_47);

		final JxLabel timeLabel_1 = new JxLabel();
		timeLabel_1.setTheme (theme);

		timeLabel_1.setText("Time:");
		timeLabel_1.setBounds(10, 8, 54, 15);
		panel_47.add(timeLabel_1);

		txtPhysicianTime = new JxText();
		txtPhysicianTime.setTheme (theme);
		txtPhysicianTime.setBounds(50, 8, 85, 15);
		panel_47.add(txtPhysicianTime);

		final JxPanel panel_41 = new JxPanel();
		panel_41.setTheme (theme);
		panel_41.setLayout(null);

		panel_41.setBounds(0, 60, 912, 30);
		panel_38.add(panel_41);

		final JxPanel panel_48 = new JxPanel();
		panel_48.setTheme (theme);

		panel_48.setLayout(null);
		panel_48.setBounds(0, 0, 550, 30);
		panel_41.add(panel_48);

		final JxLabel notedByLabel = new JxLabel();
		notedByLabel.setTheme (theme);

		notedByLabel.setText("Noted By :");
		notedByLabel.setBounds(10, 8, 54, 15);
		panel_48.add(notedByLabel);

		txtNotedByDetails = new JxText();
		txtNotedByDetails.setTheme (theme);
		txtNotedByDetails.setBounds(120, 8, 162, 15);
		panel_48.add(txtNotedByDetails);

		final JxPanel panel_49 = new JxPanel();
		panel_49.setTheme (theme);

		panel_49.setLayout(null);
		panel_49.setBounds(550, 0, 181, 30);
		panel_41.add(panel_49);

		final JxLabel dateLabel_2 = new JxLabel();
		dateLabel_2.setTheme (theme);

		dateLabel_2.setText("Date :");
		dateLabel_2.setBounds(10, 8, 54, 15);
		panel_49.add(dateLabel_2);

		dcNotedBy = new JxDateChooser();
		dcNotedBy.setTheme (theme);
		dcNotedBy.setBounds(50, 8, 85, 15);
		panel_49.add(dcNotedBy);

		final JxPanel panel_50 = new JxPanel();
		panel_50.setTheme (theme);

		panel_50.setLayout(null);
		panel_50.setBounds(731, 0, 181, 30);
		panel_41.add(panel_50);

		final JxLabel timeLabel_2 = new JxLabel();
		timeLabel_2.setTheme (theme);

		timeLabel_2.setText("Time:");
		timeLabel_2.setBounds(10, 8, 54, 15);
		panel_50.add(timeLabel_2);

		txtNotedByTime = new JxText();
		txtNotedByTime.setTheme (theme);
		txtNotedByTime.setBounds(50, 8, 85, 15);
		panel_50.add(txtNotedByTime);

		final JxLabel diagnosisenteralFeedingDueLabel = new JxLabel();
		diagnosisenteralFeedingDueLabel.setBounds(20, 65, 342, 14);
		panel_1.add(diagnosisenteralFeedingDueLabel);
		diagnosisenteralFeedingDueLabel.setTheme (theme);
		diagnosisenteralFeedingDueLabel.setFontStyle(Font.BOLD);
		diagnosisenteralFeedingDueLabel.setFontSize(14);
				//Font.BOLD, 11));
		diagnosisenteralFeedingDueLabel
				.setText("DIAGNOSIS (Enteral Feeding due to)");

		final JxLabel allergyHistoryLabel = new JxLabel();
		allergyHistoryLabel.setBounds(477, 65, 203, 14);
		panel_1.add(allergyHistoryLabel);
		allergyHistoryLabel.setTheme (theme);
		allergyHistoryLabel.setFontStyle(Font.BOLD);
		allergyHistoryLabel.setFontSize(14);
		allergyHistoryLabel.setText("ALLERGY HISTORY");
		//panel_17.add(panel_26);

		final JxPanel panel_18 = new JxPanel();
		panel_18.setBounds(10, 194, 912, 43);
		panel_1.add(panel_18);
		panel_18.setTheme (theme);

		panel_18.setLayout(null);

		final JxLabel tubeFeedingLabel = new JxLabel();
		tubeFeedingLabel.setTheme (theme);

		tubeFeedingLabel.setFontStyle(Font.BOLD);
		tubeFeedingLabel.setText("TUBE FEEDING:");
		tubeFeedingLabel.setBounds(10, 10, 93, 16);
		panel_18.add(tubeFeedingLabel);

		txtTubeFeeding = new JxText();
		txtTubeFeeding.setTheme (theme);
		txtTubeFeeding.setBounds(95, 5, 807, 37);
		panel_18.add(txtTubeFeeding);

		
	}

	public int doSave() {
		PhysicianOrderEnteralProtocol refEnteralProtocol = new PhysicianOrderEnteralProtocol();
		refEnteralProtocol
				.setSerial(Global.currentPhysicianOrderEnteralProtocolKey);
		refEnteralProtocol.setResidentId(Global.currentResidenceKey);
		refEnteralProtocol.setResidualMLNotifyMD(txtResidualMLNotifyMD
				.getText());
		refEnteralProtocol.setFeedingFor(txtFeedingFor.getText());
		refEnteralProtocol.setResidualML(txtResidualML.getText());
		refEnteralProtocol.setCheckForResidual(txtCheckForResidual.getText());
		refEnteralProtocol.setFlushBetweenMedication(txtFlushBetweenMedication
				.getText());
		refEnteralProtocol.setFlushHours(txtFlushHours.getText());
		refEnteralProtocol.setFlushML(txtFlushML.getText());
		refEnteralProtocol
				.setFeedingFrequencyHoursPerDay(txtFeedingFrequencyHoursPerDay
						.getText());
		refEnteralProtocol
				.setFeedingFrequencyMLPerHour(txtFeedingFrequencyMLPerHour
						.getText());
		refEnteralProtocol
				.setBolusViaPumpRatePerHour(txtBolusViaPumpRatePerHour
						.getText());
		refEnteralProtocol.setBolusViaPumpML(txtBolusViaPumpML.getText());
		refEnteralProtocol.setTotalCalories(txtTotalCalories.getText());
		refEnteralProtocol.setTimeUp(txtTimeUp.getText());
		// refEnteralProtocol.setTimeDown(txtTimeDown.getText());
		refEnteralProtocol.setCleanseSiteWith(txtCleanseSiteWith.getText());
		refEnteralProtocol.setCleanseSite(txtCleanseSite.getText());
		refEnteralProtocol.setChangeEquipment(txtChangeEquipment.getText());
		refEnteralProtocol.setChangeFeeding(txtChangeFeeding.getText());
		refEnteralProtocol.setTubeSize(txtTubeSize.getText());
		refEnteralProtocol.setTubeFeeding(txtTubeFeeding.getText());
		refEnteralProtocol.setAllergyHistory3(txtAllergyHistory3.getText());
		refEnteralProtocol.setAllergyHistory2(txtAllergyHistory2.getText());
		refEnteralProtocol.setAllergyHistory1(txtAllergyHistory1.getText());
		refEnteralProtocol.setDiagnosis3(txtDiagnosis3.getText());
		refEnteralProtocol.setDiagnosis2(txtDiagnosis2.getText());
		refEnteralProtocol.setDiagnosis1(txtDiagnosis1.getText());
		refEnteralProtocol.setHeight(txtHeight.getText());
		refEnteralProtocol.setWeight(txtWeight.getText());
		refEnteralProtocol.setPhysicianLastName(txtPhysicianLastName.getText());
		refEnteralProtocol.setPhysicianFirstName(txtPhysicianFirstName
				.getText());
		// refEnteralProtocol.setOB(txtOB.getText());

		refEnteralProtocol.setFacilityName(txtFacilityName.getText());
		refEnteralProtocol.setAdmission(lblAddmissionDate.getText());
		refEnteralProtocol.setLastName(lblLastName.getText());
		refEnteralProtocol.setFirstName(lblFirstName.getText());
		refEnteralProtocol.setNotedByDetails(txtNotedByDetails.getText());
		refEnteralProtocol.setPhysicianSign(txtPhysicianSign.getText());
		refEnteralProtocol.setNurseSign(txtNurseSign.getText());
		refEnteralProtocol.setNotedByTime(txtNotedByTime.getText());
		refEnteralProtocol.setPhysicianTime(txtPhysicianTime.getText());
		refEnteralProtocol.setNurseTime(txtNurseTime.getText());
	//	refEnteralProtocol.setDOB(dcDOB_1.getDate());

		refEnteralProtocol.setPeg(cbPeg.isSelected());
		refEnteralProtocol.setPump(cbPump.isSelected());
		refEnteralProtocol.setGravity(cbGravity.isSelected());
		refEnteralProtocol.setBolus(cbBolus.isSelected());
		refEnteralProtocol.setFeeding(txtFeeding.getText());

		refEnteralProtocol
				.setFeedingFrequencyTimesPerDay(txtFeedingFrequencyTimesPerDay
						.getText());
		refEnteralProtocol.setTotalNutrient(txtTotalNutrient.getText());
		// refEnteralProtocol.setYCheckBox(cbyCheckBox.isSelected());
		// refEnteralProtocol.setYNotReplaceCheckBox(cbyNotReplaceCheckBox.isSelected());
		refEnteralProtocol.setPlacement(txtPlacement.getText());
		// refEnteralProtocol.setTArea(txttArea.getText());
		refEnteralProtocol.setNurse(dcNurse.getDate());
		refEnteralProtocol.setPhysician(dcPhysician.getDate());
		refEnteralProtocol.setNotedBy(dcNotedBy.getDate());
		
//		PhysicianOrderDiets dietsobject=null;
//		
//		/*Global.currentPhysicianOrderDietKey;*/
//		
//		try {
//			dietsobject=MedrexClientManager.getInstance().getPhysicianOrderDiet(1);
//		} catch (Exception e) {
//			dietsobject=new PhysicianOrderDiets();
//			//e.printStackTrace();
//		}

		
		try {
			
			
			
			/*Global.currentPhysicianOrderEnteralProtocolKey*/currentGTubeKey = MedrexClientManager
					.getInstance().insertOrUpdateEnteralProtocal(
							refEnteralProtocol);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return 0;
	}

	public void setValueObject(PhysicianOrderEnteralProtocol refEnteralProtocol) {
		txtResidualMLNotifyMD.setText(refEnteralProtocol
				.getResidualMLNotifyMD());
		txtFeedingFor.setText(refEnteralProtocol.getFeedingFor());
		txtResidualML.setText(refEnteralProtocol.getResidualML());
		txtCheckForResidual.setText(refEnteralProtocol.getCheckForResidual());
		txtFlushBetweenMedication.setText(refEnteralProtocol
				.getFlushBetweenMedication());
		txtFlushHours.setText(refEnteralProtocol.getFlushHours());
		txtFlushML.setText(refEnteralProtocol.getFlushML());
		txtFeedingFrequencyHoursPerDay.setText(refEnteralProtocol
				.getFeedingFrequencyHoursPerDay());
		txtFeedingFrequencyMLPerHour.setText(refEnteralProtocol
				.getFeedingFrequencyMLPerHour());
		txtBolusViaPumpRatePerHour.setText(refEnteralProtocol
				.getBolusViaPumpRatePerHour());
		txtBolusViaPumpML.setText(refEnteralProtocol.getBolusViaPumpML());
		txtTotalCalories.setText(refEnteralProtocol.getTotalCalories());
		txtTimeUp.setText(refEnteralProtocol.getTimeUp());
		// txtTimeDown.setText(refEnteralProtocol.getTimeDown());
		txtCleanseSiteWith.setText(refEnteralProtocol.getCleanseSiteWith());
		txtCleanseSite.setText(refEnteralProtocol.getCleanseSite());
		txtChangeEquipment.setText(refEnteralProtocol.getChangeEquipment());
		txtChangeFeeding.setText(refEnteralProtocol.getChangeFeeding());
		txtTubeSize.setText(refEnteralProtocol.getTubeSize());
		txtTubeFeeding.setText(refEnteralProtocol.getTubeFeeding());
		txtAllergyHistory3.setText(refEnteralProtocol.getAllergyHistory3());
		txtAllergyHistory2.setText(refEnteralProtocol.getAllergyHistory2());
		txtAllergyHistory1.setText(refEnteralProtocol.getAllergyHistory1());
		txtDiagnosis3.setText(refEnteralProtocol.getDiagnosis3());
		txtDiagnosis2.setText(refEnteralProtocol.getDiagnosis2());
		txtDiagnosis1.setText(refEnteralProtocol.getDiagnosis1());
		txtHeight.setText(refEnteralProtocol.getHeight());
		txtWeight.setText(refEnteralProtocol.getWeight());
		txtPhysicianLastName.setText(refEnteralProtocol.getPhysicianLastName());
		txtPhysicianFirstName.setText(refEnteralProtocol
				.getPhysicianFirstName());
		// dcDOB_1.setDate(refEnteralProtocol.getOB());
		txtFacilityName.setText(refEnteralProtocol.getFacilityName());
		//lblLastName.setText(refEnteralProtocol.getLastName());
		//lblFirstName.setText(refEnteralProtocol.getFirstName());
		txtNotedByDetails.setText(refEnteralProtocol.getNotedByDetails());
		txtPhysicianSign.setText(refEnteralProtocol.getPhysicianSign());
		txtNurseSign.setText(refEnteralProtocol.getNurseSign());
		// dcNotedBy.setText(refEnteralProtocol.getotedBy());
		// dcPhysician.setText(refEnteralProtocol.gethysician());
		// dcNurse.setText(refEnteralProtocol.geturse());
		txtNotedByTime.setText(refEnteralProtocol.getNotedByTime());
		txtPhysicianTime.setText(refEnteralProtocol.getPhysicianTime());
		txtNurseTime.setText(refEnteralProtocol.getNurseTime());
		dcDOB_1.setDate(refEnteralProtocol.getDOB());
		cbPeg.setSelected(refEnteralProtocol.isPeg());
		cbPump.setSelected(refEnteralProtocol.isPump());
		cbGravity.setSelected(refEnteralProtocol.isGravity());
		cbBolus.setSelected(refEnteralProtocol.isBolus());
		txtFeeding.setText(refEnteralProtocol.getFeeding());
		txtFeedingFrequencyTimesPerDay.setText(refEnteralProtocol
				.getFeedingFrequencyTimesPerDay());
		txtTotalNutrient.setText(refEnteralProtocol.getTotalNutrient());
		mayCheckBox.setSelected(refEnteralProtocol.isYCheckBox());
		mayNotReplaceCheckBox.setSelected(refEnteralProtocol
				.isYNotReplaceCheckBox());
		txtPlacement.setText(refEnteralProtocol.getPlacement());
		// textArea.setText(refEnteralProtocol.getTArea());
		dcNurse.setDate(refEnteralProtocol.getNurse());
		dcPhysician.setDate(refEnteralProtocol.getPhysician());
		dcNotedBy.setDate(refEnteralProtocol.getNotedBy());
	}

	public void setBlankField() {
		Global.currentPhysicianOrderEnteralProtocolKey = 0;
		Global.currentPhysicianOrderRecordKey = 0;
		txtResidualMLNotifyMD.setText("");
		txtFeedingFor.setText("");
		txtResidualML.setText("");
		txtCheckForResidual.setText("");
		txtFlushBetweenMedication.setText("");
		txtFlushHours.setText("");
		txtFlushML.setText("");
		txtFeedingFrequencyHoursPerDay.setText("");
		txtFeedingFrequencyMLPerHour.setText("");
		txtBolusViaPumpRatePerHour.setText("");
		txtBolusViaPumpML.setText("");
		txtTotalCalories.setText("");
		txtTimeUp.setText("");
		// txtTimeDown.setText("");
		txtCleanseSiteWith.setText("");
		txtCleanseSite.setText("");
		txtChangeEquipment.setText("");
		txtChangeFeeding.setText("");
		txtTubeSize.setText("");
		txtTubeFeeding.setText("");
		txtAllergyHistory3.setText("");
		txtAllergyHistory2.setText("");
		txtAllergyHistory1.setText("");
		txtDiagnosis3.setText("");
		txtDiagnosis2.setText("");
		txtDiagnosis1.setText("");
		txtHeight.setText("");
		txtWeight.setText("");
		txtPhysicianLastName.setText("");
		txtPhysicianFirstName.setText("");
		// dcDOB.setText("");
		txtFacilityName.setText("");
		//lblLastName.setText("");
		//lblFirstName.setText("");
		txtNotedByDetails.setText("");
		txtPhysicianSign.setText("");
		txtNurseSign.setText("");
		dcNotedBy.setDate(null);
		dcPhysician.setDate(null);
		dcNurse.setDate(null);
		txtNotedByTime.setText("");
		txtPhysicianTime.setText("");
		txtNurseTime.setText("");
		// dcDOB.setDate("");
		cbPeg.setSelected(false);
		cbPump.setSelected(false);
		cbGravity.setSelected(false);
		cbBolus.setSelected(false);
		txtFeeding.setText("");
		txtFeedingFrequencyTimesPerDay.setText("");
		txtTotalNutrient.setText("");
		// mayCheckBox.setSelected(false);
		// mayNotReplaceCheckBox.setSelected(false);
		txtPlacement.setText("");
		// textArea.setText("");
		// dcNurse.setDate(refEnteralProtocol.getNurse());
		// dcPhysician.setDate(refEnteralProtocol.getPhysician());
		// dcNotedBy.setDate(refEnteralProtocol.getNotedBy());

	}

	@Override
	public String getTitle() {
		
		return null;
	}

	@Override
	public void doLoad() {
		
		
	}

	@Override
	public void doUpdate() {
		
		int resID = Global.currentResidenceKey;
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(resID);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		lblLastName.setText(rm.getUserPass());
		lblFirstName.setText(rm.getUserName());

		SimpleDateFormat sdf = new SimpleDateFormat();
		lblDOB.setText(sdf.format(rm.getDob()));
	}

	@Override
	public boolean doValidate() {
		
		return false;
	}	

}
