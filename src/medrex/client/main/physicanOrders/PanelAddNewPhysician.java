package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.physicianOrders.PhysicianOrders;
import medrex.commons.vo.physicianOrders.Prescription;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.toedter.calendar.JDateChooser;

public class PanelAddNewPhysician extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6849981384411507860L;
	private Date creationDate;
	private JTextArea txtNursesNotes;
	private JDateChooser dcDCdate;
	private JDateChooser dcOrderDate;
	private JTextField txtPRN;
	private JTextField txtAA;
	private JComboBox cmbFrequency;
	private JComboBox cmbRA;
	private JTextField txtDose;
	private JTextField txtMedication;
	private JTextField txtDiagnosis;
	private JLabel lblRoom;
	private JLabel lblSex;
	private JLabel lblPatientName;
	private PanelImage panel_6;
	private JPanel panelPrescriptionPrintable;
	private JPanel panel_5_1;
	private static final Color BACKGROUND = new Color(231, 234, 234);
	private static final Color FOREGROUND = new Color(0, 69, 97);
	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);

	public PanelAddNewPhysician() {
		super();
		Global.currentPhysicianOrderForm = "Prescription";
		Global.panelAddNewPhysician = this;
		setLayout(null);
		setSize(961, 708);
		setPreferredSize(getSize());
		this.setLinearGradient(ColorConstants.GradientDark,
				ColorConstants.GradientBright, Direction.LEFT_TO_RIGHT);
		setCurvedView(false);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBounds(426, 140, 505, 557);
		panelPrescriptionPrintable = new PanelPrescriptionPrintable();
		panelPrescriptionPrintable.setBounds(3, 2, 498, 559);
		panel_9.add(panelPrescriptionPrintable);
		add(panel_9);

		panel_5_1 = new JPanel();
		panel_5_1.setBounds(5, 0, 494, 557);
		// panel_9.add(panel_5_1);
		panel_5_1.setBackground(Color.WHITE);
		panel_5_1.setOpaque(true);
		panel_5_1.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2, true));
		panel_5_1.setLayout(null);
		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 943, 108);
		add(panel);

		final JxButton saveButton = new JxButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSave();
				Global.framePhysicianOrdersAddNew.dispose();
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(604, 54, 75, 27);
		saveButton.setBorderPainted(false);
		saveButton.setArc(0.6f);
		saveButton.setBorder(BORDER);
		saveButton.setBackground(BACKGROUND);
		saveButton.setForeground(FOREGROUND);
		saveButton.setRolloverEnabled(true);
		saveButton.setGlassyPainted(true);
		panel.add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.framePhysicianOrdersAddNew.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(698, 54, 75, 27);
		cancelButton.setBorderPainted(false);
		cancelButton.setArc(0.6f);
		cancelButton.setBorder(BORDER);
		cancelButton.setBackground(BACKGROUND);
		cancelButton.setForeground(FOREGROUND);
		cancelButton.setRolloverEnabled(true);
		cancelButton.setGlassyPainted(true);
		panel.add(cancelButton);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setOpaque(false);
		panel_1.setBounds(10, 10, 263, 88);
		panel.add(panel_1);

		final JLabel label_3 = new JLabel(new ImageIcon("img/medrexLogo.png"));
		label_3.setBounds(0, 0, 263, 88);
		label_3.setBackground(new Color(232, 240, 245));
		panel_1.add(label_3);
		label_3.setText("");

		final JxPanel panel_4 = new JxPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 108, 931, 30);
		panel_4.setLinearGradient(ColorConstants.GradientDark,
				ColorConstants.GradientBright, Direction.RIGHT_TO_LEFT);
		panel_4.setCurvedView(false);
		add(panel_4);

		final JLabel addNewPhysicianLabel = new JLabel();
		addNewPhysicianLabel.setText("Add New Physician Record");
		addNewPhysicianLabel.setForeground(ColorConstants.DEF_COLOR);
		addNewPhysicianLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		addNewPhysicianLabel.setBounds(50, 5, 312, 20);
		panel_4.add(addNewPhysicianLabel);

		final JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setLayout(null);
		panel_5.setBounds(10, 140, 410, 557);
		// panel_5.setLinearGradient(ColorConstants.GradientDark,
		// ColorConstants.GradientBright, Direction.LEFT_TO_RIGHT);
		// panel_5.setCurvedView(false);

		add(panel_5);

		panel_6 = new PanelImage();
		panel_6.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		panel_6.setCurvedView(true);
		panel_6.setArc(1f);
		panel_6.setBounds(48, 74, 107, 108);
		panel_5.add(panel_6);

		lblPatientName = new JLabel();
		lblPatientName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPatientName.setForeground(Color.WHITE);
		lblPatientName.setText("Patient Name");
		lblPatientName.setBounds(10, 30, 172, 14);
		panel_5.add(lblPatientName);

		lblSex = new JLabel();
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSex.setForeground(Color.WHITE);
		lblSex.setText("Sex");
		lblSex.setBounds(10, 50, 75, 14);
		panel_5.add(lblSex);

		lblRoom = new JLabel();
		lblRoom.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRoom.setForeground(Color.WHITE);
		lblRoom.setText("Room");
		lblRoom.setBounds(104, 50, 78, 14);
		panel_5.add(lblRoom);

		final JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_7.setLayout(null);
		panel_7.setBounds(10, 210, 384, 28);
		panel_5.add(panel_7);

		final JLabel diagnosisLabel = new JLabel();
		diagnosisLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		diagnosisLabel.setForeground(Color.WHITE);
		diagnosisLabel.setText("Diagnosis");
		diagnosisLabel.setBounds(38, 5, 102, 25);
		panel_7.add(diagnosisLabel);

		txtDiagnosis = new JTextField();
		// textField.setArc(0.4f);
		txtDiagnosis.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtDiagnosis.setBounds(153, 0, 225, 25);
		txtDiagnosis.setBackground(ColorConstants.GradientTextField);
		panel_7.add(txtDiagnosis);

		final JPanel panel_7_1 = new JPanel();
		panel_7_1.setOpaque(false);
		panel_7_1.setLayout(null);
		panel_7_1.setBounds(10, 244, 384, 28);
		panel_5.add(panel_7_1);

		final JLabel medicationLabel = new JLabel();
		medicationLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		medicationLabel.setForeground(Color.WHITE);
		medicationLabel.setText("Medication");
		medicationLabel.setBounds(38, 0, 102, 26);
		panel_7_1.add(medicationLabel);

		txtMedication = new JTextField();
		// textField_1.setArc(0.4f);
		txtMedication.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtMedication.setBounds(153, 0, 225, 25);
		txtMedication.setBackground(ColorConstants.GradientTextField);
		panel_7_1.add(txtMedication);

		final JPanel panel_7_1_1 = new JPanel();
		panel_7_1_1.setOpaque(false);
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBounds(10, 278, 384, 28);
		panel_5.add(panel_7_1_1);

		final JLabel doseLabel = new JLabel();
		doseLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		doseLabel.setForeground(Color.WHITE);
		doseLabel.setText("Dose");
		doseLabel.setBounds(38, 5, 72, 21);
		panel_7_1_1.add(doseLabel);

		txtDose = new JTextField();
		// textField_1_1.setArc(0.4f);
		txtDose.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtDose.setBounds(153, 0, 225, 25);
		txtDose.setBackground(ColorConstants.GradientTextField);
		panel_7_1_1.add(txtDose);

		final JPanel panel_7_1_1_1 = new JPanel();
		panel_7_1_1_1.setOpaque(false);
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBounds(10, 312, 384, 28);
		panel_5.add(panel_7_1_1_1);

		final JLabel raLabel = new JLabel();
		raLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		raLabel.setForeground(Color.WHITE);
		raLabel.setText("RA");
		raLabel.setBounds(38, 5, 60, 21);
		panel_7_1_1_1.add(raLabel);

		cmbRA = new JComboBox();
		cmbRA.setModel(new DefaultComboBoxModel(new String[] { "",
				"1=by mouth (PO)", "2=sub lingual (SL)", "3=intramuscular(IM)",
				"4=intravenous(IV)", "5=subcutaneous(SQ)", "6=rectal(R)",
				"7=topical", "8=inhalation", "9=enteral Tube", "10=other" }));
		cmbRA.setBorder(new EmptyBorder(0, 0, 0, 0));
		cmbRA.setBackground(ColorConstants.GradientTextField);
		cmbRA.setBounds(153, 0, 225, 25);
		// comboBox.setArc(0.4f);
		panel_7_1_1_1.add(cmbRA);

		final JPanel panel_7_1_1_3 = new JPanel();
		panel_7_1_1_3.setOpaque(false);
		panel_7_1_1_3.setLayout(null);
		panel_7_1_1_3.setBounds(10, 380, 384, 28);
		panel_5.add(panel_7_1_1_3);

		final JLabel aaLabel = new JLabel();
		aaLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		aaLabel.setForeground(Color.WHITE);
		aaLabel.setText("AA");
		aaLabel.setBounds(38, 5, 54, 14);
		panel_7_1_1_3.add(aaLabel);

		txtAA = new JTextField();
		// textField_1_2.setArc(0.4f);
		txtAA.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtAA.setBounds(153, 0, 225, 25);
		txtAA.setBackground(ColorConstants.GradientTextField);
		panel_7_1_1_3.add(txtAA);

		final JPanel panel_7_1_1_4 = new JPanel();
		panel_7_1_1_4.setOpaque(false);
		panel_7_1_1_4.setLayout(null);
		panel_7_1_1_4.setBounds(10, 414, 384, 28);
		panel_5.add(panel_7_1_1_4);

		final JLabel prnnLabel = new JLabel();
		prnnLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		prnnLabel.setForeground(Color.WHITE);
		prnnLabel.setText("PRN-n");
		prnnLabel.setBounds(38, 10, 72, 14);
		panel_7_1_1_4.add(prnnLabel);

		txtPRN = new JFormattedTextField(FieldFormatter.MAX2);
		txtPRN.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtPRN.setBounds(153, 0, 225, 23);
		txtPRN.setBackground(ColorConstants.GradientTextField);
		panel_7_1_1_4.add(txtPRN);

		final JPanel panel_7_1_1_5 = new JPanel();
		panel_7_1_1_5.setBounds(0, 30, 384, 36);
		panel_7_1_1_4.add(panel_7_1_1_5);
		panel_7_1_1_5.setOpaque(false);
		panel_7_1_1_5.setLayout(null);

		final JLabel orderDateLabel = new JLabel();
		orderDateLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		orderDateLabel.setForeground(Color.WHITE);
		orderDateLabel.setText("Order Date");
		orderDateLabel.setBounds(34, 5, 99, 16);
		panel_7_1_1_5.add(orderDateLabel);

		final JDateChooser textField_1_2_1 = new JDateChooser();
		textField_1_2_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField_1_2_1.setBounds(153, 0, 225, 25);
		textField_1_2_1.getComponent(0).setBackground(
				ColorConstants.GradientTextField);
		textField_1_2_1.getComponent(1).setBackground(
				ColorConstants.GradientTextField);
		panel_7_1_1_5.add(textField_1_2_1);

		final JPanel panel_7_1_1_6 = new JPanel();
		panel_7_1_1_6.setOpaque(false);
		panel_7_1_1_6.setLayout(null);
		panel_7_1_1_6.setBounds(10, 482, 384, 28);
		panel_5.add(panel_7_1_1_6);

		final JLabel dcDateLabel = new JLabel();
		dcDateLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		dcDateLabel.setForeground(Color.WHITE);
		dcDateLabel.setText("DC Date");
		dcDateLabel.setBounds(38, 5, 99, 16);
		panel_7_1_1_6.add(dcDateLabel);

		dcDCdate = new JDateChooser();
		dcDCdate.setBorder(new EmptyBorder(0, 0, 0, 0));
		dcDCdate.setBounds(153, 0, 225, 25);

		dcDCdate.getComponent(0)
				.setBackground(ColorConstants.GradientTextField);
		dcDCdate.getComponent(1)
				.setBackground(ColorConstants.GradientTextField);
		panel_7_1_1_6.add(dcDCdate);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(188, 30, 206, 166);
		panel_5.add(panel_8);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(10, 38, 186, 118);
		panel_8.add(scrollPane);

		txtNursesNotes = new JTextArea();
		scrollPane.setViewportView(txtNursesNotes);

		final JLabel nameLabel_1 = new JLabel();
		nameLabel_1.setText("Nurses Notes:");
		nameLabel_1.setForeground(ColorConstants.DEF_COLOR);
		nameLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		nameLabel_1.setBounds(10, 10, 114, 14);
		panel_8.add(nameLabel_1);

		final JPanel panel_7_1_1_2 = new JPanel();
		panel_7_1_1_2.setBounds(10, 346, 384, 28);
		panel_5.add(panel_7_1_1_2);
		panel_7_1_1_2.setOpaque(false);
		panel_7_1_1_2.setLayout(null);

		final JLabel frequencyLabel = new JLabel();
		frequencyLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		frequencyLabel.setForeground(Color.WHITE);
		frequencyLabel.setText("Frequency");
		frequencyLabel.setBounds(38, 7, 99, 14);
		panel_7_1_1_2.add(frequencyLabel);

		cmbFrequency = new JComboBox();
		cmbFrequency.setModel(new DefaultComboBoxModel(new String[] { "", "1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cmbFrequency.setBorder(new EmptyBorder(0, 0, 0, 0));
		cmbFrequency.setBackground(ColorConstants.GradientTextField);
		cmbFrequency.setBounds(153, 0, 225, 25);
		panel_7_1_1_2.add(cmbFrequency);

		final JPanel panel_7_1_1_6_1 = new JPanel();
		panel_7_1_1_6_1.setOpaque(false);
		panel_7_1_1_6_1.setLayout(null);
		panel_7_1_1_6_1.setBounds(10, 448, 384, 28);
		panel_5.add(panel_7_1_1_6_1);

		final JLabel dcDateLabel_1 = new JLabel();
		dcDateLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		dcDateLabel_1.setForeground(Color.WHITE);
		dcDateLabel_1.setText("Order Date");
		dcDateLabel_1.setBounds(38, 5, 99, 16);
		panel_7_1_1_6_1.add(dcDateLabel_1);

		dcOrderDate = new JDateChooser();
		dcOrderDate.setBorder(new EmptyBorder(0, 0, 0, 0));
		dcOrderDate.setBounds(153, 0, 225, 25);
		dcOrderDate.getComponent(0).setBackground(
				ColorConstants.GradientTextField);
		dcOrderDate.getComponent(1).setBackground(
				ColorConstants.GradientTextField);
		panel_7_1_1_6_1.add(dcOrderDate);

		JSeparator js1 = null;
		js1 = new JSeparator(SwingConstants.HORIZONTAL);
		js1.setBounds(50, 132, 400, 14);
		js1.setForeground(ColorConstants.DEF_COLOR);
		panel_5_1.add(js1);

		final JLabel deaGbLabel = new JLabel();
		deaGbLabel.setText("DEA #   GB098890");
		deaGbLabel.setForeground(ColorConstants.DEF_COLOR);
		deaGbLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		deaGbLabel.setBounds(10, 10, 118, 16);
		panel_5_1.add(deaGbLabel);

		final JLabel licLabel = new JLabel();
		licLabel.setForeground(ColorConstants.DEF_COLOR);
		licLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		licLabel.setText("LIC #ME0098909");
		licLabel.setBounds(371, 10, 118, 16);
		panel_5_1.add(licLabel);

		final JLabel doctorsNameLabel = new JLabel();
		doctorsNameLabel.setText("DOCTOR'S NAME , M.D");
		doctorsNameLabel.setBounds(145, 32, 197, 14);
		doctorsNameLabel.setForeground(ColorConstants.DEF_COLOR);
		doctorsNameLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_5_1.add(doctorsNameLabel);

		final JLabel nameOfOrganizationLabel = new JLabel();
		nameOfOrganizationLabel.setText("NAME OF ORGANIZATION");
		nameOfOrganizationLabel.setBounds(145, 52, 197, 14);
		nameOfOrganizationLabel.setForeground(ColorConstants.DEF_COLOR);
		nameOfOrganizationLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

		panel_5_1.add(nameOfOrganizationLabel);

		final JLabel address1Label = new JLabel();
		address1Label.setText("Address1");
		address1Label.setForeground(ColorConstants.DEF_COLOR);
		address1Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		address1Label.setBounds(198, 72, 88, 14);
		panel_5_1.add(address1Label);

		final JLabel address2Label = new JLabel();
		address2Label.setText("Address2");
		address2Label.setForeground(ColorConstants.DEF_COLOR);
		address2Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		address2Label.setBounds(198, 92, 88, 14);
		panel_5_1.add(address2Label);

		final JLabel telLabel = new JLabel();
		telLabel.setText("Tel:(222) 345 3456            Fax:(222)234 9765");
		telLabel.setBounds(100, 112, 297, 14);
		telLabel.setForeground(ColorConstants.DEF_COLOR);
		telLabel.setFont(new Font("Tahoma", Font.BOLD, 12));

		panel_5_1.add(telLabel);

		final JLabel nameLabel = new JLabel();
		nameLabel.setText("Name");
		nameLabel.setBounds(20, 152, 54, 14);
		nameLabel.setForeground(ColorConstants.DEF_COLOR);
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5_1.add(nameLabel);

		final JLabel ageLabel = new JLabel();
		ageLabel.setText("Age");
		ageLabel.setForeground(ColorConstants.DEF_COLOR);
		ageLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		ageLabel.setBounds(300, 152, 37, 14);
		panel_5_1.add(ageLabel);

		final JLabel addressLabel = new JLabel();
		addressLabel.setText("Address");
		addressLabel.setBounds(20, 172, 54, 14);
		addressLabel.setForeground(ColorConstants.DEF_COLOR);
		addressLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5_1.add(addressLabel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setText("Date");
		dateLabel.setBounds(300, 172, 37, 14);
		dateLabel.setForeground(ColorConstants.DEF_COLOR);
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5_1.add(dateLabel);

		final JTextField txtAge = new JTextField();
		txtAge.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		txtAge.setBounds(360, 149, 110, 18);
		panel_5_1.add(txtAge);

		final JTextField txtAddress = new JTextField();
		txtAddress
				.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		txtAddress.setBounds(100, 174, 186, 18);
		panel_5_1.add(txtAddress);

		final JTextField txtName = new JTextField();
		txtName.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		txtName.setBounds(100, 149, 186, 18);
		panel_5_1.add(txtName);

		final JDateChooser dcDate = new JDateChooser();
		dcDate.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		dcDate.setBounds(360, 172, 110, 18);
		panel_5_1.add(dcDate);

		final JLabel addressLabel_1 = new JLabel();
		addressLabel_1.setText("Doctor's Notes");
		addressLabel_1.setBounds(186, 245, 115, 14);
		addressLabel_1.setForeground(ColorConstants.DEF_COLOR);
		addressLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5_1.add(addressLabel_1);

		final JxPanel panel_8_1 = new JxPanel();
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(33, 276, 430, 188);
		panel_5_1.add(panel_8_1);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_1.setBounds(10, 10, 406, 168);
		panel_8_1.add(scrollPane_1);

		final JTextArea txtDoctorsNotes = new JTextArea();
		scrollPane_1.setViewportView(txtDoctorsNotes);

		final JxComboBox cmbSignature = new JxComboBox();
		cmbSignature.setBorder(new CompoundBorder(null, null));
		cmbSignature.setBackground(Color.WHITE);
		cmbSignature.setOpaque(false);
		cmbSignature.setArc(0.4f);
		cmbSignature.setBounds(309, 482, 161, 21);
		panel_5_1.add(cmbSignature);

		final JLabel signatureLabel = new JLabel();
		signatureLabel.setText("Signature");
		signatureLabel.setForeground(ColorConstants.DEF_COLOR);
		signatureLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		signatureLabel.setBounds(232, 485, 69, 14);
		panel_5_1.add(signatureLabel);

		final JCheckBox cbLabel = new JCheckBox();
		cbLabel.setOpaque(false);
		cbLabel.setText("Label");
		cbLabel.setForeground(ColorConstants.DEF_COLOR);
		cbLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbLabel.setBounds(42, 483, 94, 18);
		panel_5_1.add(cbLabel);

		final JLabel refill01Label = new JLabel();
		refill01Label.setText("Refill 0 1 2 3 4 5 PRN");
		refill01Label.setBounds(42, 515, 161, 14);
		refill01Label.setForeground(ColorConstants.DEF_COLOR);
		refill01Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5_1.add(refill01Label);

		final JSeparator js1_1 = new JSeparator();
		js1_1.setBounds(50, 135, 400, 16);
		js1_1.setForeground(ColorConstants.DEF_COLOR);
		panel_5_1.add(js1_1);

		final JxButton printButton = new JxButton();
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				JFrame fPrint = new JFrame();
				fPrint.setSize(600, 600);
				fPrint.setPreferredSize(fPrint.getSize());
				SwingUtils.center(fPrint);
				fPrint.setVisible(false);
				Book book = new Book();
				PrinterJob printJob = PrinterJob.getPrinterJob();
				PageFormat pageFormat = new PageFormat();
				Paper paper = new Paper();
				paper.setSize(594.992125984252, 841.8897637795276);
				paper.setImageableArea(50.0, 50.0, 522.99212598425197,
						769.8897637795276);
				pageFormat.setPaper(paper);
				pageFormat.setOrientation(PageFormat.PORTRAIT);
				printJob.defaultPage(pageFormat);
				printJob.setCopies(1);
				printJob.setPageable(book);
				JPanel pan = new PanelPrescriptionPrintable();
				final Component comp = pan;
				((JComponent) comp).updateUI();
				comp.setSize(comp.getPreferredSize());
				fPrint.getContentPane().add(comp);
				fPrint.setVisible(true);
				fPrint.repaint();
				fPrint.setVisible(true);
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setViewportView(comp);
				comp.setSize(comp.getPreferredSize());
				final ComponentPrintable cp = new ComponentPrintable(comp);
				book.append(cp, pageFormat);
				try {
					printJob.print();
				} catch (Exception PrintException) {
					PrintException.printStackTrace();
				}
				fPrint.dispose();
			}
		});
		printButton.setText("Print");
		printButton.setBounds(790, 54, 75, 27);
		printButton.setBorderPainted(false);
		printButton.setArc(0.6f);
		printButton.setBorder(BORDER);
		printButton.setBackground(BACKGROUND);
		printButton.setForeground(FOREGROUND);
		printButton.setRolloverEnabled(true);
		printButton.setGlassyPainted(true);
		panel.add(printButton);

	}

	public void updateData() {
		ResidentMain rm = new ResidentMain();
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		lblPatientName.setText(rm.getUserPass() + ", " + rm.getUserName());
		lblSex.setText("" + rm.getSex());
		/* TODO: Migrating to room history */
		// lblRoom.setText(rm.getRoom() + "");
		if (Global.currentPrescriptionKey != 0) {
			Prescription prescription = null;
			try {
				prescription = MedrexClientManager.getInstance()
						.getPrescription(Global.currentPrescriptionKey);

				PhysicianOrders ls = null;
				ls = MedrexClientManager.getInstance().getPhysicianOrder(
						Global.currentPhysisianOrdersKey);
				creationDate = ls.getDateCreated();
			} catch (Exception e) {
				e.printStackTrace();
			}
			txtDiagnosis.setText(prescription.getDiagnosis());
			txtDose.setText(prescription.getDose());
			txtMedication.setText(prescription.getMedication());
			txtAA.setText(prescription.getAa());
			cmbFrequency.setSelectedItem(prescription.getFrequency());
			cmbRA.setSelectedItem(prescription.getRa());
			txtPRN.setText(prescription.getPrn() + "");
			dcDCdate.setDate(prescription.getDcDate());
			dcOrderDate.setDate(prescription.getOrderDate());
			txtNursesNotes.setText(prescription.getNotes());
		} else {
			txtDiagnosis.setText("");
			txtDose.setText("");
			txtMedication.setText("");
			txtAA.setText("");
			cmbFrequency.setSelectedItem("");
			cmbRA.setSelectedItem("");
			txtPRN.setText("");
			dcDCdate.setDate(null);
			dcOrderDate.setDate(null);
			txtNursesNotes.setText("");
		}
	}

	// @SuppressWarnings("deprecation")
	public void doSave() {
		PhysicianOrders ls = new PhysicianOrders();
		Prescription prescription = new Prescription();
		prescription.setSerial(Global.currentPrescriptionKey);
		prescription.setNotes(txtNursesNotes.getText());
		prescription.setDiagnosis(txtDiagnosis.getText());
		prescription.setDose(txtDose.getText());
		prescription.setMedication(txtMedication.getText());
		prescription.setAa(txtAA.getText());
		prescription.setFrequency(cmbFrequency.getSelectedItem().toString());
		prescription.setRa(cmbRA.getSelectedItem().toString());
		// prn field must be an integer
		if (txtPRN.getText().equals("")) {
			prescription.setPrn(0);
		} else {
			prescription.setPrn(Integer.parseInt(txtPRN.getText()));
		}
		prescription.setOrderDate(dcOrderDate.getDate());
		prescription.setDcDate(dcDCdate.getDate());
		//			
		// //---------------R & D----------------
		// Date currentDate=MedrexClientManager.getServerTime();
		// if (prescription != null) {
		// // this.phyRows.add(phyOrder);
		// if (prescription.getOrderDate() != null
		// && prescription.getDcDate() != null) {
		// if (prescription.getOrderDate().compareTo(
		// currentDate) <= 0
		// && currentDate.compareTo(prescription
		// .getDcDate()) <= 0) {
		// if (isCorrectMedicine(
		// Integer.parseInt(prescription
		// .getFrequency()),
		// TimeStrComparator.TIME_FORMATTER
		// .format(Global.currentMedicationTimeCurr))) {
		// for(int i=0;i<=total;i++){
		// PendingMedication pm=new PendingMedication();
		// try{
		// int
		// serial=MedrexClientManager.getInstance().insertOrUpdatePendingMedication(pm);
		// }catch(Exception e){
		// e.printStackTrace();
		// }
		// }
		// }
		// }
		// }
		// }
		// //------------------------------------
		try {
			Global.currentPrescriptionKey = MedrexClientManager.getInstance()
					.insertOrUpdatePrescription(prescription);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ls.setFormId(Global.currentPrescriptionKey);
		ls.setSerial(Global.currentPhysisianOrdersKey);
		ls.setResidentId(Global.currentResidenceKey);
		ls.setFormType("Prescription Form");
		ls.setNotes(txtNursesNotes.getText());
		ls.setUser("Admin");
		ls.setStatus("Complete");
		if (Global.currentPhysisianOrdersKey == 0) {
			ls.setDateCreated(MedrexClientManager.getServerTime());
		} else {
			ls.setDateCreated(creationDate);
		}
		ls.setLastModified(MedrexClientManager.getServerTime());
		try {
			Global.currentPhysisianOrdersKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrder(ls);
		} catch (Exception e) {

		}

		// // inserting pending medication......
		//
		// Date orderDate = dcOrderDate.getDate();
		// Date dcDate = dcDCdate.getDate();
		// // System.out.println("Dc Date is"+dcDCdate.getDate());
		// int years, months, days;
		// if (dcDate.getYear() > orderDate.getYear()) {
		// years = dcDate.getYear() - orderDate.getYear();
		// } else {
		// years = 0;
		// }
		// System.out.println("Years:" + years);
		// if (dcDate.getMonth() > orderDate.getMonth()) {
		// months = (dcDate.getMonth() - orderDate.getMonth()) + (years * 12);
		// } else {
		// months = (years * 12) - (orderDate.getMonth() - dcDate.getMonth());
		// }
		// System.out.println("Months:" + months);
		// if (dcDate.getDate() > orderDate.getDate()) {
		// days = ((dcDate.getDate() - orderDate.getDate())) + (months * 30);
		// } else {
		// days = (months * 30) - (orderDate.getDate() - dcDate.getDate());
		// }
		// int frequency = Integer.parseInt(cmbFrequency.getSelectedItem() +
		// "");
		// // System.out.println("Years-"+years+",Months-"+months+"Days"+days);
		// int totalRecords = (days) * frequency;
		// // System.out.println("getDays"+dcDate.getDate());
		// // System.out.println("Total Days=" + days);
		// // System.out.println("Total Records=" + totalRecords);
		//		
		// while(!(orderDate.getDate()==dcDate.getDate()+1 &&
		// orderDate.getMonth()==dcDate.getMonth() &&
		// orderDate.getYear()==dcDate.getYear())){
		// // for(int k=0;k<64;k++){
		// // System.out.println("Order Date"+orderDate);
		// // System.out.println("DCDate"+dcDate);
		// for (int i = 0; i < frequency; i++) {
		// PendingMedication pm = new PendingMedication();
		// pm.setDiagnosis(txtDiagnosis.getText());
		// pm.setMedication(txtMedication.getText());
		// pm.setDose(txtDose.getText());
		// pm.setRa(cmbRA.getSelectedItem() + "");
		// pm.setAa(txtAA.getText());
		// pm.setPrn(Integer.parseInt(txtPRN.getText()));
		// // SimpleDateFormat df=new SimpleDateFormat();
		// // df.applyPattern("MM/dd/yyyy");
		// pm.setDateAndTime(orderDate);
		// //
		// if(isCorrectMedicine(frequency,TimeStrComparator.TIME_FORMATTER.format(Global.currentMedicationTimeCurr))){
		// try {
		// int
		// PendingSerial=PendingMedicationDao.getInstance().insertOrUpdatePendingMedication(pm);
		// } catch (MedrexException e) {
		// e.printStackTrace();
		// }
		// // }
		// }
		// if(orderDate.getDate()<=30 &&
		// (orderDate.getMonth()<=dcDate.getMonth()||orderDate.getMonth()>=dcDate.getMonth())
		// ){
		// orderDate.setDate(orderDate.getDate()+1);
		// }
		// else if(orderDate.getDate()>=30){
		// orderDate.setDate(1);
		// if(orderDate.getMonth()<=12)
		// orderDate.setMonth(orderDate.getMonth()+1);
		//					
		// else{
		// orderDate.setMonth(1);
		// orderDate.setYear(orderDate.getYear()+1);
		// }
		// }
		// }
	}

	// public boolean doValidate() {
	// ValidationResult vRes = new ValidationResult();
	// ValidationResult temp;
	//
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	// txtMedication, "Medication Field"))) {
	// vRes.addAllFrom(temp);
	// }
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	// txtDiagnosis, "Diagnosis Field"))) {
	// vRes.addAllFrom(temp);
	// }
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtAA,
	// "Dosage Field"))) {
	// vRes.addAllFrom(temp);
	// }
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
	// cmbRA, "Route Field"))) {
	// vRes.addAllFrom(temp);
	// }
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
	// cmbFrequency, "Frequency Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtAA,
	// "Amount Administered Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtPRN,
	// "PRN Indicator Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
	// dcDCdate, "D/C Date Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
	// dcOrderDate, "Order Date Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//
	// System.out.println(FieldValidation.getMessages(vRes.getMessages()));
	//
	// if (!FieldValidation.isEmpty(vRes)) {
	// FieldValidation.Msgbox(vRes, "Physician ");
	// return false;
	// } else {
	//
	// // JOptionPane.showMessageDialog(this, "Saved successfully");
	// }
	// return true;
	// }
	public void doFormChanged() {
		if (Global.currentPhysisianOrdersKey != 0) {
			PhysicianOrders ls = null;
			try {
				ls = MedrexClientManager.getInstance().getPhysicianOrder(
						Global.currentPhysisianOrdersKey);
			} catch (Exception e) {
			}
			Global.currentPrescriptionKey = ls.getFormId();

		} else {
			Global.currentPrescriptionKey = 0;

		}
		Global.panelAddNewPhysician.updateData();
	}

	// ---------------R & D-------------------

	// private boolean isCorrectMedicine(int freq, String timeSlot) {
	// boolean res = false;
	// String[] strArr = PanelMedicationDesktop.getTimeList(freq);
	// for (int i = 0; i < strArr.length; i++) {
	// if (strArr[i].equalsIgnoreCase(timeSlot)) {
	// // return true;
	// res = true;
	// break;
	// }
	// }
	// return res;
	// }
	//
	// private boolean isCorrectNotes(Date nurDate, Date nurTime, Date cTime,
	// Date nTime) {
	// if (nurDate != null && nurTime != null) {
	// if (nurDate.getDate() == cTime.getDate()) {
	//
	// if (cTime.getTime() <= nurTime.getTime() /*
	// * && nTime.getTime() >
	// * nurTime.getTime()
	// */) {
	// // if(cTime.getTime() <= nurTime.getTime()) {
	// return true;
	// }
	// }
	// }
	// return false;
	// }

	// ---------------------------------------
	public static void main(String ar[]) {
		SwingUtils.wrapInFrame(new PanelAddNewPhysician()).setVisible(true);
	}
}