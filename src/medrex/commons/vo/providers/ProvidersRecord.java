package medrex.commons.vo.providers;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import medrex.commons.vo.masterList.ProviderTypes;
import medrex.commons.vo.resident.ResidentMain;

@Entity
@Table(name = "ProvidersRecord")
public class ProvidersRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9138119998201481594L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IdResident")
	private ResidentMain resident;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IdProvider")
	private ProvidersRecordForm provider;

	/*
	 * @Column(name = "residentId") private int residentId;
	 * 
	 * @Column(name = "providerId") private int providerId;
	 */

	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "endDate")
	private Date endDate;
	// transient feilds

	@Transient
	@Column(name = "providerName")
	private String providerName;

	@Transient
	@Column(name = "providerSurName")
	private String providerSurName;

	@Transient
	@Column(name = "providerType")
	private ProviderTypes providerType;

	@Transient
	@Column(name = "providerPhone")
	private String providerPhone;

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

	public void setProviderType(ProviderTypes providerTypes) {
		this.providerType = providerTypes;
	}

	public String getProviderPhone() {
		return providerPhone;
	}

	public void setProviderPhone(String providerPhone) {
		this.providerPhone = providerPhone;
	}

	public ResidentMain getResident() {
		return resident;
	}

	public void setResident(ResidentMain resident) {
		this.resident = resident;
	}

	public ProvidersRecordForm getProvider() {
		return provider;
	}

	public void setProvider(ProvidersRecordForm provider) {
		this.provider = provider;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
