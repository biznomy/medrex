package medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ParentalNutritionalOrderForm")
public class ParentalNutritionalOrderForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -578408304535083439L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;
	@Column(name = "residentId")
	int residentId;
	@Column(name = "labCbfComment")
	String labCbfComment;
	@Column(name = "orderedValid")
	String orderedValid;
	@Column(name = "date")
	String date;
	@Column(name = "dateOrdered")
	String dateOrdered;
	@Column(name = "rnSignature")
	String rnSignature;
	@Column(name = "mdSignature")
	String mdSignature;
	@Column(name = "rnName")
	String rnName;
	@Column(name = "mdName")
	String mdName;
	@Column(name = "otherAdditive")
	String otherAdditive;
	@Column(name = "mviAdult")
	String mviAdult;
	@Column(name = "regularHumenInsulin")
	String regularHumenInsulin;
	@Column(name = "multiraceCone")
	String multiraceCone;
	@Column(name = "calciumGluconate")
	String calciumGluconate;
	@Column(name = "magnesiumSulphate")
	String magnesiumSulphate;
	@Column(name = "potassiumAcetate")
	String potassiumAcetate;
	@Column(name = "potassiumChloride")
	String potassiumChloride;
	@Column(name = "porassiumPhosphate")
	String porassiumPhosphate;
	@Column(name = "sodiumPhosphate")
	String sodiumPhosphate;
	@Column(name = "sodiumAcetate")
	String sodiumAcetate;
	@Column(name = "sodiumChloride")
	String sodiumChloride;
	@Column(name = "oneHrTaper")
	String oneHrTaper;
	@Column(name = "totalVolume")
	String totalVolume;
	@Column(name = "over")
	String over;
	@Column(name = "oneHrRamp")
	String oneHrRamp;
	@Column(name = "fatEmulsion")
	String fatEmulsion;
	@Column(name = "dextrose")
	String dextrose;
	@Column(name = "aminoAcids")
	String aminoAcids;
	@Column(name = "baseSolution")
	String baseSolution;
	@Column(name = "ptWgt")
	String ptWgt;
	@Column(name = "rm")
	String rm;
	@Column(name = "patientName")
	String patientName;
	@Column(name = "faculty")
	String faculty;
	@Column(name = "unit")
	String unit;

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

	public String getLabCbfComment() {
		return labCbfComment;
	}

	public void setLabCbfComment(String labCbfComment) {
		this.labCbfComment = labCbfComment;
	}

	public String getOrderedValid() {
		return orderedValid;
	}

	public void setOrderedValid(String orderedValid) {
		this.orderedValid = orderedValid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public String getRnSignature() {
		return rnSignature;
	}

	public void setRnSignature(String rnSignature) {
		this.rnSignature = rnSignature;
	}

	public String getMdSignature() {
		return mdSignature;
	}

	public void setMdSignature(String mdSignature) {
		this.mdSignature = mdSignature;
	}

	public String getRnName() {
		return rnName;
	}

	public void setRnName(String rnName) {
		this.rnName = rnName;
	}

	public String getMdName() {
		return mdName;
	}

	public void setMdName(String mdName) {
		this.mdName = mdName;
	}

	public String getOtherAdditive() {
		return otherAdditive;
	}

	public void setOtherAdditive(String otherAdditive) {
		this.otherAdditive = otherAdditive;
	}

	public String getMviAdult() {
		return mviAdult;
	}

	public void setMviAdult(String mviAdult) {
		this.mviAdult = mviAdult;
	}

	public String getRegularHumenInsulin() {
		return regularHumenInsulin;
	}

	public void setRegularHumenInsulin(String regularHumenInsulin) {
		this.regularHumenInsulin = regularHumenInsulin;
	}

	public String getMultiraceCone() {
		return multiraceCone;
	}

	public void setMultiraceCone(String multiraceCone) {
		this.multiraceCone = multiraceCone;
	}

	public String getCalciumGluconate() {
		return calciumGluconate;
	}

	public void setCalciumGluconate(String calciumGluconate) {
		this.calciumGluconate = calciumGluconate;
	}

	public String getMagnesiumSulphate() {
		return magnesiumSulphate;
	}

	public void setMagnesiumSulphate(String magnesiumSulphate) {
		this.magnesiumSulphate = magnesiumSulphate;
	}

	public String getPotassiumAcetate() {
		return potassiumAcetate;
	}

	public void setPotassiumAcetate(String potassiumAcetate) {
		this.potassiumAcetate = potassiumAcetate;
	}

	public String getPotassiumChloride() {
		return potassiumChloride;
	}

	public void setPotassiumChloride(String potassiumChloride) {
		this.potassiumChloride = potassiumChloride;
	}

	public String getPorassiumPhosphate() {
		return porassiumPhosphate;
	}

	public void setPorassiumPhosphate(String porassiumPhosphate) {
		this.porassiumPhosphate = porassiumPhosphate;
	}

	public String getSodiumPhosphate() {
		return sodiumPhosphate;
	}

	public void setSodiumPhosphate(String sodiumPhosphate) {
		this.sodiumPhosphate = sodiumPhosphate;
	}

	public String getSodiumAcetate() {
		return sodiumAcetate;
	}

	public void setSodiumAcetate(String sodiumAcetate) {
		this.sodiumAcetate = sodiumAcetate;
	}

	public String getSodiumChloride() {
		return sodiumChloride;
	}

	public void setSodiumChloride(String sodiumChloride) {
		this.sodiumChloride = sodiumChloride;
	}

	public String getOneHrTaper() {
		return oneHrTaper;
	}

	public void setOneHrTaper(String oneHrTaper) {
		this.oneHrTaper = oneHrTaper;
	}

	public String getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(String totalVolume) {
		this.totalVolume = totalVolume;
	}

	public String getOver() {
		return over;
	}

	public void setOver(String over) {
		this.over = over;
	}

	public String getOneHrRamp() {
		return oneHrRamp;
	}

	public void setOneHrRamp(String oneHrRamp) {
		this.oneHrRamp = oneHrRamp;
	}

	public String getFatEmulsion() {
		return fatEmulsion;
	}

	public void setFatEmulsion(String fatEmulsion) {
		this.fatEmulsion = fatEmulsion;
	}

	public String getDextrose() {
		return dextrose;
	}

	public void setDextrose(String dextrose) {
		this.dextrose = dextrose;
	}

	public String getAminoAcids() {
		return aminoAcids;
	}

	public void setAminoAcids(String aminoAcids) {
		this.aminoAcids = aminoAcids;
	}

	public String getBaseSolution() {
		return baseSolution;
	}

	public void setBaseSolution(String baseSolution) {
		this.baseSolution = baseSolution;
	}

	public String getPtWgt() {
		return ptWgt;
	}

	public void setPtWgt(String ptWgt) {
		this.ptWgt = ptWgt;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
