package medrex.server.service.admission.smokers;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.smokers.AssessingResident2;
import medrex.server.dao.admission.smokers.AssessingResident2DAO;

public class AssessingResidentService2 {
	public int insertOrUpdateAssessingResident2(
			AssessingResident2 refAssessingResident2) throws MedrexException {
		return AssessingResident2DAO.getInstance()
				.insertOrUpdateAssessingResident2(refAssessingResident2);
	}

	public AssessingResident2 getAssessingResident2(
			int currentMonthlySummaryRecordKey) throws MedrexException {
		return AssessingResident2DAO.getInstance().getAssessingResident2(
				currentMonthlySummaryRecordKey);
	}

	public void deleteAccessingResident2(int formId) throws MedrexException {
		AssessingResident2DAO.getInstance().deleteAccessingResident2(formId);

	}

}
