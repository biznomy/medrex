package medrex.commons.vo.mds3.SectionA;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionA")
public class Mds3SectionA implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "A0100A")
	private String A0100A;

	@Column(name = "A0100B")
	private String A0100B;

	@Column(name = "A0100C")
	private String A0100C;

	@Column(name = "A0200")
	private String A0200;

	@Column(name = "A0310A")
	private String A0310A;

	@Column(name = "A0310B")
	private String A0310B;

	@Column(name = "A0310C")
	private String A0310C;

	@Column(name = "A0310D")
	private String A0310D;

	@Column(name = "A0310E")
	private String A0310E;

	@Column(name = "A0310F")
	private String A0310F;

	@Column(name = "A0410")
	private String A0410;

	@Column(name = "A0500A")
	private String A0500A;

	@Column(name = "A0500B")
	private String A0500B;

	@Column(name = "A0500C")
	private String A0500C;

	@Column(name = "A0500D")
	private String A0500D;

	@Column(name = "A0600A")
	private String A0600A;

	@Column(name = "A0600B")
	private String A0600B;

	@Column(name = "A0700")
	private String A0700;

	@Column(name = "A0800")
	private String A0800;

	@Column(name = "A0900")
	private Date A0900;

	@Column(name = "A1000A")
	private boolean A1000A;

	@Column(name = "A1000B")
	private boolean A1000B;

	@Column(name = "A1000C")
	private boolean A1000C;

	@Column(name = "A1000D")
	private boolean A1000D;

	@Column(name = "A1000E")
	private boolean A1000E;

	@Column(name = "A1000F")
	private boolean A1000F;

	@Column(name = "A1100A")
	private String A1100A;

	@Column(name = "A1100B")
	private String A1100B;

	@Column(name = "A1200")
	private String A1200;

	@Column(name = "A1300A")
	private String A1300A;

	@Column(name = "A1300B")
	private String A1300B;

	@Column(name = "A1300C")
	private String A1300C;

	@Column(name = "A1300D")
	private String A1300D;

	@Column(name = "A1500")
	private String A1500;

	@Column(name = "A1550A")
	private boolean A1550A;

	@Column(name = "A1550B")
	private boolean A1550B;

	@Column(name = "A1550C")
	private boolean A1550C;

	@Column(name = "A1550D")
	private boolean A1550D;

	@Column(name = "A1550E")
	private boolean A1550E;

	@Column(name = "A1550Z")
	private boolean A1550Z;

	@Column(name = "A1600")
	private String A1600;

	@Column(name = "A1700")
	private String A1700;

	@Column(name = "A1800")
	private String A1800;

	@Column(name = "A2000")
	private Date A2000;

	@Column(name = "A2100")
	private String A2100;

	@Column(name = "A2200")
	private Date A2200;

	@Column(name = "A2300")
	private Date A2300;

	@Column(name = "A2400A")
	private String A2400A;

	@Column(name = "A2400B")
	private Date A2400B;

	@Column(name = "A2400C")
	private Date A2400C;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getSerial() {
		return serial;
	}

	public String getA0100A() {
		return A0100A;
	}

	public String getA0100B() {
		return A0100B;
	}

	public String getA0100C() {
		return A0100C;
	}

	public String getA0500A() {
		return A0500A;
	}

	public String getA0500B() {
		return A0500B;
	}

	public String getA0500C() {
		return A0500C;
	}

	public String getA0500D() {
		return A0500D;
	}

	public String getA0600A() {
		return A0600A;
	}

	public String getA0600B() {
		return A0600B;
	}

	public String getA0700() {
		return A0700;
	}

	public String getA1100B() {
		return A1100B;
	}

	public String getA1300A() {
		return A1300A;
	}

	public String getA1300B() {
		return A1300B;
	}

	public String getA1300C() {
		return A1300C;
	}

	public String getA1300D() {
		return A1300D;
	}

	public String getA1600() {
		return A1600;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setA0100A(String a0100a) {
		A0100A = a0100a;
	}

	public void setA0100B(String a0100b) {
		A0100B = a0100b;
	}

	public void setA0100C(String a0100c) {
		A0100C = a0100c;
	}

	public void setA0500A(String a0500a) {
		A0500A = a0500a;
	}

	public void setA0500B(String a0500b) {
		A0500B = a0500b;
	}

	public void setA0500C(String a0500c) {
		A0500C = a0500c;
	}

	public void setA0500D(String a0500d) {
		A0500D = a0500d;
	}

	public void setA0600A(String a0600a) {
		A0600A = a0600a;
	}

	public void setA0600B(String a0600b) {
		A0600B = a0600b;
	}

	public void setA0700(String a0700) {
		A0700 = a0700;
	}

	public void setA1100B(String a1100b) {
		A1100B = a1100b;
	}

	public void setA1300A(String a1300a) {
		A1300A = a1300a;
	}

	public void setA1300B(String a1300b) {
		A1300B = a1300b;
	}

	public void setA1300C(String a1300c) {
		A1300C = a1300c;
	}

	public void setA1300D(String a1300d) {
		A1300D = a1300d;
	}

	public Date getA2000() {
		return A2000;
	}

	public void setA2000(Date a2000) {
		A2000 = a2000;
	}

	public void setA1600(String a1600) {
		A1600 = a1600;
	}

	public Date getA2200() {
		return A2200;
	}

	public void setA2200(Date a2200) {
		A2200 = a2200;
	}

	public Date getA2300() {
		return A2300;
	}

	public void setA2300(Date a2300) {
		A2300 = a2300;
	}

	public Date getA2400B() {
		return A2400B;
	}

	public void setA2400B(Date a2400b) {
		A2400B = a2400b;
	}

	public Date getA2400C() {
		return A2400C;
	}

	public void setA2400C(Date a2400c) {
		A2400C = a2400c;
	}

	public boolean isA1000A() {
		return A1000A;
	}

	public void setA1000A(boolean a1000a) {
		A1000A = a1000a;
	}

	public boolean isA1000B() {
		return A1000B;
	}

	public void setA1000B(boolean a1000b) {
		A1000B = a1000b;
	}

	public boolean isA1000C() {
		return A1000C;
	}

	public void setA1000C(boolean a1000c) {
		A1000C = a1000c;
	}

	public boolean isA1000D() {
		return A1000D;
	}

	public void setA1000D(boolean a1000d) {
		A1000D = a1000d;
	}

	public boolean isA1000E() {
		return A1000E;
	}

	public void setA1000E(boolean a1000e) {
		A1000E = a1000e;
	}

	public boolean isA1000F() {
		return A1000F;
	}

	public void setA1000F(boolean a1000f) {
		A1000F = a1000f;
	}

	public String getA0200() {
		return A0200;
	}

	public void setA0200(String a0200) {
		A0200 = a0200;
	}

	public String getA0310A() {
		return A0310A;
	}

	public void setA0310A(String a0310a) {
		A0310A = a0310a;
	}

	public String getA0310B() {
		return A0310B;
	}

	public void setA0310B(String a0310b) {
		A0310B = a0310b;
	}

	public String getA0310C() {
		return A0310C;
	}

	public void setA0310C(String a0310c) {
		A0310C = a0310c;
	}

	public String getA0310D() {
		return A0310D;
	}

	public void setA0310D(String a0310d) {
		A0310D = a0310d;
	}

	public String getA0310E() {
		return A0310E;
	}

	public void setA0310E(String a0310e) {
		A0310E = a0310e;
	}

	public String getA0310F() {
		return A0310F;
	}

	public void setA0310F(String a0310f) {
		A0310F = a0310f;
	}

	public String getA0410() {
		return A0410;
	}

	public void setA0410(String a0410) {
		A0410 = a0410;
	}

	public String getA0800() {
		return A0800;
	}

	public void setA0800(String a0800) {
		A0800 = a0800;
	}

	public String getA1100A() {
		return A1100A;
	}

	public void setA1100A(String a1100a) {
		A1100A = a1100a;
	}

	public String getA1500() {
		return A1500;
	}

	public void setA1500(String a1500) {
		A1500 = a1500;
	}

	public String getA1700() {
		return A1700;
	}

	public void setA1700(String a1700) {
		A1700 = a1700;
	}

	public String getA1800() {
		return A1800;
	}

	public void setA1800(String a1800) {
		A1800 = a1800;
	}

	public String getA2100() {
		return A2100;
	}

	public void setA2100(String a2100) {
		A2100 = a2100;
	}

	public String getA2400A() {
		return A2400A;
	}

	public String getA1200() {
		return A1200;
	}

	public void setA1200(String a1200) {
		A1200 = a1200;
	}

	public void setA2400A(String a2400a) {
		A2400A = a2400a;
	}

	public boolean isA1550A() {
		return A1550A;
	}

	public void setA1550A(boolean a1550a) {
		A1550A = a1550a;
	}

	public boolean isA1550B() {
		return A1550B;
	}

	public void setA1550B(boolean a1550b) {
		A1550B = a1550b;
	}

	public boolean isA1550C() {
		return A1550C;
	}

	public void setA1550C(boolean a1550c) {
		A1550C = a1550c;
	}

	public boolean isA1550D() {
		return A1550D;
	}

	public void setA1550D(boolean a1550d) {
		A1550D = a1550d;
	}

	public boolean isA1550E() {
		return A1550E;
	}

	public void setA1550E(boolean a1550e) {
		A1550E = a1550e;
	}

	public boolean isA1550Z() {
		return A1550Z;
	}

	public void setA1550Z(boolean a1550z) {
		A1550Z = a1550z;
	}

	public Date getA0900() {
		return A0900;
	}

	public void setA0900(Date a0900) {
		A0900 = a0900;
	}

}
