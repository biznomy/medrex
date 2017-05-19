package medrex.server.service.progressNotes;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.progressNotes.InterDisciplinaryProgressNotesForm;
import medrex.server.dao.progressNotes.InterDisciplinaryProgressNotesFormDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class InterDisciplinaryProgressNotesFormService {

	public int insertOrUpdateInterDisciplinaryProgressNotesForm(
			InterDisciplinaryProgressNotesForm ntnf) throws MedrexException {
		int serial = InterDisciplinaryProgressNotesFormDAO.getInstance()
				.insertOrUpdateInterDisciplinaryProgressNotesForm(ntnf);
		// update pending forms for this resident this form
		(new PendingFormService()).updatePendingFormsStatus(ntnf
				.getResidentId(),
				FormSchedulerConstants.INTERDISPLINARY_PROGRESS_NOTES, serial);
		return serial;
	}

	public List getInterDisciplinaryProgressNotesForms(int residentSerial)
			throws MedrexException {
		return (InterDisciplinaryProgressNotesFormDAO.getInstance()
				.getInterDisciplinaryProgressNotesForms(residentSerial));
	}

	public InterDisciplinaryProgressNotesForm getInterDisciplinaryProgressNotesForm(
			int serial) throws MedrexException {
		return (InterDisciplinaryProgressNotesFormDAO.getInstance()
				.getInterDisciplinaryProgressNotesForm(serial));
	}

	public void deleteInterDisciplinaryProgressNotesForm(int serial)
			throws MedrexException {
		InterDisciplinaryProgressNotesFormDAO.getInstance()
				.deleteInterDisciplinaryProgressNotesForm(serial);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.INTERDISPLINARY_PROGRESS_NOTES, serial);
	}

	public int insertOrUpdateInterDisciplinaryProgressNotesFormRow(List ntnfr)
			throws MedrexException {
		return InterDisciplinaryProgressNotesFormDAO.getInstance()
				.insertOrUpdateInterDisciplinaryProgressNotesFormRow(ntnfr);
	}

	// ////////////////

	public List getInterDisciplinaryProgressNotesFormRows(int formId)
			throws MedrexException {
		return (InterDisciplinaryProgressNotesFormDAO.getInstance()
				.getInterDisciplinaryProgressNotesFormRows(formId));
	}

	public void deleteInterDisciplinaryProgressNotesFormRow(int formId)
			throws MedrexException {
		InterDisciplinaryProgressNotesFormDAO.getInstance()
				.deleteInterDisciplinaryProgressNotesFormForm(formId);

	}

}
