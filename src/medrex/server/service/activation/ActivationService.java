/**
 * Medrex
 * --------------------------
 * Filename: ActivationService.java
 * Package: medrex.server.service.activation
 */
package medrex.server.service.activation;

import java.util.Date;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.activation.ActivationLicense;
import medrex.server.dao.activation.ActivationDAO;

/**
 * @author D S Naruka
 * 
 */
public class ActivationService {
	public int insertOrUpdateActivationLicense(ActivationLicense license)
			throws MedrexException {
		return ActivationDAO.getInstance().insertOrUpdateActivationLicense(
				license);
	}

	public boolean isActivationLicenseValid() throws MedrexException {
		return ActivationDAO.getInstance().isActivationLicenseValid();
	}

	public void deleteActivationLicense(int serial) throws MedrexException {
		ActivationDAO.getInstance().deleteActivationLicense(serial);
	}

	public List<ActivationLicense> getActivationLicenses()
			throws MedrexException {
		return ActivationDAO.getInstance().getActivationLicenses();
	}

	public ActivationLicense getActivationLicense(int serial)
			throws MedrexException {
		return ActivationDAO.getInstance().getActivationLicense(serial);
	}

	public ActivationLicense getActivationLicense(Date forDate)
			throws MedrexException {
		return ActivationDAO.getInstance().getActivationLicense(forDate);
	}
}
