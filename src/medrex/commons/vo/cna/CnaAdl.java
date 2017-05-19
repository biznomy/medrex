package medrex.commons.vo.cna;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CnaAdl")
public class CnaAdl implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7361527297330711239L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "adl")
	private int adl;
	@Column(name = "doneDate")
	private Date doneDate;
	@Column(name = "doneBy")
	private int doneBy;
	@Column(name = "val1A")
	private int val1A;
	@Column(name = "val1B")
	private int val1B;
	@Column(name = "val2A")
	private int val2A;
	@Column(name = "val2B")
	private int val2B;
	@Column(name = "val3A")
	private int val3A;
	@Column(name = "val3B")
	private int val3B;
	@Column(name = "val4A")
	private int val4A;
	@Column(name = "val4B")
	private int val4B;
	@Column(name = "val5A")
	private int val5A;
	@Column(name = "val5B")
	private int val5B;
	@Column(name = "val6A")
	private int val6A;
	@Column(name = "val6B")
	private int val6B;
	@Column(name = "val7A")
	private int val7A;
	@Column(name = "val7B")
	private int val7B;
	@Column(name = "val8A")
	private int val8A;
	@Column(name = "val8B")
	private int val8B;
	@Column(name = "val9A")
	private int val9A;
	@Column(name = "val9B")
	private int val9B;
	@Column(name = "val10A")
	private int val10A;
	@Column(name = "val10B")
	private int val10B;

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

	public int getAdl() {
		return adl;
	}

	public void setAdl(int adl) {
		this.adl = adl;
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

	public int getVal1A() {
		return val1A;
	}

	public void setVal1A(int val1A) {
		this.val1A = val1A;
	}

	public int getVal1B() {
		return val1B;
	}

	public void setVal1B(int val1B) {
		this.val1B = val1B;
	}

	public int getVal2A() {
		return val2A;
	}

	public void setVal2A(int val2A) {
		this.val2A = val2A;
	}

	public int getVal2B() {
		return val2B;
	}

	public void setVal2B(int val2B) {
		this.val2B = val2B;
	}

	public int getVal3A() {
		return val3A;
	}

	public void setVal3A(int val3A) {
		this.val3A = val3A;
	}

	public int getVal3B() {
		return val3B;
	}

	public void setVal3B(int val3B) {
		this.val3B = val3B;
	}

	public int getVal4A() {
		return val4A;
	}

	public void setVal4A(int val4A) {
		this.val4A = val4A;
	}

	public int getVal4B() {
		return val4B;
	}

	public void setVal4B(int val4B) {
		this.val4B = val4B;
	}

	public int getVal5A() {
		return val5A;
	}

	public void setVal5A(int val5A) {
		this.val5A = val5A;
	}

	public int getVal5B() {
		return val5B;
	}

	public void setVal5B(int val5B) {
		this.val5B = val5B;
	}

	public int getVal6A() {
		return val6A;
	}

	public void setVal6A(int val6A) {
		this.val6A = val6A;
	}

	public int getVal6B() {
		return val6B;
	}

	public void setVal6B(int val6B) {
		this.val6B = val6B;
	}

	public int getVal7A() {
		return val7A;
	}

	public void setVal7A(int val7A) {
		this.val7A = val7A;
	}

	public int getVal7B() {
		return val7B;
	}

	public void setVal7B(int val7B) {
		this.val7B = val7B;
	}

	public int getVal8A() {
		return val8A;
	}

	public void setVal8A(int val8A) {
		this.val8A = val8A;
	}

	public int getVal8B() {
		return val8B;
	}

	public void setVal8B(int val8B) {
		this.val8B = val8B;
	}

	public int getVal9A() {
		return val9A;
	}

	public void setVal9A(int val9A) {
		this.val9A = val9A;
	}

	public int getVal9B() {
		return val9B;
	}

	public void setVal9B(int val9B) {
		this.val9B = val9B;
	}

	public int getVal10A() {
		return val10A;
	}

	public void setVal10A(int val10A) {
		this.val10A = val10A;
	}

	public int getVal10B() {
		return val10B;
	}

	public void setVal10B(int val10B) {
		this.val10B = val10B;
	}

}
