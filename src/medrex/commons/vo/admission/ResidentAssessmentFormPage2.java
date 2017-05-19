package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage2")
public class ResidentAssessmentFormPage2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4519599707896186420L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "scoreSensory")
	private int scoreSensory;
	@Column(name = "scoreMoisture")
	private int scoreMoisture;
	@Column(name = "scoreActivity")
	private int scoreActivity;
	@Column(name = "scoreMobility")
	private int scoreMobility;
	@Column(name = "scoreNutrition")
	private int scoreNutrition;
	@Column(name = "scoreFriction")
	private int scoreFriction;
	@Column(name = "nurse")
	private String nurse;
	@Column(name = "submitDate")
	private Date submitDate;
	@Column(name = "nurseVisit")
	private Date nurseVisit;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public Date getNurseVisit() {
		return nurseVisit;
	}

	public void setNurseVisit(Date nurseVisit) {
		this.nurseVisit = nurseVisit;
	}

	public int getScoreActivity() {
		return scoreActivity;
	}

	public void setScoreActivity(int scoreActivity) {
		this.scoreActivity = scoreActivity;
	}

	public int getScoreFriction() {
		return scoreFriction;
	}

	public void setScoreFriction(int scoreFriction) {
		this.scoreFriction = scoreFriction;
	}

	public int getScoreMobility() {
		return scoreMobility;
	}

	public void setScoreMobility(int scoreMobility) {
		this.scoreMobility = scoreMobility;
	}

	public int getScoreMoisture() {
		return scoreMoisture;
	}

	public void setScoreMoisture(int scoreMoisture) {
		this.scoreMoisture = scoreMoisture;
	}

	public int getScoreNutrition() {
		return scoreNutrition;
	}

	public void setScoreNutrition(int scoreNutrition) {
		this.scoreNutrition = scoreNutrition;
	}

	public int getScoreSensory() {
		return scoreSensory;
	}

	public void setScoreSensory(int scoreSensory) {
		this.scoreSensory = scoreSensory;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

}
