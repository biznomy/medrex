package medrex.commons.vo.mds3.SectionB;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionB")
public class Mds3SectionB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9147698659492681902L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "B0100")
	private String B0100;

	@Column(name = "B0200")
	private String B0200;

	@Column(name = "B0300")
	private String B0300;

	@Column(name = "B0600")
	private String B0600;

	@Column(name = "B0700")
	private String B0700;

	@Column(name = "B0800")
	private String B0800;

	@Column(name = "B1000")
	private String B1000;

	@Column(name = "B1200")
	private String B1200;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getB0100() {
		return B0100;
	}

	public void setB0100(String b0100) {
		B0100 = b0100;
	}

	public String getB0200() {
		return B0200;
	}

	public void setB0200(String b0200) {
		B0200 = b0200;
	}

	public String getB0300() {
		return B0300;
	}

	public void setB0300(String b0300) {
		B0300 = b0300;
	}

	public String getB0600() {
		return B0600;
	}

	public void setB0600(String b0600) {
		B0600 = b0600;
	}

	public String getB0700() {
		return B0700;
	}

	public void setB0700(String b0700) {
		B0700 = b0700;
	}

	public String getB0800() {
		return B0800;
	}

	public void setB0800(String b0800) {
		B0800 = b0800;
	}

	public String getB1000() {
		return B1000;
	}

	public void setB1000(String b1000) {
		B1000 = b1000;
	}

	public String getB1200() {
		return B1200;
	}

	public void setB1200(String b1200) {
		B1200 = b1200;
	}

}
