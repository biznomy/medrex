package medrex.commons.vo.resident;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.swing.ImageIcon;

import medrex.commons.vo.masterList.Relation;
import medrex.commons.vo.masterList.Sex;
import medrex.commons.vo.masterList.State;

@Entity
@Table(name = "ResidentContact")
public class ResidentContact implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -127431195550438393L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "residentId")
	private ResidentMain residentId;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "contactId")
	private List<ResidentContactPhone> ResidentContactPhoneList = new ArrayList();

	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;

	@OneToOne
	@JoinColumn(name = "sex")
	private Sex sex;

	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;

	@OneToOne
	@JoinColumn(name = "state")
	private State state;

	@Column(name = "zip")
	private String zip;
	@Column(name = "email")
	private String email;

	@OneToOne
	@JoinColumn(name = "relationship")
	private Relation relationship;

	@Column(name = "power")
	private int power;
	@Column(name = "hcProxy")
	private int hcProxy;
	@Column(name = "emergency")
	private int emergency;
	@Column(name = "responsibleParty")
	private int responsibleParty;
	@Column(name = "notes")
	private String notes;

	@Transient
	private ImageIcon signature;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	@Basic(fetch = FetchType.EAGER)
	public ResidentMain getResidentId() {
		return residentId;
	}

	public void setResidentId(ResidentMain residentId) {
		this.residentId = residentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Relation getRelationship() {
		return relationship;
	}

	public void setRelationship(Relation relationship) {
		this.relationship = relationship;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHcProxy() {
		return hcProxy;
	}

	public void setHcProxy(int hcProxy) {
		this.hcProxy = hcProxy;
	}

	public int getEmergency() {
		return emergency;
	}

	public void setEmergency(int emergency) {
		this.emergency = emergency;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setSignature(ImageIcon signature) {
		this.signature = signature;
	}

	public ImageIcon getSignature() {
		return signature;
	}

	public List<ResidentContactPhone> getResidentContactPhoneList() {
		return ResidentContactPhoneList;
	}

	public void setResidentContactPhoneList(
			List<ResidentContactPhone> residentContactPhoneList) {
		ResidentContactPhoneList = residentContactPhoneList;
	}

	public int getResponsibleParty() {
		return responsibleParty;
	}

	public void setResponsibleParty(int responsibleParty) {
		this.responsibleParty = responsibleParty;
	}

}
