package medrex.server.dao.census.countAudit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.countAudit.CountAudit;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CountAuditDAO {

	private CountAuditDAO() {
	}

	private static CountAuditDAO refCountAuditDao = null;

	public static synchronized CountAuditDAO getInstance() {

		// if obj is null create it , else just return it
		if (refCountAuditDao == null) {
			refCountAuditDao = new CountAuditDAO();

		} // end if

		return (refCountAuditDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateCountAudit(CountAudit refCountAudit)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			// session.createQuery("from CountAudit");
			session.saveOrUpdate(refCountAudit);
			tx.commit();

			return refCountAudit.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving CountAudit");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<CountAudit> getCountAudits()
			throws MedrexException {
		List<CountAudit> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from CountAudit").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving CountAudit List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<CountAudit> getCountAudits(Date date)
			throws MedrexException {
		List<CountAudit> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(CountAudit.class).add(
					Restrictions.sqlRestriction("dateAndTime = '"
							+ new SimpleDateFormat("yyyy-MM-dd").format(date)
							+ "'")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving CountAudit List according to date");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CountAudit getCountAudit(int serial)
			throws MedrexException {
		CountAudit refCountAudit = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refCountAudit = (CountAudit) session.load(CountAudit.class, serial);
			refCountAudit.getDateAndTime();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving CountAudits");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refCountAudit;
	}

	public synchronized int getCountAuditSeialByDateFloor(Date date,
			String floor) throws MedrexException {
		int result = 0;
		CountAudit cAudit = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			cAudit = (CountAudit) session.createCriteria(CountAudit.class).add(
					Restrictions.eq("floor", floor)).add(
					Restrictions.sqlRestriction("date(dateAndTime) = '"
							+ new SimpleDateFormat("yyyy-MM-dd").format(date)
							+ "'")).uniqueResult();
			if (cAudit != null) {
				result = cAudit.getSerial();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving count audit.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void deleteCountAudit(int serial)
			throws MedrexException {

		CountAudit refCountAudit = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refCountAudit = (CountAudit) session.load(CountAudit.class, serial);
			refCountAudit.getSerial();
			session.delete(refCountAudit);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting CountAudit Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
