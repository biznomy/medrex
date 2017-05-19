package medrex.commons.vo.mds3.sectionN;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionN")
public class Mds3SectionN implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -183230128946482327L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "N0300")
	private String n0300;

	@Column(name = "N0350A")
	private String n0350A;

	@Column(name = "N0350B")
	private String n0350B;

	@Column(name = "N0400A")
	private boolean N0400A;

	@Column(name = "N0400B")
	private boolean N0400B;

	@Column(name = "N0400C")
	private boolean N0400C;

	@Column(name = "N0400D")
	private boolean N0400D;

	@Column(name = "N0400E")
	private boolean N0400E;

	@Column(name = "N0400F")
	private boolean N0400F;

	@Column(name = "N0400G")
	private boolean N0400G;

	@Column(name = "N0400Z")
	private boolean N0400Z;

	public int getSerial() {
		return serial;
	}

	public String getN0350B() {
		return n0350B;
	}

	public void setN0350B(String n0350b) {
		n0350B = n0350b;
	}

	public boolean isN0400A() {
		return N0400A;
	}

	public boolean isN0400B() {
		return N0400B;
	}

	public boolean isN0400C() {
		return N0400C;
	}

	public boolean isN0400D() {
		return N0400D;
	}

	public boolean isN0400E() {
		return N0400E;
	}

	public boolean isN0400F() {
		return N0400F;
	}

	public boolean isN0400G() {
		return N0400G;
	}

	public boolean isN0400Z() {
		return N0400Z;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getN0300() {
		return n0300;
	}

	public void setN0300(String n0300) {
		this.n0300 = n0300;
	}

	public String getN0350A() {
		return n0350A;
	}

	public void setN0350A(String n0350a) {
		n0350A = n0350a;
	}

	public void setN0400A(boolean n0400a) {
		N0400A = n0400a;
	}

	public void setN0400B(boolean n0400b) {
		N0400B = n0400b;
	}

	public void setN0400C(boolean n0400c) {
		N0400C = n0400c;
	}

	public void setN0400D(boolean n0400d) {
		N0400D = n0400d;
	}

	public void setN0400E(boolean n0400e) {
		N0400E = n0400e;
	}

	public void setN0400F(boolean n0400f) {
		N0400F = n0400f;
	}

	public void setN0400G(boolean n0400g) {
		N0400G = n0400g;
	}

	public void setN0400Z(boolean n0400z) {
		N0400Z = n0400z;
	}

}
