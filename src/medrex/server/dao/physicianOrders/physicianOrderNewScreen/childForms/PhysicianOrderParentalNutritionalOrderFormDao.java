package medrex.server.dao.physicianOrders.physicianOrderNewScreen.childForms;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.ParentalNutritionalOrderForm;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PhysicianOrderParentalNutritionalOrderFormDao {

	private static PhysicianOrderParentalNutritionalOrderFormDao PhyParentalNutritionalDao = null;

	public static synchronized PhysicianOrderParentalNutritionalOrderFormDao getInstance() {

		if (PhyParentalNutritionalDao == null) {
			PhyParentalNutritionalDao = new PhysicianOrderParentalNutritionalOrderFormDao();
		}
		return (PhyParentalNutritionalDao);
	}

	public synchronized int insertOrUpdateParentalNutritionalOrderForm(
			ParentalNutritionalOrderForm refParentalNutritionalOrderForm)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from ParentalNutritionalOrderForm");
			session.saveOrUpdate(refParentalNutritionalOrderForm);
			tx.commit();

			return refParentalNutritionalOrderForm.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving ParentalNutritionalOrderForm");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public ParentalNutritionalOrderForm getParentalNutritionalOrderForm(
			int currentParentalNutritionalOrderFormKey) throws MedrexException {

		ParentalNutritionalOrderForm refParentalNutritionalOrderForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			refParentalNutritionalOrderForm = (ParentalNutritionalOrderForm) session
					.load(ParentalNutritionalOrderForm.class,
							currentParentalNutritionalOrderFormKey);
			refParentalNutritionalOrderForm.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving ParentalNutritionalOrderForm");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return refParentalNutritionalOrderForm;
	}

	public void deletePhysicianOrderParentalNutritionalOrderForm(
			int currentParentalNutritionalOrderFormKey) throws MedrexException {
		ParentalNutritionalOrderForm refParentalNutritionalOrderForm = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refParentalNutritionalOrderForm = (ParentalNutritionalOrderForm) session
					.load(ParentalNutritionalOrderForm.class,
							currentParentalNutritionalOrderFormKey);
			refParentalNutritionalOrderForm.getAminoAcids();
			session.delete(refParentalNutritionalOrderForm);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error deleting ParentalNutritionalOrderForm");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}
}
