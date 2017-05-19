package medrex.server.dao.dietary;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.Dietary;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DietaryDAO {

	private DietaryDAO() {
	}

	private static DietaryDAO dietaryDao = null;

	public static synchronized DietaryDAO getInstance() {

		// if obj is null create it , else just return it
		if (dietaryDao == null) {
			dietaryDao = new DietaryDAO();

		} // end if

		return (dietaryDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateDietary(Dietary dietary)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from Dietary");
			session.saveOrUpdate(dietary);
			tx.commit();
			return dietary.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Admissions Record");
		} finally {
			// Global.currentDietaryKey=dietary.getSerial();

			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getDietarys(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from Dietary as ar where ar.residentId=" + residentSerial)
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

	public synchronized Dietary getDietary(int serial) throws MedrexException {
		Dietary dietary = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			dietary = (Dietary) session.load(Dietary.class, serial);
			dietary.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return dietary;
	}

	public synchronized void deleteDietary(int serial) throws MedrexException {
		Dietary dietary = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			dietary = (Dietary) session.load(Dietary.class, serial);
			dietary.getNotes();
			session.delete(dietary);
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
