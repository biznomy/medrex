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

public class PanelMainAndNorthWing extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8511006950803872905L;
	private PanelBed bed231_2;
	private PanelBed bed231_1;
	private PanelBed bed230_2;
	private PanelBed bed230_1;
	private PanelBed bed228_2;
	private PanelBed bed228_1;
	private PanelBed bed232_3;
	private PanelBed bed232_2;
	private PanelBed bed232_1;
	private PanelBed bed213_3;
	private static Map<String, PanelBed> roomMap = new HashMap<String, PanelBed>();
	private static final Color dark = new Color(129, 151, 164);
	private static final Color shallow = new Color(207, 218, 224);
	// private static final Color back = new Color(204, 218, 223);
	// private static final Color back2 = new Color(232, 240, 245);
	private PanelBed bed212_1;
	private PanelBed bed212_4;
	private PanelBed bed212_3;
	private PanelBed bed213_1;
	private PanelBed bed213_2;
	private PanelBed bed229;
	private PanelBed bed214_1;
	private PanelBed bed214_2;
	private PanelBed bed215_1;
	private PanelBed bed215_2;
	private PanelBed bed216_1;
	private PanelBed bed216_2;
	private PanelBed bed217_1;
	private PanelBed bed217_2;
	private PanelBed bed218_1;
	private PanelBed bed218_2;
	private PanelBed bed220_1;
	private PanelBed bed220_2;
	private PanelBed bed222_1;
	private PanelBed bed222_2;
	private PanelBed bed224_1;
	private PanelBed bed224_2;
	private PanelBed bed226_1;
	private PanelBed bed226_2;
	private PanelBed bed219_1;
	private PanelBed bed219_2;
	private PanelBed bed221_1;
	private PanelBed bed221_2;
	private PanelBed bed223_1;
	private PanelBed bed223_2;
	private PanelBed bed227_1;
	private PanelBed bed227_2;
	private PanelBed bed225_1;
	private PanelBed bed225_2;
	private PanelBed bed212_2;
	private PanelBed bed213_4;
	private static Date date;

	public PanelMainAndNorthWing(Date date) {
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

		final JxPanel room110 = new JxPanel();
		room110.setBorder(new LineBorder(Color.black, 1, false));
		room110.setLayout(null);
		room110.setBounds(305, 118, 155, 129);
		room110.setArc(0);
		room110.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room110.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room110);

		bed212_1 = new PanelBed();
		bed212_1.setRoomNo("212-1");
		bed212_1.setBounds(10, 7, 64, 54);
		room110.add(bed212_1);

		bed212_4 = new PanelBed();
		bed212_4.setRoomNo("212-4");
		bed212_4.setBounds(80, 65, 64, 54);
		room110.add(bed212_4);

		bed212_2 = new PanelBed();
		bed212_2.setRoomNo("212-2");
		bed212_2.setBounds(80, 7, 64, 54);
		room110.add(bed212_2);

		bed212_3 = new PanelBed();
		bed212_3.setRoomNo("212-3");
		bed212_3.setBounds(10, 65, 64, 54);
		room110.add(bed212_3);

		final JxPanel room129 = new JxPanel();
		room129.setBorder(new LineBorder(Color.black, 1, false));
		room129.setLayout(null);
		room129.setBounds(527, 118, 155, 129);
		room129.setArc(0);
		room129.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room129.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room129);

		bed213_1 = new PanelBed();
		bed213_1.setRoomNo("213-1");
		bed213_1.setBounds(10, 7, 64, 54);
		room129.add(bed213_1);

		bed213_4 = new PanelBed();
		bed213_4.setRoomNo("213-4");
		bed213_4.setBounds(80, 65, 64, 54);
		room129.add(bed213_4);

		bed213_2 = new PanelBed();
		bed213_2.setRoomNo("213-2");
		bed213_2.setBounds(80, 7, 64, 54);
		room129.add(bed213_2);

		bed213_3 = new PanelBed();
		bed213_3.setRoomNo("213-3");
		bed213_3.setBounds(10, 67, 64, 54);
		room129.add(bed213_3);

		final JxPanel room124 = new JxPanel();
		room124.setBorder(new LineBorder(Color.black, 1, false));
		room124.setLayout(null);
		room124.setBounds(376, 434, 84, 69);
		room124.setArc(0);
		room124.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room124.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room124);

		bed229 = new PanelBed();
		bed229.setRoomNo("229");
		bed229.setBounds(10, 7, 64, 54);
		room124.add(bed229);

		final JxPanel room125 = new JxPanel();
		room125.setBorder(new LineBorder(Color.black, 1, false));
		room125.setLayout(null);
		room125.setBounds(527, 275, 155, 129);
		room125.setArc(0);
		room125.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room125.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room125);

		bed232_1 = new PanelBed();
		bed232_1.setRoomNo("232-1");
		bed232_1.setBounds(10, 10, 64, 54);
		room125.add(bed232_1);

		bed232_2 = new PanelBed();
		bed232_2.setRoomNo("232-2");
		bed232_2.setBounds(80, 10, 64, 54);
		room125.add(bed232_2);

		bed232_3 = new PanelBed();
		bed232_3.setRoomNo("232-3");
		bed232_3.setBounds(80, 70, 64, 54);
		room125.add(bed232_3);

		final JxPanel room111 = new JxPanel();
		room111.setLayout(null);
		room111.setBounds(25, 21, 155, 69);
		room111.setArc(0);
		room111.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room111.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room111);

		bed214_1 = new PanelBed();
		bed214_1.setRoomNo("214-1");
		bed214_1.setBounds(10, 7, 64, 54);
		room111.add(bed214_1);

		bed214_2 = new PanelBed();
		bed214_2.setRoomNo("214-2");
		bed214_2.setBounds(80, 7, 64, 54);
		room111.add(bed214_2);

		final JxPanel room112 = new JxPanel();
		room112.setBorder(new LineBorder(Color.black, 1, false));
		room112.setLayout(null);
		room112.setBounds(186, 21, 155, 69);
		room112.setArc(0);
		room112.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room112.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room112);

		bed215_1 = new PanelBed();
		bed215_1.setRoomNo("215-1");
		bed215_1.setBounds(10, 7, 64, 54);
		room112.add(bed215_1);

		bed215_2 = new PanelBed();
		bed215_2.setRoomNo("215-2");
		bed215_2.setBounds(80, 7, 64, 54);
		room112.add(bed215_2);

		final JxPanel room113 = new JxPanel();
		room113.setBorder(new LineBorder(Color.black, 1, false));
		room113.setLayout(null);
		room113.setBounds(347, 21, 155, 69);
		room113.setArc(0);
		room113.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room113.setBorder(new LineBorder(Color.black, 1, false));

		panel.add(room113);

		bed216_1 = new PanelBed();
		bed216_1.setRoomNo("216-1");
		bed216_1.setBounds(10, 7, 64, 54);
		room113.add(bed216_1);

		bed216_2 = new PanelBed();
		bed216_2.setRoomNo("216-2");
		bed216_2.setBounds(80, 7, 64, 54);
		room113.add(bed216_2);

		final JxPanel room114 = new JxPanel();
		room114.setBorder(new LineBorder(Color.black, 1, false));
		room114.setLayout(null);
		room114.setBounds(508, 21, 155, 69);
		room114.setArc(0);
		room114.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room114.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room114);

		bed217_1 = new PanelBed();
		bed217_1.setRoomNo("217-1");
		bed217_1.setBounds(10, 7, 64, 54);
		room114.add(bed217_1);

		bed217_2 = new PanelBed();
		bed217_2.setBedOccupied(true);
		bed217_2.setRoomNo("217-2");
		bed217_2.setBounds(80, 7, 64, 54);
		room114.add(bed217_2);

		final JxPanel room115 = new JxPanel();
		room115.setBorder(new LineBorder(Color.black, 1, false));
		room115.setLayout(null);
		room115.setBounds(669, 21, 155, 69);
		room115.setArc(0);
		room115.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room115.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room115);

		bed218_1 = new PanelBed();
		bed218_1.setRoomNo("218-1");
		bed218_1.setBounds(10, 7, 64, 54);
		room115.add(bed218_1);

		bed218_2 = new PanelBed();
		bed218_2.setRoomNo("218-2");
		bed218_2.setBounds(80, 7, 64, 54);
		room115.add(bed218_2);

		final JxPanel room117 = new JxPanel();
		room117.setBorder(new LineBorder(Color.black, 1, false));
		room117.setLayout(null);
		room117.setBounds(25, 118, 155, 69);
		room117.setArc(0);
		room117.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room117.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room117);

		bed220_1 = new PanelBed();
		bed220_1.setRoomNo("220-1");
		bed220_1.setBounds(10, 7, 64, 54);
		room117.add(bed220_1);

		bed220_2 = new PanelBed();
		bed220_2.setRoomNo("220-2");
		bed220_2.setBounds(80, 7, 64, 54);
		room117.add(bed220_2);

		final JxPanel room119 = new JxPanel();
		room119.setBorder(new LineBorder(Color.black, 1, false));
		room119.setLayout(null);
		room119.setBounds(25, 215, 155, 69);
		room119.setArc(0);
		room119.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room119.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room119);

		bed222_1 = new PanelBed();
		bed222_1.setRoomNo("222-1");
		bed222_1.setBounds(10, 7, 64, 54);
		room119.add(bed222_1);

		bed222_2 = new PanelBed();
		bed222_2.setRoomNo("222-2");
		bed222_2.setBounds(80, 7, 64, 54);
		room119.add(bed222_2);

		final JxPanel room123 = new JxPanel();
		room123.setBorder(new LineBorder(Color.black, 1, false));
		room123.setLayout(null);
		room123.setBounds(25, 321, 155, 69);
		room123.setArc(0);
		room123.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room123.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room123);

		bed224_1 = new PanelBed();
		bed224_1.setRoomNo("224-1");
		bed224_1.setBounds(10, 7, 64, 54);
		room123.add(bed224_1);

		bed224_2 = new PanelBed();
		bed224_2.setRoomNo("224-2");
		bed224_2.setBounds(80, 7, 64, 54);
		room123.add(bed224_2);

		final JxPanel room126 = new JxPanel();
		room126.setBorder(new LineBorder(Color.black, 1, false));
		room126.setLayout(null);
		room126.setBounds(25, 434, 155, 69);
		room126.setArc(0);
		room126.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room126.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room126);

		bed226_1 = new PanelBed();
		bed226_1.setBedOccupied(true);
		bed226_1.setRoomNo("226-1");
		bed226_1.setBounds(10, 7, 64, 54);
		room126.add(bed226_1);

		bed226_2 = new PanelBed();
		bed226_2.setRoomNo("226-2");
		bed226_2.setBounds(80, 7, 64, 54);
		room126.add(bed226_2);

		final JxPanel room116 = new JxPanel();
		room116.setBorder(new LineBorder(Color.black, 1, false));
		room116.setLayout(null);
		room116.setBounds(830, 21, 155, 69);
		room116.setArc(0);
		room116.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room116.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room116);

		bed219_1 = new PanelBed();
		bed219_1.setRoomNo("219-1");
		bed219_1.setBounds(10, 7, 64, 54);
		room116.add(bed219_1);

		bed219_2 = new PanelBed();
		bed219_2.setRoomNo("219-2");
		bed219_2.setBounds(80, 7, 64, 54);
		room116.add(bed219_2);

		final JxPanel room118 = new JxPanel();
		room118.setBorder(new LineBorder(Color.black, 1, false));
		room118.setLayout(null);
		room118.setBounds(830, 118, 155, 69);
		room118.setArc(0);
		room118.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room118.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room118);

		bed221_1 = new PanelBed();
		bed221_1.setBedOccupied(true);
		bed221_1.setRoomNo("221-1");
		bed221_1.setBounds(10, 7, 64, 54);
		room118.add(bed221_1);

		bed221_2 = new PanelBed();
		bed221_2.setRoomNo("221-2");
		bed221_2.setBounds(80, 7, 64, 54);
		room118.add(bed221_2);

		final JxPanel room121 = new JxPanel();
		room121.setBorder(new LineBorder(Color.black, 1, false));
		room121.setLayout(null);
		room121.setBounds(830, 217, 155, 69);
		room121.setArc(0);
		room121.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room121.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room121);

		bed223_1 = new PanelBed();
		bed223_1.setRoomNo("223-1");
		bed223_1.setBounds(10, 7, 64, 54);
		room121.add(bed223_1);

		bed223_2 = new PanelBed();
		bed223_2.setRoomNo("223-2");
		bed223_2.setBounds(80, 7, 64, 54);
		room121.add(bed223_2);

		final JxPanel room127 = new JxPanel();
		room127.setBorder(new LineBorder(Color.black, 1, false));
		room127.setLayout(null);
		room127.setBounds(830, 434, 155, 69);
		room127.setArc(0);
		room127.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room127.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room127);

		bed227_1 = new PanelBed();
		bed227_1.setRoomNo("227-1");
		bed227_1.setBounds(10, 7, 64, 54);
		room127.add(bed227_1);

		bed227_2 = new PanelBed();
		bed227_2.setRoomNo("227-2");
		bed227_2.setBounds(80, 7, 64, 54);
		room127.add(bed227_2);

		final JxPanel room122 = new JxPanel();
		room122.setBorder(new LineBorder(Color.black, 1, false));
		room122.setLayout(null);
		room122.setBounds(830, 321, 155, 69);
		room122.setArc(0);
		room122.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room122.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room122);

		bed225_1 = new PanelBed();
		bed225_1.setRoomNo("225-1");
		bed225_1.setBounds(10, 7, 64, 54);
		room122.add(bed225_1);

		bed225_2 = new PanelBed();
		bed225_2.setBedOccupied(true);
		bed225_2.setRoomNo("225-2");
		bed225_2.setBounds(80, 7, 64, 54);
		room122.add(bed225_2);

		final JxPanel room126_1 = new JxPanel();
		room126_1.setBorder(new LineBorder(Color.black, 1, false));
		room126_1.setLayout(null);
		room126_1.setBounds(305, 261, 155, 69);
		room126_1.setArc(0);
		room126_1.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room126_1.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room126_1);

		bed228_1 = new PanelBed();
		bed228_1.setRoomNo("228-1");
		bed228_1.setBedOccupied(true);
		bed228_1.setBounds(10, 7, 64, 54);
		room126_1.add(bed228_1);

		bed228_2 = new PanelBed();
		bed228_2.setRoomNo("228-2");
		bed228_2.setBounds(80, 7, 64, 54);
		room126_1.add(bed228_2);

		final JxPanel room126_2 = new JxPanel();
		room126_2.setBorder(new LineBorder(Color.black, 1, false));
		room126_2.setLayout(null);
		room126_2.setBounds(305, 349, 155, 69);
		room126_2.setArc(0);
		room126_2.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room126_2.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room126_2);

		bed230_1 = new PanelBed();
		bed230_1.setRoomNo("230-1");
		bed230_1.setBedOccupied(true);
		bed230_1.setBounds(10, 7, 64, 54);
		room126_2.add(bed230_1);

		bed230_2 = new PanelBed();
		bed230_2.setRoomNo("230-2");
		bed230_2.setBounds(80, 7, 64, 54);
		room126_2.add(bed230_2);

		final JxPanel room126_2_1 = new JxPanel();
		room126_2_1.setBorder(new LineBorder(Color.black, 1, false));
		room126_2_1.setLayout(null);
		room126_2_1.setBounds(527, 434, 155, 69);
		room126_2_1.setArc(0);
		room126_2_1.setLinearGradient(new Color(158, 175, 186), shallow,
				Direction.LEFT_TO_RIGHT);
		room126_2_1.setBorder(new LineBorder(Color.black, 1, false));
		panel.add(room126_2_1);

		bed231_1 = new PanelBed();
		bed231_1.setRoomNo("231-1");
		bed231_1.setBedOccupied(true);
		bed231_1.setBounds(10, 7, 64, 54);
		room126_2_1.add(bed231_1);

		bed231_2 = new PanelBed();
		bed231_2.setRoomNo("231-2");
		bed231_2.setBounds(80, 7, 64, 54);
		room126_2_1.add(bed231_2);
		createMap();
		fillList();

	}

	public void createMap() {
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

	public void fillList() {
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
					roomMap.get(room.getCurrentRoom()).setBedOccupied(false);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		JFrame frm = new JFrame("Bed");
		frm.getContentPane().add(new PanelMainAndNorthWing(date));
		frm.setSize(new Dimension(1200, 800));
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
