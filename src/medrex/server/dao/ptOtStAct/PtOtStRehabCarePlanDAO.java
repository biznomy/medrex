package medrex.server.dao.ptOtStAct;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStRehabCarePlan;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PtOtStRehabCarePlanDAO {

	private PtOtStRehabCarePlanDAO() {
	}

	private static PtOtStRehabCarePlanDAO refPtOtStRehabCarePlanDao = null;

	public static synchronized PtOtStRehabCarePlanDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPtOtStRehabCarePlanDao == null) {
			refPtOtStRehabCarePlanDao = new PtOtStRehabCarePlanDAO();

		} // end if

		return (refPtOtStRehabCarePlanDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtStRehabCarePlan(
			PtOtStRehabCarePlan refPtOtStRehabCarePlan) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtStRehabCarePlan");
			session.saveOrUpdate(refPtOtStRehabCarePlan);
			tx.commit();

			return refPtOtStRehabCarePlan.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PtOtStRehabCarePlan");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtStRehabCarePlans(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PtOtStRehabCarePlan as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStRehabCarePlan List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtStRehabCarePlan getPtOtStRehabCarePlan(int serial)
			throws MedrexException {
		PtOtStRehabCarePlan refPtOtStRehabCarePlan = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStRehabCarePlan = (PtOtStRehabCarePlan) session.load(
					PtOtStRehabCarePlan.class, serial);
			refPtOtStRehabCarePlan.getCarePlanDate01();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PtOtStRehabCarePlans");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStRehabCarePlan;
	}

	public synchronized void deletePtOtStRehabCarePlan(int serial)
			throws Exception {

		PtOtStRehabCarePlan refPtOtStRehabCarePlan = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStRehabCarePlan = (PtOtStRehabCarePlan) session.load(
					PtOtStRehabCarePlan.class, serial);
			refPtOtStRehabCarePlan.getCarePlanDate01();
			session.delete(refPtOtStRehabCarePlan);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting PtOtStRehabCarePlan Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
