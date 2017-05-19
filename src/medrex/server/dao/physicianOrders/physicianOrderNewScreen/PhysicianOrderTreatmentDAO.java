package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTreatment;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianOrderTreatmentDAO {
	private PhysicianOrderTreatmentDAO() {
	}

	private static PhysicianOrderTreatmentDAO refPhysTreatDao = null;

	public static synchronized PhysicianOrderTreatmentDAO getInstance() {

		if (refPhysTreatDao == null) {
			refPhysTreatDao = new PhysicianOrderTreatmentDAO();

		}

		return (refPhysTreatDao);

	}

	public synchronized int insertOrUpdatePhysicianOrderTreat(
			PhysicianOrderTreatment refPhysTreat) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderTreatment");
			session.saveOrUpdate(refPhysTreat);
			tx.commit();

			return refPhysTreat.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PhysicianOrderTreatment");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public PhysicianOrderTreatment getPhysicianOrderTreatment(int serial)
			throws MedrexException {
		PhysicianOrderTreatment refTreat = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refTreat = (PhysicianOrderTreatment) session.load(
					PhysicianOrderTreatment.class, serial);
			refTreat.getChairCushion();
			refTreat.getFoamDressing();
			refTreat.isDaysAndPrn();
			refTreat.getQ();
			refTreat.getAntifungal();
			refTreat.isOffLoad();
			refTreat.getLocationSkinTears();
			refTreat.getLocationWound();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Phys Treatment form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refTreat;
	}

	public void deletePhysicianOrderTreatment(int serial)
			throws MedrexException {

		PhysicianOrderTreatment refPhysTreat = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysTreat = (PhysicianOrderTreatment) session.load(
					PhysicianOrderTreatment.class, serial);
			session.delete(refPhysTreat);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Physician Order Treatment");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
