package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DailySkilledNursesNotesForm2")
public class DailySkilledNursesNotesForm2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -174411869031429048L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "formID")
	private int formID;

	@Column(name = "selfShift1Mobility")
	private int selfShift1Mobility;

	@Column(name = "selfShift1Transfer")
	private int selfShift1Transfer;

	@Column(name = "selfShift1Dressing")
	private int selfShift1Dressing;

	@Column(name = "selfShift1Eating")
	private int selfShift1Eating;

	@Column(name = "selfShift1Hygiene")
	private int selfShift1Hygiene;

	@Column(name = "selfShift1Bathing")
	private int selfShift1Bathing;

	@Column(name = "selfShift1Toilet")
	private int selfShift1Toilet;

	@Column(name = "selfShift1Ambulation")
	private int selfShift1Ambulation;

	@Column(name = "selfShift1WCAmbulation")
	private int selfShift1WCAmbulation;

	// Support

	@Column(name = "supportShift1Mobility")
	private int supportShift1Mobility;

	@Column(name = "supportShift1Transfer")
	private int supportShift1Transfer;

	@Column(name = "supportShift1Dressing")
	private int supportShift1Dressing;

	@Column(name = "supportShift1Eating")
	private int supportShift1Eating;

	@Column(name = "supportShift1Hygiene")
	private int supportShift1Hygiene;

	@Column(name = "supportShift1Bathing")
	private int supportShift1Bathing;

	@Column(name = "supportShift1Toilet")
	private int supportShift1Toilet;

	@Column(name = "supportShift1Ambulation")
	private int supportShift1Ambulation;

	@Column(name = "supportShift1WCAmbulation")
	private int supportShift1WCAmbulation;

	// Check Boxes

	@Column(name = "walkerShift1")
	private Boolean walkerShift1;

	@Column(name = "caneShift1")
	private Boolean caneShift1;

	@Column(name = "slideBoardShift1")
	private Boolean slideBoardShift1;

	@Column(name = "manuallyShift1")
	private Boolean manuallyShift1;

	@Column(name = "mechanicallyShift1")
	private Boolean mechanicallyShift1;

	// shift2

	@Column(name = "selfShift2Mobility")
	private int selfShift2Mobility;

	@Column(name = "selfShift2Transfer")
	private int selfShift2Transfer;

	@Column(name = "selfShift2Dressing")
	private int selfShift2Dressing;

	@Column(name = "selfShift2Eating")
	private int selfShift2Eating;

	@Column(name = "selfShift2Hygiene")
	private int selfShift2Hygiene;

	@Column(name = "selfShift2Bathing")
	private int selfShift2Bathing;

	@Column(name = "selfShift2Toilet")
	private int selfShift2Toilet;

	@Column(name = "selfShift2Ambulation")
	private int selfShift2Ambulation;

	@Column(name = "selfShift2WCAmbulation")
	private int selfShift2WCAmbulation;

	// Support

	@Column(name = "supportShift2Mobility")
	private int supportShift2Mobility;

	@Column(name = "supportShift2Transfer")
	private int supportShift2Transfer;

	@Column(name = "supportShift2Dressing")
	private int supportShift2Dressing;

	@Column(name = "supportShift2Eating")
	private int supportShift2Eating;

	@Column(name = "supportShift2Hygiene")
	private int supportShift2Hygiene;

	@Column(name = "supportShift2Bathing")
	private int supportShift2Bathing;

	@Column(name = "supportShift2Toilet")
	private int supportShift2Toilet;

	@Column(name = "supportShift2Ambulation")
	private int supportShift2Ambulation;

	@Column(name = "supportShift2WCAmbulation")
	private int supportShift2WCAmbulation;

	// Check Boxes

	@Column(name = "walkerShift2")
	private Boolean walkerShift2;

	@Column(name = "caneShift2")
	private Boolean caneShift2;

	@Column(name = "slideBoardShift2")
	private Boolean slideBoardShift2;

	@Column(name = "manuallyShift2")
	private Boolean manuallyShift2;

	@Column(name = "mechanicallyShift2")
	private Boolean mechanicallyShift2;

	// shift 3

	@Column(name = "selfShift3Mobility")
	private int selfShift3Mobility;

	@Column(name = "selfShift3Transfer")
	private int selfShift3Transfer;

	@Column(name = "selfShift3Dressing")
	private int selfShift3Dressing;

	@Column(name = "selfShift3Eating")
	private int selfShift3Eating;

	@Column(name = "selfShift3Hygiene")
	private int selfShift3Hygiene;

	@Column(name = "selfShift3Bathing")
	private int selfShift3Bathing;

	@Column(name = "selfShift3Toilet")
	private int selfShift3Toilet;

	@Column(name = "selfShift3Ambulation")
	private int selfShift3Ambulation;

	@Column(name = "selfShift3WCAmbulation")
	private int selfShift3WCAmbulation;

	// Support

	@Column(name = "supportShift3Mobility")
	private int supportShift3Mobility;

	@Column(name = "supportShift3Transfer")
	private int supportShift3Transfer;

	@Column(name = "supportShift3Dressing")
	private int supportShift3Dressing;

	@Column(name = "supportShift3Eating")
	private int supportShift3Eating;

	@Column(name = "supportShift3Hygiene")
	private int supportShift3Hygiene;

	@Column(name = "supportShift3Bathing")
	private int supportShift3Bathing;

	@Column(name = "supportShift3Toilet")
	private int supportShift3Toilet;

	@Column(name = "supportShift3Ambulation")
	private int supportShift3Ambulation;

	@Column(name = "supportShift3WCAmbulation")
	private int supportShift3WCAmbulation;

	// Check Boxes

	@Column(name = "walkerShift3")
	private Boolean walkerShift3;

	@Column(name = "caneShift3")
	private Boolean caneShift3;

	@Column(name = "slideBoardShift3")
	private Boolean slideBoardShift3;

	@Column(name = "manuallyShift3")
	private Boolean manuallyShift3;

	@Column(name = "mechanicallyShift3")
	private Boolean mechanicallyShift3;

	// getter setters
	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getFormID() {
		return formID;
	}

	public void setFormID(int formID) {
		this.formID = formID;
	}

	public int getSelfShift1Mobility() {
		return selfShift1Mobility;
	}

	public void setSelfShift1Mobility(int selfShift1Mobility) {
		this.selfShift1Mobility = selfShift1Mobility;
	}

	public int getSelfShift1Transfer() {
		return selfShift1Transfer;
	}

	public void setSelfShift1Transfer(int selfShift1Transfer) {
		this.selfShift1Transfer = selfShift1Transfer;
	}

	public int getSelfShift1Dressing() {
		return selfShift1Dressing;
	}

	public void setSelfShift1Dressing(int selfShift1Dressing) {
		this.selfShift1Dressing = selfShift1Dressing;
	}

	public int getSelfShift1Eating() {
		return selfShift1Eating;
	}

	public void setSelfShift1Eating(int selfShift1Eating) {
		this.selfShift1Eating = selfShift1Eating;
	}

	public int getSelfShift1Hygiene() {
		return selfShift1Hygiene;
	}

	public void setSelfShift1Hygiene(int selfShift1Hygiene) {
		this.selfShift1Hygiene = selfShift1Hygiene;
	}

	public int getSelfShift1Bathing() {
		return selfShift1Bathing;
	}

	public void setSelfShift1Bathing(int selfShift1Bathing) {
		this.selfShift1Bathing = selfShift1Bathing;
	}

	public int getSelfShift1Toilet() {
		return selfShift1Toilet;
	}

	public void setSelfShift1Toilet(int selfShift1Toilet) {
		this.selfShift1Toilet = selfShift1Toilet;
	}

	public int getSelfShift1Ambulation() {
		return selfShift1Ambulation;
	}

	public void setSelfShift1Ambulation(int selfShift1Ambulation) {
		this.selfShift1Ambulation = selfShift1Ambulation;
	}

	public int getSelfShift1WCAmbulation() {
		return selfShift1WCAmbulation;
	}

	public void setSelfShift1WCAmbulation(int selfShift1WCAmbulation) {
		this.selfShift1WCAmbulation = selfShift1WCAmbulation;
	}

	public int getSupportShift1Mobility() {
		return supportShift1Mobility;
	}

	public void setSupportShift1Mobility(int supportShift1Mobility) {
		this.supportShift1Mobility = supportShift1Mobility;
	}

	public int getSupportShift1Transfer() {
		return supportShift1Transfer;
	}

	public void setSupportShift1Transfer(int supportShift1Transfer) {
		this.supportShift1Transfer = supportShift1Transfer;
	}

	public int getSupportShift1Dressing() {
		return supportShift1Dressing;
	}

	public void setSupportShift1Dressing(int supportShift1Dressing) {
		this.supportShift1Dressing = supportShift1Dressing;
	}

	public int getSupportShift1Eating() {
		return supportShift1Eating;
	}

	public void setSupportShift1Eating(int supportShift1Eating) {
		this.supportShift1Eating = supportShift1Eating;
	}

	public int getSupportShift1Hygiene() {
		return supportShift1Hygiene;
	}

	public void setSupportShift1Hygiene(int supportShift1Hygiene) {
		this.supportShift1Hygiene = supportShift1Hygiene;
	}

	public int getSupportShift1Bathing() {
		return supportShift1Bathing;
	}

	public void setSupportShift1Bathing(int supportShift1Bathing) {
		this.supportShift1Bathing = supportShift1Bathing;
	}

	public int getSupportShift1Toilet() {
		return supportShift1Toilet;
	}

	public void setSupportShift1Toilet(int supportShift1Toilet) {
		this.supportShift1Toilet = supportShift1Toilet;
	}

	public int getSupportShift1Ambulation() {
		return supportShift1Ambulation;
	}

	public void setSupportShift1Ambulation(int supportShift1Ambulation) {
		this.supportShift1Ambulation = supportShift1Ambulation;
	}

	public int getSupportShift1WCAmbulation() {
		return supportShift1WCAmbulation;
	}

	public void setSupportShift1WCAmbulation(int supportShift1WCAmbulation) {
		this.supportShift1WCAmbulation = supportShift1WCAmbulation;
	}

	public int getSelfShift2Mobility() {
		return selfShift2Mobility;
	}

	public void setSelfShift2Mobility(int selfShift2Mobility) {
		this.selfShift2Mobility = selfShift2Mobility;
	}

	public int getSelfShift2Transfer() {
		return selfShift2Transfer;
	}

	public void setSelfShift2Transfer(int selfShift2Transfer) {
		this.selfShift2Transfer = selfShift2Transfer;
	}

	public int getSelfShift2Dressing() {
		return selfShift2Dressing;
	}

	public void setSelfShift2Dressing(int selfShift2Dressing) {
		this.selfShift2Dressing = selfShift2Dressing;
	}

	public int getSelfShift2Eating() {
		return selfShift2Eating;
	}

	public void setSelfShift2Eating(int selfShift2Eating) {
		this.selfShift2Eating = selfShift2Eating;
	}

	public int getSelfShift2Hygiene() {
		return selfShift2Hygiene;
	}

	public void setSelfShift2Hygiene(int selfShift2Hygiene) {
		this.selfShift2Hygiene = selfShift2Hygiene;
	}

	public int getSelfShift2Bathing() {
		return selfShift2Bathing;
	}

	public void setSelfShift2Bathing(int selfShift2Bathing) {
		this.selfShift2Bathing = selfShift2Bathing;
	}

	public int getSelfShift2Toilet() {
		return selfShift2Toilet;
	}

	public void setSelfShift2Toilet(int selfShift2Toilet) {
		this.selfShift2Toilet = selfShift2Toilet;
	}

	public int getSelfShift2Ambulation() {
		return selfShift2Ambulation;
	}

	public void setSelfShift2Ambulation(int selfShift2Ambulation) {
		this.selfShift2Ambulation = selfShift2Ambulation;
	}

	public int getSelfShift2WCAmbulation() {
		return selfShift2WCAmbulation;
	}

	public void setSelfShift2WCAmbulation(int selfShift2WCAmbulation) {
		this.selfShift2WCAmbulation = selfShift2WCAmbulation;
	}

	public int getSupportShift2Mobility() {
		return supportShift2Mobility;
	}

	public void setSupportShift2Mobility(int supportShift2Mobility) {
		this.supportShift2Mobility = supportShift2Mobility;
	}

	public int getSupportShift2Transfer() {
		return supportShift2Transfer;
	}

	public void setSupportShift2Transfer(int supportShift2Transfer) {
		this.supportShift2Transfer = supportShift2Transfer;
	}

	public int getSupportShift2Dressing() {
		return supportShift2Dressing;
	}

	public void setSupportShift2Dressing(int supportShift2Dressing) {
		this.supportShift2Dressing = supportShift2Dressing;
	}

	public int getSupportShift2Eating() {
		return supportShift2Eating;
	}

	public void setSupportShift2Eating(int supportShift2Eating) {
		this.supportShift2Eating = supportShift2Eating;
	}

	public int getSupportShift2Hygiene() {
		return supportShift2Hygiene;
	}

	public void setSupportShift2Hygiene(int supportShift2Hygiene) {
		this.supportShift2Hygiene = supportShift2Hygiene;
	}

	public int getSupportShift2Bathing() {
		return supportShift2Bathing;
	}

	public void setSupportShift2Bathing(int supportShift2Bathing) {
		this.supportShift2Bathing = supportShift2Bathing;
	}

	public int getSupportShift2Toilet() {
		return supportShift2Toilet;
	}

	public void setSupportShift2Toilet(int supportShift2Toilet) {
		this.supportShift2Toilet = supportShift2Toilet;
	}

	public int getSupportShift2Ambulation() {
		return supportShift2Ambulation;
	}

	public void setSupportShift2Ambulation(int supportShift2Ambulation) {
		this.supportShift2Ambulation = supportShift2Ambulation;
	}

	public int getSupportShift2WCAmbulation() {
		return supportShift2WCAmbulation;
	}

	public void setSupportShift2WCAmbulation(int supportShift2WCAmbulation) {
		this.supportShift2WCAmbulation = supportShift2WCAmbulation;
	}

	public int getSelfShift3Mobility() {
		return selfShift3Mobility;
	}

	public void setSelfShift3Mobility(int selfShift3Mobility) {
		this.selfShift3Mobility = selfShift3Mobility;
	}

	public int getSelfShift3Transfer() {
		return selfShift3Transfer;
	}

	public void setSelfShift3Transfer(int selfShift3Transfer) {
		this.selfShift3Transfer = selfShift3Transfer;
	}

	public int getSelfShift3Dressing() {
		return selfShift3Dressing;
	}

	public void setSelfShift3Dressing(int selfShift3Dressing) {
		this.selfShift3Dressing = selfShift3Dressing;
	}

	public int getSelfShift3Eating() {
		return selfShift3Eating;
	}

	public void setSelfShift3Eating(int selfShift3Eating) {
		this.selfShift3Eating = selfShift3Eating;
	}

	public int getSelfShift3Hygiene() {
		return selfShift3Hygiene;
	}

	public void setSelfShift3Hygiene(int selfShift3Hygiene) {
		this.selfShift3Hygiene = selfShift3Hygiene;
	}

	public int getSelfShift3Bathing() {
		return selfShift3Bathing;
	}

	public void setSelfShift3Bathing(int selfShift3Bathing) {
		this.selfShift3Bathing = selfShift3Bathing;
	}

	public int getSelfShift3Toilet() {
		return selfShift3Toilet;
	}

	public void setSelfShift3Toilet(int selfShift3Toilet) {
		this.selfShift3Toilet = selfShift3Toilet;
	}

	public int getSelfShift3Ambulation() {
		return selfShift3Ambulation;
	}

	public void setSelfShift3Ambulation(int selfShift3Ambulation) {
		this.selfShift3Ambulation = selfShift3Ambulation;
	}

	public int getSelfShift3WCAmbulation() {
		return selfShift3WCAmbulation;
	}

	public void setSelfShift3WCAmbulation(int selfShift3WCAmbulation) {
		this.selfShift3WCAmbulation = selfShift3WCAmbulation;
	}

	public int getSupportShift3Mobility() {
		return supportShift3Mobility;
	}

	public void setSupportShift3Mobility(int supportShift3Mobility) {
		this.supportShift3Mobility = supportShift3Mobility;
	}

	public int getSupportShift3Transfer() {
		return supportShift3Transfer;
	}

	public void setSupportShift3Transfer(int supportShift3Transfer) {
		this.supportShift3Transfer = supportShift3Transfer;
	}

	public int getSupportShift3Dressing() {
		return supportShift3Dressing;
	}

	public void setSupportShift3Dressing(int supportShift3Dressing) {
		this.supportShift3Dressing = supportShift3Dressing;
	}

	public int getSupportShift3Eating() {
		return supportShift3Eating;
	}

	public void setSupportShift3Eating(int supportShift3Eating) {
		this.supportShift3Eating = supportShift3Eating;
	}

	public int getSupportShift3Hygiene() {
		return supportShift3Hygiene;
	}

	public void setSupportShift3Hygiene(int supportShift3Hygiene) {
		this.supportShift3Hygiene = supportShift3Hygiene;
	}

	public int getSupportShift3Bathing() {
		return supportShift3Bathing;
	}

	public void setSupportShift3Bathing(int supportShift3Bathing) {
		this.supportShift3Bathing = supportShift3Bathing;
	}

	public int getSupportShift3Toilet() {
		return supportShift3Toilet;
	}

	public void setSupportShift3Toilet(int supportShift3Toilet) {
		this.supportShift3Toilet = supportShift3Toilet;
	}

	public int getSupportShift3Ambulation() {
		return supportShift3Ambulation;
	}

	public void setSupportShift3Ambulation(int supportShift3Ambulation) {
		this.supportShift3Ambulation = supportShift3Ambulation;
	}

	public int getSupportShift3WCAmbulation() {
		return supportShift3WCAmbulation;
	}

	public void setSupportShift3WCAmbulation(int supportShift3WCAmbulation) {
		this.supportShift3WCAmbulation = supportShift3WCAmbulation;
	}

	public Boolean isWalkerShift1() {
		return walkerShift1;
	}

	public void setWalkerShift1(Boolean walkerShift1) {
		this.walkerShift1 = walkerShift1;
	}

	public Boolean isCaneShift1() {
		return caneShift1;
	}

	public void setCaneShift1(Boolean caneShift1) {
		this.caneShift1 = caneShift1;
	}

	public Boolean isSlideBoardShift1() {
		return slideBoardShift1;
	}

	public void setSlideBoardShift1(Boolean slideBoardShift1) {
		this.slideBoardShift1 = slideBoardShift1;
	}

	public Boolean isManuallyShift1() {
		return manuallyShift1;
	}

	public void setManuallyShift1(Boolean manuallyShift1) {
		this.manuallyShift1 = manuallyShift1;
	}

	public Boolean isMechanicallyShift1() {
		return mechanicallyShift1;
	}

	public void setMechanicallyShift1(Boolean mechanicallyShift1) {
		this.mechanicallyShift1 = mechanicallyShift1;
	}

	public Boolean isWalkerShift2() {
		return walkerShift2;
	}

	public void setWalkerShift2(Boolean walkerShift2) {
		this.walkerShift2 = walkerShift2;
	}

	public Boolean isCaneShift2() {
		return caneShift2;
	}

	public void setCaneShift2(Boolean caneShift2) {
		this.caneShift2 = caneShift2;
	}

	public Boolean isSlideBoardShift2() {
		return slideBoardShift2;
	}

	public void setSlideBoardShift2(Boolean slideBoardShift2) {
		this.slideBoardShift2 = slideBoardShift2;
	}

	public Boolean isManuallyShift2() {
		return manuallyShift2;
	}

	public void setManuallyShift2(Boolean manuallyShift2) {
		this.manuallyShift2 = manuallyShift2;
	}

	public Boolean isMechanicallyShift2() {
		return mechanicallyShift2;
	}

	public void setMechanicallyShift2(Boolean mechanicallyShift2) {
		this.mechanicallyShift2 = mechanicallyShift2;
	}

	public Boolean isWalkerShift3() {
		return walkerShift3;
	}

	public void setWalkerShift3(Boolean walkerShift3) {
		this.walkerShift3 = walkerShift3;
	}

	public Boolean isCaneShift3() {
		return caneShift3;
	}

	public void setCaneShift3(Boolean caneShift3) {
		this.caneShift3 = caneShift3;
	}

	public Boolean isSlideBoardShift3() {
		return slideBoardShift3;
	}

	public void setSlideBoardShift3(Boolean slideBoardShift3) {
		this.slideBoardShift3 = slideBoardShift3;
	}

	public Boolean isManuallyShift3() {
		return manuallyShift3;
	}

	public void setManuallyShift3(Boolean manuallyShift3) {
		this.manuallyShift3 = manuallyShift3;
	}

	public Boolean isMechanicallyShift3() {
		return mechanicallyShift3;
	}

	public void setMechanicallyShift3(Boolean mechanicallyShift3) {
		this.mechanicallyShift3 = mechanicallyShift3;
	}

	// getter Setters

}
