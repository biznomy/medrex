//package medrex.server.dao.schedule;
//
//public class UserScheduleDAO {
//
//}

package medrex.server.dao.schedule;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.schedule.UserSchedule;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class UserScheduleDAO {
	private UserScheduleDAO() {
	}

	private static UserScheduleDAO refUserSchedule3DAO = null;

	public static synchronized UserScheduleDAO getInstance() {
		if (refUserSchedule3DAO == null) {
			refUserSchedule3DAO = new UserScheduleDAO();
		}
		return (refUserSchedule3DAO);
	}

	public void insertOrUpdateUserSchedule(UserSchedule userSchedule)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from UserSchedule");
			session.saveOrUpdate(userSchedule);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving userSchedule");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void insertOrUpdateUserSchedules(List<UserSchedule> us)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			for (UserSchedule userschedule : us) {

				session.saveOrUpdate(userschedule);
			}
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException(
					"Error Saving MasterSchedule records................");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized UserSchedule getUserScheduleRecord(int id)
			throws MedrexException, RemoteException {
		UserSchedule uschedule = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			uschedule = (UserSchedule) session.load(UserSchedule.class, id);
			uschedule.getShift();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error Retrieving Office Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return uschedule;
	}

	public synchronized List<UserSchedule> getNurseOrCNAShiftReords(Date date)
			throws MedrexException, RemoteException {
		List<UserSchedule> records = new ArrayList<UserSchedule>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String query = "SELECT  userschedule.date,users.userType,userschedule.shift,COUNT(userschedule.shift) AS tot FROM userschedule JOIN users ON userschedule.userID=users.serial WHERE (users.userType='Nurse' OR users.userType='CNA')AND(userschedule.date='2010-06-13 10:01:52')  GROUP BY users.userType,userschedule.shift";
			// us=
			// (ArrayList<UserSchedule>)session.createSQLQuery(query).list();
			List<Object[]> data = session.createSQLQuery(query).list();
			for (Object[] record : data) {
				UserSchedule u = new UserSchedule();
				// u.setSerial((Integer) record[0]);
				u.setDate((Date) record[0]);
				//u.setUserType((String) record[1]);
				u.setShift((String) record[2]);
				// u.setTotshift((BigInteger)record[3]);
				// System.out.println(record[1].getClass());
				// u.setUserID((Users)record[4]);
				records.add(u);
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error reteriving in shift records...");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return records;
	}

	public synchronized Integer getTotalNurse(Date ondate)
			throws MedrexException, RemoteException {
		Integer data = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String userNurse = "Nurse";
		try {

			tx = session.beginTransaction();
			Object singleShift = session
					.createCriteria(UserSchedule.class)
					.setProjection(Projections.count("shift"))
					.add(
							Restrictions.sqlRestriction("date(date) = '"
									+ df.format(ondate) + "'"))
					.createAlias("userID", "u")
					.add(
							Restrictions.not(Restrictions.or(Restrictions
									.isNull("shift"), Restrictions.or(
									Restrictions.eq("shift", ""), Restrictions
											.eq("shift", "null")))))
					.add(
							Restrictions
									.or(
											Restrictions.eq("shift", "D1"),
											Restrictions
													.or(
															Restrictions.eq(
																	"shift",
																	"D2"),
															Restrictions
																	.or(
																			Restrictions
																					.eq(
																							"shift",
																							"E1"),
																			Restrictions
																					.or(
																							Restrictions
																									.eq(
																											"shift",
																											"E2"),
																							Restrictions
																									.or(
																											Restrictions
																													.eq(
																															"shift",
																															"N1"),
																											Restrictions
																													.or(
																															Restrictions
																																	.eq(
																																			"shift",
																																			"N2"),
																															Restrictions
																																	.or(
																																			Restrictions
																																					.eq(
																																							"shift",
																																							"V"),
																																			Restrictions
																																					.or(
																																							Restrictions
																																									.eq(
																																											"shift",
																																											"P"),
																																							Restrictions
																																									.or(
																																											Restrictions
																																													.eq(
																																															"shift",
																																															"S"),
																																											Restrictions
																																													.eq(
																																															"shift",
																																															"B"))))

																													)))))))
					.add(Restrictions.eq("u.userType", userNurse))
					.uniqueResult();
			data = (Integer) singleShift;

			Object doubleShift = session.createCriteria(UserSchedule.class)
					.setProjection(Projections.count("shift")).add(
							Restrictions.sqlRestriction("date(date) = '"
									+ df.format(ondate) + "'")).createAlias(
							"userID", "u").add(
							Restrictions.not(Restrictions.or(Restrictions
									.isNull("shift"), Restrictions.or(
									Restrictions.eq("shift", ""), Restrictions
											.eq("shift", "null"))))).add(
							Restrictions.or(Restrictions.eq("shift", "D1E1"),
									Restrictions.or(Restrictions.eq("shift",
											"D1N1"), Restrictions.or(
											Restrictions.eq("shift", "E1N1"),
											Restrictions.or(Restrictions.eq(
													"shift", "D2N2"),
													Restrictions.eq("shift",
															"E2N2")))))).add(
							Restrictions.eq("u.userType", userNurse))
					.uniqueResult();
			data = data + 2 * (Integer) doubleShift;

			/*
			 * Stringquery=
			 * "SELECT COUNT(us.shift) AS shiftTotal FROM userschedule AS us LEFT JOIN users AS u ON us.userID = u.serial WHERE  DATE(us.DATE)='"
			 * +df.format(ondate)+
			 * "' AND u.userType = 'Nurse' AND NOT (us.shift IS NULL OR us.shift = 'null' OR us.shift = '')"
			 * ; //Stringquery=
			 * "SELECT COUNT(shift)AS nurseTotal FROM userschedule WHERE DATE='"
			 * +df.format(date)+
			 * "' AND shift !='' AND userID IN(SELECT SERIAL FROM users WHERE userType='Nurse')"
			 * ; //us=
			 * (ArrayList<UserSchedule>)session.createSQLQuery(query).list();
			 * data= (java.math.BigInteger)
			 * session.createSQLQuery(query).uniqueResult();
			 */
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error reteriving in shift records...");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

		return data;
	}

	public synchronized Integer getTotalCNA(Date ondate)
			throws MedrexException, RemoteException {
		new ArrayList<UserSchedule>();
		Integer data = null;
		String userCNA = "CNA";
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			tx = session.beginTransaction();

			Object singleShift = session
					.createCriteria(UserSchedule.class)
					.setProjection(Projections.count("shift"))
					.add(
							Restrictions.sqlRestriction("date(date) = '"
									+ df.format(ondate) + "'"))
					.createAlias("userID", "u")
					.add(
							Restrictions.not(Restrictions.or(Restrictions
									.isNull("shift"), Restrictions.or(
									Restrictions.eq("shift", ""), Restrictions
											.eq("shift", "null")))))
					.add(
							Restrictions
									.or(
											Restrictions.eq("shift", "D1"),
											Restrictions
													.or(
															Restrictions.eq(
																	"shift",
																	"D2"),
															Restrictions
																	.or(
																			Restrictions
																					.eq(
																							"shift",
																							"E1"),
																			Restrictions
																					.or(
																							Restrictions
																									.eq(
																											"shift",
																											"E2"),
																							Restrictions
																									.or(
																											Restrictions
																													.eq(
																															"shift",
																															"N1"),
																											Restrictions
																													.or(
																															Restrictions
																																	.eq(
																																			"shift",
																																			"N2"),
																															Restrictions
																																	.or(
																																			Restrictions
																																					.eq(
																																							"shift",
																																							"V"),
																																			Restrictions
																																					.or(
																																							Restrictions
																																									.eq(
																																											"shift",
																																											"P"),
																																							Restrictions
																																									.or(
																																											Restrictions
																																													.eq(
																																															"shift",
																																															"S"),
																																											Restrictions
																																													.eq(
																																															"shift",
																																															"B")))))))))))
					.add(Restrictions.eq("u.userType", userCNA)).uniqueResult();
			data = (Integer) singleShift;

			Object doubleShift = session.createCriteria(UserSchedule.class)
					.setProjection(Projections.count("shift")).add(
							Restrictions.sqlRestriction("date(date) = '"
									+ df.format(ondate) + "'")).createAlias(
							"userID", "u").add(
							Restrictions.not(Restrictions.or(Restrictions
									.isNull("shift"), Restrictions.or(
									Restrictions.eq("shift", ""), Restrictions
											.eq("shift", "null"))))).add(
							Restrictions.or(Restrictions.eq("shift", "D1E1"),
									Restrictions.or(Restrictions.eq("shift",
											"D1N1"), Restrictions.or(
											Restrictions.eq("shift", "E1N1"),
											Restrictions.or(Restrictions.eq(
													"shift", "D2N2"),
													Restrictions.eq("shift",
															"E2N2")))))).add(
							Restrictions.eq("u.userType", userCNA))
					.uniqueResult();
			data = data + 2 * (Integer) doubleShift;

			/*
			 * Stringquery=
			 * "SELECT COUNT(us.shift) AS shiftTotal FROM userschedule AS us LEFT JOIN users AS u ON us.userID = u.serial WHERE  DATE(us.DATE)='"
			 * +df.format(date)+
			 * "' AND u.userType = 'CNA' AND NOT (us.shift IS NULL OR us.shift = 'null' OR us.shift = '')"
			 * ; data= (java.math.BigInteger)
			 * session.createSQLQuery(query).uniqueResult();
			 * System.out.println("dsfdsjfdsjf==="+data);
			 */
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error reteriving in shift records...");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return data;
	}
	
	
	
	
	
	public synchronized UserSchedule getUserScheduleRecordByDay(int userID,
			int scheduleID,int day) throws MedrexException {
		UserSchedule uschedule = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			uschedule = (UserSchedule) session.createCriteria(
					UserSchedule.class).add(
					Restrictions.eq("schedule.serial", scheduleID)).add(
					Restrictions.eq("userID.serial", userID)).add(
					Restrictions.eq("masterDay",day)).uniqueResult();
							//+ df.format(onDate) + "'")).uniqueResult();
			tx.commit();

		} catch (Exception e) {
			/*e.printStackTrace();
			System.out.println("SELECT * FROM userschedule WHERE scdeduleID="
					+ scheduleID + " AND userID=" + userID
					+ " AND DATE(DATE)='" + df.format(onDate) + "';");*/
			throw new MedrexException("Error Retrieving Office Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return uschedule;
	}
	

	public synchronized UserSchedule getUserScheduleRecord(int userID,
			int scheduleID, Date onDate) throws MedrexException {
		UserSchedule uschedule = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			uschedule = (UserSchedule) session.createCriteria(
					UserSchedule.class).add(
					Restrictions.eq("schedule.serial", scheduleID)).add(
					Restrictions.eq("userID.serial", userID)).add(
					Restrictions.sqlRestriction("date(date) = '"
							+ df.format(onDate) + "'")).uniqueResult();
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SELECT * FROM userschedule WHERE scdeduleID="
					+ scheduleID + " AND userID=" + userID
					+ " AND DATE(DATE)='" + df.format(onDate) + "';");
			throw new MedrexException("Error Retrieving Office Record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return uschedule;
	}
}
