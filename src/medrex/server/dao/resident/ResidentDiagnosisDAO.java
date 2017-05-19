package medrex.server.dao.resident;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ResidentDiagnosisDAO {

	private ResidentDiagnosisDAO() {
	}

	private static ResidentDiagnosisDAO refResidentDiagnosisDao = null;

	public static synchronized ResidentDiagnosisDAO getInstance() {

		// if obj is null create it , else just return it
		if (refResidentDiagnosisDao == null) {
			refResidentDiagnosisDao = new ResidentDiagnosisDAO();

		} // end if

		return (refResidentDiagnosisDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateResidentDiagnosis(
			ResidentDiagnosis refResidentDiagnosis) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from ResidentDiagnosis");
			session.saveOrUpdate(refResidentDiagnosis);
			tx.commit();

			return refResidentDiagnosis.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ResidentDiagnosis");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getResidentDiagnosiss(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ResidentDiagnosis as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResidentDiagnosis List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ResidentDiagnosis getResidentDiagnosis(int serial)
			throws MedrexException {
		ResidentDiagnosis refResidentDiagnosis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentDiagnosis = (ResidentDiagnosis) session.load(
					ResidentDiagnosis.class, serial);
			refResidentDiagnosis.getName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResidentDiagnosiss");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refResidentDiagnosis;
	}

	public synchronized void deleteResidentDiagnosis(int serial)
			throws Exception {

		ResidentDiagnosis refResidentDiagnosis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentDiagnosis = (ResidentDiagnosis) session.load(
					ResidentDiagnosis.class, serial);
			refResidentDiagnosis.getName();
			session.delete(refResidentDiagnosis);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting ResidentDiagnosis Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
