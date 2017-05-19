package medrex.server.dao.ptOtStAct;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStPhysicalDailyRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PtOtStPhysicalDailyRecordDAO {

	private PtOtStPhysicalDailyRecordDAO() {
	}

	private static PtOtStPhysicalDailyRecordDAO refPtOtStPhysicalDailyRecordDao = null;

	public static synchronized PtOtStPhysicalDailyRecordDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPtOtStPhysicalDailyRecordDao == null) {
			refPtOtStPhysicalDailyRecordDao = new PtOtStPhysicalDailyRecordDAO();

		} // end if

		return (refPtOtStPhysicalDailyRecordDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtStPhysicalDailyRecord(
			PtOtStPhysicalDailyRecord refPtOtStPhysicalDailyRecord)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtStPhysicalDailyRecord");
			session.saveOrUpdate(refPtOtStPhysicalDailyRecord);
			tx.commit();

			return refPtOtStPhysicalDailyRecord.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PtOtStPhysicalDailyRecord");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtStPhysicalDailyRecords(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PtOtStPhysicalDailyRecord as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStPhysicalDailyRecord List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtStPhysicalDailyRecord getPtOtStPhysicalDailyRecord(
			int serial) throws MedrexException {
		PtOtStPhysicalDailyRecord refPtOtStPhysicalDailyRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStPhysicalDailyRecord = (PtOtStPhysicalDailyRecord) session
					.load(PtOtStPhysicalDailyRecord.class, serial);
			refPtOtStPhysicalDailyRecord.getCoSignLic();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStPhysicalDailyRecords");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStPhysicalDailyRecord;
	}

	public synchronized void deletePtOtStPhysicalDailyRecord(int serial)
			throws Exception {

		PtOtStPhysicalDailyRecord refPtOtStPhysicalDailyRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStPhysicalDailyRecord = (PtOtStPhysicalDailyRecord) session
					.load(PtOtStPhysicalDailyRecord.class, serial);
			refPtOtStPhysicalDailyRecord.getCoSignLic();
			session.delete(refPtOtStPhysicalDailyRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception(
					"Error deleting PtOtStPhysicalDailyRecord Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public int getPhysicalDailyKeyByDate(Date cal) throws MedrexException {
		int key = 0;
		// PtOtStSpeechDailyRecord ptDailyRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(
					PtOtStPhysicalDailyRecord.class).add(
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
