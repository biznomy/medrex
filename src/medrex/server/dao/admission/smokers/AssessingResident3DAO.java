package medrex.server.dao.admission.smokers;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.smokers.AssessingResident3;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AssessingResident3DAO {

	private AssessingResident3DAO() {
	}

	private static AssessingResident3DAO assessRes3Dao = null;

	public static synchronized AssessingResident3DAO getInstance() {

		// if obj is null create it , else just return it
		if (assessRes3Dao == null) {
			assessRes3Dao = new AssessingResident3DAO();

		} // end if

		return (assessRes3Dao);

	}

	public synchronized int insertOrUpdateAssessingResident3(
			AssessingResident3 refAssessingResident3) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from AssessingResident3");
			session.saveOrUpdate(refAssessingResident3);
			tx.commit();
			return refAssessingResident3.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving AssessingResident3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public AssessingResident3 getAssessingResident3(
			int currentAssessingResident3) throws MedrexException {
		AssessingResident3 assessingResident3 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			// assessingResident1 = (AssessingResident1) session.load(
			// AssessingResident1.class, currentAssessingResident1);
			assessingResident3 = (AssessingResident3) session.createCriteria(
					AssessingResident3.class).add(
					Restrictions.eq("formId", currentAssessingResident3))
					.uniqueResult();
			// System.out.println("dao assessingResident1.getNameOfResident(): "+assessingResident2.getNameOfResident());
			// assessingResident2.getNameOfResident();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving assessingResident1");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return assessingResident3;
	}

	public void deleteAccessingResident3(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		AssessingResident3 assessingRes3 = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// session.createSQLQuery("delete from msjn where formId = "+formId);
			assessingRes3 = (AssessingResident3) session.createCriteria(
					AssessingResident3.class).add(
					Restrictions.eq("formId", formId)).uniqueResult();
			session.delete(assessingRes3);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error deleting assessingRes3");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
