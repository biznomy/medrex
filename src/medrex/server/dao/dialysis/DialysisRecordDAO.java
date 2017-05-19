package medrex.server.dao.dialysis;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dialysis.DialysisRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DialysisRecordDAO {

	private DialysisRecordDAO() {
	}

	private static DialysisRecordDAO DialysisRecordDao = null;

	public static synchronized DialysisRecordDAO getInstance() {

		if (DialysisRecordDao == null) {
			DialysisRecordDao = new DialysisRecordDAO();

		} // end if

		return (DialysisRecordDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateDialysisRecord(
			DialysisRecord dialysisRecord) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from DialysisRecord");
			session.saveOrUpdate(dialysisRecord);

			tx.commit();
			return dialysisRecord.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Dialysis Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<DialysisRecord> getDialysisRecords(
			int residentSerial) throws MedrexException {
		List<DialysisRecord> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from DialysisRecord as d where d.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Dialysis Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized DialysisRecord getDialysisRecord(int serial)
			throws MedrexException {
		DialysisRecord dialysisRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			dialysisRecord = (DialysisRecord) session.load(
					DialysisRecord.class, serial);
			dialysisRecord.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Dialysis Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return dialysisRecord;
	}

	public synchronized void deleteDialysisRecord(int serial)
			throws MedrexException {
		DialysisRecord dialysisRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			dialysisRecord = (DialysisRecord) session.load(
					DialysisRecord.class, serial);
			dialysisRecord.getDateCreated();
			session.delete(dialysisRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Dialysis Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
