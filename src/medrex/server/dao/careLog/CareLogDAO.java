package medrex.server.dao.careLog;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.careLog.CareLog;
import medrex.commons.vo.careLog.CareLogMaster;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CareLogDAO {

	private CareLogDAO() {
	}

	private static CareLogDAO careLogDao = null;

	public static synchronized CareLogDAO getInstance() {

		// if obj is null create it , else just return it
		if (careLogDao == null) {
			careLogDao = new CareLogDAO();

		} // end if

		return (careLogDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateCareLog(CareLog cnaAdl)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from CareLog");
			session.saveOrUpdate(cnaAdl);
			tx.commit();
			// GlobalCareLog.currentCareLogKey =cnaAdl.getSerial();
			return cnaAdl.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Admissions Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getCareLogForResident(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from CareLog as ar where ar.residentId=" + residentSerial)
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CareLog getCareLog(int id) throws MedrexException {
		CareLog result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = (CareLog) session.createQuery(
					"from CareLog as ar where ar.serial=" + id).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	/* new methods for Use */

	public int insertOrUpdateCareLog(CareLogMaster careLogMaster)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from CareLogMaster");
			careLogMaster = (CareLogMaster) session.merge(careLogMaster);
			tx.commit();
			int serial = careLogMaster.getSerial();
			return serial;
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Care Log Master Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public List<CareLogMaster> getCareLogMasterForResident(
			int currentResidenceKey) throws MedrexException {
		List<CareLogMaster> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(CareLogMaster.class).add(
					Restrictions.eq("residentId", currentResidenceKey))
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public CareLogMaster getCareLogMaster(int careLogSerial)
			throws MedrexException {
		CareLogMaster result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = (CareLogMaster) session
					.createCriteria(CareLogMaster.class).add(
							Restrictions.eq("serial", careLogSerial))
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving careLog Master");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}
}
