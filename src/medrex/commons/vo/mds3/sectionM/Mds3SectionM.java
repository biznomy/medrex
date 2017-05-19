package medrex.commons.vo.mds3.sectionM;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionM")
public class Mds3SectionM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 869897392027504453L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "M0100A")
	private boolean m0100A;

	@Column(name = "M0100B")
	private boolean m0100B;

	@Column(name = "M0100C")
	private boolean m0100C;

	@Column(name = "M0100Z")
	private boolean m0100Z;

	@Column(name = "M0150")
	private String m0150;

	@Column(name = "M0210")
	private String m0210;

	@Column(name = "M0300A")
	private String m0300A;

	@Column(name = "M0300B_1")
	private String m0300B_1;

	@Column(name = "M0300B_2")
	private String m0300B_2;

	@Column(name = "M0300B_3")
	private Date m0300B_3;

	@Column(name = "M0300C_1")
	private String m0300C_1;

	@Column(name = "M0300C_2")
	private String m0300C_2;

	@Column(name = "M0300D_1")
	private String m0300D_1;

	@Column(name = "M0300D_2")
	private String m0300D_2;

	@Column(name = "M0300E_1")
	private String m0300E_1;

	@Column(name = "M0300E_2")
	private String m0300E_2;

	@Column(name = "M0300F_1")
	private String m0300F_1;

	@Column(name = "M0300F_2")
	private String m0300F_2;

	@Column(name = "M0300G_1")
	private String m0300G_1;

	@Column(name = "M0300G_2")
	private String m0300G_2;

	@Column(name = "M0610A")
	private String m0610A;

	@Column(name = "M0610B")
	private String M0610B;

	@Column(name = "M0610C")
	private String M0610C;

	@Column(name = "M0700")
	private String m0700;

	@Column(name = "M0800A")
	private String m0800A;

	@Column(name = "M0800B")
	private String m0800B;

	@Column(name = "M0800C")
	private String m0800C;

	@Column(name = "M0900A")
	private String m0900A;

	@Column(name = "M0900B")
	private String m0900B;

	@Column(name = "M0900C")
	private String m0900C;

	@Column(name = "M0900D")
	private String m0900D;

	@Column(name = "M01030")
	private String m01030;

	@Column(name = "M01040A")
	private boolean m01040A;

	@Column(name = "M01040B")
	private boolean m01040B;

	@Column(name = "M01040C")
	private boolean m01040C;

	@Column(name = "M01040D")
	private boolean m01040D;

	@Column(name = "M01040E")
	private boolean m01040E;

	@Column(name = "M01040F")
	private boolean m01040F;

	@Column(name = "M01040G")
	private boolean m01040G;

	@Column(name = "M01040H")
	private boolean m01040H;

	@Column(name = "M01040I")
	private boolean m01040I;

	@Column(name = "M01040Z")
	private boolean m01040Z;
	@Column(name = "M1200J")
	boolean M1200J;
	@Column(name = "M1200I")
	boolean M1200I;
	@Column(name = "M1200H")
	boolean M1200H;
	@Column(name = "M1200G")
	boolean M1200G;
	@Column(name = "M1200F")
	boolean M1200F;
	@Column(name = "M1200E")
	boolean M1200E;
	@Column(name = "M1200D")
	boolean M1200D;
	@Column(name = "M1200C")
	boolean M1200C;
	@Column(name = "M1200B")
	boolean M1200B;
	@Column(name = "M1200A")
	boolean M1200A;

	@Column(name = "M0100D")
	boolean M0100D;

	public int getSerial() {
		return serial;
	}

	public boolean isM0100A() {
		return m0100A;
	}

	public boolean isM0100B() {
		return m0100B;
	}

	public boolean isM0100C() {
		return m0100C;
	}

	public boolean isM0100Z() {
		return m0100Z;
	}

	public String getM0210() {
		return m0210;
	}

	public String getM0300A() {
		return m0300A;
	}

	public String getM0300B_1() {
		return m0300B_1;
	}

	public String getM0300B_2() {
		return m0300B_2;
	}

	public Date getM0300B_3() {
		return m0300B_3;
	}

	public String getM0300C_1() {
		return m0300C_1;
	}

	public String getM0300C_2() {
		return m0300C_2;
	}

	public String getM0300D_1() {
		return m0300D_1;
	}

	public String getM0300D_2() {
		return m0300D_2;
	}

	public String getM0300E_1() {
		return m0300E_1;
	}

	public String getM0300E_2() {
		return m0300E_2;
	}

	public String getM0300F_1() {
		return m0300F_1;
	}

	public String getM0300F_2() {
		return m0300F_2;
	}

	public String getM0300G_1() {
		return m0300G_1;
	}

	public String getM0300G_2() {
		return m0300G_2;
	}

	public String getM0610A() {
		return m0610A;
	}

	public String getM0610B() {
		return M0610B;
	}

	public String getM0610C() {
		return M0610C;
	}

	public String getM0700() {
		return m0700;
	}

	public String getM0800A() {
		return m0800A;
	}

	public String getM0800B() {
		return m0800B;
	}

	public String getM0800C() {
		return m0800C;
	}

	public String getM0900A() {
		return m0900A;
	}

	public String getM0900B() {
		return m0900B;
	}

	public String getM0900C() {
		return m0900C;
	}

	public String getM0900D() {
		return m0900D;
	}

	public String getM01030() {
		return m01030;
	}

	public boolean isM01040A() {
		return m01040A;
	}

	public boolean isM01040B() {
		return m01040B;
	}

	public boolean isM01040C() {
		return m01040C;
	}

	public boolean isM01040D() {
		return m01040D;
	}

	public boolean isM01040E() {
		return m01040E;
	}

	public boolean isM01040F() {
		return m01040F;
	}

	public boolean isM01040G() {
		return m01040G;
	}

	public boolean isM01040H() {
		return m01040H;
	}

	public boolean isM01040I() {
		return m01040I;
	}

	public boolean isM01040Z() {
		return m01040Z;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setM0100A(boolean m0100a) {
		m0100A = m0100a;
	}

	public void setM0100B(boolean m0100b) {
		m0100B = m0100b;
	}

	public void setM0100C(boolean m0100c) {
		m0100C = m0100c;
	}

	public void setM0100Z(boolean m0100z) {
		m0100Z = m0100z;
	}

	public String getM0150() {
		return m0150;
	}

	public void setM0150(String m0150) {
		this.m0150 = m0150;
	}

	public void setM0210(String m0210) {
		this.m0210 = m0210;
	}

	public void setM0300A(String m0300a) {
		m0300A = m0300a;
	}

	public void setM0300B_1(String m0300b_1) {
		m0300B_1 = m0300b_1;
	}

	public void setM0300B_2(String m0300b_2) {
		m0300B_2 = m0300b_2;
	}

	public void setM0300B_3(Date m0300b_3) {
		m0300B_3 = m0300b_3;
	}

	public void setM0300C_1(String m0300c_1) {
		m0300C_1 = m0300c_1;
	}

	public void setM0300C_2(String m0300c_2) {
		m0300C_2 = m0300c_2;
	}

	public void setM0300D_1(String m0300d_1) {
		m0300D_1 = m0300d_1;
	}

	public void setM0300D_2(String m0300d_2) {
		m0300D_2 = m0300d_2;
	}

	public void setM0300E_1(String m0300e_1) {
		m0300E_1 = m0300e_1;
	}

	public void setM0300E_2(String m0300e_2) {
		m0300E_2 = m0300e_2;
	}

	public void setM0300F_1(String m0300f_1) {
		m0300F_1 = m0300f_1;
	}

	public void setM0300F_2(String m0300f_2) {
		m0300F_2 = m0300f_2;
	}

	public void setM0300G_1(String m0300g_1) {
		m0300G_1 = m0300g_1;
	}

	public void setM0300G_2(String m0300g_2) {
		m0300G_2 = m0300g_2;
	}

	public void setM0610A(String m0610a) {
		m0610A = m0610a;
	}

	public void setM0610B(String m0610b) {
		M0610B = m0610b;
	}

	public void setM0610C(String m0610c) {
		M0610C = m0610c;
	}

	public void setM0700(String m0700) {
		this.m0700 = m0700;
	}

	public void setM0800A(String m0800a) {
		m0800A = m0800a;
	}

	public void setM0800B(String m0800b) {
		m0800B = m0800b;
	}

	public void setM0800C(String m0800c) {
		m0800C = m0800c;
	}

	public void setM0900A(String m0900a) {
		m0900A = m0900a;
	}

	public void setM0900B(String m0900b) {
		m0900B = m0900b;
	}

	public void setM0900C(String m0900c) {
		m0900C = m0900c;
	}

	public void setM0900D(String m0900d) {
		m0900D = m0900d;
	}

	public void setM01030(String m01030) {
		this.m01030 = m01030;
	}

	public void setM01040A(boolean m01040a) {
		m01040A = m01040a;
	}

	public void setM01040B(boolean m01040b) {
		m01040B = m01040b;
	}

	public void setM01040C(boolean m01040c) {
		m01040C = m01040c;
	}

	public void setM01040D(boolean m01040d) {
		m01040D = m01040d;
	}

	public void setM01040E(boolean m01040e) {
		m01040E = m01040e;
	}

	public void setM01040F(boolean m01040f) {
		m01040F = m01040f;
	}

	public void setM01040G(boolean m01040g) {
		m01040G = m01040g;
	}

	public void setM01040H(boolean m01040h) {
		m01040H = m01040h;
	}

	public void setM01040I(boolean m01040i) {
		m01040I = m01040i;
	}

	public void setM01040Z(boolean m01040z) {
		m01040Z = m01040z;
	}

	public boolean isM1200J() {
		return M1200J;
	}

	public void setM1200J(boolean m1200j) {
		M1200J = m1200j;
	}

	public boolean isM1200I() {
		return M1200I;
	}

	public void setM1200I(boolean m1200i) {
		M1200I = m1200i;
	}

	public boolean isM1200H() {
		return M1200H;
	}

	public void setM1200H(boolean m1200h) {
		M1200H = m1200h;
	}

	public boolean isM1200G() {
		return M1200G;
	}

	public void setM1200G(boolean m1200g) {
		M1200G = m1200g;
	}

	public boolean isM1200F() {
		return M1200F;
	}

	public void setM1200F(boolean m1200f) {
		M1200F = m1200f;
	}

	public boolean isM1200E() {
		return M1200E;
	}

	public void setM1200E(boolean m1200e) {
		M1200E = m1200e;
	}

	public boolean isM1200D() {
		return M1200D;
	}

	public void setM1200D(boolean m1200d) {
		M1200D = m1200d;
	}

	public boolean isM1200C() {
		return M1200C;
	}

	public void setM1200C(boolean m1200c) {
		M1200C = m1200c;
	}

	public boolean isM1200B() {
		return M1200B;
	}

	public void setM1200B(boolean m1200b) {
		M1200B = m1200b;
	}

	public boolean isM1200A() {
		return M1200A;
	}

	public void setM1200A(boolean m1200a) {
		M1200A = m1200a;
	}

	public boolean isM0100D() {
		return M0100D;
	}

	public void setM0100D(boolean m0100d) {
		M0100D = m0100d;
	}

}
