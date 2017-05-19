package medrex.server.dao.historyPhysical;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysicalGeneralFormPage1;
import medrex.commons.vo.historyAndPhysical.HistoryAndPhysicalGeneralFormPage2;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HistoryAndPhysicalGeneralFormDAO {

	private HistoryAndPhysicalGeneralFormDAO() {
	}

	private static HistoryAndPhysicalGeneralFormDAO historyAndPhysicalGeneralFormDao = null;

	public static synchronized HistoryAndPhysicalGeneralFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (historyAndPhysicalGeneralFormDao == null) {
			historyAndPhysicalGeneralFormDao = new HistoryAndPhysicalGeneralFormDAO();

		} // end if

		return (historyAndPhysicalGeneralFormDao);

	} // end - method

	public synchronized int insertOrUpdateHistoryAndPhysicalGeneralFormPage1(
			HistoryAndPhysicalGeneralFormPage1 rafp1) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from HistoryAndPhysicalGeneralFormPage1");
			session.saveOrUpdate(rafp1);
			tx.commit();
			return rafp1.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getHistoryAndPhysicalGeneralFormPage1s(
			int residentSerial) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from HistoryAndPhysicalGeneralFormPage1 as ar where ar.residentId="
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

	public synchronized HistoryAndPhysicalGeneralFormPage1 getHistoryAndPhysicalGeneralFormPage1(
			int serial) throws MedrexException {
		HistoryAndPhysicalGeneralFormPage1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (HistoryAndPhysicalGeneralFormPage1) session
					.load(HistoryAndPhysicalGeneralFormPage1.class, serial);
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

	public synchronized void deleteHistoryAndPhysicalGeneralFormPage1(int serial)
			throws MedrexException {
		HistoryAndPhysicalGeneralFormPage1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (HistoryAndPhysicalGeneralFormPage1) session
					.load(HistoryAndPhysicalGeneralFormPage1.class, serial);
			admissionRecord.getAllergies();
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

	// / page 2

	public synchronized int insertOrUpdateHistoryAndPhysicalGeneralFormPage2(
			HistoryAndPhysicalGeneralFormPage2 rafp2) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from HistoryAndPhysicalGeneralFormPage2");
			session.saveOrUpdate(rafp2);
			tx.commit();
			return rafp2.getSerial();
			// Global.currentHistoryAndPhysicalGeneralFormKey =
			// rafp2.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized HistoryAndPhysicalGeneralFormPage2 getHistoryAndPhysicalGeneralFormPage2(
			int formId) throws MedrexException {
		HistoryAndPhysicalGeneralFormPage2 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (HistoryAndPhysicalGeneralFormPage2) session
					.createQuery(
							"from HistoryAndPhysicalGeneralFormPage2 as pg2 where pg2.formId = "
									+ formId).uniqueResult();
			admissionRecord.getAssessment();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteHistoryAndPhysicalGeneralFormPage2(int serial)
			throws MedrexException {
		HistoryAndPhysicalGeneralFormPage2 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (HistoryAndPhysicalGeneralFormPage2) session
					.load(HistoryAndPhysicalGeneralFormPage2.class, serial);
			admissionRecord.getBp();
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
