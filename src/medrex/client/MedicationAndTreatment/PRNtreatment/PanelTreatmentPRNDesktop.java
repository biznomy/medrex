package medrex.client.MedicationAndTreatment.PRNtreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.FrameLogin;
import medrex.client.MedicationAndTreatment.FrameMedicationDesktop;
import medrex.client.admin.userLogon.ControllerUserLogon;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInfoHoriz;
import medrex.client.main.PanelResidentInformation;
import medrex.client.utils.controls.DateTimePanel;
import medrex.client.utils.controls.MedicationResidentList;
import medrex.commons.enums.ColorConstants;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.frameFactory.FrameFactory;
import com.sX.swing.JxPanel;

public class PanelTreatmentPRNDesktop extends JPanel {
	private ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel defaultPanel;
	private JPanel topTabArea;
	private JPanel topTabsPanel;
	private JPanel topBlueStrip;
	private PanelResidentInfoHoriz panelResidentInfo;
	private JLabel lastLoginLabel;
	private PanelResidentInformation panelResiInfo;
	private MedicationResidentList currentList;
	private ArrayList<Object[]> newElements;
	public static SimpleDateFormat TIME_FORMATTER = new SimpleDateFormat(
			"hh:mm a");
	private FrameMedicationDesktop parent = null;
	private JTextField txtChooseResident;
	private String floorType = "";
	private Map<ResidentMain, ResidentMain> residentMap;
	private List elements;

	public PanelTreatmentPRNDesktop(
			FrameMedicationDesktop frameTreatmentDesktop, String floorType) {
		super();
		setLayout(new BorderLayout());
		setBackground(new Color(231, 239, 242));
		this.parent = frameTreatmentDesktop;
		this.floorType = floorType;
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setPreferredSize(new Dimension(868, 768));

		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(50, 0));
		topTabArea.setOpaque(false);
		add(topTabArea, BorderLayout.NORTH);

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));

		JLabel labelMedrex = new JLabel(new ImageIcon("img/medrexLogo.png"));
		topTabArea.add(labelMedrex, BorderLayout.WEST);

		final JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(9, 9, 9, 9));
		panel.setLayout(new BorderLayout());
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(556, 120));
		topTabArea.add(panel, BorderLayout.CENTER);

		panelResidentInfo = new PanelResidentInfoHoriz();
		panelResidentInfo.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		panelResidentInfo.setOpaque(false);
		panel.add(panelResidentInfo, BorderLayout.EAST);

		final DateTimePanel timerPanel = new DateTimePanel();
		timerPanel.setFont(GuiModes.CHANGE_SCREEN.getControlFont().deriveFont(
				18f).deriveFont(Font.PLAIN));
		timerPanel.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		timerPanel.setPreferredSize(new Dimension(150, 100));
		panel.add(timerPanel, BorderLayout.WEST);

		final JLabel label = new JLabel(new ImageIcon("img/previous.gif"));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				Global.frameMedicationDashboard.setCurrentIndex(1);
				Global.frameMedicationDashboard.reDrawTheFrame();

			}
		});
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText("");
		panel.add(label, BorderLayout.CENTER);

		topBlueStrip = new JPanel();
		topBlueStrip.setPreferredSize(new Dimension(0, 40));
		topBlueStrip.setLayout(new GridLayout(0, 2));
		topBlueStrip.setBackground(new Color(28, 93, 113));
		add(topBlueStrip, BorderLayout.CENTER);

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

		defaultPanel = new JPanel();
		defaultPanel.setPreferredSize(new Dimension(0, 610));
		defaultPanel.setLayout(null);
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 8));
		defaultPanel.setOpaque(false);
		defaultPanel.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				doUpdate();
			}
		});
		add(defaultPanel, BorderLayout.SOUTH);

		panelResiInfo = new PanelResidentInformation();
		panelResiInfo.setForeground(new Color(5, 65, 94));
		panelResiInfo.setBounds(791, 115, 40, 226);
		defaultPanel.add(panelResiInfo);

		/*
		 * historyList = new MedicationResidentList();
		 * historyList.getJListComponent().setForeground(new Color(5, 65, 94));
		 * historyList.getJListComponent().setBackground( new Color(206, 221,
		 * 224, 250)); historyList.getJListComponent().setFont( new
		 * Font("Dialog", Font.BOLD, 16)); historyList.setBounds(173, 72, 616,
		 * 172);
		 * historyList.setPreferredSize(historyList.getBounds().getSize());
		 * historyList.setCellRenderer(historyList.new JxListCellRenderer() {
		 * protected String getLeftValue(Object value) { if (value instanceof
		 * Object[]) { Object values[] = (Object[]) value; if (values[0] !=
		 * null) { return (String) values[0]; } } return
		 * super.getLeftValue(value); } protected String getRightValue(Object
		 * value) { if (value instanceof Object[]) { Object values[] =
		 * (Object[]) value; if (values[1] != null) { return (String) values[1];
		 * } } return super.getRightValue(value); } protected String
		 * getCenterValue(Object value) { if (value instanceof Object[]) {
		 * Object values[] = (Object[]) value; if (values[5] != null ||
		 * values[5] != "" ) { return (String) values[5]; } return ""; } return
		 * super.getCenterValue(value); } }); defaultPanel.add(historyList);
		 */

		final JLabel chooseResidentLabel = new JLabel();
		chooseResidentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		chooseResidentLabel.setFont(new Font("Dialog", Font.PLAIN, 28));
		chooseResidentLabel.setText("Medication Cart (PRN)");
		chooseResidentLabel.setBounds(169, 31, 666, 35);
		chooseResidentLabel.setForeground(new Color(5, 65, 94));
		defaultPanel.add(chooseResidentLabel);

		currentList = new MedicationResidentList();
		currentList.setBounds(169, 162, 616, 179);
		currentList.getJListComponent().setForeground(new Color(5, 65, 94));
		currentList.getJListComponent().setBackground(
				new Color(206, 221, 224, 250));
		currentList.getJListComponent().setFont(
				new Font("Dialog", Font.BOLD, 16));
		currentList.setPreferredSize(currentList.getBounds().getSize());
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
					if (values[6] != null) {
						return (String) values[6];
					}
				}
				return super.getRightValue(value);
			}

			@Override
			protected String getCenterValue(Object value) {
				if (value instanceof Object[]) {
					Object values[] = (Object[]) value;
					if (values[5] != null || values[5] != "") {
						return (String) values[5];
					}
				}
				return super.getCenterValue(value);
			}
		});
		currentList.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(final PropertyChangeEvent evt) {
				if (evt.getPropertyName().equalsIgnoreCase(
						"ListSelectionChanged")) {
					Object selObj = evt.getNewValue();
					if (selObj instanceof Object[]) {
						Object[] selValue = (Object[]) selObj;
						Global.currentResidenceKey = ((Integer) selValue[0])
								.intValue();
					} else {

					}
				} else if (evt.getPropertyName().equalsIgnoreCase(
						"ListDoubleClicked")) {
					System.out.println("List Clicked");
					Object selObj = evt.getNewValue();
					if (selObj instanceof Object[]) {
						Object[] selValue = (Object[]) selObj;
						Global.currentResidenceKey = ((Integer) selValue[0])
								.intValue();
					}
					PanelTreatmentPRNDesktop.this.parent.setCurrentIndex(6);
					PanelTreatmentPRNDesktop.this.parent.reDrawTheFrame();
				}
			}
		});
		defaultPanel.add(currentList);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(169, 115, 616, 41);
		defaultPanel.add(panel_1);

		final JRadioButton rbSortRoom = new JRadioButton();
		rbSortRoom.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSort("SORT_ROOM", PanelTreatmentPRNDesktop.this.elements);
			}
		});
		rbSortRoom.setBackground(Color.WHITE);
		buttonGroup.add(rbSortRoom);
		rbSortRoom.setFont(new Font("", Font.BOLD, 14));
		rbSortRoom.setForeground(ColorConstants.GradientDark);
		rbSortRoom.setOpaque(false);
		rbSortRoom.setText("Sort By Room");
		rbSortRoom.setBounds(435, 0, 185, 24);
		panel_1.add(rbSortRoom);

		final JRadioButton rbSortLastName = new JRadioButton();
		rbSortLastName.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSort("SORT_LAST_NAME", PanelTreatmentPRNDesktop.this.elements);
			}
		});
		rbSortLastName.setBackground(Color.WHITE);
		buttonGroup.add(rbSortLastName);
		rbSortLastName.setFont(new Font("", Font.BOLD, 14));
		rbSortLastName.setForeground(ColorConstants.MED_COLOR);
		rbSortLastName.setOpaque(false);
		rbSortLastName.setText("Sort By Last Name");
		rbSortLastName.setBounds(10, 0, 185, 24);
		panel_1.add(rbSortLastName);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setOpaque(false);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(169, 389, 616, 53);
		defaultPanel.add(panel_2);

		final JLabel gotoLabel = new JLabel();
		gotoLabel.setFont(new Font("", Font.BOLD, 14));
		gotoLabel.setHorizontalAlignment(SwingConstants.LEADING);
		gotoLabel.setBounds(28, 17, 66, 20);
		gotoLabel.setForeground(ColorConstants.MED_COLOR);
		gotoLabel.setText("GOTO");
		panel_2.add(gotoLabel);

		final JxPanel panel_5 = new JxPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(5, 65, 94), 1, false));
		panel_5.setBackground(Color.WHITE);
		panel_5.setArc(0.6f);
		panel_5.setBounds(100, 8, 316, 29);
		panel_2.add(panel_5);

		txtChooseResident = new JTextField();
		txtChooseResident.setForeground(new Color(5, 65, 94));
		txtChooseResident.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtChooseResident.setBounds(10, 1, 301, 25);
		txtChooseResident.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtChooseResident.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {
				doSearch();

			}
		});

		panel_5.add(txtChooseResident);

		doLoad();

		// final Timer timer = new Timer( 30 * 1000, new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// doLoad();
		// }
		// });
		// timer.setRepeats(true);
		// timer.setCoalesce(true);
		// timer.start();

	}

	protected void doSearch() {
		Object[] selectedItem = null;
		currentList.setSelectedItem(null);
		try {
			if (txtChooseResident.getText().length() > 0) {
				if (!txtChooseResident.getText().equalsIgnoreCase("")) {
					// residents =
					// MedrexClientManager.getInstance().getResidents(txtChooseResident
					// .getText(), "", "", "All");
					for (Object obj : this.elements) {
						Object[] residentInfo = (Object[]) obj;

						if (((String) residentInfo[1]).toLowerCase()
								.startsWith(txtChooseResident.getText())) {
							selectedItem = residentInfo;
						}
					}
				}
			} else {
				Object[] residentInfo = null;
				currentList.setSelectedItem(residentInfo);
				currentList.clearSelection();
				return;
			}

			Object[] data = currentList.getListData();
			if (data.length > 0) {
				for (Object obj : data) {
					Object[] item = (Object[]) obj;
					if (item[1] != null && selectedItem != null) {
						if (((String) item[1])
								.equalsIgnoreCase((String) selectedItem[1])) {
							currentList.setSelectedItem(selectedItem);
							return;
						} else {
							currentList.setSelectedItem(null);
						}
					}
				}
				currentList.setSelectedItem(null);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void doSort(String sortType, List elements) {
		if ("SORT_LAST_NAME".equalsIgnoreCase(sortType)) {
			System.out.println("Sort By Last Name");
			Comparator comparator;
			// for sorting list according to resident lastName
			comparator = new Comparator() {
				// -ve o1 < o2
				// 0 o1 = o2
				// +ve o1 > o2
				public int compare(Object o1, Object o2) {
					int obj = 0;
					if (o1 != null && o2 != null) {
						Object[] objArr1 = (Object[]) o1;
						Object[] objArr2 = (Object[]) o2;
						return ((String) objArr1[0])
								.compareToIgnoreCase((String) objArr2[0]);
					}
					return obj;
				}

			};
			Collections.sort(elements, comparator);
			currentList.setListData(elements.toArray());
		}

		if ("SORT_ROOM".equalsIgnoreCase(sortType)) {
			System.out.println("Sort By Room");
			Comparator comparator;
			// for sorting list according to resident lastName
			comparator = new Comparator() {
				// -ve o1 < o2
				// 0 o1 = o2
				// +ve o1 > o2
				public int compare(Object o1, Object o2) {
					int obj = 0;
					if (o1 != null && o2 != null) {
						Object[] objArr1 = (Object[]) o1;
						Object[] objArr2 = (Object[]) o2;
						if (objArr1[5] != null && objArr2[5] != null) {
							return ((String) objArr1[5])
									.compareToIgnoreCase((String) objArr2[5]);
						}
					}
					return obj;
				}
			};
			Collections.sort(elements, comparator);
			currentList.setListData(elements.toArray());
		}
	}

	private void doLoad() {
		showResidentsWithPRN();
	}

	private void showResidentsWithPRN() {
		List currentResidentList = new ArrayList();
		try {
			currentResidentList = MedrexClientManager.getInstance()
					.getPrnResidentsByFloor(floorType);
		} catch (Exception e) {

			e.printStackTrace();
		}
		Iterator<Object[]> it = currentResidentList.iterator();
		newElements = new ArrayList<Object[]>();
		elements = new ArrayList<Object[]>();
		while (it.hasNext()) {

			Object[] obj = new Object[7];
			Object[] o = it.next();
			// 0. for residentId
			// 1.for userName
			// 6.for room
			if (o[0] != null) {
				obj[0] = o[0];
			}
			if (o[1] != null) {
				obj[1] = o[1];
			}
			if (o[6] != null) {
				obj[6] = o[6];
			}
			// System.out.println("User :"+obj[1]);
			// System.out.println("Room :"+obj[6]);
			newElements.add(obj);
			elements.add(obj);
		}

		currentList.setListData(newElements.toArray());
	}

	protected void doUpdate() {

		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		topTabArea.setPreferredSize(new Dimension(width, (height / 5)));
		defaultPanel
				.setPreferredSize(new Dimension(width, (int) (height / 1.4)));

	}

	private String getHighlightedTimeSelection(String currentSlot,
			String nextSlot) {
		String tmp = "<html><body>";
		if (currentSlot != null) {
			tmp += "<font color='#ff0000'>" + currentSlot.toString()
					+ "</font>";
		}
		if (currentSlot != null && nextSlot != null) {
			tmp += " | ";
		}
		if (nextSlot != null) {
			tmp += nextSlot.toString();
		}
		tmp += "</body></html>";
		return tmp;
	}
}
