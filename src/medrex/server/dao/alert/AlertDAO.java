package medrex.server.dao.alert;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.Alert;
import medrex.commons.vo.alert.AlertReciever;
import medrex.commons.vo.alert.AlertSetting;
import medrex.commons.vo.alert.AlertTime;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AlertDAO {

	private AlertDAO() {

	}

	private static AlertDAO alertDAO = null;

	public static synchronized AlertDAO getInstance() {
		if (alertDAO == null) {
			alertDAO = new AlertDAO();

		}
		return (alertDAO);
	}

	public synchronized int insertOrUpdateAlert(Alert alert)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from Alert");
			session.saveOrUpdate(alert);
			tx.commit();
			return alert.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Alert Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getAlertList(int currentResidenceKey)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from Alert as cp where cp.residentId="
							+ currentResidenceKey).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Alert List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void deleteAlertRecord(int id) throws MedrexException {
		Alert alert = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			alert = (Alert) session.load(Alert.class, id);
			alert.getNotes();
			session.delete(alert);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Alert Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized Alert getAlertRecord(int currentResidenceKey)
			throws MedrexException {
		Alert alert = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			alert = (Alert) session.load(Alert.class, currentResidenceKey);
			alert.getDate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Alert Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return alert;
	}

	public synchronized Alert getGlobalAlertRecord(int globalAlertId)
			throws MedrexException {
		Alert alert = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			alert = (Alert) session.createCriteria(Alert.class).add(
					Restrictions.eq("residentId", globalAlertId))
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Alert Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return alert;
	}

	public synchronized List getGlobalAlertList(int globalAlertId, int key)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from Alert as cp where cp.residentId=" + globalAlertId
							+ " AND cp.owner=" + key).list();
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Alert List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void insertOrUpdateAlertSetting(AlertSetting as)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from AlertSetting");
			session.saveOrUpdate(as);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Alert Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getAlertSetting() throws MedrexException {
		List ia = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ia = session.createCriteria(AlertSetting.class).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Alert Setting Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ia;
	}

	public synchronized List getPendingOwnerList(int currentLoggedInUserKey)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			result = session
					.createQuery(
							"from Alert as cp where cp.owner="
									+ currentLoggedInUserKey).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Alert List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void insertOrUpdateAlertReciever(AlertReciever ar)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from AlertReciever");
			session.saveOrUpdate(ar);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving AlertReciever Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void insertOrUpdateDailyTimes(Alert alert) throws MedrexException {

	}

	public synchronized void insertOrUpdateAlertTime(AlertTime at)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from AlertTime");
			session.saveOrUpdate(at);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving AlertReciever Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
