package medrex.client.main.MonthlySummary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.monthlySummary.SkilledFlowSheet;

import com.toedter.calendar.JDateChooser;

public class PanelSkilledFlowSheet extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1341358579649072844L;
	private JCheckBox cbBadMobilityLimited3To11;
	private JCheckBox cbToiletingIndependent11To7;
	private JCheckBox cbToiletingLimited11To7;
	private JCheckBox cbToileting1Extensive11To7;
	private JCheckBox cbToileting2Extensive11To7;
	private JCheckBox cbToiletingTotalDependence11To7;
	private JCheckBox cbTransferTotalIndependence11To7;
	private JCheckBox cbBadMobilityTotalIndependence11To7;
	private JCheckBox cbBadMobility1Extensive11To7;
	private JCheckBox cbBadMobilityLimited11To7;
	private JCheckBox cbBadMobilityIndepemdent11To7;
	private JCheckBox cbBadMobility2Extensive11To7;
	private JCheckBox cbBadMobilityTotalIndependence3To11;
	private JCheckBox cbBadMobility2Extensive3To11;
	private JCheckBox cbBadMobility1Extensive3To11;
	private JCheckBox cbBadMobilityIndepemdent3To11;
	private JCheckBox cbTransferIndepemdent3To11;
	private JCheckBox cbTransferLimited3To11;
	private JCheckBox cbTransfer1Extensive3To11;
	private JCheckBox cbTransfer2Extensive3To11;
	private JCheckBox cbTransferTotalIndependence3To11;
	private JCheckBox cbToiletingTotalDependence3To11;
	private JCheckBox cbToileting2Extensive3To11;
	private JCheckBox cbToiletingLimited3To11;
	private JCheckBox cbToileting1Extensive3To11;
	private JCheckBox cbToiletingIndependent3To11;
	private JCheckBox cbToiletingTotalDependence7To3;
	private JCheckBox cbToileting2Extensive7To3;
	private JCheckBox cbToileting1Extensive7To3;
	private JCheckBox cbToiletingLimited7To3;
	private JCheckBox cbToiletingIndependent7To3;
	private JCheckBox cbTransferIndepemdent7To3;
	private JCheckBox cbTransferLimited7To3;
	private JCheckBox cbTransfer1Extensive7To3;
	private JCheckBox cbTransfer2Extensive7To3;
	private JCheckBox cbTransferTotalIndependence7To3;
	private JCheckBox cbBadMobilityTotalIndependence7_3;
	private JCheckBox cbBadMobility2Extensive7To3;
	private JCheckBox cbBadMobility1Extensive7To3;
	private JCheckBox cbBedMobilityLimited7To3;
	private JCheckBox cbBadMobilityIndepemdent7To3;
	private JTextField txtO2Saturation7To3;
	private JTextArea txtInterventions3;
	private JTextArea txtInterventions2;
	private JTextArea txtInterventions1;
	private JTextArea txtComments;
	private JTextField txtPleasureFoods11To7;
	private JTextField txtPleasureFoods3To11;
	private JTextField txtPleasureFoods7To3;
	private JTextField txtGtFeeding7To3;
	private JTextField txtGtFeeding3To11;
	private JTextField txtGtFeeding11To7;
	private JTextField txtTotalDependence11To7;
	private JTextField txtTotalDependence3To11;
	private JTextField txtTotalDependence7To3;
	private JTextField txtLimitedAssist7To3;
	private JTextField txtLimitedAssist3To11;
	private JTextField txtLimitedAssist11To7;
	private JTextField txtIndependent11To7;
	private JTextField txtIndependent3To11;
	private JTextField txtIndependent7To3;
	private JTextField txtWound11_3;
	private JTextField txtSkinConcern11_3;
	private JTextField txtSuturesStaplesStrips11_3;
	private JTextField txtSkinIntact11_3;
	private JTextField txtSkinIntact3To11;
	private JTextField txtSuturesStaplesStrips3To11;
	private JTextField txtSkinConcern3To11;
	private JTextField txtWound3To11;
	private JTextField txtWound7To3;
	private JTextField txtSkinConcern7To3;
	private JTextField txtSuturesStaplesStrips7To3;
	private JTextField txtSkinIntact7To3;
	private JTextField txtBreathSoundsClear7To3;
	private JTextField txtLungsSoundsDiminished7To3;
	private JTextField txtCracklesRalesRhonchi7To3;
	private JTextField txtHeartRate7To3;
	private JTextField txtAngina7To3;
	private JTextField txtSuctioned7To3;
	private JTextField txtTrachCare7To3;
	private JTextField txtTrachCare3To11;
	private JTextField txtSuctioned3To11;
	private JTextField txtAngina3To11;
	private JTextField txtHeartRate3To11;
	private JTextField txtCracklesRalesRhonchi3To11;
	private JTextField txtLungsSoundsDiminished3To11;
	private JTextField txtBreathSoundsClear3To11;
	private JTextField txtBreathSoundsClear11To7;
	private JTextField txtLungsSoundsDiminished11To7;
	private JTextField txtCracklesRalesRhonchi11To7;
	private JTextField txtHeartRate11To7;
	private JTextField txtAngina11To7;
	private JTextField txtSuctioned11To7;
	private JTextField txtTrachCare11To7;
	private JTextField txtO2Saturation11To7;
	private JTextField txtTemp11To7;
	private JTextField txtRespiration11To7;
	private JTextField txtPulse11To7;
	private JTextField txtPulse3To11;
	private JTextField txtRespiration3To11;
	private JTextField txtTemp3To11;
	private JTextField txtO2Saturation3To11;
	private JTextField txtRespiration7To3;
	private JTextField txtTemp7To3;
	private JTextField txtPulse7To3;
	private JTextField txtBp11To7;
	private JTextField txtBp3To11;
	private JTextField txtBp7To3;
	private JTextField txtRoomNo;
	private JDateChooser dcDate;
	private JTextField txtResidentName;
	private JCheckBox cbTransferIndepemdent11To7;
	private JCheckBox cbTransferLimited11To7;
	private JCheckBox cbTransfer1Extensive11To7;
	private JCheckBox cbTransfer2Extensive11To7;

	public PanelSkilledFlowSheet() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(810, 900));

		final JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(false);
		panel.setBounds(0, 0, 800, 889);
		add(panel);

		final JLabel residentLabel = new JLabel();
		residentLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		residentLabel.setBounds(10, 5, 54, 21);
		residentLabel.setText("Resident");
		panel.add(residentLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(75, 5, 278, 21);
		panel.add(txtResidentName);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dateLabel.setText("Date");
		dateLabel.setBounds(359, 5, 37, 21);
		panel.add(dateLabel);

		dcDate = new JDateChooser();
		dcDate.setBounds(401, 5, 142, 21);
		panel.add(dcDate);

		final JLabel roomLabel = new JLabel();
		roomLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		roomLabel.setText("Room #");
		roomLabel.setBounds(549, 8, 66, 14);
		panel.add(roomLabel);

		txtRoomNo = new JTextField();
		txtRoomNo.setBounds(638, 6, 127, 21);
		panel.add(txtRoomNo);

		final JLabel skilledFlowSheetLabel = new JLabel();
		skilledFlowSheetLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		skilledFlowSheetLabel.setText("SKILLED FLOW SHEET");
		skilledFlowSheetLabel.setBounds(10, 32, 174, 21);
		panel.add(skilledFlowSheetLabel);

		final JPanel panel_9 = new JPanel();
		panel_9.setOpaque(false);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBounds(10, 59, 327, 731);
		panel.add(panel_9);

		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 327, 140);
		panel_9.add(panel_1);
		panel_1.setOpaque(false);
		panel_1.setLayout(null);

		final JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 326, 18);
		panel_1.add(panel_2);

		final JLabel vitalSignsLabel = new JLabel();
		vitalSignsLabel.setBorder(new LineBorder(Color.black, 1, false));
		vitalSignsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		vitalSignsLabel.setText("Vital Signs");
		vitalSignsLabel.setBounds(0, 0, 145, 18);
		panel_2.add(vitalSignsLabel);

		final JLabel label = new JLabel();
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBorder(new LineBorder(Color.black, 1, false));
		label.setText("7 - 3");
		label.setBounds(145, 0, 60, 18);
		panel_2.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setBorder(new LineBorder(Color.black, 1, false));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setText("3 - 11");
		label_1.setBounds(205, 0, 60, 18);
		panel_2.add(label_1);

		final JLabel label_2 = new JLabel();
		label_2.setBorder(new LineBorder(Color.black, 1, false));
		label_2.setText("11 - 7");
		label_2.setBounds(265, 1, 60, 18);
		panel_2.add(label_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 17, 326, 18);
		panel_1.add(panel_3);

		final JLabel bpLabel = new JLabel();
		bpLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		bpLabel.setBorder(new LineBorder(Color.black, 1, false));
		bpLabel.setText("BP");
		bpLabel.setBounds(0, 0, 145, 18);
		panel_3.add(bpLabel);

		txtBp7To3 = new JTextField();
		txtBp7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtBp7To3.setBounds(145, 0, 60, 18);
		panel_3.add(txtBp7To3);

		txtBp3To11 = new JTextField();
		txtBp3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtBp3To11.setBounds(205, 0, 60, 18);
		panel_3.add(txtBp3To11);

		txtBp11To7 = new JTextField();
		txtBp11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtBp11To7.setBounds(265, 0, 60, 18);
		panel_3.add(txtBp11To7);

		final JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 34, 326, 18);
		panel_1.add(panel_4);

		final JLabel pulseLabel = new JLabel();
		pulseLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		pulseLabel.setBorder(new LineBorder(Color.black, 1, false));
		pulseLabel.setText("Pulse");
		pulseLabel.setBounds(0, 0, 145, 18);
		panel_4.add(pulseLabel);

		txtPulse7To3 = new JTextField();
		txtPulse7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtPulse7To3.setBounds(145, 0, 60, 18);
		panel_4.add(txtPulse7To3);

		txtPulse3To11 = new JTextField();
		txtPulse3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtPulse3To11.setBounds(205, 0, 60, 18);
		panel_4.add(txtPulse3To11);

		txtPulse11To7 = new JTextField();
		txtPulse11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtPulse11To7.setBounds(265, 0, 60, 18);
		panel_4.add(txtPulse11To7);

		final JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 51, 326, 18);
		panel_1.add(panel_5);

		final JLabel respirationsLabel = new JLabel();
		respirationsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		respirationsLabel.setBorder(new LineBorder(Color.black, 1, false));
		respirationsLabel.setText("Respirations");
		respirationsLabel.setBounds(0, 0, 145, 18);
		panel_5.add(respirationsLabel);

		txtRespiration7To3 = new JTextField();
		txtRespiration7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtRespiration7To3.setBounds(145, 0, 60, 18);
		panel_5.add(txtRespiration7To3);

		txtRespiration3To11 = new JTextField();
		txtRespiration3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtRespiration3To11.setBounds(205, 0, 60, 18);
		panel_5.add(txtRespiration3To11);

		txtRespiration11To7 = new JTextField();
		txtRespiration11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtRespiration11To7.setBounds(265, 0, 60, 18);
		panel_5.add(txtRespiration11To7);

		final JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setLayout(null);
		panel_6.setBounds(0, 68, 326, 18);
		panel_1.add(panel_6);

		final JLabel tempLabel = new JLabel();
		tempLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		tempLabel.setBorder(new LineBorder(Color.black, 1, false));
		tempLabel.setText("Temp");
		tempLabel.setBounds(0, 0, 145, 18);
		panel_6.add(tempLabel);

		txtTemp7To3 = new JTextField();
		txtTemp7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtTemp7To3.setBounds(145, 0, 60, 18);
		panel_6.add(txtTemp7To3);

		txtTemp3To11 = new JTextField();
		txtTemp3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtTemp3To11.setBounds(205, 0, 60, 18);
		panel_6.add(txtTemp3To11);

		txtTemp11To7 = new JTextField();
		txtTemp11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtTemp11To7.setBounds(265, 0, 60, 18);
		panel_6.add(txtTemp11To7);

		final JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_7.setLayout(null);
		panel_7.setBounds(0, 85, 326, 18);
		panel_1.add(panel_7);

		final JLabel o2SaturationLabel = new JLabel();
		o2SaturationLabel.setBorder(new LineBorder(Color.black, 1, false));
		o2SaturationLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		o2SaturationLabel.setText("O2 saturation");
		o2SaturationLabel.setBounds(0, 0, 145, 18);
		panel_7.add(o2SaturationLabel);

		txtO2Saturation7To3 = new JTextField();
		txtO2Saturation7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtO2Saturation7To3.setBounds(145, 0, 60, 18);
		panel_7.add(txtO2Saturation7To3);

		txtO2Saturation3To11 = new JTextField();
		txtO2Saturation3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtO2Saturation3To11.setBounds(205, 0, 60, 18);
		panel_7.add(txtO2Saturation3To11);

		txtO2Saturation11To7 = new JTextField();
		txtO2Saturation11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtO2Saturation11To7.setBounds(265, 0, 60, 18);
		panel_7.add(txtO2Saturation11To7);

		final JPanel panel_8 = new JPanel();
		panel_8.setOpaque(false);
		panel_8.setLayout(null);
		panel_8.setBounds(0, 102, 326, 38);
		panel_1.add(panel_8);

		final JLabel interventionsLabel = new JLabel();
		interventionsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		interventionsLabel.setBorder(new LineBorder(Color.black, 1, false));
		interventionsLabel.setText("Interventions:");
		interventionsLabel.setBounds(0, 0, 145, 38);
		panel_8.add(interventionsLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane.setBounds(145, 0, 181, 38);
		panel_8.add(scrollPane);

		txtInterventions1 = new JTextArea();
		scrollPane.setViewportView(txtInterventions1);

		final JPanel panel_10 = new JPanel();
		panel_10.setOpaque(false);
		panel_10.setLayout(null);
		panel_10.setBounds(0, 140, 327, 234);
		panel_9.add(panel_10);

		final JPanel panel_11 = new JPanel();
		panel_11.setOpaque(false);
		panel_11.setLayout(null);
		panel_11.setBounds(0, 0, 326, 30);
		panel_10.add(panel_11);

		final JLabel respiratorycardiovascularLabel = new JLabel();
		respiratorycardiovascularLabel.setBorder(new LineBorder(Color.black, 1,
				false));
		respiratorycardiovascularLabel
				.setFont(new Font("Tahoma", Font.BOLD, 12));
		respiratorycardiovascularLabel
				.setText("<html>Respiratory /<br>Cardiovascular");
		respiratorycardiovascularLabel.setBounds(0, 0, 145, 30);
		panel_11.add(respiratorycardiovascularLabel);

		final JLabel label_7 = new JLabel();
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBorder(new LineBorder(Color.black, 1, false));
		label_7.setText("7 - 3");
		label_7.setBounds(145, 0, 60, 30);
		panel_11.add(label_7);

		final JLabel label_8 = new JLabel();
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBorder(new LineBorder(Color.black, 1, false));
		label_8.setText("3 - 11");
		label_8.setBounds(205, 0, 60, 30);
		panel_11.add(label_8);

		final JLabel label_9 = new JLabel();
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBorder(new LineBorder(Color.black, 1, false));
		label_9.setText("11 - 7");
		label_9.setBounds(265, 0, 60, 30);
		panel_11.add(label_9);

		final JPanel panel_12 = new JPanel();
		panel_12.setOpaque(false);
		panel_12.setLayout(null);
		panel_12.setBounds(0, 29, 326, 18);
		panel_10.add(panel_12);

		final JLabel breathSoundsClearLabel = new JLabel();
		breathSoundsClearLabel.setBorder(new LineBorder(Color.black, 1, false));
		breathSoundsClearLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		breathSoundsClearLabel.setText("Breath sounds clear");
		breathSoundsClearLabel.setBounds(0, 0, 145, 18);
		panel_12.add(breathSoundsClearLabel);

		txtBreathSoundsClear7To3 = new JTextField();
		txtBreathSoundsClear7To3
				.setBorder(new LineBorder(Color.black, 1, false));
		txtBreathSoundsClear7To3.setBounds(145, 0, 60, 18);
		panel_12.add(txtBreathSoundsClear7To3);

		txtBreathSoundsClear3To11 = new JTextField();
		txtBreathSoundsClear3To11.setBorder(new LineBorder(Color.black, 1,
				false));
		txtBreathSoundsClear3To11.setBounds(205, 0, 60, 18);
		panel_12.add(txtBreathSoundsClear3To11);

		txtBreathSoundsClear11To7 = new JTextField();
		txtBreathSoundsClear11To7.setBorder(new LineBorder(Color.black, 1,
				false));
		txtBreathSoundsClear11To7.setBounds(265, 0, 60, 18);
		panel_12.add(txtBreathSoundsClear11To7);

		final JPanel panel_13 = new JPanel();
		panel_13.setOpaque(false);
		panel_13.setLayout(null);
		panel_13.setBounds(0, 46, 326, 30);
		panel_10.add(panel_13);

		final JLabel lungsSoundsLabel = new JLabel();
		lungsSoundsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lungsSoundsLabel.setBorder(new LineBorder(Color.black, 1, false));
		lungsSoundsLabel.setText("<html>Lungs sounds <br> diminished</html>");
		lungsSoundsLabel.setBounds(0, 0, 145, 30);
		panel_13.add(lungsSoundsLabel);

		txtLungsSoundsDiminished7To3 = new JTextField();
		txtLungsSoundsDiminished7To3.setBorder(new LineBorder(Color.black, 1,
				false));
		txtLungsSoundsDiminished7To3.setBounds(145, 0, 60, 30);
		panel_13.add(txtLungsSoundsDiminished7To3);

		txtLungsSoundsDiminished3To11 = new JTextField();
		txtLungsSoundsDiminished3To11.setBorder(new LineBorder(Color.black, 1,
				false));
		txtLungsSoundsDiminished3To11.setBounds(205, 0, 60, 30);
		panel_13.add(txtLungsSoundsDiminished3To11);

		txtLungsSoundsDiminished11To7 = new JTextField();
		txtLungsSoundsDiminished11To7.setBorder(new LineBorder(Color.black, 1,
				false));
		txtLungsSoundsDiminished11To7.setBounds(265, 0, 60, 30);
		panel_13.add(txtLungsSoundsDiminished11To7);

		final JPanel panel_14 = new JPanel();
		panel_14.setOpaque(false);
		panel_14.setLayout(null);
		panel_14.setBounds(0, 75, 326, 18);
		panel_10.add(panel_14);

		final JLabel label_3 = new JLabel();
		label_3.setBorder(new LineBorder(Color.black, 1, false));
		label_3.setText("");
		label_3.setBounds(0, 0, 145, 18);
		panel_14.add(label_3);

		final JLabel label_4 = new JLabel();
		label_4.setBorder(new LineBorder(Color.black, 1, false));
		label_4.setText("");
		label_4.setBounds(145, 0, 60, 18);
		panel_14.add(label_4);

		final JLabel label_5 = new JLabel();
		label_5.setBorder(new LineBorder(Color.black, 1, false));
		label_5.setText("");
		label_5.setBounds(205, 0, 60, 18);
		panel_14.add(label_5);

		final JLabel label_6 = new JLabel();
		label_6.setBorder(new LineBorder(Color.black, 1, false));
		label_6.setText("");
		label_6.setBounds(265, 0, 60, 18);
		panel_14.add(label_6);

		final JPanel panel_15 = new JPanel();
		panel_15.setOpaque(false);
		panel_15.setLayout(null);
		panel_15.setBounds(0, 92, 326, 18);
		panel_10.add(panel_15);

		final JLabel cracklesRalesRhonchiLabel = new JLabel();
		cracklesRalesRhonchiLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		cracklesRalesRhonchiLabel.setBorder(new LineBorder(Color.black, 1,
				false));
		cracklesRalesRhonchiLabel.setText("Crackles, rales, rhonchi");
		cracklesRalesRhonchiLabel.setBounds(0, 0, 145, 18);
		panel_15.add(cracklesRalesRhonchiLabel);

		txtCracklesRalesRhonchi7To3 = new JTextField();
		txtCracklesRalesRhonchi7To3.setBorder(new LineBorder(Color.black, 1,
				false));
		txtCracklesRalesRhonchi7To3.setBounds(145, 0, 60, 18);
		panel_15.add(txtCracklesRalesRhonchi7To3);

		txtCracklesRalesRhonchi3To11 = new JTextField();
		txtCracklesRalesRhonchi3To11.setBorder(new LineBorder(Color.black, 1,
				false));
		txtCracklesRalesRhonchi3To11.setBounds(205, 0, 60, 18);
		panel_15.add(txtCracklesRalesRhonchi3To11);

		txtCracklesRalesRhonchi11To7 = new JTextField();
		txtCracklesRalesRhonchi11To7.setBorder(new LineBorder(Color.black, 1,
				false));
		txtCracklesRalesRhonchi11To7.setBounds(265, 0, 60, 18);
		panel_15.add(txtCracklesRalesRhonchi11To7);

		final JPanel panel_16 = new JPanel();
		panel_16.setOpaque(false);
		panel_16.setLayout(null);
		panel_16.setBounds(0, 109, 326, 30);
		panel_10.add(panel_16);

		final JLabel heartRateRegularLabel = new JLabel();
		heartRateRegularLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		heartRateRegularLabel.setBorder(new LineBorder(Color.black, 1, false));
		heartRateRegularLabel
				.setText("<html>Heart rate regular (R) <br> irregular (I)");
		heartRateRegularLabel.setBounds(0, 0, 145, 30);
		panel_16.add(heartRateRegularLabel);

		txtHeartRate7To3 = new JTextField();
		txtHeartRate7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtHeartRate7To3.setBounds(145, 0, 60, 30);
		panel_16.add(txtHeartRate7To3);

		txtHeartRate3To11 = new JTextField();
		txtHeartRate3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtHeartRate3To11.setBounds(205, 0, 60, 30);
		panel_16.add(txtHeartRate3To11);

		txtHeartRate11To7 = new JTextField();
		txtHeartRate11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtHeartRate11To7.setBounds(265, 0, 60, 30);
		panel_16.add(txtHeartRate11To7);

		final JPanel panel_17 = new JPanel();
		panel_17.setOpaque(false);
		panel_17.setLayout(null);
		panel_17.setBounds(0, 138, 326, 18);
		panel_10.add(panel_17);

		final JLabel anginaLabel = new JLabel();
		anginaLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		anginaLabel.setBorder(new LineBorder(Color.black, 1, false));
		anginaLabel.setText("Angina");
		anginaLabel.setBounds(0, 0, 145, 18);
		panel_17.add(anginaLabel);

		txtAngina7To3 = new JTextField();
		txtAngina7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtAngina7To3.setBounds(145, 0, 60, 18);
		panel_17.add(txtAngina7To3);

		txtAngina3To11 = new JTextField();
		txtAngina3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtAngina3To11.setBounds(205, 0, 60, 18);
		panel_17.add(txtAngina3To11);

		txtAngina11To7 = new JTextField();
		txtAngina11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtAngina11To7.setBounds(265, 0, 60, 18);
		panel_17.add(txtAngina11To7);

		final JPanel panel_18 = new JPanel();
		panel_18.setOpaque(false);
		panel_18.setLayout(null);
		panel_18.setBounds(0, 155, 326, 18);
		panel_10.add(panel_18);

		final JLabel suctionedLabel = new JLabel();
		suctionedLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		suctionedLabel.setBorder(new LineBorder(Color.black, 1, false));
		suctionedLabel.setText("Suctioned");
		suctionedLabel.setBounds(0, 0, 145, 18);
		panel_18.add(suctionedLabel);

		txtSuctioned7To3 = new JTextField();
		txtSuctioned7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtSuctioned7To3.setBounds(145, 0, 60, 18);
		panel_18.add(txtSuctioned7To3);

		txtSuctioned3To11 = new JTextField();
		txtSuctioned3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtSuctioned3To11.setBounds(205, 0, 60, 18);
		panel_18.add(txtSuctioned3To11);

		txtSuctioned11To7 = new JTextField();
		txtSuctioned11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtSuctioned11To7.setBounds(265, 0, 60, 18);
		panel_18.add(txtSuctioned11To7);

		final JPanel panel_19 = new JPanel();
		panel_19.setOpaque(false);
		panel_19.setLayout(null);
		panel_19.setBounds(0, 173, 326, 18);
		panel_10.add(panel_19);

		final JLabel trachCareLabel = new JLabel();
		trachCareLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		trachCareLabel.setBorder(new LineBorder(Color.black, 1, false));
		trachCareLabel.setText("Trach care");
		trachCareLabel.setBounds(0, 0, 145, 18);
		panel_19.add(trachCareLabel);

		txtTrachCare7To3 = new JTextField();
		txtTrachCare7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtTrachCare7To3.setBounds(145, 0, 60, 18);
		panel_19.add(txtTrachCare7To3);

		txtTrachCare3To11 = new JTextField();
		txtTrachCare3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtTrachCare3To11.setBounds(205, 0, 60, 18);
		panel_19.add(txtTrachCare3To11);

		txtTrachCare11To7 = new JTextField();
		txtTrachCare11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtTrachCare11To7.setBounds(265, 0, 60, 18);
		panel_19.add(txtTrachCare11To7);

		final JPanel panel_20 = new JPanel();
		panel_20.setOpaque(false);
		panel_20.setLayout(null);
		panel_20.setBounds(0, 190, 326, 40);
		panel_10.add(panel_20);

		final JLabel interventionsLabel_1 = new JLabel();
		interventionsLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		interventionsLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		interventionsLabel_1.setText("Interventions:");
		interventionsLabel_1.setBounds(0, 0, 145, 40);
		panel_20.add(interventionsLabel_1);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane_1.setBounds(145, 0, 181, 40);
		panel_20.add(scrollPane_1);

		txtInterventions2 = new JTextArea();
		scrollPane_1.setViewportView(txtInterventions2);

		final JPanel panel_1_1 = new JPanel();
		panel_1_1.setOpaque(false);
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 372, 327, 192);
		panel_9.add(panel_1_1);

		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setOpaque(false);
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(0, 0, 326, 18);
		panel_1_1.add(panel_2_1);

		final JLabel vitalSignsLabel_1 = new JLabel();
		vitalSignsLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		vitalSignsLabel_1.setBackground(Color.WHITE);
		vitalSignsLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		vitalSignsLabel_1.setText("Skin integrity");
		vitalSignsLabel_1.setBounds(0, 0, 145, 18);
		panel_2_1.add(vitalSignsLabel_1);

		final JLabel label_10 = new JLabel();
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_10.setBorder(new LineBorder(Color.black, 1, false));
		label_10.setText("7 - 3");
		label_10.setBounds(145, 0, 60, 18);
		panel_2_1.add(label_10);

		final JLabel label_1_1 = new JLabel();
		label_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1_1.setBorder(new LineBorder(Color.black, 1, false));
		label_1_1.setText("3 - 11");
		label_1_1.setBounds(205, 0, 60, 18);
		panel_2_1.add(label_1_1);

		final JLabel label_2_1 = new JLabel();
		label_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2_1.setBorder(new LineBorder(Color.black, 1, false));
		label_2_1.setText("11 - 3");
		label_2_1.setBounds(265, 1, 60, 18);
		panel_2_1.add(label_2_1);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setOpaque(false);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(0, 17, 326, 18);
		panel_1_1.add(panel_3_1);

		final JLabel bpLabel_1 = new JLabel();
		bpLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		bpLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		bpLabel_1.setText("Skin intact");
		bpLabel_1.setBounds(0, 0, 145, 18);
		panel_3_1.add(bpLabel_1);

		txtSkinIntact7To3 = new JTextField();
		txtSkinIntact7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtSkinIntact7To3.setBounds(145, 0, 60, 18);
		panel_3_1.add(txtSkinIntact7To3);

		txtSkinIntact3To11 = new JTextField();
		txtSkinIntact3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtSkinIntact3To11.setBounds(205, 0, 60, 18);
		panel_3_1.add(txtSkinIntact3To11);

		txtSkinIntact11_3 = new JTextField();
		txtSkinIntact11_3.setBorder(new LineBorder(Color.black, 1, false));
		txtSkinIntact11_3.setBounds(265, 0, 60, 18);
		panel_3_1.add(txtSkinIntact11_3);

		final JPanel panel_4_1 = new JPanel();
		panel_4_1.setOpaque(false);
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(0, 34, 326, 34);
		panel_1_1.add(panel_4_1);

		final JLabel pulseLabel_1 = new JLabel();
		pulseLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		pulseLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		pulseLabel_1.setText("<html>Sutures, staples, steri<br> strips (site)");
		pulseLabel_1.setBounds(0, 0, 145, 34);
		panel_4_1.add(pulseLabel_1);

		txtSuturesStaplesStrips7To3 = new JTextField();
		txtSuturesStaplesStrips7To3.setBorder(new LineBorder(Color.black, 1,
				false));
		txtSuturesStaplesStrips7To3.setBounds(145, 0, 60, 34);
		panel_4_1.add(txtSuturesStaplesStrips7To3);

		txtSuturesStaplesStrips3To11 = new JTextField();
		txtSuturesStaplesStrips3To11.setBorder(new LineBorder(Color.black, 1,
				false));
		txtSuturesStaplesStrips3To11.setBounds(205, 0, 60, 34);
		panel_4_1.add(txtSuturesStaplesStrips3To11);

		txtSuturesStaplesStrips11_3 = new JTextField();
		txtSuturesStaplesStrips11_3.setBorder(new LineBorder(Color.black, 1,
				false));
		txtSuturesStaplesStrips11_3.setBounds(265, 0, 60, 34);
		panel_4_1.add(txtSuturesStaplesStrips11_3);

		final JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setOpaque(false);
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(0, 67, 326, 51);
		panel_1_1.add(panel_4_1_1);

		final JLabel pulseLabel_1_1 = new JLabel();
		pulseLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		pulseLabel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		pulseLabel_1_1
				.setText("<html>New skin concerns <br> ses, skin tears,<br>reations, rashes");
		pulseLabel_1_1.setBounds(0, 0, 145, 51);
		panel_4_1_1.add(pulseLabel_1_1);

		txtSkinConcern7To3 = new JTextField();
		txtSkinConcern7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtSkinConcern7To3.setBounds(145, 0, 60, 51);
		panel_4_1_1.add(txtSkinConcern7To3);

		txtSkinConcern3To11 = new JTextField();
		txtSkinConcern3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtSkinConcern3To11.setBounds(205, 0, 60, 51);
		panel_4_1_1.add(txtSkinConcern3To11);

		txtSkinConcern11_3 = new JTextField();
		txtSkinConcern11_3.setBorder(new LineBorder(Color.black, 1, false));
		txtSkinConcern11_3.setBounds(265, 0, 60, 51);
		panel_4_1_1.add(txtSkinConcern11_3);

		final JPanel panel_4_1_2 = new JPanel();
		panel_4_1_2.setOpaque(false);
		panel_4_1_2.setLayout(null);
		panel_4_1_2.setBounds(0, 117, 326, 34);
		panel_1_1.add(panel_4_1_2);

		final JLabel pulseLabel_1_2 = new JLabel();
		pulseLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		pulseLabel_1_2.setBorder(new LineBorder(Color.black, 1, false));
		pulseLabel_1_2
				.setText("<html>Wound (pressure, <br> stasis) indicate site");
		pulseLabel_1_2.setBounds(0, 0, 145, 34);
		panel_4_1_2.add(pulseLabel_1_2);

		txtWound7To3 = new JTextField();
		txtWound7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtWound7To3.setBounds(145, 0, 60, 34);
		panel_4_1_2.add(txtWound7To3);

		txtWound3To11 = new JTextField();
		txtWound3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtWound3To11.setBounds(205, 0, 60, 34);
		panel_4_1_2.add(txtWound3To11);

		txtWound11_3 = new JTextField();
		txtWound11_3.setBorder(new LineBorder(Color.black, 1, false));
		txtWound11_3.setBounds(265, 0, 60, 34);
		panel_4_1_2.add(txtWound11_3);

		final JPanel panel_20_1 = new JPanel();
		panel_20_1.setOpaque(false);
		panel_20_1.setLayout(null);
		panel_20_1.setBounds(0, 150, 326, 40);
		panel_1_1.add(panel_20_1);

		final JLabel interventionsLabel_1_1 = new JLabel();
		interventionsLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		interventionsLabel_1_1.setBorder(new LineBorder(Color.black, 1, false));
		interventionsLabel_1_1.setText("Interventions: ");
		interventionsLabel_1_1.setBounds(0, 0, 145, 40);
		panel_20_1.add(interventionsLabel_1_1);

		final JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane_1_1.setBounds(145, 0, 181, 40);
		panel_20_1.add(scrollPane_1_1);

		txtInterventions3 = new JTextArea();
		scrollPane_1_1.setViewportView(txtInterventions3);

		final JPanel eatingPanel = new JPanel();
		eatingPanel.setLayout(null);
		eatingPanel.setBounds(0, 562, 327, 169);
		panel_9.add(eatingPanel);

		final JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(0, 0, 326, 18);
		eatingPanel.add(panel_2_3);

		final JLabel vitalSignsLabel1 = new JLabel();
		vitalSignsLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		vitalSignsLabel1.setBorder(new LineBorder(Color.black, 1, false));
		vitalSignsLabel1.setText("Eating");
		vitalSignsLabel1.setBounds(0, 0, 145, 18);
		panel_2_3.add(vitalSignsLabel1);

		final JLabel label1 = new JLabel();
		label1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBorder(new LineBorder(Color.black, 1, false));
		label1.setText("7-3");
		label1.setBounds(145, 0, 60, 18);
		panel_2_3.add(label1);

		final JLabel label_11 = new JLabel();
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBorder(new LineBorder(Color.black, 1, false));
		label_11.setText("3-11");
		label_11.setBounds(205, 0, 60, 18);
		panel_2_3.add(label_11);

		final JLabel label_21 = new JLabel();
		label_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setBorder(new LineBorder(Color.black, 1, false));
		label_21.setText("11-7");
		label_21.setBounds(265, 1, 60, 18);
		panel_2_3.add(label_21);

		final JPanel panel_31 = new JPanel();
		panel_31.setBackground(Color.WHITE);
		panel_31.setLayout(null);
		panel_31.setBounds(0, 17, 326, 18);
		eatingPanel.add(panel_31);

		final JLabel bpLabel1 = new JLabel();
		bpLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		bpLabel1.setBorder(new LineBorder(Color.black, 1, false));
		bpLabel1.setText("Independent / set-up");
		bpLabel1.setBounds(0, 0, 145, 18);
		panel_31.add(bpLabel1);

		txtIndependent7To3 = new JTextField();
		txtIndependent7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtIndependent7To3.setBounds(145, 0, 60, 18);
		panel_31.add(txtIndependent7To3);

		txtIndependent3To11 = new JTextField();
		txtIndependent3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtIndependent3To11.setBounds(205, 0, 60, 18);
		panel_31.add(txtIndependent3To11);

		txtIndependent11To7 = new JTextField();
		txtIndependent11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtIndependent11To7.setBounds(265, 0, 60, 18);
		panel_31.add(txtIndependent11To7);

		final JPanel panel_41 = new JPanel();
		panel_41.setBackground(Color.WHITE);
		panel_41.setLayout(null);
		panel_41.setBounds(0, 34, 326, 18);
		eatingPanel.add(panel_41);

		final JLabel pulseLabel1 = new JLabel();
		pulseLabel1.setFont(new Font("Tahoma", Font.BOLD, 11));
		pulseLabel1.setBackground(Color.WHITE);
		pulseLabel1.setBorder(new LineBorder(Color.black, 1, false));
		pulseLabel1.setText("Limited Assist w/eating");
		pulseLabel1.setBounds(0, 0, 145, 18);
		panel_41.add(pulseLabel1);

		txtLimitedAssist7To3 = new JTextField();
		txtLimitedAssist7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtLimitedAssist7To3.setBounds(145, 0, 60, 18);
		panel_41.add(txtLimitedAssist7To3);

		txtLimitedAssist3To11 = new JTextField();
		txtLimitedAssist3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtLimitedAssist3To11.setBounds(205, 0, 60, 18);
		panel_41.add(txtLimitedAssist3To11);

		txtLimitedAssist11To7 = new JTextField();
		txtLimitedAssist11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtLimitedAssist11To7.setBounds(265, 0, 60, 18);
		panel_41.add(txtLimitedAssist11To7);

		final JPanel panel_51 = new JPanel();
		panel_51.setBackground(Color.WHITE);
		panel_51.setLayout(null);
		panel_51.setBounds(0, 51, 326, 18);
		eatingPanel.add(panel_51);

		final JLabel respirationsLabel1 = new JLabel();
		respirationsLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		respirationsLabel1.setBorder(new LineBorder(Color.black, 1, false));
		respirationsLabel1.setText("Total dependence");
		respirationsLabel1.setBounds(0, 0, 145, 18);
		panel_51.add(respirationsLabel1);

		txtTotalDependence7To3 = new JTextField();
		txtTotalDependence7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalDependence7To3.setBounds(145, 0, 60, 18);
		panel_51.add(txtTotalDependence7To3);

		txtTotalDependence3To11 = new JTextField();
		txtTotalDependence3To11
				.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalDependence3To11.setBounds(205, 0, 60, 18);
		panel_51.add(txtTotalDependence3To11);

		txtTotalDependence11To7 = new JTextField();
		txtTotalDependence11To7
				.setBorder(new LineBorder(Color.black, 1, false));
		txtTotalDependence11To7.setBounds(265, 0, 60, 18);
		panel_51.add(txtTotalDependence11To7);

		final JPanel panel_61 = new JPanel();
		panel_61.setBackground(Color.WHITE);
		panel_61.setLayout(null);
		panel_61.setBounds(0, 68, 326, 18);
		eatingPanel.add(panel_61);

		final JLabel tempLabel1 = new JLabel();
		tempLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		tempLabel1.setBorder(new LineBorder(Color.black, 1, false));
		tempLabel1.setText("GT feeding");
		tempLabel1.setBounds(0, 0, 145, 18);
		panel_61.add(tempLabel1);

		txtGtFeeding7To3 = new JTextField();
		txtGtFeeding7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtGtFeeding7To3.setBounds(145, 0, 60, 18);
		panel_61.add(txtGtFeeding7To3);

		txtGtFeeding3To11 = new JTextField();
		txtGtFeeding3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtGtFeeding3To11.setBounds(205, 0, 60, 18);
		panel_61.add(txtGtFeeding3To11);

		txtGtFeeding11To7 = new JTextField();
		txtGtFeeding11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtGtFeeding11To7.setBounds(265, 0, 60, 18);
		panel_61.add(txtGtFeeding11To7);

		final JPanel panel_71 = new JPanel();
		panel_71.setBackground(Color.WHITE);
		panel_71.setLayout(null);
		panel_71.setBounds(0, 85, 326, 18);
		eatingPanel.add(panel_71);

		final JLabel o2SaturationLabel1 = new JLabel();
		o2SaturationLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		o2SaturationLabel1.setBorder(new LineBorder(Color.black, 1, false));
		o2SaturationLabel1.setText("Pleasure Foods Only");
		o2SaturationLabel1.setBounds(0, 0, 145, 18);
		panel_71.add(o2SaturationLabel1);

		txtPleasureFoods7To3 = new JTextField();
		txtPleasureFoods7To3.setBorder(new LineBorder(Color.black, 1, false));
		txtPleasureFoods7To3.setBounds(145, 0, 60, 18);
		panel_71.add(txtPleasureFoods7To3);

		txtPleasureFoods3To11 = new JTextField();
		txtPleasureFoods3To11.setBorder(new LineBorder(Color.black, 1, false));
		txtPleasureFoods3To11.setBounds(205, 0, 60, 18);
		panel_71.add(txtPleasureFoods3To11);

		txtPleasureFoods11To7 = new JTextField();
		txtPleasureFoods11To7.setBorder(new LineBorder(Color.black, 1, false));
		txtPleasureFoods11To7.setBounds(265, 0, 60, 18);
		panel_71.add(txtPleasureFoods11To7);

		final JPanel panel_81 = new JPanel();
		panel_81.setBackground(Color.WHITE);
		panel_81.setLayout(null);
		panel_81.setBounds(0, 102, 326, 67);
		eatingPanel.add(panel_81);

		final JLabel interventionsLabel1 = new JLabel();
		interventionsLabel1.setFont(new Font("Tahoma", Font.BOLD, 11));
		interventionsLabel1.setVerticalAlignment(SwingConstants.TOP);
		interventionsLabel1.setBorder(new LineBorder(Color.black, 1, false));
		interventionsLabel1.setText("Comments");
		interventionsLabel1.setBounds(0, 0, 145, 67);
		panel_81.add(interventionsLabel1);

		final JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane1.setBounds(145, 0, 181, 67);
		panel_81.add(scrollPane1);

		txtComments = new JTextArea();
		scrollPane1.setViewportView(txtComments);

		final JPanel panel_21 = new JPanel();
		panel_21.setLayout(null);
		panel_21.setBackground(Color.WHITE);
		panel_21.setBounds(372, 59, 428, 813);
		panel.add(panel_21);

		final JLabel label_12 = new JLabel();
		label_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_12.setText("7-3 shift (Check all that apply)");
		label_12.setBounds(369, 35, 215, 14);
		panel.add(label_12);

		final JPanel mobilityPanel = new JPanel();
		mobilityPanel.setLayout(null);
		mobilityPanel.setBackground(Color.WHITE);
		mobilityPanel.setBounds(0, 0, 425, 264);
		panel_21.add(mobilityPanel);

		final JPanel panel_111 = new JPanel();
		panel_111.setLayout(null);
		panel_111.setBackground(Color.WHITE);
		panel_111.setBounds(0, 0, 425, 18);
		mobilityPanel.add(panel_111);

		final JPanel panel_211 = new JPanel();
		panel_211.setBackground(Color.WHITE);
		panel_211.setLayout(new BorderLayout());
		panel_211.setBounds(0, 0, 145, 18);
		panel_111.add(panel_211);

		final JLabel bedMobilityLabel = new JLabel();
		bedMobilityLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		bedMobilityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bedMobilityLabel.setBorder(new LineBorder(Color.black, 1, false));
		bedMobilityLabel.setText("Bed Mobility");
		panel_211.add(bedMobilityLabel, BorderLayout.CENTER);

		final JPanel panel_2_11 = new JPanel();
		panel_2_11.setBackground(Color.WHITE);
		panel_2_11.setLayout(new BorderLayout());
		panel_2_11.setBounds(145, 0, 145, 18);
		panel_111.add(panel_2_11);

		final JLabel transferLabel = new JLabel();
		transferLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		transferLabel.setHorizontalAlignment(SwingConstants.CENTER);
		transferLabel.setBorder(new LineBorder(Color.black, 1, false));
		transferLabel.setText("Transfer");
		panel_2_11.add(transferLabel, BorderLayout.CENTER);

		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setLayout(new BorderLayout());
		panel_2_1_1.setBounds(290, 0, 135, 18);
		panel_111.add(panel_2_1_1);

		final JLabel toiletingLabel = new JLabel();
		toiletingLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		toiletingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		toiletingLabel.setBorder(new LineBorder(Color.black, 1, false));
		toiletingLabel.setText("Toileting");
		panel_2_1_1.add(toiletingLabel, BorderLayout.CENTER);

		final JPanel panel_1_11 = new JPanel();
		panel_1_11.setLayout(null);
		panel_1_11.setBounds(0, 17, 425, 18);
		mobilityPanel.add(panel_1_11);

		final JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(0, 0, 145, 18);
		panel_1_11.add(panel_2_2);

		cbBadMobilityIndepemdent7To3 = new JCheckBox();
		cbBadMobilityIndepemdent7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobilityIndepemdent7To3.setOpaque(false);
		cbBadMobilityIndepemdent7To3.setText("Independent");
		cbBadMobilityIndepemdent7To3.setBounds(10, 0, 125, 17);
		panel_2_2.add(cbBadMobilityIndepemdent7To3);

		final JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2.setBackground(Color.WHITE);
		panel_2_1_2.setBounds(145, 0, 145, 18);
		panel_1_11.add(panel_2_1_2);

		cbTransferIndepemdent7To3 = new JCheckBox();
		cbTransferIndepemdent7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferIndepemdent7To3.setOpaque(false);
		cbTransferIndepemdent7To3.setText("Independent");
		cbTransferIndepemdent7To3.setBounds(10, 0, 101, 17);
		panel_2_1_2.add(cbTransferIndepemdent7To3);

		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setBounds(290, 0, 135, 18);
		panel_1_11.add(panel_2_1_1_1);

		cbToiletingIndependent7To3 = new JCheckBox();
		cbToiletingIndependent7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingIndependent7To3.setOpaque(false);
		cbToiletingIndependent7To3.setText("Independent");
		cbToiletingIndependent7To3.setBounds(10, 0, 115, 17);
		panel_2_1_1_1.add(cbToiletingIndependent7To3);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(0, 34, 425, 54);
		mobilityPanel.add(panel_1_1_1);

		final JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBackground(Color.WHITE);
		panel_2_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_1.setBounds(0, 0, 145, 54);
		panel_1_1_1.add(panel_2_2_1);

		cbBedMobilityLimited7To3 = new JCheckBox();
		cbBedMobilityLimited7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBedMobilityLimited7To3.setBackground(Color.WHITE);
		cbBedMobilityLimited7To3.setText("Limited");
		cbBedMobilityLimited7To3.setBounds(10, 2, 125, 16);
		panel_2_2_1.add(cbBedMobilityLimited7To3);

		final JLabel residentDoesLabel = new JLabel();
		residentDoesLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel.setText("<html><body>Resident does<br> most of care");
		residentDoesLabel.setBounds(10, 22, 125, 26);
		panel_2_2_1.add(residentDoesLabel);

		final JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setLayout(null);
		panel_2_1_2_1.setBackground(Color.WHITE);
		panel_2_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_1.setBounds(145, 0, 145, 54);
		panel_1_1_1.add(panel_2_1_2_1);

		cbTransferLimited7To3 = new JCheckBox();
		cbTransferLimited7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferLimited7To3.setBackground(Color.WHITE);
		cbTransferLimited7To3.setText("Limited");
		cbTransferLimited7To3.setBounds(10, 2, 125, 16);
		panel_2_1_2_1.add(cbTransferLimited7To3);

		final JLabel residentDoesMostLabel = new JLabel();
		residentDoesMostLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesMostLabel
				.setText("<html><body>Resident does<br> most of care");
		residentDoesMostLabel.setBounds(10, 22, 125, 26);
		panel_2_1_2_1.add(residentDoesMostLabel);

		final JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1.setBounds(290, 0, 135, 54);
		panel_1_1_1.add(panel_2_1_1_1_1);

		cbToiletingLimited7To3 = new JCheckBox();
		cbToiletingLimited7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingLimited7To3.setBackground(Color.WHITE);
		cbToiletingLimited7To3.setText("Limited");
		cbToiletingLimited7To3.setBounds(10, 2, 115, 16);
		panel_2_1_1_1_1.add(cbToiletingLimited7To3);

		final JLabel residentDoesMostLabel_1 = new JLabel();
		residentDoesMostLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesMostLabel_1
				.setText("<html><body>Resident does<br> most of care");
		residentDoesMostLabel_1.setBounds(10, 22, 115, 26);
		panel_2_1_1_1_1.add(residentDoesMostLabel_1);

		final JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBounds(0, 87, 425, 72);
		mobilityPanel.add(panel_1_1_1_1);

		final JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setLayout(null);
		panel_2_2_1_1.setBackground(Color.WHITE);
		panel_2_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_1_1.setBounds(0, 0, 145, 72);
		panel_1_1_1_1.add(panel_2_2_1_1);

		cbBadMobility1Extensive7To3 = new JCheckBox();
		cbBadMobility1Extensive7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobility1Extensive7To3.setBackground(Color.WHITE);
		cbBadMobility1Extensive7To3.setText("Extensive1");
		cbBadMobility1Extensive7To3.setBounds(10, 0, 125, 16);
		panel_2_2_1_1.add(cbBadMobility1Extensive7To3);

		final JLabel residentDoesLabel_1 = new JLabel();
		residentDoesLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1.setBounds(10, 22, 125, 40);
		panel_2_2_1_1.add(residentDoesLabel_1);

		final JPanel panel_2_1_2_1_1 = new JPanel();
		panel_2_1_2_1_1.setLayout(null);
		panel_2_1_2_1_1.setBackground(Color.WHITE);
		panel_2_1_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_1_1.setBounds(145, 0, 145, 72);
		panel_1_1_1_1.add(panel_2_1_2_1_1);

		cbTransfer1Extensive7To3 = new JCheckBox();
		cbTransfer1Extensive7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransfer1Extensive7To3.setBackground(Color.WHITE);
		cbTransfer1Extensive7To3.setText("Extensive1");
		cbTransfer1Extensive7To3.setBounds(10, 0, 125, 16);
		panel_2_1_2_1_1.add(cbTransfer1Extensive7To3);

		final JLabel residentDoesLabel_1_1 = new JLabel();
		residentDoesLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_1
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_1.setBounds(10, 22, 125, 40);
		panel_2_1_2_1_1.add(residentDoesLabel_1_1);

		final JPanel panel_2_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1.setBounds(290, 0, 135, 72);
		panel_1_1_1_1.add(panel_2_1_1_1_1_1);

		cbToileting1Extensive7To3 = new JCheckBox();
		cbToileting1Extensive7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToileting1Extensive7To3.setBackground(Color.WHITE);
		cbToileting1Extensive7To3.setText("Extensive1");
		cbToileting1Extensive7To3.setBounds(10, 0, 115, 16);
		panel_2_1_1_1_1_1.add(cbToileting1Extensive7To3);

		final JLabel residentDoesLabel_1_2 = new JLabel();
		residentDoesLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_2
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_2.setBounds(10, 22, 125, 40);
		panel_2_1_1_1_1_1.add(residentDoesLabel_1_2);

		final JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBounds(0, 158, 425, 72);
		mobilityPanel.add(panel_1_1_1_1_1);

		final JPanel panel_2_2_1_1_1 = new JPanel();
		panel_2_2_1_1_1.setLayout(null);
		panel_2_2_1_1_1.setBackground(Color.WHITE);
		panel_2_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_1_1_1.setBounds(0, 0, 145, 72);
		panel_1_1_1_1_1.add(panel_2_2_1_1_1);

		cbBadMobility2Extensive7To3 = new JCheckBox();
		cbBadMobility2Extensive7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobility2Extensive7To3.setBackground(Color.WHITE);
		cbBadMobility2Extensive7To3.setText("Extensive 2");
		cbBadMobility2Extensive7To3.setBounds(10, 0, 125, 16);
		panel_2_2_1_1_1.add(cbBadMobility2Extensive7To3);

		final JLabel residentDoesLabel_1_3 = new JLabel();
		residentDoesLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_3
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_3.setBounds(10, 22, 125, 40);
		panel_2_2_1_1_1.add(residentDoesLabel_1_3);

		final JPanel panel_2_1_2_1_1_1 = new JPanel();
		panel_2_1_2_1_1_1.setLayout(null);
		panel_2_1_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_2_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_1_1_1.setBounds(145, 0, 145, 72);
		panel_1_1_1_1_1.add(panel_2_1_2_1_1_1);

		cbTransfer2Extensive7To3 = new JCheckBox();
		cbTransfer2Extensive7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransfer2Extensive7To3.setBackground(Color.WHITE);
		cbTransfer2Extensive7To3.setText("Extensive 2");
		cbTransfer2Extensive7To3.setBounds(10, 0, 125, 16);
		panel_2_1_2_1_1_1.add(cbTransfer2Extensive7To3);

		final JLabel residentDoesLabel_1_1_1 = new JLabel();
		residentDoesLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_1_1
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_1_1.setBounds(10, 22, 125, 40);
		panel_2_1_2_1_1_1.add(residentDoesLabel_1_1_1);

		final JPanel panel_2_1_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_1.setBounds(290, 0, 135, 72);
		panel_1_1_1_1_1.add(panel_2_1_1_1_1_1_1);

		cbToileting2Extensive7To3 = new JCheckBox();
		cbToileting2Extensive7To3.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToileting2Extensive7To3.setBackground(Color.WHITE);
		cbToileting2Extensive7To3.setText("Extensive 2");
		cbToileting2Extensive7To3.setBounds(10, 0, 115, 16);
		panel_2_1_1_1_1_1_1.add(cbToileting2Extensive7To3);

		final JLabel residentDoesLabel_1_2_1 = new JLabel();
		residentDoesLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_2_1
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_2_1.setBounds(10, 22, 125, 40);
		panel_2_1_1_1_1_1_1.add(residentDoesLabel_1_2_1);

		final JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBounds(0, 229, 425, 34);
		mobilityPanel.add(panel_1_1_2);

		final JPanel panel_2_2_2 = new JPanel();
		panel_2_2_2.setLayout(null);
		panel_2_2_2.setBackground(Color.WHITE);
		panel_2_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_2.setBounds(0, 0, 145, 34);
		panel_1_1_2.add(panel_2_2_2);

		cbBadMobilityTotalIndependence7_3 = new JCheckBox();
		cbBadMobilityTotalIndependence7_3.setFont(new Font("Tahoma", Font.BOLD,
				11));
		cbBadMobilityTotalIndependence7_3.setBackground(Color.WHITE);
		cbBadMobilityTotalIndependence7_3.setText("total dependence");
		cbBadMobilityTotalIndependence7_3.setBounds(10, 0, 125, 16);
		panel_2_2_2.add(cbBadMobilityTotalIndependence7_3);

		final JPanel panel_2_1_2_2 = new JPanel();
		panel_2_1_2_2.setLayout(null);
		panel_2_1_2_2.setBackground(Color.WHITE);
		panel_2_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_2.setBounds(145, 0, 145, 34);
		panel_1_1_2.add(panel_2_1_2_2);

		cbTransferTotalIndependence7To3 = new JCheckBox();
		cbTransferTotalIndependence7To3.setFont(new Font("Tahoma", Font.BOLD,
				11));
		cbTransferTotalIndependence7To3.setBackground(Color.WHITE);
		cbTransferTotalIndependence7To3.setText("total dependence");
		cbTransferTotalIndependence7To3.setBounds(10, 0, 125, 16);
		panel_2_1_2_2.add(cbTransferTotalIndependence7To3);

		final JPanel panel_2_1_1_1_2 = new JPanel();
		panel_2_1_1_1_2.setLayout(null);
		panel_2_1_1_1_2.setBackground(Color.WHITE);
		panel_2_1_1_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_2.setBounds(290, 0, 135, 34);
		panel_1_1_2.add(panel_2_1_1_1_2);

		cbToiletingTotalDependence7To3 = new JCheckBox();
		cbToiletingTotalDependence7To3.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		cbToiletingTotalDependence7To3
				.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingTotalDependence7To3.setBackground(Color.WHITE);
		cbToiletingTotalDependence7To3.setText("total dependence");
		cbToiletingTotalDependence7To3.setBounds(10, 0, 125, 16);
		panel_2_1_1_1_2.add(cbToiletingTotalDependence7To3);

		// mobility 2

		final JPanel mobilityPanel1 = new JPanel();
		mobilityPanel1.setLayout(null);
		mobilityPanel1.setBackground(Color.WHITE);
		mobilityPanel1.setBounds(0, 270, 425, 264);
		panel_21.add(mobilityPanel1);

		final JPanel panel_1_111 = new JPanel();
		panel_1_111.setLayout(null);
		panel_1_111.setBounds(0, 17, 425, 18);
		mobilityPanel1.add(panel_1_111);

		final JPanel panel_2_21 = new JPanel();
		panel_2_21.setLayout(null);
		panel_2_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_21.setBackground(Color.WHITE);
		panel_2_21.setBounds(0, 0, 145, 18);
		panel_1_111.add(panel_2_21);

		cbBadMobilityIndepemdent3To11 = new JCheckBox();
		cbBadMobilityIndepemdent3To11
				.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobilityIndepemdent3To11.setOpaque(false);
		cbBadMobilityIndepemdent3To11.setText("Independent");
		cbBadMobilityIndepemdent3To11.setBounds(10, 0, 125, 17);
		panel_2_21.add(cbBadMobilityIndepemdent3To11);

		final JPanel panel_2_1_21 = new JPanel();
		panel_2_1_21.setLayout(null);
		panel_2_1_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_21.setBackground(Color.WHITE);
		panel_2_1_21.setBounds(145, 0, 145, 18);
		panel_1_111.add(panel_2_1_21);

		cbTransferIndepemdent3To11 = new JCheckBox();
		cbTransferIndepemdent3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferIndepemdent3To11.setOpaque(false);
		cbTransferIndepemdent3To11.setText("Independent");
		cbTransferIndepemdent3To11.setBounds(10, 0, 101, 17);
		panel_2_1_21.add(cbTransferIndepemdent3To11);

		final JPanel panel_2_1_1_11 = new JPanel();
		panel_2_1_1_11.setLayout(null);
		panel_2_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_11.setBackground(Color.WHITE);
		panel_2_1_1_11.setBounds(290, 0, 135, 18);
		panel_1_111.add(panel_2_1_1_11);

		cbToiletingIndependent3To11 = new JCheckBox();
		cbToiletingIndependent3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingIndependent3To11.setOpaque(false);
		cbToiletingIndependent3To11.setText("Independent");
		cbToiletingIndependent3To11.setBounds(10, 0, 115, 17);
		panel_2_1_1_11.add(cbToiletingIndependent3To11);

		final JPanel panel_1_1_11 = new JPanel();
		panel_1_1_11.setLayout(null);
		panel_1_1_11.setBounds(0, 34, 425, 54);
		mobilityPanel1.add(panel_1_1_11);

		final JPanel panel_2_2_11 = new JPanel();
		panel_2_2_11.setLayout(null);
		panel_2_2_11.setBackground(Color.WHITE);
		panel_2_2_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_11.setBounds(0, 0, 145, 54);
		panel_1_1_11.add(panel_2_2_11);

		cbBadMobilityLimited3To11 = new JCheckBox();
		cbBadMobilityLimited3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobilityLimited3To11.setBackground(Color.WHITE);
		cbBadMobilityLimited3To11.setText("Limited");
		cbBadMobilityLimited3To11.setBounds(10, 2, 125, 16);
		panel_2_2_11.add(cbBadMobilityLimited3To11);

		final JLabel residentDoesLabel1 = new JLabel();
		residentDoesLabel1.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel1
				.setText("<html><body>Resident does<br> most of care");
		residentDoesLabel1.setBounds(10, 22, 125, 26);
		panel_2_2_11.add(residentDoesLabel1);

		final JPanel panel_2_1_2_11 = new JPanel();
		panel_2_1_2_11.setLayout(null);
		panel_2_1_2_11.setBackground(Color.WHITE);
		panel_2_1_2_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_11.setBounds(145, 0, 145, 54);
		panel_1_1_11.add(panel_2_1_2_11);

		cbTransferLimited3To11 = new JCheckBox();
		cbTransferLimited3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferLimited3To11.setBackground(Color.WHITE);
		cbTransferLimited3To11.setText("Limited");
		cbTransferLimited3To11.setBounds(10, 2, 125, 16);
		panel_2_1_2_11.add(cbTransferLimited3To11);

		final JLabel residentDoesMostLabel1 = new JLabel();
		residentDoesMostLabel1.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesMostLabel1
				.setText("<html><body>Resident does<br> most of care");
		residentDoesMostLabel1.setBounds(10, 22, 125, 26);
		panel_2_1_2_11.add(residentDoesMostLabel1);

		final JPanel panel_2_1_1_1_11 = new JPanel();
		panel_2_1_1_1_11.setLayout(null);
		panel_2_1_1_1_11.setBackground(Color.WHITE);
		panel_2_1_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_11.setBounds(290, 0, 135, 54);
		panel_1_1_11.add(panel_2_1_1_1_11);

		cbToiletingLimited3To11 = new JCheckBox();
		cbToiletingLimited3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingLimited3To11.setBackground(Color.WHITE);
		cbToiletingLimited3To11.setText("Limited");
		cbToiletingLimited3To11.setBounds(10, 2, 115, 16);
		panel_2_1_1_1_11.add(cbToiletingLimited3To11);

		final JLabel residentDoesMostLabel_11 = new JLabel();
		residentDoesMostLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesMostLabel_11
				.setText("<html><body>Resident does<br> most of care");
		residentDoesMostLabel_11.setBounds(10, 22, 115, 26);
		panel_2_1_1_1_11.add(residentDoesMostLabel_11);

		final JPanel panel_1_1_1_11 = new JPanel();
		panel_1_1_1_11.setLayout(null);
		panel_1_1_1_11.setBounds(0, 87, 425, 72);
		mobilityPanel1.add(panel_1_1_1_11);

		final JPanel panel_2_2_1_11 = new JPanel();
		panel_2_2_1_11.setLayout(null);
		panel_2_2_1_11.setBackground(Color.WHITE);
		panel_2_2_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_1_11.setBounds(0, 0, 145, 72);
		panel_1_1_1_11.add(panel_2_2_1_11);

		cbBadMobility1Extensive3To11 = new JCheckBox();
		cbBadMobility1Extensive3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobility1Extensive3To11.setBackground(Color.WHITE);
		cbBadMobility1Extensive3To11.setText("Extensive1");
		cbBadMobility1Extensive3To11.setBounds(10, 0, 125, 16);
		panel_2_2_1_11.add(cbBadMobility1Extensive3To11);

		final JLabel residentDoesLabel_11 = new JLabel();
		residentDoesLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_11
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_11.setBounds(10, 22, 125, 40);
		panel_2_2_1_11.add(residentDoesLabel_11);

		final JPanel panel_2_1_2_1_11 = new JPanel();
		panel_2_1_2_1_11.setLayout(null);
		panel_2_1_2_1_11.setBackground(Color.WHITE);
		panel_2_1_2_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_1_11.setBounds(145, 0, 145, 72);
		panel_1_1_1_11.add(panel_2_1_2_1_11);

		cbTransfer1Extensive3To11 = new JCheckBox();
		cbTransfer1Extensive3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransfer1Extensive3To11.setBackground(Color.WHITE);
		cbTransfer1Extensive3To11.setText("Extensive1");
		cbTransfer1Extensive3To11.setBounds(10, 0, 125, 16);
		panel_2_1_2_1_11.add(cbTransfer1Extensive3To11);

		final JLabel residentDoesLabel_1_11 = new JLabel();
		residentDoesLabel_1_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_11
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_11.setBounds(10, 22, 125, 40);
		panel_2_1_2_1_11.add(residentDoesLabel_1_11);

		final JPanel panel_2_1_1_1_1_11 = new JPanel();
		panel_2_1_1_1_1_11.setLayout(null);
		panel_2_1_1_1_1_11.setBackground(Color.WHITE);
		panel_2_1_1_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_11.setBounds(290, 0, 135, 72);
		panel_1_1_1_11.add(panel_2_1_1_1_1_11);

		cbToileting1Extensive3To11 = new JCheckBox();
		cbToileting1Extensive3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToileting1Extensive3To11.setBackground(Color.WHITE);
		cbToileting1Extensive3To11.setText("Extensive1");
		cbToileting1Extensive3To11.setBounds(10, 0, 115, 16);
		panel_2_1_1_1_1_11.add(cbToileting1Extensive3To11);

		final JLabel residentDoesLabel_1_21 = new JLabel();
		residentDoesLabel_1_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_21
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_21.setBounds(10, 22, 125, 40);
		panel_2_1_1_1_1_11.add(residentDoesLabel_1_21);

		final JPanel panel_1_1_1_1_11 = new JPanel();
		panel_1_1_1_1_11.setLayout(null);
		panel_1_1_1_1_11.setBounds(0, 158, 425, 72);
		mobilityPanel1.add(panel_1_1_1_1_11);

		final JPanel panel_2_2_1_1_11 = new JPanel();
		panel_2_2_1_1_11.setLayout(null);
		panel_2_2_1_1_11.setBackground(Color.WHITE);
		panel_2_2_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_1_1_11.setBounds(0, 0, 145, 72);
		panel_1_1_1_1_11.add(panel_2_2_1_1_11);

		cbBadMobility2Extensive3To11 = new JCheckBox();
		cbBadMobility2Extensive3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobility2Extensive3To11.setBackground(Color.WHITE);
		cbBadMobility2Extensive3To11.setText("Extensive 2");
		cbBadMobility2Extensive3To11.setBounds(10, 0, 125, 16);
		panel_2_2_1_1_11.add(cbBadMobility2Extensive3To11);

		final JLabel residentDoesLabel_1_31 = new JLabel();
		residentDoesLabel_1_31.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_31
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_31.setBounds(10, 22, 125, 40);
		panel_2_2_1_1_11.add(residentDoesLabel_1_31);

		final JPanel panel_2_1_2_1_1_11 = new JPanel();
		panel_2_1_2_1_1_11.setLayout(null);
		panel_2_1_2_1_1_11.setBackground(Color.WHITE);
		panel_2_1_2_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_1_1_11.setBounds(145, 0, 145, 72);
		panel_1_1_1_1_11.add(panel_2_1_2_1_1_11);

		cbTransfer2Extensive3To11 = new JCheckBox();
		cbTransfer2Extensive3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransfer2Extensive3To11.setBackground(Color.WHITE);
		cbTransfer2Extensive3To11.setText("Extensive 2");
		cbTransfer2Extensive3To11.setBounds(10, 0, 125, 16);
		panel_2_1_2_1_1_11.add(cbTransfer2Extensive3To11);

		final JLabel residentDoesLabel_1_1_11 = new JLabel();
		residentDoesLabel_1_1_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_1_11
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_1_11.setBounds(10, 22, 125, 40);
		panel_2_1_2_1_1_11.add(residentDoesLabel_1_1_11);

		final JPanel panel_2_1_1_1_1_1_11 = new JPanel();
		panel_2_1_1_1_1_1_11.setLayout(null);
		panel_2_1_1_1_1_1_11.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_11.setBounds(290, 0, 135, 72);
		panel_1_1_1_1_11.add(panel_2_1_1_1_1_1_11);

		cbToileting2Extensive3To11 = new JCheckBox();
		cbToileting2Extensive3To11.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToileting2Extensive3To11.setBackground(Color.WHITE);
		cbToileting2Extensive3To11.setText("Extensive 2");
		cbToileting2Extensive3To11.setBounds(10, 0, 115, 16);
		panel_2_1_1_1_1_1_11.add(cbToileting2Extensive3To11);

		final JLabel residentDoesLabel_1_2_11 = new JLabel();
		residentDoesLabel_1_2_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_2_11
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_2_11.setBounds(10, 22, 125, 40);
		panel_2_1_1_1_1_1_11.add(residentDoesLabel_1_2_11);

		final JPanel panel_1_1_21 = new JPanel();
		panel_1_1_21.setLayout(null);
		panel_1_1_21.setBounds(0, 229, 425, 34);
		mobilityPanel1.add(panel_1_1_21);

		final JPanel panel_2_2_21 = new JPanel();
		panel_2_2_21.setLayout(null);
		panel_2_2_21.setBackground(Color.WHITE);
		panel_2_2_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_21.setBounds(0, 0, 145, 34);
		panel_1_1_21.add(panel_2_2_21);

		cbBadMobilityTotalIndependence3To11 = new JCheckBox();
		cbBadMobilityTotalIndependence3To11.setFont(new Font("Tahoma",
				Font.BOLD, 11));
		cbBadMobilityTotalIndependence3To11.setBackground(Color.WHITE);
		cbBadMobilityTotalIndependence3To11.setText("total dependence");
		cbBadMobilityTotalIndependence3To11.setBounds(10, 0, 125, 16);
		panel_2_2_21.add(cbBadMobilityTotalIndependence3To11);

		final JPanel panel_2_1_2_21 = new JPanel();
		panel_2_1_2_21.setLayout(null);
		panel_2_1_2_21.setBackground(Color.WHITE);
		panel_2_1_2_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_21.setBounds(145, 0, 145, 34);
		panel_1_1_21.add(panel_2_1_2_21);

		cbTransferTotalIndependence3To11 = new JCheckBox();
		cbTransferTotalIndependence3To11.setFont(new Font("Tahoma", Font.BOLD,
				11));
		cbTransferTotalIndependence3To11.setBackground(Color.WHITE);
		cbTransferTotalIndependence3To11.setText("total dependence");
		cbTransferTotalIndependence3To11.setBounds(10, 0, 125, 16);
		panel_2_1_2_21.add(cbTransferTotalIndependence3To11);

		final JPanel panel_2_1_1_1_21 = new JPanel();
		panel_2_1_1_1_21.setLayout(null);
		panel_2_1_1_1_21.setBackground(Color.WHITE);
		panel_2_1_1_1_21.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_21.setBounds(290, 0, 135, 34);
		panel_1_1_21.add(panel_2_1_1_1_21);

		cbToiletingTotalDependence3To11 = new JCheckBox();
		cbToiletingTotalDependence3To11.setFont(new Font("Tahoma", Font.BOLD,
				11));
		cbToiletingTotalDependence3To11.setBackground(Color.WHITE);
		cbToiletingTotalDependence3To11.setText("total dependence");
		cbToiletingTotalDependence3To11.setBounds(10, 0, 125, 16);
		panel_2_1_1_1_21.add(cbToiletingTotalDependence3To11);

		final JLabel label_12_1 = new JLabel();
		label_12_1.setBounds(10, 0, 215, 14);
		mobilityPanel1.add(label_12_1);
		label_12_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_12_1.setText("3-11 Shift(Check all that apply)");

		// mobility3
		final JPanel mobilityPanel11 = new JPanel();
		mobilityPanel11.setBounds(0, 540, 425, 264);
		panel_21.add(mobilityPanel11);
		mobilityPanel11.setLayout(null);
		mobilityPanel11.setBackground(Color.WHITE);

		final JPanel panel_1_1111 = new JPanel();
		panel_1_1111.setLayout(null);
		panel_1_1111.setBounds(0, 17, 425, 18);
		mobilityPanel11.add(panel_1_1111);

		final JPanel panel_2_211 = new JPanel();
		panel_2_211.setLayout(null);
		panel_2_211.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_211.setBackground(Color.WHITE);
		panel_2_211.setBounds(0, 0, 145, 18);
		panel_1_1111.add(panel_2_211);

		cbBadMobilityIndepemdent11To7 = new JCheckBox();
		cbBadMobilityIndepemdent11To7
				.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobilityIndepemdent11To7.setOpaque(false);
		cbBadMobilityIndepemdent11To7.setText("Independent");
		cbBadMobilityIndepemdent11To7.setBounds(10, 0, 125, 17);
		panel_2_211.add(cbBadMobilityIndepemdent11To7);

		final JPanel panel_2_1_211 = new JPanel();
		panel_2_1_211.setLayout(null);
		panel_2_1_211.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_211.setBackground(Color.WHITE);
		panel_2_1_211.setBounds(145, 0, 145, 18);
		panel_1_1111.add(panel_2_1_211);

		cbTransferIndepemdent11To7 = new JCheckBox();
		cbTransferIndepemdent11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferIndepemdent11To7.setOpaque(false);
		cbTransferIndepemdent11To7.setText("Independent");
		cbTransferIndepemdent11To7.setBounds(10, 0, 101, 17);
		panel_2_1_211.add(cbTransferIndepemdent11To7);

		final JPanel panel_2_1_1_111 = new JPanel();
		panel_2_1_1_111.setLayout(null);
		panel_2_1_1_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_111.setBackground(Color.WHITE);
		panel_2_1_1_111.setBounds(290, 0, 135, 18);
		panel_1_1111.add(panel_2_1_1_111);

		cbToiletingIndependent11To7 = new JCheckBox();
		cbToiletingIndependent11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingIndependent11To7.setOpaque(false);
		cbToiletingIndependent11To7.setText("Independent");
		cbToiletingIndependent11To7.setBounds(10, 0, 115, 17);
		panel_2_1_1_111.add(cbToiletingIndependent11To7);

		final JPanel panel_1_1_111 = new JPanel();
		panel_1_1_111.setLayout(null);
		panel_1_1_111.setBounds(0, 34, 425, 54);
		mobilityPanel11.add(panel_1_1_111);

		final JPanel panel_2_2_111 = new JPanel();
		panel_2_2_111.setLayout(null);
		panel_2_2_111.setBackground(Color.WHITE);
		panel_2_2_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_111.setBounds(0, 0, 145, 54);
		panel_1_1_111.add(panel_2_2_111);

		cbBadMobilityLimited11To7 = new JCheckBox();
		cbBadMobilityLimited11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobilityLimited11To7.setBackground(Color.WHITE);
		cbBadMobilityLimited11To7.setText("Limited");
		cbBadMobilityLimited11To7.setBounds(10, 2, 125, 16);
		panel_2_2_111.add(cbBadMobilityLimited11To7);

		final JLabel residentDoesLabel11 = new JLabel();
		residentDoesLabel11.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel11
				.setText("<html><body>Resident does<br> most of care");
		residentDoesLabel11.setBounds(10, 22, 125, 26);
		panel_2_2_111.add(residentDoesLabel11);

		final JPanel panel_2_1_2_111 = new JPanel();
		panel_2_1_2_111.setLayout(null);
		panel_2_1_2_111.setBackground(Color.WHITE);
		panel_2_1_2_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_111.setBounds(145, 0, 145, 54);
		panel_1_1_111.add(panel_2_1_2_111);

		cbTransferLimited11To7 = new JCheckBox();
		cbTransferLimited11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransferLimited11To7.setBackground(Color.WHITE);
		cbTransferLimited11To7.setText("Limited");
		cbTransferLimited11To7.setBounds(10, 2, 125, 16);
		panel_2_1_2_111.add(cbTransferLimited11To7);

		final JLabel residentDoesMostLabel11 = new JLabel();
		residentDoesMostLabel11.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesMostLabel11
				.setText("<html><body>Resident does<br> most of care");
		residentDoesMostLabel11.setBounds(10, 22, 125, 26);
		panel_2_1_2_111.add(residentDoesMostLabel11);

		final JPanel panel_2_1_1_1_111 = new JPanel();
		panel_2_1_1_1_111.setLayout(null);
		panel_2_1_1_1_111.setBackground(Color.WHITE);
		panel_2_1_1_1_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_111.setBounds(290, 0, 135, 54);
		panel_1_1_111.add(panel_2_1_1_1_111);

		cbToiletingLimited11To7 = new JCheckBox();
		cbToiletingLimited11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToiletingLimited11To7.setBackground(Color.WHITE);
		cbToiletingLimited11To7.setText("Limited");
		cbToiletingLimited11To7.setBounds(10, 2, 115, 16);
		panel_2_1_1_1_111.add(cbToiletingLimited11To7);

		final JLabel residentDoesMostLabel_111 = new JLabel();
		residentDoesMostLabel_111.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesMostLabel_111
				.setText("<html><body>Resident does<br> most of care");
		residentDoesMostLabel_111.setBounds(10, 22, 115, 26);
		panel_2_1_1_1_111.add(residentDoesMostLabel_111);

		final JPanel panel_1_1_1_111 = new JPanel();
		panel_1_1_1_111.setLayout(null);
		panel_1_1_1_111.setBounds(0, 87, 425, 72);
		mobilityPanel11.add(panel_1_1_1_111);

		final JPanel panel_2_2_1_111 = new JPanel();
		panel_2_2_1_111.setLayout(null);
		panel_2_2_1_111.setBackground(Color.WHITE);
		panel_2_2_1_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_1_111.setBounds(0, 0, 145, 72);
		panel_1_1_1_111.add(panel_2_2_1_111);

		cbBadMobility1Extensive11To7 = new JCheckBox();
		cbBadMobility1Extensive11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobility1Extensive11To7.setBackground(Color.WHITE);
		cbBadMobility1Extensive11To7.setText("Extensive1");
		cbBadMobility1Extensive11To7.setBounds(10, 0, 125, 16);
		panel_2_2_1_111.add(cbBadMobility1Extensive11To7);

		final JLabel residentDoesLabel_111 = new JLabel();
		residentDoesLabel_111.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_111
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_111.setBounds(10, 22, 125, 40);
		panel_2_2_1_111.add(residentDoesLabel_111);

		final JPanel panel_2_1_2_1_111 = new JPanel();
		panel_2_1_2_1_111.setLayout(null);
		panel_2_1_2_1_111.setBackground(Color.WHITE);
		panel_2_1_2_1_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_1_111.setBounds(145, 0, 145, 72);
		panel_1_1_1_111.add(panel_2_1_2_1_111);

		cbTransfer1Extensive11To7 = new JCheckBox();
		cbTransfer1Extensive11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransfer1Extensive11To7.setBackground(Color.WHITE);
		cbTransfer1Extensive11To7.setText("Extensive1");
		cbTransfer1Extensive11To7.setBounds(10, 0, 125, 16);
		panel_2_1_2_1_111.add(cbTransfer1Extensive11To7);

		final JLabel residentDoesLabel_1_111 = new JLabel();
		residentDoesLabel_1_111.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_111
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_111.setBounds(10, 22, 125, 40);
		panel_2_1_2_1_111.add(residentDoesLabel_1_111);

		final JPanel panel_2_1_1_1_1_111 = new JPanel();
		panel_2_1_1_1_1_111.setLayout(null);
		panel_2_1_1_1_1_111.setBackground(Color.WHITE);
		panel_2_1_1_1_1_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_111.setBounds(290, 0, 135, 72);
		panel_1_1_1_111.add(panel_2_1_1_1_1_111);

		cbToileting1Extensive11To7 = new JCheckBox();
		cbToileting1Extensive11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToileting1Extensive11To7.setBackground(Color.WHITE);
		cbToileting1Extensive11To7.setText("Extensive1");
		cbToileting1Extensive11To7.setBounds(10, 0, 115, 16);
		panel_2_1_1_1_1_111.add(cbToileting1Extensive11To7);

		final JLabel residentDoesLabel_1_211 = new JLabel();
		residentDoesLabel_1_211.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_211
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_211.setBounds(10, 22, 125, 40);
		panel_2_1_1_1_1_111.add(residentDoesLabel_1_211);

		final JPanel panel_1_1_1_1_111 = new JPanel();
		panel_1_1_1_1_111.setLayout(null);
		panel_1_1_1_1_111.setBounds(0, 158, 425, 72);
		mobilityPanel11.add(panel_1_1_1_1_111);

		final JPanel panel_2_2_1_1_111 = new JPanel();
		panel_2_2_1_1_111.setLayout(null);
		panel_2_2_1_1_111.setBackground(Color.WHITE);
		panel_2_2_1_1_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_1_1_111.setBounds(0, 0, 145, 72);
		panel_1_1_1_1_111.add(panel_2_2_1_1_111);

		cbBadMobility2Extensive11To7 = new JCheckBox();
		cbBadMobility2Extensive11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbBadMobility2Extensive11To7.setBackground(Color.WHITE);
		cbBadMobility2Extensive11To7.setText("Extensive 2");
		cbBadMobility2Extensive11To7.setBounds(10, 0, 125, 16);
		panel_2_2_1_1_111.add(cbBadMobility2Extensive11To7);

		final JLabel residentDoesLabel_1_311 = new JLabel();
		residentDoesLabel_1_311.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_311
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_311.setBounds(10, 22, 125, 40);
		panel_2_2_1_1_111.add(residentDoesLabel_1_311);

		final JPanel panel_2_1_2_1_1_111 = new JPanel();
		panel_2_1_2_1_1_111.setLayout(null);
		panel_2_1_2_1_1_111.setBackground(Color.WHITE);
		panel_2_1_2_1_1_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_1_1_111.setBounds(145, 0, 145, 72);
		panel_1_1_1_1_111.add(panel_2_1_2_1_1_111);

		cbTransfer2Extensive11To7 = new JCheckBox();
		cbTransfer2Extensive11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbTransfer2Extensive11To7.setBackground(Color.WHITE);
		cbTransfer2Extensive11To7.setText("Extensive 2");
		cbTransfer2Extensive11To7.setBounds(10, 0, 125, 16);
		panel_2_1_2_1_1_111.add(cbTransfer2Extensive11To7);

		final JLabel residentDoesLabel_1_1_111 = new JLabel();
		residentDoesLabel_1_1_111.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_1_111
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_1_111.setBounds(10, 22, 125, 40);
		panel_2_1_2_1_1_111.add(residentDoesLabel_1_1_111);

		final JPanel panel_2_1_1_1_1_1_111 = new JPanel();
		panel_2_1_1_1_1_1_111.setLayout(null);
		panel_2_1_1_1_1_1_111.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1_111.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_1_1_111.setBounds(290, 0, 135, 72);
		panel_1_1_1_1_111.add(panel_2_1_1_1_1_1_111);

		cbToileting2Extensive11To7 = new JCheckBox();
		cbToileting2Extensive11To7.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbToileting2Extensive11To7.setBackground(Color.WHITE);
		cbToileting2Extensive11To7.setText("Extensive 2");
		cbToileting2Extensive11To7.setBounds(10, 0, 115, 16);
		panel_2_1_1_1_1_1_111.add(cbToileting2Extensive11To7);

		final JLabel residentDoesLabel_1_2_111 = new JLabel();
		residentDoesLabel_1_2_111.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentDoesLabel_1_2_111
				.setText("<html><body>Person(staff <br>does most of<br> the Care");
		residentDoesLabel_1_2_111.setBounds(10, 22, 125, 40);
		panel_2_1_1_1_1_1_111.add(residentDoesLabel_1_2_111);

		final JPanel panel_1_1_211 = new JPanel();
		panel_1_1_211.setLayout(null);
		panel_1_1_211.setBounds(0, 229, 425, 34);
		mobilityPanel11.add(panel_1_1_211);

		final JPanel panel_2_2_211 = new JPanel();
		panel_2_2_211.setLayout(null);
		panel_2_2_211.setBackground(Color.WHITE);
		panel_2_2_211.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_2_211.setBounds(0, 0, 145, 34);
		panel_1_1_211.add(panel_2_2_211);

		cbBadMobilityTotalIndependence11To7 = new JCheckBox();
		cbBadMobilityTotalIndependence11To7.setFont(new Font("Tahoma",
				Font.BOLD, 11));
		cbBadMobilityTotalIndependence11To7.setBackground(Color.WHITE);
		cbBadMobilityTotalIndependence11To7.setText("total dependence");
		cbBadMobilityTotalIndependence11To7.setBounds(10, 0, 125, 16);
		panel_2_2_211.add(cbBadMobilityTotalIndependence11To7);

		final JPanel panel_2_1_2_211 = new JPanel();
		panel_2_1_2_211.setLayout(null);
		panel_2_1_2_211.setBackground(Color.WHITE);
		panel_2_1_2_211.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_2_211.setBounds(145, 0, 145, 34);
		panel_1_1_211.add(panel_2_1_2_211);

		cbTransferTotalIndependence11To7 = new JCheckBox();
		cbTransferTotalIndependence11To7.setFont(new Font("Tahoma", Font.BOLD,
				11));
		cbTransferTotalIndependence11To7.setBackground(Color.WHITE);
		cbTransferTotalIndependence11To7.setText("total dependence");
		cbTransferTotalIndependence11To7.setBounds(10, 0, 125, 16);
		panel_2_1_2_211.add(cbTransferTotalIndependence11To7);

		final JPanel panel_2_1_1_1_211 = new JPanel();
		panel_2_1_1_1_211.setLayout(null);
		panel_2_1_1_1_211.setBackground(Color.WHITE);
		panel_2_1_1_1_211.setBorder(new LineBorder(Color.black, 1, false));
		panel_2_1_1_1_211.setBounds(290, 0, 135, 34);
		panel_1_1_211.add(panel_2_1_1_1_211);

		cbToiletingTotalDependence11To7 = new JCheckBox();
		cbToiletingTotalDependence11To7.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
			}
		});
		cbToiletingTotalDependence11To7.setFont(new Font("Tahoma", Font.BOLD,
				11));
		cbToiletingTotalDependence11To7.setBackground(Color.WHITE);
		cbToiletingTotalDependence11To7.setText("total dependence");
		cbToiletingTotalDependence11To7.setBounds(10, 0, 125, 16);
		panel_2_1_1_1_211.add(cbToiletingTotalDependence11To7);

		final JLabel label_12_11 = new JLabel();
		label_12_11.setBounds(10, 0, 215, 14);
		mobilityPanel11.add(label_12_11);
		label_12_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_12_11.setText("11-7 Shift(Check all that apply)");
	}

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {
		SkilledFlowSheet refSkilledFlowSheet = new SkilledFlowSheet();
		refSkilledFlowSheet.setResidentId(Global.currentResidenceKey);

		refSkilledFlowSheet.setSerial(Global.currentSkilledFlowSheetKey);
		refSkilledFlowSheet.setFormId(Global.currentMsjnKey);
		refSkilledFlowSheet
				.setToiletingIndependent11To7(cbToiletingIndependent11To7
						.isSelected());
		refSkilledFlowSheet.setToiletingLimited11To7(cbToiletingLimited11To7
				.isSelected());
		refSkilledFlowSheet
				.setToileting1Extensive11To7(cbToileting1Extensive11To7
						.isSelected());
		refSkilledFlowSheet
				.setToileting2Extensive11To7(cbToileting2Extensive11To7
						.isSelected());
		refSkilledFlowSheet
				.setToiletingTotalDependence11To7(cbToiletingTotalDependence11To7
						.isSelected());
		refSkilledFlowSheet
				.setTransferTotalIndependence11To7(cbTransferTotalIndependence11To7
						.isSelected());
		refSkilledFlowSheet
				.setBadMobilityTotalIndependence11To7(cbBadMobilityTotalIndependence11To7
						.isSelected());
		refSkilledFlowSheet
				.setBadMobility1Extensive11To7(cbBadMobility1Extensive11To7
						.isSelected());
		refSkilledFlowSheet
				.setBadMobilityLimited11To7(cbBadMobilityLimited11To7
						.isSelected());
		refSkilledFlowSheet
				.setBadMobilityIndepemdent11To7(cbBadMobilityIndepemdent11To7
						.isSelected());
		refSkilledFlowSheet
				.setBadMobility2Extensive11To7(cbBadMobility2Extensive11To7
						.isSelected());
		refSkilledFlowSheet
				.setBadMobilityTotalIndependence3To11(cbBadMobilityTotalIndependence3To11
						.isSelected());
		refSkilledFlowSheet
				.setBadMobility2Extensive3To11(cbBadMobility2Extensive3To11
						.isSelected());
		refSkilledFlowSheet
				.setBadMobility1Extensive3To11(cbBadMobility1Extensive3To11
						.isSelected());
		refSkilledFlowSheet
				.setBadMobilityIndepemdent3To11(cbBadMobilityIndepemdent3To11
						.isSelected());
		refSkilledFlowSheet
				.setTransferIndepemdent3To11(cbTransferIndepemdent3To11
						.isSelected());
		refSkilledFlowSheet.setTransferLimited3To11(cbTransferLimited3To11
				.isSelected());
		refSkilledFlowSheet
				.setTransfer1Extensive3To11(cbTransfer1Extensive3To11
						.isSelected());
		refSkilledFlowSheet
				.setTransfer2Extensive3To11(cbTransfer2Extensive3To11
						.isSelected());
		refSkilledFlowSheet
				.setTransferTotalIndependence3To11(cbTransferTotalIndependence3To11
						.isSelected());
		refSkilledFlowSheet
				.setToiletingTotalDependence3To11(cbToiletingTotalDependence3To11
						.isSelected());
		refSkilledFlowSheet
				.setToileting2Extensive3To11(cbToileting2Extensive3To11
						.isSelected());
		refSkilledFlowSheet.setToiletingLimited3To11(cbToiletingLimited3To11
				.isSelected());
		refSkilledFlowSheet
				.setToileting1Extensive3To11(cbToileting1Extensive3To11
						.isSelected());
		refSkilledFlowSheet
				.setToiletingIndependent3To11(cbToiletingIndependent3To11
						.isSelected());
		refSkilledFlowSheet
				.setToiletingTotalDependence7To3(cbToiletingTotalDependence7To3
						.isSelected());
		refSkilledFlowSheet
				.setToileting2Extensive7To3(cbToileting2Extensive7To3
						.isSelected());
		refSkilledFlowSheet
				.setToileting1Extensive7To3(cbToileting1Extensive7To3
						.isSelected());
		refSkilledFlowSheet.setToiletingLimited7To3(cbToiletingLimited7To3
				.isSelected());
		refSkilledFlowSheet
				.setToiletingIndependent7To3(cbToiletingIndependent7To3
						.isSelected());
		refSkilledFlowSheet
				.setTransferIndepemdent7To3(cbTransferIndepemdent7To3
						.isSelected());
		refSkilledFlowSheet.setTransferLimited7To3(cbTransferLimited7To3
				.isSelected());
		refSkilledFlowSheet.setTransfer1Extensive7To3(cbTransfer1Extensive7To3
				.isSelected());
		refSkilledFlowSheet.setTransfer2Extensive7To3(cbTransfer2Extensive7To3
				.isSelected());
		refSkilledFlowSheet
				.setTransferTotalIndependence7To3(cbTransferTotalIndependence7To3
						.isSelected());
		refSkilledFlowSheet
				.setBadMobility2Extensive7To3(cbBadMobility2Extensive7To3
						.isSelected());
		refSkilledFlowSheet
				.setBadMobility1Extensive7To3(cbBadMobility1Extensive7To3
						.isSelected());
		refSkilledFlowSheet.setBedMobilityLimited7To3(cbBedMobilityLimited7To3
				.isSelected());
		refSkilledFlowSheet
				.setBadMobilityIndepemdent7To3(cbBadMobilityIndepemdent7To3
						.isSelected());
		refSkilledFlowSheet.setO2Saturation7To3(txtO2Saturation7To3.getText());
		refSkilledFlowSheet.setInterventions3(txtInterventions3.getText());
		refSkilledFlowSheet.setInterventions2(txtInterventions2.getText());
		refSkilledFlowSheet.setInterventions1(txtInterventions1.getText());
		refSkilledFlowSheet.setComments(txtComments.getText());
		refSkilledFlowSheet.setPleasureFoods11To7(txtPleasureFoods11To7
				.getText());
		refSkilledFlowSheet.setPleasureFoods3To11(txtPleasureFoods3To11
				.getText());
		refSkilledFlowSheet
				.setPleasureFoods7To3(txtPleasureFoods7To3.getText());
		refSkilledFlowSheet.setGtFeeding7To3(txtGtFeeding7To3.getText());
		refSkilledFlowSheet.setGtFeeding3To11(txtGtFeeding3To11.getText());
		refSkilledFlowSheet.setGtFeeding11To7(txtGtFeeding11To7.getText());
		refSkilledFlowSheet.setTotalDependence11To7(txtTotalDependence11To7
				.getText());
		refSkilledFlowSheet.setTotalDependence3To11(txtTotalDependence3To11
				.getText());
		refSkilledFlowSheet.setTotalDependence7To3(txtTotalDependence7To3
				.getText());
		refSkilledFlowSheet
				.setLimitedAssist7To3(txtLimitedAssist7To3.getText());
		refSkilledFlowSheet.setLimitedAssist3To11(txtLimitedAssist3To11
				.getText());
		refSkilledFlowSheet.setLimitedAssist11To7(txtLimitedAssist11To7
				.getText());
		refSkilledFlowSheet.setIndependent11To7(txtIndependent11To7.getText());
		refSkilledFlowSheet.setIndependent3To11(txtIndependent3To11.getText());
		refSkilledFlowSheet.setIndependent7To3(txtIndependent7To3.getText());
		refSkilledFlowSheet.setSkinIntact3To11(txtSkinIntact3To11.getText());
		refSkilledFlowSheet
				.setSuturesStaplesStrips3To11(txtSuturesStaplesStrips3To11
						.getText());
		refSkilledFlowSheet.setSkinConcern3To11(txtSkinConcern3To11.getText());
		refSkilledFlowSheet.setWound3To11(txtWound3To11.getText());
		refSkilledFlowSheet.setWound7To3(txtWound7To3.getText());
		refSkilledFlowSheet.setSkinConcern7To3(txtSkinConcern7To3.getText());
		refSkilledFlowSheet
				.setSuturesStaplesStrips7To3(txtSuturesStaplesStrips7To3
						.getText());
		refSkilledFlowSheet.setSkinIntact7To3(txtSkinIntact7To3.getText());
		refSkilledFlowSheet.setBreathSoundsClear7To3(txtBreathSoundsClear7To3
				.getText());
		refSkilledFlowSheet
				.setLungsSoundsDiminished7To3(txtLungsSoundsDiminished7To3
						.getText());
		refSkilledFlowSheet
				.setCracklesRalesRhonchi7To3(txtCracklesRalesRhonchi7To3
						.getText());
		refSkilledFlowSheet.setHeartRate7To3(txtHeartRate7To3.getText());
		refSkilledFlowSheet.setAngina7To3(txtAngina7To3.getText());
		refSkilledFlowSheet.setSuctioned7To3(txtSuctioned7To3.getText());
		refSkilledFlowSheet.setTrachCare7To3(txtTrachCare7To3.getText());
		refSkilledFlowSheet.setTrachCare3To11(txtTrachCare3To11.getText());
		refSkilledFlowSheet.setSuctioned3To11(txtSuctioned3To11.getText());
		refSkilledFlowSheet.setAngina3To11(txtAngina3To11.getText());
		refSkilledFlowSheet.setHeartRate3To11(txtHeartRate3To11.getText());
		refSkilledFlowSheet
				.setCracklesRalesRhonchi3To11(txtCracklesRalesRhonchi3To11
						.getText());
		refSkilledFlowSheet
				.setLungsSoundsDiminished3To11(txtLungsSoundsDiminished3To11
						.getText());
		refSkilledFlowSheet.setBreathSoundsClear3To11(txtBreathSoundsClear3To11
				.getText());
		refSkilledFlowSheet.setBreathSoundsClear11To7(txtBreathSoundsClear11To7
				.getText());
		refSkilledFlowSheet
				.setLungsSoundsDiminished11To7(txtLungsSoundsDiminished11To7
						.getText());
		refSkilledFlowSheet
				.setCracklesRalesRhonchi11To7(txtCracklesRalesRhonchi11To7
						.getText());
		refSkilledFlowSheet.setHeartRate11To7(txtHeartRate11To7.getText());
		refSkilledFlowSheet.setAngina11To7(txtAngina11To7.getText());
		refSkilledFlowSheet.setSuctioned11To7(txtSuctioned11To7.getText());
		refSkilledFlowSheet.setTrachCare11To7(txtTrachCare11To7.getText());
		refSkilledFlowSheet
				.setO2Saturation11To7(txtO2Saturation11To7.getText());
		refSkilledFlowSheet.setTemp11To7(txtTemp11To7.getText());
		refSkilledFlowSheet.setRespiration11To7(txtRespiration11To7.getText());
		refSkilledFlowSheet.setPulse11To7(txtPulse11To7.getText());
		refSkilledFlowSheet.setPulse3To11(txtPulse3To11.getText());
		refSkilledFlowSheet.setRespiration3To11(txtRespiration3To11.getText());
		refSkilledFlowSheet.setTemp3To11(txtTemp3To11.getText());
		refSkilledFlowSheet
				.setO2Saturation3To11(txtO2Saturation3To11.getText());
		refSkilledFlowSheet.setRespiration7To3(txtRespiration7To3.getText());
		refSkilledFlowSheet.setTemp7To3(txtTemp7To3.getText());
		refSkilledFlowSheet.setPulse7To3(txtPulse7To3.getText());
		refSkilledFlowSheet.setBp11To7(txtBp11To7.getText());
		refSkilledFlowSheet.setBp3To11(txtBp3To11.getText());
		refSkilledFlowSheet.setBp7To3(txtBp7To3.getText());
		refSkilledFlowSheet.setRoomNo(txtRoomNo.getText());
		refSkilledFlowSheet.setDateOfAssessment(dcDate.getDate());
		refSkilledFlowSheet.setResidentName(txtResidentName.getText());
		refSkilledFlowSheet
				.setBadMobilityLimited3To11(cbBadMobilityLimited3To11
						.isSelected());
		refSkilledFlowSheet
				.setTransferIndepemdent11To7(cbTransferIndepemdent11To7
						.isSelected());
		refSkilledFlowSheet.setTransferLimited11To7(cbTransferLimited11To7
				.isSelected());
		refSkilledFlowSheet
				.setTransfer1Extensive11To7(cbTransfer1Extensive11To7
						.isSelected());
		refSkilledFlowSheet
				.setTransfer2Extensive11To7(cbTransfer2Extensive11To7
						.isSelected());

		try {
			Global.currentSkilledFlowSheetKey = MedrexClientManager
					.insertOrUpdateSkilledFlowSheet(refSkilledFlowSheet);
		} catch (Exception e) {
		}
		return Global.currentSkilledFlowSheetKey;
	}

	public void doUpdate() {
		SkilledFlowSheet refSkilledFlowSheet = null;
		if (Global.currentMsjnKey != 0) {
			try {
				refSkilledFlowSheet = MedrexClientManager.getInstance()
						.getSkilledFlowSheet(Global.currentMsjnKey);
			} catch (Exception e) {
				e.printStackTrace();

			}
			Global.currentSkilledFlowSheetKey = refSkilledFlowSheet.getSerial();
			cbToiletingIndependent11To7.setSelected(refSkilledFlowSheet
					.isToiletingIndependent11To7());
			cbToiletingLimited11To7.setSelected(refSkilledFlowSheet
					.isToiletingLimited11To7());
			cbToileting1Extensive11To7.setSelected(refSkilledFlowSheet
					.isToileting1Extensive11To7());
			cbToileting2Extensive11To7.setSelected(refSkilledFlowSheet
					.isToileting2Extensive11To7());
			cbToiletingTotalDependence11To7.setSelected(refSkilledFlowSheet
					.isToiletingTotalDependence11To7());
			cbTransferTotalIndependence11To7.setSelected(refSkilledFlowSheet
					.isTransferTotalIndependence11To7());
			cbBadMobilityTotalIndependence11To7.setSelected(refSkilledFlowSheet
					.isBadMobilityTotalIndependence11To7());
			cbBadMobility1Extensive11To7.setSelected(refSkilledFlowSheet
					.isBadMobility1Extensive11To7());
			cbBadMobilityLimited11To7.setSelected(refSkilledFlowSheet
					.isBadMobilityLimited11To7());
			cbBadMobilityIndepemdent11To7.setSelected(refSkilledFlowSheet
					.isBadMobilityIndepemdent11To7());
			cbBadMobility2Extensive11To7.setSelected(refSkilledFlowSheet
					.isBadMobility2Extensive11To7());
			cbBadMobilityTotalIndependence3To11.setSelected(refSkilledFlowSheet
					.isBadMobilityTotalIndependence3To11());
			cbBadMobility2Extensive3To11.setSelected(refSkilledFlowSheet
					.isBadMobility2Extensive3To11());
			cbBadMobility1Extensive3To11.setSelected(refSkilledFlowSheet
					.isBadMobility1Extensive3To11());
			cbBadMobilityIndepemdent3To11.setSelected(refSkilledFlowSheet
					.isBadMobilityIndepemdent3To11());
			cbTransferIndepemdent3To11.setSelected(refSkilledFlowSheet
					.isTransferIndepemdent3To11());
			cbTransferLimited3To11.setSelected(refSkilledFlowSheet
					.isTransferLimited3To11());
			cbTransfer1Extensive3To11.setSelected(refSkilledFlowSheet
					.isTransfer1Extensive3To11());
			cbTransfer2Extensive3To11.setSelected(refSkilledFlowSheet
					.isTransfer2Extensive3To11());
			cbTransferTotalIndependence3To11.setSelected(refSkilledFlowSheet
					.isTransferTotalIndependence3To11());
			cbToiletingTotalDependence3To11.setSelected(refSkilledFlowSheet
					.isToiletingTotalDependence3To11());
			cbToileting2Extensive3To11.setSelected(refSkilledFlowSheet
					.isToileting2Extensive3To11());
			cbToiletingLimited3To11.setSelected(refSkilledFlowSheet
					.isToiletingLimited3To11());
			cbToileting1Extensive3To11.setSelected(refSkilledFlowSheet
					.isToileting1Extensive3To11());
			cbToiletingIndependent3To11.setSelected(refSkilledFlowSheet
					.isToiletingIndependent3To11());
			cbToiletingTotalDependence7To3.setSelected(refSkilledFlowSheet
					.isToiletingTotalDependence7To3());
			cbToileting2Extensive7To3.setSelected(refSkilledFlowSheet
					.isToileting2Extensive7To3());
			cbToileting1Extensive7To3.setSelected(refSkilledFlowSheet
					.isToileting1Extensive7To3());
			cbToiletingLimited7To3.setSelected(refSkilledFlowSheet
					.isToiletingLimited7To3());
			cbToiletingIndependent7To3.setSelected(refSkilledFlowSheet
					.isToiletingIndependent7To3());
			cbTransferIndepemdent7To3.setSelected(refSkilledFlowSheet
					.isTransferIndepemdent7To3());
			cbTransferLimited7To3.setSelected(refSkilledFlowSheet
					.isTransferLimited7To3());
			cbTransfer1Extensive7To3.setSelected(refSkilledFlowSheet
					.isTransfer1Extensive7To3());
			cbTransfer2Extensive7To3.setSelected(refSkilledFlowSheet
					.isTransfer2Extensive7To3());
			cbTransferTotalIndependence7To3.setSelected(refSkilledFlowSheet
					.isTransferTotalIndependence7To3());
			cbBadMobility2Extensive7To3.setSelected(refSkilledFlowSheet
					.isBadMobility2Extensive7To3());
			cbBadMobility1Extensive7To3.setSelected(refSkilledFlowSheet
					.isBadMobility1Extensive7To3());
			cbBedMobilityLimited7To3.setSelected(refSkilledFlowSheet
					.isBedMobilityLimited7To3());
			cbBadMobilityIndepemdent7To3.setSelected(refSkilledFlowSheet
					.isBadMobilityIndepemdent7To3());
			txtO2Saturation7To3.setText(refSkilledFlowSheet
					.getO2Saturation7To3());
			txtInterventions3.setText(refSkilledFlowSheet.getInterventions3());
			txtInterventions2.setText(refSkilledFlowSheet.getInterventions2());
			txtInterventions1.setText(refSkilledFlowSheet.getInterventions1());
			txtComments.setText(refSkilledFlowSheet.getComments());
			txtPleasureFoods11To7.setText(refSkilledFlowSheet
					.getPleasureFoods11To7());
			txtPleasureFoods3To11.setText(refSkilledFlowSheet
					.getPleasureFoods3To11());
			txtPleasureFoods7To3.setText(refSkilledFlowSheet
					.getPleasureFoods7To3());
			txtGtFeeding7To3.setText(refSkilledFlowSheet.getGtFeeding7To3());
			txtGtFeeding3To11.setText(refSkilledFlowSheet.getGtFeeding3To11());
			txtGtFeeding11To7.setText(refSkilledFlowSheet.getGtFeeding11To7());
			txtTotalDependence11To7.setText(refSkilledFlowSheet
					.getTotalDependence11To7());
			txtTotalDependence3To11.setText(refSkilledFlowSheet
					.getTotalDependence3To11());
			txtTotalDependence7To3.setText(refSkilledFlowSheet
					.getTotalDependence7To3());
			txtLimitedAssist7To3.setText(refSkilledFlowSheet
					.getLimitedAssist7To3());
			txtLimitedAssist3To11.setText(refSkilledFlowSheet
					.getLimitedAssist3To11());
			txtLimitedAssist11To7.setText(refSkilledFlowSheet
					.getLimitedAssist11To7());
			txtIndependent11To7.setText(refSkilledFlowSheet
					.getIndependent11To7());
			txtIndependent3To11.setText(refSkilledFlowSheet
					.getIndependent3To11());
			txtIndependent7To3
					.setText(refSkilledFlowSheet.getIndependent7To3());
			txtSkinIntact3To11
					.setText(refSkilledFlowSheet.getSkinIntact3To11());
			txtSuturesStaplesStrips3To11.setText(refSkilledFlowSheet
					.getSuturesStaplesStrips3To11());
			txtSkinConcern3To11.setText(refSkilledFlowSheet
					.getSkinConcern3To11());
			txtWound3To11.setText(refSkilledFlowSheet.getWound3To11());
			txtWound7To3.setText(refSkilledFlowSheet.getWound7To3());
			txtSkinConcern7To3
					.setText(refSkilledFlowSheet.getSkinConcern7To3());
			txtSuturesStaplesStrips7To3.setText(refSkilledFlowSheet
					.getSuturesStaplesStrips7To3());
			txtSkinIntact7To3.setText(refSkilledFlowSheet.getSkinIntact7To3());
			txtBreathSoundsClear7To3.setText(refSkilledFlowSheet
					.getBreathSoundsClear7To3());
			txtLungsSoundsDiminished7To3.setText(refSkilledFlowSheet
					.getLungsSoundsDiminished7To3());
			txtCracklesRalesRhonchi7To3.setText(refSkilledFlowSheet
					.getCracklesRalesRhonchi7To3());
			txtHeartRate7To3.setText(refSkilledFlowSheet.getHeartRate7To3());
			txtAngina7To3.setText(refSkilledFlowSheet.getAngina7To3());
			txtSuctioned7To3.setText(refSkilledFlowSheet.getSuctioned7To3());
			txtTrachCare7To3.setText(refSkilledFlowSheet.getTrachCare7To3());
			txtTrachCare3To11.setText(refSkilledFlowSheet.getTrachCare3To11());
			txtSuctioned3To11.setText(refSkilledFlowSheet.getSuctioned3To11());
			txtAngina3To11.setText(refSkilledFlowSheet.getAngina3To11());
			txtHeartRate3To11.setText(refSkilledFlowSheet.getHeartRate3To11());
			txtCracklesRalesRhonchi3To11.setText(refSkilledFlowSheet
					.getCracklesRalesRhonchi3To11());
			txtLungsSoundsDiminished3To11.setText(refSkilledFlowSheet
					.getLungsSoundsDiminished3To11());
			txtBreathSoundsClear3To11.setText(refSkilledFlowSheet
					.getBreathSoundsClear3To11());
			txtBreathSoundsClear11To7.setText(refSkilledFlowSheet
					.getBreathSoundsClear11To7());
			txtLungsSoundsDiminished11To7.setText(refSkilledFlowSheet
					.getLungsSoundsDiminished11To7());
			txtCracklesRalesRhonchi11To7.setText(refSkilledFlowSheet
					.getCracklesRalesRhonchi11To7());
			txtHeartRate11To7.setText(refSkilledFlowSheet.getHeartRate11To7());
			txtAngina11To7.setText(refSkilledFlowSheet.getAngina11To7());
			txtSuctioned11To7.setText(refSkilledFlowSheet.getSuctioned11To7());
			txtTrachCare11To7.setText(refSkilledFlowSheet.getTrachCare11To7());
			txtO2Saturation11To7.setText(refSkilledFlowSheet
					.getO2Saturation11To7());
			txtTemp11To7.setText(refSkilledFlowSheet.getTemp11To7());
			txtRespiration11To7.setText(refSkilledFlowSheet
					.getRespiration11To7());
			txtPulse11To7.setText(refSkilledFlowSheet.getPulse11To7());
			txtPulse3To11.setText(refSkilledFlowSheet.getPulse3To11());
			txtRespiration3To11.setText(refSkilledFlowSheet
					.getRespiration3To11());
			txtTemp3To11.setText(refSkilledFlowSheet.getTemp3To11());
			txtO2Saturation3To11.setText(refSkilledFlowSheet
					.getO2Saturation3To11());
			txtRespiration7To3
					.setText(refSkilledFlowSheet.getRespiration7To3());
			txtTemp7To3.setText(refSkilledFlowSheet.getTemp7To3());
			txtPulse7To3.setText(refSkilledFlowSheet.getPulse7To3());
			txtBp11To7.setText(refSkilledFlowSheet.getBp11To7());
			txtBp3To11.setText(refSkilledFlowSheet.getBp3To11());
			txtBp7To3.setText(refSkilledFlowSheet.getBp7To3());
			txtRoomNo.setText(refSkilledFlowSheet.getRoomNo());
			dcDate.setDate(refSkilledFlowSheet.getDateOfAssessment());
			txtResidentName.setText(refSkilledFlowSheet.getResidentName());
			cbBadMobilityLimited3To11.setSelected(refSkilledFlowSheet
					.isBadMobilityLimited3To11());
			cbTransferIndepemdent11To7.setSelected(refSkilledFlowSheet
					.isTransferIndepemdent11To7());
			cbTransferLimited11To7.setSelected(refSkilledFlowSheet
					.isTransferLimited11To7());
			cbTransfer1Extensive11To7.setSelected(refSkilledFlowSheet
					.isTransfer1Extensive11To7());
			cbTransfer2Extensive11To7.setSelected(refSkilledFlowSheet
					.isTransfer2Extensive11To7());
		}
	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return true;
	}

}
