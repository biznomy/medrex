package medrex.server.dao.census.counts;

import java.math.BigInteger;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.counts.OutOfPass;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OutOfPassDAO {

	public OutOfPassDAO() {
	}

	private static OutOfPassDAO refDao = null;

	public static synchronized OutOfPassDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDao == null) {
			refDao = new OutOfPassDAO();

		} // end if

		return (refDao);

	} // end - getUniqueInstance - method

	public synchronized void insertOrUpdateOutOfPass(OutOfPass oop)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from OutOfPass");
			session.saveOrUpdate(oop);
			tx.commit();
		} catch (Exception e) {

			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving OutOfPass");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized int getOutOfPassCount() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session.createSQLQuery(
					"select count(residentId) as total from OutOfPass")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving OutOfPass Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void deleteOutOfPass(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createSQLQuery(
					"delete from OutOfPass where residentId=" + serial)
					.executeUpdate();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Hospital Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
