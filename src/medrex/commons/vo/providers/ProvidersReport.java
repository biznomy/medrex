package medrex.commons.vo.providers;

import java.io.Serializable;

public class ProvidersReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4558236356137991587L;

	private String providers;

	private String phoneNumber;
	private String providerType;

	public String getProviders() {
		return providers;
	}

	public void setProviders(String providers) {
		this.providers = providers;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProviderType() {
		return providerType;
	}

	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}

}
