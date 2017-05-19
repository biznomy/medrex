package medrex.server.dao.dietary;

import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.dietary.DietaryPlazaHealth;
import medrex.commons.vo.dietary.DietaryPlazaHealthRow;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DietaryPlazaHealthDAO {

	private DietaryPlazaHealthDAO() {
	}

	private static DietaryPlazaHealthDAO refDietaryPlazaHealthDao = null;

	public static synchronized DietaryPlazaHealthDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDietaryPlazaHealthDao == null) {
			refDietaryPlazaHealthDao = new DietaryPlazaHealthDAO();

		} // end if

		return (refDietaryPlazaHealthDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateDietaryPlazaHealth(
			DietaryPlazaHealth psr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from DietaryPlazaHealth");
			session.saveOrUpdate(psr);
			tx.commit();

			return psr.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving DietaryPlazaHealth");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getDietaryPlazaHealths(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from DietaryPlazaHealth as ls where ls.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving DietaryPlazaHealth List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized DietaryPlazaHealth getDietaryPlazaHealth(int serial)
			throws MedrexException {
		DietaryPlazaHealth refDietaryPlazaHealth = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refDietaryPlazaHealth = (DietaryPlazaHealth) session.load(
					DietaryPlazaHealth.class, serial);
			refDietaryPlazaHealth.getDiagnosis();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving DietaryPlazaHealths");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refDietaryPlazaHealth;
	}

	public synchronized void deleteDietaryPlazaHealth(int formId)
			throws Exception {

		DietaryPlazaHealth refDietaryPlazaHealth = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// refDietaryPlazaHealth = (DietaryPlazaHealth) session.load(
			// DietaryPlazaHealth.class, serial);
			refDietaryPlazaHealth = (DietaryPlazaHealth) session
					.createCriteria(DietaryPlazaHealth.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();
			refDietaryPlazaHealth.getDiagnosis();
			session.delete(refDietaryPlazaHealth);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting DietaryPlazaHealth Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// row

	public synchronized int insertOrUpdateDietaryPlazaHealthRow(
			DietaryPlazaHealthRow psr) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			System.out.println("================");
			session.createQuery("from DietaryPlazaHealthRow");
			session.saveOrUpdate(psr);
			tx.commit();
			return psr.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving DietaryPlazaHealthRow");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getDietaryPlazaHealthRow(int formId)
			throws MedrexException {

		List refDietaryPlazaHealthRow = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			refDietaryPlazaHealthRow = session.createQuery(
					"from DietaryPlazaHealthRow as aliasp where aliasp.dietaryPlazaHealthSerial="
							+ formId
							+ " order by aliasp.dietaryPlazaHealthRowSerial")
					.list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving DietaryPlazaHealthRows");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refDietaryPlazaHealthRow;
	}

	public synchronized int insertOrUpdateDietaryPlazaHealthRows(List row)
			throws MedrexException {
		System.out.println("Dao Size :" + row.size());
		Iterator i = row.iterator();
		while (i.hasNext()) {
			DietaryPlazaHealthRow dRow = (DietaryPlazaHealthRow) i.next();
			try {
				insertOrUpdateDietaryPlazaHealthRow(dRow);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	public synchronized List getDietaryPlazaHealthRows(int formId)
			throws MedrexException {
		List admissionRecord = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			admissionRecord = session.createQuery(
					"from DietaryPlazaHealthRow as pg2 where pg2.formSerial = "
							+ formId).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Dietary Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return admissionRecord;
	}

	public void deleteDietaryPlazaHealthRow(int formId) throws Exception {
		DietaryPlazaHealthRow refDietaryPlazaHealth = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refDietaryPlazaHealth = (DietaryPlazaHealthRow) session.load(
					DietaryPlazaHealthRow.class, formId);
			refDietaryPlazaHealth.getNurseSign();
			session.delete(refDietaryPlazaHealth);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting DietaryPlazaHealth Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
