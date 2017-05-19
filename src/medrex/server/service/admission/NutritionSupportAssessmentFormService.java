package medrex.server.service.admission;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.NutritionSupportAssessmentFormPage1;
import medrex.server.dao.dietary.NutritionSupportAssessmentFormDAO;

public class NutritionSupportAssessmentFormService {

	public int insertOrUpdateNutritionSupportAssessmentFormPage1(
			NutritionSupportAssessmentFormPage1 refNutritionSupportAssessmentFormPage1)
			throws MedrexException {

		return (NutritionSupportAssessmentFormDAO.getInstance()
				.insertOrUpdateNutritionSupportAssessmentFormPage1(refNutritionSupportAssessmentFormPage1));
	}

	public NutritionSupportAssessmentFormPage1 getNutritionSupportAssessmentFormPage1(
			int currentNutritionSupportAssessmentFormKey)
			throws MedrexException {

		return (NutritionSupportAssessmentFormDAO.getInstance()
				.getNutritionSupportAssessmentFormPage1(currentNutritionSupportAssessmentFormKey));
	}

	public void deleteNutritionSupportAssessmentFormPage1(int formId)
			throws MedrexException {
		NutritionSupportAssessmentFormDAO.getInstance()
				.deleteNutritionSupportAssessmentFormPage1(formId);

	}

}
