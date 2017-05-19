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

import medrex.commons.vo.masterList.State;

@Entity
@Table(name = "Nurse")
public class Nurse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1980855335191815144L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "nurseTypeSelected")
	private String nurseTypeSelected;
	@Column(name = "emailAddress")
	private String emailAddress;
	@Column(name = "cell")
	private String cell;
	@Column(name = "faxField")
	private String faxField;
	@Column(name = "phone")
	private String phone;

	@OneToOne
	@JoinColumn(name = "state")
	private State state;

	@Column(name = "city")
	private String city;
	@Column(name = "address")
	private String address;
	@Column(name = "nurseSurName")
	private String nurseSurName;
	@Column(name = "nurseType")
	private String nurseType;
	@Column(name = "nurseName")
	private String nurseName;
	@Column(name = "nurseId")
	private String nurseId;
	@Column(name = "zipField")
	private String zipField;

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

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFaxField() {
		return faxField;
	}

	public void setFaxField(String faxField) {
		this.faxField = faxField;
	}

	public String getNurseId() {
		return nurseId;
	}

	public void setNurseId(String nurseId) {
		this.nurseId = nurseId;
	}

	public String getNurseName() {
		return nurseName;
	}

	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}

	public String getNurseSurName() {
		return nurseSurName;
	}

	public void setNurseSurName(String nurseSurName) {
		this.nurseSurName = nurseSurName;
	}

	public String getNurseType() {
		return nurseType;
	}

	public void setNurseType(String nurseType) {
		this.nurseType = nurseType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getZipField() {
		return zipField;
	}

	public void setZipField(String zipField) {
		this.zipField = zipField;
	}

	public String getNurseTypeSelected() {
		return nurseTypeSelected;
	}

	public void setNurseTypeSelected(String nurseTypeSelected) {
		this.nurseTypeSelected = nurseTypeSelected;
	}

}
