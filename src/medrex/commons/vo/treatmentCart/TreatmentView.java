package medrex.commons.vo.treatmentCart;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public class TreatmentView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2484353190260880556L;

	@Column(name = "calcSerial")
	private int calcSerial;

	@Column(name = "calculatedStartTime")
	private Date calculatedStartTime;

	@Column(name = "calculatedEndTime")
	private Date calculatedEndTime;

	@Column(name = "formId")
	private int formId;

	@Column(name = "route")
	private String route;

	@Column(name = "medication")
	private String medication;

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

	@Column(name = "status")
	private int status;

	@Column(name = "medicationId")
	private Long medicationId;

	public Long getMedicationId() {
		return medicationId;
	}

	public void setMedicationId(Long medicationId) {
		this.medicationId = medicationId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCalcSerial() {
		return calcSerial;
	}

	public void setCalcSerial(int calcSerial) {
		this.calcSerial = calcSerial;
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

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
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

}
