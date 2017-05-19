package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage4;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.server.dao.monthlySummary.MonthlySummaryPage4DAO;

public class MonthlySummaryPage4Service {

	public int insertOrUpdateMonthlySummaryPage4(
			MonthlySummaryPage4 refMonthlySummaryPage4) throws MedrexException {
		return MonthlySummaryPage4DAO.getInstance()
				.insertOrUpdateMonthlySummaryPage4(refMonthlySummaryPage4);
	}

	public MonthlySummaryPage4 getMonthlySummaryPage4(MonthlySummaryRecord msr)
			throws MedrexException {
		return MonthlySummaryPage4DAO.getInstance().getMonthlySummaryPage4(msr);
	}

}
