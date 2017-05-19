package medrex.server.dao.consultant;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.consultant.RenalDialysisCommunicationFormPage1;
import medrex.commons.vo.consultant.RenalDialysisCommunicationFormPage2;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class RenalDialysisCommunicationFormDAO {

	private RenalDialysisCommunicationFormDAO() {
	}

	private static RenalDialysisCommunicationFormDAO renalDialysisCommunicationFormDao = null;

	public static synchronized RenalDialysisCommunicationFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (renalDialysisCommunicationFormDao == null) {
			renalDialysisCommunicationFormDao = new RenalDialysisCommunicationFormDAO();

		} // end if

		return (renalDialysisCommunicationFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateRenalDialysisCommunicationFormPage1(
			RenalDialysisCommunicationFormPage1 rdcfp1) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from RenalDialysisCommunicationFormPage1");
			session.saveOrUpdate(rdcfp1);
			tx.commit();
			return rdcfp1.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getRenalDialysisCommunicationFormPage1s(
			int residentSerial) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from RenalDialysisCommunicationFormPage1 as ar where ar.residentId="
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

	public synchronized RenalDialysisCommunicationFormPage1 getRenalDialysisCommunicationFormPage1(
			int serial) throws MedrexException {
		RenalDialysisCommunicationFormPage1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (RenalDialysisCommunicationFormPage1) session
					.load(RenalDialysisCommunicationFormPage1.class, serial);
			admissionRecord.getBpVitals();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteRenalDialysisCommunicationFormPage1(
			int serial) throws MedrexException {
		RenalDialysisCommunicationFormPage1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (RenalDialysisCommunicationFormPage1) session
					.load(RenalDialysisCommunicationFormPage1.class, serial);
			admissionRecord.getDietaryConcerns();
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

	// ///

	public synchronized int insertOrUpdateRenalDialysisCommunicationFormPage2(
			RenalDialysisCommunicationFormPage2 rdcfp2) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from RenalDialysisCommunicationFormPage2");
			session.saveOrUpdate(rdcfp2);
			tx.commit();
			return rdcfp2.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized RenalDialysisCommunicationFormPage2 getRenalDialysisCommunicationFormPage2(
			int formId) throws MedrexException {
		RenalDialysisCommunicationFormPage2 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (RenalDialysisCommunicationFormPage2) session
					.createQuery(
							"from RenalDialysisCommunicationFormPage2 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getChangesInMedication();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteRenalDialysisCommunicationFormPage2(
			int serial) throws MedrexException {
		RenalDialysisCommunicationFormPage2 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (RenalDialysisCommunicationFormPage2) session
					.load(RenalDialysisCommunicationFormPage2.class, serial);
			admissionRecord.getDietaryConcerns();
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
