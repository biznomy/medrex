package medrex.server.service.census;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.enums.CensusConstants;
import medrex.commons.enums.Severity;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.FormSchedule;
import medrex.commons.vo.admin.PendingForm;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.CensusStatusForResident;
import medrex.commons.vo.census.counts.BedHold;
import medrex.commons.vo.census.counts.Hospital;
import medrex.commons.vo.census.counts.InHouse;
import medrex.commons.vo.census.counts.OutOfPass;
import medrex.commons.vo.census.counts.SignOut;
//import medrex.commons.vo.mds.PendingMDS;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;
import medrex.server.constants.Global;
import medrex.server.dao.census.CensusStatusDAO;
import medrex.server.service.admin.formScheduler.FormScheduleService;
import medrex.server.service.admin.formScheduler.PendingFormService;
import medrex.server.service.census.counts.BedHoldService;
import medrex.server.service.census.counts.HospitalService;
import medrex.server.service.census.counts.InHouseService;
import medrex.server.service.census.counts.OutOfPassService;
import medrex.server.service.census.counts.SignOutService;
import medrex.server.service.resident.ResidentMainService;
import medrex.server.service.resident.RoomHistroySerivice;
import medrex.server.util.Utils;

public class CensusStatusService {

	public int insertOrUpdateCensusStatus(CensusStatus refCensusStatus)
			throws MedrexException {
		// keep initial Serial ( in case of new addition)
		int initSerial = refCensusStatus.getSerial();

		// insert or update this census status
		int serial = CensusStatusDAO.getInstance().insertOrUpdateCensusStatus(
				refCensusStatus);

		// delete all census counts related to this censusStatus
		if (serial != 0) {
			deleteAllCensusCounts(refCensusStatus);
		}

		// /insert or Update pending forms
		if (initSerial == 0) {
			doInsertOrUpdatePendingForms(refCensusStatus, serial);
		}

		// updation for InHouse Count
		ResidentMain resident = (new ResidentMainService()
				.getResident(refCensusStatus.getResidentId()));
		resident.getUserName();
		CensusStatus admission = getCensusLastAdmission(resident.getSerial());
		CensusStatus discharge = getCensusLastDischarge(resident.getSerial());
		CensusStatus signOut = getCensusLastSignOut(resident.getSerial());
		CensusStatus signIn = getCensusLastSignIn(resident.getSerial());

		if (refCensusStatus.getTypeName().equalsIgnoreCase(
				CensusConstants.TYPE_ADMISSION)) {
			new InHouseService().delete(resident.getSerial());
			InHouse refInHouse = new InHouse();
			refInHouse.setResidentId(resident.getSerial());
			refInHouse.setAdmittedOn(refCensusStatus.getDateAndTime());
			refInHouse.setFromId(refCensusStatus.getFromId());
			refInHouse.setCensusStatus(refCensusStatus);
			refInHouse.setTimestamp(new Date());
			// inHouse + 1
			if (admission != null && discharge == null) {
				new InHouseService().insertOrUpdate(refInHouse);
			}
			// inHouse + 1
			if (admission != null
					&& discharge != null
					&& discharge.getDischargeType() != CensusConstants.OUT_OF_PASS) {
				new InHouseService().insertOrUpdate(refInHouse);
			}
			// out of pass
			if (admission != null
					&& discharge != null
					&& discharge.getDischargeType() == CensusConstants.OUT_OF_PASS) {
				ResidentMain r = (new ResidentMainService()
						.getResident(refCensusStatus.getResidentId()));
				r.setOutOfPassCount(0);
				r.setOutOfPassTimestamp(null);

				(new ResidentMainService()).insertOrUpdateResidentMain(r);
				// (new
				// ResidentMainService()).getResident(resident.getSerial());
				new OutOfPassService().deleteOutOfPass(refCensusStatus
						.getResidentId());
				new InHouseService().insertOrUpdate(refInHouse);
			}
			// hospital - 1
			if (admission != null && discharge != null
					&& discharge.getFromId() == CensusConstants.HOSPITAL) {
				new HospitalService().delete(resident.getSerial());
			}
			// bedhold - 1 if admission (if any)
			new BedHoldService().delete(resident.getSerial());

		} else if (refCensusStatus.getTypeName().equalsIgnoreCase(
				CensusConstants.TYPE_DISCHARGE)) {
			// Room History
			TempRoomHistory roomHistory = new RoomHistroySerivice()
					.getLastRoomHistory(refCensusStatus.getResidentId());
			// when Discharge
			if (refCensusStatus.getCurrentCenusStatusNextId() == 0) {
				if (roomHistory != null) {
					roomHistory.setCensusDischargeId(refCensusStatus
							.getSerial());
					roomHistory.setEndDate(refCensusStatus.getDateAndTime());
					new RoomHistroySerivice()
							.insertOrUpdateTempRoomHistory(roomHistory);
				}

			} else { // Update Discharge
				TempRoomHistory roomHistoryAccToCen = new RoomHistroySerivice()
						.getRoomHistoryAccToCensusDischarge(refCensusStatus
								.getSerial());
				if (roomHistoryAccToCen != null) {
					// roomHistoryAccToCen.setCensusDischargeId(refCensusStatus.getSerial());
					roomHistoryAccToCen.setEndDate(refCensusStatus
							.getDateAndTime());
					new RoomHistroySerivice()
							.insertOrUpdateTempRoomHistory(roomHistoryAccToCen);
				}
			}

			// new InHouseService().delete(resident.getSerial());

			int resserial = resident.getSerial();
			CensusStatus censusStatus = getCensusLastAdmission(resserial);
			int day = Utils.DateDifference(new Date(), censusStatus
					.getDateAndTime());
			ResidentMainService residentMainService = new ResidentMainService();
			if ((day > 0) && (day <= 100)) {
				System.out.println("insurance valid: " + day);
				ResidentMain res = residentMainService.getResident(resserial);
				if (res.getMedicalRecordNum() != null
						&& (!res.getMedicalRecordNum().equals(""))) {
					int insCount = res.getInsuranceCount();
					if (insCount != 0) {
						res.setInsuranceCount(insCount - day);
						residentMainService.insertOrUpdateResidentMain(res);
					}
				}
			}

			// out on pass
			// System.out.println("Addmition Date is :"+discharge.getAnticipatedDateAndTime()+"Discharge Type is:"+discharge.getDischargeType());
			// System.out.println("Addmition Date is :"+admission.getAnticipatedDateAndTime()+"Discharge Type is:"+admission.getDischargeType());
			// delete out of pass when exist;
			(new OutOfPassService()).deleteOutOfPass(resident.getSerial());
			if (admission != null
					&& discharge.getDischargeType() == CensusConstants.OUT_OF_PASS) {
				resident.setOutOfPassCount(0);
				resident.setOutOfPassTimestamp(new Date());
				// System.out.println("room: "+ resident.getRoom()+"old room: "+
				// resident.getOldroom());
				(new ResidentMainService())
						.insertOrUpdateResidentMain(resident);
				OutOfPass oop = new OutOfPass();
				oop.setCensusStatus(refCensusStatus);
				oop.setDischargedOn(refCensusStatus.getDateAndTime());
				oop.setResidentId(refCensusStatus.getResidentId());
				oop.setTimestamp(refCensusStatus.getTimestamp());
				(new OutOfPassService()).insertOrUpdateOutOfPass(oop);
				new InHouseService().delete(resident.getSerial());
			}
			// inHouse - 1
			if (discharge.getDischargeType() != CensusConstants.OUT_OF_PASS) {
				new InHouseService().delete(resident.getSerial());
			}
			// Hospital - 1
			if (discharge.getFromId() == CensusConstants.HOME) {
				new HospitalService().delete(resident.getSerial());
			}
			// hospital + 1
			if (discharge.getFromId() == CensusConstants.HOSPITAL) {
				if (discharge.getDischargeType() != CensusConstants.EXPIRED) {
					new HospitalService().delete(resident.getSerial());

					Hospital hospital = new Hospital();
					hospital.setResidentId(resident.getSerial());
					hospital.setDischargedOn(refCensusStatus.getDateAndTime());
					hospital.setToId(refCensusStatus.getFromId());
					hospital.setCensusStatus(refCensusStatus);
					hospital.setTimestamp(new Date());
					new HospitalService().insertOrUpdate(hospital);
					if (resident.getMedicaidNum() != null) {
						if (!"".equalsIgnoreCase(resident.getMedicaidNum()
								.trim())
								&& discharge.getFromId() != CensusConstants.HOME) {
							// bedhold + 1
							new BedHoldService().delete(resident.getSerial());

							BedHold refBedHold = new BedHold();
							refBedHold.setResidentId(resident.getSerial());
							refBedHold.setDischargedOn(refCensusStatus
									.getDateAndTime());
							refBedHold.setToId(refCensusStatus.getFromId());
							refBedHold.setCensusStatus(refCensusStatus);
							refBedHold.setTimestamp(new Date());
							new BedHoldService().insertOrUpdate(refBedHold);
						}
					}
				}
			}

			// ========== MDS pending forms =====================
			doInsertOrUpdateMDSForms(discharge, refCensusStatus, serial);

		} else if (refCensusStatus.getTypeName().equalsIgnoreCase(
				CensusConstants.TYPE_SIGN_OUT)) {
			if (admission != null && signOut != null) {
				// signOut + 1
				new SignOutService().delete(resident.getSerial());

				SignOut refSignOut = new SignOut();
				refSignOut.setResidentId(resident.getSerial());
				refSignOut.setSignOutDate(signOut.getDateAndTime());
				refSignOut.setAnticipatedDate(signOut
						.getAnticipatedDateAndTime());
				refSignOut.setResponsibleContactId(refCensusStatus
						.getResidentContactId());
				refSignOut.setToId(refCensusStatus.getSignOutToId());
				refSignOut.setTimestamp(new Date());
				refSignOut.setCensusStatus(refCensusStatus);
				refSignOut.setEr(refCensusStatus.isEr());

				(new SignOutService()).insertOrUpdate(refSignOut);
			}
		} else if (refCensusStatus.getTypeName().equalsIgnoreCase(
				CensusConstants.TYPE_SIGN_IN)) {
			if (admission != null && signOut != null && signIn != null) {
				// signOut - 1
				(new SignOutService()).delete(resident.getSerial());
			}
		}
		Global.medrexServer.countThread.doUpdate();

		return serial;
	}

	public void deleteCensusStatus(int serial) throws MedrexException {
		CensusStatus refCensusStatus = getCensusStatus(serial);

		deleteAllCensusCounts(refCensusStatus);
		CensusStatusDAO.getInstance().deleteCensusStatus(serial);

		// delete all pending forms related to census Id
		(new PendingFormService()).deletePendingFormByCensusId(serial);

//		// delete all MDS pending forms related to census Id
//		(new PendingMDSService()).deletePendingMDSByCensusId(serial);

		// /// get last 4 admission/ discharge / si/ so

		// if (current = admission)public void deletePendingForm(int serial)
		// throws MedrexException {

		// delete last discharge and insert again
		ResidentMain resident = (new ResidentMainService()
				.getResident(refCensusStatus.getResidentId()));

		if (refCensusStatus.getTypeName().equalsIgnoreCase(
				CensusConstants.TYPE_DISCHARGE)) {
			// Room History
			if (serial != 0) {
				TempRoomHistory roomHistory = new RoomHistroySerivice()
						.getRoomHistoryAccToCensusDischarge(serial);
				roomHistory.setCensusDischargeId(0);
				roomHistory.setEndDate(null);
				new RoomHistroySerivice()
						.insertOrUpdateTempRoomHistory(roomHistory);
			}
			// if(!refCensusStatus.getCurrentStatus().equalsIgnoreCase("History")){
			CensusStatus admission = getCensusLastAdmission(resident
					.getSerial());
			// deleteOnlyCensusStatus(admission.getSerial());

			// admission.setSerial(0);
			// insert deleted censusstatus record
			if (admission != null)
				insertOrUpdateCensusStatus(admission);
			// }

		}

		// if (current = discharge)
		// delete last admission and insert again
		if (refCensusStatus.getTypeName().equalsIgnoreCase(
				CensusConstants.TYPE_ADMISSION)) {
			// Room History
			if (serial != 0) {
				new RoomHistroySerivice()
						.deleteRoomHistoryByCensusAdmissionId(serial);
			}
			// if(!refCensusStatus.getCurrentStatus().equalsIgnoreCase("History")){
			CensusStatus discharge = getCensusLastDischarge(resident
					.getSerial());
			// deleteOnlyCensusStatus(discharge.getSerial());

			// discharge.setSerial(0);
			// insert deleted censusstatus record
			if (discharge != null)
				insertOrUpdateCensusStatus(discharge);
			// }

		}

		if (refCensusStatus.getTypeName().equalsIgnoreCase(
				CensusConstants.TYPE_SIGN_IN)) {
			// if(!refCensusStatus.getCurrentStatus().equalsIgnoreCase("History")){
			CensusStatus currentSignOut = getCensusLastSignOut(resident
					.getSerial());
			// deleteOnlyCensusStatus(currentSignOut.getSerial());
			// currentSignOut.setSerial(0);
			// insert deleted censusstatus record
			insertOrUpdateCensusStatus(currentSignOut);
			// }

		}
		if (refCensusStatus.getTypeName().equalsIgnoreCase(
				CensusConstants.TYPE_SIGN_OUT)) {
			// if(!refCensusStatus.getCurrentStatus().equalsIgnoreCase("History")){
			CensusStatus currentSignIn = getCensusLastSignIn(resident
					.getSerial());
			// deleteOnlyCensusStatus(currentSignIn.getSerial());
			// currentSignIn.setSerial(0);
			// insert deleted censusstatus record
			if (currentSignIn != null)
				insertOrUpdateCensusStatus(currentSignIn);
			// }

		}

	}

	private void deleteAllCensusCounts(CensusStatus refCensusStatus)
			throws MedrexException {
		List<SignOut> list = (new SignOutService())
				.getAllWithCensusStatus(refCensusStatus);
		Iterator<SignOut> it = list.iterator();
		SignOutService signOut = new SignOutService();
		while (it.hasNext()) {
			SignOut so = it.next();
			signOut.deleteSerial(so.getSerial());
		}
		List<BedHold> listBed = (new BedHoldService())
				.getAllWithBedHold(refCensusStatus);
		Iterator<BedHold> it2 = listBed.iterator();
		BedHoldService bed = new BedHoldService();
		while (it2.hasNext()) {
			BedHold b = it2.next();
			bed.deleteSerial(b.getSerial());
		}

		List<InHouse> listInHouse = (new InHouseService())
				.getAllWithInHouse(refCensusStatus);
		Iterator<InHouse> it3 = listInHouse.iterator();
		InHouseService in = new InHouseService();
		while (it3.hasNext()) {
			InHouse i = it3.next();
			in.deleteSerial(i.getSerial());
		}

		List<Hospital> listHospital = (new HospitalService())
				.getAllWithHospital(refCensusStatus);
		Iterator<Hospital> it4 = listHospital.iterator();
		HospitalService inH = new HospitalService();
		while (it4.hasNext()) {
			Hospital i = it4.next();
			inH.deleteHospitalSerial(i.getSerial());
		}
	}

	public void deleteOnlyCensusStatus(int serial) throws MedrexException {
		CensusStatus refCensusStatus = getCensusStatus(serial);
		List<SignOut> list = (new SignOutService())
				.getAllWithCensusStatus(refCensusStatus);
		Iterator<SignOut> it = list.iterator();
		SignOutService signOut = new SignOutService();
		while (it.hasNext()) {
			SignOut so = it.next();
			signOut.deleteSerial(so.getSerial());
		}
		List<BedHold> listBed = (new BedHoldService())
				.getAllWithBedHold(refCensusStatus);
		Iterator<BedHold> it2 = listBed.iterator();
		BedHoldService bed = new BedHoldService();
		while (it2.hasNext()) {
			BedHold b = it2.next();
			bed.deleteSerial(b.getSerial());
		}

		List<InHouse> listInHouse = (new InHouseService())
				.getAllWithInHouse(refCensusStatus);
		Iterator<InHouse> it3 = listInHouse.iterator();
		InHouseService in = new InHouseService();
		while (it3.hasNext()) {
			InHouse i = it3.next();
			in.deleteSerial(i.getSerial());
		}

		List<Hospital> listHospital = (new HospitalService())
				.getAllWithHospital(refCensusStatus);
		Iterator<Hospital> it4 = listHospital.iterator();
		HospitalService inH = new HospitalService();
		while (it4.hasNext()) {
			Hospital i = it4.next();
			inH.deleteHospitalSerial(i.getSerial());
		}
		CensusStatusDAO.getInstance().deleteCensusStatus(serial);
		(new PendingFormService()).deletePendingFormByCensusId(serial);
//		(new PendingMDSService()).deletePendingMDSByCensusId(serial);

	}

	/*
	 * public void deleteCensusStatusBedHold(int serial) throws MedrexException
	 * { CensusStatus refCensusStatus = getCensusStatus(serial);
	 * CensusStatusDAO.getInstance().deleteCensusStatus(serial); }
	 * 
	 * public void deleteCensusStatusInHouse(int serial) throws MedrexException
	 * { CensusStatus refCensusStatus = getCensusStatus(serial);
	 * 
	 * CensusStatusDAO.getInstance().deleteCensusStatus(serial); }
	 * 
	 * public void deleteCensusStatusHospital(int serial) throws MedrexException
	 * { CensusStatus refCensusStatus = getCensusStatus(serial);
	 * 
	 * CensusStatusDAO.getInstance().deleteCensusStatus(serial); }
	 */

	public CensusStatus getCensusStatus(int serial, int residentSerial)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusStatus(serial,
				residentSerial);
	}

	public List getCensusStatuss(int residentSerial) throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusStatuss(residentSerial);
	}

	public List getCensusStatuss(String order, int residentSerial)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusStatuss(order,
				residentSerial);
	}

	public CensusStatus getCensusStatus(int residentSerial, String typename)
			throws MedrexException {
		return getCensusStatus(residentSerial, typename, new Date());
	}

	public CensusStatus getCensusStatus(int residentSerial, String typename,
			Date forDate) throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusStatus(residentSerial,
				typename, forDate);
	}

	public List getCensusStatuss(int residentSerial, String typename)
			throws MedrexException {
		return getCensusStatuss(residentSerial, typename, new Date());
	}

	public List getCensusStatuss(int residentSerial, String typename,
			Date tillDate) throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusStatuss(residentSerial,
				typename, tillDate);
	}

	public List getCensusStatuss(int residentSerial, String typename, int year)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusStatuss(residentSerial,
				typename, year);
	}

	public CensusStatus getCensusStatus() throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusStatus();
	}

	public CensusStatus getCensusStatus(int serial) throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusStatus(serial);
	}

	public CensusStatus getCensusLastAdmission(int residentSerial)
			throws MedrexException {
		return getCensusLastAdmission(residentSerial, new Date());
	}

	// for ORIGINAL Admisstion or first time admission
	public CensusStatus getCensusOriginalAdmission(int residentSerial)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusOriginalAdmission(
				residentSerial);
	}

	public CensusStatus getCensusLastAdmission(int residentSerial, Date forDate)
			throws MedrexException {
		return getCensusStatus(residentSerial, "Admission", forDate);
	}

	public CensusStatus getCensusLastDischarge(int residentSerial)
			throws MedrexException {
		return getCensusLastDischarge(residentSerial, new Date());
	}

	public CensusStatus getCensusLastDischarge(int residentSerial, Date forDate)
			throws MedrexException {
		return getCensusStatus(residentSerial, "Discharge", forDate);
	}

	public CensusStatus getCensusLastSignIn(int residentSerial)
			throws MedrexException {
		return getCensusLastSignIn(residentSerial, new Date());
	}

	public CensusStatus getCensusLastSignIn(int residentSerial, Date forDate)
			throws MedrexException {
		return getCensusStatus(residentSerial, "Sign In", forDate);
	}

	public CensusStatus getCensusLastSignOut(int residentSerial)
			throws MedrexException {
		return getCensusLastSignOut(residentSerial, new Date());
	}

	public CensusStatus getCensusLastSignOut(int residentSerial, Date forDate)
			throws MedrexException {
		return getCensusStatus(residentSerial, "Sign Out", forDate);
	}

	public List getCensusStatuss(String typename) throws MedrexException {
		return getCensusStatuss(typename, new Date());
	}

	public List getCensusStatuss(String typename, Date tillDate)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusStatuss(typename,
				tillDate);
	}

	public List getCensusStatussAdmission() throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_ADMISSION, new Date());
	}

	public List getCensusStatussAdmission(Date tillDate) throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_ADMISSION, tillDate);
	}

	public List getCensusStatussDischarge() throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_DISCHARGE, new Date());
	}

	public List getCensusStatussDischarge(Date tillDate) throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_DISCHARGE, tillDate);
	}

	public List getCensusStatussSignOut() throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_SIGN_OUT, new Date());
	}

	public List getCensusStatussSignOut(Date tillDate) throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_SIGN_OUT, tillDate);
	}

	public List getCensusStatussSignIn() throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_SIGN_IN, new Date());
	}

	public List getCensusStatussSignIn(Date tillDate) throws MedrexException {
		return getCensusStatuss(CensusConstants.TYPE_SIGN_IN, tillDate);
	}

	public List<CensusStatus> getAllCensus(Date dFrom, Date dTo)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getAllCensus(dFrom, dTo);
	}

	public List getAllCensusStatusByYear() throws MedrexException {
		return CensusStatusDAO.getInstance().getAllCensusStatusByYear();
	}

	public List<CensusStatus> getCensusDischargeReportData(Date from, Date to)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusDischargeReportData(from,
				to);
	}

	public List<CensusStatus> getCensusAdmissionReportData(Date from, Date to)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusAdmissionReportData(from,
				to);
	}

	public List<CensusStatus> getCensusDayReportAdmissionList(Date date)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusDayReportAdmissionList(
				date);
	}

	public List<CensusStatus> getCensusDayReportDischargeList(Date date)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusDayReportDischargeList(
				date);
	}

	public List<CensusStatus> getCensusDayReportOutOnPassList(Date date)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusDayReportOutOnPassList(
				date);
	}

	public List<CensusStatus> getCensusDayReportHospitalList(Date date)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusDayReportHospitalList(
				date);
	}

	public CensusStatusForResident getCensusStatusForResident(
			int currentResidenceKey) throws MedrexException {
		return getCensusStatusForResident(currentResidenceKey, new Date());
	}

	public CensusStatusForResident getCensusStatusForResident(
			int currentResidenceKey, Date forDate) throws MedrexException {
		CensusStatusForResident refStatus = new CensusStatusForResident();

		// false if discharged, true if admitted
		boolean admittedOrDischarged = false;
		boolean dischargeToHospital = false;
		// false if signed out, true if signed in
		boolean signedInOrOut = false;

		String admissionStatus, signInStatus, outOnPassStatus;
		admissionStatus = signInStatus = outOnPassStatus = "No Status";

		Severity admissionColor, signInColor, outOnPassColor;
		admissionColor = signInColor = outOnPassColor = Severity.NONE;

		int outOnPassDay = 0;

		CensusStatus admission = null, discharge = null, signIn = null, signOut = null;

		try {
			admission = getCensusLastAdmission(currentResidenceKey, forDate);
			discharge = getCensusLastDischarge(currentResidenceKey, forDate);
			signIn = getCensusLastSignIn(currentResidenceKey, forDate);
			signOut = getCensusLastSignOut(currentResidenceKey, forDate);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		/*
		 * if : no entry is made then : no admission status
		 */
		if (admission == null && discharge == null) {
			admittedOrDischarged = false;
			signedInOrOut = false;
			admissionStatus = "No Status";
			admissionColor = Severity.NONE;
		}

		/*
		 * if : admitted, but never discharged then : admission status is
		 * 'Admitted'
		 */
		if (admission != null && discharge == null) {
			admittedOrDischarged = true;
			signedInOrOut = true;
			admissionStatus = "Admitted";
			admissionColor = Severity.EVERGREEN;
		}

		/*
		 * if : admitted and discharge once or more
		 */
		if (admission != null && discharge != null) {

			/*
			 * if : discharge is newer than admission
			 */
			if (admission.getDateAndTime().before(discharge.getDateAndTime())) {
				admittedOrDischarged = false;
				signedInOrOut = true;
				admissionStatus = "Discharge";
				admissionColor = Severity.REDHIGHLIGHT;
				if (discharge.getFromId() == CensusConstants.HOSPITAL
						&& (discharge.getDischargeType() == CensusConstants.DISCHARGE
								|| discharge.getDischargeType() == CensusConstants.E_R || discharge
								.getDischargeType() == CensusConstants.OUT_OF_PASS)) {
					dischargeToHospital = true;
				}
			}

			/*
			 * if : admission is newer than discharge
			 */
			else {
				admittedOrDischarged = true;
				signedInOrOut = false;
				admissionStatus = "Admitted";
				admissionColor = Severity.EVERGREEN;
			}
		}

		//
		// signInStatus calculation
		//

		/*
		 * if : no sign out, no sign in, no admission, no discharge
		 */
		if (signOut == null) {
			signedInOrOut = true;
			signInStatus = "No Status";
			signInColor = Severity.NONE;
		}

		/*
		 * if : no sign out, no sign in, and once admitted
		 */
		if (signOut == null && admission != null && discharge == null) {
			signedInOrOut = true;
			signInStatus = "In";
			signInColor = Severity.EVERGREEN;
		}

		/*
		 * if : sign out, but never signed in
		 */
		if (signIn == null && signOut != null) {
			signedInOrOut = false;
			SimpleDateFormat df = new SimpleDateFormat(
					"MMM dd, yyyy  'at'  hh':'mm a");
			String status = null;
			if (signOut.isEr() == true) {
				status = "ER - Out since: ";
			} else {
				status = "Out since: ";
			}
			signInStatus = status + df.format(signOut.getDateAndTime());
			signInColor = Severity.REDHIGHLIGHT;
		}

		/*
		 * if : signed out and signed in once or more
		 */
		if (signIn != null && signOut != null) {

			/*
			 * if : sign in is newer than sign out
			 */
			if (signOut.getDateAndTime().before(signIn.getDateAndTime())) {
				signedInOrOut = true;
				signInStatus = "In";
				signInColor = Severity.EVERGREEN;
			}

			/*
			 * if : sign out is newer than sign in
			 */
			else {
				signedInOrOut = false;
				SimpleDateFormat df = new SimpleDateFormat(
						"MMM dd, yyyy  'at'  hh':'mm a");
				String status = null;
				if (signOut.isEr() == true) {
					status = "ER - Out since: ";
				} else {
					status = "Out since: ";
				}
				signInStatus = status + df.format(signOut.getDateAndTime());
				signInColor = Severity.REDHIGHLIGHT;
			}
		}

		//
		// out on pass calculation
		//

		/*
		 * if : no admission then : no outOnPass status
		 */
		if (admission == null) {
			outOnPassStatus = "No Status";
			outOnPassColor = Severity.NONE;
		}

		/*
		 * if : admitted but never discharged then : outOnPass not applicable
		 */
		if (admission != null && discharge == null) {
			outOnPassStatus = "- N/A -";
			outOnPassColor = Severity.EVERGREEN;
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
					List<CensusStatus> d = getCensusStatuss(
							currentResidenceKey, "Discharge", forDate);
					List<CensusStatus> a = getCensusStatuss(
							currentResidenceKey, "Admission", forDate);
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
					List<CensusStatus> d = getCensusStatuss(
							currentResidenceKey, "Discharge", forDate);
					List<CensusStatus> a = getCensusStatuss(
							currentResidenceKey, "Admission", forDate);
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

			if (outOnPassDay > 0) {
				outOnPassStatus = outOnPassDay + " days";
				outOnPassColor = Severity.EVERGREEN;
				if (outOnPassDay > 21) {
					outOnPassColor = Severity.REDHIGHLIGHT;
				}
			} else {
				outOnPassStatus = "None";
				outOnPassColor = Severity.EVERGREEN;
			}
		}

		refStatus.setAdmissionSeverity(admissionColor);
		refStatus.setAdmissionStatus(admittedOrDischarged);
		refStatus.setAdmissionStatusDesc(admissionStatus);
		refStatus.setDischargeToHospital(dischargeToHospital);
		refStatus.setOutOnPassDays(outOnPassDay);
		refStatus.setOutOnPassSeverity(outOnPassColor);
		refStatus.setOutOnPassStatusDesc(outOnPassStatus);
		refStatus.setSignInSeverity(signInColor);
		refStatus.setSignInStatus(signedInOrOut);
		refStatus.setSignInStatusDesc(signInStatus);

		return refStatus;
	}

	public List<CensusStatus> getCensusSignInOutReportData(Date from, Date to)
			throws MedrexException {
		return CensusStatusDAO.getInstance().getCensusSignInOutReportData(from,
				to);
	}

	public List<CensusStatus> getAllCensusStatus() throws MedrexException {
		return CensusStatusDAO.getInstance().getAllCensusStatus();
	}

	public CensusStatus getNextDischarge(int resid, Date dateAndTime,
			String typeName) throws MedrexException {
		return CensusStatusDAO.getInstance().getNextDischarge(resid,
				dateAndTime, typeName);
	}

	private void doInsertOrUpdateMDSForms(CensusStatus discharge,
			CensusStatus refCensusStatus, int serial) {
		if ((discharge.getDischargeType() == CensusConstants.EXPIRED)
				|| ((discharge.getFromId() == CensusConstants.HOME) || (discharge
						.getFromId() == CensusConstants.OTHER_FACILITY))
				|| (discharge.getFromId() == CensusConstants.HOSPITAL)) {
//			PendingMDSService pendingMDSService = new PendingMDSService();
			if ((discharge.getDischargeType() == CensusConstants.EXPIRED)
					|| ((discharge.getFromId() == CensusConstants.HOME) || (discharge
							.getFromId() == CensusConstants.OTHER_FACILITY))) {
//				PendingMDS pendingMDS = new PendingMDS();
//				pendingMDS.setResidentId(refCensusStatus.getResidentId());
//				pendingMDS.setCensusId(serial);
//				pendingMDS.setFormId(0);
//				pendingMDS.setMdsType(CensusConstants.TYPE_DISCHARGE);
//				pendingMDS.setType("01. Admission Assesment");
//				pendingMDS.setA(0);
//				pendingMDS.setDueDate(new Date());
//				pendingMDS.setB(6);
//				try {
//					pendingMDSService.insrtOrUpdatePendingMDS(pendingMDS);
//				} catch (MedrexException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
			if (discharge.getFromId() == CensusConstants.HOSPITAL) {
//				PendingMDS pendingMDS = new PendingMDS();
//				pendingMDS.setResidentId(refCensusStatus.getResidentId());
//				pendingMDS.setCensusId(serial);
//				pendingMDS.setFormId(0);
//				pendingMDS.setMdsType(CensusConstants.TYPE_DISCHARGE);
//				pendingMDS.setType("01. Admission Assesment");
//				pendingMDS.setA(0);
//				Date curDate = new Date();
//				curDate.setDate(curDate.getDate() + 14);
//				pendingMDS.setDueDate(curDate);
//				pendingMDS.setB(7);
//				try {
//					pendingMDSService.insrtOrUpdatePendingMDS(pendingMDS);
//				} catch (MedrexException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
	}

	// insert or Update pending forms
	private void doInsertOrUpdatePendingForms(CensusStatus refCensusStatus,
			int serial) {
		// get all rules for this type of census(admission/ discharge)
		List<FormSchedule> forms = null;
		try {
			forms = (new FormScheduleService())
					.getFormSchedlulesByType(refCensusStatus.getTypeName());

			// make empty list of pending forms to be inserted in pending form
			// table
			List<PendingForm> pendingForms = new ArrayList<PendingForm>();

			Iterator<FormSchedule> itr = forms.iterator();

			// for each relevant rule make a corresponding pening form entry
			// (resident , form , time - specific entry )
			while (itr.hasNext()) {
				FormSchedule formSchedule = itr.next();
				PendingForm pendingForm = new PendingForm();
				pendingForm.setSerial(0);
				pendingForm.setCensusId(serial);
				pendingForm.setForm(formSchedule.getForm());
				pendingForm.setType(formSchedule.getType());
				pendingForm.setFormId(0);

				int alertAfterTime = 0;
				int num = formSchedule.getAlertAfter();
				if ((formSchedule.getAlertAfterType())
						.equalsIgnoreCase("Hours")) {
					alertAfterTime = num;
				}
				if ((formSchedule.getAlertAfterType()).equalsIgnoreCase("Days")) {
					alertAfterTime = num * 24;
				}
				if ((formSchedule.getAlertAfterType())
						.equalsIgnoreCase("Weeks")) {
					alertAfterTime = num * 24 * 7;
				}
				pendingForm.setAlertDate(new Date(refCensusStatus
						.getDateAndTime().getTime()
						+ alertAfterTime * 60 * 60 * 1000));

				int timeForm = 0;
				int num1 = formSchedule.getTimeFrom();
				if ((formSchedule.getTimeFromType()).equalsIgnoreCase("Hours")) {
					timeForm = num1;
				}
				if ((formSchedule.getTimeFromType()).equalsIgnoreCase("Days")) {
					timeForm = num1 * 24;
				}
				if ((formSchedule.getTimeFromType()).equalsIgnoreCase("Weeks")) {
					timeForm = num1 * 24 * 7;
				}
				pendingForm.setFormDueDate(new Date(refCensusStatus
						.getDateAndTime().getTime()
						+ timeForm * 60 * 60 * 1000));

				pendingForm.setResidentId(refCensusStatus.getResidentId());
				pendingForms.add(pendingForm);

			}
			// insert all new pending forms in database
			(new PendingFormService()).insertOrUpdatePendingForms(pendingForms);
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
