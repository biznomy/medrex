package medrex.server.dao.medicationTreatment;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.MedicationNotes;
import medrex.commons.vo.medication.Templates;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class TemplatesDAO {

	private TemplatesDAO() {
	}

	private static TemplatesDAO templatesDAO = null;

	public static synchronized TemplatesDAO getInstance() {

		// if obj is null create it , else just return it
		if (templatesDAO == null) {
			templatesDAO = new TemplatesDAO();

		} // end if

		return (templatesDAO);

	} // end - getUniqueInstance - method

	public synchronized List getAllTemplates() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from Templates as t").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving templates Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int insertOrUpdateMedicationNotes(MedicationNotes notes)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from MedicationNotes");
			session.saveOrUpdate(notes);
			tx.commit();
			return notes.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving medication notes Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getTemplatesNoteText(int userId, int resId)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from MedicationNotes as tn where tn.userId=" + userId
							+ " and tn.residentId=" + resId
							+ " order by tn.notesDate desc limit 0,5").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving templates Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized MedicationNotes getMedicationNotes(int serial)
			throws MedrexException {
		MedicationNotes medicationNotes = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			medicationNotes = (MedicationNotes) session.load(
					MedicationNotes.class, serial);
			medicationNotes.getResidentId();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving medication Notes");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return medicationNotes;
	}

	public synchronized void deleteMedicationNotes(int serial)
			throws MedrexException {
		MedicationNotes medicationNotes = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			medicationNotes = (MedicationNotes) session.load(
					MedicationNotes.class, serial);
			medicationNotes.getResidentId();
			session.delete(medicationNotes);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting medication Notes");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public int insertOrUpdateTemplates(Templates templates)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		int serial = 0;
		try {

			tx = session.beginTransaction();
			session.createQuery("from Templates");
			session.saveOrUpdate(templates);
			tx.commit();
			serial = templates.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Templates Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return serial;
	}

	public Templates getTemplate(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		Templates temp = null;
		try {
			tx = session.beginTransaction();
			temp = (Templates) session.load(Templates.class, serial);
			temp.getType();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving Templates Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return temp;
	}

	public List getTemplate(String formName) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(Templates.class).add(
					Restrictions.eq("type", formName)).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving Templates list");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public void deleteTemplate(int serial) throws MedrexException {
		Templates temp = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			temp = (Templates) session.load(Templates.class, serial);
			temp.getType();
			session.delete(temp);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Templete records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
