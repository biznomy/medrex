package medrex.server.dao.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.SignOutTo;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SignOutToDAO {
	private SignOutToDAO() {
	}

	private static SignOutToDAO refDao = null;

	public static synchronized SignOutToDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDao == null) {
			refDao = new SignOutToDAO();

		} // end if

		return (refDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateSignOutTo(SignOutTo ref)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from SignOutTo");
			session.saveOrUpdate(ref);
			tx.commit();

			// Global.currentSignOutToKey = ref.getSerial();
			return ref.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving SignOutTo");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getSignOutTos() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from SignOutTo").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving SignOutTo List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getSignOutTos(String likeStr)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					" from SignOutTo as ref where ref.name like '" + likeStr
							+ "'").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving SignOutTo List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized SignOutTo getSignOutTo(int serial)
			throws MedrexException {
		SignOutTo ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (SignOutTo) session.load(SignOutTo.class, serial);
			ref.getName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving SignOutTos");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized void deleteDischargeSignOutTo(int serial)
			throws MedrexException {

		SignOutTo ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (SignOutTo) session.load(SignOutTo.class, serial);
			ref.getSerial();
			session.delete(ref);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting SignOutTo Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
}
