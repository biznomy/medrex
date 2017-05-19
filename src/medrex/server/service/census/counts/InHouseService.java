/**
 * 
 */
package medrex.server.service.census.counts;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import medrex.commons.dataObj.census.DashboardInfo;
import medrex.commons.enums.CensusConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.counts.InHouse;
import medrex.server.dao.census.counts.InHouseDAO;
import medrex.server.service.census.CensusStatusService;

/**
 * @author D S Naruka
 * 
 */
public class InHouseService {
	public void delete(int residentId) throws MedrexException {
		// This code has been shifted in censusstatusservice
		// insertOrupdateCensus because managing room history (Vinod Kumar)
		/*
		 * // update room free ResidentMain resmain =
		 * ResidentInformationDAO.getInstance() .getResident(residentId); if
		 * (resmain.getRoom() != null) { resmain.setOldroom(resmain.getRoom());
		 * } resmain.setFloorType(null); resmain.setRoom(null);
		 * ResidentInformationDAO.getInstance()
		 * .insertOrUpdateResidentMain(resmain);
		 */
		InHouseDAO.getInstance().deleteInHouse(residentId);
	}

	public InHouse get(int serial) throws MedrexException {
		return InHouseDAO.getInstance().getInHouse(serial);
	}

	public List<DashboardInfo> getAll() throws MedrexException {
		return InHouseDAO.getInstance().getInHouses();
	}

	public int insertOrUpdate(InHouse ref) throws MedrexException {
		return InHouseDAO.getInstance().insertOrUpdateInHouse(ref);
	}

	public int count() throws MedrexException {
		return InHouseDAO.getInstance().getInHouseCount();
	}

	public boolean getResidentExistInHouse(int residentId)
			throws MedrexException {
		return InHouseDAO.getInstance().getResidentExistInHouse(residentId);
	}

	public List<InHouse> getAllWithInHouse(CensusStatus refCensusStatus)
			throws MedrexException {
		return InHouseDAO.getInstance().getAllWithInHouse(refCensusStatus);
	}

	public void deleteSerial(int serial) throws MedrexException {
		InHouseDAO.getInstance().deleteSerial(serial);
	}

	public InHouse getInHouseForResident(int residentSerial)
			throws MedrexException {
		return getInHouseForResident(residentSerial, new Date());
	}

	public InHouse getInHouseForResident(int residentSerial, Date forDate)
			throws MedrexException {
		InHouse refInHouse = new InHouse();
		refInHouse.setSerial(0);

		CensusStatusService censusService = new CensusStatusService();
		CensusStatus admission = censusService.getCensusLastAdmission(
				residentSerial, forDate);
		CensusStatus discharge = censusService.getCensusLastDischarge(
				residentSerial, forDate);

		if (admission != null) {
			refInHouse.setAdmittedOn(admission.getDateAndTime());
			refInHouse.setCensusStatus(admission);
			refInHouse.setFromId(admission.getFromId());
			refInHouse.setResidentId(residentSerial);
			refInHouse.setTimestamp(admission.getTimestamp());
		}

		//
		// calculating InHouse
		//

		/*
		 * if : no entry is made then : no InHouse
		 */
		if (admission == null && discharge == null) {
			return null;
		}

		/*
		 * if : admitted, but never discharged
		 */
		if (admission != null && discharge == null) {

			return refInHouse;
		}

		/*
		 * if : admitted and discharge once or more
		 */
		if (admission != null && discharge != null) {

			/*
			 * if : discharge is newer than admission
			 */
			if (admission.getDateAndTime().before(discharge.getDateAndTime())) {
				if (discharge.getDischargeType() == CensusConstants.OUT_OF_PASS) {
					return refInHouse;
				}
				return null;
			}

			/*
			 * if : admission is newer than discharge
			 */
			else {
				return refInHouse;
			}
		}

		return null;
	}

	public List<InHouse> getInHouseForResidents() throws MedrexException {
		return getInHouseForResidents(new Date());
	}

	public List<InHouse> getInHouseForResidents(Date tillDate)
			throws MedrexException {
		List<InHouse> inHouseList = new ArrayList<InHouse>();
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
			InHouse refInHouse = new InHouse();
			CensusStatus admission = admissionMap.get(residentSerial);
			CensusStatus discharge = dischargeMap.get(residentSerial);

			if (admission != null) {
				refInHouse.setAdmittedOn(admission.getDateAndTime());
				refInHouse.setCensusStatus(admission);
				refInHouse.setFromId(admission.getFromId());
				refInHouse.setResidentId(residentSerial);
				refInHouse.setTimestamp(admission.getTimestamp());
			}

			//
			// calculating InHouse
			//

			/*
			 * if : no entry is made then : no InHouse
			 */
			if (admission == null && discharge == null) {
				continue;
			}

			/*
			 * if : admitted, but never discharged
			 */
			if (admission != null && discharge == null) {
				inHouseList.add(refInHouse);
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
					if (discharge.getDischargeType() == CensusConstants.OUT_OF_PASS) {
						inHouseList.add(refInHouse);
						continue;
					}
					continue;
				}

				/*
				 * if : admission is newer than discharge
				 */
				else {
					inHouseList.add(refInHouse);
					continue;
				}
			}
		}

		return inHouseList;
	}
}
