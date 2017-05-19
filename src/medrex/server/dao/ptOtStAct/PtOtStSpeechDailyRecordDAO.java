package medrex.server.dao.ptOtStAct;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStSpeechDailyRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PtOtStSpeechDailyRecordDAO {

	private PtOtStSpeechDailyRecordDAO() {
	}

	private static PtOtStSpeechDailyRecordDAO refPtOtStSpeechDailyRecordDao = null;

	public static synchronized PtOtStSpeechDailyRecordDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPtOtStSpeechDailyRecordDao == null) {
			refPtOtStSpeechDailyRecordDao = new PtOtStSpeechDailyRecordDAO();

		} // end if

		return (refPtOtStSpeechDailyRecordDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtStSpeechDailyRecord(
			PtOtStSpeechDailyRecord refPtOtStSpeechDailyRecord)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtStSpeechDailyRecord");
			session.saveOrUpdate(refPtOtStSpeechDailyRecord);
			tx.commit();

			return refPtOtStSpeechDailyRecord.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PtOtStSpeechDailyRecord");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtStSpeechDailyRecords(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PtOtStSpeechDailyRecord as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStSpeechDailyRecord List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtStSpeechDailyRecord getPtOtStSpeechDailyRecord(
			int serial) throws MedrexException {
		PtOtStSpeechDailyRecord refPtOtStSpeechDailyRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStSpeechDailyRecord = (PtOtStSpeechDailyRecord) session
					.load(PtOtStSpeechDailyRecord.class, serial);
			refPtOtStSpeechDailyRecord.getCoSignLic();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStSpeechDailyRecords");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStSpeechDailyRecord;
	}

	public synchronized void deletePtOtStSpeechDailyRecord(int serial)
			throws Exception {

		PtOtStSpeechDailyRecord refPtOtStSpeechDailyRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStSpeechDailyRecord = (PtOtStSpeechDailyRecord) session
					.load(PtOtStSpeechDailyRecord.class, serial);
			refPtOtStSpeechDailyRecord.getCoSignLic();
			session.delete(refPtOtStSpeechDailyRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception(
					"Error deleting PtOtStSpeechDailyRecord Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public int getSpeechDailyKeyByDate(Date cal) throws MedrexException {
		System.out.println("Cal is:" + cal);
		int key = 0;
		// PtOtStSpeechDailyRecord ptDailyRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(
					PtOtStSpeechDailyRecord.class).add(
					Restrictions.sqlRestriction("DATE(dateSunday) = '"
							+ new SimpleDateFormat("yyyy-MM-dd").format(cal)
							+ "'"));
			// .add(Restrictions.eq("typeName", "Admission"));
			ProjectionList pList = Projections.projectionList().add(
					Projections.property("serial"));
			crit.setProjection(pList);
			Integer i = (Integer) crit.uniqueResult();
			// System.out.println("Value of i:"+i);
			// Integer i =
			// session.createSQLQuery("select serial from ptotstoccupationaldailyrecord where dateSunday="+cal);
			if (i != null) {
				key = i;
			} else {
				key = 0;
			}
			// System.out.println("Key :" + key);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStSpeechDailyRecords");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return key;
	}
}
