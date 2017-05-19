package medrex.commons.vo.medication;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PainManagementRecordRow")
public class PainManagementRecordRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3649940527361638189L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "painManagementRecordFormSerial")
	private int painManagementRecordFormSerial;
	@Column(name = "painManagementRecordRowSerial")
	int painManagementRecordRowSerial;
	@Column(name = "dateRecord")
	private Date dateRecord;
	@Column(name = "timeRecord")
	private String timeRecord;
	@Column(name = "locationOfPain")
	private String locationOfPain;
	@Column(name = "painScaleUsed")
	private String painScaleUsed;
	@Column(name = "painRatingLevelPre")
	private String painRatingLevelPre;
	@Column(name = "nonPharmaIntervention")
	private String nonPharmaIntervention;
	@Column(name = "pharmaIntervention")
	private String pharmaIntervention;
	@Column(name = "painRatingLevelPost")
	private String painRatingLevelPost;
	@Column(name = "residentAcceptableLevel")
	private String residentAcceptableLevel;
	@Column(name = "residentPainGoal")
	private String residentPainGoal;
	@Column(name = "nursesInitial")
	private boolean nursesInitial;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getPainManagementRecordFormSerial() {
		return painManagementRecordFormSerial;
	}

	public void setPainManagementRecordFormSerial(
			int painManagementRecordFormSerial) {
		this.painManagementRecordFormSerial = painManagementRecordFormSerial;
	}

	public int getPainManagementRecordRowSerial() {
		return painManagementRecordRowSerial;
	}

	public void setPainManagementRecordRowSerial(
			int painManagementRecordRowSerial) {
		this.painManagementRecordRowSerial = painManagementRecordRowSerial;
	}

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getTimeRecord() {
		return timeRecord;
	}

	public void setTimeRecord(String timeRecord) {
		this.timeRecord = timeRecord;
	}

	public String getLocationOfPain() {
		return locationOfPain;
	}

	public void setLocationOfPain(String locationOfPain) {
		this.locationOfPain = locationOfPain;
	}

	public String getPainScaleUsed() {
		return painScaleUsed;
	}

	public void setPainScaleUsed(String painScaleUsed) {
		this.painScaleUsed = painScaleUsed;
	}

	public String getPainRatingLevelPre() {
		return painRatingLevelPre;
	}

	public void setPainRatingLevelPre(String painRatingLevelPre) {
		this.painRatingLevelPre = painRatingLevelPre;
	}

	public String getNonPharmaIntervention() {
		return nonPharmaIntervention;
	}

	public void setNonPharmaIntervention(String nonPharmaIntervention) {
		this.nonPharmaIntervention = nonPharmaIntervention;
	}

	public String getPharmaIntervention() {
		return pharmaIntervention;
	}

	public void setPharmaIntervention(String pharmaIntervention) {
		this.pharmaIntervention = pharmaIntervention;
	}

	public String getPainRatingLevelPost() {
		return painRatingLevelPost;
	}

	public void setPainRatingLevelPost(String painRatingLevelPost) {
		this.painRatingLevelPost = painRatingLevelPost;
	}

	public String getResidentAcceptableLevel() {
		return residentAcceptableLevel;
	}

	public void setResidentAcceptableLevel(String residentAcceptableLevel) {
		this.residentAcceptableLevel = residentAcceptableLevel;
	}

	public String getResidentPainGoal() {
		return residentPainGoal;
	}

	public void setResidentPainGoal(String residentPainGoal) {
		this.residentPainGoal = residentPainGoal;
	}

	public boolean isNursesInitial() {
		return nursesInitial;
	}

	public void setNursesInitial(boolean nursesInitial) {
		this.nursesInitial = nursesInitial;
	}

}
