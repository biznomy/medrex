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
import medrex.commons.vo.census.counts.Hospital;
import medrex.server.dao.census.counts.HospitalDAO;
import medrex.server.service.census.CensusStatusService;
import medrex.server.service.resident.ResidentMainService;

/**
 * @author D S Naruka
 * 
 */
public class HospitalService {
	public void delete(int residentId) throws MedrexException {
		HospitalDAO.getInstance().deleteHospital(residentId);
	}

	public Hospital get(int serial) throws MedrexException {
		return HospitalDAO.getInstance().getHospital(serial);
	}

	public List<Hospital> getAll() throws MedrexException {
		return HospitalDAO.getInstance().getHospitals();
	}

	public int insertOrUpdate(Hospital ref) throws MedrexException {
		return HospitalDAO.getInstance().insertOrUpdateHospital(ref);
	}

	public int count() throws MedrexException {
		return HospitalDAO.getInstance().getHospitalCount();
	}

	public void deleteHospitalSerial(int serial) throws MedrexException {
		HospitalDAO.getInstance().deleteHospitalSerial(serial);
	}

	public List<Hospital> getAllWithHospital(CensusStatus refCensusStatus)
			throws MedrexException {
		return (HospitalDAO.getInstance().getAllWithHospital(refCensusStatus));
	}

	public Hospital getHospitalForResident(int residentSerial)
			throws MedrexException {
		return getHospitalForResident(residentSerial, new Date());
	}

	public Hospital getHospitalForResident(int residentSerial, Date forDate)
			throws MedrexException {
		Hospital refHospital = new Hospital();
		refHospital.setSerial(0);
		refHospital.setResidentId(residentSerial);

		CensusStatusService censusService = new CensusStatusService();
		CensusStatus admission = censusService.getCensusLastAdmission(
				residentSerial, forDate);
		CensusStatus discharge = censusService.getCensusLastDischarge(
				residentSerial, forDate);
		if (discharge != null) {
			refHospital.setCensusStatus(discharge);
			refHospital.setDischargedOn(discharge.getDateAndTime());
			refHospital.setToId(discharge.getFromId());
		}

		//
		// calculating Hospital
		//

		/*
		 * if : no entry is made then : no Hospital
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
				(new ResidentMainService()).getResident(residentSerial);
				if (discharge.getFromId() == CensusConstants.HOSPITAL) {
					return refHospital;
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

	public List<Hospital> getHospitalForResidents() throws MedrexException {
		return getHospitalForResidents(new Date());
	}

	public List<Hospital> getHospitalForResidents(Date tillDate)
			throws MedrexException {
		List<Hospital> hospitalList = new ArrayList<Hospital>();
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
			Hospital refHospital = new Hospital();
			refHospital.setSerial(0);
			refHospital.setResidentId(residentSerial);

			CensusStatus admission = admissionMap.get(residentSerial);
			CensusStatus discharge = dischargeMap.get(residentSerial);

			if (discharge != null) {
				refHospital.setCensusStatus(discharge);
				refHospital.setDischargedOn(discharge.getDateAndTime());
				refHospital.setToId(discharge.getFromId());
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
					if (discharge.getFromId() == CensusConstants.HOSPITAL) {
						hospitalList.add(refHospital);
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

		return hospitalList;
	}
}
