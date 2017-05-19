package medrex.commons.vo.labSpecial;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MadexForm1")
public class MadexForm1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4291920199594961649L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "chestAndThoraxRibsUniCRL")
	private boolean chestAndThoraxRibsUniCRL;
	@Column(name = "chestAndThoraxRibsUnilL")
	private boolean chestAndThoraxRibsUnilL;
	@Column(name = "chestAndThoraxRibsUnilR")
	private boolean chestAndThoraxRibsUnilR;
	@Column(name = "lowerToeL")
	private boolean lowerToeL;
	@Column(name = "lowerHeelL")
	private boolean lowerHeelL;
	@Column(name = "lowerFootL")
	private boolean lowerFootL;
	@Column(name = "lowerAnkleL")
	private boolean lowerAnkleL;
	@Column(name = "lowerTibiaL")
	private boolean lowerTibiaL;
	@Column(name = "lowerKneeCompL")
	private boolean lowerKneeCompL;
	@Column(name = "lowerKneeL")
	private boolean lowerKneeL;
	@Column(name = "lowerFemurL")
	private boolean lowerFemurL;
	@Column(name = "lowerHipL")
	private boolean lowerHipL;
	@Column(name = "upperFingerL")
	private boolean upperFingerL;
	@Column(name = "upperHandL")
	private boolean upperHandL;
	@Column(name = "upperWristL")
	private boolean upperWristL;
	@Column(name = "upperElbowL")
	private boolean upperElbowL;
	@Column(name = "upperForearmL")
	private boolean upperForearmL;
	@Column(name = "upperHumerusL")
	private boolean upperHumerusL;
	@Column(name = "upperScapulaL")
	private boolean upperScapulaL;
	@Column(name = "upperClavicleL")
	private boolean upperClavicleL;
	@Column(name = "upperShoulderL")
	private boolean upperShoulderL;
	@Column(name = "radiologistCode")
	private String radiologistCode;
	@Column(name = "noOfViews")
	private String noOfViews;
	@Column(name = "noPTSeen")
	private String noPTSeen;
	@Column(name = "tech")
	private String tech;
	@Column(name = "dateDone")
	private Date dateDone;
	@Column(name = "time")
	private String time;
	@Column(name = "technicalComments")
	private String technicalComments;
	@Column(name = "headOther")
	private String headOther;
	@Column(name = "dateReceive")
	private Date dateReceive;
	@Column(name = "dateOrder")
	private Date dateOrder;
	@Column(name = "nurse")
	private String nurse;
	@Column(name = "requestPhysician")
	private String requestPhysician;
	@Column(name = "clinicalHistory")
	private String clinicalHistory;
	@Column(name = "hypoMineral")
	private boolean hypoMineral;
	@Column(name = "hypoMalabsorption")
	private boolean hypoMalabsorption;
	@Column(name = "hypoCongenital")
	private boolean hypoCongenital;
	@Column(name = "neoplasmNutritional")
	private boolean neoplasmNutritional;
	@Column(name = "neoplasmBrain")
	private boolean neoplasmBrain;
	@Column(name = "neoplasmKidney")
	private boolean neoplasmKidney;
	@Column(name = "renalVitamin")
	private boolean renalVitamin;
	@Column(name = "renalTesticular")
	private boolean renalTesticular;
	@Column(name = "renalRickets")
	private boolean renalRickets;
	@Column(name = "renalRheumatoid")
	private boolean renalRheumatoid;
	@Column(name = "renalOsteoDystrophy")
	private boolean renalOsteoDystrophy;
	@Column(name = "renalNeptirogenic")
	private boolean renalNeptirogenic;
	@Column(name = "renalImpaired")
	private boolean renalImpaired;
	@Column(name = "renalChronic")
	private boolean renalChronic;
	@Column(name = "fracturePathologicFxUnspecified")
	private boolean fracturePathologicFxUnspecified;
	@Column(name = "fracturePathologicFxDistal")
	private boolean fracturePathologicFxDistal;
	@Column(name = "fracturePathologicFx")
	private boolean fracturePathologicFx;
	@Column(name = "fractureICD")
	private boolean fractureICD;
	@Column(name = "alcohalDiabetic")
	private boolean alcohalDiabetic;
	@Column(name = "alcohalAnorexia")
	private boolean alcohalAnorexia;
	@Column(name = "alcohalCirrhosis")
	private boolean alcohalCirrhosis;
	@Column(name = "alcohalAddiction")
	private boolean alcohalAddiction;
	@Column(name = "alcohalAbuse")
	private boolean alcohalAbuse;
	@Column(name = "headOtherICD")
	private boolean headOtherICD;
	@Column(name = "headBruise")
	private boolean headBruise;
	@Column(name = "headPain")
	private boolean headPain;
	@Column(name = "headConcussion")
	private boolean headConcussion;
	@Column(name = "abdomenHematuria")
	private boolean abdomenHematuria;
	@Column(name = "abdomenDist")
	private boolean abdomenDist;
	@Column(name = "skeletalSwellingOther")
	private boolean skeletalSwellingOther;
	@Column(name = "skeletalHealing")
	private boolean skeletalHealing;
	@Column(name = "skeletalSwellingExt")
	private boolean skeletalSwellingExt;
	@Column(name = "skeletalPainMultiple")
	private boolean skeletalPainMultiple;
	@Column(name = "skeletalPainRibs")
	private boolean skeletalPainRibs;
	@Column(name = "skeletalPainExt")
	private boolean skeletalPainExt;
	@Column(name = "skeletalBruiseLower")
	private boolean skeletalBruiseLower;
	@Column(name = "skeletalBruiseUpper")
	private boolean skeletalBruiseUpper;
	@Column(name = "osteoSenile")
	private boolean osteoSenile;
	@Column(name = "osteoOvarian")
	private boolean osteoOvarian;
	@Column(name = "osteoOsteo")
	private boolean osteoOsteo;
	@Column(name = "osteoDrug")
	private boolean osteoDrug;
	@Column(name = "osteoDisUse")
	private boolean osteoDisUse;
	@Column(name = "abdomenOther")
	private boolean abdomenOther;
	@Column(name = "abdomenPersistent")
	private boolean abdomenPersistent;
	@Column(name = "abdomenFeeding")
	private boolean abdomenFeeding;
	@Column(name = "abdomenPain")
	private boolean abdomenPain;
	@Column(name = "abdomenDiarrhea")
	private boolean abdomenDiarrhea;
	@Column(name = "abdomenNausea")
	private boolean abdomenNausea;
	@Column(name = "chestOther")
	private boolean chestOther;
	@Column(name = "chestRespiratoryFailure")
	private boolean chestRespiratoryFailure;
	@Column(name = "chestTuberculosis")
	private boolean chestTuberculosis;
	@Column(name = "chestPneumothorax")
	private boolean chestPneumothorax;
	@Column(name = "chestPneumonia")
	private boolean chestPneumonia;
	@Column(name = "chestPain")
	private boolean chestPain;
	@Column(name = "chestInfiltrate")
	private boolean chestInfiltrate;
	@Column(name = "chestRales")
	private boolean chestRales;
	@Column(name = "chestShort")
	private boolean chestShort;
	@Column(name = "chestWheezing")
	private boolean chestWheezing;
	@Column(name = "chestPost")
	private boolean chestPost;
	@Column(name = "chestTemp")
	private boolean chestTemp;
	@Column(name = "chestCardiomegaly")
	private boolean chestCardiomegaly;
	@Column(name = "chestCongestion")
	private boolean chestCongestion;
	@Column(name = "chestCOPD")
	private boolean chestCOPD;
	@Column(name = "chestCough")
	private boolean chestCough;
	@Column(name = "chestCHF")
	private boolean chestCHF;
	@Column(name = "chestAtelectasis")
	private boolean chestAtelectasis;
	@Column(name = "chargeNurse")
	private String chargeNurse;
	@Column(name = "st")
	private boolean st;
	@Column(name = "ot")
	private boolean ot;
	@Column(name = "authorizedSign")
	private String authorizedSign;
	@Column(name = "xrayNo")
	private boolean xrayNo;
	@Column(name = "xrayYes")
	private boolean xrayYes;
	@Column(name = "boneWeight")
	private String boneWeight;
	@Column(name = "boneHeight")
	private String boneHeight;
	@Column(name = "bone")
	private boolean bone;
	@Column(name = "lowerToeR")
	private boolean lowerToeR;
	@Column(name = "lowerHeelR")
	private boolean lowerHeelR;
	@Column(name = "lowerFootR")
	private boolean lowerFootR;
	@Column(name = "spinalSacrum")
	private boolean spinalSacrum;
	@Column(name = "spinalPelvis")
	private boolean spinalPelvis;
	@Column(name = "spinalPelvisComp")
	private boolean spinalPelvisComp;
	@Column(name = "upperFingerR")
	private boolean upperFingerR;
	@Column(name = "upperHandR")
	private boolean upperHandR;
	@Column(name = "abdomenAcute")
	private boolean abdomenAcute;
	@Column(name = "abdomenKUB")
	private boolean abdomenKUB;
	@Column(name = "lowerAnkleR")
	private boolean lowerAnkleR;
	@Column(name = "lowerTibiaR")
	private boolean lowerTibiaR;
	@Column(name = "lowerKneeCompR")
	private boolean lowerKneeCompR;
	@Column(name = "lowerKneeR")
	private boolean lowerKneeR;
	@Column(name = "lowerFemurR")
	private boolean lowerFemurR;
	@Column(name = "lowerHipBilat")
	private boolean lowerHipBilat;
	@Column(name = "lowerHipR")
	private boolean lowerHipR;
	@Column(name = "spinalThoracic")
	private boolean spinalThoracic;
	@Column(name = "spinalCervical")
	private boolean spinalCervical;
	@Column(name = "spinalLumbosacral")
	private boolean spinalLumbosacral;
	@Column(name = "upperWristR")
	private boolean upperWristR;
	@Column(name = "upperElbowR")
	private boolean upperElbowR;
	@Column(name = "upperForearmR")
	private boolean upperForearmR;
	@Column(name = "upperHumerusR")
	private boolean upperHumerusR;
	@Column(name = "upperScapulaR")
	private boolean upperScapulaR;
	@Column(name = "upperClavicleR")
	private boolean upperClavicleR;
	@Column(name = "upperShoulderR")
	private boolean upperShoulderR;
	@Column(name = "headOrbits")
	private boolean headOrbits;
	@Column(name = "headSinuses")
	private boolean headSinuses;
	@Column(name = "headMandible")
	private boolean headMandible;
	@Column(name = "headFBSinuses")
	private boolean headFBSinuses;
	@Column(name = "headFBNasal")
	private boolean headFBNasal;
	@Column(name = "headSkull")
	private boolean headSkull;
	@Column(name = "chestAndThoraxRibsB")
	private boolean chestAndThoraxRibsB;
	@Column(name = "chestAndThoraxRibsUniCRR")
	private boolean chestAndThoraxRibsUniCRR;
	@Column(name = "chestAndThoraxDecub")
	private boolean chestAndThoraxDecub;
	@Column(name = "chestAndThoraxChestAPAL")
	private boolean chestAndThoraxChestAPAL;
	@Column(name = "chestAndThoraxChestAPL")
	private boolean chestAndThoraxChestAPL;
	@Column(name = "chestAndThoraxChest")
	private boolean chestAndThoraxChest;
	@Column(name = "caseField")
	private String caseField;
	@Column(name = "preApproval")
	private String preApproval;
	@Column(name = "insurance")
	private String insurance;
	@Column(name = "medicaidNo")
	private String medicaidNo;
	@Column(name = "rmNo")
	private String rmNo;
	@Column(name = "birth")
	private Date birth;
	@Column(name = "medicareNo")
	private String medicareNo;
	@Column(name = "medicareB")
	private boolean medicareB;
	@Column(name = "medicareA")
	private boolean medicareA;
	@Column(name = "female")
	private boolean female;
	@Column(name = "male")
	private boolean male;
	@Column(name = "patient")
	private String patient;
	@Column(name = "facility")
	private String facility;

	public boolean isAbdomenAcute() {
		return abdomenAcute;
	}

	public void setAbdomenAcute(boolean abdomenAcute) {
		this.abdomenAcute = abdomenAcute;
	}

	public boolean isAbdomenDiarrhea() {
		return abdomenDiarrhea;
	}

	public void setAbdomenDiarrhea(boolean abdomenDiarrhea) {
		this.abdomenDiarrhea = abdomenDiarrhea;
	}

	public boolean isAbdomenDist() {
		return abdomenDist;
	}

	public void setAbdomenDist(boolean abdomenDist) {
		this.abdomenDist = abdomenDist;
	}

	public boolean isAbdomenFeeding() {
		return abdomenFeeding;
	}

	public void setAbdomenFeeding(boolean abdomenFeeding) {
		this.abdomenFeeding = abdomenFeeding;
	}

	public boolean isAbdomenHematuria() {
		return abdomenHematuria;
	}

	public void setAbdomenHematuria(boolean abdomenHematuria) {
		this.abdomenHematuria = abdomenHematuria;
	}

	public boolean isAbdomenKUB() {
		return abdomenKUB;
	}

	public void setAbdomenKUB(boolean abdomenKUB) {
		this.abdomenKUB = abdomenKUB;
	}

	public boolean isAbdomenNausea() {
		return abdomenNausea;
	}

	public void setAbdomenNausea(boolean abdomenNausea) {
		this.abdomenNausea = abdomenNausea;
	}

	public boolean isAbdomenOther() {
		return abdomenOther;
	}

	public void setAbdomenOther(boolean abdomenOther) {
		this.abdomenOther = abdomenOther;
	}

	public boolean isAbdomenPain() {
		return abdomenPain;
	}

	public void setAbdomenPain(boolean abdomenPain) {
		this.abdomenPain = abdomenPain;
	}

	public boolean isAbdomenPersistent() {
		return abdomenPersistent;
	}

	public void setAbdomenPersistent(boolean abdomenPersistent) {
		this.abdomenPersistent = abdomenPersistent;
	}

	public boolean isAlcohalAbuse() {
		return alcohalAbuse;
	}

	public void setAlcohalAbuse(boolean alcohalAbuse) {
		this.alcohalAbuse = alcohalAbuse;
	}

	public boolean isAlcohalAddiction() {
		return alcohalAddiction;
	}

	public void setAlcohalAddiction(boolean alcohalAddiction) {
		this.alcohalAddiction = alcohalAddiction;
	}

	public boolean isAlcohalAnorexia() {
		return alcohalAnorexia;
	}

	public void setAlcohalAnorexia(boolean alcohalAnorexia) {
		this.alcohalAnorexia = alcohalAnorexia;
	}

	public boolean isAlcohalCirrhosis() {
		return alcohalCirrhosis;
	}

	public void setAlcohalCirrhosis(boolean alcohalCirrhosis) {
		this.alcohalCirrhosis = alcohalCirrhosis;
	}

	public boolean isAlcohalDiabetic() {
		return alcohalDiabetic;
	}

	public void setAlcohalDiabetic(boolean alcohalDiabetic) {
		this.alcohalDiabetic = alcohalDiabetic;
	}

	public String getAuthorizedSign() {
		return authorizedSign;
	}

	public void setAuthorizedSign(String authorizedSign) {
		this.authorizedSign = authorizedSign;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public boolean isBone() {
		return bone;
	}

	public void setBone(boolean bone) {
		this.bone = bone;
	}

	public String getBoneHeight() {
		return boneHeight;
	}

	public void setBoneHeight(String boneHeight) {
		this.boneHeight = boneHeight;
	}

	public String getBoneWeight() {
		return boneWeight;
	}

	public void setBoneWeight(String boneWeight) {
		this.boneWeight = boneWeight;
	}

	public String getCaseField() {
		return caseField;
	}

	public void setCaseField(String caseField) {
		this.caseField = caseField;
	}

	public String getChargeNurse() {
		return chargeNurse;
	}

	public void setChargeNurse(String chargeNurse) {
		this.chargeNurse = chargeNurse;
	}

	public boolean isChestAndThoraxChest() {
		return chestAndThoraxChest;
	}

	public void setChestAndThoraxChest(boolean chestAndThoraxChest) {
		this.chestAndThoraxChest = chestAndThoraxChest;
	}

	public boolean isChestAndThoraxChestAPAL() {
		return chestAndThoraxChestAPAL;
	}

	public void setChestAndThoraxChestAPAL(boolean chestAndThoraxChestAPAL) {
		this.chestAndThoraxChestAPAL = chestAndThoraxChestAPAL;
	}

	public boolean isChestAndThoraxChestAPL() {
		return chestAndThoraxChestAPL;
	}

	public void setChestAndThoraxChestAPL(boolean chestAndThoraxChestAPL) {
		this.chestAndThoraxChestAPL = chestAndThoraxChestAPL;
	}

	public boolean isChestAndThoraxDecub() {
		return chestAndThoraxDecub;
	}

	public void setChestAndThoraxDecub(boolean chestAndThoraxDecub) {
		this.chestAndThoraxDecub = chestAndThoraxDecub;
	}

	public boolean isChestAndThoraxRibsB() {
		return chestAndThoraxRibsB;
	}

	public void setChestAndThoraxRibsB(boolean chestAndThoraxRibsB) {
		this.chestAndThoraxRibsB = chestAndThoraxRibsB;
	}

	public boolean isChestAndThoraxRibsUniCRL() {
		return chestAndThoraxRibsUniCRL;
	}

	public void setChestAndThoraxRibsUniCRL(boolean chestAndThoraxRibsUniCRL) {
		this.chestAndThoraxRibsUniCRL = chestAndThoraxRibsUniCRL;
	}

	public boolean isChestAndThoraxRibsUniCRR() {
		return chestAndThoraxRibsUniCRR;
	}

	public void setChestAndThoraxRibsUniCRR(boolean chestAndThoraxRibsUniCRR) {
		this.chestAndThoraxRibsUniCRR = chestAndThoraxRibsUniCRR;
	}

	public boolean isChestAndThoraxRibsUnilL() {
		return chestAndThoraxRibsUnilL;
	}

	public void setChestAndThoraxRibsUnilL(boolean chestAndThoraxRibsUnilL) {
		this.chestAndThoraxRibsUnilL = chestAndThoraxRibsUnilL;
	}

	public boolean isChestAndThoraxRibsUnilR() {
		return chestAndThoraxRibsUnilR;
	}

	public void setChestAndThoraxRibsUnilR(boolean chestAndThoraxRibsUnilR) {
		this.chestAndThoraxRibsUnilR = chestAndThoraxRibsUnilR;
	}

	public boolean isChestAtelectasis() {
		return chestAtelectasis;
	}

	public void setChestAtelectasis(boolean chestAtelectasis) {
		this.chestAtelectasis = chestAtelectasis;
	}

	public boolean isChestCardiomegaly() {
		return chestCardiomegaly;
	}

	public void setChestCardiomegaly(boolean chestCardiomegaly) {
		this.chestCardiomegaly = chestCardiomegaly;
	}

	public boolean isChestCHF() {
		return chestCHF;
	}

	public void setChestCHF(boolean chestCHF) {
		this.chestCHF = chestCHF;
	}

	public boolean isChestCongestion() {
		return chestCongestion;
	}

	public void setChestCongestion(boolean chestCongestion) {
		this.chestCongestion = chestCongestion;
	}

	public boolean isChestCOPD() {
		return chestCOPD;
	}

	public void setChestCOPD(boolean chestCOPD) {
		this.chestCOPD = chestCOPD;
	}

	public boolean isChestCough() {
		return chestCough;
	}

	public void setChestCough(boolean chestCough) {
		this.chestCough = chestCough;
	}

	public boolean isChestInfiltrate() {
		return chestInfiltrate;
	}

	public void setChestInfiltrate(boolean chestInfiltrate) {
		this.chestInfiltrate = chestInfiltrate;
	}

	public boolean isChestOther() {
		return chestOther;
	}

	public void setChestOther(boolean chestOther) {
		this.chestOther = chestOther;
	}

	public boolean isChestPain() {
		return chestPain;
	}

	public void setChestPain(boolean chestPain) {
		this.chestPain = chestPain;
	}

	public boolean isChestPneumonia() {
		return chestPneumonia;
	}

	public void setChestPneumonia(boolean chestPneumonia) {
		this.chestPneumonia = chestPneumonia;
	}

	public boolean isChestPneumothorax() {
		return chestPneumothorax;
	}

	public void setChestPneumothorax(boolean chestPneumothorax) {
		this.chestPneumothorax = chestPneumothorax;
	}

	public boolean isChestPost() {
		return chestPost;
	}

	public void setChestPost(boolean chestPost) {
		this.chestPost = chestPost;
	}

	public boolean isChestRales() {
		return chestRales;
	}

	public void setChestRales(boolean chestRales) {
		this.chestRales = chestRales;
	}

	public boolean isChestRespiratoryFailure() {
		return chestRespiratoryFailure;
	}

	public void setChestRespiratoryFailure(boolean chestRespiratoryFailure) {
		this.chestRespiratoryFailure = chestRespiratoryFailure;
	}

	public boolean isChestShort() {
		return chestShort;
	}

	public void setChestShort(boolean chestShort) {
		this.chestShort = chestShort;
	}

	public boolean isChestTemp() {
		return chestTemp;
	}

	public void setChestTemp(boolean chestTemp) {
		this.chestTemp = chestTemp;
	}

	public boolean isChestTuberculosis() {
		return chestTuberculosis;
	}

	public void setChestTuberculosis(boolean chestTuberculosis) {
		this.chestTuberculosis = chestTuberculosis;
	}

	public boolean isChestWheezing() {
		return chestWheezing;
	}

	public void setChestWheezing(boolean chestWheezing) {
		this.chestWheezing = chestWheezing;
	}

	public String getClinicalHistory() {
		return clinicalHistory;
	}

	public void setClinicalHistory(String clinicalHistory) {
		this.clinicalHistory = clinicalHistory;
	}

	public Date getDateDone() {
		return dateDone;
	}

	public void setDateDone(Date dateDone) {
		this.dateDone = dateDone;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public Date getDateReceive() {
		return dateReceive;
	}

	public void setDateReceive(Date dateReceive) {
		this.dateReceive = dateReceive;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}

	public boolean isFractureICD() {
		return fractureICD;
	}

	public void setFractureICD(boolean fractureICD) {
		this.fractureICD = fractureICD;
	}

	public boolean isFracturePathologicFx() {
		return fracturePathologicFx;
	}

	public void setFracturePathologicFx(boolean fracturePathologicFx) {
		this.fracturePathologicFx = fracturePathologicFx;
	}

	public boolean isFracturePathologicFxDistal() {
		return fracturePathologicFxDistal;
	}

	public void setFracturePathologicFxDistal(boolean fracturePathologicFxDistal) {
		this.fracturePathologicFxDistal = fracturePathologicFxDistal;
	}

	public boolean isFracturePathologicFxUnspecified() {
		return fracturePathologicFxUnspecified;
	}

	public void setFracturePathologicFxUnspecified(
			boolean fracturePathologicFxUnspecified) {
		this.fracturePathologicFxUnspecified = fracturePathologicFxUnspecified;
	}

	public boolean isHeadBruise() {
		return headBruise;
	}

	public void setHeadBruise(boolean headBruise) {
		this.headBruise = headBruise;
	}

	public boolean isHeadConcussion() {
		return headConcussion;
	}

	public void setHeadConcussion(boolean headConcussion) {
		this.headConcussion = headConcussion;
	}

	public boolean isHeadFBNasal() {
		return headFBNasal;
	}

	public void setHeadFBNasal(boolean headFBNasal) {
		this.headFBNasal = headFBNasal;
	}

	public boolean isHeadFBSinuses() {
		return headFBSinuses;
	}

	public void setHeadFBSinuses(boolean headFBSinuses) {
		this.headFBSinuses = headFBSinuses;
	}

	public boolean isHeadMandible() {
		return headMandible;
	}

	public void setHeadMandible(boolean headMandible) {
		this.headMandible = headMandible;
	}

	public boolean isHeadOrbits() {
		return headOrbits;
	}

	public void setHeadOrbits(boolean headOrbits) {
		this.headOrbits = headOrbits;
	}

	public String getHeadOther() {
		return headOther;
	}

	public void setHeadOther(String headOther) {
		this.headOther = headOther;
	}

	public boolean isHeadOtherICD() {
		return headOtherICD;
	}

	public void setHeadOtherICD(boolean headOtherICD) {
		this.headOtherICD = headOtherICD;
	}

	public boolean isHeadPain() {
		return headPain;
	}

	public void setHeadPain(boolean headPain) {
		this.headPain = headPain;
	}

	public boolean isHeadSinuses() {
		return headSinuses;
	}

	public void setHeadSinuses(boolean headSinuses) {
		this.headSinuses = headSinuses;
	}

	public boolean isHeadSkull() {
		return headSkull;
	}

	public void setHeadSkull(boolean headSkull) {
		this.headSkull = headSkull;
	}

	public boolean isHypoCongenital() {
		return hypoCongenital;
	}

	public void setHypoCongenital(boolean hypoCongenital) {
		this.hypoCongenital = hypoCongenital;
	}

	public boolean isHypoMalabsorption() {
		return hypoMalabsorption;
	}

	public void setHypoMalabsorption(boolean hypoMalabsorption) {
		this.hypoMalabsorption = hypoMalabsorption;
	}

	public boolean isHypoMineral() {
		return hypoMineral;
	}

	public void setHypoMineral(boolean hypoMineral) {
		this.hypoMineral = hypoMineral;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public boolean isLowerAnkleL() {
		return lowerAnkleL;
	}

	public void setLowerAnkleL(boolean lowerAnkleL) {
		this.lowerAnkleL = lowerAnkleL;
	}

	public boolean isLowerAnkleR() {
		return lowerAnkleR;
	}

	public void setLowerAnkleR(boolean lowerAnkleR) {
		this.lowerAnkleR = lowerAnkleR;
	}

	public boolean isLowerFemurL() {
		return lowerFemurL;
	}

	public void setLowerFemurL(boolean lowerFemurL) {
		this.lowerFemurL = lowerFemurL;
	}

	public boolean isLowerFemurR() {
		return lowerFemurR;
	}

	public void setLowerFemurR(boolean lowerFemurR) {
		this.lowerFemurR = lowerFemurR;
	}

	public boolean isLowerFootL() {
		return lowerFootL;
	}

	public void setLowerFootL(boolean lowerFootL) {
		this.lowerFootL = lowerFootL;
	}

	public boolean isLowerFootR() {
		return lowerFootR;
	}

	public void setLowerFootR(boolean lowerFootR) {
		this.lowerFootR = lowerFootR;
	}

	public boolean isLowerHeelL() {
		return lowerHeelL;
	}

	public void setLowerHeelL(boolean lowerHeelL) {
		this.lowerHeelL = lowerHeelL;
	}

	public boolean isLowerHeelR() {
		return lowerHeelR;
	}

	public void setLowerHeelR(boolean lowerHeelR) {
		this.lowerHeelR = lowerHeelR;
	}

	public boolean isLowerHipBilat() {
		return lowerHipBilat;
	}

	public void setLowerHipBilat(boolean lowerHipBilat) {
		this.lowerHipBilat = lowerHipBilat;
	}

	public boolean isLowerHipL() {
		return lowerHipL;
	}

	public void setLowerHipL(boolean lowerHipL) {
		this.lowerHipL = lowerHipL;
	}

	public boolean isLowerHipR() {
		return lowerHipR;
	}

	public void setLowerHipR(boolean lowerHipR) {
		this.lowerHipR = lowerHipR;
	}

	public boolean isLowerKneeCompL() {
		return lowerKneeCompL;
	}

	public void setLowerKneeCompL(boolean lowerKneeCompL) {
		this.lowerKneeCompL = lowerKneeCompL;
	}

	public boolean isLowerKneeCompR() {
		return lowerKneeCompR;
	}

	public void setLowerKneeCompR(boolean lowerKneeCompR) {
		this.lowerKneeCompR = lowerKneeCompR;
	}

	public boolean isLowerKneeL() {
		return lowerKneeL;
	}

	public void setLowerKneeL(boolean lowerKneeL) {
		this.lowerKneeL = lowerKneeL;
	}

	public boolean isLowerKneeR() {
		return lowerKneeR;
	}

	public void setLowerKneeR(boolean lowerKneeR) {
		this.lowerKneeR = lowerKneeR;
	}

	public boolean isLowerTibiaL() {
		return lowerTibiaL;
	}

	public void setLowerTibiaL(boolean lowerTibiaL) {
		this.lowerTibiaL = lowerTibiaL;
	}

	public boolean isLowerTibiaR() {
		return lowerTibiaR;
	}

	public void setLowerTibiaR(boolean lowerTibiaR) {
		this.lowerTibiaR = lowerTibiaR;
	}

	public boolean isLowerToeL() {
		return lowerToeL;
	}

	public void setLowerToeL(boolean lowerToeL) {
		this.lowerToeL = lowerToeL;
	}

	public boolean isLowerToeR() {
		return lowerToeR;
	}

	public void setLowerToeR(boolean lowerToeR) {
		this.lowerToeR = lowerToeR;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getMedicaidNo() {
		return medicaidNo;
	}

	public void setMedicaidNo(String medicaidNo) {
		this.medicaidNo = medicaidNo;
	}

	public boolean isMedicareA() {
		return medicareA;
	}

	public void setMedicareA(boolean medicareA) {
		this.medicareA = medicareA;
	}

	public boolean isMedicareB() {
		return medicareB;
	}

	public void setMedicareB(boolean medicareB) {
		this.medicareB = medicareB;
	}

	public String getMedicareNo() {
		return medicareNo;
	}

	public void setMedicareNo(String medicareNo) {
		this.medicareNo = medicareNo;
	}

	public boolean isNeoplasmBrain() {
		return neoplasmBrain;
	}

	public void setNeoplasmBrain(boolean neoplasmBrain) {
		this.neoplasmBrain = neoplasmBrain;
	}

	public boolean isNeoplasmKidney() {
		return neoplasmKidney;
	}

	public void setNeoplasmKidney(boolean neoplasmKidney) {
		this.neoplasmKidney = neoplasmKidney;
	}

	public boolean isNeoplasmNutritional() {
		return neoplasmNutritional;
	}

	public void setNeoplasmNutritional(boolean neoplasmNutritional) {
		this.neoplasmNutritional = neoplasmNutritional;
	}

	public String getNoOfViews() {
		return noOfViews;
	}

	public void setNoOfViews(String noOfViews) {
		this.noOfViews = noOfViews;
	}

	public String getNoPTSeen() {
		return noPTSeen;
	}

	public void setNoPTSeen(String noPTSeen) {
		this.noPTSeen = noPTSeen;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public boolean isOsteoDisUse() {
		return osteoDisUse;
	}

	public void setOsteoDisUse(boolean osteoDisUse) {
		this.osteoDisUse = osteoDisUse;
	}

	public boolean isOsteoDrug() {
		return osteoDrug;
	}

	public void setOsteoDrug(boolean osteoDrug) {
		this.osteoDrug = osteoDrug;
	}

	public boolean isOsteoOsteo() {
		return osteoOsteo;
	}

	public void setOsteoOsteo(boolean osteoOsteo) {
		this.osteoOsteo = osteoOsteo;
	}

	public boolean isOsteoOvarian() {
		return osteoOvarian;
	}

	public void setOsteoOvarian(boolean osteoOvarian) {
		this.osteoOvarian = osteoOvarian;
	}

	public boolean isOsteoSenile() {
		return osteoSenile;
	}

	public void setOsteoSenile(boolean osteoSenile) {
		this.osteoSenile = osteoSenile;
	}

	public boolean isOt() {
		return ot;
	}

	public void setOt(boolean ot) {
		this.ot = ot;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getPreApproval() {
		return preApproval;
	}

	public void setPreApproval(String preApproval) {
		this.preApproval = preApproval;
	}

	public String getRadiologistCode() {
		return radiologistCode;
	}

	public void setRadiologistCode(String radiologistCode) {
		this.radiologistCode = radiologistCode;
	}

	public boolean isRenalChronic() {
		return renalChronic;
	}

	public void setRenalChronic(boolean renalChronic) {
		this.renalChronic = renalChronic;
	}

	public boolean isRenalImpaired() {
		return renalImpaired;
	}

	public void setRenalImpaired(boolean renalImpaired) {
		this.renalImpaired = renalImpaired;
	}

	public boolean isRenalNeptirogenic() {
		return renalNeptirogenic;
	}

	public void setRenalNeptirogenic(boolean renalNeptirogenic) {
		this.renalNeptirogenic = renalNeptirogenic;
	}

	public boolean isRenalOsteoDystrophy() {
		return renalOsteoDystrophy;
	}

	public void setRenalOsteoDystrophy(boolean renalOsteoDystrophy) {
		this.renalOsteoDystrophy = renalOsteoDystrophy;
	}

	public boolean isRenalRheumatoid() {
		return renalRheumatoid;
	}

	public void setRenalRheumatoid(boolean renalRheumatoid) {
		this.renalRheumatoid = renalRheumatoid;
	}

	public boolean isRenalRickets() {
		return renalRickets;
	}

	public void setRenalRickets(boolean renalRickets) {
		this.renalRickets = renalRickets;
	}

	public boolean isRenalTesticular() {
		return renalTesticular;
	}

	public void setRenalTesticular(boolean renalTesticular) {
		this.renalTesticular = renalTesticular;
	}

	public boolean isRenalVitamin() {
		return renalVitamin;
	}

	public void setRenalVitamin(boolean renalVitamin) {
		this.renalVitamin = renalVitamin;
	}

	public String getRequestPhysician() {
		return requestPhysician;
	}

	public void setRequestPhysician(String requestPhysician) {
		this.requestPhysician = requestPhysician;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getRmNo() {
		return rmNo;
	}

	public void setRmNo(String rmNo) {
		this.rmNo = rmNo;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public boolean isSkeletalBruiseLower() {
		return skeletalBruiseLower;
	}

	public void setSkeletalBruiseLower(boolean skeletalBruiseLower) {
		this.skeletalBruiseLower = skeletalBruiseLower;
	}

	public boolean isSkeletalBruiseUpper() {
		return skeletalBruiseUpper;
	}

	public void setSkeletalBruiseUpper(boolean skeletalBruiseUpper) {
		this.skeletalBruiseUpper = skeletalBruiseUpper;
	}

	public boolean isSkeletalHealing() {
		return skeletalHealing;
	}

	public void setSkeletalHealing(boolean skeletalHealing) {
		this.skeletalHealing = skeletalHealing;
	}

	public boolean isSkeletalPainExt() {
		return skeletalPainExt;
	}

	public void setSkeletalPainExt(boolean skeletalPainExt) {
		this.skeletalPainExt = skeletalPainExt;
	}

	public boolean isSkeletalPainMultiple() {
		return skeletalPainMultiple;
	}

	public void setSkeletalPainMultiple(boolean skeletalPainMultiple) {
		this.skeletalPainMultiple = skeletalPainMultiple;
	}

	public boolean isSkeletalPainRibs() {
		return skeletalPainRibs;
	}

	public void setSkeletalPainRibs(boolean skeletalPainRibs) {
		this.skeletalPainRibs = skeletalPainRibs;
	}

	public boolean isSkeletalSwellingExt() {
		return skeletalSwellingExt;
	}

	public void setSkeletalSwellingExt(boolean skeletalSwellingExt) {
		this.skeletalSwellingExt = skeletalSwellingExt;
	}

	public boolean isSkeletalSwellingOther() {
		return skeletalSwellingOther;
	}

	public void setSkeletalSwellingOther(boolean skeletalSwellingOther) {
		this.skeletalSwellingOther = skeletalSwellingOther;
	}

	public boolean isSpinalCervical() {
		return spinalCervical;
	}

	public void setSpinalCervical(boolean spinalCervical) {
		this.spinalCervical = spinalCervical;
	}

	public boolean isSpinalLumbosacral() {
		return spinalLumbosacral;
	}

	public void setSpinalLumbosacral(boolean spinalLumbosacral) {
		this.spinalLumbosacral = spinalLumbosacral;
	}

	public boolean isSpinalPelvis() {
		return spinalPelvis;
	}

	public void setSpinalPelvis(boolean spinalPelvis) {
		this.spinalPelvis = spinalPelvis;
	}

	public boolean isSpinalPelvisComp() {
		return spinalPelvisComp;
	}

	public void setSpinalPelvisComp(boolean spinalPelvisComp) {
		this.spinalPelvisComp = spinalPelvisComp;
	}

	public boolean isSpinalSacrum() {
		return spinalSacrum;
	}

	public void setSpinalSacrum(boolean spinalSacrum) {
		this.spinalSacrum = spinalSacrum;
	}

	public boolean isSpinalThoracic() {
		return spinalThoracic;
	}

	public void setSpinalThoracic(boolean spinalThoracic) {
		this.spinalThoracic = spinalThoracic;
	}

	public boolean isSt() {
		return st;
	}

	public void setSt(boolean st) {
		this.st = st;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public String getTechnicalComments() {
		return technicalComments;
	}

	public void setTechnicalComments(String technicalComments) {
		this.technicalComments = technicalComments;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean isUpperClavicleL() {
		return upperClavicleL;
	}

	public void setUpperClavicleL(boolean upperClavicleL) {
		this.upperClavicleL = upperClavicleL;
	}

	public boolean isUpperClavicleR() {
		return upperClavicleR;
	}

	public void setUpperClavicleR(boolean upperClavicleR) {
		this.upperClavicleR = upperClavicleR;
	}

	public boolean isUpperElbowL() {
		return upperElbowL;
	}

	public void setUpperElbowL(boolean upperElbowL) {
		this.upperElbowL = upperElbowL;
	}

	public boolean isUpperElbowR() {
		return upperElbowR;
	}

	public void setUpperElbowR(boolean upperElbowR) {
		this.upperElbowR = upperElbowR;
	}

	public boolean isUpperFingerL() {
		return upperFingerL;
	}

	public void setUpperFingerL(boolean upperFingerL) {
		this.upperFingerL = upperFingerL;
	}

	public boolean isUpperFingerR() {
		return upperFingerR;
	}

	public void setUpperFingerR(boolean upperFingerR) {
		this.upperFingerR = upperFingerR;
	}

	public boolean isUpperForearmL() {
		return upperForearmL;
	}

	public void setUpperForearmL(boolean upperForearmL) {
		this.upperForearmL = upperForearmL;
	}

	public boolean isUpperForearmR() {
		return upperForearmR;
	}

	public void setUpperForearmR(boolean upperForearmR) {
		this.upperForearmR = upperForearmR;
	}

	public boolean isUpperHandL() {
		return upperHandL;
	}

	public void setUpperHandL(boolean upperHandL) {
		this.upperHandL = upperHandL;
	}

	public boolean isUpperHandR() {
		return upperHandR;
	}

	public void setUpperHandR(boolean upperHandR) {
		this.upperHandR = upperHandR;
	}

	public boolean isUpperHumerusL() {
		return upperHumerusL;
	}

	public void setUpperHumerusL(boolean upperHumerusL) {
		this.upperHumerusL = upperHumerusL;
	}

	public boolean isUpperHumerusR() {
		return upperHumerusR;
	}

	public void setUpperHumerusR(boolean upperHumerusR) {
		this.upperHumerusR = upperHumerusR;
	}

	public boolean isUpperScapulaL() {
		return upperScapulaL;
	}

	public void setUpperScapulaL(boolean upperScapulaL) {
		this.upperScapulaL = upperScapulaL;
	}

	public boolean isUpperScapulaR() {
		return upperScapulaR;
	}

	public void setUpperScapulaR(boolean upperScapulaR) {
		this.upperScapulaR = upperScapulaR;
	}

	public boolean isUpperShoulderL() {
		return upperShoulderL;
	}

	public void setUpperShoulderL(boolean upperShoulderL) {
		this.upperShoulderL = upperShoulderL;
	}

	public boolean isUpperShoulderR() {
		return upperShoulderR;
	}

	public void setUpperShoulderR(boolean upperShoulderR) {
		this.upperShoulderR = upperShoulderR;
	}

	public boolean isUpperWristL() {
		return upperWristL;
	}

	public void setUpperWristL(boolean upperWristL) {
		this.upperWristL = upperWristL;
	}

	public boolean isUpperWristR() {
		return upperWristR;
	}

	public void setUpperWristR(boolean upperWristR) {
		this.upperWristR = upperWristR;
	}

	public boolean isXrayNo() {
		return xrayNo;
	}

	public void setXrayNo(boolean xrayNo) {
		this.xrayNo = xrayNo;
	}

	public boolean isXrayYes() {
		return xrayYes;
	}

	public void setXrayYes(boolean xrayYes) {
		this.xrayYes = xrayYes;
	}

}
