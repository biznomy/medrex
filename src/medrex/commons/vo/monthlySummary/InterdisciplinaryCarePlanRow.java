package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InterdisciplinaryCarePlanRow")
public class InterdisciplinaryCarePlanRow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1673753582018616245L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	private int residentId;
	private int formId;
	private String outcomes;
	private String approaches;
	private String department;
	private String problem;
	private String goals;
	private Date dateAdded;
	private Date targetDate;
	private Date dateOfCarePlan;

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public Date getDateOfCarePlan() {
		return dateOfCarePlan;
	}

	public void setDateOfCarePlan(Date dateOfCarePlan) {
		this.dateOfCarePlan = dateOfCarePlan;
	}

	public String getOutcomes() {
		return this.outcomes;
	}

	public void setOutcomes(String outcomes) {
		this.outcomes = outcomes;
	}

	public String getApproaches() {
		return this.approaches;
	}

	public void setApproaches(String approaches) {
		this.approaches = approaches;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProblem() {
		return this.problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getGoals() {
		return this.goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getTargetDate() {
		return this.targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
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
