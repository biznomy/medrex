package medrex.commons.vo.mds3.sectionP;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionP")
public class Mds3SectionP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 158234635395385815L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "P0100A")
	private String p0100A;

	@Column(name = "P0100B")
	private String p0100B;

	@Column(name = "P0100C")
	private String p0100C;

	@Column(name = "P0100D")
	private String p0100D;

	@Column(name = "P0100E")
	private String p0100E;

	@Column(name = "P0100F")
	private String p0100F;

	@Column(name = "P0100G")
	private String p0100G;

	@Column(name = "P0100H")
	private String p0100H;

	public int getSerial() {
		return serial;
	}

	public String getP0100A() {
		return p0100A;
	}

	public String getP0100B() {
		return p0100B;
	}

	public String getP0100C() {
		return p0100C;
	}

	public String getP0100D() {
		return p0100D;
	}

	public String getP0100E() {
		return p0100E;
	}

	public String getP0100F() {
		return p0100F;
	}

	public String getP0100G() {
		return p0100G;
	}

	public String getP0100H() {
		return p0100H;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setP0100A(String p0100a) {
		p0100A = p0100a;
	}

	public void setP0100B(String p0100b) {
		p0100B = p0100b;
	}

	public void setP0100C(String p0100c) {
		p0100C = p0100c;
	}

	public void setP0100D(String p0100d) {
		p0100D = p0100d;
	}

	public void setP0100E(String p0100e) {
		p0100E = p0100e;
	}

	public void setP0100F(String p0100f) {
		p0100F = p0100f;
	}

	public void setP0100G(String p0100g) {
		p0100G = p0100g;
	}

	public void setP0100H(String p0100h) {
		p0100H = p0100h;
	}

}