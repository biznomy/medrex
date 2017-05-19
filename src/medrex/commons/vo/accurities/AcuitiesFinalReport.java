package medrex.commons.vo.accurities;

import java.io.Serializable;

public class AcuitiesFinalReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2913604620601525066L;
	private int serial;
	private String o2resident;
	private String ivresident;
	private String woresident;
	private String tresident;
	private String orthopedicCareResident;
	private String advancedNeuroCareResident;
	private String respiratoryServicesResident;
	private String tracheotomyResident;
	private String headTrauma;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getO2resident() {
		return o2resident;
	}

	public void setO2resident(String o2resident) {
		this.o2resident = o2resident;
	}

	public String getIvresident() {
		return ivresident;
	}

	public void setIvresident(String ivresident) {
		this.ivresident = ivresident;
	}

	public String getWoresident() {
		return woresident;
	}

	public void setWoresident(String woresident) {
		this.woresident = woresident;
	}

	public String getTresident() {
		return tresident;
	}

	public void setTresident(String tresident) {
		this.tresident = tresident;
	}

	public String getOrthopedicCareResident() {
		return orthopedicCareResident;
	}

	public void setOrthopedicCareResident(String orthopedicCareResident) {
		this.orthopedicCareResident = orthopedicCareResident;
	}

	public String getAdvancedNeuroCareResident() {
		return advancedNeuroCareResident;
	}

	public void setAdvancedNeuroCareResident(String advancedNeuroCareResident) {
		this.advancedNeuroCareResident = advancedNeuroCareResident;
	}

	public String getRespiratoryServicesResident() {
		return respiratoryServicesResident;
	}

	public void setRespiratoryServicesResident(
			String respiratoryServicesResident) {
		this.respiratoryServicesResident = respiratoryServicesResident;
	}

	public String getTracheotomyResident() {
		return tracheotomyResident;
	}

	public void setTracheotomyResident(String tracheotomyResident) {
		this.tracheotomyResident = tracheotomyResident;
	}

	public String getHeadTrauma() {
		return headTrauma;
	}

	public void setHeadTrauma(String headTrauma) {
		this.headTrauma = headTrauma;
	}

}
