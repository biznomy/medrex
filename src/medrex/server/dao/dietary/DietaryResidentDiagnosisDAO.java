package medrex.server.dao.dietary;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.DietaryResidentDiagnosis;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DietaryResidentDiagnosisDAO {

	private DietaryResidentDiagnosisDAO() {
	}

	private static DietaryResidentDiagnosisDAO refDietaryResidentDiagnosisDao = null;

	public static synchronized DietaryResidentDiagnosisDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDietaryResidentDiagnosisDao == null) {
			refDietaryResidentDiagnosisDao = new DietaryResidentDiagnosisDAO();

		} // end if

		return (refDietaryResidentDiagnosisDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateDietaryResidentDiagnosis(
			DietaryResidentDiagnosis refDietaryResidentDiagnosis)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from DietaryResidentDiagnosis");
			session.saveOrUpdate(refDietaryResidentDiagnosis);
			tx.commit();

			return refDietaryResidentDiagnosis.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving DietaryResidentDiagnosis");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getDietaryResidentDiagnosiss(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from DietaryResidentDiagnosis as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving DietaryResidentDiagnosis List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized DietaryResidentDiagnosis getDietaryResidentDiagnosis(
			int serial) throws MedrexException {
		DietaryResidentDiagnosis refDietaryResidentDiagnosis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refDietaryResidentDiagnosis = (DietaryResidentDiagnosis) session
					.load(DietaryResidentDiagnosis.class, serial);
			refDietaryResidentDiagnosis.getAge();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving DietaryResidentDiagnosiss");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refDietaryResidentDiagnosis;
	}

	public synchronized void deleteDietaryResidentDiagnosis(int serial)
			throws Exception {

		DietaryResidentDiagnosis refDietaryResidentDiagnosis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refDietaryResidentDiagnosis = (DietaryResidentDiagnosis) session
					.load(DietaryResidentDiagnosis.class, serial);
			refDietaryResidentDiagnosis.getAge();
			session.delete(refDietaryResidentDiagnosis);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception(
					"Error deleting DietaryResidentDiagnosis Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
