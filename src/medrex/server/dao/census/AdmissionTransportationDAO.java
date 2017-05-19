package medrex.server.dao.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.AdmissionTransportation;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdmissionTransportationDAO {

	private AdmissionTransportationDAO() {
	}

	private static AdmissionTransportationDAO refAdmissionTransportationDao = null;

	public static synchronized AdmissionTransportationDAO getInstance() {

		// if obj is null create it , else just return it
		if (refAdmissionTransportationDao == null) {
			refAdmissionTransportationDao = new AdmissionTransportationDAO();

		} // end if

		return (refAdmissionTransportationDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateAdmissionTransportation(
			AdmissionTransportation refAdmissionTransportation)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from AdmissionTransportation");
			session.saveOrUpdate(refAdmissionTransportation);
			tx.commit();

			return refAdmissionTransportation.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving AdmissionTransportation");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getAdmissionTransportations(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from AdmissionTransportation").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving AdmissionTransportation List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getAdmissionTransportations(String likeStr)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from AdmissionTransportation as ref where ref.name like '"
							+ likeStr + "'").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving AdmissionTransportation List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized AdmissionTransportation getAdmissionTransportation(
			int serial) throws MedrexException {
		AdmissionTransportation refAdmissionTransportation = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refAdmissionTransportation = (AdmissionTransportation) session
					.load(AdmissionTransportation.class, serial);
			refAdmissionTransportation.getName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving AdmissionTransportations");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refAdmissionTransportation;
	}

	public synchronized void deleteAdmissionTransportation(int serial)
			throws MedrexException {

		AdmissionTransportation refAdmissionTransportation = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refAdmissionTransportation = (AdmissionTransportation) session
					.load(AdmissionTransportation.class, serial);
			refAdmissionTransportation.getSerial();
			session.delete(refAdmissionTransportation);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting AdmissionTransportation Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
