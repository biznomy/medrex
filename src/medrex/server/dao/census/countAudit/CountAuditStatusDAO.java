package medrex.server.dao.census.countAudit;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.countAudit.CountAuditStatus;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CountAuditStatusDAO {

	private CountAuditStatusDAO() {
	}

	private static CountAuditStatusDAO refCountAuditStatusDao = null;

	public static synchronized CountAuditStatusDAO getInstance() {

		// if obj is null create it , else just return it
		if (refCountAuditStatusDao == null) {
			refCountAuditStatusDao = new CountAuditStatusDAO();

		} // end if

		return (refCountAuditStatusDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateCountAuditStatus(
			CountAuditStatus refCountAuditStatus) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from CountAuditStatus");
			session.saveOrUpdate(refCountAuditStatus);
			tx.commit();

			return refCountAuditStatus.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving CountAuditStatus");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<CountAuditStatus> getCountAuditStatuss()
			throws MedrexException {
		List<CountAuditStatus> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from CountAuditStatus").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving CountAuditStatus List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CountAuditStatus getCountAuditStatus(int serial)
			throws MedrexException {
		CountAuditStatus refCountAuditStatus = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refCountAuditStatus = (CountAuditStatus) session.load(
					CountAuditStatus.class, serial);
			refCountAuditStatus.getTimestamp();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving CountAuditStatuss");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refCountAuditStatus;
	}

	public synchronized CountAuditStatus getCountAuditStatusOfToday()
			throws MedrexException {
		CountAuditStatus refCountAuditStatus = null;
		List<CountAuditStatus> records = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			records = session.createCriteria(CountAuditStatus.class).add(
					Restrictions.sqlRestriction("date(timestamp) = curdate()"))
					.addOrder(Order.desc("timestamp")).setMaxResults(1).list();
			if (records != null && records.size() > 0) {
				refCountAuditStatus = records.get(0);
				refCountAuditStatus.getTimestamp();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving CountAuditStatuss");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refCountAuditStatus;
	}

	public synchronized void deleteCountAuditStatus(int serial)
			throws MedrexException {

		CountAuditStatus refCountAuditStatus = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refCountAuditStatus = (CountAuditStatus) session.load(
					CountAuditStatus.class, serial);
			refCountAuditStatus.getSerial();
			session.delete(refCountAuditStatus);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting CountAuditStatus Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
