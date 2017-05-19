package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.MSJN;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class MSJNDAO {
	private MSJNDAO() {

	}

	private static MSJNDAO msnjDAO = null;

	public static synchronized MSJNDAO getInstance() {

		// if obj is null create it , else just return it
		if (msnjDAO == null) {
			msnjDAO = new MSJNDAO();

		} // end if
		return (msnjDAO);
	}

	public synchronized int insertOrUpdateMsnj(MSJN msjn)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			// System.out.println(refMonthlySummaryPage1.getResidentName());
			tx = session.beginTransaction();
			session.createQuery("from MSJN");
			// System.out.println("resident name:"+msjn.getResidentName());
			session.saveOrUpdate(msjn);
			tx.commit();
			return msjn.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving msjn");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized MSJN getMsnj(int currentMsjnKey) throws MedrexException {

		MSJN msjn = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			msjn = (MSJN) session.load(MSJN.class, currentMsjnKey);
			msjn.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving msjn");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return msjn;
	}

	public void deleteMsnj(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		MSJN msjn = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// session.createSQLQuery("delete from msjn where formId = "+formId);
			msjn = (MSJN) session.createCriteria(MSJN.class).add(
					Restrictions.eq("serial", formId)).uniqueResult();
			session.delete(msjn);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error deleting msjn");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
