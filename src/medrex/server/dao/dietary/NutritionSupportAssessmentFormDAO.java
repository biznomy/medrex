package medrex.server.dao.dietary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.NutritionSupportAssessmentFormPage1;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class NutritionSupportAssessmentFormDAO {
	private NutritionSupportAssessmentFormDAO() {
	}

	private static NutritionSupportAssessmentFormDAO nutritionSupportAssessmentFormDAO = null;

	public static synchronized NutritionSupportAssessmentFormDAO getInstance() {

		if (nutritionSupportAssessmentFormDAO == null) {
			nutritionSupportAssessmentFormDAO = new NutritionSupportAssessmentFormDAO();
		}
		return (nutritionSupportAssessmentFormDAO);
	}

	public synchronized int insertOrUpdateNutritionSupportAssessmentFormPage1(
			NutritionSupportAssessmentFormPage1 refNutritionSupportAssessmentFormPage1)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from NutritionSupportAssessmentFormPage1");
			session.saveOrUpdate(refNutritionSupportAssessmentFormPage1);
			tx.commit();
			return refNutritionSupportAssessmentFormPage1.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving NutritionSupportAssessmentFormPage1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized NutritionSupportAssessmentFormPage1 getNutritionSupportAssessmentFormPage1(
			int serial) throws MedrexException {

		NutritionSupportAssessmentFormPage1 assessmentRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			assessmentRecord = (NutritionSupportAssessmentFormPage1) session
					.createQuery(
							"from NutritionSupportAssessmentFormPage1 as pg2 where pg2.serial = "
									+ serial).uniqueResult();
			if (assessmentRecord != null) {
				assessmentRecord.getSerial();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving NutritionSupportAssessmentFormPage1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return assessmentRecord;
	}

	public synchronized void deleteNutritionSupportAssessmentFormPage1(
			int formId) throws MedrexException {
		NutritionSupportAssessmentFormPage1 assessmentRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			assessmentRecord = (NutritionSupportAssessmentFormPage1) session
					.createCriteria(NutritionSupportAssessmentFormPage1.class)
					.add(Restrictions.eq("serial", formId)).uniqueResult();
			assessmentRecord.getSerial();
			session.delete(assessmentRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting NutritionSupportAssessmentFormPage1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
