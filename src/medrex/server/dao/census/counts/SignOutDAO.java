package medrex.server.dao.census.counts;

import java.math.BigInteger;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.counts.SignOut;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

public class SignOutDAO {

	private SignOutDAO() {
	}

	private static SignOutDAO refDao = null;

	public static synchronized SignOutDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDao == null) {
			refDao = new SignOutDAO();

		} // end if

		return (refDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateSignOut(SignOut ref)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from SignOut");
			session.saveOrUpdate(ref);
			tx.commit();

			return ref.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();

			throw new MedrexException("Error Saving SignOut");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<SignOut> getSignOuts() throws MedrexException {
		List<SignOut> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from SignOut").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			throw new MedrexException("Error retrieving SignOut List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<SignOut> getSignOutsLate() throws MedrexException {
		List<SignOut> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					" from SignOut as so where so.anticipatedDate < now() ")
					.list();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving SignOut List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<SignOut> getSignOutsLateMoreThanHour()
			throws MedrexException {
		List<SignOut> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session
					.createCriteria(SignOut.class)
					.add(
							Restrictions
									.sqlRestriction("date_add(anticipatedDate, INTERVAL '+1' HOUR) < now()"))
					.list();

			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving SignOut List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<SignOut> getAllWithCensusStatus(CensusStatus ref)
			throws MedrexException {
		List<SignOut> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(SignOut.class).add(
					Restrictions.eq("censusStatus", ref)).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			throw new MedrexException("Error retrieving SignOut List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getSignOutCount() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session
					.createSQLQuery(
							"select count(residentId) as total from SignOut as so where so.isEr = false")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			throw new MedrexException("Error retrieving SignOut Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getSignOutLateCount() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session
					.createSQLQuery(
							"select count(residentId) as total from SignOut as so where so.anticipatedDate < now() and so.isEr = false")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			throw new MedrexException("Error retrieving SignOut Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getSignOutLateMoreThanHourCount()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session
					.createSQLQuery(
							"select count(residentId) as total from SignOut as so where date_add(so.anticipatedDate, INTERVAL '+1' HOUR) < now() and so.isEr = false")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			throw new MedrexException("Error retrieving SignOut Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized SignOut getSignOut(int residentId)
			throws MedrexException {
		SignOut ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (SignOut) session.createCriteria(SignOut.class, "s").add(
					Expression.eq("s.residentId", residentId)).uniqueResult();
			ref.getResidentId();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving SignOuts");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized void deleteSignOut(int residentId)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createSQLQuery(
					"delete from SignOut where residentId=" + residentId)
					.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting SignOut Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void deleteSignOutSerial(int serial)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session
					.createSQLQuery(
							"delete from SignOut where serial=" + serial)
					.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting SignOut Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized int countEr() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session
					.createSQLQuery(
							"select count(residentId) as total from SignOut as so where so.isEr = true")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			throw new MedrexException("Error retrieving ER Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<SignOut> getSignOutsER() throws MedrexException {
		List<SignOut> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(SignOut.class, "s").add(
					Expression.eq("s.isEr", true)).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();

			throw new MedrexException("Error retrieving SignOut List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}
}
