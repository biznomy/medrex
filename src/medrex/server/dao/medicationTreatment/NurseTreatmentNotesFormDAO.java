package medrex.server.dao.medicationTreatment;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.NurseTreatmentNotesForm;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow;
import medrex.commons.vo.medication.NurseTreatmentNotesFormRow1;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class NurseTreatmentNotesFormDAO {

	private NurseTreatmentNotesFormDAO() {
	}

	private static NurseTreatmentNotesFormDAO nurseTreatmentNotesFormDao = null;

	public static synchronized NurseTreatmentNotesFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (nurseTreatmentNotesFormDao == null) {
			nurseTreatmentNotesFormDao = new NurseTreatmentNotesFormDAO();

		} // end if

		return (nurseTreatmentNotesFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateNurseTreatmentNotesForm(
			NurseTreatmentNotesForm ntnf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from NurseTreatmentNotesForm");
			session.saveOrUpdate(ntnf);
			tx.commit();
			return ntnf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getNurseTreatmentNotesForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from NurseTreatmentNotesForm as ar where ar.residentId="
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

	public synchronized NurseTreatmentNotesForm getNurseTreatmentNotesForm(
			int serial) throws MedrexException {
		NurseTreatmentNotesForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (NurseTreatmentNotesForm) session.load(
					NurseTreatmentNotesForm.class, serial);
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

	public synchronized void deleteNurseTreatmentNotesForm(int serial)
			throws MedrexException {
		NurseTreatmentNotesForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (NurseTreatmentNotesForm) session.load(
					NurseTreatmentNotesForm.class, serial);
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

	// / nurseTreatmentNotesFormRow
	public synchronized int insertOrUpdateNurseTreatmentNotesFormRow(
			NurseTreatmentNotesFormRow ntnfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from NurseTreatmentNotesFormRow");
			session.saveOrUpdate(ntnfr);
			tx.commit();
			return ntnfr.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized int insertOrUpdateNurseTreatmentNotesFormRow(List l)
			throws MedrexException {
		Iterator i = l.iterator();
		while (i.hasNext()) {
			NurseTreatmentNotesFormRow r = (NurseTreatmentNotesFormRow) i
					.next();
			insertOrUpdateNurseTreatmentNotesFormRow(r);
		}
		return 0;
	}

	public synchronized NurseTreatmentNotesFormRow getNurseTreatmentNotesFormRow(
			int formId, int formNum) throws MedrexException {
		NurseTreatmentNotesFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (NurseTreatmentNotesFormRow) session.createQuery(
					"from NurseTreatmentNotesFormRow as pg2 where pg2.formSerial = "
							+ formId + " AND pg2.rowSerial = " + formNum)
					.uniqueResult();
			admissionRecord.getReason();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized List getNurseTreatmentNotesFormRows(int formId)
			throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from NurseTreatmentNotesFormRow as pg2 where pg2.formSerial="
							+ formId + " order by pg2.rowSerial").list();
			// admissionRecord.getReason();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	// / nurseTreatmentNotesFormRow1

	public synchronized int insertOrUpdateNurseTreatmentNotesFormRow1(
			NurseTreatmentNotesFormRow1 ntnfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from NurseTreatmentNotesFormRow1");
			session.saveOrUpdate(ntnfr);
			tx.commit();
			return ntnfr.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized int insertOrUpdateNurseTreatmentNotesFormRow1(List l)
			throws MedrexException {
		Iterator i = l.iterator();
		while (i.hasNext()) {
			NurseTreatmentNotesFormRow1 r = (NurseTreatmentNotesFormRow1) i
					.next();
			insertOrUpdateNurseTreatmentNotesFormRow1(r);
		}
		return 0;
	}

	public synchronized NurseTreatmentNotesFormRow1 getNurseTreatmentNotesFormRow1(
			int formId, int formNum) throws MedrexException {
		NurseTreatmentNotesFormRow1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (NurseTreatmentNotesFormRow1) session
					.createQuery(
							"from NurseTreatmentNotesFormRow1 as pg2 where pg2.formSerial = "
									+ formId + " AND pg2.rowSerial = "
									+ formNum).uniqueResult();
			admissionRecord.getShift();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized List getNurseTreatmentNotesFormRow1s(int formId)
			throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from NurseTreatmentNotesFormRow1 as pg2 where pg2.formSerial="
							+ formId + " order by pg2.rowSerial").list();
			// admissionRecord.getReason();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deleteNurseTreatmentNotesFormRow(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from NurseTreatmentNotesFormRow as d where d.formSerial= "
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

	public void deleteNurseTreatmentNotesFormRow1(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from NurseTreatmentNotesFormRow1 as d where d.formSerial= "
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
