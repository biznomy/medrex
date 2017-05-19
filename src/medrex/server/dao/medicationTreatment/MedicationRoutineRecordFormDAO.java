package medrex.server.dao.medicationTreatment;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.MedicationRoutineRecordForm;
import medrex.commons.vo.medication.MedicationRoutineRecordFormCol;
import medrex.commons.vo.medication.MedicationRoutineRecordFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MedicationRoutineRecordFormDAO {

	private MedicationRoutineRecordFormDAO() {
	}

	private static MedicationRoutineRecordFormDAO medicationRoutineRecordFormDao = null;

	public static synchronized MedicationRoutineRecordFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (medicationRoutineRecordFormDao == null) {
			medicationRoutineRecordFormDao = new MedicationRoutineRecordFormDAO();

		} // end if

		return (medicationRoutineRecordFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMedicationRoutineRecordForm(
			MedicationRoutineRecordForm mprnrf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MedicationRoutineRecordForm");
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

	public synchronized List getMedicationRoutineRecordForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from MedicationRoutineRecordForm as ar where ar.residentId="
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

	public synchronized MedicationRoutineRecordForm getMedicationRoutineRecordForm(
			int serial) throws MedrexException {
		MedicationRoutineRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MedicationRoutineRecordForm) session.load(
					MedicationRoutineRecordForm.class, serial);
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

	public synchronized void deleteMedicationRoutineRecordForm(int serial)
			throws MedrexException {
		MedicationRoutineRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MedicationRoutineRecordForm) session.load(
					MedicationRoutineRecordForm.class, serial);
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

	// / MedicationRoutineRecordFormRow

	public synchronized int insertOrUpdateMedicationRoutineRecordFormRow(
			MedicationRoutineRecordFormRow mprnrfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MedicationRoutineRecordFormRow");
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

	public synchronized MedicationRoutineRecordFormRow getMedicationRoutineRecordFormRow(
			int formId, int formNum) throws MedrexException {
		MedicationRoutineRecordFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MedicationRoutineRecordFormRow) session
					.createQuery(
							"from MedicationRoutineRecordFormRow as pg2 where pg2.medicationRoutineRecordFormSerial = "
									+ formId
									+ " AND pg2.medicationRoutineRecordFormRowSerial = "
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

	// / MedicationRoutineRecordFormCol

	public synchronized int insertOrUpdateMedicationRoutineRecordFormCol(
			MedicationRoutineRecordFormCol mprnrfc) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MedicationRoutineRecordFormCol");
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

	public synchronized MedicationRoutineRecordFormCol getMedicationRoutineRecordFormCol(
			int formId, int rowNum, int colNum) throws MedrexException {
		MedicationRoutineRecordFormCol admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MedicationRoutineRecordFormCol) session
					.createQuery(
							"from MedicationRoutineRecordFormCol as pg2 where pg2.medicationRoutineRecordFormSerial = "
									+ formId
									+ " AND pg2.medicationRoutineRecordFormRowSerial = "
									+ rowNum
									+ " AND pg2.medicationRoutineRecordFormColSerial = "
									+ colNum).uniqueResult();
			admissionRecord.getContent2();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deleteMedicationRoutineRecordFormCol(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from MedicationRoutineRecordFormCol as d where d.medicationRoutineRecordFormSerial= "
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

	public void deleteMedicationRoutineRecordFormRow(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from MedicationRoutineRecordFormRow as d where d.medicationRoutineRecordFormSerial= "
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
