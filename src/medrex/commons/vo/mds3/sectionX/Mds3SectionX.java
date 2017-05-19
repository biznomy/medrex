package medrex.commons.vo.mds3.sectionX;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mds3SectionX")
public class Mds3SectionX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8240686432645096702L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "X0100")
	private String x0100;

	@Column(name = "X0150")
	private String x0150;

	@Column(name = "X0200A")
	private String x0200A;

	@Column(name = "X0200B")
	private String x0200B;

	@Column(name = "X0300")
	private String x0300;

	@Column(name = "X0400")
	private Date x0400;

	@Column(name = "X0500")
	private String x0500;

	@Column(name = "X0600A")
	private String x0600A;

	@Column(name = "X0600B")
	private String x0600B;

	@Column(name = "X0600C")
	private String x0600C;

	@Column(name = "X0600D")
	private String x0600D;

	@Column(name = "X0600F")
	private String x0600F;

	@Column(name = "X0700A")
	private Date x0700A;

	@Column(name = "X0700B")
	private Date x0700B;

	@Column(name = "X0700C")
	private Date x0700C;

	@Column(name = "X0800")
	private String x0800;

	@Column(name = "X0900A")
	private boolean x0900A;

	@Column(name = "X0900B")
	private boolean x0900B;

	@Column(name = "X0900C")
	private boolean x0900C;

	@Column(name = "X0900D")
	private boolean x0900D;

	@Column(name = "X0900Z")
	private boolean x0900Z;

	@Column(name = "X1050A")
	private boolean x1050A;

	@Column(name = "X1050Z")
	private boolean x1050Z;

	@Column(name = "X1100A")
	private String x1100A;

	@Column(name = "X1100B")
	private String x1100B;

	@Column(name = "X1100C")
	private String x1100C;

	@Column(name = "X1100D")
	private String x1100D;

	@Column(name = "X1100E")
	private Date x1100E;

	public int getSerial() {
		return serial;
	}

	public String getX0100() {
		return x0100;
	}

	public String getX0150() {
		return x0150;
	}

	public String getX0200A() {
		return x0200A;
	}

	public String getX0200B() {
		return x0200B;
	}

	public String getX0300() {
		return x0300;
	}

	public Date getX0400() {
		return x0400;
	}

	public String getX0500() {
		return x0500;
	}

	public String getX0600A() {
		return x0600A;
	}

	public String getX0600B() {
		return x0600B;
	}

	public String getX0600C() {
		return x0600C;
	}

	public String getX0600D() {
		return x0600D;
	}

	public String getX0600F() {
		return x0600F;
	}

	public Date getX0700A() {
		return x0700A;
	}

	public Date getX0700B() {
		return x0700B;
	}

	public Date getX0700C() {
		return x0700C;
	}

	public String getX0800() {
		return x0800;
	}

	public boolean isX0900A() {
		return x0900A;
	}

	public boolean isX0900B() {
		return x0900B;
	}

	public boolean isX0900C() {
		return x0900C;
	}

	public boolean isX0900D() {
		return x0900D;
	}

	public boolean isX0900Z() {
		return x0900Z;
	}

	public boolean isX1050A() {
		return x1050A;
	}

	public boolean isX1050Z() {
		return x1050Z;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setX0100(String x0100) {
		this.x0100 = x0100;
	}

	public void setX0150(String x0150) {
		this.x0150 = x0150;
	}

	public void setX0200A(String x0200a) {
		x0200A = x0200a;
	}

	public void setX0200B(String x0200b) {
		x0200B = x0200b;
	}

	public void setX0300(String x0300) {
		this.x0300 = x0300;
	}

	public void setX0400(Date x0400) {
		this.x0400 = x0400;
	}

	public void setX0500(String x0500) {
		this.x0500 = x0500;
	}

	public void setX0600A(String x0600a) {
		x0600A = x0600a;
	}

	public void setX0600B(String x0600b) {
		x0600B = x0600b;
	}

	public void setX0600C(String x0600c) {
		x0600C = x0600c;
	}

	public void setX0600D(String x0600d) {
		x0600D = x0600d;
	}

	public void setX0600F(String x0600f) {
		x0600F = x0600f;
	}

	public void setX0700A(Date x0700a) {
		x0700A = x0700a;
	}

	public void setX0700B(Date x0700b) {
		x0700B = x0700b;
	}

	public void setX0700C(Date x0700c) {
		x0700C = x0700c;
	}

	public void setX0800(String x0800) {
		this.x0800 = x0800;
	}

	public void setX0900A(boolean x0900a) {
		x0900A = x0900a;
	}

	public void setX0900B(boolean x0900b) {
		x0900B = x0900b;
	}

	public void setX0900C(boolean x0900c) {
		x0900C = x0900c;
	}

	public void setX0900D(boolean x0900d) {
		x0900D = x0900d;
	}

	public void setX0900Z(boolean x0900z) {
		x0900Z = x0900z;
	}

	public void setX1050A(boolean x1050a) {
		x1050A = x1050a;
	}

	public void setX1050Z(boolean x1050z) {
		x1050Z = x1050z;
	}

	public String getX1100A() {
		return x1100A;
	}

	public String getX1100B() {
		return x1100B;
	}

	public String getX1100C() {
		return x1100C;
	}

	public String getX1100D() {
		return x1100D;
	}

	public Date getX1100E() {
		return x1100E;
	}

	public void setX1100A(String x1100a) {
		x1100A = x1100a;
	}

	public void setX1100B(String x1100b) {
		x1100B = x1100b;
	}

	public void setX1100C(String x1100c) {
		x1100C = x1100c;
	}

	public void setX1100D(String x1100d) {
		x1100D = x1100d;
	}

	public void setX1100E(Date x1100e) {
		x1100E = x1100e;
	}

}
