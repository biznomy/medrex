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
import medrex.client.constants.Global;
import medrex.client.main.resident.personalInfo.ControllerRoomList;
import medrex.client.utils.SwingUtils;
import medrex.client.utils.controls.JxTableMedrex;
import medrex.commons.dataObj.Rooms;

public class PanelFirstFloor extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7542335523189875406L;
	// south wing
	private PanelBedNew bed120_2;
	private PanelBedNew bed129_3;
	private PanelBedNew bed129_2;
	private PanelBedNew bed129_1;
	private PanelBedNew bed128;
	private PanelBedNew bed127_2;
	private PanelBedNew bed127_1;
	private PanelBedNew bed126_2;
	private PanelBedNew bed126_1;
	private PanelBedNew bed124;
	private PanelBedNew bed125;
	private PanelBedNew bed122_2;
	private PanelBedNew bed122_1;
	private PanelBedNew bed123_2;
	private PanelBedNew bed123_1;
	private PanelBedNew bed121_2;
	private PanelBedNew bed121_1;
	private PanelBedNew bed120_1;
	private PanelBedNew bed119_2;
	private PanelBedNew bed119_1;
	private PanelBedNew bed118_2;
	private PanelBedNew bed118_1;
	private PanelBedNew bed117_2;
	private PanelBedNew bed117_1;
	private PanelBedNew bed116_2;
	private PanelBedNew bed116_1;
	private PanelBedNew bed115_2;
	private PanelBedNew bed115_1;
	private PanelBedNew bed114_2;
	private PanelBedNew bed114_1;
	private PanelBedNew bed113_2;
	private PanelBedNew bed113_1;
	private PanelBedNew bed112_2;
	private PanelBedNew bed112_1;
	private PanelBedNew bed111_2;
	private PanelBedNew bed111_1;
	private PanelBedNew bed110_4;
	private PanelBedNew bed110_3;
	private PanelBedNew bed110_2;
	private PanelBedNew bed110_1;
	private PanelBedNew bed109_4;
	private PanelBedNew bed109_3;
	private PanelBedNew bed109_2;
	private PanelBedNew bed109_1;
	private PanelBedNew bed108_2;
	private PanelBedNew bed108_1;
	private PanelBedNew bed107_2;
	private PanelBedNew bed107_1;
	private PanelBedNew bed106_2;
	private PanelBedNew bed106_1;
	private PanelBedNew bed105_2;
	private PanelBedNew bed105_1;
	private PanelBedNew bed101_2;
	private PanelBedNew bed101_1;
	private PanelBedNew bed102_2;
	private PanelBedNew bed102_1;
	private PanelBedNew bed103_2;
	private PanelBedNew bed103_1;
	private PanelBedNew bed104_4;
	private PanelBedNew bed104_3;
	private PanelBedNew bed104_2;
	private PanelBedNew bed104_1;

	// main north wing

	private Date date;
	private ControllerRoomList controllerRoomList;
	private JxTableMedrex table;

	// private JxComboBox cmbFloorType;
	private JPanel panel_2;
	private PanelFirstFloor pf1;
	private PanelSecondFloor pf2;
	private PanelFirstFloor thisPanel;
	private static Map<String, PanelBedNew> roomMap = new HashMap<String, PanelBedNew>();
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private static final Color back = new Color(204, 218, 223);
	private static final Color shallow = new Color(207, 218, 224);
	private static final Color dark = new Color(129, 151, 164);
	private List bedHoldList = null;

	public PanelFirstFloor(final ControllerRoomList controllerRoomList,
			Date date) {
		super();
		setLayout(new FlowLayout());
		this.date = date;
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
				.getDefaultToolkit().getScreenSize().height);
		setPreferredSize(getSize());
		this.controllerRoomList = controllerRoomList;
		this.date = date;
		this.bedHoldList = controllerRoomList.getRoomsOnBedHold();
		Global.panelRoomPopUp = this;
		setBorder(null);
		setOpaque(false);

		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(994, 735));
		panel_2.setLayout(null);
		panel_2.setOpaque(false);
		panel_2.setBounds(5, 45, 897, 252);

		add(panel_2);

		// cmbFloorType = new JxComboBox();
		// cmbFloorType.setBounds(218, 354, 226, 25);
		// panel_2.add(cmbFloorType);
		// cmbFloorType.setOpaque(false);
		// cmbFloorType.setBackground(Color.WHITE);
		// cmbFloorType.setForeground(DEF_COLOR);
		// cmbFloorType.setArc(0.4f);
		// cmbFloorType.setBorder(new LineBorder(DEF_COLOR, 1, false));
		// cmbFloorType.addActionListener(new ActionListener(){
		// public void actionPerformed(ActionEvent e) {
		// updateRoomSubCategory();
		// }
		// });

		// final JLabel fLabel = new JLabel();
		// fLabel.setBounds(142, 350, 70, 33);
		// panel_2.add(fLabel);
		// fLabel.setForeground(Color.WHITE);
		// fLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		// fLabel.setText("FLOOR #");
		//
		// final JLabel fLabel_1 = new JLabel();
		// fLabel_1.setBounds(180, 312, 205, 19);
		// panel_2.add(fLabel_1);
		// fLabel_1.setText("New JLabel");
		// fLabel_1.setForeground(Color.WHITE);
		// fLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		// fLabel_1.setText(df.format(date));

		final JLabel label = new JLabel(new ImageIcon("img//Ist Floor1.png"));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setIconTextGap(0);
		// label.setComponentZOrder(this, 0);
		label.setBounds(0, 0, 996, 768);
		panel_2.add(label);

		bed104_1 = new PanelBedNew();
		bed104_1.setRoomNo("104-1");
		bed104_1.setBounds(160, 74, 44, 28);
		panel_2.add(bed104_1);

		bed104_2 = new PanelBedNew();
		bed104_2.setRoomNo("104-2");
		bed104_2.setBounds(230, 74, 44, 28);
		panel_2.add(bed104_2);

		bed104_3 = new PanelBedNew();
		bed104_3.setRoomNo("104-3");
		bed104_3.setBounds(160, 116, 44, 28);
		panel_2.add(bed104_3);

		bed104_4 = new PanelBedNew();
		bed104_4.setRoomNo("104-4");
		bed104_4.setBounds(230, 116, 44, 28);
		panel_2.add(bed104_4);

		bed103_1 = new PanelBedNew();
		bed103_1.setRoomNo("103-1");
		bed103_1.setBounds(328, 74, 44, 28);
		panel_2.add(bed103_1);

		bed103_2 = new PanelBedNew();
		bed103_2.setRoomNo("103-2");
		bed103_2.setBounds(328, 116, 44, 28);
		panel_2.add(bed103_2);

		bed102_1 = new PanelBedNew();
		bed102_1.setRoomNo("102-1");
		bed102_1.setBounds(382, 74, 44, 28);
		panel_2.add(bed102_1);

		bed102_2 = new PanelBedNew();
		bed102_2.setRoomNo("102-2");
		bed102_2.setBounds(382, 117, 44, 28);
		panel_2.add(bed102_2);

		bed101_1 = new PanelBedNew();
		bed101_1.setRoomNo("101-1");
		bed101_1.setBounds(463, 73, 44, 29);
		panel_2.add(bed101_1);

		bed101_2 = new PanelBedNew();
		bed101_2.setRoomNo("101-2");
		bed101_2.setBounds(463, 116, 44, 28);
		panel_2.add(bed101_2);

		bed105_1 = new PanelBedNew();
		bed105_1.setRoomNo("105-1");
		bed105_1.setBounds(182, 202, 44, 28);
		panel_2.add(bed105_1);

		bed105_2 = new PanelBedNew();
		bed105_2.setRoomNo("105-2");
		bed105_2.setBounds(182, 242, 44, 28);
		panel_2.add(bed105_2);

		bed106_1 = new PanelBedNew();
		bed106_1.setRoomNo("106-1");
		bed106_1.setBounds(262, 202, 44, 28);
		panel_2.add(bed106_1);

		bed106_2 = new PanelBedNew();
		bed106_2.setRoomNo("106-2");
		bed106_2.setBounds(262, 242, 44, 28);
		panel_2.add(bed106_2);

		bed107_1 = new PanelBedNew();
		bed107_1.setRoomNo("107-1");
		bed107_1.setBounds(315, 202, 44, 28);
		panel_2.add(bed107_1);

		bed107_2 = new PanelBedNew();
		bed107_2.setRoomNo("107-2");
		bed107_2.setBounds(315, 242, 44, 28);
		panel_2.add(bed107_2);

		bed108_1 = new PanelBedNew();
		bed108_1.setRoomNo("108-1");
		bed108_1.setBounds(398, 202, 40, 28);
		panel_2.add(bed108_1);

		bed108_2 = new PanelBedNew();
		bed108_2.setRoomNo("108-2");
		bed108_2.setBounds(398, 242, 40, 28);
		panel_2.add(bed108_2);

		bed109_1 = new PanelBedNew();
		bed109_1.setRoomNo("109-1");
		bed109_1.setBounds(450, 201, 40, 28);
		panel_2.add(bed109_1);

		bed109_2 = new PanelBedNew();
		bed109_2.setRoomNo("109-2");
		bed109_2.setBounds(450, 242, 40, 28);
		panel_2.add(bed109_2);

		bed109_3 = new PanelBedNew();
		bed109_3.setRoomNo("109-3");
		bed109_3.setBounds(500, 201, 44, 28);
		panel_2.add(bed109_3);

		bed109_4 = new PanelBedNew();
		bed109_4.setRoomNo("109-4");
		bed109_4.setBounds(500, 242, 44, 28);
		panel_2.add(bed109_4);

		bed110_1 = new PanelBedNew();
		bed110_1.setRoomNo("110-1");
		bed110_1.setBounds(492, 395, 44, 28);
		panel_2.add(bed110_1);

		bed110_2 = new PanelBedNew();
		bed110_2.setRoomNo("110-2");
		bed110_2.setBounds(540, 395, 44, 28);
		panel_2.add(bed110_2);

		bed110_3 = new PanelBedNew();
		bed110_3.setRoomNo("110-3");
		bed110_3.setBounds(492, 440, 44, 28);
		panel_2.add(bed110_3);

		bed110_4 = new PanelBedNew();
		bed110_4.setRoomNo("110-4");
		bed110_4.setBounds(540, 440, 44, 28);
		panel_2.add(bed110_4);

		bed111_1 = new PanelBedNew();
		bed111_1.setRoomNo("111-1");
		bed111_1.setBounds(377, 496, 44, 28);
		panel_2.add(bed111_1);

		bed111_2 = new PanelBedNew();
		bed111_2.setRoomNo("111-2");
		bed111_2.setBounds(377, 540, 44, 28);
		panel_2.add(bed111_2);

		bed112_1 = new PanelBedNew();
		bed112_1.setRoomNo("112-1");
		bed112_1.setBounds(324, 497, 44, 28);
		panel_2.add(bed112_1);

		bed112_2 = new PanelBedNew();
		bed112_2.setRoomNo("112-2");
		bed112_2.setBounds(324, 540, 44, 28);
		panel_2.add(bed112_2);

		bed113_1 = new PanelBedNew();
		bed113_1.setRoomNo("113-1");
		bed113_1.setBounds(242, 497, 44, 28);
		panel_2.add(bed113_1);

		bed113_2 = new PanelBedNew();
		bed113_2.setRoomNo("113-2");
		bed113_2.setBounds(242, 540, 44, 28);
		panel_2.add(bed113_2);

		bed114_1 = new PanelBedNew();
		bed114_1.setRoomNo("114-1");
		bed114_1.setBounds(145, 497, 44, 28);
		panel_2.add(bed114_1);

		bed114_2 = new PanelBedNew();
		bed114_2.setRoomNo("114-2");
		bed114_2.setBedOccupied(true);
		bed114_2.setBounds(145, 540, 44, 28);
		panel_2.add(bed114_2);

		bed115_1 = new PanelBedNew();
		bed115_1.setRoomNo("115-1");
		bed115_1.setBounds(65, 497, 44, 28);
		panel_2.add(bed115_1);

		bed115_2 = new PanelBedNew();
		bed115_2.setRoomNo("115-2");
		bed115_2.setBounds(65, 540, 44, 28);
		panel_2.add(bed115_2);

		bed116_1 = new PanelBedNew();
		bed116_1.setRoomNo("116-1");
		bed116_1.setBounds(65, 620, 44, 28);
		panel_2.add(bed116_1);

		bed116_2 = new PanelBedNew();
		bed116_2.setRoomNo("116-2");
		bed116_2.setBounds(65, 666, 44, 28);
		panel_2.add(bed116_2);

		bed117_1 = new PanelBedNew();
		bed117_1.setRoomNo("117-1");
		bed117_1.setBounds(142, 620, 47, 28);
		panel_2.add(bed117_1);

		bed117_2 = new PanelBedNew();
		bed117_2.setRoomNo("117-2");
		bed117_2.setBounds(142, 666, 47, 28);
		panel_2.add(bed117_2);

		bed118_1 = new PanelBedNew();
		bed118_1.setRoomNo("118-1");
		bed118_1.setBedOccupied(true);
		bed118_1.setBounds(202, 620, 44, 28);
		panel_2.add(bed118_1);

		bed118_2 = new PanelBedNew();
		bed118_2.setRoomNo("118-2");
		bed118_2.setBounds(202, 665, 47, 29);
		panel_2.add(bed118_2);

		bed119_1 = new PanelBedNew();
		bed119_1.setRoomNo("119-1");
		bed119_1.setBounds(282, 620, 44, 28);
		panel_2.add(bed119_1);

		bed119_2 = new PanelBedNew();
		bed119_2.setRoomNo("119-2");
		bed119_2.setBounds(282, 666, 44, 28);
		panel_2.add(bed119_2);

		bed120_1 = new PanelBedNew();
		bed120_1.setRoomNo("120");
		bed120_1.setBounds(340, 620, 44, 28);
		panel_2.add(bed120_1);

		bed121_1 = new PanelBedNew();
		bed121_1.setRoomNo("121-1");
		bed121_1.setBounds(418, 620, 44, 28);
		panel_2.add(bed121_1);

		bed121_2 = new PanelBedNew();
		bed121_2.setRoomNo("121-2");
		bed121_2.setBounds(418, 666, 44, 28);
		panel_2.add(bed121_2);

		bed123_1 = new PanelBedNew();
		bed123_1.setRoomNo("123-1");
		bed123_1.setBounds(470, 620, 44, 28);
		panel_2.add(bed123_1);

		bed123_2 = new PanelBedNew();
		bed123_2.setRoomNo("123-2");
		bed123_2.setBedOccupied(true);
		bed123_2.setBounds(470, 666, 44, 28);
		panel_2.add(bed123_2);

		bed122_1 = new PanelBedNew();
		bed122_1.setRoomNo("122-1");
		bed122_1.setBounds(550, 618, 44, 28);
		panel_2.add(bed122_1);

		bed122_2 = new PanelBedNew();
		bed122_2.setRoomNo("122-2");
		bed122_2.setBounds(550, 666, 44, 28);
		panel_2.add(bed122_2);

		bed125 = new PanelBedNew();
		bed125.setRoomNo("125");
		bed125.setBounds(655, 582, 44, 28);
		panel_2.add(bed125);

		bed124 = new PanelBedNew();
		bed124.setRoomNo("124");
		bed124.setBounds(655, 665, 44, 28);
		panel_2.add(bed124);

		bed126_1 = new PanelBedNew();
		bed126_1.setRoomNo("126-1");
		bed126_1.setBedOccupied(true);
		bed126_1.setBounds(630, 525, 40, 26);
		panel_2.add(bed126_1);

		bed126_2 = new PanelBedNew();
		bed126_2.setRoomNo("126-2");
		bed126_2.setBounds(670, 543, 40, 26);
		panel_2.add(bed126_2);

		bed127_1 = new PanelBedNew();
		bed127_1.setRoomNo("127-1");
		bed127_1.setBounds(628, 438, 42, 28);
		panel_2.add(bed127_1);

		bed127_2 = new PanelBedNew();
		bed127_2.setRoomNo("127-2");
		bed127_2.setBounds(666, 462, 44, 28);
		panel_2.add(bed127_2);

		bed128 = new PanelBedNew();
		bed128.setRoomNo("128");
		bed128.setBedOccupied(true);
		bed128.setBounds(665, 393, 44, 28);
		panel_2.add(bed128);

		bed129_1 = new PanelBedNew();
		bed129_1.setRoomNo("129");
		bed129_1.setBounds(668, 315, 44, 28);
		panel_2.add(bed129_1);

		bed129_2 = new PanelBedNew();
		bed129_2.setRoomNo("129-2");
		bed129_2.setBounds(718, 315, 44, 28);
		panel_2.add(bed129_2);

		bed129_3 = new PanelBedNew();
		bed129_3.setRoomNo("129-3");
		bed129_3.setBounds(698, 345, 44, 28);
		panel_2.add(bed129_3);

		bed120_2 = new PanelBedNew();
		bed120_2.setRoomNo("120");
		bed120_2.setBounds(340, 666, 44, 28);
		panel_2.add(bed120_2);

		createMap();
		fillList1();
		fillList2();

	}

	public void createMap() {
		roomMap.put("101-1", bed101_1);
		roomMap.put("101-2", bed101_2);

		roomMap.put("102-1", bed102_1);
		roomMap.put("102-2", bed102_2);

		roomMap.put("103-1", bed103_1);
		roomMap.put("103-2", bed103_2);

		roomMap.put("104-1", bed104_1);
		roomMap.put("104-2", bed104_2);
		roomMap.put("104-3", bed104_3);
		roomMap.put("104-4", bed104_4);

		roomMap.put("105-1", bed105_1);
		roomMap.put("105-2", bed105_2);
		roomMap.put("106-1", bed106_1);
		roomMap.put("106-2", bed106_2);

		roomMap.put("107-1", bed107_1);
		roomMap.put("107-2", bed107_2);

		roomMap.put("108-1", bed108_1);
		roomMap.put("108-2", bed108_2);

		roomMap.put("109-1", bed109_1);
		roomMap.put("109-2", bed109_2);
		roomMap.put("109-3", bed109_3);
		roomMap.put("109-4", bed109_4);

		roomMap.put("110-1", bed110_1);
		roomMap.put("110-2", bed110_2);
		roomMap.put("110-3", bed110_3);
		roomMap.put("110-4", bed110_4);

		roomMap.put("111-1", bed111_1);
		roomMap.put("111-2", bed111_2);

		roomMap.put("112-1", bed112_1);
		roomMap.put("112-2", bed112_2);

		roomMap.put("113-1", bed113_1);
		roomMap.put("113-2", bed113_2);

		roomMap.put("114-1", bed114_1);
		roomMap.put("114-2", bed114_2);

		roomMap.put("115-1", bed115_1);
		roomMap.put("115-2", bed115_2);

		roomMap.put("116-1", bed116_1);
		roomMap.put("116-2", bed116_2);

		roomMap.put("117-1", bed117_1);
		roomMap.put("117-2", bed117_2);

		roomMap.put("118-1", bed118_1);
		roomMap.put("118-2", bed118_2);

		roomMap.put("119-1", bed119_1);
		roomMap.put("119-2", bed119_2);

		roomMap.put("120-1", bed120_1);
		roomMap.put("120-2", bed120_2);

		roomMap.put("121-1", bed121_1);
		roomMap.put("121-2", bed121_2);

		roomMap.put("122-1", bed122_1);
		roomMap.put("122-2", bed122_2);

		roomMap.put("123-1", bed123_1);
		roomMap.put("123-2", bed123_2);

		roomMap.put("124", bed124);

		roomMap.put("125", bed125);

		roomMap.put("126-1", bed126_1);
		roomMap.put("126-2", bed126_2);

		roomMap.put("127-1", bed127_1);
		roomMap.put("127-2", bed127_2);

		roomMap.put("128", bed128);

		roomMap.put("129-1", bed129_1);
		roomMap.put("129-2", bed129_2);
		roomMap.put("129-3", bed129_3);
	}

	// methods to fill the room list as per map.
	public void fillList1() {

		List<Rooms> rooms = null;
		try {
			rooms = MedrexClientManager.getInstance()
					.getRoomStatusForResidents(date, "1st floor south wing");
			for (Rooms room : rooms) {
				if (roomMap.get(room.getCurrentRoom()) != null
						&& room.getResmain() != null) {
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
					// roomMap.get(room.getCurrentRoom()).setBedHold(true);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fillList2() {
		List<Rooms> rooms = null;
		try {
			rooms = MedrexClientManager.getInstance()
					.getRoomStatusForResidents(date, "Main North Wing");
			for (Rooms room : rooms) {
				if (roomMap.get(room.getCurrentRoom()) != null
						&& room.getResmain() != null) {
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
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PanelFirstFloor firstFloor = new PanelFirstFloor(
				new ControllerRoomList(), new Date());
		SwingUtils.wrapInDialog(firstFloor).setVisible(true);
		firstFloor.setVisible(true);

	}

	public String getTitle() {
		return "First Floor";
	}

}
