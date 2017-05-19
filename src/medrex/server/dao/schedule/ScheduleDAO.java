package medrex.server.dao.schedule;

import java.rmi.RemoteException;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.schedule.Schedule;
import medrex.server.dao.SessionUtil;

import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ScheduleDAO {
	private ScheduleDAO() {
	}

	private static ScheduleDAO refSchedule3DAO = null;

	public static synchronized ScheduleDAO getInstance() {
		if (refSchedule3DAO == null) {
			refSchedule3DAO = new ScheduleDAO();
		}
		return (refSchedule3DAO);
	}

	public synchronized int insertOrUpdateSchedule(Schedule sh)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// session.createQuery("from Schedule");
			session.saveOrUpdate(sh);
			tx.commit();
			return sh.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Schedule records................");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized List<Schedule> getScheduleRecords()
			throws MedrexException {
		List<Schedule> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(Schedule.class)
			        .add(Restrictions.gt("serial", 1))
			.list();
			// result = session.createQuery("from Schedule").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error Retrieving Schedule Records...........");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Schedule getScheduleRecord(int id)
			throws MedrexException, RemoteException {
		Schedule schedule = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			schedule = (Schedule) session.createCriteria(Schedule.class).add(
					Restrictions.eq("serial", id)).setFetchMode(
					"userSchedules", FetchMode.JOIN).uniqueResult();
			// schedule.getSerial();

			// ma.getSource();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Office Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return schedule;
	}

	/*
	 * uschedule = (UserSchedule) session.createCriteria(UserSchedule.class)
	 * .add(Restrictions.eq("schedule.serial", scheduleID))
	 * .add(Restrictions.eq("userID.serial", userID))
	 * .add(Restrictions.sqlRestriction("date(date) = '" + df.format(onDate) +
	 * "'"))
	 */

	public synchronized void deleteScheduleRecord(int id)
			throws MedrexException {
		Schedule schedule = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			schedule = (Schedule) session.load(Schedule.class, id);
			session.delete(schedule);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
