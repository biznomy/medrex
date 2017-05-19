package medrex.server.dao.resident;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.RoomChange;
import medrex.commons.vo.resident.RoomHistory;
import medrex.commons.vo.resident.TempRoomHistory;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class RoomHistroyDAO {

	private RoomHistroyDAO() {

	}

	private static RoomHistroyDAO roomHistroyDAO = null;

	public static synchronized RoomHistroyDAO getInstance() {
		if (roomHistroyDAO == null) {
			roomHistroyDAO = new RoomHistroyDAO();
		}
		return roomHistroyDAO;
	}

	public synchronized int insertOrUpdateRoomHistory(RoomHistory roomHistory)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		int serial = 0;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(roomHistory);
			tx.commit();
			serial = roomHistory.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return serial;
	}

	public synchronized List<TempRoomHistory> getRoomHistory(Date from, Date to)
			throws MedrexException {
		List<TempRoomHistory> roomListHis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			roomListHis = session.createCriteria(TempRoomHistory.class).add(
					Restrictions.gt("startDate", from)).add(
					Restrictions.lt("endDate", to)).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return roomListHis;
	}

	public synchronized RoomHistory getRoomHistory1(int residentId, Date date)
			throws MedrexException {
		RoomHistory roomHis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String datestr = new SimpleDateFormat("yyyy-MM-dd").format(date);
			// System.out.println("datestr: "+datestr+": "+residentId);
			roomHis = (RoomHistory) session
					.createCriteria(RoomHistory.class)
					.add(Restrictions.eq("residentId", residentId))
					.add(
							Restrictions
									.or(
											Restrictions
													.and(
															Restrictions
																	.sqlRestriction("date(startDate) <= '"
																			+ datestr
																			+ "'"),
															Restrictions
																	.sqlRestriction("date(endDate) >= '"
																			+ datestr
																			+ "'")),
											Restrictions
													.and(
															Restrictions
																	.sqlRestriction("date(startDate) <= '"
																			+ datestr
																			+ "'"),
															Restrictions
																	.isNull("endDate"))))
					.addOrder(Order.desc("startDate")).setMaxResults(1)
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return roomHis;
	}

	// Getting room history according to residentId and dateAndTime
	public synchronized TempRoomHistory getRoomHistory(int residentId, Date date)
			throws MedrexException {
		TempRoomHistory roomHis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			roomHis = (TempRoomHistory) session.createCriteria(
					TempRoomHistory.class).add(
					Restrictions.eq("residentId", residentId)).add(
					Restrictions
							.or(Restrictions.and(Restrictions.le("startDate",
									date), (Restrictions.ge("endDate", date))),
									Restrictions.and(Restrictions.le(
											"startDate", date), Restrictions
											.isNull("endDate")))).addOrder(
					Order.desc("startDate")).setMaxResults(1).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return roomHis;
	}

	public synchronized List<RoomHistory> getRoomHistory(int residentId)
			throws MedrexException {
		List<RoomHistory> roomListHis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			roomListHis = session.createCriteria(RoomHistory.class).add(
					Restrictions.eq("residentId", residentId)).list();
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return roomListHis;
	}

	public synchronized void deleteRoomHistory(int censusid)
			throws MedrexException {
		RoomHistory roomHistory = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			roomHistory = (RoomHistory) session.createCriteria(
					RoomHistory.class).add(
					Restrictions.eq("censusId", censusid)).uniqueResult();
			session.delete(roomHistory);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void deleteRoomHistoryByCensusAdmissionId(
			int censusAdmissionId) throws MedrexException {
		TempRoomHistory roomHistory = null;
		deleteAllChnageRoomHistory(censusAdmissionId);
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			roomHistory = (TempRoomHistory) session.createCriteria(
					TempRoomHistory.class).add(
					Restrictions.eq("censusAdmissionId", censusAdmissionId))
					.uniqueResult();
			session.delete(roomHistory);
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void deleteAllChnageRoomHistory(int censusAdmissionId)
			throws MedrexException {
		TempRoomHistory roomHistory = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			roomHistory = (TempRoomHistory) session.createCriteria(
					TempRoomHistory.class).add(
					Restrictions.eq("censusAdmissionId", censusAdmissionId))
					.uniqueResult();
			List<TempRoomHistory> tempList = session.createCriteria(
					TempRoomHistory.class).add(
					Restrictions.eq("residentId", roomHistory.getResidentId()))
					.add(
							Restrictions.gt("startDate", roomHistory
									.getStartDate())).list();
			if (tempList != null) {
				for (TempRoomHistory tempRoomHist : tempList) {
					if (tempRoomHist != null)
						session.delete(tempRoomHist);
				}
			}

			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<RoomChange> getRoomChange(Date searchDate)
			throws MedrexException {
		List<RoomHistory> roomListHis = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// System.out.println("new SimpleDateFormat: "+new
			// SimpleDateFormat("yyyy-MM-dd").format(searchDate));
			roomListHis = session.createCriteria(RoomHistory.class).add(
					Restrictions.sqlRestriction("date(endDate) = '"
							+ new SimpleDateFormat("yyyy-MM-dd")
									.format(searchDate) + "'")).list();
			tx.commit();
		} catch (Exception e) {

		}

		List<RoomChange> rmChange = new ArrayList<RoomChange>();
		for (int i = 0; i < roomListHis.size(); i++) {
			RoomChange rc = new RoomChange();

			RoomHistory currentRoomHist = roomListHis.get(i);
			RoomHistory nextRoomHist = null;
			try {
				nextRoomHist = roomListHis.get(i + 1);
			} catch (Exception e) {
			}
			rc.setResidentId(currentRoomHist.getResidentId());
			rc.setChangeDate(searchDate);
			if (currentRoomHist.getCensusId() == 0) {
				rc.setFromRoom(currentRoomHist.getRoom());
				if (nextRoomHist == null) {
					ResidentInformationDAO.getInstance().getResident(
							rc.getResidentId());
				} else {
					if (nextRoomHist.getResidentId() == currentRoomHist
							.getResidentId()) {
						rc.setToRoom(nextRoomHist.getRoom());
					} else {
						ResidentInformationDAO.getInstance().getResident(
								rc.getResidentId());
					}
				}
				// System.out.println("Resident Id = "+rc.getResidentId()+", From room:"+rc.getFromRoom()+", To room: "+
				// rc.getToRoom());
				rmChange.add(rc);
			}

		}

		return rmChange;
	}

	public synchronized List<RoomChange> getRoomChangeFirstFloor(Date searchDate)
			throws MedrexException {
		List rmChangeList = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// System.out.println("new SimpleDateFormat: "+new
			// SimpleDateFormat("yyyy-MM-dd").format(searchDate));
			// roomListHis = session.createCriteria(RoomHistory.class)
			// .add(Restrictions.sqlRestriction("date(endDate) = '"+new
			// SimpleDateFormat("yyyy-MM-dd").format(searchDate)+"'"))
			// .add(Restrictions.or(Restrictions.eq("floor",
			// "1st floor south wing"), Restrictions.eq("floor",
			// "Main North Wing")))
			// .list();

			rmChangeList = session
					.createSQLQuery(
							"SELECT com1.endDate, com1.fromRoom, com2.toRoom, com1.residentId, com1.fromfloor, com2.tofloor "
									+ "FROM (SELECT tt.room AS fromRoom, tt.residentId AS residentId, tt.floor AS fromfloor, tt.startDate, tt.endDate AS endDate "
									+ "FROM temproomhistory AS tt WHERE tt.censusDischargeId = 0 AND tt.endDate IS NOT NULL AND DATE(tt.endDate) = '"
									+ new SimpleDateFormat("yyyy-MM-dd")
											.format(searchDate)
									+ "' "
									+ " AND (tt.floor = '1st floor south wing' OR tt.floor = 'Main North Wing')) AS com1 "
									+ "LEFT JOIN "
									+ "(SELECT tt.room AS toRoom, tt.residentId AS residentId, tt.floor AS tofloor, tt.startDate AS startDate, tt.endDate "
									+ "FROM temproomhistory AS tt WHERE tt.censusDischargeId = 0 AND tt.censusAdmissionId = 0 AND tt.startDate IS NOT NULL "
									+ "AND DATE(tt.startDate) = '"
									+ new SimpleDateFormat("yyyy-MM-dd")
											.format(searchDate)
									+ "') AS com2 "
									+ "ON com1.residentId = com2.residentId WHERE com1.fromRoom <> com2.toRoom AND com1.endDate = com2.startDate "
									+ "ORDER BY com1.endDate").list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<RoomChange> rmChange = new ArrayList<RoomChange>();
		Iterator itFrom = rmChangeList.iterator();
		while (itFrom.hasNext()) {
			Object[] obj = (Object[]) itFrom.next();
			RoomChange rc = new RoomChange();
			rc.setChangeDate((Date) obj[0]);
			rc.setFromRoom(obj[1].toString() + " (" + obj[4].toString() + ")");
			rc.setToRoom(obj[2].toString() + " (" + obj[5].toString() + ")");
			rc.setResidentId(Integer.parseInt(obj[3].toString()));
			rmChange.add(rc);
		}
		// for(int i=0;i<roomListHis.size();i++){
		// RoomChange rc=new RoomChange();
		//
		// TempRoomHistory currentRoomHist = roomListHis.get(i);
		// TempRoomHistory nextRoomHist = null;
		// try{
		// nextRoomHist = roomListHis.get(i+1);
		// }
		// catch(Exception e){
		// }
		// rc.setResidentId(currentRoomHist.getResidentId());
		// rc.setChangeDate(searchDate);
		// if(currentRoomHist.getCensusDischargeId()==0){
		// rc.setFromRoom(currentRoomHist.getRoom());
		//			
		// if (currentRoomHist.getCensusAdmissionId() == 0) {
		// if(nextRoomHist==null){
		// ResidentMain rm =
		// ResidentInformationDAO.getInstance().getResident(rc.getResidentId());
		// rc.setToRoom(rm.getRoom());
		// }
		// else{
		// if(nextRoomHist.getResidentId()==currentRoomHist.getResidentId()){
		// rc.setToRoom(nextRoomHist.getRoom());
		// }
		// else{
		// ResidentMain rm =
		// ResidentInformationDAO.getInstance().getResident(rc.getResidentId());
		// rc.setToRoom(rm.getRoom());
		// }
		// }
		// //
		// System.out.println("Resident Id = "+rc.getResidentId()+", From room:"+rc.getFromRoom()+", To room: "+
		// rc.getToRoom());
		// rmChange.add(rc);
		// }
		// }
		// }
		// System.out.println("msg");
		// for (RoomChange rm : rmChange) {
		// System.out.println("msg2");
		// System.out.println("Room changes :" + rm.getResidentId() + "," +
		// rm.getFromRoom() + "," + rm.getToRoom());
		// }
		return rmChange;
	}

	public synchronized List<RoomChange> getRoomChangeSecondFloor(
			Date searchDate) throws MedrexException {
		List rmChangeList = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// System.out.println("new SimpleDateFormat: "+new
			// SimpleDateFormat("yyyy-MM-dd").format(searchDate));
			// roomListHis = session.createCriteria(RoomHistory.class)
			// .add(Restrictions.sqlRestriction("date(endDate) = '"+new
			// SimpleDateFormat("yyyy-MM-dd").format(searchDate)+"'"))
			// .add(Restrictions.or(Restrictions.eq("floor",
			// "2nd floor South Wing"), Restrictions.eq("floor",
			// "Main and north wing")))
			// .list();

			// roomListHis = session.createCriteria(TempRoomHistory.class)
			// // .add(Restrictions.sqlRestriction("date(endDate) = '"+new
			// SimpleDateFormat("yyyy-MM-dd").format(searchDate)+"'"))
			// .add(Restrictions.or(Restrictions.eq("floor",
			// "2nd floor South Wing"), Restrictions.eq("floor",
			// "Main and north wing")))
			// .add(Restrictions.eq("censusAdmissionId", 0))
			// .add(Restrictions.eq("censusDischargeId", 0))
			// .add(Restrictions.or(
			// Restrictions.and(Restrictions.le("startDate", searchDate),
			// (Restrictions.ge("endDate", searchDate))),
			// Restrictions.and(Restrictions.le("startDate", searchDate),
			// Restrictions.isNull("endDate"))))
			// .list();

			// roomListHis = session.createCriteria(TempRoomHistory.class)
			// .add(Restrictions.or(Restrictions.sqlRestriction("date(endDate) = '"+new
			// SimpleDateFormat("yyyy-MM-dd").format(searchDate)+"'"),
			// Restrictions.isNull("endDate")))
			// .add(Restrictions.or(Restrictions.eq("floor",
			// "2nd floor South Wing"), Restrictions.eq("floor",
			// "Main and north wing")))
			// .list();
			// tx.commit();
			// }catch(Exception e){
			// tx.rollback();
			// throw new MedrexException("unable to retrieve room history");
			// }
			//
			// List< RoomChange> rmChange = new ArrayList<RoomChange>();
			// for(int i=0;i<roomListHis.size();i++){
			// RoomChange rc=new RoomChange();
			//
			// TempRoomHistory currentRoomHist = roomListHis.get(i);
			// TempRoomHistory nextRoomHist = null;
			// try{
			// nextRoomHist = roomListHis.get(i+1);
			// }
			// catch(Exception e){
			// }
			// rc.setResidentId(currentRoomHist.getResidentId());
			// rc.setChangeDate(searchDate);
			// if(currentRoomHist.getCensusDischargeId()==0){
			// rc.setFromRoom(currentRoomHist.getRoom());
			// if (currentRoomHist.getCensusAdmissionId() == 0) {
			// if(nextRoomHist==null){
			// ResidentMain rm =
			// ResidentInformationDAO.getInstance().getResident(rc.getResidentId());
			// rc.setToRoom(rm.getRoom());
			// }
			// else{
			// if(nextRoomHist.getResidentId()==currentRoomHist.getResidentId()){
			// rc.setToRoom(nextRoomHist.getRoom());
			// }
			// else{
			// ResidentMain rm =
			// ResidentInformationDAO.getInstance().getResident(rc.getResidentId());
			// rc.setToRoom(rm.getRoom());
			// }
			// }
			// //
			// System.out.println("Resident Id = "+rc.getResidentId()+", From room:"+rc.getFromRoom()+", To room: "+
			// rc.getToRoom());
			// rmChange.add(rc);
			// }
			// }
			//
			// }
			// System.out.println("msgsf");
			// for (RoomChange rm : rmChange) {
			// System.out.println("msg2sf");
			// System.out.println("sf Room changes :" + rm.getResidentId() + ","
			// + rm.getFromRoom() + "," + rm.getToRoom());
			// }

			rmChangeList = session
					.createSQLQuery(
							"SELECT com1.endDate, com1.fromRoom, com2.toRoom, com1.residentId, com1.fromfloor, com2.tofloor "
									+ "FROM (SELECT tt.room AS fromRoom, tt.residentId AS residentId, tt.floor AS fromfloor, tt.startDate, tt.endDate AS endDate "
									+ "FROM temproomhistory AS tt WHERE tt.censusDischargeId = 0 AND tt.endDate IS NOT NULL AND DATE(tt.endDate) = '"
									+ new SimpleDateFormat("yyyy-MM-dd")
											.format(searchDate)
									+ "' "
									+ " AND (tt.floor = '2nd floor South Wing' OR tt.floor = 'Main and north wing')) AS com1 "
									+ "LEFT JOIN "
									+ "(SELECT tt.room AS toRoom, tt.residentId AS residentId, tt.floor AS tofloor, tt.startDate AS startDate, tt.endDate "
									+ "FROM temproomhistory AS tt WHERE tt.censusDischargeId = 0 AND tt.censusAdmissionId = 0 AND tt.startDate IS NOT NULL "
									+ "AND DATE(tt.startDate) = '"
									+ new SimpleDateFormat("yyyy-MM-dd")
											.format(searchDate)
									+ "') AS com2 "
									+ "ON com1.residentId = com2.residentId WHERE com1.fromRoom <> com2.toRoom AND com1.endDate = com2.startDate "
									+ "ORDER BY com1.endDate").list();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<RoomChange> rmChange = new ArrayList<RoomChange>();
		Iterator itFrom = rmChangeList.iterator();
		while (itFrom.hasNext()) {
			Object[] obj = (Object[]) itFrom.next();
			RoomChange rc = new RoomChange();
			rc.setChangeDate((Date) obj[0]);
			rc.setFromRoom(obj[1].toString() + " (" + obj[4].toString() + ")");
			rc.setToRoom(obj[2].toString() + " (" + obj[5].toString() + ")");
			rc.setResidentId(Integer.parseInt(obj[3].toString()));
			rmChange.add(rc);
		}

		return rmChange;
	}

	/*
	 * public synchronized RoomHistory getRoomHistoryAccToCensus(int cenId)
	 * throws MedrexException { RoomHistory rh = null; Session session =
	 * SessionUtil.getInstance().getSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); rh =
	 * (RoomHistory)session.createCriteria(RoomHistory.class)
	 * .add(Restrictions.eq("censusId", cenId)) .uniqueResult(); tx.commit();
	 * }catch(Exception e){ tx.rollback(); throw new
	 * MedrexException("unable to retrieve room history for censusId " + cenId);
	 * } finally { SessionUtil.getInstance().closeSession(session); } return rh;
	 * }
	 */

	public synchronized TempRoomHistory getRoomHistoryAccToCensusAdmission(
			int cenAdmissionId) throws MedrexException {
		TempRoomHistory rh = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			rh = (TempRoomHistory) session
					.createCriteria(TempRoomHistory.class).add(
							Restrictions
									.eq("censusAdmissionId", cenAdmissionId))
					.setMaxResults(1).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException(
					"unable to retrieve room history for cenAdmissionId "
							+ cenAdmissionId);
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rh;
	}

	public synchronized TempRoomHistory getRoomHistoryAccToCensusDischarge(
			int cenDischargeId) throws MedrexException {
		TempRoomHistory rh = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			rh = (TempRoomHistory) session
					.createCriteria(TempRoomHistory.class).add(
							Restrictions
									.eq("censusDischargeId", cenDischargeId))
					.setMaxResults(1).uniqueResult();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException(
					"unable to retrieve room history for cenDischargeId "
							+ cenDischargeId);
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rh;
	}

	/*
	 * public synchronized RoomHistory getLastRoomHistory(int residentId) throws
	 * MedrexException { RoomHistory rh = null; Session session =
	 * SessionUtil.getInstance().getSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); rh =
	 * (RoomHistory)session.createCriteria(RoomHistory.class)
	 * .add(Restrictions.eq("residentId", residentId))
	 * .addOrder(Order.desc("startDate")) .setMaxResults(1) .uniqueResult();
	 * tx.commit(); }catch(Exception e){ tx.rollback(); throw new
	 * MedrexException("unable to retrieve last room history"); }finally {
	 * SessionUtil.getInstance().closeSession(session); } return rh; }
	 */

	public synchronized RoomHistory getRoomHistoryAccToCensusTemp(int cenId)
			throws MedrexException {
		RoomHistory rh = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			rh = (RoomHistory) session.createCriteria(RoomHistory.class).add(
					Restrictions.eq("censusId", cenId)).setMaxResults(1)
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException(
					"unable to retrieve room history for censusId " + cenId);
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rh;
	}

	public synchronized List<RoomHistory> getAllRoomHistory()
			throws MedrexException {
		List<RoomHistory> rhList = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			rhList = session.createCriteria(RoomHistory.class).list();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException("Getting all room history Data");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rhList;
	}

	public synchronized TempRoomHistory getLastRoomHistory(int residentId)
			throws MedrexException {
		TempRoomHistory rh = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			rh = (TempRoomHistory) session
					.createCriteria(TempRoomHistory.class).add(
							Restrictions.eq("residentId", residentId))
					.addOrder(Order.desc("startDate")).setMaxResults(1)
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException("unable to retrieve last room history");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rh;
	}

	public synchronized TempRoomHistory getCurrentRoomForResident(int residentId)
			throws MedrexException {
		TempRoomHistory rh = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			rh = (TempRoomHistory) session
					.createCriteria(TempRoomHistory.class).add(
							Restrictions.eq("residentId", residentId)).add(
							Restrictions.isNull("endDate")).setMaxResults(1)
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException(
					"Unable to retrieve urrentRoomForResident");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rh;
	}

	public synchronized int insertOrUpdateTempRoomHistory(
			TempRoomHistory tempRoomHistory) throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		int serial = 0;
		try {
			tx = session.beginTransaction();
			// System.out.println(tempRoomHistory.getResidentId()+", "+
			// tempRoomHistory.getRoom()+", "+tempRoomHistory.getCensusAdmissionId()+", "+tempRoomHistory.getCensusDischargeId());
			session.saveOrUpdate(tempRoomHistory);
			tx.commit();
			serial = tempRoomHistory.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return serial;
	}

	public synchronized List<TempRoomHistory> getAllTempRoomHistory()
			throws MedrexException {
		List<TempRoomHistory> rhList = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			rhList = session.createCriteria(TempRoomHistory.class).list();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException("Getting all Temp Room History Data");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return rhList;
	}

	// Getting all Room Histories Data according to dateAndTime
	public synchronized List<TempRoomHistory> getRoomHistories(
			Date searchDateAndTime) throws MedrexException {
		List<TempRoomHistory> roomHistList = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			roomHistList = session.createCriteria(TempRoomHistory.class).add(
					Restrictions.or(Restrictions.and(Restrictions.le(
							"startDate", searchDateAndTime), (Restrictions.ge(
							"endDate", searchDateAndTime))), Restrictions.and(
							Restrictions.le("startDate", searchDateAndTime),
							Restrictions.isNull("endDate")))).list();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException(
					"Getting all Room Histories Data according to dateAndTime");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return roomHistList;
	}

	// Getting Room Histories Data according to dateAndTime and residentId
	public synchronized TempRoomHistory getRoomHistoriesForResident(
			int residentId, Date searchDateAndTime) throws MedrexException {
		TempRoomHistory roomHist = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			roomHist = (TempRoomHistory) session.createCriteria(
					TempRoomHistory.class).add(
					Restrictions.eq("residentId", residentId)).add(
					Restrictions.or(Restrictions.and(Restrictions.le(
							"startDate", searchDateAndTime), (Restrictions.ge(
							"endDate", searchDateAndTime))), Restrictions.and(
							Restrictions.le("startDate", searchDateAndTime),
							Restrictions.isNull("endDate")))).setMaxResults(1)
					.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException(
					"Getting all Room Histories Data according to dateAndTime and residentId");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return roomHist;
	}

	// Getting Room Histories Data according to residentId
	public synchronized List<TempRoomHistory> getRoomHistoriesForResident(
			int residentId) throws MedrexException {
		List<TempRoomHistory> roomHistList = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			roomHistList = session.createCriteria(TempRoomHistory.class).add(
					Restrictions.eq("residentId", residentId)).addOrder(
					Order.asc("startDate")).list();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException(
					"Getting all Room Histories Data according to residentId");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return roomHistList;
	}

	public synchronized TempRoomHistory getRoomForResident(int serial,
			String str) throws MedrexException {
		TempRoomHistory roomHist = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			if ("Admission".equalsIgnoreCase(str)) {
				roomHist = (TempRoomHistory) session.createCriteria(
						TempRoomHistory.class).add(
						Restrictions.eq("censusAdmissionId", serial))
						.uniqueResult();
			} else if ("Discharge".equalsIgnoreCase(str)) {
				roomHist = (TempRoomHistory) session.createCriteria(
						TempRoomHistory.class).add(
						Restrictions.eq("censusDischargeId", serial))
						.uniqueResult();
			}
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new MedrexException(
					"Getting all Room Histories Data according to dateAndTime and residentId");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return roomHist;
	}
}
