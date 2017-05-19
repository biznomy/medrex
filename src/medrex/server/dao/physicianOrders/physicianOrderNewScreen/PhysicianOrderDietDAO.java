package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderAdvanceDirectives;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiets;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PhysicianOrderDietDAO {

	private PhysicianOrderDietDAO() {
	}

	private static PhysicianOrderDietDAO refPhysDietDao = null;

	public static synchronized PhysicianOrderDietDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPhysDietDao == null) {
			refPhysDietDao = new PhysicianOrderDietDAO();

		} // end if

		return (refPhysDietDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianOrderDiet(
			PhysicianOrderDiets refPhysDiet) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderDiets");
			session.saveOrUpdate(refPhysDiet);
			tx.commit();

			return refPhysDiet.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PhysicianOrderDiets");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public PhysicianOrderDiets getPhysicianOrderDiet(int serial)
			throws MedrexException {
		PhysicianOrderDiets refDiet = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			refDiet=(PhysicianOrderDiets) session.createCriteria(PhysicianOrderDiets.class)
			.add(Restrictions.eq("serial", serial)).uniqueResult();
			
			/*refDiet = (PhysicianOrderDiets) session.load(
					PhysicianOrderDiets.class, serial);*/
//			refDiet = (PhysicianOrderDiets) session.createCriteria(PhysicianOrderAdvanceDirectives.class).add(
//					Restrictions.eq("serial", serial)).uniqueResult();
			//refDiet.getAsSnack();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Phys Diets form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refDiet;
	}

	public void deletePhysicianOrderDiet(int serial) throws MedrexException {

		PhysicianOrderDiets refPhysdiet = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysdiet = (PhysicianOrderDiets) session.load(
					PhysicianOrderDiets.class, serial);
			refPhysdiet.getCalorieCount();
			session.delete(refPhysdiet);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Physician Order Diet");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	/*
	 * public synchronized List getPrescriptions(int residentSerial) throws
	 * MedrexException { List result = null; Session session =
	 * SessionUtil.getInstance().getSession(); Transaction tx = null; try {
	 * 
	 * tx = session.beginTransaction(); result = session.createQuery(
	 * "from Prescription as ls where ls.residentId=" + residentSerial).list();
	 * tx.commit(); } catch (Exception e) { e.printStackTrace(); throw new
	 * MedrexException( "Error retrieving Physician Order Form 3 List"); }
	 * finally { SessionUtil.getInstance().closeSession(session); } return
	 * result; }
	 * 
	 * public synchronized List getPrescriptions() throws MedrexException { List
	 * result = null; Session session = SessionUtil.getInstance().getSession();
	 * Transaction tx = null; try {
	 * 
	 * tx = session.beginTransaction(); result = session.createQuery(
	 * "from Prescription as ls group by ls.residentId").list(); tx.commit(); }
	 * catch (Exception e) { e.printStackTrace(); throw new MedrexException(
	 * "Error retrieving Physician Order Form 3 List"); } finally {
	 * SessionUtil.getInstance().closeSession(session); } return result; }
	 * 
	 * public synchronized Prescription getPrescription(int serial) throws
	 * MedrexException { Prescription refPrescription = null; Session session =
	 * SessionUtil.getInstance().getSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); refPrescription = (Prescription)
	 * session.load(Prescription.class, serial); refPrescription.getNotes();
	 * tx.commit(); } catch (Exception e) { e.printStackTrace(); throw new
	 * MedrexException("Error retrieving Madex 2 Forms"); } finally {
	 * SessionUtil.getInstance().closeSession(session); } return
	 * refPrescription; }
	 * 
	 * public synchronized void deletePrescription(int serial) throws Exception
	 * {
	 * 
	 * Prescription refPrescription = null; Session session =
	 * SessionUtil.getInstance().getSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); refPrescription = (Prescription)
	 * session.load(Prescription.class, serial); refPrescription.getFrequency();
	 * session.delete(refPrescription); tx.commit(); } catch (Exception e) {
	 * e.printStackTrace(); SessionUtil.getInstance().rollbackTx(tx, ""); throw
	 * new Exception("Error deleting Madex Form 2 Records"); } finally {
	 * SessionUtil.getInstance().closeSession(session); }
	 * 
	 * }
	 */

}
