package medrex.commons.vo.ptOtSt;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.richTextField.RichTextField;

@Entity
@Table(name = "PtOtStTherapyPhysical")
public class PtOtStTherapyPhysical implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -997831819824935486L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "improvement")
	private int improvement;
	@Column(name = "reCertDcDate")
	private Date reCertDcDate;
	@Column(name = "mdSign")
	private String mdSign;
	@Column(name = "mdName")
	private String mdName;
	@Column(name = "therapySignature")
	private String therapySignature;
	@Column(name = "therapyDate")
	private Date therapyDate;
	@Column(name = "licenseNo")
	private String licenseNo;
	@Column(name = "dischargeDate")
	private Date dischargeDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dischargeRecommend")
	private Notes dischargeRecommend;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reasonForDischarge")
	private Notes reasonForDischarge;

	@Column(name = "dischargeOnly")
	private boolean dischargeOnly;
	@Column(name = "reCertFromDate")
	private Date reCertFromDate;
	@Column(name = "reCertToDate")
	private Date reCertToDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reCertPlanOfCare")
	private Notes reCertPlanOfCare;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reCertOrUpdateLtg")
	private Notes reCertOrUpdateLtg;

	@Column(name = "reCert")
	private boolean reCert;
	@Column(name = "justificationReached")
	private boolean justificationReached;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "justificationToCont")
	private Notes justificationToCont;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "summaryOfPtResp")
	private Notes summaryOfPtResp;

	@Column(name = "progressNoteAndReCert")
	private boolean progressNoteAndReCert;

	@Column(name = "complaintsNone")
	private boolean complaintsNone;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "improvementNoField")
	private Notes improvementNoField;

	@Column(name = "updatedStg05")
	private String updatedStg05;
	@Column(name = "updatedStg04")
	private String updatedStg04;
	@Column(name = "updatedStg03")
	private String updatedStg03;
	@Column(name = "updatedStg02")
	private String updatedStg02;
	@Column(name = "updatedStg01")
	private String updatedStg01;
	@Column(name = "statusTo")
	private Date statusTo;
	@Column(name = "statusFrom")
	private Date statusFrom;
	@Column(name = "statusEnd")
	private Date statusEnd;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "curPeriod01")
	private Notes curPeriod01;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "curPeriod02")
	private Notes curPeriod02;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "curPeriod03")
	private Notes curPeriod03;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "curPeriod04")
	private Notes curPeriod04;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "curPeriod05")
	private Notes curPeriod05;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lastPeriod01")
	private Notes lastPeriod01;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lastPeriod02")
	private Notes lastPeriod02;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lastPeriod03")
	private Notes lastPeriod03;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lastPeriod04")
	private Notes lastPeriod04;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lastPeriod05")
	private Notes lastPeriod05;

	@Column(name = "problem05")
	private String problem05;
	@Column(name = "problem04")
	private String problem04;
	@Column(name = "problem03")
	private String problem03;
	@Column(name = "problem02")
	private String problem02;
	@Column(name = "problem01")
	private String problem01;
	@Column(name = "soc")
	private String soc;
	@Column(name = "dx")
	private String dx;
	@Column(name = "otherField")
	private String otherField;
	@Column(name = "med")
	private int med;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dischargeLoc")
	private RichTextField dischargeLoc;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "complaintsOf")
	private RichTextField complaintsOf;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "precautionsWbs")
	private RichTextField precautionsWbs;

	@Column(name = "hicNo")
	private String hicNo;

	@Column(name = "certificationType")
	private int certificationType;

	@Column(name = "ptOtStTherapy")
	private String ptOtStTherapy;

	public int getImprovement() {
		return this.improvement;
	}

	public void setImprovement(int improvement) {
		this.improvement = improvement;
	}

	public Date getReCertDcDate() {
		return this.reCertDcDate;
	}

	public void setReCertDcDate(Date reCertDcDate) {
		this.reCertDcDate = reCertDcDate;
	}

	public String getMdSign() {
		return this.mdSign;
	}

	public void setMdSign(String mdSign) {
		this.mdSign = mdSign;
	}

	public String getMdName() {
		return this.mdName;
	}

	public void setMdName(String mdName) {
		this.mdName = mdName;
	}

	public String getTherapySignature() {
		return this.therapySignature;
	}

	public Notes getDischargeRecommend() {
		return dischargeRecommend;
	}

	public void setDischargeRecommend(Notes dischargeRecommend) {
		this.dischargeRecommend = dischargeRecommend;
	}

	public Notes getReCertPlanOfCare() {
		return reCertPlanOfCare;
	}

	public void setReCertPlanOfCare(Notes reCertPlanOfCare) {
		this.reCertPlanOfCare = reCertPlanOfCare;
	}

	public Notes getReCertOrUpdateLtg() {
		return reCertOrUpdateLtg;
	}

	public void setReCertOrUpdateLtg(Notes reCertOrUpdateLtg) {
		this.reCertOrUpdateLtg = reCertOrUpdateLtg;
	}

	public Notes getJustificationToCont() {
		return justificationToCont;
	}

	public void setJustificationToCont(Notes justificationToCont) {
		this.justificationToCont = justificationToCont;
	}

	public Notes getSummaryOfPtResp() {
		return summaryOfPtResp;
	}

	public void setSummaryOfPtResp(Notes summaryOfPtResp) {
		this.summaryOfPtResp = summaryOfPtResp;
	}

	public Notes getImprovementNoField() {
		return improvementNoField;
	}

	public void setImprovementNoField(Notes improvementNoField) {
		this.improvementNoField = improvementNoField;
	}

	public Notes getCurPeriod01() {
		return curPeriod01;
	}

	public void setCurPeriod01(Notes curPeriod01) {
		this.curPeriod01 = curPeriod01;
	}

	public Notes getCurPeriod02() {
		return curPeriod02;
	}

	public void setCurPeriod02(Notes curPeriod02) {
		this.curPeriod02 = curPeriod02;
	}

	public Notes getCurPeriod03() {
		return curPeriod03;
	}

	public void setCurPeriod03(Notes curPeriod03) {
		this.curPeriod03 = curPeriod03;
	}

	public Notes getCurPeriod04() {
		return curPeriod04;
	}

	public void setCurPeriod04(Notes curPeriod04) {
		this.curPeriod04 = curPeriod04;
	}

	public Notes getCurPeriod05() {
		return curPeriod05;
	}

	public void setCurPeriod05(Notes curPeriod05) {
		this.curPeriod05 = curPeriod05;
	}

	public Notes getLastPeriod01() {
		return lastPeriod01;
	}

	public void setLastPeriod01(Notes lastPeriod01) {
		this.lastPeriod01 = lastPeriod01;
	}

	public Notes getLastPeriod02() {
		return lastPeriod02;
	}

	public void setLastPeriod02(Notes lastPeriod02) {
		this.lastPeriod02 = lastPeriod02;
	}

	public Notes getLastPeriod03() {
		return lastPeriod03;
	}

	public void setLastPeriod03(Notes lastPeriod03) {
		this.lastPeriod03 = lastPeriod03;
	}

	public Notes getLastPeriod04() {
		return lastPeriod04;
	}

	public void setLastPeriod04(Notes lastPeriod04) {
		this.lastPeriod04 = lastPeriod04;
	}

	public Notes getLastPeriod05() {
		return lastPeriod05;
	}

	public void setLastPeriod05(Notes lastPeriod05) {
		this.lastPeriod05 = lastPeriod05;
	}

	public void setReasonForDischarge(Notes reasonForDischarge) {
		this.reasonForDischarge = reasonForDischarge;
	}

	public void setTherapySignature(String therapySignature) {
		this.therapySignature = therapySignature;
	}

	public Date getTherapyDate() {
		return this.therapyDate;
	}

	public void setTherapyDate(Date therapyDate) {
		this.therapyDate = therapyDate;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public Date getDischargeDate() {
		return this.dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public RichTextField getDischargeLoc() {
		return dischargeLoc;
	}

	public void setDischargeLoc(RichTextField dischargeLoc) {
		this.dischargeLoc = dischargeLoc;
	}

	public Notes getReasonForDischarge() {
		return reasonForDischarge;
	}

	public boolean isDischargeOnly() {
		return this.dischargeOnly;
	}

	public void setDischargeOnly(boolean dischargeOnly) {
		this.dischargeOnly = dischargeOnly;
	}

	public Date getReCertFromDate() {
		return this.reCertFromDate;
	}

	public void setReCertFromDate(Date reCertFromDate) {
		this.reCertFromDate = reCertFromDate;
	}

	public Date getReCertToDate() {
		return this.reCertToDate;
	}

	public void setReCertToDate(Date reCertToDate) {
		this.reCertToDate = reCertToDate;
	}

	public boolean isReCert() {
		return this.reCert;
	}

	public void setReCert(boolean reCert) {
		this.reCert = reCert;
	}

	public boolean isJustificationReached() {
		return this.justificationReached;
	}

	public void setJustificationReached(boolean justificationReached) {
		this.justificationReached = justificationReached;
	}

	public boolean isProgressNoteAndReCert() {
		return this.progressNoteAndReCert;
	}

	public void setProgressNoteAndReCert(boolean progressNoteAndReCert) {
		this.progressNoteAndReCert = progressNoteAndReCert;
	}

	public boolean isComplaintsNone() {
		return this.complaintsNone;
	}

	public void setComplaintsNone(boolean complaintsNone) {
		this.complaintsNone = complaintsNone;
	}

	public String getUpdatedStg05() {
		return this.updatedStg05;
	}

	public void setUpdatedStg05(String updatedStg05) {
		this.updatedStg05 = updatedStg05;
	}

	public String getUpdatedStg04() {
		return this.updatedStg04;
	}

	public void setUpdatedStg04(String updatedStg04) {
		this.updatedStg04 = updatedStg04;
	}

	public String getUpdatedStg03() {
		return this.updatedStg03;
	}

	public void setUpdatedStg03(String updatedStg03) {
		this.updatedStg03 = updatedStg03;
	}

	public String getUpdatedStg02() {
		return this.updatedStg02;
	}

	public void setUpdatedStg02(String updatedStg02) {
		this.updatedStg02 = updatedStg02;
	}

	public String getUpdatedStg01() {
		return this.updatedStg01;
	}

	public void setUpdatedStg01(String updatedStg01) {
		this.updatedStg01 = updatedStg01;
	}

	public Date getStatusTo() {
		return this.statusTo;
	}

	public void setStatusTo(Date statusTo) {
		this.statusTo = statusTo;
	}

	public Date getStatusFrom() {
		return this.statusFrom;
	}

	public void setStatusFrom(Date statusFrom) {
		this.statusFrom = statusFrom;
	}

	public Date getStatusEnd() {
		return this.statusEnd;
	}

	public void setStatusEnd(Date statusEnd) {
		this.statusEnd = statusEnd;
	}

	public String getProblem05() {
		return this.problem05;
	}

	public void setProblem05(String problem05) {
		this.problem05 = problem05;
	}

	public String getProblem04() {
		return this.problem04;
	}

	public void setProblem04(String problem04) {
		this.problem04 = problem04;
	}

	public String getProblem03() {
		return this.problem03;
	}

	public void setProblem03(String problem03) {
		this.problem03 = problem03;
	}

	public String getProblem02() {
		return this.problem02;
	}

	public void setProblem02(String problem02) {
		this.problem02 = problem02;
	}

	public String getProblem01() {
		return this.problem01;
	}

	public void setProblem01(String problem01) {
		this.problem01 = problem01;
	}

	public String getSoc() {
		return this.soc;
	}

	public void setSoc(String soc) {
		this.soc = soc;
	}

	public String getDx() {
		return this.dx;
	}

	public void setDx(String dx) {
		this.dx = dx;
	}

	public String getOtherField() {
		return this.otherField;
	}

	public void setOtherField(String otherField) {
		this.otherField = otherField;
	}

	public int getMed() {
		return med;
	}

	public void setMed(int med) {
		this.med = med;
	}

	public RichTextField getComplaintsOf() {
		return complaintsOf;
	}

	public void setComplaintsOf(RichTextField complaintsOf) {
		this.complaintsOf = complaintsOf;
	}

	public RichTextField getPrecautionsWbs() {
		return precautionsWbs;
	}

	public void setPrecautionsWbs(RichTextField precautionsWbs) {
		this.precautionsWbs = precautionsWbs;
	}

	public String getHicNo() {
		return this.hicNo;
	}

	public void setHicNo(String hicNo) {
		this.hicNo = hicNo;
	}

	public int getCertificationType() {
		return certificationType;
	}

	public void setCertificationType(int certificationType) {
		this.certificationType = certificationType;
	}

	public String getPtOtStTherapy() {
		return this.ptOtStTherapy;
	}

	public void setPtOtStTherapy(String ptOtStTherapy) {
		this.ptOtStTherapy = ptOtStTherapy;
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
