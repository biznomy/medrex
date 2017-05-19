package medrex.commons.vo.mds3.sectionO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionO")
public class Mds3SectionO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8826061712967118952L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "O0100A1")
	private boolean o0100A1;
	@Column(name = "O0100A2")
	private boolean o0100A2;

	@Column(name = "O0100B1")
	private boolean o0100B1;
	@Column(name = "O0100B2")
	private boolean o0100B2;

	@Column(name = "O0100C1")
	private boolean o0100C1;
	@Column(name = "O0100C2")
	private boolean o0100C2;

	@Column(name = "O0100D1")
	private boolean o0100D1;
	@Column(name = "O0100D2")
	private boolean o0100D2;

	@Column(name = "O0100E1")
	private boolean o0100E1;
	@Column(name = "O0100E2")
	private boolean o0100E2;

	@Column(name = "O0100F1")
	private boolean o0100F1;
	@Column(name = "O0100F2")
	private boolean o0100F2;

	@Column(name = "O0100G1")
	private boolean o0100G1;
	@Column(name = "O0100G2")
	private boolean o0100G2;

	@Column(name = "O0100H1")
	private boolean o0100H1;
	@Column(name = "O0100H2")
	private boolean o0100H2;

	@Column(name = "O0100I1")
	private boolean o0100I1;
	@Column(name = "O0100I2")
	private boolean o0100I2;

	@Column(name = "O0100J1")
	private boolean o0100J1;
	@Column(name = "O0100J2")
	private boolean o0100J2;

	@Column(name = "O0100K1")
	private boolean o0100K1;
	@Column(name = "O0100K2")
	private boolean o0100K2;

	@Column(name = "O0100L2")
	private boolean o0100L2;

	@Column(name = "O0100M1")
	private boolean o0100M1;
	@Column(name = "O0100M2")
	private boolean o0100M2;

	@Column(name = "O0100Z1")
	private boolean o0100Z1;
	@Column(name = "O0100Z2")
	private boolean o0100Z2;

	@Column(name = "O0250A")
	private String o0250A;
	@Column(name = "O0250B")
	private Date O0250B;
	@Column(name = "O0250C")
	private String O0250C;

	@Column(name = "O0300A")
	private String o0300A;
	@Column(name = "O0300B")
	private String o0300B;

	@Column(name = "O0400A1")
	private double o0400A1;
	@Column(name = "O0400A2")
	private double o0400A2;
	@Column(name = "O0400A3")
	private double o0400A3;
	@Column(name = "O0400A4")
	private double o0400A4;
	@Column(name = "O0400A5")
	private Date o0400A5;
	@Column(name = "O0400A6")
	private Date o0400A6;

	@Column(name = "O0400B1")
	double o0400B1;
	@Column(name = "O0400B2")
	double o0400B2;
	@Column(name = "O0400B3")
	double o0400B3;
	@Column(name = "O0400B4")
	double o0400B4;
	@Column(name = "O0400B5")
	private Date o0400B5;
	@Column(name = "O0400B6")
	private Date o0400B6;

	@Column(name = "O0400C1")
	double o0400C1;
	@Column(name = "O0400C2")
	double o0400C2;
	@Column(name = "O0400C3")
	double o0400C3;
	@Column(name = "O0400C4")
	double o0400C4;
	@Column(name = "O0400C5")
	private Date o0400C5;
	@Column(name = "O0400C6")
	private Date o0400C6;

	@Column(name = "O0400D1")
	private double o0400D1;
	@Column(name = "O0400D2")
	private double o0400D2;

	@Column(name = "O0400E1")
	private double o0400E1;
	@Column(name = "O0400E2")
	private double o0400E2;

	@Column(name = "O0400F1")
	private double o0400F1;
	@Column(name = "O0400F2")
	private double o0400F2;

	@Column(name = "O0500A")
	private int o0500A;
	@Column(name = "O0500B")
	private int o0500B;
	@Column(name = "O0500C")
	private int o0500C;
	@Column(name = "O0500D")
	private int o0500D;
	@Column(name = "O0500E")
	private int o0500E;
	@Column(name = "O0500F")
	private int o0500F;
	@Column(name = "O0500G")
	private int o0500G;
	@Column(name = "O0500H")
	private int o0500H;
	@Column(name = "O0500I")
	private int o0500I;
	@Column(name = "O0500J")
	private int o0500J;

	@Column(name = "O0600")
	private int o0600;

	@Column(name = "O0700")
	private int o0700;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public boolean isO0100A1() {
		return o0100A1;
	}

	public void setO0100A1(boolean o0100a1) {
		o0100A1 = o0100a1;
	}

	public boolean isO0100A2() {
		return o0100A2;
	}

	public void setO0100A2(boolean o0100a2) {
		o0100A2 = o0100a2;
	}

	public boolean isO0100B1() {
		return o0100B1;
	}

	public void setO0100B1(boolean o0100b1) {
		o0100B1 = o0100b1;
	}

	public boolean isO0100B2() {
		return o0100B2;
	}

	public void setO0100B2(boolean o0100b2) {
		o0100B2 = o0100b2;
	}

	public boolean isO0100C1() {
		return o0100C1;
	}

	public void setO0100C1(boolean o0100c1) {
		o0100C1 = o0100c1;
	}

	public boolean isO0100C2() {
		return o0100C2;
	}

	public void setO0100C2(boolean o0100c2) {
		o0100C2 = o0100c2;
	}

	public boolean isO0100D1() {
		return o0100D1;
	}

	public void setO0100D1(boolean o0100d1) {
		o0100D1 = o0100d1;
	}

	public boolean isO0100D2() {
		return o0100D2;
	}

	public void setO0100D2(boolean o0100d2) {
		o0100D2 = o0100d2;
	}

	public boolean isO0100E1() {
		return o0100E1;
	}

	public void setO0100E1(boolean o0100e1) {
		o0100E1 = o0100e1;
	}

	public boolean isO0100E2() {
		return o0100E2;
	}

	public void setO0100E2(boolean o0100e2) {
		o0100E2 = o0100e2;
	}

	public boolean isO0100F1() {
		return o0100F1;
	}

	public void setO0100F1(boolean o0100f1) {
		o0100F1 = o0100f1;
	}

	public boolean isO0100F2() {
		return o0100F2;
	}

	public void setO0100F2(boolean o0100f2) {
		o0100F2 = o0100f2;
	}

	public boolean isO0100G1() {
		return o0100G1;
	}

	public void setO0100G1(boolean o0100g1) {
		o0100G1 = o0100g1;
	}

	public boolean isO0100G2() {
		return o0100G2;
	}

	public void setO0100G2(boolean o0100g2) {
		o0100G2 = o0100g2;
	}

	public boolean isO0100H1() {
		return o0100H1;
	}

	public void setO0100H1(boolean o0100h1) {
		o0100H1 = o0100h1;
	}

	public boolean isO0100H2() {
		return o0100H2;
	}

	public void setO0100H2(boolean o0100h2) {
		o0100H2 = o0100h2;
	}

	public boolean isO0100I1() {
		return o0100I1;
	}

	public void setO0100I1(boolean o0100i1) {
		o0100I1 = o0100i1;
	}

	public boolean isO0100I2() {
		return o0100I2;
	}

	public void setO0100I2(boolean o0100i2) {
		o0100I2 = o0100i2;
	}

	public boolean isO0100J1() {
		return o0100J1;
	}

	public void setO0100J1(boolean o0100j1) {
		o0100J1 = o0100j1;
	}

	public boolean isO0100J2() {
		return o0100J2;
	}

	public void setO0100J2(boolean o0100j2) {
		o0100J2 = o0100j2;
	}

	public boolean isO0100K1() {
		return o0100K1;
	}

	public void setO0100K1(boolean o0100k1) {
		o0100K1 = o0100k1;
	}

	public boolean isO0100K2() {
		return o0100K2;
	}

	public void setO0100K2(boolean o0100k2) {
		o0100K2 = o0100k2;
	}

	public boolean isO0100L2() {
		return o0100L2;
	}

	public void setO0100L2(boolean o0100l2) {
		o0100L2 = o0100l2;
	}

	public boolean isO0100M1() {
		return o0100M1;
	}

	public void setO0100M1(boolean o0100m1) {
		o0100M1 = o0100m1;
	}

	public boolean isO0100M2() {
		return o0100M2;
	}

	public void setO0100M2(boolean o0100m2) {
		o0100M2 = o0100m2;
	}

	public boolean isO0100Z1() {
		return o0100Z1;
	}

	public void setO0100Z1(boolean o0100z1) {
		o0100Z1 = o0100z1;
	}

	public boolean isO0100Z2() {
		return o0100Z2;
	}

	public void setO0100Z2(boolean o0100z2) {
		o0100Z2 = o0100z2;
	}

	public String getO0250A() {
		return o0250A;
	}

	public void setO0250A(String o0250a) {
		o0250A = o0250a;
	}

	public Date getO0250B() {
		return O0250B;
	}

	public void setO0250B(Date o0250b) {
		O0250B = o0250b;
	}

	public String getO0250C() {
		return O0250C;
	}

	public void setO0250C(String o0250c) {
		O0250C = o0250c;
	}

	public String getO0300A() {
		return o0300A;
	}

	public void setO0300A(String o0300a) {
		o0300A = o0300a;
	}

	public String getO0300B() {
		return o0300B;
	}

	public void setO0300B(String o0300b) {
		o0300B = o0300b;
	}

	public double getO0400A1() {
		return o0400A1;
	}

	public void setO0400A1(double o0400a1) {
		o0400A1 = o0400a1;
	}

	public double getO0400A2() {
		return o0400A2;
	}

	public void setO0400A2(double o0400a2) {
		o0400A2 = o0400a2;
	}

	public double getO0400A3() {
		return o0400A3;
	}

	public void setO0400A3(double o0400a3) {
		o0400A3 = o0400a3;
	}

	public double getO0400A4() {
		return o0400A4;
	}

	public void setO0400A4(double o0400a4) {
		o0400A4 = o0400a4;
	}

	public Date getO0400A5() {
		return o0400A5;
	}

	public void setO0400A5(Date o0400a5) {
		o0400A5 = o0400a5;
	}

	public Date getO0400A6() {
		return o0400A6;
	}

	public void setO0400A6(Date o0400a6) {
		o0400A6 = o0400a6;
	}

	public double getO0400B1() {
		return o0400B1;
	}

	public void setO0400B1(double o0400b1) {
		o0400B1 = o0400b1;
	}

	public double getO0400B2() {
		return o0400B2;
	}

	public void setO0400B2(double o0400b2) {
		o0400B2 = o0400b2;
	}

	public double getO0400B3() {
		return o0400B3;
	}

	public void setO0400B3(double o0400b3) {
		o0400B3 = o0400b3;
	}

	public double getO0400B4() {
		return o0400B4;
	}

	public void setO0400B4(double o0400b4) {
		o0400B4 = o0400b4;
	}

	public Date getO0400B5() {
		return o0400B5;
	}

	public void setO0400B5(Date o0400b5) {
		o0400B5 = o0400b5;
	}

	public Date getO0400B6() {
		return o0400B6;
	}

	public void setO0400B6(Date o0400b6) {
		o0400B6 = o0400b6;
	}

	public double getO0400C1() {
		return o0400C1;
	}

	public void setO0400C1(double o0400c1) {
		o0400C1 = o0400c1;
	}

	public double getO0400C2() {
		return o0400C2;
	}

	public void setO0400C2(double o0400c2) {
		o0400C2 = o0400c2;
	}

	public double getO0400C3() {
		return o0400C3;
	}

	public void setO0400C3(double o0400c3) {
		o0400C3 = o0400c3;
	}

	public double getO0400C4() {
		return o0400C4;
	}

	public void setO0400C4(double o0400c4) {
		o0400C4 = o0400c4;
	}

	public Date getO0400C5() {
		return o0400C5;
	}

	public void setO0400C5(Date o0400c5) {
		o0400C5 = o0400c5;
	}

	public Date getO0400C6() {
		return o0400C6;
	}

	public void setO0400C6(Date o0400c6) {
		o0400C6 = o0400c6;
	}

	public double getO0400D1() {
		return o0400D1;
	}

	public void setO0400D1(double o0400d1) {
		o0400D1 = o0400d1;
	}

	public double getO0400D2() {
		return o0400D2;
	}

	public void setO0400D2(double o0400d2) {
		o0400D2 = o0400d2;
	}

	public double getO0400E1() {
		return o0400E1;
	}

	public void setO0400E1(double o0400e1) {
		o0400E1 = o0400e1;
	}

	public double getO0400E2() {
		return o0400E2;
	}

	public void setO0400E2(double o0400e2) {
		o0400E2 = o0400e2;
	}

	public double getO0400F1() {
		return o0400F1;
	}

	public void setO0400F1(double o0400f1) {
		o0400F1 = o0400f1;
	}

	public double getO0400F2() {
		return o0400F2;
	}

	public void setO0400F2(double o0400f2) {
		o0400F2 = o0400f2;
	}

	public int getO0500A() {
		return o0500A;
	}

	public void setO0500A(int o0500a) {
		o0500A = o0500a;
	}

	public int getO0500B() {
		return o0500B;
	}

	public void setO0500B(int o0500b) {
		o0500B = o0500b;
	}

	public int getO0500C() {
		return o0500C;
	}

	public void setO0500C(int o0500c) {
		o0500C = o0500c;
	}

	public int getO0500D() {
		return o0500D;
	}

	public void setO0500D(int o0500d) {
		o0500D = o0500d;
	}

	public int getO0500E() {
		return o0500E;
	}

	public void setO0500E(int o0500e) {
		o0500E = o0500e;
	}

	public int getO0500F() {
		return o0500F;
	}

	public void setO0500F(int o0500f) {
		o0500F = o0500f;
	}

	public int getO0500G() {
		return o0500G;
	}

	public void setO0500G(int o0500g) {
		o0500G = o0500g;
	}

	public int getO0500H() {
		return o0500H;
	}

	public void setO0500H(int o0500h) {
		o0500H = o0500h;
	}

	public int getO0500I() {
		return o0500I;
	}

	public void setO0500I(int o0500i) {
		o0500I = o0500i;
	}

	public int getO0500J() {
		return o0500J;
	}

	public void setO0500J(int o0500j) {
		o0500J = o0500j;
	}

	public int getO0600() {
		return o0600;
	}

	public void setO0600(int o0600) {
		this.o0600 = o0600;
	}

	public int getO0700() {
		return o0700;
	}

	public void setO0700(int o0700) {
		this.o0700 = o0700;
	}

}
