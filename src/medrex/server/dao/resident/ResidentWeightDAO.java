package medrex.server.dao.resident;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentWeight;
import medrex.commons.vo.resident.ResidentWeightBean;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ResidentWeightDAO {
	private static ResidentWeightDAO refResidentWeightDAO = null;

	private ResidentWeightDAO() {

	}

	public static ResidentWeightDAO getInstance() {
		if (refResidentWeightDAO == null) {
			refResidentWeightDAO = new ResidentWeightDAO();
		}
		return refResidentWeightDAO;
	}

	public synchronized int insertOrUpdateResidentWeight(
			ResidentWeight resWeight) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(resWeight);
			tx.commit();
			return resWeight.getSerial();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "RollBack tx");
			throw new MedrexException("Error Saving Resident Weight");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<ResidentWeight> getResidentWeights(
			int currentResidentKey) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		List<ResidentWeight> result = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(ResidentWeight.class).add(
					Restrictions.eq("residentId", currentResidentKey)).list();
			tx.commit();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "RollBack tx");
			throw new MedrexException("Error Saving Resident Weight");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentWeight getResidentWeightRecord(
			int currentWeightKey) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		ResidentWeight rWt = null;
		try {
			tx = session.beginTransaction();
			rWt = (ResidentWeight) session.createCriteria(ResidentWeight.class)
					.add(Restrictions.eq("serial", currentWeightKey))
					.uniqueResult();
			rWt.getResidentId();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error getting Resident Weight Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rWt;
	}

	public synchronized void deleteResidentWeightRecord(int resWeightId)
			throws MedrexException {
		ResidentWeight refResidentVitalSigns = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			refResidentVitalSigns = (ResidentWeight) session.load(
					ResidentWeight.class, resWeightId);
			refResidentVitalSigns.getResidentId();
			session.delete(refResidentVitalSigns);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Weight Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized ResidentWeight getResidentLatestWeight(
			int currentResidentKey) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		ResidentWeight rWt = null;
		try {
			tx = session.beginTransaction();

			Criteria crit = session.createCriteria(ResidentWeight.class).add(
					Restrictions.eq("residentId", currentResidentKey));
			rWt = (ResidentWeight) crit.addOrder(Order.desc("serial"))
					.setMaxResults(1).uniqueResult();
			if (rWt != null) {
				rWt.getResidentId();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error getting Resident Weight Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rWt;
	}

	public synchronized ResidentWeight getPreviousResidentWeightRecord(
			int currentResidenceKey, int previousMonths) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		ResidentWeight rWt = null;

		Date date = new Date();
		date.setMonth(date.getMonth() - previousMonths);
		try {
			tx = session.beginTransaction();

			Criteria crit = session.createCriteria(ResidentWeight.class).add(
					Restrictions.eq("residentId", currentResidenceKey)).add(
					Restrictions.lt("dateOfCreation", date));
			rWt = (ResidentWeight) crit.addOrder(Order.desc("serial"))
					.setMaxResults(1).uniqueResult();
			if (rWt != null) {
				rWt.getResidentId();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error getting Resident Weight Records 30 days before");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rWt;
	}

	public synchronized List<ResidentWeightBean> getResidentsWeight(Date dFrom,
			Date dTo, String withOrWithoutWeight) throws MedrexException {
		List resWeightList = null;
		List<ResidentWeightBean> beanList = new ArrayList<ResidentWeightBean>();
		Session sess = SessionUtil.getInstance().getSession();
		Transaction tr = null;
		try {
			tr = sess.beginTransaction();
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("yyyy-MM-dd");
			String strFromDate = df.format(dFrom);
			String strToDate = df.format(dTo);
			if ("Patients not Weighed".equalsIgnoreCase(withOrWithoutWeight)) {
				System.out.println("Patients not Weighed");
				resWeightList = sess
						.createSQLQuery(
								"SELECT userPass, userName FROM residentmain "
										+ "WHERE TYPE = 90 AND SERIAL NOT IN"
										+ " (SELECT residentId FROM residentweight WHERE DATE(dateOfCreation) BETWEEN Date('"
										+ strFromDate + "') AND Date('"
										+ strToDate + "'))").list();
				System.out.println("resWeightList: " + resWeightList.size());
				Iterator it = resWeightList.iterator();
				while (it.hasNext()) {
					Object obj[] = (Object[]) it.next();
					ResidentWeightBean bean = new ResidentWeightBean();
					bean.setResidentName(obj[0] + "" + "," + obj[1] + "");
					beanList.add(bean);
				}
			} else if ("Patients weighed".equalsIgnoreCase(withOrWithoutWeight)) {
				System.out.println("Patients weighed");
				resWeightList = sess
						.createSQLQuery(
								"SELECT rm.serial, rm.userPass, rm.userName, resWeight.weight, resWeight.dateOfCreation FROM residentweight AS resWeight "
										+ "LEFT JOIN residentmain AS rm ON rm.type = 90 "
										+ "AND rm.serial = resWeight.residentId "
										+ "WHERE DATE(resWeight.dateOfCreation) BETWEEN Date('"
										+ strFromDate
										+ "') AND Date('"
										+ strToDate + "')").list();
				System.out.println("resWeightList: " + resWeightList.size());
				Iterator it = resWeightList.iterator();
				while (it.hasNext()) {
					Object obj[] = (Object[]) it.next();
					ResidentWeightBean bean = new ResidentWeightBean();
					bean.setResidentName(obj[1] + "" + "," + obj[2] + "");
					bean.setWeight(obj[3] + "");
					bean.setWeightDate(obj[4] + "");
					beanList.add(bean);
				}
			}

			tr.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tr, "");
			throw new MedrexException(
					"Error getting residents weight between from selected date range.");
		} finally {
			SessionUtil.getInstance().closeSession(sess);
		}
		return beanList;
	}

}
