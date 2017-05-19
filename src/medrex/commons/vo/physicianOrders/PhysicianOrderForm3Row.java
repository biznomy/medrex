package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderForm3Row")
public class PhysicianOrderForm3Row implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2113715621015688357L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "physicianOrderForm3Serial")
	private int physicianOrderForm3Serial;
	@Column(name = "physicianOrderForm3RowSerial")
	private int physicianOrderForm3RowSerial;
	@Column(name = "diagnosis")
	private String diagnosis;
	@Column(name = "prnIndicator")
	private String prnIndicator;
	@Column(name = "phyFrequency")
	private String phyFrequency;
	@Column(name = "phyRoute")
	private String phyRoute;
	@Column(name = "phyDosage")
	private String phyDosage;
	@Column(name = "phyMedication")
	private String phyMedication;
	@Column(name = "phyDcDate")
	private Date phyDcDate;
	@Column(name = "phyOrderDate")
	private Date phyOrderDate;
	@Column(name = "phyHr05")
	private String phyHr05;
	@Column(name = "phyHr04")
	private String phyHr04;
	@Column(name = "phyHr03")
	private String phyHr03;
	@Column(name = "phyHr02")
	private String phyHr02;
	@Column(name = "phyHr01")
	private String phyHr01;
	@Column(name = "duplicate")
	private String duplicate;
	@Column(name = "duplicateDc")
	private String duplicateDc;
	@Column(name = "amountA")
	private String amountA;

	public String getDuplicateDc() {
		return duplicateDc;
	}

	public void setDuplicateDc(String duplicateDc) {
		this.duplicateDc = duplicateDc;
	}

	public String getDuplicate() {
		return duplicate;
	}

	public void setDuplicate(String duplicate) {
		this.duplicate = duplicate;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public Date getPhyDcDate() {
		return phyDcDate;
	}

	public void setPhyDcDate(Date phyDcDate) {
		this.phyDcDate = phyDcDate;
	}

	public String getPhyDosage() {
		return phyDosage;
	}

	public void setPhyDosage(String phyDosage) {
		this.phyDosage = phyDosage;
	}

	public String getPhyFrequency() {
		return phyFrequency;
	}

	public void setPhyFrequency(String phyFrequency) {
		this.phyFrequency = phyFrequency;
	}

	public String getPhyHr01() {
		return phyHr01;
	}

	public void setPhyHr01(String phyHr01) {
		this.phyHr01 = phyHr01;
	}

	public String getPhyHr02() {
		return phyHr02;
	}

	public void setPhyHr02(String phyHr02) {
		this.phyHr02 = phyHr02;
	}

	public String getPhyHr03() {
		return phyHr03;
	}

	public void setPhyHr03(String phyHr03) {
		this.phyHr03 = phyHr03;
	}

	public String getPhyHr04() {
		return phyHr04;
	}

	public void setPhyHr04(String phyHr04) {
		this.phyHr04 = phyHr04;
	}

	public String getPhyHr05() {
		return phyHr05;
	}

	public void setPhyHr05(String phyHr05) {
		this.phyHr05 = phyHr05;
	}

	public String getPhyMedication() {
		return phyMedication;
	}

	public void setPhyMedication(String phyMedication) {
		this.phyMedication = phyMedication;
	}

	public Date getPhyOrderDate() {
		return phyOrderDate;
	}

	public void setPhyOrderDate(Date phyOrderDate) {
		this.phyOrderDate = phyOrderDate;
	}

	public String getPhyRoute() {
		return phyRoute;
	}

	public void setPhyRoute(String phyRoute) {
		this.phyRoute = phyRoute;
	}

	public int getPhysicianOrderForm3RowSerial() {
		return physicianOrderForm3RowSerial;
	}

	public void setPhysicianOrderForm3RowSerial(int physicianOrderForm3RowSerial) {
		this.physicianOrderForm3RowSerial = physicianOrderForm3RowSerial;
	}

	public int getPhysicianOrderForm3Serial() {
		return physicianOrderForm3Serial;
	}

	public void setPhysicianOrderForm3Serial(int physicianOrderForm3Serial) {
		this.physicianOrderForm3Serial = physicianOrderForm3Serial;
	}

	public String getPrnIndicator() {
		return prnIndicator;
	}

	public void setPrnIndicator(String prnIndicator) {
		this.prnIndicator = prnIndicator;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getAmountA() {
		return amountA;
	}

	public void setAmountA(String amountA) {
		this.amountA = amountA;
	}

}
