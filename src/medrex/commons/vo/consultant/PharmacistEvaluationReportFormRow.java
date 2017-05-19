package medrex.commons.vo.consultant;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PharmacistEvaluationReportFormRow")
public class PharmacistEvaluationReportFormRow implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1728046115646817302L;
	@Id
	@GeneratedValue
	@Column(name = "serial")
	private int serial;
	@Column(name = "pharmacistEvaluationReportFormSerial")
	private int pharmacistEvaluationReportFormSerial;
	@Column(name = "pharmacistEvaluationReportRowSerial")
	private int pharmacistEvaluationReportRowSerial;
	@Column(name = "dcDate")
	private Date dcDate;
	@Column(name = "comments")
	private String comments;
	@Column(name = "signature")
	private String signature;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getPharmacistEvaluationReportFormSerial() {
		return pharmacistEvaluationReportFormSerial;
	}

	public void setPharmacistEvaluationReportFormSerial(
			int pharmacistEvaluationReportFormSerial) {
		this.pharmacistEvaluationReportFormSerial = pharmacistEvaluationReportFormSerial;
	}

	public int getPharmacistEvaluationReportRowSerial() {
		return pharmacistEvaluationReportRowSerial;
	}

	public void setPharmacistEvaluationReportRowSerial(
			int pharmacistEvaluationReportRowSerial) {
		this.pharmacistEvaluationReportRowSerial = pharmacistEvaluationReportRowSerial;
	}

	public Date getDcDate() {
		return dcDate;
	}

	public void setDcDate(Date dcDate) {
		this.dcDate = dcDate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

}
