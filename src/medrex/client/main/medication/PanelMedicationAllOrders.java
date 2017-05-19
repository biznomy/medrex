package medrex.client.main.medication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.medication.nurseMedicationNotes.PanelNurseMedicationNotes;
import medrex.client.medicationcart.FrameMedicationForms;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.medication.MedicationTreatmentForm;
import medrex.commons.vo.medication.NurseMedicationNotesForm;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.commons.vo.resident.ResidentMain;

public class PanelMedicationAllOrders extends JPanel {

	private JButton btnPrevious;
	private JButton btnDown;
	private JButton btnClose;
	private JButton btnUp;
	private JPanel panelList;
	private JLabel chooseMedicineLabel;
	private JLabel lblResidentName;
	private JPanel panel;
	private Date currentDate;
	private PanelMedicationAllOrdersRow panelRows[];
	public static final int medicationsPerPage = 5;
	private Object[][] elements;
	private int currentPage;
	private int numOfPages;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelMedicationAllOrders() {
		super();
		Global.panelMedicationAllOrders = this;
		currentDate = MedrexClientManager.getServerTime();
		setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		setBackground(new Color(176, 224, 230));
		setLayout(null);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 10, 941, 704);
		panel.setBounds(SwingUtils.centerRectangle(this.getBounds(), panel
				.getBounds()));
		panel.setBackground(new Color(176, 224, 230));
		add(panel);

		lblResidentName = new JLabel();
		lblResidentName.setFont(new Font("", Font.BOLD, 36));
		lblResidentName.setText("Resident Name");
		lblResidentName.setBounds(10, 10, 801, 62);
		panel.add(lblResidentName);

		ResidentMain rm = null;
		System.out.println(Global.currentResidenceKey);
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
		chooseMedicineLabel.setText("Choose Medicine");
		chooseMedicineLabel.setBounds(10, 78, 921, 51);
		panel.add(chooseMedicineLabel);

		panelList = new JPanel();
		panelList.setName("");
		panelList.setLayout(null);
		panelList.setBackground(new Color(176, 224, 230));
		panelList.setBounds(10, 135, 861, 559);
		panel.add(panelList);

		btnClose = new JButton();
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setIcon(new ImageIcon("img\\close.jpg"));
		btnClose.setText("");
		btnClose.setBounds(877, 10, 54, 54);
		panel.add(btnClose);

		btnUp = new JButton();
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				currentPage = currentPage - 1;
				updateButtons();
				showMedications();
			}
		});
		btnUp.setIcon(new ImageIcon("img\\up.gif"));
		btnUp.setText("");
		btnUp.setBounds(877, 135, 54, 54);
		panel.add(btnUp);

		btnDown = new JButton();
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				currentPage = currentPage + 1;
				updateButtons();
				showMedications();
			}
		});
		btnDown.setIcon(new ImageIcon("img\\down.gif"));
		btnDown.setText("");
		btnDown.setBounds(877, 640, 54, 54);
		panel.add(btnDown);

		btnPrevious = new JButton();
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// Global.frameMedication.showResidentDesktopMedication();
			}
		});
		btnPrevious.setIcon(new ImageIcon("img\\previous.gif"));
		btnPrevious.setText("");
		btnPrevious.setBounds(817, 10, 54, 54);
		panel.add(btnPrevious);

		panelRows = new PanelMedicationAllOrdersRow[medicationsPerPage];

		for (int i = 0; i < medicationsPerPage; i++) {
			panelRows[i] = new PanelMedicationAllOrdersRow();
			panelRows[i].id = i;
			panelRows[i].setBounds(0, 110 * i, panelList.getSize().width, 100);
			panelList.add(panelRows[i]);
			panelRows[i].getLblMedication().setText("" + i);
			panelRows[i].getLblStatus().setText("" + i);
			panelRows[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(final MouseEvent arg0) {
					PanelMedicationAllOrdersRow a = (PanelMedicationAllOrdersRow) arg0
							.getSource();
					doSelect(a.id);
				}
			});
		}

		fillCombos();
		updateButtons();
	}

	public void fillCombos() {
		List phyOrders = new ArrayList();
		List medNotes = new ArrayList();
		List l = null;
		try {
			l = MedrexClientManager.getInstance().getPhysicianOrderForm3s(
					Global.currentResidenceKey);
			Iterator i = l.iterator();
			while (i.hasNext()) {
				PhysicianOrderForm3 ref = (PhysicianOrderForm3) i.next();
				// System.out.println(ref.getSerial());
				for (int j = 1; j <= 9; j++) {
					// System.out.println("loop" + j);
					PhysicianOrderForm3Row refRow = MedrexClientManager
							.getInstance().getPhysicianOrderForm3Row(
									ref.getSerial(), j, currentDate);
					if (refRow != null) {
						if (refRow.getPhyOrderDate() != null
								&& refRow.getPhyDcDate() != null) {
							if (refRow.getPhyOrderDate().compareTo(currentDate) <= 0
									&& currentDate.compareTo(refRow
											.getPhyDcDate()) <= 0) {
								phyOrders.add(refRow);
								// System.out.println(refRow.getPhyOrderDate());
							}
						}
						// System.out.println(refRow);
					}
				}
			}
			System.out.println("Phy: " + phyOrders.size());
			if (phyOrders.size() > 0) {
				l = null;
				i = null;
				l = MedrexClientManager.getInstance()
						.getNurseMedicationNotesForms(
								Global.currentResidenceKey);
				if (l == null || l.size() == 0) {
					MedicationTreatmentForm ar = new MedicationTreatmentForm();
					PanelNurseMedicationNotes ref = new PanelNurseMedicationNotes();
					ref.doSave();
					ar.setFormId(Global.currentNurseMedicationNotesFormKey);
					ar.setSerial(Global.currentMedicationTreatmentFormKey);
					ar.setResidentId(Global.currentResidenceKey);
					ar.setFormType("Nurse Medication Notes");
					ar.setNotes(null);
					// ar.setUser(MedrexClientManager.getInstance().getOtherUser(Global.currentLoggedInUserKey).getUserName());
					ar.setUser(MedrexClientManager.getInstance().getUser(
							Global.currentLoggedInUserKey).getUserName());
					ar.setStatus("Completed");
					ar.setDateCreated(currentDate);
					ar.setLastModified(currentDate);
					MedrexClientManager.getInstance()
							.insertOrUpdateMedicationTreatmentForm(ar);
					l = MedrexClientManager.getInstance()
							.getNurseMedicationNotesForms(
									Global.currentResidenceKey);
				}
				i = l.iterator();
				while (i.hasNext()) {
					NurseMedicationNotesForm ref = (NurseMedicationNotesForm) i
							.next();
					for (int j = 1; j <= 50; j++) {
						NurseMedicationNotesFormRow refRow = MedrexClientManager
								.getInstance().getNurseMedicationNotesFormRow(
										ref.getSerial(), j);
						if (refRow != null) {
							if (refRow.getFormSerial() != 0
									&& j <= phyOrders.size()) {
								System.out.println(refRow.getFormSerial()
										+ ", " + refRow.getRowSerial());
								medNotes.add(refRow);
							}
						}
					}
				}
			}
			int size = phyOrders.size();
			// System.out.println("Size: " + size);
			elements = new Object[size][2];
			i = null;
			i = phyOrders.iterator();
			int j = 0;
			for (j = 0; (j < size) && i.hasNext(); j++) {
				elements[j][0] = i.next();
			}
			i = medNotes.iterator();
			j = 0;
			for (j = 0; (j < size) && i.hasNext(); j++) {
				elements[j][1] = i.next();
			}
			numOfPages = ((Double) Math.ceil(new Double((double) phyOrders
					.size()
					/ medicationsPerPage))).intValue();
			currentPage = 1;
			// System.out.println("Elements:" + elements.length);
			showMedications();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// public static void main(String[] a) {
	// Global.currentResidenceKey = 11;
	// JFrame f = new JFrame();
	// f.add(new PanelMedication());
	// f.setUndecorated(false);
	// f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	// f.setVisible(true);
	// }
	public void showMedications() {
		this.repaint();
		int j = 0;
		for (int k = 0; k < medicationsPerPage; k++) {
			panelRows[k].doUpdate(null, null);
		}
		for (int i = (currentPage - 1) * medicationsPerPage; (i < ((currentPage - 1) * (medicationsPerPage))
				+ medicationsPerPage)
				&& (j < elements.length); i++) {
			try {
				if (elements[i] != null) {
					panelRows[j].doUpdate(elements[i][0], elements[i][1]);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			j++;
		}
	}

	public void updateButtons() {
		if (currentPage > 1) {
			btnUp.setEnabled(true);
		} else {
			btnUp.setEnabled(false);
		}
		if (currentPage == numOfPages) {
			btnDown.setEnabled(false);
		} else {
			btnDown.setEnabled(true);
		}
	}

	public void doSelect(int selectedRow) {
		int index = ((currentPage - 1) * medicationsPerPage) + selectedRow;
		PhysicianOrderForm3Row value1 = (PhysicianOrderForm3Row) elements[index][0];
		NurseMedicationNotesFormRow value2 = (NurseMedicationNotesFormRow) elements[index][1];
		// if (value1 != null) {
		if (Global.frameMedicationForms == null) {
			Global.frameMedicationForms = new FrameMedicationForms();
		}
		Global.frameMedicationForms.panelMedicationNurseNotes.doUpdate(value1,
				value2);
		Global.frameMedicationForms.showNurseNotes();
		System.out.println("Select: " + selectedRow);
		// }
	}
}