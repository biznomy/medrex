package medrex.server.dao.monthlySummary;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.DietaryAlertSheet;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DietaryAlertSheetDAO {

	private DietaryAlertSheetDAO() {
	}

	private static DietaryAlertSheetDAO refDietaryAlertSheetDao = null;

	public static synchronized DietaryAlertSheetDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDietaryAlertSheetDao == null) {
			refDietaryAlertSheetDao = new DietaryAlertSheetDAO();

		} // end if

		return (refDietaryAlertSheetDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateDietaryAlertSheet(
			DietaryAlertSheet refDietaryAlertSheet) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from DietaryAlertSheet");
			session.saveOrUpdate(refDietaryAlertSheet);
			tx.commit();

			return refDietaryAlertSheet.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving DietaryAlertSheet");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<DietaryAlertSheet> getDietaryAlertSheets(
			int residentSerial) throws MedrexException {
		List<DietaryAlertSheet> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from DietaryAlertSheet as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving DietaryAlertSheet List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized DietaryAlertSheet getDietaryAlertSheet(int serial)
			throws MedrexException {
		DietaryAlertSheet refDietaryAlertSheet = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refDietaryAlertSheet = (DietaryAlertSheet) session.createCriteria(
					DietaryAlertSheet.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			refDietaryAlertSheet.getDiets();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving DietaryAlertSheets");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refDietaryAlertSheet;
	}

	public synchronized void deleteDietaryAlertSheet(int serial)
			throws MedrexException {

		DietaryAlertSheet refDietaryAlertSheet = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refDietaryAlertSheet = (DietaryAlertSheet) session.createCriteria(
					DietaryAlertSheet.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			refDietaryAlertSheet.getDiets();
			session.delete(refDietaryAlertSheet);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting DietaryAlertSheet Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
}
