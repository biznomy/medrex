package medrex.server.dao.admin.passwordSetting;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.admin.PasswordSetting;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PasswordSettingDao {
	private PasswordSettingDao() {
	}

	private static PasswordSettingDao passwordDao = null;

	public static synchronized PasswordSettingDao getInstance() {
		if (passwordDao == null) {
			passwordDao = new PasswordSettingDao();

		}
		return (passwordDao);
	}

	public int insertOrUpdatePasswordSettings(PasswordSetting ps)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("from PasswordSetting");
			session.saveOrUpdate(ps);
			tx.commit();
			return ps.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving in password record");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
	}

	public PasswordSetting getPasswordSetting() throws MedrexException {
		PasswordSetting ps = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			ps = (PasswordSetting) session.load(PasswordSetting.class, 1);
			ps.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving Password Setting");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return ps;
	}
}
