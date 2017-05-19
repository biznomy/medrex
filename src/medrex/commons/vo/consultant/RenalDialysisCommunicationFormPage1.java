package medrex.commons.vo.consultant;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RenalDialysisCommunicationFormPage1")
public class RenalDialysisCommunicationFormPage1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7197856212538050406L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "significantChanges")
	private String significantChanges;
	@Column(name = "significantChangesOption")
	private int significantChangesOption;
	@Column(name = "significantChangesYes")
	private String significantChangesYes;
	@Column(name = "significantChangesNo")
	private String significantChangesNo;
	@Column(name = "tempVitals")
	private String tempVitals;
	@Column(name = "tempDate")
	private Date tempDate;
	@Column(name = "tempTime")
	private String tempTime;
	@Column(name = "tempAbnormalValues")
	private String tempAbnormalValues;
	@Column(name = "bpVitals")
	private String bpVitals;
	@Column(name = "bpDate")
	private Date bpDate;
	@Column(name = "bpTime")
	private String bpTime;
	@Column(name = "bpAbnormalValues")
	private String bpAbnormalValues;
	@Column(name = "pulseVitals")
	private String pulseVitals;
	@Column(name = "pulseDate")
	private Date pulseDate;
	@Column(name = "pulseTime")
	private String pulseTime;
	@Column(name = "pulseAbnormalValues")
	private String pulseAbnormalValues;
	@Column(name = "glucoseVitals")
	private String glucoseVitals;
	@Column(name = "glucoseDate")
	private Date glucoseDate;
	@Column(name = "glucoseTime")
	private String glucoseTime;
	@Column(name = "glucoseAbnormalValues")
	private String glucoseAbnormalValues;
	@Column(name = "dietaryConcerns")
	private String dietaryConcerns;
	@Column(name = "psychosocialIssues")
	private String psychosocialIssues;
	@Column(name = "medicationGiven")
	private String medicationGiven;
	@Column(name = "other")
	private String other;
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

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getSignificantChanges() {
		return significantChanges;
	}

	public void setSignificantChanges(String significantChanges) {
		this.significantChanges = significantChanges;
	}

	public int getSignificantChangesOption() {
		return significantChangesOption;
	}

	public void setSignificantChangesOption(int significantChangesOption) {
		this.significantChangesOption = significantChangesOption;
	}

	public String getSignificantChangesYes() {
		return significantChangesYes;
	}

	public void setSignificantChangesYes(String significantChangesYes) {
		this.significantChangesYes = significantChangesYes;
	}

	public String getSignificantChangesNo() {
		return significantChangesNo;
	}

	public void setSignificantChangesNo(String significantChangesNo) {
		this.significantChangesNo = significantChangesNo;
	}

	public String getTempVitals() {
		return tempVitals;
	}

	public void setTempVitals(String tempVitals) {
		this.tempVitals = tempVitals;
	}

	public Date getTempDate() {
		return tempDate;
	}

	public void setTempDate(Date tempDate) {
		this.tempDate = tempDate;
	}

	public String getTempTime() {
		return tempTime;
	}

	public void setTempTime(String tempTime) {
		this.tempTime = tempTime;
	}

	public String getTempAbnormalValues() {
		return tempAbnormalValues;
	}

	public void setTempAbnormalValues(String tempAbnormalValues) {
		this.tempAbnormalValues = tempAbnormalValues;
	}

	public String getBpVitals() {
		return bpVitals;
	}

	public void setBpVitals(String bpVitals) {
		this.bpVitals = bpVitals;
	}

	public Date getBpDate() {
		return bpDate;
	}

	public void setBpDate(Date bpDate) {
		this.bpDate = bpDate;
	}

	public String getBpTime() {
		return bpTime;
	}

	public void setBpTime(String bpTime) {
		this.bpTime = bpTime;
	}

	public String getBpAbnormalValues() {
		return bpAbnormalValues;
	}

	public void setBpAbnormalValues(String bpAbnormalValues) {
		this.bpAbnormalValues = bpAbnormalValues;
	}

	public String getPulseVitals() {
		return pulseVitals;
	}

	public void setPulseVitals(String pulseVitals) {
		this.pulseVitals = pulseVitals;
	}

	public Date getPulseDate() {
		return pulseDate;
	}

	public void setPulseDate(Date pulseDate) {
		this.pulseDate = pulseDate;
	}

	public String getPulseTime() {
		return pulseTime;
	}

	public void setPulseTime(String pulseTime) {
		this.pulseTime = pulseTime;
	}

	public String getPulseAbnormalValues() {
		return pulseAbnormalValues;
	}

	public void setPulseAbnormalValues(String pulseAbnormalValues) {
		this.pulseAbnormalValues = pulseAbnormalValues;
	}

	public String getGlucoseVitals() {
		return glucoseVitals;
	}

	public void setGlucoseVitals(String glucoseVitals) {
		this.glucoseVitals = glucoseVitals;
	}

	public Date getGlucoseDate() {
		return glucoseDate;
	}

	public void setGlucoseDate(Date glucoseDate) {
		this.glucoseDate = glucoseDate;
	}

	public String getGlucoseTime() {
		return glucoseTime;
	}

	public void setGlucoseTime(String glucoseTime) {
		this.glucoseTime = glucoseTime;
	}

	public String getGlucoseAbnormalValues() {
		return glucoseAbnormalValues;
	}

	public void setGlucoseAbnormalValues(String glucoseAbnormalValues) {
		this.glucoseAbnormalValues = glucoseAbnormalValues;
	}

	public String getDietaryConcerns() {
		return dietaryConcerns;
	}

	public void setDietaryConcerns(String dietaryConcerns) {
		this.dietaryConcerns = dietaryConcerns;
	}

	public String getPsychosocialIssues() {
		return psychosocialIssues;
	}

	public void setPsychosocialIssues(String psychosocialIssues) {
		this.psychosocialIssues = psychosocialIssues;
	}

	public String getMedicationGiven() {
		return medicationGiven;
	}

	public void setMedicationGiven(String medicationGiven) {
		this.medicationGiven = medicationGiven;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
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
