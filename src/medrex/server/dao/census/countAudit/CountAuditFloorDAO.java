package medrex.server.dao.census.countAudit;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.countAudit.CountAuditFloor;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CountAuditFloorDAO {

	private CountAuditFloorDAO() {
	}

	private static CountAuditFloorDAO refCountAuditFloorDao = null;

	public static synchronized CountAuditFloorDAO getInstance() {

		// if obj is null create it , else just return it
		if (refCountAuditFloorDao == null) {
			refCountAuditFloorDao = new CountAuditFloorDAO();

		} // end if

		return (refCountAuditFloorDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateCountAuditFloor(
			CountAuditFloor refCountAuditFloor) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from CountAuditFloor");
			session.saveOrUpdate(refCountAuditFloor);
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving CountAuditFloor");
		} finally {
			SessionUtil.getInstance().closeSession(session);
			return refCountAuditFloor.getSerial();
		}
	}

	public synchronized List<CountAuditFloor> getCountAuditFloors()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from CountAuditFloor").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving CountAuditFloor List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CountAuditFloor getCountAuditFloor(int serial)
			throws MedrexException {
		CountAuditFloor refCountAuditFloor = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refCountAuditFloor = (CountAuditFloor) session.load(
					CountAuditFloor.class, serial);
			refCountAuditFloor.getReason();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving CountAuditFloors");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refCountAuditFloor;
	}

	public synchronized void deleteCountAuditFloor(int serial)
			throws MedrexException {

		CountAuditFloor refCountAuditFloor = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refCountAuditFloor = (CountAuditFloor) session.load(
					CountAuditFloor.class, serial);
			refCountAuditFloor.getSerial();
			session.delete(refCountAuditFloor);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting CountAuditFloor Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	/*
	 * public synchronized String get1stFloorResident() throws MedrexException {
	 * Object count = null; Session session =
	 * SessionUtil.getInstance().getSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); count =
	 * session.createCriteria(ResidentMain.class)
	 * .add(Expression.or(Expression.eq("floorType", "1st floor south wing"),
	 * Expression.eq("floorType", "Main north wing")))
	 * .setProjection(Projections.count("floorType"))
	 * .add(Expression.isNotNull("room")) .uniqueResult(); //
	 * System.out.println("count is :" + count); tx.commit(); } catch (Exception
	 * e) { e.printStackTrace(); throw new
	 * MedrexException("Error retrieving CountAuditFloors"); } finally {
	 * SessionUtil.getInstance().closeSession(session); } return
	 * count.toString(); }
	 */

	public synchronized String get1stFloorResident() throws MedrexException {
		int count = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			new Date();
			tx = session.beginTransaction();
			count = ((BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(*) FROM inhouse AS inh LEFT JOIN temproomhistory AS th ON inh.residentId = th.residentId WHERE (th.floor = '1st floor south wing' OR th.floor = 'Main north wing') AND ( (NOW() BETWEEN th.startDate AND th.endDate) OR (th.startDate <= NOW() AND th.endDate IS NULL ) ) AND th.room IS NOT NULL;")
					.uniqueResult()).intValue();

			// System.out.println("count is :" + count);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException("Getting first floor count on dashboard");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return count + "".toString();
	}

	public synchronized String get2ndFloorResident() throws MedrexException {
		int count = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			new Date();
			tx = session.beginTransaction();
			count = ((BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(*) FROM inhouse AS inh LEFT JOIN temproomhistory AS th ON inh.residentId = th.residentId WHERE (th.floor = '2nd floor south wing' OR th.floor = 'Main and north wing') AND ( (NOW() BETWEEN th.startDate AND th.endDate) OR (th.startDate <= NOW() AND th.endDate IS NULL ) )AND th.room IS NOT NULL")
					.uniqueResult()).intValue();

			// System.out.println("second count is :" + count);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException("Getting second floor count on dashboard");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return count + "";
	}

	/*
	 * public synchronized String get2ndFloorResident() throws MedrexException {
	 * Object count = null; Session session =
	 * SessionUtil.getInstance().getSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); count =
	 * session.createCriteria(ResidentMain.class)
	 * .add(Expression.or(Expression.eq("floorType", "2nd floor south wing"),
	 * Expression.eq("floorType", "Main and north wing")))
	 * .setProjection(Projections.count("floorType"))
	 * .add(Expression.isNotNull("room")) .uniqueResult(); //
	 * System.out.println("count is :" + count); tx.commit(); } catch (Exception
	 * e) { e.printStackTrace(); throw new
	 * MedrexException("Error retrieving CountAuditFloors"); } finally {
	 * SessionUtil.getInstance().closeSession(session); } return
	 * count.toString(); }
	 */

}
