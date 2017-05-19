package medrex.server.dao.medicationTreatment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.NurseMedicationNotesForm;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow1;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class NurseMedicationNotesFormDAO {

	public static SimpleDateFormat DAO_Date_Formatter = new SimpleDateFormat(
			"yyyy-MM-dd");

	private NurseMedicationNotesFormDAO() {
	}

	private static NurseMedicationNotesFormDAO nurseMedicationNotesFormDao = null;

	public static synchronized NurseMedicationNotesFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (nurseMedicationNotesFormDao == null) {
			nurseMedicationNotesFormDao = new NurseMedicationNotesFormDAO();

		} // end if

		return (nurseMedicationNotesFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateNurseMedicationNotesForm(
			NurseMedicationNotesForm ntnf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from NurseMedicationNotesForm");
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

	public synchronized List getNurseMedicationNotesForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from NurseMedicationNotesForm as ar where ar.residentId="
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

	public synchronized List getNurseMedicationNotesForms()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from NurseMedicationNotesForm")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized NurseMedicationNotesForm getNurseMedicationNotesForm(
			int serial) throws MedrexException {
		NurseMedicationNotesForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (NurseMedicationNotesForm) session.load(
					NurseMedicationNotesForm.class, serial);
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

	public synchronized void deleteNurseMedicationNotesForm(int serial)
			throws MedrexException {
		NurseMedicationNotesForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (NurseMedicationNotesForm) session.load(
					NurseMedicationNotesForm.class, serial);
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

	// / nurseMedicationNotesFormRow

	public synchronized int insertOrUpdateNurseMedicationNotesFormRow(
			NurseMedicationNotesFormRow ntnfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from NurseMedicationNotesFormRow");
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

	public synchronized NurseMedicationNotesFormRow getNurseMedicationNotesFormRow(
			int formId, int formNum) throws MedrexException {
		NurseMedicationNotesFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (NurseMedicationNotesFormRow) session
					.createQuery(
							"from NurseMedicationNotesFormRow as pg2 where pg2.formSerial = "
									+ formId + " AND pg2.rowSerial = "
									+ formNum).uniqueResult();
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

	public synchronized NurseMedicationNotesFormRow getNurseMedicationNotesFormRow(
			int formId, int formNum, Date currentDate) throws MedrexException {
		NurseMedicationNotesFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (NurseMedicationNotesFormRow) session
					.createCriteria(NurseMedicationNotesFormRow.class,
							"nurseRow").add(
							Restrictions.eq("nurseRow.formSerial", formId))
					.add(Restrictions.eq("nurseRow.rowSerial", formId)).add(
							Expression.eq("nurseRow.dateRecord",
									new java.sql.Date(currentDate.getTime())))
					.uniqueResult();

			// admissionRecord = (NurseMedicationNotesFormRow)
			// session.createQuery(
			// "from NurseMedicationNotesFormRow as pg2 where " +
			// "pg2.formSerial = " + formId + " AND " +
			// "pg2.rowSerial = " + formNum + " AND " +
			// "pg2.dateRecord = '" + DAO_Date_Formatter.format(currentDate) +
			// "'").uniqueResult();
			if (admissionRecord != null) {
				admissionRecord.getReason();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized List getNurseMedicationNotesFormRows(int formId,
			Date currentDate) throws MedrexException {
		List retRowList = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			retRowList = session.createCriteria(
					NurseMedicationNotesFormRow.class, "nurseRow").add(
					Restrictions.eq("nurseRow.formSerial", formId)).add(
					Expression.eq("nurseRow.dateRecord", new java.sql.Date(
							currentDate.getTime()))).addOrder(
					Order.desc("nurseRow.serial")).list();
			// retRowList = session.createQuery(
			// "from NurseMedicationNotesFormRow as pg2 where " +
			// "pg2.formSerial = " + formId + " AND " +
			// "pg2.dateRecord = '" + DAO_Date_Formatter.format(currentDate) +
			// "' order by pg2.timeRecord desc").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return retRowList;
	}

	// / nurseMedicationNotesFormRow1

	public synchronized int insertOrUpdateNurseMedicationNotesFormRow1(
			NurseMedicationNotesFormRow1 ntnfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from NurseMedicationNotesFormRow1");
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

	public synchronized NurseMedicationNotesFormRow1 getNurseMedicationNotesFormRow1(
			int formId, int formNum) throws MedrexException {
		NurseMedicationNotesFormRow1 admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (NurseMedicationNotesFormRow1) session
					.createQuery(
							"from NurseMedicationNotesFormRow1 as pg2 where pg2.formSerial = "
									+ formId + " AND pg2.rowSerial = "
									+ formNum).uniqueResult();
			if (admissionRecord != null) {
				admissionRecord.getSignature();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized int insertOrUpdateNurseMedicationNotesFormRows(
			List<NurseMedicationNotesFormRow> rows) throws MedrexException {
		if (rows != null) {
			Iterator i = rows.iterator();
			while (i.hasNext()) {
				NurseMedicationNotesFormRow dRow = (NurseMedicationNotesFormRow) i
						.next();
				insertOrUpdateNurseMedicationNotesFormRow(dRow);
			}
			return 1;
		}
		return 0;
	}

	public synchronized int insertOrUpdateNurseMedicationNotesFormRow1s(
			List<NurseMedicationNotesFormRow1> rows) throws MedrexException {
		if (rows != null) {
			Iterator i = rows.iterator();
			while (i.hasNext()) {
				NurseMedicationNotesFormRow1 dRow = (NurseMedicationNotesFormRow1) i
						.next();
				insertOrUpdateNurseMedicationNotesFormRow1(dRow);
			}
			return 1;
		}
		return 0;
	}

	public synchronized List getNurseMedicationNotesFormRows(int formId)
			throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from NurseMedicationNotesFormRow as pg2 where pg2.formSerial = "
							+ formId).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Nurse MedicationNotes Form Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized List getNurseMedicationNotesFormRow1s(int formId)
			throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from NurseMedicationNotesFormRow1 as pg2 where pg2.formSerial = "
							+ formId).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Nurse MedicationNotes Form Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deleteNurseMedicationNotesFormRow(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from NurseMedicationNotesFormRow as d where d.formSerial= "
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

	public void deleteNurseMedicationNotesFormRow1(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from NurseMedicationNotesFormRow1 as d where d.formSerial= "
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
