package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.SkilledFlowSheet;
import medrex.server.dao.monthlySummary.SkilledFlowSheetDAO;

public class SkilledFlowSheetService {

	public int insertOrUpdateSkilledFlowSheet(
			SkilledFlowSheet refSkilledFlowSheet) throws MedrexException {
		return SkilledFlowSheetDAO.getInstance()
				.insertOrUpdateSkilledFlowSheet(refSkilledFlowSheet);
	}

	public SkilledFlowSheet getSkilledFlowSheet(int formId)
			throws MedrexException {

		return SkilledFlowSheetDAO.getInstance().getSkilledFlowSheet(formId);
	}

	public void deleteSkilledFlowSheet(int formId) throws MedrexException {

		SkilledFlowSheetDAO.getInstance().deleteSkilledFlowSheet(formId);
	}

}
