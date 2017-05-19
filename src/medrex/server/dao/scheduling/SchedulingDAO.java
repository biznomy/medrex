package medrex.server.dao.scheduling;

import java.util.ArrayList;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.scheduling.scheduling;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class SchedulingDAO {

	public SchedulingDAO() {

	}

	private static SchedulingDAO schDao = null;

	public static synchronized SchedulingDAO getInstance() {
		// if obj is null create it , else just return it
		if (schDao == null) {
			schDao = new SchedulingDAO();

		} // end if
		return (schDao);
	}

	public synchronized int insertOrUpdateScheduling(scheduling sch)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from scheduling");
			session.saveOrUpdate(sch);
			tx.commit();
			return sch.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Scheduling");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public List getResidentScheduling(int serial) throws MedrexException {
		List l = new ArrayList();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			l = session.createCriteria(scheduling.class).add(
					Restrictions.eq("residentId", serial)).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Scheduling");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return l;
	}

	public scheduling getSchedulingObject(int serial) throws MedrexException {

		scheduling sh = new scheduling();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// sh = (scheduling) session.load(scheduling.class, serial);
			sh = (scheduling) session.createCriteria(scheduling.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			// sh.getMonproced();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Scheduling");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return sh;
	}

	public String deleteScheduling(int currentSerial, String str)
			throws MedrexException {
		System.out.println("serial is  DAO" + currentSerial + str);

		scheduling accurities = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			accurities = (scheduling) session.load(scheduling.class,
					currentSerial);
			accurities.getResidentId();
			session.delete(accurities);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Scheduling Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return str;
	}
}
