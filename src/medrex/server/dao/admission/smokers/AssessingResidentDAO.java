package medrex.server.dao.admission.smokers;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.smokers.AssessingResident1;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AssessingResidentDAO {

	private AssessingResidentDAO() {
	}

	private static AssessingResidentDAO assessResDao = null;

	public static synchronized AssessingResidentDAO getInstance() {

		// if obj is null create it , else just return it
		if (assessResDao == null) {
			assessResDao = new AssessingResidentDAO();

		} // end if

		return (assessResDao);

	}

	public synchronized int insertOrUpdateAssessingResident1(
			AssessingResident1 refAssessingResident1) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from AssessingResident1");
			session.saveOrUpdate(refAssessingResident1);
			tx.commit();
			return refAssessingResident1.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving refAssessingResident1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public AssessingResident1 getAssessingResident1(
			int currentAssessingResident1) throws MedrexException {
		AssessingResident1 assessingResident1 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// assessingResident1 = (AssessingResident1) session.load(
			// AssessingResident1.class, currentAssessingResident1);
			assessingResident1 = (AssessingResident1) session.createCriteria(
					AssessingResident1.class).add(
					Restrictions.eq("serial", currentAssessingResident1))
					.uniqueResult();
			// System.out.println("dao assessingResident2.getNameOfResident(): "+assessingResident1.getNameOfResident());
			// assessingResident1.getNameOfResident();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving assessingResident1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return assessingResident1;
	}

	public void deleteAccessingResident1(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		AssessingResident1 assessingRes = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// session.createSQLQuery("delete from msjn where formId = "+formId);
			assessingRes = (AssessingResident1) session.createCriteria(
					AssessingResident1.class).add(
					Restrictions.eq("serial", formId)).uniqueResult();
			session.delete(assessingRes);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error deleting assessingRes");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
}
