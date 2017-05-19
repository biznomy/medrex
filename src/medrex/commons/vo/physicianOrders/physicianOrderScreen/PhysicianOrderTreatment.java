package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderTreatment")
public class PhysicianOrderTreatment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4768272054464224720L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "skinInfection")
	private int skinInfection;

	@Column(name = "stage")
	private int stage;

	@Column(name = "nutritional")
	private boolean nutritional;

	@Column(name = "weeklySkinAssessment")
	private boolean weeklySkinAssessment;

	@Column(name = "specialityMattress")
	private boolean specialityMattress;

	@Column(name = "woundPhysician")
	private boolean woundPhysician;

	@Column(name = "weeklyWoundEval")
	private boolean weeklyWoundEval;

	@Column(name = "tp")
	private boolean tp;

	@Column(name = "chairCushion")
	private boolean chairCushion;

	@Column(name = "Location")
	private String Location;

	@Column(name = "ApplyProtective")
	private boolean ApplyProtective;

	@Column(name = "SkinSealants")
	private boolean SkinSealants;

	@Column(name = "Other")
	private boolean Other;

	@Column(name = "Hydrocolloid")
	private boolean Hydrocolloid;

	@Column(name = "days")
	private boolean days;

	@Column(name = "granulatingTissue")
	private int granulatingTissue;

	@Column(name = "FoamDressing")
	private boolean FoamDressing;

	@Column(name = "ProtectiveBarrier")
	private boolean ProtectiveBarrier;

	@Column(name = "applyNoSting")
	private boolean applyNoSting;

	@Column(name = "cleanseArea")
	private boolean cleanseArea;

	@Column(name = "daysAndPrn")
	private boolean daysAndPrn;

	@Column(name = "hydrogel")
	private boolean hydrogel;

	@Column(name = "santyl")
	private boolean santyl;

	@Column(name = "covrsite")
	private boolean covrsite;

	@Column(name = "cddDaily")
	private boolean cddDaily;

	@Column(name = "other3or4")
	private boolean other3or4;

	@Column(name = "otherTxt")
	private String otherTxt;

	@Column(name = "silver")
	private boolean silver;

	@Column(name = "changeTxt")
	private String changeTxt;

	@Column(name = "hydrogelWith")
	private boolean hydrogelWith;

	@Column(name = "cdd")
	private boolean cdd;

	@Column(name = "q")
	private String q;

	@Column(name = "allevyn")
	private boolean allevyn;

	@Column(name = "covrsiteWound")
	private boolean covrsiteWound;

	@Column(name = "woundOther")
	private boolean woundOther;

	@Column(name = "woundOtherTxt")
	private String woundOtherTxt;

	@Column(name = "cleanse")
	private boolean cleanse;

	@Column(name = "Antifungal")
	private String Antifungal;

	@Column(name = "offLoad")
	private boolean offLoad;

	@Column(name = "heelLift")
	private boolean heelLift;

	@Column(name = "barrierFilm")
	private boolean barrierFilm;

	@Column(name = "ota")
	private boolean ota;

	@Column(name = "shift")
	private boolean shift;

	@Column(name = "cleanseNs")
	private boolean cleanseNs;

	@Column(name = "removeStaples")
	private boolean removeStaples;

	@Column(name = "locationWound")
	private String locationWound;

	@Column(name = "dateOn")
	private Date dateOn;

	@Column(name = "dailyBid")
	private String dailyBid;

	@Column(name = "miscellaneous")
	private boolean miscellaneous;
	@Column(name = "capillaryRefill")
	private boolean capillaryRefill;
	@Column(name = "pedalPulse")
	private boolean pedalPulse;
	@Column(name = "locationSkinTears")
	private String locationSkinTears;
	@Column(name = "frequencyRefill")
	private String frequencyRefill;
	@Column(name = "locationPedalPulse")
	private String locationPedalPulse;
	@Column(name = "frequencyPedalPulse")
	private String frequencyPedalPulse;

	public boolean isApplyNoSting() {
		return applyNoSting;
	}

	public void setApplyNoSting(boolean applyNoSting) {
		this.applyNoSting = applyNoSting;
	}

	public boolean isCleanseArea() {
		return cleanseArea;
	}

	public void setCleanseArea(boolean cleanseArea) {
		this.cleanseArea = cleanseArea;
	}

	public boolean isDaysAndPrn() {
		return daysAndPrn;
	}

	public void setDaysAndPrn(boolean daysAndPrn) {
		this.daysAndPrn = daysAndPrn;
	}

	public boolean isHydrogel() {
		return hydrogel;
	}

	public void setHydrogel(boolean hydrogel) {
		this.hydrogel = hydrogel;
	}

	public void setSkinInfection(int skinInfection) {
		this.skinInfection = skinInfection;
	}

	public int getSkinInfection() {
		return this.skinInfection;
	}

	public void setNutritional(boolean nutritional) {
		this.nutritional = nutritional;
	}

	public boolean getNutritional() {
		return this.nutritional;
	}

	public void setWeeklySkinAssessment(boolean weeklySkinAssessment) {
		this.weeklySkinAssessment = weeklySkinAssessment;
	}

	public boolean getWeeklySkinAssessment() {
		return this.weeklySkinAssessment;
	}

	public void setSpecialityMattress(boolean specialityMattress) {
		this.specialityMattress = specialityMattress;
	}

	public boolean getSpecialityMattress() {
		return this.specialityMattress;
	}

	public void setWoundPhysician(boolean woundPhysician) {
		this.woundPhysician = woundPhysician;
	}

	public boolean getWoundPhysician() {
		return this.woundPhysician;
	}

	public void setWeeklyWoundEval(boolean weeklyWoundEval) {
		this.weeklyWoundEval = weeklyWoundEval;
	}

	public boolean getWeeklyWoundEval() {
		return this.weeklyWoundEval;
	}

	public void setTp(boolean tp) {
		this.tp = tp;
	}

	public boolean getTp() {
		return tp;
	}

	public void setChairCushion(boolean chairCushion) {
		this.chairCushion = chairCushion;
	}

	public boolean getChairCushion() {
		return chairCushion;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setApplyProtective(boolean applyProtective) {
		this.ApplyProtective = applyProtective;
	}

	public boolean getApplyProtective() {
		return this.ApplyProtective;
	}

	public void setSkinSealants(boolean skinSealants) {
		this.SkinSealants = skinSealants;
	}

	public boolean getSkinSealants() {
		return this.SkinSealants;
	}

	public void setOther(boolean other) {
		this.Other = other;
	}

	public boolean getOther() {
		return this.Other;
	}

	public void setHydrocolloid(boolean hydrocolloid) {
		this.Hydrocolloid = hydrocolloid;
	}

	public boolean getHydrocolloid() {
		return this.Hydrocolloid;
	}

	public int getGranulatingTissue() {
		return granulatingTissue;
	}

	public boolean isDays() {
		return days;
	}

	public void setDays(boolean days) {
		this.days = days;
	}

	public void setGranulatingTissue(int granulatingTissue) {
		this.granulatingTissue = granulatingTissue;
	}

	public void setFoamDressing(boolean foamDressing) {
		this.FoamDressing = foamDressing;
	}

	public boolean getFoamDressing() {
		return FoamDressing;
	}

	public void setProtectiveBarrier(boolean protectiveBarrier) {
		this.ProtectiveBarrier = protectiveBarrier;
	}

	public boolean getProtectiveBarrier() {
		return ProtectiveBarrier;
	}

	public void setLocation(String location) {
		this.Location = location;
	}

	public String getLocation() {
		return this.Location;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public int getStage() {
		return this.stage;
	}

	public void setSantyl(boolean santyl) {
		this.santyl = santyl;
	}

	public boolean isSantyl() {
		return this.santyl;
	}

	public void setCovrsite(boolean covrsite) {
		this.covrsite = covrsite;
	}

	public boolean isCovrsite() {
		return this.covrsite;
	}

	public void setCddDaily(boolean cddDaily) {
		this.cddDaily = cddDaily;
	}

	public boolean isCddDaily() {
		return this.cddDaily;
	}

	public void setOther3or4(boolean other3or4) {
		this.other3or4 = other3or4;
	}

	public boolean isOther3or4() {
		return this.other3or4;
	}

	public void setOtherTxt(String otherTxt) {
		this.otherTxt = otherTxt;
	}

	public String getOtherTxt() {
		return this.otherTxt;
	}

	public void setSilver(boolean silver) {
		this.silver = silver;
	}

	public boolean isSilver() {
		return this.silver;
	}

	public void setChange(String change) {
		this.changeTxt = change;
	}

	public String getChange() {
		return this.changeTxt;
	}

	public void setHydrogelWith(boolean hydrogelWith) {
		this.hydrogelWith = hydrogelWith;
	}

	public boolean isHydrogelWith() {
		return this.hydrogelWith;
	}

	public void setCdd(boolean cdd) {
		this.cdd = cdd;
	}

	public boolean isCdd() {
		return this.cdd;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getQ() {
		return this.q;
	}

	public void setAllevyn(boolean allevyn) {
		this.allevyn = allevyn;
	}

	public boolean isAllevyn() {
		return this.allevyn;
	}

	public void setCovrsiteWound(boolean covrsiteWound) {
		this.covrsiteWound = covrsiteWound;
	}

	public boolean isCovrsiteWound() {
		return this.covrsiteWound;
	}

	public void setWoundOther(boolean woundOther) {
		this.woundOther = woundOther;
	}

	public boolean isWoundOther() {
		return this.woundOther;
	}

	public void setWoundOtherTxt(String woundOtherTxt) {
		this.woundOtherTxt = woundOtherTxt;
	}

	public String getWoundOtherTxt() {
		return this.woundOtherTxt;
	}

	public void setCleanse(boolean cleanse) {
		this.cleanse = cleanse;
	}

	public boolean isCleanse() {
		return this.cleanse;
	}

	public void setAntifungal(String antifungal) {
		Antifungal = antifungal;
	}

	public String getAntifungal() {
		return this.Antifungal;
	}

	public void setOffLoad(boolean offLoad) {
		this.offLoad = offLoad;
	}

	public boolean isOffLoad() {
		return this.offLoad;
	}

	public void setHeelLift(boolean heelLift) {
		this.heelLift = heelLift;
	}

	public boolean isHeelLift() {
		return this.heelLift;
	}

	public void setBarrierFilm(boolean barrierFilm) {
		this.barrierFilm = barrierFilm;
	}

	public boolean isBarrierFilm() {
		return this.barrierFilm;
	}

	public void setOta(boolean ota) {
		this.ota = ota;
	}

	public boolean isOta() {
		return this.ota;
	}

	public void setShift(boolean shift) {
		this.shift = shift;
	}

	public boolean isShift() {
		return this.shift;
	}

	public void setCleanseNs(boolean cleanseNs) {
		this.cleanseNs = cleanseNs;
	}

	public boolean isCleanseNs() {
		return this.cleanseNs;
	}

	public void setRemoveStaples(boolean removeStaples) {
		this.removeStaples = removeStaples;
	}

	public boolean isRemoveStaples() {
		return this.removeStaples;
	}

	public void setLocationWound(String locationWound) {
		this.locationWound = locationWound;
	}

	public String getLocationWound() {
		return this.locationWound;
	}

	public String getChangeTxt() {
		return changeTxt;
	}

	public void setChangeTxt(String changeTxt) {
		this.changeTxt = changeTxt;
	}

	public Date getDateOn() {
		return dateOn;
	}

	public void setDateOn(Date dateOn) {
		this.dateOn = dateOn;
	}

	public void setDailyBid(String dailyBid) {
		this.dailyBid = dailyBid;
	}

	public String getDailyBid() {
		return this.dailyBid;
	}

	public void setMiscellaneous(boolean miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

	public boolean isMiscellaneous() {
		return this.miscellaneous;
	}

	public void setCapillaryRefill(boolean capillaryRefill) {
		this.capillaryRefill = capillaryRefill;
	}

	public boolean isCapillaryRefill() {
		return this.capillaryRefill;
	}

	public void setPedalPulse(boolean pedalPulse) {
		this.pedalPulse = pedalPulse;
	}

	public boolean isPedalPulse() {
		return this.pedalPulse;
	}

	public void setLocationSkinTears(String locationSkinTears) {
		this.locationSkinTears = locationSkinTears;
	}

	public String getLocationSkinTears() {
		return this.locationSkinTears;
	}

	public void setFrequencyRefill(String frequencyRefill) {
		this.frequencyRefill = frequencyRefill;
	}

	public String getFrequencyRefill() {
		return this.frequencyRefill;
	}

	public void setLocationPedalPulse(String locationPedalPulse) {
		this.locationPedalPulse = locationPedalPulse;
	}

	public String getLocationPedalPulse() {
		return this.locationPedalPulse;
	}

	public void setFrequencyPedalPulse(String frequencyPedalPulse) {
		this.frequencyPedalPulse = frequencyPedalPulse;
	}

	public String getFrequencyPedalPulse() {
		return this.frequencyPedalPulse;
	}

}
