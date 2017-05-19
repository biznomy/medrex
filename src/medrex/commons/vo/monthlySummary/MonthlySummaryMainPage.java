package medrex.commons.vo.monthlySummary;

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

@Entity
@Table(name = "MonthlySummaryMainPage")
public class MonthlySummaryMainPage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3749077804565638216L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;

	@Column(name = "residentId")
	int residentId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "formId")
	MonthlySummaryRecord formId;

	@Column(name = "meal")
	int meal;

	@Column(name = "ostomy")
	int ostomy;

	@Column(name = "continentOfBowelFrequency")
	int continentOfBowelFrequency;

	@Column(name = "continentOfBowel")
	int continentOfBowel;

	@Column(name = "foleyCatheter")
	int foleyCatheter;

	@Column(name = "continentOfBladderFrequency")
	int continentOfBladderFrequency;

	@Column(name = "continentBladder")
	int continentBladder;

	@Column(name = "skinEdema")
	int skinEdema;

	@Column(name = "behavior")
	int behavior;

	@Column(name = "moods")
	int moods;

	@Column(name = "physicalCuesDecision")
	int physicalCuesDecision;

	@Column(name = "recallLongPast")
	int recallLongPast;

	@Column(name = "physicalCuesSafety")
	int physicalCuesSafety;

	@Column(name = "reasonable")
	int reasonable;

	@Column(name = "recallWords")
	int recallWords;

	@Column(name = "tubeFeeding")
	String tubeFeeding;

	@Column(name = "reasonMeal")
	String reasonMeal;

	@Column(name = "pedsBriefs")
	boolean pedsBriefs;

	@Column(name = "depends")
	boolean depends;

	@Column(name = "bedsideCommode")
	boolean bedsideCommode;

	@Column(name = "toiletBathroom")
	boolean toiletBathroom;

	@Column(name = "bedPanUrinal")
	boolean bedPanUrinal;

	@Column(name = "checkAll")
	boolean checkAll;

	@Column(name = "sling")
	boolean sling;

	@Column(name = "trapeze")
	boolean trapeze;

	@Column(name = "crutch")
	boolean crutch;

	@Column(name = "cane")
	boolean cane;

	@Column(name = "slidingBoard")
	boolean slidingBoard;

	@Column(name = "walker")
	boolean walker;

	@Column(name = "wheelChair")
	boolean wheelChair;

	@Column(name = "braceSplint")
	boolean braceSplint;

	@Column(name = "devicesRestraintsReason")
	String devicesRestraintsReason;

	@Column(name = "specifyOthers")
	String specifyOthers;

	@Column(name = "other")
	boolean other;

	@Column(name = "lapBuddy")
	boolean lapBuddy;

	@Column(name = "wcSeatBelt")
	boolean wcSeatBelt;

	@Column(name = "geriChairWithTray")
	boolean geriChairWithTray;

	@Column(name = "recliningGeriChair")
	boolean recliningGeriChair;

	@Column(name = "wcAlarm")
	boolean wcAlarm;

	@Column(name = "wedgeCushion")
	boolean wedgeCushion;

	@Column(name = "postureSupport")
	boolean postureSupport;

	@Column(name = "mitts")
	boolean mitts;

	@Column(name = "oneSideRailsUp")
	boolean oneSideRailsUp;

	@Column(name = "bothSideRailsUp")
	boolean bothSideRailsUp;

	@Column(name = "skinEdemaLocation")
	String skinEdemaLocation;

	@Column(name = "resistiveToMedication")
	boolean resistiveToMedication;

	@Column(name = "sexuallyInappropriateBehave")
	boolean sexuallyInappropriateBehave;

	@Column(name = "cursing")
	boolean cursing;

	@Column(name = "hitting")
	boolean hitting;

	@Column(name = "pushing")
	boolean pushing;

	@Column(name = "scratching")
	boolean scratching;

	@Column(name = "biting")
	boolean biting;

	@Column(name = "kicking")
	boolean kicking;

	@Column(name = "screaming")
	boolean screaming;

	@Column(name = "resistiveToEating")
	boolean resistiveToEating;

	@Column(name = "resistiveToCare")
	boolean resistiveToCare;

	@Column(name = "threatensOthers")
	boolean threatensOthers;

	@Column(name = "wanders")
	boolean wanders;

	@Column(name = "rummages")
	boolean rummages;

	@Column(name = "hoarding")
	boolean hoarding;

	@Column(name = "smearsFeces")
	boolean smearsFeces;

	@Column(name = "smearsFood")
	boolean smearsFood;

	@Column(name = "disrobesInPublic")
	boolean disrobesInPublic;

	@Column(name = "criesYells")
	boolean criesYells;

	@Column(name = "withdrawnFromActivities")
	boolean withdrawnFromActivities;

	@Column(name = "sadPained")
	boolean sadPained;

	@Column(name = "unpleasantMood")
	boolean unpleasantMood;

	@Column(name = "repeatitiveNonHealthComplaints")
	boolean repeatitiveNonHealthComplaints;

	@Column(name = "repeatitiveHealthComplaints")
	boolean repeatitiveHealthComplaints;

	@Column(name = "expressesUnrealisticFears")
	boolean expressesUnrealisticFears;

	@Column(name = "recurrentStatements")
	boolean recurrentStatements;

	@Column(name = "cryingFearfulness")
	boolean cryingFearfulness;

	@Column(name = "selfDeprecation")
	boolean selfDeprecation;

	@Column(name = "persistentAnger")
	boolean persistentAnger;

	@Column(name = "repetitiveVerbalization")
	boolean repetitiveVerbalization;

	@Column(name = "repetitiveQuestions")
	boolean repetitiveQuestions;

	@Column(name = "makesNegativeStatements")
	boolean makesNegativeStatements;

	@Column(name = "noneOfTheAbove")
	boolean noneOfTheAbove;

	@Column(name = "littleBodyMovement")
	boolean littleBodyMovement;

	@Column(name = "staresIntoSpace")
	boolean staresIntoSpace;

	@Column(name = "repetitivePhysicalMovements")
	boolean repetitivePhysicalMovements;

	@Column(name = "picksAtSkin")
	boolean picksAtSkin;

	@Column(name = "losesTrain")
	boolean losesTrain;

	@Column(name = "movesLips")
	boolean movesLips;

	@Column(name = "confusesNight")
	boolean confusesNight;

	@Column(name = "mentalFunctionVaries")
	boolean mentalFunctionVaries;

	@Column(name = "difficultToArouse")
	boolean difficultToArouse;

	@Column(name = "repetitiveCalling")
	boolean repetitiveCalling;

	@Column(name = "changesPosition")
	boolean changesPosition;

	@Column(name = "fidgets")
	boolean fidgets;

	@Column(name = "incoherentSpeech")
	boolean incoherentSpeech;

	@Column(name = "believesSomewhereElse")
	boolean believesSomewhereElse;

	@Column(name = "difficultyAttention")
	boolean difficultyAttention;

	@Column(name = "nurse")
	String nurse;

	@Column(name = "monthYear")
	Date monthYear;

	@Column(name = "roomNo")
	String roomNo;

	@Column(name = "residentName")
	String residentName;

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

	public MonthlySummaryRecord getFormId() {
		return formId;
	}

	public void setFormId(MonthlySummaryRecord formId) {
		this.formId = formId;
	}

	public int getMeal() {
		return meal;
	}

	public void setMeal(int meal) {
		this.meal = meal;
	}

	public int getOstomy() {
		return ostomy;
	}

	public void setOstomy(int ostomy) {
		this.ostomy = ostomy;
	}

	public int getContinentOfBowelFrequency() {
		return continentOfBowelFrequency;
	}

	public void setContinentOfBowelFrequency(int continentOfBowelFrequency) {
		this.continentOfBowelFrequency = continentOfBowelFrequency;
	}

	public int getContinentOfBowel() {
		return continentOfBowel;
	}

	public void setContinentOfBowel(int continentOfBowel) {
		this.continentOfBowel = continentOfBowel;
	}

	public int getFoleyCatheter() {
		return foleyCatheter;
	}

	public void setFoleyCatheter(int foleyCatheter) {
		this.foleyCatheter = foleyCatheter;
	}

	public int getContinentOfBladderFrequency() {
		return continentOfBladderFrequency;
	}

	public void setContinentOfBladderFrequency(int continentOfBladderFrequency) {
		this.continentOfBladderFrequency = continentOfBladderFrequency;
	}

	public int getContinentBladder() {
		return continentBladder;
	}

	public void setContinentBladder(int continentBladder) {
		this.continentBladder = continentBladder;
	}

	public int getSkinEdema() {
		return skinEdema;
	}

	public void setSkinEdema(int skinEdema) {
		this.skinEdema = skinEdema;
	}

	public int getBehavior() {
		return behavior;
	}

	public void setBehavior(int behavior) {
		this.behavior = behavior;
	}

	public int getMoods() {
		return moods;
	}

	public void setMoods(int moods) {
		this.moods = moods;
	}

	public int getPhysicalCuesDecision() {
		return physicalCuesDecision;
	}

	public void setPhysicalCuesDecision(int physicalCuesDecision) {
		this.physicalCuesDecision = physicalCuesDecision;
	}

	public int getRecallLongPast() {
		return recallLongPast;
	}

	public void setRecallLongPast(int recallLongPast) {
		this.recallLongPast = recallLongPast;
	}

	public int getPhysicalCuesSafety() {
		return physicalCuesSafety;
	}

	public void setPhysicalCuesSafety(int physicalCuesSafety) {
		this.physicalCuesSafety = physicalCuesSafety;
	}

	public int getReasonable() {
		return reasonable;
	}

	public void setReasonable(int reasonable) {
		this.reasonable = reasonable;
	}

	public int getRecallWords() {
		return recallWords;
	}

	public void setRecallWords(int recallWords) {
		this.recallWords = recallWords;
	}

	public String getTubeFeeding() {
		return tubeFeeding;
	}

	public void setTubeFeeding(String tubeFeeding) {
		this.tubeFeeding = tubeFeeding;
	}

	public String getReasonMeal() {
		return reasonMeal;
	}

	public void setReasonMeal(String reasonMeal) {
		this.reasonMeal = reasonMeal;
	}

	public boolean isPedsBriefs() {
		return pedsBriefs;
	}

	public void setPedsBriefs(boolean pedsBriefs) {
		this.pedsBriefs = pedsBriefs;
	}

	public boolean isDepends() {
		return depends;
	}

	public void setDepends(boolean depends) {
		this.depends = depends;
	}

	public boolean isBedsideCommode() {
		return bedsideCommode;
	}

	public void setBedsideCommode(boolean bedsideCommode) {
		this.bedsideCommode = bedsideCommode;
	}

	public boolean isToiletBathroom() {
		return toiletBathroom;
	}

	public void setToiletBathroom(boolean toiletBathroom) {
		this.toiletBathroom = toiletBathroom;
	}

	public boolean isBedPanUrinal() {
		return bedPanUrinal;
	}

	public void setBedPanUrinal(boolean bedPanUrinal) {
		this.bedPanUrinal = bedPanUrinal;
	}

	public boolean isCheckAll() {
		return checkAll;
	}

	public void setCheckAll(boolean checkAll) {
		this.checkAll = checkAll;
	}

	public boolean isSling() {
		return sling;
	}

	public void setSling(boolean sling) {
		this.sling = sling;
	}

	public boolean isTrapeze() {
		return trapeze;
	}

	public void setTrapeze(boolean trapeze) {
		this.trapeze = trapeze;
	}

	public boolean isCrutch() {
		return crutch;
	}

	public void setCrutch(boolean crutch) {
		this.crutch = crutch;
	}

	public boolean isCane() {
		return cane;
	}

	public void setCane(boolean cane) {
		this.cane = cane;
	}

	public boolean isSlidingBoard() {
		return slidingBoard;
	}

	public void setSlidingBoard(boolean slidingBoard) {
		this.slidingBoard = slidingBoard;
	}

	public boolean isWalker() {
		return walker;
	}

	public void setWalker(boolean walker) {
		this.walker = walker;
	}

	public boolean isWheelChair() {
		return wheelChair;
	}

	public void setWheelChair(boolean wheelChair) {
		this.wheelChair = wheelChair;
	}

	public boolean isBraceSplint() {
		return braceSplint;
	}

	public void setBraceSplint(boolean braceSplint) {
		this.braceSplint = braceSplint;
	}

	public String getDevicesRestraintsReason() {
		return devicesRestraintsReason;
	}

	public void setDevicesRestraintsReason(String devicesRestraintsReason) {
		this.devicesRestraintsReason = devicesRestraintsReason;
	}

	public String getSpecifyOthers() {
		return specifyOthers;
	}

	public void setSpecifyOthers(String specifyOthers) {
		this.specifyOthers = specifyOthers;
	}

	public boolean isOther() {
		return other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public boolean isLapBuddy() {
		return lapBuddy;
	}

	public void setLapBuddy(boolean lapBuddy) {
		this.lapBuddy = lapBuddy;
	}

	public boolean isWcSeatBelt() {
		return wcSeatBelt;
	}

	public void setWcSeatBelt(boolean wcSeatBelt) {
		this.wcSeatBelt = wcSeatBelt;
	}

	public boolean isGeriChairWithTray() {
		return geriChairWithTray;
	}

	public void setGeriChairWithTray(boolean geriChairWithTray) {
		this.geriChairWithTray = geriChairWithTray;
	}

	public boolean isRecliningGeriChair() {
		return recliningGeriChair;
	}

	public void setRecliningGeriChair(boolean recliningGeriChair) {
		this.recliningGeriChair = recliningGeriChair;
	}

	public boolean isWcAlarm() {
		return wcAlarm;
	}

	public void setWcAlarm(boolean wcAlarm) {
		this.wcAlarm = wcAlarm;
	}

	public boolean isWedgeCushion() {
		return wedgeCushion;
	}

	public void setWedgeCushion(boolean wedgeCushion) {
		this.wedgeCushion = wedgeCushion;
	}

	public boolean isPostureSupport() {
		return postureSupport;
	}

	public void setPostureSupport(boolean postureSupport) {
		this.postureSupport = postureSupport;
	}

	public boolean isMitts() {
		return mitts;
	}

	public void setMitts(boolean mitts) {
		this.mitts = mitts;
	}

	public boolean isOneSideRailsUp() {
		return oneSideRailsUp;
	}

	public void setOneSideRailsUp(boolean oneSideRailsUp) {
		this.oneSideRailsUp = oneSideRailsUp;
	}

	public boolean isBothSideRailsUp() {
		return bothSideRailsUp;
	}

	public void setBothSideRailsUp(boolean bothSideRailsUp) {
		this.bothSideRailsUp = bothSideRailsUp;
	}

	public String getSkinEdemaLocation() {
		return skinEdemaLocation;
	}

	public void setSkinEdemaLocation(String skinEdemaLocation) {
		this.skinEdemaLocation = skinEdemaLocation;
	}

	public boolean isResistiveToMedication() {
		return resistiveToMedication;
	}

	public void setResistiveToMedication(boolean resistiveToMedication) {
		this.resistiveToMedication = resistiveToMedication;
	}

	public boolean isSexuallyInappropriateBehave() {
		return sexuallyInappropriateBehave;
	}

	public void setSexuallyInappropriateBehave(
			boolean sexuallyInappropriateBehave) {
		this.sexuallyInappropriateBehave = sexuallyInappropriateBehave;
	}

	public boolean isCursing() {
		return cursing;
	}

	public void setCursing(boolean cursing) {
		this.cursing = cursing;
	}

	public boolean isHitting() {
		return hitting;
	}

	public void setHitting(boolean hitting) {
		this.hitting = hitting;
	}

	public boolean isPushing() {
		return pushing;
	}

	public void setPushing(boolean pushing) {
		this.pushing = pushing;
	}

	public boolean isScratching() {
		return scratching;
	}

	public void setScratching(boolean scratching) {
		this.scratching = scratching;
	}

	public boolean isBiting() {
		return biting;
	}

	public void setBiting(boolean biting) {
		this.biting = biting;
	}

	public boolean isKicking() {
		return kicking;
	}

	public void setKicking(boolean kicking) {
		this.kicking = kicking;
	}

	public boolean isScreaming() {
		return screaming;
	}

	public void setScreaming(boolean screaming) {
		this.screaming = screaming;
	}

	public boolean isResistiveToEating() {
		return resistiveToEating;
	}

	public void setResistiveToEating(boolean resistiveToEating) {
		this.resistiveToEating = resistiveToEating;
	}

	public boolean isResistiveToCare() {
		return resistiveToCare;
	}

	public void setResistiveToCare(boolean resistiveToCare) {
		this.resistiveToCare = resistiveToCare;
	}

	public boolean isThreatensOthers() {
		return threatensOthers;
	}

	public void setThreatensOthers(boolean threatensOthers) {
		this.threatensOthers = threatensOthers;
	}

	public boolean isWanders() {
		return wanders;
	}

	public void setWanders(boolean wanders) {
		this.wanders = wanders;
	}

	public boolean isRummages() {
		return rummages;
	}

	public void setRummages(boolean rummages) {
		this.rummages = rummages;
	}

	public boolean isHoarding() {
		return hoarding;
	}

	public void setHoarding(boolean hoarding) {
		this.hoarding = hoarding;
	}

	public boolean isSmearsFeces() {
		return smearsFeces;
	}

	public void setSmearsFeces(boolean smearsFeces) {
		this.smearsFeces = smearsFeces;
	}

	public boolean isSmearsFood() {
		return smearsFood;
	}

	public void setSmearsFood(boolean smearsFood) {
		this.smearsFood = smearsFood;
	}

	public boolean isDisrobesInPublic() {
		return disrobesInPublic;
	}

	public void setDisrobesInPublic(boolean disrobesInPublic) {
		this.disrobesInPublic = disrobesInPublic;
	}

	public boolean isCriesYells() {
		return criesYells;
	}

	public void setCriesYells(boolean criesYells) {
		this.criesYells = criesYells;
	}

	public boolean isWithdrawnFromActivities() {
		return withdrawnFromActivities;
	}

	public void setWithdrawnFromActivities(boolean withdrawnFromActivities) {
		this.withdrawnFromActivities = withdrawnFromActivities;
	}

	public boolean isSadPained() {
		return sadPained;
	}

	public void setSadPained(boolean sadPained) {
		this.sadPained = sadPained;
	}

	public boolean isUnpleasantMood() {
		return unpleasantMood;
	}

	public void setUnpleasantMood(boolean unpleasantMood) {
		this.unpleasantMood = unpleasantMood;
	}

	public boolean isRepeatitiveNonHealthComplaints() {
		return repeatitiveNonHealthComplaints;
	}

	public void setRepeatitiveNonHealthComplaints(
			boolean repeatitiveNonHealthComplaints) {
		this.repeatitiveNonHealthComplaints = repeatitiveNonHealthComplaints;
	}

	public boolean isRepeatitiveHealthComplaints() {
		return repeatitiveHealthComplaints;
	}

	public void setRepeatitiveHealthComplaints(
			boolean repeatitiveHealthComplaints) {
		this.repeatitiveHealthComplaints = repeatitiveHealthComplaints;
	}

	public boolean isExpressesUnrealisticFears() {
		return expressesUnrealisticFears;
	}

	public void setExpressesUnrealisticFears(boolean expressesUnrealisticFears) {
		this.expressesUnrealisticFears = expressesUnrealisticFears;
	}

	public boolean isRecurrentStatements() {
		return recurrentStatements;
	}

	public void setRecurrentStatements(boolean recurrentStatements) {
		this.recurrentStatements = recurrentStatements;
	}

	public boolean isCryingFearfulness() {
		return cryingFearfulness;
	}

	public void setCryingFearfulness(boolean cryingFearfulness) {
		this.cryingFearfulness = cryingFearfulness;
	}

	public boolean isSelfDeprecation() {
		return selfDeprecation;
	}

	public void setSelfDeprecation(boolean selfDeprecation) {
		this.selfDeprecation = selfDeprecation;
	}

	public boolean isPersistentAnger() {
		return persistentAnger;
	}

	public void setPersistentAnger(boolean persistentAnger) {
		this.persistentAnger = persistentAnger;
	}

	public boolean isRepetitiveVerbalization() {
		return repetitiveVerbalization;
	}

	public void setRepetitiveVerbalization(boolean repetitiveVerbalization) {
		this.repetitiveVerbalization = repetitiveVerbalization;
	}

	public boolean isRepetitiveQuestions() {
		return repetitiveQuestions;
	}

	public void setRepetitiveQuestions(boolean repetitiveQuestions) {
		this.repetitiveQuestions = repetitiveQuestions;
	}

	public boolean isMakesNegativeStatements() {
		return makesNegativeStatements;
	}

	public void setMakesNegativeStatements(boolean makesNegativeStatements) {
		this.makesNegativeStatements = makesNegativeStatements;
	}

	public boolean isNoneOfTheAbove() {
		return noneOfTheAbove;
	}

	public void setNoneOfTheAbove(boolean noneOfTheAbove) {
		this.noneOfTheAbove = noneOfTheAbove;
	}

	public boolean isLittleBodyMovement() {
		return littleBodyMovement;
	}

	public void setLittleBodyMovement(boolean littleBodyMovement) {
		this.littleBodyMovement = littleBodyMovement;
	}

	public boolean isStaresIntoSpace() {
		return staresIntoSpace;
	}

	public void setStaresIntoSpace(boolean staresIntoSpace) {
		this.staresIntoSpace = staresIntoSpace;
	}

	public boolean isRepetitivePhysicalMovements() {
		return repetitivePhysicalMovements;
	}

	public void setRepetitivePhysicalMovements(
			boolean repetitivePhysicalMovements) {
		this.repetitivePhysicalMovements = repetitivePhysicalMovements;
	}

	public boolean isPicksAtSkin() {
		return picksAtSkin;
	}

	public void setPicksAtSkin(boolean picksAtSkin) {
		this.picksAtSkin = picksAtSkin;
	}

	public boolean isLosesTrain() {
		return losesTrain;
	}

	public void setLosesTrain(boolean losesTrain) {
		this.losesTrain = losesTrain;
	}

	public boolean isMovesLips() {
		return movesLips;
	}

	public void setMovesLips(boolean movesLips) {
		this.movesLips = movesLips;
	}

	public boolean isConfusesNight() {
		return confusesNight;
	}

	public void setConfusesNight(boolean confusesNight) {
		this.confusesNight = confusesNight;
	}

	public boolean isMentalFunctionVaries() {
		return mentalFunctionVaries;
	}

	public void setMentalFunctionVaries(boolean mentalFunctionVaries) {
		this.mentalFunctionVaries = mentalFunctionVaries;
	}

	public boolean isDifficultToArouse() {
		return difficultToArouse;
	}

	public void setDifficultToArouse(boolean difficultToArouse) {
		this.difficultToArouse = difficultToArouse;
	}

	public boolean isRepetitiveCalling() {
		return repetitiveCalling;
	}

	public void setRepetitiveCalling(boolean repetitiveCalling) {
		this.repetitiveCalling = repetitiveCalling;
	}

	public boolean isChangesPosition() {
		return changesPosition;
	}

	public void setChangesPosition(boolean changesPosition) {
		this.changesPosition = changesPosition;
	}

	public boolean isFidgets() {
		return fidgets;
	}

	public void setFidgets(boolean fidgets) {
		this.fidgets = fidgets;
	}

	public boolean isIncoherentSpeech() {
		return incoherentSpeech;
	}

	public void setIncoherentSpeech(boolean incoherentSpeech) {
		this.incoherentSpeech = incoherentSpeech;
	}

	public boolean isBelievesSomewhereElse() {
		return believesSomewhereElse;
	}

	public void setBelievesSomewhereElse(boolean believesSomewhereElse) {
		this.believesSomewhereElse = believesSomewhereElse;
	}

	public boolean isDifficultyAttention() {
		return difficultyAttention;
	}

	public void setDifficultyAttention(boolean difficultyAttention) {
		this.difficultyAttention = difficultyAttention;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public Date getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(Date monthYear) {
		this.monthYear = monthYear;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

}
