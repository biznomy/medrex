package medrex.server.dao.admin.security;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.security.SecurityRole;
import medrex.server.dao.SessionUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SecurityRoleDao {

	private SecurityRoleDao() {

	}

	private static SecurityRoleDao securityRoleDao = null;

	public static synchronized SecurityRoleDao getInstance() {
		if (securityRoleDao == null) {
			securityRoleDao = new SecurityRoleDao();
		}
		return securityRoleDao;
	}

	public synchronized int insertOrUpdateSecurityRole(SecurityRole securityRole)
			throws MedrexException {
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		;
		try {

			tx = session.beginTransaction();

			session.createQuery("from SecurityRole");
			session.saveOrUpdate(securityRole);
			// Global.currentSecurityRoleKey=securityRole.getSerial();
			tx.commit();

			return securityRole.getSerial();
		} catch (Exception e) {
			SessionUtil.getInstance().rollbackTx(tx, "");
			e.printStackTrace();
			throw new MedrexException("Error Saving Security");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}

	}

	public synchronized List getAllRoles() throws MedrexException {
		List result = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			result = session.createQuery(
					"from SecurityRole as sr where sr.typeOfRole=0").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving role List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return result;
	}

	public synchronized List getAllApplicationRoles() throws MedrexException {
		List applicationRoleList = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			applicationRoleList = session.createQuery(
					"from SecurityRole as sr where sr.typeOfRole=0").list();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving role List");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return applicationRoleList;
	}

	public synchronized SecurityRole getSecurityRole(int serial)
			throws MedrexException {
		SecurityRole securityRole = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			securityRole = (SecurityRole) session.load(SecurityRole.class,
					serial);
			securityRole.getSerial();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving security role");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return securityRole;
	}

	public synchronized SecurityRole getSecurityRole(String name)
			throws MedrexException {
		SecurityRole securityRole = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			securityRole = (SecurityRole) session.createQuery(
					"from SecurityRole as sr where sr.name = '" + name + "'")
					.uniqueResult();
			securityRole.getName();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new MedrexException("Error retrieving security role");
		} finally {
			SessionUtil.getInstance().closeSession(session);
		}
		return securityRole;
	}

	public synchronized void deleteSecurityRole(int serial)
			throws MedrexException {
		SecurityRole securityRole = null;
		Session session = SessionUtil.getInstance().getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			securityRole = (SecurityRole) session.load(SecurityRole.class,
					serial);
			session.delete(securityRole);
			tx.commit();
		} catch (Exception e) {

		}

	}

}
