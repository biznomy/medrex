package medrex.server.dao.admin.formScheduler;

import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.PendingForm;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PendingFormDao {

	private PendingFormDao() {
	}

	private static PendingFormDao refDao = null;

	public static synchronized PendingFormDao getInstance() {
		if (refDao == null) {
			refDao = new PendingFormDao();
		}
		return refDao;
	}

	public synchronized int insertOrUpdatePendingForm(PendingForm ref)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			session.createCriteria(PendingForm.class);
			session.saveOrUpdate(ref);
			tx.commit();
			return ref.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Security");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<PendingForm> getPendingForms()
			throws MedrexException {
		List<PendingForm> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(PendingForm.class).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving role List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<PendingForm> getPendingFormsByResidentId(
			int residentId) throws MedrexException {
		List<PendingForm> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(PendingForm.class).add(
					Restrictions.eq("residentId", residentId)).add(
					Restrictions.eq("formId", 0)).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving role List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<PendingForm> getPendingFormsByResidentIdFormType(
			int residentId, String formType) throws MedrexException {
		List<PendingForm> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(PendingForm.class).add(
					Restrictions.eq("residentId", residentId)).add(
					Restrictions.eq("form", formType)).add(
					Restrictions.eq("formId", 0)).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving role List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<PendingForm> getPendingFormsByResidentIdFormTypeId(
			String formType, int formId) throws MedrexException {
		List<PendingForm> result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(PendingForm.class).add(
					Restrictions.eq("form", formType)).add(
					Restrictions.eq("formId", formId)).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving role List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized PendingForm getPendingForm(int serial)
			throws MedrexException {
		PendingForm ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (PendingForm) session.createCriteria(PendingForm.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			if (ref != null) {
				ref.getForm();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving security role");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ref;
	}

	public synchronized void deletePendingForm(int serial)
			throws MedrexException {
		PendingForm ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = (PendingForm) session.createCriteria(PendingForm.class).add(
					Restrictions.eq("serial", serial)).uniqueResult();
			session.delete(ref);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving security role");
		}
	}

	public synchronized void deletePendingFormByCensusId(int censusId)
			throws MedrexException {
		List<PendingForm> ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ref = session.createCriteria(PendingForm.class).add(
					Restrictions.eq("censusId", censusId)).list();
			Iterator<PendingForm> itr = ref.iterator();
			while (itr.hasNext()) {
				PendingForm pf = itr.next();
				session.delete(pf);
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving security role");
		}
	}

	public synchronized int getPendingCount() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = ((Integer) session.createCriteria(PendingForm.class).add(
					Restrictions.eq("formId", 0)).setProjection(
					Projections.count("form")).uniqueResult()).intValue();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingForm Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int countPendingAlert() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = ((Integer) session.createCriteria(PendingForm.class).add(
					Restrictions.eq("formId", 0)).add(
					Restrictions.lt("alertDate", new Date())).setProjection(
					Projections.count("form")).uniqueResult()).intValue();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingForm Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getPendingFormsAccordingResident()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(PendingForm.class).add(
					Restrictions.eq("formId", 0));
			ProjectionList projList = Projections.projectionList().add(
					Projections.groupProperty("residentId")).add(
					Projections.count("residentId")).add(
					Projections.count("form"));
			crit.setProjection(projList);
			result = crit.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving pending forms List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getFirstFloorPendingFormResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			result = session
					.createSQLQuery(
							"select pf.residentId, count(pf.form),rm.floorType from pendingforms as pf left join ResidentMain as rm on rm.serial=pf.residentId where pf.formId=0 and (rm.floorType='1st floor south wing' OR rm.floorType='Main north wing') AND rm.room IS NOT NULL  group by pf.residentId")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving pending forms List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getSecondFloorPendingFormResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			result = session
					.createSQLQuery(
							"select pf.residentId, count(pf.form),rm.floorType from pendingforms as pf left join ResidentMain as rm on rm.serial=pf.residentId where pf.formId=0 and (rm.floorType='2nd floor south wing' OR rm.floorType='Main and north wing') AND rm.room IS NOT NULL  group by pf.residentId")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving pending forms List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getSecondFloorPendingFormAlertResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createSQLQuery(
							"select pf.residentId, count(pf.form),rm.floorType from pendingforms as pf left join ResidentMain as rm on rm.serial=pf.residentId where pf.formId=0 and alertDate< now() and (rm.floorType='2nd floor south wing' OR rm.floorType='Main and north wing') AND rm.room IS NOT NULL  group by pf.residentId")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving SecondFloorPendingFormAlertResidents");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getFirstFloorPendingFormAlertResidents()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			result = session
					.createSQLQuery(
							"select pf.residentId, count(pf.form),rm.floorType from pendingforms as pf left join ResidentMain as rm on rm.serial=pf.residentId where pf.formId=0 and alertDate< now() and (rm.floorType='1st floor south wing' OR rm.floorType='Main north wing') AND rm.room IS NOT NULL  group by pf.residentId")
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving FirstFloorPendingFormAlertResidents");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getPendingAlert() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(PendingForm.class).add(
					Restrictions.eq("formId", 0)).add(
					Restrictions.lt("alertDate", new Date()));
			ProjectionList projList = Projections.projectionList().add(
					Projections.groupProperty("residentId")).add(
					Projections.count("residentId")).add(
					Projections.count("form"));
			crit.setProjection(projList);
			result = crit.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving pending alert List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int pendingFirstFloorCount() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = ((BigInteger) session
					.createSQLQuery(
							"select count(pf.formId) from pendingforms as pf left join residentmain as rs on pf.residentId=rs.serial where formId=0 and rs.floorType='1st floor south wing' or rs.floorType='Main north wing'")
					.uniqueResult()).intValue();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingForm Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int pendingSecondFloorCount() throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = ((BigInteger) session
					.createSQLQuery(
							"select count(pf.formId) from pendingforms as pf left join residentmain as rs on pf.residentId=rs.serial where formId=0 and rs.floorType='2nd floor south wing' or rs.floorType='Main and north wing'")
					.uniqueResult()).intValue();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingForm Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int countPendingAlertFirstFloor()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = ((BigInteger) session
					.createSQLQuery(
							"select count(*) from pendingforms as pf left join residentmain as rs on pf.residentId=rs.serial where formId=0 and alertDate< now() and rs.floorType='1st floor south wing' or rs.floorType='Main north wing'")
					.uniqueResult()).intValue();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingForm Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int countPendingAlertSecondFloor()
			throws MedrexException {
		int result = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = ((BigInteger) session
					.createSQLQuery(
							"select count(*) from pendingforms as pf left join residentmain as rs on pf.residentId=rs.serial where formId=0 and alertDate< now() and rs.floorType='2nd floor south wing' or rs.floorType='Main and north wing'")
					.uniqueResult()).intValue();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving PendingForm Count");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

}
