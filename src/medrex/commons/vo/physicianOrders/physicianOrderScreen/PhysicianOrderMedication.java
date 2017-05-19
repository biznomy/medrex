package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.client.main.physicanOrders.physicianOrderScreen.PanelPhysicanOrderMedication;
import medrex.commons.vo.resident.ResidentMain;

@Entity
@Table(name = "PhysicianOrderMedication")
public class PhysicianOrderMedication implements Serializable {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 5021534147427780289L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;

	@Column(name = "medicationId")
	private Long medicationId;
	
	@OneToOne
	@JoinColumn(name = "residentId")
	private ResidentMain residents;
	
	 
	

	@Column(name = "prnInstructionComments")
	private String prnInstructionComments;

	@Column(name = "prnIndicationComments")
	private String prnIndicationComments;

	@Column(name = "frequency1")
	private int frequency1;
	@Column(name = "prnIndication")
	private int prnIndication;
	@Column(name = "doseAmount")
	private int doseAmount;
	@Column(name = "durationTo")
	private Date durationTo;
	@Column(name = "durationFrom")
	private Date durationFrom;
	@Column(name = "duration1")
	private int duration1;
	@Column(name = "route")
	private String route;
	@Column(name = "instructions")
	private String instructions;
	@Column(name = "dose")
	private String dose;
	@Column(name = "medication")
	private String medication;
	
	@Column(name = "toDay")
	private int toDay;
	@Column(name = "toMonthDay")
	private String toMondthDay;
	
	
	
	

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

	

	public Long getMedicationId() {
		return medicationId;
	}

	public void setMedicationId(Long medicationId) {
		this.medicationId = medicationId;
	}

	
	public ResidentMain getResidents() {
		return residents;
	}

	public void setResidents(ResidentMain residents) {
		this.residents = residents;
	}

	public String getPrnInstructionComments() {
		return prnInstructionComments;
	}

	public void setPrnInstructionComments(String prnInstructionComments) {
		this.prnInstructionComments = prnInstructionComments;
	}

	public String getPrnIndicationComments() {
		return prnIndicationComments;
	}

	public void setPrnIndicationComments(String prnIndicationComments) {
		this.prnIndicationComments = prnIndicationComments;
	}

	public int getFrequency1() {
		return frequency1;
	}

	public void setFrequency1(int frequency1) {
		this.frequency1 = frequency1;
	}

	public int getPrnIndication() {
		return prnIndication;
	}

	public void setPrnIndication(int prnIndication) {
		this.prnIndication = prnIndication;
	}

	public Date getDurationTo() {
		return durationTo;
	}

	public void setDurationTo(Date durationTo) {
		this.durationTo = durationTo;
	}

	public Date getDurationFrom() {
		return durationFrom;
	}

	public void setDurationFrom(Date durationFrom) {
		this.durationFrom = durationFrom;
	}

	public int getDuration1() {
		return duration1;
	}

	public void setDuration1(int duration1) {
		this.duration1 = duration1;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public int getDoseAmount() {
		return doseAmount;
	}

	public void setDoseAmount(int doseAmount) {
		this.doseAmount = doseAmount;
	}
	
	public int getToDay() {
		return toDay;
	}

	public void setToDay(int toDay) {
		this.toDay = toDay;
	}

	public String getToMondthDay() {
		return toMondthDay;
	}

	public void setToMondthDay(String toMondthDay) {
		this.toMondthDay = toMondthDay;
	}

}
