package medrex.commons.vo.medication;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MedicationAdministrationRecordFormCol")
public class MedicationAdministrationRecordFormCol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3484865164708353508L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "medicationAdministrationRecordFormSerial")
	private int medicationAdministrationRecordFormSerial;
	@Column(name = "medicationAdministrationRecordFormColSerial")
	int medicationAdministrationRecordFormColSerial;

	@Column(name = "temperature")
	private String temperature;
	@Column(name = "pulse")
	private String pulse;
	@Column(name = "respirations")
	private String respirations;
	@Column(name = "bpHigh1")
	private String bpHigh1;
	@Column(name = "bpLow1")
	private String bpLow1;
	@Column(name = "bpHigh2")
	private String bpHigh2;
	@Column(name = "bpLow2")
	private String bpLow2;
	@Column(name = "bpHigh3")
	private String bpHigh3;
	@Column(name = "bpLow3")
	private String bpLow3;
	@Column(name = "intake117")
	private String intake117;
	@Column(name = "intake73")
	private String intake73;
	@Column(name = "intake311")
	private String intake311;
	@Column(name = "output117")
	private String output117;
	@Column(name = "output73")
	private String output73;
	@Column(name = "output311")
	private String output311;
	@Column(name = "intakeTotal")
	private String intakeTotal;
	@Column(name = "outputTotal")
	private String outputTotal;
	@Column(name = "bsHigh1")
	private String bsHigh1;
	@Column(name = "bsLow1")
	private String bsLow1;
	@Column(name = "bsHigh2")
	private String bsHigh2;
	@Column(name = "bsLow2")
	private String bsLow2;
	@Column(name = "bsHigh3")
	private String bsHigh3;
	@Column(name = "bsLow3")
	private String bsLow3;
	@Column(name = "bsHigh4")
	private String bsHigh4;
	@Column(name = "bsLow4")
	private String bsLow4;
	@Column(name = "defecation117")
	private String defecation117;
	@Column(name = "defecation73")
	private String defecation73;
	@Column(name = "defecation311")
	private String defecation311;
	@Column(name = "enema")
	private String enema;
	@Column(name = "impaction")
	private String impaction;
	@Column(name = "oxygen117")
	private String oxygen117;
	@Column(name = "oxygen73")
	private String oxygen73;
	@Column(name = "oxygen311")
	private String oxygen311;

	public String getBpHigh1() {
		return bpHigh1;
	}

	public void setBpHigh1(String bpHigh1) {
		this.bpHigh1 = bpHigh1;
	}

	public String getBpHigh2() {
		return bpHigh2;
	}

	public void setBpHigh2(String bpHigh2) {
		this.bpHigh2 = bpHigh2;
	}

	public String getBpHigh3() {
		return bpHigh3;
	}

	public void setBpHigh3(String bpHigh3) {
		this.bpHigh3 = bpHigh3;
	}

	public String getBpLow1() {
		return bpLow1;
	}

	public void setBpLow1(String bpLow1) {
		this.bpLow1 = bpLow1;
	}

	public String getBpLow2() {
		return bpLow2;
	}

	public void setBpLow2(String bpLow2) {
		this.bpLow2 = bpLow2;
	}

	public String getBpLow3() {
		return bpLow3;
	}

	public void setBpLow3(String bpLow3) {
		this.bpLow3 = bpLow3;
	}

	public String getBsHigh1() {
		return bsHigh1;
	}

	public void setBsHigh1(String bsHigh1) {
		this.bsHigh1 = bsHigh1;
	}

	public String getBsHigh2() {
		return bsHigh2;
	}

	public void setBsHigh2(String bsHigh2) {
		this.bsHigh2 = bsHigh2;
	}

	public String getBsHigh3() {
		return bsHigh3;
	}

	public void setBsHigh3(String bsHigh3) {
		this.bsHigh3 = bsHigh3;
	}

	public String getBsHigh4() {
		return bsHigh4;
	}

	public void setBsHigh4(String bsHigh4) {
		this.bsHigh4 = bsHigh4;
	}

	public String getBsLow1() {
		return bsLow1;
	}

	public void setBsLow1(String bsLow1) {
		this.bsLow1 = bsLow1;
	}

	public String getBsLow2() {
		return bsLow2;
	}

	public void setBsLow2(String bsLow2) {
		this.bsLow2 = bsLow2;
	}

	public String getBsLow3() {
		return bsLow3;
	}

	public void setBsLow3(String bsLow3) {
		this.bsLow3 = bsLow3;
	}

	public String getBsLow4() {
		return bsLow4;
	}

	public void setBsLow4(String bsLow4) {
		this.bsLow4 = bsLow4;
	}

	public String getDefecation117() {
		return defecation117;
	}

	public void setDefecation117(String defecation117) {
		this.defecation117 = defecation117;
	}

	public String getDefecation73() {
		return defecation73;
	}

	public void setDefecation73(String defecation73) {
		this.defecation73 = defecation73;
	}

	public String getDefecation311() {
		return defecation311;
	}

	public void setDefecation311(String defecation311) {
		this.defecation311 = defecation311;
	}

	public String getEnema() {
		return enema;
	}

	public void setEnema(String enema) {
		this.enema = enema;
	}

	public String getImpaction() {
		return impaction;
	}

	public void setImpaction(String impaction) {
		this.impaction = impaction;
	}

	public String getIntake117() {
		return intake117;
	}

	public void setIntake117(String intake117) {
		this.intake117 = intake117;
	}

	public String getIntake311() {
		return intake311;
	}

	public void setIntake311(String intake311) {
		this.intake311 = intake311;
	}

	public String getIntake73() {
		return intake73;
	}

	public void setIntake73(String intake73) {
		this.intake73 = intake73;
	}

	public String getIntakeTotal() {
		return intakeTotal;
	}

	public void setIntakeTotal(String intakeTotal) {
		this.intakeTotal = intakeTotal;
	}

	public int getMedicationAdministrationRecordFormColSerial() {
		return medicationAdministrationRecordFormColSerial;
	}

	public void setMedicationAdministrationRecordFormColSerial(
			int medicationAdministrationRecordFormColSerial) {
		this.medicationAdministrationRecordFormColSerial = medicationAdministrationRecordFormColSerial;
	}

	public int getMedicationAdministrationRecordFormSerial() {
		return medicationAdministrationRecordFormSerial;
	}

	public void setMedicationAdministrationRecordFormSerial(
			int medicationAdministrationRecordFormSerial) {
		this.medicationAdministrationRecordFormSerial = medicationAdministrationRecordFormSerial;
	}

	public String getOutput117() {
		return output117;
	}

	public void setOutput117(String output117) {
		this.output117 = output117;
	}

	public String getOutput311() {
		return output311;
	}

	public void setOutput311(String output311) {
		this.output311 = output311;
	}

	public String getOutput73() {
		return output73;
	}

	public void setOutput73(String output73) {
		this.output73 = output73;
	}

	public String getOutputTotal() {
		return outputTotal;
	}

	public void setOutputTotal(String outputTotal) {
		this.outputTotal = outputTotal;
	}

	public String getOxygen117() {
		return oxygen117;
	}

	public void setOxygen117(String oxygen117) {
		this.oxygen117 = oxygen117;
	}

	public String getOxygen311() {
		return oxygen311;
	}

	public void setOxygen311(String oxygen311) {
		this.oxygen311 = oxygen311;
	}

	public String getOxygen73() {
		return oxygen73;
	}

	public void setOxygen73(String oxygen73) {
		this.oxygen73 = oxygen73;
	}

	public String getPulse() {
		return pulse;
	}

	public void setPulse(String pulse) {
		this.pulse = pulse;
	}

	public String getRespirations() {
		return respirations;
	}

	public void setRespirations(String respirations) {
		this.respirations = respirations;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}
