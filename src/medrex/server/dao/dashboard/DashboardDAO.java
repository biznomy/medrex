package medrex.server.dao.dashboard;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import medrex.commons.enums.CensusConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.dashboard.Dashboard;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class DashboardDAO {

	private DashboardDAO() {
	}

	private static DashboardDAO refDao = null;

	public static synchronized DashboardDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDao == null) {
			refDao = new DashboardDAO();

		} // end if

		return (refDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateDashboard(Dashboard ref)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from Dashboard");
			session.saveOrUpdate(ref);
			tx.commit();

			return ref.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Dashboard");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<Dashboard> getDashboards() throws MedrexException {
		List<Dashboard> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from Dashboard").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Dashboard List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Dashboard getDashboard(int serial)
			throws MedrexException {
		Dashboard ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (Dashboard) session.load(Dashboard.class, serial);
			ref.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Dashboards");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized Dashboard getDashboard(String type)
			throws MedrexException {
		Dashboard ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (Dashboard) session.createQuery(
					"from Dashboard as d where d.name='" + type + "'")
					.uniqueResult();
			if (ref != null) {
				ref.getSerial();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Dashboards");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized int getCensusLastDayAdmissionCount()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = Integer.parseInt(session
					.createCriteria(CensusStatus.class).setProjection(
							Projections.rowCount()).add(
							Expression.eq("typeName",
									CensusConstants.TYPE_ADMISSION)).add(
							Restrictions.sqlRestriction("date(dateAndTime)='"
									+ sdf.format(prevDate) + "'"))
					.uniqueResult().toString());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error Census Last Day Admission Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getCensusLastDayAdmissionFirstFloorCount()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = ((BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(*) FROM censusstatus AS cs LEFT JOIN residentmain AS rs ON cs.residentId=rs.serial WHERE cs.typeName = '"
									+ CensusConstants.TYPE_ADMISSION
									+ "' AND DATE(dateAndTime)='"
									+ sdf.format(prevDate)
									+ "' AND (rs.floorType='1st floor south wing' OR rs.floorType='Main north wing' AND rs.room IS NOT NULL)")
					.uniqueResult()).intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error Census Last Day Admission First floor Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getCensusLastDayAdmissionSecondFloorCount()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = ((BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(*) FROM censusstatus AS cs LEFT JOIN residentmain AS rs ON cs.residentId=rs.serial WHERE cs.typeName = '"
									+ CensusConstants.TYPE_ADMISSION
									+ "' AND DATE(dateAndTime)='"
									+ sdf.format(prevDate)
									+ "' AND (rs.floorType='2nd floor south wing' OR rs.floorType='Main and north wing' AND rs.room IS NOT NULL)")
					.uniqueResult()).intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error Census Last Day Admission First floor Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getCensusLastDayDischargeCount()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = Integer.parseInt(session
					.createCriteria(CensusStatus.class).setProjection(
							Projections.rowCount()).add(
							Expression.eq("typeName",
									CensusConstants.TYPE_DISCHARGE)).add(
							Restrictions.sqlRestriction("date(dateAndTime)='"
									+ sdf.format(prevDate) + "'"))
					.uniqueResult().toString());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error Census Last Day discharge Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getCensusLastDayDischargeFirstFloorCount()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = ((BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(*) FROM censusstatus AS cs LEFT JOIN residentmain AS rs ON cs.residentId=rs.serial WHERE cs.typeName = '"
									+ CensusConstants.TYPE_DISCHARGE
									+ "' AND DATE(dateAndTime)='"
									+ sdf.format(prevDate)
									+ "' AND (rs.floorType='1st floor south wing' OR rs.floorType='Main north wing' AND rs.room IS NOT NULL)")
					.uniqueResult()).intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error Census Last Day Admission First floor Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int getCensusLastDayDischargeSecondFloorCount()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = ((BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(*) FROM censusstatus AS cs LEFT JOIN residentmain AS rs ON cs.residentId=rs.serial WHERE cs.typeName = '"
									+ CensusConstants.TYPE_DISCHARGE
									+ "' AND DATE(dateAndTime)='"
									+ sdf.format(prevDate)
									+ "' AND (rs.floorType='2nd floor south wing' OR rs.floorType='Main and north wing' AND rs.room IS NOT NULL)")
					.uniqueResult()).intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error Census Last Day Admission First floor Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusLastDayAdmissionResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = session
					.createSQLQuery(
							"SELECT cs.residentId,rs.floorType FROM censusstatus AS cs LEFT JOIN residentmain AS rs ON cs.residentId=rs.serial WHERE cs.typeName = '"
									+ CensusConstants.TYPE_ADMISSION
									+ "' AND DATE(dateAndTime)='"
									+ sdf.format(prevDate)
									+ "' AND rs.room IS NOT NULL").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error Census Last Day Admission records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusLastDayAdmissionFirstFloorResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = session
					.createSQLQuery(
							"SELECT cs.residentId,rs.floorType FROM censusstatus AS cs LEFT JOIN residentmain AS rs ON cs.residentId=rs.serial WHERE cs.typeName = '"
									+ CensusConstants.TYPE_ADMISSION
									+ "' AND DATE(dateAndTime)='"
									+ sdf.format(prevDate)
									+ "' AND (rs.floorType='1st floor south wing' OR rs.floorType='Main north wing' AND rs.room IS NOT NULL)")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error Census Last Day Admission records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusLastDayAdmissionSecondFloorResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = session
					.createSQLQuery(
							"SELECT cs.residentId,rs.floorType FROM censusstatus AS cs LEFT JOIN residentmain AS rs ON cs.residentId=rs.serial WHERE cs.typeName = '"
									+ CensusConstants.TYPE_ADMISSION
									+ "' AND DATE(dateAndTime)='"
									+ sdf.format(prevDate)
									+ "' AND (rs.floorType='2nd floor south wing' OR rs.floorType='Main and north wing' AND rs.room IS NOT NULL)")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error Census Last Day Admission records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusLastDayDischargeResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = session
					.createSQLQuery(
							"SELECT cs.residentId,rs.floorType FROM censusstatus AS cs LEFT JOIN residentmain AS rs ON cs.residentId=rs.serial WHERE cs.typeName = '"
									+ CensusConstants.TYPE_DISCHARGE
									+ "' AND DATE(dateAndTime)='"
									+ sdf.format(prevDate)
									+ "' AND rs.room IS NOT NULL").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error Census Last Day Discharge records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusLastDayDischargeFirstFloorResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = session
					.createSQLQuery(
							"SELECT cs.residentId,rs.floorType FROM censusstatus AS cs LEFT JOIN residentmain AS rs ON cs.residentId=rs.serial WHERE cs.typeName = '"
									+ CensusConstants.TYPE_DISCHARGE
									+ "' AND DATE(dateAndTime)='"
									+ sdf.format(prevDate)
									+ "' AND (rs.floorType='1st floor south wing' OR rs.floorType='Main north wing' AND rs.room IS NOT NULL)")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error Census Last Day Discharge first floor records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusLastDayDischargeSecondFloorResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date prevDate = new Date();
			prevDate.setDate(prevDate.getDate() - 1);
			result = session
					.createSQLQuery(
							"SELECT cs.residentId,rs.floorType FROM censusstatus AS cs LEFT JOIN residentmain AS rs ON cs.residentId=rs.serial WHERE cs.typeName = '"
									+ CensusConstants.TYPE_DISCHARGE
									+ "' AND DATE(dateAndTime)='"
									+ sdf.format(prevDate)
									+ "' AND (rs.floorType='2nd floor south wing' OR rs.floorType='Main and north wing' AND rs.room IS NOT NULL)")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error Census Last Day Discharge second floor records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void deleteDashboard(int serial) throws MedrexException {
		Dashboard ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (Dashboard) session.load(Dashboard.class, serial);
			ref.getSerial();
			session.delete(ref);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Dashboard Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}