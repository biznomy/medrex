package medrex.server.service.physicianOrders.physicianOrderNewScreen;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderDiets;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTherapyTest;
import medrex.server.dao.SessionUtil;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderDietDAO;

public class PhysicianOrderTherapyTestDAO {

	private	PhysicianOrderTherapyTestDAO(){
	
}
	private static PhysicianOrderTherapyTestDAO phyTherapyDao = null;

	public static PhysicianOrderTherapyTestDAO getInstance() {
	
		// if obj is null create it , else just return it
		if (phyTherapyDao == null) {
			phyTherapyDao = new PhysicianOrderTherapyTestDAO();

		} // end if

		return (phyTherapyDao);

	} // end - getUniqueInstance - method
	

	
	
	public static PhysicianOrderTherapyTest getPhysicianOrderTherapyTest(int serial) 
	throws MedrexException{
	
		PhysicianOrderTherapyTest refphytherapy = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refphytherapy = (PhysicianOrderTherapyTest) 
			session.createCriteria(PhysicianOrderTherapyTest.class)
			.add(Restrictions.eq("serial", serial)).uniqueResult();
			//refphytherapy.getDuration();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving phy intravinous therapy");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refphytherapy;
	}
	
	
	
	
	public synchronized int insertOrUpdatePhysicianOrderTherapyTest(PhysicianOrderTherapyTest refphytherapy) 
	throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from PhysicianOrderTherapyTest");
			session.saveOrUpdate(refphytherapy);
			tx.commit();
			return refphytherapy.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving PhysicianOrderTherapyTest");
		} 
		finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	
	
	public void deletePhysicianOrderTherapyTest(int serial) throws MedrexException {

		PhysicianOrderTherapyTest refphytherapy = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refphytherapy = (PhysicianOrderTherapyTest) session.load(PhysicianOrderTherapyTest.class, serial);
			refphytherapy.getCareOfLine();
			session.delete(refphytherapy);
			tx.commit();
		} 
		catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Physician Order Therapy");
		}
		finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
	
}
