package medrex.server.dao.admin.userLogon;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.UserLogon;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class UserLogonDao {

	private UserLogonDao() {

	}

	private static UserLogonDao userLogonDao = null;

	public static synchronized UserLogonDao getInstance() {
		if (userLogonDao == null) {
			userLogonDao = new UserLogonDao();
		}
		return userLogonDao;
	}

	public synchronized int insertOrUpdateUserLogon(UserLogon userLogon)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			session.createQuery("from UserLogon");
			session.saveOrUpdate(userLogon);
			tx.commit();
			return userLogon.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Security");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getAllLogons() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from UserLogon").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving role List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getUsersForToday() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM-dd-yyyy");

			// tx = session.beginTransaction();
			// result =
			// session.createQuery("from UserLogon as sr where sr.Login = '"
			// +10/20/2009+"+ 01:00 "+"+PM+" + "'").list();
			// tx.commit();
			tx = session.beginTransaction();
			// System.out.println("Date is:"+df.format(new Date()));
			result = session
					.createCriteria(UserLogon.class)
					// .add(Expression.like("login", df.format(new Date())))
					.add(
							Restrictions
									.sqlRestriction("DATE(STR_TO_DATE(REPLACE(login,' ',''), '%m/%d/%Y%h:%i%p')) = DATE(STR_TO_DATE('"
											+ df.format(new Date())
											+ "', '%m-%d-%Y'))")).addOrder(
							Order.desc("login")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Logon List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		// return result;
		return result;
	}

	public synchronized List getFilteredUsers(Date dFrom, Date dTo)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM-dd-yyyy");
			tx = session.beginTransaction();
			result = session
					.createCriteria(UserLogon.class)
					.add(
							Restrictions
									.sqlRestriction("DATE(STR_TO_DATE(REPLACE(login,' ',''), '%m/%d/%Y%h:%i%p')) Between (DATE(STR_TO_DATE('"
											+ df.format(dFrom)
											+ "', '%m-%d-%Y'))) AND (DATE(STR_TO_DATE('"
											+ df.format(dTo)
											+ "', '%m-%d-%Y')))")).addOrder(
							Order.desc("login")).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving User Logon List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized UserLogon getUserLogon(int serial)
			throws MedrexException {
		UserLogon userLogon = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			userLogon = (UserLogon) session.load(UserLogon.class, serial);
			userLogon.getLogout();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving security role");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return userLogon;
	}

	public synchronized UserLogon getUserLogon(String name)
			throws MedrexException {
		UserLogon userLogon = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			userLogon = (UserLogon) session.createQuery(
					"from UserLogon as sr where sr.name = '" + name + "'")
					.uniqueResult();
			userLogon.getLogout();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving security role");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return userLogon;
	}

	public synchronized void deleteUserLogon(int serial) throws MedrexException {
		UserLogon userLogon = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			userLogon = (UserLogon) session.load(UserLogon.class, serial);
			session.delete(userLogon);
			tx.commit();
		} catch (Exception e) {

		}

	}

	public UserLogon getcurrentUserLogon() throws MedrexException {
		UserLogon userLogon = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			userLogon = (UserLogon) session.createCriteria(UserLogon.class)
					.addOrder(Order.desc("serial")).setMaxResults(1)
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving UserLogon");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return userLogon;
	}

}
