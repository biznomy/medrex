package medrex.server.service.admin.passwordSetting;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.PasswordSetting;
import medrex.server.dao.admin.passwordSetting.PasswordSettingDao;

public class PasswordSettingService {

	public PasswordSetting getPasswordSetting() throws MedrexException {
		return (PasswordSettingDao.getInstance().getPasswordSetting());
	}

	public int insertOrUpdatePasswordSettings(PasswordSetting ps)
			throws MedrexException {

		return (PasswordSettingDao.getInstance()
				.insertOrUpdatePasswordSettings(ps));
	}

}
