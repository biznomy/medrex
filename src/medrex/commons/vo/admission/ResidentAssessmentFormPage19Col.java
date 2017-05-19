package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage19Col")
public class ResidentAssessmentFormPage19Col implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4227591067209490836L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "colSerial")
	private int colSerial;

	@Column(name = "formSerial")
	private int formSerial;

	@Column(name = "dateOfAssessment")
	private Date dateOfAssessment;

	@Column(name = "timeOfAssessment")
	private String timeOfAssessment;

	@Column(name = "bloodPressure")
	private String bloodPressure;

	@Column(name = "temprature")
	private String temprature;

	@Column(name = "pulse")
	private String pulse;

	@Column(name = "respiration")
	private String respiration;

	@Column(name = "normal")
	private String normal;

	@Column(name = "shallow")
	private String shallow;

	@Column(name = "irregular")
	private String irregular;

	@Column(name = "rPupilSize")
	private String rPupilSize;

	@Column(name = "rPupilReact")
	private String rPupilReact;

	@Column(name = "lPupilSize")
	private String lPupilSize;

	@Column(name = "lPupilReact")
	private String lPupilReact;

	@Column(name = "opensSpontaneously")
	private String opensSpontaneously;

	@Column(name = "opensToSpeech")
	private String opensToSpeech;

	@Column(name = "opensToPain")
	private String opensToPain;

	@Column(name = "doesNotOpen")
	private String doesNotOpen;

	@Column(name = "alert")
	private String alert;

	@Column(name = "drowsy")
	private String drowsy;

	@Column(name = "stuporous")
	private String stuporous;

	@Column(name = "comatose")
	private String comatose;

	@Column(name = "speechOriented")
	private String speechOriented;

	@Column(name = "confusedConversation")
	private String confusedConversation;

	@Column(name = "inappropriateWords")
	private String inappropriateWords;

	@Column(name = "incomprehensibleSpeech")
	private String incomprehensibleSpeech;

	@Column(name = "noSpeech")
	private String noSpeech;

	@Column(name = "ltUpperExtremity")
	private String ltUpperExtremity;

	@Column(name = "ltLowerExtremity")
	private String ltLowerExtremity;

	@Column(name = "rtUpperExtremity")
	private String rtUpperExtremity;

	@Column(name = "rtLowerExtremity")
	private String rtLowerExtremity;

	@Column(name = "nurseInitial")
	private String nurseInitial;

	public int getColSerial() {
		return colSerial;
	}

	public void setColSerial(int colSerial) {
		this.colSerial = colSerial;
	}

	public int getFormSerial() {
		return formSerial;
	}

	public void setFormSerial(int formSerial) {
		this.formSerial = formSerial;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Date getDateOfAssessment() {
		return dateOfAssessment;
	}

	public void setDateOfAssessment(Date dateOfAssessment) {
		this.dateOfAssessment = dateOfAssessment;
	}

	public String getTimeOfAssessment() {
		return timeOfAssessment;
	}

	public void setTimeOfAssessment(String timeOfAssessment) {
		this.timeOfAssessment = timeOfAssessment;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getTemprature() {
		return temprature;
	}

	public void setTemprature(String temprature) {
		this.temprature = temprature;
	}

	public String getPulse() {
		return pulse;
	}

	public void setPulse(String pulse) {
		this.pulse = pulse;
	}

	public String getRespiration() {
		return respiration;
	}

	public void setRespiration(String respiration) {
		this.respiration = respiration;
	}

	public String getNormal() {
		return normal;
	}

	public void setNormal(String normal) {
		this.normal = normal;
	}

	public String getShallow() {
		return shallow;
	}

	public void setShallow(String shallow) {
		this.shallow = shallow;
	}

	public String getIrregular() {
		return irregular;
	}

	public void setIrregular(String irregular) {
		this.irregular = irregular;
	}

	public String getRPupilSize() {
		return rPupilSize;
	}

	public void setRPupilSize(String pupilSize) {
		rPupilSize = pupilSize;
	}

	public String getRPupilReact() {
		return rPupilReact;
	}

	public void setRPupilReact(String pupilReact) {
		rPupilReact = pupilReact;
	}

	public String getLPupilSize() {
		return lPupilSize;
	}

	public void setLPupilSize(String pupilSize) {
		lPupilSize = pupilSize;
	}

	public String getLPupilReact() {
		return lPupilReact;
	}

	public void setLPupilReact(String pupilReact) {
		lPupilReact = pupilReact;
	}

	public String getOpensSpontaneously() {
		return opensSpontaneously;
	}

	public void setOpensSpontaneously(String opensSpontaneously) {
		this.opensSpontaneously = opensSpontaneously;
	}

	public String getOpensToSpeech() {
		return opensToSpeech;
	}

	public void setOpensToSpeech(String opensToSpeech) {
		this.opensToSpeech = opensToSpeech;
	}

	public String getOpensToPain() {
		return opensToPain;
	}

	public void setOpensToPain(String opensToPain) {
		this.opensToPain = opensToPain;
	}

	public String getDoesNotOpen() {
		return doesNotOpen;
	}

	public void setDoesNotOpen(String doesNotOpen) {
		this.doesNotOpen = doesNotOpen;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public String getDrowsy() {
		return drowsy;
	}

	public void setDrowsy(String drowsy) {
		this.drowsy = drowsy;
	}

	public String getStuporous() {
		return stuporous;
	}

	public void setStuporous(String stuporous) {
		this.stuporous = stuporous;
	}

	public String getComatose() {
		return comatose;
	}

	public void setComatose(String comatose) {
		this.comatose = comatose;
	}

	public String getSpeechOriented() {
		return speechOriented;
	}

	public void setSpeechOriented(String speechOriented) {
		this.speechOriented = speechOriented;
	}

	public String getConfusedConversation() {
		return confusedConversation;
	}

	public void setConfusedConversation(String confusedConversation) {
		this.confusedConversation = confusedConversation;
	}

	public String getInappropriateWords() {
		return inappropriateWords;
	}

	public void setInappropriateWords(String inappropriateWords) {
		this.inappropriateWords = inappropriateWords;
	}

	public String getIncomprehensibleSpeech() {
		return incomprehensibleSpeech;
	}

	public void setIncomprehensibleSpeech(String incomprehensibleSpeech) {
		this.incomprehensibleSpeech = incomprehensibleSpeech;
	}

	public String getNoSpeech() {
		return noSpeech;
	}

	public void setNoSpeech(String noSpeech) {
		this.noSpeech = noSpeech;
	}

	public String getLtUpperExtremity() {
		return ltUpperExtremity;
	}

	public void setLtUpperExtremity(String ltUpperExtremity) {
		this.ltUpperExtremity = ltUpperExtremity;
	}

	public String getLtLowerExtremity() {
		return ltLowerExtremity;
	}

	public void setLtLowerExtremity(String ltLowerExtremity) {
		this.ltLowerExtremity = ltLowerExtremity;
	}

	public String getRtUpperExtremity() {
		return rtUpperExtremity;
	}

	public void setRtUpperExtremity(String rtUpperExtremity) {
		this.rtUpperExtremity = rtUpperExtremity;
	}

	public String getRtLowerExtremity() {
		return rtLowerExtremity;
	}

	public void setRtLowerExtremity(String rtLowerExtremity) {
		this.rtLowerExtremity = rtLowerExtremity;
	}

	public String getNurseInitial() {
		return nurseInitial;
	}

	public void setNurseInitial(String nurseInitial) {
		this.nurseInitial = nurseInitial;
	}
}
