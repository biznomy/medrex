package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.InterDisciplinaryCarePlan;
import medrex.server.dao.monthlySummary.InterDisciplinaryCarePlanDAO;

public class InterDisciplinaryCarePlanService {

	public int insertOrUpdateInterDisciplinaryForm(
			InterDisciplinaryCarePlan interDsc) throws MedrexException {

		return InterDisciplinaryCarePlanDAO.getInstance()
				.insertOrUpdateInterDisciplinaryForm(interDsc);
	}

	public InterDisciplinaryCarePlan getInterDisciplinaryForm(int formId)
			throws MedrexException {

		return InterDisciplinaryCarePlanDAO.getInstance()
				.getInterDisciplinaryForm(formId);
	}

	public void deleteInterDisciplinaryCarePlanForm(int formId)
			throws MedrexException {
		InterDisciplinaryCarePlanDAO.getInstance()
				.deleteInterDisciplinaryCarePlanForm(formId);

	}

}
