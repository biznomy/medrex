package medrex.server.dao.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.ProgressNotes2;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PanelProgressNotesDAO {

	private PanelProgressNotesDAO() {
	}

	private static PanelProgressNotesDAO panelProgressNotesDao = null;

	public static synchronized PanelProgressNotesDAO getInstance() {

		// if obj is null create it , else just return it
		if (panelProgressNotesDao == null) {
			panelProgressNotesDao = new PanelProgressNotesDAO();

		} // end if

		return (panelProgressNotesDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePanelProgressNotes(
			ProgressNotes2 refpanelProgressNotes) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from ProgressNotes2");
			session.saveOrUpdate(refpanelProgressNotes);
			tx.commit();

			return refpanelProgressNotes.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error ProgressNotes2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPanelProgressNotes(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ProgressNotes2 as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ProgressNotes2 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	// public synchronized List getPanelProgressNotes()
	// throws MedrexException {
	// List result = null;
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	//
	// tx = session.beginTransaction();
	// result =
	// session.createQuery("from ProgressNotes2 as ls group by ls.residentId").list();
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error retrieving ProgressNotes2 List");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return result;
	// }

	public synchronized ProgressNotes2 getPanelProgressNote(int serial)
			throws MedrexException {
		ProgressNotes2 refPanelProgressNotes = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPanelProgressNotes = (ProgressNotes2) session.load(
					ProgressNotes2.class, serial);
			refPanelProgressNotes.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ProgressNotes2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPanelProgressNotes;
	}

	public synchronized void deletePanelProgressNotes(int serial)
			throws Exception {

		ProgressNotes2 refPanelProgressNotes = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPanelProgressNotes = (ProgressNotes2) session.load(
					ProgressNotes2.class, serial);
			refPanelProgressNotes.getFrequency();
			session.delete(refPanelProgressNotes);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting ProgressNotes2 Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
