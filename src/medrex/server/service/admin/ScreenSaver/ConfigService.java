package medrex.server.service.admin.ScreenSaver;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.Config;
import medrex.server.dao.admin.screenSaver.ConfigDAO;

public class ConfigService {

	public void insertOrUpdateScreenSaverConfig(Config config)
			throws MedrexException {
		ConfigDAO.getInstance().insertOrUpdateScreenSaverConfig(config);

	}

	public Config getScreenSaverConfig() throws MedrexException {
		return ConfigDAO.getInstance().getScreenSaverConfig();
	}

}
