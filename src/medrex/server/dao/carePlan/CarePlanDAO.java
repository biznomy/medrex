package medrex.server.dao.carePlan;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.carePlan.CarePlan;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarePlanDAO {

	private CarePlanDAO() {
	}

	private static CarePlanDAO carePlanDAO = null;

	public static synchronized CarePlanDAO getInstance() {

		// if obj is null create it , else just return it
		if (carePlanDAO == null) {
			carePlanDAO = new CarePlanDAO();

		} // end if

		return (carePlanDAO);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateCarePlan(CarePlan carePlan)
			throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			session.createQuery("from CarePlan");
			session.saveOrUpdate(carePlan);

			tx.commit();
			return carePlan.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Care Plan");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getCarePlanList(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			result = session
					.createQuery(
							"from CarePlan as cp where cp.residentId="
									+ residentSerial).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Care Plan List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CarePlan getCarePlan(int serial) throws MedrexException {
		CarePlan carePlan = null;

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			carePlan = (CarePlan) session.load(CarePlan.class, serial);
			carePlan.getFormType();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Care Plan Forms");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return carePlan;
	}

	public synchronized void deleteCarePlan(int serial) throws Exception {

		CarePlan carePlan = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			carePlan = (CarePlan) session.load(CarePlan.class, serial);
			carePlan.getNotes();
			session.delete(carePlan);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new Exception("Error deleting Care Plan Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

}
