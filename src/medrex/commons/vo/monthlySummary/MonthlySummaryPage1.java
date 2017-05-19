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
@Table(name = "MonthlySummaryPage1")
public class MonthlySummaryPage1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4245347741380096533L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;

	@Column(name = "residentId")
	int residentId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "formId")
	MonthlySummaryRecord formId;

	@Column(name = "comment12")
	String comment12;

	@Column(name = "comment11")
	String comment11;

	@Column(name = "comment10")
	String comment10;

	@Column(name = "comment9")
	String comment9;

	@Column(name = "comment8")
	String comment8;

	@Column(name = "comment7")
	String comment7;

	@Column(name = "comment6")
	String comment6;

	@Column(name = "comment5")
	String comment5;

	@Column(name = "comment4")
	String comment4;

	@Column(name = "comment3")
	String comment3;

	@Column(name = "comment2")
	String comment2;

	@Column(name = "comment1")
	String comment1;

	@Column(name = "monthYear")
	Date monthYear;

	@Column(name = "roomNo")
	String roomNo;

	@Column(name = "residentName")
	String residentName;

	public MonthlySummaryRecord getFormId() {
		return formId;
	}

	public void setFormId(MonthlySummaryRecord formId) {
		this.formId = formId;
	}

	public Date getMonthYear() {
		return this.monthYear;
	}

	public void setMonthYear(Date monthYear) {
		this.monthYear = monthYear;
	}

	public String getRoomNo() {
		return this.roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getResidentName() {
		return this.residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getComment12() {
		return comment12;
	}

	public void setComment12(String comment12) {
		this.comment12 = comment12;
	}

	public String getComment11() {
		return comment11;
	}

	public void setComment11(String comment11) {
		this.comment11 = comment11;
	}

	public String getComment10() {
		return comment10;
	}

	public void setComment10(String comment10) {
		this.comment10 = comment10;
	}

	public String getComment9() {
		return comment9;
	}

	public void setComment9(String comment9) {
		this.comment9 = comment9;
	}

	public String getComment8() {
		return comment8;
	}

	public void setComment8(String comment8) {
		this.comment8 = comment8;
	}

	public String getComment7() {
		return comment7;
	}

	public void setComment7(String comment7) {
		this.comment7 = comment7;
	}

	public String getComment6() {
		return comment6;
	}

	public void setComment6(String comment6) {
		this.comment6 = comment6;
	}

	public String getComment5() {
		return comment5;
	}

	public void setComment5(String comment5) {
		this.comment5 = comment5;
	}

	public String getComment4() {
		return comment4;
	}

	public void setComment4(String comment4) {
		this.comment4 = comment4;
	}

	public String getComment3() {
		return comment3;
	}

	public void setComment3(String comment3) {
		this.comment3 = comment3;
	}

	public String getComment2() {
		return comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

}
