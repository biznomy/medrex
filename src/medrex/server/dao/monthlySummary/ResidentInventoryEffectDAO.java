package medrex.server.dao.monthlySummary;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.monthlySummary.InventoryPersonalEffect;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ResidentInventoryEffectDAO {
	private ResidentInventoryEffectDAO() {

	}

	private static ResidentInventoryEffectDAO residentInventoryEffectDAO = null;

	public static synchronized ResidentInventoryEffectDAO getInstance() {

		// if obj is null create it , else just return it
		if (residentInventoryEffectDAO == null) {
			residentInventoryEffectDAO = new ResidentInventoryEffectDAO();

		} // end if

		return (residentInventoryEffectDAO);

	}

	public synchronized int insertOrUpdateResidentInventoryEffect(
			InventoryPersonalEffect inventoryPersonalEffect)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from InventoryPersonalEffect");
			session.saveOrUpdate(inventoryPersonalEffect);
			tx.commit();
			return inventoryPersonalEffect.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving InventoryPersonalEffect");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized InventoryPersonalEffect getInventoryPersonalEffect(
			int formId) throws MedrexException {
		InventoryPersonalEffect inventoryPersonalEffect = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			inventoryPersonalEffect = (InventoryPersonalEffect) session
					.createCriteria(InventoryPersonalEffect.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();

			inventoryPersonalEffect.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving InventoryPersonalEffect");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return inventoryPersonalEffect;
	}

	public synchronized void deleteInventoryPersonalEffect(int formId)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		InventoryPersonalEffect inventoryPersonalEffect = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// session.createSQLQuery("delete from msjn where formId = "+formId);
			inventoryPersonalEffect = (InventoryPersonalEffect) session
					.createCriteria(InventoryPersonalEffect.class).add(
							Restrictions.eq("formId", formId)).uniqueResult();
			session.delete(inventoryPersonalEffect);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error deleting InventoryPersonalEffect");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
