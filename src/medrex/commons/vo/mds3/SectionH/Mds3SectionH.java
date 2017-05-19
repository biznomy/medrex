package medrex.commons.vo.mds3.SectionH;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionH")
public class Mds3SectionH implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 859386995762509349L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "h0100Z")
	private boolean h0100Z;
	@Column(name = "h0100D")
	private boolean h0100D;
	@Column(name = "h0100C")
	private boolean h0100C;
	@Column(name = "h0100B")
	private boolean h0100B;
	@Column(name = "h0100A")
	private boolean h0100A;

	@Column(name = "h0200A")
	private String h0200A;
	@Column(name = "h0200B")
	private String h0200B;
	@Column(name = "h0200C")
	private String h0200C;

	@Column(name = "h0300")
	private String h0300;

	@Column(name = "h0400")
	private String h0400;

	@Column(name = "h0500")
	private String h0500;

	@Column(name = "h0600")
	private String h0600;

	public String getH0300() {
		return h0300;
	}

	public void setH0300(String h0300) {
		this.h0300 = h0300;
	}

	public String getH0400() {
		return h0400;
	}

	public void setH0400(String h0400) {
		this.h0400 = h0400;
	}

	public String getH0500() {
		return h0500;
	}

	public void setH0500(String h0500) {
		this.h0500 = h0500;
	}

	public String getH0600() {
		return h0600;
	}

	public void setH0600(String h0600) {
		this.h0600 = h0600;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public boolean isH0100Z() {
		return h0100Z;
	}

	public void setH0100Z(boolean h0100z) {
		h0100Z = h0100z;
	}

	public boolean isH0100D() {
		return h0100D;
	}

	public void setH0100D(boolean h0100d) {
		h0100D = h0100d;
	}

	public boolean isH0100C() {
		return h0100C;
	}

	public void setH0100C(boolean h0100c) {
		h0100C = h0100c;
	}

	public boolean isH0100B() {
		return h0100B;
	}

	public void setH0100B(boolean h0100b) {
		h0100B = h0100b;
	}

	public boolean isH0100A() {
		return h0100A;
	}

	public void setH0100A(boolean h0100a) {
		h0100A = h0100a;
	}

	public String getH0200A() {
		return h0200A;
	}

	public void setH0200A(String h0200a) {
		h0200A = h0200a;
	}

	public String getH0200B() {
		return h0200B;
	}

	public void setH0200B(String h0200b) {
		h0200B = h0200b;
	}

	public String getH0200C() {
		return h0200C;
	}

	public void setH0200C(String h0200c) {
		h0200C = h0200c;
	}

}
