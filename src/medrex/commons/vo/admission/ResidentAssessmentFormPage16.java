package medrex.commons.vo.admission;

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
@Table(name = "ResidentAssessmentFormPage16")
public class ResidentAssessmentFormPage16 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6058304251399514834L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "water")
	private int water;
	@Column(name = "juice")
	private int juice;
	@Column(name = "applesauce")
	private boolean applesauce;
	@Column(name = "pudding")
	private boolean pudding;
	@Column(name = "other")
	private boolean other;
	@Column(name = "otherContent")
	private String otherContent;
	@Column(name = "blind")
	private String blind;
	@Column(name = "deaf")
	private String deaf;
	@Column(name = "hohR")
	private String hohR;
	@Column(name = "hohI")
	private String hohI;
	@Column(name = "eyeGlasses")
	private String eyeGlasses;
	@Column(name = "hearingAid")
	private String hearingAid;
	@Column(name = "npo")
	private boolean npo;
	@Column(name = "nectar")
	private boolean nectar;
	@Column(name = "fluidRestriction")
	private boolean fluidRestriction;
	@Column(name = "syrup")
	private boolean syrup;
	@Column(name = "honey")
	private boolean honey;
	@Column(name = "gTube")
	private boolean gTube;
	@Column(name = "crushMeds")
	private boolean crushMeds;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "comment")
	private Notes comment;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "room")
	private String room;
	@Column(name = "dateFilledOut")
	private Date dateFilledOut;
	@Column(name = "updated1")
	private String updated1;
	@Column(name = "updated2")
	private String updated2;
	@Column(name = "updated3")
	private String updated3;
	@Column(name = "formId")
	private int formId;
	@Column(name = "residentId")
	private int residentId;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getWater() {
		return water;
	}

	public boolean isFluidRestriction() {
		return fluidRestriction;
	}

	public void setFluidRestriction(boolean fluidRestriction) {
		this.fluidRestriction = fluidRestriction;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getJuice() {
		return juice;
	}

	public void setJuice(int juice) {
		this.juice = juice;
	}

	public boolean isApplesauce() {
		return applesauce;
	}

	public void setApplesauce(boolean applesauce) {
		this.applesauce = applesauce;
	}

	public boolean isPudding() {
		return pudding;
	}

	public void setPudding(boolean pudding) {
		this.pudding = pudding;
	}

	public boolean isOther() {
		return other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public String getOtherContent() {
		return otherContent;
	}

	public void setOtherContent(String otherContent) {
		this.otherContent = otherContent;
	}

	public String getBlind() {
		return blind;
	}

	public void setBlind(String blind) {
		this.blind = blind;
	}

	public String getDeaf() {
		return deaf;
	}

	public void setDeaf(String deaf) {
		this.deaf = deaf;
	}

	public String getHohR() {
		return hohR;
	}

	public void setHohR(String hohR) {
		this.hohR = hohR;
	}

	public String getHohI() {
		return hohI;
	}

	public void setHohI(String hohI) {
		this.hohI = hohI;
	}

	public String getEyeGlasses() {
		return eyeGlasses;
	}

	public void setEyeGlasses(String eyeGlasses) {
		this.eyeGlasses = eyeGlasses;
	}

	public String getHearingAid() {
		return hearingAid;
	}

	public void setHearingAid(String hearingAid) {
		this.hearingAid = hearingAid;
	}

	public boolean isNpo() {
		return npo;
	}

	public void setNpo(boolean npo) {
		this.npo = npo;
	}

	public boolean isNectar() {
		return nectar;
	}

	public void setNectar(boolean nectar) {
		this.nectar = nectar;
	}

	public boolean isSyrup() {
		return syrup;
	}

	public void setSyrup(boolean syrup) {
		this.syrup = syrup;
	}

	public boolean isHoney() {
		return honey;
	}

	public void setHoney(boolean honey) {
		this.honey = honey;
	}

	public boolean isGTube() {
		return gTube;
	}

	public void setGTube(boolean tube) {
		gTube = tube;
	}

	public boolean isCrushMeds() {
		return crushMeds;
	}

	public void setCrushMeds(boolean crushMeds) {
		this.crushMeds = crushMeds;
	}

	public Notes getComment() {
		return comment;
	}

	public void setComment(Notes comment) {
		this.comment = comment;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Date getDateFilledOut() {
		return dateFilledOut;
	}

	public void setDateFilledOut(Date dateFilledOut) {
		this.dateFilledOut = dateFilledOut;
	}

	public String getUpdated1() {
		return updated1;
	}

	public void setUpdated1(String updated1) {
		this.updated1 = updated1;
	}

	public String getUpdated2() {
		return updated2;
	}

	public void setUpdated2(String updated2) {
		this.updated2 = updated2;
	}

	public String getUpdated3() {
		return updated3;
	}

	public void setUpdated3(String updated3) {
		this.updated3 = updated3;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

}
