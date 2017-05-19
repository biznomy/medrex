package medrex.server.service.admission.smokers;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.smokers.AssessingResident1;
import medrex.server.dao.admission.smokers.AssessingResidentDAO;

public class AssessingResidentService1 {
	public int insertOrUpdateAssessingResident1(
			AssessingResident1 refAssessingResident1) throws MedrexException {
		return AssessingResidentDAO.getInstance()
				.insertOrUpdateAssessingResident1(refAssessingResident1);
	}

	public AssessingResident1 getAssessingResident1(
			int currentAssessingResident1) throws MedrexException {

		return AssessingResidentDAO.getInstance().getAssessingResident1(
				currentAssessingResident1);
	}

	public void deleteAccessingResident1(int formId) throws MedrexException {
		AssessingResidentDAO.getInstance().deleteAccessingResident1(formId);

	}

}
