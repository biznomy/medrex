package medrex.server.service.admission.smokers;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.smokers.AssessingResident3;
import medrex.server.dao.admission.smokers.AssessingResident3DAO;

public class AssessingResidentService3 {
	public int insertOrUpdateAssessingResident3(
			AssessingResident3 refAssessingResident3) throws MedrexException {
		return AssessingResident3DAO.getInstance()
				.insertOrUpdateAssessingResident3(refAssessingResident3);
	}

	public AssessingResident3 getAssessingResident3(
			int currentMonthlySummaryRecordKey) throws MedrexException {
		return AssessingResident3DAO.getInstance().getAssessingResident3(
				currentMonthlySummaryRecordKey);
	}

	public void deleteAccessingResident3(int formId) throws MedrexException {
		AssessingResident3DAO.getInstance().deleteAccessingResident3(formId);

	}

}
