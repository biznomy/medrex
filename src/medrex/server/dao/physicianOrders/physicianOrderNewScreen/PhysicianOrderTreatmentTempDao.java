package medrex.server.dao.physicianOrders.physicianOrderNewScreen;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Treatment;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderTreatmentTemp;
import medrex.commons.vo.treatmentCart.TreatmentView;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PhysicianOrderTreatmentTempDao {

	private int total;

	private PhysicianOrderTreatmentTempDao() {

	}

	private static PhysicianOrderTreatmentTempDao refPhysicianOrderTreatmentTempDao = null;

	public static synchronized PhysicianOrderTreatmentTempDao getInstance() {

		// if obj is null create it , else just return it
		if (refPhysicianOrderTreatmentTempDao == null) {
			refPhysicianOrderTreatmentTempDao = new PhysicianOrderTreatmentTempDao();

		} // end if

		return (refPhysicianOrderTreatmentTempDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdatePhysicianOrderTreatmentTemp(
			PhysicianOrderTreatmentTemp refPhysicianOrderTreatmentTemp)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from PhysicianOrderTreatmentTemp");
			session.saveOrUpdate(refPhysicianOrderTreatmentTemp);
			tx.commit();

			return refPhysicianOrderTreatmentTemp.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving PhysicianOrderTreatmentTemp");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void deletePhysicianOrderTreatmentTemp(int serial)
			throws MedrexException {

		PhysicianOrderTreatmentTemp refPhysicianOrderTreatmentTemp = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianOrderTreatmentTemp = (PhysicianOrderTreatmentTemp) session
					.load(PhysicianOrderTreatmentTemp.class, serial);
			refPhysicianOrderTreatmentTemp.getDose();
			session.delete(refPhysicianOrderTreatmentTemp);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting Physician Order TreatmentTemp");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public PhysicianOrderTreatmentTemp getPhysicianOrderTreatmentTemp(int formId)
			throws MedrexException {
		PhysicianOrderTreatmentTemp refPhysicianOrderTreatmentTemp = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refPhysicianOrderTreatmentTemp = (PhysicianOrderTreatmentTemp) session
					.load(PhysicianOrderTreatmentTemp.class, formId);
			if (refPhysicianOrderTreatmentTemp != null) {
				refPhysicianOrderTreatmentTemp.getDoseAmount();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Physician Treatment Temp form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refPhysicianOrderTreatmentTemp;
	}

	public int getTotalPhysicianOrderTreatmentTemp(int currentResidentId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List list = new ArrayList<PhysicianOrderTreatmentTemp>();
			list = session
					.createSQLQuery(
							"SELECT * FROM physicianorderTreatmentTemp WHERE residentId = 213")
					.list();
			total = list.size();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Physician Treatment Temp form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return total;
	}

	public synchronized List<TreatmentView> getPhysicianOrderTreatmentTempTimeSlots(
			int currentResidenceKey) throws MedrexException {
		List list = new ArrayList();
		List<TreatmentView> row3List = new ArrayList<TreatmentView>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			list = session
					.createSQLQuery(
							"SELECT m.route , m.prnIndication, m.frequency1, m.durationFrom, m.dose, m.durationTo,c.slotNum,c.slotStartTime, c.slotEndTime FROM physicianordertreatmenttemp AS m LEFT JOIN treatmenttimeslot AS c ON m.frequency1 = c.slotNum")
					.list();
			tx.commit();
			Iterator it = list.iterator();
			while (it.hasNext()) {
				Object[] obj = (Object[]) it.next();
				TreatmentView phyRowData = new TreatmentView();
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

	public synchronized List<PhysicianOrderTreatmentTemp> getPhysicianOrderTreatmentTempList(
			int residentId) throws MedrexException {
		List<PhysicianOrderTreatmentTemp> list = new ArrayList<PhysicianOrderTreatmentTemp>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			System.out.println("suresh" + residentId);

			list = session.createCriteria(PhysicianOrderTreatmentTemp.class)
					.add(Restrictions.eq("residentId", residentId)).list();
			return list;
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Treatments");
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
					"SELECT * FROM treatmenttimeslot WHERE slotNum ="
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
			throw new MedrexException("Error getting Treatments time sloat");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public String getCautionaryName(Long treatmentId) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			Treatment tre = (Treatment) session.createCriteria(Treatment.class)
					.add(Restrictions.eq("ndc", treatmentId)).uniqueResult();
			return tre.getCoustionary();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Treatment");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
