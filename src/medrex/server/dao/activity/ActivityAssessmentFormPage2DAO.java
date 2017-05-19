package medrex.server.dao.activity;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.activity.ActivityAssessmentFormPage2;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ActivityAssessmentFormPage2DAO {

	private ActivityAssessmentFormPage2DAO() {
	}

	private static ActivityAssessmentFormPage2DAO reflActivityAssessmentFormPage2Dao = null;

	public static synchronized ActivityAssessmentFormPage2DAO getInstance() {

		// if obj is null create it , else just return it
		if (reflActivityAssessmentFormPage2Dao == null) {
			reflActivityAssessmentFormPage2Dao = new ActivityAssessmentFormPage2DAO();

		} // end if

		return (reflActivityAssessmentFormPage2Dao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateActivityAssessmentFormPage2(
			ActivityAssessmentFormPage2 reflActivityAssessmentFormPage2)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from ActivityAssessmentFormPage2");
			session.saveOrUpdate(reflActivityAssessmentFormPage2);
			tx.commit();
			return reflActivityAssessmentFormPage2.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving ActivityAssessmentFormPage2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getActivityAssessmentFormPage2s(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ActivityAssessmentFormPage2 as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ActivityAssessmentFormPage2 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ActivityAssessmentFormPage2 getActivityAssessmentFormPage2(
			int formId) throws MedrexException {
		ActivityAssessmentFormPage2 reflActivityAssessmentFormPage2 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			/*
			 * tx = session.beginTransaction(); reflActivityAssessmentFormPage2
			 * = (ActivityAssessmentFormPage2) session
			 * .load(ActivityAssessmentFormPage2.class, formId);
			 * reflActivityAssessmentFormPage2.getCommCategory(); tx.commit();
			 */

			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(
					ActivityAssessmentFormPage2.class).add(
					Restrictions.eq("formId", formId));
			reflActivityAssessmentFormPage2 = (ActivityAssessmentFormPage2) crit
					.setMaxResults(1).uniqueResult();
			reflActivityAssessmentFormPage2.getFormId();
			// System.out.println("Page 2 is:"+reflActivityAssessmentFormPage2);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ActivityAssessmentFormPage2s");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return reflActivityAssessmentFormPage2;
	}

	public synchronized void deleteActivityAssessmentFormPage2(int formId)
			throws Exception {

		ActivityAssessmentFormPage2 reflActivityAssessmentFormPage2 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			/*
			 * reflActivityAssessmentFormPage2 = (ActivityAssessmentFormPage2)
			 * session .load(ActivityAssessmentFormPage2.class, formId);
			 * reflActivityAssessmentFormPage2.getCommentsArea();
			 */

			Criteria crit = session.createCriteria(
					ActivityAssessmentFormPage2.class).add(
					Restrictions.eq("formId", formId));
			reflActivityAssessmentFormPage2 = (ActivityAssessmentFormPage2) crit
					.setMaxResults(1).uniqueResult();

			reflActivityAssessmentFormPage2.getSerial();
			session.delete(reflActivityAssessmentFormPage2);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception(
					"Error deleting ActivityAssessmentFormPage2 Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
