package medrex.client.medicationcart;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.medication.nurseMedicationNotes.PanelNurseMedicationNotes;
import medrex.client.utils.MsgBoxTouchScreen;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.MedicationPhyOrdersListCell;
import medrex.client.utils.controls.TouchscreenList;
import medrex.commons.vo.medication.MedicationTreatmentForm;
import medrex.commons.vo.medication.NurseMedicationNotesForm;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxPanel;

public class PanelMedicationPhysicianOrders extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -674967532762261307L;
	// current list
	private TouchscreenList currentPhyOrders;
	// history list
	private TouchscreenList historyPhyOrders;
	private JButton btnPrevious;
	private JButton btnClose;
	private JLabel chooseMedicineLabel;
	private JLabel lblResidentName;
	private JPanel panel;
	private Date currentDate;
	private ArrayList<Object[]> elementsCurrent;
	private ArrayList<Object[]> elementsHistory;
	private int lastNotesForm;
	private int firstEmptyRow;

	public PanelMedicationPhysicianOrders() {
		super();
		// Global.panelMedication = this;
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
		chooseMedicineLabel.setText("Physician Orders");
		chooseMedicineLabel.setBounds(10, 78, 921, 51);
		panel.add(chooseMedicineLabel);

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

		btnPrevious = new JButton();
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameMedicationForms.showMedication();
			}
		});
		btnPrevious.setIcon(new ImageIcon("img\\previous.gif"));
		btnPrevious.setText("");
		btnPrevious.setBounds(817, 10, 54, 54);
		panel.add(btnPrevious);

		final JSplitPane splitPane = new JSplitPane();
		splitPane.setOpaque(true);
		splitPane.setLastDividerLocation(-1);
		splitPane.setDoubleBuffered(false);
		splitPane.setDividerLocation(220);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setBounds(0, 135, 941, 453);
		panel.add(splitPane);

		historyPhyOrders = new TouchscreenList();
		historyPhyOrders.setLayout(null);
		splitPane.setLeftComponent(historyPhyOrders);

		currentPhyOrders = new TouchscreenList();
		currentPhyOrders
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(final PropertyChangeEvent evt) {
						if (evt.getPropertyName().equalsIgnoreCase(
								"ListDoubleClicked")) {
							Object curItem = evt.getNewValue();
							if (curItem instanceof Object[]) {
								Object[] curItems = (Object[]) curItem;
								PhysicianOrderForm3Row refPhyOrder = (PhysicianOrderForm3Row) curItems[0];
								NurseMedicationNotesFormRow refNurNotes = (NurseMedicationNotesFormRow) curItems[2];
								System.out.println(curItems[1]);
								Global.currentMedicationPhyOrder = refPhyOrder;
								Global.currentMedicationNurNotes = refNurNotes;
								Global.frameMedicationForms.showNurseNotes();
							} else
								System.out.println(curItem);
						}
					}
				});
		currentPhyOrders.setOpaque(true);
		currentPhyOrders.setLayout(null);
		splitPane.setRightComponent(currentPhyOrders);
		final MedicationPhyOrdersListCell medicationPhyOrdersListCell = new MedicationPhyOrdersListCell();
		currentPhyOrders.setCellRenderer(medicationPhyOrdersListCell);
		historyPhyOrders.setCellRenderer(medicationPhyOrdersListCell);

		final JButton doneButton = new JButton();
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (elementsCurrent.size() > 0) {
					MsgBoxTouchScreen.ShowPrompt(
							"Please go through all medicines!!!",
							"Physician Orders");
				} else {
					Global.frameMedicationForms.showMedication();
				}
			}
		});
		doneButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		doneButton.setBorder(new LineBorder(Color.BLUE, 5, false));
		doneButton.setText("Done");
		doneButton.setBounds(215, 594, 245, 84);
		panel.add(doneButton);

		final JButton declineAllButton = new JButton();
		declineAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (elementsCurrent.size() > 0) {
					String nurseReasonNotes = "";
					FrameMedicationNotes fNotes = new FrameMedicationNotes();
					fNotes.setVisible(true);
					nurseReasonNotes = fNotes.getNurseNotes();
					if (!nurseReasonNotes.equalsIgnoreCase("")) {
						Iterator<Object[]> i = elementsCurrent.iterator();
						while (i.hasNext()) {
							Object[] o = i.next();
							save: {
								PhysicianOrderForm3Row refPhy = (PhysicianOrderForm3Row) o[0];
								NurseMedicationNotesFormRow ref = (NurseMedicationNotesFormRow) o[2];
								ref.setReason(nurseReasonNotes);
								ref.setResult("Declined");
								ref.setDateRecord(currentDate);
								ref
										.setTimeRecord(TimeStrComparator.TIME_FORMATTER
												.format(currentDate));
								ref.setDrugStrength(refPhy.getPhyMedication()
										+ " - " + refPhy.getPhyDosage() + " - "
										+ refPhy.getPhyFrequency());
								System.out.println("Before save: Form:"
										+ ref.getFormSerial() + ", Row:"
										+ ref.getRowSerial());
								try {
									MedrexClientManager
											.getInstance()
											.insertOrUpdateNurseMedicationNotesFormRow(
													ref);
								} catch (Exception e1) {
									e1.printStackTrace();
								}
							}
						}
						// Global.frameResidentDesktopMedication.dispose();
						// Global.frameMedicationForms.showPhysicianOrders();
						fillCombos();
					}
				}
			}
		});
		declineAllButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		declineAllButton.setBorder(new LineBorder(Color.RED, 5, false));
		declineAllButton.setText("Decline All");
		declineAllButton.setBounds(481, 594, 245, 84);
		panel.add(declineAllButton);

		fillCombos();
	}

	public void fillCombos() {
		// System.err.println("Current Residence Key: " +
		// Global.currentResidenceKey);

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
				List phyRows = MedrexClientManager.getInstance()
						.getPhysicianOrderForm3Rows(ref.getSerial());

				for (int j = 0; j < phyRows.size(); j++) {
					// System.out.println("loop" + j);
					PhysicianOrderForm3Row refRow = (PhysicianOrderForm3Row) phyRows
							.get(j);
					// PhysicianOrderForm3Row refRow =
					// MedrexClientManager.getInstance().getPhysicianOrderForm3Row(ref.getSerial(),
					// j, currentDate);
					if (refRow != null) {
						if (refRow.getPhyOrderDate() != null
								&& refRow.getPhyDcDate() != null) {
							if (refRow.getPhyOrderDate().compareTo(currentDate) <= 0
									&& currentDate.compareTo(refRow
											.getPhyDcDate()) <= 0) {
								if (isCorrectMedicine(
										Integer.parseInt(refRow
												.getPhyFrequency()),
										TimeStrComparator.TIME_FORMATTER
												.format(Global.currentMedicationTimeCurr))) {
									phyOrders.add(refRow);
									// System.out.println(refRow.getPhyOrderDate());
								}
							}
						}
						// System.out.println(refRow);
					}
					if (phyOrders.size() <= medNotes.size()) {
						// break;
					}
				}
			}
			// System.out.println("Phy: " + phyOrders.size());
			if (phyOrders.size() > 0) {
				l = null;
				i = null;
				l = MedrexClientManager.getInstance()
						.getNurseMedicationNotesForms(
								Global.currentResidenceKey);
				if (l == null || l.size() == 0) {
					PanelNurseMedicationNotes ref = new PanelNurseMedicationNotes();
					Global.currentNurseMedicationNotesFormKey = 0;
					ref.doSave();
					MedicationTreatmentForm medFormObj = new MedicationTreatmentForm();
					medFormObj.setResidentId(Global.currentResidenceKey);
					medFormObj
							.setFormId(Global.currentNurseMedicationNotesFormKey);
					medFormObj.setDateCreated(currentDate);
					medFormObj.setFormType("Nurse Medication Notes");
					medFormObj.setLastModified(currentDate);
					medFormObj.setStatus("Incomplete");
					medFormObj.setUser(Global.currentUsers);
					MedrexClientManager.getInstance()
							.insertOrUpdateMedicationTreatmentForm(medFormObj);
					l = MedrexClientManager.getInstance()
							.getNurseMedicationNotesForms(
									Global.currentResidenceKey);
				}
				i = l.iterator();
				while (i.hasNext()) {
					NurseMedicationNotesForm ref = (NurseMedicationNotesForm) i
							.next();
					lastNotesForm = ref.getSerial();
					List medRows = MedrexClientManager.getInstance()
							.getNurseMedicationNotesFormRows(ref.getSerial());
					for (int j = 0; j < medRows.size(); j++) {
						NurseMedicationNotesFormRow refRow = (NurseMedicationNotesFormRow) medRows
								.get(j);
						// NurseMedicationNotesFormRow refRow =
						// MedrexClientManager.getInstance().getNurseMedicationNotesFormRow(ref.getSerial(),
						// j);
						if (refRow != null) {
							if (refRow.getFormSerial() != 0
									&& medNotes.size() < phyOrders.size()) {
								// System.out.println(refRow.getNurseMedicationNotesFormSerial()
								// + ", " +
								// refRow.getNurseMedicationNotesRowSerial());
								if (refRow.getDateRecord() != null
										&& (refRow.getTimeRecord() != null || !refRow
												.getTimeRecord()
												.equalsIgnoreCase(""))) {
									Date dTemp = TimeStrComparator
											.getStringToTime(refRow
													.getTimeRecord());
									// System.out.println("Row: " +
									// refRow.getNurseMedicationNotesRowSerial()
									// + " Curr: " +
									// Global.currentMedicationTimeCurr +
									// " Exact: " + dTemp + " Next: " +
									// Global.currentMedicationTimeNext);
									if (isCorrectNotes(refRow.getDateRecord(),
											dTemp,
											Global.currentMedicationTimeCurr,
											Global.currentMedicationTimeNext)) {
										medNotes.add(refRow);
									}
								}
								if (refRow.getDateRecord() == null
										&& (refRow.getTimeRecord() == null || refRow
												.getTimeRecord()
												.equalsIgnoreCase(""))) {
									medNotes.add(refRow);
									if (firstEmptyRow == 0) {
										firstEmptyRow = refRow.getRowSerial();
									}
								}
							}
						}
					}
				}
			}
			// System.out.println("Phy: " + phyOrders.size() + ", Nur: " +
			// medNotes.size());
			int size = phyOrders.size();
			elementsHistory = new ArrayList<Object[]>();
			elementsCurrent = new ArrayList<Object[]>();
			Iterator iPhy = null;
			iPhy = phyOrders.iterator();
			Iterator iNur = null;
			iNur = medNotes.iterator();
			int j = 0;
			for (j = 0; (j < size) && iPhy.hasNext(); j++) {
				PhysicianOrderForm3Row refPhy = (PhysicianOrderForm3Row) iPhy
						.next();
				NurseMedicationNotesFormRow refNur;
				if (iNur.hasNext()) {
					refNur = (NurseMedicationNotesFormRow) iNur.next();
				} else {
					refNur = new NurseMedicationNotesFormRow();
					refNur.setFormSerial(lastNotesForm);
					refNur.setRowSerial(firstEmptyRow);
				}
				Object[] element = new Object[] {
						refPhy,
						refPhy.getPhyMedication() + ", "
								+ refPhy.getPhyDosage(), refNur,
						getFormattedText(refNur) };
				if (refNur.getDateRecord() != null) {
					elementsHistory.add(element);
				} else {
					elementsCurrent.add(element);
				}
			}
			// elementsCurrent
			// elementsHistory

			currentPhyOrders.setListData(elementsCurrent.toArray());
			historyPhyOrders.setListData(elementsHistory.toArray());
			// System.out.println("Elements:" + elements.length);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean isCorrectMedicine(int freq, String timeSlot) {
		boolean res = false;
		String[] strArr = PanelMedicationDesktop.getTimeList(freq);
		// System.err.println("TimeList: ");
		// for(int i = 0; i < strArr.length; i++) {
		// System.err.println(strArr[i] + ", ");
		// }
		// System.out.println();
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equalsIgnoreCase(timeSlot)) {
				// return true;
				res = true;
				break;
			}
		}
		// return false;
		// System.err.println("isCorrMed: " + res + ", " + freq + ", " +
		// timeSlot);
		return res;
	}

	private boolean isCorrectNotes(Date nurDate, Date nurTime, Date cTime,
			Date nTime) {
		if (nurDate != null && nurTime != null) {
			if (nurDate.getDate() == cTime.getDate()) {

				if (cTime.getTime() <= nurTime.getTime() /*
														 * && nTime.getTime() >
														 * nurTime.getTime()
														 */) {
					// if(cTime.getTime() <= nurTime.getTime()) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * public static void main(String[] a) { Global.currentResidenceKey = 11;
	 * JFrame f = new JFrame(); f.add(new PanelMedicationPhysicianOrders());
	 * f.setUndecorated(false);
	 * f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	 * f.setVisible(true); }
	 */
	/*
	 * public void doSelect(int selectedRow) { int index = ((currentPage - 1)
	 * medicationsPerPage) + selectedRow; PhysicianOrderForm3Row value1 =
	 * (PhysicianOrderForm3Row) elements[index][0]; NurseMedicationNotesFormRow
	 * value2 = (NurseMedicationNotesFormRow) elements[index][1]; //if (value1
	 * != null) { if(Global.frameMedicationForms == null) {
	 * Global.frameMedicationForms = new FrameMedicationForms(); }
	 * Global.frameMedicationForms.panelMedicationNurseNotes.doUpdate(value1,
	 * value2); Global.frameMedicationForms.showNurseNotes();
	 * System.out.println("Select: " + selectedRow); //} }
	 */

	public String getFormattedText(NurseMedicationNotesFormRow refNurse) {
		SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy");
		String retStr = "<html><body>";
		if (refNurse.getDateRecord() != null) {
			retStr += "<font color=";
			retStr += refNurse.getResult().equalsIgnoreCase("Accepted") ? "#228b22"
					: "#ff0000";
			retStr += "/>";
			retStr += refNurse.getResult() + " on "
					+ df.format(refNurse.getDateRecord()) + " at "
					+ refNurse.getTimeRecord();
			retStr += "</font>";
		}
		retStr += "</body></html>";
		return retStr;
	}
}