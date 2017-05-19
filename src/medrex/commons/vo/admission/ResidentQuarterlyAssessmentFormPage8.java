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
@Table(name = "ResidentQuarterlyAssessmentFormPage8")
public class ResidentQuarterlyAssessmentFormPage8 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8861122505621799960L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "alternate1")
	private String alternate1;
	@Column(name = "alternate2")
	private String alternate2;
	@Column(name = "alternate3")
	private String alternate3;
	@Column(name = "alternate4")
	private String alternate4;
	@Column(name = "alternate5")
	private String alternate5;
	@Column(name = "alternate6")
	private String alternate6;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "comments")
	private Notes comments;
	@Column(name = "nurseSignature")
	private String nurseSignature;
	@Column(name = "date")
	private Date date;

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

	public String getAlternate1() {
		return alternate1;
	}

	public void setAlternate1(String alternate1) {
		this.alternate1 = alternate1;
	}

	public String getAlternate2() {
		return alternate2;
	}

	public void setAlternate2(String alternate2) {
		this.alternate2 = alternate2;
	}

	public String getAlternate3() {
		return alternate3;
	}

	public void setAlternate3(String alternate3) {
		this.alternate3 = alternate3;
	}

	public String getAlternate4() {
		return alternate4;
	}

	public void setAlternate4(String alternate4) {
		this.alternate4 = alternate4;
	}

	public String getAlternate5() {
		return alternate5;
	}

	public void setAlternate5(String alternate5) {
		this.alternate5 = alternate5;
	}

	public Notes getComments() {
		return comments;
	}

	public void setComments(Notes comments) {
		this.comments = comments;
	}

	public String getNurseSignature() {
		return nurseSignature;
	}

	public void setNurseSignature(String nurseSignature) {
		this.nurseSignature = nurseSignature;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAlternate6() {
		return alternate6;
	}

	public void setAlternate6(String alternate6) {
		this.alternate6 = alternate6;
	}

}
