package medrex.commons.vo.historyAndPhysical;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentImmunizationRecord")
public class ResidentImmunizationRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1134766913879523874L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "historyType")
	private int historyType;
	// @Column(name = "annualPPD2Immunization10")
	// private Date annualPPD2Immunization10;
	// @Column(name = "annualPPD2Immunization9")
	// private Date annualPPD2Immunization9;
	// @Column(name = "annualPPD2Immunization8")
	// private Date annualPPD2Immunization8;
	// @Column(name = "annualPPD2Immunization7")
	// private Date annualPPD2Immunization7;
	// @Column(name = "annualPPD2Immunization6")
	// private Date annualPPD2Immunization6;
	// @Column(name = "annualPPD2Immunization5")
	// private Date annualPPD2Immunization5;
	// @Column(name = "annualPPD2Immunization4")
	// private Date annualPPD2Immunization4;
	@Column(name = "annualPPD2Immunization3")
	private Date annualPPD2Immunization3;
	@Column(name = "annualPPD2Immunization2")
	private Date annualPPD2Immunization2;
	@Column(name = "annualPPD2Immunization1")
	private Date annualPPD2Immunization1;
	@Column(name = "tetanus5")
	private Date tetanus5;
	@Column(name = "tetanus4")
	private Date tetanus4;
	@Column(name = "tetanus3")
	private Date tetanus3;
	@Column(name = "tetanus2")
	private Date tetanus2;
	@Column(name = "tetanus1")
	private Date tetanus1;
	@Column(name = "annualPPDImmunization")
	private Date annualPPDImmunization;
	@Column(name = "influenza")
	private String influenza;
	@Column(name = "annualPPD2Size5")
	private String annualPPD2Size5;
	@Column(name = "annualPPD2Skin5")
	private Date annualPPD2Skin5;
	@Column(name = "annualPPD2Size4")
	private String annualPPD2Size4;
	@Column(name = "annualPPD2Skin4")
	private Date annualPPD2Skin4;
	@Column(name = "annualPPD2Size3")
	private String annualPPD2Size3;
	@Column(name = "annualPPD2Skin3")
	private Date annualPPD2Skin3;
	@Column(name = "annualPPD2Size2")
	private String annualPPD2Size2;
	@Column(name = "annualPPD2Skin2")
	private Date annualPPD2Skin2;
	@Column(name = "annualPPD2Size1")
	private String annualPPD2Size1;
	@Column(name = "annualPPD2Skin1")
	private Date annualPPD2Skin1;
	@Column(name = "pneumovax")
	private String pneumovax;
	// @Column(name = "annualPPDSize5")
	// private String annualPPDSize5;
	// @Column(name = "annualPPDSkin5")
	// private Date annualPPDSkin5;
	// @Column(name = "annualPPDSize4")
	// private String annualPPDSize4;
	// @Column(name = "annualPPDSkin4")
	// private Date annualPPDSkin4;
	// @Column(name = "annualPPDSize3")
	// private String annualPPDSize3;
	// @Column(name = "annualPPDSkin3")
	// private Date annualPPDSkin3;
	// @Column(name = "annualPPDSize2")
	// private String annualPPDSize2;
	// @Column(name = "annualPPDSkin2")
	// private Date annualPPDSkin2;
	// @Column(name = "annualPPDSize1")
	// private String annualPPDSize1;
	// @Column(name = "annualPPDSkin1")
	// private Date annualPPDSkin1;
	@Column(name = "size2")
	private String size2;
	@Column(name = "dateRead2")
	private Date dateRead2;
	@Column(name = "dateGiven2")
	private Date dateGiven2;
	@Column(name = "skinTest2")
	private String skinTest2;
	@Column(name = "sizeInit")
	private String sizeInit;
	@Column(name = "dateGivenInit")
	private Date dateGivenInit;
	@Column(name = "dateReadInit")
	private Date dateReadInit;
	@Column(name = "skinTestInit")
	private String skinTestInit;
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "recordDate")
	private Date recordDate;
	@Column(name = "idNo")
	private String idNo;

	@Column(name = "consentOnFileHist")
	private boolean consentOnFileHist;
	@Column(name = "ppv")
	private int ppv;
	@Column(name = "consentOfFile")
	private boolean consentOfFile;
	@Column(name = "influenzaVacine")
	private int influenzaVacine;

	public Date getAnnualPPD2Immunization1() {
		return annualPPD2Immunization1;
	}

	public void setAnnualPPD2Immunization1(Date annualPPD2Immunization1) {
		this.annualPPD2Immunization1 = annualPPD2Immunization1;
	}

	// public Date getAnnualPPD2Immunization10() {
	// return annualPPD2Immunization10;
	// }
	//
	// public void setAnnualPPD2Immunization10(Date annualPPD2Immunization10) {
	// this.annualPPD2Immunization10 = annualPPD2Immunization10;
	// }

	public Date getAnnualPPD2Immunization2() {
		return annualPPD2Immunization2;
	}

	public void setAnnualPPD2Immunization2(Date annualPPD2Immunization2) {
		this.annualPPD2Immunization2 = annualPPD2Immunization2;
	}

	public Date getAnnualPPD2Immunization3() {
		return annualPPD2Immunization3;
	}

	public void setAnnualPPD2Immunization3(Date annualPPD2Immunization3) {
		this.annualPPD2Immunization3 = annualPPD2Immunization3;
	}

	// public Date getAnnualPPD2Immunization4() {
	// return annualPPD2Immunization4;
	// }
	//
	// public void setAnnualPPD2Immunization4(Date annualPPD2Immunization4) {
	// this.annualPPD2Immunization4 = annualPPD2Immunization4;
	// }
	//
	// public Date getAnnualPPD2Immunization5() {
	// return annualPPD2Immunization5;
	// }
	//
	// public void setAnnualPPD2Immunization5(Date annualPPD2Immunization5) {
	// this.annualPPD2Immunization5 = annualPPD2Immunization5;
	// }
	//
	// public Date getAnnualPPD2Immunization6() {
	// return annualPPD2Immunization6;
	// }
	//
	// public void setAnnualPPD2Immunization6(Date annualPPD2Immunization6) {
	// this.annualPPD2Immunization6 = annualPPD2Immunization6;
	// }
	//
	// public Date getAnnualPPD2Immunization7() {
	// return annualPPD2Immunization7;
	// }
	//
	// public void setAnnualPPD2Immunization7(Date annualPPD2Immunization7) {
	// this.annualPPD2Immunization7 = annualPPD2Immunization7;
	// }
	//
	// public Date getAnnualPPD2Immunization8() {
	// return annualPPD2Immunization8;
	// }
	//
	// public void setAnnualPPD2Immunization8(Date annualPPD2Immunization8) {
	// this.annualPPD2Immunization8 = annualPPD2Immunization8;
	// }
	//
	// public Date getAnnualPPD2Immunization9() {
	// return annualPPD2Immunization9;
	// }
	//
	// public void setAnnualPPD2Immunization9(Date annualPPD2Immunization9) {
	// this.annualPPD2Immunization9 = annualPPD2Immunization9;
	// }

	public String getAnnualPPD2Size1() {
		return annualPPD2Size1;
	}

	public void setAnnualPPD2Size1(String annualPPD2Size1) {
		this.annualPPD2Size1 = annualPPD2Size1;
	}

	public String getAnnualPPD2Size2() {
		return annualPPD2Size2;
	}

	public void setAnnualPPD2Size2(String annualPPD2Size2) {
		this.annualPPD2Size2 = annualPPD2Size2;
	}

	public String getAnnualPPD2Size3() {
		return annualPPD2Size3;
	}

	public void setAnnualPPD2Size3(String annualPPD2Size3) {
		this.annualPPD2Size3 = annualPPD2Size3;
	}

	public String getAnnualPPD2Size4() {
		return annualPPD2Size4;
	}

	public void setAnnualPPD2Size4(String annualPPD2Size4) {
		this.annualPPD2Size4 = annualPPD2Size4;
	}

	public String getAnnualPPD2Size5() {
		return annualPPD2Size5;
	}

	public void setAnnualPPD2Size5(String annualPPD2Size5) {
		this.annualPPD2Size5 = annualPPD2Size5;
	}

	public Date getAnnualPPD2Skin1() {
		return annualPPD2Skin1;
	}

	public void setAnnualPPD2Skin1(Date annualPPD2Skin1) {
		this.annualPPD2Skin1 = annualPPD2Skin1;
	}

	public Date getAnnualPPD2Skin2() {
		return annualPPD2Skin2;
	}

	public void setAnnualPPD2Skin2(Date annualPPD2Skin2) {
		this.annualPPD2Skin2 = annualPPD2Skin2;
	}

	public Date getAnnualPPD2Skin3() {
		return annualPPD2Skin3;
	}

	public void setAnnualPPD2Skin3(Date annualPPD2Skin3) {
		this.annualPPD2Skin3 = annualPPD2Skin3;
	}

	public Date getAnnualPPD2Skin4() {
		return annualPPD2Skin4;
	}

	public void setAnnualPPD2Skin4(Date annualPPD2Skin4) {
		this.annualPPD2Skin4 = annualPPD2Skin4;
	}

	public Date getAnnualPPD2Skin5() {
		return annualPPD2Skin5;
	}

	public void setAnnualPPD2Skin5(Date annualPPD2Skin5) {
		this.annualPPD2Skin5 = annualPPD2Skin5;
	}

	public Date getAnnualPPDImmunization() {
		return annualPPDImmunization;
	}

	public void setAnnualPPDImmunization(Date annualPPDImmunization) {
		this.annualPPDImmunization = annualPPDImmunization;
	}

	// public String getAnnualPPDSize1() {
	// return annualPPDSize1;
	// }
	//
	// public void setAnnualPPDSize1(String annualPPDSize1) {
	// this.annualPPDSize1 = annualPPDSize1;
	// }
	//
	// public String getAnnualPPDSize2() {
	// return annualPPDSize2;
	// }
	//
	// public void setAnnualPPDSize2(String annualPPDSize2) {
	// this.annualPPDSize2 = annualPPDSize2;
	// }
	//
	// public String getAnnualPPDSize3() {
	// return annualPPDSize3;
	// }
	//
	// public void setAnnualPPDSize3(String annualPPDSize3) {
	// this.annualPPDSize3 = annualPPDSize3;
	// }
	//
	// public String getAnnualPPDSize4() {
	// return annualPPDSize4;
	// }
	//
	// public void setAnnualPPDSize4(String annualPPDSize4) {
	// this.annualPPDSize4 = annualPPDSize4;
	// }
	//
	// public String getAnnualPPDSize5() {
	// return annualPPDSize5;
	// }
	//
	// public void setAnnualPPDSize5(String annualPPDSize5) {
	// this.annualPPDSize5 = annualPPDSize5;
	// }

	// public Date getAnnualPPDSkin1() {
	// return annualPPDSkin1;
	// }
	//
	// public void setAnnualPPDSkin1(Date annualPPDSkin1) {
	// this.annualPPDSkin1 = annualPPDSkin1;
	// }

	// public Date getAnnualPPDSkin2() {
	// return annualPPDSkin2;
	// }
	//
	// public void setAnnualPPDSkin2(Date annualPPDSkin2) {
	// this.annualPPDSkin2 = annualPPDSkin2;
	// }
	//
	// public Date getAnnualPPDSkin3() {
	// return annualPPDSkin3;
	// }
	//
	// public void setAnnualPPDSkin3(Date annualPPDSkin3) {
	// this.annualPPDSkin3 = annualPPDSkin3;
	// }
	//
	// public Date getAnnualPPDSkin4() {
	// return annualPPDSkin4;
	// }
	//
	// public void setAnnualPPDSkin4(Date annualPPDSkin4) {
	// this.annualPPDSkin4 = annualPPDSkin4;
	// }
	//
	// public Date getAnnualPPDSkin5() {
	// return annualPPDSkin5;
	// }
	//
	// public void setAnnualPPDSkin5(Date annualPPDSkin5) {
	// this.annualPPDSkin5 = annualPPDSkin5;
	// }

	public Date getDateGiven2() {
		return dateGiven2;
	}

	public void setDateGiven2(Date dateGiven2) {
		this.dateGiven2 = dateGiven2;
	}

	public Date getDateGivenInit() {
		return dateGivenInit;
	}

	public void setDateGivenInit(Date dateGivenInit) {
		this.dateGivenInit = dateGivenInit;
	}

	public Date getDateRead2() {
		return dateRead2;
	}

	public void setDateRead2(Date dateRead2) {
		this.dateRead2 = dateRead2;
	}

	public Date getDateReadInit() {
		return dateReadInit;
	}

	public void setDateReadInit(Date dateReadInit) {
		this.dateReadInit = dateReadInit;
	}

	public int getHistoryType() {
		return historyType;
	}

	public void setHistoryType(int historyType) {
		this.historyType = historyType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getInfluenza() {
		return influenza;
	}

	public void setInfluenza(String influenza) {
		this.influenza = influenza;
	}

	public String getPneumovax() {
		return pneumovax;
	}

	public void setPneumovax(String pneumovax) {
		this.pneumovax = pneumovax;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getSize2() {
		return size2;
	}

	public void setSize2(String size2) {
		this.size2 = size2;
	}

	public String getSizeInit() {
		return sizeInit;
	}

	public void setSizeInit(String sizeInit) {
		this.sizeInit = sizeInit;
	}

	public String getSkinTest2() {
		return skinTest2;
	}

	public void setSkinTest2(String skinTest2) {
		this.skinTest2 = skinTest2;
	}

	public String getSkinTestInit() {
		return skinTestInit;
	}

	public void setSkinTestInit(String skinTestInit) {
		this.skinTestInit = skinTestInit;
	}

	public Date getTetanus1() {
		return tetanus1;
	}

	public void setTetanus1(Date tetanus1) {
		this.tetanus1 = tetanus1;
	}

	public Date getTetanus2() {
		return tetanus2;
	}

	public void setTetanus2(Date tetanus2) {
		this.tetanus2 = tetanus2;
	}

	public Date getTetanus3() {
		return tetanus3;
	}

	public void setTetanus3(Date tetanus3) {
		this.tetanus3 = tetanus3;
	}

	public Date getTetanus4() {
		return tetanus4;
	}

	public void setTetanus4(Date tetanus4) {
		this.tetanus4 = tetanus4;
	}

	public Date getTetanus5() {
		return tetanus5;
	}

	public void setTetanus5(Date tetanus5) {
		this.tetanus5 = tetanus5;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public boolean isConsentOnFileHist() {
		return consentOnFileHist;
	}

	public void setConsentOnFileHist(boolean consentOnFileHist) {
		this.consentOnFileHist = consentOnFileHist;
	}

	public int getPpv() {
		return ppv;
	}

	public void setPpv(int ppv) {
		this.ppv = ppv;
	}

	public boolean isConsentOfFile() {
		return consentOfFile;
	}

	public void setConsentOfFile(boolean consentOfFile) {
		this.consentOfFile = consentOfFile;
	}

	public int getInfluenzaVacine() {
		return influenzaVacine;
	}

	public void setInfluenzaVacine(int influenzaVacine) {
		this.influenzaVacine = influenzaVacine;
	}

}