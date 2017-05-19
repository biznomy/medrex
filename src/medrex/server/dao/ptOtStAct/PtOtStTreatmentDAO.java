package medrex.server.dao.ptOtStAct;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStTreatment;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PtOtStTreatmentDAO {

	private PtOtStTreatmentDAO() {
	}

	private static PtOtStTreatmentDAO refPtOtStTreatmentDao = null;

	public static synchronized PtOtStTreatmentDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPtOtStTreatmentDao == null) {
			refPtOtStTreatmentDao = new PtOtStTreatmentDAO();

		} // end if

		return (refPtOtStTreatmentDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtStTreatment(
			PtOtStTreatment refPtOtStTreatment) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtStTreatment");
			session.saveOrUpdate(refPtOtStTreatment);
			tx.commit();

			return refPtOtStTreatment.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PtOtStTreatment");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtStTreatments(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PtOtStTreatment as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PtOtStTreatment List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtStTreatment getPtOtStTreatment(int serial)
			throws MedrexException {
		PtOtStTreatment refPtOtStTreatment = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStTreatment = (PtOtStTreatment) session.load(
					PtOtStTreatment.class, serial);
			refPtOtStTreatment.getDoctor();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PtOtStTreatments");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStTreatment;
	}

	public synchronized void deletePtOtStTreatment(int serial) throws Exception {

		PtOtStTreatment refPtOtStTreatment = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStTreatment = (PtOtStTreatment) session.load(
					PtOtStTreatment.class, serial);
			refPtOtStTreatment.getDoctor();
			session.delete(refPtOtStTreatment);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting PtOtStTreatment Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
