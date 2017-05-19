package medrex.client.main.physicanOrders.progressNotes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.commons.vo.physicianOrders.ProgressNotes2;

import com.toedter.calendar.JDateChooser;

public class PanelProgressNotes2Dialog extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8739143578326321736L;
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
	private JButton cancelButton;
	private JButton saveButton;
	int serial;

	/**
	 * Create the panel
	 */
	public PanelProgressNotes2Dialog() {
		super();
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(809, 140));
		setLayout(null);

		saveButton = new JButton();
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSave();
				Global.frameProgressNotes2Dialog.dispose();
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(596, 100, 93, 23);
		add(saveButton);

		cancelButton = new JButton();
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameProgressNotes2Dialog.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(695, 100, 104, 23);
		add(cancelButton);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 10, 789, 64);
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
	}

	public void updateData() {
		ProgressNotes2 panelProgressNotes = null;
		if (Global.selectedMedication != null) {
			panelProgressNotes = Global.selectedMedication;
			cmbRR.setSelectedItem(panelProgressNotes.getRa());
			cmbFreq.setSelectedItem(panelProgressNotes.getFrequency());
			txtAa.setText(panelProgressNotes.getAa());
			txtPhyMedicationD_1.setText(panelProgressNotes.getMedication());
			txtPrn.setText(panelProgressNotes.getPrn());
			dcDateDC.setDate(panelProgressNotes.getDcDate());
			dcOrderDate.setDate(panelProgressNotes.getOrderDate());
		} else {
			cmbRR.setSelectedItem("");
			cmbFreq.setSelectedItem("");
			txtAa.setText("");
			txtPhyMedicationD_1.setText("");
			txtPrn.setText("");
			dcDateDC.setDate(null);
			dcOrderDate.setDate(null);
		}
	}

	public void doSave() {
		ProgressNotes2 progressNotes2 = new ProgressNotes2();
		progressNotes2.setMedication(txtPhyMedicationD_1.getText());
		progressNotes2.setAa(txtAa.getText());
		progressNotes2.setFrequency((String) cmbFreq.getSelectedItem());
		progressNotes2.setRa((String) cmbRR.getSelectedItem());
		progressNotes2.setPrn(txtPrn.getText());
		progressNotes2.setDcDate(dcDateDC.getDate());
		progressNotes2.setOrderDate(dcOrderDate.getDate());
		Global.selectedMedication = progressNotes2;
	}

	// public boolean doValidate() {
	// ValidationResult vRes = new ValidationResult();
	// ValidationResult temp;
	//
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	// txtPhyMedicationD_1, "Medication Field"))) {
	// vRes.addAllFrom(temp);
	// }
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	// txtAa, "Dosage Field"))) {
	// vRes.addAllFrom(temp);
	// }
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(cmbRR,
	// "Route Field"))) {
	// vRes.addAllFrom(temp);
	// }
	// if (!FieldValidation.isEmpty(temp =
	// FieldValidation.isAnySelected(cmbFreq, "Frequency Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//		
	//		
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(txtAa,
	// "Amount Administered Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//		
	//		
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmpty(
	// txtAa, "PRN Indicator Field"))) {
	// vRes.addAllFrom(temp);
	// }
	//		
	//		
	// if (!FieldValidation.isEmpty(temp = FieldValidation.isNonEmptyDate(
	// dcDateDC, "D/C Date Field"))) {
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
	// //JOptionPane.showMessageDialog(this, "Saved successfully");
	// return true;
	// }
	//
	// }
}
