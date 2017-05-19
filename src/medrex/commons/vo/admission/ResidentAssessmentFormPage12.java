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
@Table(name = "ResidentAssessmentFormPage12")
public class ResidentAssessmentFormPage12 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5914528693537207754L;
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
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "roomNo")
	private String roomNo;
	@Column(name = "assessmentBy")
	private String assessmentBy;
	@Column(name = "dateAssessment")
	private Date dateAssessment;
	@Column(name = "targetedBehavior")
	private String targetedBehavior;
	@Column(name = "q1")
	private int q1;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "q2Text")
	private Notes q2Text;
	@Column(name = "q3")
	private int q3;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "q3Text")
	private Notes q3Text;
	@Column(name = "q4")
	private int q4;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "q4Text")
	private Notes q4Text;
	@Column(name = "q5")
	private int q5;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "q5Text")
	private Notes q5Text;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "q6Text")
	private Notes q6Text;
	@Column(name = "q7")
	private int q7;

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
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

	public String getAssessmentBy() {
		return assessmentBy;
	}

	public void setAssessmentBy(String assessmentBy) {
		this.assessmentBy = assessmentBy;
	}

	public Date getDateAssessment() {
		return dateAssessment;
	}

	public void setDateAssessment(Date dateAssessment) {
		this.dateAssessment = dateAssessment;
	}

	public String getTargetedBehavior() {
		return targetedBehavior;
	}

	public void setTargetedBehavior(String targetedBehavior) {
		this.targetedBehavior = targetedBehavior;
	}

	public int getQ1() {
		return q1;
	}

	public void setQ1(int q1) {
		this.q1 = q1;
	}

	public int getQ3() {
		return q3;
	}

	public void setQ3(int q3) {
		this.q3 = q3;
	}

	public int getQ4() {
		return q4;
	}

	public void setQ4(int q4) {
		this.q4 = q4;
	}

	public Notes getQ4Text() {
		return q4Text;
	}

	public void setQ4Text(Notes text) {
		q4Text = text;
	}

	public Notes getQ3Text() {
		return q3Text;
	}

	public void setQ3Text(Notes text) {
		q3Text = text;
	}

	public int getQ5() {
		return q5;
	}

	public void setQ5(int q5) {
		this.q5 = q5;
	}

	public Notes getQ5Text() {
		return q5Text;
	}

	public void setQ5Text(Notes text) {
		q5Text = text;
	}

	public Notes getQ6Text() {
		return q6Text;
	}

	public void setQ6Text(Notes text) {
		q6Text = text;
	}

	public int getQ7() {
		return q7;
	}

	public void setQ7(int q7) {
		this.q7 = q7;
	}

	public Notes getQ2Text() {
		return q2Text;
	}

	public void setQ2Text(Notes text) {
		q2Text = text;
	}

}
