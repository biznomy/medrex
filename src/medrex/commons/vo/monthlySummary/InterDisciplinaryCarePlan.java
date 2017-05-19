package medrex.commons.vo.monthlySummary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "InterDisciplinaryCarePlan")
public class InterDisciplinaryCarePlan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5131499456259591450L;

	public InterDisciplinaryCarePlan() {
		interDisciplinaryRow = new ArrayList<InterdisciplinaryCarePlanRow>();
	}

	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;

	@Column(name = "formId")
	private int formId;

	@Column(name = "residentId")
	private int residentId;

	@OneToMany(targetEntity = medrex.commons.vo.monthlySummary.InterdisciplinaryCarePlanRow.class, cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.EAGER)
	@Cascade( { CascadeType.DELETE_ORPHAN })
	@JoinColumn(name = "interDisciplinaryCarePlan", nullable = true)
	private List<InterdisciplinaryCarePlanRow> interDisciplinaryRow;

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

	public int getResidentId() {
		return residentId;
	}

	public void setResidentId(int residentId) {
		this.residentId = residentId;
	}

	public List<InterdisciplinaryCarePlanRow> getInterDisciplinaryRow() {
		return interDisciplinaryRow;
	}

	public void setInterDisciplinaryRow(
			List<InterdisciplinaryCarePlanRow> interDisciplinaryRow) {
		this.interDisciplinaryRow = interDisciplinaryRow;
	}

}
