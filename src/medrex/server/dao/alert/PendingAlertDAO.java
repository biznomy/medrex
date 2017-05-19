package medrex.server.dao.alert;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.alert.CalculatedAlert;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PendingAlertDAO {

	private PendingAlertDAO() {

	}

	private static PendingAlertDAO paDAO = null;

	public static synchronized PendingAlertDAO getInstance() {
		if (paDAO == null) {
			paDAO = new PendingAlertDAO();

		}
		return (paDAO);
	}

	// public synchronized int insertOrUpdatePendingAlert(PendingAlert pa)
	// throws MedrexException {
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// session.createQuery("from PendingAlert");
	// session.saveOrUpdate(pa);
	// tx.commit();
	// return pa.getSerial();
	// } catch (Exception e) {
	// SessionUtil.getInstance().rollbackTx(tx, "");
	// e.printStackTrace();
	// throw new MedrexException("Error Saving Pending Alert Record");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// }

	/*
	 * public synchronized List getPendingAlertList(int currentResidenceKey,
	 * String str, int key, String type) throws MedrexException { List result =
	 * null; List<PendingAlert> list = new ArrayList<PendingAlert>(); int size =
	 * 0; list = getPendingAlerts(key); if (list != null) { size = list.size();
	 * } Session session = SessionUtil.getInstance().getSession(); Transaction
	 * tx = null; try { tx = session.beginTransaction(); if
	 * (type.equalsIgnoreCase("Administrator") || size != 0) { result =
	 * session.createCriteria(PendingAlert.class) .add(Restrictions.eq("status",
	 * "Active")) .add(Restrictions.eq("residentId", currentResidenceKey))
	 * .add(Restrictions.or(Restrictions.like("recieverId", "%"+str+"%"),
	 * Restrictions.eq("owner", key))).list(); } else { result =
	 * session.createCriteria(PendingAlert.class) .add(Restrictions.eq("status",
	 * "Active")) .add(Restrictions.eq("ownerStatus", 1))
	 * .add(Restrictions.eq("residentId", currentResidenceKey))
	 * .add(Restrictions.or(Restrictions.like("recieverId", "%"+str+"%"),
	 * Restrictions.eq("owner", key))).list(); } tx.commit(); } catch (Exception
	 * e) { e.printStackTrace(); throw new
	 * MedrexException("Error Retrieving Pending Alert List"); } finally {
	 * SessionUtil.getInstance().closeSession(session); } return result; }
	 */

	// private List<PendingAlert> getPendingAlerts(int key) throws
	// MedrexException{
	// List<PendingAlert> l = new ArrayList<PendingAlert>();
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// l = session.createCriteria(PendingAlert.class)
	// .add(Restrictions.eq("owner", key)).list();
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving Pending Alert List");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return l;
	// }
	//
	// public synchronized void deletePendingAlertRecord(int id) throws
	// MedrexException {
	// PendingAlert pa = null;
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// session
	// .createQuery(
	// "delete from PendingAlert as pa where pa.alertSerial="
	// + id).executeUpdate();
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// SessionUtil.getInstance().rollbackTx(tx, "");
	// throw new MedrexException("Error deleting Pending Alert Records");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// }
	public synchronized List getPendingAlertRecords(int currentAlertKey)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PendingAlert as pa where pa.alertSerial="
							+ currentAlertKey).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Pending Alert List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getTotalPendingAlertCount() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session
					.createSQLQuery(
							"select count(residentId) as total from PendingAlert as p WHERE p.status='Active'")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getResidentPendingAlerts(String str, int key,
			int upTime, String upType, int pastTime, String pastType)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			if (str.equalsIgnoreCase("Resident Past")) {
				result = session
						.createSQLQuery(
								"SELECT a.residentId, COUNT(ca.serial) FROM alert AS a LEFT JOIN calculatedAlert AS ca ON ca.alertId = a.serial WHERE a.residentId <> 100000 AND ca.alertDate < NOW() AND ca.alertDate > DATE_SUB(NOW(), INTERVAL "
										+ pastTime
										+ " "
										+ pastType
										+ ") AND ca.ownerStatus = 1  GROUP BY a.residentId")
						.list();
			} else if (str.equalsIgnoreCase("Resident Future")) {
				result = session
						.createSQLQuery(
								"SELECT a.residentId, COUNT(ca.serial) FROM alert AS a LEFT JOIN calculatedAlert AS ca ON ca.alertId = a.serial WHERE a.residentId <> 100000 AND ca.alertDate > NOW() AND ca.alertDate < DATE_ADD(NOW(), INTERVAL "
										+ upTime
										+ " "
										+ upType
										+ ") AND ca.ownerStatus = 1  GROUP BY a.residentId")
						.list();
			} else if (str.equalsIgnoreCase("I Send Out")) {
				result = session
						.createSQLQuery(
								"SELECT a.residentId, COUNT(ca.serial) FROM alert AS a LEFT JOIN calculatedAlert AS ca ON ca.alertId = a.serial WHERE a.residentId <> 100000 AND ca.alertDate > DATE_SUB(NOW(), INTERVAL "
										+ pastTime
										+ " "
										+ pastType
										+ ") AND ca.alertDate < DATE_ADD(NOW(), INTERVAL "
										+ upTime
										+ " "
										+ upType
										+ ") AND a.owner = "
										+ key
										+ " GROUP BY a.residentId").list();
			} else if (str.equalsIgnoreCase("Completed")) {
				result = session
						.createSQLQuery(
								"SELECT a.residentId, COUNT(ca.serial) FROM alert AS a LEFT JOIN calculatedAlert AS ca ON ca.alertId = a.serial WHERE a.residentId <> 100000 AND ca.alertDate > DATE_SUB(NOW(), INTERVAL "
										+ pastTime
										+ " "
										+ pastType
										+ ") AND ca.alertDate < DATE_ADD(NOW(), INTERVAL "
										+ upTime
										+ " "
										+ upType
										+ ") AND ca.ownerStatus = 2 GROUP BY a.residentId")
						.list();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error retriving pending alerts records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getUpcomingAlerts(int time, String type, String key)
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(SERIAL)FROM PendingAlert AS p WHERE p.status='Active' AND p.alertTime>NOW() AND p.alertTime<(DATE_ADD(NOW(), INTERVAL "
									+ time
									+ " "
									+ type
									+ ")) AND p.residentId <> 100000 AND p.recieverId LIKE '%"
									+ key + "%' AND p.ownerStatus=1")
					.uniqueResult();
			result = bigInt.intValue();
			// Criteria crit = session.createCriteria(PendingAlert.class)
			// .add(Restrictions.eq("status", "Active"))
			// .add(Restrictions.gt("alertTime", new Date()))
			// .add(Restrictions.between("alertTime", new Date(), hi))
			// .add(Restrictions.like("recieverId", "%key%"));
			// ProjectionList projList =
			// Projections.projectionList().add(Projections.groupProperty("recieverId")).add(Projections.count("recieverId"));
			// crit.setProjection(projList);
			// result = crit.list().size();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getTotalPastAlerts(String key)
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(SERIAL)FROM PendingAlert AS p WHERE p.status='Active' AND p.alertTime<NOW() AND p.residentId <> 100000 AND p.recieverId LIKE '%"
									+ key + "%' AND p.ownerStatus=1")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	// public synchronized List getGlobalPendingAlertList(int globalAlertId)
	// throws MedrexException {
	// List result = null;
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	//
	// try {
	//
	// tx = session.beginTransaction();
	// result = session
	// .createQuery(
	// "from PendingAlert as pa where pa.residentId="
	// + globalAlertId).list();
	//
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving Pending Alert List");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return result;
	// }

	public synchronized int getGlobalUpcomingAlerts(int time, String type,
			String key) throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(SERIAL)FROM PendingAlert AS p WHERE p.status='Active' AND p.alertTime>NOW() AND p.alertTime<(DATE_ADD(NOW(), INTERVAL "
									+ time
									+ " "
									+ type
									+ ")) AND p.residentId = 100000 AND p.recieverId LIKE '%"
									+ key + "%' AND p.ownerStatus=1")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getGlobalTotalPastAlerts(String key)
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(SERIAL)FROM PendingAlert AS p WHERE p.status='Active' AND p.alertTime<NOW() AND p.residentId = 100000 AND p.recieverId LIKE '%"
									+ key + "%' AND p.ownerStatus=1")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	// public synchronized PendingAlert getPendingAlert(int
	// currentPendingAlertKey) throws MedrexException {
	// PendingAlert pa = null;
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// pa = (PendingAlert) session.load(PendingAlert.class,
	// currentPendingAlertKey);
	// pa.getAlertSerial();
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving Pending Alert Forms");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return pa;
	// }

	// public synchronized List<PendingAlert> getPendingAlertList(String string)
	// throws MedrexException {
	// List result = null;
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	//		
	// try {
	// tx = session.beginTransaction();
	// // Criteria crit =
	// session.createCriteria(PendingAlert.class).add(Restrictions.like("recieverId",
	// "'%"+string+"%'"));
	// result =
	// session.createQuery("from PendingAlert as pa WHERE pa.recieverId LIKE '%"+string+"%' and pa.ownerStatus=1").list();
	// // System.out.println("String is ;" + result.size());
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// SessionUtil.getInstance().rollbackTx(tx, "");
	// throw new MedrexException("Error retriving pending alert records");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return result;
	// }

	public synchronized List getResidentFutureAlerts(int time, String type,
			String key) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createSQLQuery(
							"SELECT p.residentId, count(p.serial) FROM PendingAlert AS p WHERE p.status='Active' AND p.alertTime>NOW() AND p.alertTime<(DATE_ADD(NOW(), INTERVAL "
									+ time
									+ " "
									+ type
									+ ")) AND p.residentId <> 100000 AND p.recieverId LIKE '%"
									+ key
									+ "%' AND p.ownerStatus=1 group by p.residentId")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error retriving pending alerts records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getGlobalPendingAlerts(String key)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createSQLQuery(
							"SELECT p.residentId, count(p.serial) FROM PendingAlert AS p WHERE p.status='Active' AND p.alertTime<NOW() AND p.residentId = 100000 AND p.recieverId LIKE '%"
									+ key + "%' group by p.residentId").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error retriving pending alerts records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getCompletedAlertsCount(int key, String str)
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			BigInteger i = (BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(p.ownerStatus)FROM PendingAlert AS p WHERE p.ownerStatus=2 AND p.residentId <> 100000 AND p.owner="
									+ key).uniqueResult();
			result = i.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getAlertCountSentByMe(int key)
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			BigInteger i = (BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(p.ownerStatus)FROM PendingAlert AS p WHERE p.residentId <> 100000 AND p.owner="
									+ key).uniqueResult();
			result = i.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getGlobalCompletedAlertsCount(int key, String str)
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			BigInteger i = (BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(p.ownerStatus)FROM PendingAlert AS p WHERE p.ownerStatus=2 AND p.residentId = 100000 AND p.owner="
									+ key).uniqueResult();
			result = i.intValue();
			// System.out.println("count is:" + result);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getGlobalAlertCountSentByMe(int key)
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			BigInteger i = (BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(p.ownerStatus)FROM PendingAlert AS p WHERE p.residentId = 100000 AND p.owner="
									+ key).uniqueResult();
			result = i.intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingAlert Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	// public synchronized List<PendingAlert> getPendingPastAlertList(int
	// currentResidenceKey,
	// String currentLoggedInUserName, int currentLoggedInUserKey,
	// String currentLoggedInUserType)throws MedrexException {
	// List result = null;
	// List<PendingAlert> list = new ArrayList<PendingAlert>();
	// int size = 0;
	// list = getPendingAlerts(currentLoggedInUserKey);
	// if (list != null) {
	// size = list.size();
	// }
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// if (currentLoggedInUserType.equalsIgnoreCase("Administrator") || size !=
	// 0) {
	// result = session.createCriteria(PendingAlert.class)
	// .add(Restrictions.eq("status", "Active"))
	// .add(Restrictions.eq("residentId", currentResidenceKey))
	// .add(Restrictions.sqlRestriction("alertTime<NOW()"))
	// .add(Restrictions.or(Restrictions.like("recieverId",
	// "%"+currentLoggedInUserName+"%"), Restrictions.eq("owner",
	// currentLoggedInUserKey))).list();
	// } else {
	// result = session.createCriteria(PendingAlert.class)
	// .add(Restrictions.eq("status", "Active"))
	// .add(Restrictions.eq("ownerStatus", 1))
	// .add(Restrictions.eq("residentId", currentResidenceKey))
	// .add(Restrictions.sqlRestriction("alertTime<NOW()"))
	// .add(Restrictions.or(Restrictions.like("recieverId",
	// "%"+currentLoggedInUserName+"%"), Restrictions.eq("owner",
	// currentLoggedInUserKey))).list();
	// }
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving Pending Alert List");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return result;
	// }
	//
	// public synchronized List<PendingAlert> getPendingUpcomingAlertList(int
	// alertTime, String alertType,
	// int currentResidenceKey, String currentLoggedInUserName,
	// int currentLoggedInUserKey, String currentLoggedInUserType)throws
	// MedrexException {
	// List result = null;
	// List<PendingAlert> list = new ArrayList<PendingAlert>();
	// int size = 0;
	// list = getPendingAlerts(currentLoggedInUserKey);
	// if (list != null) {
	// size = list.size();
	// }
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// if (currentLoggedInUserType.equalsIgnoreCase("Administrator") || size !=
	// 0) {
	// result = session.createCriteria(PendingAlert.class)
	// .add(Restrictions.eq("status", "Active"))
	// .add(Restrictions.eq("residentId", currentResidenceKey))
	// .add(Restrictions.sqlRestriction("alertTime>NOW() AND alertTime<(DATE_ADD(NOW(), INTERVAL "+alertTime+" "+alertType+"))"))
	// .add(Restrictions.or(Restrictions.like("recieverId",
	// "%"+currentLoggedInUserName+"%"), Restrictions.eq("owner",
	// currentLoggedInUserKey))).list();
	// } else {
	// result = session.createCriteria(PendingAlert.class)
	// .add(Restrictions.eq("status", "Active"))
	// .add(Restrictions.eq("ownerStatus", 1))
	// .add(Restrictions.eq("residentId", currentResidenceKey))
	// .add(Restrictions.sqlRestriction("alertTime>NOW() AND alertTime<(DATE_ADD(NOW(), INTERVAL "+alertTime+" "+alertType+"))"))
	// .add(Restrictions.or(Restrictions.like("recieverId",
	// "%"+currentLoggedInUserName+"%"), Restrictions.eq("owner",
	// currentLoggedInUserKey))).list();
	// }
	// tx.commit();
	// // System.out.println("List size is :" + result.size());
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving Pending Alert List");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return result;
	// }
	//
	// public synchronized List<PendingAlert> getPendingCompletedAlertList(
	// int currentResidenceKey, int currentLoggedInUserKey) throws
	// MedrexException {
	// List result = null;
	// List<PendingAlert> list = new ArrayList<PendingAlert>();
	// int size = 0;
	// list = getPendingAlerts(currentLoggedInUserKey);
	// if (list != null) {
	// size = list.size();
	// }
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// result = session.createCriteria(PendingAlert.class)
	// .add(Restrictions.eq("status", "Active"))
	// .add(Restrictions.eq("ownerStatus", 2))
	// .add(Restrictions.eq("owner", currentLoggedInUserKey))
	// .add(Restrictions.eq("residentId", currentResidenceKey)).list();
	// tx.commit();
	// // System.out.println("List size is :" + result.size());
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving Pending Alert List");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return result;
	// }
	//
	// public synchronized List<PendingAlert> getPendingISendOutAlertList(
	// int currentResidenceKey, int currentLoggedInUserKey) throws
	// MedrexException {
	// List result = null;
	// List<PendingAlert> list = new ArrayList<PendingAlert>();
	// int size = 0;
	// list = getPendingAlerts(currentLoggedInUserKey);
	// if (list != null) {
	// size = list.size();
	// }
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// result = session.createCriteria(PendingAlert.class)
	// .add(Restrictions.eq("status", "Active"))
	// .add(Restrictions.eq("owner", currentLoggedInUserKey))
	// .add(Restrictions.eq("residentId", currentResidenceKey)).list();
	// tx.commit();
	// // System.out.println("List size is :" + result.size());
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving Pending Alert List");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return result;
	// }
	//
	// public synchronized List getResidentAlertsISendOut(int
	// currentLoggedInUserKey) throws MedrexException {
	// List result = null;
	// List<PendingAlert> list = new ArrayList<PendingAlert>();
	// int size = 0;
	// list = getPendingAlerts(currentLoggedInUserKey);
	// if (list != null) {
	// size = list.size();
	// }
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// Criteria crit = session.createCriteria(PendingAlert.class)
	// .add(Restrictions.eq("status", "Active"))
	// .add(Restrictions.eq("owner", currentLoggedInUserKey))
	// .add(Restrictions.ne("residentId", 100000));
	// ProjectionList pList = Projections.projectionList()
	// .add(Projections.property("residentId"))
	// .add(Projections.count("serial"));
	// crit.setProjection(pList);
	// result = crit.list();
	// tx.commit();
	// // System.out.println("List size is :" + result.size());
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving Pending Alert List");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return result;
	// }
	//
	// public synchronized List getResidentAlertsCompleted(int
	// currentLoggedInUserKey) throws MedrexException {
	// List result = null;
	// List<PendingAlert> list = new ArrayList<PendingAlert>();
	// int size = 0;
	// list = getPendingAlerts(currentLoggedInUserKey);
	// if (list != null) {
	// size = list.size();
	// }
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// Criteria crit = session.createCriteria(PendingAlert.class)
	// .add(Restrictions.eq("status", "Active"))
	// .add(Restrictions.eq("owner", currentLoggedInUserKey))
	// .add(Restrictions.eq("ownerStatus", 2))
	// .add(Restrictions.ne("residentId", 100000));
	// ProjectionList pList = Projections.projectionList()
	// .add(Projections.property("residentId"))
	// .add(Projections.count("serial"));
	// crit.setProjection(pList);
	// result = crit.list();
	// tx.commit();
	// // System.out.println("List size is :" + result.size());
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Retrieving Pending Alert List");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// return result;
	// }

	// public synchronized void suspendAlert(int serial, int time, String type)
	// throws MedrexException {
	// Session session = SessionUtil.getInstance().getSession();
	// Transaction tx = null;
	// try {
	// tx = session.beginTransaction();
	// session.createSQLQuery("delete from PendingAlert where alertSerial="+serial+" AND alertTime>NOW() AND alertTime<(DATE_ADD(NOW(), INTERVAL "+time+" "+type+"))").executeUpdate();
	// tx.commit();
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw new MedrexException("Error Deleting PendingAlert");
	// } finally {
	// SessionUtil.getInstance().closeSession(session);
	// }
	// }

	public synchronized List getPendingAlertList(int currentResidenceKey,
			String str, int key, String type) throws MedrexException {
		List<CalculatedAlert> result = new ArrayList<CalculatedAlert>();
		// Session session = SessionUtil.getInstance().getSession();
		// Transaction tx = null;
		// try {
		// tx = session.beginTransaction();
		// List list =
		// session.createSQLQuery("{CALL pAlert('2010-01-01 14:24:09', 'ffff', "+1+", 'Days', "+2+", "+51+")}").list();
		// Iterator it = list.iterator();
		// int i = 0;
		// while (it.hasNext()) {
		// Object[] o = (Object[])it.next();
		// CalculatedAlert pta = new CalculatedAlert();
		// pta.setNotes((String) o[0]);
		// pta.setAlertDate((String) o[1]);
		// pta.setOwnerStatus(Integer.parseInt(o[2].toString()));
		// pta.setAlertId(Integer.parseInt(o[3].toString()));
		// result.add(pta);
		// }
		// tx.commit();
		// } catch (Exception e) {
		// e.printStackTrace();
		// throw new MedrexException("Error Retrieving Pending Alert List");
		// } finally {
		// SessionUtil.getInstance().closeSession(session);
		// }
		return result;
	}

	public synchronized List<CalculatedAlert> getCalculatedAlertList()
			throws MedrexException {
		List<CalculatedAlert> list = new ArrayList<CalculatedAlert>();
		// Session session = SessionUtil.getInstance().getSession();
		// Transaction tx = null;
		// try {
		// tx = session.beginTransaction();
		// Criteria crit = session.createCriteria(CalculatedAlert.class)
		// .add(Restrictions.eq("status", "Active"))
		// .add(Restrictions.eq("owner", currentLoggedInUserKey))
		// .add(Restrictions.eq("ownerStatus", 2))
		// .add(Restrictions.ne("residentId", 100000));
		// ProjectionList pList = Projections.projectionList()
		// .add(Projections.property("residentId"))
		// .add(Projections.count("serial"));
		// crit.setProjection(pList);
		// result = crit.list();
		// tx.commit();
		// // System.out.println("List size is :" + result.size());
		// } catch (Exception e) {
		// e.printStackTrace();
		// throw new MedrexException("Error Retrieving Pending Alert List");
		// } finally {
		// SessionUtil.getInstance().closeSession(session);
		// }
		return list;
	}

}
