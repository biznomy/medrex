package medrex.commons.vo.monthlySummary;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentInformation")
public class ResidentInformation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3557553917009179902L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;
	@Column(name = "residentId")
	int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "understandEnglish")
	int understandEnglish;
	@Column(name = "gestures")
	int gestures;
	@Column(name = "understandWriting")
	int understandWriting;
	@Column(name = "understandSpeaking")
	int understandSpeaking;
	@Column(name = "canWrite")
	int canWrite;
	@Column(name = "canHear")
	int canHear;
	@Column(name = "canSpeak")
	int canSpeak;
	@Column(name = "abletoMake")
	int abletoMake;
	@Column(name = "sideRails")
	int sideRails;
	@Column(name = "badActivity1")
	String badActivity1;
	@Column(name = "badActivity4")
	String badActivity4;
	@Column(name = "badActivity2")
	String badActivity2;
	@Column(name = "badActivity5")
	String badActivity5;
	@Column(name = "badActivity3")
	String badActivity3;
	@Column(name = "badActivity6")
	String badActivity6;

	@Column(name = "personalHygiene1")
	String personalHygiene1;
	@Column(name = "personalHygiene4")
	String personalHygiene4;
	@Column(name = "personalHygiene7")
	String personalHygiene7;
	@Column(name = "personalHygiene10")
	String personalHygiene10;
	@Column(name = "personalHygiene13")
	String personalHygiene13;
	@Column(name = "personalHygiene2")
	String personalHygiene2;
	@Column(name = "personalHygiene5")
	String personalHygiene5;
	@Column(name = "personalHygiene8")
	String personalHygiene8;
	@Column(name = "personalHygiene11")
	String personalHygiene11;
	@Column(name = "personalHygiene14")
	String personalHygiene14;
	@Column(name = "personalHygiene3")
	String personalHygiene3;
	@Column(name = "personalHygiene6")
	String personalHygiene6;
	@Column(name = "personalHygiene9")
	String personalHygiene9;
	@Column(name = "personalHygiene12")
	String personalHygiene12;
	@Column(name = "personalHygiene15")
	String personalHygiene15;
	@Column(name = "feeding1")
	String feeding1;
	@Column(name = "feeding2")
	String feeding2;
	@Column(name = "feeding3")
	String feeding3;
	@Column(name = "tranfer1")
	String tranfer1;
	@Column(name = "tranfer4")
	String tranfer4;
	@Column(name = "tranfer7")
	String tranfer7;
	@Column(name = "tranfer10")
	String tranfer10;
	@Column(name = "tranfer2")
	String tranfer2;
	@Column(name = "tranfer5")
	String tranfer5;
	@Column(name = "tranfer8")
	String tranfer8;
	@Column(name = "tranfer11")
	String tranfer11;
	@Column(name = "tranfer3")
	String tranfer3;
	@Column(name = "tranfer6")
	String tranfer6;
	@Column(name = "tranfer9")
	String tranfer9;
	@Column(name = "tranfer12")
	String tranfer12;
	@Column(name = "locomotion3")
	String locomotion3;
	@Column(name = "locomotion6")
	String locomotion6;
	@Column(name = "locomotion9")
	String locomotion9;
	@Column(name = "locomotion1")
	String locomotion1;
	@Column(name = "locomotion4")
	String locomotion4;
	@Column(name = "locomotion7")
	String locomotion7;
	@Column(name = "locomotion2")
	String locomotion2;
	@Column(name = "locomotion5")
	String locomotion5;
	@Column(name = "locomotion8")
	String locomotion8;
	@Column(name = "bedLow")
	String bedLow;
	@Column(name = "mattressFirm")
	String mattressFirm;
	@Column(name = "reg")
	String reg;
	@Column(name = "otherReg")
	String otherReg;
	@Column(name = "cooperative")
	String cooperative;
	@Column(name = "orientedX")
	String orientedX;
	@Column(name = "disruptive")
	String disruptive;
	@Column(name = "belligerent")
	String belligerent;
	@Column(name = "combative")
	String combative;
	@Column(name = "senile")
	String senile;
	@Column(name = "suspicious")
	String suspicious;
	@Column(name = "withdrawn")
	String withdrawn;
	@Column(name = "wanders")
	String wanders;
	@Column(name = "alert")
	String alert;
	@Column(name = "forgetful")
	String forgetful;
	@Column(name = "confused")
	String confused;
	@Column(name = "regular")
	String regular;
	@Column(name = "lowSalt")
	String lowSalt;
	@Column(name = "diabetic")
	String diabetic;
	@Column(name = "bland")
	String bland;
	@Column(name = "lowResidue")
	String lowResidue;
	@Column(name = "otherDiet")
	String otherDiet;
	@Column(name = "feedSelf")
	String feedSelf;
	@Column(name = "needsHelp")
	String needsHelp;
	@Column(name = "part")
	String part;

	@Column(name = "dietAll")
	String dietAll;
	@Column(name = "appliance")
	String appliance;
	@Column(name = "catheter")
	String catheter;
	@Column(name = "colostomy")
	String colostomy;
	@Column(name = "cane")
	String cane;
	@Column(name = "crutches")
	String crutches;
	@Column(name = "prosthesis")
	String prosthesis;
	@Column(name = "walker")
	String walker;
	@Column(name = "chair")
	String chair;
	@Column(name = "hearingR")
	String hearingR;
	@Column(name = "hearingL")
	String hearingL;
	@Column(name = "denturesUpper")
	String denturesUpper;
	@Column(name = "lower")
	String lower;
	@Column(name = "glassess")
	String glassess;
	@Column(name = "ifYesLanguage")
	String ifYesLanguage;
	@Column(name = "dressing1")
	String dressing1;
	@Column(name = "dressing4")
	String dressing4;
	@Column(name = "dressing7")
	String dressing7;
	@Column(name = "dressing10")
	String dressing10;
	@Column(name = "dressing2")
	String dressing2;
	@Column(name = "dressing5")
	String dressing5;
	@Column(name = "dressing8")
	String dressing8;
	@Column(name = "dressing11")
	String dressing11;
	@Column(name = "dressing3")
	String dressing3;
	@Column(name = "dressing6")
	String dressing6;
	@Column(name = "dressing9")
	String dressing9;
	@Column(name = "dressing12")
	String dressing12;
	@Column(name = "socialInformation")
	String socialInformation;
	@Column(name = "additionalPertinent")
	String additionalPertinent;

	public int getSerial() {
		return serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public int getUnderstandEnglish() {
		return understandEnglish;
	}

	public int getGestures() {
		return gestures;
	}

	public int getUnderstandWriting() {
		return understandWriting;
	}

	public int getUnderstandSpeaking() {
		return understandSpeaking;
	}

	public int getCanWrite() {
		return canWrite;
	}

	public int getCanHear() {
		return canHear;
	}

	public int getCanSpeak() {
		return canSpeak;
	}

	public int getAbletoMake() {
		return abletoMake;
	}

	public int getSideRails() {
		return sideRails;
	}

	public String getBadActivity1() {
		return badActivity1;
	}

	public String getBadActivity4() {
		return badActivity4;
	}

	public String getBadActivity2() {
		return badActivity2;
	}

	public String getBadActivity5() {
		return badActivity5;
	}

	public String getBadActivity3() {
		return badActivity3;
	}

	public String getBadActivity6() {
		return badActivity6;
	}

	public String getPersonalHygiene1() {
		return personalHygiene1;
	}

	public String getPersonalHygiene4() {
		return personalHygiene4;
	}

	public String getPersonalHygiene7() {
		return personalHygiene7;
	}

	public String getPersonalHygiene10() {
		return personalHygiene10;
	}

	public String getPersonalHygiene13() {
		return personalHygiene13;
	}

	public String getPersonalHygiene2() {
		return personalHygiene2;
	}

	public String getPersonalHygiene5() {
		return personalHygiene5;
	}

	public String getPersonalHygiene8() {
		return personalHygiene8;
	}

	public String getPersonalHygiene11() {
		return personalHygiene11;
	}

	public String getPersonalHygiene14() {
		return personalHygiene14;
	}

	public String getPersonalHygiene3() {
		return personalHygiene3;
	}

	public String getPersonalHygiene6() {
		return personalHygiene6;
	}

	public String getPersonalHygiene9() {
		return personalHygiene9;
	}

	public String getPersonalHygiene12() {
		return personalHygiene12;
	}

	public String getPersonalHygiene15() {
		return personalHygiene15;
	}

	public String getFeeding1() {
		return feeding1;
	}

	public String getFeeding2() {
		return feeding2;
	}

	public String getFeeding3() {
		return feeding3;
	}

	public String getTranfer1() {
		return tranfer1;
	}

	public String getTranfer4() {
		return tranfer4;
	}

	public String getTranfer7() {
		return tranfer7;
	}

	public String getTranfer10() {
		return tranfer10;
	}

	public String getTranfer2() {
		return tranfer2;
	}

	public String getTranfer5() {
		return tranfer5;
	}

	public String getTranfer8() {
		return tranfer8;
	}

	public String getTranfer11() {
		return tranfer11;
	}

	public String getTranfer3() {
		return tranfer3;
	}

	public String getTranfer6() {
		return tranfer6;
	}

	public String getTranfer9() {
		return tranfer9;
	}

	public String getTranfer12() {
		return tranfer12;
	}

	public String getLocomotion3() {
		return locomotion3;
	}

	public String getLocomotion6() {
		return locomotion6;
	}

	public String getLocomotion9() {
		return locomotion9;
	}

	public String getLocomotion1() {
		return locomotion1;
	}

	public String getLocomotion4() {
		return locomotion4;
	}

	public String getLocomotion7() {
		return locomotion7;
	}

	public String getLocomotion2() {
		return locomotion2;
	}

	public String getLocomotion5() {
		return locomotion5;
	}

	public String getLocomotion8() {
		return locomotion8;
	}

	public String getBedLow() {
		return bedLow;
	}

	public String getMattressFirm() {
		return mattressFirm;
	}

	public String getReg() {
		return reg;
	}

	public String getOtherReg() {
		return otherReg;
	}

	public String getCooperative() {
		return cooperative;
	}

	public String getOrientedX() {
		return orientedX;
	}

	public String getDisruptive() {
		return disruptive;
	}

	public String getBelligerent() {
		return belligerent;
	}

	public String getCombative() {
		return combative;
	}

	public String getSenile() {
		return senile;
	}

	public String getSuspicious() {
		return suspicious;
	}

	public String getWithdrawn() {
		return withdrawn;
	}

	public String getWanders() {
		return wanders;
	}

	public String getAlert() {
		return alert;
	}

	public String getForgetful() {
		return forgetful;
	}

	public String getConfused() {
		return confused;
	}

	public String getRegular() {
		return regular;
	}

	public String getLowSalt() {
		return lowSalt;
	}

	public String getDiabetic() {
		return diabetic;
	}

	public String getBland() {
		return bland;
	}

	public String getLowResidue() {
		return lowResidue;
	}

	public String getOtherDiet() {
		return otherDiet;
	}

	public String getFeedSelf() {
		return feedSelf;
	}

	public String getNeedsHelp() {
		return needsHelp;
	}

	public String getPart() {
		return part;
	}

	public String getDietAll() {
		return dietAll;
	}

	public String getAppliance() {
		return appliance;
	}

	public String getCatheter() {
		return catheter;
	}

	public String getColostomy() {
		return colostomy;
	}

	public String getCane() {
		return cane;
	}

	public String getCrutches() {
		return crutches;
	}

	public String getProsthesis() {
		return prosthesis;
	}

	public String getWalker() {
		return walker;
	}

	public String getChair() {
		return chair;
	}

	public String getHearingR() {
		return hearingR;
	}

	public String getHearingL() {
		return hearingL;
	}

	public String getDenturesUpper() {
		return denturesUpper;
	}

	public String getLower() {
		return lower;
	}

	public String getGlassess() {
		return glassess;
	}

	public String getIfYesLanguage() {
		return ifYesLanguage;
	}

	public String getDressing1() {
		return dressing1;
	}

	public String getDressing4() {
		return dressing4;
	}

	public String getDressing7() {
		return dressing7;
	}

	public String getDressing10() {
		return dressing10;
	}

	public String getDressing2() {
		return dressing2;
	}

	public String getDressing5() {
		return dressing5;
	}

	public String getDressing8() {
		return dressing8;
	}

	public String getDressing11() {
		return dressing11;
	}

	public String getDressing3() {
		return dressing3;
	}

	public String getDressing6() {
		return dressing6;
	}

	public String getDressing9() {
		return dressing9;
	}

	public String getDressing12() {
		return dressing12;
	}

	public String getSocialInformation() {
		return socialInformation;
	}

	public String getAdditionalPertinent() {
		return additionalPertinent;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public void setUnderstandEnglish(int understandEnglish) {
		this.understandEnglish = understandEnglish;
	}

	public void setGestures(int gestures) {
		this.gestures = gestures;
	}

	public void setUnderstandWriting(int understandWriting) {
		this.understandWriting = understandWriting;
	}

	public void setUnderstandSpeaking(int understandSpeaking) {
		this.understandSpeaking = understandSpeaking;
	}

	public void setCanWrite(int canWrite) {
		this.canWrite = canWrite;
	}

	public void setCanHear(int canHear) {
		this.canHear = canHear;
	}

	public void setCanSpeak(int canSpeak) {
		this.canSpeak = canSpeak;
	}

	public void setAbletoMake(int abletoMake) {
		this.abletoMake = abletoMake;
	}

	public void setSideRails(int sideRails) {
		this.sideRails = sideRails;
	}

	public void setBadActivity1(String badActivity1) {
		this.badActivity1 = badActivity1;
	}

	public void setBadActivity4(String badActivity4) {
		this.badActivity4 = badActivity4;
	}

	public void setBadActivity2(String badActivity2) {
		this.badActivity2 = badActivity2;
	}

	public void setBadActivity5(String badActivity5) {
		this.badActivity5 = badActivity5;
	}

	public void setBadActivity3(String badActivity3) {
		this.badActivity3 = badActivity3;
	}

	public void setBadActivity6(String badActivity6) {
		this.badActivity6 = badActivity6;
	}

	public void setPersonalHygiene1(String personalHygiene1) {
		this.personalHygiene1 = personalHygiene1;
	}

	public void setPersonalHygiene4(String personalHygiene4) {
		this.personalHygiene4 = personalHygiene4;
	}

	public void setPersonalHygiene7(String personalHygiene7) {
		this.personalHygiene7 = personalHygiene7;
	}

	public void setPersonalHygiene10(String personalHygiene10) {
		this.personalHygiene10 = personalHygiene10;
	}

	public void setPersonalHygiene13(String personalHygiene13) {
		this.personalHygiene13 = personalHygiene13;
	}

	public void setPersonalHygiene2(String personalHygiene2) {
		this.personalHygiene2 = personalHygiene2;
	}

	public void setPersonalHygiene5(String personalHygiene5) {
		this.personalHygiene5 = personalHygiene5;
	}

	public void setPersonalHygiene8(String personalHygiene8) {
		this.personalHygiene8 = personalHygiene8;
	}

	public void setPersonalHygiene11(String personalHygiene11) {
		this.personalHygiene11 = personalHygiene11;
	}

	public void setPersonalHygiene14(String personalHygiene14) {
		this.personalHygiene14 = personalHygiene14;
	}

	public void setPersonalHygiene3(String personalHygiene3) {
		this.personalHygiene3 = personalHygiene3;
	}

	public void setPersonalHygiene6(String personalHygiene6) {
		this.personalHygiene6 = personalHygiene6;
	}

	public void setPersonalHygiene9(String personalHygiene9) {
		this.personalHygiene9 = personalHygiene9;
	}

	public void setPersonalHygiene12(String personalHygiene12) {
		this.personalHygiene12 = personalHygiene12;
	}

	public void setPersonalHygiene15(String personalHygiene15) {
		this.personalHygiene15 = personalHygiene15;
	}

	public void setFeeding1(String feeding1) {
		this.feeding1 = feeding1;
	}

	public void setFeeding2(String feeding2) {
		this.feeding2 = feeding2;
	}

	public void setFeeding3(String feeding3) {
		this.feeding3 = feeding3;
	}

	public void setTranfer1(String tranfer1) {
		this.tranfer1 = tranfer1;
	}

	public void setTranfer4(String tranfer4) {
		this.tranfer4 = tranfer4;
	}

	public void setTranfer7(String tranfer7) {
		this.tranfer7 = tranfer7;
	}

	public void setTranfer10(String tranfer10) {
		this.tranfer10 = tranfer10;
	}

	public void setTranfer2(String tranfer2) {
		this.tranfer2 = tranfer2;
	}

	public void setTranfer5(String tranfer5) {
		this.tranfer5 = tranfer5;
	}

	public void setTranfer8(String tranfer8) {
		this.tranfer8 = tranfer8;
	}

	public void setTranfer11(String tranfer11) {
		this.tranfer11 = tranfer11;
	}

	public void setTranfer3(String tranfer3) {
		this.tranfer3 = tranfer3;
	}

	public void setTranfer6(String tranfer6) {
		this.tranfer6 = tranfer6;
	}

	public void setTranfer9(String tranfer9) {
		this.tranfer9 = tranfer9;
	}

	public void setTranfer12(String tranfer12) {
		this.tranfer12 = tranfer12;
	}

	public void setLocomotion3(String locomotion3) {
		this.locomotion3 = locomotion3;
	}

	public void setLocomotion6(String locomotion6) {
		this.locomotion6 = locomotion6;
	}

	public void setLocomotion9(String locomotion9) {
		this.locomotion9 = locomotion9;
	}

	public void setLocomotion1(String locomotion1) {
		this.locomotion1 = locomotion1;
	}

	public void setLocomotion4(String locomotion4) {
		this.locomotion4 = locomotion4;
	}

	public void setLocomotion7(String locomotion7) {
		this.locomotion7 = locomotion7;
	}

	public void setLocomotion2(String locomotion2) {
		this.locomotion2 = locomotion2;
	}

	public void setLocomotion5(String locomotion5) {
		this.locomotion5 = locomotion5;
	}

	public void setLocomotion8(String locomotion8) {
		this.locomotion8 = locomotion8;
	}

	public void setBedLow(String bedLow) {
		this.bedLow = bedLow;
	}

	public void setMattressFirm(String mattressFirm) {
		this.mattressFirm = mattressFirm;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public void setOtherReg(String otherReg) {
		this.otherReg = otherReg;
	}

	public void setCooperative(String cooperative) {
		this.cooperative = cooperative;
	}

	public void setOrientedX(String orientedX) {
		this.orientedX = orientedX;
	}

	public void setDisruptive(String disruptive) {
		this.disruptive = disruptive;
	}

	public void setBelligerent(String belligerent) {
		this.belligerent = belligerent;
	}

	public void setCombative(String combative) {
		this.combative = combative;
	}

	public void setSenile(String senile) {
		this.senile = senile;
	}

	public void setSuspicious(String suspicious) {
		this.suspicious = suspicious;
	}

	public void setWithdrawn(String withdrawn) {
		this.withdrawn = withdrawn;
	}

	public void setWanders(String wanders) {
		this.wanders = wanders;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public void setForgetful(String forgetful) {
		this.forgetful = forgetful;
	}

	public void setConfused(String confused) {
		this.confused = confused;
	}

	public void setRegular(String regular) {
		this.regular = regular;
	}

	public void setLowSalt(String lowSalt) {
		this.lowSalt = lowSalt;
	}

	public void setDiabetic(String diabetic) {
		this.diabetic = diabetic;
	}

	public void setBland(String bland) {
		this.bland = bland;
	}

	public void setLowResidue(String lowResidue) {
		this.lowResidue = lowResidue;
	}

	public void setOtherDiet(String otherDiet) {
		this.otherDiet = otherDiet;
	}

	public void setFeedSelf(String feedSelf) {
		this.feedSelf = feedSelf;
	}

	public void setNeedsHelp(String needsHelp) {
		this.needsHelp = needsHelp;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public void setDietAll(String dietAll) {
		this.dietAll = dietAll;
	}

	public void setAppliance(String appliance) {
		this.appliance = appliance;
	}

	public void setCatheter(String catheter) {
		this.catheter = catheter;
	}

	public void setColostomy(String colostomy) {
		this.colostomy = colostomy;
	}

	public void setCane(String cane) {
		this.cane = cane;
	}

	public void setCrutches(String crutches) {
		this.crutches = crutches;
	}

	public void setProsthesis(String prosthesis) {
		this.prosthesis = prosthesis;
	}

	public void setWalker(String walker) {
		this.walker = walker;
	}

	public void setChair(String chair) {
		this.chair = chair;
	}

	public void setHearingR(String hearingR) {
		this.hearingR = hearingR;
	}

	public void setHearingL(String hearingL) {
		this.hearingL = hearingL;
	}

	public void setDenturesUpper(String denturesUpper) {
		this.denturesUpper = denturesUpper;
	}

	public void setLower(String lower) {
		this.lower = lower;
	}

	public void setGlassess(String glassess) {
		this.glassess = glassess;
	}

	public void setIfYesLanguage(String ifYesLanguage) {
		this.ifYesLanguage = ifYesLanguage;
	}

	public void setDressing1(String dressing1) {
		this.dressing1 = dressing1;
	}

	public void setDressing4(String dressing4) {
		this.dressing4 = dressing4;
	}

	public void setDressing7(String dressing7) {
		this.dressing7 = dressing7;
	}

	public void setDressing10(String dressing10) {
		this.dressing10 = dressing10;
	}

	public void setDressing2(String dressing2) {
		this.dressing2 = dressing2;
	}

	public void setDressing5(String dressing5) {
		this.dressing5 = dressing5;
	}

	public void setDressing8(String dressing8) {
		this.dressing8 = dressing8;
	}

	public void setDressing11(String dressing11) {
		this.dressing11 = dressing11;
	}

	public void setDressing3(String dressing3) {
		this.dressing3 = dressing3;
	}

	public void setDressing6(String dressing6) {
		this.dressing6 = dressing6;
	}

	public void setDressing9(String dressing9) {
		this.dressing9 = dressing9;
	}

	public void setDressing12(String dressing12) {
		this.dressing12 = dressing12;
	}

	public void setSocialInformation(String socialInformation) {
		this.socialInformation = socialInformation;
	}

	public void setAdditionalPertinent(String additionalPertinent) {
		this.additionalPertinent = additionalPertinent;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

}
