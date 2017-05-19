package medrex.server.dao.admin.screenSaver;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Config;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ConfigDAO {

	private ConfigDAO() {

	}

	private static ConfigDAO auOffDAO = null;

	public static synchronized ConfigDAO getInstance() {
		if (auOffDAO == null) {
			auOffDAO = new ConfigDAO();
		}
		return auOffDAO;
	}

	// public synchronized AutoLogOff getAutoLogOffTime(int serial) throws
	// MedrexException {
	// AutoLogOff aOff = null;
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// aOff = (AutoLogOff)
	// session.createCriteria(AutoLogOff.class).add(Restrictions.eq("serial",
	// serial)).uniqueResult();
	// if(aOff != null) {
	// aOff.getSerial();
	// }
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving AutoLogOff Record");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return aOff;
	// }

	public synchronized void insertOrUpdateScreenSaverConfig(Config config)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createCriteria(config.getClass());
			session.saveOrUpdate(config);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving AutoLogOff");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized Config getScreenSaverConfig() throws MedrexException {
		Config config = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			config = (Config) session.createQuery(
					"from Config as c where c.typeName = 'ScreenSaver'")
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Config Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return config;
	}

}
