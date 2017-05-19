package medrex.client.main.physicanOrders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxComboBox;
import com.sX.swing.JxPanel;
import com.toedter.calendar.JDateChooser;

public class PanelPrescriptionPrintable extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5684058187281696925L;
	private JPanel panelDateChooser;
	private JScrollPane prnScrollPane;
	private ButtonGroup bgDays = new ButtonGroup();
	private ButtonGroup bgPRNYesNo = new ButtonGroup();
	private JDateChooser dcToDate;
	private JDateChooser dcFromDate;
	private JTextArea txtPrn;
	private JTextField textField_1_6;
	private JRadioButton chooseButton;
	private JRadioButton daysLabel;
	private JTextField textField_1_5;
	private JRadioButton noRadioButton;
	private JRadioButton yesRadioButton;
	private JTextField textField_1_3;
	private JTextField textField_1_2;
	private JTextField textField_1_1;
	private JTextField textField_1;
	private JTextField textField_1_4;
	private JxComboBox cmbSignature;
	private JCheckBox phoneCheckBox;
	private JCheckBox verbalCheckBox;
	private JTextField textField;
	private JTextArea txtDoctorsNotes;
	private JDateChooser dcDate;
	private JTextField txtAge;
	private JTextField txtAddress;
	private JTextField txtName;
	private JLabel telLabel;
	private JLabel address2Label;
	private JLabel address1Label;
	private JxComboBox comboBox;
	private JLabel nameOfOrganizationLabel;
	private JPanel panel_5;
	private JLabel doctorsName;

	public PanelPrescriptionPrintable() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(550, 660));
		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(2, 2, 492, 549);
		add(panel_5);
		panel_5.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 2, true));
		panel_5.setLayout(null);

		final JSeparator js1 = new JSeparator();
		js1.setBounds(40, 103, 420, 2);
		js1.setForeground(ColorConstants.DEF_COLOR);
		panel_5.add(js1);

		doctorsName = new JLabel();
		doctorsName.setHorizontalAlignment(SwingConstants.CENTER);
		doctorsName.setFont(new Font("Tahoma", Font.BOLD, 13));
		doctorsName.setText("DOCTOR'S NAME");
		doctorsName.setForeground(ColorConstants.DEF_COLOR);
		doctorsName.setBounds(102, 10, 175, 14);
		panel_5.add(doctorsName);

		nameOfOrganizationLabel = new JLabel();
		nameOfOrganizationLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		nameOfOrganizationLabel.setForeground(ColorConstants.DEF_COLOR);
		nameOfOrganizationLabel.setText("NAME OF ORGANIZATION");
		nameOfOrganizationLabel.setBounds(140, 30, 197, 14);
		panel_5.add(nameOfOrganizationLabel);

		address1Label = new JLabel();
		address1Label.setFont(new Font("@MS Mincho", Font.BOLD, 12));
		address1Label.setText("Address1");
		address1Label.setForeground(ColorConstants.DEF_COLOR);
		address1Label.setBounds(198, 50, 88, 14);
		panel_5.add(address1Label);

		address2Label = new JLabel();
		address2Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		address2Label.setForeground(ColorConstants.DEF_COLOR);
		address2Label.setText("Address2");
		address2Label.setBounds(198, 64, 88, 14);
		panel_5.add(address2Label);

		telLabel = new JLabel();
		telLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		telLabel.setText("Tel:(222) 345 3456            Fax:(222)234 9765");
		telLabel.setForeground(ColorConstants.DEF_COLOR);
		telLabel.setBounds(102, 81, 297, 14);
		panel_5.add(telLabel);

		final JLabel nameLabel = new JLabel();
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		nameLabel.setText("Name");
		nameLabel.setForeground(ColorConstants.DEF_COLOR);
		nameLabel.setBounds(20, 115, 54, 12);
		panel_5.add(nameLabel);

		final JLabel ageLabel = new JLabel();
		ageLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		ageLabel.setText("Age");
		ageLabel.setForeground(ColorConstants.DEF_COLOR);
		ageLabel.setBounds(300, 115, 37, 14);
		panel_5.add(ageLabel);

		final JLabel addressLabel = new JLabel();
		addressLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		addressLabel.setText("Address");
		addressLabel.setForeground(ColorConstants.DEF_COLOR);
		addressLabel.setBounds(20, 135, 54, 12);
		panel_5.add(addressLabel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dateLabel.setText("Date");
		dateLabel.setForeground(ColorConstants.DEF_COLOR);
		dateLabel.setBounds(300, 135, 37, 14);
		panel_5.add(dateLabel);

		txtAge = new JTextField();
		txtAge.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		txtAge.setBounds(360, 115, 110, 16);
		panel_5.add(txtAge);

		txtAddress = new JTextField();
		txtAddress
				.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		txtAddress.setBounds(100, 135, 186, 16);
		panel_5.add(txtAddress);

		txtName = new JTextField();
		txtName.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		txtName.setBounds(100, 115, 186, 16);
		panel_5.add(txtName);

		dcDate = new JDateChooser();
		dcDate.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		dcDate.setBounds(360, 135, 110, 16);
		panel_5.add(dcDate);

		final JLabel addressLabel_1 = new JLabel();
		addressLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		addressLabel_1.setForeground(ColorConstants.DEF_COLOR);
		addressLabel_1.setText("Physician Orders");
		addressLabel_1.setBounds(181, 168, 128, 14);
		panel_5.add(addressLabel_1);

		final JxPanel panel_8_1 = new JxPanel();
		panel_8_1.setArc(1.0f);
		panel_8_1.setBackground(Color.WHITE);
		panel_8_1.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1, false));
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(50, 188, 400, 121);
		panel_5.add(panel_8_1);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_1.setBackground(Color.WHITE);
		scrollPane_1.setBounds(10, 10, 381, 101);
		panel_8_1.add(scrollPane_1);

		txtDoctorsNotes = new JTextArea();
		scrollPane_1.setViewportView(txtDoctorsNotes);

		cmbSignature = new JxComboBox();
		cmbSignature.setBackground(Color.WHITE);
		cmbSignature.setBorder(new CompoundBorder(null, null));
		cmbSignature.setArc(0.1f);
		cmbSignature.setBounds(300, 339, 161, 16);
		panel_5.add(cmbSignature);

		final JLabel signatureLabel = new JLabel();
		signatureLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		signatureLabel.setBackground(Color.WHITE);
		signatureLabel.setForeground(ColorConstants.DEF_COLOR);
		signatureLabel.setText("Signature");
		signatureLabel.setBounds(217, 339, 69, 14);
		panel_5.add(signatureLabel);

		final JSeparator js1_1 = new JSeparator();
		js1_1.setBounds(40, 101, 420, 11);
		js1_1.setForeground(ColorConstants.DEF_COLOR);
		panel_5.add(js1_1);

		verbalCheckBox = new JCheckBox();
		verbalCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		verbalCheckBox.setOpaque(false);
		verbalCheckBox.setText("verbal");
		verbalCheckBox.setForeground(ColorConstants.DEF_COLOR);
		verbalCheckBox.setBounds(20, 338, 69, 16);
		panel_5.add(verbalCheckBox);

		phoneCheckBox = new JCheckBox();
		phoneCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		phoneCheckBox.setForeground(ColorConstants.DEF_COLOR);
		phoneCheckBox.setOpaque(false);
		phoneCheckBox.setText("Phone");
		phoneCheckBox.setBounds(89, 338, 103, 16);
		panel_5.add(phoneCheckBox);

		comboBox = new JxComboBox();
		comboBox.setArc(0.4f);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "MD",
				"DESIG 1", "DESIG 2" }));
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(ColorConstants.DEF_COLOR);
		comboBox.setBounds(283, 10, 103, 18);
		panel_5.add(comboBox);

		final JLabel iNurseLabel = new JLabel();
		iNurseLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		iNurseLabel.setForeground(ColorConstants.DEF_COLOR);
		iNurseLabel.setText("I , Nurse");
		iNurseLabel.setBounds(26, 315, 72, 14);
		panel_5.add(iNurseLabel);

		textField = new JTextField();
		textField.setForeground(new Color(0, 139, 139));
		textField.setBounds(100, 316, 197, 14);
		panel_5.add(textField);

		final JLabel tookOrderFromLabel = new JLabel();
		tookOrderFromLabel.setForeground(ColorConstants.DEF_COLOR);
		tookOrderFromLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tookOrderFromLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		tookOrderFromLabel.setText("took order from ");
		tookOrderFromLabel.setBounds(300, 315, 161, 14);
		panel_5.add(tookOrderFromLabel);

		final JPanel prescriptionPanel = new JPanel();
		prescriptionPanel.setBackground(Color.WHITE);
		prescriptionPanel.setLayout(null);
		prescriptionPanel.setBounds(20, 378, 462, 161);
		panel_5.add(prescriptionPanel);

		final JLabel orderDateLabel = new JLabel();
		orderDateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		orderDateLabel.setForeground(ColorConstants.DEF_COLOR);
		orderDateLabel.setText("Order Date");
		orderDateLabel.setBounds(10, 0, 88, 14);
		prescriptionPanel.add(orderDateLabel);

		final JLabel medicationLabel = new JLabel();
		medicationLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		medicationLabel.setForeground(ColorConstants.DEF_COLOR);
		medicationLabel.setText("Medication");
		medicationLabel.setBounds(10, 20, 88, 14);
		prescriptionPanel.add(medicationLabel);

		final JLabel doseLabel = new JLabel();
		doseLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		doseLabel.setForeground(ColorConstants.DEF_COLOR);
		doseLabel.setText("Dose");
		doseLabel.setBounds(10, 40, 88, 14);
		prescriptionPanel.add(doseLabel);

		final JLabel routeLabel = new JLabel();
		routeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		routeLabel.setForeground(ColorConstants.DEF_COLOR);
		routeLabel.setText("Route");
		routeLabel.setBounds(10, 60, 88, 14);
		prescriptionPanel.add(routeLabel);

		final JLabel frequencyLabel = new JLabel();
		frequencyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		frequencyLabel.setForeground(ColorConstants.DEF_COLOR);
		frequencyLabel.setText("Frequency");
		frequencyLabel.setBounds(10, 80, 88, 14);
		prescriptionPanel.add(frequencyLabel);

		final JLabel prnLabel = new JLabel();
		prnLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		prnLabel.setForeground(ColorConstants.DEF_COLOR);
		prnLabel.setText("PRN");
		prnLabel.setBounds(10, 100, 88, 14);
		prescriptionPanel.add(prnLabel);

		final JLabel durationLabel = new JLabel();
		durationLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		durationLabel.setForeground(ColorConstants.DEF_COLOR);
		durationLabel.setText("Duration");
		durationLabel.setBounds(10, 120, 88, 14);
		prescriptionPanel.add(durationLabel);

		final JLabel diagnosisLabel = new JLabel();
		diagnosisLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		diagnosisLabel.setForeground(ColorConstants.DEF_COLOR);
		diagnosisLabel.setText("Diagnosis");
		diagnosisLabel.setBounds(10, 140, 88, 14);
		prescriptionPanel.add(diagnosisLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(104, 20, 172, 16);
		prescriptionPanel.add(textField_1);

		textField_1_1 = new JTextField();
		textField_1_1.setBounds(104, 40, 172, 16);
		prescriptionPanel.add(textField_1_1);

		textField_1_2 = new JTextField();
		textField_1_2.setBounds(104, 60, 172, 16);
		prescriptionPanel.add(textField_1_2);

		textField_1_3 = new JTextField();
		textField_1_3.setBounds(104, 80, 172, 16);
		prescriptionPanel.add(textField_1_3);

		textField_1_5 = new JTextField();
		textField_1_5.setBounds(104, 120, 28, 16);
		prescriptionPanel.add(textField_1_5);

		textField_1_6 = new JTextField();
		textField_1_6.setBounds(104, 140, 172, 16);
		prescriptionPanel.add(textField_1_6);

		textField_1_4 = new JTextField();
		textField_1_4.setBounds(104, 0, 172, 16);
		prescriptionPanel.add(textField_1_4);

		yesRadioButton = new JRadioButton();
		yesRadioButton.setActionCommand("1");
		yesRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doUpdatePrnPanel();
			}
		});
		bgPRNYesNo.add(yesRadioButton);
		yesRadioButton.setForeground(ColorConstants.DEF_COLOR);
		yesRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		yesRadioButton.setOpaque(false);
		yesRadioButton.setText("Yes");
		yesRadioButton.setBounds(104, 100, 51, 14);
		prescriptionPanel.add(yesRadioButton);

		noRadioButton = new JRadioButton();
		noRadioButton.setActionCommand("2");
		noRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doUpdatePrnPanel();
			}
		});
		bgPRNYesNo.add(noRadioButton);
		noRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		noRadioButton.setForeground(ColorConstants.DEF_COLOR);
		noRadioButton.setOpaque(false);
		noRadioButton.setText("No");
		noRadioButton.setBounds(161, 100, 76, 14);
		prescriptionPanel.add(noRadioButton);

		daysLabel = new JRadioButton();
		daysLabel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doUpdateDuration();
			}
		});
		daysLabel.setActionCommand("1");
		bgDays.add(daysLabel);
		daysLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		daysLabel.setForeground(ColorConstants.DEF_COLOR);
		daysLabel.setOpaque(false);
		daysLabel.setText("Days OR");
		daysLabel.setBounds(138, 120, 76, 14);
		prescriptionPanel.add(daysLabel);

		chooseButton = new JRadioButton();
		chooseButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doUpdateDuration();
			}
		});
		chooseButton.setActionCommand("2");
		bgDays.add(chooseButton);
		chooseButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		chooseButton.setForeground(ColorConstants.DEF_COLOR);
		chooseButton.setOpaque(false);
		chooseButton.setText("Choose");
		chooseButton.setBounds(220, 120, 70, 14);
		prescriptionPanel.add(chooseButton);

		prnScrollPane = new JScrollPane();
		prnScrollPane.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1,
				false));
		prnScrollPane.setBounds(293, 25, 162, 65);
		prescriptionPanel.add(prnScrollPane);

		txtPrn = new JTextArea();
		txtPrn.setForeground(ColorConstants.DEF_COLOR);
		prnScrollPane.setViewportView(txtPrn);

		final JLabel prnIndicationLabel = new JLabel();
		prnIndicationLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		prnIndicationLabel.setForeground(ColorConstants.DEF_COLOR);
		prnIndicationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		prnIndicationLabel.setText("PRN INDICATION");
		prnIndicationLabel.setBounds(319, 5, 118, 14);
		prescriptionPanel.add(prnIndicationLabel);

		panelDateChooser = new JPanel();
		panelDateChooser.setLayout(null);
		panelDateChooser.setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1,
				false));
		panelDateChooser.setBackground(Color.WHITE);
		panelDateChooser.setBounds(293, 100, 162, 50);
		prescriptionPanel.add(panelDateChooser);

		dcFromDate = new JDateChooser();
		dcFromDate.setBounds(5, 26, 71, 16);
		panelDateChooser.add(dcFromDate);

		final JLabel fromLabel = new JLabel();
		fromLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		fromLabel.setForeground(ColorConstants.DEF_COLOR);
		fromLabel.setHorizontalAlignment(SwingConstants.CENTER);
		fromLabel.setText("From");
		fromLabel.setBounds(10, 6, 54, 14);
		panelDateChooser.add(fromLabel);

		final JLabel toLabel = new JLabel();
		toLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		toLabel.setHorizontalAlignment(SwingConstants.CENTER);
		toLabel.setForeground(ColorConstants.DEF_COLOR);
		toLabel.setText("To");
		toLabel.setBounds(95, 6, 44, 14);
		panelDateChooser.add(toLabel);

		dcToDate = new JDateChooser();
		dcToDate.setBounds(85, 26, 68, 16);
		panelDateChooser.add(dcToDate);

		doUpdate();
	}

	private void doUpdateDuration() {
		if (SwingUtils.getSelectedButton(bgDays) == 1) {
			dcFromDate.setDate(null);
			dcToDate.setDate(null);
			dcFromDate.setEnabled(false);
			dcToDate.setEnabled(false);
		} else {
			dcFromDate.setEnabled(true);
			dcToDate.setEnabled(true);
		}
	}

	private void doUpdatePrnPanel() {
		if (SwingUtils.getSelectedButton(bgPRNYesNo) == 1) {
			txtPrn.requestFocus();
			txtPrn.requestFocusInWindow();
			txtPrn.setFocusable(true);
		} else {
			txtPrn.setText("");
			txtPrn.setFocusable(false);
		}

	}

	private void doUpdate() {

	}

	public static void main(String ar[]) {

		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtils.wrapInDialog(new PanelPrescriptionPrintable()).setVisible(
				true);
	}

}
