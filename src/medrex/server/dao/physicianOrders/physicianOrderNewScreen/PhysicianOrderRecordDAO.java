package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderAdvanceDirectives;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.server.dao.SessionUtil;
import medrex.server.dao.UserDAO;
import medrex.server.dao.schedule.UserScheduleDAO;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class PhysicianOrderRecordDAO {

	private Object data;

	private PhysicianOrderRecordDAO() {
	}

	private static PhysicianOrderRecordDAO refPhysRecordDao = null;

	public static synchronized PhysicianOrderRecordDAO getInstance() {

		// if obj is null create it , else just return it
		if (refPhysRecordDao == null) {
			refPhysRecordDao = new PhysicianOrderRecordDAO();

		} // end if

		return (refPhysRecordDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianOrderRecord(
			PhysicianOrderRecord refPhysRec) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PhysicianOrderRecord");
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
	

	public synchronized List<PhysicianOrderRecord> getPhysicianOrderRecords(
			String formType, int currentResidentKey) throws MedrexException {
		List<PhysicianOrderRecord> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(PhysicianOrderRecord.class)
			       .createAlias("residents", "r")
			       .add(
					Restrictions.eq("formType", formType)).add(
					Restrictions.eq("r.serial", currentResidentKey)).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Physician Order record  List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<PhysicianOrderRecord> getPhysicianOrderRecordsByCurrentTime()
			throws MedrexException {
		List list = new ArrayList();
		List<PhysicianOrderRecord> records = new ArrayList<PhysicianOrderRecord>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			list = session.createSQLQuery("CALL ViewCurrentMedicationTemp()")
					.list();
			System.out.println("Testing");
			List<Object[]> data = list;
			for (Object[] record : data) {
				PhysicianOrderRecord phy = new PhysicianOrderRecord();
				if (data != null) {
					phy.setDateCreated((Date) record[1]);
					phy.setLastModified((Date) record[2]);
					phy.setSerial(3);
					records.add(phy);
				}
			}

			System.out.println("Testing ");
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Medications");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		System.out.println("Testing");
		return records;
	}

	public synchronized void deletePhysicianOrderRecord(int serial)
			throws MedrexException {
		PhysicianOrderRecord refPhysRec = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysRec = (PhysicianOrderRecord) session.load(
					PhysicianOrderRecord.class, serial);
			refPhysRec.getDateCreated();
			session.delete(refPhysRec);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Physician Order Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized boolean isDNR(int currentResidenceKey)
			throws MedrexException {
		PhysicianOrderAdvanceDirectives refPhysRec = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(
					PhysicianOrderAdvanceDirectives.class).addOrder(
					Order.desc("serial")).add(
					Restrictions.eq("residentId", currentResidenceKey))
					.setMaxResults(1);

			refPhysRec = (PhysicianOrderAdvanceDirectives) crit.uniqueResult();

			tx.commit();
			if (refPhysRec != null
					&& refPhysRec.getDNR().equalsIgnoreCase("DNR")) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Checking for DNR status");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	/*public Users getPhysicianOrderRecordBycurrentLoggedInUserKey(
			int currentLoggedInUserKey) throws MedrexException {
	    Users refPORecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPORecord =  (Users) session.createCriteria(Users.class)			
		    .add(Restrictions.eq("serial", currentLoggedInUserKey)).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Physician Medication form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPORecord;
		*/
		
		 
		 
	

}
