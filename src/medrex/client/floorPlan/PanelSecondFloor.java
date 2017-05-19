package medrex.client.floorPlan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.main.resident.personalInfo.ControllerRoomList;
import medrex.client.utils.SwingUtils;
import medrex.commons.dataObj.Rooms;

public class PanelSecondFloor extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5068850239838707183L;
	private static Map<String, PanelBedNew> roomMap = new HashMap<String, PanelBedNew>();
	private PanelBedNew bed226_2;
	private PanelBedNew bed226_1;
	private PanelBedNew bed225_2;
	private PanelBedNew bed225_1;
	private PanelBedNew bed224_2;
	private PanelBedNew bed224_1;
	private PanelBedNew bed223_2;
	private PanelBedNew bed223_1;
	private PanelBedNew bed222_2;
	private PanelBedNew bed222_1;
	private PanelBedNew bed221_2;
	private PanelBedNew bed221_1;
	private PanelBedNew bed220_2;
	private PanelBedNew bed220_1;
	private PanelBedNew bed219_2;
	private PanelBedNew bed219_1;
	private PanelBedNew bed218_2;
	private PanelBedNew bed218_1;
	private PanelBedNew bed217_2;
	private PanelBedNew bed217_1;
	private PanelBedNew bed216_2;
	private PanelBedNew bed216_1;
	private PanelBedNew bed215_2;
	private PanelBedNew bed215_1;
	private PanelBedNew bed214_2;
	private PanelBedNew bed214_1;
	private PanelBedNew bed227_2;
	private PanelBedNew bed227_1;
	private PanelBedNew bed228_2;
	private PanelBedNew bed228_1;
	private PanelBedNew bed229;
	private PanelBedNew bed232_3;
	private PanelBedNew bed232_2;
	private PanelBedNew bed232_1;
	private PanelBedNew bed231_2;
	private PanelBedNew bed231_1;
	private PanelBedNew bed230_2;
	private PanelBedNew bed230_1;
	private PanelBedNew bed213_4;
	private PanelBedNew bed213_3;
	private PanelBedNew bed213_2;
	private PanelBedNew bed213_1;
	private PanelBedNew bed212_4;
	private PanelBedNew bed212_3;
	private PanelBedNew bed212_2;
	private PanelBedNew bed212_1;
	private PanelBedNew bed211_2;
	private PanelBedNew bed211_1;
	private PanelBedNew bed210_2;
	private PanelBedNew bed210_1;
	private PanelBedNew bed209_2;
	private PanelBedNew bed209_1;
	private PanelBedNew bed208_2;
	private PanelBedNew bed208_1;
	private PanelBedNew bed207_2;
	private PanelBedNew bed207_1;
	private PanelBedNew bed206_4;
	private PanelBedNew bed206_3;
	private PanelBedNew bed206_2;
	private PanelBedNew bed206_1;
	private PanelBedNew bed205_2;
	private PanelBedNew bed205_1;
	private PanelBedNew bed204_2;
	private PanelBedNew bed204_1;
	private PanelBedNew bed203_2;
	private PanelBedNew bed203_1;
	private PanelBedNew bed202;
	private PanelBedNew bed201;
	private Object controllerRoomList;
	private Date date;
	private List<String> bedHoldList;

	private JPanel panel_2;

	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private static final Color back = new Color(204, 218, 223);
	private static final Color shallow = new Color(207, 218, 224);
	private static final Color dark = new Color(129, 151, 164);

	public PanelSecondFloor(ControllerRoomList controllerRoomList, Date date) {
		super();
		setLayout(new FlowLayout());
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
				.getDefaultToolkit().getScreenSize().height);
		setPreferredSize(getSize());
		this.controllerRoomList = controllerRoomList;
		this.date = date;
		this.bedHoldList = controllerRoomList.getRoomsOnBedHold();
		setBorder(null);
		setOpaque(false);

		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(994, 735));
		panel_2.setLayout(null);
		panel_2.setOpaque(false);
		panel_2.setBounds(5, 45, 897, 253);
		add(panel_2);

		final JLabel label = new JLabel(new ImageIcon("img//IInd Floor.png"));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setIconTextGap(0);
		// label.setComponentZOrder(this, 0);
		label.setBounds(0, -45, 996, 768);
		panel_2.add(label);

		bed201 = new PanelBedNew();
		bed201.setRoomNo("201");
		bed201.setBounds(738, 60, 44, 28);
		panel_2.add(bed201);

		bed202 = new PanelBedNew();
		bed202.setRoomNo("202");
		bed202.setBounds(538, 60, 44, 28);
		panel_2.add(bed202);

		bed203_1 = new PanelBedNew();
		bed203_1.setRoomNo("203-1");
		bed203_1.setBounds(482, 60, 44, 28);
		panel_2.add(bed203_1);

		bed203_2 = new PanelBedNew();
		bed203_2.setRoomNo("203-2");
		bed203_2.setBounds(482, 96, 44, 28);
		panel_2.add(bed203_2);

		bed204_1 = new PanelBedNew();
		bed204_1.setRoomNo("204-1");
		bed204_1.setBounds(405, 60, 44, 28);
		panel_2.add(bed204_1);

		bed204_2 = new PanelBedNew();
		bed204_2.setRoomNo("204-2");
		bed204_2.setBounds(405, 96, 44, 28);
		panel_2.add(bed204_2);

		bed205_1 = new PanelBedNew();
		bed205_1.setRoomNo("205-1");
		bed205_1.setBounds(352, 60, 43, 28);
		panel_2.add(bed205_1);

		bed205_2 = new PanelBedNew();
		bed205_2.setRoomNo("205-2");
		bed205_2.setBounds(352, 96, 44, 28);
		panel_2.add(bed205_2);

		bed206_1 = new PanelBedNew();
		bed206_1.setRoomNo("206-1");
		bed206_1.setBounds(184, 60, 44, 28);
		panel_2.add(bed206_1);

		bed206_2 = new PanelBedNew();
		bed206_2.setRoomNo("206-2");
		bed206_2.setBounds(256, 60, 44, 28);
		panel_2.add(bed206_2);

		bed206_3 = new PanelBedNew();
		bed206_3.setRoomNo("206-3");
		bed206_3.setBounds(184, 96, 44, 25);
		panel_2.add(bed206_3);

		bed206_4 = new PanelBedNew();
		bed206_4.setRoomNo("206-4");
		bed206_4.setBounds(256, 96, 44, 28);
		panel_2.add(bed206_4);

		bed207_1 = new PanelBedNew();
		bed207_1.setRoomNo("207-1");
		bed207_1.setBounds(205, 175, 44, 28);
		panel_2.add(bed207_1);

		bed207_2 = new PanelBedNew();
		bed207_2.setRoomNo("207-2");
		bed207_2.setBounds(205, 215, 44, 28);
		panel_2.add(bed207_2);

		bed208_1 = new PanelBedNew();
		bed208_1.setRoomNo("208-1");
		bed208_1.setBounds(287, 175, 42, 28);
		panel_2.add(bed208_1);

		bed208_2 = new PanelBedNew();
		bed208_2.setRoomNo("208-2");
		bed208_2.setBounds(287, 215, 42, 28);
		panel_2.add(bed208_2);

		bed209_1 = new PanelBedNew();
		bed209_1.setRoomNo("209-1");
		bed209_1.setBounds(338, 175, 44, 28);
		panel_2.add(bed209_1);

		bed209_2 = new PanelBedNew();
		bed209_2.setRoomNo("209-2");
		bed209_2.setBounds(338, 215, 44, 28);
		panel_2.add(bed209_2);

		bed210_1 = new PanelBedNew();
		bed210_1.setRoomNo("210-1");
		bed210_1.setBounds(420, 175, 44, 28);
		panel_2.add(bed210_1);

		bed210_2 = new PanelBedNew();
		bed210_2.setRoomNo("210-2");
		bed210_2.setBounds(420, 215, 44, 28);
		panel_2.add(bed210_2);

		bed211_1 = new PanelBedNew();
		bed211_1.setRoomNo("211-1");
		bed211_1.setBounds(470, 175, 40, 28);
		panel_2.add(bed211_1);

		bed211_2 = new PanelBedNew();
		bed211_2.setRoomNo("211-2");
		bed211_2.setBounds(470, 216, 40, 28);
		panel_2.add(bed211_2);

		bed212_1 = new PanelBedNew();
		bed212_1.setRoomNo("212-1");
		bed212_1.setBounds(517, 270, 40, 28);
		panel_2.add(bed212_1);

		bed212_2 = new PanelBedNew();
		bed212_2.setRoomNo("212-2");
		bed212_2.setBounds(562, 270, 40, 28);
		panel_2.add(bed212_2);

		bed212_3 = new PanelBedNew();
		bed212_3.setRoomNo("212-3");
		bed212_3.setBounds(517, 322, 40, 28);
		panel_2.add(bed212_3);

		bed212_4 = new PanelBedNew();
		bed212_4.setRoomNo("212-4");
		bed212_4.setBounds(562, 322, 40, 28);
		panel_2.add(bed212_4);

		bed213_1 = new PanelBedNew();
		bed213_1.setRoomNo("213-1");
		bed213_1.setBounds(517, 388, 40, 28);
		panel_2.add(bed213_1);

		bed213_2 = new PanelBedNew();
		bed213_2.setRoomNo("213-2");
		bed213_2.setBounds(562, 388, 40, 28);
		panel_2.add(bed213_2);

		bed213_3 = new PanelBedNew();
		bed213_3.setRoomNo("213-3");
		bed213_3.setBounds(517, 434, 40, 28);
		panel_2.add(bed213_3);

		bed213_4 = new PanelBedNew();
		bed213_4.setRoomNo("213-4");
		bed213_4.setBounds(562, 434, 40, 28);
		panel_2.add(bed213_4);

		bed230_1 = new PanelBedNew();
		bed230_1.setRoomNo("230-1");
		bed230_1.setBedOccupied(true);
		bed230_1.setBounds(725, 300, 40, 27);
		panel_2.add(bed230_1);

		bed230_2 = new PanelBedNew();
		bed230_2.setRoomNo("230-2");
		bed230_2.setBounds(740, 330, 40, 27);
		panel_2.add(bed230_2);

		bed231_1 = new PanelBedNew();
		bed231_1.setRoomNo("231-1");
		bed231_1.setBedOccupied(true);
		bed231_1.setBounds(706, 240, 40, 28);
		panel_2.add(bed231_1);

		bed231_2 = new PanelBedNew();
		bed231_2.setRoomNo("231-2");
		bed231_2.setBounds(750, 240, 40, 28);
		panel_2.add(bed231_2);

		bed232_1 = new PanelBedNew();
		bed232_1.setRoomNo("232-1");
		bed232_1.setBounds(725, 175, 40, 26);
		panel_2.add(bed232_1);

		bed232_2 = new PanelBedNew();
		bed232_2.setRoomNo("232-2");
		bed232_2.setBounds(695, 204, 40, 26);
		panel_2.add(bed232_2);

		bed232_3 = new PanelBedNew();
		bed232_3.setRoomNo("232-3");
		bed232_3.setBounds(750, 204, 40, 26);
		panel_2.add(bed232_3);

		bed229 = new PanelBedNew();
		bed229.setRoomNo("229");
		bed229.setBounds(685, 375, 44, 28);
		panel_2.add(bed229);

		bed228_1 = new PanelBedNew();
		bed228_1.setRoomNo("228-1");
		bed228_1.setBedOccupied(true);
		bed228_1.setBounds(650, 425, 40, 28);
		panel_2.add(bed228_1);

		bed228_2 = new PanelBedNew();
		bed228_2.setRoomNo("228-2");
		bed228_2.setBounds(688, 450, 40, 28);
		panel_2.add(bed228_2);

		bed227_1 = new PanelBedNew();
		bed227_1.setRoomNo("227-1");
		bed227_1.setBounds(650, 510, 40, 28);
		panel_2.add(bed227_1);

		bed227_2 = new PanelBedNew();
		bed227_2.setRoomNo("227-2");
		bed227_2.setBounds(690, 528, 40, 28);
		panel_2.add(bed227_2);

		bed214_1 = new PanelBedNew();
		bed214_1.setRoomNo("214-1");
		bed214_1.setBounds(405, 483, 40, 28);
		panel_2.add(bed214_1);

		bed214_2 = new PanelBedNew();
		bed214_2.setRoomNo("214-2");
		bed214_2.setBounds(405, 520, 40, 28);
		panel_2.add(bed214_2);

		bed215_1 = new PanelBedNew();
		bed215_1.setRoomNo("215-1");
		bed215_1.setBounds(352, 484, 40, 28);
		panel_2.add(bed215_1);

		bed215_2 = new PanelBedNew();
		bed215_2.setRoomNo("215-2");
		bed215_2.setBounds(352, 520, 40, 28);
		panel_2.add(bed215_2);

		bed216_1 = new PanelBedNew();
		bed216_1.setRoomNo("216-1");
		bed216_1.setBounds(270, 484, 40, 28);
		panel_2.add(bed216_1);

		bed216_2 = new PanelBedNew();
		bed216_2.setRoomNo("216-2");
		bed216_2.setBounds(270, 520, 40, 28);
		panel_2.add(bed216_2);

		bed217_1 = new PanelBedNew();
		bed217_1.setRoomNo("217-1");
		bed217_1.setBounds(175, 483, 40, 28);
		panel_2.add(bed217_1);

		bed217_2 = new PanelBedNew();
		bed217_2.setRoomNo("217-2");
		bed217_2.setBedOccupied(true);
		bed217_2.setBounds(175, 520, 40, 28);
		panel_2.add(bed217_2);

		bed218_1 = new PanelBedNew();
		bed218_1.setRoomNo("218-1");
		bed218_1.setBounds(96, 483, 40, 28);
		panel_2.add(bed218_1);

		bed218_2 = new PanelBedNew();
		bed218_2.setRoomNo("218-2");
		bed218_2.setBounds(96, 520, 40, 28);
		panel_2.add(bed218_2);

		bed219_1 = new PanelBedNew();
		bed219_1.setRoomNo("219-1");
		bed219_1.setBounds(98, 605, 40, 28);
		panel_2.add(bed219_1);

		bed219_2 = new PanelBedNew();
		bed219_2.setRoomNo("219-2");
		bed219_2.setBounds(98, 640, 40, 28);
		panel_2.add(bed219_2);

		bed220_1 = new PanelBedNew();
		bed220_1.setRoomNo("220-1");
		bed220_1.setBounds(180, 605, 40, 28);
		panel_2.add(bed220_1);

		bed220_2 = new PanelBedNew();
		bed220_2.setRoomNo("220-2");
		bed220_2.setBounds(180, 643, 40, 28);
		panel_2.add(bed220_2);

		bed221_1 = new PanelBedNew();
		bed221_1.setRoomNo("221-1");
		bed221_1.setBedOccupied(true);
		bed221_1.setBounds(232, 605, 40, 28);
		panel_2.add(bed221_1);

		bed221_2 = new PanelBedNew();
		bed221_2.setRoomNo("221-2");
		bed221_2.setBounds(232, 643, 40, 28);
		panel_2.add(bed221_2);

		bed222_1 = new PanelBedNew();
		bed222_1.setRoomNo("222-1");
		bed222_1.setBounds(315, 605, 40, 28);
		panel_2.add(bed222_1);

		bed222_2 = new PanelBedNew();
		bed222_2.setRoomNo("222-2");
		bed222_2.setBounds(315, 643, 40, 28);
		panel_2.add(bed222_2);

		bed223_1 = new PanelBedNew();
		bed223_1.setRoomNo("223-1");
		bed223_1.setBounds(361, 605, 40, 28);
		panel_2.add(bed223_1);

		bed223_2 = new PanelBedNew();
		bed223_2.setRoomNo("223-2");
		bed223_2.setBounds(361, 643, 40, 28);
		panel_2.add(bed223_2);

		bed224_1 = new PanelBedNew();
		bed224_1.setRoomNo("224-1");
		bed224_1.setBounds(445, 605, 40, 28);
		panel_2.add(bed224_1);

		bed224_2 = new PanelBedNew();
		bed224_2.setRoomNo("224-2");
		bed224_2.setBounds(445, 643, 40, 28);
		panel_2.add(bed224_2);

		bed225_1 = new PanelBedNew();
		bed225_1.setRoomNo("225-1");
		bed225_1.setBounds(502, 605, 40, 28);
		panel_2.add(bed225_1);

		bed225_2 = new PanelBedNew();
		bed225_2.setRoomNo("225-2");
		bed225_2.setBedOccupied(true);
		bed225_2.setBounds(502, 643, 40, 28);
		panel_2.add(bed225_2);

		bed226_1 = new PanelBedNew();
		bed226_1.setRoomNo("226-1");
		bed226_1.setBedOccupied(true);
		bed226_1.setBounds(577, 608, 40, 28);
		panel_2.add(bed226_1);

		bed226_2 = new PanelBedNew();
		bed226_2.setRoomNo("226-2");
		bed226_2.setBounds(577, 647, 40, 28);
		panel_2.add(bed226_2);

		// updateRoomCategoryCombo();
		createMap();
		fillList1();
		fillList2();
	}

	public void createMap() {
		roomMap.put("201", bed201);

		roomMap.put("202", bed202);

		roomMap.put("203-1", bed203_1);
		roomMap.put("203-2", bed203_2);

		roomMap.put("204-1", bed204_1);
		roomMap.put("204-2", bed204_2);

		roomMap.put("205-1", bed205_1);
		roomMap.put("205-2", bed205_2);

		roomMap.put("206-1", bed206_1);
		roomMap.put("206-2", bed206_2);
		roomMap.put("206-3", bed206_3);
		roomMap.put("206-4", bed206_4);

		roomMap.put("207-1", bed207_1);
		roomMap.put("207-2", bed207_2);

		roomMap.put("208-1", bed208_1);
		roomMap.put("208-2", bed208_2);

		roomMap.put("209-1", bed209_1);
		roomMap.put("209-2", bed209_2);

		roomMap.put("210-1", bed210_1);
		roomMap.put("210-2", bed210_2);

		roomMap.put("211-1", bed211_1);
		roomMap.put("211-2", bed211_2);

		roomMap.put("212-1", bed212_1);
		roomMap.put("212-2", bed212_2);
		roomMap.put("212-3", bed212_3);
		roomMap.put("212-4", bed212_4);

		roomMap.put("213-1", bed213_1);
		roomMap.put("213-2", bed213_2);
		roomMap.put("213-3", bed213_3);
		roomMap.put("213-4", bed213_4);

		roomMap.put("214-1", bed214_1);
		roomMap.put("214-2", bed214_2);

		roomMap.put("215-1", bed215_1);
		roomMap.put("215-2", bed215_2);

		roomMap.put("216-1", bed216_1);
		roomMap.put("216-2", bed216_2);

		roomMap.put("217-1", bed217_1);
		roomMap.put("217-2", bed217_2);

		roomMap.put("218-1", bed218_1);
		roomMap.put("218-2", bed218_2);

		roomMap.put("219-1", bed219_1);
		roomMap.put("219-2", bed219_2);

		roomMap.put("220-1", bed220_1);
		roomMap.put("220-2", bed220_2);

		roomMap.put("221-1", bed221_1);
		roomMap.put("221-2", bed221_2);

		roomMap.put("222-1", bed222_1);
		roomMap.put("222-2", bed222_2);

		roomMap.put("223-1", bed223_1);
		roomMap.put("223-2", bed223_2);

		roomMap.put("224-1", bed224_1);
		roomMap.put("224-2", bed224_2);

		roomMap.put("225-1", bed225_1);
		roomMap.put("225-2", bed225_2);

		roomMap.put("226-1", bed226_1);
		roomMap.put("226-2", bed226_2);

		roomMap.put("227-1", bed227_1);
		roomMap.put("227-2", bed227_2);

		roomMap.put("228-1", bed228_1);
		roomMap.put("228-2", bed228_2);

		roomMap.put("229", bed229);

		roomMap.put("230-1", bed230_1);
		roomMap.put("230-2", bed230_2);

		roomMap.put("231-1", bed231_1);
		roomMap.put("231-2", bed231_2);

		roomMap.put("232-1", bed232_1);
		roomMap.put("232-2", bed232_2);
		roomMap.put("232-3", bed232_3);
	}

	// methods to fill the room list as per map.
	public void fillList1() {
		List<Rooms> rooms = null;
		try {
			rooms = MedrexClientManager.getInstance()
					.getRoomStatusForResidents(date, "2nd floor south wing");
			for (Rooms room : rooms) {
				if (roomMap.get(room.getCurrentRoom()) != null) {
					// System.out.println(room.getCurrentFloor()+", "+
					// room.getCurrentRoom()+", "+room.getStatus()+", "+
					// room.getTimeSince()+", "+room.getResmain().getUserPass()+", "+room.getResmain().getUserName()+", "+room.getResmain().getSerial());
					roomMap.get(room.getCurrentRoom()).setResidentName(
							room.getResmain().getUserPass()/*
															 * .toLowerCase ()
															 */+ ","
									+ room.getResmain().getUserName()/*
																	 * .toLowerCase
																	 * ( ) ,
																	 * room .
																	 * getResmain
																	 * ( ) .
																	 * getImg (
																	 * )
																	 */);
					roomMap.get(room.getCurrentRoom()).setRoomNo(
							room.getCurrentRoom());
					roomMap.get(room.getCurrentRoom()).setGender(
							room.getResmain().getSex());

					Iterator<String> it = bedHoldList.iterator();
					while (it.hasNext()) {
						String strBedHold = it.next();
						PanelBedNew temp = roomMap.get(strBedHold);
						if (temp != null) {

							temp.setBedOccupied(true);

						}
					}
					roomMap.get(room.getCurrentRoom()).setBedOccupied(false);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fillList2() {
		List<Rooms> rooms = null;
		try {
			rooms = MedrexClientManager.getInstance()
					.getRoomStatusForResidents(date, "Main and north wing");
			for (Rooms room : rooms) {
				if (roomMap.get(room.getCurrentRoom()) != null) {
					// System.out.println(room.getCurrentFloor()+", "+
					// room.getCurrentRoom()+", "+room.getStatus()+", "+
					// room.getTimeSince()+", "+room.getResmain().getUserPass()+", "+room.getResmain().getUserName()+", "+room.getResmain().getSerial());
					roomMap.get(room.getCurrentRoom()).setResidentName(
							room.getResmain().getUserPass()/*
															 * .toLowerCase ()
															 */+ ","
									+ room.getResmain().getUserName()/*
																	 * .toLowerCase
																	 * ( ) ,
																	 * room .
																	 * getResmain
																	 * ( ) .
																	 * getImg (
																	 * )
																	 */);
					roomMap.get(room.getCurrentRoom()).setRoomNo(
							room.getCurrentRoom());
					roomMap.get(room.getCurrentRoom()).setGender(
							room.getResmain().getSex());
					Iterator<String> it = bedHoldList.iterator();
					while (it.hasNext()) {
						String strBedHold = it.next();
						PanelBedNew temp = roomMap.get(strBedHold);
						if (temp != null) {

							temp.setBedOccupied(true);

						}
					}
					roomMap.get(room.getCurrentRoom()).setBedOccupied(false);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SwingUtils.wrapInDialog(
				new PanelSecondFloor(new ControllerRoomList(), new Date()))
				.setVisible(true);

	}

	public String getTitle() {

		return "Second Floor";
	}

}
