package medrex.server.dao.medicationTreatment;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.PainManagementRecordFormPage1;
import medrex.commons.vo.medication.PainManagementRecordRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PainManagementRecordFormDAO {

	private PainManagementRecordFormDAO() {
	}

	private static PainManagementRecordFormDAO painManagementRecordDao = null;

	public static synchronized PainManagementRecordFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (painManagementRecordDao == null) {
			painManagementRecordDao = new PainManagementRecordFormDAO();

		} // end if

		return (painManagementRecordDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePainManagementRecordFormPage1(
			PainManagementRecordFormPage1 pmrp1) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PainManagementRecordFormPage1");
			session.saveOrUpdate(pmrp1);
			tx.commit();
			return pmrp1.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPainManagementRecordFormPage1s(
			int residentSerial) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PainManagementRecordFormPage1 as ar where ar.residentId="
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

	public synchronized PainManagementRecordFormPage1 getPainManagementRecordFormPage1(
			int serial) throws MedrexException {
		PainManagementRecordFormPage1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (PainManagementRecordFormPage1) session.load(
					PainManagementRecordFormPage1.class, serial);
			admissionRecord.getEvaluation1();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deletePainManagementRecordFormPage1(int serial)
			throws MedrexException {
		PainManagementRecordFormPage1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (PainManagementRecordFormPage1) session.load(
					PainManagementRecordFormPage1.class, serial);
			admissionRecord.getEvaluation2();
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

	// / pressureSoreAssessment

	public synchronized int insertOrUpdatePainManagementRecordRow(
			PainManagementRecordRow psa) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PainManagementRecordRow");
			session.saveOrUpdate(psa);
			tx.commit();
			return psa.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized PainManagementRecordRow getPainManagementRecordRow(
			int formId, int formNum) throws MedrexException {
		PainManagementRecordRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (PainManagementRecordRow) session
					.createQuery(
							"from PainManagementRecordRow as pg2 where pg2.painManagementRecordFormSerial = "
									+ formId
									+ " AND pg2.painManagementRecordRowSerial = "
									+ formNum).uniqueResult();
			admissionRecord.getLocationOfPain();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deletePainManagementRecordFormPage1Row(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from PainManagementRecordRow as d where d.painManagementRecordFormSerial= "
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
