package medrex.commons.vo.medicationCart;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medications")
public class Medications implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "formId")
	private int formId;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "medicationName")
	private String medicationName;

	@Column(name = "route")
	private String route;

	@Column(name = "frequency")
	private int frequency;

	@Column(name = "dosage")
	private int dosage;

	@Column(name = "prnIndicator")
	private int prnIndicator;

	@Column(name = "orderDate")
	private Date orderDate;

	@Column(name = "endDate")
	private Date endDate;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getMedicationName() {
		return medicationName;
	}

	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	public int getPrnIndicator() {
		return prnIndicator;
	}

	public void setPrnIndicator(int prnIndicator) {
		this.prnIndicator = prnIndicator;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}
