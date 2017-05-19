package medrex.commons.vo.medicationCart;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.others.Users;

@Entity
@Table(name = "CalculatedMedication")
public class CalculatedMedication implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "medSerial")
	private Medications medSerial;

	@Column(name = "calculatedStartTime")
	private Date calculatedStartTime;

	@Column(name = "calculatedEndTime")
	private Date calculatedEndTime;

	@Column(name = "status")
	private int status;

	@Column(name = "timeRecord")
	private Date timeRecord;

	@Column(name = "notes")
	private String notes;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Users user;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Medications getMedSerial() {
		return medSerial;
	}

	public void setMedSerial(Medications medSerial) {
		this.medSerial = medSerial;
	}

	public Date getCalculatedStartTime() {
		return calculatedStartTime;
	}

	public void setCalculatedStartTime(Date calculatedStartTime) {
		this.calculatedStartTime = calculatedStartTime;
	}

	public Date getCalculatedEndTime() {
		return calculatedEndTime;
	}

	public void setCalculatedEndTime(Date calculatedEndTime) {
		this.calculatedEndTime = calculatedEndTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getTimeRecord() {
		return timeRecord;
	}

	public void setTimeRecord(Date timeRecord) {
		this.timeRecord = timeRecord;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}
