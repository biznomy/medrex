package medrex.server.dao.census;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusNotes;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CensusNotesDAO {

	private CensusNotesDAO() {
	}

	private static CensusNotesDAO refDao = null;

	public static synchronized CensusNotesDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDao == null) {
			refDao = new CensusNotesDAO();

		} // end if

		return (refDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateCensusNotes(CensusNotes refCensusNotes)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from CensusNotes");
			session.saveOrUpdate(refCensusNotes);
			tx.commit();
			return refCensusNotes.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Admissions Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getCensusNotesForStatus(int statusid)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createQuery(
					"from CensusNotes as ar where ar.statusid=" + statusid)
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CensusNotes getCensusNotes(int serial)
			throws MedrexException {

		CensusNotes ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (CensusNotes) session.load(CensusNotes.class, serial);
			ref.getNotes();
			tx.commit();
			return ref;
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Lab Special Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
