package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.rmi.RemoteException;
import java.util.Date;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage4;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.commons.vo.resident.ResidentMain;

import com.toedter.calendar.JDateChooser;

public class PanelMonthlySummaryPage4 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7020783531861946743L;
	private JTextField txtPleasure117;
	private JTextField txtPleasure311;
	private JTextField txtPleasure73;
	private JTextField txtTPN117;
	private JTextField txtTPN311;
	private JTextField txtTPN73;
	private JTextField txtGT117;
	private JTextField txtGT311;
	private JTextField txtGT73;
	private JTextField txtSnack117;
	private JTextField txtSnack311;
	private JTextField txtSnack73;
	private JTextField txtTotal117;
	private JTextField txtTotal311;
	private JTextField txtTotal73;
	private JTextField txtLimited117;
	private JTextField txtLimited311;
	private JTextField txtLimited73;
	private JTextField txtIndependent117;
	private JTextField txtIndependent311;
	private JTextField txtIndependent73;
	private JCheckBox cbToiletingTotal117;
	private JCheckBox cbTransferTotal117;
	private JCheckBox cbBedTotal117;
	private JCheckBox cbToiletingExtensive2117;
	private JCheckBox cbTransferExtensive2117;
	private JCheckBox cbBedExtensive2117;
	private JCheckBox cbToiletingExtensive1117;
	private JCheckBox cbTransferExtensive1117;
	private JCheckBox cbBedExtensive117;
	private JCheckBox cbToiletingLimited117;
	private JCheckBox cbTransferLimited117;
	private JCheckBox cbBedLimited117;
	private JCheckBox cbToiletingIndependent117;
	private JCheckBox cbTransferIndependent117;
	private JCheckBox cbBedIndependent117;
	private JCheckBox cbToiletingTotal311;
	private JCheckBox cbTransferTotal311;
	private JCheckBox cbBedTotal311;
	private JCheckBox cbToiletingExtensive2311;
	private JCheckBox cbTransferExtensive2311;
	private JCheckBox cbBedExtensive2311;
	private JCheckBox cbToiletingExtensive1311;
	private JCheckBox cbTransferExtensive1311;
	private JCheckBox cbBedExtensive1311;
	private JCheckBox cbToiletingLimited311;
	private JCheckBox cbTransferLimited311;
	private JCheckBox cbBedLimited311;
	private JCheckBox cbToiletingIndependent311;
	private JCheckBox cbTransferIndependent311;
	private JCheckBox cbBedIndependent311;
	private JCheckBox cbToiletingTotal73;
	private JCheckBox cbTransferTotal73;
	private JCheckBox cbBedTotal73;
	private JCheckBox cbToiletingExtensive273;
	private JCheckBox cbTransferExtensive273;
	private JCheckBox cbBedExtensive273;
	private JCheckBox cbToiletingExtensive173;
	private JCheckBox cbTransferExtensive173;
	private JCheckBox cbBedExtensive173;
	private JCheckBox cbToiletingLimited73;
	private JCheckBox cbTransferLimited73;
	private JCheckBox cbBedLimited73;
	private JCheckBox cbToiletingIndependent73;
	private JCheckBox cbTransferIndependent73;
	private JCheckBox cbBedIndependent73;
	private JTextArea txtAreaOtherIntervention;
	private JTextField txtOtherSkilled5117;
	private JTextField txtOtherSkilled5311;
	private JTextField txtOtherSkilled573;
	private JTextField txtOtherSkilled4117;
	private JTextField txtOtherSkilled4311;
	private JTextField txtOtherSkilled473;
	private JTextField txtOtherSkilled3117;
	private JTextField txtOtherSkilled3311;
	private JTextField txtOtherSkilled373;
	private JTextField txtOtherSkilled2117;
	private JTextField txtOtherSkilled2311;
	private JTextField txtOtherSkilled273;
	private JTextField txtOtherSkilled1117;
	private JTextField txtOtherSkilled1311;
	private JTextField txtOtherSkilled173;
	private JTextField txtOtherSkilled5;
	private JTextField txtOtherSkilled4;
	private JTextField txtOtherSkilled3;
	private JTextField txtOtherSkilled2;
	private JTextField txtOtherSkilled1;
	private JTextArea txtAreaSkinIntervention;
	private JTextField txtWound117;
	private JTextField txtWound311;
	private JTextField txtWound73;
	private JTextField txtNewSkin117;
	private JTextField txtNewSkin311;
	private JTextField txtNewSkin73;
	private JTextField txtSutures117;
	private JTextField txtSutures311;
	private JTextField txtSutures73;
	private JTextField txtSkinIntact117;
	private JTextField txtSkinIntact311;
	private JTextField txtSkinIntact73;
	private JTextArea txtAreaRespirationIntervention;
	private JTextField txtTrachCare117;
	private JTextField txtTrachCare311;
	private JTextField txtTrachCare73;
	private JTextField txtSuctioned117;
	private JTextField txtSuctioned311;
	private JTextField txtSuctioned73;
	private JTextField txtAngina117;
	private JTextField txtAngina311;
	private JTextField txtAngina73;
	private JTextField txtheart117;
	private JTextField txtheart311;
	private JTextField txtheart73;
	private JTextField txtCrackles117;
	private JTextField txtCrackles311;
	private JTextField txtCrackles73;
	private JTextField txtLungs117;
	private JTextField txtLungs311;
	private JTextField txtLungs73;
	private JTextField txtBreath117;
	private JTextField txtBreath311;
	private JTextField txtBreath73;
	private JTextArea txtAreaVitalIntervention;
	private JTextField txtO2117;
	private JTextField txtO2311;
	private JTextField txtO273;
	private JTextField txtTemp117;
	private JTextField txtTemp311;
	private JTextField txtTemp73;
	private JTextField txtRespirations117;
	private JTextField txtRespirations311;
	private JTextField txtRespirations73;
	private JTextField txtPulse117;
	private JTextField txtPulse311;
	private JTextField txtPulse73;
	private JTextField txtBP117;
	private JTextField txtBP311;
	private JTextField txtBP73;
	private JTextField txtRoom;
	private JTextField txtResidentName;
	private JDateChooser dcDate;

	public PanelMonthlySummaryPage4() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(910, 1293));

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 910, 1293);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 384, 70);
		panel.add(panel_1);

		final JLabel skilledFlowSheetLabel = new JLabel();
		skilledFlowSheetLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		skilledFlowSheetLabel.setBounds(10, 10, 125, 23);
		skilledFlowSheetLabel.setText("SKILLED FLOW SHEET");
		panel_1.add(skilledFlowSheetLabel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setText("Date");
		dateLabel.setBounds(162, 14, 54, 14);
		panel_1.add(dateLabel);

		dcDate = new JDateChooser();
		dcDate.setBounds(196, 10, 169, 20);
		panel_1.add(dcDate);

		final JLabel residentLabel = new JLabel();
		residentLabel.setText("Resident ");
		residentLabel.setBounds(10, 46, 54, 14);
		panel_1.add(residentLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(70, 44, 169, 18);
		panel_1.add(txtResidentName);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room #");
		roomLabel.setBounds(248, 46, 46, 14);
		panel_1.add(roomLabel);

		txtRoom = new JTextField();
		txtRoom.setBounds(303, 44, 62, 18);
		panel_1.add(txtRoom);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 88, 384, 1198);
		panel.add(panel_2);

		final JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 383, 251);
		panel_2.add(panel_7);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setBounds(0, 0, 137, 157);
		panel_7.add(panel_3);
		panel_3.setLayout(null);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setBounds(0, 0, 137, 27);
		panel_3.add(panel_9);

		final JLabel vitalSignsLabel = new JLabel();
		vitalSignsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel.setBounds(10, 5, 78, 14);
		vitalSignsLabel.setText("Vital Signs");
		panel_9.add(vitalSignsLabel);

		final JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(Color.WHITE);
		panel_9_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1.setLayout(null);
		panel_9_1.setBounds(0, 26, 137, 27);
		panel_3.add(panel_9_1);

		final JLabel vitalSignsLabel_1 = new JLabel();
		vitalSignsLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_1.setText("BP");
		vitalSignsLabel_1.setBounds(10, 5, 78, 14);
		panel_9_1.add(vitalSignsLabel_1);

		final JPanel panel_9_2 = new JPanel();
		panel_9_2.setBackground(Color.WHITE);
		panel_9_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2.setLayout(null);
		panel_9_2.setBounds(0, 52, 137, 27);
		panel_3.add(panel_9_2);

		final JLabel vitalSignsLabel_2 = new JLabel();
		vitalSignsLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2.setText("Pulse");
		vitalSignsLabel_2.setBounds(10, 5, 78, 14);
		panel_9_2.add(vitalSignsLabel_2);

		final JPanel panel_9_2_1 = new JPanel();
		panel_9_2_1.setBackground(Color.WHITE);
		panel_9_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1.setLayout(null);
		panel_9_2_1.setBounds(0, 78, 137, 27);
		panel_3.add(panel_9_2_1);

		final JLabel vitalSignsLabel_2_1 = new JLabel();
		vitalSignsLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_1.setText("Respirations");
		vitalSignsLabel_2_1.setBounds(10, 5, 78, 14);
		panel_9_2_1.add(vitalSignsLabel_2_1);

		final JPanel panel_9_2_2 = new JPanel();
		panel_9_2_2.setBackground(Color.WHITE);
		panel_9_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2.setLayout(null);
		panel_9_2_2.setBounds(0, 104, 137, 27);
		panel_3.add(panel_9_2_2);

		final JLabel vitalSignsLabel_2_2 = new JLabel();
		vitalSignsLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2.setText("Temp");
		vitalSignsLabel_2_2.setBounds(10, 5, 78, 14);
		panel_9_2_2.add(vitalSignsLabel_2_2);

		final JPanel panel_9_2_2_1 = new JPanel();
		panel_9_2_2_1.setBackground(Color.WHITE);
		panel_9_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1.setLayout(null);
		panel_9_2_2_1.setBounds(0, 130, 137, 27);
		panel_3.add(panel_9_2_2_1);

		final JLabel vitalSignsLabel_2_2_1 = new JLabel();
		vitalSignsLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2_1.setText("O2 saturation");
		vitalSignsLabel_2_2_1.setBounds(10, 5, 78, 14);
		panel_9_2_2_1.add(vitalSignsLabel_2_2_1);

		final JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setBounds(136, 0, 83, 157);
		panel_7.add(panel_4);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setBounds(0, 0, 83, 27);
		panel_4.add(panel_10);

		final JLabel vitalSignsLabel_3 = new JLabel();
		vitalSignsLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3.setText("7 - 3");
		vitalSignsLabel_3.setBounds(30, 10, 43, 14);
		panel_10.add(vitalSignsLabel_3);

		final JPanel panel_10_3 = new JPanel();
		panel_10_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3.setLayout(null);
		panel_10_3.setBounds(0, 26, 83, 27);
		panel_4.add(panel_10_3);

		txtBP73 = new JTextField();
		txtBP73.setBounds(1, 1, 80, 25);
		panel_10_3.add(txtBP73);

		final JPanel panel_10_3_1 = new JPanel();
		panel_10_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1.setLayout(null);
		panel_10_3_1.setBounds(0, 52, 83, 27);
		panel_4.add(panel_10_3_1);

		txtPulse73 = new JTextField();
		txtPulse73.setBounds(1, 1, 80, 25);
		panel_10_3_1.add(txtPulse73);

		final JPanel panel_10_3_2 = new JPanel();
		panel_10_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2.setLayout(null);
		panel_10_3_2.setBounds(0, 78, 83, 27);
		panel_4.add(panel_10_3_2);

		txtRespirations73 = new JTextField();
		txtRespirations73.setBounds(1, 1, 80, 25);
		panel_10_3_2.add(txtRespirations73);

		final JPanel panel_10_3_3 = new JPanel();
		panel_10_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_3.setLayout(null);
		panel_10_3_3.setBounds(0, 104, 83, 27);
		panel_4.add(panel_10_3_3);

		txtTemp73 = new JTextField();
		txtTemp73.setBounds(1, 1, 80, 25);
		panel_10_3_3.add(txtTemp73);

		final JPanel panel_10_3_4 = new JPanel();
		panel_10_3_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_4.setLayout(null);
		panel_10_3_4.setBounds(0, 130, 83, 27);
		panel_4.add(panel_10_3_4);

		txtO273 = new JTextField();
		txtO273.setBounds(1, 1, 80, 25);
		panel_10_3_4.add(txtO273);

		final JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setBounds(0, 156, 383, 95);
		panel_7.add(panel_8);

		final JLabel interventionsLabel = new JLabel();
		interventionsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		interventionsLabel.setBounds(10, 10, 92, 14);
		interventionsLabel.setText("Interventions :");
		panel_8.add(interventionsLabel);

		txtAreaVitalIntervention = new JTextArea();
		txtAreaVitalIntervention
				.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaVitalIntervention.setBounds(10, 27, 363, 58);
		panel_8.add(txtAreaVitalIntervention);

		final JPanel panel_4_3 = new JPanel();
		panel_4_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3.setLayout(null);
		panel_4_3.setBounds(218, 0, 83, 157);
		panel_7.add(panel_4_3);

		final JPanel panel_10_1 = new JPanel();
		panel_10_1.setBackground(Color.WHITE);
		panel_10_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_1.setLayout(null);
		panel_10_1.setBounds(0, 0, 83, 27);
		panel_4_3.add(panel_10_1);

		final JLabel vitalSignsLabel_3_1 = new JLabel();
		vitalSignsLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_1.setText("3 - 11");
		vitalSignsLabel_3_1.setBounds(30, 10, 43, 14);
		panel_10_1.add(vitalSignsLabel_3_1);

		final JPanel panel_10_3_5 = new JPanel();
		panel_10_3_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_5.setLayout(null);
		panel_10_3_5.setBounds(0, 26, 83, 27);
		panel_4_3.add(panel_10_3_5);

		txtBP311 = new JTextField();
		txtBP311.setBounds(1, 1, 80, 25);
		panel_10_3_5.add(txtBP311);

		final JPanel panel_10_3_1_1 = new JPanel();
		panel_10_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_1.setLayout(null);
		panel_10_3_1_1.setBounds(0, 52, 83, 27);
		panel_4_3.add(panel_10_3_1_1);

		txtPulse311 = new JTextField();
		txtPulse311.setBounds(1, 1, 80, 25);
		panel_10_3_1_1.add(txtPulse311);

		final JPanel panel_10_3_2_1 = new JPanel();
		panel_10_3_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_1.setLayout(null);
		panel_10_3_2_1.setBounds(0, 78, 83, 27);
		panel_4_3.add(panel_10_3_2_1);

		txtRespirations311 = new JTextField();
		txtRespirations311.setBounds(1, 1, 80, 25);
		panel_10_3_2_1.add(txtRespirations311);

		final JPanel panel_10_3_3_1 = new JPanel();
		panel_10_3_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_3_1.setLayout(null);
		panel_10_3_3_1.setBounds(0, 104, 83, 27);
		panel_4_3.add(panel_10_3_3_1);

		txtTemp311 = new JTextField();
		txtTemp311.setBounds(1, 1, 80, 25);
		panel_10_3_3_1.add(txtTemp311);

		final JPanel panel_10_3_4_1 = new JPanel();
		panel_10_3_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_4_1.setLayout(null);
		panel_10_3_4_1.setBounds(0, 130, 83, 27);
		panel_4_3.add(panel_10_3_4_1);

		txtO2311 = new JTextField();
		txtO2311.setBounds(1, 1, 80, 25);
		panel_10_3_4_1.add(txtO2311);

		final JPanel panel_4_3_1 = new JPanel();
		panel_4_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_3_1.setLayout(null);
		panel_4_3_1.setBounds(300, 0, 83, 157);
		panel_7.add(panel_4_3_1);

		final JPanel panel_10_1_1 = new JPanel();
		panel_10_1_1.setBackground(Color.WHITE);
		panel_10_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_1_1.setLayout(null);
		panel_10_1_1.setBounds(0, 0, 83, 27);
		panel_4_3_1.add(panel_10_1_1);

		final JLabel vitalSignsLabel_3_1_1 = new JLabel();
		vitalSignsLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_1_1.setText("11 - 7");
		vitalSignsLabel_3_1_1.setBounds(30, 10, 43, 14);
		panel_10_1_1.add(vitalSignsLabel_3_1_1);

		final JPanel panel_10_3_5_1 = new JPanel();
		panel_10_3_5_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_5_1.setLayout(null);
		panel_10_3_5_1.setBounds(0, 26, 83, 27);
		panel_4_3_1.add(panel_10_3_5_1);

		txtBP117 = new JTextField();
		txtBP117.setBounds(1, 1, 80, 25);
		panel_10_3_5_1.add(txtBP117);

		final JPanel panel_10_3_1_1_1 = new JPanel();
		panel_10_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_1_1.setLayout(null);
		panel_10_3_1_1_1.setBounds(0, 52, 83, 27);
		panel_4_3_1.add(panel_10_3_1_1_1);

		txtPulse117 = new JTextField();
		txtPulse117.setBounds(1, 1, 80, 25);
		panel_10_3_1_1_1.add(txtPulse117);

		final JPanel panel_10_3_2_1_1 = new JPanel();
		panel_10_3_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_1_1.setLayout(null);
		panel_10_3_2_1_1.setBounds(0, 78, 83, 27);
		panel_4_3_1.add(panel_10_3_2_1_1);

		txtRespirations117 = new JTextField();
		txtRespirations117.setBounds(1, 1, 80, 25);
		panel_10_3_2_1_1.add(txtRespirations117);

		final JPanel panel_10_3_3_1_1 = new JPanel();
		panel_10_3_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_3_1_1.setLayout(null);
		panel_10_3_3_1_1.setBounds(0, 104, 83, 27);
		panel_4_3_1.add(panel_10_3_3_1_1);

		txtTemp117 = new JTextField();
		txtTemp117.setBounds(1, 1, 80, 25);
		panel_10_3_3_1_1.add(txtTemp117);

		final JPanel panel_10_3_4_1_1 = new JPanel();
		panel_10_3_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_4_1_1.setLayout(null);
		panel_10_3_4_1_1.setBounds(0, 130, 83, 27);
		panel_4_3_1.add(panel_10_3_4_1_1);

		txtO2117 = new JTextField();
		txtO2117.setBounds(1, 1, 80, 25);
		panel_10_3_4_1_1.add(txtO2117);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(0, 250, 383, 357);
		panel_2.add(panel_7_1);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(0, 0, 137, 263);
		panel_7_1.add(panel_3_1);

		final JPanel panel_9_3 = new JPanel();
		panel_9_3.setBackground(Color.WHITE);
		panel_9_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3.setLayout(null);
		panel_9_3.setBounds(0, 0, 137, 45);
		panel_3_1.add(panel_9_3);

		final JLabel vitalSignsLabel_4 = new JLabel();
		vitalSignsLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_4
				.setText("<html>Respiratory /<br> Cardiovascular</html>");
		vitalSignsLabel_4.setBounds(10, 5, 117, 35);
		panel_9_3.add(vitalSignsLabel_4);

		final JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setBackground(Color.WHITE);
		panel_9_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1.setLayout(null);
		panel_9_1_1.setBounds(0, 44, 137, 27);
		panel_3_1.add(panel_9_1_1);

		final JLabel vitalSignsLabel_1_1 = new JLabel();
		vitalSignsLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_1_1.setText("Breath sounds clear");
		vitalSignsLabel_1_1.setBounds(10, 5, 117, 14);
		panel_9_1_1.add(vitalSignsLabel_1_1);

		final JPanel panel_9_2_3 = new JPanel();
		panel_9_2_3.setBackground(Color.WHITE);
		panel_9_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_3.setLayout(null);
		panel_9_2_3.setBounds(0, 70, 137, 45);
		panel_3_1.add(panel_9_2_3);

		final JLabel vitalSignsLabel_2_3 = new JLabel();
		vitalSignsLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_3.setText("<html>Lungs sounds<br>deminished</html>");
		vitalSignsLabel_2_3.setBounds(10, 5, 117, 35);
		panel_9_2_3.add(vitalSignsLabel_2_3);

		final JPanel panel_9_2_1_1 = new JPanel();
		panel_9_2_1_1.setBackground(Color.WHITE);
		panel_9_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_1.setLayout(null);
		panel_9_2_1_1.setBounds(0, 114, 137, 27);
		panel_3_1.add(panel_9_2_1_1);

		final JLabel vitalSignsLabel_2_1_1 = new JLabel();
		vitalSignsLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_1_1.setText("Crackles, rales, rhonchi");
		vitalSignsLabel_2_1_1.setBounds(3, 5, 133, 14);
		panel_9_2_1_1.add(vitalSignsLabel_2_1_1);

		final JPanel panel_9_2_2_2 = new JPanel();
		panel_9_2_2_2.setBackground(Color.WHITE);
		panel_9_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_2.setLayout(null);
		panel_9_2_2_2.setBounds(0, 140, 137, 45);
		panel_3_1.add(panel_9_2_2_2);

		final JLabel vitalSignsLabel_2_2_2 = new JLabel();
		vitalSignsLabel_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2_2
				.setText("<html>heart rate regular (R)<br>irregular (I)</html>");
		vitalSignsLabel_2_2_2.setBounds(5, 5, 127, 30);
		panel_9_2_2_2.add(vitalSignsLabel_2_2_2);

		final JPanel panel_9_2_2_1_1 = new JPanel();
		panel_9_2_2_1_1.setBackground(Color.WHITE);
		panel_9_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_1.setLayout(null);
		panel_9_2_2_1_1.setBounds(0, 184, 137, 27);
		panel_3_1.add(panel_9_2_2_1_1);

		final JLabel vitalSignsLabel_2_2_1_1 = new JLabel();
		vitalSignsLabel_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2_1_1.setText("Angina");
		vitalSignsLabel_2_2_1_1.setBounds(10, 5, 78, 14);
		panel_9_2_2_1_1.add(vitalSignsLabel_2_2_1_1);

		final JPanel panel_9_2_2_1_1_1 = new JPanel();
		panel_9_2_2_1_1_1.setBackground(Color.WHITE);
		panel_9_2_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_1_1.setLayout(null);
		panel_9_2_2_1_1_1.setBounds(0, 210, 137, 27);
		panel_3_1.add(panel_9_2_2_1_1_1);

		final JLabel vitalSignsLabel_2_2_1_1_1 = new JLabel();
		vitalSignsLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2_1_1_1.setText("Suctioned");
		vitalSignsLabel_2_2_1_1_1.setBounds(10, 5, 78, 14);
		panel_9_2_2_1_1_1.add(vitalSignsLabel_2_2_1_1_1);

		final JPanel panel_9_2_2_1_1_1_1 = new JPanel();
		panel_9_2_2_1_1_1_1.setBackground(Color.WHITE);
		panel_9_2_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_1_1_1.setLayout(null);
		panel_9_2_2_1_1_1_1.setBounds(0, 236, 137, 27);
		panel_3_1.add(panel_9_2_2_1_1_1_1);

		final JLabel vitalSignsLabel_2_2_1_1_1_1 = new JLabel();
		vitalSignsLabel_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2_1_1_1_1.setText("Trach care");
		vitalSignsLabel_2_2_1_1_1_1.setBounds(10, 5, 78, 14);
		panel_9_2_2_1_1_1_1.add(vitalSignsLabel_2_2_1_1_1_1);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(136, 0, 83, 263);
		panel_7_1.add(panel_4_1);

		final JPanel panel_10_2 = new JPanel();
		panel_10_2.setBackground(Color.WHITE);
		panel_10_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2.setLayout(null);
		panel_10_2.setBounds(0, 0, 83, 45);
		panel_4_1.add(panel_10_2);

		final JLabel vitalSignsLabel_3_2 = new JLabel();
		vitalSignsLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_2.setBackground(Color.WHITE);
		vitalSignsLabel_3_2.setText("7 - 3");
		vitalSignsLabel_3_2.setBounds(20, 15, 43, 14);
		panel_10_2.add(vitalSignsLabel_3_2);

		final JPanel panel_10_3_6 = new JPanel();
		panel_10_3_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6.setLayout(null);
		panel_10_3_6.setBounds(0, 114, 83, 27);
		panel_4_1.add(panel_10_3_6);

		txtCrackles73 = new JTextField();
		txtCrackles73.setBounds(1, 1, 80, 25);
		panel_10_3_6.add(txtCrackles73);

		final JPanel panel_10_3_1_2 = new JPanel();
		panel_10_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_2.setLayout(null);
		panel_10_3_1_2.setBounds(0, 140, 83, 45);
		panel_4_1.add(panel_10_3_1_2);

		txtheart73 = new JTextField();
		txtheart73.setBounds(1, 1, 80, 43);
		panel_10_3_1_2.add(txtheart73);

		final JPanel panel_10_3_2_2 = new JPanel();
		panel_10_3_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2.setLayout(null);
		panel_10_3_2_2.setBounds(0, 184, 83, 27);
		panel_4_1.add(panel_10_3_2_2);

		txtAngina73 = new JTextField();
		txtAngina73.setBounds(1, 1, 80, 25);
		panel_10_3_2_2.add(txtAngina73);

		final JPanel panel_10_3_3_2 = new JPanel();
		panel_10_3_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_3_2.setLayout(null);
		panel_10_3_3_2.setBounds(0, 210, 83, 27);
		panel_4_1.add(panel_10_3_3_2);

		txtSuctioned73 = new JTextField();
		txtSuctioned73.setBounds(1, 1, 80, 25);
		panel_10_3_3_2.add(txtSuctioned73);

		final JPanel panel_10_3_4_2 = new JPanel();
		panel_10_3_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_4_2.setLayout(null);
		panel_10_3_4_2.setBounds(0, 236, 83, 27);
		panel_4_1.add(panel_10_3_4_2);

		txtTrachCare73 = new JTextField();
		txtTrachCare73.setBounds(1, 1, 80, 25);
		panel_10_3_4_2.add(txtTrachCare73);

		final JPanel panel_10_3_6_1 = new JPanel();
		panel_10_3_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_1.setLayout(null);
		panel_10_3_6_1.setBounds(0, 44, 83, 27);
		panel_4_1.add(panel_10_3_6_1);

		txtBreath73 = new JTextField();
		txtBreath73.setBounds(1, 1, 80, 25);
		panel_10_3_6_1.add(txtBreath73);

		final JPanel panel_10_3_6_2 = new JPanel();
		panel_10_3_6_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2.setLayout(null);
		panel_10_3_6_2.setBounds(0, 70, 83, 45);
		panel_4_1.add(panel_10_3_6_2);

		txtLungs73 = new JTextField();
		txtLungs73.setBounds(1, 1, 80, 43);
		panel_10_3_6_2.add(txtLungs73);

		final JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(0, 262, 383, 95);
		panel_7_1.add(panel_8_1);

		final JLabel interventionsLabel_1 = new JLabel();
		interventionsLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		interventionsLabel_1.setText("Interventions :");
		interventionsLabel_1.setBounds(10, 10, 92, 14);
		panel_8_1.add(interventionsLabel_1);

		txtAreaRespirationIntervention = new JTextArea();
		txtAreaRespirationIntervention.setBorder(new LineBorder(Color.black, 1,
				false));
		txtAreaRespirationIntervention.setBounds(10, 27, 363, 58);
		panel_8_1.add(txtAreaRespirationIntervention);

		final JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(218, 0, 83, 263);
		panel_7_1.add(panel_4_1_1);

		final JPanel panel_10_2_1 = new JPanel();
		panel_10_2_1.setBackground(Color.WHITE);
		panel_10_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2_1.setLayout(null);
		panel_10_2_1.setBounds(0, 0, 83, 45);
		panel_4_1_1.add(panel_10_2_1);

		final JLabel vitalSignsLabel_3_2_1 = new JLabel();
		vitalSignsLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_2_1.setText("3 - 11");
		vitalSignsLabel_3_2_1.setBounds(20, 15, 43, 14);
		panel_10_2_1.add(vitalSignsLabel_3_2_1);

		final JPanel panel_10_3_6_3 = new JPanel();
		panel_10_3_6_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_3.setLayout(null);
		panel_10_3_6_3.setBounds(0, 114, 83, 27);
		panel_4_1_1.add(panel_10_3_6_3);

		txtCrackles311 = new JTextField();
		txtCrackles311.setBounds(1, 1, 80, 25);
		panel_10_3_6_3.add(txtCrackles311);

		final JPanel panel_10_3_1_2_1 = new JPanel();
		panel_10_3_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_2_1.setLayout(null);
		panel_10_3_1_2_1.setBounds(0, 140, 83, 45);
		panel_4_1_1.add(panel_10_3_1_2_1);

		txtheart311 = new JTextField();
		txtheart311.setBounds(1, 1, 80, 43);
		panel_10_3_1_2_1.add(txtheart311);

		final JPanel panel_10_3_2_2_1 = new JPanel();
		panel_10_3_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_1.setLayout(null);
		panel_10_3_2_2_1.setBounds(0, 184, 83, 27);
		panel_4_1_1.add(panel_10_3_2_2_1);

		txtAngina311 = new JTextField();
		txtAngina311.setBounds(1, 1, 80, 25);
		panel_10_3_2_2_1.add(txtAngina311);

		final JPanel panel_10_3_3_2_1 = new JPanel();
		panel_10_3_3_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_3_2_1.setLayout(null);
		panel_10_3_3_2_1.setBounds(0, 210, 83, 27);
		panel_4_1_1.add(panel_10_3_3_2_1);

		txtSuctioned311 = new JTextField();
		txtSuctioned311.setBounds(1, 1, 80, 25);
		panel_10_3_3_2_1.add(txtSuctioned311);

		final JPanel panel_10_3_4_2_1 = new JPanel();
		panel_10_3_4_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_4_2_1.setLayout(null);
		panel_10_3_4_2_1.setBounds(0, 236, 83, 27);
		panel_4_1_1.add(panel_10_3_4_2_1);

		txtTrachCare311 = new JTextField();
		txtTrachCare311.setBounds(1, 1, 80, 25);
		panel_10_3_4_2_1.add(txtTrachCare311);

		final JPanel panel_10_3_6_1_1 = new JPanel();
		panel_10_3_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_1_1.setLayout(null);
		panel_10_3_6_1_1.setBounds(0, 44, 83, 27);
		panel_4_1_1.add(panel_10_3_6_1_1);

		txtBreath311 = new JTextField();
		txtBreath311.setBounds(1, 1, 80, 25);
		panel_10_3_6_1_1.add(txtBreath311);

		final JPanel panel_10_3_6_2_1 = new JPanel();
		panel_10_3_6_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_1.setLayout(null);
		panel_10_3_6_2_1.setBounds(0, 70, 83, 45);
		panel_4_1_1.add(panel_10_3_6_2_1);

		txtLungs311 = new JTextField();
		txtLungs311.setBounds(1, 1, 80, 43);
		panel_10_3_6_2_1.add(txtLungs311);

		final JPanel panel_4_1_2 = new JPanel();
		panel_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_2.setLayout(null);
		panel_4_1_2.setBounds(300, 0, 83, 263);
		panel_7_1.add(panel_4_1_2);

		final JPanel panel_10_2_2 = new JPanel();
		panel_10_2_2.setBackground(Color.WHITE);
		panel_10_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2_2.setLayout(null);
		panel_10_2_2.setBounds(0, 0, 83, 45);
		panel_4_1_2.add(panel_10_2_2);

		final JLabel vitalSignsLabel_3_2_2 = new JLabel();
		vitalSignsLabel_3_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_2_2.setText("11 - 7");
		vitalSignsLabel_3_2_2.setBounds(20, 15, 43, 14);
		panel_10_2_2.add(vitalSignsLabel_3_2_2);

		final JPanel panel_10_3_6_4 = new JPanel();
		panel_10_3_6_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_4.setLayout(null);
		panel_10_3_6_4.setBounds(0, 114, 83, 27);
		panel_4_1_2.add(panel_10_3_6_4);

		txtCrackles117 = new JTextField();
		txtCrackles117.setBounds(1, 1, 80, 25);
		panel_10_3_6_4.add(txtCrackles117);

		final JPanel panel_10_3_1_2_2 = new JPanel();
		panel_10_3_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_2_2.setLayout(null);
		panel_10_3_1_2_2.setBounds(0, 140, 83, 45);
		panel_4_1_2.add(panel_10_3_1_2_2);

		txtheart117 = new JTextField();
		txtheart117.setBounds(1, 1, 80, 43);
		panel_10_3_1_2_2.add(txtheart117);

		final JPanel panel_10_3_2_2_2 = new JPanel();
		panel_10_3_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_2.setLayout(null);
		panel_10_3_2_2_2.setBounds(0, 184, 83, 27);
		panel_4_1_2.add(panel_10_3_2_2_2);

		txtAngina117 = new JTextField();
		txtAngina117.setBounds(1, 1, 80, 25);
		panel_10_3_2_2_2.add(txtAngina117);

		final JPanel panel_10_3_3_2_2 = new JPanel();
		panel_10_3_3_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_3_2_2.setLayout(null);
		panel_10_3_3_2_2.setBounds(0, 210, 83, 27);
		panel_4_1_2.add(panel_10_3_3_2_2);

		txtSuctioned117 = new JTextField();
		txtSuctioned117.setBounds(1, 1, 80, 25);
		panel_10_3_3_2_2.add(txtSuctioned117);

		final JPanel panel_10_3_4_2_2 = new JPanel();
		panel_10_3_4_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_4_2_2.setLayout(null);
		panel_10_3_4_2_2.setBounds(0, 236, 83, 27);
		panel_4_1_2.add(panel_10_3_4_2_2);

		txtTrachCare117 = new JTextField();
		txtTrachCare117.setBounds(1, 1, 80, 25);
		panel_10_3_4_2_2.add(txtTrachCare117);

		final JPanel panel_10_3_6_1_2 = new JPanel();
		panel_10_3_6_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_1_2.setLayout(null);
		panel_10_3_6_1_2.setBounds(0, 44, 83, 27);
		panel_4_1_2.add(panel_10_3_6_1_2);

		txtBreath117 = new JTextField();
		txtBreath117.setBounds(1, 1, 80, 25);
		panel_10_3_6_1_2.add(txtBreath117);

		final JPanel panel_10_3_6_2_2 = new JPanel();
		panel_10_3_6_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_2.setLayout(null);
		panel_10_3_6_2_2.setBounds(0, 70, 83, 45);
		panel_4_1_2.add(panel_10_3_6_2_2);

		txtLungs117 = new JTextField();
		txtLungs117.setBounds(1, 1, 80, 43);
		panel_10_3_6_2_2.add(txtLungs117);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(0, 606, 383, 323);
		panel_2.add(panel_7_1_1);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(0, 0, 137, 229);
		panel_7_1_1.add(panel_3_1_1);

		final JPanel panel_9_3_1 = new JPanel();
		panel_9_3_1.setBackground(Color.WHITE);
		panel_9_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1.setLayout(null);
		panel_9_3_1.setBounds(0, 0, 137, 45);
		panel_3_1_1.add(panel_9_3_1);

		final JLabel vitalSignsLabel_4_1 = new JLabel();
		vitalSignsLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_4_1.setText("Skin integrity");
		vitalSignsLabel_4_1.setBounds(10, 5, 117, 35);
		panel_9_3_1.add(vitalSignsLabel_4_1);

		final JPanel panel_9_1_1_1 = new JPanel();
		panel_9_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1.setLayout(null);
		panel_9_1_1_1.setBounds(0, 44, 137, 27);
		panel_3_1_1.add(panel_9_1_1_1);

		final JLabel vitalSignsLabel_1_1_1 = new JLabel();
		vitalSignsLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_1_1_1.setText("Skin intact");
		vitalSignsLabel_1_1_1.setBounds(10, 5, 117, 14);
		panel_9_1_1_1.add(vitalSignsLabel_1_1_1);

		final JPanel panel_9_2_3_1 = new JPanel();
		panel_9_2_3_1.setBackground(Color.WHITE);
		panel_9_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_3_1.setLayout(null);
		panel_9_2_3_1.setBounds(0, 70, 137, 45);
		panel_3_1_1.add(panel_9_2_3_1);

		final JLabel vitalSignsLabel_2_3_1 = new JLabel();
		vitalSignsLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_3_1
				.setText("<html>Sutures, staples, steri<br>strips (site)</html>");
		vitalSignsLabel_2_3_1.setBounds(10, 5, 127, 35);
		panel_9_2_3_1.add(vitalSignsLabel_2_3_1);

		final JPanel panel_9_2_2_2_1 = new JPanel();
		panel_9_2_2_2_1.setBackground(Color.WHITE);
		panel_9_2_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_2_1.setLayout(null);
		panel_9_2_2_2_1.setBounds(0, 114, 137, 71);
		panel_3_1_1.add(panel_9_2_2_2_1);

		final JLabel vitalSignsLabel_2_2_2_1 = new JLabel();
		vitalSignsLabel_2_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2_2_1
				.setText("<html>New skin concerns<br>(bruises, skin tears, <br>lacerations, rashes)");
		vitalSignsLabel_2_2_2_1.setBounds(5, 5, 127, 48);
		panel_9_2_2_2_1.add(vitalSignsLabel_2_2_2_1);

		final JPanel panel_9_2_2_1_1_2 = new JPanel();
		panel_9_2_2_1_1_2.setBackground(Color.WHITE);
		panel_9_2_2_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_1_2.setLayout(null);
		panel_9_2_2_1_1_2.setBounds(0, 184, 137, 45);
		panel_3_1_1.add(panel_9_2_2_1_1_2);

		final JLabel vitalSignsLabel_2_2_1_1_2 = new JLabel();
		vitalSignsLabel_2_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2_1_1_2
				.setText("<html>Wound (pressure,<br>stasis) indicate site</html>");
		vitalSignsLabel_2_2_1_1_2.setBounds(10, 5, 117, 30);
		panel_9_2_2_1_1_2.add(vitalSignsLabel_2_2_1_1_2);

		final JPanel panel_4_1_3 = new JPanel();
		panel_4_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_3.setLayout(null);
		panel_4_1_3.setBounds(136, 0, 83, 229);
		panel_7_1_1.add(panel_4_1_3);

		final JPanel panel_10_2_3 = new JPanel();
		panel_10_2_3.setBackground(Color.WHITE);
		panel_10_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2_3.setLayout(null);
		panel_10_2_3.setBounds(0, 0, 83, 45);
		panel_4_1_3.add(panel_10_2_3);

		final JLabel vitalSignsLabel_3_2_3 = new JLabel();
		vitalSignsLabel_3_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_2_3.setText("7 - 3");
		vitalSignsLabel_3_2_3.setBounds(20, 15, 43, 14);
		panel_10_2_3.add(vitalSignsLabel_3_2_3);

		final JPanel panel_10_3_1_2_3 = new JPanel();
		panel_10_3_1_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_2_3.setLayout(null);
		panel_10_3_1_2_3.setBounds(0, 114, 83, 71);
		panel_4_1_3.add(panel_10_3_1_2_3);

		txtNewSkin73 = new JTextField();
		txtNewSkin73.setBounds(1, 1, 80, 68);
		panel_10_3_1_2_3.add(txtNewSkin73);

		final JPanel panel_10_3_2_2_3 = new JPanel();
		panel_10_3_2_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_3.setLayout(null);
		panel_10_3_2_2_3.setBounds(0, 184, 83, 45);
		panel_4_1_3.add(panel_10_3_2_2_3);

		txtWound73 = new JTextField();
		txtWound73.setBounds(1, 1, 80, 42);
		panel_10_3_2_2_3.add(txtWound73);

		final JPanel panel_10_3_6_1_3 = new JPanel();
		panel_10_3_6_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_1_3.setLayout(null);
		panel_10_3_6_1_3.setBounds(0, 44, 83, 27);
		panel_4_1_3.add(panel_10_3_6_1_3);

		txtSkinIntact73 = new JTextField();
		txtSkinIntact73.setBounds(1, 1, 80, 25);
		panel_10_3_6_1_3.add(txtSkinIntact73);

		final JPanel panel_10_3_6_2_3 = new JPanel();
		panel_10_3_6_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_3.setLayout(null);
		panel_10_3_6_2_3.setBounds(0, 70, 83, 45);
		panel_4_1_3.add(panel_10_3_6_2_3);

		txtSutures73 = new JTextField();
		txtSutures73.setBounds(1, 1, 80, 43);
		panel_10_3_6_2_3.add(txtSutures73);

		final JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setBackground(Color.WHITE);
		panel_8_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBounds(0, 228, 383, 95);
		panel_7_1_1.add(panel_8_1_1);

		final JLabel interventionsLabel_1_1 = new JLabel();
		interventionsLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		interventionsLabel_1_1.setText("Interventions :");
		interventionsLabel_1_1.setBounds(10, 10, 92, 14);
		panel_8_1_1.add(interventionsLabel_1_1);

		txtAreaSkinIntervention = new JTextArea();
		txtAreaSkinIntervention
				.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaSkinIntervention.setBounds(10, 27, 363, 58);
		panel_8_1_1.add(txtAreaSkinIntervention);

		final JPanel panel_4_1_1_1 = new JPanel();
		panel_4_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_1_1.setLayout(null);
		panel_4_1_1_1.setBounds(218, 0, 83, 229);
		panel_7_1_1.add(panel_4_1_1_1);

		final JPanel panel_10_2_1_1 = new JPanel();
		panel_10_2_1_1.setBackground(Color.WHITE);
		panel_10_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2_1_1.setLayout(null);
		panel_10_2_1_1.setBounds(0, 0, 83, 45);
		panel_4_1_1_1.add(panel_10_2_1_1);

		final JLabel vitalSignsLabel_3_2_1_1 = new JLabel();
		vitalSignsLabel_3_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_2_1_1.setText("3 - 11");
		vitalSignsLabel_3_2_1_1.setBounds(20, 15, 43, 14);
		panel_10_2_1_1.add(vitalSignsLabel_3_2_1_1);

		final JPanel panel_10_3_1_2_1_1 = new JPanel();
		panel_10_3_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_2_1_1.setLayout(null);
		panel_10_3_1_2_1_1.setBounds(0, 114, 83, 71);
		panel_4_1_1_1.add(panel_10_3_1_2_1_1);

		txtNewSkin311 = new JTextField();
		txtNewSkin311.setBounds(1, 1, 80, 68);
		panel_10_3_1_2_1_1.add(txtNewSkin311);

		final JPanel panel_10_3_2_2_1_1 = new JPanel();
		panel_10_3_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_1_1.setLayout(null);
		panel_10_3_2_2_1_1.setBounds(0, 184, 83, 45);
		panel_4_1_1_1.add(panel_10_3_2_2_1_1);

		txtWound311 = new JTextField();
		txtWound311.setBounds(1, 1, 80, 42);
		panel_10_3_2_2_1_1.add(txtWound311);

		final JPanel panel_10_3_6_1_1_1 = new JPanel();
		panel_10_3_6_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_1_1_1.setLayout(null);
		panel_10_3_6_1_1_1.setBounds(0, 44, 83, 27);
		panel_4_1_1_1.add(panel_10_3_6_1_1_1);

		txtSkinIntact311 = new JTextField();
		txtSkinIntact311.setBounds(1, 1, 80, 25);
		panel_10_3_6_1_1_1.add(txtSkinIntact311);

		final JPanel panel_10_3_6_2_1_1 = new JPanel();
		panel_10_3_6_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_1_1.setLayout(null);
		panel_10_3_6_2_1_1.setBounds(0, 70, 83, 45);
		panel_4_1_1_1.add(panel_10_3_6_2_1_1);

		txtSutures311 = new JTextField();
		txtSutures311.setBounds(1, 1, 80, 43);
		panel_10_3_6_2_1_1.add(txtSutures311);

		final JPanel panel_4_1_2_1 = new JPanel();
		panel_4_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_2_1.setLayout(null);
		panel_4_1_2_1.setBounds(300, 0, 83, 229);
		panel_7_1_1.add(panel_4_1_2_1);

		final JPanel panel_10_2_2_1 = new JPanel();
		panel_10_2_2_1.setBackground(Color.WHITE);
		panel_10_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2_2_1.setLayout(null);
		panel_10_2_2_1.setBounds(0, 0, 83, 45);
		panel_4_1_2_1.add(panel_10_2_2_1);

		final JLabel vitalSignsLabel_3_2_2_1 = new JLabel();
		vitalSignsLabel_3_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_2_2_1.setText("11 - 7");
		vitalSignsLabel_3_2_2_1.setBounds(20, 15, 43, 14);
		panel_10_2_2_1.add(vitalSignsLabel_3_2_2_1);

		final JPanel panel_10_3_1_2_2_1 = new JPanel();
		panel_10_3_1_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_2_2_1.setLayout(null);
		panel_10_3_1_2_2_1.setBounds(0, 114, 83, 71);
		panel_4_1_2_1.add(panel_10_3_1_2_2_1);

		txtNewSkin117 = new JTextField();
		txtNewSkin117.setBounds(1, 1, 80, 68);
		panel_10_3_1_2_2_1.add(txtNewSkin117);

		final JPanel panel_10_3_2_2_2_1 = new JPanel();
		panel_10_3_2_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_2_1.setLayout(null);
		panel_10_3_2_2_2_1.setBounds(0, 184, 83, 45);
		panel_4_1_2_1.add(panel_10_3_2_2_2_1);

		txtWound117 = new JTextField();
		txtWound117.setBounds(1, 1, 80, 42);
		panel_10_3_2_2_2_1.add(txtWound117);

		final JPanel panel_10_3_6_1_2_1 = new JPanel();
		panel_10_3_6_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_1_2_1.setLayout(null);
		panel_10_3_6_1_2_1.setBounds(0, 44, 83, 27);
		panel_4_1_2_1.add(panel_10_3_6_1_2_1);

		txtSkinIntact117 = new JTextField();
		txtSkinIntact117.setBounds(1, 1, 80, 25);
		panel_10_3_6_1_2_1.add(txtSkinIntact117);

		final JPanel panel_10_3_6_2_2_1 = new JPanel();
		panel_10_3_6_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_2_1.setLayout(null);
		panel_10_3_6_2_2_1.setBounds(0, 70, 83, 45);
		panel_4_1_2_1.add(panel_10_3_6_2_2_1);

		txtSutures117 = new JTextField();
		txtSutures117.setBounds(1, 1, 80, 43);
		panel_10_3_6_2_2_1.add(txtSutures117);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(0, 928, 383, 269);
		panel_2.add(panel_7_2);

		final JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(0, 0, 137, 175);
		panel_7_2.add(panel_3_2);

		final JPanel panel_9_4 = new JPanel();
		panel_9_4.setBackground(Color.WHITE);
		panel_9_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_4.setLayout(null);
		panel_9_4.setBounds(0, 0, 137, 45);
		panel_3_2.add(panel_9_4);

		final JLabel vitalSignsLabel_5 = new JLabel();
		vitalSignsLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_5
				.setText("<html>Other skilled care:<br>(specify)</html>");
		vitalSignsLabel_5.setBounds(10, 5, 117, 30);
		panel_9_4.add(vitalSignsLabel_5);

		final JPanel panel_9_1_2 = new JPanel();
		panel_9_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_2.setLayout(null);
		panel_9_1_2.setBounds(0, 44, 137, 27);
		panel_3_2.add(panel_9_1_2);

		txtOtherSkilled1 = new JTextField();
		txtOtherSkilled1.setBounds(1, 1, 135, 25);
		panel_9_1_2.add(txtOtherSkilled1);

		final JPanel panel_9_2_4 = new JPanel();
		panel_9_2_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_4.setLayout(null);
		panel_9_2_4.setBounds(0, 70, 137, 27);
		panel_3_2.add(panel_9_2_4);

		txtOtherSkilled2 = new JTextField();
		txtOtherSkilled2.setBounds(1, 1, 135, 25);
		panel_9_2_4.add(txtOtherSkilled2);

		final JPanel panel_9_2_1_2 = new JPanel();
		panel_9_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_1_2.setLayout(null);
		panel_9_2_1_2.setBounds(0, 96, 137, 27);
		panel_3_2.add(panel_9_2_1_2);

		txtOtherSkilled3 = new JTextField();
		txtOtherSkilled3.setBounds(1, 1, 135, 25);
		panel_9_2_1_2.add(txtOtherSkilled3);

		final JPanel panel_9_2_2_3 = new JPanel();
		panel_9_2_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_3.setLayout(null);
		panel_9_2_2_3.setBounds(0, 122, 137, 27);
		panel_3_2.add(panel_9_2_2_3);

		txtOtherSkilled4 = new JTextField();
		txtOtherSkilled4.setBounds(1, 1, 135, 25);
		panel_9_2_2_3.add(txtOtherSkilled4);

		final JPanel panel_9_2_2_1_2 = new JPanel();
		panel_9_2_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_2.setLayout(null);
		panel_9_2_2_1_2.setBounds(0, 148, 137, 27);
		panel_3_2.add(panel_9_2_2_1_2);

		txtOtherSkilled5 = new JTextField();
		txtOtherSkilled5.setBounds(1, 1, 135, 25);
		panel_9_2_2_1_2.add(txtOtherSkilled5);

		final JPanel panel_4_2 = new JPanel();
		panel_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2.setLayout(null);
		panel_4_2.setBounds(136, 0, 83, 175);
		panel_7_2.add(panel_4_2);

		final JPanel panel_10_4 = new JPanel();
		panel_10_4.setBackground(Color.WHITE);
		panel_10_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_4.setLayout(null);
		panel_10_4.setBounds(0, 0, 83, 45);
		panel_4_2.add(panel_10_4);

		final JLabel vitalSignsLabel_3_3 = new JLabel();
		vitalSignsLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_3.setText("7 - 3");
		vitalSignsLabel_3_3.setBounds(30, 10, 43, 14);
		panel_10_4.add(vitalSignsLabel_3_3);

		final JPanel panel_10_3_7 = new JPanel();
		panel_10_3_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_7.setLayout(null);
		panel_10_3_7.setBounds(0, 44, 83, 27);
		panel_4_2.add(panel_10_3_7);

		txtOtherSkilled173 = new JTextField();
		txtOtherSkilled173.setBounds(1, 1, 80, 25);
		panel_10_3_7.add(txtOtherSkilled173);

		final JPanel panel_10_3_1_3 = new JPanel();
		panel_10_3_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_3.setLayout(null);
		panel_10_3_1_3.setBounds(0, 70, 83, 27);
		panel_4_2.add(panel_10_3_1_3);

		txtOtherSkilled273 = new JTextField();
		txtOtherSkilled273.setBounds(1, 1, 80, 25);
		panel_10_3_1_3.add(txtOtherSkilled273);

		final JPanel panel_10_3_2_3 = new JPanel();
		panel_10_3_2_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_3.setLayout(null);
		panel_10_3_2_3.setBounds(0, 96, 83, 27);
		panel_4_2.add(panel_10_3_2_3);

		txtOtherSkilled373 = new JTextField();
		txtOtherSkilled373.setBounds(1, 1, 80, 25);
		panel_10_3_2_3.add(txtOtherSkilled373);

		final JPanel panel_10_3_3_3 = new JPanel();
		panel_10_3_3_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_3_3.setLayout(null);
		panel_10_3_3_3.setBounds(0, 122, 83, 27);
		panel_4_2.add(panel_10_3_3_3);

		txtOtherSkilled473 = new JTextField();
		txtOtherSkilled473.setBounds(1, 1, 80, 25);
		panel_10_3_3_3.add(txtOtherSkilled473);

		final JPanel panel_10_3_4_3 = new JPanel();
		panel_10_3_4_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_4_3.setLayout(null);
		panel_10_3_4_3.setBounds(0, 148, 83, 27);
		panel_4_2.add(panel_10_3_4_3);

		txtOtherSkilled573 = new JTextField();
		txtOtherSkilled573.setBounds(1, 1, 80, 25);
		panel_10_3_4_3.add(txtOtherSkilled573);

		final JPanel panel_8_2 = new JPanel();
		panel_8_2.setBackground(Color.WHITE);
		panel_8_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_8_2.setLayout(null);
		panel_8_2.setBounds(0, 174, 383, 95);
		panel_7_2.add(panel_8_2);

		final JLabel interventionsLabel_2 = new JLabel();
		interventionsLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		interventionsLabel_2.setText("Interventions :");
		interventionsLabel_2.setBounds(10, 10, 92, 14);
		panel_8_2.add(interventionsLabel_2);

		txtAreaOtherIntervention = new JTextArea();
		txtAreaOtherIntervention
				.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaOtherIntervention.setBounds(10, 27, 363, 58);
		panel_8_2.add(txtAreaOtherIntervention);

		final JPanel panel_4_2_1 = new JPanel();
		panel_4_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_1.setLayout(null);
		panel_4_2_1.setBounds(218, 0, 83, 175);
		panel_7_2.add(panel_4_2_1);

		final JPanel panel_10_4_1 = new JPanel();
		panel_10_4_1.setBackground(Color.WHITE);
		panel_10_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_4_1.setLayout(null);
		panel_10_4_1.setBounds(0, 0, 83, 45);
		panel_4_2_1.add(panel_10_4_1);

		final JLabel vitalSignsLabel_3_3_1 = new JLabel();
		vitalSignsLabel_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_3_1.setText("3 - 11");
		vitalSignsLabel_3_3_1.setBounds(30, 10, 43, 14);
		panel_10_4_1.add(vitalSignsLabel_3_3_1);

		final JPanel panel_10_3_7_1 = new JPanel();
		panel_10_3_7_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_7_1.setLayout(null);
		panel_10_3_7_1.setBounds(0, 44, 83, 27);
		panel_4_2_1.add(panel_10_3_7_1);

		txtOtherSkilled1311 = new JTextField();
		txtOtherSkilled1311.setBounds(1, 1, 80, 25);
		panel_10_3_7_1.add(txtOtherSkilled1311);

		final JPanel panel_10_3_1_3_1 = new JPanel();
		panel_10_3_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_3_1.setLayout(null);
		panel_10_3_1_3_1.setBounds(0, 70, 83, 27);
		panel_4_2_1.add(panel_10_3_1_3_1);

		txtOtherSkilled2311 = new JTextField();
		txtOtherSkilled2311.setBounds(1, 1, 80, 25);
		panel_10_3_1_3_1.add(txtOtherSkilled2311);

		final JPanel panel_10_3_2_3_1 = new JPanel();
		panel_10_3_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_3_1.setLayout(null);
		panel_10_3_2_3_1.setBounds(0, 96, 83, 27);
		panel_4_2_1.add(panel_10_3_2_3_1);

		txtOtherSkilled3311 = new JTextField();
		txtOtherSkilled3311.setBounds(1, 1, 80, 25);
		panel_10_3_2_3_1.add(txtOtherSkilled3311);

		final JPanel panel_10_3_3_3_1 = new JPanel();
		panel_10_3_3_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_3_3_1.setLayout(null);
		panel_10_3_3_3_1.setBounds(0, 122, 83, 27);
		panel_4_2_1.add(panel_10_3_3_3_1);

		txtOtherSkilled4311 = new JTextField();
		txtOtherSkilled4311.setBounds(1, 1, 80, 25);
		panel_10_3_3_3_1.add(txtOtherSkilled4311);

		final JPanel panel_10_3_4_3_1 = new JPanel();
		panel_10_3_4_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_4_3_1.setLayout(null);
		panel_10_3_4_3_1.setBounds(0, 148, 83, 27);
		panel_4_2_1.add(panel_10_3_4_3_1);

		txtOtherSkilled5311 = new JTextField();
		txtOtherSkilled5311.setBounds(1, 1, 80, 25);
		panel_10_3_4_3_1.add(txtOtherSkilled5311);

		final JPanel panel_4_2_2 = new JPanel();
		panel_4_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_2_2.setLayout(null);
		panel_4_2_2.setBounds(300, 0, 83, 175);
		panel_7_2.add(panel_4_2_2);

		final JPanel panel_10_4_2 = new JPanel();
		panel_10_4_2.setBackground(Color.WHITE);
		panel_10_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_4_2.setLayout(null);
		panel_10_4_2.setBounds(0, 0, 83, 45);
		panel_4_2_2.add(panel_10_4_2);

		final JLabel vitalSignsLabel_3_3_2 = new JLabel();
		vitalSignsLabel_3_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_3_2.setText("11 - 7");
		vitalSignsLabel_3_3_2.setBounds(30, 10, 43, 14);
		panel_10_4_2.add(vitalSignsLabel_3_3_2);

		final JPanel panel_10_3_7_2 = new JPanel();
		panel_10_3_7_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_7_2.setLayout(null);
		panel_10_3_7_2.setBounds(0, 44, 83, 27);
		panel_4_2_2.add(panel_10_3_7_2);

		txtOtherSkilled1117 = new JTextField();
		txtOtherSkilled1117.setBounds(1, 1, 80, 25);
		panel_10_3_7_2.add(txtOtherSkilled1117);

		final JPanel panel_10_3_1_3_2 = new JPanel();
		panel_10_3_1_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_3_2.setLayout(null);
		panel_10_3_1_3_2.setBounds(0, 70, 83, 27);
		panel_4_2_2.add(panel_10_3_1_3_2);

		txtOtherSkilled2117 = new JTextField();
		txtOtherSkilled2117.setBounds(1, 1, 80, 25);
		panel_10_3_1_3_2.add(txtOtherSkilled2117);

		final JPanel panel_10_3_2_3_2 = new JPanel();
		panel_10_3_2_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_3_2.setLayout(null);
		panel_10_3_2_3_2.setBounds(0, 96, 83, 27);
		panel_4_2_2.add(panel_10_3_2_3_2);

		txtOtherSkilled3117 = new JTextField();
		txtOtherSkilled3117.setBounds(1, 1, 80, 25);
		panel_10_3_2_3_2.add(txtOtherSkilled3117);

		final JPanel panel_10_3_3_3_2 = new JPanel();
		panel_10_3_3_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_3_3_2.setLayout(null);
		panel_10_3_3_3_2.setBounds(0, 122, 83, 27);
		panel_4_2_2.add(panel_10_3_3_3_2);

		txtOtherSkilled4117 = new JTextField();
		txtOtherSkilled4117.setBounds(1, 1, 80, 25);
		panel_10_3_3_3_2.add(txtOtherSkilled4117);

		final JPanel panel_10_3_4_3_2 = new JPanel();
		panel_10_3_4_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_4_3_2.setLayout(null);
		panel_10_3_4_3_2.setBounds(0, 148, 83, 27);
		panel_4_2_2.add(panel_10_3_4_3_2);

		txtOtherSkilled5117 = new JTextField();
		txtOtherSkilled5117.setBounds(1, 1, 80, 25);
		panel_10_3_4_3_2.add(txtOtherSkilled5117);

		final JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		panel_5.setBounds(402, 0, 498, 1286);
		panel.add(panel_5);

		final JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 0, 498, 286);
		panel_5.add(panel_6);

		final JLabel label = new JLabel();
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setText("7 - 3  Shift  (Check all that apply)");
		label.setBounds(10, 10, 304, 20);
		panel_6.add(label);

		final JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBounds(0, 36, 496, 250);
		panel_6.add(panel_11);

		final JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.black, 1, false));
		panel_12.setLayout(null);
		panel_12.setBounds(0, 0, 166, 250);
		panel_11.add(panel_12);

		final JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setBorder(new LineBorder(Color.black, 1, false));
		panel_13.setLayout(null);
		panel_13.setBounds(0, 0, 166, 23);
		panel_12.add(panel_13);

		final JLabel bedMobilityLabel = new JLabel();
		bedMobilityLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		bedMobilityLabel.setText("Bed mobility");
		bedMobilityLabel.setBounds(21, 5, 98, 14);
		panel_13.add(bedMobilityLabel);

		final JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_14.setBorder(new LineBorder(Color.black, 1, false));
		panel_14.setLayout(null);
		panel_14.setBounds(0, 22, 166, 23);
		panel_12.add(panel_14);

		cbBedIndependent73 = new JCheckBox();
		cbBedIndependent73.setBackground(Color.WHITE);
		cbBedIndependent73.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedIndependent73.setText("Independent");
		cbBedIndependent73.setBounds(10, 2, 94, 18);
		panel_14.add(cbBedIndependent73);

		final JPanel panel_14_1 = new JPanel();
		panel_14_1.setBackground(Color.WHITE);
		panel_14_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1.setLayout(null);
		panel_14_1.setBounds(0, 44, 166, 57);
		panel_12.add(panel_14_1);

		cbBedLimited73 = new JCheckBox();
		cbBedLimited73.setBackground(Color.WHITE);
		cbBedLimited73.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedLimited73
				.setText("<html>Limited<br>(resident does<br>most of care)</html> ");
		cbBedLimited73.setBounds(10, 2, 146, 52);
		panel_14_1.add(cbBedLimited73);

		final JPanel panel_14_1_1 = new JPanel();
		panel_14_1_1.setBackground(Color.WHITE);
		panel_14_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1.setLayout(null);
		panel_14_1_1.setBounds(0, 100, 166, 57);
		panel_12.add(panel_14_1_1);

		cbBedExtensive173 = new JCheckBox();
		cbBedExtensive173.setBackground(Color.WHITE);
		cbBedExtensive173.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedExtensive173
				.setText("<html>Extensive, 1<br>person (staff<br>does most of care)</html>");
		cbBedExtensive173.setBounds(10, 2, 146, 52);
		panel_14_1_1.add(cbBedExtensive173);

		final JPanel panel_14_1_1_1 = new JPanel();
		panel_14_1_1_1.setBackground(Color.WHITE);
		panel_14_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1.setLayout(null);
		panel_14_1_1_1.setBounds(0, 156, 166, 57);
		panel_12.add(panel_14_1_1_1);

		cbBedExtensive273 = new JCheckBox();
		cbBedExtensive273.setBackground(Color.WHITE);
		cbBedExtensive273.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedExtensive273
				.setText("<html>Extensive, 2<br>person (staff<br>does most of care)</html>");
		cbBedExtensive273.setBounds(10, 2, 146, 52);
		panel_14_1_1_1.add(cbBedExtensive273);

		final JPanel panel_14_1_1_1_1 = new JPanel();
		panel_14_1_1_1_1.setBackground(Color.WHITE);
		panel_14_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_1.setLayout(null);
		panel_14_1_1_1_1.setBounds(0, 212, 166, 38);
		panel_12.add(panel_14_1_1_1_1);

		cbBedTotal73 = new JCheckBox();
		cbBedTotal73.setBackground(Color.WHITE);
		cbBedTotal73.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedTotal73.setText("<html>Total<br>dependence</html>");
		cbBedTotal73.setBounds(10, 2, 146, 32);
		panel_14_1_1_1_1.add(cbBedTotal73);

		final JPanel panel_12_1 = new JPanel();
		panel_12_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_1.setLayout(null);
		panel_12_1.setBounds(165, 0, 166, 250);
		panel_11.add(panel_12_1);

		final JPanel panel_13_1 = new JPanel();
		panel_13_1.setBackground(Color.WHITE);
		panel_13_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_1.setLayout(null);
		panel_13_1.setBounds(0, 0, 166, 23);
		panel_12_1.add(panel_13_1);

		final JLabel bedMobilityLabel_1 = new JLabel();
		bedMobilityLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		bedMobilityLabel_1.setText("Transfer");
		bedMobilityLabel_1.setBounds(21, 5, 98, 14);
		panel_13_1.add(bedMobilityLabel_1);

		final JPanel panel_14_2 = new JPanel();
		panel_14_2.setBackground(Color.WHITE);
		panel_14_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_2.setLayout(null);
		panel_14_2.setBounds(0, 22, 166, 23);
		panel_12_1.add(panel_14_2);

		cbTransferIndependent73 = new JCheckBox();
		cbTransferIndependent73.setBackground(Color.WHITE);
		cbTransferIndependent73.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferIndependent73.setText("Independent");
		cbTransferIndependent73.setBounds(10, 2, 94, 18);
		panel_14_2.add(cbTransferIndependent73);

		final JPanel panel_14_1_2 = new JPanel();
		panel_14_1_2.setBackground(Color.WHITE);
		panel_14_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_2.setLayout(null);
		panel_14_1_2.setBounds(0, 44, 166, 57);
		panel_12_1.add(panel_14_1_2);

		cbTransferLimited73 = new JCheckBox();
		cbTransferLimited73.setBackground(Color.WHITE);
		cbTransferLimited73.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferLimited73
				.setText("<html>Limited<br>(resident does<br>most of care)</html> ");
		cbTransferLimited73.setBounds(10, 2, 146, 52);
		panel_14_1_2.add(cbTransferLimited73);

		final JPanel panel_14_1_1_2 = new JPanel();
		panel_14_1_1_2.setBackground(Color.WHITE);
		panel_14_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_2.setLayout(null);
		panel_14_1_1_2.setBounds(0, 100, 166, 57);
		panel_12_1.add(panel_14_1_1_2);

		cbTransferExtensive173 = new JCheckBox();
		cbTransferExtensive173.setBackground(Color.WHITE);
		cbTransferExtensive173.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferExtensive173
				.setText("<html>Extensive, 1<br>person (staff<br>does most of care)</html>");
		cbTransferExtensive173.setBounds(10, 2, 146, 52);
		panel_14_1_1_2.add(cbTransferExtensive173);

		final JPanel panel_14_1_1_1_2 = new JPanel();
		panel_14_1_1_1_2.setBackground(Color.WHITE);
		panel_14_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_2.setLayout(null);
		panel_14_1_1_1_2.setBounds(0, 156, 166, 57);
		panel_12_1.add(panel_14_1_1_1_2);

		cbTransferExtensive273 = new JCheckBox();
		cbTransferExtensive273.setBackground(Color.WHITE);
		cbTransferExtensive273.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferExtensive273
				.setText("<html>Extensive, 2<br>person (staff<br>does most of care)</html>");
		cbTransferExtensive273.setBounds(10, 2, 146, 52);
		panel_14_1_1_1_2.add(cbTransferExtensive273);

		final JPanel panel_14_1_1_1_1_1 = new JPanel();
		panel_14_1_1_1_1_1.setBackground(Color.WHITE);
		panel_14_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_1_1.setLayout(null);
		panel_14_1_1_1_1_1.setBounds(0, 212, 166, 38);
		panel_12_1.add(panel_14_1_1_1_1_1);

		cbTransferTotal73 = new JCheckBox();
		cbTransferTotal73.setBackground(Color.WHITE);
		cbTransferTotal73.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferTotal73.setText("<html>Total<br>dependence</html>");
		cbTransferTotal73.setBounds(10, 2, 146, 32);
		panel_14_1_1_1_1_1.add(cbTransferTotal73);

		final JPanel panel_12_2 = new JPanel();
		panel_12_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_2.setLayout(null);
		panel_12_2.setBounds(330, 0, 166, 250);
		panel_11.add(panel_12_2);

		final JPanel panel_13_2 = new JPanel();
		panel_13_2.setBackground(Color.WHITE);
		panel_13_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_13_2.setLayout(null);
		panel_13_2.setBounds(0, 0, 166, 23);
		panel_12_2.add(panel_13_2);

		final JLabel bedMobilityLabel_2 = new JLabel();
		bedMobilityLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		bedMobilityLabel_2.setText("Toileting");
		bedMobilityLabel_2.setBounds(21, 5, 98, 14);
		panel_13_2.add(bedMobilityLabel_2);

		final JPanel panel_14_3 = new JPanel();
		panel_14_3.setBackground(Color.WHITE);
		panel_14_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_3.setLayout(null);
		panel_14_3.setBounds(0, 22, 166, 23);
		panel_12_2.add(panel_14_3);

		cbToiletingIndependent73 = new JCheckBox();
		cbToiletingIndependent73.setBackground(Color.WHITE);
		cbToiletingIndependent73.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingIndependent73.setText("Independent");
		cbToiletingIndependent73.setBounds(10, 2, 94, 18);
		panel_14_3.add(cbToiletingIndependent73);

		final JPanel panel_14_1_3 = new JPanel();
		panel_14_1_3.setBackground(Color.WHITE);
		panel_14_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_3.setLayout(null);
		panel_14_1_3.setBounds(0, 44, 166, 57);
		panel_12_2.add(panel_14_1_3);

		cbToiletingLimited73 = new JCheckBox();
		cbToiletingLimited73.setBackground(Color.WHITE);
		cbToiletingLimited73.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingLimited73
				.setText("<html>Limited<br>(resident does<br>most of care)</html> ");
		cbToiletingLimited73.setBounds(10, 2, 146, 52);
		panel_14_1_3.add(cbToiletingLimited73);

		final JPanel panel_14_1_1_3 = new JPanel();
		panel_14_1_1_3.setBackground(Color.WHITE);
		panel_14_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_3.setLayout(null);
		panel_14_1_1_3.setBounds(0, 100, 166, 57);
		panel_12_2.add(panel_14_1_1_3);

		cbToiletingExtensive173 = new JCheckBox();
		cbToiletingExtensive173.setBackground(Color.WHITE);
		cbToiletingExtensive173.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingExtensive173
				.setText("<html>Extensive, 1<br>person (staff<br>does most of care)</html>");
		cbToiletingExtensive173.setBounds(10, 2, 146, 52);
		panel_14_1_1_3.add(cbToiletingExtensive173);

		final JPanel panel_14_1_1_1_3 = new JPanel();
		panel_14_1_1_1_3.setBackground(Color.WHITE);
		panel_14_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_3.setLayout(null);
		panel_14_1_1_1_3.setBounds(0, 156, 166, 57);
		panel_12_2.add(panel_14_1_1_1_3);

		cbToiletingExtensive273 = new JCheckBox();
		cbToiletingExtensive273.setBackground(Color.WHITE);
		cbToiletingExtensive273.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingExtensive273
				.setText("<html>Extensive, 2<br>person (staff<br>does most of care)</html>");
		cbToiletingExtensive273.setBounds(10, 2, 146, 52);
		panel_14_1_1_1_3.add(cbToiletingExtensive273);

		final JPanel panel_14_1_1_1_1_2 = new JPanel();
		panel_14_1_1_1_1_2.setBackground(Color.WHITE);
		panel_14_1_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_1_2.setLayout(null);
		panel_14_1_1_1_1_2.setBounds(0, 212, 166, 38);
		panel_12_2.add(panel_14_1_1_1_1_2);

		cbToiletingTotal73 = new JCheckBox();
		cbToiletingTotal73.setBackground(Color.WHITE);
		cbToiletingTotal73.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingTotal73.setText("<html>Total<br>dependence</html>");
		cbToiletingTotal73.setBounds(10, 2, 146, 32);
		panel_14_1_1_1_1_2.add(cbToiletingTotal73);

		final JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1.setBackground(Color.WHITE);
		panel_6_1.setLayout(null);
		panel_6_1.setBounds(0, 285, 496, 264);
		panel_5.add(panel_6_1);

		final JLabel label_1 = new JLabel();
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setText("3 - 11  Shift  (Check all that apply)");
		label_1.setBounds(10, 10, 304, 20);
		panel_6_1.add(label_1);

		final JPanel panel_11_1 = new JPanel();
		panel_11_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_1.setLayout(null);
		panel_11_1.setBounds(0, 36, 496, 228);
		panel_6_1.add(panel_11_1);

		final JPanel panel_12_3 = new JPanel();
		panel_12_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_3.setLayout(null);
		panel_12_3.setBounds(0, 0, 166, 228);
		panel_11_1.add(panel_12_3);

		final JPanel panel_14_4 = new JPanel();
		panel_14_4.setBackground(Color.WHITE);
		panel_14_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_4.setLayout(null);
		panel_14_4.setBounds(0, 0, 166, 23);
		panel_12_3.add(panel_14_4);

		cbBedIndependent311 = new JCheckBox();
		cbBedIndependent311.setBackground(Color.WHITE);
		cbBedIndependent311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedIndependent311.setText("Independent");
		cbBedIndependent311.setBounds(10, 2, 94, 18);
		panel_14_4.add(cbBedIndependent311);

		final JPanel panel_14_1_4 = new JPanel();
		panel_14_1_4.setBackground(Color.WHITE);
		panel_14_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_4.setLayout(null);
		panel_14_1_4.setBounds(0, 22, 166, 57);
		panel_12_3.add(panel_14_1_4);

		cbBedLimited311 = new JCheckBox();
		cbBedLimited311.setBackground(Color.WHITE);
		cbBedLimited311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedLimited311
				.setText("<html>Limited<br>(resident does<br>most of care)</html> ");
		cbBedLimited311.setBounds(10, 2, 146, 52);
		panel_14_1_4.add(cbBedLimited311);

		final JPanel panel_14_1_1_4 = new JPanel();
		panel_14_1_1_4.setBackground(Color.WHITE);
		panel_14_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_4.setLayout(null);
		panel_14_1_1_4.setBounds(0, 78, 166, 57);
		panel_12_3.add(panel_14_1_1_4);

		cbBedExtensive1311 = new JCheckBox();
		cbBedExtensive1311.setBackground(Color.WHITE);
		cbBedExtensive1311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedExtensive1311
				.setText("<html>Extensive, 1<br>person (staff<br>does most of care)</html>");
		cbBedExtensive1311.setBounds(10, 2, 146, 52);
		panel_14_1_1_4.add(cbBedExtensive1311);

		final JPanel panel_14_1_1_1_4 = new JPanel();
		panel_14_1_1_1_4.setBackground(Color.WHITE);
		panel_14_1_1_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_4.setLayout(null);
		panel_14_1_1_1_4.setBounds(0, 134, 166, 57);
		panel_12_3.add(panel_14_1_1_1_4);

		cbBedExtensive2311 = new JCheckBox();
		cbBedExtensive2311.setBackground(Color.WHITE);
		cbBedExtensive2311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedExtensive2311
				.setText("<html>Extensive, 2<br>person (staff<br>does most of care)</html>");
		cbBedExtensive2311.setBounds(10, 2, 146, 52);
		panel_14_1_1_1_4.add(cbBedExtensive2311);

		final JPanel panel_14_1_1_1_1_3 = new JPanel();
		panel_14_1_1_1_1_3.setBackground(Color.WHITE);
		panel_14_1_1_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_1_3.setLayout(null);
		panel_14_1_1_1_1_3.setBounds(0, 190, 166, 38);
		panel_12_3.add(panel_14_1_1_1_1_3);

		cbBedTotal311 = new JCheckBox();
		cbBedTotal311.setBackground(Color.WHITE);
		cbBedTotal311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedTotal311.setText("<html>Total<br>dependence</html>");
		cbBedTotal311.setBounds(10, 2, 146, 32);
		panel_14_1_1_1_1_3.add(cbBedTotal311);

		final JPanel panel_12_3_1 = new JPanel();
		panel_12_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_3_1.setLayout(null);
		panel_12_3_1.setBounds(165, 0, 166, 228);
		panel_11_1.add(panel_12_3_1);

		final JPanel panel_14_4_1 = new JPanel();
		panel_14_4_1.setBackground(Color.WHITE);
		panel_14_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_4_1.setLayout(null);
		panel_14_4_1.setBounds(0, 0, 166, 23);
		panel_12_3_1.add(panel_14_4_1);

		cbTransferIndependent311 = new JCheckBox();
		cbTransferIndependent311.setBackground(Color.WHITE);
		cbTransferIndependent311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferIndependent311.setText("Independent");
		cbTransferIndependent311.setBounds(10, 2, 94, 18);
		panel_14_4_1.add(cbTransferIndependent311);

		final JPanel panel_14_1_4_1 = new JPanel();
		panel_14_1_4_1.setBackground(Color.WHITE);
		panel_14_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_4_1.setLayout(null);
		panel_14_1_4_1.setBounds(0, 22, 166, 57);
		panel_12_3_1.add(panel_14_1_4_1);

		cbTransferLimited311 = new JCheckBox();
		cbTransferLimited311.setBackground(Color.WHITE);
		cbTransferLimited311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferLimited311
				.setText("<html>Limited<br>(resident does<br>most of care)</html> ");
		cbTransferLimited311.setBounds(10, 2, 146, 52);
		panel_14_1_4_1.add(cbTransferLimited311);

		final JPanel panel_14_1_1_4_1 = new JPanel();
		panel_14_1_1_4_1.setBackground(Color.WHITE);
		panel_14_1_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_4_1.setLayout(null);
		panel_14_1_1_4_1.setBounds(0, 78, 166, 57);
		panel_12_3_1.add(panel_14_1_1_4_1);

		cbTransferExtensive1311 = new JCheckBox();
		cbTransferExtensive1311.setBackground(Color.WHITE);
		cbTransferExtensive1311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferExtensive1311
				.setText("<html>Extensive, 1<br>person (staff<br>does most of care)</html>");
		cbTransferExtensive1311.setBounds(10, 2, 146, 52);
		panel_14_1_1_4_1.add(cbTransferExtensive1311);

		final JPanel panel_14_1_1_1_4_1 = new JPanel();
		panel_14_1_1_1_4_1.setBackground(Color.WHITE);
		panel_14_1_1_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_4_1.setLayout(null);
		panel_14_1_1_1_4_1.setBounds(0, 134, 166, 57);
		panel_12_3_1.add(panel_14_1_1_1_4_1);

		cbTransferExtensive2311 = new JCheckBox();
		cbTransferExtensive2311.setBackground(Color.WHITE);
		cbTransferExtensive2311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferExtensive2311
				.setText("<html>Extensive, 2<br>person (staff<br>does most of care)</html>");
		cbTransferExtensive2311.setBounds(10, 2, 146, 52);
		panel_14_1_1_1_4_1.add(cbTransferExtensive2311);

		final JPanel panel_14_1_1_1_1_3_1 = new JPanel();
		panel_14_1_1_1_1_3_1.setBackground(Color.WHITE);
		panel_14_1_1_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_1_3_1.setLayout(null);
		panel_14_1_1_1_1_3_1.setBounds(0, 190, 166, 38);
		panel_12_3_1.add(panel_14_1_1_1_1_3_1);

		cbTransferTotal311 = new JCheckBox();
		cbTransferTotal311.setBackground(Color.WHITE);
		cbTransferTotal311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferTotal311.setText("<html>Total<br>dependence</html>");
		cbTransferTotal311.setBounds(10, 2, 146, 32);
		panel_14_1_1_1_1_3_1.add(cbTransferTotal311);

		final JPanel panel_12_3_1_1 = new JPanel();
		panel_12_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_3_1_1.setLayout(null);
		panel_12_3_1_1.setBounds(330, 0, 166, 228);
		panel_11_1.add(panel_12_3_1_1);

		final JPanel panel_14_4_1_1 = new JPanel();
		panel_14_4_1_1.setBackground(Color.WHITE);
		panel_14_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_4_1_1.setLayout(null);
		panel_14_4_1_1.setBounds(0, 0, 166, 23);
		panel_12_3_1_1.add(panel_14_4_1_1);

		cbToiletingIndependent311 = new JCheckBox();
		cbToiletingIndependent311.setBackground(Color.WHITE);
		cbToiletingIndependent311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingIndependent311.setText("Independent");
		cbToiletingIndependent311.setBounds(10, 2, 94, 18);
		panel_14_4_1_1.add(cbToiletingIndependent311);

		final JPanel panel_14_1_4_1_1 = new JPanel();
		panel_14_1_4_1_1.setBackground(Color.WHITE);
		panel_14_1_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_4_1_1.setLayout(null);
		panel_14_1_4_1_1.setBounds(0, 22, 166, 57);
		panel_12_3_1_1.add(panel_14_1_4_1_1);

		cbToiletingLimited311 = new JCheckBox();
		cbToiletingLimited311.setBackground(Color.WHITE);
		cbToiletingLimited311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingLimited311
				.setText("<html>Limited<br>(resident does<br>most of care)</html> ");
		cbToiletingLimited311.setBounds(10, 2, 146, 52);
		panel_14_1_4_1_1.add(cbToiletingLimited311);

		final JPanel panel_14_1_1_4_1_1 = new JPanel();
		panel_14_1_1_4_1_1.setBackground(Color.WHITE);
		panel_14_1_1_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_4_1_1.setLayout(null);
		panel_14_1_1_4_1_1.setBounds(0, 78, 166, 57);
		panel_12_3_1_1.add(panel_14_1_1_4_1_1);

		cbToiletingExtensive1311 = new JCheckBox();
		cbToiletingExtensive1311.setBackground(Color.WHITE);
		cbToiletingExtensive1311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingExtensive1311
				.setText("<html>Extensive, 1<br>person (staff<br>does most of care)</html>");
		cbToiletingExtensive1311.setBounds(10, 2, 146, 52);
		panel_14_1_1_4_1_1.add(cbToiletingExtensive1311);

		final JPanel panel_14_1_1_1_4_1_1 = new JPanel();
		panel_14_1_1_1_4_1_1.setBackground(Color.WHITE);
		panel_14_1_1_1_4_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_4_1_1.setLayout(null);
		panel_14_1_1_1_4_1_1.setBounds(0, 134, 166, 57);
		panel_12_3_1_1.add(panel_14_1_1_1_4_1_1);

		cbToiletingExtensive2311 = new JCheckBox();
		cbToiletingExtensive2311.setBackground(Color.WHITE);
		cbToiletingExtensive2311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingExtensive2311
				.setText("<html>Extensive, 2<br>person (staff<br>does most of care)</html>");
		cbToiletingExtensive2311.setBounds(10, 2, 146, 52);
		panel_14_1_1_1_4_1_1.add(cbToiletingExtensive2311);

		final JPanel panel_14_1_1_1_1_3_1_1 = new JPanel();
		panel_14_1_1_1_1_3_1_1.setBackground(Color.WHITE);
		panel_14_1_1_1_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_1_3_1_1.setLayout(null);
		panel_14_1_1_1_1_3_1_1.setBounds(0, 190, 166, 38);
		panel_12_3_1_1.add(panel_14_1_1_1_1_3_1_1);

		cbToiletingTotal311 = new JCheckBox();
		cbToiletingTotal311.setBackground(Color.WHITE);
		cbToiletingTotal311.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingTotal311.setText("<html>Total<br>dependence</html>");
		cbToiletingTotal311.setBounds(10, 2, 146, 32);
		panel_14_1_1_1_1_3_1_1.add(cbToiletingTotal311);

		final JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_6_1_1.setBackground(Color.WHITE);
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBounds(0, 548, 496, 264);
		panel_5.add(panel_6_1_1);

		final JLabel label_1_1 = new JLabel();
		label_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1_1.setText("11 - 7  Shift  (Check all that apply)");
		label_1_1.setBounds(10, 10, 304, 20);
		panel_6_1_1.add(label_1_1);

		final JPanel panel_11_1_1 = new JPanel();
		panel_11_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_11_1_1.setLayout(null);
		panel_11_1_1.setBounds(0, 36, 496, 228);
		panel_6_1_1.add(panel_11_1_1);

		final JPanel panel_12_3_2 = new JPanel();
		panel_12_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_3_2.setLayout(null);
		panel_12_3_2.setBounds(0, 0, 166, 228);
		panel_11_1_1.add(panel_12_3_2);

		final JPanel panel_14_4_2 = new JPanel();
		panel_14_4_2.setBackground(Color.WHITE);
		panel_14_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_4_2.setLayout(null);
		panel_14_4_2.setBounds(0, 0, 166, 23);
		panel_12_3_2.add(panel_14_4_2);

		cbBedIndependent117 = new JCheckBox();
		cbBedIndependent117.setBackground(Color.WHITE);
		cbBedIndependent117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedIndependent117.setText("Independent");
		cbBedIndependent117.setBounds(10, 2, 94, 18);
		panel_14_4_2.add(cbBedIndependent117);

		final JPanel panel_14_1_4_2 = new JPanel();
		panel_14_1_4_2.setBackground(Color.WHITE);
		panel_14_1_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_4_2.setLayout(null);
		panel_14_1_4_2.setBounds(0, 22, 166, 57);
		panel_12_3_2.add(panel_14_1_4_2);

		cbBedLimited117 = new JCheckBox();
		cbBedLimited117.setBackground(Color.WHITE);
		cbBedLimited117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedLimited117
				.setText("<html>Limited<br>(resident does<br>most of care)</html> ");
		cbBedLimited117.setBounds(10, 2, 146, 52);
		panel_14_1_4_2.add(cbBedLimited117);

		final JPanel panel_14_1_1_4_2 = new JPanel();
		panel_14_1_1_4_2.setBackground(Color.WHITE);
		panel_14_1_1_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_4_2.setLayout(null);
		panel_14_1_1_4_2.setBounds(0, 78, 166, 57);
		panel_12_3_2.add(panel_14_1_1_4_2);

		cbBedExtensive117 = new JCheckBox();
		cbBedExtensive117.setBackground(Color.WHITE);
		cbBedExtensive117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedExtensive117
				.setText("<html>Extensive, 1<br>person (staff<br>does most of care)</html>");
		cbBedExtensive117.setBounds(10, 2, 146, 52);
		panel_14_1_1_4_2.add(cbBedExtensive117);

		final JPanel panel_14_1_1_1_4_2 = new JPanel();
		panel_14_1_1_1_4_2.setBackground(Color.WHITE);
		panel_14_1_1_1_4_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_4_2.setLayout(null);
		panel_14_1_1_1_4_2.setBounds(0, 134, 166, 57);
		panel_12_3_2.add(panel_14_1_1_1_4_2);

		cbBedExtensive2117 = new JCheckBox();
		cbBedExtensive2117.setBackground(Color.WHITE);
		cbBedExtensive2117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedExtensive2117
				.setText("<html>Extensive, 2<br>person (staff<br>does most of care)</html>");
		cbBedExtensive2117.setBounds(10, 2, 146, 52);
		panel_14_1_1_1_4_2.add(cbBedExtensive2117);

		final JPanel panel_14_1_1_1_1_3_2 = new JPanel();
		panel_14_1_1_1_1_3_2.setBackground(Color.WHITE);
		panel_14_1_1_1_1_3_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_1_3_2.setLayout(null);
		panel_14_1_1_1_1_3_2.setBounds(0, 190, 166, 38);
		panel_12_3_2.add(panel_14_1_1_1_1_3_2);

		cbBedTotal117 = new JCheckBox();
		cbBedTotal117.setBackground(Color.WHITE);
		cbBedTotal117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedTotal117.setText("<html>Total<br>dependence</html>");
		cbBedTotal117.setBounds(10, 2, 146, 32);
		panel_14_1_1_1_1_3_2.add(cbBedTotal117);

		final JPanel panel_12_3_1_2 = new JPanel();
		panel_12_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_3_1_2.setLayout(null);
		panel_12_3_1_2.setBounds(165, 0, 166, 228);
		panel_11_1_1.add(panel_12_3_1_2);

		final JPanel panel_14_4_1_2 = new JPanel();
		panel_14_4_1_2.setBackground(Color.WHITE);
		panel_14_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_4_1_2.setLayout(null);
		panel_14_4_1_2.setBounds(0, 0, 166, 23);
		panel_12_3_1_2.add(panel_14_4_1_2);

		cbTransferIndependent117 = new JCheckBox();
		cbTransferIndependent117.setBackground(Color.WHITE);
		cbTransferIndependent117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferIndependent117.setText("Independent");
		cbTransferIndependent117.setBounds(10, 2, 94, 18);
		panel_14_4_1_2.add(cbTransferIndependent117);

		final JPanel panel_14_1_4_1_2 = new JPanel();
		panel_14_1_4_1_2.setBackground(Color.WHITE);
		panel_14_1_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_4_1_2.setLayout(null);
		panel_14_1_4_1_2.setBounds(0, 22, 166, 57);
		panel_12_3_1_2.add(panel_14_1_4_1_2);

		cbTransferLimited117 = new JCheckBox();
		cbTransferLimited117.setBackground(Color.WHITE);
		cbTransferLimited117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferLimited117
				.setText("<html>Limited<br>(resident does<br>most of care)</html> ");
		cbTransferLimited117.setBounds(10, 2, 146, 52);
		panel_14_1_4_1_2.add(cbTransferLimited117);

		final JPanel panel_14_1_1_4_1_2 = new JPanel();
		panel_14_1_1_4_1_2.setBackground(Color.WHITE);
		panel_14_1_1_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_4_1_2.setLayout(null);
		panel_14_1_1_4_1_2.setBounds(0, 78, 166, 57);
		panel_12_3_1_2.add(panel_14_1_1_4_1_2);

		cbTransferExtensive1117 = new JCheckBox();
		cbTransferExtensive1117.setBackground(Color.WHITE);
		cbTransferExtensive1117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferExtensive1117
				.setText("<html>Extensive, 1<br>person (staff<br>does most of care)</html>");
		cbTransferExtensive1117.setBounds(10, 2, 146, 52);
		panel_14_1_1_4_1_2.add(cbTransferExtensive1117);

		final JPanel panel_14_1_1_1_4_1_2 = new JPanel();
		panel_14_1_1_1_4_1_2.setBackground(Color.WHITE);
		panel_14_1_1_1_4_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_4_1_2.setLayout(null);
		panel_14_1_1_1_4_1_2.setBounds(0, 134, 166, 57);
		panel_12_3_1_2.add(panel_14_1_1_1_4_1_2);

		cbTransferExtensive2117 = new JCheckBox();
		cbTransferExtensive2117.setBackground(Color.WHITE);
		cbTransferExtensive2117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferExtensive2117
				.setText("<html>Extensive, 2<br>person (staff<br>does most of care)</html>");
		cbTransferExtensive2117.setBounds(10, 2, 146, 52);
		panel_14_1_1_1_4_1_2.add(cbTransferExtensive2117);

		final JPanel panel_14_1_1_1_1_3_1_2 = new JPanel();
		panel_14_1_1_1_1_3_1_2.setBackground(Color.WHITE);
		panel_14_1_1_1_1_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_1_3_1_2.setLayout(null);
		panel_14_1_1_1_1_3_1_2.setBounds(0, 190, 166, 38);
		panel_12_3_1_2.add(panel_14_1_1_1_1_3_1_2);

		cbTransferTotal117 = new JCheckBox();
		cbTransferTotal117.setBackground(Color.WHITE);
		cbTransferTotal117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferTotal117.setText("<html>Total<br>dependence</html>");
		cbTransferTotal117.setBounds(10, 2, 146, 32);
		panel_14_1_1_1_1_3_1_2.add(cbTransferTotal117);

		final JPanel panel_12_3_1_1_1 = new JPanel();
		panel_12_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_12_3_1_1_1.setLayout(null);
		panel_12_3_1_1_1.setBounds(330, 0, 166, 228);
		panel_11_1_1.add(panel_12_3_1_1_1);

		final JPanel panel_14_4_1_1_1 = new JPanel();
		panel_14_4_1_1_1.setBackground(Color.WHITE);
		panel_14_4_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_4_1_1_1.setLayout(null);
		panel_14_4_1_1_1.setBounds(0, 0, 166, 23);
		panel_12_3_1_1_1.add(panel_14_4_1_1_1);

		cbToiletingIndependent117 = new JCheckBox();
		cbToiletingIndependent117.setBackground(Color.WHITE);
		cbToiletingIndependent117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingIndependent117.setText("Independent");
		cbToiletingIndependent117.setBounds(10, 2, 94, 18);
		panel_14_4_1_1_1.add(cbToiletingIndependent117);

		final JPanel panel_14_1_4_1_1_1 = new JPanel();
		panel_14_1_4_1_1_1.setBackground(Color.WHITE);
		panel_14_1_4_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_4_1_1_1.setLayout(null);
		panel_14_1_4_1_1_1.setBounds(0, 22, 166, 57);
		panel_12_3_1_1_1.add(panel_14_1_4_1_1_1);

		cbToiletingLimited117 = new JCheckBox();
		cbToiletingLimited117.setBackground(Color.WHITE);
		cbToiletingLimited117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingLimited117
				.setText("<html>Limited<br>(resident does<br>most of care)</html> ");
		cbToiletingLimited117.setBounds(10, 2, 146, 52);
		panel_14_1_4_1_1_1.add(cbToiletingLimited117);

		final JPanel panel_14_1_1_4_1_1_1 = new JPanel();
		panel_14_1_1_4_1_1_1.setBackground(Color.WHITE);
		panel_14_1_1_4_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_4_1_1_1.setLayout(null);
		panel_14_1_1_4_1_1_1.setBounds(0, 78, 166, 57);
		panel_12_3_1_1_1.add(panel_14_1_1_4_1_1_1);

		cbToiletingExtensive1117 = new JCheckBox();
		cbToiletingExtensive1117.setBackground(Color.WHITE);
		cbToiletingExtensive1117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingExtensive1117
				.setText("<html>Extensive, 1<br>person (staff<br>does most of care)</html>");
		cbToiletingExtensive1117.setBounds(10, 2, 146, 52);
		panel_14_1_1_4_1_1_1.add(cbToiletingExtensive1117);

		final JPanel panel_14_1_1_1_4_1_1_1 = new JPanel();
		panel_14_1_1_1_4_1_1_1.setBackground(Color.WHITE);
		panel_14_1_1_1_4_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_4_1_1_1.setLayout(null);
		panel_14_1_1_1_4_1_1_1.setBounds(0, 134, 166, 57);
		panel_12_3_1_1_1.add(panel_14_1_1_1_4_1_1_1);

		cbToiletingExtensive2117 = new JCheckBox();
		cbToiletingExtensive2117.setBackground(Color.WHITE);
		cbToiletingExtensive2117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingExtensive2117
				.setText("<html>Extensive, 2<br>person (staff<br>does most of care)</html>");
		cbToiletingExtensive2117.setBounds(10, 2, 146, 52);
		panel_14_1_1_1_4_1_1_1.add(cbToiletingExtensive2117);

		final JPanel panel_14_1_1_1_1_3_1_1_1 = new JPanel();
		panel_14_1_1_1_1_3_1_1_1.setBackground(Color.WHITE);
		panel_14_1_1_1_1_3_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_14_1_1_1_1_3_1_1_1.setLayout(null);
		panel_14_1_1_1_1_3_1_1_1.setBounds(0, 190, 166, 38);
		panel_12_3_1_1_1.add(panel_14_1_1_1_1_3_1_1_1);

		cbToiletingTotal117 = new JCheckBox();
		cbToiletingTotal117.setBackground(Color.WHITE);
		cbToiletingTotal117.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingTotal117.setText("<html>Total<br>dependence</html>");
		cbToiletingTotal117.setBounds(10, 2, 146, 32);
		panel_14_1_1_1_1_3_1_1_1.add(cbToiletingTotal117);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setBackground(Color.WHITE);
		panel_7_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(0, 811, 496, 281);
		panel_5.add(panel_7_1_1_1);

		final JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBounds(0, 0, 137, 281);
		panel_7_1_1_1.add(panel_3_1_1_1);

		final JPanel panel_9_3_1_1 = new JPanel();
		panel_9_3_1_1.setBackground(Color.WHITE);
		panel_9_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_3_1_1.setLayout(null);
		panel_9_3_1_1.setBounds(0, 0, 137, 45);
		panel_3_1_1_1.add(panel_9_3_1_1);

		final JLabel vitalSignsLabel_4_1_1 = new JLabel();
		vitalSignsLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		vitalSignsLabel_4_1_1.setText("Eating");
		vitalSignsLabel_4_1_1.setBounds(10, 5, 117, 35);
		panel_9_3_1_1.add(vitalSignsLabel_4_1_1);

		final JPanel panel_9_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1.setBackground(Color.WHITE);
		panel_9_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_1_1_1_1.setLayout(null);
		panel_9_1_1_1_1.setBounds(0, 44, 137, 45);
		panel_3_1_1_1.add(panel_9_1_1_1_1);

		final JLabel vitalSignsLabel_1_1_1_1 = new JLabel();
		vitalSignsLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_1_1_1_1
				.setText("<html>Independent /<br> Set up</html>");
		vitalSignsLabel_1_1_1_1.setBounds(10, 5, 117, 35);
		panel_9_1_1_1_1.add(vitalSignsLabel_1_1_1_1);

		final JPanel panel_9_2_3_1_1 = new JPanel();
		panel_9_2_3_1_1.setBackground(Color.WHITE);
		panel_9_2_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_3_1_1.setLayout(null);
		panel_9_2_3_1_1.setBounds(0, 88, 137, 45);
		panel_3_1_1_1.add(panel_9_2_3_1_1);

		final JLabel vitalSignsLabel_2_3_1_1 = new JLabel();
		vitalSignsLabel_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_3_1_1
				.setText("<html>Limited assist<br> with eating</html>");
		vitalSignsLabel_2_3_1_1.setBounds(10, 5, 117, 35);
		panel_9_2_3_1_1.add(vitalSignsLabel_2_3_1_1);

		final JPanel panel_9_2_2_2_1_1 = new JPanel();
		panel_9_2_2_2_1_1.setBackground(Color.WHITE);
		panel_9_2_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_2_1_1.setLayout(null);
		panel_9_2_2_2_1_1.setBounds(0, 132, 137, 27);
		panel_3_1_1_1.add(panel_9_2_2_2_1_1);

		final JLabel vitalSignsLabel_2_2_2_1_1 = new JLabel();
		vitalSignsLabel_2_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2_2_1_1.setText("Total dependence");
		vitalSignsLabel_2_2_2_1_1.setBounds(10, 2, 122, 22);
		panel_9_2_2_2_1_1.add(vitalSignsLabel_2_2_2_1_1);

		final JPanel panel_9_2_2_1_1_2_1 = new JPanel();
		panel_9_2_2_1_1_2_1.setBackground(Color.WHITE);
		panel_9_2_2_1_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_1_2_1.setLayout(null);
		panel_9_2_2_1_1_2_1.setBounds(0, 158, 137, 27);
		panel_3_1_1_1.add(panel_9_2_2_1_1_2_1);

		final JLabel vitalSignsLabel_2_2_1_1_2_1 = new JLabel();
		vitalSignsLabel_2_2_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2_1_1_2_1.setText("Snack / supplement");
		vitalSignsLabel_2_2_1_1_2_1.setBounds(10, 3, 117, 22);
		panel_9_2_2_1_1_2_1.add(vitalSignsLabel_2_2_1_1_2_1);

		final JPanel panel_9_2_2_1_1_2_1_1 = new JPanel();
		panel_9_2_2_1_1_2_1_1.setBackground(Color.WHITE);
		panel_9_2_2_1_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_1_2_1_1.setLayout(null);
		panel_9_2_2_1_1_2_1_1.setBounds(0, 184, 137, 27);
		panel_3_1_1_1.add(panel_9_2_2_1_1_2_1_1);

		final JLabel vitalSignsLabel_2_2_1_1_2_1_1 = new JLabel();
		vitalSignsLabel_2_2_1_1_2_1_1
				.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_2_2_1_1_2_1_1.setText("GT feeding");
		vitalSignsLabel_2_2_1_1_2_1_1.setBounds(10, 3, 117, 22);
		panel_9_2_2_1_1_2_1_1.add(vitalSignsLabel_2_2_1_1_2_1_1);

		final JPanel panel_9_2_2_1_1_2_1_1_1 = new JPanel();
		panel_9_2_2_1_1_2_1_1_1.setBackground(Color.WHITE);
		panel_9_2_2_1_1_2_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_9_2_2_1_1_2_1_1_1.setLayout(null);
		panel_9_2_2_1_1_2_1_1_1.setBounds(0, 210, 137, 27);
		panel_3_1_1_1.add(panel_9_2_2_1_1_2_1_1_1);

		final JLabel vitalSignsLabel_2_2_1_1_2_1_1_1 = new JLabel();
		vitalSignsLabel_2_2_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD,
				11));
		vitalSignsLabel_2_2_1_1_2_1_1_1.setText("TPN");
		vitalSignsLabel_2_2_1_1_2_1_1_1.setBounds(10, 3, 117, 22);
		panel_9_2_2_1_1_2_1_1_1.add(vitalSignsLabel_2_2_1_1_2_1_1_1);

		final JPanel panel_9_2_2_1_1_2_1_1_1_1 = new JPanel();
		panel_9_2_2_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_9_2_2_1_1_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_9_2_2_1_1_2_1_1_1_1.setLayout(null);
		panel_9_2_2_1_1_2_1_1_1_1.setBounds(0, 236, 137, 45);
		panel_3_1_1_1.add(panel_9_2_2_1_1_2_1_1_1_1);

		final JLabel vitalSignsLabel_2_2_1_1_2_1_1_1_1 = new JLabel();
		vitalSignsLabel_2_2_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD,
				11));
		vitalSignsLabel_2_2_1_1_2_1_1_1_1
				.setText("<html>Pleasure<br>foods only</html>");
		vitalSignsLabel_2_2_1_1_2_1_1_1_1.setBounds(10, 3, 117, 35);
		panel_9_2_2_1_1_2_1_1_1_1.add(vitalSignsLabel_2_2_1_1_2_1_1_1_1);

		final JPanel panel_4_1_3_1 = new JPanel();
		panel_4_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_3_1.setLayout(null);
		panel_4_1_3_1.setBounds(136, 0, 120, 281);
		panel_7_1_1_1.add(panel_4_1_3_1);

		final JPanel panel_10_2_3_1 = new JPanel();
		panel_10_2_3_1.setBackground(Color.WHITE);
		panel_10_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2_3_1.setLayout(null);
		panel_10_2_3_1.setBounds(0, 0, 120, 45);
		panel_4_1_3_1.add(panel_10_2_3_1);

		final JLabel vitalSignsLabel_3_2_3_1 = new JLabel();
		vitalSignsLabel_3_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_2_3_1.setText("7 - 3");
		vitalSignsLabel_3_2_3_1.setBounds(35, 15, 43, 14);
		panel_10_2_3_1.add(vitalSignsLabel_3_2_3_1);

		final JPanel panel_10_3_1_2_3_1 = new JPanel();
		panel_10_3_1_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_2_3_1.setLayout(null);
		panel_10_3_1_2_3_1.setBounds(0, 132, 120, 27);
		panel_4_1_3_1.add(panel_10_3_1_2_3_1);

		txtTotal73 = new JTextField();
		txtTotal73.setBounds(1, 1, 117, 24);
		panel_10_3_1_2_3_1.add(txtTotal73);

		final JPanel panel_10_3_2_2_3_1 = new JPanel();
		panel_10_3_2_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_3_1.setLayout(null);
		panel_10_3_2_2_3_1.setBounds(0, 158, 120, 27);
		panel_4_1_3_1.add(panel_10_3_2_2_3_1);

		txtSnack73 = new JTextField();
		txtSnack73.setBounds(1, 1, 117, 24);
		panel_10_3_2_2_3_1.add(txtSnack73);

		final JPanel panel_10_3_6_1_3_1 = new JPanel();
		panel_10_3_6_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_1_3_1.setLayout(null);
		panel_10_3_6_1_3_1.setBounds(0, 44, 120, 45);
		panel_4_1_3_1.add(panel_10_3_6_1_3_1);

		txtIndependent73 = new JTextField();
		txtIndependent73.setBounds(1, 1, 117, 43);
		panel_10_3_6_1_3_1.add(txtIndependent73);

		final JPanel panel_10_3_6_2_3_1 = new JPanel();
		panel_10_3_6_2_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_3_1.setLayout(null);
		panel_10_3_6_2_3_1.setBounds(0, 88, 120, 45);
		panel_4_1_3_1.add(panel_10_3_6_2_3_1);

		txtLimited73 = new JTextField();
		txtLimited73.setBounds(1, 1, 117, 43);
		panel_10_3_6_2_3_1.add(txtLimited73);

		final JPanel panel_10_3_2_2_3_1_1 = new JPanel();
		panel_10_3_2_2_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_3_1_1.setLayout(null);
		panel_10_3_2_2_3_1_1.setBounds(0, 184, 120, 27);
		panel_4_1_3_1.add(panel_10_3_2_2_3_1_1);

		txtGT73 = new JTextField();
		txtGT73.setBounds(1, 1, 117, 24);
		panel_10_3_2_2_3_1_1.add(txtGT73);

		final JPanel panel_10_3_2_2_3_1_1_1 = new JPanel();
		panel_10_3_2_2_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_3_1_1_1.setLayout(null);
		panel_10_3_2_2_3_1_1_1.setBounds(0, 210, 120, 27);
		panel_4_1_3_1.add(panel_10_3_2_2_3_1_1_1);

		txtTPN73 = new JTextField();
		txtTPN73.setBounds(1, 1, 117, 24);
		panel_10_3_2_2_3_1_1_1.add(txtTPN73);

		final JPanel panel_10_3_6_2_3_1_1 = new JPanel();
		panel_10_3_6_2_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_3_1_1.setLayout(null);
		panel_10_3_6_2_3_1_1.setBounds(0, 236, 120, 45);
		panel_4_1_3_1.add(panel_10_3_6_2_3_1_1);

		txtPleasure73 = new JTextField();
		txtPleasure73.setBounds(1, 1, 117, 43);
		panel_10_3_6_2_3_1_1.add(txtPleasure73);

		final JPanel panel_4_1_3_1_1 = new JPanel();
		panel_4_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_3_1_1.setLayout(null);
		panel_4_1_3_1_1.setBounds(255, 0, 120, 281);
		panel_7_1_1_1.add(panel_4_1_3_1_1);

		final JPanel panel_10_2_3_1_1 = new JPanel();
		panel_10_2_3_1_1.setBackground(Color.WHITE);
		panel_10_2_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2_3_1_1.setLayout(null);
		panel_10_2_3_1_1.setBounds(0, 0, 120, 45);
		panel_4_1_3_1_1.add(panel_10_2_3_1_1);

		final JLabel vitalSignsLabel_3_2_3_1_1 = new JLabel();
		vitalSignsLabel_3_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_2_3_1_1.setText("3 - 11");
		vitalSignsLabel_3_2_3_1_1.setBounds(35, 15, 43, 14);
		panel_10_2_3_1_1.add(vitalSignsLabel_3_2_3_1_1);

		final JPanel panel_10_3_1_2_3_1_1 = new JPanel();
		panel_10_3_1_2_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_2_3_1_1.setLayout(null);
		panel_10_3_1_2_3_1_1.setBounds(0, 132, 120, 27);
		panel_4_1_3_1_1.add(panel_10_3_1_2_3_1_1);

		txtTotal311 = new JTextField();
		txtTotal311.setBounds(1, 1, 117, 24);
		panel_10_3_1_2_3_1_1.add(txtTotal311);

		final JPanel panel_10_3_2_2_3_1_2 = new JPanel();
		panel_10_3_2_2_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_3_1_2.setLayout(null);
		panel_10_3_2_2_3_1_2.setBounds(0, 158, 120, 27);
		panel_4_1_3_1_1.add(panel_10_3_2_2_3_1_2);

		txtSnack311 = new JTextField();
		txtSnack311.setBounds(1, 1, 117, 24);
		panel_10_3_2_2_3_1_2.add(txtSnack311);

		final JPanel panel_10_3_6_1_3_1_1 = new JPanel();
		panel_10_3_6_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_1_3_1_1.setLayout(null);
		panel_10_3_6_1_3_1_1.setBounds(0, 44, 120, 45);
		panel_4_1_3_1_1.add(panel_10_3_6_1_3_1_1);

		txtIndependent311 = new JTextField();
		txtIndependent311.setBounds(1, 1, 117, 43);
		panel_10_3_6_1_3_1_1.add(txtIndependent311);

		final JPanel panel_10_3_6_2_3_1_2 = new JPanel();
		panel_10_3_6_2_3_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_3_1_2.setLayout(null);
		panel_10_3_6_2_3_1_2.setBounds(0, 88, 120, 45);
		panel_4_1_3_1_1.add(panel_10_3_6_2_3_1_2);

		txtLimited311 = new JTextField();
		txtLimited311.setBounds(1, 1, 117, 43);
		panel_10_3_6_2_3_1_2.add(txtLimited311);

		final JPanel panel_10_3_2_2_3_1_1_2 = new JPanel();
		panel_10_3_2_2_3_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_3_1_1_2.setLayout(null);
		panel_10_3_2_2_3_1_1_2.setBounds(0, 184, 120, 27);
		panel_4_1_3_1_1.add(panel_10_3_2_2_3_1_1_2);

		txtGT311 = new JTextField();
		txtGT311.setBounds(1, 1, 117, 24);
		panel_10_3_2_2_3_1_1_2.add(txtGT311);

		final JPanel panel_10_3_2_2_3_1_1_1_1 = new JPanel();
		panel_10_3_2_2_3_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_3_1_1_1_1.setLayout(null);
		panel_10_3_2_2_3_1_1_1_1.setBounds(0, 210, 120, 27);
		panel_4_1_3_1_1.add(panel_10_3_2_2_3_1_1_1_1);

		txtTPN311 = new JTextField();
		txtTPN311.setBounds(1, 1, 117, 24);
		panel_10_3_2_2_3_1_1_1_1.add(txtTPN311);

		final JPanel panel_10_3_6_2_3_1_1_1 = new JPanel();
		panel_10_3_6_2_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_3_1_1_1.setLayout(null);
		panel_10_3_6_2_3_1_1_1.setBounds(0, 236, 120, 45);
		panel_4_1_3_1_1.add(panel_10_3_6_2_3_1_1_1);

		txtPleasure311 = new JTextField();
		txtPleasure311.setBounds(1, 1, 117, 43);
		panel_10_3_6_2_3_1_1_1.add(txtPleasure311);

		final JPanel panel_4_1_3_1_1_1 = new JPanel();
		panel_4_1_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_4_1_3_1_1_1.setLayout(null);
		panel_4_1_3_1_1_1.setBounds(374, 0, 122, 281);
		panel_7_1_1_1.add(panel_4_1_3_1_1_1);

		final JPanel panel_10_2_3_1_1_1 = new JPanel();
		panel_10_2_3_1_1_1.setBackground(Color.WHITE);
		panel_10_2_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_2_3_1_1_1.setLayout(null);
		panel_10_2_3_1_1_1.setBounds(0, 0, 122, 45);
		panel_4_1_3_1_1_1.add(panel_10_2_3_1_1_1);

		final JLabel vitalSignsLabel_3_2_3_1_1_1 = new JLabel();
		vitalSignsLabel_3_2_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		vitalSignsLabel_3_2_3_1_1_1.setText("11 - 7 ");
		vitalSignsLabel_3_2_3_1_1_1.setBounds(35, 15, 43, 14);
		panel_10_2_3_1_1_1.add(vitalSignsLabel_3_2_3_1_1_1);

		final JPanel panel_10_3_1_2_3_1_1_1 = new JPanel();
		panel_10_3_1_2_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_1_2_3_1_1_1.setLayout(null);
		panel_10_3_1_2_3_1_1_1.setBounds(0, 132, 122, 27);
		panel_4_1_3_1_1_1.add(panel_10_3_1_2_3_1_1_1);

		txtTotal117 = new JTextField();
		txtTotal117.setBounds(1, 1, 119, 24);
		panel_10_3_1_2_3_1_1_1.add(txtTotal117);

		final JPanel panel_10_3_2_2_3_1_2_1 = new JPanel();
		panel_10_3_2_2_3_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_3_1_2_1.setLayout(null);
		panel_10_3_2_2_3_1_2_1.setBounds(0, 158, 122, 27);
		panel_4_1_3_1_1_1.add(panel_10_3_2_2_3_1_2_1);

		txtSnack117 = new JTextField();
		txtSnack117.setBounds(1, 1, 119, 24);
		panel_10_3_2_2_3_1_2_1.add(txtSnack117);

		final JPanel panel_10_3_6_1_3_1_1_1 = new JPanel();
		panel_10_3_6_1_3_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_1_3_1_1_1.setLayout(null);
		panel_10_3_6_1_3_1_1_1.setBounds(0, 44, 122, 45);
		panel_4_1_3_1_1_1.add(panel_10_3_6_1_3_1_1_1);

		txtIndependent117 = new JTextField();
		txtIndependent117.setBounds(1, 1, 119, 43);
		panel_10_3_6_1_3_1_1_1.add(txtIndependent117);

		final JPanel panel_10_3_6_2_3_1_2_1 = new JPanel();
		panel_10_3_6_2_3_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_3_1_2_1.setLayout(null);
		panel_10_3_6_2_3_1_2_1.setBounds(0, 88, 122, 45);
		panel_4_1_3_1_1_1.add(panel_10_3_6_2_3_1_2_1);

		txtLimited117 = new JTextField();
		txtLimited117.setBounds(1, 1, 119, 43);
		panel_10_3_6_2_3_1_2_1.add(txtLimited117);

		final JPanel panel_10_3_2_2_3_1_1_2_1 = new JPanel();
		panel_10_3_2_2_3_1_1_2_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_2_2_3_1_1_2_1.setLayout(null);
		panel_10_3_2_2_3_1_1_2_1.setBounds(0, 184, 122, 27);
		panel_4_1_3_1_1_1.add(panel_10_3_2_2_3_1_1_2_1);

		txtGT117 = new JTextField();
		txtGT117.setBounds(1, 1, 119, 24);
		panel_10_3_2_2_3_1_1_2_1.add(txtGT117);

		final JPanel panel_10_3_2_2_3_1_1_1_1_1 = new JPanel();
		panel_10_3_2_2_3_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1,
				false));
		panel_10_3_2_2_3_1_1_1_1_1.setLayout(null);
		panel_10_3_2_2_3_1_1_1_1_1.setBounds(0, 210, 122, 27);
		panel_4_1_3_1_1_1.add(panel_10_3_2_2_3_1_1_1_1_1);

		txtTPN117 = new JTextField();
		txtTPN117.setBounds(1, 1, 119, 24);
		panel_10_3_2_2_3_1_1_1_1_1.add(txtTPN117);

		final JPanel panel_10_3_6_2_3_1_1_1_1 = new JPanel();
		panel_10_3_6_2_3_1_1_1_1
				.setBorder(new LineBorder(Color.black, 1, false));
		panel_10_3_6_2_3_1_1_1_1.setLayout(null);
		panel_10_3_6_2_3_1_1_1_1.setBounds(0, 236, 122, 45);
		panel_4_1_3_1_1_1.add(panel_10_3_6_2_3_1_1_1_1);

		txtPleasure117 = new JTextField();
		txtPleasure117.setBounds(1, 1, 119, 43);
		panel_10_3_6_2_3_1_1_1_1.add(txtPleasure117);

		doLoad();
	}

	public void doLoad() {
		ResidentMain rm = null;
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtResidentName.setText(rm.getUserPass() + ", " + rm.getUserName());
		try {
			MedrexClientManager.getInstance().getRoomForResident(
					Global.currentResidenceKey, new Date());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// txtRoom.setText(trh.getRoom());
		doUpdate();
	}

	public int doSave() {
		MonthlySummaryRecord msr = new MonthlySummaryRecord();
		try {
			msr = MedrexClientManager.getInstance().getMonthlySummaryRecord(
					Global.currentMonthlySummaryRecordKey);
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MedrexException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		MonthlySummaryPage4 refMonthlySummaryPage4 = new MonthlySummaryPage4();
		refMonthlySummaryPage4.setResidentId(Global.currentResidenceKey);
		refMonthlySummaryPage4.setSerial(Global.currentMonthlySummaryPage4Key);
		refMonthlySummaryPage4.setFormId(msr);
		refMonthlySummaryPage4.setPleasure117(txtPleasure117.getText());
		refMonthlySummaryPage4.setPleasure311(txtPleasure311.getText());
		refMonthlySummaryPage4.setPleasure73(txtPleasure73.getText());
		refMonthlySummaryPage4.setTPN117(txtTPN117.getText());
		refMonthlySummaryPage4.setTPN311(txtTPN311.getText());
		refMonthlySummaryPage4.setTPN73(txtTPN73.getText());
		refMonthlySummaryPage4.setGT117(txtGT117.getText());
		refMonthlySummaryPage4.setGT311(txtGT311.getText());
		refMonthlySummaryPage4.setGT73(txtGT73.getText());
		refMonthlySummaryPage4.setSnack117(txtSnack117.getText());
		refMonthlySummaryPage4.setSnack311(txtSnack311.getText());
		refMonthlySummaryPage4.setSnack73(txtSnack73.getText());
		refMonthlySummaryPage4.setTotal117(txtTotal117.getText());
		refMonthlySummaryPage4.setTotal311(txtTotal311.getText());
		refMonthlySummaryPage4.setTotal73(txtTotal73.getText());
		refMonthlySummaryPage4.setLimited117(txtLimited117.getText());
		refMonthlySummaryPage4.setLimited311(txtLimited311.getText());
		refMonthlySummaryPage4.setLimited73(txtLimited73.getText());
		refMonthlySummaryPage4.setIndependent117(txtIndependent117.getText());
		refMonthlySummaryPage4.setIndependent311(txtIndependent311.getText());
		refMonthlySummaryPage4.setIndependent73(txtIndependent73.getText());
		refMonthlySummaryPage4.setToiletingTotal117(cbToiletingTotal117
				.isSelected());
		refMonthlySummaryPage4.setTransferTotal117(cbTransferTotal117
				.isSelected());
		refMonthlySummaryPage4.setBedTotal117(cbBedTotal117.isSelected());
		refMonthlySummaryPage4
				.setToiletingExtensive2117(cbToiletingExtensive2117
						.isSelected());
		refMonthlySummaryPage4.setTransferExtensive2117(cbTransferExtensive2117
				.isSelected());
		refMonthlySummaryPage4.setBedExtensive2117(cbBedExtensive2117
				.isSelected());
		refMonthlySummaryPage4
				.setToiletingExtensive1117(cbToiletingExtensive1117
						.isSelected());
		refMonthlySummaryPage4.setTransferExtensive1117(cbTransferExtensive1117
				.isSelected());
		refMonthlySummaryPage4.setBedExtensive117(cbBedExtensive117
				.isSelected());
		refMonthlySummaryPage4.setToiletingLimited117(cbToiletingLimited117
				.isSelected());
		refMonthlySummaryPage4.setTransferLimited117(cbTransferLimited117
				.isSelected());
		refMonthlySummaryPage4.setBedLimited117(cbBedLimited117.isSelected());
		refMonthlySummaryPage4
				.setToiletingIndependent117(cbToiletingIndependent117
						.isSelected());
		refMonthlySummaryPage4
				.setTransferIndependent117(cbTransferIndependent117
						.isSelected());
		refMonthlySummaryPage4.setBedIndependent117(cbBedIndependent117
				.isSelected());
		refMonthlySummaryPage4.setToiletingTotal311(cbToiletingTotal311
				.isSelected());
		refMonthlySummaryPage4.setTransferTotal311(cbTransferTotal311
				.isSelected());
		refMonthlySummaryPage4.setBedTotal311(cbBedTotal311.isSelected());
		refMonthlySummaryPage4
				.setToiletingExtensive2311(cbToiletingExtensive2311
						.isSelected());
		refMonthlySummaryPage4.setTransferExtensive2311(cbTransferExtensive2311
				.isSelected());
		refMonthlySummaryPage4.setBedExtensive2311(cbBedExtensive2311
				.isSelected());
		refMonthlySummaryPage4
				.setToiletingExtensive1311(cbToiletingExtensive1311
						.isSelected());
		refMonthlySummaryPage4.setTransferExtensive1311(cbTransferExtensive1311
				.isSelected());
		refMonthlySummaryPage4.setBedExtensive1311(cbBedExtensive1311
				.isSelected());
		refMonthlySummaryPage4.setToiletingLimited311(cbToiletingLimited311
				.isSelected());
		refMonthlySummaryPage4.setTransferLimited311(cbTransferLimited311
				.isSelected());
		refMonthlySummaryPage4.setBedLimited311(cbBedLimited311.isSelected());
		refMonthlySummaryPage4
				.setToiletingIndependent311(cbToiletingIndependent311
						.isSelected());
		refMonthlySummaryPage4
				.setTransferIndependent311(cbTransferIndependent311
						.isSelected());
		refMonthlySummaryPage4.setBedIndependent311(cbBedIndependent311
				.isSelected());
		refMonthlySummaryPage4.setToiletingTotal73(cbToiletingTotal73
				.isSelected());
		refMonthlySummaryPage4.setTransferTotal73(cbTransferTotal73
				.isSelected());
		refMonthlySummaryPage4.setBedTotal73(cbBedTotal73.isSelected());
		refMonthlySummaryPage4.setToiletingExtensive273(cbToiletingExtensive273
				.isSelected());
		refMonthlySummaryPage4.setTransferExtensive273(cbTransferExtensive273
				.isSelected());
		refMonthlySummaryPage4.setBedExtensive273(cbBedExtensive273
				.isSelected());
		refMonthlySummaryPage4.setToiletingExtensive173(cbToiletingExtensive173
				.isSelected());
		refMonthlySummaryPage4.setTransferExtensive173(cbTransferExtensive173
				.isSelected());
		refMonthlySummaryPage4.setBedExtensive173(cbBedExtensive173
				.isSelected());
		refMonthlySummaryPage4.setToiletingLimited73(cbToiletingLimited73
				.isSelected());
		refMonthlySummaryPage4.setTransferLimited73(cbTransferLimited73
				.isSelected());
		refMonthlySummaryPage4.setBedLimited73(cbBedLimited73.isSelected());
		refMonthlySummaryPage4
				.setToiletingIndependent73(cbToiletingIndependent73
						.isSelected());
		refMonthlySummaryPage4.setTransferIndependent73(cbTransferIndependent73
				.isSelected());
		refMonthlySummaryPage4.setBedIndependent73(cbBedIndependent73
				.isSelected());
		refMonthlySummaryPage4
				.setAreaOtherIntervention(txtAreaOtherIntervention.getText());
		refMonthlySummaryPage4.setOtherSkilled5117(txtOtherSkilled5117
				.getText());
		refMonthlySummaryPage4.setOtherSkilled5311(txtOtherSkilled5311
				.getText());
		refMonthlySummaryPage4.setOtherSkilled573(txtOtherSkilled573.getText());
		refMonthlySummaryPage4.setOtherSkilled4117(txtOtherSkilled4117
				.getText());
		refMonthlySummaryPage4.setOtherSkilled4311(txtOtherSkilled4311
				.getText());
		refMonthlySummaryPage4.setOtherSkilled473(txtOtherSkilled473.getText());
		refMonthlySummaryPage4.setOtherSkilled3117(txtOtherSkilled3117
				.getText());
		refMonthlySummaryPage4.setOtherSkilled3311(txtOtherSkilled3311
				.getText());
		refMonthlySummaryPage4.setOtherSkilled373(txtOtherSkilled373.getText());
		refMonthlySummaryPage4.setOtherSkilled2117(txtOtherSkilled2117
				.getText());
		refMonthlySummaryPage4.setOtherSkilled2311(txtOtherSkilled2311
				.getText());
		refMonthlySummaryPage4.setOtherSkilled273(txtOtherSkilled273.getText());
		refMonthlySummaryPage4.setOtherSkilled1117(txtOtherSkilled1117
				.getText());
		refMonthlySummaryPage4.setOtherSkilled1311(txtOtherSkilled1311
				.getText());
		refMonthlySummaryPage4.setOtherSkilled173(txtOtherSkilled173.getText());
		refMonthlySummaryPage4.setOtherSkilled5(txtOtherSkilled5.getText());
		refMonthlySummaryPage4.setOtherSkilled4(txtOtherSkilled4.getText());
		refMonthlySummaryPage4.setOtherSkilled3(txtOtherSkilled3.getText());
		refMonthlySummaryPage4.setOtherSkilled2(txtOtherSkilled2.getText());
		refMonthlySummaryPage4.setOtherSkilled1(txtOtherSkilled1.getText());
		refMonthlySummaryPage4.setAreaSkinIntervention(txtAreaSkinIntervention
				.getText());
		refMonthlySummaryPage4.setWound117(txtWound117.getText());
		refMonthlySummaryPage4.setWound311(txtWound311.getText());
		refMonthlySummaryPage4.setWound73(txtWound73.getText());
		refMonthlySummaryPage4.setNewSkin117(txtNewSkin117.getText());
		refMonthlySummaryPage4.setNewSkin311(txtNewSkin311.getText());
		refMonthlySummaryPage4.setNewSkin73(txtNewSkin73.getText());
		refMonthlySummaryPage4.setSutures117(txtSutures117.getText());
		refMonthlySummaryPage4.setSutures311(txtSutures311.getText());
		refMonthlySummaryPage4.setSutures73(txtSutures73.getText());
		refMonthlySummaryPage4.setSkinIntact117(txtSkinIntact117.getText());
		refMonthlySummaryPage4.setSkinIntact311(txtSkinIntact311.getText());
		refMonthlySummaryPage4.setSkinIntact73(txtSkinIntact73.getText());
		refMonthlySummaryPage4
				.setAreaRespirationIntervention(txtAreaRespirationIntervention
						.getText());
		refMonthlySummaryPage4.setTrachCare117(txtTrachCare117.getText());
		refMonthlySummaryPage4.setTrachCare311(txtTrachCare311.getText());
		refMonthlySummaryPage4.setTrachCare73(txtTrachCare73.getText());
		refMonthlySummaryPage4.setSuctioned117(txtSuctioned117.getText());
		refMonthlySummaryPage4.setSuctioned311(txtSuctioned311.getText());
		refMonthlySummaryPage4.setSuctioned73(txtSuctioned73.getText());
		refMonthlySummaryPage4.setAngina117(txtAngina117.getText());
		refMonthlySummaryPage4.setAngina311(txtAngina311.getText());
		refMonthlySummaryPage4.setAngina73(txtAngina73.getText());
		refMonthlySummaryPage4.setHeart117(txtheart117.getText());
		refMonthlySummaryPage4.setHeart311(txtheart311.getText());
		refMonthlySummaryPage4.setHeart73(txtheart73.getText());
		refMonthlySummaryPage4.setCrackles117(txtCrackles117.getText());
		refMonthlySummaryPage4.setCrackles311(txtCrackles311.getText());
		refMonthlySummaryPage4.setCrackles73(txtCrackles73.getText());
		refMonthlySummaryPage4.setLungs117(txtLungs117.getText());
		refMonthlySummaryPage4.setLungs311(txtLungs311.getText());
		refMonthlySummaryPage4.setLungs73(txtLungs73.getText());
		refMonthlySummaryPage4.setBreath117(txtBreath117.getText());
		refMonthlySummaryPage4.setBreath311(txtBreath311.getText());
		refMonthlySummaryPage4.setBreath73(txtBreath73.getText());
		refMonthlySummaryPage4
				.setAreaVitalIntervention(txtAreaVitalIntervention.getText());
		refMonthlySummaryPage4.setO2117(txtO2117.getText());
		refMonthlySummaryPage4.setO2311(txtO2311.getText());
		refMonthlySummaryPage4.setO273(txtO273.getText());
		refMonthlySummaryPage4.setTemp117(txtTemp117.getText());
		refMonthlySummaryPage4.setTemp311(txtTemp311.getText());
		refMonthlySummaryPage4.setTemp73(txtTemp73.getText());
		refMonthlySummaryPage4.setRespirations117(txtRespirations117.getText());
		refMonthlySummaryPage4.setRespirations311(txtRespirations311.getText());
		refMonthlySummaryPage4.setRespirations73(txtRespirations73.getText());
		refMonthlySummaryPage4.setPulse117(txtPulse117.getText());
		refMonthlySummaryPage4.setPulse311(txtPulse311.getText());
		refMonthlySummaryPage4.setPulse73(txtPulse73.getText());
		refMonthlySummaryPage4.setBP117(txtBP117.getText());
		refMonthlySummaryPage4.setBP311(txtBP311.getText());
		refMonthlySummaryPage4.setBP73(txtBP73.getText());
		refMonthlySummaryPage4.setRoom(txtRoom.getText());
		refMonthlySummaryPage4.setResidentName(txtResidentName.getText());
		refMonthlySummaryPage4.setDate(dcDate.getDate());

		try {
			Global.currentMonthlySummaryPage4Key = MedrexClientManager
					.getInstance().insertOrUpdateMonthlySummaryPage4(
							refMonthlySummaryPage4);
			return Global.currentMonthlySummaryPage4Key;
		} catch (Exception e) {
		}

		return 0;
	}

	public void doUpdate() {
		MonthlySummaryPage4 refMonthlySummaryPage4 = null;

		MonthlySummaryRecord msr = new MonthlySummaryRecord();
		if (Global.currentMonthlySummaryRecordKey != 0
				&& Global.currentMonthlySummaryPage4Key != 0) {
			try {
				msr = MedrexClientManager.getInstance()
						.getMonthlySummaryRecord(
								Global.currentMonthlySummaryRecordKey);
				refMonthlySummaryPage4 = MedrexClientManager.getInstance()
						.getMonthlySummaryPage4(msr);
			} catch (Exception e) {

			}

			txtPleasure117.setText(refMonthlySummaryPage4.getPleasure117());
			txtPleasure311.setText(refMonthlySummaryPage4.getPleasure311());
			txtPleasure73.setText(refMonthlySummaryPage4.getPleasure73());
			txtTPN117.setText(refMonthlySummaryPage4.getTPN117());
			txtTPN311.setText(refMonthlySummaryPage4.getTPN311());
			txtTPN73.setText(refMonthlySummaryPage4.getTPN73());
			txtGT117.setText(refMonthlySummaryPage4.getGT117());
			txtGT311.setText(refMonthlySummaryPage4.getGT311());
			txtGT73.setText(refMonthlySummaryPage4.getGT73());
			txtSnack117.setText(refMonthlySummaryPage4.getSnack117());
			txtSnack311.setText(refMonthlySummaryPage4.getSnack311());
			txtSnack73.setText(refMonthlySummaryPage4.getSnack73());
			txtTotal117.setText(refMonthlySummaryPage4.getTotal117());
			txtTotal311.setText(refMonthlySummaryPage4.getTotal311());
			txtTotal73.setText(refMonthlySummaryPage4.getTotal73());
			txtLimited117.setText(refMonthlySummaryPage4.getLimited117());
			txtLimited311.setText(refMonthlySummaryPage4.getLimited311());
			txtLimited73.setText(refMonthlySummaryPage4.getLimited73());
			txtIndependent117.setText(refMonthlySummaryPage4
					.getIndependent117());
			txtIndependent311.setText(refMonthlySummaryPage4
					.getIndependent311());
			txtIndependent73.setText(refMonthlySummaryPage4.getIndependent73());
			cbToiletingTotal117.setSelected(refMonthlySummaryPage4
					.isToiletingTotal117());
			cbTransferTotal117.setSelected(refMonthlySummaryPage4
					.isTransferTotal117());
			cbBedTotal117.setSelected(refMonthlySummaryPage4.isBedTotal117());
			cbToiletingExtensive2117.setSelected(refMonthlySummaryPage4
					.isToiletingExtensive2117());
			cbTransferExtensive2117.setSelected(refMonthlySummaryPage4
					.isTransferExtensive2117());
			cbBedExtensive2117.setSelected(refMonthlySummaryPage4
					.isBedExtensive2117());
			cbToiletingExtensive1117.setSelected(refMonthlySummaryPage4
					.isToiletingExtensive1117());
			cbTransferExtensive1117.setSelected(refMonthlySummaryPage4
					.isTransferExtensive1117());
			cbBedExtensive117.setSelected(refMonthlySummaryPage4
					.isBedExtensive117());
			cbToiletingLimited117.setSelected(refMonthlySummaryPage4
					.isToiletingLimited117());
			cbTransferLimited117.setSelected(refMonthlySummaryPage4
					.isTransferLimited117());
			cbBedLimited117.setSelected(refMonthlySummaryPage4
					.isBedLimited117());
			cbToiletingIndependent117.setSelected(refMonthlySummaryPage4
					.isToiletingIndependent117());
			cbTransferIndependent117.setSelected(refMonthlySummaryPage4
					.isTransferIndependent117());
			cbBedIndependent117.setSelected(refMonthlySummaryPage4
					.isBedIndependent117());
			cbToiletingTotal311.setSelected(refMonthlySummaryPage4
					.isToiletingTotal311());
			cbTransferTotal311.setSelected(refMonthlySummaryPage4
					.isTransferTotal311());
			cbBedTotal311.setSelected(refMonthlySummaryPage4.isBedTotal311());
			cbToiletingExtensive2311.setSelected(refMonthlySummaryPage4
					.isToiletingExtensive2311());
			cbTransferExtensive2311.setSelected(refMonthlySummaryPage4
					.isTransferExtensive2311());
			cbBedExtensive2311.setSelected(refMonthlySummaryPage4
					.isBedExtensive2311());
			cbToiletingExtensive1311.setSelected(refMonthlySummaryPage4
					.isToiletingExtensive1311());
			cbTransferExtensive1311.setSelected(refMonthlySummaryPage4
					.isTransferExtensive1311());
			cbBedExtensive1311.setSelected(refMonthlySummaryPage4
					.isBedExtensive1311());
			cbToiletingLimited311.setSelected(refMonthlySummaryPage4
					.isToiletingLimited311());
			cbTransferLimited311.setSelected(refMonthlySummaryPage4
					.isTransferLimited311());
			cbBedLimited311.setSelected(refMonthlySummaryPage4
					.isBedLimited311());
			cbToiletingIndependent311.setSelected(refMonthlySummaryPage4
					.isToiletingIndependent311());
			cbTransferIndependent311.setSelected(refMonthlySummaryPage4
					.isTransferIndependent311());
			cbBedIndependent311.setSelected(refMonthlySummaryPage4
					.isBedIndependent311());
			cbToiletingTotal73.setSelected(refMonthlySummaryPage4
					.isToiletingTotal73());
			cbTransferTotal73.setSelected(refMonthlySummaryPage4
					.isTransferTotal73());
			cbBedTotal73.setSelected(refMonthlySummaryPage4.isBedTotal73());
			cbToiletingExtensive273.setSelected(refMonthlySummaryPage4
					.isToiletingExtensive273());
			cbTransferExtensive273.setSelected(refMonthlySummaryPage4
					.isTransferExtensive273());
			cbBedExtensive273.setSelected(refMonthlySummaryPage4
					.isBedExtensive273());
			cbToiletingExtensive173.setSelected(refMonthlySummaryPage4
					.isToiletingExtensive173());
			cbTransferExtensive173.setSelected(refMonthlySummaryPage4
					.isTransferExtensive173());
			cbBedExtensive173.setSelected(refMonthlySummaryPage4
					.isBedExtensive173());
			cbToiletingLimited73.setSelected(refMonthlySummaryPage4
					.isToiletingLimited73());
			cbTransferLimited73.setSelected(refMonthlySummaryPage4
					.isTransferLimited73());
			cbBedLimited73.setSelected(refMonthlySummaryPage4.isBedLimited73());
			cbToiletingIndependent73.setSelected(refMonthlySummaryPage4
					.isToiletingIndependent73());
			cbTransferIndependent73.setSelected(refMonthlySummaryPage4
					.isTransferIndependent73());
			cbBedIndependent73.setSelected(refMonthlySummaryPage4
					.isBedIndependent73());
			txtAreaOtherIntervention.setText(refMonthlySummaryPage4
					.getAreaOtherIntervention());
			txtOtherSkilled5117.setText(refMonthlySummaryPage4
					.getOtherSkilled5117());
			txtOtherSkilled5311.setText(refMonthlySummaryPage4
					.getOtherSkilled5311());
			txtOtherSkilled573.setText(refMonthlySummaryPage4
					.getOtherSkilled573());
			txtOtherSkilled4117.setText(refMonthlySummaryPage4
					.getOtherSkilled4117());
			txtOtherSkilled4311.setText(refMonthlySummaryPage4
					.getOtherSkilled4311());
			txtOtherSkilled473.setText(refMonthlySummaryPage4
					.getOtherSkilled473());
			txtOtherSkilled3117.setText(refMonthlySummaryPage4
					.getOtherSkilled3117());
			txtOtherSkilled3311.setText(refMonthlySummaryPage4
					.getOtherSkilled3311());
			txtOtherSkilled373.setText(refMonthlySummaryPage4
					.getOtherSkilled373());
			txtOtherSkilled2117.setText(refMonthlySummaryPage4
					.getOtherSkilled2117());
			txtOtherSkilled2311.setText(refMonthlySummaryPage4
					.getOtherSkilled2311());
			txtOtherSkilled273.setText(refMonthlySummaryPage4
					.getOtherSkilled273());
			txtOtherSkilled1117.setText(refMonthlySummaryPage4
					.getOtherSkilled1117());
			txtOtherSkilled1311.setText(refMonthlySummaryPage4
					.getOtherSkilled1311());
			txtOtherSkilled173.setText(refMonthlySummaryPage4
					.getOtherSkilled173());
			txtOtherSkilled5.setText(refMonthlySummaryPage4.getOtherSkilled5());
			txtOtherSkilled4.setText(refMonthlySummaryPage4.getOtherSkilled4());
			txtOtherSkilled3.setText(refMonthlySummaryPage4.getOtherSkilled3());
			txtOtherSkilled2.setText(refMonthlySummaryPage4.getOtherSkilled2());
			txtOtherSkilled1.setText(refMonthlySummaryPage4.getOtherSkilled1());
			txtAreaSkinIntervention.setText(refMonthlySummaryPage4
					.getAreaSkinIntervention());
			txtWound117.setText(refMonthlySummaryPage4.getWound117());
			txtWound311.setText(refMonthlySummaryPage4.getWound311());
			txtWound73.setText(refMonthlySummaryPage4.getWound73());
			txtNewSkin117.setText(refMonthlySummaryPage4.getNewSkin117());
			txtNewSkin311.setText(refMonthlySummaryPage4.getNewSkin311());
			txtNewSkin73.setText(refMonthlySummaryPage4.getNewSkin73());
			txtSutures117.setText(refMonthlySummaryPage4.getSutures117());
			txtSutures311.setText(refMonthlySummaryPage4.getSutures311());
			txtSutures73.setText(refMonthlySummaryPage4.getSutures73());
			txtSkinIntact117.setText(refMonthlySummaryPage4.getSkinIntact117());
			txtSkinIntact311.setText(refMonthlySummaryPage4.getSkinIntact311());
			txtSkinIntact73.setText(refMonthlySummaryPage4.getSkinIntact73());
			txtAreaRespirationIntervention.setText(refMonthlySummaryPage4
					.getAreaRespirationIntervention());
			txtTrachCare117.setText(refMonthlySummaryPage4.getTrachCare117());
			txtTrachCare311.setText(refMonthlySummaryPage4.getTrachCare311());
			txtTrachCare73.setText(refMonthlySummaryPage4.getTrachCare73());
			txtSuctioned117.setText(refMonthlySummaryPage4.getSuctioned117());
			txtSuctioned311.setText(refMonthlySummaryPage4.getSuctioned311());
			txtSuctioned73.setText(refMonthlySummaryPage4.getSuctioned73());
			txtAngina117.setText(refMonthlySummaryPage4.getAngina117());
			txtAngina311.setText(refMonthlySummaryPage4.getAngina311());
			txtAngina73.setText(refMonthlySummaryPage4.getAngina73());
			txtheart117.setText(refMonthlySummaryPage4.getHeart117());
			txtheart311.setText(refMonthlySummaryPage4.getHeart311());
			txtheart73.setText(refMonthlySummaryPage4.getHeart73());
			txtCrackles117.setText(refMonthlySummaryPage4.getCrackles117());
			txtCrackles311.setText(refMonthlySummaryPage4.getCrackles311());
			txtCrackles73.setText(refMonthlySummaryPage4.getCrackles73());
			txtLungs117.setText(refMonthlySummaryPage4.getLungs117());
			txtLungs311.setText(refMonthlySummaryPage4.getLungs311());
			txtLungs73.setText(refMonthlySummaryPage4.getLungs73());
			txtBreath117.setText(refMonthlySummaryPage4.getBreath117());
			txtBreath311.setText(refMonthlySummaryPage4.getBreath311());
			txtBreath73.setText(refMonthlySummaryPage4.getBreath73());
			txtAreaVitalIntervention.setText(refMonthlySummaryPage4
					.getAreaVitalIntervention());
			txtO2117.setText(refMonthlySummaryPage4.getO2117());
			txtO2311.setText(refMonthlySummaryPage4.getO2311());
			txtO273.setText(refMonthlySummaryPage4.getO273());
			txtTemp117.setText(refMonthlySummaryPage4.getTemp117());
			txtTemp311.setText(refMonthlySummaryPage4.getTemp311());
			txtTemp73.setText(refMonthlySummaryPage4.getTemp73());
			txtRespirations117.setText(refMonthlySummaryPage4
					.getRespirations117());
			txtRespirations311.setText(refMonthlySummaryPage4
					.getRespirations311());
			txtRespirations73.setText(refMonthlySummaryPage4
					.getRespirations73());
			txtPulse117.setText(refMonthlySummaryPage4.getPulse117());
			txtPulse311.setText(refMonthlySummaryPage4.getPulse311());
			txtPulse73.setText(refMonthlySummaryPage4.getPulse73());
			txtBP117.setText(refMonthlySummaryPage4.getBP117());
			txtBP311.setText(refMonthlySummaryPage4.getBP311());
			txtBP73.setText(refMonthlySummaryPage4.getBP73());
			txtRoom.setText(refMonthlySummaryPage4.getRoom());
			txtResidentName.setText(refMonthlySummaryPage4.getResidentName());
			dcDate.setDate(refMonthlySummaryPage4.getDate());

			Global.currentMonthlySummaryPage4Key = refMonthlySummaryPage4
					.getSerial();
		} else {
			Global.currentMonthlySummaryPage4Key = 0;
		}

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
