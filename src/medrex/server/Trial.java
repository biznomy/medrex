package medrex.server;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.CensusStatusForResident;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.RoomHistory;
import medrex.server.dao.resident.ResidentInformationDAO;
import medrex.server.dao.resident.RoomHistroyDAO;
import medrex.server.service.census.CensusStatusService;

public class Trial {

	private static String[] strSubCat1 = { "101-1", "101-2", "102-1", "102-2",
			"103-1", "103-2", "104-1", "104-2", "104-3", "104-4", "105-1",
			"105-2", "106-1", "106-2", "107-1", "107-2", "108-1", "108-2",
			"109-1", "109-2" };

	private static String[] strSubCat2 = { "110-1", "110-2", "110-3", "110-4",
			"111-1", "111-2", "112-1", "112-2", "113-1", "113-2", "114-1",
			"114-2", "115-1", "115-2", "116-1", "116-2", "117-1", "117-2",
			"118-1", "118-2", "119-1", "119-2", "120-1", "120-2", "121-1",
			"121-2", "122-1", "122-2", "123-1", "123-2", "124", "125", "126-1",
			"126-2", "127-1", "127-2", "128", "129-1", "129-2", "129-3" };

	private static String[] strSubCat3 = { "201", "202", "203-1", "203-2",
			"204-1", "204-2", "205-1", "205-2", "206-1", "206-2", "206-3",
			"206-4", "207-1", "207-2", "208-1", "208-2", "209-1", "209-2",
			"210-1", "210-2", "211-1", "211-2" };

	private static String[] strSubCat4 = { "212-1", "212-2", "212-3", "212-4",
			"213-1", "213-2", "213-3", "213-4", "214-1", "214-2", "215-1",
			"215-2", "216-1", "216-2", "217-1", "217-2", "218-1", "218-2",
			"219-1", "219-2", "220-1", "220-2", "221-1", "221-2", "222-1",
			"222-2", "223-1", "223-2", "224-1", "224-2", "225-1", "225-2",
			"226-1", "226-2", "227-1", "227-2", "228-1", "228-2", "229",
			"230-1", "230-2", "231-1", "231-2", "232-1", "232-2", "232-3" };

	public static void main(String[] args) {

		try {
			int count = 0;
			int countNullRoom = 0;
			// ResidentInformationDAO.getInstance().getSecondFloorResidentss(new
			// Date("02/02/2010"));

			// Insert room history according to last admission
			List<ResidentMain> resList = ResidentInformationDAO.getInstance()
					.getResidentMain();
			for (ResidentMain resmain : resList) {
				CensusStatus censusStatus = new CensusStatusService()
						.getCensusLastAdmission(resmain.getSerial());
				// CensusStatus censusStatus = new
				// CensusStatusService().getCensusLastDischarge(resmain.getSerial());
				if (censusStatus != null) {
					RoomHistory roomHistory = RoomHistroyDAO.getInstance()
							.getRoomHistoryAccToCensusTemp(
									censusStatus.getSerial());
					if (roomHistory == null) {
						roomHistory = new RoomHistory();
						String floor = null;
						String room = null;
						roomHistory.setResidentId(resmain.getSerial());
						roomHistory.setCensusId(censusStatus.getSerial());
						/* TODO: Need to update from roomHistory */
						/*
						 * if(resmain.getRoom()!=null){ floor =
						 * resmain.getFloorType(); room = resmain.getRoom();
						 * }else{
						 */
						room = resmain.getOldroom();
						// getting floor according to room
						floor = getFloor(room);
						// }

						roomHistory.setFloor(floor);
						roomHistory.setRoom(room);
						roomHistory.setStartDate(censusStatus.getDateAndTime());
						// Posible to get room and floor
						if (roomHistory.getFloor() != null
								&& roomHistory.getRoom() != null) {
							count++;
							System.out.println(resmain.getUserPass() + ", "
									+ resmain.getUserName() + ", floor: "
									+ floor + ", room: " + room
									+ ", LastAdmission date: "
									+ censusStatus.getDateAndTime() + "\n");
							// Inserting room history
							doInsertRoomHistory(roomHistory);
						} else {
							countNullRoom++;
							roomHistory.setFloor("1st floor south wing");
							roomHistory.setRoom("100");
							System.out.println("Floor and room are blank: "
									+ resmain.getUserPass() + ", "
									+ resmain.getUserName() + ", floor: "
									+ roomHistory.getFloor() + ", room: "
									+ roomHistory.getRoom()
									+ ", LastAdmission date: "
									+ censusStatus.getDateAndTime() + "\n");
							doInsertRoomHistory(roomHistory);
						}

					}
				}
			}
			System.out.println("Count: " + count);
			System.out.println("countNullRoom: " + countNullRoom);

			count = 0;
			// udpate room history according to last discharge
			resList = ResidentInformationDAO.getInstance().getResidentMain();
			for (ResidentMain resmain : resList) {
				// getting last admission
				CensusStatus lastAdmissionCensusStatus = new CensusStatusService()
						.getCensusLastAdmission(resmain.getSerial());
				// getting last discharge
				CensusStatus lastDischarge = new CensusStatusService()
						.getCensusLastDischarge(resmain.getSerial());
				// getting resident status
				CensusStatusForResident censusStatusForResident = new CensusStatusService()
						.getCensusStatusForResident(resmain.getSerial());

				if (lastDischarge != null) {
					// getting room histroy by last census admission
					RoomHistory admRoomHistory = RoomHistroyDAO.getInstance()
							.getRoomHistoryAccToCensusTemp(
									lastAdmissionCensusStatus.getSerial());
					// getting room history by last discharge
					RoomHistory disRoomHistory = RoomHistroyDAO.getInstance()
							.getRoomHistoryAccToCensusTemp(
									lastDischarge.getSerial());
					if (disRoomHistory == null && admRoomHistory != null) {
						if (censusStatusForResident.getAdmissionStatusDesc()
								.equalsIgnoreCase("Discharge")) {
							disRoomHistory = new RoomHistory();
							disRoomHistory
									.setSerial(admRoomHistory.getSerial());
							disRoomHistory.setResidentId(resmain.getSerial());
							disRoomHistory.setCensusId(lastDischarge
									.getSerial());
							disRoomHistory.setFloor(admRoomHistory.getFloor());
							disRoomHistory.setRoom(admRoomHistory.getRoom());
							disRoomHistory.setStartDate(admRoomHistory
									.getStartDate());
							// set enddate for discharge date
							disRoomHistory.setEndDate(lastDischarge
									.getDateAndTime());
							// Possible to get room and floor
							if (disRoomHistory.getFloor() != null
									&& disRoomHistory.getRoom() != null) {
								// if(censusStatusForResident.getAdmissionStatusDesc().equalsIgnoreCase("Discharge")){
								count++;
								System.out
										.println("Resident: "
												+ resmain.getUserPass()
												+ ", "
												+ resmain.getUserName()
												+ ", Discharge date: "
												+ lastDischarge
														.getDateAndTime()
												+ "\n");
								// Updating last discharge date into roomhistory
								doInsertRoomHistory(disRoomHistory);
							}
						}
					}
				}
			}
			System.out.println("Count: " + count);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void doInsertRoomHistory(RoomHistory roomHistory) {
		try {
			RoomHistroyDAO.getInstance().insertOrUpdateRoomHistory(roomHistory);
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String getFloor(String room) {
		String floor = null;
		for (int i = 0; i < strSubCat1.length; i++) {
			if (strSubCat1[i].equalsIgnoreCase(room)) {
				floor = "1st floor south wing";
				return floor;
			}
		}
		for (int i = 0; i < strSubCat2.length; i++) {
			if (strSubCat2[i].equalsIgnoreCase(room)) {
				floor = "Main North Wing";
				return floor;
			}
		}
		for (int i = 0; i < strSubCat3.length; i++) {
			if (strSubCat3[i].equalsIgnoreCase(room)) {
				floor = "2nd floor South Wing";
				return floor;
			}
		}
		for (int i = 0; i < strSubCat4.length; i++) {
			if (strSubCat4[i].equalsIgnoreCase(room)) {
				floor = "Main and north wing";
				return floor;
			}
		}
		return null;
	}

}
