package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage3;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class MonthlySummaryPage3DAO {

	private MonthlySummaryPage3DAO() {

	}

	private static MonthlySummaryPage3DAO monthlySummary3DAO = null;

	public static synchronized MonthlySummaryPage3DAO getInstance() {

		// if obj is null create it , else just return it
		if (monthlySummary3DAO == null) {
			monthlySummary3DAO = new MonthlySummaryPage3DAO();

		} // end if

		return (monthlySummary3DAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMonthlySummaryPage3(
			MonthlySummaryPage3 refMonthlySummaryPage3) throws MedrexException {
		int key = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from MonthlySummaryPage3");
			session.saveOrUpdate(refMonthlySummaryPage3);
			tx.commit();

			key = refMonthlySummaryPage3.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving MonthlySummaryPage3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return key;
	}

	public synchronized MonthlySummaryPage3 getMonthlySummaryPage3(
			MonthlySummaryRecord msr) throws MedrexException {
		MonthlySummaryPage3 refMonthlySummaryPage3 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// refMonthlySummaryPage3 = (MonthlySummaryPage3)
			// session.load(MonthlySummaryPage3.class,
			// serial);
			// refMonthlySummaryPage3.getCardiologicalOther();
			refMonthlySummaryPage3 = (MonthlySummaryPage3) session
					.createCriteria(MonthlySummaryPage3.class).add(
							Restrictions.eq("formId", msr)).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving MonthlySummaryPage3s");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refMonthlySummaryPage3;

	}

}
