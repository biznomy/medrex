package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pendingmedication")
public class PendingMedication implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1365102966482863067L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "medication")
	String medication;

	@Column(name = "diagnosis")
	private String diagnosis;

	@Column(name = "dose")
	private String dose;

	@Column(name = "ra")
	private String ra;

	@Column(name = "aa")
	private String aa;

	@Column(name = "prn")
	private int prn;

	@Column(name = "notes")
	private String notes;

	@Column(name = "dateAndTime")
	private Date dateAndTime;

	@Column(name = "residentId")
	private int residentId;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public int getPrn() {
		return prn;
	}

	public void setPrn(int prn) {
		this.prn = prn;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

}
