package medrex.server.service.monthlySummary;

import java.util.ArrayList;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.MonthlySummaryMainPage;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage1;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage2;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.server.dao.monthlySummary.MonthlySummaryDao;

public class MonthlySummaryFormService {

	public int insertOrUpdateMonthlySummaryPage1(
			MonthlySummaryPage1 refMonthlySummaryPage1) throws MedrexException {

		return MonthlySummaryDao.getInstance()
				.insertOrUpdateMonthlySummaryPage1(refMonthlySummaryPage1);
	}

	public MonthlySummaryPage1 getMonthlySummaryPage1(MonthlySummaryRecord msr)
			throws MedrexException {
		return (MonthlySummaryDao.getInstance().getMonthlySummaryPage1(msr));
	}

	public void deleteMonthlySummaryPage1(int serial) throws MedrexException {
		MonthlySummaryDao.getInstance().deleteMonthlySummaryPage1(serial);

	}

	// for main page

	public int insertOrUpdateMonthlySummaryMainPage(
			MonthlySummaryMainPage refMonthlySummaryMainPage)
			throws MedrexException {

		return MonthlySummaryDao
				.getInstance()
				.insertOrUpdateMonthlySummaryMainPage(refMonthlySummaryMainPage);
	}

	public MonthlySummaryMainPage getMonthlySummaryMainPage(
			MonthlySummaryRecord msr) throws MedrexException {
		return (MonthlySummaryDao.getInstance().getMonthlySummaryMainPage(msr));
	}

	public void deleteMonthlySummaryMainPage(int serial) throws MedrexException {
		MonthlySummaryDao.getInstance().deleteMonthlySummaryMainPage(serial);

	}

	// for 2nd page

	public int insertOrUpdateMonthlySummaryPage2(
			MonthlySummaryPage2 refMonthlySummaryPage2) throws MedrexException {

		return MonthlySummaryDao.getInstance()
				.insertOrUpdateMonthlySummaryPage2(refMonthlySummaryPage2);
	}

	public MonthlySummaryPage2 getMonthlySummaryPage2(MonthlySummaryRecord msr)
			throws MedrexException {
		return (MonthlySummaryDao.getInstance().getMonthlySummaryPage2(msr));
	}

	public void deleteMonthlySummaryPage2(int serial) throws MedrexException {
		MonthlySummaryDao.getInstance().deleteMonthlySummaryPage2(serial);

	}

	// for summary master table
	public int insertOrUpdateMonthlySummaryRecord(
			MonthlySummaryRecord monthlySum) throws MedrexException {
		return MonthlySummaryDao.getInstance()
				.insertOrUpdateMonthlySummaryRecord(monthlySum);
	}

	public MonthlySummaryRecord getMonthlySummaryRecord(
			int currentMonthlySummaryRecordKey) throws MedrexException {
		return MonthlySummaryDao.getInstance().getMonthlySummaryRecord(
				currentMonthlySummaryRecordKey);
	}

	public ArrayList<MonthlySummaryRecord> getMonthlySummaryRecords(
			int currentResidenceKey) throws MedrexException {
		return MonthlySummaryDao.getInstance().getMonthlySummaryRecords(
				currentResidenceKey);
	}

	public void deleteMonthlySummaryRecord(int serial) throws MedrexException {
		MonthlySummaryDao.getInstance().deleteMonthlySummaryRecord(serial);
	}
}
