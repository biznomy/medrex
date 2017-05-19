package medrex.commons.vo.admission;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ResidentAssessmentFormPage17")
public class ResidentAssessmentFormPage17 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5574597822269157939L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "formId")
	private int formId;
	@Column(name = "residentName")
	private String residentName;
	@Column(name = "responsiblePartySignature")
	private String responsiblePartySignature;
	@Column(name = "responsiblePartySignature1")
	private String responsiblePartySignature1;
	@Column(name = "witnessSignature")
	private String witnessSignature;
	@Column(name = "witnessSignature1")
	private String witnessSignature1;
	@Column(name = "date")
	private Date date;
	@Column(name = "date1")
	private Date date1;

	@Column(name = "resonForRefusal")
	private String resonForRefusal;

	@Column(name = "influenzaResponsiblePartySignature")
	private String influenzaResponsiblePartySignature;
	@Column(name = "influenzaWitnessSignature")
	private String influenzaWitnessSignature;
	@Column(name = "influenzaDate")
	private Date influenzaDate;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getResponsiblePartySignature() {
		return responsiblePartySignature;
	}

	public void setResponsiblePartySignature(String responsiblePartySignature) {
		this.responsiblePartySignature = responsiblePartySignature;
	}

	public String getWitnessSignature() {
		return witnessSignature;
	}

	public void setWitnessSignature(String witnessSignature) {
		this.witnessSignature = witnessSignature;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getInfluenzaResponsiblePartySignature() {
		return influenzaResponsiblePartySignature;
	}

	public void setInfluenzaResponsiblePartySignature(
			String influenzaResponsiblePartySignature) {
		this.influenzaResponsiblePartySignature = influenzaResponsiblePartySignature;
	}

	public String getInfluenzaWitnessSignature() {
		return influenzaWitnessSignature;
	}

	public void setInfluenzaWitnessSignature(String influenzaWitnessSignature) {
		this.influenzaWitnessSignature = influenzaWitnessSignature;
	}

	public Date getInfluenzaDate() {
		return influenzaDate;
	}

	public void setInfluenzaDate(Date influenzaDate) {
		this.influenzaDate = influenzaDate;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getResonForRefusal() {
		return resonForRefusal;
	}

	public void setResonForRefusal(String resonForRefusal) {
		this.resonForRefusal = resonForRefusal;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getResponsiblePartySignature1() {
		return responsiblePartySignature1;
	}

	public void setResponsiblePartySignature1(String responsiblePartySignature1) {
		this.responsiblePartySignature1 = responsiblePartySignature1;
	}

	public String getWitnessSignature1() {
		return witnessSignature1;
	}

	public void setWitnessSignature1(String witnessSignature1) {
		this.witnessSignature1 = witnessSignature1;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

}
