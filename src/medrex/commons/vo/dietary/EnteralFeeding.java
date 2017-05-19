package medrex.commons.vo.dietary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EnteralFeeding")
public class EnteralFeeding implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6802169385969580537L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "summary")
	private String summary;
	@Column(name = "recentLabs")
	private String recentLabs;
	@Column(name = "previousWeight")
	private String previousWeight;
	@Column(name = "currentWeight")
	private String currentWeight;
	@Column(name = "admissionWeight")
	private String admissionWeight;
	@Column(name = "medication")
	private String medication;
	@Column(name = "formula")
	private String formula;
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "physicianName")
	private String physicianName;
	@Column(name = "dateField1")
	private Date dateField1;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getRecentLabs() {
		return this.recentLabs;
	}

	public void setRecentLabs(String recentLabs) {
		this.recentLabs = recentLabs;
	}

	public String getPreviousWeight() {
		return this.previousWeight;
	}

	public void setPreviousWeight(String previousWeight) {
		this.previousWeight = previousWeight;
	}

	public String getCurrentWeight() {
		return this.currentWeight;
	}

	public void setCurrentWeight(String currentWeight) {
		this.currentWeight = currentWeight;
	}

	public String getAdmissionWeight() {
		return this.admissionWeight;
	}

	public void setAdmissionWeight(String admissionWeight) {
		this.admissionWeight = admissionWeight;
	}

	public String getMedication() {
		return this.medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getResidentName() {
		return this.residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getPhysicianName() {
		return this.physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public Date getDateField1() {
		return this.dateField1;
	}

	public void setDateField1(Date dateField1) {
		this.dateField1 = dateField1;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
