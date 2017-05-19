package medrex.commons.vo.admission;

import java.io.Serializable;

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
@Table(name = "ResidentAssessmentFormPage20")
public class ResidentAssessmentFormPage20 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1555786895486205002L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "formId")
	private int formId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "comments")
	private Notes comments;

	@Column(name = "initial1")
	private String initial1;

	@Column(name = "initial2")
	private String initial2;

	@Column(name = "signature1")
	private String signature1;

	@Column(name = "signature2")
	private String signature2;

	@Column(name = "na")
	private boolean na;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int residentId) {
		this.formId = residentId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Notes getComments() {
		return comments;
	}

	public void setComments(Notes comments) {
		this.comments = comments;
	}

	public String getInitial1() {
		return initial1;
	}

	public void setInitial1(String initial1) {
		this.initial1 = initial1;
	}

	public String getInitial2() {
		return initial2;
	}

	public void setInitial2(String initial2) {
		this.initial2 = initial2;
	}

	public String getSignature1() {
		return signature1;
	}

	public void setSignature1(String signature1) {
		this.signature1 = signature1;
	}

	public String getSignature2() {
		return signature2;
	}

	public void setSignature2(String signature2) {
		this.signature2 = signature2;
	}

	public boolean isNa() {
		return na;
	}

	public void setNa(boolean na) {
		this.na = na;
	}
}
