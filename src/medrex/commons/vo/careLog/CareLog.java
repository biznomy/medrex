package medrex.commons.vo.careLog;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CareLog")
public class CareLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8991102606651539339L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "doneDate")
	private Date doneDate;
	@Column(name = "doneBy")
	private int doneBy;
	@Column(name = "val1")
	private int val1;
	@Column(name = "val2")
	private int val2;
	@Column(name = "val3")
	private int val3;
	@Column(name = "val4")
	private int val4;
	@Column(name = "val5")
	private int val5;
	@Column(name = "val6")
	private int val6;
	@Column(name = "val7")
	private int val7;
	@Column(name = "val8")
	private int val8;
	@Column(name = "val9")
	private int val9;
	@Column(name = "val10")
	private int val10;
	@Column(name = "val11")
	private int val11;
	@Column(name = "val12")
	private int val12;
	@Column(name = "val13")
	private int val13;
	@Column(name = "val14")
	private int val14;
	@Column(name = "val15")
	private int val15;
	@Column(name = "val16")
	private int val16;
	@Column(name = "val17")
	private int val17;
	@Column(name = "val18")
	private int val18;
	@Column(name = "val19")
	private int val19;
	@Column(name = "val20")
	private int val20;

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

	public Date getDoneDate() {
		return doneDate;
	}

	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}

	public int getDoneBy() {
		return doneBy;
	}

	public void setDoneBy(int doneBy) {
		this.doneBy = doneBy;
	}

	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}

	public int getVal3() {
		return val3;
	}

	public void setVal3(int val3) {
		this.val3 = val3;
	}

	public int getVal4() {
		return val4;
	}

	public void setVal4(int val4) {
		this.val4 = val4;
	}

	public int getVal5() {
		return val5;
	}

	public void setVal5(int val5) {
		this.val5 = val5;
	}

	public int getVal6() {
		return val6;
	}

	public void setVal6(int val6) {
		this.val6 = val6;
	}

	public int getVal7() {
		return val7;
	}

	public void setVal7(int val7) {
		this.val7 = val7;
	}

	public int getVal8() {
		return val8;
	}

	public void setVal8(int val8) {
		this.val8 = val8;
	}

	public int getVal9() {
		return val9;
	}

	public void setVal9(int val9) {
		this.val9 = val9;
	}

	public int getVal10() {
		return val10;
	}

	public void setVal10(int val10) {
		this.val10 = val10;
	}

	public int getVal11() {
		return val11;
	}

	public void setVal11(int val11) {
		this.val11 = val11;
	}

	public int getVal12() {
		return val12;
	}

	public void setVal12(int val12) {
		this.val12 = val12;
	}

	public int getVal13() {
		return val13;
	}

	public void setVal13(int val13) {
		this.val13 = val13;
	}

	public int getVal14() {
		return val14;
	}

	public void setVal14(int val14) {
		this.val14 = val14;
	}

	public int getVal15() {
		return val15;
	}

	public void setVal15(int val15) {
		this.val15 = val15;
	}

	public int getVal16() {
		return val16;
	}

	public void setVal16(int val16) {
		this.val16 = val16;
	}

	public int getVal17() {
		return val17;
	}

	public void setVal17(int val17) {
		this.val17 = val17;
	}

	public int getVal18() {
		return val18;
	}

	public void setVal18(int val18) {
		this.val18 = val18;
	}

	public int getVal19() {
		return val19;
	}

	public void setVal19(int val19) {
		this.val19 = val19;
	}

	public int getVal20() {
		return val20;
	}

	public void setVal20(int val20) {
		this.val20 = val20;
	}

}
