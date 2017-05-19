package medrex.server.dao.ptOtStAct;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStPositioningEvaluation;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PtOtStPositioningEvaluationDAO {

	private PtOtStPositioningEvaluationDAO() {
	}

	private static PtOtStPositioningEvaluationDAO refPtOtStPositioningEvaluationDao = null;

	public static synchronized PtOtStPositioningEvaluationDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPtOtStPositioningEvaluationDao == null) {
			refPtOtStPositioningEvaluationDao = new PtOtStPositioningEvaluationDAO();

		} // end if

		return (refPtOtStPositioningEvaluationDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtStPositioningEvaluation(
			PtOtStPositioningEvaluation refPtOtStPositioningEvaluation)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtStPositioningEvaluation");
			session.saveOrUpdate(refPtOtStPositioningEvaluation);
			tx.commit();

			return refPtOtStPositioningEvaluation.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving PtOtStPositioningEvaluation");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtStPositioningEvaluations(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PtOtStPositioningEvaluation as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStPositioningEvaluation List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtStPositioningEvaluation getPtOtStPositioningEvaluation(
			int serial) throws MedrexException {
		PtOtStPositioningEvaluation refPtOtStPositioningEvaluation = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStPositioningEvaluation = (PtOtStPositioningEvaluation) session
					.load(PtOtStPositioningEvaluation.class, serial);
			refPtOtStPositioningEvaluation.getCertificationFromDate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStPositioningEvaluations");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStPositioningEvaluation;
	}

	public synchronized void deletePtOtStPositioningEvaluation(int serial)
			throws Exception {

		PtOtStPositioningEvaluation refPtOtStPositioningEvaluation = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStPositioningEvaluation = (PtOtStPositioningEvaluation) session
					.load(PtOtStPositioningEvaluation.class, serial);
			refPtOtStPositioningEvaluation.getCertificationFromDate();
			session.delete(refPtOtStPositioningEvaluation);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception(
					"Error deleting PtOtStPositioningEvaluation Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
