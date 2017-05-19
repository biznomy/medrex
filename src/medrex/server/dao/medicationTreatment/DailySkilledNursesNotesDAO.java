package medrex.server.dao.medicationTreatment;

import java.rmi.RemoteException;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.DailySkilledNursesNotes;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DailySkilledNursesNotesDAO {
	private DailySkilledNursesNotesDAO() {
	}

	private static DailySkilledNursesNotesDAO refDailySkilledNursesNotesDao = null;

	public static synchronized DailySkilledNursesNotesDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDailySkilledNursesNotesDao == null) {
			refDailySkilledNursesNotesDao = new DailySkilledNursesNotesDAO();

		} // end if

		return (refDailySkilledNursesNotesDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateDailySkilledNursesNotes(
			DailySkilledNursesNotes refDailySkilledNursesNotes)
			throws MedrexException, RemoteException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from DailySkilledNursesNotes");
			session.saveOrUpdate(refDailySkilledNursesNotes);
			tx.commit();
			return refDailySkilledNursesNotes.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving DailySkilled Nurses Notes Form1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized DailySkilledNursesNotes getDailySkilledNursesNotes(
			int serial) throws MedrexException {
		DailySkilledNursesNotes refDailySkilledNursesNotes = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refDailySkilledNursesNotes = (DailySkilledNursesNotes) session
					.load(DailySkilledNursesNotes.class, serial);
			refDailySkilledNursesNotes.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving DailySkilledNursesNotess");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refDailySkilledNursesNotes;
	}

	public synchronized void deleteDailySkilledNursesNotes(int formId)
			throws MedrexException {
		DailySkilledNursesNotes refDailySkilledNursesNotes = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refDailySkilledNursesNotes = (DailySkilledNursesNotes) session
					.load(DailySkilledNursesNotes.class, formId);
			refDailySkilledNursesNotes.getSerial();
			session.delete(refDailySkilledNursesNotes);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting DailySkilledNursesNotes Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
}
