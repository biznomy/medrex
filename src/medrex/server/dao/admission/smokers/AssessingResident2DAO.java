package medrex.server.dao.admission.smokers;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.smokers.AssessingResident2;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AssessingResident2DAO {

	private AssessingResident2DAO() {
	}

	private static AssessingResident2DAO assessRes2Dao = null;

	public static synchronized AssessingResident2DAO getInstance() {

		// if obj is null create it , else just return it
		if (assessRes2Dao == null) {
			assessRes2Dao = new AssessingResident2DAO();

		} // end if

		return (assessRes2Dao);

	}

	public synchronized int insertOrUpdateAssessingResident2(
			AssessingResident2 refAssessingResident2) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from AssessingResident2");
			session.saveOrUpdate(refAssessingResident2);
			tx.commit();
			return refAssessingResident2.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving refAssessingResident2");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public AssessingResident2 getAssessingResident2(
			int currentAssessingResident2) throws MedrexException {
		AssessingResident2 assessingResident2 = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			// assessingResident1 = (AssessingResident1) session.load(
			// AssessingResident1.class, currentAssessingResident1);
			assessingResident2 = (AssessingResident2) session.createCriteria(
					AssessingResident2.class).add(
					Restrictions.eq("formId", currentAssessingResident2))
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
		return assessingResident2;
	}

	public void deleteAccessingResident2(int formId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		AssessingResident2 assessingRes2 = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// session.createSQLQuery("delete from msjn where formId = "+formId);
			assessingRes2 = (AssessingResident2) session.createCriteria(
					AssessingResident2.class).add(
					Restrictions.eq("formId", formId)).uniqueResult();
			session.delete(assessingRes2);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error deleting assessingRes");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
}
