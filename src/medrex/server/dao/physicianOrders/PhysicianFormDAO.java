package medrex.server.dao.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class PhysicianFormDAO {

	private PhysicianFormDAO() {
	}

	private static PhysicianFormDAO refPhysicianFormDao = null;

	public static synchronized PhysicianFormDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPhysicianFormDao == null) {
			refPhysicianFormDao = new PhysicianFormDAO();

		} // end if

		return (refPhysicianFormDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianForm(
			PhysicianForm refPhysicianForm) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianForm");
			session.saveOrUpdate(refPhysicianForm);
			tx.commit();

			return refPhysicianForm.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PhysicianForm");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPhysicianForms(int residentId)

	throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			/*
			 * result = session.createQuery(
			 * "from PhysicianForm as ls where ls.residentId=" + physicianType
			 * +"Order by endDate desc").list();
			 */
			result = session.createCriteria(PhysicianForm.class).add(
					Restrictions.eq("resident.serial", residentId)).addOrder(
					Order.desc("endDate")).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PhysicianForm List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PhysicianForm getResidentPhysician(int residentId,
			int physicianType) throws MedrexException {
		PhysicianForm result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			result = (PhysicianForm) session.createQuery(
					"from PhysicianForm as ls where ls.residentId="
							+ residentId + " AND ls.physicianId="
							+ physicianType).uniqueResult();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PhysicianForm List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PhysicianForm getPhysicianForm(int serial)
			throws MedrexException {
		PhysicianForm refPhysicianForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianForm = (PhysicianForm) session.load(
					PhysicianForm.class, serial);
			// refPhysicianForm.getPhysicianId();
			refPhysicianForm.getPhysician();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PhysicianForms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPhysicianForm;
	}

	public synchronized void deletePhysicianForm(int serial) throws Exception {

		PhysicianForm refPhysicianForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianForm = (PhysicianForm) session.load(
					PhysicianForm.class, serial);
			// refPhysicianForm.getPhysicianId();
			refPhysicianForm.getPhysician();
			session.delete(refPhysicianForm);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting PhysicianForm Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
