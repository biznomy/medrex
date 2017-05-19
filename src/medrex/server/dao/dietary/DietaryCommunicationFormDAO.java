package medrex.server.dao.dietary;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.DietaryCommunicationForm;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DietaryCommunicationFormDAO {

	private DietaryCommunicationFormDAO() {
	}

	private static DietaryCommunicationFormDAO dietaryCommunicationFormDao = null;

	public static synchronized DietaryCommunicationFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (dietaryCommunicationFormDao == null) {
			dietaryCommunicationFormDao = new DietaryCommunicationFormDAO();

		} // end if

		return (dietaryCommunicationFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateDietaryCommunicationForm(
			DietaryCommunicationForm dcf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from DietaryCommunicationForm");
			session.saveOrUpdate(dcf);
			tx.commit();
			return dcf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getDietaryCommunicationForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from DietaryCommunicationForm as ar where ar.residentId="
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

	public synchronized DietaryCommunicationForm getDietaryCommunicationForm(
			int serial) throws MedrexException {
		DietaryCommunicationForm dietaryCommunicationForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			dietaryCommunicationForm = (DietaryCommunicationForm) session.load(
					DietaryCommunicationForm.class, serial);
			dietaryCommunicationForm.getDietitian();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return dietaryCommunicationForm;
	}

	public synchronized void deleteDietaryCommunicationForm(int formId)
			throws MedrexException {
		DietaryCommunicationForm dietaryCommunicationForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// dietaryCommunicationForm = (DietaryCommunicationForm)
			// session.load(
			// DietaryCommunicationForm.class, serial);

			dietaryCommunicationForm = (DietaryCommunicationForm) session
					.createCriteria(DietaryCommunicationForm.class).add(
							Restrictions.eq("serial", formId)).uniqueResult();
			dietaryCommunicationForm.getDecubitis();
			session.delete(dietaryCommunicationForm);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Dietary communication form.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
