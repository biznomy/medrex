package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRespiratoryTherapy;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianOrderRespiratoryTherapyDAO {

	private static PhysicianOrderRespiratoryTherapyDAO PhyRespiratoryDao = null;

	public static synchronized PhysicianOrderRespiratoryTherapyDAO getInstance() {

		// if obj is null create it , else just return it
		if (PhyRespiratoryDao == null) {
			PhyRespiratoryDao = new PhysicianOrderRespiratoryTherapyDAO();

		} // end if

		return (PhyRespiratoryDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianOrderRespiratoryTherapy(
			PhysicianOrderRespiratoryTherapy phyresp) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderRespiratoryTherapy");
			session.saveOrUpdate(phyresp);
			tx.commit();

			return phyresp.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving PhysicianOrderRespiratoryTherapy");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void deletePhysicianOrderRespiratoryTherapy(int serial)
			throws MedrexException {
		PhysicianOrderRespiratoryTherapy phyresp = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			phyresp = (PhysicianOrderRespiratoryTherapy) session.load(
					PhysicianOrderRespiratoryTherapy.class, serial);
			phyresp.getOxygen();
			session.delete(phyresp);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Physician Order Diet");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public PhysicianOrderRespiratoryTherapy getPhysicianOrderRespiratoryTherapy(
			int serial) throws MedrexException {
		PhysicianOrderRespiratoryTherapy phyresp = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			phyresp = (PhysicianOrderRespiratoryTherapy) session.load(
					PhysicianOrderRespiratoryTherapy.class, serial);
			System.out.println("serial: " + serial);
			// phyresp = (PhysicianOrderRespiratoryTherapy)
			// session.createCriteria(PhysicianOrderRespiratoryTherapy.class)
			// .add(Restrictions.eq("serial", serial)).uniqueResult();
			phyresp.getOxygen();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Phys Diets form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return phyresp;
	}
}
