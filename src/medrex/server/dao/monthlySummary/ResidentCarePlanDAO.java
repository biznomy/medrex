package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.ResidentCarePlan;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ResidentCarePlanDAO {
	private ResidentCarePlanDAO() {

	}

	private static ResidentCarePlanDAO residentCarePlanDAO = null;

	public static synchronized ResidentCarePlanDAO getInstance() {

		// if obj is null create it , else just return it
		if (residentCarePlanDAO == null) {
			residentCarePlanDAO = new ResidentCarePlanDAO();

		} // end if

		return (residentCarePlanDAO);

	}

	public synchronized int insertOrUpdateResidentCarePlan(
			ResidentCarePlan residentCarePlan) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from ResidentCarePlan");
			session.saveOrUpdate(residentCarePlan);
			tx.commit();
			return residentCarePlan.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ResidentCarePlan");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentCarePlan getResidentCarePlan(int formId)
			throws MedrexException {
		ResidentCarePlan residentCarePlan = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentCarePlan = (ResidentCarePlan) session.createCriteria(
					ResidentCarePlan.class).add(
					Restrictions.eq("formId", formId)).uniqueResult();

			residentCarePlan.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResidentCarePlan");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return residentCarePlan;
	}

	public synchronized void deleteResidentCarePlan(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		ResidentCarePlan residentCarePlan = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			residentCarePlan = (ResidentCarePlan) session.createCriteria(
					ResidentCarePlan.class).add(
					Restrictions.eq("formId", formId)).uniqueResult();
			session.delete(residentCarePlan);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error deleting ResidentCarePlan");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
