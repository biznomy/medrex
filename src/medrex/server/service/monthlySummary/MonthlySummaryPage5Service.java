package medrex.server.service.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage5;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.server.dao.monthlySummary.MonthlySummaryPage5DAO;

public class MonthlySummaryPage5Service {

	public int insertOrUpdateMonthlySummaryPage5(
			MonthlySummaryPage5 refMonthlySummaryPage5) throws MedrexException {
		return MonthlySummaryPage5DAO.getInstance()
				.insertOrUpdateMonthlySummaryPage5(refMonthlySummaryPage5);
	}

	public MonthlySummaryPage5 getMonthlySummaryPage5(MonthlySummaryRecord msr)
			throws MedrexException {
		return MonthlySummaryPage5DAO.getInstance().getMonthlySummaryPage5(msr);
	}

}
