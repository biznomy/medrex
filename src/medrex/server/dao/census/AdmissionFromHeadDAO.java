package medrex.server.dao.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.AdmissionFromHead;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdmissionFromHeadDAO {

	private AdmissionFromHeadDAO() {
	}

	private static AdmissionFromHeadDAO refAdmissionFromHeadDao = null;

	public static synchronized AdmissionFromHeadDAO getInstance() {

		// if obj is null create it , else just return it
		if (refAdmissionFromHeadDao == null) {
			refAdmissionFromHeadDao = new AdmissionFromHeadDAO();

		} // end if

		return (refAdmissionFromHeadDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateAdmissionFromHead(
			AdmissionFromHead refAdmissionFromHead) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from AdmissionFromHead");
			session.saveOrUpdate(refAdmissionFromHead);
			tx.commit();

			return refAdmissionFromHead.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving AdmissionFromHead");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getAdmissionFromHeads() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from AdmissionFromHead").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving AdmissionFromHead List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getAdmissionFromHeads(String likeStr)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					" from AdmissionFromHead as ref where ref.name like '"
							+ likeStr + "'").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving AdmissionFromHead List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized AdmissionFromHead getAdmissionFromHead(int serial)
			throws MedrexException {
		AdmissionFromHead refAdmissionFromHead = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refAdmissionFromHead = (AdmissionFromHead) session.load(
					AdmissionFromHead.class, serial);
			refAdmissionFromHead.getName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving AdmissionFromHeads");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refAdmissionFromHead;
	}

	public synchronized void deleteAdmissionFromHead(int serial)
			throws MedrexException {

		AdmissionFromHead refAdmissionFromHead = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refAdmissionFromHead = (AdmissionFromHead) session.load(
					AdmissionFromHead.class, serial);
			refAdmissionFromHead.getSerial();
			session.delete(refAdmissionFromHead);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting AdmissionFromHead Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
