package medrex.client.medicationcart;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.commons.vo.resident.ResidentMain;

public class PanelMedicationNurseNotes extends JPanel {

	private JButton btnAccept;
	private JButton btnDecline;
	private JLabel lblMedInput;
	private JLabel lblDoseInput;
	private JLabel lblFrequencyInput;
	private String txtNurseNotes;
	private JButton btnPrevious;
	private JButton btnClose;
	private JPanel panelStatus;
	private JLabel chooseMedicineLabel;
	private JLabel lblResidentName;
	private JPanel panelMain;

	private static final long serialVersionUID = 1L;

	public static final Color GREEN = new Color(34, 139, 34);
	public static final Color RED = Color.RED;
	public static final Color GRAY = Color.GRAY;
	public static final Color DEFAULT = Color.BLACK;
	private Date currentDate;
	private PhysicianOrderForm3Row phyOrder;
	private NurseMedicationNotesFormRow nurseMed;

	public PanelMedicationNurseNotes() {
		super();
		Global.panelMedicationNurseNotes = this;
		currentDate = MedrexClientManager.getServerTime();
		setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		setBackground(new Color(176, 224, 230));
		setLayout(null);
		// chooseResidentLabel.setText("RESIDENT DETAILS");

		panelMain = new JPanel();
		panelMain.setBackground(new Color(176, 224, 230));
		panelMain.setLayout(null);
		panelMain.setBounds(10, 10, 941, 704);
		panelMain.setBounds(SwingUtils.centerRectangle(this.getBounds(),
				panelMain.getBounds()));
		add(panelMain);

		lblResidentName = new JLabel();
		lblResidentName.setFont(new Font("", Font.BOLD, 36));
		lblResidentName.setText("Resident Name");
		lblResidentName.setBounds(10, 10, 801, 62);
		panelMain.add(lblResidentName);

		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
			lblResidentName.setText(rm.getUserName() + " " + rm.getUserPass()
			/* TODO: Migrating to room history */
			+ " ," + rm.getSex()/* + " ,#" + rm.getRoom() */);
		} catch (Exception e) {
			e.printStackTrace();
		}

		chooseMedicineLabel = new JLabel();
		chooseMedicineLabel.setFont(new Font("", Font.BOLD, 26));
		chooseMedicineLabel.setText("Medication Status");
		chooseMedicineLabel.setBounds(10, 78, 921, 51);
		panelMain.add(chooseMedicineLabel);

		panelStatus = new JPanel();
		panelStatus.setBackground(new Color(176, 224, 230));
		panelStatus.setLayout(null);
		panelStatus.setBounds(10, 135, 921, 559);
		panelMain.add(panelStatus);

		final JLabel lblMedicine = new JLabel();
		lblMedicine.setFont(new Font("", Font.BOLD, 22));
		lblMedicine.setText("Medicine:");
		lblMedicine.setBounds(10, 10, 179, 46);
		panelStatus.add(lblMedicine);

		final JLabel lblDose = new JLabel();
		lblDose.setFont(new Font("", Font.BOLD, 22));
		lblDose.setText("Dose:");
		lblDose.setBounds(10, 62, 179, 46);
		panelStatus.add(lblDose);

		final JLabel lblFrequency = new JLabel();
		lblFrequency.setFont(new Font("", Font.BOLD, 22));
		lblFrequency.setText("Frequency:");
		lblFrequency.setBounds(10, 114, 179, 46);
		panelStatus.add(lblFrequency);

		lblMedInput = new JLabel();
		lblMedInput.setText("New Medicine");
		lblMedInput.setFont(new Font("", Font.BOLD, 18));
		lblMedInput.setBounds(195, 10, 716, 46);
		panelStatus.add(lblMedInput);

		lblDoseInput = new JLabel();
		lblDoseInput.setFont(new Font("", Font.BOLD, 18));
		lblDoseInput.setText("New Dose");
		lblDoseInput.setBounds(195, 62, 716, 46);
		panelStatus.add(lblDoseInput);

		lblFrequencyInput = new JLabel();
		lblFrequencyInput.setFont(new Font("", Font.BOLD, 18));
		lblFrequencyInput.setText("New Frequency");
		lblFrequencyInput.setBounds(195, 114, 716, 46);
		panelStatus.add(lblFrequencyInput);

		btnAccept = new JButton();
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doAccept();
				Global.frameMedicationForms.showPhysicianOrders();
			}
		});
		btnAccept.setForeground(GREEN);
		btnAccept.setBorder(new LineBorder(GREEN, 5, false));
		btnAccept.setFont(new Font("", Font.BOLD, 28));
		btnAccept.setText("ACCEPT");
		btnAccept.setBounds(250, 469, 200, 80);
		panelStatus.add(btnAccept);

		btnDecline = new JButton();
		btnDecline.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FrameMedicationNotes medNotes = new FrameMedicationNotes();
				medNotes.setVisible(true);
				txtNurseNotes = medNotes.getNurseNotes();
				if (!txtNurseNotes.equalsIgnoreCase("")) {
					Global.frameMedicationNotes = null;
					doDecline();
					Global.frameMedicationForms.showPhysicianOrders();
				}
			}
		});
		btnDecline.setForeground(RED);
		btnDecline.setFont(new Font("", Font.BOLD, 26));
		btnDecline.setBorder(new LineBorder(RED, 5, false));
		btnDecline.setText("DECLINE");
		btnDecline.setBounds(470, 469, 200, 80);
		panelStatus.add(btnDecline);

		btnClose = new JButton();
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setIcon(new ImageIcon("img\\close.jpg"));
		btnClose.setText("");
		btnClose.setBounds(877, 10, 54, 54);
		panelMain.add(btnClose);

		btnPrevious = new JButton();
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// Global.frameMedicationForms.showMedication();
				Global.frameMedicationForms.showPhysicianOrders();
			}
		});
		btnPrevious.setIcon(new ImageIcon("img\\previous.gif"));
		btnPrevious.setText("");
		btnPrevious.setBounds(817, 10, 54, 54);
		panelMain.add(btnPrevious);
		doUpdate(null, null);
	}

	public void doUpdate(PhysicianOrderForm3Row value1,
			NurseMedicationNotesFormRow value2) {
		if (value1 != null) {
			phyOrder = value1;
			lblMedInput.setText(phyOrder.getPhyMedication());
			lblDoseInput.setText(phyOrder.getPhyDosage());
			lblFrequencyInput.setText(phyOrder.getPhyFrequency());
		} else {
			phyOrder = null;
			lblMedInput.setText("");
			lblDoseInput.setText("");
			lblFrequencyInput.setText("");
		}

		if (value2 != null) {
			nurseMed = value2;
			// txtNurseNotes.setText(nurseMed.getReason());
			if (("").equalsIgnoreCase(nurseMed.getResult())
					|| (nurseMed.getResult() == null)) {
				btnAccept.setEnabled(true);
				btnDecline.setEnabled(true);
				// txtNurseNotes.setEditable(true);
			} else {
				btnAccept.setEnabled(false);
				btnDecline.setEnabled(false);
				// txtNurseNotes.setEditable(false);
			}
		} else {
			nurseMed = new NurseMedicationNotesFormRow();
			btnAccept.setEnabled(true);
			btnDecline.setEnabled(true);
			// txtNurseNotes.setEditable(true);
		}
	}

	public void doAccept() {
		doSave(true);
	}

	public void doDecline() {
		doSave(false);
	}

	public void doSave(boolean acceptDecline) {
		NurseMedicationNotesFormRow ref = nurseMed;
		ref.setReason(txtNurseNotes);
		ref.setResult((acceptDecline) ? "Accepted" : "Declined");
		ref.setDateRecord(currentDate);
		SimpleDateFormat df = new SimpleDateFormat("hh':'mm a");
		ref.setTimeRecord(df.format(currentDate));
		ref.setDrugStrength(phyOrder.getPhyMedication() + " - "
				+ phyOrder.getPhyDosage() + " - " + phyOrder.getPhyFrequency());
		System.out.println("Before save: Form:" + ref.getFormSerial()
				+ ", Row:" + ref.getRowSerial());
		try {
			Global.currentNurseMedicationNotesFormKey = MedrexClientManager
					.getInstance().insertOrUpdateNurseMedicationNotesFormRow(
							nurseMed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}