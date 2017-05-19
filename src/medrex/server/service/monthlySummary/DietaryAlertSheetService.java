package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.DietaryAlertSheet;
import medrex.server.dao.monthlySummary.DietaryAlertSheetDAO;

public class DietaryAlertSheetService {

	public int insertOrUpdateDietaryAlertSheet(
			DietaryAlertSheet refDietaryAlertSheet) throws MedrexException {
		return DietaryAlertSheetDAO.getInstance()
				.insertOrUpdateDietaryAlertSheet(refDietaryAlertSheet);
	}

	public DietaryAlertSheet getDietaryAlertSheet(int formId)
			throws MedrexException {

		return DietaryAlertSheetDAO.getInstance().getDietaryAlertSheet(formId);
	}

	public void deleteDietaryAlertSheet(int formId) throws MedrexException {

		DietaryAlertSheetDAO.getInstance().deleteDietaryAlertSheet(formId);
	}

}
