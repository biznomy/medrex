package medrex.server.dao.census.counts;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.dataObj.census.DashboardInfo;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.census.counts.InHouse;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.dao.SessionUtil;
import medrex.server.service.resident.ResidentMainService;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

public class InHouseDAO {

	public InHouseDAO() {
	}

	private static InHouseDAO refDao = null;

	public static synchronized InHouseDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDao == null) {
			refDao = new InHouseDAO();

		} // end if

		return (refDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateInHouse(InHouse ref)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from InHouse");
			session.saveOrUpdate(ref);
			tx.commit();

			return ref.getSerial();

		} catch (Exception e) {

			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving InHouse");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	/*
	 * public synchronized List<InHouse> getInHouses() throws MedrexException {
	 * List<InHouse> result = null; Session session =
	 * SessionUtil.getInstance().getSession(); Transaction tx = null; try {
	 * 
	 * tx = session.beginTransaction(); result =
	 * session.createQuery("from InHouse").list(); tx.commit(); } catch
	 * (Exception e) {
	 * 
	 * e.printStackTrace(); throw new
	 * MedrexException("Error retrieving InHouse List"); } finally {
	 * SessionUtil.getInstance().closeSession(session); } return result; }
	 */

	public synchronized List<DashboardInfo> getInHouses()
			throws MedrexException {
		List<DashboardInfo> result = new ArrayList<DashboardInfo>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			List tempList = session
					.createSQLQuery(
							"SELECT rm.serial, c.admittedOn, c.fromId, c.tfloor, c.troom FROM (SELECT inh.residentId AS residentId, inh.admittedOn AS admittedOn, inh.fromId AS fromId, th.floor AS tfloor, th.room AS troom  FROM inhouse AS inh LEFT JOIN temproomhistory AS th ON inh.residentId = th.residentId WHERE ((NOW() BETWEEN th.startDate AND th.endDate) OR (th.startDate <= NOW() AND th.endDate IS NULL )) AND th.room IS NOT NULL) AS c JOIN residentmain AS rm ON rm.serial = c.residentId ORDER BY rm.userPass ASC;")
					.list();
			tx.commit();

			Iterator itr = tempList.iterator();
			while (itr.hasNext()) {
				DashboardInfo dashIfo = new DashboardInfo();
				Object[] obj = (Object[]) itr.next();
				int resId = Integer.parseInt(obj[0] + "");
				ResidentMain res = new ResidentMainService().getResident(resId);
				dashIfo.setResmain(res);
				dashIfo.setAdmittedOn((Date) obj[1]);
				dashIfo.setFromId(Integer.parseInt(obj[2] + ""));
				dashIfo.setCurrentFloor(obj[3] + "");
				dashIfo.setCurrentRoom(obj[4] + "");

				result.add(dashIfo);
			}
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving InHouse List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getInHouseCount() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session.createSQLQuery(
					"select count(residentId) as total from InHouse ")
					.uniqueResult();
			result = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving InHouse Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized boolean getResidentExistInHouse(int residentId)
			throws MedrexException {
		boolean bool;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			BigInteger bigInt = (BigInteger) session.createSQLQuery(
					"select count(inh.residentId) from InHouse as inh where inh.residentId = "
							+ residentId).uniqueResult();
			int result = bigInt.intValue();
			tx.commit();
			if (result == 0) {
				bool = false;
			} else {
				bool = true;
			}
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving InHouse Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return bool;
	}

	public synchronized InHouse getInHouse(int residentId)
			throws MedrexException {
		InHouse ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (InHouse) session.createCriteria(InHouse.class, "h").add(
					Expression.eq("h.residentId", residentId)).uniqueResult();
			if (ref != null) {
				ref.getResidentId();
			}
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving InHouses");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized void deleteInHouse(int residentId)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createSQLQuery(
					"delete from InHouse where residentId=" + residentId)
					.executeUpdate();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting InHouse Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<InHouse> getAllWithInHouse(
			CensusStatus refCensusStatus) throws MedrexException {
		List<InHouse> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(InHouse.class).add(
					Restrictions.eq("censusStatus", refCensusStatus)).list();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			throw new MedrexException("Error retrieving InHouse List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void deleteSerial(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session
					.createSQLQuery(
							"delete from InHouse where serial=" + serial)
					.executeUpdate();
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting BedHold Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
