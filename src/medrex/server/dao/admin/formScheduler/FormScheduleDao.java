package medrex.server.dao.admin.formScheduler;

import java.util.List;

import medrex.commons.enums.LoggerAction;
import medrex.commons.enums.LoggerCriticality;
import medrex.commons.enums.LoggerModule;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.FormSchedule;
import medrex.server.dao.SessionUtil;
import medrex.server.exceptionHandler.ExceptionHandler;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

public class FormScheduleDao {

	private FormScheduleDao() {
	}

	private static FormScheduleDao refDao = null;

	public static synchronized FormScheduleDao getInstance() {
		if (refDao == null) {
			refDao = new FormScheduleDao();
		}
		return refDao;
	}

	public synchronized int insertOrUpdateFormSchedule(FormSchedule ref)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			session.createCriteria(FormSchedule.class);
			session.saveOrUpdate(ref);
			tx.commit();
			return ref.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Security");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<FormSchedule> getFormSchedules()
			throws MedrexException {
		List<FormSchedule> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(FormSchedule.class).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving role List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<FormSchedule> getFormSchedulesByType(String type)
			throws MedrexException {
		List<FormSchedule> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(FormSchedule.class);
			crit.add(Expression.eq("type", type));
			result = crit.list();
			tx.commit();
		} catch (Exception e) {
			String msg = null;
			LoggerAction action = LoggerAction.GET;
			msg = "Exception Occurred in Getting Form Schedule by Type:" + type;
			ExceptionHandler.getInstance().handle(e, LoggerCriticality.WARNING,
					LoggerModule.ADMIN_FORMSCHEDULER, action, msg);
			e.printStackTrace();
			throw new MedrexException("Error retrieving role List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized FormSchedule getFormSchedule(int serial)
			throws MedrexException {
		FormSchedule ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (FormSchedule) session.createCriteria(FormSchedule.class)
					.add(Restrictions.eq("serial", serial)).uniqueResult();
			if (ref != null) {
				ref.getForm();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving security role");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized void deleteFormSchedule(int serial)
			throws MedrexException {
		FormSchedule ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (FormSchedule) session.createCriteria(FormSchedule.class)
					.add(Restrictions.eq("serial", serial)).uniqueResult();
			session.delete(ref);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving security role");
		}
	}
}
