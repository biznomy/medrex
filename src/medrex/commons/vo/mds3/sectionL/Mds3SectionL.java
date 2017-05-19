package medrex.commons.vo.mds3.sectionL;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionL")
public class Mds3SectionL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8189157808828234878L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "L0200A")
	private boolean l0200A;

	@Column(name = "L0200B")
	private boolean l0200B;

	@Column(name = "L0200C")
	private boolean l0200C;

	@Column(name = "L0200D")
	private boolean l0200D;

	@Column(name = "L0200E")
	private boolean l0200E;

	@Column(name = "L0200F")
	private boolean l0200F;

	@Column(name = "L0200G")
	private boolean l0200G;

	@Column(name = "L0200Z")
	private boolean l0200Z;

	public int getSerial() {
		return serial;
	}

	public boolean isL0200A() {
		return l0200A;
	}

	public boolean isL0200B() {
		return l0200B;
	}

	public boolean isL0200C() {
		return l0200C;
	}

	public boolean isL0200D() {
		return l0200D;
	}

	public boolean isL0200E() {
		return l0200E;
	}

	public boolean isL0200F() {
		return l0200F;
	}

	public boolean isL0200G() {
		return l0200G;
	}

	public boolean isL0200Z() {
		return l0200Z;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setL0200A(boolean l0200a) {
		l0200A = l0200a;
	}

	public void setL0200B(boolean l0200b) {
		l0200B = l0200b;
	}

	public void setL0200C(boolean l0200c) {
		l0200C = l0200c;
	}

	public void setL0200D(boolean l0200d) {
		l0200D = l0200d;
	}

	public void setL0200E(boolean l0200e) {
		l0200E = l0200e;
	}

	public void setL0200F(boolean l0200f) {
		l0200F = l0200f;
	}

	public void setL0200G(boolean l0200g) {
		l0200G = l0200g;
	}

	public void setL0200Z(boolean l0200z) {
		l0200Z = l0200z;
	}

}
