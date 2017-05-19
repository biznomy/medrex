package medrex.server.service.resident;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.dataObj.Rooms;
import medrex.commons.enums.RoomStatus;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.countAudit.CountAuditFloor;
import medrex.commons.vo.census.counts.InHouse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.RoomChange;
import medrex.commons.vo.resident.RoomHistory;
import medrex.commons.vo.resident.RoomHistoryReport;
import medrex.commons.vo.resident.TempRoomHistory;
import medrex.server.dao.resident.RoomHistroyDAO;
import medrex.server.service.census.counts.InHouseService;

public class RoomHistroySerivice {

	public int insertOrUpdateRoomHistory(RoomHistory roomHistory)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance()
				.insertOrUpdateRoomHistory(roomHistory));
	}

	public void deleteRoomHistory(int censusid) throws MedrexException {
		RoomHistroyDAO.getInstance().deleteRoomHistory(censusid);
	}

	public void deleteRoomHistoryByCensusAdmissionId(int censusAdmissonId)
			throws MedrexException {
		RoomHistroyDAO.getInstance().deleteRoomHistoryByCensusAdmissionId(
				censusAdmissonId);
	}

	public List<TempRoomHistory> getRoomHistory(Date from, Date to)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance().getRoomHistory(from, to));
	}

	/*
	 * public RoomHistory getRoomHistory(int residentId, Date date) throws
	 * MedrexException { return
	 * (RoomHistroyDAO.getInstance().getRoomHistory(residentId, date)); }
	 */

	public TempRoomHistory getRoomHistory(int residentId, Date date)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance().getRoomHistory(residentId, date));
	}

	public List<Rooms> getResidentCountAuditInfo(List<CountAuditFloor> records,
			Date searchDate) throws MedrexException, RemoteException {
		List<Rooms> roomsList = new ArrayList<Rooms>();

		for (CountAuditFloor countAuditFloor : records) {
			Rooms rooms = new Rooms();
			int resId = countAuditFloor.getResidentId();
			TempRoomHistory tempRoomHistory = RoomHistroyDAO.getInstance()
					.getRoomHistory(resId, searchDate);
			ResidentMain res = new ResidentMainService().getResident(resId);
			rooms.setResmain(res);
			if (tempRoomHistory != null) {
				rooms.setCurrentRoom(tempRoomHistory.getRoom());
			}

			roomsList.add(rooms);
		}

		return roomsList;
	}

	public List<RoomHistory> getRoomHistory(int residentId)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance().getRoomHistory(residentId));
	}

	public List<RoomChange> getRoomChange(Date searchDate)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance().getRoomChange(searchDate));
	}

	public List<RoomChange> getRoomChangeFirstFloor(Date searchDate)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance()
				.getRoomChangeFirstFloor(searchDate));
	}

	public List<RoomChange> getRoomChangeSecondFloor(Date searchDate)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance()
				.getRoomChangeSecondFloor(searchDate));
	}

	public TempRoomHistory getRoomHistoryAccToCensusAdmission(int cenAdmissionId)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance()
				.getRoomHistoryAccToCensusAdmission(cenAdmissionId));
	}

	public TempRoomHistory getRoomHistoryAccToCensusDischarge(int cenDischargeId)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance()
				.getRoomHistoryAccToCensusDischarge(cenDischargeId));
	}

	public int insertOrUpdateTempRoomHistory(TempRoomHistory roomHistory)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance()
				.insertOrUpdateTempRoomHistory(roomHistory));
	}

	/*
	 * public RoomHistory getLastRoomHistory(int residentId) throws
	 * MedrexException { return
	 * (RoomHistroyDAO.getInstance().getLastRoomHistory(residentId)); }
	 */

	public TempRoomHistory getLastRoomHistory(int residentId)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance().getLastRoomHistory(residentId));
	}

	// Getting current room for resident
	public TempRoomHistory getCurrentRoomForResident(int residentId)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance()
				.getCurrentRoomForResident(residentId));
	}

	// Getting all Room Histories Data according to dateAndTime
	public List<TempRoomHistory> getRoomHistories(Date dateAndTime)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance().getRoomHistories(dateAndTime));
	}

	// Getting Room History Data according to dateAndTime and residentId
	public TempRoomHistory getRoomHistoriesForResident(int residentId,
			Date dateAndTime) throws MedrexException {
		return (RoomHistroyDAO.getInstance().getRoomHistoriesForResident(
				residentId, dateAndTime));
	}

	// Getting Room Histories Data according to residentId
	public List<TempRoomHistory> getRoomHistoriesForResident(int residentId)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance()
				.getRoomHistoriesForResident(residentId));
	}

	// Getting current room for resident
	public TempRoomHistory getRoomForResident(int residentId,
			Date currentDateAndTime) throws MedrexException {
		return (RoomHistroyDAO.getInstance().getRoomHistoriesForResident(
				residentId, currentDateAndTime));
	}

	// Getting room status for residents
	public List<Rooms> getRoomStatusForResidents(Date dateAndTime)
			throws MedrexException {
		List<Rooms> roomsList = new ArrayList<Rooms>();
		// Getting inhouse resdents for this dateAndTime
		List<InHouse> inList = new InHouseService()
				.getInHouseForResidents(dateAndTime);
		System.out.println("inList size: " + inList.size());
		for (InHouse inh : inList) {
			int resId = inh.getResidentId();
			ResidentMain resmain = new ResidentMainService().getResident(resId);
			Rooms rooms = new Rooms();
			// Get room history
			TempRoomHistory roomHist = getRoomForResident(resId, dateAndTime);
			if (roomHist != null) {
				rooms.setCurrentFloor(roomHist.getFloor());
				rooms.setCurrentRoom(roomHist.getRoom());
				rooms.setTimeSince(roomHist.getStartDate());
				rooms.setStatus(RoomStatus.OCCUPIED);
				// Get resident Object
				// ResidentMain resmain = new
				// ResidentMainService().getResident(resId);
				rooms.setResmain(resmain);
				roomsList.add(rooms);
			} else {
				System.out.println("resId: " + resId + ", "
						+ resmain.getUserPass() + ", " + resmain.getUserName());
			}
		}
		return roomsList;
	}

	// Getting room status for residents
	public List<Rooms> getRoomStatusForResidents(Date dateAndTime,
			String floorType) throws MedrexException {
		List<Rooms> roomsList = new ArrayList<Rooms>();
		// Getting inhouse resdents for this dateAndTime
		List<InHouse> inList = new InHouseService()
				.getInHouseForResidents(dateAndTime);
		System.out.println("inList size: " + inList.size());
		for (InHouse inh : inList) {
			int resId = inh.getResidentId();
			ResidentMain resmain = new ResidentMainService()
					.getResidentWithoutImg(resId);
			Rooms rooms = new Rooms();
			// Get room history
			TempRoomHistory roomHist = getRoomForResident(resId, dateAndTime);
			if (roomHist != null) {
				if (floorType.equalsIgnoreCase(roomHist.getFloor())) {
					rooms.setCurrentFloor(roomHist.getFloor());
					rooms.setCurrentRoom(roomHist.getRoom());
					rooms.setTimeSince(roomHist.getStartDate());
					rooms.setStatus(RoomStatus.OCCUPIED);
					rooms.setResmain(resmain);
					roomsList.add(rooms);
				}
			} else {
				System.out.println("resId: " + resId + ", "
						+ resmain.getUserPass() + ", " + resmain.getUserName());
			}
		}
		return roomsList;
	}

	public TempRoomHistory getRoomForResident(int serial, String str)
			throws MedrexException {
		return (RoomHistroyDAO.getInstance().getRoomForResident(serial, str));
	}

	public Object[] getRoomHistoryDataSource(Date dFrom, Date dTo)
			throws MedrexException {
		// System.out.println("In Service");
		List<RoomHistoryReport> l = new ArrayList<RoomHistoryReport>();
		List<TempRoomHistory> list = null;
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MMM dd, yyyy  hh:mm a");
		try {
			list = getRoomHistory(dFrom, dTo);
			// System.out.println("List size is :" + list.size());
		} catch (MedrexException e2) {
			e2.printStackTrace();
		}
		ResidentMain rm = null;
		String from = df.format(dFrom);
		String to = df.format(dTo);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			RoomHistoryReport rhr = new RoomHistoryReport();
			TempRoomHistory rh = (TempRoomHistory) it.next();
			rhr.setStartDate(from);
			rhr.setEndDate(to);

			try {
				rm = new ResidentMainService().getResident(rh.getResidentId());
			} catch (MedrexException e1) {
				e1.printStackTrace();
			}
			rhr.setResidentId(rm.getUserPass() + ", " + rm.getUserName());
			// System.out.println("RM is :" + rm.getUserPass() + ", "
			// + rm.getUserName());
			rhr.setFloor(rh.getFloor());
			rhr.setRoom(rh.getRoom());
			rhr.setStartDate(df.format(rh.getStartDate()));
			rhr.setEndDate(df.format(rh.getEndDate()));

			l.add(rhr);
		}
		Object[] reportRows = l.toArray();
		return reportRows;
	}
}
