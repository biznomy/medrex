package medrex.commons.vo.resident;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import medrex.commons.vo.masterList.Insurance;
import medrex.commons.vo.masterList.MedicareDays;
import medrex.commons.vo.masterList.PayerResponsibleParty;
import medrex.commons.vo.masterList.PayerType;

import org.hibernate.annotations.OptimisticLockType;

@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate = false, dynamicInsert = true, dynamicUpdate = true, optimisticLock = OptimisticLockType.VERSION)
@Table(name = "ResidentPayer")
public class ResidentPayer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3880671601445968692L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "residentId")
	private ResidentMain residentId;

	@OneToOne
	@JoinColumn(name = "payerType")
	private PayerType payerType;

	@Column(name = "effectiveDate")
	private Date effectiveDate;
	@Column(name = "endDate")
	private Date endDate;

	@OneToOne
	@JoinColumn(name = "responsibleParty")
	private PayerResponsibleParty responsibleParty;

	@OneToOne
	@JoinColumn(name = "insurance")
	private Insurance insurance;

	@OneToOne
	@JoinColumn(name = "usedMedicalDays")
	private MedicareDays usedMedicalDays;

	@Column(name = "authorizationCode")
	private String authorizationCode;
	@Version
	@Column(name = "OPTLOCK")
	private long version;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public ResidentMain getResidentId() {
		return residentId;
	}

	public void setResidentId(ResidentMain residentId) {
		this.residentId = residentId;
	}

	public PayerType getPayerType() {
		return payerType;
	}

	public void setPayerType(PayerType payerType) {
		this.payerType = payerType;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public PayerResponsibleParty getResponsibleParty() {
		return responsibleParty;
	}

	public void setResponsibleParty(PayerResponsibleParty responsibleParty) {
		this.responsibleParty = responsibleParty;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public MedicareDays getUsedMedicalDays() {
		return usedMedicalDays;
	}

	public void setUsedMedicalDays(MedicareDays usedMedicalDays) {
		this.usedMedicalDays = usedMedicalDays;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

}
