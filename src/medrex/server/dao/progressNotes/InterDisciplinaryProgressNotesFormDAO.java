package medrex.server.dao.progressNotes;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.progressNotes.InterDisciplinaryProgressNotesForm;
import medrex.commons.vo.progressNotes.InterDisciplinaryProgressNotesFormRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InterDisciplinaryProgressNotesFormDAO {

	private InterDisciplinaryProgressNotesFormDAO() {
	}

	private static InterDisciplinaryProgressNotesFormDAO interDisciplinaryProgressNotesFormDAO = null;

	public static synchronized InterDisciplinaryProgressNotesFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (interDisciplinaryProgressNotesFormDAO == null) {
			interDisciplinaryProgressNotesFormDAO = new InterDisciplinaryProgressNotesFormDAO();

		} // end if

		return (interDisciplinaryProgressNotesFormDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateInterDisciplinaryProgressNotesForm(
			InterDisciplinaryProgressNotesForm idpnf) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from InterDisciplinaryProgressNotesForm");
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

	public synchronized List getInterDisciplinaryProgressNotesForms(
			int residentSerial) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from InterDisciplinaryProgressNotesForm as ar where ar.residentId="
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

	public synchronized InterDisciplinaryProgressNotesForm getInterDisciplinaryProgressNotesForm(
			int serial) throws MedrexException {
		InterDisciplinaryProgressNotesForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (InterDisciplinaryProgressNotesForm) session
					.load(InterDisciplinaryProgressNotesForm.class, serial);
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

	public synchronized void deleteInterDisciplinaryProgressNotesForm(int serial)
			throws MedrexException {
		InterDisciplinaryProgressNotesForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (InterDisciplinaryProgressNotesForm) session
					.load(InterDisciplinaryProgressNotesForm.class, serial);
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

	public synchronized int insertOrUpdateInterDisciplinaryProgressNotesFormRow(
			InterDisciplinaryProgressNotesFormRow ntnfr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from InterDisciplinaryProgressNotesFormRow");
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

	// /////////////////////////////

	public synchronized int insertOrUpdateInterDisciplinaryProgressNotesFormRow(
			List intdpn) throws MedrexException {
		Iterator i = intdpn.iterator();
		while (i.hasNext()) {
			InterDisciplinaryProgressNotesFormRow dRow = (InterDisciplinaryProgressNotesFormRow) i
					.next();
			insertOrUpdateInterDisciplinaryProgressNotesFormRow(dRow);
		}
		return 0;
	}

	// /////////////////////////////////

	public synchronized List getInterDisciplinaryProgressNotesFormRows(
			int formId) throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from InterDisciplinaryProgressNotesFormRow as pg2 where pg2.formSerial = "
							+ formId + " order by pg2.rowSerial").list();
			// admissionRecord.getDiscipline();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deleteInterDisciplinaryProgressNotesFormForm(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session
					.createQuery("delete from InterDisciplinaryProgressNotesFormRow as i where i.formSerial= "
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
