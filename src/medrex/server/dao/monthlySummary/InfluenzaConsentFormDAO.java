package medrex.server.dao.monthlySummary;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.InfluenzaConsentForm;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class InfluenzaConsentFormDAO {

	private InfluenzaConsentFormDAO() {
	}

	private static InfluenzaConsentFormDAO refInfluenzaConsentFormDao = null;

	public static synchronized InfluenzaConsentFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (refInfluenzaConsentFormDao == null) {
			refInfluenzaConsentFormDao = new InfluenzaConsentFormDAO();

		} // end if

		return (refInfluenzaConsentFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateInfluenzaConsentForm(
			InfluenzaConsentForm refInfluenzaConsentForm)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from InfluenzaConsentForm");
			session.saveOrUpdate(refInfluenzaConsentForm);
			tx.commit();

			return refInfluenzaConsentForm.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving InfluenzaConsentForm");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<InfluenzaConsentForm> getInfluenzaConsentForms(
			int residentSerial) throws MedrexException {
		List<InfluenzaConsentForm> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from InfluenzaConsentForm as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving InfluenzaConsentForm List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized InfluenzaConsentForm getInfluenzaConsentForm(int formId)
			throws MedrexException {
		InfluenzaConsentForm refInfluenzaConsentForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refInfluenzaConsentForm = (InfluenzaConsentForm) session
					.createCriteria(InfluenzaConsentForm.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();
			refInfluenzaConsentForm.getDateCalled();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving InfluenzaConsentForm");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refInfluenzaConsentForm;
	}

	public synchronized void deleteInfluenzaConsentForm(int formId)
			throws MedrexException {

		InfluenzaConsentForm refInfluenzaConsentForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refInfluenzaConsentForm = (InfluenzaConsentForm) session
					.createCriteria(InfluenzaConsentForm.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();
			refInfluenzaConsentForm.getDateTimeGiven();
			session.delete(refInfluenzaConsentForm);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting InfluenzaConsentForm Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
