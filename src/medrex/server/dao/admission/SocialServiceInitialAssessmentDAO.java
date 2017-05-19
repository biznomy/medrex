package medrex.server.dao.admission;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.SocialServiceInitialAssessmentFormPage1;
import medrex.commons.vo.admission.SocialServiceInitialAssessmentFormPage2;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class SocialServiceInitialAssessmentDAO {

	private SocialServiceInitialAssessmentDAO() {
	}

	private static SocialServiceInitialAssessmentDAO socialServiceInitialAssessmentDAO = null;

	public static synchronized SocialServiceInitialAssessmentDAO getInstance() {

		if (socialServiceInitialAssessmentDAO == null) {
			socialServiceInitialAssessmentDAO = new SocialServiceInitialAssessmentDAO();
		}
		return (socialServiceInitialAssessmentDAO);
	}

	public synchronized int insertOrUpdateSocialServiceInitialAssessmentFormPage1(
			SocialServiceInitialAssessmentFormPage1 refSocialServiceForm1)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from SocialServiceInitialAssessmentFormPage1");
			session.saveOrUpdate(refSocialServiceForm1);
			tx.commit();
			return refSocialServiceForm1.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving SocialServiceInitialAssessmentFormPage1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized int insertOrUpdateSocialServiceInitialAssessmentFormPage2(
			SocialServiceInitialAssessmentFormPage2 refSocialServiceForm2)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from SocialServiceInitialAssessmentFormPage2");
			session.saveOrUpdate(refSocialServiceForm2);
			tx.commit();
			return refSocialServiceForm2.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving SocialServiceInitialAssessmentFormPage2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized SocialServiceInitialAssessmentFormPage1 getSocialServiceInitialAssessmentFormPage1(
			int serial) throws MedrexException {
		SocialServiceInitialAssessmentFormPage1 assessmentRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			assessmentRecord = (SocialServiceInitialAssessmentFormPage1) session
					.createQuery(
							"from SocialServiceInitialAssessmentFormPage1 as pg2 where pg2.serial = "
									+ serial).uniqueResult();
			if (assessmentRecord != null) {
				assessmentRecord.getAdmittedFrom();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving SocialServiceInitialAssessmentFormPage1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return assessmentRecord;
	}

	public synchronized SocialServiceInitialAssessmentFormPage2 getSocialServiceInitialAssessmentFormPage2(
			int formId) throws MedrexException {
		SocialServiceInitialAssessmentFormPage2 assessmentRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			assessmentRecord = (SocialServiceInitialAssessmentFormPage2) session
					.createQuery(
							"from SocialServiceInitialAssessmentFormPage2 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			if (assessmentRecord != null) {
				assessmentRecord.getSerial();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving SocialServiceInitialAssessmentFormPage2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return assessmentRecord;
	}

	public void deleteSocialServiceInitialAssessmentFormPage1(int serial)
			throws MedrexException {
		SocialServiceInitialAssessmentFormPage1 assessmentRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			assessmentRecord = (SocialServiceInitialAssessmentFormPage1) session
					.createCriteria(
							SocialServiceInitialAssessmentFormPage1.class).add(
							Restrictions.eq("serial", serial)).uniqueResult();
			assessmentRecord.getAdmittedFrom();
			session.delete(assessmentRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting SocialServiceInitialAssessmentFormPage1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public void deleteSocialServiceInitialAssessmentFormPage2(int serial)
			throws MedrexException {
		SocialServiceInitialAssessmentFormPage2 assessmentRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			assessmentRecord = (SocialServiceInitialAssessmentFormPage2) session
					.createCriteria(
							SocialServiceInitialAssessmentFormPage2.class).add(
							Restrictions.eq("formId", serial)).uniqueResult();
			assessmentRecord.getFormId();
			session.delete(assessmentRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting SocialServiceInitialAssessmentFormPage2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
}
