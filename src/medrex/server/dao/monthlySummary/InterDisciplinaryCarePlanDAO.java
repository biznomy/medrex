package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.InterDisciplinaryCarePlan;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class InterDisciplinaryCarePlanDAO {
	private InterDisciplinaryCarePlanDAO() {

	}

	private static InterDisciplinaryCarePlanDAO interDisciplinaryDAO = null;

	public static synchronized InterDisciplinaryCarePlanDAO getInstance() {

		// if obj is null create it , else just return it
		if (interDisciplinaryDAO == null) {
			interDisciplinaryDAO = new InterDisciplinaryCarePlanDAO();

		} // end if

		return (interDisciplinaryDAO);

	}

	public synchronized int insertOrUpdateInterDisciplinaryForm(
			InterDisciplinaryCarePlan interDsc) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from InterDisciplinaryCarePlan");
			interDsc = (InterDisciplinaryCarePlan) session.merge(interDsc);
			int serial = interDsc.getSerial();
			tx.commit();
			return serial;
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving InterDisciplinaryCarePlan");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized InterDisciplinaryCarePlan getInterDisciplinaryForm(
			int formId) throws MedrexException {
		InterDisciplinaryCarePlan interDisciplinaryForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			interDisciplinaryForm = (InterDisciplinaryCarePlan) session
					.createCriteria(InterDisciplinaryCarePlan.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();

			interDisciplinaryForm.getSerial();
			if (interDisciplinaryForm != null
					&& interDisciplinaryForm.getInterDisciplinaryRow() != null) {
				interDisciplinaryForm.getInterDisciplinaryRow().iterator();
				interDisciplinaryForm.getSerial();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving InterDisciplinaryCarePlan");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return interDisciplinaryForm;
	}

	public synchronized void deleteInterDisciplinaryCarePlanForm(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		InterDisciplinaryCarePlan interDisciplinaryForm = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// session.createSQLQuery("delete from msjn where formId = "+formId);
			interDisciplinaryForm = (InterDisciplinaryCarePlan) session
					.createCriteria(InterDisciplinaryCarePlan.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();
			session.delete(interDisciplinaryForm);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error deleting InterDisciplinaryCarePlan");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
