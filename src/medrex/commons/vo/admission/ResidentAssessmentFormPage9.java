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
@Table(name = "ResidentAssessmentFormPage9")
public class ResidentAssessmentFormPage9 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1961712634981890294L;
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
	@Column(name = "answerQ1Text")
	private String answerQ1Text;
	@Column(name = "answerQ2Text")
	private String answerQ2Text;
	@Column(name = "answerQ3")
	private int answerQ3;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "answerQ3Text")
	private Notes answerQ3Text;

	@Column(name = "answerQ4")
	private int answerQ4;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "answerQ4Text")
	private Notes answerQ4Text;

	@Column(name = "answerQ5")
	private int answerQ5;
	@Column(name = "answerQ6")
	private int answerQ6;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "answerQ6Text")
	private Notes answerQ6Text;

	@Column(name = "answerQ7")
	private int answerQ7;
	@Column(name = "answerQ8")
	private int answerQ8;
	@Column(name = "answerQ9")
	private int answerQ9;
	@Column(name = "answerQ9A")
	private int answerQ9A;
	@Column(name = "answerQ10")
	private int answerQ10;
	@Column(name = "isEnable")
	private boolean isEnable;

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

	public String getAnswerQ1Text() {
		return answerQ1Text;
	}

	public void setAnswerQ1Text(String answerQ1Text) {
		this.answerQ1Text = answerQ1Text;
	}

	public String getAnswerQ2Text() {
		return answerQ2Text;
	}

	public void setAnswerQ2Text(String answerQ2Text) {
		this.answerQ2Text = answerQ2Text;
	}

	public int getAnswerQ3() {
		return answerQ3;
	}

	public void setAnswerQ3(int answerQ3) {
		this.answerQ3 = answerQ3;
	}

	public Notes getAnswerQ3Text() {
		return answerQ3Text;
	}

	public void setAnswerQ3Text(Notes answerQ3Text) {
		this.answerQ3Text = answerQ3Text;
	}

	public int getAnswerQ4() {
		return answerQ4;
	}

	public void setAnswerQ4(int answerQ4) {
		this.answerQ4 = answerQ4;
	}

	public Notes getAnswerQ4Text() {
		return answerQ4Text;
	}

	public void setAnswerQ4Text(Notes answerQ4Text) {
		this.answerQ4Text = answerQ4Text;
	}

	public int getAnswerQ5() {
		return answerQ5;
	}

	public void setAnswerQ5(int answerQ5) {
		this.answerQ5 = answerQ5;
	}

	public int getAnswerQ6() {
		return answerQ6;
	}

	public void setAnswerQ6(int answerQ6) {
		this.answerQ6 = answerQ6;
	}

	public Notes getAnswerQ6Text() {
		return answerQ6Text;
	}

	public void setAnswerQ6Text(Notes answerQ6Text) {
		this.answerQ6Text = answerQ6Text;
	}

	public int getAnswerQ7() {
		return answerQ7;
	}

	public void setAnswerQ7(int answerQ7) {
		this.answerQ7 = answerQ7;
	}

	public int getAnswerQ8() {
		return answerQ8;
	}

	public void setAnswerQ8(int answerQ8) {
		this.answerQ8 = answerQ8;
	}

	public int getAnswerQ9() {
		return answerQ9;
	}

	public void setAnswerQ9(int answerQ9) {
		this.answerQ9 = answerQ9;
	}

	public int getAnswerQ10() {
		return answerQ10;
	}

	public void setAnswerQ10(int answerQ10) {
		this.answerQ10 = answerQ10;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public int getAnswerQ9A() {
		return answerQ9A;
	}

	public void setAnswerQ9A(int answerQ9A) {
		this.answerQ9A = answerQ9A;
	}

}
