package medrex.server.service.medication;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.NurseTreatmentNotesForm;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow1;
import medrex.server.dao.medicationTreatment.NurseTreatmentNotesFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class NurseTreatmentNotesFormService {

	public int insertOrUpdateNurseTreatmentNotesForm(
			NurseTreatmentNotesForm ntnf) throws MedrexException {
		int serial = NurseTreatmentNotesFormDAO.getInstance()
				.insertOrUpdateNurseTreatmentNotesForm(ntnf);

		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(ntnf
				.getResidentId(), FormSchedulerConstants.NURSE_TREATMENT_NOTES,
				serial);
		return serial;
	}

	public List getNurseTreatmentNotesForms(int residentSerial)
			throws MedrexException {
		return (NurseTreatmentNotesFormDAO.getInstance()
				.getNurseTreatmentNotesForms(residentSerial));
	}

	public NurseTreatmentNotesForm getNurseTreatmentNotesForm(int serial)
			throws MedrexException {
		return (NurseTreatmentNotesFormDAO.getInstance()
				.getNurseTreatmentNotesForm(serial));
	}

	public void deleteNurseTreatmentNotesForm(int serial)
			throws MedrexException {
		NurseTreatmentNotesFormDAO.getInstance().deleteNurseTreatmentNotesForm(
				serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.NURSE_TREATMENT_NOTES, serial);
	}

	public int insertOrUpdateNurseTreatmentNotesFormRow(
			NurseTreatmentNotesFormRow ntnfr) throws MedrexException {
		return NurseTreatmentNotesFormDAO.getInstance()
				.insertOrUpdateNurseTreatmentNotesFormRow(ntnfr);
	}

	public int insertOrUpdateNurseTreatmentNotesFormRow(List ntnfr)
			throws MedrexException {
		return NurseTreatmentNotesFormDAO.getInstance()
				.insertOrUpdateNurseTreatmentNotesFormRow(ntnfr);
	}

	public NurseTreatmentNotesFormRow getNurseTreatmentNotesFormRow(int formId,
			int formNum) throws MedrexException {
		return (NurseTreatmentNotesFormDAO.getInstance()
				.getNurseTreatmentNotesFormRow(formId, formNum));
	}

	public List getNurseTreatmentNotesFormRows(int formId)
			throws MedrexException {
		return (NurseTreatmentNotesFormDAO.getInstance()
				.getNurseTreatmentNotesFormRows(formId));
	}

	public int insertOrUpdateNurseTreatmentNotesFormRow1(
			NurseTreatmentNotesFormRow1 ntnfr) throws MedrexException {
		return NurseTreatmentNotesFormDAO.getInstance()
				.insertOrUpdateNurseTreatmentNotesFormRow1(ntnfr);
	}

	public int insertOrUpdateNurseTreatmentNotesFormRow1(List ntnfr)
			throws MedrexException {
		return NurseTreatmentNotesFormDAO.getInstance()
				.insertOrUpdateNurseTreatmentNotesFormRow1(ntnfr);
	}

	public List getNurseTreatmentNotesFormRow1s(int formId)
			throws MedrexException {
		return (NurseTreatmentNotesFormDAO.getInstance()
				.getNurseTreatmentNotesFormRow1s(formId));
	}

	public NurseTreatmentNotesFormRow1 getNurseTreatmentNotesFormRow1(
			int formId, int formNum) throws MedrexException {
		return (NurseTreatmentNotesFormDAO.getInstance()
				.getNurseTreatmentNotesFormRow1(formId, formNum));
	}

	public void deleteNurseTreatmentNotesFormRow(int formId)
			throws MedrexException {
		NurseTreatmentNotesFormDAO.getInstance()
				.deleteNurseTreatmentNotesFormRow(formId);
	}

	public void deleteNurseTreatmentNotesFormRow1(int formId)
			throws MedrexException {
		NurseTreatmentNotesFormDAO.getInstance()
				.deleteNurseTreatmentNotesFormRow1(formId);

	}

}
