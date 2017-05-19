package medrex.server.dao.admission.carePlanAnalyzer;

import java.math.BigInteger;
import java.util.List;
import java.util.ListIterator;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admission.analyzer.CarePlanAnalyzerBean;
import medrex.commons.vo.admission.analyzer.CarePlanValues;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CarePlanAnalyzerDAO {

	private CarePlanAnalyzerDAO() {

	}

	private static CarePlanAnalyzerDAO cpaDAO = null;

	public static synchronized CarePlanAnalyzerDAO getInstance() {

		if (cpaDAO == null) {
			cpaDAO = new CarePlanAnalyzerDAO();
		}
		return cpaDAO;
	}

	public synchronized void insertOrUpdateCarePlanAnalyzerList(
			List<CarePlanAnalyzerBean> list) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ListIterator it = list.listIterator();
			while (it.hasNext()) {
				CarePlanAnalyzerBean bean = (CarePlanAnalyzerBean) it.next();
				session.createQuery("from CarePlanAnalyzerBean");
				session.saveOrUpdate(bean);
			}
			tx.commit();
			// return bean.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Care Plan Analyzer Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized int getCarePlanAnalyzerCount() throws MedrexException {
		int count = 0;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// Criteria crit =
			// session.createCriteria(CarePlanAnalyzerBean.class);
			// ProjectionList projList =
			// Projections.projectionList().add(Projections.count("serial"));
			// crit.setProjection(projList);
			BigInteger bigInt = (BigInteger) session.createSQLQuery(
					"SELECT COUNT(SERIAL)FROM CarePlanAnalyzer").uniqueResult();
			count = bigInt.intValue();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Care Plan Analyzer Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return count;
	}

	public synchronized List getCarePlanAnalyzerResidentCount()
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(CarePlanAnalyzerBean.class);
			ProjectionList projList = Projections.projectionList().add(
					Projections.groupProperty("residentId")).add(
					Projections.count("serial"));
			crit.setProjection(projList);
			result = crit.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving pending mds form List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized boolean getCarePlanByFormId(int serial)
			throws MedrexException {
		boolean result;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(CarePlanAnalyzerBean.class);
			ProjectionList projList = Projections.projectionList().add(
					Projections.groupProperty("formId")).add(
					Projections.count("formId"));
			crit.setProjection(projList);
			List l = crit.list();
			tx.commit();
			if (l.size() > 0) {
				result = true;
			} else {
				result = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving pending mds form List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void deleteCarePlanByFormId(int serial)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery(
					"delete from CarePlanAnalyzerBean where formId=" + serial)
					.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving pending mds form List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<CarePlanAnalyzerBean> getCarePlanAnalyzerByResidentId(
			int residentId) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(CarePlanAnalyzerBean.class)
					.add(Restrictions.eq("residentId", residentId));
			result = crit.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving pending mds form List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized int insertOrUpdateCarePlanValues(
			CarePlanValues careValues) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		int serial = 0;
		try {
			tx = session.beginTransaction();
			session.createQuery("from CarePlanValues");
			session.saveOrUpdate(careValues);
			tx.commit();
			serial = careValues.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Care Plan Analyzer Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return serial;
	}

	public synchronized CarePlanValues getCarePlanValues(
			int currentResidentAssessmentFormKey, int currentResidenceKey)
			throws MedrexException {
		CarePlanValues careValues = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			careValues = (CarePlanValues) session.createCriteria(
					CarePlanValues.class)
					.add(
							Restrictions.eq("formId",
									currentResidentAssessmentFormKey)).add(
							Restrictions.eq("residentId", currentResidenceKey))
					.uniqueResult();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving care plan values");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return careValues;
	}

	public synchronized void deleteResidentCarePlanValues(int formId,
			int currentResidenceKey) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery(
					"delete from CarePlanValues where formId=" + formId
							+ "and residentId=" + currentResidenceKey)
					.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving pending mds form List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

}
