package medrex.server.service.medication;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.MedicationPRNRecordForm;
import medrex.commons.vo.medication.MedicationPRNRecordFormCol;
import medrex.commons.vo.medication.MedicationPRNRecordFormRow;
import medrex.server.dao.medicationTreatment.MedicationPRNRecordFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class MedicationPRNRecordFormService {

	public int insertOrUpdateMedicationPRNRecordForm(
			MedicationPRNRecordForm mprnrf) throws MedrexException {
		int serial = MedicationPRNRecordFormDAO.getInstance()
				.insertOrUpdateMedicationPRNRecordForm(mprnrf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(mprnrf
				.getResidentId(), FormSchedulerConstants.MEDICATION_PRN_RECORD,
				serial);
		return serial;
	}

	public List getMedicationPRNRecordForms(int residentSerial)
			throws MedrexException {
		return (MedicationPRNRecordFormDAO.getInstance()
				.getMedicationPRNRecordForms(residentSerial));
	}

	public MedicationPRNRecordForm getMedicationPRNRecordForm(int serial)
			throws MedrexException {
		return (MedicationPRNRecordFormDAO.getInstance()
				.getMedicationPRNRecordForm(serial));
	}

	public void deleteMedicationPRNRecordForm(int serial)
			throws MedrexException {
		MedicationPRNRecordFormDAO.getInstance().deleteMedicationPRNRecordForm(
				serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.MEDICATION_PRN_RECORD, serial);
	}

	public int insertOrUpdateMedicationPRNRecordFormRow(
			MedicationPRNRecordFormRow mprnrfr) throws MedrexException {
		return MedicationPRNRecordFormDAO.getInstance()
				.insertOrUpdateMedicationPRNRecordFormRow(mprnrfr);
	}

	public MedicationPRNRecordFormRow getMedicationPRNRecordFormRow(int formId,
			int row) throws MedrexException {
		return (MedicationPRNRecordFormDAO.getInstance()
				.getMedicationPRNRecordFormRow(formId, row));
	}

	public int insertOrUpdateMedicationPRNRecordFormCol(
			MedicationPRNRecordFormCol mprnrfc) throws MedrexException {
		return MedicationPRNRecordFormDAO.getInstance()
				.insertOrUpdateMedicationPRNRecordFormCol(mprnrfc);
	}

	public MedicationPRNRecordFormCol getMedicationPRNRecordFormCol(int formId,
			int row, int col) throws MedrexException {
		return (MedicationPRNRecordFormDAO.getInstance()
				.getMedicationPRNRecordFormCol(formId, row, col));
	}

	public void deleteMedicationPRNRecordFormCol(int formId)
			throws MedrexException {
		MedicationPRNRecordFormDAO.getInstance()
				.deleteMedicationPRNRecordFormCol(formId);
	}

	public void deleteMedicationPRNRecordFormRow(int formId)
			throws MedrexException {
		MedicationPRNRecordFormDAO.getInstance()
				.deleteMedicationPRNRecordFormRow(formId);
	}

}
