package medrex.server.dao.medicationTreatment;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.TreatmentPRNRecordForm;
import medrex.commons.vo.medication.TreatmentPRNRecordFormCol;
import medrex.commons.vo.medication.TreatmentPRNRecordFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TreatmentPRNRecordFormDAO {

	private TreatmentPRNRecordFormDAO() {
	}

	private static TreatmentPRNRecordFormDAO treatmentPRNRecordFormDao = null;

	public static synchronized TreatmentPRNRecordFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (treatmentPRNRecordFormDao == null) {
			treatmentPRNRecordFormDao = new TreatmentPRNRecordFormDAO();

		} // end if

		return (treatmentPRNRecordFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateTreatmentPRNRecordForm(
			TreatmentPRNRecordForm mprnrf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from TreatmentPRNRecordForm");
			session.saveOrUpdate(mprnrf);
			tx.commit();
			return mprnrf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getTreatmentPRNRecordForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from TreatmentPRNRecordForm as ar where ar.residentId="
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

	public synchronized TreatmentPRNRecordForm getTreatmentPRNRecordForm(
			int serial) throws MedrexException {
		TreatmentPRNRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (TreatmentPRNRecordForm) session.load(
					TreatmentPRNRecordForm.class, serial);
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

	public synchronized void deleteTreatmentPRNRecordForm(int serial)
			throws MedrexException {
		TreatmentPRNRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (TreatmentPRNRecordForm) session.load(
					TreatmentPRNRecordForm.class, serial);
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

	// / TreatmentPRNRecordFormRow

	public synchronized int insertOrUpdateTreatmentPRNRecordFormRow(
			TreatmentPRNRecordFormRow mprnrfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from TreatmentPRNRecordFormRow");
			session.saveOrUpdate(mprnrfr);
			tx.commit();
			return mprnrfr.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized TreatmentPRNRecordFormRow getTreatmentPRNRecordFormRow(
			int formId, int formNum) throws MedrexException {
		TreatmentPRNRecordFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (TreatmentPRNRecordFormRow) session
					.createQuery(
							"from TreatmentPRNRecordFormRow as pg2 where pg2.treatmentPRNRecordFormSerial = "
									+ formId
									+ " AND pg2.treatmentPRNRecordFormRowSerial = "
									+ formNum).uniqueResult();
			admissionRecord.getTreatmentPRN();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	// / TreatmentPRNRecordFormCol

	public synchronized int insertOrUpdateTreatmentPRNRecordFormCol(
			TreatmentPRNRecordFormCol mprnrfc) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from TreatmentPRNRecordFormCol");
			session.saveOrUpdate(mprnrfc);
			tx.commit();
			return mprnrfc.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized TreatmentPRNRecordFormCol getTreatmentPRNRecordFormCol(
			int formId, int rowNum, int colNum) throws MedrexException {
		TreatmentPRNRecordFormCol admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (TreatmentPRNRecordFormCol) session
					.createQuery(
							"from TreatmentPRNRecordFormCol as pg2 where pg2.treatmentPRNRecordFormSerial = "
									+ formId
									+ " AND pg2.treatmentPRNRecordFormRowSerial = "
									+ rowNum
									+ " AND pg2.treatmentPRNRecordFormColSerial = "
									+ colNum).uniqueResult();
			admissionRecord.getHour1();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deleteTreatmentPRNRecordFormCol(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from TreatmentPRNRecordFormCol as d where d.treatmentPRNRecordFormSerial= "
							+ formId);
			int num = q.executeUpdate();
			System.out.println("num: " + num);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void deleteTreatmentPRNRecordFormRow(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from TreatmentPRNRecordFormRow as d where d.treatmentPRNRecordFormSerial= "
							+ formId);
			int num = q.executeUpdate();
			System.out.println("num: " + num);
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
