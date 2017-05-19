package medrex.server.dao.consultant;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.consultant.PharmacistEvaluationReportForm;
import medrex.commons.vo.consultant.PharmacistEvaluationReportFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PharmacistEvaluationReportFormDAO {

	private PharmacistEvaluationReportFormDAO() {
	}

	private static PharmacistEvaluationReportFormDAO pharmacistEvaluationREportFormDao = null;

	public static synchronized PharmacistEvaluationReportFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (pharmacistEvaluationREportFormDao == null) {
			pharmacistEvaluationREportFormDao = new PharmacistEvaluationReportFormDAO();

		} // end if

		return (pharmacistEvaluationREportFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePharmacistEvaluationReportForm(
			PharmacistEvaluationReportForm perf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PharmacistEvaluationReportForm");
			session.saveOrUpdate(perf);
			tx.commit();
			return perf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPharmacistEvaluationReportForms(
			int residentSerial) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PharmacistEvaluationReportForm as ar where ar.residentId="
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

	public synchronized PharmacistEvaluationReportForm getPharmacistEvaluationReportForm(
			int serial) throws MedrexException {
		PharmacistEvaluationReportForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (PharmacistEvaluationReportForm) session.load(
					PharmacistEvaluationReportForm.class, serial);
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

	public synchronized void deletePharmacistEvaluationReportForm(int serial)
			throws MedrexException {
		PharmacistEvaluationReportForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (PharmacistEvaluationReportForm) session.load(
					PharmacistEvaluationReportForm.class, serial);
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

	// / PharmacistEvaluationReportFormRow

	public synchronized int insertOrUpdatePharmacistEvaluationReportFormRow(
			PharmacistEvaluationReportFormRow perfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PharmacistEvaluationReportFormRow");
			session.saveOrUpdate(perfr);
			tx.commit();
			return perfr.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized int insertOrUpdatePharmacistEvaluationReportFormRows(
			List iperfr) throws MedrexException {
		Iterator i = iperfr.iterator();
		while (i.hasNext()) {
			PharmacistEvaluationReportFormRow Prow = (PharmacistEvaluationReportFormRow) i
					.next();
			insertOrUpdatePharmacistEvaluationReportFormRow(Prow);
		}
		return 0;
	}

	public synchronized PharmacistEvaluationReportFormRow getPharmacistEvaluationReportFormRow(
			int formId, int formNum) throws MedrexException {
		PharmacistEvaluationReportFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (PharmacistEvaluationReportFormRow) session
					.createQuery(
							"from PharmacistEvaluationReportFormRow as pg2 where pg2.pharmacistEvaluationReportFormSerial = "
									+ formId
									+ " AND pg2.pharmacistEvaluationReportRowSerial = "
									+ formNum).uniqueResult();
			admissionRecord.getPharmacistEvaluationReportFormSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized List getPharmacistEvaluationReportFormRows(int formId)
			throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session
					.createQuery(
							"from PharmacistEvaluationReportFormRow as pg2 where pg2.pharmacistEvaluationReportFormSerial="
									+ formId
									+ " order by pg2.pharmacistEvaluationReportRowSerial")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PharmacistEvaluationReport ");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

}
