package medrex.server.dao.dietary;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.EnteralFeeding;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class EnteralFeedingDAO {

	private EnteralFeedingDAO() {
	}

	private static EnteralFeedingDAO refEnteralFeedingDao = null;

	public static synchronized EnteralFeedingDAO getInstance() {

		// if obj is null create it , else just return it
		if (refEnteralFeedingDao == null) {
			refEnteralFeedingDao = new EnteralFeedingDAO();

		} // end if

		return (refEnteralFeedingDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateEnteralFeeding(
			EnteralFeeding refEnteralFeeding) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from EnteralFeeding");
			session.saveOrUpdate(refEnteralFeeding);
			tx.commit();

			return refEnteralFeeding.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving EnteralFeeding");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getEnteralFeedings(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from EnteralFeeding as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving EnteralFeeding List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized EnteralFeeding getEnteralFeeding(int serial)
			throws MedrexException {
		EnteralFeeding refEnteralFeeding = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refEnteralFeeding = (EnteralFeeding) session.load(
					EnteralFeeding.class, serial);
			refEnteralFeeding.getAdmissionWeight();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving EnteralFeedings");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refEnteralFeeding;
	}

	public synchronized void deleteEnteralFeeding(int formId) throws Exception {

		EnteralFeeding refEnteralFeeding = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// refEnteralFeeding = (EnteralFeeding) session.load(
			// EnteralFeeding.class, serial);
			refEnteralFeeding = (EnteralFeeding) session.createCriteria(
					EnteralFeeding.class)
					.add(Restrictions.eq("formId", formId)).uniqueResult();
			refEnteralFeeding.getAdmissionWeight();
			session.delete(refEnteralFeeding);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting EnteralFeeding Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
