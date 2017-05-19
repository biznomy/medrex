package medrex.client.admin.userLogon;

import java.text.SimpleDateFormat;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.vo.admin.UserLogon;

public class ControllerUserLogon {

	SimpleDateFormat df = new SimpleDateFormat();

	public void loginUpdate() {
		UserLogon userLogon = new UserLogon();
		userLogon.setUserId(Global.currentLoggedInUserKey);
		df.applyPattern("MM / dd / yyyy hh':'mm a");
		userLogon.setLogin(df.format(MedrexClientManager.getServerTime())
				.toString());
		userLogon.setLogout("");

		try {
			Global.currentUserLogonKey = MedrexClientManager.getInstance()
					.insertOrUpdateUserLogon(userLogon);
		} catch (Exception e) {
		}
	}

	public void logoutUpdate() {

		UserLogon userLogon = null;

		try {

			userLogon = MedrexClientManager.getInstance().getUserLogon(
					Global.currentUserLogonKey);
			df.applyPattern("MM / dd / yyyy hh':'mm a");
			userLogon.setLogout(df.format(MedrexClientManager.getServerTime())
					.toString());

			try {
				Global.currentUserLogonKey = MedrexClientManager.getInstance()
						.insertOrUpdateUserLogon(userLogon);
			} catch (Exception e) {
			}

		} catch (Exception e) {
		}

	}

}
