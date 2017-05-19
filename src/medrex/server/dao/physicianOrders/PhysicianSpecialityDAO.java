package medrex.server.dao.physicianOrders;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicianSpeciality;
import medrex.commons.vo.physicianOrders.PhysicianSpecialityRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianSpecialityDAO {

	private PhysicianSpecialityDAO() {
	}

	private static PhysicianSpecialityDAO physicianSpecialityDAO = null;

	public static synchronized PhysicianSpecialityDAO getInstance() {

		// if obj is null create it , else just return it
		if (physicianSpecialityDAO == null) {
			physicianSpecialityDAO = new PhysicianSpecialityDAO();

		} // end if

		return (physicianSpecialityDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianSpeciality(
			PhysicianSpeciality ps) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PhysicianSpeciality");
			session.saveOrUpdate(ps);
			tx.commit();
			return ps.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving physician speciality Form ");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getPhysicianSpecialitys(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from PhysicianSpeciality as ar where ar.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Physician Speciality Record List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PhysicianSpeciality getPhysicianSpeciality(int serial)
			throws MedrexException {
		PhysicianSpeciality psp = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			psp = (PhysicianSpeciality) session.load(PhysicianSpeciality.class,
					serial);
			psp.getResidentId();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Physician speciality");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return psp;
	}

	public synchronized void deletePhysicianSpeciality(int serial)
			throws MedrexException {
		PhysicianSpeciality psp = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			psp = (PhysicianSpeciality) session.load(PhysicianSpeciality.class,
					serial);
			psp.getResidentId();
			session.delete(psp);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting physician records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// / PhysicianSpecialityRow

	public synchronized int insertOrUpdatePhysicianSpecialityRow(
			PhysicianSpecialityRow psr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PhysicianSpecialityRow");
			session.saveOrUpdate(psr);
			tx.commit();
			return psr.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Physician Speciality Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized PhysicianSpecialityRow getPhysicianSpecialityRow(
			int formId, int formNum) throws MedrexException {
		PhysicianSpecialityRow psr = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			psr = (PhysicianSpecialityRow) session
					.createQuery(
							"from PhysicianSpecialityRow as aliasp where aliasp.physicianSpecialitySerial = "
									+ formId
									+ " AND aliasp.physicianSpecialityRowSerial = "
									+ formNum).uniqueResult();
			psr.getMedicationOrders();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retreiving physician record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return psr;
	}

}
