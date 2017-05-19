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

public class PanelRoomMainNorthWing extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -235335153924984361L;
	private static Map<String, PanelBed> roomMap = new HashMap<String, PanelBed>();
	private static final Color dark = new Color(129, 151, 164);
	private static final Color shallow = new Color(207, 218, 224);
	private static final Color back = new Color(204, 218, 223);
	private static final Color back2 = new Color(232, 240, 245);
	private PanelBed bed120;
	private PanelBed bed110_1;
	private PanelBed bed110_4;
	private PanelBed bed110_3;
	private PanelBed bed129_1;
	private PanelBed bed129_2;
	private PanelBed bed124;
	private PanelBed bed125;
	private PanelBed bed128;
	private PanelBed bed111_1;
	private PanelBed bed111_2;
	private PanelBed bed112_1;
	private PanelBed bed112_2;
	private PanelBed bed113_1;
	private PanelBed bed113_2;
	private PanelBed bed114_1;
	private PanelBed bed114_2;
	private PanelBed bed115_1;
	private PanelBed bed115_2;
	private PanelBed bed117_1;
	private PanelBed bed117_2;
	private PanelBed bed119_1;
	private PanelBed bed119_2;
	private PanelBed bed122_1;
	private PanelBed bed122_2;
	private PanelBed bed126_1;
	private PanelBed bed126_2;
	private PanelBed bed116_1;
	private PanelBed bed116_2;
	private PanelBed bed118_1;
	private PanelBed bed118_2;
	private PanelBed bed121_1;
	private PanelBed bed121_2;
	private PanelBed bed127_1;
	private PanelBed bed127_2;
	private PanelBed bed123_1;
	private PanelBed bed123_2;
	private PanelBed bed110_2;
	private PanelBed bed129_3;
	private static Date date;

	public PanelRoomMainNorthWing(Date date) {
		super();
		this.date = date;
		setArc(0);
		setSize(new Dimension(1024, 562));
		setPreferredSize(new Dimension(1024, 550));
		setLinearGradient(dark, shallow, Direction.LEFT_TO_RIGHT);
		setLayout(null);

		final JxPanel panel = new JxPanel();
		panel.setArc(0);
		panel.setBounds(0, 0, 1024, 559);
		panel.setOpaque(false);
		panel.setLinearGradient(dark, shallow, Direction.LEFT_TO_RIGHT);
		add(panel);
		panel.setPreferredSize(new Dimension(1190, 900));
		panel.setLayout(null);

		final JxPanel room120 = new JxPanel();
		room120.setBorder(new LineBorder(Color.black, 1, false));
		room120.setLayout(null);
		room120.setBounds(598, 349, 84, 69);
		room120.setArc(0);
		room120.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room120.setBorder(new LineBorder(Color.black, 1, false));

		panel.add(room120);

		bed120 = new PanelBed();
		bed120.setRoomNo("120");
		bed120.setBounds(10, 7, 64, 54);
		room120.add(bed120);

		final JxPanel room110 = new JxPanel();
		room110.setBorder(new LineBorder(Color.black, 1, false));
		room110.setLayout(null);
		room110.setBounds(305, 157, 155, 129);
		room110.setArc(0);
		room110.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room110.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room110);

		bed110_1 = new PanelBed();
		bed110_1.setRoomNo("110-1");
		bed110_1.setBounds(10, 7, 64, 54);
		room110.add(bed110_1);

		bed110_4 = new PanelBed();
		bed110_4.setRoomNo("110-4");
		bed110_4.setBounds(80, 65, 64, 54);
		room110.add(bed110_4);

		bed110_2 = new PanelBed();
		bed110_2.setRoomNo("110-2");
		bed110_2.setBounds(80, 7, 64, 54);
		room110.add(bed110_2);

		bed110_3 = new PanelBed();
		bed110_3.setRoomNo("110-3");
		bed110_3.setBounds(10, 65, 64, 54);
		room110.add(bed110_3);

		final JxPanel room129 = new JxPanel();
		room129.setBorder(new LineBorder(Color.black, 1, false));
		room129.setLayout(null);
		room129.setBounds(527, 157, 155, 129);
		room129.setArc(0);
		room129.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room129.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room129);

		bed129_1 = new PanelBed();
		bed129_1.setRoomNo("129-1");
		bed129_1.setBounds(10, 7, 64, 54);
		room129.add(bed129_1);

		bed129_3 = new PanelBed();
		bed129_3.setRoomNo("129-3");
		bed129_3.setBounds(80, 65, 64, 54);
		room129.add(bed129_3);

		bed129_2 = new PanelBed();
		bed129_2.setRoomNo("129-2");
		bed129_2.setBounds(80, 7, 64, 54);
		room129.add(bed129_2);

		final JxPanel room124 = new JxPanel();
		room124.setBorder(new LineBorder(Color.black, 1, false));
		room124.setLayout(null);
		room124.setBounds(305, 349, 84, 69);
		room124.setArc(0);
		room124.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room124.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room124);

		bed124 = new PanelBed();
		bed124.setRoomNo("124");
		bed124.setBounds(10, 7, 64, 54);
		room124.add(bed124);

		final JxPanel room125 = new JxPanel();
		room125.setBorder(new LineBorder(Color.black, 1, false));
		room125.setLayout(null);
		room125.setBounds(395, 349, 84, 69);
		room125.setArc(0);
		room125.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room125.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room125);

		bed125 = new PanelBed();
		bed125.setRoomNo("125");
		bed125.setBounds(10, 7, 64, 54);
		room125.add(bed125);

		final JxPanel room128 = new JxPanel();
		room128.setBorder(new LineBorder(Color.black, 1, false));
		room128.setLayout(null);
		room128.setBounds(508, 349, 84, 69);
		room128.setArc(0);
		room128.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room128.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room128);

		bed128 = new PanelBed();
		bed128.setBedOccupied(true);
		bed128.setRoomNo("128");
		bed128.setBounds(10, 7, 64, 54);
		room128.add(bed128);

		final JxPanel room111 = new JxPanel();
		room111.setLayout(null);
		room111.setBounds(25, 21, 155, 69);
		room111.setArc(0);
		room111.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room111.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room111);

		bed111_1 = new PanelBed();
		bed111_1.setRoomNo("111-1");
		bed111_1.setBounds(10, 7, 64, 54);
		room111.add(bed111_1);

		bed111_2 = new PanelBed();
		bed111_2.setRoomNo("111-2");
		bed111_2.setBounds(80, 7, 64, 54);
		room111.add(bed111_2);

		final JxPanel room112 = new JxPanel();
		room112.setBorder(new LineBorder(Color.black, 1, false));
		room112.setLayout(null);
		room112.setBounds(186, 21, 155, 69);
		room112.setArc(0);
		room112.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room112.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room112);

		bed112_1 = new PanelBed();
		bed112_1.setRoomNo("112-1");
		bed112_1.setBounds(10, 7, 64, 54);
		room112.add(bed112_1);

		bed112_2 = new PanelBed();
		bed112_2.setRoomNo("112-2");
		bed112_2.setBounds(80, 7, 64, 54);
		room112.add(bed112_2);

		final JxPanel room113 = new JxPanel();
		room113.setBorder(new LineBorder(Color.black, 1, false));
		room113.setLayout(null);
		room113.setBounds(347, 21, 155, 69);
		room113.setArc(0);
		room113.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room113.setBorder(new LineBorder(Color.black, 1, false));

		panel.add(room113);

		bed113_1 = new PanelBed();
		bed113_1.setRoomNo("113-1");
		bed113_1.setBounds(10, 7, 64, 54);
		room113.add(bed113_1);

		bed113_2 = new PanelBed();
		bed113_2.setRoomNo("113-2");
		bed113_2.setBounds(80, 7, 64, 54);
		room113.add(bed113_2);

		final JxPanel room114 = new JxPanel();
		room114.setBorder(new LineBorder(Color.black, 1, false));
		room114.setLayout(null);
		room114.setBounds(508, 21, 155, 69);
		room114.setArc(0);
		room114.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room114.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room114);

		bed114_1 = new PanelBed();
		bed114_1.setRoomNo("114-1");
		bed114_1.setBounds(10, 7, 64, 54);
		room114.add(bed114_1);

		bed114_2 = new PanelBed();
		bed114_2.setBedOccupied(true);
		bed114_2.setRoomNo("114-2");
		bed114_2.setBounds(80, 7, 64, 54);
		room114.add(bed114_2);

		final JxPanel room115 = new JxPanel();
		room115.setBorder(new LineBorder(Color.black, 1, false));
		room115.setLayout(null);
		room115.setBounds(669, 21, 155, 69);
		room115.setArc(0);
		room115.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room115.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room115);

		bed115_1 = new PanelBed();
		bed115_1.setRoomNo("115-1");
		bed115_1.setBounds(10, 7, 64, 54);
		room115.add(bed115_1);

		bed115_2 = new PanelBed();
		bed115_2.setRoomNo("115-2");
		bed115_2.setBounds(80, 7, 64, 54);
		room115.add(bed115_2);

		final JxPanel room117 = new JxPanel();
		room117.setBorder(new LineBorder(Color.black, 1, false));
		room117.setLayout(null);
		room117.setBounds(25, 118, 155, 69);
		room117.setArc(0);
		room117.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room117.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room117);

		bed117_1 = new PanelBed();
		bed117_1.setRoomNo("117-1");
		bed117_1.setBounds(10, 7, 64, 54);
		room117.add(bed117_1);

		bed117_2 = new PanelBed();
		bed117_2.setRoomNo("117-2");
		bed117_2.setBounds(80, 7, 64, 54);
		room117.add(bed117_2);

		final JxPanel room119 = new JxPanel();
		room119.setBorder(new LineBorder(Color.black, 1, false));
		room119.setLayout(null);
		room119.setBounds(25, 215, 155, 69);
		room119.setArc(0);
		room119.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room119.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room119);

		bed119_1 = new PanelBed();
		bed119_1.setRoomNo("119-1");
		bed119_1.setBounds(10, 7, 64, 54);
		room119.add(bed119_1);

		bed119_2 = new PanelBed();
		bed119_2.setRoomNo("119-2");
		bed119_2.setBounds(80, 7, 64, 54);
		room119.add(bed119_2);

		final JxPanel room123 = new JxPanel();
		room123.setBorder(new LineBorder(Color.black, 1, false));
		room123.setLayout(null);
		room123.setBounds(25, 321, 155, 69);
		room123.setArc(0);
		room123.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room123.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room123);

		bed122_1 = new PanelBed();
		bed122_1.setRoomNo("122-1");
		bed122_1.setBounds(10, 7, 64, 54);
		room123.add(bed122_1);

		bed122_2 = new PanelBed();
		bed122_2.setRoomNo("122-2");
		bed122_2.setBounds(80, 7, 64, 54);
		room123.add(bed122_2);

		final JxPanel room126 = new JxPanel();
		room126.setBorder(new LineBorder(Color.black, 1, false));
		room126.setLayout(null);
		room126.setBounds(25, 434, 155, 69);
		room126.setArc(0);
		room126.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room126.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room126);

		bed126_1 = new PanelBed();
		bed126_1.setBedOccupied(true);
		bed126_1.setRoomNo("126-1");
		bed126_1.setBounds(10, 7, 64, 54);
		room126.add(bed126_1);

		bed126_2 = new PanelBed();
		bed126_2.setRoomNo("126-2");
		bed126_2.setBounds(80, 7, 64, 54);
		room126.add(bed126_2);

		final JxPanel room116 = new JxPanel();
		room116.setBorder(new LineBorder(Color.black, 1, false));
		room116.setLayout(null);
		room116.setBounds(830, 21, 155, 69);
		room116.setArc(0);
		room116.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room116.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room116);

		bed116_1 = new PanelBed();
		bed116_1.setRoomNo("116-1");
		bed116_1.setBounds(10, 7, 64, 54);
		room116.add(bed116_1);

		bed116_2 = new PanelBed();
		bed116_2.setRoomNo("116-2");
		bed116_2.setBounds(80, 7, 64, 54);
		room116.add(bed116_2);

		final JxPanel room118 = new JxPanel();
		room118.setBorder(new LineBorder(Color.black, 1, false));
		room118.setLayout(null);
		room118.setBounds(830, 118, 155, 69);
		room118.setArc(0);
		room118.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room118.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room118);

		bed118_1 = new PanelBed();
		bed118_1.setBedOccupied(true);
		bed118_1.setRoomNo("118-1");
		bed118_1.setBounds(10, 7, 64, 54);
		room118.add(bed118_1);

		bed118_2 = new PanelBed();
		bed118_2.setRoomNo("118-2");
		bed118_2.setBounds(80, 7, 64, 54);
		room118.add(bed118_2);

		final JxPanel room121 = new JxPanel();
		room121.setBorder(new LineBorder(Color.black, 1, false));
		room121.setLayout(null);
		room121.setBounds(830, 217, 155, 69);
		room121.setArc(0);
		room121.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room121.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room121);

		bed121_1 = new PanelBed();
		bed121_1.setRoomNo("121-1");
		bed121_1.setBounds(10, 7, 64, 54);
		room121.add(bed121_1);

		bed121_2 = new PanelBed();
		bed121_2.setRoomNo("121-2");
		bed121_2.setBounds(80, 7, 64, 54);
		room121.add(bed121_2);

		final JxPanel room127 = new JxPanel();
		room127.setBorder(new LineBorder(Color.black, 1, false));
		room127.setLayout(null);
		room127.setBounds(830, 434, 155, 69);
		room127.setArc(0);
		room127.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room127.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room127);

		bed127_1 = new PanelBed();
		bed127_1.setRoomNo("127-1");
		bed127_1.setBounds(10, 7, 64, 54);
		room127.add(bed127_1);

		bed127_2 = new PanelBed();
		bed127_2.setRoomNo("127-2");
		bed127_2.setBounds(80, 7, 64, 54);
		room127.add(bed127_2);

		final JxPanel room122 = new JxPanel();
		room122.setBorder(new LineBorder(Color.black, 1, false));
		room122.setLayout(null);
		room122.setBounds(830, 321, 155, 69);
		room122.setArc(0);
		room122.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room122.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room122);

		bed123_1 = new PanelBed();
		bed123_1.setRoomNo("123-1");
		bed123_1.setBounds(10, 7, 64, 54);
		room122.add(bed123_1);

		bed123_2 = new PanelBed();
		bed123_2.setBedOccupied(true);
		bed123_2.setRoomNo("123-2");
		bed123_2.setBounds(80, 7, 64, 54);
		room122.add(bed123_2);
		createMap();
		fillList();

	}

	public void createMap() {
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

		roomMap.put("120", bed120);

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

	public void fillList() {
		List<Rooms> rooms = null;
		try {
			rooms = MedrexClientManager.getInstance()
					.getRoomStatusForResidents(date, "Main North Wing");
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
																	 * ,room .
																	 * getResmain
																	 * ( ) .
																	 * getImg (
																	 * ) .
																	 * toLowerCase
																	 * ( )
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
		frm.getContentPane().add(new PanelRoomMainNorthWing(date));
		frm.setSize(new Dimension(1200, 800));
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
