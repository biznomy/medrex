package medrex.commons.vo.mds3.SectionI;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionI")
public class Mds3SectionI implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 217445854835736484L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "i0100")
	private boolean i0100;
	@Column(name = "i0200")
	private boolean i0200;
	@Column(name = "i0300")
	private boolean i0300;
	@Column(name = "i0400")
	private boolean i0400;
	@Column(name = "i0500")
	private boolean i0500;
	@Column(name = "i0600")
	private boolean i0600;
	@Column(name = "i0700")
	private boolean i0700;
	@Column(name = "i0800")
	private boolean i0800;
	@Column(name = "i0900")
	private boolean i0900;
	@Column(name = "i1100")
	private boolean i1100;
	@Column(name = "i1200")
	private boolean i1200;
	@Column(name = "i1300")
	private boolean i1300;
	@Column(name = "i1400")
	private boolean i1400;
	@Column(name = "i1500")
	private boolean i1500;
	@Column(name = "i1550")
	private boolean i1550;
	@Column(name = "i1650")
	private boolean i1650;
	@Column(name = "i1700")
	private boolean i1700;
	@Column(name = "i2000")
	private boolean i2000;
	@Column(name = "i2100")
	private boolean i2100;
	@Column(name = "i2200")
	private boolean i2200;
	@Column(name = "i2300")
	private boolean i2300;
	@Column(name = "i2400")
	private boolean i2400;
	@Column(name = "i2500")
	private boolean i2500;
	@Column(name = "i2900")
	private boolean i2900;
	@Column(name = "i3100")
	private boolean i3100;
	@Column(name = "i3200")
	private boolean i3200;
	@Column(name = "i3300")
	private boolean i3300;
	@Column(name = "i3400")
	private boolean i3400;
	@Column(name = "i3700")
	private boolean i3700;
	@Column(name = "i3800")
	private boolean i3800;
	@Column(name = "i3900")
	private boolean i3900;
	@Column(name = "i4000")
	private boolean i4000;
	@Column(name = "i4200")
	private boolean i4200;
	@Column(name = "i4300")
	private boolean i4300;
	@Column(name = "i4400")
	private boolean i4400;
	@Column(name = "i4500")
	private boolean i4500;
	@Column(name = "i4800")
	private boolean i4800;
	@Column(name = "i4900")
	private boolean i4900;
	@Column(name = "i5000")
	private boolean i5000;
	@Column(name = "i5100")
	private boolean i5100;
	@Column(name = "i5200")
	private boolean i5200;
	@Column(name = "i5250")
	private boolean i5250;
	@Column(name = "i5300")
	private boolean i5300;
	@Column(name = "i5350")
	private boolean i5350;
	@Column(name = "i5400")
	private boolean i5400;
	@Column(name = "i5500")
	private boolean i5500;
	@Column(name = "i5600")
	private boolean i5600;
	@Column(name = "i5700")
	private boolean i5700;
	@Column(name = "i5800")
	private boolean i5800;
	@Column(name = "i5900")
	private boolean i5900;
	@Column(name = "i59500")
	private boolean i5950;
	@Column(name = "i6000")
	private boolean i6000;
	@Column(name = "i6100")
	private boolean i6100;
	@Column(name = "i6200")
	private boolean i6200;
	@Column(name = "i6300")
	private boolean i6300;
	@Column(name = "i6500")
	private boolean i6500;
	@Column(name = "i7900")
	private boolean i7900;

	/*
	 * @Column(name= "i8000cb") private boolean i8000cb;
	 */

	public void setI8000B1(String i8000b1) {
		I8000B1 = i8000b1;
	}

	public String getI8000B2() {
		return I8000B2;
	}

	public void setI8000B2(String i8000b2) {
		I8000B2 = i8000b2;
	}

	public String getI8000C1() {
		return I8000C1;
	}

	public void setI8000C1(String i8000c1) {
		I8000C1 = i8000c1;
	}

	public String getI8000C2() {
		return I8000C2;
	}

	public void setI8000C2(String i8000c2) {
		I8000C2 = i8000c2;
	}

	public String getI8000D1() {
		return I8000D1;
	}

	public void setI8000D1(String i8000d1) {
		I8000D1 = i8000d1;
	}

	public String getI8000D2() {
		return I8000D2;
	}

	public void setI8000D2(String i8000d2) {
		I8000D2 = i8000d2;
	}

	public String getI8000E1() {
		return I8000E1;
	}

	public void setI8000E1(String i8000e1) {
		I8000E1 = i8000e1;
	}

	public String getI8000E2() {
		return I8000E2;
	}

	public void setI8000E2(String i8000e2) {
		I8000E2 = i8000e2;
	}

	public String getI8000F1() {
		return I8000F1;
	}

	public void setI8000F1(String i8000f1) {
		I8000F1 = i8000f1;
	}

	public String getI8000F2() {
		return I8000F2;
	}

	public void setI8000F2(String i8000f2) {
		I8000F2 = i8000f2;
	}

	public String getI8000G1() {
		return I8000G1;
	}

	public void setI8000G1(String i8000g1) {
		I8000G1 = i8000g1;
	}

	public String getI8000G2() {
		return I8000G2;
	}

	public void setI8000G2(String i8000g2) {
		I8000G2 = i8000g2;
	}

	public String getI8000H1() {
		return I8000H1;
	}

	public void setI8000H1(String i8000h1) {
		I8000H1 = i8000h1;
	}

	public String getI8000H2() {
		return I8000H2;
	}

	public void setI8000H2(String i8000h2) {
		I8000H2 = i8000h2;
	}

	public String getI8000I1() {
		return I8000I1;
	}

	public void setI8000I1(String i8000i1) {
		I8000I1 = i8000i1;
	}

	public String getI8000I2() {
		return I8000I2;
	}

	public void setI8000I2(String i8000i2) {
		I8000I2 = i8000i2;
	}

	public String getI8000J1() {
		return I8000J1;
	}

	public void setI8000J1(String i8000j1) {
		I8000J1 = i8000j1;
	}

	public String getI8000J2() {
		return I8000J2;
	}

	public void setI8000J2(String i8000j2) {
		I8000J2 = i8000j2;
	}

	@Column(name = "I8000A1")
	private String I8000A1;
	@Column(name = "I8000A2")
	private String I8000A2;

	@Column(name = "I8000B1")
	private String I8000B1;
	@Column(name = "I8000B2")
	private String I8000B2;

	@Column(name = "I8000C1")
	private String I8000C1;
	@Column(name = "I8000C2")
	private String I8000C2;

	@Column(name = "I8000D1")
	private String I8000D1;
	@Column(name = "I8000D2")
	private String I8000D2;

	@Column(name = "I8000E1")
	private String I8000E1;
	@Column(name = "I8000E2")
	private String I8000E2;

	@Column(name = "I8000F1")
	private String I8000F1;
	@Column(name = "I8000F2")
	private String I8000F2;

	@Column(name = "I8000G1")
	private String I8000G1;
	@Column(name = "I8000G2")
	private String I8000G2;

	@Column(name = "I80001H")
	private String I8000H1;
	@Column(name = "I8000H2")
	private String I8000H2;

	@Column(name = "I80001I")
	private String I8000I1;
	@Column(name = "I8000I2")
	private String I8000I2;

	@Column(name = "I80001J")
	private String I8000J1;
	@Column(name = "I8000J2")
	private String I8000J2;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public boolean isI0100() {
		return i0100;
	}

	public void setI0100(boolean i0100) {
		this.i0100 = i0100;
	}

	public boolean isI0200() {
		return i0200;
	}

	public void setI0200(boolean i0200) {
		this.i0200 = i0200;
	}

	public boolean isI0300() {
		return i0300;
	}

	public void setI0300(boolean i0300) {
		this.i0300 = i0300;
	}

	public boolean isI0400() {
		return i0400;
	}

	public void setI0400(boolean i0400) {
		this.i0400 = i0400;
	}

	public boolean isI0500() {
		return i0500;
	}

	public void setI0500(boolean i0500) {
		this.i0500 = i0500;
	}

	public boolean isI0600() {
		return i0600;
	}

	public void setI0600(boolean i0600) {
		this.i0600 = i0600;
	}

	public boolean isI0700() {
		return i0700;
	}

	public void setI0700(boolean i0700) {
		this.i0700 = i0700;
	}

	public boolean isI0800() {
		return i0800;
	}

	public void setI0800(boolean i0800) {
		this.i0800 = i0800;
	}

	public boolean isI0900() {
		return i0900;
	}

	public void setI0900(boolean i0900) {
		this.i0900 = i0900;
	}

	public boolean isI1100() {
		return i1100;
	}

	public void setI1100(boolean i1100) {
		this.i1100 = i1100;
	}

	public boolean isI1200() {
		return i1200;
	}

	public void setI1200(boolean i1200) {
		this.i1200 = i1200;
	}

	public boolean isI1300() {
		return i1300;
	}

	public void setI1300(boolean i1300) {
		this.i1300 = i1300;
	}

	public boolean isI1400() {
		return i1400;
	}

	public void setI1400(boolean i1400) {
		this.i1400 = i1400;
	}

	public boolean isI1500() {
		return i1500;
	}

	public void setI1500(boolean i1500) {
		this.i1500 = i1500;
	}

	public boolean isI1550() {
		return i1550;
	}

	public void setI1550(boolean i1550) {
		this.i1550 = i1550;
	}

	public boolean isI1650() {
		return i1650;
	}

	public void setI1650(boolean i1650) {
		this.i1650 = i1650;
	}

	public boolean isI1700() {
		return i1700;
	}

	public void setI1700(boolean i1700) {
		this.i1700 = i1700;
	}

	public boolean isI2000() {
		return i2000;
	}

	public void setI2000(boolean i2000) {
		this.i2000 = i2000;
	}

	public boolean isI2100() {
		return i2100;
	}

	public void setI2100(boolean i2100) {
		this.i2100 = i2100;
	}

	public boolean isI2200() {
		return i2200;
	}

	public void setI2200(boolean i2200) {
		this.i2200 = i2200;
	}

	public boolean isI2300() {
		return i2300;
	}

	public void setI2300(boolean i2300) {
		this.i2300 = i2300;
	}

	public boolean isI2400() {
		return i2400;
	}

	public void setI2400(boolean i2400) {
		this.i2400 = i2400;
	}

	public boolean isI2500() {
		return i2500;
	}

	public void setI2500(boolean i2500) {
		this.i2500 = i2500;
	}

	public boolean isI2900() {
		return i2900;
	}

	public void setI2900(boolean i2900) {
		this.i2900 = i2900;
	}

	public boolean isI3100() {
		return i3100;
	}

	public void setI3100(boolean i3100) {
		this.i3100 = i3100;
	}

	public boolean isI3200() {
		return i3200;
	}

	public void setI3200(boolean i3200) {
		this.i3200 = i3200;
	}

	public boolean isI3300() {
		return i3300;
	}

	public void setI3300(boolean i3300) {
		this.i3300 = i3300;
	}

	public boolean isI3400() {
		return i3400;
	}

	public void setI3400(boolean i3400) {
		this.i3400 = i3400;
	}

	public boolean isI3700() {
		return i3700;
	}

	public void setI3700(boolean i3700) {
		this.i3700 = i3700;
	}

	public boolean isI3800() {
		return i3800;
	}

	public void setI3800(boolean i3800) {
		this.i3800 = i3800;
	}

	public boolean isI3900() {
		return i3900;
	}

	public void setI3900(boolean i3900) {
		this.i3900 = i3900;
	}

	public boolean isI4000() {
		return i4000;
	}

	public void setI4000(boolean i4000) {
		this.i4000 = i4000;
	}

	public boolean isI4200() {
		return i4200;
	}

	public void setI4200(boolean i4200) {
		this.i4200 = i4200;
	}

	public boolean isI4300() {
		return i4300;
	}

	public void setI4300(boolean i4300) {
		this.i4300 = i4300;
	}

	public boolean isI4400() {
		return i4400;
	}

	public void setI4400(boolean i4400) {
		this.i4400 = i4400;
	}

	public boolean isI4500() {
		return i4500;
	}

	public void setI4500(boolean i4500) {
		this.i4500 = i4500;
	}

	public boolean isI4800() {
		return i4800;
	}

	public void setI4800(boolean i4800) {
		this.i4800 = i4800;
	}

	public boolean isI4900() {
		return i4900;
	}

	public void setI4900(boolean i4900) {
		this.i4900 = i4900;
	}

	public boolean isI5000() {
		return i5000;
	}

	public void setI5000(boolean i5000) {
		this.i5000 = i5000;
	}

	public boolean isI5100() {
		return i5100;
	}

	public void setI5100(boolean i5100) {
		this.i5100 = i5100;
	}

	public boolean isI5200() {
		return i5200;
	}

	public void setI5200(boolean i5200) {
		this.i5200 = i5200;
	}

	public boolean isI5250() {
		return i5250;
	}

	public void setI5250(boolean i5250) {
		this.i5250 = i5250;
	}

	public boolean isI5300() {
		return i5300;
	}

	public void setI5300(boolean i5300) {
		this.i5300 = i5300;
	}

	public boolean isI5350() {
		return i5350;
	}

	public void setI5350(boolean i5350) {
		this.i5350 = i5350;
	}

	public boolean isI5400() {
		return i5400;
	}

	public void setI5400(boolean i5400) {
		this.i5400 = i5400;
	}

	public boolean isI5500() {
		return i5500;
	}

	public void setI5500(boolean i5500) {
		this.i5500 = i5500;
	}

	public boolean isI5600() {
		return i5600;
	}

	public void setI5600(boolean i5600) {
		this.i5600 = i5600;
	}

	public boolean isI5700() {
		return i5700;
	}

	public void setI5700(boolean i5700) {
		this.i5700 = i5700;
	}

	public boolean isI5800() {
		return i5800;
	}

	public void setI5800(boolean i5800) {
		this.i5800 = i5800;
	}

	public boolean isI5900() {
		return i5900;
	}

	public void setI5900(boolean i5900) {
		this.i5900 = i5900;
	}

	public boolean isI5950() {
		return i5950;
	}

	public void setI5950(boolean i5950) {
		this.i5950 = i5950;
	}

	public boolean isI6000() {
		return i6000;
	}

	public void setI6000(boolean i6000) {
		this.i6000 = i6000;
	}

	public boolean isI6100() {
		return i6100;
	}

	public void setI6100(boolean i6100) {
		this.i6100 = i6100;
	}

	public boolean isI6200() {
		return i6200;
	}

	public void setI6200(boolean i6200) {
		this.i6200 = i6200;
	}

	public boolean isI6300() {
		return i6300;
	}

	public void setI6300(boolean i6300) {
		this.i6300 = i6300;
	}

	public boolean isI6500() {
		return i6500;
	}

	public void setI6500(boolean i6500) {
		this.i6500 = i6500;
	}

	public boolean isI7900() {
		return i7900;
	}

	public void setI7900(boolean i7900) {
		this.i7900 = i7900;
	}

	public String getI8000A1() {
		return I8000A1;
	}

	public void setI8000A1(String i8000a1) {
		I8000A1 = i8000a1;
	}

	public String getI8000A2() {
		return I8000A2;
	}

	public void setI8000A2(String i8000a2) {
		I8000A2 = i8000a2;
	}

	public String getI8000B1() {
		return I8000B1;
	}

}