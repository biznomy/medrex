package medrex.server.dao.medicationTreatment;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.MedicationAdministrationRecordForm;
import medrex.commons.vo.medication.MedicationAdministrationRecordFormCol;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MedicationAdministrationRecordFormDAO {

	private MedicationAdministrationRecordFormDAO() {
	}

	private static MedicationAdministrationRecordFormDAO medicationAdministrationRecordFormDao = null;

	public static synchronized MedicationAdministrationRecordFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (medicationAdministrationRecordFormDao == null) {
			medicationAdministrationRecordFormDao = new MedicationAdministrationRecordFormDAO();

		} // end if

		return (medicationAdministrationRecordFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMedicationAdministrationRecordForm(
			MedicationAdministrationRecordForm marf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MedicationAdministrationRecordForm");
			session.saveOrUpdate(marf);
			tx.commit();
			return marf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getMedicationAdministrationRecordForms(
			int residentSerial) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from MedicationAdministrationRecordForm as ar where ar.residentId="
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

	public synchronized MedicationAdministrationRecordForm getMedicationAdministrationRecordForm(
			int serial) throws MedrexException {
		MedicationAdministrationRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MedicationAdministrationRecordForm) session
					.load(MedicationAdministrationRecordForm.class, serial);
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

	public synchronized void deleteMedicationAdministrationRecordForm(int serial)
			throws MedrexException {
		MedicationAdministrationRecordForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MedicationAdministrationRecordForm) session
					.load(MedicationAdministrationRecordForm.class, serial);
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

	// / MedicationAdministrationRecordFormCol

	public synchronized int insertOrUpdateMedicationAdministrationRecordFormCol(
			MedicationAdministrationRecordFormCol marfc) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MedicationAdministrationRecordFormCol");
			session.saveOrUpdate(marfc);
			tx.commit();
			return marfc.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized MedicationAdministrationRecordFormCol getMedicationAdministrationRecordFormCol(
			int formId, int formNum) throws MedrexException {
		MedicationAdministrationRecordFormCol admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			System.out.println("form id and formnum is" + formId + ","
					+ formNum);
			admissionRecord = (MedicationAdministrationRecordFormCol) session
					.createQuery(
							"from MedicationAdministrationRecordFormCol as pg2 where pg2.medicationAdministrationRecordFormSerial = "
									+ formId
									+ " AND pg2.medicationAdministrationRecordFormColSerial = "
									+ formNum).uniqueResult();
			admissionRecord.getBpHigh1();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deleteMedicationAdministrationRecordFormCol(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from MedicationAdministrationRecordFormCol as d where d.medicationAdministrationRecordFormSerial= "
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
