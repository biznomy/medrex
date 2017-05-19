package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.ResidentTransferForm;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ResidentTransferDAO {
	private ResidentTransferDAO() {

	}

	private static ResidentTransferDAO residentTransferDAO = null;

	public static synchronized ResidentTransferDAO getInstance() {

		// if obj is null create it , else just return it
		if (residentTransferDAO == null) {
			residentTransferDAO = new ResidentTransferDAO();

		} // end if

		return (residentTransferDAO);

	}

	public synchronized int insertOrUpdateResidentTransfer(
			ResidentTransferForm residentTransfer) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			// System.out.println(refMonthlySummaryPage1.getResidentName());
			tx = session.beginTransaction();
			session.createQuery("from ResidentTransferForm");
			session.saveOrUpdate(residentTransfer);
			tx.commit();
			return residentTransfer.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ResidentTransferForm");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentTransferForm getResidentTransferForm(int formId)
			throws MedrexException {
		ResidentTransferForm residentTransferForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentTransferForm = (ResidentTransferForm) session
					.createCriteria(ResidentTransferForm.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();

			residentTransferForm.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving msjn");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return residentTransferForm;
	}

	public synchronized void deleteResidentTransferForm(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		ResidentTransferForm residentTransferForm = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// session.createSQLQuery("delete from msjn where formId = "+formId);
			residentTransferForm = (ResidentTransferForm) session
					.createCriteria(ResidentTransferForm.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();
			session.delete(residentTransferForm);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error deleting residentTransferForm");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
