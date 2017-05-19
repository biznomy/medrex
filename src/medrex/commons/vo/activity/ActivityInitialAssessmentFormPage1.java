package medrex.commons.vo.activity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ActivityInitialAssessmentFormPage1")
public class ActivityInitialAssessmentFormPage1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2731634146075883894L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "allergies")
	private String allergies;
	@Column(name = "wantsToVote")
	private int wantsToVote;
	@Column(name = "veteran")
	private int veteran;
	@Column(name = "voteSpecify")
	private String voteSpecify;
	@Column(name = "pursuitP1")
	private boolean pursuitP1;
	@Column(name = "pursuitP2")
	private boolean pursuitP2;
	@Column(name = "pursuitP3")
	private boolean pursuitP3;
	@Column(name = "pursuitP4")
	private boolean pursuitP4;
	@Column(name = "pursuitP5")
	private boolean pursuitP5;
	@Column(name = "pursuitP6")
	private boolean pursuitP6;
	@Column(name = "pursuitP7")
	private boolean pursuitP7;
	@Column(name = "pursuitP8")
	private boolean pursuitP8;
	@Column(name = "pursuitP9")
	private boolean pursuitP9;
	@Column(name = "pursuitP10")
	private boolean pursuitP10;
	@Column(name = "pursuitP11")
	private boolean pursuitP11;
	@Column(name = "pursuitP12")
	private boolean pursuitP12;
	@Column(name = "pursuitP13")
	private boolean pursuitP13;
	@Column(name = "pursuitP14")
	private boolean pursuitP14;
	@Column(name = "pursuitP15")
	private boolean pursuitP15;
	@Column(name = "pursuitP16")
	private boolean pursuitP16;
	@Column(name = "pursuitP17")
	private boolean pursuitP17;
	@Column(name = "pursuitP18")
	private boolean pursuitP18;
	@Column(name = "pursuitP19")
	private boolean pursuitP19;
	@Column(name = "pursuitP20")
	private boolean pursuitP20;
	@Column(name = "pursuitP21")
	private boolean pursuitP21;
	@Column(name = "pursuitP22")
	private boolean pursuitP22;
	@Column(name = "pursuitP23")
	private boolean pursuitP23;
	@Column(name = "pursuitP24")
	private boolean pursuitP24;
	@Column(name = "pursuitC1")
	private boolean pursuitC1;
	@Column(name = "pursuitC2")
	private boolean pursuitC2;
	@Column(name = "pursuitC3")
	private boolean pursuitC3;
	@Column(name = "pursuitC4")
	private boolean pursuitC4;
	@Column(name = "pursuitC5")
	private boolean pursuitC5;
	@Column(name = "pursuitC6")
	private boolean pursuitC6;
	@Column(name = "pursuitC7")
	private boolean pursuitC7;
	@Column(name = "pursuitC8")
	private boolean pursuitC8;
	@Column(name = "pursuitC9")
	private boolean pursuitC9;
	@Column(name = "pursuitC10")
	private boolean pursuitC10;
	@Column(name = "pursuitC11")
	private boolean pursuitC11;
	@Column(name = "pursuitC12")
	private boolean pursuitC12;
	@Column(name = "pursuitC13")
	private boolean pursuitC13;
	@Column(name = "pursuitC14")
	private boolean pursuitC14;
	@Column(name = "pursuitC15")
	private boolean pursuitC15;
	@Column(name = "pursuitC16")
	private boolean pursuitC16;
	@Column(name = "pursuitC17")
	private boolean pursuitC17;
	@Column(name = "pursuitC18")
	private boolean pursuitC18;
	@Column(name = "pursuitC19")
	private boolean pursuitC19;
	@Column(name = "pursuitC20")
	private boolean pursuitC20;
	@Column(name = "pursuitC21")
	private boolean pursuitC21;
	@Column(name = "pursuitC22")
	private boolean pursuitC22;
	@Column(name = "pursuitC23")
	private boolean pursuitC23;
	@Column(name = "pursuitC24")
	private boolean pursuitC24;
	@Column(name = "prefers")
	private int prefers;
	@Column(name = "preferredActivity")
	private int preferredActivity;
	@Column(name = "wishesNewspaper")
	private int wishesNewspaper;
	@Column(name = "independentActivities")
	private String independentActivities;
	@Column(name = "candidate11")
	private int candidate11;
	@Column(name = "frequencyDuration")
	private String frequencyDuration;
	@Column(name = "naps")
	private int naps;
	@Column(name = "regularNaps")
	private int regularNaps;
	@Column(name = "visionRight")
	private int visionRight;
	@Column(name = "visionLeft")
	private int visionLeft;
	@Column(name = "hearingRight")
	private int hearingRight;
	@Column(name = "hearingLeft")
	private int hearingLeft;
	@Column(name = "extremitiesLUE")
	private int extremitiesLUE;
	@Column(name = "extremitiesRUE")
	private int extremitiesRUE;
	@Column(name = "extremitiesLLE")
	private int extremitiesLLE;
	@Column(name = "extremitiesRLE")
	private int extremitiesRLE;
	@Column(name = "ambulations")
	private int ambulations;
	@Column(name = "term")
	private int term;
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "admitDate")
	private Date admitDate;
	@Column(name = "diagnosis")
	private String diagnosis;
	@Column(name = "birthPlace")
	private String birthPlace;
	@Column(name = "birthDate")
	private Date birthDate;
	@Column(name = "maritalStatus")
	private String maritalStatus;
	@Column(name = "language")
	private String language;
	@Column(name = "religion")
	private String religion;
	@Column(name = "occupation")
	private String occupation;
	@Column(name = "responsibleParty")
	private String responsibleParty;
	@Column(name = "relationship")
	private String relationship;
	@Column(name = "attendiveService")
	private int attendiveService;

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

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public int getWantsToVote() {
		return wantsToVote;
	}

	public void setWantsToVote(int wantsToVote) {
		this.wantsToVote = wantsToVote;
	}

	public int getVeteran() {
		return veteran;
	}

	public void setVeteran(int veteran) {
		this.veteran = veteran;
	}

	public String getVoteSpecify() {
		return voteSpecify;
	}

	public void setVoteSpecify(String voteSpecify) {
		this.voteSpecify = voteSpecify;
	}

	public boolean isPursuitP1() {
		return pursuitP1;
	}

	public void setPursuitP1(boolean pursuitP1) {
		this.pursuitP1 = pursuitP1;
	}

	public boolean isPursuitP2() {
		return pursuitP2;
	}

	public void setPursuitP2(boolean pursuitP2) {
		this.pursuitP2 = pursuitP2;
	}

	public boolean isPursuitP3() {
		return pursuitP3;
	}

	public void setPursuitP3(boolean pursuitP3) {
		this.pursuitP3 = pursuitP3;
	}

	public boolean isPursuitP4() {
		return pursuitP4;
	}

	public void setPursuitP4(boolean pursuitP4) {
		this.pursuitP4 = pursuitP4;
	}

	public boolean isPursuitP5() {
		return pursuitP5;
	}

	public void setPursuitP5(boolean pursuitP5) {
		this.pursuitP5 = pursuitP5;
	}

	public boolean isPursuitP6() {
		return pursuitP6;
	}

	public void setPursuitP6(boolean pursuitP6) {
		this.pursuitP6 = pursuitP6;
	}

	public boolean isPursuitP7() {
		return pursuitP7;
	}

	public void setPursuitP7(boolean pursuitP7) {
		this.pursuitP7 = pursuitP7;
	}

	public boolean isPursuitP8() {
		return pursuitP8;
	}

	public void setPursuitP8(boolean pursuitP8) {
		this.pursuitP8 = pursuitP8;
	}

	public boolean isPursuitP9() {
		return pursuitP9;
	}

	public void setPursuitP9(boolean pursuitP9) {
		this.pursuitP9 = pursuitP9;
	}

	public boolean isPursuitP10() {
		return pursuitP10;
	}

	public void setPursuitP10(boolean pursuitP10) {
		this.pursuitP10 = pursuitP10;
	}

	public boolean isPursuitP11() {
		return pursuitP11;
	}

	public void setPursuitP11(boolean pursuitP11) {
		this.pursuitP11 = pursuitP11;
	}

	public boolean isPursuitP12() {
		return pursuitP12;
	}

	public void setPursuitP12(boolean pursuitP12) {
		this.pursuitP12 = pursuitP12;
	}

	public boolean isPursuitP13() {
		return pursuitP13;
	}

	public void setPursuitP13(boolean pursuitP13) {
		this.pursuitP13 = pursuitP13;
	}

	public boolean isPursuitP14() {
		return pursuitP14;
	}

	public void setPursuitP14(boolean pursuitP14) {
		this.pursuitP14 = pursuitP14;
	}

	public boolean isPursuitP15() {
		return pursuitP15;
	}

	public void setPursuitP15(boolean pursuitP15) {
		this.pursuitP15 = pursuitP15;
	}

	public boolean isPursuitP16() {
		return pursuitP16;
	}

	public void setPursuitP16(boolean pursuitP16) {
		this.pursuitP16 = pursuitP16;
	}

	public boolean isPursuitP17() {
		return pursuitP17;
	}

	public void setPursuitP17(boolean pursuitP17) {
		this.pursuitP17 = pursuitP17;
	}

	public boolean isPursuitP18() {
		return pursuitP18;
	}

	public void setPursuitP18(boolean pursuitP18) {
		this.pursuitP18 = pursuitP18;
	}

	public boolean isPursuitP19() {
		return pursuitP19;
	}

	public void setPursuitP19(boolean pursuitP19) {
		this.pursuitP19 = pursuitP19;
	}

	public boolean isPursuitP20() {
		return pursuitP20;
	}

	public void setPursuitP20(boolean pursuitP20) {
		this.pursuitP20 = pursuitP20;
	}

	public boolean isPursuitP21() {
		return pursuitP21;
	}

	public void setPursuitP21(boolean pursuitP21) {
		this.pursuitP21 = pursuitP21;
	}

	public boolean isPursuitP22() {
		return pursuitP22;
	}

	public void setPursuitP22(boolean pursuitP22) {
		this.pursuitP22 = pursuitP22;
	}

	public boolean isPursuitP23() {
		return pursuitP23;
	}

	public void setPursuitP23(boolean pursuitP23) {
		this.pursuitP23 = pursuitP23;
	}

	public boolean isPursuitP24() {
		return pursuitP24;
	}

	public void setPursuitP24(boolean pursuitP24) {
		this.pursuitP24 = pursuitP24;
	}

	public boolean isPursuitC1() {
		return pursuitC1;
	}

	public void setPursuitC1(boolean pursuitC1) {
		this.pursuitC1 = pursuitC1;
	}

	public boolean isPursuitC2() {
		return pursuitC2;
	}

	public void setPursuitC2(boolean pursuitC2) {
		this.pursuitC2 = pursuitC2;
	}

	public boolean isPursuitC3() {
		return pursuitC3;
	}

	public void setPursuitC3(boolean pursuitC3) {
		this.pursuitC3 = pursuitC3;
	}

	public boolean isPursuitC4() {
		return pursuitC4;
	}

	public void setPursuitC4(boolean pursuitC4) {
		this.pursuitC4 = pursuitC4;
	}

	public boolean isPursuitC5() {
		return pursuitC5;
	}

	public void setPursuitC5(boolean pursuitC5) {
		this.pursuitC5 = pursuitC5;
	}

	public boolean isPursuitC6() {
		return pursuitC6;
	}

	public void setPursuitC6(boolean pursuitC6) {
		this.pursuitC6 = pursuitC6;
	}

	public boolean isPursuitC7() {
		return pursuitC7;
	}

	public void setPursuitC7(boolean pursuitC7) {
		this.pursuitC7 = pursuitC7;
	}

	public boolean isPursuitC8() {
		return pursuitC8;
	}

	public void setPursuitC8(boolean pursuitC8) {
		this.pursuitC8 = pursuitC8;
	}

	public boolean isPursuitC9() {
		return pursuitC9;
	}

	public void setPursuitC9(boolean pursuitC9) {
		this.pursuitC9 = pursuitC9;
	}

	public boolean isPursuitC10() {
		return pursuitC10;
	}

	public void setPursuitC10(boolean pursuitC10) {
		this.pursuitC10 = pursuitC10;
	}

	public boolean isPursuitC11() {
		return pursuitC11;
	}

	public void setPursuitC11(boolean pursuitC11) {
		this.pursuitC11 = pursuitC11;
	}

	public boolean isPursuitC12() {
		return pursuitC12;
	}

	public void setPursuitC12(boolean pursuitC12) {
		this.pursuitC12 = pursuitC12;
	}

	public boolean isPursuitC13() {
		return pursuitC13;
	}

	public void setPursuitC13(boolean pursuitC13) {
		this.pursuitC13 = pursuitC13;
	}

	public boolean isPursuitC14() {
		return pursuitC14;
	}

	public void setPursuitC14(boolean pursuitC14) {
		this.pursuitC14 = pursuitC14;
	}

	public boolean isPursuitC15() {
		return pursuitC15;
	}

	public void setPursuitC15(boolean pursuitC15) {
		this.pursuitC15 = pursuitC15;
	}

	public boolean isPursuitC16() {
		return pursuitC16;
	}

	public void setPursuitC16(boolean pursuitC16) {
		this.pursuitC16 = pursuitC16;
	}

	public boolean isPursuitC17() {
		return pursuitC17;
	}

	public void setPursuitC17(boolean pursuitC17) {
		this.pursuitC17 = pursuitC17;
	}

	public boolean isPursuitC18() {
		return pursuitC18;
	}

	public void setPursuitC18(boolean pursuitC18) {
		this.pursuitC18 = pursuitC18;
	}

	public boolean isPursuitC19() {
		return pursuitC19;
	}

	public void setPursuitC19(boolean pursuitC19) {
		this.pursuitC19 = pursuitC19;
	}

	public boolean isPursuitC20() {
		return pursuitC20;
	}

	public void setPursuitC20(boolean pursuitC20) {
		this.pursuitC20 = pursuitC20;
	}

	public boolean isPursuitC21() {
		return pursuitC21;
	}

	public void setPursuitC21(boolean pursuitC21) {
		this.pursuitC21 = pursuitC21;
	}

	public boolean isPursuitC22() {
		return pursuitC22;
	}

	public void setPursuitC22(boolean pursuitC22) {
		this.pursuitC22 = pursuitC22;
	}

	public boolean isPursuitC23() {
		return pursuitC23;
	}

	public void setPursuitC23(boolean pursuitC23) {
		this.pursuitC23 = pursuitC23;
	}

	public boolean isPursuitC24() {
		return pursuitC24;
	}

	public void setPursuitC24(boolean pursuitC24) {
		this.pursuitC24 = pursuitC24;
	}

	public int getPrefers() {
		return prefers;
	}

	public void setPrefers(int prefers) {
		this.prefers = prefers;
	}

	public int getPreferredActivity() {
		return preferredActivity;
	}

	public void setPreferredActivity(int preferredActivity) {
		this.preferredActivity = preferredActivity;
	}

	public int getWishesNewspaper() {
		return wishesNewspaper;
	}

	public void setWishesNewspaper(int wishesNewspaper) {
		this.wishesNewspaper = wishesNewspaper;
	}

	public String getIndependentActivities() {
		return independentActivities;
	}

	public void setIndependentActivities(String independentActivities) {
		this.independentActivities = independentActivities;
	}

	public int getCandidate11() {
		return candidate11;
	}

	public void setCandidate11(int candidate11) {
		this.candidate11 = candidate11;
	}

	public String getFrequencyDuration() {
		return frequencyDuration;
	}

	public void setFrequencyDuration(String frequencyDuration) {
		this.frequencyDuration = frequencyDuration;
	}

	public int getNaps() {
		return naps;
	}

	public void setNaps(int naps) {
		this.naps = naps;
	}

	public int getRegularNaps() {
		return regularNaps;
	}

	public void setRegularNaps(int regularNaps) {
		this.regularNaps = regularNaps;
	}

	public int getVisionRight() {
		return visionRight;
	}

	public void setVisionRight(int visionRight) {
		this.visionRight = visionRight;
	}

	public int getVisionLeft() {
		return visionLeft;
	}

	public void setVisionLeft(int visionLeft) {
		this.visionLeft = visionLeft;
	}

	public int getHearingRight() {
		return hearingRight;
	}

	public void setHearingRight(int hearingRight) {
		this.hearingRight = hearingRight;
	}

	public int getHearingLeft() {
		return hearingLeft;
	}

	public void setHearingLeft(int hearingLeft) {
		this.hearingLeft = hearingLeft;
	}

	public int getExtremitiesLUE() {
		return extremitiesLUE;
	}

	public void setExtremitiesLUE(int extremitiesLUE) {
		this.extremitiesLUE = extremitiesLUE;
	}

	public int getExtremitiesRUE() {
		return extremitiesRUE;
	}

	public void setExtremitiesRUE(int extremitiesRUE) {
		this.extremitiesRUE = extremitiesRUE;
	}

	public int getExtremitiesLLE() {
		return extremitiesLLE;
	}

	public void setExtremitiesLLE(int extremitiesLLE) {
		this.extremitiesLLE = extremitiesLLE;
	}

	public int getExtremitiesRLE() {
		return extremitiesRLE;
	}

	public void setExtremitiesRLE(int extremitiesRLE) {
		this.extremitiesRLE = extremitiesRLE;
	}

	public int getAmbulations() {
		return ambulations;
	}

	public void setAmbulations(int ambulations) {
		this.ambulations = ambulations;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public Date getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(Date admitDate) {
		this.admitDate = admitDate;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getResponsibleParty() {
		return responsibleParty;
	}

	public void setResponsibleParty(String responsibleParty) {
		this.responsibleParty = responsibleParty;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public int getAttendiveService() {
		return attendiveService;
	}

	public void setAttendiveService(int attendiveService) {
		this.attendiveService = attendiveService;
	}
}
