package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.MedicationAndTreatment.RoutineMedication.PanelMedicationList;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.FieldFormatter;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.admin.Medication;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTreatmentTemp;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.toedter.calendar.JDateChooser;

public class PanelPhysicianOrderTreatmentTemp extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3817532888705467607L;
	private JButton deleteButton;
	private JButton saveButton;
	private JButton addNewButton;
	private JTextArea txtInstruction;
	// private JComboBox cmbFrequency2;
	private JComboBox cmbFrequency1;
	private JTextArea txtPrnIndication;
	/* private ButtonGroup bgDaily = new ButtonGroup(); */
	private ButtonGroup bgYes = new ButtonGroup();
	private JDateChooser dcDurationTo;
	private JDateChooser dcDurationFrom;
	private JRadioButton rbPrnNo;
	private JRadioButton rbPrnYes;
	/*
	 * private JRadioButton rbDurationChoose; private JRadioButton
	 * rbDurationDaily;
	 */
	/* private JTextField txtDuration1; */
	private JTextField txtRoute;
	private JTextField txtInstructions;
	private JComboBox cmbDose;
	private JTextField txtMedication;
	private Medication medication;
	private Map<String, Integer> map = new HashMap<String, Integer>();
	private JCheckBox cbPRN;
	private JFormattedTextField txtDose;
	private JCheckBox cbDurationNA;

	public Medication getMedication() {
		return medication;
	}

	public void setMedication(Medication medication) {
		this.medication = medication;
	}

	public static void main(String[] args) {
		JFrame frm = new JFrame();
		JScrollPane scroll = new JScrollPane();
		PanelPhysicanOrderMedication t = new PanelPhysicanOrderMedication();
		scroll.setViewportView(t);
		frm.getContentPane().add(scroll);
		frm.setSize(740, 800);
		frm.setVisible(true);
	}

	public PanelPhysicianOrderTreatmentTemp() {
		super();
		Global.panelPhysicianOrderTreatmentTemp = this;
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(600, 320));
		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel);

		/*
		 * cmbFrequency2 = new JComboBox();
		 * cmbFrequency2.setBackground(Color.WHITE); cmbFrequency2.setModel(new
		 * DefaultComboBoxModel(new String[] {"", "HOURLY", "DAILY", "WEEKLY",
		 * "MONTHLY"})); cmbFrequency2.setBounds(440, 120, 127, 18);
		 * panel.add(cmbFrequency2);
		 */

		/*
		 * txtDuration1 = new JFormattedTextField(FieldFormatter.MAX2);
		 * txtDuration1.setBounds(300, 150, 36, 18); panel.add(txtDuration1);
		 */

		final JxButton addNewButton = new JxButton();
		addNewButton.setBackground(Color.WHITE);
		addNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				setBlankField();
				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
			}
		});

		addNewButton.setForeground(ColorConstants.DEF_COLOR);
		addNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		addNewButton.setText("Add New");
		addNewButton.setArc(0.4f);
		addNewButton.setBounds(43, 288, 117, 26);
		panel.add(addNewButton);

		final JxButton saveButton = new JxButton();
		saveButton.setBackground(Color.WHITE);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSave();
				setBlankField();
				Global.framePhysicianOrder.dispose();
			}
		});

		saveButton.setForeground(ColorConstants.DEF_COLOR);
		saveButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		saveButton.setArc(0.4f);
		saveButton.setText("Save");
		saveButton.setBounds(220, 288, 117, 26);
		panel.add(saveButton);

		final JxButton deleteButton = new JxButton();
		deleteButton.setBackground(Color.WHITE);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doDelete();
				setBlankField();
			}
		});

		deleteButton.setForeground(ColorConstants.DEF_COLOR);
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteButton.setText("Discontinue");
		deleteButton.setArc(0.4f);
		deleteButton.setBounds(386, 288, 129, 26);
		panel.add(deleteButton);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setName("");
		panel_1.setLayout(null);
		panel_1.setBounds(21, 10, 359, 272);
		panel.add(panel_1);

		final JLabel medicationLabel = new JLabel();
		medicationLabel.setBounds(10, 44, 96, 16);
		panel_1.add(medicationLabel);
		medicationLabel.setForeground(ColorConstants.DEF_COLOR);
		medicationLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		medicationLabel.setText("MEDICATION");

		final JLabel doseLabel = new JLabel();
		doseLabel.setBounds(10, 78, 83, 18);
		panel_1.add(doseLabel);
		doseLabel.setForeground(ColorConstants.DEF_COLOR);
		doseLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		doseLabel.setText("DOSE");

		final JLabel instructionsLabel = new JLabel();
		instructionsLabel.setBounds(10, 112, 127, 18);
		panel_1.add(instructionsLabel);
		instructionsLabel.setForeground(ColorConstants.DEF_COLOR);
		instructionsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		instructionsLabel.setText("INSTRUCTION");

		final JLabel routeLabel = new JLabel();
		routeLabel.setBounds(10, 142, 127, 18);
		panel_1.add(routeLabel);
		routeLabel.setForeground(ColorConstants.DEF_COLOR);
		routeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		routeLabel.setText("Route");

		final JLabel frequencyLabel = new JLabel();
		frequencyLabel.setBounds(10, 177, 127, 18);
		panel_1.add(frequencyLabel);
		frequencyLabel.setForeground(ColorConstants.DEF_COLOR);
		frequencyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		frequencyLabel.setText("FREQUENCY");

		final JLabel durationLabel = new JLabel();
		durationLabel.setBounds(10, 213, 127, 18);
		panel_1.add(durationLabel);
		durationLabel.setForeground(ColorConstants.DEF_COLOR);
		durationLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		durationLabel.setText("DURATION");

		final JLabel fromLabel = new JLabel();
		fromLabel.setForeground(ColorConstants.DEF_COLOR);
		fromLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		fromLabel.setBounds(107, 215, 30, 15);
		panel_1.add(fromLabel);
		fromLabel.setText("From");

		dcDurationFrom = new JDateChooser();
		dcDurationFrom.setBounds(140, 213, 96, 21);
		panel_1.add(dcDurationFrom);
		dcDurationFrom.setDateFormatString("MM/dd/yyyy");
		dcDurationFrom.setForeground(ColorConstants.DEF_COLOR);

		final JLabel toLabel = new JLabel();
		toLabel.setForeground(ColorConstants.DEF_COLOR);
		toLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		toLabel.setBounds(238, 215, 15, 15);
		panel_1.add(toLabel);
		toLabel.setText("To");

		txtMedication = new JTextField();
		txtMedication.setBounds(112, 40, 212, 22);
		txtMedication.setEditable(false);
		panel_1.add(txtMedication);
		txtMedication.setBackground(Color.WHITE);
		txtMedication.setForeground(ColorConstants.DEF_COLOR);

		/*
		 * rbDurationDaily = new JRadioButton(); rbDurationDaily.setBounds(112,
		 * 213, 58, 15); panel_1.add(rbDurationDaily);
		 * rbDurationDaily.setActionCommand("1");
		 * rbDurationDaily.setForeground(ColorConstants.DEF_COLOR);
		 * bgDaily.add(rbDurationDaily); rbDurationDaily.addActionListener(new
		 * ActionListener() { public void actionPerformed(final ActionEvent
		 * arg0) { disablecomponents(); }
		 * 
		 * private void disablecomponents() {
		 * 
		 * dcDurationFrom.setEnabled(false); dcDurationTo.setEnabled(false);
		 * 
		 * } }); rbDurationDaily.setBackground(Color.WHITE);
		 * rbDurationDaily.setFont(new Font("Tahoma", Font.BOLD, 12));
		 * rbDurationDaily.setText("Daily");
		 * 
		 * rbDurationChoose = new JRadioButton();
		 * rbDurationChoose.setBounds(201, 213, 75, 15);
		 * panel_1.add(rbDurationChoose);
		 * rbDurationChoose.setForeground(ColorConstants.DEF_COLOR);
		 * bgDaily.add(rbDurationChoose); rbDurationChoose.addActionListener(new
		 * ActionListener() { public void actionPerformed(final ActionEvent
		 * arg0) { enablecomponents(); }
		 * 
		 * private void enablecomponents() {
		 * 
		 * dcDurationFrom.setEnabled(true); dcDurationTo.setEnabled(true);
		 * 
		 * } }); rbDurationChoose.setFont(new Font("Tahoma", Font.BOLD, 12));
		 * rbDurationChoose.setBackground(Color.WHITE);
		 * rbDurationChoose.setActionCommand("2");
		 * rbDurationChoose.setText("Choose");
		 */

		dcDurationTo = new JDateChooser();
		dcDurationTo.setBounds(255, 213, 96, 21);
		panel_1.add(dcDurationTo);
		dcDurationTo.setDateFormatString("MM/dd/yyyy");
		dcDurationTo.setForeground(ColorConstants.DEF_COLOR);

		final JxButton button = new JxButton();
		button.setBounds(327, 40, 25, 22);
		panel_1.add(button);
		button.setBackground(Color.WHITE);
		button.setArc(0.4f);
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setForeground(ColorConstants.DEF_COLOR);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelMedicationList medList = new PanelMedicationList();
				SwingUtils.openInDialogUnDecorated(medList, null);
				PanelPhysicianOrderTreatmentTemp.this.setMedication(medList
						.getMedication());
				if (PanelPhysicianOrderTreatmentTemp.this.getMedication() != null) {

					txtMedication.setText(PanelPhysicianOrderTreatmentTemp.this
							.getMedication().getName());
					txtRoute.setText(PanelPhysicianOrderTreatmentTemp.this
							.getMedication().getRouteName());
				}
			}
		});
		button.setText("+");

		cmbDose = new JComboBox();
		cmbDose.setBounds(192, 75, 160, 22);
		panel_1.add(cmbDose);
		cmbDose.setBackground(Color.WHITE);
		cmbDose.setInputVerifier(null);
		cmbDose.setModel(new DefaultComboBoxModel(new String[] { "", "MG", "G",
				"ML", "CC", "MCC" }));
		cmbDose.setForeground(ColorConstants.DEF_COLOR);

		txtInstructions = new JTextField();
		txtInstructions.setBounds(112, 109, 239, 22);
		txtInstructions.setForeground(ColorConstants.DEF_COLOR);
		panel_1.add(txtInstructions);

		txtRoute = new JTextField();
		txtRoute.setBounds(112, 140, 239, 22);
		panel_1.add(txtRoute);
		txtRoute.setBackground(Color.WHITE);
		txtRoute.setForeground(ColorConstants.DEF_COLOR);
		/*
		 * txtRoute.setModel(new DefaultComboBoxModel(new String[] {"", "PO",
		 * "IM", "IV", "PR", "GT", "SQ", "TOPICAL", "SV", "NEBUILDER"}));
		 */

		cmbFrequency1 = new JComboBox();
		cmbFrequency1.setBounds(112, 174, 239, 22);
		panel_1.add(cmbFrequency1);
		cmbFrequency1.setBackground(Color.WHITE);
		cmbFrequency1.setForeground(ColorConstants.DEF_COLOR);

		final JLabel routineMedicationLabel = new JLabel();
		routineMedicationLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		routineMedicationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		routineMedicationLabel.setText("ROUTINE TREATMENT");
		routineMedicationLabel.setBounds(83, 10, 193, 14);
		routineMedicationLabel.setForeground(ColorConstants.DEF_COLOR);
		panel_1.add(routineMedicationLabel);

		txtDose = new JFormattedTextField(FieldFormatter.MAX2);
		txtDose.setBounds(113, 75, 73, 22);
		panel_1.add(txtDose);

		cbDurationNA = new JCheckBox();
		cbDurationNA.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (cbDurationNA.isSelected()) {
					dcDurationFrom.setEnabled(false);
					dcDurationTo.setEnabled(false);

				}
				if (!cbDurationNA.isSelected()) {
					dcDurationFrom.setEnabled(true);
					dcDurationTo.setEnabled(true);

				}
			}
		});
		cbDurationNA.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbDurationNA.setBackground(Color.WHITE);
		cbDurationNA.setText("N/A");
		cbDurationNA.setForeground(ColorConstants.DEF_COLOR);
		cbDurationNA.setBounds(105, 245, 62, 18);

		panel_1.add(cbDurationNA);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(386, 10, 194, 251);
		panel.add(panel_2);

		final JLabel prnLabel = new JLabel();
		prnLabel.setBounds(27, 13, 52, 15);
		panel_2.add(prnLabel);
		prnLabel.setForeground(ColorConstants.DEF_COLOR);
		prnLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		prnLabel.setText("PRN");

		/*
		 * rbPrnYes = new JRadioButton(); rbPrnYes.setBounds(10, 34, 58, 18);
		 * panel_2.add(rbPrnYes);
		 * rbPrnYes.setForeground(ColorConstants.DEF_COLOR);
		 * rbPrnYes.setActionCommand("1"); bgYes.add(rbPrnYes);
		 * rbPrnYes.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent arg0) { enablecomponents1(); }
		 * 
		 * private void enablecomponents1() { txtPrnIndication.setEnabled(true);
		 * 
		 * } }); rbPrnYes.setBackground(Color.WHITE); rbPrnYes.setFont(new
		 * Font("Tahoma", Font.BOLD, 12)); rbPrnYes.setText("YES");
		 * 
		 * rbPrnNo = new JRadioButton(); rbPrnNo.setBounds(100, 34, 58, 18);
		 * panel_2.add(rbPrnNo);
		 * rbPrnNo.setForeground(ColorConstants.DEF_COLOR);
		 * rbPrnNo.setActionCommand("0"); bgYes.add(rbPrnNo);
		 * rbPrnNo.addActionListener(new ActionListener() { public void
		 * actionPerformed(final ActionEvent arg0) { disablecomponent1(); }
		 * 
		 * private void disablecomponent1() {
		 * 
		 * txtPrnIndication.setEnabled(false);
		 * 
		 * } }); rbPrnNo.setBackground(Color.WHITE); rbPrnNo.setFont(new
		 * Font("Tahoma", Font.BOLD, 12)); rbPrnNo.setText("NO");
		 */

		cbPRN = new JCheckBox();
		cbPRN.setBounds(85, 11, 58, 18);
		panel_2.add(cbPRN);
		cbPRN.setForeground(ColorConstants.DEF_COLOR);
		cbPRN.setActionCommand("0");
		cbPRN.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (cbPRN.isSelected()) {
					txtPrnIndication.setEditable(true);
					txtInstruction.setEditable(true);
				} else {
					txtPrnIndication.setEditable(false);
					txtInstruction.setEditable(false);
				}
			}
		});
		cbPRN.setBackground(Color.WHITE);
		cbPRN.setFont(new Font("Tahoma", Font.BOLD, 12));
		cbPRN.setText("N/A");

		final JLabel lPnrIndication = new JLabel();
		lPnrIndication.setFont(new Font("Tahoma", Font.BOLD, 12));
		lPnrIndication.setBounds(27, 50, 127, 18);
		lPnrIndication.setForeground(ColorConstants.DEF_COLOR);
		panel_2.add(lPnrIndication);
		lPnrIndication.setText("Indication For Use");

		final JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 82, 174, 45);
		panel_2.add(scrollPane_2);
		scrollPane_2.setBorder(new LineBorder(Color.black, 1, false));
		scrollPane_2.setBackground(Color.WHITE);

		txtPrnIndication = new JTextArea();
		txtPrnIndication.setBackground(Color.WHITE);
		txtPrnIndication.setForeground(ColorConstants.DEF_COLOR);
		txtPrnIndication.setEditable(false);
		scrollPane_2.setViewportView(txtPrnIndication);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 169, 174, 45);
		panel_2.add(scrollPane);
		scrollPane.setBorder(new LineBorder(Color.black, 1, false));

		txtInstruction = new JTextArea();
		txtInstruction.setBackground(Color.WHITE);
		txtInstruction.setForeground(ColorConstants.DEF_COLOR);
		txtInstruction.setEditable(false);
		scrollPane.setViewportView(txtInstruction);

		final JLabel instructionsLabel_1 = new JLabel();
		instructionsLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		instructionsLabel_1.setBounds(27, 145, 127, 18);
		panel_2.add(instructionsLabel_1);
		instructionsLabel_1.setForeground(ColorConstants.DEF_COLOR);
		instructionsLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		instructionsLabel_1.setText("INSTRUCTIONS");
		fillCombos();
	}

	private void fillCombos() {
		List<Object[]> list = null;
		try {
			list = MedrexClientManager.getInstance().getMedicationFrequencies();
		} catch (Exception e) {

			e.printStackTrace();
		}
		cmbFrequency1.addItem("");
		// cmbFrequency1.setModel(new DefaultComboBoxModel(list.toArray()));
		Iterator<Object[]> it = list.iterator();
		while (it.hasNext()) {

			Object obj[] = it.next();
			map.put(obj[1].toString(), (Integer) obj[0]);
			cmbFrequency1.addItem(obj[1].toString());
		}
	}

	public void doDelete() {
		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentPhysicianOrderMedicationKey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager.getInstance()
						.deletePhysicianOrderMedication(
								Global.currentPhysicianOrderMedicationKey);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
	}

	public void doSave() {

		System.out.println("in do save");
		PhysicianOrderTreatmentTemp refphysicianOrderTreatmentTemp = new PhysicianOrderTreatmentTemp();
		if (!cmbFrequency1.getSelectedItem().toString().equalsIgnoreCase("")) {
			refphysicianOrderTreatmentTemp.setFrequency1(map.get(cmbFrequency1
					.getSelectedItem().toString()));
		} else {
			JOptionPane.showMessageDialog(null, "Please Select Frquency");
			return;
		}
		if (cbPRN.isSelected() && txtPrnIndication.getText().length() <= 0) {
			JOptionPane.showMessageDialog(null, "Please Provide Indication");
			return;
		}
		refphysicianOrderTreatmentTemp
				.setSerial(Global.currentPhysicianOrderTreatmentTempKey);
		refphysicianOrderTreatmentTemp
				.setResidentId(Global.currentResidenceKey);
		refphysicianOrderTreatmentTemp.setPrnInstructionComments(txtInstruction
				.getText());
		refphysicianOrderTreatmentTemp
				.setPrnIndicationComments(txtPrnIndication.getText());

		if (getMedication() != null) {
			refphysicianOrderTreatmentTemp.setMedicationId(getMedication()
					.getNdc());
		}
		refphysicianOrderTreatmentTemp.setPrnIndication(cbPRN.isSelected() ? 1
				: 0);
		if (txtDose.getText().length() != 0) {
			refphysicianOrderTreatmentTemp.setDoseAmount(Integer
					.parseInt(txtDose.getText()));
		}
		if (dcDurationFrom.isEnabled() || dcDurationFrom.isEnabled()) {
			refphysicianOrderTreatmentTemp
					.setDurationTo(dcDurationTo.getDate());
			refphysicianOrderTreatmentTemp.setDurationFrom(dcDurationFrom
					.getDate());
		} else {
			refphysicianOrderTreatmentTemp.setDurationTo(new Date());
			refphysicianOrderTreatmentTemp.setDurationFrom(new Date());
		}
		/*
		 * if(txtDuration1.getText().length()!= 0){
		 * refPhysicianOrderMedication.setDuration1
		 * (Integer.parseInt(txtDuration1.getText())); }
		 */
		refphysicianOrderTreatmentTemp.setRoute(txtRoute.getText());
		refphysicianOrderTreatmentTemp.setInstructions(txtInstructions
				.getText());
		refphysicianOrderTreatmentTemp.setDose((String) cmbDose
				.getSelectedItem());
		refphysicianOrderTreatmentTemp.setMedication(txtMedication.getText());
		try {
			Global.currentPhysicianOrderTreatmentTempKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderTreatmentTemp(
							refphysicianOrderTreatmentTemp);
		} catch (Exception e) {
			e.printStackTrace();
		}

		PhysicianOrderRecord physRec = new PhysicianOrderRecord();
		physRec.setDateCreated(MedrexClientManager.getServerTime());
		physRec.setLastModified(MedrexClientManager.getServerTime());
		physRec.setFormId(Global.currentPhysicianOrderTreatmentTempKey);
		physRec.setFormType("TreatmentTemp");
		//physRec.setResidentId(Global.currentResidenceKey);
	    ResidentMain resmain = null;
		try{
			resmain = MedrexClientManager.getInstance().getResident(Global.currentResidenceKey);
			
		}
		
		catch (Exception e) {
                
                  e.printStackTrace();


		 
		}
		physRec.setResidents(resmain);
		
		physRec.setStatus("");
		//physRec.setUser(Global.currentLoggedInUserKey);

		Users user = null;
		try{
			user = MedrexClientManager.getInstance().getUser(Global.currentLoggedInUserKey);
			
		}
		
		catch (Exception e) {
                  e.printStackTrace();


		 
		}
		 
		physRec.setUser(user);
		physRec.setSerial(Global.currentPhysicianOrderRecordKey);
		physRec.setTitle(refphysicianOrderTreatmentTemp.getRoute());

		try {
			Global.currentPhysicianOrderRecordKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderRecord(physRec);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Global.panelPhysicianOrderDetails != null) {
			Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		}
		setBlankField();

	}

	public void setValueObject(
			PhysicianOrderTreatmentTemp refphysicianOrderTreatmentTemp) {
		if (map.containsValue(refphysicianOrderTreatmentTemp.getFrequency1())) {
			cmbFrequency1
					.setSelectedItem(getFrequencyKey(refphysicianOrderTreatmentTemp
							.getFrequency1()));
		}
		txtPrnIndication.setText(refphysicianOrderTreatmentTemp
				.getPrnIndication()
				+ "");
		txtDose.setText(refphysicianOrderTreatmentTemp.getDoseAmount() + "");
		dcDurationTo.setDate(refphysicianOrderTreatmentTemp.getDurationTo());
		dcDurationFrom
				.setDate(refphysicianOrderTreatmentTemp.getDurationFrom());
		/*
		 * if(refPhysicianOrderMedication.getDuration1()!=0){
		 * txtDuration1.setText(refPhysicianOrderMedication.getDuration1()+"");
		 * }
		 */
		txtRoute.setText(refphysicianOrderTreatmentTemp.getRoute());
		txtInstructions.setText(refphysicianOrderTreatmentTemp
				.getInstructions());
		txtPrnIndication.setText(refphysicianOrderTreatmentTemp
				.getPrnIndicationComments());
		txtInstruction.setText(refphysicianOrderTreatmentTemp
				.getPrnInstructionComments());
		cmbDose.setSelectedItem(refphysicianOrderTreatmentTemp.getDose());
		txtMedication.setText(refphysicianOrderTreatmentTemp.getMedication());
		cmbFrequency1.setSelectedItem(refphysicianOrderTreatmentTemp
				.getFrequency1());
		if (refphysicianOrderTreatmentTemp.getPrnIndication() == 1) {
			cbPRN.setSelected(true);
		} else {
			cbPRN.setSelected(false);
		}
	}

	private String getFrequencyKey(int value) {

		switch (value) {
		case 1:
			return "DAILY";
		case 2:
			return "2 x DAILY(BID)";
		case 3:
			return "3 x DAILY(TID)";
		case 4:
			return "4 x DAILY(QID)";
		case 5:
			return "BEFORE MEALS(AC)";
		case 6:
			return "AFTER MEALS(PC)";
		case 7:
			return "WITH MEALS(WM)";
		case 8:
			return "Q8 HOURS";
		case 9:
			return "Q6 HOURS";
		case 10:
			return "Q4 HOURS";
		case 11:
			return "BEDTIME(HS)";
		case 12:
			return "COUMADIN";
		case 13:
			return "INSULIN";
		default:
			return "";
		}
	}

	public void setBlankField() {
		Global.currentPhysicianOrderTreatmentTempKey = 0;
		Global.currentPhysicianOrderRecordKey = 0;
		Global.currentPhysicianOrderMedicationKey = 0;
		txtInstruction.setText("");
		/* cmbFrequency2.setSelectedItem(""); */
		cmbFrequency1.setSelectedItem("");
		txtPrnIndication.setText("");
		/* SwingUtils.setSelectedButton(bgDaily,0); */
		SwingUtils.setSelectedButton(bgYes, 0);
		dcDurationTo.setDate(null);
		dcDurationFrom.setDate(null);
		txtDose.setText("");
		/* txtDuration1.setText(""); */
		txtRoute.setText("");
		txtInstructions.setText("");
		cmbDose.setSelectedItem("");
		txtMedication.setText("");
		/* txtDuration1.setText(""); */
		bgYes.clearSelection();
		dcDurationFrom.setEnabled(true);
		dcDurationTo.setEnabled(true);
		cbDurationNA.setSelected(false);
		/* bgDaily.clearSelection(); */

	}
}
