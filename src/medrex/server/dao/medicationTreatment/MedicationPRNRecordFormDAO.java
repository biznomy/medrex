package medrex.server.dao.medicationTreatment;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.MedicationPRNRecordForm;
import medrex.commons.vo.medication.MedicationPRNRecordFormCol;
import medrex.commons.vo.medication.MedicationPRNRecordFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MedicationPRNRecordFormDAO {

	private MedicationPRNRecordFormDAO() {
	}

	private static MedicationPRNRecordFormDAO medicationPRNRecordFormDao = null;

	public static synchronized MedicationPRNRecordFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (medicationPRNRecordFormDao == null) {
			medicationPRNRecordFormDao = new MedicationPRNRecordFormDAO();

		} // end if

		return (medicationPRNRecordFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMedicationPRNRecordForm(
			MedicationPRNRecordForm mprnrf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MedicationPRNRecordForm");
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

	public synchronized List getMedicationPRNRecordForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from MedicationPRNRecordForm as ar where ar.residentId="
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

	public synchronized MedicationPRNRecordForm getMedicationPRNRecordForm(
			int serial) throws MedrexException {
		MedicationPRNRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MedicationPRNRecordForm) session.load(
					MedicationPRNRecordForm.class, serial);
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

	public synchronized void deleteMedicationPRNRecordForm(int serial)
			throws MedrexException {
		MedicationPRNRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MedicationPRNRecordForm) session.load(
					MedicationPRNRecordForm.class, serial);
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

	// / MedicationPRNRecordFormRow

	public synchronized int insertOrUpdateMedicationPRNRecordFormRow(
			MedicationPRNRecordFormRow mprnrfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MedicationPRNRecordFormRow");
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

	public synchronized MedicationPRNRecordFormRow getMedicationPRNRecordFormRow(
			int formId, int formNum) throws MedrexException {
		MedicationPRNRecordFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MedicationPRNRecordFormRow) session
					.createQuery(
							"from MedicationPRNRecordFormRow as pg2 where pg2.medicationPRNRecordFormSerial = "
									+ formId
									+ " AND pg2.medicationPRNRecordFormRowSerial = "
									+ formNum).uniqueResult();
			admissionRecord.getRxNumber();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	// / MedicationPRNRecordFormCol

	public synchronized int insertOrUpdateMedicationPRNRecordFormCol(
			MedicationPRNRecordFormCol mprnrfc) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MedicationPRNRecordFormCol");
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

	public synchronized MedicationPRNRecordFormCol getMedicationPRNRecordFormCol(
			int formId, int rowNum, int colNum) throws MedrexException {
		MedicationPRNRecordFormCol admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MedicationPRNRecordFormCol) session
					.createQuery(
							"from MedicationPRNRecordFormCol as pg2 where pg2.medicationPRNRecordFormSerial = "
									+ formId
									+ " AND pg2.medicationPRNRecordFormRowSerial = "
									+ rowNum
									+ " AND pg2.medicationPRNRecordFormColSerial = "
									+ colNum).uniqueResult();
			admissionRecord.getObs();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deleteMedicationPRNRecordFormCol(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from MedicationPRNRecordFormCol as d where d.medicationPRNRecordFormSerial= "
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

	public void deleteMedicationPRNRecordFormRow(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from MedicationPRNRecordFormRow as d where d.medicationPRNRecordFormSerial= "
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
