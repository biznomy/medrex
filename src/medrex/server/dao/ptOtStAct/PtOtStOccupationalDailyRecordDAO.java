package medrex.server.dao.ptOtStAct;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.ptOtSt.PtOtStOccupationalDailyRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PtOtStOccupationalDailyRecordDAO {

	private PtOtStOccupationalDailyRecordDAO() {
	}

	private static PtOtStOccupationalDailyRecordDAO refPtOtStOccupationalDailyRecordDao = null;

	public static synchronized PtOtStOccupationalDailyRecordDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPtOtStOccupationalDailyRecordDao == null) {
			refPtOtStOccupationalDailyRecordDao = new PtOtStOccupationalDailyRecordDAO();

		} // end if

		return (refPtOtStOccupationalDailyRecordDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePtOtStOccupationalDailyRecord(
			PtOtStOccupationalDailyRecord refPtOtStOccupationalDailyRecord)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PtOtStOccupationalDailyRecord");
			session.saveOrUpdate(refPtOtStOccupationalDailyRecord);
			tx.commit();

			return refPtOtStOccupationalDailyRecord.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving PtOtStOccupationalDailyRecord");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPtOtStOccupationalDailyRecords(
			int residentSerial) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PtOtStOccupationalDailyRecord as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStOccupationalDailyRecord List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PtOtStOccupationalDailyRecord getPtOtStOccupationalDailyRecord(
			int serial) throws MedrexException {
		Date date = getSundayDate(serial);
		PtOtStOccupationalDailyRecord refPtOtStOccupationalDailyRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			if (serial != 0) {
				String d = new SimpleDateFormat("yyyy-MM-dd").format(date);
				refPtOtStOccupationalDailyRecord = (PtOtStOccupationalDailyRecord) session
						.createCriteria(PtOtStOccupationalDailyRecord.class)
						.add(
								Restrictions
										.sqlRestriction("DATE(dateSunday)='"
												+ d + "'")).uniqueResult();
			} else {
				refPtOtStOccupationalDailyRecord = (PtOtStOccupationalDailyRecord) session
						.createCriteria(PtOtStOccupationalDailyRecord.class)
						.uniqueResult();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStOccupationalDailyRecords");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPtOtStOccupationalDailyRecord;
	}

	public synchronized void deletePtOtStOccupationalDailyRecord(int serial)
			throws Exception {
		PtOtStOccupationalDailyRecord refPtOtStOccupationalDailyRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPtOtStOccupationalDailyRecord = (PtOtStOccupationalDailyRecord) session
					.load(PtOtStOccupationalDailyRecord.class, serial);
			refPtOtStOccupationalDailyRecord.getCoSignLic();
			session.delete(refPtOtStOccupationalDailyRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception(
					"Error deleting PtOtStOccupationalDailyRecord Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public Date getSundayDate(int serial) throws MedrexException {
		Date date = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			if (serial == 0) {
				Calendar calendar = Calendar.getInstance();
				int weekday = calendar.get(Calendar.DAY_OF_WEEK);
				int days = Calendar.SUNDAY - weekday;
				calendar.add(Calendar.DAY_OF_YEAR, days);
				date = calendar.getTime();
			} else {
				Criteria crit = session.createCriteria(
						PtOtStOccupationalDailyRecord.class).add(
						Restrictions.eq("serial", serial));
				ProjectionList pList = Projections.projectionList().add(
						Projections.property("dateSunday"));
				crit.setProjection(pList);
				date = (Date) crit.uniqueResult();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStOccupationalDailyRecords");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return date;
	}

	public int getKeyByDate(Date cal) throws MedrexException {
		int key = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(
					PtOtStOccupationalDailyRecord.class).add(
					Restrictions.sqlRestriction("DATE(dateSunday) = '"
							+ new SimpleDateFormat("yyyy-MM-dd").format(cal)
							+ "'"));
			// .add(Restrictions.eq("typeName", "Admission"));
			ProjectionList pList = Projections.projectionList().add(
					Projections.property("serial"));
			crit.setProjection(pList);
			Integer i = (Integer) crit.uniqueResult();
			// Integer i =
			// session.createSQLQuery("select serial from ptotstoccupationaldailyrecord where dateSunday="+cal);
			if (i != null) {
				key = i;
			} else {
				key = 0;
			}
			System.out.println("Key :" + key);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving PtOtStOccupationalDailyRecords");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return key;
	}

}
