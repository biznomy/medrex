package medrex.server.service.admin.userLogon;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Service;
import medrex.commons.vo.admin.UserLogon;
import medrex.commons.vo.others.Users;
import medrex.server.dao.admin.userLogon.UserLogonDao;
import medrex.server.service.others.UserService;

public class UserLogonService implements Service<UserLogon> {

	public void delete(int serial) throws MedrexException {
		// TODO Auto-generated method stub
		UserLogonDao.getInstance().deleteUserLogon(serial);
	}

	public UserLogon get(int serial) throws MedrexException {
		// TODO Auto-generated method stub
		return UserLogonDao.getInstance().getUserLogon(serial);
	}

	public List<UserLogon> getAll() throws MedrexException {
		List<UserLogon> userLogs = UserLogonDao.getInstance()
				.getUsersForToday();
		List<UserLogon> userLogsWithUserName = new ArrayList<UserLogon>();
		for (UserLogon userlog : userLogs) {
			Users user = new UserService().getUser(userlog.getUserId());
			userlog.setUserName(user.getUserName());
			userLogsWithUserName.add(userlog);
		}
		return userLogsWithUserName;
	}

	public int insertOrUpdate(UserLogon ref) throws MedrexException {
		return UserLogonDao.getInstance().insertOrUpdateUserLogon(ref);
	}

	public List<UserLogon> getAll(int residentId) throws MedrexException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserLogon getcurrentUserLogon() throws MedrexException {
		return UserLogonDao.getInstance().getcurrentUserLogon();
	}

	public List<UserLogon> getFilteredUsers(Date from, Date to)
			throws MedrexException {
		List<UserLogon> userLogs = UserLogonDao.getInstance().getFilteredUsers(
				from, to);
		List<UserLogon> userLogsWithUserName = new ArrayList<UserLogon>();
		for (UserLogon userlog : userLogs) {
			Users user = new UserService().getUser(userlog.getUserId());
			userlog.setUserName(user.getUserName());
			userLogsWithUserName.add(userlog);
		}
		return userLogsWithUserName;
	}

}
