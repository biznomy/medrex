package medrex.server.dao.progressNotes;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.progressNotes.DoctorsProgressNotesForm;
import medrex.commons.vo.progressNotes.DoctorsProgressNotesFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DoctorsProgressNotesFormDAO {

	private DoctorsProgressNotesFormDAO() {
	}

	private static DoctorsProgressNotesFormDAO doctorsProgressNotesFormDAO = null;

	public static synchronized DoctorsProgressNotesFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (doctorsProgressNotesFormDAO == null) {
			doctorsProgressNotesFormDAO = new DoctorsProgressNotesFormDAO();

		} // end if

		return (doctorsProgressNotesFormDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateDoctorsProgressNotesForm(
			DoctorsProgressNotesForm idpnf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from DoctorsProgressNotesForm");
			session.saveOrUpdate(idpnf);
			tx.commit();
			return idpnf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getDoctorsProgressNotesForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from DoctorsProgressNotesForm as ar where ar.residentId="
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

	public synchronized DoctorsProgressNotesForm getDoctorsProgressNotesForm(
			int serial) throws MedrexException {
		DoctorsProgressNotesForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (DoctorsProgressNotesForm) session.load(
					DoctorsProgressNotesForm.class, serial);
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

	public synchronized void deleteDoctorsProgressNotesForm(int serial)
			throws MedrexException {
		DoctorsProgressNotesForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (DoctorsProgressNotesForm) session.load(
					DoctorsProgressNotesForm.class, serial);
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

	public synchronized int insertOrUpdateDoctorsProgressNotesFormRow(
			DoctorsProgressNotesFormRow idpnfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from DoctorsProgressNotesFormRow");
			session.saveOrUpdate(idpnfr);
			tx.commit();
			return idpnfr.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized DoctorsProgressNotesFormRow getDoctorsProgressNotesFormRow(
			int formId, int formNum) throws MedrexException {
		DoctorsProgressNotesFormRow admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (DoctorsProgressNotesFormRow) session
					.createQuery(
							"from DoctorsProgressNotesFormRow as pg2 where pg2.formSerial = "
									+ formId + " AND pg2.rowSerial = "
									+ formNum).uniqueResult();
			if (admissionRecord != null) {
				admissionRecord.getNotes();
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

	public synchronized int insertOrUpdateDoctorsProgressNotesFormRows(
			List idpnfr) throws MedrexException {
		Iterator i = idpnfr.iterator();
		while (i.hasNext()) {
			DoctorsProgressNotesFormRow dRow = (DoctorsProgressNotesFormRow) i
					.next();
			insertOrUpdateDoctorsProgressNotesFormRow(dRow);
		}
		return 0;
	}

	public synchronized List getDoctorsProgressNotesFormRows(int formId)
			throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from DoctorsProgressNotesFormRow as pg2 where pg2.formSerial = "
							+ formId + " order by pg2.rowSerial").list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deleteDoctorsProgressNotesFormRow(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from DoctorsProgressNotesFormRow as d where d.formSerial= "
							+ formId);
			int num = q.executeUpdate();
			System.out.println("num: " + num);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Doctor progress notes row");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
