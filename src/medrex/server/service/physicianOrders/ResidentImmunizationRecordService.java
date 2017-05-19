package medrex.server.service.physicianOrders;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.ResidentImmunizationRecord;
import medrex.server.dao.historyPhysical.ResidentImmunizationRecordDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class ResidentImmunizationRecordService {

	public int insertOrUpdateResidentImmunizationRecord(
			ResidentImmunizationRecord refResidentImmunizationRecord)
			throws MedrexException {
		int serial = ResidentImmunizationRecordDAO.getInstance()
				.insertOrUpdateResidentImmunizationRecord(
						refResidentImmunizationRecord);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(
				refResidentImmunizationRecord.getResidentId(),
				FormSchedulerConstants.RESIDENT_IMMUNIZATION_FORM, serial);
		return serial;
	}

	public List getResidentImmunizationRecords(int residentSerial)
			throws MedrexException {
		return (ResidentImmunizationRecordDAO.getInstance()
				.getResidentImmunizationRecords(residentSerial));
	}

	public ResidentImmunizationRecord getResidentImmunizationRecord(int serial)
			throws MedrexException {
		return (ResidentImmunizationRecordDAO.getInstance()
				.getResidentImmunizationRecord(serial));
	}

	public void deleteResidentImmunizationRecord(int serial)
			throws MedrexException {
		try {
			ResidentImmunizationRecordDAO.getInstance()
					.deleteResidentImmunizationRecord(serial);
			// deleting pending forms for this resident this form
			(new PendingFormService()).resetPendingFormsStatus(
					FormSchedulerConstants.RESIDENT_IMMUNIZATION_FORM, serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
