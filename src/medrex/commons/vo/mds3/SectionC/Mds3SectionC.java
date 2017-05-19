package medrex.commons.vo.mds3.SectionC;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionC")
public class Mds3SectionC implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4092714862932247679L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "C0100")
	private String C0100;

	@Column(name = "C0200")
	private String C0200;

	@Column(name = "C0300A")
	private String C0300A;

	@Column(name = "C0300B")
	private String C0300B;

	@Column(name = "C0300C")
	private String C0300C;

	@Column(name = "C0400A")
	private String C0400A;

	@Column(name = "C0400B")
	private String C0400B;

	@Column(name = "C0400C")
	private String C0400C;

	@Column(name = "C0500")
	private String C0500;

	@Column(name = "C0600")
	private String C0600;

	@Column(name = "C0700")
	private String C0700;

	@Column(name = "C0800")
	private String C0800;

	@Column(name = "C0900A")
	private boolean C0900A;

	@Column(name = "C0900B")
	private boolean C0900B;

	@Column(name = "C0900C")
	private boolean C0900C;

	@Column(name = "C0900D")
	private boolean C0900D;

	@Column(name = "C0900Z")
	private boolean C0900Z;

	@Column(name = "C1000")
	private String C1000;

	@Column(name = "C1300A")
	private String C1300A;

	@Column(name = "C1300B")
	private String C1300B;

	@Column(name = "C1300C")
	private String C1300C;

	@Column(name = "C1300D")
	private String C1300D;

	@Column(name = "C1600")
	private String C1600;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getC0200() {
		return C0200;
	}

	public String getC0100() {
		return C0100;
	}

	public void setC0100(String c0100) {
		C0100 = c0100;
	}

	public void setC0200(String c0200) {
		C0200 = c0200;
	}

	public String getC0300A() {
		return C0300A;
	}

	public void setC0300A(String c0300a) {
		C0300A = c0300a;
	}

	public String getC0300B() {
		return C0300B;
	}

	public void setC0300B(String c0300b) {
		C0300B = c0300b;
	}

	public String getC0300C() {
		return C0300C;
	}

	public void setC0300C(String c0300c) {
		C0300C = c0300c;
	}

	public String getC0400A() {
		return C0400A;
	}

	public void setC0400A(String c0400a) {
		C0400A = c0400a;
	}

	public String getC0400B() {
		return C0400B;
	}

	public void setC0400B(String c0400b) {
		C0400B = c0400b;
	}

	public String getC0400C() {
		return C0400C;
	}

	public void setC0400C(String c0400c) {
		C0400C = c0400c;
	}

	public String getC0500() {
		return C0500;
	}

	public void setC0500(String c0500) {
		C0500 = c0500;
	}

	public String getC0600() {
		return C0600;
	}

	public void setC0600(String c0600) {
		C0600 = c0600;
	}

	public String getC0700() {
		return C0700;
	}

	public void setC0700(String c0700) {
		C0700 = c0700;
	}

	public String getC0800() {
		return C0800;
	}

	public void setC0800(String c0800) {
		C0800 = c0800;
	}

	public boolean isC0900A() {
		return C0900A;
	}

	public void setC0900A(boolean c0900a) {
		C0900A = c0900a;
	}

	public boolean isC0900B() {
		return C0900B;
	}

	public void setC0900B(boolean c0900b) {
		C0900B = c0900b;
	}

	public boolean isC0900C() {
		return C0900C;
	}

	public void setC0900C(boolean c0900c) {
		C0900C = c0900c;
	}

	public boolean isC0900D() {
		return C0900D;
	}

	public void setC0900D(boolean c0900d) {
		C0900D = c0900d;
	}

	public boolean isC0900Z() {
		return C0900Z;
	}

	public void setC0900Z(boolean c0900z) {
		C0900Z = c0900z;
	}

	public String getC1000() {
		return C1000;
	}

	public void setC1000(String c1000) {
		C1000 = c1000;
	}

	public String getC1300A() {
		return C1300A;
	}

	public void setC1300A(String c1300a) {
		C1300A = c1300a;
	}

	public String getC1300B() {
		return C1300B;
	}

	public void setC1300B(String c1300b) {
		C1300B = c1300b;
	}

	public String getC1300C() {
		return C1300C;
	}

	public void setC1300C(String c1300c) {
		C1300C = c1300c;
	}

	public String getC1300D() {
		return C1300D;
	}

	public void setC1300D(String c1300d) {
		C1300D = c1300d;
	}

	public String getC1600() {
		return C1600;
	}

	public void setC1600(String c1600) {
		C1600 = c1600;
	}
}
