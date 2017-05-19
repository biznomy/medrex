package medrex.client.accurities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.dataObj.Rooms;
import medrex.commons.enums.ColorConstants;
import medrex.commons.vo.accurities.Accurities;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

public class PanelResidentMain extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2802253315267160114L;
	private ButtonGroup buttonGroup = new ButtonGroup();
	// private JxButton sortButton;
	private JLabel dateLabel;
	private JLabel therapyLabel;
	private JLabel lblDetails;
	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);
	private List accuritiesList = new ArrayList();
	private JPanel scrollPanel;
	private JScrollPane scrollPane_1;
	int panelNo = 0;
	private int CurrentFormId = 0;
	int selRes[] = null;
	private static int currentAccuritiesListKey;
	private String floor;
	private String date;
	private String type;
	int resiId[] = new int[0];
	private PanelResidents[] RunTimepanel;
	List<Rooms> roomsList = new ArrayList<Rooms>();
	private Color color = new Color(194, 211, 217);
	private Map<ResidentMain, ResidentMain> residentMap;

	// private PanelImage imagePanel;
	public PanelResidentMain(int currentAccuritiesListKey, String floor,
			String date, String type) {
		super();
		Global.panelResidentMainAcutites = this;
		this.currentAccuritiesListKey = currentAccuritiesListKey;
		this.floor = floor;
		this.date = date;
		this.type = type;
		setLayout(null);
		setSize(724, 708);
		setPreferredSize(getSize());
		this.setLinearGradient(color, ColorConstants.GradientBright,
				Direction.LEFT_TO_RIGHT);
		setCurvedView(false);

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 723, 108);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 10, 233, 88);
		panel.add(panel_1);

		final JLabel label_3 = new JLabel(new ImageIcon("img/medrexLogo.png"));
		label_3.setOpaque(false);
		label_3.setText("");
		panel_1.setLayout(new BorderLayout());
		label_3.setBounds(0, 0, 263, 88);
		panel_1.add(label_3, BorderLayout.CENTER);

		final JxButton cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				Global.frameAccuritiesListAddNew.dispose();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBorderPainted(false);
		cancelButton.setArc(0.6f);
		cancelButton.setBorder(BORDER);
		cancelButton.setBackground(new Color(115, 155, 168));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setRolloverEnabled(true);
		cancelButton.setGlassyPainted(true);
		cancelButton.setBounds(546, 58, 90, 26);
		panel.add(cancelButton);

		final JxButton backButton = new JxButton();
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doSave();
				// Global.frameAccuritiesListAddNew.getParent().setVisible(true);
				Global.frameAccuritiesListAddNew.dispose();
			}

		});
		backButton.setText("Save");
		backButton.setBorderPainted(false);
		backButton.setArc(0.6f);
		backButton.setBorder(BORDER);
		backButton.setBackground(new Color(115, 155, 168));
		backButton.setFont(new Font("", Font.BOLD, 12));
		backButton.setForeground(Color.WHITE);
		backButton.setRolloverEnabled(true);
		backButton.setGlassyPainted(true);
		backButton.setBounds(445, 58, 90, 26);
		panel.add(backButton);

		final JxButton backButton_1 = new JxButton();
		backButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				for (int i = 0; i < roomsList.size(); i++) {
					Component comp[] = RunTimepanel[i].getComponents();
					for (int j = 0; j < comp.length; j++) {
						if (comp[j] instanceof JCheckBox) {
							JCheckBox cb = (JCheckBox) comp[j];
							cb.setSelected(false);
						}
					}
				}
			}
		});
		backButton_1.setText("Uncheck All");
		backButton_1.setBorderPainted(false);
		backButton_1.setArc(0.6f);
		backButton_1.setBorder(BORDER);
		backButton_1.setBackground(new Color(115, 155, 168));
		backButton_1.setFont(new Font("", Font.BOLD, 12));
		backButton_1.setForeground(Color.WHITE);
		backButton_1.setRolloverEnabled(true);
		backButton_1.setGlassyPainted(true);
		backButton_1.setBounds(345, 58, 90, 26);
		panel.add(backButton_1);

		final JxButton backButton_2 = new JxButton();
		backButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				// Global.panelResidentAcuities.checkAll();
				for (int i = 0; i < roomsList.size(); i++) {
					Component comp[] = RunTimepanel[i].getComponents();
					for (int j = 0; j < comp.length; j++) {
						if (comp[j] instanceof JCheckBox) {
							JCheckBox cb = (JCheckBox) comp[j];
							cb.setSelected(true);
						}
					}
				}
			}
		});
		backButton_2.setGlassyPainted(true);
		backButton_2.setText("Check All");
		backButton_2.setBorderPainted(false);
		backButton_2.setArc(0.6f);
		backButton_2.setBorder(BORDER);
		backButton_2.setBackground(new Color(115, 155, 168));
		backButton_2.setFont(new Font("", Font.BOLD, 12));
		backButton_2.setForeground(Color.WHITE);
		backButton_2.setRolloverEnabled(true);
		backButton_2.setArc(0.6f);
		backButton_2.setBounds(249, 58, 82, 26);
		panel.add(backButton_2);

		therapyLabel = new JLabel();
		therapyLabel.setForeground(ColorConstants.DEF_COLOR);
		therapyLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		therapyLabel.setText("Therapy");
		therapyLabel.setBounds(249, 10, 186, 26);
		panel.add(therapyLabel);

		dateLabel = new JLabel();
		dateLabel.setForeground(ColorConstants.DEF_COLOR);
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		dateLabel.setBounds(440, 11, 281, 26);
		panel.add(dateLabel);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setLayout(null);
		panel_4.setCurvedView(false);
		panel_4.setBounds(0, 108, 723, 30);
		panel_4.setLinearGradient(ColorConstants.GradientBright,
				ColorConstants.GradientDark, Direction.LEFT_TO_RIGHT);
		add(panel_4);

		final JLabel addNewPhysicianLabel = new JLabel();
		addNewPhysicianLabel.setText("Resident List");
		addNewPhysicianLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		addNewPhysicianLabel.setForeground(ColorConstants.DEF_COLOR);
		addNewPhysicianLabel.setBounds(50, 5, 312, 20);
		panel_4.add(addNewPhysicianLabel);

		lblDetails = new JLabel();
		lblDetails.setBounds(611, 8, 66, 16);
		panel_4.add(lblDetails);
		lblDetails.setForeground(Color.WHITE);
		lblDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDetails.setText("Details");

		final JxPanel panel_2 = new JxPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(55, 178, 609, 480);
		add(panel_2);

		scrollPane_1 = new JScrollPane();
		JScrollBar scroll = scrollPane_1.getVerticalScrollBar();
		scroll.setUnitIncrement(25);
		scrollPane_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_1.setBackground(Color.WHITE);
		scrollPane_1.setBounds(7, 7, 600, 473);
		panel_2.add(scrollPane_1);

		/*
		 * imagePanel= new PanelImage(); imagePanel.setCurvedView(true);
		 * imagePanel.setBackground(getBackground()); imagePanel.setBounds(675,
		 * 10, 90, 90); add(imagePanel);
		 */

		/*
		 * final JRadioButton firstnameRadioButton = new JRadioButton();
		 * firstnameRadioButton.addMouseListener(new MouseAdapter() { public
		 * void mouseClicked(final MouseEvent e) { doSort(); } });
		 * buttonGroup.add(firstnameRadioButton);
		 * firstnameRadioButton.setOpaque(false);
		 * firstnameRadioButton.setActionCommand("firstName");
		 * firstnameRadioButton.setText("FirstName");
		 * firstnameRadioButton.setBounds(220, 150, 72, 18);
		 * add(firstnameRadioButton);
		 */

		final JRadioButton lastnameRadioButton = new JRadioButton();
		lastnameRadioButton.setBackground(Color.WHITE);
		lastnameRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				doSort();
			}
		});
		buttonGroup.add(lastnameRadioButton);
		lastnameRadioButton.setOpaque(false);
		lastnameRadioButton.setSelected(true);
		lastnameRadioButton.setActionCommand("lastName");
		lastnameRadioButton.setText("LastName");
		lastnameRadioButton.setBounds(330, 150, 91, 18);
		add(lastnameRadioButton);

		final JRadioButton roomsRadioButton = new JRadioButton();
		roomsRadioButton.setBackground(Color.WHITE);
		roomsRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				doSort();
			}
		});
		buttonGroup.add(roomsRadioButton);
		roomsRadioButton.setOpaque(false);
		roomsRadioButton.setActionCommand("rooms");
		roomsRadioButton.setText("Rooms");
		roomsRadioButton.setBounds(425, 150, 81, 18);
		add(roomsRadioButton);

		final JLabel sortByLabel = new JLabel();
		sortByLabel.setText("Sort By:");
		sortByLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		sortByLabel.setForeground(ColorConstants.DEF_COLOR);
		sortByLabel.setBounds(259, 146, 60, 25);
		add(sortByLabel);

		/*
		 * sortButton = new JxButton(); sortButton.addActionListener(new
		 * ActionListener() { public void actionPerformed(final ActionEvent e) {
		 * doSort(); } }); sortButton.setArc(0.6f);
		 * sortButton.setGlassyPainted(true); sortButton.setBorder(BORDER);
		 * sortButton.setBackground(new Color(115,155,168));
		 * sortButton.setFont(new Font("", Font.BOLD, 12));
		 * sortButton.setForeground(Color.WHITE); sortButton.setText("Sort");
		 * sortButton.setBounds(378, 144, 83, 28); add(sortButton);
		 */

		scrollPanel = new JPanel();
		scrollPanel.setBackground(Color.WHITE);
		scrollPanel.setLayout(null);
		showResidentPanel();
		updateTopInfo();
	}

	private void doSort() {
		Comparator<Rooms> comparator;
		String selectedButton = buttonGroup.getSelection().getActionCommand();
		if ("lastName".equalsIgnoreCase(selectedButton)) {
			// for sorting list according to resident lastName
			comparator = new Comparator<Rooms>() {
				// -ve o1 < o2
				// 0 o1 = o2
				// +ve o1 > o2
				public int compare(Rooms o1, Rooms o2) {
					int obj = 0;
					if (o1 != null && o2 != null) {
						ResidentMain resi1 = residentMap.get(o1.getResmain());
						ResidentMain resi2 = residentMap.get(o2.getResmain());
						String str1 = resi1.getUserPass();
						String str2 = resi2.getUserPass();
						return str1.compareToIgnoreCase(str2);
					}
					return obj;
				}
			};
			Collections.sort(roomsList, comparator);
			/*
			 * }else if("firstName".equalsIgnoreCase(selectedButton)){ //for
			 * sorting list according to resident firstName comparator = new
			 * Comparator<Rooms>() { // -ve o1 < o2 // 0 o1 = o2 // +ve o1 > o2
			 * public int compare(Rooms o1, Rooms o2) { int obj = 0; if(o1 !=
			 * null && o2 != null) { ResidentMain resi1 =
			 * residentMap.get(o1.getResmain()); ResidentMain resi2 =
			 * residentMap.get(o2.getResmain()); String str1 =
			 * resi1.getUserName(); String str2 = resi2.getUserName(); return
			 * str1.compareToIgnoreCase(str2); } return obj; } };
			 * Collections.sort(roomsList, comparator);
			 */
		} else if ("rooms".equalsIgnoreCase(selectedButton)) {
			// for sorting list according to resident rooms
			comparator = new Comparator<Rooms>() {
				// -ve o1 < o2
				// 0 o1 = o2
				// +ve o1 > o2
				public int compare(Rooms o1, Rooms o2) {
					int obj = 0;
					if (o1 != null && o2 != null) {
						String str1 = o1.getCurrentRoom();
						String str2 = o2.getCurrentRoom();
						return str1.compareToIgnoreCase(str2);
					}
					return obj;
				}
			};
			Collections.sort(roomsList, comparator);
		}
		// For updating panelResidents info
		resiId = new int[roomsList.size()];
		int i = 0;
		int size = roomsList.size();
		scrollPanel.removeAll();
		RunTimepanel = new PanelResidents[size];
		for (panelNo = 0; panelNo < size; panelNo++) {
			Rooms room = roomsList.get(panelNo);
			RunTimepanel[panelNo] = new PanelResidents();
			RunTimepanel[panelNo].setBounds(20, panelNo * 25, 530, 25);
			RunTimepanel[panelNo].doUpdate(room); // update each resident info
			scrollPanel.add(RunTimepanel[panelNo]);
			resiId[i] = room.getResmain().getSerial();
			i++;
		}
		scrollPanel.setPreferredSize(new Dimension(530, i * 25));
		scrollPane_1.setViewportView(scrollPanel);

		updateList();
	}

	protected void doSave() {
		if (Global.accuritiesList != null) {
			List l = Global.accuritiesList;
			accuritiesList.clear();
			Iterator itr = l.iterator();
			while (itr.hasNext()) {
				Accurities accurities = (Accurities) itr.next();
				if (accurities.getTypeId() != Global.currentAccuritiesListKey)
					accuritiesList.add(accurities);
			}
		}
		for (int i = 0; i < resiId.length; i++) {
			// for(int i=0;i<residentList.size();i++){
			Component comp[] = RunTimepanel[i].getComponents();
			for (int j = 0; j < comp.length; j++) {
				if (comp[j] instanceof JCheckBox) {
					JCheckBox cb = (JCheckBox) comp[j];
					if (cb.isSelected()) {
						Accurities accurities = new Accurities();
						accurities.setResidentId(resiId[i]);
						accurities.setTypeId(currentAccuritiesListKey);
						DateFormat df = DateFormat
								.getDateInstance(DateFormat.LONG);
						String strDate = df.format(MedrexClientManager
								.getServerTime());
						Date today = null;
						try {
							today = df.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						accurities.setDate(today);
						accuritiesList.add(accurities);
					}
				}
			}
		}
		Global.accuritiesList = accuritiesList;
	}

	public void showResidentPanel() {

		Comparator<Rooms> comparator;

		try {
			Date d = new Date(date);
			// for setting time 11:59:59 PM.
			d.setHours(23);
			d.setMinutes(59);
			d.setSeconds(59);

			if (floor.equalsIgnoreCase("1st floor")) {
				roomsList = MedrexClientManager.getInstance()
						.getFirstFloorResidents(d);
			}
			if (floor.equalsIgnoreCase("2nd floor")) {
				roomsList = MedrexClientManager.getInstance()
						.getSecondFloorResidents(d);
			}
			System.out.println("roomsList: " + roomsList.size());
			residentMap = new HashMap<ResidentMain, ResidentMain>();
			for (Rooms rm : roomsList) {
				ResidentMain resmain = rm.getResmain();
				residentMap.put(resmain, resmain);
			}
			// for sorting list according to resient lastName, firstName
			comparator = new Comparator<Rooms>() {
				// -ve o1 < o2
				// 0 o1 = o2
				// +ve o1 > o2
				public int compare(Rooms o1, Rooms o2) {
					int obj = 0;
					if (o1 != null && o2 != null) {
						ResidentMain resi1 = residentMap.get(o1.getResmain());
						ResidentMain resi2 = residentMap.get(o2.getResmain());
						String str1 = resi1.getUserPass();
						String str2 = resi2.getUserPass();
						return str1.compareToIgnoreCase(str2);
					}
					return obj;
				}
			};
			Collections.sort(roomsList, comparator);

			// Iterator<ResidentMain> itr=residentList.iterator();
			resiId = new int[roomsList.size()];
		} catch (Exception e) {
			e.printStackTrace();
		}
		int i = 0;
		int size = roomsList.size();
		RunTimepanel = new PanelResidents[size];
		// JSeparator js = null;
		for (panelNo = 0; panelNo < size; panelNo++) {
			Rooms room = roomsList.get(panelNo);
			RunTimepanel[panelNo] = new PanelResidents();
			RunTimepanel[panelNo].setBounds(20, panelNo * 25, 530, 25);
			RunTimepanel[panelNo].doUpdate(room);
			// js = new JSeparator(SwingConstants.HORIZONTAL);
			// js.setBounds(40, 74, 570, 10);
			// js.setForeground(ColorConstants.DEF_COLOR);
			// RunTimepanel[panelNo].add(js);
			scrollPanel.add(RunTimepanel[panelNo]);
			resiId[i] = room.getResmain().getSerial();
			i++;
		}
		// scrollPanel.setPreferredSize(new Dimension(623,i*80));
		scrollPanel.setPreferredSize(new Dimension(530, i * 25));
		scrollPane_1.setViewportView(scrollPanel);
		updateList();
	}

	public void updateList() {
		if (Global.accuritiesList != null) {
			for (int i = 0; i < roomsList.size(); i++) {
				List<Accurities> l = Global.accuritiesList;
				Iterator<Accurities> itr = l.iterator();
				while (itr.hasNext()) {
					Accurities acc = itr.next();
					if (acc.getResidentId() == resiId[i]
							&& acc.getTypeId() == Global.currentAccuritiesListKey) {
						Component comp[] = RunTimepanel[i].getComponents();
						for (int j = 0; j < comp.length; j++) {
							if (comp[j] instanceof JCheckBox) {
								JCheckBox cb = (JCheckBox) comp[j];
								cb.setSelected(true);
							}
						}
					}
				}
			}
		}
	}

	private void updateTopInfo() {
		therapyLabel.setText(type + "");
		dateLabel.setText(date + " 11:59 PM");
	}

	/*
	 * public void setImage(Image image) { imagePanel.setImage(image); }
	 */

}
