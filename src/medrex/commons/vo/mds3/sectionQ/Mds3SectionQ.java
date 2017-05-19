package medrex.commons.vo.mds3.sectionQ;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionQ")
public class Mds3SectionQ implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7854476148891653641L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "Q0100A")
	private String q0100A;

	@Column(name = "Q0100B")
	private String q0100B;

	@Column(name = "Q0100C")
	private String q0100C;

	@Column(name = "Q0300A")
	private String q0300A;

	@Column(name = "Q0300B")
	private String q0300B;

	@Column(name = "Q0400A")
	private String q0400A;

	@Column(name = "Q0400B")
	private String q0400B;

	@Column(name = "Q0500A")
	private String q0500A;

	@Column(name = "Q0500B")
	private String q0500B;

	@Column(name = "Q0600")
	private String q0600;

	public int getSerial() {
		return serial;
	}

	public String getQ0100A() {
		return q0100A;
	}

	public String getQ0100B() {
		return q0100B;
	}

	public String getQ0100C() {
		return q0100C;
	}

	public String getQ0300A() {
		return q0300A;
	}

	public String getQ0300B() {
		return q0300B;
	}

	public String getQ0400A() {
		return q0400A;
	}

	public String getQ0400B() {
		return q0400B;
	}

	public String getQ0500A() {
		return q0500A;
	}

	public String getQ0500B() {
		return q0500B;
	}

	public String getQ0600() {
		return q0600;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setQ0100A(String q0100a) {
		q0100A = q0100a;
	}

	public void setQ0100B(String q0100b) {
		q0100B = q0100b;
	}

	public void setQ0100C(String q0100c) {
		q0100C = q0100c;
	}

	public void setQ0300A(String q0300a) {
		q0300A = q0300a;
	}

	public void setQ0300B(String q0300b) {
		q0300B = q0300b;
	}

	public void setQ0400A(String q0400a) {
		q0400A = q0400a;
	}

	public void setQ0400B(String q0400b) {
		q0400B = q0400b;
	}

	public void setQ0500A(String q0500a) {
		q0500A = q0500a;
	}

	public void setQ0500B(String q0500b) {
		q0500B = q0500b;
	}

	public void setQ0600(String q0600) {
		this.q0600 = q0600;
	}

}