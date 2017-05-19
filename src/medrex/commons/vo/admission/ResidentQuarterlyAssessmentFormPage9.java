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
@Table(name = "ResidentQuarterlyAssessmentFormPage9")
public class ResidentQuarterlyAssessmentFormPage9 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7410636300721506298L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "firstQuarter")
	private Notes firstQuarter;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "secondQuarter")
	private Notes secondQuarter;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "thirdQuarter")
	private Notes thirdQuarter;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fourthQuarter")
	private Notes fourthQuarter;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormId() {
		return formId;
	}

	public Notes getFirstQuarter() {
		return firstQuarter;
	}

	public void setFirstQuarter(Notes firstQuarter) {
		this.firstQuarter = firstQuarter;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public Notes getSecondQuarter() {
		return secondQuarter;
	}

	public void setSecondQuarter(Notes secondQuarter) {
		this.secondQuarter = secondQuarter;
	}

	public Notes getThirdQuarter() {
		return thirdQuarter;
	}

	public void setThirdQuarter(Notes thirdQuarter) {
		this.thirdQuarter = thirdQuarter;
	}

	public Notes getFourthQuarter() {
		return fourthQuarter;
	}

	public void setFourthQuarter(Notes fourthQuarter) {
		this.fourthQuarter = fourthQuarter;
	}

}
