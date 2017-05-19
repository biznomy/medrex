package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.RehabilitationRestrorative;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class RestrorativeDAO {

	private RestrorativeDAO() {

	}

	private static RestrorativeDAO refRestrorativeDAO = null;

	public static synchronized RestrorativeDAO getInstance() {
		// if obj is null create it , else just return it
		if (refRestrorativeDAO == null) {
			refRestrorativeDAO = new RestrorativeDAO();

		} // end if
		return (refRestrorativeDAO);
	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateRehabilitationRestrorative(
			RehabilitationRestrorative refRehabilitationRestrorative)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from RehabilitationRestrorative");
			session.saveOrUpdate(refRehabilitationRestrorative);
			tx.commit();

			return refRehabilitationRestrorative.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving RehabilitationRestrorative");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public RehabilitationRestrorative getRehabilitationRestrorative(int formId)
			throws MedrexException {
		RehabilitationRestrorative refRehabilitationRestrorative = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refRehabilitationRestrorative = (RehabilitationRestrorative) session
					.load(RehabilitationRestrorative.class, formId);
			refRehabilitationRestrorative.getApply();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving RehabilitationRestrorative");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refRehabilitationRestrorative;
	}

	public void deleteRehabilitationRestrorative(
			int currentRehabilitationRestrorativekey) throws MedrexException {

		RehabilitationRestrorative refRehabilitationRestrorative = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refRehabilitationRestrorative = (RehabilitationRestrorative) session
					.load(RehabilitationRestrorative.class,
							currentRehabilitationRestrorativekey);
			session.delete(refRehabilitationRestrorative);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting RehabilitationRestrorative");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
