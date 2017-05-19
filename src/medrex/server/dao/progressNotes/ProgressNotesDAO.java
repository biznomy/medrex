package medrex.server.dao.progressNotes;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.progressNotes.ProgressNotes;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ProgressNotesDAO {

	private ProgressNotesDAO() {
	}

	private static ProgressNotesDAO progressNotesDao = null;

	public static synchronized ProgressNotesDAO getInstance() {

		// if obj is null create it , else just return it
		if (progressNotesDao == null) {
			progressNotesDao = new ProgressNotesDAO();

		} // end if

		return (progressNotesDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateProgressNotes(
			ProgressNotes residentPayer) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ProgressNotes");
			session.saveOrUpdate(residentPayer);
			tx.commit();
			return residentPayer.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Activitys Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getProgressNotess(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ProgressNotes as ar where ar.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Activitys Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ProgressNotes getProgressNotes(int serial)
			throws MedrexException {
		ProgressNotes activityRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// activityRecord = (ProgressNotes)
			// session.load(ProgressNotes.class,
			// serial);
			activityRecord = (ProgressNotes) session.createCriteria(
					ProgressNotes.class).add(Restrictions.eq("serial", serial))
					.uniqueResult();
			activityRecord.getStatus();
			;
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Resident progress notes");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return activityRecord;
	}

	public synchronized void deleteProgressNotes(int serial)
			throws MedrexException {
		ProgressNotes activityRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			activityRecord = (ProgressNotes) session.load(ProgressNotes.class,
					serial);
			activityRecord.getNotes();
			session.delete(activityRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void deleteProgressNotes2(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery(
					"delete from ProgressNotes2 as p2 where p2.serial="
							+ formId).executeUpdate();
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
