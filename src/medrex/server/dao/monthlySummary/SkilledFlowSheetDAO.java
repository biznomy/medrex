package medrex.server.dao.monthlySummary;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.SkilledFlowSheet;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class SkilledFlowSheetDAO {

	private SkilledFlowSheetDAO() {
	}

	private static SkilledFlowSheetDAO refSkilledFlowSheet = null;

	public static synchronized SkilledFlowSheetDAO getInstance() {

		// if obj is null create it , else just return it
		if (refSkilledFlowSheet == null) {
			refSkilledFlowSheet = new SkilledFlowSheetDAO();

		} // end if

		return (refSkilledFlowSheet);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateSkilledFlowSheet(
			SkilledFlowSheet refSkilledFlowSheet) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from SkilledFlowSheet");
			session.saveOrUpdate(refSkilledFlowSheet);
			tx.commit();

			return refSkilledFlowSheet.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving DietaryAlertSheet");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<SkilledFlowSheet> getSkilledFlowSheets(
			int residentSerial) throws MedrexException {
		List<SkilledFlowSheet> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from SkilledFlowSheet as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving SkilledFlowSheet List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized SkilledFlowSheet getSkilledFlowSheet(int formId)
			throws MedrexException {
		SkilledFlowSheet refSkilledFlowSheet = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refSkilledFlowSheet = (SkilledFlowSheet) session.createCriteria(
					SkilledFlowSheet.class).add(
					Restrictions.eq("formId", formId)).uniqueResult();
			refSkilledFlowSheet.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving SkilledFlowSheet");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refSkilledFlowSheet;
	}

	public synchronized void deleteSkilledFlowSheet(int formId)
			throws MedrexException {

		SkilledFlowSheet refSkilledFlowSheet = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refSkilledFlowSheet = (SkilledFlowSheet) session.createCriteria(
					SkilledFlowSheet.class).add(
					Restrictions.eq("formId", formId)).uniqueResult();
			refSkilledFlowSheet.getSerial();
			session.delete(refSkilledFlowSheet);
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
