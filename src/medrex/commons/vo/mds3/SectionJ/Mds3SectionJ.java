package medrex.commons.vo.mds3.SectionJ;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionJ")
public class Mds3SectionJ implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7400549133172686158L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "J0100A")
	private String j0100A;

	@Column(name = "J0100B")
	private String j0100B;

	@Column(name = "J0100C")
	private String j0100C;

	@Column(name = "J0200")
	private String j0200;

	@Column(name = "J0300")
	private String j0300;

	@Column(name = "J0400")
	private String j0400;

	@Column(name = "J0500A")
	private String j0500A;

	@Column(name = "J0500B")
	private String j0500B;

	@Column(name = "J0600A")
	private String j0600A;

	@Column(name = "J0600B")
	private String j0600B;

	@Column(name = "J0700")
	private String j0700;

	@Column(name = "J0800A")
	private boolean j0800A;

	@Column(name = "J0800B")
	private boolean j0800B;

	@Column(name = "J0800C")
	private boolean j0800C;

	@Column(name = "J0800D")
	private boolean j0800D;

	@Column(name = "J0800Z")
	private boolean j0800Z;

	@Column(name = "J0850")
	private String j0850;

	@Column(name = "J1100A")
	private boolean j1100A;

	@Column(name = "J1100B")
	private boolean j1100B;

	@Column(name = "J1100C")
	private boolean j1100C;

	@Column(name = "J1100Z")
	private boolean j1100Z;

	public boolean isJ1100Z() {
		return j1100Z;
	}

	public void setJ1100Z(boolean j1100z) {
		j1100Z = j1100z;
	}

	@Column(name = "J1700A")
	private String j1700A;

	@Column(name = "J1300")
	private String j1300;

	@Column(name = "J1400")
	private String j1400;

	@Column(name = "J1550A")
	private boolean j1550A;

	@Column(name = "J1550B")
	private boolean j1550B;

	@Column(name = "J1550C")
	private boolean j1550C;

	@Column(name = "J1550D")
	private boolean j1550D;

	@Column(name = "J1550Z")
	private boolean j1550Z;

	@Column(name = "J1700B")
	private String j1700B;

	@Column(name = "J1700C")
	private String j1700C;

	@Column(name = "J1800")
	private String j1800;

	@Column(name = "J1900A")
	private String j1900A;

	@Column(name = "J1900B")
	private String j1900B;

	@Column(name = "J1900C")
	private String j1900C;

	public int getSerial() {
		return serial;
	}

	public String getJ0100A() {
		return j0100A;
	}

	public String getJ0100B() {
		return j0100B;
	}

	public String getJ0100C() {
		return j0100C;
	}

	public String getJ0200() {
		return j0200;
	}

	public String getJ0300() {
		return j0300;
	}

	public String getJ0400() {
		return j0400;
	}

	public String getJ0500A() {
		return j0500A;
	}

	public String getJ0500B() {
		return j0500B;
	}

	public String getJ0600A() {
		return j0600A;
	}

	public String getJ0600B() {
		return j0600B;
	}

	public String getJ0700() {
		return j0700;
	}

	public boolean isJ0800A() {
		return j0800A;
	}

	public boolean isJ0800B() {
		return j0800B;
	}

	public boolean isJ0800C() {
		return j0800C;
	}

	public boolean isJ0800D() {
		return j0800D;
	}

	public boolean isJ0800Z() {
		return j0800Z;
	}

	public boolean isJ1100A() {
		return j1100A;
	}

	public boolean isJ1100B() {
		return j1100B;
	}

	public boolean isJ1100C() {
		return j1100C;
	}

	public String getJ1300() {
		return j1300;
	}

	public String getJ1400() {
		return j1400;
	}

	public boolean isJ1550A() {
		return j1550A;
	}

	public boolean isJ1550B() {
		return j1550B;
	}

	public boolean isJ1550C() {
		return j1550C;
	}

	public boolean isJ1550D() {
		return j1550D;
	}

	public boolean isJ1550Z() {
		return j1550Z;
	}

	public void setJ0100A(String j0100a) {
		j0100A = j0100a;
	}

	public void setJ0100B(String j0100b) {
		j0100B = j0100b;
	}

	public void setJ0100C(String j0100c) {
		j0100C = j0100c;
	}

	public void setJ0200(String j0200) {
		this.j0200 = j0200;
	}

	public void setJ0300(String j0300) {
		this.j0300 = j0300;
	}

	public void setJ0400(String j0400) {
		this.j0400 = j0400;
	}

	public void setJ0500A(String j0500a) {
		j0500A = j0500a;
	}

	public void setJ0500B(String j0500b) {
		j0500B = j0500b;
	}

	public void setJ0600A(String j0600a) {
		j0600A = j0600a;
	}

	public void setJ0600B(String j0600b) {
		j0600B = j0600b;
	}

	public void setJ0700(String j0700) {
		this.j0700 = j0700;
	}

	public void setJ0800A(boolean j0800a) {
		j0800A = j0800a;
	}

	public void setJ0800B(boolean j0800b) {
		j0800B = j0800b;
	}

	public void setJ0800C(boolean j0800c) {
		j0800C = j0800c;
	}

	public void setJ0800D(boolean j0800d) {
		j0800D = j0800d;
	}

	public void setJ0800Z(boolean j0800z) {
		j0800Z = j0800z;
	}

	public String getJ0850() {
		return j0850;
	}

	public void setJ0850(String j0850) {
		this.j0850 = j0850;
	}

	public void setJ1100A(boolean j1100a) {
		j1100A = j1100a;
	}

	public void setJ1100B(boolean j1100b) {
		j1100B = j1100b;
	}

	public void setJ1100C(boolean j1100c) {
		j1100C = j1100c;
	}

	public void setJ1300(String j1300) {
		this.j1300 = j1300;
	}

	public void setJ1400(String j1400) {
		this.j1400 = j1400;
	}

	public void setJ1550A(boolean j1550a) {
		j1550A = j1550a;
	}

	public void setJ1550B(boolean j1550b) {
		j1550B = j1550b;
	}

	public void setJ1550C(boolean j1550c) {
		j1550C = j1550c;
	}

	public void setJ1550D(boolean j1550d) {
		j1550D = j1550d;
	}

	public void setJ1550Z(boolean j1550z) {
		j1550Z = j1550z;
	}

	public String getJ1700A() {
		return j1700A;
	}

	public String getJ1700B() {
		return j1700B;
	}

	public String getJ1700C() {
		return j1700C;
	}

	public String getJ1800() {
		return j1800;
	}

	public String getJ1900A() {
		return j1900A;
	}

	public String getJ1900B() {
		return j1900B;
	}

	public String getJ1900C() {
		return j1900C;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setJ1700A(String j1700a) {
		j1700A = j1700a;
	}

	public void setJ1700B(String j1700b) {
		j1700B = j1700b;
	}

	public void setJ1700C(String j1700c) {
		j1700C = j1700c;
	}

	public void setJ1800(String j1800) {
		this.j1800 = j1800;
	}

	public void setJ1900A(String j1900a) {
		j1900A = j1900a;
	}

	public void setJ1900B(String j1900b) {
		j1900B = j1900b;
	}

	public void setJ1900C(String j1900c) {
		j1900C = j1900c;
	}

}
