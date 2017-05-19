package medrex.client.main.physicanOrders.prescription;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.FieldValidation;
import medrex.commons.vo.physicianOrders.Prescription;

import com.jgoodies.validation.ValidationResult;
import com.toedter.calendar.JDateChooser;

public class PanelPrescription extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6925925424180072780L;
	private JPanel panel_3;
	private JDateChooser dcDateDC;
	private JLabel medicationLabel_9;
	private JDateChooser dcOrderDate;
	private JLabel medicationLabel_8;
	private JTextField txtPrn;
	private JLabel medicationLabel_7;
	private JTextField txtAa;
	private JLabel medicationLabel_6;
	private JComboBox cmbFreq;
	private JLabel medicationLabel_5;
	private JComboBox cmbRR;
	private JLabel medicationLabel_3;
	private JTextField txtPhyMedicationD_1;
	private JLabel medicationLabel_1;
	int serial;

	boolean drawMode;
	int x;
	int y;

	/**
	 * Create the panel
	 */
	public PanelPrescription() {
		super();
		Global.panelPrescription = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(809, 800));
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 50, 789, 64);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 201, 64);
		panel.add(panel_1);

		medicationLabel_1 = new JLabel();
		medicationLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		medicationLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		medicationLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		medicationLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		medicationLabel_1.setText("Medication Name & Dose Ordered");
		medicationLabel_1.setBounds(0, 0, 201, 37);
		panel_1.add(medicationLabel_1);

		txtPhyMedicationD_1 = new JTextField();
		txtPhyMedicationD_1.setBorder(new LineBorder(Color.black, 1, false));
		txtPhyMedicationD_1.setBounds(0, 36, 201, 28);
		panel_1.add(txtPhyMedicationD_1);

		final JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(200, 0, 126, 64);
		panel.add(panel_1_2);

		medicationLabel_3 = new JLabel();
		medicationLabel_3.setFont(new Font("Dialog", Font.BOLD, 12));
		medicationLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		medicationLabel_3.setBorder(new LineBorder(Color.black, 1, false));
		medicationLabel_3.setText("RA");
		medicationLabel_3.setBounds(0, 0, 126, 37);
		panel_1_2.add(medicationLabel_3);

		cmbRR = new JComboBox();
		cmbRR.setModel(new DefaultComboBoxModel(new String[] { "",
				"1=by mouth (PO)", "2=sub lingual (SL)", "3=intramuscular(IM)",
				"4=intravenous(IV)", "5=subcutaneous(SQ)", "6=rectal(R)",
				"7=topical", "8=inhalation", "9=enteral Tube", "10=other" }));
		cmbRR.setBackground(Color.WHITE);
		cmbRR.setBounds(1, 37, 124, 25);
		panel_1_2.add(cmbRR);

		final JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBounds(325, 0, 164, 64);
		panel.add(panel_1_2_1);

		medicationLabel_5 = new JLabel();
		medicationLabel_5.setFont(new Font("Dialog", Font.BOLD, 12));
		medicationLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		medicationLabel_5.setBorder(new LineBorder(Color.black, 1, false));
		medicationLabel_5.setText("Frequency");
		medicationLabel_5.setBounds(0, 0, 164, 37);
		panel_1_2_1.add(medicationLabel_5);

		cmbFreq = new JComboBox();
		cmbFreq.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2",
				"3", "4", "5", "6", "7", "8", "9", "10" }));
		cmbFreq.setBackground(Color.WHITE);
		// cmbFreq.setModel(new DefaultComboBoxModel(new String[] {"",
		// "PR=(PRN) as necessary", "1H=(QH) every hours",
		// "2H=(Q2H) every two hours", "3H=(Q3H) every three hours",
		// "4H=(Q4H) every four hours", "6H=(Q6H) every six hours",
		// "8H=(Q8H) every eight hours", "1D=(QD or HS) once daily",
		// "2D=(BID) two times daily", "3D=(TID) three times daily",
		// "4D=(QID) four times daily", "5D=five times daily",
		// "1W=(Q week) once each wk", "2W=two times every week",
		// "3W=three times every week", "QO= every other day",
		// "4W=4 times each week", "5W=five times each week",
		// "6W=six times each week", "1M=(Q mo) once every month",
		// "2M=twice every month", "C=continuous", "O=other"}));
		cmbFreq.setBounds(1, 37, 162, 25);
		panel_1_2_1.add(cmbFreq);

		final JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(Color.WHITE);
		panel_1_4.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(488, 0, 64, 64);
		panel.add(panel_1_4);

		medicationLabel_6 = new JLabel();
		medicationLabel_6.setFont(new Font("Dialog", Font.BOLD, 12));
		medicationLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		medicationLabel_6.setHorizontalTextPosition(SwingConstants.CENTER);
		medicationLabel_6.setBorder(new LineBorder(Color.black, 1, false));
		medicationLabel_6.setText("AA");
		medicationLabel_6.setBounds(0, 0, 64, 37);
		panel_1_4.add(medicationLabel_6);

		txtAa = new JTextField();
		txtAa.setBorder(new LineBorder(Color.black, 1, false));
		txtAa.setBounds(0, 36, 64, 28);
		panel_1_4.add(txtAa);

		final JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setBackground(Color.WHITE);
		panel_1_4_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_4_1.setLayout(null);
		panel_1_4_1.setBounds(551, 0, 64, 64);
		panel.add(panel_1_4_1);

		medicationLabel_7 = new JLabel();
		medicationLabel_7.setFont(new Font("Dialog", Font.BOLD, 12));
		medicationLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		medicationLabel_7.setBorder(new LineBorder(Color.black, 1, false));
		medicationLabel_7.setText("PRN-n");
		medicationLabel_7.setBounds(0, 0, 64, 37);
		panel_1_4_1.add(medicationLabel_7);

		txtPrn = new JFormattedTextField(FieldFormatter.MAX2);
		txtPrn.setBorder(new LineBorder(Color.black, 1, false));
		txtPrn.setBounds(0, 36, 64, 28);
		panel_1_4_1.add(txtPrn);

		final JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBackground(Color.WHITE);
		panel_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setBounds(614, 0, 88, 64);
		panel.add(panel_1_3_1);

		medicationLabel_8 = new JLabel();
		medicationLabel_8.setFont(new Font("Dialog", Font.BOLD, 12));
		medicationLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		medicationLabel_8.setBorder(new LineBorder(Color.black, 1, false));
		medicationLabel_8.setText("Order Date");
		medicationLabel_8.setBounds(0, 0, 88, 37);
		panel_1_3_1.add(medicationLabel_8);

		dcOrderDate = new JDateChooser();
		dcOrderDate.setDateFormatString("MM/dd/yyyy");
		dcOrderDate.setBounds(1, 37, 86, 25);
		panel_1_3_1.add(dcOrderDate);

		final JPanel panel_1_3_1_1 = new JPanel();
		panel_1_3_1_1.setBackground(Color.WHITE);
		panel_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_3_1_1.setLayout(null);
		panel_1_3_1_1.setBounds(701, 0, 88, 64);
		panel.add(panel_1_3_1_1);

		medicationLabel_9 = new JLabel();
		medicationLabel_9.setFont(new Font("Dialog", Font.BOLD, 12));
		medicationLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		medicationLabel_9.setBorder(new LineBorder(Color.black, 1, false));
		medicationLabel_9.setText("D/C Date");
		medicationLabel_9.setBounds(0, 0, 88, 37);
		panel_1_3_1_1.add(medicationLabel_9);

		dcDateDC = new JDateChooser();
		dcDateDC.setDateFormatString("MM/dd/yyyy");
		dcDateDC.setBounds(1, 37, 86, 25);
		panel_1_3_1_1.add(dcDateDC);

		updateData();

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new LineBorder(Color.BLACK, 1, false));
		panel_3.setLayout(null);
		panel_3.setBounds(10, 157, 789, 360);

		panel_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(final MouseEvent arg0) {
				if (drawMode = true) {
					panel_3.getGraphics().drawLine(x, y, arg0.getX(),
							arg0.getY());
					x = arg0.getX();
					y = arg0.getY();
				}
			}
		});

		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(final MouseEvent arg0) {
				drawMode = true;
				x = arg0.getX();
				y = arg0.getY();
			}

			@Override
			public void mouseReleased(final MouseEvent e) {
				drawMode = false;
			}
		});

		add(panel_3);

		final JLabel prescriptionLabel = new JLabel();
		prescriptionLabel.setFont(new Font("", Font.BOLD, 20));
		prescriptionLabel.setText("PRESCRIPTION");
		prescriptionLabel.setBounds(10, 10, 259, 34);
		add(prescriptionLabel);

		final JLabel notesLabel = new JLabel();
		notesLabel.setText("Notes");
		notesLabel.setBounds(10, 135, 122, 16);
		add(notesLabel);
	}

	public void updateData() {
		if (Global.currentPrescriptionKey != 0) {
			Prescription prescription = null;

			try {
				prescription = MedrexClientManager.getInstance()
						.getPrescription(Global.currentPrescriptionKey);
			} catch (Exception e) {

			}
			txtPhyMedicationD_1.setText(prescription.getMedication());
			txtAa.setText(prescription.getAa());
			cmbFreq.setSelectedItem(prescription.getFrequency());
			cmbRR.setSelectedItem(prescription.getRa());
			txtPrn.setText(prescription.getPrn() + "");
			dcDateDC.setDate(prescription.getDcDate());
			dcOrderDate.setDate(prescription.getOrderDate());

		} else {
			txtPhyMedicationD_1.setText("");
			txtAa.setText("");
			cmbFreq.setSelectedItem("");
			cmbRR.setSelectedItem("");
			txtPrn.setText("");
			dcDateDC.setDate(null);
			dcOrderDate.setDate(null);
		}
	}

	public void doSave() {
		Prescription prescription = new Prescription();

		prescription.setMedication(txtPhyMedicationD_1.getText());
		prescription.setAa(txtAa.getText());
		prescription.setFrequency(cmbFreq.getSelectedItem().toString());
		prescription.setRa(cmbRR.getSelectedItem().toString());
		prescription.setPrn(Integer.parseInt(txtPrn.getText()));
		prescription.setOrderDate(dcDateDC.getDate());
		prescription.setDcDate(dcOrderDate.getDate());

		try {
			Global.currentPrescriptionKey = MedrexClientManager.getInstance()
					.insertOrUpdatePrescription(prescription);
		} catch (Exception e) {
		}
	}

	public boolean doValidate() {
		ValidationResult vRes = new ValidationResult();
		ValidationResult temp;

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
				txtPhyMedicationD_1, "Medication Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtAa,
				"Dosage Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				cmbRR, "Route Field"))) {
			vRes.addAllFrom(temp);
		}
		if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
				cmbFreq, "Frequency Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtAa,
				"Amount Administered Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtAa,
				"PRN Indicator Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dcDateDC, "D/C Date Field"))) {
			vRes.addAllFrom(temp);
		}

		if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
				dcOrderDate, "Order Date Field"))) {
			vRes.addAllFrom(temp);
		}

		System.out.println(FieldValidation.getMessages(vRes.getMessages()));

		if (!FieldValidation.isEmpty(vRes)) {
			FieldValidation.Msgbox(vRes, "Physician ");
			return false;
		} else {

			// JOptionPane.showMessageDialog(this, "Saved successfully");
			return true;
		}

	}
}
