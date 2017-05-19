package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianOrderForm2")
public class PhysicianOrderForm2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2264131516671884196L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "aboveOrdersNotedDate")
	private Date aboveOrdersNotedDate;
	@Column(name = "aboveOrdersNoted")
	private String aboveOrdersNoted;
	@Column(name = "physicianSignDate")
	private Date physicianSignDate;
	@Column(name = "physicianSign")
	private String physicianSign;
	@Column(name = "aboveOrdersDate")
	private Date aboveOrdersDate;
	@Column(name = "aboveOrdersField")
	private String aboveOrdersField;
	@Column(name = "foleyDx")
	private int foleyDx;
	@Column(name = "foleyDxOtherField")
	private String foleyDxOtherField;
	@Column(name = "weigh")
	private int weigh;
	@Column(name = "dietaryConsult")
	private String dietaryConsult;
	@Column(name = "fluidRest")
	private String fluidRest;
	@Column(name = "supplements")
	private String supplements;
	@Column(name = "thickLiquids")
	private int thickLiquids;
	@Column(name = "circleOne")
	private int circleOne;
	@Column(name = "diet")
	private int diet;
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	@Column(name = "ssn03")
	private String ssn03;
	@Column(name = "ssn02")
	private String ssn02;
	@Column(name = "ssn01")
	private String ssn01;
	@Column(name = "admission")
	private int admission;

	public Date getAboveOrdersDate() {
		return aboveOrdersDate;
	}

	public void setAboveOrdersDate(Date aboveOrdersDate) {
		this.aboveOrdersDate = aboveOrdersDate;
	}

	public String getAboveOrdersField() {
		return aboveOrdersField;
	}

	public void setAboveOrdersField(String aboveOrdersField) {
		this.aboveOrdersField = aboveOrdersField;
	}

	public String getAboveOrdersNoted() {
		return aboveOrdersNoted;
	}

	public void setAboveOrdersNoted(String aboveOrdersNoted) {
		this.aboveOrdersNoted = aboveOrdersNoted;
	}

	public Date getAboveOrdersNotedDate() {
		return aboveOrdersNotedDate;
	}

	public void setAboveOrdersNotedDate(Date aboveOrdersNotedDate) {
		this.aboveOrdersNotedDate = aboveOrdersNotedDate;
	}

	public int getAdmission() {
		return admission;
	}

	public void setAdmission(int admission) {
		this.admission = admission;
	}

	public int getCircleOne() {
		return circleOne;
	}

	public void setCircleOne(int circleOne) {
		this.circleOne = circleOne;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getDiet() {
		return diet;
	}

	public void setDiet(int diet) {
		this.diet = diet;
	}

	public String getDietaryConsult() {
		return dietaryConsult;
	}

	public void setDietaryConsult(String dietaryConsult) {
		this.dietaryConsult = dietaryConsult;
	}

	public String getFluidRest() {
		return fluidRest;
	}

	public void setFluidRest(String fluidRest) {
		this.fluidRest = fluidRest;
	}

	public int getFoleyDx() {
		return foleyDx;
	}

	public void setFoleyDx(int foleyDx) {
		this.foleyDx = foleyDx;
	}

	public String getFoleyDxOtherField() {
		return foleyDxOtherField;
	}

	public void setFoleyDxOtherField(String foleyDxOtherField) {
		this.foleyDxOtherField = foleyDxOtherField;
	}

	public String getPhysicianSign() {
		return physicianSign;
	}

	public void setPhysicianSign(String physicianSign) {
		this.physicianSign = physicianSign;
	}

	public Date getPhysicianSignDate() {
		return physicianSignDate;
	}

	public void setPhysicianSignDate(Date physicianSignDate) {
		this.physicianSignDate = physicianSignDate;
	}

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getSsn01() {
		return ssn01;
	}

	public void setSsn01(String ssn01) {
		this.ssn01 = ssn01;
	}

	public String getSsn02() {
		return ssn02;
	}

	public void setSsn02(String ssn02) {
		this.ssn02 = ssn02;
	}

	public String getSsn03() {
		return ssn03;
	}

	public void setSsn03(String ssn03) {
		this.ssn03 = ssn03;
	}

	public String getSupplements() {
		return supplements;
	}

	public void setSupplements(String supplements) {
		this.supplements = supplements;
	}

	public int getThickLiquids() {
		return thickLiquids;
	}

	public void setThickLiquids(int thickLiquids) {
		this.thickLiquids = thickLiquids;
	}

	public int getWeigh() {
		return weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}

}
