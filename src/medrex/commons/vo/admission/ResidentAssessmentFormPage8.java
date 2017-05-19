package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage8")
public class ResidentAssessmentFormPage8 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7134244841757494371L;
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
	@Column(name = "exOther")
	private String exOther;
	@Column(name = "nonPhOther")
	private String nonPhOther;
	@Column(name = "painMedOther")
	private String painMedOther;
	@Column(name = "painManagement")
	private int painManagement;
	@Column(name = "q2")
	private int q2;
	@Column(name = "q1")
	private int q1;
	@Column(name = "painMedicationOther")
	private boolean painMedicationOther;
	@Column(name = "painMedicationIndigestion")
	private boolean painMedicationIndigestion;
	@Column(name = "painMedicationConstipation")
	private boolean painMedicationConstipation;
	@Column(name = "painMedicationNausea")
	private boolean painMedicationNausea;
	@Column(name = "painMedicationSedation")
	private boolean painMedicationSedation;
	@Column(name = "nonPharmaOther")
	private boolean nonPharmaOther;
	@Column(name = "nonPharmaVisual")
	private boolean nonPharmaVisual;
	@Column(name = "nonPharmaNeurolytic")
	private boolean nonPharmaNeurolytic;
	@Column(name = "nonPharmaMusic")
	private boolean nonPharmaMusic;
	@Column(name = "nonPharmaSpiritual")
	private boolean nonPharmaSpiritual;
	@Column(name = "nonPharmaMassage")
	private boolean nonPharmaMassage;
	@Column(name = "nonPharmaAcupuncture")
	private boolean nonPharmaAcupuncture;
	@Column(name = "nonPharmaElevation")
	private boolean nonPharmaElevation;
	@Column(name = "nonPharmaReposition")
	private boolean nonPharmaReposition;
	@Column(name = "nonPharmaTens")
	private boolean nonPharmaTens;
	@Column(name = "nonPharmaHeat")
	private boolean nonPharmaHeat;
	@Column(name = "nonPharmaIce")
	private boolean nonPharmaIce;
	@Column(name = "effectsPain")
	private boolean effectsPain;
	@Column(name = "effectsContinence")
	private boolean effectsContinence;
	@Column(name = "effectsSocialization")
	private boolean effectsSocialization;
	@Column(name = "effectsLying")
	private boolean effectsLying;
	@Column(name = "effectsStanding")
	private boolean effectsStanding;
	@Column(name = "effectsSitting")
	private boolean effectsSitting;
	@Column(name = "effectsSleep")
	private boolean effectsSleep;
	@Column(name = "effectsConcentration")
	private boolean effectsConcentration;
	@Column(name = "effectsMood")
	private boolean effectsMood;
	@Column(name = "effectsWalking")
	private boolean effectsWalking;
	@Column(name = "effectsAppetite")
	private boolean effectsAppetite;
	@Column(name = "effectsActivities")
	private boolean effectsActivities;
	@Column(name = "exaOther")
	private boolean exaOther;
	@Column(name = "exaResting")
	private boolean exaResting;
	@Column(name = "exaEating")
	private boolean exaEating;
	@Column(name = "exaSitting")
	private boolean exaSitting;
	@Column(name = "exaTherapy")
	private boolean exaTherapy;
	@Column(name = "exaTurning")
	private boolean exaTurning;
	@Column(name = "exaMovement")
	private boolean exaMovement;
	@Column(name = "pharmaMedication1")
	private String pharmaMedication1;
	@Column(name = "pharmaDose1")
	private String pharmaDose1;
	@Column(name = "pharmaRoute1")
	private String pharmaRoute1;
	@Column(name = "pharmaFrequency1")
	private String pharmaFrequency1;
	@Column(name = "pharmaIdentity1")
	private String pharmaIdentity1;
	@Column(name = "pharmaMedication2")
	private String pharmaMedication2;
	@Column(name = "pharmaDose2")
	private String pharmaDose2;
	@Column(name = "pharmaRoute2")
	private String pharmaRoute2;
	@Column(name = "pharmaFrequency2")
	private String pharmaFrequency2;
	@Column(name = "pharmaIdentity2")
	private String pharmaIdentity2;
	@Column(name = "pharmaMedication3")
	private String pharmaMedication3;
	@Column(name = "pharmaDose3")
	private String pharmaDose3;
	@Column(name = "pharmaRoute3")
	private String pharmaRoute3;
	@Column(name = "pharmaFrequency3")
	private String pharmaFrequency3;
	@Column(name = "pharmaIdentity3")
	private String pharmaIdentity3;
	@Column(name = "pharmaMedication")
	private String pharmaMedication;

	public boolean isEffectsActivities() {
		return effectsActivities;
	}

	public void setEffectsActivities(boolean effectsActivities) {
		this.effectsActivities = effectsActivities;
	}

	public boolean isEffectsAppetite() {
		return effectsAppetite;
	}

	public void setEffectsAppetite(boolean effectsAppetite) {
		this.effectsAppetite = effectsAppetite;
	}

	public boolean isEffectsConcentration() {
		return effectsConcentration;
	}

	public void setEffectsConcentration(boolean effectsConcentration) {
		this.effectsConcentration = effectsConcentration;
	}

	public boolean isEffectsContinence() {
		return effectsContinence;
	}

	public void setEffectsContinence(boolean effectsContinence) {
		this.effectsContinence = effectsContinence;
	}

	public boolean isEffectsLying() {
		return effectsLying;
	}

	public void setEffectsLying(boolean effectsLying) {
		this.effectsLying = effectsLying;
	}

	public boolean isEffectsMood() {
		return effectsMood;
	}

	public void setEffectsMood(boolean effectsMood) {
		this.effectsMood = effectsMood;
	}

	public boolean isEffectsPain() {
		return effectsPain;
	}

	public void setEffectsPain(boolean effectsPain) {
		this.effectsPain = effectsPain;
	}

	public boolean isEffectsSitting() {
		return effectsSitting;
	}

	public void setEffectsSitting(boolean effectsSitting) {
		this.effectsSitting = effectsSitting;
	}

	public boolean isEffectsSleep() {
		return effectsSleep;
	}

	public void setEffectsSleep(boolean effectsSleep) {
		this.effectsSleep = effectsSleep;
	}

	public boolean isEffectsSocialization() {
		return effectsSocialization;
	}

	public void setEffectsSocialization(boolean effectsSocialization) {
		this.effectsSocialization = effectsSocialization;
	}

	public boolean isEffectsStanding() {
		return effectsStanding;
	}

	public void setEffectsStanding(boolean effectsStanding) {
		this.effectsStanding = effectsStanding;
	}

	public boolean isEffectsWalking() {
		return effectsWalking;
	}

	public void setEffectsWalking(boolean effectsWalking) {
		this.effectsWalking = effectsWalking;
	}

	public boolean isExaEating() {
		return exaEating;
	}

	public void setExaEating(boolean exaEating) {
		this.exaEating = exaEating;
	}

	public boolean isExaMovement() {
		return exaMovement;
	}

	public void setExaMovement(boolean exaMovement) {
		this.exaMovement = exaMovement;
	}

	public boolean isExaOther() {
		return exaOther;
	}

	public void setExaOther(boolean exaOther) {
		this.exaOther = exaOther;
	}

	public boolean isExaResting() {
		return exaResting;
	}

	public void setExaResting(boolean exaResting) {
		this.exaResting = exaResting;
	}

	public boolean isExaSitting() {
		return exaSitting;
	}

	public void setExaSitting(boolean exaSitting) {
		this.exaSitting = exaSitting;
	}

	public boolean isExaTherapy() {
		return exaTherapy;
	}

	public void setExaTherapy(boolean exaTherapy) {
		this.exaTherapy = exaTherapy;
	}

	public boolean isExaTurning() {
		return exaTurning;
	}

	public void setExaTurning(boolean exaTurning) {
		this.exaTurning = exaTurning;
	}

	public String getExOther() {
		return exOther;
	}

	public void setExOther(String exOther) {
		this.exOther = exOther;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public boolean isNonPharmaAcupuncture() {
		return nonPharmaAcupuncture;
	}

	public void setNonPharmaAcupuncture(boolean nonPharmaAcupuncture) {
		this.nonPharmaAcupuncture = nonPharmaAcupuncture;
	}

	public boolean isNonPharmaElevation() {
		return nonPharmaElevation;
	}

	public void setNonPharmaElevation(boolean nonPharmaElevation) {
		this.nonPharmaElevation = nonPharmaElevation;
	}

	public boolean isNonPharmaHeat() {
		return nonPharmaHeat;
	}

	public void setNonPharmaHeat(boolean nonPharmaHeat) {
		this.nonPharmaHeat = nonPharmaHeat;
	}

	public boolean isNonPharmaIce() {
		return nonPharmaIce;
	}

	public void setNonPharmaIce(boolean nonPharmaIce) {
		this.nonPharmaIce = nonPharmaIce;
	}

	public boolean isNonPharmaMassage() {
		return nonPharmaMassage;
	}

	public void setNonPharmaMassage(boolean nonPharmaMassage) {
		this.nonPharmaMassage = nonPharmaMassage;
	}

	public boolean isNonPharmaMusic() {
		return nonPharmaMusic;
	}

	public void setNonPharmaMusic(boolean nonPharmaMusic) {
		this.nonPharmaMusic = nonPharmaMusic;
	}

	public boolean isNonPharmaNeurolytic() {
		return nonPharmaNeurolytic;
	}

	public void setNonPharmaNeurolytic(boolean nonPharmaNeurolytic) {
		this.nonPharmaNeurolytic = nonPharmaNeurolytic;
	}

	public boolean isNonPharmaOther() {
		return nonPharmaOther;
	}

	public void setNonPharmaOther(boolean nonPharmaOther) {
		this.nonPharmaOther = nonPharmaOther;
	}

	public boolean isNonPharmaReposition() {
		return nonPharmaReposition;
	}

	public void setNonPharmaReposition(boolean nonPharmaReposition) {
		this.nonPharmaReposition = nonPharmaReposition;
	}

	public boolean isNonPharmaSpiritual() {
		return nonPharmaSpiritual;
	}

	public void setNonPharmaSpiritual(boolean nonPharmaSpiritual) {
		this.nonPharmaSpiritual = nonPharmaSpiritual;
	}

	public boolean isNonPharmaTens() {
		return nonPharmaTens;
	}

	public void setNonPharmaTens(boolean nonPharmaTens) {
		this.nonPharmaTens = nonPharmaTens;
	}

	public boolean isNonPharmaVisual() {
		return nonPharmaVisual;
	}

	public void setNonPharmaVisual(boolean nonPharmaVisual) {
		this.nonPharmaVisual = nonPharmaVisual;
	}

	public String getNonPhOther() {
		return nonPhOther;
	}

	public void setNonPhOther(String nonPhOther) {
		this.nonPhOther = nonPhOther;
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

	public int getPainManagement() {
		return painManagement;
	}

	public void setPainManagement(int painManagement) {
		this.painManagement = painManagement;
	}

	public boolean isPainMedicationConstipation() {
		return painMedicationConstipation;
	}

	public void setPainMedicationConstipation(boolean painMedicationConstipation) {
		this.painMedicationConstipation = painMedicationConstipation;
	}

	public boolean isPainMedicationIndigestion() {
		return painMedicationIndigestion;
	}

	public void setPainMedicationIndigestion(boolean painMedicationIndigestion) {
		this.painMedicationIndigestion = painMedicationIndigestion;
	}

	public boolean isPainMedicationNausea() {
		return painMedicationNausea;
	}

	public void setPainMedicationNausea(boolean painMedicationNausea) {
		this.painMedicationNausea = painMedicationNausea;
	}

	public boolean isPainMedicationOther() {
		return painMedicationOther;
	}

	public void setPainMedicationOther(boolean painMedicationOther) {
		this.painMedicationOther = painMedicationOther;
	}

	public boolean isPainMedicationSedation() {
		return painMedicationSedation;
	}

	public void setPainMedicationSedation(boolean painMedicationSedation) {
		this.painMedicationSedation = painMedicationSedation;
	}

	public String getPainMedOther() {
		return painMedOther;
	}

	public void setPainMedOther(String painMedOther) {
		this.painMedOther = painMedOther;
	}

	public String getPharmaDose1() {
		return pharmaDose1;
	}

	public void setPharmaDose1(String pharmaDose1) {
		this.pharmaDose1 = pharmaDose1;
	}

	public String getPharmaDose2() {
		return pharmaDose2;
	}

	public void setPharmaDose2(String pharmaDose2) {
		this.pharmaDose2 = pharmaDose2;
	}

	public String getPharmaDose3() {
		return pharmaDose3;
	}

	public void setPharmaDose3(String pharmaDose3) {
		this.pharmaDose3 = pharmaDose3;
	}

	public String getPharmaFrequency1() {
		return pharmaFrequency1;
	}

	public void setPharmaFrequency1(String pharmaFrequency1) {
		this.pharmaFrequency1 = pharmaFrequency1;
	}

	public String getPharmaFrequency2() {
		return pharmaFrequency2;
	}

	public void setPharmaFrequency2(String pharmaFrequency2) {
		this.pharmaFrequency2 = pharmaFrequency2;
	}

	public String getPharmaFrequency3() {
		return pharmaFrequency3;
	}

	public void setPharmaFrequency3(String pharmaFrequency3) {
		this.pharmaFrequency3 = pharmaFrequency3;
	}

	public String getPharmaIdentity1() {
		return pharmaIdentity1;
	}

	public void setPharmaIdentity1(String pharmaIdentity1) {
		this.pharmaIdentity1 = pharmaIdentity1;
	}

	public String getPharmaIdentity2() {
		return pharmaIdentity2;
	}

	public void setPharmaIdentity2(String pharmaIdentity2) {
		this.pharmaIdentity2 = pharmaIdentity2;
	}

	public String getPharmaIdentity3() {
		return pharmaIdentity3;
	}

	public void setPharmaIdentity3(String pharmaIdentity3) {
		this.pharmaIdentity3 = pharmaIdentity3;
	}

	public String getPharmaMedication() {
		return pharmaMedication;
	}

	public void setPharmaMedication(String pharmaMedication) {
		this.pharmaMedication = pharmaMedication;
	}

	public String getPharmaMedication1() {
		return pharmaMedication1;
	}

	public void setPharmaMedication1(String pharmaMedication1) {
		this.pharmaMedication1 = pharmaMedication1;
	}

	public String getPharmaMedication2() {
		return pharmaMedication2;
	}

	public void setPharmaMedication2(String pharmaMedication2) {
		this.pharmaMedication2 = pharmaMedication2;
	}

	public String getPharmaMedication3() {
		return pharmaMedication3;
	}

	public void setPharmaMedication3(String pharmaMedication3) {
		this.pharmaMedication3 = pharmaMedication3;
	}

	public String getPharmaRoute1() {
		return pharmaRoute1;
	}

	public void setPharmaRoute1(String pharmaRoute1) {
		this.pharmaRoute1 = pharmaRoute1;
	}

	public String getPharmaRoute2() {
		return pharmaRoute2;
	}

	public void setPharmaRoute2(String pharmaRoute2) {
		this.pharmaRoute2 = pharmaRoute2;
	}

	public String getPharmaRoute3() {
		return pharmaRoute3;
	}

	public void setPharmaRoute3(String pharmaRoute3) {
		this.pharmaRoute3 = pharmaRoute3;
	}

	public int getQ1() {
		return q1;
	}

	public void setQ1(int q1) {
		this.q1 = q1;
	}

	public int getQ2() {
		return q2;
	}

	public void setQ2(int q2) {
		this.q2 = q2;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

}
