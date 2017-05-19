package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.ResidentStatusSheet;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ResidentStatusSheetDAO {
	private ResidentStatusSheetDAO() {

	}

	private static ResidentStatusSheetDAO residentStatusSheetDAO = null;

	public static synchronized ResidentStatusSheetDAO getInstance() {

		// if obj is null create it , else just return it
		if (residentStatusSheetDAO == null) {
			residentStatusSheetDAO = new ResidentStatusSheetDAO();

		} // end if

		return (residentStatusSheetDAO);

	}

	public synchronized int insertOrUpdateResidentStatusSheet(
			ResidentStatusSheet residentStatusSheet) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from ResidentStatusSheet");
			session.saveOrUpdate(residentStatusSheet);
			tx.commit();
			return residentStatusSheet.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ResidentStatusSheet");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentStatusSheet getResidentStatusSheet(int formId)
			throws MedrexException {
		ResidentStatusSheet residentStatusSheet = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentStatusSheet = (ResidentStatusSheet) session.createCriteria(
					ResidentStatusSheet.class).add(
					Restrictions.eq("formId", formId)).uniqueResult();

			residentStatusSheet.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResidentStatusSheet");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return residentStatusSheet;
	}

	public synchronized void deleteResidentStatusSheet(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		ResidentStatusSheet residentStatusSheet = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			residentStatusSheet = (ResidentStatusSheet) session.createCriteria(
					ResidentStatusSheet.class).add(
					Restrictions.eq("formId", formId)).uniqueResult();
			session.delete(residentStatusSheet);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error deleting ResidentStatusSheet");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
