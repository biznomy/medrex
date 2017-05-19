package medrex.server.dao.medicationTreatment;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.TreatmentRoutineRecordForm;
import medrex.commons.vo.medication.TreatmentRoutineRecordFormCol;
import medrex.commons.vo.medication.TreatmentRoutineRecordFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TreatmentRoutineRecordFormDAO {

	private TreatmentRoutineRecordFormDAO() {
	}

	private static TreatmentRoutineRecordFormDAO treatmentRoutineRecordFormDao = null;

	public static synchronized TreatmentRoutineRecordFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (treatmentRoutineRecordFormDao == null) {
			treatmentRoutineRecordFormDao = new TreatmentRoutineRecordFormDAO();

		} // end if

		return (treatmentRoutineRecordFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateTreatmentRoutineRecordForm(
			TreatmentRoutineRecordForm mprnrf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from TreatmentRoutineRecordForm");
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

	public synchronized List getTreatmentRoutineRecordForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from TreatmentRoutineRecordForm as ar where ar.residentId="
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

	public synchronized TreatmentRoutineRecordForm getTreatmentRoutineRecordForm(
			int serial) throws MedrexException {
		TreatmentRoutineRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (TreatmentRoutineRecordForm) session.load(
					TreatmentRoutineRecordForm.class, serial);
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

	public synchronized void deleteTreatmentRoutineRecordForm(int serial)
			throws MedrexException {
		TreatmentRoutineRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (TreatmentRoutineRecordForm) session.load(
					TreatmentRoutineRecordForm.class, serial);
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

	// / TreatmentRoutineRecordFormRow

	public synchronized int insertOrUpdateTreatmentRoutineRecordFormRow(
			TreatmentRoutineRecordFormRow mprnrfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from TreatmentRoutineRecordFormRow");
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

	public synchronized TreatmentRoutineRecordFormRow getTreatmentRoutineRecordFormRow(
			int formId, int formNum) throws MedrexException {
		TreatmentRoutineRecordFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (TreatmentRoutineRecordFormRow) session
					.createQuery(
							"from TreatmentRoutineRecordFormRow as pg2 where pg2.treatmentRoutineRecordFormSerial = "
									+ formId
									+ " AND pg2.treatmentRoutineRecordFormRowSerial = "
									+ formNum).uniqueResult();
			admissionRecord.getTreatmentRoutine();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	// / TreatmentRoutineRecordFormCol

	public synchronized int insertOrUpdateTreatmentRoutineRecordFormCol(
			TreatmentRoutineRecordFormCol mprnrfc) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from TreatmentRoutineRecordFormCol");
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

	public synchronized TreatmentRoutineRecordFormCol getTreatmentRoutineRecordFormCol(
			int formId, int rowNum, int colNum) throws MedrexException {
		TreatmentRoutineRecordFormCol admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (TreatmentRoutineRecordFormCol) session
					.createQuery(
							"from TreatmentRoutineRecordFormCol as pg2 where pg2.treatmentRoutineRecordFormSerial = "
									+ formId
									+ " AND pg2.treatmentRoutineRecordFormRowSerial = "
									+ rowNum
									+ " AND pg2.treatmentRoutineRecordFormColSerial = "
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

	public void deleteTreatmentRoutineRecordFormCol(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from TreatmentRoutineRecordFormCol as d where d.treatmentRoutineRecordFormSerial= "
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

	public void deleteTreatmentRoutineRecordFormRow(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from TreatmentRoutineRecordFormRow as d where d.treatmentRoutineRecordFormSerial= "
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
