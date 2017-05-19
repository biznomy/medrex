package medrex.server.dao.historyPhysical;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysical;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HistoryAndPhysicalDAO {

	private HistoryAndPhysicalDAO() {
	}

	private static HistoryAndPhysicalDAO historyAndPhysicalDao = null;

	public static synchronized HistoryAndPhysicalDAO getInstance() {

		// if obj is null create it , else just return it
		if (historyAndPhysicalDao == null) {
			historyAndPhysicalDao = new HistoryAndPhysicalDAO();

		} // end if

		return (historyAndPhysicalDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateHistoryAndPhysical(
			HistoryAndPhysical consultant) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from HistoryAndPhysical");
			session.saveOrUpdate(consultant);
			tx.commit();
			return consultant.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Admissions Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getHistoryAndPhysicals(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from HistoryAndPhysical as ar where ar.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized HistoryAndPhysical getHistoryAndPhysical(int serial)
			throws MedrexException {
		HistoryAndPhysical consultant = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			consultant = (HistoryAndPhysical) session.load(
					HistoryAndPhysical.class, serial);
			consultant.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return consultant;
	}

	public synchronized void deleteHistoryAndPhysical(int serial)
			throws MedrexException {
		HistoryAndPhysical consultant = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			consultant = (HistoryAndPhysical) session.load(
					HistoryAndPhysical.class, serial);
			consultant.getNotes();
			session.delete(consultant);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
