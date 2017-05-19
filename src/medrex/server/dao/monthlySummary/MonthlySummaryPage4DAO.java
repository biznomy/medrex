package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.MonthlySummaryPage4;
import medrex.commons.vo.monthlySummary.MonthlySummaryRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class MonthlySummaryPage4DAO {

	private MonthlySummaryPage4DAO() {

	}

	private static MonthlySummaryPage4DAO monthlySummary4DAO = null;

	public static synchronized MonthlySummaryPage4DAO getInstance() {

		// if obj is null create it , else just return it
		if (monthlySummary4DAO == null) {
			monthlySummary4DAO = new MonthlySummaryPage4DAO();

		} // end if

		return (monthlySummary4DAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMonthlySummaryPage4(
			MonthlySummaryPage4 refMonthlySummaryPage4) throws MedrexException {
		int key = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from MonthlySummaryPage4");
			session.saveOrUpdate(refMonthlySummaryPage4);
			tx.commit();
			key = refMonthlySummaryPage4.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving MonthlySummaryPage4");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return key;

	}

	public synchronized MonthlySummaryPage4 getMonthlySummaryPage4(
			MonthlySummaryRecord msr) throws MedrexException {
		MonthlySummaryPage4 refMonthlySummaryPage4 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// refMonthlySummaryPage5 = (MonthlySummaryPage5)
			// session.load(MonthlySummaryPage5.class,
			// currentMonthlySummaryPage5Key);
			// refMonthlySummaryPage5.getFormId();
			refMonthlySummaryPage4 = (MonthlySummaryPage4) session
					.createCriteria(MonthlySummaryPage4.class).add(
							Restrictions.eq("formId", msr)).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving MonthlySummaryPage5.javas");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refMonthlySummaryPage4;
	}

}
