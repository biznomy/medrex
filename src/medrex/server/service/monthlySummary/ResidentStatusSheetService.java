package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.ResidentStatusSheet;
import medrex.server.dao.monthlySummary.ResidentStatusSheetDAO;

public class ResidentStatusSheetService {

	public int insertOrUpdateResidentStatusSheet(
			ResidentStatusSheet refResidentStatusSheet) throws MedrexException {

		return ResidentStatusSheetDAO.getInstance()
				.insertOrUpdateResidentStatusSheet(refResidentStatusSheet);
	}

	public ResidentStatusSheet getResidentStatusSheet(int formId)
			throws MedrexException {
		return ResidentStatusSheetDAO.getInstance().getResidentStatusSheet(
				formId);
	}

	public void deleteResidentStatusSheet(int formId) throws MedrexException {

		ResidentStatusSheetDAO.getInstance().deleteResidentStatusSheet(formId);
	}

}
