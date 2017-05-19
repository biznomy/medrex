/**
 * 
 */
package medrex.server.service.census.counts;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import medrex.commons.enums.CensusConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.counts.BedHold;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.dao.census.counts.BedHoldDAO;
import medrex.server.service.census.CensusStatusService;
import medrex.server.service.resident.ResidentMainService;
import medrex.server.util.Utils;

/**
 * @author D S Naruka
 * 
 */
public class BedHoldService {
	public void delete(int residentId) throws MedrexException {
		// This code has been shifted in censusstatusservice
		// insertOrupdateCensus because managing room history (Vinod Kumar)
		/*
		 * // update room free ResidentMain resmain =
		 * ResidentInformationDAO.getInstance() .getResident(residentId); if
		 * (resmain.getRoom() != null) { resmain.setOldroom(resmain.getRoom());
		 * } resmain.setRoom(null); ResidentInformationDAO.getInstance()
		 * .insertOrUpdateResidentMain(resmain);
		 */

		BedHoldDAO.getInstance().deleteBedHold(residentId);
	}

	public BedHold get(int serial) throws MedrexException {
		return BedHoldDAO.getInstance().getBedHold(serial);
	}

	public List<BedHold> getAll() throws MedrexException {
		return BedHoldDAO.getInstance().getBedHolds();
	}

	public int insertOrUpdate(BedHold ref) throws MedrexException {
		return BedHoldDAO.getInstance().insertOrUpdateBedHold(ref);
	}

	public int count() throws MedrexException {
		return BedHoldDAO.getInstance().getBedHoldCount();
	}

	public List<BedHold> getAllWithBedHold(CensusStatus refCensusStatus)
			throws MedrexException {
		return BedHoldDAO.getInstance().getAllWithBedHold(refCensusStatus);
	}

	public void deleteSerial(int serial) throws MedrexException {
		BedHoldDAO.getInstance().deleteBedHoldSerial(serial);
	}

	public BedHold getBedHoldForResident(int residentSerial)
			throws MedrexException {
		return getBedHoldForResident(residentSerial, new Date());
	}

	public BedHold getBedHoldForResident(int residentSerial, Date forDate)
			throws MedrexException {
		BedHold refBedHold = new BedHold();
		refBedHold.setSerial(0);
		refBedHold.setResidentId(residentSerial);

		CensusStatusService censusService = new CensusStatusService();
		CensusStatus admission = censusService.getCensusLastAdmission(
				residentSerial, forDate);
		CensusStatus discharge = censusService.getCensusLastDischarge(
				residentSerial, forDate);
		if (discharge != null) {
			refBedHold.setCensusStatus(discharge);
			refBedHold.setDischargedOn(discharge.getDateAndTime());
			refBedHold.setToId(discharge.getFromId());
		}

		//
		// calculating BedHold
		//

		/*
		 * if : no entry is made then : no BedHold
		 */
		if (admission == null && discharge == null) {
			return null;
		}

		/*
		 * if : admitted, but never discharged
		 */
		if (admission != null && discharge == null) {
			return null;
		}

		/*
		 * if : admitted and discharge once or more
		 */
		if (admission != null && discharge != null) {

			/*
			 * if : discharge is newer than admission
			 */
			if (admission.getDateAndTime().before(discharge.getDateAndTime())) {
				ResidentMain resident = (new ResidentMainService())
						.getResident(residentSerial);
				if (discharge.getFromId() == CensusConstants.HOSPITAL
						&& resident.getMedicaidNum() != null) {
					if (Utils.DateDifference(new Date(), discharge
							.getDateAndTime()) <= 10) {
						return refBedHold;
					}
					return null;
				}
				return null;
			}

			/*
			 * if : admission is newer than discharge
			 */
			else {
				return null;
			}
		}

		return null;
	}

	public List<BedHold> getBedHoldForResidents() throws MedrexException {
		return getBedHoldForResidents(new Date());
	}

	public List<BedHold> getBedHoldForResidents(Date tillDate)
			throws MedrexException {
		List<BedHold> bedHoldList = new ArrayList<BedHold>();
		Map<Integer, CensusStatus> admissionMap = new HashMap<Integer, CensusStatus>();
		Map<Integer, CensusStatus> dischargeMap = new HashMap<Integer, CensusStatus>();

		CensusStatusService censusService = new CensusStatusService();

		List<CensusStatus> admissionList = censusService
				.getCensusStatussAdmission(tillDate);
		List<CensusStatus> dischargeList = censusService
				.getCensusStatussDischarge(tillDate);
		List<Integer> residentKeyList = new ArrayList<Integer>();

		for (CensusStatus census : admissionList) {
			admissionMap.put(census.getResidentId(), census);
			if (!residentKeyList.contains(census.getResidentId())) {
				residentKeyList.add(census.getResidentId());
			}
		}
		for (CensusStatus census : dischargeList) {
			dischargeMap.put(census.getResidentId(), census);
			if (!residentKeyList.contains(census.getResidentId())) {
				residentKeyList.add(census.getResidentId());
			}
		}

		for (Integer residentKey : residentKeyList) {
			int residentSerial = residentKey;
			BedHold refBedHold = new BedHold();
			refBedHold.setSerial(0);
			refBedHold.setResidentId(residentSerial);

			CensusStatus admission = admissionMap.get(residentSerial);
			CensusStatus discharge = dischargeMap.get(residentSerial);

			if (discharge != null) {
				refBedHold.setCensusStatus(discharge);
				refBedHold.setDischargedOn(discharge.getDateAndTime());
				refBedHold.setToId(discharge.getFromId());
			}

			//
			// calculating BedHold
			//

			/*
			 * if : no entry is made then : no BedHold
			 */
			if (admission == null && discharge == null) {
				continue;
			}

			/*
			 * if : admitted, but never discharged
			 */
			if (admission != null && discharge == null) {
				continue;
			}

			/*
			 * if : admitted and discharge once or more
			 */
			if (admission != null && discharge != null) {

				/*
				 * if : discharge is newer than admission
				 */
				if (admission.getDateAndTime().before(
						discharge.getDateAndTime())) {
					ResidentMain resident = (new ResidentMainService())
							.getResident(residentSerial);
					if (discharge.getFromId() == CensusConstants.HOSPITAL
							&& resident.getMedicaidNum() != null) {
						if (Utils.DateDifference(new Date(), discharge
								.getDateAndTime()) <= 10) {
							bedHoldList.add(refBedHold);
							continue;
						}
						continue;
					}
					continue;
				}

				/*
				 * if : admission is newer than discharge
				 */
				else {
					continue;
				}
			}
		}

		return bedHoldList;
	}
}
