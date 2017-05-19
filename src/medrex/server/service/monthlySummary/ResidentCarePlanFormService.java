package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.ResidentCarePlan;
import medrex.server.dao.monthlySummary.ResidentCarePlanDAO;

public class ResidentCarePlanFormService {

	public int insertOrUpdateResidentCarePlan(
			ResidentCarePlan refResidentCarePlan) throws MedrexException {

		return ResidentCarePlanDAO.getInstance()
				.insertOrUpdateResidentCarePlan(refResidentCarePlan);
	}

	public ResidentCarePlan getResidentCarePlan(int formId)
			throws MedrexException {

		return ResidentCarePlanDAO.getInstance().getResidentCarePlan(formId);
	}

	public void deleteResidentCarePlanForm(int formId) throws MedrexException {
		ResidentCarePlanDAO.getInstance().deleteResidentCarePlan(formId);

	}

}
