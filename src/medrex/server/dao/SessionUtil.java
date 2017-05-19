package medrex.server.dao;

import medrex.commons.exception.MedrexException;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SessionUtil {

	private static SessionUtil sessionUtil = null;

	private SessionUtil() {

	}

	public static synchronized SessionUtil getInstance() {

		// if obj is null create it , else just return it
		if (sessionUtil == null) {
			sessionUtil = new SessionUtil();

		} // end if

		return (sessionUtil);

	} // end - getUniqueInstance - method

	public synchronized Session getSession() throws MedrexException {

		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
		} catch (Exception e) {
			HibernateUtil.resetSessionFactory();
			throw (new MedrexException("Error Connecting To Database"));
		}

		return session;

	}

	public synchronized void closeSession(Session session) {
		try {
			session.close();
		} catch (Exception e) {
			// HibernateUtil.resetSessionFactory();
		}
	}

	public synchronized void rollbackTx(Transaction tx, String msg) {
		try {
			tx.rollback();
		} catch (Exception e) {
			// HibernateUtil.resetSessionFactory();
			// log msg here
		}
	}

}
