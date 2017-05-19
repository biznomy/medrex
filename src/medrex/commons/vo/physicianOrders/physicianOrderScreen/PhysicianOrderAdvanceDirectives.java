package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderAdvanceDirectives")
public class PhysicianOrderAdvanceDirectives implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1007072934865107739L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "advancedDirective")
	private String advancedDirective;

	@Column(name = "onFile")
	private boolean onFile;

	@Column(name = "willPronde")
	private boolean willPronde;

	@Column(name = "wishesToDiscuss")
	private boolean wishesToDiscuss;

	@Column(name = "notInterested")
	private boolean notInterested;

	@Column(name = "advanceDirectivesReviewed")
	private boolean advanceDirectivesReviewed;

	@Column(name = "DNR")
	private String DNR;

	@Column(name = "DNH")
	private String DNH;

	@Column(name = "wishes")
	private String wishes;

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getSerial() {
		return serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setAdvancedDirective(String advancedDirective) {
		this.advancedDirective = advancedDirective;
	}

	public String getAdvancedDirective() {
		return advancedDirective;
	}

	public void setOnFile(boolean onFile) {
		this.onFile = onFile;
	}

	public boolean isOnFile() {
		return onFile;
	}

	public void setWillPronde(boolean willPronde) {
		this.willPronde = willPronde;
	}

	public boolean isWillPronde() {
		return willPronde;
	}

	public void setWishesToDiscuss(boolean wishesToDiscuss) {
		this.wishesToDiscuss = wishesToDiscuss;
	}

	public boolean isWishesToDiscuss() {
		return wishesToDiscuss;
	}

	public void setNotInterested(boolean notInterested) {
		this.notInterested = notInterested;
	}

	public boolean isNotInterested() {
		return notInterested;
	}

	public void setAdvanceDirectivesReviewed(boolean advanceDirectivesReviewed) {
		this.advanceDirectivesReviewed = advanceDirectivesReviewed;
	}

	public boolean isAdvanceDirectivesReviewed() {
		return advanceDirectivesReviewed;
	}

	public void setDNR(String dNR) {
		DNR = dNR;
	}

	public String getDNR() {
		return DNR;
	}

	public String getDNH() {
		return DNH;
	}

	public void setDNH(String dNH) {
		DNH = dNH;
	}

	public String getWishes() {
		return wishes;
	}

	public void setWishes(String wishes) {
		this.wishes = wishes;
	}

}
