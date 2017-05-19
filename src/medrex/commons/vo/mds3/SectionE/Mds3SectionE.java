package medrex.commons.vo.mds3.SectionE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionE")
public class Mds3SectionE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1709134935609230020L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "e0100A")
	boolean e0100A;
	@Column(name = "e0100B")
	boolean e0100B;
	@Column(name = "e0100C")
	boolean e0100C;
	@Column(name = "e0200C")
	String e0200C;
	@Column(name = "e0200B")
	String e0200B;
	@Column(name = "e0200A")
	String e0200A;
	@Column(name = "e0300")
	String e0300;
	@Column(name = "e0500C")
	String e0500C;
	@Column(name = "e0500B")
	String e0500B;
	@Column(name = "e0500A")
	String e0500A;
	@Column(name = "e0600C")
	String e0600C;
	@Column(name = "e0600B")
	String e0600B;
	@Column(name = "e0600A")
	String e0600A;
	@Column(name = "e0800")
	String e0800;
	@Column(name = "e0900")
	String e0900;
	@Column(name = "e1000B")
	String e1000B;
	@Column(name = "e1000A")
	String e1000A;
	@Column(name = "e1100")
	String e1100;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public boolean isE0100A() {
		return e0100A;
	}

	public void setE0100A(boolean e0100a) {
		e0100A = e0100a;
	}

	public boolean isE0100B() {
		return e0100B;
	}

	public void setE0100B(boolean e0100b) {
		e0100B = e0100b;
	}

	public boolean isE0100C() {
		return e0100C;
	}

	public void setE0100C(boolean e0100c) {
		e0100C = e0100c;
	}

	public String getE0200C() {
		return e0200C;
	}

	public void setE0200C(String e0200c) {
		e0200C = e0200c;
	}

	public String getE0200B() {
		return e0200B;
	}

	public void setE0200B(String e0200b) {
		e0200B = e0200b;
	}

	public String getE0200A() {
		return e0200A;
	}

	public void setE0200A(String e0200a) {
		e0200A = e0200a;
	}

	public String getE0300() {
		return e0300;
	}

	public void setE0300(String e0300) {
		this.e0300 = e0300;
	}

	public String getE0500C() {
		return e0500C;
	}

	public void setE0500C(String e0500c) {
		e0500C = e0500c;
	}

	public String getE0500B() {
		return e0500B;
	}

	public void setE0500B(String e0500b) {
		e0500B = e0500b;
	}

	public String getE0500A() {
		return e0500A;
	}

	public void setE0500A(String e0500a) {
		e0500A = e0500a;
	}

	public String getE0600C() {
		return e0600C;
	}

	public void setE0600C(String e0600c) {
		e0600C = e0600c;
	}

	public String getE0600B() {
		return e0600B;
	}

	public void setE0600B(String e0600b) {
		e0600B = e0600b;
	}

	public String getE0600A() {
		return e0600A;
	}

	public void setE0600A(String e0600a) {
		e0600A = e0600a;
	}

	public String getE0800() {
		return e0800;
	}

	public void setE0800(String e0800) {
		this.e0800 = e0800;
	}

	public String getE0900() {
		return e0900;
	}

	public void setE0900(String e0900) {
		this.e0900 = e0900;
	}

	public String getE1000B() {
		return e1000B;
	}

	public void setE1000B(String e1000b) {
		e1000B = e1000b;
	}

	public String getE1000A() {
		return e1000A;
	}

	public void setE1000A(String e1000a) {
		e1000A = e1000a;
	}

	public String getE1100() {
		return e1100;
	}

	public void setE1100(String e1100) {
		this.e1100 = e1100;
	}
}
