package medrex.client.medicationcart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import medrex.client.FrameLogin;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInfoHoriz;
import medrex.client.main.PanelResidentInformation;
import medrex.client.main.medication.nurseMedicationNotes.PanelNurseMedicationNotes;
import medrex.client.utils.controls.DateTimePanel;
import medrex.client.utils.controls.MedicationResidentList;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.medication.MedicationTreatmentForm;
import medrex.commons.vo.medication.NurseMedicationNotesForm;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.frameFactory.FrameFactory;

public class PanelMedicationDesktop extends JPanel {
	private JLabel lastLoginLabel;
	private static final long serialVersionUID = 1L;

	public static final String DEFAULT = "DEFAULT";
	public static final String ADMISSION = "ADMISSION";
	public static final String DISCHARGE = "DISCHARGE";
	public static final String SIGN_IN = "SIGN_IN";
	public static final String SIGN_OUT = "SIGN_OUT";
	public static final String HISTORY = "HISTORY";

	private static HashMap<String, JPanel> cards;

	private JPanel defaultPanel;
	private JPanel topTabArea;
	private JPanel topTabsPanel;
	private JPanel topBlueStrip;
	private ResidentMain resident;
	private List<ResidentMain> residentList;

	// private CardLayout defaultCardLayout;
	// private JPanel currentCard;

	private PanelResidentInfoHoriz panelResidentInfo;
	private MedicationResidentList currentList;
	private MedicationResidentList historyList;
	private PanelResidentInformation panelResiInfo;
	private Date currentDate;
	private Map<Integer, Object[]> historyMap;
	private List<Object[]> newElements;

	public PanelMedicationDesktop() {

		super();
		Global.panelMedicationDesktop = this;
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		System.out.println("++++++++++++++++++++++++++");
		setLayout(null);
		// setLayout(new BorderLayout());
		setPreferredSize(new Dimension(868, 768));
		currentDate = MedrexClientManager.getServerTime();
		cards = new HashMap<String, JPanel>();
		// final MedicationResidentChooseListCell medicationResidentListCell =
		// new MedicationResidentChooseListCell();
		// ////////////////////////////////////////////////////
		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(0, 0));
		topTabArea.setOpaque(false);
		topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));
		// topTabArea.add(topTabsPanel, BorderLayout.SOUTH);

		final JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(9, 9, 9, 9));
		panel.setLayout(new BorderLayout());
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(556, 120));
		topTabArea.add(panel, BorderLayout.EAST);

		panelResidentInfo = new PanelResidentInfoHoriz();
		panelResidentInfo.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		panelResidentInfo.setOpaque(false);
		panel.add(panelResidentInfo, BorderLayout.CENTER);

		final DateTimePanel timerPanel = new DateTimePanel();
		timerPanel.setFont(GuiModes.CHANGE_SCREEN.getControlFont().deriveFont(
				18f).deriveFont(Font.PLAIN));
		timerPanel.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		timerPanel.setPreferredSize(new Dimension(150, 100));
		panel.add(timerPanel, BorderLayout.WEST);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(new GridLayout(0, 2));
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 138, 868, 38);
		add(topBlueStrip);

		lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		lastLoginLabel.setText("<html><b>Welcome </b>"
				+ Global.currentUserLastName + ", "
				+ Global.currentUserFirstName);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		topBlueStrip.add(lastLoginLabel);

		final JLabel logLabel = new JLabel();
		logLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				(new ControllerUserLogon()).logoutUpdate();
				FrameFactory.closeAll();
				FrameLogin frame = (FrameLogin) FrameFactory
						.createWindowOfType(FrameLogin.class);
				Global.currentMainTab = 1;
				frame.setVisible(true);
			}
		});
		logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		logLabel.setForeground(Color.WHITE);
		logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		logLabel.setText("Log off       ");
		topBlueStrip.add(logLabel);
		// /////////////////////////////////////////////
		// defaultCardLayout = new CardLayout();

		defaultPanel = new JPanel();
		defaultPanel.setLayout(null);
		// defaultPanel.setLayout(defaultCardLayout);
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 8));
		defaultPanel.setOpaque(false);
		defaultPanel.setBounds(0, 176, 868, 592);
		defaultPanel.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				// doUpdate();
			}
		});
		add(defaultPanel);

		panelResiInfo = new PanelResidentInformation();
		panelResiInfo.setForeground(new Color(5, 65, 94));
		panelResiInfo.setBounds(795, 72, 40, 367);
		defaultPanel.add(panelResiInfo);

		historyList = new MedicationResidentList();
		// residentList.setListData(new String[] {"BEVAN MICHAEL",
		// "GILCHRIST ADAM", "BEVAN MICHAEL", "GILCHRIST ADAM", "BEVAN MICHAEL",
		// "GILCHRIST ADAM"});
		historyList.getJListComponent().setForeground(new Color(5, 65, 94));
		historyList.getJListComponent().setBackground(
				new Color(206, 221, 224, 250));
		historyList.getJListComponent().setFont(
				new Font("Dialog", Font.BOLD, 16));
		historyList.setBounds(173, 72, 616, 164);
		historyList.setPreferredSize(historyList.getBounds().getSize());
		// historyList.setCellRenderer(medicationResidentListCell);
		historyList.setCellRenderer(historyList.new JxListCellRenderer() {
			@Override
			protected String getLeftValue(Object value) {
				if (value instanceof Object[]) {
					Object values[] = (Object[]) value;
					if (values[1] != null) {
						return (String) values[1];
					}
				}
				return super.getLeftValue(value);
			}

			@Override
			protected String getRightValue(Object value) {
				if (value instanceof Object[]) {
					Object values[] = (Object[]) value;
					if (values[3] != null) {
						return (String) values[3];
					}
				}
				return super.getRightValue(value);
			}
		});
		// historyList.getJListComponent().addListSelectionListener(
		// new ListSelectionListener() {
		// public void valueChanged(ListSelectionEvent e) {
		// if (!e.getValueIsAdjusting()) {
		// ResidentMain resi = (ResidentMain) historyList
		// .getJListComponent().getSelectedValue();
		// panelResiInfo.setResident(resi);
		// } else {
		// panelResiInfo.setResident(null);
		// }
		// // nextButton.setVisible(panelResiInfo.isVisible());
		// }
		// });
		// historyList.getJListComponent().addMouseListener(new MouseAdapter() {
		// public void mouseClicked(MouseEvent e) {
		// if (e.getClickCount() == 1) {
		// doNext();
		// }
		// }
		//
		// public void mouseReleased(MouseEvent arg0) {
		// doNext();
		// }
		// });
		defaultPanel.add(historyList);

		final JLabel chooseResidentLabel = new JLabel();
		chooseResidentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		chooseResidentLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		chooseResidentLabel.setText("Medication Cart");
		chooseResidentLabel.setBounds(169, 31, 666, 35);
		chooseResidentLabel.setForeground(new Color(5, 65, 94));
		defaultPanel.add(chooseResidentLabel);

		currentList = new MedicationResidentList();
		currentList.setBounds(173, 278, 616, 164);
		currentList.getJListComponent().setForeground(new Color(5, 65, 94));
		currentList.getJListComponent().setBackground(
				new Color(206, 221, 224, 250));
		currentList.getJListComponent().setFont(
				new Font("Dialog", Font.BOLD, 16));
		// residentList.setBounds(173, 72, 616, 174);
		currentList.setPreferredSize(currentList.getBounds().getSize());
		// currentList.setCellRenderer(medicationResidentListCell);
		currentList.setCellRenderer(currentList.new JxListCellRenderer() {
			@Override
			protected String getLeftValue(Object value) {
				if (value instanceof Object[]) {
					Object values[] = (Object[]) value;
					if (values[1] != null) {
						return (String) values[1];
					}
				}
				return super.getLeftValue(value);
			}

			@Override
			protected String getRightValue(Object value) {
				if (value instanceof Object[]) {
					Object values[] = (Object[]) value;
					if (values[3] != null) {
						return (String) values[3];
					}
				}
				return super.getRightValue(value);
			}
		});
		// currentList.getJListComponent().addListSelectionListener(
		// new ListSelectionListener() {
		// public void valueChanged(ListSelectionEvent e) {
		// if (!e.getValueIsAdjusting()) {
		// ResidentMain resi = (ResidentMain) currentList
		// .getJListComponent().getSelectedValue();
		// panelResiInfo.setResident(resi);
		// } else {
		// panelResiInfo.setResident(null);
		// }
		// // nextButton.setVisible(panelResiInfo.isVisible());
		// }
		// });
		// currentList.getJListComponent().addMouseListener(new MouseAdapter() {
		// public void mouseClicked(MouseEvent e) {
		// if (e.getClickCount() == 1) {
		// doNext();
		// }
		// }
		//
		// public void mouseReleased(MouseEvent arg0) {
		// doNext();
		// }
		// });
		currentList.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(final PropertyChangeEvent evt) {
				if (evt.getPropertyName().equalsIgnoreCase(
						"ListSelectionChanged")) {
					Object selObj = evt.getNewValue();
					if (selObj instanceof Object[]) {
						Object[] selValue = (Object[]) selObj;
						updateResident(selValue);
						Date[] timeValues = (Date[]) selValue[2];
						Global.currentMedicationTimePrev = timeValues[0];
						Global.currentMedicationTimeCurr = timeValues[1];
						Global.currentMedicationTimeNext = timeValues[2];
					} else {
						// System.out.println(selObj);
					}
				} else if (evt.getPropertyName().equalsIgnoreCase(
						"ListDoubleClicked")) {
					Object selObj = evt.getNewValue();
					if (selObj instanceof Object[]) {
						Object[] selValue = (Object[]) selObj;
						updateResident(selValue);
						Date[] timeValues = (Date[]) selValue[2];
						Global.currentMedicationTimePrev = timeValues[0];
						Global.currentMedicationTimeCurr = timeValues[1];
						Global.currentMedicationTimeNext = timeValues[2];

						if (Global.frameMedicationForms == null) {
							Global.frameMedicationForms = new FrameMedicationForms();
						}
						Global.frameMedicationForms.showPhysicianOrders();
						// Global.panelMedicationDesktop.dispose();
					} else {
						// System.out.println(selObj);
					}
				}
			}
		});
		defaultPanel.add(currentList);

		historyMap = new HashMap<Integer, Object[]>();
		// final Timer timer = new Timer( 60 * 1000, new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// fillCombos();
		// }
		// });
		// timer.setRepeats(true);
		// timer.setCoalesce(true);
		// // timer.setInitialDelay((60 -
		// MedrexClientManager.getServerTime().getSeconds()) * 1000);
		// timer.start();
		// residentList.setListData(new String[] {"BEVAN MICHAEL",
		// "GILCHRIST ADAM", "BEVAN MICHAEL", "GILCHRIST ADAM", "BEVAN MICHAEL",
		// "GILCHRIST ADAM"});
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
		super.paint(g);
	}

	protected void doUpdate() {
		// System.out.println("getWidth:" + getWidth());
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		// panel_4.setLocation((defaultPanel.getWidth() - panel_4.getWidth()) /
		// 2,
		// panel_4.getY());
		panelResiInfo.setLocation((int) (defaultPanel.getWidth() * 0.98f)
				- panelResiInfo.getWidth(), panelResiInfo.getY());
		// nextButton.setLocation((int) (defaultPanel.getWidth() * 0.98f)
		// - panelResiInfo.getWidth(), nextButton.getY());
		this.repaint();
		fillCombos();
		System.out.println("DOUPDATE");
		// doLoad();
		// doSearch();
		// txtChooseResident.requestFocus();
	}

	protected void doSearch() {
		new ArrayList();
		try {
			MedrexClientManager.getInstance().getResidentMain();
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	// private JPanel getCard(String name) {
	// if (name == PanelCensusMain.DEFAULT) {
	// final PanelCensusIn panel = new PanelCensusIn();
	// panel.setResident(this.getResident());
	// return panel;
	// } else if (name == PanelCensusMain.ADMISSION) {
	// return new PanelCensusAdmission(true);
	// } else if (name == PanelCensusMain.DISCHARGE) {
	// return new PanelCensusDischarge(true);
	// } else if (name == PanelCensusMain.SIGN_IN) {
	// return new PanelCensusSignIn(true);
	// } else if (name == PanelCensusMain.SIGN_OUT) {
	// return new PanelCensusSignOut(true);
	// } else if (name == PanelCensusMain.HISTORY) {
	// return new PanelCensusHistory();
	// } else {
	// return null;
	// }
	// }

	// public void changeCard(String name) {
	// currentCard = null;
	// // if(cards.get(name) == null) {
	// JPanel card = getCard(name);
	// // cards.put(name, card);
	// card.setOpaque(false);
	// defaultPanel.removeAll();
	// defaultPanel.add(card, name);
	// currentCard = card;
	// card = null;
	// // }
	// defaultCardLayout.show(defaultPanel, name);
	// defaultPanel.requestFocus();
	// doUpdate();
	// }

	/**
	 * @param resident
	 *            the resident to set
	 */
	public void setResident(ResidentMain resident) {
		this.resident = resident;
		if (panelResidentInfo != null) {
			panelResidentInfo.setResident(resident);
		}
	}

	/**
	 * @return the resident
	 */
	public ResidentMain getResident() {
		return resident;
	}

	protected void doNext() {
		// TODO Auto-generated method stub
		System.out.println("Override doNext() method");
	}

	public void updateResident(Object[] selValue) {
		if (selValue != null) {
			ResidentMain res = (ResidentMain) selValue[0];
			Global.currentResidenceKey = res.getSerial();
			// lblResidentName.setText((String) selValue[1]);
			// lblResidentRoomNo.setText(res.getRoom());
			// residentImage.repaint();
		} else {
			Global.currentResidenceKey = 0;
			// lblResidentName.setText("");
			// lblResidentRoomNo.setText("");
			// residentImage.repaint();
		}
	}

	private Date[] getCurrentTimeSelection(Object[] timeList) {
		Date curDate;
		Date[] dateArr = new Date[3];
		// System.out.println("MerTimeList: ");
		// for(int i = 0; i < timeList.length; i++) {
		// System.out.println(timeList[i]);
		// }
		if (timeList.length == 1) {
			int j = 1;
			curDate = TimeStrComparator.getStringToTime((String) timeList[0]);
			if (currentDate.getTime() <= curDate.getTime()) {
				j = 2;
			}
			dateArr[j] = curDate;

			return dateArr;
		} else {
			for (int i = 0; i < timeList.length; i++) {
				curDate = TimeStrComparator
						.getStringToTime((String) timeList[i]);
				if (currentDate.getTime() <= curDate.getTime()) {
					int j = i - 1;
					if (j - 1 > 0) {
						dateArr[0] = TimeStrComparator
								.getStringToTime((String) timeList[j - 1]);
					}
					dateArr[1] = TimeStrComparator
							.getStringToTime((String) timeList[j]);
					if (j + 1 < timeList.length) {
						dateArr[2] = TimeStrComparator
								.getStringToTime((String) timeList[j + 1]);
					}
					// return dateArr;
					break;
				}
			}
		}
		// System.out.println(dateArr[0] + ", " + dateArr[1] + ", " +
		// dateArr[2]);
		return dateArr;
	}

	public boolean isInHistory(Date[] curTimeValues, Date[] hisTimeValues) { /* TODO */
		Date preTime = curTimeValues[0];
		Date curTime = curTimeValues[1];
		Date nexTime = curTimeValues[2];
		Date hisTime = hisTimeValues[0];
		if (curTime != null && hisTime != null) {
			if (nexTime != null) {
				// System.out.println("1:" + (curTime.getTime() <
				// hisTime.getTime()) + ", 2:" + (hisTime.getTime() <
				// nexTime.getTime()));
				if (curTime.getTime() <= hisTime.getTime()
						&& hisTime.getTime() <= nexTime.getTime()) {
					return false;
				}
			} else if (preTime != null) {
				if (curTime.getTime() >= hisTime.getTime()
						&& hisTime.getTime() >= preTime.getTime()) {
					return false;
				}
			} else {
				if (curTime.getTime() >= hisTime.getTime()
						&& (preTime != null || nexTime != null)) {
					return false;
				}
				if (curTime.getTime() <= hisTime.getTime()
						&& (preTime == null || nexTime == null)) {
					return false;
				}
			}
		}
		return true;
	}

	public static String[] getTimeList(int frequency) {
		switch (frequency) {
		case 1:
			return new String[] { "01:30 PM" };
		case 2:
			return new String[] { "08:30 AM", "10:30 PM" };
		case 3:
			return new String[] { "08:30 AM", "01:30 PM", "10:30 PM" };
		case 4:
			return new String[] { "06:00 AM", "12:00 PM", "06:00 PM",
					"12:00 AM" };
		case 5:
			return new String[] { "06:00 AM", "10:30 AM", "03:00 PM",
					"07:30 PM", "12:00 AM" };
		case 6:
			return new String[] { "06:00 AM", "10:00 AM", "02:00 PM",
					"06:00 PM", "10:00 PM", "02:00 AM" };
		case 7:
			return new String[] { "06:00 AM", "09:30 AM", "01:00 PM",
					"04:30 PM", "08:00 PM", "11:30 PM", "03:00 AM" };
		case 8:
			return new String[] { "06:00 AM", "09:00 AM", "12:00 PM",
					"03:00 PM", "06:00 PM", "09:00 PM", "12:00 AM", "03:00 AM" };
		case 9:
			return new String[] { "06:00 AM", "08:30 AM", "11:00 AM",
					"01:30 PM", "04:00 PM", "06:30 PM", "09:00 PM", "11:30 PM",
					"01:00 AM" };
		case 10:
			return new String[] { "06:00 AM", "08:00 AM", "10:00 AM",
					"12:00 PM", "02:00 PM", "04:00 PM", "06:00 PM", "08:00 PM",
					"10:00 PM", "12:00 AM" };
		}
		return null;
	}

	public Object[] getMergedTimeList(Object[] fList) {
		List<String> mergedList = new ArrayList<String>();
		for (Object tList : fList) {
			for (String time : (String[]) tList) {
				mergedList.add(time);
			}
		}
		Collections.sort(mergedList, new TimeStrComparator());
		for (int i = 0; i < mergedList.size(); i++) {
			if (i > 0) {
				if (mergedList.get(i).equalsIgnoreCase(mergedList.get(i - 1))) {
					mergedList.remove(i);
					i--;
				}
			}
		}
		// for(int i = 0; i < mergedList.size(); i++) {
		// System.err.println(mergedList.get(i));
		// }
		return mergedList.toArray();
	}

	public void fillCombos() {
		System.out.println("fillCombos()");
		residentList = new ArrayList<ResidentMain>();
		List timeList = new ArrayList();

		new ArrayList();
		new ArrayList();
		List l = null;
		try {
			l = MedrexClientManager.getInstance().getPhysicianOrderForm3s();
			Iterator i = l.iterator();
			// System.out.println(l.size());
			while (i.hasNext()) {
				PhysicianOrderForm3 ref = (PhysicianOrderForm3) i.next();
				List phyRows = MedrexClientManager.getInstance()
						.getPhysicianOrderForm3Rows(ref.getSerial());
				ResidentMain residentMain = MedrexClientManager.getInstance()
						.getResident(ref.getResidentId());
				// System.err.println("MedDesktop current resident: " +
				// ref.getResidentId());
				ArrayList tempTimeList = new ArrayList();

				if (residentMain != null) {
					residentList.add(residentMain);
				}
				// System.out.println(ref.getSerial());
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
								tempTimeList.add(getTimeList(Integer
										.parseInt(refRow.getPhyFrequency())));
								// System.err.println("Freq: " +
								// refRow.getPhyFrequency());
								// phyOrders.add(refRow);
								// System.out.println(refRow.getPhyOrderDate());
							}
						}
						// System.out.println(refRow);
					}
				}
				timeList.add(getMergedTimeList(tempTimeList.toArray()));
				// ////////////////////////////////////////////////////////////////////////
			}
			//
			Object[] obj = doGetHistory();
			historyList.setListData(obj);

			Iterator<ResidentMain> rItr = residentList.iterator();
			newElements = new ArrayList<Object[]>();
			int count = 0;
			while (rItr.hasNext()) {
				ResidentMain res = rItr.next();
				// System.out.println(res.getSerial());
				Date[] currentTimeSelection = getCurrentTimeSelection((Object[]) timeList
						.get(count));
				Object[] resHistory = historyMap.get(res.getSerial());
				if (currentTimeSelection == null
						|| currentTimeSelection[1] == null) {
					count++;
					continue;
				}
				if (resHistory != null) {
					boolean skip = !isInHistory(currentTimeSelection,
							(Date[]) resHistory[2]);
					// System.out.println(boolCheck);
					if (skip) {
						count++;
						continue;
					} else {
						Object[] ele = new Object[4];
						ele[0] = res;
						ele[1] = res.getUserPass() + ", " + res.getUserName();
						ele[2] = currentTimeSelection;
						ele[3] = getHighlightedTimeSelection(currentTimeSelection);
						newElements.add(ele);
					}
				} else {
					Object[] ele = new Object[4];
					ele[0] = res;
					ele[1] = res.getUserPass() + ", " + res.getUserName();
					ele[2] = currentTimeSelection;
					ele[3] = getHighlightedTimeSelection(currentTimeSelection);
					newElements.add(ele);
				}
				count++;
			}

			currentList.setListData(newElements.toArray());
			if (newElements.size() > 0) {
				updateResident(null);
				currentList.setSelectedItem(newElements.get(0));

				// residentPanel.setEnabled(true);
			} else {
				// residentPanel.setEnabled(false);
			}
			System.out.println("Executing");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// currentDate = MedrexClientManager.getServerTime();
		// hhmmAmLabel.setText(TimeStrComparator.TIME_FORMATTER
		// .format(currentDate));
	}

	private String getHighlightedTimeSelection(Date[] dateArr) {
		switch (dateArr.length) {
		case 3: {
			String tmp = "<html><body>";
			if (dateArr[0] != null) {
				tmp += TimeStrComparator.TIME_FORMATTER.format(dateArr[0]);
			}
			if (dateArr[0] != null && dateArr[1] != null) {
				tmp += " | ";
			}
			if (dateArr[1] != null) {
				tmp += "<font color='#ff0000'>"
						+ TimeStrComparator.TIME_FORMATTER.format(dateArr[1])
						+ "</font>";
			}
			if (dateArr[1] != null && dateArr[2] != null) {
				tmp += " | ";
			}
			if (dateArr[2] != null) {
				tmp += TimeStrComparator.TIME_FORMATTER.format(dateArr[2]);
			}
			tmp += "</body></html>";
			return tmp;
		}
		}
		return "";
	}

	public Object[] doGetHistory() {
		List<Object[]> historyNotes = new ArrayList<Object[]>();
		historyMap.clear();
		List l = null;
		Iterator<NurseMedicationNotesForm> i = null;
		try {
			l = MedrexClientManager.getInstance()
					.getNurseMedicationNotesForms();
			if (l == null) {
				PanelNurseMedicationNotes ref = new PanelNurseMedicationNotes();
				Global.currentNurseMedicationNotesFormKey = 0;
				ref.doSave();
				MedicationTreatmentForm medFormObj = new MedicationTreatmentForm();
				medFormObj.setResidentId(Global.currentResidenceKey);
				medFormObj.setFormId(Global.currentNurseMedicationNotesFormKey);
				medFormObj.setDateCreated(currentDate);
				medFormObj.setFormType("Nurse Medication Notes");
				medFormObj.setLastModified(currentDate);
				medFormObj.setStatus("Incomplete");
				medFormObj.setUser(Global.currentUsers);
				MedrexClientManager.getInstance()
						.insertOrUpdateMedicationTreatmentForm(medFormObj);
				l = MedrexClientManager.getInstance()
						.getNurseMedicationNotesForms();
			}
			i = l.iterator();
			while (i.hasNext()) {
				Object[] historyRow = new Object[4];
				NurseMedicationNotesForm ref = i.next();
				ResidentMain res = MedrexClientManager.getInstance()
						.getResident(ref.getResidentId());
				historyRow[0] = res;
				historyRow[1] = res.getUserPass() + ", " + res.getUserName();
				Date[] timeList = new Date[3];
				List nurseMedicationRowList = MedrexClientManager.getInstance()
						.getNurseMedicationNotesFormRow(ref.getSerial(),
								currentDate);
				Iterator iRow = nurseMedicationRowList.iterator();
				int cntr = 3;
				while (iRow.hasNext() && cntr > 0) {
					NurseMedicationNotesFormRow refRow = (NurseMedicationNotesFormRow) iRow
							.next();
					refRow.getResult();
					if (refRow != null) {
						--cntr;
						Date tmpDate = TimeStrComparator.getStringToTime(refRow
								.getTimeRecord());
						if (cntr < 2) {
							if (timeList[cntr + 1].compareTo(tmpDate) > 0) {
								timeList[cntr] = tmpDate;
							} else {
								timeList[cntr] = null;
								cntr++;
							}
						} else {
							timeList[cntr] = tmpDate;
						}
					}
				}
				ArrayList tmpTimeList = new ArrayList();
				for (int k = timeList.length; k > 0; k--) {
					if (timeList[k - 1] != null) {
						tmpTimeList.add(timeList[k - 1]);
					}
				}
				timeList = (Date[]) tmpTimeList.toArray(new Date[3]);
				historyRow[2] = timeList;
				historyRow[3] = getFormattedTimeSelection(timeList);
				List listForms = MedrexClientManager.getInstance()
						.getNurseMedicationNotesForms();
				Iterator iForm = listForms.iterator();
				int formId = 0;
				while (iForm.hasNext()) {
					NurseMedicationNotesForm form = (NurseMedicationNotesForm) iForm
							.next();
					formId = form.getSerial();
				}
				MedrexClientManager.getInstance()
						.getNurseMedicationNotesFormRows(formId);
				// System.out.println("Size of List of Medication Notes Rows"+listNotes.size());
				// System.out.println("NoOfMedicationPanel"+Global.NoOfMedicationPanel);
				// && !result.equalsIgnoreCase("Accepted")
				// && (Global.NoOfMedicationPanel==listNotes.size())
				// if(Global.NoOfMedicationPanel==listNotes.size()){
				// historyNotes.add(historyRow);
				// historyMap.put(res.getSerial(), historyRow);
				// }
				if (!(timeList[0] == null && timeList[1] == null && timeList[2] == null)) {
					historyNotes.add(historyRow);
					historyMap.put(res.getSerial(), historyRow);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return historyNotes.toArray();
		}
	}

	private String getFormattedTimeSelection(Date[] dateArr) {
		switch (dateArr.length) {
		case 3: {
			String tmp = "<html><body>";
			if (dateArr[0] != null) {
				tmp += TimeStrComparator.TIME_FORMATTER.format(dateArr[0]);
			}
			if (dateArr[0] != null && dateArr[1] != null) {
				tmp += " | ";
			}
			if (dateArr[1] != null) {
				tmp += TimeStrComparator.TIME_FORMATTER.format(dateArr[1]);
			}
			if (dateArr[1] != null && dateArr[2] != null) {
				tmp += " | ";
			}
			if (dateArr[2] != null) {
				tmp += TimeStrComparator.TIME_FORMATTER.format(dateArr[2]);
			}
			tmp += "</body></html>";
			return tmp;
		}
		}
		return "";
	}

}

class TimeStrComparator implements Comparator {
	public static SimpleDateFormat TIME_FORMATTER = new SimpleDateFormat(
			"hh:mm a");

	// +1 if a > b
	// 0 if a == b
	// -1 if a < b
	public final int compare(Object a, Object b) {
		Date aDate = getStringToTime((String) a);
		Date bDate = getStringToTime((String) b);
		if (aDate.getTime() == bDate.getTime()) {
			return 0;
		} else
			return (aDate.getTime() > bDate.getTime()) ? 1 : -1;
	} // end compare

	public static Date getStringToTime(String str) {
		if (str.length() == 8) {
			Date dateRef = MedrexClientManager.getServerTime();
			int hrs = Integer.parseInt(str.substring(0, 2));
			if (hrs == 12) {
				hrs = 0;
			}
			if (str.charAt(6) == 'P') {
				hrs += 12;
			}
			dateRef.setHours(hrs);
			dateRef.setMinutes((Integer.parseInt(str.substring(3, 5))));
			dateRef.setSeconds(0);
			return dateRef;
		}
		return null;
	}
} // end class StringComparator
