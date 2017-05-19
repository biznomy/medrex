package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InfluenzaConsentForm")
public class InfluenzaConsentForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6775984357787499270L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "formId")
	private int formId;

	@Column(name = "expiryDate")
	private Date expiryDate;

	@Column(name = "dateTimeGiven")
	private Date dateTimeGiven;

	@Column(name = "shiftNurseSignature3")
	private String shiftNurseSignature3;

	@Column(name = "shiftNurseSignature2")
	private String shiftNurseSignature2;

	@Column(name = "shiftNurseSignature1")
	private String shiftNurseSignature1;

	@Column(name = "shiftTemprature3")
	private String shiftTemprature3;

	@Column(name = "shiftTemprature2")
	private String shiftTemprature2;

	@Column(name = "shiftTemprature1")
	private String shiftTemprature1;

	@Column(name = "shiftShift3")
	private String shiftShift3;

	@Column(name = "shiftShift2")
	private String shiftShift2;

	@Column(name = "shiftShift1")
	private String shiftShift1;

	@Column(name = "shiftDate3")
	private Date shiftDate3;

	@Column(name = "shiftDate2")
	private Date shiftDate2;

	@Column(name = "shiftDate1")
	private Date shiftDate1;

	@Column(name = "dateCalled")
	private Date dateCalled;

	@Column(name = "responsiblePartyDate")
	private Date responsiblePartyDate;

	@Column(name = "residentSignatureDate")
	private Date residentSignatureDate;

	@Column(name = "site")
	private String site;

	@Column(name = "lotNo")
	private String lotNo;

	@Column(name = "temprature")
	private String temprature;

	@Column(name = "responseRefused")
	private boolean responseRefused;

	@Column(name = "responseConsent")
	private boolean responseConsent;

	@Column(name = "calledBy")
	private String calledBy;

	@Column(name = "relationship")
	private String relationship;

	@Column(name = "nameParty")
	private String nameParty;

	@Column(name = "signatureWitnessParty")
	private String signatureWitnessParty;

	@Column(name = "signatureWitnessResident")
	private String signatureWitnessResident;

	@Column(name = "signatureParty")
	private String signatureParty;

	@Column(name = "signatureResident")
	private String signatureResident;

	@Column(name = "residentName")
	private String residentName;

	public Date getExpiryDate() {
		return expiryDate;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getResponsiblePartyDate() {
		return responsiblePartyDate;
	}

	public void setResponsiblePartyDate(Date responsiblePartyDate) {
		this.responsiblePartyDate = responsiblePartyDate;
	}

	public Date getResidentSignatureDate() {
		return residentSignatureDate;
	}

	public void setResidentSignatureDate(Date residentSignatureDate) {
		this.residentSignatureDate = residentSignatureDate;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public Date getDateTimeGiven() {
		return this.dateTimeGiven;
	}

	public void setDateTimeGiven(Date dateTimeGiven) {
		this.dateTimeGiven = dateTimeGiven;
	}

	public String getShiftNurseSignature3() {
		return this.shiftNurseSignature3;
	}

	public void setShiftNurseSignature3(String shiftNurseSignature3) {
		this.shiftNurseSignature3 = shiftNurseSignature3;
	}

	public String getShiftNurseSignature2() {
		return this.shiftNurseSignature2;
	}

	public void setShiftNurseSignature2(String shiftNurseSignature2) {
		this.shiftNurseSignature2 = shiftNurseSignature2;
	}

	public String getShiftNurseSignature1() {
		return this.shiftNurseSignature1;
	}

	public void setShiftNurseSignature1(String shiftNurseSignature1) {
		this.shiftNurseSignature1 = shiftNurseSignature1;
	}

	public String getShiftTemprature3() {
		return this.shiftTemprature3;
	}

	public void setShiftTemprature3(String shiftTemprature3) {
		this.shiftTemprature3 = shiftTemprature3;
	}

	public String getShiftTemprature2() {
		return this.shiftTemprature2;
	}

	public void setShiftTemprature2(String shiftTemprature2) {
		this.shiftTemprature2 = shiftTemprature2;
	}

	public String getShiftTemprature1() {
		return this.shiftTemprature1;
	}

	public void setShiftTemprature1(String shiftTemprature1) {
		this.shiftTemprature1 = shiftTemprature1;
	}

	public String getShiftShift3() {
		return this.shiftShift3;
	}

	public void setShiftShift3(String shiftShift3) {
		this.shiftShift3 = shiftShift3;
	}

	public String getShiftShift2() {
		return this.shiftShift2;
	}

	public void setShiftShift2(String shiftShift2) {
		this.shiftShift2 = shiftShift2;
	}

	public String getShiftShift1() {
		return this.shiftShift1;
	}

	public void setShiftShift1(String shiftShift1) {
		this.shiftShift1 = shiftShift1;
	}

	public Date getShiftDate3() {
		return this.shiftDate3;
	}

	public void setShiftDate3(Date shiftDate3) {
		this.shiftDate3 = shiftDate3;
	}

	public Date getShiftDate2() {
		return this.shiftDate2;
	}

	public void setShiftDate2(Date shiftDate2) {
		this.shiftDate2 = shiftDate2;
	}

	public Date getShiftDate1() {
		return this.shiftDate1;
	}

	public void setShiftDate1(Date shiftDate1) {
		this.shiftDate1 = shiftDate1;
	}

	public Date getDateCalled() {
		return this.dateCalled;
	}

	public void setDateCalled(Date dateCalled) {
		this.dateCalled = dateCalled;
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getLotNo() {
		return this.lotNo;
	}

	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}

	public String getTemprature() {
		return this.temprature;
	}

	public void setTemprature(String temprature) {
		this.temprature = temprature;
	}

	public boolean isResponseRefused() {
		return this.responseRefused;
	}

	public void setResponseRefused(boolean responseRefused) {
		this.responseRefused = responseRefused;
	}

	public boolean isResponseConsent() {
		return this.responseConsent;
	}

	public void setResponseConsent(boolean responseConsent) {
		this.responseConsent = responseConsent;
	}

	public String getCalledBy() {
		return this.calledBy;
	}

	public void setCalledBy(String calledBy) {
		this.calledBy = calledBy;
	}

	public String getRelationship() {
		return this.relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getNameParty() {
		return this.nameParty;
	}

	public void setNameParty(String nameParty) {
		this.nameParty = nameParty;
	}

	public String getSignatureWitnessParty() {
		return this.signatureWitnessParty;
	}

	public void setSignatureWitnessParty(String signatureWitnessParty) {
		this.signatureWitnessParty = signatureWitnessParty;
	}

	public String getSignatureWitnessResident() {
		return this.signatureWitnessResident;
	}

	public void setSignatureWitnessResident(String signatureWitnessResident) {
		this.signatureWitnessResident = signatureWitnessResident;
	}

	public String getSignatureParty() {
		return this.signatureParty;
	}

	public void setSignatureParty(String signatureParty) {
		this.signatureParty = signatureParty;
	}

	public String getSignatureResident() {
		return this.signatureResident;
	}

	public void setSignatureResident(String signatureResident) {
		this.signatureResident = signatureResident;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
