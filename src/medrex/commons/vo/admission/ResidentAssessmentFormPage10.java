package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.notes.Notes;

@Entity
@Table(name = "ResidentAssessmentFormPage10")
public class ResidentAssessmentFormPage10 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -723681734812858244L;
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
	@Column(name = "answerCognition")
	private String answerCognition;
	@Column(name = "answerMobility")
	private String answerMobility;
	@Column(name = "answerCognition2")
	private String answerCognition2;
	@Column(name = "answerQ12")
	private String answerQ12;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "notesId")
	private Notes notes;

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

	public String getAnswerCognition() {
		return answerCognition;
	}

	public void setAnswerCognition(String answerCognition) {
		this.answerCognition = answerCognition;
	}

	public String getAnswerMobility() {
		return answerMobility;
	}

	public void setAnswerMobility(String answerMobility) {
		this.answerMobility = answerMobility;
	}

	public String getAnswerCognition2() {
		return answerCognition2;
	}

	public void setAnswerCognition2(String answerCognition2) {
		this.answerCognition2 = answerCognition2;
	}

	public String getAnswerQ12() {
		return answerQ12;
	}

	public void setAnswerQ12(String anserQ12) {
		this.answerQ12 = anserQ12;
	}

	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		this.notes = notes;
	}

}
