package medrex.server.dao.admission;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.AdmissionsRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdmissionsRecordDAO {

	private AdmissionsRecordDAO() {
	}

	private static AdmissionsRecordDAO admissionsRecordDao = null;

	public static synchronized AdmissionsRecordDAO getInstance() {

		// if obj is null create it , else just return it
		if (admissionsRecordDao == null) {
			admissionsRecordDao = new AdmissionsRecordDAO();

		} // end if

		return (admissionsRecordDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateAdmissionsRecord(
			AdmissionsRecord residentPayer) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from AdmissionsRecord");
			session.saveOrUpdate(residentPayer);

			tx.commit();
			return residentPayer.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Admissions Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getAdmissionsRecords(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from AdmissionsRecord as ar where ar.residentId="
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

	public synchronized AdmissionsRecord getAdmissionsRecord(int serial)
			throws MedrexException {
		AdmissionsRecord admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (AdmissionsRecord) session.load(
					AdmissionsRecord.class, serial);
			admissionRecord.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteAdmissionsRecord(int serial)
			throws MedrexException {
		AdmissionsRecord admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (AdmissionsRecord) session.load(
					AdmissionsRecord.class, serial);
			admissionRecord.getNotes();
			session.delete(admissionRecord);
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
