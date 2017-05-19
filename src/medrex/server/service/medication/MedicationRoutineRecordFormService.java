package medrex.server.service.medication;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.MedicationRoutineRecordForm;
import medrex.commons.vo.medication.MedicationRoutineRecordFormCol;
import medrex.commons.vo.medication.MedicationRoutineRecordFormRow;
import medrex.server.dao.medicationTreatment.MedicationRoutineRecordFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class MedicationRoutineRecordFormService {

	public int insertOrUpdateMedicationRoutineRecordForm(
			MedicationRoutineRecordForm mprnrf) throws MedrexException {
		int serial = MedicationRoutineRecordFormDAO.getInstance()
				.insertOrUpdateMedicationRoutineRecordForm(mprnrf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(mprnrf
				.getResidentId(),
				FormSchedulerConstants.MEDICATION_ROUTINE_RECORD, serial);
		return serial;
	}

	public List getMedicationRoutineRecordForms(int residentSerial)
			throws MedrexException {
		return (MedicationRoutineRecordFormDAO.getInstance()
				.getMedicationRoutineRecordForms(residentSerial));
	}

	public MedicationRoutineRecordForm getMedicationRoutineRecordForm(int serial)
			throws MedrexException {
		return (MedicationRoutineRecordFormDAO.getInstance()
				.getMedicationRoutineRecordForm(serial));
	}

	public void deleteMedicationRoutineRecordForm(int serial)
			throws MedrexException {
		MedicationRoutineRecordFormDAO.getInstance()
				.deleteMedicationRoutineRecordForm(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.MEDICATION_ROUTINE_RECORD, serial);
	}

	public int insertOrUpdateMedicationRoutineRecordFormRow(
			MedicationRoutineRecordFormRow mprnrfr) throws MedrexException {
		return MedicationRoutineRecordFormDAO.getInstance()
				.insertOrUpdateMedicationRoutineRecordFormRow(mprnrfr);
	}

	public MedicationRoutineRecordFormRow getMedicationRoutineRecordFormRow(
			int formId, int row) throws MedrexException {
		return (MedicationRoutineRecordFormDAO.getInstance()
				.getMedicationRoutineRecordFormRow(formId, row));
	}

	public int insertOrUpdateMedicationRoutineRecordFormCol(
			MedicationRoutineRecordFormCol mprnrfc) throws MedrexException {
		return MedicationRoutineRecordFormDAO.getInstance()
				.insertOrUpdateMedicationRoutineRecordFormCol(mprnrfc);
	}

	public MedicationRoutineRecordFormCol getMedicationRoutineRecordFormCol(
			int formId, int row, int col) throws MedrexException {
		return (MedicationRoutineRecordFormDAO.getInstance()
				.getMedicationRoutineRecordFormCol(formId, row, col));
	}

	public void deleteMedicationRoutineRecordFormCol(int formId)
			throws MedrexException {
		MedicationRoutineRecordFormDAO.getInstance()
				.deleteMedicationRoutineRecordFormCol(formId);
	}

	public void deleteMedicationRoutineRecordFormRow(int formId)
			throws MedrexException {
		MedicationRoutineRecordFormDAO.getInstance()
				.deleteMedicationRoutineRecordFormRow(formId);
	}

}
