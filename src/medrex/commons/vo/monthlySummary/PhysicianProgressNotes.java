package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianProgressNotes")
public class PhysicianProgressNotes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8442851258637803502L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "decisionMaker")
	private Date decisionMaker;
	@Column(name = "residentSign")
	private Date residentSign;
	@Column(name = "physicianSig")
	private Date physicianSig;
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "residentDiagnosis1")
	private String residentDiagnosis1;
	@Column(name = "residentDiagnosis2")
	private String residentDiagnosis2;
	@Column(name = "competentResident")
	private boolean competentResident;
	@Column(name = "conditionIrreversible")
	private boolean conditionIrreversible;
	@Column(name = "limitedLife")
	private boolean limitedLife;
	@Column(name = "chronicDebilitatingDisorder")
	private boolean chronicDebilitatingDisorder;
	@Column(name = "advanceDirective")
	private boolean advanceDirective;
	@Column(name = "selectOtherSpecify")
	private boolean selectOtherSpecify;
	@Column(name = "otherSpecify")
	private String otherSpecify;
	@Column(name = "resident")
	private boolean resident;
	@Column(name = "familyResponsibleParty")
	private boolean familyResponsibleParty;
	@Column(name = "nursingStaff")
	private boolean nursingStaff;
	@Column(name = "physician")
	private boolean physician;
	@Column(name = "otherSpecifyDNR")
	private boolean otherSpecifyDNR;
	@Column(name = "otherSpecifyDetail")
	private String otherSpecifyDetail;
	@Column(name = "discussion")
	private String discussion;
	@Column(name = "emphasis")
	private boolean emphasis;
	@Column(name = "notResuscitate")
	private boolean notResuscitate;
	@Column(name = "notDisturbedWithTests")
	private boolean notDisturbedWithTests;
	@Column(name = "additionalOrder")
	private String additionalOrder;
	@Column(name = "notHospitalizeCheckBox")
	private boolean notHospitalizeCheckBox;

	public int getSerial() {
		return serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public int getFormId() {
		return formId;
	}

	public Date getDecisionMaker() {
		return decisionMaker;
	}

	public Date getResidentSign() {
		return residentSign;
	}

	public Date getPhysicianSig() {
		return physicianSig;
	}

	public String getResidentName() {
		return residentName;
	}

	public String getResidentDiagnosis1() {
		return residentDiagnosis1;
	}

	public String getResidentDiagnosis2() {
		return residentDiagnosis2;
	}

	public boolean isCompetentResident() {
		return competentResident;
	}

	public boolean isConditionIrreversible() {
		return conditionIrreversible;
	}

	public boolean isLimitedLife() {
		return limitedLife;
	}

	public boolean isChronicDebilitatingDisorder() {
		return chronicDebilitatingDisorder;
	}

	public boolean isAdvanceDirective() {
		return advanceDirective;
	}

	public boolean isSelectOtherSpecify() {
		return selectOtherSpecify;
	}

	public String getOtherSpecify() {
		return otherSpecify;
	}

	public boolean isResident() {
		return resident;
	}

	public boolean isFamilyResponsibleParty() {
		return familyResponsibleParty;
	}

	public boolean isNursingStaff() {
		return nursingStaff;
	}

	public boolean isPhysician() {
		return physician;
	}

	public boolean isOtherSpecifyDNR() {
		return otherSpecifyDNR;
	}

	public String getOtherSpecifyDetail() {
		return otherSpecifyDetail;
	}

	public String getDiscussion() {
		return discussion;
	}

	public boolean isEmphasis() {
		return emphasis;
	}

	public boolean isNotResuscitate() {
		return notResuscitate;
	}

	public boolean isNotDisturbedWithTests() {
		return notDisturbedWithTests;
	}

	public String getAdditionalOrder() {
		return additionalOrder;
	}

	public boolean isNotHospitalizeCheckBox() {
		return notHospitalizeCheckBox;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public void setDecisionMaker(Date decisionMaker) {
		this.decisionMaker = decisionMaker;
	}

	public void setResidentSign(Date residentSign) {
		this.residentSign = residentSign;
	}

	public void setPhysicianSig(Date physicianSig) {
		this.physicianSig = physicianSig;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public void setResidentDiagnosis1(String residentDiagnosis1) {
		this.residentDiagnosis1 = residentDiagnosis1;
	}

	public void setResidentDiagnosis2(String residentDiagnosis2) {
		this.residentDiagnosis2 = residentDiagnosis2;
	}

	public void setCompetentResident(boolean competentResident) {
		this.competentResident = competentResident;
	}

	public void setConditionIrreversible(boolean conditionIrreversible) {
		this.conditionIrreversible = conditionIrreversible;
	}

	public void setLimitedLife(boolean limitedLife) {
		this.limitedLife = limitedLife;
	}

	public void setChronicDebilitatingDisorder(
			boolean chronicDebilitatingDisorder) {
		this.chronicDebilitatingDisorder = chronicDebilitatingDisorder;
	}

	public void setAdvanceDirective(boolean advanceDirective) {
		this.advanceDirective = advanceDirective;
	}

	public void setSelectOtherSpecify(boolean selectOtherSpecify) {
		this.selectOtherSpecify = selectOtherSpecify;
	}

	public void setOtherSpecify(String otherSpecify) {
		this.otherSpecify = otherSpecify;
	}

	public void setResident(boolean resident) {
		this.resident = resident;
	}

	public void setFamilyResponsibleParty(boolean familyResponsibleParty) {
		this.familyResponsibleParty = familyResponsibleParty;
	}

	public void setNursingStaff(boolean nursingStaff) {
		this.nursingStaff = nursingStaff;
	}

	public void setPhysician(boolean physician) {
		this.physician = physician;
	}

	public void setOtherSpecifyDNR(boolean otherSpecifyDNR) {
		this.otherSpecifyDNR = otherSpecifyDNR;
	}

	public void setOtherSpecifyDetail(String otherSpecifyDetail) {
		this.otherSpecifyDetail = otherSpecifyDetail;
	}

	public void setDiscussion(String discussion) {
		this.discussion = discussion;
	}

	public void setEmphasis(boolean emphasis) {
		this.emphasis = emphasis;
	}

	public void setNotResuscitate(boolean notResuscitate) {
		this.notResuscitate = notResuscitate;
	}

	public void setNotDisturbedWithTests(boolean notDisturbedWithTests) {
		this.notDisturbedWithTests = notDisturbedWithTests;
	}

	public void setAdditionalOrder(String additionalOrder) {
		this.additionalOrder = additionalOrder;
	}

	public void setNotHospitalizeCheckBox(boolean notHospitalizeCheckBox) {
		this.notHospitalizeCheckBox = notHospitalizeCheckBox;
	}

}
