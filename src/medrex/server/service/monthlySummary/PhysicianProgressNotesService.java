package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.PhysicianProgressNotes;
import medrex.server.dao.monthlySummary.PhysicicanProgressNotesDAO;

public class PhysicianProgressNotesService {
	public int insertOrUpdatePhysicianNotes(
			PhysicianProgressNotes refPhysicianProgressNotes)
			throws MedrexException {
		return PhysicicanProgressNotesDAO
				.getInstance()
				.insertOrUpdatePhysicianProgressNotes(refPhysicianProgressNotes);
	}

	public PhysicianProgressNotes getPhysicianProgressNotes(
			int currentMonthlySummaryRecordKey) throws MedrexException {
		return PhysicicanProgressNotesDAO.getInstance()
				.getPhysicianProgressNotes(currentMonthlySummaryRecordKey);
	}

	public void deletePhysicalProgressNotes(int formId) throws MedrexException {
		PhysicicanProgressNotesDAO.getInstance().deletePhysicalProgressNotes(
				formId);

	}

}
