package medrex.server.dao.census.counts;

import java.math.BigInteger;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.counts.BedHold;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

public class BedHoldDAO {

	private BedHoldDAO() {
	}

	private static BedHoldDAO refDao = null;

	public static synchronized BedHoldDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDao == null) {
			refDao = new BedHoldDAO();

		} // end if

		return (refDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateBedHold(BedHold ref)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from BedHold");
			session.saveOrUpdate(ref);
			tx.commit();

			return ref.getSerial();

		} catch (Exception e) {

			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving BedHold");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<BedHold> getBedHolds() throws MedrexException {
		List<BedHold> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from BedHold").list();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving BedHold List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getBedHoldCount() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session.createSQLQuery(
					"select count(residentId) as total from BedHold ")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving BedHold Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized BedHold getBedHold(int residentId)
			throws MedrexException {
		BedHold ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (BedHold) session.createCriteria(BedHold.class, "b").add(
					Expression.eq("b.residentId", residentId)).uniqueResult();
			ref.getResidentId();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving BedHolds");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized void deleteBedHold(int residentId)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createSQLQuery(
					"delete from BedHold where residentId=" + residentId)
					.executeUpdate();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting BedHold Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void deleteBedHoldSerial(int serial)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session
					.createSQLQuery(
							"delete from BedHold where serial=" + serial)
					.executeUpdate();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting BedHold Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<BedHold> getAllWithBedHold(
			CensusStatus refCensusStatus) throws MedrexException {
		List<BedHold> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(BedHold.class).add(
					Restrictions.eq("censusStatus", refCensusStatus)).list();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving BedHold List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}
}
