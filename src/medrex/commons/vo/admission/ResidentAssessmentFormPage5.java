package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage5")
public class ResidentAssessmentFormPage5 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1135896725940879689L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "nurseVisit")
	private Date nurseVisit;
	@Column(name = "nurse")
	private String nurse;
	@Column(name = "scoreConscience")
	private int scoreConscience;
	@Column(name = "scoreFall")
	private int scoreFall;
	@Column(name = "scoreAmbulation")
	private int scoreAmbulation;
	@Column(name = "scoreVision")
	private int scoreVision;
	@Column(name = "scoreGait")
	private int scoreGait;
	@Column(name = "scoreSystolic")
	private int scoreSystolic;
	@Column(name = "scoreMedication")
	private int scoreMedication;
	@Column(name = "scorePredisposing")
	private int scorePredisposing;

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

	public int getScoreConscience() {
		return scoreConscience;
	}

	public void setScoreConscience(int scoreConscience) {
		this.scoreConscience = scoreConscience;
	}

	public int getScoreFall() {
		return scoreFall;
	}

	public void setScoreFall(int scoreFall) {
		this.scoreFall = scoreFall;
	}

	public int getScoreAmbulation() {
		return scoreAmbulation;
	}

	public void setScoreAmbulation(int scoreAmbulation) {
		this.scoreAmbulation = scoreAmbulation;
	}

	public int getScoreVision() {
		return scoreVision;
	}

	public void setScoreVision(int scoreVision) {
		this.scoreVision = scoreVision;
	}

	public int getScoreGait() {
		return scoreGait;
	}

	public void setScoreGait(int scoreGait) {
		this.scoreGait = scoreGait;
	}

	public int getScoreSystolic() {
		return scoreSystolic;
	}

	public void setScoreSystolic(int scoreSystolic) {
		this.scoreSystolic = scoreSystolic;
	}

	public int getScoreMedication() {
		return scoreMedication;
	}

	public void setScoreMedication(int scoreMedication) {
		this.scoreMedication = scoreMedication;
	}

	public int getScorePredisposing() {
		return scorePredisposing;
	}

	public void setScorePredisposing(int scorePredisposing) {
		this.scorePredisposing = scorePredisposing;
	}

}
