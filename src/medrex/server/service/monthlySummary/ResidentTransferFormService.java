package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.ResidentTransferForm;
import medrex.server.dao.monthlySummary.ResidentTransferDAO;

public class ResidentTransferFormService {

	public int insertOrUpdateResidentTransferForm(
			ResidentTransferForm refResidentTransferForm)
			throws MedrexException {

		return ResidentTransferDAO.getInstance()
				.insertOrUpdateResidentTransfer(refResidentTransferForm);
	}

	public ResidentTransferForm getResidentTransferForm(int formId)
			throws MedrexException {

		return ResidentTransferDAO.getInstance()
				.getResidentTransferForm(formId);
	}

	public void deleteResidentTransferForm(int formId) throws MedrexException {
		ResidentTransferDAO.getInstance().deleteResidentTransferForm(formId);

	}

}
