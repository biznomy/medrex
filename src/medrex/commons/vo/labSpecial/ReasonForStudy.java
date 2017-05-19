package medrex.commons.vo.labSpecial;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ReasonForStudy")
public class ReasonForStudy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5432884387677219973L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "ultrasoundMalignantOterSites")
	private Boolean ultrasoundMalignantOterSites;
	@Column(name = "ultrasoundMNfGallBladder")
	private Boolean ultrasoundMNfGallBladder;
	@Column(name = "ultrasoundNiphritis")
	private Boolean ultrasoundNiphritis;
	@Column(name = "ultrasoundRenalFailure")
	private Boolean ultrasoundRenalFailure;
	@Column(name = "thyroidAnomalies")
	private Boolean thyroidAnomalies;
	@Column(name = "thyroidCyst")
	private Boolean thyroidCyst;
	@Column(name = "thyroidDisorder")
	private Boolean thyroidDisorder;
	@Column(name = "thyroidDyshormonogenic")
	private Boolean thyroidDyshormonogenic;
	@Column(name = "thyroidHodgkins")
	private Boolean thyroidHodgkins;
	@Column(name = "thyroidHemorrhage")
	private Boolean thyroidHemorrhage;
	@Column(name = "thyroidUnspecified")
	private Boolean thyroidUnspecified;
	@Column(name = "thyroidThyroiditis")
	private Boolean thyroidThyroiditis;
	@Column(name = "carotidParalysis")
	private Boolean carotidParalysis;
	@Column(name = "carotidEpilepsy")
	private Boolean carotidEpilepsy;
	@Column(name = "carotidMigraine")
	private Boolean carotidMigraine;
	@Column(name = "carotidUnspecified")
	private Boolean carotidUnspecified;
	@Column(name = "carotidVisual")
	private Boolean carotidVisual;
	@Column(name = "carotidOcclusionWithCI")
	private Boolean carotidOcclusionWithCI;
	@Column(name = "carotidOcclusionWithoutCI")
	private Boolean carotidOcclusionWithoutCI;
	@Column(name = "echocardiogramMitralStenosis")
	private Boolean echocardiogramMitralStenosis;
	@Column(name = "echocardiogramUnspecifiedMV")
	private Boolean echocardiogramUnspecifiedMV;
	@Column(name = "echocardiogramMitralAortic")
	private Boolean echocardiogramMitralAortic;
	@Column(name = "echocardiogramHypertensive")
	private Boolean echocardiogramHypertensive;
	@Column(name = "echocardiogramEssential")
	private Boolean echocardiogramEssential;
	@Column(name = "echocardiogramRheumatic")
	private Boolean echocardiogramRheumatic;
	@Column(name = "echocardiogramAcuteMyocardial")
	private Boolean echocardiogramAcuteMyocardial;
	@Column(name = "echocardiogramCoronary")
	private Boolean echocardiogramCoronary;
	@Column(name = "echocardiogramAcutePari")
	private Boolean echocardiogramAcutePari;
	@Column(name = "echocardiogramPulmonary")
	private Boolean echocardiogramPulmonary;
	@Column(name = "echocardiogramUnspecifiedDis")
	private Boolean echocardiogramUnspecifiedDis;
	@Column(name = "echocardiogramAneurysm")
	private Boolean echocardiogramAneurysm;
	@Column(name = "echocardiogramOtherHeart")
	private Boolean echocardiogramOtherHeart;
	@Column(name = "echocardiogramAtrialFib")
	private Boolean echocardiogramAtrialFib;
	@Column(name = "echocardiogramPrematureBeats")
	private Boolean echocardiogramPrematureBeats;
	@Column(name = "echocardiogramCardiacArrest")
	private Boolean echocardiogramCardiacArrest;
	@Column(name = "echocardiogramHeartFailure")
	private Boolean echocardiogramHeartFailure;
	@Column(name = "echocardiogramCardiovascular")
	private Boolean echocardiogramCardiovascular;
	@Column(name = "echocardiogramMyocardities")
	private Boolean echocardiogramMyocardities;
	@Column(name = "echocardiogramCardiomegaly")
	private Boolean echocardiogramCardiomegaly;
	@Column(name = "pelvisBenignNeoplasmFemale")
	private Boolean pelvisBenignNeoplasmFemale;
	@Column(name = "pelvisBenignNeoplasmMale")
	private Boolean pelvisBenignNeoplasmMale;
	@Column(name = "pelvisCalculus")
	private Boolean pelvisCalculus;
	@Column(name = "pelvisDiverticulum")
	private Boolean pelvisDiverticulum;
	@Column(name = "pelvisHyperplasia")
	private Boolean pelvisHyperplasia;
	@Column(name = "pelvisMalignantPelvis")
	private Boolean pelvisMalignantPelvis;
	@Column(name = "pelvisMalignantProstate")
	private Boolean pelvisMalignantProstate;
	@Column(name = "pelvisMalignantNeoplasmOfMale")
	private Boolean pelvisMalignantNeoplasmOfMale;
	@Column(name = "pelvisPelvisSwelling")
	private Boolean pelvisPelvisSwelling;
	@Column(name = "breastPleuralEffusion")
	private Boolean breastPleuralEffusion;
	@Column(name = "breastSolitary")
	private Boolean breastSolitary;
	@Column(name = "breastPalpable")
	private Boolean breastPalpable;
	@Column(name = "breastMastodynia")
	private Boolean breastMastodynia;
	@Column(name = "venousVaricoseveinsUlcer")
	private Boolean venousVaricoseveinsUlcer;
	@Column(name = "venousVaricoseInflam")
	private Boolean venousVaricoseInflam;
	@Column(name = "venousVaricoseUlcerInflam")
	private Boolean venousVaricoseUlcerInflam;
	@Column(name = "venousVaricoseUlcerOrInflam")
	private Boolean venousVaricoseUlcerOrInflam;
	@Column(name = "venousPulmonaryEmbolism")
	private Boolean venousPulmonaryEmbolism;
	@Column(name = "venousPhlebitisLower")
	private Boolean venousPhlebitisLower;
	@Column(name = "venousPhlebitisUpper")
	private Boolean venousPhlebitisUpper;
	@Column(name = "venousHemmorrhage")
	private Boolean venousHemmorrhage;
	@Column(name = "venousCompression")
	private Boolean venousCompression;
	@Column(name = "venousAnomalies")
	private Boolean venousAnomalies;
	@Column(name = "arterialDiabetes")
	private Boolean arterialDiabetes;
	@Column(name = "arterialAtherosClaudication")
	private Boolean arterialAtherosClaudication;
	@Column(name = "arterialAtherosRestPain")
	private Boolean arterialAtherosRestPain;
	@Column(name = "arterialAtherosUlceration")
	private Boolean arterialAtherosUlceration;
	@Column(name = "arterialAtherosGangrene")
	private Boolean arterialAtherosGangrene;
	@Column(name = "arterialPeripheralVascular")
	private Boolean arterialPeripheralVascular;
	@Column(name = "arterialArterialEmbolismUpper")
	private Boolean arterialArterialEmbolismUpper;
	@Column(name = "arterialArterialEmbolismLower")
	private Boolean arterialArterialEmbolismLower;
	@Column(name = "arterialUlcersChronic")
	private Boolean arterialUlcersChronic;
	@Column(name = "arterialGangrene")
	private Boolean arterialGangrene;

	public Boolean getArterialArterialEmbolismLower() {
		return arterialArterialEmbolismLower;
	}

	public void setArterialArterialEmbolismLower(
			Boolean arterialArterialEmbolismLower) {
		this.arterialArterialEmbolismLower = arterialArterialEmbolismLower;
	}

	public Boolean getArterialArterialEmbolismUpper() {
		return arterialArterialEmbolismUpper;
	}

	public void setArterialArterialEmbolismUpper(
			Boolean arterialArterialEmbolismUpper) {
		this.arterialArterialEmbolismUpper = arterialArterialEmbolismUpper;
	}

	public Boolean getArterialAtherosClaudication() {
		return arterialAtherosClaudication;
	}

	public void setArterialAtherosClaudication(
			Boolean arterialAtherosClaudication) {
		this.arterialAtherosClaudication = arterialAtherosClaudication;
	}

	public Boolean getArterialAtherosGangrene() {
		return arterialAtherosGangrene;
	}

	public void setArterialAtherosGangrene(Boolean arterialAtherosGangrene) {
		this.arterialAtherosGangrene = arterialAtherosGangrene;
	}

	public Boolean getArterialAtherosRestPain() {
		return arterialAtherosRestPain;
	}

	public void setArterialAtherosRestPain(Boolean arterialAtherosRestPain) {
		this.arterialAtherosRestPain = arterialAtherosRestPain;
	}

	public Boolean getArterialAtherosUlceration() {
		return arterialAtherosUlceration;
	}

	public void setArterialAtherosUlceration(Boolean arterialAtherosUlceration) {
		this.arterialAtherosUlceration = arterialAtherosUlceration;
	}

	public Boolean getArterialDiabetes() {
		return arterialDiabetes;
	}

	public void setArterialDiabetes(Boolean arterialDiabetes) {
		this.arterialDiabetes = arterialDiabetes;
	}

	public Boolean getArterialGangrene() {
		return arterialGangrene;
	}

	public void setArterialGangrene(Boolean arterialGangrene) {
		this.arterialGangrene = arterialGangrene;
	}

	public Boolean getArterialPeripheralVascular() {
		return arterialPeripheralVascular;
	}

	public void setArterialPeripheralVascular(Boolean arterialPeripheralVascular) {
		this.arterialPeripheralVascular = arterialPeripheralVascular;
	}

	public Boolean getArterialUlcersChronic() {
		return arterialUlcersChronic;
	}

	public void setArterialUlcersChronic(Boolean arterialUlcersChronic) {
		this.arterialUlcersChronic = arterialUlcersChronic;
	}

	public Boolean getBreastMastodynia() {
		return breastMastodynia;
	}

	public void setBreastMastodynia(Boolean breastMastodynia) {
		this.breastMastodynia = breastMastodynia;
	}

	public Boolean getBreastPalpable() {
		return breastPalpable;
	}

	public void setBreastPalpable(Boolean breastPalpable) {
		this.breastPalpable = breastPalpable;
	}

	public Boolean getBreastPleuralEffusion() {
		return breastPleuralEffusion;
	}

	public void setBreastPleuralEffusion(Boolean breastPleuralEffusion) {
		this.breastPleuralEffusion = breastPleuralEffusion;
	}

	public Boolean getBreastSolitary() {
		return breastSolitary;
	}

	public void setBreastSolitary(Boolean breastSolitary) {
		this.breastSolitary = breastSolitary;
	}

	public Boolean getCarotidEpilepsy() {
		return carotidEpilepsy;
	}

	public void setCarotidEpilepsy(Boolean carotidEpilepsy) {
		this.carotidEpilepsy = carotidEpilepsy;
	}

	public Boolean getCarotidMigraine() {
		return carotidMigraine;
	}

	public void setCarotidMigraine(Boolean carotidMigraine) {
		this.carotidMigraine = carotidMigraine;
	}

	public Boolean getCarotidOcclusionWithCI() {
		return carotidOcclusionWithCI;
	}

	public void setCarotidOcclusionWithCI(Boolean carotidOcclusionWithCI) {
		this.carotidOcclusionWithCI = carotidOcclusionWithCI;
	}

	public Boolean getCarotidOcclusionWithoutCI() {
		return carotidOcclusionWithoutCI;
	}

	public void setCarotidOcclusionWithoutCI(Boolean carotidOcclusionWithoutCI) {
		this.carotidOcclusionWithoutCI = carotidOcclusionWithoutCI;
	}

	public Boolean getCarotidParalysis() {
		return carotidParalysis;
	}

	public void setCarotidParalysis(Boolean carotidParalysis) {
		this.carotidParalysis = carotidParalysis;
	}

	public Boolean getCarotidUnspecified() {
		return carotidUnspecified;
	}

	public void setCarotidUnspecified(Boolean carotidUnspecified) {
		this.carotidUnspecified = carotidUnspecified;
	}

	public Boolean getCarotidVisual() {
		return carotidVisual;
	}

	public void setCarotidVisual(Boolean carotidVisual) {
		this.carotidVisual = carotidVisual;
	}

	public Boolean getEchocardiogramAcuteMyocardial() {
		return echocardiogramAcuteMyocardial;
	}

	public void setEchocardiogramAcuteMyocardial(
			Boolean echocardiogramAcuteMyocardial) {
		this.echocardiogramAcuteMyocardial = echocardiogramAcuteMyocardial;
	}

	public Boolean getEchocardiogramAcutePari() {
		return echocardiogramAcutePari;
	}

	public void setEchocardiogramAcutePari(Boolean echocardiogramAcutePari) {
		this.echocardiogramAcutePari = echocardiogramAcutePari;
	}

	public Boolean getEchocardiogramAneurysm() {
		return echocardiogramAneurysm;
	}

	public void setEchocardiogramAneurysm(Boolean echocardiogramAneurysm) {
		this.echocardiogramAneurysm = echocardiogramAneurysm;
	}

	public Boolean getEchocardiogramAtrialFib() {
		return echocardiogramAtrialFib;
	}

	public void setEchocardiogramAtrialFib(Boolean echocardiogramAtrialFib) {
		this.echocardiogramAtrialFib = echocardiogramAtrialFib;
	}

	public Boolean getEchocardiogramCardiacArrest() {
		return echocardiogramCardiacArrest;
	}

	public void setEchocardiogramCardiacArrest(
			Boolean echocardiogramCardiacArrest) {
		this.echocardiogramCardiacArrest = echocardiogramCardiacArrest;
	}

	public Boolean getEchocardiogramCardiomegaly() {
		return echocardiogramCardiomegaly;
	}

	public void setEchocardiogramCardiomegaly(Boolean echocardiogramCardiomegaly) {
		this.echocardiogramCardiomegaly = echocardiogramCardiomegaly;
	}

	public Boolean getEchocardiogramCardiovascular() {
		return echocardiogramCardiovascular;
	}

	public void setEchocardiogramCardiovascular(
			Boolean echocardiogramCardiovascular) {
		this.echocardiogramCardiovascular = echocardiogramCardiovascular;
	}

	public Boolean getEchocardiogramCoronary() {
		return echocardiogramCoronary;
	}

	public void setEchocardiogramCoronary(Boolean echocardiogramCoronary) {
		this.echocardiogramCoronary = echocardiogramCoronary;
	}

	public Boolean getEchocardiogramEssential() {
		return echocardiogramEssential;
	}

	public void setEchocardiogramEssential(Boolean echocardiogramEssential) {
		this.echocardiogramEssential = echocardiogramEssential;
	}

	public Boolean getEchocardiogramHeartFailure() {
		return echocardiogramHeartFailure;
	}

	public void setEchocardiogramHeartFailure(Boolean echocardiogramHeartFailure) {
		this.echocardiogramHeartFailure = echocardiogramHeartFailure;
	}

	public Boolean getEchocardiogramHypertensive() {
		return echocardiogramHypertensive;
	}

	public void setEchocardiogramHypertensive(Boolean echocardiogramHypertensive) {
		this.echocardiogramHypertensive = echocardiogramHypertensive;
	}

	public Boolean getEchocardiogramMitralAortic() {
		return echocardiogramMitralAortic;
	}

	public void setEchocardiogramMitralAortic(Boolean echocardiogramMitralAortic) {
		this.echocardiogramMitralAortic = echocardiogramMitralAortic;
	}

	public Boolean getEchocardiogramMitralStenosis() {
		return echocardiogramMitralStenosis;
	}

	public void setEchocardiogramMitralStenosis(
			Boolean echocardiogramMitralStenosis) {
		this.echocardiogramMitralStenosis = echocardiogramMitralStenosis;
	}

	public Boolean getEchocardiogramMyocardities() {
		return echocardiogramMyocardities;
	}

	public void setEchocardiogramMyocardities(Boolean echocardiogramMyocardities) {
		this.echocardiogramMyocardities = echocardiogramMyocardities;
	}

	public Boolean getEchocardiogramOtherHeart() {
		return echocardiogramOtherHeart;
	}

	public void setEchocardiogramOtherHeart(Boolean echocardiogramOtherHeart) {
		this.echocardiogramOtherHeart = echocardiogramOtherHeart;
	}

	public Boolean getEchocardiogramPrematureBeats() {
		return echocardiogramPrematureBeats;
	}

	public void setEchocardiogramPrematureBeats(
			Boolean echocardiogramPrematureBeats) {
		this.echocardiogramPrematureBeats = echocardiogramPrematureBeats;
	}

	public Boolean getEchocardiogramPulmonary() {
		return echocardiogramPulmonary;
	}

	public void setEchocardiogramPulmonary(Boolean echocardiogramPulmonary) {
		this.echocardiogramPulmonary = echocardiogramPulmonary;
	}

	public Boolean getEchocardiogramRheumatic() {
		return echocardiogramRheumatic;
	}

	public void setEchocardiogramRheumatic(Boolean echocardiogramRheumatic) {
		this.echocardiogramRheumatic = echocardiogramRheumatic;
	}

	public Boolean getEchocardiogramUnspecifiedDis() {
		return echocardiogramUnspecifiedDis;
	}

	public void setEchocardiogramUnspecifiedDis(
			Boolean echocardiogramUnspecifiedDis) {
		this.echocardiogramUnspecifiedDis = echocardiogramUnspecifiedDis;
	}

	public Boolean getEchocardiogramUnspecifiedMV() {
		return echocardiogramUnspecifiedMV;
	}

	public void setEchocardiogramUnspecifiedMV(
			Boolean echocardiogramUnspecifiedMV) {
		this.echocardiogramUnspecifiedMV = echocardiogramUnspecifiedMV;
	}

	public Boolean getPelvisBenignNeoplasmFemale() {
		return pelvisBenignNeoplasmFemale;
	}

	public void setPelvisBenignNeoplasmFemale(Boolean pelvisBenignNeoplasmFemale) {
		this.pelvisBenignNeoplasmFemale = pelvisBenignNeoplasmFemale;
	}

	public Boolean getPelvisBenignNeoplasmMale() {
		return pelvisBenignNeoplasmMale;
	}

	public void setPelvisBenignNeoplasmMale(Boolean pelvisBenignNeoplasmMale) {
		this.pelvisBenignNeoplasmMale = pelvisBenignNeoplasmMale;
	}

	public Boolean getPelvisCalculus() {
		return pelvisCalculus;
	}

	public void setPelvisCalculus(Boolean pelvisCalculus) {
		this.pelvisCalculus = pelvisCalculus;
	}

	public Boolean getPelvisDiverticulum() {
		return pelvisDiverticulum;
	}

	public void setPelvisDiverticulum(Boolean pelvisDiverticulum) {
		this.pelvisDiverticulum = pelvisDiverticulum;
	}

	public Boolean getPelvisHyperplasia() {
		return pelvisHyperplasia;
	}

	public void setPelvisHyperplasia(Boolean pelvisHyperplasia) {
		this.pelvisHyperplasia = pelvisHyperplasia;
	}

	public Boolean getPelvisMalignantNeoplasmOfMale() {
		return pelvisMalignantNeoplasmOfMale;
	}

	public void setPelvisMalignantNeoplasmOfMale(
			Boolean pelvisMalignantNeoplasmOfMale) {
		this.pelvisMalignantNeoplasmOfMale = pelvisMalignantNeoplasmOfMale;
	}

	public Boolean getPelvisMalignantPelvis() {
		return pelvisMalignantPelvis;
	}

	public void setPelvisMalignantPelvis(Boolean pelvisMalignantPelvis) {
		this.pelvisMalignantPelvis = pelvisMalignantPelvis;
	}

	public Boolean getPelvisMalignantProstate() {
		return pelvisMalignantProstate;
	}

	public void setPelvisMalignantProstate(Boolean pelvisMalignantProstate) {
		this.pelvisMalignantProstate = pelvisMalignantProstate;
	}

	public Boolean getPelvisPelvisSwelling() {
		return pelvisPelvisSwelling;
	}

	public void setPelvisPelvisSwelling(Boolean pelvisPelvisSwelling) {
		this.pelvisPelvisSwelling = pelvisPelvisSwelling;
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

	public Boolean getThyroidAnomalies() {
		return thyroidAnomalies;
	}

	public void setThyroidAnomalies(Boolean thyroidAnomalies) {
		this.thyroidAnomalies = thyroidAnomalies;
	}

	public Boolean getThyroidCyst() {
		return thyroidCyst;
	}

	public void setThyroidCyst(Boolean thyroidCyst) {
		this.thyroidCyst = thyroidCyst;
	}

	public Boolean getThyroidDisorder() {
		return thyroidDisorder;
	}

	public void setThyroidDisorder(Boolean thyroidDisorder) {
		this.thyroidDisorder = thyroidDisorder;
	}

	public Boolean getThyroidDyshormonogenic() {
		return thyroidDyshormonogenic;
	}

	public void setThyroidDyshormonogenic(Boolean thyroidDyshormonogenic) {
		this.thyroidDyshormonogenic = thyroidDyshormonogenic;
	}

	public Boolean getThyroidHemorrhage() {
		return thyroidHemorrhage;
	}

	public void setThyroidHemorrhage(Boolean thyroidHemorrhage) {
		this.thyroidHemorrhage = thyroidHemorrhage;
	}

	public Boolean getThyroidHodgkins() {
		return thyroidHodgkins;
	}

	public void setThyroidHodgkins(Boolean thyroidHodgkins) {
		this.thyroidHodgkins = thyroidHodgkins;
	}

	public Boolean getThyroidThyroiditis() {
		return thyroidThyroiditis;
	}

	public void setThyroidThyroiditis(Boolean thyroidThyroiditis) {
		this.thyroidThyroiditis = thyroidThyroiditis;
	}

	public Boolean getThyroidUnspecified() {
		return thyroidUnspecified;
	}

	public void setThyroidUnspecified(Boolean thyroidUnspecified) {
		this.thyroidUnspecified = thyroidUnspecified;
	}

	public Boolean getUltrasoundMalignantOterSites() {
		return ultrasoundMalignantOterSites;
	}

	public void setUltrasoundMalignantOterSites(
			Boolean ultrasoundMalignantOterSites) {
		this.ultrasoundMalignantOterSites = ultrasoundMalignantOterSites;
	}

	public Boolean getUltrasoundMNfGallBladder() {
		return ultrasoundMNfGallBladder;
	}

	public void setUltrasoundMNfGallBladder(Boolean ultrasoundMNfGallBladder) {
		this.ultrasoundMNfGallBladder = ultrasoundMNfGallBladder;
	}

	public Boolean getUltrasoundNiphritis() {
		return ultrasoundNiphritis;
	}

	public void setUltrasoundNiphritis(Boolean ultrasoundNiphritis) {
		this.ultrasoundNiphritis = ultrasoundNiphritis;
	}

	public Boolean getUltrasoundRenalFailure() {
		return ultrasoundRenalFailure;
	}

	public void setUltrasoundRenalFailure(Boolean ultrasoundRenalFailure) {
		this.ultrasoundRenalFailure = ultrasoundRenalFailure;
	}

	public Boolean getVenousAnomalies() {
		return venousAnomalies;
	}

	public void setVenousAnomalies(Boolean venousAnomalies) {
		this.venousAnomalies = venousAnomalies;
	}

	public Boolean getVenousCompression() {
		return venousCompression;
	}

	public void setVenousCompression(Boolean venousCompression) {
		this.venousCompression = venousCompression;
	}

	public Boolean getVenousHemmorrhage() {
		return venousHemmorrhage;
	}

	public void setVenousHemmorrhage(Boolean venousHemmorrhage) {
		this.venousHemmorrhage = venousHemmorrhage;
	}

	public Boolean getVenousPhlebitisLower() {
		return venousPhlebitisLower;
	}

	public void setVenousPhlebitisLower(Boolean venousPhlebitisLower) {
		this.venousPhlebitisLower = venousPhlebitisLower;
	}

	public Boolean getVenousPhlebitisUpper() {
		return venousPhlebitisUpper;
	}

	public void setVenousPhlebitisUpper(Boolean venousPhlebitisUpper) {
		this.venousPhlebitisUpper = venousPhlebitisUpper;
	}

	public Boolean getVenousPulmonaryEmbolism() {
		return venousPulmonaryEmbolism;
	}

	public void setVenousPulmonaryEmbolism(Boolean venousPulmonaryEmbolism) {
		this.venousPulmonaryEmbolism = venousPulmonaryEmbolism;
	}

	public Boolean getVenousVaricoseInflam() {
		return venousVaricoseInflam;
	}

	public void setVenousVaricoseInflam(Boolean venousVaricoseInflam) {
		this.venousVaricoseInflam = venousVaricoseInflam;
	}

	public Boolean getVenousVaricoseUlcerInflam() {
		return venousVaricoseUlcerInflam;
	}

	public void setVenousVaricoseUlcerInflam(Boolean venousVaricoseUlcerInflam) {
		this.venousVaricoseUlcerInflam = venousVaricoseUlcerInflam;
	}

	public Boolean getVenousVaricoseUlcerOrInflam() {
		return venousVaricoseUlcerOrInflam;
	}

	public void setVenousVaricoseUlcerOrInflam(
			Boolean venousVaricoseUlcerOrInflam) {
		this.venousVaricoseUlcerOrInflam = venousVaricoseUlcerOrInflam;
	}

	public Boolean getVenousVaricoseveinsUlcer() {
		return venousVaricoseveinsUlcer;
	}

	public void setVenousVaricoseveinsUlcer(Boolean venousVaricoseveinsUlcer) {
		this.venousVaricoseveinsUlcer = venousVaricoseveinsUlcer;
	}

}
