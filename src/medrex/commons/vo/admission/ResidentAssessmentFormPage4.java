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
@Table(name = "ResidentAssessmentFormPage4")
public class ResidentAssessmentFormPage4 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4485567613336011876L;
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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "peripherial")
	private Notes peripherial;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "central")
	private Notes central;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shunt")
	private Notes shunt;

	@Column(name = "dizziness")
	private int dizziness;
	@Column(name = "pulses")
	private String pulses;
	@Column(name = "pedalLeft")
	private int pedalLeft;
	@Column(name = "pedalRight")
	private int pedalRight;
	@Column(name = "pacemaker")
	private int pacemaker;
	@Column(name = "pacemakerRate")
	private String pacemakerRate;
	@Column(name = "pacemakerDate")
	private Date pacemakerDate;
	@Column(name = "defibrillator")
	private int defibrillator;
	@Column(name = "capillary")
	private int capillary;
	@Column(name = "edema")
	private int edema;
	@Column(name = "edemaLocation")
	private String edemaLocation;
	@Column(name = "edemaPittingText")
	private String edemaPittingText;
	@Column(name = "edemaPitting")
	private int edemaPitting;
	@Column(name = "respiratory")
	private int respiratory;
	@Column(name = "respiratoryOther")
	private String respiratoryOther;
	@Column(name = "footPain")
	private int footPain;
	@Column(name = "footPainText")
	private String footPainText;
	@Column(name = "footHeels")
	private int footHeels;
	@Column(name = "footHeelsText")
	private String footHeelsText;
	@Column(name = "footToes")
	private int footToes;
	@Column(name = "footToesText")
	private String footToesText;
	@Column(name = "footToeNails")
	private int footToeNails;
	@Column(name = "footToeNailsText")
	private String footToeNailsText;
	@Column(name = "footConsultaion")
	private int footConsultaion;
	@Column(name = "footConsultationText")
	private String footConsultationText;
	// new Fields Added

	@Column(name = "peripheralType")
	private String peripheralType;

	@Column(name = "peripheralLocation")
	private String peripheralLocation;

	@Column(name = "peripheralDate")
	private Date peripheralDate;

	@Column(name = "peripheralNA")
	private boolean peripheralNA;

	@Column(name = "MidlineType")
	private String MidlineType;

	@Column(name = "MidlineLocation")
	private String MidlineLocation;

	@Column(name = "MidlineDate")
	private Date MidlineDate;

	@Column(name = "MidlineNA")
	private boolean MidlineNA;

	@Column(name = "PortType")
	private String PortType;

	@Column(name = "PortLocation")
	private String PortLocation;

	@Column(name = "PortDate")
	private Date PortDate;

	@Column(name = "PortNA")
	private boolean PortNA;

	@Column(name = "TrachType")
	private String TrachType;

	@Column(name = "TrachSize")
	private String TrachSize;

	@Column(name = "centralLineType")
	private String centralLineType;

	@Column(name = "centralLineLocation")
	private String centralLineLocation;

	@Column(name = "centralLineDate")
	private Date centralLineDate;

	@Column(name = "centralLineNA")
	private boolean centralLineNA;

	@Column(name = "shuntType")
	private String shuntType;

	@Column(name = "shuntLocation")
	private String shuntLocation;

	@Column(name = "shuntBruit")
	private String shuntBruit;

	@Column(name = "shuntThrill")
	private String shuntThrill;

	@Column(name = "dizzinessOn")
	private String dizzinessOn;

	@Column(name = "OxyenVia")
	private String OxygenVia;

	@Column(name = "jVd")
	private boolean jVd;

	@Column(name = "chestPain")
	private boolean chestPain;

	@Column(name = "shortnessOfBreath")
	private int shortnessOfBreath;

	@Column(name = "pittingValue")
	private String pittingValue;

	@Column(name = "soundLocation")
	private String soundLocation;

	@Column(name = "wheezeLocation")
	private String wheezeLocation;

	@Column(name = "ralesLocation")
	private String ralesLocation;

	@Column(name = "coughType")
	private int coughType;

	@Column(name = "dryness")
	private boolean dryness;

	@Column(name = "cpapSetting")
	private String cpapSetting;

	// --------------------------------------

	public String getPeripheralType() {
		return peripheralType;
	}

	public void setPeripheralType(String peripheralType) {
		this.peripheralType = peripheralType;
	}

	public String getPeripheralLocation() {
		return peripheralLocation;
	}

	public void setPeripheralLocation(String peripheralLocation) {
		this.peripheralLocation = peripheralLocation;
	}

	public String getCentralLineType() {
		return centralLineType;
	}

	public void setCentralLineType(String centralLineType) {
		this.centralLineType = centralLineType;
	}

	public String getCentralLineLocation() {
		return centralLineLocation;
	}

	public void setCentralLineLocation(String centralLineLocation) {
		this.centralLineLocation = centralLineLocation;
	}

	public Date getPeripheralDate() {
		return peripheralDate;
	}

	public void setPeripheralDate(Date peripheralDate) {
		this.peripheralDate = peripheralDate;
	}

	public Date getCentralLineDate() {
		return centralLineDate;
	}

	public void setCentralLineDate(Date centralLineDate) {
		this.centralLineDate = centralLineDate;
	}

	public boolean isPeripheralNA() {
		return peripheralNA;
	}

	public void setPeripheralNA(boolean peripheralNA) {
		this.peripheralNA = peripheralNA;
	}

	public boolean isCentralLineNA() {
		return centralLineNA;
	}

	public void setCentralLineNA(boolean centralLineNA) {
		this.centralLineNA = centralLineNA;
	}

	public String getShuntType() {
		return shuntType;
	}

	public void setShuntType(String shuntType) {
		this.shuntType = shuntType;
	}

	public String getShuntLocation() {
		return shuntLocation;
	}

	public void setShuntLocation(String shuntLocation) {
		this.shuntLocation = shuntLocation;
	}

	public String getShuntBruit() {
		return shuntBruit;
	}

	public void setShuntBruit(String shuntBruit) {
		this.shuntBruit = shuntBruit;
	}

	public String getShuntThrill() {
		return shuntThrill;
	}

	public void setShuntThrill(String shuntThrill) {
		this.shuntThrill = shuntThrill;
	}

	public String getDizzinessOn() {
		return dizzinessOn;
	}

	public void setDizzinessOn(String dizzinessOn) {
		this.dizzinessOn = dizzinessOn;
	}

	public boolean isJVd() {
		return jVd;
	}

	public void setJVd(boolean vd) {
		jVd = vd;
	}

	public boolean isChestPain() {
		return chestPain;
	}

	public void setChestPain(boolean chestPain) {
		this.chestPain = chestPain;
	}

	public int getShortnessOfBreath() {
		return shortnessOfBreath;
	}

	public void setShortnessOfBreath(int shortnessOfBreath) {
		this.shortnessOfBreath = shortnessOfBreath;
	}

	public String getPittingValue() {
		return pittingValue;
	}

	public void setPittingValue(String pittingValue) {
		this.pittingValue = pittingValue;
	}

	public String getSoundLocation() {
		return soundLocation;
	}

	public void setSoundLocation(String soundLocation) {
		this.soundLocation = soundLocation;
	}

	public String getWheezeLocation() {
		return wheezeLocation;
	}

	public void setWheezeLocation(String wheezeLocation) {
		this.wheezeLocation = wheezeLocation;
	}

	public String getRalesLocation() {
		return ralesLocation;
	}

	public void setRalesLocation(String ralesLocation) {
		this.ralesLocation = ralesLocation;
	}

	public int getCoughType() {
		return coughType;
	}

	public void setCoughType(int coughType) {
		this.coughType = coughType;
	}

	public boolean isDryness() {
		return dryness;
	}

	public void setDryness(boolean dryness) {
		this.dryness = dryness;
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

	public Notes getPeripherial() {
		return peripherial;
	}

	public void setPeripherial(Notes peripherial) {
		this.peripherial = peripherial;
	}

	public Notes getCentral() {
		return central;
	}

	public void setCentral(Notes central) {
		this.central = central;
	}

	public Notes getShunt() {
		return shunt;
	}

	public void setShunt(Notes shunt) {
		this.shunt = shunt;
	}

	public int getDizziness() {
		return dizziness;
	}

	public void setDizziness(int dizziness) {
		this.dizziness = dizziness;
	}

	public String getPulses() {
		return pulses;
	}

	public void setPulses(String pulses) {
		this.pulses = pulses;
	}

	public int getPedalLeft() {
		return pedalLeft;
	}

	public void setPedalLeft(int pedalLeft) {
		this.pedalLeft = pedalLeft;
	}

	public int getPedalRight() {
		return pedalRight;
	}

	public void setPedalRight(int pedalRight) {
		this.pedalRight = pedalRight;
	}

	public int getPacemaker() {
		return pacemaker;
	}

	public void setPacemaker(int pacemaker) {
		this.pacemaker = pacemaker;
	}

	public String getPacemakerRate() {
		return pacemakerRate;
	}

	public void setPacemakerRate(String pacemakerRate) {
		this.pacemakerRate = pacemakerRate;
	}

	public Date getPacemakerDate() {
		return pacemakerDate;
	}

	public void setPacemakerDate(Date pacemakerDate) {
		this.pacemakerDate = pacemakerDate;
	}

	public int getDefibrillator() {
		return defibrillator;
	}

	public void setDefibrillator(int defibrillator) {
		this.defibrillator = defibrillator;
	}

	public int getCapillary() {
		return capillary;
	}

	public void setCapillary(int capillary) {
		this.capillary = capillary;
	}

	public int getEdema() {
		return edema;
	}

	public void setEdema(int edema) {
		this.edema = edema;
	}

	public String getEdemaLocation() {
		return edemaLocation;
	}

	public void setEdemaLocation(String edemaLocation) {
		this.edemaLocation = edemaLocation;
	}

	public String getEdemaPittingText() {
		return edemaPittingText;
	}

	public void setEdemaPittingText(String edemaPittingText) {
		this.edemaPittingText = edemaPittingText;
	}

	public int getEdemaPitting() {
		return edemaPitting;
	}

	public void setEdemaPitting(int edemaPitting) {
		this.edemaPitting = edemaPitting;
	}

	public int getRespiratory() {
		return respiratory;
	}

	public void setRespiratory(int respiratory) {
		this.respiratory = respiratory;
	}

	public int getFootPain() {
		return footPain;
	}

	public void setFootPain(int footPain) {
		this.footPain = footPain;
	}

	public int getFootHeels() {
		return footHeels;
	}

	public void setFootHeels(int footHeels) {
		this.footHeels = footHeels;
	}

	public String getFootPainText() {
		return footPainText;
	}

	public void setFootPainText(String footPainText) {
		this.footPainText = footPainText;
	}

	public String getFootHeelsText() {
		return footHeelsText;
	}

	public void setFootHeelsText(String footHeelsText) {
		this.footHeelsText = footHeelsText;
	}

	public int getFootToes() {
		return footToes;
	}

	public void setFootToes(int footToes) {
		this.footToes = footToes;
	}

	public String getFootToesText() {
		return footToesText;
	}

	public void setFootToesText(String footToesText) {
		this.footToesText = footToesText;
	}

	public int getFootToeNails() {
		return footToeNails;
	}

	public void setFootToeNails(int footToeNails) {
		this.footToeNails = footToeNails;
	}

	public String getFootToeNailsText() {
		return footToeNailsText;
	}

	public void setFootToeNailsText(String footToeNailsText) {
		this.footToeNailsText = footToeNailsText;
	}

	public int getFootConsultaion() {
		return footConsultaion;
	}

	public void setFootConsultaion(int footConsultaion) {
		this.footConsultaion = footConsultaion;
	}

	public String getFootConsultationText() {
		return footConsultationText;
	}

	public void setFootConsultationText(String footConsultationText) {
		this.footConsultationText = footConsultationText;
	}

	public String getRespiratoryOther() {
		return respiratoryOther;
	}

	public void setRespiratoryOther(String respiratoryOther) {
		this.respiratoryOther = respiratoryOther;
	}

	public String getMidlineType() {
		return MidlineType;
	}

	public void setMidlineType(String midlineType) {
		MidlineType = midlineType;
	}

	public String getMidlineLocation() {
		return MidlineLocation;
	}

	public void setMidlineLocation(String midlineLocation) {
		MidlineLocation = midlineLocation;
	}

	public Date getMidlineDate() {
		return MidlineDate;
	}

	public void setMidlineDate(Date midlineDate) {
		MidlineDate = midlineDate;
	}

	public boolean isMidlineNA() {
		return MidlineNA;
	}

	public void setMidlineNA(boolean midlineNA) {
		MidlineNA = midlineNA;
	}

	public String getPortType() {
		return PortType;
	}

	public void setPortType(String portType) {
		PortType = portType;
	}

	public String getPortLocation() {
		return PortLocation;
	}

	public void setPortLocation(String portLocation) {
		PortLocation = portLocation;
	}

	public Date getPortDate() {
		return PortDate;
	}

	public void setPortDate(Date portDate) {
		PortDate = portDate;
	}

	public boolean isPortNA() {
		return PortNA;
	}

	public void setPortNA(boolean portNA) {
		PortNA = portNA;
	}

	public String getOxygenVia() {
		return OxygenVia;
	}

	public void setOxygenVia(String oxygenVia) {
		OxygenVia = oxygenVia;
	}

	public String getTrachType() {
		return TrachType;
	}

	public void setTrachType(String trachType) {
		TrachType = trachType;
	}

	public String getTrachSize() {
		return TrachSize;
	}

	public void setTrachSize(String trachSize) {
		TrachSize = trachSize;
	}

	public String getCpapSetting() {
		return cpapSetting;
	}

	public void setCpapSetting(String cpapSetting) {
		this.cpapSetting = cpapSetting;
	}

}
