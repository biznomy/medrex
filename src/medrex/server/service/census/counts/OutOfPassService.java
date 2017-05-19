package medrex.server.service.census.counts;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import medrex.commons.enums.CensusConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.counts.OutOfPass;
import medrex.server.dao.census.counts.OutOfPassDAO;
import medrex.server.service.census.CensusStatusService;
import medrex.server.service.resident.ResidentMainService;
import medrex.server.util.Utils;

public class OutOfPassService {

	public void insertOrUpdateOutOfPass(OutOfPass oop) throws MedrexException {
		OutOfPassDAO.getInstance().insertOrUpdateOutOfPass(oop);
	}

	public int count() throws MedrexException {
		return OutOfPassDAO.getInstance().getOutOfPassCount();
	}

	public void deleteOutOfPass(int serial) throws MedrexException {
		OutOfPassDAO.getInstance().deleteOutOfPass(serial);
	}

	public OutOfPass getOutOfPassForResident(int residentSerial)
			throws MedrexException {
		return getOutOfPassForResident(residentSerial, new Date());
	}

	public OutOfPass getOutOfPassForResident(int residentSerial, Date forDate)
			throws MedrexException {
		OutOfPass refOutOfPass = new OutOfPass();
		refOutOfPass.setSerial(0);
		refOutOfPass.setResidentId(residentSerial);

		CensusStatusService censusService = new CensusStatusService();
		CensusStatus admission = censusService.getCensusLastAdmission(
				residentSerial, forDate);
		CensusStatus discharge = censusService.getCensusLastDischarge(
				residentSerial, forDate);
		if (discharge != null) {
			refOutOfPass.setCensusStatus(discharge);
			refOutOfPass.setDischargedOn(discharge.getDateAndTime());
			refOutOfPass.setTimestamp(discharge.getTimestamp());
		}

		//
		// calculating OutOfPass
		//

		/*
		 * if : no entry is made then : no OutOfPass
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
				if (discharge.getDischargeType() == CensusConstants.OUT_OF_PASS) {
					return refOutOfPass;
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

	public List<OutOfPass> getOutOfPassForResidents() throws MedrexException {
		return getOutOfPassForResidents(new Date());
	}

	public List<OutOfPass> getOutOfPassForResidents(Date tillDate)
			throws MedrexException {
		List<OutOfPass> outOfPassList = new ArrayList<OutOfPass>();
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
			OutOfPass refOutOfPass = new OutOfPass();
			refOutOfPass.setSerial(0);
			refOutOfPass.setResidentId(residentSerial);

			CensusStatus admission = admissionMap.get(residentSerial);
			CensusStatus discharge = dischargeMap.get(residentSerial);

			if (discharge != null) {
				refOutOfPass.setCensusStatus(discharge);
				refOutOfPass.setDischargedOn(discharge.getDateAndTime());
				refOutOfPass.setTimestamp(discharge.getTimestamp());
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
					if (discharge.getDischargeType() == CensusConstants.OUT_OF_PASS) {
						outOfPassList.add(refOutOfPass);
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

		return outOfPassList;
	}

	// public int getOutOfPassCount(Date from, Date to) {
	// return 0;
	// }

	public int getOutOfPassCount() {
		return getOutOfPassCount(new Date());
	}

	public int getOutOfPassCount(Date tillDate) {
		return 0;
	}

	public int getOutOfPassCalendarYearCount(int currentResidenceKey) {
		int outOnPassDay = 0;
		CensusStatusService censusService = new CensusStatusService();

		CensusStatus admission = null, discharge = null;

		try {
			admission = censusService
					.getCensusLastAdmission(currentResidenceKey);
			discharge = censusService
					.getCensusLastDischarge(currentResidenceKey);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		/*
		 * if : no admission then : no outOnPass status
		 */
		if (admission == null) {
			return 0;
		}

		/*
		 * if : admitted but never discharged then : outOnPass not applicable
		 */
		if (admission != null && discharge == null) {
			return 0;
		}

		/*
		 * if : admission and discharged once or more
		 */
		if (admission != null && discharge != null) {
			outOnPassDay = 0;

			/*
			 * if : admission is newer than discharge
			 */
			if (admission.getDateAndTime()
					.compareTo(discharge.getDateAndTime()) > 0) {
				try {
					CensusStatus curD = null, curA = null;
					outOnPassDay = 0;
					List<CensusStatus> d = censusService
							.getCensusStatuss(currentResidenceKey,
									CensusConstants.TYPE_DISCHARGE);
					List<CensusStatus> a = censusService
							.getCensusStatuss(currentResidenceKey,
									CensusConstants.TYPE_ADMISSION);
					Iterator<CensusStatus> dItr = d.iterator();
					Iterator<CensusStatus> aItr = a.iterator();
					while (dItr.hasNext()) {
						curD = dItr.next();
						curA = aItr.next();
						if (curD.getDischargeType() == CensusConstants.OUT_OF_PASS) {
							outOnPassDay += Utils.DateDifference(curA
									.getDateAndTime(), curD.getDateAndTime());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			/*
			 * if : discharge is newer than admission
			 */
			else {
				try {
					CensusStatus curD = null, curA = null;
					outOnPassDay = 0;
					List<CensusStatus> d = censusService
							.getCensusStatuss(currentResidenceKey,
									CensusConstants.TYPE_DISCHARGE);
					List<CensusStatus> a = censusService
							.getCensusStatuss(currentResidenceKey,
									CensusConstants.TYPE_ADMISSION);
					Iterator<CensusStatus> dItr = d.iterator();
					Iterator<CensusStatus> aItr = a.iterator();
					curD = dItr.next();
					Date curDate = new Date();
					if (curD.getDateAndTime().before(curDate)) {
						outOnPassDay += Utils.DateDifference(curDate, curD
								.getDateAndTime());
					}
					while (dItr.hasNext()) {
						curD = dItr.next();
						curA = aItr.next();
						if (curD.getDischargeType() == CensusConstants.OUT_OF_PASS) {
							outOnPassDay += Utils.DateDifference(curA
									.getDateAndTime(), curD.getDateAndTime());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return outOnPassDay;
	}

	public int getOutOnPassCalendarYearCount(int currentResidenceKey, int year) {
		int outOnPassDay = 0;
		CensusStatusService censusService = new CensusStatusService();

		CensusStatus admission = null, discharge = null;

		try {
			admission = censusService
					.getCensusLastAdmission(currentResidenceKey);
			discharge = censusService
					.getCensusLastDischarge(currentResidenceKey);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		/*
		 * if : no admission then : no outOnPass status
		 */
		if (admission == null) {
			return 0;
		}

		/*
		 * if : admitted but never discharged then : outOnPass not applicable
		 */
		if (admission != null && discharge == null) {
			return 0;
		}

		/*
		 * if : admission and discharged once or more
		 */
		if (admission != null && discharge != null) {
			outOnPassDay = 0;

			/*
			 * if : admission is newer than discharge
			 */
			if (admission.getDateAndTime()
					.compareTo(discharge.getDateAndTime()) > 0) {
				try {
					CensusStatus curD = null, curA = null;
					outOnPassDay = 0;
					List<CensusStatus> d = censusService.getCensusStatuss(
							currentResidenceKey,
							CensusConstants.TYPE_DISCHARGE, year);
					List<CensusStatus> a = censusService.getCensusStatuss(
							currentResidenceKey,
							CensusConstants.TYPE_ADMISSION, year);
					Iterator<CensusStatus> dItr = d.iterator();
					Iterator<CensusStatus> aItr = a.iterator();
					while (dItr.hasNext()) {
						curD = dItr.next();
						curA = aItr.next();
						if (curD.getDischargeType() == CensusConstants.OUT_OF_PASS) {
							outOnPassDay += Utils.DateDifference(curA
									.getDateAndTime(), curD.getDateAndTime());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			/*
			 * if : discharge is newer than admission
			 */
			else {
				try {
					CensusStatus curD = null, curA = null;
					outOnPassDay = 0;
					List<CensusStatus> d = censusService.getCensusStatuss(
							currentResidenceKey,
							CensusConstants.TYPE_DISCHARGE, year);
					List<CensusStatus> a = censusService.getCensusStatuss(
							currentResidenceKey,
							CensusConstants.TYPE_ADMISSION, year);
					Iterator<CensusStatus> dItr = d.iterator();
					Iterator<CensusStatus> aItr = a.iterator();
					curD = dItr.next();
					Date curDate = new Date();
					if (curD.getDateAndTime().before(curDate)) {
						outOnPassDay += Utils.DateDifference(curDate, curD
								.getDateAndTime());
					}
					while (dItr.hasNext()) {
						curD = dItr.next();
						curA = aItr.next();
						if (curD.getDischargeType() == CensusConstants.OUT_OF_PASS) {
							outOnPassDay += Utils.DateDifference(curA
									.getDateAndTime(), curD.getDateAndTime());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return outOnPassDay;
	}

}
