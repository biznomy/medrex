package medrex.server.dao.alert;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.Alert;
import medrex.commons.vo.alert.CalculatedAlert;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CalculatedAlertDAO {

	private CalculatedAlertDAO() {

	}

	private static CalculatedAlertDAO alertTimeDAO = null;

	public static synchronized CalculatedAlertDAO getInstance() {
		if (alertTimeDAO == null) {
			alertTimeDAO = new CalculatedAlertDAO();

		}
		return (alertTimeDAO);
	}

	// public synchronized int insertOrUpdateAlertTime(AlertTime at) throws
	// MedrexException{
	// int serial = 0;
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// session.createQuery("from AlertTime");
	// session.saveOrUpdate(at);
	// tx.commit();
	// return at.getSerial();
	// } catch (Exception e) {
	// SessionUtil.getInstance().rollbackTx(tx, "");
	// e.printStackTrace();
	// throw new MedrexException("Error Saving Alert Time Record");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// }
	//
	// public synchronized List<AlertTime> getAlertTimeRecords(Alert serial)
	// throws MedrexException{
	// List result = null;
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// result = session
	// .createCriteria(AlertTime.class)
	// .add(Restrictions.eq("alertId", serial)).list();
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving Alert Time List");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return result;
	// }
	//
	// public synchronized void deletegetAlertTimeRecord(int serial) throws
	// MedrexException{
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// session
	// .createQuery(
	// "delete from AlertTime as pa where pa.alertId="
	// + serial).executeUpdate();
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// SessionUtil.getInstance().rollbackTx(tx, "");
	// throw new MedrexException("Error deleting Alert Time Records");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// }

	public synchronized List<CalculatedAlert> getCalculatedAlertList()
			throws MedrexException {
		List<CalculatedAlert> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(CalculatedAlert.class).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Alert Time List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void insertOrUpdateCalculatedAlert(Alert alert)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// System.out.println("Before:" +new Date());
			session.createSQLQuery(
					"{Call calculateAlertProc(" + alert.getSerial() + ")}")
					.executeUpdate();
			// System.out.println("After:" +new Date());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error inserting Calculated Alert");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<CalculatedAlert> getCalculatedAlertListByUser(
			int currentLoggedInUserKey, String str, int key, String str2)
			throws MedrexException {
		List<CalculatedAlert> result = new ArrayList<CalculatedAlert>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List list = session.createSQLQuery(
					"{Call calculatedAlertViewProc(" + currentLoggedInUserKey
							+ ", '" + str + "', " + key + ", '" + str2 + "')}")
					.list();
			Iterator it = list.iterator();
			while (it.hasNext()) {
				Object[] o = (Object[]) it.next();
				CalculatedAlert pta = new CalculatedAlert();
				pta.setNotes((String) o[0]);
				pta.setAlertDate((Date) o[1]);
				pta.setOwnerStatus(Integer.parseInt(o[2].toString()));
				pta.setSerial(Integer.parseInt(o[3].toString()));
				pta.setUpdater(Integer.parseInt(o[4].toString()));
				result.add(pta);
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error updating Calculated Alert");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getCalculatedAlert(int id) throws MedrexException {
		int value = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			value = (Integer) session
					.createSQLQuery(
							"SELECT a.owner FROM calculatedalert AS ca INNER JOIN alert AS a ON ca.alertId = a.serial WHERE ca.serial = "
									+ id).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error inserting Calculated Alert");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return value;
	}

	public synchronized CalculatedAlert getCalculatedAlertBean(int serial)
			throws MedrexException {
		CalculatedAlert result = new CalculatedAlert();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = (CalculatedAlert) session.createCriteria(
					CalculatedAlert.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error updating Calculated Alert");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void insertOrUpdateCalculatedAlert(CalculatedAlert pa)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from CalculatedAlert");
			session.saveOrUpdate(pa);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Calcualted Alert Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void suspendAlert(int serial, int time, String type)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session
					.createSQLQuery(
							"delete from CalculatedAlert where alertId="
									+ serial
									+ " AND alertDate>NOW() AND alertDate<(DATE_ADD(NOW(), INTERVAL "
									+ time + " " + type + "))").executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Deleting PendingAlert");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getAllAlertCounts(int currentLoggedInUserKey)
			throws MedrexException {
		// List<CalculatedAlert> result = new ArrayList<CalculatedAlert>();
		List list = new ArrayList();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			list = session.createSQLQuery(
					"{Call calculatedAlertCountProc(" + currentLoggedInUserKey
							+ ")}").list();
			// Iterator it = list.iterator();
			// int i = 0;
			// while (it.hasNext()) {
			// Object[] o = (Object[])it.next();
			// CalculatedAlert pta = new CalculatedAlert();
			// pta.setNotes((String) o[0]);
			// pta.setAlertDate((Date) o[1]);
			// pta.setOwnerStatus(Integer.parseInt(o[2].toString()));
			// pta.setSerial(Integer.parseInt(o[3].toString()));
			// pta.setUpdater(Integer.parseInt(o[4].toString()));
			// result.add(pta);
			// }
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error updating Calculated Alert");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return list;
	}

	public synchronized void generateCalculatedAlertAtFixTime()
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createSQLQuery("{Call CalculateAlertAtTimeProc()}")
					.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error inserting Calculated Alert");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
