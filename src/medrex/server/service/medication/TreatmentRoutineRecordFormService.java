package medrex.server.service.medication;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.TreatmentRoutineRecordForm;
import medrex.commons.vo.medication.TreatmentRoutineRecordFormCol;
import medrex.commons.vo.medication.TreatmentRoutineRecordFormRow;
import medrex.server.dao.medicationTreatment.TreatmentRoutineRecordFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class TreatmentRoutineRecordFormService {

	public int insertOrUpdateTreatmentRoutineRecordForm(
			TreatmentRoutineRecordForm mprnrf) throws MedrexException {
		int serial = TreatmentRoutineRecordFormDAO.getInstance()
				.insertOrUpdateTreatmentRoutineRecordForm(mprnrf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(mprnrf
				.getResidentId(),
				FormSchedulerConstants.TREATMENT_ROUTINE_RECORD, serial);
		return serial;
	}

	public List getTreatmentRoutineRecordForms(int residentSerial)
			throws MedrexException {
		return (TreatmentRoutineRecordFormDAO.getInstance()
				.getTreatmentRoutineRecordForms(residentSerial));
	}

	public TreatmentRoutineRecordForm getTreatmentRoutineRecordForm(int serial)
			throws MedrexException {
		return (TreatmentRoutineRecordFormDAO.getInstance()
				.getTreatmentRoutineRecordForm(serial));
	}

	public void deleteTreatmentRoutineRecordForm(int serial)
			throws MedrexException {
		TreatmentRoutineRecordFormDAO.getInstance()
				.deleteTreatmentRoutineRecordForm(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.TREATMENT_ROUTINE_RECORD, serial);
	}

	public int insertOrUpdateTreatmentRoutineRecordFormRow(
			TreatmentRoutineRecordFormRow mprnrfr) throws MedrexException {
		return TreatmentRoutineRecordFormDAO.getInstance()
				.insertOrUpdateTreatmentRoutineRecordFormRow(mprnrfr);
	}

	public TreatmentRoutineRecordFormRow getTreatmentRoutineRecordFormRow(
			int formId, int row) throws MedrexException {
		return (TreatmentRoutineRecordFormDAO.getInstance()
				.getTreatmentRoutineRecordFormRow(formId, row));
	}

	public int insertOrUpdateTreatmentRoutineRecordFormCol(
			TreatmentRoutineRecordFormCol mprnrfc) throws MedrexException {
		return TreatmentRoutineRecordFormDAO.getInstance()
				.insertOrUpdateTreatmentRoutineRecordFormCol(mprnrfc);
	}

	public TreatmentRoutineRecordFormCol getTreatmentRoutineRecordFormCol(
			int formId, int row, int col) throws MedrexException {
		return (TreatmentRoutineRecordFormDAO.getInstance()
				.getTreatmentRoutineRecordFormCol(formId, row, col));
	}

	public void deleteTreatmentRoutineRecordFormCol(int formId)
			throws MedrexException {
		TreatmentRoutineRecordFormDAO.getInstance()
				.deleteTreatmentRoutineRecordFormCol(formId);
	}

	public void deleteTreatmentRoutineRecordFormRow(int formId)
			throws MedrexException {
		TreatmentRoutineRecordFormDAO.getInstance()
				.deleteTreatmentRoutineRecordFormRow(formId);
	}

}
