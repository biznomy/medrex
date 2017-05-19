package medrex.server.dao.resident;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentAllergies;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ResidentAllergiesDAO {
	private ResidentAllergiesDAO() {
	}

	private static ResidentAllergiesDAO refResidentAllergiesDao = null;

	public static synchronized ResidentAllergiesDAO getInstance() {

		// if obj is null create it , else just return it
		if (refResidentAllergiesDao == null) {
			refResidentAllergiesDao = new ResidentAllergiesDAO();

		} // end if

		return (refResidentAllergiesDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateResidentAllergies(
			ResidentAllergies ref) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from ResidentAllergies");
			session.saveOrUpdate(ref);
			tx.commit();

			return ref.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving ResidentAllergies");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public void deleteResidentAllergies(int id) throws MedrexException {
		ResidentAllergies refResidentAllergies = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentAllergies = (ResidentAllergies) session.load(
					ResidentAllergies.class, id);
			refResidentAllergies.getName();
			session.delete(refResidentAllergies);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting ResidentAllergies Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public List<ResidentAllergies> getResidentAllergiesforResident(
			int residentId) throws MedrexException {
		List<ResidentAllergies> result = null;
		ResidentMain resmain = ResidentInformationDAO.getInstance()
				.getResident(residentId);
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// result = session.createQuery(
			// "from ResidentAllergies as ls where ls.resident="
			// + residentId).list();
			result = session.createCriteria(ResidentAllergies.class).add(
					Restrictions.eq("resident", resmain)).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResidentAllergies List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public ResidentAllergies getResidentAllergy(int currSerial)
			throws MedrexException {
		ResidentAllergies refResidentAllergy = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentAllergy = (ResidentAllergies) session.load(
					ResidentAllergies.class, currSerial);
			refResidentAllergy.getName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving ResidentDiagnosiss");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refResidentAllergy;
	}

	public List<ResidentAllergies> getResidentAllergiesForString(String text,
			String selectedValue) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		String strQuery = null;
		try {

			tx = session.beginTransaction();
			// if(selectedValue.equals("0")){
			// strQuery= " from ResidentAllergies as ref where ref.code like '"
			// + text + "%'";
			// }else{
			strQuery = " from ResidentAllergies as ref where ref.name like '"
					+ text + "%'";
			// }

			// System.out.println("strQuery: "+strQuery);
			result = session.createQuery(strQuery).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Allergy List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List<ResidentAllergies> getResidentAllergiesForString(String likeStr)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			String strQuery = " from ResidentAllergies as ref where ref.name like '"
					+ likeStr;
			// System.out.println("strQuery: "+strQuery);
			result = session.createQuery(strQuery).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Allergy List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

}
