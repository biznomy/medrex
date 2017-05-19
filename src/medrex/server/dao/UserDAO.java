package medrex.server.dao;

import java.math.BigInteger;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Users;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;

public class UserDAO {

	private UserDAO() {
	}

	private static UserDAO userDao = null;

	public static synchronized UserDAO getInstance() {

		// if obj is null create it , else just return it
		if (userDao == null) {
			userDao = new UserDAO();

		} // end if

		return (userDao);

	} // end - getUniqueInstance - method

	public synchronized int insertOrUpdateUser(Users user)
			throws MedrexException {
		boolean allow = true;
		if (user.getSerial() != 0) {
			List<Users> users = getUsers();
			for (Users u : users) {
				if (u.getUserName().equalsIgnoreCase(user.getUserName())
						&& u.getSerial() != user.getSerial()) {
					allow = false;
					break;
				}
			}
		}
		if (user.getSerial() == 0) {
			List<Users> users = getUsers();
			for (Users u : users) {
				if (u.getUserName().equalsIgnoreCase(user.getUserName())) {

					allow = false;
					break;
				}
			}
		}
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			user.setUserStatus(true);
			session.createQuery("from Users");
			if (allow) {
				session.saveOrUpdate(user);
				tx.commit();
				return user.getSerial();
			}
			return 0;
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving in user's record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List getUsers() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery("from Users").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving in User List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized Users getUser(int serial) throws MedrexException {
		Users user = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			user = (Users) session.get(Users.class, serial);
			if (user != null)
				user.getUserType();
			tx.commit();
		} catch (Exception e) {
			// e.printStackTrace();
			// System.out.println("Erro to retriving user : "+ serial);
			throw new MedrexException("Error retrieving user Form");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return user;
	}

	public synchronized void deleteUser(int serial) throws MedrexException {

		Users user = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			user = (Users) session.load(Users.class, serial);
			user.getUserType();
			session.delete(user);
			tx.commit();
		} catch (ConstraintViolationException e) {
			// e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(
					"Constraint voilation Exception-Cannot Delete User");
		} catch (Exception e) {
			e.printStackTrace();
			SessionUtil.getInstance().rollbackTx(tx, "");
			throw new MedrexException(e.getMessage());
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized boolean isValidUserLogin(String user, String password)
			throws MedrexException {
		boolean test;
		Users users = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();

			users = (Users) session.createQuery(
					"from Users as ou where ou.userName='" + user
							+ "'AND ou.passwdField='" + password
							+ "'AND ou.userStatus=1").uniqueResult();

			if (users == null) {
				test = false;
			} else {
				test = true;
				// Global.currentLoggedInUserKey = users.getSerial();
				// Global.currentLoggedInUserType = users.getUserType();
				// Global.currentUserType = users.getUserType();
			}
			tx.commit();

		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Users record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return test;
	}

	public synchronized List getDepartmentList() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createCriteria(Users.class).setProjection(
					Projections.distinct(Projections.property("userType")))
					.list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving in User List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List<Users> getUserListFromDepartment(String userName)
			throws MedrexException {
		List<Users> user = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			user = session.createQuery(
					"from Users as u where u.userType='" + userName + "'")
					.list();
			// user.getUserType();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Users DAO");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return user;
	}

	public synchronized void lockUserStatus(String userID)
			throws MedrexException {
		Users users = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			users = (Users) session.createQuery(
					"from Users as ou where ou.userName='" + userID + "'")
					.uniqueResult();
			if (users != null) {
				users.setUserStatus(false);
				session.update(users);
			}
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Users record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized List<Users> getUserWithStatus(int status)
			throws MedrexException {
		List result = null;
		boolean userStatus = false;
		if (status == 1) {
			userStatus = true;
		}
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(Users.class).add(
					Expression.eq("userStatus", userStatus)).add(
					Expression.ne("userType", "Administrator")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving in User List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized void changeUserStatus(int[] selectedUserID, int status)
			throws MedrexException {
		boolean userStatus = false;
		if (status == 1) {
			userStatus = true;
		}
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			for (int i = 0; i < selectedUserID.length; i++) {
				if (selectedUserID[i] != 0) {
					Users user = (Users) session.createQuery(
							"from Users as ou where ou.serial='"
									+ selectedUserID[i] + "'").uniqueResult();
					user.getSerial();
					user.setUserStatus(!userStatus);
					session.saveOrUpdate(user);
				}
			}
			tx.commit();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving in user's record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public synchronized List<Users> getAdminUsers() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(Users.class).add(
					Expression.eq("userType", "Administrator")).list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving in Admin User List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized String getUserName(int currentLoggedInUserKey)
			throws MedrexException {
		String result = null;
		Users user = getUser(currentLoggedInUserKey);
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			if (user.getUserType().equalsIgnoreCase("Physicians")) {
				Object[] l = null;
				l = (Object[]) session
						.createSQLQuery(
								"SELECT d.physicianName, d.physicianSurName FROM doctors AS d WHERE d.serial IN (SELECT u.userId FROM users AS u WHERE u.serial = "
										+ currentLoggedInUserKey + ") LIMIT 1")
						.uniqueResult();
				result = l[0].toString() + ", ";
				result += l[1].toString();
			} else {
				Object[] l = null;
				l = (Object[]) session
						.createSQLQuery(
								"SELECT n.nurseName, n.nurseSurName FROM nurse AS n WHERE n.serial IN (SELECT u.userId FROM users AS u WHERE u.serial = "
										+ currentLoggedInUserKey + ") LIMIT 1")
						.uniqueResult();
				result = l[0].toString() + ", ";
				result += l[1].toString();
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving in Admin User List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	// user

	public synchronized String getUserNameById(int userid)
			throws MedrexException {
		String result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String usrname = null;
			usrname = (String) session.createQuery(
					"SELECT userName from Users as ou where ou.serial='"
							+ userid + "'").uniqueResult();
			result = usrname;
			// result += l[1].toString();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving in Admin User List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}
	
	public synchronized Users getUsersByIUserId(int userid)
	throws MedrexException {
   Users result = null;
    Session session = SessionUtil.getInstance().getSession();
   Transaction tx = null;
    try {
	tx = session.beginTransaction();
	Users usr = null;
	usr =   (Users) session.createCriteria(Users.class).add(Restrictions.eq("userId", userid)).uniqueResult();
	result = usr;
	 
	tx.commit();
    } catch (Exception e) {
	e.printStackTrace();
	throw new MedrexException("Error retrieving in Admin User List");
    } finally {
	SessionUtil.getInstance().closeSession(session);
     }
      return result;
}


	public synchronized boolean getAdminUsers(String userName)
			throws MedrexException {
		List<Users> result = null;
		boolean val = false;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			result = session.createCriteria(Users.class).add(
					Expression.eq("userType", "Administrator")).list();
			for (Users user : result) {
				// System.out.println("UserName:"+user.getUserName()+",User Type:"+user.getUserType());
				if (user.getUserName().equalsIgnoreCase(userName)) {
					val = true;
				}
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving in Admin User List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return val;
	}

	public synchronized boolean isUserPhysicianRelationExist(int userId,
			int phyId) throws MedrexException {
		boolean val = false;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			int count = ((BigInteger) session
					.createSQLQuery(
							"SELECT COUNT(*) FROM users AS usr WHERE usr.serial = "
									+ userId
									+ " AND ((SELECT COUNT(*) FROM censusStatus WHERE administeredBy = usr.serial) OR (SELECT COUNT(*) FROM physicianForm AS pF LEFT JOIN doctors AS d ON d.serial = pF.physicianId LEFT JOIN users AS u ON u.formId = d.serial WHERE u.serial = usr.serial ))")
					.uniqueResult()).intValue();
			if (count == 0) {
				val = false;
			} else {
				val = true;
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error in isUserPhysicianRelationExist");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		System.out.println("relation exist:" + val);
		return val;
	}
}
