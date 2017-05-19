package medrex.commons.vo.providers;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.masterList.ProviderTypes;
import medrex.commons.vo.masterList.State;

@Entity
@Table(name = "ProvidersRecordForm")
public class ProvidersRecordForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6762468135492005418L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne
	@JoinColumn(name = "state")
	private State state;

	@Column(name = "federalId")
	private String federalId;
	@Column(name = "npi")
	private String npi;
	@Column(name = "emailAddress")
	private String emailAddress;
	@Column(name = "cellNumber")
	private String cellNumber;
	@Column(name = "fax")
	private String fax;
	@Column(name = "phoneNumber")
	private String phoneNumber;
	@Column(name = "city")
	private String city;
	@Column(name = "address")
	private String address;
	@Column(name = "providerId")
	private String providerId;
	@Column(name = "providerSurName")
	private String providerSurName;

	@OneToOne
	@JoinColumn(name = "providerType")
	private ProviderTypes providerType;

	@Column(name = "providerName")
	private String providerName;
	@Column(name = "impField")
	private String impField;
	@Column(name = "pinNumber")
	private String pinNumber;
	@Column(name = "zip")
	private String zip;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFederalId() {
		return federalId;
	}

	public void setFederalId(String federalId) {
		this.federalId = federalId;
	}

	public String getImpField() {
		return impField;
	}

	public void setImpField(String impField) {
		this.impField = impField;
	}

	public String getNpi() {
		return npi;
	}

	public void setNpi(String npi) {
		this.npi = npi;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderSurName() {
		return providerSurName;
	}

	public void setProviderSurName(String providerSurName) {
		this.providerSurName = providerSurName;
	}

	public ProviderTypes getProviderType() {
		return providerType;
	}

	public void setProviderType(ProviderTypes providerType) {
		this.providerType = providerType;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
