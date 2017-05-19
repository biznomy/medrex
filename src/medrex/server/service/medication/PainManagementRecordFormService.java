package medrex.server.service.medication;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.PainManagementRecordFormPage1;
import medrex.commons.vo.medication.PainManagementRecordRow;
import medrex.server.dao.medicationTreatment.PainManagementRecordFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class PainManagementRecordFormService {

	public int insertOrUpdatePainManagementRecordFormPage1(
			PainManagementRecordFormPage1 pmrP1) throws MedrexException {
		int serial = PainManagementRecordFormDAO.getInstance()
				.insertOrUpdatePainManagementRecordFormPage1(pmrP1);

		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(pmrP1
				.getResidentId(),
				FormSchedulerConstants.PAIN_MANAGEMENT_RECORD, serial);

		return serial;
	}

	public List getPainManagementRecordFormPage1s(int residentSerial)
			throws MedrexException {
		return (PainManagementRecordFormDAO.getInstance()
				.getPainManagementRecordFormPage1s(residentSerial));
	}

	public PainManagementRecordFormPage1 getPainManagementRecordFormPage1(
			int serial) throws MedrexException {
		return (PainManagementRecordFormDAO.getInstance()
				.getPainManagementRecordFormPage1(serial));
	}

	public void deletePainManagementRecordFormPage1(int serial)
			throws MedrexException {
		PainManagementRecordFormDAO.getInstance()
				.deletePainManagementRecordFormPage1(serial);

		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.PAIN_MANAGEMENT_RECORD, serial);
	}

	public int insertOrUpdatePainManagementRecordRow(PainManagementRecordRow psa)
			throws MedrexException {
		return PainManagementRecordFormDAO.getInstance()
				.insertOrUpdatePainManagementRecordRow(psa);
	}

	public PainManagementRecordRow getPainManagementRecordRow(int formId,
			int formNum) throws MedrexException {
		return (PainManagementRecordFormDAO.getInstance()
				.getPainManagementRecordRow(formId, formNum));
	}

	public void deletePainManagementRecordFormPage1Row(int formId)
			throws MedrexException {
		PainManagementRecordFormDAO.getInstance()
				.deletePainManagementRecordFormPage1Row(formId);
	}

}
