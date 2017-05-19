package medrex.server.dao.admin.diet;

import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.DietList;
import medrex.commons.vo.admin.DietPlan;
import medrex.commons.vo.dietary.DietPlanByDate;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DietDAO {

	private DietDAO() {
	}

	private static DietDAO refDao = null;

	public static synchronized DietDAO getInstance() {
		if (refDao == null) {
			refDao = new DietDAO();
		}
		return refDao;
	}

	public int insertOrUpdateDietList(DietList diet) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(diet);
			tx.commit();
			return diet.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving diet list.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public DietList getDiet(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		DietList diet = null;
		try {
			tx = session.beginTransaction();
			diet = (DietList) session.load(DietList.class, serial);
			diet.getName();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting diet.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return diet;
	}

	public List<DietList> getDietByCategory(String cat) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<DietList> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(DietList.class).add(
					Restrictions.eq("category", cat)).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error getting diet list according to category.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List<DietList> getAllDiets() throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<DietList> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(DietList.class).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting diet list.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public void deleteDiet(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			DietList diet = (DietList) session.load(DietList.class, serial);
			session.delete(diet);
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error deleting diet.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	// DietPaln
	public int insertOrUpdateDietPlan(DietPlan dietPlan) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(dietPlan);
			tx.commit();
			return dietPlan.getSerial();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving diet plan.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public List<DietPlan> getAllDietPlan() throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<DietPlan> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(DietPlan.class).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting all diet plan.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List<DietPlan> getDietPlanByCategory(String cat)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<DietPlan> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(DietPlan.class).add(
					Restrictions.eq("dietType", cat)).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error getting all diet plan by category.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List<DietPlan> getDietPlanByDietName(String dietName)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<DietPlan> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(DietPlan.class).add(
					Restrictions.eq("dietName", dietName)).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error getting all diet plan by dietname.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public DietPlan getDietPlan(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		DietPlan diet = null;
		try {
			tx = session.beginTransaction();
			diet = (DietPlan) session.load(DietPlan.class, serial);
			diet.getDietName();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting diet plan.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return diet;
	}

	public void deleteDietPlan(int serial) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			DietPlan diet = (DietPlan) session.load(DietPlan.class, serial);
			session.delete(diet);
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error deleting diet plan.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public int insertOrUpdateDietPlanByDate(DietPlanByDate dietPlanByDate)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		int serial = 0;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(dietPlanByDate);
			tx.commit();
			serial = dietPlanByDate.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving dietplan by date.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return serial;
	}

	public DietPlanByDate getDietPlanByDate(String date) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		DietPlanByDate diet = null;
		try {
			tx = session.beginTransaction();
			diet = (DietPlanByDate) session
					.createCriteria(DietPlanByDate.class).add(
							Restrictions.eq("dietDate", new Date(date)))
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error getting diet plan by date.");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return diet;
	}
}
