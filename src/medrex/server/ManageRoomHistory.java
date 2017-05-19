package medrex.server;

import java.util.Date;
import java.util.List;

import medrex.commons.enums.CensusConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.RoomHistory;
import medrex.commons.vo.resident.TempRoomHistory;
import medrex.server.dao.resident.RoomHistroyDAO;
import medrex.server.service.census.CensusStatusService;
import medrex.server.service.resident.ResidentMainService;
import medrex.server.service.resident.RoomHistroySerivice;

public class ManageRoomHistory {

	public static void main(String arg[]) {
		try {
			int count = 0;

			// Getting all room history and insert into tempRoomHistory table
			List<RoomHistory> roomList = RoomHistroyDAO.getInstance()
					.getAllRoomHistory();
			for (RoomHistory roomHist : roomList) {
				count++;
				TempRoomHistory tempRoomHistory = new TempRoomHistory();
				// Room history data change under resident application
				if (roomHist.getCensusId() == 0
						&& roomHist.getStartDate() != null
						&& roomHist.getEndDate() != null) {
					tempRoomHistory.setResidentId(roomHist.getResidentId());
					tempRoomHistory.setCensusAdmissionId(0);
					tempRoomHistory.setCensusDischargeId(0);
					tempRoomHistory.setFloor(roomHist.getFloor());
					tempRoomHistory.setRoom(roomHist.getRoom());
					tempRoomHistory.setStartDate(roomHist.getStartDate());
					tempRoomHistory.setEndDate(roomHist.getEndDate());
				} else {// if not and contains start date and end date then
					// censusId type dischargeId
					CensusStatus census = new CensusStatusService()
							.getCensusStatus(roomHist.getCensusId());
					if (roomHist.getCensusId() != 0
							&& roomHist.getStartDate() != null
							&& roomHist.getEndDate() != null) {
						if (census != null
								&& CensusConstants.TYPE_DISCHARGE
										.equalsIgnoreCase(census.getTypeName())) {
							tempRoomHistory.setCensusAdmissionId(0);
							tempRoomHistory.setCensusDischargeId(roomHist
									.getCensusId());
						} else {
							tempRoomHistory.setCensusAdmissionId(roomHist
									.getCensusId());
							tempRoomHistory.setCensusDischargeId(0);
							if (census != null
									&& census.getDateAndTime() != null
									&& census.getDateAndTime().before(
											roomHist.getStartDate())) {
								System.out.println("caught");
								tempRoomHistory.setStartDate(census
										.getDateAndTime());
							}
						}
						tempRoomHistory.setResidentId(roomHist.getResidentId());
						tempRoomHistory.setFloor(roomHist.getFloor());
						tempRoomHistory.setRoom(roomHist.getRoom());
						tempRoomHistory.setStartDate(roomHist.getStartDate());
						tempRoomHistory.setEndDate(roomHist.getEndDate());

					} else {// if not and contains start date only then censusId
						// type admissionId
						if (roomHist.getCensusId() != 0
								&& roomHist.getStartDate() != null
								&& roomHist.getEndDate() == null) {
							tempRoomHistory.setResidentId(roomHist
									.getResidentId());
							tempRoomHistory.setCensusAdmissionId(roomHist
									.getCensusId());
							tempRoomHistory.setCensusDischargeId(0);
							tempRoomHistory.setFloor(roomHist.getFloor());
							tempRoomHistory.setRoom(roomHist.getRoom());
							tempRoomHistory.setStartDate(roomHist
									.getStartDate());
							tempRoomHistory.setEndDate(null);
							if (census != null
									&& CensusConstants.TYPE_ADMISSION
											.equalsIgnoreCase(census
													.getTypeName())
									&& census.getDateAndTime() != null
									&& !census.getDateAndTime().equals(
											tempRoomHistory.getStartDate())) {
								System.out.println("caught");
								tempRoomHistory.setStartDate(census
										.getDateAndTime());
							}
						} else if (roomHist.getCensusId() == 0
								&& roomHist.getStartDate() != null
								&& roomHist.getEndDate() == null) {
							tempRoomHistory.setResidentId(roomHist
									.getResidentId());
							tempRoomHistory.setCensusAdmissionId(0);
							tempRoomHistory.setCensusDischargeId(0);
							tempRoomHistory.setFloor(roomHist.getFloor());
							tempRoomHistory.setRoom(roomHist.getRoom());
							tempRoomHistory.setStartDate(roomHist
									.getStartDate());
							tempRoomHistory.setEndDate(roomHist.getEndDate());
						}
					}
				}

				if (tempRoomHistory != null) {
					RoomHistroyDAO.getInstance().insertOrUpdateTempRoomHistory(
							tempRoomHistory);
				}

			}
			System.out.println("Count: " + count);

			count = 0;
			List<TempRoomHistory> temRoomHisList = RoomHistroyDAO.getInstance()
					.getAllTempRoomHistory();
			if (temRoomHisList != null) {
				for (TempRoomHistory tempRoomHis : temRoomHisList) {
					// find and insert admissionId according to residentId and
					// startDate
					if (tempRoomHis.getCensusAdmissionId() == 0
							&& tempRoomHis.getCensusDischargeId() != 0
							&& (tempRoomHis.getStartDate() == null || tempRoomHis
									.getStartDate().getYear() != 70)) {
						CensusStatus censusStatus = new CensusStatusService()
								.getCensusLastAdmission(tempRoomHis
										.getResidentId(), tempRoomHis
										.getStartDate());
						CensusStatus dischargeCensus = new CensusStatusService()
								.getCensusLastDischarge(tempRoomHis
										.getResidentId(), tempRoomHis
										.getEndDate());
						if (censusStatus != null && dischargeCensus != null) {
							tempRoomHis.setCensusAdmissionId(censusStatus
									.getSerial());
							System.out.println("vinod: "
									+ tempRoomHis.getResidentId() + ", "
									+ tempRoomHis.getCensusAdmissionId());
						}
						if (censusStatus != null
								&& CensusConstants.TYPE_ADMISSION
										.equalsIgnoreCase(censusStatus
												.getTypeName())
								&& censusStatus.getDateAndTime() != null
								&& !censusStatus.getDateAndTime().equals(
										tempRoomHis.getStartDate())) {
							System.out.println("caught");
							tempRoomHis.setStartDate(censusStatus
									.getDateAndTime());
						}
						if (dischargeCensus != null
								&& CensusConstants.TYPE_DISCHARGE
										.equalsIgnoreCase(dischargeCensus
												.getTypeName())
								&& dischargeCensus.getDateAndTime() != null
								&& !dischargeCensus.getDateAndTime().equals(
										tempRoomHis.getEndDate())) {
							System.out.println("caught");
							tempRoomHis.setEndDate(dischargeCensus
									.getDateAndTime());
						}
					}
					if (tempRoomHis.getCensusAdmissionId() == 0
							&& tempRoomHis.getCensusDischargeId() != 0
							&& tempRoomHis.getStartDate().getYear() == 70) {
						CensusStatus censusStatus = new CensusStatusService()
								.getCensusLastAdmission(tempRoomHis
										.getResidentId(), tempRoomHis
										.getEndDate());
						CensusStatus dischargeCensus = new CensusStatusService()
								.getCensusLastDischarge(tempRoomHis
										.getResidentId(), tempRoomHis
										.getEndDate());
						if (censusStatus != null) {
							tempRoomHis.setCensusAdmissionId(censusStatus
									.getSerial());
							tempRoomHis.setStartDate(censusStatus
									.getDateAndTime());
							// System.out.println("vinod: "+
							// tempRoomHis.getResidentId()+", "+
							// tempRoomHis.getCensusAdmissionId());
						}
						if (censusStatus != null
								&& CensusConstants.TYPE_ADMISSION
										.equalsIgnoreCase(censusStatus
												.getTypeName())
								&& censusStatus.getDateAndTime() != null
								&& !censusStatus.getDateAndTime().equals(
										tempRoomHis.getStartDate())) {
							System.out.println("caught");
							tempRoomHis.setStartDate(censusStatus
									.getDateAndTime());
						}
						if (dischargeCensus != null
								&& CensusConstants.TYPE_DISCHARGE
										.equalsIgnoreCase(dischargeCensus
												.getTypeName())
								&& dischargeCensus.getDateAndTime() != null
								&& !dischargeCensus.getDateAndTime().equals(
										tempRoomHis.getEndDate())) {
							System.out.println("caught");
							tempRoomHis.setEndDate(dischargeCensus
									.getDateAndTime());
						}
					}
					if (tempRoomHis != null) {
						count++;
						RoomHistroyDAO.getInstance()
								.insertOrUpdateTempRoomHistory(tempRoomHis);
					}
				}
				System.out.println("Count: " + count);
			}

			// Entry for dummy room and floor for each admission and discharge
			String TYPE_ADMISSION = CensusConstants.TYPE_ADMISSION;
			String TYPE_DISCHARGE = CensusConstants.TYPE_DISCHARGE;
			int countAdmission = 0;
			int countDischarge = 0;
			List<ResidentMain> resmainList = new ResidentMainService()
					.getResidentMain();
			for (ResidentMain res : resmainList) {
				List<CensusStatus> censusStatusList = new CensusStatusService()
						.getCensusStatuss(res.getSerial());

				int previousCensusId = 0; // for storing admission before
				// discharge
				if (censusStatusList != null) {
					for (CensusStatus census : censusStatusList) {
						int censusSerial = census.getSerial();
						// for admission type
						if (TYPE_ADMISSION.equalsIgnoreCase(census
								.getTypeName())) {
							TempRoomHistory temprh = new RoomHistroySerivice()
									.getRoomHistoryAccToCensusAdmission(censusSerial);
							if (temprh == null) {
								countAdmission++;
								// System.out.println("Admission not found: "+
								// censusSerial);
								previousCensusId = censusSerial;
								TempRoomHistory temproomhist = new TempRoomHistory();
								temproomhist.setResidentId(census
										.getResidentId());
								temproomhist.setCensusAdmissionId(censusSerial);
								temproomhist.setCensusDischargeId(0);
								temproomhist.setFloor("1st floor south wing");
								temproomhist.setRoom("100");
								temproomhist.setStartDate(census
										.getDateAndTime());
								RoomHistroyDAO.getInstance()
										.insertOrUpdateTempRoomHistory(
												temproomhist);
							}
						} else if (TYPE_DISCHARGE.equalsIgnoreCase(census
								.getTypeName())) {// for discharge type
							TempRoomHistory temprh = new RoomHistroySerivice()
									.getRoomHistoryAccToCensusDischarge(censusSerial);
							if (temprh == null) {
								countDischarge++;
								System.out.println("Discharge not found: "
										+ censusSerial);
								getNextDischarge(census.getResidentId(), census
										.getDateAndTime(), TYPE_DISCHARGE);
								TempRoomHistory temp = new RoomHistroySerivice()
										.getRoomHistoryAccToCensusAdmission(previousCensusId);
								temp.setCensusDischargeId(censusSerial);
								temp.setEndDate(census.getDateAndTime());
								RoomHistroyDAO.getInstance()
										.insertOrUpdateTempRoomHistory(temp);
							}
						}
					}
				}
			}
			System.out.println("countAdmission: " + countAdmission);
			System.out.println("countDischarge: " + countDischarge);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static CensusStatus getNextDischarge(int resid, Date dateAndTime,
			String typeName) {
		CensusStatus census = null;
		try {
			census = new CensusStatusService().getNextDischarge(resid,
					dateAndTime, typeName);
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return census;
	}
}
