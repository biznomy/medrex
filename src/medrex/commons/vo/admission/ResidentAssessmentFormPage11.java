package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage11")
public class ResidentAssessmentFormPage11 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 236421076526401590L;
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
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "dateAssessment")
	private Date dateAssessment;
	@Column(name = "exclusionUrinary")
	private boolean exclusionUrinary;
	@Column(name = "exclusionContamination")
	private boolean exclusionContamination;
	@Column(name = "exclusionTerminal")
	private boolean exclusionTerminal;
	@Column(name = "conditionApply")
	private boolean conditionApply;
	@Column(name = "conditionNotApply")
	private boolean conditionNotApply;
	@Column(name = "conditionNotApplyUTI")
	private boolean conditionNotApplyUTI;
	@Column(name = "conditionNotApplyNoUTI")
	private boolean conditionNotApplyNoUTI;
	@Column(name = "positiveUTI")
	private int positiveUTI;
	@Column(name = "conditionNotApplyUTIText")
	private boolean conditionNotApplyUTIText;
	@Column(name = "nurse1")
	private String nurse1;
	@Column(name = "nurse2")
	private String nurse2;
	@Column(name = "obstructive")
	private boolean obstructive;

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
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

	public Date getDateAssessment() {
		return dateAssessment;
	}

	public void setDateAssessment(Date dateAssessment) {
		this.dateAssessment = dateAssessment;
	}

	public boolean isExclusionUrinary() {
		return exclusionUrinary;
	}

	public void setExclusionUrinary(boolean exclusionUrinary) {
		this.exclusionUrinary = exclusionUrinary;
	}

	public boolean isExclusionContamination() {
		return exclusionContamination;
	}

	public void setExclusionContamination(boolean exclusionContamination) {
		this.exclusionContamination = exclusionContamination;
	}

	public boolean isExclusionTerminal() {
		return exclusionTerminal;
	}

	public void setExclusionTerminal(boolean exclusionTerminal) {
		this.exclusionTerminal = exclusionTerminal;
	}

	public boolean isConditionApply() {
		return conditionApply;
	}

	public void setConditionApply(boolean conditionApply) {
		this.conditionApply = conditionApply;
	}

	public boolean isConditionNotApply() {
		return conditionNotApply;
	}

	public void setConditionNotApply(boolean conditionNotApply) {
		this.conditionNotApply = conditionNotApply;
	}

	public boolean isConditionNotApplyUTI() {
		return conditionNotApplyUTI;
	}

	public void setConditionNotApplyUTI(boolean conditionNotApplyUTI) {
		this.conditionNotApplyUTI = conditionNotApplyUTI;
	}

	public boolean isConditionNotApplyNoUTI() {
		return conditionNotApplyNoUTI;
	}

	public void setConditionNotApplyNoUTI(boolean conditionNotApplyNoUTI) {
		this.conditionNotApplyNoUTI = conditionNotApplyNoUTI;
	}

	public int getPositiveUTI() {
		return positiveUTI;
	}

	public void setPositiveUTI(int positiveUTI) {
		this.positiveUTI = positiveUTI;
	}

	public boolean isConditionNotApplyUTIText() {
		return conditionNotApplyUTIText;
	}

	public void setConditionNotApplyUTIText(boolean conditionNotApplyUTIText) {
		this.conditionNotApplyUTIText = conditionNotApplyUTIText;
	}

	public String getNurse1() {
		return nurse1;
	}

	public void setNurse1(String nurse1) {
		this.nurse1 = nurse1;
	}

	public String getNurse2() {
		return nurse2;
	}

	public void setNurse2(String nurse2) {
		this.nurse2 = nurse2;
	}

	public boolean isObstructive() {
		return obstructive;
	}

	public void setObstructive(boolean obstructive) {
		this.obstructive = obstructive;
	}

}
