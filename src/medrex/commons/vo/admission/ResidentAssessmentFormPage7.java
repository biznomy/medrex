package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage7")
public class ResidentAssessmentFormPage7 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7965116694638086122L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "nurseVisit")
	private Date nurseVisit;
	@Column(name = "nurse")
	private String nurse;
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "roomNo")
	private String roomNo;

	@Column(name = "scaleType")
	private int scaleType;

	@Column(name = "flaccValues")
	private String flaccValues;

	@Column(name = "presentValue")
	private int presentValue;

	@Column(name = "painQ1")
	private int painQ1;
	@Column(name = "painQ2")
	private int painQ2;
	@Column(name = "painQ3")
	private int painQ3;
	@Column(name = "painQ4")
	private int painQ4;
	@Column(name = "painQ5")
	private int painQ5;
	@Column(name = "painQ6")
	private int painQ6;
	@Column(name = "origin")
	private String origin;
	@Column(name = "location")
	private String location;
	@Column(name = "painLevel")
	private String painLevel;
	@Column(name = "painLevelPresent")
	private String painLevelPresent;
	@Column(name = "painLevelBest")
	private String painLevelBest;
	@Column(name = "painLevelWorst")
	private String painLevelWorst;
	@Column(name = "onsetAcute")
	private boolean onsetAcute;
	@Column(name = "onsetChronic")
	private boolean onsetChronic;
	@Column(name = "onsetSudden")
	private boolean onsetSudden;
	@Column(name = "onsetGradual")
	private boolean onsetGradual;
	@Column(name = "durationIntermittent")
	private boolean durationIntermittent;
	@Column(name = "durationChanging")
	private boolean durationChanging;
	@Column(name = "durationConstant")
	private boolean durationConstant;
	@Column(name = "qualityNeuropathic")
	private boolean qualityNeuropathic;
	@Column(name = "qualityHurts")
	private boolean qualityHurts;
	@Column(name = "qualityTingling")
	private boolean qualityTingling;
	@Column(name = "qualityCramping")
	private boolean qualityCramping;
	@Column(name = "qualityTightness")
	private boolean qualityTightness;
	@Column(name = "qualityShooting")
	private boolean qualityShooting;
	@Column(name = "qualityStabbing")
	private boolean qualityStabbing;
	@Column(name = "qualityBurning")
	private boolean qualityBurning;
	@Column(name = "qualityPulling")
	private boolean qualityPulling;
	@Column(name = "qualityThrobbing")
	private boolean qualityThrobbing;
	@Column(name = "qualityAche")
	private boolean qualityAche;
	@Column(name = "qualitySharp")
	private boolean qualitySharp;
	@Column(name = "qualityDull")
	private boolean qualityDull;
	@Column(name = "exhibitsDecreased")
	private boolean exhibitsDecreased;
	@Column(name = "exhibitsRubbingMotion")
	private boolean exhibitsRubbingMotion;
	@Column(name = "exhibitsResistant")
	private boolean exhibitsResistant;
	@Column(name = "exhibitsAgitation")
	private boolean exhibitsAgitation;
	@Column(name = "exhibitsChange")
	private boolean exhibitsChange;
	@Column(name = "exhibitsIrritability")
	private boolean exhibitsIrritability;
	@Column(name = "exhibitsPacing")
	private boolean exhibitsPacing;
	@Column(name = "exhibitsYelling")
	private boolean exhibitsYelling;
	@Column(name = "exhibitsGrinding")
	private boolean exhibitsGrinding;
	@Column(name = "exhibitsGrimacing")
	private boolean exhibitsGrimacing;
	@Column(name = "exhibitsMoaning")
	private boolean exhibitsMoaning;
	@Column(name = "exhibitsCrying")
	private boolean exhibitsCrying;

	@Column(name = "unableToAnswer")
	private boolean unableToAnswer;

	@Column(name = "comment")
	private String comment;

	@Column(name = "CoordinateX")
	private int x;
	@Column(name = "CoordinateY")
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public Date getNurseVisit() {
		return nurseVisit;
	}

	public void setNurseVisit(Date nurseVisit) {
		this.nurseVisit = nurseVisit;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public int getPainQ1() {
		return painQ1;
	}

	public void setPainQ1(int painQ1) {
		this.painQ1 = painQ1;
	}

	public int getPainQ2() {
		return painQ2;
	}

	public void setPainQ2(int painQ2) {
		this.painQ2 = painQ2;
	}

	public int getPainQ3() {
		return painQ3;
	}

	public void setPainQ3(int painQ3) {
		this.painQ3 = painQ3;
	}

	public int getPainQ4() {
		return painQ4;
	}

	public void setPainQ4(int painQ4) {
		this.painQ4 = painQ4;
	}

	public int getPainQ5() {
		return painQ5;
	}

	public void setPainQ5(int painQ5) {
		this.painQ5 = painQ5;
	}

	public int getPainQ6() {
		return painQ6;
	}

	public void setPainQ6(int painQ6) {
		this.painQ6 = painQ6;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPainLevel() {
		return painLevel;
	}

	public void setPainLevel(String painLevel) {
		this.painLevel = painLevel;
	}

	public String getPainLevelPresent() {
		return painLevelPresent;
	}

	public void setPainLevelPresent(String painLevelPresent) {
		this.painLevelPresent = painLevelPresent;
	}

	public String getPainLevelBest() {
		return painLevelBest;
	}

	public void setPainLevelBest(String painLevelBest) {
		this.painLevelBest = painLevelBest;
	}

	public String getPainLevelWorst() {
		return painLevelWorst;
	}

	public void setPainLevelWorst(String painLevelWorst) {
		this.painLevelWorst = painLevelWorst;
	}

	public boolean isOnsetAcute() {
		return onsetAcute;
	}

	public void setOnsetAcute(boolean onsetAcute) {
		this.onsetAcute = onsetAcute;
	}

	public boolean isOnsetChronic() {
		return onsetChronic;
	}

	public void setOnsetChronic(boolean onsetChronic) {
		this.onsetChronic = onsetChronic;
	}

	public boolean isOnsetSudden() {
		return onsetSudden;
	}

	public void setOnsetSudden(boolean onsetSudden) {
		this.onsetSudden = onsetSudden;
	}

	public boolean isOnsetGradual() {
		return onsetGradual;
	}

	public void setOnsetGradual(boolean onsetGradual) {
		this.onsetGradual = onsetGradual;
	}

	public boolean isDurationIntermittent() {
		return durationIntermittent;
	}

	public void setDurationIntermittent(boolean durationIntermittent) {
		this.durationIntermittent = durationIntermittent;
	}

	public boolean isDurationChanging() {
		return durationChanging;
	}

	public void setDurationChanging(boolean durationChanging) {
		this.durationChanging = durationChanging;
	}

	public boolean isDurationConstant() {
		return durationConstant;
	}

	public void setDurationConstant(boolean durationConstant) {
		this.durationConstant = durationConstant;
	}

	public boolean isQualityNeuropathic() {
		return qualityNeuropathic;
	}

	public void setQualityNeuropathic(boolean qualityNeuropthic) {
		this.qualityNeuropathic = qualityNeuropthic;
	}

	public boolean isQualityHurts() {
		return qualityHurts;
	}

	public void setQualityHurts(boolean qualityHurts) {
		this.qualityHurts = qualityHurts;
	}

	public boolean isQualityTingling() {
		return qualityTingling;
	}

	public void setQualityTingling(boolean qualityTingling) {
		this.qualityTingling = qualityTingling;
	}

	public boolean isQualityCramping() {
		return qualityCramping;
	}

	public void setQualityCramping(boolean qualityCramping) {
		this.qualityCramping = qualityCramping;
	}

	public boolean isQualityTightness() {
		return qualityTightness;
	}

	public void setQualityTightness(boolean qualityTightness) {
		this.qualityTightness = qualityTightness;
	}

	public boolean isQualityShooting() {
		return qualityShooting;
	}

	public void setQualityShooting(boolean qualityShooting) {
		this.qualityShooting = qualityShooting;
	}

	public boolean isQualityStabbing() {
		return qualityStabbing;
	}

	public void setQualityStabbing(boolean qualityStabbing) {
		this.qualityStabbing = qualityStabbing;
	}

	public boolean isQualityBurning() {
		return qualityBurning;
	}

	public void setQualityBurning(boolean qualityBurning) {
		this.qualityBurning = qualityBurning;
	}

	public boolean isQualityPulling() {
		return qualityPulling;
	}

	public void setQualityPulling(boolean qualityPulling) {
		this.qualityPulling = qualityPulling;
	}

	public boolean isQualityThrobbing() {
		return qualityThrobbing;
	}

	public void setQualityThrobbing(boolean qualityThrobbing) {
		this.qualityThrobbing = qualityThrobbing;
	}

	public boolean isQualityAche() {
		return qualityAche;
	}

	public void setQualityAche(boolean qualityAche) {
		this.qualityAche = qualityAche;
	}

	public boolean isQualitySharp() {
		return qualitySharp;
	}

	public void setQualitySharp(boolean qualitySharp) {
		this.qualitySharp = qualitySharp;
	}

	public boolean isQualityDull() {
		return qualityDull;
	}

	public void setQualityDull(boolean qualityDull) {
		this.qualityDull = qualityDull;
	}

	public boolean isExhibitsDecreased() {
		return exhibitsDecreased;
	}

	public void setExhibitsDecreased(boolean exhibitsDecreased) {
		this.exhibitsDecreased = exhibitsDecreased;
	}

	public boolean isExhibitsRubbingMotion() {
		return exhibitsRubbingMotion;
	}

	public void setExhibitsRubbingMotion(boolean exhibitsRubbingMotion) {
		this.exhibitsRubbingMotion = exhibitsRubbingMotion;
	}

	public boolean isExhibitsResistant() {
		return exhibitsResistant;
	}

	public void setExhibitsResistant(boolean exhibitsResistant) {
		this.exhibitsResistant = exhibitsResistant;
	}

	public boolean isExhibitsAgitation() {
		return exhibitsAgitation;
	}

	public void setExhibitsAgitation(boolean exhibitsAgitation) {
		this.exhibitsAgitation = exhibitsAgitation;
	}

	public boolean isExhibitsChange() {
		return exhibitsChange;
	}

	public void setExhibitsChange(boolean exhibitsChange) {
		this.exhibitsChange = exhibitsChange;
	}

	public boolean isExhibitsIrritability() {
		return exhibitsIrritability;
	}

	public void setExhibitsIrritability(boolean exhibitsIrritability) {
		this.exhibitsIrritability = exhibitsIrritability;
	}

	public boolean isExhibitsPacing() {
		return exhibitsPacing;
	}

	public void setExhibitsPacing(boolean exhibitsPacing) {
		this.exhibitsPacing = exhibitsPacing;
	}

	public boolean isExhibitsYelling() {
		return exhibitsYelling;
	}

	public void setExhibitsYelling(boolean exhibitsYelling) {
		this.exhibitsYelling = exhibitsYelling;
	}

	public boolean isExhibitsGrinding() {
		return exhibitsGrinding;
	}

	public void setExhibitsGrinding(boolean exhibitsGrinding) {
		this.exhibitsGrinding = exhibitsGrinding;
	}

	public boolean isExhibitsGrimacing() {
		return exhibitsGrimacing;
	}

	public void setExhibitsGrimacing(boolean exhibitsGrimacing) {
		this.exhibitsGrimacing = exhibitsGrimacing;
	}

	public boolean isExhibitsMoaning() {
		return exhibitsMoaning;
	}

	public void setExhibitsMoaning(boolean exhibitsMoaning) {
		this.exhibitsMoaning = exhibitsMoaning;
	}

	public boolean isExhibitsCrying() {
		return exhibitsCrying;
	}

	public void setExhibitsCrying(boolean exhibitsCrying) {
		this.exhibitsCrying = exhibitsCrying;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isUnableToAnswer() {
		return unableToAnswer;
	}

	public void setUnableToAnswer(boolean unableToAnswer) {
		this.unableToAnswer = unableToAnswer;
	}

	public String getFlaccValues() {
		return flaccValues;
	}

	public void setFlaccValues(String flaccValues) {
		this.flaccValues = flaccValues;
	}

	public int getPresentValue() {
		return presentValue;
	}

	public void setPresentValue(int presentValue) {
		this.presentValue = presentValue;
	}

	public int getScaleType() {
		return scaleType;
	}

	public void setScaleType(int scaleType) {
		this.scaleType = scaleType;
	}
}
