package medrex.server.dao.activity;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.activity.ActivitysRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ActivitysRecordDAO {

	private ActivitysRecordDAO() {
	}

	private static ActivitysRecordDAO activitysRecordDao = null;

	public static synchronized ActivitysRecordDAO getInstance() {

		// if obj is null create it , else just return it
		if (activitysRecordDao == null) {
			activitysRecordDao = new ActivitysRecordDAO();

		} // end if

		return (activitysRecordDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateActivitysRecord(
			ActivitysRecord residentPayer) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ActivitysRecord");
			session.saveOrUpdate(residentPayer);
			tx.commit();
			return residentPayer.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Activitys Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getActivitysRecords(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ActivitysRecord as ar where ar.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Activitys Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ActivitysRecord getActivitysRecord(int serial)
			throws MedrexException {
		ActivitysRecord activityRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			activityRecord = (ActivitysRecord) session.load(
					ActivitysRecord.class, serial);
			activityRecord.getNotes();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return activityRecord;
	}

	public synchronized void deleteActivitysRecord(int serial)
			throws MedrexException {
		ActivitysRecord activityRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			activityRecord = (ActivitysRecord) session.load(
					ActivitysRecord.class, serial);
			activityRecord.getNotes();
			session.delete(activityRecord);
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
