package medrex.client.medicationcart;

//package medrex.client.medicationcart;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.beans.PropertyChangeEvent;
//import java.beans.PropertyChangeListener;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.SwingConstants;
//import javax.swing.Timer;
//import javax.swing.border.EtchedBorder;
//import javax.swing.border.LineBorder;
//
//import medrex.client.PanelImage;
//import medrex.client.clientManagar.MedrexClientManager;
//import medrex.client.constants.Global;
//import medrex.client.main.medication.nurseMedicationNotes.PanelNurseMedicationNotes;
//import medrex.client.utils.SwingUtils;
//import medrex.client.utils.controls.MedicationResidentListCell;
//import medrex.client.utils.controls.TouchscreenList;
//import medrex.commons.vo.medication.MedicationTreatmentForm;
//import medrex.commons.vo.medication.NurseMedicationNotesForm;
//import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
//import medrex.commons.vo.physicianOrders.PhysicianOrderForm3;
//import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
//import medrex.commons.vo.resident.ResidentMain;
//
//public class PanelMedicationDesktop extends JPanel {
//
//	private JPanel residentPanel;
//	private PanelImage residentImage;
//	private JLabel lblResidentRoomNo;
//	private JLabel lblResidentName;
//	private TouchscreenList historyList;
//	private TouchscreenList currentList;
//	private Date currentDate;
//	private List<Object[]> newElements;
//	private List<ResidentMain> residentList;
//	private Map<Integer, Object[]> historyMap;
//	private JLabel hhmmAmLabel;
//
//	private static final long serialVersionUID = 1L;
//
//	public PanelMedicationDesktop() {
//		super();
////		Global.panelMedicationDesktop = this;
//		currentDate = MedrexClientManager.getServerTime();
//		setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
//		setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
//		setBackground(new Color(176, 224, 230));
//		setLayout(null);
//
//		final JPanel panel = new JPanel();
//		panel.setLayout(null);
//		panel.setOpaque(false);
//		panel.setBounds(10, 10, 959, 614);
//		// panel.setSize(800, 614);
//		panel.setBounds(SwingUtils.centerRectangle(this.getBounds(), panel
//				.getBounds()));
//		add(panel);
//
//		final MedicationResidentListCell medicationResidentListCell = new MedicationResidentListCell();
//
//		final JPanel panel_2 = new JPanel();
//		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
//		panel_2.setBackground(Color.WHITE);
//		panel_2.setLayout(null);
//		panel_2.setBounds(0, 330, 704, 30);
//		panel.add(panel_2);
//
//		final JLabel currentTimeLabel = new JLabel();
//		currentTimeLabel.setFont(new Font("", Font.BOLD, 18));
//		currentTimeLabel.setText("Current Time:");
//		currentTimeLabel.setBounds(10, 0, 338, 30);
//		panel_2.add(currentTimeLabel);
//
//		hhmmAmLabel = new JLabel();
//		hhmmAmLabel.setFont(new Font("", Font.BOLD, 18));
//		hhmmAmLabel.setHorizontalAlignment(SwingConstants.RIGHT);
//		hhmmAmLabel.setText("00 : 00 AM");
//		hhmmAmLabel.setBounds(347, 0, 347, 30);
//		panel_2.add(hhmmAmLabel);
//
//		final JLabel medicationCartLabel = new JLabel();
//		medicationCartLabel.setFont(new Font("", Font.BOLD, 48));
//		medicationCartLabel.setText("Medication Cart");
//		medicationCartLabel.setBounds(10, 10, 502, 65);
//		panel.add(medicationCartLabel);
//
//		final JButton backButton = new JButton();
//		backButton.setOpaque(true);
//		backButton.addActionListener(new ActionListener() {
//			public void actionPerformed(final ActionEvent e) {
//				Global.frameResidentDesktopMedication.openMainOptions();
//			}
//		});
//		backButton.setIcon(new ImageIcon("img\\previous.gif"));
//		backButton.setText("");
//		backButton.setBounds(893, 10, 56, 56);
//		panel.add(backButton);
//
//		currentList = new TouchscreenList();
//		currentList.addPropertyChangeListener(new PropertyChangeListener() {
//			public void propertyChange(final PropertyChangeEvent evt) {
//				if (evt.getPropertyName().equalsIgnoreCase(
//						"ListSelectionChanged")) {
//					Object selObj = evt.getNewValue();
//					if (selObj instanceof Object[]) {
//						Object[] selValue = (Object[]) selObj;
//						updateResident(selValue);
//						Date[] timeValues = (Date[]) selValue[2];
//						Global.currentMedicationTimePrev = timeValues[0];
//						Global.currentMedicationTimeCurr = timeValues[1];
//						Global.currentMedicationTimeNext = timeValues[2];
//					} else {
////						System.out.println(selObj);
//					}
//				} else if (evt.getPropertyName().equalsIgnoreCase(
//						"ListDoubleClicked")) {
//					Object selObj = evt.getNewValue();
//					if (selObj instanceof Object[]) {
//						Object[] selValue = (Object[]) selObj;
//						updateResident(selValue);
//						Date[] timeValues = (Date[]) selValue[2];
//						Global.currentMedicationTimePrev = timeValues[0];
//						Global.currentMedicationTimeCurr = timeValues[1];
//						Global.currentMedicationTimeNext = timeValues[2];
//
//						if (Global.frameMedicationForms == null) {
//							Global.frameMedicationForms = new FrameMedicationForms();
//						}
//						Global.frameMedicationForms.showPhysicianOrders();
//						Global.frameResidentDesktopMedication.dispose();
//					} else {
////						System.out.println(selObj);
//					}
//				}
//			}
//		});
//		currentList.setCellRenderer(medicationResidentListCell);
//		currentList.setBounds(0, 363, 704, 250);
//		panel.add(currentList);
//
//		historyList = new TouchscreenList();
//		historyList.setCellRenderer(medicationResidentListCell);
//		historyList.setBounds(0, 78, 704, 250);
//		panel.add(historyList);
//
//		residentPanel = new JPanel();
//		residentPanel.setOpaque(false);
//		residentPanel.setLayout(null);
//		residentPanel.setBounds(710, 78, 239, 535);
//		panel.add(residentPanel);
//
//		lblResidentName = new JLabel();
//		lblResidentName.setFont(new Font("", Font.BOLD, 16));
//		lblResidentName.setText("");
//		lblResidentName.setBounds(10, 253, 219, 22);
//		residentPanel.add(lblResidentName);
//
//		final JLabel roomNumLabel = new JLabel();
//		roomNumLabel.setFont(new Font("", Font.BOLD, 16));
//		roomNumLabel.setText("Room No. :");
//		roomNumLabel.setBounds(10, 293, 105, 16);
//		residentPanel.add(roomNumLabel);
//
//		lblResidentRoomNo = new JLabel();
//		lblResidentRoomNo.setHorizontalAlignment(SwingConstants.RIGHT);
//		lblResidentRoomNo.setFont(new Font("", Font.BOLD, 14));
//		lblResidentRoomNo.setText("");
//		lblResidentRoomNo.setBounds(121, 294, 108, 16);
//		residentPanel.add(lblResidentRoomNo);
//
//		/*
//		 * final JButton medicationButton = new JButton();
//		 * medicationButton.setBorder(new BevelBorder(BevelBorder.RAISED));
//		 * medicationButton.setFont(new Font("Tahoma", Font.BOLD, 22));
//		 * medicationButton.setText("Medication");
//		 * medicationButton.setBounds(10, 10, 219, 237);
//		 * panel_1.add(medicationButton);
//		 */
//
//		residentImage = new PanelImage();
//		residentImage.setArc(2f);
//		residentImage.setCurvedView(true);
//		residentImage.setBorder(new LineBorder(Color.black, 2, true));
//		residentImage.setBounds(10, 10, 219, 237);
//
//		residentPanel.add(residentImage);
//		historyMap = new HashMap<Integer, Object[]>();
//
//		fillCombos();
//
//		final Timer timer = new Timer( 60 * 1000, new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				fillCombos();
//			}
//		});
//		timer.setRepeats(true);
//		timer.setCoalesce(true);
//		// timer.setInitialDelay((60 - MedrexClientManager.getServerTime().getSeconds()) * 1000);
//		timer.start();
//	}
//
//	public void fillCombos() {
//		residentList = new ArrayList<ResidentMain>();
//		List timeList = new ArrayList();
//
//		List phyOrders = new ArrayList();
//		List medNotes = new ArrayList();
//		List l = null;
//		try {
//			l = MedrexClientManager.getInstance().getPhysicianOrderForm3s();
//			Iterator i = l.iterator();
//			// System.out.println(l.size());
//			while (i.hasNext()) {
//				PhysicianOrderForm3 ref = (PhysicianOrderForm3) i.next();
//				List phyRows = MedrexClientManager.getInstance().getPhysicianOrderForm3Rows(ref
//						.getSerial());
//				ResidentMain residentMain = MedrexClientManager.getInstance().getResident(ref
//						.getResidentId());
//				// System.err.println("MedDesktop current resident: " +
//				// ref.getResidentId());
//				ArrayList tempTimeList = new ArrayList();
//
//				if (residentMain != null) {
//					residentList.add(residentMain);
//				}
//				// System.out.println(ref.getSerial());
//				for (int j = 0; j < phyRows.size(); j++) {
//					// System.out.println("loop" + j);
//					PhysicianOrderForm3Row refRow = (PhysicianOrderForm3Row) phyRows
//							.get(j);
//					// PhysicianOrderForm3Row refRow =
//					// MedrexClientManager.getInstance().getPhysicianOrderForm3Row(ref.getSerial(),
//					// j, currentDate);
//					if (refRow != null) {
//						if (refRow.getPhyOrderDate() != null
//								&& refRow.getPhyDcDate() != null) {
//							if (refRow.getPhyOrderDate().compareTo(currentDate) <= 0
//									&& currentDate.compareTo(refRow
//											.getPhyDcDate()) <= 0) {
//								tempTimeList.add(getTimeList(Integer
//										.parseInt(refRow.getPhyFrequency())));
//								// System.err.println("Freq: " +
//								// refRow.getPhyFrequency());
//								// phyOrders.add(refRow);
//								// System.out.println(refRow.getPhyOrderDate());
//							}
//						}
//						// System.out.println(refRow);
//					}
//				}
//				timeList.add(getMergedTimeList(tempTimeList.toArray()));
//				// ////////////////////////////////////////////////////////////////////////
//			}
//			//
//			Object[] obj=doGetHistory();
//			historyList.setListData(obj);
//
//			Iterator<ResidentMain> rItr = residentList.iterator();
//			newElements = new ArrayList<Object[]>();
//			int count = 0;
//			while (rItr.hasNext()) {
//				ResidentMain res = rItr.next();
//				// System.out.println(res.getSerial());
//				Date[] currentTimeSelection = getCurrentTimeSelection((Object[]) timeList
//						.get(count));
//				Object[] resHistory = historyMap.get(res.getSerial());
//				if (currentTimeSelection == null
//						|| currentTimeSelection[1] == null) {
//					count++;
//					continue;
//				}
//				if (resHistory != null) {
//					boolean skip = !isInHistory(currentTimeSelection,
//							(Date[]) resHistory[2]);
//					// System.out.println(boolCheck);
//					if (skip) {
//						count++;
//						continue;
//					} else {
//						Object[] ele = new Object[4];
//						ele[0] = res;
//						ele[1] = res.getUserPass() + ", " + res.getUserName();
//						ele[2] = currentTimeSelection;
//						ele[3] = getHighlightedTimeSelection(currentTimeSelection);
//						newElements.add(ele);
//					}
//				} else {
//					Object[] ele = new Object[4];
//					ele[0] = res;
//					ele[1] = res.getUserPass() + ", " + res.getUserName();
//					ele[2] = currentTimeSelection;
//					ele[3] = getHighlightedTimeSelection(currentTimeSelection);
//					newElements.add(ele);
//				}
//				count++;
//			}
//
//			currentList.setListData(newElements.toArray());
//			if (newElements.size() > 0) {
//				updateResident(null);
//				currentList.setSelectedItem(newElements.get(0));
//				residentPanel.setEnabled(true);
//			} else {
//				residentPanel.setEnabled(false);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		currentDate = MedrexClientManager.getServerTime();
//		hhmmAmLabel.setText(TimeStrComparator.TIME_FORMATTER
//				.format(currentDate));
//	}
//
//	public Object[] doGetHistory() {
//		List<Object[]> historyNotes = new ArrayList<Object[]>();
//		historyMap.clear();
//		List l = null;
//		Iterator<NurseMedicationNotesForm> i = null;
//		try {
//			l = MedrexClientManager.getInstance().getNurseMedicationNotesForms();
//			if (l == null) {
//				PanelNurseMedicationNotes ref = new PanelNurseMedicationNotes();
//				Global.currentNurseMedicationNotesFormKey = 0;
//				ref.doSave();
//				MedicationTreatmentForm medFormObj = new MedicationTreatmentForm();
//				medFormObj.setResidentId(Global.currentResidenceKey);
//				medFormObj.setFormId(Global.currentNurseMedicationNotesFormKey);
//				medFormObj.setDateCreated(currentDate);
//				medFormObj.setFormType("Nurse Medication Notes");
//				medFormObj.setLastModified(currentDate);
//				medFormObj.setStatus("Incomplete");
//				medFormObj.setUser(Global.currentUsers);
//				MedrexClientManager.getInstance()
//						.insertOrUpdateMedicationTreatmentForm(medFormObj);
//				l = MedrexClientManager.getInstance().getNurseMedicationNotesForms();
//			}
//			i = l.iterator();
//			String result=null;
//			while (i.hasNext()) {
//				Object[] historyRow = new Object[4];
//				NurseMedicationNotesForm ref = (NurseMedicationNotesForm) i
//						.next();
//				ResidentMain res = MedrexClientManager.getInstance().getResident(ref
//						.getResidentId());
//				historyRow[0] = res;
//				historyRow[1] = res.getUserPass() + ", " + res.getUserName();
//				Date[] timeList = new Date[3];
//				List nurseMedicationRowList = MedrexClientManager.getInstance()
//						.getNurseMedicationNotesFormRow(ref.getSerial(),
//								currentDate);
//				Iterator iRow = nurseMedicationRowList.iterator();
//				int cntr = 3;
//				while (iRow.hasNext() && cntr > 0) {
//					NurseMedicationNotesFormRow refRow = (NurseMedicationNotesFormRow) iRow
//							.next();
////					System.out.println("Acceped Or Denied"+refRow.getResult());
//					result=refRow.getResult();
//					if (refRow != null) {
//						--cntr;
//						Date tmpDate = TimeStrComparator.getStringToTime(refRow
//								.getTimeRecord());
//						if (cntr < 2) {
//							if (timeList[cntr + 1].compareTo(tmpDate) > 0) {
//								timeList[cntr] = tmpDate;
//							} else {
//								timeList[cntr] = null;
//								cntr++;
//							}
//						} else {
//							timeList[cntr] = tmpDate;
//						}
//					}
//				}
//				ArrayList tmpTimeList = new ArrayList();
//				for (int k = timeList.length; k > 0; k--) {
//					if (timeList[k - 1] != null) {
//						tmpTimeList.add(timeList[k - 1]);
//					}
//				}
//				timeList = (Date[]) tmpTimeList.toArray(new Date[3]);
//				historyRow[2] = timeList;
//				historyRow[3] = getFormattedTimeSelection(timeList);
//				List listForms=MedrexClientManager.getInstance().getNurseMedicationNotesForms();
//				Iterator iForm=listForms.iterator();
//				int formId=0;
//				while(iForm.hasNext()){
//					NurseMedicationNotesForm form=(NurseMedicationNotesForm)iForm
//					.next();
//					formId=form.getSerial();
//				}
////				System.out.println("Form Id of Medication Notes is"+formId);
//				List listNotes = MedrexClientManager.getInstance().getNurseMedicationNotesFormRows(formId);
////				System.out.println("Size of List of Medication Notes Rows"+listNotes.size());
////				System.out.println("NoOfMedicationPanel"+Global.NoOfMedicationPanel);
////				&& !result.equalsIgnoreCase("Accepted")
////				&& (Global.NoOfMedicationPanel==listNotes.size())
////				if(Global.NoOfMedicationPanel==listNotes.size()){
////					historyNotes.add(historyRow);					
////					historyMap.put(res.getSerial(), historyRow);
////				}
//				if (!(timeList[0] == null && timeList[1] == null && timeList[2] == null)) {
//					historyNotes.add(historyRow);					
//					historyMap.put(res.getSerial(), historyRow);
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			return historyNotes.toArray();
//		}
//	}
//
//	public boolean isInHistory(Date[] curTimeValues, Date[] hisTimeValues) { /* TODO */
//		Date preTime = curTimeValues[0];
//		Date curTime = curTimeValues[1];
//		Date nexTime = curTimeValues[2];
//		Date hisTime = hisTimeValues[0];
//		if (curTime != null && hisTime != null) {
//			if (nexTime != null) {
//				// System.out.println("1:" + (curTime.getTime() <
//				// hisTime.getTime()) + ", 2:" + (hisTime.getTime() <
//				// nexTime.getTime()));
//				if (curTime.getTime() <= hisTime.getTime()
//						&& hisTime.getTime() <= nexTime.getTime()) {
//					return false;
//				}
//			} else if (preTime != null) {
//				if (curTime.getTime() >= hisTime.getTime()
//						&& hisTime.getTime() >= preTime.getTime()) {
//					return false;
//				}
//			} else {
//				if (curTime.getTime() >= hisTime.getTime()
//						&& (preTime != null || nexTime != null)) {
//					return false;
//				}
//				if (curTime.getTime() <= hisTime.getTime()
//						&& (preTime == null || nexTime == null)) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//
//	public void updateResident(Object[] selValue) {
//		if (selValue != null) {
//			ResidentMain res = (ResidentMain) selValue[0];
//			Global.currentResidenceKey = res.getSerial();
//			lblResidentName.setText((String) selValue[1]);
//			lblResidentRoomNo.setText(res.getRoom());
//			residentImage.repaint();
//		} else {
//			Global.currentResidenceKey = 0;
//			lblResidentName.setText("");
//			lblResidentRoomNo.setText("");
//			residentImage.repaint();
//		}
//	}
//
//	public static String[] getTimeList(int frequency) {
//		switch (frequency) {
//		case 1:
//			return new String[] { "01:30 PM" };
//		case 2:
//			return new String[] { "08:30 AM", "10:30 PM" };
//		case 3:
//			return new String[] { "08:30 AM", "01:30 PM", "10:30 PM" };
//		case 4:
//			return new String[] { "06:00 AM", "12:00 PM", "06:00 PM",
//					"12:00 AM" };
//		case 5:
//			return new String[] { "06:00 AM", "10:30 AM", "03:00 PM",
//					"07:30 PM", "12:00 AM" };
//		case 6:
//			return new String[] { "06:00 AM", "10:00 AM", "02:00 PM",
//					"06:00 PM", "10:00 PM", "02:00 AM" };
//		case 7:
//			return new String[] { "06:00 AM", "09:30 AM", "01:00 PM",
//					"04:30 PM", "08:00 PM", "11:30 PM", "03:00 AM" };
//		case 8:
//			return new String[] { "06:00 AM", "09:00 AM", "12:00 PM",
//					"03:00 PM", "06:00 PM", "09:00 PM", "12:00 AM", "03:00 AM" };
//		case 9:
//			return new String[] { "06:00 AM", "08:30 AM", "11:00 AM",
//					"01:30 PM", "04:00 PM", "06:30 PM", "09:00 PM", "11:30 PM",
//					"01:00 AM" };
//		case 10:
//			return new String[] { "06:00 AM", "08:00 AM", "10:00 AM",
//					"12:00 PM", "02:00 PM", "04:00 PM", "06:00 PM", "08:00 PM",
//					"10:00 PM", "12:00 AM" };
//		}
//		return null;
//	}
//
//	public Object[] getMergedTimeList(Object[] fList) {
//		List<String> mergedList = new ArrayList<String>();
//		for (Object tList : fList) {
//			for (String time : (String[]) tList) {
//				mergedList.add(time);
//			}
//		}
//		Collections.sort(mergedList, new TimeStrComparator());
//		for (int i = 0; i < mergedList.size(); i++) {
//			if (i > 0) {
//				if (mergedList.get(i).equalsIgnoreCase(mergedList.get(i - 1))) {
//					mergedList.remove(i);
//					i--;
//				}
//			}
//		}
//		// for(int i = 0; i < mergedList.size(); i++) {
//		// System.err.println(mergedList.get(i));
//		// }
//		return mergedList.toArray();
//	}
//
//	private Date[] getCurrentTimeSelection(Object[] timeList) {
//		Date curDate;
//		Date[] dateArr = new Date[3];
//		// System.out.println("MerTimeList: ");
//		// for(int i = 0; i < timeList.length; i++) {
//		// System.out.println(timeList[i]);
//		// }
//		if (timeList.length == 1) {
//			int j = 1;
//			curDate = TimeStrComparator.getStringToTime((String) timeList[0]);
//			if (currentDate.getTime() <= curDate.getTime()) {
//				j = 2;
//			}
//			dateArr[j] = curDate;
//
//			return dateArr;
//		} else {
//			for (int i = 0; i < timeList.length; i++) {
//				curDate = TimeStrComparator
//						.getStringToTime((String) timeList[i]);
//				if (currentDate.getTime() <= curDate.getTime()) {
//					int j = i - 1;
//					if (j - 1 > 0) {
//						dateArr[0] = TimeStrComparator
//								.getStringToTime((String) timeList[j - 1]);
//					}
//					dateArr[1] = TimeStrComparator
//							.getStringToTime((String) timeList[j]);
//					if (j + 1 < timeList.length) {
//						dateArr[2] = TimeStrComparator
//								.getStringToTime((String) timeList[j + 1]);
//					}
//					// return dateArr;
//					break;
//				}
//			}
//		}
//		// System.out.println(dateArr[0] + ", " + dateArr[1] + ", " +
//		// dateArr[2]);
//		return dateArr;
//	}
//
//	private String getHighlightedTimeSelection(Date[] dateArr) {
//		switch (dateArr.length) {
//		case 3: {
//			String tmp = "<html><body>";
//			if (dateArr[0] != null) {
//				tmp += TimeStrComparator.TIME_FORMATTER.format(dateArr[0]);
//			}
//			if (dateArr[0] != null && dateArr[1] != null) {
//				tmp += " | ";
//			}
//			if (dateArr[1] != null) {
//				tmp += "<font color='#ff0000'>"
//						+ TimeStrComparator.TIME_FORMATTER.format(dateArr[1])
//						+ "</font>";
//			}
//			if (dateArr[1] != null && dateArr[2] != null) {
//				tmp += " | ";
//			}
//			if (dateArr[2] != null) {
//				tmp += TimeStrComparator.TIME_FORMATTER.format(dateArr[2]);
//			}
//			tmp += "</body></html>";
//			return tmp;
//		}
//		}
//		return "";
//	}
//
//	private String getFormattedTimeSelection(Date[] dateArr) {
//		switch (dateArr.length) {
//		case 3: {
//			String tmp = "<html><body>";
//			if (dateArr[0] != null) {
//				tmp += TimeStrComparator.TIME_FORMATTER.format(dateArr[0]);
//			}
//			if (dateArr[0] != null && dateArr[1] != null) {
//				tmp += " | ";
//			}
//			if (dateArr[1] != null) {
//				tmp += TimeStrComparator.TIME_FORMATTER.format(dateArr[1]);
//			}
//			if (dateArr[1] != null && dateArr[2] != null) {
//				tmp += " | ";
//			}
//			if (dateArr[2] != null) {
//				tmp += TimeStrComparator.TIME_FORMATTER.format(dateArr[2]);
//			}
//			tmp += "</body></html>";
//			return tmp;
//		}
//		}
//		return "";
//	}
//}
//
////class TimeStrComparator implements Comparator {
////	public static SimpleDateFormat TIME_FORMATTER = new SimpleDateFormat(
////			"hh:mm a");
////
////	// +1 if a > b
////	// 0 if a == b
////	// -1 if a < b
////	public final int compare(Object a, Object b) {
////		Date aDate = getStringToTime((String) a);
////		Date bDate = getStringToTime((String) b);
////		if (aDate.getTime() == bDate.getTime()) {
////			return 0;
////		} else
////			return (aDate.getTime() > bDate.getTime()) ? 1 : -1;
////	} // end compare
////
////	public static Date getStringToTime(String str) {
////		if (str.length() == 8) {
////			Date dateRef = MedrexClientManager.getServerTime();
////			int hrs = Integer.parseInt(str.substring(0, 2));
////			if (hrs == 12) {
////				hrs = 0;
////			}
////			if (str.charAt(6) == 'P') {
////				hrs += 12;
////			}
////			dateRef.setHours(hrs);
////			dateRef.setMinutes((Integer.parseInt(str.substring(3, 5))));
////			dateRef.setSeconds(0);
////			return dateRef;
////		}
////		return null;
////	}
////} // end class StringComparator