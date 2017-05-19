package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator; 
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Medication;
import medrex.commons.vo.medicationCart.MedicationView;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PhysicianOrderMedicationDao {

	private int total;

	private PhysicianOrderMedicationDao() {

	}

	private static PhysicianOrderMedicationDao refPhysicianOrderMedicationDao = null;

	public static synchronized PhysicianOrderMedicationDao getInstance() {

		// if obj is null create it , else just return it
		if (refPhysicianOrderMedicationDao == null) {
			refPhysicianOrderMedicationDao = new PhysicianOrderMedicationDao();

		} // end if

		return (refPhysicianOrderMedicationDao);

	} // end - getUniqueInstance - method
	
	

	public synchronized int insertOrUpdatePhysicianOrderMedication(
			PhysicianOrderMedication refPhysicianOrderMedication)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PhysicianOrderMedication");
			session.saveOrUpdate(refPhysicianOrderMedication);
			tx.commit();

			return refPhysicianOrderMedication.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving refPhysicianOrderMedication");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void deletePhysicianOrderMedication(int serial)
			throws MedrexException {

		PhysicianOrderMedication refPhysicianOrderMedication = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianOrderMedication = (PhysicianOrderMedication) session
					.load(PhysicianOrderMedication.class, serial);
			refPhysicianOrderMedication.getDose();
			session.delete(refPhysicianOrderMedication);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Physician Order Medication");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public PhysicianOrderMedication getPhysicianOrderMedication(int formId)
			throws MedrexException {
		PhysicianOrderMedication refMedication = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refMedication = (PhysicianOrderMedication) session.load(
					PhysicianOrderMedication.class, formId);
			if (refMedication != null) {
				refMedication.getDoseAmount();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Physician Medication form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refMedication;
	}

	
	public PhysicianOrderMedication getPhysicianOrderMedicationBySerial(int serial)
	throws MedrexException {
    PhysicianOrderMedication refMedication = null;
    Session session = SessionUtil.getInstance().getSession();
   Transaction tx = null;
   try {
	tx = session.beginTransaction();
	
	refMedication=(PhysicianOrderMedication) session.createCriteria(PhysicianOrderMedication.class)
	.add(Restrictions.eq("serial", serial)).uniqueResult();
	
	/*refMedication = (PhysicianOrderMedication) session.load(
			PhysicianOrderMedication.class, serial);
	if (refMedication != null) {
		refMedication.getDoseAmount();
	}*/
	tx.commit();
} catch (Exception e) {
	e.printStackTrace();
	throw new MedrexException(
			"Error retrieving Physician Medication serial ");
} finally {
	SessionUtil.getInstance().closeSession(session);
}
return refMedication;
}
	

	public synchronized List<MedicationView> getPhysicianOrderTimeSlots(
			int currentResidenceKey) throws MedrexException {
		List list = new ArrayList();
		List<MedicationView> row3List = new ArrayList<MedicationView>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			list = session
					.createSQLQuery(
							"SELECT m.route , m.prnIndication, m.frequency1, m.durationFrom, m.dose, m.durationTo,c.slotNum,c.slotStartTime, c.slotEndTime FROM physicianordermedication AS m LEFT JOIN medicationtimeslot AS c ON m.frequency1 = c.slotNum")
					.list();
			tx.commit();
			Iterator it = list.iterator();
			while (it.hasNext()) {
				Object[] obj = (Object[]) it.next();
				MedicationView phyRowData = new MedicationView();
				phyRowData.setRoute(obj[0].toString());
				phyRowData.setPrnIndicator(Integer.parseInt(obj[1] + ""));
				phyRowData.setFrequency(Integer.parseInt(obj[2].toString()));
				phyRowData.setOrderDate((Date) obj[3]);
				// phyRowData.setDosage(Integer.parseInt(obj[4].toString()));
				phyRowData.setEndDate((Date) obj[5]);
				phyRowData.setFormId(Integer.parseInt(obj[6].toString()));
				// phyRowData.setCalcSerial(Integer.parseInt(obj[7].toString()));
				// phyRowData.setCalculatedStartTime((Date) obj[8]);
				// phyRowData.setCalculatedEndTime((Date) obj[9]);
				// phyRowData.setMedication(obj[10].toString());
				row3List.add(phyRowData);
			}
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Medications");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return row3List;
	}

	
	
	public synchronized List<PhysicianOrderMedication> getPhysicianOrderMedicationList(
			int residentId) throws MedrexException {
		List<PhysicianOrderMedication> list = new ArrayList<PhysicianOrderMedication>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			//System.out.println("suresh" + residentId);

			//list = session.createCriteria(PhysicianOrderMedication.class).add(
				//	Restrictions.eq("residentId", residentId)).list();.
			
			list =  session.createCriteria(PhysicianOrderMedication.class)
		       .createAlias("residents", "r")
		       .add(Restrictions.eq("r.serial", residentId)).list();
			
			return list;
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Medications");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
	
	
	public synchronized List<PhysicianOrderMedication> getPhysicianOrderMedicationListByFormId(
			/*int formId*/) throws MedrexException {
		List<PhysicianOrderMedication> list = new ArrayList<PhysicianOrderMedication>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			list = session.createCriteria(PhysicianOrderMedication.class)
			//.add(Restrictions.eq("serial", formId))		
			.list();
					
			return list;
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Medications");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}
	
	

	public synchronized List<String> getTimeSlot(int frequency)
			throws MedrexException {

		List list = new ArrayList();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List<String> rowList = new ArrayList<String>();
			list = session.createSQLQuery(
					"SELECT * FROM medicationtimeslot WHERE slotNum ="
							+ frequency).list();
			Iterator it = list.iterator();
			while (it.hasNext()) {
				Object[] obj = (Object[]) it.next();
				String medViewData = new String();
				medViewData = obj[1].toString();
				rowList.add(medViewData);
			}
			return rowList;
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Medications");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public String getCautionaryName(Long medicationId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Medication md = (Medication) session.createCriteria(
					Medication.class).add(Restrictions.eq("ndc", medicationId))
					.uniqueResult();
			return md.getCoustionary();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Medications");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
