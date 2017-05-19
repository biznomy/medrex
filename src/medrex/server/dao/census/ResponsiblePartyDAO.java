package medrex.server.dao.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.ResponsibleParty;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ResponsiblePartyDAO {
	private ResponsiblePartyDAO() {
	}

	private static ResponsiblePartyDAO refDao = null;

	public static synchronized ResponsiblePartyDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDao == null) {
			refDao = new ResponsiblePartyDAO();

		} // end if

		return (refDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateResponsibleParty(ResponsibleParty ref)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from ResponsibleParty");
			session.saveOrUpdate(ref);
			tx.commit();

			// Global.currentResponsiblePartyKey = ref.getSerial();
			return ref.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ResponsibleParty");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getResponsiblePartys(int residentId)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ResponsibleParty as ref where ref.residentId = "
							+ residentId).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResponsibleParty List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getResponsiblePartys(int residentId, String likeStr)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					" from ResponsibleParty as ref where ref.residentId="
							+ residentId + " and ref.lastName like '" + likeStr
							+ "'").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResponsibleParty List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ResponsibleParty getResponsibleParty(int serial)
			throws MedrexException {
		ResponsibleParty ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (ResponsibleParty) session.load(ResponsibleParty.class,
					serial);
			ref.getFirstName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResponsiblePartys");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized void deleteDischargeResponsibleParty(int serial)
			throws MedrexException {

		ResponsibleParty ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (ResponsibleParty) session.load(ResponsibleParty.class,
					serial);
			ref.getSerial();
			session.delete(ref);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting ResponsibleParty Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
}
