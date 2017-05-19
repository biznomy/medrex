package medrex.commons.vo.mds3.sectionZ;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionZ")
public class Mds3SectionZ implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6830925450550077956L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "Z0100A")
	private String z0100A;

	@Column(name = "Z0100B")
	private String z0100B;

	@Column(name = "Z0100C")
	private String z0100C;

	@Column(name = "Z0150A")
	private String z0150A;

	@Column(name = "Z0150B")
	private String z0150B;

	@Column(name = "Z0200A")
	private String z0200A;

	@Column(name = "Z0200B")
	private String z0200B;

	@Column(name = "Z0250A")
	private String z0250A;

	@Column(name = "Z0250B")
	private String z0250B;

	@Column(name = "Z0300A")
	private String z0300A;

	@Column(name = "Z0300B")
	private String z0300B;

	@Column(name = "Z0400A")
	private Date z0400A;

	public int getSerial() {
		return serial;
	}

	public String getZ0100A() {
		return z0100A;
	}

	public String getZ0100B() {
		return z0100B;
	}

	public String getZ0100C() {
		return z0100C;
	}

	public String getZ0150A() {
		return z0150A;
	}

	public String getZ0150B() {
		return z0150B;
	}

	public String getZ0200A() {
		return z0200A;
	}

	public String getZ0200B() {
		return z0200B;
	}

	public String getZ0250A() {
		return z0250A;
	}

	public String getZ0250B() {
		return z0250B;
	}

	public String getZ0300A() {
		return z0300A;
	}

	public String getZ0300B() {
		return z0300B;
	}

	public Date getZ0400A() {
		return z0400A;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setZ0100A(String z0100a) {
		z0100A = z0100a;
	}

	public void setZ0100B(String z0100b) {
		z0100B = z0100b;
	}

	public void setZ0100C(String z0100c) {
		z0100C = z0100c;
	}

	public void setZ0150A(String z0150a) {
		z0150A = z0150a;
	}

	public void setZ0150B(String z0150b) {
		z0150B = z0150b;
	}

	public void setZ0200A(String z0200a) {
		z0200A = z0200a;
	}

	public void setZ0200B(String z0200b) {
		z0200B = z0200b;
	}

	public void setZ0250A(String z0250a) {
		z0250A = z0250a;
	}

	public void setZ0250B(String z0250b) {
		z0250B = z0250b;
	}

	public void setZ0300A(String z0300a) {
		z0300A = z0300a;
	}

	public void setZ0300B(String z0300b) {
		z0300B = z0300b;
	}

	public void setZ0400A(Date z0400a) {
		z0400A = z0400a;
	}

}
