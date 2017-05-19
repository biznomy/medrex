package medrex.commons.vo.resident;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.swing.ImageIcon;

import medrex.commons.vo.masterList.Citizen;
import medrex.commons.vo.masterList.County;
import medrex.commons.vo.masterList.Insurance;
import medrex.commons.vo.masterList.Language;
import medrex.commons.vo.masterList.MaritalStatus;
import medrex.commons.vo.masterList.Origin;
import medrex.commons.vo.masterList.Religion;
import medrex.commons.vo.masterList.Sex;
import medrex.commons.vo.masterList.State;
import medrex.commons.vo.masterList.Status;

import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.Type;

@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate = false, dynamicInsert = true, dynamicUpdate = true, optimisticLock = OptimisticLockType.VERSION)
@Table(name = "ResidentMain")
public class ResidentMain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8519760551966461057L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	// @Column(name = "floorType")
	// private String floorType;
	@Column(name = "userName")
	private String userName;
	@Column(name = "userPass")
	private String userPass;

	@Column(name = "admittedOn")
	private Date admittedOn;

	@OneToOne
	@JoinColumn(name = "type")
	private Status type;

	@OneToOne
	@JoinColumn(name = "sex")
	private Sex sex;
	@Column(name = "nickName")
	private String nickName;

	@OneToOne
	@JoinColumn(name = "maritalStatus")
	private MaritalStatus maritalStatus;

	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;

	@OneToOne
	@JoinColumn(name = "state")
	private State state;

	@Column(name = "zip")
	private String zip;
	@Column(name = "home")
	private String home;
	@Column(name = "work")
	private String work;
	@Column(name = "cell")
	private String cell;
	@Column(name = "ss1")
	private String ss1;
	@Column(name = "ss2")
	private String ss2;
	@Column(name = "ss3")
	private String ss3;
	@Column(name = "birthPlace")
	private String birthPlace;

	@OneToOne
	@JoinColumn(name = "insurance")
	private Insurance insurance;

	@OneToOne
	@JoinColumn(name = "insuranceSec")
	private Insurance insuranceSec;

	@OneToOne
	@JoinColumn(name = "citizen")
	private Citizen citizen;

	// @Column(name = "room")
	// private String room;

	@OneToOne
	@JoinColumn(name = "religion")
	private Religion religion;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "eff_dte")
	private Date eff_dte;

	@Column(name = "insuranceNum")
	private String insuranceNum;
	@Column(name = "medicalRecordNum")
	private String medicalRecordNum;
	@Column(name = "medicareNum")
	private String medicareNum;
	@Column(name = "medicaidNum")
	private String medicaidNum;
	@Column(name = "secondaryIns")
	private String secondaryIns;
	@Column(name = "secondaryInsId")
	private String secondaryInsId;
	@Column(name = "originalAdmitDate")
	private Date originalAdmitDate;
	@Column(name = "currentAdmitDate")
	private Date currentAdmitDate;

	@OneToOne
	@JoinColumn(name = "county")
	private County county;

	@Column(name = "dischargeDate")
	private Date dischargeDate;
	@Column(name = "mcIns")
	private int mcIns;
	@Column(name = "va")
	private int va;
	@Column(name = "servedinarmy")
	private int servedInArmy;
	@Column(name = "additionalInfo")
	private String additionalInfo;

	@Column(name = "oldroom")
	private String oldroom;

	@Column(name = "isPrivate")
	private boolean isPrivate;
	@Column(name = "insuranceCount")
	private int insuranceCount;
	@Column(name = "partA")
	private boolean partA;
	@Column(name = "partB")
	private boolean partB;

	@OneToOne
	@JoinColumn(name = "language")
	private Language language;

	@OneToOne
	@JoinColumn(name = "origin")
	private Origin origin;

	/*
	 * @OneToMany(fetch=FetchType.EAGER)
	 * 
	 * @JoinColumn(name="residentId") private List<ResidentPayer> residentPayer
	 * = new ArrayList();
	 * 
	 * public List<ResidentPayer> getResidentPayer() { return residentPayer; }
	 * 
	 * public void setResidentPayer(List<ResidentPayer> residentPayer) {
	 * this.residentPayer = residentPayer; }
	 */

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "residentId")
	private List<ResidentPayerNew> residentPayerNew = new ArrayList();

	public List<ResidentPayerNew> getResidentPayerNew() {
		return residentPayerNew;
	}

	public void setResidentPayerNew(List<ResidentPayerNew> residentPayerNew) {
		this.residentPayerNew = residentPayerNew;
	}

	public int getServedInArmy() {
		return servedInArmy;
	}

	public void setServedInArmy(int servedInArmy) {
		this.servedInArmy = servedInArmy;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	// @Version
	@Column(name = "OPTLOCK")
	private long version;

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	@Column(name = "outOfPassCount")
	private int outOfPassCount;

	@Column(name = "outOfPassTimestamp")
	@Type(type = "timestamp")
	private Date outOfPassTimestamp;

	@Transient
	private ImageIcon img;

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	// public String getFloorType() {
	// return floorType;
	// }
	//
	// public void setFloorType(String floorType) {
	// this.floorType = floorType;
	// }

	public String getInsuranceNum() {
		return insuranceNum;
	}

	public void setInsuranceNum(String insuranceNum) {
		this.insuranceNum = insuranceNum;
	}

	public String getMedicalRecordNum() {
		return medicalRecordNum;
	}

	public void setMedicalRecordNum(String medicalRecordNum) {
		this.medicalRecordNum = medicalRecordNum;
	}

	public String getMedicareNum() {
		return medicareNum;
	}

	public void setMedicareNum(String medicareNum) {
		this.medicareNum = medicareNum;
	}

	public String getMedicaidNum() {
		return medicaidNum;
	}

	public void setMedicaidNum(String medicaidNum) {
		this.medicaidNum = medicaidNum;
	}

	public String getSecondaryIns() {
		return secondaryIns;
	}

	public void setSecondaryIns(String secondaryIns) {
		this.secondaryIns = secondaryIns;
	}

	public String getSecondaryInsId() {
		return secondaryInsId;
	}

	public void setSecondaryInsId(String secondaryInsId) {
		this.secondaryInsId = secondaryInsId;
	}

	public Date getOriginalAdmitDate() {
		return originalAdmitDate;
	}

	public void setOriginalAdmitDate(Date originalAdmitDate) {
		this.originalAdmitDate = originalAdmitDate;
	}

	public Date getCurrentAdmitDate() {
		return currentAdmitDate;
	}

	public void setCurrentAdmitDate(Date currentAdmitDate) {
		this.currentAdmitDate = currentAdmitDate;
	}

	public County getCounty() {
		return county;
	}

	public void setCounty(County county) {
		this.county = county;
	}

	public Date getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public int getMcIns() {
		return mcIns;
	}

	public void setMcIns(int mcIns) {
		this.mcIns = mcIns;
	}

	public int getVa() {
		return va;
	}

	public void setVa(int va) {
		this.va = va;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
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

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getSs1() {
		return ss1;
	}

	public void setSs1(String ss1) {
		this.ss1 = ss1;
	}

	public String getSs2() {
		return ss2;
	}

	public void setSs2(String ss2) {
		this.ss2 = ss2;
	}

	public String getSs3() {
		return ss3;
	}

	public void setSs3(String ss3) {
		this.ss3 = ss3;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	// public String getRoom() {
	// return room;
	// }
	//
	// public void setRoom(String room) {
	// this.room = room;
	// }

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public String getOldroom() {
		return oldroom;
	}

	public void setOldroom(String oldroom) {
		this.oldroom = oldroom;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Status getType() {
		return type;
	}

	public Date getEff_dte() {
		return eff_dte;
	}

	public void setEff_dte(Date eff_dte) {
		this.eff_dte = eff_dte;
	}

	public void setType(Status type) {
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	/**
	 * @return the outOfPassCount
	 */
	public int getOutOfPassCount() {
		return outOfPassCount;
	}

	/**
	 * @param outOfPassCount
	 *            the outOfPassCount to set
	 */
	public void setOutOfPassCount(int outOfPassCount) {
		this.outOfPassCount = outOfPassCount;
	}

	/**
	 * @return the outOfPassTimestamp
	 */
	public Date getOutOfPassTimestamp() {
		return outOfPassTimestamp;
	}

	/**
	 * @param outOfPassTimestamp
	 *            the outOfPassTimestamp to set
	 */
	public void setOutOfPassTimestamp(Date outOfPassTimestamp) {
		this.outOfPassTimestamp = outOfPassTimestamp;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof ResidentMain) {
			ResidentMain resi = (ResidentMain) obj;
			if (this.getSerial() == resi.getSerial()) {
				return true;
			} else {
				return false;
			}
		} else {
			return super.equals(obj);
		}
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Insurance getInsuranceSec() {
		return insuranceSec;
	}

	public void setInsuranceSec(Insurance insuranceSec) {
		this.insuranceSec = insuranceSec;
	}

	public int getInsuranceCount() {
		return insuranceCount;
	}

	public void setInsuranceCount(int insuranceCount) {
		this.insuranceCount = insuranceCount;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public boolean isPartA() {
		return partA;
	}

	public void setPartA(boolean partA) {
		this.partA = partA;
	}

	public boolean isPartB() {
		return partB;
	}

	public void setPartB(boolean partB) {
		this.partB = partB;
	}

	public Date getAdmittedOn() {
		return admittedOn;
	}

	public void setAdmittedOn(Date admittedOn) {
		this.admittedOn = admittedOn;
	}

}
