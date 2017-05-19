package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderAdvanceDirectives;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PhysicianOrderAdvanceDirectivesDAO {

	private static PhysicianOrderAdvanceDirectivesDAO PhyAdvanceDao = null;

	public static synchronized PhysicianOrderAdvanceDirectivesDAO getInstance() {

		// if obj is null create it , else just return it
		if (PhyAdvanceDao == null) {
			PhyAdvanceDao = new PhysicianOrderAdvanceDirectivesDAO();

		} // end if

		return (PhyAdvanceDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianOrderAdvanceDirectives(
			PhysicianOrderAdvanceDirectives phyadvance) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderAdvanceDirectives");
			session.saveOrUpdate(phyadvance);
			tx.commit();

			return phyadvance.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving PhysicianOrderAdvanceDirectives");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void deletePhysicianOrderAdvanceDirectives(int serial)
			throws MedrexException {
		PhysicianOrderAdvanceDirectives phyadvance = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			phyadvance = (PhysicianOrderAdvanceDirectives) session.load(
					PhysicianOrderAdvanceDirectives.class, serial);
			phyadvance.getDNR();
			session.delete(phyadvance);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Physician Order Advance Directives");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public PhysicianOrderAdvanceDirectives getPhysicianOrderAdvanceDirectives(
			int serial) throws MedrexException {
		PhysicianOrderAdvanceDirectives phyadvance = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// phyresp = (PhysicianOrderRespiratoryTherapy)
			// session.load(PhysicianOrderRespiratoryTherapy.class,
			// serial);

			phyadvance = (PhysicianOrderAdvanceDirectives) session
					.createCriteria(PhysicianOrderAdvanceDirectives.class).add(
							Restrictions.eq("serial", serial)).uniqueResult();
			phyadvance.getDNR();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error in retrieving from Physician Order Advance Directives");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return phyadvance;
	}
}
