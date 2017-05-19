package medrex.server.service.others;

import java.rmi.RemoteException;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Users;
import medrex.server.dao.UserDAO;

public class UserService {

	public int insertOrUpdateUser(Users user) throws MedrexException {
		return UserDAO.getInstance().insertOrUpdateUser(user);
	}

	/*
	 * public List getUsers(int userSerial) throws MedrexException { return
	 * (UserDAO.getInstance().getUsers(userSerial)); }
	 */
	public Users getUser(int serial) throws MedrexException {
		return (UserDAO.getInstance().getUser(serial));
	}

	public List getUsers() throws MedrexException {
		return (UserDAO.getInstance().getUsers());
	}

	public void deleteUser(int serial) throws MedrexException {
		// try {
		UserDAO.getInstance().deleteUser(serial);
		// } catch (Exception e) {
		// TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

	public boolean isValidUserLogin(String user, String password)
			throws MedrexException {

		return (UserDAO.getInstance()).isValidUserLogin(user, password);

	}

	public List getDepartmentList() throws MedrexException {
		return (UserDAO.getInstance()).getDepartmentList();
	}

	public List<Users> getUserListFromDepartment(String user)
			throws MedrexException {
		return (UserDAO.getInstance()).getUserListFromDepartment(user);
	}

	public void lockUserStatus(String userID) throws MedrexException {
		UserDAO.getInstance().lockUserStatus(userID);
	}

	public List<Users> getUserWithStatus(int status) throws MedrexException {
		return UserDAO.getInstance().getUserWithStatus(status);
	}

	public void changeUserStatus(int[] selectedUserId, int status)
			throws MedrexException {
		UserDAO.getInstance().changeUserStatus(selectedUserId, status);
	}

	public String getUserName(int currentLoggedInUserkey)
			throws MedrexException {
		return UserDAO.getInstance().getUserName(currentLoggedInUserkey);
	}

	public boolean getAdminUsers(String userName) throws MedrexException,
			RemoteException {
		return UserDAO.getInstance().getAdminUsers(userName);
	}

	public void deleteUserRecord(int serial, int phyId) throws MedrexException {
		boolean res = UserDAO.getInstance().isUserPhysicianRelationExist(
				serial, phyId);
		if (!res) {
			UserDAO.getInstance().deleteUser(serial);
		} else {
			throw new MedrexException("Error in isUserPhysicianRelationExist");
			// JOptionPane.showMessageDialog(null,"Access Denied"+" , Entries Exists for this User","Constraint Violation",JOptionPane.ERROR_MESSAGE);
		}
	}

	public String getUserNameById(int userid) throws MedrexException {
		return UserDAO.getInstance().getUserNameById(userid);
	}
}
