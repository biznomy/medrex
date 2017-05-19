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

public class PanelSecondFloorSouthWing extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4042162574374939732L;
	// private static final Color dark = new Color(94, 120, 137);
	private static Map<String, PanelBed> roomMap = new HashMap<String, PanelBed>();
	private PanelBed bed203_2;
	private PanelBed bed203_1;
	private PanelBed bed202;
	private PanelBed bed201;
	private PanelBed bed204_1;
	private PanelBed bed204_2;
	private PanelBed bed205_1;
	private PanelBed bed205_2;
	private PanelBed bed207_1;
	private PanelBed bed207_2;
	private PanelBed bed208_1;
	private PanelBed bed208_2;
	private PanelBed bed209_1;
	private PanelBed bed209_2;
	private PanelBed bed210_1;
	private PanelBed bed210_2;
	private PanelBed bed211_1;
	private PanelBed bed211_2;
	private PanelBed bed206_3;
	private PanelBed bed206_4;
	private PanelBed bed206_1;
	private PanelBed bed206_2;
	private static final Color dark = new Color(129, 151, 164);
	private static final Color shallow = new Color(207, 218, 224);
	private static final Color back = new Color(204, 218, 223);
	private static final Color back2 = new Color(232, 240, 245);
	private static Date date;

	public PanelSecondFloorSouthWing(Date date) {
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

		final JxPanel room201 = new JxPanel();
		room201.setBounds(38, 21, 85, 69);
		room201.setArc(0);
		room201.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room201.setBorder(new LineBorder(Color.black, 1, false));
		room201.setLayout(null);

		add(room201);

		bed201 = new PanelBed();
		bed201.setRoomNo("201");
		bed201.setBounds(10, 7, 64, 54);
		room201.add(bed201);

		final JxPanel room206 = new JxPanel();
		room206.setBounds(777, 108, 155, 127);
		room206.setArc(0);
		room206.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room206.setBorder(new LineBorder(Color.black, 1, false));
		room206.setLayout(null);

		add(room206);

		bed206_3 = new PanelBed();
		bed206_3.setRoomNo("206-3");
		bed206_3.setBounds(10, 65, 64, 54);
		room206.add(bed206_3);

		bed206_4 = new PanelBed();
		bed206_4.setRoomNo("206-4");
		bed206_4.setBounds(80, 65, 64, 54);
		room206.add(bed206_4);

		bed206_1 = new PanelBed();
		bed206_1.setRoomNo("206-1");
		bed206_1.setBounds(10, 7, 64, 54);
		room206.add(bed206_1);

		bed206_2 = new PanelBed();
		bed206_2.setRoomNo("206-2");
		bed206_2.setBounds(80, 7, 64, 54);
		room206.add(bed206_2);

		final JxPanel room203 = new JxPanel();
		room203.setBounds(228, 21, 155, 69);
		room203.setArc(0);
		room203.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room203.setBorder(new LineBorder(Color.black, 1, false));
		room203.setLayout(null);
		add(room203);

		bed203_1 = new PanelBed();
		bed203_1.setBounds(10, 7, 64, 54);
		bed203_1.setRoomNo("203-1");
		room203.add(bed203_1);

		bed203_2 = new PanelBed();
		bed203_2.setRoomNo("203-2");
		bed203_2.setBounds(80, 7, 64, 54);
		room203.add(bed203_2);

		final JxPanel room204 = new JxPanel();
		room204.setBorder(new LineBorder(Color.black, 1, false));
		room204.setLayout(null);
		room204.setBounds(411, 21, 155, 69);
		room204.setArc(0);
		room204.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room204.setBorder(new LineBorder(Color.black, 1, false));
		add(room204);

		bed204_1 = new PanelBed();
		bed204_1.setBounds(10, 7, 64, 54);
		bed204_1.setRoomNo("204-1");
		room204.add(bed204_1);

		bed204_2 = new PanelBed();
		bed204_2.setRoomNo("204-2");
		bed204_2.setBounds(80, 7, 64, 54);
		room204.add(bed204_2);

		final JxPanel room205 = new JxPanel();
		room205.setBorder(new LineBorder(Color.black, 1, false));
		room205.setLayout(null);
		room205.setBounds(597, 21, 155, 69);
		room205.setArc(0);
		room205.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room205.setBorder(new LineBorder(Color.black, 1, false));
		add(room205);

		bed205_1 = new PanelBed();
		bed205_1.setBounds(10, 7, 64, 54);
		bed205_1.setRoomNo("205-1");
		room205.add(bed205_1);

		bed205_2 = new PanelBed();
		bed205_2.setRoomNo("205-2");
		bed205_2.setBounds(80, 7, 64, 54);
		room205.add(bed205_2);

		final JxPanel room207 = new JxPanel();
		room207.setBorder(new LineBorder(Color.black, 1, false));
		room207.setLayout(null);
		room207.setBounds(777, 21, 155, 69);
		room207.setArc(0);
		room207.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room207.setBorder(new LineBorder(Color.black, 1, false));
		add(room207);

		bed207_1 = new PanelBed();
		bed207_1.setRoomNo("207-1");
		bed207_1.setBounds(10, 7, 64, 54);
		room207.add(bed207_1);

		bed207_2 = new PanelBed();
		bed207_2.setRoomNo("207-2");
		bed207_2.setBounds(80, 7, 64, 54);
		room207.add(bed207_2);

		final JxPanel room208 = new JxPanel();
		room208.setBorder(new LineBorder(Color.black, 1, false));
		room208.setLayout(null);
		room208.setBounds(38, 108, 155, 69);
		room208.setArc(0);
		room208.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room208.setBorder(new LineBorder(Color.black, 1, false));
		add(room208);

		bed208_1 = new PanelBed();
		bed208_1.setRoomNo("208-1");
		bed208_1.setBounds(10, 7, 64, 54);
		room208.add(bed208_1);

		bed208_2 = new PanelBed();
		bed208_2.setRoomNo("208-2");
		bed208_2.setBounds(80, 7, 64, 54);
		room208.add(bed208_2);

		final JxPanel room209 = new JxPanel();
		room209.setBorder(new LineBorder(Color.black, 1, false));
		room209.setLayout(null);
		room209.setBounds(39, 199, 155, 69);
		room209.setArc(0);
		room209.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room209.setBorder(new LineBorder(Color.black, 1, false));
		add(room209);

		bed209_1 = new PanelBed();
		bed209_1.setRoomNo("209-1");
		bed209_1.setBounds(10, 7, 64, 54);
		room209.add(bed209_1);

		bed209_2 = new PanelBed();
		bed209_2.setRoomNo("209-2");
		bed209_2.setBounds(80, 7, 64, 54);
		room209.add(bed209_2);

		final JxPanel room210 = new JxPanel();
		room210.setBorder(new LineBorder(Color.black, 1, false));
		room210.setLayout(null);
		room210.setBounds(38, 283, 155, 69);
		room210.setArc(0);
		room210.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room210.setBorder(new LineBorder(Color.black, 1, false));
		add(room210);

		bed210_1 = new PanelBed();
		bed210_1.setRoomNo("210-1");
		bed210_1.setBounds(10, 7, 64, 54);
		room210.add(bed210_1);

		bed210_2 = new PanelBed();
		bed210_2.setRoomNo("210-2");
		bed210_2.setBounds(80, 7, 64, 54);
		room210.add(bed210_2);

		final JxPanel room211 = new JxPanel();
		room211.setBorder(new LineBorder(Color.black, 1, false));
		room211.setLayout(null);
		room211.setBounds(777, 266, 155, 69);
		room211.setArc(0);
		room211.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room211.setBorder(new LineBorder(Color.black, 1, false));
		add(room211);

		bed211_1 = new PanelBed();
		bed211_1.setRoomNo("211-1");
		bed211_1.setBounds(10, 7, 64, 54);
		room211.add(bed211_1);

		bed211_2 = new PanelBed();
		bed211_2.setRoomNo("211-2");
		bed211_2.setBounds(80, 7, 64, 54);
		room211.add(bed211_2);

		final JxPanel room202 = new JxPanel();
		room202.setBorder(new LineBorder(Color.black, 1, false));
		room202.setLayout(null);
		room202.setBounds(129, 21, 85, 69);
		room202.setArc(0);
		room202.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room202.setBorder(new LineBorder(Color.black, 1, false));
		add(room202);

		bed202 = new PanelBed();
		bed202.setRoomNo("202");
		bed202.setBounds(10, 7, 64, 54);
		room202.add(bed202);
		createMap();
		fillList();
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
	}

	public void fillList() {
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
					roomMap.get(room.getCurrentRoom()).setBedOccupied(false);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		JFrame frm = new JFrame("Bed");
		frm.getContentPane().add(new PanelSecondFloorSouthWing(date));
		frm.setSize(new Dimension(1200, 800));
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
