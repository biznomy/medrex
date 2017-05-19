package medrex.commons.vo.admin;

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
@Table(name = "NursingHome")
public class NursingHome implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8119745460626614761L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "name")
	private String name;

	@Column(name = "npi")
	private String npi;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@OneToOne
	@JoinColumn(name = "state")
	private State state;

	@Column(name = "zip")
	private String zip;

	@Column(name = "phone")
	private String phone;

	@Column(name = "fax")
	private String fax;

	@Column(name = "email")
	private String email;

	@Column(name = "website")
	private String website;

	@Column(name = "ein")
	private String ein;

	@Column(name = "medicare")
	private String medicare;

	@Column(name = "medicade")
	private String medicade;
	
	@Column(name = "facility")
	private String facility;

	@Transient
	private ImageIcon img;
	
	

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNpi() {
		return npi;
	}

	public void setNpi(String npi) {
		this.npi = npi;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEin() {
		return ein;
	}

	public void setEin(String ein) {
		this.ein = ein;
	}

	public String getMedicare() {
		return medicare;
	}

	public void setMedicare(String medicare) {
		this.medicare = medicare;
	}

	public String getMedicade() {
		return medicade;
	}

	public void setMedicade(String medicade) {
		this.medicade = medicade;
	}

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

}
