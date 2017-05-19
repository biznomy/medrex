package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderSafetyPrecautions;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianOrderSafetyPrecautionsDAO {

	private static PhysicianOrderSafetyPrecautionsDAO PhySafetyDao = null;

	public synchronized int insertOrUpdatePhysicianOrderSafetyPrecautions(
			PhysicianOrderSafetyPrecautions physafety) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderSafetyPrecautions");
			session.saveOrUpdate(physafety);
			tx.commit();

			return physafety.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving PhysicianOrderSafetyPrecautions");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public static synchronized PhysicianOrderSafetyPrecautionsDAO getInstance() {
		if (PhySafetyDao == null) {
			PhySafetyDao = new PhysicianOrderSafetyPrecautionsDAO();

		}

		return (PhySafetyDao);
	}

	public void deletePhysicianOrderSafetyPrecautions(int serial)
			throws MedrexException {

		PhysicianOrderSafetyPrecautions physafety = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			physafety = (PhysicianOrderSafetyPrecautions) session.load(
					PhysicianOrderSafetyPrecautions.class, serial);
			physafety.getFallRisk();
			session.delete(physafety);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Physician Order Safety Precautions");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public PhysicianOrderSafetyPrecautions getPhysicianOrderSafetyPrecautions(
			int formId) throws MedrexException {
		PhysicianOrderSafetyPrecautions physafety = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			physafety = (PhysicianOrderSafetyPrecautions) session.load(
					PhysicianOrderSafetyPrecautions.class, formId);

			physafety.getFallRisk();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Phys Diets form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return physafety;
	}
}
