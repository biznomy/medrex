package medrex.server.dao.resident;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import medrex.commons.dataObj.Rooms;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.census.counts.InHouse;
import medrex.commons.vo.masterList.Status;
import medrex.commons.vo.resident.ResidentContact;
import medrex.commons.vo.resident.ResidentContactPhone;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.ResidentPayer;
import medrex.commons.vo.resident.ResidentPayerNew;
import medrex.commons.vo.resident.TempRoomHistory;
import medrex.server.constants.Global;
import medrex.server.dao.HibernateUtil;
import medrex.server.dao.SessionUtil;
import medrex.server.dao.masterList.MasterListDAO;
import medrex.server.service.census.counts.InHouseService;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.JDBCConnectionException;

public class ResidentInformationDAO {

	private ResidentInformationDAO() {
	}

	private static ResidentInformationDAO residentInformationDao = null;

	public static synchronized ResidentInformationDAO getInstance() {

		// if obj is null create it , else just return it
		if (residentInformationDao == null) {
			residentInformationDao = new ResidentInformationDAO();

		} // end if

		return (residentInformationDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateResidentMain(ResidentMain residentMain)
			throws MedrexException {
		boolean room = true;
		if (residentMain.getSerial() != 0) {
			/* TODO: Migrating to room history */
			// getResidentRoom(residentMain.getRoom(),residentMain.getSerial());
		}
		boolean ssn = getResidentSSN(residentMain.getSs1(), residentMain
				.getSerial());
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			residentMain.getSerial();
			tx = session.beginTransaction();
			session.createQuery("from ResidentMain");
			String name = residentMain.getUserName();
			residentMain.setUserName(name.toUpperCase());
			String lastname = residentMain.getUserPass();
			residentMain.setUserPass(lastname.toUpperCase());
			/* TODO: Migrating to room history */
			/*
			 * if(residentMain.getRoom()!=null){ if
			 * (residentMain.getRoom().trim().equalsIgnoreCase("")){
			 * residentMain.setRoom(null); } }
			 */

			if (room && ssn) {

				session.saveOrUpdate(residentMain);

			} else {
				if (!room && !ssn)
					throw new MedrexException(
							"Room is already assigned. Please select other room.\nSSN can not be same.");
				else if (!room)
					throw new MedrexException(
							"Room is already assigned. Please select other room.");
				else if (!ssn)
					throw new MedrexException("SSN can not be same.");
			}

			residentMain.getSerial();
			// try {
			// if (key != newKey) {
			// File ff = new File("c:\\ImagesLTC\\" + newKey + ".jpg");
			// ff.delete();
			// }
			// } catch (Exception e) {
			// }
			tx.commit();
			return residentMain.getSerial();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
			throw new MedrexException("Error Saving Resident Information");
		} catch (MedrexException e) {
			throw e;
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Resident Information");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getResidentMain() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createQuery(
							"from ResidentMain as rm order by rm.userPass, rm.userName")
					.list();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving Residents Main Infomation");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getResidentMain(String status)
			throws MedrexException {
		List result = null;
		Status active = null;
		try {
			// active = (Status)
			// Global.medrexServer.getMasterListRecord(Status.class, "Active");
			active = (Status) MasterListDAO.getInstance().getMasterListRecord(
					Status.class, "Active");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			if (status.equalsIgnoreCase("All")) {
				result = session
						.createQuery(
								"from ResidentMain as rm order by rm.userPass, rm.userName")
						.list();
			} else if (status.equalsIgnoreCase("Active")) {
				result = session.createQuery(
						"from ResidentMain as rm  where rm.type = "
								+ active.getId()
								+ " order by rm.userPass, rm.userName").list();
			} else {
				result = session
						.createQuery(
								"from ResidentMain as rm  where rm.type = 268 order by rm.userPass, rm.userName")
						.list();
			}
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving Residents Main Infomation");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getResidentsWithOutOfPass() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session
					.createQuery(
							"from ResidentMain as rm where rm.outOfPassTimestamp<>null order by rm.userPass, rm.userName")
					.list();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving Residents Main Infomation");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getResidents(String find, String firstName,
			String SS1, String status) throws MedrexException {
		List result = null;
		Status rStatus = null;
		try {
			rStatus = (Status) Global.medrexServer.getMasterListRecord(
					Status.class, status);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		Session session = SessionUtil.getInstance().getSession();

		try {
			Transaction tx = session.beginTransaction();
			String myFindString = "";
			if (!firstName.trim().equalsIgnoreCase("")) {
				myFindString = " AND rm.userName like'" + firstName + "%' ";
			}
			if (!SS1.trim().equalsIgnoreCase("")) {
				myFindString = myFindString + " AND rm.ss1 like'" + SS1 + "%' ";
			}

			if (status.equalsIgnoreCase("All")) {
				result = session.createQuery(
						"from ResidentMain as rm where rm.userPass like '"
								+ find + "%' " + myFindString
								+ " order by rm.userPass, rm.userName").list();
			} else
				result = session.createQuery(
						"from ResidentMain as rm where rm.userPass like '"
								+ find + "%' AND rm.type = '" + rStatus.getId()
								+ "'" + myFindString
								+ " order by rm.userPass, rm.userName").list();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error finding Residents");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getResidents(String floortype)
			throws MedrexException {
		List result = null;
		Status active = null;
		try {
			active = (Status) Global.medrexServer.getMasterListRecord(
					Status.class, "Active");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		Session session = SessionUtil.getInstance().getSession();
		try {
			Transaction tx = session.beginTransaction();
			if (floortype.equalsIgnoreCase("1st floor")) {
				floortype = "( rm.floorType like '1st floor south wing%' OR rm.floorType like 'Main north wing%' AND rm.room IS NOT NULL)";
			} else {
				floortype = "( rm.floorType like '2nd floor south wing%' OR rm.floorType like 'Main and north wing%' AND rm.room IS NOT NULL)";
			}

			result = session.createQuery(
					"from ResidentMain as rm where " + floortype
							+ " AND rm.type = " + active.getId()
							+ " order by rm.userPass, rm.userName").list();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error finding Residents");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ResidentMain getResident(String lastName,
			String firstName, String SS1) throws MedrexException {
		ResidentMain result = null;
		Session session = SessionUtil.getInstance().getSession();
		try {
			Transaction tx = session.beginTransaction();
			String myFindString = "";
			if (!firstName.trim().equalsIgnoreCase("")) {
				myFindString = " AND rm.userName like'" + firstName + "%' ";
			}
			if (!SS1.trim().equalsIgnoreCase("")) {
				myFindString = myFindString + " AND rm.ss1 like'" + SS1 + "%' ";
			}

			if (!lastName.equalsIgnoreCase(""))
				result = (ResidentMain) session.createQuery(
						"from ResidentMain as rm where rm.userPass like '"
								+ lastName + "%' " + myFindString
								+ " order by rm.userPass, rm.userName")
						.uniqueResult();
			else
				result = (ResidentMain) session.createQuery(
						"from ResidentMain as rm where rm.ss1 like'" + SS1
								+ "%' " + " order by rm.userPass, rm.userName")
						.uniqueResult();

			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error finding Residents");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ResidentMain getResident(int serial)
			throws MedrexException {
		ResidentMain resMain = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// resMain = (ResidentMain) session.load(ResidentMain.class,
			// serial);
			resMain = (ResidentMain) session.createCriteria(ResidentMain.class)
					.add(Restrictions.eq("serial", serial)).uniqueResult();
			/* TODO: Migrating to room history */
			// resMain.getRoom();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error retrieving Resident");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return resMain;
	}

	// / Resident Payer

	public synchronized int insertOrUpdateResidentPayer(
			ResidentPayer residentPayer) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentPayer");
			session.saveOrUpdate(residentPayer);
			tx.commit();
			return residentPayer.getSerial();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
			throw new MedrexException("Error Saving Resident Information");
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getResidentPayers(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ResidentPayer as rp where rp.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Residents Payers List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ResidentPayer getResidentPayer(int serial)
			throws MedrexException {
		ResidentPayer resPayer = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			resPayer = (ResidentPayer) session
					.load(ResidentPayer.class, serial);
			resPayer.getPayerType();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return resPayer;
	}

	public synchronized void deleteResidentPayer(int serial)
			throws MedrexException {
		ResidentPayer resPayer = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			resPayer = (ResidentPayer) session
					.load(ResidentPayer.class, serial);
			resPayer.getPayerType();
			session.delete(resPayer);
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// / Resident Payer new

	public synchronized int insertOrUpdateResidentPayerNew(
			ResidentPayerNew residentPayerNew) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from ResidentPayerNew");
			session.saveOrUpdate(residentPayerNew);
			tx.commit();
			return residentPayerNew.getSerial();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
			throw new MedrexException("Error Saving Resident Information");
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Resident Payer New");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized void deleteResidentPayerNew(int serial)
			throws MedrexException {
		ResidentPayerNew resPayerNew = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			resPayerNew = (ResidentPayerNew) session.load(
					ResidentPayerNew.class, serial);
			resPayerNew.getInsuranceType();
			session.delete(resPayerNew);
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Payer new");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized List getResidentPayersNew(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ResidentPayerNew as rp where rp.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Residents Payers new List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ResidentPayerNew getPayerInfoStatusNewByResidentId(
			ResidentMain residentId) throws MedrexException {
		ResidentPayerNew result = null;

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// result = (ResidentPayerNew)
			// session.createSQLQuery("SELECT * FROM ResidentPayerNew WHERE residentId = "+residentId+" ORDER BY dateStart DESC LIMIT 0,1").uniqueResult();
			Criteria crit = session.createCriteria(ResidentPayerNew.class).add(
					Restrictions.eq("residentId", residentId)).addOrder(
					Order.desc("dateStart")).addOrder(Order.desc("endDate"));
			crit.setMaxResults(1);
			result = (ResidentPayerNew) crit.uniqueResult();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Residents Payers new status");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	// /// Resident Contact

	public synchronized int insertOrUpdateResidentContact(
			ResidentContact residentContact) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentContact");
			session.saveOrUpdate(residentContact);
			tx.commit();
			return residentContact.getSerial();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
			throw new MedrexException("Error Saving Resident Information");
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Resident Contact");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getResidentContacts(int residentSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ResidentContact as rc where rc.residentId="
							+ residentSerial).list();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Residents Contacts List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getResidentContacts(int residentSerial,
			String likeStr) throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			// System.out.println("likeStr: "+likeStr);

			StringTokenizer st = new StringTokenizer(likeStr);
			String fname = "";
			String lname = "";
			int count = 0;
			while (st.hasMoreTokens()) {
				count++;
				String name = st.nextToken(", ");
				if (count == 1) {
					lname = name;
					// System.out.println("lname :" + name);
				} else if (count == 2) {
					fname = name;
					// System.out.println("fname :" + name);
				}
			}

			if (!(likeStr.equalsIgnoreCase(""))
					&& !(lname.equalsIgnoreCase(""))
					&& fname.equalsIgnoreCase("")) {
				result = session.createQuery(
						"from ResidentContact as ref where ref.residentId="
								+ residentSerial + " and ref.lastName like '"
								+ lname + "'").list();
			} else if (!(likeStr.equalsIgnoreCase(""))
					&& !(lname.equalsIgnoreCase(""))
					&& !(fname.equalsIgnoreCase(""))) {
				result = session.createQuery(
						"from ResidentContact as ref where ref.residentId="
								+ residentSerial + " and ref.lastName like '"
								+ lname + "' and ref.firstName like '" + fname
								+ "'").list();
			}
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Residents Contacts List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ResidentContact getResidentContact(int serial)
			throws MedrexException {
		ResidentContact resContact = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			resContact = (ResidentContact) session.load(ResidentContact.class,
					serial);
			resContact.getAddress();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Contact");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return resContact;
	}

	public synchronized ResidentContact getResidentContact(String lastName,
			String firstName) throws MedrexException {
		ResidentContact resContact = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// resContact = (ResidentContact)
			// session.createSQLQuery("FROM ResidentContact WHERE lastName='"+lastName+"' AND firstName='"+firstName+"'").uniqueResult();
			resContact = (ResidentContact) session.createCriteria(
					ResidentContact.class).add(
					Restrictions.eq("lastName", lastName)).add(
					Restrictions.eq("firstName", firstName)).uniqueResult();
			if (resContact != null) {
				resContact.getFirstName();
			}

			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Contact");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return resContact;
	}

	public synchronized void deleteResidentContact(int serial)
			throws MedrexException {
		ResidentContact resContact = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			resContact = (ResidentContact) session.load(ResidentContact.class,
					serial);
			resContact.getAddress();
			session.delete(resContact);
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Contact");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	// Resident Contact Phone

	public synchronized int insertOrUpdateResidentContactPhone(
			ResidentContactPhone residentContactPhone) throws MedrexException {

		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.createQuery("from ResidentContactPhone");
			session.saveOrUpdate(residentContactPhone);
			tx.commit();
			return residentContactPhone.getSerial();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
			throw new MedrexException("Error Saving Resident Information");
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Resident Contact Phone");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getResidentContactPhones(int residentContactSerial)
			throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from ResidentContactPhone as rcp where rcp.contactId="
					// "from ResidentContactPhone as rcp where rcp.residentContactId="
							+ residentContactSerial).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException(
					"Error retrieving Residents Contact Phones List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized ResidentContactPhone getResidentContactPhone(int serial)
			throws MedrexException {
		ResidentContactPhone resContactPhone = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			resContactPhone = (ResidentContactPhone) session.load(
					ResidentContactPhone.class, serial);
			resContactPhone.getNumber();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Contact Phone");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return resContactPhone;
	}

	public synchronized ResidentContactPhone getResidentContactPhonePrimary(
			int residentContactSerial) throws MedrexException {
		ResidentContactPhone resContactPhone = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List list = session.createQuery(
					"from ResidentContactPhone as rCtctPh where rCtctPh.contactId="
							+ residentContactSerial
							+ " AND rCtctPh.isPrimary=1").list();
			if (list != null && list.size() != 0) {
				resContactPhone = (ResidentContactPhone) list.get(0);
				resContactPhone.getNumber();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Resident Contact Phone");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return resContactPhone;
	}

	public synchronized void deleteResidentContactPhone(int serial)
			throws MedrexException {
		ResidentContactPhone resContactPhone = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			resContactPhone = (ResidentContactPhone) session.load(
					ResidentContactPhone.class, serial);
			resContactPhone.getType();
			session.delete(resContactPhone);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Contact Phone");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized void deleteAllPhonesForContact(int residentContactSerial)
			throws MedrexException {
		ResidentContactPhone residentContactPhone = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			residentContactPhone = (ResidentContactPhone) session.load(
					ResidentContactPhone.class, residentContactSerial);
			residentContactPhone.getType();
			session.delete(residentContactPhone);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error deleting Resident Contact Phones");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	/* TODO: Migrating to room history */
	/*
	 * private synchronized boolean getResidentRoom(String room, int
	 * serial)throws MedrexException { boolean bool = false;
	 * 
	 * ResidentMain resmain = null; if(serial!=0){ resmain =
	 * getResident(serial); } Session session =
	 * SessionUtil.getInstance().getSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); List list=null; if(serial == 0){ list =
	 * session.createCriteria(ResidentMain.class).add(Expression.eq("room",
	 * room)).list(); }else{
	 * 
	 * String gRoom = resmain.getRoom(); if(gRoom!=null){
	 * if(gRoom.trim().equals(room)){ bool = true; }else{ list =
	 * session.createCriteria(ResidentMain.class).add(Expression.eq("room",
	 * room)).list(); } }else{ session = SessionUtil.getInstance().getSession();
	 * tx = session.beginTransaction(); list =
	 * session.createCriteria(ResidentMain.class).add(Expression.eq("room",
	 * room)).list(); }
	 * 
	 * } if(list!=null){ if(list.size()==0){ bool = true; }else{ bool = false; }
	 * }
	 * 
	 * tx.commit(); } catch (Exception e) { e.printStackTrace();
	 * SessionUtil.getInstance().rollbackTx(tx, ""); throw new
	 * MedrexException("Error retrieving the resident according to room"); }
	 * finally { SessionUtil.getInstance().closeSession(session); } return bool;
	 * }
	 */

	public synchronized ResidentMain getResident(int residentId, int activeId)
			throws MedrexException {
		ResidentMain resMain = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		// Status s = new Status();
		// s.setId(activeId);
		try {
			tx = session.beginTransaction();
			resMain = (ResidentMain) session.createQuery(
					"from ResidentMain as rm where rm.serial=" + residentId
							+ " and rm.type = " + activeId).uniqueResult();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error retrieving Resident");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return resMain;
	}

	public synchronized ResidentMain getResidentFloorWise(int residentId,
			String floor) throws MedrexException {
		ResidentMain resMain = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			System.out.println("floor: " + floor);
			tx = session.beginTransaction();
			if (floor.equalsIgnoreCase("1st")) {
				resMain = (ResidentMain) session
						.createQuery(
								"from ResidentMain as rm where (rm.floorType='1st floor south wing' OR rm.floorType='Main north wing') AND rm.room IS NOT NULL AND rm.serial="
										+ residentId).uniqueResult();
			}
			if (floor.equalsIgnoreCase("2nd")) {
				resMain = (ResidentMain) session
						.createQuery(
								"from ResidentMain as rm where (rm.floorType='2nd floor south wing' OR rm.floorType='Main and north wing') AND rm.room IS NOT NULL AND rm.serial="
										+ residentId).uniqueResult();
			}
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error retrieving Resident floorwise");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return resMain;
	}

	public synchronized List<ResidentMain> getActiveResident(int activeId)
			throws MedrexException {
		List l = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		Status s = new Status();
		s.setMsterName("Active");
		try {
			tx = session.beginTransaction();
			l = session.createQuery(
					"from ResidentMain as rm where rm.type = " + activeId)
					.list();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error retrieving Resident");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return l;

	}

	public synchronized List getOccupiedRoom() throws MedrexException {
		List l = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			l = session.createSQLQuery(
					"select distinct(rm.room) from ResidentMain as rm").list();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error retrieving occupied room");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return l;
	}

	private synchronized boolean getResidentSSN(String ss1, int serial)
			throws MedrexException {
		boolean bool = false;
		ResidentMain resmain = null;
		if (serial != 0) {
			resmain = getResident(serial);
		}
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List list = null;
			if (serial == 0) {
				list = session.createCriteria(ResidentMain.class).add(
						Expression.eq("ss1", ss1)).list();
			} else {

				String gSs1 = resmain.getSs1();
				if (gSs1 != null) {
					if (gSs1.trim().equals(ss1)) {
						bool = true;
					} else {
						list = session.createCriteria(ResidentMain.class).add(
								Expression.eq("ss1", ss1)).list();
					}
				} else {
					list = session.createCriteria(ResidentMain.class).add(
							Expression.eq("ss1", ss1)).list();
				}

			}
			if (list != null) {
				if (list.size() == 0) {
					bool = true;
				} else {
					bool = false;
				}
			}

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving the resident according to SSN");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return bool;
	}

	/*
	 * public synchronized List getFirstFloorResidents() throws MedrexException
	 * { List resMain = null; Session session =
	 * SessionUtil.getInstance().getSession(); Transaction tx = null; try { tx =
	 * session.beginTransaction(); resMain = session.createQuery(
	 * "from ResidentMain as rm where (rm.floorType='1st floor south wing' OR rm.floorType='Main north wing') AND rm.room IS NOT NULL ORDER BY rm.userPass ASC"
	 * ).list(); tx.commit(); } catch (JDBCConnectionException jd) {
	 * HibernateUtil.resetSessionFactory(); }catch (Exception e) {
	 * e.printStackTrace(); SessionUtil.getInstance().rollbackTx(tx, ""); throw
	 * new MedrexException("Error retrieving Resident"); } finally {
	 * SessionUtil.getInstance().closeSession(session); } return resMain; }
	 */

	public synchronized List<Rooms> getFirstFloorResidents()
			throws MedrexException {
		List<Rooms> roomsList = new ArrayList<Rooms>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List templist = session
					.createSQLQuery(
							"SELECT rm.serial, c.tfloor, c.troom FROM (SELECT inh.residentId AS residentId, th.floor AS tfloor, th.room AS troom  FROM inhouse AS inh LEFT JOIN temproomhistory AS th ON inh.residentId = th.residentId WHERE ( (NOW() BETWEEN th.startDate AND th.endDate) OR (th.startDate <= NOW() AND th.endDate IS NULL))AND (th.floor = '1st floor south wing' OR th.floor = 'Main north wing')AND th.room IS NOT NULL) AS c JOIN residentmain AS rm ON rm.serial = c.residentId ORDER BY rm.userPass ASC")
					.list();

			tx.commit();

			Iterator it = templist.iterator();
			while (it.hasNext()) {
				Rooms rooms = new Rooms();
				Object[] obj = (Object[]) it.next();
				int resId = Integer.parseInt(obj[0] + "");
				String floor = obj[1] + "";
				String room = obj[2] + "";
				ResidentMain res = getResident(resId);
				rooms.setResmain(res);
				rooms.setCurrentFloor(floor);
				rooms.setCurrentRoom(room);

				roomsList.add(rooms);
			}

		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving first floor Resident list");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return roomsList;
	}

	public synchronized List<Rooms> getSecondFloorResidents()
			throws MedrexException {
		List<Rooms> roomsList = new ArrayList<Rooms>();
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List templist = session
					.createSQLQuery(
							"SELECT rm.serial, c.tfloor, c.troom FROM (SELECT inh.residentId AS residentId, th.floor AS tfloor, th.room AS troom  FROM inhouse AS inh LEFT JOIN temproomhistory AS th ON inh.residentId = th.residentId WHERE ((NOW() BETWEEN th.startDate AND th.endDate) OR (th.startDate <= NOW() AND th.endDate IS NULL )) AND (th.floor = '2nd floor south wing' OR th.floor = 'Main and north wing') AND th.room IS NOT NULL) AS c JOIN residentmain AS rm ON rm.serial = c.residentId ORDER BY rm.userPass ASC")
					.list();

			tx.commit();

			Iterator it = templist.iterator();
			while (it.hasNext()) {
				Rooms rooms = new Rooms();
				Object[] obj = (Object[]) it.next();
				int resId = Integer.parseInt(obj[0] + "");
				String floor = obj[1] + "";
				String room = obj[2] + "";
				ResidentMain res = getResident(resId);
				rooms.setResmain(res);
				rooms.setCurrentFloor(floor);
				rooms.setCurrentRoom(room);
				roomsList.add(rooms);
			}
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Error retrieving second floor Resident list");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return roomsList;
	}

	/*
	 * public synchronized List getFirstFloorResidents(Date date) throws
	 * MedrexException { List<ResidentMain> resMain = new
	 * ArrayList<ResidentMain>(); List<InHouse> inList = new
	 * InHouseService().getInHouseForResidents(date); for(InHouse inHouse:
	 * inList){ RoomHistory roomHistory =
	 * RoomHistroyDAO.getInstance().getRoomHistory
	 * (inHouse.getResidentId(),date); if(roomHistory!=null
	 * &&((roomHistory.getFloor()!=null && roomHistory.getRoom()!=null))){ //
	 * System.out.println("roomHistory: "+roomHistory.getResidentId()+": "+
	 * roomHistory.getFloor()+": "+ roomHistory.getRoom());
	 * if(roomHistory.getFloor().equalsIgnoreCase("1st floor south wing") ||
	 * roomHistory.getFloor().equalsIgnoreCase("Main north wing")){ ResidentMain
	 * res = getResident(roomHistory.getResidentId());
	 * res.setFloorType(roomHistory.getFloor());
	 * res.setRoom(roomHistory.getRoom()); resMain.add(res); } }else{
	 * ResidentMain res = getResident(inHouse.getResidentId()); if
	 * (res.getFloorType() != null ) {
	 * if((res.getFloorType().equalsIgnoreCase("1st floor south wing") ||
	 * res.getFloorType().equalsIgnoreCase("Main north wing"))){
	 * resMain.add(res); } } } } return resMain; }
	 */

	public synchronized List getFirstFloorResidents(Date date)
			throws MedrexException {
		List<Rooms> roomsList = new ArrayList<Rooms>();

		List<InHouse> inList = new InHouseService()
				.getInHouseForResidents(date);
		for (InHouse inHouse : inList) {
			TempRoomHistory roomHist = null;
			int resid = inHouse.getResidentId();

			if (resid == 198) {
				System.out.println("resid: " + resid);
			}
			ResidentMain resmain = getResident(resid);
			roomHist = RoomHistroyDAO.getInstance()
					.getRoomHistoriesForResident(resid, date);
			if (roomHist != null) {
				if ((("1st floor south wing").equalsIgnoreCase(roomHist
						.getFloor()))
						|| (("Main north wing").equalsIgnoreCase(roomHist
								.getFloor()))) {
					Rooms rooms = new Rooms();
					rooms.setResmain(resmain);
					rooms.setCurrentRoom(roomHist.getRoom());
					roomsList.add(rooms);
				}
			}

		}
		return roomsList;
	}

	public synchronized List getSecondFloorResidents(Date date)
			throws MedrexException {
		List<Rooms> roomsList = new ArrayList<Rooms>();
		List<InHouse> inList = new InHouseService()
				.getInHouseForResidents(date);
		for (InHouse inHouse : inList) {
			int resid = inHouse.getResidentId();
			ResidentMain resmain = getResident(resid);
			TempRoomHistory roomHist = RoomHistroyDAO.getInstance()
					.getRoomHistoriesForResident(resid, date);
			if (roomHist != null) {
				if ((roomHist.getFloor()
						.equalsIgnoreCase("2nd floor south wing"))
						|| (roomHist.getFloor()
								.equalsIgnoreCase("Main and north wing"))) {
					Rooms rooms = new Rooms();
					rooms.setResmain(resmain);
					rooms.setCurrentRoom(roomHist.getRoom());
					roomsList.add(rooms);
				}
			}
		}
		return roomsList;
	}

	/*
	 * public synchronized List getSecondFloorResidents(Date date) throws
	 * MedrexException { List<ResidentMain> resMain = new
	 * ArrayList<ResidentMain>(); List<InHouse> inList = new
	 * InHouseService().getInHouseForResidents(date); for(InHouse inHouse:
	 * inList){ RoomHistory roomHistory =
	 * RoomHistroyDAO.getInstance().getRoomHistory
	 * (inHouse.getResidentId(),date); if(roomHistory!=null
	 * &&((roomHistory.getFloor()!=null && roomHistory.getRoom()!=null))){ //
	 * System
	 * .out.println("floor: "+roomHistory.getResidentId()+": "+roomHistory.
	 * getFloor()+": "+ roomHistory.getRoom());
	 * if(roomHistory.getFloor().equalsIgnoreCase("2nd floor south wing") ||
	 * roomHistory.getFloor().equalsIgnoreCase("Main and north wing")){
	 * ResidentMain res = getResident(roomHistory.getResidentId());
	 * res.setFloorType(roomHistory.getFloor());
	 * res.setRoom(roomHistory.getRoom()); resMain.add(res); } }else{
	 * ResidentMain res = getResident(inHouse.getResidentId()); if
	 * (res.getFloorType() != null ) { if(res.getFloorType() != null &&
	 * (res.getFloorType().equalsIgnoreCase("2nd floor south wing") ||
	 * res.getFloorType().equalsIgnoreCase("Main and north wing"))){
	 * resMain.add(res); } } } } return resMain; }
	 */

	public synchronized ResidentMain getResidentAccordingToFirstLastAndDob(
			String firstName, String lastName, Date dob) throws MedrexException {
		// System.out.println("firstName: "+firstName+",  lastName: "+lastName +
		// ", dob: "+new SimpleDateFormat("yyyy-MM-dd").format(dob));
		ResidentMain resMin = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			resMin = (ResidentMain) session.createCriteria(ResidentMain.class)
					.add(Restrictions.eq("userName", firstName.trim())).add(
							Restrictions.eq("userPass", lastName.trim())).add(
							Restrictions.sqlRestriction("dob = '"
									+ new SimpleDateFormat("yyyy-MM-dd")
											.format(dob) + "'")).uniqueResult();
			tx.commit();
		} catch (JDBCConnectionException jd) {
			HibernateUtil.resetSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException("Error retrieving Resident");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return resMin;
	}

	public void deleteResidentInformation(int formId) {
		// TODO Auto-generated method stub

	}

	/* TODO: Migrating to room history */
	/*
	 * public synchronized List getSecondFloorResidentss(Date date) throws
	 * MedrexException { List<ResidentMain> resMain = new
	 * ArrayList<ResidentMain>(); List<InHouse> inList = new
	 * InHouseService().getInHouseForResidents(date); for(InHouse inHouse:
	 * inList){ RoomHistory roomHistory =
	 * RoomHistroyDAO.getInstance().getRoomHistory1
	 * (inHouse.getResidentId(),date); if(roomHistory!=null
	 * &&((roomHistory.getFloor()!=null && roomHistory.getRoom()!=null))){ //
	 * System
	 * .out.println("floor: "+roomHistory.getResidentId()+": "+roomHistory.
	 * getFloor()+": "+ roomHistory.getRoom());
	 * if(roomHistory.getFloor().equalsIgnoreCase("2nd floor south wing") ||
	 * roomHistory.getFloor().equalsIgnoreCase("Main and north wing")){
	 * ResidentMain res = getResident(roomHistory.getResidentId());
	 * res.setFloorType(roomHistory.getFloor());
	 * res.setRoom(roomHistory.getRoom()); resMain.add(res); } }else{
	 * 
	 * ResidentMain res = getResident(inHouse.getResidentId());
	 * 
	 * if (res.getFloorType() != null ) { if(res.getFloorType() != null &&
	 * (res.getFloorType().equalsIgnoreCase("2nd floor south wing") ||
	 * res.getFloorType().equalsIgnoreCase("Main and north wing"))){
	 * resMain.add(res); } } else{ if (res.getRoom()==null){
	 * System.out.println(" "+ res.getUserName() + " "+ res.getUserPass()); } }
	 * } } return resMain; }
	 */

}
