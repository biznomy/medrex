package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Prescription")
public class Prescription implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1425181317540040465L;

	@Id
	@GeneratedValue
	@Column(name = "SERIAL")
	int serial;

	@Column(name = "MEDICATION")
	String medication;

	@Column(name = "FREQUENCY")
	String frequency;

	@Column(name = "RA")
	String ra;

	@Column(name = "AA")
	String aa;

	@Column(name = "PRN")
	int prn;

	@Column(name = "ORDERDATE")
	Date orderDate;

	@Column(name = "DCDATE")
	Date dcDate;

	@Column(name = "NOTES")
	String notes;

	@Column(name = "residentId")
	int residentId;

	@Column(name = "DIAGNOSIS")
	private String diagnosis;

	@Column(name = "DOSE")
	private String dose;

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

	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public Date getDcDate() {
		return dcDate;
	}

	public void setDcDate(Date dcDate) {
		this.dcDate = dcDate;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getPrn() {
		return prn;
	}

	public void setPrn(int prn) {
		this.prn = prn;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

}
