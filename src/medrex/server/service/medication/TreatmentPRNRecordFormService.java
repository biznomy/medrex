package medrex.server.service.medication;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.TreatmentPRNRecordForm;
import medrex.commons.vo.medication.TreatmentPRNRecordFormCol;
import medrex.commons.vo.medication.TreatmentPRNRecordFormRow;
import medrex.server.dao.medicationTreatment.TreatmentPRNRecordFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class TreatmentPRNRecordFormService {

	public int insertOrUpdateTreatmentPRNRecordForm(
			TreatmentPRNRecordForm mprnrf) throws MedrexException {
		int serial = TreatmentPRNRecordFormDAO.getInstance()
				.insertOrUpdateTreatmentPRNRecordForm(mprnrf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(mprnrf
				.getResidentId(), FormSchedulerConstants.TREATMENT_PRN_RECORD,
				serial);
		return serial;
	}

	public List getTreatmentPRNRecordForms(int residentSerial)
			throws MedrexException {
		return (TreatmentPRNRecordFormDAO.getInstance()
				.getTreatmentPRNRecordForms(residentSerial));
	}

	public TreatmentPRNRecordForm getTreatmentPRNRecordForm(int serial)
			throws MedrexException {
		return (TreatmentPRNRecordFormDAO.getInstance()
				.getTreatmentPRNRecordForm(serial));
	}

	public void deleteTreatmentPRNRecordForm(int serial) throws MedrexException {
		TreatmentPRNRecordFormDAO.getInstance().deleteTreatmentPRNRecordForm(
				serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.TREATMENT_PRN_RECORD, serial);
	}

	public int insertOrUpdateTreatmentPRNRecordFormRow(
			TreatmentPRNRecordFormRow mprnrfr) throws MedrexException {
		return TreatmentPRNRecordFormDAO.getInstance()
				.insertOrUpdateTreatmentPRNRecordFormRow(mprnrfr);
	}

	public TreatmentPRNRecordFormRow getTreatmentPRNRecordFormRow(int formId,
			int row) throws MedrexException {
		return (TreatmentPRNRecordFormDAO.getInstance()
				.getTreatmentPRNRecordFormRow(formId, row));
	}

	public int insertOrUpdateTreatmentPRNRecordFormCol(
			TreatmentPRNRecordFormCol mprnrfc) throws MedrexException {
		return TreatmentPRNRecordFormDAO.getInstance()
				.insertOrUpdateTreatmentPRNRecordFormCol(mprnrfc);
	}

	public TreatmentPRNRecordFormCol getTreatmentPRNRecordFormCol(int formId,
			int row, int col) throws MedrexException {
		return (TreatmentPRNRecordFormDAO.getInstance()
				.getTreatmentPRNRecordFormCol(formId, row, col));
	}

	public void deleteTreatmentPRNRecordFormCol(int formId)
			throws MedrexException {
		TreatmentPRNRecordFormDAO.getInstance()
				.deleteTreatmentPRNRecordFormCol(formId);
	}

	public void deleteTreatmentPRNRecordFormRow(int formId)
			throws MedrexException {
		TreatmentPRNRecordFormDAO.getInstance()
				.deleteTreatmentPRNRecordFormRow(formId);
	}

}
