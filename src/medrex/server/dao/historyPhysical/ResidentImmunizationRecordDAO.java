package medrex.server.dao.historyPhysical;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.historyAndPhysical.ResidentImmunizationRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ResidentImmunizationRecordDAO {

	private ResidentImmunizationRecordDAO() {
	}

	private static ResidentImmunizationRecordDAO refMadexFormDao = null;

	public static synchronized ResidentImmunizationRecordDAO getInstance() {

		// if obj is null create it , else just return it
		if (refMadexFormDao == null) {
			refMadexFormDao = new ResidentImmunizationRecordDAO();

		} // end if

		return (refMadexFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateResidentImmunizationRecord(
			ResidentImmunizationRecord refResidentImmunizationRecord)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from ResidentImmunizationRecord");
			session.saveOrUpdate(refResidentImmunizationRecord);
			tx.commit();
			return refResidentImmunizationRecord.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Madex Form 2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getResidentImmunizationRecords(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ResidentImmunizationRecord as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex Form 2 List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ResidentImmunizationRecord getResidentImmunizationRecord(
			int formId) throws MedrexException {
		ResidentImmunizationRecord refResidentImmunizationRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentImmunizationRecord = (ResidentImmunizationRecord) session
					.createCriteria(ResidentImmunizationRecord.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();

			refResidentImmunizationRecord.getAnnualPPD2Immunization1();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Madex 2 Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refResidentImmunizationRecord;
	}

	public synchronized void deleteResidentImmunizationRecord(int serial)
			throws Exception {

		ResidentImmunizationRecord refResidentImmunizationRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentImmunizationRecord = (ResidentImmunizationRecord) session
					.load(ResidentImmunizationRecord.class, serial);
			refResidentImmunizationRecord.getAnnualPPD2Immunization1();
			session.delete(refResidentImmunizationRecord);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting Madex Form 2 Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
