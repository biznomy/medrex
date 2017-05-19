package medrex.server.dao.ptOtStAct;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStTherapyPhysical;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PtOtStTherapyPhysicalDAO {

	private PtOtStTherapyPhysicalDAO() {
	}

	private static PtOtStTherapyPhysicalDAO refPtOtStTherapyPhysicalDao = null;

	public static synchronized PtOtStTherapyPhysicalDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPtOtStTherapyPhysicalDao == null) {
			refPtOtStTherapyPhysicalDao = new PtOtStTherapyPhysicalDAO();

		} // end if

		return (refPtOtStTherapyPhysicalDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtStTherapyPhysical(
			PtOtStTherapyPhysical refPtOtStTherapyPhysical)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtStTherapyPhysical");
			session.saveOrUpdate(refPtOtStTherapyPhysical);
			tx.commit();

			return refPtOtStTherapyPhysical.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PtOtStTherapyPhysical");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtStTherapyPhysicals(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PtOtStTherapyPhysical as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStTherapyPhysical List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtStTherapyPhysical getPtOtStTherapyPhysical(
			int serial) throws MedrexException {
		PtOtStTherapyPhysical refPtOtStTherapyPhysical = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStTherapyPhysical = (PtOtStTherapyPhysical) session.load(
					PtOtStTherapyPhysical.class, serial);
			refPtOtStTherapyPhysical.getComplaintsOf();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PtOtStTherapyPhysicals");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStTherapyPhysical;
	}

	public synchronized void deletePtOtStTherapyPhysical(int serial)
			throws Exception {

		PtOtStTherapyPhysical refPtOtStTherapyPhysical = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStTherapyPhysical = (PtOtStTherapyPhysical) session.load(
					PtOtStTherapyPhysical.class, serial);
			refPtOtStTherapyPhysical.getComplaintsOf();
			session.delete(refPtOtStTherapyPhysical);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting PtOtStTherapyPhysical Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
