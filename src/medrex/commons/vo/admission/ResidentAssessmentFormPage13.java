package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage13")
public class ResidentAssessmentFormPage13 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4987733127313762894L;
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
	@Column(name = "residentId")
	private int residentId;
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "roomNo")
	private String roomNo;
	@Column(name = "physician")
	private String physician;
	@Column(name = "recordNum")
	private String recordNum;
	@Column(name = "dateFactor1")
	private Date dateFactor1;
	@Column(name = "answer1Q1")
	private String answer1Q1;
	@Column(name = "answer1Q2")
	private String answer1Q2;
	@Column(name = "answer1Q3")
	private String answer1Q3;
	@Column(name = "answer1Q4")
	private String answer1Q4;
	@Column(name = "answer1Q5")
	private String answer1Q5;
	@Column(name = "answer1Q6")
	private String answer1Q6;
	@Column(name = "answer1Q7")
	private String answer1Q7;
	@Column(name = "answer1Q8")
	private String answer1Q8;
	@Column(name = "answer1Q9")
	private String answer1Q9;
	@Column(name = "answer1Q10")
	private String answer1Q10;
	@Column(name = "determination1")
	private int determination1;
	@Column(name = "dateFactor2")
	private Date dateFactor2;
	@Column(name = "answer2Q1")
	private String answer2Q1;
	@Column(name = "answer2Q2")
	private String answer2Q2;
	@Column(name = "answer2Q3")
	private String answer2Q3;
	@Column(name = "answer2Q4")
	private String answer2Q4;
	@Column(name = "answer2Q5")
	private String answer2Q5;
	@Column(name = "answer2Q6")
	private String answer2Q6;
	@Column(name = "answer2Q7")
	private String answer2Q7;
	@Column(name = "answer2Q8")
	private String answer2Q8;
	@Column(name = "answer2Q9")
	private String answer2Q9;
	@Column(name = "answer2Q10")
	private String answer2Q10;
	@Column(name = "determination2")
	private int determination2;
	@Column(name = "dateFactor3")
	private Date dateFactor3;
	@Column(name = "answer3Q1")
	private String answer3Q1;
	@Column(name = "answer3Q2")
	private String answer3Q2;
	@Column(name = "answer3Q3")
	private String answer3Q3;
	@Column(name = "answer3Q4")
	private String answer3Q4;
	@Column(name = "answer3Q5")
	private String answer3Q5;
	@Column(name = "answer3Q6")
	private String answer3Q6;
	@Column(name = "answer3Q7")
	private String answer3Q7;
	@Column(name = "answer3Q8")
	private String answer3Q8;
	@Column(name = "answer3Q9")
	private String answer3Q9;
	@Column(name = "answer3Q10")
	private String answer3Q10;
	@Column(name = "determination3")
	private int determination3;
	@Column(name = "dateFactor4")
	private Date dateFactor4;
	@Column(name = "answer4Q1")
	private String answer4Q1;
	@Column(name = "answer4Q2")
	private String answer4Q2;
	@Column(name = "answer4Q3")
	private String answer4Q3;
	@Column(name = "answer4Q4")
	private String answer4Q4;
	@Column(name = "answer4Q5")
	private String answer4Q5;
	@Column(name = "answer4Q6")
	private String answer4Q6;
	@Column(name = "answer4Q7")
	private String answer4Q7;
	@Column(name = "answer4Q8")
	private String answer4Q8;
	@Column(name = "answer4Q9")
	private String answer4Q9;
	@Column(name = "answer4Q10")
	private String answer4Q10;
	@Column(name = "determination4")
	private int determination4;

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
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

	public String getPhysician() {
		return physician;
	}

	public void setPhysician(String physician) {
		this.physician = physician;
	}

	public String getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(String recordNum) {
		this.recordNum = recordNum;
	}

	public Date getDateFactor1() {
		return dateFactor1;
	}

	public void setDateFactor1(Date dateFactor1) {
		this.dateFactor1 = dateFactor1;
	}

	public String getAnswer1Q1() {
		return answer1Q1;
	}

	public void setAnswer1Q1(String answer1Q1) {
		this.answer1Q1 = answer1Q1;
	}

	public String getAnswer1Q2() {
		return answer1Q2;
	}

	public void setAnswer1Q2(String answer1Q2) {
		this.answer1Q2 = answer1Q2;
	}

	public String getAnswer1Q3() {
		return answer1Q3;
	}

	public void setAnswer1Q3(String answer1Q3) {
		this.answer1Q3 = answer1Q3;
	}

	public String getAnswer1Q4() {
		return answer1Q4;
	}

	public void setAnswer1Q4(String answer1Q4) {
		this.answer1Q4 = answer1Q4;
	}

	public String getAnswer1Q5() {
		return answer1Q5;
	}

	public void setAnswer1Q5(String answer1Q5) {
		this.answer1Q5 = answer1Q5;
	}

	public String getAnswer1Q6() {
		return answer1Q6;
	}

	public void setAnswer1Q6(String answer1Q6) {
		this.answer1Q6 = answer1Q6;
	}

	public String getAnswer1Q7() {
		return answer1Q7;
	}

	public void setAnswer1Q7(String answer1Q7) {
		this.answer1Q7 = answer1Q7;
	}

	public String getAnswer1Q8() {
		return answer1Q8;
	}

	public void setAnswer1Q8(String answer1Q8) {
		this.answer1Q8 = answer1Q8;
	}

	public String getAnswer1Q9() {
		return answer1Q9;
	}

	public void setAnswer1Q9(String answer1Q9) {
		this.answer1Q9 = answer1Q9;
	}

	public String getAnswer1Q10() {
		return answer1Q10;
	}

	public void setAnswer1Q10(String answer1Q10) {
		this.answer1Q10 = answer1Q10;
	}

	public int getDetermination1() {
		return determination1;
	}

	public void setDetermination1(int determination1) {
		this.determination1 = determination1;
	}

	public Date getDateFactor2() {
		return dateFactor2;
	}

	public void setDateFactor2(Date dateFactor2) {
		this.dateFactor2 = dateFactor2;
	}

	public String getAnswer2Q1() {
		return answer2Q1;
	}

	public void setAnswer2Q1(String answer2Q1) {
		this.answer2Q1 = answer2Q1;
	}

	public String getAnswer2Q2() {
		return answer2Q2;
	}

	public void setAnswer2Q2(String answer2Q2) {
		this.answer2Q2 = answer2Q2;
	}

	public String getAnswer2Q3() {
		return answer2Q3;
	}

	public void setAnswer2Q3(String answer2Q3) {
		this.answer2Q3 = answer2Q3;
	}

	public String getAnswer2Q4() {
		return answer2Q4;
	}

	public void setAnswer2Q4(String answer2Q4) {
		this.answer2Q4 = answer2Q4;
	}

	public String getAnswer2Q5() {
		return answer2Q5;
	}

	public void setAnswer2Q5(String answer2Q5) {
		this.answer2Q5 = answer2Q5;
	}

	public String getAnswer2Q6() {
		return answer2Q6;
	}

	public void setAnswer2Q6(String answer2Q6) {
		this.answer2Q6 = answer2Q6;
	}

	public String getAnswer2Q7() {
		return answer2Q7;
	}

	public void setAnswer2Q7(String answer2Q7) {
		this.answer2Q7 = answer2Q7;
	}

	public String getAnswer2Q8() {
		return answer2Q8;
	}

	public void setAnswer2Q8(String answer2Q8) {
		this.answer2Q8 = answer2Q8;
	}

	public String getAnswer2Q9() {
		return answer2Q9;
	}

	public void setAnswer2Q9(String answer2Q9) {
		this.answer2Q9 = answer2Q9;
	}

	public String getAnswer2Q10() {
		return answer2Q10;
	}

	public void setAnswer2Q10(String answer2Q10) {
		this.answer2Q10 = answer2Q10;
	}

	public int getDetermination2() {
		return determination2;
	}

	public void setDetermination2(int determination2) {
		this.determination2 = determination2;
	}

	public Date getDateFactor3() {
		return dateFactor3;
	}

	public void setDateFactor3(Date dateFactor3) {
		this.dateFactor3 = dateFactor3;
	}

	public String getAnswer3Q1() {
		return answer3Q1;
	}

	public void setAnswer3Q1(String answer3Q1) {
		this.answer3Q1 = answer3Q1;
	}

	public String getAnswer3Q2() {
		return answer3Q2;
	}

	public void setAnswer3Q2(String answer3Q2) {
		this.answer3Q2 = answer3Q2;
	}

	public String getAnswer3Q3() {
		return answer3Q3;
	}

	public void setAnswer3Q3(String answer3Q3) {
		this.answer3Q3 = answer3Q3;
	}

	public String getAnswer3Q4() {
		return answer3Q4;
	}

	public void setAnswer3Q4(String answer3Q4) {
		this.answer3Q4 = answer3Q4;
	}

	public String getAnswer3Q5() {
		return answer3Q5;
	}

	public void setAnswer3Q5(String answer3Q5) {
		this.answer3Q5 = answer3Q5;
	}

	public String getAnswer3Q6() {
		return answer3Q6;
	}

	public void setAnswer3Q6(String answer3Q6) {
		this.answer3Q6 = answer3Q6;
	}

	public String getAnswer3Q7() {
		return answer3Q7;
	}

	public void setAnswer3Q7(String answer3Q7) {
		this.answer3Q7 = answer3Q7;
	}

	public String getAnswer3Q8() {
		return answer3Q8;
	}

	public void setAnswer3Q8(String answer3Q8) {
		this.answer3Q8 = answer3Q8;
	}

	public String getAnswer3Q9() {
		return answer3Q9;
	}

	public void setAnswer3Q9(String answer3Q9) {
		this.answer3Q9 = answer3Q9;
	}

	public String getAnswer3Q10() {
		return answer3Q10;
	}

	public void setAnswer3Q10(String answer3Q10) {
		this.answer3Q10 = answer3Q10;
	}

	public int getDetermination3() {
		return determination3;
	}

	public void setDetermination3(int determination3) {
		this.determination3 = determination3;
	}

	public Date getDateFactor4() {
		return dateFactor4;
	}

	public void setDateFactor4(Date dateFactor4) {
		this.dateFactor4 = dateFactor4;
	}

	public String getAnswer4Q1() {
		return answer4Q1;
	}

	public void setAnswer4Q1(String answer4Q1) {
		this.answer4Q1 = answer4Q1;
	}

	public String getAnswer4Q2() {
		return answer4Q2;
	}

	public void setAnswer4Q2(String answer4Q2) {
		this.answer4Q2 = answer4Q2;
	}

	public String getAnswer4Q3() {
		return answer4Q3;
	}

	public void setAnswer4Q3(String answer4Q3) {
		this.answer4Q3 = answer4Q3;
	}

	public String getAnswer4Q4() {
		return answer4Q4;
	}

	public void setAnswer4Q4(String answer4Q4) {
		this.answer4Q4 = answer4Q4;
	}

	public String getAnswer4Q5() {
		return answer4Q5;
	}

	public void setAnswer4Q5(String answer4Q5) {
		this.answer4Q5 = answer4Q5;
	}

	public String getAnswer4Q6() {
		return answer4Q6;
	}

	public void setAnswer4Q6(String answer4Q6) {
		this.answer4Q6 = answer4Q6;
	}

	public String getAnswer4Q7() {
		return answer4Q7;
	}

	public void setAnswer4Q7(String answer4Q7) {
		this.answer4Q7 = answer4Q7;
	}

	public String getAnswer4Q8() {
		return answer4Q8;
	}

	public void setAnswer4Q8(String answer4Q8) {
		this.answer4Q8 = answer4Q8;
	}

	public String getAnswer4Q9() {
		return answer4Q9;
	}

	public void setAnswer4Q9(String answer4Q9) {
		this.answer4Q9 = answer4Q9;
	}

	public String getAnswer4Q10() {
		return answer4Q10;
	}

	public void setAnswer4Q10(String answer4Q10) {
		this.answer4Q10 = answer4Q10;
	}

	public int getDetermination4() {
		return determination4;
	}

	public void setDetermination4(int determination4) {
		this.determination4 = determination4;
	}

}
