package medrex.server.dao.census;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.CensusStatus;
import medrex.server.dao.HibernateUtil;
import medrex.server.dao.SessionUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.JDBCConnectionException;

public class CensusStatusDAO {

	private CensusStatusDAO() {
	}

	private static CensusStatusDAO refDao = null;

	public static synchronized CensusStatusDAO getInstance() {

		// if obj is null create it , else just return it
		if (refDao == null) {
			refDao = new CensusStatusDAO();

		} // end if

		return (refDao);

	} // end - getUniqueInstance - method

	/*
	 * public synchronized int insertOrUpdateCensusStatus( CensusStatus
	 * refCensusStatus) throws MedrexException { CensusStatus dbCensusStatus =
	 * null; CensusStatus dbCensusStatus1 = null; CensusStatus
	 * dbCensusStatusPrev = null; CensusStatus dbCensusStatusNext = null;
	 * dbCensusStatus = getCensusLastStatus(refCensusStatus.getResidentId());
	 * String status = null; String status1 = null;
	 * if(refCensusStatus.getTypeName().equalsIgnoreCase("Admission")){ //
	 * status = "Discharge"; // status1 = "Sign Out"; }else
	 * if(refCensusStatus.getTypeName().equalsIgnoreCase("Discharge")){ //
	 * status = "Admission"; // status1 = "Sign In"; }else
	 * if(refCensusStatus.getTypeName().equalsIgnoreCase("Sign In")){ // status
	 * = "Sign Out"; // status1 = "Admission"; }else
	 * if(refCensusStatus.getTypeName().equalsIgnoreCase("Sign Out")){ // status
	 * = "Sign In"; // status1 = "Admission"; } dbCensusStatus1 =
	 * getCensusStatus(refCensusStatus.getResidentId(),status,status1);
	 * if(refCensusStatus.getCurrentCenusStatusPrevId()!=0){ dbCensusStatusPrev
	 * = getCensusStatus(refCensusStatus.getCurrentCenusStatusPrevId()); }
	 * if(refCensusStatus.getCurrentCenusStatusNextId()!=0){ dbCensusStatusNext
	 * = getCensusStatus(refCensusStatus.getCurrentCenusStatusNextId()); }
	 * 
	 * refCensusStatus.setTimestamp(refCensusStatus.getDateAndTime());
	 * 
	 * Session session = SessionUtil.getInstance().getSession(); Transaction tx
	 * = null; try { tx = session.beginTransaction();
	 * if((dbCensusStatus!=null)){
	 * if(!dbCensusStatus.getTypeName().equalsIgnoreCase
	 * (refCensusStatus.getTypeName()) || (refCensusStatus.getSerial()!=0)){
	 * if(dbCensusStatusPrev != null && dbCensusStatusNext != null){
	 * if(dbCensusStatusPrev
	 * .getDateAndTime().before(refCensusStatus.getDateAndTime()) &&
	 * dbCensusStatusNext
	 * .getDateAndTime().after(refCensusStatus.getDateAndTime())){
	 * System.out.println("lies this date");
	 * session.createQuery("from CensusStatus");
	 * session.saveOrUpdate(refCensusStatus); }else{
	 * System.out.println("Not lies"); throw new
	 * MedrexException(refCensusStatus.
	 * getTypeName()+" date between "+dbCensusStatusPrev
	 * .getDateAndTime()+" and "+dbCensusStatusNext.getDateAndTime()+""); }
	 * }else{ if(dbCensusStatus1!=null){
	 * 
	 * 
	 * 
	 * if(dbCensusStatus1.getDateAndTime().before(refCensusStatus.getDateAndTime(
	 * ))){// ||
	 * dbCensusStatus.getDateAndTime().compareTo(refCensusStatus.getDateAndTime
	 * ())==0){ session.createQuery("from CensusStatus");
	 * session.saveOrUpdate(refCensusStatus); } else{ throw new
	 * MedrexException(refCensusStatus
	 * .getTypeName()+" date should be after "+dbCensusStatus
	 * .getDateAndTime()+""); } }else{ session.createQuery("from CensusStatus");
	 * session.saveOrUpdate(refCensusStatus); } } }else{ throw new
	 * MedrexException("Allready "+ refCensusStatus.getTypeName()); } }else{
	 * session.createQuery("from CensusStatus");
	 * session.saveOrUpdate(refCensusStatus); }
	 * 
	 * tx.commit(); return refCensusStatus.getSerial(); } catch
	 * (JDBCConnectionException jd) { HibernateUtil.resetSessionFactory(); throw
	 * new MedrexException("Error Saving Census Status"); }
	 * catch(MedrexException e) { throw e; }catch (Exception e) {
	 * SessionUtil.getInstance().rollbackTx(tx, ""); e.printStackTrace(); throw
	 * new MedrexException("Error Saving Census Status"); } finally {
	 * SessionUtil.getInstance().closeSession(session); }
	 * 
	 * }
	 */

	public synchronized int insertOrUpdateCensusStatus(
			CensusStatus refCensusStatus) throws MedrexException {
		CensusStatus dbCensusStatus = null;

		CensusStatus dbCensusStatusPrev = null;
		CensusStatus dbCensusStatusNext = null;
		dbCensusStatus = getCensusLastStatus(refCensusStatus.getResidentId());

		if (refCensusStatus.getCurrentCenusStatusPrevId() != 0) {
			dbCensusStatusPrev = getCensusStatus(refCensusStatus
					.getCurrentCenusStatusPrevId());
		}
		if (refCensusStatus.getCurrentCenusStatusNextId() != 0) {
			dbCensusStatusNext = getCensusStatus(refCensusStatus
					.getCurrentCenusStatusNextId());
		}

		refCensusStatus.setTimestamp(refCensusStatus.getDateAndTime());

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			if ((dbCensusStatus != null)) {
				if ((!dbCensusStatus.getTypeName().equalsIgnoreCase(
						refCensusStatus.getTypeName()) || dbCensusStatus
						.getTypeName().equalsIgnoreCase(
								refCensusStatus.getTypeName()))
						&& (refCensusStatus.getSerial() != 0)) {
					if (dbCensusStatusPrev != null
							&& dbCensusStatusNext != null) {
						if (dbCensusStatusPrev.getDateAndTime().before(
								refCensusStatus.getDateAndTime())
								&& dbCensusStatusNext.getDateAndTime().after(
										refCensusStatus.getDateAndTime())) {
							System.out.println("lies this date");
							session.createQuery("from CensusStatus");
							session.saveOrUpdate(refCensusStatus);
						} else {
							System.out.println("Not lies");
							throw new MedrexException(refCensusStatus
									.getTypeName()
									+ " date between "
									+ dbCensusStatusPrev.getDateAndTime()
									+ " and "
									+ dbCensusStatusNext.getDateAndTime() + "");
						}
					} else if (dbCensusStatusPrev == null
							&& dbCensusStatusNext != null) {
						if (dbCensusStatusNext.getDateAndTime().before(
								refCensusStatus.getDateAndTime())) {
							throw new MedrexException(refCensusStatus
									.getTypeName()
									+ " date should be berore "
									+ dbCensusStatusNext.getDateAndTime() + "");
						} else {
							session.createQuery("from CensusStatus");
							session.saveOrUpdate(refCensusStatus);
						}
					} else if (dbCensusStatusPrev != null
							&& dbCensusStatusNext == null) {
						if (dbCensusStatusPrev.getDateAndTime().before(
								refCensusStatus.getDateAndTime())) {
							session.createQuery("from CensusStatus");
							session.saveOrUpdate(refCensusStatus);
						} else {
							throw new MedrexException(refCensusStatus
									.getTypeName()
									+ " date should be after "
									+ dbCensusStatusPrev.getDateAndTime() + "");
						}
					} else {
						session.createQuery("from CensusStatus");
						session.saveOrUpdate(refCensusStatus);
					}
				} else if (!dbCensusStatus.getTypeName().equalsIgnoreCase(
						refCensusStatus.getTypeName())
						&& (refCensusStatus.getSerial() == 0)) {
					if (dbCensusStatus.getDateAndTime().before(
							refCensusStatus.getDateAndTime())) {
						session.createQuery("from CensusStatus");
						session.saveOrUpdate(refCensusStatus);
					} else {
						throw new MedrexException(refCensusStatus.getTypeName()
								+ " date should be after "
								+ dbCensusStatus.getDateAndTime() + "");
					}

				} else {
					throw new MedrexException("Allready "
							+ refCensusStatus.getTypeName());
				}
			} else {
				session.createQuery("from CensusStatus");
				session.saveOrUpdate(refCensusStatus);
			}

			tx.commit();
			return refCensusStatus.getSerial();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
			throw new MedrexException("Error Saving Census Status");
		} catch (MedrexException e) {
			throw e;
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Census Status");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized CensusStatus getCensusStatus(int serial,
			int residentSerial) throws MedrexException {
		CensusStatus result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = (CensusStatus) session.createQuery(
					"from CensusStatus as ar where ar.serial=" + serial
							+ " and ar.residentId=" + residentSerial)
					.uniqueResult();
			result.getDateAndTime();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusStatuss(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createQuery(
					"from CensusStatus as ar where ar.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getAllCensus(Date dFrom, Date dTo)
			throws MedrexException {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM-dd-yyyy");
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createCriteria(CensusStatus.class)
					.add(Restrictions.ne("typeName", "Sign In"))
					.add(Restrictions.ne("typeName", "Sign Out"))
					.add(
							Restrictions
									.sqlRestriction("DATE(dateAndTime) Between (DATE(STR_TO_DATE('"
											+ df.format(dFrom)
											+ "', '%m-%d-%Y'))) AND (DATE(STR_TO_DATE('"
											+ df.format(dTo)
											+ "', '%m-%d-%Y')))"))
					// .add(Expression.between("dateAndTime", dFrom, dTo))
					.addOrder(Order.desc("dateAndTime")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusStatuss(String order, int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createQuery(
					"from CensusStatus as ar where ar.residentId="
							+ residentSerial + " order by ar.timestamp "
							+ order).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CensusStatus getCensusStatus(int residentSerial,
			String typename) throws MedrexException {
		return getCensusStatus(residentSerial, typename, new Date());
	}

	public synchronized CensusStatus getCensusStatus(int residentSerial,
			String typename, Date forDate) throws MedrexException {
		CensusStatus result = null;
		List l = null;
		Object o = null;
		forDate.setDate(forDate.getDate() + 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			l = session.createQuery(
					" from CensusStatus as cs " + " where cs.residentId="
							+ residentSerial + " " + " and cs.typeName='"
							+ typename + "' " + " and cs.dateAndTime <= '"
							+ df.format(forDate) + "'"
							+ " order by cs.dateAndTime desc").list();
			// l = session.createCriteria(CensusStatus.class)
			// .add(Restrictions.eq("residentId", residentSerial))
			// .add(Restrictions.eq("typeName", typename))
			// .add(Restrictions.sqlRestriction("Date(dateAndTime) <= '" +
			// df.format(forDate) + "'"))
			// .addOrder(Order.desc("dateAndTime"))
			// .list();
			if (l != null && l.size() > 0) {
				o = l.get(0);
			}
			if (o != null) {
				result = (CensusStatus) o;
				result.getDateAndTime();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CensusStatus getCensusStatus(int residentSerial,
			String typename, String typename1) throws MedrexException {
		CensusStatus result = null;
		List l = null;
		Iterator i = null;
		Object o = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			l = session.createQuery(
					"from CensusStatus as ar where ar.residentId="
							+ residentSerial + " and ar.typeName='" + typename
							+ "' or ar.typeName='" + typename1
							+ "' order by ar.timestamp desc").list();
			i = l.iterator();
			if (i.hasNext() == true) {
				o = i.next();
			}
			if (o != null) {
				result = (CensusStatus) o;
				result.getDateAndTime();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusStatuss(int residentSerial,
			String typename, Date tillDate) throws MedrexException {
		List result = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// result = session.createQuery(
			// "from CensusStatus as ar where ar.residentId="
			// + residentSerial + " and ar.typeName='" + typename + "'"
			// + " and Date(dateAndTime) <= '" + df.format(tillDate) + "'"
			// + " order by ar.timestamp desc").list();
			result = session.createCriteria(CensusStatus.class).add(
					Expression.eq("residentId", residentSerial)).add(
					Restrictions.eq("typeName", typename)).add(
					Restrictions.sqlRestriction("DATE(dateAndTime) <= '"
							+ df.format(tillDate) + "'")).list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusStatuss(int residentSerial,
			String typename, int year) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(CensusStatus.class).add(
					Expression.eq("residentId", residentSerial)).add(
					Restrictions.eq("typeName", typename)).add(
					Restrictions.sqlRestriction("YEAR(dateAndTime)=" + year))
					.list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Census Status List according to year");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getCensusStatuss(String typename, Date tillDate)
			throws MedrexException {
		List result = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(CensusStatus.class).add(
					Restrictions.eq("typeName", typename)).add(
					Restrictions.sqlRestriction("DATE(dateAndTime) <= '"
							+ df.format(tillDate) + "'")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CensusStatus getCensusStatus(int serial)
			throws MedrexException {
		CensusStatus obj = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			obj = (CensusStatus) session.createCriteria(CensusStatus.class)
					.add(Restrictions.eq("serial", serial)).uniqueResult();
			if (obj != null) {
				obj.getDateAndTime();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return obj;
	}

	public synchronized CensusStatus getCensusStatus() throws MedrexException {
		CensusStatus result = null;
		List l = null;
		Iterator i = null;
		Object o = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			l = session.createQuery(
					"from CensusStatus order by ar.timestamp desc").list();
			i = l.iterator();
			if (i.hasNext() == true) {
				o = i.next();
			}
			if (o != null) {
				result = (CensusStatus) o;
				result.getDateAndTime();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void deleteCensusStatus(int serial)
			throws MedrexException {

		CensusStatus ref = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			ref = (CensusStatus) session.load(CensusStatus.class, serial);
			ref.getDateAndTime();
			session.delete(ref);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Census Status Records");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public List getAllCensusStatusByYear() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// result =
			// session.createCriteria(CensusStatus.class).add(Expression.eq("typeName",
			// "Admission")).add(Projections.count("typeName")).add(Projections.groupProperty("dateAndTime"))).list();
			result = session
					.createQuery(
							"select count(typeName),YEAR(dateAndTime),typeName from CensusStatus group by typeName, YEAR(dateAndTime)")
					.list();

			// System.out.println("List size is: "+result.size());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List getCensusDischargeReportData(Date from, Date to)
			throws MedrexException {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM-dd-yyyy");
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			/*
			 * result = session.createQuery(
			 * "from CensusStatus as cs where cs.dateAndTime between "
			 * +from+" and "+to+" ").list();
			 */
			result = session
					.createCriteria(CensusStatus.class)
					.add(
							Restrictions
									.sqlRestriction("DATE(dateAndTime) Between (DATE(STR_TO_DATE('"
											+ df.format(from)
											+ "', '%m-%d-%Y'))) AND (DATE(STR_TO_DATE('"
											+ df.format(to)
											+ "', '%m-%d-%Y')))"))
					// .add(Expression.between("dateAndTime", from, to))
					.add(Expression.eq("typeName", "Discharge")).addOrder(
							Order.desc("dateAndTime")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List<CensusStatus> getCensusAdmissionReportData(Date from, Date to)
			throws MedrexException {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM-dd-yyyy");
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createCriteria(CensusStatus.class)
					.add(
							Restrictions
									.sqlRestriction("DATE(dateAndTime) Between (DATE(STR_TO_DATE('"
											+ df.format(from)
											+ "', '%m-%d-%Y'))) AND (DATE(STR_TO_DATE('"
											+ df.format(to)
											+ "', '%m-%d-%Y')))"))
					// .add(Expression.between("dateAndTime", from, to))
					.add(Expression.eq("typeName", "Admission")).addOrder(
							Order.desc("dateAndTime")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	private synchronized CensusStatus getCensusLastStatus(int residentId)
			throws MedrexException {
		CensusStatus censusStatus = null;
		Session session = SessionUtil.getInstance().getSession();
		try {
			session.beginTransaction();
			censusStatus = (CensusStatus) session.createCriteria(
					CensusStatus.class).add(
					Restrictions.eq("residentId", residentId)).addOrder(
					Order.desc("timestamp")).setMaxResults(1).uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Census Status according to resident id");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return censusStatus;
	}

	public List<CensusStatus> getCensusDayReportAdmissionList(Date date)
			throws MedrexException {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM-dd-yyyy");
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(CensusStatus.class).add(
					Restrictions.eq("typeName", "Admission")).add(
					Restrictions.sqlRestriction("DATE(dateAndTime) = '"
							+ new SimpleDateFormat("yyyy-MM-dd").format(date)
							+ "'")).addOrder(Order.desc("dateAndTime")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List<CensusStatus> getCensusDayReportDischargeList(Date date)
			throws MedrexException {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM-dd-yyyy");
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(CensusStatus.class).add(
					Restrictions.eq("typeName", "Discharge")).add(
					Restrictions.sqlRestriction("DATE(dateAndTime) = '"
							+ new SimpleDateFormat("yyyy-MM-dd").format(date)
							+ "'")).addOrder(Order.desc("dateAndTime")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List<CensusStatus> getCensusDayReportOutOnPassList(Date date)
			throws MedrexException {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM-dd-yyyy");
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(CensusStatus.class).add(
					Restrictions.eq("typeName", "Discharge")).add(
					Restrictions.eq("dischargeType", 3)).add(
					Restrictions.sqlRestriction("DATE(dateAndTime) = '"
							+ new SimpleDateFormat("yyyy-MM-dd").format(date)
							+ "'")).addOrder(Order.desc("dateAndTime")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List<CensusStatus> getCensusDayReportHospitalList(Date date)
			throws MedrexException {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM-dd-yyyy");
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(CensusStatus.class).add(
					Restrictions.eq("typeName", "Discharge")).add(
					Restrictions.eq("fromId", 1)).add(
					Restrictions.sqlRestriction("DATE(dateAndTime) = '"
							+ new SimpleDateFormat("yyyy-MM-dd").format(date)
							+ "'")).addOrder(Order.desc("dateAndTime")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public List<CensusStatus> getCensusSignInOutReportData(Date from, Date to)
			throws MedrexException {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM-dd-yyyy");
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createCriteria(CensusStatus.class)
					.add(Restrictions.ne("typeName", "Admission"))
					.add(Restrictions.ne("typeName", "Discharge"))
					.add(
							Restrictions
									.sqlRestriction("DATE(dateAndTime) Between (DATE(STR_TO_DATE('"
											+ df.format(from)
											+ "', '%m-%d-%Y'))) AND (DATE(STR_TO_DATE('"
											+ df.format(to)
											+ "', '%m-%d-%Y')))"))
					// .add(Expression.between("dateAndTime", dFrom, dTo))
					.addOrder(Order.desc("dateAndTime")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Census Status List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized CensusStatus getCensusOriginalAdmission(
			int residentSerial) throws MedrexException {
		CensusStatus censusStatus = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(CensusStatus.class).add(
					Restrictions.eq("residentId", residentSerial)).add(
					Restrictions.eq("typeName", "Admission")).addOrder(
					Order.asc("dateAndTime"));
			censusStatus = (CensusStatus) crit.setMaxResults(1).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Census Original Admission");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return censusStatus;
	}

	public synchronized List<CensusStatus> getAllCensusStatus()
			throws MedrexException {
		List<CensusStatus> cenList = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			cenList = session.createCriteria(CensusStatus.class).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Census list according to typeName");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return cenList;
	}

	public synchronized CensusStatus getNextDischarge(int resid,
			Date dateAndTime, String typeName) throws MedrexException {
		CensusStatus cen = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// cen = (CensusStatus)
			// session.createSQLQuery("SELECT * FROM censusstatus WHERE residentId = "+resid+" AND dateAndTime > '"+dateAndTime+"' AND typeName = '"+typeName+"' LIMIT 0, 1").uniqueResult();
			cen = (CensusStatus) session.createCriteria(CensusStatus.class)
					.add(Restrictions.eq("residentId", resid)).add(
							Restrictions.gt("dateAndTime", dateAndTime)).add(
							Restrictions.eq("typeName", typeName))
					.setMaxResults(1).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Census next discharge type");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return cen;
	}
}
