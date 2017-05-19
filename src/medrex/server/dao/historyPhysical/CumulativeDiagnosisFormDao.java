package medrex.server.dao.historyPhysical;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisForm;
import medrex.commons.vo.historyAndPhysical.CumulativeDiagnosisFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CumulativeDiagnosisFormDao {

	private String formNum;

	private CumulativeDiagnosisFormDao() {
	}

	private static CumulativeDiagnosisFormDao cumulativeDiagnosisFormDao = null;

	public static synchronized CumulativeDiagnosisFormDao getInstance() {

		// if obj is null create it , else just return it
		if (cumulativeDiagnosisFormDao == null) {
			cumulativeDiagnosisFormDao = new CumulativeDiagnosisFormDao();

		} // end if

		return (cumulativeDiagnosisFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateCumulativeDiagnosisForm(
			CumulativeDiagnosisForm cdf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from CumulativeDiagnosisForm");
			session.saveOrUpdate(cdf);
			tx.commit();
			return cdf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getCumulativeDiagnosisForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from CumulativeDiagnosisForm as ar where ar.residentId="
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

	public synchronized CumulativeDiagnosisForm getCumulativeDiagnosisForm(
			int serial) throws MedrexException {
		CumulativeDiagnosisForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (CumulativeDiagnosisForm) session.load(
					CumulativeDiagnosisForm.class, serial);
			admissionRecord.getResidentId();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteCumulativeDiagnosisForm(int serial)
			throws MedrexException {
		CumulativeDiagnosisForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (CumulativeDiagnosisForm) session.load(
					CumulativeDiagnosisForm.class, serial);
			admissionRecord.getResidentId();
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

	// / nurseMedicationNotesFormRow

	public synchronized int insertOrUpdateCumulativeDiagnosisFormRow(
			CumulativeDiagnosisFormRow cdfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from CumulativeDiagnosisFormRow");
			session.saveOrUpdate(cdfr);
			tx.commit();
			return cdfr.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized CumulativeDiagnosisFormRow getCumulativeDiagnosisFormRow(
			int formId, int rowId) throws MedrexException {
		CumulativeDiagnosisFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			admissionRecord = (CumulativeDiagnosisFormRow) session.createQuery(
					"from CumulativeDiagnosisFormRow as pg2 where pg2.formSerial = "
							+ formId + " AND pg2.rowSerial = " + formNum)
					.uniqueResult();
			if (admissionRecord != null) {
				admissionRecord.getData1();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized int insertOrUpdateCumulativeDiagnosisFormRows(
			List idpnfr) throws MedrexException {
		Iterator i = idpnfr.iterator();
		while (i.hasNext()) {
			CumulativeDiagnosisFormRow dRow = (CumulativeDiagnosisFormRow) i
					.next();
			insertOrUpdateCumulativeDiagnosisFormRow(dRow);
		}
		return 0;
	}

	public synchronized List getCumulativeDiagnosisFormRows(int formId)
			throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from CumulativeDiagnosisFormRow as pg2 where pg2.formSerial = "
							+ formId + " order by pg2.rowSerial").list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving CumulativeDiagnosis");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteCumulativeDiagnosisFormRow(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery(
					"delete from CumulativeDiagnosisFormRow as pg2 where pg2.formSerial = "
							+ formId).executeUpdate();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	/*
	 * public synchronized void insertOrUpdateCumulativeDiagnosisFormRow(
	 * CumulativeDiagnosisFormRow idpnfr) throws MedrexException {
	 * 
	 * Session session = SessionUtil.getInstance().getSession(); Transaction tx
	 * = null; try {
	 * 
	 * tx = session.beginTransaction();
	 * session.createQuery("from CumulativeDiagnosisFormRow");
	 * session.saveOrUpdate(idpnfr); tx.commit();
	 * 
	 * } catch (Exception e) { SessionUtil.getInstance().rollbackTx(tx, "");
	 * e.printStackTrace(); throw new
	 * MedrexException("Error CumulativeDiagnosis Form "); } finally{
	 * SessionUtil.getInstance().closeSession(session); } }
	 */

}
