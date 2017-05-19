package medrex.commons.vo.physicianOrders.physicianOrderScreen;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import medrex.client.main.MonthlySummary.PanelEnteralProtocol;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.ParentalNutritionalOrderForm;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.PhysicianOrderEnteralProtocol;

@Entity
@Table(name = "PhysicianOrderDiets")
public class PhysicianOrderDiets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7675782032314091650L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IdGtube")
	private PhysicianOrderEnteralProtocol idgtube;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IdTpn")
	private ParentalNutritionalOrderForm idtpn;

	@Column(name = "formId")
	private int formId;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "weights")
	private String weights;

	@Column(name = "calorieCount")
	private int calorieCount;

	@Column(name = "asSnack")
	private String asSnack;

	@Column(name = "supplements")
	private String supplements;

	@Column(name = "fluidConsistency")
	private String fluidConsistency;

	@Column(name = "nursing7")
	private String nursing7;
	
	@Column(name = "nursing3")
	private String nursing3;
	
	@Column(name = "nursing11")
	private String nursing11;

	@Column(name = "breakfast")
	private String breakfast;

	@Column(name = "lunch")
	private String lunch;
	
	@Column(name = "dinner")
	private String dinner;
	
	@Column(name = "mlDay")
	private String mlDay;

	@Column(name = "milileters")
	private String milileters;

	@Column(name = "number")
	private String number;

	@Column(name = "fluidRestriction")
	private String fluidRestriction;

	@Column(name = "dietConsistency")
	private String dietConsistency;

	@Column (name = "nas")
	private Boolean nas;
	
	@Column (name = "ncs")
	private Boolean ncs;
	
	@Column (name = "renal")
	private Boolean renal;
	
	@Column (name = "cardiac")
	private Boolean cardiac;
	
	@Column (name = "npo")
	private Boolean npo;
	
	@Column (name = "gtube")
	private Boolean gtube;
	
	@Column (name = "tpn")
	private Boolean tpn;
	
	@Column (name = "pleasureFeeds")
	private Boolean pleasureFeeds;
	
	public String getWeights() {
		return this.weights;
	}

	public void setWeights(String weights) {
		this.weights = weights;
	}

	public int getCalorieCount() {
		return calorieCount;
	}

	public void setCalorieCount(int calorieCount) {
		this.calorieCount = calorieCount;
	}

	public String getAsSnack() {
		return this.asSnack;
	}

	public void setAsSnack(String asSnack) {
		this.asSnack = asSnack;
	}

	public String getSupplements() {
		return this.supplements;
	}

	public void setSupplements(String supplements) {
		this.supplements = supplements;
	}

	public String getFluidConsistency() {
		return this.fluidConsistency;
	}

	public void setFluidConsistency(String fluidConsistency) {
		this.fluidConsistency = fluidConsistency;
	}

	

	

	public String getMlDay() {
		return this.mlDay;
	}

	public void setMlDay(String mlDay) {
		this.mlDay = mlDay;
	}

	public String getMilileters() {
		return this.milileters;
	}

	public void setMilileters(String milileters) {
		this.milileters = milileters;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFluidRestriction() {
		return this.fluidRestriction;
	}

	public void setFluidRestriction(String fluidRestriction) {
		this.fluidRestriction = fluidRestriction;
	}

	public String getDietConsistency() {
		return this.dietConsistency;
	}

	public void setDietConsistency(String dietConsistency) {
		this.dietConsistency = dietConsistency;
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

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getBreakfast() {
		return breakfast;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getLunch() {
		return lunch;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public String getDinner() {
		return dinner;
	}

	public void setNursing3(String nursing3) {
		this.nursing3 = nursing3;
	}

	public String getNursing3() {
		return nursing3;
	}

	public void setNursing11(String nursing11) {
		this.nursing11 = nursing11;
	}

	public String getNursing11() {
		return nursing11;
	}

	public void setNursing7(String nursing7) {
		this.nursing7 = nursing7;
	}

	public String getNursing7() {
		return nursing7;
	}

	public void setNas(Boolean nas) {
		this.nas = nas;
	}

	public Boolean getNas() {
		return nas;
	}

	public void setNcs(Boolean ncs) {
		this.ncs = ncs;
	}

	public Boolean getNcs() {
		return ncs;
	}

	public void setRenal(Boolean renal) {
		this.renal = renal;
	}

	public Boolean getRenal() {
		return renal;
	}

	public void setCardiac(Boolean cardiac) {
		this.cardiac = cardiac;
	}

	public Boolean getCardiac() {
		return cardiac;
	}

	public void setNpo(Boolean npo) {
		this.npo = npo;
	}

	public Boolean getNpo() {
		return npo;
	}

	public void setGtube(Boolean gtube) {
		this.gtube = gtube;
	}

	public Boolean getGtube() {
		return gtube;
	}

	public void setTpn(Boolean tpn) {
		this.tpn = tpn;
	}

	public Boolean getTpn() {
		return tpn;
	}

	public void setPleasureFeeds(Boolean pleasureFeeds) {
		this.pleasureFeeds = pleasureFeeds;
	}

	public Boolean getPleasureFeeds() {
		return pleasureFeeds;
	}

	public void setIdgtube(PhysicianOrderEnteralProtocol idgtube) {
		this.idgtube = idgtube;
	}

	public PhysicianOrderEnteralProtocol getIdgtube() {
		return idgtube;
	}

	public void setIdtpn(ParentalNutritionalOrderForm idtpn) {
		this.idtpn = idtpn;
	}

	public ParentalNutritionalOrderForm getIdtpn() {
		return idtpn;
	}

}
