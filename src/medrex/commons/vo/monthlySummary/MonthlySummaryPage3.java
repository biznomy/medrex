package medrex.commons.vo.monthlySummary;

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

@Entity
@Table(name = "MonthlySummaryPage3")
public class MonthlySummaryPage3 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4538584627340083221L;

	@Id
	@GeneratedValue
	@Column(name = "serial")
	int serial;

	@Column(name = "residentId")
	int residentId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "formId")
	private MonthlySummaryRecord formId;

	@Column(name = "signature")
	String signature;

	@Column(name = "vitalSigns")
	String vitalSigns;

	@Column(name = "areaComments")
	String areaComments;

	@Column(name = "date")
	Date date;

	@Column(name = "bed11")
	int bed11;

	@Column(name = "bed12")
	int bed12;

	@Column(name = "bed13")
	int bed13;

	@Column(name = "bed21")
	int bed21;

	@Column(name = "bed22")
	int bed22;

	@Column(name = "bed23")
	int bed23;

	@Column(name = "transfer11")
	int transfer11;

	@Column(name = "transfer12")
	int transfer12;

	@Column(name = "transfer13")
	int transfer13;

	@Column(name = "transfer21")
	int transfer21;

	@Column(name = "transfer22")
	int transfer22;

	@Column(name = "transfer23")
	int transfer23;

	@Column(name = "toileting11")
	int toileting11;

	@Column(name = "toileting12")
	int toileting12;

	@Column(name = "toileting13")
	int toileting13;

	@Column(name = "toileting14")
	int toileting14;

	@Column(name = "toileting15")
	int toileting15;

	@Column(name = "toileting21")
	int toileting21;

	@Column(name = "toileting22")
	int toileting22;

	@Column(name = "toileting23")
	int toileting23;

	@Column(name = "toileting24")
	int toileting24;

	@Column(name = "toileting25")
	int toileting25;

	@Column(name = "eating11")
	int eating11;

	@Column(name = "eating21")
	int eating21;

	@Column(name = "dressing11")
	int dressing11;

	@Column(name = "dressing12")
	int dressing12;

	@Column(name = "dressing21")
	int dressing21;

	@Column(name = "dressing22")
	int dressing22;

	@Column(name = "ambulation11")
	int ambulation11;

	@Column(name = "ambulation12")
	int ambulation12;

	@Column(name = "ambulation13")
	int ambulation13;

	@Column(name = "ambulation14")
	int ambulation14;

	@Column(name = "ambulation21")
	int ambulation21;

	@Column(name = "ambulation22")
	int ambulation22;

	@Column(name = "ambulation23")
	int ambulation23;

	@Column(name = "ambulation24")
	int ambulation24;

	@Column(name = "grooming11")
	int grooming11;

	@Column(name = "grooming12")
	int grooming12;

	@Column(name = "grooming13")
	int grooming13;

	@Column(name = "grooming14")
	int grooming14;

	@Column(name = "grooming15")
	int grooming15;

	@Column(name = "grooming16")
	int grooming16;

	@Column(name = "grooming17")
	int grooming17;

	@Column(name = "grooming21")
	int grooming21;

	@Column(name = "grooming22")
	int grooming22;

	@Column(name = "grooming23")
	int grooming23;

	@Column(name = "grooming24")
	int grooming24;

	@Column(name = "grooming25")
	int grooming25;

	@Column(name = "grooming26")
	int grooming26;

	@Column(name = "grooming27")
	int grooming27;

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

	public MonthlySummaryRecord getFormId() {
		return formId;
	}

	public void setFormId(MonthlySummaryRecord formId) {
		this.formId = formId;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getVitalSigns() {
		return vitalSigns;
	}

	public void setVitalSigns(String vitalSigns) {
		this.vitalSigns = vitalSigns;
	}

	public String getAreaComments() {
		return areaComments;
	}

	public void setAreaComments(String areaComments) {
		this.areaComments = areaComments;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getBed11() {
		return bed11;
	}

	public void setBed11(int bed11) {
		this.bed11 = bed11;
	}

	public int getBed12() {
		return bed12;
	}

	public void setBed12(int bed12) {
		this.bed12 = bed12;
	}

	public int getBed13() {
		return bed13;
	}

	public void setBed13(int bed13) {
		this.bed13 = bed13;
	}

	public int getBed21() {
		return bed21;
	}

	public void setBed21(int bed21) {
		this.bed21 = bed21;
	}

	public int getBed22() {
		return bed22;
	}

	public void setBed22(int bed22) {
		this.bed22 = bed22;
	}

	public int getBed23() {
		return bed23;
	}

	public void setBed23(int bed23) {
		this.bed23 = bed23;
	}

	public int getTransfer11() {
		return transfer11;
	}

	public void setTransfer11(int transfer11) {
		this.transfer11 = transfer11;
	}

	public int getTransfer12() {
		return transfer12;
	}

	public void setTransfer12(int transfer12) {
		this.transfer12 = transfer12;
	}

	public int getTransfer13() {
		return transfer13;
	}

	public void setTransfer13(int transfer13) {
		this.transfer13 = transfer13;
	}

	public int getTransfer21() {
		return transfer21;
	}

	public void setTransfer21(int transfer21) {
		this.transfer21 = transfer21;
	}

	public int getTransfer22() {
		return transfer22;
	}

	public void setTransfer22(int transfer22) {
		this.transfer22 = transfer22;
	}

	public int getTransfer23() {
		return transfer23;
	}

	public void setTransfer23(int transfer23) {
		this.transfer23 = transfer23;
	}

	public int getToileting11() {
		return toileting11;
	}

	public void setToileting11(int toileting11) {
		this.toileting11 = toileting11;
	}

	public int getToileting12() {
		return toileting12;
	}

	public void setToileting12(int toileting12) {
		this.toileting12 = toileting12;
	}

	public int getToileting13() {
		return toileting13;
	}

	public void setToileting13(int toileting13) {
		this.toileting13 = toileting13;
	}

	public int getToileting14() {
		return toileting14;
	}

	public void setToileting14(int toileting14) {
		this.toileting14 = toileting14;
	}

	public int getToileting15() {
		return toileting15;
	}

	public void setToileting15(int toileting15) {
		this.toileting15 = toileting15;
	}

	public int getToileting21() {
		return toileting21;
	}

	public void setToileting21(int toileting21) {
		this.toileting21 = toileting21;
	}

	public int getToileting22() {
		return toileting22;
	}

	public void setToileting22(int toileting22) {
		this.toileting22 = toileting22;
	}

	public int getToileting23() {
		return toileting23;
	}

	public void setToileting23(int toileting23) {
		this.toileting23 = toileting23;
	}

	public int getToileting24() {
		return toileting24;
	}

	public void setToileting24(int toileting24) {
		this.toileting24 = toileting24;
	}

	public int getToileting25() {
		return toileting25;
	}

	public void setToileting25(int toileting25) {
		this.toileting25 = toileting25;
	}

	public int getEating11() {
		return eating11;
	}

	public void setEating11(int eating11) {
		this.eating11 = eating11;
	}

	public int getEating21() {
		return eating21;
	}

	public void setEating21(int eating21) {
		this.eating21 = eating21;
	}

	public int getDressing11() {
		return dressing11;
	}

	public void setDressing11(int dressing11) {
		this.dressing11 = dressing11;
	}

	public int getDressing12() {
		return dressing12;
	}

	public void setDressing12(int dressing12) {
		this.dressing12 = dressing12;
	}

	public int getDressing21() {
		return dressing21;
	}

	public void setDressing21(int dressing21) {
		this.dressing21 = dressing21;
	}

	public int getDressing22() {
		return dressing22;
	}

	public void setDressing22(int dressing22) {
		this.dressing22 = dressing22;
	}

	public int getAmbulation11() {
		return ambulation11;
	}

	public void setAmbulation11(int ambulation11) {
		this.ambulation11 = ambulation11;
	}

	public int getAmbulation12() {
		return ambulation12;
	}

	public void setAmbulation12(int ambulation12) {
		this.ambulation12 = ambulation12;
	}

	public int getAmbulation13() {
		return ambulation13;
	}

	public void setAmbulation13(int ambulation13) {
		this.ambulation13 = ambulation13;
	}

	public int getAmbulation14() {
		return ambulation14;
	}

	public void setAmbulation14(int ambulation14) {
		this.ambulation14 = ambulation14;
	}

	public int getAmbulation21() {
		return ambulation21;
	}

	public void setAmbulation21(int ambulation21) {
		this.ambulation21 = ambulation21;
	}

	public int getAmbulation22() {
		return ambulation22;
	}

	public void setAmbulation22(int ambulation22) {
		this.ambulation22 = ambulation22;
	}

	public int getAmbulation23() {
		return ambulation23;
	}

	public void setAmbulation23(int ambulation23) {
		this.ambulation23 = ambulation23;
	}

	public int getAmbulation24() {
		return ambulation24;
	}

	public void setAmbulation24(int ambulation24) {
		this.ambulation24 = ambulation24;
	}

	public int getGrooming11() {
		return grooming11;
	}

	public void setGrooming11(int grooming11) {
		this.grooming11 = grooming11;
	}

	public int getGrooming12() {
		return grooming12;
	}

	public void setGrooming12(int grooming12) {
		this.grooming12 = grooming12;
	}

	public int getGrooming13() {
		return grooming13;
	}

	public void setGrooming13(int grooming13) {
		this.grooming13 = grooming13;
	}

	public int getGrooming14() {
		return grooming14;
	}

	public void setGrooming14(int grooming14) {
		this.grooming14 = grooming14;
	}

	public int getGrooming15() {
		return grooming15;
	}

	public void setGrooming15(int grooming15) {
		this.grooming15 = grooming15;
	}

	public int getGrooming16() {
		return grooming16;
	}

	public void setGrooming16(int grooming16) {
		this.grooming16 = grooming16;
	}

	public int getGrooming17() {
		return grooming17;
	}

	public void setGrooming17(int grooming17) {
		this.grooming17 = grooming17;
	}

	public int getGrooming21() {
		return grooming21;
	}

	public void setGrooming21(int grooming21) {
		this.grooming21 = grooming21;
	}

	public int getGrooming22() {
		return grooming22;
	}

	public void setGrooming22(int grooming22) {
		this.grooming22 = grooming22;
	}

	public int getGrooming23() {
		return grooming23;
	}

	public void setGrooming23(int grooming23) {
		this.grooming23 = grooming23;
	}

	public int getGrooming24() {
		return grooming24;
	}

	public void setGrooming24(int grooming24) {
		this.grooming24 = grooming24;
	}

	public int getGrooming25() {
		return grooming25;
	}

	public void setGrooming25(int grooming25) {
		this.grooming25 = grooming25;
	}

	public int getGrooming26() {
		return grooming26;
	}

	public void setGrooming26(int grooming26) {
		this.grooming26 = grooming26;
	}

	public int getGrooming27() {
		return grooming27;
	}

	public void setGrooming27(int grooming27) {
		this.grooming27 = grooming27;
	}

}
