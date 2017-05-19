package medrex.server.service.medication;

import java.util.Date;
import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.NurseMedicationNotesForm;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow1;
import medrex.server.dao.medicationTreatment.NurseMedicationNotesFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class NurseMedicationNotesFormService {

	public int insertOrUpdateNurseMedicationNotesForm(
			NurseMedicationNotesForm ntnf) throws MedrexException {
		int serial = NurseMedicationNotesFormDAO.getInstance()
				.insertOrUpdateNurseMedicationNotesForm(ntnf);

		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(ntnf
				.getResidentId(),
				FormSchedulerConstants.NURSE_MEDICATION_NOTES, serial);
		return serial;
	}

	public List getNurseMedicationNotesForms(int residentSerial)
			throws MedrexException {
		return (NurseMedicationNotesFormDAO.getInstance()
				.getNurseMedicationNotesForms(residentSerial));
	}

	public List getNurseMedicationNotesForms() throws MedrexException {
		return (NurseMedicationNotesFormDAO.getInstance()
				.getNurseMedicationNotesForms());
	}

	public NurseMedicationNotesForm getNurseMedicationNotesForm(int serial)
			throws MedrexException {
		return (NurseMedicationNotesFormDAO.getInstance()
				.getNurseMedicationNotesForm(serial));
	}

	public void deleteNurseMedicationNotesForm(int serial)
			throws MedrexException {
		NurseMedicationNotesFormDAO.getInstance()
				.deleteNurseMedicationNotesForm(serial);

		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.NURSE_MEDICATION_NOTES, serial);
	}

	public int insertOrUpdateNurseMedicationNotesFormRow(
			NurseMedicationNotesFormRow ntnfr) throws MedrexException {
		return NurseMedicationNotesFormDAO.getInstance()
				.insertOrUpdateNurseMedicationNotesFormRow(ntnfr);
	}

	public NurseMedicationNotesFormRow getNurseMedicationNotesFormRow(
			int formId, int formNum) throws MedrexException {
		return (NurseMedicationNotesFormDAO.getInstance()
				.getNurseMedicationNotesFormRow(formId, formNum));
	}

	public NurseMedicationNotesFormRow getNurseMedicationNotesFormRow(
			int formId, int formNum, Date currentDate) throws MedrexException {
		return (NurseMedicationNotesFormDAO.getInstance()
				.getNurseMedicationNotesFormRow(formId, formNum, currentDate));
	}

	public List getNurseMedicationNotesFormRow(int formId, Date currentDate)
			throws MedrexException {
		return (NurseMedicationNotesFormDAO.getInstance()
				.getNurseMedicationNotesFormRows(formId, currentDate));
	}

	public int insertOrUpdateNurseMedicationNotesFormRow1(
			NurseMedicationNotesFormRow1 ntnfr) throws MedrexException {
		return NurseMedicationNotesFormDAO.getInstance()
				.insertOrUpdateNurseMedicationNotesFormRow1(ntnfr);
	}

	public NurseMedicationNotesFormRow1 getNurseMedicationNotesFormRow1(
			int formId, int formNum) throws MedrexException {
		return (NurseMedicationNotesFormDAO.getInstance()
				.getNurseMedicationNotesFormRow1(formId, formNum));
	}

	public int insertOrUpdateNurseMedicationNotesFormRows(
			List<NurseMedicationNotesFormRow> rows) throws MedrexException {
		return NurseMedicationNotesFormDAO.getInstance()
				.insertOrUpdateNurseMedicationNotesFormRows(rows);
	}

	public List getNurseMedicationNotesFormRows(int formId)
			throws MedrexException {
		return (NurseMedicationNotesFormDAO.getInstance()
				.getNurseMedicationNotesFormRows(formId));
	}

	public List getNurseMedicationNotesFormRow1s(int formId)
			throws MedrexException {
		return (NurseMedicationNotesFormDAO.getInstance()
				.getNurseMedicationNotesFormRow1s(formId));
	}

	public int insertOrUpdateNurseMedicationNotesFormRow1s(
			List<NurseMedicationNotesFormRow1> rows) throws MedrexException {
		return NurseMedicationNotesFormDAO.getInstance()
				.insertOrUpdateNurseMedicationNotesFormRow1s(rows);
	}

	public void deleteNurseMedicationNotesFormRow(int formId)
			throws MedrexException {
		NurseMedicationNotesFormDAO.getInstance()
				.deleteNurseMedicationNotesFormRow(formId);
	}

	public void deleteNurseMedicationNotesFormRow1(int formId)
			throws MedrexException {
		NurseMedicationNotesFormDAO.getInstance()
				.deleteNurseMedicationNotesFormRow1(formId);
	}

}
