package medrex.commons.vo.mds3.sectionK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionK")
public class Mds3SectionK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1786237741299936662L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "K0100A")
	private boolean k0100A;

	@Column(name = "K0100B")
	private boolean k0100B;

	@Column(name = "K0100C")
	private boolean k0100C;

	@Column(name = "K0100D")
	private boolean k0100D;

	@Column(name = "K0100Z")
	private boolean k0100Z;

	@Column(name = "K0200A")
	private double k0200A;

	@Column(name = "K0200B")
	private double k0200B;

	@Column(name = "K03003")
	private String k0300;

	@Column(name = "K0500A")
	private boolean k0500A;

	@Column(name = "K0500B")
	private boolean k0500B;

	@Column(name = "K0500C")
	private boolean k0500C;

	@Column(name = "K0500D")
	private boolean k0500D;

	@Column(name = "K0500Z")
	private boolean k0500Z;

	@Column(name = "K0700A")
	private String K0700A;

	@Column(name = "K0700B")
	private String K0700B;

	public int getSerial() {
		return serial;
	}

	public boolean isK0100A() {
		return k0100A;
	}

	public boolean isK0100B() {
		return k0100B;
	}

	public boolean isK0100C() {
		return k0100C;
	}

	public boolean isK0100D() {
		return k0100D;
	}

	public boolean isK0100Z() {
		return k0100Z;
	}

	public double getK0200A() {
		return k0200A;
	}

	public double getK0200B() {
		return k0200B;
	}

	public String getK0300() {
		return k0300;
	}

	public String getK0700A() {
		return K0700A;
	}

	public String getK0700B() {
		return K0700B;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setK0100A(boolean k0100a) {
		k0100A = k0100a;
	}

	public void setK0100B(boolean k0100b) {
		k0100B = k0100b;
	}

	public void setK0100C(boolean k0100c) {
		k0100C = k0100c;
	}

	public void setK0100D(boolean k0100d) {
		k0100D = k0100d;
	}

	public void setK0100Z(boolean k0100z) {
		k0100Z = k0100z;
	}

	public void setK0200A(double k0200a) {
		k0200A = k0200a;
	}

	public void setK0200B(double k0200b) {
		k0200B = k0200b;
	}

	public void setK0300(String k0300) {
		this.k0300 = k0300;
	}

	public void setK0700A(String k0700a) {
		K0700A = k0700a;
	}

	public void setK0700B(String k0700b) {
		K0700B = k0700b;
	}

	public boolean isK0500A() {
		return k0500A;
	}

	public void setK0500A(boolean k0500a) {
		k0500A = k0500a;
	}

	public boolean isK0500B() {
		return k0500B;
	}

	public void setK0500B(boolean k0500b) {
		k0500B = k0500b;
	}

	public boolean isK0500C() {
		return k0500C;
	}

	public void setK0500C(boolean k0500c) {
		k0500C = k0500c;
	}

	public boolean isK0500D() {
		return k0500D;
	}

	public void setK0500D(boolean k0500d) {
		k0500D = k0500d;
	}

	public boolean isK0500Z() {
		return k0500Z;
	}

	public void setK0500Z(boolean k0500z) {
		k0500Z = k0500z;
	}

}
