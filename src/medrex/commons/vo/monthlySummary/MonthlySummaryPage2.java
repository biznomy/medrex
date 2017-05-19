package medrex.commons.vo.monthlySummary;

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

@Entity
@Table(name = "MonthlySummaryPage2")
public class MonthlySummaryPage2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -813249873580572702L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;

	@Column(name = "residentId")
	int residentId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "formId")
	MonthlySummaryRecord formId;

	@Column(name = "nurseSignature")
	String nurseSignature;

	@Column(name = "dateCompleted")
	Date dateCompleted;

	@Column(name = "comment17")
	String comment17;

	@Column(name = "comment16")
	String comment16;

	@Column(name = "comment15C")
	String comment15C;

	@Column(name = "comment15B")
	String comment15B;

	@Column(name = "comment14")
	String comment14;

	@Column(name = "comment15A")
	String comment15A;

	@Column(name = "monthYear")
	Date monthYear;

	@Column(name = "roomNo")
	String roomNo;

	@Column(name = "residentName")
	String residentName;

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

	public MonthlySummaryRecord getFormId() {
		return formId;
	}

	public void setFormId(MonthlySummaryRecord formId) {
		this.formId = formId;
	}

	public String getNurseSignature() {
		return nurseSignature;
	}

	public void setNurseSignature(String nurseSignature) {
		this.nurseSignature = nurseSignature;
	}

	public Date getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public String getComment17() {
		return comment17;
	}

	public void setComment17(String comment17) {
		this.comment17 = comment17;
	}

	public String getComment16() {
		return comment16;
	}

	public void setComment16(String comment16) {
		this.comment16 = comment16;
	}

	public String getComment15C() {
		return comment15C;
	}

	public void setComment15C(String comment15C) {
		this.comment15C = comment15C;
	}

	public String getComment15B() {
		return comment15B;
	}

	public void setComment15B(String comment15B) {
		this.comment15B = comment15B;
	}

	public String getComment14() {
		return comment14;
	}

	public void setComment14(String comment14) {
		this.comment14 = comment14;
	}

	public String getComment15A() {
		return comment15A;
	}

	public void setComment15A(String comment15A) {
		this.comment15A = comment15A;
	}

	public Date getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(Date monthYear) {
		this.monthYear = monthYear;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

}
