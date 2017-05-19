package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MSJN")
public class MSJN implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5745143418922609195L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;
	@Column(name = "residentId")
	int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "date")
	Date date;
	@Column(name = "noResuscitative")
	String noResuscitative;
	@Column(name = "surrogateSignature")
	String surrogateSignature;
	@Column(name = "address")
	String address;
	@Column(name = "physicianName")
	String physicianName;
	@Column(name = "physicianAddress")
	String physicianAddress;
	@Column(name = "phoneCode")
	String phoneCode;
	@Column(name = "phoneNo")
	String phoneNo;
	@Column(name = "medicalFacility")
	String medicalFacility;
	@Column(name = "physicianSignature")
	String physicianSignature;

	public int getSerial() {
		return serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public Date getDate() {
		return date;
	}

	public String getNoResuscitative() {
		return noResuscitative;
	}

	public String getSurrogateSignature() {
		return surrogateSignature;
	}

	public String getAddress() {
		return address;
	}

	public String getPhysicianName() {
		return physicianName;
	}

	public String getPhysicianAddress() {
		return physicianAddress;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getMedicalFacility() {
		return medicalFacility;
	}

	public String getPhysicianSignature() {
		return physicianSignature;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setNoResuscitative(String noResuscitative) {
		this.noResuscitative = noResuscitative;
	}

	public void setSurrogateSignature(String surrogateSignature) {
		this.surrogateSignature = surrogateSignature;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public void setPhysicianAddress(String physicianAddress) {
		this.physicianAddress = physicianAddress;
	}

	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setMedicalFacility(String medicalFacility) {
		this.medicalFacility = medicalFacility;
	}

	public void setPhysicianSignature(String physicianSignature) {
		this.physicianSignature = physicianSignature;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

}
