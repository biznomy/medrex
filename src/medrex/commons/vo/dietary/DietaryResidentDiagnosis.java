package medrex.commons.vo.dietary;

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
import medrex.commons.vo.richTextField.RichTextField;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "DietaryResidentDiagnosis")
public class DietaryResidentDiagnosis implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5768761437441022291L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "residentId")
	private int residentId;
	// @Column(name = "appetite1")
	// private String appetite1;
	// @Column(name = "appetite5")
	// private String appetite5;
	// @Column(name = "appetite4")
	// private String appetite4;
	// @Column(name = "appetite3")
	// private String appetite3;
	// @Column(name = "appetite2")
	// private String appetite2;

	@Column(name = "appetite")
	private int appetite;

	@Column(name = "approaches7")
	private String approaches7;
	@Column(name = "approaches6")
	private String approaches6;
	@Column(name = "approaches5")
	private String approaches5;
	@Column(name = "approaches4")
	private String approaches4;
	@Column(name = "approaches3")
	private String approaches3;
	@Column(name = "approaches2")
	private String approaches2;
	@Column(name = "approaches1")
	private String approaches1;
	@Column(name = "problems7")
	private String problems7;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "problemApproches")
	private Notes problemApproches;

	@Column(name = "normal")
	private int normal;
	@Column(name = "adaptiveEquipment")
	private String adaptiveEquipment;

	@Column(name = "problems6")
	private String problems6;
	@Column(name = "problems5")
	private String problems5;
	@Column(name = "problems4")
	private String problems4;
	@Column(name = "problems3")
	private String problems3;
	@Column(name = "problems2")
	private String problems2;
	@Column(name = "problems1")
	private String problems1;
	@Column(name = "dateField2")
	private Date dateField2;
	@Column(name = "dieticianSign")
	private String dieticianSign;
	@Column(name = "dieticianComment")
	private String dieticianComment;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "goal")
	private Notes goal;

	@Column(name = "fluidField")
	private String fluidField;
	@Column(name = "protien")
	private String protien;
	@Column(name = "estRequirement")
	private String estRequirement;
	@Column(name = "bee")
	private String bee;
	@Column(name = "edemaField")
	private String edemaField;
	@Column(name = "constipation")
	private String constipation;
	@Column(name = "openAreas")
	private String openAreas;
	@Column(name = "estDbw")
	private String estDbw;
	@Column(name = "ubw")
	private String ubw;
	@Column(name = "weight")
	private String weight;
	@Column(name = "height")
	private String height;
	@Column(name = "rroom")
	private String rroom;
	@Column(name = "dinningRoom")
	private String dinningRoom;
	@Column(name = "loungRoom")
	private String loungRoom;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "foodAllergy")
	private RichTextField foodAllergy;

	@Column(name = "foodDislikes")
	private String foodDislikes;
	@Column(name = "foodLikes")
	private String foodLikes;
	@Column(name = "feeder")
	private String feeder;
	@Column(name = "needsHelp")
	private String needsHelp;
	@Column(name = "residentFeeds")
	private String residentFeeds;
	@Column(name = "swallowing")
	private String swallowing;
	@Column(name = "chewingAbility")
	private String chewingAbility;
	@Column(name = "dentureOwn")
	private String dentureOwn;
	@Column(name = "dentureEd")
	private String dentureEd;
	@Column(name = "dentureBottom")
	private String dentureBottom;
	@Column(name = "dentureTop")
	private String dentureTop;
	@Column(name = "fluid")
	private String fluid;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "mentalStatus")
	private RichTextField mentalStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "physicalDis")
	private RichTextField physicalDis;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "cultural")
	private RichTextField cultural;

	@Column(name = "medication")
	private String medication;
	@Column(name = "diagnosis")
	private String diagnosis;
	@Column(name = "age")
	private String age;
	@Column(name = "roomNo")
	private String roomNo;
	@Column(name = "labData")
	private String labData;

	@OneToOne(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "diet")
	private RichTextField diet;

	@Column(name = "residentName")
	private String residentName;
	@Column(name = "physicianName")
	private String physicianName;
	@Column(name = "dateField1")
	private Date dateField1;

	public RichTextField getFoodAllergy() {
		return foodAllergy;
	}

	public void setFoodAllergy(RichTextField foodAllergy) {
		this.foodAllergy = foodAllergy;
	}

	public RichTextField getMentalStatus() {
		return mentalStatus;
	}

	public void setMentalStatus(RichTextField mentalStatus) {
		this.mentalStatus = mentalStatus;
	}

	public RichTextField getPhysicalDis() {
		return physicalDis;
	}

	public void setPhysicalDis(RichTextField physicalDis) {
		this.physicalDis = physicalDis;
	}

	public RichTextField getCultural() {
		return cultural;
	}

	public void setCultural(RichTextField cultural) {
		this.cultural = cultural;
	}

	public RichTextField getDiet() {
		return diet;
	}

	public void setDiet(RichTextField diet) {
		this.diet = diet;
	}

	public Notes getGoal() {
		return goal;
	}

	public void setGoal(Notes goal) {
		this.goal = goal;
	}

	public int getAppetite() {
		return appetite;
	}

	public void setAppetite(int appetite) {
		this.appetite = appetite;
	}

	/*
	 * public String getAppetite1() { return this.appetite1; }
	 * 
	 * public void setAppetite1(String appetite1) { this.appetite1 = appetite1;
	 * }
	 * 
	 * public String getAppetite5() { return this.appetite5; }
	 * 
	 * public void setAppetite5(String appetite5) { this.appetite5 = appetite5;
	 * }
	 * 
	 * public String getAppetite4() { return this.appetite4; }
	 * 
	 * public void setAppetite4(String appetite4) { this.appetite4 = appetite4;
	 * }
	 * 
	 * public String getAppetite3() { return this.appetite3; }
	 * 
	 * public void setAppetite3(String appetite3) { this.appetite3 = appetite3;
	 * }
	 * 
	 * public String getAppetite2() { return this.appetite2; }
	 * 
	 * public void setAppetite2(String appetite2) { this.appetite2 = appetite2;
	 * }
	 */

	public String getApproaches7() {
		return this.approaches7;
	}

	public void setApproaches7(String approaches7) {
		this.approaches7 = approaches7;
	}

	public String getApproaches6() {
		return this.approaches6;
	}

	public void setApproaches6(String approaches6) {
		this.approaches6 = approaches6;
	}

	public String getApproaches5() {
		return this.approaches5;
	}

	public void setApproaches5(String approaches5) {
		this.approaches5 = approaches5;
	}

	public String getApproaches4() {
		return this.approaches4;
	}

	public void setApproaches4(String approaches4) {
		this.approaches4 = approaches4;
	}

	public String getApproaches3() {
		return this.approaches3;
	}

	public void setApproaches3(String approaches3) {
		this.approaches3 = approaches3;
	}

	public String getApproaches2() {
		return this.approaches2;
	}

	public void setApproaches2(String approaches2) {
		this.approaches2 = approaches2;
	}

	public String getApproaches1() {
		return this.approaches1;
	}

	public void setApproaches1(String approaches1) {
		this.approaches1 = approaches1;
	}

	public String getProblems7() {
		return this.problems7;
	}

	public void setProblems7(String problems7) {
		this.problems7 = problems7;
	}

	public String getProblems6() {
		return this.problems6;
	}

	public void setProblems6(String problems6) {
		this.problems6 = problems6;
	}

	public String getProblems5() {
		return this.problems5;
	}

	public void setProblems5(String problems5) {
		this.problems5 = problems5;
	}

	public String getProblems4() {
		return this.problems4;
	}

	public void setProblems4(String problems4) {
		this.problems4 = problems4;
	}

	public String getProblems3() {
		return this.problems3;
	}

	public void setProblems3(String problems3) {
		this.problems3 = problems3;
	}

	public String getProblems2() {
		return this.problems2;
	}

	public void setProblems2(String problems2) {
		this.problems2 = problems2;
	}

	public String getProblems1() {
		return this.problems1;
	}

	public void setProblems1(String problems1) {
		this.problems1 = problems1;
	}

	public Date getDateField2() {
		return this.dateField2;
	}

	public void setDateField2(Date dateField2) {
		this.dateField2 = dateField2;
	}

	public String getDieticianSign() {
		return this.dieticianSign;
	}

	public void setDieticianSign(String dieticianSign) {
		this.dieticianSign = dieticianSign;
	}

	public String getDieticianComment() {
		return this.dieticianComment;
	}

	public void setDieticianComment(String dieticianComment) {
		this.dieticianComment = dieticianComment;
	}

	public String getFluidField() {
		return this.fluidField;
	}

	public void setFluidField(String fluidField) {
		this.fluidField = fluidField;
	}

	public String getProtien() {
		return this.protien;
	}

	public void setProtien(String protien) {
		this.protien = protien;
	}

	public String getEstRequirement() {
		return this.estRequirement;
	}

	public void setEstRequirement(String estRequirement) {
		this.estRequirement = estRequirement;
	}

	public String getBee() {
		return this.bee;
	}

	public void setBee(String bee) {
		this.bee = bee;
	}

	public String getEdemaField() {
		return this.edemaField;
	}

	public void setEdemaField(String edemaField) {
		this.edemaField = edemaField;
	}

	public String getConstipation() {
		return this.constipation;
	}

	public void setConstipation(String constipation) {
		this.constipation = constipation;
	}

	public String getOpenAreas() {
		return this.openAreas;
	}

	public void setOpenAreas(String openAreas) {
		this.openAreas = openAreas;
	}

	public String getEstDbw() {
		return this.estDbw;
	}

	public void setEstDbw(String estDbw) {
		this.estDbw = estDbw;
	}

	public String getUbw() {
		return this.ubw;
	}

	public void setUbw(String ubw) {
		this.ubw = ubw;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getRroom() {
		return this.rroom;
	}

	public void setRroom(String rroom) {
		this.rroom = rroom;
	}

	public String getDinningRoom() {
		return this.dinningRoom;
	}

	public void setDinningRoom(String dinningRoom) {
		this.dinningRoom = dinningRoom;
	}

	public String getLoungRoom() {
		return this.loungRoom;
	}

	public void setLoungRoom(String loungRoom) {
		this.loungRoom = loungRoom;
	}

	public String getFoodDislikes() {
		return this.foodDislikes;
	}

	public void setFoodDislikes(String foodDislikes) {
		this.foodDislikes = foodDislikes;
	}

	public String getFoodLikes() {
		return this.foodLikes;
	}

	public void setFoodLikes(String foodLikes) {
		this.foodLikes = foodLikes;
	}

	public String getFeeder() {
		return this.feeder;
	}

	public void setFeeder(String feeder) {
		this.feeder = feeder;
	}

	public String getNeedsHelp() {
		return this.needsHelp;
	}

	public void setNeedsHelp(String needsHelp) {
		this.needsHelp = needsHelp;
	}

	public String getResidentFeeds() {
		return this.residentFeeds;
	}

	public void setResidentFeeds(String residentFeeds) {
		this.residentFeeds = residentFeeds;
	}

	public String getSwallowing() {
		return this.swallowing;
	}

	public void setSwallowing(String swallowing) {
		this.swallowing = swallowing;
	}

	public String getChewingAbility() {
		return this.chewingAbility;
	}

	public void setChewingAbility(String chewingAbility) {
		this.chewingAbility = chewingAbility;
	}

	public String getDentureOwn() {
		return this.dentureOwn;
	}

	public void setDentureOwn(String dentureOwn) {
		this.dentureOwn = dentureOwn;
	}

	public String getDentureEd() {
		return this.dentureEd;
	}

	public void setDentureEd(String dentureEd) {
		this.dentureEd = dentureEd;
	}

	public String getDentureBottom() {
		return this.dentureBottom;
	}

	public void setDentureBottom(String dentureBottom) {
		this.dentureBottom = dentureBottom;
	}

	public String getDentureTop() {
		return this.dentureTop;
	}

	public void setDentureTop(String dentureTop) {
		this.dentureTop = dentureTop;
	}

	public String getFluid() {
		return this.fluid;
	}

	public void setFluid(String fluid) {
		this.fluid = fluid;
	}

	public String getMedication() {
		return this.medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRoomNo() {
		return this.roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getLabData() {
		return this.labData;
	}

	public void setLabData(String labData) {
		this.labData = labData;
	}

	public String getResidentName() {
		return this.residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getPhysicianName() {
		return this.physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public Date getDateField1() {
		return this.dateField1;
	}

	public void setDateField1(Date dateField1) {
		this.dateField1 = dateField1;
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

	public Notes getProblemApproches() {
		return problemApproches;
	}

	public void setProblemApproches(Notes problemApproches) {
		this.problemApproches = problemApproches;
	}

	public int getNormal() {
		return normal;
	}

	public String getAdaptiveEquipment() {
		return adaptiveEquipment;
	}

	public void setNormal(int normal) {
		this.normal = normal;
	}

	public void setAdaptiveEquipment(String adaptiveEquipment) {
		this.adaptiveEquipment = adaptiveEquipment;
	}

}
