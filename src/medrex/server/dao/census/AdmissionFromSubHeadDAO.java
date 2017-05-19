package medrex.server.dao.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.AdmissionFromSubHead;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdmissionFromSubHeadDAO {

	private AdmissionFromSubHeadDAO() {
	}

	private static AdmissionFromSubHeadDAO refAdmissionFromSubHeadDao = null;

	public static synchronized AdmissionFromSubHeadDAO getInstance() {

		// if obj is null create it , else just return it
		if (refAdmissionFromSubHeadDao == null) {
			refAdmissionFromSubHeadDao = new AdmissionFromSubHeadDAO();

		} // end if

		return (refAdmissionFromSubHeadDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateAdmissionFromSubHead(
			AdmissionFromSubHead refAdmissionFromSubHead)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from AdmissionFromSubHead");
			session.saveOrUpdate(refAdmissionFromSubHead);
			tx.commit();

			return refAdmissionFromSubHead.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving AdmissionFromSubHead");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getAdmissionFromSubHeads(int headId)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session
					.createQuery(
							"from AdmissionFromSubHead as ls where ls.headId="
									+ headId).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving AdmissionFromSubHead List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getAdmissionFromSubHeads(int headId, String likeStr)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from AdmissionFromSubHead as ls where ls.headId=" + headId
							+ " and ls.name like '" + likeStr + "'").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving AdmissionFromSubHead List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized AdmissionFromSubHead getAdmissionFromSubHead(int serial)
			throws MedrexException {
		AdmissionFromSubHead refAdmissionFromSubHead = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refAdmissionFromSubHead = (AdmissionFromSubHead) session.load(
					AdmissionFromSubHead.class, serial);
			refAdmissionFromSubHead.getName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving AdmissionFromSubHeads");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refAdmissionFromSubHead;
	}

	public synchronized void deleteAdmissionFromSubHead(int serial)
			throws MedrexException {

		AdmissionFromSubHead refAdmissionFromSubHead = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refAdmissionFromSubHead = (AdmissionFromSubHead) session.load(
					AdmissionFromSubHead.class, serial);
			refAdmissionFromSubHead.getSerial();
			session.delete(refAdmissionFromSubHead);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting AdmissionFromSubHead Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
