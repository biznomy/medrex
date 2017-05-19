package medrex.commons.vo.others;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.swing.ImageIcon;

import medrex.commons.vo.masterList.DoctorTypes;
import medrex.commons.vo.masterList.State;

@Entity
@Table(name = "Doctors")
public class Doctors implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7619420128597906501L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne
	@JoinColumn(name = "state")
	private State state;

	@Column(name = "federalId")
	private String federalId;
	@Column(name = "npi")
	private String npi;
	@Column(name = "emailAddress")
	private String emailAddress;
	@Column(name = "cellNumber")
	private String cellNumber;
	@Column(name = "fax")
	private String fax;
	@Column(name = "phoneNumber")
	private String phoneNumber;
	@Column(name = "city")
	private String city;
	@Column(name = "address")
	private String address;
	@Column(name = "physicianId")
	private String physicianId;
	@Column(name = "physicianSurName")
	private String physicianSurName;

	@OneToOne
	@JoinColumn(name = "doctorType")
	private DoctorTypes doctorType;

	@Column(name = "physicianName")
	private String physicianName;
	@Column(name = "impField")
	private String impField;
	@Column(name = "pinNumber")
	private String pinNumber;
	@Column(name = "zip")
	private String zip;

	@Transient
	private ImageIcon img;

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public DoctorTypes getDoctorType() {
		return doctorType;
	}

	public void setDoctorType(DoctorTypes doctorType) {
		this.doctorType = doctorType;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFederalId() {
		return federalId;
	}

	public void setFederalId(String federalId) {
		this.federalId = federalId;
	}

	public String getImpField() {
		return impField;
	}

	public void setImpField(String impField) {
		this.impField = impField;
	}

	public String getNpi() {
		return npi;
	}

	public void setNpi(String npi) {
		this.npi = npi;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(String physicianId) {
		this.physicianId = physicianId;
	}

	public String getPhysicianName() {
		return physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public String getPhysicianSurName() {
		return physicianSurName;
	}

	public void setPhysicianSurName(String physicianSurName) {
		this.physicianSurName = physicianSurName;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
