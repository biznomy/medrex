package medrex.server.dao.resident;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentVitalSigns;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ResidentVitalSignsDao {
	public static ResidentVitalSignsDao vitalSignsDao = null;

	private ResidentVitalSignsDao() {

	}

	public static ResidentVitalSignsDao getInstance() {
		if (vitalSignsDao == null) {
			vitalSignsDao = new ResidentVitalSignsDao();
		}
		return vitalSignsDao;
	}

	public int insertOrUpdateVitals(ResidentVitalSigns vital)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from ResidentVitalSigns");
			session.saveOrUpdate(vital);
			tx.commit();
			return vital.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Resident Vital signs");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public List<ResidentVitalSigns> getVitals(int currentResidenceKey)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<ResidentVitalSigns> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(ResidentVitalSigns.class).add(
					Restrictions.eq("residentId", currentResidenceKey)).list();
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting Resident Vital signs");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public void deleteResidentVitalRecord(int vitalId) throws MedrexException {
		ResidentVitalSigns refResidentVitalSigns = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentVitalSigns = (ResidentVitalSigns) session.load(
					ResidentVitalSigns.class, vitalId);
			refResidentVitalSigns.getAmbulation();
			session.delete(refResidentVitalSigns);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting ResidentVital Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public ResidentVitalSigns getVitalSign(int currentVitalSignKey)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		ResidentVitalSigns rvs = null;
		try {
			tx = session.beginTransaction();
			rvs = (ResidentVitalSigns) session.createCriteria(
					ResidentVitalSigns.class).add(
					Restrictions.eq("serial", currentVitalSignKey))
					.uniqueResult();
			rvs.getBp();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error getting ResidentVital Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rvs;
	}

}
