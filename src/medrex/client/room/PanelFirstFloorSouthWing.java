package medrex.client.room;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.dataObj.Rooms;

import com.sX.awt.Direction;
import com.sX.swing.JxPanel;

public class PanelFirstFloorSouthWing extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1797431734051056158L;
	// private static final Color dark = new Color(94, 120, 137);
	private PanelBed bed104_3;
	private PanelBed bed104_4;
	private PanelBed bed109_4;
	private PanelBed bed109_3;
	private PanelBed bed109_2;
	private PanelBed bed109_1;
	private PanelBed bed108_2;
	private PanelBed bed108_1;
	private PanelBed bed107_2;
	private PanelBed bed107_1;
	private PanelBed bed106_2;
	private PanelBed bed106_1;
	private PanelBed bed105_2;
	private PanelBed bed105_1;
	private PanelBed bed104_2;
	private PanelBed bed104_1;
	private PanelBed bed103_2;
	private PanelBed bed103_1;
	private PanelBed bed102_2;
	private PanelBed bed102_1;
	private PanelBed bed101_2;
	private PanelBed bed101_1;
	private static final Color dark = new Color(129, 151, 164);
	private static final Color shallow = new Color(207, 218, 224);
	// private static final Color back = new Color(204, 218, 223);
	// private static final Color back2 = new Color(232, 240, 245);
	private static Map<String, PanelBed> roomMap = new HashMap<String, PanelBed>();
	private static Date date;

	public PanelFirstFloorSouthWing(Date date) {
		super();
		this.date = date;
		setPreferredSize(new Dimension(950, 390));
		// setBackground(shallow);

		setArc(0);
		setSize(new Dimension(950, 390));
		setBorder(null);
		setLinearGradient(dark, shallow, Direction.LEFT_TO_RIGHT);
		setOpaque(false);
		setLayout(null);

		final JxPanel room101 = new JxPanel();
		room101.setBounds(38, 21, 155, 69);
		room101.setArc(0);
		room101.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room101.setBorder(new LineBorder(Color.black, 1, false));
		room101.setLayout(null);

		add(room101);

		bed101_1 = new PanelBed();
		bed101_1.setRoomNo("101-1");
		bed101_1.setBounds(10, 7, 64, 54);
		room101.add(bed101_1);

		final JxPanel room109 = new JxPanel();
		room109.setBounds(774, 170, 155, 127);
		room109.setArc(0);
		room109.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room109.setBorder(new LineBorder(Color.black, 1, false));

		bed101_2 = new PanelBed();
		bed101_2.setRoomNo("101-2");
		bed101_2.setBounds(80, 7, 64, 54);
		room101.add(bed101_2);
		room109.setLayout(null);

		add(room109);

		bed109_3 = new PanelBed();
		bed109_3.setRoomNo("109-3");
		bed109_3.setBounds(10, 65, 64, 54);
		room109.add(bed109_3);

		bed109_4 = new PanelBed();
		bed109_4.setRoomNo("109-4");
		bed109_4.setBounds(80, 65, 64, 54);
		room109.add(bed109_4);

		bed109_1 = new PanelBed();
		bed109_1.setRoomNo("109-1");
		bed109_1.setBounds(10, 7, 64, 54);
		room109.add(bed109_1);

		bed109_2 = new PanelBed();
		bed109_2.setRoomNo("109-2");
		bed109_2.setBounds(80, 7, 64, 54);
		room109.add(bed109_2);

		final JxPanel room102 = new JxPanel();
		room102.setBounds(221, 21, 155, 69);
		room102.setArc(0);
		room102.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room102.setBorder(new LineBorder(Color.black, 1, false));
		room102.setLayout(null);
		add(room102);

		bed102_1 = new PanelBed();
		bed102_1.setBounds(10, 7, 64, 54);
		bed102_1.setRoomNo("102-1");
		room102.add(bed102_1);

		bed102_2 = new PanelBed();
		bed102_2.setRoomNo("102-2");
		bed102_2.setBounds(80, 7, 64, 54);
		room102.add(bed102_2);

		final JxPanel room103 = new JxPanel();
		room103.setBorder(new LineBorder(Color.black, 1, false));
		room103.setLayout(null);
		room103.setBounds(404, 21, 155, 69);
		room103.setArc(0);
		room103.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room103.setBorder(new LineBorder(Color.black, 1, false));
		add(room103);

		bed103_1 = new PanelBed();
		bed103_1.setBounds(10, 7, 64, 54);
		bed103_1.setRoomNo("103-1");
		room103.add(bed103_1);

		bed103_2 = new PanelBed();
		bed103_2.setRoomNo("103-2");
		bed103_2.setBounds(80, 7, 64, 54);
		room103.add(bed103_2);

		final JxPanel room104 = new JxPanel();
		room104.setBorder(new LineBorder(Color.black, 1, false));
		room104.setLayout(null);
		room104.setBounds(774, 21, 155, 127);
		room104.setArc(0);
		room104.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room104.setBorder(new LineBorder(Color.black, 1, false));
		add(room104);

		bed104_1 = new PanelBed();
		bed104_1.setBounds(10, 7, 64, 54);
		bed104_1.setRoomNo("104-1");
		room104.add(bed104_1);

		bed104_2 = new PanelBed();
		bed104_2.setRoomNo("104-2");
		bed104_2.setBounds(80, 7, 64, 54);
		room104.add(bed104_2);

		bed104_4 = new PanelBed();
		bed104_4.setRoomNo("104-4");
		bed104_4.setBounds(80, 67, 64, 54);
		room104.add(bed104_4);

		bed104_3 = new PanelBed();
		bed104_3.setRoomNo("104-3");
		bed104_3.setBounds(10, 67, 64, 54);
		room104.add(bed104_3);

		final JxPanel room105 = new JxPanel();
		room105.setBorder(new LineBorder(Color.black, 1, false));
		room105.setLayout(null);
		room105.setBounds(594, 21, 155, 69);
		room105.setArc(0);
		room105.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room105.setBorder(new LineBorder(Color.black, 1, false));
		add(room105);

		bed105_1 = new PanelBed();
		bed105_1.setRoomNo("105-1");
		bed105_1.setBounds(10, 7, 64, 54);
		room105.add(bed105_1);

		bed105_2 = new PanelBed();
		bed105_2.setRoomNo("105-2");
		bed105_2.setBounds(80, 7, 64, 54);
		room105.add(bed105_2);

		final JxPanel room106 = new JxPanel();
		room106.setBorder(new LineBorder(Color.black, 1, false));
		room106.setLayout(null);
		room106.setBounds(38, 108, 155, 69);
		room106.setArc(0);
		room106.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room106.setBorder(new LineBorder(Color.black, 1, false));
		add(room106);

		bed106_1 = new PanelBed();
		bed106_1.setRoomNo("106-1");
		bed106_1.setBounds(10, 7, 64, 54);
		room106.add(bed106_1);

		bed106_2 = new PanelBed();
		bed106_2.setRoomNo("106-2");
		bed106_2.setBounds(80, 7, 64, 54);
		room106.add(bed106_2);

		final JxPanel room107 = new JxPanel();
		room107.setBorder(new LineBorder(Color.black, 1, false));
		room107.setLayout(null);
		room107.setBounds(39, 199, 155, 69);
		room107.setArc(0);
		room107.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room107.setBorder(new LineBorder(Color.black, 1, false));
		add(room107);

		bed107_1 = new PanelBed();
		bed107_1.setRoomNo("107-1");
		bed107_1.setBounds(10, 7, 64, 54);
		room107.add(bed107_1);

		bed107_2 = new PanelBed();
		bed107_2.setRoomNo("107-2");
		bed107_2.setBounds(80, 7, 64, 54);
		room107.add(bed107_2);

		final JxPanel room108 = new JxPanel();
		room108.setBorder(new LineBorder(Color.black, 1, false));
		room108.setLayout(null);
		room108.setBounds(38, 283, 155, 69);
		room108.setArc(0);
		room108.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room108.setBorder(new LineBorder(Color.black, 1, false));
		add(room108);

		bed108_1 = new PanelBed();
		bed108_1.setRoomNo("108-1");
		bed108_1.setBounds(10, 7, 64, 54);
		room108.add(bed108_1);

		bed108_2 = new PanelBed();
		bed108_2.setRoomNo("108-2");
		bed108_2.setBounds(80, 7, 64, 54);
		room108.add(bed108_2);
		createMap();
		fillList();
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
	}

	/*
	 * public void fillList(){ List<Rooms> rooms=null; try { // rooms = new
	 * RoomHistroySerivice().getRoomStatusForResidents(date); try { rooms =
	 * MedrexClientManager.getInstance().getRoomStatusForResidents(date); }
	 * catch (RemoteException e) {
	 * 
	 * e.printStackTrace(); } } catch (MedrexException e) { e.printStackTrace();
	 * } List<Rooms> firstFloorSouthwingList = new ArrayList<Rooms>(); for(Rooms
	 * room: rooms){
	 * if(room.getCurrentFloor().equalsIgnoreCase("1st floor south wing")){
	 * firstFloorSouthwingList.add(room); } //
	 * System.out.println(room.getCurrentFloor()+", "+
	 * room.getCurrentRoom()+", "+room.getStatus()+", "+
	 * room.getTimeSince()+", "
	 * +room.getResmain().getUserPass()+", "+room.getResmain
	 * ().getUserName()+", "+room.getResmain().getSerial()); } //
	 * System.out.println
	 * ("firstFloorSouthwingList: "+firstFloorSouthwingList.size()); for(Rooms
	 * room: firstFloorSouthwingList){
	 * if(roomMap.get(room.getCurrentRoom())!=null){ //
	 * System.out.println(room.getCurrentFloor()+", "+
	 * room.getCurrentRoom()+", "+room.getStatus()+", "+
	 * room.getTimeSince()+", "
	 * +room.getResmain().getUserPass()+", "+room.getResmain
	 * ().getUserName()+", "+room.getResmain().getSerial());
	 * roomMap.get(room.getCurrentRoom
	 * ()).setResidentName(room.getResmain().getUserPass
	 * ().toLowerCase()+","+room
	 * .getResmain().getUserName().toLowerCase(),room.getResmain().getImg());
	 * roomMap.get(room.getCurrentRoom()).setRoomNo(room.getCurrentRoom());
	 * roomMap.get(room.getCurrentRoom()).setBedOccupied(false); } } }
	 */

	public void fillList() {
		List<Rooms> rooms = null;
		try {
			rooms = MedrexClientManager.getInstance()
					.getRoomStatusForResidents(date, "1st floor south wing");
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
					roomMap.get(room.getCurrentRoom()).setBedOccupied(false);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		JFrame frm = new JFrame("Bed");
		frm.getContentPane().add(new PanelFirstFloorSouthWing(date));
		frm.setSize(new Dimension(1200, 800));
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
