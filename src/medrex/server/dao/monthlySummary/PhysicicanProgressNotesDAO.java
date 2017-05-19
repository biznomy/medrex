package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.PhysicianProgressNotes;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PhysicicanProgressNotesDAO {
	private PhysicicanProgressNotesDAO() {

	}

	private static PhysicicanProgressNotesDAO physicianProgressNotesDao = null;

	public static synchronized PhysicicanProgressNotesDAO getInstance() {

		// if obj is null create it , else just return it
		if (physicianProgressNotesDao == null) {
			physicianProgressNotesDao = new PhysicicanProgressNotesDAO();

		} // end if

		return (physicianProgressNotesDao);

	}

	public synchronized int insertOrUpdatePhysicianProgressNotes(
			PhysicianProgressNotes refPhysicianProgressNotes)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from PhysicianProgressNotes");
			session.saveOrUpdate(refPhysicianProgressNotes);
			tx.commit();
			return refPhysicianProgressNotes.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PhysicianProgressNotes");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public PhysicianProgressNotes getPhysicianProgressNotes(
			int currentMonthlySummaryRecordKey) throws MedrexException {
		PhysicianProgressNotes physicianProgressNotes = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			physicianProgressNotes = (PhysicianProgressNotes) session
					.createCriteria(PhysicianProgressNotes.class).add(
							Restrictions.eq("formId",
									currentMonthlySummaryRecordKey))
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving physicianProgressNotes");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return physicianProgressNotes;
	}

	public void deletePhysicalProgressNotes(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		PhysicianProgressNotes physicianProgressNotes = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// session.createSQLQuery("delete from msjn where formId = "+formId);
			physicianProgressNotes = (PhysicianProgressNotes) session
					.createCriteria(PhysicianProgressNotes.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();
			session.delete(physicianProgressNotes);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error deleting physicianProgressNotes");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
