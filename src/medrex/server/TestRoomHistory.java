package medrex.server;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import medrex.commons.vo.resident.TempRoomHistory;
import medrex.server.service.resident.RoomHistroySerivice;

public class TestRoomHistory {
	public static void main(String arg[]) {
		try {
			String strDate = "2010-03-10 10:57:15";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date searchDate = sdf.parse(strDate);

			List<TempRoomHistory> roomList = new RoomHistroySerivice()
					.getRoomHistories(searchDate);
			// TempRoomHistory roomHis = new
			// RoomHistroySerivice().getRoomHistoriesForResident(134,
			// searchDate);
			// List<TempRoomHistory> roomList = new
			// RoomHistroySerivice().getRoomHistoriesForResident(65);
			// TempRoomHistory roomHis = new
			// RoomHistroySerivice().getRoomForResident(65, new Date());
			// List<Rooms> roomsList = new
			// RoomHistroySerivice().getRoomStatusForResidents(new Date());
			// int count = 0 ;
			// for(Rooms room: roomsList){
			// count++;
			// System.out.println(room.getCurrentFloor()+", "+
			// room.getCurrentRoom()+", "+room.getStatus()+", "+
			// room.getTimeSince()+", "+room.getResmain().getUserPass()+", "+room.getResmain().getUserName()+", "+room.getResmain().getSerial());
			// }
			// System.out.println("count: "+count);

			// System.out.println("Room List: "+roomHis.getFloor()+", "+
			// roomHis.getRoom()+", "+roomHis.getStartDate()+", "+roomHis.getEndDate());
			for (TempRoomHistory roomHist : roomList) {
				System.out.println(roomHist.getResidentId() + ", "
						+ roomHist.getRoom() + ", " + roomHist.getStartDate()
						+ ", " + roomHist.getEndDate());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
