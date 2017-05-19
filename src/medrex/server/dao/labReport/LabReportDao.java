package medrex.server.dao.labReport;

import java.math.BigInteger;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.reports.Report;
import medrex.server.dao.HibernateUtil;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.JDBCConnectionException;

public class LabReportDao {

	public LabReportDao() {

	}

	private static LabReportDao labReportDao = null;

	public static synchronized LabReportDao getInstance() {
		// if obj is null create it , else just return it
		if (labReportDao == null) {
			labReportDao = new LabReportDao();

		} // end if

		return (labReportDao);
	}

	public synchronized void insertOrUpdatedLabReportText(Report rep)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(rep);
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
			throw new MedrexException("Error Saving labReport Information");
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving labReport Information");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getLabReportList(int residentid)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(Report.class).add(
					Restrictions.eq("residentId", residentid)).list();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
			throw new MedrexException("Error retrieving labReport Information");
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving labReport Information");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Report getLabReports(int serial) throws MedrexException {
		Report rep = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			rep = (Report) session.createCriteria(Report.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
			throw new MedrexException("Error retrieving labReport Information");
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error retrieving labReport Information");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rep;
	}

	public synchronized int firstFloorNewLabReportsCount()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = ((BigInteger) session
					.createSQLQuery(
							"select count(*) from report as rt left join residentmain as rs on rt.residentId=rs.serial where rt.isNew = true and rs.floorType='1st floor south wing' or rs.floorType='Main north wing'")
					.uniqueResult()).intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingForm Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int secondFloorNewLabReportsCount()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = ((BigInteger) session
					.createSQLQuery(
							"select count(*) from report as rt left join residentmain as rs on rt.residentId=rs.serial where rt.isNew = true and rs.floorType='2nd floor south wing' or rs.floorType='Main and north wing'")
					.uniqueResult()).intValue();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingForm Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getAllNewLabReportsResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createSQLQuery(
							"select rt.residentId, count(rt.labReportText),rm.floorType from report as rt left join residentmain as rm on rm.serial=rt.residentId where rt.isNew=true AND rm.room IS NOT NULL  group by rt.residentId")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving FirstFloorNewLabReportResidents");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getFirstFloorNewLabReportResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createSQLQuery(
							"select rt.residentId, count(rt.labReportText),rm.floorType from report as rt left join residentmain as rm on rm.serial=rt.residentId where rt.isNew=true and (rm.floorType='1st floor south wing' OR rm.floorType='Main north wing') AND rm.room IS NOT NULL  group by rt.residentId")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving FirstFloorNewLabReportResidents");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getSecondFloorNewLabReportResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createSQLQuery(
							"select rt.residentId, count(rt.labReportText),rm.floorType from report as rt left join residentmain as rm on rm.serial=rt.residentId where rt.isNew=true and (rm.floorType='2nd floor south wing' OR rm.floorType='Main and north wing') AND rm.room IS NOT NULL  group by rt.residentId")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving SecondFloorNewLabReportResidents");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}
}
