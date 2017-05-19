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
import javax.persistence.Table;

import org.hibernate.annotations.OptimisticLockType;

@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate = false, dynamicInsert = true, dynamicUpdate = true, optimisticLock = OptimisticLockType.VERSION)
@Table(name = "ResidentPayerNew")
public class ResidentPayerNew implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2986687241822915564L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "residentId")
	private ResidentMain residentId;

	@Column(name = "insuranceType")
	private String insuranceType;

	@Column(name = "fulldays")
	private String fulldays;

	@Column(name = "coinsdate")
	private String coinsdate;

	@Column(name = "dateStart")
	private Date dateStart;
	@Column(name = "endDate")
	private Date endDate;

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

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFulldays() {
		return fulldays;
	}

	public String getCoinsdate() {
		return coinsdate;
	}

	public void setFulldays(String fulldays) {
		this.fulldays = fulldays;
	}

	public void setCoinsdate(String coinsdate) {
		this.coinsdate = coinsdate;
	}

}
