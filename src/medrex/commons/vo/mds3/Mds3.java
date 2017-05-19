package medrex.commons.vo.mds3;

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

import medrex.commons.vo.mds3.SectionA.Mds3SectionA;
import medrex.commons.vo.mds3.SectionB.Mds3SectionB;
import medrex.commons.vo.mds3.SectionC.Mds3SectionC;
import medrex.commons.vo.mds3.SectionE.Mds3SectionE;
import medrex.commons.vo.mds3.SectionF.Mds3SectionF;
import medrex.commons.vo.mds3.SectionG.Mds3SectionG;
import medrex.commons.vo.mds3.SectionH.Mds3SectionH;
import medrex.commons.vo.mds3.SectionI.Mds3SectionI;
import medrex.commons.vo.mds3.SectionJ.Mds3SectionJ;
import medrex.commons.vo.mds3.sectionD.Mds3SectionD;
import medrex.commons.vo.mds3.sectionK.Mds3SectionK;
import medrex.commons.vo.mds3.sectionL.Mds3SectionL;
import medrex.commons.vo.mds3.sectionM.Mds3SectionM;
import medrex.commons.vo.mds3.sectionN.Mds3SectionN;
import medrex.commons.vo.mds3.sectionO.Mds3SectionO;
import medrex.commons.vo.mds3.sectionP.Mds3SectionP;
import medrex.commons.vo.mds3.sectionQ.Mds3SectionQ;
import medrex.commons.vo.mds3.sectionV.Mds3SectionV;
import medrex.commons.vo.mds3.sectionX.Mds3SectionX;
import medrex.commons.vo.mds3.sectionZ.Mds3SectionZ;

@Entity
@Table(name = "mds3")
public class Mds3 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7273885858064028498L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionA")
	private Mds3SectionA mdsSectionA;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionB")
	private Mds3SectionB mdsSectionB;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionC")
	private Mds3SectionC mdsSectionC;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionD")
	private Mds3SectionD mdsSectionD;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionE")
	private Mds3SectionE mdsSectionE;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionF")
	private Mds3SectionF mdsSectionF;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionG")
	private Mds3SectionG mdsSectionG;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionH")
	private Mds3SectionH mdsSectionH;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionI")
	private Mds3SectionI mdsSectionI;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionJ")
	private Mds3SectionJ mdsSectionJ;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionK")
	private Mds3SectionK mdsSectionK;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionL")
	private Mds3SectionL mdsSectionL;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionM")
	private Mds3SectionM mdsSectionM;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionN")
	private Mds3SectionN mdsSectionN;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionO")
	private Mds3SectionO mdsSectionO;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionP")
	private Mds3SectionP mdsSectionP;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionQ")
	private Mds3SectionQ mdsSectionQ;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionV")
	private Mds3SectionV mdsSectionV;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionX")
	private Mds3SectionX mdsSectionX;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mdsSectionZ")
	private Mds3SectionZ mdsSectionZ;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "residentName")
	private String residentName;

	@Column(name = "identifierName")
	private String identifierName;

	@Column(name = "mdsDate")
	private Date mdsDate;

	@Column(name = "formType")
	private String formType;

	@Column(name = "notes")
	private String notes;

	@Column(name = "user")
	private int user;

	@Column(name = "status")
	private String status;

	@Column(name = "dateCreated")
	private Date dateCreated;

	@Column(name = "lastModified")
	private Date lastModified;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Mds3SectionA getMdsSectionA() {
		return mdsSectionA;
	}

	public void setMdsSectionA(Mds3SectionA mdsSectionA) {
		System.out.println("setting the Mds3Section A");
		this.mdsSectionA = mdsSectionA;
	}

	public Mds3SectionB getMdsSectionB() {
		return mdsSectionB;
	}

	public void setMdsSectionB(Mds3SectionB mdsSectionB) {
		System.out.println("setting the Mds3Section B");
		this.mdsSectionB = mdsSectionB;
	}

	public Mds3SectionC getMdsSectionC() {
		return mdsSectionC;
	}

	public void setMdsSectionC(Mds3SectionC mdsSectionC) {
		System.out.println("setting the Mds3Section C");
		this.mdsSectionC = mdsSectionC;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getFormType() {
		return formType;
	}

	public void setFormType(String formType) {
		this.formType = formType;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getIdentifierName() {
		return identifierName;
	}

	public void setIdentifierName(String identifierName) {
		this.identifierName = identifierName;
	}

	public Date getMdsDate() {
		return mdsDate;
	}

	public void setMdsDate(Date mdsDate) {
		this.mdsDate = mdsDate;
	}

	public Mds3SectionA getSectionA() {
		return mdsSectionA;
	}

	public void setSectionA(Mds3SectionA sectionA) {
		this.mdsSectionA = sectionA;
	}

	public Mds3SectionD getMdsSectionD() {
		return mdsSectionD;
	}

	public void setMdsSectionD(Mds3SectionD mdsSectionD) {
		this.mdsSectionD = mdsSectionD;
	}

	public Mds3SectionE getMdsSectionE() {
		return mdsSectionE;
	}

	public void setMdsSectionE(Mds3SectionE mdsSectionE) {
		this.mdsSectionE = mdsSectionE;
	}

	public Mds3SectionF getMdsSectionF() {
		return mdsSectionF;
	}

	public void setMdsSectionF(Mds3SectionF mdsSectionF) {
		this.mdsSectionF = mdsSectionF;
	}

	public Mds3SectionG getMdsSectionG() {
		return mdsSectionG;
	}

	public void setMdsSectionG(Mds3SectionG mdsSectionG) {
		this.mdsSectionG = mdsSectionG;
	}

	public Mds3SectionO getMdsSectionO() {
		return mdsSectionO;
	}

	public void setMdsSectionO(Mds3SectionO mdsSectionO) {
		this.mdsSectionO = mdsSectionO;
	}

	public Mds3SectionH getMdsSectionH() {
		return mdsSectionH;
	}

	public void setMdsSectionH(Mds3SectionH mdsSectionH) {
		this.mdsSectionH = mdsSectionH;
	}

	public Mds3SectionI getMdsSectionI() {
		return mdsSectionI;
	}

	public void setMdsSectionI(Mds3SectionI mdsSectionI) {
		this.mdsSectionI = mdsSectionI;
	}

	public Mds3SectionJ getMdsSectionJ() {
		return mdsSectionJ;
	}

	public void setMdsSectionJ(Mds3SectionJ mdsSectionJ) {
		this.mdsSectionJ = mdsSectionJ;
	}

	public Mds3SectionK getMdsSectionK() {
		return mdsSectionK;
	}

	public void setMdsSectionK(Mds3SectionK mdsSectionK) {
		this.mdsSectionK = mdsSectionK;
	}

	public Mds3SectionL getMdsSectionL() {
		return mdsSectionL;
	}

	public void setMdsSectionL(Mds3SectionL mdsSectionL) {
		this.mdsSectionL = mdsSectionL;
	}

	public Mds3SectionM getMdsSectionM() {
		return mdsSectionM;
	}

	public void setMdsSectionM(Mds3SectionM mdsSectionM) {
		this.mdsSectionM = mdsSectionM;
	}

	public Mds3SectionN getMdsSectionN() {
		return mdsSectionN;
	}

	public void setMdsSectionN(Mds3SectionN mdsSectionN) {
		this.mdsSectionN = mdsSectionN;
	}

	public Mds3SectionP getMdsSectionP() {
		return mdsSectionP;
	}

	public void setMdsSectionP(Mds3SectionP mdsSectionP) {
		this.mdsSectionP = mdsSectionP;
	}

	public Mds3SectionQ getMdsSectionQ() {
		return mdsSectionQ;
	}

	public void setMdsSectionQ(Mds3SectionQ mdsSectionQ) {
		this.mdsSectionQ = mdsSectionQ;
	}

	public Mds3SectionV getMdsSectionV() {
		return mdsSectionV;
	}

	public void setMdsSectionV(Mds3SectionV mdsSectionV) {
		this.mdsSectionV = mdsSectionV;
	}

	public Mds3SectionZ getMdsSectionZ() {
		return mdsSectionZ;
	}

	public Mds3SectionX getMdsSectionX() {
		return mdsSectionX;
	}

	public void setMdsSectionX(Mds3SectionX mdsSectionX) {
		this.mdsSectionX = mdsSectionX;
	}

	public void setMdsSectionZ(Mds3SectionZ mdsSectionZ) {
		this.mdsSectionZ = mdsSectionZ;
	}

}
