package medrex.commons.vo.physicianOrders;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhysicianPlazaHealthCare")
public class PhysicianPlazaHealthCare implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2796585869468501408L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "therapistSignature")
	private String therapistSignature;
	@Column(name = "mdSignature")
	private String mdSignature;
	@Column(name = "nurseSignature")
	private String nurseSignature;
	@Column(name = "stOther")
	private String stOther;
	@Column(name = "stDietTo")
	private String stDietTo;
	@Column(name = "stOtherCb")
	private boolean stOtherCb;
	@Column(name = "stSpeech")
	private boolean stSpeech;
	@Column(name = "stVocal")
	private boolean stVocal;
	@Column(name = "stWHExercises")
	private boolean stWHExercises;
	@Column(name = "stCategorization")
	private boolean stCategorization;
	@Column(name = "stYNExercises")
	private boolean stYNExercises;
	@Column(name = "stDirection")
	private boolean stDirection;
	@Column(name = "stOrientation")
	private boolean stOrientation;
	@Column(name = "stAutomatic")
	private boolean stAutomatic;
	@Column(name = "stWord")
	private boolean stWord;
	@Column(name = "stArticulation")
	private boolean stArticulation;
	@Column(name = "stLaryngeal")
	private boolean stLaryngeal;
	@Column(name = "stCompensatory")
	private boolean stCompensatory;
	@Column(name = "stOm")
	private boolean stOm;
	@Column(name = "stDietCb")
	private boolean stDietCb;
	@Column(name = "otPlanning")
	private boolean otPlanning;
	@Column(name = "otPtStaff")
	private boolean otPtStaff;
	@Column(name = "otContracture")
	private boolean otContracture;
	@Column(name = "otWcPositioning")
	private boolean otWcPositioning;
	@Column(name = "otModalityCb")
	private boolean otModalityCb;
	@Column(name = "otAdls")
	private boolean otAdls;
	@Column(name = "otTransfer")
	private boolean otTransfer;
	@Column(name = "otBalance")
	private boolean otBalance;
	@Column(name = "otActivities")
	private boolean otActivities;
	@Column(name = "otTherapeuticActivities")
	private boolean otTherapeuticActivities;
	@Column(name = "otTherapeuticExercise")
	private boolean otTherapeuticExercise;
	@Column(name = "otModality")
	private String otModality;
	@Column(name = "otOther")
	private String otOther;
	@Column(name = "ptModality")
	private String ptModality;
	@Column(name = "ptOther")
	private String ptOther;
	@Column(name = "ptModalityCb")
	private boolean ptModalityCb;
	@Column(name = "ptOtherCb")
	private boolean ptOtherCb;
	@Column(name = "ptPlanning")
	private boolean ptPlanning;
	@Column(name = "ptPtStaff")
	private boolean ptPtStaff;
	@Column(name = "ptStair")
	private boolean ptStair;
	@Column(name = "ptGaint")
	private boolean ptGaint;
	@Column(name = "ptTherapeuticActivities")
	private boolean ptTherapeuticActivities;
	@Column(name = "ptCoordination")
	private boolean ptCoordination;
	@Column(name = "ptBalance")
	private boolean ptBalance;
	@Column(name = "ptTransfer")
	private boolean ptTransfer;
	@Column(name = "ptTherapeuticExercise")
	private boolean ptTherapeuticExercise;
	@Column(name = "stDate")
	private Date stDate;
	@Column(name = "otDate")
	private Date otDate;
	@Column(name = "ptDate")
	private Date ptDate;
	@Column(name = "stRecert")
	private String stRecert;
	@Column(name = "otRecert")
	private String otRecert;
	@Column(name = "ptRecert")
	private String ptRecert;
	@Column(name = "dateField")
	private Date dateField;
	@Column(name = "room")
	private String room;
	@Column(name = "residentsName")
	private String residentsName;

	public String getTherapistSignature() {
		return this.therapistSignature;
	}

	public void setTherapistSignature(String therapistSignature) {
		this.therapistSignature = therapistSignature;
	}

	public String getMdSignature() {
		return this.mdSignature;
	}

	public void setMdSignature(String mdSignature) {
		this.mdSignature = mdSignature;
	}

	public String getNurseSignature() {
		return this.nurseSignature;
	}

	public void setNurseSignature(String nurseSignature) {
		this.nurseSignature = nurseSignature;
	}

	public String getStOther() {
		return this.stOther;
	}

	public void setStOther(String stOther) {
		this.stOther = stOther;
	}

	public String getStDietTo() {
		return this.stDietTo;
	}

	public void setStDietTo(String stDietTo) {
		this.stDietTo = stDietTo;
	}

	public boolean isStOtherCb() {
		return this.stOtherCb;
	}

	public void setStOtherCb(boolean stOtherCb) {
		this.stOtherCb = stOtherCb;
	}

	public boolean isStSpeech() {
		return this.stSpeech;
	}

	public void setStSpeech(boolean stSpeech) {
		this.stSpeech = stSpeech;
	}

	public boolean isStVocal() {
		return this.stVocal;
	}

	public void setStVocal(boolean stVocal) {
		this.stVocal = stVocal;
	}

	public boolean isStWHExercises() {
		return this.stWHExercises;
	}

	public void setStWHExercises(boolean stWHExercises) {
		this.stWHExercises = stWHExercises;
	}

	public boolean isStCategorization() {
		return this.stCategorization;
	}

	public void setStCategorization(boolean stCategorization) {
		this.stCategorization = stCategorization;
	}

	public boolean isStYNExercises() {
		return this.stYNExercises;
	}

	public void setStYNExercises(boolean stYNExercises) {
		this.stYNExercises = stYNExercises;
	}

	public boolean isStDirection() {
		return this.stDirection;
	}

	public void setStDirection(boolean stDirection) {
		this.stDirection = stDirection;
	}

	public boolean isStOrientation() {
		return this.stOrientation;
	}

	public void setStOrientation(boolean stOrientation) {
		this.stOrientation = stOrientation;
	}

	public boolean isStAutomatic() {
		return this.stAutomatic;
	}

	public void setStAutomatic(boolean stAutomatic) {
		this.stAutomatic = stAutomatic;
	}

	public boolean isStWord() {
		return this.stWord;
	}

	public void setStWord(boolean stWord) {
		this.stWord = stWord;
	}

	public boolean isStArticulation() {
		return this.stArticulation;
	}

	public void setStArticulation(boolean stArticulation) {
		this.stArticulation = stArticulation;
	}

	public boolean isStLaryngeal() {
		return this.stLaryngeal;
	}

	public void setStLaryngeal(boolean stLaryngeal) {
		this.stLaryngeal = stLaryngeal;
	}

	public boolean isStCompensatory() {
		return this.stCompensatory;
	}

	public void setStCompensatory(boolean stCompensatory) {
		this.stCompensatory = stCompensatory;
	}

	public boolean isStOm() {
		return this.stOm;
	}

	public void setStOm(boolean stOm) {
		this.stOm = stOm;
	}

	public boolean isStDietCb() {
		return this.stDietCb;
	}

	public void setStDietCb(boolean stDietCb) {
		this.stDietCb = stDietCb;
	}

	public boolean isOtPlanning() {
		return this.otPlanning;
	}

	public void setOtPlanning(boolean otPlanning) {
		this.otPlanning = otPlanning;
	}

	public boolean isOtPtStaff() {
		return this.otPtStaff;
	}

	public void setOtPtStaff(boolean otPtStaff) {
		this.otPtStaff = otPtStaff;
	}

	public boolean isOtContracture() {
		return this.otContracture;
	}

	public void setOtContracture(boolean otContracture) {
		this.otContracture = otContracture;
	}

	public boolean isOtWcPositioning() {
		return this.otWcPositioning;
	}

	public void setOtWcPositioning(boolean otWcPositioning) {
		this.otWcPositioning = otWcPositioning;
	}

	public boolean isOtModalityCb() {
		return this.otModalityCb;
	}

	public void setOtModalityCb(boolean otModalityCb) {
		this.otModalityCb = otModalityCb;
	}

	public boolean isOtAdls() {
		return this.otAdls;
	}

	public void setOtAdls(boolean otAdls) {
		this.otAdls = otAdls;
	}

	public boolean isOtTransfer() {
		return this.otTransfer;
	}

	public void setOtTransfer(boolean otTransfer) {
		this.otTransfer = otTransfer;
	}

	public boolean isOtBalance() {
		return this.otBalance;
	}

	public void setOtBalance(boolean otBalance) {
		this.otBalance = otBalance;
	}

	public boolean isOtActivities() {
		return this.otActivities;
	}

	public void setOtActivities(boolean otActivities) {
		this.otActivities = otActivities;
	}

	public boolean isOtTherapeuticActivities() {
		return this.otTherapeuticActivities;
	}

	public void setOtTherapeuticActivities(boolean otTherapeuticActivities) {
		this.otTherapeuticActivities = otTherapeuticActivities;
	}

	public boolean isOtTherapeuticExercise() {
		return this.otTherapeuticExercise;
	}

	public void setOtTherapeuticExercise(boolean otTherapeuticExercise) {
		this.otTherapeuticExercise = otTherapeuticExercise;
	}

	public String getOtModality() {
		return this.otModality;
	}

	public void setOtModality(String otModality) {
		this.otModality = otModality;
	}

	public String getOtOther() {
		return this.otOther;
	}

	public void setOtOther(String otOther) {
		this.otOther = otOther;
	}

	public String getPtModality() {
		return this.ptModality;
	}

	public void setPtModality(String ptModality) {
		this.ptModality = ptModality;
	}

	public String getPtOther() {
		return this.ptOther;
	}

	public void setPtOther(String ptOther) {
		this.ptOther = ptOther;
	}

	public boolean isPtModalityCb() {
		return this.ptModalityCb;
	}

	public void setPtModalityCb(boolean ptModalityCb) {
		this.ptModalityCb = ptModalityCb;
	}

	public boolean isPtOtherCb() {
		return this.ptOtherCb;
	}

	public void setPtOtherCb(boolean ptOtherCb) {
		this.ptOtherCb = ptOtherCb;
	}

	public boolean isPtPlanning() {
		return this.ptPlanning;
	}

	public void setPtPlanning(boolean ptPlanning) {
		this.ptPlanning = ptPlanning;
	}

	public boolean isPtPtStaff() {
		return this.ptPtStaff;
	}

	public void setPtPtStaff(boolean ptPtStaff) {
		this.ptPtStaff = ptPtStaff;
	}

	public boolean isPtStair() {
		return this.ptStair;
	}

	public void setPtStair(boolean ptStair) {
		this.ptStair = ptStair;
	}

	public boolean isPtGaint() {
		return this.ptGaint;
	}

	public void setPtGaint(boolean ptGaint) {
		this.ptGaint = ptGaint;
	}

	public boolean isPtTherapeuticActivities() {
		return this.ptTherapeuticActivities;
	}

	public void setPtTherapeuticActivities(boolean ptTherapeuticActivities) {
		this.ptTherapeuticActivities = ptTherapeuticActivities;
	}

	public boolean isPtCoordination() {
		return this.ptCoordination;
	}

	public void setPtCoordination(boolean ptCoordination) {
		this.ptCoordination = ptCoordination;
	}

	public boolean isPtBalance() {
		return this.ptBalance;
	}

	public void setPtBalance(boolean ptBalance) {
		this.ptBalance = ptBalance;
	}

	public boolean isPtTransfer() {
		return this.ptTransfer;
	}

	public void setPtTransfer(boolean ptTransfer) {
		this.ptTransfer = ptTransfer;
	}

	public boolean isPtTherapeuticExercise() {
		return this.ptTherapeuticExercise;
	}

	public void setPtTherapeuticExercise(boolean ptTherapeuticExercise) {
		this.ptTherapeuticExercise = ptTherapeuticExercise;
	}

	public Date getStDate() {
		return this.stDate;
	}

	public void setStDate(Date stDate) {
		this.stDate = stDate;
	}

	public Date getOtDate() {
		return this.otDate;
	}

	public void setOtDate(Date otDate) {
		this.otDate = otDate;
	}

	public Date getPtDate() {
		return this.ptDate;
	}

	public void setPtDate(Date ptDate) {
		this.ptDate = ptDate;
	}

	public String getStRecert() {
		return this.stRecert;
	}

	public void setStRecert(String stRecert) {
		this.stRecert = stRecert;
	}

	public String getOtRecert() {
		return this.otRecert;
	}

	public void setOtRecert(String otRecert) {
		this.otRecert = otRecert;
	}

	public String getPtRecert() {
		return this.ptRecert;
	}

	public void setPtRecert(String ptRecert) {
		this.ptRecert = ptRecert;
	}

	public Date getDateField() {
		return this.dateField;
	}

	public void setDateField(Date dateField) {
		this.dateField = dateField;
	}

	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getResidentsName() {
		return this.residentsName;
	}

	public void setResidentsName(String residentsName) {
		this.residentsName = residentsName;
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
