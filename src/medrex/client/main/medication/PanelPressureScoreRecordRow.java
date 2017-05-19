package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.medication.PressureSoreRecordFormRow;

import com.toedter.calendar.JDateChooser;

public class PanelPressureScoreRecordRow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4721516471286438405L;
	private JTextField txtLocation;
	private JDateChooser dateChooser;
	private JCheckBox cbInit;
	private JPanel panel_11;
	private JTextField txtComments;
	private JPanel panel_10;
	private JComboBox cmbTunneling;
	private JPanel panel_9;
	private JComboBox cmbDrain;
	private JPanel panel_8;
	private JComboBox cmbOdor;
	private JPanel panel_7;
	private JComboBox cmbColor;
	private JPanel panel_6;
	private JLabel cmXLabel_1;
	private JTextField txtDepth;
	private JLabel cmXLabel;
	private JTextField txtDiamenterCMX;
	private JPanel panel_5;
	private JComboBox cmbStage;
	private JPanel panel_4;
	private JPanel panel_3;
	private JPanel panel;
	/**
	 * Create the panel
	 */

	int serial;
	int key;

	public PanelPressureScoreRecordRow(int num) {
		super();

		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1058, 30));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 1058, 30);
		add(panel);

		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(100, 0, 41, 30);
		panel.add(panel_3);

		txtLocation = new JTextField();
		txtLocation.setBounds(5, 5, 30, 20);
		panel_3.add(txtLocation);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(140, 0, 54, 30);
		panel.add(panel_4);

		cmbStage = new JComboBox();
		cmbStage.setBounds(3, 2, 48, 26);
		panel_4.add(cmbStage);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(193, 0, 182, 30);
		panel.add(panel_5);

		txtDiamenterCMX = new JTextField();
		txtDiamenterCMX.setBounds(5, 2, 50, 26);
		panel_5.add(txtDiamenterCMX);

		cmXLabel = new JLabel();
		cmXLabel.setText("CM X");
		cmXLabel.setBounds(60, 7, 35, 17);
		panel_5.add(cmXLabel);

		txtDepth = new JTextField();
		txtDepth.setBounds(100, 2, 50, 26);
		panel_5.add(txtDepth);

		cmXLabel_1 = new JLabel();
		cmXLabel_1.setText("CM ");
		cmXLabel_1.setBounds(155, 7, 23, 17);
		panel_5.add(cmXLabel_1);

		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.black, 1, false));
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(374, 0, 57, 30);
		panel.add(panel_6);

		cmbColor = new JComboBox();
		cmbColor.setBounds(3, 2, 52, 26);
		panel_6.add(cmbColor);

		panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(430, 0, 48, 30);
		panel.add(panel_7);

		cmbOdor = new JComboBox();
		cmbOdor.setBounds(3, 2, 42, 26);
		panel_7.add(cmbOdor);

		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.black, 1, false));
		panel_8.setLayout(null);
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(477, 0, 54, 30);
		panel.add(panel_8);

		cmbDrain = new JComboBox();
		cmbDrain.setBounds(3, 2, 48, 26);
		panel_8.add(cmbDrain);

		panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(530, 0, 102, 30);
		panel.add(panel_9);

		cmbTunneling = new JComboBox();
		cmbTunneling.setBounds(4, 2, 96, 26);
		panel_9.add(cmbTunneling);

		panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(631, 0, 392, 30);
		panel.add(panel_10);

		txtComments = new JTextField();
		txtComments.setBounds(4, 2, 386, 26);
		panel_10.add(txtComments);

		panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(1022, 0, 37, 30);
		panel.add(panel_11);

		cbInit = new JCheckBox();
		cbInit.setBackground(Color.WHITE);
		cbInit.setBounds(12, 7, 15, 16);
		panel_11.add(cbInit);

		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("MM/dd/yyyy");
		dateChooser.setBounds(5, 5, 89, 20);
		panel.add(dateChooser);

		serial = num;
		fillCombos();

		updateData();
	}

	public void fillCombos() {
		cmbStage.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cmbColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "B", "W", "G", "R", "NC", "O", "P", "N", "Y" }));

		cmbOdor.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "A", "SW", "FC", "O", "FL", "N", "SO" }));
		cmbDrain.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "M", "TK", "TH", "RB", "RD" }));

		cmbTunneling.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "Y", "N" }));

	}

	public void updateData() {
		if (Global.currentPressureSoreRecordFormKey == 0) {
			key = 0;
			dateChooser.setDate(null);
			txtLocation.setText("");
			cmbStage.setSelectedItem("");
			txtDepth.setText("");
			cmbColor.setSelectedItem("");
			cmbOdor.setSelectedItem("");
			cmbDrain.setSelectedItem("");
			cmbTunneling.setSelectedItem("");
			txtComments.setText("");
			cbInit.setSelected(false);

		} else {
			PressureSoreRecordFormRow psrfr = null;

			dateChooser.setDate(null);
			txtLocation.setText("");
			cmbStage.setSelectedItem("");
			txtDepth.setText("");
			cmbColor.setSelectedItem("");
			cmbOdor.setSelectedItem("");
			cmbDrain.setSelectedItem("");
			cmbTunneling.setSelectedItem("");
			txtComments.setText("");
			cbInit.setSelected(false);

			try {
				psrfr = MedrexClientManager
						.getInstance()
						.getPressureSoreRecordFormRow(
								Global.currentPressureSoreRecordFormKey, serial);
			} catch (Exception e) {

			}

			key = psrfr.getSerial();

			dateChooser.setDate(psrfr.getDateRecord());
			txtLocation.setText(psrfr.getLocation());
			cmbStage.setSelectedItem(psrfr.getStage());
			txtDepth.setText(psrfr.getDepth());
			cmbColor.setSelectedItem(psrfr.getColor());
			cmbOdor.setSelectedItem(psrfr);
			cmbDrain.setSelectedItem(psrfr.getDrain());
			cmbTunneling.setSelectedItem(psrfr.getTunneling());
			txtComments.setText(psrfr.getComments());
			cbInit.setSelected(psrfr.isInitials());
		}

	}

	public void doSave() {

		PressureSoreRecordFormRow psrfr = new PressureSoreRecordFormRow();

		psrfr.setSerial(key);
		psrfr
				.setPressureSoreRecordFormSerial(Global.currentPressureSoreRecordFormKey);
		psrfr.setPressureSoreRecordFormRowSerial(serial);
		psrfr.setDateRecord(dateChooser.getDate());
		psrfr.setLocation(txtLocation.getText());
		psrfr.setStage((String) cmbStage.getSelectedItem());
		psrfr.setDiameter(txtDiamenterCMX.getText());
		psrfr.setDepth(txtDepth.getText());
		psrfr.setColor((String) cmbColor.getSelectedItem());
		psrfr.setOdor((String) cmbOdor.getSelectedItem());
		psrfr.setDrain((String) cmbDrain.getSelectedItem());
		psrfr.setTunneling((String) cmbTunneling.getSelectedItem());
		psrfr.setComments(txtComments.getText());
		psrfr.setInitials(cbInit.isSelected());

		try {
			/* Global.currentPressureSoreRecordFormKey = */MedrexClientManager
					.getInstance().insertOrUpdatePressureSoreRecordFormRow(
							psrfr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
