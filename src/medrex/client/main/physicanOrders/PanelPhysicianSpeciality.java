package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.physicianOrders.PhysicianSpeciality;

import com.toedter.calendar.JDateChooser;

public class PanelPhysicianSpeciality extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4156884630298973851L;

	private static final int ROW_LIMIT = 30;

	/*
	 * private JTextField textField_6; private JTextField textField_5; private
	 * JDateChooser dateChooser_2; private JPanel panel_10; private JPanel
	 * panel_9; private JPanel panel_8; private JPanel panel_7;
	 */
	private PanelPhysicianSpecialityRow rowArr[];

	private JPanel panel_3;

	private JLabel medicationOrdersLabel;

	private JLabel timeLabel;

	private JLabel dateLabel_1;

	private JPanel panel_5;

	private JPanel panel_4;

	private JPanel panel_2;

	private JPanel panel_1;

	private JTextArea txtDiagnosis;

	private JTextField txtPhysician;

	private JLabel physicianLabel;

	private JTextField txtAllergies;

	private JLabel allergiesLabel;

	private JLabel diagnosisLabel;

	private JDateChooser dcDateOfBirth;

	private JLabel dateOfBirthLabel;

	private JTextField txtRoom;

	private JLabel toomLabel;

	private JDateChooser dcFormDate;

	private JLabel dateLabel;

	private JTextField txtLocation;

	private JLabel locationLabel;

	private JTextField txtName;

	private JLabel nameLabel;

	private JLabel t9082416337Label_1;

	private JLabel t9082416337Label;

	private JLabel specialtyLabel;

	private JLabel physiciansOrdersLabel;

	private JLabel specialtyRxLabel;

	private JPanel panel;

	/**
	 * Create the panel
	 */
	public PanelPhysicianSpeciality() {
		super();
		Global.panelPhysicianSpeciality = this;
		setBackground(Color.GRAY);
		setBorder(new LineBorder(Color.black, 1, false));
		setPreferredSize(new Dimension(800, 1000));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 800, 263);
		add(panel);

		specialtyRxLabel = new JLabel();
		specialtyRxLabel.setFont(new Font("", Font.BOLD, 24));
		specialtyRxLabel.setText("SPECIALTY RX");
		specialtyRxLabel.setBounds(313, 10, 174, 32);
		panel.add(specialtyRxLabel);

		physiciansOrdersLabel = new JLabel();
		physiciansOrdersLabel.setFont(new Font("", Font.BOLD, 18));
		physiciansOrdersLabel.setText("PHYSICIAN'S ORDERS");
		physiciansOrdersLabel.setBounds(301, 42, 197, 21);
		panel.add(physiciansOrdersLabel);

		specialtyLabel = new JLabel();
		specialtyLabel.setFont(new Font("", Font.BOLD, 16));
		specialtyLabel.setText("Specialty");
		specialtyLabel.setBounds(10, 10, 70, 21);
		panel.add(specialtyLabel);

		t9082416337Label = new JLabel();
		t9082416337Label.setText("T (908) 241-6337");
		t9082416337Label.setBounds(20, 42, 84, 14);
		panel.add(t9082416337Label);

		t9082416337Label_1 = new JLabel();
		t9082416337Label_1.setText("F (908) 241-6338");
		t9082416337Label_1.setBounds(20, 56, 84, 14);
		panel.add(t9082416337Label_1);

		nameLabel = new JLabel();
		nameLabel.setText("NAME");
		nameLabel.setBounds(20, 96, 28, 14);
		panel.add(nameLabel);

		txtName = new JTextField();
		txtName.setBackground(Color.WHITE);
		txtName.setEditable(false);
		txtName.setBounds(54, 93, 263, 21);
		panel.add(txtName);

		locationLabel = new JLabel();
		locationLabel.setText("LOCATION");
		locationLabel.setBounds(323, 96, 54, 14);
		panel.add(locationLabel);

		txtLocation = new JTextField();
		txtLocation.setBackground(Color.WHITE);
		txtLocation.setEditable(false);
		txtLocation.setBounds(383, 93, 203, 21);
		panel.add(txtLocation);

		dateLabel = new JLabel();
		dateLabel.setText("DATE");
		dateLabel.setBounds(592, 96, 28, 14);
		panel.add(dateLabel);

		dcFormDate = new JDateChooser();
		dcFormDate.setDateFormatString("MM/dd/yyyy");
		dcFormDate.setFocusable(false);
		dcFormDate.setBounds(626, 93, 154, 21);
		panel.add(dcFormDate);

		toomLabel = new JLabel();
		toomLabel.setText("ROOM");
		toomLabel.setBounds(20, 140, 31, 14);
		panel.add(toomLabel);

		txtRoom = new JTextField();
		txtRoom.setBackground(Color.WHITE);
		txtRoom.setEditable(false);
		txtRoom.setBounds(54, 137, 263, 21);
		panel.add(txtRoom);

		dateOfBirthLabel = new JLabel();
		dateOfBirthLabel.setText("DATE OF BIRTH");
		dateOfBirthLabel.setBounds(323, 140, 76, 14);
		panel.add(dateOfBirthLabel);

		dcDateOfBirth = new JDateChooser();
		dcDateOfBirth.setDateFormatString("MM/dd/yyyy");
		dcDateOfBirth.setFocusable(false);
		dcDateOfBirth.setBounds(406, 133, 180, 21);
		panel.add(dcDateOfBirth);

		diagnosisLabel = new JLabel();
		diagnosisLabel.setText("DIAGNOSIS");
		diagnosisLabel.setBounds(592, 140, 56, 14);
		panel.add(diagnosisLabel);

		allergiesLabel = new JLabel();
		allergiesLabel.setText("ALLERGIES");
		allergiesLabel.setBounds(20, 188, 54, 14);
		panel.add(allergiesLabel);

		txtAllergies = new JTextField();
		txtAllergies.setBackground(Color.WHITE);
		txtAllergies.setEditable(false);
		txtAllergies.setBounds(80, 185, 237, 21);
		panel.add(txtAllergies);

		physicianLabel = new JLabel();
		physicianLabel.setText("PHYSICIAN");
		physicianLabel.setBounds(323, 188, 54, 14);
		panel.add(physicianLabel);

		txtPhysician = new JTextField();
		txtPhysician.setBackground(Color.WHITE);
		txtPhysician.setEditable(false);
		txtPhysician.setBounds(383, 185, 203, 21);
		panel.add(txtPhysician);

		txtDiagnosis = new JTextArea();
		txtDiagnosis.setEditable(false);
		txtDiagnosis.setWrapStyleWord(true);
		txtDiagnosis.setLineWrap(true);
		txtDiagnosis.setBounds(592, 160, 188, 44);
		panel.add(txtDiagnosis);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(20, 219, 760, 44);
		panel.add(panel_1);

		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_2.setBackground(new Color(204, 204, 204));
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 75, 44);
		panel_1.add(panel_2);

		dateLabel_1 = new JLabel();
		dateLabel_1.setText("DATE");
		dateLabel_1.setBounds(24, 15, 26, 14);
		panel_2.add(dateLabel_1);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(204, 204, 204));
		panel_4.setBounds(74, 0, 75, 44);
		panel_1.add(panel_4);

		timeLabel = new JLabel();
		timeLabel.setText("TIME");
		timeLabel.setBounds(24, 15, 24, 14);
		panel_4.add(timeLabel);

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.black, 1, false));
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(204, 204, 204));
		panel_5.setBounds(148, 0, 612, 44);
		panel_1.add(panel_5);

		medicationOrdersLabel = new JLabel();
		medicationOrdersLabel.setText("MEDICATION ORDERS");
		medicationOrdersLabel.setBounds(256, 15, 108, 14);
		panel_5.add(medicationOrdersLabel);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 262, 800, 738);
		add(panel_3);

		rowArr = new PanelPhysicianSpecialityRow[ROW_LIMIT];

		for (int i = 0; i < ROW_LIMIT; i++) {
			rowArr[i] = new PanelPhysicianSpecialityRow(i + 1);
			rowArr[i].setBounds(20, i * 22, 760, 22);
			panel_3.add(rowArr[i]);
		}
		fillCombos();

		updateData();

	}

	public void fillCombos() {

	}

	public void updateData() {

		if (Global.currentPhysicianSpecialityKey == 0) {
		} else {
			PhysicianSpeciality ps = null;
			try {
				ps = MedrexClientManager.getInstance().getPhysicianSpeciality(
						Global.currentPhysicianSpecialityKey);

			} catch (Exception e) {

			}
			txtDiagnosis.setText(ps.getDiagnosis());
			txtPhysician.setText(ps.getPhysician());
			txtAllergies.setText(ps.getAllergies());
			dcDateOfBirth.setDate(ps.getDateOfBirth());
			txtRoom.setText(ps.getRoom());
			dcFormDate.setDate(ps.getFormDate());
			txtLocation.setText(ps.getLocation());
			txtName.setText(ps.getName());

		}
		for (int i = 0; i < ROW_LIMIT; i++) {
			rowArr[i].updateData();
		}

	}

	public void doSave() {

		PhysicianSpeciality ps = new PhysicianSpeciality();
		ps.setSerial(Global.currentPhysicianSpecialityKey);
		ps.setResidentId(Global.currentResidenceKey);

		// ps.setDiagnosis(txtDiagnosis.getText());
		// ps.setPhysician(txtPhysician.getText());
		// ps.setAllergies(txtAllergies.getText());
		// ps.setDateOfBirth(dcDateOfBirth.getDate());
		// ps.setRoom(txtRoom.getText());
		// ps.setFormDate(dcFormDate.getDate());
		// ps.setLocation(cmbLocation.getText());
		// ps.setName(txtName.getText());

		try {
			Global.currentPhysicianSpecialityKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianSpeciality(ps);
		} catch (Exception e) {

		}

		for (int i = 0; i < ROW_LIMIT; i++) {
			rowArr[i].doSave();
		}
	}

}
