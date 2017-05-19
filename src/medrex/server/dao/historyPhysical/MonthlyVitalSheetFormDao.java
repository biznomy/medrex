package medrex.server.dao.historyPhysical;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetForm;
import medrex.commons.vo.historyAndPhysical.MonthlyVitalSheetFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MonthlyVitalSheetFormDao {

	private MonthlyVitalSheetFormDao() {
	}

	private static MonthlyVitalSheetFormDao monthlyVitalSheetFormDao = null;

	public static synchronized MonthlyVitalSheetFormDao getInstance() {

		// if obj is null create it , else just return it
		if (monthlyVitalSheetFormDao == null) {
			monthlyVitalSheetFormDao = new MonthlyVitalSheetFormDao();

		} // end if

		return (monthlyVitalSheetFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateMonthlyVitalSheetForm(
			MonthlyVitalSheetForm mvsf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MonthlyVitalSheetForm");
			session.saveOrUpdate(mvsf);
			tx.commit();
			return mvsf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getMonthlyVitalSheetForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from MonthlyVitalSheetForm as ar where ar.residentId="
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

	public synchronized MonthlyVitalSheetForm getMonthlyVitalSheetForm(
			int serial) throws MedrexException {
		MonthlyVitalSheetForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MonthlyVitalSheetForm) session.load(
					MonthlyVitalSheetForm.class, serial);
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

	public synchronized void deleteMonthlyVitalSheetForm(int serial)
			throws MedrexException {
		MonthlyVitalSheetForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MonthlyVitalSheetForm) session.load(
					MonthlyVitalSheetForm.class, serial);
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

	// nurseMedicationNotesFormRow

	public synchronized int insertOrUpdateMonthlyVitalSheetFormRow(
			MonthlyVitalSheetFormRow cdfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MonthlyVitalSheetFormRow");
			session.saveOrUpdate(cdfr);
			tx.commit();
			return cdfr.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized MonthlyVitalSheetFormRow getMonthlyVitalSheetFormRow(
			int formId, int formNum) throws MedrexException {
		MonthlyVitalSheetFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (MonthlyVitalSheetFormRow) session.createQuery(
					"from MonthlyVitalSheetFormRow as pg2 where pg2.formSerial = "
							+ formId + " AND pg2.rowSerial = " + formNum)
					.uniqueResult();
			admissionRecord.getBp();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized int insertOrUpdateMonthlyVitalSheetFormRows(List idpnfr)
			throws MedrexException {
		Iterator i = idpnfr.iterator();
		while (i.hasNext()) {
			MonthlyVitalSheetFormRow dRow = (MonthlyVitalSheetFormRow) i.next();
			insertOrUpdateMonthlyVitalSheetFormRow(dRow);
		}
		return 0;
	}

	public synchronized List getMonthlyVitalSheetFormRows(int formId)
			throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from MonthlyVitalSheetFormRow as pg2 where pg2.formSerial = "
							+ formId + " order by pg2.rowSerial").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving MonthlyVitalSheetForm");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteMonthlyVitalSheetFormRow(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery(
					"delete from MonthlyVitalSheetFormRow as pg2 where pg2.formSerial = "
							+ formId).executeUpdate();

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
