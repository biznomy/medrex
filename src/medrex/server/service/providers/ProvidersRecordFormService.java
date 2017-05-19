package medrex.server.service.providers;

import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.masterList.ProviderTypes;
import medrex.commons.vo.providers.ProvidersRecordForm;
import medrex.server.dao.providers.ProvidersRecordFormDAO;

public class ProvidersRecordFormService {

	public int insertOrUpdateProvidersRecordForm(
			ProvidersRecordForm providersRecordForm) throws MedrexException {
		return ProvidersRecordFormDAO.getInstance()
				.insertOrUpdateProvidersRecordForm(providersRecordForm);
	}

	public List getProvidersRecordForms() throws MedrexException {
		return (ProvidersRecordFormDAO.getInstance().getProvidersRecordForms());
	}

	public List getProvidersRecordForms(String type) throws MedrexException {
		return (ProvidersRecordFormDAO.getInstance()
				.getProvidersRecordForms(type));
	}

	public List getProvidersRecordForms(ProviderTypes pTypes)
			throws MedrexException {
		return (ProvidersRecordFormDAO.getInstance()
				.getProvidersRecordForms(pTypes));
	}

	public ProvidersRecordForm getProvidersRecordForm(ProviderTypes type,
			String address, String city) throws MedrexException {
		return ProvidersRecordFormDAO.getInstance().getProvidersRecordForm(
				type, address, city);
	}

	public ProvidersRecordForm getProvidersRecordForm(int serial)
			throws MedrexException {
		return (ProvidersRecordFormDAO.getInstance()
				.getProvidersRecordForm(serial));
	}

	public void deleteProvidersRecordForm(int serial) throws MedrexException {
		// try {
		// ProvidersRecordDAO.getInstance().deleteProvidersRecords(serial);
		ProvidersRecordFormDAO.getInstance().deleteProvidersRecordForm(serial);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

}
