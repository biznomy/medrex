package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SkilledFlowSheet")
public class SkilledFlowSheet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5399399443245340277L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "residentId")
	private int residentId;

	@Column(name = "formId")
	private int formId;

	@Column(name = "toiletingIndependent11To7")
	private boolean toiletingIndependent11To7;

	@Column(name = "toiletingLimited11To7")
	private boolean toiletingLimited11To7;

	@Column(name = "toileting1Extensive11To7")
	private boolean toileting1Extensive11To7;

	@Column(name = "toileting2Extensive11To7")
	private boolean toileting2Extensive11To7;

	@Column(name = "toiletingTotalDependence11To7")
	private boolean toiletingTotalDependence11To7;

	@Column(name = "transferTotalIndependence11To7")
	private boolean transferTotalIndependence11To7;

	@Column(name = "badMobilityTotalIndependence11To7")
	private boolean badMobilityTotalIndependence11To7;

	@Column(name = "badMobility1Extensive11To7")
	private boolean badMobility1Extensive11To7;

	@Column(name = "badMobilityLimited11To7")
	private boolean badMobilityLimited11To7;

	@Column(name = "badMobilityIndepemdent11To7")
	private boolean badMobilityIndepemdent11To7;

	@Column(name = "badMobility2Extensive11To7")
	private boolean badMobility2Extensive11To7;

	@Column(name = "badMobilityTotalIndependence3To11")
	private boolean badMobilityTotalIndependence3To11;

	@Column(name = "badMobility2Extensive3To11")
	private boolean badMobility2Extensive3To11;

	@Column(name = "badMobility1Extensive3To11")
	private boolean badMobility1Extensive3To11;

	@Column(name = "badMobilityIndepemdent3To11")
	private boolean badMobilityIndepemdent3To11;

	@Column(name = "transferIndepemdent3To11")
	private boolean transferIndepemdent3To11;

	@Column(name = "transferLimited3To11")
	private boolean transferLimited3To11;

	@Column(name = "transfer1Extensive3To11")
	private boolean transfer1Extensive3To11;

	@Column(name = "transfer2Extensive3To11")
	private boolean transfer2Extensive3To11;

	@Column(name = "transferTotalIndependence3To11")
	private boolean transferTotalIndependence3To11;

	@Column(name = "toiletingTotalDependence3To11")
	private boolean toiletingTotalDependence3To11;

	@Column(name = "toileting2Extensive3To11")
	private boolean toileting2Extensive3To11;

	@Column(name = "toiletingLimited3To11")
	private boolean toiletingLimited3To11;

	@Column(name = "toileting1Extensive3To11")
	private boolean toileting1Extensive3To11;

	@Column(name = "toiletingIndependent3To11")
	private boolean toiletingIndependent3To11;

	@Column(name = "toiletingTotalDependence7To3")
	private boolean toiletingTotalDependence7To3;

	@Column(name = "toileting2Extensive7To3")
	private boolean toileting2Extensive7To3;

	@Column(name = "toileting1Extensive7To3")
	private boolean toileting1Extensive7To3;

	@Column(name = "toiletingLimited7To3")
	private boolean toiletingLimited7To3;

	@Column(name = "toiletingIndependent7To3")
	private boolean toiletingIndependent7To3;

	@Column(name = "transferIndepemdent7To3")
	private boolean transferIndepemdent7To3;

	@Column(name = "transferLimited7To3")
	private boolean transferLimited7To3;

	@Column(name = "transfer1Extensive7To3")
	private boolean transfer1Extensive7To3;

	@Column(name = "transfer2Extensive7To3")
	private boolean transfer2Extensive7To3;

	@Column(name = "transferTotalIndependence7To3")
	private boolean transferTotalIndependence7To3;

	@Column(name = "badMobility2Extensive7To3")
	private boolean badMobility2Extensive7To3;

	@Column(name = "badMobility1Extensive7To3")
	private boolean badMobility1Extensive7To3;

	@Column(name = "bedMobilityLimited7To3")
	private boolean bedMobilityLimited7To3;

	@Column(name = "badMobilityIndepemdent7To3")
	private boolean badMobilityIndepemdent7To3;

	@Column(name = "o2Saturation7To3")
	private String o2Saturation7To3;

	@Column(name = "interventions3")
	private String interventions3;

	@Column(name = "interventions2")
	private String interventions2;

	@Column(name = "interventions1")
	private String interventions1;

	@Column(name = "comments")
	private String comments;

	@Column(name = "pleasureFoods11To7")
	private String pleasureFoods11To7;

	@Column(name = "pleasureFoods3To11")
	private String pleasureFoods3To11;

	@Column(name = "pleasureFoods7To3")
	private String pleasureFoods7To3;

	@Column(name = "gtFeeding7To3")
	private String gtFeeding7To3;

	@Column(name = "gtFeeding3To11")
	private String gtFeeding3To11;

	@Column(name = "gtFeeding11To7")
	private String gtFeeding11To7;

	@Column(name = "totalDependence11To7")
	private String totalDependence11To7;

	@Column(name = "totalDependence3To11")
	private String totalDependence3To11;

	@Column(name = "totalDependence7To3")
	private String totalDependence7To3;

	@Column(name = "limitedAssist7To3")
	private String limitedAssist7To3;

	@Column(name = "limitedAssist3To11")
	private String limitedAssist3To11;

	@Column(name = "limitedAssist11To7")
	private String limitedAssist11To7;

	@Column(name = "independent11To7")
	private String independent11To7;

	@Column(name = "independent3To11")
	private String independent3To11;

	@Column(name = "independent7To3")
	private String independent7To3;

	@Column(name = "skinIntact3To11")
	private String skinIntact3To11;

	@Column(name = "suturesStaplesStrips3To11")
	private String suturesStaplesStrips3To11;

	@Column(name = "skinConcern3To11")
	private String skinConcern3To11;

	@Column(name = "wound3To11")
	private String wound3To11;

	@Column(name = "wound7To3")
	private String wound7To3;

	@Column(name = "skinConcern7To3")
	private String skinConcern7To3;

	@Column(name = "suturesStaplesStrips7To3")
	private String suturesStaplesStrips7To3;

	@Column(name = "skinIntact7To3")
	private String skinIntact7To3;

	@Column(name = "breathSoundsClear7To3")
	private String breathSoundsClear7To3;

	@Column(name = "lungsSoundsDiminished7To3")
	private String lungsSoundsDiminished7To3;

	@Column(name = "cracklesRalesRhonchi7To3")
	private String cracklesRalesRhonchi7To3;

	@Column(name = "heartRate7To3")
	private String heartRate7To3;

	@Column(name = "angina7To3")
	private String angina7To3;

	@Column(name = "suctioned7To3")
	private String suctioned7To3;

	@Column(name = "trachCare7To3")
	private String trachCare7To3;

	@Column(name = "trachCare3To11")
	private String trachCare3To11;

	@Column(name = "suctioned3To11")
	private String suctioned3To11;

	@Column(name = "angina3To11")
	private String angina3To11;

	@Column(name = "heartRate3To11")
	private String heartRate3To11;

	@Column(name = "cracklesRalesRhonchi3To11")
	private String cracklesRalesRhonchi3To11;

	@Column(name = "lungsSoundsDiminished3To11")
	private String lungsSoundsDiminished3To11;

	@Column(name = "breathSoundsClear3To11")
	private String breathSoundsClear3To11;

	@Column(name = "breathSoundsClear11To7")
	private String breathSoundsClear11To7;

	@Column(name = "lungsSoundsDiminished11To7")
	private String lungsSoundsDiminished11To7;

	@Column(name = "cracklesRalesRhonchi11To7")
	private String cracklesRalesRhonchi11To7;

	@Column(name = "heartRate11To7")
	private String heartRate11To7;

	@Column(name = "angina11To7")
	private String angina11To7;

	@Column(name = "suctioned11To7")
	private String suctioned11To7;

	@Column(name = "trachCare11To7")
	private String trachCare11To7;

	@Column(name = "o2Saturation11To7")
	private String o2Saturation11To7;

	@Column(name = "temp11To7")
	private String temp11To7;

	@Column(name = "respiration11To7")
	private String respiration11To7;

	@Column(name = "pulse11To7")
	private String pulse11To7;

	@Column(name = "pulse3To11")
	private String pulse3To11;

	@Column(name = "respiration3To11")
	private String respiration3To11;

	@Column(name = "temp3To11")
	private String temp3To11;

	@Column(name = "o2Saturation3To11")
	private String o2Saturation3To11;

	@Column(name = "respiration7To3")
	private String respiration7To3;

	@Column(name = "temp7To3")
	private String temp7To3;

	@Column(name = "pulse7To3")
	private String pulse7To3;

	@Column(name = "bp11To7")
	private String bp11To7;

	@Column(name = "bp3To11")
	private String bp3To11;

	@Column(name = "bp7To3")
	private String bp7To3;

	@Column(name = "roomNo")
	private String roomNo;

	@Column(name = "dateOfAssessment")
	private Date dateOfAssessment;

	@Column(name = "residentName")
	private String residentName;

	@Column(name = "badMobilityLimited3To11")
	private boolean badMobilityLimited3To11;

	@Column(name = "transferIndepemdent11To7")
	private boolean transferIndepemdent11To7;

	@Column(name = "transferLimited11To7")
	private boolean transferLimited11To7;

	@Column(name = "transfer1Extensive11To7")
	private boolean transfer1Extensive11To7;

	@Column(name = "transfer2Extensive11To7")
	private boolean transfer2Extensive11To7;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public boolean isToiletingIndependent11To7() {
		return this.toiletingIndependent11To7;
	}

	public void setToiletingIndependent11To7(boolean toiletingIndependent11To7) {
		this.toiletingIndependent11To7 = toiletingIndependent11To7;
	}

	public boolean isToiletingLimited11To7() {
		return this.toiletingLimited11To7;
	}

	public void setToiletingLimited11To7(boolean toiletingLimited11To7) {
		this.toiletingLimited11To7 = toiletingLimited11To7;
	}

	public boolean isToileting1Extensive11To7() {
		return this.toileting1Extensive11To7;
	}

	public void setToileting1Extensive11To7(boolean toileting1Extensive11To7) {
		this.toileting1Extensive11To7 = toileting1Extensive11To7;
	}

	public boolean isToileting2Extensive11To7() {
		return this.toileting2Extensive11To7;
	}

	public void setToileting2Extensive11To7(boolean toileting2Extensive11To7) {
		this.toileting2Extensive11To7 = toileting2Extensive11To7;
	}

	public boolean isToiletingTotalDependence11To7() {
		return this.toiletingTotalDependence11To7;
	}

	public void setToiletingTotalDependence11To7(
			boolean toiletingTotalDependence11To7) {
		this.toiletingTotalDependence11To7 = toiletingTotalDependence11To7;
	}

	public boolean isTransferTotalIndependence11To7() {
		return this.transferTotalIndependence11To7;
	}

	public void setTransferTotalIndependence11To7(
			boolean transferTotalIndependence11To7) {
		this.transferTotalIndependence11To7 = transferTotalIndependence11To7;
	}

	public boolean isBadMobilityTotalIndependence11To7() {
		return this.badMobilityTotalIndependence11To7;
	}

	public void setBadMobilityTotalIndependence11To7(
			boolean badMobilityTotalIndependence11To7) {
		this.badMobilityTotalIndependence11To7 = badMobilityTotalIndependence11To7;
	}

	public boolean isBadMobility1Extensive11To7() {
		return this.badMobility1Extensive11To7;
	}

	public void setBadMobility1Extensive11To7(boolean badMobility1Extensive11To7) {
		this.badMobility1Extensive11To7 = badMobility1Extensive11To7;
	}

	public boolean isBadMobilityLimited11To7() {
		return this.badMobilityLimited11To7;
	}

	public void setBadMobilityLimited11To7(boolean badMobilityLimited11To7) {
		this.badMobilityLimited11To7 = badMobilityLimited11To7;
	}

	public boolean isBadMobilityIndepemdent11To7() {
		return this.badMobilityIndepemdent11To7;
	}

	public void setBadMobilityIndepemdent11To7(
			boolean badMobilityIndepemdent11To7) {
		this.badMobilityIndepemdent11To7 = badMobilityIndepemdent11To7;
	}

	public boolean isBadMobility2Extensive11To7() {
		return this.badMobility2Extensive11To7;
	}

	public void setBadMobility2Extensive11To7(boolean badMobility2Extensive11To7) {
		this.badMobility2Extensive11To7 = badMobility2Extensive11To7;
	}

	public boolean isBadMobilityTotalIndependence3To11() {
		return this.badMobilityTotalIndependence3To11;
	}

	public void setBadMobilityTotalIndependence3To11(
			boolean badMobilityTotalIndependence3To11) {
		this.badMobilityTotalIndependence3To11 = badMobilityTotalIndependence3To11;
	}

	public boolean isBadMobility2Extensive3To11() {
		return this.badMobility2Extensive3To11;
	}

	public void setBadMobility2Extensive3To11(boolean badMobility2Extensive3To11) {
		this.badMobility2Extensive3To11 = badMobility2Extensive3To11;
	}

	public boolean isBadMobility1Extensive3To11() {
		return this.badMobility1Extensive3To11;
	}

	public void setBadMobility1Extensive3To11(boolean badMobility1Extensive3To11) {
		this.badMobility1Extensive3To11 = badMobility1Extensive3To11;
	}

	public boolean isBadMobilityIndepemdent3To11() {
		return this.badMobilityIndepemdent3To11;
	}

	public void setBadMobilityIndepemdent3To11(
			boolean badMobilityIndepemdent3To11) {
		this.badMobilityIndepemdent3To11 = badMobilityIndepemdent3To11;
	}

	public boolean isTransferIndepemdent3To11() {
		return this.transferIndepemdent3To11;
	}

	public void setTransferIndepemdent3To11(boolean transferIndepemdent3To11) {
		this.transferIndepemdent3To11 = transferIndepemdent3To11;
	}

	public boolean isTransferLimited3To11() {
		return this.transferLimited3To11;
	}

	public void setTransferLimited3To11(boolean transferLimited3To11) {
		this.transferLimited3To11 = transferLimited3To11;
	}

	public boolean isTransfer1Extensive3To11() {
		return this.transfer1Extensive3To11;
	}

	public void setTransfer1Extensive3To11(boolean transfer1Extensive3To11) {
		this.transfer1Extensive3To11 = transfer1Extensive3To11;
	}

	public boolean isTransfer2Extensive3To11() {
		return this.transfer2Extensive3To11;
	}

	public void setTransfer2Extensive3To11(boolean transfer2Extensive3To11) {
		this.transfer2Extensive3To11 = transfer2Extensive3To11;
	}

	public boolean isTransferTotalIndependence3To11() {
		return this.transferTotalIndependence3To11;
	}

	public void setTransferTotalIndependence3To11(
			boolean transferTotalIndependence3To11) {
		this.transferTotalIndependence3To11 = transferTotalIndependence3To11;
	}

	public boolean isToiletingTotalDependence3To11() {
		return this.toiletingTotalDependence3To11;
	}

	public void setToiletingTotalDependence3To11(
			boolean toiletingTotalDependence3To11) {
		this.toiletingTotalDependence3To11 = toiletingTotalDependence3To11;
	}

	public boolean isToileting2Extensive3To11() {
		return this.toileting2Extensive3To11;
	}

	public void setToileting2Extensive3To11(boolean toileting2Extensive3To11) {
		this.toileting2Extensive3To11 = toileting2Extensive3To11;
	}

	public boolean isToiletingLimited3To11() {
		return this.toiletingLimited3To11;
	}

	public void setToiletingLimited3To11(boolean toiletingLimited3To11) {
		this.toiletingLimited3To11 = toiletingLimited3To11;
	}

	public boolean isToileting1Extensive3To11() {
		return this.toileting1Extensive3To11;
	}

	public void setToileting1Extensive3To11(boolean toileting1Extensive3To11) {
		this.toileting1Extensive3To11 = toileting1Extensive3To11;
	}

	public boolean isToiletingIndependent3To11() {
		return this.toiletingIndependent3To11;
	}

	public void setToiletingIndependent3To11(boolean toiletingIndependent3To11) {
		this.toiletingIndependent3To11 = toiletingIndependent3To11;
	}

	public boolean isToiletingTotalDependence7To3() {
		return this.toiletingTotalDependence7To3;
	}

	public void setToiletingTotalDependence7To3(
			boolean toiletingTotalDependence7To3) {
		this.toiletingTotalDependence7To3 = toiletingTotalDependence7To3;
	}

	public boolean isToileting2Extensive7To3() {
		return this.toileting2Extensive7To3;
	}

	public void setToileting2Extensive7To3(boolean toileting2Extensive7To3) {
		this.toileting2Extensive7To3 = toileting2Extensive7To3;
	}

	public boolean isToileting1Extensive7To3() {
		return this.toileting1Extensive7To3;
	}

	public void setToileting1Extensive7To3(boolean toileting1Extensive7To3) {
		this.toileting1Extensive7To3 = toileting1Extensive7To3;
	}

	public boolean isToiletingLimited7To3() {
		return this.toiletingLimited7To3;
	}

	public void setToiletingLimited7To3(boolean toiletingLimited7To3) {
		this.toiletingLimited7To3 = toiletingLimited7To3;
	}

	public boolean isToiletingIndependent7To3() {
		return this.toiletingIndependent7To3;
	}

	public void setToiletingIndependent7To3(boolean toiletingIndependent7To3) {
		this.toiletingIndependent7To3 = toiletingIndependent7To3;
	}

	public boolean isTransferIndepemdent7To3() {
		return this.transferIndepemdent7To3;
	}

	public void setTransferIndepemdent7To3(boolean transferIndepemdent7To3) {
		this.transferIndepemdent7To3 = transferIndepemdent7To3;
	}

	public boolean isTransferLimited7To3() {
		return this.transferLimited7To3;
	}

	public void setTransferLimited7To3(boolean transferLimited7To3) {
		this.transferLimited7To3 = transferLimited7To3;
	}

	public boolean isTransfer1Extensive7To3() {
		return this.transfer1Extensive7To3;
	}

	public void setTransfer1Extensive7To3(boolean transfer1Extensive7To3) {
		this.transfer1Extensive7To3 = transfer1Extensive7To3;
	}

	public boolean isTransfer2Extensive7To3() {
		return this.transfer2Extensive7To3;
	}

	public void setTransfer2Extensive7To3(boolean transfer2Extensive7To3) {
		this.transfer2Extensive7To3 = transfer2Extensive7To3;
	}

	public boolean isTransferTotalIndependence7To3() {
		return this.transferTotalIndependence7To3;
	}

	public void setTransferTotalIndependence7To3(
			boolean transferTotalIndependence7To3) {
		this.transferTotalIndependence7To3 = transferTotalIndependence7To3;
	}

	public boolean isBadMobility2Extensive7To3() {
		return this.badMobility2Extensive7To3;
	}

	public void setBadMobility2Extensive7To3(boolean badMobility2Extensive7To3) {
		this.badMobility2Extensive7To3 = badMobility2Extensive7To3;
	}

	public boolean isBadMobility1Extensive7To3() {
		return this.badMobility1Extensive7To3;
	}

	public void setBadMobility1Extensive7To3(boolean badMobility1Extensive7To3) {
		this.badMobility1Extensive7To3 = badMobility1Extensive7To3;
	}

	public boolean isBedMobilityLimited7To3() {
		return this.bedMobilityLimited7To3;
	}

	public void setBedMobilityLimited7To3(boolean bedMobilityLimited7To3) {
		this.bedMobilityLimited7To3 = bedMobilityLimited7To3;
	}

	public boolean isBadMobilityIndepemdent7To3() {
		return this.badMobilityIndepemdent7To3;
	}

	public void setBadMobilityIndepemdent7To3(boolean badMobilityIndepemdent7To3) {
		this.badMobilityIndepemdent7To3 = badMobilityIndepemdent7To3;
	}

	public String getO2Saturation7To3() {
		return this.o2Saturation7To3;
	}

	public void setO2Saturation7To3(String o2Saturation7To3) {
		this.o2Saturation7To3 = o2Saturation7To3;
	}

	public String getInterventions3() {
		return this.interventions3;
	}

	public void setInterventions3(String interventions3) {
		this.interventions3 = interventions3;
	}

	public String getInterventions2() {
		return this.interventions2;
	}

	public void setInterventions2(String interventions2) {
		this.interventions2 = interventions2;
	}

	public String getInterventions1() {
		return this.interventions1;
	}

	public void setInterventions1(String interventions1) {
		this.interventions1 = interventions1;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPleasureFoods11To7() {
		return this.pleasureFoods11To7;
	}

	public void setPleasureFoods11To7(String pleasureFoods11To7) {
		this.pleasureFoods11To7 = pleasureFoods11To7;
	}

	public String getPleasureFoods3To11() {
		return this.pleasureFoods3To11;
	}

	public void setPleasureFoods3To11(String pleasureFoods3To11) {
		this.pleasureFoods3To11 = pleasureFoods3To11;
	}

	public String getPleasureFoods7To3() {
		return this.pleasureFoods7To3;
	}

	public void setPleasureFoods7To3(String pleasureFoods7To3) {
		this.pleasureFoods7To3 = pleasureFoods7To3;
	}

	public String getGtFeeding7To3() {
		return this.gtFeeding7To3;
	}

	public void setGtFeeding7To3(String gtFeeding7To3) {
		this.gtFeeding7To3 = gtFeeding7To3;
	}

	public String getGtFeeding3To11() {
		return this.gtFeeding3To11;
	}

	public void setGtFeeding3To11(String gtFeeding3To11) {
		this.gtFeeding3To11 = gtFeeding3To11;
	}

	public String getGtFeeding11To7() {
		return this.gtFeeding11To7;
	}

	public void setGtFeeding11To7(String gtFeeding11To7) {
		this.gtFeeding11To7 = gtFeeding11To7;
	}

	public String getTotalDependence11To7() {
		return this.totalDependence11To7;
	}

	public void setTotalDependence11To7(String totalDependence11To7) {
		this.totalDependence11To7 = totalDependence11To7;
	}

	public String getTotalDependence3To11() {
		return this.totalDependence3To11;
	}

	public void setTotalDependence3To11(String totalDependence3To11) {
		this.totalDependence3To11 = totalDependence3To11;
	}

	public String getTotalDependence7To3() {
		return this.totalDependence7To3;
	}

	public void setTotalDependence7To3(String totalDependence7To3) {
		this.totalDependence7To3 = totalDependence7To3;
	}

	public String getLimitedAssist7To3() {
		return this.limitedAssist7To3;
	}

	public void setLimitedAssist7To3(String limitedAssist7To3) {
		this.limitedAssist7To3 = limitedAssist7To3;
	}

	public String getLimitedAssist3To11() {
		return this.limitedAssist3To11;
	}

	public void setLimitedAssist3To11(String limitedAssist3To11) {
		this.limitedAssist3To11 = limitedAssist3To11;
	}

	public String getLimitedAssist11To7() {
		return this.limitedAssist11To7;
	}

	public void setLimitedAssist11To7(String limitedAssist11To7) {
		this.limitedAssist11To7 = limitedAssist11To7;
	}

	public String getIndependent11To7() {
		return this.independent11To7;
	}

	public void setIndependent11To7(String independent11To7) {
		this.independent11To7 = independent11To7;
	}

	public String getIndependent3To11() {
		return this.independent3To11;
	}

	public void setIndependent3To11(String independent3To11) {
		this.independent3To11 = independent3To11;
	}

	public String getIndependent7To3() {
		return this.independent7To3;
	}

	public void setIndependent7To3(String independent7To3) {
		this.independent7To3 = independent7To3;
	}

	public String getSkinIntact3To11() {
		return this.skinIntact3To11;
	}

	public void setSkinIntact3To11(String skinIntact3To11) {
		this.skinIntact3To11 = skinIntact3To11;
	}

	public String getSuturesStaplesStrips3To11() {
		return this.suturesStaplesStrips3To11;
	}

	public void setSuturesStaplesStrips3To11(String suturesStaplesStrips3To11) {
		this.suturesStaplesStrips3To11 = suturesStaplesStrips3To11;
	}

	public String getSkinConcern3To11() {
		return this.skinConcern3To11;
	}

	public void setSkinConcern3To11(String skinConcern3To11) {
		this.skinConcern3To11 = skinConcern3To11;
	}

	public String getWound3To11() {
		return this.wound3To11;
	}

	public void setWound3To11(String wound3To11) {
		this.wound3To11 = wound3To11;
	}

	public String getWound7To3() {
		return this.wound7To3;
	}

	public void setWound7To3(String wound7To3) {
		this.wound7To3 = wound7To3;
	}

	public String getSkinConcern7To3() {
		return this.skinConcern7To3;
	}

	public void setSkinConcern7To3(String skinConcern7To3) {
		this.skinConcern7To3 = skinConcern7To3;
	}

	public String getSuturesStaplesStrips7To3() {
		return this.suturesStaplesStrips7To3;
	}

	public void setSuturesStaplesStrips7To3(String suturesStaplesStrips7To3) {
		this.suturesStaplesStrips7To3 = suturesStaplesStrips7To3;
	}

	public String getSkinIntact7To3() {
		return this.skinIntact7To3;
	}

	public void setSkinIntact7To3(String skinIntact7To3) {
		this.skinIntact7To3 = skinIntact7To3;
	}

	public String getBreathSoundsClear7To3() {
		return this.breathSoundsClear7To3;
	}

	public void setBreathSoundsClear7To3(String breathSoundsClear7To3) {
		this.breathSoundsClear7To3 = breathSoundsClear7To3;
	}

	public String getLungsSoundsDiminished7To3() {
		return this.lungsSoundsDiminished7To3;
	}

	public void setLungsSoundsDiminished7To3(String lungsSoundsDiminished7To3) {
		this.lungsSoundsDiminished7To3 = lungsSoundsDiminished7To3;
	}

	public String getCracklesRalesRhonchi7To3() {
		return this.cracklesRalesRhonchi7To3;
	}

	public void setCracklesRalesRhonchi7To3(String cracklesRalesRhonchi7To3) {
		this.cracklesRalesRhonchi7To3 = cracklesRalesRhonchi7To3;
	}

	public String getHeartRate7To3() {
		return this.heartRate7To3;
	}

	public void setHeartRate7To3(String heartRate7To3) {
		this.heartRate7To3 = heartRate7To3;
	}

	public String getAngina7To3() {
		return this.angina7To3;
	}

	public void setAngina7To3(String angina7To3) {
		this.angina7To3 = angina7To3;
	}

	public String getSuctioned7To3() {
		return this.suctioned7To3;
	}

	public void setSuctioned7To3(String suctioned7To3) {
		this.suctioned7To3 = suctioned7To3;
	}

	public String getTrachCare7To3() {
		return this.trachCare7To3;
	}

	public void setTrachCare7To3(String trachCare7To3) {
		this.trachCare7To3 = trachCare7To3;
	}

	public String getTrachCare3To11() {
		return this.trachCare3To11;
	}

	public void setTrachCare3To11(String trachCare3To11) {
		this.trachCare3To11 = trachCare3To11;
	}

	public String getSuctioned3To11() {
		return this.suctioned3To11;
	}

	public void setSuctioned3To11(String suctioned3To11) {
		this.suctioned3To11 = suctioned3To11;
	}

	public String getAngina3To11() {
		return this.angina3To11;
	}

	public void setAngina3To11(String angina3To11) {
		this.angina3To11 = angina3To11;
	}

	public String getHeartRate3To11() {
		return this.heartRate3To11;
	}

	public void setHeartRate3To11(String heartRate3To11) {
		this.heartRate3To11 = heartRate3To11;
	}

	public String getCracklesRalesRhonchi3To11() {
		return this.cracklesRalesRhonchi3To11;
	}

	public void setCracklesRalesRhonchi3To11(String cracklesRalesRhonchi3To11) {
		this.cracklesRalesRhonchi3To11 = cracklesRalesRhonchi3To11;
	}

	public String getLungsSoundsDiminished3To11() {
		return this.lungsSoundsDiminished3To11;
	}

	public void setLungsSoundsDiminished3To11(String lungsSoundsDiminished3To11) {
		this.lungsSoundsDiminished3To11 = lungsSoundsDiminished3To11;
	}

	public String getBreathSoundsClear3To11() {
		return this.breathSoundsClear3To11;
	}

	public void setBreathSoundsClear3To11(String breathSoundsClear3To11) {
		this.breathSoundsClear3To11 = breathSoundsClear3To11;
	}

	public String getBreathSoundsClear11To7() {
		return this.breathSoundsClear11To7;
	}

	public void setBreathSoundsClear11To7(String breathSoundsClear11To7) {
		this.breathSoundsClear11To7 = breathSoundsClear11To7;
	}

	public String getLungsSoundsDiminished11To7() {
		return this.lungsSoundsDiminished11To7;
	}

	public void setLungsSoundsDiminished11To7(String lungsSoundsDiminished11To7) {
		this.lungsSoundsDiminished11To7 = lungsSoundsDiminished11To7;
	}

	public String getCracklesRalesRhonchi11To7() {
		return this.cracklesRalesRhonchi11To7;
	}

	public void setCracklesRalesRhonchi11To7(String cracklesRalesRhonchi11To7) {
		this.cracklesRalesRhonchi11To7 = cracklesRalesRhonchi11To7;
	}

	public String getHeartRate11To7() {
		return this.heartRate11To7;
	}

	public void setHeartRate11To7(String heartRate11To7) {
		this.heartRate11To7 = heartRate11To7;
	}

	public String getAngina11To7() {
		return this.angina11To7;
	}

	public void setAngina11To7(String angina11To7) {
		this.angina11To7 = angina11To7;
	}

	public String getSuctioned11To7() {
		return this.suctioned11To7;
	}

	public void setSuctioned11To7(String suctioned11To7) {
		this.suctioned11To7 = suctioned11To7;
	}

	public String getTrachCare11To7() {
		return this.trachCare11To7;
	}

	public void setTrachCare11To7(String trachCare11To7) {
		this.trachCare11To7 = trachCare11To7;
	}

	public String getO2Saturation11To7() {
		return this.o2Saturation11To7;
	}

	public void setO2Saturation11To7(String o2Saturation11To7) {
		this.o2Saturation11To7 = o2Saturation11To7;
	}

	public String getTemp11To7() {
		return this.temp11To7;
	}

	public void setTemp11To7(String temp11To7) {
		this.temp11To7 = temp11To7;
	}

	public String getRespiration11To7() {
		return this.respiration11To7;
	}

	public void setRespiration11To7(String respiration11To7) {
		this.respiration11To7 = respiration11To7;
	}

	public String getPulse11To7() {
		return this.pulse11To7;
	}

	public void setPulse11To7(String pulse11To7) {
		this.pulse11To7 = pulse11To7;
	}

	public String getPulse3To11() {
		return this.pulse3To11;
	}

	public void setPulse3To11(String pulse3To11) {
		this.pulse3To11 = pulse3To11;
	}

	public String getRespiration3To11() {
		return this.respiration3To11;
	}

	public void setRespiration3To11(String respiration3To11) {
		this.respiration3To11 = respiration3To11;
	}

	public String getTemp3To11() {
		return this.temp3To11;
	}

	public void setTemp3To11(String temp3To11) {
		this.temp3To11 = temp3To11;
	}

	public String getO2Saturation3To11() {
		return this.o2Saturation3To11;
	}

	public void setO2Saturation3To11(String o2Saturation3To11) {
		this.o2Saturation3To11 = o2Saturation3To11;
	}

	public String getRespiration7To3() {
		return this.respiration7To3;
	}

	public void setRespiration7To3(String respiration7To3) {
		this.respiration7To3 = respiration7To3;
	}

	public String getTemp7To3() {
		return this.temp7To3;
	}

	public void setTemp7To3(String temp7To3) {
		this.temp7To3 = temp7To3;
	}

	public String getPulse7To3() {
		return this.pulse7To3;
	}

	public void setPulse7To3(String pulse7To3) {
		this.pulse7To3 = pulse7To3;
	}

	public String getBp11To7() {
		return this.bp11To7;
	}

	public void setBp11To7(String bp11To7) {
		this.bp11To7 = bp11To7;
	}

	public String getBp3To11() {
		return this.bp3To11;
	}

	public void setBp3To11(String bp3To11) {
		this.bp3To11 = bp3To11;
	}

	public String getBp7To3() {
		return this.bp7To3;
	}

	public void setBp7To3(String bp7To3) {
		this.bp7To3 = bp7To3;
	}

	public String getRoomNo() {
		return this.roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public Date getDateOfAssessment() {
		return dateOfAssessment;
	}

	public void setDateOfAssessment(Date dateOfAssessment) {
		this.dateOfAssessment = dateOfAssessment;
	}

	public String getResidentName() {
		return this.residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public boolean isBadMobilityLimited3To11() {
		return this.badMobilityLimited3To11;
	}

	public void setBadMobilityLimited3To11(boolean badMobilityLimited3To11) {
		this.badMobilityLimited3To11 = badMobilityLimited3To11;
	}

	public boolean isTransferIndepemdent11To7() {
		return this.transferIndepemdent11To7;
	}

	public void setTransferIndepemdent11To7(boolean transferIndepemdent11To7) {
		this.transferIndepemdent11To7 = transferIndepemdent11To7;
	}

	public boolean isTransferLimited11To7() {
		return this.transferLimited11To7;
	}

	public void setTransferLimited11To7(boolean transferLimited11To7) {
		this.transferLimited11To7 = transferLimited11To7;
	}

	public boolean isTransfer1Extensive11To7() {
		return this.transfer1Extensive11To7;
	}

	public void setTransfer1Extensive11To7(boolean transfer1Extensive11To7) {
		this.transfer1Extensive11To7 = transfer1Extensive11To7;
	}

	public boolean isTransfer2Extensive11To7() {
		return this.transfer2Extensive11To7;
	}

	public void setTransfer2Extensive11To7(boolean transfer2Extensive11To7) {
		this.transfer2Extensive11To7 = transfer2Extensive11To7;
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
}
