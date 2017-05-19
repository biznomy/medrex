package medrex.server.service.providers;

import java.util.ArrayList;
import java.util.List;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.providers.ProvidersRecord;
import medrex.commons.vo.providers.ProvidersRecordForm;
import medrex.server.dao.providers.ProvidersRecordDAO;

public class ProvidersRecordService {

	public int insertOrUpdateProvidersRecord(ProvidersRecord providersRecord)
			throws MedrexException {
		return ProvidersRecordDAO.getInstance().insertOrUpdateProvidersRecord(
				providersRecord);
	}

	public List getProvidersRecords(int residentSerial) throws MedrexException {
		// return (ProvidersRecordDAO.getInstance()
		// .getProvidersRecords(residentSerial));
		List<ProvidersRecord> providerRecords = ProvidersRecordDAO
				.getInstance().getProvidersRecords(residentSerial);
		List<ProvidersRecord> providerWithCompleteInfo = new ArrayList<ProvidersRecord>();
		for (ProvidersRecord provider : providerRecords) {
			ProvidersRecordForm providerRF = new ProvidersRecordFormService()
					.getProvidersRecordForm(provider.getProvider().getSerial());
			provider.setProviderName(providerRF.getProviderName());
			provider.setProviderPhone(providerRF.getPhoneNumber());
			provider.setProviderType(providerRF.getProviderType());
			provider.setProviderSurName(providerRF.getProviderSurName());
			providerWithCompleteInfo.add(provider);
		}
		return providerWithCompleteInfo;
	}

	public List getProvidersRecords() throws MedrexException {
		return (ProvidersRecordDAO.getInstance().getProvidersRecords());
	}

	public ProvidersRecord getProvidersRecord(int serial)
			throws MedrexException {
		return (ProvidersRecordDAO.getInstance().getProvidersRecord(serial));
	}

	public void deleteProvidersRecord(int serial) throws MedrexException {
		try {
			ProvidersRecordDAO.getInstance().deleteProvidersRecord(serial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean getProvidersRecordsOfType(int residentSerial,
			int providerType) throws MedrexException {
		return (ProvidersRecordDAO.getInstance().getProvidersRecordsOfType(
				residentSerial, providerType));
	}

	public ProvidersRecord getProvidersRecord(int residentSerial,
			int providerType) throws MedrexException {
		return (ProvidersRecordDAO.getInstance().getProvidersRecord(
				residentSerial, providerType));
	}

}
