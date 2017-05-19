package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.PhysicanOrderFax;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.server.dao.SessionUtil;

 

public class PhysicianOrderNewFaxDAO {
	private static PhysicianOrderNewFaxDAO refPhySicianOrderNewFax = null;
	
    private PhysicianOrderNewFaxDAO(){
    	
    }
    
    public static synchronized PhysicianOrderNewFaxDAO getInstance(){
    	 
		if (refPhySicianOrderNewFax == null) {
			refPhySicianOrderNewFax = new PhysicianOrderNewFaxDAO();

		} 

		return (refPhySicianOrderNewFax);
    	
    }
    
    public List<PhysicanOrderFax> getPhysicianOrderFaxDetailByStatus(String i) throws MedrexException
    {
    	List<PhysicanOrderFax> result = null;
    	Session session = SessionUtil.getInstance().getSession();
    	Transaction tx = null;
    	try{
    		tx = session.beginTransaction();
    		
    		result = session.createCriteria(PhysicanOrderFax.class)
    		.add(Restrictions.eq("status", i))
    		.list();
    		System.out.println(result.size());
    	 
    		
    		
    	}
    	 catch (Exception e) {
 			e.printStackTrace();
 			throw new MedrexException("Error retrieving PhysicianOrdferFax List on the basis of Status");
 		} finally {
 			SessionUtil.getInstance().closeSession(session);
 		}
     
    	
		return result;
    	
    	
    }
    
    public synchronized int insertOrUpdatePhysicianOrderFax(
			PhysicanOrderFax refPhysRec) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PhysicanOrderFax");
			session.saveOrUpdate(refPhysRec);
			tx.commit();

			return refPhysRec.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving physicianOrderRecord");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

    
    
    
    
	
}
