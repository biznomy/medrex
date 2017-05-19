package medrex.server.dao.nurseNotes;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.nursesNotes.NursesNotesRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class NursesNotesDao {

	public NursesNotesDao() {

	}

	public static NursesNotesDao nursesNotesDao = null;

	public static synchronized NursesNotesDao getInstance() {
		if (nursesNotesDao == null) {
			nursesNotesDao = new NursesNotesDao();
		}
		return nursesNotesDao;
	}

	public synchronized int insertOrUpdateNursesNotes(
			NursesNotesRecord nursesSum) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		int serial = 0;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(nursesSum);
			tx.commit();
			serial = nursesSum.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Nurses notes Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return serial;
	}

	public NursesNotesRecord getNursesNotesRecord(
			int currentNursesNotesRecordKey) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		NursesNotesRecord nursesNotesRecord = null;
		try {
			tx = session.beginTransaction();
			nursesNotesRecord = (NursesNotesRecord) session.load(
					NursesNotesRecord.class, currentNursesNotesRecordKey);
			nursesNotesRecord.getFormId();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving nurses notes Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return nursesNotesRecord;
	}

	public List<NursesNotesRecord> getNursesNotesRecords(int currentResidenceKey)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<NursesNotesRecord> nursesNotesRecord = null;
		try {
			tx = session.beginTransaction();
			nursesNotesRecord = session.createCriteria(NursesNotesRecord.class)
					.add(Restrictions.eq("residentId", currentResidenceKey))
					.list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving nurses notes Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return nursesNotesRecord;
	}

	public void deleteNursesNotes(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			NursesNotesRecord rec = (NursesNotesRecord) session.load(
					NursesNotesRecord.class, formId);
			session.delete(rec);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting NursesNotesRecord  records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
