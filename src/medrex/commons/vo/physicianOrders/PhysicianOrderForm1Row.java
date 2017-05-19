package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderForm1Row")
public class PhysicianOrderForm1Row implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1145520899145308988L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "physicianOrderForm1Serial")
	private int physicianOrderForm1Serial;
	@Column(name = "physicianOrderForm1RowSerial")
	private int physicianOrderForm1RowSerial;
	@Column(name = "physiciansCurOrders")
	private String physiciansCurOrders;
	@Column(name = "dcDate")
	private Date dcDate;
	@Column(name = "orderDate")
	private Date orderDate;
	@Column(name = "hr05")
	private String hr05;
	@Column(name = "hr04")
	private String hr04;
	@Column(name = "hr03")
	private String hr03;
	@Column(name = "hr02")
	private String hr02;
	@Column(name = "hr01")
	private String hr01;

	public Date getDcDate() {
		return dcDate;
	}

	public void setDcDate(Date dcDate) {
		this.dcDate = dcDate;
	}

	public String getHr01() {
		return hr01;
	}

	public void setHr01(String hr01) {
		this.hr01 = hr01;
	}

	public String getHr02() {
		return hr02;
	}

	public void setHr02(String hr02) {
		this.hr02 = hr02;
	}

	public String getHr03() {
		return hr03;
	}

	public void setHr03(String hr03) {
		this.hr03 = hr03;
	}

	public String getHr04() {
		return hr04;
	}

	public void setHr04(String hr04) {
		this.hr04 = hr04;
	}

	public String getHr05() {
		return hr05;
	}

	public void setHr05(String hr05) {
		this.hr05 = hr05;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getPhysicianOrderForm1RowSerial() {
		return physicianOrderForm1RowSerial;
	}

	public void setPhysicianOrderForm1RowSerial(int physicianOrderForm1RowSerial) {
		this.physicianOrderForm1RowSerial = physicianOrderForm1RowSerial;
	}

	public int getPhysicianOrderForm1Serial() {
		return physicianOrderForm1Serial;
	}

	public void setPhysicianOrderForm1Serial(int physicianOrderForm1Serial) {
		this.physicianOrderForm1Serial = physicianOrderForm1Serial;
	}

	public String getPhysiciansCurOrders() {
		return physiciansCurOrders;
	}

	public void setPhysiciansCurOrders(String physiciansCurOrders) {
		this.physiciansCurOrders = physiciansCurOrders;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
