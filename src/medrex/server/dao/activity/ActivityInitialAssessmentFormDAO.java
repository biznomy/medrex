package medrex.server.dao.activity;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.activity.ActivityInitialAssessmentFormPage1;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ActivityInitialAssessmentFormDAO {

	private ActivityInitialAssessmentFormDAO() {
	}

	private static ActivityInitialAssessmentFormDAO activityInitialAssessmentFormDao = null;

	public static synchronized ActivityInitialAssessmentFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (activityInitialAssessmentFormDao == null) {
			activityInitialAssessmentFormDao = new ActivityInitialAssessmentFormDAO();

		} // end if

		return (activityInitialAssessmentFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateActivityInitialAssessmentFormPage1(
			ActivityInitialAssessmentFormPage1 aiassmnt1)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ActivityInitialAssessmentFormPage1");
			session.saveOrUpdate(aiassmnt1);
			tx.commit();
			return aiassmnt1.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getActivityInitialAssessmentFormPage1s(
			int residentSerial) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ActivityInitialAssessmentFormPage1 as ar where ar.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ActivityInitialAssessmentFormPage1 getActivityInitialAssessmentFormPage1(
			int serial) throws MedrexException {
		ActivityInitialAssessmentFormPage1 activityRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			activityRecord = (ActivityInitialAssessmentFormPage1) session.load(
					ActivityInitialAssessmentFormPage1.class, serial);
			activityRecord.getAllergies();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return activityRecord;
	}

	public synchronized void deleteActivityInitialAssessmentFormPage1(int serial)
			throws MedrexException {
		ActivityInitialAssessmentFormPage1 activityRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			activityRecord = (ActivityInitialAssessmentFormPage1) session.load(
					ActivityInitialAssessmentFormPage1.class, serial);
			activityRecord.getAllergies();
			session.delete(activityRecord);
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
