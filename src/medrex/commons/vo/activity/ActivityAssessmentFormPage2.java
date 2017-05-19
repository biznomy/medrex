package medrex.commons.vo.activity;

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

@Entity
@Table(name = "ActivityAssessmentFormPage2")
public class ActivityAssessmentFormPage2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4640249237045828898L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "orientedDis")
	private boolean orientedDis;
	@Column(name = "orientedObject")
	private boolean orientedObject;
	@Column(name = "orientedSituation")
	private boolean orientedSituation;
	@Column(name = "orientedTime")
	private boolean orientedTime;
	@Column(name = "orientedPlace")
	private boolean orientedPlace;
	@Column(name = "orientedPerson")
	private boolean orientedPerson;
	@Column(name = "shortCategory")
	private int shortCategory;
	@Column(name = "liquids")
	private int liquids;
	@Column(name = "type")
	private int type;
	@Column(name = "consistency")
	private int consistency;
	@Column(name = "cooperative")
	private boolean cooperative;
	@Column(name = "cheerful")
	private boolean cheerful;
	@Column(name = "humorous")
	private boolean humorous;
	@Column(name = "motivated")
	private boolean uncooperative;
	@Column(name = "withdrawn")
	private boolean withdrawn;
	@Column(name = "tearful")
	private boolean tearful;
	@Column(name = "repverb")
	private boolean repverb;
	@Column(name = "dwells")
	private boolean dwells;
	@Column(name = "agitation")
	private boolean agitation;
	@Column(name = "aggression")
	private boolean aggression;
	@Column(name = "unresponsive")
	private boolean unresponsive;
	@Column(name = "uncooperative")
	private boolean motivated;
	@Column(name = "nurseVisit")
	private Date nurseVisit;
	@Column(name = "nurse")
	private String nurse;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "commentsArea")
	private Notes commentsArea;
	@Column(name = "commCategory")
	private int commCategory;
	@Column(name = "conFusionYesNo")
	private int conFusionYesNo;
	@Column(name = "yesNoGroup")
	private int yesNoGroup;
	@Column(name = "regularlyNaps")
	private int regularlyNaps;
	@Column(name = "prefers")
	private int prefers;
	@Column(name = "formId")
	private int formId;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public boolean isOrientedDis() {
		return orientedDis;
	}

	public void setOrientedDis(boolean orientedDis) {
		this.orientedDis = orientedDis;
	}

	public boolean isOrientedObject() {
		return orientedObject;
	}

	public void setOrientedObject(boolean orientedObject) {
		this.orientedObject = orientedObject;
	}

	public boolean isOrientedSituation() {
		return orientedSituation;
	}

	public void setOrientedSituation(boolean orientedSituation) {
		this.orientedSituation = orientedSituation;
	}

	public boolean isOrientedTime() {
		return orientedTime;
	}

	public void setOrientedTime(boolean orientedTime) {
		this.orientedTime = orientedTime;
	}

	public boolean isOrientedPlace() {
		return orientedPlace;
	}

	public void setOrientedPlace(boolean orientedPlace) {
		this.orientedPlace = orientedPlace;
	}

	public boolean isOrientedPerson() {
		return orientedPerson;
	}

	public void setOrientedPerson(boolean orientedPerson) {
		this.orientedPerson = orientedPerson;
	}

	public int getShortCategory() {
		return shortCategory;
	}

	public void setShortCategory(int shortCategory) {
		this.shortCategory = shortCategory;
	}

	public int getLiquids() {
		return liquids;
	}

	public void setLiquids(int liquids) {
		this.liquids = liquids;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getConsistency() {
		return consistency;
	}

	public void setConsistency(int consistency) {
		this.consistency = consistency;
	}

	public boolean isCooperative() {
		return cooperative;
	}

	public void setCooperative(boolean cooperative) {
		this.cooperative = cooperative;
	}

	public boolean isCheerful() {
		return cheerful;
	}

	public void setCheerful(boolean cheerful) {
		this.cheerful = cheerful;
	}

	public boolean isHumorous() {
		return humorous;
	}

	public void setHumorous(boolean humorous) {
		this.humorous = humorous;
	}

	public boolean isUncooperative() {
		return uncooperative;
	}

	public void setUncooperative(boolean uncooperative) {
		this.uncooperative = uncooperative;
	}

	public boolean isWithdrawn() {
		return withdrawn;
	}

	public void setWithdrawn(boolean withdrawn) {
		this.withdrawn = withdrawn;
	}

	public boolean isTearful() {
		return tearful;
	}

	public void setTearful(boolean tearful) {
		this.tearful = tearful;
	}

	public boolean isRepverb() {
		return repverb;
	}

	public void setRepverb(boolean repverb) {
		this.repverb = repverb;
	}

	public boolean isDwells() {
		return dwells;
	}

	public void setDwells(boolean dwells) {
		this.dwells = dwells;
	}

	public boolean isAgitation() {
		return agitation;
	}

	public void setAgitation(boolean agitation) {
		this.agitation = agitation;
	}

	public boolean isAggression() {
		return aggression;
	}

	public void setAggression(boolean aggression) {
		this.aggression = aggression;
	}

	public boolean isUnresponsive() {
		return unresponsive;
	}

	public void setUnresponsive(boolean unresponsive) {
		this.unresponsive = unresponsive;
	}

	public boolean isMotivated() {
		return motivated;
	}

	public void setMotivated(boolean motivated) {
		this.motivated = motivated;
	}

	public Date getNurseVisit() {
		return nurseVisit;
	}

	public void setNurseVisit(Date nurseVisit) {
		this.nurseVisit = nurseVisit;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public Notes getCommentsArea() {
		return commentsArea;
	}

	public void setCommentsArea(Notes commentsArea) {
		this.commentsArea = commentsArea;
	}

	public int getCommCategory() {
		return commCategory;
	}

	public void setCommCategory(int commCategory) {
		this.commCategory = commCategory;
	}

	public int getConFusionYesNo() {
		return conFusionYesNo;
	}

	public void setConFusionYesNo(int conFusionYesNo) {
		this.conFusionYesNo = conFusionYesNo;
	}

	public int getYesNoGroup() {
		return yesNoGroup;
	}

	public void setYesNoGroup(int yesNoGroup) {
		this.yesNoGroup = yesNoGroup;
	}

	public int getRegularlyNaps() {
		return regularlyNaps;
	}

	public void setRegularlyNaps(int regularlyNaps) {
		this.regularlyNaps = regularlyNaps;
	}

	public int getPrefers() {
		return prefers;
	}

	public void setPrefers(int prefers) {
		this.prefers = prefers;
	}
}
