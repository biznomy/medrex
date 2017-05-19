package medrex.commons.vo.consultant;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RenalDialysisCommunicationFormPage2")
public class RenalDialysisCommunicationFormPage2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1971186133596044524L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "completedBy")
	private String completedBy;
	@Column(name = "changesInMedication")
	private String changesInMedication;
	@Column(name = "preDialysisWeight")
	private String preDialysisWeight;
	@Column(name = "postDialysisWeight")
	private String postDialysisWeight;
	@Column(name = "postDialysisTemperature")
	private String postDialysisTemperature;
	@Column(name = "bloodPressure")
	private String bloodPressure;
	@Column(name = "pulse")
	private String pulse;
	@Column(name = "labsDrawn")
	private String labsDrawn;
	@Column(name = "kineticModeling")
	private String kineticModeling;
	@Column(name = "medicationGiven")
	private String medicationGiven;
	@Column(name = "dietaryConcerns")
	private String dietaryConcerns;
	@Column(name = "nextDialysis")
	private Date nextDialysis;
	@Column(name = "nextDialysisTime")
	private String nextDialysisTime;
	@Column(name = "newOrders")
	private String newOrders;
	@Column(name = "signature")
	private String signature;
	@Column(name = "dateRecord")
	private Date dateRecord;
	@Column(name = "telephoneNumber")
	private String telephoneNumber;

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

	public String getCompletedBy() {
		return completedBy;
	}

	public void setCompletedBy(String completedBy) {
		this.completedBy = completedBy;
	}

	public String getChangesInMedication() {
		return changesInMedication;
	}

	public void setChangesInMedication(String changesInMedication) {
		this.changesInMedication = changesInMedication;
	}

	public String getPreDialysisWeight() {
		return preDialysisWeight;
	}

	public void setPreDialysisWeight(String preDialysisWeight) {
		this.preDialysisWeight = preDialysisWeight;
	}

	public String getPostDialysisWeight() {
		return postDialysisWeight;
	}

	public void setPostDialysisWeight(String postDialysisWeight) {
		this.postDialysisWeight = postDialysisWeight;
	}

	public String getPostDialysisTemperature() {
		return postDialysisTemperature;
	}

	public void setPostDialysisTemperature(String postDialysisTemperature) {
		this.postDialysisTemperature = postDialysisTemperature;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getPulse() {
		return pulse;
	}

	public void setPulse(String pulse) {
		this.pulse = pulse;
	}

	public String getLabsDrawn() {
		return labsDrawn;
	}

	public void setLabsDrawn(String labsDrawn) {
		this.labsDrawn = labsDrawn;
	}

	public String getKineticModeling() {
		return kineticModeling;
	}

	public void setKineticModeling(String kineticModeling) {
		this.kineticModeling = kineticModeling;
	}

	public String getMedicationGiven() {
		return medicationGiven;
	}

	public void setMedicationGiven(String medicationGiven) {
		this.medicationGiven = medicationGiven;
	}

	public String getDietaryConcerns() {
		return dietaryConcerns;
	}

	public void setDietaryConcerns(String dietaryConcerns) {
		this.dietaryConcerns = dietaryConcerns;
	}

	public Date getNextDialysis() {
		return nextDialysis;
	}

	public void setNextDialysis(Date nextDialysis) {
		this.nextDialysis = nextDialysis;
	}

	public String getNextDialysisTime() {
		return nextDialysisTime;
	}

	public void setNextDialysisTime(String nextDialysisTime) {
		this.nextDialysisTime = nextDialysisTime;
	}

	public String getNewOrders() {
		return newOrders;
	}

	public void setNewOrders(String newOrders) {
		this.newOrders = newOrders;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

}
