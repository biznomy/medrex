package medrex.server.service.progressNotes;

import java.util.List;

import medrex.client.constants.FormSchedulerConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.progressNotes.ProgressNotes;
import medrex.server.dao.progressNotes.ProgressNotesDAO;
import medrex.server.service.admin.formScheduler.PendingFormService;

public class ProgressNotesService {

	public int insertOrUpdateProgressNotes(ProgressNotes activityPayer)
			throws MedrexException {
		int serial = ProgressNotesDAO.getInstance()
				.insertOrUpdateProgressNotes(activityPayer);
		// update pending forms for this resident this form
		(new PendingFormService())
				.updatePendingFormsStatus(activityPayer.getResidentId(),
						FormSchedulerConstants.PROGRESS_NOTES, serial);
		return serial;
	}

	public List getProgressNotess(int activitySerial) throws MedrexException {
		return (ProgressNotesDAO.getInstance()
				.getProgressNotess(activitySerial));
	}

	public ProgressNotes getProgressNotes(int serial) throws MedrexException {
		return (ProgressNotesDAO.getInstance().getProgressNotes(serial));
	}

	public void deleteProgressNotes(int serial) throws MedrexException {
		ProgressNotesDAO.getInstance().deleteProgressNotes(serial);
	}

	public void deleteProgressNotes2(int formId) throws MedrexException {
		ProgressNotesDAO.getInstance().deleteProgressNotes2(formId);
		// deleting pending forms for this resident this form
		(new PendingFormService()).resetPendingFormsStatus(
				FormSchedulerConstants.PROGRESS_NOTES, formId);
	}

}
