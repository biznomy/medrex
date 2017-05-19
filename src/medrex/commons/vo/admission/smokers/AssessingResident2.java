package medrex.commons.vo.admission.smokers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AssessingResident2")
public class AssessingResident2 {

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "formId")
	private int formId;
	@Column(name = "materialUnsafty")
	private int materialUnsafty;
	@Column(name = "consume")
	private int consume;
	@Column(name = "burn")
	private int burn;
	@Column(name = "dispose")
	private int dispose;
	@Column(name = "assistive")
	private int assistive;
	@Column(name = "risk")
	private int risk;
	@Column(name = "neverCheckBox")
	private boolean neverCheckBox;
	@Column(name = "numberOfTimesCheckBox")
	private boolean numberOfTimesCheckBox;

	@Column(name = "tField")
	private String tField;

	@Column(name = "explainAboutSmoking")
	private String explainAboutSmoking;
	@Column(name = "smokingArea")
	private String smokingArea;
	@Column(name = "physicalLimitationSpecify")
	private String physicalLimitationSpecify;

	public int getSerial() {
		return serial;
	}

	public int getResidentId() {
		return residentId;
	}

	public int getFormId() {
		return formId;
	}

	public int getMaterialUnsafty() {
		return materialUnsafty;
	}

	public int getConsume() {
		return consume;
	}

	public int getBurn() {
		return burn;
	}

	public int getDispose() {
		return dispose;
	}

	public int getAssistive() {
		return assistive;
	}

	public int getRisk() {
		return risk;
	}

	public boolean isNeverCheckBox() {
		return neverCheckBox;
	}

	public boolean isNumberOfTimesCheckBox() {
		return numberOfTimesCheckBox;
	}

	public String getTField() {
		return tField;
	}

	public String getExplainAboutSmoking() {
		return explainAboutSmoking;
	}

	public String getSmokingArea() {
		return smokingArea;
	}

	public String getPhysicalLimitationSpecify() {
		return physicalLimitationSpecify;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public void setMaterialUnsafty(int materialUnsafty) {
		this.materialUnsafty = materialUnsafty;
	}

	public void setConsume(int consume) {
		this.consume = consume;
	}

	public void setBurn(int burn) {
		this.burn = burn;
	}

	public void setDispose(int dispose) {
		this.dispose = dispose;
	}

	public void setAssistive(int assistive) {
		this.assistive = assistive;
	}

	public void setRisk(int risk) {
		this.risk = risk;
	}

	public void setNeverCheckBox(boolean neverCheckBox) {
		this.neverCheckBox = neverCheckBox;
	}

	public void setNumberOfTimesCheckBox(boolean numberOfTimesCheckBox) {
		this.numberOfTimesCheckBox = numberOfTimesCheckBox;
	}

	public void setTField(String field) {
		tField = field;
	}

	public void setExplainAboutSmoking(String explainAboutSmoking) {
		this.explainAboutSmoking = explainAboutSmoking;
	}

	public void setSmokingArea(String smokingArea) {
		this.smokingArea = smokingArea;
	}

	public void setPhysicalLimitationSpecify(String physicalLimitationSpecify) {
		this.physicalLimitationSpecify = physicalLimitationSpecify;
	}

}
