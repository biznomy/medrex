package medrex.server.dao.medicationTreatment;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.PressureSoreRecordForm;
import medrex.commons.vo.medication.PressureSoreRecordFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PressureSoreRecordFormDAO {

	private PressureSoreRecordFormDAO() {
	}

	private static PressureSoreRecordFormDAO pressureSoreRecordDao = null;

	public static synchronized PressureSoreRecordFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (pressureSoreRecordDao == null) {
			pressureSoreRecordDao = new PressureSoreRecordFormDAO();

		} // end if

		return (pressureSoreRecordDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePressureSoreRecordForm(
			PressureSoreRecordForm psrf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PressureSoreRecordForm");
			session.saveOrUpdate(psrf);
			tx.commit();
			return psrf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPressureSoreRecordForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PressureSoreRecordForm as ar where ar.residentId="
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

	public synchronized PressureSoreRecordForm getPressureSoreRecordForm(
			int serial) throws MedrexException {
		PressureSoreRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (PressureSoreRecordForm) session.load(
					PressureSoreRecordForm.class, serial);
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

	public synchronized void deletePressureSoreRecordForm(int serial)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			/*
			 * admissionRecord = (PressureSoreRecordForm) session.load(
			 * PressureSoreRecordForm.class, serial);
			 * admissionRecord.getResidentId(); session.delete(admissionRecord);
			 */
			int num = session.createQuery(
					"delete from PressureSoreRecordForm as pr where pr.serial="
							+ serial).executeUpdate();
			System.out.println("deleted records: " + num);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// / pressureSoreAssessment

	public synchronized int insertOrUpdatePressureSoreRecordFormRow(
			PressureSoreRecordFormRow psrfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PressureSoreRecordFormRow");
			session.saveOrUpdate(psrfr);
			tx.commit();
			return psrfr.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized PressureSoreRecordFormRow getPressureSoreRecordFormRow(
			int formId, int formNum) throws MedrexException {
		PressureSoreRecordFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (PressureSoreRecordFormRow) session
					.createQuery(
							"from PressureSoreRecordFormRow as pg2 where pg2.pressureSoreRecordFormSerial = "
									+ formId
									+ " AND pg2.pressureSoreRecordFormRowSerial = "
									+ formNum).uniqueResult();
			admissionRecord.getColor();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deletePressureSoreRecordFormRow(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from PressureSoreRecordFormRow as d where d.pressureSoreRecordFormSerial= "
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
