package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.ResidentInformation;
import medrex.server.dao.monthlySummary.ResidentInformationMonDAO;

public class ResidentInformationService {
	public int insertOrUpdateResidentInformation(
			ResidentInformation refResidentInformation) throws MedrexException {
		return ResidentInformationMonDAO.getInstance()
				.insertOrUpdateResidentInformation(refResidentInformation);
	}

	public ResidentInformation getResidentInformation(
			int currentResidentInformationKey) throws MedrexException {
		return ResidentInformationMonDAO.getInstance().getResidentInformation(
				currentResidentInformationKey);
	}

	public void deleteResidentInformation(int formId) throws MedrexException {
		ResidentInformationMonDAO.getInstance().deleteResidentInformation(
				formId);

	}

}
