package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage5;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class MonthlySummaryPage5DAO {

	private MonthlySummaryPage5DAO() {

	}

	private static MonthlySummaryPage5DAO monthlySummary5DAO = null;

	public static synchronized MonthlySummaryPage5DAO getInstance() {

		// if obj is null create it , else just return it
		if (monthlySummary5DAO == null) {
			monthlySummary5DAO = new MonthlySummaryPage5DAO();

		} // end if

		return (monthlySummary5DAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMonthlySummaryPage5(
			MonthlySummaryPage5 refMonthlySummaryPage5) throws MedrexException {
		int key = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from MonthlySummaryPage5");
			session.saveOrUpdate(refMonthlySummaryPage5);
			tx.commit();
			key = refMonthlySummaryPage5.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving MonthlySummaryPage5.java");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return key;

	}

	public synchronized MonthlySummaryPage5 getMonthlySummaryPage5(
			MonthlySummaryRecord msr) throws MedrexException {
		MonthlySummaryPage5 refMonthlySummaryPage5 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// refMonthlySummaryPage5 = (MonthlySummaryPage5)
			// session.load(MonthlySummaryPage5.class,
			// currentMonthlySummaryPage5Key);
			// refMonthlySummaryPage5.getFormId();
			refMonthlySummaryPage5 = (MonthlySummaryPage5) session
					.createCriteria(MonthlySummaryPage5.class).add(
							Restrictions.eq("formId", msr)).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving MonthlySummaryPage5.javas");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refMonthlySummaryPage5;
	}

}
