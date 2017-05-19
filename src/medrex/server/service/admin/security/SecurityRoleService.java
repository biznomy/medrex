package medrex.server.service.admin.security;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.intf.Service;
import medrex.commons.vo.security.SecurityRole;
import medrex.server.dao.admin.security.SecurityRoleDao;

public class SecurityRoleService implements Service<SecurityRole> {

	public void delete(int serial) throws MedrexException {
		// TODO Auto-generated method stub
		SecurityRoleDao.getInstance().deleteSecurityRole(serial);
	}

	public SecurityRole get(int serial) throws MedrexException {
		// TODO Auto-generated method stub
		return SecurityRoleDao.getInstance().getSecurityRole(serial);
	}

	public SecurityRole get(String name) throws MedrexException {
		// TODO Auto-generated method stub
		return SecurityRoleDao.getInstance().getSecurityRole(name);
	}

	public List<SecurityRole> getAll(int residentId) throws MedrexException {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertOrUpdate(SecurityRole ref) throws MedrexException {
		// TODO Auto-generated method stub
		return SecurityRoleDao.getInstance().insertOrUpdateSecurityRole(ref);
	}

	public List getAllRoles() throws MedrexException {
		return SecurityRoleDao.getInstance().getAllRoles();
	}

	public List getAllApplicationRoles() throws MedrexException {
		return SecurityRoleDao.getInstance().getAllApplicationRoles();
	}

}
