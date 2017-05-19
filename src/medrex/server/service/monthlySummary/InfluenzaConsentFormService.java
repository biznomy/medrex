package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.InfluenzaConsentForm;
import medrex.server.dao.monthlySummary.InfluenzaConsentFormDAO;

public class InfluenzaConsentFormService {
	public int insertOrUpdateDietaryAlertSheet(
			InfluenzaConsentForm refInfluenzaConsentForm)
			throws MedrexException {
		return InfluenzaConsentFormDAO.getInstance()
				.insertOrUpdateInfluenzaConsentForm(refInfluenzaConsentForm);
	}

	public InfluenzaConsentForm getInfluenzaConsentForm(int formId)
			throws MedrexException {

		return InfluenzaConsentFormDAO.getInstance().getInfluenzaConsentForm(
				formId);
	}

	public void deleteInfluenzaConsentForm(int formId) throws MedrexException {

		InfluenzaConsentFormDAO.getInstance()
				.deleteInfluenzaConsentForm(formId);
	}
}
