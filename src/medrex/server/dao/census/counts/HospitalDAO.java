package medrex.server.dao.census.counts;

import java.math.BigInteger;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.counts.Hospital;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

public class HospitalDAO {

	private HospitalDAO() {
	}

	private static HospitalDAO refDao = null;

	public static synchronized HospitalDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDao == null) {
			refDao = new HospitalDAO();

		} // end if

		return (refDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateHospital(Hospital ref)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from Hospital");
			session.saveOrUpdate(ref);
			tx.commit();

			return ref.getSerial();

		} catch (Exception e) {

			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Hospital");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<Hospital> getHospitals() throws MedrexException {
		List<Hospital> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from Hospital").list();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving Hospital List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getHospitalCount() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session.createSQLQuery(
					"select count(residentId) as total from Hospital ")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving Hospital Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Hospital getHospital(int residentId)
			throws MedrexException {
		Hospital ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (Hospital) session.createCriteria(Hospital.class, "h").add(
					Expression.eq("h.residentId", residentId)).uniqueResult();

			ref.getResidentId();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving Hospitals");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized void deleteHospital(int residentId)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createSQLQuery(
					"delete from Hospital where residentId=" + residentId)
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

	public synchronized void deleteHospitalSerial(int serial)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createSQLQuery(
					"delete from Hospital where serial=" + serial)
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

	public synchronized List<Hospital> getAllWithHospital(
			CensusStatus refCensusStatus) throws MedrexException {
		List<Hospital> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(Hospital.class).add(
					Restrictions.eq("censusStatus", refCensusStatus)).list();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving Hospital List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}
}
