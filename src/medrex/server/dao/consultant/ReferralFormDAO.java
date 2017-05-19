package medrex.server.dao.consultant;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.consultant.ReferralForm;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReferralFormDAO {

	private ReferralFormDAO() {
	}

	private static ReferralFormDAO referralFormDao = null;

	public static synchronized ReferralFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (referralFormDao == null) {
			referralFormDao = new ReferralFormDAO();

		} // end if

		return (referralFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateReferralForm(ReferralForm rf)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ReferralForm");
			session.saveOrUpdate(rf);
			tx.commit();
			return rf.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving Resident Assessment Form Page1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getReferralForms(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ReferralForm as ar where ar.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Admissions Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ReferralForm getReferralForm(int serial)
			throws MedrexException {
		ReferralForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ReferralForm) session.load(ReferralForm.class,
					serial);
			admissionRecord.getNarrativeComments();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public synchronized void deleteReferralForm(int serial)
			throws MedrexException {
		ReferralForm admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = (ReferralForm) session.load(ReferralForm.class,
					serial);
			admissionRecord.getNarrativeComments();
			session.delete(admissionRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
