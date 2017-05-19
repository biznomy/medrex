package medrex.commons.vo.historyAndPhysical;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HistoryAndPhysicalGeneralFormPage1")
public class HistoryAndPhysicalGeneralFormPage1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5384278373115414934L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "previousResidence")
	private String previousResidence;
	@Column(name = "careGiver")
	private String careGiver;
	@Column(name = "recentMedicalHistory")
	private String recentMedicalHistory;
	@Column(name = "pastMedicalHistory")
	private String pastMedicalHistory;
	@Column(name = "allergies")
	private String allergies;
	@Column(name = "habits")
	private String habits;
	@Column(name = "labData")
	private String labData;

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

	public String getPreviousResidence() {
		return previousResidence;
	}

	public void setPreviousResidence(String previousResidence) {
		this.previousResidence = previousResidence;
	}

	public String getCareGiver() {
		return careGiver;
	}

	public void setCareGiver(String careGiver) {
		this.careGiver = careGiver;
	}

	public String getRecentMedicalHistory() {
		return recentMedicalHistory;
	}

	public void setRecentMedicalHistory(String recentMedicalHistory) {
		this.recentMedicalHistory = recentMedicalHistory;
	}

	public String getPastMedicalHistory() {
		return pastMedicalHistory;
	}

	public void setPastMedicalHistory(String pastMedicalHistory) {
		this.pastMedicalHistory = pastMedicalHistory;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getHabits() {
		return habits;
	}

	public void setHabits(String habits) {
		this.habits = habits;
	}

	public String getLabData() {
		return labData;
	}

	public void setLabData(String labData) {
		this.labData = labData;
	}

}
