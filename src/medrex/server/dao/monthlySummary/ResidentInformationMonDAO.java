package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.ResidentInformation;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ResidentInformationMonDAO {
	private ResidentInformationMonDAO() {

	}

	private static ResidentInformationMonDAO residentInformationMonDAO = null;

	public static synchronized ResidentInformationMonDAO getInstance() {

		// if obj is null create it , else just return it
		if (residentInformationMonDAO == null) {
			residentInformationMonDAO = new ResidentInformationMonDAO();

		} // end if

		return (residentInformationMonDAO);

	}

	public int insertOrUpdateResidentInformation(
			ResidentInformation residentInformation) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			// System.out.println(refMonthlySummaryPage1.getResidentName());
			tx = session.beginTransaction();
			session.createQuery("from ResidentInformation");
			session.saveOrUpdate(residentInformation);
			tx.commit();
			return residentInformation.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ResidentInformation");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentInformation getResidentInformation(
			int currentResidentInformationKey) throws MedrexException {
		ResidentInformation residentInformation = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentInformation = (ResidentInformation) session.load(
					ResidentInformation.class, currentResidentInformationKey);
			residentInformation.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving msjn");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return residentInformation;
	}

	public void deleteResidentInformation(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		ResidentInformation residentInformation = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// session.createSQLQuery("delete from msjn where formId = "+formId);
			residentInformation = (ResidentInformation) session.createCriteria(
					ResidentInformation.class).add(
					Restrictions.eq("formId", formId)).uniqueResult();
			session.delete(residentInformation);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error deleting residentInformation");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
