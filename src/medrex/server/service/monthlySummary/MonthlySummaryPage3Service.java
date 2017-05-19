package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage3;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.server.dao.monthlySummary.MonthlySummaryPage3DAO;

public class MonthlySummaryPage3Service {

	public int insertOrUpdateMonthlySummaryPage3(
			MonthlySummaryPage3 refMonthlySummaryPage3) throws MedrexException {
		return MonthlySummaryPage3DAO.getInstance()
				.insertOrUpdateMonthlySummaryPage3(refMonthlySummaryPage3);
	}

	public MonthlySummaryPage3 getMonthlySummaryPage3(MonthlySummaryRecord msr)
			throws MedrexException {
		return MonthlySummaryPage3DAO.getInstance().getMonthlySummaryPage3(msr);
	}

}
